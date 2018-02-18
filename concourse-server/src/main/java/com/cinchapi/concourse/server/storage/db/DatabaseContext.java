/*
 * Copyright (c) 2013-2018 Cinchapi Inc.
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

/**
 * Contains summary information about the {@link Database}.
 *
 * @author Jeff Nelson
 */
public class DatabaseContext {
    /*
     * TODO: implement me
     * Database should contain a mapping from Block -> BlockStats which is
     * passed to this class. This class can make that collection available (in
     * unmodifiable form) via a method
     * 
     * ALSO, note, the Database should check the in scope Optimizer after each
     * Block creation event to see if optimization is necessary.
     */

}
