package p081e2;

import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: e2.a */
/* loaded from: classes.dex */
public final class C2472a {

    /* renamed from: a */
    @NotNull
    private final String f10075a;

    /* renamed from: b */
    private final int f10076b;

    /* renamed from: c */
    private final float f10077c;

    public C2472a(@NotNull String path, int i4, float f4) {
        C2769l.m9241e(path, "path");
        this.f10075a = path;
        this.f10076b = i4;
        this.f10077c = f4;
    }

    /* renamed from: a */
    public final int m8250a() {
        return this.f10076b;
    }

    /* renamed from: b */
    public final float m8251b() {
        return this.f10077c;
    }

    @NotNull
    /* renamed from: c */
    public final String m8252c() {
        return this.f10075a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2472a)) {
            return false;
        }
        C2472a c2472a = (C2472a) obj;
        return C2769l.m9237a(this.f10075a, c2472a.f10075a) && this.f10076b == c2472a.f10076b && C2769l.m9237a(Float.valueOf(this.f10077c), Float.valueOf(c2472a.f10077c));
    }

    public int hashCode() {
        return (((this.f10075a.hashCode() * 31) + this.f10076b) * 31) + Float.floatToIntBits(this.f10077c);
    }

    @NotNull
    public String toString() {
        return "PDFPreviewInfo(path=" + this.f10075a + ", pageIndex=" + this.f10076b + ", pageOffset=" + this.f10077c + ')';
    }
}
