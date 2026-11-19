package p079da;

import ca.C5283d0;
import ca.InterfaceC5290h;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* renamed from: da.a */
/* loaded from: classes5.dex */
public final class C8326a extends InterfaceC5290h.a {

    /* renamed from: a */
    public final Gson f15807a;

    /* renamed from: b */
    public final boolean f15808b;

    public C8326a(Gson gson, boolean z10) {
        this.f15807a = gson;
        this.f15808b = z10;
    }

    /* renamed from: f */
    public static C8326a m13537f(Gson gson) {
        if (gson != null) {
            return new C8326a(gson, false);
        }
        throw new NullPointerException("gson == null");
    }

    @Override // ca.InterfaceC5290h.a
    /* renamed from: c */
    public InterfaceC5290h mo2219c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C5283d0 c5283d0) {
        return new C8327b(this.f15807a, this.f15807a.getAdapter(TypeToken.get(type)), this.f15808b);
    }

    @Override // ca.InterfaceC5290h.a
    /* renamed from: d */
    public InterfaceC5290h mo2220d(Type type, Annotation[] annotationArr, C5283d0 c5283d0) {
        return new C8328c(this.f15807a, this.f15807a.getAdapter(TypeToken.get(type)));
    }
}
