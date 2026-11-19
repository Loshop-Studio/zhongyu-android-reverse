package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.constraintlayout.widget.C0298f;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public class ImageFilterButton extends AppCompatImageButton {

    /* renamed from: a */
    private ImageFilterView.C0289c f1767a;

    /* renamed from: b */
    private float f1768b;

    /* renamed from: c */
    private float f1769c;

    /* renamed from: d */
    private float f1770d;

    /* renamed from: e */
    private Path f1771e;

    /* renamed from: f */
    ViewOutlineProvider f1772f;

    /* renamed from: g */
    RectF f1773g;

    /* renamed from: h */
    Drawable[] f1774h;

    /* renamed from: i */
    LayerDrawable f1775i;

    /* renamed from: j */
    private boolean f1776j;

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterButton$a */
    class C0285a extends ViewOutlineProvider {
        C0285a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterButton.this.getWidth(), ImageFilterButton.this.getHeight(), (Math.min(r3, r4) * ImageFilterButton.this.f1769c) / 2.0f);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterButton$b */
    class C0286b extends ViewOutlineProvider {
        C0286b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterButton.this.getWidth(), ImageFilterButton.this.getHeight(), ImageFilterButton.this.f1770d);
        }
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1767a = new ImageFilterView.C0289c();
        this.f1768b = IGoodView.DEFAULT_TO_ALPHA;
        this.f1769c = IGoodView.DEFAULT_TO_ALPHA;
        this.f1770d = Float.NaN;
        this.f1776j = true;
        m1578c(context, attributeSet);
    }

    /* renamed from: c */
    private void m1578c(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0298f.f2484r3);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(C0298f.f2493s3);
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index == C0298f.f2511u3) {
                    this.f1768b = typedArrayObtainStyledAttributes.getFloat(index, IGoodView.DEFAULT_TO_ALPHA);
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
                    setOverlay(typedArrayObtainStyledAttributes.getBoolean(index, this.f1776j));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            if (drawable != null) {
                Drawable[] drawableArr = new Drawable[2];
                this.f1774h = drawableArr;
                drawableArr[0] = getDrawable();
                this.f1774h[1] = drawable;
                LayerDrawable layerDrawable = new LayerDrawable(this.f1774h);
                this.f1775i = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.f1768b * 255.0f));
                super.setImageDrawable(this.f1775i);
            }
        }
    }

    private void setOverlay(boolean z3) {
        this.f1776j = z3;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getContrast() {
        return this.f1767a.f1796f;
    }

    public float getCrossfade() {
        return this.f1768b;
    }

    public float getRound() {
        return this.f1770d;
    }

    public float getRoundPercent() {
        return this.f1769c;
    }

    public float getSaturation() {
        return this.f1767a.f1795e;
    }

    public float getWarmth() {
        return this.f1767a.f1797g;
    }

    public void setBrightness(float f4) {
        ImageFilterView.C0289c c0289c = this.f1767a;
        c0289c.f1794d = f4;
        c0289c.m1584c(this);
    }

    public void setContrast(float f4) {
        ImageFilterView.C0289c c0289c = this.f1767a;
        c0289c.f1796f = f4;
        c0289c.m1584c(this);
    }

    public void setCrossfade(float f4) {
        this.f1768b = f4;
        if (this.f1774h != null) {
            if (!this.f1776j) {
                this.f1775i.getDrawable(0).setAlpha((int) ((1.0f - this.f1768b) * 255.0f));
            }
            this.f1775i.getDrawable(1).setAlpha((int) (this.f1768b * 255.0f));
            super.setImageDrawable(this.f1775i);
        }
    }

    public void setRound(float f4) {
        if (Float.isNaN(f4)) {
            this.f1770d = f4;
            float f5 = this.f1769c;
            this.f1769c = -1.0f;
            setRoundPercent(f5);
            return;
        }
        boolean z3 = this.f1770d != f4;
        this.f1770d = f4;
        if (f4 != IGoodView.DEFAULT_TO_ALPHA) {
            if (this.f1771e == null) {
                this.f1771e = new Path();
            }
            if (this.f1773g == null) {
                this.f1773g = new RectF();
            }
            if (this.f1772f == null) {
                C0286b c0286b = new C0286b();
                this.f1772f = c0286b;
                setOutlineProvider(c0286b);
            }
            setClipToOutline(true);
            this.f1773g.set(IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, getWidth(), getHeight());
            this.f1771e.reset();
            Path path = this.f1771e;
            RectF rectF = this.f1773g;
            float f6 = this.f1770d;
            path.addRoundRect(rectF, f6, f6, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z3) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f4) {
        boolean z3 = this.f1769c != f4;
        this.f1769c = f4;
        if (f4 != IGoodView.DEFAULT_TO_ALPHA) {
            if (this.f1771e == null) {
                this.f1771e = new Path();
            }
            if (this.f1773g == null) {
                this.f1773g = new RectF();
            }
            if (this.f1772f == null) {
                C0285a c0285a = new C0285a();
                this.f1772f = c0285a;
                setOutlineProvider(c0285a);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f1769c) / 2.0f;
            this.f1773g.set(IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, width, height);
            this.f1771e.reset();
            this.f1771e.addRoundRect(this.f1773g, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z3) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f4) {
        ImageFilterView.C0289c c0289c = this.f1767a;
        c0289c.f1795e = f4;
        c0289c.m1584c(this);
    }

    public void setWarmth(float f4) {
        ImageFilterView.C0289c c0289c = this.f1767a;
        c0289c.f1797g = f4;
        c0289c.m1584c(this);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f1767a = new ImageFilterView.C0289c();
        this.f1768b = IGoodView.DEFAULT_TO_ALPHA;
        this.f1769c = IGoodView.DEFAULT_TO_ALPHA;
        this.f1770d = Float.NaN;
        this.f1776j = true;
        m1578c(context, attributeSet);
    }
}
