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
 * information: "Portions copyright [year] [name of copyright owner]".
 *
 * Copyright 2014-2015 ForgeRock AS.
 */

package org.forgerock.oauth2.core;

import org.forgerock.oauth2.core.exceptions.NotFoundException;
import org.forgerock.services.context.Context;

/**
 * A factory for creating/retrieving OAuth2ProviderSettings instances.
 * <br/>
 * It is up to the implementation to provide caching of OAuth2ProviderSettings instance if it wants to supported
 * multiple OAuth2 providers.
 *
 * @since 12.0.0
 */
public interface OAuth2ProviderSettingsFactory {

    /**
     * Gets a OAuth2ProviderSettings instance.
     *
     * @param request The OAuth2 request.
     * @return A OAuth2ProviderSettings instance.
     */
    OAuth2ProviderSettings get(final OAuth2Request request) throws NotFoundException;

    /**
     * Gets the instance of the OAuth2ProviderSettings.
     *
     * @param context The context that can be used to obtain the base deployment url.
     * @return The OAuth2ProviderSettings instance.
     */
    OAuth2ProviderSettings get(Context context) throws NotFoundException;

    /**
     * Gets the instance of the OAuth2ProviderSettings.
     *
     * @param realm The realm.
     * @return The OAuth2ProviderSettings instance.
     */
    OAuth2ProviderSettings get(String realm) throws NotFoundException;
}
