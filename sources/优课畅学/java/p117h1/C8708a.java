package p117h1;

/* renamed from: h1.a */
/* loaded from: classes4.dex */
public class C8708a {

    /* renamed from: a */
    public final float f16329a;

    /* renamed from: b */
    public final float f16330b;

    public C8708a(float f10, float f11) {
        this.f16329a = f10;
        this.f16330b = f11;
    }

    /* renamed from: a */
    public float m14207a() {
        return this.f16330b;
    }

    /* renamed from: b */
    public float m14208b() {
        return this.f16329a;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8708a) {
            C8708a c8708a = (C8708a) obj;
            if (this.f16329a == c8708a.f16329a && this.f16330b == c8708a.f16330b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f16329a) ^ Float.floatToIntBits(this.f16330b);
    }

    public String toString() {
        return this.f16329a + "x" + this.f16330b;
    }
}
