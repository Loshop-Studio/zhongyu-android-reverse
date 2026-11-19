package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.C0298f;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public class ImageFilterView extends AppCompatImageView {

    /* renamed from: a */
    private C0289c f1779a;

    /* renamed from: b */
    private boolean f1780b;

    /* renamed from: c */
    private float f1781c;

    /* renamed from: d */
    private float f1782d;

    /* renamed from: e */
    private float f1783e;

    /* renamed from: f */
    private Path f1784f;

    /* renamed from: g */
    ViewOutlineProvider f1785g;

    /* renamed from: h */
    RectF f1786h;

    /* renamed from: i */
    Drawable[] f1787i;

    /* renamed from: j */
    LayerDrawable f1788j;

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterView$a */
    class C0287a extends ViewOutlineProvider {
        C0287a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterView.this.getWidth(), ImageFilterView.this.getHeight(), (Math.min(r3, r4) * ImageFilterView.this.f1782d) / 2.0f);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterView$b */
    class C0288b extends ViewOutlineProvider {
        C0288b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterView.this.getWidth(), ImageFilterView.this.getHeight(), ImageFilterView.this.f1783e);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterView$c */
    static class C0289c {

        /* renamed from: a */
        float[] f1791a = new float[20];

        /* renamed from: b */
        ColorMatrix f1792b = new ColorMatrix();

        /* renamed from: c */
        ColorMatrix f1793c = new ColorMatrix();

        /* renamed from: d */
        float f1794d = 1.0f;

        /* renamed from: e */
        float f1795e = 1.0f;

        /* renamed from: f */
        float f1796f = 1.0f;

        /* renamed from: g */
        float f1797g = 1.0f;

        C0289c() {
        }

        /* renamed from: a */
        private void m1581a(float f4) {
            float[] fArr = this.f1791a;
            fArr[0] = f4;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = f4;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = f4;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        /* renamed from: b */
        private void m1582b(float f4) {
            float f5 = 1.0f - f4;
            float f6 = 0.2999f * f5;
            float f7 = 0.587f * f5;
            float f8 = f5 * 0.114f;
            float[] fArr = this.f1791a;
            fArr[0] = f6 + f4;
            fArr[1] = f7;
            fArr[2] = f8;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = f6;
            fArr[6] = f7 + f4;
            fArr[7] = f8;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = f6;
            fArr[11] = f7;
            fArr[12] = f8 + f4;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        /* renamed from: d */
        private void m1583d(float f4) {
            float fLog;
            float fPow;
            if (f4 <= IGoodView.DEFAULT_TO_ALPHA) {
                f4 = 0.01f;
            }
            float f5 = (5000.0f / f4) / 100.0f;
            if (f5 > 66.0f) {
                double d4 = f5 - 60.0f;
                fPow = ((float) Math.pow(d4, -0.13320475816726685d)) * 329.69873f;
                fLog = ((float) Math.pow(d4, 0.07551484555006027d)) * 288.12216f;
            } else {
                fLog = (((float) Math.log(f5)) * 99.4708f) - 161.11957f;
                fPow = 255.0f;
            }
            float fLog2 = f5 < 66.0f ? f5 > 19.0f ? (((float) Math.log(f5 - 10.0f)) * 138.51773f) - 305.0448f : IGoodView.DEFAULT_TO_ALPHA : 255.0f;
            float fMin = Math.min(255.0f, Math.max(fPow, IGoodView.DEFAULT_TO_ALPHA));
            float fMin2 = Math.min(255.0f, Math.max(fLog, IGoodView.DEFAULT_TO_ALPHA));
            float fMin3 = Math.min(255.0f, Math.max(fLog2, IGoodView.DEFAULT_TO_ALPHA));
            float fLog3 = (((float) Math.log(50.0f)) * 99.4708f) - 161.11957f;
            float fLog4 = (((float) Math.log(40.0f)) * 138.51773f) - 305.0448f;
            float fMin4 = Math.min(255.0f, Math.max(255.0f, IGoodView.DEFAULT_TO_ALPHA));
            float fMin5 = Math.min(255.0f, Math.max(fLog3, IGoodView.DEFAULT_TO_ALPHA));
            float fMin6 = fMin3 / Math.min(255.0f, Math.max(fLog4, IGoodView.DEFAULT_TO_ALPHA));
            float[] fArr = this.f1791a;
            fArr[0] = fMin / fMin4;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = fMin2 / fMin5;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = fMin6;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        /* renamed from: c */
        void m1584c(ImageView imageView) {
            boolean z3;
            this.f1792b.reset();
            float f4 = this.f1795e;
            boolean z4 = true;
            if (f4 != 1.0f) {
                m1582b(f4);
                this.f1792b.set(this.f1791a);
                z3 = true;
            } else {
                z3 = false;
            }
            float f5 = this.f1796f;
            if (f5 != 1.0f) {
                this.f1793c.setScale(f5, f5, f5, 1.0f);
                this.f1792b.postConcat(this.f1793c);
                z3 = true;
            }
            float f6 = this.f1797g;
            if (f6 != 1.0f) {
                m1583d(f6);
                this.f1793c.set(this.f1791a);
                this.f1792b.postConcat(this.f1793c);
                z3 = true;
            }
            float f7 = this.f1794d;
            if (f7 != 1.0f) {
                m1581a(f7);
                this.f1793c.set(this.f1791a);
                this.f1792b.postConcat(this.f1793c);
            } else {
                z4 = z3;
            }
            if (z4) {
                imageView.setColorFilter(new ColorMatrixColorFilter(this.f1792b));
            } else {
                imageView.clearColorFilter();
            }
        }
    }

    public ImageFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1779a = new C0289c();
        this.f1780b = true;
        this.f1781c = IGoodView.DEFAULT_TO_ALPHA;
        this.f1782d = IGoodView.DEFAULT_TO_ALPHA;
        this.f1783e = Float.NaN;
        init(context, attributeSet);
    }

    private void init(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0298f.f2484r3);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C0298f.f2493s3);
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index == C0298f.f2511u3) {
                    this.f1781c = typedArrayObtainStyledAttributes.getFloat(index, IGoodView.DEFAULT_TO_ALPHA);
                } else if (index == C0298f.f2556z3) {
                    setWarmth(typedArrayObtainStyledAttributes.getFloat(index, IGoodView.DEFAULT_TO_ALPHA));
                } else if (index == C0298f.f2547y3) {
                    setSaturation(typedArrayObtainStyledAttributes.getFloat(index, IGoodView.DEFAULT_TO_ALPHA));
                } else if (index == C0298f.f2502t3) {
                    setContrast(typedArrayObtainStyledAttributes.getFloat(index, IGoodView.DEFAULT_TO_ALPHA));
                } else if (index == C0298f.f2529w3) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, IGoodView.DEFAULT_TO_ALPHA));
                } else if (index == C0298f.f2538x3) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, IGoodView.DEFAULT_TO_ALPHA));
                } else if (index == C0298f.f2520v3) {
                    setOverlay(typedArrayObtainStyledAttributes.getBoolean(index, this.f1780b));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (drawable != null) {
                Drawable[] drawableArr = new Drawable[2];
                this.f1787i = drawableArr;
                drawableArr[0] = getDrawable();
                this.f1787i[1] = drawable;
                LayerDrawable layerDrawable = new LayerDrawable(this.f1787i);
                this.f1788j = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.f1781c * 255.0f));
                super.setImageDrawable(this.f1788j);
            }
        }
    }

    private void setOverlay(boolean z3) {
        this.f1780b = z3;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getBrightness() {
        return this.f1779a.f1794d;
    }

    public float getContrast() {
        return this.f1779a.f1796f;
    }

    public float getCrossfade() {
        return this.f1781c;
    }

    public float getRound() {
        return this.f1783e;
    }

    public float getRoundPercent() {
        return this.f1782d;
    }

    public float getSaturation() {
        return this.f1779a.f1795e;
    }

    public float getWarmth() {
        return this.f1779a.f1797g;
    }

    public void setBrightness(float f4) {
        C0289c c0289c = this.f1779a;
        c0289c.f1794d = f4;
        c0289c.m1584c(this);
    }

    public void setContrast(float f4) {
        C0289c c0289c = this.f1779a;
        c0289c.f1796f = f4;
        c0289c.m1584c(this);
    }

    public void setCrossfade(float f4) {
        this.f1781c = f4;
        if (this.f1787i != null) {
            if (!this.f1780b) {
                this.f1788j.getDrawable(0).setAlpha((int) ((1.0f - this.f1781c) * 255.0f));
            }
            this.f1788j.getDrawable(1).setAlpha((int) (this.f1781c * 255.0f));
            super.setImageDrawable(this.f1788j);
        }
    }

    public void setRound(float f4) {
        if (Float.isNaN(f4)) {
            this.f1783e = f4;
            float f5 = this.f1782d;
            this.f1782d = -1.0f;
            setRoundPercent(f5);
            return;
        }
        boolean z3 = this.f1783e != f4;
        this.f1783e = f4;
        if (f4 != IGoodView.DEFAULT_TO_ALPHA) {
            if (this.f1784f == null) {
                this.f1784f = new Path();
            }
            if (this.f1786h == null) {
                this.f1786h = new RectF();
            }
            if (this.f1785g == null) {
                C0288b c0288b = new C0288b();
                this.f1785g = c0288b;
                setOutlineProvider(c0288b);
            }
            setClipToOutline(true);
            this.f1786h.set(IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, getWidth(), getHeight());
            this.f1784f.reset();
            Path path = this.f1784f;
            RectF rectF = this.f1786h;
            float f6 = this.f1783e;
            path.addRoundRect(rectF, f6, f6, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z3) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f4) {
        boolean z3 = this.f1782d != f4;
        this.f1782d = f4;
        if (f4 != IGoodView.DEFAULT_TO_ALPHA) {
            if (this.f1784f == null) {
                this.f1784f = new Path();
            }
            if (this.f1786h == null) {
                this.f1786h = new RectF();
            }
            if (this.f1785g == null) {
                C0287a c0287a = new C0287a();
                this.f1785g = c0287a;
                setOutlineProvider(c0287a);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f1782d) / 2.0f;
            this.f1786h.set(IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, width, height);
            this.f1784f.reset();
            this.f1784f.addRoundRect(this.f1786h, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z3) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f4) {
        C0289c c0289c = this.f1779a;
        c0289c.f1795e = f4;
        c0289c.m1584c(this);
    }

    public void setWarmth(float f4) {
        C0289c c0289c = this.f1779a;
        c0289c.f1797g = f4;
        c0289c.m1584c(this);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f1779a = new C0289c();
        this.f1780b = true;
        this.f1781c = IGoodView.DEFAULT_TO_ALPHA;
        this.f1782d = IGoodView.DEFAULT_TO_ALPHA;
        this.f1783e = Float.NaN;
        init(context, attributeSet);
    }
}
