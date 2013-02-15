/**
 * (C) Copyright 2010-2013 Kiahu
 *
 * Licensed under the terms of the GNU General Public License version 3
 * as published by the Free Software Foundation. You may obtain a copy of the
 * License at: http://www.gnu.org/copyleft/gpl.html
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.kiahu.sample.server;

import org.restlet.ext.wadl.WadlApplication;

public class BasicProjectServerApplication extends WadlApplication {

  public BasicProjectServerApplication() {
    setName("RESTful Basic Project Server application");
    setDescription("Kiahu CX Restlet Sample");
    setOwner("Kiahu");
    setAuthor("The Kiahu CX Team");
  }

}
