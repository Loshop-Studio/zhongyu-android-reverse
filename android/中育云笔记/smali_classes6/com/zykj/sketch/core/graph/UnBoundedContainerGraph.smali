.class public final Lcom/zykj/sketch/core/graph/UnBoundedContainerGraph;
.super Lcom/zykj/sketch/core/graph/Graph;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/zykj/sketch/core/listener/IControl;)V
    .locals 1

    .line 1
    const-string v0, "control"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/zykj/sketch/core/graph/Graph;-><init>(Lcom/zykj/sketch/core/listener/IControl;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public getSnapshot()Lcom/zykj/sketch/GraphSnapshot$GraphData;
    .locals 2

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
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public graphType()Lcom/zykj/sketch/GraphSnapshot$GraphType;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/sketch/GraphSnapshot$GraphType;->UNBOUNDED_CONTAINER_GRAPH:Lcom/zykj/sketch/GraphSnapshot$GraphType;

    .line 2
    .line 3
    return-object v0
.end method

.method public isInRect(FFF)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onMeasure()V
    .locals 0

    return-void
.end method
