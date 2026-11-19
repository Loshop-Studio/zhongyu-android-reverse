package androidx.compose.p014ui.draw;

import androidx.collection.MutableObjectList;
import androidx.collection.ObjectListKt;
import androidx.compose.p014ui.graphics.GraphicsContext;
import androidx.compose.p014ui.graphics.layer.GraphicsLayer;
import androidx.compose.p014ui.internal.InlineClassHelperKt;

/* loaded from: classes2.dex */
final class ScopedGraphicsContext implements GraphicsContext {
    private MutableObjectList<GraphicsLayer> allocatedGraphicsLayers;
    private GraphicsContext graphicsContext;

    @Override // androidx.compose.p014ui.graphics.GraphicsContext
    public GraphicsLayer createGraphicsLayer() {
        GraphicsContext graphicsContext = this.graphicsContext;
        if (!(graphicsContext != null)) {
            InlineClassHelperKt.throwIllegalStateException("GraphicsContext not provided");
        }
        GraphicsLayer graphicsLayerCreateGraphicsLayer = graphicsContext.createGraphicsLayer();
        MutableObjectList<GraphicsLayer> mutableObjectList = this.allocatedGraphicsLayers;
        if (mutableObjectList == null) {
            this.allocatedGraphicsLayers = ObjectListKt.mutableObjectListOf(graphicsLayerCreateGraphicsLayer);
            return graphicsLayerCreateGraphicsLayer;
        }
        mutableObjectList.add(graphicsLayerCreateGraphicsLayer);
        return graphicsLayerCreateGraphicsLayer;
    }

    public final GraphicsContext getGraphicsContext() {
        return this.graphicsContext;
    }

    @Override // androidx.compose.p014ui.graphics.GraphicsContext
    public void releaseGraphicsLayer(GraphicsLayer graphicsLayer) {
        GraphicsContext graphicsContext = this.graphicsContext;
        if (graphicsContext != null) {
            graphicsContext.releaseGraphicsLayer(graphicsLayer);
        }
    }

    public final void releaseGraphicsLayers() {
        MutableObjectList<GraphicsLayer> mutableObjectList = this.allocatedGraphicsLayers;
        if (mutableObjectList != null) {
            Object[] objArr = mutableObjectList.content;
            int i10 = mutableObjectList._size;
            for (int i11 = 0; i11 < i10; i11++) {
                releaseGraphicsLayer((GraphicsLayer) objArr[i11]);
            }
            mutableObjectList.clear();
        }
    }

    public final void setGraphicsContext(GraphicsContext graphicsContext) {
        releaseGraphicsLayers();
        this.graphicsContext = graphicsContext;
    }
}
