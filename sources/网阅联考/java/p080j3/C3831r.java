package p080j3;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import p080j3.InterfaceC3821i;
import p117r2.AbstractC4498b0;

/* renamed from: j3.r */
/* loaded from: classes2.dex */
public final class C3831r extends InterfaceC3821i.a {

    /* renamed from: a */
    public static final InterfaceC3821i.a f4687a = new C3831r();

    /* renamed from: j3.r$a */
    public static final class a implements InterfaceC3821i {

        /* renamed from: a */
        public final InterfaceC3821i f4688a;

        public a(InterfaceC3821i interfaceC3821i) {
            this.f4688a = interfaceC3821i;
        }

        @Override // p080j3.InterfaceC3821i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Optional mo4967a(AbstractC4498b0 abstractC4498b0) {
            return Optional.ofNullable(this.f4688a.mo4967a(abstractC4498b0));
        }
    }

    @Override // p080j3.InterfaceC3821i.a
    /* renamed from: d */
    public InterfaceC3821i mo4966d(Type type, Annotation[] annotationArr, C3814e0 c3814e0) {
        if (InterfaceC3821i.a.m5051b(type) != AbstractC3829p.m5094a()) {
            return null;
        }
        return new a(c3814e0.m5033h(InterfaceC3821i.a.m5050a(0, (ParameterizedType) type), annotationArr));
    }
}
