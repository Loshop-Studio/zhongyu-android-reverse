package androidx.media;

import com.umeng.commonsdk.stateless.C1985b;
import java.util.Arrays;

/* loaded from: classes.dex */
class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a */
    int f3483a = 0;

    /* renamed from: b */
    int f3484b = 0;

    /* renamed from: c */
    int f3485c = 0;

    /* renamed from: d */
    int f3486d = -1;

    AudioAttributesImplBase() {
    }

    /* renamed from: a */
    public int m2933a() {
        return this.f3484b;
    }

    /* renamed from: b */
    public int m2934b() {
        int i4 = this.f3485c;
        int iM2935c = m2935c();
        if (iM2935c == 6) {
            i4 |= 4;
        } else if (iM2935c == 7) {
            i4 |= 1;
        }
        return i4 & C1985b.f9296a;
    }

    /* renamed from: c */
    public int m2935c() {
        int i4 = this.f3486d;
        return i4 != -1 ? i4 : AudioAttributesCompat.m2931a(false, this.f3485c, this.f3483a);
    }

    /* renamed from: d */
    public int m2936d() {
        return this.f3483a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f3484b == audioAttributesImplBase.m2933a() && this.f3485c == audioAttributesImplBase.m2934b() && this.f3483a == audioAttributesImplBase.m2936d() && this.f3486d == audioAttributesImplBase.f3486d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3484b), Integer.valueOf(this.f3485c), Integer.valueOf(this.f3483a), Integer.valueOf(this.f3486d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f3486d != -1) {
            sb.append(" stream=");
            sb.append(this.f3486d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.m2932b(this.f3483a));
        sb.append(" content=");
        sb.append(this.f3484b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f3485c).toUpperCase());
        return sb.toString();
    }
}
