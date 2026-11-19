.class final Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->loadData(Ljava/lang/String;Lx7/l;Lx7/l;)V
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
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lcom/zykj/merge/sketch/view/BlackBoardProxyView;

.field public final synthetic c:Lx7/l;

.field public final synthetic d:Lx7/l;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/zykj/merge/sketch/view/BlackBoardProxyView;Lx7/l;Lx7/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1;->a:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1;->b:Lcom/zykj/merge/sketch/view/BlackBoardProxyView;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1;->c:Lx7/l;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1;->d:Lx7/l;

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
.method public final a(Lcom/zykj/blackboard/core/play/IPlayControl;)V
    .locals 5

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1;->a:Ljava/lang/String;

    .line 7
    .line 8
    new-instance v1, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1;

    .line 9
    .line 10
    iget-object v2, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1;->b:Lcom/zykj/merge/sketch/view/BlackBoardProxyView;

    .line 11
    .line 12
    iget-object v3, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1;->c:Lx7/l;

    .line 13
    .line 14
    iget-object v4, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1;->d:Lx7/l;

    .line 15
    .line 16
    invoke-direct {v1, p1, v2, v3, v4}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1;-><init>(Lcom/zykj/blackboard/core/play/IPlayControl;Lcom/zykj/merge/sketch/view/BlackBoardProxyView;Lx7/l;Lx7/l;)V

    .line 17
    .line 18
    .line 19
    new-instance v2, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$2;

    .line 20
    .line 21
    iget-object v3, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1;->b:Lcom/zykj/merge/sketch/view/BlackBoardProxyView;

    .line 22
    .line 23
    iget-object v4, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1;->d:Lx7/l;

    .line 24
    .line 25
    invoke-direct {v2, v3, v4}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$2;-><init>(Lcom/zykj/merge/sketch/view/BlackBoardProxyView;Lx7/l;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {p1, v0, v1, v2}, Lcom/zykj/blackboard/core/play/IPlayControl;->loadPath(Ljava/lang/String;Lx7/l;Lx7/l;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/blackboard/core/play/IPlayControl;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1;->a(Lcom/zykj/blackboard/core/play/IPlayControl;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 7
    .line 8
    return-object p1
.end method
