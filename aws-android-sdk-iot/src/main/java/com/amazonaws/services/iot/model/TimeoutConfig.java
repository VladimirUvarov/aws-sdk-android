/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Specifies the amount of time each device has to finish its execution of the
 * job. A timer is started when the job execution status is set to
 * <code>IN_PROGRESS</code>. If the job execution status is not set to another
 * terminal state before the timer expires, it will be automatically set to
 * <code>TIMED_OUT</code>.
 * </p>
 */
public class TimeoutConfig implements Serializable {
    /**
     * <p>
     * Specifies the amount of time, in minutes, this device has to finish
     * execution of this job. A timer is started, or restarted, whenever this
     * job's execution status is specified as <code>IN_PROGRESS</code> with this
     * field populated. If the job execution status is not set to a terminal
     * state before the timer expires, or before another job execution status
     * update is sent with this field populated, the status will be
     * automatically set to <code>TIMED_OUT</code>. Note that setting/resetting
     * this timer has no effect on the job execution timeout timer which may
     * have been specified when the job was created (
     * <code>CreateJobExecution</code> using the field
     * <code>timeoutConfig</code>).
     * </p>
     */
    private Long inProgressTimeoutInMinutes;

    /**
     * <p>
     * Specifies the amount of time, in minutes, this device has to finish
     * execution of this job. A timer is started, or restarted, whenever this
     * job's execution status is specified as <code>IN_PROGRESS</code> with this
     * field populated. If the job execution status is not set to a terminal
     * state before the timer expires, or before another job execution status
     * update is sent with this field populated, the status will be
     * automatically set to <code>TIMED_OUT</code>. Note that setting/resetting
     * this timer has no effect on the job execution timeout timer which may
     * have been specified when the job was created (
     * <code>CreateJobExecution</code> using the field
     * <code>timeoutConfig</code>).
     * </p>
     *
     * @return <p>
     *         Specifies the amount of time, in minutes, this device has to
     *         finish execution of this job. A timer is started, or restarted,
     *         whenever this job's execution status is specified as
     *         <code>IN_PROGRESS</code> with this field populated. If the job
     *         execution status is not set to a terminal state before the timer
     *         expires, or before another job execution status update is sent
     *         with this field populated, the status will be automatically set
     *         to <code>TIMED_OUT</code>. Note that setting/resetting this timer
     *         has no effect on the job execution timeout timer which may have
     *         been specified when the job was created (
     *         <code>CreateJobExecution</code> using the field
     *         <code>timeoutConfig</code>).
     *         </p>
     */
    public Long getInProgressTimeoutInMinutes() {
        return inProgressTimeoutInMinutes;
    }

    /**
     * <p>
     * Specifies the amount of time, in minutes, this device has to finish
     * execution of this job. A timer is started, or restarted, whenever this
     * job's execution status is specified as <code>IN_PROGRESS</code> with this
     * field populated. If the job execution status is not set to a terminal
     * state before the timer expires, or before another job execution status
     * update is sent with this field populated, the status will be
     * automatically set to <code>TIMED_OUT</code>. Note that setting/resetting
     * this timer has no effect on the job execution timeout timer which may
     * have been specified when the job was created (
     * <code>CreateJobExecution</code> using the field
     * <code>timeoutConfig</code>).
     * </p>
     *
     * @param inProgressTimeoutInMinutes <p>
     *            Specifies the amount of time, in minutes, this device has to
     *            finish execution of this job. A timer is started, or
     *            restarted, whenever this job's execution status is specified
     *            as <code>IN_PROGRESS</code> with this field populated. If the
     *            job execution status is not set to a terminal state before the
     *            timer expires, or before another job execution status update
     *            is sent with this field populated, the status will be
     *            automatically set to <code>TIMED_OUT</code>. Note that
     *            setting/resetting this timer has no effect on the job
     *            execution timeout timer which may have been specified when the
     *            job was created (<code>CreateJobExecution</code> using the
     *            field <code>timeoutConfig</code>).
     *            </p>
     */
    public void setInProgressTimeoutInMinutes(Long inProgressTimeoutInMinutes) {
        this.inProgressTimeoutInMinutes = inProgressTimeoutInMinutes;
    }

    /**
     * <p>
     * Specifies the amount of time, in minutes, this device has to finish
     * execution of this job. A timer is started, or restarted, whenever this
     * job's execution status is specified as <code>IN_PROGRESS</code> with this
     * field populated. If the job execution status is not set to a terminal
     * state before the timer expires, or before another job execution status
     * update is sent with this field populated, the status will be
     * automatically set to <code>TIMED_OUT</code>. Note that setting/resetting
     * this timer has no effect on the job execution timeout timer which may
     * have been specified when the job was created (
     * <code>CreateJobExecution</code> using the field
     * <code>timeoutConfig</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inProgressTimeoutInMinutes <p>
     *            Specifies the amount of time, in minutes, this device has to
     *            finish execution of this job. A timer is started, or
     *            restarted, whenever this job's execution status is specified
     *            as <code>IN_PROGRESS</code> with this field populated. If the
     *            job execution status is not set to a terminal state before the
     *            timer expires, or before another job execution status update
     *            is sent with this field populated, the status will be
     *            automatically set to <code>TIMED_OUT</code>. Note that
     *            setting/resetting this timer has no effect on the job
     *            execution timeout timer which may have been specified when the
     *            job was created (<code>CreateJobExecution</code> using the
     *            field <code>timeoutConfig</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TimeoutConfig withInProgressTimeoutInMinutes(Long inProgressTimeoutInMinutes) {
        this.inProgressTimeoutInMinutes = inProgressTimeoutInMinutes;
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
        if (getInProgressTimeoutInMinutes() != null)
            sb.append("inProgressTimeoutInMinutes: " + getInProgressTimeoutInMinutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getInProgressTimeoutInMinutes() == null) ? 0 : getInProgressTimeoutInMinutes()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimeoutConfig == false)
            return false;
        TimeoutConfig other = (TimeoutConfig) obj;

        if (other.getInProgressTimeoutInMinutes() == null
                ^ this.getInProgressTimeoutInMinutes() == null)
            return false;
        if (other.getInProgressTimeoutInMinutes() != null
                && other.getInProgressTimeoutInMinutes().equals(
                        this.getInProgressTimeoutInMinutes()) == false)
            return false;
        return true;
    }
}
