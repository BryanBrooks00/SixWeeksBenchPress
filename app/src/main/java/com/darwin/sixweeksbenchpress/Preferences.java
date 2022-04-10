package com.darwin.sixweeksbenchpress;
import android.content.Context;
import android.preference.PreferenceManager;

public class Preferences {

    private static final String PREF_RECORD = "lastRecord";
    private static final String PREF_LEVEL = "lastlevel";

    public static String getRecord(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context)
                .getString(PREF_RECORD, "");
    }
    public static void setRecord(Context context, String lastResult) {
        PreferenceManager.getDefaultSharedPreferences(context)
                .edit()
                .putString(PREF_RECORD, lastResult)
                .apply();
    }

    public static String getLevel(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context)
                .getString(PREF_LEVEL, "1");
    }
    public static void setLevel(Context context, String lastLevel) {
        PreferenceManager.getDefaultSharedPreferences(context)
                .edit()
                .putString(PREF_LEVEL, lastLevel)
                .apply();
    }

    public static void clearPrefs(Context context) {
        PreferenceManager.getDefaultSharedPreferences(context)
                .edit()
                .clear()
                .apply();
    }
}