.class public abstract Lcom/zykj/huiwei/launcher/ui/dialog/Login/ResetPasswordDialogContentKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final A(Lkotlin/jvm/functions/Function0;Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;Landroidx/compose/animation/AnimatedContentScope;ZLandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 2

    .line 1
    const-string v0, "$this$AnimatedContent"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    const/4 p2, -0x1

    .line 13
    const-string v0, "com.zykj.huiwei.launcher.ui.dialog.Login.ResetPasswordDialogContent.<anonymous>.<anonymous> (ResetPasswordDialogContent.kt:94)"

    .line 14
    .line 15
    const v1, -0x199739d6

    .line 16
    .line 17
    .line 18
    invoke-static {v1, p5, p2, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    const/4 p2, 0x0

    .line 22
    if-eqz p3, :cond_1

    .line 23
    .line 24
    const p1, -0x552c426

    .line 25
    .line 26
    .line 27
    invoke-interface {p4, p1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 28
    .line 29
    .line 30
    invoke-static {p0, p4, p2}, Lcom/zykj/huiwei/launcher/ui/dialog/Login/ResetPasswordDialogContentKt;->J(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    .line 31
    .line 32
    .line 33
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const p0, -0x551bd41

    .line 38
    .line 39
    .line 40
    invoke-interface {p4, p0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 41
    .line 42
    .line 43
    invoke-static {p1, p4, p2}, Lcom/zykj/huiwei/launcher/ui/dialog/Login/ResetPasswordDialogContentKt;->q(Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;Landroidx/compose/runtime/Composer;I)V

    .line 44
    .line 45
    .line 46
    invoke-interface {p4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 47
    .line 48
    .line 49
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-eqz p0, :cond_2

    .line 54
    .line 55
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 56
    .line 57
    .line 58
    :cond_2
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 59
    .line 60
    return-object p0
.end method

.method public static final B(Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lcom/zykj/huiwei/launcher/ui/dialog/Login/ResetPasswordDialogContentKt;->y(Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final C(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;ZLjava/lang/String;ILandroidx/compose/runtime/Composer;II)V
    .locals 113

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v0, p3

    move-object/from16 v1, p4

    move/from16 v4, p9

    move/from16 v5, p10

    const-string v6, "label"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "value"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "onValueChange"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "securityLevel"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v6, 0x4bee4584    # 3.1230728E7f

    move-object/from16 v7, p8

    .line 1
    invoke-interface {v7, v6}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v7

    and-int/lit8 v8, v4, 0x30

    if-nez v8, :cond_1

    invoke-interface {v7, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    const/16 v8, 0x20

    goto :goto_0

    :cond_0
    const/16 v8, 0x10

    :goto_0
    or-int/2addr v8, v4

    goto :goto_1

    :cond_1
    move v8, v4

    :goto_1
    and-int/lit16 v10, v4, 0x180

    if-nez v10, :cond_3

    invoke-interface {v7, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_2

    const/16 v10, 0x100

    goto :goto_2

    :cond_2
    const/16 v10, 0x80

    :goto_2
    or-int/2addr v8, v10

    :cond_3
    and-int/lit16 v10, v4, 0xc00

    if-nez v10, :cond_5

    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    const/16 v10, 0x800

    goto :goto_3

    :cond_4
    const/16 v10, 0x400

    :goto_3
    or-int/2addr v8, v10

    :cond_5
    and-int/lit16 v10, v4, 0x6000

    if-nez v10, :cond_7

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v10

    invoke-interface {v7, v10}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v10

    if-eqz v10, :cond_6

    const/16 v10, 0x4000

    goto :goto_4

    :cond_6
    const/16 v10, 0x2000

    :goto_4
    or-int/2addr v8, v10

    :cond_7
    and-int/lit8 v10, v5, 0x20

    const/high16 v12, 0x30000

    if-eqz v10, :cond_9

    or-int/2addr v8, v12

    :cond_8
    move/from16 v12, p5

    goto :goto_6

    :cond_9
    and-int/2addr v12, v4

    if-nez v12, :cond_8

    move/from16 v12, p5

    invoke-interface {v7, v12}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v13

    if-eqz v13, :cond_a

    const/high16 v13, 0x20000

    goto :goto_5

    :cond_a
    const/high16 v13, 0x10000

    :goto_5
    or-int/2addr v8, v13

    :goto_6
    and-int/lit8 v13, v5, 0x40

    const/high16 v14, 0x180000

    if-eqz v13, :cond_c

    or-int/2addr v8, v14

    :cond_b
    move-object/from16 v14, p6

    goto :goto_8

    :cond_c
    and-int/2addr v14, v4

    if-nez v14, :cond_b

    move-object/from16 v14, p6

    invoke-interface {v7, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_d

    const/high16 v15, 0x100000

    goto :goto_7

    :cond_d
    const/high16 v15, 0x80000

    :goto_7
    or-int/2addr v8, v15

    :goto_8
    and-int/lit16 v15, v5, 0x80

    const/high16 v17, 0xc00000

    if-eqz v15, :cond_e

    or-int v8, v8, v17

    move/from16 v9, p7

    goto :goto_a

    :cond_e
    and-int v17, v4, v17

    move/from16 v9, p7

    if-nez v17, :cond_10

    invoke-interface {v7, v9}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v17

    if-eqz v17, :cond_f

    const/high16 v17, 0x800000

    goto :goto_9

    :cond_f
    const/high16 v17, 0x400000

    :goto_9
    or-int v8, v8, v17

    :cond_10
    :goto_a
    const v17, 0x492491

    and-int v11, v8, v17

    const v6, 0x492490

    const/4 v3, 0x1

    if-eq v11, v6, :cond_11

    move v6, v3

    goto :goto_b

    :cond_11
    const/4 v6, 0x0

    :goto_b
    and-int/lit8 v11, v8, 0x1

    invoke-interface {v7, v6, v11}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v6

    if-eqz v6, :cond_1d

    and-int/lit8 v6, v5, 0x1

    if-eqz v6, :cond_12

    .line 2
    sget-object v6, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    move-object/from16 v102, v6

    goto :goto_c

    :cond_12
    move-object/from16 v102, p0

    :goto_c
    if-eqz v10, :cond_13

    const/4 v6, 0x0

    goto :goto_d

    :cond_13
    move v6, v12

    :goto_d
    const/4 v10, 0x0

    if-eqz v13, :cond_14

    move-object/from16 v103, v10

    goto :goto_e

    :cond_14
    move-object/from16 v103, v14

    :goto_e
    if-eqz v15, :cond_15

    const/16 v9, 0x10

    .line 3
    :cond_15
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v11

    if-eqz v11, :cond_16

    const/4 v11, -0x1

    const-string v12, "com.zykj.huiwei.launcher.ui.dialog.Login.ResetPwdTextField (ResetPasswordDialogContent.kt:274)"

    const v13, 0x4bee4584    # 3.1230728E7f

    invoke-static {v13, v8, v11, v12}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_16
    if-nez v103, :cond_17

    const v11, 0x9732391

    .line 4
    invoke-interface {v7, v11}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-virtual {v1}, Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;->d()I

    move-result v11

    const/4 v12, 0x0

    invoke-static {v11, v7, v12}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v11

    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_f

    :cond_17
    const/4 v12, 0x0

    const v11, 0x97321fe

    invoke-interface {v7, v11}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    move-object/from16 v11, v103

    .line 5
    :goto_f
    sget-object v13, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    const/4 v14, 0x0

    invoke-static {v13, v14, v3, v10}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v101

    .line 6
    new-instance v13, Landroidx/compose/ui/text/input/PasswordVisualTransformation;

    invoke-direct {v13, v12, v3, v10}, Landroidx/compose/ui/text/input/PasswordVisualTransformation;-><init>(CILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    new-instance v19, Landroidx/compose/foundation/text/KeyboardOptions;

    .line 8
    sget-object v10, Landroidx/compose/ui/text/input/KeyboardType;->Companion:Landroidx/compose/ui/text/input/KeyboardType$Companion;

    invoke-virtual {v10}, Landroidx/compose/ui/text/input/KeyboardType$Companion;->getPassword-PjHm6EE()I

    move-result v22

    const/16 v27, 0x7b

    const/16 v28, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    .line 9
    invoke-direct/range {v19 .. v28}, Landroidx/compose/foundation/text/KeyboardOptions;-><init>(ILjava/lang/Boolean;IILandroidx/compose/ui/text/input/PlatformImeOptions;Ljava/lang/Boolean;Landroidx/compose/ui/text/intl/LocaleList;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v26, v7

    move-object/from16 v104, v19

    .line 10
    sget-object v7, Landroidx/compose/material3/OutlinedTextFieldDefaults;->INSTANCE:Landroidx/compose/material3/OutlinedTextFieldDefaults;

    .line 11
    sget-object v10, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    move v14, v8

    move v15, v9

    invoke-virtual {v10}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    move-result-wide v8

    move-object/from16 v17, v10

    move-object/from16 v16, v11

    .line 12
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    move-result-wide v10

    move/from16 v19, v14

    move/from16 v20, v15

    .line 13
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    move-result-wide v14

    move/from16 v22, v12

    move-object/from16 v21, v13

    .line 14
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    move-result-wide v12

    .line 15
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    move-result-wide v29

    .line 16
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    move-result-wide v31

    const/16 v37, 0xe

    const/16 v38, 0x0

    const v33, 0x3e99999a    # 0.3f

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    invoke-static/range {v31 .. v38}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v31

    .line 17
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/graphics/Color$Companion;->getRed-0d7_KjU()J

    move-result-wide v33

    const/16 v39, 0xe

    const/16 v40, 0x0

    const v35, 0x3f4ccccd    # 0.8f

    const/16 v37, 0x0

    const/16 v38, 0x0

    invoke-static/range {v33 .. v40}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v35

    .line 18
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    move-result-wide v37

    const/16 v43, 0xe

    const/16 v44, 0x0

    const v39, 0x3dcccccd    # 0.1f

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    invoke-static/range {v37 .. v44}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v33

    .line 19
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    move-result-wide v24

    move-object/from16 v23, v16

    move-object/from16 v27, v17

    .line 20
    invoke-virtual/range {v27 .. v27}, Landroidx/compose/ui/graphics/Color$Companion;->getTransparent-0d7_KjU()J

    move-result-wide v16

    const-wide v37, 0xffff3b30L

    .line 21
    invoke-static/range {v37 .. v38}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v75

    move/from16 v28, v19

    const/16 v37, 0x800

    .line 22
    invoke-virtual/range {v27 .. v27}, Landroidx/compose/ui/graphics/Color$Companion;->getTransparent-0d7_KjU()J

    move-result-wide v18

    .line 23
    invoke-virtual/range {v27 .. v27}, Landroidx/compose/ui/graphics/Color$Companion;->getTransparent-0d7_KjU()J

    move-result-wide v38

    const v99, 0x7fff8640

    const/16 v100, 0xff7

    move/from16 v27, v20

    move-object/from16 v40, v21

    const-wide/16 v20, 0x0

    move-object/from16 v93, v26

    move/from16 v41, v27

    const-wide/16 v26, 0x0

    move/from16 v42, v28

    const/16 v28, 0x0

    move/from16 v44, v22

    move/from16 v43, v37

    move-wide/from16 v111, v38

    move-object/from16 v39, v23

    move-wide/from16 v22, v111

    const-wide/16 v37, 0x0

    move-object/from16 v45, v39

    move-object/from16 v46, v40

    const-wide/16 v39, 0x0

    move/from16 v48, v41

    move/from16 v47, v42

    const-wide/16 v41, 0x0

    move/from16 v49, v43

    move/from16 v50, v44

    const-wide/16 v43, 0x0

    move-object/from16 v51, v45

    move-object/from16 v52, v46

    const-wide/16 v45, 0x0

    move/from16 v53, v47

    move/from16 v54, v48

    const-wide/16 v47, 0x0

    move/from16 v55, v49

    move/from16 v56, v50

    const-wide/16 v49, 0x0

    move-object/from16 v57, v51

    move-object/from16 v58, v52

    const-wide/16 v51, 0x0

    move/from16 v59, v53

    move/from16 v60, v54

    const-wide/16 v53, 0x0

    move/from16 v61, v55

    move/from16 v62, v56

    const-wide/16 v55, 0x0

    move-object/from16 v63, v57

    move-object/from16 v64, v58

    const-wide/16 v57, 0x0

    move/from16 v65, v59

    move/from16 v66, v60

    const-wide/16 v59, 0x0

    move/from16 v67, v61

    move/from16 v68, v62

    const-wide/16 v61, 0x0

    move-object/from16 v69, v63

    move-object/from16 v70, v64

    const-wide/16 v63, 0x0

    move/from16 v71, v65

    move/from16 v72, v66

    const-wide/16 v65, 0x0

    move/from16 v73, v67

    move/from16 v74, v68

    const-wide/16 v67, 0x0

    move-object/from16 v77, v69

    move-object/from16 v78, v70

    const-wide/16 v69, 0x0

    move/from16 v79, v71

    move/from16 v80, v72

    const-wide/16 v71, 0x0

    move/from16 v81, v73

    move/from16 v82, v74

    const-wide/16 v73, 0x0

    move-object/from16 v83, v77

    move-object/from16 v84, v78

    const-wide/16 v77, 0x0

    move/from16 v85, v79

    move/from16 v86, v80

    const-wide/16 v79, 0x0

    move/from16 v87, v81

    move/from16 v88, v82

    const-wide/16 v81, 0x0

    move-object/from16 v89, v83

    move-object/from16 v90, v84

    const-wide/16 v83, 0x0

    move/from16 v91, v85

    move/from16 v92, v86

    const-wide/16 v85, 0x0

    move/from16 v94, v87

    move/from16 v95, v88

    const-wide/16 v87, 0x0

    move-object/from16 v96, v89

    move-object/from16 v97, v90

    const-wide/16 v89, 0x0

    move/from16 v98, v91

    move/from16 v105, v92

    const-wide/16 v91, 0x0

    move/from16 v106, v94

    const v94, 0x6c36db6

    move/from16 v107, v95

    const/16 v95, 0x6db0

    move-object/from16 v108, v96

    const/16 v96, 0x0

    move-object/from16 v109, v97

    const/16 v97, 0x6000

    move/from16 v110, v98

    const/16 v98, 0xc00

    move/from16 v4, v105

    move/from16 v5, v106

    move/from16 v3, v110

    .line 24
    invoke-virtual/range {v7 .. v100}, Landroidx/compose/material3/OutlinedTextFieldDefaults;->colors-0hiis_0(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIIII)Landroidx/compose/material3/TextFieldColors;

    move-result-object v25

    move-object/from16 v7, v93

    const/4 v8, 0x4

    int-to-float v8, v8

    const/16 v9, 0x500

    int-to-float v9, v9

    div-float/2addr v8, v9

    .line 25
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v9

    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v9

    .line 26
    iget v10, v9, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v9, v9, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v10, v9}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v9

    int-to-float v9, v9

    .line 27
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v10

    invoke-virtual {v10}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v10

    iget v10, v10, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v9, v10

    mul-float/2addr v8, v9

    .line 28
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v8

    .line 29
    invoke-static {v8}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    move-result-object v24

    const/high16 v8, 0x1c00000

    and-int/2addr v8, v3

    const/high16 v9, 0x800000

    if-ne v8, v9, :cond_18

    const/4 v12, 0x1

    goto :goto_10

    :cond_18
    move/from16 v12, v107

    :goto_10
    and-int/lit16 v8, v3, 0x1c00

    if-ne v8, v5, :cond_19

    const/16 v107, 0x1

    :cond_19
    or-int v5, v12, v107

    .line 30
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v8

    if-nez v5, :cond_1a

    .line 31
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v5

    if-ne v8, v5, :cond_1b

    .line 32
    :cond_1a
    new-instance v8, Lc4/d;

    invoke-direct {v8, v4, v0}, Lc4/d;-><init>(ILkotlin/jvm/functions/Function1;)V

    .line 33
    invoke-interface {v7, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 34
    :cond_1b
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 35
    new-instance v5, Lc4/e;

    invoke-direct {v5, v1}, Lc4/e;-><init>(Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;)V

    const v9, 0x2f6dc9ab

    const/16 v10, 0x36

    const/4 v11, 0x1

    invoke-static {v9, v11, v5, v7, v10}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v5

    .line 36
    new-instance v9, Lc4/f;

    invoke-direct {v9, v2}, Lc4/f;-><init>(Ljava/lang/String;)V

    const v12, -0x3836ae05

    invoke-static {v12, v11, v9, v7, v10}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v13

    .line 37
    new-instance v9, Lc4/g;

    move-object/from16 v12, v108

    invoke-direct {v9, v6, v12}, Lc4/g;-><init>(ZLjava/lang/String;)V

    const v12, -0x7bebd103

    invoke-static {v12, v11, v9, v7, v10}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v15

    shr-int/lit8 v3, v3, 0x6

    and-int/lit8 v9, v3, 0xe

    const v10, 0xc00180

    or-int v27, v9, v10

    const v9, 0xc30186

    and-int/lit16 v3, v3, 0x1c00

    or-int v28, v3, v9

    const/16 v29, 0x0

    const v30, 0x1d0b78

    move/from16 v16, v6

    const/4 v6, 0x0

    move-object/from16 v26, v7

    const/4 v7, 0x0

    move/from16 v54, v4

    move-object v4, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x1

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v3, p2

    move-object v10, v5

    move-object/from16 v5, v101

    move-object/from16 v18, v104

    move-object/from16 v17, v109

    .line 38
    invoke-static/range {v3 .. v30}, Landroidx/compose/material3/OutlinedTextFieldKt;->OutlinedTextField(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_1c

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_1c
    move/from16 v6, v16

    move/from16 v8, v54

    move-object/from16 v7, v103

    goto :goto_11

    :cond_1d
    move-object/from16 v26, v7

    .line 39
    invoke-interface/range {v26 .. v26}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v102, p0

    move v8, v9

    move v6, v12

    move-object v7, v14

    .line 40
    :goto_11
    invoke-interface/range {v26 .. v26}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v11

    if-eqz v11, :cond_1e

    new-instance v0, Lc4/h;

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v9, p9

    move/from16 v10, p10

    move-object v5, v1

    move-object/from16 v1, v102

    invoke-direct/range {v0 .. v10}, Lc4/h;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;ZLjava/lang/String;III)V

    invoke-interface {v11, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_1e
    return-void
.end method

.method public static final D(ILkotlin/jvm/functions/Function1;Ljava/lang/String;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "newValue"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-gt v0, p0, :cond_0

    .line 11
    .line 12
    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    .line 17
    return-object p0
.end method

.method public static final E(Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 25

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    and-int/lit8 v2, v1, 0x3

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x0

    .line 9
    if-eq v2, v3, :cond_0

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v2, v4

    .line 14
    :goto_0
    and-int/lit8 v3, v1, 0x1

    .line 15
    .line 16
    invoke-interface {v0, v2, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_2

    .line 21
    .line 22
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    const/4 v2, -0x1

    .line 29
    const-string v3, "com.zykj.huiwei.launcher.ui.dialog.Login.ResetPwdTextField.<anonymous> (ResetPasswordDialogContent.kt:286)"

    .line 30
    .line 31
    const v5, 0x2f6dc9ab

    .line 32
    .line 33
    .line 34
    invoke-static {v5, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    invoke-virtual/range {p0 .. p0}, Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;->b()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    invoke-static {v1, v0, v4}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    sget-object v2, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 46
    .line 47
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 48
    .line 49
    .line 50
    move-result-wide v3

    .line 51
    const/16 v9, 0xe

    .line 52
    .line 53
    const/4 v10, 0x0

    .line 54
    const v5, 0x3e99999a    # 0.3f

    .line 55
    .line 56
    .line 57
    const/4 v6, 0x0

    .line 58
    const/4 v7, 0x0

    .line 59
    const/4 v8, 0x0

    .line 60
    invoke-static/range {v3 .. v10}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    .line 61
    .line 62
    .line 63
    move-result-wide v2

    .line 64
    const/16 v4, 0xe

    .line 65
    .line 66
    invoke-static {v4}, Lo3/a;->a(I)J

    .line 67
    .line 68
    .line 69
    move-result-wide v4

    .line 70
    const/16 v23, 0x0

    .line 71
    .line 72
    const v24, 0x1fff2

    .line 73
    .line 74
    .line 75
    move-object v0, v1

    .line 76
    const/4 v1, 0x0

    .line 77
    const/4 v6, 0x0

    .line 78
    const/4 v7, 0x0

    .line 79
    const/4 v8, 0x0

    .line 80
    const-wide/16 v9, 0x0

    .line 81
    .line 82
    const/4 v11, 0x0

    .line 83
    const/4 v12, 0x0

    .line 84
    const-wide/16 v13, 0x0

    .line 85
    .line 86
    const/4 v15, 0x0

    .line 87
    const/16 v16, 0x0

    .line 88
    .line 89
    const/16 v17, 0x0

    .line 90
    .line 91
    const/16 v18, 0x0

    .line 92
    .line 93
    const/16 v19, 0x0

    .line 94
    .line 95
    const/16 v20, 0x0

    .line 96
    .line 97
    const/16 v22, 0xd80

    .line 98
    .line 99
    move-object/from16 v21, p1

    .line 100
    .line 101
    invoke-static/range {v0 .. v24}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 102
    .line 103
    .line 104
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-eqz v0, :cond_3

    .line 109
    .line 110
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_2
    invoke-interface/range {p1 .. p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 115
    .line 116
    .line 117
    :cond_3
    :goto_1
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 118
    .line 119
    return-object v0
.end method

.method public static final F(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 28

    .line 1
    move/from16 v0, p2

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x3

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    if-eq v1, v2, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v1, 0x0

    .line 11
    :goto_0
    and-int/lit8 v2, v0, 0x1

    .line 12
    .line 13
    move-object/from16 v3, p1

    .line 14
    .line 15
    invoke-interface {v3, v1, v2}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    const/4 v1, -0x1

    .line 28
    const-string v2, "com.zykj.huiwei.launcher.ui.dialog.Login.ResetPwdTextField.<anonymous> (ResetPasswordDialogContent.kt:294)"

    .line 29
    .line 30
    const v4, -0x3836ae05

    .line 31
    .line 32
    .line 33
    invoke-static {v4, v0, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    sget-object v0, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 37
    .line 38
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 39
    .line 40
    .line 41
    move-result-wide v5

    .line 42
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 43
    .line 44
    const/16 v1, 0x55

    .line 45
    .line 46
    int-to-float v1, v1

    .line 47
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    const/16 v0, 0xe

    .line 56
    .line 57
    invoke-static {v0}, Lo3/a;->a(I)J

    .line 58
    .line 59
    .line 60
    move-result-wide v7

    .line 61
    const/16 v26, 0x0

    .line 62
    .line 63
    const v27, 0x1fff0

    .line 64
    .line 65
    .line 66
    const/4 v9, 0x0

    .line 67
    const/4 v10, 0x0

    .line 68
    const/4 v11, 0x0

    .line 69
    const-wide/16 v12, 0x0

    .line 70
    .line 71
    const/4 v14, 0x0

    .line 72
    const/4 v15, 0x0

    .line 73
    const-wide/16 v16, 0x0

    .line 74
    .line 75
    const/16 v18, 0x0

    .line 76
    .line 77
    const/16 v19, 0x0

    .line 78
    .line 79
    const/16 v20, 0x0

    .line 80
    .line 81
    const/16 v21, 0x0

    .line 82
    .line 83
    const/16 v22, 0x0

    .line 84
    .line 85
    const/16 v23, 0x0

    .line 86
    .line 87
    const/16 v25, 0xdb0

    .line 88
    .line 89
    move-object/from16 v24, v3

    .line 90
    .line 91
    move-object/from16 v3, p0

    .line 92
    .line 93
    invoke-static/range {v3 .. v27}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 94
    .line 95
    .line 96
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-eqz v0, :cond_3

    .line 101
    .line 102
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_2
    invoke-interface/range {p1 .. p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 107
    .line 108
    .line 109
    :cond_3
    :goto_1
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 110
    .line 111
    return-object v0
.end method

.method public static final G(ZLjava/lang/String;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 13

    .line 1
    move/from16 v0, p3

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x3

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eq v1, v2, :cond_0

    .line 8
    .line 9
    move v1, v3

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    :goto_0
    and-int/lit8 v2, v0, 0x1

    .line 13
    .line 14
    invoke-interface {p2, v1, v2}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    const/4 v1, -0x1

    .line 27
    const-string v2, "com.zykj.huiwei.launcher.ui.dialog.Login.ResetPwdTextField.<anonymous> (ResetPasswordDialogContent.kt:304)"

    .line 28
    .line 29
    const v4, -0x7bebd103

    .line 30
    .line 31
    .line 32
    invoke-static {v4, v0, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    const/4 v0, 0x0

    .line 36
    const/4 v1, 0x0

    .line 37
    const/4 v2, 0x3

    .line 38
    invoke-static {v0, v1, v2, v0}, Landroidx/compose/animation/EnterExitTransitionKt;->fadeIn$default(Landroidx/compose/animation/core/FiniteAnimationSpec;FILjava/lang/Object;)Landroidx/compose/animation/EnterTransition;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    const/16 v11, 0xf

    .line 43
    .line 44
    const/4 v12, 0x0

    .line 45
    const/4 v7, 0x0

    .line 46
    const/4 v8, 0x0

    .line 47
    const/4 v9, 0x0

    .line 48
    const/4 v10, 0x0

    .line 49
    invoke-static/range {v7 .. v12}, Landroidx/compose/animation/EnterExitTransitionKt;->expandVertically$default(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment$Vertical;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/animation/EnterTransition;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-virtual {v4, v5}, Landroidx/compose/animation/EnterTransition;->plus(Landroidx/compose/animation/EnterTransition;)Landroidx/compose/animation/EnterTransition;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-static {v0, v1, v2, v0}, Landroidx/compose/animation/EnterExitTransitionKt;->fadeOut$default(Landroidx/compose/animation/core/FiniteAnimationSpec;FILjava/lang/Object;)Landroidx/compose/animation/ExitTransition;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static/range {v7 .. v12}, Landroidx/compose/animation/EnterExitTransitionKt;->shrinkVertically$default(Landroidx/compose/animation/core/FiniteAnimationSpec;Landroidx/compose/ui/Alignment$Vertical;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/animation/ExitTransition;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v0, v1}, Landroidx/compose/animation/ExitTransition;->plus(Landroidx/compose/animation/ExitTransition;)Landroidx/compose/animation/ExitTransition;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    new-instance v1, Lc4/i;

    .line 70
    .line 71
    invoke-direct {v1, p1}, Lc4/i;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    const/16 v2, 0x36

    .line 75
    .line 76
    const v5, -0x46bb78db

    .line 77
    .line 78
    .line 79
    invoke-static {v5, v3, v1, p2, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    const v7, 0x30d80

    .line 84
    .line 85
    .line 86
    const/16 v8, 0x12

    .line 87
    .line 88
    const/4 v1, 0x0

    .line 89
    move-object v2, v4

    .line 90
    const/4 v4, 0x0

    .line 91
    move-object v6, p2

    .line 92
    move-object v3, v0

    .line 93
    move v0, p0

    .line 94
    invoke-static/range {v0 .. v8}, Landroidx/compose/animation/AnimatedVisibilityKt;->AnimatedVisibility(ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    .line 95
    .line 96
    .line 97
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_3

    .line 102
    .line 103
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 104
    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_2
    invoke-interface {p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 108
    .line 109
    .line 110
    :cond_3
    :goto_1
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 111
    .line 112
    return-object v0
.end method

.method public static final H(Ljava/lang/String;Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 26

    .line 1
    const-string v0, "$this$AnimatedVisibility"

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 v0, -0x1

    .line 15
    const-string v1, "com.zykj.huiwei.launcher.ui.dialog.Login.ResetPwdTextField.<anonymous>.<anonymous> (ResetPasswordDialogContent.kt:309)"

    .line 16
    .line 17
    const v2, -0x46bb78db

    .line 18
    .line 19
    .line 20
    move/from16 v3, p3

    .line 21
    .line 22
    invoke-static {v2, v3, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    const/16 v0, 0xc

    .line 26
    .line 27
    invoke-static {v0}, Lo3/a;->a(I)J

    .line 28
    .line 29
    .line 30
    move-result-wide v5

    .line 31
    const/16 v24, 0x0

    .line 32
    .line 33
    const v25, 0x1fff6

    .line 34
    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    const-wide/16 v3, 0x0

    .line 38
    .line 39
    const/4 v7, 0x0

    .line 40
    const/4 v8, 0x0

    .line 41
    const/4 v9, 0x0

    .line 42
    const-wide/16 v10, 0x0

    .line 43
    .line 44
    const/4 v12, 0x0

    .line 45
    const/4 v13, 0x0

    .line 46
    const-wide/16 v14, 0x0

    .line 47
    .line 48
    const/16 v16, 0x0

    .line 49
    .line 50
    const/16 v17, 0x0

    .line 51
    .line 52
    const/16 v18, 0x0

    .line 53
    .line 54
    const/16 v19, 0x0

    .line 55
    .line 56
    const/16 v20, 0x0

    .line 57
    .line 58
    const/16 v21, 0x0

    .line 59
    .line 60
    const/16 v23, 0xc00

    .line 61
    .line 62
    move-object/from16 v1, p0

    .line 63
    .line 64
    move-object/from16 v22, p2

    .line 65
    .line 66
    invoke-static/range {v1 .. v25}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 67
    .line 68
    .line 69
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_1

    .line 74
    .line 75
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 76
    .line 77
    .line 78
    :cond_1
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 79
    .line 80
    return-object v0
.end method

.method public static final I(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;ZLjava/lang/String;IIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 12

    .line 1
    or-int/lit8 v0, p8, 0x1

    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move/from16 v11, p9

    move-object/from16 v9, p10

    invoke-static/range {v1 .. v11}, Lcom/zykj/huiwei/launcher/ui/dialog/Login/ResetPasswordDialogContentKt;->C(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;ZLjava/lang/String;ILandroidx/compose/runtime/Composer;II)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final J(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    const-string v2, "onLoginClick"

    .line 6
    .line 7
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const v2, -0x2e1eb47

    .line 11
    .line 12
    .line 13
    move-object/from16 v3, p1

    .line 14
    .line 15
    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 16
    .line 17
    .line 18
    move-result-object v13

    .line 19
    and-int/lit8 v3, v1, 0x6

    .line 20
    .line 21
    const/4 v4, 0x2

    .line 22
    if-nez v3, :cond_1

    .line 23
    .line 24
    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    const/4 v3, 0x4

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v3, v4

    .line 33
    :goto_0
    or-int/2addr v3, v1

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move v3, v1

    .line 36
    :goto_1
    and-int/lit8 v5, v3, 0x3

    .line 37
    .line 38
    const/4 v6, 0x1

    .line 39
    if-eq v5, v4, :cond_2

    .line 40
    .line 41
    move v5, v6

    .line 42
    goto :goto_2

    .line 43
    :cond_2
    const/4 v5, 0x0

    .line 44
    :goto_2
    and-int/lit8 v7, v3, 0x1

    .line 45
    .line 46
    invoke-interface {v13, v5, v7}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-eqz v5, :cond_4

    .line 51
    .line 52
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-eqz v5, :cond_3

    .line 57
    .line 58
    const/4 v5, -0x1

    .line 59
    const-string v7, "com.zykj.huiwei.launcher.ui.dialog.Login.ResetSuccessView (ResetPasswordDialogContent.kt:106)"

    .line 60
    .line 61
    invoke-static {v2, v3, v5, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 62
    .line 63
    .line 64
    :cond_3
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 65
    .line 66
    const/16 v3, 0x258

    .line 67
    .line 68
    int-to-float v3, v3

    .line 69
    const/16 v5, 0x500

    .line 70
    .line 71
    int-to-float v5, v5

    .line 72
    div-float/2addr v3, v5

    .line 73
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    iget v8, v7, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 82
    .line 83
    iget v7, v7, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 84
    .line 85
    invoke-static {v8, v7}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    int-to-float v7, v7

    .line 90
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 91
    .line 92
    .line 93
    move-result-object v8

    .line 94
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 95
    .line 96
    .line 97
    move-result-object v8

    .line 98
    iget v8, v8, Landroid/util/DisplayMetrics;->density:F

    .line 99
    .line 100
    div-float/2addr v7, v8

    .line 101
    mul-float/2addr v3, v7

    .line 102
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    const/16 v3, 0x190

    .line 111
    .line 112
    int-to-float v3, v3

    .line 113
    div-float/2addr v3, v5

    .line 114
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    iget v8, v7, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 123
    .line 124
    iget v7, v7, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 125
    .line 126
    invoke-static {v8, v7}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 127
    .line 128
    .line 129
    move-result v7

    .line 130
    int-to-float v7, v7

    .line 131
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 132
    .line 133
    .line 134
    move-result-object v8

    .line 135
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 136
    .line 137
    .line 138
    move-result-object v8

    .line 139
    iget v8, v8, Landroid/util/DisplayMetrics;->density:F

    .line 140
    .line 141
    div-float/2addr v7, v8

    .line 142
    mul-float/2addr v3, v7

    .line 143
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    const/4 v7, 0x0

    .line 148
    const/4 v8, 0x0

    .line 149
    invoke-static {v2, v3, v7, v4, v8}, Landroidx/compose/foundation/layout/SizeKt;->heightIn-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 150
    .line 151
    .line 152
    move-result-object v14

    .line 153
    const/16 v2, 0xa

    .line 154
    .line 155
    int-to-float v2, v2

    .line 156
    div-float/2addr v2, v5

    .line 157
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    iget v4, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 166
    .line 167
    iget v3, v3, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 168
    .line 169
    invoke-static {v4, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 170
    .line 171
    .line 172
    move-result v3

    .line 173
    int-to-float v3, v3

    .line 174
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    iget v4, v4, Landroid/util/DisplayMetrics;->density:F

    .line 183
    .line 184
    div-float/2addr v3, v4

    .line 185
    mul-float/2addr v2, v3

    .line 186
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 187
    .line 188
    .line 189
    move-result v15

    .line 190
    const/16 v2, 0xc

    .line 191
    .line 192
    int-to-float v2, v2

    .line 193
    div-float/2addr v2, v5

    .line 194
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    iget v4, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 203
    .line 204
    iget v3, v3, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 205
    .line 206
    invoke-static {v4, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 207
    .line 208
    .line 209
    move-result v3

    .line 210
    int-to-float v3, v3

    .line 211
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 216
    .line 217
    .line 218
    move-result-object v4

    .line 219
    iget v4, v4, Landroid/util/DisplayMetrics;->density:F

    .line 220
    .line 221
    div-float/2addr v3, v4

    .line 222
    mul-float/2addr v3, v2

    .line 223
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 224
    .line 225
    .line 226
    move-result v3

    .line 227
    invoke-static {v3}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 228
    .line 229
    .line 230
    move-result-object v16

    .line 231
    const/16 v22, 0x1c

    .line 232
    .line 233
    const/16 v23, 0x0

    .line 234
    .line 235
    const/16 v17, 0x0

    .line 236
    .line 237
    const-wide/16 v18, 0x0

    .line 238
    .line 239
    const-wide/16 v20, 0x0

    .line 240
    .line 241
    invoke-static/range {v14 .. v23}, Landroidx/compose/ui/draw/ShadowKt;->shadow-s4CzXII$default(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;ZJJILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 246
    .line 247
    .line 248
    move-result-object v4

    .line 249
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 250
    .line 251
    .line 252
    move-result-object v4

    .line 253
    iget v5, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 254
    .line 255
    iget v4, v4, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 256
    .line 257
    invoke-static {v5, v4}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 258
    .line 259
    .line 260
    move-result v4

    .line 261
    int-to-float v4, v4

    .line 262
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 263
    .line 264
    .line 265
    move-result-object v5

    .line 266
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 267
    .line 268
    .line 269
    move-result-object v5

    .line 270
    iget v5, v5, Landroid/util/DisplayMetrics;->density:F

    .line 271
    .line 272
    div-float/2addr v4, v5

    .line 273
    mul-float/2addr v2, v4

    .line 274
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 275
    .line 276
    .line 277
    move-result v2

    .line 278
    invoke-static {v2}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 279
    .line 280
    .line 281
    move-result-object v4

    .line 282
    sget-object v2, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 283
    .line 284
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/Color$Companion;->getTransparent-0d7_KjU()J

    .line 285
    .line 286
    .line 287
    move-result-wide v7

    .line 288
    new-instance v2, Lc4/k;

    .line 289
    .line 290
    invoke-direct {v2, v0}, Lc4/k;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 291
    .line 292
    .line 293
    const/16 v5, 0x36

    .line 294
    .line 295
    const v9, 0x2b296214

    .line 296
    .line 297
    .line 298
    invoke-static {v9, v6, v2, v13, v5}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 299
    .line 300
    .line 301
    move-result-object v12

    .line 302
    const v14, 0xc00180

    .line 303
    .line 304
    .line 305
    const/16 v15, 0x78

    .line 306
    .line 307
    move-wide v5, v7

    .line 308
    const-wide/16 v7, 0x0

    .line 309
    .line 310
    const/4 v9, 0x0

    .line 311
    const/4 v10, 0x0

    .line 312
    const/4 v11, 0x0

    .line 313
    invoke-static/range {v3 .. v15}, Landroidx/compose/material3/SurfaceKt;->Surface-T9BRK9s(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    .line 314
    .line 315
    .line 316
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 317
    .line 318
    .line 319
    move-result v2

    .line 320
    if-eqz v2, :cond_5

    .line 321
    .line 322
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 323
    .line 324
    .line 325
    goto :goto_3

    .line 326
    :cond_4
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 327
    .line 328
    .line 329
    :cond_5
    :goto_3
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 330
    .line 331
    .line 332
    move-result-object v2

    .line 333
    if-eqz v2, :cond_6

    .line 334
    .line 335
    new-instance v3, Lc4/l;

    .line 336
    .line 337
    invoke-direct {v3, v0, v1}, Lc4/l;-><init>(Lkotlin/jvm/functions/Function0;I)V

    .line 338
    .line 339
    .line 340
    invoke-interface {v2, v3}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 341
    .line 342
    .line 343
    :cond_6
    return-void
.end method

.method public static final K(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 32

    .line 1
    move-object/from16 v6, p1

    .line 2
    .line 3
    move/from16 v0, p2

    .line 4
    .line 5
    and-int/lit8 v1, v0, 0x3

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    const/4 v10, 0x2

    .line 10
    if-eq v1, v10, :cond_0

    .line 11
    .line 12
    move v1, v3

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v1, v2

    .line 15
    :goto_0
    and-int/lit8 v4, v0, 0x1

    .line 16
    .line 17
    invoke-interface {v6, v1, v4}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_6

    .line 22
    .line 23
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    const/4 v1, -0x1

    .line 30
    const-string v4, "com.zykj.huiwei.launcher.ui.dialog.Login.ResetSuccessView.<anonymous> (ResetPasswordDialogContent.kt:115)"

    .line 31
    .line 32
    const v5, 0x2b296214

    .line 33
    .line 34
    .line 35
    invoke-static {v5, v0, v1, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    sget-object v11, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 39
    .line 40
    sget-object v12, Landroidx/compose/ui/graphics/Brush;->Companion:Landroidx/compose/ui/graphics/Brush$Companion;

    .line 41
    .line 42
    const-wide v0, 0xff252d46L

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 48
    .line 49
    .line 50
    move-result-wide v0

    .line 51
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    const-wide v4, 0xff20283fL

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    invoke-static {v4, v5}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 61
    .line 62
    .line 63
    move-result-wide v4

    .line 64
    invoke-static {v4, v5}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    filled-new-array {v0, v1}, [Landroidx/compose/ui/graphics/Color;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object v13

    .line 76
    const/16 v17, 0xe

    .line 77
    .line 78
    const/16 v18, 0x0

    .line 79
    .line 80
    const/4 v14, 0x0

    .line 81
    const/4 v15, 0x0

    .line 82
    const/16 v16, 0x0

    .line 83
    .line 84
    invoke-static/range {v12 .. v18}, Landroidx/compose/ui/graphics/Brush$Companion;->verticalGradient-8A-3gB4$default(Landroidx/compose/ui/graphics/Brush$Companion;Ljava/util/List;FFIILjava/lang/Object;)Landroidx/compose/ui/graphics/Brush;

    .line 85
    .line 86
    .line 87
    move-result-object v12

    .line 88
    const/4 v15, 0x6

    .line 89
    const/16 v16, 0x0

    .line 90
    .line 91
    const/4 v13, 0x0

    .line 92
    invoke-static/range {v11 .. v16}, Landroidx/compose/foundation/BackgroundKt;->background$default(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    const/4 v1, 0x0

    .line 97
    const/4 v4, 0x0

    .line 98
    invoke-static {v0, v1, v3, v4}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxHeight$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    const/16 v1, 0x28

    .line 103
    .line 104
    int-to-float v1, v1

    .line 105
    const/16 v3, 0x500

    .line 106
    .line 107
    int-to-float v12, v3

    .line 108
    div-float/2addr v1, v12

    .line 109
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    iget v4, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 118
    .line 119
    iget v3, v3, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 120
    .line 121
    invoke-static {v4, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    int-to-float v3, v3

    .line 126
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    iget v4, v4, Landroid/util/DisplayMetrics;->density:F

    .line 135
    .line 136
    div-float/2addr v3, v4

    .line 137
    mul-float/2addr v1, v3

    .line 138
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/PaddingKt;->padding-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    sget-object v1, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 147
    .line 148
    invoke-virtual {v1}, Landroidx/compose/ui/Alignment$Companion;->getCenterHorizontally()Landroidx/compose/ui/Alignment$Horizontal;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    sget-object v3, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 153
    .line 154
    invoke-virtual {v3}, Landroidx/compose/foundation/layout/Arrangement;->getCenter()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    const/16 v13, 0x36

    .line 159
    .line 160
    invoke-static {v3, v1, v6, v13}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    invoke-static {v6, v2}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    invoke-static {v6, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    sget-object v4, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 177
    .line 178
    invoke-virtual {v4}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 183
    .line 184
    .line 185
    move-result-object v7

    .line 186
    if-nez v7, :cond_2

    .line 187
    .line 188
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 189
    .line 190
    .line 191
    :cond_2
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 192
    .line 193
    .line 194
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 195
    .line 196
    .line 197
    move-result v7

    .line 198
    if-eqz v7, :cond_3

    .line 199
    .line 200
    invoke-interface {v6, v5}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 201
    .line 202
    .line 203
    goto :goto_1

    .line 204
    :cond_3
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 205
    .line 206
    .line 207
    :goto_1
    invoke-static {v6}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 208
    .line 209
    .line 210
    move-result-object v5

    .line 211
    invoke-virtual {v4}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 212
    .line 213
    .line 214
    move-result-object v7

    .line 215
    invoke-static {v5, v1, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v4}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    invoke-static {v5, v3, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v4}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 230
    .line 231
    .line 232
    move-result v3

    .line 233
    if-nez v3, :cond_4

    .line 234
    .line 235
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v3

    .line 239
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 240
    .line 241
    .line 242
    move-result-object v7

    .line 243
    invoke-static {v3, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v3

    .line 247
    if-nez v3, :cond_5

    .line 248
    .line 249
    :cond_4
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 250
    .line 251
    .line 252
    move-result-object v3

    .line 253
    invoke-interface {v5, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    invoke-interface {v5, v2, v1}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 261
    .line 262
    .line 263
    :cond_5
    invoke-virtual {v4}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    invoke-static {v5, v0, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 268
    .line 269
    .line 270
    sget-object v0, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 271
    .line 272
    const v0, 0x7f0800a6

    .line 273
    .line 274
    .line 275
    const/4 v14, 0x6

    .line 276
    invoke-static {v0, v6, v14}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    const/16 v1, 0x40

    .line 281
    .line 282
    int-to-float v1, v1

    .line 283
    div-float/2addr v1, v12

    .line 284
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 289
    .line 290
    .line 291
    move-result-object v2

    .line 292
    iget v3, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 293
    .line 294
    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 295
    .line 296
    invoke-static {v3, v2}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 297
    .line 298
    .line 299
    move-result v2

    .line 300
    int-to-float v2, v2

    .line 301
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 302
    .line 303
    .line 304
    move-result-object v3

    .line 305
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 306
    .line 307
    .line 308
    move-result-object v3

    .line 309
    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    .line 310
    .line 311
    div-float/2addr v2, v3

    .line 312
    mul-float/2addr v1, v2

    .line 313
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 314
    .line 315
    .line 316
    move-result v1

    .line 317
    invoke-static {v11, v1}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 318
    .line 319
    .line 320
    move-result-object v2

    .line 321
    const/16 v8, 0x1b0

    .line 322
    .line 323
    const/16 v9, 0x78

    .line 324
    .line 325
    const-string v1, "\u6210\u529f\u4fee\u6539\u5bc6\u7801"

    .line 326
    .line 327
    const/4 v3, 0x0

    .line 328
    const/4 v4, 0x0

    .line 329
    const/4 v5, 0x0

    .line 330
    const/4 v6, 0x0

    .line 331
    move-object/from16 v7, p1

    .line 332
    .line 333
    invoke-static/range {v0 .. v9}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 334
    .line 335
    .line 336
    move-object v6, v7

    .line 337
    const/16 v0, 0xf

    .line 338
    .line 339
    int-to-float v1, v0

    .line 340
    div-float/2addr v1, v12

    .line 341
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 342
    .line 343
    .line 344
    move-result-object v2

    .line 345
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 346
    .line 347
    .line 348
    move-result-object v2

    .line 349
    iget v3, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 350
    .line 351
    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 352
    .line 353
    invoke-static {v3, v2}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 354
    .line 355
    .line 356
    move-result v2

    .line 357
    int-to-float v2, v2

    .line 358
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 359
    .line 360
    .line 361
    move-result-object v3

    .line 362
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 363
    .line 364
    .line 365
    move-result-object v3

    .line 366
    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    .line 367
    .line 368
    div-float/2addr v2, v3

    .line 369
    mul-float/2addr v1, v2

    .line 370
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 371
    .line 372
    .line 373
    move-result v1

    .line 374
    invoke-static {v11, v1}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 375
    .line 376
    .line 377
    move-result-object v1

    .line 378
    invoke-static {v1, v6, v14}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 379
    .line 380
    .line 381
    sget-object v25, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 382
    .line 383
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 384
    .line 385
    .line 386
    move-result-wide v2

    .line 387
    const/16 v1, 0x10

    .line 388
    .line 389
    invoke-static {v1}, Lo3/a;->a(I)J

    .line 390
    .line 391
    .line 392
    move-result-wide v4

    .line 393
    sget-object v1, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    .line 394
    .line 395
    invoke-virtual {v1}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getMedium()Landroidx/compose/ui/text/font/FontWeight;

    .line 396
    .line 397
    .line 398
    move-result-object v7

    .line 399
    sget-object v1, Landroidx/compose/ui/text/style/TextAlign;->Companion:Landroidx/compose/ui/text/style/TextAlign$Companion;

    .line 400
    .line 401
    invoke-virtual {v1}, Landroidx/compose/ui/text/style/TextAlign$Companion;->getCenter-e0LSkKk()I

    .line 402
    .line 403
    .line 404
    move-result v1

    .line 405
    invoke-static {v1}, Landroidx/compose/ui/text/style/TextAlign;->box-impl(I)Landroidx/compose/ui/text/style/TextAlign;

    .line 406
    .line 407
    .line 408
    move-result-object v1

    .line 409
    const/16 v23, 0x0

    .line 410
    .line 411
    const v24, 0x1fdd2

    .line 412
    .line 413
    .line 414
    move v8, v0

    .line 415
    const-string v0, "\u5bc6\u7801\u91cd\u7f6e\u6210\u529f\uff0c\u8bf7\u4f7f\u7528\u65b0\u5bc6\u7801\u767b\u5f55"

    .line 416
    .line 417
    move v9, v12

    .line 418
    move-object v12, v1

    .line 419
    const/4 v1, 0x0

    .line 420
    const/4 v6, 0x0

    .line 421
    move v15, v8

    .line 422
    const/4 v8, 0x0

    .line 423
    move/from16 v16, v9

    .line 424
    .line 425
    move/from16 v17, v10

    .line 426
    .line 427
    const-wide/16 v9, 0x0

    .line 428
    .line 429
    move-object/from16 v18, v11

    .line 430
    .line 431
    const/4 v11, 0x0

    .line 432
    move/from16 v19, v13

    .line 433
    .line 434
    move/from16 v20, v14

    .line 435
    .line 436
    const-wide/16 v13, 0x0

    .line 437
    .line 438
    move/from16 v21, v15

    .line 439
    .line 440
    const/4 v15, 0x0

    .line 441
    move/from16 v22, v16

    .line 442
    .line 443
    const/16 v16, 0x0

    .line 444
    .line 445
    move/from16 v26, v17

    .line 446
    .line 447
    const/16 v17, 0x0

    .line 448
    .line 449
    move-object/from16 v27, v18

    .line 450
    .line 451
    const/16 v18, 0x0

    .line 452
    .line 453
    move/from16 v28, v19

    .line 454
    .line 455
    const/16 v19, 0x0

    .line 456
    .line 457
    move/from16 v29, v20

    .line 458
    .line 459
    const/16 v20, 0x0

    .line 460
    .line 461
    move/from16 v30, v22

    .line 462
    .line 463
    const v22, 0x30d86

    .line 464
    .line 465
    .line 466
    move/from16 v26, v21

    .line 467
    .line 468
    move-object/from16 v31, v27

    .line 469
    .line 470
    move-object/from16 v21, p1

    .line 471
    .line 472
    invoke-static/range {v0 .. v24}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 473
    .line 474
    .line 475
    move-object/from16 v6, v21

    .line 476
    .line 477
    const/16 v0, 0x3c

    .line 478
    .line 479
    int-to-float v0, v0

    .line 480
    div-float v0, v0, v30

    .line 481
    .line 482
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 483
    .line 484
    .line 485
    move-result-object v1

    .line 486
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 487
    .line 488
    .line 489
    move-result-object v1

    .line 490
    iget v2, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 491
    .line 492
    iget v1, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 493
    .line 494
    invoke-static {v2, v1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 495
    .line 496
    .line 497
    move-result v1

    .line 498
    int-to-float v1, v1

    .line 499
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 500
    .line 501
    .line 502
    move-result-object v2

    .line 503
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 504
    .line 505
    .line 506
    move-result-object v2

    .line 507
    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    .line 508
    .line 509
    div-float/2addr v1, v2

    .line 510
    mul-float/2addr v0, v1

    .line 511
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 512
    .line 513
    .line 514
    move-result v0

    .line 515
    move-object/from16 v11, v31

    .line 516
    .line 517
    invoke-static {v11, v0}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 518
    .line 519
    .line 520
    move-result-object v0

    .line 521
    const/4 v12, 0x6

    .line 522
    invoke-static {v0, v6, v12}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 523
    .line 524
    .line 525
    const/16 v0, 0x82

    .line 526
    .line 527
    int-to-float v0, v0

    .line 528
    div-float v0, v0, v30

    .line 529
    .line 530
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 531
    .line 532
    .line 533
    move-result-object v1

    .line 534
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 535
    .line 536
    .line 537
    move-result-object v1

    .line 538
    iget v2, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 539
    .line 540
    iget v1, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 541
    .line 542
    invoke-static {v2, v1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 543
    .line 544
    .line 545
    move-result v1

    .line 546
    int-to-float v1, v1

    .line 547
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 548
    .line 549
    .line 550
    move-result-object v2

    .line 551
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 552
    .line 553
    .line 554
    move-result-object v2

    .line 555
    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    .line 556
    .line 557
    div-float/2addr v1, v2

    .line 558
    mul-float/2addr v0, v1

    .line 559
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 560
    .line 561
    .line 562
    move-result v0

    .line 563
    invoke-static {v11, v0}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 564
    .line 565
    .line 566
    move-result-object v0

    .line 567
    const/16 v1, 0x2d

    .line 568
    .line 569
    int-to-float v1, v1

    .line 570
    div-float v1, v1, v30

    .line 571
    .line 572
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 573
    .line 574
    .line 575
    move-result-object v2

    .line 576
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 577
    .line 578
    .line 579
    move-result-object v2

    .line 580
    iget v3, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 581
    .line 582
    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 583
    .line 584
    invoke-static {v3, v2}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 585
    .line 586
    .line 587
    move-result v2

    .line 588
    int-to-float v2, v2

    .line 589
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 590
    .line 591
    .line 592
    move-result-object v3

    .line 593
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 594
    .line 595
    .line 596
    move-result-object v3

    .line 597
    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    .line 598
    .line 599
    div-float/2addr v2, v3

    .line 600
    mul-float/2addr v1, v2

    .line 601
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 602
    .line 603
    .line 604
    move-result v1

    .line 605
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 606
    .line 607
    .line 608
    move-result-object v13

    .line 609
    const/4 v0, 0x5

    .line 610
    int-to-float v0, v0

    .line 611
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 612
    .line 613
    .line 614
    move-result v0

    .line 615
    invoke-static {v0}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 616
    .line 617
    .line 618
    move-result-object v14

    .line 619
    sget-object v0, Landroidx/compose/material3/ButtonDefaults;->INSTANCE:Landroidx/compose/material3/ButtonDefaults;

    .line 620
    .line 621
    const-wide v1, 0xff007bffL

    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 627
    .line 628
    .line 629
    move-result-wide v1

    .line 630
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 631
    .line 632
    .line 633
    move-result-wide v3

    .line 634
    sget v15, Landroidx/compose/material3/ButtonDefaults;->$stable:I

    .line 635
    .line 636
    shl-int/lit8 v5, v15, 0xc

    .line 637
    .line 638
    or-int/lit8 v10, v5, 0x36

    .line 639
    .line 640
    const/16 v11, 0xc

    .line 641
    .line 642
    const-wide/16 v5, 0x0

    .line 643
    .line 644
    const-wide/16 v7, 0x0

    .line 645
    .line 646
    move-object/from16 v9, p1

    .line 647
    .line 648
    invoke-virtual/range {v0 .. v11}, Landroidx/compose/material3/ButtonDefaults;->buttonColors-ro_MJ88(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ButtonColors;

    .line 649
    .line 650
    .line 651
    move-result-object v10

    .line 652
    const/4 v1, 0x2

    .line 653
    int-to-float v1, v1

    .line 654
    div-float v1, v1, v30

    .line 655
    .line 656
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 657
    .line 658
    .line 659
    move-result-object v2

    .line 660
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 661
    .line 662
    .line 663
    move-result-object v2

    .line 664
    iget v3, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 665
    .line 666
    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 667
    .line 668
    invoke-static {v3, v2}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 669
    .line 670
    .line 671
    move-result v2

    .line 672
    int-to-float v2, v2

    .line 673
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 674
    .line 675
    .line 676
    move-result-object v3

    .line 677
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 678
    .line 679
    .line 680
    move-result-object v3

    .line 681
    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    .line 682
    .line 683
    div-float/2addr v2, v3

    .line 684
    mul-float/2addr v1, v2

    .line 685
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 686
    .line 687
    .line 688
    move-result v1

    .line 689
    shl-int/lit8 v2, v15, 0xf

    .line 690
    .line 691
    or-int/lit8 v7, v2, 0x6

    .line 692
    .line 693
    const/16 v8, 0x1e

    .line 694
    .line 695
    const/4 v2, 0x0

    .line 696
    const/4 v3, 0x0

    .line 697
    const/4 v4, 0x0

    .line 698
    const/4 v5, 0x0

    .line 699
    move-object/from16 v6, p1

    .line 700
    .line 701
    invoke-virtual/range {v0 .. v8}, Landroidx/compose/material3/ButtonDefaults;->buttonElevation-R_JCAzs(FFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ButtonElevation;

    .line 702
    .line 703
    .line 704
    move-result-object v5

    .line 705
    sget-object v0, Lc4/b;->a:Lc4/b;

    .line 706
    .line 707
    invoke-virtual {v0}, Lc4/b;->b()Lkotlin/jvm/functions/Function3;

    .line 708
    .line 709
    .line 710
    move-result-object v9

    .line 711
    const v11, 0x30000030

    .line 712
    .line 713
    .line 714
    const/16 v12, 0x1c4

    .line 715
    .line 716
    const/4 v2, 0x0

    .line 717
    const/4 v6, 0x0

    .line 718
    const/4 v7, 0x0

    .line 719
    const/4 v8, 0x0

    .line 720
    move-object/from16 v0, p0

    .line 721
    .line 722
    move-object v4, v10

    .line 723
    move-object v1, v13

    .line 724
    move-object v3, v14

    .line 725
    move-object/from16 v10, p1

    .line 726
    .line 727
    invoke-static/range {v0 .. v12}, Landroidx/compose/material3/ButtonKt;->Button(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ButtonColors;Landroidx/compose/material3/ButtonElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    .line 728
    .line 729
    .line 730
    invoke-interface/range {p1 .. p1}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 731
    .line 732
    .line 733
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 734
    .line 735
    .line 736
    move-result v0

    .line 737
    if-eqz v0, :cond_7

    .line 738
    .line 739
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 740
    .line 741
    .line 742
    goto :goto_2

    .line 743
    :cond_6
    invoke-interface/range {p1 .. p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 744
    .line 745
    .line 746
    :cond_7
    :goto_2
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 747
    .line 748
    return-object v0
.end method

.method public static final L(Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lcom/zykj/huiwei/launcher/ui/dialog/Login/ResetPasswordDialogContentKt;->J(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final synthetic M(Landroidx/compose/runtime/State;)Ll4/g;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/Login/ResetPasswordDialogContentKt;->z(Landroidx/compose/runtime/State;)Ll4/g;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic a(Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/huiwei/launcher/ui/dialog/Login/ResetPasswordDialogContentKt;->s(Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/platform/SoftwareKeyboardController;Landroidx/compose/ui/focus/FocusManager;Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/huiwei/launcher/ui/dialog/Login/ResetPasswordDialogContentKt;->u(Landroidx/compose/ui/platform/SoftwareKeyboardController;Landroidx/compose/ui/focus/FocusManager;Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/focus/FocusRequester;Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;Landroidx/compose/ui/platform/SoftwareKeyboardController;Landroidx/compose/ui/focus/FocusManager;Landroidx/compose/runtime/State;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lcom/zykj/huiwei/launcher/ui/dialog/Login/ResetPasswordDialogContentKt;->r(Landroidx/compose/ui/focus/FocusRequester;Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;Landroidx/compose/ui/platform/SoftwareKeyboardController;Landroidx/compose/ui/focus/FocusManager;Landroidx/compose/runtime/State;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/huiwei/launcher/ui/dialog/Login/ResetPasswordDialogContentKt;->L(Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function0;Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;Landroidx/compose/animation/AnimatedContentScope;ZLandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/zykj/huiwei/launcher/ui/dialog/Login/ResetPasswordDialogContentKt;->A(Lkotlin/jvm/functions/Function0;Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;Landroidx/compose/animation/AnimatedContentScope;ZLandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/huiwei/launcher/ui/dialog/Login/ResetPasswordDialogContentKt;->E(Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/huiwei/launcher/ui/dialog/Login/ResetPasswordDialogContentKt;->t(Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;ZLjava/lang/String;IIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p11}, Lcom/zykj/huiwei/launcher/ui/dialog/Login/ResetPasswordDialogContentKt;->I(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;ZLjava/lang/String;IIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(ZLjava/lang/String;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/huiwei/launcher/ui/dialog/Login/ResetPasswordDialogContentKt;->G(ZLjava/lang/String;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(ILkotlin/jvm/functions/Function1;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/huiwei/launcher/ui/dialog/Login/ResetPasswordDialogContentKt;->D(ILkotlin/jvm/functions/Function1;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/huiwei/launcher/ui/dialog/Login/ResetPasswordDialogContentKt;->w(Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/huiwei/launcher/ui/dialog/Login/ResetPasswordDialogContentKt;->F(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Ljava/lang/String;Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/huiwei/launcher/ui/dialog/Login/ResetPasswordDialogContentKt;->H(Ljava/lang/String;Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/zykj/huiwei/launcher/ui/dialog/Login/ResetPasswordDialogContentKt;->B(Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Landroidx/compose/runtime/State;Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/huiwei/launcher/ui/dialog/Login/ResetPasswordDialogContentKt;->v(Landroidx/compose/runtime/State;Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/huiwei/launcher/ui/dialog/Login/ResetPasswordDialogContentKt;->K(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final q(Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;Landroidx/compose/runtime/Composer;I)V
    .locals 25

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move/from16 v6, p2

    .line 4
    .line 5
    const-string v0, "viewModel"

    .line 6
    .line 7
    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const v0, -0x7cac9bcc

    .line 11
    .line 12
    .line 13
    move-object/from16 v1, p1

    .line 14
    .line 15
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 16
    .line 17
    .line 18
    move-result-object v11

    .line 19
    and-int/lit8 v1, v6, 0x6

    .line 20
    .line 21
    const/4 v3, 0x2

    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    const/4 v1, 0x4

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v1, v3

    .line 33
    :goto_0
    or-int/2addr v1, v6

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move v1, v6

    .line 36
    :goto_1
    and-int/lit8 v4, v1, 0x3

    .line 37
    .line 38
    const/4 v5, 0x0

    .line 39
    const/4 v14, 0x1

    .line 40
    if-eq v4, v3, :cond_2

    .line 41
    .line 42
    move v3, v14

    .line 43
    goto :goto_2

    .line 44
    :cond_2
    move v3, v5

    .line 45
    :goto_2
    and-int/lit8 v4, v1, 0x1

    .line 46
    .line 47
    invoke-interface {v11, v3, v4}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_5

    .line 52
    .line 53
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_3

    .line 58
    .line 59
    const/4 v3, -0x1

    .line 60
    const-string v4, "com.zykj.huiwei.launcher.ui.dialog.Login.ResetInputView (ResetPasswordDialogContent.kt:172)"

    .line 61
    .line 62
    invoke-static {v0, v1, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 63
    .line 64
    .line 65
    :cond_3
    invoke-virtual {v2}, Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;->c()Lkotlinx/coroutines/flow/StateFlow;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    const/4 v12, 0x0

    .line 70
    const/4 v13, 0x7

    .line 71
    const/4 v8, 0x0

    .line 72
    const/4 v9, 0x0

    .line 73
    const/4 v10, 0x0

    .line 74
    invoke-static/range {v7 .. v13}, Landroidx/lifecycle/compose/FlowExtKt;->collectAsStateWithLifecycle(Lkotlinx/coroutines/flow/StateFlow;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 83
    .line 84
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    if-ne v1, v3, :cond_4

    .line 89
    .line 90
    new-instance v1, Landroidx/compose/ui/focus/FocusRequester;

    .line 91
    .line 92
    invoke-direct {v1}, Landroidx/compose/ui/focus/FocusRequester;-><init>()V

    .line 93
    .line 94
    .line 95
    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    :cond_4
    check-cast v1, Landroidx/compose/ui/focus/FocusRequester;

    .line 99
    .line 100
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalSoftwareKeyboardController()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    check-cast v3, Landroidx/compose/ui/platform/SoftwareKeyboardController;

    .line 109
    .line 110
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalFocusManager()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    invoke-interface {v11, v4}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    check-cast v4, Landroidx/compose/ui/focus/FocusManager;

    .line 119
    .line 120
    sget-object v7, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 121
    .line 122
    const/16 v8, 0x258

    .line 123
    .line 124
    int-to-float v8, v8

    .line 125
    const/16 v9, 0x500

    .line 126
    .line 127
    int-to-float v9, v9

    .line 128
    div-float/2addr v8, v9

    .line 129
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 130
    .line 131
    .line 132
    move-result-object v10

    .line 133
    invoke-virtual {v10}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 134
    .line 135
    .line 136
    move-result-object v10

    .line 137
    iget v12, v10, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 138
    .line 139
    iget v10, v10, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 140
    .line 141
    invoke-static {v12, v10}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 142
    .line 143
    .line 144
    move-result v10

    .line 145
    int-to-float v10, v10

    .line 146
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 147
    .line 148
    .line 149
    move-result-object v12

    .line 150
    invoke-virtual {v12}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 151
    .line 152
    .line 153
    move-result-object v12

    .line 154
    iget v12, v12, Landroid/util/DisplayMetrics;->density:F

    .line 155
    .line 156
    div-float/2addr v10, v12

    .line 157
    mul-float/2addr v8, v10

    .line 158
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 159
    .line 160
    .line 161
    move-result v8

    .line 162
    invoke-static {v7, v8}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 163
    .line 164
    .line 165
    move-result-object v7

    .line 166
    const/4 v8, 0x0

    .line 167
    const/4 v10, 0x3

    .line 168
    invoke-static {v7, v8, v5, v10, v8}, Landroidx/compose/foundation/layout/SizeKt;->wrapContentHeight$default(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment$Vertical;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 169
    .line 170
    .line 171
    move-result-object v15

    .line 172
    const/16 v5, 0xa

    .line 173
    .line 174
    int-to-float v5, v5

    .line 175
    div-float/2addr v5, v9

    .line 176
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 177
    .line 178
    .line 179
    move-result-object v7

    .line 180
    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 181
    .line 182
    .line 183
    move-result-object v7

    .line 184
    iget v8, v7, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 185
    .line 186
    iget v7, v7, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 187
    .line 188
    invoke-static {v8, v7}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 189
    .line 190
    .line 191
    move-result v7

    .line 192
    int-to-float v7, v7

    .line 193
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 194
    .line 195
    .line 196
    move-result-object v8

    .line 197
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 198
    .line 199
    .line 200
    move-result-object v8

    .line 201
    iget v8, v8, Landroid/util/DisplayMetrics;->density:F

    .line 202
    .line 203
    div-float/2addr v7, v8

    .line 204
    mul-float/2addr v5, v7

    .line 205
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 206
    .line 207
    .line 208
    move-result v16

    .line 209
    const/16 v5, 0xc

    .line 210
    .line 211
    int-to-float v5, v5

    .line 212
    div-float/2addr v5, v9

    .line 213
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 214
    .line 215
    .line 216
    move-result-object v7

    .line 217
    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 218
    .line 219
    .line 220
    move-result-object v7

    .line 221
    iget v8, v7, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 222
    .line 223
    iget v7, v7, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 224
    .line 225
    invoke-static {v8, v7}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 226
    .line 227
    .line 228
    move-result v7

    .line 229
    int-to-float v7, v7

    .line 230
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 231
    .line 232
    .line 233
    move-result-object v8

    .line 234
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 235
    .line 236
    .line 237
    move-result-object v8

    .line 238
    iget v8, v8, Landroid/util/DisplayMetrics;->density:F

    .line 239
    .line 240
    div-float/2addr v7, v8

    .line 241
    mul-float/2addr v7, v5

    .line 242
    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 243
    .line 244
    .line 245
    move-result v7

    .line 246
    invoke-static {v7}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 247
    .line 248
    .line 249
    move-result-object v17

    .line 250
    const/16 v23, 0x1c

    .line 251
    .line 252
    const/16 v24, 0x0

    .line 253
    .line 254
    const/16 v18, 0x0

    .line 255
    .line 256
    const-wide/16 v19, 0x0

    .line 257
    .line 258
    const-wide/16 v21, 0x0

    .line 259
    .line 260
    invoke-static/range {v15 .. v24}, Landroidx/compose/ui/draw/ShadowKt;->shadow-s4CzXII$default(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;ZJJILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 261
    .line 262
    .line 263
    move-result-object v7

    .line 264
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 265
    .line 266
    .line 267
    move-result-object v8

    .line 268
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 269
    .line 270
    .line 271
    move-result-object v8

    .line 272
    iget v9, v8, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 273
    .line 274
    iget v8, v8, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 275
    .line 276
    invoke-static {v9, v8}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 277
    .line 278
    .line 279
    move-result v8

    .line 280
    int-to-float v8, v8

    .line 281
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 282
    .line 283
    .line 284
    move-result-object v9

    .line 285
    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 286
    .line 287
    .line 288
    move-result-object v9

    .line 289
    iget v9, v9, Landroid/util/DisplayMetrics;->density:F

    .line 290
    .line 291
    div-float/2addr v8, v9

    .line 292
    mul-float/2addr v5, v8

    .line 293
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 294
    .line 295
    .line 296
    move-result v5

    .line 297
    invoke-static {v5}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 298
    .line 299
    .line 300
    move-result-object v8

    .line 301
    sget-object v5, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 302
    .line 303
    invoke-virtual {v5}, Landroidx/compose/ui/graphics/Color$Companion;->getTransparent-0d7_KjU()J

    .line 304
    .line 305
    .line 306
    move-result-wide v9

    .line 307
    move-object v5, v0

    .line 308
    new-instance v0, Lc4/m;

    .line 309
    .line 310
    invoke-direct/range {v0 .. v5}, Lc4/m;-><init>(Landroidx/compose/ui/focus/FocusRequester;Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;Landroidx/compose/ui/platform/SoftwareKeyboardController;Landroidx/compose/ui/focus/FocusManager;Landroidx/compose/runtime/State;)V

    .line 311
    .line 312
    .line 313
    const/16 v1, 0x36

    .line 314
    .line 315
    const v3, -0x3537feb1    # -6553767.5f

    .line 316
    .line 317
    .line 318
    invoke-static {v3, v14, v0, v11, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 319
    .line 320
    .line 321
    move-result-object v16

    .line 322
    const v18, 0xc00180

    .line 323
    .line 324
    .line 325
    const/16 v19, 0x78

    .line 326
    .line 327
    move-object/from16 v17, v11

    .line 328
    .line 329
    const-wide/16 v11, 0x0

    .line 330
    .line 331
    const/4 v13, 0x0

    .line 332
    const/4 v14, 0x0

    .line 333
    const/4 v15, 0x0

    .line 334
    invoke-static/range {v7 .. v19}, Landroidx/compose/material3/SurfaceKt;->Surface-T9BRK9s(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    .line 335
    .line 336
    .line 337
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 338
    .line 339
    .line 340
    move-result v0

    .line 341
    if-eqz v0, :cond_6

    .line 342
    .line 343
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 344
    .line 345
    .line 346
    goto :goto_3

    .line 347
    :cond_5
    move-object/from16 v17, v11

    .line 348
    .line 349
    invoke-interface/range {v17 .. v17}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 350
    .line 351
    .line 352
    :cond_6
    :goto_3
    invoke-interface/range {v17 .. v17}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    if-eqz v0, :cond_7

    .line 357
    .line 358
    new-instance v1, Lc4/n;

    .line 359
    .line 360
    invoke-direct {v1, v2, v6}, Lc4/n;-><init>(Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;I)V

    .line 361
    .line 362
    .line 363
    invoke-interface {v0, v1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 364
    .line 365
    .line 366
    :cond_7
    return-void
.end method

.method public static final r(Landroidx/compose/ui/focus/FocusRequester;Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;Landroidx/compose/ui/platform/SoftwareKeyboardController;Landroidx/compose/ui/focus/FocusManager;Landroidx/compose/runtime/State;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 33

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v11, p5

    .line 4
    .line 5
    move/from16 v3, p6

    .line 6
    .line 7
    and-int/lit8 v4, v3, 0x3

    .line 8
    .line 9
    const/4 v5, 0x2

    .line 10
    const/4 v6, 0x0

    .line 11
    const/4 v7, 0x1

    .line 12
    if-eq v4, v5, :cond_0

    .line 13
    .line 14
    move v4, v7

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v4, v6

    .line 17
    :goto_0
    and-int/lit8 v5, v3, 0x1

    .line 18
    .line 19
    invoke-interface {v11, v4, v5}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-eqz v4, :cond_d

    .line 24
    .line 25
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_1

    .line 30
    .line 31
    const/4 v4, -0x1

    .line 32
    const-string v5, "com.zykj.huiwei.launcher.ui.dialog.Login.ResetInputView.<anonymous> (ResetPasswordDialogContent.kt:188)"

    .line 33
    .line 34
    const v8, -0x3537feb1    # -6553767.5f

    .line 35
    .line 36
    .line 37
    invoke-static {v8, v3, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    sget-object v12, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 41
    .line 42
    sget-object v13, Landroidx/compose/ui/graphics/Brush;->Companion:Landroidx/compose/ui/graphics/Brush$Companion;

    .line 43
    .line 44
    const-wide v3, 0xff252d46L

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    invoke-static {v3, v4}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 50
    .line 51
    .line 52
    move-result-wide v3

    .line 53
    invoke-static {v3, v4}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    const-wide v4, 0xff20283fL

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    invoke-static {v4, v5}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 63
    .line 64
    .line 65
    move-result-wide v4

    .line 66
    invoke-static {v4, v5}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    filled-new-array {v3, v4}, [Landroidx/compose/ui/graphics/Color;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object v14

    .line 78
    const/16 v18, 0xe

    .line 79
    .line 80
    const/16 v19, 0x0

    .line 81
    .line 82
    const/4 v15, 0x0

    .line 83
    const/16 v16, 0x0

    .line 84
    .line 85
    const/16 v17, 0x0

    .line 86
    .line 87
    invoke-static/range {v13 .. v19}, Landroidx/compose/ui/graphics/Brush$Companion;->verticalGradient-8A-3gB4$default(Landroidx/compose/ui/graphics/Brush$Companion;Ljava/util/List;FFIILjava/lang/Object;)Landroidx/compose/ui/graphics/Brush;

    .line 88
    .line 89
    .line 90
    move-result-object v13

    .line 91
    const/16 v16, 0x6

    .line 92
    .line 93
    const/16 v17, 0x0

    .line 94
    .line 95
    const/4 v14, 0x0

    .line 96
    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/BackgroundKt;->background$default(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    const/16 v4, 0x28

    .line 101
    .line 102
    int-to-float v4, v4

    .line 103
    const/16 v5, 0x500

    .line 104
    .line 105
    int-to-float v5, v5

    .line 106
    div-float/2addr v4, v5

    .line 107
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 112
    .line 113
    .line 114
    move-result-object v8

    .line 115
    iget v9, v8, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 116
    .line 117
    iget v8, v8, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 118
    .line 119
    invoke-static {v9, v8}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 120
    .line 121
    .line 122
    move-result v8

    .line 123
    int-to-float v8, v8

    .line 124
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 125
    .line 126
    .line 127
    move-result-object v9

    .line 128
    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 129
    .line 130
    .line 131
    move-result-object v9

    .line 132
    iget v9, v9, Landroid/util/DisplayMetrics;->density:F

    .line 133
    .line 134
    div-float/2addr v8, v9

    .line 135
    mul-float/2addr v4, v8

    .line 136
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/PaddingKt;->padding-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    invoke-static {v3}, Landroidx/compose/foundation/layout/WindowInsetsPadding_androidKt;->imePadding(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    sget-object v4, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 149
    .line 150
    invoke-virtual {v4}, Landroidx/compose/ui/Alignment$Companion;->getCenterHorizontally()Landroidx/compose/ui/Alignment$Horizontal;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    sget-object v8, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 155
    .line 156
    invoke-virtual {v8}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 157
    .line 158
    .line 159
    move-result-object v8

    .line 160
    const/16 v9, 0x30

    .line 161
    .line 162
    invoke-static {v8, v4, v11, v9}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 163
    .line 164
    .line 165
    move-result-object v4

    .line 166
    invoke-static {v11, v6}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 167
    .line 168
    .line 169
    move-result v8

    .line 170
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 171
    .line 172
    .line 173
    move-result-object v9

    .line 174
    invoke-static {v11, v3}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    sget-object v10, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 179
    .line 180
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 181
    .line 182
    .line 183
    move-result-object v13

    .line 184
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 185
    .line 186
    .line 187
    move-result-object v14

    .line 188
    if-nez v14, :cond_2

    .line 189
    .line 190
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 191
    .line 192
    .line 193
    :cond_2
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 194
    .line 195
    .line 196
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 197
    .line 198
    .line 199
    move-result v14

    .line 200
    if-eqz v14, :cond_3

    .line 201
    .line 202
    invoke-interface {v11, v13}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 203
    .line 204
    .line 205
    goto :goto_1

    .line 206
    :cond_3
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 207
    .line 208
    .line 209
    :goto_1
    invoke-static {v11}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 210
    .line 211
    .line 212
    move-result-object v13

    .line 213
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 214
    .line 215
    .line 216
    move-result-object v14

    .line 217
    invoke-static {v13, v4, v14}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    invoke-static {v13, v9, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 228
    .line 229
    .line 230
    move-result-object v4

    .line 231
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 232
    .line 233
    .line 234
    move-result v9

    .line 235
    if-nez v9, :cond_4

    .line 236
    .line 237
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v9

    .line 241
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 242
    .line 243
    .line 244
    move-result-object v14

    .line 245
    invoke-static {v9, v14}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result v9

    .line 249
    if-nez v9, :cond_5

    .line 250
    .line 251
    :cond_4
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 252
    .line 253
    .line 254
    move-result-object v9

    .line 255
    invoke-interface {v13, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 259
    .line 260
    .line 261
    move-result-object v8

    .line 262
    invoke-interface {v13, v8, v4}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 263
    .line 264
    .line 265
    :cond_5
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 266
    .line 267
    .line 268
    move-result-object v4

    .line 269
    invoke-static {v13, v3, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 270
    .line 271
    .line 272
    sget-object v3, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 273
    .line 274
    sget-object v3, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 275
    .line 276
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 277
    .line 278
    .line 279
    move-result-wide v3

    .line 280
    const/16 v8, 0x12

    .line 281
    .line 282
    invoke-static {v8}, Lo3/a;->a(I)J

    .line 283
    .line 284
    .line 285
    move-result-wide v8

    .line 286
    sget-object v10, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    .line 287
    .line 288
    invoke-virtual {v10}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    .line 289
    .line 290
    .line 291
    move-result-object v10

    .line 292
    const/16 v26, 0x0

    .line 293
    .line 294
    const v27, 0x1ffd2

    .line 295
    .line 296
    .line 297
    move v13, v6

    .line 298
    move-wide/from16 v31, v3

    .line 299
    .line 300
    move v4, v5

    .line 301
    move-wide/from16 v5, v31

    .line 302
    .line 303
    const-string v3, "\u91cd\u7f6e\u5bc6\u7801"

    .line 304
    .line 305
    move v14, v4

    .line 306
    const/4 v4, 0x0

    .line 307
    move v15, v7

    .line 308
    move-wide v7, v8

    .line 309
    const/4 v9, 0x0

    .line 310
    const/4 v11, 0x0

    .line 311
    move-object/from16 v16, v12

    .line 312
    .line 313
    move/from16 v17, v13

    .line 314
    .line 315
    const-wide/16 v12, 0x0

    .line 316
    .line 317
    move/from16 v18, v14

    .line 318
    .line 319
    const/4 v14, 0x0

    .line 320
    move/from16 v19, v15

    .line 321
    .line 322
    const/4 v15, 0x0

    .line 323
    move-object/from16 v20, v16

    .line 324
    .line 325
    move/from16 v21, v17

    .line 326
    .line 327
    const-wide/16 v16, 0x0

    .line 328
    .line 329
    move/from16 v22, v18

    .line 330
    .line 331
    const/16 v18, 0x0

    .line 332
    .line 333
    move/from16 v23, v19

    .line 334
    .line 335
    const/16 v19, 0x0

    .line 336
    .line 337
    move-object/from16 v24, v20

    .line 338
    .line 339
    const/16 v20, 0x0

    .line 340
    .line 341
    move/from16 v25, v21

    .line 342
    .line 343
    const/16 v21, 0x0

    .line 344
    .line 345
    move/from16 v28, v22

    .line 346
    .line 347
    const/16 v22, 0x0

    .line 348
    .line 349
    move/from16 v29, v23

    .line 350
    .line 351
    const/16 v23, 0x0

    .line 352
    .line 353
    move/from16 v30, v25

    .line 354
    .line 355
    const v25, 0x30d86

    .line 356
    .line 357
    .line 358
    move-object/from16 v2, v24

    .line 359
    .line 360
    move/from16 v1, v29

    .line 361
    .line 362
    move-object/from16 v24, p5

    .line 363
    .line 364
    invoke-static/range {v3 .. v27}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 365
    .line 366
    .line 367
    move-object/from16 v11, v24

    .line 368
    .line 369
    const/16 v3, 0x14

    .line 370
    .line 371
    int-to-float v3, v3

    .line 372
    div-float v3, v3, v28

    .line 373
    .line 374
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 375
    .line 376
    .line 377
    move-result-object v4

    .line 378
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 379
    .line 380
    .line 381
    move-result-object v4

    .line 382
    iget v5, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 383
    .line 384
    iget v4, v4, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 385
    .line 386
    invoke-static {v5, v4}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 387
    .line 388
    .line 389
    move-result v4

    .line 390
    int-to-float v4, v4

    .line 391
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 392
    .line 393
    .line 394
    move-result-object v5

    .line 395
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 396
    .line 397
    .line 398
    move-result-object v5

    .line 399
    iget v5, v5, Landroid/util/DisplayMetrics;->density:F

    .line 400
    .line 401
    div-float/2addr v4, v5

    .line 402
    mul-float/2addr v3, v4

    .line 403
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 404
    .line 405
    .line 406
    move-result v3

    .line 407
    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 408
    .line 409
    .line 410
    move-result-object v3

    .line 411
    const/4 v14, 0x6

    .line 412
    invoke-static {v3, v11, v14}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 413
    .line 414
    .line 415
    move-object/from16 v3, p0

    .line 416
    .line 417
    invoke-static {v2, v3}, Landroidx/compose/ui/focus/FocusRequesterModifierKt;->focusRequester(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/focus/FocusRequester;)Landroidx/compose/ui/Modifier;

    .line 418
    .line 419
    .line 420
    move-result-object v3

    .line 421
    const v4, 0x7f110157

    .line 422
    .line 423
    .line 424
    invoke-static {v4, v11, v14}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v4

    .line 428
    invoke-static/range {p4 .. p4}, Lcom/zykj/huiwei/launcher/ui/dialog/Login/ResetPasswordDialogContentKt;->x(Landroidx/compose/runtime/State;)Ll4/g;

    .line 429
    .line 430
    .line 431
    move-result-object v5

    .line 432
    invoke-virtual {v5}, Ll4/g;->g()Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object v5

    .line 436
    invoke-static/range {p4 .. p4}, Lcom/zykj/huiwei/launcher/ui/dialog/Login/ResetPasswordDialogContentKt;->x(Landroidx/compose/runtime/State;)Ll4/g;

    .line 437
    .line 438
    .line 439
    move-result-object v6

    .line 440
    invoke-virtual {v6}, Ll4/g;->e()Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;

    .line 441
    .line 442
    .line 443
    move-result-object v7

    .line 444
    invoke-static/range {p4 .. p4}, Lcom/zykj/huiwei/launcher/ui/dialog/Login/ResetPasswordDialogContentKt;->x(Landroidx/compose/runtime/State;)Ll4/g;

    .line 445
    .line 446
    .line 447
    move-result-object v6

    .line 448
    invoke-virtual {v6}, Ll4/g;->i()Z

    .line 449
    .line 450
    .line 451
    move-result v8

    .line 452
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 453
    .line 454
    .line 455
    move-result v6

    .line 456
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v9

    .line 460
    if-nez v6, :cond_6

    .line 461
    .line 462
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 463
    .line 464
    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v6

    .line 468
    if-ne v9, v6, :cond_7

    .line 469
    .line 470
    :cond_6
    new-instance v9, Lc4/o;

    .line 471
    .line 472
    invoke-direct {v9, v0}, Lc4/o;-><init>(Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;)V

    .line 473
    .line 474
    .line 475
    invoke-interface {v11, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 476
    .line 477
    .line 478
    :cond_7
    move-object v6, v9

    .line 479
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 480
    .line 481
    const/4 v12, 0x0

    .line 482
    const/16 v13, 0xc0

    .line 483
    .line 484
    const/4 v9, 0x0

    .line 485
    const/4 v10, 0x0

    .line 486
    invoke-static/range {v3 .. v13}, Lcom/zykj/huiwei/launcher/ui/dialog/Login/ResetPasswordDialogContentKt;->C(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;ZLjava/lang/String;ILandroidx/compose/runtime/Composer;II)V

    .line 487
    .line 488
    .line 489
    const/16 v3, 0x1e

    .line 490
    .line 491
    int-to-float v3, v3

    .line 492
    div-float v3, v3, v28

    .line 493
    .line 494
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 495
    .line 496
    .line 497
    move-result-object v4

    .line 498
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 499
    .line 500
    .line 501
    move-result-object v4

    .line 502
    iget v5, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 503
    .line 504
    iget v4, v4, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 505
    .line 506
    invoke-static {v5, v4}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 507
    .line 508
    .line 509
    move-result v4

    .line 510
    int-to-float v4, v4

    .line 511
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 512
    .line 513
    .line 514
    move-result-object v5

    .line 515
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 516
    .line 517
    .line 518
    move-result-object v5

    .line 519
    iget v5, v5, Landroid/util/DisplayMetrics;->density:F

    .line 520
    .line 521
    div-float/2addr v4, v5

    .line 522
    mul-float/2addr v3, v4

    .line 523
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 524
    .line 525
    .line 526
    move-result v3

    .line 527
    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 528
    .line 529
    .line 530
    move-result-object v3

    .line 531
    invoke-static {v3, v11, v14}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 532
    .line 533
    .line 534
    const/4 v3, 0x0

    .line 535
    const/4 v4, 0x0

    .line 536
    invoke-static {v2, v3, v1, v4}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 537
    .line 538
    .line 539
    move-result-object v3

    .line 540
    const v4, 0x7f11019c

    .line 541
    .line 542
    .line 543
    invoke-static {v4, v11, v14}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 544
    .line 545
    .line 546
    move-result-object v4

    .line 547
    invoke-static/range {p4 .. p4}, Lcom/zykj/huiwei/launcher/ui/dialog/Login/ResetPasswordDialogContentKt;->x(Landroidx/compose/runtime/State;)Ll4/g;

    .line 548
    .line 549
    .line 550
    move-result-object v5

    .line 551
    invoke-virtual {v5}, Ll4/g;->d()Ljava/lang/String;

    .line 552
    .line 553
    .line 554
    move-result-object v5

    .line 555
    invoke-static/range {p4 .. p4}, Lcom/zykj/huiwei/launcher/ui/dialog/Login/ResetPasswordDialogContentKt;->x(Landroidx/compose/runtime/State;)Ll4/g;

    .line 556
    .line 557
    .line 558
    move-result-object v6

    .line 559
    invoke-virtual {v6}, Ll4/g;->e()Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;

    .line 560
    .line 561
    .line 562
    move-result-object v7

    .line 563
    invoke-static/range {p4 .. p4}, Lcom/zykj/huiwei/launcher/ui/dialog/Login/ResetPasswordDialogContentKt;->x(Landroidx/compose/runtime/State;)Ll4/g;

    .line 564
    .line 565
    .line 566
    move-result-object v6

    .line 567
    invoke-virtual {v6}, Ll4/g;->h()Z

    .line 568
    .line 569
    .line 570
    move-result v8

    .line 571
    invoke-static/range {p4 .. p4}, Lcom/zykj/huiwei/launcher/ui/dialog/Login/ResetPasswordDialogContentKt;->x(Landroidx/compose/runtime/State;)Ll4/g;

    .line 572
    .line 573
    .line 574
    move-result-object v6

    .line 575
    invoke-virtual {v6}, Ll4/g;->c()Ljava/lang/String;

    .line 576
    .line 577
    .line 578
    move-result-object v9

    .line 579
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 580
    .line 581
    .line 582
    move-result v6

    .line 583
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 584
    .line 585
    .line 586
    move-result-object v10

    .line 587
    if-nez v6, :cond_8

    .line 588
    .line 589
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 590
    .line 591
    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 592
    .line 593
    .line 594
    move-result-object v6

    .line 595
    if-ne v10, v6, :cond_9

    .line 596
    .line 597
    :cond_8
    new-instance v10, Lc4/p;

    .line 598
    .line 599
    invoke-direct {v10, v0}, Lc4/p;-><init>(Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;)V

    .line 600
    .line 601
    .line 602
    invoke-interface {v11, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 603
    .line 604
    .line 605
    :cond_9
    move-object v6, v10

    .line 606
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 607
    .line 608
    const/4 v12, 0x6

    .line 609
    const/16 v13, 0x80

    .line 610
    .line 611
    const/4 v10, 0x0

    .line 612
    invoke-static/range {v3 .. v13}, Lcom/zykj/huiwei/launcher/ui/dialog/Login/ResetPasswordDialogContentKt;->C(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;ZLjava/lang/String;ILandroidx/compose/runtime/Composer;II)V

    .line 613
    .line 614
    .line 615
    const/16 v3, 0x23

    .line 616
    .line 617
    int-to-float v3, v3

    .line 618
    div-float v3, v3, v28

    .line 619
    .line 620
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 621
    .line 622
    .line 623
    move-result-object v4

    .line 624
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 625
    .line 626
    .line 627
    move-result-object v4

    .line 628
    iget v5, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 629
    .line 630
    iget v4, v4, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 631
    .line 632
    invoke-static {v5, v4}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 633
    .line 634
    .line 635
    move-result v4

    .line 636
    int-to-float v4, v4

    .line 637
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 638
    .line 639
    .line 640
    move-result-object v5

    .line 641
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 642
    .line 643
    .line 644
    move-result-object v5

    .line 645
    iget v5, v5, Landroid/util/DisplayMetrics;->density:F

    .line 646
    .line 647
    div-float/2addr v4, v5

    .line 648
    mul-float/2addr v3, v4

    .line 649
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 650
    .line 651
    .line 652
    move-result v3

    .line 653
    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 654
    .line 655
    .line 656
    move-result-object v3

    .line 657
    invoke-static {v3, v11, v14}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 658
    .line 659
    .line 660
    move-object/from16 v3, p2

    .line 661
    .line 662
    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 663
    .line 664
    .line 665
    move-result v4

    .line 666
    move-object/from16 v5, p3

    .line 667
    .line 668
    invoke-interface {v11, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 669
    .line 670
    .line 671
    move-result v6

    .line 672
    or-int/2addr v4, v6

    .line 673
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 674
    .line 675
    .line 676
    move-result v6

    .line 677
    or-int/2addr v4, v6

    .line 678
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 679
    .line 680
    .line 681
    move-result-object v6

    .line 682
    if-nez v4, :cond_a

    .line 683
    .line 684
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 685
    .line 686
    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 687
    .line 688
    .line 689
    move-result-object v4

    .line 690
    if-ne v6, v4, :cond_b

    .line 691
    .line 692
    :cond_a
    new-instance v6, Lc4/q;

    .line 693
    .line 694
    invoke-direct {v6, v3, v5, v0}, Lc4/q;-><init>(Landroidx/compose/ui/platform/SoftwareKeyboardController;Landroidx/compose/ui/focus/FocusManager;Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;)V

    .line 695
    .line 696
    .line 697
    invoke-interface {v11, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 698
    .line 699
    .line 700
    :cond_b
    move-object v12, v6

    .line 701
    check-cast v12, Lkotlin/jvm/functions/Function0;

    .line 702
    .line 703
    const/16 v0, 0x82

    .line 704
    .line 705
    int-to-float v0, v0

    .line 706
    div-float v0, v0, v28

    .line 707
    .line 708
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 709
    .line 710
    .line 711
    move-result-object v3

    .line 712
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 713
    .line 714
    .line 715
    move-result-object v3

    .line 716
    iget v4, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 717
    .line 718
    iget v3, v3, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 719
    .line 720
    invoke-static {v4, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 721
    .line 722
    .line 723
    move-result v3

    .line 724
    int-to-float v3, v3

    .line 725
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 726
    .line 727
    .line 728
    move-result-object v4

    .line 729
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 730
    .line 731
    .line 732
    move-result-object v4

    .line 733
    iget v4, v4, Landroid/util/DisplayMetrics;->density:F

    .line 734
    .line 735
    div-float/2addr v3, v4

    .line 736
    mul-float/2addr v0, v3

    .line 737
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 738
    .line 739
    .line 740
    move-result v0

    .line 741
    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 742
    .line 743
    .line 744
    move-result-object v0

    .line 745
    const/16 v2, 0x2d

    .line 746
    .line 747
    int-to-float v2, v2

    .line 748
    div-float v2, v2, v28

    .line 749
    .line 750
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 751
    .line 752
    .line 753
    move-result-object v3

    .line 754
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 755
    .line 756
    .line 757
    move-result-object v3

    .line 758
    iget v4, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 759
    .line 760
    iget v3, v3, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 761
    .line 762
    invoke-static {v4, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 763
    .line 764
    .line 765
    move-result v3

    .line 766
    int-to-float v3, v3

    .line 767
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 768
    .line 769
    .line 770
    move-result-object v4

    .line 771
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 772
    .line 773
    .line 774
    move-result-object v4

    .line 775
    iget v4, v4, Landroid/util/DisplayMetrics;->density:F

    .line 776
    .line 777
    div-float/2addr v3, v4

    .line 778
    mul-float/2addr v2, v3

    .line 779
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 780
    .line 781
    .line 782
    move-result v2

    .line 783
    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 784
    .line 785
    .line 786
    move-result-object v13

    .line 787
    invoke-static/range {p4 .. p4}, Lcom/zykj/huiwei/launcher/ui/dialog/Login/ResetPasswordDialogContentKt;->x(Landroidx/compose/runtime/State;)Ll4/g;

    .line 788
    .line 789
    .line 790
    move-result-object v0

    .line 791
    invoke-virtual {v0}, Ll4/g;->k()Z

    .line 792
    .line 793
    .line 794
    move-result v0

    .line 795
    if-eqz v0, :cond_c

    .line 796
    .line 797
    invoke-static/range {p4 .. p4}, Lcom/zykj/huiwei/launcher/ui/dialog/Login/ResetPasswordDialogContentKt;->x(Landroidx/compose/runtime/State;)Ll4/g;

    .line 798
    .line 799
    .line 800
    move-result-object v0

    .line 801
    invoke-virtual {v0}, Ll4/g;->j()Z

    .line 802
    .line 803
    .line 804
    move-result v0

    .line 805
    if-nez v0, :cond_c

    .line 806
    .line 807
    move/from16 v30, v1

    .line 808
    .line 809
    :cond_c
    const/4 v0, 0x5

    .line 810
    int-to-float v0, v0

    .line 811
    div-float v0, v0, v28

    .line 812
    .line 813
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 814
    .line 815
    .line 816
    move-result-object v2

    .line 817
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 818
    .line 819
    .line 820
    move-result-object v2

    .line 821
    iget v3, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 822
    .line 823
    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 824
    .line 825
    invoke-static {v3, v2}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 826
    .line 827
    .line 828
    move-result v2

    .line 829
    int-to-float v2, v2

    .line 830
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 831
    .line 832
    .line 833
    move-result-object v3

    .line 834
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 835
    .line 836
    .line 837
    move-result-object v3

    .line 838
    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    .line 839
    .line 840
    div-float/2addr v2, v3

    .line 841
    mul-float/2addr v0, v2

    .line 842
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 843
    .line 844
    .line 845
    move-result v0

    .line 846
    invoke-static {v0}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 847
    .line 848
    .line 849
    move-result-object v14

    .line 850
    sget-object v0, Landroidx/compose/material3/ButtonDefaults;->INSTANCE:Landroidx/compose/material3/ButtonDefaults;

    .line 851
    .line 852
    const-wide v2, 0xff007bffL

    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    invoke-static {v2, v3}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 858
    .line 859
    .line 860
    move-result-wide v2

    .line 861
    const-wide v4, 0xffb0b0b0L

    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    invoke-static {v4, v5}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 867
    .line 868
    .line 869
    move-result-wide v5

    .line 870
    sget v4, Landroidx/compose/material3/ButtonDefaults;->$stable:I

    .line 871
    .line 872
    shl-int/lit8 v4, v4, 0xc

    .line 873
    .line 874
    or-int/lit16 v10, v4, 0x186

    .line 875
    .line 876
    const/16 v11, 0xa

    .line 877
    .line 878
    move/from16 v29, v1

    .line 879
    .line 880
    move-wide v1, v2

    .line 881
    const-wide/16 v3, 0x0

    .line 882
    .line 883
    const-wide/16 v7, 0x0

    .line 884
    .line 885
    move-object/from16 v9, p5

    .line 886
    .line 887
    move/from16 v15, v29

    .line 888
    .line 889
    invoke-virtual/range {v0 .. v11}, Landroidx/compose/material3/ButtonDefaults;->buttonColors-ro_MJ88(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ButtonColors;

    .line 890
    .line 891
    .line 892
    move-result-object v4

    .line 893
    move-object v11, v9

    .line 894
    new-instance v0, Lc4/r;

    .line 895
    .line 896
    move-object/from16 v1, p4

    .line 897
    .line 898
    invoke-direct {v0, v1}, Lc4/r;-><init>(Landroidx/compose/runtime/State;)V

    .line 899
    .line 900
    .line 901
    const/16 v1, 0x36

    .line 902
    .line 903
    const v2, -0x97f9557

    .line 904
    .line 905
    .line 906
    invoke-static {v2, v15, v0, v11, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 907
    .line 908
    .line 909
    move-result-object v9

    .line 910
    const v11, 0x30000030

    .line 911
    .line 912
    .line 913
    move-object v0, v12

    .line 914
    const/16 v12, 0x1e0

    .line 915
    .line 916
    const/4 v5, 0x0

    .line 917
    const/4 v6, 0x0

    .line 918
    const/4 v7, 0x0

    .line 919
    const/4 v8, 0x0

    .line 920
    move-object/from16 v10, p5

    .line 921
    .line 922
    move-object v1, v13

    .line 923
    move-object v3, v14

    .line 924
    move/from16 v2, v30

    .line 925
    .line 926
    invoke-static/range {v0 .. v12}, Landroidx/compose/material3/ButtonKt;->Button(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ButtonColors;Landroidx/compose/material3/ButtonElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    .line 927
    .line 928
    .line 929
    invoke-interface/range {p5 .. p5}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 930
    .line 931
    .line 932
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 933
    .line 934
    .line 935
    move-result v0

    .line 936
    if-eqz v0, :cond_e

    .line 937
    .line 938
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 939
    .line 940
    .line 941
    goto :goto_2

    .line 942
    :cond_d
    invoke-interface/range {p5 .. p5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 943
    .line 944
    .line 945
    :cond_e
    :goto_2
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 946
    .line 947
    return-object v0
.end method

.method public static final s(Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;Ljava/lang/String;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/zykj/huiwei/launcher/viewmodels/a$b;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lcom/zykj/huiwei/launcher/viewmodels/a$b;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;->d(Lcom/zykj/huiwei/launcher/viewmodels/a;)V

    .line 12
    .line 13
    .line 14
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 15
    .line 16
    return-object p0
.end method

.method public static final t(Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;Ljava/lang/String;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/zykj/huiwei/launcher/viewmodels/a$a;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lcom/zykj/huiwei/launcher/viewmodels/a$a;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;->d(Lcom/zykj/huiwei/launcher/viewmodels/a;)V

    .line 12
    .line 13
    .line 14
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 15
    .line 16
    return-object p0
.end method

.method public static final u(Landroidx/compose/ui/platform/SoftwareKeyboardController;Landroidx/compose/ui/focus/FocusManager;Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;)Lkotlin/Unit;
    .locals 2

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-interface {p0}, Landroidx/compose/ui/platform/SoftwareKeyboardController;->hide()V

    .line 4
    .line 5
    .line 6
    :cond_0
    const/4 p0, 0x1

    .line 7
    const/4 v0, 0x0

    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-static {p1, v1, p0, v0}, Landroidx/compose/ui/focus/FocusManager;->clearFocus$default(Landroidx/compose/ui/focus/FocusManager;ZILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    sget-object p0, Lcom/zykj/huiwei/launcher/viewmodels/a$c;->a:Lcom/zykj/huiwei/launcher/viewmodels/a$c;

    .line 13
    .line 14
    invoke-virtual {p2, p0}, Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;->d(Lcom/zykj/huiwei/launcher/viewmodels/a;)V

    .line 15
    .line 16
    .line 17
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 18
    .line 19
    return-object p0
.end method

.method public static final v(Landroidx/compose/runtime/State;Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 25

    .line 1
    move-object/from16 v7, p2

    .line 2
    .line 3
    move/from16 v0, p3

    .line 4
    .line 5
    const-string v1, "$this$Button"

    .line 6
    .line 7
    move-object/from16 v2, p1

    .line 8
    .line 9
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    and-int/lit8 v1, v0, 0x11

    .line 13
    .line 14
    const/16 v2, 0x10

    .line 15
    .line 16
    if-eq v1, v2, :cond_0

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v1, 0x0

    .line 21
    :goto_0
    and-int/lit8 v3, v0, 0x1

    .line 22
    .line 23
    invoke-interface {v7, v1, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_3

    .line 28
    .line 29
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    const/4 v1, -0x1

    .line 36
    const-string v3, "com.zykj.huiwei.launcher.ui.dialog.Login.ResetInputView.<anonymous>.<anonymous>.<anonymous> (ResetPasswordDialogContent.kt:250)"

    .line 37
    .line 38
    const v4, -0x97f9557

    .line 39
    .line 40
    .line 41
    invoke-static {v4, v0, v1, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    invoke-static/range {p0 .. p0}, Lcom/zykj/huiwei/launcher/ui/dialog/Login/ResetPasswordDialogContentKt;->x(Landroidx/compose/runtime/State;)Ll4/g;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Ll4/g;->j()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    const v0, -0x56031c30

    .line 55
    .line 56
    .line 57
    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 58
    .line 59
    .line 60
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 61
    .line 62
    const/16 v1, 0x14

    .line 63
    .line 64
    int-to-float v1, v1

    .line 65
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    sget-object v1, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 74
    .line 75
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 76
    .line 77
    .line 78
    move-result-wide v1

    .line 79
    const/4 v3, 0x2

    .line 80
    int-to-float v3, v3

    .line 81
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    const/16 v8, 0x1b6

    .line 86
    .line 87
    const/16 v9, 0x18

    .line 88
    .line 89
    const-wide/16 v4, 0x0

    .line 90
    .line 91
    const/4 v6, 0x0

    .line 92
    invoke-static/range {v0 .. v9}, Landroidx/compose/material3/ProgressIndicatorKt;->CircularProgressIndicator-LxG7B9w(Landroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V

    .line 93
    .line 94
    .line 95
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_2
    const v0, -0x55ff8f61

    .line 100
    .line 101
    .line 102
    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 103
    .line 104
    .line 105
    sget-object v0, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 106
    .line 107
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 108
    .line 109
    .line 110
    move-result-wide v0

    .line 111
    invoke-static {v2}, Lo3/a;->a(I)J

    .line 112
    .line 113
    .line 114
    move-result-wide v4

    .line 115
    const/16 v23, 0x0

    .line 116
    .line 117
    const v24, 0x1fff2

    .line 118
    .line 119
    .line 120
    move-wide v2, v0

    .line 121
    const-string v0, "\u4e0b\u4e00\u6b65"

    .line 122
    .line 123
    const/4 v1, 0x0

    .line 124
    const/4 v6, 0x0

    .line 125
    const/4 v7, 0x0

    .line 126
    const/4 v8, 0x0

    .line 127
    const-wide/16 v9, 0x0

    .line 128
    .line 129
    const/4 v11, 0x0

    .line 130
    const/4 v12, 0x0

    .line 131
    const-wide/16 v13, 0x0

    .line 132
    .line 133
    const/4 v15, 0x0

    .line 134
    const/16 v16, 0x0

    .line 135
    .line 136
    const/16 v17, 0x0

    .line 137
    .line 138
    const/16 v18, 0x0

    .line 139
    .line 140
    const/16 v19, 0x0

    .line 141
    .line 142
    const/16 v20, 0x0

    .line 143
    .line 144
    const/16 v22, 0xd86

    .line 145
    .line 146
    move-object/from16 v21, p2

    .line 147
    .line 148
    invoke-static/range {v0 .. v24}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 149
    .line 150
    .line 151
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 152
    .line 153
    .line 154
    :goto_1
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    if-eqz v0, :cond_4

    .line 159
    .line 160
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 161
    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_3
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 165
    .line 166
    .line 167
    :cond_4
    :goto_2
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 168
    .line 169
    return-object v0
.end method

.method public static final w(Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lcom/zykj/huiwei/launcher/ui/dialog/Login/ResetPasswordDialogContentKt;->q(Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final x(Landroidx/compose/runtime/State;)Ll4/g;
    .locals 0

    .line 1
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ll4/g;

    .line 6
    .line 7
    return-object p0
.end method

.method public static final y(Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
    .locals 11

    const-string v0, "viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onLoginClick"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x24a2a5e1

    .line 1
    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v5

    and-int/lit8 p2, p3, 0x6

    if-nez p2, :cond_1

    invoke-interface {v5, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x4

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    :goto_0
    or-int/2addr p2, p3

    goto :goto_1

    :cond_1
    move p2, p3

    :goto_1
    and-int/lit8 v1, p3, 0x30

    if-nez v1, :cond_3

    invoke-interface {v5, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr p2, v1

    :cond_3
    and-int/lit8 v1, p2, 0x13

    const/16 v2, 0x12

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eq v1, v2, :cond_4

    move v1, v8

    goto :goto_3

    :cond_4
    move v1, v9

    :goto_3
    and-int/lit8 v2, p2, 0x1

    invoke-interface {v5, v1, v2}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_5

    const/4 v1, -0x1

    const-string v2, "com.zykj.huiwei.launcher.ui.dialog.Login.ResetPasswordDialogContent (ResetPasswordDialogContent.kt:75)"

    invoke-static {v0, p2, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 2
    :cond_5
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;->c()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v1

    const/4 v6, 0x0

    const/4 v7, 0x7

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v7}, Landroidx/lifecycle/compose/FlowExtKt;->collectAsStateWithLifecycle(Lkotlinx/coroutines/flow/StateFlow;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    move-result-object p2

    .line 3
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalContext()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    .line 4
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v0

    .line 5
    check-cast v0, Landroid/content/Context;

    .line 6
    invoke-static {p2}, Lcom/zykj/huiwei/launcher/ui/dialog/Login/ResetPasswordDialogContentKt;->z(Landroidx/compose/runtime/State;)Ll4/g;

    move-result-object v0

    invoke-virtual {v0}, Ll4/g;->f()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v5, p2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    .line 7
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_6

    .line 8
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_7

    .line 9
    :cond_6
    new-instance v2, Lcom/zykj/huiwei/launcher/ui/dialog/Login/ResetPasswordDialogContentKt$ResetPasswordDialogContent$1$1;

    const/4 v1, 0x0

    invoke-direct {v2, p2, v1}, Lcom/zykj/huiwei/launcher/ui/dialog/Login/ResetPasswordDialogContentKt$ResetPasswordDialogContent$1$1;-><init>(Landroidx/compose/runtime/State;Lkotlin/coroutines/Continuation;)V

    .line 10
    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 11
    :cond_7
    check-cast v2, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v2, v5, v9}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 12
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    const/16 v1, 0x258

    int-to-float v1, v1

    const/16 v2, 0x500

    int-to-float v2, v2

    div-float/2addr v1, v2

    .line 13
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    .line 14
    iget v4, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v3, v3, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v4, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v3

    int-to-float v3, v3

    .line 15
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    iget v4, v4, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v3, v4

    mul-float/2addr v1, v3

    .line 16
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    .line 17
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v1, 0x226

    int-to-float v1, v1

    div-float/2addr v1, v2

    .line 18
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    .line 19
    iget v3, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v3, v2}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v2

    int-to-float v2, v2

    .line 20
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v2, v3

    mul-float/2addr v1, v2

    .line 21
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    .line 22
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 23
    sget-object v1, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    move-result-object v1

    .line 24
    invoke-static {v1, v9}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v1

    .line 25
    invoke-static {v5, v9}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v2

    .line 26
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v3

    .line 27
    invoke-static {v5, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 28
    sget-object v4, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v4}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v6

    .line 29
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v7

    if-nez v7, :cond_8

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 30
    :cond_8
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 31
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v7

    if-eqz v7, :cond_9

    .line 32
    invoke-interface {v5, v6}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_4

    .line 33
    :cond_9
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 34
    :goto_4
    invoke-static {v5}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v6

    .line 35
    invoke-virtual {v4}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v7

    invoke-static {v6, v1, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 36
    invoke-virtual {v4}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v6, v3, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 37
    invoke-virtual {v4}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    .line 38
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v3

    if-nez v3, :cond_a

    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v3, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_b

    .line 39
    :cond_a
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v6, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 40
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v6, v2, v1}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 41
    :cond_b
    invoke-virtual {v4}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    move-result-object v1

    invoke-static {v6, v0, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 42
    sget-object v0, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 43
    invoke-static {p2}, Lcom/zykj/huiwei/launcher/ui/dialog/Login/ResetPasswordDialogContentKt;->z(Landroidx/compose/runtime/State;)Ll4/g;

    move-result-object p2

    invoke-virtual {p2}, Ll4/g;->l()Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    .line 44
    new-instance p2, Lc4/c;

    invoke-direct {p2, p1, p0}, Lc4/c;-><init>(Lkotlin/jvm/functions/Function0;Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;)V

    const/16 v0, 0x36

    const v2, -0x199739d6

    invoke-static {v2, v8, p2, v5, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v7

    const v9, 0x186000

    const/16 v10, 0x2e

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v8, v5

    .line 45
    const-string v5, "DialogContentAnimation"

    const/4 v6, 0x0

    invoke-static/range {v1 .. v10}, Landroidx/compose/animation/AnimatedContentKt;->AnimatedContent(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v8

    .line 46
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 47
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p2

    if-eqz p2, :cond_d

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_5

    .line 48
    :cond_c
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 49
    :cond_d
    :goto_5
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p2

    if-eqz p2, :cond_e

    new-instance v0, Lc4/j;

    invoke-direct {v0, p0, p1, p3}, Lc4/j;-><init>(Lcom/zykj/huiwei/launcher/viewmodels/ResetPwdViewModel;Lkotlin/jvm/functions/Function0;I)V

    invoke-interface {p2, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_e
    return-void
.end method

.method public static final z(Landroidx/compose/runtime/State;)Ll4/g;
    .locals 0

    .line 1
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ll4/g;

    .line 6
    .line 7
    return-object p0
.end method
