.class final Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1;->invoke(Lha/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lhd/l;"
    }
.end annotation


# instance fields
.field final synthetic $it:Lha/l;

.field final synthetic $onFailure:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field final synthetic $onSuccess:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/zykj/merge/sketch/view/BlackBoardProxyView;


# direct methods
.method public constructor <init>(Lha/l;Lcom/zykj/merge/sketch/view/BlackBoardProxyView;Lhd/l;Lhd/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lha/l;",
            "Lcom/zykj/merge/sketch/view/BlackBoardProxyView;",
            "Lhd/l;",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1;->$it:Lha/l;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1;->this$0:Lcom/zykj/merge/sketch/view/BlackBoardProxyView;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1;->$onSuccess:Lhd/l;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1;->$onFailure:Lhd/l;

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

    sget-object p1, Lqc/q;->a:Lqc/q;

    return-object p1
.end method

.method public final invoke(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lha/m;",
            ">;)V"
        }
    .end annotation

    const-string v0, "playPageControlList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1;->$it:Lha/l;

    invoke-static {p1}, Lrc/w;->p(Ljava/util/List;)I

    move-result p1

    new-instance v1, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1$1;

    iget-object v2, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1;->this$0:Lcom/zykj/merge/sketch/view/BlackBoardProxyView;

    iget-object v3, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1;->$it:Lha/l;

    iget-object v4, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1;->$onSuccess:Lhd/l;

    invoke-direct {v1, v2, v3, v4}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1$1;-><init>(Lcom/zykj/merge/sketch/view/BlackBoardProxyView;Lha/l;Lhd/l;)V

    new-instance v2, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1$2;

    iget-object v3, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1;->this$0:Lcom/zykj/merge/sketch/view/BlackBoardProxyView;

    iget-object v4, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1;->$onFailure:Lhd/l;

    invoke-direct {v2, v3, v4}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1$2;-><init>(Lcom/zykj/merge/sketch/view/BlackBoardProxyView;Lhd/l;)V

    invoke-interface {v0, p1, v1, v2}, Lha/l;->d(ILhd/a;Lhd/a;)Z

    return-void
.end method
