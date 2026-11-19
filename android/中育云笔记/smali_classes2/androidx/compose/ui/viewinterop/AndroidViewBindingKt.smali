.class public final Landroidx/compose/ui/viewinterop/AndroidViewBindingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final AndroidViewBinding(Lhd/q;Landroidx/compose/ui/Modifier;Lhd/l;Landroidx/compose/runtime/Composer;II)V
    .locals 13
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Landroidx/viewbinding/ViewBinding;",
            ">(",
            "Lhd/q;",
            "Landroidx/compose/ui/Modifier;",
            "Lhd/l;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v4, p4

    const v0, -0x7655255a

    move-object/from16 v1, p3

    .line 1
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v10

    and-int/lit8 v1, p5, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v4, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v4, 0x6

    if-nez v1, :cond_2

    invoke-interface {v10, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v4

    goto :goto_1

    :cond_2
    move v1, v4

    :goto_1
    and-int/lit8 v2, p5, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v3, v4, 0x30

    if-nez v3, :cond_5

    invoke-interface {v10, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x20

    goto :goto_2

    :cond_4
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    :cond_5
    :goto_3
    and-int/lit8 v3, p5, 0x4

    if-eqz v3, :cond_6

    or-int/lit16 v1, v1, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v5, v4, 0x180

    if-nez v5, :cond_8

    invoke-interface {v10, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    const/16 v6, 0x100

    goto :goto_4

    :cond_7
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v1, v6

    :cond_8
    :goto_5
    and-int/lit16 v6, v1, 0x93

    const/16 v7, 0x92

    if-eq v6, v7, :cond_9

    const/4 v6, 0x1

    goto :goto_6

    :cond_9
    const/4 v6, 0x0

    :goto_6
    and-int/lit8 v7, v1, 0x1

    invoke-interface {v10, v6, v7}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v6

    if-eqz v6, :cond_e

    if-eqz v2, :cond_a

    .line 2
    sget-object p1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    :cond_a
    move-object v6, p1

    if-eqz v3, :cond_b

    .line 3
    sget-object p1, Landroidx/compose/ui/viewinterop/AndroidViewBindingKt$AndroidViewBinding$1;->INSTANCE:Landroidx/compose/ui/viewinterop/AndroidViewBindingKt$AndroidViewBinding$1;

    move-object v9, p1

    goto :goto_7

    :cond_b
    move-object v9, p2

    :goto_7
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_c

    const/4 p1, -0x1

    const-string v2, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:77)"

    .line 4
    invoke-static {v0, v1, p1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_c
    and-int/lit8 p1, v1, 0xe

    or-int/lit16 p1, p1, 0x180

    and-int/lit8 v0, v1, 0x70

    or-int/2addr p1, v0

    const v0, 0xe000

    shl-int/lit8 v1, v1, 0x6

    and-int/2addr v0, v1

    or-int v11, p1, v0

    const/16 v12, 0x8

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v5, p0

    .line 5
    invoke-static/range {v5 .. v12}, Landroidx/compose/ui/viewinterop/AndroidViewBindingKt;->AndroidViewBinding(Lhd/q;Landroidx/compose/ui/Modifier;Lhd/l;Lhd/l;Lhd/l;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_d

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_d
    move-object v2, v6

    move-object v3, v9

    goto :goto_8

    .line 6
    :cond_e
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object v2, p1

    move-object v3, p2

    :goto_8
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p1

    if-eqz p1, :cond_f

    new-instance v0, Landroidx/compose/ui/viewinterop/AndroidViewBindingKt$AndroidViewBinding$2;

    move-object v1, p0

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/viewinterop/AndroidViewBindingKt$AndroidViewBinding$2;-><init>(Lhd/q;Landroidx/compose/ui/Modifier;Lhd/l;II)V

    invoke-interface {p1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lhd/p;)V

    :cond_f
    return-void
.end method

.method public static final AndroidViewBinding(Lhd/q;Landroidx/compose/ui/Modifier;Lhd/l;Lhd/l;Lhd/l;Landroidx/compose/runtime/Composer;II)V
    .locals 19
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Landroidx/viewbinding/ViewBinding;",
            ">(",
            "Lhd/q;",
            "Landroidx/compose/ui/Modifier;",
            "Lhd/l;",
            "Lhd/l;",
            "Lhd/l;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v6, p6

    const v0, 0x1e584780

    move-object/from16 v2, p5

    .line 7
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v12

    and-int/lit8 v2, p7, 0x1

    const/4 v3, 0x4

    if-eqz v2, :cond_0

    or-int/lit8 v2, v6, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v6, 0x6

    if-nez v2, :cond_2

    invoke-interface {v12, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    move v2, v3

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v6

    goto :goto_1

    :cond_2
    move v2, v6

    :goto_1
    and-int/lit8 v4, p7, 0x2

    if-eqz v4, :cond_4

    or-int/lit8 v2, v2, 0x30

    :cond_3
    move-object/from16 v5, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v5, v6, 0x30

    if-nez v5, :cond_3

    move-object/from16 v5, p1

    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x20

    goto :goto_2

    :cond_5
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v2, v7

    :goto_3
    and-int/lit8 v7, p7, 0x4

    if-eqz v7, :cond_7

    or-int/lit16 v2, v2, 0x180

    :cond_6
    move-object/from16 v8, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v8, v6, 0x180

    if-nez v8, :cond_6

    move-object/from16 v8, p2

    invoke-interface {v12, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x100

    goto :goto_4

    :cond_8
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v2, v9

    :goto_5
    and-int/lit8 v9, p7, 0x8

    if-eqz v9, :cond_a

    or-int/lit16 v2, v2, 0xc00

    :cond_9
    move-object/from16 v11, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v11, v6, 0xc00

    if-nez v11, :cond_9

    move-object/from16 v11, p3

    invoke-interface {v12, v11}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_b

    const/16 v13, 0x800

    goto :goto_6

    :cond_b
    const/16 v13, 0x400

    :goto_6
    or-int/2addr v2, v13

    :goto_7
    and-int/lit8 v13, p7, 0x10

    if-eqz v13, :cond_d

    or-int/lit16 v2, v2, 0x6000

    :cond_c
    move-object/from16 v15, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v15, v6, 0x6000

    if-nez v15, :cond_c

    move-object/from16 v15, p4

    invoke-interface {v12, v15}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_e

    const/16 v16, 0x4000

    goto :goto_8

    :cond_e
    const/16 v16, 0x2000

    :goto_8
    or-int v2, v2, v16

    :goto_9
    and-int/lit16 v14, v2, 0x2493

    const/16 v10, 0x2492

    const/16 v17, 0x0

    const/16 v18, 0x1

    if-eq v14, v10, :cond_f

    move/from16 v10, v18

    goto :goto_a

    :cond_f
    move/from16 v10, v17

    :goto_a
    and-int/lit8 v14, v2, 0x1

    invoke-interface {v12, v10, v14}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v10

    if-eqz v10, :cond_24

    if-eqz v4, :cond_10

    .line 8
    sget-object v4, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    move-object v8, v4

    goto :goto_b

    :cond_10
    move-object v8, v5

    :goto_b
    const/4 v4, 0x0

    if-eqz v7, :cond_11

    move-object v5, v4

    goto :goto_c

    :cond_11
    move-object/from16 v5, p2

    :goto_c
    if-eqz v9, :cond_12

    .line 9
    sget-object v7, Landroidx/compose/ui/viewinterop/AndroidViewBindingKt$AndroidViewBinding$3;->INSTANCE:Landroidx/compose/ui/viewinterop/AndroidViewBindingKt$AndroidViewBinding$3;

    goto :goto_d

    :cond_12
    move-object v7, v11

    :goto_d
    if-eqz v13, :cond_13

    .line 10
    sget-object v9, Landroidx/compose/ui/viewinterop/AndroidViewBindingKt$AndroidViewBinding$4;->INSTANCE:Landroidx/compose/ui/viewinterop/AndroidViewBindingKt$AndroidViewBinding$4;

    move-object v15, v9

    :cond_13
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v9

    if-eqz v9, :cond_14

    const/4 v9, -0x1

    const-string v10, "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:148)"

    .line 11
    invoke-static {v0, v2, v9, v10}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 12
    :cond_14
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalView()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    .line 13
    invoke-interface {v12, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v0

    .line 14
    check-cast v0, Landroid/view/View;

    .line 15
    invoke-interface {v12, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v9

    .line 16
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_15

    .line 17
    sget-object v9, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v9}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v9

    if-ne v10, v9, :cond_16

    .line 18
    :cond_15
    :try_start_0
    invoke-static {v0}, Landroidx/fragment/app/ViewKt;->findFragment(Landroid/view/View;)Landroidx/fragment/app/Fragment;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v10, v0

    goto :goto_e

    :catch_0
    move-object v10, v4

    .line 19
    :goto_e
    invoke-interface {v12, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 20
    :cond_16
    check-cast v10, Landroidx/fragment/app/Fragment;

    .line 21
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalContext()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    .line 22
    invoke-interface {v12, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v0

    .line 23
    check-cast v0, Landroid/content/Context;

    .line 24
    invoke-interface {v12, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v9

    and-int/lit8 v11, v2, 0xe

    if-ne v11, v3, :cond_17

    move/from16 v3, v18

    goto :goto_f

    :cond_17
    move/from16 v3, v17

    :goto_f
    or-int/2addr v3, v9

    .line 25
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v9

    if-nez v3, :cond_18

    .line 26
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v9, v3, :cond_19

    .line 27
    :cond_18
    new-instance v9, Landroidx/compose/ui/viewinterop/AndroidViewBindingKt$AndroidViewBinding$5$1;

    invoke-direct {v9, v10, v1}, Landroidx/compose/ui/viewinterop/AndroidViewBindingKt$AndroidViewBinding$5$1;-><init>(Landroidx/fragment/app/Fragment;Lhd/q;)V

    .line 28
    invoke-interface {v12, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 29
    :cond_19
    check-cast v9, Lhd/l;

    if-nez v5, :cond_1a

    const v3, 0x5afb85a8

    .line 30
    invoke-interface {v12, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    :goto_10
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_11

    :cond_1a
    const v3, 0x5afb85a9

    invoke-interface {v12, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v3

    .line 31
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_1b

    .line 32
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_1c

    .line 33
    :cond_1b
    new-instance v4, Landroidx/compose/ui/viewinterop/AndroidViewBindingKt$AndroidViewBinding$6$1$1;

    invoke-direct {v4, v5}, Landroidx/compose/ui/viewinterop/AndroidViewBindingKt$AndroidViewBinding$6$1$1;-><init>(Lhd/l;)V

    .line 34
    invoke-interface {v12, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 35
    :cond_1c
    check-cast v4, Lhd/l;

    goto :goto_10

    :goto_11
    and-int/lit16 v3, v2, 0x1c00

    const/16 v11, 0x800

    if-ne v3, v11, :cond_1d

    move/from16 v3, v18

    goto :goto_12

    :cond_1d
    move/from16 v3, v17

    .line 36
    :goto_12
    invoke-interface {v12, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v3, v11

    invoke-interface {v12, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v3, v11

    .line 37
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v11

    if-nez v3, :cond_1e

    .line 38
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v11, v3, :cond_1f

    .line 39
    :cond_1e
    new-instance v11, Landroidx/compose/ui/viewinterop/AndroidViewBindingKt$AndroidViewBinding$7$1;

    invoke-direct {v11, v7, v10, v0}, Landroidx/compose/ui/viewinterop/AndroidViewBindingKt$AndroidViewBinding$7$1;-><init>(Lhd/l;Landroidx/fragment/app/Fragment;Landroid/content/Context;)V

    .line 40
    invoke-interface {v12, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 41
    :cond_1f
    move-object v10, v11

    check-cast v10, Lhd/l;

    const v0, 0xe000

    and-int/2addr v0, v2

    const/16 v3, 0x4000

    if-ne v0, v3, :cond_20

    move/from16 v17, v18

    .line 42
    :cond_20
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    if-nez v17, :cond_21

    .line 43
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v0, v3, :cond_22

    .line 44
    :cond_21
    new-instance v0, Landroidx/compose/ui/viewinterop/AndroidViewBindingKt$AndroidViewBinding$8$1;

    invoke-direct {v0, v15}, Landroidx/compose/ui/viewinterop/AndroidViewBindingKt$AndroidViewBinding$8$1;-><init>(Lhd/l;)V

    .line 45
    invoke-interface {v12, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 46
    :cond_22
    move-object v11, v0

    check-cast v11, Lhd/l;

    and-int/lit8 v13, v2, 0x70

    const/4 v14, 0x0

    move-object v0, v7

    move-object v7, v9

    move-object v9, v4

    .line 47
    invoke-static/range {v7 .. v14}, Landroidx/compose/ui/viewinterop/AndroidView_androidKt;->AndroidView(Lhd/l;Landroidx/compose/ui/Modifier;Lhd/l;Lhd/l;Lhd/l;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_23

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_23
    move-object v4, v0

    move-object v3, v5

    move-object v2, v8

    :goto_13
    move-object v5, v15

    goto :goto_14

    .line 48
    :cond_24
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v3, p2

    move-object v2, v5

    move-object v4, v11

    goto :goto_13

    :goto_14
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v8

    if-eqz v8, :cond_25

    new-instance v0, Landroidx/compose/ui/viewinterop/AndroidViewBindingKt$AndroidViewBinding$9;

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Landroidx/compose/ui/viewinterop/AndroidViewBindingKt$AndroidViewBinding$9;-><init>(Lhd/q;Landroidx/compose/ui/Modifier;Lhd/l;Lhd/l;Lhd/l;II)V

    invoke-interface {v8, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lhd/p;)V

    :cond_25
    return-void
.end method

.method public static final synthetic access$forEachFragmentContainerView(Landroid/view/ViewGroup;Lhd/l;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/compose/ui/viewinterop/AndroidViewBindingKt;->forEachFragmentContainerView(Landroid/view/ViewGroup;Lhd/l;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getBinding(Landroid/view/View;)Landroidx/viewbinding/ViewBinding;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/compose/ui/viewinterop/AndroidViewBindingKt;->getBinding(Landroid/view/View;)Landroidx/viewbinding/ViewBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$setBinding(Landroid/view/View;Landroidx/viewbinding/ViewBinding;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/compose/ui/viewinterop/AndroidViewBindingKt;->setBinding(Landroid/view/View;Landroidx/viewbinding/ViewBinding;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final forEachFragmentContainerView(Landroid/view/ViewGroup;Lhd/l;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    instance-of v0, p0, Landroidx/fragment/app/FragmentContainerView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {p1, p0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    :goto_0
    if-ge v1, v0, :cond_2

    .line 15
    .line 16
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    instance-of v3, v2, Landroid/view/ViewGroup;

    .line 21
    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    check-cast v2, Landroid/view/ViewGroup;

    .line 25
    .line 26
    invoke-static {v2, p1}, Landroidx/compose/ui/viewinterop/AndroidViewBindingKt;->forEachFragmentContainerView(Landroid/view/ViewGroup;Lhd/l;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    return-void
.end method

.method private static final getBinding(Landroid/view/View;)Landroidx/viewbinding/ViewBinding;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Landroidx/viewbinding/ViewBinding;",
            ">(",
            "Landroid/view/View;",
            ")TT;"
        }
    .end annotation

    .line 1
    sget v0, Landroidx/compose/ui/viewbinding/R$id;->binding_reference:I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const-string v0, "null cannot be cast to non-null type T of androidx.compose.ui.viewinterop.AndroidViewBindingKt.getBinding"

    .line 8
    .line 9
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast p0, Landroidx/viewbinding/ViewBinding;

    .line 13
    .line 14
    return-object p0
.end method

.method private static final setBinding(Landroid/view/View;Landroidx/viewbinding/ViewBinding;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Landroidx/viewbinding/ViewBinding;",
            ">(",
            "Landroid/view/View;",
            "TT;)V"
        }
    .end annotation

    .line 1
    sget v0, Landroidx/compose/ui/viewbinding/R$id;->binding_reference:I

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
