.class final Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->loadData(Ljava/lang/String;Lr6/c;Lr6/c;)V
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
        "Lcom/zykj/blackboard/core/play/IPlayControl;",
        "it",
        "Ld6/s;",
        "invoke",
        "(Lcom/zykj/blackboard/core/play/IPlayControl;)V",
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
.field final synthetic $onFailure:Lr6/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/c;"
        }
    .end annotation
.end field

.field final synthetic $onSuccess:Lr6/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/c;"
        }
    .end annotation
.end field

.field final synthetic $path:Ljava/lang/String;

.field final synthetic this$0:Lcom/zykj/merge/sketch/view/BlackBoardProxyView;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/zykj/merge/sketch/view/BlackBoardProxyView;Lr6/c;Lr6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/zykj/merge/sketch/view/BlackBoardProxyView;",
            "Lr6/c;",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1;->$path:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1;->this$0:Lcom/zykj/merge/sketch/view/BlackBoardProxyView;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1;->$onSuccess:Lr6/c;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1;->$onFailure:Lr6/c;

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/blackboard/core/play/IPlayControl;

    invoke-virtual {p0, p1}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1;->invoke(Lcom/zykj/blackboard/core/play/IPlayControl;)V

    sget-object p1, Ld6/s;->a:Ld6/s;

    return-object p1
.end method

.method public final invoke(Lcom/zykj/blackboard/core/play/IPlayControl;)V
    .locals 5
    .param p1    # Lcom/zykj/blackboard/core/play/IPlayControl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1;->$path:Ljava/lang/String;

    new-instance v1, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1;

    iget-object v2, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1;->this$0:Lcom/zykj/merge/sketch/view/BlackBoardProxyView;

    iget-object v3, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1;->$onSuccess:Lr6/c;

    iget-object v4, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1;->$onFailure:Lr6/c;

    invoke-direct {v1, p1, v2, v3, v4}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1;-><init>(Lcom/zykj/blackboard/core/play/IPlayControl;Lcom/zykj/merge/sketch/view/BlackBoardProxyView;Lr6/c;Lr6/c;)V

    new-instance v2, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$2;

    iget-object v3, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1;->this$0:Lcom/zykj/merge/sketch/view/BlackBoardProxyView;

    iget-object v4, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1;->$onFailure:Lr6/c;

    invoke-direct {v2, v3, v4}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$2;-><init>(Lcom/zykj/merge/sketch/view/BlackBoardProxyView;Lr6/c;)V

    invoke-interface {p1, v0, v1, v2}, Lcom/zykj/blackboard/core/play/IPlayControl;->loadPath(Ljava/lang/String;Lr6/c;Lr6/c;)V

    return-void
.end method
