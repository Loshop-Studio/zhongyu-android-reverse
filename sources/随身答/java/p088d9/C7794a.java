package p088d9;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p038c9.C5299y;
import p038c9.InterfaceC5280f;

/* renamed from: d9.a */
/* loaded from: classes5.dex */
public final class C7794a extends InterfaceC5280f.a {

    /* renamed from: a */
    public final Gson f13110a;

    public C7794a(Gson gson) {
        this.f13110a = gson;
    }

    /* renamed from: f */
    public static C7794a m12158f(Gson gson) {
        if (gson != null) {
            return new C7794a(gson);
        }
        throw new NullPointerException("gson == null");
    }

    @Override // p038c9.InterfaceC5280f.a
    /* renamed from: c */
    public InterfaceC5280f mo2414c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C5299y c5299y) {
        return new C7795b(this.f13110a, this.f13110a.getAdapter(TypeToken.get(type)));
    }

    @Override // p038c9.InterfaceC5280f.a
    /* renamed from: d */
    public InterfaceC5280f mo2415d(Type type, Annotation[] annotationArr, C5299y c5299y) {
        return new C7796c(this.f13110a, this.f13110a.getAdapter(TypeToken.get(type)));
    }
}
