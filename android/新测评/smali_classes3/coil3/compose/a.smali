.class public abstract Lcoil3/compose/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Lm/b;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;IZIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p14}, Lcoil3/compose/a;->e(Lm/b;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;IZIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lm/b;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;IZLandroidx/compose/runtime/Composer;II)V
    .locals 19

    move-object/from16 v3, p2

    move-object/from16 v7, p6

    move/from16 v0, p12

    const v1, 0x49b4d5f6    # 1481406.8f

    move-object/from16 v2, p11

    .line 1
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v2

    and-int/lit8 v4, v0, 0x6

    if-nez v4, :cond_1

    move-object/from16 v4, p0

    invoke-interface {v2, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    const/4 v8, 0x4

    goto :goto_0

    :cond_0
    const/4 v8, 0x2

    :goto_0
    or-int/2addr v8, v0

    goto :goto_1

    :cond_1
    move-object/from16 v4, p0

    move v8, v0

    :goto_1
    and-int/lit8 v9, v0, 0x30

    if-nez v9, :cond_3

    move-object/from16 v9, p1

    invoke-interface {v2, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_2

    const/16 v10, 0x20

    goto :goto_2

    :cond_2
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v8, v10

    goto :goto_3

    :cond_3
    move-object/from16 v9, p1

    :goto_3
    and-int/lit16 v10, v0, 0x180

    if-nez v10, :cond_5

    invoke-interface {v2, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    const/16 v10, 0x100

    goto :goto_4

    :cond_4
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v8, v10

    :cond_5
    and-int/lit16 v10, v0, 0xc00

    if-nez v10, :cond_7

    move-object/from16 v10, p3

    invoke-interface {v2, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_6

    const/16 v11, 0x800

    goto :goto_5

    :cond_6
    const/16 v11, 0x400

    :goto_5
    or-int/2addr v8, v11

    goto :goto_6

    :cond_7
    move-object/from16 v10, p3

    :goto_6
    and-int/lit16 v11, v0, 0x6000

    if-nez v11, :cond_9

    move-object/from16 v11, p4

    invoke-interface {v2, v11}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_8

    const/16 v12, 0x4000

    goto :goto_7

    :cond_8
    const/16 v12, 0x2000

    :goto_7
    or-int/2addr v8, v12

    goto :goto_8

    :cond_9
    move-object/from16 v11, p4

    :goto_8
    const/high16 v12, 0x30000

    and-int/2addr v12, v0

    if-nez v12, :cond_b

    move-object/from16 v12, p5

    invoke-interface {v2, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_a

    const/high16 v13, 0x20000

    goto :goto_9

    :cond_a
    const/high16 v13, 0x10000

    :goto_9
    or-int/2addr v8, v13

    goto :goto_a

    :cond_b
    move-object/from16 v12, p5

    :goto_a
    const/high16 v13, 0x180000

    and-int/2addr v13, v0

    if-nez v13, :cond_d

    invoke-interface {v2, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_c

    const/high16 v13, 0x100000

    goto :goto_b

    :cond_c
    const/high16 v13, 0x80000

    :goto_b
    or-int/2addr v8, v13

    :cond_d
    const/high16 v13, 0xc00000

    and-int/2addr v13, v0

    if-nez v13, :cond_f

    move/from16 v13, p7

    invoke-interface {v2, v13}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v14

    if-eqz v14, :cond_e

    const/high16 v14, 0x800000

    goto :goto_c

    :cond_e
    const/high16 v14, 0x400000

    :goto_c
    or-int/2addr v8, v14

    goto :goto_d

    :cond_f
    move/from16 v13, p7

    :goto_d
    const/high16 v14, 0x6000000

    and-int/2addr v14, v0

    if-nez v14, :cond_11

    move-object/from16 v14, p8

    invoke-interface {v2, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_10

    const/high16 v15, 0x4000000

    goto :goto_e

    :cond_10
    const/high16 v15, 0x2000000

    :goto_e
    or-int/2addr v8, v15

    goto :goto_f

    :cond_11
    move-object/from16 v14, p8

    :goto_f
    const/high16 v15, 0x30000000

    and-int/2addr v15, v0

    if-nez v15, :cond_13

    move/from16 v15, p9

    invoke-interface {v2, v15}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v16

    if-eqz v16, :cond_12

    const/high16 v16, 0x20000000

    goto :goto_10

    :cond_12
    const/high16 v16, 0x10000000

    :goto_10
    or-int v8, v8, v16

    goto :goto_11

    :cond_13
    move/from16 v15, p9

    :goto_11
    and-int/lit8 v16, p13, 0x6

    move/from16 v5, p10

    if-nez v16, :cond_15

    invoke-interface {v2, v5}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v16

    if-eqz v16, :cond_14

    const/16 v16, 0x4

    goto :goto_12

    :cond_14
    const/16 v16, 0x2

    :goto_12
    or-int v16, p13, v16

    move/from16 v1, v16

    goto :goto_13

    :cond_15
    move/from16 v1, p13

    :goto_13
    const v17, 0x12492493

    and-int v6, v8, v17

    const v0, 0x12492492

    const/4 v3, 0x0

    if-ne v6, v0, :cond_17

    and-int/lit8 v0, v1, 0x3

    const/4 v6, 0x2

    if-eq v0, v6, :cond_16

    goto :goto_14

    :cond_16
    move v0, v3

    goto :goto_15

    :cond_17
    :goto_14
    const/4 v0, 0x1

    :goto_15
    and-int/lit8 v6, v8, 0x1

    invoke-interface {v2, v0, v6}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_1d

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_18

    const-string v0, "coil3.compose.AsyncImage (AsyncImage.kt:152)"

    const v6, 0x49b4d5f6    # 1481406.8f

    invoke-static {v6, v8, v1, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 2
    :cond_18
    invoke-virtual {v4}, Lm/b;->b()Ljava/lang/Object;

    move-result-object v0

    shr-int/lit8 v1, v8, 0xf

    and-int/lit8 v1, v1, 0x70

    .line 3
    invoke-static {v0, v7, v2, v1}, Lm/j;->l(Ljava/lang/Object;Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/runtime/Composer;I)Ly/e;

    move-result-object v0

    .line 4
    invoke-static {v0}, Lm/j;->u(Ly/e;)V

    .line 5
    invoke-virtual {v4}, Lm/b;->a()Lcoil3/e;

    move-result-object v6

    .line 6
    invoke-virtual {v4}, Lm/b;->c()Ll/b;

    move-result-object v7

    .line 7
    invoke-static {v2, v3}, Lm/j;->j(Landroidx/compose/runtime/Composer;I)Lcoil3/compose/AsyncImagePreviewHandler;

    move-result-object v16

    .line 8
    new-instance v4, Lcoil3/compose/internal/ContentPainterElement;

    const/16 v18, 0x0

    move-object/from16 v17, v9

    move-object v8, v10

    move-object v9, v11

    move-object v11, v12

    move v10, v15

    move-object/from16 v12, p6

    move v15, v5

    move-object v5, v0

    invoke-direct/range {v4 .. v18}, Lcoil3/compose/internal/ContentPainterElement;-><init>(Ly/e;Lcoil3/e;Ll/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;ZLcoil3/compose/AsyncImagePreviewHandler;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, p2

    .line 9
    invoke-interface {v0, v4}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 10
    invoke-static {}, Lm/j;->f()Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v4

    .line 11
    invoke-static {v2, v3}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v3

    .line 12
    invoke-static {v2, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 13
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v5

    .line 14
    sget-object v6, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v7

    .line 15
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v8

    if-nez v8, :cond_19

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 16
    :cond_19
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 17
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v8

    if-eqz v8, :cond_1a

    .line 18
    invoke-interface {v2, v7}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_16

    .line 19
    :cond_1a
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 20
    :goto_16
    invoke-static {v2}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v7

    .line 21
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    invoke-static {v7, v4, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 22
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v7, v5, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 23
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v7, v1, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 24
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    .line 25
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v4

    if-nez v4, :cond_1b

    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1c

    .line 26
    :cond_1b
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v7, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 27
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v7, v3, v1}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 28
    :cond_1c
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 29
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_1e

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_17

    :cond_1d
    move-object/from16 v0, p2

    .line 30
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 31
    :cond_1e
    :goto_17
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v14

    if-eqz v14, :cond_1f

    new-instance v0, Ll/a;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p12

    move/from16 v13, p13

    invoke-direct/range {v0 .. v13}, Ll/a;-><init>(Lm/b;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;IZII)V

    invoke-interface {v14, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_1f
    return-void
.end method

.method public static final c(Ljava/lang/Object;Ljava/lang/String;Lcoil3/e;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;IZLandroidx/compose/runtime/Composer;III)V
    .locals 16

    move/from16 v0, p17

    move/from16 v1, p18

    move/from16 v2, p19

    and-int/lit8 v3, v2, 0x8

    if-eqz v3, :cond_0

    .line 1
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    goto :goto_0

    :cond_0
    move-object/from16 v3, p3

    :goto_0
    and-int/lit8 v4, v2, 0x10

    const/4 v5, 0x0

    if-eqz v4, :cond_1

    move-object v4, v5

    goto :goto_1

    :cond_1
    move-object/from16 v4, p4

    :goto_1
    and-int/lit8 v6, v2, 0x20

    if-eqz v6, :cond_2

    move-object v6, v5

    goto :goto_2

    :cond_2
    move-object/from16 v6, p5

    :goto_2
    and-int/lit8 v7, v2, 0x40

    if-eqz v7, :cond_3

    move-object v7, v6

    goto :goto_3

    :cond_3
    move-object/from16 v7, p6

    :goto_3
    and-int/lit16 v8, v2, 0x80

    if-eqz v8, :cond_4

    move-object v8, v5

    goto :goto_4

    :cond_4
    move-object/from16 v8, p7

    :goto_4
    and-int/lit16 v9, v2, 0x100

    if-eqz v9, :cond_5

    move-object v9, v5

    goto :goto_5

    :cond_5
    move-object/from16 v9, p8

    :goto_5
    and-int/lit16 v10, v2, 0x200

    if-eqz v10, :cond_6

    move-object v10, v5

    goto :goto_6

    :cond_6
    move-object/from16 v10, p9

    :goto_6
    and-int/lit16 v11, v2, 0x400

    if-eqz v11, :cond_7

    .line 2
    sget-object v11, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v11}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    move-result-object v11

    goto :goto_7

    :cond_7
    move-object/from16 v11, p10

    :goto_7
    and-int/lit16 v12, v2, 0x800

    if-eqz v12, :cond_8

    .line 3
    sget-object v12, Landroidx/compose/ui/layout/ContentScale;->Companion:Landroidx/compose/ui/layout/ContentScale$Companion;

    invoke-virtual {v12}, Landroidx/compose/ui/layout/ContentScale$Companion;->getFit()Landroidx/compose/ui/layout/ContentScale;

    move-result-object v12

    goto :goto_8

    :cond_8
    move-object/from16 v12, p11

    :goto_8
    and-int/lit16 v13, v2, 0x1000

    if-eqz v13, :cond_9

    const/high16 v13, 0x3f800000    # 1.0f

    goto :goto_9

    :cond_9
    move/from16 v13, p12

    :goto_9
    and-int/lit16 v14, v2, 0x2000

    if-eqz v14, :cond_a

    goto :goto_a

    :cond_a
    move-object/from16 v5, p13

    :goto_a
    and-int/lit16 v14, v2, 0x4000

    if-eqz v14, :cond_b

    .line 4
    sget-object v14, Landroidx/compose/ui/graphics/drawscope/DrawScope;->Companion:Landroidx/compose/ui/graphics/drawscope/DrawScope$Companion;

    invoke-virtual {v14}, Landroidx/compose/ui/graphics/drawscope/DrawScope$Companion;->getDefaultFilterQuality-f-v9h1I()I

    move-result v14

    goto :goto_b

    :cond_b
    move/from16 v14, p14

    :goto_b
    const v15, 0x8000

    and-int/2addr v2, v15

    if-eqz v2, :cond_c

    const/4 v2, 0x1

    goto :goto_c

    :cond_c
    move/from16 v2, p15

    .line 5
    :goto_c
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v15

    if-eqz v15, :cond_d

    const v15, -0x4341a0ac

    move/from16 p12, v2

    const-string v2, "coil3.compose.AsyncImage (AsyncImage.kt:72)"

    invoke-static {v15, v0, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_d

    :cond_d
    move/from16 p12, v2

    :goto_d
    shr-int/lit8 v2, v0, 0x3

    .line 6
    new-instance v15, Lm/b;

    invoke-static {}, Ll/g;->c()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    move-object/from16 v1, p16

    .line 7
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/b;

    move-object/from16 v1, p0

    move-object/from16 p3, v3

    move-object/from16 v3, p2

    .line 8
    invoke-direct {v15, v1, v0, v3}, Lm/b;-><init>(Ljava/lang/Object;Ll/b;Lcoil3/e;)V

    .line 9
    invoke-static {v4, v6, v7}, Lm/j;->q(Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    .line 10
    invoke-static {v8, v9, v10}, Lm/j;->h(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;

    move-result-object v1

    and-int/lit8 v3, p17, 0x70

    and-int/lit16 v2, v2, 0x380

    or-int/2addr v2, v3

    shl-int/lit8 v3, p18, 0xf

    const/high16 v4, 0x70000

    and-int/2addr v4, v3

    or-int/2addr v2, v4

    const/high16 v4, 0x380000

    and-int/2addr v4, v3

    or-int/2addr v2, v4

    const/high16 v4, 0x1c00000

    and-int/2addr v4, v3

    or-int/2addr v2, v4

    const/high16 v4, 0xe000000

    and-int/2addr v4, v3

    or-int/2addr v2, v4

    const/high16 v4, 0x70000000

    and-int/2addr v3, v4

    or-int/2addr v2, v3

    shr-int/lit8 v3, p18, 0xf

    and-int/lit8 v3, v3, 0xe

    move-object/from16 p4, p3

    move-object/from16 p13, p16

    move-object/from16 p5, v0

    move-object/from16 p6, v1

    move/from16 p14, v2

    move/from16 p15, v3

    move-object/from16 p10, v5

    move-object/from16 p7, v11

    move-object/from16 p8, v12

    move/from16 p9, v13

    move/from16 p11, v14

    move-object/from16 p2, v15

    move-object/from16 p3, p1

    .line 11
    invoke-static/range {p2 .. p15}, Lcoil3/compose/a;->b(Lm/b;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;IZLandroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_e
    return-void
.end method

.method public static final d(Ljava/lang/Object;Ljava/lang/String;Lcoil3/e;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;IZLandroidx/compose/runtime/Composer;III)V
    .locals 18

    move/from16 v0, p13

    move/from16 v1, p14

    move/from16 v2, p15

    and-int/lit8 v3, v2, 0x8

    if-eqz v3, :cond_0

    .line 1
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    move-object v6, v3

    goto :goto_0

    :cond_0
    move-object/from16 v6, p3

    :goto_0
    and-int/lit8 v3, v2, 0x10

    if-eqz v3, :cond_1

    .line 2
    sget-object v3, Lcoil3/compose/AsyncImagePainter;->s:Lcoil3/compose/AsyncImagePainter$a;

    invoke-virtual {v3}, Lcoil3/compose/AsyncImagePainter$a;->a()Lkotlin/jvm/functions/Function1;

    move-result-object v3

    move-object v7, v3

    goto :goto_1

    :cond_1
    move-object/from16 v7, p4

    :goto_1
    and-int/lit8 v3, v2, 0x20

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    move-object v8, v4

    goto :goto_2

    :cond_2
    move-object/from16 v8, p5

    :goto_2
    and-int/lit8 v3, v2, 0x40

    if-eqz v3, :cond_3

    .line 3
    sget-object v3, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    move-result-object v3

    move-object v9, v3

    goto :goto_3

    :cond_3
    move-object/from16 v9, p6

    :goto_3
    and-int/lit16 v3, v2, 0x80

    if-eqz v3, :cond_4

    .line 4
    sget-object v3, Landroidx/compose/ui/layout/ContentScale;->Companion:Landroidx/compose/ui/layout/ContentScale$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/layout/ContentScale$Companion;->getFit()Landroidx/compose/ui/layout/ContentScale;

    move-result-object v3

    move-object v10, v3

    goto :goto_4

    :cond_4
    move-object/from16 v10, p7

    :goto_4
    and-int/lit16 v3, v2, 0x100

    if-eqz v3, :cond_5

    const/high16 v3, 0x3f800000    # 1.0f

    move v11, v3

    goto :goto_5

    :cond_5
    move/from16 v11, p8

    :goto_5
    and-int/lit16 v3, v2, 0x200

    if-eqz v3, :cond_6

    move-object v12, v4

    goto :goto_6

    :cond_6
    move-object/from16 v12, p9

    :goto_6
    and-int/lit16 v3, v2, 0x400

    if-eqz v3, :cond_7

    .line 5
    sget-object v3, Landroidx/compose/ui/graphics/drawscope/DrawScope;->Companion:Landroidx/compose/ui/graphics/drawscope/DrawScope$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/graphics/drawscope/DrawScope$Companion;->getDefaultFilterQuality-f-v9h1I()I

    move-result v3

    move v13, v3

    goto :goto_7

    :cond_7
    move/from16 v13, p10

    :goto_7
    and-int/lit16 v2, v2, 0x800

    if-eqz v2, :cond_8

    const/4 v2, 0x1

    move v14, v2

    goto :goto_8

    :cond_8
    move/from16 v14, p11

    .line 6
    :goto_8
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_9

    const v2, 0x262fc5e

    const-string v3, "coil3.compose.AsyncImage (AsyncImage.kt:125)"

    invoke-static {v2, v0, v1, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_9
    shr-int/lit8 v2, v0, 0x3

    .line 7
    new-instance v4, Lm/b;

    invoke-static {}, Ll/g;->c()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v3

    move-object/from16 v15, p12

    .line 8
    invoke-interface {v15, v3}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/b;

    move-object/from16 v5, p0

    move-object/from16 v0, p2

    .line 9
    invoke-direct {v4, v5, v3, v0}, Lm/b;-><init>(Ljava/lang/Object;Ll/b;Lcoil3/e;)V

    and-int/lit8 v0, p13, 0x70

    and-int/lit16 v3, v2, 0x380

    or-int/2addr v0, v3

    and-int/lit16 v3, v2, 0x1c00

    or-int/2addr v0, v3

    const v3, 0xe000

    and-int/2addr v3, v2

    or-int/2addr v0, v3

    const/high16 v3, 0x70000

    and-int/2addr v3, v2

    or-int/2addr v0, v3

    const/high16 v3, 0x380000

    and-int/2addr v3, v2

    or-int/2addr v0, v3

    const/high16 v3, 0x1c00000

    and-int/2addr v3, v2

    or-int/2addr v0, v3

    const/high16 v3, 0xe000000

    and-int/2addr v2, v3

    or-int/2addr v0, v2

    shl-int/lit8 v2, v1, 0x1b

    const/high16 v3, 0x70000000

    and-int/2addr v2, v3

    or-int v16, v0, v2

    shr-int/lit8 v0, v1, 0x3

    and-int/lit8 v17, v0, 0xe

    move-object/from16 v5, p1

    .line 10
    invoke-static/range {v4 .. v17}, Lcoil3/compose/a;->b(Lm/b;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;IZLandroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_a
    return-void
.end method

.method public static final e(Lm/b;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;IZIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 15

    .line 1
    or-int/lit8 v0, p11, 0x1

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 4
    .line 5
    .line 6
    move-result v13

    .line 7
    invoke-static/range {p12 .. p12}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 8
    .line 9
    .line 10
    move-result v14

    .line 11
    move-object v1, p0

    .line 12
    move-object/from16 v2, p1

    .line 13
    .line 14
    move-object/from16 v3, p2

    .line 15
    .line 16
    move-object/from16 v4, p3

    .line 17
    .line 18
    move-object/from16 v5, p4

    .line 19
    .line 20
    move-object/from16 v6, p5

    .line 21
    .line 22
    move-object/from16 v7, p6

    .line 23
    .line 24
    move/from16 v8, p7

    .line 25
    .line 26
    move-object/from16 v9, p8

    .line 27
    .line 28
    move/from16 v10, p9

    .line 29
    .line 30
    move/from16 v11, p10

    .line 31
    .line 32
    move-object/from16 v12, p13

    .line 33
    .line 34
    invoke-static/range {v1 .. v14}, Lcoil3/compose/a;->b(Lm/b;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;IZLandroidx/compose/runtime/Composer;II)V

    .line 35
    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 38
    .line 39
    return-object p0
.end method
