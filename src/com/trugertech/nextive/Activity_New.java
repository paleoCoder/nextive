/**
 * Activity that provides an interface to enter new weights.
 * 
 * The user will be able to enter a date and weight.
 * 
 * The activity checks if the user has entered contact information.
 * If not then the contact activity is launched.
 * 
 * Date - Today/now will be default populated. Tapping the date
 * 		will bring the user (view animation) to a date picker.
 * Weight - The last logged weight will be preloaded.
 */
package com.trugertech.nextive;

import android.app.Activity;
import android.os.Bundle;

public class Activity_New extends Activity {

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

}
