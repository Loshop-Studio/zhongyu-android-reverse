package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.C0114R;
import androidx.core.widget.PopupWindowCompat;

/* loaded from: classes.dex */
class AppCompatPopupWindow extends PopupWindow {
    private static final boolean COMPAT_OVERLAP_ANCHOR = false;
    private boolean mOverlapAnchor;

    public AppCompatPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i4) {
        super(context, attributeSet, i4);
        init(context, attributeSet, i4, 0);
    }

    private void init(Context context, AttributeSet attributeSet, int i4, int i5) {
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, C0114R.styleable.PopupWindow, i4, i5);
        if (tintTypedArrayObtainStyledAttributes.hasValue(C0114R.styleable.PopupWindow_overlapAnchor)) {
            setSupportOverlapAnchor(tintTypedArrayObtainStyledAttributes.getBoolean(C0114R.styleable.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(C0114R.styleable.PopupWindow_android_popupBackground));
        tintTypedArrayObtainStyledAttributes.recycle();
    }

    private void setSupportOverlapAnchor(boolean z3) {
        if (COMPAT_OVERLAP_ANCHOR) {
            this.mOverlapAnchor = z3;
        } else {
            PopupWindowCompat.setOverlapAnchor(this, z3);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i4, int i5) {
        if (COMPAT_OVERLAP_ANCHOR && this.mOverlapAnchor) {
            i5 -= view.getHeight();
        }
        super.showAsDropDown(view, i4, i5);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i4, int i5, int i6, int i7) {
        if (COMPAT_OVERLAP_ANCHOR && this.mOverlapAnchor) {
            i5 -= view.getHeight();
        }
        super.update(view, i4, i5, i6, i7);
    }

    public AppCompatPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i4, @StyleRes int i5) {
        super(context, attributeSet, i4, i5);
        init(context, attributeSet, i4, i5);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i4, int i5, int i6) {
        if (COMPAT_OVERLAP_ANCHOR && this.mOverlapAnchor) {
            i5 -= view.getHeight();
        }
        super.showAsDropDown(view, i4, i5, i6);
    }
}
