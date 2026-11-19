package androidx.compose.foundation.content;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p013ui.Modifier;

/* loaded from: classes.dex */
public final class ReceiveContentKt {
    @ExperimentalFoundationApi
    public static final Modifier contentReceiver(Modifier modifier, ReceiveContentListener receiveContentListener) {
        return modifier.then(new ReceiveContentElement(receiveContentListener));
    }
}
