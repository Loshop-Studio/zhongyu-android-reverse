package androidx.compose.p011ui.text.android;

import android.text.StaticLayout;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

@RequiresApi(28)
@Metadata(m5109d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m5110d2 = {"Landroidx/compose/ui/text/android/StaticLayoutFactory28;", "", "<init>", "()V", "Landroid/text/StaticLayout$Builder;", "builder", "", "useFallbackLineSpacing", "Ld6/s;", "setUseLineSpacingFromFallbacks", "(Landroid/text/StaticLayout$Builder;Z)V", "ui-text_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
final class StaticLayoutFactory28 {

    @NotNull
    public static final StaticLayoutFactory28 INSTANCE = new StaticLayoutFactory28();

    private StaticLayoutFactory28() {
    }

    @JvmStatic
    public static final void setUseLineSpacingFromFallbacks(@NotNull StaticLayout.Builder builder, boolean useFallbackLineSpacing) {
        builder.setUseLineSpacingFromFallbacks(useFallbackLineSpacing);
    }
}
