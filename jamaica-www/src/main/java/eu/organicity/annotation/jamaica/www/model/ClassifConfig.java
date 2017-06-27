package eu.organicity.annotation.jamaica.www.model;


/**
 * Created by katdel on 03-Jun-16.
 */


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ClassifConfig {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String typePat;
    private String idPat;
    private String attribute;
    private String tags;
    private String urlExt;
    private String urlOrion;
    private String contextBrokerUrl;
    private String contextBrokerService;
    private String contextBrokerServicePath;
    private String subscriptionId;
    private String user;
    private long lastSubscription;
    private boolean enable;
    
    
    protected ClassifConfig() {
    }
    
    public ClassifConfig(String typePat, String idPat, String attribute, String tags, String urlExt, String urlOrion, String subscriptionId, long lastSubscription, boolean enable) {
        this.typePat = typePat;
        this.idPat = idPat;
        this.attribute = attribute;
        this.tags = tags;
        this.urlExt = urlExt;
        this.urlOrion = urlOrion;
        this.subscriptionId = subscriptionId;
        this.lastSubscription = lastSubscription;
        this.enable = enable;
        this.contextBrokerUrl = contextBrokerUrl;
        this.contextBrokerService = contextBrokerService;
        this.contextBrokerServicePath = contextBrokerServicePath;
        
    }
    
    @Override
    public String toString() {
        return String.format("ClassifConfig[id=%d, typePat='%s', idPat='%s', attribute='%s', tags='%s', urlExt='%s', urlOrion='%s', subscriptionId='%s']", id, typePat, idPat, attribute, tags, urlExt, urlOrion, subscriptionId);
    }
    
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public String getTypePat() {
        return typePat;
    }
    
    public void setTypePat(String typePat) {
        this.typePat = typePat;
    }
    
    public String getIdPat() {
        return idPat;
    }
    
    public void setIdPat(String idPat) {
        this.idPat = idPat;
    }
    
    public String getAttribute() {
        return attribute;
    }
    
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
    
    public String getTags() {
        return tags;
    }
    
    public void setTags(String tags) {
        this.tags = tags;
    }
    
    public String getUrlExt() {
        return urlExt;
    }
    
    public void setUrlExt(String urlExt) {
        this.urlExt = urlExt;
    }
    
    public String getUrlOrion() {
        return urlOrion;
    }
    
    public void setUrlOrion(String urlOrion) {
        this.urlOrion = urlOrion;
    }
    
    public String getContextBrokerUrl() {
        return contextBrokerUrl;
    }
    
    public void setContextBrokerUrl(String contextBrokerUrl) {
        this.contextBrokerUrl = contextBrokerUrl;
    }
    
    public String getContextBrokerService() {
        return contextBrokerService;
    }
    
    public void setContextBrokerService(String contextBrokerService) {
        this.contextBrokerService = contextBrokerService;
    }
    
    public String getContextBrokerServicePath() {
        return contextBrokerServicePath;
    }
    
    public void setContextBrokerServicePath(String contextBrokerServicePath) {
        this.contextBrokerServicePath = contextBrokerServicePath;
    }
    
    public String getSubscriptionId() {
        return subscriptionId;
    }
    
    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }
    
    public long getLastSubscription() {
        return lastSubscription;
    }
    
    public void setLastSubscription(long lastSubscription) {
        this.lastSubscription = lastSubscription;
    }
    
    public boolean isEnable() {
        return enable;
    }
    
    public void setEnable(boolean enable) {
        this.enable = enable;
    }
    
    public String getUser() {
        return user;
    }
    
    public void setUser(String user) {
        this.user = user;
    }
}
