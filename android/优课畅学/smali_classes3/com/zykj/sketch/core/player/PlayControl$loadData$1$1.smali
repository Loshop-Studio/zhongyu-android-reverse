.class final Lcom/zykj/sketch/core/player/PlayControl$loadData$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/sketch/core/player/PlayControl;->loadData(Ljava/lang/String;Lx7/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lx7/l;"
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

    sget-object p1, Lh7/p;->a:Lh7/p;

    return-object p1
.end method

.method public final invoke(Lcom/zykj/sketch/core/listener/ViewControl;)V
    .locals 1

    const-string v0, "viewControl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/zykj/sketch/core/player/PlayControl$loadData$1$1;->this$0:Lcom/zykj/sketch/core/player/PlayControl;

    invoke-static {v0}, Lcom/zykj/sketch/core/player/PlayControl;->access$getActionExecute$p(Lcom/zykj/sketch/core/player/PlayControl;)Lcom/zykj/sketch/core/ActionExecute;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/zykj/sketch/core/ActionExecute;->addViewControl(Lcom/zykj/sketch/core/listener/ViewControl;)V

    return-void
.end method
