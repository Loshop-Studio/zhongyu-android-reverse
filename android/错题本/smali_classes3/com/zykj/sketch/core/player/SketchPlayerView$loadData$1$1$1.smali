.class final Lcom/zykj/sketch/core/player/SketchPlayerView$loadData$1$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/sketch/core/player/SketchPlayerView;->loadData$lambda-13$lambda-12(Lcom/zykj/sketch/core/player/SketchPlayerView;Ljava/lang/String;Lr6/c;Lr6/c;)V
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
        "\u0000\u000e\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "",
        "it",
        "Ld6/s;",
        "invoke",
        "(I)V",
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
.field final synthetic $onSuccess:Lr6/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/c;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/zykj/sketch/core/player/SketchPlayerView;


# direct methods
.method public constructor <init>(Lcom/zykj/sketch/core/player/SketchPlayerView;Lr6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/sketch/core/player/SketchPlayerView;",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/core/player/SketchPlayerView$loadData$1$1$1;->this$0:Lcom/zykj/sketch/core/player/SketchPlayerView;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/sketch/core/player/SketchPlayerView$loadData$1$1$1;->$onSuccess:Lr6/c;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static synthetic a(Lcom/zykj/sketch/core/player/SketchPlayerView;Lr6/c;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/sketch/core/player/SketchPlayerView$loadData$1$1$1;->invoke$lambda-1(Lcom/zykj/sketch/core/player/SketchPlayerView;Lr6/c;I)V

    return-void
.end method

.method public static synthetic b(Lr6/c;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/sketch/core/player/SketchPlayerView$loadData$1$1$1;->invoke$lambda-1$lambda-0(Lr6/c;I)V

    return-void
.end method

.method private static final invoke$lambda-1(Lcom/zykj/sketch/core/player/SketchPlayerView;Lr6/c;I)V
    .locals 2

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$onSuccess"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lcom/zykj/sketch/core/player/d;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, p2, v1, p1}, Lcom/zykj/sketch/core/player/d;-><init>(IILr6/c;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p0, v0}, Lcom/zykj/sketch/core/player/SketchPlayerView;->access$runAtLeastCreated(Lcom/zykj/sketch/core/player/SketchPlayerView;Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private static final invoke$lambda-1$lambda-0(Lr6/c;I)V
    .locals 1

    .line 1
    const-string v0, "$onSuccess"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-interface {p0, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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

    sget-object p1, Ld6/s;->a:Ld6/s;

    return-object p1
.end method

.method public final invoke(I)V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/zykj/sketch/core/player/SketchPlayerView$loadData$1$1$1;->this$0:Lcom/zykj/sketch/core/player/SketchPlayerView;

    iget-object v1, p0, Lcom/zykj/sketch/core/player/SketchPlayerView$loadData$1$1$1;->$onSuccess:Lr6/c;

    new-instance v2, Lcom/zykj/sketch/core/player/e;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v1, p1, v3}, Lcom/zykj/sketch/core/player/e;-><init>(Lcom/zykj/sketch/core/player/SketchPlayerView;Lr6/c;II)V

    invoke-virtual {v0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
