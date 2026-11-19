.class public abstract Lcom/zykj/evaluation/ui/detail/done/DoneDetailPageKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(JZLcom/zykj/evaluation/bean/bundle/DetailBundle;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel;Lcom/zykj/evaluation/ui/guide/normal/done/DoneGuideViewModel;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p12}, Lcom/zykj/evaluation/ui/detail/done/DoneDetailPageKt;->c(JZLcom/zykj/evaluation/bean/bundle/DetailBundle;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel;Lcom/zykj/evaluation/ui/guide/normal/done/DoneGuideViewModel;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final b(JZLcom/zykj/evaluation/bean/bundle/DetailBundle;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel;Lcom/zykj/evaluation/ui/guide/normal/done/DoneGuideViewModel;Landroidx/compose/runtime/Composer;II)V
    .locals 23

    move/from16 v3, p2

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v0, p10

    move/from16 v1, p11

    const-string v2, "navController"

    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onClickToAsk"

    invoke-static {v6, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "requestPermission"

    invoke-static {v7, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, -0xf4a0b59

    move-object/from16 v4, p9

    .line 1
    invoke-interface {v4, v2}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v13

    and-int/lit8 v4, v0, 0x6

    move-wide/from16 v8, p0

    if-nez v4, :cond_1

    invoke-interface {v13, v8, v9}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v0

    goto :goto_1

    :cond_1
    move v4, v0

    :goto_1
    and-int/lit8 v10, v0, 0x30

    if-nez v10, :cond_3

    invoke-interface {v13, v3}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v10

    if-eqz v10, :cond_2

    const/16 v10, 0x20

    goto :goto_2

    :cond_2
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v4, v10

    :cond_3
    and-int/lit16 v10, v0, 0x180

    if-nez v10, :cond_5

    move-object/from16 v10, p3

    invoke-interface {v13, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_4

    const/16 v12, 0x100

    goto :goto_3

    :cond_4
    const/16 v12, 0x80

    :goto_3
    or-int/2addr v4, v12

    goto :goto_4

    :cond_5
    move-object/from16 v10, p3

    :goto_4
    and-int/lit16 v12, v0, 0xc00

    if-nez v12, :cond_7

    invoke-interface {v13, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_6

    const/16 v12, 0x800

    goto :goto_5

    :cond_6
    const/16 v12, 0x400

    :goto_5
    or-int/2addr v4, v12

    :cond_7
    and-int/lit16 v12, v0, 0x6000

    if-nez v12, :cond_9

    invoke-interface {v13, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_8

    const/16 v12, 0x4000

    goto :goto_6

    :cond_8
    const/16 v12, 0x2000

    :goto_6
    or-int/2addr v4, v12

    :cond_9
    const/high16 v12, 0x30000

    and-int/2addr v12, v0

    if-nez v12, :cond_b

    invoke-interface {v13, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_a

    const/high16 v12, 0x20000

    goto :goto_7

    :cond_a
    const/high16 v12, 0x10000

    :goto_7
    or-int/2addr v4, v12

    :cond_b
    const/high16 v12, 0x180000

    and-int/2addr v12, v0

    if-nez v12, :cond_e

    and-int/lit8 v12, v1, 0x40

    if-nez v12, :cond_c

    move-object/from16 v12, p7

    invoke-interface {v13, v12}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_d

    const/high16 v14, 0x100000

    goto :goto_8

    :cond_c
    move-object/from16 v12, p7

    :cond_d
    const/high16 v14, 0x80000

    :goto_8
    or-int/2addr v4, v14

    goto :goto_9

    :cond_e
    move-object/from16 v12, p7

    :goto_9
    const/high16 v14, 0xc00000

    and-int/2addr v14, v0

    if-nez v14, :cond_11

    and-int/lit16 v14, v1, 0x80

    if-nez v14, :cond_f

    move-object/from16 v14, p8

    invoke-interface {v13, v14}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_10

    const/high16 v15, 0x800000

    goto :goto_a

    :cond_f
    move-object/from16 v14, p8

    :cond_10
    const/high16 v15, 0x400000

    :goto_a
    or-int/2addr v4, v15

    goto :goto_b

    :cond_11
    move-object/from16 v14, p8

    :goto_b
    const v15, 0x492493

    and-int/2addr v15, v4

    const v11, 0x492492

    const/4 v2, 0x0

    const/16 v17, 0x1

    if-eq v15, v11, :cond_12

    move/from16 v11, v17

    goto :goto_c

    :cond_12
    move v11, v2

    :goto_c
    and-int/lit8 v15, v4, 0x1

    invoke-interface {v13, v11, v15}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v11

    if-eqz v11, :cond_21

    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v11, v0, 0x1

    const v18, -0x1c00001

    const v19, -0x380001

    if-eqz v11, :cond_16

    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v11

    if-eqz v11, :cond_13

    goto :goto_d

    .line 2
    :cond_13
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v11, v1, 0x40

    if-eqz v11, :cond_14

    and-int v4, v4, v19

    :cond_14
    and-int/lit16 v11, v1, 0x80

    if-eqz v11, :cond_15

    and-int v4, v4, v18

    :cond_15
    move v0, v2

    move-object v8, v12

    move-object v9, v14

    goto/16 :goto_12

    :cond_16
    :goto_d
    and-int/lit8 v11, v1, 0x40

    const v15, 0x671a9c9b

    .line 3
    const-string v10, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    move-object/from16 v20, v10

    const v10, 0x70b323c8

    if-eqz v11, :cond_19

    .line 4
    invoke-interface {v13, v10}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 5
    sget-object v11, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->INSTANCE:Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;

    sget v12, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->$stable:I

    invoke-virtual {v11, v13, v12}, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->getCurrent(Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelStoreOwner;

    move-result-object v11

    if-eqz v11, :cond_18

    .line 6
    invoke-static {v11, v13, v2}, Landroidx/hilt/navigation/compose/HiltViewModelKt;->createHiltViewModelFactory(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelProvider$Factory;

    move-result-object v12

    .line 7
    invoke-interface {v13, v15}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 8
    instance-of v10, v11, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    if-eqz v10, :cond_17

    .line 9
    move-object v10, v11

    check-cast v10, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    invoke-interface {v10}, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;->getDefaultViewModelCreationExtras()Landroidx/lifecycle/viewmodel/CreationExtras;

    move-result-object v10

    goto :goto_e

    .line 10
    :cond_17
    sget-object v10, Landroidx/lifecycle/viewmodel/CreationExtras$Empty;->INSTANCE:Landroidx/lifecycle/viewmodel/CreationExtras$Empty;

    :goto_e
    const v14, 0x9048

    move/from16 v22, v15

    const/4 v15, 0x0

    .line 11
    const-class v8, Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel;

    move-object v9, v11

    move-object v11, v12

    move-object v12, v10

    const/4 v10, 0x0

    move-object/from16 v2, v20

    const v0, 0x70b323c8

    invoke-static/range {v8 .. v15}, Landroidx/lifecycle/viewmodel/compose/ViewModelKt;->viewModel(Ljava/lang/Class;Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/ViewModel;

    move-result-object v8

    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 12
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    check-cast v8, Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel;

    and-int v4, v4, v19

    move/from16 v19, v4

    move-object v4, v8

    goto :goto_f

    :cond_18
    move-object/from16 v2, v20

    .line 13
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_19
    move v0, v10

    move-object/from16 v2, v20

    move/from16 v19, v4

    move-object v4, v12

    :goto_f
    and-int/lit16 v8, v1, 0x80

    if-eqz v8, :cond_1c

    .line 14
    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 15
    sget-object v0, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->INSTANCE:Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;

    sget v8, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->$stable:I

    invoke-virtual {v0, v13, v8}, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->getCurrent(Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelStoreOwner;

    move-result-object v9

    if-eqz v9, :cond_1b

    const/4 v0, 0x0

    .line 16
    invoke-static {v9, v13, v0}, Landroidx/hilt/navigation/compose/HiltViewModelKt;->createHiltViewModelFactory(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelProvider$Factory;

    move-result-object v11

    const v2, 0x671a9c9b

    .line 17
    invoke-interface {v13, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 18
    instance-of v2, v9, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    if-eqz v2, :cond_1a

    .line 19
    move-object v2, v9

    check-cast v2, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    invoke-interface {v2}, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;->getDefaultViewModelCreationExtras()Landroidx/lifecycle/viewmodel/CreationExtras;

    move-result-object v2

    :goto_10
    move-object v12, v2

    goto :goto_11

    .line 20
    :cond_1a
    sget-object v2, Landroidx/lifecycle/viewmodel/CreationExtras$Empty;->INSTANCE:Landroidx/lifecycle/viewmodel/CreationExtras$Empty;

    goto :goto_10

    :goto_11
    const v14, 0x9048

    const/4 v15, 0x0

    .line 21
    const-class v8, Lcom/zykj/evaluation/ui/guide/normal/done/DoneGuideViewModel;

    const/4 v10, 0x0

    invoke-static/range {v8 .. v15}, Landroidx/lifecycle/viewmodel/compose/ViewModelKt;->viewModel(Ljava/lang/Class;Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/ViewModel;

    move-result-object v2

    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 22
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    check-cast v2, Lcom/zykj/evaluation/ui/guide/normal/done/DoneGuideViewModel;

    and-int v8, v19, v18

    move v9, v8

    move-object v8, v4

    move v4, v9

    move-object v9, v2

    goto :goto_12

    .line 23
    :cond_1b
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1c
    const/4 v0, 0x0

    move-object/from16 v9, p8

    move-object v8, v4

    move/from16 v4, v19

    .line 24
    :goto_12
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_1d

    const/4 v2, -0x1

    const-string v10, "com.zykj.evaluation.ui.detail.done.DoneDetailPage (DoneDetailPage.kt:23)"

    const v11, -0xf4a0b59

    invoke-static {v11, v4, v2, v10}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 25
    :cond_1d
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-interface {v13, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v10

    and-int/lit8 v11, v4, 0x70

    const/16 v12, 0x20

    if-ne v11, v12, :cond_1e

    move/from16 v0, v17

    :cond_1e
    or-int/2addr v0, v10

    .line 26
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v10

    if-nez v0, :cond_1f

    .line 27
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v10, v0, :cond_20

    .line 28
    :cond_1f
    new-instance v10, Lcom/zykj/evaluation/ui/detail/done/DoneDetailPageKt$DoneDetailPage$1$1;

    const/4 v0, 0x0

    invoke-direct {v10, v9, v3, v0}, Lcom/zykj/evaluation/ui/detail/done/DoneDetailPageKt$DoneDetailPage$1$1;-><init>(Lcom/zykj/evaluation/ui/guide/normal/done/DoneGuideViewModel;ZLkotlin/coroutines/Continuation;)V

    .line 29
    invoke-interface {v13, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 30
    :cond_20
    check-cast v10, Lkotlin/jvm/functions/Function2;

    const/4 v0, 0x6

    invoke-static {v2, v10, v13, v0}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    and-int/lit8 v0, v4, 0xe

    shr-int/lit8 v2, v4, 0x3

    and-int/lit8 v10, v2, 0x70

    or-int/2addr v0, v10

    and-int/lit16 v2, v2, 0x380

    or-int/2addr v0, v2

    shr-int/lit8 v2, v4, 0x9

    and-int/lit16 v10, v2, 0x1c00

    or-int/2addr v0, v10

    const v10, 0xe000

    and-int/2addr v2, v10

    or-int v19, v0, v2

    shr-int/lit8 v0, v4, 0xc

    and-int/lit8 v20, v0, 0x7e

    const/16 v21, 0x13e0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v18, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x0

    move-object v15, v6

    move-object/from16 v16, v7

    move-object/from16 v6, p3

    move-object v7, v5

    move-wide/from16 v4, p0

    .line 31
    invoke-static/range {v4 .. v21}, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt;->m0(JLcom/zykj/evaluation/bean/bundle/DetailBundle;Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/detail/BaseDetailViewModel;Lcom/zykj/evaluation/ui/guide/normal/GuideViewModel;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v18

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_22

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_13

    .line 32
    :cond_21
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v9, p8

    move-object v8, v12

    .line 33
    :cond_22
    :goto_13
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v12

    if-eqz v12, :cond_23

    new-instance v0, Ly5/a;

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v10, p10

    move v11, v1

    move-wide/from16 v1, p0

    invoke-direct/range {v0 .. v11}, Ly5/a;-><init>(JZLcom/zykj/evaluation/bean/bundle/DetailBundle;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel;Lcom/zykj/evaluation/ui/guide/normal/done/DoneGuideViewModel;II)V

    invoke-interface {v12, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_23
    return-void
.end method

.method public static final c(JZLcom/zykj/evaluation/bean/bundle/DetailBundle;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel;Lcom/zykj/evaluation/ui/guide/normal/done/DoneGuideViewModel;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 13

    .line 1
    or-int/lit8 v0, p9, 0x1

    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v11

    move-wide v1, p0

    move v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v12, p10

    move-object/from16 v10, p11

    invoke-static/range {v1 .. v12}, Lcom/zykj/evaluation/ui/detail/done/DoneDetailPageKt;->b(JZLcom/zykj/evaluation/bean/bundle/DetailBundle;Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/detail/done/DoneDetailViewModel;Lcom/zykj/evaluation/ui/guide/normal/done/DoneGuideViewModel;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method
