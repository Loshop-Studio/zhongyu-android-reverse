package p000a.p052k.p053b;

import android.view.View;
import java.util.ArrayList;

/* renamed from: a.k.b.p0 */
/* loaded from: classes.dex */
public class RunnableC0327p0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Object f2035b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC0337u0 f2036c;

    /* renamed from: d */
    public final /* synthetic */ View f2037d;

    /* renamed from: e */
    public final /* synthetic */ ComponentCallbacksC0320m f2038e;

    /* renamed from: f */
    public final /* synthetic */ ArrayList f2039f;

    /* renamed from: g */
    public final /* synthetic */ ArrayList f2040g;

    /* renamed from: h */
    public final /* synthetic */ ArrayList f2041h;

    /* renamed from: i */
    public final /* synthetic */ Object f2042i;

    public RunnableC0327p0(Object obj, AbstractC0337u0 abstractC0337u0, View view, ComponentCallbacksC0320m componentCallbacksC0320m, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
        this.f2035b = obj;
        this.f2036c = abstractC0337u0;
        this.f2037d = view;
        this.f2038e = componentCallbacksC0320m;
        this.f2039f = arrayList;
        this.f2040g = arrayList2;
        this.f2041h = arrayList3;
        this.f2042i = obj2;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj = this.f2035b;
        if (obj != null) {
            this.f2036c.mo1224o(obj, this.f2037d);
            this.f2040g.addAll(C0333s0.m1207h(this.f2036c, this.f2035b, this.f2038e, this.f2039f, this.f2037d));
        }
        if (this.f2041h != null) {
            if (this.f2042i != null) {
                ArrayList<View> arrayList = new ArrayList<>();
                arrayList.add(this.f2037d);
                this.f2036c.mo1225p(this.f2042i, this.f2041h, arrayList);
            }
            this.f2041h.clear();
            this.f2041h.add(this.f2037d);
        }
    }
}
