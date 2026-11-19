package com.zykj.sketch.core.listener;

import android.graphics.Canvas;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.sketch.core.graph.Graph;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13412d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J&\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\f"}, m13413d2 = {"Lcom/zykj/sketch/core/listener/IDraw;", "", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "onDrawComplete", "conditionVoid", "Lkotlin/Function1;", "Lcom/zykj/sketch/core/graph/Graph;", "", "render", "sketch_release"}, m13414k = 1, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public interface IDraw {

    @Metadata(m13414k = 3, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void onDrawComplete$default(IDraw iDraw, Canvas canvas, Function1 function1, int i9, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onDrawComplete");
            }
            if ((i9 & 2) != 0) {
                function1 = new Function1<Graph, Boolean>() { // from class: com.zykj.sketch.core.listener.IDraw.onDrawComplete.1
                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(Graph it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Boolean.TRUE;
                    }
                };
            }
            iDraw.onDrawComplete(canvas, function1);
        }
    }

    void onDraw(Canvas canvas);

    void onDrawComplete(Canvas canvas, Function1<? super Graph, Boolean> conditionVoid);

    void render(Canvas canvas);
}
