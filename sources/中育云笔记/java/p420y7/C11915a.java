package p420y7;

import android.graphics.drawable.Drawable;
import com.xuexiang.xui.utils.AbstractC8042h;
import p207j9.C9689a;

/* renamed from: y7.a */
/* loaded from: classes5.dex */
public class C11915a {

    /* renamed from: c */
    public static volatile C11915a f28230c;

    /* renamed from: a */
    public C9689a f28231a = new C9689a();

    /* renamed from: b */
    public Drawable f28232b = AbstractC8042h.m12228b(AbstractC11916b.m26458b());

    /* renamed from: b */
    public static C11915a m26454b() {
        if (f28230c == null) {
            synchronized (C11915a.class) {
                try {
                    if (f28230c == null) {
                        f28230c = new C11915a();
                    }
                } finally {
                }
            }
        }
        return f28230c;
    }

    /* renamed from: a */
    public Drawable m26455a() {
        return this.f28232b;
    }

    /* renamed from: c */
    public C9689a m26456c() {
        return this.f28231a;
    }
}
