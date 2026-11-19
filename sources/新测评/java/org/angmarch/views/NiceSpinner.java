package org.angmarch.views;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListPopupWindow;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;
import java.util.Arrays;
import java.util.List;
import p182n9.C8676c;
import p182n9.InterfaceC8675b;
import p182n9.InterfaceC8677d;

/* loaded from: classes5.dex */
public class NiceSpinner extends AppCompatTextView {

    /* renamed from: b */
    public int f14876b;

    /* renamed from: c */
    public Drawable f14877c;

    /* renamed from: d */
    public ListPopupWindow f14878d;

    /* renamed from: e */
    public AbstractC8783c f14879e;

    /* renamed from: f */
    public AdapterView.OnItemClickListener f14880f;

    /* renamed from: g */
    public AdapterView.OnItemSelectedListener f14881g;

    /* renamed from: h */
    public InterfaceC8675b f14882h;

    /* renamed from: i */
    public boolean f14883i;

    /* renamed from: j */
    public int f14884j;

    /* renamed from: k */
    public int f14885k;

    /* renamed from: l */
    public int f14886l;

    /* renamed from: m */
    public int f14887m;

    /* renamed from: n */
    public int f14888n;

    /* renamed from: o */
    public int f14889o;

    /* renamed from: p */
    public int f14890p;

    /* renamed from: q */
    public InterfaceC8677d f14891q;

    /* renamed from: r */
    public InterfaceC8677d f14892r;

    /* renamed from: s */
    public PopUpTextAlignment f14893s;

    /* renamed from: t */
    public ObjectAnimator f14894t;

    /* renamed from: org.angmarch.views.NiceSpinner$a */
    public class C8779a implements AdapterView.OnItemClickListener {
        public C8779a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            View view2;
            long j11;
            AdapterView adapterView2;
            if (i10 >= NiceSpinner.this.f14876b && i10 < NiceSpinner.this.f14879e.getCount()) {
                i10++;
            }
            int i11 = i10;
            NiceSpinner.this.f14876b = i11;
            if (NiceSpinner.this.f14882h != null) {
                view2 = view;
                j11 = j10;
                NiceSpinner.this.f14882h.mo11800a(NiceSpinner.this, view2, i11, j11);
            } else {
                view2 = view;
                j11 = j10;
            }
            if (NiceSpinner.this.f14880f != null) {
                adapterView2 = adapterView;
                NiceSpinner.this.f14880f.onItemClick(adapterView2, view2, i11, j11);
            } else {
                adapterView2 = adapterView;
            }
            if (NiceSpinner.this.f14881g != null) {
                NiceSpinner.this.f14881g.onItemSelected(adapterView2, view2, i11, j11);
            }
            NiceSpinner.this.f14879e.m14673b(i11);
            NiceSpinner niceSpinner = NiceSpinner.this;
            niceSpinner.setTextInternal(niceSpinner.f14879e.mo14672a(i11));
            NiceSpinner.this.m14663m();
        }
    }

    /* renamed from: org.angmarch.views.NiceSpinner$b */
    public class C8780b implements PopupWindow.OnDismissListener {
        public C8780b() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (NiceSpinner.this.f14883i) {
                return;
            }
            NiceSpinner.this.m14661k(false);
        }
    }

    public NiceSpinner(Context context) throws Resources.NotFoundException {
        super(context);
        this.f14891q = new C8676c();
        this.f14892r = new C8676c();
        this.f14894t = null;
        m14665o(context, null);
    }

    private int getParentVerticalOffset() {
        int i10 = this.f14888n;
        if (i10 > 0) {
            return i10;
        }
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        int i11 = iArr[1];
        this.f14888n = i11;
        return i11;
    }

    private int getPopUpHeight() {
        return Math.max(m14670t(), m14669s());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m14661k(boolean z9) {
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.f14877c, "level", z9 ? 0 : 10000, z9 ? 10000 : 0);
        this.f14894t = objectAnimatorOfInt;
        objectAnimatorOfInt.setInterpolator(new LinearOutSlowInInterpolator());
        this.f14894t.start();
    }

    private <T> void setAdapterInternal(AbstractC8783c abstractC8783c) {
        if (abstractC8783c.getCount() >= 0) {
            this.f14876b = 0;
            this.f14878d.setAdapter(abstractC8783c);
            setTextInternal(abstractC8783c.mo14672a(this.f14876b));
        }
    }

    private void setArrowDrawableOrHide(Drawable drawable) {
        if (this.f14883i || drawable == null) {
            setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextInternal(Object obj) {
        InterfaceC8677d interfaceC8677d = this.f14892r;
        if (interfaceC8677d != null) {
            setText(interfaceC8677d.mo14279a(obj));
        } else {
            setText(obj.toString());
        }
    }

    public int getDropDownListPaddingBottom() {
        return this.f14889o;
    }

    public InterfaceC8675b getOnSpinnerItemSelectedListener() {
        return this.f14882h;
    }

    public PopUpTextAlignment getPopUpTextAlignment() {
        return this.f14893s;
    }

    public int getSelectedIndex() {
        return this.f14876b;
    }

    public Object getSelectedItem() {
        return this.f14879e.mo14672a(this.f14876b);
    }

    /* renamed from: l */
    public void m14662l(List list) {
        C8781a c8781a = new C8781a(getContext(), list, this.f14884j, this.f14885k, this.f14891q, this.f14893s);
        this.f14879e = c8781a;
        setAdapterInternal(c8781a);
    }

    /* renamed from: m */
    public void m14663m() {
        if (!this.f14883i) {
            m14661k(false);
        }
        this.f14878d.dismiss();
    }

    /* renamed from: n */
    public final int m14664n(Context context) throws Resources.NotFoundException {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.textColorPrimary, typedValue, true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(typedValue.data, new int[]{R.attr.textColorPrimary});
        int color = typedArrayObtainStyledAttributes.getColor(0, ViewCompat.MEASURED_STATE_MASK);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    /* renamed from: o */
    public final void m14665o(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        Resources resources = getResources();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NiceSpinner);
        int dimensionPixelSize = resources.getDimensionPixelSize(R$dimen.one_and_a_half_grid_unit);
        setGravity(8388627);
        setPadding(resources.getDimensionPixelSize(R$dimen.three_grid_unit), dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        setClickable(true);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.NiceSpinner_backgroundSelector, R$drawable.selector);
        this.f14885k = resourceId;
        setBackgroundResource(resourceId);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.NiceSpinner_textTint, m14664n(context));
        this.f14884j = color;
        setTextColor(color);
        ListPopupWindow listPopupWindow = new ListPopupWindow(context);
        this.f14878d = listPopupWindow;
        listPopupWindow.setOnItemClickListener(new C8779a());
        this.f14878d.setModal(true);
        this.f14878d.setOnDismissListener(new C8780b());
        this.f14883i = typedArrayObtainStyledAttributes.getBoolean(R$styleable.NiceSpinner_hideArrow, false);
        this.f14886l = typedArrayObtainStyledAttributes.getColor(R$styleable.NiceSpinner_arrowTint, getResources().getColor(R.color.black));
        this.f14890p = typedArrayObtainStyledAttributes.getResourceId(R$styleable.NiceSpinner_arrowDrawable, R$drawable.arrow);
        this.f14889o = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NiceSpinner_dropDownListPaddingBottom, 0);
        this.f14893s = PopUpTextAlignment.m14671a(typedArrayObtainStyledAttributes.getInt(R$styleable.NiceSpinner_popupTextAlignment, PopUpTextAlignment.CENTER.ordinal()));
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(R$styleable.NiceSpinner_entries);
        if (textArray != null) {
            m14662l(Arrays.asList(textArray));
        }
        typedArrayObtainStyledAttributes.recycle();
        m14667q();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void onDetachedFromWindow() {
        ObjectAnimator objectAnimator = this.f14894t;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            int i10 = bundle.getInt("selected_index");
            this.f14876b = i10;
            AbstractC8783c abstractC8783c = this.f14879e;
            if (abstractC8783c != null) {
                setTextInternal(this.f14892r.mo14279a(abstractC8783c.mo14672a(i10)).toString());
                this.f14879e.m14673b(this.f14876b);
            }
            if (bundle.getBoolean("is_popup_showing") && this.f14878d != null) {
                post(new Runnable() { // from class: n9.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f14412a.m14668r();
                    }
                });
            }
            this.f14883i = bundle.getBoolean("is_arrow_hidden", false);
            this.f14890p = bundle.getInt("arrow_drawable_res_id");
            parcelable = bundle.getParcelable("instance_state");
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instance_state", super.onSaveInstanceState());
        bundle.putInt("selected_index", this.f14876b);
        bundle.putBoolean("is_arrow_hidden", this.f14883i);
        bundle.putInt("arrow_drawable_res_id", this.f14890p);
        ListPopupWindow listPopupWindow = this.f14878d;
        if (listPopupWindow != null) {
            bundle.putBoolean("is_popup_showing", listPopupWindow.isShowing());
        }
        return bundle;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && motionEvent.getAction() == 1) {
            if (this.f14878d.isShowing() || this.f14879e.getCount() <= 0) {
                m14663m();
            } else {
                m14668r();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView, android.view.View
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        Drawable drawableM14666p = m14666p(this.f14886l);
        this.f14877c = drawableM14666p;
        setArrowDrawableOrHide(drawableM14666p);
    }

    /* renamed from: p */
    public final Drawable m14666p(int i10) {
        if (this.f14890p == 0) {
            return null;
        }
        Drawable drawable = ContextCompat.getDrawable(getContext(), this.f14890p);
        if (drawable != null) {
            drawable = DrawableCompat.wrap(drawable).mutate();
            if (i10 != Integer.MAX_VALUE && i10 != 0) {
                DrawableCompat.setTint(drawable, i10);
            }
        }
        return drawable;
    }

    /* renamed from: q */
    public final void m14667q() {
        this.f14887m = getContext().getResources().getDisplayMetrics().heightPixels;
    }

    /* renamed from: r */
    public void m14668r() {
        if (!this.f14883i) {
            m14661k(true);
        }
        this.f14878d.setAnchorView(this);
        this.f14878d.show();
        ListView listView = this.f14878d.getListView();
        if (listView != null) {
            listView.setVerticalScrollBarEnabled(false);
            listView.setHorizontalScrollBarEnabled(false);
            listView.setVerticalFadingEdgeEnabled(false);
            listView.setHorizontalFadingEdgeEnabled(false);
        }
    }

    /* renamed from: s */
    public final int m14669s() {
        return getParentVerticalOffset();
    }

    public void setAdapter(ListAdapter listAdapter) {
        C8782b c8782b = new C8782b(getContext(), listAdapter, this.f14884j, this.f14885k, this.f14891q, this.f14893s);
        this.f14879e = c8782b;
        setAdapterInternal(c8782b);
    }

    public void setArrowDrawable(@DrawableRes @ColorRes int i10) {
        this.f14890p = i10;
        Drawable drawableM14666p = m14666p(R$drawable.arrow);
        this.f14877c = drawableM14666p;
        setArrowDrawableOrHide(drawableM14666p);
    }

    public void setArrowTintColor(int i10) {
        Drawable drawable = this.f14877c;
        if (drawable == null || this.f14883i) {
            return;
        }
        DrawableCompat.setTint(drawable, i10);
    }

    public void setDropDownListPaddingBottom(int i10) {
        this.f14889o = i10;
    }

    @Deprecated
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f14881g = onItemSelectedListener;
    }

    public void setOnSpinnerItemSelectedListener(InterfaceC8675b interfaceC8675b) {
        this.f14882h = interfaceC8675b;
    }

    public void setSelectedIndex(int i10) {
        AbstractC8783c abstractC8783c = this.f14879e;
        if (abstractC8783c != null) {
            if (i10 < 0 || i10 > abstractC8783c.getCount()) {
                throw new IllegalArgumentException("Position must be lower than adapter count!");
            }
            this.f14879e.m14673b(i10);
            this.f14876b = i10;
            setTextInternal(this.f14892r.mo14279a(this.f14879e.mo14672a(i10)).toString());
        }
    }

    public void setSelectedTextFormatter(InterfaceC8677d interfaceC8677d) {
        this.f14892r = interfaceC8677d;
    }

    public void setSpinnerTextFormatter(InterfaceC8677d interfaceC8677d) {
        this.f14891q = interfaceC8677d;
    }

    public void setTintColor(@ColorRes int i10) {
        Drawable drawable = this.f14877c;
        if (drawable == null || this.f14883i) {
            return;
        }
        DrawableCompat.setTint(drawable, ContextCompat.getColor(getContext(), i10));
    }

    /* renamed from: t */
    public final int m14670t() {
        return (this.f14887m - getParentVerticalOffset()) - getMeasuredHeight();
    }

    public void setArrowDrawable(Drawable drawable) {
        this.f14877c = drawable;
        setArrowDrawableOrHide(drawable);
    }
}
