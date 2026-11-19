.class public final synthetic Lcom/zykj/blackboard/core/action/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/blackboard/core/action/IActionListener;

.field public final synthetic b:Lcom/zykj/blackboard/core/action/BaseWriteAction;

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Lcom/zykj/blackboard/core/graph/IGraph;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Lcom/zykj/blackboard/core/graph/Graph;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/blackboard/core/action/IActionListener;Lcom/zykj/blackboard/core/action/BaseWriteAction;Ljava/util/List;Lcom/zykj/blackboard/core/graph/IGraph;Ljava/lang/String;Lcom/zykj/blackboard/core/graph/Graph;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/blackboard/core/action/a;->a:Lcom/zykj/blackboard/core/action/IActionListener;

    iput-object p2, p0, Lcom/zykj/blackboard/core/action/a;->b:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    iput-object p3, p0, Lcom/zykj/blackboard/core/action/a;->c:Ljava/util/List;

    iput-object p4, p0, Lcom/zykj/blackboard/core/action/a;->d:Lcom/zykj/blackboard/core/graph/IGraph;

    iput-object p5, p0, Lcom/zykj/blackboard/core/action/a;->e:Ljava/lang/String;

    iput-object p6, p0, Lcom/zykj/blackboard/core/action/a;->f:Lcom/zykj/blackboard/core/graph/Graph;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/a;->a:Lcom/zykj/blackboard/core/action/IActionListener;

    iget-object v1, p0, Lcom/zykj/blackboard/core/action/a;->b:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    iget-object v2, p0, Lcom/zykj/blackboard/core/action/a;->c:Ljava/util/List;

    iget-object v3, p0, Lcom/zykj/blackboard/core/action/a;->d:Lcom/zykj/blackboard/core/graph/IGraph;

    iget-object v4, p0, Lcom/zykj/blackboard/core/action/a;->e:Ljava/lang/String;

    iget-object v5, p0, Lcom/zykj/blackboard/core/action/a;->f:Lcom/zykj/blackboard/core/graph/Graph;

    invoke-static/range {v0 .. v5}, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->a(Lcom/zykj/blackboard/core/action/IActionListener;Lcom/zykj/blackboard/core/action/BaseWriteAction;Ljava/util/List;Lcom/zykj/blackboard/core/graph/IGraph;Ljava/lang/String;Lcom/zykj/blackboard/core/graph/Graph;)V

    return-void
.end method
