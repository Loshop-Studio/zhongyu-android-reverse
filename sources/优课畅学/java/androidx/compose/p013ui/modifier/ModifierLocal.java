package androidx.compose.p013ui.modifier;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9126n;
import p300x7.InterfaceC10559a;

@Stable
/* loaded from: classes2.dex */
public abstract class ModifierLocal<T> {
    public static final int $stable = 0;
    private final InterfaceC10559a defaultFactory;

    public /* synthetic */ ModifierLocal(InterfaceC10559a interfaceC10559a, AbstractC9126n abstractC9126n) {
        this(interfaceC10559a);
    }

    public final InterfaceC10559a getDefaultFactory$ui_release() {
        return this.defaultFactory;
    }

    private ModifierLocal(InterfaceC10559a interfaceC10559a) {
        this.defaultFactory = interfaceC10559a;
    }
}
