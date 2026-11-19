package p150k1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.xuexiang.xui.utils.AbstractC6878h;
import p251t2.C10089a;

/* renamed from: k1.a */
/* loaded from: classes4.dex */
public class C9050a {

    /* renamed from: c */
    public static volatile C9050a f17316c;

    /* renamed from: a */
    public C10089a f17317a;

    /* renamed from: b */
    public Drawable f17318b;

    public C9050a(Context context) {
        this.f17317a = new C10089a(context);
        this.f17318b = AbstractC6878h.m6493d(context);
    }

    /* renamed from: b */
    public static C9050a m15844b(Context context) {
        if (f17316c == null) {
            synchronized (C9050a.class) {
                try {
                    if (f17316c == null) {
                        f17316c = new C9050a(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f17316c;
    }

    /* renamed from: a */
    public Drawable m15845a() {
        return this.f17318b;
    }
}
