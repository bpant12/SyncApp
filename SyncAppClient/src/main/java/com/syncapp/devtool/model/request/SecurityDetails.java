/*
 *    Copyright 2018 Bhupesh Pant
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *
 */

package com.syncapp.devtool.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * Created by bhupesh pant on 5/15/2018.
 */
public class SecurityDetails {
    private Long certificateID;
    private String cipher;
    private String issuer;
    private String keyExchange;
    private String keyExchangeGroup;
    private String protocol;
    private String[] sanList;
    private SignedCertificateTimestampList[] signedCertificateTimestampList;
    private String subjectName;
    private Long validFrom;
    private Long validTo;

    @JsonProperty("certificateId")
    public Long getCertificateID() { return certificateID; }
    @JsonProperty("certificateId")
    public void setCertificateID(Long value) { this.certificateID = value; }

    @JsonProperty("cipher")
    public String getCipher() { return cipher; }
    @JsonProperty("cipher")
    public void setCipher(String value) { this.cipher = value; }

    @JsonProperty("issuer")
    public String getIssuer() { return issuer; }
    @JsonProperty("issuer")
    public void setIssuer(String value) { this.issuer = value; }

    @JsonProperty("keyExchange")
    public String getKeyExchange() { return keyExchange; }
    @JsonProperty("keyExchange")
    public void setKeyExchange(String value) { this.keyExchange = value; }

    @JsonProperty("keyExchangeGroup")
    public String getKeyExchangeGroup() { return keyExchangeGroup; }
    @JsonProperty("keyExchangeGroup")
    public void setKeyExchangeGroup(String value) { this.keyExchangeGroup = value; }

    @JsonProperty("protocol")
    public String getProtocol() { return protocol; }
    @JsonProperty("protocol")
    public void setProtocol(String value) { this.protocol = value; }

    @JsonProperty("sanList")
    public String[] getSANList() { return sanList; }
    @JsonProperty("sanList")
    public void setSANList(String[] value) { this.sanList = value; }

    @JsonProperty("signedCertificateTimestampList")
    public SignedCertificateTimestampList[] getSignedCertificateTimestampList() { return signedCertificateTimestampList; }
    @JsonProperty("signedCertificateTimestampList")
    public void setSignedCertificateTimestampList(SignedCertificateTimestampList[] value) { this.signedCertificateTimestampList = value; }

    @JsonProperty("subjectName")
    public String getSubjectName() { return subjectName; }
    @JsonProperty("subjectName")
    public void setSubjectName(String value) { this.subjectName = value; }

    @JsonProperty("validFrom")
    public Long getValidFrom() { return validFrom; }
    @JsonProperty("validFrom")
    public void setValidFrom(Long value) { this.validFrom = value; }

    @JsonProperty("validTo")
    public Long getValidTo() { return validTo; }
    @JsonProperty("validTo")
    public void setValidTo(Long value) { this.validTo = value; }
}
