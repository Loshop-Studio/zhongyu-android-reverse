package com.xuexiang.xui.widget.imageview.nine;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.xuexiang.xui.R$styleable;
import java.util.ArrayList;
import java.util.List;
import p142q2.AbstractC6412c;
import p142q2.InterfaceC6410a;
import p142q2.InterfaceC6411b;

/* loaded from: classes3.dex */
public class NineGridImageView<T> extends ViewGroup {

    /* renamed from: a */
    public int f4429a;

    /* renamed from: b */
    public int f4430b;

    /* renamed from: c */
    public int f4431c;

    /* renamed from: d */
    public int f4432d;

    /* renamed from: e */
    public int f4433e;

    /* renamed from: f */
    public int f4434f;

    /* renamed from: g */
    public int f4435g;

    /* renamed from: h */
    public final ArrayList f4436h;

    /* renamed from: i */
    public List f4437i;

    public NineGridImageView(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i, int i8, int i9, int i10) {
        List list = this.f4437i;
        if (list == null) {
            return;
        }
        int size = list.size();
        int i11 = this.f4431c;
        if (i11 > 0 && size > i11) {
            size = i11;
        }
        if (size <= 0) {
            return;
        }
        for (int i12 = 0; i12 < size; i12++) {
            ImageView imageView = (ImageView) getChildAt(i12);
            int i13 = this.f4430b;
            int i14 = i12 / i13;
            int paddingLeft = getPaddingLeft() + ((this.f4435g + this.f4433e) * (i12 % i13));
            int paddingTop = getPaddingTop() + ((this.f4435g + this.f4433e) * i14);
            int i15 = this.f4435g;
            imageView.layout(paddingLeft, paddingTop, paddingLeft + i15, i15 + paddingTop);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i8) {
        int i9;
        super.onMeasure(i, i8);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i8);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        List list = this.f4437i;
        if (list != null && list.size() > 0) {
            if (this.f4437i.size() != 1 || (i9 = this.f4434f) == -1) {
                ((ImageView) this.f4436h.get(0)).setScaleType(ImageView.ScaleType.CENTER_CROP);
                int i10 = this.f4433e;
                int i11 = this.f4430b;
                this.f4435g = (paddingLeft - ((i11 - 1) * i10)) / i11;
            } else {
                this.f4435g = Math.min(i9, paddingLeft);
            }
            int i12 = this.f4435g;
            int i13 = this.f4429a;
            size2 = getPaddingTop() + ((i13 - 1) * this.f4433e) + (i12 * i13) + getPaddingBottom();
        }
        setMeasuredDimension(size, size2);
    }

    public void setGap(int i) {
        this.f4433e = i;
    }

    public void setImagesData(List<T> list) {
        ImageView imageView;
        ImageView imageView2;
        if (list == null || list.isEmpty()) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        int size = list.size();
        int i = this.f4431c;
        if (i > 0 && size > i) {
            size = i;
        }
        int[] iArr = new int[2];
        if (this.f4432d != 1) {
            iArr[0] = (size / 3) + (size % 3 == 0 ? 0 : 1);
            iArr[1] = 3;
        } else if (size <= 2) {
            iArr[0] = 1;
            iArr[1] = size;
        } else if (size == 3) {
            iArr[0] = 1;
            iArr[1] = 3;
        } else if (size <= 6) {
            iArr[0] = 2;
            iArr[1] = (size % 2) + (size / 2);
        } else {
            iArr[0] = (size / 3) + (size % 3 == 0 ? 0 : 1);
            iArr[1] = 3;
        }
        this.f4429a = iArr[0];
        this.f4430b = iArr[1];
        List list2 = this.f4437i;
        if (list2 == null) {
            for (int i8 = 0; i8 < size; i8++) {
                ArrayList arrayList = this.f4436h;
                if (i8 < arrayList.size()) {
                    imageView2 = (ImageView) arrayList.get(i8);
                } else {
                    Log.e("NineGirdImageView", "Your must set a NineGridImageViewAdapter for NineGirdImageView");
                    imageView2 = null;
                }
                if (imageView2 == null) {
                    return;
                }
                addView(imageView2, generateDefaultLayoutParams());
            }
        } else {
            int size2 = list2.size();
            int i9 = this.f4431c;
            if (i9 > 0 && size2 > i9) {
                size2 = i9;
            }
            if (size2 > size) {
                removeViews(size, size2 - size);
            } else if (size2 < size) {
                while (size2 < size) {
                    ArrayList arrayList2 = this.f4436h;
                    if (size2 < arrayList2.size()) {
                        imageView = (ImageView) arrayList2.get(size2);
                    } else {
                        Log.e("NineGirdImageView", "Your must set a NineGridImageViewAdapter for NineGirdImageView");
                        imageView = null;
                    }
                    if (imageView == null) {
                        return;
                    }
                    addView(imageView, generateDefaultLayoutParams());
                    size2++;
                }
            }
        }
        this.f4437i = list;
        requestLayout();
    }

    public void setMaxSize(int i) {
        this.f4431c = i;
    }

    public void setShowStyle(int i) {
        this.f4432d = i;
    }

    public void setSingleImgSize(int i) {
        this.f4434f = i;
    }

    public NineGridImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4436h = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NineGridImageView);
        this.f4433e = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.NineGridImageView_ngiv_imgGap, 0.0f);
        this.f4434f = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NineGridImageView_ngiv_singleImgSize, -1);
        this.f4432d = typedArrayObtainStyledAttributes.getInt(R$styleable.NineGridImageView_ngiv_showStyle, 0);
        this.f4431c = typedArrayObtainStyledAttributes.getInt(R$styleable.NineGridImageView_ngiv_maxSize, 9);
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setAdapter(AbstractC6412c abstractC6412c) {
    }

    public void setItemImageClickListener(InterfaceC6410a interfaceC6410a) {
    }

    public void setItemImageLongClickListener(InterfaceC6411b interfaceC6411b) {
    }
}
