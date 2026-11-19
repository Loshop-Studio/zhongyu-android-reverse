.class final Landroidx/compose/animation/SharedTransitionScopeKt$SharedTransitionScope$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/SharedTransitionScopeKt;->SharedTransitionScope(Lhd/r;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lhd/q;"
    }
.end annotation


# instance fields
.field final synthetic $content:Lhd/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/r;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhd/r;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/r;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/animation/SharedTransitionScopeKt$SharedTransitionScope$1;->$content:Lhd/r;

    .line 2
    .line 3
    const/4 p1, 0x3

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/layout/LookaheadScope;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Landroidx/compose/animation/SharedTransitionScopeKt$SharedTransitionScope$1;->invoke(Landroidx/compose/ui/layout/LookaheadScope;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lqc/q;->a:Lqc/q;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/ui/layout/LookaheadScope;Landroidx/compose/runtime/Composer;I)V
    .locals 4
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.animation.SharedTransitionScope.<anonymous> (SharedTransitionScope.kt:123)"

    const v2, -0x337f1abe    # -6.757838E7f

    .line 2
    invoke-static {v2, p3, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 3
    :cond_0
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object p3

    .line 4
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne p3, v1, :cond_1

    .line 5
    sget-object p3, Lkotlin/coroutines/EmptyCoroutineContext;->c:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 6
    invoke-static {p3, p2}, Landroidx/compose/runtime/EffectsKt;->createCompositionCoroutineScope(Lkotlin/coroutines/d;Landroidx/compose/runtime/Composer;)Lsd/i0;

    move-result-object p3

    .line 7
    invoke-interface {p2, p3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 8
    :cond_1
    check-cast p3, Lsd/i0;

    .line 9
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    .line 10
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_2

    .line 11
    new-instance v1, Landroidx/compose/animation/SharedTransitionScopeImpl;

    invoke-direct {v1, p1, p3}, Landroidx/compose/animation/SharedTransitionScopeImpl;-><init>(Landroidx/compose/ui/layout/LookaheadScope;Lsd/i0;)V

    .line 12
    invoke-interface {p2, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 13
    :cond_2
    check-cast v1, Landroidx/compose/animation/SharedTransitionScopeImpl;

    .line 14
    iget-object p1, p0, Landroidx/compose/animation/SharedTransitionScopeKt$SharedTransitionScope$1;->$content:Lhd/r;

    .line 15
    sget-object p3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 16
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    .line 17
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_3

    .line 18
    new-instance v2, Landroidx/compose/animation/SharedTransitionScopeKt$SharedTransitionScope$1$1$1;

    invoke-direct {v2, v1}, Landroidx/compose/animation/SharedTransitionScopeKt$SharedTransitionScope$1$1$1;-><init>(Landroidx/compose/animation/SharedTransitionScopeImpl;)V

    .line 19
    invoke-interface {p2, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 20
    :cond_3
    check-cast v2, Lhd/q;

    invoke-static {p3, v2}, Landroidx/compose/ui/layout/LayoutModifierKt;->layout(Landroidx/compose/ui/Modifier;Lhd/q;)Landroidx/compose/ui/Modifier;

    move-result-object p3

    .line 21
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    .line 22
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_4

    .line 23
    new-instance v2, Landroidx/compose/animation/SharedTransitionScopeKt$SharedTransitionScope$1$2$1;

    invoke-direct {v2, v1}, Landroidx/compose/animation/SharedTransitionScopeKt$SharedTransitionScope$1$2$1;-><init>(Landroidx/compose/animation/SharedTransitionScopeImpl;)V

    .line 24
    invoke-interface {p2, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 25
    :cond_4
    check-cast v2, Lhd/l;

    invoke-static {p3, v2}, Landroidx/compose/ui/draw/DrawModifierKt;->drawWithContent(Landroidx/compose/ui/Modifier;Lhd/l;)Landroidx/compose/ui/Modifier;

    move-result-object p3

    const/4 v2, 0x6

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 26
    invoke-interface {p1, v1, p3, p2, v2}, Lhd/r;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 28
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object p3

    .line 29
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne p3, v0, :cond_5

    .line 30
    new-instance p3, Landroidx/compose/animation/SharedTransitionScopeKt$SharedTransitionScope$1$3$1;

    invoke-direct {p3, v1}, Landroidx/compose/animation/SharedTransitionScopeKt$SharedTransitionScope$1$3$1;-><init>(Landroidx/compose/animation/SharedTransitionScopeImpl;)V

    .line 31
    invoke-interface {p2, p3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 32
    :cond_5
    check-cast p3, Lhd/l;

    const/16 v0, 0x36

    invoke-static {p1, p3, p2, v0}, Landroidx/compose/runtime/EffectsKt;->DisposableEffect(Ljava/lang/Object;Lhd/l;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_6
    return-void
.end method
