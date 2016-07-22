/*
 * Copyright 2016 coldrye.
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
package eu.coldrye.app.backend.model.security.acl.spi;

import eu.coldrye.app.backend.model.common.EntityDAO;
import eu.coldrye.app.backend.model.security.acl.entities.Permission;

/**
 *
 * @author Carsten Klein <trancesilken@gmail.com>
 * @since 0.0.1
 */
public interface PermissionDAO
        extends EntityDAO<String, Permission>
{
}
