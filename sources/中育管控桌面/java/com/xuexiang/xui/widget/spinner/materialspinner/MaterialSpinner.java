package com.xuexiang.xui.widget.spinner.materialspinner;

import android.animation.ObjectAnimator;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import com.xuexiang.xui.utils.AbstractC5857e;
import com.xuexiang.xui.utils.AbstractC5860h;
import java.lang.reflect.Method;
import java.util.List;
import p133q1.AbstractC7620c;
import p155t2.AbstractC7723a;

/* loaded from: classes3.dex */
public class MaterialSpinner extends AppCompatTextView {

    /* renamed from: b */
    public PopupWindow f5442b;

    /* renamed from: c */
    public ListView f5443c;

    /* renamed from: d */
    public Drawable f5444d;

    /* renamed from: e */
    public boolean f5445e;

    /* renamed from: f */
    public boolean f5446f;

    /* renamed from: g */
    public int f5447g;

    /* renamed from: h */
    public int f5448h;

    /* renamed from: i */
    public int f5449i;

    /* renamed from: j */
    public int f5450j;

    /* renamed from: k */
    public int f5451k;

    /* renamed from: l */
    public int f5452l;

    /* renamed from: m */
    public int f5453m;

    /* renamed from: n */
    public boolean f5454n;

    /* renamed from: o */
    public int f5455o;

    /* renamed from: com.xuexiang.xui.widget.spinner.materialspinner.MaterialSpinner$a */
    public class RunnableC5976a implements Runnable {
        public RunnableC5976a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MaterialSpinner.this.m4955f();
        }
    }

    private void setAdapterInternal(@NonNull AbstractC7723a abstractC7723a) {
        this.f5443c.setAdapter((ListAdapter) abstractC7723a);
        throw null;
    }

    /* renamed from: b */
    public final void m4951b(boolean z6) {
        ObjectAnimator.ofInt(this.f5444d, "level", z6 ? 0 : 10000, z6 ? 10000 : 0).start();
    }

    /* renamed from: c */
    public final int m4952c(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int height = view.getHeight();
        int iM4405i = AbstractC5860h.m4405i(getContext());
        int iM4404h = AbstractC5860h.m4404h(this.f5443c);
        int i6 = this.f5447g;
        if (i6 > 0 && iM4404h > i6) {
            iM4404h = i6;
        }
        if (iM4405i - iArr[1] < iM4404h + height) {
            return -(iM4404h + this.f5455o + height);
        }
        return 0;
    }

    /* renamed from: d */
    public final int m4953d() {
        return -2;
    }

    /* renamed from: e */
    public void m4954e() {
        if (!this.f5445e) {
            m4951b(false);
        }
        this.f5442b.dismiss();
    }

    /* renamed from: f */
    public void m4955f() {
        if (m4956g()) {
            if (!this.f5445e) {
                m4951b(true);
            }
            this.f5446f = true;
            m4957h();
        }
    }

    /* renamed from: g */
    public final boolean m4956g() {
        return false;
    }

    public AbstractC7723a getAdapter() {
        return null;
    }

    public <T> List<T> getItems() {
        return null;
    }

    public ListView getListView() {
        return this.f5443c;
    }

    public PopupWindow getPopupWindow() {
        return this.f5442b;
    }

    public int getSelectedIndex() {
        return this.f5449i;
    }

    public <T> T getSelectedItem() {
        return null;
    }

    /* renamed from: h */
    public final void m4957h() {
        if (this.f5454n) {
            this.f5442b.showAsDropDown(this);
        } else {
            this.f5442b.showAsDropDown(this, 0, m4952c(this));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i6, int i7) {
        this.f5442b.setHeight(m4953d());
        super.onMeasure(i6, i7);
        this.f5442b.setWidth(getMeasuredWidth());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f5449i = bundle.getInt("selected_index");
            if (bundle.getBoolean("is_popup_showing") && this.f5442b != null) {
                post(new RunnableC5976a());
            }
            parcelable = bundle.getParcelable("state");
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("state", super.onSaveInstanceState());
        bundle.putInt("selected_index", this.f5449i);
        PopupWindow popupWindow = this.f5442b;
        if (popupWindow == null) {
            bundle.putBoolean("is_popup_showing", false);
            return bundle;
        }
        bundle.putBoolean("is_popup_showing", popupWindow.isShowing());
        m4954e();
        return bundle;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && isEnabled() && isClickable()) {
            if (this.f5442b.isShowing()) {
                m4954e();
            } else {
                m4955f();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setArrowColor(@ColorInt int i6) {
        this.f5451k = i6;
        this.f5452l = AbstractC5857e.m4368i(i6, 0.8f);
        Drawable drawable = this.f5444d;
        if (drawable != null) {
            drawable.setColorFilter(this.f5451k, PorterDuff.Mode.SRC_IN);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i6) throws NoSuchMethodException, SecurityException {
        this.f5450j = i6;
        Drawable background = getBackground();
        if (background instanceof StateListDrawable) {
            try {
                Method declaredMethod = StateListDrawable.class.getDeclaredMethod("getStateDrawable", Integer.TYPE);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                int[] iArr = {AbstractC5857e.m4360a(i6, 0.85f), i6};
                for (int i7 = 0; i7 < 2; i7++) {
                    ((ColorDrawable) declaredMethod.invoke(background, Integer.valueOf(i7))).setColor(iArr[i7]);
                }
            } catch (Exception e6) {
                e6.printStackTrace();
                AbstractC7620c.m9062d(e6);
            }
        } else if (background != null) {
            background.setColorFilter(i6, PorterDuff.Mode.SRC_IN);
        }
        this.f5442b.getBackground().setColorFilter(i6, PorterDuff.Mode.SRC_IN);
    }

    public void setDropdownHeight(int i6) {
        this.f5448h = i6;
        this.f5442b.setHeight(m4953d());
    }

    public void setDropdownMaxHeight(int i6) {
        this.f5447g = i6;
        this.f5442b.setHeight(m4953d());
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z6) {
        super.setEnabled(z6);
        Drawable drawable = this.f5444d;
        if (drawable != null) {
            drawable.setColorFilter(z6 ? this.f5451k : this.f5452l, PorterDuff.Mode.SRC_IN);
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(int i6) {
        this.f5453m = i6;
        super.setTextColor(i6);
    }
}
