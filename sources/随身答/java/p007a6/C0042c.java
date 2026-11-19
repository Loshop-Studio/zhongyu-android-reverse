package p007a6;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import p038c9.C5299y;
import p038c9.InterfaceC5274b;
import p038c9.InterfaceC5276c;
import p038c9.InterfaceC5280f;

/* renamed from: a6.c */
/* loaded from: classes4.dex */
public final class C0042c extends InterfaceC5276c.a {
    @Override // p038c9.InterfaceC5276c.a
    /* renamed from: a */
    public InterfaceC5276c mo231a(Type returnType, Annotation[] annotations, C5299y retrofit) {
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        if (!Intrinsics.areEqual(InterfaceC5274b.class, InterfaceC5276c.a.m2424c(returnType))) {
            return null;
        }
        if (!(returnType instanceof ParameterizedType)) {
            throw new IllegalStateException("return type must be parameterized as Call<NetworkResponse<<Foo>> or Call<NetworkResponse<out Foo>>");
        }
        Type typeM2423b = InterfaceC5276c.a.m2423b(0, (ParameterizedType) returnType);
        if (!Intrinsics.areEqual(InterfaceC5276c.a.m2424c(typeM2423b), AbstractC0040a.class)) {
            return null;
        }
        if (!(typeM2423b instanceof ParameterizedType)) {
            throw new IllegalStateException("Response must be parameterized as NetworkResponse<Foo> or NetworkResponse<out Foo>");
        }
        ParameterizedType parameterizedType = (ParameterizedType) typeM2423b;
        Type successBodyType = InterfaceC5276c.a.m2423b(0, parameterizedType);
        InterfaceC5280f errorBodyConverter = retrofit.m2531f(null, InterfaceC5276c.a.m2423b(1, parameterizedType), annotations);
        Intrinsics.checkNotNullExpressionValue(successBodyType, "successBodyType");
        Intrinsics.checkNotNullExpressionValue(errorBodyConverter, "errorBodyConverter");
        return new C0041b(successBodyType, errorBodyConverter);
    }
}
