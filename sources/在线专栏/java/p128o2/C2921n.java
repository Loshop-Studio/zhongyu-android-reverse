package p128o2;

import java.io.Serializable;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p171x2.InterfaceC3459a;

/* renamed from: o2.n */
/* loaded from: classes.dex */
final class C2921n<T> implements InterfaceC2913f<T>, Serializable {

    /* renamed from: a */
    @Nullable
    private InterfaceC3459a<? extends T> f11411a;

    /* renamed from: b */
    @Nullable
    private volatile Object f11412b;

    /* renamed from: c */
    @NotNull
    private final Object f11413c;

    public C2921n(@NotNull InterfaceC3459a<? extends T> initializer, @Nullable Object obj) {
        C2769l.m9241e(initializer, "initializer");
        this.f11411a = initializer;
        this.f11412b = C2923p.f11414a;
        this.f11413c = obj == null ? this : obj;
    }

    /* renamed from: a */
    public boolean m9995a() {
        return this.f11412b != C2923p.f11414a;
    }

    @Override // p128o2.InterfaceC2913f
    public T getValue() {
        T tInvoke;
        T t3 = (T) this.f11412b;
        C2923p c2923p = C2923p.f11414a;
        if (t3 != c2923p) {
            return t3;
        }
        synchronized (this.f11413c) {
            tInvoke = (T) this.f11412b;
            if (tInvoke == c2923p) {
                InterfaceC3459a<? extends T> interfaceC3459a = this.f11411a;
                C2769l.m9239c(interfaceC3459a);
                tInvoke = interfaceC3459a.invoke();
                this.f11412b = tInvoke;
                this.f11411a = null;
            }
        }
        return tInvoke;
    }

    @NotNull
    public String toString() {
        return m9995a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ C2921n(InterfaceC3459a interfaceC3459a, Object obj, int i4, C2764g c2764g) {
        this(interfaceC3459a, (i4 & 2) != 0 ? null : obj);
    }
}
