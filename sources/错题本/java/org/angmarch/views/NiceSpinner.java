package org.angmarch.views;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListPopupWindow;
import android.widget.ListView;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;
import io.reactivex.internal.operators.observable.C5707c;
import java.util.Arrays;
import java.util.List;
import p009a8.C0024b;
import p009a8.C0025c;
import p009a8.InterfaceC0027e;
import p009a8.InterfaceC0028f;
import p009a8.RunnableC0023a;

/* loaded from: classes4.dex */
public class NiceSpinner extends AppCompatTextView {

    /* renamed from: b */
    public int f10364b;

    /* renamed from: c */
    public Drawable f10365c;

    /* renamed from: d */
    public ListPopupWindow f10366d;

    /* renamed from: e */
    public AbstractC6356c f10367e;

    /* renamed from: f */
    public AdapterView.OnItemSelectedListener f10368f;

    /* renamed from: g */
    public InterfaceC0027e f10369g;

    /* renamed from: h */
    public boolean f10370h;

    /* renamed from: i */
    public int f10371i;

    /* renamed from: j */
    public int f10372j;

    /* renamed from: k */
    public int f10373k;

    /* renamed from: l */
    public int f10374l;

    /* renamed from: m */
    public int f10375m;

    /* renamed from: n */
    public int f10376n;

    /* renamed from: o */
    public int f10377o;

    /* renamed from: p */
    public InterfaceC0028f f10378p;

    /* renamed from: q */
    public InterfaceC0028f f10379q;

    /* renamed from: r */
    public PopUpTextAlignment f10380r;

    /* renamed from: s */
    public ObjectAnimator f10381s;

    public NiceSpinner(Context context) throws Resources.NotFoundException {
        super(context);
        this.f10378p = new C5707c();
        this.f10379q = new C5707c();
        this.f10381s = null;
        m6020e(context, null);
    }

    private int getParentVerticalOffset() {
        int i = this.f10375m;
        if (i > 0) {
            return i;
        }
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        int i8 = iArr[1];
        this.f10375m = i8;
        return i8;
    }

    private int getPopUpHeight() {
        return Math.max((this.f10374l - getParentVerticalOffset()) - getMeasuredHeight(), getParentVerticalOffset());
    }

    private <T> void setAdapterInternal(AbstractC6356c abstractC6356c) {
        if (abstractC6356c.getCount() >= 0) {
            this.f10364b = 0;
            this.f10366d.setAdapter(abstractC6356c);
            setTextInternal(abstractC6356c.mo6023a(this.f10364b));
        }
    }

    private void setArrowDrawableOrHide(Drawable drawable) {
        if (this.f10370h || drawable == null) {
            setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextInternal(Object obj) {
        if (this.f10379q != null) {
            setText(new SpannableString(obj.toString()));
        } else {
            setText(obj.toString());
        }
    }

    /* renamed from: c */
    public final void m6018c(boolean z8) {
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.f10365c, "level", z8 ? 0 : 10000, z8 ? 10000 : 0);
        this.f10381s = objectAnimatorOfInt;
        objectAnimatorOfInt.setInterpolator(new LinearOutSlowInInterpolator());
        this.f10381s.start();
    }

    /* renamed from: d */
    public final void m6019d(List list) {
        getContext();
        C6354a c6354a = new C6354a(list, this.f10371i, this.f10372j, this.f10378p, this.f10380r, 0);
        this.f10367e = c6354a;
        setAdapterInternal(c6354a);
    }

    /* renamed from: e */
    public final void m6020e(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        Resources resources = getResources();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NiceSpinner);
        int dimensionPixelSize = resources.getDimensionPixelSize(R$dimen.one_and_a_half_grid_unit);
        setGravity(8388627);
        setPadding(resources.getDimensionPixelSize(R$dimen.three_grid_unit), dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        setClickable(true);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.NiceSpinner_backgroundSelector, R$drawable.selector);
        this.f10372j = resourceId;
        setBackgroundResource(resourceId);
        int i = R$styleable.NiceSpinner_textTint;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.textColorPrimary, typedValue, true);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(typedValue.data, new int[]{R.attr.textColorPrimary});
        int color = typedArrayObtainStyledAttributes2.getColor(0, ViewCompat.MEASURED_STATE_MASK);
        typedArrayObtainStyledAttributes2.recycle();
        int color2 = typedArrayObtainStyledAttributes.getColor(i, color);
        this.f10371i = color2;
        setTextColor(color2);
        ListPopupWindow listPopupWindow = new ListPopupWindow(context);
        this.f10366d = listPopupWindow;
        listPopupWindow.setOnItemClickListener(new C0024b(this));
        this.f10366d.setModal(true);
        this.f10366d.setOnDismissListener(new C0025c(this, 0));
        this.f10370h = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NiceSpinner_hideArrow, false);
        this.f10373k = typedArrayObtainStyledAttributes.getColor(R$styleable.NiceSpinner_arrowTint, getResources().getColor(R.color.black));
        this.f10377o = typedArrayObtainStyledAttributes.getResourceId(R$styleable.NiceSpinner_arrowDrawable, R$drawable.arrow);
        this.f10376n = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NiceSpinner_dropDownListPaddingBottom, 0);
        this.f10380r = PopUpTextAlignment.fromId(typedArrayObtainStyledAttributes.getInt(R$styleable.NiceSpinner_popupTextAlignment, PopUpTextAlignment.CENTER.ordinal()));
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(R$styleable.NiceSpinner_entries);
        if (textArray != null) {
            m6019d(Arrays.asList(textArray));
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f10374l = getContext().getResources().getDisplayMetrics().heightPixels;
    }

    /* renamed from: f */
    public final Drawable m6021f(int i) {
        if (this.f10377o == 0) {
            return null;
        }
        Drawable drawable = ContextCompat.getDrawable(getContext(), this.f10377o);
        if (drawable != null) {
            drawable = DrawableCompat.wrap(drawable).mutate();
            if (i != Integer.MAX_VALUE && i != 0) {
                DrawableCompat.setTint(drawable, i);
            }
        }
        return drawable;
    }

    /* renamed from: g */
    public final void m6022g() {
        if (!this.f10370h) {
            m6018c(true);
        }
        this.f10366d.setAnchorView(this);
        this.f10366d.show();
        ListView listView = this.f10366d.getListView();
        if (listView != null) {
            listView.setVerticalScrollBarEnabled(false);
            listView.setHorizontalScrollBarEnabled(false);
            listView.setVerticalFadingEdgeEnabled(false);
            listView.setHorizontalFadingEdgeEnabled(false);
        }
    }

    public int getDropDownListPaddingBottom() {
        return this.f10376n;
    }

    public InterfaceC0027e getOnSpinnerItemSelectedListener() {
        return this.f10369g;
    }

    public PopUpTextAlignment getPopUpTextAlignment() {
        return this.f10380r;
    }

    public int getSelectedIndex() {
        return this.f10364b;
    }

    public Object getSelectedItem() {
        return this.f10367e.mo6023a(this.f10364b);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public final void onDetachedFromWindow() {
        ObjectAnimator objectAnimator = this.f10381s;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            int i = bundle.getInt("selected_index");
            this.f10364b = i;
            AbstractC6356c abstractC6356c = this.f10367e;
            if (abstractC6356c != null) {
                InterfaceC0028f interfaceC0028f = this.f10379q;
                Object objMo6023a = abstractC6356c.mo6023a(i);
                ((C5707c) interfaceC0028f).getClass();
                setTextInternal(new SpannableString(objMo6023a.toString()).toString());
                this.f10367e.f10392e = this.f10364b;
            }
            if (bundle.getBoolean("is_popup_showing") && this.f10366d != null) {
                post(new RunnableC0023a(this, 0));
            }
            this.f10370h = bundle.getBoolean("is_arrow_hidden", false);
            this.f10377o = bundle.getInt("arrow_drawable_res_id");
            parcelable = bundle.getParcelable("instance_state");
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instance_state", super.onSaveInstanceState());
        bundle.putInt("selected_index", this.f10364b);
        bundle.putBoolean("is_arrow_hidden", this.f10370h);
        bundle.putInt("arrow_drawable_res_id", this.f10377o);
        ListPopupWindow listPopupWindow = this.f10366d;
        if (listPopupWindow != null) {
            bundle.putBoolean("is_popup_showing", listPopupWindow.isShowing());
        }
        return bundle;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && motionEvent.getAction() == 1) {
            if (this.f10366d.isShowing() || this.f10367e.getCount() <= 0) {
                if (!this.f10370h) {
                    m6018c(false);
                }
                this.f10366d.dismiss();
            } else {
                m6022g();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        Drawable drawableM6021f = m6021f(this.f10373k);
        this.f10365c = drawableM6021f;
        setArrowDrawableOrHide(drawableM6021f);
    }

    public void setAdapter(ListAdapter listAdapter) {
        getContext();
        C6354a c6354a = new C6354a(listAdapter, this.f10371i, this.f10372j, this.f10378p, this.f10380r, 1);
        this.f10367e = c6354a;
        setAdapterInternal(c6354a);
    }

    public void setArrowDrawable(@DrawableRes @ColorRes int i) {
        this.f10377o = i;
        Drawable drawableM6021f = m6021f(R$drawable.arrow);
        this.f10365c = drawableM6021f;
        setArrowDrawableOrHide(drawableM6021f);
    }

    public void setArrowTintColor(int i) {
        Drawable drawable = this.f10365c;
        if (drawable == null || this.f10370h) {
            return;
        }
        DrawableCompat.setTint(drawable, i);
    }

    public void setDropDownListPaddingBottom(int i) {
        this.f10376n = i;
    }

    @Deprecated
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f10368f = onItemSelectedListener;
    }

    public void setOnSpinnerItemSelectedListener(InterfaceC0027e interfaceC0027e) {
        this.f10369g = interfaceC0027e;
    }

    public void setSelectedIndex(int i) {
        AbstractC6356c abstractC6356c = this.f10367e;
        if (abstractC6356c != null) {
            if (i < 0 || i > abstractC6356c.getCount()) {
                throw new IllegalArgumentException("Position must be lower than adapter count!");
            }
            AbstractC6356c abstractC6356c2 = this.f10367e;
            abstractC6356c2.f10392e = i;
            this.f10364b = i;
            InterfaceC0028f interfaceC0028f = this.f10379q;
            Object objMo6023a = abstractC6356c2.mo6023a(i);
            ((C5707c) interfaceC0028f).getClass();
            setTextInternal(new SpannableString(objMo6023a.toString()).toString());
        }
    }

    public void setSelectedTextFormatter(InterfaceC0028f interfaceC0028f) {
        this.f10379q = interfaceC0028f;
    }

    public void setSpinnerTextFormatter(InterfaceC0028f interfaceC0028f) {
        this.f10378p = interfaceC0028f;
    }

    public void setTintColor(@ColorRes int i) {
        Drawable drawable = this.f10365c;
        if (drawable == null || this.f10370h) {
            return;
        }
        DrawableCompat.setTint(drawable, ContextCompat.getColor(getContext(), i));
    }

    public void setArrowDrawable(Drawable drawable) {
        this.f10365c = drawable;
        setArrowDrawableOrHide(drawable);
    }

    public NiceSpinner(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        this.f10378p = new C5707c();
        this.f10379q = new C5707c();
        this.f10381s = null;
        m6020e(context, attributeSet);
    }

    public NiceSpinner(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        this.f10378p = new C5707c();
        this.f10379q = new C5707c();
        this.f10381s = null;
        m6020e(context, attributeSet);
    }
}
