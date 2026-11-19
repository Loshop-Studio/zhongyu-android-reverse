.class final Landroidx/compose/material3/TabRowKt$ScrollableTabRowWithSubcomposeImpl$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material3/TabRowKt;->ScrollableTabRowWithSubcomposeImpl-qhFBPw4(ILhd/q;Landroidx/compose/ui/Modifier;JJFLhd/p;Lhd/p;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lhd/p;"
    }
.end annotation


# instance fields
.field final synthetic $divider:Lhd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/p;"
        }
    .end annotation
.end field

.field final synthetic $edgePadding:F

.field final synthetic $indicator:Lhd/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/q;"
        }
    .end annotation
.end field

.field final synthetic $scrollState:Landroidx/compose/foundation/ScrollState;

.field final synthetic $selectedTabIndex:I

.field final synthetic $tabs:Lhd/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/p;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/ScrollState;FLhd/p;Lhd/p;Lhd/q;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/ScrollState;",
            "F",
            "Lhd/p;",
            "Lhd/p;",
            "Lhd/q;",
            "I)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/material3/TabRowKt$ScrollableTabRowWithSubcomposeImpl$1;->$scrollState:Landroidx/compose/foundation/ScrollState;

    .line 2
    .line 3
    iput p2, p0, Landroidx/compose/material3/TabRowKt$ScrollableTabRowWithSubcomposeImpl$1;->$edgePadding:F

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/material3/TabRowKt$ScrollableTabRowWithSubcomposeImpl$1;->$tabs:Lhd/p;

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/compose/material3/TabRowKt$ScrollableTabRowWithSubcomposeImpl$1;->$divider:Lhd/p;

    .line 8
    .line 9
    iput-object p5, p0, Landroidx/compose/material3/TabRowKt$ScrollableTabRowWithSubcomposeImpl$1;->$indicator:Lhd/q;

    .line 10
    .line 11
    iput p6, p0, Landroidx/compose/material3/TabRowKt$ScrollableTabRowWithSubcomposeImpl$1;->$selectedTabIndex:I

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/material3/TabRowKt$ScrollableTabRowWithSubcomposeImpl$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lqc/q;->a:Lqc/q;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 20
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    and-int/lit8 v3, v2, 0x3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_1

    .line 2
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void

    .line 4
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, -0x1

    const-string v5, "androidx.compose.material3.ScrollableTabRowWithSubcomposeImpl.<anonymous> (TabRow.kt:1022)"

    const v6, -0x5dc17540

    invoke-static {v6, v2, v3, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 5
    :cond_2
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    .line 6
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v5

    if-ne v2, v5, :cond_3

    .line 7
    sget-object v2, Lkotlin/coroutines/EmptyCoroutineContext;->c:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 8
    invoke-static {v2, v1}, Landroidx/compose/runtime/EffectsKt;->createCompositionCoroutineScope(Lkotlin/coroutines/d;Landroidx/compose/runtime/Composer;)Lsd/i0;

    move-result-object v2

    .line 9
    new-instance v5, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    invoke-direct {v5, v2}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;-><init>(Lsd/i0;)V

    .line 10
    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    move-object v2, v5

    .line 11
    :cond_3
    check-cast v2, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;

    .line 12
    invoke-virtual {v2}, Landroidx/compose/runtime/CompositionScopedCoroutineScopeCanceller;->getCoroutineScope()Lsd/i0;

    move-result-object v2

    .line 13
    iget-object v5, v0, Landroidx/compose/material3/TabRowKt$ScrollableTabRowWithSubcomposeImpl$1;->$scrollState:Landroidx/compose/foundation/ScrollState;

    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    invoke-interface {v1, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    iget-object v6, v0, Landroidx/compose/material3/TabRowKt$ScrollableTabRowWithSubcomposeImpl$1;->$scrollState:Landroidx/compose/foundation/ScrollState;

    .line 14
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_4

    .line 15
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v5

    if-ne v7, v5, :cond_5

    .line 16
    :cond_4
    new-instance v7, Landroidx/compose/material3/ScrollableTabData;

    invoke-direct {v7, v6, v2}, Landroidx/compose/material3/ScrollableTabData;-><init>(Landroidx/compose/foundation/ScrollState;Lsd/i0;)V

    .line 17
    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 18
    :cond_5
    move-object v12, v7

    check-cast v12, Landroidx/compose/material3/ScrollableTabData;

    .line 19
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v2, v5, v6, v7}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    .line 20
    sget-object v5, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v5}, Landroidx/compose/ui/Alignment$Companion;->getCenterStart()Landroidx/compose/ui/Alignment;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v2, v5, v6, v4, v7}, Landroidx/compose/foundation/layout/SizeKt;->wrapContentSize$default(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    .line 21
    iget-object v14, v0, Landroidx/compose/material3/TabRowKt$ScrollableTabRowWithSubcomposeImpl$1;->$scrollState:Landroidx/compose/foundation/ScrollState;

    const/16 v18, 0xe

    const/16 v19, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v13 .. v19}, Landroidx/compose/foundation/ScrollKt;->horizontalScroll$default(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;ZLandroidx/compose/foundation/gestures/FlingBehavior;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    .line 22
    invoke-static {v2}, Landroidx/compose/foundation/selection/SelectableGroupKt;->selectableGroup(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    .line 23
    invoke-static {v2}, Landroidx/compose/ui/draw/ClipKt;->clipToBounds(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    .line 24
    iget v4, v0, Landroidx/compose/material3/TabRowKt$ScrollableTabRowWithSubcomposeImpl$1;->$edgePadding:F

    invoke-interface {v1, v4}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v4

    iget-object v5, v0, Landroidx/compose/material3/TabRowKt$ScrollableTabRowWithSubcomposeImpl$1;->$tabs:Lhd/p;

    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    iget-object v5, v0, Landroidx/compose/material3/TabRowKt$ScrollableTabRowWithSubcomposeImpl$1;->$divider:Lhd/p;

    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    iget-object v5, v0, Landroidx/compose/material3/TabRowKt$ScrollableTabRowWithSubcomposeImpl$1;->$indicator:Lhd/q;

    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-interface {v1, v12}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    iget v5, v0, Landroidx/compose/material3/TabRowKt$ScrollableTabRowWithSubcomposeImpl$1;->$selectedTabIndex:I

    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v5

    or-int/2addr v4, v5

    iget v9, v0, Landroidx/compose/material3/TabRowKt$ScrollableTabRowWithSubcomposeImpl$1;->$edgePadding:F

    iget-object v10, v0, Landroidx/compose/material3/TabRowKt$ScrollableTabRowWithSubcomposeImpl$1;->$tabs:Lhd/p;

    iget-object v11, v0, Landroidx/compose/material3/TabRowKt$ScrollableTabRowWithSubcomposeImpl$1;->$divider:Lhd/p;

    iget v13, v0, Landroidx/compose/material3/TabRowKt$ScrollableTabRowWithSubcomposeImpl$1;->$selectedTabIndex:I

    iget-object v14, v0, Landroidx/compose/material3/TabRowKt$ScrollableTabRowWithSubcomposeImpl$1;->$indicator:Lhd/q;

    .line 25
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_6

    .line 26
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v5, v3, :cond_7

    .line 27
    :cond_6
    new-instance v8, Landroidx/compose/material3/TabRowKt$ScrollableTabRowWithSubcomposeImpl$1$1$1;

    invoke-direct/range {v8 .. v14}, Landroidx/compose/material3/TabRowKt$ScrollableTabRowWithSubcomposeImpl$1$1$1;-><init>(FLhd/p;Lhd/p;Landroidx/compose/material3/ScrollableTabData;ILhd/q;)V

    .line 28
    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    move-object v5, v8

    .line 29
    :cond_7
    check-cast v5, Lhd/p;

    .line 30
    invoke-static {v2, v5, v1, v6, v6}, Landroidx/compose/ui/layout/SubcomposeLayoutKt;->SubcomposeLayout(Landroidx/compose/ui/Modifier;Lhd/p;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_8
    return-void
.end method
