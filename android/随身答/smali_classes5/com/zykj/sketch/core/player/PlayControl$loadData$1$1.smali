.class final Lcom/zykj/sketch/core/player/PlayControl$loadData$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/sketch/core/player/PlayControl;->loadData(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/zykj/sketch/core/listener/ViewControl;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "viewControl",
        "Lcom/zykj/sketch/core/listener/ViewControl;",
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

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/zykj/sketch/core/listener/ViewControl;)V
    .locals 1

    const-string v0, "viewControl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/zykj/sketch/core/player/PlayControl$loadData$1$1;->this$0:Lcom/zykj/sketch/core/player/PlayControl;

    invoke-static {v0}, Lcom/zykj/sketch/core/player/PlayControl;->access$getActionExecute$p(Lcom/zykj/sketch/core/player/PlayControl;)Lcom/zykj/sketch/core/ActionExecute;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/zykj/sketch/core/ActionExecute;->addViewControl(Lcom/zykj/sketch/core/listener/ViewControl;)V

    return-void
.end method
