.class public abstract Lcom/zykj/mistake/feature/ask/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V
    .locals 10

    .line 1
    const-string v0, "backStackEntry"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const v0, 0x55b89558

    .line 7
    .line 8
    .line 9
    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 10
    .line 11
    .line 12
    move-result-object v5

    .line 13
    and-int/lit8 p1, p2, 0x6

    .line 14
    .line 15
    const/4 v1, 0x2

    .line 16
    if-nez p1, :cond_1

    .line 17
    .line 18
    invoke-interface {v5, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    const/4 p1, 0x4

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move p1, v1

    .line 27
    :goto_0
    or-int/2addr p1, p2

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move p1, p2

    .line 30
    :goto_1
    and-int/lit8 v2, p1, 0x3

    .line 31
    .line 32
    const/4 v9, 0x0

    .line 33
    if-eq v2, v1, :cond_2

    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    goto :goto_2

    .line 37
    :cond_2
    move v1, v9

    .line 38
    :goto_2
    and-int/lit8 v2, p1, 0x1

    .line 39
    .line 40
    invoke-interface {v5, v1, v2}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_a

    .line 45
    .line 46
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_3

    .line 51
    .line 52
    const/4 v1, -0x1

    .line 53
    const-string v2, "com.zykj.mistake.feature.ask.AskMaterialRoute (AskMaterialRoute.kt:18)"

    .line 54
    .line 55
    invoke-static {v0, p1, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :cond_3
    invoke-virtual {p0}, Landroidx/navigation/NavBackStackEntry;->getId()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    if-nez v0, :cond_4

    .line 71
    .line 72
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 73
    .line 74
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    if-ne v1, v0, :cond_5

    .line 79
    .line 80
    :cond_4
    const-class v0, Lcom/zykj/mistake/feature/ask/f;

    .line 81
    .line 82
    invoke-static {v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-static {p0, v0}, Landroidx/navigation/NavBackStackEntryKt;->toRoute(Landroidx/navigation/NavBackStackEntry;Ly6/c;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    move-object v1, v0

    .line 91
    check-cast v1, Lcom/zykj/mistake/feature/ask/f;

    .line 92
    .line 93
    invoke-interface {v5, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    :cond_5
    move-object v0, v1

    .line 97
    check-cast v0, Lcom/zykj/mistake/feature/ask/f;

    .line 98
    .line 99
    and-int/lit8 p1, p1, 0xe

    .line 100
    .line 101
    move-object v6, v5

    .line 102
    invoke-interface {p0}, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;->getDefaultViewModelCreationExtras()Landroidx/lifecycle/viewmodel/CreationExtras;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    const-class v1, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialViewModel;

    .line 107
    .line 108
    invoke-static {v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    shl-int/lit8 p1, p1, 0x3

    .line 113
    .line 114
    and-int/lit8 v7, p1, 0x70

    .line 115
    .line 116
    const/4 v8, 0x0

    .line 117
    const/4 v3, 0x0

    .line 118
    const/4 v4, 0x0

    .line 119
    move-object v2, p0

    .line 120
    invoke-static/range {v1 .. v8}, Landroidx/lifecycle/viewmodel/compose/ViewModelKt;->viewModel(Ly6/c;Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/ViewModel;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    move-object p1, v2

    .line 125
    check-cast p0, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialViewModel;

    .line 126
    .line 127
    sget-object v1, Lz4/b;->a:Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 128
    .line 129
    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    move-object v8, v1

    .line 134
    check-cast v8, Lz4/a;

    .line 135
    .line 136
    iget-object v1, p0, Lcom/zykj/mistake/feature/ask/MistakeAskMaterialViewModel;->b:Lkotlinx/coroutines/flow/a0;

    .line 137
    .line 138
    move-object v5, v6

    .line 139
    const/4 v6, 0x0

    .line 140
    const/4 v7, 0x7

    .line 141
    const/4 v2, 0x0

    .line 142
    invoke-static/range {v1 .. v7}, Landroidx/lifecycle/compose/FlowExtKt;->collectAsStateWithLifecycle(Lkotlinx/coroutines/flow/m0;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lh6/h;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    move-object v6, v5

    .line 147
    invoke-interface {v6, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    or-int/2addr v2, v3

    .line 156
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    if-nez v2, :cond_6

    .line 161
    .line 162
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 163
    .line 164
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    if-ne v3, v2, :cond_7

    .line 169
    .line 170
    :cond_6
    new-instance v3, Lcom/zykj/mistake/feature/ask/AskMaterialRouteKt$AskMaterialRoute$1$1;

    .line 171
    .line 172
    const/4 v2, 0x0

    .line 173
    invoke-direct {v3, p0, v0, v2}, Lcom/zykj/mistake/feature/ask/AskMaterialRouteKt$AskMaterialRoute$1$1;-><init>(Lcom/zykj/mistake/feature/ask/MistakeAskMaterialViewModel;Lcom/zykj/mistake/feature/ask/f;Lh6/c;)V

    .line 174
    .line 175
    .line 176
    invoke-interface {v6, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    :cond_7
    check-cast v3, Lr6/e;

    .line 180
    .line 181
    invoke-static {v0, v3, v6, v9}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lr6/e;Landroidx/compose/runtime/Composer;I)V

    .line 182
    .line 183
    .line 184
    invoke-static {p0, v0, v8, v6, v9}, Lcom/zykj/mistake/feature/ask/a;->a(Lcom/zykj/mistake/feature/ask/MistakeAskMaterialViewModel;Lcom/zykj/mistake/feature/ask/f;Lz4/a;Landroidx/compose/runtime/Composer;I)V

    .line 185
    .line 186
    .line 187
    invoke-interface {v1}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    check-cast v0, Lcom/zykj/mistake/feature/ask/z;

    .line 192
    .line 193
    invoke-interface {v6, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    if-nez v1, :cond_8

    .line 202
    .line 203
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 204
    .line 205
    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v1

    .line 209
    if-ne v2, v1, :cond_9

    .line 210
    .line 211
    :cond_8
    new-instance v2, Lcom/zykj/mistake/feature/ask/AskMaterialRouteKt$AskMaterialRoute$2$1;

    .line 212
    .line 213
    invoke-direct {v2, p0}, Lcom/zykj/mistake/feature/ask/AskMaterialRouteKt$AskMaterialRoute$2$1;-><init>(Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    invoke-interface {v6, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    :cond_9
    check-cast v2, Ly6/e;

    .line 220
    .line 221
    check-cast v2, Lr6/c;

    .line 222
    .line 223
    invoke-static {v0, v2, v6, v9}, Lcom/zykj/mistake/feature/ask/o0;->j(Lcom/zykj/mistake/feature/ask/z;Lr6/c;Landroidx/compose/runtime/Composer;I)V

    .line 224
    .line 225
    .line 226
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 227
    .line 228
    .line 229
    move-result p0

    .line 230
    if-eqz p0, :cond_b

    .line 231
    .line 232
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 233
    .line 234
    .line 235
    goto :goto_3

    .line 236
    :cond_a
    move-object p1, p0

    .line 237
    move-object v6, v5

    .line 238
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 239
    .line 240
    .line 241
    :cond_b
    :goto_3
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 242
    .line 243
    .line 244
    move-result-object p0

    .line 245
    if-eqz p0, :cond_c

    .line 246
    .line 247
    new-instance v0, Landroidx/navigation/compose/d;

    .line 248
    .line 249
    const/4 v1, 0x1

    .line 250
    invoke-direct {v0, p1, p2, v1}, Landroidx/navigation/compose/d;-><init>(Ljava/lang/Object;II)V

    .line 251
    .line 252
    .line 253
    invoke-interface {p0, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 254
    .line 255
    .line 256
    :cond_c
    return-void
.end method
