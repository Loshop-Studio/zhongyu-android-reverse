.class public abstract Lt4/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroidx/compose/animation/core/TweenSpec;

.field public static final b:Landroidx/compose/animation/core/TweenSpec;

.field public static final c:Landroidx/compose/animation/core/TweenSpec;

.field public static final d:Landroidx/compose/animation/core/TweenSpec;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    invoke-static {}, Landroidx/compose/animation/core/EasingKt;->getFastOutSlowInEasing()Landroidx/compose/animation/core/Easing;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/16 v1, 0x1f4

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-static {v1, v2, v0, v3, v4}, Landroidx/compose/animation/core/AnimationSpecKt;->tween$default(IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lt4/g;->a:Landroidx/compose/animation/core/TweenSpec;

    .line 15
    .line 16
    invoke-static {}, Landroidx/compose/animation/core/EasingKt;->getFastOutLinearInEasing()Landroidx/compose/animation/core/Easing;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const/16 v5, 0x190

    .line 21
    .line 22
    invoke-static {v5, v2, v0, v3, v4}, Landroidx/compose/animation/core/AnimationSpecKt;->tween$default(IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sput-object v0, Lt4/g;->b:Landroidx/compose/animation/core/TweenSpec;

    .line 27
    .line 28
    invoke-static {}, Landroidx/compose/animation/core/EasingKt;->getLinearEasing()Landroidx/compose/animation/core/Easing;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v1, v2, v0, v3, v4}, Landroidx/compose/animation/core/AnimationSpecKt;->tween$default(IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    sput-object v0, Lt4/g;->c:Landroidx/compose/animation/core/TweenSpec;

    .line 37
    .line 38
    invoke-static {}, Landroidx/compose/animation/core/EasingKt;->getLinearEasing()Landroidx/compose/animation/core/Easing;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v5, v2, v0, v3, v4}, Landroidx/compose/animation/core/AnimationSpecKt;->tween$default(IILandroidx/compose/animation/core/Easing;ILjava/lang/Object;)Landroidx/compose/animation/core/TweenSpec;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sput-object v0, Lt4/g;->d:Landroidx/compose/animation/core/TweenSpec;

    .line 47
    .line 48
    return-void
.end method

.method public static final a(Landroidx/navigation/NavHostController;Lcom/zykj/mistake/main/MainShellViewModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v15, p1

    .line 4
    .line 5
    const-string v1, "navController"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v1, "shellViewModel"

    .line 11
    .line 12
    invoke-static {v15, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const v1, 0x672dd5be

    .line 16
    .line 17
    .line 18
    move-object/from16 v2, p3

    .line 19
    .line 20
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 21
    .line 22
    .line 23
    move-result-object v11

    .line 24
    and-int/lit8 v2, p4, 0x6

    .line 25
    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    const/4 v2, 0x4

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v2, 0x2

    .line 37
    :goto_0
    or-int v2, p4, v2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move/from16 v2, p4

    .line 41
    .line 42
    :goto_1
    and-int/lit8 v3, p4, 0x30

    .line 43
    .line 44
    if-nez v3, :cond_3

    .line 45
    .line 46
    invoke-interface {v11, v15}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_2

    .line 51
    .line 52
    const/16 v3, 0x20

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    const/16 v3, 0x10

    .line 56
    .line 57
    :goto_2
    or-int/2addr v2, v3

    .line 58
    :cond_3
    or-int/lit16 v2, v2, 0x180

    .line 59
    .line 60
    and-int/lit16 v3, v2, 0x93

    .line 61
    .line 62
    const/16 v4, 0x92

    .line 63
    .line 64
    const/4 v5, 0x1

    .line 65
    if-eq v3, v4, :cond_4

    .line 66
    .line 67
    move v3, v5

    .line 68
    goto :goto_3

    .line 69
    :cond_4
    const/4 v3, 0x0

    .line 70
    :goto_3
    and-int/lit8 v4, v2, 0x1

    .line 71
    .line 72
    invoke-interface {v11, v3, v4}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-eqz v3, :cond_9

    .line 77
    .line 78
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 79
    .line 80
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    if-eqz v4, :cond_5

    .line 85
    .line 86
    const/4 v4, -0x1

    .line 87
    const-string v6, "com.zykj.mistake.navigation.MainNavHost (MainNavHost.kt:69)"

    .line 88
    .line 89
    invoke-static {v1, v2, v4, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 90
    .line 91
    .line 92
    :cond_5
    const/4 v1, 0x0

    .line 93
    const/4 v4, 0x0

    .line 94
    invoke-static {v3, v1, v5, v4}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-interface {v11, v15}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    if-nez v4, :cond_6

    .line 107
    .line 108
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 109
    .line 110
    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    if-ne v5, v4, :cond_7

    .line 115
    .line 116
    :cond_6
    new-instance v5, Lcom/zykj/mistake/main/f;

    .line 117
    .line 118
    const/4 v4, 0x3

    .line 119
    invoke-direct {v5, v15, v4}, Lcom/zykj/mistake/main/f;-><init>(Lcom/zykj/mistake/main/MainShellViewModel;I)V

    .line 120
    .line 121
    .line 122
    invoke-interface {v11, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    :cond_7
    move-object v10, v5

    .line 126
    check-cast v10, Lr6/c;

    .line 127
    .line 128
    and-int/lit8 v2, v2, 0xe

    .line 129
    .line 130
    or-int/lit8 v12, v2, 0x30

    .line 131
    .line 132
    const/4 v13, 0x0

    .line 133
    const/16 v14, 0x3f8

    .line 134
    .line 135
    move-object v2, v1

    .line 136
    const-string v1, "home"

    .line 137
    .line 138
    move-object v4, v3

    .line 139
    const/4 v3, 0x0

    .line 140
    move-object v5, v4

    .line 141
    const/4 v4, 0x0

    .line 142
    move-object v6, v5

    .line 143
    const/4 v5, 0x0

    .line 144
    move-object v7, v6

    .line 145
    const/4 v6, 0x0

    .line 146
    move-object v8, v7

    .line 147
    const/4 v7, 0x0

    .line 148
    move-object v9, v8

    .line 149
    const/4 v8, 0x0

    .line 150
    move-object/from16 v16, v9

    .line 151
    .line 152
    const/4 v9, 0x0

    .line 153
    invoke-static/range {v0 .. v14}, Landroidx/navigation/compose/NavHostKt;->NavHost(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Landroidx/compose/runtime/Composer;III)V

    .line 154
    .line 155
    .line 156
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    if-eqz v0, :cond_8

    .line 161
    .line 162
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 163
    .line 164
    .line 165
    :cond_8
    move-object/from16 v5, v16

    .line 166
    .line 167
    goto :goto_4

    .line 168
    :cond_9
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 169
    .line 170
    .line 171
    move-object/from16 v5, p2

    .line 172
    .line 173
    :goto_4
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    if-eqz v6, :cond_a

    .line 178
    .line 179
    new-instance v0, Landroidx/lifecycle/compose/g;

    .line 180
    .line 181
    const/16 v2, 0x12

    .line 182
    .line 183
    move-object/from16 v3, p0

    .line 184
    .line 185
    move/from16 v1, p4

    .line 186
    .line 187
    move-object v4, v15

    .line 188
    invoke-direct/range {v0 .. v5}, Landroidx/lifecycle/compose/g;-><init>(IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    invoke-interface {v6, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 192
    .line 193
    .line 194
    :cond_a
    return-void
.end method

.method public static final b()Landroidx/compose/animation/ExitTransition;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/mistake/feature/collection/component/j;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lcom/zykj/mistake/feature/collection/component/j;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v1, Lt4/g;->b:Landroidx/compose/animation/core/TweenSpec;

    .line 8
    .line 9
    invoke-static {v1, v0}, Landroidx/compose/animation/EnterExitTransitionKt;->slideOutHorizontally(Landroidx/compose/animation/core/FiniteAnimationSpec;Lr6/c;)Landroidx/compose/animation/ExitTransition;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public static final c()Landroidx/compose/animation/EnterTransition;
    .locals 2

    .line 1
    new-instance v0, Ln7/l;

    .line 2
    .line 3
    const/16 v1, 0x11

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ln7/l;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Lt4/g;->d:Landroidx/compose/animation/core/TweenSpec;

    .line 9
    .line 10
    invoke-static {v1, v0}, Landroidx/compose/animation/EnterExitTransitionKt;->slideInHorizontally(Landroidx/compose/animation/core/FiniteAnimationSpec;Lr6/c;)Landroidx/compose/animation/EnterTransition;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0
.end method

.method public static final d()Landroidx/compose/animation/ExitTransition;
    .locals 2

    .line 1
    new-instance v0, Ln7/l;

    .line 2
    .line 3
    const/16 v1, 0x11

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ln7/l;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Lt4/g;->c:Landroidx/compose/animation/core/TweenSpec;

    .line 9
    .line 10
    invoke-static {v1, v0}, Landroidx/compose/animation/EnterExitTransitionKt;->slideOutHorizontally(Landroidx/compose/animation/core/FiniteAnimationSpec;Lr6/c;)Landroidx/compose/animation/ExitTransition;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0
.end method
