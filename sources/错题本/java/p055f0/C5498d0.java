package p055f0;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p172u0.C6610b;
import p202y.C6763f;
import p208z.C6796a;
import p208z.C6808m;
import p208z.InterfaceC6800e;

/* renamed from: f0.d0 */
/* loaded from: classes2.dex */
public final class C5498d0 implements InterfaceC5511p {

    /* renamed from: b */
    public static final Set f8505b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));

    /* renamed from: a */
    public final Object f8506a;

    public C5498d0(C5496c0 c5496c0) {
        this.f8506a = c5496c0;
    }

    @Override // p055f0.InterfaceC5511p
    /* renamed from: a */
    public final boolean mo4873a(Object obj) {
        return f8505b.contains(((Uri) obj).getScheme());
    }

    @Override // p055f0.InterfaceC5511p
    /* renamed from: b */
    public final C5510o mo4874b(Object obj, int i, int i8, C6763f c6763f) {
        InterfaceC6800e c6796a;
        Uri uri = (Uri) obj;
        C6610b c6610b = new C6610b(uri);
        C5496c0 c5496c0 = (C5496c0) this.f8506a;
        switch (c5496c0.f8501a) {
            case 0:
                c6796a = new C6796a(uri, c5496c0.f8502b, 0);
                break;
            case 1:
                c6796a = new C6796a(uri, c5496c0.f8502b, 1);
                break;
            default:
                c6796a = new C6808m(1, uri, c5496c0.f8502b);
                break;
        }
        return new C5510o(c6610b, c6796a);
    }
}
