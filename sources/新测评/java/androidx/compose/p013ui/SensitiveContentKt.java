package androidx.compose.p013ui;

import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m13558d2 = {"sensitiveContent", "Landroidx/compose/ui/Modifier;", "isContentSensitive", "", "ui_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class SensitiveContentKt {
    public static final Modifier sensitiveContent(Modifier modifier, boolean z9) {
        return modifier.then(new SensitiveNodeElement(z9));
    }

    public static /* synthetic */ Modifier sensitiveContent$default(Modifier modifier, boolean z9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = true;
        }
        return sensitiveContent(modifier, z9);
    }
}
