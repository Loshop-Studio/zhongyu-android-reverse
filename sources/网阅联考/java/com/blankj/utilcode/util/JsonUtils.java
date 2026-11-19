package com.blankj.utilcode.util;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class JsonUtils {
    private static final byte TYPE_BOOLEAN = 0;
    private static final byte TYPE_DOUBLE = 3;
    private static final byte TYPE_INT = 1;
    private static final byte TYPE_JSON_ARRAY = 6;
    private static final byte TYPE_JSON_OBJECT = 5;
    private static final byte TYPE_LONG = 2;
    private static final byte TYPE_STRING = 4;

    private JsonUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static String formatJson(String str) {
        return formatJson(str, 4);
    }

    public static boolean getBoolean(JSONObject jSONObject, String str) {
        return getBoolean(jSONObject, str, false);
    }

    public static double getDouble(JSONObject jSONObject, String str) {
        return getDouble(jSONObject, str, -1.0d);
    }

    public static int getInt(JSONObject jSONObject, String str) {
        return getInt(jSONObject, str, -1);
    }

    public static JSONArray getJSONArray(JSONObject jSONObject, String str, JSONArray jSONArray) {
        return (JSONArray) getValueByType(jSONObject, str, jSONArray, (byte) 6);
    }

    public static JSONObject getJSONObject(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        return (JSONObject) getValueByType(jSONObject, str, jSONObject2, (byte) 5);
    }

    public static long getLong(JSONObject jSONObject, String str) {
        return getLong(jSONObject, str, -1L);
    }

    public static String getString(JSONObject jSONObject, String str) {
        return getString(jSONObject, str, "");
    }

    private static <T> T getValueByType(JSONObject jSONObject, String str, T t3, byte b4) {
        T t4;
        if (jSONObject != null && str != null && str.length() != 0) {
            try {
                if (b4 == 0) {
                    t4 = (T) Boolean.valueOf(jSONObject.getBoolean(str));
                } else if (b4 == 1) {
                    t4 = (T) Integer.valueOf(jSONObject.getInt(str));
                } else if (b4 == 2) {
                    t4 = (T) Long.valueOf(jSONObject.getLong(str));
                } else if (b4 == 3) {
                    t4 = (T) Double.valueOf(jSONObject.getDouble(str));
                } else if (b4 == 4) {
                    t4 = (T) jSONObject.getString(str);
                } else if (b4 == 5) {
                    t4 = (T) jSONObject.getJSONObject(str);
                } else if (b4 == 6) {
                    t4 = (T) jSONObject.getJSONArray(str);
                }
                return t4;
            } catch (JSONException e4) {
                e4.printStackTrace();
            }
        }
        return t3;
    }

    public static <T> boolean isJSONArray(T t3) {
        return t3 instanceof JSONArray;
    }

    public static <T> boolean isJSONObject(T t3) {
        return t3 instanceof JSONObject;
    }

    public static String formatJson(String str, int i4) {
        try {
            int length = str.length();
            for (int i5 = 0; i5 < length; i5++) {
                char cCharAt = str.charAt(i5);
                if (cCharAt == '{') {
                    return new JSONObject(str).toString(i4);
                }
                if (cCharAt == '[') {
                    return new JSONArray(str).toString(i4);
                }
                if (!Character.isWhitespace(cCharAt)) {
                    return str;
                }
            }
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
        return str;
    }

    public static boolean getBoolean(JSONObject jSONObject, String str, boolean z3) {
        return ((Boolean) getValueByType(jSONObject, str, Boolean.valueOf(z3), (byte) 0)).booleanValue();
    }

    public static double getDouble(JSONObject jSONObject, String str, double d4) {
        return ((Double) getValueByType(jSONObject, str, Double.valueOf(d4), (byte) 3)).doubleValue();
    }

    public static int getInt(JSONObject jSONObject, String str, int i4) {
        return ((Integer) getValueByType(jSONObject, str, Integer.valueOf(i4), (byte) 1)).intValue();
    }

    public static JSONArray getJSONArray(String str, String str2, JSONArray jSONArray) {
        return (JSONArray) getValueByType(str, str2, jSONArray, (byte) 6);
    }

    public static JSONObject getJSONObject(String str, String str2, JSONObject jSONObject) {
        return (JSONObject) getValueByType(str, str2, jSONObject, (byte) 5);
    }

    public static long getLong(JSONObject jSONObject, String str, long j4) {
        return ((Long) getValueByType(jSONObject, str, Long.valueOf(j4), (byte) 2)).longValue();
    }

    public static String getString(JSONObject jSONObject, String str, String str2) {
        return (String) getValueByType(jSONObject, str, str2, (byte) 4);
    }

    public static boolean getBoolean(String str, String str2) {
        return getBoolean(str, str2, false);
    }

    public static double getDouble(String str, String str2) {
        return getDouble(str, str2, -1.0d);
    }

    public static int getInt(String str, String str2) {
        return getInt(str, str2, -1);
    }

    public static long getLong(String str, String str2) {
        return getLong(str, str2, -1L);
    }

    public static String getString(String str, String str2) {
        return getString(str, str2, "");
    }

    public static boolean getBoolean(String str, String str2, boolean z3) {
        return ((Boolean) getValueByType(str, str2, Boolean.valueOf(z3), (byte) 0)).booleanValue();
    }

    public static double getDouble(String str, String str2, double d4) {
        return ((Double) getValueByType(str, str2, Double.valueOf(d4), (byte) 3)).doubleValue();
    }

    public static int getInt(String str, String str2, int i4) {
        return ((Integer) getValueByType(str, str2, Integer.valueOf(i4), (byte) 1)).intValue();
    }

    public static long getLong(String str, String str2, long j4) {
        return ((Long) getValueByType(str, str2, Long.valueOf(j4), (byte) 2)).longValue();
    }

    public static String getString(String str, String str2, String str3) {
        return (String) getValueByType(str, str2, str3, (byte) 4);
    }

    private static <T> T getValueByType(String str, String str2, T t3, byte b4) {
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            try {
                return (T) getValueByType(new JSONObject(str), str2, t3, b4);
            } catch (JSONException e4) {
                e4.printStackTrace();
            }
        }
        return t3;
    }
}
