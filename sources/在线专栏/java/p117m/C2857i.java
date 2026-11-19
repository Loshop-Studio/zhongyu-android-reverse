package p117m;

import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: m.i */
/* loaded from: classes.dex */
public class C2857i {

    /* renamed from: o */
    private static int f11013o = 1;

    /* renamed from: a */
    public boolean f11014a;

    /* renamed from: b */
    private String f11015b;

    /* renamed from: f */
    public float f11019f;

    /* renamed from: j */
    a f11023j;

    /* renamed from: c */
    public int f11016c = -1;

    /* renamed from: d */
    int f11017d = -1;

    /* renamed from: e */
    public int f11018e = 0;

    /* renamed from: g */
    public boolean f11020g = false;

    /* renamed from: h */
    float[] f11021h = new float[9];

    /* renamed from: i */
    float[] f11022i = new float[9];

    /* renamed from: k */
    C2850b[] f11024k = new C2850b[16];

    /* renamed from: l */
    int f11025l = 0;

    /* renamed from: m */
    public int f11026m = 0;

    /* renamed from: n */
    HashSet<C2850b> f11027n = null;

    /* renamed from: m.i$a */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C2857i(a aVar, String str) {
        this.f11023j = aVar;
    }

    /* renamed from: b */
    static void m9635b() {
        f11013o++;
    }

    /* renamed from: a */
    public final void m9636a(C2850b c2850b) {
        int i4 = 0;
        while (true) {
            int i5 = this.f11025l;
            if (i4 >= i5) {
                C2850b[] c2850bArr = this.f11024k;
                if (i5 >= c2850bArr.length) {
                    this.f11024k = (C2850b[]) Arrays.copyOf(c2850bArr, c2850bArr.length * 2);
                }
                C2850b[] c2850bArr2 = this.f11024k;
                int i6 = this.f11025l;
                c2850bArr2[i6] = c2850b;
                this.f11025l = i6 + 1;
                return;
            }
            if (this.f11024k[i4] == c2850b) {
                return;
            } else {
                i4++;
            }
        }
    }

    /* renamed from: c */
    public final void m9637c(C2850b c2850b) {
        int i4 = this.f11025l;
        int i5 = 0;
        while (i5 < i4) {
            if (this.f11024k[i5] == c2850b) {
                while (i5 < i4 - 1) {
                    C2850b[] c2850bArr = this.f11024k;
                    int i6 = i5 + 1;
                    c2850bArr[i5] = c2850bArr[i6];
                    i5 = i6;
                }
                this.f11025l--;
                return;
            }
            i5++;
        }
    }

    /* renamed from: d */
    public void m9638d() {
        this.f11015b = null;
        this.f11023j = a.UNKNOWN;
        this.f11018e = 0;
        this.f11016c = -1;
        this.f11017d = -1;
        this.f11019f = IGoodView.DEFAULT_TO_ALPHA;
        this.f11020g = false;
        int i4 = this.f11025l;
        for (int i5 = 0; i5 < i4; i5++) {
            this.f11024k[i5] = null;
        }
        this.f11025l = 0;
        this.f11026m = 0;
        this.f11014a = false;
        Arrays.fill(this.f11022i, IGoodView.DEFAULT_TO_ALPHA);
    }

    /* renamed from: e */
    public void m9639e(C2852d c2852d, float f4) {
        this.f11019f = f4;
        this.f11020g = true;
        int i4 = this.f11025l;
        for (int i5 = 0; i5 < i4; i5++) {
            this.f11024k[i5].m9568B(c2852d, this, false);
        }
        this.f11025l = 0;
    }

    /* renamed from: f */
    public void m9640f(a aVar, String str) {
        this.f11023j = aVar;
    }

    /* renamed from: g */
    public final void m9641g(C2850b c2850b) {
        int i4 = this.f11025l;
        for (int i5 = 0; i5 < i4; i5++) {
            this.f11024k[i5].mo9569C(c2850b, false);
        }
        this.f11025l = 0;
    }

    public String toString() {
        if (this.f11015b != null) {
            return "" + this.f11015b;
        }
        return "" + this.f11016c;
    }
}
