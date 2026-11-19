package com.zykj.view.board.simple;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.view.board.simple.SimplePenSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m5110d2 = {"simplePenSizeList", "", "Lcom/zykj/view/board/simple/SimplePenSize;", "getSimplePenSizeList", "()Ljava/util/List;", "view_release"}, m5111k = 2, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class DataStateKt {

    @NotNull
    private static final List<SimplePenSize> simplePenSizeList = AbstractC5806u.m5287z(SimplePenSize.Little.INSTANCE, SimplePenSize.Middle.INSTANCE, SimplePenSize.Large.INSTANCE);

    @NotNull
    public static final List<SimplePenSize> getSimplePenSizeList() {
        return simplePenSizeList;
    }
}
