package androidx.compose.p011ui;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m5110d2 = {"sensitiveContent", "Landroidx/compose/ui/Modifier;", "isContentSensitive", "", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class SensitiveContentKt {
    @NotNull
    public static final Modifier sensitiveContent(@NotNull Modifier modifier, boolean z8) {
        return modifier.then(new SensitiveNodeElement(z8));
    }

    public static /* synthetic */ Modifier sensitiveContent$default(Modifier modifier, boolean z8, int i, Object obj) {
        if ((i & 1) != 0) {
            z8 = true;
        }
        return sensitiveContent(modifier, z8);
    }
}
