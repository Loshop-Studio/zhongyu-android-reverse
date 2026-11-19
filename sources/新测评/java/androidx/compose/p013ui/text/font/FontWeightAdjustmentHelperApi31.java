package androidx.compose.p013ui.text.font;

import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred(parameters = 1)
@RequiresApi(31)
@Metadata(m13557d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m13558d2 = {"Landroidx/compose/ui/text/font/FontWeightAdjustmentHelperApi31;", "", "()V", "fontWeightAdjustment", "", "context", "Landroid/content/Context;", "ui-text_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class FontWeightAdjustmentHelperApi31 {
    public static final int $stable = 0;
    public static final FontWeightAdjustmentHelperApi31 INSTANCE = new FontWeightAdjustmentHelperApi31();

    private FontWeightAdjustmentHelperApi31() {
    }

    @DoNotInline
    @RequiresApi(31)
    public final int fontWeightAdjustment(Context context) {
        return context.getResources().getConfiguration().fontWeightAdjustment;
    }
}
