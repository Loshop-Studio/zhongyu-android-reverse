.class public final Landroidx/compose/foundation/gestures/Draggable2DNode;
.super Landroidx/compose/foundation/gestures/DragGestureNode;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private onDragStarted:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field private onDragStopped:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field private reverseDirection:Z

.field private startDragImmediately:Z

.field private state:Landroidx/compose/foundation/gestures/Draggable2DState;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/foundation/gestures/Draggable2DState;Lhd/l;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZZLhd/l;Lhd/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/gestures/Draggable2DState;",
            "Lhd/l;",
            "Z",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "ZZ",
            "Lhd/l;",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p2, p3, p4, v0}, Landroidx/compose/foundation/gestures/DragGestureNode;-><init>(Lhd/l;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/Orientation;)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Landroidx/compose/foundation/gestures/Draggable2DNode;->state:Landroidx/compose/foundation/gestures/Draggable2DState;

    .line 6
    .line 7
    iput-boolean p5, p0, Landroidx/compose/foundation/gestures/Draggable2DNode;->startDragImmediately:Z

    .line 8
    .line 9
    iput-boolean p6, p0, Landroidx/compose/foundation/gestures/Draggable2DNode;->reverseDirection:Z

    .line 10
    .line 11
    iput-object p7, p0, Landroidx/compose/foundation/gestures/Draggable2DNode;->onDragStarted:Lhd/l;

    .line 12
    .line 13
    iput-object p8, p0, Landroidx/compose/foundation/gestures/Draggable2DNode;->onDragStopped:Lhd/l;

    .line 14
    .line 15
    return-void
.end method

.method public static final synthetic access$getReverseDirection$p(Landroidx/compose/foundation/gestures/Draggable2DNode;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroidx/compose/foundation/gestures/Draggable2DNode;->reverseDirection:Z

    .line 2
    .line 3
    return p0
.end method

.method private final reverseIfNeeded-MK-Hz9U(J)J
    .locals 2

    .line 1
    invoke-static {p0}, Landroidx/compose/foundation/gestures/Draggable2DNode;->access$getReverseDirection$p(Landroidx/compose/foundation/gestures/Draggable2DNode;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-wide v0, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    xor-long/2addr p1, v0

    .line 13
    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Offset;->constructor-impl(J)J

    .line 14
    .line 15
    .line 16
    move-result-wide p1

    .line 17
    :cond_0
    return-wide p1
.end method


# virtual methods
.method public drag(Lhd/p;Lvc/c;)Ljava/lang/Object;
    .locals 4
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
    iget-object v0, p0, Landroidx/compose/foundation/gestures/Draggable2DNode;->state:Landroidx/compose/foundation/gestures/Draggable2DState;

    .line 2
    .line 3
    sget-object v1, Landroidx/compose/foundation/MutatePriority;->UserInput:Landroidx/compose/foundation/MutatePriority;

    .line 4
    .line 5
    new-instance v2, Landroidx/compose/foundation/gestures/Draggable2DNode$drag$2;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v2, p1, p0, v3}, Landroidx/compose/foundation/gestures/Draggable2DNode$drag$2;-><init>(Lhd/p;Landroidx/compose/foundation/gestures/Draggable2DNode;Lvc/c;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, v1, v2, p2}, Landroidx/compose/foundation/gestures/Draggable2DState;->drag(Landroidx/compose/foundation/MutatePriority;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    if-ne p1, p2, :cond_0

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 23
    .line 24
    return-object p1
.end method

.method public onDragStarted-k-4lQ0M(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/gestures/Draggable2DNode;->onDragStarted:Lhd/l;

    .line 2
    .line 3
    invoke-static {p1, p2}, Landroidx/compose/ui/geometry/Offset;->box-impl(J)Landroidx/compose/ui/geometry/Offset;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public onDragStopped-TH1AsA0(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/gestures/Draggable2DNode;->onDragStopped:Lhd/l;

    .line 2
    .line 3
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Velocity;->box-impl(J)Landroidx/compose/ui/unit/Velocity;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public startDragImmediately()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/gestures/Draggable2DNode;->startDragImmediately:Z

    .line 2
    .line 3
    return v0
.end method

.method public final update(Landroidx/compose/foundation/gestures/Draggable2DState;Lhd/l;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZZLhd/l;Lhd/l;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/gestures/Draggable2DState;",
            "Lhd/l;",
            "Z",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "ZZ",
            "Lhd/l;",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/gestures/Draggable2DNode;->state:Landroidx/compose/foundation/gestures/Draggable2DState;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iput-object p1, p0, Landroidx/compose/foundation/gestures/Draggable2DNode;->state:Landroidx/compose/foundation/gestures/Draggable2DState;

    .line 11
    .line 12
    move p1, v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    :goto_0
    iget-boolean v0, p0, Landroidx/compose/foundation/gestures/Draggable2DNode;->reverseDirection:Z

    .line 16
    .line 17
    if-eq v0, p6, :cond_1

    .line 18
    .line 19
    iput-boolean p6, p0, Landroidx/compose/foundation/gestures/Draggable2DNode;->reverseDirection:Z

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move v1, p1

    .line 23
    :goto_1
    iput-object p7, p0, Landroidx/compose/foundation/gestures/Draggable2DNode;->onDragStarted:Lhd/l;

    .line 24
    .line 25
    iput-object p8, p0, Landroidx/compose/foundation/gestures/Draggable2DNode;->onDragStopped:Lhd/l;

    .line 26
    .line 27
    iput-boolean p5, p0, Landroidx/compose/foundation/gestures/Draggable2DNode;->startDragImmediately:Z

    .line 28
    .line 29
    const/4 p6, 0x0

    .line 30
    move-object p5, p4

    .line 31
    move p7, v1

    .line 32
    move p4, p3

    .line 33
    move-object p3, p2

    .line 34
    move-object p2, p0

    .line 35
    invoke-virtual/range {p2 .. p7}, Landroidx/compose/foundation/gestures/DragGestureNode;->update(Lhd/l;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/gestures/Orientation;Z)V

    .line 36
    .line 37
    .line 38
    return-void
.end method
