.class final Lcom/zykj/sketch/core/player/PlayControl$loadData$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/sketch/core/player/PlayControl;->loadData(Ljava/lang/String;Lr6/c;)V
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lcom/zykj/sketch/core/listener/ViewControl;",
        "viewControl",
        "Ld6/s;",
        "invoke",
        "(Lcom/zykj/sketch/core/listener/ViewControl;)V",
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
.field final synthetic this$0:Lcom/zykj/sketch/core/player/PlayControl;


# direct methods
.method public constructor <init>(Lcom/zykj/sketch/core/player/PlayControl;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/sketch/core/player/PlayControl$loadData$1$1;->this$0:Lcom/zykj/sketch/core/player/PlayControl;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/sketch/core/listener/ViewControl;

    invoke-virtual {p0, p1}, Lcom/zykj/sketch/core/player/PlayControl$loadData$1$1;->invoke(Lcom/zykj/sketch/core/listener/ViewControl;)V

    sget-object p1, Ld6/s;->a:Ld6/s;

    return-object p1
.end method

.method public final invoke(Lcom/zykj/sketch/core/listener/ViewControl;)V
    .locals 1
    .param p1    # Lcom/zykj/sketch/core/listener/ViewControl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewControl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/zykj/sketch/core/player/PlayControl$loadData$1$1;->this$0:Lcom/zykj/sketch/core/player/PlayControl;

    invoke-static {v0}, Lcom/zykj/sketch/core/player/PlayControl;->access$getActionExecute$p(Lcom/zykj/sketch/core/player/PlayControl;)Lcom/zykj/sketch/core/ActionExecute;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/zykj/sketch/core/ActionExecute;->addViewControl(Lcom/zykj/sketch/core/listener/ViewControl;)V

    return-void
.end method
