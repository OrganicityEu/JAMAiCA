package eu.organicity.annotation.jamaica.www.dto;

import java.util.List;

public class AnomalyTrainDataDTO {
    private List<TrainDataDTO> data;

    public List<TrainDataDTO> getData() {
        return data;
    }

    public void setData(List<TrainDataDTO> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "AnomalyTrainDataDTO{" +
                "data=" + data +
                '}';
    }
}