.class public abstract Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final A(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 8
    .line 9
    return-object p0
.end method

.method public static final B(Landroidx/navigation/NavHostController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "$this$composable"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p2, "it"

    .line 7
    .line 8
    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    const/4 p2, -0x1

    .line 18
    const-string p3, "com.zykj.evaluation.ui.sheet.AnswerSheetPage.<anonymous>.<anonymous>.<anonymous> (AnswerSheetPage.kt:111)"

    .line 19
    .line 20
    const v0, -0x48f24dd4

    .line 21
    .line 22
    .line 23
    invoke-static {v0, p5, p2, p3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    const/4 p2, 0x0

    .line 27
    invoke-static {p0, p1, p4, p2}, Lv6/j0;->l(Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/compose/runtime/Composer;I)V

    .line 28
    .line 29
    .line 30
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eqz p0, :cond_1

    .line 35
    .line 36
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 37
    .line 38
    .line 39
    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 40
    .line 41
    return-object p0
.end method

.method public static final C(Landroidx/navigation/NavHostController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 2

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    const/4 p2, -0x1

    .line 13
    const-string v0, "com.zykj.evaluation.ui.sheet.AnswerSheetPage.<anonymous>.<anonymous>.<anonymous> (AnswerSheetPage.kt:119)"

    .line 14
    .line 15
    const v1, 0x133c3997

    .line 16
    .line 17
    .line 18
    invoke-static {v1, p4, p2, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    const/4 p2, 0x0

    .line 22
    invoke-static {p0, p1, p3, p2}, Lz6/w;->d(Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/compose/runtime/Composer;I)V

    .line 23
    .line 24
    .line 25
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_1

    .line 30
    .line 31
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 32
    .line 33
    .line 34
    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0
.end method

.method public static final D(Landroidx/navigation/NavHostController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 2

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    const/4 p2, -0x1

    .line 13
    const-string v0, "com.zykj.evaluation.ui.sheet.AnswerSheetPage.<anonymous>.<anonymous>.<anonymous> (AnswerSheetPage.kt:127)"

    .line 14
    .line 15
    const v1, -0x6b9afb32

    .line 16
    .line 17
    .line 18
    invoke-static {v1, p4, p2, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    const/4 p2, 0x0

    .line 22
    invoke-static {p0, p1, p3, p2}, Lz6/b0;->e(Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/compose/runtime/Composer;I)V

    .line 23
    .line 24
    .line 25
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_1

    .line 30
    .line 31
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 32
    .line 33
    .line 34
    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0
.end method

.method public static final E(Landroidx/navigation/NavHostController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 2

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    const/4 p2, -0x1

    .line 13
    const-string v0, "com.zykj.evaluation.ui.sheet.AnswerSheetPage.<anonymous>.<anonymous>.<anonymous> (AnswerSheetPage.kt:135)"

    .line 14
    .line 15
    const v1, -0x64479db1

    .line 16
    .line 17
    .line 18
    invoke-static {v1, p4, p2, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    const/4 p2, 0x0

    .line 22
    invoke-static {p0, p1, p3, p2}, Lz6/s;->e(Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/compose/runtime/Composer;I)V

    .line 23
    .line 24
    .line 25
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_1

    .line 30
    .line 31
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 32
    .line 33
    .line 34
    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0
.end method

.method public static final F(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/navigation/NavHostController;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 2

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    const/4 p2, -0x1

    .line 13
    const-string v0, "com.zykj.evaluation.ui.sheet.AnswerSheetPage.<anonymous>.<anonymous>.<anonymous> (AnswerSheetPage.kt:143)"

    .line 14
    .line 15
    const v1, -0x5cf44030

    .line 16
    .line 17
    .line 18
    invoke-static {v1, p4, p2, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    instance-of p2, p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    .line 22
    .line 23
    if-eqz p2, :cond_1

    .line 24
    .line 25
    const p2, -0x2bb8c3b4

    .line 26
    .line 27
    .line 28
    invoke-interface {p3, p2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 29
    .line 30
    .line 31
    check-cast p0, Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;

    .line 32
    .line 33
    const/4 p2, 0x0

    .line 34
    invoke-static {p1, p0, p3, p2}, Lz6/n;->j(Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/sheet/normal/NormalViewModel;Landroidx/compose/runtime/Composer;I)V

    .line 35
    .line 36
    .line 37
    :goto_0
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const p0, -0x2bffd1ae

    .line 42
    .line 43
    .line 44
    invoke-interface {p3, p0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :goto_1
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-eqz p0, :cond_2

    .line 53
    .line 54
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 55
    .line 56
    .line 57
    :cond_2
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 58
    .line 59
    return-object p0
.end method

.method public static final G(Lkotlin/jvm/functions/Function1;Landroidx/navigation/NavHostController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 7

    .line 1
    const-string v0, "$this$composable"

    .line 2
    .line 3
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p4, "it"

    .line 7
    .line 8
    invoke-static {p5, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 12
    .line 13
    .line 14
    move-result p4

    .line 15
    if-eqz p4, :cond_0

    .line 16
    .line 17
    const/4 p4, -0x1

    .line 18
    const-string p5, "com.zykj.evaluation.ui.sheet.AnswerSheetPage.<anonymous>.<anonymous>.<anonymous> (AnswerSheetPage.kt:89)"

    .line 19
    .line 20
    const v0, -0x4b92234c

    .line 21
    .line 22
    .line 23
    invoke-static {v0, p7, p4, p5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    const/16 v6, 0xc00

    .line 27
    .line 28
    move-object v1, p0

    .line 29
    move-object v2, p1

    .line 30
    move-object v3, p2

    .line 31
    move-object v4, p3

    .line 32
    move-object v5, p6

    .line 33
    invoke-static/range {v1 .. v6}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt;->w(Lkotlin/jvm/functions/Function1;Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    .line 34
    .line 35
    .line 36
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    if-eqz p0, :cond_1

    .line 41
    .line 42
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 43
    .line 44
    .line 45
    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 46
    .line 47
    return-object p0
.end method

.method public static final H(Ljava/lang/String;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 10

    .line 1
    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move/from16 v9, p7

    move-object/from16 v7, p8

    invoke-static/range {v1 .. v9}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt;->v(Ljava/lang/String;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final I(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function0;Landroidx/navigation/NavController;)Lkotlin/Unit;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->K()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->n()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p2}, Landroidx/navigation/NavController;->popBackStack()Z

    .line 15
    .line 16
    .line 17
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 18
    .line 19
    return-object p0
.end method

.method public static final J(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/evaluation/base/BaseViewModel;->c()V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 5
    .line 6
    return-object p0
.end method

.method public static final K(Lv6/v;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/navigation/NavController;Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 10

    .line 1
    move/from16 v2, p6

    .line 2
    .line 3
    const-string v3, "$this$BoxWithLoadState"

    .line 4
    .line 5
    invoke-static {p4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    and-int/lit8 v3, v2, 0x11

    .line 9
    .line 10
    const/16 v4, 0x10

    .line 11
    .line 12
    const/4 v5, 0x1

    .line 13
    if-eq v3, v4, :cond_0

    .line 14
    .line 15
    move v3, v5

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v3, 0x0

    .line 18
    :goto_0
    and-int/lit8 v4, v2, 0x1

    .line 19
    .line 20
    invoke-interface {p5, v3, v4}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_6

    .line 25
    .line 26
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    const/4 v3, -0x1

    .line 33
    const-string v4, "com.zykj.evaluation.ui.sheet.AnswerSheetPage.<anonymous> (AnswerSheetPage.kt:182)"

    .line 34
    .line 35
    const v6, -0x5ea463ec

    .line 36
    .line 37
    .line 38
    invoke-static {v6, v2, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    const/4 v4, 0x0

    .line 45
    invoke-static {v2, v3, v5, v4}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {p0}, Lv6/v;->c()Lv6/w;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {p0}, Lv6/v;->d()I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    invoke-interface {p5, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    invoke-interface {p5, p3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    or-int/2addr v5, v6

    .line 66
    invoke-interface {p5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    if-nez v5, :cond_2

    .line 71
    .line 72
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 73
    .line 74
    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    if-ne v6, v5, :cond_3

    .line 79
    .line 80
    :cond_2
    new-instance v6, Lv6/q;

    .line 81
    .line 82
    invoke-direct {v6, p2, p3}, Lv6/q;-><init>(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/navigation/NavController;)V

    .line 83
    .line 84
    .line 85
    invoke-interface {p5, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    :cond_3
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 89
    .line 90
    invoke-interface {p5, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    invoke-interface {p5, p3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v8

    .line 98
    or-int/2addr v5, v8

    .line 99
    invoke-interface {p5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v8

    .line 103
    if-nez v5, :cond_4

    .line 104
    .line 105
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 106
    .line 107
    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    if-ne v8, v5, :cond_5

    .line 112
    .line 113
    :cond_4
    new-instance v8, Lv6/r;

    .line 114
    .line 115
    invoke-direct {v8, p2, p3}, Lv6/r;-><init>(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/navigation/NavController;)V

    .line 116
    .line 117
    .line 118
    invoke-interface {p5, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    :cond_5
    move-object v5, v8

    .line 122
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 123
    .line 124
    const/4 v8, 0x6

    .line 125
    const/16 v9, 0x40

    .line 126
    .line 127
    move-object v0, v2

    .line 128
    move v2, v4

    .line 129
    move-object v4, v6

    .line 130
    const/4 v6, 0x0

    .line 131
    move-object v7, p5

    .line 132
    move-object v1, v3

    .line 133
    move-object v3, p1

    .line 134
    invoke-static/range {v0 .. v9}, Lcom/zykj/evaluation/ui/sheet/widget/AnswerSheetViewKt;->C(Landroidx/compose/ui/Modifier;Lv6/w;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/lifecycle/LifecycleOwner;Landroidx/compose/runtime/Composer;II)V

    .line 135
    .line 136
    .line 137
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    if-eqz v0, :cond_7

    .line 142
    .line 143
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 144
    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_6
    invoke-interface {p5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 148
    .line 149
    .line 150
    :cond_7
    :goto_1
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 151
    .line 152
    return-object v0
.end method

.method public static final L(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/navigation/NavController;Lb7/c1;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "result"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lv6/s;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lv6/s;-><init>(Landroidx/navigation/NavController;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p2, v0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->G(Lb7/c1;Lkotlin/jvm/functions/Function0;)V

    .line 12
    .line 13
    .line 14
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 15
    .line 16
    return-object p0
.end method

.method public static final M(Landroidx/navigation/NavController;)Lkotlin/Unit;
    .locals 2

    .line 1
    const-string v0, "\u626b\u63cf\u6210\u529f\u8fd4\u56de"

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/navigation/NavController;->getPreviousBackStackEntry()Landroidx/navigation/NavBackStackEntry;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, Landroidx/navigation/NavBackStackEntry;->getSavedStateHandle()Landroidx/lifecycle/SavedStateHandle;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    :goto_0
    invoke-virtual {p0}, Landroidx/navigation/NavController;->popBackStack()Z

    .line 23
    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    const-string p0, "ANSWER_SHEET_KEY_BACK"

    .line 28
    .line 29
    const-string v1, "ANSWER_SHEET_KEY_BACK_TAKE_PHOTO_RESULT"

    .line 30
    .line 31
    invoke-virtual {v0, p0, v1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0
.end method

.method public static final N(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/navigation/NavController;Lb7/c1;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "result"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lv6/t;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lv6/t;-><init>(Landroidx/navigation/NavController;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p2, v0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->F(Lb7/c1;Lkotlin/jvm/functions/Function0;)V

    .line 12
    .line 13
    .line 14
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 15
    .line 16
    return-object p0
.end method

.method public static final O(Landroidx/navigation/NavController;)Lkotlin/Unit;
    .locals 2

    .line 1
    const-string v0, "\u626b\u63cf\u5931\u8d25\u8fd4\u56de"

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/navigation/NavController;->getPreviousBackStackEntry()Landroidx/navigation/NavBackStackEntry;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, Landroidx/navigation/NavBackStackEntry;->getSavedStateHandle()Landroidx/lifecycle/SavedStateHandle;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    :goto_0
    invoke-virtual {p0}, Landroidx/navigation/NavController;->popBackStack()Z

    .line 23
    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    const-string p0, "ANSWER_SHEET_KEY_BACK"

    .line 28
    .line 29
    const-string v1, "ANSWER_SHEET_KEY_BACK_TAKE_PHOTO_RESULT"

    .line 30
    .line 31
    invoke-virtual {v0, p0, v1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0
.end method

.method public static final P(Lkotlin/jvm/functions/Function1;Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 6

    .line 1
    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt;->w(Lkotlin/jvm/functions/Function1;Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final Q(Landroidx/compose/runtime/State;)Z
    .locals 1

    .line 1
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Landroidx/navigation/NavBackStackEntry;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/navigation/NavBackStackEntry;->getDestination()Landroidx/navigation/NavDestination;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/navigation/NavDestination;->getRoute()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    :goto_0
    const-string v0, "ANSWER_SHEET_PREVIEW"

    .line 22
    .line 23
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0
.end method

.method public static final R(Lkotlin/jvm/functions/Function1;Landroidx/navigation/NavController;)Lkotlin/Unit;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lg7/b;->a()Landroid/os/Bundle;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const-string p1, "ANSWER_SHEET_KEY_BUNDLE"

    .line 17
    .line 18
    const-string v0, ""

    .line 19
    .line 20
    invoke-virtual {p0, p1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 24
    .line 25
    return-object p0
.end method

.method public static synthetic a(Landroidx/navigation/NavHostController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt;->B(Landroidx/navigation/NavHostController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/String;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p9}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt;->H(Ljava/lang/String;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/navigation/NavController;Lb7/c1;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt;->N(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/navigation/NavController;Lb7/c1;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Landroidx/navigation/NavHostController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/navigation/NavGraphBuilder;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt;->y(Lkotlin/jvm/functions/Function1;Landroidx/navigation/NavHostController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/navigation/NavGraphBuilder;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/navigation/NavHostController;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt;->F(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/navigation/NavHostController;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt;->P(Lkotlin/jvm/functions/Function1;Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lv6/v;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/navigation/NavController;Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt;->K(Lv6/v;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/navigation/NavController;Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function0;Landroidx/navigation/NavController;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt;->I(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function0;Landroidx/navigation/NavController;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt;->J(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Landroidx/navigation/NavHostController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt;->E(Landroidx/navigation/NavHostController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Landroidx/compose/runtime/State;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt;->Q(Landroidx/compose/runtime/State;)Z

    move-result p0

    return p0
.end method

.method public static synthetic l(Lkotlin/jvm/functions/Function1;Landroidx/navigation/NavController;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt;->R(Lkotlin/jvm/functions/Function1;Landroidx/navigation/NavController;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/navigation/NavController;Lb7/c1;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt;->L(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/navigation/NavController;Lb7/c1;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Landroidx/navigation/NavController;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt;->M(Landroidx/navigation/NavController;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o()Lkotlin/Unit;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt;->x()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic p(Landroidx/navigation/NavHostController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt;->D(Landroidx/navigation/NavHostController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Landroidx/navigation/NavHostController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt;->C(Landroidx/navigation/NavHostController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Landroidx/navigation/NavHostController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p7}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt;->z(Landroidx/navigation/NavHostController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lkotlin/jvm/functions/Function1;Landroidx/navigation/NavHostController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p7}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt;->G(Lkotlin/jvm/functions/Function1;Landroidx/navigation/NavHostController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt;->A(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Landroidx/navigation/NavController;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt;->O(Landroidx/navigation/NavController;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final v(Ljava/lang/String;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v7, p3

    .line 8
    .line 9
    move-object/from16 v5, p4

    .line 10
    .line 11
    move/from16 v0, p7

    .line 12
    .line 13
    const-string v4, "answerSheetBundleString"

    .line 14
    .line 15
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v4, "navController"

    .line 19
    .line 20
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const-string v4, "changeOrientation"

    .line 24
    .line 25
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-string v4, "viewModel"

    .line 29
    .line 30
    invoke-static {v7, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const-string v4, "requestPermission"

    .line 34
    .line 35
    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const v4, -0x5532deef

    .line 39
    .line 40
    .line 41
    move-object/from16 v6, p6

    .line 42
    .line 43
    invoke-interface {v6, v4}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 44
    .line 45
    .line 46
    move-result-object v10

    .line 47
    and-int/lit8 v6, v0, 0x6

    .line 48
    .line 49
    const/4 v8, 0x4

    .line 50
    if-nez v6, :cond_1

    .line 51
    .line 52
    invoke-interface {v10, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    if-eqz v6, :cond_0

    .line 57
    .line 58
    move v6, v8

    .line 59
    goto :goto_0

    .line 60
    :cond_0
    const/4 v6, 0x2

    .line 61
    :goto_0
    or-int/2addr v6, v0

    .line 62
    goto :goto_1

    .line 63
    :cond_1
    move v6, v0

    .line 64
    :goto_1
    and-int/lit8 v9, v0, 0x30

    .line 65
    .line 66
    if-nez v9, :cond_3

    .line 67
    .line 68
    invoke-interface {v10, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v9

    .line 72
    if-eqz v9, :cond_2

    .line 73
    .line 74
    const/16 v9, 0x20

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_2
    const/16 v9, 0x10

    .line 78
    .line 79
    :goto_2
    or-int/2addr v6, v9

    .line 80
    :cond_3
    and-int/lit16 v9, v0, 0x180

    .line 81
    .line 82
    const/16 v11, 0x100

    .line 83
    .line 84
    if-nez v9, :cond_5

    .line 85
    .line 86
    invoke-interface {v10, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v9

    .line 90
    if-eqz v9, :cond_4

    .line 91
    .line 92
    move v9, v11

    .line 93
    goto :goto_3

    .line 94
    :cond_4
    const/16 v9, 0x80

    .line 95
    .line 96
    :goto_3
    or-int/2addr v6, v9

    .line 97
    :cond_5
    and-int/lit16 v9, v0, 0xc00

    .line 98
    .line 99
    if-nez v9, :cond_7

    .line 100
    .line 101
    invoke-interface {v10, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v9

    .line 105
    if-eqz v9, :cond_6

    .line 106
    .line 107
    const/16 v9, 0x800

    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_6
    const/16 v9, 0x400

    .line 111
    .line 112
    :goto_4
    or-int/2addr v6, v9

    .line 113
    :cond_7
    and-int/lit16 v9, v0, 0x6000

    .line 114
    .line 115
    if-nez v9, :cond_9

    .line 116
    .line 117
    invoke-interface {v10, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v9

    .line 121
    if-eqz v9, :cond_8

    .line 122
    .line 123
    const/16 v9, 0x4000

    .line 124
    .line 125
    goto :goto_5

    .line 126
    :cond_8
    const/16 v9, 0x2000

    .line 127
    .line 128
    :goto_5
    or-int/2addr v6, v9

    .line 129
    :cond_9
    and-int/lit8 v9, p8, 0x20

    .line 130
    .line 131
    const/high16 v14, 0x30000

    .line 132
    .line 133
    if-eqz v9, :cond_b

    .line 134
    .line 135
    or-int/2addr v6, v14

    .line 136
    :cond_a
    move-object/from16 v14, p5

    .line 137
    .line 138
    goto :goto_7

    .line 139
    :cond_b
    and-int/2addr v14, v0

    .line 140
    if-nez v14, :cond_a

    .line 141
    .line 142
    move-object/from16 v14, p5

    .line 143
    .line 144
    invoke-interface {v10, v14}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v15

    .line 148
    if-eqz v15, :cond_c

    .line 149
    .line 150
    const/high16 v15, 0x20000

    .line 151
    .line 152
    goto :goto_6

    .line 153
    :cond_c
    const/high16 v15, 0x10000

    .line 154
    .line 155
    :goto_6
    or-int/2addr v6, v15

    .line 156
    :goto_7
    const v15, 0x12493

    .line 157
    .line 158
    .line 159
    and-int/2addr v15, v6

    .line 160
    const v13, 0x12492

    .line 161
    .line 162
    .line 163
    const/16 v16, 0x1

    .line 164
    .line 165
    const/4 v12, 0x0

    .line 166
    if-eq v15, v13, :cond_d

    .line 167
    .line 168
    move/from16 v13, v16

    .line 169
    .line 170
    goto :goto_8

    .line 171
    :cond_d
    move v13, v12

    .line 172
    :goto_8
    and-int/lit8 v15, v6, 0x1

    .line 173
    .line 174
    invoke-interface {v10, v13, v15}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 175
    .line 176
    .line 177
    move-result v13

    .line 178
    if-eqz v13, :cond_1c

    .line 179
    .line 180
    if-eqz v9, :cond_f

    .line 181
    .line 182
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v9

    .line 186
    sget-object v13, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 187
    .line 188
    invoke-virtual {v13}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v13

    .line 192
    if-ne v9, v13, :cond_e

    .line 193
    .line 194
    new-instance v9, Lv6/u;

    .line 195
    .line 196
    invoke-direct {v9}, Lv6/u;-><init>()V

    .line 197
    .line 198
    .line 199
    invoke-interface {v10, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    :cond_e
    check-cast v9, Lkotlin/jvm/functions/Function0;

    .line 203
    .line 204
    goto :goto_9

    .line 205
    :cond_f
    move-object v9, v14

    .line 206
    :goto_9
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 207
    .line 208
    .line 209
    move-result v13

    .line 210
    if-eqz v13, :cond_10

    .line 211
    .line 212
    const/4 v13, -0x1

    .line 213
    const-string v14, "com.zykj.evaluation.ui.sheet.AnswerSheetPage (AnswerSheetPage.kt:39)"

    .line 214
    .line 215
    invoke-static {v4, v6, v13, v14}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 216
    .line 217
    .line 218
    :cond_10
    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 219
    .line 220
    and-int/lit16 v13, v6, 0x380

    .line 221
    .line 222
    if-ne v13, v11, :cond_11

    .line 223
    .line 224
    move/from16 v11, v16

    .line 225
    .line 226
    goto :goto_a

    .line 227
    :cond_11
    move v11, v12

    .line 228
    :goto_a
    and-int/lit8 v13, v6, 0xe

    .line 229
    .line 230
    if-ne v13, v8, :cond_12

    .line 231
    .line 232
    move/from16 v8, v16

    .line 233
    .line 234
    goto :goto_b

    .line 235
    :cond_12
    move v8, v12

    .line 236
    :goto_b
    or-int/2addr v8, v11

    .line 237
    invoke-interface {v10, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v11

    .line 241
    or-int/2addr v8, v11

    .line 242
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v11

    .line 246
    if-nez v8, :cond_13

    .line 247
    .line 248
    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 249
    .line 250
    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v8

    .line 254
    if-ne v11, v8, :cond_14

    .line 255
    .line 256
    :cond_13
    new-instance v11, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt$AnswerSheetPage$2$1;

    .line 257
    .line 258
    const/4 v8, 0x0

    .line 259
    invoke-direct {v11, v3, v1, v7, v8}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetPageKt$AnswerSheetPage$2$1;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/coroutines/Continuation;)V

    .line 260
    .line 261
    .line 262
    invoke-interface {v10, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    :cond_14
    check-cast v11, Lkotlin/jvm/functions/Function2;

    .line 266
    .line 267
    const/4 v8, 0x6

    .line 268
    invoke-static {v4, v11, v10, v8}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 269
    .line 270
    .line 271
    new-array v4, v12, [Landroidx/navigation/Navigator;

    .line 272
    .line 273
    invoke-static {v4, v10, v12}, Landroidx/navigation/compose/NavHostControllerKt;->rememberNavController([Landroidx/navigation/Navigator;Landroidx/compose/runtime/Composer;I)Landroidx/navigation/NavHostController;

    .line 274
    .line 275
    .line 276
    move-result-object v4

    .line 277
    invoke-static {v4, v10, v12}, Landroidx/navigation/compose/NavHostControllerKt;->currentBackStackEntryAsState(Landroidx/navigation/NavController;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 278
    .line 279
    .line 280
    move-result-object v8

    .line 281
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v11

    .line 285
    sget-object v13, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 286
    .line 287
    invoke-virtual {v13}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v14

    .line 291
    if-ne v11, v14, :cond_15

    .line 292
    .line 293
    new-instance v11, Lv6/b;

    .line 294
    .line 295
    invoke-direct {v11, v8}, Lv6/b;-><init>(Landroidx/compose/runtime/State;)V

    .line 296
    .line 297
    .line 298
    invoke-static {v11}, Landroidx/compose/runtime/SnapshotStateKt;->derivedStateOf(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/State;

    .line 299
    .line 300
    .line 301
    move-result-object v11

    .line 302
    invoke-interface {v10, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    :cond_15
    check-cast v11, Landroidx/compose/runtime/State;

    .line 306
    .line 307
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v8

    .line 311
    invoke-virtual {v13}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v14

    .line 315
    if-ne v8, v14, :cond_16

    .line 316
    .line 317
    new-instance v8, Lv6/c;

    .line 318
    .line 319
    invoke-direct {v8, v3, v2}, Lv6/c;-><init>(Lkotlin/jvm/functions/Function1;Landroidx/navigation/NavController;)V

    .line 320
    .line 321
    .line 322
    invoke-interface {v10, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 323
    .line 324
    .line 325
    :cond_16
    check-cast v8, Lkotlin/jvm/functions/Function0;

    .line 326
    .line 327
    invoke-interface {v11}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v11

    .line 331
    check-cast v11, Ljava/lang/Boolean;

    .line 332
    .line 333
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 334
    .line 335
    .line 336
    move-result v11

    .line 337
    const/16 v14, 0x30

    .line 338
    .line 339
    invoke-static {v11, v8, v10, v14, v12}, Landroidx/activity/compose/BackHandlerKt;->BackHandler(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    .line 340
    .line 341
    .line 342
    sget-object v11, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 343
    .line 344
    invoke-static {v11}, Landroidx/compose/foundation/layout/WindowInsetsPadding_androidKt;->statusBarsPadding(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 345
    .line 346
    .line 347
    move-result-object v11

    .line 348
    const v14, 0xe000

    .line 349
    .line 350
    .line 351
    and-int/2addr v14, v6

    .line 352
    const/16 v15, 0x4000

    .line 353
    .line 354
    if-ne v14, v15, :cond_17

    .line 355
    .line 356
    move/from16 v14, v16

    .line 357
    .line 358
    goto :goto_c

    .line 359
    :cond_17
    move v14, v12

    .line 360
    :goto_c
    invoke-interface {v10, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    move-result v15

    .line 364
    or-int/2addr v14, v15

    .line 365
    invoke-interface {v10, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    move-result v15

    .line 369
    or-int/2addr v14, v15

    .line 370
    const/high16 v15, 0x70000

    .line 371
    .line 372
    and-int/2addr v6, v15

    .line 373
    const/high16 v15, 0x20000

    .line 374
    .line 375
    if-ne v6, v15, :cond_18

    .line 376
    .line 377
    goto :goto_d

    .line 378
    :cond_18
    move/from16 v16, v12

    .line 379
    .line 380
    :goto_d
    or-int v6, v14, v16

    .line 381
    .line 382
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v12

    .line 386
    if-nez v6, :cond_19

    .line 387
    .line 388
    invoke-virtual {v13}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v6

    .line 392
    if-ne v12, v6, :cond_1a

    .line 393
    .line 394
    :cond_19
    move-object v6, v4

    .line 395
    goto :goto_e

    .line 396
    :cond_1a
    move-object v6, v4

    .line 397
    move-object/from16 v20, v9

    .line 398
    .line 399
    goto :goto_f

    .line 400
    :goto_e
    new-instance v4, Lv6/d;

    .line 401
    .line 402
    invoke-direct/range {v4 .. v9}, Lv6/d;-><init>(Lkotlin/jvm/functions/Function1;Landroidx/navigation/NavHostController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    .line 403
    .line 404
    .line 405
    move-object/from16 v20, v9

    .line 406
    .line 407
    invoke-interface {v10, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 408
    .line 409
    .line 410
    move-object v12, v4

    .line 411
    :goto_f
    move-object v15, v12

    .line 412
    check-cast v15, Lkotlin/jvm/functions/Function1;

    .line 413
    .line 414
    const/16 v18, 0x0

    .line 415
    .line 416
    const/16 v19, 0x3f8

    .line 417
    .line 418
    move-object v5, v6

    .line 419
    const-string v6, "ANSWER_SHEET_PREVIEW"

    .line 420
    .line 421
    const/4 v8, 0x0

    .line 422
    const/4 v9, 0x0

    .line 423
    move-object/from16 v16, v10

    .line 424
    .line 425
    const/4 v10, 0x0

    .line 426
    move-object v7, v11

    .line 427
    const/4 v11, 0x0

    .line 428
    const/4 v12, 0x0

    .line 429
    const/4 v13, 0x0

    .line 430
    const/4 v14, 0x0

    .line 431
    const/16 v17, 0x30

    .line 432
    .line 433
    invoke-static/range {v5 .. v19}, Landroidx/navigation/compose/NavHostKt;->NavHost(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    .line 434
    .line 435
    .line 436
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 437
    .line 438
    .line 439
    move-result v4

    .line 440
    if-eqz v4, :cond_1b

    .line 441
    .line 442
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 443
    .line 444
    .line 445
    :cond_1b
    move-object/from16 v6, v20

    .line 446
    .line 447
    goto :goto_10

    .line 448
    :cond_1c
    move-object/from16 v16, v10

    .line 449
    .line 450
    invoke-interface/range {v16 .. v16}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 451
    .line 452
    .line 453
    move-object v6, v14

    .line 454
    :goto_10
    invoke-interface/range {v16 .. v16}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 455
    .line 456
    .line 457
    move-result-object v9

    .line 458
    if-eqz v9, :cond_1d

    .line 459
    .line 460
    new-instance v0, Lv6/e;

    .line 461
    .line 462
    move-object/from16 v4, p3

    .line 463
    .line 464
    move-object/from16 v5, p4

    .line 465
    .line 466
    move/from16 v7, p7

    .line 467
    .line 468
    move/from16 v8, p8

    .line 469
    .line 470
    invoke-direct/range {v0 .. v8}, Lv6/e;-><init>(Ljava/lang/String;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;II)V

    .line 471
    .line 472
    .line 473
    invoke-interface {v9, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 474
    .line 475
    .line 476
    :cond_1d
    return-void
.end method

.method public static final w(Lkotlin/jvm/functions/Function1;Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
    .locals 8

    .line 1
    const v0, 0x523dc575

    .line 2
    .line 3
    .line 4
    invoke-interface {p4, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 5
    .line 6
    .line 7
    move-result-object v5

    .line 8
    and-int/lit8 p4, p5, 0x6

    .line 9
    .line 10
    if-nez p4, :cond_1

    .line 11
    .line 12
    invoke-interface {v5, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p4

    .line 16
    if-eqz p4, :cond_0

    .line 17
    .line 18
    const/4 p4, 0x4

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p4, 0x2

    .line 21
    :goto_0
    or-int/2addr p4, p5

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move p4, p5

    .line 24
    :goto_1
    and-int/lit8 v1, p5, 0x30

    .line 25
    .line 26
    if-nez v1, :cond_3

    .line 27
    .line 28
    invoke-interface {v5, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    const/16 v1, 0x20

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_2
    const/16 v1, 0x10

    .line 38
    .line 39
    :goto_2
    or-int/2addr p4, v1

    .line 40
    :cond_3
    and-int/lit16 v1, p5, 0x180

    .line 41
    .line 42
    if-nez v1, :cond_5

    .line 43
    .line 44
    invoke-interface {v5, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_4

    .line 49
    .line 50
    const/16 v1, 0x100

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_4
    const/16 v1, 0x80

    .line 54
    .line 55
    :goto_3
    or-int/2addr p4, v1

    .line 56
    :cond_5
    and-int/lit16 v1, p5, 0xc00

    .line 57
    .line 58
    const/16 v2, 0x800

    .line 59
    .line 60
    if-nez v1, :cond_7

    .line 61
    .line 62
    invoke-interface {v5, p3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_6

    .line 67
    .line 68
    move v1, v2

    .line 69
    goto :goto_4

    .line 70
    :cond_6
    const/16 v1, 0x400

    .line 71
    .line 72
    :goto_4
    or-int/2addr p4, v1

    .line 73
    :cond_7
    and-int/lit16 v1, p4, 0x493

    .line 74
    .line 75
    const/16 v3, 0x492

    .line 76
    .line 77
    const/4 v4, 0x0

    .line 78
    const/4 v6, 0x1

    .line 79
    if-eq v1, v3, :cond_8

    .line 80
    .line 81
    move v1, v6

    .line 82
    goto :goto_5

    .line 83
    :cond_8
    move v1, v4

    .line 84
    :goto_5
    and-int/lit8 v3, p4, 0x1

    .line 85
    .line 86
    invoke-interface {v5, v1, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-eqz v1, :cond_f

    .line 91
    .line 92
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-eqz v1, :cond_9

    .line 97
    .line 98
    const/4 v1, -0x1

    .line 99
    const-string v3, "com.zykj.evaluation.ui.sheet.AnswerSheetPage (AnswerSheetPage.kt:162)"

    .line 100
    .line 101
    invoke-static {v0, p4, v1, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 102
    .line 103
    .line 104
    :cond_9
    invoke-virtual {p2}, Lcom/zykj/evaluation/base/BaseViewModel;->b()Ll5/c;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {p2}, Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;->u()Lv6/v;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-interface {v5, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    and-int/lit16 p4, p4, 0x1c00

    .line 117
    .line 118
    if-ne p4, v2, :cond_a

    .line 119
    .line 120
    move p4, v6

    .line 121
    goto :goto_6

    .line 122
    :cond_a
    move p4, v4

    .line 123
    :goto_6
    or-int/2addr p4, v3

    .line 124
    invoke-interface {v5, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    or-int/2addr p4, v2

    .line 129
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    if-nez p4, :cond_b

    .line 134
    .line 135
    sget-object p4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 136
    .line 137
    invoke-virtual {p4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p4

    .line 141
    if-ne v2, p4, :cond_c

    .line 142
    .line 143
    :cond_b
    new-instance v2, Lv6/l;

    .line 144
    .line 145
    invoke-direct {v2, p2, p3, p1}, Lv6/l;-><init>(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function0;Landroidx/navigation/NavController;)V

    .line 146
    .line 147
    .line 148
    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    :cond_c
    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 152
    .line 153
    invoke-static {v4, v2, v5, v4, v6}, Landroidx/activity/compose/BackHandlerKt;->BackHandler(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0}, Ll5/c;->c()Z

    .line 157
    .line 158
    .line 159
    move-result p4

    .line 160
    invoke-interface {v5, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    if-nez v0, :cond_d

    .line 169
    .line 170
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 171
    .line 172
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    if-ne v2, v0, :cond_e

    .line 177
    .line 178
    :cond_d
    new-instance v2, Lv6/n;

    .line 179
    .line 180
    invoke-direct {v2, p2}, Lv6/n;-><init>(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;)V

    .line 181
    .line 182
    .line 183
    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    :cond_e
    move-object v3, v2

    .line 187
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 188
    .line 189
    new-instance v0, Lv6/o;

    .line 190
    .line 191
    invoke-direct {v0, v1, p0, p2, p1}, Lv6/o;-><init>(Lv6/v;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/navigation/NavController;)V

    .line 192
    .line 193
    .line 194
    const/16 v1, 0x36

    .line 195
    .line 196
    const v2, -0x5ea463ec

    .line 197
    .line 198
    .line 199
    invoke-static {v2, v6, v0, v5, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    const/16 v6, 0xc00

    .line 204
    .line 205
    const/4 v7, 0x2

    .line 206
    const/4 v2, 0x0

    .line 207
    move v1, p4

    .line 208
    invoke-static/range {v1 .. v7}, Le7/h;->d(ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    .line 209
    .line 210
    .line 211
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 212
    .line 213
    .line 214
    move-result p4

    .line 215
    if-eqz p4, :cond_10

    .line 216
    .line 217
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 218
    .line 219
    .line 220
    goto :goto_7

    .line 221
    :cond_f
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 222
    .line 223
    .line 224
    :cond_10
    :goto_7
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 225
    .line 226
    .line 227
    move-result-object p4

    .line 228
    if-eqz p4, :cond_11

    .line 229
    .line 230
    new-instance v0, Lv6/p;

    .line 231
    .line 232
    move-object v1, p0

    .line 233
    move-object v2, p1

    .line 234
    move-object v3, p2

    .line 235
    move-object v4, p3

    .line 236
    move v5, p5

    .line 237
    invoke-direct/range {v0 .. v5}, Lv6/p;-><init>(Lkotlin/jvm/functions/Function1;Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function0;I)V

    .line 238
    .line 239
    .line 240
    invoke-interface {p4, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 241
    .line 242
    .line 243
    :cond_11
    return-void
.end method

.method public static final x()Lkotlin/Unit;
    .locals 1

    .line 1
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final y(Lkotlin/jvm/functions/Function1;Landroidx/navigation/NavHostController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/navigation/NavGraphBuilder;)Lkotlin/Unit;
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    const-string v3, "$this$NavHost"

    .line 8
    .line 9
    move-object/from16 v4, p5

    .line 10
    .line 11
    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    new-instance v3, Lv6/f;

    .line 15
    .line 16
    move-object/from16 v5, p0

    .line 17
    .line 18
    invoke-direct {v3, v5, v0, v1, v2}, Lv6/f;-><init>(Lkotlin/jvm/functions/Function1;Landroidx/navigation/NavHostController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function0;)V

    .line 19
    .line 20
    .line 21
    const v5, -0x4b92234c

    .line 22
    .line 23
    .line 24
    const/4 v6, 0x1

    .line 25
    invoke-static {v5, v6, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 26
    .line 27
    .line 28
    move-result-object v13

    .line 29
    const/16 v14, 0xfe

    .line 30
    .line 31
    const/4 v15, 0x0

    .line 32
    const-string v5, "ANSWER_SHEET"

    .line 33
    .line 34
    move v3, v6

    .line 35
    const/4 v6, 0x0

    .line 36
    const/4 v7, 0x0

    .line 37
    const/4 v8, 0x0

    .line 38
    const/4 v9, 0x0

    .line 39
    const/4 v10, 0x0

    .line 40
    const/4 v11, 0x0

    .line 41
    const/4 v12, 0x0

    .line 42
    invoke-static/range {v4 .. v15}, Landroidx/navigation/compose/NavGraphBuilderKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;ILjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    new-instance v4, Lv6/g;

    .line 46
    .line 47
    move-object/from16 v5, p4

    .line 48
    .line 49
    invoke-direct {v4, v0, v1, v5, v2}, Lv6/g;-><init>(Landroidx/navigation/NavHostController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    .line 50
    .line 51
    .line 52
    const v2, -0x5045ab55

    .line 53
    .line 54
    .line 55
    invoke-static {v2, v3, v4}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 56
    .line 57
    .line 58
    move-result-object v13

    .line 59
    const-string v5, "ANSWER_SHEET_PREVIEW"

    .line 60
    .line 61
    move-object/from16 v4, p5

    .line 62
    .line 63
    invoke-static/range {v4 .. v15}, Landroidx/navigation/compose/NavGraphBuilderKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;ILjava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    new-instance v2, Lv6/h;

    .line 67
    .line 68
    invoke-direct {v2, v0, v1}, Lv6/h;-><init>(Landroidx/navigation/NavHostController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;)V

    .line 69
    .line 70
    .line 71
    const v4, -0x48f24dd4

    .line 72
    .line 73
    .line 74
    invoke-static {v4, v3, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 75
    .line 76
    .line 77
    move-result-object v13

    .line 78
    const-string v5, "ANSWER_SHEET_MANUAL_POINT"

    .line 79
    .line 80
    move-object/from16 v4, p5

    .line 81
    .line 82
    invoke-static/range {v4 .. v15}, Landroidx/navigation/compose/NavGraphBuilderKt;->composable$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;ILjava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    new-instance v2, Lv6/i;

    .line 86
    .line 87
    invoke-direct {v2, v0, v1}, Lv6/i;-><init>(Landroidx/navigation/NavHostController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;)V

    .line 88
    .line 89
    .line 90
    const v4, 0x133c3997

    .line 91
    .line 92
    .line 93
    invoke-static {v4, v3, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 94
    .line 95
    .line 96
    move-result-object v9

    .line 97
    const/16 v10, 0xe

    .line 98
    .line 99
    const-string v5, "ANSWER_SHEET_SCAN_FAILED"

    .line 100
    .line 101
    move-object/from16 v4, p5

    .line 102
    .line 103
    invoke-static/range {v4 .. v11}, Landroidx/navigation/compose/NavGraphBuilderKt;->dialog$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function3;ILjava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    new-instance v2, Lv6/j;

    .line 107
    .line 108
    invoke-direct {v2, v0, v1}, Lv6/j;-><init>(Landroidx/navigation/NavHostController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;)V

    .line 109
    .line 110
    .line 111
    const v4, -0x6b9afb32

    .line 112
    .line 113
    .line 114
    invoke-static {v4, v3, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 115
    .line 116
    .line 117
    move-result-object v9

    .line 118
    const-string v5, "ANSWER_SHEET_SERIAL_NUM_ERROR"

    .line 119
    .line 120
    move-object/from16 v4, p5

    .line 121
    .line 122
    invoke-static/range {v4 .. v11}, Landroidx/navigation/compose/NavGraphBuilderKt;->dialog$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function3;ILjava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    new-instance v2, Lv6/k;

    .line 126
    .line 127
    invoke-direct {v2, v0, v1}, Lv6/k;-><init>(Landroidx/navigation/NavHostController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;)V

    .line 128
    .line 129
    .line 130
    const v4, -0x64479db1

    .line 131
    .line 132
    .line 133
    invoke-static {v4, v3, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 134
    .line 135
    .line 136
    move-result-object v9

    .line 137
    const-string v5, "ANSWER_SHEET_PAGE_ERROR"

    .line 138
    .line 139
    move-object/from16 v4, p5

    .line 140
    .line 141
    invoke-static/range {v4 .. v11}, Landroidx/navigation/compose/NavGraphBuilderKt;->dialog$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function3;ILjava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    new-instance v2, Lv6/m;

    .line 145
    .line 146
    invoke-direct {v2, v1, v0}, Lv6/m;-><init>(Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Landroidx/navigation/NavHostController;)V

    .line 147
    .line 148
    .line 149
    const v0, -0x5cf44030

    .line 150
    .line 151
    .line 152
    invoke-static {v0, v3, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 153
    .line 154
    .line 155
    move-result-object v9

    .line 156
    const-string v5, "ANSWER_SHEET_CORRECT_DATA"

    .line 157
    .line 158
    invoke-static/range {v4 .. v11}, Landroidx/navigation/compose/NavGraphBuilderKt;->dialog$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function3;ILjava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 162
    .line 163
    return-object v0
.end method

.method public static final z(Landroidx/navigation/NavHostController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "$this$composable"

    .line 2
    .line 3
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p4, "it"

    .line 7
    .line 8
    invoke-static {p5, p4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 12
    .line 13
    .line 14
    move-result p4

    .line 15
    if-eqz p4, :cond_0

    .line 16
    .line 17
    const/4 p4, -0x1

    .line 18
    const-string p5, "com.zykj.evaluation.ui.sheet.AnswerSheetPage.<anonymous>.<anonymous>.<anonymous> (AnswerSheetPage.kt:99)"

    .line 19
    .line 20
    const v0, -0x5045ab55

    .line 21
    .line 22
    .line 23
    invoke-static {v0, p7, p4, p5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-interface {p6, p2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p4

    .line 30
    invoke-interface {p6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p5

    .line 34
    if-nez p4, :cond_1

    .line 35
    .line 36
    sget-object p4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 37
    .line 38
    invoke-virtual {p4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p4

    .line 42
    if-ne p5, p4, :cond_2

    .line 43
    .line 44
    :cond_1
    new-instance p5, Lv6/a;

    .line 45
    .line 46
    invoke-direct {p5, p2, p3}, Lv6/a;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    .line 47
    .line 48
    .line 49
    invoke-interface {p6, p5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :cond_2
    check-cast p5, Lkotlin/jvm/functions/Function0;

    .line 53
    .line 54
    const/4 p2, 0x0

    .line 55
    invoke-static {p0, p1, p5, p6, p2}, Lcom/zykj/evaluation/ui/sheet/preview/PreviewPageKt;->w(Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/sheet/AnswerSheetViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    .line 56
    .line 57
    .line 58
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-eqz p0, :cond_3

    .line 63
    .line 64
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 65
    .line 66
    .line 67
    :cond_3
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 68
    .line 69
    return-object p0
.end method
