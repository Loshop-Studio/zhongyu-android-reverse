package p093e3;

import android.graphics.drawable.Drawable;
import com.xuexiang.xui.utils.AbstractC6802h;
import p212p4.C9321a;

/* renamed from: e3.a */
/* loaded from: classes4.dex */
public class C7842a {

    /* renamed from: c */
    public static volatile C7842a f13177c;

    /* renamed from: a */
    public C9321a f13178a = new C9321a();

    /* renamed from: b */
    public Drawable f13179b = AbstractC6802h.m6491c(AbstractC7843b.m12290a());

    /* renamed from: b */
    public static C7842a m12288b() {
        if (f13177c == null) {
            synchronized (C7842a.class) {
                try {
                    if (f13177c == null) {
                        f13177c = new C7842a();
                    }
                } finally {
                }
            }
        }
        return f13177c;
    }

    /* renamed from: a */
    public Drawable m12289a() {
        return this.f13179b;
    }
}
