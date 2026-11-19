package p200z5;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import p058f5.AbstractC6364e0;
import p200z5.InterfaceC7966h;

/* renamed from: z5.u */
/* loaded from: classes4.dex */
public final class C7980u extends InterfaceC7966h.a {

    /* renamed from: z5.u$a */
    public static final class a implements InterfaceC7966h {

        /* renamed from: a */
        public final InterfaceC7966h f10814a;

        public a(InterfaceC7966h interfaceC7966h) {
            this.f10814a = interfaceC7966h;
        }

        @Override // p200z5.InterfaceC7966h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Optional convert(AbstractC6364e0 abstractC6364e0) {
            return Optional.ofNullable(this.f10814a.convert(abstractC6364e0));
        }
    }

    @Override // p200z5.InterfaceC7966h.a
    /* renamed from: d */
    public InterfaceC7966h mo29d(Type type, Annotation[] annotationArr, C7959d0 c7959d0) {
        if (InterfaceC7966h.a.m9819b(type) != Optional.class) {
            return null;
        }
        return new a(c7959d0.m9799h(InterfaceC7966h.a.m9818a(0, (ParameterizedType) type), annotationArr));
    }
}
