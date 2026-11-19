package p032c8;

import io.reactivex.internal.operators.observable.C5707c;
import io.reactivex.internal.operators.observable.C5711g;
import io.reactivex.internal.operators.observable.C5712h;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import p145q5.AbstractC6431b;
import p145q5.AbstractC6434e;
import retrofit2.AbstractC6492f;
import retrofit2.AbstractC6522v;
import retrofit2.C6500j;
import retrofit2.C6509n0;
import retrofit2.InterfaceC6494g;

/* renamed from: c8.e */
/* loaded from: classes4.dex */
public final class C3240e extends AbstractC6492f {

    /* renamed from: a */
    public final /* synthetic */ int f1812a;

    public /* synthetic */ C3240e(int i) {
        this.f1812a = i;
    }

    @Override // retrofit2.AbstractC6492f
    /* renamed from: a */
    public final InterfaceC6494g mo2174a(Type type, Annotation[] annotationArr) {
        Type typeM6165g;
        boolean z8;
        boolean z9;
        C6500j c6500j;
        switch (this.f1812a) {
            case 0:
                Class clsM6166h = AbstractC6522v.m6166h(type);
                if (clsM6166h == C5707c.class) {
                    return new C3239d(Void.class, false, true, false, false, false, true);
                }
                boolean z10 = clsM6166h == AbstractC6431b.class;
                boolean z11 = clsM6166h == C5712h.class;
                boolean z12 = clsM6166h == C5711g.class;
                if (clsM6166h != AbstractC6434e.class && !z10 && !z11 && !z12) {
                    return null;
                }
                if (!(type instanceof ParameterizedType)) {
                    String str = !z10 ? !z11 ? z12 ? "Maybe" : "Observable" : "Single" : "Flowable";
                    throw new IllegalStateException(str + " return type must be parameterized as " + str + "<Foo> or " + str + "<? extends Foo>");
                }
                Type typeM6165g2 = AbstractC6522v.m6165g(0, (ParameterizedType) type);
                Class clsM6166h2 = AbstractC6522v.m6166h(typeM6165g2);
                if (clsM6166h2 == C6509n0.class) {
                    if (!(typeM6165g2 instanceof ParameterizedType)) {
                        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
                    }
                    typeM6165g = AbstractC6522v.m6165g(0, (ParameterizedType) typeM6165g2);
                    z9 = false;
                    z8 = false;
                } else if (clsM6166h2 != C3238c.class) {
                    typeM6165g = typeM6165g2;
                    z8 = true;
                    z9 = false;
                } else {
                    if (!(typeM6165g2 instanceof ParameterizedType)) {
                        throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
                    }
                    typeM6165g = AbstractC6522v.m6165g(0, (ParameterizedType) typeM6165g2);
                    z9 = true;
                    z8 = false;
                }
                return new C3239d(typeM6165g, z9, z8, z10, z11, z12, false);
            default:
                if (AbstractC6522v.m6166h(type) != CompletableFuture.class) {
                    return null;
                }
                if (!(type instanceof ParameterizedType)) {
                    throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
                }
                Type typeM6165g3 = AbstractC6522v.m6165g(0, (ParameterizedType) type);
                if (AbstractC6522v.m6166h(typeM6165g3) != C6509n0.class) {
                    c6500j = new C6500j(0, typeM6165g3);
                } else {
                    if (!(typeM6165g3 instanceof ParameterizedType)) {
                        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
                    }
                    c6500j = new C6500j(1, AbstractC6522v.m6165g(0, (ParameterizedType) typeM6165g3));
                }
                return c6500j;
        }
    }
}
