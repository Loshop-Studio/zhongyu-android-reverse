package com.xuexiang.xui.widget.progress.ratingbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.camera.video.AudioStats;
import androidx.core.content.ContextCompat;
import com.google.android.material.color.utilities.Contrast;
import com.xuexiang.xui.R$drawable;
import com.xuexiang.xui.R$styleable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class RatingBar extends LinearLayout {

    /* renamed from: c */
    public int f16871c;

    /* renamed from: d */
    public int f16872d;

    /* renamed from: e */
    public int f16873e;

    /* renamed from: f */
    public int f16874f;

    /* renamed from: g */
    public float f16875g;

    /* renamed from: h */
    public float f16876h;

    /* renamed from: i */
    public float f16877i;

    /* renamed from: j */
    public float f16878j;

    /* renamed from: k */
    public boolean f16879k;

    /* renamed from: l */
    public boolean f16880l;

    /* renamed from: m */
    public boolean f16881m;

    /* renamed from: n */
    public boolean f16882n;

    /* renamed from: o */
    public float f16883o;

    /* renamed from: p */
    public float f16884p;

    /* renamed from: q */
    public Drawable f16885q;

    /* renamed from: r */
    public Drawable f16886r;

    /* renamed from: s */
    public List f16887s;

    /* renamed from: com.xuexiang.xui.widget.progress.ratingbar.RatingBar$a */
    public interface InterfaceC8234a {
    }

    public RatingBar(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void mo13163a(float f10) {
        for (PartialView partialView : this.f16887s) {
            int iIntValue = ((Integer) partialView.getTag()).intValue();
            double dCeil = Math.ceil(f10);
            double d10 = iIntValue;
            if (d10 > dCeil) {
                partialView.m13156b();
            } else if (d10 == dCeil) {
                partialView.m13160f(f10);
            } else {
                partialView.m13158d();
            }
        }
    }

    /* renamed from: b */
    public final PartialView m13164b(int i10, int i11, int i12, int i13, Drawable drawable, Drawable drawable2) {
        PartialView partialView = new PartialView(getContext(), i10, i11, i12, i13);
        partialView.m13159e(drawable);
        partialView.m13157c(drawable2);
        return partialView;
    }

    /* renamed from: c */
    public final void m13165c(float f10) {
        for (PartialView partialView : this.f16887s) {
            if (m13170h(f10, partialView)) {
                float f11 = this.f16877i;
                float fIntValue = f11 == 1.0f ? ((Integer) partialView.getTag()).intValue() : AbstractC8238a.m13179a(partialView, f11, f10);
                if (this.f16878j == fIntValue && m13168f()) {
                    setRating(this.f16875g);
                    return;
                } else {
                    setRating(fIntValue);
                    return;
                }
            }
        }
    }

    /* renamed from: d */
    public final void m13166d(float f10) {
        for (PartialView partialView : this.f16887s) {
            if (f10 < (partialView.getWidth() / 10.0f) + (this.f16875g * partialView.getWidth())) {
                setRating(this.f16875g);
                return;
            } else if (m13170h(f10, partialView)) {
                float fM13179a = AbstractC8238a.m13179a(partialView, this.f16877i, f10);
                if (this.f16876h != fM13179a) {
                    setRating(fM13179a);
                }
            }
        }
    }

    /* renamed from: e */
    public final void m13167e() {
        this.f16887s = new ArrayList();
        for (int i10 = 1; i10 <= this.f16871c; i10++) {
            PartialView partialViewM13164b = m13164b(i10, this.f16873e, this.f16874f, this.f16872d, this.f16886r, this.f16885q);
            addView(partialViewM13164b);
            this.f16887s.add(partialViewM13164b);
        }
    }

    /* renamed from: f */
    public boolean m13168f() {
        return this.f16882n;
    }

    /* renamed from: g */
    public boolean m13169g() {
        return this.f16879k;
    }

    public int getNumStars() {
        return this.f16871c;
    }

    public float getRating() {
        return this.f16876h;
    }

    public int getStarHeight() {
        return this.f16874f;
    }

    public int getStarPadding() {
        return this.f16872d;
    }

    public int getStarWidth() {
        return this.f16873e;
    }

    public float getStepSize() {
        return this.f16877i;
    }

    /* renamed from: h */
    public final boolean m13170h(float f10, View view) {
        return f10 > ((float) view.getLeft()) && f10 < ((float) view.getRight());
    }

    /* renamed from: i */
    public boolean m13171i() {
        return this.f16880l;
    }

    @Override // android.view.View
    public boolean isClickable() {
        return this.f16881m;
    }

    /* renamed from: j */
    public final void m13172j() {
        if (this.f16871c <= 0) {
            this.f16871c = 5;
        }
        if (this.f16872d < 0) {
            this.f16872d = 0;
        }
        if (this.f16885q == null) {
            this.f16885q = ContextCompat.getDrawable(getContext(), R$drawable.srb_ic_empty);
        }
        if (this.f16886r == null) {
            this.f16886r = ContextCompat.getDrawable(getContext(), R$drawable.srb_ic_filled);
        }
        float f10 = this.f16877i;
        if (f10 > 1.0f) {
            this.f16877i = 1.0f;
        } else if (f10 < 0.1f) {
            this.f16877i = 0.1f;
        }
        this.f16875g = AbstractC8238a.m13181c(this.f16875g, this.f16871c, this.f16877i);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setRating(savedState.m13174a());
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.m13175b(this.f16876h);
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (m13169g()) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f16883o = x10;
            this.f16884p = y10;
            this.f16878j = this.f16876h;
        } else if (action != 1) {
            if (action == 2) {
                if (!m13171i()) {
                    return false;
                }
                m13166d(x10);
            }
        } else {
            if (!AbstractC8238a.m13182d(this.f16883o, this.f16884p, motionEvent) || !isClickable()) {
                return false;
            }
            m13165c(x10);
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        return true;
    }

    public void setClearRatingEnabled(boolean z10) {
        this.f16882n = z10;
    }

    @Override // android.view.View
    public void setClickable(boolean z10) {
        this.f16881m = z10;
    }

    public void setEmptyDrawable(Drawable drawable) {
        this.f16885q = drawable;
        Iterator it = this.f16887s.iterator();
        while (it.hasNext()) {
            ((PartialView) it.next()).m13157c(drawable);
        }
    }

    public void setEmptyDrawableRes(@DrawableRes int i10) {
        setEmptyDrawable(ContextCompat.getDrawable(getContext(), i10));
    }

    public void setFilledDrawable(Drawable drawable) {
        this.f16886r = drawable;
        Iterator it = this.f16887s.iterator();
        while (it.hasNext()) {
            ((PartialView) it.next()).m13159e(drawable);
        }
    }

    public void setFilledDrawableRes(@DrawableRes int i10) {
        setFilledDrawable(ContextCompat.getDrawable(getContext(), i10));
    }

    public void setIsIndicator(boolean z10) {
        this.f16879k = z10;
    }

    public void setMinimumStars(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE) float f10) {
        this.f16875g = AbstractC8238a.m13181c(f10, this.f16871c, this.f16877i);
    }

    public void setNumStars(int i10) {
        if (i10 <= 0) {
            return;
        }
        this.f16887s.clear();
        removeAllViews();
        this.f16871c = i10;
        m13167e();
    }

    public void setOnRatingChangeListener(InterfaceC8234a interfaceC8234a) {
    }

    public void setRating(float f10) {
        int i10 = this.f16871c;
        if (f10 > i10) {
            f10 = i10;
        }
        float f11 = this.f16875g;
        if (f10 < f11) {
            f10 = f11;
        }
        if (this.f16876h == f10) {
            return;
        }
        this.f16876h = f10;
        mo13163a(f10);
    }

    public void setScrollable(boolean z10) {
        this.f16880l = z10;
    }

    public void setStarHeight(@IntRange(from = 0) int i10) {
        this.f16874f = i10;
        Iterator it = this.f16887s.iterator();
        while (it.hasNext()) {
            ((PartialView) it.next()).m13161g(i10);
        }
    }

    public void setStarPadding(int i10) {
        if (i10 < 0) {
            return;
        }
        this.f16872d = i10;
        for (PartialView partialView : this.f16887s) {
            int i11 = this.f16872d;
            partialView.setPadding(i11, i11, i11, i11);
        }
    }

    public void setStarWidth(@IntRange(from = 0) int i10) {
        this.f16873e = i10;
        Iterator it = this.f16887s.iterator();
        while (it.hasNext()) {
            ((PartialView) it.next()).m13162h(i10);
        }
    }

    public void setStepSize(@FloatRange(from = 0.1d, m337to = Contrast.RATIO_MIN) float f10) {
        this.f16877i = f10;
    }

    public RatingBar(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RatingBar(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f16872d = 20;
        this.f16875g = 0.0f;
        this.f16876h = -1.0f;
        this.f16877i = 1.0f;
        this.f16878j = 0.0f;
        this.f16879k = false;
        this.f16880l = true;
        this.f16881m = true;
        this.f16882n = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RatingBar);
        float f10 = typedArrayObtainStyledAttributes.getFloat(R$styleable.RatingBar_srb_rating, 0.0f);
        this.f16871c = typedArrayObtainStyledAttributes.getInt(R$styleable.RatingBar_srb_numStars, this.f16871c);
        this.f16877i = typedArrayObtainStyledAttributes.getFloat(R$styleable.RatingBar_srb_stepSize, this.f16877i);
        this.f16875g = typedArrayObtainStyledAttributes.getFloat(R$styleable.RatingBar_srb_minimumStars, this.f16875g);
        this.f16872d = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RatingBar_srb_starPadding, this.f16872d);
        this.f16873e = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RatingBar_srb_starWidth, 0);
        this.f16874f = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RatingBar_srb_starHeight, 0);
        this.f16885q = typedArrayObtainStyledAttributes.hasValue(R$styleable.RatingBar_srb_drawableEmpty) ? ContextCompat.getDrawable(context, typedArrayObtainStyledAttributes.getResourceId(R$styleable.RatingBar_srb_drawableEmpty, -1)) : null;
        this.f16886r = typedArrayObtainStyledAttributes.hasValue(R$styleable.RatingBar_srb_drawableFilled) ? ContextCompat.getDrawable(context, typedArrayObtainStyledAttributes.getResourceId(R$styleable.RatingBar_srb_drawableFilled, -1)) : null;
        this.f16879k = typedArrayObtainStyledAttributes.getBoolean(R$styleable.RatingBar_srb_isIndicator, this.f16879k);
        this.f16880l = typedArrayObtainStyledAttributes.getBoolean(R$styleable.RatingBar_srb_scrollable, this.f16880l);
        this.f16881m = typedArrayObtainStyledAttributes.getBoolean(R$styleable.RatingBar_srb_clickable, this.f16881m);
        this.f16882n = typedArrayObtainStyledAttributes.getBoolean(R$styleable.RatingBar_srb_clearRatingEnabled, this.f16882n);
        typedArrayObtainStyledAttributes.recycle();
        m13172j();
        m13167e();
        setRating(f10);
    }
}
