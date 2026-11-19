package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import p300x7.InterfaceC10575q;

@StabilityInferred(parameters = 2)
@InternalComposeApi
/* loaded from: classes2.dex */
public final class MovableContent<P> {
    public static final int $stable = 0;
    private final InterfaceC10575q content;

    public MovableContent(InterfaceC10575q interfaceC10575q) {
        this.content = interfaceC10575q;
    }

    public final InterfaceC10575q getContent() {
        return this.content;
    }
}
