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
import com.xuexiang.xui.utils.AbstractC6480e;
import com.xuexiang.xui.utils.AbstractC6483h;
import java.lang.reflect.Method;
import java.util.List;
import p197p2.AbstractC8819c;
import p294y3.AbstractC9905a;

/* loaded from: classes4.dex */
public class MaterialSpinner extends AppCompatTextView {

    /* renamed from: b */
    public PopupWindow f6733b;

    /* renamed from: c */
    public ListView f6734c;

    /* renamed from: d */
    public Drawable f6735d;

    /* renamed from: e */
    public boolean f6736e;

    /* renamed from: f */
    public boolean f6737f;

    /* renamed from: g */
    public int f6738g;

    /* renamed from: h */
    public int f6739h;

    /* renamed from: i */
    public int f6740i;

    /* renamed from: j */
    public int f6741j;

    /* renamed from: k */
    public int f6742k;

    /* renamed from: l */
    public int f6743l;

    /* renamed from: m */
    public int f6744m;

    /* renamed from: n */
    public boolean f6745n;

    /* renamed from: o */
    public int f6746o;

    /* renamed from: com.xuexiang.xui.widget.spinner.materialspinner.MaterialSpinner$a */
    public class RunnableC6598a implements Runnable {
        public RunnableC6598a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MaterialSpinner.this.m5946f();
        }
    }

    private void setAdapterInternal(@NonNull AbstractC9905a abstractC9905a) {
        this.f6734c.setAdapter((ListAdapter) abstractC9905a);
        throw null;
    }

    /* renamed from: b */
    public final void m5942b(boolean z9) {
        ObjectAnimator.ofInt(this.f6735d, "level", z9 ? 0 : 10000, z9 ? 10000 : 0).start();
    }

    /* renamed from: c */
    public final int m5943c(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int height = view.getHeight();
        int iM5399h = AbstractC6483h.m5399h(getContext());
        int iM5398g = AbstractC6483h.m5398g(this.f6734c);
        int i10 = this.f6738g;
        if (i10 > 0 && iM5398g > i10) {
            iM5398g = i10;
        }
        if (iM5399h - iArr[1] < iM5398g + height) {
            return -(iM5398g + this.f6746o + height);
        }
        return 0;
    }

    /* renamed from: d */
    public final int m5944d() {
        return -2;
    }

    /* renamed from: e */
    public void m5945e() {
        if (!this.f6736e) {
            m5942b(false);
        }
        this.f6733b.dismiss();
    }

    /* renamed from: f */
    public void m5946f() {
        if (m5947g()) {
            if (!this.f6736e) {
                m5942b(true);
            }
            this.f6737f = true;
            m5948h();
        }
    }

    /* renamed from: g */
    public final boolean m5947g() {
        return false;
    }

    public AbstractC9905a getAdapter() {
        return null;
    }

    public <T> List<T> getItems() {
        return null;
    }

    public ListView getListView() {
        return this.f6734c;
    }

    public PopupWindow getPopupWindow() {
        return this.f6733b;
    }

    public int getSelectedIndex() {
        return this.f6740i;
    }

    public <T> T getSelectedItem() {
        return null;
    }

    /* renamed from: h */
    public final void m5948h() {
        if (this.f6745n) {
            this.f6733b.showAsDropDown(this);
        } else {
            this.f6733b.showAsDropDown(this, 0, m5943c(this));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        this.f6733b.setHeight(m5944d());
        super.onMeasure(i10, i11);
        this.f6733b.setWidth(getMeasuredWidth());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f6740i = bundle.getInt("selected_index");
            if (bundle.getBoolean("is_popup_showing") && this.f6733b != null) {
                post(new RunnableC6598a());
            }
            parcelable = bundle.getParcelable("state");
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("state", super.onSaveInstanceState());
        bundle.putInt("selected_index", this.f6740i);
        PopupWindow popupWindow = this.f6733b;
        if (popupWindow == null) {
            bundle.putBoolean("is_popup_showing", false);
            return bundle;
        }
        bundle.putBoolean("is_popup_showing", popupWindow.isShowing());
        m5945e();
        return bundle;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && isEnabled() && isClickable()) {
            if (this.f6733b.isShowing()) {
                m5945e();
            } else {
                m5946f();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setArrowColor(@ColorInt int i10) {
        this.f6742k = i10;
        this.f6743l = AbstractC6480e.m5363i(i10, 0.8f);
        Drawable drawable = this.f6735d;
        if (drawable != null) {
            drawable.setColorFilter(this.f6742k, PorterDuff.Mode.SRC_IN);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) throws NoSuchMethodException, SecurityException {
        this.f6741j = i10;
        Drawable background = getBackground();
        if (background instanceof StateListDrawable) {
            try {
                Method declaredMethod = StateListDrawable.class.getDeclaredMethod("getStateDrawable", Integer.TYPE);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                int[] iArr = {AbstractC6480e.m5355a(i10, 0.85f), i10};
                for (int i11 = 0; i11 < 2; i11++) {
                    ((ColorDrawable) declaredMethod.invoke(background, Integer.valueOf(i11))).setColor(iArr[i11]);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                AbstractC8819c.m14780d(e10);
            }
        } else if (background != null) {
            background.setColorFilter(i10, PorterDuff.Mode.SRC_IN);
        }
        this.f6733b.getBackground().setColorFilter(i10, PorterDuff.Mode.SRC_IN);
    }

    public void setDropdownHeight(int i10) {
        this.f6739h = i10;
        this.f6733b.setHeight(m5944d());
    }

    public void setDropdownMaxHeight(int i10) {
        this.f6738g = i10;
        this.f6733b.setHeight(m5944d());
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        Drawable drawable = this.f6735d;
        if (drawable != null) {
            drawable.setColorFilter(z9 ? this.f6742k : this.f6743l, PorterDuff.Mode.SRC_IN);
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(int i10) {
        this.f6744m = i10;
        super.setTextColor(i10);
    }
}
