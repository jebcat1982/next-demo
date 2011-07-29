/*
 * Copyright 2011 Vancouver Ywebb Consulting Ltd
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package next.interfaces.controller.widgets;

import next.i.controller.XTableController;
import next.i.view.XTableCell;
import next.i.view.XTableDataSource;
import next.i.view.XTableView;
import next.interfaces.controller.DemoUtils;
import next.interfaces.views.CustomListController;
import next.interfaces.views.NavigationBarController;
import next.interfaces.views.SimpleListController;
import next.interfaces.views.SlideController;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;

public class WidgetsController extends XTableController {

	public WidgetsController() {

		setTitle("next Widgets");

		getNavigationBar().setRightTitle("Source");
		getNavigationBar().getRightButton().addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				DemoUtils.openGit(getGitPath());
			}
		});

		((XTableView) getView()).showChevron(true);

		XTableDataSource tableDS = new XTableDataSource();
		tableDS.add("Button", "Slider", "Picker", "Switch", "Progress", "CheckBox", "Radio Button", "Form",
				"Label and Image", "List", "Navigation"
//				, "Custom List"
//				, "Slide"
				);

		initDataSource(tableDS);
	}

	@Override
	public void onRowSelected(int indexSelected, String titleSelected, XTableCell tableCell) {

		if (indexSelected == 0) {
			getNavigationController().pushController(new ButtonsController(), true);

		} else if (indexSelected == 1) {
			getNavigationController().pushController(new SliderController(), true);

		} else if (indexSelected == 2) {
			getNavigationController().pushController(new PickerController(), true);

		} else if (indexSelected == 3) {
			getNavigationController().pushController(new SwitchController(), true);

		} else if (indexSelected == 4) {
			getNavigationController().pushController(new ProgressController(), true);

		} else if (indexSelected == 5) {
			getNavigationController().pushController(new CheckboxController(), true);

		} else if (indexSelected == 6) {
			getNavigationController().pushController(new RadioButtonController(), true);

		} else if (indexSelected == 7) {
			getNavigationController().pushController(new FormController(), true);

		} else if (indexSelected == 8) {
			getNavigationController().pushController(new LabelImageController(), true);

		} else if (indexSelected == 9) {
			getNavigationController().pushController(new SimpleListController(), true);

		} else if (indexSelected == 10) {
			getNavigationController().pushController(new NavigationBarController(), true);

		} else if (indexSelected == 11) {
			getNavigationController().pushController(new CustomListController(), true);

		} else if (indexSelected == 12) {
			getNavigationController().pushController(new SlideController(), true);
		}

	}

	public String getGitPath() {
		return "/controller/widgets/WidgetsController";
	}

}