.class final Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/action/BaseWriteAction;->H(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
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

    iput-object p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->c:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    iput-object p2, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->d:Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lr9/b;Lcom/zykj/blackboard/core/action/BaseWriteAction;Ljava/util/List;Lba/c;Ljava/lang/String;Lba/a;)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->c(Lr9/b;Lcom/zykj/blackboard/core/action/BaseWriteAction;Ljava/util/List;Lba/c;Ljava/lang/String;Lba/a;)V

    return-void
.end method

.method public static final c(Lr9/b;Lcom/zykj/blackboard/core/action/BaseWriteAction;Ljava/util/List;Lba/c;Ljava/lang/String;Lba/a;)V
    .locals 7

    .line 1
    const-string v0, "$actionListener"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "this$0"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$list"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "$groupGraph"

    .line 17
    .line 18
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "$graphId"

    .line 22
    .line 23
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "$graph"

    .line 27
    .line 28
    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->T()Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->W()Landroid/graphics/Paint;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->X()F

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->Y()F

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    invoke-static {v0, v1, v3}, Lna/m;->a(Landroid/graphics/Paint;FF)Lcom/zykj/board/EzyPaint$Paint;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-interface {p3}, Lba/c;->getId()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    move-object v1, p0

    .line 56
    move-object v3, p2

    .line 57
    move-object v6, p4

    .line 58
    invoke-interface/range {v1 .. v6}, Lr9/b;->e(Lcom/zykj/board/EzyGraphEnum$GraphEnum;Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;Ljava/lang/String;Ljava/lang/String;)Lba/a;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    instance-of p2, p5, Lea/c;

    .line 63
    .line 64
    if-eqz p2, :cond_0

    .line 65
    .line 66
    instance-of p2, p0, Lea/c;

    .line 67
    .line 68
    if-eqz p2, :cond_0

    .line 69
    .line 70
    check-cast p5, Lea/c;

    .line 71
    .line 72
    invoke-interface {v1}, Lr9/b;->q()Lga/d;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    invoke-virtual {p5, p2}, Lea/c;->P(Lga/d;)V

    .line 77
    .line 78
    .line 79
    check-cast p0, Lea/c;

    .line 80
    .line 81
    invoke-virtual {p0}, Lea/c;->w()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    invoke-virtual {p5, p2}, Lea/c;->N(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Lea/c;->x()Ljava/lang/Integer;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-virtual {p5, p0}, Lea/c;->O(Ljava/lang/Integer;)V

    .line 93
    .line 94
    .line 95
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->h()Lr9/b;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    if-eqz p0, :cond_1

    .line 100
    .line 101
    invoke-interface {p0}, Lr9/b;->l()V

    .line 102
    .line 103
    .line 104
    :cond_1
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->invoke()V

    sget-object v0, Lqc/q;->a:Lqc/q;

    return-object v0
.end method

.method public final invoke()V
    .locals 8

    .line 2
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->c:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->P(Lcom/zykj/blackboard/core/action/BaseWriteAction;Z)V

    .line 3
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->c:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    iget-object v1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->d:Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->c0(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 4
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->c:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->O(Lcom/zykj/blackboard/core/action/BaseWriteAction;J)V

    .line 5
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->c:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-static {v0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->I(Lcom/zykj/blackboard/core/action/BaseWriteAction;)Lba/c;

    move-result-object v5

    if-nez v5, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->c:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->h()Lr9/b;

    move-result-object v2

    if-nez v2, :cond_1

    :goto_0
    return-void

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->c:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->S()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 8
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v0, "randomUUID().toString()"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->c:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-virtual {v0, v6}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->Q(Ljava/lang/String;)Lba/a;

    move-result-object v7

    .line 10
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->c:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->S()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lrc/g0;->X0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v4

    .line 11
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->c:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->W()Landroid/graphics/Paint;

    move-result-object v0

    iget-object v1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->c:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->X()F

    move-result v1

    iget-object v3, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->c:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-virtual {v3}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->Y()F

    move-result v3

    invoke-static {v0, v1, v3}, Lna/m;->a(Landroid/graphics/Paint;FF)Lcom/zykj/board/EzyPaint$Paint;

    .line 12
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->c:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lv9/c;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v5}, Lba/c;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v7}, Lv9/c;->f(Ljava/lang/String;Lba/c;)V

    .line 13
    :cond_2
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->c:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-static {v0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->K(Lcom/zykj/blackboard/core/action/BaseWriteAction;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iget-object v3, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->c:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    new-instance v1, Lcom/zykj/blackboard/core/action/a;

    invoke-direct/range {v1 .. v7}, Lcom/zykj/blackboard/core/action/a;-><init>(Lr9/b;Lcom/zykj/blackboard/core/action/BaseWriteAction;Ljava/util/List;Lba/c;Ljava/lang/String;Lba/a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void

    .line 14
    :cond_3
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->c:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    iget-object v1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->d:Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->E(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    return-void
.end method
