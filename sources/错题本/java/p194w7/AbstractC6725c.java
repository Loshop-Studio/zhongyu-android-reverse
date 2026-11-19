package p194w7;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.collections.AbstractC5785e0;
import okhttp3.C6338z;
import p153r7.C6481c;
import p178u7.AbstractC6632f;

/* renamed from: w7.c */
/* loaded from: classes4.dex */
public abstract class AbstractC6725c {

    /* renamed from: a */
    public static final CopyOnWriteArraySet f11342a = new CopyOnWriteArraySet();

    /* renamed from: b */
    public static final Map f11343b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = C6338z.class.getPackage();
        String name = r22 != null ? r22.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(C6338z.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(AbstractC6632f.class.getName(), "okhttp.Http2");
        linkedHashMap.put(C6481c.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f11343b = AbstractC5785e0.m5156J(linkedHashMap);
    }
}
