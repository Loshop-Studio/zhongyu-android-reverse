package androidx.compose.foundation.relocation;

import androidx.compose.p014ui.Modifier;

/* loaded from: classes.dex */
final /* synthetic */ class BringIntoViewRequesterKt__BringIntoViewRequesterKt {
    public static final BringIntoViewRequester BringIntoViewRequester() {
        return new BringIntoViewRequesterImpl();
    }

    public static final Modifier bringIntoViewRequester(Modifier modifier, BringIntoViewRequester bringIntoViewRequester) {
        return modifier.then(new BringIntoViewRequesterElement(bringIntoViewRequester));
    }
}
