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

import java.nio.file.Path;
import java.util.Collection;
import java.util.List;

import com.cinchapi.concourse.server.io.Byteable;
import com.cinchapi.concourse.server.storage.db.Block;
import com.google.common.collect.Lists;

/**
 * Base implementation for the {@link BlockProvider} interface.
 *
 * @author Jeff Nelson
 */
public abstract class AbstractBlockProvider<L extends Byteable & Comparable<L>>
        implements BlockProvider<L> {

    /**
     * The
     */
    private final List<Block<L, ?, ?>> blocks = Lists.newArrayList();

    /**
     * The directory that contains the .blk files that are provided by this
     * {@link BlockProvider}.
     */
    protected final Path directory;

    /**
     * Construct a new instance.
     * 
     * @param directory
     */
    protected AbstractBlockProvider(Path directory) {
        this.directory = directory;
    }

    @Override
    public Collection<Block<L, ?, ?>> locate(L locator) {
        // TODO Auto-generated method stub
        return null;
    }

}
