package androidx.compose.foundation.text;

import androidx.compose.p013ui.text.Placeholder;
import androidx.compose.runtime.Immutable;
import p300x7.InterfaceC10575q;

@Immutable
/* loaded from: classes.dex */
public final class InlineTextContent {
    public static final int $stable = 0;
    private final InterfaceC10575q children;
    private final Placeholder placeholder;

    public InlineTextContent(Placeholder placeholder, InterfaceC10575q interfaceC10575q) {
        this.placeholder = placeholder;
        this.children = interfaceC10575q;
    }

    public final InterfaceC10575q getChildren() {
        return this.children;
    }

    public final Placeholder getPlaceholder() {
        return this.placeholder;
    }
}
