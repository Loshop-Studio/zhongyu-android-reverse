package p062g0;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p055f0.C5501f;
import p055f0.C5510o;
import p055f0.InterfaceC5511p;
import p202y.C6763f;

/* renamed from: g0.b */
/* loaded from: classes2.dex */
public final class C5537b implements InterfaceC5511p {

    /* renamed from: b */
    public static final Set f8580b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a */
    public final InterfaceC5511p f8581a;

    public C5537b(InterfaceC5511p interfaceC5511p) {
        this.f8581a = interfaceC5511p;
    }

    @Override // p055f0.InterfaceC5511p
    /* renamed from: a */
    public final boolean mo4873a(Object obj) {
        return f8580b.contains(((Uri) obj).getScheme());
    }

    @Override // p055f0.InterfaceC5511p
    /* renamed from: b */
    public final C5510o mo4874b(Object obj, int i, int i8, C6763f c6763f) {
        return this.f8581a.mo4874b(new C5501f(((Uri) obj).toString()), i, i8, c6763f);
    }
}
