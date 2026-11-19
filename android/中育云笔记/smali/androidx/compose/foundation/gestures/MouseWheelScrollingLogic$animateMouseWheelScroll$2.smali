.class final Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$animateMouseWheelScroll$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic;->animateMouseWheelScroll(Landroidx/compose/foundation/gestures/NestedScrollScope;Landroidx/compose/animation/core/AnimationState;FILhd/l;Lvc/c;)Ljava/lang/Object;
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
.field final synthetic $lastValue:Lkotlin/jvm/internal/Ref$FloatRef;

.field final synthetic $shouldCancelAnimation:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field final synthetic $this_animateMouseWheelScroll:Landroidx/compose/foundation/gestures/NestedScrollScope;

.field final synthetic this$0:Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/Ref$FloatRef;Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic;Landroidx/compose/foundation/gestures/NestedScrollScope;Lhd/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/Ref$FloatRef;",
            "Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic;",
            "Landroidx/compose/foundation/gestures/NestedScrollScope;",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$animateMouseWheelScroll$2;->$lastValue:Lkotlin/jvm/internal/Ref$FloatRef;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$animateMouseWheelScroll$2;->this$0:Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$animateMouseWheelScroll$2;->$this_animateMouseWheelScroll:Landroidx/compose/foundation/gestures/NestedScrollScope;

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$animateMouseWheelScroll$2;->$shouldCancelAnimation:Lhd/l;

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/animation/core/AnimationScope;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$animateMouseWheelScroll$2;->invoke(Landroidx/compose/animation/core/AnimationScope;)V

    sget-object p1, Lqc/q;->a:Lqc/q;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/animation/core/AnimationScope;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/animation/core/AnimationScope<",
            "Ljava/lang/Float;",
            "Landroidx/compose/animation/core/AnimationVector1D;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-virtual {p1}, Landroidx/compose/animation/core/AnimationScope;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget-object v1, p0, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$animateMouseWheelScroll$2;->$lastValue:Lkotlin/jvm/internal/Ref$FloatRef;

    iget v1, v1, Lkotlin/jvm/internal/Ref$FloatRef;->c:F

    sub-float/2addr v0, v1

    .line 3
    invoke-static {v0}, Landroidx/compose/foundation/gestures/MouseWheelScrollableKt;->access$isLowScrollingDelta(F)Z

    move-result v1

    if-nez v1, :cond_1

    .line 4
    iget-object v1, p0, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$animateMouseWheelScroll$2;->this$0:Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic;

    iget-object v2, p0, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$animateMouseWheelScroll$2;->$this_animateMouseWheelScroll:Landroidx/compose/foundation/gestures/NestedScrollScope;

    invoke-static {v1, v2, v0}, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic;->access$dispatchMouseWheelScroll(Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic;Landroidx/compose/foundation/gestures/NestedScrollScope;F)F

    move-result v1

    sub-float v1, v0, v1

    .line 5
    invoke-static {v1}, Landroidx/compose/foundation/gestures/MouseWheelScrollableKt;->access$isLowScrollingDelta(F)Z

    move-result v1

    if-nez v1, :cond_0

    .line 6
    invoke-virtual {p1}, Landroidx/compose/animation/core/AnimationScope;->cancelAnimation()V

    return-void

    .line 7
    :cond_0
    iget-object v1, p0, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$animateMouseWheelScroll$2;->$lastValue:Lkotlin/jvm/internal/Ref$FloatRef;

    iget v2, v1, Lkotlin/jvm/internal/Ref$FloatRef;->c:F

    add-float/2addr v2, v0

    iput v2, v1, Lkotlin/jvm/internal/Ref$FloatRef;->c:F

    .line 8
    :cond_1
    iget-object v0, p0, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$animateMouseWheelScroll$2;->$shouldCancelAnimation:Lhd/l;

    iget-object v1, p0, Landroidx/compose/foundation/gestures/MouseWheelScrollingLogic$animateMouseWheelScroll$2;->$lastValue:Lkotlin/jvm/internal/Ref$FloatRef;

    iget v1, v1, Lkotlin/jvm/internal/Ref$FloatRef;->c:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v0, v1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 9
    invoke-virtual {p1}, Landroidx/compose/animation/core/AnimationScope;->cancelAnimation()V

    :cond_2
    return-void
.end method
