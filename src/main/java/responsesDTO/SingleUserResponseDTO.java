package responsesDTO;

import subDTO.Data;
import subDTO.Support;

public class SingleUserResponseDTO {
    private Data data;
    private Support support;

    public SingleUserResponseDTO(Data data, Support support) {
        this.data = data;
        this.support = support;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Support getSupport() {
        return support;
    }

    public void setSupport(Support support) {
        this.support = support;
    }
}
