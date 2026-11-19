package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import p181hd.InterfaceC9545q;

@StabilityInferred(parameters = 2)
@InternalComposeApi
/* loaded from: classes2.dex */
public final class MovableContent<P> {
    public static final int $stable = 0;
    private final InterfaceC9545q content;

    public MovableContent(InterfaceC9545q interfaceC9545q) {
        this.content = interfaceC9545q;
    }

    public final InterfaceC9545q getContent() {
        return this.content;
    }
}
