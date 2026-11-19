.class final Lcom/zykj/blackboard/core/action/BaseTouchAction$isSingleFingerInput$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/action/BaseTouchAction;->isSingleFingerInput(Lcom/zykj/board/EzyTouchEvent$TouchEvent;Lx7/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lx7/a;"
    }
.end annotation


# instance fields
.field final synthetic $callback:Lx7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx7/a;"
        }
    .end annotation
.end field

.field final synthetic $event:Lcom/zykj/board/EzyTouchEvent$TouchEvent;


# direct methods
.method public constructor <init>(Lcom/zykj/board/EzyTouchEvent$TouchEvent;Lx7/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/board/EzyTouchEvent$TouchEvent;",
            "Lx7/a;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/BaseTouchAction$isSingleFingerInput$1;->$event:Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/blackboard/core/action/BaseTouchAction$isSingleFingerInput$1;->$callback:Lx7/a;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction$isSingleFingerInput$1;->invoke()V

    sget-object v0, Lh7/p;->a:Lh7/p;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseTouchAction$isSingleFingerInput$1;->$event:Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    invoke-virtual {v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getPointerPropertiesList()Ljava/util/List;

    move-result-object v0

    const-string v1, "event.pointerPropertiesList"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseTouchAction$isSingleFingerInput$1;->$event:Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    invoke-virtual {v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getPointerPropertiesList()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Li7/f0;->l0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lcom/zykj/blackboard/core/action/BaseTouchAction$isSingleFingerInput$1;->$callback:Lx7/a;

    check-cast v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

    .line 4
    invoke-virtual {v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->getId()I

    move-result v0

    if-nez v0, :cond_0

    .line 5
    invoke-interface {v1}, Lx7/a;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method
