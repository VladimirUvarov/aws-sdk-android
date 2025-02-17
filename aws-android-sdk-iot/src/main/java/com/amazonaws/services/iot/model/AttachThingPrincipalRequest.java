/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.iot.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Attaches the specified principal to the specified thing. A principal can be
 * X.509 certificates, IAM users, groups, and roles, Amazon Cognito identities
 * or federated identities.
 * </p>
 * <p>
 * Requires permission to access the <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >AttachThingPrincipal</a> action.
 * </p>
 */
public class AttachThingPrincipalRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the thing.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     */
    private String thingName;

    /**
     * <p>
     * The principal, which can be a certificate ARN (as returned from the
     * CreateCertificate operation) or an Amazon Cognito ID.
     * </p>
     */
    private String principal;

    /**
     * <p>
     * The name of the thing.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @return <p>
     *         The name of the thing.
     *         </p>
     */
    public String getThingName() {
        return thingName;
    }

    /**
     * <p>
     * The name of the thing.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param thingName <p>
     *            The name of the thing.
     *            </p>
     */
    public void setThingName(String thingName) {
        this.thingName = thingName;
    }

    /**
     * <p>
     * The name of the thing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9:_-]+<br/>
     *
     * @param thingName <p>
     *            The name of the thing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttachThingPrincipalRequest withThingName(String thingName) {
        this.thingName = thingName;
        return this;
    }

    /**
     * <p>
     * The principal, which can be a certificate ARN (as returned from the
     * CreateCertificate operation) or an Amazon Cognito ID.
     * </p>
     *
     * @return <p>
     *         The principal, which can be a certificate ARN (as returned from
     *         the CreateCertificate operation) or an Amazon Cognito ID.
     *         </p>
     */
    public String getPrincipal() {
        return principal;
    }

    /**
     * <p>
     * The principal, which can be a certificate ARN (as returned from the
     * CreateCertificate operation) or an Amazon Cognito ID.
     * </p>
     *
     * @param principal <p>
     *            The principal, which can be a certificate ARN (as returned
     *            from the CreateCertificate operation) or an Amazon Cognito ID.
     *            </p>
     */
    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    /**
     * <p>
     * The principal, which can be a certificate ARN (as returned from the
     * CreateCertificate operation) or an Amazon Cognito ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param principal <p>
     *            The principal, which can be a certificate ARN (as returned
     *            from the CreateCertificate operation) or an Amazon Cognito ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttachThingPrincipalRequest withPrincipal(String principal) {
        this.principal = principal;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getThingName() != null)
            sb.append("thingName: " + getThingName() + ",");
        if (getPrincipal() != null)
            sb.append("principal: " + getPrincipal());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThingName() == null) ? 0 : getThingName().hashCode());
        hashCode = prime * hashCode + ((getPrincipal() == null) ? 0 : getPrincipal().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttachThingPrincipalRequest == false)
            return false;
        AttachThingPrincipalRequest other = (AttachThingPrincipalRequest) obj;

        if (other.getThingName() == null ^ this.getThingName() == null)
            return false;
        if (other.getThingName() != null
                && other.getThingName().equals(this.getThingName()) == false)
            return false;
        if (other.getPrincipal() == null ^ this.getPrincipal() == null)
            return false;
        if (other.getPrincipal() != null
                && other.getPrincipal().equals(this.getPrincipal()) == false)
            return false;
        return true;
    }
}
