package p055f0;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p202y.C6763f;

/* renamed from: f0.e0 */
/* loaded from: classes2.dex */
public final class C5500e0 implements InterfaceC5511p {

    /* renamed from: b */
    public static final Set f8507b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a */
    public final InterfaceC5511p f8508a;

    public C5500e0(InterfaceC5511p interfaceC5511p) {
        this.f8508a = interfaceC5511p;
    }

    @Override // p055f0.InterfaceC5511p
    /* renamed from: a */
    public final boolean mo4873a(Object obj) {
        return f8507b.contains(((Uri) obj).getScheme());
    }

    @Override // p055f0.InterfaceC5511p
    /* renamed from: b */
    public final C5510o mo4874b(Object obj, int i, int i8, C6763f c6763f) {
        return this.f8508a.mo4874b(new C5501f(((Uri) obj).toString()), i, i8, c6763f);
    }
}
