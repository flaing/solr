/**
/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.solr.common.params;

/**
 * @since solr 1.3
 */
public interface CoreAdminParams 
{
  /** What Core are we talking about **/
  public final static String CORE = "core";

  /** Persistent -- should it save the cores state? **/
  public final static String PERSISTENT = "persistent";

  /** The name of the the core to swap names with **/
  public final static String WITH = "with";
  
  /** If you rename something, what is the new name **/
  public final static String NAME = "name";
  
  /** What action **/
  public final static String ACTION = "action";
  
  /** If you specify a schema, what is its name **/
  public final static String SCHEMA = "schema";
  
  /** If you specify a config, what is its name **/
  public final static String CONFIG = "config";
  
  /** Specifies a core instance dir. */
  public final static String INSTANCE_DIR = "instanceDir";
  
  public enum CoreAdminAction {
    STATUS,  
    LOAD,
    UNLOAD,
    RELOAD,
    CREATE,
    DROP,
    PERSIST,
    SWAP;
    
    public static CoreAdminAction get( String p )
    {
      if( p != null ) {
        try {
          return CoreAdminAction.valueOf( p.toUpperCase() );
        }
        catch( Exception ex ) {}
      }
      return null; 
    }
  }
}