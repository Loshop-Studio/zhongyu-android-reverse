.class public interface abstract Lcom/zykj/blackboard/core/action/IActionListener;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/action/IActionListener$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00bc\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008f\u0018\u00002\u00020\u0001JA\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u0003\u001a\u00020\u00022\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\tH&\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\tH&\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J+\u0010\u0017\u001a\u00020\u00162\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u00042\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0013H&\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J-\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00142\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0013H&\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ%\u0010\u001f\u001a\u00020\u00162\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u00042\u0006\u0010\u001e\u001a\u00020\u001dH&\u00a2\u0006\u0004\u0008\u001f\u0010 JU\u0010*\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020!2\u0006\u0010\u0008\u001a\u00020&2\u0006\u0010\'\u001a\u00020\t2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0016\u0018\u00010(H&\u00a2\u0006\u0004\u0008*\u0010+Jc\u00100\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020!2\u0006\u0010-\u001a\u00020,2\u000c\u0010/\u001a\u0008\u0012\u0004\u0012\u00020.0\u00042\u0006\u0010\u0008\u001a\u00020&2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0016\u0018\u00010(H&\u00a2\u0006\u0004\u00080\u00101Jm\u0010:\u001a\u00020\u00162\u0006\u00102\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\u00022\n\u0008\u0002\u00105\u001a\u0004\u0018\u0001042\n\u0008\u0002\u0010\'\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010&2\u0010\u0008\u0002\u00106\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\u00042\n\u0008\u0002\u00108\u001a\u0004\u0018\u0001072\n\u0008\u0002\u00109\u001a\u0004\u0018\u00010\tH&\u00a2\u0006\u0004\u0008:\u0010;J%\u0010<\u001a\u00020\u00162\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0008\u001a\u00020\u0007H&\u00a2\u0006\u0004\u0008<\u0010=J\u0011\u0010?\u001a\u0004\u0018\u00010>H&\u00a2\u0006\u0004\u0008?\u0010@J\u0011\u0010B\u001a\u0004\u0018\u00010AH&\u00a2\u0006\u0004\u0008B\u0010CJ\u0011\u0010E\u001a\u0004\u0018\u00010DH&\u00a2\u0006\u0004\u0008E\u0010FJ\u000f\u0010H\u001a\u00020GH&\u00a2\u0006\u0004\u0008H\u0010IJ\u000f\u0010K\u001a\u00020JH&\u00a2\u0006\u0004\u0008K\u0010LJ\u000f\u0010N\u001a\u00020MH&\u00a2\u0006\u0004\u0008N\u0010OJ\u000f\u0010Q\u001a\u00020PH&\u00a2\u0006\u0004\u0008Q\u0010RJ\u000f\u0010S\u001a\u00020\u0016H&\u00a2\u0006\u0004\u0008S\u0010TJ\u001d\u0010V\u001a\u00020\u00162\u000c\u0010U\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0004H&\u00a2\u0006\u0004\u0008V\u0010WJ\u001d\u0010X\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0016\u0018\u00010(H&\u00a2\u0006\u0004\u0008X\u0010Y\u00a8\u0006Z"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/action/IActionListener;",
        "",
        "Lcom/zykj/board/EzyGraphEnum$GraphEnum;",
        "graphType",
        "",
        "Lcom/zykj/board/EzyTouchEvent$TouchEvent;",
        "eventList",
        "Lcom/zykj/board/EzyPaint$Paint;",
        "paint",
        "",
        "parentGraphId",
        "graphId",
        "Lcom/zykj/blackboard/core/graph/Graph;",
        "writingGraphEvent",
        "(Lcom/zykj/board/EzyGraphEnum$GraphEnum;Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/blackboard/core/graph/Graph;",
        "Lcom/zykj/blackboard/core/graph/IGraph;",
        "groupGraphEvent",
        "(Ljava/lang/String;)Lcom/zykj/blackboard/core/graph/IGraph;",
        "graphList",
        "",
        "Lcom/zykj/board/EzyMatrix$Matrix;",
        "matrixList",
        "Ld6/s;",
        "transformGraphEvent",
        "(Ljava/util/List;Ljava/util/List;)V",
        "originMatrix",
        "lastMatrix",
        "transformCameraEvent",
        "(Lcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;Ljava/util/List;)V",
        "",
        "currentTime",
        "deleteGraphEvent",
        "(Ljava/util/List;J)V",
        "",
        "width",
        "height",
        "x",
        "y",
        "Landroid/graphics/Paint;",
        "content",
        "Lkotlin/Function1;",
        "callback",
        "textGraphEvent",
        "(FFFFLandroid/graphics/Paint;Ljava/lang/String;Lr6/c;)V",
        "",
        "geometryType",
        "Landroid/graphics/PointF;",
        "pointList",
        "geometryGraphEvent",
        "(FFFFILjava/util/List;Landroid/graphics/Paint;Lr6/c;)V",
        "graph",
        "graphEnum",
        "Landroid/graphics/RectF;",
        "originRectF",
        "points",
        "Landroid/graphics/Matrix;",
        "renderMatrix",
        "filePath",
        "changeGraph",
        "(Lcom/zykj/blackboard/core/graph/IGraph;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Landroid/graphics/RectF;Ljava/lang/String;Landroid/graphics/Paint;Ljava/util/List;Landroid/graphics/Matrix;Ljava/lang/String;)V",
        "moveCursor",
        "(Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;)V",
        "Lcom/zykj/blackboard/listener/ITextSelectListener;",
        "getTextSelectListener",
        "()Lcom/zykj/blackboard/listener/ITextSelectListener;",
        "Lcom/zykj/blackboard/listener/IGeometrySelectListener;",
        "getGeometrySelectListener",
        "()Lcom/zykj/blackboard/listener/IGeometrySelectListener;",
        "Lcom/zykj/blackboard/listener/IAreaMoveListener;",
        "getAreaMoveListener",
        "()Lcom/zykj/blackboard/listener/IAreaMoveListener;",
        "Lcom/zykj/blackboard/core/canvas/control/IGraphControl;",
        "getGraphControl",
        "()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;",
        "Lcom/zykj/blackboard/bean/BoardConfig;",
        "getBoardConfig",
        "()Lcom/zykj/blackboard/bean/BoardConfig;",
        "Lcom/zykj/blackboard/core/canvas/MatrixAdapter;",
        "getMatrixAdapter",
        "()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;",
        "Lcom/zykj/blackboard/core/loader/SourceLoader;",
        "getSourceLoader",
        "()Lcom/zykj/blackboard/core/loader/SourceLoader;",
        "saveSnapshot",
        "()V",
        "graphIDList",
        "newSelectGraph",
        "(Ljava/util/List;)V",
        "getGeometryCreateListener",
        "()Lr6/c;",
        "blackboard_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract changeGraph(Lcom/zykj/blackboard/core/graph/IGraph;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Landroid/graphics/RectF;Ljava/lang/String;Landroid/graphics/Paint;Ljava/util/List;Landroid/graphics/Matrix;Ljava/lang/String;)V
    .param p1    # Lcom/zykj/blackboard/core/graph/IGraph;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/zykj/board/EzyGraphEnum$GraphEnum;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Landroid/graphics/Paint;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p8    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
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
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
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

.method public abstract geometryGraphEvent(FFFFILjava/util/List;Landroid/graphics/Paint;Lr6/c;)V
    .param p6    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Landroid/graphics/Paint;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FFFFI",
            "Ljava/util/List<",
            "+",
            "Landroid/graphics/PointF;",
            ">;",
            "Landroid/graphics/Paint;",
            "Lr6/c;",
            ")V"
        }
    .end annotation
.end method

.method public abstract getAreaMoveListener()Lcom/zykj/blackboard/listener/IAreaMoveListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getBoardConfig()Lcom/zykj/blackboard/bean/BoardConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getGeometryCreateListener()Lr6/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lr6/c;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getGeometrySelectListener()Lcom/zykj/blackboard/listener/IGeometrySelectListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getGraphControl()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getMatrixAdapter()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getSourceLoader()Lcom/zykj/blackboard/core/loader/SourceLoader;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getTextSelectListener()Lcom/zykj/blackboard/listener/ITextSelectListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract groupGraphEvent(Ljava/lang/String;)Lcom/zykj/blackboard/core/graph/IGraph;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract moveCursor(Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;)V
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/zykj/board/EzyPaint$Paint;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
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
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
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

.method public abstract textGraphEvent(FFFFLandroid/graphics/Paint;Ljava/lang/String;Lr6/c;)V
    .param p5    # Landroid/graphics/Paint;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FFFF",
            "Landroid/graphics/Paint;",
            "Ljava/lang/String;",
            "Lr6/c;",
            ")V"
        }
    .end annotation
.end method

.method public abstract transformCameraEvent(Lcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;Ljava/util/List;)V
    .param p1    # Lcom/zykj/board/EzyMatrix$Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/zykj/board/EzyMatrix$Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
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
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
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
    .param p1    # Lcom/zykj/board/EzyGraphEnum$GraphEnum;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/zykj/board/EzyPaint$Paint;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
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

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method
