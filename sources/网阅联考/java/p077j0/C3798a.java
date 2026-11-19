package p077j0;

import android.graphics.drawable.Drawable;
import com.xuexiang.xui.utils.AbstractC3532g;
import p083k1.C3858a;

/* renamed from: j0.a */
/* loaded from: classes2.dex */
public class C3798a {

    /* renamed from: c */
    public static volatile C3798a f4544c;

    /* renamed from: a */
    public C3858a f4545a = new C3858a();

    /* renamed from: b */
    public Drawable f4546b = AbstractC3532g.m4081c(AbstractC3799b.m4958a());

    /* renamed from: b */
    public static C3798a m4956b() {
        if (f4544c == null) {
            synchronized (C3798a.class) {
                if (f4544c == null) {
                    f4544c = new C3798a();
                }
            }
        }
        return f4544c;
    }

    /* renamed from: a */
    public Drawable m4957a() {
        return this.f4546b;
    }
}
