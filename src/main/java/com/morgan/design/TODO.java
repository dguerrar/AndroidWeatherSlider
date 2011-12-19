package com.morgan.design;

public class TODO {
	private TODO() {
	}

	// /////////
	// Future //
	// /////////

	// FIXME -> add provider
	// FIXME -> localisation
	// FIXME -> debug mode on/off for deployment
	// FIXME -> add flags for each country
	// FIXME -> add option for date format
	// FIXME -> Configure build process, updating versions/ debug enabled/ keys/ changelog etc
	// FIXME -> Create Broadcast Service helper e.g. BroadcastRegister.register(this); @BroadcastReciever on file will deal with unbind/bind
	// FIXME -> Consider Android Annotations (http://code.google.com/p/androidannotations/)
	// FIXME -> Allow users to narrow down location accuracy
	// FIXME -> Capture all shared preference values on application crash (ARCA)

	// ///////////////
	// Nice To Have //
	// ///////////////

	// FIXME -> turn sun set and rise in time objects
	// FIXME -> Show location on a small map in overview mode?
	// FIXME -> Open location on map from notification click handler
	// FIXME -> Potentially show accuracy and time when looking up GPS location
	// FIXME -> Option to disable collecting of logs via ACRA
	// FIXME -> Check try/catch blocks report to ACRA if required

	// ////////////////
	// Consideration //
	// ////////////////

	// FIXME -> Ability to Cancel all active notifications from menu
	// FIXME -> Improve current notification layout
	// FIXME -> new providers, Google / The Weather Channel - http://www.weather.com/services/xmloap.html
	// FIXME -> Add temperature highs/lows for day on overview screen
	// FIXME -> DB Version's & Tests
	// FIXME -> Complete statuses, active, inactive, issues?

	// //////////////////////
	// Release Version 1.0 //
	// //////////////////////

	// FIXME -> DONE - (19/12/2011) - Remove as much as possible Android Lint warnings/errors

	// FIXME -> Change default preferences before go-live
	// FIXME -> Ensure applications re-loads weather data from all angles
	// FIXME -> Ensure all necessary data is being stored/recorded correctly

	// FIXME -> DONE - (18/12/2011) - Improve progress/interaction when looking up GPS location
	// FIXME -> DONE - (18/12/2011) - If GPS && network are disabled, prompt user to turn it on ->
	// http://advback.com/android/checking-if-gps-is-enabled-android/

	// FIXME -> Pro-guard bug when running on real phone -> Update latest maven-android-plugin - 3.0.1
	// FIXME -> change tabs for view pager -> http://blog.stylingandroid.com/archives/537

	// FIXME -> Allow for roaming location based settings (paid version only) -
	// http://android-developers.blogspot.com/2011/06/deep-dive-into-location.html?m=1

	// FIXME -> Ensure all notifications always update correctly
	// FIXME -> Listen for 3rd party GPS position updated so can notifications if required.

	// FIXME -> Get WOEID from current lat/long
	// FIXME -> Fix bug when parsing RFC822 dates from yahoo
	// FIXME -> DONE - Fix GPS bug when finding location

	// FIXME -> Handle situations when no locations found
	// FIXME -> Investigate how to ensure service is always started/on

	// FIXME -> Add ability to launch service on phone start up, check existing functionality
	// FIXME -> Add ability to pay for application in-line

	// FIXME -> DONE - (19/12/2011) - Allow removal not just deletion of any notification via home screen
	// FIXME -> DONE - (19/12/2011) - Broadcast active notifications changed in order to reload choices on home screen
	// FIXME -> DONE - (19/12/2011) - Add fields to DB, Active, Latitude, Longitude -> rename to WeatherChoice.java
	// FIXME -> DONE - (19/12/2011) - Show active state on home screen

	// FIXME -> Allow re-loading of existing notifications
	// FIXME -> Ensure correct service IDs matched against current weather

	// ////////////////////////////////////
	// Previously Completed - 18/12/2011 //
	// ////////////////////////////////////

	// FIXME -> DONE - Record service and current notification in application
	// FIXME -> DONE - Update Overview screen to lookup weather
	// FIXME -> DONE - allow only maximum number of 3 active notifications at once
	// FIXME -> DONE - allow for multiple notifications at once (paid version only)
	// FIXME -> DONE - Check for battery level (15%), active networks (GPS and Mobile), location age
	// FIXME -> DONE - improve notification when no locations found
	// FIXME -> DONE - Created none-bindable intent based service
	// FIXME -> DONE - Add in and setup crash report handler (http://code.google.com/p/acra/), Customised with toast and logcat logs
	// FIXME -> DONE - Update latest ORMLite version - 4.31
	// FIXME -> DONE - Change log pop-up and menu option
	// FIXME -> DONE - Feedback log pop-up on new version
	// FIXME -> DONE - Setup merchant account on google
	// FIXME -> DONE - Added google analytics jar and initial tracking calls
	// FIXME -> DONE - download new icon sets, weather channel icons
	// FIXME -> DONE - add option for wind unit e.g. kmh/mph
	// FIXME -> DONE - add location information to overview screen
	// FIXME -> DONE - Improve notification layout
	// FIXME -> DONE - Condition code translation class
	// FIXME -> DONE - Convert all types correctly, dates, ints, floats, longs etc
	// FIXME -> DONE - add swipe gesture to overview tabs
	// FIXME -> DONE - custom tab view with xml skin
	// FIXME -> DONE - Add Link to more information on Overview screen
	// FIXME -> DONE - Add visibility/pressure/pressure rising to query and overview screen
	// FIXME -> DONE - Add option for C or F when retrieving temperature
	// FIXME -> DONE - improved error messages for no connection found for GPS and weather query
	// FIXME -> DONE - handle on click event notification event. opening overview, initial design
	// FIXME -> DONE - Create converter for decimal degrees to human readable wind direction
	// FIXME -> DONE - Add icons over view sun set and rise
	// FIXME -> DONE - Ensure Home screen is always updated on application focus/launch
	// FIXME -> DONE - Query Yahoo based on GPS location (paid version only)
	// FIXME -> DONE - GPS based location finding (paid version only)
	// FIXME -> DONE - on preferences change notification service click handler
	// FIXME -> DONE - on preferences change loader service polling options
	// FIXME -> DONE - On click notification user preference (paid version only)
	// FIXME -> DONE - start service on phone boot boot up (paid version only)
	// FIXME -> DONE - start last known service on open (paid version only)
	// FIXME -> DONE - swipe navigation path - (add to manual)
	// FIXME -> DONE - periodically query for weather
	// FIXME -> DONE - check phone has Internet before launching
}
