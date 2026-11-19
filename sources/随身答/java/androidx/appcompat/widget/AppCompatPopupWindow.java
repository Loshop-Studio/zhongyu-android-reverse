package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.C0145R;
import androidx.core.widget.PopupWindowCompat;

/* loaded from: classes.dex */
class AppCompatPopupWindow extends PopupWindow {
    private static final boolean COMPAT_OVERLAP_ANCHOR = false;
    private boolean mOverlapAnchor;

    public AppCompatPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i9) {
        super(context, attributeSet, i9);
        init(context, attributeSet, i9, 0);
    }

    private void init(Context context, AttributeSet attributeSet, int i9, int i10) {
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, C0145R.styleable.PopupWindow, i9, i10);
        if (tintTypedArrayObtainStyledAttributes.hasValue(C0145R.styleable.PopupWindow_overlapAnchor)) {
            setSupportOverlapAnchor(tintTypedArrayObtainStyledAttributes.getBoolean(C0145R.styleable.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(C0145R.styleable.PopupWindow_android_popupBackground));
        tintTypedArrayObtainStyledAttributes.recycle();
    }

    private void setSupportOverlapAnchor(boolean z9) {
        if (COMPAT_OVERLAP_ANCHOR) {
            this.mOverlapAnchor = z9;
        } else {
            PopupWindowCompat.setOverlapAnchor(this, z9);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i9, int i10) {
        if (COMPAT_OVERLAP_ANCHOR && this.mOverlapAnchor) {
            i10 -= view.getHeight();
        }
        super.showAsDropDown(view, i9, i10);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i9, int i10, int i11, int i12) {
        if (COMPAT_OVERLAP_ANCHOR && this.mOverlapAnchor) {
            i10 -= view.getHeight();
        }
        super.update(view, i9, i10, i11, i12);
    }

    public AppCompatPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i9, @StyleRes int i10) {
        super(context, attributeSet, i9, i10);
        init(context, attributeSet, i9, i10);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i9, int i10, int i11) {
        if (COMPAT_OVERLAP_ANCHOR && this.mOverlapAnchor) {
            i10 -= view.getHeight();
        }
        super.showAsDropDown(view, i9, i10, i11);
    }
}
