.class public Lcom/zykj/sketch/core/graph/WritingGroupGraph;
.super Lcom/zykj/sketch/core/graph/BoundedContainerGraph;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0010!\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\nJ+\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001b\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0011\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u001b\u0010!\u001a\u00020\u00132\u000c\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u0010\u00a2\u0006\u0004\u0008!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016\u00a2\u0006\u0004\u0008$\u0010%J\u000f\u0010\'\u001a\u00020&H\u0016\u00a2\u0006\u0004\u0008\'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008*\u0010+\u00a8\u0006,"
    }
    d2 = {
        "Lcom/zykj/sketch/core/graph/WritingGroupGraph;",
        "Lcom/zykj/sketch/core/graph/BoundedContainerGraph;",
        "Lcom/zykj/sketch/core/listener/IControl;",
        "control",
        "<init>",
        "(Lcom/zykj/sketch/core/listener/IControl;)V",
        "Lcom/zykj/sketch/core/graph/Graph;",
        "graph",
        "Ld6/s;",
        "addGraph",
        "(Lcom/zykj/sketch/core/graph/Graph;)V",
        "removeGraph",
        "",
        "x",
        "y",
        "radius",
        "",
        "getIntersectGraph",
        "(FFF)Ljava/util/List;",
        "Landroid/graphics/Path;",
        "path",
        "(Landroid/graphics/Path;)Ljava/util/List;",
        "Landroid/graphics/Region;",
        "rectConvertRegion",
        "(Landroid/graphics/Path;)Landroid/graphics/Region;",
        "Landroid/graphics/RectF;",
        "r1",
        "r2",
        "",
        "crossLine",
        "(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z",
        "Landroid/graphics/PointF;",
        "list",
        "createPath",
        "(Ljava/util/List;)Landroid/graphics/Path;",
        "Lcom/zykj/sketch/GraphSnapshot$GraphData;",
        "getSnapshot",
        "()Lcom/zykj/sketch/GraphSnapshot$GraphData;",
        "Lcom/zykj/sketch/GraphSnapshot$GraphType;",
        "graphType",
        "()Lcom/zykj/sketch/GraphSnapshot$GraphType;",
        "Landroid/graphics/Bitmap;",
        "snapshotBitmap",
        "Landroid/graphics/Bitmap;",
        "sketch_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private snapshotBitmap:Landroid/graphics/Bitmap;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/zykj/sketch/core/listener/IControl;)V
    .locals 1
    .param p1    # Lcom/zykj/sketch/core/listener/IControl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "control"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/zykj/sketch/core/graph/BoundedContainerGraph;-><init>(Lcom/zykj/sketch/core/listener/IControl;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public addGraph(Lcom/zykj/sketch/core/graph/Graph;)V
    .locals 1
    .param p1    # Lcom/zykj/sketch/core/graph/Graph;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "graph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/zykj/sketch/core/graph/Graph;->addGraph(Lcom/zykj/sketch/core/graph/Graph;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/BoundedContainerGraph;->onMeasure()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final createPath(Ljava/util/List;)Landroid/graphics/Path;
    .locals 11
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/graphics/PointF;",
            ">;)",
            "Landroid/graphics/Path;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "list"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/graphics/Path;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x0

    .line 16
    move v3, v2

    .line 17
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    const/4 v5, 0x2

    .line 22
    if-eqz v4, :cond_1

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    check-cast v4, Landroid/graphics/PointF;

    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/graphics/Path;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    if-eqz v6, :cond_0

    .line 35
    .line 36
    iget v2, v4, Landroid/graphics/PointF;->x:F

    .line 37
    .line 38
    iget v3, v4, Landroid/graphics/PointF;->y:F

    .line 39
    .line 40
    invoke-virtual {v0, v2, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 41
    .line 42
    .line 43
    iget v2, v4, Landroid/graphics/PointF;->x:F

    .line 44
    .line 45
    iget v3, v4, Landroid/graphics/PointF;->y:F

    .line 46
    .line 47
    invoke-virtual {v0, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_0
    iget v6, v4, Landroid/graphics/PointF;->x:F

    .line 52
    .line 53
    add-float/2addr v6, v2

    .line 54
    int-to-float v5, v5

    .line 55
    div-float/2addr v6, v5

    .line 56
    iget v7, v4, Landroid/graphics/PointF;->y:F

    .line 57
    .line 58
    add-float/2addr v7, v3

    .line 59
    div-float/2addr v7, v5

    .line 60
    invoke-virtual {v0, v2, v3, v6, v7}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 61
    .line 62
    .line 63
    :goto_1
    iget v2, v4, Landroid/graphics/PointF;->x:F

    .line 64
    .line 65
    iget v3, v4, Landroid/graphics/PointF;->y:F

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    :goto_2
    if-lez v1, :cond_3

    .line 73
    .line 74
    add-int/lit8 v4, v1, -0x1

    .line 75
    .line 76
    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    check-cast v4, Landroid/graphics/PointF;

    .line 81
    .line 82
    invoke-virtual {v0}, Landroid/graphics/Path;->isEmpty()Z

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    const/4 v7, 0x1

    .line 87
    if-eqz v6, :cond_2

    .line 88
    .line 89
    iget v2, v4, Landroid/graphics/PointF;->x:F

    .line 90
    .line 91
    iget v3, v4, Landroid/graphics/PointF;->y:F

    .line 92
    .line 93
    int-to-float v6, v7

    .line 94
    sub-float/2addr v3, v6

    .line 95
    invoke-virtual {v0, v2, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 96
    .line 97
    .line 98
    iget v2, v4, Landroid/graphics/PointF;->x:F

    .line 99
    .line 100
    iget v3, v4, Landroid/graphics/PointF;->y:F

    .line 101
    .line 102
    sub-float/2addr v3, v6

    .line 103
    invoke-virtual {v0, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 104
    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_2
    iget v6, v4, Landroid/graphics/PointF;->x:F

    .line 108
    .line 109
    add-float/2addr v6, v2

    .line 110
    int-to-float v8, v5

    .line 111
    div-float/2addr v6, v8

    .line 112
    iget v9, v4, Landroid/graphics/PointF;->y:F

    .line 113
    .line 114
    int-to-float v10, v7

    .line 115
    sub-float/2addr v9, v10

    .line 116
    add-float/2addr v9, v3

    .line 117
    div-float/2addr v9, v8

    .line 118
    invoke-virtual {v0, v2, v3, v6, v9}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 119
    .line 120
    .line 121
    :goto_3
    iget v2, v4, Landroid/graphics/PointF;->x:F

    .line 122
    .line 123
    iget v3, v4, Landroid/graphics/PointF;->y:F

    .line 124
    .line 125
    int-to-float v4, v7

    .line 126
    sub-float/2addr v3, v4

    .line 127
    add-int/lit8 v1, v1, -0x1

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_3
    invoke-virtual {v0}, Landroid/graphics/Path;->isEmpty()Z

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    if-nez v1, :cond_4

    .line 135
    .line 136
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 137
    .line 138
    .line 139
    :cond_4
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 140
    .line 141
    .line 142
    return-object v0
.end method

.method public final crossLine(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z
    .locals 4
    .param p1    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "r1"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "r2"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget v0, p1, Landroid/graphics/RectF;->left:F

    .line 12
    .line 13
    iget v1, p1, Landroid/graphics/RectF;->right:F

    .line 14
    .line 15
    add-float/2addr v0, v1

    .line 16
    const/4 v1, 0x2

    .line 17
    int-to-float v1, v1

    .line 18
    div-float/2addr v0, v1

    .line 19
    iget v2, p2, Landroid/graphics/RectF;->left:F

    .line 20
    .line 21
    iget v3, p2, Landroid/graphics/RectF;->right:F

    .line 22
    .line 23
    add-float/2addr v2, v3

    .line 24
    div-float/2addr v2, v1

    .line 25
    sub-float/2addr v0, v2

    .line 26
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget v2, p1, Landroid/graphics/RectF;->right:F

    .line 31
    .line 32
    iget v3, p2, Landroid/graphics/RectF;->right:F

    .line 33
    .line 34
    add-float/2addr v2, v3

    .line 35
    iget v3, p1, Landroid/graphics/RectF;->left:F

    .line 36
    .line 37
    sub-float/2addr v2, v3

    .line 38
    iget v3, p2, Landroid/graphics/RectF;->left:F

    .line 39
    .line 40
    sub-float/2addr v2, v3

    .line 41
    div-float/2addr v2, v1

    .line 42
    cmpg-float v0, v0, v2

    .line 43
    .line 44
    if-gez v0, :cond_0

    .line 45
    .line 46
    iget v0, p1, Landroid/graphics/RectF;->top:F

    .line 47
    .line 48
    iget v2, p1, Landroid/graphics/RectF;->bottom:F

    .line 49
    .line 50
    add-float/2addr v0, v2

    .line 51
    div-float/2addr v0, v1

    .line 52
    iget v2, p2, Landroid/graphics/RectF;->top:F

    .line 53
    .line 54
    iget v3, p2, Landroid/graphics/RectF;->bottom:F

    .line 55
    .line 56
    add-float/2addr v2, v3

    .line 57
    div-float/2addr v2, v1

    .line 58
    sub-float/2addr v0, v2

    .line 59
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    iget v2, p1, Landroid/graphics/RectF;->bottom:F

    .line 64
    .line 65
    iget v3, p2, Landroid/graphics/RectF;->bottom:F

    .line 66
    .line 67
    add-float/2addr v2, v3

    .line 68
    iget p1, p1, Landroid/graphics/RectF;->top:F

    .line 69
    .line 70
    sub-float/2addr v2, p1

    .line 71
    iget p1, p2, Landroid/graphics/RectF;->top:F

    .line 72
    .line 73
    sub-float/2addr v2, p1

    .line 74
    div-float/2addr v2, v1

    .line 75
    cmpg-float p1, v0, v2

    .line 76
    .line 77
    if-gez p1, :cond_0

    .line 78
    .line 79
    const/4 p1, 0x1

    .line 80
    return p1

    .line 81
    :cond_0
    const/4 p1, 0x0

    .line 82
    return p1
.end method

.method public final getIntersectGraph(FFF)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FFF)",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/core/graph/Graph;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getChild()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/zykj/sketch/core/graph/Graph;

    .line 3
    instance-of v3, v2, Lcom/zykj/sketch/core/graph/StrokeGraph;

    if-eqz v3, :cond_0

    .line 4
    move-object v3, v2

    check-cast v3, Lcom/zykj/sketch/core/graph/StrokeGraph;

    invoke-virtual {v3, p1, p2, p3}, Lcom/zykj/sketch/core/graph/StrokeGraph;->isIntersect(FFF)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 5
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final getIntersectGraph(Landroid/graphics/Path;)Ljava/util/List;
    .locals 4
    .param p1    # Landroid/graphics/Path;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Path;",
            ")",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/core/graph/Graph;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getChild()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/zykj/sketch/core/graph/Graph;

    .line 8
    instance-of v3, v2, Lcom/zykj/sketch/core/graph/StrokeGraph;

    if-eqz v3, :cond_0

    .line 9
    move-object v3, v2

    check-cast v3, Lcom/zykj/sketch/core/graph/StrokeGraph;

    invoke-virtual {v3, p1}, Lcom/zykj/sketch/core/graph/StrokeGraph;->isIntersect(Landroid/graphics/Path;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 10
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public getSnapshot()Lcom/zykj/sketch/GraphSnapshot$GraphData;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/Graph;->getSnapshotBuild()Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/sketch/GraphSnapshot$GraphData$Builder;->build()Lcom/zykj/sketch/GraphSnapshot$GraphData;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "getSnapshotBuild().build()"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public graphType()Lcom/zykj/sketch/GraphSnapshot$GraphType;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/sketch/GraphSnapshot$GraphType;->WRITING_GROUP_GRAPH:Lcom/zykj/sketch/GraphSnapshot$GraphType;

    .line 2
    .line 3
    return-object v0
.end method

.method public final rectConvertRegion(Landroid/graphics/Path;)Landroid/graphics/Region;
    .locals 9
    .param p1    # Landroid/graphics/Path;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/graphics/RectF;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 13
    .line 14
    .line 15
    new-instance v1, Landroid/graphics/Region;

    .line 16
    .line 17
    invoke-direct {v1}, Landroid/graphics/Region;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance v2, Landroid/graphics/Region;

    .line 21
    .line 22
    new-instance v3, Landroid/graphics/Rect;

    .line 23
    .line 24
    iget v4, v0, Landroid/graphics/RectF;->left:F

    .line 25
    .line 26
    float-to-double v4, v4

    .line 27
    invoke-static {v4, v5}, Ljava/lang/Math;->floor(D)D

    .line 28
    .line 29
    .line 30
    move-result-wide v4

    .line 31
    double-to-float v4, v4

    .line 32
    float-to-int v4, v4

    .line 33
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 34
    .line 35
    float-to-double v5, v5

    .line 36
    invoke-static {v5, v6}, Ljava/lang/Math;->floor(D)D

    .line 37
    .line 38
    .line 39
    move-result-wide v5

    .line 40
    double-to-float v5, v5

    .line 41
    float-to-int v5, v5

    .line 42
    iget v6, v0, Landroid/graphics/RectF;->right:F

    .line 43
    .line 44
    float-to-double v6, v6

    .line 45
    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    .line 46
    .line 47
    .line 48
    move-result-wide v6

    .line 49
    double-to-float v6, v6

    .line 50
    float-to-int v6, v6

    .line 51
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    .line 52
    .line 53
    float-to-double v7, v0

    .line 54
    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    .line 55
    .line 56
    .line 57
    move-result-wide v7

    .line 58
    double-to-float v0, v7

    .line 59
    float-to-int v0, v0

    .line 60
    invoke-direct {v3, v4, v5, v6, v0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 61
    .line 62
    .line 63
    invoke-direct {v2, v3}, Landroid/graphics/Region;-><init>(Landroid/graphics/Rect;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, p1, v2}, Landroid/graphics/Region;->setPath(Landroid/graphics/Path;Landroid/graphics/Region;)Z

    .line 67
    .line 68
    .line 69
    return-object v1
.end method

.method public removeGraph(Lcom/zykj/sketch/core/graph/Graph;)V
    .locals 1
    .param p1    # Lcom/zykj/sketch/core/graph/Graph;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "graph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/zykj/sketch/core/graph/Graph;->removeGraph(Lcom/zykj/sketch/core/graph/Graph;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/zykj/sketch/core/graph/BoundedContainerGraph;->onMeasure()V

    .line 10
    .line 11
    .line 12
    return-void
.end method
