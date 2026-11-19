package retrofit2;

import android.support.v4.media.C0039h;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* renamed from: retrofit2.o */
/* loaded from: classes4.dex */
public final class C6510o extends AbstractC6492f {

    /* renamed from: a */
    public final Executor f10764a;

    public C6510o(Executor executor) {
        this.f10764a = executor;
    }

    @Override // retrofit2.AbstractC6492f
    /* renamed from: a */
    public final InterfaceC6494g mo2174a(Type type, Annotation[] annotationArr) {
        if (AbstractC6522v.m6166h(type) != InterfaceC6490e.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new C0039h(26, AbstractC6522v.m6165g(0, (ParameterizedType) type), false, AbstractC6522v.m6170l(annotationArr, SkipCallbackExecutor.class) ? null : this.f10764a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
