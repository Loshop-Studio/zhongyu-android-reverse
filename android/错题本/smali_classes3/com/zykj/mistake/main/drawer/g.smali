.class public abstract Lcom/zykj/mistake/main/drawer/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lcom/zykj/mistake/main/p;Lr6/a;Lr6/a;Lr6/c;Lr6/a;Lr6/a;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/a;Lr6/a;Lr6/c;Landroidx/compose/runtime/Composer;II)V
    .locals 49

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p2

    move-object/from16 v10, p3

    move-object/from16 v11, p4

    move-object/from16 v6, p5

    move-object/from16 v12, p6

    move-object/from16 v13, p7

    move-object/from16 v14, p8

    move-object/from16 v15, p9

    move-object/from16 v9, p10

    move-object/from16 v3, p11

    move-object/from16 v4, p12

    move/from16 v5, p14

    move/from16 v7, p15

    iget-object v8, v1, Lcom/zykj/mistake/main/p;->l:Ljava/util/List;

    move-object/from16 v16, v8

    iget-object v8, v1, Lcom/zykj/mistake/main/p;->g:Ljava/util/Set;

    move-object/from16 v17, v8

    iget v8, v1, Lcom/zykj/mistake/main/p;->c:I

    move/from16 v18, v8

    const-string v8, "onReset"

    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "onConfirm"

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "onSelectTimeType"

    invoke-static {v10, v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "onRequestDatePicker"

    invoke-static {v11, v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "onClearSubjects"

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "onToggleSubject"

    invoke-static {v12, v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "onSelectDiff"

    invoke-static {v13, v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "onSelectAttainedLevel"

    invoke-static {v14, v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "onSelectErrorReason"

    invoke-static {v15, v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "onSelectAllCustomTags"

    invoke-static {v9, v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "onSelectNoCustomTag"

    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "onToggleCustomTag"

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const v8, 0x586b5def

    move-object/from16 v4, p13

    .line 1
    invoke-interface {v4, v8}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v4

    and-int/lit8 v19, v5, 0x6

    const/16 v20, 0x4

    const/16 v21, 0x2

    if-nez v19, :cond_1

    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_0

    move/from16 v19, v20

    goto :goto_0

    :cond_0
    move/from16 v19, v21

    :goto_0
    or-int v19, v5, v19

    goto :goto_1

    :cond_1
    move/from16 v19, v5

    :goto_1
    and-int/lit8 v22, v5, 0x30

    const/16 v23, 0x10

    const/16 v24, 0x20

    if-nez v22, :cond_3

    invoke-interface {v4, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_2

    move/from16 v22, v24

    goto :goto_2

    :cond_2
    move/from16 v22, v23

    :goto_2
    or-int v19, v19, v22

    :cond_3
    and-int/lit16 v8, v5, 0x180

    const/16 v25, 0x80

    move/from16 v26, v8

    if-nez v26, :cond_5

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_4

    const/16 v26, 0x100

    goto :goto_3

    :cond_4
    move/from16 v26, v25

    :goto_3
    or-int v19, v19, v26

    :cond_5
    and-int/lit16 v8, v5, 0xc00

    if-nez v8, :cond_7

    invoke-interface {v4, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x800

    goto :goto_4

    :cond_6
    const/16 v8, 0x400

    :goto_4
    or-int v19, v19, v8

    :cond_7
    and-int/lit16 v8, v5, 0x6000

    if-nez v8, :cond_9

    invoke-interface {v4, v11}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x4000

    goto :goto_5

    :cond_8
    const/16 v8, 0x2000

    :goto_5
    or-int v19, v19, v8

    :cond_9
    const/high16 v8, 0x30000

    and-int/2addr v8, v5

    if-nez v8, :cond_b

    invoke-interface {v4, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_a

    const/high16 v8, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v8, 0x10000

    :goto_6
    or-int v19, v19, v8

    :cond_b
    const/high16 v8, 0x180000

    and-int/2addr v8, v5

    if-nez v8, :cond_d

    invoke-interface {v4, v12}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_c

    const/high16 v8, 0x100000

    goto :goto_7

    :cond_c
    const/high16 v8, 0x80000

    :goto_7
    or-int v19, v19, v8

    :cond_d
    const/high16 v8, 0xc00000

    and-int/2addr v8, v5

    if-nez v8, :cond_f

    invoke-interface {v4, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_e

    const/high16 v8, 0x800000

    goto :goto_8

    :cond_e
    const/high16 v8, 0x400000

    :goto_8
    or-int v19, v19, v8

    :cond_f
    const/high16 v8, 0x6000000

    and-int/2addr v8, v5

    if-nez v8, :cond_11

    invoke-interface {v4, v14}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_10

    const/high16 v8, 0x4000000

    goto :goto_9

    :cond_10
    const/high16 v8, 0x2000000

    :goto_9
    or-int v19, v19, v8

    :cond_11
    const/high16 v8, 0x30000000

    and-int/2addr v8, v5

    if-nez v8, :cond_13

    invoke-interface {v4, v15}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_12

    const/high16 v8, 0x20000000

    goto :goto_a

    :cond_12
    const/high16 v8, 0x10000000

    :goto_a
    or-int v19, v19, v8

    :cond_13
    move/from16 v8, v19

    and-int/lit8 v19, v7, 0x6

    if-nez v19, :cond_15

    invoke-interface {v4, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_14

    goto :goto_b

    :cond_14
    move/from16 v20, v21

    :goto_b
    or-int v19, v7, v20

    goto :goto_c

    :cond_15
    move/from16 v19, v7

    :goto_c
    and-int/lit8 v20, v7, 0x30

    if-nez v20, :cond_17

    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_16

    move/from16 v23, v24

    :cond_16
    or-int v19, v19, v23

    :cond_17
    and-int/lit16 v6, v7, 0x180

    if-nez v6, :cond_19

    move-object/from16 v6, p12

    invoke-interface {v4, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_18

    const/16 v25, 0x100

    :cond_18
    or-int v19, v19, v25

    :goto_d
    move/from16 v6, v19

    goto :goto_e

    :cond_19
    move-object/from16 v6, p12

    goto :goto_d

    :goto_e
    const v19, 0x12492493

    and-int v0, v8, v19

    const v2, 0x12492492

    if-ne v0, v2, :cond_1b

    and-int/lit16 v0, v6, 0x93

    const/16 v2, 0x92

    if-eq v0, v2, :cond_1a

    goto :goto_f

    :cond_1a
    const/4 v0, 0x0

    goto :goto_10

    :cond_1b
    :goto_f
    const/4 v0, 0x1

    :goto_10
    and-int/lit8 v2, v8, 0x1

    invoke-interface {v4, v0, v2}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_42

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1c

    const-string v0, "com.zykj.mistake.main.drawer.MistakeNotebookFilterPanel (MistakeNotebookFilterPanel.kt:49)"

    const v2, 0x586b5def

    invoke-static {v2, v8, v6, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 2
    :cond_1c
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    const/4 v2, 0x0

    move/from16 v44, v6

    const/4 v6, 0x0

    const/4 v9, 0x1

    invoke-static {v0, v2, v9, v6}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v19

    sget-object v9, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v9}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    move-result-wide v20

    const/16 v23, 0x2

    const/16 v24, 0x0

    const/16 v22, 0x0

    invoke-static/range {v19 .. v24}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    .line 3
    sget-object v25, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    move-object/from16 v46, v6

    invoke-virtual/range {v25 .. v25}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    move-result-object v6

    .line 4
    sget-object v26, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual/range {v26 .. v26}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    move-result-object v2

    move-object/from16 v20, v0

    const/4 v0, 0x0

    .line 5
    invoke-static {v6, v2, v4, v0}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v2

    .line 6
    invoke-static {v4, v0}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v6

    .line 7
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v0

    .line 8
    invoke-static {v4, v9}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    .line 9
    sget-object v3, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    move-result-object v5

    .line 10
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v19

    if-nez v19, :cond_1d

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 11
    :cond_1d
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 12
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v19

    if-eqz v19, :cond_1e

    .line 13
    invoke-interface {v4, v5}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    goto :goto_11

    .line 14
    :cond_1e
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 15
    :goto_11
    invoke-static {v4}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v5

    .line 16
    invoke-static {v3, v5, v2, v5, v0}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    move-result-object v0

    .line 17
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v2

    if-nez v2, :cond_1f

    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_20

    .line 18
    :cond_1f
    invoke-static {v6, v5, v6, v0}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 19
    :cond_20
    invoke-virtual {v3}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    move-result-object v0

    invoke-static {v5, v9, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 20
    sget-object v19, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    const/16 v23, 0x2

    const/16 v24, 0x0

    const/high16 v21, 0x3f800000    # 1.0f

    const/16 v22, 0x0

    .line 21
    invoke-static/range {v19 .. v24}, Landroidx/compose/foundation/layout/ColumnScope;->weight$default(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v27

    const/4 v0, 0x0

    const/4 v9, 0x1

    .line 22
    invoke-static {v0, v4, v0, v9}, Landroidx/compose/foundation/ScrollKt;->rememberScrollState(ILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/ScrollState;

    move-result-object v28

    const/16 v32, 0xe

    const/16 v33, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    invoke-static/range {v27 .. v33}, Landroidx/compose/foundation/ScrollKt;->verticalScroll$default(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;ZLandroidx/compose/foundation/gestures/FlingBehavior;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v2, 0x1c

    int-to-float v2, v2

    .line 23
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v2

    const/16 v5, 0x1e

    int-to-float v5, v5

    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v5

    .line 24
    invoke-static {v0, v2, v5}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 25
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    move-result-object v2

    .line 26
    invoke-virtual/range {v26 .. v26}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    move-result-object v5

    const/4 v6, 0x0

    .line 27
    invoke-static {v2, v5, v4, v6}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v2

    .line 28
    invoke-static {v4, v6}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v5

    .line 29
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v6

    .line 30
    invoke-static {v4, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 31
    invoke-virtual {v3}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    move-result-object v7

    .line 32
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v9

    if-nez v9, :cond_21

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 33
    :cond_21
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 34
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v9

    if-eqz v9, :cond_22

    .line 35
    invoke-interface {v4, v7}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    goto :goto_12

    .line 36
    :cond_22
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 37
    :goto_12
    invoke-static {v4}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v7

    .line 38
    invoke-static {v3, v7, v2, v7, v6}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    move-result-object v2

    .line 39
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v6

    if-nez v6, :cond_23

    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_24

    .line 40
    :cond_23
    invoke-static {v5, v7, v5, v2}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 41
    :cond_24
    invoke-virtual {v3}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    move-result-object v2

    invoke-static {v7, v0, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 42
    sget v0, Lcom/zykj/mistake/R$string;->filter:I

    const/4 v6, 0x0

    invoke-static {v0, v4, v6}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    const-wide v2, 0xff15171aL

    .line 43
    invoke-static {v2, v3}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v2

    const/16 v9, 0x12

    .line 44
    invoke-static {v9}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    move-result-wide v5

    .line 45
    sget-object v7, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    invoke-virtual {v7}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object v26

    const/16 v7, 0x14

    int-to-float v7, v7

    .line 46
    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v23

    const/16 v24, 0x7

    const/16 v25, 0x0

    move-object/from16 v19, v20

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    .line 47
    invoke-static/range {v19 .. v25}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v20

    const/16 v42, 0x0

    const v43, 0x1ffd0

    const/16 v27, 0x0

    const-wide/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const-wide/16 v32, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const v41, 0x30db0

    move-object/from16 v19, v0

    move-wide/from16 v21, v2

    move-object/from16 v40, v4

    move-wide/from16 v23, v5

    .line 48
    invoke-static/range {v19 .. v43}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v40

    const v2, 0x56eb9b01

    .line 49
    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 50
    invoke-static {}, Lkotlin/collections/u;->q()Lkotlin/collections/builders/ListBuilder;

    move-result-object v2

    const v3, 0x56eb9ece

    invoke-interface {v0, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 51
    const-string v3, "\u8fd17\u5929"

    const-string v4, "\u8fd130\u5929"

    const-string v5, "\u5168\u90e8"

    filled-new-array {v5, v3, v4}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkotlin/collections/u;->z([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    .line 52
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    :goto_13
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v19, v4, 0x1

    if-ltz v4, :cond_29

    move-object/from16 v21, v6

    check-cast v21, Ljava/lang/String;

    move/from16 v6, v18

    if-ne v6, v4, :cond_25

    const/16 v22, 0x1

    goto :goto_14

    :cond_25
    const/16 v22, 0x0

    :goto_14
    and-int/lit16 v9, v8, 0x1c00

    const/16 v7, 0x800

    if-ne v9, v7, :cond_26

    const/4 v9, 0x1

    goto :goto_15

    :cond_26
    const/4 v9, 0x0

    .line 53
    :goto_15
    invoke-interface {v0, v4}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v20

    or-int v9, v9, v20

    .line 54
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    if-nez v9, :cond_27

    .line 55
    sget-object v9, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v9}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v9

    if-ne v7, v9, :cond_28

    .line 56
    :cond_27
    new-instance v7, Lcom/zykj/mistake/feature/collection/filter/d;

    const/4 v9, 0x3

    invoke-direct {v7, v4, v9, v10}, Lcom/zykj/mistake/feature/collection/filter/d;-><init>(IILr6/c;)V

    .line 57
    invoke-interface {v0, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 58
    :cond_28
    move-object/from16 v24, v7

    check-cast v24, Lr6/a;

    .line 59
    new-instance v20, Lcom/zykj/mistake/main/drawer/m;

    const/16 v23, 0x0

    const/16 v25, 0x1c

    invoke-direct/range {v20 .. v25}, Lcom/zykj/mistake/main/drawer/m;-><init>(Ljava/lang/String;ZZLr6/a;I)V

    move-object/from16 v4, v20

    .line 60
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move/from16 v18, v6

    move/from16 v4, v19

    const/16 v9, 0x12

    goto :goto_13

    .line 61
    :cond_29
    invoke-static {}, Lkotlin/collections/u;->L()V

    throw v46

    :cond_2a
    move/from16 v6, v18

    .line 62
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 63
    iget-boolean v3, v1, Lcom/zykj/mistake/main/p;->f:Z

    .line 64
    const-string v4, "\u81ea\u5b9a\u4e49\u533a\u95f4"

    const-string v7, " - "

    if-eqz v3, :cond_2d

    .line 65
    iget-object v3, v1, Lcom/zykj/mistake/main/p;->d:Ljava/lang/String;

    .line 66
    iget-object v9, v1, Lcom/zykj/mistake/main/p;->e:Ljava/lang/String;

    if-eqz v3, :cond_2d

    .line 67
    invoke-static {v3}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    move-result v19

    if-eqz v19, :cond_2b

    goto :goto_16

    :cond_2b
    if-eqz v9, :cond_2d

    invoke-static {v9}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    move-result v19

    if-eqz v19, :cond_2c

    :goto_16
    goto :goto_18

    :cond_2c
    const/16 v4, 0x2d

    move-object/from16 v26, v5

    const/16 v5, 0x2e

    .line 68
    invoke-static {v3, v4, v5}, Lkotlin/text/w;->z(Ljava/lang/String;CC)Ljava/lang/String;

    move-result-object v3

    invoke-static {v9, v4, v5}, Lkotlin/text/w;->z(Ljava/lang/String;CC)Ljava/lang/String;

    move-result-object v4

    .line 69
    invoke-static {v3, v7, v4}, Landroid/support/v4/media/f;->D(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    :goto_17
    const/4 v9, 0x3

    goto :goto_19

    :cond_2d
    :goto_18
    move-object/from16 v26, v5

    goto :goto_17

    :goto_19
    if-ne v6, v9, :cond_2e

    const/16 v21, 0x1

    :goto_1a
    const/4 v6, 0x0

    goto :goto_1b

    :cond_2e
    const/16 v21, 0x0

    goto :goto_1a

    .line 70
    :goto_1b
    invoke-static {v4, v7, v6}, Lkotlin/text/p;->F(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v22

    .line 71
    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v3

    const v5, 0xe000

    and-int/2addr v5, v8

    const/16 v6, 0x4000

    if-ne v5, v6, :cond_2f

    const/4 v5, 0x1

    goto :goto_1c

    :cond_2f
    const/4 v5, 0x0

    :goto_1c
    or-int/2addr v3, v5

    .line 72
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_30

    .line 73
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v5, v3, :cond_31

    .line 74
    :cond_30
    new-instance v5, Landroidx/navigation/e;

    const/16 v3, 0x11

    invoke-direct {v5, v3, v1, v11}, Landroidx/navigation/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 75
    invoke-interface {v0, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 76
    :cond_31
    move-object/from16 v23, v5

    check-cast v23, Lr6/a;

    .line 77
    new-instance v19, Lcom/zykj/mistake/main/drawer/m;

    const/16 v24, 0x18

    move-object/from16 v20, v4

    invoke-direct/range {v19 .. v24}, Lcom/zykj/mistake/main/drawer/m;-><init>(Ljava/lang/String;ZZLr6/a;I)V

    move-object/from16 v3, v19

    .line 78
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 79
    invoke-virtual {v2}, Lkotlin/collections/builders/ListBuilder;->build()Ljava/util/List;

    move-result-object v20

    .line 80
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const/16 v23, 0x6

    const/16 v24, 0x4

    .line 81
    const-string v19, "\u52a0\u5165\u65f6\u95f4"

    const/16 v21, 0x0

    move-object/from16 v22, v0

    invoke-static/range {v19 .. v24}, Lcom/zykj/mistake/main/drawer/g;->d(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    .line 82
    new-instance v3, Lcom/zykj/mistake/main/drawer/m;

    .line 83
    invoke-interface/range {v17 .. v17}, Ljava/util/Set;->isEmpty()Z

    move-result v5

    const/4 v6, 0x0

    move/from16 v19, v8

    const/16 v8, 0x1c

    .line 84
    const-string v4, "\u5168\u90e8"

    move-object/from16 v7, p5

    move-object/from16 v2, p12

    move/from16 v25, v9

    move-object/from16 v9, v17

    move/from16 v17, v19

    move-object/from16 v47, v26

    move/from16 v10, v44

    const/high16 v11, 0x100000

    invoke-direct/range {v3 .. v8}, Lcom/zykj/mistake/main/drawer/m;-><init>(Ljava/lang/String;ZZLr6/a;I)V

    .line 85
    invoke-static {v3}, Lkotlin/collections/u;->y(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const v4, 0x56ec6ef4

    invoke-interface {v0, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 86
    iget-object v4, v1, Lcom/zykj/mistake/main/p;->a:Ljava/util/List;

    .line 87
    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v4, v6}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 88
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_35

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 89
    check-cast v7, Lp4/a;

    .line 90
    iget-object v8, v7, Lp4/a;->b:Ljava/lang/String;

    .line 91
    iget-wide v11, v7, Lp4/a;->a:J

    .line 92
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    invoke-interface {v9, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v21

    const/high16 v11, 0x380000

    and-int v11, v17, v11

    const/high16 v12, 0x100000

    if-ne v11, v12, :cond_32

    const/4 v11, 0x1

    goto :goto_1e

    :cond_32
    const/4 v11, 0x0

    .line 93
    :goto_1e
    invoke-interface {v0, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v19

    or-int v11, v11, v19

    .line 94
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v6

    if-nez v11, :cond_34

    .line 95
    sget-object v11, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v11}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v11

    if-ne v6, v11, :cond_33

    goto :goto_1f

    :cond_33
    move-object/from16 v11, p6

    goto :goto_20

    .line 96
    :cond_34
    :goto_1f
    new-instance v6, Lcom/zykj/mistake/feature/collection/filter/f;

    move-object/from16 v11, p6

    const/4 v12, 0x1

    invoke-direct {v6, v11, v7, v12}, Lcom/zykj/mistake/feature/collection/filter/f;-><init>(Lr6/c;Lp4/a;I)V

    .line 97
    invoke-interface {v0, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 98
    :goto_20
    move-object/from16 v23, v6

    check-cast v23, Lr6/a;

    .line 99
    new-instance v19, Lcom/zykj/mistake/main/drawer/m;

    const/16 v22, 0x0

    const/16 v24, 0xc

    move-object/from16 v20, v8

    invoke-direct/range {v19 .. v24}, Lcom/zykj/mistake/main/drawer/m;-><init>(Ljava/lang/String;ZZLr6/a;I)V

    move-object/from16 v6, v19

    .line 100
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v12, v11

    const/16 v6, 0xa

    const/high16 v11, 0x100000

    goto :goto_1d

    :cond_35
    move-object v11, v12

    .line 101
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 102
    invoke-static {v3, v5}, Lkotlin/collections/t;->t0(Ljava/util/Collection;Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v20

    const/16 v23, 0x186

    const/16 v24, 0x0

    .line 103
    const-string v19, "\u79d1\u76ee"

    const-string v21, "\u53ef\u591a\u9009\uff0c\u81f3\u5c11\u9009\u62e91\u9879"

    move-object/from16 v22, v0

    invoke-static/range {v19 .. v24}, Lcom/zykj/mistake/main/drawer/g;->d(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    .line 104
    sget v3, Lcom/zykj/mistake/R$string;->facility:I

    const/4 v6, 0x0

    invoke-static {v3, v0, v6}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v19

    .line 105
    const-string v3, "\u672a\u6253\u6807\u7b7e"

    move-object/from16 v4, v47

    filled-new-array {v4, v3}, [Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lkotlin/collections/u;->z([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    sget-object v6, Lcom/zykj/mistake/utils/d;->a:[Ljava/lang/String;

    invoke-static {v6}, Lkotlin/collections/q;->e0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/collections/t;->t0(Ljava/util/Collection;Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v5

    .line 106
    iget-object v6, v1, Lcom/zykj/mistake/main/p;->h:Ljava/lang/Integer;

    .line 107
    invoke-static {v5, v6, v13}, Lcom/zykj/mistake/main/drawer/g;->e(Ljava/util/ArrayList;Ljava/lang/Integer;Lr6/c;)Ljava/util/ArrayList;

    move-result-object v20

    const/16 v23, 0x0

    const/16 v24, 0x4

    const/16 v21, 0x0

    .line 108
    invoke-static/range {v19 .. v24}, Lcom/zykj/mistake/main/drawer/g;->d(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    .line 109
    sget v5, Lcom/zykj/mistake/R$string;->grasp:I

    const/4 v6, 0x0

    invoke-static {v5, v0, v6}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v19

    .line 110
    filled-new-array {v4, v3}, [Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lkotlin/collections/u;->z([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    sget-object v6, Lcom/zykj/mistake/utils/d;->b:[Ljava/lang/String;

    invoke-static {v6}, Lkotlin/collections/q;->e0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/collections/t;->t0(Ljava/util/Collection;Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v5

    .line 111
    iget-object v6, v1, Lcom/zykj/mistake/main/p;->i:Ljava/lang/Integer;

    .line 112
    invoke-static {v5, v6, v14}, Lcom/zykj/mistake/main/drawer/g;->e(Ljava/util/ArrayList;Ljava/lang/Integer;Lr6/c;)Ljava/util/ArrayList;

    move-result-object v20

    .line 113
    invoke-static/range {v19 .. v24}, Lcom/zykj/mistake/main/drawer/g;->d(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    .line 114
    sget v5, Lcom/zykj/mistake/R$string;->reason:I

    const/4 v6, 0x0

    invoke-static {v5, v0, v6}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v19

    .line 115
    filled-new-array {v4, v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lkotlin/collections/u;->z([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    sget-object v4, Lcom/zykj/mistake/utils/d;->c:[Ljava/lang/String;

    invoke-static {v4}, Lkotlin/collections/q;->e0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/collections/t;->t0(Ljava/util/Collection;Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v3

    .line 116
    iget-object v4, v1, Lcom/zykj/mistake/main/p;->j:Ljava/lang/Integer;

    .line 117
    invoke-static {v3, v4, v15}, Lcom/zykj/mistake/main/drawer/g;->e(Ljava/util/ArrayList;Ljava/lang/Integer;Lr6/c;)Ljava/util/ArrayList;

    move-result-object v20

    .line 118
    invoke-static/range {v19 .. v24}, Lcom/zykj/mistake/main/drawer/g;->d(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    .line 119
    sget v3, Lcom/zykj/mistake/R$string;->custom_tag:I

    const/4 v6, 0x0

    invoke-static {v3, v0, v6}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v19

    .line 120
    new-instance v3, Lcom/zykj/mistake/main/drawer/m;

    .line 121
    iget-boolean v4, v1, Lcom/zykj/mistake/main/p;->k:Z

    if-nez v4, :cond_36

    .line 122
    invoke-interface/range {v16 .. v16}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_36

    const/4 v5, 0x1

    goto :goto_21

    :cond_36
    const/4 v5, 0x0

    :goto_21
    const/4 v6, 0x0

    const/16 v8, 0x1c

    .line 123
    const-string v4, "\u5168\u90e8"

    move-object/from16 v7, p10

    const/16 v9, 0xa

    invoke-direct/range {v3 .. v8}, Lcom/zykj/mistake/main/drawer/m;-><init>(Ljava/lang/String;ZZLr6/a;I)V

    move-object v12, v3

    .line 124
    new-instance v3, Lcom/zykj/mistake/main/drawer/m;

    .line 125
    iget-boolean v5, v1, Lcom/zykj/mistake/main/p;->k:Z

    .line 126
    const-string v4, "\u672a\u6253\u6807\u7b7e"

    move-object/from16 v7, p11

    invoke-direct/range {v3 .. v8}, Lcom/zykj/mistake/main/drawer/m;-><init>(Ljava/lang/String;ZZLr6/a;I)V

    filled-new-array {v12, v3}, [Lcom/zykj/mistake/main/drawer/m;

    move-result-object v3

    .line 127
    invoke-static {v3}, Lkotlin/collections/u;->z([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const v4, 0x56ed7900

    invoke-interface {v0, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 128
    iget-object v4, v1, Lcom/zykj/mistake/main/p;->b:Ljava/util/List;

    .line 129
    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v4, v9}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 130
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_22
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3d

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 131
    check-cast v6, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 132
    invoke-virtual {v6}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getName()Ljava/lang/String;

    move-result-object v27

    if-eqz v16, :cond_38

    .line 133
    invoke-interface/range {v16 .. v16}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_38

    :cond_37
    const/16 v28, 0x0

    goto :goto_23

    .line 134
    :cond_38
    invoke-interface/range {v16 .. v16}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_39
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_37

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 135
    invoke-virtual {v8}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    move-result-wide v8

    invoke-virtual {v6}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    move-result-wide v20

    cmp-long v8, v8, v20

    if-nez v8, :cond_39

    const/16 v28, 0x1

    :goto_23
    and-int/lit16 v7, v10, 0x380

    const/16 v8, 0x100

    if-ne v7, v8, :cond_3a

    const/4 v7, 0x1

    goto :goto_24

    :cond_3a
    const/4 v7, 0x0

    .line 136
    :goto_24
    invoke-interface {v0, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v7, v9

    .line 137
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v9

    if-nez v7, :cond_3c

    .line 138
    sget-object v7, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v7

    if-ne v9, v7, :cond_3b

    goto :goto_25

    :cond_3b
    const/16 v7, 0x12

    goto :goto_26

    .line 139
    :cond_3c
    :goto_25
    new-instance v9, Landroidx/navigation/e;

    const/16 v7, 0x12

    invoke-direct {v9, v7, v2, v6}, Landroidx/navigation/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 140
    invoke-interface {v0, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 141
    :goto_26
    move-object/from16 v30, v9

    check-cast v30, Lr6/a;

    .line 142
    new-instance v26, Lcom/zykj/mistake/main/drawer/m;

    const/16 v29, 0x0

    const/16 v31, 0x14

    invoke-direct/range {v26 .. v31}, Lcom/zykj/mistake/main/drawer/m;-><init>(Ljava/lang/String;ZZLr6/a;I)V

    move-object/from16 v6, v26

    .line 143
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_22

    .line 144
    :cond_3d
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 145
    invoke-static {v3, v5}, Lkotlin/collections/t;->t0(Ljava/util/Collection;Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v20

    const/16 v23, 0x0

    const/16 v24, 0x4

    const/16 v21, 0x0

    move-object/from16 v22, v0

    .line 146
    invoke-static/range {v19 .. v24}, Lcom/zykj/mistake/main/drawer/g;->d(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    .line 147
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 148
    sget-object v3, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v3}, Landroidx/compose/foundation/layout/Arrangement;->getCenter()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    move-result-object v3

    .line 149
    sget-object v10, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v9, 0x1

    .line 150
    invoke-static {v10, v4, v9, v5}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v18

    const/16 v4, 0x16

    int-to-float v4, v4

    .line 151
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v22

    const/16 v4, 0x8

    int-to-float v4, v4

    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v20

    const/16 v23, 0x5

    const/16 v24, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    .line 152
    invoke-static/range {v18 .. v24}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    .line 153
    sget-object v5, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v5}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    move-result-object v5

    const/4 v12, 0x6

    .line 154
    invoke-static {v3, v5, v0, v12}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v3

    const/4 v6, 0x0

    .line 155
    invoke-static {v0, v6}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v5

    .line 156
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v6

    .line 157
    invoke-static {v0, v4}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    .line 158
    sget-object v7, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    move-result-object v8

    .line 159
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v9

    if-nez v9, :cond_3e

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 160
    :cond_3e
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 161
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v9

    if-eqz v9, :cond_3f

    .line 162
    invoke-interface {v0, v8}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    goto :goto_27

    .line 163
    :cond_3f
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 164
    :goto_27
    invoke-static {v0}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v8

    .line 165
    invoke-static {v7, v8, v3, v8, v6}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    move-result-object v3

    .line 166
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v6

    if-nez v6, :cond_40

    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_41

    .line 167
    :cond_40
    invoke-static {v5, v8, v5, v3}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 168
    :cond_41
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    move-result-object v3

    invoke-static {v8, v4, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 169
    sget-object v3, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 170
    sget v3, Lcom/zykj/mistake/R$string;->reset:I

    const/4 v6, 0x0

    invoke-static {v3, v0, v6}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    const-wide v4, 0xffe8f1ffL

    .line 171
    invoke-static {v4, v5}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v4

    const-wide v18, 0xff1576ffL

    move-object v2, v3

    move-wide v3, v4

    move/from16 v45, v6

    .line 172
    invoke-static/range {v18 .. v19}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v5

    shl-int/lit8 v7, v17, 0x6

    and-int/lit16 v7, v7, 0x1c00

    or-int/lit16 v9, v7, 0x1b0

    move-object/from16 v7, p1

    move-object v8, v0

    move/from16 v0, v45

    .line 173
    invoke-static/range {v2 .. v9}, Lcom/zykj/mistake/main/drawer/g;->b(Ljava/lang/String;JJLr6/a;Landroidx/compose/runtime/Composer;I)V

    const/16 v2, 0x24

    int-to-float v2, v2

    .line 174
    invoke-static {v2, v10, v8, v12}, Landroidx/compose/material3/c;->s(FLandroidx/compose/ui/Modifier$Companion;Landroidx/compose/runtime/Composer;I)V

    .line 175
    sget v2, Lcom/zykj/mistake/R$string;->confirm:I

    invoke-static {v2, v8, v0}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    .line 176
    invoke-static/range {v18 .. v19}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v3

    .line 177
    sget-object v0, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    move-result-wide v5

    shl-int/lit8 v0, v17, 0x3

    and-int/lit16 v0, v0, 0x1c00

    or-int/lit16 v9, v0, 0x1b0

    move-object/from16 v7, p2

    .line 178
    invoke-static/range {v2 .. v9}, Lcom/zykj/mistake/main/drawer/g;->b(Ljava/lang/String;JJLr6/a;Landroidx/compose/runtime/Composer;I)V

    move-object v0, v8

    .line 179
    invoke-static {v0}, Landroidx/collection/a;->D(Landroidx/compose/runtime/Composer;)Z

    move-result v2

    if-eqz v2, :cond_43

    .line 180
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_28

    :cond_42
    move-object v0, v4

    move-object v11, v12

    .line 181
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 182
    :cond_43
    :goto_28
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_44

    move-object v2, v0

    new-instance v0, Lcom/zykj/mistake/main/drawer/d;

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v12, p11

    move-object/from16 v48, v2

    move-object v7, v11

    move-object v8, v13

    move-object v9, v14

    move-object v10, v15

    move-object/from16 v2, p1

    move-object/from16 v11, p10

    move-object/from16 v13, p12

    move/from16 v14, p14

    move/from16 v15, p15

    invoke-direct/range {v0 .. v15}, Lcom/zykj/mistake/main/drawer/d;-><init>(Lcom/zykj/mistake/main/p;Lr6/a;Lr6/a;Lr6/c;Lr6/a;Lr6/a;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/a;Lr6/a;Lr6/c;II)V

    move-object/from16 v2, v48

    invoke-interface {v2, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    :cond_44
    return-void
.end method

.method public static final b(Ljava/lang/String;JJLr6/a;Landroidx/compose/runtime/Composer;I)V
    .locals 33

    .line 1
    move-wide/from16 v2, p1

    .line 2
    .line 3
    move/from16 v7, p7

    .line 4
    .line 5
    const v0, -0x26206969

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p6

    .line 9
    .line 10
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    and-int/lit8 v4, v7, 0x6

    .line 15
    .line 16
    const/4 v5, 0x4

    .line 17
    move-object/from16 v8, p0

    .line 18
    .line 19
    if-nez v4, :cond_1

    .line 20
    .line 21
    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    move v4, v5

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v4, 0x2

    .line 30
    :goto_0
    or-int/2addr v4, v7

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v4, v7

    .line 33
    :goto_1
    and-int/lit8 v6, v7, 0x30

    .line 34
    .line 35
    if-nez v6, :cond_3

    .line 36
    .line 37
    invoke-interface {v1, v2, v3}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    if-eqz v6, :cond_2

    .line 42
    .line 43
    const/16 v6, 0x20

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    const/16 v6, 0x10

    .line 47
    .line 48
    :goto_2
    or-int/2addr v4, v6

    .line 49
    :cond_3
    and-int/lit16 v6, v7, 0x180

    .line 50
    .line 51
    move-wide/from16 v10, p3

    .line 52
    .line 53
    if-nez v6, :cond_5

    .line 54
    .line 55
    invoke-interface {v1, v10, v11}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    if-eqz v6, :cond_4

    .line 60
    .line 61
    const/16 v6, 0x100

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_4
    const/16 v6, 0x80

    .line 65
    .line 66
    :goto_3
    or-int/2addr v4, v6

    .line 67
    :cond_5
    and-int/lit16 v6, v7, 0xc00

    .line 68
    .line 69
    if-nez v6, :cond_7

    .line 70
    .line 71
    move-object/from16 v6, p5

    .line 72
    .line 73
    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v9

    .line 77
    if-eqz v9, :cond_6

    .line 78
    .line 79
    const/16 v9, 0x800

    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_6
    const/16 v9, 0x400

    .line 83
    .line 84
    :goto_4
    or-int/2addr v4, v9

    .line 85
    goto :goto_5

    .line 86
    :cond_7
    move-object/from16 v6, p5

    .line 87
    .line 88
    :goto_5
    and-int/lit16 v9, v4, 0x493

    .line 89
    .line 90
    const/16 v12, 0x492

    .line 91
    .line 92
    const/4 v13, 0x0

    .line 93
    if-eq v9, v12, :cond_8

    .line 94
    .line 95
    const/4 v9, 0x1

    .line 96
    goto :goto_6

    .line 97
    :cond_8
    move v9, v13

    .line 98
    :goto_6
    and-int/lit8 v12, v4, 0x1

    .line 99
    .line 100
    invoke-interface {v1, v9, v12}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 101
    .line 102
    .line 103
    move-result v9

    .line 104
    if-eqz v9, :cond_e

    .line 105
    .line 106
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 107
    .line 108
    .line 109
    move-result v9

    .line 110
    if-eqz v9, :cond_9

    .line 111
    .line 112
    const/4 v9, -0x1

    .line 113
    const-string v12, "com.zykj.mistake.main.drawer.NotebookFilterBottomButton (MistakeNotebookFilterPanel.kt:310)"

    .line 114
    .line 115
    invoke-static {v0, v4, v9, v12}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 116
    .line 117
    .line 118
    :cond_9
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 119
    .line 120
    const/16 v9, 0x66

    .line 121
    .line 122
    int-to-float v9, v9

    .line 123
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 124
    .line 125
    .line 126
    move-result v9

    .line 127
    invoke-static {v0, v9}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    const/16 v9, 0x2a

    .line 132
    .line 133
    int-to-float v9, v9

    .line 134
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 135
    .line 136
    .line 137
    move-result v9

    .line 138
    invoke-static {v0, v9}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    int-to-float v5, v5

    .line 143
    invoke-static {v5, v0, v2, v3}, Landroidx/compose/material3/c;->f(FLandroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;

    .line 144
    .line 145
    .line 146
    move-result-object v12

    .line 147
    const/16 v17, 0x7

    .line 148
    .line 149
    const/16 v18, 0x0

    .line 150
    .line 151
    move v0, v13

    .line 152
    const/4 v13, 0x0

    .line 153
    const/4 v14, 0x0

    .line 154
    const/4 v15, 0x0

    .line 155
    move-object/from16 v16, v6

    .line 156
    .line 157
    invoke-static/range {v12 .. v18}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lr6/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    sget-object v6, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 162
    .line 163
    invoke-virtual {v6}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 164
    .line 165
    .line 166
    move-result-object v6

    .line 167
    invoke-static {v6, v0}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 168
    .line 169
    .line 170
    move-result-object v6

    .line 171
    invoke-static {v1, v0}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 176
    .line 177
    .line 178
    move-result-object v9

    .line 179
    invoke-static {v1, v5}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    sget-object v12, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 184
    .line 185
    invoke-virtual {v12}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 186
    .line 187
    .line 188
    move-result-object v13

    .line 189
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 190
    .line 191
    .line 192
    move-result-object v14

    .line 193
    if-nez v14, :cond_a

    .line 194
    .line 195
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 196
    .line 197
    .line 198
    :cond_a
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 199
    .line 200
    .line 201
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 202
    .line 203
    .line 204
    move-result v14

    .line 205
    if-eqz v14, :cond_b

    .line 206
    .line 207
    invoke-interface {v1, v13}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 208
    .line 209
    .line 210
    goto :goto_7

    .line 211
    :cond_b
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 212
    .line 213
    .line 214
    :goto_7
    invoke-static {v1}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 215
    .line 216
    .line 217
    move-result-object v13

    .line 218
    invoke-static {v12, v13, v6, v13, v9}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 219
    .line 220
    .line 221
    move-result-object v6

    .line 222
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 223
    .line 224
    .line 225
    move-result v9

    .line 226
    if-nez v9, :cond_c

    .line 227
    .line 228
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v9

    .line 232
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 233
    .line 234
    .line 235
    move-result-object v14

    .line 236
    invoke-static {v9, v14}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result v9

    .line 240
    if-nez v9, :cond_d

    .line 241
    .line 242
    :cond_c
    invoke-static {v0, v13, v0, v6}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 243
    .line 244
    .line 245
    :cond_d
    invoke-virtual {v12}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    invoke-static {v13, v5, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 250
    .line 251
    .line 252
    sget-object v0, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 253
    .line 254
    const/16 v0, 0xe

    .line 255
    .line 256
    invoke-static {v0}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 257
    .line 258
    .line 259
    move-result-wide v12

    .line 260
    sget-object v0, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    .line 261
    .line 262
    invoke-virtual {v0}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getMedium()Landroidx/compose/ui/text/font/FontWeight;

    .line 263
    .line 264
    .line 265
    move-result-object v15

    .line 266
    and-int/lit8 v0, v4, 0xe

    .line 267
    .line 268
    const v5, 0x30c00

    .line 269
    .line 270
    .line 271
    or-int/2addr v0, v5

    .line 272
    and-int/lit16 v4, v4, 0x380

    .line 273
    .line 274
    or-int v30, v0, v4

    .line 275
    .line 276
    const/16 v31, 0x0

    .line 277
    .line 278
    const v32, 0x1ffd2

    .line 279
    .line 280
    .line 281
    const/4 v9, 0x0

    .line 282
    const/4 v14, 0x0

    .line 283
    const/16 v16, 0x0

    .line 284
    .line 285
    const-wide/16 v17, 0x0

    .line 286
    .line 287
    const/16 v19, 0x0

    .line 288
    .line 289
    const/16 v20, 0x0

    .line 290
    .line 291
    const-wide/16 v21, 0x0

    .line 292
    .line 293
    const/16 v23, 0x0

    .line 294
    .line 295
    const/16 v24, 0x0

    .line 296
    .line 297
    const/16 v25, 0x0

    .line 298
    .line 299
    const/16 v26, 0x0

    .line 300
    .line 301
    const/16 v27, 0x0

    .line 302
    .line 303
    const/16 v28, 0x0

    .line 304
    .line 305
    move-object/from16 v29, v1

    .line 306
    .line 307
    invoke-static/range {v8 .. v32}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 308
    .line 309
    .line 310
    invoke-interface/range {v29 .. v29}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 311
    .line 312
    .line 313
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 314
    .line 315
    .line 316
    move-result v0

    .line 317
    if-eqz v0, :cond_f

    .line 318
    .line 319
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 320
    .line 321
    .line 322
    goto :goto_8

    .line 323
    :cond_e
    move-object/from16 v29, v1

    .line 324
    .line 325
    invoke-interface/range {v29 .. v29}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 326
    .line 327
    .line 328
    :cond_f
    :goto_8
    invoke-interface/range {v29 .. v29}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 329
    .line 330
    .line 331
    move-result-object v9

    .line 332
    if-eqz v9, :cond_10

    .line 333
    .line 334
    new-instance v0, Lcom/zykj/mistake/feature/collection/filter/h;

    .line 335
    .line 336
    const/4 v8, 0x1

    .line 337
    move-object/from16 v1, p0

    .line 338
    .line 339
    move-wide/from16 v4, p3

    .line 340
    .line 341
    move-object/from16 v6, p5

    .line 342
    .line 343
    invoke-direct/range {v0 .. v8}, Lcom/zykj/mistake/feature/collection/filter/h;-><init>(Ljava/lang/String;JJLr6/a;II)V

    .line 344
    .line 345
    .line 346
    invoke-interface {v9, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 347
    .line 348
    .line 349
    :cond_10
    return-void
.end method

.method public static final c(Ljava/lang/String;ZZZZLr6/a;Landroidx/compose/runtime/Composer;I)V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    move/from16 v4, p4

    .line 10
    .line 11
    move/from16 v5, p7

    .line 12
    .line 13
    const v6, -0x2e863f5c

    .line 14
    .line 15
    .line 16
    move-object/from16 v7, p6

    .line 17
    .line 18
    invoke-interface {v7, v6}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 19
    .line 20
    .line 21
    move-result-object v7

    .line 22
    and-int/lit8 v8, v5, 0x6

    .line 23
    .line 24
    const/4 v9, 0x2

    .line 25
    if-nez v8, :cond_1

    .line 26
    .line 27
    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v8

    .line 31
    if-eqz v8, :cond_0

    .line 32
    .line 33
    const/4 v8, 0x4

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move v8, v9

    .line 36
    :goto_0
    or-int/2addr v8, v5

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move v8, v5

    .line 39
    :goto_1
    and-int/lit8 v10, v5, 0x30

    .line 40
    .line 41
    if-nez v10, :cond_3

    .line 42
    .line 43
    invoke-interface {v7, v1}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 44
    .line 45
    .line 46
    move-result v10

    .line 47
    if-eqz v10, :cond_2

    .line 48
    .line 49
    const/16 v10, 0x20

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    const/16 v10, 0x10

    .line 53
    .line 54
    :goto_2
    or-int/2addr v8, v10

    .line 55
    :cond_3
    and-int/lit16 v10, v5, 0x180

    .line 56
    .line 57
    if-nez v10, :cond_5

    .line 58
    .line 59
    invoke-interface {v7, v2}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 60
    .line 61
    .line 62
    move-result v10

    .line 63
    if-eqz v10, :cond_4

    .line 64
    .line 65
    const/16 v10, 0x100

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_4
    const/16 v10, 0x80

    .line 69
    .line 70
    :goto_3
    or-int/2addr v8, v10

    .line 71
    :cond_5
    and-int/lit16 v10, v5, 0xc00

    .line 72
    .line 73
    if-nez v10, :cond_7

    .line 74
    .line 75
    invoke-interface {v7, v3}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 76
    .line 77
    .line 78
    move-result v10

    .line 79
    if-eqz v10, :cond_6

    .line 80
    .line 81
    const/16 v10, 0x800

    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_6
    const/16 v10, 0x400

    .line 85
    .line 86
    :goto_4
    or-int/2addr v8, v10

    .line 87
    :cond_7
    and-int/lit16 v10, v5, 0x6000

    .line 88
    .line 89
    if-nez v10, :cond_9

    .line 90
    .line 91
    invoke-interface {v7, v4}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 92
    .line 93
    .line 94
    move-result v10

    .line 95
    if-eqz v10, :cond_8

    .line 96
    .line 97
    const/16 v10, 0x4000

    .line 98
    .line 99
    goto :goto_5

    .line 100
    :cond_8
    const/16 v10, 0x2000

    .line 101
    .line 102
    :goto_5
    or-int/2addr v8, v10

    .line 103
    :cond_9
    const/high16 v10, 0x30000

    .line 104
    .line 105
    and-int/2addr v10, v5

    .line 106
    move-object/from16 v15, p5

    .line 107
    .line 108
    if-nez v10, :cond_b

    .line 109
    .line 110
    invoke-interface {v7, v15}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v10

    .line 114
    if-eqz v10, :cond_a

    .line 115
    .line 116
    const/high16 v10, 0x20000

    .line 117
    .line 118
    goto :goto_6

    .line 119
    :cond_a
    const/high16 v10, 0x10000

    .line 120
    .line 121
    :goto_6
    or-int/2addr v8, v10

    .line 122
    :cond_b
    const v10, 0x12493

    .line 123
    .line 124
    .line 125
    and-int/2addr v10, v8

    .line 126
    const v11, 0x12492

    .line 127
    .line 128
    .line 129
    const/4 v12, 0x0

    .line 130
    if-eq v10, v11, :cond_c

    .line 131
    .line 132
    const/4 v10, 0x1

    .line 133
    goto :goto_7

    .line 134
    :cond_c
    move v10, v12

    .line 135
    :goto_7
    and-int/lit8 v11, v8, 0x1

    .line 136
    .line 137
    invoke-interface {v7, v10, v11}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 138
    .line 139
    .line 140
    move-result v10

    .line 141
    if-eqz v10, :cond_1c

    .line 142
    .line 143
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 144
    .line 145
    .line 146
    move-result v10

    .line 147
    if-eqz v10, :cond_d

    .line 148
    .line 149
    const/4 v10, -0x1

    .line 150
    const-string v11, "com.zykj.mistake.main.drawer.NotebookFilterChip (MistakeNotebookFilterPanel.kt:269)"

    .line 151
    .line 152
    invoke-static {v6, v8, v10, v11}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 153
    .line 154
    .line 155
    :cond_d
    const/4 v6, 0x3

    .line 156
    const-wide v18, 0xfff5f5f5L

    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    const-wide v20, 0xffeff6ffL

    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    const/16 v10, 0x22

    .line 167
    .line 168
    const/16 v11, 0x4a

    .line 169
    .line 170
    if-nez v3, :cond_12

    .line 171
    .line 172
    if-eqz v4, :cond_e

    .line 173
    .line 174
    goto :goto_c

    .line 175
    :cond_e
    sget-object v9, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 176
    .line 177
    if-nez v2, :cond_10

    .line 178
    .line 179
    const-string v13, " - "

    .line 180
    .line 181
    invoke-static {v0, v13, v12}, Lkotlin/text/p;->F(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 182
    .line 183
    .line 184
    move-result v13

    .line 185
    if-eqz v13, :cond_f

    .line 186
    .line 187
    goto :goto_9

    .line 188
    :cond_f
    :goto_8
    int-to-float v11, v11

    .line 189
    invoke-static {v11}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 190
    .line 191
    .line 192
    move-result v11

    .line 193
    goto :goto_a

    .line 194
    :cond_10
    :goto_9
    const/16 v11, 0xbc

    .line 195
    .line 196
    goto :goto_8

    .line 197
    :goto_a
    invoke-static {v9, v11}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 198
    .line 199
    .line 200
    move-result-object v9

    .line 201
    int-to-float v10, v10

    .line 202
    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 203
    .line 204
    .line 205
    move-result v10

    .line 206
    invoke-static {v9, v10}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 207
    .line 208
    .line 209
    move-result-object v11

    .line 210
    const/16 v16, 0x7

    .line 211
    .line 212
    const/16 v17, 0x0

    .line 213
    .line 214
    move v9, v12

    .line 215
    const/4 v12, 0x0

    .line 216
    const/4 v13, 0x0

    .line 217
    const/4 v14, 0x0

    .line 218
    invoke-static/range {v11 .. v17}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lr6/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 219
    .line 220
    .line 221
    move-result-object v10

    .line 222
    if-eqz v1, :cond_11

    .line 223
    .line 224
    invoke-static/range {v20 .. v21}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 225
    .line 226
    .line 227
    move-result-wide v11

    .line 228
    goto :goto_b

    .line 229
    :cond_11
    invoke-static/range {v18 .. v19}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 230
    .line 231
    .line 232
    move-result-wide v11

    .line 233
    :goto_b
    int-to-float v6, v6

    .line 234
    invoke-static {v6, v10, v11, v12}, Landroidx/compose/material3/c;->f(FLandroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;

    .line 235
    .line 236
    .line 237
    move-result-object v6

    .line 238
    goto :goto_10

    .line 239
    :cond_12
    :goto_c
    sget-object v13, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 240
    .line 241
    const/4 v14, 0x0

    .line 242
    const/4 v15, 0x0

    .line 243
    if-eqz v4, :cond_13

    .line 244
    .line 245
    int-to-float v11, v11

    .line 246
    invoke-static {v11}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 247
    .line 248
    .line 249
    move-result v11

    .line 250
    invoke-static {v13, v11, v14, v9, v15}, Landroidx/compose/foundation/layout/SizeKt;->widthIn-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 251
    .line 252
    .line 253
    move-result-object v11

    .line 254
    goto :goto_d

    .line 255
    :cond_13
    move-object v11, v13

    .line 256
    :goto_d
    invoke-virtual {v13, v11}, Landroidx/compose/ui/Modifier$Companion;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 257
    .line 258
    .line 259
    move-result-object v11

    .line 260
    int-to-float v10, v10

    .line 261
    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 262
    .line 263
    .line 264
    move-result v10

    .line 265
    invoke-static {v11, v10}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 266
    .line 267
    .line 268
    move-result-object v10

    .line 269
    if-eqz v1, :cond_14

    .line 270
    .line 271
    invoke-static/range {v20 .. v21}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 272
    .line 273
    .line 274
    move-result-wide v16

    .line 275
    :goto_e
    move-wide/from16 v12, v16

    .line 276
    .line 277
    goto :goto_f

    .line 278
    :cond_14
    invoke-static/range {v18 .. v19}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 279
    .line 280
    .line 281
    move-result-wide v16

    .line 282
    goto :goto_e

    .line 283
    :goto_f
    int-to-float v6, v6

    .line 284
    invoke-static {v6, v10, v12, v13}, Landroidx/compose/material3/c;->f(FLandroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;

    .line 285
    .line 286
    .line 287
    move-result-object v11

    .line 288
    const/16 v16, 0x7

    .line 289
    .line 290
    const/16 v17, 0x0

    .line 291
    .line 292
    const/4 v12, 0x0

    .line 293
    const/4 v13, 0x0

    .line 294
    move v6, v14

    .line 295
    const/4 v14, 0x0

    .line 296
    move-object v10, v15

    .line 297
    move-object/from16 v15, p5

    .line 298
    .line 299
    invoke-static/range {v11 .. v17}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lr6/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 300
    .line 301
    .line 302
    move-result-object v11

    .line 303
    const/16 v12, 0xd

    .line 304
    .line 305
    int-to-float v12, v12

    .line 306
    invoke-static {v12}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 307
    .line 308
    .line 309
    move-result v12

    .line 310
    invoke-static {v11, v12, v6, v9, v10}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 311
    .line 312
    .line 313
    move-result-object v6

    .line 314
    :goto_10
    sget-object v9, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 315
    .line 316
    invoke-virtual {v9}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 317
    .line 318
    .line 319
    move-result-object v9

    .line 320
    const/4 v12, 0x0

    .line 321
    invoke-static {v9, v12}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 322
    .line 323
    .line 324
    move-result-object v9

    .line 325
    invoke-static {v7, v12}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 326
    .line 327
    .line 328
    move-result v10

    .line 329
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 330
    .line 331
    .line 332
    move-result-object v11

    .line 333
    invoke-static {v7, v6}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 334
    .line 335
    .line 336
    move-result-object v6

    .line 337
    sget-object v12, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 338
    .line 339
    invoke-virtual {v12}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 340
    .line 341
    .line 342
    move-result-object v13

    .line 343
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 344
    .line 345
    .line 346
    move-result-object v14

    .line 347
    if-nez v14, :cond_15

    .line 348
    .line 349
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 350
    .line 351
    .line 352
    :cond_15
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 353
    .line 354
    .line 355
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 356
    .line 357
    .line 358
    move-result v14

    .line 359
    if-eqz v14, :cond_16

    .line 360
    .line 361
    invoke-interface {v7, v13}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 362
    .line 363
    .line 364
    goto :goto_11

    .line 365
    :cond_16
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 366
    .line 367
    .line 368
    :goto_11
    invoke-static {v7}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 369
    .line 370
    .line 371
    move-result-object v13

    .line 372
    invoke-static {v12, v13, v9, v13, v11}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 373
    .line 374
    .line 375
    move-result-object v9

    .line 376
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 377
    .line 378
    .line 379
    move-result v11

    .line 380
    if-nez v11, :cond_17

    .line 381
    .line 382
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v11

    .line 386
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 387
    .line 388
    .line 389
    move-result-object v14

    .line 390
    invoke-static {v11, v14}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 391
    .line 392
    .line 393
    move-result v11

    .line 394
    if-nez v11, :cond_18

    .line 395
    .line 396
    :cond_17
    invoke-static {v10, v13, v10, v9}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 397
    .line 398
    .line 399
    :cond_18
    invoke-virtual {v12}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 400
    .line 401
    .line 402
    move-result-object v9

    .line 403
    invoke-static {v13, v6, v9}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 404
    .line 405
    .line 406
    sget-object v6, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 407
    .line 408
    if-eqz v1, :cond_19

    .line 409
    .line 410
    const-wide v9, 0xff1576ffL

    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    :goto_12
    invoke-static {v9, v10}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 416
    .line 417
    .line 418
    move-result-wide v9

    .line 419
    goto :goto_13

    .line 420
    :cond_19
    const-wide v9, 0xff666666L

    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    goto :goto_12

    .line 426
    :goto_13
    const/16 v6, 0xc

    .line 427
    .line 428
    invoke-static {v6}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 429
    .line 430
    .line 431
    move-result-wide v11

    .line 432
    if-nez v3, :cond_1b

    .line 433
    .line 434
    if-eqz v4, :cond_1a

    .line 435
    .line 436
    goto :goto_15

    .line 437
    :cond_1a
    sget-object v6, Landroidx/compose/ui/text/style/TextOverflow;->Companion:Landroidx/compose/ui/text/style/TextOverflow$Companion;

    .line 438
    .line 439
    invoke-virtual {v6}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getEllipsis-gIe3tQ8()I

    .line 440
    .line 441
    .line 442
    move-result v6

    .line 443
    :goto_14
    move v15, v6

    .line 444
    goto :goto_16

    .line 445
    :cond_1b
    :goto_15
    sget-object v6, Landroidx/compose/ui/text/style/TextOverflow;->Companion:Landroidx/compose/ui/text/style/TextOverflow$Companion;

    .line 446
    .line 447
    invoke-virtual {v6}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getClip-gIe3tQ8()I

    .line 448
    .line 449
    .line 450
    move-result v6

    .line 451
    goto :goto_14

    .line 452
    :goto_16
    and-int/lit8 v6, v8, 0xe

    .line 453
    .line 454
    or-int/lit16 v6, v6, 0xc00

    .line 455
    .line 456
    const/16 v23, 0xc00

    .line 457
    .line 458
    const v24, 0x1d7f2

    .line 459
    .line 460
    .line 461
    const/4 v1, 0x0

    .line 462
    move/from16 v22, v6

    .line 463
    .line 464
    const/4 v6, 0x0

    .line 465
    move-object/from16 v21, v7

    .line 466
    .line 467
    const/4 v7, 0x0

    .line 468
    const/4 v8, 0x0

    .line 469
    move-wide v2, v9

    .line 470
    const-wide/16 v9, 0x0

    .line 471
    .line 472
    move-wide v4, v11

    .line 473
    const/4 v11, 0x0

    .line 474
    const/4 v12, 0x0

    .line 475
    const-wide/16 v13, 0x0

    .line 476
    .line 477
    const/16 v16, 0x0

    .line 478
    .line 479
    const/16 v17, 0x1

    .line 480
    .line 481
    const/16 v18, 0x0

    .line 482
    .line 483
    const/16 v19, 0x0

    .line 484
    .line 485
    const/16 v20, 0x0

    .line 486
    .line 487
    invoke-static/range {v0 .. v24}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 488
    .line 489
    .line 490
    invoke-interface/range {v21 .. v21}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 491
    .line 492
    .line 493
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 494
    .line 495
    .line 496
    move-result v0

    .line 497
    if-eqz v0, :cond_1d

    .line 498
    .line 499
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 500
    .line 501
    .line 502
    goto :goto_17

    .line 503
    :cond_1c
    move-object/from16 v21, v7

    .line 504
    .line 505
    invoke-interface/range {v21 .. v21}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 506
    .line 507
    .line 508
    :cond_1d
    :goto_17
    invoke-interface/range {v21 .. v21}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 509
    .line 510
    .line 511
    move-result-object v8

    .line 512
    if-eqz v8, :cond_1e

    .line 513
    .line 514
    new-instance v0, Lcom/zykj/mistake/main/drawer/f;

    .line 515
    .line 516
    move-object/from16 v1, p0

    .line 517
    .line 518
    move/from16 v2, p1

    .line 519
    .line 520
    move/from16 v3, p2

    .line 521
    .line 522
    move/from16 v4, p3

    .line 523
    .line 524
    move/from16 v5, p4

    .line 525
    .line 526
    move-object/from16 v6, p5

    .line 527
    .line 528
    move/from16 v7, p7

    .line 529
    .line 530
    invoke-direct/range {v0 .. v7}, Lcom/zykj/mistake/main/drawer/f;-><init>(Ljava/lang/String;ZZZZLr6/a;I)V

    .line 531
    .line 532
    .line 533
    invoke-interface {v8, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 534
    .line 535
    .line 536
    :cond_1e
    return-void
.end method

.method public static final d(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V
    .locals 34

    .line 1
    move-object/from16 v4, p1

    .line 2
    .line 3
    move/from16 v1, p4

    .line 4
    .line 5
    const v0, -0x7520493c

    .line 6
    .line 7
    .line 8
    move-object/from16 v2, p3

    .line 9
    .line 10
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 11
    .line 12
    .line 13
    move-result-object v12

    .line 14
    and-int/lit8 v2, v1, 0x6

    .line 15
    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    move-object/from16 v2, p0

    .line 19
    .line 20
    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    const/4 v3, 0x4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v3, 0x2

    .line 29
    :goto_0
    or-int/2addr v3, v1

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move-object/from16 v2, p0

    .line 32
    .line 33
    move v3, v1

    .line 34
    :goto_1
    and-int/lit8 v5, v1, 0x30

    .line 35
    .line 36
    if-nez v5, :cond_3

    .line 37
    .line 38
    invoke-interface {v12, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-eqz v5, :cond_2

    .line 43
    .line 44
    const/16 v5, 0x20

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/16 v5, 0x10

    .line 48
    .line 49
    :goto_2
    or-int/2addr v3, v5

    .line 50
    :cond_3
    and-int/lit8 v5, p5, 0x4

    .line 51
    .line 52
    if-eqz v5, :cond_5

    .line 53
    .line 54
    or-int/lit16 v3, v3, 0x180

    .line 55
    .line 56
    :cond_4
    move-object/from16 v6, p2

    .line 57
    .line 58
    goto :goto_4

    .line 59
    :cond_5
    and-int/lit16 v6, v1, 0x180

    .line 60
    .line 61
    if-nez v6, :cond_4

    .line 62
    .line 63
    move-object/from16 v6, p2

    .line 64
    .line 65
    invoke-interface {v12, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    if-eqz v7, :cond_6

    .line 70
    .line 71
    const/16 v7, 0x100

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_6
    const/16 v7, 0x80

    .line 75
    .line 76
    :goto_3
    or-int/2addr v3, v7

    .line 77
    :goto_4
    and-int/lit16 v7, v3, 0x93

    .line 78
    .line 79
    const/16 v8, 0x92

    .line 80
    .line 81
    const/4 v9, 0x0

    .line 82
    const/4 v10, 0x1

    .line 83
    if-eq v7, v8, :cond_7

    .line 84
    .line 85
    move v7, v10

    .line 86
    goto :goto_5

    .line 87
    :cond_7
    move v7, v9

    .line 88
    :goto_5
    and-int/lit8 v8, v3, 0x1

    .line 89
    .line 90
    invoke-interface {v12, v7, v8}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    if-eqz v7, :cond_10

    .line 95
    .line 96
    if-eqz v5, :cond_8

    .line 97
    .line 98
    const-string v5, ""

    .line 99
    .line 100
    move-object/from16 v30, v5

    .line 101
    .line 102
    goto :goto_6

    .line 103
    :cond_8
    move-object/from16 v30, v6

    .line 104
    .line 105
    :goto_6
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    if-eqz v5, :cond_9

    .line 110
    .line 111
    const/4 v5, -0x1

    .line 112
    const-string v6, "com.zykj.mistake.main.drawer.NotebookFilterSection (MistakeNotebookFilterPanel.kt:222)"

    .line 113
    .line 114
    invoke-static {v0, v3, v5, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 115
    .line 116
    .line 117
    :cond_9
    sget-object v13, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 118
    .line 119
    const/16 v0, 0xa

    .line 120
    .line 121
    int-to-float v0, v0

    .line 122
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 123
    .line 124
    .line 125
    move-result v17

    .line 126
    const/16 v5, 0x8

    .line 127
    .line 128
    int-to-float v5, v5

    .line 129
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 130
    .line 131
    .line 132
    move-result v15

    .line 133
    const/16 v18, 0x5

    .line 134
    .line 135
    const/16 v19, 0x0

    .line 136
    .line 137
    const/4 v14, 0x0

    .line 138
    const/16 v16, 0x0

    .line 139
    .line 140
    invoke-static/range {v13 .. v19}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    move-object v6, v13

    .line 145
    sget-object v7, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 146
    .line 147
    invoke-virtual {v7}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 148
    .line 149
    .line 150
    move-result-object v8

    .line 151
    sget-object v11, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 152
    .line 153
    invoke-virtual {v11}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    .line 154
    .line 155
    .line 156
    move-result-object v11

    .line 157
    invoke-static {v8, v11, v12, v9}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 158
    .line 159
    .line 160
    move-result-object v8

    .line 161
    invoke-static {v12, v9}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 162
    .line 163
    .line 164
    move-result v9

    .line 165
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 166
    .line 167
    .line 168
    move-result-object v11

    .line 169
    invoke-static {v12, v5}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    sget-object v13, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 174
    .line 175
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 176
    .line 177
    .line 178
    move-result-object v14

    .line 179
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 180
    .line 181
    .line 182
    move-result-object v15

    .line 183
    if-nez v15, :cond_a

    .line 184
    .line 185
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 186
    .line 187
    .line 188
    :cond_a
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 189
    .line 190
    .line 191
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 192
    .line 193
    .line 194
    move-result v15

    .line 195
    if-eqz v15, :cond_b

    .line 196
    .line 197
    invoke-interface {v12, v14}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 198
    .line 199
    .line 200
    goto :goto_7

    .line 201
    :cond_b
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 202
    .line 203
    .line 204
    :goto_7
    invoke-static {v12}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 205
    .line 206
    .line 207
    move-result-object v14

    .line 208
    invoke-static {v13, v14, v8, v14, v11}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 209
    .line 210
    .line 211
    move-result-object v8

    .line 212
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 213
    .line 214
    .line 215
    move-result v11

    .line 216
    if-nez v11, :cond_c

    .line 217
    .line 218
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v11

    .line 222
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 223
    .line 224
    .line 225
    move-result-object v15

    .line 226
    invoke-static {v11, v15}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v11

    .line 230
    if-nez v11, :cond_d

    .line 231
    .line 232
    :cond_c
    invoke-static {v9, v14, v9, v8}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 233
    .line 234
    .line 235
    :cond_d
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 236
    .line 237
    .line 238
    move-result-object v8

    .line 239
    invoke-static {v14, v5, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 240
    .line 241
    .line 242
    sget-object v5, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 243
    .line 244
    const-wide v8, 0xff15171aL

    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    invoke-static {v8, v9}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 250
    .line 251
    .line 252
    move-result-wide v8

    .line 253
    const/16 v11, 0xe

    .line 254
    .line 255
    move-object v13, v7

    .line 256
    move-wide v7, v8

    .line 257
    move v14, v10

    .line 258
    invoke-static {v11}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 259
    .line 260
    .line 261
    move-result-wide v9

    .line 262
    move-object v15, v6

    .line 263
    invoke-interface {v5, v15}, Landroidx/compose/foundation/layout/RowScope;->alignByBaseline(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 264
    .line 265
    .line 266
    move-result-object v6

    .line 267
    and-int/lit8 v11, v3, 0xe

    .line 268
    .line 269
    or-int/lit16 v11, v11, 0xd80

    .line 270
    .line 271
    const/16 v28, 0x0

    .line 272
    .line 273
    const v29, 0x1fff0

    .line 274
    .line 275
    .line 276
    move/from16 v27, v11

    .line 277
    .line 278
    const/4 v11, 0x0

    .line 279
    move-object/from16 v26, v12

    .line 280
    .line 281
    const/4 v12, 0x0

    .line 282
    move-object/from16 v16, v13

    .line 283
    .line 284
    const/4 v13, 0x0

    .line 285
    move/from16 v18, v14

    .line 286
    .line 287
    move-object/from16 v17, v15

    .line 288
    .line 289
    const-wide/16 v14, 0x0

    .line 290
    .line 291
    move-object/from16 v19, v16

    .line 292
    .line 293
    const/16 v16, 0x0

    .line 294
    .line 295
    move-object/from16 v20, v17

    .line 296
    .line 297
    const/16 v17, 0x0

    .line 298
    .line 299
    move/from16 v22, v18

    .line 300
    .line 301
    move-object/from16 v21, v19

    .line 302
    .line 303
    const-wide/16 v18, 0x0

    .line 304
    .line 305
    move-object/from16 v23, v20

    .line 306
    .line 307
    const/16 v20, 0x0

    .line 308
    .line 309
    move-object/from16 v24, v21

    .line 310
    .line 311
    const/16 v21, 0x0

    .line 312
    .line 313
    move/from16 v25, v22

    .line 314
    .line 315
    const/16 v22, 0x0

    .line 316
    .line 317
    move-object/from16 v31, v23

    .line 318
    .line 319
    const/16 v23, 0x0

    .line 320
    .line 321
    move-object/from16 v32, v24

    .line 322
    .line 323
    const/16 v24, 0x0

    .line 324
    .line 325
    move/from16 v33, v25

    .line 326
    .line 327
    const/16 v25, 0x0

    .line 328
    .line 329
    move-object/from16 v1, v32

    .line 330
    .line 331
    move/from16 v32, v0

    .line 332
    .line 333
    move-object v0, v5

    .line 334
    move-object v5, v2

    .line 335
    move-object v2, v1

    .line 336
    const/16 v1, 0xe

    .line 337
    .line 338
    invoke-static/range {v5 .. v29}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 339
    .line 340
    .line 341
    move-object/from16 v12, v26

    .line 342
    .line 343
    invoke-static/range {v30 .. v30}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 344
    .line 345
    .line 346
    move-result v5

    .line 347
    if-nez v5, :cond_e

    .line 348
    .line 349
    const v5, -0x4de94311

    .line 350
    .line 351
    .line 352
    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 353
    .line 354
    .line 355
    const-wide v5, 0xffc2c2c2L

    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    invoke-static {v5, v6}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 361
    .line 362
    .line 363
    move-result-wide v7

    .line 364
    const/16 v5, 0xb

    .line 365
    .line 366
    invoke-static {v5}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 367
    .line 368
    .line 369
    move-result-wide v9

    .line 370
    const/4 v5, 0x6

    .line 371
    int-to-float v6, v5

    .line 372
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 373
    .line 374
    .line 375
    move-result v14

    .line 376
    const/16 v18, 0xe

    .line 377
    .line 378
    const/16 v19, 0x0

    .line 379
    .line 380
    const/4 v15, 0x0

    .line 381
    const/16 v16, 0x0

    .line 382
    .line 383
    const/16 v17, 0x0

    .line 384
    .line 385
    move-object/from16 v13, v31

    .line 386
    .line 387
    invoke-static/range {v13 .. v19}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 388
    .line 389
    .line 390
    move-result-object v6

    .line 391
    invoke-interface {v0, v6}, Landroidx/compose/foundation/layout/RowScope;->alignByBaseline(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 392
    .line 393
    .line 394
    move-result-object v6

    .line 395
    shr-int/lit8 v0, v3, 0x6

    .line 396
    .line 397
    and-int/2addr v0, v1

    .line 398
    or-int/lit16 v0, v0, 0xd80

    .line 399
    .line 400
    const/16 v28, 0x0

    .line 401
    .line 402
    const v29, 0x1fff0

    .line 403
    .line 404
    .line 405
    const/4 v11, 0x0

    .line 406
    move-object/from16 v26, v12

    .line 407
    .line 408
    const/4 v12, 0x0

    .line 409
    const/4 v13, 0x0

    .line 410
    const-wide/16 v14, 0x0

    .line 411
    .line 412
    const/16 v16, 0x0

    .line 413
    .line 414
    const/16 v17, 0x0

    .line 415
    .line 416
    const-wide/16 v18, 0x0

    .line 417
    .line 418
    const/16 v20, 0x0

    .line 419
    .line 420
    const/16 v21, 0x0

    .line 421
    .line 422
    const/16 v22, 0x0

    .line 423
    .line 424
    const/16 v23, 0x0

    .line 425
    .line 426
    const/16 v24, 0x0

    .line 427
    .line 428
    const/16 v25, 0x0

    .line 429
    .line 430
    move/from16 v27, v0

    .line 431
    .line 432
    move-object/from16 v5, v30

    .line 433
    .line 434
    invoke-static/range {v5 .. v29}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 435
    .line 436
    .line 437
    move-object v0, v5

    .line 438
    move-object/from16 v12, v26

    .line 439
    .line 440
    :goto_8
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 441
    .line 442
    .line 443
    goto :goto_9

    .line 444
    :cond_e
    move-object/from16 v0, v30

    .line 445
    .line 446
    const v3, -0x4e70f006

    .line 447
    .line 448
    .line 449
    invoke-interface {v12, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 450
    .line 451
    .line 452
    goto :goto_8

    .line 453
    :goto_9
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 454
    .line 455
    .line 456
    invoke-static/range {v32 .. v32}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 457
    .line 458
    .line 459
    move-result v3

    .line 460
    invoke-virtual {v2, v3}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 461
    .line 462
    .line 463
    move-result-object v6

    .line 464
    invoke-static/range {v32 .. v32}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 465
    .line 466
    .line 467
    move-result v3

    .line 468
    invoke-virtual {v2, v3}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 469
    .line 470
    .line 471
    move-result-object v7

    .line 472
    int-to-float v1, v1

    .line 473
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 474
    .line 475
    .line 476
    move-result v17

    .line 477
    const/16 v18, 0x7

    .line 478
    .line 479
    const/16 v19, 0x0

    .line 480
    .line 481
    const/4 v14, 0x0

    .line 482
    const/4 v15, 0x0

    .line 483
    const/16 v16, 0x0

    .line 484
    .line 485
    move-object/from16 v13, v31

    .line 486
    .line 487
    invoke-static/range {v13 .. v19}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 488
    .line 489
    .line 490
    move-result-object v5

    .line 491
    new-instance v1, Landroidx/navigation/serialization/b;

    .line 492
    .line 493
    const/4 v2, 0x6

    .line 494
    invoke-direct {v1, v4, v2}, Landroidx/navigation/serialization/b;-><init>(Ljava/lang/Object;I)V

    .line 495
    .line 496
    .line 497
    const/16 v2, 0x36

    .line 498
    .line 499
    const v3, -0x1acd20d7

    .line 500
    .line 501
    .line 502
    const/4 v14, 0x1

    .line 503
    invoke-static {v3, v14, v1, v12, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 504
    .line 505
    .line 506
    move-result-object v11

    .line 507
    const v13, 0x1801b6

    .line 508
    .line 509
    .line 510
    const/16 v14, 0x38

    .line 511
    .line 512
    const/4 v8, 0x0

    .line 513
    const/4 v9, 0x0

    .line 514
    const/4 v10, 0x0

    .line 515
    invoke-static/range {v5 .. v14}, Landroidx/compose/foundation/layout/FlowLayoutKt;->FlowRow(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILr6/f;Landroidx/compose/runtime/Composer;II)V

    .line 516
    .line 517
    .line 518
    move-object/from16 v26, v12

    .line 519
    .line 520
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 521
    .line 522
    .line 523
    move-result v1

    .line 524
    if-eqz v1, :cond_f

    .line 525
    .line 526
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 527
    .line 528
    .line 529
    :cond_f
    move-object v6, v0

    .line 530
    goto :goto_a

    .line 531
    :cond_10
    move-object/from16 v26, v12

    .line 532
    .line 533
    invoke-interface/range {v26 .. v26}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 534
    .line 535
    .line 536
    :goto_a
    invoke-interface/range {v26 .. v26}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 537
    .line 538
    .line 539
    move-result-object v7

    .line 540
    if-eqz v7, :cond_11

    .line 541
    .line 542
    new-instance v0, Landroidx/lifecycle/compose/d;

    .line 543
    .line 544
    const/4 v5, 0x3

    .line 545
    move-object/from16 v2, p0

    .line 546
    .line 547
    move/from16 v1, p4

    .line 548
    .line 549
    move/from16 v3, p5

    .line 550
    .line 551
    invoke-direct/range {v0 .. v6}, Landroidx/lifecycle/compose/d;-><init>(ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)V

    .line 552
    .line 553
    .line 554
    invoke-interface {v7, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 555
    .line 556
    .line 557
    :cond_11
    return-void
.end method

.method public static final e(Ljava/util/ArrayList;Ljava/lang/Integer;Lr6/c;)Ljava/util/ArrayList;
    .locals 13

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-static {p0, v1}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x0

    .line 17
    move v3, v2

    .line 18
    move v4, v3

    .line 19
    :goto_0
    if-ge v4, v1, :cond_6

    .line 20
    .line 21
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    add-int/lit8 v4, v4, 0x1

    .line 26
    .line 27
    add-int/lit8 v6, v3, 0x1

    .line 28
    .line 29
    if-ltz v3, :cond_5

    .line 30
    .line 31
    move-object v8, v5

    .line 32
    check-cast v8, Ljava/lang/String;

    .line 33
    .line 34
    new-instance v7, Lcom/zykj/mistake/main/drawer/m;

    .line 35
    .line 36
    const/4 v5, 0x1

    .line 37
    if-eqz v3, :cond_4

    .line 38
    .line 39
    if-eq v3, v5, :cond_2

    .line 40
    .line 41
    add-int/lit8 v9, v3, -0x1

    .line 42
    .line 43
    if-nez p1, :cond_0

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result v10

    .line 50
    if-ne v10, v9, :cond_1

    .line 51
    .line 52
    :goto_1
    move v9, v5

    .line 53
    goto :goto_3

    .line 54
    :cond_1
    :goto_2
    move v9, v2

    .line 55
    goto :goto_3

    .line 56
    :cond_2
    if-nez p1, :cond_3

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 60
    .line 61
    .line 62
    move-result v9

    .line 63
    if-nez v9, :cond_1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_4
    if-nez p1, :cond_1

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :goto_3
    new-instance v11, Lcom/zykj/mistake/feature/collection/filter/d;

    .line 70
    .line 71
    const/4 v5, 0x4

    .line 72
    invoke-direct {v11, v3, v5, p2}, Lcom/zykj/mistake/feature/collection/filter/d;-><init>(IILr6/c;)V

    .line 73
    .line 74
    .line 75
    const/16 v12, 0x1c

    .line 76
    .line 77
    const/4 v10, 0x0

    .line 78
    invoke-direct/range {v7 .. v12}, Lcom/zykj/mistake/main/drawer/m;-><init>(Ljava/lang/String;ZZLr6/a;I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move v3, v6

    .line 85
    goto :goto_0

    .line 86
    :cond_5
    invoke-static {}, Lkotlin/collections/u;->L()V

    .line 87
    .line 88
    .line 89
    const/4 p0, 0x0

    .line 90
    throw p0

    .line 91
    :cond_6
    return-object v0
.end method
