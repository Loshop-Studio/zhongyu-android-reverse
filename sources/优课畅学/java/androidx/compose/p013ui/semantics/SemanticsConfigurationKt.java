package androidx.compose.p013ui.semantics;

import p300x7.InterfaceC10559a;

/* loaded from: classes2.dex */
public final class SemanticsConfigurationKt {
    public static final <T> T getOrNull(SemanticsConfiguration semanticsConfiguration, SemanticsPropertyKey<T> semanticsPropertyKey) {
        return (T) semanticsConfiguration.getOrElseNullable(semanticsPropertyKey, new InterfaceC10559a() { // from class: androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull.1
            @Override // p300x7.InterfaceC10559a
            public final T invoke() {
                return null;
            }
        });
    }
}
