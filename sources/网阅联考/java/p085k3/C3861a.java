package p085k3;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p080j3.C3814e0;
import p080j3.InterfaceC3821i;

/* renamed from: k3.a */
/* loaded from: classes2.dex */
public final class C3861a extends InterfaceC3821i.a {

    /* renamed from: a */
    public final Gson f4784a;

    public C3861a(Gson gson) {
        this.f4784a = gson;
    }

    /* renamed from: f */
    public static C3861a m5170f(Gson gson) {
        if (gson != null) {
            return new C3861a(gson);
        }
        throw new NullPointerException("gson == null");
    }

    @Override // p080j3.InterfaceC3821i.a
    /* renamed from: c */
    public InterfaceC3821i mo4965c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C3814e0 c3814e0) {
        return new C3862b(this.f4784a, this.f4784a.getAdapter(TypeToken.get(type)));
    }

    @Override // p080j3.InterfaceC3821i.a
    /* renamed from: d */
    public InterfaceC3821i mo4966d(Type type, Annotation[] annotationArr, C3814e0 c3814e0) {
        return new C3863c(this.f4784a, this.f4784a.getAdapter(TypeToken.get(type)));
    }
}
