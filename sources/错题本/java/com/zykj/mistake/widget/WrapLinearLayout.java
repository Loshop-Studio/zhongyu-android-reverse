package com.zykj.mistake.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.zykj.mistake.R;
import java.util.ArrayList;
import p059f5.C5532f;
import p059f5.C5533g;

/* loaded from: classes3.dex */
public class WrapLinearLayout extends ViewGroup {

    /* renamed from: a */
    public final C5532f f8104a;

    /* renamed from: b */
    public ArrayList f8105b;

    public WrapLinearLayout(Context context) {
        this(context, null);
    }

    public int getGravity() {
        return this.f8104a.f8567a;
    }

    public float getHorizontal_Space() {
        return this.f8104a.f8568b;
    }

    public float getVertical_Space() {
        return this.f8104a.f8569c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i, int i8, int i9, int i10) {
        C5532f c5532f;
        float f;
        float measuredWidth;
        float size;
        int paddingTop = getPaddingTop();
        for (int i11 = 0; i11 < this.f8105b.size(); i11++) {
            int paddingLeft = getPaddingLeft();
            C5533g c5533g = (C5533g) this.f8105b.get(i11);
            int measuredWidth2 = getMeasuredWidth();
            int i12 = c5533g.f8572b;
            ArrayList arrayList = c5533g.f8571a;
            int i13 = measuredWidth2 - i12;
            int i14 = 0;
            while (true) {
                int size2 = arrayList.size();
                c5532f = this.f8104a;
                if (i14 < size2) {
                    View view = (View) arrayList.get(i14);
                    if (c5532f.f8570d) {
                        view.layout(paddingLeft, paddingTop, (i13 / arrayList.size()) + view.getMeasuredWidth() + paddingLeft, view.getMeasuredHeight() + paddingTop);
                        f = paddingLeft;
                        measuredWidth = view.getMeasuredWidth() + c5532f.f8568b;
                        size = i13 / arrayList.size();
                    } else {
                        int gravity = getGravity();
                        if (gravity == 0) {
                            int i15 = paddingLeft + i13;
                            view.layout(i15, paddingTop, view.getMeasuredWidth() + i15, view.getMeasuredHeight() + paddingTop);
                        } else if (gravity != 2) {
                            view.layout(paddingLeft, paddingTop, view.getMeasuredWidth() + paddingLeft, view.getMeasuredHeight() + paddingTop);
                        } else {
                            int i16 = (i13 / 2) + paddingLeft;
                            view.layout(i16, paddingTop, view.getMeasuredWidth() + i16, view.getMeasuredHeight() + paddingTop);
                        }
                        f = paddingLeft;
                        measuredWidth = view.getMeasuredWidth();
                        size = c5532f.f8568b;
                    }
                    paddingLeft = (int) (measuredWidth + size + f);
                    i14++;
                }
            }
            paddingTop = (int) (c5533g.f8573c + c5532f.f8569c + paddingTop);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i8) {
        ArrayList arrayList;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i8);
        int childCount = getChildCount();
        measureChildren(i, i8);
        C5532f c5532f = this.f8104a;
        if (mode == Integer.MIN_VALUE) {
            int measuredWidth = 0;
            for (int i9 = 0; i9 < childCount; i9++) {
                if (i9 != 0) {
                    measuredWidth = (int) (measuredWidth + c5532f.f8568b);
                }
                measuredWidth += getChildAt(i9).getMeasuredWidth();
            }
            int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
            if (paddingRight <= size) {
                size = paddingRight;
            }
        } else if (mode == 0) {
            int measuredWidth2 = 0;
            for (int i10 = 0; i10 < childCount; i10++) {
                if (i10 != 0) {
                    measuredWidth2 = (int) (measuredWidth2 + c5532f.f8568b);
                }
                measuredWidth2 += getChildAt(i10).getMeasuredWidth();
            }
            size = measuredWidth2 + getPaddingRight() + getPaddingLeft();
        }
        C5533g c5533g = new C5533g(this);
        this.f8105b = new ArrayList();
        int i11 = 0;
        while (true) {
            arrayList = c5533g.f8571a;
            if (i11 >= childCount) {
                break;
            }
            if (getChildAt(i11).getMeasuredWidth() + c5533g.f8572b + c5532f.f8568b <= size) {
                C5533g.m4893a(c5533g, getChildAt(i11));
            } else if (arrayList.size() == 0) {
                C5533g.m4893a(c5533g, getChildAt(i11));
                this.f8105b.add(c5533g);
                c5533g = new C5533g(this);
            } else {
                this.f8105b.add(c5533g);
                c5533g = new C5533g(this);
                C5533g.m4893a(c5533g, getChildAt(i11));
            }
            i11++;
        }
        if (arrayList.size() > 0 && !this.f8105b.contains(c5533g)) {
            this.f8105b.add(c5533g);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        for (int i12 = 0; i12 < this.f8105b.size(); i12++) {
            if (i12 != 0) {
                paddingBottom = (int) (paddingBottom + c5532f.f8569c);
            }
            paddingBottom += ((C5533g) this.f8105b.get(i12)).f8573c;
        }
        if (mode2 == Integer.MIN_VALUE ? paddingBottom <= size2 : mode2 != 1073741824) {
            size2 = paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    public void setGravity(int i) {
        this.f8104a.f8567a = i;
    }

    public void setHorizontal_Space(float f) {
        this.f8104a.f8568b = f;
    }

    public void setIsFull(boolean z8) {
        this.f8104a.f8570d = z8;
    }

    public void setVertical_Space(float f) {
        this.f8104a.f8569c = f;
    }

    public WrapLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.style.WarpLinearLayoutDefault);
    }

    public WrapLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C5532f c5532f = new C5532f();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.WrapLinearLayout);
            c5532f.f8567a = typedArrayObtainStyledAttributes.getInt(R.styleable.WrapLinearLayout_gravity, c5532f.f8567a);
            c5532f.f8568b = typedArrayObtainStyledAttributes.getDimension(R.styleable.WrapLinearLayout_horizontal_Space, c5532f.f8568b);
            c5532f.f8569c = typedArrayObtainStyledAttributes.getDimension(R.styleable.WrapLinearLayout_vertical_Space, c5532f.f8569c);
            c5532f.f8570d = typedArrayObtainStyledAttributes.getBoolean(R.styleable.WrapLinearLayout_isFull, c5532f.f8570d);
        }
        this.f8104a = c5532f;
    }
}
