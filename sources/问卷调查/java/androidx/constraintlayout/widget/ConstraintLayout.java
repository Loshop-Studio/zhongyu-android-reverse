package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.xuexiang.xui.widget.edittext.materialedittext.MaterialEditText;
import io.github.inflationx.calligraphy3.BuildConfig;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import p000a.p022f.p025b.C0142d;
import p000a.p022f.p025b.p026i.C0150d;
import p000a.p022f.p025b.p026i.C0151e;
import p000a.p022f.p025b.p026i.C0152f;
import p000a.p022f.p025b.p026i.C0154h;
import p000a.p022f.p025b.p026i.C0155i;
import p000a.p022f.p025b.p026i.C0157k;
import p000a.p022f.p025b.p026i.InterfaceC0153g;
import p000a.p022f.p025b.p026i.p027l.C0159b;
import p000a.p022f.p028c.AbstractC0173c;
import p000a.p022f.p028c.AbstractC0177g;
import p000a.p022f.p028c.C0171a;
import p000a.p022f.p028c.C0172b;
import p000a.p022f.p028c.C0174d;
import p000a.p022f.p028c.C0175e;
import p000a.p022f.p028c.C0176f;
import p000a.p022f.p028c.C0178h;
import p000a.p022f.p028c.C0180j;
import p070b.p071a.p072a.p073a.C0561a;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: b */
    public SparseArray<View> f2998b;

    /* renamed from: c */
    public ArrayList<AbstractC0173c> f2999c;

    /* renamed from: d */
    public C0151e f3000d;

    /* renamed from: e */
    public int f3001e;

    /* renamed from: f */
    public int f3002f;

    /* renamed from: g */
    public int f3003g;

    /* renamed from: h */
    public int f3004h;

    /* renamed from: i */
    public boolean f3005i;

    /* renamed from: j */
    public int f3006j;

    /* renamed from: k */
    public C0175e f3007k;

    /* renamed from: l */
    public C0174d f3008l;

    /* renamed from: m */
    public int f3009m;

    /* renamed from: n */
    public HashMap<String, Integer> f3010n;

    /* renamed from: o */
    public int f3011o;

    /* renamed from: p */
    public int f3012p;

    /* renamed from: q */
    public SparseArray<C0150d> f3013q;

    /* renamed from: r */
    public C0500b f3014r;

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    public static class C0499a extends ViewGroup.MarginLayoutParams {

        /* renamed from: A */
        public float f3015A;

        /* renamed from: B */
        public String f3016B;

        /* renamed from: C */
        public int f3017C;

        /* renamed from: D */
        public float f3018D;

        /* renamed from: E */
        public float f3019E;

        /* renamed from: F */
        public int f3020F;

        /* renamed from: G */
        public int f3021G;

        /* renamed from: H */
        public int f3022H;

        /* renamed from: I */
        public int f3023I;

        /* renamed from: J */
        public int f3024J;

        /* renamed from: K */
        public int f3025K;

        /* renamed from: L */
        public int f3026L;

        /* renamed from: M */
        public int f3027M;

        /* renamed from: N */
        public float f3028N;

        /* renamed from: O */
        public float f3029O;

        /* renamed from: P */
        public int f3030P;

        /* renamed from: Q */
        public int f3031Q;

        /* renamed from: R */
        public int f3032R;

        /* renamed from: S */
        public boolean f3033S;

        /* renamed from: T */
        public boolean f3034T;

        /* renamed from: U */
        public String f3035U;

        /* renamed from: V */
        public boolean f3036V;

        /* renamed from: W */
        public boolean f3037W;

        /* renamed from: X */
        public boolean f3038X;

        /* renamed from: Y */
        public boolean f3039Y;

        /* renamed from: Z */
        public boolean f3040Z;

        /* renamed from: a */
        public int f3041a;

        /* renamed from: a0 */
        public boolean f3042a0;

        /* renamed from: b */
        public int f3043b;

        /* renamed from: b0 */
        public int f3044b0;

        /* renamed from: c */
        public float f3045c;

        /* renamed from: c0 */
        public int f3046c0;

        /* renamed from: d */
        public int f3047d;

        /* renamed from: d0 */
        public int f3048d0;

        /* renamed from: e */
        public int f3049e;

        /* renamed from: e0 */
        public int f3050e0;

        /* renamed from: f */
        public int f3051f;

        /* renamed from: f0 */
        public int f3052f0;

        /* renamed from: g */
        public int f3053g;

        /* renamed from: g0 */
        public int f3054g0;

        /* renamed from: h */
        public int f3055h;

        /* renamed from: h0 */
        public float f3056h0;

        /* renamed from: i */
        public int f3057i;

        /* renamed from: i0 */
        public int f3058i0;

        /* renamed from: j */
        public int f3059j;

        /* renamed from: j0 */
        public int f3060j0;

        /* renamed from: k */
        public int f3061k;

        /* renamed from: k0 */
        public float f3062k0;

        /* renamed from: l */
        public int f3063l;

        /* renamed from: l0 */
        public C0150d f3064l0;

        /* renamed from: m */
        public int f3065m;

        /* renamed from: n */
        public int f3066n;

        /* renamed from: o */
        public float f3067o;

        /* renamed from: p */
        public int f3068p;

        /* renamed from: q */
        public int f3069q;

        /* renamed from: r */
        public int f3070r;

        /* renamed from: s */
        public int f3071s;

        /* renamed from: t */
        public int f3072t;

        /* renamed from: u */
        public int f3073u;

        /* renamed from: v */
        public int f3074v;

        /* renamed from: w */
        public int f3075w;

        /* renamed from: x */
        public int f3076x;

        /* renamed from: y */
        public int f3077y;

        /* renamed from: z */
        public float f3078z;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a$a */
        public static class a {

            /* renamed from: a */
            public static final SparseIntArray f3079a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f3079a = sparseIntArray;
                sparseIntArray.append(63, 8);
                sparseIntArray.append(64, 9);
                sparseIntArray.append(66, 10);
                sparseIntArray.append(67, 11);
                sparseIntArray.append(73, 12);
                sparseIntArray.append(72, 13);
                sparseIntArray.append(45, 14);
                sparseIntArray.append(44, 15);
                sparseIntArray.append(42, 16);
                sparseIntArray.append(46, 2);
                sparseIntArray.append(48, 3);
                sparseIntArray.append(47, 4);
                sparseIntArray.append(81, 49);
                sparseIntArray.append(82, 50);
                sparseIntArray.append(52, 5);
                sparseIntArray.append(53, 6);
                sparseIntArray.append(54, 7);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(68, 17);
                sparseIntArray.append(69, 18);
                sparseIntArray.append(51, 19);
                sparseIntArray.append(50, 20);
                sparseIntArray.append(85, 21);
                sparseIntArray.append(88, 22);
                sparseIntArray.append(86, 23);
                sparseIntArray.append(83, 24);
                sparseIntArray.append(87, 25);
                sparseIntArray.append(84, 26);
                sparseIntArray.append(59, 29);
                sparseIntArray.append(74, 30);
                sparseIntArray.append(49, 44);
                sparseIntArray.append(61, 45);
                sparseIntArray.append(76, 46);
                sparseIntArray.append(60, 47);
                sparseIntArray.append(75, 48);
                sparseIntArray.append(40, 27);
                sparseIntArray.append(39, 28);
                sparseIntArray.append(77, 31);
                sparseIntArray.append(55, 32);
                sparseIntArray.append(79, 33);
                sparseIntArray.append(78, 34);
                sparseIntArray.append(80, 35);
                sparseIntArray.append(57, 36);
                sparseIntArray.append(56, 37);
                sparseIntArray.append(58, 38);
                sparseIntArray.append(62, 39);
                sparseIntArray.append(71, 40);
                sparseIntArray.append(65, 41);
                sparseIntArray.append(43, 42);
                sparseIntArray.append(41, 43);
                sparseIntArray.append(70, 51);
            }
        }

        public C0499a(int i, int i2) {
            super(i, i2);
            this.f3041a = -1;
            this.f3043b = -1;
            this.f3045c = -1.0f;
            this.f3047d = -1;
            this.f3049e = -1;
            this.f3051f = -1;
            this.f3053g = -1;
            this.f3055h = -1;
            this.f3057i = -1;
            this.f3059j = -1;
            this.f3061k = -1;
            this.f3063l = -1;
            this.f3065m = -1;
            this.f3066n = 0;
            this.f3067o = 0.0f;
            this.f3068p = -1;
            this.f3069q = -1;
            this.f3070r = -1;
            this.f3071s = -1;
            this.f3072t = -1;
            this.f3073u = -1;
            this.f3074v = -1;
            this.f3075w = -1;
            this.f3076x = -1;
            this.f3077y = -1;
            this.f3078z = 0.5f;
            this.f3015A = 0.5f;
            this.f3016B = null;
            this.f3017C = 1;
            this.f3018D = -1.0f;
            this.f3019E = -1.0f;
            this.f3020F = 0;
            this.f3021G = 0;
            this.f3022H = 0;
            this.f3023I = 0;
            this.f3024J = 0;
            this.f3025K = 0;
            this.f3026L = 0;
            this.f3027M = 0;
            this.f3028N = 1.0f;
            this.f3029O = 1.0f;
            this.f3030P = -1;
            this.f3031Q = -1;
            this.f3032R = -1;
            this.f3033S = false;
            this.f3034T = false;
            this.f3035U = null;
            this.f3036V = true;
            this.f3037W = true;
            this.f3038X = false;
            this.f3039Y = false;
            this.f3040Z = false;
            this.f3042a0 = false;
            this.f3044b0 = -1;
            this.f3046c0 = -1;
            this.f3048d0 = -1;
            this.f3050e0 = -1;
            this.f3052f0 = -1;
            this.f3054g0 = -1;
            this.f3056h0 = 0.5f;
            this.f3064l0 = new C0150d();
        }

        public C0499a(Context context, AttributeSet attributeSet) throws NumberFormatException {
            String str;
            int i;
            super(context, attributeSet);
            this.f3041a = -1;
            this.f3043b = -1;
            this.f3045c = -1.0f;
            this.f3047d = -1;
            this.f3049e = -1;
            this.f3051f = -1;
            this.f3053g = -1;
            this.f3055h = -1;
            this.f3057i = -1;
            this.f3059j = -1;
            this.f3061k = -1;
            this.f3063l = -1;
            this.f3065m = -1;
            this.f3066n = 0;
            this.f3067o = 0.0f;
            this.f3068p = -1;
            this.f3069q = -1;
            this.f3070r = -1;
            this.f3071s = -1;
            this.f3072t = -1;
            this.f3073u = -1;
            this.f3074v = -1;
            this.f3075w = -1;
            this.f3076x = -1;
            this.f3077y = -1;
            this.f3078z = 0.5f;
            this.f3015A = 0.5f;
            this.f3016B = null;
            this.f3017C = 1;
            this.f3018D = -1.0f;
            this.f3019E = -1.0f;
            this.f3020F = 0;
            this.f3021G = 0;
            this.f3022H = 0;
            this.f3023I = 0;
            this.f3024J = 0;
            this.f3025K = 0;
            this.f3026L = 0;
            this.f3027M = 0;
            this.f3028N = 1.0f;
            this.f3029O = 1.0f;
            this.f3030P = -1;
            this.f3031Q = -1;
            this.f3032R = -1;
            this.f3033S = false;
            this.f3034T = false;
            this.f3035U = null;
            this.f3036V = true;
            this.f3037W = true;
            this.f3038X = false;
            this.f3039Y = false;
            this.f3040Z = false;
            this.f3042a0 = false;
            this.f3044b0 = -1;
            this.f3046c0 = -1;
            this.f3048d0 = -1;
            this.f3050e0 = -1;
            this.f3052f0 = -1;
            this.f3054g0 = -1;
            this.f3056h0 = 0.5f;
            this.f3064l0 = new C0150d();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0180j.f1377b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                int i3 = a.f3079a.get(index);
                switch (i3) {
                    case MaterialEditText.FLOATING_LABEL_NORMAL /* 1 */:
                        this.f3032R = typedArrayObtainStyledAttributes.getInt(index, this.f3032R);
                        continue;
                    case MaterialEditText.FLOATING_LABEL_HIGHLIGHT /* 2 */:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f3065m);
                        this.f3065m = resourceId;
                        if (resourceId == -1) {
                            this.f3065m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 3:
                        this.f3066n = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3066n);
                        continue;
                    case 4:
                        float f2 = typedArrayObtainStyledAttributes.getFloat(index, this.f3067o) % 360.0f;
                        this.f3067o = f2;
                        if (f2 < 0.0f) {
                            this.f3067o = (360.0f - f2) % 360.0f;
                        } else {
                            continue;
                        }
                    case 5:
                        this.f3041a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f3041a);
                        continue;
                    case 6:
                        this.f3043b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f3043b);
                        continue;
                    case 7:
                        this.f3045c = typedArrayObtainStyledAttributes.getFloat(index, this.f3045c);
                        continue;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f3047d);
                        this.f3047d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f3047d = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f3049e);
                        this.f3049e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f3049e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f3051f);
                        this.f3051f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f3051f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f3053g);
                        this.f3053g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f3053g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f3055h);
                        this.f3055h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f3055h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f3057i);
                        this.f3057i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f3057i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f3059j);
                        this.f3059j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f3059j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f3061k);
                        this.f3061k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f3061k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f3063l);
                        this.f3063l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f3063l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f3068p);
                        this.f3068p = resourceId11;
                        if (resourceId11 == -1) {
                            this.f3068p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f3069q);
                        this.f3069q = resourceId12;
                        if (resourceId12 == -1) {
                            this.f3069q = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f3070r);
                        this.f3070r = resourceId13;
                        if (resourceId13 == -1) {
                            this.f3070r = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f3071s);
                        this.f3071s = resourceId14;
                        if (resourceId14 == -1) {
                            this.f3071s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 21:
                        this.f3072t = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3072t);
                        continue;
                    case 22:
                        this.f3073u = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3073u);
                        continue;
                    case 23:
                        this.f3074v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3074v);
                        continue;
                    case 24:
                        this.f3075w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3075w);
                        continue;
                    case 25:
                        this.f3076x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3076x);
                        continue;
                    case 26:
                        this.f3077y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3077y);
                        continue;
                    case 27:
                        this.f3033S = typedArrayObtainStyledAttributes.getBoolean(index, this.f3033S);
                        continue;
                    case 28:
                        this.f3034T = typedArrayObtainStyledAttributes.getBoolean(index, this.f3034T);
                        continue;
                    case 29:
                        this.f3078z = typedArrayObtainStyledAttributes.getFloat(index, this.f3078z);
                        continue;
                    case 30:
                        this.f3015A = typedArrayObtainStyledAttributes.getFloat(index, this.f3015A);
                        continue;
                    case 31:
                        int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f3022H = i4;
                        if (i4 == 1) {
                            str = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                            break;
                        }
                    case BuildConfig.VERSION_CODE /* 32 */:
                        int i5 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f3023I = i5;
                        if (i5 == 1) {
                            str = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                            break;
                        }
                    case 33:
                        try {
                            this.f3024J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3024J);
                            continue;
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f3024J) == -2) {
                                this.f3024J = -2;
                            }
                        }
                    case 34:
                        try {
                            this.f3026L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3026L);
                            continue;
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f3026L) == -2) {
                                this.f3026L = -2;
                            }
                        }
                    case 35:
                        this.f3028N = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f3028N));
                        this.f3022H = 2;
                        continue;
                    case 36:
                        try {
                            this.f3025K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3025K);
                            continue;
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f3025K) == -2) {
                                this.f3025K = -2;
                            }
                        }
                    case 37:
                        try {
                            this.f3027M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f3027M);
                            continue;
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f3027M) == -2) {
                                this.f3027M = -2;
                            }
                        }
                    case 38:
                        this.f3029O = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f3029O));
                        this.f3023I = 2;
                        continue;
                    default:
                        switch (i3) {
                            case 44:
                                String string = typedArrayObtainStyledAttributes.getString(index);
                                this.f3016B = string;
                                this.f3017C = -1;
                                if (string == null) {
                                    break;
                                } else {
                                    int length = string.length();
                                    int iIndexOf = this.f3016B.indexOf(44);
                                    if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                                        i = 0;
                                    } else {
                                        String strSubstring = this.f3016B.substring(0, iIndexOf);
                                        if (strSubstring.equalsIgnoreCase("W")) {
                                            this.f3017C = 0;
                                        } else if (strSubstring.equalsIgnoreCase("H")) {
                                            this.f3017C = 1;
                                        }
                                        i = iIndexOf + 1;
                                    }
                                    int iIndexOf2 = this.f3016B.indexOf(58);
                                    if (iIndexOf2 >= 0 && iIndexOf2 < length - 1) {
                                        String strSubstring2 = this.f3016B.substring(i, iIndexOf2);
                                        String strSubstring3 = this.f3016B.substring(iIndexOf2 + 1);
                                        if (strSubstring2.length() <= 0 || strSubstring3.length() <= 0) {
                                            break;
                                        } else {
                                            try {
                                                float f3 = Float.parseFloat(strSubstring2);
                                                float f4 = Float.parseFloat(strSubstring3);
                                                if (f3 <= 0.0f || f4 <= 0.0f) {
                                                    break;
                                                } else if (this.f3017C == 1) {
                                                    Math.abs(f4 / f3);
                                                    break;
                                                } else {
                                                    Math.abs(f3 / f4);
                                                    break;
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    } else {
                                        String strSubstring4 = this.f3016B.substring(i);
                                        if (strSubstring4.length() <= 0) {
                                            break;
                                        } else {
                                            Float.parseFloat(strSubstring4);
                                            continue;
                                        }
                                    }
                                }
                            case 45:
                                this.f3018D = typedArrayObtainStyledAttributes.getFloat(index, this.f3018D);
                                break;
                            case 46:
                                this.f3019E = typedArrayObtainStyledAttributes.getFloat(index, this.f3019E);
                                break;
                            case 47:
                                this.f3020F = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f3021G = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f3030P = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f3030P);
                                break;
                            case 50:
                                this.f3031Q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f3031Q);
                                break;
                            case 51:
                                this.f3035U = typedArrayObtainStyledAttributes.getString(index);
                                break;
                        }
                        break;
                }
                Log.e("ConstraintLayout", str);
            }
            typedArrayObtainStyledAttributes.recycle();
            m1642a();
        }

        public C0499a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3041a = -1;
            this.f3043b = -1;
            this.f3045c = -1.0f;
            this.f3047d = -1;
            this.f3049e = -1;
            this.f3051f = -1;
            this.f3053g = -1;
            this.f3055h = -1;
            this.f3057i = -1;
            this.f3059j = -1;
            this.f3061k = -1;
            this.f3063l = -1;
            this.f3065m = -1;
            this.f3066n = 0;
            this.f3067o = 0.0f;
            this.f3068p = -1;
            this.f3069q = -1;
            this.f3070r = -1;
            this.f3071s = -1;
            this.f3072t = -1;
            this.f3073u = -1;
            this.f3074v = -1;
            this.f3075w = -1;
            this.f3076x = -1;
            this.f3077y = -1;
            this.f3078z = 0.5f;
            this.f3015A = 0.5f;
            this.f3016B = null;
            this.f3017C = 1;
            this.f3018D = -1.0f;
            this.f3019E = -1.0f;
            this.f3020F = 0;
            this.f3021G = 0;
            this.f3022H = 0;
            this.f3023I = 0;
            this.f3024J = 0;
            this.f3025K = 0;
            this.f3026L = 0;
            this.f3027M = 0;
            this.f3028N = 1.0f;
            this.f3029O = 1.0f;
            this.f3030P = -1;
            this.f3031Q = -1;
            this.f3032R = -1;
            this.f3033S = false;
            this.f3034T = false;
            this.f3035U = null;
            this.f3036V = true;
            this.f3037W = true;
            this.f3038X = false;
            this.f3039Y = false;
            this.f3040Z = false;
            this.f3042a0 = false;
            this.f3044b0 = -1;
            this.f3046c0 = -1;
            this.f3048d0 = -1;
            this.f3050e0 = -1;
            this.f3052f0 = -1;
            this.f3054g0 = -1;
            this.f3056h0 = 0.5f;
            this.f3064l0 = new C0150d();
        }

        /* renamed from: a */
        public void m1642a() {
            this.f3039Y = false;
            this.f3036V = true;
            this.f3037W = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.f3033S) {
                this.f3036V = false;
                if (this.f3022H == 0) {
                    this.f3022H = 1;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.f3034T) {
                this.f3037W = false;
                if (this.f3023I == 0) {
                    this.f3023I = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.f3036V = false;
                if (i == 0 && this.f3022H == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f3033S = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f3037W = false;
                if (i2 == 0 && this.f3023I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f3034T = true;
                }
            }
            if (this.f3045c == -1.0f && this.f3041a == -1 && this.f3043b == -1) {
                return;
            }
            this.f3039Y = true;
            this.f3036V = true;
            this.f3037W = true;
            if (!(this.f3064l0 instanceof C0152f)) {
                this.f3064l0 = new C0152f();
            }
            ((C0152f) this.f3064l0).m622E(this.f3032R);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x00d0  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void resolveLayoutDirection(int r10) {
            /*
                Method dump skipped, instructions count: 253
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0499a.resolveLayoutDirection(int):void");
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$b */
    public class C0500b implements C0159b.b {

        /* renamed from: a */
        public ConstraintLayout f3080a;

        /* renamed from: b */
        public int f3081b;

        /* renamed from: c */
        public int f3082c;

        /* renamed from: d */
        public int f3083d;

        /* renamed from: e */
        public int f3084e;

        /* renamed from: f */
        public int f3085f;

        /* renamed from: g */
        public int f3086g;

        public C0500b(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
            this.f3080a = constraintLayout2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:100:0x0161 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:103:0x0166  */
        /* JADX WARN: Removed duplicated region for block: B:106:0x016a  */
        /* JADX WARN: Removed duplicated region for block: B:109:0x0172  */
        /* JADX WARN: Removed duplicated region for block: B:111:0x0175  */
        /* JADX WARN: Removed duplicated region for block: B:114:0x017d  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x0188 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:125:0x019d  */
        /* JADX WARN: Removed duplicated region for block: B:130:0x01af  */
        /* JADX WARN: Removed duplicated region for block: B:133:0x01c0  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x01cb  */
        /* JADX WARN: Removed duplicated region for block: B:136:0x01d7  */
        /* JADX WARN: Removed duplicated region for block: B:137:0x01e1  */
        /* JADX WARN: Removed duplicated region for block: B:140:0x01ee  */
        /* JADX WARN: Removed duplicated region for block: B:141:0x01f3  */
        /* JADX WARN: Removed duplicated region for block: B:144:0x01f8  */
        /* JADX WARN: Removed duplicated region for block: B:147:0x0200  */
        /* JADX WARN: Removed duplicated region for block: B:148:0x0205  */
        /* JADX WARN: Removed duplicated region for block: B:151:0x020a  */
        /* JADX WARN: Removed duplicated region for block: B:156:0x021b  */
        /* JADX WARN: Removed duplicated region for block: B:163:0x022c  */
        /* JADX WARN: Removed duplicated region for block: B:165:0x0230  */
        /* JADX WARN: Removed duplicated region for block: B:167:0x0236  */
        /* JADX WARN: Removed duplicated region for block: B:170:0x024c  */
        /* JADX WARN: Removed duplicated region for block: B:171:0x024e  */
        /* JADX WARN: Removed duplicated region for block: B:174:0x0254  */
        /* JADX WARN: Removed duplicated region for block: B:178:0x025c  */
        /* JADX WARN: Removed duplicated region for block: B:181:0x0263  */
        /* JADX WARN: Removed duplicated region for block: B:183:0x0266  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00bf  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x013b  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x014d  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x014f  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x0152  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x0154  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x0159 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:98:0x015e  */
        @android.annotation.SuppressLint({"WrongCall"})
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m1643a(p000a.p022f.p025b.p026i.C0150d r21, p000a.p022f.p025b.p026i.p027l.C0159b.a r22) {
            /*
                Method dump skipped, instructions count: 633
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0500b.m1643a(a.f.b.i.d, a.f.b.i.l.b$a):void");
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2998b = new SparseArray<>();
        this.f2999c = new ArrayList<>(4);
        this.f3000d = new C0151e();
        this.f3001e = 0;
        this.f3002f = 0;
        this.f3003g = Integer.MAX_VALUE;
        this.f3004h = Integer.MAX_VALUE;
        this.f3005i = true;
        this.f3006j = 263;
        this.f3007k = null;
        this.f3008l = null;
        this.f3009m = -1;
        this.f3010n = new HashMap<>();
        this.f3011o = -1;
        this.f3012p = -1;
        this.f3013q = new SparseArray<>();
        C0500b c0500b = new C0500b(this, this);
        this.f3014r = c0500b;
        C0151e c0151e = this.f3000d;
        c0151e.f1094W = this;
        c0151e.f1135h0 = c0500b;
        c0151e.f1134g0.f1176f = c0500b;
        this.f2998b.put(getId(), this);
        this.f3007k = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0180j.f1377b, 0, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 9) {
                    this.f3001e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f3001e);
                } else if (index == 10) {
                    this.f3002f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f3002f);
                } else if (index == 7) {
                    this.f3003g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f3003g);
                } else if (index == 8) {
                    this.f3004h = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f3004h);
                } else if (index == 89) {
                    this.f3006j = typedArrayObtainStyledAttributes.getInt(index, this.f3006j);
                } else if (index == 38) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            this.f3008l = new C0174d(getContext(), this, resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f3008l = null;
                        }
                    }
                } else if (index == 18) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C0175e c0175e = new C0175e();
                        this.f3007k = c0175e;
                        c0175e.m673d(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f3007k = null;
                    }
                    this.f3009m = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f3000d.m621J(this.f3006j);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01da  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:156:0x0305 -> B:157:0x0306). Please report as a decompilation issue!!! */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m1634a(boolean r22, android.view.View r23, p000a.p022f.p025b.p026i.C0150d r24, androidx.constraintlayout.widget.ConstraintLayout.C0499a r25, android.util.SparseArray<p000a.p022f.p025b.p026i.C0150d> r26) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 879
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.m1634a(boolean, android.view.View, a.f.b.i.d, androidx.constraintlayout.widget.ConstraintLayout$a, android.util.SparseArray):void");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0499a generateDefaultLayoutParams() {
        return new C0499a(-2, -2);
    }

    /* renamed from: c */
    public Object m1636c(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> map = this.f3010n;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f3010n.get(str);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0499a;
    }

    /* renamed from: d */
    public View m1637d(int i) {
        return this.f2998b.get(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) throws NumberFormatException {
        Object tag;
        int size;
        ArrayList<AbstractC0173c> arrayList = this.f2999c;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.f2999c.get(i).m667i();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f2 = i6;
                        float f3 = i7;
                        float f4 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f2, f3, f4, f3, paint);
                        float f5 = i7 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f4, f3, f4, f5, paint);
                        canvas.drawLine(f4, f5, f2, f5, paint);
                        canvas.drawLine(f2, f5, f2, f3, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f2, f3, f4, f5, paint);
                        canvas.drawLine(f2, f5, f4, f3, paint);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public final C0150d m1638e(View view) {
        if (view == this) {
            return this.f3000d;
        }
        if (view == null) {
            return null;
        }
        return ((C0499a) view.getLayoutParams()).f3064l0;
    }

    /* renamed from: f */
    public boolean m1639f() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    @Override // android.view.View
    public void forceLayout() {
        this.f3005i = true;
        this.f3011o = -1;
        this.f3012p = -1;
        super.forceLayout();
    }

    /* renamed from: g */
    public void m1640g(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f3010n == null) {
                this.f3010n = new HashMap<>();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            this.f3010n.put(strSubstring, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0499a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0499a(layoutParams);
    }

    public int getMaxHeight() {
        return this.f3004h;
    }

    public int getMaxWidth() {
        return this.f3003g;
    }

    public int getMinHeight() {
        return this.f3002f;
    }

    public int getMinWidth() {
        return this.f3001e;
    }

    public int getOptimizationLevel() {
        return this.f3000d.f1144q0;
    }

    /* renamed from: h */
    public final boolean m1641h() throws IllegalAccessException, Resources.NotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        String str;
        int iM664d;
        int i3;
        boolean z4;
        boolean z5;
        int i4;
        int i5;
        String resourceEntryName;
        String resourceName;
        int id;
        C0150d c0150d;
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i = 1;
            if (i7 >= childCount) {
                z = false;
                break;
            }
            if (getChildAt(i7).isLayoutRequested()) {
                z = true;
                break;
            }
            i7++;
        }
        if (!z) {
            return z;
        }
        boolean zIsInEditMode = isInEditMode();
        int childCount2 = getChildCount();
        for (int i8 = 0; i8 < childCount2; i8++) {
            C0150d c0150dM1638e = m1638e(getChildAt(i8));
            if (c0150dM1638e != null) {
                c0150dM1638e.mo610u();
            }
        }
        int i9 = -1;
        if (zIsInEditMode) {
            for (int i10 = 0; i10 < childCount2; i10++) {
                View childAt = getChildAt(i10);
                try {
                    resourceName = getResources().getResourceName(childAt.getId());
                    m1640g(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    id = childAt.getId();
                } catch (Resources.NotFoundException unused) {
                }
                if (id != 0) {
                    View viewFindViewById = this.f2998b.get(id);
                    if (viewFindViewById == null && (viewFindViewById = findViewById(id)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
                        onViewAdded(viewFindViewById);
                    }
                    if (viewFindViewById != this) {
                        c0150d = viewFindViewById == null ? null : ((C0499a) viewFindViewById.getLayoutParams()).f3064l0;
                    }
                    c0150d.f1096Y = resourceName;
                }
                c0150d = this.f3000d;
                c0150d.f1096Y = resourceName;
            }
        }
        if (this.f3009m != -1) {
            for (int i11 = 0; i11 < childCount2; i11++) {
                View childAt2 = getChildAt(i11);
                if (childAt2.getId() == this.f3009m && (childAt2 instanceof C0176f)) {
                    this.f3007k = ((C0176f) childAt2).getConstraintSet();
                }
            }
        }
        C0175e c0175e = this.f3007k;
        if (c0175e != null) {
            int childCount3 = getChildCount();
            HashSet hashSet = new HashSet(c0175e.f1262c.keySet());
            while (i6 < childCount3) {
                View childAt3 = getChildAt(i6);
                int id2 = childAt3.getId();
                if (!c0175e.f1262c.containsKey(Integer.valueOf(id2))) {
                    StringBuilder sbM2079g = C0561a.m2079g("id unknown ");
                    try {
                        resourceEntryName = childAt3.getContext().getResources().getResourceEntryName(childAt3.getId());
                    } catch (Exception unused2) {
                        resourceEntryName = "UNKNOWN";
                    }
                    sbM2079g.append(resourceEntryName);
                    Log.w("ConstraintSet", sbM2079g.toString());
                } else {
                    if (c0175e.f1261b && id2 == i9) {
                        throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                    }
                    if (id2 != i9) {
                        if (c0175e.f1262c.containsKey(Integer.valueOf(id2))) {
                            hashSet.remove(Integer.valueOf(id2));
                            C0175e.a aVar = c0175e.f1262c.get(Integer.valueOf(id2));
                            if (childAt3 instanceof C0171a) {
                                aVar.f1266d.f1303d0 = i;
                            }
                            int i12 = aVar.f1266d.f1303d0;
                            if (i12 != i9 && i12 == i) {
                                C0171a c0171a = (C0171a) childAt3;
                                c0171a.setId(id2);
                                c0171a.setType(aVar.f1266d.f1299b0);
                                c0171a.setMargin(aVar.f1266d.f1301c0);
                                c0171a.setAllowsGoneWidget(aVar.f1266d.f1315j0);
                                C0175e.b bVar = aVar.f1266d;
                                int[] iArr = bVar.f1305e0;
                                if (iArr != null) {
                                    c0171a.setReferencedIds(iArr);
                                } else {
                                    String str2 = bVar.f1307f0;
                                    if (str2 != null) {
                                        bVar.f1305e0 = c0175e.m671b(c0171a, str2);
                                        c0171a.setReferencedIds(aVar.f1266d.f1305e0);
                                    }
                                }
                            }
                            C0499a c0499a = (C0499a) childAt3.getLayoutParams();
                            c0499a.m1642a();
                            aVar.m674a(c0499a);
                            HashMap<String, C0172b> map = aVar.f1268f;
                            i3 = childCount3;
                            Class<?> cls = childAt3.getClass();
                            for (String str3 : map.keySet()) {
                                boolean z6 = z;
                                C0172b c0172b = map.get(str3);
                                HashMap<String, C0172b> map2 = map;
                                String strM2076d = C0561a.m2076d("set", str3);
                                boolean z7 = zIsInEditMode;
                                try {
                                    switch (c0172b.f1226b.ordinal()) {
                                        case MaterialEditText.FLOATING_LABEL_NONE /* 0 */:
                                            i5 = childCount2;
                                            cls.getMethod(strM2076d, Integer.TYPE).invoke(childAt3, Integer.valueOf(c0172b.f1227c));
                                            break;
                                        case MaterialEditText.FLOATING_LABEL_NORMAL /* 1 */:
                                            i5 = childCount2;
                                            cls.getMethod(strM2076d, Float.TYPE).invoke(childAt3, Float.valueOf(c0172b.f1228d));
                                            break;
                                        case MaterialEditText.FLOATING_LABEL_HIGHLIGHT /* 2 */:
                                            i5 = childCount2;
                                            cls.getMethod(strM2076d, Integer.TYPE).invoke(childAt3, Integer.valueOf(c0172b.f1231g));
                                            break;
                                        case 3:
                                            i5 = childCount2;
                                            Method method = cls.getMethod(strM2076d, Drawable.class);
                                            ColorDrawable colorDrawable = new ColorDrawable();
                                            colorDrawable.setColor(c0172b.f1231g);
                                            method.invoke(childAt3, colorDrawable);
                                            break;
                                        case 4:
                                            i5 = childCount2;
                                            cls.getMethod(strM2076d, CharSequence.class).invoke(childAt3, c0172b.f1229e);
                                            break;
                                        case 5:
                                            i5 = childCount2;
                                            cls.getMethod(strM2076d, Boolean.TYPE).invoke(childAt3, Boolean.valueOf(c0172b.f1230f));
                                            break;
                                        case 6:
                                            i5 = childCount2;
                                            try {
                                                cls.getMethod(strM2076d, Float.TYPE).invoke(childAt3, Float.valueOf(c0172b.f1228d));
                                            } catch (IllegalAccessException e2) {
                                                e = e2;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                                                e.printStackTrace();
                                                z = z6;
                                                map = map2;
                                                zIsInEditMode = z7;
                                                childCount2 = i5;
                                            } catch (NoSuchMethodException e3) {
                                                e = e3;
                                                Log.e("TransitionLayout", e.getMessage());
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                                                StringBuilder sb = new StringBuilder();
                                                sb.append(cls.getName());
                                                sb.append(" must have a method ");
                                                sb.append(strM2076d);
                                                Log.e("TransitionLayout", sb.toString());
                                                z = z6;
                                                map = map2;
                                                zIsInEditMode = z7;
                                                childCount2 = i5;
                                            } catch (InvocationTargetException e4) {
                                                e = e4;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                                                e.printStackTrace();
                                                z = z6;
                                                map = map2;
                                                zIsInEditMode = z7;
                                                childCount2 = i5;
                                            }
                                        default:
                                            i5 = childCount2;
                                            break;
                                    }
                                } catch (IllegalAccessException e5) {
                                    e = e5;
                                    i5 = childCount2;
                                } catch (NoSuchMethodException e6) {
                                    e = e6;
                                    i5 = childCount2;
                                } catch (InvocationTargetException e7) {
                                    e = e7;
                                    i5 = childCount2;
                                }
                                z = z6;
                                map = map2;
                                zIsInEditMode = z7;
                                childCount2 = i5;
                            }
                            z4 = z;
                            z5 = zIsInEditMode;
                            i4 = childCount2;
                            childAt3.setLayoutParams(c0499a);
                            C0175e.d dVar = aVar.f1264b;
                            if (dVar.f1342c == 0) {
                                childAt3.setVisibility(dVar.f1341b);
                            }
                            childAt3.setAlpha(aVar.f1264b.f1343d);
                            childAt3.setRotation(aVar.f1267e.f1347b);
                            childAt3.setRotationX(aVar.f1267e.f1348c);
                            childAt3.setRotationY(aVar.f1267e.f1349d);
                            childAt3.setScaleX(aVar.f1267e.f1350e);
                            childAt3.setScaleY(aVar.f1267e.f1351f);
                            if (!Float.isNaN(aVar.f1267e.f1352g)) {
                                childAt3.setPivotX(aVar.f1267e.f1352g);
                            }
                            if (!Float.isNaN(aVar.f1267e.f1353h)) {
                                childAt3.setPivotY(aVar.f1267e.f1353h);
                            }
                            childAt3.setTranslationX(aVar.f1267e.f1354i);
                            childAt3.setTranslationY(aVar.f1267e.f1355j);
                            childAt3.setTranslationZ(aVar.f1267e.f1356k);
                            C0175e.e eVar = aVar.f1267e;
                            if (eVar.f1357l) {
                                childAt3.setElevation(eVar.f1358m);
                            }
                        } else {
                            i3 = childCount3;
                            z4 = z;
                            z5 = zIsInEditMode;
                            i4 = childCount2;
                            Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                        }
                    }
                    i6++;
                    i9 = -1;
                    i = 1;
                    childCount3 = i3;
                    z = z4;
                    zIsInEditMode = z5;
                    childCount2 = i4;
                }
                i3 = childCount3;
                z4 = z;
                z5 = zIsInEditMode;
                i4 = childCount2;
                i6++;
                i9 = -1;
                i = 1;
                childCount3 = i3;
                z = z4;
                zIsInEditMode = z5;
                childCount2 = i4;
            }
            z2 = z;
            z3 = zIsInEditMode;
            i2 = childCount2;
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                C0175e.a aVar2 = c0175e.f1262c.get(num);
                int i13 = aVar2.f1266d.f1303d0;
                if (i13 != -1 && i13 == 1) {
                    C0171a c0171a2 = new C0171a(getContext());
                    c0171a2.setId(num.intValue());
                    C0175e.b bVar2 = aVar2.f1266d;
                    int[] iArr2 = bVar2.f1305e0;
                    if (iArr2 != null) {
                        c0171a2.setReferencedIds(iArr2);
                    } else {
                        String str4 = bVar2.f1307f0;
                        if (str4 != null) {
                            bVar2.f1305e0 = c0175e.m671b(c0171a2, str4);
                            c0171a2.setReferencedIds(aVar2.f1266d.f1305e0);
                        }
                    }
                    c0171a2.setType(aVar2.f1266d.f1299b0);
                    c0171a2.setMargin(aVar2.f1266d.f1301c0);
                    C0499a c0499aGenerateDefaultLayoutParams = generateDefaultLayoutParams();
                    c0171a2.m668j();
                    aVar2.m674a(c0499aGenerateDefaultLayoutParams);
                    addView(c0171a2, c0499aGenerateDefaultLayoutParams);
                }
                if (aVar2.f1266d.f1296a) {
                    View guideline = new Guideline(getContext());
                    guideline.setId(num.intValue());
                    C0499a c0499aGenerateDefaultLayoutParams2 = generateDefaultLayoutParams();
                    aVar2.m674a(c0499aGenerateDefaultLayoutParams2);
                    addView(guideline, c0499aGenerateDefaultLayoutParams2);
                }
            }
        } else {
            z2 = z;
            z3 = zIsInEditMode;
            i2 = childCount2;
        }
        this.f3000d.f1155e0.clear();
        int size = this.f2999c.size();
        if (size > 0) {
            for (int i14 = 0; i14 < size; i14++) {
                AbstractC0173c abstractC0173c = this.f2999c.get(i14);
                if (abstractC0173c.isInEditMode()) {
                    abstractC0173c.setIds(abstractC0173c.f1244f);
                }
                InterfaceC0153g interfaceC0153g = abstractC0173c.f1243e;
                if (interfaceC0153g != null) {
                    C0154h c0154h = (C0154h) interfaceC0153g;
                    c0154h.f1153f0 = 0;
                    Arrays.fill(c0154h.f1152e0, (Object) null);
                    for (int i15 = 0; i15 < abstractC0173c.f1241c; i15++) {
                        int i16 = abstractC0173c.f1240b[i15];
                        View viewM1637d = m1637d(i16);
                        if (viewM1637d == null && (iM664d = abstractC0173c.m664d(this, (str = abstractC0173c.f1245g.get(Integer.valueOf(i16))))) != 0) {
                            abstractC0173c.f1240b[i15] = iM664d;
                            abstractC0173c.f1245g.put(Integer.valueOf(iM664d), str);
                            viewM1637d = m1637d(iM664d);
                        }
                        if (viewM1637d != null) {
                            InterfaceC0153g interfaceC0153g2 = abstractC0173c.f1243e;
                            C0150d c0150dM1638e2 = m1638e(viewM1637d);
                            C0154h c0154h2 = (C0154h) interfaceC0153g2;
                            Objects.requireNonNull(c0154h2);
                            if (c0150dM1638e2 != c0154h2 && c0150dM1638e2 != null) {
                                int i17 = c0154h2.f1153f0 + 1;
                                C0150d[] c0150dArr = c0154h2.f1152e0;
                                if (i17 > c0150dArr.length) {
                                    c0154h2.f1152e0 = (C0150d[]) Arrays.copyOf(c0150dArr, c0150dArr.length * 2);
                                }
                                C0150d[] c0150dArr2 = c0154h2.f1152e0;
                                int i18 = c0154h2.f1153f0;
                                c0150dArr2[i18] = c0150dM1638e2;
                                c0154h2.f1153f0 = i18 + 1;
                            }
                        }
                    }
                    abstractC0173c.f1243e.mo623a(this.f3000d);
                }
            }
        }
        int i19 = i2;
        for (int i20 = 0; i20 < i19; i20++) {
            View childAt4 = getChildAt(i20);
            if (childAt4 instanceof C0178h) {
                C0178h c0178h = (C0178h) childAt4;
                if (c0178h.f1373b == -1 && !c0178h.isInEditMode()) {
                    c0178h.setVisibility(c0178h.f1375d);
                }
                View viewFindViewById2 = findViewById(c0178h.f1373b);
                c0178h.f1374c = viewFindViewById2;
                if (viewFindViewById2 != null) {
                    ((C0499a) viewFindViewById2.getLayoutParams()).f3042a0 = true;
                    c0178h.f1374c.setVisibility(0);
                    c0178h.setVisibility(0);
                }
            }
        }
        this.f3013q.clear();
        this.f3013q.put(0, this.f3000d);
        this.f3013q.put(getId(), this.f3000d);
        for (int i21 = 0; i21 < i19; i21++) {
            View childAt5 = getChildAt(i21);
            this.f3013q.put(childAt5.getId(), m1638e(childAt5));
        }
        for (int i22 = 0; i22 < i19; i22++) {
            View childAt6 = getChildAt(i22);
            C0150d c0150dM1638e3 = m1638e(childAt6);
            if (c0150dM1638e3 != null) {
                C0499a c0499a2 = (C0499a) childAt6.getLayoutParams();
                C0151e c0151e = this.f3000d;
                c0151e.f1155e0.add(c0150dM1638e3);
                C0150d c0150d2 = c0150dM1638e3.f1082K;
                if (c0150d2 != null) {
                    ((C0157k) c0150d2).f1155e0.remove(c0150dM1638e3);
                    c0150dM1638e3.f1082K = null;
                }
                c0150dM1638e3.f1082K = c0151e;
                m1634a(z3, childAt6, c0150dM1638e3, c0499a2, this.f3013q);
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0499a c0499a = (C0499a) childAt.getLayoutParams();
            C0150d c0150d = c0499a.f3064l0;
            if ((childAt.getVisibility() != 8 || c0499a.f3039Y || c0499a.f3040Z || zIsInEditMode) && !c0499a.f3042a0) {
                int iM605p = c0150d.m605p();
                int iM606q = c0150d.m606q();
                int iM604o = c0150d.m604o() + iM605p;
                int iM598i = c0150d.m598i() + iM606q;
                childAt.layout(iM605p, iM606q, iM604o, iM598i);
                if ((childAt instanceof C0178h) && (content = ((C0178h) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iM605p, iM606q, iM604o, iM598i);
                }
            }
        }
        int size = this.f2999c.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.f2999c.get(i6).m665g();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x020b A[PHI: r7
      0x020b: PHI (r7v3 boolean) = (r7v2 boolean), (r7v47 boolean) binds: [B:67:0x01ae, B:378:0x020b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0213 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0215 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x078d  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0790  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b0  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r29, int r30) {
        /*
            Method dump skipped, instructions count: 1945
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        C0150d c0150dM1638e = m1638e(view);
        if ((view instanceof Guideline) && !(c0150dM1638e instanceof C0152f)) {
            C0499a c0499a = (C0499a) view.getLayoutParams();
            C0152f c0152f = new C0152f();
            c0499a.f3064l0 = c0152f;
            c0499a.f3039Y = true;
            c0152f.m622E(c0499a.f3032R);
        }
        if (view instanceof AbstractC0173c) {
            AbstractC0173c abstractC0173c = (AbstractC0173c) view;
            abstractC0173c.m668j();
            ((C0499a) view.getLayoutParams()).f3040Z = true;
            if (!this.f2999c.contains(abstractC0173c)) {
                this.f2999c.add(abstractC0173c);
            }
        }
        this.f2998b.put(view.getId(), view);
        this.f3005i = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f2998b.remove(view.getId());
        C0150d c0150dM1638e = m1638e(view);
        this.f3000d.f1155e0.remove(c0150dM1638e);
        c0150dM1638e.f1082K = null;
        this.f2999c.remove(view);
        this.f3005i = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f3005i = true;
        this.f3011o = -1;
        this.f3012p = -1;
        super.requestLayout();
    }

    public void setConstraintSet(C0175e c0175e) {
        this.f3007k = c0175e;
    }

    @Override // android.view.View
    public void setId(int i) {
        this.f2998b.remove(getId());
        super.setId(i);
        this.f2998b.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f3004h) {
            return;
        }
        this.f3004h = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f3003g) {
            return;
        }
        this.f3003g = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f3002f) {
            return;
        }
        this.f3002f = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f3001e) {
            return;
        }
        this.f3001e = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC0177g abstractC0177g) {
        C0174d c0174d = this.f3008l;
        if (c0174d != null) {
            Objects.requireNonNull(c0174d);
        }
    }

    public void setOptimizationLevel(int i) {
        this.f3006j = i;
        this.f3000d.f1144q0 = i;
        C0142d.f976p = C0155i.m624a(i, 256);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
