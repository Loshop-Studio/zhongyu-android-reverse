.class final Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$6;
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
.field final synthetic $prevValue:Lkotlin/jvm/internal/Ref$FloatRef;

.field final synthetic $target:F

.field final synthetic $this_animateScrollToItem:Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;


# direct methods
.method public constructor <init>(FLkotlin/jvm/internal/Ref$FloatRef;Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;)V
    .locals 0

    iput p1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$6;->$target:F

    iput-object p2, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$6;->$prevValue:Lkotlin/jvm/internal/Ref$FloatRef;

    iput-object p3, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$6;->$this_animateScrollToItem:Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/animation/core/AnimationScope;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$6;->invoke(Landroidx/compose/animation/core/AnimationScope;)V

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
    iget v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$6;->$target:F

    const/4 v1, 0x0

    cmpl-float v2, v0, v1

    if-lez v2, :cond_0

    .line 3
    invoke-virtual {p1}, Landroidx/compose/animation/core/AnimationScope;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget v1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$6;->$target:F

    invoke-static {v0, v1}, Lnd/o;->h(FF)F

    move-result v1

    goto :goto_0

    :cond_0
    cmpg-float v0, v0, v1

    if-gez v0, :cond_1

    .line 4
    invoke-virtual {p1}, Landroidx/compose/animation/core/AnimationScope;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget v1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$6;->$target:F

    invoke-static {v0, v1}, Lnd/o;->d(FF)F

    move-result v1

    .line 5
    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$6;->$prevValue:Lkotlin/jvm/internal/Ref$FloatRef;

    iget v0, v0, Lkotlin/jvm/internal/Ref$FloatRef;->c:F

    sub-float v0, v1, v0

    .line 6
    iget-object v2, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$6;->$this_animateScrollToItem:Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScope;

    invoke-interface {v2, v0}, Landroidx/compose/foundation/gestures/ScrollScope;->scrollBy(F)F

    move-result v2

    cmpg-float v2, v0, v2

    if-nez v2, :cond_2

    .line 7
    invoke-virtual {p1}, Landroidx/compose/animation/core/AnimationScope;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    cmpg-float v1, v1, v2

    if-nez v1, :cond_2

    goto :goto_1

    .line 8
    :cond_2
    invoke-virtual {p1}, Landroidx/compose/animation/core/AnimationScope;->cancelAnimation()V

    .line 9
    :goto_1
    iget-object p1, p0, Landroidx/compose/foundation/lazy/layout/LazyLayoutScrollScopeKt$animateScrollToItem$6;->$prevValue:Lkotlin/jvm/internal/Ref$FloatRef;

    iget v1, p1, Lkotlin/jvm/internal/Ref$FloatRef;->c:F

    add-float/2addr v1, v0

    iput v1, p1, Lkotlin/jvm/internal/Ref$FloatRef;->c:F

    return-void
.end method
