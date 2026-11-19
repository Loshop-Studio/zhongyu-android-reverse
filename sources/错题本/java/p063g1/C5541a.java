package p063g1;

import com.google.gson.AbstractC3869p;
import com.google.gson.C3841g;
import com.google.gson.InterfaceC3870q;
import com.google.gson.internal.AbstractC3848e;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import p095k1.C5752a;

/* renamed from: g1.a */
/* loaded from: classes2.dex */
public class C5541a implements InterfaceC3870q {
    @Override // com.google.gson.InterfaceC3870q
    /* renamed from: c */
    public final AbstractC3869p mo2798c(C3841g c3841g, C5752a c5752a) {
        Type type = c5752a.f9104b;
        boolean z8 = type instanceof GenericArrayType;
        if (!z8 && (!(type instanceof Class) || !((Class) type).isArray())) {
            return null;
        }
        Type genericComponentType = z8 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
        return new C5544b(c3841g, c3841g.m2785d(new C5752a(genericComponentType)), AbstractC3848e.m2807h(genericComponentType));
    }
}
