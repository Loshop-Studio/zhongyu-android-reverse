.class public final Landroidx/compose/animation/core/DeferredTargetAnimation;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/animation/core/ExperimentalAnimatableApi;
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "V:",
        "Landroidx/compose/animation/core/AnimationVector;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final _pendingTarget$delegate:Landroidx/compose/runtime/MutableState;

.field private animatable:Landroidx/compose/animation/core/Animatable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/Animatable<",
            "TT;TV;>;"
        }
    .end annotation
.end field

.field private final vectorConverter:Landroidx/compose/animation/core/TwoWayConverter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/TwoWayConverter<",
            "TT;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/animation/core/TwoWayConverter;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/animation/core/TwoWayConverter<",
            "TT;TV;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/animation/core/DeferredTargetAnimation;->vectorConverter:Landroidx/compose/animation/core/TwoWayConverter;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    const/4 v0, 0x2

    .line 8
    invoke-static {p1, p1, v0, p1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Landroidx/compose/animation/core/DeferredTargetAnimation;->_pendingTarget$delegate:Landroidx/compose/runtime/MutableState;

    .line 13
    .line 14
    return-void
.end method

.method public static final synthetic access$get_pendingTarget(Landroidx/compose/animation/core/DeferredTargetAnimation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/animation/core/DeferredTargetAnimation;->get_pendingTarget()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final getTarget()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/animation/core/DeferredTargetAnimation;->animatable:Landroidx/compose/animation/core/Animatable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/compose/animation/core/Animatable;->getTargetValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method private final get_pendingTarget()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/animation/core/DeferredTargetAnimation;->_pendingTarget$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method private final set_pendingTarget(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/animation/core/DeferredTargetAnimation;->_pendingTarget$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic updateTarget$default(Landroidx/compose/animation/core/DeferredTargetAnimation;Ljava/lang/Object;Lsd/i0;Landroidx/compose/animation/core/FiniteAnimationSpec;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x7

    .line 6
    const/4 p4, 0x0

    .line 7
    const/4 p5, 0x0

    .line 8
    invoke-static {p4, p4, p5, p3, p5}, Landroidx/compose/animation/core/AnimationSpecKt;->spring$default(FFLjava/lang/Object;ILjava/lang/Object;)Landroidx/compose/animation/core/SpringSpec;

    .line 9
    .line 10
    .line 11
    move-result-object p3

    .line 12
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/animation/core/DeferredTargetAnimation;->updateTarget(Ljava/lang/Object;Lsd/i0;Landroidx/compose/animation/core/FiniteAnimationSpec;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method


# virtual methods
.method public final getPendingTarget()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/compose/animation/core/DeferredTargetAnimation;->get_pendingTarget()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final isIdle()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/compose/animation/core/DeferredTargetAnimation;->get_pendingTarget()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0}, Landroidx/compose/animation/core/DeferredTargetAnimation;->getTarget()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Landroidx/compose/animation/core/DeferredTargetAnimation;->animatable:Landroidx/compose/animation/core/Animatable;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {v0}, Landroidx/compose/animation/core/Animatable;->isRunning()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-ne v0, v1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return v1

    .line 28
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 29
    return v0
.end method

.method public final updateTarget(Ljava/lang/Object;Lsd/i0;Landroidx/compose/animation/core/FiniteAnimationSpec;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lsd/i0;",
            "Landroidx/compose/animation/core/FiniteAnimationSpec<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/animation/core/DeferredTargetAnimation;->set_pendingTarget(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/compose/animation/core/DeferredTargetAnimation;->animatable:Landroidx/compose/animation/core/Animatable;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v1, Landroidx/compose/animation/core/Animatable;

    .line 9
    .line 10
    iget-object v3, p0, Landroidx/compose/animation/core/DeferredTargetAnimation;->vectorConverter:Landroidx/compose/animation/core/TwoWayConverter;

    .line 11
    .line 12
    const/16 v6, 0xc

    .line 13
    .line 14
    const/4 v7, 0x0

    .line 15
    const/4 v4, 0x0

    .line 16
    const/4 v5, 0x0

    .line 17
    move-object v2, p1

    .line 18
    invoke-direct/range {v1 .. v7}, Landroidx/compose/animation/core/Animatable;-><init>(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 19
    .line 20
    .line 21
    iput-object v1, p0, Landroidx/compose/animation/core/DeferredTargetAnimation;->animatable:Landroidx/compose/animation/core/Animatable;

    .line 22
    .line 23
    move-object v3, v1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v2, p1

    .line 26
    move-object v3, v0

    .line 27
    :goto_0
    new-instance v7, Landroidx/compose/animation/core/DeferredTargetAnimation$updateTarget$1;

    .line 28
    .line 29
    move-object v5, v2

    .line 30
    move-object v2, v7

    .line 31
    const/4 v7, 0x0

    .line 32
    move-object v4, p0

    .line 33
    move-object v6, p3

    .line 34
    invoke-direct/range {v2 .. v7}, Landroidx/compose/animation/core/DeferredTargetAnimation$updateTarget$1;-><init>(Landroidx/compose/animation/core/Animatable;Landroidx/compose/animation/core/DeferredTargetAnimation;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Lvc/c;)V

    .line 35
    .line 36
    .line 37
    const/4 v8, 0x3

    .line 38
    const/4 v9, 0x0

    .line 39
    const/4 v5, 0x0

    .line 40
    const/4 v6, 0x0

    .line 41
    move-object v4, p2

    .line 42
    move-object v7, v2

    .line 43
    invoke-static/range {v4 .. v9}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3}, Landroidx/compose/animation/core/Animatable;->getValue()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    return-object p1
.end method
