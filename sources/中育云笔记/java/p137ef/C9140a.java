package p137ef;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p122df.C9033d0;
import p122df.InterfaceC9040h;

/* renamed from: ef.a */
/* loaded from: classes6.dex */
public final class C9140a extends InterfaceC9040h.a {

    /* renamed from: a */
    public final Gson f21338a;

    /* renamed from: b */
    public final boolean f21339b;

    public C9140a(Gson gson, boolean z10) {
        this.f21338a = gson;
        this.f21339b = z10;
    }

    /* renamed from: a */
    public static C9140a m17985a(Gson gson) {
        if (gson != null) {
            return new C9140a(gson, false);
        }
        throw new NullPointerException("gson == null");
    }

    @Override // p122df.InterfaceC9040h.a
    public InterfaceC9040h requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C9033d0 c9033d0) {
        return new C9141b(this.f21338a, this.f21338a.getAdapter(TypeToken.get(type)), this.f21339b);
    }

    @Override // p122df.InterfaceC9040h.a
    public InterfaceC9040h responseBodyConverter(Type type, Annotation[] annotationArr, C9033d0 c9033d0) {
        return new C9142c(this.f21338a, this.f21338a.getAdapter(TypeToken.get(type)));
    }
}
