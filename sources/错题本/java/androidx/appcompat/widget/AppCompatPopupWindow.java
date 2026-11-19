package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.C0103R;
import androidx.core.widget.PopupWindowCompat;

/* loaded from: classes.dex */
class AppCompatPopupWindow extends PopupWindow {
    private static final boolean COMPAT_OVERLAP_ANCHOR = false;
    private boolean mOverlapAnchor;

    public AppCompatPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
        init(context, attributeSet, i, 0);
    }

    private void init(Context context, AttributeSet attributeSet, int i, int i8) {
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, C0103R.styleable.PopupWindow, i, i8);
        if (tintTypedArrayObtainStyledAttributes.hasValue(C0103R.styleable.PopupWindow_overlapAnchor)) {
            setSupportOverlapAnchor(tintTypedArrayObtainStyledAttributes.getBoolean(C0103R.styleable.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(C0103R.styleable.PopupWindow_android_popupBackground));
        tintTypedArrayObtainStyledAttributes.recycle();
    }

    private void setSupportOverlapAnchor(boolean z8) {
        if (COMPAT_OVERLAP_ANCHOR) {
            this.mOverlapAnchor = z8;
        } else {
            PopupWindowCompat.setOverlapAnchor(this, z8);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i8) {
        if (COMPAT_OVERLAP_ANCHOR && this.mOverlapAnchor) {
            i8 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i8);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i8, int i9, int i10) {
        if (COMPAT_OVERLAP_ANCHOR && this.mOverlapAnchor) {
            i8 -= view.getHeight();
        }
        super.update(view, i, i8, i9, i10);
    }

    public AppCompatPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i8) {
        super(context, attributeSet, i, i8);
        init(context, attributeSet, i, i8);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i8, int i9) {
        if (COMPAT_OVERLAP_ANCHOR && this.mOverlapAnchor) {
            i8 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i8, i9);
    }
}
