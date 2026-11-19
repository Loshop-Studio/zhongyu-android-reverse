package p168e.p169q.p174g.p175i;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Logger;
import p160d.p161e.C1002h;
import p160d.p162f.p164b.C1011d;
import p168e.C1041n;
import p168e.p169q.p171d.C1049c;
import p168e.p169q.p173f.C1051a;

/* renamed from: e.q.g.i.c */
/* loaded from: classes.dex */
public final class C1062c {

    /* renamed from: a */
    public static final CopyOnWriteArraySet<Logger> f5630a = new CopyOnWriteArraySet<>();

    /* renamed from: b */
    public static final Map<String, String> f5631b;

    /* renamed from: c */
    public static final C1062c f5632c = null;

    static {
        Map<String, String> mapSingletonMap;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r1 = C1041n.class.getPackage();
        String name = r1 != null ? r1.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = C1041n.class.getName();
        C1011d.m2808d(name2, "OkHttpClient::class.java.name");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = C1051a.class.getName();
        C1011d.m2808d(name3, "Http2::class.java.name");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = C1049c.class.getName();
        C1011d.m2808d(name4, "TaskRunner::class.java.name");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        C1011d.m2809e(linkedHashMap, "$this$toMap");
        int size = linkedHashMap.size();
        if (size == 0) {
            mapSingletonMap = C1002h.f5479b;
        } else if (size != 1) {
            C1011d.m2809e(linkedHashMap, "$this$toMutableMap");
            mapSingletonMap = new LinkedHashMap<>(linkedHashMap);
        } else {
            C1011d.m2809e(linkedHashMap, "$this$toSingletonMap");
            Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
            mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
            C1011d.m2808d(mapSingletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        }
        f5631b = mapSingletonMap;
    }
}
