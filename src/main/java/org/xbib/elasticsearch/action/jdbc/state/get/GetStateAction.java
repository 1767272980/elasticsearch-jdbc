/*
 * Copyright (C) 2014 Jörg Prante
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.xbib.elasticsearch.action.jdbc.state.get;

import org.elasticsearch.action.admin.cluster.ClusterAction;
import org.elasticsearch.client.ClusterAdminClient;

public class GetStateAction extends ClusterAction<GetStateRequest, GetStateResponse, GetStateRequestBuilder> {

    public static final GetStateAction INSTANCE = new GetStateAction();

    public static final String NAME = "org.xbib.elasticsearch.action.jdbc.state.get";

    private GetStateAction() {
        super(NAME);
    }

    @Override
    public GetStateRequestBuilder newRequestBuilder(ClusterAdminClient client) {
        return new GetStateRequestBuilder(client);
    }

    @Override
    public GetStateResponse newResponse() {
        return new GetStateResponse();
    }
}