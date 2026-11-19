package ca;

import ca.InterfaceC5290h;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import p136i9.AbstractC8905e0;

/* renamed from: ca.u */
/* loaded from: classes5.dex */
public final class C5304u extends InterfaceC5290h.a {

    /* renamed from: ca.u$a */
    public static final class a implements InterfaceC5290h {

        /* renamed from: a */
        public final InterfaceC5290h f2553a;

        public a(InterfaceC5290h interfaceC5290h) {
            this.f2553a = interfaceC5290h;
        }

        @Override // ca.InterfaceC5290h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Optional convert(AbstractC8905e0 abstractC8905e0) {
            return Optional.ofNullable(this.f2553a.convert(abstractC8905e0));
        }
    }

    @Override // ca.InterfaceC5290h.a
    /* renamed from: d */
    public InterfaceC5290h mo2220d(Type type, Annotation[] annotationArr, C5283d0 c5283d0) {
        if (InterfaceC5290h.a.m2279b(type) != Optional.class) {
            return null;
        }
        return new a(c5283d0.m2257h(InterfaceC5290h.a.m2278a(0, (ParameterizedType) type), annotationArr));
    }
}
