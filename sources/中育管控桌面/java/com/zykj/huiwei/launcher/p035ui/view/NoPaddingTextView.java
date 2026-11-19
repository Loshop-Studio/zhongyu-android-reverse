package com.zykj.huiwei.launcher.p035ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.zykj.huiwei.launcher.R$styleable;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/ui/view/NoPaddingTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class NoPaddingTextView extends AppCompatTextView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NoPaddingTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ NoPaddingTextView(Context context, AttributeSet attributeSet, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, (i7 & 4) != 0 ? 0 : i6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoPaddingTextView(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.NoPaddingTextView, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, (int) TypedValue.applyDimension(1, 12.0f, getResources().getDisplayMetrics()));
        Paint paint = new Paint();
        paint.setTextSize(dimensionPixelSize);
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        setTextSize(0, typedArrayObtainStyledAttributes.getDimension(0, 12.0f));
        setPadding(getPaddingLeft(), getPaddingTop() - (Math.abs(fontMetricsInt.top - fontMetricsInt.ascent) + ((int) Math.ceil(Math.abs((fontMetricsInt.top - fontMetricsInt.ascent) / 2.0d)))), getPaddingRight(), (fontMetricsInt.top - fontMetricsInt.ascent) + getPaddingBottom());
        typedArrayObtainStyledAttributes.recycle();
    }
}
