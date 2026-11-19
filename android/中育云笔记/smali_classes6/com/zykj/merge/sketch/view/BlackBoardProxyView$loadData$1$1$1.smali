.class final Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/a;


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
        "Lhd/a;"
    }
.end annotation


# instance fields
.field final synthetic $it:Lha/l;

.field final synthetic $onSuccess:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/zykj/merge/sketch/view/BlackBoardProxyView;


# direct methods
.method public constructor <init>(Lcom/zykj/merge/sketch/view/BlackBoardProxyView;Lha/l;Lhd/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/merge/sketch/view/BlackBoardProxyView;",
            "Lha/l;",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1$1;->this$0:Lcom/zykj/merge/sketch/view/BlackBoardProxyView;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1$1;->$it:Lha/l;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1$1;->$onSuccess:Lhd/l;

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

.method public static synthetic a(Lhd/l;Lha/m;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1$1;->invoke$lambda-1$lambda-0(Lhd/l;Lha/m;)V

    return-void
.end method

.method private static final invoke$lambda-1$lambda-0(Lhd/l;Lha/m;)V
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
    invoke-interface {p1}, Lha/m;->getDuration()J

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
    invoke-interface {p0, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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

    sget-object v0, Lqc/q;->a:Lqc/q;

    return-object v0
.end method

.method public final invoke()V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1$1;->this$0:Lcom/zykj/merge/sketch/view/BlackBoardProxyView;

    iget-object v1, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1$1;->$it:Lha/l;

    invoke-interface {v1}, Lha/l;->a()Lha/m;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->access$setPlayPageControl$p(Lcom/zykj/merge/sketch/view/BlackBoardProxyView;Lha/m;)V

    .line 3
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1$1;->this$0:Lcom/zykj/merge/sketch/view/BlackBoardProxyView;

    invoke-static {v0}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->access$getPlayPageControl$p(Lcom/zykj/merge/sketch/view/BlackBoardProxyView;)Lha/m;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1$1;->this$0:Lcom/zykj/merge/sketch/view/BlackBoardProxyView;

    iget-object v2, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1$1;->$onSuccess:Lhd/l;

    .line 4
    new-instance v3, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1$1$1$1;

    invoke-direct {v3, v1}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1$1$1$1;-><init>(Lcom/zykj/merge/sketch/view/BlackBoardProxyView;)V

    invoke-interface {v0, v3}, Lha/m;->d(Lma/h;)V

    .line 5
    new-instance v3, Lcom/zykj/merge/sketch/view/b;

    invoke-direct {v3, v2, v0}, Lcom/zykj/merge/sketch/view/b;-><init>(Lhd/l;Lha/m;)V

    invoke-static {v1, v3}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->access$runAtLeastCreated(Lcom/zykj/merge/sketch/view/BlackBoardProxyView;Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method
