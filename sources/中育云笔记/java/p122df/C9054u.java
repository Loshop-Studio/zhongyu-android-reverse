package p122df;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import je.AbstractC9746z;
import p122df.InterfaceC9040h;

/* renamed from: df.u */
/* loaded from: classes6.dex */
public final class C9054u extends InterfaceC9040h.a {

    /* renamed from: df.u$a */
    public static final class a implements InterfaceC9040h {

        /* renamed from: a */
        public final InterfaceC9040h f21162a;

        public a(InterfaceC9040h interfaceC9040h) {
            this.f21162a = interfaceC9040h;
        }

        @Override // p122df.InterfaceC9040h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Optional convert(AbstractC9746z abstractC9746z) {
            return Optional.ofNullable(this.f21162a.convert(abstractC9746z));
        }
    }

    @Override // p122df.InterfaceC9040h.a
    public InterfaceC9040h responseBodyConverter(Type type, Annotation[] annotationArr, C9033d0 c9033d0) {
        if (InterfaceC9040h.a.getRawType(type) != Optional.class) {
            return null;
        }
        return new a(c9033d0.m17718h(InterfaceC9040h.a.getParameterUpperBound(0, (ParameterizedType) type), annotationArr));
    }
}
