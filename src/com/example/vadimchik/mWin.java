package com.example.vadimchik;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.terminal.Resource;
import com.vaadin.terminal.ThemeResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.Link;
import com.vaadin.ui.ListSelect;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.VerticalSplitPanel;
import com.vaadin.ui.themes.*;

public class mWin extends CustomComponent {

	@AutoGenerated
	private GridLayout mainLayout;
	@AutoGenerated
	private VerticalSplitPanel verticalSplitPanel_1;
	@AutoGenerated
	private HorizontalSplitPanel horizontalSplitPanel_1;
	@AutoGenerated
	private ListSelect listSelect_1;
	@AutoGenerated
	private VerticalLayout verticalLayout_1;
	@AutoGenerated
	private HorizontalLayout horizontalLayout_1;
	@AutoGenerated
	private Link link_3;
	@AutoGenerated
	private Link link_2;
	@AutoGenerated
	private Link link_1;

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	/**
	 * The constructor should first build the main layout, set the
	 * composition root and then do any custom initialization.
	 *
	 * The constructor will not be automatically regenerated by the
	 * visual editor.
	 */
	public mWin() {
		buildMainLayout();
		setCompositionRoot(mainLayout);

		// TODO add user code here
	}

	@AutoGenerated
	private GridLayout buildMainLayout() {
		// common part: create layout
		mainLayout = new GridLayout();
		mainLayout.setImmediate(false);
		mainLayout.setWidth("100%");
		mainLayout.setHeight("100%");
		mainLayout.setMargin(false);
		
		// top-level component properties
		setWidth("100.0%");
		setHeight("100.0%");
		
		// verticalSplitPanel_1
		verticalSplitPanel_1 = buildVerticalSplitPanel_1();
		mainLayout.addComponent(verticalSplitPanel_1, 0, 0);
		
		return mainLayout;
	}

	@AutoGenerated
	private VerticalSplitPanel buildVerticalSplitPanel_1() {
		// common part: create layout
		verticalSplitPanel_1 = new VerticalSplitPanel();
		verticalSplitPanel_1.setImmediate(false);
		verticalSplitPanel_1.setWidth("100.0%");
		verticalSplitPanel_1.setHeight("100.0%");
		verticalSplitPanel_1.setMargin(false);
		
		// verticalLayout_1
		verticalLayout_1 = buildVerticalLayout_1();
		verticalSplitPanel_1.addComponent(verticalLayout_1);
		
		// horizontalSplitPanel_1
		horizontalSplitPanel_1 = buildHorizontalSplitPanel_1();
		verticalSplitPanel_1.addComponent(horizontalSplitPanel_1);
		
		return verticalSplitPanel_1;
	}

	@AutoGenerated
	private VerticalLayout buildVerticalLayout_1() {
		// common part: create layout
		verticalLayout_1 = new VerticalLayout();
		verticalLayout_1.setImmediate(false);
		verticalLayout_1.setWidth("100.0%");
		verticalLayout_1.setHeight("100.0%");
		verticalLayout_1.setMargin(true);
		
		// link_1
		link_1 = new Link();
		link_1.setCaption("Link");
		link_1.setImmediate(false);
		link_1.setWidth("-1px");
		link_1.setHeight("-1px");
		verticalLayout_1.addComponent(link_1);
		verticalLayout_1.setComponentAlignment(link_1, new Alignment(20));
		
		// horizontalLayout_1
		horizontalLayout_1 = buildHorizontalLayout_1();
		verticalLayout_1.addComponent(horizontalLayout_1);
		verticalLayout_1.setExpandRatio(horizontalLayout_1, 1.0f);
		
		return verticalLayout_1;
	}

	@AutoGenerated
	private HorizontalLayout buildHorizontalLayout_1() {
		// common part: create layout
		horizontalLayout_1 = new HorizontalLayout();
		horizontalLayout_1.setImmediate(false);
		horizontalLayout_1.setWidth("100.0%");
		horizontalLayout_1.setHeight("100.0%");
		horizontalLayout_1.setMargin(true);
		
		// link_2
		link_2 = new Link();
		link_2.setCaption("Link");
		link_2.setImmediate(false);
		link_2.setWidth("-1px");
		link_2.setHeight("-1px");
		link_2.setIcon(new ThemeResource("../img/CarCrash-64a.png"));

		horizontalLayout_1.addComponent(link_2);
		horizontalLayout_1.setComponentAlignment(link_2, new Alignment(20));
		
		// link_3
		link_3 = new Link();
		link_3.setCaption("Link");
		link_3.setImmediate(false);
		link_3.setWidth("-1px");
		link_3.setHeight("-1px");
		horizontalLayout_1.addComponent(link_3);
		horizontalLayout_1.setComponentAlignment(link_3, new Alignment(20));
		
		return horizontalLayout_1;
	}

	@AutoGenerated
	private HorizontalSplitPanel buildHorizontalSplitPanel_1() {
		// common part: create layout
		horizontalSplitPanel_1 = new HorizontalSplitPanel();
		horizontalSplitPanel_1.setImmediate(false);
		horizontalSplitPanel_1.setWidth("100.0%");
		horizontalSplitPanel_1.setHeight("100.0%");
		horizontalSplitPanel_1.setMargin(false);
		
		// listSelect_1
		listSelect_1 = new ListSelect();
		listSelect_1.setImmediate(false);
		listSelect_1.setWidth("100.0%");
		listSelect_1.setHeight("100.0%");
		horizontalSplitPanel_1.addComponent(listSelect_1);
		
		return horizontalSplitPanel_1;
	}

}
