// Copyright (C) 2011-2012 the original author or authors.
// See the LICENCE.txt file distributed with this work for additional
// information regarding copyright ownership.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
// http://www.apache.org/licenses/LICENSE-2.0
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

// Copyright (C) 2011-2012 the original author or authors.
// See the LICENCE.txt file distributed with this work for additional
// information regarding copyright ownership.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at

// http://www.apache.org/licenses/LICENSE-2.0

// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class QuickSortTesting extends AnyFlatSpec {
  val sort = new QuickSort

  "test" should "be positive when list has only one element" in {
    val testList = List(14)
    val sortedList = List(14)
    assert(sortedList == sort.quickSort(testList))
  }

  "test" should "be positive when all elements are equal" in {
    val testList = List(1, 1, 1, 1)
    val sortedList = List(1, 1, 1, 1)
    assert(sortedList == sort.quickSort(testList))
  }

  "test" should "be positive list have unequal value of elements" in {
    val testList = List(8, 1, -2, 4, -6)
    val sortedList = List(-6, -2, 1, 4, 8)
    assert(sortedList == sort.quickSort(testList))
  }

  "test" should "be positive List is empty" in {
    val testList = List()
    val sortedLit = List()
    assert(sortedLit == testList)
  }
}