package p070b.p074b.p075a.p076a.p101w;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: b.b.a.a.w.b */
/* loaded from: classes.dex */
public final class C0670b implements InterfaceC0671c {

    /* renamed from: a */
    public final InterfaceC0671c f3994a;

    /* renamed from: b */
    public final float f3995b;

    public C0670b(float f2, InterfaceC0671c interfaceC0671c) {
        while (interfaceC0671c instanceof C0670b) {
            interfaceC0671c = ((C0670b) interfaceC0671c).f3994a;
            f2 += ((C0670b) interfaceC0671c).f3995b;
        }
        this.f3994a = interfaceC0671c;
        this.f3995b = f2;
    }

    @Override // p070b.p074b.p075a.p076a.p101w.InterfaceC0671c
    /* renamed from: a */
    public float mo2279a(RectF rectF) {
        return Math.max(0.0f, this.f3994a.mo2279a(rectF) + this.f3995b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0670b)) {
            return false;
        }
        C0670b c0670b = (C0670b) obj;
        return this.f3994a.equals(c0670b.f3994a) && this.f3995b == c0670b.f3995b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3994a, Float.valueOf(this.f3995b)});
    }
}
