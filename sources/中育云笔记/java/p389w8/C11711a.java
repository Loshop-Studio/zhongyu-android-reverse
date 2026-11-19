package p389w8;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.core.view.ViewCompat;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC8041g;
import java.lang.ref.WeakReference;

/* renamed from: w8.a */
/* loaded from: classes5.dex */
public class C11711a {

    /* renamed from: A */
    public Paint f27827A;

    /* renamed from: B */
    public PorterDuffXfermode f27828B;

    /* renamed from: C */
    public int f27829C;

    /* renamed from: D */
    public int f27830D;

    /* renamed from: E */
    public float[] f27831E;

    /* renamed from: F */
    public RectF f27832F;

    /* renamed from: G */
    public int f27833G;

    /* renamed from: H */
    public int f27834H;

    /* renamed from: I */
    public int f27835I;

    /* renamed from: J */
    public WeakReference f27836J;

    /* renamed from: K */
    public boolean f27837K;

    /* renamed from: M */
    public boolean f27839M;

    /* renamed from: O */
    public float f27841O;

    /* renamed from: Q */
    public int f27843Q;

    /* renamed from: R */
    public int f27844R;

    /* renamed from: S */
    public int f27845S;

    /* renamed from: T */
    public int f27846T;

    /* renamed from: a */
    public Context f27847a;

    /* renamed from: b */
    public int f27848b;

    /* renamed from: c */
    public int f27849c;

    /* renamed from: d */
    public int f27850d;

    /* renamed from: e */
    public int f27851e;

    /* renamed from: f */
    public int f27852f;

    /* renamed from: g */
    public int f27853g;

    /* renamed from: h */
    public int f27854h;

    /* renamed from: i */
    public int f27855i;

    /* renamed from: k */
    public int f27857k;

    /* renamed from: l */
    public int f27858l;

    /* renamed from: m */
    public int f27859m;

    /* renamed from: n */
    public int f27860n;

    /* renamed from: p */
    public int f27862p;

    /* renamed from: q */
    public int f27863q;

    /* renamed from: r */
    public int f27864r;

    /* renamed from: s */
    public int f27865s;

    /* renamed from: u */
    public int f27867u;

    /* renamed from: v */
    public int f27868v;

    /* renamed from: w */
    public int f27869w;

    /* renamed from: x */
    public int f27870x;

    /* renamed from: z */
    public Paint f27872z;

    /* renamed from: j */
    public int f27856j = 255;

    /* renamed from: o */
    public int f27861o = 255;

    /* renamed from: t */
    public int f27866t = 255;

    /* renamed from: y */
    public int f27871y = 255;

    /* renamed from: L */
    public Path f27838L = new Path();

    /* renamed from: N */
    public int f27840N = 0;

    /* renamed from: P */
    public int f27842P = ViewCompat.MEASURED_STATE_MASK;

    /* renamed from: w8.a$a */
    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int i10;
            int i11;
            int i12;
            int i13;
            int width = view.getWidth();
            int height = view.getHeight();
            if (width == 0 || height == 0) {
                return;
            }
            if (C11711a.this.m25940w()) {
                if (C11711a.this.f27830D == 4) {
                    i12 = height;
                    i13 = 0 - C11711a.this.f27829C;
                    i11 = 0;
                } else {
                    if (C11711a.this.f27830D != 1) {
                        if (C11711a.this.f27830D == 2) {
                            width += C11711a.this.f27829C;
                        } else if (C11711a.this.f27830D == 3) {
                            height += C11711a.this.f27829C;
                        }
                        i10 = width;
                        i11 = 0;
                        i12 = height;
                        i13 = 0;
                        outline.setRoundRect(i13, i11, i10, i12, C11711a.this.f27829C);
                        return;
                    }
                    i11 = 0 - C11711a.this.f27829C;
                    i12 = height;
                    i13 = 0;
                }
                i10 = width;
                outline.setRoundRect(i13, i11, i10, i12, C11711a.this.f27829C);
                return;
            }
            int paddingTop = C11711a.this.f27845S;
            int iMax = Math.max(paddingTop + 1, height - C11711a.this.f27846T);
            int paddingLeft = C11711a.this.f27843Q;
            int iMax2 = width - C11711a.this.f27844R;
            if (C11711a.this.f27837K) {
                paddingLeft += view.getPaddingLeft();
                paddingTop += view.getPaddingTop();
                iMax2 = Math.max(paddingLeft + 1, iMax2 - view.getPaddingRight());
                iMax = Math.max(paddingTop + 1, iMax - view.getPaddingBottom());
            }
            int i14 = paddingLeft;
            int i15 = iMax;
            int i16 = paddingTop;
            int i17 = iMax2;
            float f10 = C11711a.this.f27841O;
            if (C11711a.this.f27840N == 0) {
                f10 = 1.0f;
            }
            outline.setAlpha(f10);
            if (C11711a.this.f27829C <= 0) {
                outline.setRect(i14, i16, i17, i15);
            } else {
                outline.setRoundRect(i14, i16, i17, i15, C11711a.this.f27829C);
            }
        }
    }

    public C11711a(Context context, AttributeSet attributeSet, int i10, View view) {
        boolean z10;
        int dimensionPixelSize;
        int iM12219f = 0;
        this.f27848b = 0;
        this.f27849c = 0;
        this.f27850d = 0;
        this.f27851e = 0;
        this.f27852f = 0;
        this.f27853g = 0;
        this.f27854h = 0;
        this.f27857k = 0;
        this.f27858l = 0;
        this.f27859m = 0;
        this.f27862p = 0;
        this.f27863q = 0;
        this.f27864r = 0;
        this.f27867u = 0;
        this.f27868v = 0;
        this.f27869w = 0;
        this.f27830D = 0;
        this.f27833G = 0;
        this.f27834H = 1;
        this.f27835I = 0;
        this.f27837K = false;
        this.f27839M = true;
        this.f27843Q = 0;
        this.f27844R = 0;
        this.f27845S = 0;
        this.f27846T = 0;
        this.f27847a = context;
        this.f27836J = new WeakReference(view);
        int iM12217d = AbstractC8041g.m12217d(context, R$attr.xui_config_color_separator_light);
        this.f27855i = iM12217d;
        this.f27860n = iM12217d;
        this.f27828B = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
        Paint paint = new Paint();
        this.f27827A = paint;
        paint.setAntiAlias(true);
        this.f27841O = AbstractC8041g.m12223j(context, R$attr.xui_general_shadow_alpha);
        this.f27832F = new RectF();
        if (attributeSet == null && i10 == 0) {
            z10 = false;
            dimensionPixelSize = 0;
        } else {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.XUILayout, i10, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            int dimensionPixelSize2 = 0;
            z10 = false;
            dimensionPixelSize = 0;
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == R$styleable.XUILayout_android_maxWidth) {
                    this.f27848b = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f27848b);
                } else if (index == R$styleable.XUILayout_android_maxHeight) {
                    this.f27849c = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f27849c);
                } else if (index == R$styleable.XUILayout_android_minWidth) {
                    this.f27850d = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f27850d);
                } else if (index == R$styleable.XUILayout_android_minHeight) {
                    this.f27851e = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f27851e);
                } else if (index == R$styleable.XUILayout_xui_topDividerColor) {
                    this.f27855i = typedArrayObtainStyledAttributes.getColor(index, this.f27855i);
                } else if (index == R$styleable.XUILayout_xui_topDividerHeight) {
                    this.f27852f = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f27852f);
                } else if (index == R$styleable.XUILayout_xui_topDividerInsetLeft) {
                    this.f27853g = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f27853g);
                } else if (index == R$styleable.XUILayout_xui_topDividerInsetRight) {
                    this.f27854h = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f27854h);
                } else if (index == R$styleable.XUILayout_xui_bottomDividerColor) {
                    this.f27860n = typedArrayObtainStyledAttributes.getColor(index, this.f27860n);
                } else if (index == R$styleable.XUILayout_xui_bottomDividerHeight) {
                    this.f27857k = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f27857k);
                } else if (index == R$styleable.XUILayout_xui_bottomDividerInsetLeft) {
                    this.f27858l = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f27858l);
                } else if (index == R$styleable.XUILayout_xui_bottomDividerInsetRight) {
                    this.f27859m = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f27859m);
                } else if (index == R$styleable.XUILayout_xui_leftDividerColor) {
                    this.f27865s = typedArrayObtainStyledAttributes.getColor(index, this.f27865s);
                } else if (index == R$styleable.XUILayout_xui_leftDividerWidth) {
                    this.f27862p = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f27857k);
                } else if (index == R$styleable.XUILayout_xui_leftDividerInsetTop) {
                    this.f27863q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f27863q);
                } else if (index == R$styleable.XUILayout_xui_leftDividerInsetBottom) {
                    this.f27864r = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f27864r);
                } else if (index == R$styleable.XUILayout_xui_rightDividerColor) {
                    this.f27870x = typedArrayObtainStyledAttributes.getColor(index, this.f27870x);
                } else if (index == R$styleable.XUILayout_xui_rightDividerWidth) {
                    this.f27867u = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f27867u);
                } else if (index == R$styleable.XUILayout_xui_rightDividerInsetTop) {
                    this.f27868v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f27868v);
                } else if (index == R$styleable.XUILayout_xui_rightDividerInsetBottom) {
                    this.f27869w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f27869w);
                } else if (index == R$styleable.XUILayout_xui_borderColor) {
                    this.f27833G = typedArrayObtainStyledAttributes.getColor(index, this.f27833G);
                } else if (index == R$styleable.XUILayout_xui_borderWidth) {
                    this.f27834H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f27834H);
                } else if (index == R$styleable.XUILayout_xui_radius) {
                    dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R$styleable.XUILayout_xui_outerNormalColor) {
                    this.f27835I = typedArrayObtainStyledAttributes.getColor(index, this.f27835I);
                } else if (index == R$styleable.XUILayout_xui_hideRadiusSide) {
                    this.f27830D = typedArrayObtainStyledAttributes.getColor(index, this.f27830D);
                } else if (index == R$styleable.XUILayout_xui_showBorderOnlyBeforeL) {
                    this.f27839M = typedArrayObtainStyledAttributes.getBoolean(index, this.f27839M);
                } else if (index == R$styleable.XUILayout_xui_shadowElevation) {
                    dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dimensionPixelSize2);
                } else if (index == R$styleable.XUILayout_xui_shadowAlpha) {
                    this.f27841O = typedArrayObtainStyledAttributes.getFloat(index, this.f27841O);
                } else if (index == R$styleable.XUILayout_xui_useThemeGeneralShadowElevation) {
                    z10 = typedArrayObtainStyledAttributes.getBoolean(index, false);
                } else if (index == R$styleable.XUILayout_xui_outlineInsetLeft) {
                    this.f27843Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R$styleable.XUILayout_xui_outlineInsetRight) {
                    this.f27844R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R$styleable.XUILayout_xui_outlineInsetTop) {
                    this.f27845S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R$styleable.XUILayout_xui_outlineInsetBottom) {
                    this.f27846T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R$styleable.XUILayout_xui_outlineExcludePadding) {
                    this.f27837K = typedArrayObtainStyledAttributes.getBoolean(index, false);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            iM12219f = dimensionPixelSize2;
        }
        if (iM12219f == 0 && z10) {
            iM12219f = AbstractC8041g.m12219f(context, R$attr.xui_general_shadow_elevation);
        }
        m25918G(dimensionPixelSize, this.f27830D, iM12219f, this.f27841O);
    }

    /* renamed from: P */
    public static boolean m25902P() {
        return true;
    }

    /* renamed from: A */
    public void m25912A(int i10) {
        if (this.f27830D == i10) {
            return;
        }
        m25918G(this.f27829C, i10, this.f27840N, this.f27841O);
    }

    /* renamed from: B */
    public void m25913B(int i10) {
        this.f27866t = i10;
    }

    /* renamed from: C */
    public void m25914C(int i10) {
        this.f27835I = i10;
        View view = (View) this.f27836J.get();
        if (view != null) {
            view.invalidate();
        }
    }

    /* renamed from: D */
    public void m25915D(boolean z10) {
        View view;
        if (!m25902P() || (view = (View) this.f27836J.get()) == null) {
            return;
        }
        this.f27837K = z10;
        view.invalidateOutline();
    }

    /* renamed from: E */
    public void m25916E(int i10) {
        if (this.f27829C != i10) {
            m25917F(i10, this.f27840N, this.f27841O);
        }
    }

    /* renamed from: F */
    public void m25917F(int i10, int i11, float f10) {
        m25918G(i10, this.f27830D, i11, f10);
    }

    /* renamed from: G */
    public void m25918G(int i10, int i11, int i12, float f10) {
        m25919H(i10, i11, i12, this.f27842P, f10);
    }

    /* renamed from: H */
    public void m25919H(int i10, int i11, int i12, int i13, float f10) {
        View view = (View) this.f27836J.get();
        if (view == null) {
            return;
        }
        this.f27829C = i10;
        this.f27830D = i11;
        if (i10 > 0) {
            if (i11 == 1) {
                this.f27831E = new float[]{0.0f, 0.0f, 0.0f, 0.0f, i10, i10, i10, i10};
            } else if (i11 == 2) {
                this.f27831E = new float[]{i10, i10, 0.0f, 0.0f, 0.0f, 0.0f, i10, i10};
            } else if (i11 == 3) {
                this.f27831E = new float[]{i10, i10, i10, i10, 0.0f, 0.0f, 0.0f, 0.0f};
            } else if (i11 == 4) {
                this.f27831E = new float[]{0.0f, 0.0f, i10, i10, i10, i10, 0.0f, 0.0f};
            } else {
                this.f27831E = null;
            }
        }
        this.f27840N = i12;
        this.f27841O = f10;
        this.f27842P = i13;
        if (m25902P()) {
            if (this.f27840N == 0 || m25940w()) {
                view.setElevation(0.0f);
            } else {
                view.setElevation(this.f27840N);
            }
            m25923L(this.f27842P);
            view.setOutlineProvider(new a());
            view.setClipToOutline(this.f27829C > 0);
        }
        view.invalidate();
    }

    /* renamed from: I */
    public void m25920I(int i10) {
        this.f27871y = i10;
    }

    /* renamed from: J */
    public void m25921J(float f10) {
        if (this.f27841O == f10) {
            return;
        }
        this.f27841O = f10;
        m25939v();
    }

    /* renamed from: K */
    public void m25922K(int i10) {
        if (this.f27842P == i10) {
            return;
        }
        this.f27842P = i10;
        m25923L(i10);
    }

    /* renamed from: L */
    public final void m25923L(int i10) {
        View view;
        if (Build.VERSION.SDK_INT < 28 || (view = (View) this.f27836J.get()) == null) {
            return;
        }
        view.setOutlineAmbientShadowColor(i10);
        view.setOutlineSpotShadowColor(i10);
    }

    /* renamed from: M */
    public void m25924M(int i10) {
        if (this.f27840N == i10) {
            return;
        }
        this.f27840N = i10;
        m25939v();
    }

    /* renamed from: N */
    public void m25925N(boolean z10) {
        this.f27839M = z10;
        m25939v();
    }

    /* renamed from: O */
    public void m25926O(int i10) {
        this.f27856j = i10;
    }

    /* renamed from: j */
    public void m25927j(Canvas canvas) {
        Canvas canvas2;
        if (((View) this.f27836J.get()) == null) {
            return;
        }
        if (this.f27833G == 0 && (this.f27829C == 0 || this.f27835I == 0)) {
            return;
        }
        if (this.f27839M && m25902P() && this.f27840N != 0) {
            return;
        }
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        if (this.f27837K) {
            this.f27832F.set(r0.getPaddingLeft() + 1, r0.getPaddingTop() + 1, (width - 1) - r0.getPaddingRight(), (height - 1) - r0.getPaddingBottom());
        } else {
            this.f27832F.set(1.0f, 1.0f, width - 1, height - 1);
        }
        if (this.f27829C == 0 || (!m25902P() && this.f27835I == 0)) {
            this.f27827A.setStyle(Paint.Style.STROKE);
            this.f27827A.setColor(this.f27833G);
            canvas.drawRect(this.f27832F, this.f27827A);
            return;
        }
        if (m25902P()) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            int iSaveLayer = canvas2.saveLayer(0.0f, 0.0f, width, height, null, 31);
            canvas2.drawColor(this.f27835I);
            this.f27827A.setColor(this.f27835I);
            this.f27827A.setStyle(Paint.Style.FILL);
            this.f27827A.setXfermode(this.f27828B);
            float[] fArr = this.f27831E;
            if (fArr == null) {
                RectF rectF = this.f27832F;
                int i10 = this.f27829C;
                canvas2.drawRoundRect(rectF, i10, i10, this.f27827A);
            } else {
                m25929l(canvas2, this.f27832F, fArr, this.f27827A);
            }
            this.f27827A.setXfermode(null);
            canvas2.restoreToCount(iSaveLayer);
        }
        this.f27827A.setColor(this.f27833G);
        this.f27827A.setStrokeWidth(this.f27834H);
        this.f27827A.setStyle(Paint.Style.STROKE);
        float[] fArr2 = this.f27831E;
        if (fArr2 != null) {
            m25929l(canvas2, this.f27832F, fArr2, this.f27827A);
            return;
        }
        RectF rectF2 = this.f27832F;
        int i11 = this.f27829C;
        canvas2.drawRoundRect(rectF2, i11, i11, this.f27827A);
    }

    /* renamed from: k */
    public void m25928k(Canvas canvas, int i10, int i11) {
        if (this.f27872z == null && (this.f27852f > 0 || this.f27857k > 0 || this.f27862p > 0 || this.f27867u > 0)) {
            this.f27872z = new Paint();
        }
        int i12 = this.f27852f;
        if (i12 > 0) {
            this.f27872z.setStrokeWidth(i12);
            this.f27872z.setColor(this.f27855i);
            int i13 = this.f27856j;
            if (i13 < 255) {
                this.f27872z.setAlpha(i13);
            }
            float f10 = (this.f27852f * 1.0f) / 2.0f;
            canvas.drawLine(this.f27853g, f10, i10 - this.f27854h, f10, this.f27872z);
        }
        int i14 = this.f27857k;
        if (i14 > 0) {
            this.f27872z.setStrokeWidth(i14);
            this.f27872z.setColor(this.f27860n);
            int i15 = this.f27861o;
            if (i15 < 255) {
                this.f27872z.setAlpha(i15);
            }
            float fFloor = (float) Math.floor(i11 - ((this.f27857k * 1.0f) / 2.0f));
            canvas.drawLine(this.f27858l, fFloor, i10 - this.f27859m, fFloor, this.f27872z);
        }
        int i16 = this.f27862p;
        if (i16 > 0) {
            this.f27872z.setStrokeWidth(i16);
            this.f27872z.setColor(this.f27865s);
            int i17 = this.f27866t;
            if (i17 < 255) {
                this.f27872z.setAlpha(i17);
            }
            canvas.drawLine(0.0f, this.f27863q, 0.0f, i11 - this.f27864r, this.f27872z);
        }
        int i18 = this.f27867u;
        if (i18 > 0) {
            this.f27872z.setStrokeWidth(i18);
            this.f27872z.setColor(this.f27870x);
            int i19 = this.f27871y;
            if (i19 < 255) {
                this.f27872z.setAlpha(i19);
            }
            float f11 = i10;
            canvas.drawLine(f11, this.f27868v, f11, i11 - this.f27869w, this.f27872z);
        }
    }

    /* renamed from: l */
    public final void m25929l(Canvas canvas, RectF rectF, float[] fArr, Paint paint) {
        this.f27838L.reset();
        this.f27838L.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(this.f27838L, paint);
    }

    /* renamed from: m */
    public int m25930m() {
        return this.f27830D;
    }

    /* renamed from: n */
    public int m25931n(int i10) {
        return (this.f27849c <= 0 || View.MeasureSpec.getSize(i10) <= this.f27849c) ? i10 : View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE ? View.MeasureSpec.makeMeasureSpec(this.f27848b, Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(this.f27848b, 1073741824);
    }

    /* renamed from: o */
    public int m25932o(int i10) {
        return (this.f27848b <= 0 || View.MeasureSpec.getSize(i10) <= this.f27848b) ? i10 : View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE ? View.MeasureSpec.makeMeasureSpec(this.f27848b, Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(this.f27848b, 1073741824);
    }

    /* renamed from: p */
    public int m25933p() {
        return this.f27829C;
    }

    /* renamed from: q */
    public float m25934q() {
        return this.f27841O;
    }

    /* renamed from: r */
    public int m25935r() {
        return this.f27842P;
    }

    /* renamed from: s */
    public int m25936s() {
        return this.f27840N;
    }

    /* renamed from: t */
    public int m25937t(int i10, int i11) {
        int i12;
        return (View.MeasureSpec.getMode(i10) == 1073741824 || i11 >= (i12 = this.f27851e)) ? i10 : View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
    }

    /* renamed from: u */
    public int m25938u(int i10, int i11) {
        int i12;
        return (View.MeasureSpec.getMode(i10) == 1073741824 || i11 >= (i12 = this.f27850d)) ? i10 : View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
    }

    /* renamed from: v */
    public final void m25939v() {
        View view;
        if (!m25902P() || (view = (View) this.f27836J.get()) == null) {
            return;
        }
        int i10 = this.f27840N;
        if (i10 == 0) {
            view.setElevation(0.0f);
        } else {
            view.setElevation(i10);
        }
        view.invalidateOutline();
    }

    /* renamed from: w */
    public boolean m25940w() {
        return this.f27829C > 0 && this.f27830D != 0;
    }

    /* renamed from: x */
    public void m25941x(int i10) {
        this.f27833G = i10;
    }

    /* renamed from: y */
    public void m25942y(int i10) {
        this.f27834H = i10;
    }

    /* renamed from: z */
    public void m25943z(int i10) {
        this.f27861o = i10;
    }
}
