package com.huawei.hms.utils;

import android.text.TextUtils;
import com.huawei.hms.core.aidl.InterfaceC7278e;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.support.log.common.Base64;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.android.agoo.common.AgooConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p161g5.InterfaceC9271a;

/* loaded from: classes5.dex */
public class JsonUtil {
    /* renamed from: a */
    public static Object m8798a(String str, JSONObject jSONObject) {
        if (jSONObject.has(str)) {
            return jSONObject.get(str);
        }
        if (jSONObject.has("header") && jSONObject.getJSONObject("header").has(str)) {
            return jSONObject.getJSONObject("header").get(str);
        }
        if (jSONObject.has(AgooConstants.MESSAGE_BODY) && jSONObject.getJSONObject(AgooConstants.MESSAGE_BODY).has(str)) {
            return jSONObject.getJSONObject(AgooConstants.MESSAGE_BODY).get(str);
        }
        return null;
    }

    /* renamed from: b */
    public static String m8799b(InterfaceC7278e interfaceC7278e) throws IllegalAccessException, JSONException, IllegalArgumentException {
        JSONObject jSONObject = new JSONObject();
        for (Class<?> superclass = interfaceC7278e.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            for (Field field : superclass.getDeclaredFields()) {
                if (field.isAnnotationPresent(InterfaceC9271a.class)) {
                    boolean zIsAccessible = field.isAccessible();
                    m8805h(field, true);
                    String name = field.getName();
                    Object obj = field.get(interfaceC7278e);
                    m8805h(field, zIsAccessible);
                    m8806i(name, obj, jSONObject);
                }
            }
        }
        return jSONObject.toString();
    }

    /* renamed from: c */
    public static List m8800c(Type type, JSONObject jSONObject) throws JSONException {
        int i10 = jSONObject.getInt("_list_size_");
        int i11 = jSONObject.getInt("_val_type_");
        ArrayList arrayList = new ArrayList(i10);
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = jSONObject.get("_list_item_" + i12);
            if (i11 == 0) {
                arrayList.add(jsonToEntity((String) obj, (InterfaceC7278e) ((Class) ((ParameterizedType) type).getActualTypeArguments()[0]).newInstance()));
            } else if (i11 == 1) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Deprecated
    public static String createJsonString(InterfaceC7278e interfaceC7278e) {
        if (interfaceC7278e == null) {
            HMSLog.m8725e("JsonUtil", "createJsonString error, the input IMessageEntity is null");
            return "";
        }
        try {
            return m8799b(interfaceC7278e);
        } catch (IllegalAccessException e10) {
            HMSLog.m8725e("JsonUtil", "catch IllegalAccessException " + e10.getMessage());
            return "";
        } catch (JSONException e11) {
            HMSLog.m8725e("JsonUtil", "catch JSONException " + e11.getMessage());
            return "";
        }
    }

    /* renamed from: d */
    public static void m8801d(InterfaceC7278e interfaceC7278e, Field field, JSONObject jSONObject) throws JSONException, IllegalAccessException, IllegalArgumentException {
        Object objM8808k = m8808k(interfaceC7278e, field, jSONObject);
        if (objM8808k != null) {
            boolean zIsAccessible = field.isAccessible();
            m8805h(field, true);
            field.set(interfaceC7278e, objM8808k);
            m8805h(field, zIsAccessible);
        }
    }

    /* renamed from: e */
    public static void m8802e(String str, List list, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("_val_type_", 1);
        jSONObject2.put("_list_size_", list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            m8806i("_list_item_" + i10, list.get(i10), jSONObject2);
            if (list.get(i10) instanceof InterfaceC7278e) {
                jSONObject2.put("_val_type_", 0);
            }
        }
        jSONObject.put(str, jSONObject2);
    }

    /* renamed from: f */
    public static void m8803f(String str, Map map, JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key instanceof InterfaceC7278e) {
                jSONArray.put(m8799b((InterfaceC7278e) key));
            } else {
                jSONArray.put(key);
            }
            if (value instanceof InterfaceC7278e) {
                jSONArray.put(m8799b((InterfaceC7278e) value));
            } else {
                jSONArray.put(value);
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("_val_type_", 3);
        jSONObject2.put("_map_", jSONArray.toString());
        jSONObject.put(str, jSONObject2);
    }

    /* renamed from: g */
    public static void m8804g(String str, byte[] bArr, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("_val_type_", 2);
        try {
            jSONObject2.put("_byte_", Base64.encode(bArr));
        } catch (IllegalArgumentException e10) {
            HMSLog.m8725e("JsonUtil", "writeByte failed : " + e10.getMessage());
        }
        jSONObject.put(str, jSONObject2);
    }

    public static Object getInfoFromJsonobject(String str, String str2) throws JSONException {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (!jSONObject.has(str2)) {
                    return null;
                }
                Object obj = jSONObject.get(str2);
                if (obj instanceof String) {
                    return obj;
                }
            } catch (JSONException unused) {
                HMSLog.m8725e("JsonUtil", "getInfoFromJsonobject:parser json error :" + str2);
            }
        }
        return null;
    }

    public static int getIntValue(JSONObject jSONObject, String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return -1;
        }
        return jSONObject.getInt(str);
    }

    public static String getStringValue(JSONObject jSONObject, String str) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        return jSONObject.getString(str);
    }

    /* renamed from: h */
    public static void m8805h(final Field field, final boolean z10) {
        AccessController.doPrivileged(new PrivilegedAction() { // from class: com.huawei.hms.utils.JsonUtil.1
            @Override // java.security.PrivilegedAction
            public Object run() throws SecurityException {
                field.setAccessible(z10);
                return null;
            }
        });
    }

    /* renamed from: i */
    public static boolean m8806i(String str, Object obj, JSONObject jSONObject) throws JSONException {
        if (obj instanceof String) {
            jSONObject.put(str, (String) obj);
            return true;
        }
        if (obj instanceof Integer) {
            jSONObject.put(str, ((Integer) obj).intValue());
            return true;
        }
        if (obj instanceof Short) {
            jSONObject.put(str, (Short) obj);
            return true;
        }
        if (obj instanceof Long) {
            jSONObject.put(str, (Long) obj);
            return true;
        }
        if (obj instanceof Float) {
            jSONObject.put(str, (Float) obj);
            return true;
        }
        if (obj instanceof Double) {
            jSONObject.put(str, (Double) obj);
            return true;
        }
        if (obj instanceof Boolean) {
            jSONObject.put(str, (Boolean) obj);
            return true;
        }
        if (obj instanceof JSONObject) {
            jSONObject.put(str, (JSONObject) obj);
            return true;
        }
        if (obj instanceof byte[]) {
            m8804g(str, (byte[]) obj, jSONObject);
            return true;
        }
        if (obj instanceof List) {
            m8802e(str, (List) obj, jSONObject);
            return true;
        }
        if (obj instanceof Map) {
            m8803f(str, (Map) obj, jSONObject);
            return true;
        }
        if (obj instanceof InterfaceC7278e) {
            try {
                jSONObject.put(str, m8799b((InterfaceC7278e) obj));
                return true;
            } catch (IllegalAccessException e10) {
                HMSLog.m8725e("JsonUtil", "IllegalAccessException , " + e10);
            }
        }
        return false;
    }

    /* renamed from: j */
    public static byte[] m8807j(JSONObject jSONObject) {
        try {
            return Base64.decode(jSONObject.getString("_byte_"));
        } catch (IllegalArgumentException e10) {
            HMSLog.m8725e("JsonUtil", "readByte failed : " + e10.getMessage());
            return null;
        }
    }

    @Deprecated
    public static InterfaceC7278e jsonToEntity(String str, InterfaceC7278e interfaceC7278e) throws IllegalArgumentException {
        Class<? super Object> superclass;
        if (interfaceC7278e == null) {
            return null;
        }
        try {
            Class<?> cls = interfaceC7278e.getClass();
            JSONObject jSONObject = new JSONObject(str);
            while (cls != null) {
                Field[] declaredFields = cls.getDeclaredFields();
                if (declaredFields == null) {
                    superclass = cls.getSuperclass();
                } else {
                    for (Field field : declaredFields) {
                        if (field.isAnnotationPresent(InterfaceC9271a.class)) {
                            try {
                                m8801d(interfaceC7278e, field, jSONObject);
                            } catch (IllegalAccessException unused) {
                                HMSLog.m8725e("JsonUtil", "jsonToEntity, set value of the field exception, field name:" + field.getName());
                            }
                        }
                    }
                    superclass = cls.getSuperclass();
                }
                cls = superclass;
            }
        } catch (JSONException e10) {
            HMSLog.m8725e("JsonUtil", "catch JSONException when parse jsonString" + e10.getMessage());
        }
        return interfaceC7278e;
    }

    /* renamed from: k */
    public static Object m8808k(InterfaceC7278e interfaceC7278e, Field field, JSONObject jSONObject) throws JSONException {
        Object objM8798a = m8798a(field.getName(), jSONObject);
        if (objM8798a != null) {
            try {
                if (field.getType().getName().startsWith("com.huawei") && (field.getType().newInstance() instanceof InterfaceC7278e)) {
                    return jsonToEntity((String) objM8798a, (InterfaceC7278e) field.getType().newInstance());
                }
                if (!(objM8798a instanceof JSONObject) || !((JSONObject) objM8798a).has("_val_type_")) {
                    return objM8798a;
                }
                int i10 = ((JSONObject) objM8798a).getInt("_val_type_");
                if (i10 != 1 && i10 != 0) {
                    if (i10 == 2) {
                        return m8807j((JSONObject) objM8798a);
                    }
                    if (i10 == 3) {
                        return m8809l(field.getGenericType(), (JSONObject) objM8798a);
                    }
                    HMSLog.m8725e("JsonUtil", "cannot support type : " + i10);
                }
                return m8800c(field.getGenericType(), (JSONObject) objM8798a);
            } catch (InstantiationException unused) {
                HMSLog.m8725e("JsonUtil", "InstantiationException  ");
            }
        }
        return null;
    }

    /* renamed from: l */
    public static Map m8809l(Type type, JSONObject jSONObject) throws IllegalArgumentException {
        Class cls = (Class) ((ParameterizedType) type).getActualTypeArguments()[1];
        JSONArray jSONArray = new JSONArray(jSONObject.getString("_map_"));
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < jSONArray.length(); i10 += 2) {
            if (cls.newInstance() instanceof InterfaceC7278e) {
                map.put(jSONArray.get(i10), jsonToEntity(jSONArray.getString(i10 + 1), (InterfaceC7278e) cls.newInstance()));
            } else {
                map.put(jSONArray.get(i10), jSONArray.get(i10 + 1));
            }
        }
        return map;
    }
}
