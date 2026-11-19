package p318r5;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: r5.i */
/* loaded from: classes5.dex */
public abstract class AbstractC10868i {
    /* renamed from: a */
    public static Map m23472a(Context context, String str) {
        if (context == null) {
            return null;
        }
        Map mapM23519c = AbstractC10877l.m23519c(context, str);
        m23478g(mapM23519c);
        return m23474c(mapM23519c);
    }

    /* renamed from: b */
    public static Map m23473b(Context context, String str, String str2) {
        Map mapM23472a;
        Map mapM23472a2;
        int iM23680o = AbstractC10900v0.m23680o() * 1048576;
        if (AbstractC10865h.m23462c(context, "cached_v2_1", iM23680o)) {
            AbstractC10861f1.m23441m("hmsSdk", "cached event reach max size, delete it");
            AbstractC10877l.m23520d(context, "cached_v2_1", new String[0]);
        }
        if (AbstractC10865h.m23462c(context, "stat_v2_1", iM23680o)) {
            AbstractC10861f1.m23441m("hmsSdk", "stat event reach max size, delete it");
            AbstractC10877l.m23520d(context, "stat_v2_1", new String[0]);
        }
        if ("alltype".equals(str2) || TextUtils.isEmpty(str)) {
            AbstractC10861f1.m23430b("hmsSdk", "read all event records");
            mapM23472a = m23472a(context, "stat_v2_1");
            mapM23472a2 = m23472a(context, "cached_v2_1");
        } else {
            String strM23581d = AbstractC10886o0.m23581d(str, str2);
            mapM23472a = m23477f(context, "stat_v2_1", strM23581d);
            mapM23472a2 = m23477f(context, "cached_v2_1", strM23581d);
        }
        return m23475d(mapM23472a, mapM23472a2);
    }

    /* renamed from: c */
    public static Map m23474c(Map map) {
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (entry.getValue() instanceof String) {
                m23476e(str, (String) entry.getValue(), map2);
            }
        }
        return map2;
    }

    /* renamed from: d */
    public static Map m23475d(Map map, Map map2) {
        if (map.size() == 0 && map2.size() == 0) {
            return new HashMap();
        }
        if (map.size() == 0) {
            return map2;
        }
        if (map2.size() == 0) {
            return map;
        }
        HashMap map3 = new HashMap(map);
        map3.putAll(map2);
        return map3;
    }

    /* renamed from: e */
    public static void m23476e(String str, String str2, Map map) {
        ArrayList arrayList = new ArrayList();
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            JSONArray jSONArray = new JSONArray(str2);
            if (jSONArray.length() == 0) {
                return;
            }
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                C10859f c10859f = new C10859f();
                try {
                    c10859f.m23414c(jSONArray.getJSONObject(i10));
                    arrayList.add(c10859f);
                } catch (JSONException unused) {
                    AbstractC10861f1.m23440l("hmsSdk", "JSON Exception happened when create data for report - readDataToRecord");
                }
            }
            map.put(str, arrayList);
        } catch (JSONException unused2) {
            AbstractC10861f1.m23440l("hmsSdk", "When events turn to JSONArray,JSON Exception has happened");
        }
    }

    /* renamed from: f */
    public static Map m23477f(Context context, String str, String str2) {
        String strM23518b = AbstractC10877l.m23518b(context, str, str2, "");
        HashMap map = new HashMap();
        m23476e(str2, strM23518b, map);
        return map;
    }

    /* renamed from: g */
    public static void m23478g(Map map) {
        Iterator it = map.entrySet().iterator();
        Set setM23583f = AbstractC10886o0.m23583f(AbstractC10900v0.m23668c());
        while (it.hasNext()) {
            if (!setM23583f.contains(((Map.Entry) it.next()).getKey())) {
                it.remove();
            }
        }
    }
}
