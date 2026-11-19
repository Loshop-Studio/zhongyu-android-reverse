.class public final Landroidx/compose/foundation/text/BasicTextKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0085\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0014\u0008\u0002\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\u0014\u0008\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u001a{\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0014\u0008\u0002\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0014\u0008\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u001ae\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00142\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0014\u0008\u0002\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0010H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001b\u001ao\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00142\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0014\u0008\u0002\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0010H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u001c\u001a\u001e\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f0\u001e2\u0008\u0010 \u001a\u0004\u0018\u00010!H\u0002\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006\""
    }
    d2 = {
        "BasicText",
        "",
        "text",
        "Landroidx/compose/ui/text/AnnotatedString;",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "style",
        "Landroidx/compose/ui/text/TextStyle;",
        "onTextLayout",
        "Lkotlin/Function1;",
        "Landroidx/compose/ui/text/TextLayoutResult;",
        "overflow",
        "Landroidx/compose/ui/text/style/TextOverflow;",
        "softWrap",
        "",
        "maxLines",
        "",
        "minLines",
        "inlineContent",
        "",
        "",
        "Landroidx/compose/foundation/text/InlineTextContent;",
        "BasicText-VhcvRP8",
        "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Landroidx/compose/runtime/Composer;II)V",
        "BasicText-4YKlhWE",
        "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZILjava/util/Map;Landroidx/compose/runtime/Composer;II)V",
        "BasicText-BpD7jsM",
        "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZILandroidx/compose/runtime/Composer;II)V",
        "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/runtime/Composer;II)V",
        "selectionIdSaver",
        "Landroidx/compose/runtime/saveable/Saver;",
        "",
        "selectionRegistrar",
        "Landroidx/compose/foundation/text/selection/SelectionRegistrar;",
        "foundation_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBasicText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/BasicTextKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n*L\n1#1,319:1\n76#2:320\n76#2:321\n76#2:322\n76#2:330\n76#2:332\n76#2:355\n76#2:356\n76#2:357\n76#2:358\n76#2:367\n25#3:323\n286#3,8:338\n294#3,2:352\n25#3:359\n456#3,14:379\n1114#4,6:324\n1114#4,6:360\n120#5:331\n121#5,5:333\n127#5,6:346\n134#5:354\n74#5:366\n75#5,11:368\n88#5:393\n*S KotlinDebug\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/BasicTextKt\n*L\n81#1:320\n82#1:321\n83#1:322\n139#1:330\n142#1:332\n188#1:355\n189#1:356\n190#1:357\n191#1:358\n253#1:367\n103#1:323\n142#1:338,8\n142#1:352,2\n213#1:359\n253#1:379,14\n103#1:324,6\n213#1:360,6\n142#1:331\n142#1:333,5\n142#1:346,6\n142#1:354\n253#1:366\n253#1:368,11\n253#1:393\n*E\n"
    }
.end annotation


# direct methods
.method public static final synthetic BasicText-4YKlhWE(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZILjava/util/Map;Landroidx/compose/runtime/Composer;II)V
    .locals 26
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
        message = "Maintained for binary compatibility"
    .end annotation

    move-object/from16 v12, p0

    move/from16 v13, p9

    move/from16 v14, p10

    const-string/jumbo v0, "text"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x26a8f0e8

    move-object/from16 v1, p8

    .line 71
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v15

    and-int/lit8 v1, v14, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v13, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v13, 0xe

    if-nez v1, :cond_2

    invoke-interface {v15, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v13

    goto :goto_1

    :cond_2
    move v1, v13

    :goto_1
    and-int/lit8 v2, v14, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v3, v13, 0x70

    if-nez v3, :cond_5

    move-object/from16 v3, p1

    invoke-interface {v15, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v1, v4

    goto :goto_4

    :cond_5
    :goto_3
    move-object/from16 v3, p1

    :goto_4
    and-int/lit8 v4, v14, 0x4

    if-eqz v4, :cond_6

    or-int/lit16 v1, v1, 0x180

    goto :goto_6

    :cond_6
    and-int/lit16 v6, v13, 0x380

    if-nez v6, :cond_8

    move-object/from16 v6, p2

    invoke-interface {v15, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_5

    :cond_7
    const/16 v7, 0x80

    :goto_5
    or-int/2addr v1, v7

    goto :goto_7

    :cond_8
    :goto_6
    move-object/from16 v6, p2

    :goto_7
    and-int/lit8 v7, v14, 0x8

    if-eqz v7, :cond_9

    or-int/lit16 v1, v1, 0xc00

    goto :goto_9

    :cond_9
    and-int/lit16 v8, v13, 0x1c00

    if-nez v8, :cond_b

    move-object/from16 v8, p3

    invoke-interface {v15, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    const/16 v9, 0x800

    goto :goto_8

    :cond_a
    const/16 v9, 0x400

    :goto_8
    or-int/2addr v1, v9

    goto :goto_a

    :cond_b
    :goto_9
    move-object/from16 v8, p3

    :goto_a
    and-int/lit8 v9, v14, 0x10

    const v10, 0xe000

    if-eqz v9, :cond_c

    or-int/lit16 v1, v1, 0x6000

    goto :goto_c

    :cond_c
    and-int v11, v13, v10

    if-nez v11, :cond_e

    move/from16 v11, p4

    invoke-interface {v15, v11}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v16

    if-eqz v16, :cond_d

    const/16 v16, 0x4000

    goto :goto_b

    :cond_d
    const/16 v16, 0x2000

    :goto_b
    or-int v1, v1, v16

    goto :goto_d

    :cond_e
    :goto_c
    move/from16 v11, p4

    :goto_d
    and-int/lit8 v16, v14, 0x20

    const/high16 v17, 0x70000

    if-eqz v16, :cond_f

    const/high16 v18, 0x30000

    or-int v1, v1, v18

    move/from16 v10, p5

    goto :goto_f

    :cond_f
    and-int v18, v13, v17

    move/from16 v10, p5

    if-nez v18, :cond_11

    invoke-interface {v15, v10}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v18

    if-eqz v18, :cond_10

    const/high16 v18, 0x20000

    goto :goto_e

    :cond_10
    const/high16 v18, 0x10000

    :goto_e
    or-int v1, v1, v18

    :cond_11
    :goto_f
    and-int/lit8 v18, v14, 0x40

    const/high16 v19, 0x380000

    if-eqz v18, :cond_12

    const/high16 v20, 0x180000

    or-int v1, v1, v20

    move/from16 v0, p6

    goto :goto_11

    :cond_12
    and-int v20, v13, v19

    move/from16 v0, p6

    if-nez v20, :cond_14

    invoke-interface {v15, v0}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v21

    if-eqz v21, :cond_13

    const/high16 v21, 0x100000

    goto :goto_10

    :cond_13
    const/high16 v21, 0x80000

    :goto_10
    or-int v1, v1, v21

    :cond_14
    :goto_11
    and-int/lit16 v5, v14, 0x80

    if-eqz v5, :cond_15

    const/high16 v22, 0x400000

    or-int v1, v1, v22

    :cond_15
    const/16 v0, 0x80

    if-ne v5, v0, :cond_17

    const v0, 0x16db6db

    and-int/2addr v0, v1

    const v3, 0x492492

    if-ne v0, v3, :cond_17

    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_16

    goto :goto_12

    .line 72
    :cond_16
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v2, p1

    move/from16 v7, p6

    move-object v3, v6

    move-object v4, v8

    move v6, v10

    move v5, v11

    move-object/from16 v8, p7

    goto/16 :goto_1a

    :cond_17
    :goto_12
    if-eqz v2, :cond_18

    .line 73
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    move-object/from16 v21, v0

    goto :goto_13

    :cond_18
    move-object/from16 v21, p1

    :goto_13
    if-eqz v4, :cond_19

    .line 74
    sget-object v0, Landroidx/compose/ui/text/TextStyle;->Companion:Landroidx/compose/ui/text/TextStyle$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/TextStyle$Companion;->getDefault()Landroidx/compose/ui/text/TextStyle;

    move-result-object v0

    move-object/from16 v22, v0

    goto :goto_14

    :cond_19
    move-object/from16 v22, v6

    :goto_14
    if-eqz v7, :cond_1a

    .line 75
    sget-object v0, Landroidx/compose/foundation/text/BasicTextKt$BasicText$8;->INSTANCE:Landroidx/compose/foundation/text/BasicTextKt$BasicText$8;

    move-object/from16 v23, v0

    goto :goto_15

    :cond_1a
    move-object/from16 v23, v8

    :goto_15
    if-eqz v9, :cond_1b

    .line 76
    sget-object v0, Landroidx/compose/ui/text/style/TextOverflow;->Companion:Landroidx/compose/ui/text/style/TextOverflow$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getClip-gIe3tQ8()I

    move-result v0

    move/from16 v24, v0

    goto :goto_16

    :cond_1b
    move/from16 v24, v11

    :goto_16
    if-eqz v16, :cond_1c

    const/4 v0, 0x1

    move/from16 v16, v0

    goto :goto_17

    :cond_1c
    move/from16 v16, v10

    :goto_17
    if-eqz v18, :cond_1d

    const v0, 0x7fffffff

    move/from16 v18, v0

    goto :goto_18

    :cond_1d
    move/from16 v18, p6

    :goto_18
    if-eqz v5, :cond_1e

    .line 77
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v0

    move-object/from16 v25, v0

    goto :goto_19

    :cond_1e
    move-object/from16 v25, p7

    :goto_19
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1f

    const/4 v0, -0x1

    const-string v2, "androidx.compose.foundation.text.BasicText (BasicText.kt:288)"

    const v3, -0x26a8f0e8

    .line 78
    invoke-static {v3, v1, v0, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_1f
    const/4 v7, 0x1

    const/high16 v0, 0x8c00000

    and-int/lit8 v2, v1, 0xe

    or-int/2addr v0, v2

    and-int/lit8 v2, v1, 0x70

    or-int/2addr v0, v2

    and-int/lit16 v2, v1, 0x380

    or-int/2addr v0, v2

    and-int/lit16 v2, v1, 0x1c00

    or-int/2addr v0, v2

    const v2, 0xe000

    and-int/2addr v2, v1

    or-int/2addr v0, v2

    and-int v2, v1, v17

    or-int/2addr v0, v2

    and-int v1, v1, v19

    or-int v10, v0, v1

    const/4 v11, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, v21

    move-object/from16 v2, v22

    move-object/from16 v3, v23

    move/from16 v4, v24

    move/from16 v5, v16

    move/from16 v6, v18

    move-object/from16 v8, v25

    move-object v9, v15

    .line 79
    invoke-static/range {v0 .. v11}, Landroidx/compose/foundation/text/BasicTextKt;->BasicText-VhcvRP8(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_20

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_20
    move/from16 v6, v16

    move/from16 v7, v18

    move-object/from16 v2, v21

    move-object/from16 v3, v22

    move-object/from16 v4, v23

    move/from16 v5, v24

    move-object/from16 v8, v25

    .line 80
    :goto_1a
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v11

    if-nez v11, :cond_21

    goto :goto_1b

    :cond_21
    new-instance v15, Landroidx/compose/foundation/text/BasicTextKt$BasicText$9;

    move-object v0, v15

    move-object/from16 v1, p0

    move/from16 v9, p9

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Landroidx/compose/foundation/text/BasicTextKt$BasicText$9;-><init>(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZILjava/util/Map;II)V

    invoke-interface {v11, v15}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :goto_1b
    return-void
.end method

.method public static final BasicText-4YKlhWE(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/runtime/Composer;II)V
    .locals 31
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/ui/text/TextStyle;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/text/TextLayoutResult;",
            "Lkotlin/Unit;",
            ">;IZII",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v9, p0

    move/from16 v10, p9

    move/from16 v11, p10

    const-string/jumbo v0, "text"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x5bf3fbc9

    move-object/from16 v1, p8

    .line 1
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v12

    and-int/lit8 v1, v11, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v10, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v10, 0xe

    if-nez v1, :cond_2

    invoke-interface {v12, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v10

    goto :goto_1

    :cond_2
    move v1, v10

    :goto_1
    and-int/lit8 v3, v11, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v10, 0x70

    if-nez v4, :cond_5

    move-object/from16 v4, p1

    invoke-interface {v12, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v1, v5

    goto :goto_4

    :cond_5
    :goto_3
    move-object/from16 v4, p1

    :goto_4
    and-int/lit8 v5, v11, 0x4

    if-eqz v5, :cond_6

    or-int/lit16 v1, v1, 0x180

    goto :goto_6

    :cond_6
    and-int/lit16 v6, v10, 0x380

    if-nez v6, :cond_8

    move-object/from16 v6, p2

    invoke-interface {v12, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_5

    :cond_7
    const/16 v7, 0x80

    :goto_5
    or-int/2addr v1, v7

    goto :goto_7

    :cond_8
    :goto_6
    move-object/from16 v6, p2

    :goto_7
    and-int/lit8 v7, v11, 0x8

    if-eqz v7, :cond_9

    or-int/lit16 v1, v1, 0xc00

    goto :goto_9

    :cond_9
    and-int/lit16 v8, v10, 0x1c00

    if-nez v8, :cond_b

    move-object/from16 v8, p3

    invoke-interface {v12, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_a

    const/16 v13, 0x800

    goto :goto_8

    :cond_a
    const/16 v13, 0x400

    :goto_8
    or-int/2addr v1, v13

    goto :goto_a

    :cond_b
    :goto_9
    move-object/from16 v8, p3

    :goto_a
    and-int/lit8 v13, v11, 0x10

    if-eqz v13, :cond_c

    or-int/lit16 v1, v1, 0x6000

    goto :goto_c

    :cond_c
    const v14, 0xe000

    and-int/2addr v14, v10

    if-nez v14, :cond_e

    move/from16 v14, p4

    invoke-interface {v12, v14}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v15

    if-eqz v15, :cond_d

    const/16 v15, 0x4000

    goto :goto_b

    :cond_d
    const/16 v15, 0x2000

    :goto_b
    or-int/2addr v1, v15

    goto :goto_d

    :cond_e
    :goto_c
    move/from16 v14, p4

    :goto_d
    and-int/lit8 v15, v11, 0x20

    if-eqz v15, :cond_f

    const/high16 v16, 0x30000

    or-int v1, v1, v16

    move/from16 v2, p5

    goto :goto_f

    :cond_f
    const/high16 v16, 0x70000

    and-int v16, v10, v16

    move/from16 v2, p5

    if-nez v16, :cond_11

    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v16

    if-eqz v16, :cond_10

    const/high16 v16, 0x20000

    goto :goto_e

    :cond_10
    const/high16 v16, 0x10000

    :goto_e
    or-int v1, v1, v16

    :cond_11
    :goto_f
    and-int/lit8 v16, v11, 0x40

    if-eqz v16, :cond_12

    const/high16 v17, 0x180000

    or-int v1, v1, v17

    move/from16 v0, p6

    goto :goto_11

    :cond_12
    const/high16 v17, 0x380000

    and-int v17, v10, v17

    move/from16 v0, p6

    if-nez v17, :cond_14

    invoke-interface {v12, v0}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v18

    if-eqz v18, :cond_13

    const/high16 v18, 0x100000

    goto :goto_10

    :cond_13
    const/high16 v18, 0x80000

    :goto_10
    or-int v1, v1, v18

    :cond_14
    :goto_11
    and-int/lit16 v0, v11, 0x80

    if-eqz v0, :cond_15

    const/high16 v18, 0xc00000

    or-int v1, v1, v18

    move/from16 v2, p7

    goto :goto_13

    :cond_15
    const/high16 v18, 0x1c00000

    and-int v18, v10, v18

    move/from16 v2, p7

    if-nez v18, :cond_17

    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v18

    if-eqz v18, :cond_16

    const/high16 v18, 0x800000

    goto :goto_12

    :cond_16
    const/high16 v18, 0x400000

    :goto_12
    or-int v1, v1, v18

    :cond_17
    :goto_13
    const v18, 0x16db6db

    and-int v1, v1, v18

    const v2, 0x492492

    if-ne v1, v2, :cond_19

    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v1

    if-nez v1, :cond_18

    goto :goto_14

    .line 2
    :cond_18
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move/from16 v7, p6

    move-object v2, v4

    move-object v3, v6

    move-object v4, v8

    move v5, v14

    move/from16 v6, p5

    move/from16 v8, p7

    goto/16 :goto_1d

    :cond_19
    :goto_14
    if-eqz v3, :cond_1a

    .line 3
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    move-object v4, v1

    :cond_1a
    if-eqz v5, :cond_1b

    .line 4
    sget-object v1, Landroidx/compose/ui/text/TextStyle;->Companion:Landroidx/compose/ui/text/TextStyle$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/text/TextStyle$Companion;->getDefault()Landroidx/compose/ui/text/TextStyle;

    move-result-object v1

    move-object/from16 v30, v1

    goto :goto_15

    :cond_1b
    move-object/from16 v30, v6

    :goto_15
    if-eqz v7, :cond_1c

    .line 5
    sget-object v1, Landroidx/compose/foundation/text/BasicTextKt$BasicText$1;->INSTANCE:Landroidx/compose/foundation/text/BasicTextKt$BasicText$1;

    move-object v8, v1

    :cond_1c
    if-eqz v13, :cond_1d

    .line 6
    sget-object v1, Landroidx/compose/ui/text/style/TextOverflow;->Companion:Landroidx/compose/ui/text/style/TextOverflow$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getClip-gIe3tQ8()I

    move-result v1

    move v14, v1

    :cond_1d
    const/4 v1, 0x1

    if-eqz v15, :cond_1e

    move v13, v1

    goto :goto_16

    :cond_1e
    move/from16 v13, p5

    :goto_16
    if-eqz v16, :cond_1f

    const v2, 0x7fffffff

    move v15, v2

    goto :goto_17

    :cond_1f
    move/from16 v15, p6

    :goto_17
    if-eqz v0, :cond_20

    move v7, v1

    goto :goto_18

    :cond_20
    move/from16 v7, p7

    .line 7
    :goto_18
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_21

    const/4 v0, -0x1

    const-string v2, "androidx.compose.foundation.text.BasicText (BasicText.kt:60)"

    const v3, 0x5bf3fbc9

    .line 8
    invoke-static {v3, v10, v0, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 9
    :cond_21
    invoke-static {v7, v15}, Landroidx/compose/foundation/text/HeightInLinesModifierKt;->validateMinMaxLines(II)V

    .line 10
    invoke-static {}, Landroidx/compose/foundation/text/selection/SelectionRegistrarKt;->getLocalSelectionRegistrar()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    .line 11
    invoke-interface {v12, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v0

    .line 12
    move-object v6, v0

    check-cast v6, Landroidx/compose/foundation/text/selection/SelectionRegistrar;

    .line 13
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    .line 14
    invoke-interface {v12, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v0

    .line 15
    move-object v3, v0

    check-cast v3, Landroidx/compose/ui/unit/Density;

    .line 16
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalFontFamilyResolver()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    .line 17
    invoke-interface {v12, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v0

    .line 18
    move-object v5, v0

    check-cast v5, Landroidx/compose/ui/text/font/FontFamily$Resolver;

    const v0, 0x392cd219

    invoke-interface {v12, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    if-nez v6, :cond_22

    const-wide/16 v0, 0x0

    goto :goto_19

    :cond_22
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v9, v0, v2

    aput-object v6, v0, v1

    .line 19
    invoke-static {v6}, Landroidx/compose/foundation/text/BasicTextKt;->selectionIdSaver(Landroidx/compose/foundation/text/selection/SelectionRegistrar;)Landroidx/compose/runtime/saveable/Saver;

    move-result-object v1

    new-instance v2, Landroidx/compose/foundation/text/BasicTextKt$BasicText$selectableId$1;

    invoke-direct {v2, v6}, Landroidx/compose/foundation/text/BasicTextKt$BasicText$selectableId$1;-><init>(Landroidx/compose/foundation/text/selection/SelectionRegistrar;)V

    const/16 v16, 0x48

    const/16 v17, 0x4

    move-object/from16 p1, v0

    move-object/from16 p2, v1

    const/4 v0, 0x0

    move-object/from16 p3, v0

    move-object/from16 p4, v2

    move-object/from16 p5, v12

    move/from16 p6, v16

    move/from16 p7, v17

    invoke-static/range {p1 .. p7}, Landroidx/compose/runtime/saveable/RememberSaveableKt;->rememberSaveable([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    .line 20
    :goto_19
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    const v2, -0x1d58f75c

    .line 21
    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 22
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    .line 23
    sget-object v16, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 p8, v4

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v2, v4, :cond_23

    .line 24
    new-instance v2, Landroidx/compose/foundation/text/TextController;

    .line 25
    new-instance v4, Landroidx/compose/foundation/text/TextState;

    .line 26
    new-instance v19, Landroidx/compose/ui/text/AnnotatedString;

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x6

    const/16 v20, 0x0

    move-object/from16 p1, v19

    move-object/from16 p2, p0

    move-object/from16 p3, v16

    move-object/from16 p4, v17

    move/from16 p5, v18

    move-object/from16 p6, v20

    invoke-direct/range {p1 .. p6}, Landroidx/compose/ui/text/AnnotatedString;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 p1, v6

    .line 27
    new-instance v6, Landroidx/compose/foundation/text/TextDelegate;

    const/16 v27, 0x0

    const/16 v28, 0x100

    const/16 v29, 0x0

    move-object/from16 v18, v6

    move-object/from16 v20, v30

    move/from16 v21, v15

    move/from16 v22, v7

    move/from16 v23, v13

    move/from16 v24, v14

    move-object/from16 v25, v3

    move-object/from16 v26, v5

    invoke-direct/range {v18 .. v29}, Landroidx/compose/foundation/text/TextDelegate;-><init>(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;IIZILandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 28
    invoke-direct {v4, v6, v0, v1}, Landroidx/compose/foundation/text/TextState;-><init>(Landroidx/compose/foundation/text/TextDelegate;J)V

    .line 29
    invoke-direct {v2, v4}, Landroidx/compose/foundation/text/TextController;-><init>(Landroidx/compose/foundation/text/TextState;)V

    .line 30
    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    goto :goto_1a

    :cond_23
    move-object/from16 p1, v6

    .line 31
    :goto_1a
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 32
    move-object v6, v2

    check-cast v6, Landroidx/compose/foundation/text/TextController;

    .line 33
    invoke-virtual {v6}, Landroidx/compose/foundation/text/TextController;->getState()Landroidx/compose/foundation/text/TextState;

    move-result-object v4

    .line 34
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v0

    if-nez v0, :cond_24

    .line 35
    invoke-virtual {v4}, Landroidx/compose/foundation/text/TextState;->getTextDelegate()Landroidx/compose/foundation/text/TextDelegate;

    move-result-object v0

    move-object/from16 v1, p0

    move-object/from16 v2, v30

    move-object/from16 v10, p8

    move-object v9, v4

    move-object v4, v5

    move v5, v13

    move-object/from16 v11, p1

    move/from16 p1, v13

    move-object v13, v6

    move v6, v14

    move/from16 v16, v7

    move v7, v15

    move/from16 p2, v14

    move-object v14, v8

    move/from16 v8, v16

    .line 36
    invoke-static/range {v0 .. v8}, Landroidx/compose/foundation/text/CoreTextKt;->updateTextDelegate-x_uQXYA(Landroidx/compose/foundation/text/TextDelegate;Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;ZIII)Landroidx/compose/foundation/text/TextDelegate;

    move-result-object v0

    .line 37
    invoke-virtual {v13, v0}, Landroidx/compose/foundation/text/TextController;->setTextDelegate(Landroidx/compose/foundation/text/TextDelegate;)V

    goto :goto_1b

    :cond_24
    move-object/from16 v11, p1

    move-object/from16 v10, p8

    move-object v9, v4

    move/from16 v16, v7

    move/from16 p1, v13

    move/from16 p2, v14

    move-object v13, v6

    move-object v14, v8

    .line 38
    :goto_1b
    invoke-virtual {v9, v14}, Landroidx/compose/foundation/text/TextState;->setOnTextLayout(Lkotlin/jvm/functions/Function1;)V

    .line 39
    invoke-virtual {v13, v11}, Landroidx/compose/foundation/text/TextController;->update(Landroidx/compose/foundation/text/selection/SelectionRegistrar;)V

    const v0, 0x392cd78c

    invoke-interface {v12, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    if-eqz v11, :cond_25

    .line 40
    invoke-static {}, Landroidx/compose/foundation/text/selection/TextSelectionColorsKt;->getLocalTextSelectionColors()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    .line 41
    invoke-interface {v12, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/foundation/text/selection/TextSelectionColors;

    .line 42
    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/TextSelectionColors;->getBackgroundColor-0d7_KjU()J

    move-result-wide v0

    invoke-virtual {v9, v0, v1}, Landroidx/compose/foundation/text/TextState;->setSelectionBackgroundColor-8_81llA(J)V

    :cond_25
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 43
    invoke-virtual {v13}, Landroidx/compose/foundation/text/TextController;->getModifiers()Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-interface {v10, v0}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v13}, Landroidx/compose/foundation/text/TextController;->getMeasurePolicy()Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v1

    const v2, 0x207baf9a

    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 44
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v2

    .line 45
    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v2

    .line 46
    check-cast v2, Landroidx/compose/ui/unit/Density;

    .line 47
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v3

    .line 48
    invoke-interface {v12, v3}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v3

    .line 49
    check-cast v3, Landroidx/compose/ui/unit/LayoutDirection;

    .line 50
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalViewConfiguration()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v4

    .line 51
    invoke-interface {v12, v4}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v4

    .line 52
    check-cast v4, Landroidx/compose/ui/platform/ViewConfiguration;

    .line 53
    invoke-static {v12, v0}, Landroidx/compose/ui/ComposedModifierKt;->materialize(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 54
    sget-object v5, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v6

    const v7, 0x53ca7ea5

    .line 55
    invoke-interface {v12, v7}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 56
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v7

    instance-of v7, v7, Landroidx/compose/runtime/Applier;

    if-nez v7, :cond_26

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 57
    :cond_26
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 58
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v7

    if-eqz v7, :cond_27

    .line 59
    new-instance v7, Landroidx/compose/foundation/text/BasicTextKt$BasicText-4YKlhWE$$inlined$Layout$1;

    invoke-direct {v7, v6}, Landroidx/compose/foundation/text/BasicTextKt$BasicText-4YKlhWE$$inlined$Layout$1;-><init>(Lkotlin/jvm/functions/Function0;)V

    invoke-interface {v12, v7}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1c

    .line 60
    :cond_27
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 61
    :goto_1c
    invoke-static {v12}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v6

    .line 62
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v6, v1, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 63
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetDensity()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v6, v2, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 64
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetLayoutDirection()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v6, v3, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 65
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetViewConfiguration()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v6, v4, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 66
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v6, v0, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 67
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endNode()V

    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 68
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 69
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_28

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_28
    move/from16 v6, p1

    move/from16 v5, p2

    move-object v2, v10

    move-object v4, v14

    move v7, v15

    move/from16 v8, v16

    move-object/from16 v3, v30

    .line 70
    :goto_1d
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v11

    if-nez v11, :cond_29

    goto :goto_1e

    :cond_29
    new-instance v12, Landroidx/compose/foundation/text/BasicTextKt$BasicText$2;

    move-object v0, v12

    move-object/from16 v1, p0

    move/from16 v9, p9

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Landroidx/compose/foundation/text/BasicTextKt$BasicText$2;-><init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIIII)V

    invoke-interface {v11, v12}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :goto_1e
    return-void
.end method

.method public static final synthetic BasicText-BpD7jsM(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZILandroidx/compose/runtime/Composer;II)V
    .locals 23
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
        message = "Maintained for binary compatibility"
    .end annotation

    .line 1
    move-object/from16 v11, p0

    .line 2
    .line 3
    move/from16 v12, p8

    .line 4
    .line 5
    const-string/jumbo v0, "text"

    .line 6
    .line 7
    .line 8
    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const v0, 0x3cf10926

    .line 12
    .line 13
    .line 14
    move-object/from16 v1, p7

    .line 15
    .line 16
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 17
    .line 18
    .line 19
    move-result-object v13

    .line 20
    and-int/lit8 v1, p9, 0x1

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    or-int/lit8 v1, v12, 0x6

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_0
    and-int/lit8 v1, v12, 0xe

    .line 28
    .line 29
    if-nez v1, :cond_2

    .line 30
    .line 31
    invoke-interface {v13, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    const/4 v1, 0x4

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 v1, 0x2

    .line 40
    :goto_0
    or-int/2addr v1, v12

    .line 41
    goto :goto_1

    .line 42
    :cond_2
    move v1, v12

    .line 43
    :goto_1
    and-int/lit8 v2, p9, 0x2

    .line 44
    .line 45
    if-eqz v2, :cond_3

    .line 46
    .line 47
    or-int/lit8 v1, v1, 0x30

    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_3
    and-int/lit8 v3, v12, 0x70

    .line 51
    .line 52
    if-nez v3, :cond_5

    .line 53
    .line 54
    move-object/from16 v3, p1

    .line 55
    .line 56
    invoke-interface {v13, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-eqz v4, :cond_4

    .line 61
    .line 62
    const/16 v4, 0x20

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_4
    const/16 v4, 0x10

    .line 66
    .line 67
    :goto_2
    or-int/2addr v1, v4

    .line 68
    goto :goto_4

    .line 69
    :cond_5
    :goto_3
    move-object/from16 v3, p1

    .line 70
    .line 71
    :goto_4
    and-int/lit8 v4, p9, 0x4

    .line 72
    .line 73
    if-eqz v4, :cond_6

    .line 74
    .line 75
    or-int/lit16 v1, v1, 0x180

    .line 76
    .line 77
    goto :goto_6

    .line 78
    :cond_6
    and-int/lit16 v5, v12, 0x380

    .line 79
    .line 80
    if-nez v5, :cond_8

    .line 81
    .line 82
    move-object/from16 v5, p2

    .line 83
    .line 84
    invoke-interface {v13, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    if-eqz v6, :cond_7

    .line 89
    .line 90
    const/16 v6, 0x100

    .line 91
    .line 92
    goto :goto_5

    .line 93
    :cond_7
    const/16 v6, 0x80

    .line 94
    .line 95
    :goto_5
    or-int/2addr v1, v6

    .line 96
    goto :goto_7

    .line 97
    :cond_8
    :goto_6
    move-object/from16 v5, p2

    .line 98
    .line 99
    :goto_7
    and-int/lit8 v6, p9, 0x8

    .line 100
    .line 101
    if-eqz v6, :cond_9

    .line 102
    .line 103
    or-int/lit16 v1, v1, 0xc00

    .line 104
    .line 105
    goto :goto_9

    .line 106
    :cond_9
    and-int/lit16 v7, v12, 0x1c00

    .line 107
    .line 108
    if-nez v7, :cond_b

    .line 109
    .line 110
    move-object/from16 v7, p3

    .line 111
    .line 112
    invoke-interface {v13, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v8

    .line 116
    if-eqz v8, :cond_a

    .line 117
    .line 118
    const/16 v8, 0x800

    .line 119
    .line 120
    goto :goto_8

    .line 121
    :cond_a
    const/16 v8, 0x400

    .line 122
    .line 123
    :goto_8
    or-int/2addr v1, v8

    .line 124
    goto :goto_a

    .line 125
    :cond_b
    :goto_9
    move-object/from16 v7, p3

    .line 126
    .line 127
    :goto_a
    and-int/lit8 v8, p9, 0x10

    .line 128
    .line 129
    const v9, 0xe000

    .line 130
    .line 131
    .line 132
    if-eqz v8, :cond_c

    .line 133
    .line 134
    or-int/lit16 v1, v1, 0x6000

    .line 135
    .line 136
    goto :goto_c

    .line 137
    :cond_c
    and-int v10, v12, v9

    .line 138
    .line 139
    if-nez v10, :cond_e

    .line 140
    .line 141
    move/from16 v10, p4

    .line 142
    .line 143
    invoke-interface {v13, v10}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 144
    .line 145
    .line 146
    move-result v14

    .line 147
    if-eqz v14, :cond_d

    .line 148
    .line 149
    const/16 v14, 0x4000

    .line 150
    .line 151
    goto :goto_b

    .line 152
    :cond_d
    const/16 v14, 0x2000

    .line 153
    .line 154
    :goto_b
    or-int/2addr v1, v14

    .line 155
    goto :goto_d

    .line 156
    :cond_e
    :goto_c
    move/from16 v10, p4

    .line 157
    .line 158
    :goto_d
    and-int/lit8 v14, p9, 0x20

    .line 159
    .line 160
    const/high16 v15, 0x70000

    .line 161
    .line 162
    if-eqz v14, :cond_f

    .line 163
    .line 164
    const/high16 v16, 0x30000

    .line 165
    .line 166
    or-int v1, v1, v16

    .line 167
    .line 168
    move/from16 v15, p5

    .line 169
    .line 170
    goto :goto_f

    .line 171
    :cond_f
    and-int v16, v12, v15

    .line 172
    .line 173
    move/from16 v15, p5

    .line 174
    .line 175
    if-nez v16, :cond_11

    .line 176
    .line 177
    invoke-interface {v13, v15}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 178
    .line 179
    .line 180
    move-result v16

    .line 181
    if-eqz v16, :cond_10

    .line 182
    .line 183
    const/high16 v16, 0x20000

    .line 184
    .line 185
    goto :goto_e

    .line 186
    :cond_10
    const/high16 v16, 0x10000

    .line 187
    .line 188
    :goto_e
    or-int v1, v1, v16

    .line 189
    .line 190
    :cond_11
    :goto_f
    and-int/lit8 v16, p9, 0x40

    .line 191
    .line 192
    const/high16 v17, 0x380000

    .line 193
    .line 194
    if-eqz v16, :cond_12

    .line 195
    .line 196
    const/high16 v18, 0x180000

    .line 197
    .line 198
    or-int v1, v1, v18

    .line 199
    .line 200
    move/from16 v9, p6

    .line 201
    .line 202
    goto :goto_11

    .line 203
    :cond_12
    and-int v18, v12, v17

    .line 204
    .line 205
    move/from16 v9, p6

    .line 206
    .line 207
    if-nez v18, :cond_14

    .line 208
    .line 209
    invoke-interface {v13, v9}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 210
    .line 211
    .line 212
    move-result v19

    .line 213
    if-eqz v19, :cond_13

    .line 214
    .line 215
    const/high16 v19, 0x100000

    .line 216
    .line 217
    goto :goto_10

    .line 218
    :cond_13
    const/high16 v19, 0x80000

    .line 219
    .line 220
    :goto_10
    or-int v1, v1, v19

    .line 221
    .line 222
    :cond_14
    :goto_11
    const v19, 0x2db6db

    .line 223
    .line 224
    .line 225
    and-int v0, v1, v19

    .line 226
    .line 227
    const v3, 0x92492

    .line 228
    .line 229
    .line 230
    if-ne v0, v3, :cond_16

    .line 231
    .line 232
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 233
    .line 234
    .line 235
    move-result v0

    .line 236
    if-nez v0, :cond_15

    .line 237
    .line 238
    goto :goto_12

    .line 239
    :cond_15
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 240
    .line 241
    .line 242
    move-object/from16 v2, p1

    .line 243
    .line 244
    move-object v3, v5

    .line 245
    move-object v4, v7

    .line 246
    move v7, v9

    .line 247
    move v5, v10

    .line 248
    move v6, v15

    .line 249
    goto/16 :goto_18

    .line 250
    .line 251
    :cond_16
    :goto_12
    if-eqz v2, :cond_17

    .line 252
    .line 253
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 254
    .line 255
    move-object/from16 v19, v0

    .line 256
    .line 257
    goto :goto_13

    .line 258
    :cond_17
    move-object/from16 v19, p1

    .line 259
    .line 260
    :goto_13
    if-eqz v4, :cond_18

    .line 261
    .line 262
    sget-object v0, Landroidx/compose/ui/text/TextStyle;->Companion:Landroidx/compose/ui/text/TextStyle$Companion;

    .line 263
    .line 264
    invoke-virtual {v0}, Landroidx/compose/ui/text/TextStyle$Companion;->getDefault()Landroidx/compose/ui/text/TextStyle;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    move-object/from16 v20, v0

    .line 269
    .line 270
    goto :goto_14

    .line 271
    :cond_18
    move-object/from16 v20, v5

    .line 272
    .line 273
    :goto_14
    if-eqz v6, :cond_19

    .line 274
    .line 275
    sget-object v0, Landroidx/compose/foundation/text/BasicTextKt$BasicText$6;->INSTANCE:Landroidx/compose/foundation/text/BasicTextKt$BasicText$6;

    .line 276
    .line 277
    move-object/from16 v21, v0

    .line 278
    .line 279
    goto :goto_15

    .line 280
    :cond_19
    move-object/from16 v21, v7

    .line 281
    .line 282
    :goto_15
    if-eqz v8, :cond_1a

    .line 283
    .line 284
    sget-object v0, Landroidx/compose/ui/text/style/TextOverflow;->Companion:Landroidx/compose/ui/text/style/TextOverflow$Companion;

    .line 285
    .line 286
    invoke-virtual {v0}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getClip-gIe3tQ8()I

    .line 287
    .line 288
    .line 289
    move-result v0

    .line 290
    move/from16 v22, v0

    .line 291
    .line 292
    goto :goto_16

    .line 293
    :cond_1a
    move/from16 v22, v10

    .line 294
    .line 295
    :goto_16
    if-eqz v14, :cond_1b

    .line 296
    .line 297
    const/4 v0, 0x1

    .line 298
    move v15, v0

    .line 299
    :cond_1b
    if-eqz v16, :cond_1c

    .line 300
    .line 301
    const v0, 0x7fffffff

    .line 302
    .line 303
    .line 304
    move v14, v0

    .line 305
    goto :goto_17

    .line 306
    :cond_1c
    move v14, v9

    .line 307
    :goto_17
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 308
    .line 309
    .line 310
    move-result v0

    .line 311
    if-eqz v0, :cond_1d

    .line 312
    .line 313
    const/4 v0, -0x1

    .line 314
    const-string v2, "androidx.compose.foundation.text.BasicText (BasicText.kt:265)"

    .line 315
    .line 316
    const v3, 0x3cf10926

    .line 317
    .line 318
    .line 319
    invoke-static {v3, v1, v0, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 320
    .line 321
    .line 322
    :cond_1d
    const/4 v7, 0x1

    .line 323
    const/high16 v0, 0xc00000

    .line 324
    .line 325
    and-int/lit8 v2, v1, 0xe

    .line 326
    .line 327
    or-int/2addr v0, v2

    .line 328
    and-int/lit8 v2, v1, 0x70

    .line 329
    .line 330
    or-int/2addr v0, v2

    .line 331
    and-int/lit16 v2, v1, 0x380

    .line 332
    .line 333
    or-int/2addr v0, v2

    .line 334
    and-int/lit16 v2, v1, 0x1c00

    .line 335
    .line 336
    or-int/2addr v0, v2

    .line 337
    const v2, 0xe000

    .line 338
    .line 339
    .line 340
    and-int/2addr v2, v1

    .line 341
    or-int/2addr v0, v2

    .line 342
    const/high16 v2, 0x70000

    .line 343
    .line 344
    and-int/2addr v2, v1

    .line 345
    or-int/2addr v0, v2

    .line 346
    and-int v1, v1, v17

    .line 347
    .line 348
    or-int v9, v0, v1

    .line 349
    .line 350
    const/4 v10, 0x0

    .line 351
    move-object/from16 v0, p0

    .line 352
    .line 353
    move-object/from16 v1, v19

    .line 354
    .line 355
    move-object/from16 v2, v20

    .line 356
    .line 357
    move-object/from16 v3, v21

    .line 358
    .line 359
    move/from16 v4, v22

    .line 360
    .line 361
    move v5, v15

    .line 362
    move v6, v14

    .line 363
    move-object v8, v13

    .line 364
    invoke-static/range {v0 .. v10}, Landroidx/compose/foundation/text/BasicTextKt;->BasicText-4YKlhWE(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILandroidx/compose/runtime/Composer;II)V

    .line 365
    .line 366
    .line 367
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 368
    .line 369
    .line 370
    move-result v0

    .line 371
    if-eqz v0, :cond_1e

    .line 372
    .line 373
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 374
    .line 375
    .line 376
    :cond_1e
    move v7, v14

    .line 377
    move v6, v15

    .line 378
    move-object/from16 v2, v19

    .line 379
    .line 380
    move-object/from16 v3, v20

    .line 381
    .line 382
    move-object/from16 v4, v21

    .line 383
    .line 384
    move/from16 v5, v22

    .line 385
    .line 386
    :goto_18
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 387
    .line 388
    .line 389
    move-result-object v10

    .line 390
    if-nez v10, :cond_1f

    .line 391
    .line 392
    goto :goto_19

    .line 393
    :cond_1f
    new-instance v13, Landroidx/compose/foundation/text/BasicTextKt$BasicText$7;

    .line 394
    .line 395
    move-object v0, v13

    .line 396
    move-object/from16 v1, p0

    .line 397
    .line 398
    move/from16 v8, p8

    .line 399
    .line 400
    move/from16 v9, p9

    .line 401
    .line 402
    invoke-direct/range {v0 .. v9}, Landroidx/compose/foundation/text/BasicTextKt$BasicText$7;-><init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIII)V

    .line 403
    .line 404
    .line 405
    invoke-interface {v10, v13}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 406
    .line 407
    .line 408
    :goto_19
    return-void
.end method

.method public static final BasicText-VhcvRP8(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;Landroidx/compose/runtime/Composer;II)V
    .locals 34
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableTarget;
        applier = "androidx.compose.ui.UiComposable"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/text/AnnotatedString;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/ui/text/TextStyle;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/text/TextLayoutResult;",
            "Lkotlin/Unit;",
            ">;IZII",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroidx/compose/foundation/text/InlineTextContent;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1
    move-object/from16 v11, p0

    .line 2
    .line 3
    move/from16 v12, p10

    .line 4
    .line 5
    move/from16 v13, p11

    .line 6
    .line 7
    const-string/jumbo v0, "text"

    .line 8
    .line 9
    .line 10
    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const v0, 0x32bf773b

    .line 14
    .line 15
    .line 16
    move-object/from16 v1, p9

    .line 17
    .line 18
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 19
    .line 20
    .line 21
    move-result-object v14

    .line 22
    and-int/lit8 v1, v13, 0x1

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    or-int/lit8 v1, v12, 0x6

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    and-int/lit8 v1, v12, 0xe

    .line 30
    .line 31
    if-nez v1, :cond_2

    .line 32
    .line 33
    invoke-interface {v14, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    const/4 v1, 0x4

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/4 v1, 0x2

    .line 42
    :goto_0
    or-int/2addr v1, v12

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    move v1, v12

    .line 45
    :goto_1
    and-int/lit8 v3, v13, 0x2

    .line 46
    .line 47
    if-eqz v3, :cond_3

    .line 48
    .line 49
    or-int/lit8 v1, v1, 0x30

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_3
    and-int/lit8 v4, v12, 0x70

    .line 53
    .line 54
    if-nez v4, :cond_5

    .line 55
    .line 56
    move-object/from16 v4, p1

    .line 57
    .line 58
    invoke-interface {v14, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    if-eqz v5, :cond_4

    .line 63
    .line 64
    const/16 v5, 0x20

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_4
    const/16 v5, 0x10

    .line 68
    .line 69
    :goto_2
    or-int/2addr v1, v5

    .line 70
    goto :goto_4

    .line 71
    :cond_5
    :goto_3
    move-object/from16 v4, p1

    .line 72
    .line 73
    :goto_4
    and-int/lit8 v5, v13, 0x4

    .line 74
    .line 75
    if-eqz v5, :cond_6

    .line 76
    .line 77
    or-int/lit16 v1, v1, 0x180

    .line 78
    .line 79
    goto :goto_6

    .line 80
    :cond_6
    and-int/lit16 v7, v12, 0x380

    .line 81
    .line 82
    if-nez v7, :cond_8

    .line 83
    .line 84
    move-object/from16 v7, p2

    .line 85
    .line 86
    invoke-interface {v14, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v8

    .line 90
    if-eqz v8, :cond_7

    .line 91
    .line 92
    const/16 v8, 0x100

    .line 93
    .line 94
    goto :goto_5

    .line 95
    :cond_7
    const/16 v8, 0x80

    .line 96
    .line 97
    :goto_5
    or-int/2addr v1, v8

    .line 98
    goto :goto_7

    .line 99
    :cond_8
    :goto_6
    move-object/from16 v7, p2

    .line 100
    .line 101
    :goto_7
    and-int/lit8 v8, v13, 0x8

    .line 102
    .line 103
    if-eqz v8, :cond_9

    .line 104
    .line 105
    or-int/lit16 v1, v1, 0xc00

    .line 106
    .line 107
    goto :goto_9

    .line 108
    :cond_9
    and-int/lit16 v9, v12, 0x1c00

    .line 109
    .line 110
    if-nez v9, :cond_b

    .line 111
    .line 112
    move-object/from16 v9, p3

    .line 113
    .line 114
    invoke-interface {v14, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v10

    .line 118
    if-eqz v10, :cond_a

    .line 119
    .line 120
    const/16 v10, 0x800

    .line 121
    .line 122
    goto :goto_8

    .line 123
    :cond_a
    const/16 v10, 0x400

    .line 124
    .line 125
    :goto_8
    or-int/2addr v1, v10

    .line 126
    goto :goto_a

    .line 127
    :cond_b
    :goto_9
    move-object/from16 v9, p3

    .line 128
    .line 129
    :goto_a
    and-int/lit8 v10, v13, 0x10

    .line 130
    .line 131
    if-eqz v10, :cond_c

    .line 132
    .line 133
    or-int/lit16 v1, v1, 0x6000

    .line 134
    .line 135
    goto :goto_c

    .line 136
    :cond_c
    const v15, 0xe000

    .line 137
    .line 138
    .line 139
    and-int/2addr v15, v12

    .line 140
    if-nez v15, :cond_e

    .line 141
    .line 142
    move/from16 v15, p4

    .line 143
    .line 144
    invoke-interface {v14, v15}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 145
    .line 146
    .line 147
    move-result v16

    .line 148
    if-eqz v16, :cond_d

    .line 149
    .line 150
    const/16 v16, 0x4000

    .line 151
    .line 152
    goto :goto_b

    .line 153
    :cond_d
    const/16 v16, 0x2000

    .line 154
    .line 155
    :goto_b
    or-int v1, v1, v16

    .line 156
    .line 157
    goto :goto_d

    .line 158
    :cond_e
    :goto_c
    move/from16 v15, p4

    .line 159
    .line 160
    :goto_d
    and-int/lit8 v16, v13, 0x20

    .line 161
    .line 162
    if-eqz v16, :cond_f

    .line 163
    .line 164
    const/high16 v17, 0x30000

    .line 165
    .line 166
    or-int v1, v1, v17

    .line 167
    .line 168
    move/from16 v2, p5

    .line 169
    .line 170
    goto :goto_f

    .line 171
    :cond_f
    const/high16 v17, 0x70000

    .line 172
    .line 173
    and-int v17, v12, v17

    .line 174
    .line 175
    move/from16 v2, p5

    .line 176
    .line 177
    if-nez v17, :cond_11

    .line 178
    .line 179
    invoke-interface {v14, v2}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 180
    .line 181
    .line 182
    move-result v17

    .line 183
    if-eqz v17, :cond_10

    .line 184
    .line 185
    const/high16 v17, 0x20000

    .line 186
    .line 187
    goto :goto_e

    .line 188
    :cond_10
    const/high16 v17, 0x10000

    .line 189
    .line 190
    :goto_e
    or-int v1, v1, v17

    .line 191
    .line 192
    :cond_11
    :goto_f
    and-int/lit8 v17, v13, 0x40

    .line 193
    .line 194
    if-eqz v17, :cond_12

    .line 195
    .line 196
    const/high16 v18, 0x180000

    .line 197
    .line 198
    or-int v1, v1, v18

    .line 199
    .line 200
    move/from16 v0, p6

    .line 201
    .line 202
    goto :goto_11

    .line 203
    :cond_12
    const/high16 v18, 0x380000

    .line 204
    .line 205
    and-int v18, v12, v18

    .line 206
    .line 207
    move/from16 v0, p6

    .line 208
    .line 209
    if-nez v18, :cond_14

    .line 210
    .line 211
    invoke-interface {v14, v0}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 212
    .line 213
    .line 214
    move-result v19

    .line 215
    if-eqz v19, :cond_13

    .line 216
    .line 217
    const/high16 v19, 0x100000

    .line 218
    .line 219
    goto :goto_10

    .line 220
    :cond_13
    const/high16 v19, 0x80000

    .line 221
    .line 222
    :goto_10
    or-int v1, v1, v19

    .line 223
    .line 224
    :cond_14
    :goto_11
    and-int/lit16 v6, v13, 0x80

    .line 225
    .line 226
    if-eqz v6, :cond_15

    .line 227
    .line 228
    const/high16 v20, 0xc00000

    .line 229
    .line 230
    or-int v1, v1, v20

    .line 231
    .line 232
    move/from16 v0, p7

    .line 233
    .line 234
    goto :goto_13

    .line 235
    :cond_15
    const/high16 v20, 0x1c00000

    .line 236
    .line 237
    and-int v20, v12, v20

    .line 238
    .line 239
    move/from16 v0, p7

    .line 240
    .line 241
    if-nez v20, :cond_17

    .line 242
    .line 243
    invoke-interface {v14, v0}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 244
    .line 245
    .line 246
    move-result v20

    .line 247
    if-eqz v20, :cond_16

    .line 248
    .line 249
    const/high16 v20, 0x800000

    .line 250
    .line 251
    goto :goto_12

    .line 252
    :cond_16
    const/high16 v20, 0x400000

    .line 253
    .line 254
    :goto_12
    or-int v1, v1, v20

    .line 255
    .line 256
    :cond_17
    :goto_13
    and-int/lit16 v0, v13, 0x100

    .line 257
    .line 258
    if-eqz v0, :cond_18

    .line 259
    .line 260
    const/high16 v20, 0x2000000

    .line 261
    .line 262
    or-int v1, v1, v20

    .line 263
    .line 264
    :cond_18
    const/16 v2, 0x100

    .line 265
    .line 266
    if-ne v0, v2, :cond_1a

    .line 267
    .line 268
    const v2, 0xb6db6db

    .line 269
    .line 270
    .line 271
    and-int/2addr v2, v1

    .line 272
    const v4, 0x2492492

    .line 273
    .line 274
    .line 275
    if-ne v2, v4, :cond_1a

    .line 276
    .line 277
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 278
    .line 279
    .line 280
    move-result v2

    .line 281
    if-nez v2, :cond_19

    .line 282
    .line 283
    goto :goto_14

    .line 284
    :cond_19
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 285
    .line 286
    .line 287
    move-object/from16 v2, p1

    .line 288
    .line 289
    move/from16 v6, p5

    .line 290
    .line 291
    move/from16 v8, p7

    .line 292
    .line 293
    move-object v3, v7

    .line 294
    move-object v4, v9

    .line 295
    move-object v1, v11

    .line 296
    move v5, v15

    .line 297
    move/from16 v7, p6

    .line 298
    .line 299
    move-object/from16 v9, p8

    .line 300
    .line 301
    goto/16 :goto_1f

    .line 302
    .line 303
    :cond_1a
    :goto_14
    if-eqz v3, :cond_1b

    .line 304
    .line 305
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 306
    .line 307
    move-object v4, v2

    .line 308
    goto :goto_15

    .line 309
    :cond_1b
    move-object/from16 v4, p1

    .line 310
    .line 311
    :goto_15
    if-eqz v5, :cond_1c

    .line 312
    .line 313
    sget-object v2, Landroidx/compose/ui/text/TextStyle;->Companion:Landroidx/compose/ui/text/TextStyle$Companion;

    .line 314
    .line 315
    invoke-virtual {v2}, Landroidx/compose/ui/text/TextStyle$Companion;->getDefault()Landroidx/compose/ui/text/TextStyle;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    move-object/from16 v19, v2

    .line 320
    .line 321
    goto :goto_16

    .line 322
    :cond_1c
    move-object/from16 v19, v7

    .line 323
    .line 324
    :goto_16
    if-eqz v8, :cond_1d

    .line 325
    .line 326
    sget-object v2, Landroidx/compose/foundation/text/BasicTextKt$BasicText$3;->INSTANCE:Landroidx/compose/foundation/text/BasicTextKt$BasicText$3;

    .line 327
    .line 328
    move-object v9, v2

    .line 329
    :cond_1d
    if-eqz v10, :cond_1e

    .line 330
    .line 331
    sget-object v2, Landroidx/compose/ui/text/style/TextOverflow;->Companion:Landroidx/compose/ui/text/style/TextOverflow$Companion;

    .line 332
    .line 333
    invoke-virtual {v2}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getClip-gIe3tQ8()I

    .line 334
    .line 335
    .line 336
    move-result v2

    .line 337
    move v15, v2

    .line 338
    :cond_1e
    if-eqz v16, :cond_1f

    .line 339
    .line 340
    const/16 v16, 0x1

    .line 341
    .line 342
    goto :goto_17

    .line 343
    :cond_1f
    move/from16 v16, p5

    .line 344
    .line 345
    :goto_17
    if-eqz v17, :cond_20

    .line 346
    .line 347
    const v2, 0x7fffffff

    .line 348
    .line 349
    .line 350
    move v8, v2

    .line 351
    goto :goto_18

    .line 352
    :cond_20
    move/from16 v8, p6

    .line 353
    .line 354
    :goto_18
    if-eqz v6, :cond_21

    .line 355
    .line 356
    const/4 v7, 0x1

    .line 357
    goto :goto_19

    .line 358
    :cond_21
    move/from16 v7, p7

    .line 359
    .line 360
    :goto_19
    if-eqz v0, :cond_22

    .line 361
    .line 362
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    move-object v6, v0

    .line 367
    goto :goto_1a

    .line 368
    :cond_22
    move-object/from16 v6, p8

    .line 369
    .line 370
    :goto_1a
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 371
    .line 372
    .line 373
    move-result v0

    .line 374
    if-eqz v0, :cond_23

    .line 375
    .line 376
    const/4 v0, -0x1

    .line 377
    const-string v2, "androidx.compose.foundation.text.BasicText (BasicText.kt:170)"

    .line 378
    .line 379
    const v3, 0x32bf773b

    .line 380
    .line 381
    .line 382
    invoke-static {v3, v1, v0, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 383
    .line 384
    .line 385
    :cond_23
    invoke-static {v7, v8}, Landroidx/compose/foundation/text/HeightInLinesModifierKt;->validateMinMaxLines(II)V

    .line 386
    .line 387
    .line 388
    invoke-static {}, Landroidx/compose/foundation/text/selection/SelectionRegistrarKt;->getLocalSelectionRegistrar()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    invoke-interface {v14, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    move-object v5, v0

    .line 397
    check-cast v5, Landroidx/compose/foundation/text/selection/SelectionRegistrar;

    .line 398
    .line 399
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    invoke-interface {v14, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    move-object/from16 v17, v0

    .line 408
    .line 409
    check-cast v17, Landroidx/compose/ui/unit/Density;

    .line 410
    .line 411
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalFontFamilyResolver()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    invoke-interface {v14, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    move-object/from16 v18, v0

    .line 420
    .line 421
    check-cast v18, Landroidx/compose/ui/text/font/FontFamily$Resolver;

    .line 422
    .line 423
    invoke-static {}, Landroidx/compose/foundation/text/selection/TextSelectionColorsKt;->getLocalTextSelectionColors()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    invoke-interface {v14, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v0

    .line 431
    check-cast v0, Landroidx/compose/foundation/text/selection/TextSelectionColors;

    .line 432
    .line 433
    invoke-virtual {v0}, Landroidx/compose/foundation/text/selection/TextSelectionColors;->getBackgroundColor-0d7_KjU()J

    .line 434
    .line 435
    .line 436
    move-result-wide v2

    .line 437
    invoke-static {v11, v6}, Landroidx/compose/foundation/text/CoreTextKt;->resolveInlineContent(Landroidx/compose/ui/text/AnnotatedString;Ljava/util/Map;)Lkotlin/Pair;

    .line 438
    .line 439
    .line 440
    move-result-object v0

    .line 441
    invoke-virtual {v0}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object v20

    .line 445
    check-cast v20, Ljava/util/List;

    .line 446
    .line 447
    invoke-virtual {v0}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v0

    .line 451
    check-cast v0, Ljava/util/List;

    .line 452
    .line 453
    const v10, 0x392ce654

    .line 454
    .line 455
    .line 456
    invoke-interface {v14, v10}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 457
    .line 458
    .line 459
    const/16 v22, 0x0

    .line 460
    .line 461
    if-nez v5, :cond_24

    .line 462
    .line 463
    const-wide/16 v23, 0x0

    .line 464
    .line 465
    move-object/from16 p8, v0

    .line 466
    .line 467
    move-wide/from16 v27, v23

    .line 468
    .line 469
    const/16 v21, 0x1

    .line 470
    .line 471
    goto :goto_1b

    .line 472
    :cond_24
    const/4 v10, 0x2

    .line 473
    new-array v10, v10, [Ljava/lang/Object;

    .line 474
    .line 475
    aput-object v11, v10, v22

    .line 476
    .line 477
    const/16 v21, 0x1

    .line 478
    .line 479
    aput-object v5, v10, v21

    .line 480
    .line 481
    invoke-static {v5}, Landroidx/compose/foundation/text/BasicTextKt;->selectionIdSaver(Landroidx/compose/foundation/text/selection/SelectionRegistrar;)Landroidx/compose/runtime/saveable/Saver;

    .line 482
    .line 483
    .line 484
    move-result-object v23

    .line 485
    const/16 v24, 0x0

    .line 486
    .line 487
    move-object/from16 p8, v0

    .line 488
    .line 489
    new-instance v0, Landroidx/compose/foundation/text/BasicTextKt$BasicText$selectableId$2;

    .line 490
    .line 491
    invoke-direct {v0, v5}, Landroidx/compose/foundation/text/BasicTextKt$BasicText$selectableId$2;-><init>(Landroidx/compose/foundation/text/selection/SelectionRegistrar;)V

    .line 492
    .line 493
    .line 494
    const/16 v25, 0x48

    .line 495
    .line 496
    const/16 v26, 0x4

    .line 497
    .line 498
    move-object/from16 p1, v10

    .line 499
    .line 500
    move-object/from16 p2, v23

    .line 501
    .line 502
    move-object/from16 p3, v24

    .line 503
    .line 504
    move-object/from16 p4, v0

    .line 505
    .line 506
    move-object/from16 p5, v14

    .line 507
    .line 508
    move/from16 p6, v25

    .line 509
    .line 510
    move/from16 p7, v26

    .line 511
    .line 512
    invoke-static/range {p1 .. p7}, Landroidx/compose/runtime/saveable/RememberSaveableKt;->rememberSaveable([Ljava/lang/Object;Landroidx/compose/runtime/saveable/Saver;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v0

    .line 516
    check-cast v0, Ljava/lang/Number;

    .line 517
    .line 518
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 519
    .line 520
    .line 521
    move-result-wide v23

    .line 522
    move-wide/from16 v27, v23

    .line 523
    .line 524
    :goto_1b
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 525
    .line 526
    .line 527
    const v0, -0x1d58f75c

    .line 528
    .line 529
    .line 530
    invoke-interface {v14, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 531
    .line 532
    .line 533
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    sget-object v10, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 538
    .line 539
    invoke-virtual {v10}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 540
    .line 541
    .line 542
    move-result-object v10

    .line 543
    if-ne v0, v10, :cond_25

    .line 544
    .line 545
    new-instance v10, Landroidx/compose/foundation/text/TextController;

    .line 546
    .line 547
    new-instance v0, Landroidx/compose/foundation/text/TextState;

    .line 548
    .line 549
    move-object/from16 p1, v10

    .line 550
    .line 551
    new-instance v10, Landroidx/compose/foundation/text/TextDelegate;

    .line 552
    .line 553
    const/16 v23, 0x0

    .line 554
    .line 555
    move-object/from16 p2, p8

    .line 556
    .line 557
    move-object v12, v0

    .line 558
    move-object v0, v10

    .line 559
    move/from16 v29, v1

    .line 560
    .line 561
    move-object/from16 v1, p0

    .line 562
    .line 563
    move-wide/from16 v30, v2

    .line 564
    .line 565
    move-object/from16 v2, v19

    .line 566
    .line 567
    move v3, v8

    .line 568
    move-object/from16 v32, v4

    .line 569
    .line 570
    move v4, v7

    .line 571
    move-object/from16 v33, v5

    .line 572
    .line 573
    move/from16 v5, v16

    .line 574
    .line 575
    move-object/from16 v24, v6

    .line 576
    .line 577
    move v6, v15

    .line 578
    move/from16 v25, v7

    .line 579
    .line 580
    move-object/from16 v7, v17

    .line 581
    .line 582
    move/from16 v26, v8

    .line 583
    .line 584
    move-object/from16 v8, v18

    .line 585
    .line 586
    move-object v13, v9

    .line 587
    move-object/from16 v9, v20

    .line 588
    .line 589
    move-object/from16 v11, p1

    .line 590
    .line 591
    move-object/from16 v21, v13

    .line 592
    .line 593
    move-object v13, v10

    .line 594
    move-object/from16 v10, v23

    .line 595
    .line 596
    invoke-direct/range {v0 .. v10}, Landroidx/compose/foundation/text/TextDelegate;-><init>(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;IIZILandroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 597
    .line 598
    .line 599
    move-wide/from16 v0, v27

    .line 600
    .line 601
    invoke-direct {v12, v13, v0, v1}, Landroidx/compose/foundation/text/TextState;-><init>(Landroidx/compose/foundation/text/TextDelegate;J)V

    .line 602
    .line 603
    .line 604
    invoke-direct {v11, v12}, Landroidx/compose/foundation/text/TextController;-><init>(Landroidx/compose/foundation/text/TextState;)V

    .line 605
    .line 606
    .line 607
    invoke-interface {v14, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 608
    .line 609
    .line 610
    move-object v0, v11

    .line 611
    goto :goto_1c

    .line 612
    :cond_25
    move-object/from16 p2, p8

    .line 613
    .line 614
    move/from16 v29, v1

    .line 615
    .line 616
    move-wide/from16 v30, v2

    .line 617
    .line 618
    move-object/from16 v32, v4

    .line 619
    .line 620
    move-object/from16 v33, v5

    .line 621
    .line 622
    move-object/from16 v24, v6

    .line 623
    .line 624
    move/from16 v25, v7

    .line 625
    .line 626
    move/from16 v26, v8

    .line 627
    .line 628
    move-object/from16 v21, v9

    .line 629
    .line 630
    :goto_1c
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 631
    .line 632
    .line 633
    move-object v10, v0

    .line 634
    check-cast v10, Landroidx/compose/foundation/text/TextController;

    .line 635
    .line 636
    invoke-virtual {v10}, Landroidx/compose/foundation/text/TextController;->getState()Landroidx/compose/foundation/text/TextState;

    .line 637
    .line 638
    .line 639
    move-result-object v11

    .line 640
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 641
    .line 642
    .line 643
    move-result v0

    .line 644
    if-nez v0, :cond_26

    .line 645
    .line 646
    invoke-virtual {v11}, Landroidx/compose/foundation/text/TextState;->getTextDelegate()Landroidx/compose/foundation/text/TextDelegate;

    .line 647
    .line 648
    .line 649
    move-result-object v0

    .line 650
    move-object/from16 v1, p0

    .line 651
    .line 652
    move-object/from16 v2, v19

    .line 653
    .line 654
    move-object/from16 v3, v17

    .line 655
    .line 656
    move-object/from16 v4, v18

    .line 657
    .line 658
    move/from16 v5, v16

    .line 659
    .line 660
    move v6, v15

    .line 661
    move/from16 v7, v26

    .line 662
    .line 663
    move/from16 v8, v25

    .line 664
    .line 665
    move-object/from16 v9, v20

    .line 666
    .line 667
    invoke-static/range {v0 .. v9}, Landroidx/compose/foundation/text/CoreTextKt;->updateTextDelegate-rm0N8CA(Landroidx/compose/foundation/text/TextDelegate;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;ZIIILjava/util/List;)Landroidx/compose/foundation/text/TextDelegate;

    .line 668
    .line 669
    .line 670
    move-result-object v0

    .line 671
    invoke-virtual {v10, v0}, Landroidx/compose/foundation/text/TextController;->setTextDelegate(Landroidx/compose/foundation/text/TextDelegate;)V

    .line 672
    .line 673
    .line 674
    :cond_26
    move-object/from16 v9, v21

    .line 675
    .line 676
    invoke-virtual {v11, v9}, Landroidx/compose/foundation/text/TextState;->setOnTextLayout(Lkotlin/jvm/functions/Function1;)V

    .line 677
    .line 678
    .line 679
    move-wide/from16 v0, v30

    .line 680
    .line 681
    invoke-virtual {v11, v0, v1}, Landroidx/compose/foundation/text/TextState;->setSelectionBackgroundColor-8_81llA(J)V

    .line 682
    .line 683
    .line 684
    move-object/from16 v0, v33

    .line 685
    .line 686
    invoke-virtual {v10, v0}, Landroidx/compose/foundation/text/TextController;->update(Landroidx/compose/foundation/text/selection/SelectionRegistrar;)V

    .line 687
    .line 688
    .line 689
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->isEmpty()Z

    .line 690
    .line 691
    .line 692
    move-result v0

    .line 693
    if-eqz v0, :cond_27

    .line 694
    .line 695
    sget-object v0, Landroidx/compose/foundation/text/ComposableSingletons$BasicTextKt;->INSTANCE:Landroidx/compose/foundation/text/ComposableSingletons$BasicTextKt;

    .line 696
    .line 697
    invoke-virtual {v0}, Landroidx/compose/foundation/text/ComposableSingletons$BasicTextKt;->getLambda-1$foundation_release()Lkotlin/jvm/functions/Function2;

    .line 698
    .line 699
    .line 700
    move-result-object v0

    .line 701
    move-object/from16 v1, p0

    .line 702
    .line 703
    goto :goto_1d

    .line 704
    :cond_27
    new-instance v0, Landroidx/compose/foundation/text/BasicTextKt$BasicText$4;

    .line 705
    .line 706
    move-object/from16 v1, p0

    .line 707
    .line 708
    move-object/from16 v3, p2

    .line 709
    .line 710
    move/from16 v2, v29

    .line 711
    .line 712
    invoke-direct {v0, v1, v3, v2}, Landroidx/compose/foundation/text/BasicTextKt$BasicText$4;-><init>(Landroidx/compose/ui/text/AnnotatedString;Ljava/util/List;I)V

    .line 713
    .line 714
    .line 715
    const v2, 0x6845f796

    .line 716
    .line 717
    .line 718
    const/4 v3, 0x1

    .line 719
    invoke-static {v14, v2, v3, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 720
    .line 721
    .line 722
    move-result-object v0

    .line 723
    :goto_1d
    invoke-virtual {v10}, Landroidx/compose/foundation/text/TextController;->getModifiers()Landroidx/compose/ui/Modifier;

    .line 724
    .line 725
    .line 726
    move-result-object v2

    .line 727
    move-object/from16 v3, v32

    .line 728
    .line 729
    invoke-interface {v3, v2}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 730
    .line 731
    .line 732
    move-result-object v2

    .line 733
    invoke-virtual {v10}, Landroidx/compose/foundation/text/TextController;->getMeasurePolicy()Landroidx/compose/ui/layout/MeasurePolicy;

    .line 734
    .line 735
    .line 736
    move-result-object v4

    .line 737
    const v5, -0x4ee9b9da

    .line 738
    .line 739
    .line 740
    invoke-interface {v14, v5}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 741
    .line 742
    .line 743
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 744
    .line 745
    .line 746
    move-result-object v5

    .line 747
    invoke-interface {v14, v5}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 748
    .line 749
    .line 750
    move-result-object v5

    .line 751
    check-cast v5, Landroidx/compose/ui/unit/Density;

    .line 752
    .line 753
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 754
    .line 755
    .line 756
    move-result-object v6

    .line 757
    invoke-interface {v14, v6}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 758
    .line 759
    .line 760
    move-result-object v6

    .line 761
    check-cast v6, Landroidx/compose/ui/unit/LayoutDirection;

    .line 762
    .line 763
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalViewConfiguration()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 764
    .line 765
    .line 766
    move-result-object v7

    .line 767
    invoke-interface {v14, v7}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 768
    .line 769
    .line 770
    move-result-object v7

    .line 771
    check-cast v7, Landroidx/compose/ui/platform/ViewConfiguration;

    .line 772
    .line 773
    sget-object v8, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 774
    .line 775
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 776
    .line 777
    .line 778
    move-result-object v10

    .line 779
    invoke-static {v2}, Landroidx/compose/ui/layout/LayoutKt;->materializerOf(Landroidx/compose/ui/Modifier;)Lkotlin/jvm/functions/Function3;

    .line 780
    .line 781
    .line 782
    move-result-object v2

    .line 783
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 784
    .line 785
    .line 786
    move-result-object v11

    .line 787
    instance-of v11, v11, Landroidx/compose/runtime/Applier;

    .line 788
    .line 789
    if-nez v11, :cond_28

    .line 790
    .line 791
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 792
    .line 793
    .line 794
    :cond_28
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 795
    .line 796
    .line 797
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 798
    .line 799
    .line 800
    move-result v11

    .line 801
    if-eqz v11, :cond_29

    .line 802
    .line 803
    invoke-interface {v14, v10}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 804
    .line 805
    .line 806
    goto :goto_1e

    .line 807
    :cond_29
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 808
    .line 809
    .line 810
    :goto_1e
    invoke-static {v14}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 811
    .line 812
    .line 813
    move-result-object v10

    .line 814
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 815
    .line 816
    .line 817
    move-result-object v11

    .line 818
    invoke-static {v10, v4, v11}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 819
    .line 820
    .line 821
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetDensity()Lkotlin/jvm/functions/Function2;

    .line 822
    .line 823
    .line 824
    move-result-object v4

    .line 825
    invoke-static {v10, v5, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 826
    .line 827
    .line 828
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetLayoutDirection()Lkotlin/jvm/functions/Function2;

    .line 829
    .line 830
    .line 831
    move-result-object v4

    .line 832
    invoke-static {v10, v6, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 833
    .line 834
    .line 835
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetViewConfiguration()Lkotlin/jvm/functions/Function2;

    .line 836
    .line 837
    .line 838
    move-result-object v4

    .line 839
    invoke-static {v10, v7, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 840
    .line 841
    .line 842
    invoke-static {v14}, Landroidx/compose/runtime/SkippableUpdater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 843
    .line 844
    .line 845
    move-result-object v4

    .line 846
    invoke-static {v4}, Landroidx/compose/runtime/SkippableUpdater;->box-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/SkippableUpdater;

    .line 847
    .line 848
    .line 849
    move-result-object v4

    .line 850
    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 851
    .line 852
    .line 853
    move-result-object v5

    .line 854
    invoke-interface {v2, v4, v14, v5}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 855
    .line 856
    .line 857
    const v2, 0x7ab4aae9

    .line 858
    .line 859
    .line 860
    invoke-interface {v14, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 861
    .line 862
    .line 863
    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 864
    .line 865
    .line 866
    move-result-object v2

    .line 867
    invoke-interface {v0, v14, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 868
    .line 869
    .line 870
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 871
    .line 872
    .line 873
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 874
    .line 875
    .line 876
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 877
    .line 878
    .line 879
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 880
    .line 881
    .line 882
    move-result v0

    .line 883
    if-eqz v0, :cond_2a

    .line 884
    .line 885
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 886
    .line 887
    .line 888
    :cond_2a
    move-object v2, v3

    .line 889
    move-object v4, v9

    .line 890
    move v5, v15

    .line 891
    move/from16 v6, v16

    .line 892
    .line 893
    move-object/from16 v3, v19

    .line 894
    .line 895
    move-object/from16 v9, v24

    .line 896
    .line 897
    move/from16 v8, v25

    .line 898
    .line 899
    move/from16 v7, v26

    .line 900
    .line 901
    :goto_1f
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 902
    .line 903
    .line 904
    move-result-object v12

    .line 905
    if-nez v12, :cond_2b

    .line 906
    .line 907
    goto :goto_20

    .line 908
    :cond_2b
    new-instance v13, Landroidx/compose/foundation/text/BasicTextKt$BasicText$5;

    .line 909
    .line 910
    move-object v0, v13

    .line 911
    move-object/from16 v1, p0

    .line 912
    .line 913
    move/from16 v10, p10

    .line 914
    .line 915
    move/from16 v11, p11

    .line 916
    .line 917
    invoke-direct/range {v0 .. v11}, Landroidx/compose/foundation/text/BasicTextKt$BasicText$5;-><init>(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function1;IZIILjava/util/Map;II)V

    .line 918
    .line 919
    .line 920
    invoke-interface {v12, v13}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 921
    .line 922
    .line 923
    :goto_20
    return-void
.end method

.method private static final selectionIdSaver(Landroidx/compose/foundation/text/selection/SelectionRegistrar;)Landroidx/compose/runtime/saveable/Saver;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text/selection/SelectionRegistrar;",
            ")",
            "Landroidx/compose/runtime/saveable/Saver<",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/foundation/text/BasicTextKt$selectionIdSaver$1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroidx/compose/foundation/text/BasicTextKt$selectionIdSaver$1;-><init>(Landroidx/compose/foundation/text/selection/SelectionRegistrar;)V

    .line 4
    .line 5
    .line 6
    sget-object p0, Landroidx/compose/foundation/text/BasicTextKt$selectionIdSaver$2;->INSTANCE:Landroidx/compose/foundation/text/BasicTextKt$selectionIdSaver$2;

    .line 7
    .line 8
    invoke-static {v0, p0}, Landroidx/compose/runtime/saveable/SaverKt;->Saver(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/saveable/Saver;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method
