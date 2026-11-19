package p226r9;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import p011a9.AbstractC0063z;
import p226r9.InterfaceC9066h;

/* renamed from: r9.u */
/* loaded from: classes5.dex */
public final class C9080u extends InterfaceC9066h.a {

    /* renamed from: r9.u$a */
    public static final class a implements InterfaceC9066h {

        /* renamed from: a */
        public final InterfaceC9066h f15659a;

        public a(InterfaceC9066h interfaceC9066h) {
            this.f15659a = interfaceC9066h;
        }

        @Override // p226r9.InterfaceC9066h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Optional convert(AbstractC0063z abstractC0063z) {
            return Optional.ofNullable(this.f15659a.convert(abstractC0063z));
        }
    }

    @Override // p226r9.InterfaceC9066h.a
    /* renamed from: d */
    public InterfaceC9066h mo15219d(Type type, Annotation[] annotationArr, C9059d0 c9059d0) {
        if (InterfaceC9066h.a.m15277b(type) != Optional.class) {
            return null;
        }
        return new a(c9059d0.m15255h(InterfaceC9066h.a.m15276a(0, (ParameterizedType) type), annotationArr));
    }
}
