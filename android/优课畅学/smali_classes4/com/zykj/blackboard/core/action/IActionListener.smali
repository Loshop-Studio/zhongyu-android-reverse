.class public interface abstract Lcom/zykj/blackboard/core/action/IActionListener;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/action/IActionListener$DefaultImpls;
    }
.end annotation


# virtual methods
.method public abstract changeGraph(Lcom/zykj/blackboard/core/graph/IGraph;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Landroid/graphics/RectF;Ljava/lang/String;Landroid/graphics/Paint;Ljava/util/List;Landroid/graphics/Matrix;Ljava/lang/String;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            "Lcom/zykj/board/EzyGraphEnum$GraphEnum;",
            "Landroid/graphics/RectF;",
            "Ljava/lang/String;",
            "Landroid/graphics/Paint;",
            "Ljava/util/List<",
            "+",
            "Landroid/graphics/PointF;",
            ">;",
            "Landroid/graphics/Matrix;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation
.end method

.method public abstract deleteGraphEvent(Ljava/util/List;J)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;J)V"
        }
    .end annotation
.end method

.method public abstract geometryGraphEvent(FFFFILjava/util/List;Landroid/graphics/Paint;Lx7/l;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FFFFI",
            "Ljava/util/List<",
            "+",
            "Landroid/graphics/PointF;",
            ">;",
            "Landroid/graphics/Paint;",
            "Lx7/l;",
            ")V"
        }
    .end annotation
.end method

.method public abstract getAreaMoveListener()Lcom/zykj/blackboard/listener/IAreaMoveListener;
.end method

.method public abstract getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;
.end method

.method public abstract getGeometryCreateListener()Lx7/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lx7/l;"
        }
    .end annotation
.end method

.method public abstract getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;
.end method

.method public abstract getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;
.end method

.method public abstract getSourceLoader()Lcom/zykj/blackboard/core/loader/SourceLoader;
.end method

.method public abstract getTextSelectListener()Lcom/zykj/blackboard/listener/ITextSelectListener;
.end method

.method public abstract groupGraphEvent(Ljava/lang/String;)Lcom/zykj/blackboard/core/graph/IGraph;
.end method

.method public abstract moveCursor(Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyTouchEvent$TouchEvent;",
            ">;",
            "Lcom/zykj/board/EzyPaint$Paint;",
            ")V"
        }
    .end annotation
.end method

.method public abstract newSelectGraph(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract saveSnapshot()V
.end method

.method public abstract textGraphEvent(FFFFLandroid/graphics/Paint;Ljava/lang/String;Lx7/l;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FFFF",
            "Landroid/graphics/Paint;",
            "Ljava/lang/String;",
            "Lx7/l;",
            ")V"
        }
    .end annotation
.end method

.method public abstract transformCameraEvent(Lcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/board/EzyMatrix$Matrix;",
            "Lcom/zykj/board/EzyMatrix$Matrix;",
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyMatrix$Matrix;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract transformGraphEvent(Ljava/util/List;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/graph/IGraph;",
            ">;",
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyMatrix$Matrix;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract writingGraphEvent(Lcom/zykj/board/EzyGraphEnum$GraphEnum;Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/blackboard/core/graph/Graph;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/board/EzyGraphEnum$GraphEnum;",
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyTouchEvent$TouchEvent;",
            ">;",
            "Lcom/zykj/board/EzyPaint$Paint;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lcom/zykj/blackboard/core/graph/Graph;"
        }
    .end annotation
.end method
