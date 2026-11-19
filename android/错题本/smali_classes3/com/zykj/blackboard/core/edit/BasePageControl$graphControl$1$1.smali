.class final Lcom/zykj/blackboard/core/edit/BasePageControl$graphControl$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lr6/c;


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
        "Lr6/c;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/graph/IGraph;",
        "deleteGraph",
        "Ld6/s;",
        "invoke",
        "(Lcom/zykj/blackboard/core/graph/IGraph;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
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

    sget-object p1, Ld6/s;->a:Ld6/s;

    return-object p1
.end method

.method public final invoke(Lcom/zykj/blackboard/core/graph/IGraph;)V
    .locals 1
    .param p1    # Lcom/zykj/blackboard/core/graph/IGraph;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "deleteGraph"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
