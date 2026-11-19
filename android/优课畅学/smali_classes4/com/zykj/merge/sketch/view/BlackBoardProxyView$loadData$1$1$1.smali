.class final Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1;->invoke(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lx7/a;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/merge/sketch/view/BlackBoardProxyView;

.field public final synthetic b:Lcom/zykj/blackboard/core/play/IPlayControl;

.field public final synthetic c:Lx7/l;


# direct methods
.method public constructor <init>(Lcom/zykj/merge/sketch/view/BlackBoardProxyView;Lcom/zykj/blackboard/core/play/IPlayControl;Lx7/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1$1;->a:Lcom/zykj/merge/sketch/view/BlackBoardProxyView;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1$1;->b:Lcom/zykj/blackboard/core/play/IPlayControl;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1$1;->c:Lx7/l;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static synthetic a(Lx7/l;Lcom/zykj/blackboard/core/play/IPlayPageControl;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1$1;->b(Lx7/l;Lcom/zykj/blackboard/core/play/IPlayPageControl;)V

    return-void
.end method

.method public static final b(Lx7/l;Lcom/zykj/blackboard/core/play/IPlayPageControl;)V
    .locals 2

    .line 1
    const-string v0, "$onSuccess"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$this_apply"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Lcom/zykj/blackboard/core/play/IPlayPageControl;->getDuration()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    long-to-int p1, v0

    .line 16
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-interface {p0, p1}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1$1;->invoke()V

    sget-object v0, Lh7/p;->a:Lh7/p;

    return-object v0
.end method

.method public final invoke()V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1$1;->a:Lcom/zykj/merge/sketch/view/BlackBoardProxyView;

    iget-object v1, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1$1;->b:Lcom/zykj/blackboard/core/play/IPlayControl;

    invoke-interface {v1}, Lcom/zykj/blackboard/core/play/IPlayControl;->getCurrentPlayPageControl()Lcom/zykj/blackboard/core/play/IPlayPageControl;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->h(Lcom/zykj/merge/sketch/view/BlackBoardProxyView;Lcom/zykj/blackboard/core/play/IPlayPageControl;)V

    .line 3
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1$1;->a:Lcom/zykj/merge/sketch/view/BlackBoardProxyView;

    invoke-static {v0}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->f(Lcom/zykj/merge/sketch/view/BlackBoardProxyView;)Lcom/zykj/blackboard/core/play/IPlayPageControl;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1$1;->a:Lcom/zykj/merge/sketch/view/BlackBoardProxyView;

    iget-object v2, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1$1;->c:Lx7/l;

    .line 4
    new-instance v3, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1$1$a;

    invoke-direct {v3, v1}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1$1$a;-><init>(Lcom/zykj/merge/sketch/view/BlackBoardProxyView;)V

    invoke-interface {v0, v3}, Lcom/zykj/blackboard/core/play/IPlayPageControl;->addPlayActionListener(Lcom/zykj/blackboard/listener/PlayStatusListener;)V

    .line 5
    new-instance v3, Lcom/zykj/merge/sketch/view/a;

    invoke-direct {v3, v2, v0}, Lcom/zykj/merge/sketch/view/a;-><init>(Lx7/l;Lcom/zykj/blackboard/core/play/IPlayPageControl;)V

    invoke-static {v1, v3}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->g(Lcom/zykj/merge/sketch/view/BlackBoardProxyView;Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method
