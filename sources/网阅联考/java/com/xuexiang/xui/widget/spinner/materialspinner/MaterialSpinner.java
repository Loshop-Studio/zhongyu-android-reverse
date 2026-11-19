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
import com.xuexiang.xui.utils.AbstractC3530e;
import com.xuexiang.xui.utils.AbstractC3532g;
import java.lang.reflect.Method;
import java.util.List;
import p078j1.AbstractC3800a;
import p082k0.AbstractC3857c;

/* loaded from: classes2.dex */
public class MaterialSpinner extends AppCompatTextView {

    /* renamed from: b */
    public PopupWindow f3921b;

    /* renamed from: c */
    public ListView f3922c;

    /* renamed from: d */
    public Drawable f3923d;

    /* renamed from: e */
    public boolean f3924e;

    /* renamed from: f */
    public boolean f3925f;

    /* renamed from: g */
    public int f3926g;

    /* renamed from: h */
    public int f3927h;

    /* renamed from: i */
    public int f3928i;

    /* renamed from: j */
    public int f3929j;

    /* renamed from: k */
    public int f3930k;

    /* renamed from: l */
    public int f3931l;

    /* renamed from: m */
    public int f3932m;

    /* renamed from: n */
    public boolean f3933n;

    /* renamed from: o */
    public int f3934o;

    /* renamed from: com.xuexiang.xui.widget.spinner.materialspinner.MaterialSpinner$a */
    public class RunnableC3637a implements Runnable {
        public RunnableC3637a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MaterialSpinner.this.m4577f();
        }
    }

    private void setAdapterInternal(@NonNull AbstractC3800a abstractC3800a) {
        this.f3922c.setAdapter((ListAdapter) abstractC3800a);
        throw null;
    }

    /* renamed from: b */
    public final void m4573b(boolean z3) {
        ObjectAnimator.ofInt(this.f3923d, "level", z3 ? 0 : 10000, z3 ? 10000 : 0).start();
    }

    /* renamed from: c */
    public final int m4574c(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int height = view.getHeight();
        int iM4086h = AbstractC3532g.m4086h(getContext());
        int iM4085g = AbstractC3532g.m4085g(this.f3922c);
        int i4 = this.f3926g;
        if (i4 > 0 && iM4085g > i4) {
            iM4085g = i4;
        }
        if (iM4086h - iArr[1] < iM4085g + height) {
            return -(iM4085g + this.f3934o + height);
        }
        return 0;
    }

    /* renamed from: d */
    public final int m4575d() {
        return -2;
    }

    /* renamed from: e */
    public void m4576e() {
        if (!this.f3924e) {
            m4573b(false);
        }
        this.f3921b.dismiss();
    }

    /* renamed from: f */
    public void m4577f() {
        if (m4578g()) {
            if (!this.f3924e) {
                m4573b(true);
            }
            this.f3925f = true;
            m4579h();
        }
    }

    /* renamed from: g */
    public final boolean m4578g() {
        return false;
    }

    public AbstractC3800a getAdapter() {
        return null;
    }

    public <T> List<T> getItems() {
        return null;
    }

    public ListView getListView() {
        return this.f3922c;
    }

    public PopupWindow getPopupWindow() {
        return this.f3921b;
    }

    public int getSelectedIndex() {
        return this.f3928i;
    }

    public <T> T getSelectedItem() {
        return null;
    }

    /* renamed from: h */
    public final void m4579h() {
        if (this.f3933n) {
            this.f3921b.showAsDropDown(this);
        } else {
            this.f3921b.showAsDropDown(this, 0, m4574c(this));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i4, int i5) {
        this.f3921b.setHeight(m4575d());
        super.onMeasure(i4, i5);
        this.f3921b.setWidth(getMeasuredWidth());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f3928i = bundle.getInt("selected_index");
            if (bundle.getBoolean("is_popup_showing") && this.f3921b != null) {
                post(new RunnableC3637a());
            }
            parcelable = bundle.getParcelable("state");
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("state", super.onSaveInstanceState());
        bundle.putInt("selected_index", this.f3928i);
        PopupWindow popupWindow = this.f3921b;
        if (popupWindow != null) {
            bundle.putBoolean("is_popup_showing", popupWindow.isShowing());
            m4576e();
        } else {
            bundle.putBoolean("is_popup_showing", false);
        }
        return bundle;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && isEnabled() && isClickable()) {
            if (this.f3921b.isShowing()) {
                m4576e();
            } else {
                m4577f();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setArrowColor(@ColorInt int i4) {
        this.f3930k = i4;
        this.f3931l = AbstractC3530e.m4067h(i4, 0.8f);
        Drawable drawable = this.f3923d;
        if (drawable != null) {
            drawable.setColorFilter(this.f3930k, PorterDuff.Mode.SRC_IN);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i4) throws NoSuchMethodException, SecurityException {
        this.f3929j = i4;
        Drawable background = getBackground();
        if (background instanceof StateListDrawable) {
            try {
                Method declaredMethod = StateListDrawable.class.getDeclaredMethod("getStateDrawable", Integer.TYPE);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                int[] iArr = {AbstractC3530e.m4060a(i4, 0.85f), i4};
                for (int i5 = 0; i5 < 2; i5++) {
                    ((ColorDrawable) declaredMethod.invoke(background, Integer.valueOf(i5))).setColor(iArr[i5]);
                }
            } catch (Exception e4) {
                e4.printStackTrace();
                AbstractC3857c.m5162d(e4);
            }
        } else if (background != null) {
            background.setColorFilter(i4, PorterDuff.Mode.SRC_IN);
        }
        this.f3921b.getBackground().setColorFilter(i4, PorterDuff.Mode.SRC_IN);
    }

    public void setDropdownHeight(int i4) {
        this.f3927h = i4;
        this.f3921b.setHeight(m4575d());
    }

    public void setDropdownMaxHeight(int i4) {
        this.f3926g = i4;
        this.f3921b.setHeight(m4575d());
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z3) {
        super.setEnabled(z3);
        Drawable drawable = this.f3923d;
        if (drawable != null) {
            drawable.setColorFilter(z3 ? this.f3930k : this.f3931l, PorterDuff.Mode.SRC_IN);
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(int i4) {
        this.f3932m = i4;
        super.setTextColor(i4);
    }
}
