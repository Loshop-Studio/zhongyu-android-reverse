.class final Lcom/zykj/blackboard/core/edit/BasePageControl$graphControl$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/edit/BasePageControl;-><init>(Lcom/zykj/blackboard/core/edit/BoardControl;Lcom/zykj/blackboard/core/canvas/view/RenderLayer;Lcom/zykj/blackboard/core/data/dao/PageEntity;)V
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
.field final synthetic this$0:Lcom/zykj/blackboard/core/edit/BasePageControl;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/edit/BasePageControl;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl$graphControl$1$1;->this$0:Lcom/zykj/blackboard/core/edit/BasePageControl;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/blackboard/core/graph/IGraph;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/edit/BasePageControl$graphControl$1$1;->invoke(Lcom/zykj/blackboard/core/graph/IGraph;)V

    sget-object p1, Lh7/p;->a:Lh7/p;

    return-object p1
.end method

.method public final invoke(Lcom/zykj/blackboard/core/graph/IGraph;)V
    .locals 1

    const-string v0, "deleteGraph"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    instance-of v0, p1, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl$graphControl$1$1;->this$0:Lcom/zykj/blackboard/core/edit/BasePageControl;

    invoke-interface {v0}, Lcom/zykj/blackboard/core/edit/IPageControl;->isRecording()Z

    move-result v0

    if-nez v0, :cond_1

    .line 3
    check-cast p1, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    invoke-virtual {p1}, Lcom/zykj/blackboard/core/graph/group/FileGraph;->getFilePath()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 4
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/graph/group/FileGraph;->initPath()V

    .line 5
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/graph/group/FileGraph;->getFilePath()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl$graphControl$1$1;->this$0:Lcom/zykj/blackboard/core/edit/BasePageControl;

    .line 6
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getNoRecordingImageList()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method
