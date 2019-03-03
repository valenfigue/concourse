/*
 * Copyright (c) 2013-2019 Cinchapi Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.cinchapi.concourse.util;

import java.util.Iterator;

/**
 * An {@link Iterator} that does not support the {@link #remove()} operation.
 * 
 * @author Jeff Nelson
 */
public abstract class ReadOnlyIterator<T> implements Iterator<T> {

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }

}
