.class public abstract Lcom/zykj/mistake/feature/collection/component/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/lang/String;JJFFZLr6/a;Landroidx/compose/runtime/Composer;II)V
    .locals 36

    move-wide/from16 v2, p1

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v10, p10

    const v0, 0x3e2edc8e

    move-object/from16 v1, p9

    .line 1
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v1

    and-int/lit8 v4, v10, 0x6

    move-object/from16 v11, p0

    if-nez v4, :cond_1

    invoke-interface {v1, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v10

    goto :goto_1

    :cond_1
    move v4, v10

    :goto_1
    and-int/lit8 v8, v10, 0x30

    if-nez v8, :cond_3

    invoke-interface {v1, v2, v3}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v8

    if-eqz v8, :cond_2

    const/16 v8, 0x20

    goto :goto_2

    :cond_2
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v4, v8

    :cond_3
    and-int/lit16 v8, v10, 0x180

    move-wide/from16 v13, p3

    if-nez v8, :cond_5

    invoke-interface {v1, v13, v14}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x100

    goto :goto_3

    :cond_4
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v4, v8

    :cond_5
    and-int/lit16 v8, v10, 0xc00

    if-nez v8, :cond_7

    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x800

    goto :goto_4

    :cond_6
    const/16 v8, 0x400

    :goto_4
    or-int/2addr v4, v8

    :cond_7
    and-int/lit16 v8, v10, 0x6000

    if-nez v8, :cond_9

    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x4000

    goto :goto_5

    :cond_8
    const/16 v8, 0x2000

    :goto_5
    or-int/2addr v4, v8

    :cond_9
    and-int/lit8 v8, p11, 0x20

    const/high16 v9, 0x30000

    if-eqz v8, :cond_b

    or-int/2addr v4, v9

    :cond_a
    move/from16 v9, p7

    goto :goto_7

    :cond_b
    and-int/2addr v9, v10

    if-nez v9, :cond_a

    move/from16 v9, p7

    invoke-interface {v1, v9}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v12

    if-eqz v12, :cond_c

    const/high16 v12, 0x20000

    goto :goto_6

    :cond_c
    const/high16 v12, 0x10000

    :goto_6
    or-int/2addr v4, v12

    :goto_7
    const/high16 v12, 0x180000

    and-int/2addr v12, v10

    if-nez v12, :cond_e

    move-object/from16 v12, p8

    invoke-interface {v1, v12}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_d

    const/high16 v15, 0x100000

    goto :goto_8

    :cond_d
    const/high16 v15, 0x80000

    :goto_8
    or-int/2addr v4, v15

    goto :goto_9

    :cond_e
    move-object/from16 v12, p8

    :goto_9
    const v15, 0x92493

    and-int/2addr v15, v4

    const v5, 0x92492

    const/4 v0, 0x0

    const/16 v17, 0x1

    if-eq v15, v5, :cond_f

    move/from16 v5, v17

    goto :goto_a

    :cond_f
    move v5, v0

    :goto_a
    and-int/lit8 v15, v4, 0x1

    invoke-interface {v1, v5, v15}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v5

    if-eqz v5, :cond_18

    if-eqz v8, :cond_10

    move/from16 v16, v17

    :goto_b
    const v5, 0x3e2edc8e

    goto :goto_c

    :cond_10
    move/from16 v16, v9

    goto :goto_b

    .line 2
    :goto_c
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v8

    if-eqz v8, :cond_11

    const/4 v8, -0x1

    const-string v9, "com.zykj.mistake.feature.collection.component.MistakeCollectionDialogActionButton (MistakeCollectionNameDialog.kt:248)"

    invoke-static {v5, v4, v8, v9}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 3
    :cond_11
    sget-object v5, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 4
    invoke-static {v5, v6}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v5

    .line 5
    invoke-static {v5, v7}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v5

    if-eqz v16, :cond_12

    const/high16 v8, 0x3f800000    # 1.0f

    goto :goto_d

    :cond_12
    const v8, 0x3f266666    # 0.65f

    .line 6
    :goto_d
    invoke-static {v5, v8}, Landroidx/compose/ui/draw/AlphaKt;->alpha(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/4 v8, 0x4

    int-to-float v8, v8

    .line 7
    invoke-static {v8, v5, v2, v3}, Landroidx/compose/material3/c;->f(FLandroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;

    move-result-object v15

    const/16 v20, 0x6

    const/16 v21, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v19, v12

    .line 8
    invoke-static/range {v15 .. v21}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lr6/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move/from16 v9, v16

    .line 9
    sget-object v8, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v8}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    move-result-object v8

    .line 10
    invoke-static {v8, v0}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v8

    .line 11
    invoke-static {v1, v0}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v0

    .line 12
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v12

    .line 13
    invoke-static {v1, v5}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    .line 14
    sget-object v15, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    move-result-object v2

    .line 15
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v3

    if-nez v3, :cond_13

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 16
    :cond_13
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 17
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v3

    if-eqz v3, :cond_14

    .line 18
    invoke-interface {v1, v2}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    goto :goto_e

    .line 19
    :cond_14
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 20
    :goto_e
    invoke-static {v1}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v2

    .line 21
    invoke-static {v15, v2, v8, v2, v12}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    move-result-object v3

    .line 22
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v8

    if-nez v8, :cond_15

    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v8, v12}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_16

    .line 23
    :cond_15
    invoke-static {v0, v2, v0, v3}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 24
    :cond_16
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    move-result-object v0

    invoke-static {v2, v5, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 25
    sget-object v0, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    const/16 v0, 0xf

    .line 26
    invoke-static {v0}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    move-result-wide v15

    and-int/lit8 v0, v4, 0xe

    or-int/lit16 v0, v0, 0xc00

    and-int/lit16 v2, v4, 0x380

    or-int v33, v0, v2

    const/16 v34, 0x0

    const v35, 0x1fff2

    const/4 v12, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    move-object/from16 v32, v1

    .line 27
    invoke-static/range {v11 .. v35}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 28
    invoke-interface/range {v32 .. v32}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 29
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_17

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_17
    :goto_f
    move v8, v9

    goto :goto_10

    :cond_18
    move-object/from16 v32, v1

    .line 30
    invoke-interface/range {v32 .. v32}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto :goto_f

    .line 31
    :goto_10
    invoke-interface/range {v32 .. v32}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v12

    if-eqz v12, :cond_19

    new-instance v0, Lcom/zykj/mistake/feature/collection/component/c;

    move-object/from16 v1, p0

    move-wide/from16 v2, p1

    move-wide/from16 v4, p3

    move-object/from16 v9, p8

    move/from16 v11, p11

    invoke-direct/range {v0 .. v11}, Lcom/zykj/mistake/feature/collection/component/c;-><init>(Ljava/lang/String;JJFFZLr6/a;II)V

    invoke-interface {v12, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    :cond_19
    return-void
.end method

.method public static final b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLr6/c;Lr6/a;Lr6/a;Landroidx/compose/runtime/Composer;III)V
    .locals 30

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v11, p10

    move-object/from16 v0, p11

    move-object/from16 v13, p12

    move/from16 v6, p14

    move/from16 v7, p15

    move/from16 v8, p16

    const-string v9, "title"

    invoke-static {v1, v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "name"

    invoke-static {v2, v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "error"

    invoke-static {v3, v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "confirmText"

    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "confirmingText"

    invoke-static {v5, v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "onNameChange"

    invoke-static {v11, v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "onDismiss"

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "onConfirm"

    invoke-static {v13, v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const v9, -0x55dc8879

    move-object/from16 v10, p13

    .line 1
    invoke-interface {v10, v9}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v10

    and-int/lit8 v12, v6, 0x6

    if-nez v12, :cond_1

    invoke-interface {v10, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_0

    const/4 v12, 0x4

    goto :goto_0

    :cond_0
    const/4 v12, 0x2

    :goto_0
    or-int/2addr v12, v6

    goto :goto_1

    :cond_1
    move v12, v6

    :goto_1
    and-int/lit8 v16, v6, 0x30

    const/16 v17, 0x10

    const/16 v18, 0x20

    if-nez v16, :cond_3

    invoke-interface {v10, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_2

    move/from16 v16, v18

    goto :goto_2

    :cond_2
    move/from16 v16, v17

    :goto_2
    or-int v12, v12, v16

    :cond_3
    and-int/lit16 v14, v6, 0x180

    const/16 v16, 0x80

    const/16 v19, 0x100

    if-nez v14, :cond_5

    invoke-interface {v10, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_4

    move/from16 v14, v19

    goto :goto_3

    :cond_4
    move/from16 v14, v16

    :goto_3
    or-int/2addr v12, v14

    :cond_5
    and-int/lit16 v14, v6, 0xc00

    if-nez v14, :cond_7

    invoke-interface {v10, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_6

    const/16 v14, 0x800

    goto :goto_4

    :cond_6
    const/16 v14, 0x400

    :goto_4
    or-int/2addr v12, v14

    :cond_7
    and-int/lit16 v14, v6, 0x6000

    if-nez v14, :cond_9

    invoke-interface {v10, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_8

    const/16 v14, 0x4000

    goto :goto_5

    :cond_8
    const/16 v14, 0x2000

    :goto_5
    or-int/2addr v12, v14

    :cond_9
    const/high16 v14, 0x30000

    and-int/2addr v14, v6

    if-nez v14, :cond_b

    move/from16 v14, p5

    invoke-interface {v10, v14}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v20

    if-eqz v20, :cond_a

    const/high16 v20, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v20, 0x10000

    :goto_6
    or-int v12, v12, v20

    goto :goto_7

    :cond_b
    move/from16 v14, p5

    :goto_7
    and-int/lit8 v20, v8, 0x40

    const/high16 v21, 0x180000

    if-eqz v20, :cond_c

    or-int v12, v12, v21

    move-object/from16 v15, p6

    goto :goto_9

    :cond_c
    and-int v21, v6, v21

    move-object/from16 v15, p6

    if-nez v21, :cond_e

    invoke-interface {v10, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_d

    const/high16 v22, 0x100000

    goto :goto_8

    :cond_d
    const/high16 v22, 0x80000

    :goto_8
    or-int v12, v12, v22

    :cond_e
    :goto_9
    and-int/lit16 v9, v8, 0x80

    const/high16 v23, 0xc00000

    if-eqz v9, :cond_f

    or-int v12, v12, v23

    move-object/from16 v1, p7

    goto :goto_b

    :cond_f
    and-int v23, v6, v23

    move-object/from16 v1, p7

    if-nez v23, :cond_11

    invoke-interface {v10, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_10

    const/high16 v23, 0x800000

    goto :goto_a

    :cond_10
    const/high16 v23, 0x400000

    :goto_a
    or-int v12, v12, v23

    :cond_11
    :goto_b
    and-int/lit16 v1, v8, 0x100

    const/high16 v23, 0x6000000

    if-eqz v1, :cond_13

    or-int v12, v12, v23

    :cond_12
    move/from16 v23, v1

    move-object/from16 v1, p8

    goto :goto_d

    :cond_13
    and-int v23, v6, v23

    if-nez v23, :cond_12

    move/from16 v23, v1

    move-object/from16 v1, p8

    invoke-interface {v10, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_14

    const/high16 v24, 0x4000000

    goto :goto_c

    :cond_14
    const/high16 v24, 0x2000000

    :goto_c
    or-int v12, v12, v24

    :goto_d
    and-int/lit16 v1, v8, 0x200

    const/high16 v24, 0x30000000

    if-eqz v1, :cond_16

    or-int v12, v12, v24

    :cond_15
    move/from16 v24, v1

    move/from16 v1, p9

    goto :goto_f

    :cond_16
    and-int v24, v6, v24

    if-nez v24, :cond_15

    move/from16 v24, v1

    move/from16 v1, p9

    invoke-interface {v10, v1}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v25

    if-eqz v25, :cond_17

    const/high16 v25, 0x20000000

    goto :goto_e

    :cond_17
    const/high16 v25, 0x10000000

    :goto_e
    or-int v12, v12, v25

    :goto_f
    and-int/lit8 v25, v7, 0x6

    if-nez v25, :cond_19

    invoke-interface {v10, v11}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_18

    const/16 v21, 0x4

    goto :goto_10

    :cond_18
    const/16 v21, 0x2

    :goto_10
    or-int v21, v7, v21

    goto :goto_11

    :cond_19
    move/from16 v21, v7

    :goto_11
    and-int/lit8 v25, v7, 0x30

    if-nez v25, :cond_1b

    invoke-interface {v10, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_1a

    move/from16 v17, v18

    :cond_1a
    or-int v21, v21, v17

    :cond_1b
    and-int/lit16 v0, v7, 0x180

    if-nez v0, :cond_1d

    invoke-interface {v10, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1c

    move/from16 v16, v19

    :cond_1c
    or-int v21, v21, v16

    :cond_1d
    move/from16 v0, v21

    const v16, 0x12492493

    and-int v1, v12, v16

    const v2, 0x12492492

    const/16 v16, 0x0

    if-ne v1, v2, :cond_1f

    and-int/lit16 v1, v0, 0x93

    const/16 v2, 0x92

    if-eq v1, v2, :cond_1e

    goto :goto_12

    :cond_1e
    move/from16 v1, v16

    goto :goto_13

    :cond_1f
    :goto_12
    const/4 v1, 0x1

    :goto_13
    and-int/lit8 v2, v12, 0x1

    invoke-interface {v10, v1, v2}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v1

    if-eqz v1, :cond_30

    if-eqz v20, :cond_20

    const/4 v15, 0x0

    :cond_20
    if-eqz v9, :cond_21

    .line 2
    const-string v2, "\u9519\u9898\u96c6\u540d\u79f0"

    move-object v8, v2

    goto :goto_14

    :cond_21
    move-object/from16 v8, p7

    :goto_14
    move/from16 v2, v16

    if-eqz v23, :cond_22

    const/16 v16, 0x0

    goto :goto_15

    :cond_22
    move-object/from16 v16, p8

    :goto_15
    if-eqz v24, :cond_23

    move v5, v2

    goto :goto_16

    :cond_23
    move/from16 v5, p9

    .line 3
    :goto_16
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_24

    const-string v2, "com.zykj.mistake.feature.collection.component.MistakeCollectionNameDialog (MistakeCollectionNameDialog.kt:55)"

    const v9, -0x55dc8879

    invoke-static {v9, v12, v0, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 4
    :cond_24
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    .line 5
    sget-object v9, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v9}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v12

    if-ne v2, v12, :cond_25

    .line 6
    new-instance v2, Landroidx/compose/ui/focus/FocusRequester;

    invoke-direct {v2}, Landroidx/compose/ui/focus/FocusRequester;-><init>()V

    .line 7
    invoke-interface {v10, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 8
    :cond_25
    check-cast v2, Landroidx/compose/ui/focus/FocusRequester;

    .line 9
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalSoftwareKeyboardController()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v12

    .line 10
    invoke-interface {v10, v12}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v12

    .line 11
    check-cast v12, Landroidx/compose/ui/platform/SoftwareKeyboardController;

    if-eqz v5, :cond_26

    const/16 v3, 0x171

    :goto_17
    int-to-float v3, v3

    .line 12
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v3

    goto :goto_18

    :cond_26
    const/16 v3, 0x1c2

    goto :goto_17

    :goto_18
    const/16 v1, 0x23

    move/from16 v18, v0

    if-eqz v5, :cond_27

    int-to-float v0, v1

    .line 13
    :goto_19
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    goto :goto_1a

    :cond_27
    const/16 v0, 0x24

    int-to-float v0, v0

    goto :goto_19

    :goto_1a
    const/16 v1, 0x1a

    int-to-float v1, v1

    .line 14
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    move/from16 p7, v0

    if-eqz v5, :cond_28

    move/from16 p9, v1

    const/16 v0, 0x23

    int-to-float v1, v0

    .line 15
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    move v0, v1

    goto :goto_1b

    :cond_28
    move/from16 p9, v1

    const/16 v1, 0x18

    int-to-float v0, v1

    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    :goto_1b
    if-eqz v5, :cond_2a

    .line 16
    invoke-static/range {p2 .. p2}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    move-result v19

    if-eqz v19, :cond_29

    move/from16 v20, v0

    const/16 v1, 0x23

    :goto_1c
    int-to-float v0, v1

    .line 17
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    goto :goto_1d

    :cond_29
    move/from16 v20, v0

    const/16 v1, 0x18

    goto :goto_1c

    :cond_2a
    move/from16 v20, v0

    .line 18
    invoke-static/range {p2 .. p2}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2b

    const/16 v0, 0x1c

    int-to-float v1, v0

    .line 19
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    goto :goto_1d

    :cond_2b
    const/16 v0, 0x12

    int-to-float v0, v0

    .line 20
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    :goto_1d
    const/16 v1, 0x66

    int-to-float v1, v1

    .line 21
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    move/from16 p8, v0

    const/16 v0, 0x2a

    int-to-float v0, v0

    move-object/from16 v21, v9

    move/from16 v9, v20

    .line 22
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v20

    if-eqz v5, :cond_2c

    move/from16 v22, v0

    const/16 v0, 0x23

    :goto_1e
    int-to-float v0, v0

    .line 23
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    goto :goto_1f

    :cond_2c
    move/from16 v22, v0

    const/16 v0, 0x1c

    goto :goto_1e

    .line 24
    :goto_1f
    invoke-static/range {v22 .. v22}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v19

    move/from16 v22, v0

    const/16 v0, 0xa

    int-to-float v0, v0

    .line 25
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    const/16 v23, 0xf

    .line 26
    invoke-static/range {v23 .. v23}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    move-result-wide v23

    .line 27
    invoke-interface {v10, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v25

    move/from16 p6, v0

    .line 28
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    if-nez v25, :cond_2d

    move/from16 v25, v1

    .line 29
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_2e

    goto :goto_20

    :cond_2d
    move/from16 v25, v1

    .line 30
    :goto_20
    new-instance v0, Lcom/zykj/mistake/feature/collection/component/MistakeCollectionNameDialogKt$MistakeCollectionNameDialog$1$1;

    const/4 v1, 0x0

    invoke-direct {v0, v2, v12, v1}, Lcom/zykj/mistake/feature/collection/component/MistakeCollectionNameDialogKt$MistakeCollectionNameDialog$1$1;-><init>(Landroidx/compose/ui/focus/FocusRequester;Landroidx/compose/ui/platform/SoftwareKeyboardController;Lh6/c;)V

    .line 31
    invoke-interface {v10, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 32
    :cond_2e
    check-cast v0, Lr6/e;

    sget-object v1, Ld6/s;->a:Ld6/s;

    const/4 v12, 0x6

    invoke-static {v1, v0, v10, v12}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lr6/e;Landroidx/compose/runtime/Composer;I)V

    .line 33
    new-instance v0, Lcom/zykj/mistake/feature/collection/component/d;

    move-object/from16 v12, p2

    move-object/from16 v21, p11

    move-object/from16 v17, v2

    move v1, v3

    move-object/from16 v27, v10

    move-object/from16 v26, v13

    move/from16 v28, v18

    move/from16 v10, v19

    move-wide/from16 v6, v23

    move/from16 v19, v25

    move-object/from16 v24, p4

    move/from16 v2, p7

    move/from16 v13, p8

    move/from16 v3, p9

    move-object/from16 v25, v4

    move-object/from16 v18, v11

    move/from16 v23, v14

    move-object/from16 v4, p0

    move-object/from16 v14, p1

    move/from16 v11, p6

    invoke-direct/range {v0 .. v26}, Lcom/zykj/mistake/feature/collection/component/d;-><init>(FFFLjava/lang/String;ZJLjava/lang/String;FFFLjava/lang/String;FLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Landroidx/compose/ui/focus/FocusRequester;Lr6/c;FFLr6/a;FZLjava/lang/String;Ljava/lang/String;Lr6/a;)V

    move v6, v5

    const/16 v1, 0x36

    const v2, -0x6ae145e2

    move-object/from16 v3, v27

    const/4 v4, 0x1

    invoke-static {v2, v4, v0, v3, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v2

    shr-int/lit8 v0, v28, 0x3

    and-int/lit8 v0, v0, 0xe

    or-int/lit16 v4, v0, 0x180

    const/4 v5, 0x2

    const/4 v1, 0x0

    move-object/from16 v0, p11

    invoke-static/range {v0 .. v5}, Landroidx/compose/ui/window/AndroidDialog_androidKt;->Dialog(Lr6/a;Landroidx/compose/ui/window/DialogProperties;Lr6/e;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2f

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_2f
    move v10, v6

    move-object/from16 v9, v16

    :goto_21
    move-object v7, v15

    goto :goto_22

    :cond_30
    move-object v3, v10

    .line 34
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    goto :goto_21

    .line 35
    :goto_22
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_31

    move-object v1, v0

    new-instance v0, Lcom/zykj/mistake/feature/collection/component/e;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v14, p14

    move/from16 v15, p15

    move/from16 v16, p16

    move-object/from16 v29, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v16}, Lcom/zykj/mistake/feature/collection/component/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLr6/c;Lr6/a;Lr6/a;III)V

    move-object/from16 v1, v29

    invoke-interface {v1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    :cond_31
    return-void
.end method

.method public static final c(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Landroidx/compose/ui/focus/FocusRequester;JLr6/c;Landroidx/compose/runtime/Composer;I)V
    .locals 44

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move-wide/from16 v7, p4

    .line 10
    .line 11
    move-object/from16 v4, p6

    .line 12
    .line 13
    move/from16 v5, p8

    .line 14
    .line 15
    const v6, 0x2133203b

    .line 16
    .line 17
    .line 18
    move-object/from16 v9, p7

    .line 19
    .line 20
    invoke-interface {v9, v6}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 21
    .line 22
    .line 23
    move-result-object v9

    .line 24
    and-int/lit8 v10, v5, 0x6

    .line 25
    .line 26
    if-nez v10, :cond_1

    .line 27
    .line 28
    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v10

    .line 32
    if-eqz v10, :cond_0

    .line 33
    .line 34
    const/4 v10, 0x4

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v10, 0x2

    .line 37
    :goto_0
    or-int/2addr v10, v5

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move v10, v5

    .line 40
    :goto_1
    and-int/lit8 v11, v5, 0x30

    .line 41
    .line 42
    const/16 v12, 0x20

    .line 43
    .line 44
    if-nez v11, :cond_3

    .line 45
    .line 46
    invoke-interface {v9, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v11

    .line 50
    if-eqz v11, :cond_2

    .line 51
    .line 52
    move v11, v12

    .line 53
    goto :goto_2

    .line 54
    :cond_2
    const/16 v11, 0x10

    .line 55
    .line 56
    :goto_2
    or-int/2addr v10, v11

    .line 57
    :cond_3
    and-int/lit16 v11, v5, 0x180

    .line 58
    .line 59
    if-nez v11, :cond_5

    .line 60
    .line 61
    invoke-interface {v9, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    if-eqz v11, :cond_4

    .line 66
    .line 67
    const/16 v11, 0x100

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_4
    const/16 v11, 0x80

    .line 71
    .line 72
    :goto_3
    or-int/2addr v10, v11

    .line 73
    :cond_5
    and-int/lit16 v11, v5, 0xc00

    .line 74
    .line 75
    if-nez v11, :cond_7

    .line 76
    .line 77
    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v11

    .line 81
    if-eqz v11, :cond_6

    .line 82
    .line 83
    const/16 v11, 0x800

    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_6
    const/16 v11, 0x400

    .line 87
    .line 88
    :goto_4
    or-int/2addr v10, v11

    .line 89
    :cond_7
    and-int/lit16 v11, v5, 0x6000

    .line 90
    .line 91
    if-nez v11, :cond_9

    .line 92
    .line 93
    invoke-interface {v9, v7, v8}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 94
    .line 95
    .line 96
    move-result v11

    .line 97
    if-eqz v11, :cond_8

    .line 98
    .line 99
    const/16 v11, 0x4000

    .line 100
    .line 101
    goto :goto_5

    .line 102
    :cond_8
    const/16 v11, 0x2000

    .line 103
    .line 104
    :goto_5
    or-int/2addr v10, v11

    .line 105
    :cond_9
    const/high16 v11, 0x30000

    .line 106
    .line 107
    and-int/2addr v11, v5

    .line 108
    const/high16 v13, 0x20000

    .line 109
    .line 110
    if-nez v11, :cond_b

    .line 111
    .line 112
    invoke-interface {v9, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v11

    .line 116
    if-eqz v11, :cond_a

    .line 117
    .line 118
    move v11, v13

    .line 119
    goto :goto_6

    .line 120
    :cond_a
    const/high16 v11, 0x10000

    .line 121
    .line 122
    :goto_6
    or-int/2addr v10, v11

    .line 123
    :cond_b
    const v11, 0x12493

    .line 124
    .line 125
    .line 126
    and-int/2addr v11, v10

    .line 127
    const v14, 0x12492

    .line 128
    .line 129
    .line 130
    const/16 v36, 0x0

    .line 131
    .line 132
    const/4 v15, 0x1

    .line 133
    if-eq v11, v14, :cond_c

    .line 134
    .line 135
    move v11, v15

    .line 136
    goto :goto_7

    .line 137
    :cond_c
    move/from16 v11, v36

    .line 138
    .line 139
    :goto_7
    and-int/lit8 v14, v10, 0x1

    .line 140
    .line 141
    invoke-interface {v9, v11, v14}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 142
    .line 143
    .line 144
    move-result v11

    .line 145
    if-eqz v11, :cond_12

    .line 146
    .line 147
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 148
    .line 149
    .line 150
    move-result v11

    .line 151
    if-eqz v11, :cond_d

    .line 152
    .line 153
    const/4 v11, -0x1

    .line 154
    const-string v14, "com.zykj.mistake.feature.collection.component.NameInputField (MistakeCollectionNameDialog.kt:210)"

    .line 155
    .line 156
    invoke-static {v6, v10, v11, v14}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 157
    .line 158
    .line 159
    :cond_d
    new-instance v4, Landroidx/compose/ui/text/TextStyle;

    .line 160
    .line 161
    const-wide v16, 0xff5a5a5aL

    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    invoke-static/range {v16 .. v17}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 167
    .line 168
    .line 169
    move-result-wide v16

    .line 170
    const v34, 0xfffffc

    .line 171
    .line 172
    .line 173
    const/16 v35, 0x0

    .line 174
    .line 175
    move-object v6, v9

    .line 176
    const/4 v9, 0x0

    .line 177
    move v11, v10

    .line 178
    const/4 v10, 0x0

    .line 179
    move v14, v11

    .line 180
    const/4 v11, 0x0

    .line 181
    move/from16 v18, v12

    .line 182
    .line 183
    const/4 v12, 0x0

    .line 184
    move/from16 v19, v13

    .line 185
    .line 186
    const/4 v13, 0x0

    .line 187
    move/from16 v20, v14

    .line 188
    .line 189
    move/from16 v21, v15

    .line 190
    .line 191
    const-wide/16 v14, 0x0

    .line 192
    .line 193
    move-wide/from16 v42, v16

    .line 194
    .line 195
    move-object/from16 v17, v6

    .line 196
    .line 197
    move-wide/from16 v5, v42

    .line 198
    .line 199
    const/16 v16, 0x0

    .line 200
    .line 201
    move-object/from16 v22, v17

    .line 202
    .line 203
    const/16 v17, 0x0

    .line 204
    .line 205
    move/from16 v23, v18

    .line 206
    .line 207
    const/16 v18, 0x0

    .line 208
    .line 209
    move/from16 v25, v19

    .line 210
    .line 211
    move/from16 v24, v20

    .line 212
    .line 213
    const-wide/16 v19, 0x0

    .line 214
    .line 215
    move/from16 v26, v21

    .line 216
    .line 217
    const/16 v21, 0x0

    .line 218
    .line 219
    move-object/from16 v27, v22

    .line 220
    .line 221
    const/16 v22, 0x0

    .line 222
    .line 223
    move/from16 v28, v23

    .line 224
    .line 225
    const/16 v23, 0x0

    .line 226
    .line 227
    move/from16 v29, v24

    .line 228
    .line 229
    const/16 v24, 0x0

    .line 230
    .line 231
    move/from16 v30, v25

    .line 232
    .line 233
    const/16 v25, 0x0

    .line 234
    .line 235
    move/from16 v32, v26

    .line 236
    .line 237
    move-object/from16 v31, v27

    .line 238
    .line 239
    const-wide/16 v26, 0x0

    .line 240
    .line 241
    move/from16 v33, v28

    .line 242
    .line 243
    const/16 v28, 0x0

    .line 244
    .line 245
    move/from16 v37, v29

    .line 246
    .line 247
    const/16 v29, 0x0

    .line 248
    .line 249
    move/from16 v38, v30

    .line 250
    .line 251
    const/16 v30, 0x0

    .line 252
    .line 253
    move-object/from16 v39, v31

    .line 254
    .line 255
    const/16 v31, 0x0

    .line 256
    .line 257
    move/from16 v40, v32

    .line 258
    .line 259
    const/16 v32, 0x0

    .line 260
    .line 261
    move/from16 v41, v33

    .line 262
    .line 263
    const/16 v33, 0x0

    .line 264
    .line 265
    move/from16 v0, v40

    .line 266
    .line 267
    invoke-direct/range {v4 .. v35}, Landroidx/compose/ui/text/TextStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILkotlin/jvm/internal/e;)V

    .line 268
    .line 269
    .line 270
    move-object v6, v4

    .line 271
    move-wide v4, v7

    .line 272
    sget-object v7, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 273
    .line 274
    const/4 v8, 0x0

    .line 275
    invoke-static {v7, v8, v0, v9}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 276
    .line 277
    .line 278
    move-result-object v7

    .line 279
    invoke-static {v7, v3}, Landroidx/compose/ui/focus/FocusRequesterModifierKt;->focusRequester(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/focus/FocusRequester;)Landroidx/compose/ui/Modifier;

    .line 280
    .line 281
    .line 282
    move-result-object v7

    .line 283
    const/high16 v8, 0x70000

    .line 284
    .line 285
    and-int v8, v37, v8

    .line 286
    .line 287
    const/high16 v9, 0x20000

    .line 288
    .line 289
    if-ne v8, v9, :cond_e

    .line 290
    .line 291
    move v15, v0

    .line 292
    goto :goto_8

    .line 293
    :cond_e
    move/from16 v15, v36

    .line 294
    .line 295
    :goto_8
    and-int/lit8 v8, v37, 0x70

    .line 296
    .line 297
    const/16 v9, 0x20

    .line 298
    .line 299
    if-ne v8, v9, :cond_f

    .line 300
    .line 301
    move/from16 v36, v0

    .line 302
    .line 303
    :cond_f
    or-int v8, v15, v36

    .line 304
    .line 305
    invoke-interface/range {v39 .. v39}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v9

    .line 309
    if-nez v8, :cond_11

    .line 310
    .line 311
    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 312
    .line 313
    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v8

    .line 317
    if-ne v9, v8, :cond_10

    .line 318
    .line 319
    goto :goto_9

    .line 320
    :cond_10
    move-object/from16 v10, p6

    .line 321
    .line 322
    move-object/from16 v8, v39

    .line 323
    .line 324
    goto :goto_a

    .line 325
    :cond_11
    :goto_9
    new-instance v9, Landroidx/navigation/d;

    .line 326
    .line 327
    const/4 v8, 0x5

    .line 328
    move-object/from16 v10, p6

    .line 329
    .line 330
    invoke-direct {v9, v8, v10, v1}, Landroidx/navigation/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 331
    .line 332
    .line 333
    move-object/from16 v8, v39

    .line 334
    .line 335
    invoke-interface {v8, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 336
    .line 337
    .line 338
    :goto_a
    check-cast v9, Lr6/c;

    .line 339
    .line 340
    new-instance v11, Lcom/zykj/mistake/feature/collection/component/a;

    .line 341
    .line 342
    move-object/from16 v12, p0

    .line 343
    .line 344
    invoke-direct {v11, v12, v2, v4, v5}, Lcom/zykj/mistake/feature/collection/component/a;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    .line 345
    .line 346
    .line 347
    const/16 v13, 0x36

    .line 348
    .line 349
    const v14, 0x603d5cb8

    .line 350
    .line 351
    .line 352
    invoke-static {v14, v0, v11, v8, v13}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 353
    .line 354
    .line 355
    move-result-object v15

    .line 356
    and-int/lit8 v0, v37, 0xe

    .line 357
    .line 358
    const/high16 v11, 0x6000000

    .line 359
    .line 360
    or-int v17, v0, v11

    .line 361
    .line 362
    const/high16 v18, 0x30000

    .line 363
    .line 364
    const/16 v19, 0x7ed8

    .line 365
    .line 366
    const/4 v3, 0x0

    .line 367
    const/4 v4, 0x0

    .line 368
    move-object v5, v6

    .line 369
    const/4 v6, 0x0

    .line 370
    move-object v2, v7

    .line 371
    const/4 v7, 0x0

    .line 372
    move-object/from16 v39, v8

    .line 373
    .line 374
    const/4 v8, 0x1

    .line 375
    move-object v1, v9

    .line 376
    const/4 v9, 0x0

    .line 377
    const/4 v10, 0x0

    .line 378
    const/4 v11, 0x0

    .line 379
    const/4 v12, 0x0

    .line 380
    const/4 v13, 0x0

    .line 381
    const/4 v14, 0x0

    .line 382
    move-object/from16 v0, p0

    .line 383
    .line 384
    move-object/from16 v16, v39

    .line 385
    .line 386
    invoke-static/range {v0 .. v19}, Landroidx/compose/foundation/text/BasicTextFieldKt;->BasicTextField(Ljava/lang/String;Lr6/c;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lr6/c;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lr6/f;Landroidx/compose/runtime/Composer;III)V

    .line 387
    .line 388
    .line 389
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 390
    .line 391
    .line 392
    move-result v0

    .line 393
    if-eqz v0, :cond_13

    .line 394
    .line 395
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 396
    .line 397
    .line 398
    goto :goto_b

    .line 399
    :cond_12
    move-object/from16 v39, v9

    .line 400
    .line 401
    invoke-interface/range {v39 .. v39}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 402
    .line 403
    .line 404
    :cond_13
    :goto_b
    invoke-interface/range {v39 .. v39}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 405
    .line 406
    .line 407
    move-result-object v9

    .line 408
    if-eqz v9, :cond_14

    .line 409
    .line 410
    new-instance v0, Lcom/zykj/mistake/feature/collection/component/b;

    .line 411
    .line 412
    move-object/from16 v1, p0

    .line 413
    .line 414
    move-object/from16 v2, p1

    .line 415
    .line 416
    move-object/from16 v3, p2

    .line 417
    .line 418
    move-object/from16 v4, p3

    .line 419
    .line 420
    move-wide/from16 v5, p4

    .line 421
    .line 422
    move-object/from16 v7, p6

    .line 423
    .line 424
    move/from16 v8, p8

    .line 425
    .line 426
    invoke-direct/range {v0 .. v8}, Lcom/zykj/mistake/feature/collection/component/b;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Landroidx/compose/ui/focus/FocusRequester;JLr6/c;I)V

    .line 427
    .line 428
    .line 429
    invoke-interface {v9, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 430
    .line 431
    .line 432
    :cond_14
    return-void
.end method
