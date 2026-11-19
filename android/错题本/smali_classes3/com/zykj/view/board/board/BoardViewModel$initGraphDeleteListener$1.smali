.class public final Lcom/zykj/view/board/board/BoardViewModel$initGraphDeleteListener$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/listener/GraphDeleteListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/board/BoardViewModel;->initGraphDeleteListener(Lcom/zykj/blackboard/core/edit/IPageControl;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "com/zykj/view/board/board/BoardViewModel$initGraphDeleteListener$1",
        "Lcom/zykj/blackboard/listener/GraphDeleteListener;",
        "Lcom/zykj/blackboard/core/graph/IGraph;",
        "graph",
        "Ld6/s;",
        "onGraphDelete",
        "(Lcom/zykj/blackboard/core/graph/IGraph;)V",
        "view_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/zykj/view/board/board/BoardViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/board/BoardViewModel;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel$initGraphDeleteListener$1;->this$0:Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onGraphDelete(Lcom/zykj/blackboard/core/graph/IGraph;)V
    .locals 1

    .line 1
    const-string v0, "graph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardViewModel$initGraphDeleteListener$1;->this$0:Lcom/zykj/view/board/board/BoardViewModel;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/zykj/view/board/board/BoardViewModel;->getBoardCallbackConfig()Lcom/zykj/view/board/board/BoardCallbackConfig;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/zykj/view/board/board/BoardCallbackConfig;->getOnImageDelete()Lr6/c;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    check-cast p1, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/graph/group/FileGraph;->getFilePath()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    if-nez p1, :cond_0

    .line 31
    .line 32
    const-string p1, ""

    .line 33
    .line 34
    :cond_0
    invoke-interface {v0, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    :cond_1
    return-void
.end method
