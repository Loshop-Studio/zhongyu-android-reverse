.class final Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchDown$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/action/BaseWriteAction;->F(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
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
.field public final synthetic c:Lcom/zykj/blackboard/core/action/BaseWriteAction;

.field public final synthetic d:Lcom/zykj/board/EzyTouchEvent$TouchEvent;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/action/BaseWriteAction;Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchDown$1;->c:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    iput-object p2, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchDown$1;->d:Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchDown$1;->invoke()V

    sget-object v0, Lqc/q;->a:Lqc/q;

    return-object v0
.end method

.method public final invoke()V
    .locals 7

    .line 2
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchDown$1;->c:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->P(Lcom/zykj/blackboard/core/action/BaseWriteAction;Z)V

    .line 3
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchDown$1;->c:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->d0()V

    .line 4
    sget-object v0, Lna/i;->a:Lna/i;

    sget-object v2, Lcom/zykj/blackboard/utils/EventKey;->d:Lcom/zykj/blackboard/utils/EventKey;

    invoke-virtual {v0, v2}, Lna/i;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 5
    sget-object v2, Lcom/zykj/blackboard/utils/EventKey;->c:Lcom/zykj/blackboard/utils/EventKey;

    invoke-virtual {v0, v2}, Lna/i;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchDown$1;->c:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    iget-object v2, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchDown$1;->d:Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    invoke-virtual {v0, v2}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->a0(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 7
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchDown$1;->c:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->e0()Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchDown$1;->c:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-static {v0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->J(Lcom/zykj/blackboard/core/action/BaseWriteAction;)J

    move-result-wide v5

    sub-long/2addr v3, v5

    const-wide/16 v5, 0x1388

    cmp-long v0, v3, v5

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, v2

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v1

    .line 8
    :goto_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchDown$1;->c:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "isNeedNewGroup--> "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "BaseWriteAction"

    invoke-static {v4, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 9
    iget-object v3, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchDown$1;->c:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-virtual {v3}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lv9/c;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    invoke-interface {v3}, Lv9/c;->n()Lba/c;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-interface {v3}, Lba/c;->f()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_2

    check-cast v3, Ljava/lang/Iterable;

    iget-object v5, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchDown$1;->c:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-static {v5}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->I(Lcom/zykj/blackboard/core/action/BaseWriteAction;)Lba/c;

    move-result-object v5

    invoke-static {v3, v5}, Lrc/g0;->e0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 10
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchDown$1;->c:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-static {v0, v4}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->M(Lcom/zykj/blackboard/core/action/BaseWriteAction;Lba/c;)V

    move v0, v1

    :cond_2
    if-eqz v0, :cond_5

    .line 11
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchDown$1;->c:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-virtual {v0, v2}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->g0(Z)V

    .line 12
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchDown$1;->c:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-static {v0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->I(Lcom/zykj/blackboard/core/action/BaseWriteAction;)Lba/c;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->N(Lcom/zykj/blackboard/core/action/BaseWriteAction;Lba/c;)V

    .line 13
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchDown$1;->c:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->h()Lr9/b;

    move-result-object v2

    if-eqz v2, :cond_4

    iget-object v3, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchDown$1;->c:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-virtual {v3}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lv9/c;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-interface {v3}, Lv9/c;->n()Lba/c;

    move-result-object v4

    :cond_3
    invoke-static {v4}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    invoke-interface {v4}, Lba/c;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lr9/b;->n(Ljava/lang/String;)Lba/c;

    move-result-object v4

    :cond_4
    invoke-static {v0, v4}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->M(Lcom/zykj/blackboard/core/action/BaseWriteAction;Lba/c;)V

    .line 14
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchDown$1;->c:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-static {v0, v1}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->L(Lcom/zykj/blackboard/core/action/BaseWriteAction;Z)V

    return-void

    .line 15
    :cond_5
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchDown$1;->c:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-static {v0, v2}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->L(Lcom/zykj/blackboard/core/action/BaseWriteAction;Z)V

    return-void
.end method
