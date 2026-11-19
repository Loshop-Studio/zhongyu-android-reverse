package p070b.p074b.p075a.p076a.p101w;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: b.b.a.a.w.h */
/* loaded from: classes.dex */
public final class C0676h implements InterfaceC0671c {

    /* renamed from: a */
    public final float f4043a;

    public C0676h(float f2) {
        this.f4043a = f2;
    }

    @Override // p070b.p074b.p075a.p076a.p101w.InterfaceC0671c
    /* renamed from: a */
    public float mo2279a(RectF rectF) {
        return rectF.height() * this.f4043a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0676h) && this.f4043a == ((C0676h) obj).f4043a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f4043a)});
    }
}
