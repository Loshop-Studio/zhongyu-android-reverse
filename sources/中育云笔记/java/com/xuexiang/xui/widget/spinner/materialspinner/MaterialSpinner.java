package com.xuexiang.xui.widget.spinner.materialspinner;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$drawable;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC8040f;
import com.xuexiang.xui.utils.AbstractC8041g;
import com.xuexiang.xui.utils.AbstractC8042h;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import p034b8.AbstractC5175c;
import p193i9.AbstractC9616b;
import p193i9.C9615a;

/* loaded from: classes5.dex */
public class MaterialSpinner extends AppCompatTextView {

    /* renamed from: d */
    public AbstractC9616b f16987d;

    /* renamed from: e */
    public PopupWindow f16988e;

    /* renamed from: f */
    public ListView f16989f;

    /* renamed from: g */
    public Drawable f16990g;

    /* renamed from: h */
    public boolean f16991h;

    /* renamed from: i */
    public boolean f16992i;

    /* renamed from: j */
    public int f16993j;

    /* renamed from: k */
    public int f16994k;

    /* renamed from: l */
    public int f16995l;

    /* renamed from: m */
    public int f16996m;

    /* renamed from: n */
    public int f16997n;

    /* renamed from: o */
    public int f16998o;

    /* renamed from: p */
    public int f16999p;

    /* renamed from: q */
    public boolean f17000q;

    /* renamed from: r */
    public int f17001r;

    /* renamed from: com.xuexiang.xui.widget.spinner.materialspinner.MaterialSpinner$a */
    public class C8255a implements AdapterView.OnItemClickListener {
        public C8255a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            if (i10 >= MaterialSpinner.this.f16995l && i10 < MaterialSpinner.this.f16987d.getCount()) {
                i10++;
            }
            MaterialSpinner.this.f16995l = i10;
            MaterialSpinner.this.f16992i = false;
            Object objMo18844a = MaterialSpinner.this.f16987d.mo18844a(i10);
            MaterialSpinner.this.f16987d.m18848e(i10);
            MaterialSpinner.this.setText(objMo18844a.toString());
            MaterialSpinner.this.m13255o();
            MaterialSpinner.m13247h(MaterialSpinner.this);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.spinner.materialspinner.MaterialSpinner$b */
    public class C8256b implements PopupWindow.OnDismissListener {
        public C8256b() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (MaterialSpinner.this.f16992i) {
                MaterialSpinner.m13248i(MaterialSpinner.this);
            }
            if (MaterialSpinner.this.f16991h) {
                return;
            }
            MaterialSpinner.this.m13252l(false);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.spinner.materialspinner.MaterialSpinner$c */
    public class RunnableC8257c implements Runnable {
        public RunnableC8257c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MaterialSpinner.this.m13256p();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.spinner.materialspinner.MaterialSpinner$d */
    public interface InterfaceC8258d {
    }

    /* renamed from: com.xuexiang.xui.widget.spinner.materialspinner.MaterialSpinner$e */
    public interface InterfaceC8259e {
    }

    public MaterialSpinner(Context context) {
        this(context, null);
    }

    /* renamed from: h */
    public static /* synthetic */ InterfaceC8258d m13247h(MaterialSpinner materialSpinner) {
        materialSpinner.getClass();
        return null;
    }

    /* renamed from: i */
    public static /* synthetic */ InterfaceC8259e m13248i(MaterialSpinner materialSpinner) {
        materialSpinner.getClass();
        return null;
    }

    /* renamed from: r */
    private void m13251r(Context context, AttributeSet attributeSet, int i10) throws NoSuchMethodException, SecurityException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MaterialSpinner, i10, 0);
        int defaultColor = getTextColors().getDefaultColor();
        AbstractC8040f.m12212m();
        try {
            this.f16996m = typedArrayObtainStyledAttributes.getColor(R$styleable.MaterialSpinner_ms_background_color, -1);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialSpinner_ms_background_selector, 0);
            this.f16999p = typedArrayObtainStyledAttributes.getColor(R$styleable.MaterialSpinner_ms_text_color, defaultColor);
            this.f16990g = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.MaterialSpinner_ms_arrow_image);
            this.f16997n = typedArrayObtainStyledAttributes.getColor(R$styleable.MaterialSpinner_ms_arrow_tint, this.f16999p);
            this.f16991h = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialSpinner_ms_hide_arrow, false);
            this.f16993j = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MaterialSpinner_ms_dropdown_max_height, 0);
            this.f16994k = typedArrayObtainStyledAttributes.getLayoutDimension(R$styleable.MaterialSpinner_ms_dropdown_height, -2);
            this.f16998o = AbstractC8040f.m12213n(this.f16997n, 0.8f);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialSpinner_ms_entries, 0);
            Drawable drawableM12206g = AbstractC8040f.m12206g(getContext(), typedArrayObtainStyledAttributes, R$styleable.MaterialSpinner_ms_dropdown_bg);
            this.f17000q = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialSpinner_ms_in_dialog, false);
            int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialSpinner_ms_pop_anim_style, -1);
            typedArrayObtainStyledAttributes.recycle();
            int iM12219f = AbstractC8041g.m12219f(getContext(), R$attr.ms_padding_top_size);
            int iM12219f2 = AbstractC8041g.m12219f(getContext(), R$attr.ms_padding_left_size);
            this.f17001r = AbstractC8041g.m12219f(getContext(), R$attr.ms_dropdown_offset);
            setGravity(8388627);
            setClickable(true);
            setPaddingRelative(iM12219f2, iM12219f, iM12219f, iM12219f);
            setBackgroundResource(R$drawable.ms_background_selector);
            if (!this.f16991h) {
                if (this.f16990g == null) {
                    this.f16990g = AbstractC8040f.m12211l(getContext(), R$drawable.ms_ic_arrow_up).mutate();
                }
                this.f16990g.setColorFilter(this.f16997n, PorterDuff.Mode.SRC_IN);
                int iM12219f3 = AbstractC8041g.m12219f(getContext(), R$attr.ms_arrow_size);
                this.f16990g.setBounds(0, 0, iM12219f3, iM12219f3);
                setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, this.f16990g, (Drawable) null);
            }
            ListView listView = new ListView(context);
            this.f16989f = listView;
            listView.setId(getId());
            this.f16989f.setDivider(null);
            this.f16989f.setItemsCanFocus(true);
            int iM12219f4 = AbstractC8041g.m12219f(getContext(), R$attr.ms_dropdown_offset);
            this.f16989f.setPadding(iM12219f4, iM12219f4, iM12219f4, iM12219f4);
            this.f16989f.setOnItemClickListener(new C8255a());
            if (resourceId2 != 0) {
                m13259t(AbstractC8040f.m12210k(resourceId2));
            }
            PopupWindow popupWindow = new PopupWindow(context);
            this.f16988e = popupWindow;
            popupWindow.setContentView(this.f16989f);
            this.f16988e.setOutsideTouchable(true);
            if (resourceId3 != -1) {
                this.f16988e.setAnimationStyle(resourceId3);
            }
            this.f16988e.setFocusable(true);
            this.f16988e.setInputMethodMode(2);
            this.f16988e.setSoftInputMode(48);
            this.f16988e.setElevation(16.0f);
            if (drawableM12206g != null) {
                this.f16988e.setBackgroundDrawable(drawableM12206g);
            } else {
                this.f16988e.setBackgroundDrawable(AbstractC8040f.m12205f(getContext(), R$drawable.ms_drop_down_bg));
            }
            int i11 = this.f16996m;
            if (i11 != -1) {
                setBackgroundColor(i11);
            } else if (resourceId != 0) {
                setBackgroundResource(resourceId);
            }
            int i12 = this.f16999p;
            if (i12 != defaultColor) {
                setTextColor(i12);
            }
            this.f16988e.setOnDismissListener(new C8256b());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    private void setAdapterInternal(@NonNull AbstractC9616b abstractC9616b) {
        this.f16989f.setAdapter((ListAdapter) abstractC9616b);
        if (this.f16995l >= abstractC9616b.getCount()) {
            this.f16995l = 0;
        }
        if (abstractC9616b.getCount() >= 0) {
            setText(abstractC9616b.mo18844a(this.f16995l).toString());
        } else {
            setText("");
        }
    }

    public AbstractC9616b getAdapter() {
        return this.f16987d;
    }

    public <T> List<T> getItems() {
        AbstractC9616b abstractC9616b = this.f16987d;
        if (abstractC9616b == null) {
            return null;
        }
        return abstractC9616b.mo18845c();
    }

    public ListView getListView() {
        return this.f16989f;
    }

    public PopupWindow getPopupWindow() {
        return this.f16988e;
    }

    public int getSelectedIndex() {
        return this.f16995l;
    }

    public <T> T getSelectedItem() {
        AbstractC9616b abstractC9616b = this.f16987d;
        if (abstractC9616b != null) {
            return (T) abstractC9616b.mo18844a(this.f16995l);
        }
        return null;
    }

    /* renamed from: l */
    public final void m13252l(boolean z10) {
        ObjectAnimator.ofInt(this.f16990g, "level", z10 ? 0 : 10000, z10 ? 10000 : 0).start();
    }

    /* renamed from: m */
    public final int m13253m(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int height = view.getHeight();
        int iM12232f = AbstractC8042h.m12232f(getContext());
        int iM12231e = AbstractC8042h.m12231e(this.f16989f);
        int i10 = this.f16993j;
        if (i10 > 0 && iM12231e > i10) {
            iM12231e = i10;
        }
        if (iM12232f - iArr[1] < iM12231e + height) {
            return -(iM12231e + this.f17001r + height);
        }
        return 0;
    }

    /* renamed from: n */
    public final int m13254n() {
        AbstractC9616b abstractC9616b = this.f16987d;
        if (abstractC9616b == null) {
            return -2;
        }
        float count = abstractC9616b.getCount() * AbstractC8041g.m12219f(getContext(), R$attr.ms_item_height_size);
        int i10 = this.f16993j;
        if (i10 > 0 && count > i10) {
            return i10;
        }
        int i11 = this.f16994k;
        if (i11 == -1 || i11 == -2 || i11 > count) {
            return -2;
        }
        return i11;
    }

    /* renamed from: o */
    public void m13255o() {
        if (!this.f16991h) {
            m13252l(false);
        }
        this.f16988e.dismiss();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        this.f16988e.setHeight(m13254n());
        if (this.f16987d != null) {
            CharSequence text = getText();
            String string = text.toString();
            for (int i12 = 0; i12 < this.f16987d.getCount(); i12++) {
                String strM18846b = this.f16987d.m18846b(i12);
                if (strM18846b.length() > string.length()) {
                    string = strM18846b;
                }
            }
            setText(string);
            super.onMeasure(i10, i11);
            setText(text);
        } else {
            super.onMeasure(i10, i11);
        }
        this.f16988e.setWidth(getMeasuredWidth());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            int i10 = bundle.getInt("selected_index");
            this.f16995l = i10;
            AbstractC9616b abstractC9616b = this.f16987d;
            if (abstractC9616b != null) {
                setText(abstractC9616b.mo18844a(i10).toString());
                this.f16987d.m18848e(this.f16995l);
            }
            if (bundle.getBoolean("is_popup_showing") && this.f16988e != null) {
                post(new RunnableC8257c());
            }
            parcelable = bundle.getParcelable("state");
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("state", super.onSaveInstanceState());
        bundle.putInt("selected_index", this.f16995l);
        PopupWindow popupWindow = this.f16988e;
        if (popupWindow == null) {
            bundle.putBoolean("is_popup_showing", false);
            return bundle;
        }
        bundle.putBoolean("is_popup_showing", popupWindow.isShowing());
        m13255o();
        return bundle;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && isEnabled() && isClickable()) {
            if (this.f16988e.isShowing()) {
                m13255o();
            } else {
                m13256p();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public void m13256p() {
        if (m13257q()) {
            if (!this.f16991h) {
                m13252l(true);
            }
            this.f16992i = true;
            m13260u();
        }
    }

    /* renamed from: q */
    public final boolean m13257q() {
        AbstractC9616b abstractC9616b = this.f16987d;
        return abstractC9616b != null && abstractC9616b.getCount() > 0;
    }

    /* renamed from: s */
    public MaterialSpinner m13258s(List list) {
        AbstractC9616b abstractC9616bM18850g = new C9615a(getContext(), list).m18849f(this.f16999p).m18850g(getTextSize());
        this.f16987d = abstractC9616bM18850g;
        setAdapterInternal(abstractC9616bM18850g);
        return this;
    }

    public void setArrowColor(@ColorInt int i10) {
        this.f16997n = i10;
        this.f16998o = AbstractC8040f.m12213n(i10, 0.8f);
        Drawable drawable = this.f16990g;
        if (drawable != null) {
            drawable.setColorFilter(this.f16997n, PorterDuff.Mode.SRC_IN);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) throws NoSuchMethodException, SecurityException {
        this.f16996m = i10;
        Drawable background = getBackground();
        if (background instanceof StateListDrawable) {
            try {
                Method declaredMethod = StateListDrawable.class.getDeclaredMethod("getStateDrawable", Integer.TYPE);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                int[] iArr = {AbstractC8040f.m12200a(i10, 0.85f), i10};
                for (int i11 = 0; i11 < 2; i11++) {
                    ((ColorDrawable) declaredMethod.invoke(background, Integer.valueOf(i11))).setColor(iArr[i11]);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                AbstractC5175c.m2710d(e10);
            }
        } else if (background != null) {
            background.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
        }
        this.f16988e.getBackground().setColorFilter(i10, PorterDuff.Mode.SRC_IN);
    }

    public void setDropdownHeight(int i10) {
        this.f16994k = i10;
        this.f16988e.setHeight(m13254n());
    }

    public void setDropdownMaxHeight(int i10) {
        this.f16993j = i10;
        this.f16988e.setHeight(m13254n());
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        Drawable drawable = this.f16990g;
        if (drawable != null) {
            drawable.setColorFilter(z10 ? this.f16997n : this.f16998o, PorterDuff.Mode.SRC_IN);
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(int i10) {
        this.f16999p = i10;
        super.setTextColor(i10);
    }

    /* renamed from: t */
    public final MaterialSpinner m13259t(Object... objArr) {
        m13258s(Arrays.asList(objArr));
        return this;
    }

    /* renamed from: u */
    public final void m13260u() {
        if (this.f17000q) {
            this.f16988e.showAsDropDown(this);
        } else {
            this.f16988e.showAsDropDown(this, 0, m13253m(this));
        }
    }

    public MaterialSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.MaterialSpinnerStyle);
    }

    public MaterialSpinner(Context context, AttributeSet attributeSet, int i10) throws NoSuchMethodException, SecurityException {
        super(context, attributeSet, i10);
        m13251r(context, attributeSet, i10);
    }
}
