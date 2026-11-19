package androidx.compose.foundation.text;

import androidx.compose.p014ui.text.Placeholder;
import androidx.compose.runtime.Immutable;
import p181hd.InterfaceC9545q;

@Immutable
/* loaded from: classes.dex */
public final class InlineTextContent {
    public static final int $stable = 0;
    private final InterfaceC9545q children;
    private final Placeholder placeholder;

    public InlineTextContent(Placeholder placeholder, InterfaceC9545q interfaceC9545q) {
        this.placeholder = placeholder;
        this.children = interfaceC9545q;
    }

    public final InterfaceC9545q getChildren() {
        return this.children;
    }

    public final Placeholder getPlaceholder() {
        return this.placeholder;
    }
}
