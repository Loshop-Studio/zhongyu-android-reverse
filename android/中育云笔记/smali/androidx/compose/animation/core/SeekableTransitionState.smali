.class public final Landroidx/compose/animation/core/SeekableTransitionState;
.super Landroidx/compose/animation/core/TransitionState;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/animation/core/SeekableTransitionState$Companion;,
        Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Ljava/lang/Object;",
        ">",
        "Landroidx/compose/animation/core/TransitionState<",
        "TS;>;"
    }
.end annotation


# static fields
.field public static final $stable:I

.field private static final Companion:Landroidx/compose/animation/core/SeekableTransitionState$Companion;

.field private static final Target1:Landroidx/compose/animation/core/AnimationVector1D;

.field private static final ZeroVelocity:Landroidx/compose/animation/core/AnimationVector1D;


# instance fields
.field private final animateOneFrameLambda:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field private composedTargetState:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TS;"
        }
    .end annotation
.end field

.field private compositionContinuation:Lsd/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsd/j;"
        }
    .end annotation
.end field

.field private final compositionContinuationMutex:Lbe/a;

.field private currentAnimation:Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;

.field private final currentState$delegate:Landroidx/compose/runtime/MutableState;

.field private durationScale:F

.field private final firstFrameLambda:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field private final fraction$delegate:Landroidx/compose/runtime/MutableFloatState;

.field private final initialValueAnimations:Landroidx/collection/MutableObjectList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableObjectList<",
            "Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;",
            ">;"
        }
    .end annotation
.end field

.field private lastFrameTimeNanos:J

.field private final mutatorMutex:Landroidx/compose/animation/core/MutatorMutex;

.field private final recalculateTotalDurationNanos:Lhd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/a;"
        }
    .end annotation
.end field

.field private final targetState$delegate:Landroidx/compose/runtime/MutableState;

.field private totalDurationNanos:J

.field private transition:Landroidx/compose/animation/core/Transition;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/Transition<",
            "TS;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/animation/core/SeekableTransitionState$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/compose/animation/core/SeekableTransitionState$Companion;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/compose/animation/core/SeekableTransitionState;->Companion:Landroidx/compose/animation/core/SeekableTransitionState$Companion;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Landroidx/compose/animation/core/SeekableTransitionState;->$stable:I

    .line 12
    .line 13
    new-instance v0, Landroidx/compose/animation/core/AnimationVector1D;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {v0, v1}, Landroidx/compose/animation/core/AnimationVector1D;-><init>(F)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Landroidx/compose/animation/core/SeekableTransitionState;->ZeroVelocity:Landroidx/compose/animation/core/AnimationVector1D;

    .line 20
    .line 21
    new-instance v0, Landroidx/compose/animation/core/AnimationVector1D;

    .line 22
    .line 23
    const/high16 v1, 0x3f800000    # 1.0f

    .line 24
    .line 25
    invoke-direct {v0, v1}, Landroidx/compose/animation/core/AnimationVector1D;-><init>(F)V

    .line 26
    .line 27
    .line 28
    sput-object v0, Landroidx/compose/animation/core/SeekableTransitionState;->Target1:Landroidx/compose/animation/core/AnimationVector1D;

    .line 29
    .line 30
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TS;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Landroidx/compose/animation/core/TransitionState;-><init>(Lkotlin/jvm/internal/n;)V

    .line 3
    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    invoke-static {p1, v0, v1, v0}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    iput-object v2, p0, Landroidx/compose/animation/core/SeekableTransitionState;->targetState$delegate:Landroidx/compose/runtime/MutableState;

    .line 11
    .line 12
    invoke-static {p1, v0, v1, v0}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iput-object v1, p0, Landroidx/compose/animation/core/SeekableTransitionState;->currentState$delegate:Landroidx/compose/runtime/MutableState;

    .line 17
    .line 18
    iput-object p1, p0, Landroidx/compose/animation/core/SeekableTransitionState;->composedTargetState:Ljava/lang/Object;

    .line 19
    .line 20
    new-instance p1, Landroidx/compose/animation/core/SeekableTransitionState$recalculateTotalDurationNanos$1;

    .line 21
    .line 22
    invoke-direct {p1, p0}, Landroidx/compose/animation/core/SeekableTransitionState$recalculateTotalDurationNanos$1;-><init>(Landroidx/compose/animation/core/SeekableTransitionState;)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Landroidx/compose/animation/core/SeekableTransitionState;->recalculateTotalDurationNanos:Lhd/a;

    .line 26
    .line 27
    const/4 p1, 0x0

    .line 28
    invoke-static {p1}, Landroidx/compose/runtime/PrimitiveSnapshotStateKt;->mutableFloatStateOf(F)Landroidx/compose/runtime/MutableFloatState;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, Landroidx/compose/animation/core/SeekableTransitionState;->fraction$delegate:Landroidx/compose/runtime/MutableFloatState;

    .line 33
    .line 34
    const/4 p1, 0x0

    .line 35
    const/4 v1, 0x1

    .line 36
    invoke-static {p1, v1, v0}, Lbe/f;->b(ZILjava/lang/Object;)Lbe/a;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    iput-object v2, p0, Landroidx/compose/animation/core/SeekableTransitionState;->compositionContinuationMutex:Lbe/a;

    .line 41
    .line 42
    new-instance v2, Landroidx/compose/animation/core/MutatorMutex;

    .line 43
    .line 44
    invoke-direct {v2}, Landroidx/compose/animation/core/MutatorMutex;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object v2, p0, Landroidx/compose/animation/core/SeekableTransitionState;->mutatorMutex:Landroidx/compose/animation/core/MutatorMutex;

    .line 48
    .line 49
    const-wide/high16 v2, -0x8000000000000000L

    .line 50
    .line 51
    iput-wide v2, p0, Landroidx/compose/animation/core/SeekableTransitionState;->lastFrameTimeNanos:J

    .line 52
    .line 53
    new-instance v2, Landroidx/collection/MutableObjectList;

    .line 54
    .line 55
    invoke-direct {v2, p1, v1, v0}, Landroidx/collection/MutableObjectList;-><init>(IILkotlin/jvm/internal/n;)V

    .line 56
    .line 57
    .line 58
    iput-object v2, p0, Landroidx/compose/animation/core/SeekableTransitionState;->initialValueAnimations:Landroidx/collection/MutableObjectList;

    .line 59
    .line 60
    new-instance p1, Landroidx/compose/animation/core/SeekableTransitionState$firstFrameLambda$1;

    .line 61
    .line 62
    invoke-direct {p1, p0}, Landroidx/compose/animation/core/SeekableTransitionState$firstFrameLambda$1;-><init>(Landroidx/compose/animation/core/SeekableTransitionState;)V

    .line 63
    .line 64
    .line 65
    iput-object p1, p0, Landroidx/compose/animation/core/SeekableTransitionState;->firstFrameLambda:Lhd/l;

    .line 66
    .line 67
    new-instance p1, Landroidx/compose/animation/core/SeekableTransitionState$animateOneFrameLambda$1;

    .line 68
    .line 69
    invoke-direct {p1, p0}, Landroidx/compose/animation/core/SeekableTransitionState$animateOneFrameLambda$1;-><init>(Landroidx/compose/animation/core/SeekableTransitionState;)V

    .line 70
    .line 71
    .line 72
    iput-object p1, p0, Landroidx/compose/animation/core/SeekableTransitionState;->animateOneFrameLambda:Lhd/l;

    .line 73
    .line 74
    return-void
.end method

.method public static final synthetic access$animateOneFrame(Landroidx/compose/animation/core/SeekableTransitionState;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/animation/core/SeekableTransitionState;->animateOneFrame(Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$doOneFrame(Landroidx/compose/animation/core/SeekableTransitionState;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/animation/core/SeekableTransitionState;->doOneFrame(Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$endAllAnimations(Landroidx/compose/animation/core/SeekableTransitionState;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/animation/core/SeekableTransitionState;->endAllAnimations()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getCompanion$p()Landroidx/compose/animation/core/SeekableTransitionState$Companion;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/animation/core/SeekableTransitionState;->Companion:Landroidx/compose/animation/core/SeekableTransitionState$Companion;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getCurrentAnimation$p(Landroidx/compose/animation/core/SeekableTransitionState;)Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/animation/core/SeekableTransitionState;->currentAnimation:Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getDurationScale$p(Landroidx/compose/animation/core/SeekableTransitionState;)F
    .locals 0

    .line 1
    iget p0, p0, Landroidx/compose/animation/core/SeekableTransitionState;->durationScale:F

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic access$getInitialValueAnimations$p(Landroidx/compose/animation/core/SeekableTransitionState;)Landroidx/collection/MutableObjectList;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/animation/core/SeekableTransitionState;->initialValueAnimations:Landroidx/collection/MutableObjectList;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getLastFrameTimeNanos$p(Landroidx/compose/animation/core/SeekableTransitionState;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/compose/animation/core/SeekableTransitionState;->lastFrameTimeNanos:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static final synthetic access$getTarget1$cp()Landroidx/compose/animation/core/AnimationVector1D;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/animation/core/SeekableTransitionState;->Target1:Landroidx/compose/animation/core/AnimationVector1D;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getTransition$p(Landroidx/compose/animation/core/SeekableTransitionState;)Landroidx/compose/animation/core/Transition;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/animation/core/SeekableTransitionState;->transition:Landroidx/compose/animation/core/Transition;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getZeroVelocity$cp()Landroidx/compose/animation/core/AnimationVector1D;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/animation/core/SeekableTransitionState;->ZeroVelocity:Landroidx/compose/animation/core/AnimationVector1D;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$moveAnimationToInitialState(Landroidx/compose/animation/core/SeekableTransitionState;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/animation/core/SeekableTransitionState;->moveAnimationToInitialState()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$recalculateAnimationValue(Landroidx/compose/animation/core/SeekableTransitionState;Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;J)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/animation/core/SeekableTransitionState;->recalculateAnimationValue(Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;J)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$runAnimations(Landroidx/compose/animation/core/SeekableTransitionState;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/animation/core/SeekableTransitionState;->runAnimations(Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$seekToFraction(Landroidx/compose/animation/core/SeekableTransitionState;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/animation/core/SeekableTransitionState;->seekToFraction()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$setCurrentAnimation$p(Landroidx/compose/animation/core/SeekableTransitionState;Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/animation/core/SeekableTransitionState;->currentAnimation:Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setFraction(Landroidx/compose/animation/core/SeekableTransitionState;F)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/animation/core/SeekableTransitionState;->setFraction(F)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$setLastFrameTimeNanos$p(Landroidx/compose/animation/core/SeekableTransitionState;J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Landroidx/compose/animation/core/SeekableTransitionState;->lastFrameTimeNanos:J

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$waitForComposition(Landroidx/compose/animation/core/SeekableTransitionState;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/animation/core/SeekableTransitionState;->waitForComposition(Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$waitForCompositionAfterTargetStateChange(Landroidx/compose/animation/core/SeekableTransitionState;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/animation/core/SeekableTransitionState;->waitForCompositionAfterTargetStateChange(Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final animateOneFrame(Lvc/c;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lvc/c;->getContext()Lkotlin/coroutines/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroidx/compose/animation/core/SuspendAnimationKt;->getDurationScale(Lkotlin/coroutines/d;)F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    cmpg-float v1, v0, v1

    .line 11
    .line 12
    if-gtz v1, :cond_0

    .line 13
    .line 14
    invoke-direct {p0}, Landroidx/compose/animation/core/SeekableTransitionState;->endAllAnimations()V

    .line 15
    .line 16
    .line 17
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    iput v0, p0, Landroidx/compose/animation/core/SeekableTransitionState;->durationScale:F

    .line 21
    .line 22
    iget-object v0, p0, Landroidx/compose/animation/core/SeekableTransitionState;->animateOneFrameLambda:Lhd/l;

    .line 23
    .line 24
    invoke-static {v0, p1}, Landroidx/compose/runtime/MonotonicFrameClockKt;->withFrameNanos(Lhd/l;Lvc/c;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-ne p1, v0, :cond_1

    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_1
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 36
    .line 37
    return-object p1
.end method

.method public static synthetic animateTo$default(Landroidx/compose/animation/core/SeekableTransitionState;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Lvc/c;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/compose/animation/core/SeekableTransitionState;->getTargetState()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :cond_0
    and-int/lit8 p4, p4, 0x2

    .line 10
    .line 11
    if-eqz p4, :cond_1

    .line 12
    .line 13
    const/4 p2, 0x0

    .line 14
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/animation/core/SeekableTransitionState;->animateTo(Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Lvc/c;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method private final doOneFrame(Lvc/c;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-wide v0, p0, Landroidx/compose/animation/core/SeekableTransitionState;->lastFrameTimeNanos:J

    .line 2
    .line 3
    const-wide/high16 v2, -0x8000000000000000L

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/compose/animation/core/SeekableTransitionState;->firstFrameLambda:Lhd/l;

    .line 10
    .line 11
    invoke-static {v0, p1}, Landroidx/compose/runtime/MonotonicFrameClockKt;->withFrameNanos(Lhd/l;Lvc/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-ne p1, v0, :cond_0

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_1
    invoke-direct {p0, p1}, Landroidx/compose/animation/core/SeekableTransitionState;->animateOneFrame(Lvc/c;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-ne p1, v0, :cond_2

    .line 34
    .line 35
    return-object p1

    .line 36
    :cond_2
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 37
    .line 38
    return-object p1
.end method

.method private final endAllAnimations()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/animation/core/SeekableTransitionState;->transition:Landroidx/compose/animation/core/Transition;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/compose/animation/core/Transition;->clearInitialAnimations$animation_core_release()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Landroidx/compose/animation/core/SeekableTransitionState;->initialValueAnimations:Landroidx/collection/MutableObjectList;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/collection/MutableObjectList;->clear()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Landroidx/compose/animation/core/SeekableTransitionState;->currentAnimation:Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Landroidx/compose/animation/core/SeekableTransitionState;->currentAnimation:Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;

    .line 19
    .line 20
    const/high16 v0, 0x3f800000    # 1.0f

    .line 21
    .line 22
    invoke-direct {p0, v0}, Landroidx/compose/animation/core/SeekableTransitionState;->setFraction(F)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0}, Landroidx/compose/animation/core/SeekableTransitionState;->seekToFraction()V

    .line 26
    .line 27
    .line 28
    :cond_1
    return-void
.end method

.method private final moveAnimationToInitialState()V
    .locals 9

    .line 1
    iget-object v0, p0, Landroidx/compose/animation/core/SeekableTransitionState;->transition:Landroidx/compose/animation/core/Transition;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v1, p0, Landroidx/compose/animation/core/SeekableTransitionState;->currentAnimation:Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-nez v1, :cond_4

    .line 10
    .line 11
    iget-wide v3, p0, Landroidx/compose/animation/core/SeekableTransitionState;->totalDurationNanos:J

    .line 12
    .line 13
    const-wide/16 v5, 0x0

    .line 14
    .line 15
    cmp-long v1, v3, v5

    .line 16
    .line 17
    if-lez v1, :cond_3

    .line 18
    .line 19
    invoke-virtual {p0}, Landroidx/compose/animation/core/SeekableTransitionState;->getFraction()F

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/high16 v3, 0x3f800000    # 1.0f

    .line 24
    .line 25
    cmpg-float v1, v1, v3

    .line 26
    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-virtual {p0}, Landroidx/compose/animation/core/SeekableTransitionState;->getCurrentState()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {p0}, Landroidx/compose/animation/core/SeekableTransitionState;->getTargetState()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    new-instance v1, Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;

    .line 46
    .line 47
    invoke-direct {v1}, Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Landroidx/compose/animation/core/SeekableTransitionState;->getFraction()F

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    invoke-virtual {v1, v3}, Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;->setValue(F)V

    .line 55
    .line 56
    .line 57
    iget-wide v3, p0, Landroidx/compose/animation/core/SeekableTransitionState;->totalDurationNanos:J

    .line 58
    .line 59
    invoke-virtual {v1, v3, v4}, Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;->setDurationNanos(J)V

    .line 60
    .line 61
    .line 62
    long-to-double v3, v3

    .line 63
    invoke-virtual {p0}, Landroidx/compose/animation/core/SeekableTransitionState;->getFraction()F

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    float-to-double v5, v5

    .line 68
    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    .line 69
    .line 70
    sub-double/2addr v7, v5

    .line 71
    mul-double/2addr v3, v7

    .line 72
    invoke-static {v3, v4}, Ljd/c;->e(D)J

    .line 73
    .line 74
    .line 75
    move-result-wide v3

    .line 76
    invoke-virtual {v1, v3, v4}, Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;->setAnimationSpecDuration(J)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;->getStart()Landroidx/compose/animation/core/AnimationVector1D;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    const/4 v4, 0x0

    .line 84
    invoke-virtual {p0}, Landroidx/compose/animation/core/SeekableTransitionState;->getFraction()F

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    invoke-virtual {v3, v4, v5}, Landroidx/compose/animation/core/AnimationVector1D;->set$animation_core_release(IF)V

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_3
    :goto_0
    move-object v1, v2

    .line 93
    :cond_4
    :goto_1
    if-eqz v1, :cond_5

    .line 94
    .line 95
    iget-wide v3, p0, Landroidx/compose/animation/core/SeekableTransitionState;->totalDurationNanos:J

    .line 96
    .line 97
    invoke-virtual {v1, v3, v4}, Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;->setDurationNanos(J)V

    .line 98
    .line 99
    .line 100
    iget-object v3, p0, Landroidx/compose/animation/core/SeekableTransitionState;->initialValueAnimations:Landroidx/collection/MutableObjectList;

    .line 101
    .line 102
    invoke-virtual {v3, v1}, Landroidx/collection/MutableObjectList;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, v1}, Landroidx/compose/animation/core/Transition;->setInitialAnimations$animation_core_release(Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;)V

    .line 106
    .line 107
    .line 108
    :cond_5
    iput-object v2, p0, Landroidx/compose/animation/core/SeekableTransitionState;->currentAnimation:Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;

    .line 109
    .line 110
    return-void
.end method

.method private final recalculateAnimationValue(Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;J)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;->getProgressNanos()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    add-long v3, v0, p2

    .line 6
    .line 7
    invoke-virtual {p1, v3, v4}, Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;->setProgressNanos(J)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;->getAnimationSpecDuration()J

    .line 11
    .line 12
    .line 13
    move-result-wide p2

    .line 14
    cmp-long v0, v3, p2

    .line 15
    .line 16
    const/high16 v1, 0x3f800000    # 1.0f

    .line 17
    .line 18
    if-ltz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1, v1}, Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;->setValue(F)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    invoke-virtual {p1}, Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;->getAnimationSpec()Landroidx/compose/animation/core/VectorizedAnimationSpec;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    const/4 v0, 0x0

    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    invoke-virtual {p1}, Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;->getStart()Landroidx/compose/animation/core/AnimationVector1D;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    sget-object v6, Landroidx/compose/animation/core/SeekableTransitionState;->Target1:Landroidx/compose/animation/core/AnimationVector1D;

    .line 36
    .line 37
    invoke-virtual {p1}, Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;->getInitialVelocity()Landroidx/compose/animation/core/AnimationVector1D;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    if-nez p2, :cond_1

    .line 42
    .line 43
    sget-object p2, Landroidx/compose/animation/core/SeekableTransitionState;->ZeroVelocity:Landroidx/compose/animation/core/AnimationVector1D;

    .line 44
    .line 45
    :cond_1
    move-object v7, p2

    .line 46
    invoke-interface/range {v2 .. v7}, Landroidx/compose/animation/core/VectorizedAnimationSpec;->getValueFromNanos(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    check-cast p2, Landroidx/compose/animation/core/AnimationVector1D;

    .line 51
    .line 52
    invoke-virtual {p2, v0}, Landroidx/compose/animation/core/AnimationVector1D;->get$animation_core_release(I)F

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    const/4 p3, 0x0

    .line 57
    invoke-static {p2, p3, v1}, Lnd/o;->m(FFF)F

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    invoke-virtual {p1, p2}, Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;->setValue(F)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_2
    invoke-virtual {p1}, Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;->getStart()Landroidx/compose/animation/core/AnimationVector1D;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v2, v0}, Landroidx/compose/animation/core/AnimationVector1D;->get$animation_core_release(I)F

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    long-to-float v2, v3

    .line 74
    long-to-float p2, p2

    .line 75
    div-float/2addr v2, p2

    .line 76
    const/4 p2, 0x1

    .line 77
    int-to-float p2, p2

    .line 78
    sub-float/2addr p2, v2

    .line 79
    mul-float/2addr v0, p2

    .line 80
    mul-float/2addr v2, v1

    .line 81
    add-float/2addr v0, v2

    .line 82
    invoke-virtual {p1, v0}, Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;->setValue(F)V

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method private final runAnimations(Lvc/c;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Landroidx/compose/animation/core/SeekableTransitionState$runAnimations$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Landroidx/compose/animation/core/SeekableTransitionState$runAnimations$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/compose/animation/core/SeekableTransitionState$runAnimations$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/compose/animation/core/SeekableTransitionState$runAnimations$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/compose/animation/core/SeekableTransitionState$runAnimations$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Landroidx/compose/animation/core/SeekableTransitionState$runAnimations$1;-><init>(Landroidx/compose/animation/core/SeekableTransitionState;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Landroidx/compose/animation/core/SeekableTransitionState$runAnimations$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/compose/animation/core/SeekableTransitionState$runAnimations$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    const-wide/high16 v5, -0x8000000000000000L

    .line 36
    .line 37
    if-eqz v2, :cond_3

    .line 38
    .line 39
    if-eq v2, v4, :cond_2

    .line 40
    .line 41
    if-ne v2, v3, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 47
    .line 48
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p1

    .line 52
    :cond_2
    :goto_1
    iget-object v2, v0, Landroidx/compose/animation/core/SeekableTransitionState$runAnimations$1;->L$0:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v2, Landroidx/compose/animation/core/SeekableTransitionState;

    .line 55
    .line 56
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_3
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-object p1, p0, Landroidx/compose/animation/core/SeekableTransitionState;->initialValueAnimations:Landroidx/collection/MutableObjectList;

    .line 64
    .line 65
    invoke-virtual {p1}, Landroidx/collection/ObjectList;->isEmpty()Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-eqz p1, :cond_4

    .line 70
    .line 71
    iget-object p1, p0, Landroidx/compose/animation/core/SeekableTransitionState;->currentAnimation:Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;

    .line 72
    .line 73
    if-nez p1, :cond_4

    .line 74
    .line 75
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 76
    .line 77
    return-object p1

    .line 78
    :cond_4
    invoke-interface {v0}, Lvc/c;->getContext()Lkotlin/coroutines/d;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-static {p1}, Landroidx/compose/animation/core/SuspendAnimationKt;->getDurationScale(Lkotlin/coroutines/d;)F

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    const/4 v2, 0x0

    .line 87
    cmpg-float p1, p1, v2

    .line 88
    .line 89
    if-nez p1, :cond_5

    .line 90
    .line 91
    invoke-direct {p0}, Landroidx/compose/animation/core/SeekableTransitionState;->endAllAnimations()V

    .line 92
    .line 93
    .line 94
    iput-wide v5, p0, Landroidx/compose/animation/core/SeekableTransitionState;->lastFrameTimeNanos:J

    .line 95
    .line 96
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 97
    .line 98
    return-object p1

    .line 99
    :cond_5
    iget-wide v7, p0, Landroidx/compose/animation/core/SeekableTransitionState;->lastFrameTimeNanos:J

    .line 100
    .line 101
    cmp-long p1, v7, v5

    .line 102
    .line 103
    if-nez p1, :cond_6

    .line 104
    .line 105
    iget-object p1, p0, Landroidx/compose/animation/core/SeekableTransitionState;->firstFrameLambda:Lhd/l;

    .line 106
    .line 107
    iput-object p0, v0, Landroidx/compose/animation/core/SeekableTransitionState$runAnimations$1;->L$0:Ljava/lang/Object;

    .line 108
    .line 109
    iput v4, v0, Landroidx/compose/animation/core/SeekableTransitionState$runAnimations$1;->label:I

    .line 110
    .line 111
    invoke-static {p1, v0}, Landroidx/compose/runtime/MonotonicFrameClockKt;->withFrameNanos(Lhd/l;Lvc/c;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    if-ne p1, v1, :cond_6

    .line 116
    .line 117
    goto :goto_4

    .line 118
    :cond_6
    move-object v2, p0

    .line 119
    :cond_7
    :goto_2
    iget-object p1, v2, Landroidx/compose/animation/core/SeekableTransitionState;->initialValueAnimations:Landroidx/collection/MutableObjectList;

    .line 120
    .line 121
    invoke-virtual {p1}, Landroidx/collection/ObjectList;->isNotEmpty()Z

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    if-nez p1, :cond_9

    .line 126
    .line 127
    iget-object p1, v2, Landroidx/compose/animation/core/SeekableTransitionState;->currentAnimation:Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;

    .line 128
    .line 129
    if-eqz p1, :cond_8

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_8
    iput-wide v5, v2, Landroidx/compose/animation/core/SeekableTransitionState;->lastFrameTimeNanos:J

    .line 133
    .line 134
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 135
    .line 136
    return-object p1

    .line 137
    :cond_9
    :goto_3
    iput-object v2, v0, Landroidx/compose/animation/core/SeekableTransitionState$runAnimations$1;->L$0:Ljava/lang/Object;

    .line 138
    .line 139
    iput v3, v0, Landroidx/compose/animation/core/SeekableTransitionState$runAnimations$1;->label:I

    .line 140
    .line 141
    invoke-direct {v2, v0}, Landroidx/compose/animation/core/SeekableTransitionState;->animateOneFrame(Lvc/c;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    if-ne p1, v1, :cond_7

    .line 146
    .line 147
    :goto_4
    return-object v1
.end method

.method public static synthetic seekTo$default(Landroidx/compose/animation/core/SeekableTransitionState;FLjava/lang/Object;Lvc/c;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x2

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/compose/animation/core/SeekableTransitionState;->getTargetState()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/animation/core/SeekableTransitionState;->seekTo(FLjava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method private final seekToFraction()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/compose/animation/core/SeekableTransitionState;->transition:Landroidx/compose/animation/core/Transition;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/animation/core/SeekableTransitionState;->getFraction()F

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    float-to-double v1, v1

    .line 11
    invoke-virtual {v0}, Landroidx/compose/animation/core/Transition;->getTotalDurationNanos()J

    .line 12
    .line 13
    .line 14
    move-result-wide v3

    .line 15
    long-to-double v3, v3

    .line 16
    mul-double/2addr v1, v3

    .line 17
    invoke-static {v1, v2}, Ljd/c;->e(D)J

    .line 18
    .line 19
    .line 20
    move-result-wide v1

    .line 21
    invoke-virtual {v0, v1, v2}, Landroidx/compose/animation/core/Transition;->seekAnimations$animation_core_release(J)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method private final setFraction(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/animation/core/SeekableTransitionState;->fraction$delegate:Landroidx/compose/runtime/MutableFloatState;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableFloatState;->setFloatValue(F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final waitForComposition(Lvc/c;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Landroidx/compose/animation/core/SeekableTransitionState$waitForComposition$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Landroidx/compose/animation/core/SeekableTransitionState$waitForComposition$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/compose/animation/core/SeekableTransitionState$waitForComposition$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/compose/animation/core/SeekableTransitionState$waitForComposition$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/compose/animation/core/SeekableTransitionState$waitForComposition$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Landroidx/compose/animation/core/SeekableTransitionState$waitForComposition$1;-><init>(Landroidx/compose/animation/core/SeekableTransitionState;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Landroidx/compose/animation/core/SeekableTransitionState$waitForComposition$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/compose/animation/core/SeekableTransitionState$waitForComposition$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x0

    .line 35
    const/4 v5, 0x1

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v5, :cond_2

    .line 39
    .line 40
    if-ne v2, v3, :cond_1

    .line 41
    .line 42
    iget-object v1, v0, Landroidx/compose/animation/core/SeekableTransitionState$waitForComposition$1;->L$1:Ljava/lang/Object;

    .line 43
    .line 44
    iget-object v0, v0, Landroidx/compose/animation/core/SeekableTransitionState$waitForComposition$1;->L$0:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Landroidx/compose/animation/core/SeekableTransitionState;

    .line 47
    .line 48
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1

    .line 60
    :cond_2
    iget-object v2, v0, Landroidx/compose/animation/core/SeekableTransitionState$waitForComposition$1;->L$1:Ljava/lang/Object;

    .line 61
    .line 62
    iget-object v6, v0, Landroidx/compose/animation/core/SeekableTransitionState$waitForComposition$1;->L$0:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v6, Landroidx/compose/animation/core/SeekableTransitionState;

    .line 65
    .line 66
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    move-object p1, v2

    .line 70
    goto :goto_1

    .line 71
    :cond_3
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Landroidx/compose/animation/core/SeekableTransitionState;->getTargetState()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iget-object v2, p0, Landroidx/compose/animation/core/SeekableTransitionState;->compositionContinuationMutex:Lbe/a;

    .line 79
    .line 80
    iput-object p0, v0, Landroidx/compose/animation/core/SeekableTransitionState$waitForComposition$1;->L$0:Ljava/lang/Object;

    .line 81
    .line 82
    iput-object p1, v0, Landroidx/compose/animation/core/SeekableTransitionState$waitForComposition$1;->L$1:Ljava/lang/Object;

    .line 83
    .line 84
    iput v5, v0, Landroidx/compose/animation/core/SeekableTransitionState$waitForComposition$1;->label:I

    .line 85
    .line 86
    invoke-static {v2, v4, v0, v5, v4}, Lbe/a$a;->a(Lbe/a;Ljava/lang/Object;Lvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    if-ne v2, v1, :cond_4

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_4
    move-object v6, p0

    .line 94
    :goto_1
    iput-object v6, v0, Landroidx/compose/animation/core/SeekableTransitionState$waitForComposition$1;->L$0:Ljava/lang/Object;

    .line 95
    .line 96
    iput-object p1, v0, Landroidx/compose/animation/core/SeekableTransitionState$waitForComposition$1;->L$1:Ljava/lang/Object;

    .line 97
    .line 98
    iput v3, v0, Landroidx/compose/animation/core/SeekableTransitionState$waitForComposition$1;->label:I

    .line 99
    .line 100
    new-instance v2, Lkotlinx/coroutines/c;

    .line 101
    .line 102
    invoke-static {v0}, Lkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt;->d(Lvc/c;)Lvc/c;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-direct {v2, v3, v5}, Lkotlinx/coroutines/c;-><init>(Lvc/c;I)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2}, Lkotlinx/coroutines/c;->F()V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v6, v2}, Landroidx/compose/animation/core/SeekableTransitionState;->setCompositionContinuation$animation_core_release(Lsd/j;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v6}, Landroidx/compose/animation/core/SeekableTransitionState;->getCompositionContinuationMutex$animation_core_release()Lbe/a;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    invoke-static {v3, v4, v5, v4}, Lbe/a$a;->c(Lbe/a;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2}, Lkotlinx/coroutines/c;->x()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    if-ne v2, v3, :cond_5

    .line 131
    .line 132
    invoke-static {v0}, Lxc/f;->c(Lvc/c;)V

    .line 133
    .line 134
    .line 135
    :cond_5
    if-ne v2, v1, :cond_6

    .line 136
    .line 137
    :goto_2
    return-object v1

    .line 138
    :cond_6
    move-object v1, p1

    .line 139
    move-object p1, v2

    .line 140
    move-object v0, v6

    .line 141
    :goto_3
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    if-eqz p1, :cond_7

    .line 146
    .line 147
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 148
    .line 149
    return-object p1

    .line 150
    :cond_7
    const-wide/high16 v1, -0x8000000000000000L

    .line 151
    .line 152
    iput-wide v1, v0, Landroidx/compose/animation/core/SeekableTransitionState;->lastFrameTimeNanos:J

    .line 153
    .line 154
    new-instance p1, Ljava/util/concurrent/CancellationException;

    .line 155
    .line 156
    const-string v0, "targetState while waiting for composition"

    .line 157
    .line 158
    invoke-direct {p1, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    throw p1
.end method

.method private final waitForCompositionAfterTargetStateChange(Lvc/c;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Landroidx/compose/animation/core/SeekableTransitionState$waitForCompositionAfterTargetStateChange$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Landroidx/compose/animation/core/SeekableTransitionState$waitForCompositionAfterTargetStateChange$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/compose/animation/core/SeekableTransitionState$waitForCompositionAfterTargetStateChange$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Landroidx/compose/animation/core/SeekableTransitionState$waitForCompositionAfterTargetStateChange$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Landroidx/compose/animation/core/SeekableTransitionState$waitForCompositionAfterTargetStateChange$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Landroidx/compose/animation/core/SeekableTransitionState$waitForCompositionAfterTargetStateChange$1;-><init>(Landroidx/compose/animation/core/SeekableTransitionState;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Landroidx/compose/animation/core/SeekableTransitionState$waitForCompositionAfterTargetStateChange$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Landroidx/compose/animation/core/SeekableTransitionState$waitForCompositionAfterTargetStateChange$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x0

    .line 35
    const/4 v5, 0x1

    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v5, :cond_2

    .line 39
    .line 40
    if-ne v2, v3, :cond_1

    .line 41
    .line 42
    iget-object v1, v0, Landroidx/compose/animation/core/SeekableTransitionState$waitForCompositionAfterTargetStateChange$1;->L$1:Ljava/lang/Object;

    .line 43
    .line 44
    iget-object v0, v0, Landroidx/compose/animation/core/SeekableTransitionState$waitForCompositionAfterTargetStateChange$1;->L$0:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Landroidx/compose/animation/core/SeekableTransitionState;

    .line 47
    .line 48
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1

    .line 60
    :cond_2
    iget-object v2, v0, Landroidx/compose/animation/core/SeekableTransitionState$waitForCompositionAfterTargetStateChange$1;->L$1:Ljava/lang/Object;

    .line 61
    .line 62
    iget-object v6, v0, Landroidx/compose/animation/core/SeekableTransitionState$waitForCompositionAfterTargetStateChange$1;->L$0:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v6, Landroidx/compose/animation/core/SeekableTransitionState;

    .line 65
    .line 66
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    move-object p1, v2

    .line 70
    goto :goto_1

    .line 71
    :cond_3
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Landroidx/compose/animation/core/SeekableTransitionState;->getTargetState()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iget-object v2, p0, Landroidx/compose/animation/core/SeekableTransitionState;->compositionContinuationMutex:Lbe/a;

    .line 79
    .line 80
    iput-object p0, v0, Landroidx/compose/animation/core/SeekableTransitionState$waitForCompositionAfterTargetStateChange$1;->L$0:Ljava/lang/Object;

    .line 81
    .line 82
    iput-object p1, v0, Landroidx/compose/animation/core/SeekableTransitionState$waitForCompositionAfterTargetStateChange$1;->L$1:Ljava/lang/Object;

    .line 83
    .line 84
    iput v5, v0, Landroidx/compose/animation/core/SeekableTransitionState$waitForCompositionAfterTargetStateChange$1;->label:I

    .line 85
    .line 86
    invoke-static {v2, v4, v0, v5, v4}, Lbe/a$a;->a(Lbe/a;Ljava/lang/Object;Lvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    if-ne v2, v1, :cond_4

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_4
    move-object v6, p0

    .line 94
    :goto_1
    iget-object v2, v6, Landroidx/compose/animation/core/SeekableTransitionState;->composedTargetState:Ljava/lang/Object;

    .line 95
    .line 96
    invoke-static {p1, v2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    if-eqz v2, :cond_5

    .line 101
    .line 102
    iget-object p1, v6, Landroidx/compose/animation/core/SeekableTransitionState;->compositionContinuationMutex:Lbe/a;

    .line 103
    .line 104
    invoke-static {p1, v4, v5, v4}, Lbe/a$a;->c(Lbe/a;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    goto :goto_4

    .line 108
    :cond_5
    iput-object v6, v0, Landroidx/compose/animation/core/SeekableTransitionState$waitForCompositionAfterTargetStateChange$1;->L$0:Ljava/lang/Object;

    .line 109
    .line 110
    iput-object p1, v0, Landroidx/compose/animation/core/SeekableTransitionState$waitForCompositionAfterTargetStateChange$1;->L$1:Ljava/lang/Object;

    .line 111
    .line 112
    iput v3, v0, Landroidx/compose/animation/core/SeekableTransitionState$waitForCompositionAfterTargetStateChange$1;->label:I

    .line 113
    .line 114
    new-instance v2, Lkotlinx/coroutines/c;

    .line 115
    .line 116
    invoke-static {v0}, Lkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt;->d(Lvc/c;)Lvc/c;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    invoke-direct {v2, v3, v5}, Lkotlinx/coroutines/c;-><init>(Lvc/c;I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2}, Lkotlinx/coroutines/c;->F()V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v6, v2}, Landroidx/compose/animation/core/SeekableTransitionState;->setCompositionContinuation$animation_core_release(Lsd/j;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v6}, Landroidx/compose/animation/core/SeekableTransitionState;->getCompositionContinuationMutex$animation_core_release()Lbe/a;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    invoke-static {v3, v4, v5, v4}, Lbe/a$a;->c(Lbe/a;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2}, Lkotlinx/coroutines/c;->x()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    if-ne v2, v3, :cond_6

    .line 145
    .line 146
    invoke-static {v0}, Lxc/f;->c(Lvc/c;)V

    .line 147
    .line 148
    .line 149
    :cond_6
    if-ne v2, v1, :cond_7

    .line 150
    .line 151
    :goto_2
    return-object v1

    .line 152
    :cond_7
    move-object v1, p1

    .line 153
    move-object p1, v2

    .line 154
    move-object v0, v6

    .line 155
    :goto_3
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v2

    .line 159
    if-eqz v2, :cond_8

    .line 160
    .line 161
    :goto_4
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 162
    .line 163
    return-object p1

    .line 164
    :cond_8
    const-wide/high16 v2, -0x8000000000000000L

    .line 165
    .line 166
    iput-wide v2, v0, Landroidx/compose/animation/core/SeekableTransitionState;->lastFrameTimeNanos:J

    .line 167
    .line 168
    new-instance v0, Ljava/util/concurrent/CancellationException;

    .line 169
    .line 170
    new-instance v2, Ljava/lang/StringBuilder;

    .line 171
    .line 172
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 173
    .line 174
    .line 175
    const-string v3, "snapTo() was canceled because state was changed to "

    .line 176
    .line 177
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    const-string p1, " instead of "

    .line 184
    .line 185
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    invoke-direct {v0, p1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    throw v0
.end method


# virtual methods
.method public final animateTo(Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Lvc/c;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TS;",
            "Landroidx/compose/animation/core/FiniteAnimationSpec<",
            "Ljava/lang/Float;",
            ">;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object v1, p0, Landroidx/compose/animation/core/SeekableTransitionState;->transition:Landroidx/compose/animation/core/Transition;

    .line 2
    .line 3
    if-nez v1, :cond_0

    .line 4
    .line 5
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    iget-object v6, p0, Landroidx/compose/animation/core/SeekableTransitionState;->mutatorMutex:Landroidx/compose/animation/core/MutatorMutex;

    .line 9
    .line 10
    new-instance v0, Landroidx/compose/animation/core/SeekableTransitionState$animateTo$2;

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    move-object v2, p0

    .line 14
    move-object v3, p1

    .line 15
    move-object v4, p2

    .line 16
    invoke-direct/range {v0 .. v5}, Landroidx/compose/animation/core/SeekableTransitionState$animateTo$2;-><init>(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/SeekableTransitionState;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;Lvc/c;)V

    .line 17
    .line 18
    .line 19
    const/4 v4, 0x1

    .line 20
    const/4 v1, 0x0

    .line 21
    move-object v3, p3

    .line 22
    move-object v2, v0

    .line 23
    move-object v0, v6

    .line 24
    invoke-static/range {v0 .. v5}, Landroidx/compose/animation/core/MutatorMutex;->mutate$default(Landroidx/compose/animation/core/MutatorMutex;Landroidx/compose/animation/core/MutatePriority;Lhd/l;Lvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    if-ne p1, p2, :cond_1

    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_1
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 36
    .line 37
    return-object p1
.end method

.method public final getComposedTargetState$animation_core_release()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TS;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/animation/core/SeekableTransitionState;->composedTargetState:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCompositionContinuation$animation_core_release()Lsd/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lsd/j;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/animation/core/SeekableTransitionState;->compositionContinuation:Lsd/j;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCompositionContinuationMutex$animation_core_release()Lbe/a;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/animation/core/SeekableTransitionState;->compositionContinuationMutex:Lbe/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public getCurrentState()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TS;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/animation/core/SeekableTransitionState;->currentState$delegate:Landroidx/compose/runtime/MutableState;

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

.method public final getFraction()F
    .locals 1
    .annotation build Landroidx/annotation/FloatRange;
        from = 0.0
        to = 1.0
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/animation/core/SeekableTransitionState;->fraction$delegate:Landroidx/compose/runtime/MutableFloatState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/FloatState;->getFloatValue()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getTargetState()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TS;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/animation/core/SeekableTransitionState;->targetState$delegate:Landroidx/compose/runtime/MutableState;

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

.method public final getTotalDurationNanos$animation_core_release()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/compose/animation/core/SeekableTransitionState;->totalDurationNanos:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final observeTotalDuration$animation_core_release()V
    .locals 3

    .line 1
    invoke-static {}, Landroidx/compose/animation/core/TransitionKt;->getSeekableStateObserver()Landroidx/compose/runtime/snapshots/SnapshotStateObserver;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroidx/compose/animation/core/TransitionKt;->access$getSeekableTransitionStateTotalDurationChanged$p()Lhd/l;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p0, Landroidx/compose/animation/core/SeekableTransitionState;->recalculateTotalDurationNanos:Lhd/a;

    .line 10
    .line 11
    invoke-virtual {v0, p0, v1, v2}, Landroidx/compose/runtime/snapshots/SnapshotStateObserver;->observeReads(Ljava/lang/Object;Lhd/l;Lhd/a;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final onTotalDurationChanged$animation_core_release()V
    .locals 5

    .line 1
    iget-wide v0, p0, Landroidx/compose/animation/core/SeekableTransitionState;->totalDurationNanos:J

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/compose/animation/core/SeekableTransitionState;->observeTotalDuration$animation_core_release()V

    .line 4
    .line 5
    .line 6
    iget-wide v2, p0, Landroidx/compose/animation/core/SeekableTransitionState;->totalDurationNanos:J

    .line 7
    .line 8
    cmp-long v0, v0, v2

    .line 9
    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/compose/animation/core/SeekableTransitionState;->currentAnimation:Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0}, Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;->getProgressNanos()J

    .line 17
    .line 18
    .line 19
    move-result-wide v1

    .line 20
    iget-wide v3, p0, Landroidx/compose/animation/core/SeekableTransitionState;->totalDurationNanos:J

    .line 21
    .line 22
    cmp-long v1, v1, v3

    .line 23
    .line 24
    if-lez v1, :cond_0

    .line 25
    .line 26
    invoke-direct {p0}, Landroidx/compose/animation/core/SeekableTransitionState;->endAllAnimations()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    invoke-virtual {v0, v3, v4}, Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;->setDurationNanos(J)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;->getAnimationSpec()Landroidx/compose/animation/core/VectorizedAnimationSpec;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-nez v1, :cond_2

    .line 38
    .line 39
    invoke-virtual {v0}, Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;->getStart()Landroidx/compose/animation/core/AnimationVector1D;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const/4 v2, 0x0

    .line 44
    invoke-virtual {v1, v2}, Landroidx/compose/animation/core/AnimationVector1D;->get$animation_core_release(I)F

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    float-to-double v1, v1

    .line 49
    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    .line 50
    .line 51
    sub-double/2addr v3, v1

    .line 52
    iget-wide v1, p0, Landroidx/compose/animation/core/SeekableTransitionState;->totalDurationNanos:J

    .line 53
    .line 54
    long-to-double v1, v1

    .line 55
    mul-double/2addr v3, v1

    .line 56
    invoke-static {v3, v4}, Ljd/c;->e(D)J

    .line 57
    .line 58
    .line 59
    move-result-wide v1

    .line 60
    invoke-virtual {v0, v1, v2}, Landroidx/compose/animation/core/SeekableTransitionState$SeekingAnimationState;->setAnimationSpecDuration(J)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_1
    const-wide/16 v0, 0x0

    .line 65
    .line 66
    cmp-long v0, v2, v0

    .line 67
    .line 68
    if-eqz v0, :cond_2

    .line 69
    .line 70
    invoke-direct {p0}, Landroidx/compose/animation/core/SeekableTransitionState;->seekToFraction()V

    .line 71
    .line 72
    .line 73
    :cond_2
    return-void
.end method

.method public final seekTo(FLjava/lang/Object;Lvc/c;)Ljava/lang/Object;
    .locals 12
    .param p1    # F
        .annotation build Landroidx/annotation/FloatRange;
            from = 0.0
            to = 1.0
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FTS;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v0, v0, p1

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-gtz v0, :cond_0

    .line 6
    .line 7
    const/high16 v0, 0x3f800000    # 1.0f

    .line 8
    .line 9
    cmpg-float v0, p1, v0

    .line 10
    .line 11
    if-gtz v0, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    :cond_0
    if-nez v1, :cond_1

    .line 15
    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v1, "Expecting fraction between 0 and 1. Got "

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0}, Landroidx/compose/animation/core/PreconditionsKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    iget-object v5, p0, Landroidx/compose/animation/core/SeekableTransitionState;->transition:Landroidx/compose/animation/core/Transition;

    .line 37
    .line 38
    if-nez v5, :cond_2

    .line 39
    .line 40
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 41
    .line 42
    return-object p1

    .line 43
    :cond_2
    invoke-virtual {p0}, Landroidx/compose/animation/core/SeekableTransitionState;->getTargetState()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    iget-object v0, p0, Landroidx/compose/animation/core/SeekableTransitionState;->mutatorMutex:Landroidx/compose/animation/core/MutatorMutex;

    .line 48
    .line 49
    new-instance v1, Landroidx/compose/animation/core/SeekableTransitionState$seekTo$3;

    .line 50
    .line 51
    const/4 v7, 0x0

    .line 52
    move-object v4, p0

    .line 53
    move v6, p1

    .line 54
    move-object v2, p2

    .line 55
    invoke-direct/range {v1 .. v7}, Landroidx/compose/animation/core/SeekableTransitionState$seekTo$3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/SeekableTransitionState;Landroidx/compose/animation/core/Transition;FLvc/c;)V

    .line 56
    .line 57
    .line 58
    const/4 v10, 0x1

    .line 59
    const/4 v11, 0x0

    .line 60
    move-object v9, p3

    .line 61
    move-object v6, v0

    .line 62
    move-object v8, v1

    .line 63
    invoke-static/range {v6 .. v11}, Landroidx/compose/animation/core/MutatorMutex;->mutate$default(Landroidx/compose/animation/core/MutatorMutex;Landroidx/compose/animation/core/MutatePriority;Lhd/l;Lvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    if-ne p1, p2, :cond_3

    .line 72
    .line 73
    return-object p1

    .line 74
    :cond_3
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 75
    .line 76
    return-object p1
.end method

.method public final setComposedTargetState$animation_core_release(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TS;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/animation/core/SeekableTransitionState;->composedTargetState:Ljava/lang/Object;

    .line 2
    .line 3
    return-void
.end method

.method public final setCompositionContinuation$animation_core_release(Lsd/j;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsd/j;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/animation/core/SeekableTransitionState;->compositionContinuation:Lsd/j;

    .line 2
    .line 3
    return-void
.end method

.method public setCurrentState$animation_core_release(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TS;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/animation/core/SeekableTransitionState;->currentState$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setTargetState$animation_core_release(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TS;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/animation/core/SeekableTransitionState;->targetState$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setTotalDurationNanos$animation_core_release(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Landroidx/compose/animation/core/SeekableTransitionState;->totalDurationNanos:J

    .line 2
    .line 3
    return-void
.end method

.method public final snapTo(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TS;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/animation/core/SeekableTransitionState;->transition:Landroidx/compose/animation/core/Transition;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/animation/core/SeekableTransitionState;->getCurrentState()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/compose/animation/core/SeekableTransitionState;->getTargetState()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 29
    .line 30
    return-object p1

    .line 31
    :cond_1
    move-object v1, v0

    .line 32
    iget-object v0, p0, Landroidx/compose/animation/core/SeekableTransitionState;->mutatorMutex:Landroidx/compose/animation/core/MutatorMutex;

    .line 33
    .line 34
    new-instance v2, Landroidx/compose/animation/core/SeekableTransitionState$snapTo$2;

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    invoke-direct {v2, p0, p1, v1, v3}, Landroidx/compose/animation/core/SeekableTransitionState$snapTo$2;-><init>(Landroidx/compose/animation/core/SeekableTransitionState;Ljava/lang/Object;Landroidx/compose/animation/core/Transition;Lvc/c;)V

    .line 38
    .line 39
    .line 40
    const/4 v4, 0x1

    .line 41
    const/4 v5, 0x0

    .line 42
    const/4 v1, 0x0

    .line 43
    move-object v3, p2

    .line 44
    invoke-static/range {v0 .. v5}, Landroidx/compose/animation/core/MutatorMutex;->mutate$default(Landroidx/compose/animation/core/MutatorMutex;Landroidx/compose/animation/core/MutatePriority;Lhd/l;Lvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    if-ne p1, p2, :cond_2

    .line 53
    .line 54
    return-object p1

    .line 55
    :cond_2
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 56
    .line 57
    return-object p1
.end method

.method public transitionConfigured$animation_core_release(Landroidx/compose/animation/core/Transition;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/animation/core/Transition<",
            "TS;>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/animation/core/SeekableTransitionState;->transition:Landroidx/compose/animation/core/Transition;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    goto :goto_1

    .line 14
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 15
    :goto_1
    if-nez v0, :cond_2

    .line 16
    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v1, "An instance of SeekableTransitionState has been used in different Transitions. Previous instance: "

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Landroidx/compose/animation/core/SeekableTransitionState;->transition:Landroidx/compose/animation/core/Transition;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v1, ", new instance: "

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v0}, Landroidx/compose/animation/core/PreconditionsKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    iput-object p1, p0, Landroidx/compose/animation/core/SeekableTransitionState;->transition:Landroidx/compose/animation/core/Transition;

    .line 48
    .line 49
    return-void
.end method

.method public transitionRemoved$animation_core_release()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Landroidx/compose/animation/core/SeekableTransitionState;->transition:Landroidx/compose/animation/core/Transition;

    .line 3
    .line 4
    invoke-static {}, Landroidx/compose/animation/core/TransitionKt;->getSeekableStateObserver()Landroidx/compose/runtime/snapshots/SnapshotStateObserver;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0, p0}, Landroidx/compose/runtime/snapshots/SnapshotStateObserver;->clear(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
