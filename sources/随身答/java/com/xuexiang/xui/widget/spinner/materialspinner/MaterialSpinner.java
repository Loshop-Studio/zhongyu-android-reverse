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
import com.xuexiang.xui.utils.AbstractC6799e;
import com.xuexiang.xui.utils.AbstractC6802h;
import java.lang.reflect.Method;
import java.util.List;
import p104f3.AbstractC7919c;
import p198o4.AbstractC9164a;

/* loaded from: classes4.dex */
public class MaterialSpinner extends AppCompatTextView {

    /* renamed from: b */
    public PopupWindow f7991b;

    /* renamed from: c */
    public ListView f7992c;

    /* renamed from: d */
    public Drawable f7993d;

    /* renamed from: e */
    public boolean f7994e;

    /* renamed from: f */
    public boolean f7995f;

    /* renamed from: g */
    public int f7996g;

    /* renamed from: h */
    public int f7997h;

    /* renamed from: i */
    public int f7998i;

    /* renamed from: j */
    public int f7999j;

    /* renamed from: k */
    public int f8000k;

    /* renamed from: l */
    public int f8001l;

    /* renamed from: m */
    public int f8002m;

    /* renamed from: n */
    public boolean f8003n;

    /* renamed from: o */
    public int f8004o;

    /* renamed from: com.xuexiang.xui.widget.spinner.materialspinner.MaterialSpinner$a */
    public class RunnableC6918a implements Runnable {
        public RunnableC6918a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MaterialSpinner.this.m7044f();
        }
    }

    private void setAdapterInternal(@NonNull AbstractC9164a abstractC9164a) {
        this.f7992c.setAdapter((ListAdapter) abstractC9164a);
        throw null;
    }

    /* renamed from: b */
    public final void m7040b(boolean z9) {
        ObjectAnimator.ofInt(this.f7993d, "level", z9 ? 0 : 10000, z9 ? 10000 : 0).start();
    }

    /* renamed from: c */
    public final int m7041c(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int height = view.getHeight();
        int iM6496h = AbstractC6802h.m6496h(getContext());
        int iM6495g = AbstractC6802h.m6495g(this.f7992c);
        int i9 = this.f7996g;
        if (i9 > 0 && iM6495g > i9) {
            iM6495g = i9;
        }
        if (iM6496h - iArr[1] < iM6495g + height) {
            return -(iM6495g + this.f8004o + height);
        }
        return 0;
    }

    /* renamed from: d */
    public final int m7042d() {
        return -2;
    }

    /* renamed from: e */
    public void m7043e() {
        if (!this.f7994e) {
            m7040b(false);
        }
        this.f7991b.dismiss();
    }

    /* renamed from: f */
    public void m7044f() {
        if (m7045g()) {
            if (!this.f7994e) {
                m7040b(true);
            }
            this.f7995f = true;
            m7046h();
        }
    }

    /* renamed from: g */
    public final boolean m7045g() {
        return false;
    }

    public AbstractC9164a getAdapter() {
        return null;
    }

    public <T> List<T> getItems() {
        return null;
    }

    public ListView getListView() {
        return this.f7992c;
    }

    public PopupWindow getPopupWindow() {
        return this.f7991b;
    }

    public int getSelectedIndex() {
        return this.f7998i;
    }

    public <T> T getSelectedItem() {
        return null;
    }

    /* renamed from: h */
    public final void m7046h() {
        if (this.f8003n) {
            this.f7991b.showAsDropDown(this);
        } else {
            this.f7991b.showAsDropDown(this, 0, m7041c(this));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i9, int i10) {
        this.f7991b.setHeight(m7042d());
        super.onMeasure(i9, i10);
        this.f7991b.setWidth(getMeasuredWidth());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f7998i = bundle.getInt("selected_index");
            if (bundle.getBoolean("is_popup_showing") && this.f7991b != null) {
                post(new RunnableC6918a());
            }
            parcelable = bundle.getParcelable("state");
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("state", super.onSaveInstanceState());
        bundle.putInt("selected_index", this.f7998i);
        PopupWindow popupWindow = this.f7991b;
        if (popupWindow == null) {
            bundle.putBoolean("is_popup_showing", false);
            return bundle;
        }
        bundle.putBoolean("is_popup_showing", popupWindow.isShowing());
        m7043e();
        return bundle;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && isEnabled() && isClickable()) {
            if (this.f7991b.isShowing()) {
                m7043e();
            } else {
                m7044f();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setArrowColor(@ColorInt int i9) {
        this.f8000k = i9;
        this.f8001l = AbstractC6799e.m6464i(i9, 0.8f);
        Drawable drawable = this.f7993d;
        if (drawable != null) {
            drawable.setColorFilter(this.f8000k, PorterDuff.Mode.SRC_IN);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i9) throws NoSuchMethodException, SecurityException {
        this.f7999j = i9;
        Drawable background = getBackground();
        if (background instanceof StateListDrawable) {
            try {
                Method declaredMethod = StateListDrawable.class.getDeclaredMethod("getStateDrawable", Integer.TYPE);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                int[] iArr = {AbstractC6799e.m6456a(i9, 0.85f), i9};
                for (int i10 = 0; i10 < 2; i10++) {
                    ((ColorDrawable) declaredMethod.invoke(background, Integer.valueOf(i10))).setColor(iArr[i10]);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                AbstractC7919c.m12471d(e10);
            }
        } else if (background != null) {
            background.setColorFilter(i9, PorterDuff.Mode.SRC_IN);
        }
        this.f7991b.getBackground().setColorFilter(i9, PorterDuff.Mode.SRC_IN);
    }

    public void setDropdownHeight(int i9) {
        this.f7997h = i9;
        this.f7991b.setHeight(m7042d());
    }

    public void setDropdownMaxHeight(int i9) {
        this.f7996g = i9;
        this.f7991b.setHeight(m7042d());
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        Drawable drawable = this.f7993d;
        if (drawable != null) {
            drawable.setColorFilter(z9 ? this.f8000k : this.f8001l, PorterDuff.Mode.SRC_IN);
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(int i9) {
        this.f8002m = i9;
        super.setTextColor(i9);
    }
}
