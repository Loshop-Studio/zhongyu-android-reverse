package p000a.p052k.p053b;

import android.view.View;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;

/* renamed from: a.k.b.w0 */
/* loaded from: classes.dex */
public class RunnableC0341w0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ArrayList f2112b;

    /* renamed from: c */
    public final /* synthetic */ Map f2113c;

    public RunnableC0341w0(AbstractC0337u0 abstractC0337u0, ArrayList arrayList, Map map) {
        this.f2112b = arrayList;
        this.f2113c = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        int size = this.f2112b.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f2112b.get(i);
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            view.setTransitionName((String) this.f2113c.get(view.getTransitionName()));
        }
    }
}
