package com.zykj.sketch.core.graph;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.sketch.core.listener.IControl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13412d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m13413d2 = {"Lcom/zykj/sketch/core/graph/ShapeGraph;", "Lcom/zykj/sketch/core/graph/WritingGroupGraph;", "control", "Lcom/zykj/sketch/core/listener/IControl;", "(Lcom/zykj/sketch/core/listener/IControl;)V", "sketch_release"}, m13414k = 1, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public abstract class ShapeGraph extends WritingGroupGraph {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShapeGraph(IControl control) {
        super(control);
        Intrinsics.checkNotNullParameter(control, "control");
    }
}
