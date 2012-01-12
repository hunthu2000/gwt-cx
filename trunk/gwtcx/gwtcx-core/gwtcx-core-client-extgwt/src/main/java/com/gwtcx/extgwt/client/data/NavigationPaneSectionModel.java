/**
 * (C) Copyright 2010, 2011 upTick Pty Ltd
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

package com.gwtcx.extgwt.client.data;

import com.sencha.gxt.data.shared.ModelKeyProvider;

public class NavigationPaneSectionModel {

  /*

  public static final String ICON = "icon";
  public static final String ICON_DISPLAY_NAME = "Icon";
  public static final String NAME = "name";
  public static final String NAME_DISPLAY_NAME = "Name";
  public static final String DISPLAY_NAME = "displayName";
  public static final String DISPLAY_NAME_DISPLAY_NAME = "Display Name";

  */

  public static ModelKeyProvider<NavigationPaneSectionModel> KP = new ModelKeyProvider<NavigationPaneSectionModel>() {
    @Override
    public String getKey(NavigationPaneSectionModel item) {
      return item.getName();
    }
  };

  private String icon;
  private String name;
  private String displayName;

  public NavigationPaneSectionModel(String icon, String name, String displayName) {
    this.icon = icon;
    this.name = name;
    this.displayName = displayName;
  }

  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }
}