package com.tendcloud.tenddata;

import com.tendcloud.tenddata.C8022zz;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* renamed from: com.tendcloud.tenddata.ds */
/* loaded from: classes5.dex */
public class C7941ds {

    /* renamed from: a */
    private static volatile C7941ds f14769a;

    static {
        try {
            C7913cr.m11625a().register(m11778a());
        } catch (Throwable unused) {
        }
    }

    private C7941ds() {
    }

    /* renamed from: a */
    public static C7941ds m11778a() {
        if (f14769a == null) {
            synchronized (C7941ds.class) {
                try {
                    if (f14769a == null) {
                        f14769a = new C7941ds();
                    }
                } finally {
                }
            }
        }
        return f14769a;
    }

    public final void onTDEBEventAppEvent(C8022zz.a aVar) {
        if (aVar != null) {
            try {
                HashMap<String, Object> map = aVar.paraMap;
                if (map != null && Integer.parseInt(String.valueOf(map.get("apiType"))) == 2) {
                    AbstractC7841a abstractC7841a = (AbstractC7841a) aVar.paraMap.get("service");
                    TreeMap treeMap = new TreeMap();
                    String strValueOf = String.valueOf(aVar.paraMap.get("eventId"));
                    Object obj = aVar.paraMap.get("value");
                    Map<String, Object> map2 = C7843ab.f14304d;
                    if (map2.size() > 0) {
                        treeMap.putAll(map2);
                    }
                    Object obj2 = aVar.paraMap.get("map");
                    if (obj2 != null && (obj2 instanceof Map)) {
                        treeMap.putAll((Map) obj2);
                    }
                    C7961el c7961el = new C7961el();
                    c7961el.f14869b = "appEvent";
                    c7961el.f14870c = strValueOf;
                    c7961el.f14868a = abstractC7841a;
                    TreeMap treeMap2 = new TreeMap();
                    Object obj3 = aVar.paraMap.get("eventLabel");
                    if (obj3 != null) {
                        treeMap2.put("eventLabel", String.valueOf(obj3));
                    }
                    treeMap2.put("eventParam", new JSONObject(m11779a(treeMap)));
                    if (obj instanceof Double) {
                        treeMap2.put("value", obj);
                    }
                    Object obj4 = aVar.paraMap.get("eventValue");
                    if (obj4 != null) {
                        treeMap2.put("eventValue", obj4);
                    }
                    c7961el.f14871d = treeMap2;
                    C7913cr.m11625a().post(c7961el);
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* renamed from: a */
    private Map<String, Object> m11779a(Map<String, Object> map) {
        TreeMap treeMap = new TreeMap();
        if (map != null) {
            try {
                if (map.size() != 0) {
                    int i10 = 0;
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        if (entry.getValue() instanceof Number) {
                            treeMap.put(entry.getKey(), entry.getValue());
                        } else {
                            treeMap.put(C7912cq.m11588a(String.valueOf(entry.getKey())), C7912cq.m11588a(String.valueOf(entry.getValue())));
                        }
                        i10++;
                        if (i10 == 50) {
                            break;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return treeMap;
    }
}
