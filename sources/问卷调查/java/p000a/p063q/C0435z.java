package p000a.p063q;

import android.view.View;
import android.view.ViewGroup;
import io.github.inflationx.calligraphy3.C1088R;
import java.util.ArrayList;
import p000a.p063q.AbstractC0417h;

/* renamed from: a.q.z */
/* loaded from: classes.dex */
public class C0435z extends C0420k {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f2473a;

    /* renamed from: b */
    public final /* synthetic */ View f2474b;

    /* renamed from: c */
    public final /* synthetic */ View f2475c;

    /* renamed from: d */
    public final /* synthetic */ AbstractC0408a0 f2476d;

    public C0435z(AbstractC0408a0 abstractC0408a0, ViewGroup viewGroup, View view, View view2) {
        this.f2476d = abstractC0408a0;
        this.f2473a = viewGroup;
        this.f2474b = view;
        this.f2475c = view2;
    }

    @Override // p000a.p063q.AbstractC0417h.d
    /* renamed from: c */
    public void mo1434c(AbstractC0417h abstractC0417h) {
        this.f2475c.setTag(C1088R.id.save_overlay_view, null);
        this.f2473a.getOverlay().remove(this.f2474b);
        abstractC0417h.mo1467v(this);
    }

    @Override // p000a.p063q.C0420k, p000a.p063q.AbstractC0417h.d
    /* renamed from: d */
    public void mo1435d(AbstractC0417h abstractC0417h) {
        this.f2473a.getOverlay().remove(this.f2474b);
    }

    @Override // p000a.p063q.C0420k, p000a.p063q.AbstractC0417h.d
    /* renamed from: e */
    public void mo1436e(AbstractC0417h abstractC0417h) {
        if (this.f2474b.getParent() == null) {
            this.f2473a.getOverlay().add(this.f2474b);
            return;
        }
        AbstractC0408a0 abstractC0408a0 = this.f2476d;
        int size = abstractC0408a0.f2423n.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else {
                abstractC0408a0.f2423n.get(size).cancel();
            }
        }
        ArrayList<AbstractC0417h.d> arrayList = abstractC0408a0.f2427r;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) abstractC0408a0.f2427r.clone();
        int size2 = arrayList2.size();
        for (int i = 0; i < size2; i++) {
            ((AbstractC0417h.d) arrayList2.get(i)).mo1433b(abstractC0408a0);
        }
    }
}
