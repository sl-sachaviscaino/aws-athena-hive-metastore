/*-
 * #%L
 * hms-service-api
 * %%
 * Copyright (C) 2019 Amazon Web Services
 * %%
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
 * #L%
 */
package com.amazonaws.athena.hms;

import java.util.List;

public class ListPartitionsResponse extends ApiResponse
{
  private List<String> partitions;
  private String nextToken;

  public List<String> getPartitions()
  {
    return partitions;
  }

  public void setPartitions(List<String> partitions)
  {
    this.partitions = partitions;
  }

  public String getNextToken()
  {
    return nextToken;
  }

  public void setNextToken(String nextToken)
  {
    this.nextToken = nextToken;
  }
}