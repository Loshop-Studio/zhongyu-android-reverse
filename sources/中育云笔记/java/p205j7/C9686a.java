package p205j7;

/* renamed from: j7.a */
/* loaded from: classes5.dex */
public class C9686a {

    /* renamed from: a */
    public final float f22488a;

    /* renamed from: b */
    public final float f22489b;

    public C9686a(float f10, float f11) {
        this.f22488a = f10;
        this.f22489b = f11;
    }

    /* renamed from: a */
    public float m19173a() {
        return this.f22489b;
    }

    /* renamed from: b */
    public float m19174b() {
        return this.f22488a;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9686a) {
            C9686a c9686a = (C9686a) obj;
            if (this.f22488a == c9686a.f22488a && this.f22489b == c9686a.f22489b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f22488a) ^ Float.floatToIntBits(this.f22489b);
    }

    public String toString() {
        return this.f22488a + "x" + this.f22489b;
    }
}
