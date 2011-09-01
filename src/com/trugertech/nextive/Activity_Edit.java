/**
 * Activity to view and edit logged weights.
 * 
 * Displays a list of the logged weights ordered by date (no time).
 * Tapping on a record slides (view animation) to display the weight
 * and date as editable. There is also a delete, share and done button.
 * 
 * Delete - pressing will prompt the user to confirm deleting the record
 * 		then return to the list.
 * Share - present the user a sharing interface for the selected record
 * Done - takes the user back to the list
 */
package com.trugertech.nextive;

import android.app.Activity;
import android.os.Bundle;

public class Activity_Edit extends Activity {
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}
