package androidx.compose.p014ui.modifier;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9529a;

@Stable
/* loaded from: classes2.dex */
public abstract class ModifierLocal<T> {
    public static final int $stable = 0;
    private final InterfaceC9529a defaultFactory;

    public /* synthetic */ ModifierLocal(InterfaceC9529a interfaceC9529a, AbstractC9972n abstractC9972n) {
        this(interfaceC9529a);
    }

    public final InterfaceC9529a getDefaultFactory$ui_release() {
        return this.defaultFactory;
    }

    private ModifierLocal(InterfaceC9529a interfaceC9529a) {
        this.defaultFactory = interfaceC9529a;
    }
}
