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
package com.cinchapi.concourse.server.storage.db.block;

import java.util.Collection;

import javax.annotation.concurrent.ThreadSafe;

import com.cinchapi.concourse.server.io.Byteable;
import com.cinchapi.concourse.server.storage.db.Block;

/**
 * A {@link BlockProvider} maintains a collection of {@link Block Blocks} and
 * can easily locate all the Blocks that potentially contain a locator.
 * <p>
 * The {@link BlockProvider} interface does NOT assume that the maintained
 * blocks are a sorted run (e.g. contiguous and non-overlapping with respect
 * to a locator range), but the {@link BlockProvider} may periodically run
 * internal optimizations to improve the performance of locating candidate
 * Blocks for a given locator.
 * </p>
 *
 * @author Jeff Nelson
 */
@ThreadSafe
public interface BlockProvider<L extends Byteable & Comparable<L>> {

    /**
     * Locate and return all the {@link Block blocks} that may possibly contain
     * data for the provided {@code locator}.
     * 
     * @param locator the "key" to locate
     * @return a collection of {@link Block blocks} that possibly contain the
     *         {@code locator}
     */
    public Collection<Block<L, ?, ?>> locate(L locator);

    public void add(Block<L, ?, ?> block); // TODO: the block that is added will
                                           // not have been synched yet...

}
