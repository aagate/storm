/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.storm.streams.operations;

import org.apache.storm.streams.Pair;

/**
 * A function that accepts one argument and returns an {@link Iterable} of {@link Pair} as its result.
 *
 * @param <T> the type of the input to the function
 * @param <K> the key type of the key-value pairs produced as a result
 * @param <V> the value type of the key-value pairs produced as a result
 */
public interface PairFlatMapFunction<T, K, V> extends FlatMapFunction<T, Pair<K, V>> {
}
