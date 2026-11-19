package p237s9;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p226r9.C9059d0;
import p226r9.InterfaceC9066h;

/* renamed from: s9.a */
/* loaded from: classes5.dex */
public final class C9356a extends InterfaceC9066h.a {

    /* renamed from: a */
    public final Gson f16213a;

    /* renamed from: b */
    public final boolean f16214b;

    public C9356a(Gson gson, boolean z9) {
        this.f16213a = gson;
        this.f16214b = z9;
    }

    /* renamed from: f */
    public static C9356a m15607f(Gson gson) {
        if (gson != null) {
            return new C9356a(gson, false);
        }
        throw new NullPointerException("gson == null");
    }

    @Override // p226r9.InterfaceC9066h.a
    /* renamed from: c */
    public InterfaceC9066h mo15218c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C9059d0 c9059d0) {
        return new C9357b(this.f16213a, this.f16213a.getAdapter(TypeToken.get(type)), this.f16214b);
    }

    @Override // p226r9.InterfaceC9066h.a
    /* renamed from: d */
    public InterfaceC9066h mo15219d(Type type, Annotation[] annotationArr, C9059d0 c9059d0) {
        return new C9358c(this.f16213a, this.f16213a.getAdapter(TypeToken.get(type)));
    }
}
