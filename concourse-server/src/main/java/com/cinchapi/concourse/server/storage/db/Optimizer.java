/*
 * Copyright (c) 2013-2017 Cinchapi Inc.
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
package com.cinchapi.concourse.server.storage.db;

import java.util.Collection;

import com.cinchapi.concourse.server.io.Byteable;

/**
 * An {@link Optimizer} uses a strategy to optimize blocks by merging or
 * splitting them.
 *
 * @author Jeff Nelson
 */
public interface Optimizer {

    /**
     * Given one or more {@link Block blocks}, execute a strategy to optimize
     * the storage (i.e merge the blocks or split them into more blocks). The
     * optimized {@link Block blocks} are returned within a collection.
     * <p>
     * <strong>NOTE:</strong> The caller is responsible for replacing the input
     * {@link Block blocks} with the optimized ones in whatever capacities are
     * necessary.
     * </p>
     * 
     * @param blocks one or more {@link Block blocks} to optimize.
     * @return the optimized {@link Block blocks}
     */
    @SuppressWarnings("unchecked")
    public <L extends Byteable & Comparable<L>, K extends Byteable & Comparable<K>, V extends Byteable & Comparable<V>> Collection<Block<L, K, V>> optimize(
            Block<L, K, V>... blocks);

}
