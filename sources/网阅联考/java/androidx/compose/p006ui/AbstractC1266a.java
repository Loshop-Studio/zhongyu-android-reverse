package androidx.compose.p006ui;

import androidx.compose.p006ui.Modifier;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.ui.a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1266a {
    static {
        Modifier.Companion companion = Modifier.INSTANCE;
    }

    /* renamed from: a */
    public static Modifier m307a(Modifier modifier, Modifier other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return other == Modifier.INSTANCE ? modifier : new CombinedModifier(modifier, other);
    }
}
