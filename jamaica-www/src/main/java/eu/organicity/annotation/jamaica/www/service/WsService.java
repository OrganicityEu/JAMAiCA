package eu.organicity.annotation.jamaica.www.service;


import eu.organicity.annotation.jamaica.www.repository.AnomalyConfigRepository;
import eu.organicity.annotation.jamaica.www.repository.AnomalyRepository;
import eu.organicity.annotation.jamaica.www.repository.ClassifConfigRepository;
import eu.organicity.annotation.jamaica.www.utils.WsMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class WsService {
    /**
     * a log4j logger to print messages.
     */
    protected static final Logger LOGGER = LoggerFactory.getLogger(WsService.class);
    
    @Autowired
    AnomalyRepository anomalyRepository;
    @Autowired
    ClassifConfigRepository classifConfigRepository;
    @Autowired
    AnomalyConfigRepository anomalyConfigRepository;
    
    @Autowired
    private SimpMessagingTemplate messagingTemplate;
    
    @Async
    public void notifyClassification(String entityId, String attribute, String value, long classificationConfigId, String tag, double score) {
        greeting(entityId, attribute, value, classificationConfigId, tag, score);
    }
    
    public void greeting(String entityId, String attribute, String value, long classificationConfigId, String tag, double score) {
        String user = classifConfigRepository.findById(classificationConfigId).getUser();
        if (user != null) {
            WsMessage dto = new WsMessage();
            dto.setAssetUrn(entityId);
            dto.setTagUrn(tag);
            dto.setClassificationConfig(classificationConfigId);
            //messagingTemplate.convertAndSendToUser(user, "/topic/classification", dto);
            messagingTemplate.convertAndSend("/topic/classification", dto);
            LOGGER.info("Send to ws :" + user + " dto:" + dto);
        }
        
    }
}
