.class final Lcom/zykj/merge/sketch/view/BlackBoardProxyView$seekTo$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->seekTo(ILhd/l;Lhd/l;)V
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
.field final synthetic $onSuccess:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field final synthetic $position:I

.field final synthetic this$0:Lcom/zykj/merge/sketch/view/BlackBoardProxyView;


# direct methods
.method public constructor <init>(Lcom/zykj/merge/sketch/view/BlackBoardProxyView;Lhd/l;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/merge/sketch/view/BlackBoardProxyView;",
            "Lhd/l;",
            "I)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$seekTo$1;->this$0:Lcom/zykj/merge/sketch/view/BlackBoardProxyView;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$seekTo$1;->$onSuccess:Lhd/l;

    .line 4
    .line 5
    iput p3, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$seekTo$1;->$position:I

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

.method public static synthetic a(Lhd/l;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$seekTo$1;->invoke$lambda-0(Lhd/l;I)V

    return-void
.end method

.method private static final invoke$lambda-0(Lhd/l;I)V
    .locals 1

    .line 1
    const-string v0, "$onSuccess"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-interface {p0, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$seekTo$1;->invoke()V

    sget-object v0, Lqc/q;->a:Lqc/q;

    return-object v0
.end method

.method public final invoke()V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$seekTo$1;->this$0:Lcom/zykj/merge/sketch/view/BlackBoardProxyView;

    iget-object v1, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$seekTo$1;->$onSuccess:Lhd/l;

    iget v2, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$seekTo$1;->$position:I

    new-instance v3, Lcom/zykj/merge/sketch/view/e;

    invoke-direct {v3, v1, v2}, Lcom/zykj/merge/sketch/view/e;-><init>(Lhd/l;I)V

    invoke-static {v0, v3}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->access$runAtLeastCreated(Lcom/zykj/merge/sketch/view/BlackBoardProxyView;Ljava/lang/Runnable;)V

    return-void
.end method
