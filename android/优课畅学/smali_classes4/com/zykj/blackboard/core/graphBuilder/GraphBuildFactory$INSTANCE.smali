.class final Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory$INSTANCE;
.super Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "INSTANCE"
.end annotation


# instance fields
.field private final buildMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/zykj/board/EzyGraphEnum$GraphEnum;",
            "Lcom/zykj/blackboard/core/graphBuilder/GraphBuild;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 3
    .line 4
    .line 5
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory$INSTANCE;->buildMap:Ljava/util/Map;

    .line 11
    .line 12
    sget-object p2, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->b:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 13
    .line 14
    new-instance v0, Lcom/zykj/blackboard/core/graphBuilder/BoundedContainerGraphBuilder;

    .line 15
    .line 16
    invoke-direct {v0}, Lcom/zykj/blackboard/core/graphBuilder/BoundedContainerGraphBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    sget-object p2, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->e:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 23
    .line 24
    new-instance v0, Lcom/zykj/blackboard/core/graphBuilder/StrokeGraphBuilder;

    .line 25
    .line 26
    invoke-direct {v0}, Lcom/zykj/blackboard/core/graphBuilder/StrokeGraphBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    sget-object p2, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->f:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 33
    .line 34
    new-instance v0, Lcom/zykj/blackboard/core/graphBuilder/BeelineStrokeGraphBuilder;

    .line 35
    .line 36
    invoke-direct {v0}, Lcom/zykj/blackboard/core/graphBuilder/BeelineStrokeGraphBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    sget-object p2, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->d:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 43
    .line 44
    new-instance v0, Lcom/zykj/blackboard/core/graphBuilder/ImageGraphBuilder;

    .line 45
    .line 46
    invoke-direct {v0}, Lcom/zykj/blackboard/core/graphBuilder/ImageGraphBuilder;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    sget-object p2, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->c:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 53
    .line 54
    new-instance v0, Lcom/zykj/blackboard/core/graphBuilder/GroupGraphBuilder;

    .line 55
    .line 56
    invoke-direct {v0}, Lcom/zykj/blackboard/core/graphBuilder/GroupGraphBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    sget-object p2, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->g:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 63
    .line 64
    new-instance v0, Lcom/zykj/blackboard/core/graphBuilder/TextGraphBuilder;

    .line 65
    .line 66
    invoke-direct {v0}, Lcom/zykj/blackboard/core/graphBuilder/TextGraphBuilder;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    sget-object p2, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->h:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 73
    .line 74
    new-instance v0, Lcom/zykj/blackboard/core/graphBuilder/GeometryGraphBuilder;

    .line 75
    .line 76
    invoke-direct {v0}, Lcom/zykj/blackboard/core/graphBuilder/GeometryGraphBuilder;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    return-void
.end method


# virtual methods
.method public parse(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;Lcom/zykj/blackboard/core/loader/SourceLoader;)Lcom/zykj/blackboard/core/graph/Graph;
    .locals 2

    .line 1
    const-string v0, "graphData"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "sourceLoad"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory$INSTANCE;->buildMap:Ljava/util/Map;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->s()Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lcom/zykj/blackboard/core/graphBuilder/GraphBuild;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-interface {v0, p1, p2}, Lcom/zykj/blackboard/core/graphBuilder/GraphBuild;->build(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;Lcom/zykj/blackboard/core/loader/SourceLoader;)Lcom/zykj/blackboard/core/graph/Graph;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1

    .line 30
    :cond_0
    const/4 p1, 0x0

    .line 31
    return-object p1
.end method
