.class public interface abstract Lcom/zykj/blackboard/core/graph/IGraph;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/core/graph/IGraphChange;
.implements Lcom/zykj/blackboard/core/graph/IDraw;


# virtual methods
.method public abstract copy()Lcom/zykj/blackboard/core/graph/Graph;
.end method

.method public abstract deleteGraphList(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract findById(Ljava/lang/String;)Lcom/zykj/blackboard/core/graph/Graph;
.end method

.method public abstract findByPoint(FFF)Lcom/zykj/blackboard/core/graph/IGraph;
.end method

.method public abstract findByRectF(Landroid/graphics/RectF;Ljava/util/List;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/RectF;",
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;)Z"
        }
    .end annotation
.end method

.method public abstract findGraphListByPoint(FFFLjava/util/List;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FFF",
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;)Z"
        }
    .end annotation
.end method

.method public abstract getChildGraph()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getGraphData()Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData$b;
.end method

.method public abstract getId()Ljava/lang/String;
.end method

.method public abstract getMinOutRectF(Landroid/graphics/Matrix;)Landroid/graphics/RectF;
.end method

.method public abstract getOriginalRectF()Landroid/graphics/RectF;
.end method

.method public abstract getParent()Lcom/zykj/blackboard/core/graph/IGraph;
.end method

.method public abstract getRenderMatrix()Landroid/graphics/Matrix;
.end method

.method public abstract getRenderRectF()Landroid/graphics/RectF;
.end method

.method public abstract getSnapshot()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;
.end method

.method public abstract graphType()Lcom/zykj/board/EzyGraphEnum$GraphEnum;
.end method

.method public abstract isCollide(FFF)Z
.end method

.method public abstract isInRect(FFF)Z
.end method

.method public abstract onDestroy()V
.end method

.method public abstract setParent(Lcom/zykj/blackboard/core/graph/IGraph;)V
.end method
