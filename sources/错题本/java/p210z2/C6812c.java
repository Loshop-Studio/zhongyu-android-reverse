package p210z2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import androidx.compose.material3.AbstractC1923c;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.ViewCompat;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$styleable;
import java.lang.ref.WeakReference;
import kotlin.collections.AbstractC5806u;

/* renamed from: z2.c */
/* loaded from: classes3.dex */
public final class C6812c {

    /* renamed from: A */
    public int f11494A;

    /* renamed from: B */
    public int f11495B;

    /* renamed from: C */
    public float[] f11496C;

    /* renamed from: D */
    public final RectF f11497D;

    /* renamed from: E */
    public int f11498E;

    /* renamed from: F */
    public int f11499F;

    /* renamed from: G */
    public int f11500G;

    /* renamed from: H */
    public final WeakReference f11501H;

    /* renamed from: I */
    public boolean f11502I;

    /* renamed from: K */
    public boolean f11504K;

    /* renamed from: M */
    public float f11506M;

    /* renamed from: O */
    public final int f11508O;

    /* renamed from: P */
    public final int f11509P;

    /* renamed from: Q */
    public final int f11510Q;

    /* renamed from: R */
    public final int f11511R;

    /* renamed from: a */
    public final int f11512a;

    /* renamed from: b */
    public final int f11513b;

    /* renamed from: c */
    public final int f11514c;

    /* renamed from: d */
    public final int f11515d;

    /* renamed from: e */
    public final int f11516e;

    /* renamed from: f */
    public final int f11517f;

    /* renamed from: g */
    public final int f11518g;

    /* renamed from: h */
    public final int f11519h;

    /* renamed from: j */
    public final int f11521j;

    /* renamed from: k */
    public final int f11522k;

    /* renamed from: l */
    public final int f11523l;

    /* renamed from: m */
    public final int f11524m;

    /* renamed from: o */
    public final int f11526o;

    /* renamed from: p */
    public final int f11527p;

    /* renamed from: q */
    public final int f11528q;

    /* renamed from: r */
    public final int f11529r;

    /* renamed from: t */
    public final int f11531t;

    /* renamed from: u */
    public final int f11532u;

    /* renamed from: v */
    public final int f11533v;

    /* renamed from: w */
    public final int f11534w;

    /* renamed from: y */
    public Paint f11536y;

    /* renamed from: z */
    public final Paint f11537z;

    /* renamed from: i */
    public int f11520i = 255;

    /* renamed from: n */
    public int f11525n = 255;

    /* renamed from: s */
    public int f11530s = 255;

    /* renamed from: x */
    public int f11535x = 255;

    /* renamed from: J */
    public final Path f11503J = new Path();

    /* renamed from: L */
    public int f11505L = 0;

    /* renamed from: N */
    public int f11507N = ViewCompat.MEASURED_STATE_MASK;

    public C6812c(Context context, AttributeSet attributeSet, int i, View view) {
        boolean z8;
        int dimensionPixelSize;
        int iM5253G = 0;
        this.f11512a = 0;
        this.f11513b = 0;
        this.f11514c = 0;
        this.f11515d = 0;
        this.f11516e = 0;
        this.f11517f = 0;
        this.f11518g = 0;
        this.f11521j = 0;
        this.f11522k = 0;
        this.f11523l = 0;
        this.f11526o = 0;
        this.f11527p = 0;
        this.f11528q = 0;
        this.f11531t = 0;
        this.f11532u = 0;
        this.f11533v = 0;
        this.f11495B = 0;
        this.f11498E = 0;
        this.f11499F = 1;
        this.f11500G = 0;
        this.f11502I = false;
        this.f11504K = true;
        this.f11508O = 0;
        this.f11509P = 0;
        this.f11510Q = 0;
        this.f11511R = 0;
        this.f11501H = new WeakReference(view);
        int iM5252F = AbstractC5806u.m5252F(context, R$attr.xui_config_color_separator_light, 0);
        this.f11519h = iM5252F;
        this.f11524m = iM5252F;
        new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
        Paint paint = new Paint();
        this.f11537z = paint;
        paint.setAntiAlias(true);
        int i8 = R$attr.xui_general_shadow_alpha;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i8, typedValue, true);
        this.f11506M = typedValue.getFloat();
        this.f11497D = new RectF();
        if (attributeSet == null && i == 0) {
            z8 = false;
            dimensionPixelSize = 0;
        } else {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.XUILayout, i, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            int dimensionPixelSize2 = 0;
            z8 = false;
            dimensionPixelSize = 0;
            for (int i9 = 0; i9 < indexCount; i9++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i9);
                if (index == R$styleable.XUILayout_android_maxWidth) {
                    this.f11512a = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f11512a);
                } else if (index == R$styleable.XUILayout_android_maxHeight) {
                    this.f11513b = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f11513b);
                } else if (index == R$styleable.XUILayout_android_minWidth) {
                    this.f11514c = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f11514c);
                } else if (index == R$styleable.XUILayout_android_minHeight) {
                    this.f11515d = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f11515d);
                } else if (index == R$styleable.XUILayout_xui_topDividerColor) {
                    this.f11519h = typedArrayObtainStyledAttributes.getColor(index, this.f11519h);
                } else if (index == R$styleable.XUILayout_xui_topDividerHeight) {
                    this.f11516e = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f11516e);
                } else if (index == R$styleable.XUILayout_xui_topDividerInsetLeft) {
                    this.f11517f = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f11517f);
                } else if (index == R$styleable.XUILayout_xui_topDividerInsetRight) {
                    this.f11518g = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f11518g);
                } else if (index == R$styleable.XUILayout_xui_bottomDividerColor) {
                    this.f11524m = typedArrayObtainStyledAttributes.getColor(index, this.f11524m);
                } else if (index == R$styleable.XUILayout_xui_bottomDividerHeight) {
                    this.f11521j = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f11521j);
                } else if (index == R$styleable.XUILayout_xui_bottomDividerInsetLeft) {
                    this.f11522k = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f11522k);
                } else if (index == R$styleable.XUILayout_xui_bottomDividerInsetRight) {
                    this.f11523l = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f11523l);
                } else if (index == R$styleable.XUILayout_xui_leftDividerColor) {
                    this.f11529r = typedArrayObtainStyledAttributes.getColor(index, this.f11529r);
                } else if (index == R$styleable.XUILayout_xui_leftDividerWidth) {
                    this.f11526o = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f11521j);
                } else if (index == R$styleable.XUILayout_xui_leftDividerInsetTop) {
                    this.f11527p = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f11527p);
                } else if (index == R$styleable.XUILayout_xui_leftDividerInsetBottom) {
                    this.f11528q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f11528q);
                } else if (index == R$styleable.XUILayout_xui_rightDividerColor) {
                    this.f11534w = typedArrayObtainStyledAttributes.getColor(index, this.f11534w);
                } else if (index == R$styleable.XUILayout_xui_rightDividerWidth) {
                    this.f11531t = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f11531t);
                } else if (index == R$styleable.XUILayout_xui_rightDividerInsetTop) {
                    this.f11532u = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f11532u);
                } else if (index == R$styleable.XUILayout_xui_rightDividerInsetBottom) {
                    this.f11533v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f11533v);
                } else if (index == R$styleable.XUILayout_xui_borderColor) {
                    this.f11498E = typedArrayObtainStyledAttributes.getColor(index, this.f11498E);
                } else if (index == R$styleable.XUILayout_xui_borderWidth) {
                    this.f11499F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f11499F);
                } else if (index == R$styleable.XUILayout_xui_radius) {
                    dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R$styleable.XUILayout_xui_outerNormalColor) {
                    this.f11500G = typedArrayObtainStyledAttributes.getColor(index, this.f11500G);
                } else if (index == R$styleable.XUILayout_xui_hideRadiusSide) {
                    this.f11495B = typedArrayObtainStyledAttributes.getColor(index, this.f11495B);
                } else if (index == R$styleable.XUILayout_xui_showBorderOnlyBeforeL) {
                    this.f11504K = typedArrayObtainStyledAttributes.getBoolean(index, this.f11504K);
                } else if (index == R$styleable.XUILayout_xui_shadowElevation) {
                    dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, dimensionPixelSize2);
                } else if (index == R$styleable.XUILayout_xui_shadowAlpha) {
                    this.f11506M = typedArrayObtainStyledAttributes.getFloat(index, this.f11506M);
                } else if (index == R$styleable.XUILayout_xui_useThemeGeneralShadowElevation) {
                    z8 = typedArrayObtainStyledAttributes.getBoolean(index, false);
                } else if (index == R$styleable.XUILayout_xui_outlineInsetLeft) {
                    this.f11508O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R$styleable.XUILayout_xui_outlineInsetRight) {
                    this.f11509P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R$styleable.XUILayout_xui_outlineInsetTop) {
                    this.f11510Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R$styleable.XUILayout_xui_outlineInsetBottom) {
                    this.f11511R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R$styleable.XUILayout_xui_outlineExcludePadding) {
                    this.f11502I = typedArrayObtainStyledAttributes.getBoolean(index, false);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            iM5253G = dimensionPixelSize2;
        }
        if (iM5253G == 0 && z8) {
            iM5253G = AbstractC5806u.m5253G(context, R$attr.xui_general_shadow_elevation, -1);
        }
        m6482l(dimensionPixelSize, this.f11495B, iM5253G, this.f11506M);
    }

    /* renamed from: a */
    public final void m6471a(Canvas canvas) {
        if (((View) this.f11501H.get()) == null) {
            return;
        }
        if (this.f11498E == 0 && (this.f11494A == 0 || this.f11500G == 0)) {
            return;
        }
        if (!this.f11504K || this.f11505L == 0) {
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            boolean z8 = this.f11502I;
            RectF rectF = this.f11497D;
            if (z8) {
                rectF.set(r0.getPaddingLeft() + 1, r0.getPaddingTop() + 1, (width - 1) - r0.getPaddingRight(), (height - 1) - r0.getPaddingBottom());
            } else {
                rectF.set(1.0f, 1.0f, width - 1, height - 1);
            }
            int i = this.f11494A;
            Paint paint = this.f11537z;
            if (i == 0) {
                paint.setStyle(Paint.Style.STROKE);
                paint.setColor(this.f11498E);
                canvas.drawRect(rectF, paint);
                return;
            }
            paint.setColor(this.f11498E);
            paint.setStrokeWidth(this.f11499F);
            paint.setStyle(Paint.Style.STROKE);
            float[] fArr = this.f11496C;
            if (fArr == null) {
                float f = this.f11494A;
                canvas.drawRoundRect(rectF, f, f, paint);
            } else {
                Path path = this.f11503J;
                path.reset();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.drawPath(path, paint);
            }
        }
    }

    /* renamed from: b */
    public final void m6472b(Canvas canvas, int i, int i8) {
        Paint paint = this.f11536y;
        int i9 = this.f11531t;
        int i10 = this.f11526o;
        int i11 = this.f11521j;
        int i12 = this.f11516e;
        if (paint == null && (i12 > 0 || i11 > 0 || i10 > 0 || i9 > 0)) {
            this.f11536y = new Paint();
        }
        if (i12 > 0) {
            this.f11536y.setStrokeWidth(i12);
            this.f11536y.setColor(this.f11519h);
            int i13 = this.f11520i;
            if (i13 < 255) {
                this.f11536y.setAlpha(i13);
            }
            float f = (i12 * 1.0f) / 2.0f;
            canvas.drawLine(this.f11517f, f, i - this.f11518g, f, this.f11536y);
        }
        if (i11 > 0) {
            this.f11536y.setStrokeWidth(i11);
            this.f11536y.setColor(this.f11524m);
            int i14 = this.f11525n;
            if (i14 < 255) {
                this.f11536y.setAlpha(i14);
            }
            float fFloor = (float) Math.floor(AbstractC1923c.m1036D(i11, 1.0f, 2.0f, i8));
            canvas.drawLine(this.f11522k, fFloor, i - this.f11523l, fFloor, this.f11536y);
        }
        if (i10 > 0) {
            this.f11536y.setStrokeWidth(i10);
            this.f11536y.setColor(this.f11529r);
            int i15 = this.f11530s;
            if (i15 < 255) {
                this.f11536y.setAlpha(i15);
            }
            canvas.drawLine(0.0f, this.f11527p, 0.0f, i8 - this.f11528q, this.f11536y);
        }
        if (i9 > 0) {
            this.f11536y.setStrokeWidth(i9);
            this.f11536y.setColor(this.f11534w);
            int i16 = this.f11535x;
            if (i16 < 255) {
                this.f11536y.setAlpha(i16);
            }
            float f7 = i;
            canvas.drawLine(f7, this.f11532u, f7, i8 - this.f11533v, this.f11536y);
        }
    }

    /* renamed from: c */
    public final int m6473c(int i) {
        int i8 = this.f11513b;
        if (i8 <= 0 || View.MeasureSpec.getSize(i) <= i8) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        int i9 = this.f11512a;
        return mode == Integer.MIN_VALUE ? View.MeasureSpec.makeMeasureSpec(i9, Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(i9, BasicMeasure.EXACTLY);
    }

    /* renamed from: d */
    public final int m6474d(int i) {
        int i8 = this.f11512a;
        return (i8 <= 0 || View.MeasureSpec.getSize(i) <= i8) ? i : View.MeasureSpec.getMode(i) == Integer.MIN_VALUE ? View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(i8, BasicMeasure.EXACTLY);
    }

    /* renamed from: e */
    public final int m6475e(int i, int i8) {
        int i9;
        return (View.MeasureSpec.getMode(i) == 1073741824 || i8 >= (i9 = this.f11515d)) ? i : View.MeasureSpec.makeMeasureSpec(i9, BasicMeasure.EXACTLY);
    }

    /* renamed from: f */
    public final int m6476f(int i, int i8) {
        int i9;
        return (View.MeasureSpec.getMode(i) == 1073741824 || i8 >= (i9 = this.f11514c)) ? i : View.MeasureSpec.makeMeasureSpec(i9, BasicMeasure.EXACTLY);
    }

    /* renamed from: g */
    public final void m6477g() {
        View view = (View) this.f11501H.get();
        if (view == null) {
            return;
        }
        int i = this.f11505L;
        if (i == 0) {
            view.setElevation(0.0f);
        } else {
            view.setElevation(i);
        }
        view.invalidateOutline();
    }

    /* renamed from: h */
    public final void m6478h(int i) {
        if (this.f11495B == i) {
            return;
        }
        m6482l(this.f11494A, i, this.f11505L, this.f11506M);
    }

    /* renamed from: i */
    public final void m6479i(int i) {
        this.f11500G = i;
        View view = (View) this.f11501H.get();
        if (view != null) {
            view.invalidate();
        }
    }

    /* renamed from: j */
    public final void m6480j(boolean z8) {
        View view = (View) this.f11501H.get();
        if (view == null) {
            return;
        }
        this.f11502I = z8;
        view.invalidateOutline();
    }

    /* renamed from: k */
    public final void m6481k(int i) {
        if (this.f11494A != i) {
            m6482l(i, this.f11495B, this.f11505L, this.f11506M);
        }
    }

    /* renamed from: l */
    public final void m6482l(int i, int i8, int i9, float f) {
        boolean z8;
        boolean z9;
        View view;
        int i10 = this.f11507N;
        WeakReference weakReference = this.f11501H;
        View view2 = (View) weakReference.get();
        if (view2 == null) {
            return;
        }
        this.f11494A = i;
        this.f11495B = i8;
        if (i > 0) {
            z9 = false;
            if (i8 == 1) {
                z8 = true;
                float f7 = i;
                this.f11496C = new float[]{0.0f, 0.0f, 0.0f, 0.0f, f7, f7, f7, f7};
            } else {
                z8 = true;
                if (i8 == 2) {
                    float f8 = i;
                    this.f11496C = new float[]{f8, f8, 0.0f, 0.0f, 0.0f, 0.0f, f8, f8};
                } else if (i8 == 3) {
                    float f9 = i;
                    this.f11496C = new float[]{f9, f9, f9, f9, 0.0f, 0.0f, 0.0f, 0.0f};
                } else if (i8 == 4) {
                    float f10 = i;
                    this.f11496C = new float[]{0.0f, 0.0f, f10, f10, f10, f10, 0.0f, 0.0f};
                } else {
                    this.f11496C = null;
                }
            }
        } else {
            z8 = true;
            z9 = false;
        }
        this.f11505L = i9;
        this.f11506M = f;
        this.f11507N = i10;
        if (i9 == 0 || (i > 0 && i8 != 0)) {
            view2.setElevation(0.0f);
        } else {
            view2.setElevation(i9);
        }
        int i11 = this.f11507N;
        if (Build.VERSION.SDK_INT >= 28 && (view = (View) weakReference.get()) != null) {
            view.setOutlineAmbientShadowColor(i11);
            view.setOutlineSpotShadowColor(i11);
        }
        view2.setOutlineProvider(new C6811b(this));
        view2.setClipToOutline(this.f11494A > 0 ? z8 : z9);
        view2.invalidate();
    }

    /* renamed from: m */
    public final void m6483m(float f) {
        if (this.f11506M == f) {
            return;
        }
        this.f11506M = f;
        m6477g();
    }
}
