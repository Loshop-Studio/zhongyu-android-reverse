.class public abstract Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final A(ZLjava/lang/String;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
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
    const-string v2, "com.zykj.huiwei.launcher.ui.dialog.changePsdDialog.ChangePsdTextField.<anonymous> (ChangePasswordDialogContent.kt:216)"

    .line 28
    .line 29
    const v4, -0x205f6e9d

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
    new-instance v1, Ld4/d;

    .line 70
    .line 71
    invoke-direct {v1, p1}, Ld4/d;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    const/16 v2, 0x36

    .line 75
    .line 76
    const v5, 0x291b458b

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

.method public static final B(Ljava/lang/String;Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
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
    const-string v1, "com.zykj.huiwei.launcher.ui.dialog.changePsdDialog.ChangePsdTextField.<anonymous>.<anonymous> (ChangePasswordDialogContent.kt:221)"

    .line 16
    .line 17
    const v2, 0x291b458b

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

.method public static final C(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;ZZLjava/lang/String;IIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 13

    .line 1
    or-int/lit8 v0, p9, 0x1

    invoke-static {v0}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v11

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move/from16 v12, p10

    move-object/from16 v10, p11

    invoke-static/range {v1 .. v12}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/a;->w(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;ZZLjava/lang/String;ILandroidx/compose/runtime/Composer;II)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic a(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/a;->t(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/a;->v(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/runtime/State;Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/a;->q(Landroidx/compose/runtime/State;Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(ZLjava/lang/String;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/a;->A(ZLjava/lang/String;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/a;->r(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/ScrollState;Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;Landroidx/compose/ui/focus/FocusRequester;Landroidx/compose/runtime/State;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/a;->p(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/ScrollState;Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;Landroidx/compose/ui/focus/FocusRequester;Landroidx/compose/runtime/State;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;ZZLjava/lang/String;IIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p12}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/a;->C(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;ZZLjava/lang/String;IIILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ljava/lang/String;Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/a;->B(Ljava/lang/String;Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/a;->u(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(ILkotlin/jvm/functions/Function1;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/a;->x(ILkotlin/jvm/functions/Function1;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/a;->s(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(ZLcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/a;->y(ZLcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/a;->z(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final n(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
    .locals 26

    .line 1
    move-object/from16 v3, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v6, p3

    .line 6
    .line 7
    const-string v0, "viewModel"

    .line 8
    .line 9
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v0, "onClose"

    .line 13
    .line 14
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const v0, 0x25e2d370

    .line 18
    .line 19
    .line 20
    move-object/from16 v2, p2

    .line 21
    .line 22
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 23
    .line 24
    .line 25
    move-result-object v11

    .line 26
    and-int/lit8 v2, v6, 0x6

    .line 27
    .line 28
    if-nez v2, :cond_1

    .line 29
    .line 30
    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    const/4 v2, 0x4

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v2, 0x2

    .line 39
    :goto_0
    or-int/2addr v2, v6

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    move v2, v6

    .line 42
    :goto_1
    and-int/lit8 v4, v6, 0x30

    .line 43
    .line 44
    if-nez v4, :cond_3

    .line 45
    .line 46
    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_2

    .line 51
    .line 52
    const/16 v4, 0x20

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    const/16 v4, 0x10

    .line 56
    .line 57
    :goto_2
    or-int/2addr v2, v4

    .line 58
    :cond_3
    and-int/lit8 v4, v2, 0x13

    .line 59
    .line 60
    const/16 v5, 0x12

    .line 61
    .line 62
    const/4 v14, 0x0

    .line 63
    const/4 v15, 0x1

    .line 64
    if-eq v4, v5, :cond_4

    .line 65
    .line 66
    move v4, v15

    .line 67
    goto :goto_3

    .line 68
    :cond_4
    move v4, v14

    .line 69
    :goto_3
    and-int/lit8 v5, v2, 0x1

    .line 70
    .line 71
    invoke-interface {v11, v4, v5}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-eqz v4, :cond_7

    .line 76
    .line 77
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-eqz v4, :cond_5

    .line 82
    .line 83
    const/4 v4, -0x1

    .line 84
    const-string v5, "com.zykj.huiwei.launcher.ui.dialog.changePsdDialog.ChangePasswordDialogContent (ChangePasswordDialogContent.kt:61)"

    .line 85
    .line 86
    invoke-static {v0, v2, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 87
    .line 88
    .line 89
    :cond_5
    invoke-virtual {v3}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;->f()Lkotlinx/coroutines/flow/StateFlow;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    const/4 v12, 0x0

    .line 94
    const/4 v13, 0x7

    .line 95
    const/4 v8, 0x0

    .line 96
    const/4 v9, 0x0

    .line 97
    const/4 v10, 0x0

    .line 98
    invoke-static/range {v7 .. v13}, Landroidx/lifecycle/compose/FlowExtKt;->collectAsStateWithLifecycle(Lkotlinx/coroutines/flow/StateFlow;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 107
    .line 108
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    if-ne v0, v2, :cond_6

    .line 113
    .line 114
    new-instance v0, Landroidx/compose/ui/focus/FocusRequester;

    .line 115
    .line 116
    invoke-direct {v0}, Landroidx/compose/ui/focus/FocusRequester;-><init>()V

    .line 117
    .line 118
    .line 119
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    :cond_6
    move-object v4, v0

    .line 123
    check-cast v4, Landroidx/compose/ui/focus/FocusRequester;

    .line 124
    .line 125
    invoke-static {v14, v11, v14, v15}, Landroidx/compose/foundation/ScrollKt;->rememberScrollState(ILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/ScrollState;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 130
    .line 131
    const/16 v7, 0x258

    .line 132
    .line 133
    int-to-float v7, v7

    .line 134
    const/16 v8, 0x500

    .line 135
    .line 136
    int-to-float v8, v8

    .line 137
    div-float/2addr v7, v8

    .line 138
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 139
    .line 140
    .line 141
    move-result-object v8

    .line 142
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 143
    .line 144
    .line 145
    move-result-object v8

    .line 146
    iget v9, v8, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 147
    .line 148
    iget v8, v8, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 149
    .line 150
    invoke-static {v9, v8}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 151
    .line 152
    .line 153
    move-result v8

    .line 154
    int-to-float v8, v8

    .line 155
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 156
    .line 157
    .line 158
    move-result-object v9

    .line 159
    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 160
    .line 161
    .line 162
    move-result-object v9

    .line 163
    iget v9, v9, Landroid/util/DisplayMetrics;->density:F

    .line 164
    .line 165
    div-float/2addr v8, v9

    .line 166
    mul-float/2addr v7, v8

    .line 167
    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 168
    .line 169
    .line 170
    move-result v7

    .line 171
    invoke-static {v0, v7}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    const/4 v7, 0x3

    .line 176
    const/4 v8, 0x0

    .line 177
    invoke-static {v0, v8, v14, v7, v8}, Landroidx/compose/foundation/layout/SizeKt;->wrapContentHeight$default(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment$Vertical;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 178
    .line 179
    .line 180
    move-result-object v16

    .line 181
    const/16 v0, 0xa

    .line 182
    .line 183
    int-to-float v0, v0

    .line 184
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 185
    .line 186
    .line 187
    move-result v17

    .line 188
    const/16 v0, 0xc

    .line 189
    .line 190
    int-to-float v0, v0

    .line 191
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 192
    .line 193
    .line 194
    move-result v7

    .line 195
    invoke-static {v7}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 196
    .line 197
    .line 198
    move-result-object v18

    .line 199
    const/16 v24, 0x1c

    .line 200
    .line 201
    const/16 v25, 0x0

    .line 202
    .line 203
    const/16 v19, 0x0

    .line 204
    .line 205
    const-wide/16 v20, 0x0

    .line 206
    .line 207
    const-wide/16 v22, 0x0

    .line 208
    .line 209
    invoke-static/range {v16 .. v25}, Landroidx/compose/ui/draw/ShadowKt;->shadow-s4CzXII$default(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;ZJJILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 210
    .line 211
    .line 212
    move-result-object v7

    .line 213
    invoke-static {v7}, Landroidx/compose/foundation/layout/WindowInsetsPadding_androidKt;->imePadding(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 214
    .line 215
    .line 216
    move-result-object v7

    .line 217
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    invoke-static {v0}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 222
    .line 223
    .line 224
    move-result-object v8

    .line 225
    sget-object v0, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 226
    .line 227
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getTransparent-0d7_KjU()J

    .line 228
    .line 229
    .line 230
    move-result-wide v9

    .line 231
    new-instance v0, Ld4/a;

    .line 232
    .line 233
    invoke-direct/range {v0 .. v5}, Ld4/a;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/ScrollState;Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;Landroidx/compose/ui/focus/FocusRequester;Landroidx/compose/runtime/State;)V

    .line 234
    .line 235
    .line 236
    const/16 v2, 0x36

    .line 237
    .line 238
    const v4, 0x122c0875

    .line 239
    .line 240
    .line 241
    invoke-static {v4, v15, v0, v11, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 242
    .line 243
    .line 244
    move-result-object v16

    .line 245
    const v18, 0xc00180

    .line 246
    .line 247
    .line 248
    const/16 v19, 0x78

    .line 249
    .line 250
    move-object/from16 v17, v11

    .line 251
    .line 252
    const-wide/16 v11, 0x0

    .line 253
    .line 254
    const/4 v13, 0x0

    .line 255
    const/4 v14, 0x0

    .line 256
    const/4 v15, 0x0

    .line 257
    invoke-static/range {v7 .. v19}, Landroidx/compose/material3/SurfaceKt;->Surface-T9BRK9s(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    .line 258
    .line 259
    .line 260
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 261
    .line 262
    .line 263
    move-result v0

    .line 264
    if-eqz v0, :cond_8

    .line 265
    .line 266
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 267
    .line 268
    .line 269
    goto :goto_4

    .line 270
    :cond_7
    move-object/from16 v17, v11

    .line 271
    .line 272
    invoke-interface/range {v17 .. v17}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 273
    .line 274
    .line 275
    :cond_8
    :goto_4
    invoke-interface/range {v17 .. v17}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    if-eqz v0, :cond_9

    .line 280
    .line 281
    new-instance v2, Ld4/e;

    .line 282
    .line 283
    invoke-direct {v2, v3, v1, v6}, Ld4/e;-><init>(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;Lkotlin/jvm/functions/Function0;I)V

    .line 284
    .line 285
    .line 286
    invoke-interface {v0, v2}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 287
    .line 288
    .line 289
    :cond_9
    return-void
.end method

.method public static final o(Landroidx/compose/runtime/State;)Ld4/q;
    .locals 0

    .line 1
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ld4/q;

    .line 6
    .line 7
    return-object p0
.end method

.method public static final p(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/ScrollState;Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;Landroidx/compose/ui/focus/FocusRequester;Landroidx/compose/runtime/State;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 33

    .line 1
    move-object/from16 v10, p5

    .line 2
    .line 3
    move/from16 v1, p6

    .line 4
    .line 5
    and-int/lit8 v2, v1, 0x3

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v11, 0x0

    .line 9
    const/4 v12, 0x1

    .line 10
    if-eq v2, v3, :cond_0

    .line 11
    .line 12
    move v2, v12

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v2, v11

    .line 15
    :goto_0
    and-int/lit8 v3, v1, 0x1

    .line 16
    .line 17
    invoke-interface {v10, v2, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_13

    .line 22
    .line 23
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    const/4 v2, -0x1

    .line 30
    const-string v3, "com.zykj.huiwei.launcher.ui.dialog.changePsdDialog.ChangePasswordDialogContent.<anonymous> (ChangePasswordDialogContent.kt:75)"

    .line 31
    .line 32
    const v4, 0x122c0875

    .line 33
    .line 34
    .line 35
    invoke-static {v4, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    sget-object v13, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 39
    .line 40
    sget-object v1, Landroidx/compose/ui/graphics/Brush;->Companion:Landroidx/compose/ui/graphics/Brush$Companion;

    .line 41
    .line 42
    const-wide v2, 0xff252d46L

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    invoke-static {v2, v3}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 48
    .line 49
    .line 50
    move-result-wide v2

    .line 51
    invoke-static {v2, v3}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    const-wide v3, 0xff20283fL

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    invoke-static {v3, v4}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 61
    .line 62
    .line 63
    move-result-wide v3

    .line 64
    invoke-static {v3, v4}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    filled-new-array {v2, v3}, [Landroidx/compose/ui/graphics/Color;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    const/16 v6, 0xe

    .line 77
    .line 78
    const/4 v7, 0x0

    .line 79
    const/4 v3, 0x0

    .line 80
    const/4 v4, 0x0

    .line 81
    const/4 v5, 0x0

    .line 82
    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/graphics/Brush$Companion;->verticalGradient-8A-3gB4$default(Landroidx/compose/ui/graphics/Brush$Companion;Ljava/util/List;FFIILjava/lang/Object;)Landroidx/compose/ui/graphics/Brush;

    .line 83
    .line 84
    .line 85
    move-result-object v14

    .line 86
    const/16 v17, 0x6

    .line 87
    .line 88
    const/16 v18, 0x0

    .line 89
    .line 90
    const/4 v15, 0x0

    .line 91
    const/16 v16, 0x0

    .line 92
    .line 93
    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/BackgroundKt;->background$default(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    sget-object v14, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 98
    .line 99
    invoke-virtual {v14}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-static {v2, v11}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-static {v10, v11}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    invoke-static {v10, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    sget-object v15, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 120
    .line 121
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    if-nez v6, :cond_2

    .line 130
    .line 131
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 132
    .line 133
    .line 134
    :cond_2
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 135
    .line 136
    .line 137
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 138
    .line 139
    .line 140
    move-result v6

    .line 141
    if-eqz v6, :cond_3

    .line 142
    .line 143
    invoke-interface {v10, v5}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 144
    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_3
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 148
    .line 149
    .line 150
    :goto_1
    invoke-static {v10}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 155
    .line 156
    .line 157
    move-result-object v6

    .line 158
    invoke-static {v5, v2, v6}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    invoke-static {v5, v4, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 173
    .line 174
    .line 175
    move-result v4

    .line 176
    if-nez v4, :cond_4

    .line 177
    .line 178
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 183
    .line 184
    .line 185
    move-result-object v6

    .line 186
    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v4

    .line 190
    if-nez v4, :cond_5

    .line 191
    .line 192
    :cond_4
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 200
    .line 201
    .line 202
    move-result-object v3

    .line 203
    invoke-interface {v5, v3, v2}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 204
    .line 205
    .line 206
    :cond_5
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    invoke-static {v5, v1, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 211
    .line 212
    .line 213
    sget-object v1, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 214
    .line 215
    invoke-virtual {v14}, Landroidx/compose/ui/Alignment$Companion;->getTopEnd()Landroidx/compose/ui/Alignment;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    invoke-interface {v1, v13, v2}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    const/16 v2, 0xa

    .line 224
    .line 225
    int-to-float v2, v2

    .line 226
    const/16 v3, 0x500

    .line 227
    .line 228
    int-to-float v3, v3

    .line 229
    div-float/2addr v2, v3

    .line 230
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 231
    .line 232
    .line 233
    move-result-object v4

    .line 234
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 235
    .line 236
    .line 237
    move-result-object v4

    .line 238
    iget v5, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 239
    .line 240
    iget v4, v4, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 241
    .line 242
    invoke-static {v5, v4}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 243
    .line 244
    .line 245
    move-result v4

    .line 246
    int-to-float v4, v4

    .line 247
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 248
    .line 249
    .line 250
    move-result-object v5

    .line 251
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 252
    .line 253
    .line 254
    move-result-object v5

    .line 255
    iget v5, v5, Landroid/util/DisplayMetrics;->density:F

    .line 256
    .line 257
    div-float/2addr v4, v5

    .line 258
    mul-float/2addr v2, v4

    .line 259
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 260
    .line 261
    .line 262
    move-result v2

    .line 263
    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/PaddingKt;->padding-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    const/16 v2, 0x18

    .line 268
    .line 269
    int-to-float v2, v2

    .line 270
    div-float/2addr v2, v3

    .line 271
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 272
    .line 273
    .line 274
    move-result-object v3

    .line 275
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 276
    .line 277
    .line 278
    move-result-object v3

    .line 279
    iget v4, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 280
    .line 281
    iget v3, v3, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 282
    .line 283
    invoke-static {v4, v3}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    .line 284
    .line 285
    .line 286
    move-result v3

    .line 287
    int-to-float v3, v3

    .line 288
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 289
    .line 290
    .line 291
    move-result-object v4

    .line 292
    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 293
    .line 294
    .line 295
    move-result-object v4

    .line 296
    iget v4, v4, Landroid/util/DisplayMetrics;->density:F

    .line 297
    .line 298
    div-float/2addr v3, v4

    .line 299
    mul-float/2addr v2, v3

    .line 300
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 301
    .line 302
    .line 303
    move-result v2

    .line 304
    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    sget-object v1, Ld4/s;->a:Ld4/s;

    .line 309
    .line 310
    invoke-virtual {v1}, Ld4/s;->b()Lkotlin/jvm/functions/Function2;

    .line 311
    .line 312
    .line 313
    move-result-object v6

    .line 314
    const/high16 v8, 0x30000

    .line 315
    .line 316
    const/16 v9, 0x1c

    .line 317
    .line 318
    const/4 v3, 0x0

    .line 319
    const/4 v4, 0x0

    .line 320
    const/4 v5, 0x0

    .line 321
    move-object/from16 v1, p0

    .line 322
    .line 323
    move-object v7, v10

    .line 324
    invoke-static/range {v1 .. v9}, Landroidx/compose/material3/IconButtonKt;->IconButton(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/IconButtonColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    .line 325
    .line 326
    .line 327
    const/4 v1, 0x0

    .line 328
    const/4 v2, 0x0

    .line 329
    invoke-static {v13, v1, v12, v2}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 330
    .line 331
    .line 332
    move-result-object v3

    .line 333
    const/16 v4, 0x28

    .line 334
    .line 335
    int-to-float v4, v4

    .line 336
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 337
    .line 338
    .line 339
    move-result v4

    .line 340
    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/PaddingKt;->padding-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 341
    .line 342
    .line 343
    move-result-object v16

    .line 344
    const/16 v21, 0xe

    .line 345
    .line 346
    const/16 v22, 0x0

    .line 347
    .line 348
    const/16 v18, 0x0

    .line 349
    .line 350
    const/16 v19, 0x0

    .line 351
    .line 352
    const/16 v20, 0x0

    .line 353
    .line 354
    move-object/from16 v17, p1

    .line 355
    .line 356
    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/ScrollKt;->verticalScroll$default(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;ZLandroidx/compose/foundation/gestures/FlingBehavior;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 357
    .line 358
    .line 359
    move-result-object v3

    .line 360
    invoke-static {v3}, Landroidx/compose/foundation/layout/WindowInsetsPadding_androidKt;->imePadding(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 361
    .line 362
    .line 363
    move-result-object v3

    .line 364
    invoke-virtual {v14}, Landroidx/compose/ui/Alignment$Companion;->getCenterHorizontally()Landroidx/compose/ui/Alignment$Horizontal;

    .line 365
    .line 366
    .line 367
    move-result-object v4

    .line 368
    sget-object v5, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 369
    .line 370
    invoke-virtual {v5}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 371
    .line 372
    .line 373
    move-result-object v5

    .line 374
    const/16 v6, 0x30

    .line 375
    .line 376
    invoke-static {v5, v4, v10, v6}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 377
    .line 378
    .line 379
    move-result-object v4

    .line 380
    invoke-static {v10, v11}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 381
    .line 382
    .line 383
    move-result v5

    .line 384
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 385
    .line 386
    .line 387
    move-result-object v6

    .line 388
    invoke-static {v10, v3}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 389
    .line 390
    .line 391
    move-result-object v3

    .line 392
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    .line 393
    .line 394
    .line 395
    move-result-object v7

    .line 396
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 397
    .line 398
    .line 399
    move-result-object v8

    .line 400
    if-nez v8, :cond_6

    .line 401
    .line 402
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 403
    .line 404
    .line 405
    :cond_6
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 406
    .line 407
    .line 408
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 409
    .line 410
    .line 411
    move-result v8

    .line 412
    if-eqz v8, :cond_7

    .line 413
    .line 414
    invoke-interface {v10, v7}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    .line 415
    .line 416
    .line 417
    goto :goto_2

    .line 418
    :cond_7
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 419
    .line 420
    .line 421
    :goto_2
    invoke-static {v10}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 422
    .line 423
    .line 424
    move-result-object v7

    .line 425
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    .line 426
    .line 427
    .line 428
    move-result-object v8

    .line 429
    invoke-static {v7, v4, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 430
    .line 431
    .line 432
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    .line 433
    .line 434
    .line 435
    move-result-object v4

    .line 436
    invoke-static {v7, v6, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    .line 440
    .line 441
    .line 442
    move-result-object v4

    .line 443
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 444
    .line 445
    .line 446
    move-result v6

    .line 447
    if-nez v6, :cond_8

    .line 448
    .line 449
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 450
    .line 451
    .line 452
    move-result-object v6

    .line 453
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 454
    .line 455
    .line 456
    move-result-object v8

    .line 457
    invoke-static {v6, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 458
    .line 459
    .line 460
    move-result v6

    .line 461
    if-nez v6, :cond_9

    .line 462
    .line 463
    :cond_8
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 464
    .line 465
    .line 466
    move-result-object v6

    .line 467
    invoke-interface {v7, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 468
    .line 469
    .line 470
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 471
    .line 472
    .line 473
    move-result-object v5

    .line 474
    invoke-interface {v7, v5, v4}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 475
    .line 476
    .line 477
    :cond_9
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    .line 478
    .line 479
    .line 480
    move-result-object v4

    .line 481
    invoke-static {v7, v3, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 482
    .line 483
    .line 484
    sget-object v3, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 485
    .line 486
    const v3, 0x7f110085

    .line 487
    .line 488
    .line 489
    const/4 v4, 0x6

    .line 490
    invoke-static {v3, v10, v4}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 491
    .line 492
    .line 493
    move-result-object v3

    .line 494
    sget-object v5, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 495
    .line 496
    invoke-virtual {v5}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 497
    .line 498
    .line 499
    move-result-wide v5

    .line 500
    const/16 v7, 0x10

    .line 501
    .line 502
    invoke-static {v7}, Lo3/a;->a(I)J

    .line 503
    .line 504
    .line 505
    move-result-wide v7

    .line 506
    sget-object v9, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    .line 507
    .line 508
    invoke-virtual {v9}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    .line 509
    .line 510
    .line 511
    move-result-object v9

    .line 512
    const/16 v24, 0x0

    .line 513
    .line 514
    const v25, 0x1ffd2

    .line 515
    .line 516
    .line 517
    move-object v14, v2

    .line 518
    const/4 v2, 0x0

    .line 519
    move v15, v4

    .line 520
    move-wide/from16 v31, v7

    .line 521
    .line 522
    move v8, v1

    .line 523
    move-object v1, v3

    .line 524
    move-wide v3, v5

    .line 525
    move-wide/from16 v5, v31

    .line 526
    .line 527
    const/4 v7, 0x0

    .line 528
    move/from16 v16, v8

    .line 529
    .line 530
    move-object v8, v9

    .line 531
    const/4 v9, 0x0

    .line 532
    move/from16 v17, v11

    .line 533
    .line 534
    const-wide/16 v10, 0x0

    .line 535
    .line 536
    move/from16 v18, v12

    .line 537
    .line 538
    const/4 v12, 0x0

    .line 539
    move-object/from16 v19, v13

    .line 540
    .line 541
    const/4 v13, 0x0

    .line 542
    move-object/from16 v20, v14

    .line 543
    .line 544
    move/from16 v21, v15

    .line 545
    .line 546
    const-wide/16 v14, 0x0

    .line 547
    .line 548
    move/from16 v22, v16

    .line 549
    .line 550
    const/16 v16, 0x0

    .line 551
    .line 552
    move/from16 v23, v17

    .line 553
    .line 554
    const/16 v17, 0x0

    .line 555
    .line 556
    move/from16 v26, v18

    .line 557
    .line 558
    const/16 v18, 0x0

    .line 559
    .line 560
    move-object/from16 v27, v19

    .line 561
    .line 562
    const/16 v19, 0x0

    .line 563
    .line 564
    move-object/from16 v28, v20

    .line 565
    .line 566
    const/16 v20, 0x0

    .line 567
    .line 568
    move/from16 v29, v21

    .line 569
    .line 570
    const/16 v21, 0x0

    .line 571
    .line 572
    move/from16 v30, v23

    .line 573
    .line 574
    const v23, 0x30d80

    .line 575
    .line 576
    .line 577
    move-object/from16 v22, p5

    .line 578
    .line 579
    move-object/from16 v0, v27

    .line 580
    .line 581
    invoke-static/range {v1 .. v25}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 582
    .line 583
    .line 584
    move-object/from16 v10, v22

    .line 585
    .line 586
    const/16 v1, 0x14

    .line 587
    .line 588
    int-to-float v1, v1

    .line 589
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 590
    .line 591
    .line 592
    move-result v1

    .line 593
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 594
    .line 595
    .line 596
    move-result-object v1

    .line 597
    const/4 v15, 0x6

    .line 598
    invoke-static {v1, v10, v15}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 599
    .line 600
    .line 601
    const v1, 0x7f11008e

    .line 602
    .line 603
    .line 604
    invoke-static {v1, v10, v15}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 605
    .line 606
    .line 607
    move-result-object v2

    .line 608
    invoke-static/range {p4 .. p4}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/a;->o(Landroidx/compose/runtime/State;)Ld4/q;

    .line 609
    .line 610
    .line 611
    move-result-object v1

    .line 612
    invoke-virtual {v1}, Ld4/q;->g()Ljava/lang/String;

    .line 613
    .line 614
    .line 615
    move-result-object v3

    .line 616
    sget-object v5, Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;->f:Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;

    .line 617
    .line 618
    move-object/from16 v13, p2

    .line 619
    .line 620
    invoke-interface {v10, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 621
    .line 622
    .line 623
    move-result v1

    .line 624
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 625
    .line 626
    .line 627
    move-result-object v4

    .line 628
    if-nez v1, :cond_a

    .line 629
    .line 630
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 631
    .line 632
    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 633
    .line 634
    .line 635
    move-result-object v1

    .line 636
    if-ne v4, v1, :cond_b

    .line 637
    .line 638
    :cond_a
    new-instance v4, Ld4/f;

    .line 639
    .line 640
    invoke-direct {v4, v13}, Ld4/f;-><init>(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;)V

    .line 641
    .line 642
    .line 643
    invoke-interface {v10, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 644
    .line 645
    .line 646
    :cond_b
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 647
    .line 648
    const v11, 0x36000

    .line 649
    .line 650
    .line 651
    const/16 v12, 0x1c1

    .line 652
    .line 653
    const/4 v1, 0x0

    .line 654
    const/4 v6, 0x0

    .line 655
    const/4 v7, 0x0

    .line 656
    const/4 v8, 0x0

    .line 657
    const/4 v9, 0x0

    .line 658
    invoke-static/range {v1 .. v12}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/a;->w(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;ZZLjava/lang/String;ILandroidx/compose/runtime/Composer;II)V

    .line 659
    .line 660
    .line 661
    const/16 v1, 0xf

    .line 662
    .line 663
    int-to-float v14, v1

    .line 664
    invoke-static {v14}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 665
    .line 666
    .line 667
    move-result v1

    .line 668
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 669
    .line 670
    .line 671
    move-result-object v1

    .line 672
    invoke-static {v1, v10, v15}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 673
    .line 674
    .line 675
    move-object/from16 v1, p3

    .line 676
    .line 677
    invoke-static {v0, v1}, Landroidx/compose/ui/focus/FocusRequesterModifierKt;->focusRequester(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/focus/FocusRequester;)Landroidx/compose/ui/Modifier;

    .line 678
    .line 679
    .line 680
    move-result-object v1

    .line 681
    const v2, 0x7f110157

    .line 682
    .line 683
    .line 684
    invoke-static {v2, v10, v15}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 685
    .line 686
    .line 687
    move-result-object v2

    .line 688
    invoke-static/range {p4 .. p4}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/a;->o(Landroidx/compose/runtime/State;)Ld4/q;

    .line 689
    .line 690
    .line 691
    move-result-object v3

    .line 692
    invoke-virtual {v3}, Ld4/q;->f()Ljava/lang/String;

    .line 693
    .line 694
    .line 695
    move-result-object v3

    .line 696
    invoke-static/range {p4 .. p4}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/a;->o(Landroidx/compose/runtime/State;)Ld4/q;

    .line 697
    .line 698
    .line 699
    move-result-object v4

    .line 700
    invoke-virtual {v4}, Ld4/q;->e()Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;

    .line 701
    .line 702
    .line 703
    move-result-object v5

    .line 704
    invoke-static/range {p4 .. p4}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/a;->o(Landroidx/compose/runtime/State;)Ld4/q;

    .line 705
    .line 706
    .line 707
    move-result-object v4

    .line 708
    invoke-virtual {v4}, Ld4/q;->i()Z

    .line 709
    .line 710
    .line 711
    move-result v7

    .line 712
    invoke-interface {v10, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 713
    .line 714
    .line 715
    move-result v4

    .line 716
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 717
    .line 718
    .line 719
    move-result-object v6

    .line 720
    if-nez v4, :cond_c

    .line 721
    .line 722
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 723
    .line 724
    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 725
    .line 726
    .line 727
    move-result-object v4

    .line 728
    if-ne v6, v4, :cond_d

    .line 729
    .line 730
    :cond_c
    new-instance v6, Ld4/g;

    .line 731
    .line 732
    invoke-direct {v6, v13}, Ld4/g;-><init>(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;)V

    .line 733
    .line 734
    .line 735
    invoke-interface {v10, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 736
    .line 737
    .line 738
    :cond_d
    move-object v4, v6

    .line 739
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 740
    .line 741
    const/4 v11, 0x0

    .line 742
    const/16 v12, 0x1a0

    .line 743
    .line 744
    const/4 v6, 0x0

    .line 745
    const/4 v8, 0x0

    .line 746
    const/4 v9, 0x0

    .line 747
    invoke-static/range {v1 .. v12}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/a;->w(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;ZZLjava/lang/String;ILandroidx/compose/runtime/Composer;II)V

    .line 748
    .line 749
    .line 750
    invoke-static {v14}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 751
    .line 752
    .line 753
    move-result v1

    .line 754
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 755
    .line 756
    .line 757
    move-result-object v1

    .line 758
    invoke-static {v1, v10, v15}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 759
    .line 760
    .line 761
    const/4 v1, 0x1

    .line 762
    const/4 v8, 0x0

    .line 763
    const/4 v14, 0x0

    .line 764
    invoke-static {v0, v8, v1, v14}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 765
    .line 766
    .line 767
    move-result-object v2

    .line 768
    const v3, 0x7f11019c

    .line 769
    .line 770
    .line 771
    invoke-static {v3, v10, v15}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 772
    .line 773
    .line 774
    move-result-object v3

    .line 775
    invoke-static/range {p4 .. p4}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/a;->o(Landroidx/compose/runtime/State;)Ld4/q;

    .line 776
    .line 777
    .line 778
    move-result-object v4

    .line 779
    invoke-virtual {v4}, Ld4/q;->d()Ljava/lang/String;

    .line 780
    .line 781
    .line 782
    move-result-object v4

    .line 783
    invoke-static/range {p4 .. p4}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/a;->o(Landroidx/compose/runtime/State;)Ld4/q;

    .line 784
    .line 785
    .line 786
    move-result-object v5

    .line 787
    invoke-virtual {v5}, Ld4/q;->e()Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;

    .line 788
    .line 789
    .line 790
    move-result-object v5

    .line 791
    invoke-static/range {p4 .. p4}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/a;->o(Landroidx/compose/runtime/State;)Ld4/q;

    .line 792
    .line 793
    .line 794
    move-result-object v6

    .line 795
    invoke-virtual {v6}, Ld4/q;->h()Z

    .line 796
    .line 797
    .line 798
    move-result v7

    .line 799
    invoke-static/range {p4 .. p4}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/a;->o(Landroidx/compose/runtime/State;)Ld4/q;

    .line 800
    .line 801
    .line 802
    move-result-object v6

    .line 803
    invoke-virtual {v6}, Ld4/q;->c()Ljava/lang/String;

    .line 804
    .line 805
    .line 806
    move-result-object v8

    .line 807
    invoke-interface {v10, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 808
    .line 809
    .line 810
    move-result v6

    .line 811
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 812
    .line 813
    .line 814
    move-result-object v9

    .line 815
    if-nez v6, :cond_e

    .line 816
    .line 817
    sget-object v6, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 818
    .line 819
    invoke-virtual {v6}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 820
    .line 821
    .line 822
    move-result-object v6

    .line 823
    if-ne v9, v6, :cond_f

    .line 824
    .line 825
    :cond_e
    new-instance v9, Ld4/h;

    .line 826
    .line 827
    invoke-direct {v9, v13}, Ld4/h;-><init>(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;)V

    .line 828
    .line 829
    .line 830
    invoke-interface {v10, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 831
    .line 832
    .line 833
    :cond_f
    check-cast v9, Lkotlin/jvm/functions/Function1;

    .line 834
    .line 835
    const/4 v11, 0x6

    .line 836
    const/16 v12, 0x120

    .line 837
    .line 838
    const/4 v6, 0x0

    .line 839
    move/from16 v26, v1

    .line 840
    .line 841
    move-object v1, v2

    .line 842
    move-object v2, v3

    .line 843
    move-object v3, v4

    .line 844
    move-object v4, v9

    .line 845
    const/4 v9, 0x0

    .line 846
    move/from16 v14, v26

    .line 847
    .line 848
    invoke-static/range {v1 .. v12}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/a;->w(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;ZZLjava/lang/String;ILandroidx/compose/runtime/Composer;II)V

    .line 849
    .line 850
    .line 851
    const/16 v1, 0x23

    .line 852
    .line 853
    int-to-float v1, v1

    .line 854
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 855
    .line 856
    .line 857
    move-result v1

    .line 858
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 859
    .line 860
    .line 861
    move-result-object v1

    .line 862
    invoke-static {v1, v10, v15}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 863
    .line 864
    .line 865
    invoke-interface {v10, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 866
    .line 867
    .line 868
    move-result v1

    .line 869
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 870
    .line 871
    .line 872
    move-result-object v2

    .line 873
    if-nez v1, :cond_10

    .line 874
    .line 875
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 876
    .line 877
    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 878
    .line 879
    .line 880
    move-result-object v1

    .line 881
    if-ne v2, v1, :cond_11

    .line 882
    .line 883
    :cond_10
    new-instance v2, Ld4/i;

    .line 884
    .line 885
    invoke-direct {v2, v13}, Ld4/i;-><init>(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;)V

    .line 886
    .line 887
    .line 888
    invoke-interface {v10, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 889
    .line 890
    .line 891
    :cond_11
    move-object v12, v2

    .line 892
    check-cast v12, Lkotlin/jvm/functions/Function0;

    .line 893
    .line 894
    const/16 v1, 0x82

    .line 895
    .line 896
    int-to-float v1, v1

    .line 897
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 898
    .line 899
    .line 900
    move-result v1

    .line 901
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 902
    .line 903
    .line 904
    move-result-object v0

    .line 905
    const/16 v1, 0x2d

    .line 906
    .line 907
    int-to-float v1, v1

    .line 908
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 909
    .line 910
    .line 911
    move-result v1

    .line 912
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 913
    .line 914
    .line 915
    move-result-object v13

    .line 916
    invoke-static/range {p4 .. p4}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/a;->o(Landroidx/compose/runtime/State;)Ld4/q;

    .line 917
    .line 918
    .line 919
    move-result-object v0

    .line 920
    invoke-virtual {v0}, Ld4/q;->k()Z

    .line 921
    .line 922
    .line 923
    move-result v0

    .line 924
    if-eqz v0, :cond_12

    .line 925
    .line 926
    invoke-static/range {p4 .. p4}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/a;->o(Landroidx/compose/runtime/State;)Ld4/q;

    .line 927
    .line 928
    .line 929
    move-result-object v0

    .line 930
    invoke-virtual {v0}, Ld4/q;->j()Z

    .line 931
    .line 932
    .line 933
    move-result v0

    .line 934
    if-nez v0, :cond_12

    .line 935
    .line 936
    move/from16 v30, v14

    .line 937
    .line 938
    :cond_12
    const/4 v0, 0x5

    .line 939
    int-to-float v0, v0

    .line 940
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 941
    .line 942
    .line 943
    move-result v0

    .line 944
    invoke-static {v0}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 945
    .line 946
    .line 947
    move-result-object v15

    .line 948
    sget-object v0, Landroidx/compose/material3/ButtonDefaults;->INSTANCE:Landroidx/compose/material3/ButtonDefaults;

    .line 949
    .line 950
    const-wide v1, 0xff007bffL

    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 956
    .line 957
    .line 958
    move-result-wide v1

    .line 959
    const-wide v3, 0xffb0b0b0L

    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    invoke-static {v3, v4}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 965
    .line 966
    .line 967
    move-result-wide v5

    .line 968
    sget v3, Landroidx/compose/material3/ButtonDefaults;->$stable:I

    .line 969
    .line 970
    shl-int/lit8 v3, v3, 0xc

    .line 971
    .line 972
    or-int/lit16 v3, v3, 0x186

    .line 973
    .line 974
    const/16 v11, 0xa

    .line 975
    .line 976
    move v10, v3

    .line 977
    const-wide/16 v3, 0x0

    .line 978
    .line 979
    const-wide/16 v7, 0x0

    .line 980
    .line 981
    move-object/from16 v9, p5

    .line 982
    .line 983
    invoke-virtual/range {v0 .. v11}, Landroidx/compose/material3/ButtonDefaults;->buttonColors-ro_MJ88(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ButtonColors;

    .line 984
    .line 985
    .line 986
    move-result-object v4

    .line 987
    move-object v10, v9

    .line 988
    new-instance v0, Ld4/j;

    .line 989
    .line 990
    move-object/from16 v1, p4

    .line 991
    .line 992
    invoke-direct {v0, v1}, Ld4/j;-><init>(Landroidx/compose/runtime/State;)V

    .line 993
    .line 994
    .line 995
    const/16 v1, 0x36

    .line 996
    .line 997
    const v2, 0x48926a61

    .line 998
    .line 999
    .line 1000
    invoke-static {v2, v14, v0, v10, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v9

    .line 1004
    const v11, 0x30000030

    .line 1005
    .line 1006
    .line 1007
    move-object v0, v12

    .line 1008
    const/16 v12, 0x1e0

    .line 1009
    .line 1010
    const/4 v5, 0x0

    .line 1011
    const/4 v6, 0x0

    .line 1012
    const/4 v7, 0x0

    .line 1013
    const/4 v8, 0x0

    .line 1014
    move-object v1, v13

    .line 1015
    move-object v3, v15

    .line 1016
    move/from16 v2, v30

    .line 1017
    .line 1018
    invoke-static/range {v0 .. v12}, Landroidx/compose/material3/ButtonKt;->Button(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ButtonColors;Landroidx/compose/material3/ButtonElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    .line 1019
    .line 1020
    .line 1021
    invoke-interface/range {p5 .. p5}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1022
    .line 1023
    .line 1024
    invoke-interface/range {p5 .. p5}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1025
    .line 1026
    .line 1027
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 1028
    .line 1029
    .line 1030
    move-result v0

    .line 1031
    if-eqz v0, :cond_14

    .line 1032
    .line 1033
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 1034
    .line 1035
    .line 1036
    goto :goto_3

    .line 1037
    :cond_13
    invoke-interface/range {p5 .. p5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 1038
    .line 1039
    .line 1040
    :cond_14
    :goto_3
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 1041
    .line 1042
    return-object v0
.end method

.method public static final q(Landroidx/compose/runtime/State;Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
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
    const-string v3, "com.zykj.huiwei.launcher.ui.dialog.changePsdDialog.ChangePasswordDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChangePasswordDialogContent.kt:158)"

    .line 37
    .line 38
    const v4, 0x48926a61

    .line 39
    .line 40
    .line 41
    invoke-static {v4, v0, v1, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    invoke-static/range {p0 .. p0}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/a;->o(Landroidx/compose/runtime/State;)Ld4/q;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Ld4/q;->j()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    const v0, 0x468a3b80    # 17693.75f

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
    const v0, 0x468e235f

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

.method public static final r(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;Ljava/lang/String;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/b$c;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/b$c;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;->g(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/b;)V

    .line 12
    .line 13
    .line 14
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 15
    .line 16
    return-object p0
.end method

.method public static final s(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;Ljava/lang/String;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/b$b;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/b$b;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;->g(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/b;)V

    .line 12
    .line 13
    .line 14
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 15
    .line 16
    return-object p0
.end method

.method public static final t(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;Ljava/lang/String;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/b$a;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/b$a;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;->g(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/b;)V

    .line 12
    .line 13
    .line 14
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 15
    .line 16
    return-object p0
.end method

.method public static final u(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;)Lkotlin/Unit;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/b$d;->a:Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/b$d;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;->g(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/b;)V

    .line 4
    .line 5
    .line 6
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 7
    .line 8
    return-object p0
.end method

.method public static final v(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/a;->n(Lcom/zykj/huiwei/launcher/ui/dialog/changePsdDialog/ChangePsdViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final w(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;ZZLjava/lang/String;ILandroidx/compose/runtime/Composer;II)V
    .locals 111

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v0, p3

    move-object/from16 v1, p4

    move/from16 v4, p10

    move/from16 v5, p11

    const-string v6, "label"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "value"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "onValueChange"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "securityLevel"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v6, 0x3d1e6a

    move-object/from16 v7, p9

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
    move/from16 v14, p6

    goto :goto_8

    :cond_c
    and-int/2addr v14, v4

    if-nez v14, :cond_b

    move/from16 v14, p6

    invoke-interface {v7, v14}, Landroidx/compose/runtime/Composer;->changed(Z)Z

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

    const/high16 v16, 0xc00000

    if-eqz v15, :cond_e

    or-int v8, v8, v16

    move-object/from16 v9, p7

    goto :goto_a

    :cond_e
    and-int v16, v4, v16

    move-object/from16 v9, p7

    if-nez v16, :cond_10

    invoke-interface {v7, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_f

    const/high16 v16, 0x800000

    goto :goto_9

    :cond_f
    const/high16 v16, 0x400000

    :goto_9
    or-int v8, v8, v16

    :cond_10
    :goto_a
    and-int/lit16 v11, v5, 0x100

    const/high16 v18, 0x6000000

    if-eqz v11, :cond_11

    or-int v8, v8, v18

    move/from16 v6, p8

    goto :goto_c

    :cond_11
    and-int v18, v4, v18

    move/from16 v6, p8

    if-nez v18, :cond_13

    invoke-interface {v7, v6}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v18

    if-eqz v18, :cond_12

    const/high16 v18, 0x4000000

    goto :goto_b

    :cond_12
    const/high16 v18, 0x2000000

    :goto_b
    or-int v8, v8, v18

    :cond_13
    :goto_c
    const v18, 0x2492491

    and-int v3, v8, v18

    const v4, 0x2492490

    const/4 v5, 0x1

    if-eq v3, v4, :cond_14

    move v3, v5

    goto :goto_d

    :cond_14
    const/4 v3, 0x0

    :goto_d
    and-int/lit8 v4, v8, 0x1

    invoke-interface {v7, v3, v4}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v3

    if-eqz v3, :cond_21

    and-int/lit8 v3, p11, 0x1

    if-eqz v3, :cond_15

    .line 2
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    move-object/from16 v102, v3

    goto :goto_e

    :cond_15
    move-object/from16 v102, p0

    :goto_e
    if-eqz v10, :cond_16

    move v3, v5

    goto :goto_f

    :cond_16
    move v3, v12

    :goto_f
    if-eqz v13, :cond_17

    const/4 v4, 0x0

    goto :goto_10

    :cond_17
    move v4, v14

    :goto_10
    const/4 v10, 0x0

    if-eqz v15, :cond_18

    move-object/from16 v103, v10

    goto :goto_11

    :cond_18
    move-object/from16 v103, v9

    :goto_11
    if-eqz v11, :cond_19

    const/16 v6, 0x10

    .line 3
    :cond_19
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v9

    if-eqz v9, :cond_1a

    const/4 v9, -0x1

    const-string v11, "com.zykj.huiwei.launcher.ui.dialog.changePsdDialog.ChangePsdTextField (ChangePasswordDialogContent.kt:186)"

    const v12, 0x3d1e6a

    invoke-static {v12, v8, v9, v11}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_1a
    if-nez v103, :cond_1b

    const v9, -0x1a90a549

    .line 4
    invoke-interface {v7, v9}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-virtual {v1}, Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;->d()I

    move-result v9

    const/4 v11, 0x0

    invoke-static {v9, v7, v11}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_12

    :cond_1b
    const/4 v11, 0x0

    const v9, -0x1a90a6dc

    invoke-interface {v7, v9}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    move-object/from16 v9, v103

    .line 5
    :goto_12
    sget-object v12, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    const/4 v13, 0x0

    invoke-static {v12, v13, v5, v10}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v101

    .line 6
    new-instance v12, Landroidx/compose/ui/text/input/PasswordVisualTransformation;

    invoke-direct {v12, v11, v5, v10}, Landroidx/compose/ui/text/input/PasswordVisualTransformation;-><init>(CILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    new-instance v17, Landroidx/compose/foundation/text/KeyboardOptions;

    .line 8
    sget-object v10, Landroidx/compose/ui/text/input/KeyboardType;->Companion:Landroidx/compose/ui/text/input/KeyboardType$Companion;

    invoke-virtual {v10}, Landroidx/compose/ui/text/input/KeyboardType$Companion;->getPassword-PjHm6EE()I

    move-result v20

    const/16 v25, 0x7b

    const/16 v26, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    .line 9
    invoke-direct/range {v17 .. v26}, Landroidx/compose/foundation/text/KeyboardOptions;-><init>(ILjava/lang/Boolean;IILandroidx/compose/ui/text/input/PlatformImeOptions;Ljava/lang/Boolean;Landroidx/compose/ui/text/intl/LocaleList;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v26, v7

    move-object/from16 v104, v17

    .line 10
    sget-object v7, Landroidx/compose/material3/OutlinedTextFieldDefaults;->INSTANCE:Landroidx/compose/material3/OutlinedTextFieldDefaults;

    .line 11
    sget-object v10, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    move v13, v8

    move-object v14, v9

    invoke-virtual {v10}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    move-result-wide v8

    move-object v15, v10

    move/from16 v17, v11

    .line 12
    invoke-virtual {v15}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    move-result-wide v10

    move-object/from16 v18, v14

    move-object/from16 v19, v15

    .line 13
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    move-result-wide v14

    move-object/from16 v21, v12

    move/from16 v20, v13

    .line 14
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    move-result-wide v12

    .line 15
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    move-result-wide v29

    .line 16
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

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
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/Color$Companion;->getRed-0d7_KjU()J

    move-result-wide v33

    const/16 v39, 0xe

    const/16 v40, 0x0

    const v35, 0x3f4ccccd    # 0.8f

    const/16 v37, 0x0

    const/16 v38, 0x0

    invoke-static/range {v33 .. v40}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v35

    .line 18
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

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
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    move-result-wide v24

    move/from16 v23, v17

    const/16 v22, 0x800

    .line 20
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/Color$Companion;->getTransparent-0d7_KjU()J

    move-result-wide v16

    const-wide v27, 0xffff3b30L

    .line 21
    invoke-static/range {v27 .. v28}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    move-result-wide v75

    move-object/from16 v27, v18

    move-object/from16 v28, v19

    .line 22
    invoke-virtual/range {v28 .. v28}, Landroidx/compose/ui/graphics/Color$Companion;->getTransparent-0d7_KjU()J

    move-result-wide v18

    .line 23
    invoke-virtual/range {v28 .. v28}, Landroidx/compose/ui/graphics/Color$Companion;->getTransparent-0d7_KjU()J

    move-result-wide v37

    const v99, 0x7fff8640

    const/16 v100, 0xff7

    move/from16 v28, v20

    move-object/from16 v39, v21

    const-wide/16 v20, 0x0

    move-object/from16 v93, v26

    move-object/from16 v40, v27

    const-wide/16 v26, 0x0

    move/from16 v41, v28

    const/16 v28, 0x0

    move/from16 v42, v22

    move/from16 v43, v23

    move-wide/from16 v22, v37

    const-wide/16 v37, 0x0

    move-object/from16 v45, v39

    move-object/from16 v44, v40

    const-wide/16 v39, 0x0

    move/from16 v46, v41

    move/from16 v47, v42

    const-wide/16 v41, 0x0

    move/from16 v49, v43

    move-object/from16 v48, v44

    const-wide/16 v43, 0x0

    move-object/from16 v51, v45

    move/from16 v50, v46

    const-wide/16 v45, 0x0

    move/from16 v53, v47

    move-object/from16 v52, v48

    const-wide/16 v47, 0x0

    move/from16 v55, v49

    move/from16 v54, v50

    const-wide/16 v49, 0x0

    move-object/from16 v57, v51

    move-object/from16 v56, v52

    const-wide/16 v51, 0x0

    move/from16 v59, v53

    move/from16 v58, v54

    const-wide/16 v53, 0x0

    move/from16 v61, v55

    move-object/from16 v60, v56

    const-wide/16 v55, 0x0

    move-object/from16 v63, v57

    move/from16 v62, v58

    const-wide/16 v57, 0x0

    move/from16 v65, v59

    move-object/from16 v64, v60

    const-wide/16 v59, 0x0

    move/from16 v67, v61

    move/from16 v66, v62

    const-wide/16 v61, 0x0

    move-object/from16 v69, v63

    move-object/from16 v68, v64

    const-wide/16 v63, 0x0

    move/from16 v71, v65

    move/from16 v70, v66

    const-wide/16 v65, 0x0

    move/from16 v73, v67

    move-object/from16 v72, v68

    const-wide/16 v67, 0x0

    move-object/from16 v77, v69

    move/from16 v74, v70

    const-wide/16 v69, 0x0

    move/from16 v79, v71

    move-object/from16 v78, v72

    const-wide/16 v71, 0x0

    move/from16 v81, v73

    move/from16 v80, v74

    const-wide/16 v73, 0x0

    move-object/from16 v83, v77

    move-object/from16 v82, v78

    const-wide/16 v77, 0x0

    move/from16 v85, v79

    move/from16 v84, v80

    const-wide/16 v79, 0x0

    move/from16 v87, v81

    move-object/from16 v86, v82

    const-wide/16 v81, 0x0

    move-object/from16 v89, v83

    move/from16 v88, v84

    const-wide/16 v83, 0x0

    move/from16 v91, v85

    move-object/from16 v90, v86

    const-wide/16 v85, 0x0

    move/from16 v94, v87

    move/from16 v92, v88

    const-wide/16 v87, 0x0

    move-object/from16 v96, v89

    move-object/from16 v95, v90

    const-wide/16 v89, 0x0

    move/from16 v98, v91

    move/from16 v97, v92

    const-wide/16 v91, 0x0

    move/from16 v105, v94

    const v94, 0x6c36db6

    move-object/from16 v106, v95

    const/16 v95, 0x6db0

    move-object/from16 v107, v96

    const/16 v96, 0x0

    move/from16 v108, v97

    const/16 v97, 0x6000

    move/from16 v109, v98

    const/16 v98, 0xc00

    move-object/from16 v110, v106

    move/from16 v5, v108

    move/from16 v106, v4

    move/from16 v4, v109

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

    const/high16 v8, 0xe000000

    and-int/2addr v8, v5

    const/high16 v9, 0x4000000

    if-ne v8, v9, :cond_1c

    const/4 v11, 0x1

    goto :goto_13

    :cond_1c
    move/from16 v11, v105

    :goto_13
    and-int/lit16 v8, v5, 0x1c00

    if-ne v8, v4, :cond_1d

    const/16 v105, 0x1

    :cond_1d
    or-int v4, v11, v105

    .line 30
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v8

    if-nez v4, :cond_1e

    .line 31
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v8, v4, :cond_1f

    .line 32
    :cond_1e
    new-instance v8, Ld4/k;

    invoke-direct {v8, v6, v0}, Ld4/k;-><init>(ILkotlin/jvm/functions/Function1;)V

    .line 33
    invoke-interface {v7, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 34
    :cond_1f
    move-object v4, v8

    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 35
    new-instance v8, Ld4/l;

    invoke-direct {v8, v3, v1}, Ld4/l;-><init>(ZLcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;)V

    const v9, -0x7dff6ef

    const/16 v10, 0x36

    const/4 v11, 0x1

    invoke-static {v9, v11, v8, v7, v10}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v8

    .line 36
    new-instance v9, Ld4/m;

    invoke-direct {v9, v2}, Ld4/m;-><init>(Ljava/lang/String;)V

    const v12, 0x7344961

    invoke-static {v12, v11, v9, v7, v10}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v13

    .line 37
    new-instance v9, Ld4/b;

    move/from16 v14, v106

    move-object/from16 v12, v110

    invoke-direct {v9, v14, v12}, Ld4/b;-><init>(ZLjava/lang/String;)V

    const v12, -0x205f6e9d

    invoke-static {v12, v11, v9, v7, v10}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v15

    shr-int/lit8 v9, v5, 0x6

    and-int/lit8 v9, v9, 0xe

    const v10, 0xc00180

    or-int v27, v9, v10

    shr-int/lit8 v5, v5, 0x9

    and-int/lit16 v5, v5, 0x1c00

    const v9, 0xc30186

    or-int v28, v5, v9

    const/16 v29, 0x0

    const v30, 0x1d0b78

    move v5, v6

    const/4 v6, 0x0

    move-object/from16 v26, v7

    const/4 v7, 0x0

    move-object v10, v8

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

    move/from16 v31, v3

    move/from16 v32, v5

    move-object/from16 v5, v101

    move-object/from16 v18, v104

    move/from16 v16, v106

    move-object/from16 v17, v107

    move-object/from16 v3, p2

    .line 38
    invoke-static/range {v3 .. v30}, Landroidx/compose/material3/OutlinedTextFieldKt;->OutlinedTextField(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_20

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_20
    move/from16 v6, v31

    move/from16 v9, v32

    move-object/from16 v8, v103

    move/from16 v7, v106

    goto :goto_14

    :cond_21
    move-object/from16 v26, v7

    .line 39
    invoke-interface/range {v26 .. v26}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v102, p0

    move-object v8, v9

    move v7, v14

    move v9, v6

    move v6, v12

    .line 40
    :goto_14
    invoke-interface/range {v26 .. v26}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v12

    if-eqz v12, :cond_22

    new-instance v0, Ld4/c;

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v10, p10

    move/from16 v11, p11

    move-object v5, v1

    move-object/from16 v1, v102

    invoke-direct/range {v0 .. v11}, Ld4/c;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;ZZLjava/lang/String;III)V

    invoke-interface {v12, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_22
    return-void
.end method

.method public static final x(ILkotlin/jvm/functions/Function1;Ljava/lang/String;)Lkotlin/Unit;
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

.method public static final y(ZLcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 25

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    move/from16 v1, p3

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
    if-eqz v2, :cond_3

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
    const-string v3, "com.zykj.huiwei.launcher.ui.dialog.changePsdDialog.ChangePsdTextField.<anonymous> (ChangePasswordDialogContent.kt:198)"

    .line 30
    .line 31
    const v5, -0x7dff6ef

    .line 32
    .line 33
    .line 34
    invoke-static {v5, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    if-nez p0, :cond_2

    .line 38
    .line 39
    const v1, 0x70421055

    .line 40
    .line 41
    .line 42
    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 43
    .line 44
    .line 45
    const v1, 0x7f110177

    .line 46
    .line 47
    .line 48
    const/4 v2, 0x6

    .line 49
    invoke-static {v1, v0, v2}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    :goto_1
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 54
    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_2
    const v1, 0x704215a4

    .line 58
    .line 59
    .line 60
    invoke-interface {v0, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual/range {p1 .. p1}, Lcom/zykj/huiwei/launcher/viewmodels/PasswordSecurityLevel;->b()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    invoke-static {v1, v0, v4}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    goto :goto_1

    .line 72
    :goto_2
    sget-object v2, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 73
    .line 74
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 75
    .line 76
    .line 77
    move-result-wide v3

    .line 78
    const/16 v9, 0xe

    .line 79
    .line 80
    const/4 v10, 0x0

    .line 81
    const v5, 0x3e99999a    # 0.3f

    .line 82
    .line 83
    .line 84
    const/4 v6, 0x0

    .line 85
    const/4 v7, 0x0

    .line 86
    const/4 v8, 0x0

    .line 87
    invoke-static/range {v3 .. v10}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    .line 88
    .line 89
    .line 90
    move-result-wide v2

    .line 91
    const/16 v4, 0xe

    .line 92
    .line 93
    invoke-static {v4}, Lo3/a;->a(I)J

    .line 94
    .line 95
    .line 96
    move-result-wide v4

    .line 97
    const/16 v23, 0x0

    .line 98
    .line 99
    const v24, 0x1fff2

    .line 100
    .line 101
    .line 102
    move-object v0, v1

    .line 103
    const/4 v1, 0x0

    .line 104
    const/4 v6, 0x0

    .line 105
    const/4 v7, 0x0

    .line 106
    const/4 v8, 0x0

    .line 107
    const-wide/16 v9, 0x0

    .line 108
    .line 109
    const/4 v11, 0x0

    .line 110
    const/4 v12, 0x0

    .line 111
    const-wide/16 v13, 0x0

    .line 112
    .line 113
    const/4 v15, 0x0

    .line 114
    const/16 v16, 0x0

    .line 115
    .line 116
    const/16 v17, 0x0

    .line 117
    .line 118
    const/16 v18, 0x0

    .line 119
    .line 120
    const/16 v19, 0x0

    .line 121
    .line 122
    const/16 v20, 0x0

    .line 123
    .line 124
    const/16 v22, 0xd80

    .line 125
    .line 126
    move-object/from16 v21, p2

    .line 127
    .line 128
    invoke-static/range {v0 .. v24}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 129
    .line 130
    .line 131
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 132
    .line 133
    .line 134
    move-result v0

    .line 135
    if-eqz v0, :cond_4

    .line 136
    .line 137
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 138
    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_3
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 142
    .line 143
    .line 144
    :cond_4
    :goto_3
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 145
    .line 146
    return-object v0
.end method

.method public static final z(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;
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
    const-string v2, "com.zykj.huiwei.launcher.ui.dialog.changePsdDialog.ChangePsdTextField.<anonymous> (ChangePasswordDialogContent.kt:206)"

    .line 29
    .line 30
    const v4, 0x7344961

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
