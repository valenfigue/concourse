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

import com.cinchapi.concourse.server.io.Byteable;
import com.cinchapi.concourse.server.storage.db.Block;

/**
 *
 *
 * @author jeff
 */
public class OptimizingBlockProvider<L extends Byteable & Comparable<L>>
        implements
        BlockProvider<L> {

    /*
     * The optimizer should periodically check if optimization is
     * necessary/possible and if so, it should write do its job. In terms of
     * concurrency controls, optimization should be able to happen while the
     * provider is still providing blocks. The only limitation is that the
     * provider cannot provide blocks that are currently being optimized...
     * 
     * The logic for determining if optimization is necessary should live in the
     * provider. The optimizer itself just follows a strategy for optimizing any
     * of the blocks that it is given
     */

    private Optimizer<L> optimizer; // TODO: make final
    
    public OptimizingBlockProvider(Optimizer<L> optimizer) {
        this.optimizer = optimizer;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.cinchapi.concourse.server.storage.db.block.BlockProvider#locate(com.
     * cinchapi.concourse.server.io.Byteable)
     */
    @Override
    public Collection<Block<L, ?, ?>> locate(L locator) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see com.cinchapi.concourse.server.storage.db.block.BlockProvider#add(com.cinchapi.concourse.server.storage.db.Block)
     */
    @Override
    public void add(Block<L, ?, ?> block) {
        // TODO Auto-generated method stub
        
    }

}
