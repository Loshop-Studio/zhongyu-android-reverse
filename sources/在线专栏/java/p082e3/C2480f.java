package p082e3;

import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p014b3.C1034c;

/* renamed from: e3.f */
/* loaded from: classes.dex */
public final class C2480f {

    /* renamed from: a */
    @NotNull
    private final String f10100a;

    /* renamed from: b */
    @NotNull
    private final C1034c f10101b;

    public C2480f(@NotNull String value, @NotNull C1034c range) {
        C2769l.m9241e(value, "value");
        C2769l.m9241e(range, "range");
        this.f10100a = value;
        this.f10101b = range;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2480f)) {
            return false;
        }
        C2480f c2480f = (C2480f) obj;
        return C2769l.m9237a(this.f10100a, c2480f.f10100a) && C2769l.m9237a(this.f10101b, c2480f.f10101b);
    }

    public int hashCode() {
        return (this.f10100a.hashCode() * 31) + this.f10101b.hashCode();
    }

    @NotNull
    public String toString() {
        return "MatchGroup(value=" + this.f10100a + ", range=" + this.f10101b + ')';
    }
}
