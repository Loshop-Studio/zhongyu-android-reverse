.class final Lcom/zykj/blackboard/core/action/BaseTouchAction$isSingleFingerInput$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/action/BaseTouchAction;->j(Lcom/zykj/board/EzyTouchEvent$TouchEvent;Lhd/a;)V
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
.field public final synthetic c:Lcom/zykj/board/EzyTouchEvent$TouchEvent;

.field public final synthetic d:Lhd/a;


# direct methods
.method public constructor <init>(Lcom/zykj/board/EzyTouchEvent$TouchEvent;Lhd/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/BaseTouchAction$isSingleFingerInput$1;->c:Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/blackboard/core/action/BaseTouchAction$isSingleFingerInput$1;->d:Lhd/a;

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

    sget-object v0, Lqc/q;->a:Lqc/q;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseTouchAction$isSingleFingerInput$1;->c:Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    invoke-virtual {v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getPointerPropertiesList()Ljava/util/List;

    move-result-object v0

    const-string v1, "event.pointerPropertiesList"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseTouchAction$isSingleFingerInput$1;->c:Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    invoke-virtual {v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getPointerPropertiesList()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lrc/g0;->m0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lcom/zykj/blackboard/core/action/BaseTouchAction$isSingleFingerInput$1;->d:Lhd/a;

    check-cast v0, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

    .line 4
    invoke-virtual {v0}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->getId()I

    move-result v0

    if-nez v0, :cond_0

    .line 5
    invoke-interface {v1}, Lhd/a;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method
