package com.candorgrc.idfusion.sandbox.client.datapresentation.cell;

import com.candorgrc.idfusion.sandbox.client.model.PersonJSO;
import com.google.gwt.cell.client.AbstractCell;
import com.google.gwt.cell.client.ValueUpdater;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.BrowserEvents;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.NativeEvent;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.client.SafeHtmlTemplates.Template;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;

public class PersonCell extends AbstractCell<PersonJSO> {

	public static enum Action {
		CREATE, UPDATE, COPY, DELETE
	}

	/*
	 * Safe XHTML5 Template instance.
	 */
	private Template template;

	/*
	 * Constructor method
	 */
	public PersonCell() {
		/*
		 * register for consuming click events
		 */
		super(BrowserEvents.CLICK);

		// instantiate Safe HTML Template
		if (template == null) {
			template = GWT.create(Template.class);
		}
	}

	/*
	 * HTML render method.
	 *
	 * (non-Javadoc)
	 *
	 * @see
	 * com.google.gwt.cell.client.AbstractCell#render(com.google.gwt.cell.client
	 * .Cell.Context, java.lang.Object,
	 * com.google.gwt.safehtml.shared.SafeHtmlBuilder)
	 */
	@Override
	public void render(Context context, PersonJSO value, SafeHtmlBuilder sb) {
		if (value != null) {

			// build
			//@formatter:off
			sb.append(template.build(value.getTitle(), 			// 0
								     value.getFirstName(), 		// 1
								     value.getLastName(),  		// 2
								     value.getSuffix(), 		// 3
								     value.getGender(), 		// 4
								     value.getRace(), 			// 5
								     value.getLanguage(), 		// 6
								     value.getUniversity(),		// 7
								     value.getBuzzword(),  		// 8
								     value.getEmail(),  		// 9
								     value.getJobTitle(), 		// 10
								     value.getLinkedinSkill(), 	// 11
								     value.getAvatar(), 		// 12
								     value.getCompany(), 		// 13
								     value.getDepartment(), 	// 14
								     value.getEin(), 			// 15
								     Action.UPDATE.name(), 		// 16
								     Action.COPY.name(), 		// 17
								     Action.DELETE.name())); 	// 18
			//@formatter:on

			// other asynchronous workers may be added here
		}
	}

	/*
	 * Handle Browser Event(s).
	 *
	 * (non-Javadoc)
	 *
	 * @see
	 * com.google.gwt.cell.client.AbstractCell#onBrowserEvent(com.google.gwt.
	 * cell.client.Cell.Context, com.google.gwt.dom.client.Element,
	 * java.lang.Object, com.google.gwt.dom.client.NativeEvent,
	 * com.google.gwt.cell.client.ValueUpdater)
	 */
	@Override
	public void onBrowserEvent(Context context, Element parent, PersonJSO value, NativeEvent event, ValueUpdater<PersonJSO> valueUpdater) {
		super.onBrowserEvent(context, parent, value, event, valueUpdater);
		final Element element = event.getEventTarget().cast();
		final String action = element.getAttribute("action");

		if (!action.isEmpty()) {
			value.setAction(action);
			valueUpdater.update(value);
		}
	}

	/**
	 * Cell XHTML Template.
	 * 
	 * @designer: feel free to modify it in order to meet your expectations
	 *
	 */
	public interface Template extends SafeHtmlTemplates {
		//@formatter:off
		@Template("<div class='person-cell'>"
				 	+ "<header>"
				 		+ "<figure>"
				 			+ "<img class='avatar' src=\"{12}\"></img>"
				 			+ "<figcaption class='caption'>"
				 				+ "<span class='title'>{0}</span>"
				 				+ "<span class='first-name'>{1}</span>"
				 				+ "<span class='last-name'>{2}</span>"
				 				+ "<span class='suffix'>{3}</span>"
				 			+ "</figcaption>"
				 		+ "</figure>"
					+ "</header>"
					+ "<section>"
						+ "<div class='personal-info'>"
							+ "<i class='{4}' title='{4}'></i>"
							+ "<div class='race'>{5}</div>"
							+ "<div class='language'>{6}</div>"
						+ "</div>"
						+ "<div class='education'>"
							+ "<div class='university'>{7}</div>"
						+ "</div>"
						+ "<div class='work'>"
							+ "<div class='job-title'>{10}</div>"
							+ "<div class='company'>{13}</div>"
							+ "<div class='department'>{14}</div>"
							+ "<div class='ein'>{15}</div>"
							+ "<div class='email'>{9}</div>"
						+ "</div>"
						+ "<aside>"
							+ "<div class='linkedin-skill'>{11}</div>"
							+ "<div class='buzzword'>{8}</div>"
						+ "</aside>"
					+ "</section>"
					+ "<footer>"
						+ "<nav class='controls'>"
							+ "<button class='edit' action='{16}' title='Edit'><i class='edit' action='{16}'></i></button>"
							+ "<button class='copy' action='{17}' title='Copy'><i class='copy' action='{17}'></i></button>"
							+ "<button class='delete' action='{18}' title='Delete'><i class='delete' action='{18}'></i></button>"
						+ "</nav>"
					+ "</footer>"
				+ "</div>")
		//@formatter:on
		SafeHtml build(String title, String firstName, String lastName, String suffix, String gender, String race, String language, String university, String buzzword,
				String email, String jobTitle, String linkedinSkill, String avatar, String company, String department, String ein, String editAction, String copyAction,
				String deleteAction);
	}

}
