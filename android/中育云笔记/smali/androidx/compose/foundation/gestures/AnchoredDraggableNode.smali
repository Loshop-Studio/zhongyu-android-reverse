.class final Landroidx/compose/foundation/gestures/AnchoredDraggableNode;
.super Landroidx/compose/foundation/gestures/DragGestureNode;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Landroidx/compose/foundation/gestures/DragGestureNode;"
    }
.end annotation


# instance fields
.field private density:Landroidx/compose/ui/unit/Density;

.field private flingBehavior:Landroidx/compose/foundation/gestures/FlingBehavior;

.field private orientation:Landroidx/compose/foundation/gestures/Orientation;

.field private overscrollEffect:Landroidx/compose/foundation/OverscrollEffect;

.field public resolvedFlingBehavior:Landroidx/compose/foundation/gestures/FlingBehavior;

.field private reverseDirection:Ljava/lang/Boolean;

.field private startDragImmediately:Ljava/lang/Boolean;

.field private state:Landroidx/compose/foundation/gestures/AnchoredDraggableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/foundation/gestures/AnchoredDraggableState<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/gestures/AnchoredDraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLjava/lang/Boolean;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/OverscrollEffect;Ljava/lang/Boolean;Landroidx/compose/foundation/gestures/FlingBehavior;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/gestures/AnchoredDraggableState<",
            "TT;>;",
            "Landroidx/compose/foundation/gestures/Orientation;",
            "Z",
            "Ljava/lang/Boolean;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/foundation/OverscrollEffect;",
            "Ljava/lang/Boolean;",
            "Landroidx/compose/foundation/gestures/FlingBehavior;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-static {}, Landroidx/compose/foundation/gestures/AnchoredDraggableKt;->access$getAlwaysDrag$p()Lhd/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, v0, p3, p5, p2}, Landroidx/compose/foundation/gestures/DragGestureNode;-><init>(Lhd/l;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/Orientation;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->state:Landroidx/compose/foundation/gestures/AnchoredDraggableState;

    .line 9
    .line 10
    iput-object p2, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->orientation:Landroidx/compose/foundation/gestures/Orientation;

    .line 11
    .line 12
    iput-object p4, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->reverseDirection:Ljava/lang/Boolean;

    .line 13
    .line 14
    iput-object p6, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->overscrollEffect:Landroidx/compose/foundation/OverscrollEffect;

    .line 15
    .line 16
    iput-object p7, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->startDragImmediately:Ljava/lang/Boolean;

    .line 17
    .line 18
    iput-object p8, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->flingBehavior:Landroidx/compose/foundation/gestures/FlingBehavior;

    .line 19
    .line 20
    return-void
.end method

.method public static final synthetic access$fling(Landroidx/compose/foundation/gestures/AnchoredDraggableNode;FLvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->fling(FLvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getOverscrollEffect$p(Landroidx/compose/foundation/gestures/AnchoredDraggableNode;)Landroidx/compose/foundation/OverscrollEffect;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->overscrollEffect:Landroidx/compose/foundation/OverscrollEffect;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getState$p(Landroidx/compose/foundation/gestures/AnchoredDraggableNode;)Landroidx/compose/foundation/gestures/AnchoredDraggableState;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->state:Landroidx/compose/foundation/gestures/AnchoredDraggableState;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$reverseIfNeeded-AH228Gc(Landroidx/compose/foundation/gestures/AnchoredDraggableNode;J)J
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->reverseIfNeeded-AH228Gc(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method public static final synthetic access$reverseIfNeeded-MK-Hz9U(Landroidx/compose/foundation/gestures/AnchoredDraggableNode;J)J
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->reverseIfNeeded-MK-Hz9U(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method public static final synthetic access$toFloat-TH1AsA0(Landroidx/compose/foundation/gestures/AnchoredDraggableNode;J)F
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->toFloat-TH1AsA0(J)F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$toFloat-k-4lQ0M(Landroidx/compose/foundation/gestures/AnchoredDraggableNode;J)F
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->toFloat-k-4lQ0M(J)F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$toOffset-tuRUvjQ(Landroidx/compose/foundation/gestures/AnchoredDraggableNode;F)J
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->toOffset-tuRUvjQ(F)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method public static final synthetic access$toVelocity-adjELrA(Landroidx/compose/foundation/gestures/AnchoredDraggableNode;F)J
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->toVelocity-adjELrA(F)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method private final fling(FLvc/c;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F",
            "Lvc/c<",
            "-",
            "Ljava/lang/Float;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p2, Landroidx/compose/foundation/gestures/AnchoredDraggableNode$fling$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Landroidx/compose/foundation/gestures/AnchoredDraggableNode$fling$1;

    .line 7
    .line 8
    iget v1, v0, Landroidx/compose/foundation/gestures/AnchoredDraggableNode$fling$1;->label:I

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
    iput v1, v0, Landroidx/compose/foundation/gestures/AnchoredDraggableNode$fling$1;->label:I

    .line 18
    .line 19
    :goto_0
    move-object v4, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Landroidx/compose/foundation/gestures/AnchoredDraggableNode$fling$1;

    .line 22
    .line 23
    invoke-direct {v0, p0, p2}, Landroidx/compose/foundation/gestures/AnchoredDraggableNode$fling$1;-><init>(Landroidx/compose/foundation/gestures/AnchoredDraggableNode;Lvc/c;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p2, v4, Landroidx/compose/foundation/gestures/AnchoredDraggableNode$fling$1;->result:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget v1, v4, Landroidx/compose/foundation/gestures/AnchoredDraggableNode$fling$1;->label:I

    .line 34
    .line 35
    const/4 v2, 0x2

    .line 36
    const/4 v3, 0x1

    .line 37
    if-eqz v1, :cond_3

    .line 38
    .line 39
    if-eq v1, v3, :cond_2

    .line 40
    .line 41
    if-ne v1, v2, :cond_1

    .line 42
    .line 43
    iget-object p1, v4, Landroidx/compose/foundation/gestures/AnchoredDraggableNode$fling$1;->L$0:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Lkotlin/jvm/internal/Ref$FloatRef;

    .line 46
    .line 47
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto :goto_3

    .line 51
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_2
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    return-object p2

    .line 63
    :cond_3
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iget-object p2, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->state:Landroidx/compose/foundation/gestures/AnchoredDraggableState;

    .line 67
    .line 68
    invoke-virtual {p2}, Landroidx/compose/foundation/gestures/AnchoredDraggableState;->getUsePreModifierChangeBehavior$foundation_release()Z

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    if-eqz p2, :cond_5

    .line 73
    .line 74
    iget-object p2, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->state:Landroidx/compose/foundation/gestures/AnchoredDraggableState;

    .line 75
    .line 76
    iput v3, v4, Landroidx/compose/foundation/gestures/AnchoredDraggableNode$fling$1;->label:I

    .line 77
    .line 78
    invoke-virtual {p2, p1, v4}, Landroidx/compose/foundation/gestures/AnchoredDraggableState;->settle(FLvc/c;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    if-ne p1, v0, :cond_4

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_4
    return-object p1

    .line 86
    :cond_5
    new-instance p2, Lkotlin/jvm/internal/Ref$FloatRef;

    .line 87
    .line 88
    invoke-direct {p2}, Lkotlin/jvm/internal/Ref$FloatRef;-><init>()V

    .line 89
    .line 90
    .line 91
    iput p1, p2, Lkotlin/jvm/internal/Ref$FloatRef;->c:F

    .line 92
    .line 93
    iget-object v1, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->state:Landroidx/compose/foundation/gestures/AnchoredDraggableState;

    .line 94
    .line 95
    new-instance v3, Landroidx/compose/foundation/gestures/AnchoredDraggableNode$fling$2;

    .line 96
    .line 97
    const/4 v5, 0x0

    .line 98
    invoke-direct {v3, p0, p2, p1, v5}, Landroidx/compose/foundation/gestures/AnchoredDraggableNode$fling$2;-><init>(Landroidx/compose/foundation/gestures/AnchoredDraggableNode;Lkotlin/jvm/internal/Ref$FloatRef;FLvc/c;)V

    .line 99
    .line 100
    .line 101
    iput-object p2, v4, Landroidx/compose/foundation/gestures/AnchoredDraggableNode$fling$1;->L$0:Ljava/lang/Object;

    .line 102
    .line 103
    iput v2, v4, Landroidx/compose/foundation/gestures/AnchoredDraggableNode$fling$1;->label:I

    .line 104
    .line 105
    const/4 v2, 0x0

    .line 106
    const/4 v5, 0x1

    .line 107
    const/4 v6, 0x0

    .line 108
    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/gestures/AnchoredDraggableState;->anchoredDrag$default(Landroidx/compose/foundation/gestures/AnchoredDraggableState;Landroidx/compose/foundation/MutatePriority;Lhd/q;Lvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    if-ne p1, v0, :cond_6

    .line 113
    .line 114
    :goto_2
    return-object v0

    .line 115
    :cond_6
    move-object p1, p2

    .line 116
    :goto_3
    iget p1, p1, Lkotlin/jvm/internal/Ref$FloatRef;->c:F

    .line 117
    .line 118
    invoke-static {p1}, Lxc/a;->b(F)Ljava/lang/Float;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    return-object p1
.end method

.method private final isReverseDirection()Z
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->reverseDirection:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutDirection(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/unit/LayoutDirection;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, Landroidx/compose/ui/unit/LayoutDirection;->Rtl:Landroidx/compose/ui/unit/LayoutDirection;

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->orientation:Landroidx/compose/foundation/gestures/Orientation;

    .line 14
    .line 15
    sget-object v1, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    .line 16
    .line 17
    if-ne v0, v1, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    return v0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    return v0

    .line 23
    :cond_1
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    return v0
.end method

.method private final reverseIfNeeded-AH228Gc(J)J
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->isReverseDirection()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/high16 v0, -0x40800000    # -1.0f

    .line 8
    .line 9
    :goto_0
    invoke-static {p1, p2, v0}, Landroidx/compose/ui/unit/Velocity;->times-adjELrA(JF)J

    .line 10
    .line 11
    .line 12
    move-result-wide p1

    .line 13
    return-wide p1

    .line 14
    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    .line 15
    .line 16
    goto :goto_0
.end method

.method private final reverseIfNeeded-MK-Hz9U(J)J
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->isReverseDirection()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/high16 v0, -0x40800000    # -1.0f

    .line 8
    .line 9
    :goto_0
    invoke-static {p1, p2, v0}, Landroidx/compose/ui/geometry/Offset;->times-tuRUvjQ(JF)J

    .line 10
    .line 11
    .line 12
    move-result-wide p1

    .line 13
    return-wide p1

    .line 14
    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    .line 15
    .line 16
    goto :goto_0
.end method

.method private final toFloat-TH1AsA0(J)F
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->orientation:Landroidx/compose/foundation/gestures/Orientation;

    .line 2
    .line 3
    sget-object v1, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Velocity;->getY-impl(J)F

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1

    .line 12
    :cond_0
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Velocity;->getX-impl(J)F

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1
.end method

.method private final toFloat-k-4lQ0M(J)F
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->orientation:Landroidx/compose/foundation/gestures/Orientation;

    .line 2
    .line 3
    sget-object v1, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const-wide v0, 0xffffffffL

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    and-long/2addr p1, v0

    .line 13
    :goto_0
    long-to-int p1, p1

    .line 14
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    return p1

    .line 19
    :cond_0
    const/16 v0, 0x20

    .line 20
    .line 21
    shr-long/2addr p1, v0

    .line 22
    goto :goto_0
.end method

.method private final toOffset-tuRUvjQ(F)J
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->orientation:Landroidx/compose/foundation/gestures/Orientation;

    .line 2
    .line 3
    sget-object v1, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    move v1, p1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v1, v2

    .line 11
    :goto_0
    sget-object v3, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    .line 12
    .line 13
    if-ne v0, v3, :cond_1

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_1
    move p1, v2

    .line 17
    :goto_1
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    int-to-long v0, v0

    .line 22
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    int-to-long v2, p1

    .line 27
    const/16 p1, 0x20

    .line 28
    .line 29
    shl-long/2addr v0, p1

    .line 30
    const-wide v4, 0xffffffffL

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    and-long/2addr v2, v4

    .line 36
    or-long/2addr v0, v2

    .line 37
    invoke-static {v0, v1}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    .line 38
    .line 39
    .line 40
    move-result-wide v0

    .line 41
    return-wide v0
.end method

.method private final toVelocity-adjELrA(F)J
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->orientation:Landroidx/compose/foundation/gestures/Orientation;

    .line 2
    .line 3
    sget-object v1, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    move v1, p1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v1, v2

    .line 11
    :goto_0
    sget-object v3, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    .line 12
    .line 13
    if-ne v0, v3, :cond_1

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_1
    move p1, v2

    .line 17
    :goto_1
    invoke-static {v1, p1}, Landroidx/compose/ui/unit/VelocityKt;->Velocity(FF)J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    return-wide v0
.end method

.method private final updateDensity()V
    .locals 2

    .line 1
    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireDensity(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/unit/Density;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->density:Landroidx/compose/ui/unit/Density;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    invoke-static {v1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-void

    .line 17
    :cond_1
    :goto_0
    iput-object v0, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->density:Landroidx/compose/ui/unit/Density;

    .line 18
    .line 19
    iget-object v0, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->flingBehavior:Landroidx/compose/foundation/gestures/FlingBehavior;

    .line 20
    .line 21
    invoke-direct {p0, v0}, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->updateFlingBehavior(Landroidx/compose/foundation/gestures/FlingBehavior;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method private final updateFlingBehavior(Landroidx/compose/foundation/gestures/FlingBehavior;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Landroidx/compose/foundation/gestures/AnchoredDraggableDefaults;->INSTANCE:Landroidx/compose/foundation/gestures/AnchoredDraggableDefaults;

    .line 4
    .line 5
    invoke-virtual {p1}, Landroidx/compose/foundation/gestures/AnchoredDraggableDefaults;->getSnapAnimationSpec()Landroidx/compose/animation/core/AnimationSpec;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p1}, Landroidx/compose/foundation/gestures/AnchoredDraggableDefaults;->getPositionalThreshold()Lhd/l;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireDensity(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/unit/Density;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iput-object v1, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->density:Landroidx/compose/ui/unit/Density;

    .line 18
    .line 19
    iget-object v2, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->state:Landroidx/compose/foundation/gestures/AnchoredDraggableState;

    .line 20
    .line 21
    invoke-static {v2, v1, p1, v0}, Landroidx/compose/foundation/gestures/AnchoredDraggableKt;->anchoredDraggableFlingBehavior(Landroidx/compose/foundation/gestures/AnchoredDraggableState;Landroidx/compose/ui/unit/Density;Lhd/l;Landroidx/compose/animation/core/AnimationSpec;)Landroidx/compose/foundation/gestures/TargetedFlingBehavior;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->setResolvedFlingBehavior(Landroidx/compose/foundation/gestures/FlingBehavior;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public drag(Lhd/p;Lvc/c;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/p;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->state:Landroidx/compose/foundation/gestures/AnchoredDraggableState;

    .line 2
    .line 3
    new-instance v2, Landroidx/compose/foundation/gestures/AnchoredDraggableNode$drag$2;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {v2, p1, p0, v1}, Landroidx/compose/foundation/gestures/AnchoredDraggableNode$drag$2;-><init>(Lhd/p;Landroidx/compose/foundation/gestures/AnchoredDraggableNode;Lvc/c;)V

    .line 7
    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    move-object v3, p2

    .line 12
    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/gestures/AnchoredDraggableState;->anchoredDrag$default(Landroidx/compose/foundation/gestures/AnchoredDraggableState;Landroidx/compose/foundation/MutatePriority;Lhd/q;Lvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    if-ne p1, p2, :cond_0

    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 24
    .line 25
    return-object p1
.end method

.method public final getResolvedFlingBehavior()Landroidx/compose/foundation/gestures/FlingBehavior;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->resolvedFlingBehavior:Landroidx/compose/foundation/gestures/FlingBehavior;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "resolvedFlingBehavior"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public onAttach()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->flingBehavior:Landroidx/compose/foundation/gestures/FlingBehavior;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->updateFlingBehavior(Landroidx/compose/foundation/gestures/FlingBehavior;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onDensityChange()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/gestures/DragGestureNode;->onCancelPointerInput()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-direct {p0}, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->updateDensity()V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public onDragStarted-k-4lQ0M(J)V
    .locals 0

    return-void
.end method

.method public onDragStopped-TH1AsA0(J)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getCoroutineScope()Lsd/i0;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v4, Landroidx/compose/foundation/gestures/AnchoredDraggableNode$onDragStopped$1;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-direct {v4, p0, p1, p2, v0}, Landroidx/compose/foundation/gestures/AnchoredDraggableNode$onDragStopped$1;-><init>(Landroidx/compose/foundation/gestures/AnchoredDraggableNode;JLvc/c;)V

    .line 16
    .line 17
    .line 18
    const/4 v5, 0x3

    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v2, 0x0

    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final setResolvedFlingBehavior(Landroidx/compose/foundation/gestures/FlingBehavior;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->resolvedFlingBehavior:Landroidx/compose/foundation/gestures/FlingBehavior;

    .line 2
    .line 3
    return-void
.end method

.method public startDragImmediately()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->startDragImmediately:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    iget-object v0, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->state:Landroidx/compose/foundation/gestures/AnchoredDraggableState;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroidx/compose/foundation/gestures/AnchoredDraggableState;->isAnimationRunning()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    return v0
.end method

.method public final update(Landroidx/compose/foundation/gestures/AnchoredDraggableState;Landroidx/compose/foundation/gestures/Orientation;ZLjava/lang/Boolean;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/OverscrollEffect;Ljava/lang/Boolean;Landroidx/compose/foundation/gestures/FlingBehavior;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/gestures/AnchoredDraggableState<",
            "TT;>;",
            "Landroidx/compose/foundation/gestures/Orientation;",
            "Z",
            "Ljava/lang/Boolean;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/foundation/OverscrollEffect;",
            "Ljava/lang/Boolean;",
            "Landroidx/compose/foundation/gestures/FlingBehavior;",
            ")V"
        }
    .end annotation

    .line 1
    move-object/from16 v3, p8

    .line 2
    .line 3
    iput-object v3, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->flingBehavior:Landroidx/compose/foundation/gestures/FlingBehavior;

    .line 4
    .line 5
    iget-object v5, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->state:Landroidx/compose/foundation/gestures/AnchoredDraggableState;

    .line 6
    .line 7
    invoke-static {v5, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v5

    .line 11
    const/4 v6, 0x1

    .line 12
    if-nez v5, :cond_0

    .line 13
    .line 14
    iput-object p1, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->state:Landroidx/compose/foundation/gestures/AnchoredDraggableState;

    .line 15
    .line 16
    invoke-direct {p0, v3}, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->updateFlingBehavior(Landroidx/compose/foundation/gestures/FlingBehavior;)V

    .line 17
    .line 18
    .line 19
    move v1, v6

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v1, 0x0

    .line 22
    :goto_0
    iget-object v3, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->orientation:Landroidx/compose/foundation/gestures/Orientation;

    .line 23
    .line 24
    if-eq v3, p2, :cond_1

    .line 25
    .line 26
    iput-object p2, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->orientation:Landroidx/compose/foundation/gestures/Orientation;

    .line 27
    .line 28
    move v1, v6

    .line 29
    :cond_1
    iget-object v3, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->reverseDirection:Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-static {v3, p4}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-nez v3, :cond_2

    .line 36
    .line 37
    iput-object p4, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->reverseDirection:Ljava/lang/Boolean;

    .line 38
    .line 39
    move v5, v6

    .line 40
    goto :goto_1

    .line 41
    :cond_2
    move v5, v1

    .line 42
    :goto_1
    iput-object p7, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->startDragImmediately:Ljava/lang/Boolean;

    .line 43
    .line 44
    iput-object p6, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableNode;->overscrollEffect:Landroidx/compose/foundation/OverscrollEffect;

    .line 45
    .line 46
    const/4 v6, 0x1

    .line 47
    const/4 v7, 0x0

    .line 48
    const/4 v1, 0x0

    .line 49
    move-object v0, p0

    .line 50
    move-object v4, p2

    .line 51
    move v2, p3

    .line 52
    move-object v3, p5

    .line 53
    invoke-static/range {v0 .. v7}, Landroidx/compose/foundation/gestures/DragGestureNode;->update$default(Landroidx/compose/foundation/gestures/DragGestureNode;Lhd/l;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/Orientation;ZILjava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method
