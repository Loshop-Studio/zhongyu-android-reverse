.class public final Landroidx/compose/foundation/layout/FlowLayoutKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final CROSS_AXIS_ALIGNMENT_START:Landroidx/compose/foundation/layout/CrossAxisAlignment;

.field private static final CROSS_AXIS_ALIGNMENT_TOP:Landroidx/compose/foundation/layout/CrossAxisAlignment;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Landroidx/compose/foundation/layout/CrossAxisAlignment;->Companion:Landroidx/compose/foundation/layout/CrossAxisAlignment$Companion;

    .line 2
    .line 3
    sget-object v1, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v0, v2}, Landroidx/compose/foundation/layout/CrossAxisAlignment$Companion;->vertical$foundation_layout_release(Landroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/foundation/layout/CrossAxisAlignment;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    sput-object v2, Landroidx/compose/foundation/layout/FlowLayoutKt;->CROSS_AXIS_ALIGNMENT_TOP:Landroidx/compose/foundation/layout/CrossAxisAlignment;

    .line 14
    .line 15
    invoke-virtual {v1}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Landroidx/compose/foundation/layout/CrossAxisAlignment$Companion;->horizontal$foundation_layout_release(Landroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/foundation/layout/CrossAxisAlignment;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Landroidx/compose/foundation/layout/FlowLayoutKt;->CROSS_AXIS_ALIGNMENT_START:Landroidx/compose/foundation/layout/CrossAxisAlignment;

    .line 24
    .line 25
    return-void
.end method

.method public static final FlowColumn(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILandroidx/compose/foundation/layout/FlowColumnOverflow;Lhd/q;Landroidx/compose/runtime/Composer;II)V
    .locals 24
    .annotation build Landroidx/compose/foundation/layout/ExperimentalLayoutApi;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
            "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
            "Landroidx/compose/ui/Alignment$Horizontal;",
            "II",
            "Landroidx/compose/foundation/layout/FlowColumnOverflow;",
            "Lhd/q;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .annotation runtime Lqc/a;
    .end annotation

    move-object/from16 v8, p7

    move/from16 v9, p9

    move/from16 v10, p10

    const v0, -0x529a966e

    move-object/from16 v1, p8

    .line 1
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v1

    and-int/lit8 v2, v10, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v3, v9, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v9, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v9

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v9

    :goto_1
    and-int/lit8 v5, v10, 0x2

    if-eqz v5, :cond_4

    or-int/lit8 v4, v4, 0x30

    :cond_3
    move-object/from16 v6, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v6, v9, 0x30

    if-nez v6, :cond_3

    move-object/from16 v6, p1

    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x20

    goto :goto_2

    :cond_5
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v4, v7

    :goto_3
    and-int/lit8 v7, v10, 0x4

    if-eqz v7, :cond_7

    or-int/lit16 v4, v4, 0x180

    :cond_6
    move-object/from16 v11, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v11, v9, 0x180

    if-nez v11, :cond_6

    move-object/from16 v11, p2

    invoke-interface {v1, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_8

    const/16 v12, 0x100

    goto :goto_4

    :cond_8
    const/16 v12, 0x80

    :goto_4
    or-int/2addr v4, v12

    :goto_5
    and-int/lit8 v12, v10, 0x8

    if-eqz v12, :cond_a

    or-int/lit16 v4, v4, 0xc00

    :cond_9
    move-object/from16 v13, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v13, v9, 0xc00

    if-nez v13, :cond_9

    move-object/from16 v13, p3

    invoke-interface {v1, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_b

    const/16 v14, 0x800

    goto :goto_6

    :cond_b
    const/16 v14, 0x400

    :goto_6
    or-int/2addr v4, v14

    :goto_7
    and-int/lit8 v14, v10, 0x10

    if-eqz v14, :cond_d

    or-int/lit16 v4, v4, 0x6000

    :cond_c
    move/from16 v15, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v15, v9, 0x6000

    if-nez v15, :cond_c

    move/from16 v15, p4

    invoke-interface {v1, v15}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v16

    if-eqz v16, :cond_e

    const/16 v16, 0x4000

    goto :goto_8

    :cond_e
    const/16 v16, 0x2000

    :goto_8
    or-int v4, v4, v16

    :goto_9
    and-int/lit8 v16, v10, 0x20

    const/high16 v18, 0x30000

    if-eqz v16, :cond_f

    or-int v4, v4, v18

    move/from16 v0, p5

    goto :goto_b

    :cond_f
    and-int v18, v9, v18

    move/from16 v0, p5

    if-nez v18, :cond_11

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v18

    if-eqz v18, :cond_10

    const/high16 v18, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v18, 0x10000

    :goto_a
    or-int v4, v4, v18

    :cond_11
    :goto_b
    and-int/lit8 v18, v10, 0x40

    const/high16 v19, 0x180000

    if-eqz v18, :cond_12

    or-int v4, v4, v19

    move-object/from16 v0, p6

    goto :goto_d

    :cond_12
    and-int v19, v9, v19

    move-object/from16 v0, p6

    if-nez v19, :cond_14

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_13

    const/high16 v20, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v20, 0x80000

    :goto_c
    or-int v4, v4, v20

    :cond_14
    :goto_d
    and-int/lit16 v0, v10, 0x80

    move/from16 v20, v0

    const/high16 v21, 0xc00000

    if-eqz v20, :cond_15

    or-int v4, v4, v21

    goto :goto_f

    :cond_15
    and-int v20, v9, v21

    if-nez v20, :cond_17

    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_16

    const/high16 v20, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v20, 0x400000

    :goto_e
    or-int v4, v4, v20

    :cond_17
    :goto_f
    const v20, 0x492493

    and-int v0, v4, v20

    move/from16 v20, v2

    const v2, 0x492492

    if-eq v0, v2, :cond_18

    const/4 v0, 0x1

    goto :goto_10

    :cond_18
    const/4 v0, 0x0

    :goto_10
    and-int/lit8 v2, v4, 0x1

    invoke-interface {v1, v0, v2}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_30

    if-eqz v20, :cond_19

    .line 2
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    goto :goto_11

    :cond_19
    move-object/from16 v0, p0

    :goto_11
    if-eqz v5, :cond_1a

    .line 3
    sget-object v2, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v2}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    move-result-object v2

    move-object v11, v2

    goto :goto_12

    :cond_1a
    move-object v11, v6

    :goto_12
    if-eqz v7, :cond_1b

    .line 4
    sget-object v2, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v2}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    move-result-object v2

    move/from16 v23, v12

    move-object v12, v2

    move/from16 v2, v23

    goto :goto_13

    :cond_1b
    move v2, v12

    move-object/from16 v12, p2

    :goto_13
    if-eqz v2, :cond_1c

    .line 5
    sget-object v2, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    move-result-object v2

    move-object v13, v2

    :cond_1c
    const v2, 0x7fffffff

    if-eqz v14, :cond_1d

    move v14, v2

    goto :goto_14

    :cond_1d
    move v14, v15

    :goto_14
    if-eqz v16, :cond_1e

    move v15, v2

    goto :goto_15

    :cond_1e
    move/from16 v15, p5

    :goto_15
    if-eqz v18, :cond_1f

    .line 6
    sget-object v2, Landroidx/compose/foundation/layout/FlowColumnOverflow;->Companion:Landroidx/compose/foundation/layout/FlowColumnOverflow$Companion;

    invoke-virtual {v2}, Landroidx/compose/foundation/layout/FlowColumnOverflow$Companion;->getClip()Landroidx/compose/foundation/layout/FlowColumnOverflow;

    move-result-object v2

    goto :goto_16

    :cond_1f
    move-object/from16 v2, p6

    :goto_16
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v5

    if-eqz v5, :cond_20

    const/4 v5, -0x1

    const-string v6, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:212)"

    const v7, -0x529a966e

    .line 7
    invoke-static {v7, v4, v5, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_20
    const/high16 v5, 0x380000

    and-int/2addr v5, v4

    const/high16 v6, 0x100000

    if-ne v5, v6, :cond_21

    const/4 v6, 0x1

    goto :goto_17

    :cond_21
    const/4 v6, 0x0

    .line 8
    :goto_17
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_22

    .line 9
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v7, v6, :cond_23

    .line 10
    :cond_22
    invoke-virtual {v2}, Landroidx/compose/foundation/layout/FlowLayoutOverflow;->createOverflowState$foundation_layout_release()Landroidx/compose/foundation/layout/FlowLayoutOverflowState;

    move-result-object v7

    .line 11
    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 12
    :cond_23
    move-object/from16 v16, v7

    check-cast v16, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;

    shr-int/lit8 v6, v4, 0x3

    const v7, 0xfffe

    and-int v18, v6, v7

    move-object/from16 v17, v1

    .line 13
    invoke-static/range {v11 .. v18}, Landroidx/compose/foundation/layout/FlowLayoutKt;->columnMeasurementMultiContentHelper(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MultiContentMeasurePolicy;

    move-result-object v1

    move-object/from16 v6, v16

    move-object/from16 v7, v17

    const/high16 v3, 0x100000

    if-ne v5, v3, :cond_24

    const/4 v3, 0x1

    goto :goto_18

    :cond_24
    const/4 v3, 0x0

    :goto_18
    const/high16 v5, 0x1c00000

    and-int/2addr v5, v4

    move/from16 p0, v3

    const/high16 v3, 0x800000

    if-ne v5, v3, :cond_25

    const/4 v3, 0x1

    goto :goto_19

    :cond_25
    const/4 v3, 0x0

    :goto_19
    or-int v3, p0, v3

    const/high16 v5, 0x70000

    and-int/2addr v4, v5

    const/high16 v5, 0x20000

    if-ne v4, v5, :cond_26

    const/4 v4, 0x1

    goto :goto_1a

    :cond_26
    const/4 v4, 0x0

    :goto_1a
    or-int/2addr v3, v4

    .line 14
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_27

    .line 15
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_28

    .line 16
    :cond_27
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 17
    new-instance v3, Landroidx/compose/foundation/layout/FlowLayoutKt$FlowColumn$list$1$1;

    invoke-direct {v3, v8}, Landroidx/compose/foundation/layout/FlowLayoutKt$FlowColumn$list$1$1;-><init>(Lhd/q;)V

    const v5, -0x2d87451e

    const/4 v8, 0x1

    invoke-static {v5, v8, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v3

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 18
    invoke-virtual {v2, v6, v4}, Landroidx/compose/foundation/layout/FlowLayoutOverflow;->addOverflowComposables$foundation_layout_release(Landroidx/compose/foundation/layout/FlowLayoutOverflowState;Ljava/util/List;)V

    .line 19
    invoke-interface {v7, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 20
    :cond_28
    check-cast v4, Ljava/util/List;

    .line 21
    invoke-static {v4}, Landroidx/compose/ui/layout/LayoutKt;->combineAsVirtualLayouts(Ljava/util/List;)Lhd/p;

    move-result-object v3

    .line 22
    invoke-interface {v7, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    .line 23
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_29

    .line 24
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v5, v4, :cond_2a

    .line 25
    :cond_29
    invoke-static {v1}, Landroidx/compose/ui/layout/MultiContentMeasurePolicyKt;->createMeasurePolicy(Landroidx/compose/ui/layout/MultiContentMeasurePolicy;)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v5

    .line 26
    invoke-interface {v7, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 27
    :cond_2a
    check-cast v5, Landroidx/compose/ui/layout/MeasurePolicy;

    const/4 v1, 0x0

    .line 28
    invoke-static {v7, v1}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v4

    .line 29
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v1

    .line 30
    invoke-static {v7, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    .line 31
    sget-object v8, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    move-object/from16 v16, v0

    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lhd/a;

    move-result-object v0

    .line 32
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v17

    if-nez v17, :cond_2b

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 33
    :cond_2b
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 34
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v17

    if-eqz v17, :cond_2c

    .line 35
    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->createNode(Lhd/a;)V

    goto :goto_1b

    .line 36
    :cond_2c
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 37
    :goto_1b
    invoke-static {v7}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v0

    move-object/from16 p0, v2

    .line 38
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lhd/p;

    move-result-object v2

    invoke-static {v0, v5, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 39
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lhd/p;

    move-result-object v2

    invoke-static {v0, v1, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 40
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lhd/p;

    move-result-object v1

    .line 41
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v2

    if-nez v2, :cond_2d

    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2e

    .line 42
    :cond_2d
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 43
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2, v1}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lhd/p;)V

    .line 44
    :cond_2e
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lhd/p;

    move-result-object v1

    invoke-static {v0, v6, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    const/16 v22, 0x0

    .line 45
    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v7, v0}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 47
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2f

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_2f
    move-object/from16 v17, v7

    move-object v2, v11

    move-object v3, v12

    move v5, v14

    move v6, v15

    move-object/from16 v1, v16

    move-object/from16 v7, p0

    :goto_1c
    move-object v4, v13

    goto :goto_1d

    :cond_30
    move-object v7, v1

    .line 48
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move-object v2, v6

    move-object/from16 v17, v7

    move v5, v15

    move/from16 v6, p5

    move-object/from16 v7, p6

    goto :goto_1c

    :goto_1d
    invoke-interface/range {v17 .. v17}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v11

    if-eqz v11, :cond_31

    new-instance v0, Landroidx/compose/foundation/layout/FlowLayoutKt$FlowColumn$1;

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v10}, Landroidx/compose/foundation/layout/FlowLayoutKt$FlowColumn$1;-><init>(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILandroidx/compose/foundation/layout/FlowColumnOverflow;Lhd/q;II)V

    invoke-interface {v11, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lhd/p;)V

    :cond_31
    return-void
.end method

.method public static final FlowColumn(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILhd/q;Landroidx/compose/runtime/Composer;II)V
    .locals 21
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
            "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
            "Landroidx/compose/ui/Alignment$Horizontal;",
            "II",
            "Lhd/q;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v8, p8

    const v0, -0xc6772f2

    move-object/from16 v1, p7

    .line 49
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v1

    and-int/lit8 v2, p9, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v3, v8, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v8, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v8

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v8

    :goto_1
    and-int/lit8 v5, p9, 0x2

    if-eqz v5, :cond_4

    or-int/lit8 v4, v4, 0x30

    :cond_3
    move-object/from16 v6, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v6, v8, 0x30

    if-nez v6, :cond_3

    move-object/from16 v6, p1

    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x20

    goto :goto_2

    :cond_5
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v4, v7

    :goto_3
    and-int/lit8 v7, p9, 0x4

    if-eqz v7, :cond_7

    or-int/lit16 v4, v4, 0x180

    :cond_6
    move-object/from16 v9, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v9, v8, 0x180

    if-nez v9, :cond_6

    move-object/from16 v9, p2

    invoke-interface {v1, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    const/16 v10, 0x100

    goto :goto_4

    :cond_8
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v4, v10

    :goto_5
    and-int/lit8 v10, p9, 0x8

    if-eqz v10, :cond_a

    or-int/lit16 v4, v4, 0xc00

    :cond_9
    move-object/from16 v11, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v11, v8, 0xc00

    if-nez v11, :cond_9

    move-object/from16 v11, p3

    invoke-interface {v1, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_b

    const/16 v12, 0x800

    goto :goto_6

    :cond_b
    const/16 v12, 0x400

    :goto_6
    or-int/2addr v4, v12

    :goto_7
    and-int/lit8 v12, p9, 0x10

    if-eqz v12, :cond_d

    or-int/lit16 v4, v4, 0x6000

    :cond_c
    move/from16 v13, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v13, v8, 0x6000

    if-nez v13, :cond_c

    move/from16 v13, p4

    invoke-interface {v1, v13}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v14

    if-eqz v14, :cond_e

    const/16 v14, 0x4000

    goto :goto_8

    :cond_e
    const/16 v14, 0x2000

    :goto_8
    or-int/2addr v4, v14

    :goto_9
    and-int/lit8 v14, p9, 0x20

    const/high16 v15, 0x30000

    if-eqz v14, :cond_10

    or-int/2addr v4, v15

    :cond_f
    move/from16 v15, p5

    goto :goto_b

    :cond_10
    and-int/2addr v15, v8

    if-nez v15, :cond_f

    move/from16 v15, p5

    invoke-interface {v1, v15}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v16

    if-eqz v16, :cond_11

    const/high16 v16, 0x20000

    goto :goto_a

    :cond_11
    const/high16 v16, 0x10000

    :goto_a
    or-int v4, v4, v16

    :goto_b
    and-int/lit8 v16, p9, 0x40

    const/high16 v17, 0x180000

    if-eqz v16, :cond_12

    or-int v4, v4, v17

    move-object/from16 v0, p6

    goto :goto_d

    :cond_12
    and-int v16, v8, v17

    move-object/from16 v0, p6

    if-nez v16, :cond_14

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_13

    const/high16 v18, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v18, 0x80000

    :goto_c
    or-int v4, v4, v18

    :cond_14
    :goto_d
    const v18, 0x92493

    and-int v0, v4, v18

    move/from16 p7, v2

    const v2, 0x92492

    if-eq v0, v2, :cond_15

    const/4 v0, 0x1

    goto :goto_e

    :cond_15
    const/4 v0, 0x0

    :goto_e
    and-int/lit8 v2, v4, 0x1

    invoke-interface {v1, v0, v2}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_1e

    if-eqz p7, :cond_16

    .line 50
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    move-object v9, v0

    goto :goto_f

    :cond_16
    move-object v9, v3

    :goto_f
    if-eqz v5, :cond_17

    .line 51
    sget-object v0, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v0}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    move-result-object v0

    move/from16 v20, v10

    move-object v10, v0

    move/from16 v0, v20

    goto :goto_10

    :cond_17
    move v0, v10

    move-object v10, v6

    :goto_10
    if-eqz v7, :cond_18

    .line 52
    sget-object v2, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v2}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    move-result-object v2

    move-object v11, v2

    goto :goto_11

    :cond_18
    move-object/from16 v11, p2

    :goto_11
    if-eqz v0, :cond_19

    .line 53
    sget-object v0, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    move-result-object v0

    move/from16 v20, v12

    move-object v12, v0

    move/from16 v0, v20

    goto :goto_12

    :cond_19
    move v0, v12

    move-object/from16 v12, p3

    :goto_12
    const v2, 0x7fffffff

    if-eqz v0, :cond_1a

    move v13, v2

    :cond_1a
    if-eqz v14, :cond_1b

    move v14, v2

    goto :goto_13

    :cond_1b
    move v14, v15

    .line 54
    :goto_13
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1c

    const/4 v0, -0x1

    const-string v2, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:270)"

    const v3, -0xc6772f2

    .line 55
    invoke-static {v3, v4, v0, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 56
    :cond_1c
    sget-object v0, Landroidx/compose/foundation/layout/FlowColumnOverflow;->Companion:Landroidx/compose/foundation/layout/FlowColumnOverflow$Companion;

    invoke-virtual {v0}, Landroidx/compose/foundation/layout/FlowColumnOverflow$Companion;->getClip()Landroidx/compose/foundation/layout/FlowColumnOverflow;

    move-result-object v15

    and-int/lit8 v0, v4, 0xe

    or-int v0, v0, v17

    and-int/lit8 v2, v4, 0x70

    or-int/2addr v0, v2

    and-int/lit16 v2, v4, 0x380

    or-int/2addr v0, v2

    and-int/lit16 v2, v4, 0x1c00

    or-int/2addr v0, v2

    const v2, 0xe000

    and-int/2addr v2, v4

    or-int/2addr v0, v2

    const/high16 v2, 0x70000

    and-int/2addr v2, v4

    or-int/2addr v0, v2

    shl-int/lit8 v2, v4, 0x3

    const/high16 v3, 0x1c00000

    and-int/2addr v2, v3

    or-int v18, v0, v2

    const/16 v19, 0x0

    move-object/from16 v16, p6

    move-object/from16 v17, v1

    .line 57
    invoke-static/range {v9 .. v19}, Landroidx/compose/foundation/layout/FlowLayoutKt;->FlowColumn(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILandroidx/compose/foundation/layout/FlowColumnOverflow;Lhd/q;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1d

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_1d
    move-object v1, v9

    move-object v2, v10

    move-object v3, v11

    move-object v4, v12

    move v6, v14

    :goto_14
    move v5, v13

    goto :goto_15

    :cond_1e
    move-object/from16 v17, v1

    .line 58
    invoke-interface/range {v17 .. v17}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v4, p3

    move-object v1, v3

    move-object v2, v6

    move v6, v15

    move-object/from16 v3, p2

    goto :goto_14

    :goto_15
    invoke-interface/range {v17 .. v17}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v10

    if-eqz v10, :cond_1f

    new-instance v0, Landroidx/compose/foundation/layout/FlowLayoutKt$FlowColumn$2;

    move-object/from16 v7, p6

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Landroidx/compose/foundation/layout/FlowLayoutKt$FlowColumn$2;-><init>(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILhd/q;II)V

    invoke-interface {v10, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lhd/p;)V

    :cond_1f
    return-void
.end method

.method public static final FlowRow(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILandroidx/compose/foundation/layout/FlowRowOverflow;Lhd/q;Landroidx/compose/runtime/Composer;II)V
    .locals 24
    .annotation build Landroidx/compose/foundation/layout/ExperimentalLayoutApi;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
            "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
            "Landroidx/compose/ui/Alignment$Vertical;",
            "II",
            "Landroidx/compose/foundation/layout/FlowRowOverflow;",
            "Lhd/q;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .annotation runtime Lqc/a;
    .end annotation

    move-object/from16 v8, p7

    move/from16 v9, p9

    move/from16 v10, p10

    const v0, -0xd0882ce

    move-object/from16 v1, p8

    .line 1
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v1

    and-int/lit8 v2, v10, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v3, v9, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v9, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v9

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v9

    :goto_1
    and-int/lit8 v5, v10, 0x2

    if-eqz v5, :cond_4

    or-int/lit8 v4, v4, 0x30

    :cond_3
    move-object/from16 v6, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v6, v9, 0x30

    if-nez v6, :cond_3

    move-object/from16 v6, p1

    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x20

    goto :goto_2

    :cond_5
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v4, v7

    :goto_3
    and-int/lit8 v7, v10, 0x4

    if-eqz v7, :cond_7

    or-int/lit16 v4, v4, 0x180

    :cond_6
    move-object/from16 v11, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v11, v9, 0x180

    if-nez v11, :cond_6

    move-object/from16 v11, p2

    invoke-interface {v1, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_8

    const/16 v12, 0x100

    goto :goto_4

    :cond_8
    const/16 v12, 0x80

    :goto_4
    or-int/2addr v4, v12

    :goto_5
    and-int/lit8 v12, v10, 0x8

    if-eqz v12, :cond_a

    or-int/lit16 v4, v4, 0xc00

    :cond_9
    move-object/from16 v13, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v13, v9, 0xc00

    if-nez v13, :cond_9

    move-object/from16 v13, p3

    invoke-interface {v1, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_b

    const/16 v14, 0x800

    goto :goto_6

    :cond_b
    const/16 v14, 0x400

    :goto_6
    or-int/2addr v4, v14

    :goto_7
    and-int/lit8 v14, v10, 0x10

    if-eqz v14, :cond_d

    or-int/lit16 v4, v4, 0x6000

    :cond_c
    move/from16 v15, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v15, v9, 0x6000

    if-nez v15, :cond_c

    move/from16 v15, p4

    invoke-interface {v1, v15}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v16

    if-eqz v16, :cond_e

    const/16 v16, 0x4000

    goto :goto_8

    :cond_e
    const/16 v16, 0x2000

    :goto_8
    or-int v4, v4, v16

    :goto_9
    and-int/lit8 v16, v10, 0x20

    const/high16 v18, 0x30000

    if-eqz v16, :cond_f

    or-int v4, v4, v18

    move/from16 v0, p5

    goto :goto_b

    :cond_f
    and-int v18, v9, v18

    move/from16 v0, p5

    if-nez v18, :cond_11

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v18

    if-eqz v18, :cond_10

    const/high16 v18, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v18, 0x10000

    :goto_a
    or-int v4, v4, v18

    :cond_11
    :goto_b
    and-int/lit8 v18, v10, 0x40

    const/high16 v19, 0x180000

    if-eqz v18, :cond_12

    or-int v4, v4, v19

    move-object/from16 v0, p6

    goto :goto_d

    :cond_12
    and-int v19, v9, v19

    move-object/from16 v0, p6

    if-nez v19, :cond_14

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_13

    const/high16 v20, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v20, 0x80000

    :goto_c
    or-int v4, v4, v20

    :cond_14
    :goto_d
    and-int/lit16 v0, v10, 0x80

    move/from16 v20, v0

    const/high16 v21, 0xc00000

    if-eqz v20, :cond_15

    or-int v4, v4, v21

    goto :goto_f

    :cond_15
    and-int v20, v9, v21

    if-nez v20, :cond_17

    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_16

    const/high16 v20, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v20, 0x400000

    :goto_e
    or-int v4, v4, v20

    :cond_17
    :goto_f
    const v20, 0x492493

    and-int v0, v4, v20

    move/from16 v20, v2

    const v2, 0x492492

    if-eq v0, v2, :cond_18

    const/4 v0, 0x1

    goto :goto_10

    :cond_18
    const/4 v0, 0x0

    :goto_10
    and-int/lit8 v2, v4, 0x1

    invoke-interface {v1, v0, v2}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_30

    if-eqz v20, :cond_19

    .line 2
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    goto :goto_11

    :cond_19
    move-object/from16 v0, p0

    :goto_11
    if-eqz v5, :cond_1a

    .line 3
    sget-object v2, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v2}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    move-result-object v2

    move-object v11, v2

    goto :goto_12

    :cond_1a
    move-object v11, v6

    :goto_12
    if-eqz v7, :cond_1b

    .line 4
    sget-object v2, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v2}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    move-result-object v2

    move/from16 v23, v12

    move-object v12, v2

    move/from16 v2, v23

    goto :goto_13

    :cond_1b
    move v2, v12

    move-object/from16 v12, p2

    :goto_13
    if-eqz v2, :cond_1c

    .line 5
    sget-object v2, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v2}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    move-result-object v2

    move-object v13, v2

    :cond_1c
    const v2, 0x7fffffff

    if-eqz v14, :cond_1d

    move v14, v2

    goto :goto_14

    :cond_1d
    move v14, v15

    :goto_14
    if-eqz v16, :cond_1e

    move v15, v2

    goto :goto_15

    :cond_1e
    move/from16 v15, p5

    :goto_15
    if-eqz v18, :cond_1f

    .line 6
    sget-object v2, Landroidx/compose/foundation/layout/FlowRowOverflow;->Companion:Landroidx/compose/foundation/layout/FlowRowOverflow$Companion;

    invoke-virtual {v2}, Landroidx/compose/foundation/layout/FlowRowOverflow$Companion;->getClip()Landroidx/compose/foundation/layout/FlowRowOverflow;

    move-result-object v2

    goto :goto_16

    :cond_1f
    move-object/from16 v2, p6

    :goto_16
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v5

    if-eqz v5, :cond_20

    const/4 v5, -0x1

    const-string v6, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:98)"

    const v7, -0xd0882ce

    .line 7
    invoke-static {v7, v4, v5, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_20
    const/high16 v5, 0x380000

    and-int/2addr v5, v4

    const/high16 v6, 0x100000

    if-ne v5, v6, :cond_21

    const/4 v6, 0x1

    goto :goto_17

    :cond_21
    const/4 v6, 0x0

    .line 8
    :goto_17
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_22

    .line 9
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v6

    if-ne v7, v6, :cond_23

    .line 10
    :cond_22
    invoke-virtual {v2}, Landroidx/compose/foundation/layout/FlowLayoutOverflow;->createOverflowState$foundation_layout_release()Landroidx/compose/foundation/layout/FlowLayoutOverflowState;

    move-result-object v7

    .line 11
    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 12
    :cond_23
    move-object/from16 v16, v7

    check-cast v16, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;

    shr-int/lit8 v6, v4, 0x3

    const v7, 0xfffe

    and-int v18, v6, v7

    move-object/from16 v17, v1

    .line 13
    invoke-static/range {v11 .. v18}, Landroidx/compose/foundation/layout/FlowLayoutKt;->rowMeasurementMultiContentHelper(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MultiContentMeasurePolicy;

    move-result-object v1

    move-object/from16 v6, v16

    move-object/from16 v7, v17

    const/high16 v3, 0x100000

    if-ne v5, v3, :cond_24

    const/4 v3, 0x1

    goto :goto_18

    :cond_24
    const/4 v3, 0x0

    :goto_18
    const/high16 v5, 0x1c00000

    and-int/2addr v5, v4

    move/from16 p0, v3

    const/high16 v3, 0x800000

    if-ne v5, v3, :cond_25

    const/4 v3, 0x1

    goto :goto_19

    :cond_25
    const/4 v3, 0x0

    :goto_19
    or-int v3, p0, v3

    const/high16 v5, 0x70000

    and-int/2addr v4, v5

    const/high16 v5, 0x20000

    if-ne v4, v5, :cond_26

    const/4 v4, 0x1

    goto :goto_1a

    :cond_26
    const/4 v4, 0x0

    :goto_1a
    or-int/2addr v3, v4

    .line 14
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_27

    .line 15
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_28

    .line 16
    :cond_27
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 17
    new-instance v3, Landroidx/compose/foundation/layout/FlowLayoutKt$FlowRow$list$1$1;

    invoke-direct {v3, v8}, Landroidx/compose/foundation/layout/FlowLayoutKt$FlowRow$list$1$1;-><init>(Lhd/q;)V

    const v5, 0x29d91e82

    const/4 v8, 0x1

    invoke-static {v5, v8, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v3

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 18
    invoke-virtual {v2, v6, v4}, Landroidx/compose/foundation/layout/FlowLayoutOverflow;->addOverflowComposables$foundation_layout_release(Landroidx/compose/foundation/layout/FlowLayoutOverflowState;Ljava/util/List;)V

    .line 19
    invoke-interface {v7, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 20
    :cond_28
    check-cast v4, Ljava/util/List;

    .line 21
    invoke-static {v4}, Landroidx/compose/ui/layout/LayoutKt;->combineAsVirtualLayouts(Ljava/util/List;)Lhd/p;

    move-result-object v3

    .line 22
    invoke-interface {v7, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    .line 23
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_29

    .line 24
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v5, v4, :cond_2a

    .line 25
    :cond_29
    invoke-static {v1}, Landroidx/compose/ui/layout/MultiContentMeasurePolicyKt;->createMeasurePolicy(Landroidx/compose/ui/layout/MultiContentMeasurePolicy;)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v5

    .line 26
    invoke-interface {v7, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 27
    :cond_2a
    check-cast v5, Landroidx/compose/ui/layout/MeasurePolicy;

    const/4 v1, 0x0

    .line 28
    invoke-static {v7, v1}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v4

    .line 29
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v1

    .line 30
    invoke-static {v7, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    .line 31
    sget-object v8, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    move-object/from16 v16, v0

    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lhd/a;

    move-result-object v0

    .line 32
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v17

    if-nez v17, :cond_2b

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 33
    :cond_2b
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 34
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v17

    if-eqz v17, :cond_2c

    .line 35
    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->createNode(Lhd/a;)V

    goto :goto_1b

    .line 36
    :cond_2c
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 37
    :goto_1b
    invoke-static {v7}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v0

    move-object/from16 p0, v2

    .line 38
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lhd/p;

    move-result-object v2

    invoke-static {v0, v5, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 39
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lhd/p;

    move-result-object v2

    invoke-static {v0, v1, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 40
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lhd/p;

    move-result-object v1

    .line 41
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v2

    if-nez v2, :cond_2d

    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2e

    .line 42
    :cond_2d
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 43
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2, v1}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lhd/p;)V

    .line 44
    :cond_2e
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lhd/p;

    move-result-object v1

    invoke-static {v0, v6, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    const/16 v22, 0x0

    .line 45
    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v3, v7, v0}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 47
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2f

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_2f
    move-object/from16 v17, v7

    move-object v2, v11

    move-object v3, v12

    move v5, v14

    move v6, v15

    move-object/from16 v1, v16

    move-object/from16 v7, p0

    :goto_1c
    move-object v4, v13

    goto :goto_1d

    :cond_30
    move-object v7, v1

    .line 48
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move-object v2, v6

    move-object/from16 v17, v7

    move v5, v15

    move/from16 v6, p5

    move-object/from16 v7, p6

    goto :goto_1c

    :goto_1d
    invoke-interface/range {v17 .. v17}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v11

    if-eqz v11, :cond_31

    new-instance v0, Landroidx/compose/foundation/layout/FlowLayoutKt$FlowRow$1;

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v10}, Landroidx/compose/foundation/layout/FlowLayoutKt$FlowRow$1;-><init>(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILandroidx/compose/foundation/layout/FlowRowOverflow;Lhd/q;II)V

    invoke-interface {v11, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lhd/p;)V

    :cond_31
    return-void
.end method

.method public static final FlowRow(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILhd/q;Landroidx/compose/runtime/Composer;II)V
    .locals 21
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/foundation/layout/Arrangement$Horizontal;",
            "Landroidx/compose/foundation/layout/Arrangement$Vertical;",
            "Landroidx/compose/ui/Alignment$Vertical;",
            "II",
            "Lhd/q;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v8, p8

    const v0, -0x7b6532ec

    move-object/from16 v1, p7

    .line 49
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v1

    and-int/lit8 v2, p9, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v3, v8, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v8, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v8

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v8

    :goto_1
    and-int/lit8 v5, p9, 0x2

    if-eqz v5, :cond_4

    or-int/lit8 v4, v4, 0x30

    :cond_3
    move-object/from16 v6, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v6, v8, 0x30

    if-nez v6, :cond_3

    move-object/from16 v6, p1

    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x20

    goto :goto_2

    :cond_5
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v4, v7

    :goto_3
    and-int/lit8 v7, p9, 0x4

    if-eqz v7, :cond_7

    or-int/lit16 v4, v4, 0x180

    :cond_6
    move-object/from16 v9, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v9, v8, 0x180

    if-nez v9, :cond_6

    move-object/from16 v9, p2

    invoke-interface {v1, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    const/16 v10, 0x100

    goto :goto_4

    :cond_8
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v4, v10

    :goto_5
    and-int/lit8 v10, p9, 0x8

    if-eqz v10, :cond_a

    or-int/lit16 v4, v4, 0xc00

    :cond_9
    move-object/from16 v11, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v11, v8, 0xc00

    if-nez v11, :cond_9

    move-object/from16 v11, p3

    invoke-interface {v1, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_b

    const/16 v12, 0x800

    goto :goto_6

    :cond_b
    const/16 v12, 0x400

    :goto_6
    or-int/2addr v4, v12

    :goto_7
    and-int/lit8 v12, p9, 0x10

    if-eqz v12, :cond_d

    or-int/lit16 v4, v4, 0x6000

    :cond_c
    move/from16 v13, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v13, v8, 0x6000

    if-nez v13, :cond_c

    move/from16 v13, p4

    invoke-interface {v1, v13}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v14

    if-eqz v14, :cond_e

    const/16 v14, 0x4000

    goto :goto_8

    :cond_e
    const/16 v14, 0x2000

    :goto_8
    or-int/2addr v4, v14

    :goto_9
    and-int/lit8 v14, p9, 0x20

    const/high16 v15, 0x30000

    if-eqz v14, :cond_10

    or-int/2addr v4, v15

    :cond_f
    move/from16 v15, p5

    goto :goto_b

    :cond_10
    and-int/2addr v15, v8

    if-nez v15, :cond_f

    move/from16 v15, p5

    invoke-interface {v1, v15}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v16

    if-eqz v16, :cond_11

    const/high16 v16, 0x20000

    goto :goto_a

    :cond_11
    const/high16 v16, 0x10000

    :goto_a
    or-int v4, v4, v16

    :goto_b
    and-int/lit8 v16, p9, 0x40

    const/high16 v17, 0x180000

    if-eqz v16, :cond_12

    or-int v4, v4, v17

    move-object/from16 v0, p6

    goto :goto_d

    :cond_12
    and-int v16, v8, v17

    move-object/from16 v0, p6

    if-nez v16, :cond_14

    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_13

    const/high16 v18, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v18, 0x80000

    :goto_c
    or-int v4, v4, v18

    :cond_14
    :goto_d
    const v18, 0x92493

    and-int v0, v4, v18

    move/from16 p7, v2

    const v2, 0x92492

    if-eq v0, v2, :cond_15

    const/4 v0, 0x1

    goto :goto_e

    :cond_15
    const/4 v0, 0x0

    :goto_e
    and-int/lit8 v2, v4, 0x1

    invoke-interface {v1, v0, v2}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_1e

    if-eqz p7, :cond_16

    .line 50
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    move-object v9, v0

    goto :goto_f

    :cond_16
    move-object v9, v3

    :goto_f
    if-eqz v5, :cond_17

    .line 51
    sget-object v0, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v0}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    move-result-object v0

    move/from16 v20, v10

    move-object v10, v0

    move/from16 v0, v20

    goto :goto_10

    :cond_17
    move v0, v10

    move-object v10, v6

    :goto_10
    if-eqz v7, :cond_18

    .line 52
    sget-object v2, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v2}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    move-result-object v2

    move-object v11, v2

    goto :goto_11

    :cond_18
    move-object/from16 v11, p2

    :goto_11
    if-eqz v0, :cond_19

    .line 53
    sget-object v0, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    move-result-object v0

    move/from16 v20, v12

    move-object v12, v0

    move/from16 v0, v20

    goto :goto_12

    :cond_19
    move v0, v12

    move-object/from16 v12, p3

    :goto_12
    const v2, 0x7fffffff

    if-eqz v0, :cond_1a

    move v13, v2

    :cond_1a
    if-eqz v14, :cond_1b

    move v14, v2

    goto :goto_13

    :cond_1b
    move v14, v15

    .line 54
    :goto_13
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1c

    const/4 v0, -0x1

    const-string v2, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:161)"

    const v3, -0x7b6532ec

    .line 55
    invoke-static {v3, v4, v0, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 56
    :cond_1c
    sget-object v0, Landroidx/compose/foundation/layout/FlowRowOverflow;->Companion:Landroidx/compose/foundation/layout/FlowRowOverflow$Companion;

    invoke-virtual {v0}, Landroidx/compose/foundation/layout/FlowRowOverflow$Companion;->getClip()Landroidx/compose/foundation/layout/FlowRowOverflow;

    move-result-object v15

    and-int/lit8 v0, v4, 0xe

    or-int v0, v0, v17

    and-int/lit8 v2, v4, 0x70

    or-int/2addr v0, v2

    and-int/lit16 v2, v4, 0x380

    or-int/2addr v0, v2

    and-int/lit16 v2, v4, 0x1c00

    or-int/2addr v0, v2

    const v2, 0xe000

    and-int/2addr v2, v4

    or-int/2addr v0, v2

    const/high16 v2, 0x70000

    and-int/2addr v2, v4

    or-int/2addr v0, v2

    shl-int/lit8 v2, v4, 0x3

    const/high16 v3, 0x1c00000

    and-int/2addr v2, v3

    or-int v18, v0, v2

    const/16 v19, 0x0

    move-object/from16 v16, p6

    move-object/from16 v17, v1

    .line 57
    invoke-static/range {v9 .. v19}, Landroidx/compose/foundation/layout/FlowLayoutKt;->FlowRow(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILandroidx/compose/foundation/layout/FlowRowOverflow;Lhd/q;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1d

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_1d
    move-object v1, v9

    move-object v2, v10

    move-object v3, v11

    move-object v4, v12

    move v6, v14

    :goto_14
    move v5, v13

    goto :goto_15

    :cond_1e
    move-object/from16 v17, v1

    .line 58
    invoke-interface/range {v17 .. v17}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v4, p3

    move-object v1, v3

    move-object v2, v6

    move v6, v15

    move-object/from16 v3, p2

    goto :goto_14

    :goto_15
    invoke-interface/range {v17 .. v17}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v10

    if-eqz v10, :cond_1f

    new-instance v0, Landroidx/compose/foundation/layout/FlowLayoutKt$FlowRow$2;

    move-object/from16 v7, p6

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Landroidx/compose/foundation/layout/FlowLayoutKt$FlowRow$2;-><init>(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILhd/q;II)V

    invoke-interface {v10, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lhd/p;)V

    :cond_1f
    return-void
.end method

.method public static final synthetic access$intrinsicCrossAxisSize(Ljava/util/List;[I[IIIIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)J
    .locals 0

    .line 1
    invoke-static/range {p0 .. p8}, Landroidx/compose/foundation/layout/FlowLayoutKt;->intrinsicCrossAxisSize(Ljava/util/List;[I[IIIIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method public static final breakDownItems-di9J0FM(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;Ljava/util/Iterator;FFJIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)Landroidx/compose/ui/layout/MeasureResult;
    .locals 53
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/MeasureScope;",
            "Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;",
            "Ljava/util/Iterator<",
            "+",
            "Landroidx/compose/ui/layout/Measurable;",
            ">;FFJII",
            "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;",
            ")",
            "Landroidx/compose/ui/layout/MeasureResult;"
        }
    .end annotation

    .line 1
    move-object/from16 v6, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    new-instance v13, Landroidx/compose/runtime/collection/MutableVector;

    .line 8
    .line 9
    const/16 v1, 0x10

    .line 10
    .line 11
    new-array v1, v1, [Landroidx/compose/ui/layout/MeasureResult;

    .line 12
    .line 13
    const/4 v14, 0x0

    .line 14
    invoke-direct {v13, v1, v14}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 15
    .line 16
    .line 17
    invoke-static/range {p5 .. p6}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-static/range {p5 .. p6}, Landroidx/compose/ui/unit/Constraints;->getMinWidth-impl(J)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-static/range {p5 .. p6}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-static {}, Landroidx/collection/IntObjectMapKt;->mutableIntObjectMapOf()Landroidx/collection/MutableIntObjectMap;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    new-instance v5, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 36
    .line 37
    .line 38
    move/from16 v8, p3

    .line 39
    .line 40
    invoke-interface {v6, v8}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 41
    .line 42
    .line 43
    move-result v8

    .line 44
    float-to-double v8, v8

    .line 45
    invoke-static {v8, v9}, Ljava/lang/Math;->ceil(D)D

    .line 46
    .line 47
    .line 48
    move-result-wide v8

    .line 49
    double-to-float v8, v8

    .line 50
    float-to-int v8, v8

    .line 51
    move/from16 v9, p4

    .line 52
    .line 53
    invoke-interface {v6, v9}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 54
    .line 55
    .line 56
    move-result v9

    .line 57
    float-to-double v9, v9

    .line 58
    invoke-static {v9, v10}, Ljava/lang/Math;->ceil(D)D

    .line 59
    .line 60
    .line 61
    move-result-wide v9

    .line 62
    double-to-float v9, v9

    .line 63
    float-to-int v9, v9

    .line 64
    invoke-static {v14, v1, v14, v3}, Landroidx/compose/foundation/layout/OrientationIndependentConstraints;->constructor-impl(IIII)J

    .line 65
    .line 66
    .line 67
    move-result-wide v15

    .line 68
    const/16 v21, 0xe

    .line 69
    .line 70
    const/16 v22, 0x0

    .line 71
    .line 72
    const/16 v17, 0x0

    .line 73
    .line 74
    const/16 v18, 0x0

    .line 75
    .line 76
    const/16 v19, 0x0

    .line 77
    .line 78
    const/16 v20, 0x0

    .line 79
    .line 80
    invoke-static/range {v15 .. v22}, Landroidx/compose/foundation/layout/OrientationIndependentConstraints;->copy-yUG9Ft0$default(JIIIIILjava/lang/Object;)J

    .line 81
    .line 82
    .line 83
    move-result-wide v10

    .line 84
    move-wide/from16 v24, v15

    .line 85
    .line 86
    invoke-interface {v7}, Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;->isHorizontal()Z

    .line 87
    .line 88
    .line 89
    move-result v12

    .line 90
    if-eqz v12, :cond_0

    .line 91
    .line 92
    sget-object v12, Landroidx/compose/foundation/layout/LayoutOrientation;->Horizontal:Landroidx/compose/foundation/layout/LayoutOrientation;

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_0
    sget-object v12, Landroidx/compose/foundation/layout/LayoutOrientation;->Vertical:Landroidx/compose/foundation/layout/LayoutOrientation;

    .line 96
    .line 97
    :goto_0
    invoke-static {v10, v11, v12}, Landroidx/compose/foundation/layout/OrientationIndependentConstraints;->toBoxConstraints-OenEA2s(JLandroidx/compose/foundation/layout/LayoutOrientation;)J

    .line 98
    .line 99
    .line 100
    move-result-wide v10

    .line 101
    new-instance v12, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 102
    .line 103
    invoke-direct {v12}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 104
    .line 105
    .line 106
    instance-of v15, v0, Landroidx/compose/foundation/layout/ContextualFlowItemIterator;

    .line 107
    .line 108
    const/16 v17, 0x0

    .line 109
    .line 110
    if-eqz v15, :cond_1

    .line 111
    .line 112
    new-instance v16, Landroidx/compose/foundation/layout/FlowLineInfo;

    .line 113
    .line 114
    invoke-interface {v6, v1}, Landroidx/compose/ui/unit/Density;->toDp-u2uoSUM(I)F

    .line 115
    .line 116
    .line 117
    move-result v19

    .line 118
    invoke-interface {v6, v3}, Landroidx/compose/ui/unit/Density;->toDp-u2uoSUM(I)F

    .line 119
    .line 120
    .line 121
    move-result v20

    .line 122
    const/16 v21, 0x0

    .line 123
    .line 124
    const/16 v18, 0x0

    .line 125
    .line 126
    invoke-direct/range {v16 .. v21}, Landroidx/compose/foundation/layout/FlowLineInfo;-><init>(IIFFLkotlin/jvm/internal/n;)V

    .line 127
    .line 128
    .line 129
    move-object/from16 v15, v16

    .line 130
    .line 131
    :goto_1
    move/from16 v27, v17

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_1
    const/4 v15, 0x0

    .line 135
    goto :goto_1

    .line 136
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 137
    .line 138
    .line 139
    move-result v16

    .line 140
    if-nez v16, :cond_2

    .line 141
    .line 142
    const/4 v14, 0x0

    .line 143
    goto :goto_3

    .line 144
    :cond_2
    invoke-static {v0, v15}, Landroidx/compose/foundation/layout/FlowLayoutKt;->safeNext(Ljava/util/Iterator;Landroidx/compose/foundation/layout/FlowLineInfo;)Landroidx/compose/ui/layout/Measurable;

    .line 145
    .line 146
    .line 147
    move-result-object v16

    .line 148
    move-object/from16 v14, v16

    .line 149
    .line 150
    :goto_3
    move/from16 v28, v2

    .line 151
    .line 152
    if-eqz v14, :cond_3

    .line 153
    .line 154
    new-instance v2, Landroidx/compose/foundation/layout/FlowLayoutKt$breakDownItems$nextSize$1$1;

    .line 155
    .line 156
    invoke-direct {v2, v12}, Landroidx/compose/foundation/layout/FlowLayoutKt$breakDownItems$nextSize$1$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V

    .line 157
    .line 158
    .line 159
    invoke-static {v14, v7, v10, v11, v2}, Landroidx/compose/foundation/layout/FlowLayoutKt;->measureAndCache-rqJ1uqs(Landroidx/compose/ui/layout/Measurable;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;JLhd/l;)J

    .line 160
    .line 161
    .line 162
    move-result-wide v16

    .line 163
    invoke-static/range {v16 .. v17}, Landroidx/collection/IntIntPair;->box-impl(J)Landroidx/collection/IntIntPair;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    move-object/from16 v34, v2

    .line 168
    .line 169
    goto :goto_4

    .line 170
    :cond_3
    const/16 v34, 0x0

    .line 171
    .line 172
    :goto_4
    if-eqz v34, :cond_4

    .line 173
    .line 174
    invoke-virtual/range {v34 .. v34}, Landroidx/collection/IntIntPair;->unbox-impl()J

    .line 175
    .line 176
    .line 177
    move-result-wide v16

    .line 178
    invoke-static/range {v16 .. v17}, Landroidx/collection/IntIntPair;->getFirst-impl(J)I

    .line 179
    .line 180
    .line 181
    move-result v2

    .line 182
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    goto :goto_5

    .line 187
    :cond_4
    const/4 v2, 0x0

    .line 188
    :goto_5
    if-eqz v34, :cond_5

    .line 189
    .line 190
    invoke-virtual/range {v34 .. v34}, Landroidx/collection/IntIntPair;->unbox-impl()J

    .line 191
    .line 192
    .line 193
    move-result-wide v16

    .line 194
    invoke-static/range {v16 .. v17}, Landroidx/collection/IntIntPair;->getSecond-impl(J)I

    .line 195
    .line 196
    .line 197
    move-result v16

    .line 198
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 199
    .line 200
    .line 201
    move-result-object v16

    .line 202
    move-object/from16 v40, v16

    .line 203
    .line 204
    :goto_6
    move-object/from16 p4, v2

    .line 205
    .line 206
    goto :goto_7

    .line 207
    :cond_5
    const/16 v40, 0x0

    .line 208
    .line 209
    goto :goto_6

    .line 210
    :goto_7
    new-instance v2, Landroidx/collection/MutableIntList;

    .line 211
    .line 212
    move/from16 v21, v8

    .line 213
    .line 214
    const/4 v8, 0x1

    .line 215
    move/from16 v22, v9

    .line 216
    .line 217
    move-object/from16 v26, v14

    .line 218
    .line 219
    const/4 v9, 0x0

    .line 220
    const/4 v14, 0x0

    .line 221
    invoke-direct {v2, v14, v8, v9}, Landroidx/collection/MutableIntList;-><init>(IILkotlin/jvm/internal/n;)V

    .line 222
    .line 223
    .line 224
    move-object/from16 v41, v13

    .line 225
    .line 226
    new-instance v13, Landroidx/collection/MutableIntList;

    .line 227
    .line 228
    invoke-direct {v13, v14, v8, v9}, Landroidx/collection/MutableIntList;-><init>(IILkotlin/jvm/internal/n;)V

    .line 229
    .line 230
    .line 231
    new-instance v42, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;

    .line 232
    .line 233
    const/16 v23, 0x0

    .line 234
    .line 235
    move-wide/from16 v18, p5

    .line 236
    .line 237
    move/from16 v16, p7

    .line 238
    .line 239
    move/from16 v20, p8

    .line 240
    .line 241
    move-object/from16 v17, p9

    .line 242
    .line 243
    move-object v9, v15

    .line 244
    move-object/from16 v15, v42

    .line 245
    .line 246
    invoke-direct/range {v15 .. v23}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;-><init>(ILandroidx/compose/foundation/layout/FlowLayoutOverflowState;JIIILkotlin/jvm/internal/n;)V

    .line 247
    .line 248
    .line 249
    move/from16 v23, v22

    .line 250
    .line 251
    move/from16 v22, v21

    .line 252
    .line 253
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 254
    .line 255
    .line 256
    move-result v30

    .line 257
    invoke-static {v1, v3}, Landroidx/collection/IntIntPair;->constructor-impl(II)J

    .line 258
    .line 259
    .line 260
    move-result-wide v32

    .line 261
    const/16 v38, 0x0

    .line 262
    .line 263
    const/16 v39, 0x0

    .line 264
    .line 265
    const/16 v31, 0x0

    .line 266
    .line 267
    const/16 v35, 0x0

    .line 268
    .line 269
    const/16 v36, 0x0

    .line 270
    .line 271
    const/16 v37, 0x0

    .line 272
    .line 273
    move-object/from16 v29, v42

    .line 274
    .line 275
    invoke-virtual/range {v29 .. v39}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;->getWrapInfo-OpUlnko(ZIJLandroidx/collection/IntIntPair;IIIZZ)Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;

    .line 276
    .line 277
    .line 278
    move-result-object v16

    .line 279
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;->isLastItemInContainer()Z

    .line 280
    .line 281
    .line 282
    move-result v15

    .line 283
    if-eqz v15, :cond_7

    .line 284
    .line 285
    if-eqz v34, :cond_6

    .line 286
    .line 287
    move/from16 v17, v8

    .line 288
    .line 289
    goto :goto_8

    .line 290
    :cond_6
    move/from16 v17, v14

    .line 291
    .line 292
    :goto_8
    const/16 v19, 0x0

    .line 293
    .line 294
    const/16 v21, 0x0

    .line 295
    .line 296
    const/16 v18, -0x1

    .line 297
    .line 298
    move/from16 v20, v1

    .line 299
    .line 300
    move-object/from16 v15, v42

    .line 301
    .line 302
    invoke-virtual/range {v15 .. v21}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;->getWrapEllipsisInfo(Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;ZIIII)Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    move/from16 v15, v20

    .line 307
    .line 308
    goto :goto_9

    .line 309
    :cond_7
    move v15, v1

    .line 310
    const/4 v1, 0x0

    .line 311
    :goto_9
    move-object/from16 v17, p4

    .line 312
    .line 313
    move-object/from16 p8, v1

    .line 314
    .line 315
    move/from16 v20, v3

    .line 316
    .line 317
    move/from16 p4, v8

    .line 318
    .line 319
    move v1, v14

    .line 320
    move/from16 v19, v1

    .line 321
    .line 322
    move/from16 v21, v19

    .line 323
    .line 324
    move/from16 v49, v21

    .line 325
    .line 326
    move-object/from16 v18, v16

    .line 327
    .line 328
    move/from16 v45, v27

    .line 329
    .line 330
    move/from16 v8, v28

    .line 331
    .line 332
    move-object/from16 v27, v2

    .line 333
    .line 334
    move/from16 v2, v20

    .line 335
    .line 336
    move/from16 v3, v49

    .line 337
    .line 338
    move/from16 v16, v15

    .line 339
    .line 340
    move-object/from16 v14, v26

    .line 341
    .line 342
    :goto_a
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;->isLastItemInContainer()Z

    .line 343
    .line 344
    .line 345
    move-result v18

    .line 346
    if-nez v18, :cond_18

    .line 347
    .line 348
    if-eqz v14, :cond_18

    .line 349
    .line 350
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 351
    .line 352
    .line 353
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Integer;->intValue()I

    .line 354
    .line 355
    .line 356
    move-result v17

    .line 357
    invoke-static/range {v40 .. v40}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 358
    .line 359
    .line 360
    move-object/from16 v18, v13

    .line 361
    .line 362
    invoke-virtual/range {v40 .. v40}, Ljava/lang/Integer;->intValue()I

    .line 363
    .line 364
    .line 365
    move-result v13

    .line 366
    move/from16 v28, v15

    .line 367
    .line 368
    add-int v15, v19, v17

    .line 369
    .line 370
    invoke-static {v1, v13}, Ljava/lang/Math;->max(II)I

    .line 371
    .line 372
    .line 373
    move-result v50

    .line 374
    sub-int v1, v16, v17

    .line 375
    .line 376
    add-int/lit8 v13, v3, 0x1

    .line 377
    .line 378
    move/from16 v16, v8

    .line 379
    .line 380
    move-object/from16 v8, p9

    .line 381
    .line 382
    invoke-virtual {v8, v13}, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->setItemShown$foundation_layout_release(I)V

    .line 383
    .line 384
    .line 385
    invoke-interface {v5, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    iget-object v14, v12, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 389
    .line 390
    invoke-virtual {v4, v3, v14}, Landroidx/collection/MutableIntObjectMap;->set(ILjava/lang/Object;)V

    .line 391
    .line 392
    .line 393
    sub-int v3, v13, v21

    .line 394
    .line 395
    move/from16 v14, p7

    .line 396
    .line 397
    if-ge v3, v14, :cond_8

    .line 398
    .line 399
    move/from16 v17, p4

    .line 400
    .line 401
    goto :goto_b

    .line 402
    :cond_8
    const/16 v17, 0x0

    .line 403
    .line 404
    :goto_b
    if-eqz v9, :cond_f

    .line 405
    .line 406
    if-eqz v17, :cond_9

    .line 407
    .line 408
    move/from16 v44, v3

    .line 409
    .line 410
    move/from16 v3, v45

    .line 411
    .line 412
    goto :goto_c

    .line 413
    :cond_9
    add-int/lit8 v19, v45, 0x1

    .line 414
    .line 415
    move/from16 v44, v3

    .line 416
    .line 417
    move/from16 v3, v19

    .line 418
    .line 419
    :goto_c
    if-eqz v17, :cond_a

    .line 420
    .line 421
    move/from16 v8, v44

    .line 422
    .line 423
    goto :goto_d

    .line 424
    :cond_a
    const/4 v8, 0x0

    .line 425
    :goto_d
    if-eqz v17, :cond_c

    .line 426
    .line 427
    sub-int v19, v1, v22

    .line 428
    .line 429
    if-gez v19, :cond_b

    .line 430
    .line 431
    const/4 v14, 0x0

    .line 432
    goto :goto_e

    .line 433
    :cond_b
    move/from16 v14, v19

    .line 434
    .line 435
    goto :goto_e

    .line 436
    :cond_c
    move/from16 v14, v28

    .line 437
    .line 438
    :goto_e
    invoke-interface {v6, v14}, Landroidx/compose/ui/unit/Density;->toDp-u2uoSUM(I)F

    .line 439
    .line 440
    .line 441
    move-result v14

    .line 442
    if-eqz v17, :cond_d

    .line 443
    .line 444
    move-object/from16 v19, v4

    .line 445
    .line 446
    move v4, v2

    .line 447
    goto :goto_f

    .line 448
    :cond_d
    sub-int v17, v2, v50

    .line 449
    .line 450
    sub-int v17, v17, v23

    .line 451
    .line 452
    move-object/from16 v19, v4

    .line 453
    .line 454
    if-gez v17, :cond_e

    .line 455
    .line 456
    const/4 v4, 0x0

    .line 457
    goto :goto_f

    .line 458
    :cond_e
    move/from16 v4, v17

    .line 459
    .line 460
    :goto_f
    invoke-interface {v6, v4}, Landroidx/compose/ui/unit/Density;->toDp-u2uoSUM(I)F

    .line 461
    .line 462
    .line 463
    move-result v4

    .line 464
    invoke-virtual {v9, v3, v8, v14, v4}, Landroidx/compose/foundation/layout/FlowLineInfo;->update-4j6BHR0$foundation_layout_release(IIFF)V

    .line 465
    .line 466
    .line 467
    goto :goto_10

    .line 468
    :cond_f
    move/from16 v44, v3

    .line 469
    .line 470
    move-object/from16 v19, v4

    .line 471
    .line 472
    :goto_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 473
    .line 474
    .line 475
    move-result v3

    .line 476
    if-nez v3, :cond_10

    .line 477
    .line 478
    const/4 v14, 0x0

    .line 479
    :goto_11
    const/4 v3, 0x0

    .line 480
    goto :goto_12

    .line 481
    :cond_10
    invoke-static {v0, v9}, Landroidx/compose/foundation/layout/FlowLayoutKt;->safeNext(Ljava/util/Iterator;Landroidx/compose/foundation/layout/FlowLineInfo;)Landroidx/compose/ui/layout/Measurable;

    .line 482
    .line 483
    .line 484
    move-result-object v3

    .line 485
    move-object v14, v3

    .line 486
    goto :goto_11

    .line 487
    :goto_12
    iput-object v3, v12, Lkotlin/jvm/internal/Ref$ObjectRef;->c:Ljava/lang/Object;

    .line 488
    .line 489
    if-eqz v14, :cond_11

    .line 490
    .line 491
    new-instance v4, Landroidx/compose/foundation/layout/FlowLayoutKt$breakDownItems$1$1;

    .line 492
    .line 493
    invoke-direct {v4, v12}, Landroidx/compose/foundation/layout/FlowLayoutKt$breakDownItems$1$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V

    .line 494
    .line 495
    .line 496
    invoke-static {v14, v7, v10, v11, v4}, Landroidx/compose/foundation/layout/FlowLayoutKt;->measureAndCache-rqJ1uqs(Landroidx/compose/ui/layout/Measurable;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;JLhd/l;)J

    .line 497
    .line 498
    .line 499
    move-result-wide v29

    .line 500
    invoke-static/range {v29 .. v30}, Landroidx/collection/IntIntPair;->box-impl(J)Landroidx/collection/IntIntPair;

    .line 501
    .line 502
    .line 503
    move-result-object v4

    .line 504
    goto :goto_13

    .line 505
    :cond_11
    move-object v4, v3

    .line 506
    :goto_13
    if-eqz v4, :cond_12

    .line 507
    .line 508
    invoke-virtual {v4}, Landroidx/collection/IntIntPair;->unbox-impl()J

    .line 509
    .line 510
    .line 511
    move-result-wide v29

    .line 512
    invoke-static/range {v29 .. v30}, Landroidx/collection/IntIntPair;->getFirst-impl(J)I

    .line 513
    .line 514
    .line 515
    move-result v8

    .line 516
    add-int v8, v8, v22

    .line 517
    .line 518
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 519
    .line 520
    .line 521
    move-result-object v8

    .line 522
    goto :goto_14

    .line 523
    :cond_12
    move-object v8, v3

    .line 524
    :goto_14
    if-eqz v4, :cond_13

    .line 525
    .line 526
    invoke-virtual {v4}, Landroidx/collection/IntIntPair;->unbox-impl()J

    .line 527
    .line 528
    .line 529
    move-result-wide v29

    .line 530
    invoke-static/range {v29 .. v30}, Landroidx/collection/IntIntPair;->getSecond-impl(J)I

    .line 531
    .line 532
    .line 533
    move-result v17

    .line 534
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 535
    .line 536
    .line 537
    move-result-object v17

    .line 538
    move-object/from16 v40, v17

    .line 539
    .line 540
    goto :goto_15

    .line 541
    :cond_13
    move-object/from16 v40, v3

    .line 542
    .line 543
    :goto_15
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 544
    .line 545
    .line 546
    move-result v43

    .line 547
    move/from16 v48, v45

    .line 548
    .line 549
    invoke-static {v1, v2}, Landroidx/collection/IntIntPair;->constructor-impl(II)J

    .line 550
    .line 551
    .line 552
    move-result-wide v45

    .line 553
    if-nez v4, :cond_14

    .line 554
    .line 555
    move-object/from16 v47, v3

    .line 556
    .line 557
    goto :goto_16

    .line 558
    :cond_14
    invoke-static {v8}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 559
    .line 560
    .line 561
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 562
    .line 563
    .line 564
    move-result v3

    .line 565
    invoke-static/range {v40 .. v40}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 566
    .line 567
    .line 568
    invoke-virtual/range {v40 .. v40}, Ljava/lang/Integer;->intValue()I

    .line 569
    .line 570
    .line 571
    move-result v0

    .line 572
    invoke-static {v3, v0}, Landroidx/collection/IntIntPair;->constructor-impl(II)J

    .line 573
    .line 574
    .line 575
    move-result-wide v29

    .line 576
    invoke-static/range {v29 .. v30}, Landroidx/collection/IntIntPair;->box-impl(J)Landroidx/collection/IntIntPair;

    .line 577
    .line 578
    .line 579
    move-result-object v0

    .line 580
    move-object/from16 v47, v0

    .line 581
    .line 582
    :goto_16
    const/16 v51, 0x0

    .line 583
    .line 584
    const/16 v52, 0x0

    .line 585
    .line 586
    invoke-virtual/range {v42 .. v52}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;->getWrapInfo-OpUlnko(ZIJLandroidx/collection/IntIntPair;IIIZZ)Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;

    .line 587
    .line 588
    .line 589
    move-result-object v43

    .line 590
    move/from16 v0, v50

    .line 591
    .line 592
    invoke-virtual/range {v43 .. v43}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;->isLastItemInLine()Z

    .line 593
    .line 594
    .line 595
    move-result v3

    .line 596
    if-eqz v3, :cond_17

    .line 597
    .line 598
    move/from16 v3, v16

    .line 599
    .line 600
    invoke-static {v3, v15}, Ljava/lang/Math;->max(II)I

    .line 601
    .line 602
    .line 603
    move-result v2

    .line 604
    move/from16 v3, v28

    .line 605
    .line 606
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 607
    .line 608
    .line 609
    move-result v2

    .line 610
    add-int v46, v49, v0

    .line 611
    .line 612
    move/from16 v45, v48

    .line 613
    .line 614
    move/from16 v48, v44

    .line 615
    .line 616
    if-eqz v4, :cond_15

    .line 617
    .line 618
    move/from16 v44, p4

    .line 619
    .line 620
    :goto_17
    move/from16 v47, v1

    .line 621
    .line 622
    goto :goto_18

    .line 623
    :cond_15
    const/16 v44, 0x0

    .line 624
    .line 625
    goto :goto_17

    .line 626
    :goto_18
    invoke-virtual/range {v42 .. v48}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;->getWrapEllipsisInfo(Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;ZIIII)Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;

    .line 627
    .line 628
    .line 629
    move-result-object v1

    .line 630
    move-object/from16 v4, v18

    .line 631
    .line 632
    move/from16 v48, v45

    .line 633
    .line 634
    invoke-virtual {v4, v0}, Landroidx/collection/MutableIntList;->add(I)Z

    .line 635
    .line 636
    .line 637
    sub-int v0, v20, v46

    .line 638
    .line 639
    sub-int v0, v0, v23

    .line 640
    .line 641
    move-object/from16 v15, v27

    .line 642
    .line 643
    invoke-virtual {v15, v13}, Landroidx/collection/MutableIntList;->add(I)Z

    .line 644
    .line 645
    .line 646
    if-eqz v8, :cond_16

    .line 647
    .line 648
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 649
    .line 650
    .line 651
    move-result v8

    .line 652
    sub-int v8, v8, v22

    .line 653
    .line 654
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 655
    .line 656
    .line 657
    move-result-object v8

    .line 658
    goto :goto_19

    .line 659
    :cond_16
    const/4 v8, 0x0

    .line 660
    :goto_19
    add-int/lit8 v45, v48, 0x1

    .line 661
    .line 662
    add-int v49, v46, v23

    .line 663
    .line 664
    move/from16 v16, v3

    .line 665
    .line 666
    move/from16 v28, v16

    .line 667
    .line 668
    move-object/from16 v17, v8

    .line 669
    .line 670
    move/from16 v21, v13

    .line 671
    .line 672
    move v3, v0

    .line 673
    move-object v0, v1

    .line 674
    move v8, v2

    .line 675
    move-object v1, v15

    .line 676
    const/4 v2, 0x0

    .line 677
    const/4 v15, 0x0

    .line 678
    goto :goto_1a

    .line 679
    :cond_17
    move/from16 v47, v1

    .line 680
    .line 681
    move/from16 v3, v16

    .line 682
    .line 683
    move-object/from16 v4, v18

    .line 684
    .line 685
    move-object/from16 v1, v27

    .line 686
    .line 687
    move-object/from16 v17, v8

    .line 688
    .line 689
    move/from16 v16, v47

    .line 690
    .line 691
    move/from16 v45, v48

    .line 692
    .line 693
    move v8, v3

    .line 694
    move v3, v2

    .line 695
    move v2, v0

    .line 696
    move-object/from16 v0, p8

    .line 697
    .line 698
    :goto_1a
    move-object/from16 p8, v0

    .line 699
    .line 700
    move-object/from16 v27, v1

    .line 701
    .line 702
    move v1, v2

    .line 703
    move v2, v3

    .line 704
    move v3, v13

    .line 705
    move-object/from16 v18, v43

    .line 706
    .line 707
    move-object/from16 v0, p2

    .line 708
    .line 709
    move-object v13, v4

    .line 710
    move-object/from16 v4, v19

    .line 711
    .line 712
    move/from16 v19, v15

    .line 713
    .line 714
    move/from16 v15, v28

    .line 715
    .line 716
    goto/16 :goto_a

    .line 717
    .line 718
    :cond_18
    move-object/from16 v19, v4

    .line 719
    .line 720
    move v3, v8

    .line 721
    move-object v4, v13

    .line 722
    move-object/from16 v1, v27

    .line 723
    .line 724
    if-eqz p8, :cond_1a

    .line 725
    .line 726
    invoke-virtual/range {p8 .. p8}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;->getEllipsis()Landroidx/compose/ui/layout/Measurable;

    .line 727
    .line 728
    .line 729
    move-result-object v0

    .line 730
    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 731
    .line 732
    .line 733
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 734
    .line 735
    .line 736
    move-result v0

    .line 737
    add-int/lit8 v0, v0, -0x1

    .line 738
    .line 739
    invoke-virtual/range {p8 .. p8}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;->getPlaceable()Landroidx/compose/ui/layout/Placeable;

    .line 740
    .line 741
    .line 742
    move-result-object v2

    .line 743
    move-object/from16 v8, v19

    .line 744
    .line 745
    invoke-virtual {v8, v0, v2}, Landroidx/collection/MutableIntObjectMap;->set(ILjava/lang/Object;)V

    .line 746
    .line 747
    .line 748
    iget v0, v1, Landroidx/collection/IntList;->_size:I

    .line 749
    .line 750
    add-int/lit8 v0, v0, -0x1

    .line 751
    .line 752
    invoke-virtual/range {p8 .. p8}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;->getPlaceEllipsisOnLastContentLine()Z

    .line 753
    .line 754
    .line 755
    move-result v2

    .line 756
    if-eqz v2, :cond_19

    .line 757
    .line 758
    iget v2, v1, Landroidx/collection/IntList;->_size:I

    .line 759
    .line 760
    add-int/lit8 v2, v2, -0x1

    .line 761
    .line 762
    invoke-virtual {v4, v0}, Landroidx/collection/IntList;->get(I)I

    .line 763
    .line 764
    .line 765
    move-result v9

    .line 766
    invoke-virtual/range {p8 .. p8}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;->getEllipsisSize-OO21N7I()J

    .line 767
    .line 768
    .line 769
    move-result-wide v10

    .line 770
    invoke-static {v10, v11}, Landroidx/collection/IntIntPair;->getSecond-impl(J)I

    .line 771
    .line 772
    .line 773
    move-result v10

    .line 774
    invoke-static {v9, v10}, Ljava/lang/Math;->max(II)I

    .line 775
    .line 776
    .line 777
    move-result v9

    .line 778
    invoke-virtual {v4, v0, v9}, Landroidx/collection/MutableIntList;->set(II)I

    .line 779
    .line 780
    .line 781
    invoke-virtual {v1}, Landroidx/collection/IntList;->last()I

    .line 782
    .line 783
    .line 784
    move-result v0

    .line 785
    add-int/lit8 v0, v0, 0x1

    .line 786
    .line 787
    invoke-virtual {v1, v2, v0}, Landroidx/collection/MutableIntList;->set(II)I

    .line 788
    .line 789
    .line 790
    goto :goto_1b

    .line 791
    :cond_19
    invoke-virtual/range {p8 .. p8}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;->getEllipsisSize-OO21N7I()J

    .line 792
    .line 793
    .line 794
    move-result-wide v9

    .line 795
    invoke-static {v9, v10}, Landroidx/collection/IntIntPair;->getSecond-impl(J)I

    .line 796
    .line 797
    .line 798
    move-result v0

    .line 799
    invoke-virtual {v4, v0}, Landroidx/collection/MutableIntList;->add(I)Z

    .line 800
    .line 801
    .line 802
    invoke-virtual {v1}, Landroidx/collection/IntList;->last()I

    .line 803
    .line 804
    .line 805
    move-result v0

    .line 806
    add-int/lit8 v0, v0, 0x1

    .line 807
    .line 808
    invoke-virtual {v1, v0}, Landroidx/collection/MutableIntList;->add(I)Z

    .line 809
    .line 810
    .line 811
    goto :goto_1b

    .line 812
    :cond_1a
    move-object/from16 v8, v19

    .line 813
    .line 814
    :goto_1b
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 815
    .line 816
    .line 817
    move-result v0

    .line 818
    new-array v2, v0, [Landroidx/compose/ui/layout/Placeable;

    .line 819
    .line 820
    const/4 v9, 0x0

    .line 821
    :goto_1c
    if-ge v9, v0, :cond_1b

    .line 822
    .line 823
    invoke-virtual {v8, v9}, Landroidx/collection/IntObjectMap;->get(I)Ljava/lang/Object;

    .line 824
    .line 825
    .line 826
    move-result-object v10

    .line 827
    aput-object v10, v2, v9

    .line 828
    .line 829
    add-int/lit8 v9, v9, 0x1

    .line 830
    .line 831
    goto :goto_1c

    .line 832
    :cond_1b
    iget v13, v1, Landroidx/collection/IntList;->_size:I

    .line 833
    .line 834
    new-array v8, v13, [I

    .line 835
    .line 836
    new-array v14, v13, [I

    .line 837
    .line 838
    iget-object v15, v1, Landroidx/collection/IntList;->content:[I

    .line 839
    .line 840
    move v1, v3

    .line 841
    const/4 v9, 0x0

    .line 842
    const/4 v12, 0x0

    .line 843
    const/16 v16, 0x0

    .line 844
    .line 845
    :goto_1d
    if-ge v12, v13, :cond_1d

    .line 846
    .line 847
    aget v10, v15, v12

    .line 848
    .line 849
    move-object v0, v4

    .line 850
    invoke-virtual {v0, v12}, Landroidx/collection/IntList;->get(I)I

    .line 851
    .line 852
    .line 853
    move-result v4

    .line 854
    move-object v11, v8

    .line 855
    move-object v8, v2

    .line 856
    invoke-static/range {v24 .. v25}, Landroidx/compose/ui/unit/Constraints;->getMinHeight-impl(J)I

    .line 857
    .line 858
    .line 859
    move-result v2

    .line 860
    invoke-static/range {v24 .. v25}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    .line 861
    .line 862
    .line 863
    move-result v3

    .line 864
    move-object/from16 v18, v0

    .line 865
    .line 866
    move-object v0, v7

    .line 867
    move-object v7, v5

    .line 868
    move/from16 v5, v22

    .line 869
    .line 870
    invoke-static/range {v0 .. v12}, Landroidx/compose/foundation/layout/RowColumnMeasurePolicyKt;->measure(Landroidx/compose/foundation/layout/RowColumnMeasurePolicy;IIIIILandroidx/compose/ui/layout/MeasureScope;Ljava/util/List;[Landroidx/compose/ui/layout/Placeable;II[II)Landroidx/compose/ui/layout/MeasureResult;

    .line 871
    .line 872
    .line 873
    move-result-object v2

    .line 874
    move/from16 v21, v5

    .line 875
    .line 876
    invoke-interface/range {p1 .. p1}, Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;->isHorizontal()Z

    .line 877
    .line 878
    .line 879
    move-result v0

    .line 880
    if-eqz v0, :cond_1c

    .line 881
    .line 882
    invoke-interface {v2}, Landroidx/compose/ui/layout/MeasureResult;->getWidth()I

    .line 883
    .line 884
    .line 885
    move-result v0

    .line 886
    invoke-interface {v2}, Landroidx/compose/ui/layout/MeasureResult;->getHeight()I

    .line 887
    .line 888
    .line 889
    move-result v3

    .line 890
    goto :goto_1e

    .line 891
    :cond_1c
    invoke-interface {v2}, Landroidx/compose/ui/layout/MeasureResult;->getHeight()I

    .line 892
    .line 893
    .line 894
    move-result v0

    .line 895
    invoke-interface {v2}, Landroidx/compose/ui/layout/MeasureResult;->getWidth()I

    .line 896
    .line 897
    .line 898
    move-result v3

    .line 899
    :goto_1e
    aput v3, v14, v12

    .line 900
    .line 901
    add-int v16, v16, v3

    .line 902
    .line 903
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 904
    .line 905
    .line 906
    move-result v1

    .line 907
    move-object/from16 v6, v41

    .line 908
    .line 909
    invoke-virtual {v6, v2}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 910
    .line 911
    .line 912
    add-int/lit8 v12, v12, 0x1

    .line 913
    .line 914
    move-object v5, v7

    .line 915
    move-object v2, v8

    .line 916
    move v9, v10

    .line 917
    move-object v8, v11

    .line 918
    move-object/from16 v4, v18

    .line 919
    .line 920
    move/from16 v22, v21

    .line 921
    .line 922
    move-object/from16 v6, p0

    .line 923
    .line 924
    move-object/from16 v7, p1

    .line 925
    .line 926
    goto :goto_1d

    .line 927
    :cond_1d
    move-object v11, v8

    .line 928
    move-object/from16 v6, v41

    .line 929
    .line 930
    invoke-virtual {v6}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 931
    .line 932
    .line 933
    move-result v0

    .line 934
    if-nez v0, :cond_1e

    .line 935
    .line 936
    const/4 v3, 0x0

    .line 937
    const/4 v4, 0x0

    .line 938
    move-object/from16 v0, p0

    .line 939
    .line 940
    move-object/from16 v7, p1

    .line 941
    .line 942
    move-wide/from16 v1, p5

    .line 943
    .line 944
    move-object v8, v11

    .line 945
    move-object v5, v14

    .line 946
    goto :goto_1f

    .line 947
    :cond_1e
    move v3, v1

    .line 948
    move/from16 v4, v16

    .line 949
    .line 950
    move-object/from16 v0, p0

    .line 951
    .line 952
    move-object/from16 v7, p1

    .line 953
    .line 954
    move-object v8, v11

    .line 955
    move-object v5, v14

    .line 956
    move-wide/from16 v1, p5

    .line 957
    .line 958
    :goto_1f
    invoke-static/range {v0 .. v8}, Landroidx/compose/foundation/layout/FlowLayoutKt;->placeHelper-BmaY500(Landroidx/compose/ui/layout/MeasureScope;JII[ILandroidx/compose/runtime/collection/MutableVector;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;[I)Landroidx/compose/ui/layout/MeasureResult;

    .line 959
    .line 960
    .line 961
    move-result-object v0

    .line 962
    return-object v0
.end method

.method public static final columnMeasurementHelper(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
    .locals 17
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    move/from16 v1, p4

    .line 4
    .line 5
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    const/4 v2, -0x1

    .line 12
    const-string v3, "androidx.compose.foundation.layout.columnMeasurementHelper (FlowLayout.kt:514)"

    .line 13
    .line 14
    const v4, -0x77fd7175

    .line 15
    .line 16
    .line 17
    invoke-static {v4, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    and-int/lit8 v2, v1, 0xe

    .line 21
    .line 22
    xor-int/lit8 v2, v2, 0x6

    .line 23
    .line 24
    const/4 v3, 0x4

    .line 25
    const/4 v4, 0x0

    .line 26
    const/4 v5, 0x1

    .line 27
    move-object/from16 v9, p0

    .line 28
    .line 29
    if-le v2, v3, :cond_1

    .line 30
    .line 31
    invoke-interface {v0, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-nez v2, :cond_2

    .line 36
    .line 37
    :cond_1
    and-int/lit8 v2, v1, 0x6

    .line 38
    .line 39
    if-ne v2, v3, :cond_3

    .line 40
    .line 41
    :cond_2
    move v2, v5

    .line 42
    goto :goto_0

    .line 43
    :cond_3
    move v2, v4

    .line 44
    :goto_0
    and-int/lit8 v3, v1, 0x70

    .line 45
    .line 46
    xor-int/lit8 v3, v3, 0x30

    .line 47
    .line 48
    const/16 v6, 0x20

    .line 49
    .line 50
    move-object/from16 v8, p1

    .line 51
    .line 52
    if-le v3, v6, :cond_4

    .line 53
    .line 54
    invoke-interface {v0, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-nez v3, :cond_5

    .line 59
    .line 60
    :cond_4
    and-int/lit8 v3, v1, 0x30

    .line 61
    .line 62
    if-ne v3, v6, :cond_6

    .line 63
    .line 64
    :cond_5
    move v3, v5

    .line 65
    goto :goto_1

    .line 66
    :cond_6
    move v3, v4

    .line 67
    :goto_1
    or-int/2addr v2, v3

    .line 68
    and-int/lit16 v3, v1, 0x380

    .line 69
    .line 70
    xor-int/lit16 v3, v3, 0x180

    .line 71
    .line 72
    const/16 v6, 0x100

    .line 73
    .line 74
    move/from16 v13, p2

    .line 75
    .line 76
    if-le v3, v6, :cond_7

    .line 77
    .line 78
    invoke-interface {v0, v13}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-nez v3, :cond_8

    .line 83
    .line 84
    :cond_7
    and-int/lit16 v1, v1, 0x180

    .line 85
    .line 86
    if-ne v1, v6, :cond_9

    .line 87
    .line 88
    :cond_8
    move v4, v5

    .line 89
    :cond_9
    or-int v1, v2, v4

    .line 90
    .line 91
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    if-nez v1, :cond_a

    .line 96
    .line 97
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 98
    .line 99
    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    if-ne v2, v1, :cond_b

    .line 104
    .line 105
    :cond_a
    invoke-interface {v9}, Landroidx/compose/foundation/layout/Arrangement$Vertical;->getSpacing-D9Ej5fM()F

    .line 106
    .line 107
    .line 108
    move-result v10

    .line 109
    sget-object v11, Landroidx/compose/foundation/layout/FlowLayoutKt;->CROSS_AXIS_ALIGNMENT_START:Landroidx/compose/foundation/layout/CrossAxisAlignment;

    .line 110
    .line 111
    invoke-interface {v8}, Landroidx/compose/foundation/layout/Arrangement$Horizontal;->getSpacing-D9Ej5fM()F

    .line 112
    .line 113
    .line 114
    move-result v12

    .line 115
    sget-object v1, Landroidx/compose/foundation/layout/FlowRowOverflow;->Companion:Landroidx/compose/foundation/layout/FlowRowOverflow$Companion;

    .line 116
    .line 117
    invoke-virtual {v1}, Landroidx/compose/foundation/layout/FlowRowOverflow$Companion;->getVisible()Landroidx/compose/foundation/layout/FlowRowOverflow;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {v1}, Landroidx/compose/foundation/layout/FlowLayoutOverflow;->createOverflowState$foundation_layout_release()Landroidx/compose/foundation/layout/FlowLayoutOverflowState;

    .line 122
    .line 123
    .line 124
    move-result-object v15

    .line 125
    new-instance v6, Landroidx/compose/foundation/layout/FlowMeasurePolicy;

    .line 126
    .line 127
    const v14, 0x7fffffff

    .line 128
    .line 129
    .line 130
    const/16 v16, 0x0

    .line 131
    .line 132
    const/4 v7, 0x0

    .line 133
    invoke-direct/range {v6 .. v16}, Landroidx/compose/foundation/layout/FlowMeasurePolicy;-><init>(ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/CrossAxisAlignment;FIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Lkotlin/jvm/internal/n;)V

    .line 134
    .line 135
    .line 136
    new-instance v2, Landroidx/compose/foundation/layout/FlowLayoutKt$columnMeasurementHelper$1$1;

    .line 137
    .line 138
    invoke-direct {v2, v6}, Landroidx/compose/foundation/layout/FlowLayoutKt$columnMeasurementHelper$1$1;-><init>(Landroidx/compose/foundation/layout/FlowMeasurePolicy;)V

    .line 139
    .line 140
    .line 141
    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    :cond_b
    check-cast v2, Landroidx/compose/ui/layout/MeasurePolicy;

    .line 145
    .line 146
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    if-eqz v0, :cond_c

    .line 151
    .line 152
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 153
    .line 154
    .line 155
    :cond_c
    return-object v2
.end method

.method public static final columnMeasurementMultiContentHelper(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Horizontal;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MultiContentMeasurePolicy;
    .locals 18
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    move-object/from16 v1, p6

    .line 4
    .line 5
    move/from16 v2, p7

    .line 6
    .line 7
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    const/4 v3, -0x1

    .line 14
    const-string v4, "androidx.compose.foundation.layout.columnMeasurementMultiContentHelper (FlowLayout.kt:546)"

    .line 15
    .line 16
    const v5, -0x126568c7

    .line 17
    .line 18
    .line 19
    invoke-static {v5, v2, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    and-int/lit8 v3, v2, 0xe

    .line 23
    .line 24
    xor-int/lit8 v3, v3, 0x6

    .line 25
    .line 26
    const/4 v4, 0x4

    .line 27
    const/4 v5, 0x0

    .line 28
    const/4 v6, 0x1

    .line 29
    move-object/from16 v10, p0

    .line 30
    .line 31
    if-le v3, v4, :cond_1

    .line 32
    .line 33
    invoke-interface {v1, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-nez v3, :cond_2

    .line 38
    .line 39
    :cond_1
    and-int/lit8 v3, v2, 0x6

    .line 40
    .line 41
    if-ne v3, v4, :cond_3

    .line 42
    .line 43
    :cond_2
    move v3, v6

    .line 44
    goto :goto_0

    .line 45
    :cond_3
    move v3, v5

    .line 46
    :goto_0
    and-int/lit8 v4, v2, 0x70

    .line 47
    .line 48
    xor-int/lit8 v4, v4, 0x30

    .line 49
    .line 50
    const/16 v7, 0x20

    .line 51
    .line 52
    move-object/from16 v9, p1

    .line 53
    .line 54
    if-le v4, v7, :cond_4

    .line 55
    .line 56
    invoke-interface {v1, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-nez v4, :cond_5

    .line 61
    .line 62
    :cond_4
    and-int/lit8 v4, v2, 0x30

    .line 63
    .line 64
    if-ne v4, v7, :cond_6

    .line 65
    .line 66
    :cond_5
    move v4, v6

    .line 67
    goto :goto_1

    .line 68
    :cond_6
    move v4, v5

    .line 69
    :goto_1
    or-int/2addr v3, v4

    .line 70
    and-int/lit16 v4, v2, 0x380

    .line 71
    .line 72
    xor-int/lit16 v4, v4, 0x180

    .line 73
    .line 74
    const/16 v7, 0x100

    .line 75
    .line 76
    if-le v4, v7, :cond_7

    .line 77
    .line 78
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    if-nez v4, :cond_8

    .line 83
    .line 84
    :cond_7
    and-int/lit16 v4, v2, 0x180

    .line 85
    .line 86
    if-ne v4, v7, :cond_9

    .line 87
    .line 88
    :cond_8
    move v4, v6

    .line 89
    goto :goto_2

    .line 90
    :cond_9
    move v4, v5

    .line 91
    :goto_2
    or-int/2addr v3, v4

    .line 92
    and-int/lit16 v4, v2, 0x1c00

    .line 93
    .line 94
    xor-int/lit16 v4, v4, 0xc00

    .line 95
    .line 96
    const/16 v7, 0x800

    .line 97
    .line 98
    move/from16 v14, p3

    .line 99
    .line 100
    if-le v4, v7, :cond_a

    .line 101
    .line 102
    invoke-interface {v1, v14}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    if-nez v4, :cond_b

    .line 107
    .line 108
    :cond_a
    and-int/lit16 v4, v2, 0xc00

    .line 109
    .line 110
    if-ne v4, v7, :cond_c

    .line 111
    .line 112
    :cond_b
    move v4, v6

    .line 113
    goto :goto_3

    .line 114
    :cond_c
    move v4, v5

    .line 115
    :goto_3
    or-int/2addr v3, v4

    .line 116
    const v4, 0xe000

    .line 117
    .line 118
    .line 119
    and-int/2addr v4, v2

    .line 120
    xor-int/lit16 v4, v4, 0x6000

    .line 121
    .line 122
    const/16 v7, 0x4000

    .line 123
    .line 124
    move/from16 v15, p4

    .line 125
    .line 126
    if-le v4, v7, :cond_d

    .line 127
    .line 128
    invoke-interface {v1, v15}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    if-nez v4, :cond_e

    .line 133
    .line 134
    :cond_d
    and-int/lit16 v2, v2, 0x6000

    .line 135
    .line 136
    if-ne v2, v7, :cond_f

    .line 137
    .line 138
    :cond_e
    move v5, v6

    .line 139
    :cond_f
    or-int v2, v3, v5

    .line 140
    .line 141
    move-object/from16 v3, p5

    .line 142
    .line 143
    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v4

    .line 147
    or-int/2addr v2, v4

    .line 148
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    if-nez v2, :cond_10

    .line 153
    .line 154
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 155
    .line 156
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    if-ne v4, v2, :cond_11

    .line 161
    .line 162
    :cond_10
    invoke-interface {v10}, Landroidx/compose/foundation/layout/Arrangement$Vertical;->getSpacing-D9Ej5fM()F

    .line 163
    .line 164
    .line 165
    move-result v11

    .line 166
    sget-object v2, Landroidx/compose/foundation/layout/CrossAxisAlignment;->Companion:Landroidx/compose/foundation/layout/CrossAxisAlignment$Companion;

    .line 167
    .line 168
    invoke-virtual {v2, v0}, Landroidx/compose/foundation/layout/CrossAxisAlignment$Companion;->horizontal$foundation_layout_release(Landroidx/compose/ui/Alignment$Horizontal;)Landroidx/compose/foundation/layout/CrossAxisAlignment;

    .line 169
    .line 170
    .line 171
    move-result-object v12

    .line 172
    invoke-interface {v9}, Landroidx/compose/foundation/layout/Arrangement$Horizontal;->getSpacing-D9Ej5fM()F

    .line 173
    .line 174
    .line 175
    move-result v13

    .line 176
    new-instance v7, Landroidx/compose/foundation/layout/FlowMeasurePolicy;

    .line 177
    .line 178
    const/4 v8, 0x0

    .line 179
    const/16 v17, 0x0

    .line 180
    .line 181
    move-object/from16 v16, v3

    .line 182
    .line 183
    invoke-direct/range {v7 .. v17}, Landroidx/compose/foundation/layout/FlowMeasurePolicy;-><init>(ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/CrossAxisAlignment;FIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Lkotlin/jvm/internal/n;)V

    .line 184
    .line 185
    .line 186
    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    move-object v4, v7

    .line 190
    :cond_11
    check-cast v4, Landroidx/compose/foundation/layout/FlowMeasurePolicy;

    .line 191
    .line 192
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    if-eqz v0, :cond_12

    .line 197
    .line 198
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 199
    .line 200
    .line 201
    :cond_12
    return-object v4
.end method

.method public static final crossAxisMin(Landroidx/compose/ui/layout/IntrinsicMeasurable;ZI)I
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-interface {p0, p2}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->minIntrinsicHeight(I)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0

    .line 8
    :cond_0
    invoke-interface {p0, p2}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->minIntrinsicWidth(I)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method

.method public static final getCROSS_AXIS_ALIGNMENT_START()Landroidx/compose/foundation/layout/CrossAxisAlignment;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/foundation/layout/FlowLayoutKt;->CROSS_AXIS_ALIGNMENT_START:Landroidx/compose/foundation/layout/CrossAxisAlignment;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getCROSS_AXIS_ALIGNMENT_TOP()Landroidx/compose/foundation/layout/CrossAxisAlignment;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/foundation/layout/FlowLayoutKt;->CROSS_AXIS_ALIGNMENT_TOP:Landroidx/compose/foundation/layout/CrossAxisAlignment;

    .line 2
    .line 3
    return-object v0
.end method

.method private static final intrinsicCrossAxisSize(Ljava/util/List;Lhd/q;Lhd/q;IIIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)J
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;",
            "Lhd/q;",
            "Lhd/q;",
            "IIIII",
            "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;",
            ")J"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    const/4 v4, 0x0

    .line 1
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    .line 2
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_0

    .line 3
    invoke-static {v4, v4}, Landroidx/collection/IntIntPair;->constructor-impl(II)J

    move-result-wide v0

    return-wide v0

    :cond_0
    const v6, 0x7fffffff

    .line 4
    invoke-static {v4, v3, v4, v6}, Landroidx/compose/foundation/layout/OrientationIndependentConstraints;->constructor-impl(IIII)J

    move-result-wide v10

    .line 5
    new-instance v12, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;

    const/4 v15, 0x0

    move/from16 v13, p4

    move/from16 v14, p5

    move/from16 v8, p6

    move-object/from16 v9, p8

    move-object v7, v12

    move/from16 v12, p7

    invoke-direct/range {v7 .. v15}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;-><init>(ILandroidx/compose/foundation/layout/FlowLayoutOverflowState;JIIILkotlin/jvm/internal/n;)V

    move-object v12, v7

    .line 6
    invoke-static {v0, v4}, Lrc/g0;->p0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    if-eqz v7, :cond_1

    .line 7
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v2, v7, v5, v8}, Lhd/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    goto :goto_0

    :cond_1
    move v8, v4

    :goto_0
    if-eqz v7, :cond_2

    .line 8
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v1, v7, v5, v9}, Lhd/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    goto :goto_1

    :cond_2
    move v5, v4

    .line 9
    :goto_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v9

    const/4 v10, 0x1

    if-le v9, v10, :cond_3

    move v13, v10

    goto :goto_2

    :cond_3
    move v13, v4

    .line 10
    :goto_2
    invoke-static {v3, v6}, Landroidx/collection/IntIntPair;->constructor-impl(II)J

    move-result-wide v15

    if-nez v7, :cond_4

    const/16 v17, 0x0

    goto :goto_3

    .line 11
    :cond_4
    invoke-static {v5, v8}, Landroidx/collection/IntIntPair;->constructor-impl(II)J

    move-result-wide v17

    invoke-static/range {v17 .. v18}, Landroidx/collection/IntIntPair;->box-impl(J)Landroidx/collection/IntIntPair;

    move-result-object v11

    move-object/from16 v17, v11

    :goto_3
    const/16 v21, 0x0

    const/16 v22, 0x0

    const/4 v14, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    .line 12
    invoke-virtual/range {v12 .. v22}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;->getWrapInfo-OpUlnko(ZIJLandroidx/collection/IntIntPair;IIIZZ)Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;

    move-result-object v11

    .line 13
    invoke-virtual {v11}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;->isLastItemInContainer()Z

    move-result v11

    if-eqz v11, :cond_7

    if-eqz v7, :cond_5

    :goto_4
    move-object/from16 v9, p8

    goto :goto_5

    :cond_5
    move v10, v4

    goto :goto_4

    .line 14
    :goto_5
    invoke-virtual {v9, v10, v4, v4}, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->ellipsisSize-F35zm-w$foundation_layout_release(ZII)Landroidx/collection/IntIntPair;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Landroidx/collection/IntIntPair;->unbox-impl()J

    move-result-wide v0

    .line 15
    invoke-static {v0, v1}, Landroidx/collection/IntIntPair;->getSecond-impl(J)I

    move-result v0

    goto :goto_6

    :cond_6
    move v0, v4

    .line 16
    :goto_6
    invoke-static {v0, v4}, Landroidx/collection/IntIntPair;->constructor-impl(II)J

    move-result-wide v0

    return-wide v0

    .line 17
    :cond_7
    move-object v7, v0

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->size()I

    move-result v7

    move v14, v3

    move v13, v4

    move/from16 v16, v13

    move/from16 v23, v16

    move/from16 v15, v18

    :goto_7
    move/from16 v11, v20

    if-ge v13, v7, :cond_10

    sub-int v5, v14, v5

    add-int/lit8 v14, v13, 0x1

    .line 18
    invoke-static {v11, v8}, Ljava/lang/Math;->max(II)I

    move-result v20

    .line 19
    invoke-static {v0, v14}, Lrc/g0;->p0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    if-eqz v8, :cond_8

    .line 20
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v2, v8, v11, v4}, Lhd/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    goto :goto_8

    :cond_8
    const/4 v4, 0x0

    :goto_8
    if-eqz v8, :cond_9

    .line 21
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v1, v8, v11, v9}, Lhd/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Number;

    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    move-result v9

    add-int v9, v9, p4

    goto :goto_9

    :cond_9
    const/4 v9, 0x0

    :goto_9
    add-int/lit8 v13, v13, 0x2

    .line 22
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v11

    if-ge v13, v11, :cond_a

    move v13, v10

    goto :goto_a

    :cond_a
    const/4 v13, 0x0

    :goto_a
    sub-int v18, v14, v23

    move v11, v14

    move/from16 v14, v18

    move/from16 v18, v15

    .line 23
    invoke-static {v5, v6}, Landroidx/collection/IntIntPair;->constructor-impl(II)J

    move-result-wide v15

    if-nez v8, :cond_b

    const/16 v17, 0x0

    goto :goto_b

    .line 24
    :cond_b
    invoke-static {v9, v4}, Landroidx/collection/IntIntPair;->constructor-impl(II)J

    move-result-wide v21

    invoke-static/range {v21 .. v22}, Landroidx/collection/IntIntPair;->box-impl(J)Landroidx/collection/IntIntPair;

    move-result-object v17

    :goto_b
    const/16 v21, 0x0

    const/16 v22, 0x0

    .line 25
    invoke-virtual/range {v12 .. v22}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;->getWrapInfo-OpUlnko(ZIJLandroidx/collection/IntIntPair;IIIZZ)Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;

    move-result-object v13

    .line 26
    invoke-virtual {v13}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;->isLastItemInLine()Z

    move-result v15

    if-eqz v15, :cond_f

    add-int v20, v20, p5

    add-int v16, v19, v20

    move/from16 v15, v18

    move/from16 v18, v14

    if-eqz v8, :cond_c

    move v14, v10

    :goto_c
    move/from16 v17, v5

    goto :goto_d

    :cond_c
    const/4 v14, 0x0

    goto :goto_c

    .line 27
    :goto_d
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;->getWrapEllipsisInfo(Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;ZIIII)Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;

    move-result-object v5

    move/from16 v18, v15

    sub-int v9, v9, p4

    add-int/lit8 v15, v18, 0x1

    .line 28
    invoke-virtual {v13}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;->isLastItemInContainer()Z

    move-result v8

    if-eqz v8, :cond_e

    if-eqz v5, :cond_d

    .line 29
    invoke-virtual {v5}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;->getEllipsisSize-OO21N7I()J

    move-result-wide v0

    .line 30
    invoke-virtual {v5}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;->getPlaceEllipsisOnLastContentLine()Z

    move-result v2

    if-nez v2, :cond_d

    .line 31
    invoke-static {v0, v1}, Landroidx/collection/IntIntPair;->getSecond-impl(J)I

    move-result v0

    add-int v0, v0, p5

    add-int v16, v16, v0

    :cond_d
    move/from16 v19, v16

    goto :goto_10

    :cond_e
    move v14, v3

    move/from16 v23, v11

    move/from16 v19, v16

    const/16 v20, 0x0

    :goto_e
    move v5, v9

    goto :goto_f

    :cond_f
    move/from16 v17, v5

    move/from16 v14, v17

    move/from16 v15, v18

    goto :goto_e

    :goto_f
    move v8, v4

    move v13, v11

    move/from16 v16, v13

    const/4 v4, 0x0

    goto/16 :goto_7

    :cond_10
    move/from16 v11, v16

    :goto_10
    sub-int v0, v19, p5

    .line 32
    invoke-static {v0, v11}, Landroidx/collection/IntIntPair;->constructor-impl(II)J

    move-result-wide v0

    return-wide v0
.end method

.method private static final intrinsicCrossAxisSize(Ljava/util/List;[I[IIIIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)J
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;[I[IIIIII",
            "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;",
            ")J"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p3

    .line 33
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    .line 34
    invoke-static {v3, v3}, Landroidx/collection/IntIntPair;->constructor-impl(II)J

    move-result-wide v0

    return-wide v0

    :cond_0
    const v2, 0x7fffffff

    .line 35
    invoke-static {v3, v1, v3, v2}, Landroidx/compose/foundation/layout/OrientationIndependentConstraints;->constructor-impl(IIII)J

    move-result-wide v7

    .line 36
    new-instance v9, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;

    const/4 v12, 0x0

    move/from16 v10, p4

    move/from16 v11, p5

    move/from16 v5, p6

    move-object/from16 v6, p8

    move-object v4, v9

    move/from16 v9, p7

    invoke-direct/range {v4 .. v12}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;-><init>(ILandroidx/compose/foundation/layout/FlowLayoutOverflowState;JIIILkotlin/jvm/internal/n;)V

    move-object v9, v4

    .line 37
    invoke-static {v0, v3}, Lrc/g0;->p0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    if-eqz v4, :cond_1

    .line 38
    aget v5, p2, v3

    goto :goto_0

    :cond_1
    move v5, v3

    :goto_0
    if-eqz v4, :cond_2

    .line 39
    aget v6, p1, v3

    goto :goto_1

    :cond_2
    move v6, v3

    .line 40
    :goto_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v7

    const/4 v8, 0x1

    if-le v7, v8, :cond_3

    move v10, v8

    goto :goto_2

    :cond_3
    move v10, v3

    .line 41
    :goto_2
    invoke-static {v1, v2}, Landroidx/collection/IntIntPair;->constructor-impl(II)J

    move-result-wide v12

    const/4 v7, 0x0

    if-nez v4, :cond_4

    move-object v14, v7

    goto :goto_3

    .line 42
    :cond_4
    invoke-static {v6, v5}, Landroidx/collection/IntIntPair;->constructor-impl(II)J

    move-result-wide v14

    invoke-static {v14, v15}, Landroidx/collection/IntIntPair;->box-impl(J)Landroidx/collection/IntIntPair;

    move-result-object v11

    move-object v14, v11

    :goto_3
    const/16 v18, 0x0

    const/16 v19, 0x0

    const/4 v11, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    .line 43
    invoke-virtual/range {v9 .. v19}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;->getWrapInfo-OpUlnko(ZIJLandroidx/collection/IntIntPair;IIIZZ)Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;

    move-result-object v10

    .line 44
    invoke-virtual {v10}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;->isLastItemInContainer()Z

    move-result v10

    if-eqz v10, :cond_7

    if-eqz v4, :cond_5

    :goto_4
    move-object/from16 v6, p8

    goto :goto_5

    :cond_5
    move v8, v3

    goto :goto_4

    .line 45
    :goto_5
    invoke-virtual {v6, v8, v3, v3}, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->ellipsisSize-F35zm-w$foundation_layout_release(ZII)Landroidx/collection/IntIntPair;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Landroidx/collection/IntIntPair;->unbox-impl()J

    move-result-wide v0

    .line 46
    invoke-static {v0, v1}, Landroidx/collection/IntIntPair;->getSecond-impl(J)I

    move-result v0

    goto :goto_6

    :cond_6
    move v0, v3

    .line 47
    :goto_6
    invoke-static {v0, v3}, Landroidx/collection/IntIntPair;->constructor-impl(II)J

    move-result-wide v0

    return-wide v0

    .line 48
    :cond_7
    move-object v4, v0

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v4

    move v13, v1

    move v11, v3

    move v14, v11

    move/from16 v20, v14

    move v12, v15

    move/from16 v10, v17

    :goto_7
    if-ge v11, v4, :cond_10

    sub-int v6, v13, v6

    add-int/lit8 v13, v11, 0x1

    .line 49
    invoke-static {v10, v5}, Ljava/lang/Math;->max(II)I

    move-result v17

    .line 50
    invoke-static {v0, v13}, Lrc/g0;->p0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    if-eqz v5, :cond_8

    .line 51
    aget v10, p2, v13

    goto :goto_8

    :cond_8
    move v10, v3

    :goto_8
    if-eqz v5, :cond_9

    .line 52
    aget v14, p1, v13

    add-int v14, v14, p4

    goto :goto_9

    :cond_9
    move v14, v3

    :goto_9
    add-int/lit8 v11, v11, 0x2

    .line 53
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v15

    if-ge v11, v15, :cond_a

    move v11, v8

    goto :goto_a

    :cond_a
    move v11, v3

    :goto_a
    sub-int v15, v13, v20

    move/from16 v19, v11

    move/from16 v18, v13

    move v11, v15

    move v15, v12

    .line 54
    invoke-static {v6, v2}, Landroidx/collection/IntIntPair;->constructor-impl(II)J

    move-result-wide v12

    if-nez v5, :cond_b

    move-object/from16 v21, v7

    :goto_b
    move/from16 v22, v18

    goto :goto_c

    .line 55
    :cond_b
    invoke-static {v14, v10}, Landroidx/collection/IntIntPair;->constructor-impl(II)J

    move-result-wide v21

    invoke-static/range {v21 .. v22}, Landroidx/collection/IntIntPair;->box-impl(J)Landroidx/collection/IntIntPair;

    move-result-object v21

    goto :goto_b

    :goto_c
    const/16 v18, 0x0

    move/from16 v23, v10

    move/from16 v10, v19

    const/16 v19, 0x0

    move-object/from16 v24, v21

    move/from16 v21, v14

    move-object/from16 v14, v24

    .line 56
    invoke-virtual/range {v9 .. v19}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;->getWrapInfo-OpUlnko(ZIJLandroidx/collection/IntIntPair;IIIZZ)Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;

    move-result-object v10

    .line 57
    invoke-virtual {v10}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;->isLastItemInLine()Z

    move-result v12

    if-eqz v12, :cond_f

    add-int v17, v17, p5

    add-int v13, v16, v17

    move v12, v15

    move v15, v11

    if-eqz v5, :cond_c

    move v11, v8

    :goto_d
    move v14, v6

    goto :goto_e

    :cond_c
    move v11, v3

    goto :goto_d

    .line 58
    :goto_e
    invoke-virtual/range {v9 .. v15}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks;->getWrapEllipsisInfo(Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;ZIIII)Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;

    move-result-object v5

    move v15, v12

    sub-int v14, v21, p4

    add-int/lit8 v12, v15, 0x1

    .line 59
    invoke-virtual {v10}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapInfo;->isLastItemInContainer()Z

    move-result v6

    if-eqz v6, :cond_e

    if-eqz v5, :cond_d

    .line 60
    invoke-virtual {v5}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;->getEllipsisSize-OO21N7I()J

    move-result-wide v0

    .line 61
    invoke-virtual {v5}, Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;->getPlaceEllipsisOnLastContentLine()Z

    move-result v2

    if-nez v2, :cond_d

    .line 62
    invoke-static {v0, v1}, Landroidx/collection/IntIntPair;->getSecond-impl(J)I

    move-result v0

    add-int v0, v0, p5

    add-int/2addr v13, v0

    :cond_d
    move/from16 v16, v13

    move/from16 v14, v22

    goto :goto_10

    :cond_e
    move v10, v3

    move/from16 v16, v13

    move v6, v14

    move/from16 v20, v22

    move v13, v1

    goto :goto_f

    :cond_f
    move v14, v6

    move v13, v14

    move v12, v15

    move/from16 v10, v17

    move/from16 v6, v21

    :goto_f
    move/from16 v11, v22

    move v14, v11

    move/from16 v5, v23

    goto/16 :goto_7

    :cond_10
    :goto_10
    sub-int v0, v16, p5

    .line 63
    invoke-static {v0, v14}, Landroidx/collection/IntIntPair;->constructor-impl(II)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final mainAxisMin(Landroidx/compose/ui/layout/IntrinsicMeasurable;ZI)I
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-interface {p0, p2}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->minIntrinsicWidth(I)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0

    .line 8
    :cond_0
    invoke-interface {p0, p2}, Landroidx/compose/ui/layout/IntrinsicMeasurable;->minIntrinsicHeight(I)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method

.method private static final maxIntrinsicMainAxisSize(Ljava/util/List;Lhd/q;III)I
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;",
            "Lhd/q;",
            "III)I"
        }
    .end annotation

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Ljava/util/Collection;

    .line 3
    .line 4
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x0

    .line 9
    move v2, v1

    .line 10
    move v3, v2

    .line 11
    move v4, v3

    .line 12
    move v5, v4

    .line 13
    :goto_0
    if-ge v2, v0, :cond_2

    .line 14
    .line 15
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v6

    .line 19
    check-cast v6, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 20
    .line 21
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v7

    .line 25
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v8

    .line 29
    invoke-interface {p1, v6, v7, v8}, Lhd/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    check-cast v6, Ljava/lang/Number;

    .line 34
    .line 35
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    add-int/2addr v6, p3

    .line 40
    add-int/lit8 v7, v2, 0x1

    .line 41
    .line 42
    sub-int v8, v7, v4

    .line 43
    .line 44
    if-eq v8, p4, :cond_1

    .line 45
    .line 46
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 47
    .line 48
    .line 49
    move-result v8

    .line 50
    if-ne v7, v8, :cond_0

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_0
    add-int/2addr v5, v6

    .line 54
    goto :goto_2

    .line 55
    :cond_1
    :goto_1
    add-int/2addr v5, v6

    .line 56
    sub-int/2addr v5, p3

    .line 57
    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    move v5, v1

    .line 62
    move v4, v2

    .line 63
    :goto_2
    move v2, v7

    .line 64
    goto :goto_0

    .line 65
    :cond_2
    return v3
.end method

.method public static final measureAndCache-rqJ1uqs(Landroidx/compose/ui/layout/Measurable;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;JLhd/l;)J
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/Measurable;",
            "Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;",
            "J",
            "Lhd/l;",
            ")J"
        }
    .end annotation

    .line 1
    invoke-static {p0}, Landroidx/compose/foundation/layout/RowColumnImplKt;->getRowColumnParentData(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Landroidx/compose/foundation/layout/RowColumnParentData;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroidx/compose/foundation/layout/RowColumnImplKt;->getWeight(Landroidx/compose/foundation/layout/RowColumnParentData;)F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    cmpg-float v0, v0, v1

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    invoke-static {p0}, Landroidx/compose/foundation/layout/RowColumnImplKt;->getRowColumnParentData(Landroidx/compose/ui/layout/IntrinsicMeasurable;)Landroidx/compose/foundation/layout/RowColumnParentData;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {v0}, Landroidx/compose/foundation/layout/RowColumnParentData;->getFlowLayoutData()Landroidx/compose/foundation/layout/FlowLayoutData;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {v0}, Landroidx/compose/foundation/layout/FlowLayoutData;->getFillCrossAxisFraction()F

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 v0, 0x0

    .line 36
    :goto_0
    if-nez v0, :cond_1

    .line 37
    .line 38
    invoke-interface {p0, p2, p3}, Landroidx/compose/ui/layout/Measurable;->measure-BRTryo0(J)Landroidx/compose/ui/layout/Placeable;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-interface {p4, p0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    invoke-interface {p1, p0}, Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;->mainAxisSize(Landroidx/compose/ui/layout/Placeable;)I

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    invoke-interface {p1, p0}, Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;->crossAxisSize(Landroidx/compose/ui/layout/Placeable;)I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    invoke-static {p2, p0}, Landroidx/collection/IntIntPair;->constructor-impl(II)J

    .line 54
    .line 55
    .line 56
    move-result-wide p0

    .line 57
    return-wide p0

    .line 58
    :cond_1
    invoke-interface {p1}, Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;->isHorizontal()Z

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    const p3, 0x7fffffff

    .line 63
    .line 64
    .line 65
    invoke-static {p0, p2, p3}, Landroidx/compose/foundation/layout/FlowLayoutKt;->mainAxisMin(Landroidx/compose/ui/layout/IntrinsicMeasurable;ZI)I

    .line 66
    .line 67
    .line 68
    move-result p2

    .line 69
    invoke-interface {p1}, Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;->isHorizontal()Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    invoke-static {p0, p1, p2}, Landroidx/compose/foundation/layout/FlowLayoutKt;->crossAxisMin(Landroidx/compose/ui/layout/IntrinsicMeasurable;ZI)I

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    invoke-static {p2, p0}, Landroidx/collection/IntIntPair;->constructor-impl(II)J

    .line 78
    .line 79
    .line 80
    move-result-wide p0

    .line 81
    return-wide p0
.end method

.method private static final minIntrinsicMainAxisSize(Ljava/util/List;Lhd/q;Lhd/q;IIIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)I
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/layout/IntrinsicMeasurable;",
            ">;",
            "Lhd/q;",
            "Lhd/q;",
            "IIIII",
            "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;",
            ")I"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v9, p3

    .line 4
    .line 5
    move/from16 v6, p6

    .line 6
    .line 7
    move/from16 v7, p7

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    return v2

    .line 17
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    move v3, v1

    .line 22
    new-array v1, v3, [I

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    move v5, v2

    .line 29
    new-array v2, v4, [I

    .line 30
    .line 31
    move-object v8, v0

    .line 32
    check-cast v8, Ljava/util/Collection;

    .line 33
    .line 34
    invoke-interface {v8}, Ljava/util/Collection;->size()I

    .line 35
    .line 36
    .line 37
    move-result v8

    .line 38
    move v10, v5

    .line 39
    :goto_0
    if-ge v10, v8, :cond_1

    .line 40
    .line 41
    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v11

    .line 45
    check-cast v11, Landroidx/compose/ui/layout/IntrinsicMeasurable;

    .line 46
    .line 47
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v12

    .line 51
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v13

    .line 55
    move-object/from16 v14, p1

    .line 56
    .line 57
    invoke-interface {v14, v11, v12, v13}, Lhd/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v12

    .line 61
    check-cast v12, Ljava/lang/Number;

    .line 62
    .line 63
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result v12

    .line 67
    aput v12, v1, v10

    .line 68
    .line 69
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object v13

    .line 73
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object v12

    .line 77
    move-object/from16 v15, p2

    .line 78
    .line 79
    invoke-interface {v15, v11, v13, v12}, Lhd/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v11

    .line 83
    check-cast v11, Ljava/lang/Number;

    .line 84
    .line 85
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 86
    .line 87
    .line 88
    move-result v11

    .line 89
    aput v11, v2, v10

    .line 90
    .line 91
    add-int/lit8 v10, v10, 0x1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_1
    const v8, 0x7fffffff

    .line 95
    .line 96
    .line 97
    if-eq v7, v8, :cond_2

    .line 98
    .line 99
    if-eq v6, v8, :cond_2

    .line 100
    .line 101
    mul-int v8, v6, v7

    .line 102
    .line 103
    :cond_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 104
    .line 105
    .line 106
    move-result v10

    .line 107
    const/4 v11, 0x1

    .line 108
    if-ge v8, v10, :cond_4

    .line 109
    .line 110
    invoke-virtual/range {p8 .. p8}, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->getType$foundation_layout_release()Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;

    .line 111
    .line 112
    .line 113
    move-result-object v10

    .line 114
    sget-object v12, Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;->ExpandIndicator:Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;

    .line 115
    .line 116
    if-eq v10, v12, :cond_3

    .line 117
    .line 118
    invoke-virtual/range {p8 .. p8}, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->getType$foundation_layout_release()Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;

    .line 119
    .line 120
    .line 121
    move-result-object v10

    .line 122
    sget-object v12, Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;->ExpandOrCollapseIndicator:Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;

    .line 123
    .line 124
    if-ne v10, v12, :cond_4

    .line 125
    .line 126
    :cond_3
    :goto_1
    move v10, v11

    .line 127
    goto :goto_2

    .line 128
    :cond_4
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 129
    .line 130
    .line 131
    move-result v10

    .line 132
    if-lt v8, v10, :cond_5

    .line 133
    .line 134
    invoke-virtual/range {p8 .. p8}, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->getMinLinesToShowCollapse$foundation_layout_release()I

    .line 135
    .line 136
    .line 137
    move-result v10

    .line 138
    if-lt v7, v10, :cond_5

    .line 139
    .line 140
    invoke-virtual/range {p8 .. p8}, Landroidx/compose/foundation/layout/FlowLayoutOverflowState;->getType$foundation_layout_release()Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;

    .line 141
    .line 142
    .line 143
    move-result-object v10

    .line 144
    sget-object v12, Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;->ExpandOrCollapseIndicator:Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;

    .line 145
    .line 146
    if-ne v10, v12, :cond_5

    .line 147
    .line 148
    goto :goto_1

    .line 149
    :cond_5
    move v10, v5

    .line 150
    :goto_2
    sub-int/2addr v8, v10

    .line 151
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 152
    .line 153
    .line 154
    move-result v10

    .line 155
    invoke-static {v8, v10}, Ljava/lang/Math;->min(II)I

    .line 156
    .line 157
    .line 158
    move-result v10

    .line 159
    invoke-static {v1}, Lrc/r;->h1([I)I

    .line 160
    .line 161
    .line 162
    move-result v8

    .line 163
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 164
    .line 165
    .line 166
    move-result v12

    .line 167
    sub-int/2addr v12, v11

    .line 168
    mul-int v12, v12, p4

    .line 169
    .line 170
    add-int/2addr v8, v12

    .line 171
    if-eqz v4, :cond_11

    .line 172
    .line 173
    aget v4, v2, v5

    .line 174
    .line 175
    new-instance v12, Lnd/j;

    .line 176
    .line 177
    invoke-static {v2}, Lrc/r;->y0([I)I

    .line 178
    .line 179
    .line 180
    move-result v13

    .line 181
    invoke-direct {v12, v11, v13}, Lnd/j;-><init>(II)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v12}, Lnd/h;->e()Lrc/n0;

    .line 185
    .line 186
    .line 187
    move-result-object v12

    .line 188
    :cond_6
    :goto_3
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 189
    .line 190
    .line 191
    move-result v13

    .line 192
    if-eqz v13, :cond_7

    .line 193
    .line 194
    invoke-virtual {v12}, Lrc/n0;->nextInt()I

    .line 195
    .line 196
    .line 197
    move-result v13

    .line 198
    aget v13, v2, v13

    .line 199
    .line 200
    if-ge v4, v13, :cond_6

    .line 201
    .line 202
    move v4, v13

    .line 203
    goto :goto_3

    .line 204
    :cond_7
    if-eqz v3, :cond_10

    .line 205
    .line 206
    aget v3, v1, v5

    .line 207
    .line 208
    new-instance v5, Lnd/j;

    .line 209
    .line 210
    invoke-static {v1}, Lrc/r;->y0([I)I

    .line 211
    .line 212
    .line 213
    move-result v12

    .line 214
    invoke-direct {v5, v11, v12}, Lnd/j;-><init>(II)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v5}, Lnd/h;->e()Lrc/n0;

    .line 218
    .line 219
    .line 220
    move-result-object v5

    .line 221
    :cond_8
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 222
    .line 223
    .line 224
    move-result v11

    .line 225
    if-eqz v11, :cond_9

    .line 226
    .line 227
    invoke-virtual {v5}, Lrc/n0;->nextInt()I

    .line 228
    .line 229
    .line 230
    move-result v11

    .line 231
    aget v11, v1, v11

    .line 232
    .line 233
    if-ge v3, v11, :cond_8

    .line 234
    .line 235
    move v3, v11

    .line 236
    goto :goto_4

    .line 237
    :cond_9
    move v11, v3

    .line 238
    move v12, v8

    .line 239
    :goto_5
    if-gt v11, v12, :cond_f

    .line 240
    .line 241
    if-ne v4, v9, :cond_a

    .line 242
    .line 243
    goto :goto_7

    .line 244
    :cond_a
    add-int v3, v11, v12

    .line 245
    .line 246
    div-int/lit8 v3, v3, 0x2

    .line 247
    .line 248
    move/from16 v4, p4

    .line 249
    .line 250
    move/from16 v5, p5

    .line 251
    .line 252
    move-object/from16 v8, p8

    .line 253
    .line 254
    invoke-static/range {v0 .. v8}, Landroidx/compose/foundation/layout/FlowLayoutKt;->access$intrinsicCrossAxisSize(Ljava/util/List;[I[IIIIIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;)J

    .line 255
    .line 256
    .line 257
    move-result-wide v13

    .line 258
    invoke-static {v13, v14}, Landroidx/collection/IntIntPair;->getFirst-impl(J)I

    .line 259
    .line 260
    .line 261
    move-result v4

    .line 262
    invoke-static {v13, v14}, Landroidx/collection/IntIntPair;->getSecond-impl(J)I

    .line 263
    .line 264
    .line 265
    move-result v0

    .line 266
    if-gt v4, v9, :cond_e

    .line 267
    .line 268
    if-ge v0, v10, :cond_b

    .line 269
    .line 270
    goto :goto_6

    .line 271
    :cond_b
    if-ge v4, v9, :cond_d

    .line 272
    .line 273
    add-int/lit8 v12, v3, -0x1

    .line 274
    .line 275
    :cond_c
    move-object/from16 v0, p0

    .line 276
    .line 277
    move/from16 v6, p6

    .line 278
    .line 279
    move/from16 v7, p7

    .line 280
    .line 281
    move v8, v3

    .line 282
    goto :goto_5

    .line 283
    :cond_d
    return v3

    .line 284
    :cond_e
    :goto_6
    add-int/lit8 v11, v3, 0x1

    .line 285
    .line 286
    if-le v11, v12, :cond_c

    .line 287
    .line 288
    return v11

    .line 289
    :cond_f
    :goto_7
    return v8

    .line 290
    :cond_10
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 291
    .line 292
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 293
    .line 294
    .line 295
    throw v0

    .line 296
    :cond_11
    new-instance v0, Ljava/util/NoSuchElementException;

    .line 297
    .line 298
    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    .line 299
    .line 300
    .line 301
    throw v0
.end method

.method public static final placeHelper-BmaY500(Landroidx/compose/ui/layout/MeasureScope;JII[ILandroidx/compose/runtime/collection/MutableVector;Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;[I)Landroidx/compose/ui/layout/MeasureResult;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/MeasureScope;",
            "JII[I",
            "Landroidx/compose/runtime/collection/MutableVector<",
            "Landroidx/compose/ui/layout/MeasureResult;",
            ">;",
            "Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;",
            "[I)",
            "Landroidx/compose/ui/layout/MeasureResult;"
        }
    .end annotation

    .line 1
    invoke-interface {p7}, Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;->isHorizontal()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-interface {p7}, Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;->getVerticalArrangement()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {p7}, Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;->getHorizontalArrangement()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    invoke-interface {v1}, Landroidx/compose/foundation/layout/Arrangement$Vertical;->getSpacing-D9Ej5fM()F

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-interface {p0, v2}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-virtual {p6}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    add-int/lit8 v3, v3, -0x1

    .line 28
    .line 29
    mul-int/2addr v2, v3

    .line 30
    add-int/2addr p4, v2

    .line 31
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Constraints;->getMinHeight-impl(J)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-ge p4, v2, :cond_0

    .line 40
    .line 41
    move p4, v2

    .line 42
    :cond_0
    if-le p4, v3, :cond_1

    .line 43
    .line 44
    :goto_0
    move-object/from16 v7, p8

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move v3, p4

    .line 48
    goto :goto_0

    .line 49
    :goto_1
    invoke-interface {v1, p0, v3, p5, v7}, Landroidx/compose/foundation/layout/Arrangement$Vertical;->arrange(Landroidx/compose/ui/unit/Density;I[I[I)V

    .line 50
    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_2
    move-object/from16 v7, p8

    .line 54
    .line 55
    invoke-interface {v2}, Landroidx/compose/foundation/layout/Arrangement$Horizontal;->getSpacing-D9Ej5fM()F

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    invoke-interface {p0, v1}, Landroidx/compose/ui/unit/Density;->roundToPx-0680j_4(F)I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    invoke-virtual {p6}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    add-int/lit8 v3, v3, -0x1

    .line 68
    .line 69
    mul-int/2addr v1, v3

    .line 70
    add-int/2addr p4, v1

    .line 71
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Constraints;->getMinHeight-impl(J)I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-ge p4, v1, :cond_3

    .line 80
    .line 81
    move p4, v1

    .line 82
    :cond_3
    if-le p4, v3, :cond_4

    .line 83
    .line 84
    move v4, v3

    .line 85
    goto :goto_2

    .line 86
    :cond_4
    move v4, p4

    .line 87
    :goto_2
    invoke-interface {p0}, Landroidx/compose/ui/layout/IntrinsicMeasureScope;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    move-object v3, p0

    .line 92
    move-object v5, p5

    .line 93
    invoke-interface/range {v2 .. v7}, Landroidx/compose/foundation/layout/Arrangement$Horizontal;->arrange(Landroidx/compose/ui/unit/Density;I[ILandroidx/compose/ui/unit/LayoutDirection;[I)V

    .line 94
    .line 95
    .line 96
    move v3, v4

    .line 97
    :goto_3
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Constraints;->getMinWidth-impl(J)I

    .line 98
    .line 99
    .line 100
    move-result p4

    .line 101
    invoke-static {p1, p2}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    if-ge p3, p4, :cond_5

    .line 106
    .line 107
    move p3, p4

    .line 108
    :cond_5
    if-le p3, p1, :cond_6

    .line 109
    .line 110
    goto :goto_4

    .line 111
    :cond_6
    move p1, p3

    .line 112
    :goto_4
    if-eqz v0, :cond_7

    .line 113
    .line 114
    move p2, p1

    .line 115
    move p3, v3

    .line 116
    goto :goto_5

    .line 117
    :cond_7
    move p3, p1

    .line 118
    move p2, v3

    .line 119
    :goto_5
    new-instance p5, Landroidx/compose/foundation/layout/FlowLayoutKt$placeHelper$3;

    .line 120
    .line 121
    invoke-direct {p5, p6}, Landroidx/compose/foundation/layout/FlowLayoutKt$placeHelper$3;-><init>(Landroidx/compose/runtime/collection/MutableVector;)V

    .line 122
    .line 123
    .line 124
    const/4 p6, 0x4

    .line 125
    const/4 p1, 0x0

    .line 126
    const/4 p4, 0x0

    .line 127
    move-object p7, p1

    .line 128
    move-object p1, p0

    .line 129
    invoke-static/range {p1 .. p7}, Landroidx/compose/ui/layout/MeasureScope;->layout$default(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lhd/l;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    return-object p0
.end method

.method public static final rowMeasurementHelper(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;
    .locals 17
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    move/from16 v1, p4

    .line 4
    .line 5
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    const/4 v2, -0x1

    .line 12
    const-string v3, "androidx.compose.foundation.layout.rowMeasurementHelper (FlowLayout.kt:449)"

    .line 13
    .line 14
    const v4, 0x582ba447

    .line 15
    .line 16
    .line 17
    invoke-static {v4, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    and-int/lit8 v2, v1, 0xe

    .line 21
    .line 22
    xor-int/lit8 v2, v2, 0x6

    .line 23
    .line 24
    const/4 v3, 0x4

    .line 25
    const/4 v4, 0x0

    .line 26
    const/4 v5, 0x1

    .line 27
    move-object/from16 v8, p0

    .line 28
    .line 29
    if-le v2, v3, :cond_1

    .line 30
    .line 31
    invoke-interface {v0, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-nez v2, :cond_2

    .line 36
    .line 37
    :cond_1
    and-int/lit8 v2, v1, 0x6

    .line 38
    .line 39
    if-ne v2, v3, :cond_3

    .line 40
    .line 41
    :cond_2
    move v2, v5

    .line 42
    goto :goto_0

    .line 43
    :cond_3
    move v2, v4

    .line 44
    :goto_0
    and-int/lit8 v3, v1, 0x70

    .line 45
    .line 46
    xor-int/lit8 v3, v3, 0x30

    .line 47
    .line 48
    const/16 v6, 0x20

    .line 49
    .line 50
    move-object/from16 v9, p1

    .line 51
    .line 52
    if-le v3, v6, :cond_4

    .line 53
    .line 54
    invoke-interface {v0, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-nez v3, :cond_5

    .line 59
    .line 60
    :cond_4
    and-int/lit8 v3, v1, 0x30

    .line 61
    .line 62
    if-ne v3, v6, :cond_6

    .line 63
    .line 64
    :cond_5
    move v3, v5

    .line 65
    goto :goto_1

    .line 66
    :cond_6
    move v3, v4

    .line 67
    :goto_1
    or-int/2addr v2, v3

    .line 68
    and-int/lit16 v3, v1, 0x380

    .line 69
    .line 70
    xor-int/lit16 v3, v3, 0x180

    .line 71
    .line 72
    const/16 v6, 0x100

    .line 73
    .line 74
    move/from16 v13, p2

    .line 75
    .line 76
    if-le v3, v6, :cond_7

    .line 77
    .line 78
    invoke-interface {v0, v13}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-nez v3, :cond_8

    .line 83
    .line 84
    :cond_7
    and-int/lit16 v1, v1, 0x180

    .line 85
    .line 86
    if-ne v1, v6, :cond_9

    .line 87
    .line 88
    :cond_8
    move v4, v5

    .line 89
    :cond_9
    or-int v1, v2, v4

    .line 90
    .line 91
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    if-nez v1, :cond_a

    .line 96
    .line 97
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 98
    .line 99
    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    if-ne v2, v1, :cond_b

    .line 104
    .line 105
    :cond_a
    invoke-interface {v8}, Landroidx/compose/foundation/layout/Arrangement$Horizontal;->getSpacing-D9Ej5fM()F

    .line 106
    .line 107
    .line 108
    move-result v10

    .line 109
    sget-object v11, Landroidx/compose/foundation/layout/FlowLayoutKt;->CROSS_AXIS_ALIGNMENT_TOP:Landroidx/compose/foundation/layout/CrossAxisAlignment;

    .line 110
    .line 111
    invoke-interface {v9}, Landroidx/compose/foundation/layout/Arrangement$Vertical;->getSpacing-D9Ej5fM()F

    .line 112
    .line 113
    .line 114
    move-result v12

    .line 115
    sget-object v1, Landroidx/compose/foundation/layout/FlowRowOverflow;->Companion:Landroidx/compose/foundation/layout/FlowRowOverflow$Companion;

    .line 116
    .line 117
    invoke-virtual {v1}, Landroidx/compose/foundation/layout/FlowRowOverflow$Companion;->getVisible()Landroidx/compose/foundation/layout/FlowRowOverflow;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {v1}, Landroidx/compose/foundation/layout/FlowLayoutOverflow;->createOverflowState$foundation_layout_release()Landroidx/compose/foundation/layout/FlowLayoutOverflowState;

    .line 122
    .line 123
    .line 124
    move-result-object v15

    .line 125
    new-instance v6, Landroidx/compose/foundation/layout/FlowMeasurePolicy;

    .line 126
    .line 127
    const v14, 0x7fffffff

    .line 128
    .line 129
    .line 130
    const/16 v16, 0x0

    .line 131
    .line 132
    const/4 v7, 0x1

    .line 133
    invoke-direct/range {v6 .. v16}, Landroidx/compose/foundation/layout/FlowMeasurePolicy;-><init>(ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/CrossAxisAlignment;FIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Lkotlin/jvm/internal/n;)V

    .line 134
    .line 135
    .line 136
    new-instance v2, Landroidx/compose/foundation/layout/FlowLayoutKt$rowMeasurementHelper$1$1;

    .line 137
    .line 138
    invoke-direct {v2, v6}, Landroidx/compose/foundation/layout/FlowLayoutKt$rowMeasurementHelper$1$1;-><init>(Landroidx/compose/ui/layout/MultiContentMeasurePolicy;)V

    .line 139
    .line 140
    .line 141
    invoke-interface {v0, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    :cond_b
    check-cast v2, Landroidx/compose/ui/layout/MeasurePolicy;

    .line 145
    .line 146
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    if-eqz v0, :cond_c

    .line 151
    .line 152
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 153
    .line 154
    .line 155
    :cond_c
    return-object v2
.end method

.method public static final rowMeasurementMultiContentHelper(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;IILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MultiContentMeasurePolicy;
    .locals 18
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    move-object/from16 v1, p6

    .line 4
    .line 5
    move/from16 v2, p7

    .line 6
    .line 7
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    const/4 v3, -0x1

    .line 14
    const-string v4, "androidx.compose.foundation.layout.rowMeasurementMultiContentHelper (FlowLayout.kt:484)"

    .line 15
    .line 16
    const v5, -0x77d057b1    # -5.2859993E-34f

    .line 17
    .line 18
    .line 19
    invoke-static {v5, v2, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    and-int/lit8 v3, v2, 0xe

    .line 23
    .line 24
    xor-int/lit8 v3, v3, 0x6

    .line 25
    .line 26
    const/4 v4, 0x4

    .line 27
    const/4 v5, 0x0

    .line 28
    const/4 v6, 0x1

    .line 29
    move-object/from16 v9, p0

    .line 30
    .line 31
    if-le v3, v4, :cond_1

    .line 32
    .line 33
    invoke-interface {v1, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-nez v3, :cond_2

    .line 38
    .line 39
    :cond_1
    and-int/lit8 v3, v2, 0x6

    .line 40
    .line 41
    if-ne v3, v4, :cond_3

    .line 42
    .line 43
    :cond_2
    move v3, v6

    .line 44
    goto :goto_0

    .line 45
    :cond_3
    move v3, v5

    .line 46
    :goto_0
    and-int/lit8 v4, v2, 0x70

    .line 47
    .line 48
    xor-int/lit8 v4, v4, 0x30

    .line 49
    .line 50
    const/16 v7, 0x20

    .line 51
    .line 52
    move-object/from16 v10, p1

    .line 53
    .line 54
    if-le v4, v7, :cond_4

    .line 55
    .line 56
    invoke-interface {v1, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-nez v4, :cond_5

    .line 61
    .line 62
    :cond_4
    and-int/lit8 v4, v2, 0x30

    .line 63
    .line 64
    if-ne v4, v7, :cond_6

    .line 65
    .line 66
    :cond_5
    move v4, v6

    .line 67
    goto :goto_1

    .line 68
    :cond_6
    move v4, v5

    .line 69
    :goto_1
    or-int/2addr v3, v4

    .line 70
    and-int/lit16 v4, v2, 0x380

    .line 71
    .line 72
    xor-int/lit16 v4, v4, 0x180

    .line 73
    .line 74
    const/16 v7, 0x100

    .line 75
    .line 76
    if-le v4, v7, :cond_7

    .line 77
    .line 78
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    if-nez v4, :cond_8

    .line 83
    .line 84
    :cond_7
    and-int/lit16 v4, v2, 0x180

    .line 85
    .line 86
    if-ne v4, v7, :cond_9

    .line 87
    .line 88
    :cond_8
    move v4, v6

    .line 89
    goto :goto_2

    .line 90
    :cond_9
    move v4, v5

    .line 91
    :goto_2
    or-int/2addr v3, v4

    .line 92
    and-int/lit16 v4, v2, 0x1c00

    .line 93
    .line 94
    xor-int/lit16 v4, v4, 0xc00

    .line 95
    .line 96
    const/16 v7, 0x800

    .line 97
    .line 98
    move/from16 v14, p3

    .line 99
    .line 100
    if-le v4, v7, :cond_a

    .line 101
    .line 102
    invoke-interface {v1, v14}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    if-nez v4, :cond_b

    .line 107
    .line 108
    :cond_a
    and-int/lit16 v4, v2, 0xc00

    .line 109
    .line 110
    if-ne v4, v7, :cond_c

    .line 111
    .line 112
    :cond_b
    move v4, v6

    .line 113
    goto :goto_3

    .line 114
    :cond_c
    move v4, v5

    .line 115
    :goto_3
    or-int/2addr v3, v4

    .line 116
    const v4, 0xe000

    .line 117
    .line 118
    .line 119
    and-int/2addr v4, v2

    .line 120
    xor-int/lit16 v4, v4, 0x6000

    .line 121
    .line 122
    const/16 v7, 0x4000

    .line 123
    .line 124
    move/from16 v15, p4

    .line 125
    .line 126
    if-le v4, v7, :cond_d

    .line 127
    .line 128
    invoke-interface {v1, v15}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 129
    .line 130
    .line 131
    move-result v4

    .line 132
    if-nez v4, :cond_e

    .line 133
    .line 134
    :cond_d
    and-int/lit16 v2, v2, 0x6000

    .line 135
    .line 136
    if-ne v2, v7, :cond_f

    .line 137
    .line 138
    :cond_e
    move v5, v6

    .line 139
    :cond_f
    or-int v2, v3, v5

    .line 140
    .line 141
    move-object/from16 v3, p5

    .line 142
    .line 143
    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v4

    .line 147
    or-int/2addr v2, v4

    .line 148
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    if-nez v2, :cond_10

    .line 153
    .line 154
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 155
    .line 156
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    if-ne v4, v2, :cond_11

    .line 161
    .line 162
    :cond_10
    invoke-interface {v9}, Landroidx/compose/foundation/layout/Arrangement$Horizontal;->getSpacing-D9Ej5fM()F

    .line 163
    .line 164
    .line 165
    move-result v11

    .line 166
    sget-object v2, Landroidx/compose/foundation/layout/CrossAxisAlignment;->Companion:Landroidx/compose/foundation/layout/CrossAxisAlignment$Companion;

    .line 167
    .line 168
    invoke-virtual {v2, v0}, Landroidx/compose/foundation/layout/CrossAxisAlignment$Companion;->vertical$foundation_layout_release(Landroidx/compose/ui/Alignment$Vertical;)Landroidx/compose/foundation/layout/CrossAxisAlignment;

    .line 169
    .line 170
    .line 171
    move-result-object v12

    .line 172
    invoke-interface {v10}, Landroidx/compose/foundation/layout/Arrangement$Vertical;->getSpacing-D9Ej5fM()F

    .line 173
    .line 174
    .line 175
    move-result v13

    .line 176
    new-instance v7, Landroidx/compose/foundation/layout/FlowMeasurePolicy;

    .line 177
    .line 178
    const/4 v8, 0x1

    .line 179
    const/16 v17, 0x0

    .line 180
    .line 181
    move-object/from16 v16, v3

    .line 182
    .line 183
    invoke-direct/range {v7 .. v17}, Landroidx/compose/foundation/layout/FlowMeasurePolicy;-><init>(ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/CrossAxisAlignment;FIILandroidx/compose/foundation/layout/FlowLayoutOverflowState;Lkotlin/jvm/internal/n;)V

    .line 184
    .line 185
    .line 186
    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    move-object v4, v7

    .line 190
    :cond_11
    check-cast v4, Landroidx/compose/foundation/layout/FlowMeasurePolicy;

    .line 191
    .line 192
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    if-eqz v0, :cond_12

    .line 197
    .line 198
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 199
    .line 200
    .line 201
    :cond_12
    return-object v4
.end method

.method private static final safeNext(Ljava/util/Iterator;Landroidx/compose/foundation/layout/FlowLineInfo;)Landroidx/compose/ui/layout/Measurable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Iterator<",
            "+",
            "Landroidx/compose/ui/layout/Measurable;",
            ">;",
            "Landroidx/compose/foundation/layout/FlowLineInfo;",
            ")",
            "Landroidx/compose/ui/layout/Measurable;"
        }
    .end annotation

    .line 1
    :try_start_0
    instance-of v0, p0, Landroidx/compose/foundation/layout/ContextualFlowItemIterator;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Landroidx/compose/foundation/layout/ContextualFlowItemIterator;

    .line 6
    .line 7
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/layout/ContextualFlowItemIterator;->getNext$foundation_layout_release(Landroidx/compose/foundation/layout/FlowLineInfo;)Landroidx/compose/ui/layout/Measurable;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Landroidx/compose/ui/layout/Measurable;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    return-object p0

    .line 22
    :catch_0
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method
