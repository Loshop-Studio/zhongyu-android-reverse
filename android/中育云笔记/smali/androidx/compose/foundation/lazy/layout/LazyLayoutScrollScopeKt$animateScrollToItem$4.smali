.class final Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt;->animateScrollToItem(Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;IIILandroidx/compose/ui/unit/Density;Lvc/c;)Ljava/lang/Object;
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
.field final synthetic $anim:Lkotlin/jvm/internal/Ref$ObjectRef;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Landroidx/compose/animation/core/AnimationState<",
            "Ljava/lang/Float;",
            "Landroidx/compose/animation/core/AnimationVector1D;",
            ">;>;"
        }
    .end annotation
.end field

.field final synthetic $boundDistancePx:F

.field final synthetic $forward:Z

.field final synthetic $index:I

.field final synthetic $loop:Lkotlin/jvm/internal/Ref$BooleanRef;

.field final synthetic $loops:Lkotlin/jvm/internal/Ref$IntRef;

.field final synthetic $numOfItemsForTeleport:I

.field final synthetic $prevValue:Lkotlin/jvm/internal/Ref$FloatRef;

.field final synthetic $scrollOffset:I

.field final synthetic $target:F

.field final synthetic $this_animateScrollToItem:Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;IFLkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$BooleanRef;ZFLkotlin/jvm/internal/Ref$IntRef;IILkotlin/jvm/internal/Ref$ObjectRef;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;",
            "IF",
            "Lkotlin/jvm/internal/Ref$FloatRef;",
            "Lkotlin/jvm/internal/Ref$BooleanRef;",
            "ZF",
            "Lkotlin/jvm/internal/Ref$IntRef;",
            "II",
            "Lkotlin/jvm/internal/Ref$ObjectRef<",
            "Landroidx/compose/animation/core/AnimationState<",
            "Ljava/lang/Float;",
            "Landroidx/compose/animation/core/AnimationVector1D;",
            ">;>;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$this_animateScrollToItem:Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;

    iput p2, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$index:I

    iput p3, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$target:F

    iput-object p4, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$prevValue:Lkotlin/jvm/internal/Ref$FloatRef;

    iput-object p5, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$loop:Lkotlin/jvm/internal/Ref$BooleanRef;

    iput-boolean p6, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$forward:Z

    iput p7, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$boundDistancePx:F

    iput-object p8, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$loops:Lkotlin/jvm/internal/Ref$IntRef;

    iput p9, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$numOfItemsForTeleport:I

    iput p10, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$scrollOffset:I

    iput-object p11, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$anim:Lkotlin/jvm/internal/Ref$ObjectRef;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/animation/core/AnimationScope;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->invoke(Landroidx/compose/animation/core/AnimationScope;)V

    sget-object p1, Lqc/q;->a:Lqc/q;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/animation/core/AnimationScope;)V
    .locals 8
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
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$this_animateScrollToItem:Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;

    .line 3
    iget v1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$index:I

    invoke-static {v0, v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt;->isItemVisible(Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;I)Z

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-nez v0, :cond_6

    .line 4
    iget v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$target:F

    const/4 v3, 0x0

    cmpl-float v0, v0, v3

    if-lez v0, :cond_0

    .line 5
    invoke-virtual {p1}, Landroidx/compose/animation/core/AnimationScope;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget v3, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$target:F

    invoke-static {v0, v3}, Lnd/o;->h(FF)F

    move-result v0

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p1}, Landroidx/compose/animation/core/AnimationScope;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget v3, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$target:F

    invoke-static {v0, v3}, Lnd/o;->d(FF)F

    move-result v0

    .line 7
    :goto_0
    iget-object v3, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$prevValue:Lkotlin/jvm/internal/Ref$FloatRef;

    iget v3, v3, Lkotlin/jvm/internal/Ref$FloatRef;->c:F

    sub-float/2addr v0, v3

    .line 8
    iget-object v3, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$this_animateScrollToItem:Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;

    invoke-interface {v3, v0}, Landroidx/compose/foundation/gestures/ScrollScope;->scrollBy(F)F

    move-result v3

    .line 9
    iget-object v4, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$this_animateScrollToItem:Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;

    iget v5, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$index:I

    invoke-static {v4, v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt;->isItemVisible(Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;I)Z

    move-result v4

    if-eqz v4, :cond_1

    goto/16 :goto_2

    .line 10
    :cond_1
    iget-boolean v4, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$forward:Z

    iget-object v5, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$this_animateScrollToItem:Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;

    iget v6, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$index:I

    iget v7, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$scrollOffset:I

    invoke-static {v4, v5, v6, v7}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt;->access$animateScrollToItem$isOvershot(ZLandroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;II)Z

    move-result v4

    if-nez v4, :cond_6

    cmpg-float v3, v0, v3

    if-nez v3, :cond_5

    .line 11
    iget-object v3, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$prevValue:Lkotlin/jvm/internal/Ref$FloatRef;

    iget v4, v3, Lkotlin/jvm/internal/Ref$FloatRef;->c:F

    add-float/2addr v4, v0

    iput v4, v3, Lkotlin/jvm/internal/Ref$FloatRef;->c:F

    .line 12
    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$forward:Z

    if-eqz v0, :cond_2

    .line 13
    invoke-virtual {p1}, Landroidx/compose/animation/core/AnimationScope;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget v3, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$boundDistancePx:F

    cmpl-float v0, v0, v3

    if-lez v0, :cond_3

    .line 14
    invoke-virtual {p1}, Landroidx/compose/animation/core/AnimationScope;->cancelAnimation()V

    goto :goto_1

    .line 15
    :cond_2
    invoke-virtual {p1}, Landroidx/compose/animation/core/AnimationScope;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget v3, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$boundDistancePx:F

    neg-float v3, v3

    cmpg-float v0, v0, v3

    if-gez v0, :cond_3

    .line 16
    invoke-virtual {p1}, Landroidx/compose/animation/core/AnimationScope;->cancelAnimation()V

    .line 17
    :cond_3
    :goto_1
    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$forward:Z

    if-eqz v0, :cond_4

    .line 18
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$loops:Lkotlin/jvm/internal/Ref$IntRef;

    iget v0, v0, Lkotlin/jvm/internal/Ref$IntRef;->c:I

    if-lt v0, v1, :cond_6

    iget v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$index:I

    iget-object v3, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$this_animateScrollToItem:Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;

    invoke-interface {v3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;->getLastVisibleItemIndex()I

    move-result v3

    sub-int/2addr v0, v3

    iget v3, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$numOfItemsForTeleport:I

    if-le v0, v3, :cond_6

    .line 19
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$this_animateScrollToItem:Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;

    iget v4, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$index:I

    sub-int/2addr v4, v3

    invoke-interface {v0, v4, v2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;->snapToItem(II)V

    goto :goto_2

    .line 20
    :cond_4
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$loops:Lkotlin/jvm/internal/Ref$IntRef;

    iget v0, v0, Lkotlin/jvm/internal/Ref$IntRef;->c:I

    if-lt v0, v1, :cond_6

    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$this_animateScrollToItem:Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;

    invoke-interface {v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;->getFirstVisibleItemIndex()I

    move-result v0

    iget v3, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$index:I

    sub-int/2addr v0, v3

    iget v4, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$numOfItemsForTeleport:I

    if-le v0, v4, :cond_6

    .line 21
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$this_animateScrollToItem:Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;

    add-int/2addr v3, v4

    invoke-interface {v0, v3, v2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;->snapToItem(II)V

    goto :goto_2

    .line 22
    :cond_5
    invoke-virtual {p1}, Landroidx/compose/animation/core/AnimationScope;->cancelAnimation()V

    .line 23
    iget-object p1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$loop:Lkotlin/jvm/internal/Ref$BooleanRef;

    iput-boolean v2, p1, Lkotlin/jvm/internal/Ref$BooleanRef;->c:Z

    return-void

    .line 24
    :cond_6
    :goto_2
    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$forward:Z

    iget-object v3, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$this_animateScrollToItem:Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;

    iget v4, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$index:I

    iget v5, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$scrollOffset:I

    invoke-static {v0, v3, v4, v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt;->access$animateScrollToItem$isOvershot(ZLandroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;II)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 25
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$this_animateScrollToItem:Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;

    iget v1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$scrollOffset:I

    .line 26
    iget v3, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$index:I

    invoke-interface {v0, v3, v1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;->snapToItem(II)V

    .line 27
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$loop:Lkotlin/jvm/internal/Ref$BooleanRef;

    iput-boolean v2, v0, Lkotlin/jvm/internal/Ref$BooleanRef;->c:Z

    .line 28
    invoke-virtual {p1}, Landroidx/compose/animation/core/AnimationScope;->cancelAnimation()V

    return-void

    .line 29
    :cond_7
    iget-object p1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$this_animateScrollToItem:Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;

    iget v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$index:I

    invoke-static {p1, v0}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt;->isItemVisible(Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;I)Z

    move-result p1

    if-nez p1, :cond_8

    return-void

    .line 30
    :cond_8
    iget-object p1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$this_animateScrollToItem:Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;

    iget v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$index:I

    const/4 v3, 0x0

    invoke-static {p1, v0, v2, v1, v3}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;->calculateDistanceTo$default(Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;IIILjava/lang/Object;)I

    move-result p1

    .line 31
    new-instance v0, Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll;

    iget-object v1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$4;->$anim:Lkotlin/jvm/internal/Ref$ObjectRef;

    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    check-cast v1, Landroidx/compose/animation/core/AnimationState;

    invoke-direct {v0, p1, v1}, Landroidx/compose/foundation/lazy/layout/ItemFoundInScroll;-><init>(ILandroidx/compose/animation/core/AnimationState;)V

    throw v0
.end method
