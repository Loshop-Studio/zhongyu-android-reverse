package androidx.compose.p011ui.autofill;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0000\u001a\u00020\u0001\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m5110d2 = {"dataType", "", "Landroidx/compose/ui/autofill/ContentDataType;", "getDataType", "(Landroidx/compose/ui/autofill/ContentDataType;)I", "ContentDataType", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ContentDataType_androidKt {
    @NotNull
    public static final ContentDataType ContentDataType(int i) {
        return AndroidContentDataType.m10262boximpl(AndroidContentDataType.m10263constructorimpl(i));
    }

    public static final int getDataType(@NotNull ContentDataType contentDataType) {
        AbstractC5830k.m5328e(contentDataType, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentDataType");
        return ((AndroidContentDataType) contentDataType).m10268unboximpl();
    }
}
