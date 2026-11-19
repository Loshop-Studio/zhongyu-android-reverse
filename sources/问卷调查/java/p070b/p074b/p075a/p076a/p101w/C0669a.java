package p070b.p074b.p075a.p076a.p101w;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: b.b.a.a.w.a */
/* loaded from: classes.dex */
public final class C0669a implements InterfaceC0671c {

    /* renamed from: a */
    public final float f3993a;

    public C0669a(float f2) {
        this.f3993a = f2;
    }

    @Override // p070b.p074b.p075a.p076a.p101w.InterfaceC0671c
    /* renamed from: a */
    public float mo2279a(RectF rectF) {
        return this.f3993a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0669a) && this.f3993a == ((C0669a) obj).f3993a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f3993a)});
    }
}
