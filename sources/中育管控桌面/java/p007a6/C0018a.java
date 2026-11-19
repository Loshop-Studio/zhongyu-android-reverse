package p007a6;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p200z5.C7959d0;
import p200z5.InterfaceC7966h;

/* renamed from: a6.a */
/* loaded from: classes4.dex */
public final class C0018a extends InterfaceC7966h.a {

    /* renamed from: a */
    public final Gson f14a;

    /* renamed from: b */
    public final boolean f15b;

    public C0018a(Gson gson, boolean z6) {
        this.f14a = gson;
        this.f15b = z6;
    }

    /* renamed from: f */
    public static C0018a m27f(Gson gson) {
        if (gson != null) {
            return new C0018a(gson, false);
        }
        throw new NullPointerException("gson == null");
    }

    @Override // p200z5.InterfaceC7966h.a
    /* renamed from: c */
    public InterfaceC7966h mo28c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C7959d0 c7959d0) {
        return new C0019b(this.f14a, this.f14a.getAdapter(TypeToken.get(type)), this.f15b);
    }

    @Override // p200z5.InterfaceC7966h.a
    /* renamed from: d */
    public InterfaceC7966h mo29d(Type type, Annotation[] annotationArr, C7959d0 c7959d0) {
        return new C0020c(this.f14a, this.f14a.getAdapter(TypeToken.get(type)));
    }
}
