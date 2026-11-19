package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.C0115R;
import androidx.core.widget.PopupWindowCompat;

/* loaded from: classes.dex */
class AppCompatPopupWindow extends PopupWindow {
    private static final boolean COMPAT_OVERLAP_ANCHOR = false;
    private boolean mOverlapAnchor;

    public AppCompatPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i6) {
        super(context, attributeSet, i6);
        init(context, attributeSet, i6, 0);
    }

    private void init(Context context, AttributeSet attributeSet, int i6, int i7) {
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, C0115R.styleable.PopupWindow, i6, i7);
        int i8 = C0115R.styleable.PopupWindow_overlapAnchor;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i8)) {
            setSupportOverlapAnchor(tintTypedArrayObtainStyledAttributes.getBoolean(i8, false));
        }
        setBackgroundDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(C0115R.styleable.PopupWindow_android_popupBackground));
        tintTypedArrayObtainStyledAttributes.recycle();
    }

    private void setSupportOverlapAnchor(boolean z6) {
        if (COMPAT_OVERLAP_ANCHOR) {
            this.mOverlapAnchor = z6;
        } else {
            PopupWindowCompat.setOverlapAnchor(this, z6);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i6, int i7) {
        if (COMPAT_OVERLAP_ANCHOR && this.mOverlapAnchor) {
            i7 -= view.getHeight();
        }
        super.showAsDropDown(view, i6, i7);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i6, int i7, int i8, int i9) {
        if (COMPAT_OVERLAP_ANCHOR && this.mOverlapAnchor) {
            i7 -= view.getHeight();
        }
        super.update(view, i6, i7, i8, i9);
    }

    public AppCompatPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i6, @StyleRes int i7) {
        super(context, attributeSet, i6, i7);
        init(context, attributeSet, i6, i7);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i6, int i7, int i8) {
        if (COMPAT_OVERLAP_ANCHOR && this.mOverlapAnchor) {
            i7 -= view.getHeight();
        }
        super.showAsDropDown(view, i6, i7, i8);
    }
}
