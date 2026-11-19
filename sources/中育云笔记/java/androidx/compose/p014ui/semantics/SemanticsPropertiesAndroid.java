package androidx.compose.p014ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import p181hd.InterfaceC9544p;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class SemanticsPropertiesAndroid {
    public static final SemanticsPropertiesAndroid INSTANCE = new SemanticsPropertiesAndroid();
    private static final SemanticsPropertyKey<Boolean> TestTagsAsResourceId = new SemanticsPropertyKey<>("TestTagsAsResourceId", false, new InterfaceC9544p() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesAndroid$TestTagsAsResourceId$1
        public final Boolean invoke(Boolean bool, boolean z10) {
            return bool;
        }

        @Override // p181hd.InterfaceC9544p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((Boolean) obj, ((Boolean) obj2).booleanValue());
        }
    });
    public static final int $stable = 8;

    private SemanticsPropertiesAndroid() {
    }

    public static /* synthetic */ void getTestTagsAsResourceId$annotations() {
    }

    public final SemanticsPropertyKey<Boolean> getTestTagsAsResourceId() {
        return TestTagsAsResourceId;
    }
}
