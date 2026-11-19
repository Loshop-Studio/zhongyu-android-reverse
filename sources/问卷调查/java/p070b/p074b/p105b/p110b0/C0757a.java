package p070b.p074b.p105b.p110b0;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import p070b.p074b.p105b.p106a0.C0708a;

/* renamed from: b.b.b.b0.a */
/* loaded from: classes.dex */
public class C0757a<T> {

    /* renamed from: a */
    public final Class<? super T> f4386a;

    /* renamed from: b */
    public final Type f4387b;

    /* renamed from: c */
    public final int f4388c;

    public C0757a() {
        Type genericSuperclass = C0757a.class.getGenericSuperclass();
        if (genericSuperclass instanceof Class) {
            throw new RuntimeException("Missing type parameter.");
        }
        Type typeM2355a = C0708a.m2355a(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        this.f4387b = typeM2355a;
        this.f4386a = (Class<? super T>) C0708a.m2359e(typeM2355a);
        this.f4388c = typeM2355a.hashCode();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0757a) && C0708a.m2357c(this.f4387b, ((C0757a) obj).f4387b);
    }

    public final int hashCode() {
        return this.f4388c;
    }

    public final String toString() {
        return C0708a.m2363i(this.f4387b);
    }

    public C0757a(Type type) {
        Objects.requireNonNull(type);
        Type typeM2355a = C0708a.m2355a(type);
        this.f4387b = typeM2355a;
        this.f4386a = (Class<? super T>) C0708a.m2359e(typeM2355a);
        this.f4388c = typeM2355a.hashCode();
    }
}
