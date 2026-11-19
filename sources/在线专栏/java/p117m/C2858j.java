package p117m;

import com.efs.sdk.base.Constants;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.util.Arrays;
import p117m.C2850b;

/* renamed from: m.j */
/* loaded from: classes.dex */
public class C2858j implements C2850b.a {

    /* renamed from: n */
    private static float f11034n = 0.001f;

    /* renamed from: a */
    private final int f11035a = -1;

    /* renamed from: b */
    private int f11036b = 16;

    /* renamed from: c */
    private int f11037c = 16;

    /* renamed from: d */
    int[] f11038d = new int[16];

    /* renamed from: e */
    int[] f11039e = new int[16];

    /* renamed from: f */
    int[] f11040f = new int[16];

    /* renamed from: g */
    float[] f11041g = new float[16];

    /* renamed from: h */
    int[] f11042h = new int[16];

    /* renamed from: i */
    int[] f11043i = new int[16];

    /* renamed from: j */
    int f11044j = 0;

    /* renamed from: k */
    int f11045k = -1;

    /* renamed from: l */
    private final C2850b f11046l;

    /* renamed from: m */
    protected final C2851c f11047m;

    C2858j(C2850b c2850b, C2851c c2851c) {
        this.f11046l = c2850b;
        this.f11047m = c2851c;
        clear();
    }

    /* renamed from: k */
    private void m9642k(C2857i c2857i, int i4) {
        int[] iArr;
        int i5 = c2857i.f11016c % this.f11037c;
        int[] iArr2 = this.f11038d;
        int i6 = iArr2[i5];
        if (i6 == -1) {
            iArr2[i5] = i4;
        } else {
            while (true) {
                iArr = this.f11039e;
                if (iArr[i6] == -1) {
                    break;
                } else {
                    i6 = iArr[i6];
                }
            }
            iArr[i6] = i4;
        }
        this.f11039e[i4] = -1;
    }

    /* renamed from: l */
    private void m9643l(int i4, C2857i c2857i, float f4) {
        this.f11040f[i4] = c2857i.f11016c;
        this.f11041g[i4] = f4;
        this.f11042h[i4] = -1;
        this.f11043i[i4] = -1;
        c2857i.m9636a(this.f11046l);
        c2857i.f11026m++;
        this.f11044j++;
    }

    /* renamed from: m */
    private int m9644m() {
        for (int i4 = 0; i4 < this.f11036b; i4++) {
            if (this.f11040f[i4] == -1) {
                return i4;
            }
        }
        return -1;
    }

    /* renamed from: n */
    private void m9645n() {
        int i4 = this.f11036b * 2;
        this.f11040f = Arrays.copyOf(this.f11040f, i4);
        this.f11041g = Arrays.copyOf(this.f11041g, i4);
        this.f11042h = Arrays.copyOf(this.f11042h, i4);
        this.f11043i = Arrays.copyOf(this.f11043i, i4);
        this.f11039e = Arrays.copyOf(this.f11039e, i4);
        for (int i5 = this.f11036b; i5 < i4; i5++) {
            this.f11040f[i5] = -1;
            this.f11039e[i5] = -1;
        }
        this.f11036b = i4;
    }

    /* renamed from: p */
    private void m9646p(int i4, C2857i c2857i, float f4) {
        int iM9644m = m9644m();
        m9643l(iM9644m, c2857i, f4);
        if (i4 != -1) {
            this.f11042h[iM9644m] = i4;
            int[] iArr = this.f11043i;
            iArr[iM9644m] = iArr[i4];
            iArr[i4] = iM9644m;
        } else {
            this.f11042h[iM9644m] = -1;
            if (this.f11044j > 0) {
                this.f11043i[iM9644m] = this.f11045k;
                this.f11045k = iM9644m;
            } else {
                this.f11043i[iM9644m] = -1;
            }
        }
        int[] iArr2 = this.f11043i;
        if (iArr2[iM9644m] != -1) {
            this.f11042h[iArr2[iM9644m]] = iM9644m;
        }
        m9642k(c2857i, iM9644m);
    }

    /* renamed from: q */
    private void m9647q(C2857i c2857i) {
        int[] iArr;
        int i4 = c2857i.f11016c;
        int i5 = i4 % this.f11037c;
        int[] iArr2 = this.f11038d;
        int i6 = iArr2[i5];
        if (i6 == -1) {
            return;
        }
        if (this.f11040f[i6] == i4) {
            int[] iArr3 = this.f11039e;
            iArr2[i5] = iArr3[i6];
            iArr3[i6] = -1;
            return;
        }
        while (true) {
            iArr = this.f11039e;
            if (iArr[i6] == -1 || this.f11040f[iArr[i6]] == i4) {
                break;
            } else {
                i6 = iArr[i6];
            }
        }
        int i7 = iArr[i6];
        if (i7 == -1 || this.f11040f[i7] != i4) {
            return;
        }
        iArr[i6] = iArr[i7];
        iArr[i7] = -1;
    }

    @Override // p117m.C2850b.a
    /* renamed from: a */
    public float mo9555a(int i4) {
        int i5 = this.f11044j;
        int i6 = this.f11045k;
        for (int i7 = 0; i7 < i5; i7++) {
            if (i7 == i4) {
                return this.f11041g[i6];
            }
            i6 = this.f11043i[i6];
            if (i6 == -1) {
                return IGoodView.DEFAULT_TO_ALPHA;
            }
        }
        return IGoodView.DEFAULT_TO_ALPHA;
    }

    @Override // p117m.C2850b.a
    /* renamed from: b */
    public void mo9556b(C2857i c2857i, float f4, boolean z3) {
        float f5 = f11034n;
        if (f4 <= (-f5) || f4 >= f5) {
            int iM9648o = m9648o(c2857i);
            if (iM9648o == -1) {
                mo9559e(c2857i, f4);
                return;
            }
            float[] fArr = this.f11041g;
            fArr[iM9648o] = fArr[iM9648o] + f4;
            float f6 = fArr[iM9648o];
            float f7 = f11034n;
            if (f6 <= (-f7) || fArr[iM9648o] >= f7) {
                return;
            }
            fArr[iM9648o] = 0.0f;
            mo9563i(c2857i, z3);
        }
    }

    @Override // p117m.C2850b.a
    /* renamed from: c */
    public boolean mo9557c(C2857i c2857i) {
        return m9648o(c2857i) != -1;
    }

    @Override // p117m.C2850b.a
    public void clear() {
        int i4 = this.f11044j;
        for (int i5 = 0; i5 < i4; i5++) {
            C2857i c2857iMo9560f = mo9560f(i5);
            if (c2857iMo9560f != null) {
                c2857iMo9560f.m9637c(this.f11046l);
            }
        }
        for (int i6 = 0; i6 < this.f11036b; i6++) {
            this.f11040f[i6] = -1;
            this.f11039e[i6] = -1;
        }
        for (int i7 = 0; i7 < this.f11037c; i7++) {
            this.f11038d[i7] = -1;
        }
        this.f11044j = 0;
        this.f11045k = -1;
    }

    @Override // p117m.C2850b.a
    /* renamed from: d */
    public float mo9558d(C2857i c2857i) {
        int iM9648o = m9648o(c2857i);
        return iM9648o != -1 ? this.f11041g[iM9648o] : IGoodView.DEFAULT_TO_ALPHA;
    }

    @Override // p117m.C2850b.a
    /* renamed from: e */
    public void mo9559e(C2857i c2857i, float f4) {
        float f5 = f11034n;
        if (f4 > (-f5) && f4 < f5) {
            mo9563i(c2857i, true);
            return;
        }
        if (this.f11044j == 0) {
            m9643l(0, c2857i, f4);
            m9642k(c2857i, 0);
            this.f11045k = 0;
            return;
        }
        int iM9648o = m9648o(c2857i);
        if (iM9648o != -1) {
            this.f11041g[iM9648o] = f4;
            return;
        }
        if (this.f11044j + 1 >= this.f11036b) {
            m9645n();
        }
        int i4 = this.f11044j;
        int i5 = this.f11045k;
        int i6 = -1;
        for (int i7 = 0; i7 < i4; i7++) {
            int[] iArr = this.f11040f;
            int i8 = iArr[i5];
            int i9 = c2857i.f11016c;
            if (i8 == i9) {
                this.f11041g[i5] = f4;
                return;
            }
            if (iArr[i5] < i9) {
                i6 = i5;
            }
            i5 = this.f11043i[i5];
            if (i5 == -1) {
                break;
            }
        }
        m9646p(i6, c2857i, f4);
    }

    @Override // p117m.C2850b.a
    /* renamed from: f */
    public C2857i mo9560f(int i4) {
        int i5 = this.f11044j;
        if (i5 == 0) {
            return null;
        }
        int i6 = this.f11045k;
        for (int i7 = 0; i7 < i5; i7++) {
            if (i7 == i4 && i6 != -1) {
                return this.f11047m.f10979d[this.f11040f[i6]];
            }
            i6 = this.f11043i[i6];
            if (i6 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // p117m.C2850b.a
    /* renamed from: g */
    public void mo9561g(float f4) {
        int i4 = this.f11044j;
        int i5 = this.f11045k;
        for (int i6 = 0; i6 < i4; i6++) {
            float[] fArr = this.f11041g;
            fArr[i5] = fArr[i5] / f4;
            i5 = this.f11043i[i5];
            if (i5 == -1) {
                return;
            }
        }
    }

    @Override // p117m.C2850b.a
    public int getCurrentSize() {
        return this.f11044j;
    }

    @Override // p117m.C2850b.a
    /* renamed from: h */
    public float mo9562h(C2850b c2850b, boolean z3) {
        float fMo9558d = mo9558d(c2850b.f10970a);
        mo9563i(c2850b.f10970a, z3);
        C2858j c2858j = (C2858j) c2850b.f10974e;
        int currentSize = c2858j.getCurrentSize();
        int i4 = 0;
        int i5 = 0;
        while (i4 < currentSize) {
            int[] iArr = c2858j.f11040f;
            if (iArr[i5] != -1) {
                mo9556b(this.f11047m.f10979d[iArr[i5]], c2858j.f11041g[i5] * fMo9558d, z3);
                i4++;
            }
            i5++;
        }
        return fMo9558d;
    }

    @Override // p117m.C2850b.a
    /* renamed from: i */
    public float mo9563i(C2857i c2857i, boolean z3) {
        int iM9648o = m9648o(c2857i);
        if (iM9648o == -1) {
            return IGoodView.DEFAULT_TO_ALPHA;
        }
        m9647q(c2857i);
        float f4 = this.f11041g[iM9648o];
        if (this.f11045k == iM9648o) {
            this.f11045k = this.f11043i[iM9648o];
        }
        this.f11040f[iM9648o] = -1;
        int[] iArr = this.f11042h;
        if (iArr[iM9648o] != -1) {
            int[] iArr2 = this.f11043i;
            iArr2[iArr[iM9648o]] = iArr2[iM9648o];
        }
        int[] iArr3 = this.f11043i;
        if (iArr3[iM9648o] != -1) {
            iArr[iArr3[iM9648o]] = iArr[iM9648o];
        }
        this.f11044j--;
        c2857i.f11026m--;
        if (z3) {
            c2857i.m9637c(this.f11046l);
        }
        return f4;
    }

    @Override // p117m.C2850b.a
    /* renamed from: j */
    public void mo9564j() {
        int i4 = this.f11044j;
        int i5 = this.f11045k;
        for (int i6 = 0; i6 < i4; i6++) {
            float[] fArr = this.f11041g;
            fArr[i5] = fArr[i5] * (-1.0f);
            i5 = this.f11043i[i5];
            if (i5 == -1) {
                return;
            }
        }
    }

    /* renamed from: o */
    public int m9648o(C2857i c2857i) {
        int[] iArr;
        if (this.f11044j == 0) {
            return -1;
        }
        int i4 = c2857i.f11016c;
        int i5 = this.f11038d[i4 % this.f11037c];
        if (i5 == -1) {
            return -1;
        }
        if (this.f11040f[i5] == i4) {
            return i5;
        }
        while (true) {
            iArr = this.f11039e;
            if (iArr[i5] == -1 || this.f11040f[iArr[i5]] == i4) {
                break;
            }
            i5 = iArr[i5];
        }
        if (iArr[i5] != -1 && this.f11040f[iArr[i5]] == i4) {
            return iArr[i5];
        }
        return -1;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i4 = this.f11044j;
        for (int i5 = 0; i5 < i4; i5++) {
            C2857i c2857iMo9560f = mo9560f(i5);
            if (c2857iMo9560f != null) {
                String str2 = str + c2857iMo9560f + " = " + mo9555a(i5) + " ";
                int iM9648o = m9648o(c2857iMo9560f);
                String str3 = str2 + "[p: ";
                String str4 = (this.f11042h[iM9648o] != -1 ? str3 + this.f11047m.f10979d[this.f11040f[this.f11042h[iM9648o]]] : str3 + Constants.CP_NONE) + ", n: ";
                str = (this.f11043i[iM9648o] != -1 ? str4 + this.f11047m.f10979d[this.f11040f[this.f11043i[iM9648o]]] : str4 + Constants.CP_NONE) + "]";
            }
        }
        return str + " }";
    }
}
