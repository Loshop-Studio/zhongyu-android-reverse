.class final Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1;->invoke(Lcom/zykj/blackboard/core/play/IPlayControl;)V
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
        "\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u00020\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "Lcom/zykj/blackboard/core/play/IPlayPageControl;",
        "playPageControlList",
        "Ld6/s;",
        "invoke",
        "(Ljava/util/List;)V",
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
.field final synthetic $it:Lcom/zykj/blackboard/core/play/IPlayControl;

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

.field final synthetic this$0:Lcom/zykj/merge/sketch/view/BlackBoardProxyView;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/play/IPlayControl;Lcom/zykj/merge/sketch/view/BlackBoardProxyView;Lr6/c;Lr6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/blackboard/core/play/IPlayControl;",
            "Lcom/zykj/merge/sketch/view/BlackBoardProxyView;",
            "Lr6/c;",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1;->$it:Lcom/zykj/blackboard/core/play/IPlayControl;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1;->this$0:Lcom/zykj/merge/sketch/view/BlackBoardProxyView;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1;->$onSuccess:Lr6/c;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1;->$onFailure:Lr6/c;

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
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1;->invoke(Ljava/util/List;)V

    sget-object p1, Ld6/s;->a:Ld6/s;

    return-object p1
.end method

.method public final invoke(Ljava/util/List;)V
    .locals 5
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/zykj/blackboard/core/play/IPlayPageControl;",
            ">;)V"
        }
    .end annotation

    const-string v0, "playPageControlList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1;->$it:Lcom/zykj/blackboard/core/play/IPlayControl;

    invoke-static {p1}, Lkotlin/collections/u;->u(Ljava/util/List;)I

    move-result p1

    new-instance v1, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1$1;

    iget-object v2, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1;->this$0:Lcom/zykj/merge/sketch/view/BlackBoardProxyView;

    iget-object v3, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1;->$it:Lcom/zykj/blackboard/core/play/IPlayControl;

    iget-object v4, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1;->$onSuccess:Lr6/c;

    invoke-direct {v1, v2, v3, v4}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1$1;-><init>(Lcom/zykj/merge/sketch/view/BlackBoardProxyView;Lcom/zykj/blackboard/core/play/IPlayControl;Lr6/c;)V

    new-instance v2, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1$2;

    iget-object v3, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1;->this$0:Lcom/zykj/merge/sketch/view/BlackBoardProxyView;

    iget-object v4, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1;->$onFailure:Lr6/c;

    invoke-direct {v2, v3, v4}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1$2;-><init>(Lcom/zykj/merge/sketch/view/BlackBoardProxyView;Lr6/c;)V

    invoke-interface {v0, p1, v1, v2}, Lcom/zykj/blackboard/core/play/IPlayControl;->switchCurrentPlayPage(ILr6/a;Lr6/a;)Z

    return-void
.end method
