package androidx.compose.p011ui.platform;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0004"}, m5110d2 = {"testTag", "Landroidx/compose/ui/Modifier;", "tag", "", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class TestTagKt {
    @Stable
    @NotNull
    public static final Modifier testTag(@NotNull Modifier modifier, @NotNull String str) {
        return modifier.then(new TestTagElement(str));
    }
}
