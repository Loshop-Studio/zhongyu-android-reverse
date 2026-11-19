package p014b3;

import kotlin.collections.AbstractC2743y;
import kotlin.jvm.internal.C2764g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151s2.C3381c;
import p175y2.InterfaceC3498a;

/* renamed from: b3.a */
/* loaded from: classes.dex */
public class C1032a implements Iterable<Integer>, InterfaceC3498a {

    /* renamed from: d */
    @NotNull
    public static final a f5712d = new a(null);

    /* renamed from: a */
    private final int f5713a;

    /* renamed from: b */
    private final int f5714b;

    /* renamed from: c */
    private final int f5715c;

    /* renamed from: b3.a$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C2764g c2764g) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final C1032a m4806a(int i4, int i5, int i6) {
            return new C1032a(i4, i5, i6);
        }
    }

    public C1032a(int i4, int i5, int i6) {
        if (i6 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i6 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f5713a = i4;
        this.f5714b = C3381c.m10295b(i4, i5, i6);
        this.f5715c = i6;
    }

    /* renamed from: a */
    public final int m4802a() {
        return this.f5713a;
    }

    /* renamed from: b */
    public final int m4803b() {
        return this.f5714b;
    }

    /* renamed from: c */
    public final int m4804c() {
        return this.f5715c;
    }

    @Override // java.lang.Iterable
    @NotNull
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public AbstractC2743y iterator() {
        return new C1033b(this.f5713a, this.f5714b, this.f5715c);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof C1032a) {
            if (!isEmpty() || !((C1032a) obj).isEmpty()) {
                C1032a c1032a = (C1032a) obj;
                if (this.f5713a != c1032a.f5713a || this.f5714b != c1032a.f5714b || this.f5715c != c1032a.f5715c) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f5713a * 31) + this.f5714b) * 31) + this.f5715c;
    }

    public boolean isEmpty() {
        if (this.f5715c > 0) {
            if (this.f5713a > this.f5714b) {
                return true;
            }
        } else if (this.f5713a < this.f5714b) {
            return true;
        }
        return false;
    }

    @NotNull
    public String toString() {
        StringBuilder sb;
        int i4;
        if (this.f5715c > 0) {
            sb = new StringBuilder();
            sb.append(this.f5713a);
            sb.append("..");
            sb.append(this.f5714b);
            sb.append(" step ");
            i4 = this.f5715c;
        } else {
            sb = new StringBuilder();
            sb.append(this.f5713a);
            sb.append(" downTo ");
            sb.append(this.f5714b);
            sb.append(" step ");
            i4 = -this.f5715c;
        }
        sb.append(i4);
        return sb.toString();
    }
}
