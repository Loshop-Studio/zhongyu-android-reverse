package p120s1;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import p080j3.C3814e0;
import p080j3.InterfaceC3807b;
import p080j3.InterfaceC3809c;
import p080j3.InterfaceC3821i;

/* renamed from: s1.c */
/* loaded from: classes2.dex */
public final class C4547c extends InterfaceC3809c.a {
    @Override // p080j3.InterfaceC3809c.a
    /* renamed from: a */
    public InterfaceC3809c mo5002a(Type returnType, Annotation[] annotations, C3814e0 retrofit) {
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        if (!Intrinsics.areEqual(InterfaceC3807b.class, InterfaceC3809c.a.m5001c(returnType))) {
            return null;
        }
        if (!(returnType instanceof ParameterizedType)) {
            throw new IllegalStateException("return type must be parameterized as Call<NetworkResponse<<Foo>> or Call<NetworkResponse<out Foo>>".toString());
        }
        Type typeM5000b = InterfaceC3809c.a.m5000b(0, (ParameterizedType) returnType);
        if (!Intrinsics.areEqual(InterfaceC3809c.a.m5001c(typeM5000b), AbstractC4545a.class)) {
            return null;
        }
        if (!(typeM5000b instanceof ParameterizedType)) {
            throw new IllegalStateException("Response must be parameterized as NetworkResponse<Foo> or NetworkResponse<out Foo>".toString());
        }
        ParameterizedType parameterizedType = (ParameterizedType) typeM5000b;
        Type successBodyType = InterfaceC3809c.a.m5000b(0, parameterizedType);
        InterfaceC3821i errorBodyConverter = retrofit.m5031f(null, InterfaceC3809c.a.m5000b(1, parameterizedType), annotations);
        Intrinsics.checkNotNullExpressionValue(successBodyType, "successBodyType");
        Intrinsics.checkNotNullExpressionValue(errorBodyConverter, "errorBodyConverter");
        return new C4546b(successBodyType, errorBodyConverter);
    }
}
