package androidx.compose.p011ui.text.input;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m5110d2 = {"", "", "destination", "", "destinationOffset", "startIndex", "endIndex", "Ld6/s;", "toCharArray", "(Ljava/lang/String;[CIII)V", "ui-text_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class GapBuffer_jvmKt {
    public static final void toCharArray(@NotNull String str, @NotNull char[] cArr, int i, int i8, int i9) {
        AbstractC5830k.m5328e(str, "null cannot be cast to non-null type java.lang.String");
        str.getChars(i8, i9, cArr, i);
    }
}
