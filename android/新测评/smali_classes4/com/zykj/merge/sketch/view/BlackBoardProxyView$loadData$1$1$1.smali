.class final Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


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
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $it:Lw4/l;

.field final synthetic $onSuccess:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/zykj/merge/sketch/view/BlackBoardProxyView;


# direct methods
.method public constructor <init>(Lcom/zykj/merge/sketch/view/BlackBoardProxyView;Lw4/l;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/merge/sketch/view/BlackBoardProxyView;",
            "Lw4/l;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1$1;->this$0:Lcom/zykj/merge/sketch/view/BlackBoardProxyView;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1$1;->$it:Lw4/l;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1$1;->$onSuccess:Lkotlin/jvm/functions/Function1;

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

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lw4/m;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1$1;->invoke$lambda-1$lambda-0(Lkotlin/jvm/functions/Function1;Lw4/m;)V

    return-void
.end method

.method private static final invoke$lambda-1$lambda-0(Lkotlin/jvm/functions/Function1;Lw4/m;)V
    .locals 2

    .line 1
    const-string v0, "$onSuccess"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$this_apply"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Lw4/m;->getDuration()J

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
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1$1;->this$0:Lcom/zykj/merge/sketch/view/BlackBoardProxyView;

    iget-object v1, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1$1;->$it:Lw4/l;

    invoke-interface {v1}, Lw4/l;->a()Lw4/m;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->access$setPlayPageControl$p(Lcom/zykj/merge/sketch/view/BlackBoardProxyView;Lw4/m;)V

    .line 3
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1$1;->this$0:Lcom/zykj/merge/sketch/view/BlackBoardProxyView;

    invoke-static {v0}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->access$getPlayPageControl$p(Lcom/zykj/merge/sketch/view/BlackBoardProxyView;)Lw4/m;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1$1;->this$0:Lcom/zykj/merge/sketch/view/BlackBoardProxyView;

    iget-object v2, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1$1;->$onSuccess:Lkotlin/jvm/functions/Function1;

    .line 4
    new-instance v3, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1$1$1$1;

    invoke-direct {v3, v1}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1$1$1$1;-><init>(Lcom/zykj/merge/sketch/view/BlackBoardProxyView;)V

    invoke-interface {v0, v3}, Lw4/m;->f(Lc5/h;)V

    .line 5
    new-instance v3, Lcom/zykj/merge/sketch/view/b;

    invoke-direct {v3, v2, v0}, Lcom/zykj/merge/sketch/view/b;-><init>(Lkotlin/jvm/functions/Function1;Lw4/m;)V

    invoke-static {v1, v3}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->access$runAtLeastCreated(Lcom/zykj/merge/sketch/view/BlackBoardProxyView;Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method
