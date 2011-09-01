App Objective:	
To record personal weight information periodically in order to share with a third party such as a doctor or friend. Minimum keyboard use as possible (maximize use of phone features such as touches, flicks, etc).
	
A.Initial Setup View: Displayed on the first time the user runs the app. Can also be accessed for edit later through a Settings button on the app’s top navigation bar
a.	Name: Allows to enter name. b.	Email: Allows to enter email. c. Default Recipient Email: Selects email from a contact. Slides screen to
contacts i. Myself (user)
ii. Choose existing contact iii. Create new contact
d.	O p t i o n s :	Pounds	or	Kilograms	(1	decimal	place).	Saves	the	unit	selection	for the future. Allows to change selection in the future

B. Normal Use: a.	Log New Weight: After initial setup is complete this view should be the first one that the user sees when the app loads:
i. Date/Time Entry: Today/Now is default. Touching the date triggers an animated view transition to a selector that enables the user to choose a date and return to the main view. Use DatePicker.
ii. Weight Entry: TextView with last entered weight as preloaded value iii. Save Button: This button will commit the (date, weight) pair to a table in
a SQLite database
View/Edit History: Animated view transition to a grouped view that shows a table with weight information (displayed in the unit chosen in the Setup screen) and paired with entry date (no time). Rows are editable (slides screen to single record for editing or delete). User has the option to delete a row. The data is read from the SQLite table
Share Weight Info: Shares date, time and weight info in selected unit (table). Can share all available data or data since a specific date (specified by the user)
i. With myself: emails table to self ii. With default recipient iii. New contact: creates new contact and asks if this is new default
recipient .