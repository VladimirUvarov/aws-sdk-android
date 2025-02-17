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

package com.amazonaws.services.sns.model;

import java.io.Serializable;

/**
 * <p>
 * Gives a detailed description of failed messages in the batch.
 * </p>
 */
public class BatchResultErrorEntry implements Serializable {
    /**
     * <p>
     * The <code>Id</code> of an entry in a batch request
     * </p>
     */
    private String id;

    /**
     * <p>
     * An error code representing why the action failed on this entry.
     * </p>
     */
    private String code;

    /**
     * <p>
     * A message explaining why the action failed on this entry.
     * </p>
     */
    private String message;

    /**
     * <p>
     * Specifies whether the error happened due to the caller of the batch API
     * action.
     * </p>
     */
    private Boolean senderFault;

    /**
     * <p>
     * The <code>Id</code> of an entry in a batch request
     * </p>
     *
     * @return <p>
     *         The <code>Id</code> of an entry in a batch request
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The <code>Id</code> of an entry in a batch request
     * </p>
     *
     * @param id <p>
     *            The <code>Id</code> of an entry in a batch request
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The <code>Id</code> of an entry in a batch request
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The <code>Id</code> of an entry in a batch request
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchResultErrorEntry withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * An error code representing why the action failed on this entry.
     * </p>
     *
     * @return <p>
     *         An error code representing why the action failed on this entry.
     *         </p>
     */
    public String getCode() {
        return code;
    }

    /**
     * <p>
     * An error code representing why the action failed on this entry.
     * </p>
     *
     * @param code <p>
     *            An error code representing why the action failed on this
     *            entry.
     *            </p>
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * An error code representing why the action failed on this entry.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param code <p>
     *            An error code representing why the action failed on this
     *            entry.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchResultErrorEntry withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * <p>
     * A message explaining why the action failed on this entry.
     * </p>
     *
     * @return <p>
     *         A message explaining why the action failed on this entry.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * A message explaining why the action failed on this entry.
     * </p>
     *
     * @param message <p>
     *            A message explaining why the action failed on this entry.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A message explaining why the action failed on this entry.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message <p>
     *            A message explaining why the action failed on this entry.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchResultErrorEntry withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * <p>
     * Specifies whether the error happened due to the caller of the batch API
     * action.
     * </p>
     *
     * @return <p>
     *         Specifies whether the error happened due to the caller of the
     *         batch API action.
     *         </p>
     */
    public Boolean isSenderFault() {
        return senderFault;
    }

    /**
     * <p>
     * Specifies whether the error happened due to the caller of the batch API
     * action.
     * </p>
     *
     * @return <p>
     *         Specifies whether the error happened due to the caller of the
     *         batch API action.
     *         </p>
     */
    public Boolean getSenderFault() {
        return senderFault;
    }

    /**
     * <p>
     * Specifies whether the error happened due to the caller of the batch API
     * action.
     * </p>
     *
     * @param senderFault <p>
     *            Specifies whether the error happened due to the caller of the
     *            batch API action.
     *            </p>
     */
    public void setSenderFault(Boolean senderFault) {
        this.senderFault = senderFault;
    }

    /**
     * <p>
     * Specifies whether the error happened due to the caller of the batch API
     * action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param senderFault <p>
     *            Specifies whether the error happened due to the caller of the
     *            batch API action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchResultErrorEntry withSenderFault(Boolean senderFault) {
        this.senderFault = senderFault;
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getCode() != null)
            sb.append("Code: " + getCode() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage() + ",");
        if (getSenderFault() != null)
            sb.append("SenderFault: " + getSenderFault());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode
                + ((getSenderFault() == null) ? 0 : getSenderFault().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchResultErrorEntry == false)
            return false;
        BatchResultErrorEntry other = (BatchResultErrorEntry) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getSenderFault() == null ^ this.getSenderFault() == null)
            return false;
        if (other.getSenderFault() != null
                && other.getSenderFault().equals(this.getSenderFault()) == false)
            return false;
        return true;
    }
}
