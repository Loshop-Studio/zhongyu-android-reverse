package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import okhttp3.AbstractC6297g0;
import okhttp3.AbstractC6323m0;
import p045d6.C5443s;
import p140q.C6400d;
import retrofit2.http.Streaming;

/* renamed from: retrofit2.c */
/* loaded from: classes4.dex */
public final class C6486c extends AbstractC6504l {

    /* renamed from: a */
    public final /* synthetic */ int f10683a;

    public /* synthetic */ C6486c(int i) {
        this.f10683a = i;
    }

    @Override // retrofit2.AbstractC6504l
    /* renamed from: a */
    public InterfaceC6506m mo4819a(Type type) {
        switch (this.f10683a) {
            case 0:
                if (AbstractC6297g0.class.isAssignableFrom(AbstractC6522v.m6166h(type))) {
                    return C6484b.f10674d;
                }
                return null;
            default:
                return super.mo4819a(type);
        }
    }

    @Override // retrofit2.AbstractC6504l
    /* renamed from: b */
    public final InterfaceC6506m mo4820b(Type type, Annotation[] annotationArr, C6513p0 c6513p0) {
        switch (this.f10683a) {
            case 0:
                if (type == AbstractC6323m0.class) {
                    return AbstractC6522v.m6170l(annotationArr, Streaming.class) ? C6484b.f10675e : C6484b.f10673c;
                }
                if (type == Void.class) {
                    return C6484b.f10677g;
                }
                if (AbstractC6522v.f10796b && type == C5443s.class) {
                    return C6484b.f10676f;
                }
                return null;
            default:
                if (AbstractC6522v.m6166h(type) != Optional.class) {
                    return null;
                }
                return new C6400d(c6513p0.m6157d(AbstractC6522v.m6165g(0, (ParameterizedType) type), annotationArr));
        }
    }
}
