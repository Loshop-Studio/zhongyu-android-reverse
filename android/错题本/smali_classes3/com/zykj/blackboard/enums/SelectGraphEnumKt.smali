.class public final Lcom/zykj/blackboard/enums/SelectGraphEnumKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0005\u001a\u00020\u0002*\u00020\u0006\"\u0017\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0007"
    }
    d2 = {
        "allSelectGraphEnumList",
        "",
        "Lcom/zykj/blackboard/enums/SelectGraphEnum;",
        "getAllSelectGraphEnumList",
        "()Ljava/util/List;",
        "convert2SelectGraphEnum",
        "Lcom/zykj/blackboard/core/graph/IGraph;",
        "blackboard_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field private static final allSelectGraphEnumList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/enums/SelectGraphEnum;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    sget-object v0, Lcom/zykj/blackboard/enums/SelectGraphEnum;->STROKE:Lcom/zykj/blackboard/enums/SelectGraphEnum;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/blackboard/enums/SelectGraphEnum;->STROKE_HIGHLIGHTER:Lcom/zykj/blackboard/enums/SelectGraphEnum;

    .line 4
    .line 5
    sget-object v2, Lcom/zykj/blackboard/enums/SelectGraphEnum;->IMAGE:Lcom/zykj/blackboard/enums/SelectGraphEnum;

    .line 6
    .line 7
    sget-object v3, Lcom/zykj/blackboard/enums/SelectGraphEnum;->TEXT:Lcom/zykj/blackboard/enums/SelectGraphEnum;

    .line 8
    .line 9
    sget-object v4, Lcom/zykj/blackboard/enums/SelectGraphEnum;->GEOMETRY:Lcom/zykj/blackboard/enums/SelectGraphEnum;

    .line 10
    .line 11
    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/zykj/blackboard/enums/SelectGraphEnum;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lkotlin/collections/u;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lcom/zykj/blackboard/enums/SelectGraphEnumKt;->allSelectGraphEnumList:Ljava/util/List;

    .line 20
    .line 21
    return-void
.end method

.method public static final convert2SelectGraphEnum(Lcom/zykj/blackboard/core/graph/IGraph;)Lcom/zykj/blackboard/enums/SelectGraphEnum;
    .locals 2
    .param p0    # Lcom/zykj/blackboard/core/graph/IGraph;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p0, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    sget-object p0, Lcom/zykj/blackboard/enums/SelectGraphEnum;->IMAGE:Lcom/zykj/blackboard/enums/SelectGraphEnum;

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    instance-of v0, p0, Lcom/zykj/blackboard/core/graph/group/GeometryGraph;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    sget-object p0, Lcom/zykj/blackboard/enums/SelectGraphEnum;->GEOMETRY:Lcom/zykj/blackboard/enums/SelectGraphEnum;

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_1
    instance-of v0, p0, Lcom/zykj/blackboard/core/graph/group/TextGraph;

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    sget-object p0, Lcom/zykj/blackboard/enums/SelectGraphEnum;->TEXT:Lcom/zykj/blackboard/enums/SelectGraphEnum;

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_2
    invoke-interface {p0}, Lcom/zykj/blackboard/core/graph/IGraph;->getChildGraph()Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    if-eqz p0, :cond_3

    .line 32
    .line 33
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_3

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_3
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_5

    .line 49
    .line 50
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, Lcom/zykj/blackboard/core/graph/IGraph;

    .line 55
    .line 56
    instance-of v1, v0, Lcom/zykj/blackboard/core/graph/stroke/StrokeGraph;

    .line 57
    .line 58
    if-eqz v1, :cond_4

    .line 59
    .line 60
    check-cast v0, Lcom/zykj/blackboard/core/graph/stroke/StrokeGraph;

    .line 61
    .line 62
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/graph/stroke/WritingGraph;->isHighlighter()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_4

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_4
    sget-object p0, Lcom/zykj/blackboard/enums/SelectGraphEnum;->STROKE:Lcom/zykj/blackboard/enums/SelectGraphEnum;

    .line 70
    .line 71
    return-object p0

    .line 72
    :cond_5
    :goto_1
    sget-object p0, Lcom/zykj/blackboard/enums/SelectGraphEnum;->STROKE_HIGHLIGHTER:Lcom/zykj/blackboard/enums/SelectGraphEnum;

    .line 73
    .line 74
    return-object p0
.end method

.method public static final getAllSelectGraphEnumList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/enums/SelectGraphEnum;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/blackboard/enums/SelectGraphEnumKt;->allSelectGraphEnumList:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method
