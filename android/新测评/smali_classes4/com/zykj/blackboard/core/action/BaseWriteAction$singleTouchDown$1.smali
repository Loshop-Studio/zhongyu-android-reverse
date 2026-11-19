.class final Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchDown$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


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
.field public final synthetic a:Lcom/zykj/blackboard/core/action/BaseWriteAction;

.field public final synthetic b:Lcom/zykj/board/EzyTouchEvent$TouchEvent;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/action/BaseWriteAction;Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchDown$1;->a:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    iput-object p2, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchDown$1;->b:Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchDown$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 7

    .line 2
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchDown$1;->a:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->P(Lcom/zykj/blackboard/core/action/BaseWriteAction;Z)V

    .line 3
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchDown$1;->a:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->c0()V

    .line 4
    sget-object v0, Le5/h;->a:Le5/h;

    sget-object v2, Lcom/zykj/blackboard/utils/EventKey;->b:Lcom/zykj/blackboard/utils/EventKey;

    invoke-virtual {v0, v2}, Le5/h;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 5
    sget-object v2, Lcom/zykj/blackboard/utils/EventKey;->a:Lcom/zykj/blackboard/utils/EventKey;

    invoke-virtual {v0, v2}, Le5/h;->b(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchDown$1;->a:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    iget-object v2, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchDown$1;->b:Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    invoke-virtual {v0, v2}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->Z(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 7
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchDown$1;->a:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->d0()Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchDown$1;->a:Lcom/zykj/blackboard/core/action/BaseWriteAction;

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

    iget-object v4, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchDown$1;->a:Lcom/zykj/blackboard/core/action/BaseWriteAction;

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
    iget-object v3, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchDown$1;->a:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-virtual {v3}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lk4/c;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    invoke-interface {v3}, Lk4/c;->n()Lq4/c;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-interface {v3}, Lq4/c;->f()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_2

    iget-object v5, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchDown$1;->a:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-static {v5}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->I(Lcom/zykj/blackboard/core/action/BaseWriteAction;)Lq4/c;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/collections/CollectionsKt;->contains(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 10
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchDown$1;->a:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-static {v0, v4}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->M(Lcom/zykj/blackboard/core/action/BaseWriteAction;Lq4/c;)V

    move v0, v1

    :cond_2
    if-eqz v0, :cond_6

    .line 11
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchDown$1;->a:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-virtual {v0, v2}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->f0(Z)V

    .line 12
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchDown$1;->a:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-static {v0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->I(Lcom/zykj/blackboard/core/action/BaseWriteAction;)Lq4/c;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->N(Lcom/zykj/blackboard/core/action/BaseWriteAction;Lq4/c;)V

    .line 13
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchDown$1;->a:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lk4/c;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-interface {v0}, Lk4/c;->n()Lq4/c;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-interface {v0}, Lq4/c;->getId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    goto :goto_2

    .line 14
    :cond_3
    iget-object v2, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchDown$1;->a:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-virtual {v2}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->h()Lg4/b;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-interface {v3, v0}, Lg4/b;->m(Ljava/lang/String;)Lq4/c;

    move-result-object v4

    :cond_4
    invoke-static {v2, v4}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->M(Lcom/zykj/blackboard/core/action/BaseWriteAction;Lq4/c;)V

    .line 15
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchDown$1;->a:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-static {v0, v1}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->L(Lcom/zykj/blackboard/core/action/BaseWriteAction;Z)V

    :cond_5
    :goto_2
    return-void

    .line 16
    :cond_6
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchDown$1;->a:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-static {v0, v2}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->L(Lcom/zykj/blackboard/core/action/BaseWriteAction;Z)V

    return-void
.end method
