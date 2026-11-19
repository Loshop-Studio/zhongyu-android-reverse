package androidx.compose.p006ui.text.android;

import android.os.Build;
import android.text.StaticLayout;
import androidx.annotation.DoNotInline;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BuildCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@RequiresApi(23)
@Metadata(m5174d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0017J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\bH\u0017¨\u0006\u000b"}, m5175d2 = {"Landroidx/compose/ui/text/android/StaticLayoutFactory23;", "Landroidx/compose/ui/text/android/StaticLayoutFactoryImpl;", "()V", "create", "Landroid/text/StaticLayout;", "params", "Landroidx/compose/ui/text/android/StaticLayoutParams;", "isFallbackLineSpacingEnabled", "", "layout", "useFallbackLineSpacing", "ui-text_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class StaticLayoutFactory23 implements StaticLayoutFactoryImpl {
    @Override // androidx.compose.p006ui.text.android.StaticLayoutFactoryImpl
    @DoNotInline
    public StaticLayout create(StaticLayoutParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(params.getText(), params.getStart(), params.getEnd(), params.getPaint(), params.getWidth());
        builderObtain.setTextDirection(params.getTextDir());
        builderObtain.setAlignment(params.getAlignment());
        builderObtain.setMaxLines(params.getMaxLines());
        builderObtain.setEllipsize(params.getEllipsize());
        builderObtain.setEllipsizedWidth(params.getEllipsizedWidth());
        builderObtain.setLineSpacing(params.getLineSpacingExtra(), params.getLineSpacingMultiplier());
        builderObtain.setIncludePad(params.getIncludePadding());
        builderObtain.setBreakStrategy(params.getBreakStrategy());
        builderObtain.setHyphenationFrequency(params.getHyphenationFrequency());
        builderObtain.setIndents(params.getLeftIndents(), params.getRightIndents());
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            Intrinsics.checkNotNullExpressionValue(builderObtain, "this");
            StaticLayoutFactory26.setJustificationMode(builderObtain, params.getJustificationMode());
        }
        if (i4 >= 28) {
            Intrinsics.checkNotNullExpressionValue(builderObtain, "this");
            StaticLayoutFactory28.setUseLineSpacingFromFallbacks(builderObtain, params.getUseFallbackLineSpacing());
        }
        if (i4 >= 33) {
            Intrinsics.checkNotNullExpressionValue(builderObtain, "this");
            StaticLayoutFactory33.setLineBreakConfig(builderObtain, params.getLineBreakStyle(), params.getLineBreakWordStyle());
        }
        StaticLayout staticLayoutBuild = builderObtain.build();
        Intrinsics.checkNotNullExpressionValue(staticLayoutBuild, "obtain(params.text, para…  }\n            }.build()");
        return staticLayoutBuild;
    }

    @Override // androidx.compose.p006ui.text.android.StaticLayoutFactoryImpl
    @OptIn(markerClass = {BuildCompat.PrereleaseSdkCheck.class})
    public boolean isFallbackLineSpacingEnabled(StaticLayout layout, boolean useFallbackLineSpacing) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        if (BuildCompat.isAtLeastT()) {
            return StaticLayoutFactory33.isFallbackLineSpacingEnabled(layout);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return useFallbackLineSpacing;
        }
        return false;
    }
}
