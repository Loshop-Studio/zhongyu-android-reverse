.class final Lcom/zykj/sketch/core/ActionExecute$buildHistoryGraph$6$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/sketch/core/ActionExecute;->buildHistoryGraph(Lcom/zykj/sketch/GraphSnapshot$GraphData;)Lcom/zykj/sketch/core/graph/Graph;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lx7/l;"
    }
.end annotation


# instance fields
.field final synthetic $this_apply:Lcom/zykj/sketch/core/graph/StrokeGraph;

.field final synthetic $touchData:Lcom/zykj/sketch/GraphSnapshot$Touch;


# direct methods
.method public constructor <init>(Lcom/zykj/sketch/GraphSnapshot$Touch;Lcom/zykj/sketch/core/graph/StrokeGraph;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/sketch/core/ActionExecute$buildHistoryGraph$6$1;->$touchData:Lcom/zykj/sketch/GraphSnapshot$Touch;

    iput-object p2, p0, Lcom/zykj/sketch/core/ActionExecute$buildHistoryGraph$6$1;->$this_apply:Lcom/zykj/sketch/core/graph/StrokeGraph;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/sketch/core/graph/Graph;

    invoke-virtual {p0, p1}, Lcom/zykj/sketch/core/ActionExecute$buildHistoryGraph$6$1;->invoke(Lcom/zykj/sketch/core/graph/Graph;)V

    sget-object p1, Lh7/p;->a:Lh7/p;

    return-object p1
.end method

.method public final invoke(Lcom/zykj/sketch/core/graph/Graph;)V
    .locals 4

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Lcom/zykj/sketch/core/ActionExecute$buildHistoryGraph$6$1;->$touchData:Lcom/zykj/sketch/GraphSnapshot$Touch;

    invoke-virtual {p1}, Lcom/zykj/sketch/GraphSnapshot$Touch;->getPointFList()Ljava/util/List;

    move-result-object p1

    const-string v0, "touchData.pointFList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/zykj/sketch/core/ActionExecute$buildHistoryGraph$6$1;->$this_apply:Lcom/zykj/sketch/core/graph/StrokeGraph;

    .line 3
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/zykj/sketch/GraphSnapshot$PointF;

    .line 4
    new-instance v2, Landroid/graphics/PointF;

    invoke-virtual {v1}, Lcom/zykj/sketch/GraphSnapshot$PointF;->getX()F

    move-result v3

    invoke-virtual {v1}, Lcom/zykj/sketch/GraphSnapshot$PointF;->getY()F

    move-result v1

    invoke-direct {v2, v3, v1}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-virtual {v0, v2}, Lcom/zykj/sketch/core/graph/StrokeGraph;->addFPPoint(Landroid/graphics/PointF;)V

    goto :goto_0

    :cond_0
    return-void
.end method
