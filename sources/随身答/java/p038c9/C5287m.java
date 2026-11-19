package p038c9;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import p038c9.InterfaceC5280f;
import p172l8.AbstractC8927z;

/* renamed from: c9.m */
/* loaded from: classes5.dex */
public final class C5287m extends InterfaceC5280f.a {

    /* renamed from: a */
    public static final InterfaceC5280f.a f2578a = new C5287m();

    /* renamed from: c9.m$a */
    public static final class a implements InterfaceC5280f {

        /* renamed from: a */
        public final InterfaceC5280f f2579a;

        public a(InterfaceC5280f interfaceC5280f) {
            this.f2579a = interfaceC5280f;
        }

        @Override // p038c9.InterfaceC5280f
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Optional convert(AbstractC8927z abstractC8927z) {
            return Optional.ofNullable(this.f2579a.convert(abstractC8927z));
        }
    }

    @Override // p038c9.InterfaceC5280f.a
    /* renamed from: d */
    public InterfaceC5280f mo2415d(Type type, Annotation[] annotationArr, C5299y c5299y) {
        if (InterfaceC5280f.a.m2448b(type) != Optional.class) {
            return null;
        }
        return new a(c5299y.m2533h(InterfaceC5280f.a.m2447a(0, (ParameterizedType) type), annotationArr));
    }
}
