.class public final Lcom/friday/user/view/AboutFragment;
.super Lcom/friday/user/view/Hilt_AboutFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final i:Lqc/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/friday/user/view/Hilt_AboutFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, Lcom/friday/user/viewmodel/UserViewModel;

    .line 5
    .line 6
    invoke-static {v0}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Lcom/friday/user/view/AboutFragment$special$$inlined$activityViewModels$default$1;

    .line 11
    .line 12
    invoke-direct {v1, p0}, Lcom/friday/user/view/AboutFragment$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/friday/user/view/AboutFragment$special$$inlined$activityViewModels$default$2;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v2, v3, p0}, Lcom/friday/user/view/AboutFragment$special$$inlined$activityViewModels$default$2;-><init>(Lhd/a;Landroidx/fragment/app/Fragment;)V

    .line 19
    .line 20
    .line 21
    new-instance v3, Lcom/friday/user/view/AboutFragment$special$$inlined$activityViewModels$default$3;

    .line 22
    .line 23
    invoke-direct {v3, p0}, Lcom/friday/user/view/AboutFragment$special$$inlined$activityViewModels$default$3;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, v0, v1, v2, v3}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lod/c;Lhd/a;Lhd/a;Lhd/a;)Lqc/d;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lcom/friday/user/view/AboutFragment;->i:Lqc/d;

    .line 31
    .line 32
    return-void
.end method

.method public static final A(Lcom/friday/user/view/AboutFragment;Landroidx/compose/runtime/Composer;I)Lqc/q;
    .locals 4

    .line 1
    and-int/lit8 v0, p2, 0x3

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v2

    .line 10
    :goto_0
    and-int/lit8 v1, p2, 0x1

    .line 11
    .line 12
    invoke-interface {p1, v0, v1}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    const/4 v0, -0x1

    .line 25
    const-string v1, "com.friday.user.view.AboutFragment.onCreateView.<anonymous>.<anonymous> (AboutFragment.kt:54)"

    .line 26
    .line 27
    const v3, 0x5d5589a6

    .line 28
    .line 29
    .line 30
    invoke-static {v3, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    invoke-virtual {p0}, Lcom/friday/user/view/AboutFragment;->z()Lcom/friday/user/viewmodel/UserViewModel;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-virtual {p2}, Lcom/friday/user/viewmodel/UserViewModel;->p()Z

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    invoke-virtual {p0, p2, p1, v2, v2}, Lcom/friday/user/view/AboutFragment;->u(ZLandroidx/compose/runtime/Composer;II)V

    .line 42
    .line 43
    .line 44
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-eqz p0, :cond_3

    .line 49
    .line 50
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 55
    .line 56
    .line 57
    :cond_3
    :goto_1
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 58
    .line 59
    return-object p0
.end method

.method public static synthetic p(Lcom/friday/user/view/AboutFragment;Landroidx/compose/runtime/Composer;I)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/user/view/AboutFragment;->A(Lcom/friday/user/view/AboutFragment;Landroidx/compose/runtime/Composer;I)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Landroid/content/Context;)Lcom/zykj/policy/ui/PolicyCheckView;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/user/view/AboutFragment;->x(Landroid/content/Context;)Lcom/zykj/policy/ui/PolicyCheckView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lkotlin/jvm/internal/Ref$LongRef;Lkotlin/jvm/internal/Ref$IntRef;Lcom/friday/user/view/AboutFragment;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/user/view/AboutFragment;->w(Lkotlin/jvm/internal/Ref$LongRef;Lkotlin/jvm/internal/Ref$IntRef;Lcom/friday/user/view/AboutFragment;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(ZLcom/friday/user/view/AboutFragment;Landroidx/compose/runtime/Composer;I)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/user/view/AboutFragment;->v(ZLcom/friday/user/view/AboutFragment;Landroidx/compose/runtime/Composer;I)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Lcom/friday/user/view/AboutFragment;ZIILandroidx/compose/runtime/Composer;I)Lqc/q;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/friday/user/view/AboutFragment;->y(Lcom/friday/user/view/AboutFragment;ZIILandroidx/compose/runtime/Composer;I)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final v(ZLcom/friday/user/view/AboutFragment;Landroidx/compose/runtime/Composer;I)Lqc/q;
    .locals 33

    .line 1
    move-object/from16 v3, p2

    .line 2
    .line 3
    move/from16 v0, p3

    .line 4
    .line 5
    and-int/lit8 v1, v0, 0x3

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v10, 0x0

    .line 10
    if-eq v1, v2, :cond_0

    .line 11
    .line 12
    move v1, v4

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v1, v10

    .line 15
    :goto_0
    and-int/lit8 v2, v0, 0x1

    .line 16
    .line 17
    invoke-interface {v3, v1, v2}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_b

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
    const-string v2, "com.friday.user.view.AboutFragment.InfoCard.<anonymous> (AboutFragment.kt:63)"

    .line 31
    .line 32
    const v5, 0x269a9644

    .line 33
    .line 34
    .line 35
    invoke-static {v5, v0, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    new-instance v0, Lkotlin/jvm/internal/Ref$IntRef;

    .line 39
    .line 40
    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    sget-object v25, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 48
    .line 49
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    if-ne v1, v2, :cond_2

    .line 54
    .line 55
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-interface {v3, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    :cond_2
    check-cast v1, Ljava/lang/Number;

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    iput v1, v0, Lkotlin/jvm/internal/Ref$IntRef;->c:I

    .line 69
    .line 70
    new-instance v1, Lkotlin/jvm/internal/Ref$LongRef;

    .line 71
    .line 72
    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    if-ne v2, v5, :cond_3

    .line 84
    .line 85
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 86
    .line 87
    .line 88
    move-result-wide v5

    .line 89
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    :cond_3
    check-cast v2, Ljava/lang/Number;

    .line 97
    .line 98
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 99
    .line 100
    .line 101
    move-result-wide v5

    .line 102
    iput-wide v5, v1, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 103
    .line 104
    sget-object v11, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 105
    .line 106
    const/4 v2, 0x0

    .line 107
    const/4 v5, 0x0

    .line 108
    invoke-static {v11, v2, v4, v5}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    invoke-static {v6, v2, v4, v5}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxHeight$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    sget-object v4, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 117
    .line 118
    invoke-virtual {v4}, Landroidx/compose/foundation/layout/Arrangement;->getCenter()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    sget-object v5, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 123
    .line 124
    invoke-virtual {v5}, Landroidx/compose/ui/Alignment$Companion;->getCenterHorizontally()Landroidx/compose/ui/Alignment$Horizontal;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    const/16 v6, 0x36

    .line 129
    .line 130
    invoke-static {v4, v5, v3, v6}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    invoke-static {v3, v10}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 135
    .line 136
    .line 137
    move-result v5

    .line 138
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    invoke-static {v3, v2}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    sget-object v7, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 147
    .line 148
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lhd/a;

    .line 149
    .line 150
    .line 151
    move-result-object v8

    .line 152
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 153
    .line 154
    .line 155
    move-result-object v9

    .line 156
    if-nez v9, :cond_4

    .line 157
    .line 158
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 159
    .line 160
    .line 161
    :cond_4
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 162
    .line 163
    .line 164
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 165
    .line 166
    .line 167
    move-result v9

    .line 168
    if-eqz v9, :cond_5

    .line 169
    .line 170
    invoke-interface {v3, v8}, Landroidx/compose/runtime/Composer;->createNode(Lhd/a;)V

    .line 171
    .line 172
    .line 173
    goto :goto_1

    .line 174
    :cond_5
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 175
    .line 176
    .line 177
    :goto_1
    invoke-static {v3}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 178
    .line 179
    .line 180
    move-result-object v8

    .line 181
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lhd/p;

    .line 182
    .line 183
    .line 184
    move-result-object v9

    .line 185
    invoke-static {v8, v4, v9}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lhd/p;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    invoke-static {v8, v6, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lhd/p;

    .line 196
    .line 197
    .line 198
    move-result-object v4

    .line 199
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 200
    .line 201
    .line 202
    move-result v6

    .line 203
    if-nez v6, :cond_6

    .line 204
    .line 205
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v6

    .line 209
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 210
    .line 211
    .line 212
    move-result-object v9

    .line 213
    invoke-static {v6, v9}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result v6

    .line 217
    if-nez v6, :cond_7

    .line 218
    .line 219
    :cond_6
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 220
    .line 221
    .line 222
    move-result-object v6

    .line 223
    invoke-interface {v8, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    invoke-interface {v8, v5, v4}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lhd/p;)V

    .line 231
    .line 232
    .line 233
    :cond_7
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lhd/p;

    .line 234
    .line 235
    .line 236
    move-result-object v4

    .line 237
    invoke-static {v8, v2, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 238
    .line 239
    .line 240
    sget-object v2, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 241
    .line 242
    sget v2, Lcom/friday/user/R$mipmap;->icon_about_logo:I

    .line 243
    .line 244
    invoke-static {v2, v3, v10}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    sget v4, Lcom/friday/user/R$dimen;->view_54:I

    .line 249
    .line 250
    invoke-static {v4, v3, v10}, Landroidx/compose/ui/res/PrimitiveResources_androidKt;->dimensionResource(ILandroidx/compose/runtime/Composer;I)F

    .line 251
    .line 252
    .line 253
    move-result v4

    .line 254
    invoke-static {v11, v4}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 255
    .line 256
    .line 257
    move-result-object v4

    .line 258
    sget v5, Lcom/friday/user/R$dimen;->view_3:I

    .line 259
    .line 260
    invoke-static {v5, v3, v10}, Landroidx/compose/ui/res/PrimitiveResources_androidKt;->dimensionResource(ILandroidx/compose/runtime/Composer;I)F

    .line 261
    .line 262
    .line 263
    move-result v5

    .line 264
    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/PaddingKt;->padding-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 265
    .line 266
    .line 267
    move-result-object v12

    .line 268
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v4

    .line 272
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v5

    .line 276
    if-ne v4, v5, :cond_8

    .line 277
    .line 278
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 279
    .line 280
    .line 281
    move-result-object v4

    .line 282
    invoke-interface {v3, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    :cond_8
    move-object v13, v4

    .line 286
    check-cast v13, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 287
    .line 288
    new-instance v4, Lh4/d;

    .line 289
    .line 290
    move-object/from16 v5, p1

    .line 291
    .line 292
    invoke-direct {v4, v1, v0, v5}, Lh4/d;-><init>(Lkotlin/jvm/internal/Ref$LongRef;Lkotlin/jvm/internal/Ref$IntRef;Lcom/friday/user/view/AboutFragment;)V

    .line 293
    .line 294
    .line 295
    const/16 v19, 0x1c

    .line 296
    .line 297
    const/16 v20, 0x0

    .line 298
    .line 299
    const/4 v14, 0x0

    .line 300
    const/4 v15, 0x0

    .line 301
    const/16 v16, 0x0

    .line 302
    .line 303
    const/16 v17, 0x0

    .line 304
    .line 305
    move-object/from16 v18, v4

    .line 306
    .line 307
    invoke-static/range {v12 .. v20}, Landroidx/compose/foundation/ClickableKt;->clickable-O2vRcR0$default(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lhd/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    const/16 v8, 0x30

    .line 312
    .line 313
    const/16 v9, 0x78

    .line 314
    .line 315
    const/4 v1, 0x0

    .line 316
    const/4 v3, 0x0

    .line 317
    const/4 v4, 0x0

    .line 318
    const/4 v5, 0x0

    .line 319
    const/4 v6, 0x0

    .line 320
    move-object v7, v2

    .line 321
    move-object v2, v0

    .line 322
    move-object v0, v7

    .line 323
    move-object/from16 v7, p2

    .line 324
    .line 325
    invoke-static/range {v0 .. v9}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 326
    .line 327
    .line 328
    move-object v3, v7

    .line 329
    sget v0, Lcom/friday/user/R$dimen;->view_10:I

    .line 330
    .line 331
    invoke-static {v0, v3, v10}, Landroidx/compose/ui/res/PrimitiveResources_androidKt;->dimensionResource(ILandroidx/compose/runtime/Composer;I)F

    .line 332
    .line 333
    .line 334
    move-result v0

    .line 335
    int-to-float v1, v10

    .line 336
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 337
    .line 338
    .line 339
    move-result v2

    .line 340
    invoke-static {v11, v2, v0}, Landroidx/compose/foundation/layout/SizeKt;->size-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    invoke-static {v0, v3, v10}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 345
    .line 346
    .line 347
    sget v0, Lcom/friday/user/R$string;->app_name:I

    .line 348
    .line 349
    invoke-static {v0}, Lz1/b;->f(I)Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v4

    .line 353
    const/4 v8, 0x4

    .line 354
    const/4 v9, 0x0

    .line 355
    const-string v5, "HD"

    .line 356
    .line 357
    const-string v6, ""

    .line 358
    .line 359
    const/4 v7, 0x0

    .line 360
    invoke-static/range {v4 .. v9}, Lqd/z;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    invoke-static {}, Lcom/blankj/utilcode/util/AppUtils;->getAppVersionName()Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v2

    .line 368
    new-instance v4, Ljava/lang/StringBuilder;

    .line 369
    .line 370
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 371
    .line 372
    .line 373
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 374
    .line 375
    .line 376
    const-string v0, "V"

    .line 377
    .line 378
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 379
    .line 380
    .line 381
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 382
    .line 383
    .line 384
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    sget-object v2, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 389
    .line 390
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 391
    .line 392
    .line 393
    move-result-wide v4

    .line 394
    sget v2, Lcom/friday/user/R$dimen;->text_9:I

    .line 395
    .line 396
    invoke-static {v2, v3, v10}, Landroidx/compose/ui/res/PrimitiveResources_androidKt;->dimensionResource(ILandroidx/compose/runtime/Composer;I)F

    .line 397
    .line 398
    .line 399
    move-result v2

    .line 400
    invoke-static {v2, v3, v10}, Lz1/b;->m(FLandroidx/compose/runtime/Composer;I)J

    .line 401
    .line 402
    .line 403
    move-result-wide v6

    .line 404
    const/16 v23, 0x0

    .line 405
    .line 406
    const v24, 0x1fff2

    .line 407
    .line 408
    .line 409
    move v2, v1

    .line 410
    const/4 v1, 0x0

    .line 411
    move-wide/from16 v31, v6

    .line 412
    .line 413
    move v7, v2

    .line 414
    move-wide v2, v4

    .line 415
    move-wide/from16 v4, v31

    .line 416
    .line 417
    const/4 v6, 0x0

    .line 418
    move v8, v7

    .line 419
    const/4 v7, 0x0

    .line 420
    move v9, v8

    .line 421
    const/4 v8, 0x0

    .line 422
    move v12, v9

    .line 423
    move v13, v10

    .line 424
    const-wide/16 v9, 0x0

    .line 425
    .line 426
    move-object v14, v11

    .line 427
    const/4 v11, 0x0

    .line 428
    move v15, v12

    .line 429
    const/4 v12, 0x0

    .line 430
    move/from16 v17, v13

    .line 431
    .line 432
    move-object/from16 v16, v14

    .line 433
    .line 434
    const-wide/16 v13, 0x0

    .line 435
    .line 436
    move/from16 v18, v15

    .line 437
    .line 438
    const/4 v15, 0x0

    .line 439
    move-object/from16 v19, v16

    .line 440
    .line 441
    const/16 v16, 0x0

    .line 442
    .line 443
    move/from16 v20, v17

    .line 444
    .line 445
    const/16 v17, 0x0

    .line 446
    .line 447
    move/from16 v21, v18

    .line 448
    .line 449
    const/16 v18, 0x0

    .line 450
    .line 451
    move-object/from16 v22, v19

    .line 452
    .line 453
    const/16 v19, 0x0

    .line 454
    .line 455
    move/from16 v26, v20

    .line 456
    .line 457
    const/16 v20, 0x0

    .line 458
    .line 459
    move-object/from16 v27, v22

    .line 460
    .line 461
    const/16 v22, 0x180

    .line 462
    .line 463
    move/from16 v26, v21

    .line 464
    .line 465
    move-object/from16 v28, v27

    .line 466
    .line 467
    move-object/from16 v21, p2

    .line 468
    .line 469
    invoke-static/range {v0 .. v24}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILhd/l;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 470
    .line 471
    .line 472
    move-object/from16 v3, v21

    .line 473
    .line 474
    sget v0, Lcom/friday/user/R$dimen;->view_5:I

    .line 475
    .line 476
    const/4 v1, 0x0

    .line 477
    invoke-static {v0, v3, v1}, Landroidx/compose/ui/res/PrimitiveResources_androidKt;->dimensionResource(ILandroidx/compose/runtime/Composer;I)F

    .line 478
    .line 479
    .line 480
    move-result v0

    .line 481
    invoke-static/range {v26 .. v26}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 482
    .line 483
    .line 484
    move-result v2

    .line 485
    move-object/from16 v4, v28

    .line 486
    .line 487
    invoke-static {v4, v2, v0}, Landroidx/compose/foundation/layout/SizeKt;->size-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 488
    .line 489
    .line 490
    move-result-object v0

    .line 491
    invoke-static {v0, v3, v1}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 492
    .line 493
    .line 494
    sget v0, Lcom/friday/user/R$string;->studio_name:I

    .line 495
    .line 496
    invoke-static {v0, v3, v1}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    if-eqz p0, :cond_9

    .line 501
    .line 502
    sget v2, Lcom/friday/user/R$color;->app_dark:I

    .line 503
    .line 504
    goto :goto_2

    .line 505
    :cond_9
    sget v2, Lcom/friday/user/R$color;->date_time:I

    .line 506
    .line 507
    :goto_2
    invoke-static {v2, v3, v1}, Landroidx/compose/ui/res/ColorResources_androidKt;->colorResource(ILandroidx/compose/runtime/Composer;I)J

    .line 508
    .line 509
    .line 510
    move-result-wide v5

    .line 511
    sget v2, Lcom/friday/user/R$dimen;->text_8:I

    .line 512
    .line 513
    invoke-static {v2, v3, v1}, Landroidx/compose/ui/res/PrimitiveResources_androidKt;->dimensionResource(ILandroidx/compose/runtime/Composer;I)F

    .line 514
    .line 515
    .line 516
    move-result v2

    .line 517
    invoke-static {v2, v3, v1}, Lz1/b;->m(FLandroidx/compose/runtime/Composer;I)J

    .line 518
    .line 519
    .line 520
    move-result-wide v7

    .line 521
    const/16 v23, 0x0

    .line 522
    .line 523
    const v24, 0x1fff2

    .line 524
    .line 525
    .line 526
    move v13, v1

    .line 527
    const/4 v1, 0x0

    .line 528
    move-wide v2, v5

    .line 529
    const/4 v6, 0x0

    .line 530
    move-object/from16 v28, v4

    .line 531
    .line 532
    move-wide v4, v7

    .line 533
    const/4 v7, 0x0

    .line 534
    const/4 v8, 0x0

    .line 535
    const-wide/16 v9, 0x0

    .line 536
    .line 537
    const/4 v11, 0x0

    .line 538
    const/4 v12, 0x0

    .line 539
    move/from16 v29, v13

    .line 540
    .line 541
    const-wide/16 v13, 0x0

    .line 542
    .line 543
    const/4 v15, 0x0

    .line 544
    const/16 v16, 0x0

    .line 545
    .line 546
    const/16 v17, 0x0

    .line 547
    .line 548
    const/16 v18, 0x0

    .line 549
    .line 550
    const/16 v19, 0x0

    .line 551
    .line 552
    const/16 v20, 0x0

    .line 553
    .line 554
    const/16 v22, 0x0

    .line 555
    .line 556
    move-object/from16 v21, p2

    .line 557
    .line 558
    move-object/from16 v30, v28

    .line 559
    .line 560
    invoke-static/range {v0 .. v24}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILhd/l;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 561
    .line 562
    .line 563
    move-object/from16 v3, v21

    .line 564
    .line 565
    sget v0, Lcom/friday/user/R$dimen;->view_29:I

    .line 566
    .line 567
    const/4 v13, 0x0

    .line 568
    invoke-static {v0, v3, v13}, Landroidx/compose/ui/res/PrimitiveResources_androidKt;->dimensionResource(ILandroidx/compose/runtime/Composer;I)F

    .line 569
    .line 570
    .line 571
    move-result v0

    .line 572
    invoke-static/range {v26 .. v26}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 573
    .line 574
    .line 575
    move-result v1

    .line 576
    move-object/from16 v14, v30

    .line 577
    .line 578
    invoke-static {v14, v1, v0}, Landroidx/compose/foundation/layout/SizeKt;->size-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 579
    .line 580
    .line 581
    move-result-object v0

    .line 582
    invoke-static {v0, v3, v13}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 583
    .line 584
    .line 585
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    move-result-object v0

    .line 589
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    move-result-object v1

    .line 593
    if-ne v0, v1, :cond_a

    .line 594
    .line 595
    new-instance v0, Lh4/e;

    .line 596
    .line 597
    invoke-direct {v0}, Lh4/e;-><init>()V

    .line 598
    .line 599
    .line 600
    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 601
    .line 602
    .line 603
    :cond_a
    check-cast v0, Lhd/l;

    .line 604
    .line 605
    const/4 v4, 0x6

    .line 606
    const/4 v5, 0x6

    .line 607
    const/4 v1, 0x0

    .line 608
    const/4 v2, 0x0

    .line 609
    invoke-static/range {v0 .. v5}, Landroidx/compose/ui/viewinterop/AndroidView_androidKt;->AndroidView(Lhd/l;Landroidx/compose/ui/Modifier;Lhd/l;Landroidx/compose/runtime/Composer;II)V

    .line 610
    .line 611
    .line 612
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 613
    .line 614
    .line 615
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 616
    .line 617
    .line 618
    move-result v0

    .line 619
    if-eqz v0, :cond_c

    .line 620
    .line 621
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 622
    .line 623
    .line 624
    goto :goto_3

    .line 625
    :cond_b
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 626
    .line 627
    .line 628
    :cond_c
    :goto_3
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 629
    .line 630
    return-object v0
.end method

.method public static final w(Lkotlin/jvm/internal/Ref$LongRef;Lkotlin/jvm/internal/Ref$IntRef;Lcom/friday/user/view/AboutFragment;)Lqc/q;
    .locals 6

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-wide v2, p0, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 6
    .line 7
    sub-long v2, v0, v2

    .line 8
    .line 9
    const-wide/16 v4, 0x1f4

    .line 10
    .line 11
    cmp-long v2, v2, v4

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    if-gez v2, :cond_0

    .line 15
    .line 16
    iget v2, p1, Lkotlin/jvm/internal/Ref$IntRef;->c:I

    .line 17
    .line 18
    add-int/lit8 v2, v2, 0x1

    .line 19
    .line 20
    iput v2, p1, Lkotlin/jvm/internal/Ref$IntRef;->c:I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iput v3, p1, Lkotlin/jvm/internal/Ref$IntRef;->c:I

    .line 24
    .line 25
    :goto_0
    iput-wide v0, p0, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 26
    .line 27
    iget p0, p1, Lkotlin/jvm/internal/Ref$IntRef;->c:I

    .line 28
    .line 29
    const/4 v0, 0x4

    .line 30
    if-lt p0, v0, :cond_1

    .line 31
    .line 32
    iput v3, p1, Lkotlin/jvm/internal/Ref$IntRef;->c:I

    .line 33
    .line 34
    const-string p0, "\u4e0a\u4f20\u6587\u6863"

    .line 35
    .line 36
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-static {p0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2}, Lcom/friday/user/view/AboutFragment;->z()Lcom/friday/user/viewmodel/UserViewModel;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p0}, Lcom/friday/user/viewmodel/UserViewModel;->t()V

    .line 48
    .line 49
    .line 50
    :cond_1
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 51
    .line 52
    return-object p0
.end method

.method public static final x(Landroid/content/Context;)Lcom/zykj/policy/ui/PolicyCheckView;
    .locals 7

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/zykj/policy/ui/PolicyCheckView;

    .line 7
    .line 8
    const/4 v5, 0x6

    .line 9
    const/4 v6, 0x0

    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    move-object v2, p0

    .line 13
    invoke-direct/range {v1 .. v6}, Lcom/zykj/policy/ui/PolicyCheckView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/n;)V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setCompoundDrawablePadding(I)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    invoke-virtual {v1, p0, p0, p0, p0}, Landroidx/appcompat/widget/AppCompatCheckBox;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 22
    .line 23
    .line 24
    new-instance p0, Lcom/zykj/policy/ext/PolicyHelper$Builder;

    .line 25
    .line 26
    invoke-direct {p0, v2}, Lcom/zykj/policy/ext/PolicyHelper$Builder;-><init>(Landroid/content/Context;)V

    .line 27
    .line 28
    .line 29
    const-string v0, "https://web.alicdn.zykj.org/privacypolicy/cloudnote/userServiceAgreement.html"

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Lcom/zykj/policy/ext/PolicyHelper$Builder;->g(Ljava/lang/String;)Lcom/zykj/policy/ext/PolicyHelper$Builder;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const-string v0, "https://web.alicdn.zykj.org/privacypolicy/cloudnote/userPrivacyPolicy.html"

    .line 36
    .line 37
    invoke-virtual {p0, v0}, Lcom/zykj/policy/ext/PolicyHelper$Builder;->f(Ljava/lang/String;)Lcom/zykj/policy/ext/PolicyHelper$Builder;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    const-string v0, "\u300a\u7528\u6237\u670d\u52a1\u534f\u8bae\u300b\t\t\t\t\t\t\t\u300a\u7528\u6237\u9690\u79c1\u653f\u7b56\u300b"

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Lcom/zykj/policy/ext/PolicyHelper$Builder;->c(Ljava/lang/String;)Lcom/zykj/policy/ext/PolicyHelper$Builder;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p0, v1}, Lcom/zykj/policy/ext/PolicyHelper$Builder;->h(Lcom/zykj/policy/ui/PolicyCheckView;)V

    .line 48
    .line 49
    .line 50
    return-object v1
.end method

.method public static final y(Lcom/friday/user/view/AboutFragment;ZIILandroidx/compose/runtime/Composer;I)Lqc/q;
    .locals 0

    .line 1
    or-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    invoke-virtual {p0, p1, p4, p2, p3}, Lcom/friday/user/view/AboutFragment;->u(ZLandroidx/compose/runtime/Composer;II)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 11
    .line 12
    return-object p0
.end method


# virtual methods
.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 6

    .line 1
    const-string p2, "inflater"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroidx/compose/ui/platform/ComposeView;

    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const-string p1, "requireContext(...)"

    .line 13
    .line 14
    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v4, 0x6

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/platform/ComposeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/n;)V

    .line 22
    .line 23
    .line 24
    new-instance p1, Landroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnLifecycleDestroyed;

    .line 25
    .line 26
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    const-string p3, "getViewLifecycleOwner(...)"

    .line 31
    .line 32
    invoke-static {p2, p3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p1, p2}, Landroidx/compose/ui/platform/ViewCompositionStrategy$DisposeOnLifecycleDestroyed;-><init>(Landroidx/lifecycle/LifecycleOwner;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p1}, Landroidx/compose/ui/platform/AbstractComposeView;->setViewCompositionStrategy(Landroidx/compose/ui/platform/ViewCompositionStrategy;)V

    .line 39
    .line 40
    .line 41
    new-instance p1, Lh4/a;

    .line 42
    .line 43
    invoke-direct {p1, p0}, Lh4/a;-><init>(Lcom/friday/user/view/AboutFragment;)V

    .line 44
    .line 45
    .line 46
    const p2, 0x5d5589a6

    .line 47
    .line 48
    .line 49
    const/4 p3, 0x1

    .line 50
    invoke-static {p2, p3, p1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {v0, p1}, Landroidx/compose/ui/platform/ComposeView;->setContent(Lhd/p;)V

    .line 55
    .line 56
    .line 57
    return-object v0
.end method

.method public final u(ZLandroidx/compose/runtime/Composer;II)V
    .locals 8

    .line 1
    const v0, 0x12d81b98

    .line 2
    .line 3
    .line 4
    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 5
    .line 6
    .line 7
    move-result-object v5

    .line 8
    and-int/lit8 p2, p4, 0x1

    .line 9
    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    or-int/lit8 v1, p3, 0x6

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    and-int/lit8 v1, p3, 0x6

    .line 16
    .line 17
    if-nez v1, :cond_2

    .line 18
    .line 19
    invoke-interface {v5, p1}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    const/4 v1, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 v1, 0x2

    .line 28
    :goto_0
    or-int/2addr v1, p3

    .line 29
    goto :goto_1

    .line 30
    :cond_2
    move v1, p3

    .line 31
    :goto_1
    and-int/lit8 v2, p3, 0x30

    .line 32
    .line 33
    if-nez v2, :cond_4

    .line 34
    .line 35
    invoke-interface {v5, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_3

    .line 40
    .line 41
    const/16 v2, 0x20

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_3
    const/16 v2, 0x10

    .line 45
    .line 46
    :goto_2
    or-int/2addr v1, v2

    .line 47
    :cond_4
    and-int/lit8 v2, v1, 0x13

    .line 48
    .line 49
    const/16 v3, 0x12

    .line 50
    .line 51
    const/4 v4, 0x0

    .line 52
    const/4 v6, 0x1

    .line 53
    if-eq v2, v3, :cond_5

    .line 54
    .line 55
    move v2, v6

    .line 56
    goto :goto_3

    .line 57
    :cond_5
    move v2, v4

    .line 58
    :goto_3
    and-int/lit8 v3, v1, 0x1

    .line 59
    .line 60
    invoke-interface {v5, v2, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_8

    .line 65
    .line 66
    if-eqz p2, :cond_6

    .line 67
    .line 68
    move p1, v4

    .line 69
    :cond_6
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    if-eqz p2, :cond_7

    .line 74
    .line 75
    const/4 p2, -0x1

    .line 76
    const-string v2, "com.friday.user.view.AboutFragment.InfoCard (AboutFragment.kt:62)"

    .line 77
    .line 78
    invoke-static {v0, v1, p2, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 79
    .line 80
    .line 81
    :cond_7
    new-instance p2, Lh4/b;

    .line 82
    .line 83
    invoke-direct {p2, p1, p0}, Lh4/b;-><init>(ZLcom/friday/user/view/AboutFragment;)V

    .line 84
    .line 85
    .line 86
    const/16 v0, 0x36

    .line 87
    .line 88
    const v1, 0x269a9644

    .line 89
    .line 90
    .line 91
    invoke-static {v1, v6, p2, v5, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    const/16 v6, 0xc00

    .line 96
    .line 97
    const/4 v7, 0x7

    .line 98
    const/4 v1, 0x0

    .line 99
    const/4 v2, 0x0

    .line 100
    const/4 v3, 0x0

    .line 101
    invoke-static/range {v1 .. v7}, Landroidx/compose/material3/MaterialThemeKt;->MaterialTheme(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/Shapes;Landroidx/compose/material3/Typography;Lhd/p;Landroidx/compose/runtime/Composer;II)V

    .line 102
    .line 103
    .line 104
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 105
    .line 106
    .line 107
    move-result p2

    .line 108
    if-eqz p2, :cond_9

    .line 109
    .line 110
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 111
    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_8
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 115
    .line 116
    .line 117
    :cond_9
    :goto_4
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    if-eqz p2, :cond_a

    .line 122
    .line 123
    new-instance v0, Lh4/c;

    .line 124
    .line 125
    invoke-direct {v0, p0, p1, p3, p4}, Lh4/c;-><init>(Lcom/friday/user/view/AboutFragment;ZII)V

    .line 126
    .line 127
    .line 128
    invoke-interface {p2, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lhd/p;)V

    .line 129
    .line 130
    .line 131
    :cond_a
    return-void
.end method

.method public final z()Lcom/friday/user/viewmodel/UserViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/user/view/AboutFragment;->i:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/user/viewmodel/UserViewModel;

    .line 8
    .line 9
    return-object v0
.end method
