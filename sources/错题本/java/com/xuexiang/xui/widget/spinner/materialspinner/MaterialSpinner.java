package com.xuexiang.xui.widget.spinner.materialspinner;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$styleable;
import java.lang.reflect.Method;
import java.util.List;
import p130o3.AbstractC6270b;
import p164t1.AbstractC6582a;

/* loaded from: classes3.dex */
public class MaterialSpinner extends AppCompatTextView {

    /* renamed from: b */
    public int f4890b;

    public MaterialSpinner(Context context) {
        this(context, null);
    }

    private void setAdapterInternal(@NonNull AbstractC6270b abstractC6270b) {
        throw null;
    }

    public AbstractC6270b getAdapter() {
        return null;
    }

    public <T> List<T> getItems() {
        return null;
    }

    public ListView getListView() {
        return null;
    }

    public PopupWindow getPopupWindow() {
        return null;
    }

    public int getSelectedIndex() {
        return this.f4890b;
    }

    public <T> T getSelectedItem() {
        return null;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i8) {
        m3581b();
        throw null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f4890b = bundle.getInt("selected_index");
            bundle.getBoolean("is_popup_showing");
            parcelable = bundle.getParcelable("state");
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("state", super.onSaveInstanceState());
        bundle.putInt("selected_index", this.f4890b);
        bundle.putBoolean("is_popup_showing", false);
        return bundle;
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && isEnabled() && isClickable()) {
            throw null;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setArrowColor(@ColorInt int i) {
        Color.argb(Color.alpha(i), (int) ((((Color.red(i) * 0.19999999f) / 255.0f) + 0.8f) * 255.0f), (int) ((((Color.green(i) * 0.19999999f) / 255.0f) + 0.8f) * 255.0f), (int) ((((Color.blue(i) * 0.19999999f) / 255.0f) + 0.8f) * 255.0f));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) throws NoSuchMethodException, SecurityException {
        Drawable background = getBackground();
        if (background instanceof StateListDrawable) {
            try {
                Method declaredMethod = StateListDrawable.class.getDeclaredMethod("getStateDrawable", Integer.TYPE);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                int[] iArr = {Color.argb(Color.alpha(i), Math.max((int) (Color.red(i) * 0.85f), 0), Math.max((int) (Color.green(i) * 0.85f), 0), Math.max((int) (Color.blue(i) * 0.85f), 0)), i};
                for (int i8 = 0; i8 < 2; i8++) {
                    ((ColorDrawable) declaredMethod.invoke(background, Integer.valueOf(i8))).setColor(iArr[i8]);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (background != null) {
            background.setColorFilter(i, PorterDuff.Mode.SRC_IN);
        }
        throw null;
    }

    public void setDropdownHeight(int i) {
        m3581b();
        throw null;
    }

    public void setDropdownMaxHeight(int i) {
        m3581b();
        throw null;
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z8) {
        super.setEnabled(z8);
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
    }

    public MaterialSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.MaterialSpinnerStyle);
    }

    public MaterialSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.obtainStyledAttributes(attributeSet, R$styleable.MaterialSpinner, i, 0);
        getTextColors().getDefaultColor();
        AbstractC6582a.m6217a();
        throw null;
    }

    /* renamed from: b */
    public final void m3581b() {
    }
}
