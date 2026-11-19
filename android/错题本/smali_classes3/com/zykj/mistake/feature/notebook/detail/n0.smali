.class public abstract Lcom/zykj/mistake/feature/notebook/detail/n0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(ZJIILjava/lang/String;FLr6/a;Landroidx/compose/runtime/Composer;II)V
    .locals 35

    move/from16 v1, p0

    move-object/from16 v6, p7

    move/from16 v9, p9

    const-string v0, "onClick"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x2cc14c96

    move-object/from16 v2, p8

    .line 1
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v10

    and-int/lit8 v2, v9, 0x6

    const/4 v3, 0x4

    if-nez v2, :cond_1

    invoke-interface {v10, v1}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v9

    goto :goto_1

    :cond_1
    move v2, v9

    :goto_1
    and-int/lit8 v4, v9, 0x30

    move-wide/from16 v12, p1

    if-nez v4, :cond_3

    invoke-interface {v10, v12, v13}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v2, v4

    :cond_3
    and-int/lit16 v4, v9, 0x180

    move/from16 v14, p3

    if-nez v4, :cond_5

    invoke-interface {v10, v14}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x100

    goto :goto_3

    :cond_4
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v2, v4

    :cond_5
    and-int/lit16 v4, v9, 0xc00

    move/from16 v15, p4

    if-nez v4, :cond_7

    invoke-interface {v10, v15}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v4

    if-eqz v4, :cond_6

    const/16 v4, 0x800

    goto :goto_4

    :cond_6
    const/16 v4, 0x400

    :goto_4
    or-int/2addr v2, v4

    :cond_7
    and-int/lit16 v4, v9, 0x6000

    if-nez v4, :cond_9

    move-object/from16 v4, p5

    invoke-interface {v10, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    const/16 v5, 0x4000

    goto :goto_5

    :cond_8
    const/16 v5, 0x2000

    :goto_5
    or-int/2addr v2, v5

    goto :goto_6

    :cond_9
    move-object/from16 v4, p5

    :goto_6
    and-int/lit8 v5, p10, 0x20

    const/high16 v7, 0x30000

    if-eqz v5, :cond_b

    or-int/2addr v2, v7

    :cond_a
    move/from16 v7, p6

    goto :goto_8

    :cond_b
    and-int/2addr v7, v9

    if-nez v7, :cond_a

    move/from16 v7, p6

    invoke-interface {v10, v7}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v8

    if-eqz v8, :cond_c

    const/high16 v8, 0x20000

    goto :goto_7

    :cond_c
    const/high16 v8, 0x10000

    :goto_7
    or-int/2addr v2, v8

    :goto_8
    const/high16 v8, 0x180000

    and-int/2addr v8, v9

    if-nez v8, :cond_e

    invoke-interface {v10, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_d

    const/high16 v8, 0x100000

    goto :goto_9

    :cond_d
    const/high16 v8, 0x80000

    :goto_9
    or-int/2addr v2, v8

    :cond_e
    const v8, 0x92493

    and-int/2addr v8, v2

    const v11, 0x92492

    const/4 v4, 0x0

    if-eq v8, v11, :cond_f

    const/4 v8, 0x1

    goto :goto_a

    :cond_f
    move v8, v4

    :goto_a
    and-int/lit8 v11, v2, 0x1

    invoke-interface {v10, v8, v11}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v8

    if-eqz v8, :cond_1a

    if-eqz v5, :cond_10

    const/16 v5, 0x12

    int-to-float v5, v5

    .line 2
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v5

    move v11, v5

    goto :goto_b

    :cond_10
    move v11, v7

    :goto_b
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v5

    if-eqz v5, :cond_11

    const/4 v5, -0x1

    const-string v7, "com.zykj.mistake.feature.notebook.detail.AnswerButton (MistakeDetailNavButtons.kt:97)"

    invoke-static {v0, v2, v5, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 3
    :cond_11
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    const/16 v5, 0x65

    int-to-float v5, v5

    .line 4
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v5

    const/16 v7, 0x24

    int-to-float v7, v7

    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v7

    .line 5
    invoke-static {v0, v5, v7}, Landroidx/compose/foundation/layout/SizeKt;->size-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v5

    if-eqz v1, :cond_12

    move-wide v7, v12

    goto :goto_c

    :cond_12
    const-wide v7, 0xffccccccL

    .line 6
    invoke-static {v7, v8}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v7

    :goto_c
    int-to-float v3, v3

    .line 7
    invoke-static {v3, v5, v7, v8}, Landroidx/compose/material3/c;->f(FLandroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v7, 0x7

    const/4 v8, 0x0

    move v5, v2

    move-object v2, v3

    const/4 v3, 0x0

    move/from16 v16, v4

    const/4 v4, 0x0

    move/from16 v17, v5

    const/4 v5, 0x0

    move/from16 v1, v16

    .line 8
    invoke-static/range {v2 .. v8}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lr6/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    .line 9
    sget-object v3, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v3}, Landroidx/compose/foundation/layout/Arrangement;->getCenter()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    move-result-object v3

    .line 10
    sget-object v4, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v4}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    move-result-object v4

    const/16 v5, 0x36

    .line 11
    invoke-static {v3, v4, v10, v5}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v3

    .line 12
    invoke-static {v10, v1}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v4

    .line 13
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v5

    .line 14
    invoke-static {v10, v2}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    .line 15
    sget-object v6, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    move-result-object v7

    .line 16
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v8

    if-nez v8, :cond_13

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 17
    :cond_13
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 18
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v8

    if-eqz v8, :cond_14

    .line 19
    invoke-interface {v10, v7}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    goto :goto_d

    .line 20
    :cond_14
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 21
    :goto_d
    invoke-static {v10}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v7

    .line 22
    invoke-static {v6, v7, v3, v7, v5}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    move-result-object v3

    .line 23
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v5

    if-nez v5, :cond_15

    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_16

    .line 24
    :cond_15
    invoke-static {v4, v7, v4, v3}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 25
    :cond_16
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    move-result-object v3

    invoke-static {v7, v2, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 26
    sget-object v2, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    if-eqz p0, :cond_17

    move v2, v14

    goto :goto_e

    :cond_17
    move v2, v15

    .line 27
    :goto_e
    invoke-static {v2, v10, v1}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    move-result-object v1

    .line 28
    invoke-static {v0, v11}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v12

    shr-int/lit8 v2, v17, 0x9

    and-int/lit8 v18, v2, 0x70

    const/16 v19, 0x78

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v17, v10

    move v5, v11

    move-object/from16 v11, p5

    move-object v10, v1

    const/4 v1, 0x2

    .line 29
    invoke-static/range {v10 .. v19}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v2, v17

    if-eqz p0, :cond_18

    const v3, -0x32f63034

    .line 30
    invoke-interface {v2, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    int-to-float v1, v1

    const/4 v3, 0x6

    .line 31
    invoke-static {v1, v0, v2, v3}, Landroidx/compose/material3/c;->s(FLandroidx/compose/ui/Modifier$Companion;Landroidx/compose/runtime/Composer;I)V

    .line 32
    sget-object v0, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    move-result-wide v12

    const/16 v0, 0xf

    .line 33
    invoke-static {v0}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    move-result-wide v14

    .line 34
    sget-object v0, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getMedium()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object v17

    const/16 v33, 0xc00

    const v34, 0x1dfd2

    .line 35
    const-string v10, "+1"

    const/4 v11, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x1

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const v32, 0x30d86

    move-object/from16 v31, v2

    invoke-static/range {v10 .. v34}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 36
    :goto_f
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_10

    :cond_18
    const v0, -0x33394c04

    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    goto :goto_f

    .line 37
    :goto_10
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 38
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_19

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_19
    move v7, v5

    goto :goto_11

    :cond_1a
    move-object v2, v10

    .line 39
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 40
    :goto_11
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v11

    if-eqz v11, :cond_1b

    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/m0;

    move/from16 v1, p0

    move-wide/from16 v2, p1

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v8, p7

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lcom/zykj/mistake/feature/notebook/detail/m0;-><init>(ZJIILjava/lang/String;FLr6/a;II)V

    invoke-interface {v11, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    :cond_1b
    return-void
.end method

.method public static final b(Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;ZZZLr6/c;Landroidx/compose/runtime/Composer;I)V
    .locals 30

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v2, p1

    .line 4
    .line 5
    move/from16 v3, p2

    .line 6
    .line 7
    move/from16 v4, p3

    .line 8
    .line 9
    move-object/from16 v5, p4

    .line 10
    .line 11
    move/from16 v6, p6

    .line 12
    .line 13
    const-string v0, "answerResult"

    .line 14
    .line 15
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const v0, -0x1692f238

    .line 19
    .line 20
    .line 21
    move-object/from16 v7, p5

    .line 22
    .line 23
    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 24
    .line 25
    .line 26
    move-result-object v14

    .line 27
    and-int/lit8 v7, v6, 0x6

    .line 28
    .line 29
    if-nez v7, :cond_1

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 32
    .line 33
    .line 34
    move-result v7

    .line 35
    invoke-interface {v14, v7}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    if-eqz v7, :cond_0

    .line 40
    .line 41
    const/4 v7, 0x4

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const/4 v7, 0x2

    .line 44
    :goto_0
    or-int/2addr v7, v6

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    move v7, v6

    .line 47
    :goto_1
    and-int/lit8 v9, v6, 0x30

    .line 48
    .line 49
    const/16 v10, 0x10

    .line 50
    .line 51
    if-nez v9, :cond_3

    .line 52
    .line 53
    invoke-interface {v14, v2}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 54
    .line 55
    .line 56
    move-result v9

    .line 57
    if-eqz v9, :cond_2

    .line 58
    .line 59
    const/16 v9, 0x20

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_2
    move v9, v10

    .line 63
    :goto_2
    or-int/2addr v7, v9

    .line 64
    :cond_3
    and-int/lit16 v9, v6, 0x180

    .line 65
    .line 66
    if-nez v9, :cond_5

    .line 67
    .line 68
    invoke-interface {v14, v3}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 69
    .line 70
    .line 71
    move-result v9

    .line 72
    if-eqz v9, :cond_4

    .line 73
    .line 74
    const/16 v9, 0x100

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_4
    const/16 v9, 0x80

    .line 78
    .line 79
    :goto_3
    or-int/2addr v7, v9

    .line 80
    :cond_5
    and-int/lit16 v9, v6, 0xc00

    .line 81
    .line 82
    if-nez v9, :cond_7

    .line 83
    .line 84
    invoke-interface {v14, v4}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 85
    .line 86
    .line 87
    move-result v9

    .line 88
    if-eqz v9, :cond_6

    .line 89
    .line 90
    const/16 v9, 0x800

    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_6
    const/16 v9, 0x400

    .line 94
    .line 95
    :goto_4
    or-int/2addr v7, v9

    .line 96
    :cond_7
    and-int/lit16 v9, v6, 0x6000

    .line 97
    .line 98
    if-nez v9, :cond_9

    .line 99
    .line 100
    invoke-interface {v14, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v9

    .line 104
    if-eqz v9, :cond_8

    .line 105
    .line 106
    const/16 v9, 0x4000

    .line 107
    .line 108
    goto :goto_5

    .line 109
    :cond_8
    const/16 v9, 0x2000

    .line 110
    .line 111
    :goto_5
    or-int/2addr v7, v9

    .line 112
    :cond_9
    and-int/lit16 v9, v7, 0x2493

    .line 113
    .line 114
    const/16 v12, 0x2492

    .line 115
    .line 116
    const/4 v13, 0x0

    .line 117
    const/4 v15, 0x1

    .line 118
    if-eq v9, v12, :cond_a

    .line 119
    .line 120
    move v9, v15

    .line 121
    goto :goto_6

    .line 122
    :cond_a
    move v9, v13

    .line 123
    :goto_6
    and-int/lit8 v12, v7, 0x1

    .line 124
    .line 125
    invoke-interface {v14, v9, v12}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 126
    .line 127
    .line 128
    move-result v9

    .line 129
    if-eqz v9, :cond_22

    .line 130
    .line 131
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 132
    .line 133
    .line 134
    move-result v9

    .line 135
    if-eqz v9, :cond_b

    .line 136
    .line 137
    const/4 v9, -0x1

    .line 138
    const-string v12, "com.zykj.mistake.feature.notebook.detail.DetailAnswerButtons (MistakeDetailNavButtons.kt:34)"

    .line 139
    .line 140
    invoke-static {v0, v7, v9, v12}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 141
    .line 142
    .line 143
    :cond_b
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 144
    .line 145
    const/4 v9, 0x0

    .line 146
    const/4 v12, 0x0

    .line 147
    invoke-static {v0, v9, v15, v12}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 148
    .line 149
    .line 150
    move-result-object v16

    .line 151
    sget-object v22, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 152
    .line 153
    invoke-virtual/range {v22 .. v22}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 154
    .line 155
    .line 156
    move-result-wide v17

    .line 157
    const/16 v20, 0x2

    .line 158
    .line 159
    const/16 v21, 0x0

    .line 160
    .line 161
    const/16 v19, 0x0

    .line 162
    .line 163
    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 164
    .line 165
    .line 166
    move-result-object v9

    .line 167
    int-to-float v10, v10

    .line 168
    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 169
    .line 170
    .line 171
    move-result v12

    .line 172
    const/16 v8, 0xc

    .line 173
    .line 174
    int-to-float v8, v8

    .line 175
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 176
    .line 177
    .line 178
    move-result v8

    .line 179
    invoke-static {v9, v12, v8}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 180
    .line 181
    .line 182
    move-result-object v8

    .line 183
    sget-object v9, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 184
    .line 185
    invoke-virtual {v9}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 186
    .line 187
    .line 188
    move-result-object v9

    .line 189
    sget-object v12, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 190
    .line 191
    invoke-virtual {v12}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 192
    .line 193
    .line 194
    move-result-object v12

    .line 195
    const/16 v15, 0x30

    .line 196
    .line 197
    invoke-static {v12, v9, v14, v15}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 198
    .line 199
    .line 200
    move-result-object v9

    .line 201
    invoke-static {v14, v13}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 202
    .line 203
    .line 204
    move-result v12

    .line 205
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 206
    .line 207
    .line 208
    move-result-object v15

    .line 209
    invoke-static {v14, v8}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 210
    .line 211
    .line 212
    move-result-object v8

    .line 213
    sget-object v13, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 214
    .line 215
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 216
    .line 217
    .line 218
    move-result-object v11

    .line 219
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 220
    .line 221
    .line 222
    move-result-object v19

    .line 223
    if-nez v19, :cond_c

    .line 224
    .line 225
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 226
    .line 227
    .line 228
    :cond_c
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 229
    .line 230
    .line 231
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 232
    .line 233
    .line 234
    move-result v19

    .line 235
    if-eqz v19, :cond_d

    .line 236
    .line 237
    invoke-interface {v14, v11}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 238
    .line 239
    .line 240
    goto :goto_7

    .line 241
    :cond_d
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 242
    .line 243
    .line 244
    :goto_7
    invoke-static {v14}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 245
    .line 246
    .line 247
    move-result-object v11

    .line 248
    invoke-static {v13, v11, v9, v11, v15}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 249
    .line 250
    .line 251
    move-result-object v9

    .line 252
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 253
    .line 254
    .line 255
    move-result v15

    .line 256
    if-nez v15, :cond_e

    .line 257
    .line 258
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v15

    .line 262
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    invoke-static {v15, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move-result v2

    .line 270
    if-nez v2, :cond_f

    .line 271
    .line 272
    :cond_e
    invoke-static {v12, v11, v12, v9}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 273
    .line 274
    .line 275
    :cond_f
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    invoke-static {v11, v8, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 280
    .line 281
    .line 282
    sget-object v2, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 283
    .line 284
    const v8, 0x2deb1ade

    .line 285
    .line 286
    .line 287
    const v23, 0xe000

    .line 288
    .line 289
    .line 290
    if-eqz p1, :cond_18

    .line 291
    .line 292
    const v9, 0x2e0416ad

    .line 293
    .line 294
    .line 295
    invoke-interface {v14, v9}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 296
    .line 297
    .line 298
    sget-object v9, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;->CORRECT:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;

    .line 299
    .line 300
    if-ne v1, v9, :cond_10

    .line 301
    .line 302
    move v9, v7

    .line 303
    const/4 v7, 0x1

    .line 304
    goto :goto_8

    .line 305
    :cond_10
    move v9, v7

    .line 306
    const/4 v7, 0x0

    .line 307
    :goto_8
    sget-wide v11, Lcom/zykj/mistake/feature/notebook/detail/t4;->c:J

    .line 308
    .line 309
    move v13, v10

    .line 310
    sget v10, Lcom/zykj/mistake/R$drawable;->ic_correct_white:I

    .line 311
    .line 312
    move v15, v8

    .line 313
    move-wide/from16 v28, v11

    .line 314
    .line 315
    move v12, v9

    .line 316
    move-wide/from16 v8, v28

    .line 317
    .line 318
    sget v11, Lcom/zykj/mistake/R$drawable;->ic_correct_gray:I

    .line 319
    .line 320
    move/from16 v19, v13

    .line 321
    .line 322
    and-int v13, v12, v23

    .line 323
    .line 324
    const/16 v15, 0x4000

    .line 325
    .line 326
    if-ne v13, v15, :cond_11

    .line 327
    .line 328
    const/16 v18, 0x1

    .line 329
    .line 330
    goto :goto_9

    .line 331
    :cond_11
    const/16 v18, 0x0

    .line 332
    .line 333
    :goto_9
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v15

    .line 337
    if-nez v18, :cond_12

    .line 338
    .line 339
    sget-object v18, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 340
    .line 341
    move-object/from16 v24, v2

    .line 342
    .line 343
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v2

    .line 347
    if-ne v15, v2, :cond_13

    .line 348
    .line 349
    goto :goto_a

    .line 350
    :cond_12
    move-object/from16 v24, v2

    .line 351
    .line 352
    :goto_a
    new-instance v15, Lcom/zykj/mistake/feature/collection/filter/u0;

    .line 353
    .line 354
    const/16 v2, 0x1a

    .line 355
    .line 356
    invoke-direct {v15, v5, v2}, Lcom/zykj/mistake/feature/collection/filter/u0;-><init>(Lr6/c;I)V

    .line 357
    .line 358
    .line 359
    invoke-interface {v14, v15}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 360
    .line 361
    .line 362
    :cond_13
    check-cast v15, Lr6/a;

    .line 363
    .line 364
    const/4 v2, 0x1

    .line 365
    const/16 v16, 0x6030

    .line 366
    .line 367
    const/16 v18, 0x0

    .line 368
    .line 369
    const/16 v17, 0x20

    .line 370
    .line 371
    move/from16 v25, v12

    .line 372
    .line 373
    const-string v12, "\u7b54\u5bf9"

    .line 374
    .line 375
    move/from16 v26, v13

    .line 376
    .line 377
    const/4 v13, 0x0

    .line 378
    move-object v3, v15

    .line 379
    move-object v15, v14

    .line 380
    move-object v14, v3

    .line 381
    move/from16 v27, v2

    .line 382
    .line 383
    move/from16 v2, v26

    .line 384
    .line 385
    const/16 v3, 0x4000

    .line 386
    .line 387
    invoke-static/range {v7 .. v17}, Lcom/zykj/mistake/feature/notebook/detail/n0;->a(ZJIILjava/lang/String;FLr6/a;Landroidx/compose/runtime/Composer;II)V

    .line 388
    .line 389
    .line 390
    move-object v14, v15

    .line 391
    const/16 v7, 0x8

    .line 392
    .line 393
    int-to-float v7, v7

    .line 394
    const/4 v8, 0x6

    .line 395
    invoke-static {v7, v0, v14, v8}, Landroidx/compose/material3/c;->s(FLandroidx/compose/ui/Modifier$Companion;Landroidx/compose/runtime/Composer;I)V

    .line 396
    .line 397
    .line 398
    sget-object v7, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;->WRONG:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$AnswerResult;

    .line 399
    .line 400
    if-ne v1, v7, :cond_14

    .line 401
    .line 402
    move/from16 v7, v27

    .line 403
    .line 404
    goto :goto_b

    .line 405
    :cond_14
    const/4 v7, 0x0

    .line 406
    :goto_b
    sget-wide v8, Lcom/zykj/mistake/feature/notebook/detail/t4;->d:J

    .line 407
    .line 408
    sget v10, Lcom/zykj/mistake/R$drawable;->ic_error_white:I

    .line 409
    .line 410
    sget v11, Lcom/zykj/mistake/R$drawable;->ic_error_gray:I

    .line 411
    .line 412
    invoke-static/range {v19 .. v19}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 413
    .line 414
    .line 415
    move-result v13

    .line 416
    if-ne v2, v3, :cond_15

    .line 417
    .line 418
    move/from16 v2, v27

    .line 419
    .line 420
    goto :goto_c

    .line 421
    :cond_15
    const/4 v2, 0x0

    .line 422
    :goto_c
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v12

    .line 426
    if-nez v2, :cond_16

    .line 427
    .line 428
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 429
    .line 430
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v2

    .line 434
    if-ne v12, v2, :cond_17

    .line 435
    .line 436
    :cond_16
    new-instance v12, Lcom/zykj/mistake/feature/collection/filter/u0;

    .line 437
    .line 438
    const/16 v2, 0x1b

    .line 439
    .line 440
    invoke-direct {v12, v5, v2}, Lcom/zykj/mistake/feature/collection/filter/u0;-><init>(Lr6/c;I)V

    .line 441
    .line 442
    .line 443
    invoke-interface {v14, v12}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 444
    .line 445
    .line 446
    :cond_17
    check-cast v12, Lr6/a;

    .line 447
    .line 448
    const v16, 0x36030

    .line 449
    .line 450
    .line 451
    const/16 v17, 0x0

    .line 452
    .line 453
    move-object v15, v14

    .line 454
    move-object v14, v12

    .line 455
    const-string v12, "\u7b54\u9519"

    .line 456
    .line 457
    invoke-static/range {v7 .. v17}, Lcom/zykj/mistake/feature/notebook/detail/n0;->a(ZJIILjava/lang/String;FLr6/a;Landroidx/compose/runtime/Composer;II)V

    .line 458
    .line 459
    .line 460
    move-object v14, v15

    .line 461
    :goto_d
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 462
    .line 463
    .line 464
    goto :goto_e

    .line 465
    :cond_18
    move-object/from16 v24, v2

    .line 466
    .line 467
    move/from16 v25, v7

    .line 468
    .line 469
    move v15, v8

    .line 470
    const/16 v3, 0x4000

    .line 471
    .line 472
    const/16 v27, 0x1

    .line 473
    .line 474
    invoke-interface {v14, v15}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 475
    .line 476
    .line 477
    goto :goto_d

    .line 478
    :goto_e
    if-eqz p2, :cond_21

    .line 479
    .line 480
    const v2, 0x2e12d0ee

    .line 481
    .line 482
    .line 483
    invoke-interface {v14, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 484
    .line 485
    .line 486
    const/16 v20, 0x2

    .line 487
    .line 488
    const/16 v21, 0x0

    .line 489
    .line 490
    const/high16 v18, 0x3f800000    # 1.0f

    .line 491
    .line 492
    const/16 v19, 0x0

    .line 493
    .line 494
    move-object/from16 v17, v0

    .line 495
    .line 496
    move-object/from16 v16, v24

    .line 497
    .line 498
    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/RowScope;->weight$default(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    const/4 v2, 0x0

    .line 503
    invoke-static {v0, v14, v2}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 504
    .line 505
    .line 506
    if-eqz v4, :cond_1c

    .line 507
    .line 508
    const v0, 0x2e13d8ac

    .line 509
    .line 510
    .line 511
    invoke-interface {v14, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 512
    .line 513
    .line 514
    const-wide v7, 0xffeaf2ffL

    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    invoke-static {v7, v8}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 520
    .line 521
    .line 522
    move-result-wide v8

    .line 523
    sget-wide v10, Lcom/zykj/mistake/feature/notebook/detail/t4;->a:J

    .line 524
    .line 525
    const/4 v0, 0x4

    .line 526
    int-to-float v7, v0

    .line 527
    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 528
    .line 529
    .line 530
    move-result v15

    .line 531
    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 532
    .line 533
    .line 534
    move-result v18

    .line 535
    const/16 v19, 0x6

    .line 536
    .line 537
    const/16 v20, 0x0

    .line 538
    .line 539
    const/16 v16, 0x0

    .line 540
    .line 541
    const/16 v17, 0x0

    .line 542
    .line 543
    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-a9UjIt4$default(FFFFILjava/lang/Object;)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 544
    .line 545
    .line 546
    move-result-object v12

    .line 547
    and-int v7, v25, v23

    .line 548
    .line 549
    if-ne v7, v3, :cond_19

    .line 550
    .line 551
    move/from16 v13, v27

    .line 552
    .line 553
    goto :goto_f

    .line 554
    :cond_19
    move v13, v2

    .line 555
    :goto_f
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v7

    .line 559
    if-nez v13, :cond_1a

    .line 560
    .line 561
    sget-object v13, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 562
    .line 563
    invoke-virtual {v13}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 564
    .line 565
    .line 566
    move-result-object v13

    .line 567
    if-ne v7, v13, :cond_1b

    .line 568
    .line 569
    :cond_1a
    new-instance v7, Lcom/zykj/mistake/feature/collection/filter/u0;

    .line 570
    .line 571
    const/16 v13, 0x1c

    .line 572
    .line 573
    invoke-direct {v7, v5, v13}, Lcom/zykj/mistake/feature/collection/filter/u0;-><init>(Lr6/c;I)V

    .line 574
    .line 575
    .line 576
    invoke-interface {v14, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 577
    .line 578
    .line 579
    :cond_1b
    move-object v13, v7

    .line 580
    check-cast v13, Lr6/a;

    .line 581
    .line 582
    const/16 v15, 0x1b6

    .line 583
    .line 584
    const-string v7, "\u4e0a\u4e00\u9898"

    .line 585
    .line 586
    invoke-static/range {v7 .. v15}, Lcom/zykj/mistake/feature/notebook/detail/n0;->c(Ljava/lang/String;JJLandroidx/compose/foundation/shape/RoundedCornerShape;Lr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 587
    .line 588
    .line 589
    :goto_10
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 590
    .line 591
    .line 592
    goto :goto_11

    .line 593
    :cond_1c
    const/4 v0, 0x4

    .line 594
    const v15, 0x2deb1ade

    .line 595
    .line 596
    .line 597
    invoke-interface {v14, v15}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 598
    .line 599
    .line 600
    goto :goto_10

    .line 601
    :goto_11
    sget-wide v8, Lcom/zykj/mistake/feature/notebook/detail/t4;->a:J

    .line 602
    .line 603
    invoke-virtual/range {v22 .. v22}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 604
    .line 605
    .line 606
    move-result-wide v10

    .line 607
    if-eqz v4, :cond_1d

    .line 608
    .line 609
    int-to-float v0, v0

    .line 610
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 611
    .line 612
    .line 613
    move-result v16

    .line 614
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 615
    .line 616
    .line 617
    move-result v17

    .line 618
    const/16 v19, 0x9

    .line 619
    .line 620
    const/16 v20, 0x0

    .line 621
    .line 622
    const/4 v15, 0x0

    .line 623
    const/16 v18, 0x0

    .line 624
    .line 625
    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-a9UjIt4$default(FFFFILjava/lang/Object;)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 626
    .line 627
    .line 628
    move-result-object v0

    .line 629
    :goto_12
    move-object v12, v0

    .line 630
    goto :goto_13

    .line 631
    :cond_1d
    int-to-float v0, v0

    .line 632
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 633
    .line 634
    .line 635
    move-result v0

    .line 636
    invoke-static {v0}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 637
    .line 638
    .line 639
    move-result-object v0

    .line 640
    goto :goto_12

    .line 641
    :goto_13
    and-int v0, v25, v23

    .line 642
    .line 643
    if-ne v0, v3, :cond_1e

    .line 644
    .line 645
    move/from16 v13, v27

    .line 646
    .line 647
    goto :goto_14

    .line 648
    :cond_1e
    move v13, v2

    .line 649
    :goto_14
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 650
    .line 651
    .line 652
    move-result-object v0

    .line 653
    if-nez v13, :cond_1f

    .line 654
    .line 655
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 656
    .line 657
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 658
    .line 659
    .line 660
    move-result-object v2

    .line 661
    if-ne v0, v2, :cond_20

    .line 662
    .line 663
    :cond_1f
    new-instance v0, Lcom/zykj/mistake/feature/collection/filter/u0;

    .line 664
    .line 665
    const/16 v2, 0x1d

    .line 666
    .line 667
    invoke-direct {v0, v5, v2}, Lcom/zykj/mistake/feature/collection/filter/u0;-><init>(Lr6/c;I)V

    .line 668
    .line 669
    .line 670
    invoke-interface {v14, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 671
    .line 672
    .line 673
    :cond_20
    move-object v13, v0

    .line 674
    check-cast v13, Lr6/a;

    .line 675
    .line 676
    const/16 v15, 0x1b6

    .line 677
    .line 678
    const-string v7, "\u4e0b\u4e00\u9898"

    .line 679
    .line 680
    invoke-static/range {v7 .. v15}, Lcom/zykj/mistake/feature/notebook/detail/n0;->c(Ljava/lang/String;JJLandroidx/compose/foundation/shape/RoundedCornerShape;Lr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 681
    .line 682
    .line 683
    :goto_15
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 684
    .line 685
    .line 686
    goto :goto_16

    .line 687
    :cond_21
    const v15, 0x2deb1ade

    .line 688
    .line 689
    .line 690
    invoke-interface {v14, v15}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 691
    .line 692
    .line 693
    goto :goto_15

    .line 694
    :goto_16
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 695
    .line 696
    .line 697
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 698
    .line 699
    .line 700
    move-result v0

    .line 701
    if-eqz v0, :cond_23

    .line 702
    .line 703
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 704
    .line 705
    .line 706
    goto :goto_17

    .line 707
    :cond_22
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 708
    .line 709
    .line 710
    :cond_23
    :goto_17
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 711
    .line 712
    .line 713
    move-result-object v8

    .line 714
    if-eqz v8, :cond_24

    .line 715
    .line 716
    new-instance v0, Lcom/zykj/mistake/feature/collection/filter/e;

    .line 717
    .line 718
    const/4 v7, 0x1

    .line 719
    move/from16 v2, p1

    .line 720
    .line 721
    move/from16 v3, p2

    .line 722
    .line 723
    invoke-direct/range {v0 .. v7}, Lcom/zykj/mistake/feature/collection/filter/e;-><init>(Ljava/lang/Object;ZZZLd6/d;II)V

    .line 724
    .line 725
    .line 726
    invoke-interface {v8, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 727
    .line 728
    .line 729
    :cond_24
    return-void
.end method

.method public static final c(Ljava/lang/String;JJLandroidx/compose/foundation/shape/RoundedCornerShape;Lr6/a;Landroidx/compose/runtime/Composer;I)V
    .locals 32

    .line 1
    move-wide/from16 v2, p1

    .line 2
    .line 3
    move-object/from16 v6, p5

    .line 4
    .line 5
    move-object/from16 v7, p6

    .line 6
    .line 7
    move/from16 v0, p8

    .line 8
    .line 9
    const-string v1, "shape"

    .line 10
    .line 11
    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v1, "onClick"

    .line 15
    .line 16
    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const v1, 0x2b2b45df

    .line 20
    .line 21
    .line 22
    move-object/from16 v4, p7

    .line 23
    .line 24
    invoke-interface {v4, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    and-int/lit8 v5, v0, 0x6

    .line 29
    .line 30
    if-nez v5, :cond_1

    .line 31
    .line 32
    move-object/from16 v5, p0

    .line 33
    .line 34
    invoke-interface {v4, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v8

    .line 38
    if-eqz v8, :cond_0

    .line 39
    .line 40
    const/4 v8, 0x4

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 v8, 0x2

    .line 43
    :goto_0
    or-int/2addr v8, v0

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    move-object/from16 v5, p0

    .line 46
    .line 47
    move v8, v0

    .line 48
    :goto_1
    and-int/lit8 v9, v0, 0x30

    .line 49
    .line 50
    if-nez v9, :cond_3

    .line 51
    .line 52
    invoke-interface {v4, v2, v3}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 53
    .line 54
    .line 55
    move-result v9

    .line 56
    if-eqz v9, :cond_2

    .line 57
    .line 58
    const/16 v9, 0x20

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_2
    const/16 v9, 0x10

    .line 62
    .line 63
    :goto_2
    or-int/2addr v8, v9

    .line 64
    :cond_3
    and-int/lit16 v9, v0, 0x180

    .line 65
    .line 66
    move-wide/from16 v14, p3

    .line 67
    .line 68
    if-nez v9, :cond_5

    .line 69
    .line 70
    invoke-interface {v4, v14, v15}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 71
    .line 72
    .line 73
    move-result v9

    .line 74
    if-eqz v9, :cond_4

    .line 75
    .line 76
    const/16 v9, 0x100

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_4
    const/16 v9, 0x80

    .line 80
    .line 81
    :goto_3
    or-int/2addr v8, v9

    .line 82
    :cond_5
    and-int/lit16 v9, v0, 0xc00

    .line 83
    .line 84
    if-nez v9, :cond_7

    .line 85
    .line 86
    invoke-interface {v4, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v9

    .line 90
    if-eqz v9, :cond_6

    .line 91
    .line 92
    const/16 v9, 0x800

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_6
    const/16 v9, 0x400

    .line 96
    .line 97
    :goto_4
    or-int/2addr v8, v9

    .line 98
    :cond_7
    and-int/lit16 v9, v0, 0x6000

    .line 99
    .line 100
    if-nez v9, :cond_9

    .line 101
    .line 102
    invoke-interface {v4, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v9

    .line 106
    if-eqz v9, :cond_8

    .line 107
    .line 108
    const/16 v9, 0x4000

    .line 109
    .line 110
    goto :goto_5

    .line 111
    :cond_8
    const/16 v9, 0x2000

    .line 112
    .line 113
    :goto_5
    or-int/2addr v8, v9

    .line 114
    :cond_9
    and-int/lit16 v9, v8, 0x2493

    .line 115
    .line 116
    const/16 v10, 0x2492

    .line 117
    .line 118
    const/4 v11, 0x0

    .line 119
    if-eq v9, v10, :cond_a

    .line 120
    .line 121
    const/4 v9, 0x1

    .line 122
    goto :goto_6

    .line 123
    :cond_a
    move v9, v11

    .line 124
    :goto_6
    and-int/lit8 v10, v8, 0x1

    .line 125
    .line 126
    invoke-interface {v4, v9, v10}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 127
    .line 128
    .line 129
    move-result v9

    .line 130
    if-eqz v9, :cond_10

    .line 131
    .line 132
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 133
    .line 134
    .line 135
    move-result v9

    .line 136
    if-eqz v9, :cond_b

    .line 137
    .line 138
    const/4 v9, -0x1

    .line 139
    const-string v10, "com.zykj.mistake.feature.notebook.detail.NavButton (MistakeDetailNavButtons.kt:134)"

    .line 140
    .line 141
    invoke-static {v1, v8, v9, v10}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 142
    .line 143
    .line 144
    :cond_b
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 145
    .line 146
    const/16 v9, 0x65

    .line 147
    .line 148
    int-to-float v9, v9

    .line 149
    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 150
    .line 151
    .line 152
    move-result v9

    .line 153
    const/16 v10, 0x24

    .line 154
    .line 155
    int-to-float v10, v10

    .line 156
    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 157
    .line 158
    .line 159
    move-result v10

    .line 160
    invoke-static {v1, v9, v10}, Landroidx/compose/foundation/layout/SizeKt;->size-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    invoke-static {v1, v2, v3, v6}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    const/4 v12, 0x7

    .line 169
    const/4 v13, 0x0

    .line 170
    move v9, v8

    .line 171
    const/4 v8, 0x0

    .line 172
    move v10, v9

    .line 173
    const/4 v9, 0x0

    .line 174
    move/from16 v16, v10

    .line 175
    .line 176
    const/4 v10, 0x0

    .line 177
    move v0, v11

    .line 178
    move-object v11, v7

    .line 179
    move-object v7, v1

    .line 180
    move/from16 v1, v16

    .line 181
    .line 182
    invoke-static/range {v7 .. v13}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lr6/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 183
    .line 184
    .line 185
    move-result-object v7

    .line 186
    sget-object v8, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 187
    .line 188
    invoke-virtual {v8}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 189
    .line 190
    .line 191
    move-result-object v8

    .line 192
    invoke-static {v8, v0}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 193
    .line 194
    .line 195
    move-result-object v8

    .line 196
    invoke-static {v4, v0}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 201
    .line 202
    .line 203
    move-result-object v9

    .line 204
    invoke-static {v4, v7}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 205
    .line 206
    .line 207
    move-result-object v7

    .line 208
    sget-object v10, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 209
    .line 210
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 211
    .line 212
    .line 213
    move-result-object v11

    .line 214
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 215
    .line 216
    .line 217
    move-result-object v12

    .line 218
    if-nez v12, :cond_c

    .line 219
    .line 220
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 221
    .line 222
    .line 223
    :cond_c
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 224
    .line 225
    .line 226
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 227
    .line 228
    .line 229
    move-result v12

    .line 230
    if-eqz v12, :cond_d

    .line 231
    .line 232
    invoke-interface {v4, v11}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 233
    .line 234
    .line 235
    goto :goto_7

    .line 236
    :cond_d
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 237
    .line 238
    .line 239
    :goto_7
    invoke-static {v4}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 240
    .line 241
    .line 242
    move-result-object v11

    .line 243
    invoke-static {v10, v11, v8, v11, v9}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 244
    .line 245
    .line 246
    move-result-object v8

    .line 247
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 248
    .line 249
    .line 250
    move-result v9

    .line 251
    if-nez v9, :cond_e

    .line 252
    .line 253
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v9

    .line 257
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 258
    .line 259
    .line 260
    move-result-object v12

    .line 261
    invoke-static {v9, v12}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v9

    .line 265
    if-nez v9, :cond_f

    .line 266
    .line 267
    :cond_e
    invoke-static {v0, v11, v0, v8}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 268
    .line 269
    .line 270
    :cond_f
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    invoke-static {v11, v7, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 275
    .line 276
    .line 277
    sget-object v0, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 278
    .line 279
    const/16 v0, 0xf

    .line 280
    .line 281
    invoke-static {v0}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 282
    .line 283
    .line 284
    move-result-wide v11

    .line 285
    and-int/lit8 v0, v1, 0xe

    .line 286
    .line 287
    or-int/lit16 v0, v0, 0xc00

    .line 288
    .line 289
    and-int/lit16 v1, v1, 0x380

    .line 290
    .line 291
    or-int v29, v0, v1

    .line 292
    .line 293
    const/16 v30, 0xc00

    .line 294
    .line 295
    const v31, 0x1dff2

    .line 296
    .line 297
    .line 298
    const/4 v8, 0x0

    .line 299
    const/4 v13, 0x0

    .line 300
    const/4 v14, 0x0

    .line 301
    const/4 v15, 0x0

    .line 302
    const-wide/16 v16, 0x0

    .line 303
    .line 304
    const/16 v18, 0x0

    .line 305
    .line 306
    const/16 v19, 0x0

    .line 307
    .line 308
    const-wide/16 v20, 0x0

    .line 309
    .line 310
    const/16 v22, 0x0

    .line 311
    .line 312
    const/16 v23, 0x0

    .line 313
    .line 314
    const/16 v24, 0x1

    .line 315
    .line 316
    const/16 v25, 0x0

    .line 317
    .line 318
    const/16 v26, 0x0

    .line 319
    .line 320
    const/16 v27, 0x0

    .line 321
    .line 322
    move-wide/from16 v9, p3

    .line 323
    .line 324
    move-object/from16 v28, v4

    .line 325
    .line 326
    move-object v7, v5

    .line 327
    invoke-static/range {v7 .. v31}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 328
    .line 329
    .line 330
    invoke-interface/range {v28 .. v28}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 331
    .line 332
    .line 333
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 334
    .line 335
    .line 336
    move-result v0

    .line 337
    if-eqz v0, :cond_11

    .line 338
    .line 339
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 340
    .line 341
    .line 342
    goto :goto_8

    .line 343
    :cond_10
    move-object/from16 v28, v4

    .line 344
    .line 345
    invoke-interface/range {v28 .. v28}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 346
    .line 347
    .line 348
    :cond_11
    :goto_8
    invoke-interface/range {v28 .. v28}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 349
    .line 350
    .line 351
    move-result-object v9

    .line 352
    if-eqz v9, :cond_12

    .line 353
    .line 354
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/l0;

    .line 355
    .line 356
    move-object/from16 v1, p0

    .line 357
    .line 358
    move-wide/from16 v4, p3

    .line 359
    .line 360
    move-object/from16 v7, p6

    .line 361
    .line 362
    move/from16 v8, p8

    .line 363
    .line 364
    invoke-direct/range {v0 .. v8}, Lcom/zykj/mistake/feature/notebook/detail/l0;-><init>(Ljava/lang/String;JJLandroidx/compose/foundation/shape/RoundedCornerShape;Lr6/a;I)V

    .line 365
    .line 366
    .line 367
    invoke-interface {v9, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 368
    .line 369
    .line 370
    :cond_12
    return-void
.end method
