.class public final Lcom/zykj/blackboard/utils/GraphHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\'\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\t0\u0008\"\u00020\t\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/zykj/blackboard/utils/GraphHelper;",
        "",
        "()V",
        "createStrokeGraph",
        "Lcom/zykj/blackboard/core/graph/stroke/StrokeGraph;",
        "sourceLoader",
        "Lcom/zykj/blackboard/core/loader/SourceLoader;",
        "points",
        "",
        "Landroid/graphics/PointF;",
        "(Lcom/zykj/blackboard/core/loader/SourceLoader;[Landroid/graphics/PointF;)Lcom/zykj/blackboard/core/graph/stroke/StrokeGraph;",
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


# static fields
.field public static final INSTANCE:Lcom/zykj/blackboard/utils/GraphHelper;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/blackboard/utils/GraphHelper;

    invoke-direct {v0}, Lcom/zykj/blackboard/utils/GraphHelper;-><init>()V

    sput-object v0, Lcom/zykj/blackboard/utils/GraphHelper;->INSTANCE:Lcom/zykj/blackboard/utils/GraphHelper;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final varargs createStrokeGraph(Lcom/zykj/blackboard/core/loader/SourceLoader;[Landroid/graphics/PointF;)Lcom/zykj/blackboard/core/graph/stroke/StrokeGraph;
    .locals 9
    .param p1    # Lcom/zykj/blackboard/core/loader/SourceLoader;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # [Landroid/graphics/PointF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "sourceLoader"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "points"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p2}, Lkotlin/collections/q;->R([Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Landroid/graphics/PointF;

    .line 16
    .line 17
    new-instance v1, Landroid/graphics/Path;

    .line 18
    .line 19
    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    .line 20
    .line 21
    .line 22
    iget v2, v0, Landroid/graphics/PointF;->x:F

    .line 23
    .line 24
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 25
    .line 26
    invoke-virtual {v1, v2, v0}, Landroid/graphics/Path;->moveTo(FF)V

    .line 27
    .line 28
    .line 29
    array-length v0, p2

    .line 30
    const/4 v2, 0x0

    .line 31
    :goto_0
    if-ge v2, v0, :cond_0

    .line 32
    .line 33
    aget-object v3, p2, v2

    .line 34
    .line 35
    iget v4, v3, Landroid/graphics/PointF;->x:F

    .line 36
    .line 37
    iget v3, v3, Landroid/graphics/PointF;->y:F

    .line 38
    .line 39
    invoke-virtual {v1, v4, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 40
    .line 41
    .line 42
    add-int/lit8 v2, v2, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    new-instance v5, Landroid/graphics/RectF;

    .line 46
    .line 47
    invoke-direct {v5}, Landroid/graphics/RectF;-><init>()V

    .line 48
    .line 49
    .line 50
    const/4 p2, 0x1

    .line 51
    invoke-virtual {v1, v5, p2}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 52
    .line 53
    .line 54
    new-instance v3, Lcom/zykj/blackboard/core/graph/stroke/StrokeGraph;

    .line 55
    .line 56
    const-string v7, ""

    .line 57
    .line 58
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object v8

    .line 62
    const-string v4, ""

    .line 63
    .line 64
    move-object v6, p1

    .line 65
    invoke-direct/range {v3 .. v8}, Lcom/zykj/blackboard/core/graph/stroke/StrokeGraph;-><init>(Ljava/lang/String;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/loader/SourceLoader;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3, v1}, Lcom/zykj/blackboard/core/graph/stroke/WritingGraph;->updatePath(Landroid/graphics/Path;)V

    .line 69
    .line 70
    .line 71
    return-object v3
.end method
