package com.zykj.blackboard.core.graph;

import android.graphics.Matrix;
import android.graphics.RectF;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyGraphEnum;
import com.zykj.board.EzyPageSnapshot;
import java.util.List;

/* loaded from: classes4.dex */
public interface IGraph extends IGraphChange, IDraw {
    Graph copy();

    void deleteGraphList(List<IGraph> list);

    Graph findById(String str);

    IGraph findByPoint(float f10, float f11, float f12);

    boolean findByRectF(RectF rectF, List<IGraph> list);

    boolean findGraphListByPoint(float f10, float f11, float f12, List<IGraph> list);

    List<IGraph> getChildGraph();

    EzyCommand.CommandSource.CommandInfo.GraphData.C7194b getGraphData();

    String getId();

    RectF getMinOutRectF(Matrix matrix);

    RectF getOriginalRectF();

    IGraph getParent();

    Matrix getRenderMatrix();

    RectF getRenderRectF();

    EzyPageSnapshot.PageSnapshot.GraphSnapshot.C7228b getSnapshot();

    EzyGraphEnum.GraphEnum graphType();

    boolean isCollide(float f10, float f11, float f12);

    boolean isInRect(float f10, float f11, float f12);

    void onDestroy();

    void setParent(IGraph iGraph);
}
