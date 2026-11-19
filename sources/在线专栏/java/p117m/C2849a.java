package p117m;

import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.util.Arrays;
import p117m.C2850b;

/* renamed from: m.a */
/* loaded from: classes.dex */
public class C2849a implements C2850b.a {

    /* renamed from: l */
    private static float f10958l = 0.001f;

    /* renamed from: b */
    private final C2850b f10960b;

    /* renamed from: c */
    protected final C2851c f10961c;

    /* renamed from: a */
    int f10959a = 0;

    /* renamed from: d */
    private int f10962d = 8;

    /* renamed from: e */
    private C2857i f10963e = null;

    /* renamed from: f */
    private int[] f10964f = new int[8];

    /* renamed from: g */
    private int[] f10965g = new int[8];

    /* renamed from: h */
    private float[] f10966h = new float[8];

    /* renamed from: i */
    private int f10967i = -1;

    /* renamed from: j */
    private int f10968j = -1;

    /* renamed from: k */
    private boolean f10969k = false;

    C2849a(C2850b c2850b, C2851c c2851c) {
        this.f10960b = c2850b;
        this.f10961c = c2851c;
    }

    @Override // p117m.C2850b.a
    /* renamed from: a */
    public float mo9555a(int i4) {
        int i5 = this.f10967i;
        for (int i6 = 0; i5 != -1 && i6 < this.f10959a; i6++) {
            if (i6 == i4) {
                return this.f10966h[i5];
            }
            i5 = this.f10965g[i5];
        }
        return IGoodView.DEFAULT_TO_ALPHA;
    }

    @Override // p117m.C2850b.a
    /* renamed from: b */
    public void mo9556b(C2857i c2857i, float f4, boolean z3) {
        float f5 = f10958l;
        if (f4 <= (-f5) || f4 >= f5) {
            int i4 = this.f10967i;
            if (i4 == -1) {
                this.f10967i = 0;
                this.f10966h[0] = f4;
                this.f10964f[0] = c2857i.f11016c;
                this.f10965g[0] = -1;
                c2857i.f11026m++;
                c2857i.m9636a(this.f10960b);
                this.f10959a++;
                if (this.f10969k) {
                    return;
                }
                int i5 = this.f10968j + 1;
                this.f10968j = i5;
                int[] iArr = this.f10964f;
                if (i5 >= iArr.length) {
                    this.f10969k = true;
                    this.f10968j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i6 = -1;
            for (int i7 = 0; i4 != -1 && i7 < this.f10959a; i7++) {
                int[] iArr2 = this.f10964f;
                int i8 = iArr2[i4];
                int i9 = c2857i.f11016c;
                if (i8 == i9) {
                    float[] fArr = this.f10966h;
                    float f6 = fArr[i4] + f4;
                    float f7 = f10958l;
                    if (f6 > (-f7) && f6 < f7) {
                        f6 = IGoodView.DEFAULT_TO_ALPHA;
                    }
                    fArr[i4] = f6;
                    if (f6 == IGoodView.DEFAULT_TO_ALPHA) {
                        if (i4 == this.f10967i) {
                            this.f10967i = this.f10965g[i4];
                        } else {
                            int[] iArr3 = this.f10965g;
                            iArr3[i6] = iArr3[i4];
                        }
                        if (z3) {
                            c2857i.m9637c(this.f10960b);
                        }
                        if (this.f10969k) {
                            this.f10968j = i4;
                        }
                        c2857i.f11026m--;
                        this.f10959a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i4] < i9) {
                    i6 = i4;
                }
                i4 = this.f10965g[i4];
            }
            int length = this.f10968j;
            int i10 = length + 1;
            if (this.f10969k) {
                int[] iArr4 = this.f10964f;
                if (iArr4[length] != -1) {
                    length = iArr4.length;
                }
            } else {
                length = i10;
            }
            int[] iArr5 = this.f10964f;
            if (length >= iArr5.length && this.f10959a < iArr5.length) {
                int i11 = 0;
                while (true) {
                    int[] iArr6 = this.f10964f;
                    if (i11 >= iArr6.length) {
                        break;
                    }
                    if (iArr6[i11] == -1) {
                        length = i11;
                        break;
                    }
                    i11++;
                }
            }
            int[] iArr7 = this.f10964f;
            if (length >= iArr7.length) {
                length = iArr7.length;
                int i12 = this.f10962d * 2;
                this.f10962d = i12;
                this.f10969k = false;
                this.f10968j = length - 1;
                this.f10966h = Arrays.copyOf(this.f10966h, i12);
                this.f10964f = Arrays.copyOf(this.f10964f, this.f10962d);
                this.f10965g = Arrays.copyOf(this.f10965g, this.f10962d);
            }
            this.f10964f[length] = c2857i.f11016c;
            this.f10966h[length] = f4;
            if (i6 != -1) {
                int[] iArr8 = this.f10965g;
                iArr8[length] = iArr8[i6];
                iArr8[i6] = length;
            } else {
                this.f10965g[length] = this.f10967i;
                this.f10967i = length;
            }
            c2857i.f11026m++;
            c2857i.m9636a(this.f10960b);
            this.f10959a++;
            if (!this.f10969k) {
                this.f10968j++;
            }
            int i13 = this.f10968j;
            int[] iArr9 = this.f10964f;
            if (i13 >= iArr9.length) {
                this.f10969k = true;
                this.f10968j = iArr9.length - 1;
            }
        }
    }

    @Override // p117m.C2850b.a
    /* renamed from: c */
    public boolean mo9557c(C2857i c2857i) {
        int i4 = this.f10967i;
        if (i4 == -1) {
            return false;
        }
        for (int i5 = 0; i4 != -1 && i5 < this.f10959a; i5++) {
            if (this.f10964f[i4] == c2857i.f11016c) {
                return true;
            }
            i4 = this.f10965g[i4];
        }
        return false;
    }

    @Override // p117m.C2850b.a
    public final void clear() {
        int i4 = this.f10967i;
        for (int i5 = 0; i4 != -1 && i5 < this.f10959a; i5++) {
            C2857i c2857i = this.f10961c.f10979d[this.f10964f[i4]];
            if (c2857i != null) {
                c2857i.m9637c(this.f10960b);
            }
            i4 = this.f10965g[i4];
        }
        this.f10967i = -1;
        this.f10968j = -1;
        this.f10969k = false;
        this.f10959a = 0;
    }

    @Override // p117m.C2850b.a
    /* renamed from: d */
    public final float mo9558d(C2857i c2857i) {
        int i4 = this.f10967i;
        for (int i5 = 0; i4 != -1 && i5 < this.f10959a; i5++) {
            if (this.f10964f[i4] == c2857i.f11016c) {
                return this.f10966h[i4];
            }
            i4 = this.f10965g[i4];
        }
        return IGoodView.DEFAULT_TO_ALPHA;
    }

    @Override // p117m.C2850b.a
    /* renamed from: e */
    public final void mo9559e(C2857i c2857i, float f4) {
        if (f4 == IGoodView.DEFAULT_TO_ALPHA) {
            mo9563i(c2857i, true);
            return;
        }
        int i4 = this.f10967i;
        if (i4 == -1) {
            this.f10967i = 0;
            this.f10966h[0] = f4;
            this.f10964f[0] = c2857i.f11016c;
            this.f10965g[0] = -1;
            c2857i.f11026m++;
            c2857i.m9636a(this.f10960b);
            this.f10959a++;
            if (this.f10969k) {
                return;
            }
            int i5 = this.f10968j + 1;
            this.f10968j = i5;
            int[] iArr = this.f10964f;
            if (i5 >= iArr.length) {
                this.f10969k = true;
                this.f10968j = iArr.length - 1;
                return;
            }
            return;
        }
        int i6 = -1;
        for (int i7 = 0; i4 != -1 && i7 < this.f10959a; i7++) {
            int[] iArr2 = this.f10964f;
            int i8 = iArr2[i4];
            int i9 = c2857i.f11016c;
            if (i8 == i9) {
                this.f10966h[i4] = f4;
                return;
            }
            if (iArr2[i4] < i9) {
                i6 = i4;
            }
            i4 = this.f10965g[i4];
        }
        int length = this.f10968j;
        int i10 = length + 1;
        if (this.f10969k) {
            int[] iArr3 = this.f10964f;
            if (iArr3[length] != -1) {
                length = iArr3.length;
            }
        } else {
            length = i10;
        }
        int[] iArr4 = this.f10964f;
        if (length >= iArr4.length && this.f10959a < iArr4.length) {
            int i11 = 0;
            while (true) {
                int[] iArr5 = this.f10964f;
                if (i11 >= iArr5.length) {
                    break;
                }
                if (iArr5[i11] == -1) {
                    length = i11;
                    break;
                }
                i11++;
            }
        }
        int[] iArr6 = this.f10964f;
        if (length >= iArr6.length) {
            length = iArr6.length;
            int i12 = this.f10962d * 2;
            this.f10962d = i12;
            this.f10969k = false;
            this.f10968j = length - 1;
            this.f10966h = Arrays.copyOf(this.f10966h, i12);
            this.f10964f = Arrays.copyOf(this.f10964f, this.f10962d);
            this.f10965g = Arrays.copyOf(this.f10965g, this.f10962d);
        }
        this.f10964f[length] = c2857i.f11016c;
        this.f10966h[length] = f4;
        if (i6 != -1) {
            int[] iArr7 = this.f10965g;
            iArr7[length] = iArr7[i6];
            iArr7[i6] = length;
        } else {
            this.f10965g[length] = this.f10967i;
            this.f10967i = length;
        }
        c2857i.f11026m++;
        c2857i.m9636a(this.f10960b);
        int i13 = this.f10959a + 1;
        this.f10959a = i13;
        if (!this.f10969k) {
            this.f10968j++;
        }
        int[] iArr8 = this.f10964f;
        if (i13 >= iArr8.length) {
            this.f10969k = true;
        }
        if (this.f10968j >= iArr8.length) {
            this.f10969k = true;
            this.f10968j = iArr8.length - 1;
        }
    }

    @Override // p117m.C2850b.a
    /* renamed from: f */
    public C2857i mo9560f(int i4) {
        int i5 = this.f10967i;
        for (int i6 = 0; i5 != -1 && i6 < this.f10959a; i6++) {
            if (i6 == i4) {
                return this.f10961c.f10979d[this.f10964f[i5]];
            }
            i5 = this.f10965g[i5];
        }
        return null;
    }

    @Override // p117m.C2850b.a
    /* renamed from: g */
    public void mo9561g(float f4) {
        int i4 = this.f10967i;
        for (int i5 = 0; i4 != -1 && i5 < this.f10959a; i5++) {
            float[] fArr = this.f10966h;
            fArr[i4] = fArr[i4] / f4;
            i4 = this.f10965g[i4];
        }
    }

    @Override // p117m.C2850b.a
    public int getCurrentSize() {
        return this.f10959a;
    }

    @Override // p117m.C2850b.a
    /* renamed from: h */
    public float mo9562h(C2850b c2850b, boolean z3) {
        float fMo9558d = mo9558d(c2850b.f10970a);
        mo9563i(c2850b.f10970a, z3);
        C2850b.a aVar = c2850b.f10974e;
        int currentSize = aVar.getCurrentSize();
        for (int i4 = 0; i4 < currentSize; i4++) {
            C2857i c2857iMo9560f = aVar.mo9560f(i4);
            mo9556b(c2857iMo9560f, aVar.mo9558d(c2857iMo9560f) * fMo9558d, z3);
        }
        return fMo9558d;
    }

    @Override // p117m.C2850b.a
    /* renamed from: i */
    public final float mo9563i(C2857i c2857i, boolean z3) {
        if (this.f10963e == c2857i) {
            this.f10963e = null;
        }
        int i4 = this.f10967i;
        if (i4 == -1) {
            return IGoodView.DEFAULT_TO_ALPHA;
        }
        int i5 = 0;
        int i6 = -1;
        while (i4 != -1 && i5 < this.f10959a) {
            if (this.f10964f[i4] == c2857i.f11016c) {
                if (i4 == this.f10967i) {
                    this.f10967i = this.f10965g[i4];
                } else {
                    int[] iArr = this.f10965g;
                    iArr[i6] = iArr[i4];
                }
                if (z3) {
                    c2857i.m9637c(this.f10960b);
                }
                c2857i.f11026m--;
                this.f10959a--;
                this.f10964f[i4] = -1;
                if (this.f10969k) {
                    this.f10968j = i4;
                }
                return this.f10966h[i4];
            }
            i5++;
            i6 = i4;
            i4 = this.f10965g[i4];
        }
        return IGoodView.DEFAULT_TO_ALPHA;
    }

    @Override // p117m.C2850b.a
    /* renamed from: j */
    public void mo9564j() {
        int i4 = this.f10967i;
        for (int i5 = 0; i4 != -1 && i5 < this.f10959a; i5++) {
            float[] fArr = this.f10966h;
            fArr[i4] = fArr[i4] * (-1.0f);
            i4 = this.f10965g[i4];
        }
    }

    public String toString() {
        int i4 = this.f10967i;
        String str = "";
        for (int i5 = 0; i4 != -1 && i5 < this.f10959a; i5++) {
            str = ((str + " -> ") + this.f10966h[i4] + " : ") + this.f10961c.f10979d[this.f10964f[i4]];
            i4 = this.f10965g[i4];
        }
        return str;
    }
}
