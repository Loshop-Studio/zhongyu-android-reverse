.class public abstract Lcom/zykj/mistake/feature/home/k;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lcom/zykj/mistake/main/MainShellViewModel;Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;Landroidx/compose/runtime/Composer;I)V
    .locals 8

    .line 1
    const-string v3, "shellViewModel"

    .line 2
    .line 3
    invoke-static {p0, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const v3, 0x5d1d8842

    .line 7
    .line 8
    .line 9
    invoke-interface {p3, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    and-int/lit8 v5, p4, 0x6

    .line 14
    .line 15
    if-nez v5, :cond_1

    .line 16
    .line 17
    invoke-interface {v4, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    if-eqz v5, :cond_0

    .line 22
    .line 23
    const/4 v5, 0x4

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v5, 0x2

    .line 26
    :goto_0
    or-int/2addr v5, p4

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move v5, p4

    .line 29
    :goto_1
    and-int/lit8 v6, p4, 0x30

    .line 30
    .line 31
    if-nez v6, :cond_3

    .line 32
    .line 33
    invoke-interface {v4, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    if-eqz v6, :cond_2

    .line 38
    .line 39
    const/16 v6, 0x20

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_2
    const/16 v6, 0x10

    .line 43
    .line 44
    :goto_2
    or-int/2addr v5, v6

    .line 45
    :cond_3
    and-int/lit16 v6, p4, 0x180

    .line 46
    .line 47
    if-nez v6, :cond_5

    .line 48
    .line 49
    invoke-interface {v4, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    if-eqz v6, :cond_4

    .line 54
    .line 55
    const/16 v6, 0x100

    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_4
    const/16 v6, 0x80

    .line 59
    .line 60
    :goto_3
    or-int/2addr v5, v6

    .line 61
    :cond_5
    and-int/lit16 v6, v5, 0x93

    .line 62
    .line 63
    const/16 v7, 0x92

    .line 64
    .line 65
    if-eq v6, v7, :cond_6

    .line 66
    .line 67
    const/4 v6, 0x1

    .line 68
    goto :goto_4

    .line 69
    :cond_6
    const/4 v6, 0x0

    .line 70
    :goto_4
    and-int/lit8 v7, v5, 0x1

    .line 71
    .line 72
    invoke-interface {v4, v6, v7}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    if-eqz v6, :cond_a

    .line 77
    .line 78
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    if-eqz v6, :cond_7

    .line 83
    .line 84
    const/4 v6, -0x1

    .line 85
    const-string v7, "com.zykj.mistake.feature.home.HomeShellEffectHandler (HomeShellEffectHandler.kt:17)"

    .line 86
    .line 87
    invoke-static {v3, v5, v6, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 88
    .line 89
    .line 90
    :cond_7
    invoke-interface {v4, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    invoke-interface {v4, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    or-int/2addr v3, v6

    .line 99
    invoke-interface {v4, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    or-int/2addr v3, v6

    .line 104
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    if-nez v3, :cond_8

    .line 109
    .line 110
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 111
    .line 112
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    if-ne v6, v3, :cond_9

    .line 117
    .line 118
    :cond_8
    new-instance v6, Lcom/zykj/mistake/feature/home/HomeShellEffectHandlerKt$HomeShellEffectHandler$1$1;

    .line 119
    .line 120
    const/4 v3, 0x0

    .line 121
    invoke-direct {v6, p0, p1, p2, v3}, Lcom/zykj/mistake/feature/home/HomeShellEffectHandlerKt$HomeShellEffectHandler$1$1;-><init>(Lcom/zykj/mistake/main/MainShellViewModel;Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;Lh6/c;)V

    .line 122
    .line 123
    .line 124
    invoke-interface {v4, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    :cond_9
    move-object v3, v6

    .line 128
    check-cast v3, Lr6/e;

    .line 129
    .line 130
    and-int/lit16 v5, v5, 0x3fe

    .line 131
    .line 132
    move-object v0, p0

    .line 133
    move-object v1, p1

    .line 134
    move-object v2, p2

    .line 135
    invoke-static/range {v0 .. v5}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lr6/e;Landroidx/compose/runtime/Composer;I)V

    .line 136
    .line 137
    .line 138
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-eqz v0, :cond_b

    .line 143
    .line 144
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 145
    .line 146
    .line 147
    goto :goto_5

    .line 148
    :cond_a
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 149
    .line 150
    .line 151
    :cond_b
    :goto_5
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 152
    .line 153
    .line 154
    move-result-object v6

    .line 155
    if-eqz v6, :cond_c

    .line 156
    .line 157
    new-instance v0, Landroidx/lifecycle/compose/g;

    .line 158
    .line 159
    const/16 v2, 0x8

    .line 160
    .line 161
    move-object v3, p0

    .line 162
    move-object v4, p1

    .line 163
    move-object v5, p2

    .line 164
    move v1, p4

    .line 165
    invoke-direct/range {v0 .. v5}, Landroidx/lifecycle/compose/g;-><init>(IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 166
    .line 167
    .line 168
    invoke-interface {v6, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 169
    .line 170
    .line 171
    :cond_c
    return-void
.end method
