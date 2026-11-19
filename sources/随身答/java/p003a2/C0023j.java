package p003a2;

import android.R;
import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.widget.ImageView;

/* renamed from: a2.j */
/* loaded from: classes4.dex */
public class C0023j extends ImageView {
    public C0023j(Context context) {
        super(context);
        setBackgroundResource(m151a(context));
    }

    /* renamed from: a */
    public static int m151a(Context context) {
        int identifier = context.getResources().getIdentifier("selectableItemBackgroundBorderless", "attr", context.getPackageName());
        if (identifier == 0) {
            identifier = R.attr.selectableItemBackgroundBorderless;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(identifier, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: b */
    public void m152b(int i9) {
        setColorFilter(i9, PorterDuff.Mode.SRC_ATOP);
    }

    @Override // android.view.View
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        setAlpha(z9 ? 1.0f : 0.1f);
    }
}
