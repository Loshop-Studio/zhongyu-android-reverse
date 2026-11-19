package p142q2;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC2770m;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p142q2.InterfaceC3015g;
import p171x2.InterfaceC3474p;

/* renamed from: q2.c */
/* loaded from: classes.dex */
public final class C3011c implements InterfaceC3015g, Serializable {

    /* renamed from: a */
    @NotNull
    private final InterfaceC3015g f11672a;

    /* renamed from: b */
    @NotNull
    private final InterfaceC3015g.b f11673b;

    /* renamed from: q2.c$a */
    static final class a extends AbstractC2770m implements InterfaceC3474p<String, InterfaceC3015g.b, String> {

        /* renamed from: a */
        public static final a f11674a = new a();

        a() {
            super(2);
        }

        @Override // p171x2.InterfaceC3474p
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo2812d(@NotNull String acc, @NotNull InterfaceC3015g.b element) {
            C2769l.m9241e(acc, "acc");
            C2769l.m9241e(element, "element");
            if (acc.length() == 0) {
                return element.toString();
            }
            return acc + ", " + element;
        }
    }

    public C3011c(@NotNull InterfaceC3015g left, @NotNull InterfaceC3015g.b element) {
        C2769l.m9241e(left, "left");
        C2769l.m9241e(element, "element");
        this.f11672a = left;
        this.f11673b = element;
    }

    /* renamed from: c */
    private final boolean m10112c(InterfaceC3015g.b bVar) {
        return C2769l.m9237a(get(bVar.getKey()), bVar);
    }

    /* renamed from: e */
    private final boolean m10113e(C3011c c3011c) {
        while (m10112c(c3011c.f11673b)) {
            InterfaceC3015g interfaceC3015g = c3011c.f11672a;
            if (!(interfaceC3015g instanceof C3011c)) {
                return m10112c((InterfaceC3015g.b) interfaceC3015g);
            }
            c3011c = (C3011c) interfaceC3015g;
        }
        return false;
    }

    /* renamed from: f */
    private final int m10114f() {
        int i4 = 2;
        C3011c c3011c = this;
        while (true) {
            InterfaceC3015g interfaceC3015g = c3011c.f11672a;
            c3011c = interfaceC3015g instanceof C3011c ? (C3011c) interfaceC3015g : null;
            if (c3011c == null) {
                return i4;
            }
            i4++;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof C3011c) {
                C3011c c3011c = (C3011c) obj;
                if (c3011c.m10114f() != m10114f() || !c3011c.m10113e(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // p142q2.InterfaceC3015g
    public <R> R fold(R r3, @NotNull InterfaceC3474p<? super R, ? super InterfaceC3015g.b, ? extends R> operation) {
        C2769l.m9241e(operation, "operation");
        return operation.mo2812d((Object) this.f11672a.fold(r3, operation), this.f11673b);
    }

    @Override // p142q2.InterfaceC3015g
    @Nullable
    public <E extends InterfaceC3015g.b> E get(@NotNull InterfaceC3015g.c<E> key) {
        C2769l.m9241e(key, "key");
        C3011c c3011c = this;
        while (true) {
            E e4 = (E) c3011c.f11673b.get(key);
            if (e4 != null) {
                return e4;
            }
            InterfaceC3015g interfaceC3015g = c3011c.f11672a;
            if (!(interfaceC3015g instanceof C3011c)) {
                return (E) interfaceC3015g.get(key);
            }
            c3011c = (C3011c) interfaceC3015g;
        }
    }

    public int hashCode() {
        return this.f11672a.hashCode() + this.f11673b.hashCode();
    }

    @Override // p142q2.InterfaceC3015g
    @NotNull
    public InterfaceC3015g minusKey(@NotNull InterfaceC3015g.c<?> key) {
        C2769l.m9241e(key, "key");
        if (this.f11673b.get(key) != null) {
            return this.f11672a;
        }
        InterfaceC3015g interfaceC3015gMinusKey = this.f11672a.minusKey(key);
        return interfaceC3015gMinusKey == this.f11672a ? this : interfaceC3015gMinusKey == C3016h.f11678a ? this.f11673b : new C3011c(interfaceC3015gMinusKey, this.f11673b);
    }

    @Override // p142q2.InterfaceC3015g
    @NotNull
    public InterfaceC3015g plus(@NotNull InterfaceC3015g interfaceC3015g) {
        return InterfaceC3015g.a.m10119a(this, interfaceC3015g);
    }

    @NotNull
    public String toString() {
        return '[' + ((String) fold("", a.f11674a)) + ']';
    }
}
