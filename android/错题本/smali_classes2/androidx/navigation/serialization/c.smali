.class public final synthetic Landroidx/navigation/serialization/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/f;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/navigation/serialization/c;->a:I

    iput-object p2, p0, Landroidx/navigation/serialization/c;->b:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/navigation/serialization/c;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 60

    move-object/from16 v0, p0

    iget v1, v0, Landroidx/navigation/serialization/c;->a:I

    const-string v3, "$this$AnimatedVisibility"

    const/16 v7, 0xa

    const/16 v9, 0x12

    sget-object v10, Ld6/s;->a:Ld6/s;

    const/4 v12, -0x1

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/4 v8, 0x0

    const/4 v13, 0x1

    const/16 v18, 0xc

    iget-object v5, v0, Landroidx/navigation/serialization/c;->c:Ljava/lang/Object;

    iget-object v2, v0, Landroidx/navigation/serialization/c;->b:Ljava/lang/Object;

    packed-switch v1, :pswitch_data_0

    move-object/from16 v25, v2

    check-cast v25, Lr6/a;

    move-object/from16 v26, v5

    check-cast v26, Ljava/lang/String;

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/foundation/layout/BoxWithConstraintsScope;

    move-object/from16 v2, p2

    check-cast v2, Landroidx/compose/runtime/Composer;

    move-object/from16 v3, p3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    .line 1
    const-string v5, "$this$BoxWithConstraints"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v5, v3, 0x6

    if-nez v5, :cond_1

    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/16 v16, 0x4

    goto :goto_0

    :cond_0
    const/16 v16, 0x2

    :goto_0
    or-int v3, v3, v16

    :cond_1
    and-int/lit8 v5, v3, 0x13

    if-eq v5, v9, :cond_2

    move v5, v13

    goto :goto_1

    :cond_2
    move v5, v14

    :goto_1
    and-int/lit8 v4, v3, 0x1

    invoke-interface {v2, v5, v4}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v4

    if-eqz v4, :cond_e

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v4

    if-eqz v4, :cond_3

    const v4, -0x532a6f45

    const-string v5, "com.zykj.mistake.feature.review.RecommendedExercisesCard.<anonymous> (ReviewScreen.kt:226)"

    invoke-static {v4, v3, v12, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 2
    :cond_3
    sget v3, Lcom/zykj/mistake/R$drawable;->bg_recommended_exercises_decoration:I

    invoke-static {v3, v2, v14}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    move-result-object v27

    .line 3
    sget-object v3, Landroidx/compose/ui/layout/ContentScale;->Companion:Landroidx/compose/ui/layout/ContentScale$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/layout/ContentScale$Companion;->getFillBounds()Landroidx/compose/ui/layout/ContentScale;

    move-result-object v31

    .line 4
    sget-object v4, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    invoke-static {v4, v15, v13, v8}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v29

    const/16 v35, 0x61b0

    const/16 v36, 0x68

    const/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    move-object/from16 v34, v2

    .line 5
    invoke-static/range {v27 .. v36}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 6
    invoke-interface {v1}, Landroidx/compose/foundation/layout/BoxWithConstraintsScope;->getMaxHeight-D9Ej5fM()F

    move-result v5

    const v12, 0x3f4c94c9

    mul-float/2addr v5, v12

    .line 7
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v5

    .line 8
    sget v12, Lcom/zykj/mistake/R$drawable;->bg_recommended_exercises:I

    invoke-static {v12, v2, v14}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    move-result-object v27

    .line 9
    invoke-virtual/range {v27 .. v27}, Landroidx/compose/ui/graphics/painter/Painter;->getIntrinsicSize-NH-jbRc()J

    move-result-wide v12

    const/16 v8, 0x20

    shr-long/2addr v12, v8

    long-to-int v12, v12

    .line 10
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v12

    .line 11
    invoke-virtual/range {v27 .. v27}, Landroidx/compose/ui/graphics/painter/Painter;->getIntrinsicSize-NH-jbRc()J

    move-result-wide v16

    const-wide v21, 0xffffffffL

    move/from16 p1, v12

    and-long v11, v16, v21

    long-to-int v11, v11

    .line 12
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v11

    div-float v12, p1, v11

    .line 13
    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v11

    .line 14
    invoke-static {v12}, Ljava/lang/Math;->abs(F)F

    move-result v13

    const v16, 0x7f7fffff    # Float.MAX_VALUE

    cmpg-float v13, v13, v16

    if-gtz v13, :cond_4

    cmpl-float v12, v12, v15

    if-lez v12, :cond_4

    move-object/from16 v20, v11

    goto :goto_2

    :cond_4
    const/16 v20, 0x0

    :goto_2
    if-eqz v20, :cond_5

    .line 15
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Float;->floatValue()F

    move-result v11

    goto :goto_3

    :cond_5
    const/high16 v11, 0x3f800000    # 1.0f

    .line 16
    :goto_3
    invoke-virtual {v3}, Landroidx/compose/ui/layout/ContentScale$Companion;->getFillBounds()Landroidx/compose/ui/layout/ContentScale;

    move-result-object v31

    .line 17
    sget-object v3, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/Alignment$Companion;->getBottomEnd()Landroidx/compose/ui/Alignment;

    move-result-object v12

    invoke-interface {v1, v4, v12}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    move-result-object v32

    int-to-float v7, v7

    .line 18
    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v35

    const/16 v37, 0xb

    const/16 v38, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v36, 0x0

    .line 19
    invoke-static/range {v32 .. v38}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    .line 20
    invoke-static {v7, v5}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v7

    mul-float/2addr v5, v11

    .line 21
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v5

    .line 22
    invoke-static {v7, v5}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v29

    const/16 v35, 0x6030

    const/16 v36, 0x68

    const/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    move-object/from16 v34, v2

    .line 23
    invoke-static/range {v27 .. v36}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 24
    invoke-virtual {v3}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    move-result-object v5

    invoke-interface {v1, v4, v5}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    move-result-object v27

    int-to-float v5, v9

    .line 25
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v28

    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v29

    const/16 v32, 0xc

    const/16 v30, 0x0

    const/16 v31, 0x0

    .line 26
    invoke-static/range {v27 .. v33}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    .line 27
    sget-object v7, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v7}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    move-result-object v11

    .line 28
    invoke-virtual {v3}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    move-result-object v12

    .line 29
    invoke-static {v11, v12, v2, v14}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v11

    .line 30
    invoke-static {v2, v14}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v12

    .line 31
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v13

    .line 32
    invoke-static {v2, v5}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    .line 33
    sget-object v15, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    move/from16 v21, v9

    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    move-result-object v9

    .line 34
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v16

    if-nez v16, :cond_6

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 35
    :cond_6
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 36
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v16

    if-eqz v16, :cond_7

    .line 37
    invoke-interface {v2, v9}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    goto :goto_4

    .line 38
    :cond_7
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 39
    :goto_4
    invoke-static {v2}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v9

    .line 40
    invoke-static {v15, v9, v11, v9, v13}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    move-result-object v11

    .line 41
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v13

    if-nez v13, :cond_8

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v13, v6}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_9

    .line 42
    :cond_8
    invoke-static {v12, v9, v12, v11}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 43
    :cond_9
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    move-result-object v6

    invoke-static {v9, v5, v6}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 44
    sget-object v5, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 45
    invoke-virtual {v3}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    move-result-object v5

    .line 46
    invoke-virtual {v7}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    move-result-object v6

    const/16 v7, 0x30

    .line 47
    invoke-static {v6, v5, v2, v7}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v5

    .line 48
    invoke-static {v2, v14}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v6

    .line 49
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v7

    .line 50
    invoke-static {v2, v4}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    .line 51
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    move-result-object v11

    .line 52
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v12

    if-nez v12, :cond_a

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 53
    :cond_a
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 54
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v12

    if-eqz v12, :cond_b

    .line 55
    invoke-interface {v2, v11}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    goto :goto_5

    .line 56
    :cond_b
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 57
    :goto_5
    invoke-static {v2}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v11

    .line 58
    invoke-static {v15, v11, v5, v11, v7}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    move-result-object v5

    .line 59
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v7

    if-nez v7, :cond_c

    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v7, v12}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_d

    .line 60
    :cond_c
    invoke-static {v6, v11, v6, v5}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 61
    :cond_d
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    move-result-object v5

    invoke-static {v11, v9, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 62
    sget-object v5, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 63
    sget v5, Lcom/zykj/mistake/R$drawable;->ic_recommended_exercises:I

    invoke-static {v5, v2, v14}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    move-result-object v27

    int-to-float v5, v8

    .line 64
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v5

    .line 65
    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v29

    const/16 v35, 0x1b0

    const/16 v36, 0x78

    const/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    move-object/from16 v34, v2

    .line 66
    invoke-static/range {v27 .. v36}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    const-wide v5, 0xff15171aL

    .line 67
    invoke-static {v5, v6}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v29

    .line 68
    invoke-static/range {v21 .. v21}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    move-result-wide v5

    .line 69
    sget-object v7, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    invoke-virtual {v7}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    move-result-object v7

    const/16 v8, 0xe

    int-to-float v8, v8

    .line 70
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v33

    const/16 v37, 0xe

    const/16 v38, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    move-object/from16 v32, v4

    .line 71
    invoke-static/range {v32 .. v38}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v28

    const/16 v50, 0x0

    const v51, 0x1ffd0

    .line 72
    const-string/jumbo v27, "\u63a8\u8350\u7ec3\u4e60"

    const/16 v33, 0x0

    const/16 v35, 0x0

    const-wide/16 v36, 0x0

    const/16 v39, 0x0

    const-wide/16 v40, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const v49, 0x30db6

    move-object/from16 v48, v2

    move-wide/from16 v31, v5

    move-object/from16 v34, v7

    invoke-static/range {v27 .. v51}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 73
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endNode()V

    const-wide v5, 0xff666666L

    .line 74
    invoke-static {v5, v6}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v28

    .line 75
    invoke-static/range {v18 .. v18}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    move-result-wide v30

    const/16 v5, 0x2e

    int-to-float v5, v5

    .line 76
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v33

    const/4 v5, 0x3

    int-to-float v5, v5

    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v34

    const/16 v37, 0xc

    const/16 v35, 0x0

    const/16 v36, 0x0

    move-object/from16 v32, v4

    .line 77
    invoke-static/range {v32 .. v38}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v27

    const/16 v49, 0x0

    const v50, 0x1fff0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const-wide/16 v35, 0x0

    const/16 v37, 0x0

    const-wide/16 v39, 0x0

    const/16 v41, 0x0

    const/16 v45, 0x0

    const/16 v48, 0xdb0

    move-object/from16 v47, v2

    .line 78
    invoke-static/range {v26 .. v50}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 79
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endNode()V

    const-wide v5, 0xff1576ffL

    .line 80
    invoke-static {v5, v6}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v20

    .line 81
    sget-object v5, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v5}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    move-result-wide v22

    .line 82
    invoke-virtual {v3}, Landroidx/compose/ui/Alignment$Companion;->getBottomStart()Landroidx/compose/ui/Alignment;

    move-result-object v3

    invoke-interface {v1, v4, v3}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const/16 v1, 0x18

    int-to-float v1, v1

    .line 83
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v12

    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v15

    const/16 v16, 0x6

    const/16 v17, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    .line 84
    invoke-static/range {v11 .. v17}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v24

    const/16 v28, 0x1b6

    const/16 v29, 0x20

    .line 85
    const-string/jumbo v19, "\u53bb\u7ec3\u4e60"

    const/16 v26, 0x0

    move-object/from16 v27, v2

    invoke-static/range {v19 .. v29}, Lcom/zykj/mistake/feature/review/y;->d(Ljava/lang/String;JJLandroidx/compose/ui/Modifier;Lr6/a;ZLandroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_6

    .line 86
    :cond_e
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    :cond_f
    :goto_6
    return-object v10

    :pswitch_0
    move/from16 v21, v9

    .line 87
    check-cast v2, Lcom/zykj/mistake/feature/collection/filter/s0;

    check-cast v5, Lr6/c;

    move-object/from16 v1, p1

    check-cast v1, Landroidx/compose/animation/AnimatedVisibilityScope;

    move-object/from16 v4, p2

    check-cast v4, Landroidx/compose/runtime/Composer;

    move-object/from16 v6, p3

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    .line 88
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_10

    const v1, 0x15a78e96

    const-string v3, "com.zykj.mistake.feature.collection.filter.MistakeCollectionFilterResultScreen.<anonymous>.<anonymous> (MistakeCollectionFilterResultScreen.kt:132)"

    invoke-static {v1, v6, v12, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 89
    :cond_10
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    const/4 v3, 0x0

    invoke-static {v1, v15, v13, v3}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxHeight$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    .line 90
    sget-object v3, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    move-result-object v3

    .line 91
    invoke-static {v3, v14}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v3

    .line 92
    invoke-static {v4, v14}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v8

    .line 93
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v9

    .line 94
    invoke-static {v4, v6}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    .line 95
    sget-object v11, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    move-result-object v12

    .line 96
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v14

    if-nez v14, :cond_11

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 97
    :cond_11
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 98
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v14

    if-eqz v14, :cond_12

    .line 99
    invoke-interface {v4, v12}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    goto :goto_7

    .line 100
    :cond_12
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 101
    :goto_7
    invoke-static {v4}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v12

    .line 102
    invoke-static {v11, v12, v3, v12, v9}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    move-result-object v3

    .line 103
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v9

    if-nez v9, :cond_13

    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v9, v14}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_14

    .line 104
    :cond_13
    invoke-static {v8, v12, v8, v3}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 105
    :cond_14
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    move-result-object v3

    invoke-static {v12, v6, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 106
    sget-object v3, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 107
    iget v3, v2, Lcom/zykj/mistake/feature/collection/filter/s0;->u:I

    .line 108
    iget-object v6, v2, Lcom/zykj/mistake/feature/collection/filter/s0;->v:Ljava/lang/String;

    .line 109
    iget-object v8, v2, Lcom/zykj/mistake/feature/collection/filter/s0;->w:Ljava/lang/String;

    .line 110
    iget-boolean v9, v2, Lcom/zykj/mistake/feature/collection/filter/s0;->x:Z

    .line 111
    iget-object v11, v2, Lcom/zykj/mistake/feature/collection/filter/s0;->s:Ljava/util/List;

    .line 112
    iget-object v12, v2, Lcom/zykj/mistake/feature/collection/filter/s0;->t:Ljava/util/List;

    .line 113
    iget-object v14, v2, Lcom/zykj/mistake/feature/collection/filter/s0;->y:Ljava/util/Set;

    .line 114
    iget-object v7, v2, Lcom/zykj/mistake/feature/collection/filter/s0;->z:Ljava/lang/Integer;

    .line 115
    iget-object v13, v2, Lcom/zykj/mistake/feature/collection/filter/s0;->A:Ljava/lang/Integer;

    .line 116
    iget-object v15, v2, Lcom/zykj/mistake/feature/collection/filter/s0;->B:Ljava/lang/Integer;

    .line 117
    iget v0, v2, Lcom/zykj/mistake/feature/collection/filter/s0;->D:I

    move/from16 v33, v0

    .line 118
    iget-boolean v0, v2, Lcom/zykj/mistake/feature/collection/filter/s0;->E:Z

    move/from16 v34, v0

    .line 119
    iget-object v0, v2, Lcom/zykj/mistake/feature/collection/filter/s0;->F:Ljava/util/Set;

    move-object/from16 v35, v0

    const/16 v0, 0x208

    int-to-float v0, v0

    .line 120
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    .line 121
    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move/from16 v16, v3

    move-object/from16 v24, v6

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x1

    .line 122
    invoke-static {v0, v1, v6, v3}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxHeight$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v36

    .line 123
    iget-boolean v0, v2, Lcom/zykj/mistake/feature/collection/filter/s0;->m:Z

    .line 124
    iget v1, v2, Lcom/zykj/mistake/feature/collection/filter/s0;->C:I

    .line 125
    invoke-interface {v4, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    .line 126
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_15

    .line 127
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_16

    .line 128
    :cond_15
    new-instance v3, Lcom/zykj/mistake/feature/collection/detail/a1;

    const/16 v2, 0x11

    invoke-direct {v3, v5, v2}, Lcom/zykj/mistake/feature/collection/detail/a1;-><init>(Lr6/c;I)V

    .line 129
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 130
    :cond_16
    move-object/from16 v40, v3

    check-cast v40, Lr6/c;

    .line 131
    invoke-interface {v4, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    .line 132
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_17

    .line 133
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_18

    .line 134
    :cond_17
    new-instance v3, Lcom/zykj/mistake/feature/ask/h0;

    const/16 v2, 0x1a

    invoke-direct {v3, v5, v2}, Lcom/zykj/mistake/feature/ask/h0;-><init>(Lr6/c;I)V

    .line 135
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 136
    :cond_18
    move-object/from16 v41, v3

    check-cast v41, Lr6/a;

    .line 137
    invoke-interface {v4, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    .line 138
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_19

    .line 139
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_1a

    .line 140
    :cond_19
    new-instance v3, Lcom/zykj/mistake/feature/collection/detail/a1;

    const/16 v2, 0xa

    invoke-direct {v3, v5, v2}, Lcom/zykj/mistake/feature/collection/detail/a1;-><init>(Lr6/c;I)V

    .line 141
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 142
    :cond_1a
    move-object/from16 v42, v3

    check-cast v42, Lr6/c;

    .line 143
    invoke-interface {v4, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    .line 144
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_1b

    .line 145
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_1c

    .line 146
    :cond_1b
    new-instance v3, Lcom/zykj/mistake/feature/collection/detail/a1;

    const/16 v2, 0xb

    invoke-direct {v3, v5, v2}, Lcom/zykj/mistake/feature/collection/detail/a1;-><init>(Lr6/c;I)V

    .line 147
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 148
    :cond_1c
    move-object/from16 v43, v3

    check-cast v43, Lr6/c;

    .line 149
    invoke-interface {v4, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    .line 150
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_1d

    .line 151
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_1e

    .line 152
    :cond_1d
    new-instance v3, Lcom/zykj/mistake/feature/collection/detail/a1;

    move/from16 v2, v18

    invoke-direct {v3, v5, v2}, Lcom/zykj/mistake/feature/collection/detail/a1;-><init>(Lr6/c;I)V

    .line 153
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 154
    :cond_1e
    move-object/from16 v44, v3

    check-cast v44, Lr6/c;

    .line 155
    invoke-interface {v4, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    .line 156
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_1f

    .line 157
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_20

    .line 158
    :cond_1f
    new-instance v3, Lcom/zykj/mistake/feature/collection/detail/a1;

    const/16 v2, 0xd

    invoke-direct {v3, v5, v2}, Lcom/zykj/mistake/feature/collection/detail/a1;-><init>(Lr6/c;I)V

    .line 159
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 160
    :cond_20
    move-object/from16 v45, v3

    check-cast v45, Lr6/c;

    .line 161
    invoke-interface {v4, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    .line 162
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_21

    .line 163
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_22

    .line 164
    :cond_21
    new-instance v3, Lcom/zykj/mistake/feature/collection/detail/a1;

    const/16 v2, 0xe

    invoke-direct {v3, v5, v2}, Lcom/zykj/mistake/feature/collection/detail/a1;-><init>(Lr6/c;I)V

    .line 165
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 166
    :cond_22
    move-object/from16 v46, v3

    check-cast v46, Lr6/c;

    .line 167
    invoke-interface {v4, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    .line 168
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_23

    .line 169
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_24

    .line 170
    :cond_23
    new-instance v3, Lcom/zykj/mistake/feature/collection/detail/a1;

    const/16 v2, 0xf

    invoke-direct {v3, v5, v2}, Lcom/zykj/mistake/feature/collection/detail/a1;-><init>(Lr6/c;I)V

    .line 171
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 172
    :cond_24
    move-object/from16 v47, v3

    check-cast v47, Lr6/c;

    .line 173
    invoke-interface {v4, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    .line 174
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_25

    .line 175
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_26

    .line 176
    :cond_25
    new-instance v3, Lcom/zykj/mistake/feature/ask/h0;

    const/16 v2, 0x1b

    invoke-direct {v3, v5, v2}, Lcom/zykj/mistake/feature/ask/h0;-><init>(Lr6/c;I)V

    .line 177
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 178
    :cond_26
    move-object/from16 v48, v3

    check-cast v48, Lr6/a;

    .line 179
    invoke-interface {v4, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    .line 180
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_27

    .line 181
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_28

    .line 182
    :cond_27
    new-instance v3, Lcom/zykj/mistake/feature/ask/h0;

    const/16 v2, 0x1c

    invoke-direct {v3, v5, v2}, Lcom/zykj/mistake/feature/ask/h0;-><init>(Lr6/c;I)V

    .line 183
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 184
    :cond_28
    move-object/from16 v49, v3

    check-cast v49, Lr6/a;

    .line 185
    invoke-interface {v4, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    .line 186
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_29

    .line 187
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_2a

    .line 188
    :cond_29
    new-instance v3, Lcom/zykj/mistake/feature/collection/detail/a1;

    move/from16 v2, v21

    invoke-direct {v3, v5, v2}, Lcom/zykj/mistake/feature/collection/detail/a1;-><init>(Lr6/c;I)V

    .line 189
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 190
    :cond_2a
    move-object/from16 v50, v3

    check-cast v50, Lr6/c;

    .line 191
    invoke-interface {v4, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    .line 192
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_2b

    .line 193
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_2c

    .line 194
    :cond_2b
    new-instance v3, Lcom/zykj/mistake/feature/ask/h0;

    const/16 v2, 0x18

    invoke-direct {v3, v5, v2}, Lcom/zykj/mistake/feature/ask/h0;-><init>(Lr6/c;I)V

    .line 195
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 196
    :cond_2c
    move-object/from16 v51, v3

    check-cast v51, Lr6/a;

    .line 197
    invoke-interface {v4, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    .line 198
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_2d

    .line 199
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_2e

    .line 200
    :cond_2d
    new-instance v3, Lcom/zykj/mistake/feature/ask/h0;

    const/16 v2, 0x19

    invoke-direct {v3, v5, v2}, Lcom/zykj/mistake/feature/ask/h0;-><init>(Lr6/c;I)V

    .line 201
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 202
    :cond_2e
    move-object/from16 v52, v3

    check-cast v52, Lr6/a;

    const/16 v55, 0x6c00

    const/16 v56, 0x0

    const/16 v37, 0x1

    const/16 v54, 0x0

    move/from16 v38, v0

    move/from16 v39, v1

    move-object/from16 v53, v4

    move-object/from16 v30, v7

    move-object/from16 v25, v8

    move/from16 v26, v9

    move-object/from16 v27, v11

    move-object/from16 v28, v12

    move-object/from16 v31, v13

    move-object/from16 v29, v14

    move-object/from16 v32, v15

    move/from16 v23, v16

    .line 203
    invoke-static/range {v23 .. v56}, Lcom/zykj/mistake/feature/collection/filter/i;->d(ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IZLjava/util/Set;Landroidx/compose/ui/Modifier;ZZILr6/c;Lr6/a;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/a;Lr6/a;Lr6/c;Lr6/a;Lr6/a;Landroidx/compose/runtime/Composer;III)V

    .line 204
    invoke-interface/range {v53 .. v53}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 205
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2f

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_2f
    return-object v10

    .line 206
    :pswitch_1
    check-cast v2, Lcom/zykj/mistake/feature/collection/detail/z0;

    check-cast v5, Lr6/c;

    move-object/from16 v0, p1

    check-cast v0, Landroidx/compose/animation/AnimatedVisibilityScope;

    move-object/from16 v1, p2

    check-cast v1, Landroidx/compose/runtime/Composer;

    move-object/from16 v4, p3

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 207
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_30

    const v0, -0x4619d991

    const-string v3, "com.zykj.mistake.feature.collection.detail.MistakeCollectionDetailScreen.<anonymous>.<anonymous> (MistakeCollectionDetailScreen.kt:106)"

    invoke-static {v0, v4, v12, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 208
    :cond_30
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x1

    invoke-static {v0, v3, v6, v4}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxHeight$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    .line 209
    sget-object v3, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    move-result-object v3

    .line 210
    invoke-static {v3, v14}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v3

    .line 211
    invoke-static {v1, v14}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v4

    .line 212
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v6

    .line 213
    invoke-static {v1, v7}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    .line 214
    sget-object v8, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    move-result-object v9

    .line 215
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v11

    if-nez v11, :cond_31

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 216
    :cond_31
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 217
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v11

    if-eqz v11, :cond_32

    .line 218
    invoke-interface {v1, v9}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    goto :goto_8

    .line 219
    :cond_32
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 220
    :goto_8
    invoke-static {v1}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v9

    .line 221
    invoke-static {v8, v9, v3, v9, v6}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    move-result-object v3

    .line 222
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v6

    if-nez v6, :cond_33

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v6, v11}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_34

    .line 223
    :cond_33
    invoke-static {v4, v9, v4, v3}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 224
    :cond_34
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    move-result-object v3

    invoke-static {v9, v7, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 225
    sget-object v3, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 226
    iget v3, v2, Lcom/zykj/mistake/feature/collection/detail/z0;->o:I

    .line 227
    iget-object v4, v2, Lcom/zykj/mistake/feature/collection/detail/z0;->p:Ljava/lang/String;

    .line 228
    iget-object v6, v2, Lcom/zykj/mistake/feature/collection/detail/z0;->q:Ljava/lang/String;

    .line 229
    iget-boolean v7, v2, Lcom/zykj/mistake/feature/collection/detail/z0;->r:Z

    .line 230
    iget-object v8, v2, Lcom/zykj/mistake/feature/collection/detail/z0;->m:Ljava/util/List;

    .line 231
    iget-object v9, v2, Lcom/zykj/mistake/feature/collection/detail/z0;->n:Ljava/util/List;

    .line 232
    iget-object v11, v2, Lcom/zykj/mistake/feature/collection/detail/z0;->s:Ljava/util/Set;

    .line 233
    iget-object v12, v2, Lcom/zykj/mistake/feature/collection/detail/z0;->t:Ljava/lang/Integer;

    .line 234
    iget-object v13, v2, Lcom/zykj/mistake/feature/collection/detail/z0;->u:Ljava/lang/Integer;

    .line 235
    iget-object v15, v2, Lcom/zykj/mistake/feature/collection/detail/z0;->v:Ljava/lang/Integer;

    .line 236
    iget v14, v2, Lcom/zykj/mistake/feature/collection/detail/z0;->x:I

    move/from16 v26, v3

    .line 237
    iget-boolean v3, v2, Lcom/zykj/mistake/feature/collection/detail/z0;->z:Z

    move/from16 v37, v3

    .line 238
    iget-object v3, v2, Lcom/zykj/mistake/feature/collection/detail/z0;->A:Ljava/util/Set;

    move-object/from16 v38, v3

    const/16 v3, 0x208

    int-to-float v3, v3

    .line 239
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v3

    .line 240
    invoke-static {v0, v3}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object/from16 v27, v4

    move-object/from16 v28, v6

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x1

    .line 241
    invoke-static {v0, v3, v6, v4}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxHeight$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v39

    .line 242
    iget-object v0, v2, Lcom/zykj/mistake/feature/collection/detail/z0;->f:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;

    .line 243
    sget-object v3, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;->ADD_FILTER:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailContract$DrawerMode;

    if-ne v0, v3, :cond_35

    const/16 v40, 0x1

    goto :goto_9

    :cond_35
    const/16 v40, 0x0

    :goto_9
    if-ne v0, v3, :cond_36

    const/16 v41, 0x1

    goto :goto_a

    :cond_36
    const/16 v41, 0x0

    .line 244
    :goto_a
    iget v0, v2, Lcom/zykj/mistake/feature/collection/detail/z0;->w:I

    .line 245
    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    .line 246
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_37

    .line 247
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_38

    .line 248
    :cond_37
    new-instance v3, Lcom/zykj/mistake/feature/collection/detail/a1;

    const/16 v2, 0x8

    invoke-direct {v3, v5, v2}, Lcom/zykj/mistake/feature/collection/detail/a1;-><init>(Lr6/c;I)V

    .line 249
    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 250
    :cond_38
    move-object/from16 v43, v3

    check-cast v43, Lr6/c;

    .line 251
    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    .line 252
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_39

    .line 253
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_3a

    .line 254
    :cond_39
    new-instance v3, Lcom/zykj/mistake/feature/ask/h0;

    const/4 v2, 0x4

    invoke-direct {v3, v5, v2}, Lcom/zykj/mistake/feature/ask/h0;-><init>(Lr6/c;I)V

    .line 255
    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 256
    :cond_3a
    move-object/from16 v44, v3

    check-cast v44, Lr6/a;

    .line 257
    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    .line 258
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_3b

    .line 259
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_3c

    .line 260
    :cond_3b
    new-instance v3, Lcom/zykj/mistake/feature/collection/detail/a1;

    const/4 v6, 0x1

    invoke-direct {v3, v5, v6}, Lcom/zykj/mistake/feature/collection/detail/a1;-><init>(Lr6/c;I)V

    .line 261
    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 262
    :cond_3c
    move-object/from16 v45, v3

    check-cast v45, Lr6/c;

    .line 263
    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    .line 264
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_3d

    .line 265
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_3e

    .line 266
    :cond_3d
    new-instance v3, Lcom/zykj/mistake/feature/collection/detail/a1;

    const/4 v2, 0x2

    invoke-direct {v3, v5, v2}, Lcom/zykj/mistake/feature/collection/detail/a1;-><init>(Lr6/c;I)V

    .line 267
    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 268
    :cond_3e
    move-object/from16 v46, v3

    check-cast v46, Lr6/c;

    .line 269
    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    .line 270
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_3f

    .line 271
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_40

    .line 272
    :cond_3f
    new-instance v3, Lcom/zykj/mistake/feature/collection/detail/a1;

    const/4 v2, 0x3

    invoke-direct {v3, v5, v2}, Lcom/zykj/mistake/feature/collection/detail/a1;-><init>(Lr6/c;I)V

    .line 273
    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 274
    :cond_40
    move-object/from16 v47, v3

    check-cast v47, Lr6/c;

    .line 275
    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    .line 276
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_41

    .line 277
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_42

    .line 278
    :cond_41
    new-instance v3, Lcom/zykj/mistake/feature/collection/detail/a1;

    const/4 v2, 0x4

    invoke-direct {v3, v5, v2}, Lcom/zykj/mistake/feature/collection/detail/a1;-><init>(Lr6/c;I)V

    .line 279
    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 280
    :cond_42
    move-object/from16 v48, v3

    check-cast v48, Lr6/c;

    .line 281
    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    .line 282
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    const/4 v4, 0x5

    if-nez v2, :cond_43

    .line 283
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_44

    .line 284
    :cond_43
    new-instance v3, Lcom/zykj/mistake/feature/collection/detail/a1;

    invoke-direct {v3, v5, v4}, Lcom/zykj/mistake/feature/collection/detail/a1;-><init>(Lr6/c;I)V

    .line 285
    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 286
    :cond_44
    move-object/from16 v49, v3

    check-cast v49, Lr6/c;

    .line 287
    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    .line 288
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    const/4 v6, 0x6

    if-nez v2, :cond_45

    .line 289
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_46

    .line 290
    :cond_45
    new-instance v3, Lcom/zykj/mistake/feature/collection/detail/a1;

    invoke-direct {v3, v5, v6}, Lcom/zykj/mistake/feature/collection/detail/a1;-><init>(Lr6/c;I)V

    .line 291
    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 292
    :cond_46
    move-object/from16 v50, v3

    check-cast v50, Lr6/c;

    .line 293
    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    .line 294
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_47

    .line 295
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_48

    .line 296
    :cond_47
    new-instance v3, Lcom/zykj/mistake/feature/ask/h0;

    invoke-direct {v3, v5, v4}, Lcom/zykj/mistake/feature/ask/h0;-><init>(Lr6/c;I)V

    .line 297
    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 298
    :cond_48
    move-object/from16 v51, v3

    check-cast v51, Lr6/a;

    .line 299
    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    .line 300
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_49

    .line 301
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_4a

    .line 302
    :cond_49
    new-instance v3, Lcom/zykj/mistake/feature/ask/h0;

    invoke-direct {v3, v5, v6}, Lcom/zykj/mistake/feature/ask/h0;-><init>(Lr6/c;I)V

    .line 303
    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 304
    :cond_4a
    move-object/from16 v52, v3

    check-cast v52, Lr6/a;

    .line 305
    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    .line 306
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_4b

    .line 307
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_4c

    .line 308
    :cond_4b
    new-instance v3, Lcom/zykj/mistake/feature/collection/detail/a1;

    const/16 v2, 0x9

    invoke-direct {v3, v5, v2}, Lcom/zykj/mistake/feature/collection/detail/a1;-><init>(Lr6/c;I)V

    .line 309
    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 310
    :cond_4c
    move-object/from16 v53, v3

    check-cast v53, Lr6/c;

    .line 311
    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    .line 312
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_4d

    .line 313
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_4e

    .line 314
    :cond_4d
    new-instance v3, Lcom/zykj/mistake/feature/ask/h0;

    const/16 v2, 0x17

    invoke-direct {v3, v5, v2}, Lcom/zykj/mistake/feature/ask/h0;-><init>(Lr6/c;I)V

    .line 315
    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 316
    :cond_4e
    move-object/from16 v54, v3

    check-cast v54, Lr6/a;

    .line 317
    invoke-interface {v1, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    .line 318
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_4f

    .line 319
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_50

    .line 320
    :cond_4f
    new-instance v3, Lcom/zykj/mistake/feature/ask/h0;

    const/4 v2, 0x3

    invoke-direct {v3, v5, v2}, Lcom/zykj/mistake/feature/ask/h0;-><init>(Lr6/c;I)V

    .line 321
    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 322
    :cond_50
    move-object/from16 v55, v3

    check-cast v55, Lr6/a;

    const/16 v58, 0xc00

    const/16 v59, 0x0

    const/16 v57, 0x0

    move/from16 v42, v0

    move-object/from16 v56, v1

    move/from16 v29, v7

    move-object/from16 v30, v8

    move-object/from16 v31, v9

    move-object/from16 v32, v11

    move-object/from16 v33, v12

    move-object/from16 v34, v13

    move/from16 v36, v14

    move-object/from16 v35, v15

    .line 323
    invoke-static/range {v26 .. v59}, Lcom/zykj/mistake/feature/collection/filter/i;->d(ILjava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/util/Set;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IZLjava/util/Set;Landroidx/compose/ui/Modifier;ZZILr6/c;Lr6/a;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/a;Lr6/a;Lr6/c;Lr6/a;Lr6/a;Landroidx/compose/runtime/Composer;III)V

    .line 324
    invoke-interface/range {v56 .. v56}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 325
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_51

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_51
    return-object v10

    .line 326
    :pswitch_2
    check-cast v2, Ljava/util/Map;

    check-cast v5, Landroidx/navigation/serialization/RouteBuilder;

    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    move-object/from16 v1, p2

    check-cast v1, Ljava/lang/String;

    move-object/from16 v3, p3

    check-cast v3, Landroidx/navigation/NavType;

    invoke-static {v2, v5, v0, v1, v3}, Landroidx/navigation/serialization/RouteSerializerKt;->a(Ljava/util/Map;Landroidx/navigation/serialization/RouteBuilder;ILjava/lang/String;Landroidx/navigation/NavType;)Ld6/s;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
