.class public abstract Lcom/zykj/mistake/feature/collection/filter/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/navigation/NavBackStackEntry;Lcom/zykj/mistake/main/MainShellViewModel;Landroidx/compose/runtime/Composer;I)V
    .locals 11

    .line 1
    const-string v0, "backStackEntry"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "shellViewModel"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const v0, -0x62474538

    .line 12
    .line 13
    .line 14
    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 15
    .line 16
    .line 17
    move-result-object v5

    .line 18
    and-int/lit8 p2, p3, 0x6

    .line 19
    .line 20
    if-nez p2, :cond_1

    .line 21
    .line 22
    invoke-interface {v5, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    if-eqz p2, :cond_0

    .line 27
    .line 28
    const/4 p2, 0x4

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 p2, 0x2

    .line 31
    :goto_0
    or-int/2addr p2, p3

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move p2, p3

    .line 34
    :goto_1
    and-int/lit8 v1, p3, 0x30

    .line 35
    .line 36
    if-nez v1, :cond_3

    .line 37
    .line 38
    invoke-interface {v5, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    const/16 v1, 0x20

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/16 v1, 0x10

    .line 48
    .line 49
    :goto_2
    or-int/2addr p2, v1

    .line 50
    :cond_3
    and-int/lit8 v1, p2, 0x13

    .line 51
    .line 52
    const/16 v2, 0x12

    .line 53
    .line 54
    const/4 v9, 0x0

    .line 55
    if-eq v1, v2, :cond_4

    .line 56
    .line 57
    const/4 v1, 0x1

    .line 58
    goto :goto_3

    .line 59
    :cond_4
    move v1, v9

    .line 60
    :goto_3
    and-int/lit8 v2, p2, 0x1

    .line 61
    .line 62
    invoke-interface {v5, v1, v2}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_c

    .line 67
    .line 68
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_5

    .line 73
    .line 74
    const/4 v1, -0x1

    .line 75
    const-string v2, "com.zykj.mistake.feature.collection.filter.CollectionFilterResultRoute (CollectionFilterResultRoute.kt:17)"

    .line 76
    .line 77
    invoke-static {v0, p2, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 78
    .line 79
    .line 80
    :cond_5
    invoke-virtual {p0}, Landroidx/navigation/NavBackStackEntry;->getId()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    if-nez v0, :cond_6

    .line 93
    .line 94
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 95
    .line 96
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    if-ne v1, v0, :cond_7

    .line 101
    .line 102
    :cond_6
    const-class v0, Lcom/zykj/mistake/feature/collection/filter/l;

    .line 103
    .line 104
    invoke-static {v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-static {p0, v0}, Landroidx/navigation/NavBackStackEntryKt;->toRoute(Landroidx/navigation/NavBackStackEntry;Ly6/c;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    move-object v1, v0

    .line 113
    check-cast v1, Lcom/zykj/mistake/feature/collection/filter/l;

    .line 114
    .line 115
    invoke-interface {v5, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    :cond_7
    move-object v0, v1

    .line 119
    check-cast v0, Lcom/zykj/mistake/feature/collection/filter/l;

    .line 120
    .line 121
    and-int/lit8 v1, p2, 0xe

    .line 122
    .line 123
    move-object v6, v5

    .line 124
    invoke-interface {p0}, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;->getDefaultViewModelCreationExtras()Landroidx/lifecycle/viewmodel/CreationExtras;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    const-class v2, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;

    .line 129
    .line 130
    invoke-static {v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    shl-int/lit8 v1, v1, 0x3

    .line 135
    .line 136
    and-int/lit8 v7, v1, 0x70

    .line 137
    .line 138
    const/4 v8, 0x0

    .line 139
    const/4 v3, 0x0

    .line 140
    const/4 v4, 0x0

    .line 141
    move-object v1, v2

    .line 142
    move-object v2, p0

    .line 143
    invoke-static/range {v1 .. v8}, Landroidx/lifecycle/viewmodel/compose/ViewModelKt;->viewModel(Ly6/c;Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/ViewModel;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    move-object v8, v2

    .line 148
    check-cast p0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;

    .line 149
    .line 150
    sget-object v1, Lz4/d;->a:Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 151
    .line 152
    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    move-object v10, v1

    .line 157
    check-cast v10, Lz4/c;

    .line 158
    .line 159
    iget-object v1, p0, Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;->d:Lkotlinx/coroutines/flow/a0;

    .line 160
    .line 161
    move-object v5, v6

    .line 162
    const/4 v6, 0x0

    .line 163
    const/4 v7, 0x7

    .line 164
    const/4 v2, 0x0

    .line 165
    invoke-static/range {v1 .. v7}, Landroidx/lifecycle/compose/FlowExtKt;->collectAsStateWithLifecycle(Lkotlinx/coroutines/flow/m0;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lh6/h;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    move-object v6, v5

    .line 170
    invoke-interface {v6, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v2

    .line 174
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    or-int/2addr v2, v3

    .line 179
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    if-nez v2, :cond_8

    .line 184
    .line 185
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 186
    .line 187
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    if-ne v3, v2, :cond_9

    .line 192
    .line 193
    :cond_8
    new-instance v3, Lcom/zykj/mistake/feature/collection/filter/CollectionFilterResultRouteKt$CollectionFilterResultRoute$1$1;

    .line 194
    .line 195
    const/4 v2, 0x0

    .line 196
    invoke-direct {v3, p0, v0, v2}, Lcom/zykj/mistake/feature/collection/filter/CollectionFilterResultRouteKt$CollectionFilterResultRoute$1$1;-><init>(Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;Lcom/zykj/mistake/feature/collection/filter/l;Lh6/c;)V

    .line 197
    .line 198
    .line 199
    invoke-interface {v6, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    :cond_9
    check-cast v3, Lr6/e;

    .line 203
    .line 204
    invoke-static {p0, v3, v6, v9}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lr6/e;Landroidx/compose/runtime/Composer;I)V

    .line 205
    .line 206
    .line 207
    shr-int/lit8 v0, p2, 0x3

    .line 208
    .line 209
    and-int/lit8 v0, v0, 0xe

    .line 210
    .line 211
    invoke-static {p1, p0, v6, v0}, Lcom/zykj/mistake/feature/collection/filter/a;->b(Lcom/zykj/mistake/main/MainShellViewModel;Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;Landroidx/compose/runtime/Composer;I)V

    .line 212
    .line 213
    .line 214
    shl-int/lit8 p2, p2, 0x3

    .line 215
    .line 216
    and-int/lit16 p2, p2, 0x380

    .line 217
    .line 218
    invoke-static {p0, v10, p1, v6, p2}, Lcom/zykj/mistake/feature/collection/filter/a;->a(Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;Lz4/c;Lcom/zykj/mistake/main/MainShellViewModel;Landroidx/compose/runtime/Composer;I)V

    .line 219
    .line 220
    .line 221
    invoke-interface {v1}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object p2

    .line 225
    check-cast p2, Lcom/zykj/mistake/feature/collection/filter/s0;

    .line 226
    .line 227
    invoke-interface {v6, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    if-nez v0, :cond_a

    .line 236
    .line 237
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 238
    .line 239
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    if-ne v1, v0, :cond_b

    .line 244
    .line 245
    :cond_a
    new-instance v1, Lcom/zykj/mistake/feature/collection/filter/CollectionFilterResultRouteKt$CollectionFilterResultRoute$2$1;

    .line 246
    .line 247
    invoke-direct {v1, p0}, Lcom/zykj/mistake/feature/collection/filter/CollectionFilterResultRouteKt$CollectionFilterResultRoute$2$1;-><init>(Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    invoke-interface {v6, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    :cond_b
    check-cast v1, Ly6/e;

    .line 254
    .line 255
    check-cast v1, Lr6/c;

    .line 256
    .line 257
    invoke-static {p2, v1, v6, v9}, Lcom/zykj/mistake/feature/collection/filter/y0;->f(Lcom/zykj/mistake/feature/collection/filter/s0;Lr6/c;Landroidx/compose/runtime/Composer;I)V

    .line 258
    .line 259
    .line 260
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 261
    .line 262
    .line 263
    move-result p0

    .line 264
    if-eqz p0, :cond_d

    .line 265
    .line 266
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 267
    .line 268
    .line 269
    goto :goto_4

    .line 270
    :cond_c
    move-object v8, p0

    .line 271
    move-object v6, v5

    .line 272
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 273
    .line 274
    .line 275
    :cond_d
    :goto_4
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 276
    .line 277
    .line 278
    move-result-object p0

    .line 279
    if-eqz p0, :cond_e

    .line 280
    .line 281
    new-instance p2, Lcom/zykj/mistake/feature/collection/detail/b;

    .line 282
    .line 283
    const/4 v0, 0x1

    .line 284
    invoke-direct {p2, v8, p1, p3, v0}, Lcom/zykj/mistake/feature/collection/detail/b;-><init>(Landroidx/navigation/NavBackStackEntry;Lcom/zykj/mistake/main/MainShellViewModel;II)V

    .line 285
    .line 286
    .line 287
    invoke-interface {p0, p2}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 288
    .line 289
    .line 290
    :cond_e
    return-void
.end method
