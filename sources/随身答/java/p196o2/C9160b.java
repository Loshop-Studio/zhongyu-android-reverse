package p196o2;

import android.content.Context;

/* renamed from: o2.b */
/* loaded from: classes4.dex */
public class C9160b {

    /* renamed from: c */
    public static C9160b f15472c;

    /* renamed from: a */
    public Context f15473a;

    /* renamed from: b */
    public C9161c f15474b;

    public C9160b(Context context) {
        this.f15473a = context;
        this.f15474b = new C9161c(context);
    }

    /* renamed from: a */
    public static synchronized C9160b m14737a(Context context) {
        try {
            if (f15472c == null) {
                f15472c = new C9160b(context.getApplicationContext());
            }
        } catch (Throwable th) {
            throw th;
        }
        return f15472c;
    }

    /* renamed from: b */
    public C9161c m14738b() {
        return this.f15474b;
    }
}
