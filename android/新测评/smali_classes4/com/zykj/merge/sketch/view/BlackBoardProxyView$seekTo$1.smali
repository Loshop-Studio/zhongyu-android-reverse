.class final Lcom/zykj/merge/sketch/view/BlackBoardProxyView$seekTo$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->seekTo(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
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

.field final synthetic $position:I

.field final synthetic this$0:Lcom/zykj/merge/sketch/view/BlackBoardProxyView;


# direct methods
.method public constructor <init>(Lcom/zykj/merge/sketch/view/BlackBoardProxyView;Lkotlin/jvm/functions/Function1;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/merge/sketch/view/BlackBoardProxyView;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;I)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$seekTo$1;->this$0:Lcom/zykj/merge/sketch/view/BlackBoardProxyView;

    iput-object p2, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$seekTo$1;->$onSuccess:Lkotlin/jvm/functions/Function1;

    iput p3, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$seekTo$1;->$position:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$seekTo$1;->invoke$lambda-0(Lkotlin/jvm/functions/Function1;I)V

    return-void
.end method

.method private static final invoke$lambda-0(Lkotlin/jvm/functions/Function1;I)V
    .locals 1

    .line 1
    const-string v0, "$onSuccess"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$seekTo$1;->this$0:Lcom/zykj/merge/sketch/view/BlackBoardProxyView;

    iget-object v1, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$seekTo$1;->$onSuccess:Lkotlin/jvm/functions/Function1;

    iget v2, p0, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$seekTo$1;->$position:I

    new-instance v3, Lcom/zykj/merge/sketch/view/e;

    invoke-direct {v3, v1, v2}, Lcom/zykj/merge/sketch/view/e;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-static {v0, v3}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView;->access$runAtLeastCreated(Lcom/zykj/merge/sketch/view/BlackBoardProxyView;Ljava/lang/Runnable;)V

    return-void
.end method
