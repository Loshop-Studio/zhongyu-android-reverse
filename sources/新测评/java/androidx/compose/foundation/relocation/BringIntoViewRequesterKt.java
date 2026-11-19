package androidx.compose.foundation.relocation;

import androidx.compose.p013ui.Modifier;
import kotlin.Deprecated;
import kotlin.Metadata;

@Metadata(m13557d1 = {"androidx/compose/foundation/relocation/BringIntoViewRequesterKt__BringIntoViewRequesterKt", "androidx/compose/foundation/relocation/BringIntoViewRequesterKt__BringIntoViewResponderKt"}, m13559k = 4, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes.dex */
public final class BringIntoViewRequesterKt {
    public static final BringIntoViewRequester BringIntoViewRequester() {
        return BringIntoViewRequesterKt__BringIntoViewRequesterKt.BringIntoViewRequester();
    }

    public static final Modifier bringIntoViewRequester(Modifier modifier, BringIntoViewRequester bringIntoViewRequester) {
        return BringIntoViewRequesterKt__BringIntoViewRequesterKt.bringIntoViewRequester(modifier, bringIntoViewRequester);
    }

    @Deprecated(message = "Use BringIntoViewModifierNode instead")
    public static final Modifier bringIntoViewResponder(Modifier modifier, BringIntoViewResponder bringIntoViewResponder) {
        return BringIntoViewRequesterKt__BringIntoViewResponderKt.bringIntoViewResponder(modifier, bringIntoViewResponder);
    }
}
