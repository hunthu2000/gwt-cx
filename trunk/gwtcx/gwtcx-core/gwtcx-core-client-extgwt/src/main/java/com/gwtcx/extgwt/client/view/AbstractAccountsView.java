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

package com.gwtcx.extgwt.client.view;

import java.util.List;

import com.google.inject.Inject;
import com.gwtcx.client.resources.ToolBarIcons;
import com.gwtcx.client.uihandlers.AccountsUiHandlers;
import com.gwtcx.client.util.I18nUtil;
import com.gwtcx.extgwt.client.widgets.ToolBar;
import com.gwtcx.shared.dto.AccountsDto;
import com.gwtplatform.mvp.client.UiHandlers;
import com.sencha.gxt.widget.core.client.event.SelectEvent;
import com.sencha.gxt.widget.core.client.event.SelectEvent.SelectHandler;
import com.sencha.gxt.widget.core.client.grid.Grid;
import com.sencha.gxt.widget.core.client.tips.ToolTipConfig;

/**
 * AbstractAccountsView
 */
public abstract class AbstractAccountsView<C extends UiHandlers> extends AbstractPagingView<C> {

  // protected String recordId;

  @Inject
  public AbstractAccountsView(ToolBar toolBar, Grid<?> grid) {
    super(toolBar, grid);

    // recordId = new String("-1");
  }

  @Override
  protected void bindCustomUiHandlers() {
    super.bindCustomUiHandlers();

    // initialise the ToolBar and register its handlers
    initToolBar();

    // register the ListGird handlers
    /*

    getListGrid().addRecordDoubleClickHandler(new RecordDoubleClickHandler() {
      @Override
      public void onRecordDoubleClick(RecordDoubleClickEvent event) {
        Record record = event.getRecord();
        recordId = record.getAttributeAsString(AccountsRecord.ACCOUNT_ID);

        if (getUiHandlers() != null) {
          // getUiHandlers().onRecordDoubleClicked(recordId);
          ((AccountsUiHandlers) getUiHandlers()).onRecordDoubleClicked(recordId);
        }
      }
    });

    */

    // initialise the StatusBar and register its handlers
    initStatusBar();
  }

  public void setResultSet(List<AccountsDto> resultSet) {
    // resultSet == null when there are no items in the table
    // if (resultSet != null) {
    //   ((AccountsContextAreaListGrid) getListGrid()).setResultSet(resultSet);
    // }
  }

  @Override
  protected void initToolBar() {

    ToolTipConfig config = new ToolTipConfig();
    config.setTitleHtml(I18nUtil.getConstant().newButton());
    config.setBodyHtml("Create a new Account");
    config.setTrackMouse(true);

    getToolBar().addButton(ToolBarIcons.INSTANCE.newAccount(), I18nUtil.getConstant().newButton(), config, new SelectHandler() {
    @Override
      public void onSelect(SelectEvent event) {
        // Info.display("Click", ((TextButton) event.getSource()).getText() + " clicked");
        if (getUiHandlers() != null) {
          // getUiHandlers().onNewButtonClicked();
          ((AccountsUiHandlers) getUiHandlers()).onNewButtonClicked();
        }
      }
    });

    getToolBar().addSeparator();

    getToolBar().addButton(ToolBarIcons.INSTANCE.printPreview(), null, null);
    getToolBar().addButton(ToolBarIcons.INSTANCE.export(), null, null);
    getToolBar().addButton(ToolBarIcons.INSTANCE.mailMerge(), null, null);
    getToolBar().addButton(ToolBarIcons.INSTANCE.reports(), null, null);

    getToolBar().addSeparator();

    getToolBar().addButton(ToolBarIcons.INSTANCE.assign(), null, null);
    getToolBar().addButton(ToolBarIcons.INSTANCE.delete(), null, null);
    getToolBar().addButton(ToolBarIcons.INSTANCE.sendEmail(), null, null);
    getToolBar().addButton(ToolBarIcons.INSTANCE.workflow(), null, null);

    getToolBar().addSeparator();

    getToolBar().addButton(ToolBarIcons.INSTANCE.refresh(), null, null);

    getToolBar().addFill();
  }

  @Override
  protected void initStatusBar() {

    /*

    // "0 of 50 selected"
    // statusBar.getSelectedLabel().setContents(I18nUtil.getConstant().selectedLabel());

    getStatusBar().getResultSetFirstButton().addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        if (getUiHandlers() != null) {
          // getUiHandlers().onResultSetFirstButtonClicked();
          ((AccountsUiHandlers) getUiHandlers()).onResultSetFirstButtonClicked();
        }
      }
    });

    getStatusBar().getResultSetPreviousButton().addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        if (getUiHandlers() != null) {
          // getUiHandlers().onResultSetPreviousButtonClicked();
          ((AccountsUiHandlers) getUiHandlers()).onResultSetPreviousButtonClicked();
        }
      }
    });

    // "Page 1"
    // statusBar.getPageNumberLabel().setContents(I18nUtil.getConstant().pageNumberLabel());

    getStatusBar().getResultSetNextButton().addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        if (getUiHandlers() != null) {
          ((AccountsUiHandlers) getUiHandlers()).onResultSetNextButtonClicked();
        }
      }
    });

    */
  }
}


