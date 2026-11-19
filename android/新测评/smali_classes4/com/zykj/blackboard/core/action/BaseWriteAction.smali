.class public abstract Lcom/zykj/blackboard/core/action/BaseWriteAction;
.super Lcom/zykj/blackboard/core/action/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/action/BaseWriteAction$a;
    }
.end annotation


# static fields
.field public static final D:Lcom/zykj/blackboard/core/action/BaseWriteAction$a;

.field public static final E:Ljava/util/concurrent/ExecutorService;


# instance fields
.field public A:Z

.field public B:Z

.field public final C:Ljava/util/concurrent/ExecutorService;

.field public final p:Ljava/util/List;

.field public q:Landroid/graphics/Path;

.field public r:Landroid/graphics/Paint;

.field public s:F

.field public t:F

.field public u:F

.field public v:F

.field public w:Lq4/c;

.field public x:Lq4/c;

.field public y:J

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/blackboard/core/action/BaseWriteAction$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/zykj/blackboard/core/action/BaseWriteAction$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->D:Lcom/zykj/blackboard/core/action/BaseWriteAction$a;

    .line 8
    .line 9
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->E:Ljava/util/concurrent/ExecutorService;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/blackboard/core/action/b;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->p:Ljava/util/List;

    .line 10
    .line 11
    new-instance v0, Landroid/graphics/Path;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->q:Landroid/graphics/Path;

    .line 17
    .line 18
    new-instance v0, Landroid/graphics/Paint;

    .line 19
    .line 20
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->r:Landroid/graphics/Paint;

    .line 24
    .line 25
    const/high16 v0, 0x41f00000    # 30.0f

    .line 26
    .line 27
    iput v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->s:F

    .line 28
    .line 29
    const/high16 v0, 0x41700000    # 15.0f

    .line 30
    .line 31
    iput v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->t:F

    .line 32
    .line 33
    sget-object v0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->E:Ljava/util/concurrent/ExecutorService;

    .line 34
    .line 35
    iput-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->C:Ljava/util/concurrent/ExecutorService;

    .line 36
    .line 37
    return-void
.end method

.method public static final synthetic I(Lcom/zykj/blackboard/core/action/BaseWriteAction;)Lq4/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->w:Lq4/c;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic J(Lcom/zykj/blackboard/core/action/BaseWriteAction;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->y:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static final synthetic K(Lcom/zykj/blackboard/core/action/BaseWriteAction;)Ljava/util/concurrent/ExecutorService;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->C:Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic L(Lcom/zykj/blackboard/core/action/BaseWriteAction;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->z:Z

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic M(Lcom/zykj/blackboard/core/action/BaseWriteAction;Lq4/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->w:Lq4/c;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic N(Lcom/zykj/blackboard/core/action/BaseWriteAction;Lq4/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->x:Lq4/c;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic O(Lcom/zykj/blackboard/core/action/BaseWriteAction;J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->y:J

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic P(Lcom/zykj/blackboard/core/action/BaseWriteAction;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->B:Z

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public E(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 6

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->B:Z

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    if-eqz p1, :cond_2

    .line 10
    .line 11
    iget-boolean p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->z:Z

    .line 12
    .line 13
    if-eqz p1, :cond_2

    .line 14
    .line 15
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->w:Lq4/c;

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->h()Lg4/b;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const/4 v2, 0x1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    new-array v3, v2, [Lq4/c;

    .line 27
    .line 28
    aput-object p1, v3, v0

    .line 29
    .line 30
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 35
    .line 36
    .line 37
    move-result-wide v4

    .line 38
    invoke-interface {v1, v3, v4, v5}, Lg4/b;->n(Ljava/util/List;J)V

    .line 39
    .line 40
    .line 41
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lk4/c;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    new-array v2, v2, [Lq4/c;

    .line 48
    .line 49
    aput-object p1, v2, v0

    .line 50
    .line 51
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-interface {v1, p1}, Lk4/c;->q(Ljava/util/List;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    iget-object p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->x:Lq4/c;

    .line 59
    .line 60
    iput-object p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->w:Lq4/c;

    .line 61
    .line 62
    :cond_2
    iput-boolean v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->B:Z

    .line 63
    .line 64
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->g()Lk4/c;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    if-eqz p1, :cond_3

    .line 69
    .line 70
    invoke-interface {p1}, Lk4/c;->e()V

    .line 71
    .line 72
    .line 73
    :cond_3
    return-void
.end method

.method public F(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchDown$1;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchDown$1;-><init>(Lcom/zykj/blackboard/core/action/BaseWriteAction;Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, v0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->j(Lcom/zykj/board/EzyTouchEvent$TouchEvent;Lkotlin/jvm/functions/Function0;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public G(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchMove$1;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchMove$1;-><init>(Lcom/zykj/blackboard/core/action/BaseWriteAction;Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, v0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->j(Lcom/zykj/board/EzyTouchEvent$TouchEvent;Lkotlin/jvm/functions/Function0;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public H(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;-><init>(Lcom/zykj/blackboard/core/action/BaseWriteAction;Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, v0}, Lcom/zykj/blackboard/core/action/BaseTouchAction;->j(Lcom/zykj/board/EzyTouchEvent$TouchEvent;Lkotlin/jvm/functions/Function0;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public abstract Q(Ljava/lang/String;)Lq4/a;
.end method

.method public final R()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->p:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public abstract S()Lcom/zykj/board/EzyGraphEnum$GraphEnum;
.end method

.method public final T()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->u:F

    .line 2
    .line 3
    return v0
.end method

.method public final U()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->v:F

    .line 2
    .line 3
    return v0
.end method

.method public final V()Landroid/graphics/Paint;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->r:Landroid/graphics/Paint;

    .line 2
    .line 3
    return-object v0
.end method

.method public final W()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->s:F

    .line 2
    .line 3
    return v0
.end method

.method public final X()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->t:F

    .line 2
    .line 3
    return v0
.end method

.method public final Y()Landroid/graphics/Path;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->q:Landroid/graphics/Path;

    .line 2
    .line 3
    return-object v0
.end method

.method public abstract Z(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
.end method

.method public abstract a0(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
.end method

.method public abstract b0(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
.end method

.method public abstract c0()V
.end method

.method public final d0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->A:Z

    .line 2
    .line 3
    return v0
.end method

.method public e0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->p:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->q:Landroid/graphics/Path;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->u:F

    .line 13
    .line 14
    iput v0, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->v:F

    .line 15
    .line 16
    return-void
.end method

.method public final f0(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->A:Z

    .line 2
    .line 3
    return-void
.end method

.method public final g0(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->u:F

    .line 2
    .line 3
    return-void
.end method

.method public final h0(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->v:F

    .line 2
    .line 3
    return-void
.end method

.method public final i0(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->s:F

    .line 2
    .line 3
    return-void
.end method

.method public final j0(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/blackboard/core/action/BaseWriteAction;->t:F

    .line 2
    .line 3
    return-void
.end method
