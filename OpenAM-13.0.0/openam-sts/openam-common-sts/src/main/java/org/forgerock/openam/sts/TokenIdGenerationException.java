/*
 * The contents of this file are subject to the terms of the Common Development and
 * Distribution License (the License). You may not use this file except in compliance with the
 * License.
 *
 * You can obtain a copy of the License at legal/CDDLv1.0.txt. See the License for the
 * specific language governing permission and limitations under the License.
 *
 * When distributing Covered Software, include this CDDL Header Notice in each file and include
 * the License file at legal/CDDLv1.0.txt. If applicable, add the following below the CDDL
 * Header, with the fields enclosed by brackets [] replaced by your own identifying
 * information: "Portions Copyrighted [year] [name of copyright owner]".
 *
 * Copyright 2015 ForgeRock AS.
 */

package org.forgerock.openam.sts;

import org.forgerock.json.resource.ResourceException;

/**
 * Exception class for errors related to generating the CTS identifier for STS-generated tokens. Thrown by the
 * CTSTokenIdGenerator.
 */
public class TokenIdGenerationException extends ResourceException {
    /**
     * {@inheritDoc}
     */
    public TokenIdGenerationException(int code, String message) {
        super(code, message);
    }

    /**
     * {@inheritDoc}
     */
    public TokenIdGenerationException(int code, String message, Throwable cause) {
        super(code, message, cause);
    }
}
