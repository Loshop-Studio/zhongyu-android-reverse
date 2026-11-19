package p108d0;

import android.app.NotificationManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p124e0.C9061a;

/* renamed from: d0.a */
/* loaded from: classes3.dex */
public class C8899a {

    /* renamed from: a */
    public static C8899a f20854a;

    /* renamed from: b */
    public static List f20855b;

    /* renamed from: c */
    public static final ConcurrentHashMap f20856c = new ConcurrentHashMap();

    public C8899a() {
        f20855b = new ArrayList();
    }

    /* renamed from: a */
    public static C8899a m17429a() {
        if (f20854a == null) {
            f20854a = new C8899a();
        }
        return f20854a;
    }

    /* renamed from: b */
    public void m17430b(int i10) {
        f20855b.add(Integer.valueOf(i10));
    }

    /* renamed from: c */
    public void m17431c(Context context) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        while (!f20855b.isEmpty()) {
            notificationManager.cancel(((Integer) f20855b.get(r0.size() - 1)).intValue());
            f20855b.remove(r0.size() - 1);
        }
        m17434f();
    }

    /* renamed from: d */
    public void m17432d(String str) {
        ConcurrentHashMap concurrentHashMap = f20856c;
        List list = (List) concurrentHashMap.get(str);
        if (list != null) {
            list.clear();
            concurrentHashMap.remove(str);
        }
    }

    /* renamed from: e */
    public void m17433e(String str, C9061a c9061a) {
        ConcurrentHashMap concurrentHashMap = f20856c;
        List list = (List) concurrentHashMap.get(str);
        if (list != null && !list.isEmpty()) {
            list.add(c9061a);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(c9061a);
        concurrentHashMap.put(str, arrayList);
    }

    /* renamed from: f */
    public final void m17434f() {
        ConcurrentHashMap concurrentHashMap = f20856c;
        if (concurrentHashMap.isEmpty()) {
            return;
        }
        try {
            Iterator it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                List list = (List) ((Map.Entry) it.next()).getValue();
                if (list != null) {
                    list.clear();
                }
            }
            f20856c.clear();
        } catch (Exception unused) {
        }
    }
}
