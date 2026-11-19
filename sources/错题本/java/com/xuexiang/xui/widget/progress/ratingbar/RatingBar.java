package com.xuexiang.xui.widget.progress.ratingbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.camera.video.AudioStats;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import com.xuexiang.xui.R$drawable;
import com.xuexiang.xui.R$styleable;
import java.util.ArrayList;
import p204y1.AbstractC6768a;

/* loaded from: classes3.dex */
public class RatingBar extends LinearLayout {

    /* renamed from: a */
    public int f4807a;

    /* renamed from: b */
    public int f4808b;

    /* renamed from: c */
    public int f4809c;

    /* renamed from: d */
    public int f4810d;

    /* renamed from: e */
    public float f4811e;

    /* renamed from: f */
    public float f4812f;

    /* renamed from: g */
    public float f4813g;

    /* renamed from: h */
    public float f4814h;

    /* renamed from: i */
    public boolean f4815i;

    /* renamed from: j */
    public boolean f4816j;

    /* renamed from: k */
    public boolean f4817k;

    /* renamed from: l */
    public boolean f4818l;

    /* renamed from: m */
    public float f4819m;

    /* renamed from: n */
    public float f4820n;

    /* renamed from: o */
    public Drawable f4821o;

    /* renamed from: p */
    public Drawable f4822p;

    /* renamed from: q */
    public ArrayList f4823q;

    public RatingBar(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void mo3564a(float f) {
        ArrayList arrayList = this.f4823q;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            PartialView partialView = (PartialView) obj;
            int iIntValue = ((Integer) partialView.getTag()).intValue();
            double dCeil = Math.ceil(f);
            double d9 = iIntValue;
            if (d9 > dCeil) {
                partialView.m3562b();
            } else if (d9 == dCeil) {
                partialView.m3563c(f);
            } else {
                partialView.f4803a.setImageLevel(10000);
                partialView.f4804b.setImageLevel(0);
            }
        }
    }

    /* renamed from: b */
    public final void m3565b() {
        this.f4823q = new ArrayList();
        for (int i = 1; i <= this.f4807a; i++) {
            int i8 = this.f4809c;
            int i9 = this.f4810d;
            int i10 = this.f4808b;
            Drawable drawable = this.f4822p;
            Drawable drawable2 = this.f4821o;
            PartialView partialView = new PartialView(getContext());
            partialView.f4805c = i8;
            partialView.f4806d = i9;
            partialView.setTag(Integer.valueOf(i));
            partialView.setPadding(i10, i10, i10, i10);
            partialView.m3561a();
            if (drawable.getConstantState() != null) {
                partialView.f4803a.setImageDrawable(new ClipDrawable(drawable.getConstantState().newDrawable(), GravityCompat.START, 1));
            }
            if (drawable2.getConstantState() != null) {
                partialView.f4804b.setImageDrawable(new ClipDrawable(drawable2.getConstantState().newDrawable(), GravityCompat.END, 1));
            }
            addView(partialView);
            this.f4823q.add(partialView);
        }
    }

    public int getNumStars() {
        return this.f4807a;
    }

    public float getRating() {
        return this.f4812f;
    }

    public int getStarHeight() {
        return this.f4810d;
    }

    public int getStarPadding() {
        return this.f4808b;
    }

    public int getStarWidth() {
        return this.f4809c;
    }

    public float getStepSize() {
        return this.f4813g;
    }

    @Override // android.view.View
    public final boolean isClickable() {
        return this.f4817k;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setRating(savedState.f4824a);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f4824a = this.f4812f;
        return savedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i = 0;
        if (!this.f4815i) {
            float x3 = motionEvent.getX();
            float y2 = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f4819m = x3;
                this.f4820n = y2;
                this.f4814h = this.f4812f;
            } else if (action == 1) {
                float f = this.f4819m;
                float f7 = this.f4820n;
                if (motionEvent.getEventTime() - motionEvent.getDownTime() <= 200.0f) {
                    float fAbs = Math.abs(f - motionEvent.getX());
                    float fAbs2 = Math.abs(f7 - motionEvent.getY());
                    if (fAbs <= 5.0f && fAbs2 <= 5.0f && this.f4817k) {
                        ArrayList arrayList = this.f4823q;
                        int size = arrayList.size();
                        while (true) {
                            if (i >= size) {
                                break;
                            }
                            Object obj = arrayList.get(i);
                            i++;
                            PartialView partialView = (PartialView) obj;
                            if (x3 > partialView.getLeft() && x3 < partialView.getRight()) {
                                float f8 = this.f4813g;
                                float fIntValue = f8 == 1.0f ? ((Integer) partialView.getTag()).intValue() : AbstractC6768a.m6439c(partialView, f8, x3);
                                if (this.f4814h == fIntValue && this.f4818l) {
                                    setRating(this.f4811e);
                                } else {
                                    setRating(fIntValue);
                                }
                            }
                        }
                    }
                }
            } else if (action == 2) {
                if (this.f4816j) {
                    ArrayList arrayList2 = this.f4823q;
                    int size2 = arrayList2.size();
                    while (true) {
                        if (i >= size2) {
                            break;
                        }
                        Object obj2 = arrayList2.get(i);
                        i++;
                        PartialView partialView2 = (PartialView) obj2;
                        if (x3 < (this.f4811e * partialView2.getWidth()) + (partialView2.getWidth() / 10.0f)) {
                            setRating(this.f4811e);
                            break;
                        }
                        if (x3 > partialView2.getLeft() && x3 < partialView2.getRight()) {
                            float fM6439c = AbstractC6768a.m6439c(partialView2, this.f4813g, x3);
                            if (this.f4812f != fM6439c) {
                                setRating(fM6439c);
                            }
                        }
                    }
                }
            }
            getParent().requestDisallowInterceptTouchEvent(true);
            return true;
        }
        return false;
    }

    public void setClearRatingEnabled(boolean z8) {
        this.f4818l = z8;
    }

    @Override // android.view.View
    public void setClickable(boolean z8) {
        this.f4817k = z8;
    }

    public void setEmptyDrawable(Drawable drawable) {
        this.f4821o = drawable;
        ArrayList arrayList = this.f4823q;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            PartialView partialView = (PartialView) obj;
            partialView.getClass();
            if (drawable.getConstantState() != null) {
                partialView.f4804b.setImageDrawable(new ClipDrawable(drawable.getConstantState().newDrawable(), GravityCompat.END, 1));
            }
        }
    }

    public void setEmptyDrawableRes(@DrawableRes int i) {
        setEmptyDrawable(ContextCompat.getDrawable(getContext(), i));
    }

    public void setFilledDrawable(Drawable drawable) {
        this.f4822p = drawable;
        ArrayList arrayList = this.f4823q;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            PartialView partialView = (PartialView) obj;
            partialView.getClass();
            if (drawable.getConstantState() != null) {
                partialView.f4803a.setImageDrawable(new ClipDrawable(drawable.getConstantState().newDrawable(), GravityCompat.START, 1));
            }
        }
    }

    public void setFilledDrawableRes(@DrawableRes int i) {
        setFilledDrawable(ContextCompat.getDrawable(getContext(), i));
    }

    public void setIsIndicator(boolean z8) {
        this.f4815i = z8;
    }

    public void setMinimumStars(@FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE) float f) {
        int i = this.f4807a;
        float f7 = this.f4813g;
        if (f < 0.0f) {
            f = 0.0f;
        }
        float f8 = i;
        if (f > f8) {
            f = f8;
        }
        if (f % f7 == 0.0f) {
            f7 = f;
        }
        this.f4811e = f7;
    }

    public void setNumStars(int i) {
        if (i <= 0) {
            return;
        }
        this.f4823q.clear();
        removeAllViews();
        this.f4807a = i;
        m3565b();
    }

    public void setOnRatingChangeListener(InterfaceC4207a interfaceC4207a) {
    }

    public void setRating(float f) {
        float f7 = this.f4807a;
        if (f > f7) {
            f = f7;
        }
        float f8 = this.f4811e;
        if (f < f8) {
            f = f8;
        }
        if (this.f4812f == f) {
            return;
        }
        this.f4812f = f;
        mo3564a(f);
    }

    public void setScrollable(boolean z8) {
        this.f4816j = z8;
    }

    public void setStarHeight(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int i) {
        this.f4810d = i;
        ArrayList arrayList = this.f4823q;
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayList.get(i8);
            i8++;
            PartialView partialView = (PartialView) obj;
            partialView.f4806d = i;
            ViewGroup.LayoutParams layoutParams = partialView.f4803a.getLayoutParams();
            layoutParams.height = partialView.f4806d;
            partialView.f4803a.setLayoutParams(layoutParams);
            partialView.f4804b.setLayoutParams(layoutParams);
        }
    }

    public void setStarPadding(int i) {
        if (i < 0) {
            return;
        }
        this.f4808b = i;
        ArrayList arrayList = this.f4823q;
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayList.get(i8);
            i8++;
            int i9 = this.f4808b;
            ((PartialView) obj).setPadding(i9, i9, i9, i9);
        }
    }

    public void setStarWidth(@IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY) int i) {
        this.f4809c = i;
        ArrayList arrayList = this.f4823q;
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayList.get(i8);
            i8++;
            PartialView partialView = (PartialView) obj;
            partialView.f4805c = i;
            ViewGroup.LayoutParams layoutParams = partialView.f4803a.getLayoutParams();
            layoutParams.width = partialView.f4805c;
            partialView.f4803a.setLayoutParams(layoutParams);
            partialView.f4804b.setLayoutParams(layoutParams);
        }
    }

    public void setStepSize(@FloatRange(from = 0.1d, m246to = 1.0d) float f) {
        this.f4813g = f;
    }

    public RatingBar(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RatingBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4808b = 20;
        this.f4811e = 0.0f;
        this.f4812f = -1.0f;
        this.f4813g = 1.0f;
        this.f4814h = 0.0f;
        this.f4815i = false;
        this.f4816j = true;
        this.f4817k = true;
        this.f4818l = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RatingBar);
        float f = typedArrayObtainStyledAttributes.getFloat(R$styleable.RatingBar_srb_rating, 0.0f);
        this.f4807a = typedArrayObtainStyledAttributes.getInt(R$styleable.RatingBar_srb_numStars, this.f4807a);
        this.f4813g = typedArrayObtainStyledAttributes.getFloat(R$styleable.RatingBar_srb_stepSize, this.f4813g);
        this.f4811e = typedArrayObtainStyledAttributes.getFloat(R$styleable.RatingBar_srb_minimumStars, this.f4811e);
        this.f4808b = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RatingBar_srb_starPadding, this.f4808b);
        this.f4809c = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RatingBar_srb_starWidth, 0);
        this.f4810d = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RatingBar_srb_starHeight, 0);
        this.f4821o = typedArrayObtainStyledAttributes.hasValue(R$styleable.RatingBar_srb_drawableEmpty) ? ContextCompat.getDrawable(context, typedArrayObtainStyledAttributes.getResourceId(R$styleable.RatingBar_srb_drawableEmpty, -1)) : null;
        this.f4822p = typedArrayObtainStyledAttributes.hasValue(R$styleable.RatingBar_srb_drawableFilled) ? ContextCompat.getDrawable(context, typedArrayObtainStyledAttributes.getResourceId(R$styleable.RatingBar_srb_drawableFilled, -1)) : null;
        this.f4815i = typedArrayObtainStyledAttributes.getBoolean(R$styleable.RatingBar_srb_isIndicator, this.f4815i);
        this.f4816j = typedArrayObtainStyledAttributes.getBoolean(R$styleable.RatingBar_srb_scrollable, this.f4816j);
        this.f4817k = typedArrayObtainStyledAttributes.getBoolean(R$styleable.RatingBar_srb_clickable, this.f4817k);
        this.f4818l = typedArrayObtainStyledAttributes.getBoolean(R$styleable.RatingBar_srb_clearRatingEnabled, this.f4818l);
        typedArrayObtainStyledAttributes.recycle();
        if (this.f4807a <= 0) {
            this.f4807a = 5;
        }
        if (this.f4808b < 0) {
            this.f4808b = 0;
        }
        if (this.f4821o == null) {
            this.f4821o = ContextCompat.getDrawable(getContext(), R$drawable.srb_ic_empty);
        }
        if (this.f4822p == null) {
            this.f4822p = ContextCompat.getDrawable(getContext(), R$drawable.srb_ic_filled);
        }
        float f7 = this.f4813g;
        if (f7 > 1.0f) {
            this.f4813g = 1.0f;
        } else if (f7 < 0.1f) {
            this.f4813g = 0.1f;
        }
        float f8 = this.f4811e;
        int i8 = this.f4807a;
        float f9 = this.f4813g;
        f8 = f8 < 0.0f ? 0.0f : f8;
        float f10 = i8;
        f8 = f8 > f10 ? f10 : f8;
        this.f4811e = f8 % f9 == 0.0f ? f8 : f9;
        m3565b();
        setRating(f);
    }
}
