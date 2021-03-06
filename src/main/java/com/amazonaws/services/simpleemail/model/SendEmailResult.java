/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleemail.model;

/**
 * <p>
 * Represents a unique message ID returned from a successful
 * <code>SendEmail</code> request.
 * </p>
 */
public class SendEmailResult {

    /**
     * The unique message identifier returned from the <code>SendEmail</code>
     * action.
     */
    private String messageId;

    /**
     * The unique message identifier returned from the <code>SendEmail</code>
     * action.
     *
     * @return The unique message identifier returned from the <code>SendEmail</code>
     *         action.
     */
    public String getMessageId() {
        return messageId;
    }
    
    /**
     * The unique message identifier returned from the <code>SendEmail</code>
     * action.
     *
     * @param messageId The unique message identifier returned from the <code>SendEmail</code>
     *         action.
     */
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }
    
    /**
     * The unique message identifier returned from the <code>SendEmail</code>
     * action.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param messageId The unique message identifier returned from the <code>SendEmail</code>
     *         action.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public SendEmailResult withMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("MessageId: " + messageId + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    