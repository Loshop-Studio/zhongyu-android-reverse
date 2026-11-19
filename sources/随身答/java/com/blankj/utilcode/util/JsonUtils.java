package com.blankj.utilcode.util;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
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
        return (JSONArray) getValueByType(jSONObject, str, jSONArray, TYPE_JSON_ARRAY);
    }

    public static JSONObject getJSONObject(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        return (JSONObject) getValueByType(jSONObject, str, jSONObject2, TYPE_JSON_OBJECT);
    }

    public static long getLong(JSONObject jSONObject, String str) {
        return getLong(jSONObject, str, -1L);
    }

    public static String getString(JSONObject jSONObject, String str) {
        return getString(jSONObject, str, "");
    }

    private static <T> T getValueByType(JSONObject jSONObject, String str, T t9, byte b10) {
        if (jSONObject != null && str != null && str.length() != 0) {
            try {
                if (b10 == 0) {
                    return (T) Boolean.valueOf(jSONObject.getBoolean(str));
                }
                if (b10 == 1) {
                    return (T) Integer.valueOf(jSONObject.getInt(str));
                }
                if (b10 == 2) {
                    return (T) Long.valueOf(jSONObject.getLong(str));
                }
                if (b10 == 3) {
                    return (T) Double.valueOf(jSONObject.getDouble(str));
                }
                if (b10 == 4) {
                    return (T) jSONObject.getString(str);
                }
                if (b10 == 5) {
                    return (T) jSONObject.getJSONObject(str);
                }
                if (b10 == 6) {
                    return (T) jSONObject.getJSONArray(str);
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        return t9;
    }

    public static <T> boolean isJSONArray(T t9) {
        return t9 instanceof JSONArray;
    }

    public static <T> boolean isJSONObject(T t9) {
        return t9 instanceof JSONObject;
    }

    public static String formatJson(String str, int i9) {
        try {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = str.charAt(i10);
                if (cCharAt == '{') {
                    return new JSONObject(str).toString(i9);
                }
                if (cCharAt == '[') {
                    return new JSONArray(str).toString(i9);
                }
                if (!Character.isWhitespace(cCharAt)) {
                    return str;
                }
            }
            return str;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return str;
        }
    }

    public static boolean getBoolean(JSONObject jSONObject, String str, boolean z9) {
        return ((Boolean) getValueByType(jSONObject, str, Boolean.valueOf(z9), (byte) 0)).booleanValue();
    }

    public static double getDouble(JSONObject jSONObject, String str, double d10) {
        return ((Double) getValueByType(jSONObject, str, Double.valueOf(d10), (byte) 3)).doubleValue();
    }

    public static int getInt(JSONObject jSONObject, String str, int i9) {
        return ((Integer) getValueByType(jSONObject, str, Integer.valueOf(i9), (byte) 1)).intValue();
    }

    public static JSONArray getJSONArray(String str, String str2, JSONArray jSONArray) {
        return (JSONArray) getValueByType(str, str2, jSONArray, TYPE_JSON_ARRAY);
    }

    public static JSONObject getJSONObject(String str, String str2, JSONObject jSONObject) {
        return (JSONObject) getValueByType(str, str2, jSONObject, TYPE_JSON_OBJECT);
    }

    public static long getLong(JSONObject jSONObject, String str, long j9) {
        return ((Long) getValueByType(jSONObject, str, Long.valueOf(j9), (byte) 2)).longValue();
    }

    public static String getString(JSONObject jSONObject, String str, String str2) {
        return (String) getValueByType(jSONObject, str, str2, TYPE_STRING);
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

    public static boolean getBoolean(String str, String str2, boolean z9) {
        return ((Boolean) getValueByType(str, str2, Boolean.valueOf(z9), (byte) 0)).booleanValue();
    }

    public static double getDouble(String str, String str2, double d10) {
        return ((Double) getValueByType(str, str2, Double.valueOf(d10), (byte) 3)).doubleValue();
    }

    public static int getInt(String str, String str2, int i9) {
        return ((Integer) getValueByType(str, str2, Integer.valueOf(i9), (byte) 1)).intValue();
    }

    public static long getLong(String str, String str2, long j9) {
        return ((Long) getValueByType(str, str2, Long.valueOf(j9), (byte) 2)).longValue();
    }

    public static String getString(String str, String str2, String str3) {
        return (String) getValueByType(str, str2, str3, TYPE_STRING);
    }

    private static <T> T getValueByType(String str, String str2, T t9, byte b10) {
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            try {
                return (T) getValueByType(new JSONObject(str), str2, t9, b10);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        return t9;
    }
}
