package p000a.p005b.p014h;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import p000a.p005b.C0014b;
import p000a.p005b.p007d.p008a.C0034a;

/* renamed from: a.b.h.l */
/* loaded from: classes.dex */
public class C0091l extends PopupWindow {
    public C0091l(Context context, AttributeSet attributeSet, int i, int i2) {
        int resourceId;
        super(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0014b.f43r, i, i2);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            setOverlapAnchor(typedArrayObtainStyledAttributes.getBoolean(2, false));
        }
        setBackgroundDrawable((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : C0034a.m129a(context, resourceId));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        super.showAsDropDown(view, i, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        super.update(view, i, i2, i3, i4);
    }
}
