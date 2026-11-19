package com.xuexiang.xui.widget.imageview.crop;

import android.graphics.Rect;

/* loaded from: classes.dex */
abstract class HandleHelper {
    private static final float UNFIXED_ASPECT_RATIO_CONSTANT = 1.0f;
    private EdgePair mActiveEdges;
    private Edge mHorizontalEdge;
    private Edge mVerticalEdge;

    HandleHelper(Edge edge, Edge edge2) {
        this.mHorizontalEdge = edge;
        this.mVerticalEdge = edge2;
        this.mActiveEdges = new EdgePair(edge, edge2);
    }

    private float getAspectRatio(float f4, float f5) {
        Edge edge = this.mVerticalEdge;
        Edge edge2 = Edge.LEFT;
        float coordinate = edge == edge2 ? f4 : edge2.getCoordinate();
        Edge edge3 = this.mHorizontalEdge;
        Edge edge4 = Edge.TOP;
        float coordinate2 = edge3 == edge4 ? f5 : edge4.getCoordinate();
        Edge edge5 = this.mVerticalEdge;
        Edge edge6 = Edge.RIGHT;
        if (edge5 != edge6) {
            f4 = edge6.getCoordinate();
        }
        Edge edge7 = this.mHorizontalEdge;
        Edge edge8 = Edge.BOTTOM;
        if (edge7 != edge8) {
            f5 = edge8.getCoordinate();
        }
        return AspectRatioUtil.calculateAspectRatio(coordinate, coordinate2, f4, f5);
    }

    EdgePair getActiveEdges() {
        return this.mActiveEdges;
    }

    abstract void updateCropWindow(float f4, float f5, float f6, Rect rect, float f7);

    void updateCropWindow(float f4, float f5, Rect rect, float f6) {
        EdgePair activeEdges = getActiveEdges();
        Edge edge = activeEdges.primary;
        Edge edge2 = activeEdges.secondary;
        if (edge != null) {
            edge.adjustCoordinate(f4, f5, rect, f6, 1.0f);
        }
        if (edge2 != null) {
            edge2.adjustCoordinate(f4, f5, rect, f6, 1.0f);
        }
    }

    EdgePair getActiveEdges(float f4, float f5, float f6) {
        if (getAspectRatio(f4, f5) > f6) {
            EdgePair edgePair = this.mActiveEdges;
            edgePair.primary = this.mVerticalEdge;
            edgePair.secondary = this.mHorizontalEdge;
        } else {
            EdgePair edgePair2 = this.mActiveEdges;
            edgePair2.primary = this.mHorizontalEdge;
            edgePair2.secondary = this.mVerticalEdge;
        }
        return this.mActiveEdges;
    }
}
