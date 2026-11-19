package p070b.p074b.p075a.p076a.p101w;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.Iterator;
import java.util.List;
import p070b.p074b.p075a.p076a.p100v.C0667a;
import p070b.p074b.p075a.p076a.p101w.C0681m;

/* renamed from: b.b.a.a.w.l */
/* loaded from: classes.dex */
public class C0680l extends C0681m.f {

    /* renamed from: b */
    public final /* synthetic */ List f4078b;

    /* renamed from: c */
    public final /* synthetic */ Matrix f4079c;

    public C0680l(C0681m c0681m, List list, Matrix matrix) {
        this.f4078b = list;
        this.f4079c = matrix;
    }

    @Override // p070b.p074b.p075a.p076a.p101w.C0681m.f
    /* renamed from: a */
    public void mo2317a(Matrix matrix, C0667a c0667a, int i, Canvas canvas) {
        Iterator it = this.f4078b.iterator();
        while (it.hasNext()) {
            ((C0681m.f) it.next()).mo2317a(this.f4079c, c0667a, i, canvas);
        }
    }
}
