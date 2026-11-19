.class public abstract Lcom/zykj/blackboard/core/action/BaseTouchAction;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr9/c;


# instance fields
.field public a:Lr9/b;

.field public b:Lv9/c;

.field public c:Lq9/b;

.field public d:Lu9/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 1

    .line 1
    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public b(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 1

    .line 1
    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public c(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 1

    .line 1
    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public d(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 1

    .line 1
    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public e(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 1

    .line 1
    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final f()Lq9/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseTouchAction;->c:Lq9/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()Lv9/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseTouchAction;->b:Lv9/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Lr9/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseTouchAction;->a:Lr9/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i()Lu9/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseTouchAction;->d:Lu9/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j(Lcom/zykj/board/EzyTouchEvent$TouchEvent;Lhd/a;)V
    .locals 2

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseTouchAction;->c:Lq9/b;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Lq9/b;->O()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    :goto_0
    new-instance v1, Lcom/zykj/blackboard/core/action/BaseTouchAction$isSingleFingerInput$1;

    .line 22
    .line 23
    invoke-direct {v1, p1, p2}, Lcom/zykj/blackboard/core/action/BaseTouchAction$isSingleFingerInput$1;-><init>(Lcom/zykj/board/EzyTouchEvent$TouchEvent;Lhd/a;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0, p1, v1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->l(ZLcom/zykj/board/EzyTouchEvent$TouchEvent;Lhd/a;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public k(Lr9/b;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/BaseTouchAction;->a:Lr9/b;

    .line 7
    .line 8
    invoke-interface {p1}, Lr9/b;->j()Lq9/b;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/BaseTouchAction;->c:Lq9/b;

    .line 13
    .line 14
    invoke-interface {p1}, Lr9/b;->a()Lv9/c;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/BaseTouchAction;->b:Lv9/c;

    .line 19
    .line 20
    invoke-interface {p1}, Lr9/b;->g()Lu9/a;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/BaseTouchAction;->d:Lu9/a;

    .line 25
    .line 26
    return-void
.end method

.method public final l(ZLcom/zykj/board/EzyTouchEvent$TouchEvent;Lhd/a;)V
    .locals 1

    .line 1
    if-nez p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p2}, Lcom/zykj/board/EzyTouchEvent$TouchEvent;->getPointerPropertiesList()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string p2, "event.pointerPropertiesList"

    .line 8
    .line 9
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast p1, Ljava/lang/Iterable;

    .line 13
    .line 14
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    if-eqz p2, :cond_1

    .line 23
    .line 24
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    check-cast p2, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;

    .line 29
    .line 30
    invoke-virtual {p2}, Lcom/zykj/board/EzyTouchEvent$TouchEvent$PointerProperties;->getToolType()I

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    const/4 v0, 0x1

    .line 35
    if-ne p2, v0, :cond_0

    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    invoke-interface {p3}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    return-void
.end method
