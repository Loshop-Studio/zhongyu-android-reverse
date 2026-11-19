package com.zykj.blackboard.enums;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.graph.group.GeometryGraph;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.blackboard.core.graph.group.TextGraph;
import com.zykj.blackboard.core.graph.stroke.StrokeGraph;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0005\u001a\u00020\u0002*\u00020\u0006\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m5110d2 = {"allSelectGraphEnumList", "", "Lcom/zykj/blackboard/enums/SelectGraphEnum;", "getAllSelectGraphEnumList", "()Ljava/util/List;", "convert2SelectGraphEnum", "Lcom/zykj/blackboard/core/graph/IGraph;", "blackboard_release"}, m5111k = 2, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class SelectGraphEnumKt {

    @NotNull
    private static final List<SelectGraphEnum> allSelectGraphEnumList = AbstractC5806u.m5287z(SelectGraphEnum.STROKE, SelectGraphEnum.STROKE_HIGHLIGHTER, SelectGraphEnum.IMAGE, SelectGraphEnum.TEXT, SelectGraphEnum.GEOMETRY);

    @NotNull
    public static final SelectGraphEnum convert2SelectGraphEnum(@NotNull IGraph iGraph) {
        AbstractC5830k.m5330g(iGraph, "<this>");
        if (iGraph instanceof ImageGraph) {
            return SelectGraphEnum.IMAGE;
        }
        if (iGraph instanceof GeometryGraph) {
            return SelectGraphEnum.GEOMETRY;
        }
        if (iGraph instanceof TextGraph) {
            return SelectGraphEnum.TEXT;
        }
        List<IGraph> childGraph = iGraph.getChildGraph();
        if (childGraph == null || !childGraph.isEmpty()) {
            for (IGraph iGraph2 : childGraph) {
                if (!(iGraph2 instanceof StrokeGraph) || !((StrokeGraph) iGraph2).isHighlighter()) {
                    return SelectGraphEnum.STROKE;
                }
            }
        }
        return SelectGraphEnum.STROKE_HIGHLIGHTER;
    }

    @NotNull
    public static final List<SelectGraphEnum> getAllSelectGraphEnumList() {
        return allSelectGraphEnumList;
    }
}
