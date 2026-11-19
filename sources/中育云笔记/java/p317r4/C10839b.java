package p317r4;

import java.util.Arrays;

/* renamed from: r4.b */
/* loaded from: classes5.dex */
public final class C10839b {

    /* renamed from: b */
    public static final C10839b f26148b = new C10839b(0);

    /* renamed from: c */
    public static final C10839b f26149c = new C10839b(1);

    /* renamed from: d */
    public static final C10839b f26150d = new C10839b(2);

    /* renamed from: e */
    public static final C10839b f26151e = new C10839b(3);

    /* renamed from: f */
    public static final C10839b f26152f = new C10839b(4);

    /* renamed from: a */
    public final int f26153a;

    public C10839b(int i10) {
        this.f26153a = i10;
    }

    /* renamed from: a */
    public final int m23321a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C10839b.class == obj.getClass() && this.f26153a == ((C10839b) obj).f26153a;
    }

    public int hashCode() {
        return m23321a(Integer.valueOf(this.f26153a));
    }
}
