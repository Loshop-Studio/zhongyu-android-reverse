.class public final Landroidx/compose/foundation/pager/LazyLayoutPagerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final Pager-eLwUrMk(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/gestures/TargetedFlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;IFLandroidx/compose/foundation/pager/PageSize;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Lhd/l;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Lhd/r;Landroidx/compose/runtime/Composer;III)V
    .locals 30
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/foundation/pager/PagerState;",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "Z",
            "Landroidx/compose/foundation/gestures/Orientation;",
            "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;",
            "Z",
            "Landroidx/compose/foundation/OverscrollEffect;",
            "IF",
            "Landroidx/compose/foundation/pager/PageSize;",
            "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;",
            "Lhd/l;",
            "Landroidx/compose/ui/Alignment$Horizontal;",
            "Landroidx/compose/ui/Alignment$Vertical;",
            "Landroidx/compose/foundation/gestures/snapping/SnapPosition;",
            "Lhd/r;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v0, p3

    move-object/from16 v8, p4

    move-object/from16 v9, p5

    move/from16 v10, p6

    move-object/from16 v11, p11

    move/from16 v12, p18

    move/from16 v13, p19

    move/from16 v14, p20

    const v3, 0x43111c3a    # 145.11026f

    move-object/from16 v4, p17

    .line 1
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v15

    and-int/lit8 v3, v14, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v3, v12, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v12, 0x6

    if-nez v3, :cond_2

    invoke-interface {v15, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v12

    goto :goto_1

    :cond_2
    move v3, v12

    :goto_1
    and-int/lit8 v6, v14, 0x2

    if-eqz v6, :cond_3

    or-int/lit8 v3, v3, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v6, v12, 0x30

    if-nez v6, :cond_5

    invoke-interface {v15, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    :cond_5
    :goto_3
    and-int/lit8 v6, v14, 0x4

    const/16 v16, 0x80

    const/16 v17, 0x100

    if-eqz v6, :cond_7

    or-int/lit16 v3, v3, 0x180

    :cond_6
    move-object/from16 v6, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v6, v12, 0x180

    if-nez v6, :cond_6

    move-object/from16 v6, p2

    invoke-interface {v15, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_8

    move/from16 v18, v17

    goto :goto_4

    :cond_8
    move/from16 v18, v16

    :goto_4
    or-int v3, v3, v18

    :goto_5
    and-int/lit8 v18, v14, 0x8

    const/16 v19, 0x400

    const/16 v20, 0x800

    if-eqz v18, :cond_9

    or-int/lit16 v3, v3, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v4, v12, 0xc00

    if-nez v4, :cond_b

    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v4

    if-eqz v4, :cond_a

    move/from16 v4, v20

    goto :goto_6

    :cond_a
    move/from16 v4, v19

    :goto_6
    or-int/2addr v3, v4

    :cond_b
    :goto_7
    and-int/lit8 v4, v14, 0x10

    const/16 v18, 0x2000

    const/16 v21, 0x4000

    if-eqz v4, :cond_c

    or-int/lit16 v3, v3, 0x6000

    goto :goto_9

    :cond_c
    and-int/lit16 v4, v12, 0x6000

    if-nez v4, :cond_e

    invoke-interface {v15, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_d

    move/from16 v4, v21

    goto :goto_8

    :cond_d
    move/from16 v4, v18

    :goto_8
    or-int/2addr v3, v4

    :cond_e
    :goto_9
    and-int/lit8 v4, v14, 0x20

    const/high16 v22, 0x10000

    const/high16 v23, 0x30000

    if-eqz v4, :cond_f

    or-int v3, v3, v23

    goto :goto_b

    :cond_f
    and-int v4, v12, v23

    if-nez v4, :cond_11

    invoke-interface {v15, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_10

    const/high16 v4, 0x20000

    goto :goto_a

    :cond_10
    move/from16 v4, v22

    :goto_a
    or-int/2addr v3, v4

    :cond_11
    :goto_b
    and-int/lit8 v4, v14, 0x40

    const/high16 v24, 0x180000

    if-eqz v4, :cond_12

    or-int v3, v3, v24

    goto :goto_d

    :cond_12
    and-int v4, v12, v24

    if-nez v4, :cond_14

    invoke-interface {v15, v10}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v4

    if-eqz v4, :cond_13

    const/high16 v4, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v4, 0x80000

    :goto_c
    or-int/2addr v3, v4

    :cond_14
    :goto_d
    and-int/lit16 v4, v14, 0x80

    if-eqz v4, :cond_16

    const/high16 v4, 0xc00000

    or-int/2addr v3, v4

    :cond_15
    move-object/from16 v4, p7

    goto :goto_f

    :cond_16
    const/high16 v4, 0xc00000

    and-int/2addr v4, v12

    if-nez v4, :cond_15

    move-object/from16 v4, p7

    invoke-interface {v15, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_17

    const/high16 v25, 0x800000

    goto :goto_e

    :cond_17
    const/high16 v25, 0x400000

    :goto_e
    or-int v3, v3, v25

    :goto_f
    and-int/lit16 v5, v14, 0x100

    const/high16 v26, 0x6000000

    if-eqz v5, :cond_18

    or-int v3, v3, v26

    move/from16 v7, p8

    goto :goto_11

    :cond_18
    and-int v26, v12, v26

    move/from16 v7, p8

    if-nez v26, :cond_1a

    invoke-interface {v15, v7}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v27

    if-eqz v27, :cond_19

    const/high16 v27, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v27, 0x2000000

    :goto_10
    or-int v3, v3, v27

    :cond_1a
    :goto_11
    and-int/lit16 v1, v14, 0x200

    const/high16 v28, 0x30000000

    if-eqz v1, :cond_1b

    or-int v3, v3, v28

    move/from16 v0, p9

    goto :goto_13

    :cond_1b
    and-int v28, v12, v28

    move/from16 v0, p9

    if-nez v28, :cond_1d

    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v28

    if-eqz v28, :cond_1c

    const/high16 v28, 0x20000000

    goto :goto_12

    :cond_1c
    const/high16 v28, 0x10000000

    :goto_12
    or-int v3, v3, v28

    :cond_1d
    :goto_13
    and-int/lit16 v0, v14, 0x400

    if-eqz v0, :cond_1e

    or-int/lit8 v0, v13, 0x6

    move/from16 v28, v0

    move-object/from16 v0, p10

    goto :goto_15

    :cond_1e
    and-int/lit8 v0, v13, 0x6

    if-nez v0, :cond_20

    move-object/from16 v0, p10

    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_1f

    const/16 v28, 0x4

    goto :goto_14

    :cond_1f
    const/16 v28, 0x2

    :goto_14
    or-int v28, v13, v28

    goto :goto_15

    :cond_20
    move-object/from16 v0, p10

    move/from16 v28, v13

    :goto_15
    and-int/lit16 v0, v14, 0x800

    if-eqz v0, :cond_22

    or-int/lit8 v28, v28, 0x30

    :cond_21
    :goto_16
    move/from16 v0, v28

    goto :goto_18

    :cond_22
    and-int/lit8 v0, v13, 0x30

    if-nez v0, :cond_21

    invoke-interface {v15, v11}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_23

    const/16 v26, 0x20

    goto :goto_17

    :cond_23
    const/16 v26, 0x10

    :goto_17
    or-int v28, v28, v26

    goto :goto_16

    :goto_18
    move/from16 v26, v1

    and-int/lit16 v1, v14, 0x1000

    if-eqz v1, :cond_25

    or-int/lit16 v0, v0, 0x180

    :cond_24
    move-object/from16 v1, p12

    goto :goto_19

    :cond_25
    and-int/lit16 v1, v13, 0x180

    if-nez v1, :cond_24

    move-object/from16 v1, p12

    invoke-interface {v15, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_26

    move/from16 v16, v17

    :cond_26
    or-int v0, v0, v16

    :goto_19
    and-int/lit16 v1, v14, 0x2000

    if-eqz v1, :cond_28

    or-int/lit16 v0, v0, 0xc00

    :cond_27
    move-object/from16 v1, p13

    goto :goto_1a

    :cond_28
    and-int/lit16 v1, v13, 0xc00

    if-nez v1, :cond_27

    move-object/from16 v1, p13

    invoke-interface {v15, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_29

    move/from16 v19, v20

    :cond_29
    or-int v0, v0, v19

    :goto_1a
    and-int/lit16 v1, v14, 0x4000

    if-eqz v1, :cond_2b

    or-int/lit16 v0, v0, 0x6000

    :cond_2a
    move-object/from16 v1, p14

    goto :goto_1b

    :cond_2b
    and-int/lit16 v1, v13, 0x6000

    if-nez v1, :cond_2a

    move-object/from16 v1, p14

    invoke-interface {v15, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_2c

    move/from16 v18, v21

    :cond_2c
    or-int v0, v0, v18

    :goto_1b
    const v16, 0x8000

    and-int v16, v14, v16

    if-eqz v16, :cond_2d

    or-int v0, v0, v23

    move/from16 v16, v0

    move-object/from16 v0, p15

    goto :goto_1d

    :cond_2d
    and-int v16, v13, v23

    move/from16 p17, v0

    move-object/from16 v0, p15

    if-nez v16, :cond_2f

    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_2e

    const/high16 v16, 0x20000

    goto :goto_1c

    :cond_2e
    move/from16 v16, v22

    :goto_1c
    or-int v16, p17, v16

    goto :goto_1d

    :cond_2f
    move/from16 v16, p17

    :goto_1d
    and-int v17, v14, v22

    if-eqz v17, :cond_31

    or-int v16, v16, v24

    :cond_30
    :goto_1e
    move/from16 v0, v16

    goto :goto_20

    :cond_31
    and-int v17, v13, v24

    move-object/from16 v0, p16

    if-nez v17, :cond_30

    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_32

    const/high16 v17, 0x100000

    goto :goto_1f

    :cond_32
    const/high16 v17, 0x80000

    :goto_1f
    or-int v16, v16, v17

    goto :goto_1e

    :goto_20
    const v16, 0x12492493

    and-int v1, v3, v16

    const v4, 0x12492492

    const/4 v8, 0x0

    const/16 v18, 0x1

    if-ne v1, v4, :cond_34

    const v1, 0x92493

    and-int/2addr v1, v0

    const v4, 0x92492

    if-eq v1, v4, :cond_33

    goto :goto_21

    :cond_33
    move v1, v8

    goto :goto_22

    :cond_34
    :goto_21
    move/from16 v1, v18

    :goto_22
    and-int/lit8 v4, v3, 0x1

    invoke-interface {v15, v1, v4}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v1

    if-eqz v1, :cond_4c

    if-eqz v5, :cond_35

    move v1, v8

    goto :goto_23

    :cond_35
    move v1, v7

    :goto_23
    if-eqz v26, :cond_36

    int-to-float v4, v8

    .line 2
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v4

    move/from16 v16, v8

    move v8, v4

    goto :goto_24

    :cond_36
    move/from16 v16, v8

    move/from16 v8, p9

    :goto_24
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v4

    if-eqz v4, :cond_37

    const v4, 0x43111c3a    # 145.11026f

    const-string v5, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:103)"

    .line 3
    invoke-static {v4, v3, v0, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_37
    if-ltz v1, :cond_38

    move/from16 v4, v18

    goto :goto_25

    :cond_38
    move/from16 v4, v16

    :goto_25
    if-nez v4, :cond_39

    .line 4
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "beyondViewportPageCount should be greater than or equal to 0, you selected "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 5
    invoke-static {v4}, Landroidx/compose/foundation/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    :cond_39
    and-int/lit8 v4, v3, 0x70

    const/16 v5, 0x20

    if-ne v4, v5, :cond_3a

    move/from16 v5, v18

    goto :goto_26

    :cond_3a
    move/from16 v5, v16

    .line 6
    :goto_26
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_3b

    .line 7
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v5

    if-ne v7, v5, :cond_3c

    .line 8
    :cond_3b
    new-instance v7, Landroidx/compose/foundation/pager/LazyLayoutPagerKt$Pager$pagerItemProvider$1$1;

    invoke-direct {v7, v2}, Landroidx/compose/foundation/pager/LazyLayoutPagerKt$Pager$pagerItemProvider$1$1;-><init>(Landroidx/compose/foundation/pager/PagerState;)V

    .line 9
    invoke-interface {v15, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 10
    :cond_3c
    move-object v5, v7

    check-cast v5, Lhd/a;

    shr-int/lit8 v7, v3, 0x3

    move/from16 p8, v1

    and-int/lit8 v1, v7, 0xe

    shr-int/lit8 v17, v0, 0xf

    and-int/lit8 v19, v17, 0x70

    or-int v19, v1, v19

    and-int/lit16 v2, v0, 0x380

    or-int v2, v19, v2

    move/from16 p17, v0

    move/from16 v19, v3

    move v0, v7

    move-object v6, v15

    move-object/from16 v3, p16

    move v7, v2

    move v15, v4

    move-object/from16 v2, p1

    move-object/from16 v4, p12

    invoke-static/range {v2 .. v7}, Landroidx/compose/foundation/pager/LazyLayoutPagerKt;->rememberPagerItemProviderLambda(Landroidx/compose/foundation/pager/PagerState;Lhd/r;Lhd/l;Lhd/a;Landroidx/compose/runtime/Composer;I)Lhd/a;

    move-result-object v5

    .line 11
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    .line 12
    sget-object v20, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual/range {v20 .. v20}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v3, v4, :cond_3d

    .line 13
    sget-object v3, Lkotlin/coroutines/EmptyCoroutineContext;->c:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 14
    invoke-static {v3, v6}, Landroidx/compose/runtime/EffectsKt;->createCompositionCoroutineScope(Lkotlin/coroutines/d;Landroidx/compose/runtime/Composer;)Lsd/i0;

    move-result-object v3

    .line 15
    invoke-interface {v6, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 16
    :cond_3d
    check-cast v3, Lsd/i0;

    const/16 v4, 0x20

    if-ne v15, v4, :cond_3e

    move/from16 v4, v18

    goto :goto_27

    :cond_3e
    move/from16 v4, v16

    .line 17
    :goto_27
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    if-nez v4, :cond_3f

    .line 18
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v7, v4, :cond_40

    .line 19
    :cond_3f
    new-instance v7, Landroidx/compose/foundation/pager/LazyLayoutPagerKt$Pager$measurePolicy$1$1;

    invoke-direct {v7, v2}, Landroidx/compose/foundation/pager/LazyLayoutPagerKt$Pager$measurePolicy$1$1;-><init>(Landroidx/compose/foundation/pager/PagerState;)V

    .line 20
    invoke-interface {v6, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 21
    :cond_40
    check-cast v7, Lhd/a;

    const v4, 0xfff0

    and-int v4, v19, v4

    shr-int/lit8 v21, v19, 0x9

    const/high16 v22, 0x70000

    and-int v22, v21, v22

    or-int v4, v4, v22

    const/high16 v22, 0x380000

    and-int v21, v21, v22

    or-int v4, v4, v21

    shl-int/lit8 v21, p17, 0x15

    const/high16 v22, 0x1c00000

    and-int v21, v21, v22

    or-int v4, v4, v21

    shl-int/lit8 v21, p17, 0xf

    const/high16 v22, 0xe000000

    and-int v22, v21, v22

    or-int v4, v4, v22

    const/high16 v22, 0x70000000

    and-int v21, v21, v22

    or-int v4, v4, v21

    and-int/lit8 v17, v17, 0xe

    move-object/from16 v9, p10

    move-object/from16 v10, p13

    move-object/from16 v11, p14

    move-object/from16 v12, p15

    move/from16 v22, v0

    move-object v13, v3

    move-object v14, v7

    move v0, v15

    move/from16 v21, v16

    move/from16 v7, p8

    move-object v3, v2

    move/from16 v16, v4

    move-object v2, v5

    move-object v15, v6

    move-object/from16 v4, p2

    move/from16 v5, p3

    move-object/from16 v6, p4

    .line 22
    invoke-static/range {v2 .. v17}, Landroidx/compose/foundation/pager/PagerMeasurePolicyKt;->rememberPagerMeasurePolicy-8u0NR3k(Lhd/a;Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;IFLandroidx/compose/foundation/pager/PageSize;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Lsd/i0;Lhd/a;Landroidx/compose/runtime/Composer;II)Lhd/p;

    move-result-object v14

    move-object v10, v3

    move v4, v5

    move-object v5, v6

    move v12, v7

    move-object v11, v13

    move-object v6, v15

    move v13, v8

    .line 23
    sget-object v15, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    if-ne v5, v15, :cond_41

    move/from16 v8, v18

    goto :goto_28

    :cond_41
    move/from16 v8, v21

    :goto_28
    invoke-static {v10, v8, v6, v1}, Landroidx/compose/foundation/pager/PagerSemanticsKt;->rememberPagerSemanticState(Landroidx/compose/foundation/pager/PagerState;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;

    move-result-object v3

    const/16 v7, 0x20

    if-ne v0, v7, :cond_42

    move/from16 v8, v18

    goto :goto_29

    :cond_42
    move/from16 v8, v21

    :goto_29
    const/high16 v7, 0x70000

    and-int v7, v19, v7

    const/high16 v9, 0x20000

    if-ne v7, v9, :cond_43

    move/from16 v7, v18

    goto :goto_2a

    :cond_43
    move/from16 v7, v21

    :goto_2a
    or-int/2addr v7, v8

    .line 24
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_45

    .line 25
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v7

    if-ne v8, v7, :cond_44

    goto :goto_2b

    :cond_44
    move-object/from16 v7, p5

    goto :goto_2c

    .line 26
    :cond_45
    :goto_2b
    new-instance v8, Landroidx/compose/foundation/pager/PagerWrapperFlingBehavior;

    move-object/from16 v7, p5

    invoke-direct {v8, v7, v10}, Landroidx/compose/foundation/pager/PagerWrapperFlingBehavior;-><init>(Landroidx/compose/foundation/gestures/TargetedFlingBehavior;Landroidx/compose/foundation/pager/PagerState;)V

    .line 27
    invoke-interface {v6, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 28
    :goto_2c
    move-object/from16 v16, v8

    check-cast v16, Landroidx/compose/foundation/pager/PagerWrapperFlingBehavior;

    .line 29
    invoke-static {}, Landroidx/compose/foundation/gestures/BringIntoViewSpec_androidKt;->getLocalBringIntoViewSpec()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v8

    .line 30
    invoke-interface {v6, v8}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v8

    .line 31
    check-cast v8, Landroidx/compose/foundation/gestures/BringIntoViewSpec;

    const/16 v9, 0x20

    if-ne v0, v9, :cond_46

    move/from16 v0, v18

    goto :goto_2d

    :cond_46
    move/from16 v0, v21

    .line 32
    :goto_2d
    invoke-interface {v6, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v0, v9

    .line 33
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v9

    if-nez v0, :cond_47

    .line 34
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v9, v0, :cond_48

    .line 35
    :cond_47
    new-instance v9, Landroidx/compose/foundation/pager/PagerBringIntoViewSpec;

    invoke-direct {v9, v10, v8}, Landroidx/compose/foundation/pager/PagerBringIntoViewSpec;-><init>(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/gestures/BringIntoViewSpec;)V

    .line 36
    invoke-interface {v6, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 37
    :cond_48
    move-object v0, v9

    check-cast v0, Landroidx/compose/foundation/pager/PagerBringIntoViewSpec;

    if-eqz p6, :cond_49

    const v8, 0x735b3d0d

    .line 38
    invoke-interface {v6, v8}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 39
    sget-object v8, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    shr-int/lit8 v9, v19, 0x15

    and-int/lit8 v9, v9, 0x70

    or-int/2addr v1, v9

    .line 40
    invoke-static {v10, v12, v6, v1}, Landroidx/compose/foundation/pager/PagerBeyondBoundsModifierKt;->rememberPagerBeyondBoundsState(Landroidx/compose/foundation/pager/PagerState;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;

    move-result-object v1

    .line 41
    invoke-virtual {v10}, Landroidx/compose/foundation/pager/PagerState;->getBeyondBoundsInfo$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;

    move-result-object v9

    .line 42
    invoke-static {v8, v1, v9, v4, v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierLocalKt;->lazyLayoutBeyondBoundsModifier(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;ZLandroidx/compose/foundation/gestures/Orientation;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    .line 43
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_2e

    :cond_49
    const v1, 0x7361c824

    .line 44
    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 45
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 46
    :goto_2e
    invoke-virtual {v10}, Landroidx/compose/foundation/pager/PagerState;->getRemeasurementModifier$foundation_release()Landroidx/compose/ui/layout/RemeasurementModifier;

    move-result-object v8

    move-object/from16 v9, p0

    invoke-interface {v9, v8}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    move-object/from16 p8, v0

    .line 47
    invoke-virtual {v10}, Landroidx/compose/foundation/pager/PagerState;->getAwaitLayoutModifier$foundation_release()Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;

    move-result-object v0

    invoke-interface {v8, v0}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move/from16 v8, v22

    and-int/lit16 v8, v8, 0x1c00

    shr-int/lit8 v17, v19, 0x6

    const v20, 0xe000

    and-int v17, v17, v20

    or-int v8, v8, v17

    const/high16 v17, 0x70000

    shl-int/lit8 v19, v19, 0x6

    and-int v17, v19, v17

    or-int v8, v8, v17

    move v7, v4

    move v9, v8

    move-object v4, v3

    move-object v8, v6

    move/from16 v6, p6

    move-object v3, v2

    move-object v2, v0

    .line 48
    invoke-static/range {v2 .. v9}, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsKt;->lazyLayoutSemantics(Landroidx/compose/ui/Modifier;Lhd/a;Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object/from16 v19, v3

    move-object/from16 v17, v8

    if-ne v5, v15, :cond_4a

    move/from16 v8, v18

    goto :goto_2f

    :cond_4a
    move/from16 v8, v21

    .line 49
    :goto_2f
    invoke-static {v0, v10, v8, v11, v6}, Landroidx/compose/foundation/pager/PagerKt;->pagerSemantics(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;ZLsd/i0;Z)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 50
    invoke-interface {v0, v1}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    .line 51
    invoke-virtual {v10}, Landroidx/compose/foundation/pager/PagerState;->getInternalInteractionSource$foundation_release()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-result-object v8

    const/4 v9, 0x0

    move-object/from16 v11, p8

    move-object v4, v5

    move v5, v6

    move-object v3, v10

    move-object/from16 v7, v16

    move/from16 v6, p3

    move-object/from16 v10, p7

    .line 52
    invoke-static/range {v2 .. v11}, Landroidx/compose/foundation/ScrollingContainerKt;->scrollingContainer(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/interaction/MutableInteractionSource;ZLandroidx/compose/foundation/OverscrollEffect;Landroidx/compose/foundation/gestures/BringIntoViewSpec;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object v2, v3

    .line 53
    invoke-static {v0, v2}, Landroidx/compose/foundation/pager/LazyLayoutPagerKt;->dragDirectionDetector(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v3, 0x0

    move-object/from16 v11, p11

    const/4 v4, 0x2

    .line 54
    invoke-static {v0, v11, v1, v4, v3}, Landroidx/compose/ui/input/nestedscroll/NestedScrollModifierKt;->nestedScroll$default(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    .line 55
    invoke-virtual {v2}, Landroidx/compose/foundation/pager/PagerState;->getPrefetchState$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;

    move-result-object v6

    const/4 v10, 0x0

    move-object v7, v14

    move-object/from16 v8, v17

    move-object/from16 v4, v19

    .line 56
    invoke-static/range {v4 .. v10}, Landroidx/compose/foundation/lazy/layout/LazyLayoutKt;->LazyLayout(Lhd/a;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;Lhd/p;Landroidx/compose/runtime/Composer;II)V

    move-object v6, v8

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_4b

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_4b
    move v9, v12

    move v10, v13

    goto :goto_30

    :cond_4c
    move-object v6, v15

    .line 57
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move/from16 v10, p9

    move v9, v7

    :goto_30
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_4d

    move-object v1, v0

    new-instance v0, Landroidx/compose/foundation/pager/LazyLayoutPagerKt$Pager$2;

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move/from16 v18, p18

    move/from16 v19, p19

    move/from16 v20, p20

    move-object/from16 v29, v1

    move-object v12, v11

    move-object/from16 v1, p0

    move-object/from16 v11, p10

    invoke-direct/range {v0 .. v20}, Landroidx/compose/foundation/pager/LazyLayoutPagerKt$Pager$2;-><init>(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/gestures/TargetedFlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;IFLandroidx/compose/foundation/pager/PageSize;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Lhd/l;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Lhd/r;III)V

    move-object/from16 v1, v29

    invoke-interface {v1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lhd/p;)V

    :cond_4d
    return-void
.end method

.method private static final dragDirectionDetector(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;)Landroidx/compose/ui/Modifier;
    .locals 2

    .line 1
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 2
    .line 3
    new-instance v1, Landroidx/compose/foundation/pager/LazyLayoutPagerKt$dragDirectionDetector$1;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Landroidx/compose/foundation/pager/LazyLayoutPagerKt$dragDirectionDetector$1;-><init>(Landroidx/compose/foundation/pager/PagerState;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0, p1, v1}, Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt;->pointerInput(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/Modifier;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-interface {p0, p1}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method private static final rememberPagerItemProviderLambda(Landroidx/compose/foundation/pager/PagerState;Lhd/r;Lhd/l;Lhd/a;Landroidx/compose/runtime/Composer;I)Lhd/a;
    .locals 5
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[0[0]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/pager/PagerState;",
            "Lhd/r;",
            "Lhd/l;",
            "Lhd/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Lhd/a;"
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
    const-string v1, "androidx.compose.foundation.pager.rememberPagerItemProviderLambda (LazyLayoutPager.kt:259)"

    .line 9
    .line 10
    const v2, -0x51cec4ba

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p5, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    shr-int/lit8 v0, p5, 0x3

    .line 17
    .line 18
    and-int/lit8 v0, v0, 0xe

    .line 19
    .line 20
    invoke-static {p1, p4, v0}, Landroidx/compose/runtime/SnapshotStateKt;->rememberUpdatedState(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    shr-int/lit8 v0, p5, 0x6

    .line 25
    .line 26
    and-int/lit8 v0, v0, 0xe

    .line 27
    .line 28
    invoke-static {p2, p4, v0}, Landroidx/compose/runtime/SnapshotStateKt;->rememberUpdatedState(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    and-int/lit8 v0, p5, 0xe

    .line 33
    .line 34
    xor-int/lit8 v0, v0, 0x6

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    const/4 v2, 0x1

    .line 38
    const/4 v3, 0x4

    .line 39
    if-le v0, v3, :cond_1

    .line 40
    .line 41
    invoke-interface {p4, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_2

    .line 46
    .line 47
    :cond_1
    and-int/lit8 v0, p5, 0x6

    .line 48
    .line 49
    if-ne v0, v3, :cond_3

    .line 50
    .line 51
    :cond_2
    move v0, v2

    .line 52
    goto :goto_0

    .line 53
    :cond_3
    move v0, v1

    .line 54
    :goto_0
    invoke-interface {p4, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    or-int/2addr v0, v3

    .line 59
    invoke-interface {p4, p2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    or-int/2addr v0, v3

    .line 64
    and-int/lit16 v3, p5, 0x1c00

    .line 65
    .line 66
    xor-int/lit16 v3, v3, 0xc00

    .line 67
    .line 68
    const/16 v4, 0x800

    .line 69
    .line 70
    if-le v3, v4, :cond_4

    .line 71
    .line 72
    invoke-interface {p4, p3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-nez v3, :cond_5

    .line 77
    .line 78
    :cond_4
    and-int/lit16 p5, p5, 0xc00

    .line 79
    .line 80
    if-ne p5, v4, :cond_6

    .line 81
    .line 82
    :cond_5
    move v1, v2

    .line 83
    :cond_6
    or-int p5, v0, v1

    .line 84
    .line 85
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    if-nez p5, :cond_7

    .line 90
    .line 91
    sget-object p5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 92
    .line 93
    invoke-virtual {p5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p5

    .line 97
    if-ne v0, p5, :cond_8

    .line 98
    .line 99
    :cond_7
    invoke-static {}, Landroidx/compose/runtime/SnapshotStateKt;->referentialEqualityPolicy()Landroidx/compose/runtime/SnapshotMutationPolicy;

    .line 100
    .line 101
    .line 102
    move-result-object p5

    .line 103
    new-instance v0, Landroidx/compose/foundation/pager/LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$intervalContentState$1;

    .line 104
    .line 105
    invoke-direct {v0, p1, p2, p3}, Landroidx/compose/foundation/pager/LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$intervalContentState$1;-><init>(Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Lhd/a;)V

    .line 106
    .line 107
    .line 108
    invoke-static {p5, v0}, Landroidx/compose/runtime/SnapshotStateKt;->derivedStateOf(Landroidx/compose/runtime/SnapshotMutationPolicy;Lhd/a;)Landroidx/compose/runtime/State;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-static {}, Landroidx/compose/runtime/SnapshotStateKt;->referentialEqualityPolicy()Landroidx/compose/runtime/SnapshotMutationPolicy;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    new-instance p3, Landroidx/compose/foundation/pager/LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$itemProviderState$1;

    .line 117
    .line 118
    invoke-direct {p3, p1, p0}, Landroidx/compose/foundation/pager/LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$itemProviderState$1;-><init>(Landroidx/compose/runtime/State;Landroidx/compose/foundation/pager/PagerState;)V

    .line 119
    .line 120
    .line 121
    invoke-static {p2, p3}, Landroidx/compose/runtime/SnapshotStateKt;->derivedStateOf(Landroidx/compose/runtime/SnapshotMutationPolicy;Lhd/a;)Landroidx/compose/runtime/State;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    new-instance v0, Landroidx/compose/foundation/pager/LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$1;

    .line 126
    .line 127
    invoke-direct {v0, p0}, Landroidx/compose/foundation/pager/LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$1;-><init>(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    invoke-interface {p4, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    :cond_8
    check-cast v0, Lod/m;

    .line 134
    .line 135
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 136
    .line 137
    .line 138
    move-result p0

    .line 139
    if-eqz p0, :cond_9

    .line 140
    .line 141
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 142
    .line 143
    .line 144
    :cond_9
    return-object v0
.end method
