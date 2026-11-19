package p126p1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.xuexiang.xui.utils.AbstractC5860h;
import p162u2.C7768a;

/* renamed from: p1.a */
/* loaded from: classes3.dex */
public class C7590a {

    /* renamed from: c */
    public static volatile C7590a f10048c;

    /* renamed from: a */
    public C7768a f10049a;

    /* renamed from: b */
    public Drawable f10050b;

    public C7590a(Context context) {
        this.f10049a = new C7768a(context);
        this.f10050b = AbstractC5860h.m4400d(context);
    }

    /* renamed from: b */
    public static C7590a m8996b(Context context) {
        if (f10048c == null) {
            synchronized (C7590a.class) {
                try {
                    if (f10048c == null) {
                        f10048c = new C7590a(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f10048c;
    }

    /* renamed from: a */
    public Drawable m8997a() {
        return this.f10050b;
    }
}
