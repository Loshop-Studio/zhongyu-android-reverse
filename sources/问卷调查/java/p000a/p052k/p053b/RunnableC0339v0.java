package p000a.p052k.p053b;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;

/* renamed from: a.k.b.v0 */
/* loaded from: classes.dex */
public class RunnableC0339v0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ArrayList f2106b;

    /* renamed from: c */
    public final /* synthetic */ Map f2107c;

    public RunnableC0339v0(AbstractC0337u0 abstractC0337u0, ArrayList arrayList, Map map) {
        this.f2106b = arrayList;
        this.f2107c = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        int size = this.f2106b.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f2106b.get(i);
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            String transitionName = view.getTransitionName();
            if (transitionName != null) {
                Iterator it = this.f2107c.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (transitionName.equals(entry.getValue())) {
                        str = (String) entry.getKey();
                        break;
                    }
                }
                view.setTransitionName(str);
            }
        }
    }
}
