.class final Lcom/zykj/sketch/core/player/SketchPlayerView$loadData$1$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/sketch/core/player/SketchPlayerView;->loadData$lambda-13$lambda-12(Lcom/zykj/sketch/core/player/SketchPlayerView;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
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

.field final synthetic this$0:Lcom/zykj/sketch/core/player/SketchPlayerView;


# direct methods
.method public constructor <init>(Lcom/zykj/sketch/core/player/SketchPlayerView;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/sketch/core/player/SketchPlayerView;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/zykj/sketch/core/player/SketchPlayerView$loadData$1$1$1;->this$0:Lcom/zykj/sketch/core/player/SketchPlayerView;

    iput-object p2, p0, Lcom/zykj/sketch/core/player/SketchPlayerView$loadData$1$1$1;->$onSuccess:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lcom/zykj/sketch/core/player/SketchPlayerView;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/sketch/core/player/SketchPlayerView$loadData$1$1$1;->invoke$lambda-1(Lcom/zykj/sketch/core/player/SketchPlayerView;Lkotlin/jvm/functions/Function1;I)V

    return-void
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/sketch/core/player/SketchPlayerView$loadData$1$1$1;->invoke$lambda-1$lambda-0(Lkotlin/jvm/functions/Function1;I)V

    return-void
.end method

.method private static final invoke$lambda-1(Lcom/zykj/sketch/core/player/SketchPlayerView;Lkotlin/jvm/functions/Function1;I)V
    .locals 1

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$onSuccess"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/zykj/sketch/core/player/t;

    .line 12
    .line 13
    invoke-direct {v0, p1, p2}, Lcom/zykj/sketch/core/player/t;-><init>(Lkotlin/jvm/functions/Function1;I)V

    .line 14
    .line 15
    .line 16
    invoke-static {p0, v0}, Lcom/zykj/sketch/core/player/SketchPlayerView;->access$runAtLeastCreated(Lcom/zykj/sketch/core/player/SketchPlayerView;Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method private static final invoke$lambda-1$lambda-0(Lkotlin/jvm/functions/Function1;I)V
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
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/zykj/sketch/core/player/SketchPlayerView$loadData$1$1$1;->invoke(I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(I)V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/zykj/sketch/core/player/SketchPlayerView$loadData$1$1$1;->this$0:Lcom/zykj/sketch/core/player/SketchPlayerView;

    iget-object v1, p0, Lcom/zykj/sketch/core/player/SketchPlayerView$loadData$1$1$1;->$onSuccess:Lkotlin/jvm/functions/Function1;

    new-instance v2, Lcom/zykj/sketch/core/player/u;

    invoke-direct {v2, v0, v1, p1}, Lcom/zykj/sketch/core/player/u;-><init>(Lcom/zykj/sketch/core/player/SketchPlayerView;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
