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
import com.tencent.smtt.audio.core.utils.TbsDialogBase;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$drawable;
import com.xuexiang.xui.R$styleable;
import com.xuexiang.xui.utils.AbstractC6875e;
import com.xuexiang.xui.utils.AbstractC6877g;
import com.xuexiang.xui.utils.AbstractC6878h;
import java.lang.reflect.Method;
import java.util.List;
import p184n1.AbstractC9363c;
import p240s2.AbstractC9971b;
import p240s2.C9970a;

/* loaded from: classes4.dex */
public class MaterialSpinner extends AppCompatTextView {

    /* renamed from: b */
    public InterfaceC7007d f8155b;

    /* renamed from: c */
    public AbstractC9971b f8156c;

    /* renamed from: d */
    public PopupWindow f8157d;

    /* renamed from: e */
    public ListView f8158e;

    /* renamed from: f */
    public Drawable f8159f;

    /* renamed from: g */
    public boolean f8160g;

    /* renamed from: h */
    public boolean f8161h;

    /* renamed from: i */
    public int f8162i;

    /* renamed from: j */
    public int f8163j;

    /* renamed from: k */
    public int f8164k;

    /* renamed from: l */
    public int f8165l;

    /* renamed from: m */
    public int f8166m;

    /* renamed from: n */
    public int f8167n;

    /* renamed from: o */
    public int f8168o;

    /* renamed from: p */
    public boolean f8169p;

    /* renamed from: q */
    public int f8170q;

    /* renamed from: com.xuexiang.xui.widget.spinner.materialspinner.MaterialSpinner$a */
    public class C7004a implements AdapterView.OnItemClickListener {
        public C7004a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            if (i10 >= MaterialSpinner.this.f8164k && i10 < MaterialSpinner.this.f8156c.getCount()) {
                i10++;
            }
            int i11 = i10;
            MaterialSpinner.this.f8164k = i11;
            MaterialSpinner.this.f8161h = false;
            Object objMo18653a = MaterialSpinner.this.f8156c.mo18653a(i11);
            MaterialSpinner.this.f8156c.m18657e(i11);
            MaterialSpinner.this.setText(objMo18653a.toString());
            MaterialSpinner.this.m7145n();
            if (MaterialSpinner.this.f8155b != null) {
                MaterialSpinner.this.f8155b.mo2100a(MaterialSpinner.this, i11, j10, objMo18653a);
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.spinner.materialspinner.MaterialSpinner$b */
    public class C7005b implements PopupWindow.OnDismissListener {
        public C7005b() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (MaterialSpinner.this.f8161h) {
                MaterialSpinner.m7138h(MaterialSpinner.this);
            }
            if (MaterialSpinner.this.f8160g) {
                return;
            }
            MaterialSpinner.this.m7142k(false);
        }
    }

    /* renamed from: com.xuexiang.xui.widget.spinner.materialspinner.MaterialSpinner$c */
    public class RunnableC7006c implements Runnable {
        public RunnableC7006c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MaterialSpinner.this.m7146o();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.spinner.materialspinner.MaterialSpinner$d */
    public interface InterfaceC7007d {
        /* renamed from: a */
        void mo2100a(MaterialSpinner materialSpinner, int i10, long j10, Object obj);
    }

    /* renamed from: com.xuexiang.xui.widget.spinner.materialspinner.MaterialSpinner$e */
    public interface InterfaceC7008e {
    }

    public MaterialSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.MaterialSpinnerStyle);
    }

    /* renamed from: h */
    public static /* synthetic */ InterfaceC7008e m7138h(MaterialSpinner materialSpinner) {
        materialSpinner.getClass();
        return null;
    }

    /* renamed from: r */
    private void m7141r(Context context, AttributeSet attributeSet, int i10) throws NoSuchMethodException, SecurityException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MaterialSpinner, i10, 0);
        int defaultColor = getTextColors().getDefaultColor();
        try {
            this.f8165l = typedArrayObtainStyledAttributes.getColor(R$styleable.MaterialSpinner_ms_background_color, -1);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialSpinner_ms_background_selector, 0);
            this.f8168o = typedArrayObtainStyledAttributes.getColor(R$styleable.MaterialSpinner_ms_text_color, defaultColor);
            this.f8159f = AbstractC6875e.m6453i(context, typedArrayObtainStyledAttributes, R$styleable.MaterialSpinner_ms_arrow_image);
            this.f8166m = typedArrayObtainStyledAttributes.getColor(R$styleable.MaterialSpinner_ms_arrow_tint, this.f8168o);
            this.f8160g = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialSpinner_ms_hide_arrow, false);
            this.f8162i = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.MaterialSpinner_ms_dropdown_max_height, 0);
            this.f8163j = typedArrayObtainStyledAttributes.getLayoutDimension(R$styleable.MaterialSpinner_ms_dropdown_height, -2);
            this.f8167n = AbstractC6875e.m6460p(this.f8166m, 0.8f);
            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialSpinner_ms_entries, 0);
            Drawable drawableM6453i = AbstractC6875e.m6453i(context, typedArrayObtainStyledAttributes, R$styleable.MaterialSpinner_ms_dropdown_bg);
            this.f8169p = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialSpinner_ms_in_dialog, false);
            int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialSpinner_ms_pop_anim_style, -1);
            typedArrayObtainStyledAttributes.recycle();
            int iM6481o = AbstractC6877g.m6481o(getContext(), R$attr.ms_padding_top_size);
            int iM6481o2 = AbstractC6877g.m6481o(getContext(), R$attr.ms_padding_left_size);
            this.f8170q = AbstractC6877g.m6481o(getContext(), R$attr.ms_dropdown_offset);
            setGravity(8388627);
            setClickable(true);
            setPaddingRelative(iM6481o2, iM6481o, iM6481o, iM6481o);
            setBackgroundResource(R$drawable.ms_background_selector);
            if (!this.f8160g) {
                if (this.f8159f == null) {
                    this.f8159f = AbstractC6875e.m6459o(getContext(), R$drawable.ms_ic_arrow_up).mutate();
                }
                this.f8159f.setColorFilter(this.f8166m, PorterDuff.Mode.SRC_IN);
                int iM6481o3 = AbstractC6877g.m6481o(getContext(), R$attr.ms_arrow_size);
                this.f8159f.setBounds(0, 0, iM6481o3, iM6481o3);
                setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, this.f8159f, (Drawable) null);
            }
            ListView listView = new ListView(context);
            this.f8158e = listView;
            listView.setId(getId());
            this.f8158e.setDivider(null);
            this.f8158e.setItemsCanFocus(true);
            int iM6481o4 = AbstractC6877g.m6481o(getContext(), R$attr.ms_dropdown_offset);
            this.f8158e.setPadding(iM6481o4, iM6481o4, iM6481o4, iM6481o4);
            this.f8158e.setOnItemClickListener(new C7004a());
            if (resourceId2 != 0) {
                m7149s(AbstractC6875e.m6457m(context, resourceId2));
            }
            PopupWindow popupWindow = new PopupWindow(context);
            this.f8157d = popupWindow;
            popupWindow.setContentView(this.f8158e);
            this.f8157d.setOutsideTouchable(true);
            if (resourceId3 != -1) {
                this.f8157d.setAnimationStyle(resourceId3);
            }
            this.f8157d.setFocusable(true);
            this.f8157d.setInputMethodMode(2);
            this.f8157d.setSoftInputMode(48);
            this.f8157d.setElevation(16.0f);
            if (drawableM6453i != null) {
                this.f8157d.setBackgroundDrawable(drawableM6453i);
            } else {
                this.f8157d.setBackgroundDrawable(AbstractC6875e.m6452h(getContext(), R$drawable.ms_drop_down_bg));
            }
            int i11 = this.f8165l;
            if (i11 != -1) {
                setBackgroundColor(i11);
            } else if (resourceId != 0) {
                setBackgroundResource(resourceId);
            }
            int i12 = this.f8168o;
            if (i12 != defaultColor) {
                setTextColor(i12);
            }
            this.f8157d.setOnDismissListener(new C7005b());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    private void setAdapterInternal(@NonNull AbstractC9971b abstractC9971b) {
        this.f8158e.setAdapter((ListAdapter) abstractC9971b);
        if (this.f8164k >= abstractC9971b.getCount()) {
            this.f8164k = 0;
        }
        if (abstractC9971b.getCount() >= 0) {
            setText(abstractC9971b.mo18653a(this.f8164k).toString());
        } else {
            setText("");
        }
    }

    public AbstractC9971b getAdapter() {
        return this.f8156c;
    }

    public <T> List<T> getItems() {
        AbstractC9971b abstractC9971b = this.f8156c;
        if (abstractC9971b == null) {
            return null;
        }
        return abstractC9971b.mo18654c();
    }

    public ListView getListView() {
        return this.f8158e;
    }

    public PopupWindow getPopupWindow() {
        return this.f8157d;
    }

    public int getSelectedIndex() {
        return this.f8164k;
    }

    public <T> T getSelectedItem() {
        AbstractC9971b abstractC9971b = this.f8156c;
        if (abstractC9971b != null) {
            return (T) abstractC9971b.mo18653a(this.f8164k);
        }
        return null;
    }

    /* renamed from: k */
    public final void m7142k(boolean z10) {
        int i10 = TbsDialogBase.BTN_ID_POSITIVE;
        int i11 = z10 ? 0 : 10000;
        if (!z10) {
            i10 = 0;
        }
        ObjectAnimator.ofInt(this.f8159f, "level", i11, i10).start();
    }

    /* renamed from: l */
    public final int m7143l(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int height = view.getHeight();
        int iM6498i = AbstractC6878h.m6498i(getContext());
        int iM6497h = AbstractC6878h.m6497h(this.f8158e);
        int i10 = this.f8162i;
        if (i10 > 0 && iM6497h > i10) {
            iM6497h = i10;
        }
        if (iM6498i - iArr[1] < iM6497h + height) {
            return -(iM6497h + this.f8170q + height);
        }
        return 0;
    }

    /* renamed from: m */
    public final int m7144m() {
        AbstractC9971b abstractC9971b = this.f8156c;
        if (abstractC9971b == null) {
            return -2;
        }
        float count = abstractC9971b.getCount() * AbstractC6877g.m6481o(getContext(), R$attr.ms_item_height_size);
        int i10 = this.f8162i;
        if (i10 > 0 && count > i10) {
            return i10;
        }
        int i11 = this.f8163j;
        if (i11 == -1 || i11 == -2 || i11 > count) {
            return -2;
        }
        return i11;
    }

    /* renamed from: n */
    public void m7145n() {
        if (!this.f8160g) {
            m7142k(false);
        }
        this.f8157d.dismiss();
    }

    /* renamed from: o */
    public void m7146o() {
        if (m7148q()) {
            if (!this.f8160g) {
                m7142k(true);
            }
            this.f8161h = true;
            m7153w();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        this.f8157d.setHeight(m7144m());
        if (this.f8156c != null) {
            CharSequence text = getText();
            String string = text.toString();
            for (int i12 = 0; i12 < this.f8156c.getCount(); i12++) {
                String strM18655b = this.f8156c.m18655b(i12);
                if (strM18655b.length() > string.length()) {
                    string = strM18655b;
                }
            }
            setText(string);
            super.onMeasure(i10, i11);
            setText(text);
        } else {
            super.onMeasure(i10, i11);
        }
        this.f8157d.setWidth(getMeasuredWidth());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            int i10 = bundle.getInt("selected_index");
            this.f8164k = i10;
            AbstractC9971b abstractC9971b = this.f8156c;
            if (abstractC9971b != null) {
                setText(abstractC9971b.mo18653a(i10).toString());
                this.f8156c.m18657e(this.f8164k);
            }
            if (bundle.getBoolean("is_popup_showing") && this.f8157d != null) {
                post(new RunnableC7006c());
            }
            parcelable = bundle.getParcelable("state");
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("state", super.onSaveInstanceState());
        bundle.putInt("selected_index", this.f8164k);
        PopupWindow popupWindow = this.f8157d;
        if (popupWindow == null) {
            bundle.putBoolean("is_popup_showing", false);
            return bundle;
        }
        bundle.putBoolean("is_popup_showing", popupWindow.isShowing());
        m7145n();
        return bundle;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && isEnabled() && isClickable()) {
            if (this.f8157d.isShowing()) {
                m7145n();
            } else {
                m7146o();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public int m7147p(Object obj, List list) {
        if (obj != null && list != null && list.size() > 0) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (obj.equals(list.get(i10))) {
                    return i10;
                }
            }
        }
        return 0;
    }

    /* renamed from: q */
    public final boolean m7148q() {
        AbstractC9971b abstractC9971b = this.f8156c;
        return abstractC9971b != null && abstractC9971b.getCount() > 0;
    }

    /* renamed from: s */
    public MaterialSpinner m7149s(List list) {
        AbstractC9971b abstractC9971bM18659g = new C9970a(getContext(), list).m18658f(this.f8168o).m18659g(getTextSize());
        this.f8156c = abstractC9971bM18659g;
        setAdapterInternal(abstractC9971bM18659g);
        return this;
    }

    public void setArrowColor(@ColorInt int i10) {
        this.f8166m = i10;
        this.f8167n = AbstractC6875e.m6460p(i10, 0.8f);
        Drawable drawable = this.f8159f;
        if (drawable != null) {
            drawable.setColorFilter(this.f8166m, PorterDuff.Mode.SRC_IN);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) throws NoSuchMethodException, SecurityException {
        this.f8165l = i10;
        Drawable background = getBackground();
        if (background instanceof StateListDrawable) {
            try {
                Method declaredMethod = StateListDrawable.class.getDeclaredMethod("getStateDrawable", Integer.TYPE);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                int[] iArr = {AbstractC6875e.m6445a(i10, 0.85f), i10};
                for (int i11 = 0; i11 < 2; i11++) {
                    ((ColorDrawable) declaredMethod.invoke(background, Integer.valueOf(i11))).setColor(iArr[i11]);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                AbstractC9363c.m17250d(e10);
            }
        } else if (background != null) {
            background.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
        }
        this.f8157d.getBackground().setColorFilter(i10, PorterDuff.Mode.SRC_IN);
    }

    public void setDropdownHeight(int i10) {
        this.f8163j = i10;
        this.f8157d.setHeight(m7144m());
    }

    public void setDropdownMaxHeight(int i10) {
        this.f8162i = i10;
        this.f8157d.setHeight(m7144m());
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        Drawable drawable = this.f8159f;
        if (drawable != null) {
            drawable.setColorFilter(z10 ? this.f8166m : this.f8167n, PorterDuff.Mode.SRC_IN);
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(int i10) {
        this.f8168o = i10;
        super.setTextColor(i10);
    }

    /* renamed from: t */
    public MaterialSpinner m7150t(InterfaceC7007d interfaceC7007d) {
        this.f8155b = interfaceC7007d;
        return this;
    }

    /* renamed from: u */
    public MaterialSpinner m7151u(int i10) {
        AbstractC9971b abstractC9971b = this.f8156c;
        if (abstractC9971b == null) {
            return this;
        }
        if (i10 < 0 || i10 > abstractC9971b.getCount()) {
            throw new IllegalArgumentException("Position must be lower than adapter count!");
        }
        this.f8156c.m18657e(i10);
        this.f8164k = i10;
        setText(this.f8156c.mo18653a(i10).toString());
        return this;
    }

    /* renamed from: v */
    public MaterialSpinner m7152v(Object obj) {
        AbstractC9971b abstractC9971b = this.f8156c;
        if (abstractC9971b != null && obj != null) {
            m7151u(m7147p(obj, abstractC9971b.mo18654c()));
        }
        return this;
    }

    /* renamed from: w */
    public final void m7153w() {
        if (this.f8169p) {
            this.f8157d.showAsDropDown(this);
        } else {
            this.f8157d.showAsDropDown(this, 0, m7143l(this));
        }
    }

    public MaterialSpinner(Context context, AttributeSet attributeSet, int i10) throws NoSuchMethodException, SecurityException {
        super(context, attributeSet, i10);
        m7141r(context, attributeSet, i10);
    }
}
