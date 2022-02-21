class Memory extends Hardware {
    private String frequency;
    private String memorySize;
    private String supportCuda;

    Memory() {
        this.frequency = "";
        this.memorySize = "";
        this.supportCuda = "";
    }

    void setFrecuency(String frecuency) {
        this.frequency = frecuency;
    }

    String getFrecuency() {
        return this.frequency;
    }

    void setMemorySize(String memorySize) {
        this.memorySize = memorySize;
    }

    String getMemorySize() {
        return this.memorySize;
    }

    void setSupportCuda(String supportCuda) {
        this.supportCuda = supportCuda;
    }

    String getSupportCuda() {
        return this.supportCuda;
    }

}