.class public final Landroidx/compose/animation/AnimatedVisibilityKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final AnimatedEnterExitImpl(Landroidx/compose/animation/core/Transition;Lhd/l;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lhd/p;Landroidx/compose/animation/OnLookaheadMeasured;Lhd/q;Landroidx/compose/runtime/Composer;II)V
    .locals 23
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/animation/core/Transition<",
            "TT;>;",
            "Lhd/l;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/animation/EnterTransition;",
            "Landroidx/compose/animation/ExitTransition;",
            "Lhd/p;",
            "Landroidx/compose/animation/OnLookaheadMeasured;",
            "Lhd/q;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    move-object/from16 v7, p2

    move-object/from16 v8, p5

    move-object/from16 v1, p6

    move-object/from16 v9, p7

    move/from16 v10, p9

    move/from16 v11, p10

    const v2, -0x352a56be    # -7001249.0f

    move-object/from16 v3, p8

    .line 1
    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v4

    and-int/lit8 v3, v11, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v3, v10, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v10, 0x6

    if-nez v3, :cond_2

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v10

    goto :goto_1

    :cond_2
    move v3, v10

    :goto_1
    and-int/lit8 v5, v11, 0x2

    if-eqz v5, :cond_3

    or-int/lit8 v3, v3, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v5, v10, 0x30

    if-nez v5, :cond_5

    invoke-interface {v4, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    :cond_5
    :goto_3
    and-int/lit8 v5, v11, 0x4

    if-eqz v5, :cond_6

    or-int/lit16 v3, v3, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v5, v10, 0x180

    if-nez v5, :cond_8

    invoke-interface {v4, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    const/16 v5, 0x100

    goto :goto_4

    :cond_7
    const/16 v5, 0x80

    :goto_4
    or-int/2addr v3, v5

    :cond_8
    :goto_5
    and-int/lit8 v5, v11, 0x8

    if-eqz v5, :cond_9

    or-int/lit16 v3, v3, 0xc00

    move-object/from16 v13, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v5, v10, 0xc00

    move-object/from16 v13, p3

    if-nez v5, :cond_b

    invoke-interface {v4, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    const/16 v5, 0x800

    goto :goto_6

    :cond_a
    const/16 v5, 0x400

    :goto_6
    or-int/2addr v3, v5

    :cond_b
    :goto_7
    and-int/lit8 v5, v11, 0x10

    if-eqz v5, :cond_c

    or-int/lit16 v3, v3, 0x6000

    move-object/from16 v14, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v5, v10, 0x6000

    move-object/from16 v14, p4

    if-nez v5, :cond_e

    invoke-interface {v4, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_d

    const/16 v5, 0x4000

    goto :goto_8

    :cond_d
    const/16 v5, 0x2000

    :goto_8
    or-int/2addr v3, v5

    :cond_e
    :goto_9
    and-int/lit8 v5, v11, 0x20

    const/high16 v15, 0x30000

    if-eqz v5, :cond_f

    or-int/2addr v3, v15

    goto :goto_b

    :cond_f
    and-int v5, v10, v15

    if-nez v5, :cond_11

    invoke-interface {v4, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_10

    const/high16 v5, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v5, 0x10000

    :goto_a
    or-int/2addr v3, v5

    :cond_11
    :goto_b
    and-int/lit8 v5, v11, 0x40

    const/high16 v20, 0x200000

    const/high16 v16, 0x180000

    if-eqz v5, :cond_12

    :goto_c
    or-int v3, v3, v16

    goto :goto_e

    :cond_12
    and-int v16, v10, v16

    if-nez v16, :cond_15

    and-int v16, v10, v20

    if-nez v16, :cond_13

    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    goto :goto_d

    :cond_13
    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v16

    :goto_d
    if-eqz v16, :cond_14

    const/high16 v16, 0x100000

    goto :goto_c

    :cond_14
    const/high16 v16, 0x80000

    goto :goto_c

    :cond_15
    :goto_e
    and-int/lit16 v15, v11, 0x80

    const/high16 v16, 0xc00000

    if-eqz v15, :cond_17

    or-int v3, v3, v16

    :cond_16
    :goto_f
    move v15, v3

    goto :goto_11

    :cond_17
    and-int v15, v10, v16

    if-nez v15, :cond_16

    invoke-interface {v4, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_18

    const/high16 v15, 0x800000

    goto :goto_10

    :cond_18
    const/high16 v15, 0x400000

    :goto_10
    or-int/2addr v3, v15

    goto :goto_f

    :goto_11
    const v3, 0x492493

    and-int/2addr v3, v15

    const v12, 0x492492

    const/16 v21, 0x1

    if-eq v3, v12, :cond_19

    move/from16 v3, v21

    goto :goto_12

    :cond_19
    const/4 v3, 0x0

    :goto_12
    and-int/lit8 v12, v15, 0x1

    invoke-interface {v4, v3, v12}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v3

    if-eqz v3, :cond_39

    if-eqz v5, :cond_1a

    const/4 v1, 0x0

    .line 2
    :cond_1a
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    const/4 v5, -0x1

    if-eqz v3, :cond_1b

    const-string v3, "androidx.compose.animation.AnimatedEnterExitImpl (AnimatedVisibility.kt:718)"

    const v12, -0x352a56be    # -7001249.0f

    .line 3
    invoke-static {v12, v15, v5, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 4
    :cond_1b
    invoke-virtual {v0}, Landroidx/compose/animation/core/Transition;->getTargetState()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v6, v3}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-nez v3, :cond_1d

    .line 5
    invoke-virtual {v0}, Landroidx/compose/animation/core/Transition;->getCurrentState()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v6, v3}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-nez v3, :cond_1d

    .line 6
    invoke-virtual {v0}, Landroidx/compose/animation/core/Transition;->isSeeking()Z

    move-result v3

    if-nez v3, :cond_1d

    .line 7
    invoke-virtual {v0}, Landroidx/compose/animation/core/Transition;->getHasInitialValueAnimations()Z

    move-result v3

    if-eqz v3, :cond_1c

    goto :goto_13

    :cond_1c
    const v2, 0x6abbd55a

    .line 8
    invoke-interface {v4, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    move-object v10, v1

    goto/16 :goto_1c

    :cond_1d
    :goto_13
    const v3, 0x6a9ab186

    .line 9
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    and-int/lit8 v12, v15, 0xe

    or-int/lit8 v3, v12, 0x30

    and-int/lit8 v2, v3, 0xe

    xor-int/lit8 v5, v2, 0x6

    move-object/from16 v19, v1

    const/4 v1, 0x4

    if-le v5, v1, :cond_1e

    .line 10
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1f

    :cond_1e
    and-int/lit8 v3, v3, 0x6

    if-ne v3, v1, :cond_20

    :cond_1f
    move/from16 v1, v21

    goto :goto_14

    :cond_20
    const/4 v1, 0x0

    .line 11
    :goto_14
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_21

    .line 12
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v3, v1, :cond_22

    .line 13
    :cond_21
    invoke-virtual {v0}, Landroidx/compose/animation/core/Transition;->getCurrentState()Ljava/lang/Object;

    move-result-object v3

    .line 14
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 15
    :cond_22
    invoke-virtual {v0}, Landroidx/compose/animation/core/Transition;->isSeeking()Z

    move-result v1

    if-eqz v1, :cond_23

    invoke-virtual {v0}, Landroidx/compose/animation/core/Transition;->getCurrentState()Ljava/lang/Object;

    move-result-object v3

    :cond_23
    const v1, -0x1bd001fd

    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v5

    if-eqz v5, :cond_24

    const-string v5, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:727)"

    const/4 v10, -0x1

    const/4 v11, 0x0

    .line 16
    invoke-static {v1, v11, v10, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_24
    and-int/lit8 v5, v15, 0x7e

    invoke-static {v0, v6, v3, v4, v5}, Landroidx/compose/animation/AnimatedVisibilityKt;->targetEnterExit(Landroidx/compose/animation/core/Transition;Lhd/l;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/EnterExitState;

    move-result-object v3

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v10

    if-eqz v10, :cond_25

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_25
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 17
    invoke-virtual {v0}, Landroidx/compose/animation/core/Transition;->getTargetState()Ljava/lang/Object;

    move-result-object v10

    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v11

    if-eqz v11, :cond_26

    const-string v11, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:727)"

    move-object/from16 v22, v3

    const/4 v3, -0x1

    const/4 v13, 0x0

    .line 18
    invoke-static {v1, v13, v3, v11}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_15

    :cond_26
    move-object/from16 v22, v3

    const/4 v13, 0x0

    :goto_15
    invoke-static {v0, v6, v10, v4, v5}, Landroidx/compose/animation/AnimatedVisibilityKt;->targetEnterExit(Landroidx/compose/animation/core/Transition;Lhd/l;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/EnterExitState;

    move-result-object v1

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_27

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_27
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    or-int/lit16 v5, v2, 0xc00

    .line 19
    const-string v3, "EnterExitTransition"

    move-object v2, v1

    move v11, v13

    move-object/from16 v10, v19

    move-object/from16 v1, v22

    invoke-static/range {v0 .. v5}, Landroidx/compose/animation/core/TransitionKt;->createChildTransitionInternal(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/core/Transition;

    move-result-object v1

    shr-int/lit8 v0, v15, 0xf

    and-int/lit8 v0, v0, 0xe

    .line 20
    invoke-static {v8, v4, v0}, Landroidx/compose/runtime/SnapshotStateKt;->rememberUpdatedState(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v0

    .line 21
    invoke-virtual {v1}, Landroidx/compose/animation/core/Transition;->getCurrentState()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1}, Landroidx/compose/animation/core/Transition;->getTargetState()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v8, v2, v3}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    .line 22
    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v3, v5

    .line 23
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_28

    .line 24
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v5, v3, :cond_29

    .line 25
    :cond_28
    new-instance v5, Landroidx/compose/animation/AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1;

    const/4 v3, 0x0

    invoke-direct {v5, v1, v0, v3}, Landroidx/compose/animation/AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1;-><init>(Landroidx/compose/animation/core/Transition;Landroidx/compose/runtime/State;Lvc/c;)V

    .line 26
    invoke-interface {v4, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 27
    :cond_29
    check-cast v5, Lhd/p;

    .line 28
    invoke-static {v2, v5, v4, v11}, Landroidx/compose/runtime/SnapshotStateKt;->produceState(Ljava/lang/Object;Lhd/p;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v0

    .line 29
    invoke-static {v1}, Landroidx/compose/animation/AnimatedVisibilityKt;->getExitFinished(Landroidx/compose/animation/core/Transition;)Z

    move-result v2

    if-eqz v2, :cond_2b

    invoke-static {v0}, Landroidx/compose/animation/AnimatedVisibilityKt;->AnimatedEnterExitImpl$lambda$4(Landroidx/compose/runtime/State;)Z

    move-result v0

    if-nez v0, :cond_2a

    goto :goto_16

    :cond_2a
    const v0, 0x6abbbe1a

    .line 30
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto/16 :goto_1b

    :cond_2b
    :goto_16
    const v0, 0x6aaa653b

    .line 31
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const/4 v0, 0x4

    if-ne v12, v0, :cond_2c

    move/from16 v2, v21

    goto :goto_17

    :cond_2c
    move v2, v11

    .line 32
    :goto_17
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    if-nez v2, :cond_2d

    .line 33
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_2e

    .line 34
    :cond_2d
    new-instance v0, Landroidx/compose/animation/AnimatedVisibilityScopeImpl;

    invoke-direct {v0, v1}, Landroidx/compose/animation/AnimatedVisibilityScopeImpl;-><init>(Landroidx/compose/animation/core/Transition;)V

    .line 35
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 36
    :cond_2e
    check-cast v0, Landroidx/compose/animation/AnimatedVisibilityScopeImpl;

    shr-int/lit8 v2, v15, 0x6

    and-int/lit8 v3, v2, 0x70

    or-int/lit16 v3, v3, 0x6000

    and-int/lit16 v2, v2, 0x380

    or-int v18, v3, v2

    const/16 v19, 0x4

    move v3, v15

    const/4 v15, 0x0

    .line 37
    const-string v16, "Built-in"

    move-object/from16 v13, p3

    move-object v12, v1

    move-object/from16 v17, v4

    const/high16 v1, 0x100000

    invoke-static/range {v12 .. v19}, Landroidx/compose/animation/EnterExitTransitionKt;->createModifier(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lhd/a;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;

    move-result-object v2

    if-eqz v10, :cond_33

    const v5, 0x6ab0cb63

    .line 38
    invoke-interface {v4, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 39
    sget-object v5, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    const/high16 v12, 0x380000

    and-int/2addr v12, v3

    if-eq v12, v1, :cond_30

    and-int v1, v3, v20

    if-eqz v1, :cond_2f

    invoke-interface {v4, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2f

    goto :goto_18

    :cond_2f
    move/from16 v21, v11

    .line 40
    :cond_30
    :goto_18
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    if-nez v21, :cond_31

    .line 41
    sget-object v12, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v12}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v12

    if-ne v1, v12, :cond_32

    .line 42
    :cond_31
    new-instance v1, Landroidx/compose/animation/AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1;

    invoke-direct {v1, v10}, Landroidx/compose/animation/AnimatedVisibilityKt$AnimatedEnterExitImpl$2$1;-><init>(Landroidx/compose/animation/OnLookaheadMeasured;)V

    .line 43
    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 44
    :cond_32
    check-cast v1, Lhd/q;

    invoke-static {v5, v1}, Landroidx/compose/ui/layout/LayoutModifierKt;->layout(Landroidx/compose/ui/Modifier;Lhd/q;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 45
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_19

    :cond_33
    const v1, 0x5e4809f0

    .line 46
    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 47
    :goto_19
    invoke-interface {v2, v1}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 48
    invoke-interface {v7, v1}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 49
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    .line 50
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v5

    if-ne v2, v5, :cond_34

    .line 51
    new-instance v2, Landroidx/compose/animation/AnimatedEnterExitMeasurePolicy;

    invoke-direct {v2, v0}, Landroidx/compose/animation/AnimatedEnterExitMeasurePolicy;-><init>(Landroidx/compose/animation/AnimatedVisibilityScopeImpl;)V

    .line 52
    invoke-interface {v4, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 53
    :cond_34
    check-cast v2, Landroidx/compose/animation/AnimatedEnterExitMeasurePolicy;

    .line 54
    invoke-static {v4, v11}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v5

    .line 55
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v11

    .line 56
    invoke-static {v4, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 57
    sget-object v12, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v12}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lhd/a;

    move-result-object v13

    .line 58
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v14

    if-nez v14, :cond_35

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 59
    :cond_35
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 60
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v14

    if-eqz v14, :cond_36

    .line 61
    invoke-interface {v4, v13}, Landroidx/compose/runtime/Composer;->createNode(Lhd/a;)V

    goto :goto_1a

    .line 62
    :cond_36
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 63
    :goto_1a
    invoke-static {v4}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v13

    .line 64
    invoke-virtual {v12}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lhd/p;

    move-result-object v14

    invoke-static {v13, v2, v14}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 65
    invoke-virtual {v12}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lhd/p;

    move-result-object v2

    invoke-static {v13, v11, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 66
    invoke-virtual {v12}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lhd/p;

    move-result-object v2

    .line 67
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v11

    if-nez v11, :cond_37

    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v11, v14}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_38

    .line 68
    :cond_37
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v13, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 69
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v13, v5, v2}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lhd/p;)V

    .line 70
    :cond_38
    invoke-virtual {v12}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lhd/p;

    move-result-object v2

    invoke-static {v13, v1, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    shr-int/lit8 v1, v3, 0x12

    and-int/lit8 v1, v1, 0x70

    .line 71
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v9, v0, v4, v1}, Lhd/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 73
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 74
    :goto_1b
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 75
    :goto_1c
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_3a

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_1d

    .line 76
    :cond_39
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object v10, v1

    :cond_3a
    :goto_1d
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v11

    if-eqz v11, :cond_3b

    new-instance v0, Landroidx/compose/animation/AnimatedVisibilityKt$AnimatedEnterExitImpl$4;

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object v2, v6

    move-object v3, v7

    move-object v6, v8

    move-object v8, v9

    move-object v7, v10

    move/from16 v9, p9

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Landroidx/compose/animation/AnimatedVisibilityKt$AnimatedEnterExitImpl$4;-><init>(Landroidx/compose/animation/core/Transition;Lhd/l;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lhd/p;Landroidx/compose/animation/OnLookaheadMeasured;Lhd/q;II)V

    invoke-interface {v11, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lhd/p;)V

    :cond_3b
    return-void
.end method

.method private static final AnimatedEnterExitImpl$lambda$2(Landroidx/compose/runtime/State;)Lhd/p;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "+",
            "Lhd/p;",
            ">;)",
            "Lhd/p;"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lhd/p;

    .line 6
    .line 7
    return-object p0
.end method

.method private static final AnimatedEnterExitImpl$lambda$4(Landroidx/compose/runtime/State;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    .line 1
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public static final AnimatedVisibility(Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lhd/q;Landroidx/compose/runtime/Composer;II)V
    .locals 23
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[0[0]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/animation/core/MutableTransitionState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/animation/EnterTransition;",
            "Landroidx/compose/animation/ExitTransition;",
            "Ljava/lang/String;",
            "Lhd/q;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v7, p7

    const v0, -0xd4928fa

    move-object/from16 v2, p6

    .line 28
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v14

    and-int/lit8 v2, p8, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v2, v7, 0x6

    goto :goto_2

    :cond_0
    and-int/lit8 v2, v7, 0x6

    if-nez v2, :cond_3

    and-int/lit8 v2, v7, 0x8

    if-nez v2, :cond_1

    invoke-interface {v14, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_0

    :cond_1
    invoke-interface {v14, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    :goto_0
    if-eqz v2, :cond_2

    const/4 v2, 0x4

    goto :goto_1

    :cond_2
    const/4 v2, 0x2

    :goto_1
    or-int/2addr v2, v7

    goto :goto_2

    :cond_3
    move v2, v7

    :goto_2
    and-int/lit8 v3, p8, 0x2

    if-eqz v3, :cond_5

    or-int/lit8 v2, v2, 0x30

    :cond_4
    move-object/from16 v4, p1

    goto :goto_4

    :cond_5
    and-int/lit8 v4, v7, 0x30

    if-nez v4, :cond_4

    move-object/from16 v4, p1

    invoke-interface {v14, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    const/16 v5, 0x20

    goto :goto_3

    :cond_6
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v2, v5

    :goto_4
    and-int/lit8 v5, p8, 0x4

    if-eqz v5, :cond_8

    or-int/lit16 v2, v2, 0x180

    :cond_7
    move-object/from16 v6, p2

    goto :goto_6

    :cond_8
    and-int/lit16 v6, v7, 0x180

    if-nez v6, :cond_7

    move-object/from16 v6, p2

    invoke-interface {v14, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_9

    const/16 v8, 0x100

    goto :goto_5

    :cond_9
    const/16 v8, 0x80

    :goto_5
    or-int/2addr v2, v8

    :goto_6
    and-int/lit8 v8, p8, 0x8

    if-eqz v8, :cond_b

    or-int/lit16 v2, v2, 0xc00

    :cond_a
    move-object/from16 v9, p3

    goto :goto_8

    :cond_b
    and-int/lit16 v9, v7, 0xc00

    if-nez v9, :cond_a

    move-object/from16 v9, p3

    invoke-interface {v14, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_c

    const/16 v10, 0x800

    goto :goto_7

    :cond_c
    const/16 v10, 0x400

    :goto_7
    or-int/2addr v2, v10

    :goto_8
    and-int/lit8 v10, p8, 0x10

    if-eqz v10, :cond_e

    or-int/lit16 v2, v2, 0x6000

    :cond_d
    move-object/from16 v11, p4

    goto :goto_a

    :cond_e
    and-int/lit16 v11, v7, 0x6000

    if-nez v11, :cond_d

    move-object/from16 v11, p4

    invoke-interface {v14, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_f

    const/16 v12, 0x4000

    goto :goto_9

    :cond_f
    const/16 v12, 0x2000

    :goto_9
    or-int/2addr v2, v12

    :goto_a
    and-int/lit8 v12, p8, 0x20

    const/high16 v13, 0x30000

    if-eqz v12, :cond_10

    or-int/2addr v2, v13

    move-object/from16 v13, p5

    goto :goto_c

    :cond_10
    and-int v12, v7, v13

    move-object/from16 v13, p5

    if-nez v12, :cond_12

    invoke-interface {v14, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_11

    const/high16 v12, 0x20000

    goto :goto_b

    :cond_11
    const/high16 v12, 0x10000

    :goto_b
    or-int/2addr v2, v12

    :cond_12
    :goto_c
    const v12, 0x12493

    and-int/2addr v12, v2

    const v15, 0x12492

    const/4 v0, 0x0

    if-eq v12, v15, :cond_13

    const/4 v12, 0x1

    goto :goto_d

    :cond_13
    move v12, v0

    :goto_d
    and-int/lit8 v15, v2, 0x1

    invoke-interface {v14, v12, v15}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v12

    if-eqz v12, :cond_1a

    if-eqz v3, :cond_14

    .line 29
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    move/from16 v22, v10

    move-object v10, v3

    move/from16 v3, v22

    goto :goto_e

    :cond_14
    move v3, v10

    move-object v10, v4

    :goto_e
    const/4 v4, 0x0

    const/4 v12, 0x3

    const/4 v15, 0x0

    if-eqz v5, :cond_15

    .line 30
    invoke-static {v15, v4, v12, v15}, Landroidx/compose/animation/EnterExitTransitionKt;->fadeIn$default(Landroidx/compose/animation/core/FiniteAnimationSpec;FILjava/lang/Object;)Landroidx/compose/animation/EnterTransition;

    move-result-object v5

    const/16 v20, 0xf

    const/16 v21, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/animation/EnterExitTransitionKt;->expandIn$default(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment;ZLhd/l;ILjava/lang/Object;)Landroidx/compose/animation/EnterTransition;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroidx/compose/animation/EnterTransition;->plus(Landroidx/compose/animation/EnterTransition;)Landroidx/compose/animation/EnterTransition;

    move-result-object v5

    move-object v11, v5

    goto :goto_f

    :cond_15
    move-object v11, v6

    :goto_f
    if-eqz v8, :cond_16

    .line 31
    invoke-static {v15, v4, v12, v15}, Landroidx/compose/animation/EnterExitTransitionKt;->fadeOut$default(Landroidx/compose/animation/core/FiniteAnimationSpec;FILjava/lang/Object;)Landroidx/compose/animation/ExitTransition;

    move-result-object v4

    const/16 v20, 0xf

    const/16 v21, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/animation/EnterExitTransitionKt;->shrinkOut$default(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment;ZLhd/l;ILjava/lang/Object;)Landroidx/compose/animation/ExitTransition;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroidx/compose/animation/ExitTransition;->plus(Landroidx/compose/animation/ExitTransition;)Landroidx/compose/animation/ExitTransition;

    move-result-object v4

    move-object v12, v4

    goto :goto_10

    :cond_16
    move-object v12, v9

    :goto_10
    if-eqz v3, :cond_17

    .line 32
    const-string v3, "AnimatedVisibility"

    goto :goto_11

    :cond_17
    move-object/from16 v3, p4

    :goto_11
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v4

    if-eqz v4, :cond_18

    const/4 v4, -0x1

    const-string v5, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:376)"

    const v6, -0xd4928fa

    .line 33
    invoke-static {v6, v2, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 34
    :cond_18
    sget v4, Landroidx/compose/animation/core/MutableTransitionState;->$stable:I

    and-int/lit8 v5, v2, 0xe

    or-int/2addr v4, v5

    shr-int/lit8 v5, v2, 0x9

    and-int/lit8 v5, v5, 0x70

    or-int/2addr v4, v5

    invoke-static {v1, v3, v14, v4, v0}, Landroidx/compose/animation/core/TransitionKt;->rememberTransition(Landroidx/compose/animation/core/TransitionState;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;

    move-result-object v8

    .line 35
    sget-object v9, Landroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibility$7;->INSTANCE:Landroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibility$7;

    shl-int/lit8 v0, v2, 0x3

    and-int/lit16 v4, v0, 0x380

    or-int/lit8 v4, v4, 0x30

    and-int/lit16 v5, v0, 0x1c00

    or-int/2addr v4, v5

    const v5, 0xe000

    and-int/2addr v0, v5

    or-int/2addr v0, v4

    const/high16 v4, 0x70000

    and-int/2addr v2, v4

    or-int v15, v0, v2

    invoke-static/range {v8 .. v15}, Landroidx/compose/animation/AnimatedVisibilityKt;->AnimatedVisibilityImpl(Landroidx/compose/animation/core/Transition;Lhd/l;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lhd/q;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_19

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_19
    move-object v5, v3

    move-object v2, v10

    move-object v3, v11

    move-object v4, v12

    goto :goto_12

    .line 36
    :cond_1a
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v5, p4

    move-object v2, v4

    move-object v3, v6

    move-object v4, v9

    :goto_12
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v9

    if-eqz v9, :cond_1b

    new-instance v0, Landroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibility$8;

    move-object/from16 v6, p5

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Landroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibility$8;-><init>(Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lhd/q;II)V

    invoke-interface {v9, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lhd/p;)V

    :cond_1b
    return-void
.end method

.method public static final AnimatedVisibility(Landroidx/compose/animation/core/Transition;Lhd/l;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lhd/q;Landroidx/compose/runtime/Composer;II)V
    .locals 21
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[0[0]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/animation/core/Transition<",
            "TT;>;",
            "Lhd/l;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/animation/EnterTransition;",
            "Landroidx/compose/animation/ExitTransition;",
            "Lhd/q;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v7, p7

    const v0, 0x3d825161

    move-object/from16 v1, p6

    .line 55
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v14

    const/high16 v1, -0x80000000

    and-int v1, p8, v1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v7, 0x6

    move-object/from16 v8, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v7, 0x6

    move-object/from16 v8, p0

    if-nez v1, :cond_2

    invoke-interface {v14, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v7

    goto :goto_1

    :cond_2
    move v1, v7

    :goto_1
    and-int/lit8 v2, p8, 0x1

    if-eqz v2, :cond_3

    or-int/lit8 v1, v1, 0x30

    move-object/from16 v9, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v2, v7, 0x30

    move-object/from16 v9, p1

    if-nez v2, :cond_5

    invoke-interface {v14, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x20

    goto :goto_2

    :cond_4
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_5
    :goto_3
    and-int/lit8 v2, p8, 0x2

    if-eqz v2, :cond_7

    or-int/lit16 v1, v1, 0x180

    :cond_6
    move-object/from16 v3, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v3, v7, 0x180

    if-nez v3, :cond_6

    move-object/from16 v3, p2

    invoke-interface {v14, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    const/16 v4, 0x100

    goto :goto_4

    :cond_8
    const/16 v4, 0x80

    :goto_4
    or-int/2addr v1, v4

    :goto_5
    and-int/lit8 v4, p8, 0x4

    if-eqz v4, :cond_a

    or-int/lit16 v1, v1, 0xc00

    :cond_9
    move-object/from16 v5, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v5, v7, 0xc00

    if-nez v5, :cond_9

    move-object/from16 v5, p3

    invoke-interface {v14, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_b

    const/16 v6, 0x800

    goto :goto_6

    :cond_b
    const/16 v6, 0x400

    :goto_6
    or-int/2addr v1, v6

    :goto_7
    and-int/lit8 v6, p8, 0x8

    if-eqz v6, :cond_d

    or-int/lit16 v1, v1, 0x6000

    :cond_c
    move-object/from16 v10, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v10, v7, 0x6000

    if-nez v10, :cond_c

    move-object/from16 v10, p4

    invoke-interface {v14, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_e

    const/16 v11, 0x4000

    goto :goto_8

    :cond_e
    const/16 v11, 0x2000

    :goto_8
    or-int/2addr v1, v11

    :goto_9
    and-int/lit8 v11, p8, 0x10

    const/high16 v12, 0x30000

    if-eqz v11, :cond_f

    or-int/2addr v1, v12

    move-object/from16 v13, p5

    goto :goto_b

    :cond_f
    and-int v11, v7, v12

    move-object/from16 v13, p5

    if-nez v11, :cond_11

    invoke-interface {v14, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_10

    const/high16 v11, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v11, 0x10000

    :goto_a
    or-int/2addr v1, v11

    :cond_11
    :goto_b
    const v11, 0x12493

    and-int/2addr v11, v1

    const v12, 0x12492

    if-eq v11, v12, :cond_12

    const/4 v11, 0x1

    goto :goto_c

    :cond_12
    const/4 v11, 0x0

    :goto_c
    and-int/lit8 v12, v1, 0x1

    invoke-interface {v14, v11, v12}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v11

    if-eqz v11, :cond_18

    if-eqz v2, :cond_13

    .line 56
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    move-object v10, v2

    goto :goto_d

    :cond_13
    move-object v10, v3

    :goto_d
    const/4 v2, 0x3

    const/4 v3, 0x0

    const/4 v11, 0x0

    if-eqz v4, :cond_14

    .line 57
    invoke-static {v11, v3, v2, v11}, Landroidx/compose/animation/EnterExitTransitionKt;->fadeIn$default(Landroidx/compose/animation/core/FiniteAnimationSpec;FILjava/lang/Object;)Landroidx/compose/animation/EnterTransition;

    move-result-object v4

    const/16 v19, 0xf

    const/16 v20, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/animation/EnterExitTransitionKt;->expandIn$default(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment;ZLhd/l;ILjava/lang/Object;)Landroidx/compose/animation/EnterTransition;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroidx/compose/animation/EnterTransition;->plus(Landroidx/compose/animation/EnterTransition;)Landroidx/compose/animation/EnterTransition;

    move-result-object v4

    goto :goto_e

    :cond_14
    move-object v4, v5

    :goto_e
    if-eqz v6, :cond_15

    const/16 v19, 0xf

    const/16 v20, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    .line 58
    invoke-static/range {v15 .. v20}, Landroidx/compose/animation/EnterExitTransitionKt;->shrinkOut$default(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment;ZLhd/l;ILjava/lang/Object;)Landroidx/compose/animation/ExitTransition;

    move-result-object v5

    invoke-static {v11, v3, v2, v11}, Landroidx/compose/animation/EnterExitTransitionKt;->fadeOut$default(Landroidx/compose/animation/core/FiniteAnimationSpec;FILjava/lang/Object;)Landroidx/compose/animation/ExitTransition;

    move-result-object v2

    invoke-virtual {v5, v2}, Landroidx/compose/animation/ExitTransition;->plus(Landroidx/compose/animation/ExitTransition;)Landroidx/compose/animation/ExitTransition;

    move-result-object v2

    move-object v12, v2

    goto :goto_f

    :cond_15
    move-object/from16 v12, p4

    :goto_f
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_16

    const/4 v2, -0x1

    const-string v3, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:593)"

    .line 59
    invoke-static {v0, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_16
    const v0, 0x7fffe

    and-int v15, v1, v0

    move-object v11, v4

    invoke-static/range {v8 .. v15}, Landroidx/compose/animation/AnimatedVisibilityKt;->AnimatedVisibilityImpl(Landroidx/compose/animation/core/Transition;Lhd/l;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lhd/q;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_17

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_17
    move-object v3, v10

    move-object v4, v11

    move-object v5, v12

    goto :goto_10

    :cond_18
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object v4, v5

    move-object/from16 v5, p4

    :goto_10
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v9

    if-eqz v9, :cond_19

    new-instance v0, Landroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibility$13;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v6, p5

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Landroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibility$13;-><init>(Landroidx/compose/animation/core/Transition;Lhd/l;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lhd/q;II)V

    invoke-interface {v9, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lhd/p;)V

    :cond_19
    return-void
.end method

.method public static final AnimatedVisibility(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lhd/q;Landroidx/compose/runtime/Composer;II)V
    .locals 23
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[0[0]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/layout/ColumnScope;",
            "Landroidx/compose/animation/core/MutableTransitionState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/animation/EnterTransition;",
            "Landroidx/compose/animation/ExitTransition;",
            "Ljava/lang/String;",
            "Lhd/q;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v8, p8

    const v0, -0x32b3fd6a

    move-object/from16 v1, p7

    .line 46
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v15

    and-int/lit8 v1, p9, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v8, 0x30

    goto :goto_2

    :cond_0
    and-int/lit8 v1, v8, 0x30

    if-nez v1, :cond_3

    and-int/lit8 v1, v8, 0x40

    if-nez v1, :cond_1

    invoke-interface {v15, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0

    :cond_1
    invoke-interface {v15, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_1

    :cond_2
    const/16 v1, 0x10

    :goto_1
    or-int/2addr v1, v8

    goto :goto_2

    :cond_3
    move v1, v8

    :goto_2
    and-int/lit8 v3, p9, 0x2

    if-eqz v3, :cond_5

    or-int/lit16 v1, v1, 0x180

    :cond_4
    move-object/from16 v4, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v4, v8, 0x180

    if-nez v4, :cond_4

    move-object/from16 v4, p2

    invoke-interface {v15, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    const/16 v5, 0x100

    goto :goto_3

    :cond_6
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v1, v5

    :goto_4
    and-int/lit8 v5, p9, 0x4

    if-eqz v5, :cond_8

    or-int/lit16 v1, v1, 0xc00

    :cond_7
    move-object/from16 v6, p3

    goto :goto_6

    :cond_8
    and-int/lit16 v6, v8, 0xc00

    if-nez v6, :cond_7

    move-object/from16 v6, p3

    invoke-interface {v15, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_9

    const/16 v7, 0x800

    goto :goto_5

    :cond_9
    const/16 v7, 0x400

    :goto_5
    or-int/2addr v1, v7

    :goto_6
    and-int/lit8 v7, p9, 0x8

    if-eqz v7, :cond_b

    or-int/lit16 v1, v1, 0x6000

    :cond_a
    move-object/from16 v9, p4

    goto :goto_8

    :cond_b
    and-int/lit16 v9, v8, 0x6000

    if-nez v9, :cond_a

    move-object/from16 v9, p4

    invoke-interface {v15, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_c

    const/16 v10, 0x4000

    goto :goto_7

    :cond_c
    const/16 v10, 0x2000

    :goto_7
    or-int/2addr v1, v10

    :goto_8
    and-int/lit8 v10, p9, 0x10

    const/high16 v11, 0x30000

    if-eqz v10, :cond_e

    or-int/2addr v1, v11

    :cond_d
    move-object/from16 v11, p5

    goto :goto_a

    :cond_e
    and-int/2addr v11, v8

    if-nez v11, :cond_d

    move-object/from16 v11, p5

    invoke-interface {v15, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_f

    const/high16 v12, 0x20000

    goto :goto_9

    :cond_f
    const/high16 v12, 0x10000

    :goto_9
    or-int/2addr v1, v12

    :goto_a
    and-int/lit8 v12, p9, 0x20

    const/high16 v13, 0x180000

    if-eqz v12, :cond_10

    or-int/2addr v1, v13

    move-object/from16 v14, p6

    goto :goto_c

    :cond_10
    and-int v12, v8, v13

    move-object/from16 v14, p6

    if-nez v12, :cond_12

    invoke-interface {v15, v14}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_11

    const/high16 v12, 0x100000

    goto :goto_b

    :cond_11
    const/high16 v12, 0x80000

    :goto_b
    or-int/2addr v1, v12

    :cond_12
    :goto_c
    const v12, 0x92491

    and-int/2addr v12, v1

    const v13, 0x92490

    const/4 v0, 0x0

    if-eq v12, v13, :cond_13

    const/4 v12, 0x1

    goto :goto_d

    :cond_13
    move v12, v0

    :goto_d
    and-int/lit8 v13, v1, 0x1

    invoke-interface {v15, v12, v13}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v12

    if-eqz v12, :cond_1a

    if-eqz v3, :cond_14

    .line 47
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    move-object v11, v3

    goto :goto_e

    :cond_14
    move-object v11, v4

    :goto_e
    const/4 v3, 0x0

    const/4 v4, 0x3

    const/4 v12, 0x0

    if-eqz v5, :cond_15

    const/16 v21, 0xf

    const/16 v22, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    .line 48
    invoke-static/range {v17 .. v22}, Landroidx/compose/animation/EnterExitTransitionKt;->expandVertically$default(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment$Vertical;ZLhd/l;ILjava/lang/Object;)Landroidx/compose/animation/EnterTransition;

    move-result-object v5

    invoke-static {v12, v3, v4, v12}, Landroidx/compose/animation/EnterExitTransitionKt;->fadeIn$default(Landroidx/compose/animation/core/FiniteAnimationSpec;FILjava/lang/Object;)Landroidx/compose/animation/EnterTransition;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroidx/compose/animation/EnterTransition;->plus(Landroidx/compose/animation/EnterTransition;)Landroidx/compose/animation/EnterTransition;

    move-result-object v5

    move-object v6, v5

    :cond_15
    if-eqz v7, :cond_16

    const/16 v21, 0xf

    const/16 v22, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    .line 49
    invoke-static/range {v17 .. v22}, Landroidx/compose/animation/EnterExitTransitionKt;->shrinkVertically$default(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment$Vertical;ZLhd/l;ILjava/lang/Object;)Landroidx/compose/animation/ExitTransition;

    move-result-object v5

    invoke-static {v12, v3, v4, v12}, Landroidx/compose/animation/EnterExitTransitionKt;->fadeOut$default(Landroidx/compose/animation/core/FiniteAnimationSpec;FILjava/lang/Object;)Landroidx/compose/animation/ExitTransition;

    move-result-object v3

    invoke-virtual {v5, v3}, Landroidx/compose/animation/ExitTransition;->plus(Landroidx/compose/animation/ExitTransition;)Landroidx/compose/animation/ExitTransition;

    move-result-object v3

    move-object v13, v3

    goto :goto_f

    :cond_16
    move-object v13, v9

    :goto_f
    if-eqz v10, :cond_17

    .line 50
    const-string v3, "AnimatedVisibility"

    goto :goto_10

    :cond_17
    move-object/from16 v3, p5

    :goto_10
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v4

    if-eqz v4, :cond_18

    const/4 v4, -0x1

    const-string v5, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:522)"

    const v7, -0x32b3fd6a

    .line 51
    invoke-static {v7, v1, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 52
    :cond_18
    sget v4, Landroidx/compose/animation/core/MutableTransitionState;->$stable:I

    shr-int/lit8 v5, v1, 0x3

    and-int/lit8 v7, v5, 0xe

    or-int/2addr v4, v7

    shr-int/lit8 v7, v1, 0xc

    and-int/lit8 v7, v7, 0x70

    or-int/2addr v4, v7

    invoke-static {v2, v3, v15, v4, v0}, Landroidx/compose/animation/core/TransitionKt;->rememberTransition(Landroidx/compose/animation/core/TransitionState;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;

    move-result-object v9

    .line 53
    sget-object v10, Landroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibility$11;->INSTANCE:Landroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibility$11;

    and-int/lit16 v0, v1, 0x380

    or-int/lit8 v0, v0, 0x30

    and-int/lit16 v4, v1, 0x1c00

    or-int/2addr v0, v4

    const v4, 0xe000

    and-int/2addr v1, v4

    or-int/2addr v0, v1

    const/high16 v1, 0x70000

    and-int/2addr v1, v5

    or-int v16, v0, v1

    move-object v12, v6

    invoke-static/range {v9 .. v16}, Landroidx/compose/animation/AnimatedVisibilityKt;->AnimatedVisibilityImpl(Landroidx/compose/animation/core/Transition;Lhd/l;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lhd/q;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_19

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_19
    move-object v6, v3

    move-object v3, v11

    move-object v4, v12

    move-object v5, v13

    goto :goto_11

    .line 54
    :cond_1a
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object v3, v4

    move-object v4, v6

    move-object v5, v9

    move-object/from16 v6, p5

    :goto_11
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v10

    if-eqz v10, :cond_1b

    new-instance v0, Landroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibility$12;

    move-object/from16 v1, p0

    move-object/from16 v7, p6

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Landroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibility$12;-><init>(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lhd/q;II)V

    invoke-interface {v10, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lhd/p;)V

    :cond_1b
    return-void
.end method

.method public static final AnimatedVisibility(Landroidx/compose/foundation/layout/ColumnScope;ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lhd/q;Landroidx/compose/runtime/Composer;II)V
    .locals 23
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[0[0]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/layout/ColumnScope;",
            "Z",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/animation/EnterTransition;",
            "Landroidx/compose/animation/ExitTransition;",
            "Ljava/lang/String;",
            "Lhd/q;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v8, p8

    const v0, 0x694ab2be

    move-object/from16 v1, p7

    .line 19
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v15

    and-int/lit8 v1, p9, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v8, 0x30

    move/from16 v2, p1

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v8, 0x30

    move/from16 v2, p1

    if-nez v1, :cond_2

    invoke-interface {v15, v2}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x20

    goto :goto_0

    :cond_1
    const/16 v1, 0x10

    :goto_0
    or-int/2addr v1, v8

    goto :goto_1

    :cond_2
    move v1, v8

    :goto_1
    and-int/lit8 v3, p9, 0x2

    if-eqz v3, :cond_4

    or-int/lit16 v1, v1, 0x180

    :cond_3
    move-object/from16 v4, p2

    goto :goto_3

    :cond_4
    and-int/lit16 v4, v8, 0x180

    if-nez v4, :cond_3

    move-object/from16 v4, p2

    invoke-interface {v15, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    const/16 v5, 0x100

    goto :goto_2

    :cond_5
    const/16 v5, 0x80

    :goto_2
    or-int/2addr v1, v5

    :goto_3
    and-int/lit8 v5, p9, 0x4

    if-eqz v5, :cond_7

    or-int/lit16 v1, v1, 0xc00

    :cond_6
    move-object/from16 v6, p3

    goto :goto_5

    :cond_7
    and-int/lit16 v6, v8, 0xc00

    if-nez v6, :cond_6

    move-object/from16 v6, p3

    invoke-interface {v15, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    const/16 v7, 0x800

    goto :goto_4

    :cond_8
    const/16 v7, 0x400

    :goto_4
    or-int/2addr v1, v7

    :goto_5
    and-int/lit8 v7, p9, 0x8

    if-eqz v7, :cond_a

    or-int/lit16 v1, v1, 0x6000

    :cond_9
    move-object/from16 v9, p4

    goto :goto_7

    :cond_a
    and-int/lit16 v9, v8, 0x6000

    if-nez v9, :cond_9

    move-object/from16 v9, p4

    invoke-interface {v15, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_b

    const/16 v10, 0x4000

    goto :goto_6

    :cond_b
    const/16 v10, 0x2000

    :goto_6
    or-int/2addr v1, v10

    :goto_7
    and-int/lit8 v10, p9, 0x10

    const/high16 v11, 0x30000

    if-eqz v10, :cond_d

    or-int/2addr v1, v11

    :cond_c
    move-object/from16 v11, p5

    goto :goto_9

    :cond_d
    and-int/2addr v11, v8

    if-nez v11, :cond_c

    move-object/from16 v11, p5

    invoke-interface {v15, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_e

    const/high16 v12, 0x20000

    goto :goto_8

    :cond_e
    const/high16 v12, 0x10000

    :goto_8
    or-int/2addr v1, v12

    :goto_9
    and-int/lit8 v12, p9, 0x20

    const/high16 v13, 0x180000

    if-eqz v12, :cond_f

    or-int/2addr v1, v13

    move-object/from16 v14, p6

    goto :goto_b

    :cond_f
    and-int v12, v8, v13

    move-object/from16 v14, p6

    if-nez v12, :cond_11

    invoke-interface {v15, v14}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_10

    const/high16 v12, 0x100000

    goto :goto_a

    :cond_10
    const/high16 v12, 0x80000

    :goto_a
    or-int/2addr v1, v12

    :cond_11
    :goto_b
    const v12, 0x92491

    and-int/2addr v12, v1

    const v13, 0x92490

    const/4 v0, 0x0

    if-eq v12, v13, :cond_12

    const/4 v12, 0x1

    goto :goto_c

    :cond_12
    move v12, v0

    :goto_c
    and-int/lit8 v13, v1, 0x1

    invoke-interface {v15, v12, v13}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v12

    if-eqz v12, :cond_19

    if-eqz v3, :cond_13

    .line 20
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    move-object v11, v3

    goto :goto_d

    :cond_13
    move-object v11, v4

    :goto_d
    const/4 v3, 0x0

    const/4 v4, 0x3

    const/4 v12, 0x0

    if-eqz v5, :cond_14

    .line 21
    invoke-static {v12, v3, v4, v12}, Landroidx/compose/animation/EnterExitTransitionKt;->fadeIn$default(Landroidx/compose/animation/core/FiniteAnimationSpec;FILjava/lang/Object;)Landroidx/compose/animation/EnterTransition;

    move-result-object v5

    const/16 v21, 0xf

    const/16 v22, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v17 .. v22}, Landroidx/compose/animation/EnterExitTransitionKt;->expandVertically$default(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment$Vertical;ZLhd/l;ILjava/lang/Object;)Landroidx/compose/animation/EnterTransition;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroidx/compose/animation/EnterTransition;->plus(Landroidx/compose/animation/EnterTransition;)Landroidx/compose/animation/EnterTransition;

    move-result-object v5

    move-object v6, v5

    :cond_14
    if-eqz v7, :cond_15

    .line 22
    invoke-static {v12, v3, v4, v12}, Landroidx/compose/animation/EnterExitTransitionKt;->fadeOut$default(Landroidx/compose/animation/core/FiniteAnimationSpec;FILjava/lang/Object;)Landroidx/compose/animation/ExitTransition;

    move-result-object v3

    const/16 v21, 0xf

    const/16 v22, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v17 .. v22}, Landroidx/compose/animation/EnterExitTransitionKt;->shrinkVertically$default(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment$Vertical;ZLhd/l;ILjava/lang/Object;)Landroidx/compose/animation/ExitTransition;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroidx/compose/animation/ExitTransition;->plus(Landroidx/compose/animation/ExitTransition;)Landroidx/compose/animation/ExitTransition;

    move-result-object v3

    move-object v13, v3

    goto :goto_e

    :cond_15
    move-object v13, v9

    :goto_e
    if-eqz v10, :cond_16

    .line 23
    const-string v3, "AnimatedVisibility"

    goto :goto_f

    :cond_16
    move-object/from16 v3, p5

    :goto_f
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v4

    if-eqz v4, :cond_17

    const/4 v4, -0x1

    const-string v5, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:277)"

    const v7, 0x694ab2be

    .line 24
    invoke-static {v7, v1, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 25
    :cond_17
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    shr-int/lit8 v5, v1, 0x3

    and-int/lit8 v7, v5, 0xe

    shr-int/lit8 v9, v1, 0xc

    and-int/lit8 v9, v9, 0x70

    or-int/2addr v7, v9

    invoke-static {v4, v3, v15, v7, v0}, Landroidx/compose/animation/core/TransitionKt;->updateTransition(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;

    move-result-object v9

    .line 26
    sget-object v10, Landroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibility$5;->INSTANCE:Landroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibility$5;

    and-int/lit16 v0, v1, 0x380

    or-int/lit8 v0, v0, 0x30

    and-int/lit16 v4, v1, 0x1c00

    or-int/2addr v0, v4

    const v4, 0xe000

    and-int/2addr v1, v4

    or-int/2addr v0, v1

    const/high16 v1, 0x70000

    and-int/2addr v1, v5

    or-int v16, v0, v1

    move-object v12, v6

    invoke-static/range {v9 .. v16}, Landroidx/compose/animation/AnimatedVisibilityKt;->AnimatedVisibilityImpl(Landroidx/compose/animation/core/Transition;Lhd/l;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lhd/q;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_18

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_18
    move-object v6, v3

    move-object v3, v11

    move-object v4, v12

    move-object v5, v13

    goto :goto_10

    .line 27
    :cond_19
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object v3, v4

    move-object v4, v6

    move-object v5, v9

    move-object/from16 v6, p5

    :goto_10
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v10

    if-eqz v10, :cond_1a

    new-instance v0, Landroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibility$6;

    move-object/from16 v1, p0

    move-object/from16 v7, p6

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Landroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibility$6;-><init>(Landroidx/compose/foundation/layout/ColumnScope;ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lhd/q;II)V

    invoke-interface {v10, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lhd/p;)V

    :cond_1a
    return-void
.end method

.method public static final AnimatedVisibility(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lhd/q;Landroidx/compose/runtime/Composer;II)V
    .locals 23
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[0[0]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/layout/RowScope;",
            "Landroidx/compose/animation/core/MutableTransitionState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/animation/EnterTransition;",
            "Landroidx/compose/animation/ExitTransition;",
            "Ljava/lang/String;",
            "Lhd/q;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v8, p8

    const v0, 0x31dc20ae

    move-object/from16 v1, p7

    .line 37
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v15

    and-int/lit8 v1, p9, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v8, 0x30

    goto :goto_2

    :cond_0
    and-int/lit8 v1, v8, 0x30

    if-nez v1, :cond_3

    and-int/lit8 v1, v8, 0x40

    if-nez v1, :cond_1

    invoke-interface {v15, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0

    :cond_1
    invoke-interface {v15, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_1

    :cond_2
    const/16 v1, 0x10

    :goto_1
    or-int/2addr v1, v8

    goto :goto_2

    :cond_3
    move v1, v8

    :goto_2
    and-int/lit8 v3, p9, 0x2

    if-eqz v3, :cond_5

    or-int/lit16 v1, v1, 0x180

    :cond_4
    move-object/from16 v4, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v4, v8, 0x180

    if-nez v4, :cond_4

    move-object/from16 v4, p2

    invoke-interface {v15, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    const/16 v5, 0x100

    goto :goto_3

    :cond_6
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v1, v5

    :goto_4
    and-int/lit8 v5, p9, 0x4

    if-eqz v5, :cond_8

    or-int/lit16 v1, v1, 0xc00

    :cond_7
    move-object/from16 v6, p3

    goto :goto_6

    :cond_8
    and-int/lit16 v6, v8, 0xc00

    if-nez v6, :cond_7

    move-object/from16 v6, p3

    invoke-interface {v15, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_9

    const/16 v7, 0x800

    goto :goto_5

    :cond_9
    const/16 v7, 0x400

    :goto_5
    or-int/2addr v1, v7

    :goto_6
    and-int/lit8 v7, p9, 0x8

    if-eqz v7, :cond_b

    or-int/lit16 v1, v1, 0x6000

    :cond_a
    move-object/from16 v9, p4

    goto :goto_8

    :cond_b
    and-int/lit16 v9, v8, 0x6000

    if-nez v9, :cond_a

    move-object/from16 v9, p4

    invoke-interface {v15, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_c

    const/16 v10, 0x4000

    goto :goto_7

    :cond_c
    const/16 v10, 0x2000

    :goto_7
    or-int/2addr v1, v10

    :goto_8
    and-int/lit8 v10, p9, 0x10

    const/high16 v11, 0x30000

    if-eqz v10, :cond_e

    or-int/2addr v1, v11

    :cond_d
    move-object/from16 v11, p5

    goto :goto_a

    :cond_e
    and-int/2addr v11, v8

    if-nez v11, :cond_d

    move-object/from16 v11, p5

    invoke-interface {v15, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_f

    const/high16 v12, 0x20000

    goto :goto_9

    :cond_f
    const/high16 v12, 0x10000

    :goto_9
    or-int/2addr v1, v12

    :goto_a
    and-int/lit8 v12, p9, 0x20

    const/high16 v13, 0x180000

    if-eqz v12, :cond_10

    or-int/2addr v1, v13

    move-object/from16 v14, p6

    goto :goto_c

    :cond_10
    and-int v12, v8, v13

    move-object/from16 v14, p6

    if-nez v12, :cond_12

    invoke-interface {v15, v14}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_11

    const/high16 v12, 0x100000

    goto :goto_b

    :cond_11
    const/high16 v12, 0x80000

    :goto_b
    or-int/2addr v1, v12

    :cond_12
    :goto_c
    const v12, 0x92491

    and-int/2addr v12, v1

    const v13, 0x92490

    const/4 v0, 0x0

    if-eq v12, v13, :cond_13

    const/4 v12, 0x1

    goto :goto_d

    :cond_13
    move v12, v0

    :goto_d
    and-int/lit8 v13, v1, 0x1

    invoke-interface {v15, v12, v13}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v12

    if-eqz v12, :cond_1a

    if-eqz v3, :cond_14

    .line 38
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    move-object v11, v3

    goto :goto_e

    :cond_14
    move-object v11, v4

    :goto_e
    const/4 v3, 0x0

    const/4 v4, 0x3

    const/4 v12, 0x0

    if-eqz v5, :cond_15

    const/16 v21, 0xf

    const/16 v22, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    .line 39
    invoke-static/range {v17 .. v22}, Landroidx/compose/animation/EnterExitTransitionKt;->expandHorizontally$default(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment$Horizontal;ZLhd/l;ILjava/lang/Object;)Landroidx/compose/animation/EnterTransition;

    move-result-object v5

    invoke-static {v12, v3, v4, v12}, Landroidx/compose/animation/EnterExitTransitionKt;->fadeIn$default(Landroidx/compose/animation/core/FiniteAnimationSpec;FILjava/lang/Object;)Landroidx/compose/animation/EnterTransition;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroidx/compose/animation/EnterTransition;->plus(Landroidx/compose/animation/EnterTransition;)Landroidx/compose/animation/EnterTransition;

    move-result-object v5

    move-object v6, v5

    :cond_15
    if-eqz v7, :cond_16

    const/16 v21, 0xf

    const/16 v22, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    .line 40
    invoke-static/range {v17 .. v22}, Landroidx/compose/animation/EnterExitTransitionKt;->shrinkHorizontally$default(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment$Horizontal;ZLhd/l;ILjava/lang/Object;)Landroidx/compose/animation/ExitTransition;

    move-result-object v5

    invoke-static {v12, v3, v4, v12}, Landroidx/compose/animation/EnterExitTransitionKt;->fadeOut$default(Landroidx/compose/animation/core/FiniteAnimationSpec;FILjava/lang/Object;)Landroidx/compose/animation/ExitTransition;

    move-result-object v3

    invoke-virtual {v5, v3}, Landroidx/compose/animation/ExitTransition;->plus(Landroidx/compose/animation/ExitTransition;)Landroidx/compose/animation/ExitTransition;

    move-result-object v3

    move-object v13, v3

    goto :goto_f

    :cond_16
    move-object v13, v9

    :goto_f
    if-eqz v10, :cond_17

    .line 41
    const-string v3, "AnimatedVisibility"

    goto :goto_10

    :cond_17
    move-object/from16 v3, p5

    :goto_10
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v4

    if-eqz v4, :cond_18

    const/4 v4, -0x1

    const-string v5, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)"

    const v7, 0x31dc20ae

    .line 42
    invoke-static {v7, v1, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 43
    :cond_18
    sget v4, Landroidx/compose/animation/core/MutableTransitionState;->$stable:I

    shr-int/lit8 v5, v1, 0x3

    and-int/lit8 v7, v5, 0xe

    or-int/2addr v4, v7

    shr-int/lit8 v7, v1, 0xc

    and-int/lit8 v7, v7, 0x70

    or-int/2addr v4, v7

    invoke-static {v2, v3, v15, v4, v0}, Landroidx/compose/animation/core/TransitionKt;->rememberTransition(Landroidx/compose/animation/core/TransitionState;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;

    move-result-object v9

    .line 44
    sget-object v10, Landroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibility$9;->INSTANCE:Landroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibility$9;

    and-int/lit16 v0, v1, 0x380

    or-int/lit8 v0, v0, 0x30

    and-int/lit16 v4, v1, 0x1c00

    or-int/2addr v0, v4

    const v4, 0xe000

    and-int/2addr v1, v4

    or-int/2addr v0, v1

    const/high16 v1, 0x70000

    and-int/2addr v1, v5

    or-int v16, v0, v1

    move-object v12, v6

    invoke-static/range {v9 .. v16}, Landroidx/compose/animation/AnimatedVisibilityKt;->AnimatedVisibilityImpl(Landroidx/compose/animation/core/Transition;Lhd/l;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lhd/q;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_19

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_19
    move-object v6, v3

    move-object v3, v11

    move-object v4, v12

    move-object v5, v13

    goto :goto_11

    .line 45
    :cond_1a
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object v3, v4

    move-object v4, v6

    move-object v5, v9

    move-object/from16 v6, p5

    :goto_11
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v10

    if-eqz v10, :cond_1b

    new-instance v0, Landroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibility$10;

    move-object/from16 v1, p0

    move-object/from16 v7, p6

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Landroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibility$10;-><init>(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lhd/q;II)V

    invoke-interface {v10, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lhd/p;)V

    :cond_1b
    return-void
.end method

.method public static final AnimatedVisibility(Landroidx/compose/foundation/layout/RowScope;ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lhd/q;Landroidx/compose/runtime/Composer;II)V
    .locals 23
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[0[0]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/layout/RowScope;",
            "Z",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/animation/EnterTransition;",
            "Landroidx/compose/animation/ExitTransition;",
            "Ljava/lang/String;",
            "Lhd/q;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v8, p8

    const v0, -0x67cad85a

    move-object/from16 v1, p7

    .line 10
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v15

    and-int/lit8 v1, p9, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v8, 0x30

    move/from16 v2, p1

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v8, 0x30

    move/from16 v2, p1

    if-nez v1, :cond_2

    invoke-interface {v15, v2}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x20

    goto :goto_0

    :cond_1
    const/16 v1, 0x10

    :goto_0
    or-int/2addr v1, v8

    goto :goto_1

    :cond_2
    move v1, v8

    :goto_1
    and-int/lit8 v3, p9, 0x2

    if-eqz v3, :cond_4

    or-int/lit16 v1, v1, 0x180

    :cond_3
    move-object/from16 v4, p2

    goto :goto_3

    :cond_4
    and-int/lit16 v4, v8, 0x180

    if-nez v4, :cond_3

    move-object/from16 v4, p2

    invoke-interface {v15, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    const/16 v5, 0x100

    goto :goto_2

    :cond_5
    const/16 v5, 0x80

    :goto_2
    or-int/2addr v1, v5

    :goto_3
    and-int/lit8 v5, p9, 0x4

    if-eqz v5, :cond_7

    or-int/lit16 v1, v1, 0xc00

    :cond_6
    move-object/from16 v6, p3

    goto :goto_5

    :cond_7
    and-int/lit16 v6, v8, 0xc00

    if-nez v6, :cond_6

    move-object/from16 v6, p3

    invoke-interface {v15, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    const/16 v7, 0x800

    goto :goto_4

    :cond_8
    const/16 v7, 0x400

    :goto_4
    or-int/2addr v1, v7

    :goto_5
    and-int/lit8 v7, p9, 0x8

    if-eqz v7, :cond_a

    or-int/lit16 v1, v1, 0x6000

    :cond_9
    move-object/from16 v9, p4

    goto :goto_7

    :cond_a
    and-int/lit16 v9, v8, 0x6000

    if-nez v9, :cond_9

    move-object/from16 v9, p4

    invoke-interface {v15, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_b

    const/16 v10, 0x4000

    goto :goto_6

    :cond_b
    const/16 v10, 0x2000

    :goto_6
    or-int/2addr v1, v10

    :goto_7
    and-int/lit8 v10, p9, 0x10

    const/high16 v11, 0x30000

    if-eqz v10, :cond_d

    or-int/2addr v1, v11

    :cond_c
    move-object/from16 v11, p5

    goto :goto_9

    :cond_d
    and-int/2addr v11, v8

    if-nez v11, :cond_c

    move-object/from16 v11, p5

    invoke-interface {v15, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_e

    const/high16 v12, 0x20000

    goto :goto_8

    :cond_e
    const/high16 v12, 0x10000

    :goto_8
    or-int/2addr v1, v12

    :goto_9
    and-int/lit8 v12, p9, 0x20

    const/high16 v13, 0x180000

    if-eqz v12, :cond_f

    or-int/2addr v1, v13

    move-object/from16 v14, p6

    goto :goto_b

    :cond_f
    and-int v12, v8, v13

    move-object/from16 v14, p6

    if-nez v12, :cond_11

    invoke-interface {v15, v14}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_10

    const/high16 v12, 0x100000

    goto :goto_a

    :cond_10
    const/high16 v12, 0x80000

    :goto_a
    or-int/2addr v1, v12

    :cond_11
    :goto_b
    const v12, 0x92491

    and-int/2addr v12, v1

    const v13, 0x92490

    const/4 v0, 0x0

    if-eq v12, v13, :cond_12

    const/4 v12, 0x1

    goto :goto_c

    :cond_12
    move v12, v0

    :goto_c
    and-int/lit8 v13, v1, 0x1

    invoke-interface {v15, v12, v13}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v12

    if-eqz v12, :cond_19

    if-eqz v3, :cond_13

    .line 11
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    move-object v11, v3

    goto :goto_d

    :cond_13
    move-object v11, v4

    :goto_d
    const/4 v3, 0x0

    const/4 v4, 0x3

    const/4 v12, 0x0

    if-eqz v5, :cond_14

    .line 12
    invoke-static {v12, v3, v4, v12}, Landroidx/compose/animation/EnterExitTransitionKt;->fadeIn$default(Landroidx/compose/animation/core/FiniteAnimationSpec;FILjava/lang/Object;)Landroidx/compose/animation/EnterTransition;

    move-result-object v5

    const/16 v21, 0xf

    const/16 v22, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v17 .. v22}, Landroidx/compose/animation/EnterExitTransitionKt;->expandHorizontally$default(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment$Horizontal;ZLhd/l;ILjava/lang/Object;)Landroidx/compose/animation/EnterTransition;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroidx/compose/animation/EnterTransition;->plus(Landroidx/compose/animation/EnterTransition;)Landroidx/compose/animation/EnterTransition;

    move-result-object v5

    move-object v6, v5

    :cond_14
    if-eqz v7, :cond_15

    .line 13
    invoke-static {v12, v3, v4, v12}, Landroidx/compose/animation/EnterExitTransitionKt;->fadeOut$default(Landroidx/compose/animation/core/FiniteAnimationSpec;FILjava/lang/Object;)Landroidx/compose/animation/ExitTransition;

    move-result-object v3

    const/16 v21, 0xf

    const/16 v22, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v17 .. v22}, Landroidx/compose/animation/EnterExitTransitionKt;->shrinkHorizontally$default(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment$Horizontal;ZLhd/l;ILjava/lang/Object;)Landroidx/compose/animation/ExitTransition;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroidx/compose/animation/ExitTransition;->plus(Landroidx/compose/animation/ExitTransition;)Landroidx/compose/animation/ExitTransition;

    move-result-object v3

    move-object v13, v3

    goto :goto_e

    :cond_15
    move-object v13, v9

    :goto_e
    if-eqz v10, :cond_16

    .line 14
    const-string v3, "AnimatedVisibility"

    goto :goto_f

    :cond_16
    move-object/from16 v3, p5

    :goto_f
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v4

    if-eqz v4, :cond_17

    const/4 v4, -0x1

    const-string v5, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:204)"

    const v7, -0x67cad85a

    .line 15
    invoke-static {v7, v1, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 16
    :cond_17
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    shr-int/lit8 v5, v1, 0x3

    and-int/lit8 v7, v5, 0xe

    shr-int/lit8 v9, v1, 0xc

    and-int/lit8 v9, v9, 0x70

    or-int/2addr v7, v9

    invoke-static {v4, v3, v15, v7, v0}, Landroidx/compose/animation/core/TransitionKt;->updateTransition(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;

    move-result-object v9

    .line 17
    sget-object v10, Landroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibility$3;->INSTANCE:Landroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibility$3;

    and-int/lit16 v0, v1, 0x380

    or-int/lit8 v0, v0, 0x30

    and-int/lit16 v4, v1, 0x1c00

    or-int/2addr v0, v4

    const v4, 0xe000

    and-int/2addr v1, v4

    or-int/2addr v0, v1

    const/high16 v1, 0x70000

    and-int/2addr v1, v5

    or-int v16, v0, v1

    move-object v12, v6

    invoke-static/range {v9 .. v16}, Landroidx/compose/animation/AnimatedVisibilityKt;->AnimatedVisibilityImpl(Landroidx/compose/animation/core/Transition;Lhd/l;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lhd/q;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_18

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_18
    move-object v6, v3

    move-object v3, v11

    move-object v4, v12

    move-object v5, v13

    goto :goto_10

    .line 18
    :cond_19
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object v3, v4

    move-object v4, v6

    move-object v5, v9

    move-object/from16 v6, p5

    :goto_10
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v10

    if-eqz v10, :cond_1a

    new-instance v0, Landroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibility$4;

    move-object/from16 v1, p0

    move-object/from16 v7, p6

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Landroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibility$4;-><init>(Landroidx/compose/foundation/layout/RowScope;ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lhd/q;II)V

    invoke-interface {v10, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lhd/p;)V

    :cond_1a
    return-void
.end method

.method public static final AnimatedVisibility(ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lhd/q;Landroidx/compose/runtime/Composer;II)V
    .locals 23
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[0[0]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/animation/EnterTransition;",
            "Landroidx/compose/animation/ExitTransition;",
            "Ljava/lang/String;",
            "Lhd/q;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v7, p7

    const v0, 0x7c7f8c4e

    move-object/from16 v1, p6

    .line 1
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v14

    and-int/lit8 v1, p8, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v7, 0x6

    move v2, v1

    move/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v7, 0x6

    if-nez v1, :cond_2

    move/from16 v1, p0

    invoke-interface {v14, v1}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v7

    goto :goto_1

    :cond_2
    move/from16 v1, p0

    move v2, v7

    :goto_1
    and-int/lit8 v3, p8, 0x2

    if-eqz v3, :cond_4

    or-int/lit8 v2, v2, 0x30

    :cond_3
    move-object/from16 v4, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v4, v7, 0x30

    if-nez v4, :cond_3

    move-object/from16 v4, p1

    invoke-interface {v14, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    const/16 v5, 0x20

    goto :goto_2

    :cond_5
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v2, v5

    :goto_3
    and-int/lit8 v5, p8, 0x4

    if-eqz v5, :cond_7

    or-int/lit16 v2, v2, 0x180

    :cond_6
    move-object/from16 v6, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v6, v7, 0x180

    if-nez v6, :cond_6

    move-object/from16 v6, p2

    invoke-interface {v14, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x100

    goto :goto_4

    :cond_8
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v2, v8

    :goto_5
    and-int/lit8 v8, p8, 0x8

    if-eqz v8, :cond_a

    or-int/lit16 v2, v2, 0xc00

    :cond_9
    move-object/from16 v9, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v9, v7, 0xc00

    if-nez v9, :cond_9

    move-object/from16 v9, p3

    invoke-interface {v14, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_b

    const/16 v10, 0x800

    goto :goto_6

    :cond_b
    const/16 v10, 0x400

    :goto_6
    or-int/2addr v2, v10

    :goto_7
    and-int/lit8 v10, p8, 0x10

    if-eqz v10, :cond_d

    or-int/lit16 v2, v2, 0x6000

    :cond_c
    move-object/from16 v11, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v11, v7, 0x6000

    if-nez v11, :cond_c

    move-object/from16 v11, p4

    invoke-interface {v14, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_e

    const/16 v12, 0x4000

    goto :goto_8

    :cond_e
    const/16 v12, 0x2000

    :goto_8
    or-int/2addr v2, v12

    :goto_9
    and-int/lit8 v12, p8, 0x20

    const/high16 v13, 0x30000

    if-eqz v12, :cond_f

    or-int/2addr v2, v13

    move-object/from16 v13, p5

    goto :goto_b

    :cond_f
    and-int v12, v7, v13

    move-object/from16 v13, p5

    if-nez v12, :cond_11

    invoke-interface {v14, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_10

    const/high16 v12, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v12, 0x10000

    :goto_a
    or-int/2addr v2, v12

    :cond_11
    :goto_b
    const v12, 0x12493

    and-int/2addr v12, v2

    const v15, 0x12492

    const/4 v0, 0x0

    if-eq v12, v15, :cond_12

    const/4 v12, 0x1

    goto :goto_c

    :cond_12
    move v12, v0

    :goto_c
    and-int/lit8 v15, v2, 0x1

    invoke-interface {v14, v12, v15}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v12

    if-eqz v12, :cond_19

    if-eqz v3, :cond_13

    .line 2
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    move/from16 v22, v10

    move-object v10, v3

    move/from16 v3, v22

    goto :goto_d

    :cond_13
    move v3, v10

    move-object v10, v4

    :goto_d
    const/4 v4, 0x0

    const/4 v12, 0x3

    const/4 v15, 0x0

    if-eqz v5, :cond_14

    .line 3
    invoke-static {v15, v4, v12, v15}, Landroidx/compose/animation/EnterExitTransitionKt;->fadeIn$default(Landroidx/compose/animation/core/FiniteAnimationSpec;FILjava/lang/Object;)Landroidx/compose/animation/EnterTransition;

    move-result-object v5

    const/16 v20, 0xf

    const/16 v21, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/animation/EnterExitTransitionKt;->expandIn$default(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment;ZLhd/l;ILjava/lang/Object;)Landroidx/compose/animation/EnterTransition;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroidx/compose/animation/EnterTransition;->plus(Landroidx/compose/animation/EnterTransition;)Landroidx/compose/animation/EnterTransition;

    move-result-object v5

    move-object v11, v5

    goto :goto_e

    :cond_14
    move-object v11, v6

    :goto_e
    if-eqz v8, :cond_15

    const/16 v20, 0xf

    const/16 v21, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    .line 4
    invoke-static/range {v16 .. v21}, Landroidx/compose/animation/EnterExitTransitionKt;->shrinkOut$default(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment;ZLhd/l;ILjava/lang/Object;)Landroidx/compose/animation/ExitTransition;

    move-result-object v5

    invoke-static {v15, v4, v12, v15}, Landroidx/compose/animation/EnterExitTransitionKt;->fadeOut$default(Landroidx/compose/animation/core/FiniteAnimationSpec;FILjava/lang/Object;)Landroidx/compose/animation/ExitTransition;

    move-result-object v4

    invoke-virtual {v5, v4}, Landroidx/compose/animation/ExitTransition;->plus(Landroidx/compose/animation/ExitTransition;)Landroidx/compose/animation/ExitTransition;

    move-result-object v4

    move-object v12, v4

    goto :goto_f

    :cond_15
    move-object v12, v9

    :goto_f
    if-eqz v3, :cond_16

    .line 5
    const-string v3, "AnimatedVisibility"

    goto :goto_10

    :cond_16
    move-object/from16 v3, p4

    :goto_10
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v4

    if-eqz v4, :cond_17

    const/4 v4, -0x1

    const-string v5, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:130)"

    const v6, 0x7c7f8c4e

    .line 6
    invoke-static {v6, v2, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 7
    :cond_17
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    and-int/lit8 v5, v2, 0xe

    shr-int/lit8 v6, v2, 0x9

    and-int/lit8 v6, v6, 0x70

    or-int/2addr v5, v6

    invoke-static {v4, v3, v14, v5, v0}, Landroidx/compose/animation/core/TransitionKt;->updateTransition(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/animation/core/Transition;

    move-result-object v8

    .line 8
    sget-object v9, Landroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibility$1;->INSTANCE:Landroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibility$1;

    shl-int/lit8 v0, v2, 0x3

    and-int/lit16 v4, v0, 0x380

    or-int/lit8 v4, v4, 0x30

    and-int/lit16 v5, v0, 0x1c00

    or-int/2addr v4, v5

    const v5, 0xe000

    and-int/2addr v0, v5

    or-int/2addr v0, v4

    const/high16 v4, 0x70000

    and-int/2addr v2, v4

    or-int v15, v0, v2

    invoke-static/range {v8 .. v15}, Landroidx/compose/animation/AnimatedVisibilityKt;->AnimatedVisibilityImpl(Landroidx/compose/animation/core/Transition;Lhd/l;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lhd/q;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_18

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_18
    move-object v5, v3

    move-object v2, v10

    move-object v3, v11

    move-object v4, v12

    goto :goto_11

    .line 9
    :cond_19
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v5, p4

    move-object v2, v4

    move-object v3, v6

    move-object v4, v9

    :goto_11
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v9

    if-eqz v9, :cond_1a

    new-instance v0, Landroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibility$2;

    move-object/from16 v6, p5

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Landroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibility$2;-><init>(ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lhd/q;II)V

    invoke-interface {v9, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lhd/p;)V

    :cond_1a
    return-void
.end method

.method public static final AnimatedVisibilityImpl(Landroidx/compose/animation/core/Transition;Lhd/l;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lhd/q;Landroidx/compose/runtime/Composer;I)V
    .locals 17
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[0[0]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/animation/core/Transition<",
            "TT;>;",
            "Lhd/l;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/animation/EnterTransition;",
            "Landroidx/compose/animation/ExitTransition;",
            "Lhd/q;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v11, p2

    .line 6
    .line 7
    move/from16 v12, p7

    .line 8
    .line 9
    const v2, 0x19a0f3eb

    .line 10
    .line 11
    .line 12
    move-object/from16 v3, p6

    .line 13
    .line 14
    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 15
    .line 16
    .line 17
    move-result-object v8

    .line 18
    and-int/lit8 v3, v12, 0x6

    .line 19
    .line 20
    const/4 v4, 0x4

    .line 21
    if-nez v3, :cond_1

    .line 22
    .line 23
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    move v3, v4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v3, 0x2

    .line 32
    :goto_0
    or-int/2addr v3, v12

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move v3, v12

    .line 35
    :goto_1
    and-int/lit8 v5, v12, 0x30

    .line 36
    .line 37
    const/16 v6, 0x20

    .line 38
    .line 39
    if-nez v5, :cond_3

    .line 40
    .line 41
    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    if-eqz v5, :cond_2

    .line 46
    .line 47
    move v5, v6

    .line 48
    goto :goto_2

    .line 49
    :cond_2
    const/16 v5, 0x10

    .line 50
    .line 51
    :goto_2
    or-int/2addr v3, v5

    .line 52
    :cond_3
    and-int/lit16 v5, v12, 0x180

    .line 53
    .line 54
    if-nez v5, :cond_5

    .line 55
    .line 56
    invoke-interface {v8, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-eqz v5, :cond_4

    .line 61
    .line 62
    const/16 v5, 0x100

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_4
    const/16 v5, 0x80

    .line 66
    .line 67
    :goto_3
    or-int/2addr v3, v5

    .line 68
    :cond_5
    and-int/lit16 v5, v12, 0xc00

    .line 69
    .line 70
    if-nez v5, :cond_7

    .line 71
    .line 72
    move-object/from16 v5, p3

    .line 73
    .line 74
    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    if-eqz v7, :cond_6

    .line 79
    .line 80
    const/16 v7, 0x800

    .line 81
    .line 82
    goto :goto_4

    .line 83
    :cond_6
    const/16 v7, 0x400

    .line 84
    .line 85
    :goto_4
    or-int/2addr v3, v7

    .line 86
    goto :goto_5

    .line 87
    :cond_7
    move-object/from16 v5, p3

    .line 88
    .line 89
    :goto_5
    and-int/lit16 v7, v12, 0x6000

    .line 90
    .line 91
    if-nez v7, :cond_9

    .line 92
    .line 93
    move-object/from16 v7, p4

    .line 94
    .line 95
    invoke-interface {v8, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v9

    .line 99
    if-eqz v9, :cond_8

    .line 100
    .line 101
    const/16 v9, 0x4000

    .line 102
    .line 103
    goto :goto_6

    .line 104
    :cond_8
    const/16 v9, 0x2000

    .line 105
    .line 106
    :goto_6
    or-int/2addr v3, v9

    .line 107
    goto :goto_7

    .line 108
    :cond_9
    move-object/from16 v7, p4

    .line 109
    .line 110
    :goto_7
    const/high16 v9, 0x30000

    .line 111
    .line 112
    and-int v10, v12, v9

    .line 113
    .line 114
    if-nez v10, :cond_b

    .line 115
    .line 116
    move-object/from16 v10, p5

    .line 117
    .line 118
    invoke-interface {v8, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v13

    .line 122
    if-eqz v13, :cond_a

    .line 123
    .line 124
    const/high16 v13, 0x20000

    .line 125
    .line 126
    goto :goto_8

    .line 127
    :cond_a
    const/high16 v13, 0x10000

    .line 128
    .line 129
    :goto_8
    or-int/2addr v3, v13

    .line 130
    goto :goto_9

    .line 131
    :cond_b
    move-object/from16 v10, p5

    .line 132
    .line 133
    :goto_9
    const v13, 0x12493

    .line 134
    .line 135
    .line 136
    and-int/2addr v13, v3

    .line 137
    const v14, 0x12492

    .line 138
    .line 139
    .line 140
    const/4 v15, 0x0

    .line 141
    const/16 v16, 0x1

    .line 142
    .line 143
    if-eq v13, v14, :cond_c

    .line 144
    .line 145
    move/from16 v13, v16

    .line 146
    .line 147
    goto :goto_a

    .line 148
    :cond_c
    move v13, v15

    .line 149
    :goto_a
    and-int/lit8 v14, v3, 0x1

    .line 150
    .line 151
    invoke-interface {v8, v13, v14}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 152
    .line 153
    .line 154
    move-result v13

    .line 155
    if-eqz v13, :cond_12

    .line 156
    .line 157
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 158
    .line 159
    .line 160
    move-result v13

    .line 161
    if-eqz v13, :cond_d

    .line 162
    .line 163
    const/4 v13, -0x1

    .line 164
    const-string v14, "androidx.compose.animation.AnimatedVisibilityImpl (AnimatedVisibility.kt:677)"

    .line 165
    .line 166
    invoke-static {v2, v3, v13, v14}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 167
    .line 168
    .line 169
    :cond_d
    and-int/lit8 v2, v3, 0x70

    .line 170
    .line 171
    if-ne v2, v6, :cond_e

    .line 172
    .line 173
    move/from16 v6, v16

    .line 174
    .line 175
    goto :goto_b

    .line 176
    :cond_e
    move v6, v15

    .line 177
    :goto_b
    and-int/lit8 v13, v3, 0xe

    .line 178
    .line 179
    if-ne v13, v4, :cond_f

    .line 180
    .line 181
    move/from16 v15, v16

    .line 182
    .line 183
    :cond_f
    or-int v4, v6, v15

    .line 184
    .line 185
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v6

    .line 189
    if-nez v4, :cond_10

    .line 190
    .line 191
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 192
    .line 193
    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v4

    .line 197
    if-ne v6, v4, :cond_11

    .line 198
    .line 199
    :cond_10
    new-instance v6, Landroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1;

    .line 200
    .line 201
    invoke-direct {v6, v1, v0}, Landroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1;-><init>(Lhd/l;Landroidx/compose/animation/core/Transition;)V

    .line 202
    .line 203
    .line 204
    invoke-interface {v8, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    :cond_11
    check-cast v6, Lhd/q;

    .line 208
    .line 209
    invoke-static {v11, v6}, Landroidx/compose/ui/layout/LayoutModifierKt;->layout(Landroidx/compose/ui/Modifier;Lhd/q;)Landroidx/compose/ui/Modifier;

    .line 210
    .line 211
    .line 212
    move-result-object v4

    .line 213
    sget-object v5, Landroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibilityImpl$2;->INSTANCE:Landroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibilityImpl$2;

    .line 214
    .line 215
    or-int v6, v13, v9

    .line 216
    .line 217
    or-int/2addr v2, v6

    .line 218
    and-int/lit16 v6, v3, 0x1c00

    .line 219
    .line 220
    or-int/2addr v2, v6

    .line 221
    const v6, 0xe000

    .line 222
    .line 223
    .line 224
    and-int/2addr v6, v3

    .line 225
    or-int/2addr v2, v6

    .line 226
    const/high16 v6, 0x1c00000

    .line 227
    .line 228
    shl-int/lit8 v3, v3, 0x6

    .line 229
    .line 230
    and-int/2addr v3, v6

    .line 231
    or-int v9, v2, v3

    .line 232
    .line 233
    const/16 v10, 0x40

    .line 234
    .line 235
    const/4 v6, 0x0

    .line 236
    move-object/from16 v3, p3

    .line 237
    .line 238
    move-object v2, v4

    .line 239
    move-object v4, v7

    .line 240
    move-object/from16 v7, p5

    .line 241
    .line 242
    invoke-static/range {v0 .. v10}, Landroidx/compose/animation/AnimatedVisibilityKt;->AnimatedEnterExitImpl(Landroidx/compose/animation/core/Transition;Lhd/l;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lhd/p;Landroidx/compose/animation/OnLookaheadMeasured;Lhd/q;Landroidx/compose/runtime/Composer;II)V

    .line 243
    .line 244
    .line 245
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 246
    .line 247
    .line 248
    move-result v0

    .line 249
    if-eqz v0, :cond_13

    .line 250
    .line 251
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 252
    .line 253
    .line 254
    goto :goto_c

    .line 255
    :cond_12
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 256
    .line 257
    .line 258
    :cond_13
    :goto_c
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 259
    .line 260
    .line 261
    move-result-object v8

    .line 262
    if-eqz v8, :cond_14

    .line 263
    .line 264
    new-instance v0, Landroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibilityImpl$3;

    .line 265
    .line 266
    move-object/from16 v1, p0

    .line 267
    .line 268
    move-object/from16 v2, p1

    .line 269
    .line 270
    move-object/from16 v4, p3

    .line 271
    .line 272
    move-object/from16 v5, p4

    .line 273
    .line 274
    move-object/from16 v6, p5

    .line 275
    .line 276
    move-object v3, v11

    .line 277
    move v7, v12

    .line 278
    invoke-direct/range {v0 .. v7}, Landroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibilityImpl$3;-><init>(Landroidx/compose/animation/core/Transition;Lhd/l;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Lhd/q;I)V

    .line 279
    .line 280
    .line 281
    invoke-interface {v8, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lhd/p;)V

    .line 282
    .line 283
    .line 284
    :cond_14
    return-void
.end method

.method public static final synthetic access$AnimatedEnterExitImpl$lambda$2(Landroidx/compose/runtime/State;)Lhd/p;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/compose/animation/AnimatedVisibilityKt;->AnimatedEnterExitImpl$lambda$2(Landroidx/compose/runtime/State;)Lhd/p;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getExitFinished(Landroidx/compose/animation/core/Transition;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/compose/animation/AnimatedVisibilityKt;->getExitFinished(Landroidx/compose/animation/core/Transition;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final getExitFinished(Landroidx/compose/animation/core/Transition;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/animation/core/Transition<",
            "Landroidx/compose/animation/EnterExitState;",
            ">;)Z"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/compose/animation/core/Transition;->getCurrentState()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Landroidx/compose/animation/EnterExitState;->PostExit:Landroidx/compose/animation/EnterExitState;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/compose/animation/core/Transition;->getTargetState()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-ne p0, v1, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method private static final targetEnterExit(Landroidx/compose/animation/core/Transition;Lhd/l;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/animation/EnterExitState;
    .locals 3
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/animation/core/Transition<",
            "TT;>;",
            "Lhd/l;",
            "TT;",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Landroidx/compose/animation/EnterExitState;"
        }
    .end annotation

    .line 1
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    const-string v1, "androidx.compose.animation.targetEnterExit (AnimatedVisibility.kt:836)"

    .line 9
    .line 10
    const v2, 0x158d233e

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p4, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    const p4, -0x35c3ee3d

    .line 17
    .line 18
    .line 19
    invoke-interface {p3, p4, p0}, Landroidx/compose/runtime/Composer;->startMovableGroup(ILjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroidx/compose/animation/core/Transition;->isSeeking()Z

    .line 23
    .line 24
    .line 25
    move-result p4

    .line 26
    if-eqz p4, :cond_3

    .line 27
    .line 28
    const p4, 0x7d467783

    .line 29
    .line 30
    .line 31
    invoke-interface {p3, p4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 32
    .line 33
    .line 34
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 35
    .line 36
    .line 37
    invoke-interface {p1, p2}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    check-cast p2, Ljava/lang/Boolean;

    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    if-eqz p2, :cond_1

    .line 48
    .line 49
    sget-object p0, Landroidx/compose/animation/EnterExitState;->Visible:Landroidx/compose/animation/EnterExitState;

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    invoke-virtual {p0}, Landroidx/compose/animation/core/Transition;->getCurrentState()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-interface {p1, p0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    check-cast p0, Ljava/lang/Boolean;

    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-eqz p0, :cond_2

    .line 67
    .line 68
    sget-object p0, Landroidx/compose/animation/EnterExitState;->PostExit:Landroidx/compose/animation/EnterExitState;

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    sget-object p0, Landroidx/compose/animation/EnterExitState;->PreEnter:Landroidx/compose/animation/EnterExitState;

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    const p4, 0x7d4aa658

    .line 75
    .line 76
    .line 77
    invoke-interface {p3, p4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 78
    .line 79
    .line 80
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p4

    .line 84
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 85
    .line 86
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    if-ne p4, v0, :cond_4

    .line 91
    .line 92
    sget-object p4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 93
    .line 94
    const/4 v0, 0x2

    .line 95
    const/4 v1, 0x0

    .line 96
    invoke-static {p4, v1, v0, v1}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 97
    .line 98
    .line 99
    move-result-object p4

    .line 100
    invoke-interface {p3, p4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    :cond_4
    check-cast p4, Landroidx/compose/runtime/MutableState;

    .line 104
    .line 105
    invoke-virtual {p0}, Landroidx/compose/animation/core/Transition;->getCurrentState()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-interface {p1, p0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    check-cast p0, Ljava/lang/Boolean;

    .line 114
    .line 115
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 116
    .line 117
    .line 118
    move-result p0

    .line 119
    if-eqz p0, :cond_5

    .line 120
    .line 121
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 122
    .line 123
    invoke-interface {p4, p0}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    :cond_5
    invoke-interface {p1, p2}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    check-cast p0, Ljava/lang/Boolean;

    .line 131
    .line 132
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 133
    .line 134
    .line 135
    move-result p0

    .line 136
    if-eqz p0, :cond_6

    .line 137
    .line 138
    sget-object p0, Landroidx/compose/animation/EnterExitState;->Visible:Landroidx/compose/animation/EnterExitState;

    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_6
    invoke-interface {p4}, Landroidx/compose/runtime/MutableState;->getValue()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    check-cast p0, Ljava/lang/Boolean;

    .line 146
    .line 147
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 148
    .line 149
    .line 150
    move-result p0

    .line 151
    if-eqz p0, :cond_7

    .line 152
    .line 153
    sget-object p0, Landroidx/compose/animation/EnterExitState;->PostExit:Landroidx/compose/animation/EnterExitState;

    .line 154
    .line 155
    goto :goto_0

    .line 156
    :cond_7
    sget-object p0, Landroidx/compose/animation/EnterExitState;->PreEnter:Landroidx/compose/animation/EnterExitState;

    .line 157
    .line 158
    :goto_0
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 159
    .line 160
    .line 161
    :goto_1
    invoke-interface {p3}, Landroidx/compose/runtime/Composer;->endMovableGroup()V

    .line 162
    .line 163
    .line 164
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    if-eqz p1, :cond_8

    .line 169
    .line 170
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 171
    .line 172
    .line 173
    :cond_8
    return-object p0
.end method
