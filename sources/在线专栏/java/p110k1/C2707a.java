package p110k1;

import android.app.NotificationManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p115l1.C2834a;

/* renamed from: k1.a */
/* loaded from: classes.dex */
public class C2707a {

    /* renamed from: a */
    private static C2707a f10692a;

    /* renamed from: b */
    private static List<Integer> f10693b;

    /* renamed from: c */
    private static final ConcurrentHashMap<String, List<C2834a>> f10694c = new ConcurrentHashMap<>();

    private C2707a() {
        f10693b = new ArrayList();
    }

    /* renamed from: a */
    public static C2707a m9029a() {
        if (f10692a == null) {
            f10692a = new C2707a();
        }
        return f10692a;
    }

    /* renamed from: f */
    private void m9030f() {
        ConcurrentHashMap<String, List<C2834a>> concurrentHashMap = f10694c;
        if (concurrentHashMap.isEmpty()) {
            return;
        }
        try {
            Iterator<Map.Entry<String, List<C2834a>>> it = concurrentHashMap.entrySet().iterator();
            while (it.hasNext()) {
                List<C2834a> value = it.next().getValue();
                if (value != null) {
                    value.clear();
                }
            }
            f10694c.clear();
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public void m9031b(int i4) {
        f10693b.add(Integer.valueOf(i4));
    }

    /* renamed from: c */
    public void m9032c(Context context) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        while (!f10693b.isEmpty()) {
            notificationManager.cancel(f10693b.get(r0.size() - 1).intValue());
            f10693b.remove(r0.size() - 1);
        }
        m9030f();
    }

    /* renamed from: d */
    public void m9033d(String str) {
        ConcurrentHashMap<String, List<C2834a>> concurrentHashMap = f10694c;
        List<C2834a> list = concurrentHashMap.get(str);
        if (list != null) {
            list.clear();
            concurrentHashMap.remove(str);
        }
    }

    /* renamed from: e */
    public void m9034e(String str, C2834a c2834a) {
        ConcurrentHashMap<String, List<C2834a>> concurrentHashMap = f10694c;
        List<C2834a> list = concurrentHashMap.get(str);
        if (list != null && !list.isEmpty()) {
            list.add(c2834a);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(c2834a);
        concurrentHashMap.put(str, arrayList);
    }
}
