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
package eu.coldrye.app.backend.model.base.internal.filter;

import eu.coldrye.app.backend.model.base.AbstractEntity;
import eu.coldrye.app.backend.model.base.EntityFilter;
import eu.coldrye.app.backend.model.base.Filter;
import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author Carsten Klein <trancesilken@gmail.com>
 */
public class AndFilterImpl<ID extends Serializable, T extends AbstractEntity>
        extends AbstractEntityFilterImpl<ID, T>
{

    public AndFilterImpl(final EntityFilter<ID, T> parent,
                         final Filter... children)
    {
        super(parent, children);
    }

    @Override
    public EntityFilter<ID, T> and(final Filter... filters)
    {
        this.children.addAll(Arrays.asList(filters));
        return this;
    }
}
