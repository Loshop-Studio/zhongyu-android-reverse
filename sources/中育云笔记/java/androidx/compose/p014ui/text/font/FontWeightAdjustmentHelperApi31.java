package androidx.compose.p014ui.text.font;

import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
@RequiresApi(31)
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
