package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutionException;
import p000a.p005b.C0014b;
import p000a.p005b.p014h.C0113w;

/* loaded from: classes.dex */
public class DialogTitle extends C0113w {
    public DialogTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // p000a.p005b.p014h.C0113w, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) throws ExecutionException, IllegalAccessException, InterruptedException, IllegalArgumentException, InvocationTargetException {
        int lineCount;
        super.onMeasure(i, i2);
        Layout layout = getLayout();
        if (layout == null || (lineCount = layout.getLineCount()) <= 0 || layout.getEllipsisCount(lineCount - 1) <= 0) {
            return;
        }
        setSingleLine(false);
        setMaxLines(2);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, C0014b.f47v, R.attr.textAppearanceMedium, R.style.TextAppearance.Medium);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        if (dimensionPixelSize != 0) {
            setTextSize(0, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
        super.onMeasure(i, i2);
    }
}
