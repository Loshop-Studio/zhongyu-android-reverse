package androidx.compose.p014ui.semantics;

import p181hd.InterfaceC9529a;

/* loaded from: classes2.dex */
public final class SemanticsConfigurationKt {
    public static final <T> T getOrNull(SemanticsConfiguration semanticsConfiguration, SemanticsPropertyKey<T> semanticsPropertyKey) {
        return (T) semanticsConfiguration.getOrElseNullable(semanticsPropertyKey, new InterfaceC9529a() { // from class: androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull.1
            @Override // p181hd.InterfaceC9529a
            public final T invoke() {
                return null;
            }
        });
    }
}
