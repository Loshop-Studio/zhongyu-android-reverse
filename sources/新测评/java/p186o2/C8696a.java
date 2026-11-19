package p186o2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.xuexiang.xui.utils.AbstractC6483h;
import p304z3.C9976a;

/* renamed from: o2.a */
/* loaded from: classes4.dex */
public class C8696a {

    /* renamed from: c */
    public static volatile C8696a f14462c;

    /* renamed from: a */
    public C9976a f14463a;

    /* renamed from: b */
    public Drawable f14464b;

    public C8696a(Context context) {
        this.f14463a = new C9976a(context);
        this.f14464b = AbstractC6483h.m5394c(context);
    }

    /* renamed from: b */
    public static C8696a m14297b(Context context) {
        if (f14462c == null) {
            synchronized (C8696a.class) {
                try {
                    if (f14462c == null) {
                        f14462c = new C8696a(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f14462c;
    }

    /* renamed from: a */
    public Drawable m14298a() {
        return this.f14464b;
    }
}
