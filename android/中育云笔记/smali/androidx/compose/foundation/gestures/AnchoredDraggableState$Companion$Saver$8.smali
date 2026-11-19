.class final Landroidx/compose/foundation/gestures/AnchoredDraggableState$Companion$Saver$8;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/AnchoredDraggableState$Companion;->Saver(Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Lhd/l;Lhd/a;Lhd/l;)Landroidx/compose/runtime/saveable/Saver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lhd/l;"
    }
.end annotation


# instance fields
.field final synthetic $confirmValueChange:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field final synthetic $decayAnimationSpec:Landroidx/compose/animation/core/DecayAnimationSpec;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/DecayAnimationSpec<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $positionalThreshold:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field final synthetic $snapAnimationSpec:Landroidx/compose/animation/core/AnimationSpec;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/animation/core/AnimationSpec<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $velocityThreshold:Lhd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhd/l;Lhd/a;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Lhd/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            "Lhd/a;",
            "Landroidx/compose/animation/core/AnimationSpec<",
            "Ljava/lang/Float;",
            ">;",
            "Landroidx/compose/animation/core/DecayAnimationSpec<",
            "Ljava/lang/Float;",
            ">;",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableState$Companion$Saver$8;->$positionalThreshold:Lhd/l;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableState$Companion$Saver$8;->$velocityThreshold:Lhd/a;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableState$Companion$Saver$8;->$snapAnimationSpec:Landroidx/compose/animation/core/AnimationSpec;

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableState$Companion$Saver$8;->$decayAnimationSpec:Landroidx/compose/animation/core/DecayAnimationSpec;

    .line 8
    .line 9
    iput-object p5, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableState$Companion$Saver$8;->$confirmValueChange:Lhd/l;

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Landroidx/compose/foundation/gestures/AnchoredDraggableState;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Landroidx/compose/foundation/gestures/AnchoredDraggableState<",
            "TT;>;"
        }
    .end annotation

    .line 2
    iget-object v1, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableState$Companion$Saver$8;->$positionalThreshold:Lhd/l;

    .line 3
    iget-object v2, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableState$Companion$Saver$8;->$velocityThreshold:Lhd/a;

    .line 4
    iget-object v3, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableState$Companion$Saver$8;->$snapAnimationSpec:Landroidx/compose/animation/core/AnimationSpec;

    .line 5
    iget-object v4, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableState$Companion$Saver$8;->$decayAnimationSpec:Landroidx/compose/animation/core/DecayAnimationSpec;

    .line 6
    iget-object v5, p0, Landroidx/compose/foundation/gestures/AnchoredDraggableState$Companion$Saver$8;->$confirmValueChange:Lhd/l;

    move-object v0, p1

    .line 7
    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/gestures/AnchoredDraggableKt;->AnchoredDraggableState(Ljava/lang/Object;Lhd/l;Lhd/a;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Lhd/l;)Landroidx/compose/foundation/gestures/AnchoredDraggableState;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/gestures/AnchoredDraggableState$Companion$Saver$8;->invoke(Ljava/lang/Object;)Landroidx/compose/foundation/gestures/AnchoredDraggableState;

    move-result-object p1

    return-object p1
.end method
