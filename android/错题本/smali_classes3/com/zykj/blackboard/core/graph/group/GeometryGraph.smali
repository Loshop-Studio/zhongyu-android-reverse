# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/blackboard/core/graph/group/GeometryGraph;
.super Lcom/zykj/blackboard/core/graph/group/GroupGraph;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0019\u0010\u001d\u001a\u00020\u00042\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0012H\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016\u00a2\u0006\u0004\u0008 \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016\u00a2\u0006\u0004\u0008#\u0010$J\u0013\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020&0%\u00a2\u0006\u0004\u0008\'\u0010(R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010)R$\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010*\u001a\u0004\u0008+\u0010,\"\u0004\u0008-\u0010.R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\n\u0010/\u001a\u0004\u00080\u00101\"\u0004\u00082\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00085\u00106R:\u00108\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%2\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010%8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00088\u00109\u001a\u0004\u0008:\u0010(\"\u0004\u0008;\u0010<R$\u0010=\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008=\u0010/\u001a\u0004\u0008>\u00101\"\u0004\u0008?\u00103R.\u0010A\u001a\u0004\u0018\u00010@2\u0008\u00107\u001a\u0004\u0018\u00010@8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008A\u0010B\u001a\u0004\u0008C\u0010D\"\u0004\u0008E\u0010F\u00a8\u0006G"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/graph/group/GeometryGraph;",
        "Lcom/zykj/blackboard/core/graph/group/GroupGraph;",
        "",
        "id",
        "Landroid/graphics/RectF;",
        "outRectF",
        "Lcom/zykj/blackboard/core/loader/SourceLoader;",
        "sourceLoader",
        "sourceFileName",
        "",
        "sourceId",
        "<init>",
        "(Ljava/lang/String;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/loader/SourceLoader;Ljava/lang/String;Ljava/lang/Integer;)V",
        "Ld6/s;",
        "initData",
        "()V",
        "Landroid/graphics/Canvas;",
        "canvas",
        "Landroid/graphics/Matrix;",
        "matrix",
        "render",
        "(Landroid/graphics/Canvas;Landroid/graphics/Matrix;)V",
        "Lcom/zykj/board/EzyGraphEnum$GraphEnum;",
        "graphType",
        "()Lcom/zykj/board/EzyGraphEnum$GraphEnum;",
        "newRectF",
        "changeOriginalRectF",
        "(Landroid/graphics/RectF;)V",
        "adapterMatrix",
        "getMinOutRectF",
        "(Landroid/graphics/Matrix;)Landroid/graphics/RectF;",
        "Lcom/zykj/board/d0;",
        "getSnapshot",
        "()Lcom/zykj/board/d0;",
        "Lcom/zykj/blackboard/core/graph/Graph;",
        "copy",
        "()Lcom/zykj/blackboard/core/graph/Graph;",
        "",
        "Landroid/graphics/PointF;",
        "getMovePointFList",
        "()Ljava/util/List;",
        "Lcom/zykj/blackboard/core/loader/SourceLoader;",
        "Ljava/lang/String;",
        "getSourceFileName",
        "()Ljava/lang/String;",
        "setSourceFileName",
        "(Ljava/lang/String;)V",
        "Ljava/lang/Integer;",
        "getSourceId",
        "()Ljava/lang/Integer;",
        "setSourceId",
        "(Ljava/lang/Integer;)V",
        "Landroid/graphics/Path;",
        "tempPath",
        "Landroid/graphics/Path;",
        "value",
        "pointList",
        "Ljava/util/List;",
        "getPointList",
        "setPointList",
        "(Ljava/util/List;)V",
        "geometryType",
        "getGeometryType",
        "setGeometryType",
        "Landroid/graphics/Paint;",
        "paint",
        "Landroid/graphics/Paint;",
        "getPaint",
        "()Landroid/graphics/Paint;",
        "setPaint",
        "(Landroid/graphics/Paint;)V",
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


# instance fields
.field private geometryType:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private paint:Landroid/graphics/Paint;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private pointList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private sourceFileName:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private sourceId:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final sourceLoader:Lcom/zykj/blackboard/core/loader/SourceLoader;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final tempPath:Landroid/graphics/Path;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/loader/SourceLoader;Ljava/lang/String;Ljava/lang/Integer;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/zykj/blackboard/core/loader/SourceLoader;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "outRectF"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2, p4, p5}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;-><init>(Ljava/lang/String;Landroid/graphics/RectF;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 3
    iput-object p3, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->sourceLoader:Lcom/zykj/blackboard/core/loader/SourceLoader;

    .line 4
    iput-object p4, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->sourceFileName:Ljava/lang/String;

    .line 5
    iput-object p5, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->sourceId:Ljava/lang/Integer;

    .line 6
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->tempPath:Landroid/graphics/Path;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/loader/SourceLoader;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/e;)V
    .locals 1

    and-int/lit8 p7, p6, 0x4

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_1

    move-object p4, v0

    :cond_1
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_2

    move-object p6, v0

    :goto_0
    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_2
    move-object p6, p5

    goto :goto_0

    .line 1
    :goto_1
    invoke-direct/range {p1 .. p6}, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;-><init>(Ljava/lang/String;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/loader/SourceLoader;Ljava/lang/String;Ljava/lang/Integer;)V

    return-void
.end method

.method private final initData()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->sourceLoader:Lcom/zykj/blackboard/core/loader/SourceLoader;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->getSourceFileName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->getSourceId()Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-static {v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-interface {v0, v1, v2}, Lcom/zykj/blackboard/core/loader/SourceLoader;->getGeometryCache(Ljava/lang/String;I)Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    iget-object v1, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->geometryType:Ljava/lang/Integer;

    .line 30
    .line 31
    if-nez v1, :cond_0

    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->getGeometryTypeValue()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iput-object v1, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->geometryType:Ljava/lang/Integer;

    .line 42
    .line 43
    :cond_0
    iget-object v1, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->pointList:Ljava/util/List;

    .line 44
    .line 45
    if-nez v1, :cond_2

    .line 46
    .line 47
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->getPointsList()Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    const-string v2, "it.pointsList"

    .line 52
    .line 53
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    new-instance v2, Ljava/util/ArrayList;

    .line 57
    .line 58
    const/16 v3, 0xa

    .line 59
    .line 60
    invoke-static {v1, v3}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 65
    .line 66
    .line 67
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-eqz v3, :cond_1

    .line 76
    .line 77
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    check-cast v3, Lcom/zykj/board/EzyPointF$PointF;

    .line 82
    .line 83
    const-string v4, "it"

    .line 84
    .line 85
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-static {v3}, Lcom/zykj/blackboard/utils/GraphUtilsKt;->covertPointF(Lcom/zykj/board/EzyPointF$PointF;)Landroid/graphics/PointF;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_1
    invoke-virtual {p0, v2}, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->setPointList(Ljava/util/List;)V

    .line 97
    .line 98
    .line 99
    :cond_2
    iget-object v1, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->paint:Landroid/graphics/Paint;

    .line 100
    .line 101
    if-nez v1, :cond_3

    .line 102
    .line 103
    invoke-virtual {v0}, Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;->getPaint()Lcom/zykj/board/EzyPaint$Paint;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    const-string v1, "it.paint"

    .line 108
    .line 109
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-static {v0}, Lcom/zykj/blackboard/utils/GraphUtilsKt;->covertPaint(Lcom/zykj/board/EzyPaint$Paint;)Landroid/graphics/Paint;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 117
    .line 118
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 119
    .line 120
    .line 121
    sget-object v1, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 122
    .line 123
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0, v0}, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->setPaint(Landroid/graphics/Paint;)V

    .line 127
    .line 128
    .line 129
    :cond_3
    return-void
.end method


# virtual methods
.method public changeOriginalRectF(Landroid/graphics/RectF;)V
    .locals 3
    .param p1    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "newRectF"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/graphics/RectF;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/Graph;->getOriginalRectF()Landroid/graphics/RectF;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-direct {v0, v1}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 13
    .line 14
    .line 15
    invoke-super {p0, p1}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->changeOriginalRectF(Landroid/graphics/RectF;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->geometryType:Ljava/lang/Integer;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    iget-object v1, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->pointList:Ljava/util/List;

    .line 23
    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    :cond_0
    invoke-direct {p0}, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->initData()V

    .line 27
    .line 28
    .line 29
    :cond_1
    iget-object v1, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->geometryType:Ljava/lang/Integer;

    .line 30
    .line 31
    if-nez v1, :cond_2

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    const/4 v2, 0x1

    .line 39
    if-ne v1, v2, :cond_3

    .line 40
    .line 41
    new-instance v1, Landroid/graphics/Matrix;

    .line 42
    .line 43
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 44
    .line 45
    .line 46
    sget-object v2, Landroid/graphics/Matrix$ScaleToFit;->FILL:Landroid/graphics/Matrix$ScaleToFit;

    .line 47
    .line 48
    invoke-virtual {v1, v0, p1, v2}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->pointList:Ljava/util/List;

    .line 52
    .line 53
    if-eqz p1, :cond_3

    .line 54
    .line 55
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-eqz v0, :cond_3

    .line 64
    .line 65
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    check-cast v0, Landroid/graphics/PointF;

    .line 70
    .line 71
    sget-object v2, Lcom/zykj/blackboard/utils/PointUtils;->INSTANCE:Lcom/zykj/blackboard/utils/PointUtils;

    .line 72
    .line 73
    invoke-virtual {v2, v0, v1}, Lcom/zykj/blackboard/utils/PointUtils;->mapPoint(Landroid/graphics/PointF;Landroid/graphics/Matrix;)Landroid/graphics/PointF;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v0, v2}, Landroid/graphics/PointF;->set(Landroid/graphics/PointF;)V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_3
    :goto_1
    return-void
.end method

.method public copy()Lcom/zykj/blackboard/core/graph/Graph;
    .locals 6
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/Graph;->getId()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    new-instance v2, Landroid/graphics/RectF;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/Graph;->getOriginalRectF()Landroid/graphics/RectF;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-direct {v2, v3}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 14
    .line 15
    .line 16
    iget-object v3, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->sourceLoader:Lcom/zykj/blackboard/core/loader/SourceLoader;

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->getSourceFileName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->getSourceId()Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    invoke-direct/range {v0 .. v5}, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;-><init>(Ljava/lang/String;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/loader/SourceLoader;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->geometryType:Ljava/lang/Integer;

    .line 30
    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iput-object v1, v0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->geometryType:Ljava/lang/Integer;

    .line 42
    .line 43
    :cond_0
    iget-object v1, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->pointList:Ljava/util/List;

    .line 44
    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    new-instance v2, Ljava/util/ArrayList;

    .line 48
    .line 49
    const/16 v3, 0xa

    .line 50
    .line 51
    invoke-static {v1, v3}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 56
    .line 57
    .line 58
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_1

    .line 67
    .line 68
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    check-cast v3, Landroid/graphics/PointF;

    .line 73
    .line 74
    new-instance v4, Landroid/graphics/PointF;

    .line 75
    .line 76
    iget v5, v3, Landroid/graphics/PointF;->x:F

    .line 77
    .line 78
    iget v3, v3, Landroid/graphics/PointF;->y:F

    .line 79
    .line 80
    invoke-direct {v4, v5, v3}, Landroid/graphics/PointF;-><init>(FF)V

    .line 81
    .line 82
    .line 83
    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_1
    invoke-virtual {v0, v2}, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->setPointList(Ljava/util/List;)V

    .line 88
    .line 89
    .line 90
    :cond_2
    iget-object v1, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->paint:Landroid/graphics/Paint;

    .line 91
    .line 92
    if-eqz v1, :cond_3

    .line 93
    .line 94
    new-instance v2, Landroid/graphics/Paint;

    .line 95
    .line 96
    invoke-direct {v2, v1}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v2}, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->setPaint(Landroid/graphics/Paint;)V

    .line 100
    .line 101
    .line 102
    :cond_3
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/Graph;->getRenderMatrix()Landroid/graphics/Matrix;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/graph/Graph;->initMatrix(Landroid/graphics/Matrix;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/Graph;->getChildGraph()Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    if-eqz v2, :cond_4

    .line 122
    .line 123
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    check-cast v2, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 128
    .line 129
    invoke-interface {v2}, Lcom/zykj/blackboard/core/graph/IGraph;->copy()Lcom/zykj/blackboard/core/graph/Graph;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    invoke-virtual {v0, v2}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->addGraph(Lcom/zykj/blackboard/core/graph/IGraph;)V

    .line 134
    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_4
    return-object v0
.end method

.method public final getGeometryType()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->geometryType:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMinOutRectF(Landroid/graphics/Matrix;)Landroid/graphics/RectF;
    .locals 3
    .param p1    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/Graph;->getOriginalRectF()Landroid/graphics/RectF;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/graphics/RectF;-><init>(Landroid/graphics/RectF;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Landroid/graphics/Matrix;

    .line 11
    .line 12
    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/Graph;->getRenderMatrix()Landroid/graphics/Matrix;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 20
    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v1, p1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->paint:Landroid/graphics/Paint;

    .line 31
    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    const/4 v1, 0x2

    .line 39
    int-to-float v1, v1

    .line 40
    div-float/2addr p1, v1

    .line 41
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 42
    .line 43
    sub-float/2addr v1, p1

    .line 44
    iput v1, v0, Landroid/graphics/RectF;->left:F

    .line 45
    .line 46
    iget v1, v0, Landroid/graphics/RectF;->top:F

    .line 47
    .line 48
    sub-float/2addr v1, p1

    .line 49
    iput v1, v0, Landroid/graphics/RectF;->top:F

    .line 50
    .line 51
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 52
    .line 53
    add-float/2addr v1, p1

    .line 54
    iput v1, v0, Landroid/graphics/RectF;->right:F

    .line 55
    .line 56
    iget v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 57
    .line 58
    add-float/2addr v1, p1

    .line 59
    iput v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 60
    .line 61
    :cond_1
    return-object v0
.end method

.method public final getMovePointFList()Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->geometryType:Ljava/lang/Integer;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->pointList:Ljava/util/List;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    :cond_0
    invoke-direct {p0}, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->initData()V

    .line 10
    .line 11
    .line 12
    :cond_1
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->geometryType:Ljava/lang/Integer;

    .line 13
    .line 14
    if-eqz v0, :cond_6

    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->pointList:Ljava/util/List;

    .line 17
    .line 18
    if-nez v0, :cond_2

    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->geometryType:Ljava/lang/Integer;

    .line 27
    .line 28
    if-nez v1, :cond_3

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_3
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    const/4 v2, 0x1

    .line 36
    if-ne v1, v2, :cond_5

    .line 37
    .line 38
    iget-object v1, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->pointList:Ljava/util/List;

    .line 39
    .line 40
    if-eqz v1, :cond_5

    .line 41
    .line 42
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    const/4 v2, 0x3

    .line 47
    if-ne v1, v2, :cond_5

    .line 48
    .line 49
    new-instance v1, Landroid/graphics/PointF;

    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/Graph;->getOriginalRectF()Landroid/graphics/RectF;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    iget v2, v2, Landroid/graphics/RectF;->left:F

    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/Graph;->getOriginalRectF()Landroid/graphics/RectF;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    iget v3, v3, Landroid/graphics/RectF;->bottom:F

    .line 62
    .line 63
    invoke-direct {v1, v2, v3}, Landroid/graphics/PointF;-><init>(FF)V

    .line 64
    .line 65
    .line 66
    new-instance v2, Landroid/graphics/PointF;

    .line 67
    .line 68
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/Graph;->getOriginalRectF()Landroid/graphics/RectF;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    iget v3, v3, Landroid/graphics/RectF;->right:F

    .line 73
    .line 74
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/Graph;->getOriginalRectF()Landroid/graphics/RectF;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    .line 79
    .line 80
    invoke-direct {v2, v3, v4}, Landroid/graphics/PointF;-><init>(FF)V

    .line 81
    .line 82
    .line 83
    iget-object v3, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->pointList:Ljava/util/List;

    .line 84
    .line 85
    if-eqz v3, :cond_5

    .line 86
    .line 87
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    :cond_4
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    if-eqz v4, :cond_5

    .line 96
    .line 97
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    check-cast v4, Landroid/graphics/PointF;

    .line 102
    .line 103
    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    if-nez v5, :cond_4

    .line 108
    .line 109
    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    if-nez v5, :cond_4

    .line 114
    .line 115
    new-instance v5, Landroid/graphics/PointF;

    .line 116
    .line 117
    iget v6, v4, Landroid/graphics/PointF;->x:F

    .line 118
    .line 119
    iget v4, v4, Landroid/graphics/PointF;->y:F

    .line 120
    .line 121
    invoke-direct {v5, v6, v4}, Landroid/graphics/PointF;-><init>(FF)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_5
    :goto_1
    return-object v0

    .line 129
    :cond_6
    :goto_2
    sget-object v0, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 130
    .line 131
    return-object v0
.end method

.method public final getPaint()Landroid/graphics/Paint;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->paint:Landroid/graphics/Paint;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getPointList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroid/graphics/PointF;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->pointList:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSnapshot()Lcom/zykj/board/d0;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-super {p0}, Lcom/zykj/blackboard/core/graph/root/BoundedContainerGraph;->getSnapshot()Lcom/zykj/board/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->paint:Landroid/graphics/Paint;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const/high16 v2, 0x3f800000    # 1.0f

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-static {v1, v2, v3}, Lcom/zykj/blackboard/utils/GraphUtilsKt;->covertEzyPaint(Landroid/graphics/Paint;FF)Lcom/zykj/board/EzyPaint$Paint;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Lcom/zykj/board/d0;->n(Lcom/zykj/board/EzyPaint$Paint;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v1, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->pointList:Ljava/util/List;

    .line 20
    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_2

    .line 32
    .line 33
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Landroid/graphics/PointF;

    .line 38
    .line 39
    invoke-static {v2}, Lcom/zykj/blackboard/utils/GraphUtilsKt;->covertEzyPointF(Landroid/graphics/PointF;)Lcom/zykj/board/EzyPointF$PointF;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    iget-object v3, v0, Lcom/zykj/board/d0;->q:Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 44
    .line 45
    if-nez v3, :cond_1

    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Lcom/zykj/board/d0;->g()V

    .line 51
    .line 52
    .line 53
    iget-object v3, v0, Lcom/zykj/board/d0;->p:Ljava/util/List;

    .line 54
    .line 55
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Lcom/google/protobuf/GeneratedMessageV3$Builder;->onChanged()V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    invoke-virtual {v3, v2}, Lcom/google/protobuf/RepeatedFieldBuilderV3;->addMessage(Lcom/google/protobuf/AbstractMessage;)Lcom/google/protobuf/RepeatedFieldBuilderV3;

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    return-object v0
.end method

.method public getSourceFileName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->sourceFileName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSourceId()Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->sourceId:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method

.method public graphType()Lcom/zykj/board/EzyGraphEnum$GraphEnum;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->GEOMETRY_GRAPH:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 2
    .line 3
    return-object v0
.end method

.method public render(Landroid/graphics/Canvas;Landroid/graphics/Matrix;)V
    .locals 5
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "matrix"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->geometryType:Ljava/lang/Integer;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->pointList:Ljava/util/List;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->paint:Landroid/graphics/Paint;

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    :cond_0
    invoke-direct {p0}, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->initData()V

    .line 24
    .line 25
    .line 26
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->getTempMatrix()Landroid/graphics/Matrix;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->getTempMatrix()Landroid/graphics/Matrix;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/Graph;->getRenderMatrix()Landroid/graphics/Matrix;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->getTempMatrix()Landroid/graphics/Matrix;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0, p2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 49
    .line 50
    .line 51
    iget-object p2, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->paint:Landroid/graphics/Paint;

    .line 52
    .line 53
    if-eqz p2, :cond_9

    .line 54
    .line 55
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->tempPath:Landroid/graphics/Path;

    .line 56
    .line 57
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->geometryType:Ljava/lang/Integer;

    .line 61
    .line 62
    if-nez v0, :cond_2

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-nez v1, :cond_3

    .line 70
    .line 71
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->tempPath:Landroid/graphics/Path;

    .line 72
    .line 73
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/Graph;->getOriginalRectF()Landroid/graphics/RectF;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    sget-object v2, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 78
    .line 79
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->addOval(Landroid/graphics/RectF;Landroid/graphics/Path$Direction;)V

    .line 80
    .line 81
    .line 82
    goto :goto_3

    .line 83
    :cond_3
    :goto_0
    if-nez v0, :cond_4

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    const/4 v1, 0x1

    .line 91
    if-ne v0, v1, :cond_8

    .line 92
    .line 93
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->pointList:Ljava/util/List;

    .line 94
    .line 95
    if-eqz v0, :cond_7

    .line 96
    .line 97
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    const/4 v1, 0x0

    .line 102
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-eqz v2, :cond_7

    .line 107
    .line 108
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    add-int/lit8 v3, v1, 0x1

    .line 113
    .line 114
    if-ltz v1, :cond_6

    .line 115
    .line 116
    check-cast v2, Landroid/graphics/PointF;

    .line 117
    .line 118
    if-nez v1, :cond_5

    .line 119
    .line 120
    iget-object v1, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->tempPath:Landroid/graphics/Path;

    .line 121
    .line 122
    iget v4, v2, Landroid/graphics/PointF;->x:F

    .line 123
    .line 124
    iget v2, v2, Landroid/graphics/PointF;->y:F

    .line 125
    .line 126
    invoke-virtual {v1, v4, v2}, Landroid/graphics/Path;->moveTo(FF)V

    .line 127
    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_5
    iget-object v1, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->tempPath:Landroid/graphics/Path;

    .line 131
    .line 132
    iget v4, v2, Landroid/graphics/PointF;->x:F

    .line 133
    .line 134
    iget v2, v2, Landroid/graphics/PointF;->y:F

    .line 135
    .line 136
    invoke-virtual {v1, v4, v2}, Landroid/graphics/Path;->lineTo(FF)V

    .line 137
    .line 138
    .line 139
    :goto_2
    move v1, v3

    .line 140
    goto :goto_1

    .line 141
    :cond_6
    invoke-static {}, Lkotlin/collections/u;->L()V

    .line 142
    .line 143
    .line 144
    const/4 p1, 0x0

    .line 145
    throw p1

    .line 146
    :cond_7
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->tempPath:Landroid/graphics/Path;

    .line 147
    .line 148
    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    .line 149
    .line 150
    .line 151
    :cond_8
    :goto_3
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->tempPath:Landroid/graphics/Path;

    .line 152
    .line 153
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->getTempMatrix()Landroid/graphics/Matrix;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    invoke-virtual {v0, v1}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    .line 158
    .line 159
    .line 160
    iget-object v0, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->tempPath:Landroid/graphics/Path;

    .line 161
    .line 162
    invoke-virtual {p1, v0, p2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 163
    .line 164
    .line 165
    :cond_9
    return-void
.end method

.method public final setGeometryType(Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->geometryType:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public final setPaint(Landroid/graphics/Paint;)V
    .locals 0
    .param p1    # Landroid/graphics/Paint;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->paint:Landroid/graphics/Paint;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->setNeedUpdate(Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final setPointList(Ljava/util/List;)V
    .locals 0
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroid/graphics/PointF;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->pointList:Ljava/util/List;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/graph/group/GroupGraph;->setNeedUpdate(Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public setSourceFileName(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->sourceFileName:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setSourceId(Ljava/lang/Integer;)V
    .locals 0
    .param p1    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;->sourceId:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method
