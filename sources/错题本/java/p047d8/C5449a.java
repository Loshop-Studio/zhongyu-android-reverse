package p047d8;

import com.google.gson.C3841g;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p095k1.C5752a;
import p129o2.C6268a;
import retrofit2.AbstractC6504l;
import retrofit2.C6513p0;
import retrofit2.InterfaceC6506m;

/* renamed from: d8.a */
/* loaded from: classes4.dex */
public final class C5449a extends AbstractC6504l {

    /* renamed from: a */
    public final C3841g f8413a;

    public C5449a(C3841g c3841g) {
        this.f8413a = c3841g;
    }

    @Override // retrofit2.AbstractC6504l
    /* renamed from: a */
    public final InterfaceC6506m mo4819a(Type type) {
        C5752a c5752a = new C5752a(type);
        C3841g c3841g = this.f8413a;
        return new C5450b(c3841g, c3841g.m2785d(c5752a));
    }

    @Override // retrofit2.AbstractC6504l
    /* renamed from: b */
    public final InterfaceC6506m mo4820b(Type type, Annotation[] annotationArr, C6513p0 c6513p0) {
        C5752a c5752a = new C5752a(type);
        C3841g c3841g = this.f8413a;
        return new C6268a(c3841g, c3841g.m2785d(c5752a));
    }
}
