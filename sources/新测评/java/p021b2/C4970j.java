package p021b2;

import android.R;
import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.widget.ImageView;

/* renamed from: b2.j */
/* loaded from: classes4.dex */
public class C4970j extends ImageView {
    public C4970j(Context context) {
        super(context);
        setBackgroundResource(m2440a(context));
    }

    /* renamed from: a */
    public static int m2440a(Context context) {
        int identifier = context.getResources().getIdentifier("selectableItemBackgroundBorderless", "attr", context.getPackageName());
        if (identifier == 0) {
            identifier = R.attr.selectableItemBackgroundBorderless;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(identifier, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: b */
    public void m2441b(int i10) {
        setColorFilter(i10, PorterDuff.Mode.SRC_ATOP);
    }

    @Override // android.view.View
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        setAlpha(z9 ? 1.0f : 0.1f);
    }
}
