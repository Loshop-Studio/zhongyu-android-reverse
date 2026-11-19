package androidx.compose.p014ui.modifier;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public abstract class ModifierLocalMap {
    public static final int $stable = 0;

    public /* synthetic */ ModifierLocalMap(AbstractC9972n abstractC9972n) {
        this();
    }

    public abstract boolean contains$ui_release(ModifierLocal<?> modifierLocal);

    public abstract <T> T get$ui_release(ModifierLocal<T> modifierLocal);

    /* renamed from: set$ui_release */
    public abstract <T> void mo32336set$ui_release(ModifierLocal<T> modifierLocal, T t10);

    private ModifierLocalMap() {
    }
}
