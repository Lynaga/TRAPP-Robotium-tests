package project.therunningapp.test;

import com.jayway.android.robotium.solo.Solo;

import therunningapp.MainActivity;
import android.media.audiofx.BassBoost.Settings;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.ListView;

@SuppressWarnings("unused")
public class SettingsTest extends
		ActivityInstrumentationTestCase2<MainActivity> {
	
	private Solo solo;

	public SettingsTest() {
		super("project.therunningapp", MainActivity.class);
		// TODO Auto-generated constructor stub
	}

	protected void setUp() throws Exception {
		super.setUp();
		solo = new Solo(getInstrumentation(), getActivity());
	}
	
	public void testOpenApp(){
		solo.assertCurrentActivity("first activity check", MainActivity.class);
		solo.clickOnImageButton(1);
		solo.clickOnButton("Innstillinger");
		solo.clickOnButton("Lagre");
		solo.clickOnImageButton(0);
		solo.sleep(10000);
		
		solo.clickOnButton("Workout");
		solo.clickOnButton("Start new test");
		solo.clickInList(0);
		solo.clickOnButton("Start");
		solo.sleep(10000);
		
		solo.clickOnButton("End workout");
		solo.clickOnButton("Workout");
		solo.clickOnButton("Start new test");
		solo.clickInList(1);
		solo.clickOnButton("Start");
		solo.sleep(10000);
		
		solo.clickOnButton("End workout");
		solo.clickOnButton("Workout");
		solo.clickOnButton("Start new test");
		solo.clickInList(2);
		solo.clickOnButton("Start");
		solo.sleep(10000);
		
		solo.clickOnButton("End workout");
		solo.clickOnButton("Workout");
		solo.clickOnButton("Start new test");
		solo.clickInList(3);
		solo.clickOnButton("Start");
		solo.sleep(10000);
		
		solo.clickOnButton("End workout");
		solo.clickOnButton("Workout");
		solo.clickOnButton("Start new test");
		solo.clickInList(4);
		solo.clickOnButton("Start");
		solo.sleep(10000);
		
		solo.clickOnButton("End workout");
		solo.clickOnButton("Workout");
		solo.clickOnButton("Start new test");
		solo.clickOnRadioButton(0);
		solo.enterText(0,"5");
		solo.enterText(1, "0");
		solo.clickOnButton("Start");
		solo.sleep(10000);
		
		solo.clickOnButton("End workout");
		solo.clickOnButton("Workout");
		solo.clickOnButton("Start new test");
		solo.clickOnRadioButton(1);
		solo.enterText(0,"500");
		solo.clickOnButton("Start");
		solo.sleep(10000);
		
		solo.clickOnButton("End workout");
		}
}

