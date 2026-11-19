package p014b3;

import kotlin.jvm.internal.C2764g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: b3.c */
/* loaded from: classes.dex */
public final class C1034c extends C1032a {

    /* renamed from: e */
    @NotNull
    public static final a f5720e = new a(null);

    /* renamed from: f */
    @NotNull
    private static final C1034c f5721f = new C1034c(1, 0);

    /* renamed from: b3.c$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C2764g c2764g) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final C1034c m4811a() {
            return C1034c.f5721f;
        }
    }

    public C1034c(int i4, int i5) {
        super(i4, i5, 1);
    }

    @Override // p014b3.C1032a
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof C1034c) {
            if (!isEmpty() || !((C1034c) obj).isEmpty()) {
                C1034c c1034c = (C1034c) obj;
                if (m4802a() != c1034c.m4802a() || m4803b() != c1034c.m4803b()) {
                }
            }
            return true;
        }
        return false;
    }

    @NotNull
    /* renamed from: f */
    public Integer m4809f() {
        return Integer.valueOf(m4803b());
    }

    @NotNull
    /* renamed from: g */
    public Integer m4810g() {
        return Integer.valueOf(m4802a());
    }

    @Override // p014b3.C1032a
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (m4802a() * 31) + m4803b();
    }

    @Override // p014b3.C1032a
    public boolean isEmpty() {
        return m4802a() > m4803b();
    }

    @Override // p014b3.C1032a
    @NotNull
    public String toString() {
        return m4802a() + ".." + m4803b();
    }
}
