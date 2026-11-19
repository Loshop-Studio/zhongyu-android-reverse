package androidx.compose.p014ui.text.android;

import android.os.Build;
import android.text.StaticLayout;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
/* loaded from: classes2.dex */
final class StaticLayoutFactory23 implements StaticLayoutFactoryImpl {
    @Override // androidx.compose.p014ui.text.android.StaticLayoutFactoryImpl
    public StaticLayout create(StaticLayoutParams staticLayoutParams) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(staticLayoutParams.getText(), staticLayoutParams.getStart(), staticLayoutParams.getEnd(), staticLayoutParams.getPaint(), staticLayoutParams.getWidth());
        builderObtain.setTextDirection(staticLayoutParams.getTextDir());
        builderObtain.setAlignment(staticLayoutParams.getAlignment());
        builderObtain.setMaxLines(staticLayoutParams.getMaxLines());
        builderObtain.setEllipsize(staticLayoutParams.getEllipsize());
        builderObtain.setEllipsizedWidth(staticLayoutParams.getEllipsizedWidth());
        builderObtain.setLineSpacing(staticLayoutParams.getLineSpacingExtra(), staticLayoutParams.getLineSpacingMultiplier());
        builderObtain.setIncludePad(staticLayoutParams.getIncludePadding());
        builderObtain.setBreakStrategy(staticLayoutParams.getBreakStrategy());
        builderObtain.setHyphenationFrequency(staticLayoutParams.getHyphenationFrequency());
        builderObtain.setIndents(staticLayoutParams.getLeftIndents(), staticLayoutParams.getRightIndents());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            StaticLayoutFactory26.setJustificationMode(builderObtain, staticLayoutParams.getJustificationMode());
        }
        if (i10 >= 28) {
            StaticLayoutFactory28.setUseLineSpacingFromFallbacks(builderObtain, staticLayoutParams.getUseFallbackLineSpacing());
        }
        if (i10 >= 33) {
            StaticLayoutFactory33.setLineBreakConfig(builderObtain, staticLayoutParams.getLineBreakStyle(), staticLayoutParams.getLineBreakWordStyle());
        }
        if (i10 >= 35) {
            StaticLayoutFactory35.disableUseBoundsForWidth(builderObtain);
        }
        return builderObtain.build();
    }

    @Override // androidx.compose.p014ui.text.android.StaticLayoutFactoryImpl
    public boolean isFallbackLineSpacingEnabled(StaticLayout staticLayout, boolean z10) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            return StaticLayoutFactory33.isFallbackLineSpacingEnabled(staticLayout);
        }
        if (i10 >= 28) {
            return z10;
        }
        return false;
    }
}
