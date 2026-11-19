package androidx.compose.p013ui;

/* loaded from: classes2.dex */
public final class SensitiveContentKt {
    public static final Modifier sensitiveContent(Modifier modifier, boolean z10) {
        return modifier.then(new SensitiveNodeElement(z10));
    }

    public static /* synthetic */ Modifier sensitiveContent$default(Modifier modifier, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return sensitiveContent(modifier, z10);
    }
}
