package p094f1;

import android.R;
import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.widget.ImageView;

/* renamed from: f1.j */
/* loaded from: classes4.dex */
public class C8415j extends ImageView {
    public C8415j(Context context) {
        super(context);
        setBackgroundResource(m13743a(context));
    }

    /* renamed from: a */
    public static int m13743a(Context context) {
        int identifier = context.getResources().getIdentifier("selectableItemBackgroundBorderless", "attr", context.getPackageName());
        if (identifier == 0) {
            identifier = R.attr.selectableItemBackgroundBorderless;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(identifier, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: b */
    public void m13744b(int i10) {
        setColorFilter(i10, PorterDuff.Mode.SRC_ATOP);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        setAlpha(z10 ? 1.0f : 0.1f);
    }
}
