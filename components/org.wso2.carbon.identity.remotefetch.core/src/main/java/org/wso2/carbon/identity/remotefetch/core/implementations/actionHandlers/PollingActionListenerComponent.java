/*
 * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.remotefetch.core.implementations.actionHandlers;

import org.wso2.carbon.identity.remotefetch.common.ui.UIField;
import org.wso2.carbon.identity.remotefetch.common.actionlistener.ActionListenerBuilder;
import org.wso2.carbon.identity.remotefetch.common.actionlistener.ActionListenerComponent;

import java.util.ArrayList;
import java.util.List;

public class PollingActionListenerComponent implements ActionListenerComponent {

    @Override
    public ActionListenerBuilder getActionListenerBuilder() {

        return new PollingActionListenerBuilder();
    }

    @Override
    public String getIdentifier() {

        return "POLLING";
    }

    @Override
    public String getName() {

        return "Frequent Polling";
    }

    @Override
    public List<UIField> getUIFields() {

        ArrayList<UIField> fieldList = new ArrayList();

        fieldList.add(new UIField(
                "frequency", UIField.FIELD_TYPES.TEXT_BOX, "Frequency",
                "Number of minutes polling should occur", "^\\d+$", "60",
                true, false, false

        ));

        return fieldList;
    }
}
