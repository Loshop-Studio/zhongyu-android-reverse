package androidx.compose.p013ui.platform;

import androidx.compose.p013ui.Modifier;
import androidx.compose.runtime.Stable;

/* loaded from: classes2.dex */
public final class TestTagKt {
    @Stable
    public static final Modifier testTag(Modifier modifier, String str) {
        return modifier.then(new TestTagElement(str));
    }
}
