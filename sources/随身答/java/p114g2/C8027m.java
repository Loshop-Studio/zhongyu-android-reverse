package p114g2;

/* renamed from: g2.m */
/* loaded from: classes4.dex */
public class C8027m {

    /* renamed from: a */
    public short[] f13608a;

    /* renamed from: b */
    public int f13609b = -1;

    public C8027m(int i9) {
        this.f13608a = new short[i9];
    }

    /* renamed from: a */
    public short m12682a() {
        short[] sArr = this.f13608a;
        int i9 = this.f13609b;
        this.f13609b = i9 - 1;
        return sArr[i9];
    }

    /* renamed from: b */
    public void m12683b(short s9) {
        if (this.f13608a.length == this.f13609b + 1) {
            m12685d();
        }
        short[] sArr = this.f13608a;
        int i9 = this.f13609b + 1;
        this.f13609b = i9;
        sArr[i9] = s9;
    }

    /* renamed from: c */
    public void m12684c() {
        this.f13609b = -1;
    }

    /* renamed from: d */
    public final void m12685d() {
        short[] sArr = this.f13608a;
        short[] sArr2 = new short[sArr.length * 2];
        System.arraycopy(sArr, 0, sArr2, 0, sArr.length);
        this.f13608a = sArr2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<ShortStack vector:[");
        for (int i9 = 0; i9 < this.f13608a.length; i9++) {
            if (i9 != 0) {
                sb.append(" ");
            }
            if (i9 == this.f13609b) {
                sb.append(">>");
            }
            sb.append((int) this.f13608a[i9]);
            if (i9 == this.f13609b) {
                sb.append("<<");
            }
        }
        sb.append("]>");
        return sb.toString();
    }
}
