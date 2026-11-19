package androidx.compose.p009ui;

import kotlin.Metadata;

@Metadata(m7879d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m7880d2 = {"sensitiveContent", "Landroidx/compose/ui/Modifier;", "isContentSensitive", "", "ui_release"}, m7881k = 2, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes2.dex */
public final class SensitiveContentKt {
    public static final Modifier sensitiveContent(Modifier modifier, boolean z6) {
        return modifier.then(new SensitiveNodeElement(z6));
    }

    public static /* synthetic */ Modifier sensitiveContent$default(Modifier modifier, boolean z6, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            z6 = true;
        }
        return sensitiveContent(modifier, z6);
    }
}
