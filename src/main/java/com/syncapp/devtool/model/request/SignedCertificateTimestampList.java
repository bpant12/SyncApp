package com.syncapp.devtool.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * Created by bhupesh pant on 5/15/2018.
 */
public class SignedCertificateTimestampList {
    private String hashAlgorithm;
    private String logDescription;
    private String logID;
    private String origin;
    private String signatureAlgorithm;
    private String signatureData;
    private String status;
    private Long timestamp;

    @JsonProperty("hashAlgorithm")
    public String getHashAlgorithm() { return hashAlgorithm; }
    @JsonProperty("hashAlgorithm")
    public void setHashAlgorithm(String value) { this.hashAlgorithm = value; }

    @JsonProperty("logDescription")
    public String getLogDescription() { return logDescription; }
    @JsonProperty("logDescription")
    public void setLogDescription(String value) { this.logDescription = value; }

    @JsonProperty("logId")
    public String getLogID() { return logID; }
    @JsonProperty("logId")
    public void setLogID(String value) { this.logID = value; }

    @JsonProperty("origin")
    public String getOrigin() { return origin; }
    @JsonProperty("origin")
    public void setOrigin(String value) { this.origin = value; }

    @JsonProperty("signatureAlgorithm")
    public String getSignatureAlgorithm() { return signatureAlgorithm; }
    @JsonProperty("signatureAlgorithm")
    public void setSignatureAlgorithm(String value) { this.signatureAlgorithm = value; }

    @JsonProperty("signatureData")
    public String getSignatureData() { return signatureData; }
    @JsonProperty("signatureData")
    public void setSignatureData(String value) { this.signatureData = value; }

    @JsonProperty("status")
    public String getStatus() { return status; }
    @JsonProperty("status")
    public void setStatus(String value) { this.status = value; }

    @JsonProperty("timestamp")
    public Long getTimestamp() { return timestamp; }
    @JsonProperty("timestamp")
    public void setTimestamp(Long value) { this.timestamp = value; }
}
