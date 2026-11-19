package p012b1;

/* renamed from: b1.b */
/* loaded from: classes.dex */
public class C1027b {

    /* renamed from: a */
    private boolean f5703a;

    /* renamed from: b */
    private boolean f5704b;

    /* renamed from: c */
    private boolean f5705c;

    /* renamed from: d */
    private boolean f5706d;

    public C1027b(boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f5703a = z3;
        this.f5704b = z4;
        this.f5705c = z5;
        this.f5706d = z6;
    }

    /* renamed from: a */
    public boolean m4786a() {
        return this.f5703a;
    }

    /* renamed from: b */
    public boolean m4787b() {
        return this.f5705c;
    }

    /* renamed from: c */
    public boolean m4788c() {
        return this.f5706d;
    }

    /* renamed from: d */
    public boolean m4789d() {
        return this.f5704b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1027b)) {
            return false;
        }
        C1027b c1027b = (C1027b) obj;
        return this.f5703a == c1027b.f5703a && this.f5704b == c1027b.f5704b && this.f5705c == c1027b.f5705c && this.f5706d == c1027b.f5706d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public int hashCode() {
        ?? r02 = this.f5703a;
        int i4 = r02;
        if (this.f5704b) {
            i4 = r02 + 16;
        }
        int i5 = i4;
        if (this.f5705c) {
            i5 = i4 + 256;
        }
        return this.f5706d ? i5 + 4096 : i5;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.f5703a), Boolean.valueOf(this.f5704b), Boolean.valueOf(this.f5705c), Boolean.valueOf(this.f5706d));
    }
}
