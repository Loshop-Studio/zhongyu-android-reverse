.class final Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


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

    iput-object p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->a:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    iput-object p2, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->b:Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lw4/b;Lcom/zykj/blackboard/core/action/BaseWriteAction;Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;Lg5/c;Ljava/lang/String;Lg5/a;)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->c(Lw4/b;Lcom/zykj/blackboard/core/action/BaseWriteAction;Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;Lg5/c;Ljava/lang/String;Lg5/a;)V

    return-void
.end method

.method public static final c(Lw4/b;Lcom/zykj/blackboard/core/action/BaseWriteAction;Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;Lg5/c;Ljava/lang/String;Lg5/a;)V
    .locals 7

    .line 1
    const-string v0, "$actionListener"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "this$0"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$eventsSnapshot"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "$ezyPaint"

    .line 17
    .line 18
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "$groupGraph"

    .line 22
    .line 23
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "$graphId"

    .line 27
    .line 28
    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v0, "$graph"

    .line 32
    .line 33
    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->T()Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-interface {p4}, Lg5/c;->getId()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    move-object v1, p0

    .line 45
    move-object v3, p2

    .line 46
    move-object v4, p3

    .line 47
    move-object v6, p5

    .line 48
    invoke-interface/range {v1 .. v6}, Lw4/b;->f(Lcom/zykj/board/EzyGraphEnum$GraphEnum;Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;Ljava/lang/String;Ljava/lang/String;)Lg5/a;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    instance-of p2, p6, Lj5/c;

    .line 53
    .line 54
    if-eqz p2, :cond_0

    .line 55
    .line 56
    instance-of p2, p0, Lj5/c;

    .line 57
    .line 58
    if-eqz p2, :cond_0

    .line 59
    .line 60
    check-cast p6, Lj5/c;

    .line 61
    .line 62
    invoke-interface {v1}, Lw4/b;->q()Ll5/e;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    invoke-virtual {p6, p2}, Lj5/c;->O(Ll5/e;)V

    .line 67
    .line 68
    .line 69
    check-cast p0, Lj5/c;

    .line 70
    .line 71
    invoke-virtual {p0}, Lj5/c;->v()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    invoke-virtual {p6, p2}, Lj5/c;->M(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, Lj5/c;->w()Ljava/lang/Integer;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-virtual {p6, p0}, Lj5/c;->N(Ljava/lang/Integer;)V

    .line 83
    .line 84
    .line 85
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->h()Lw4/b;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    if-eqz p0, :cond_1

    .line 90
    .line 91
    invoke-interface {p0}, Lw4/b;->l()V

    .line 92
    .line 93
    .line 94
    :cond_1
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 9

    .line 2
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->a:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->P(Lcom/zykj/blackboard/core/action/BaseWriteAction;Z)V

    .line 3
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->a:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    iget-object v1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->b:Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->c0(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 4
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->a:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->O(Lcom/zykj/blackboard/core/action/BaseWriteAction;J)V

    .line 5
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->a:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-static {v0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->I(Lcom/zykj/blackboard/core/action/BaseWriteAction;)Lg5/c;

    move-result-object v6

    if-nez v6, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->a:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->h()Lw4/b;

    move-result-object v2

    if-nez v2, :cond_1

    :goto_0
    return-void

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->a:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->S()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 8
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->a:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    iget-object v1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->b:Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->E(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    return-void

    .line 9
    :cond_2
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v7

    const-string v0, "randomUUID().toString()"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->a:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-virtual {v0, v7}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->Q(Ljava/lang/String;)Lg5/a;

    move-result-object v8

    .line 11
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->a:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->S()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v4

    .line 12
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->a:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->W()Landroid/graphics/Paint;

    move-result-object v0

    iget-object v1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->a:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->X()F

    move-result v1

    iget-object v3, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->a:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-virtual {v3}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->Y()F

    move-result v3

    invoke-static {v0, v1, v3}, Lu5/m;->a(Landroid/graphics/Paint;FF)Lcom/zykj/board/EzyPaint$Paint;

    move-result-object v5

    .line 13
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->a:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()La5/c;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-interface {v6}, Lg5/c;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, v8}, La5/c;->y(Ljava/lang/String;Lg5/c;)V

    .line 14
    :cond_3
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->a:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->f()Lv4/b;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 15
    invoke-virtual {v0}, Lv4/b;->G()Lt5/a;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 16
    iget-object v1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->a:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-virtual {v1}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->W()Landroid/graphics/Paint;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Paint;->getColor()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Lt5/a;->b(Ljava/lang/Integer;)V

    .line 17
    :cond_4
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->a:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    invoke-static {v0}, Lcom/zykj/blackboard/core/action/BaseWriteAction;->K(Lcom/zykj/blackboard/core/action/BaseWriteAction;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iget-object v3, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->a:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    new-instance v1, Lcom/zykj/blackboard/core/action/a;

    invoke-direct/range {v1 .. v8}, Lcom/zykj/blackboard/core/action/a;-><init>(Lw4/b;Lcom/zykj/blackboard/core/action/BaseWriteAction;Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;Lg5/c;Ljava/lang/String;Lg5/a;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method
