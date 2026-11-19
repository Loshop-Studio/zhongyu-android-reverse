package androidx.compose.p014ui;

import androidx.compose.runtime.Stable;

/* loaded from: classes2.dex */
public final class ZIndexModifierKt {
    @Stable
    public static final Modifier zIndex(Modifier modifier, float f10) {
        return modifier.then(new ZIndexElement(f10));
    }
}
