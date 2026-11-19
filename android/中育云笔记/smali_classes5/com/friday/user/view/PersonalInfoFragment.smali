.class public final Lcom/friday/user/view/PersonalInfoFragment;
.super Lcom/friday/user/view/Hilt_PersonalInfoFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final k:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lcom/friday/common/base/SimpleFragment;->e:I

    sput v0, Lcom/friday/user/view/PersonalInfoFragment;->k:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/friday/user/view/Hilt_PersonalInfoFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final A(Lcom/friday/user/view/PersonalInfoFragment;Landroidx/compose/runtime/Composer;I)Lqc/q;
    .locals 4

    .line 1
    and-int/lit8 v0, p2, 0x3

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    move v0, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

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
    const-string v1, "com.friday.user.view.PersonalInfoFragment.onCreateView.<anonymous>.<anonymous> (PersonalInfoFragment.kt:45)"

    .line 26
    .line 27
    const v3, -0x330de090    # -1.2694208E8f

    .line 28
    .line 29
    .line 30
    invoke-static {v3, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    sget p2, Lcom/friday/common/base/SimpleFragment;->e:I

    .line 34
    .line 35
    shl-int/lit8 p2, p2, 0x3

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    invoke-virtual {p0, v0, p1, p2, v2}, Lcom/friday/user/view/PersonalInfoFragment;->u(Lcom/friday/user/viewmodel/UserViewModel;Landroidx/compose/runtime/Composer;II)V

    .line 39
    .line 40
    .line 41
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-eqz p0, :cond_3

    .line 46
    .line 47
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 52
    .line 53
    .line 54
    :cond_3
    :goto_1
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 55
    .line 56
    return-object p0
.end method

.method public static synthetic q(Lcom/friday/user/view/PersonalInfoFragment;Landroidx/compose/runtime/Composer;I)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/user/view/PersonalInfoFragment;->A(Lcom/friday/user/view/PersonalInfoFragment;Landroidx/compose/runtime/Composer;I)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lcom/friday/user/view/PersonalInfoFragment;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/friday/user/view/PersonalInfoFragment;->z(Lcom/friday/user/view/PersonalInfoFragment;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lcom/friday/user/view/PersonalInfoFragment;Lcom/friday/user/viewmodel/UserViewModel;IILandroidx/compose/runtime/Composer;I)Lqc/q;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/friday/user/view/PersonalInfoFragment;->x(Lcom/friday/user/view/PersonalInfoFragment;Lcom/friday/user/viewmodel/UserViewModel;IILandroidx/compose/runtime/Composer;I)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Lcom/friday/user/view/PersonalInfoFragment;Landroidx/compose/runtime/State;Landroidx/compose/runtime/Composer;I)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/user/view/PersonalInfoFragment;->w(Lcom/friday/user/view/PersonalInfoFragment;Landroidx/compose/runtime/State;Landroidx/compose/runtime/Composer;I)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final v(Landroidx/compose/runtime/State;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-interface {p0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/String;

    .line 6
    .line 7
    return-object p0
.end method

.method public static final w(Lcom/friday/user/view/PersonalInfoFragment;Landroidx/compose/runtime/State;Landroidx/compose/runtime/Composer;I)Lqc/q;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v5, p2

    .line 4
    .line 5
    move/from16 v1, p3

    .line 6
    .line 7
    and-int/lit8 v2, v1, 0x3

    .line 8
    .line 9
    const/4 v3, 0x2

    .line 10
    const/4 v11, 0x1

    .line 11
    const/4 v12, 0x0

    .line 12
    if-eq v2, v3, :cond_0

    .line 13
    .line 14
    move v2, v11

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v2, v12

    .line 17
    :goto_0
    and-int/lit8 v3, v1, 0x1

    .line 18
    .line 19
    invoke-interface {v5, v2, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_12

    .line 24
    .line 25
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    const/4 v2, -0x1

    .line 32
    const-string v3, "com.friday.user.view.PersonalInfoFragment.InfoCard.<anonymous> (PersonalInfoFragment.kt:54)"

    .line 33
    .line 34
    const v4, -0x4bc9d361

    .line 35
    .line 36
    .line 37
    invoke-static {v4, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    sget-object v13, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 41
    .line 42
    sget v1, Lcom/friday/user/R$dimen;->view_19:I

    .line 43
    .line 44
    invoke-static {v1, v5, v12}, Landroidx/compose/ui/res/PrimitiveResources_androidKt;->dimensionResource(ILandroidx/compose/runtime/Composer;I)F

    .line 45
    .line 46
    .line 47
    move-result v15

    .line 48
    const/16 v18, 0xd

    .line 49
    .line 50
    const/16 v19, 0x0

    .line 51
    .line 52
    const/4 v14, 0x0

    .line 53
    const/16 v16, 0x0

    .line 54
    .line 55
    const/16 v17, 0x0

    .line 56
    .line 57
    invoke-static/range {v13 .. v19}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    sget-object v14, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 62
    .line 63
    invoke-virtual {v14}, Landroidx/compose/ui/Alignment$Companion;->getTopCenter()Landroidx/compose/ui/Alignment;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-static {v2, v12}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-static {v5, v12}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-static {v5, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    sget-object v15, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 84
    .line 85
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lhd/a;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    if-nez v7, :cond_2

    .line 94
    .line 95
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 96
    .line 97
    .line 98
    :cond_2
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 99
    .line 100
    .line 101
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 102
    .line 103
    .line 104
    move-result v7

    .line 105
    if-eqz v7, :cond_3

    .line 106
    .line 107
    invoke-interface {v5, v6}, Landroidx/compose/runtime/Composer;->createNode(Lhd/a;)V

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_3
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 112
    .line 113
    .line 114
    :goto_1
    invoke-static {v5}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lhd/p;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    invoke-static {v6, v2, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lhd/p;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-static {v6, v4, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lhd/p;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    if-nez v4, :cond_4

    .line 141
    .line 142
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 147
    .line 148
    .line 149
    move-result-object v7

    .line 150
    invoke-static {v4, v7}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v4

    .line 154
    if-nez v4, :cond_5

    .line 155
    .line 156
    :cond_4
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    invoke-interface {v6, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    invoke-interface {v6, v3, v2}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lhd/p;)V

    .line 168
    .line 169
    .line 170
    :cond_5
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lhd/p;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    invoke-static {v6, v1, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 175
    .line 176
    .line 177
    sget-object v1, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 178
    .line 179
    sget v1, Lcom/friday/user/R$dimen;->view_324:I

    .line 180
    .line 181
    invoke-static {v1, v5, v12}, Landroidx/compose/ui/res/PrimitiveResources_androidKt;->dimensionResource(ILandroidx/compose/runtime/Composer;I)F

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    sget v2, Lcom/friday/user/R$dimen;->view_56:I

    .line 186
    .line 187
    invoke-static {v2, v5, v12}, Landroidx/compose/ui/res/PrimitiveResources_androidKt;->dimensionResource(ILandroidx/compose/runtime/Composer;I)F

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    invoke-static {v13, v1, v2}, Landroidx/compose/foundation/layout/SizeKt;->size-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    sget-object v2, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 196
    .line 197
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 198
    .line 199
    .line 200
    move-result-wide v2

    .line 201
    sget v4, Lcom/friday/user/R$dimen;->view_5:I

    .line 202
    .line 203
    invoke-static {v4, v5, v12}, Landroidx/compose/ui/res/PrimitiveResources_androidKt;->dimensionResource(ILandroidx/compose/runtime/Composer;I)F

    .line 204
    .line 205
    .line 206
    move-result v4

    .line 207
    invoke-static {v4}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    invoke-static {v1, v2, v3, v4}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    sget-object v16, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 216
    .line 217
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    invoke-virtual {v14}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 222
    .line 223
    .line 224
    move-result-object v3

    .line 225
    invoke-static {v2, v3, v5, v12}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    invoke-static {v5, v12}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 230
    .line 231
    .line 232
    move-result v3

    .line 233
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 234
    .line 235
    .line 236
    move-result-object v4

    .line 237
    invoke-static {v5, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lhd/a;

    .line 242
    .line 243
    .line 244
    move-result-object v6

    .line 245
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 246
    .line 247
    .line 248
    move-result-object v7

    .line 249
    if-nez v7, :cond_6

    .line 250
    .line 251
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 252
    .line 253
    .line 254
    :cond_6
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 255
    .line 256
    .line 257
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 258
    .line 259
    .line 260
    move-result v7

    .line 261
    if-eqz v7, :cond_7

    .line 262
    .line 263
    invoke-interface {v5, v6}, Landroidx/compose/runtime/Composer;->createNode(Lhd/a;)V

    .line 264
    .line 265
    .line 266
    goto :goto_2

    .line 267
    :cond_7
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 268
    .line 269
    .line 270
    :goto_2
    invoke-static {v5}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 271
    .line 272
    .line 273
    move-result-object v6

    .line 274
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lhd/p;

    .line 275
    .line 276
    .line 277
    move-result-object v7

    .line 278
    invoke-static {v6, v2, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lhd/p;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    invoke-static {v6, v4, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lhd/p;

    .line 289
    .line 290
    .line 291
    move-result-object v2

    .line 292
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 293
    .line 294
    .line 295
    move-result v4

    .line 296
    if-nez v4, :cond_8

    .line 297
    .line 298
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v4

    .line 302
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 303
    .line 304
    .line 305
    move-result-object v7

    .line 306
    invoke-static {v4, v7}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    move-result v4

    .line 310
    if-nez v4, :cond_9

    .line 311
    .line 312
    :cond_8
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 313
    .line 314
    .line 315
    move-result-object v4

    .line 316
    invoke-interface {v6, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 317
    .line 318
    .line 319
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 320
    .line 321
    .line 322
    move-result-object v3

    .line 323
    invoke-interface {v6, v3, v2}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lhd/p;)V

    .line 324
    .line 325
    .line 326
    :cond_9
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lhd/p;

    .line 327
    .line 328
    .line 329
    move-result-object v2

    .line 330
    invoke-static {v6, v1, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 331
    .line 332
    .line 333
    sget-object v1, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 334
    .line 335
    const/4 v1, 0x0

    .line 336
    const/4 v2, 0x0

    .line 337
    invoke-static {v13, v1, v11, v2}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 338
    .line 339
    .line 340
    move-result-object v17

    .line 341
    sget v3, Lcom/friday/user/R$dimen;->view_14:I

    .line 342
    .line 343
    invoke-static {v3, v5, v12}, Landroidx/compose/ui/res/PrimitiveResources_androidKt;->dimensionResource(ILandroidx/compose/runtime/Composer;I)F

    .line 344
    .line 345
    .line 346
    move-result v18

    .line 347
    sget v3, Lcom/friday/user/R$dimen;->view_14:I

    .line 348
    .line 349
    invoke-static {v3, v5, v12}, Landroidx/compose/ui/res/PrimitiveResources_androidKt;->dimensionResource(ILandroidx/compose/runtime/Composer;I)F

    .line 350
    .line 351
    .line 352
    move-result v20

    .line 353
    const/16 v22, 0xa

    .line 354
    .line 355
    const/16 v23, 0x0

    .line 356
    .line 357
    const/16 v19, 0x0

    .line 358
    .line 359
    const/16 v21, 0x0

    .line 360
    .line 361
    invoke-static/range {v17 .. v23}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 362
    .line 363
    .line 364
    move-result-object v3

    .line 365
    sget v4, Lcom/friday/user/R$dimen;->view_28:I

    .line 366
    .line 367
    invoke-static {v4, v5, v12}, Landroidx/compose/ui/res/PrimitiveResources_androidKt;->dimensionResource(ILandroidx/compose/runtime/Composer;I)F

    .line 368
    .line 369
    .line 370
    move-result v4

    .line 371
    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 372
    .line 373
    .line 374
    move-result-object v3

    .line 375
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/foundation/layout/Arrangement;->getSpaceBetween()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 376
    .line 377
    .line 378
    move-result-object v4

    .line 379
    invoke-virtual {v14}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 380
    .line 381
    .line 382
    move-result-object v6

    .line 383
    const/16 v7, 0x36

    .line 384
    .line 385
    invoke-static {v4, v6, v5, v7}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 386
    .line 387
    .line 388
    move-result-object v4

    .line 389
    invoke-static {v5, v12}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 390
    .line 391
    .line 392
    move-result v6

    .line 393
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 394
    .line 395
    .line 396
    move-result-object v8

    .line 397
    invoke-static {v5, v3}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 398
    .line 399
    .line 400
    move-result-object v3

    .line 401
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lhd/a;

    .line 402
    .line 403
    .line 404
    move-result-object v9

    .line 405
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 406
    .line 407
    .line 408
    move-result-object v10

    .line 409
    if-nez v10, :cond_a

    .line 410
    .line 411
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 412
    .line 413
    .line 414
    :cond_a
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 415
    .line 416
    .line 417
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 418
    .line 419
    .line 420
    move-result v10

    .line 421
    if-eqz v10, :cond_b

    .line 422
    .line 423
    invoke-interface {v5, v9}, Landroidx/compose/runtime/Composer;->createNode(Lhd/a;)V

    .line 424
    .line 425
    .line 426
    goto :goto_3

    .line 427
    :cond_b
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 428
    .line 429
    .line 430
    :goto_3
    invoke-static {v5}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 431
    .line 432
    .line 433
    move-result-object v9

    .line 434
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lhd/p;

    .line 435
    .line 436
    .line 437
    move-result-object v10

    .line 438
    invoke-static {v9, v4, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 439
    .line 440
    .line 441
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lhd/p;

    .line 442
    .line 443
    .line 444
    move-result-object v4

    .line 445
    invoke-static {v9, v8, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 446
    .line 447
    .line 448
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lhd/p;

    .line 449
    .line 450
    .line 451
    move-result-object v4

    .line 452
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 453
    .line 454
    .line 455
    move-result v8

    .line 456
    if-nez v8, :cond_c

    .line 457
    .line 458
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    move-result-object v8

    .line 462
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 463
    .line 464
    .line 465
    move-result-object v10

    .line 466
    invoke-static {v8, v10}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 467
    .line 468
    .line 469
    move-result v8

    .line 470
    if-nez v8, :cond_d

    .line 471
    .line 472
    :cond_c
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 473
    .line 474
    .line 475
    move-result-object v8

    .line 476
    invoke-interface {v9, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 477
    .line 478
    .line 479
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 480
    .line 481
    .line 482
    move-result-object v6

    .line 483
    invoke-interface {v9, v6, v4}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lhd/p;)V

    .line 484
    .line 485
    .line 486
    :cond_d
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lhd/p;

    .line 487
    .line 488
    .line 489
    move-result-object v4

    .line 490
    invoke-static {v9, v3, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 491
    .line 492
    .line 493
    sget-object v3, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 494
    .line 495
    sget v3, Lcom/friday/user/R$string;->head_portrait:I

    .line 496
    .line 497
    invoke-static {v3, v5, v12}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v3

    .line 501
    sget v17, Lcom/friday/common/base/SimpleFragment;->e:I

    .line 502
    .line 503
    shl-int/lit8 v4, v17, 0x3

    .line 504
    .line 505
    invoke-virtual {v0, v3, v5, v4}, Lcom/friday/user/view/PersonalInfoFragment;->y(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    .line 506
    .line 507
    .line 508
    sget v3, Lcom/friday/user/R$mipmap;->icon_person_s:I

    .line 509
    .line 510
    invoke-static {v3, v5, v12}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 511
    .line 512
    .line 513
    move-result-object v3

    .line 514
    sget v4, Lcom/friday/user/R$dimen;->view_18:I

    .line 515
    .line 516
    invoke-static {v4, v5, v12}, Landroidx/compose/ui/res/PrimitiveResources_androidKt;->dimensionResource(ILandroidx/compose/runtime/Composer;I)F

    .line 517
    .line 518
    .line 519
    move-result v4

    .line 520
    invoke-static {v13, v4}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 521
    .line 522
    .line 523
    move-result-object v4

    .line 524
    const/16 v9, 0x30

    .line 525
    .line 526
    const/16 v10, 0x78

    .line 527
    .line 528
    move-object v6, v2

    .line 529
    const/4 v2, 0x0

    .line 530
    move v8, v1

    .line 531
    move-object v1, v3

    .line 532
    move-object v3, v4

    .line 533
    const/4 v4, 0x0

    .line 534
    const/4 v5, 0x0

    .line 535
    move-object/from16 v18, v6

    .line 536
    .line 537
    const/4 v6, 0x0

    .line 538
    move/from16 v19, v7

    .line 539
    .line 540
    const/4 v7, 0x0

    .line 541
    move-object/from16 p3, v14

    .line 542
    .line 543
    move-object/from16 v12, v18

    .line 544
    .line 545
    move v14, v8

    .line 546
    move-object/from16 v8, p2

    .line 547
    .line 548
    invoke-static/range {v1 .. v10}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 549
    .line 550
    .line 551
    invoke-interface/range {p2 .. p2}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 552
    .line 553
    .line 554
    const/4 v6, 0x0

    .line 555
    const/4 v7, 0x7

    .line 556
    const/4 v1, 0x0

    .line 557
    const/4 v2, 0x0

    .line 558
    const-wide/16 v3, 0x0

    .line 559
    .line 560
    move-object/from16 v5, p2

    .line 561
    .line 562
    invoke-static/range {v1 .. v7}, Landroidx/compose/material3/DividerKt;->Divider-9IZ8Weo(Landroidx/compose/ui/Modifier;FJLandroidx/compose/runtime/Composer;II)V

    .line 563
    .line 564
    .line 565
    invoke-static {v13, v14, v11, v12}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 566
    .line 567
    .line 568
    move-result-object v24

    .line 569
    sget v1, Lcom/friday/user/R$dimen;->view_14:I

    .line 570
    .line 571
    const/4 v2, 0x0

    .line 572
    invoke-static {v1, v5, v2}, Landroidx/compose/ui/res/PrimitiveResources_androidKt;->dimensionResource(ILandroidx/compose/runtime/Composer;I)F

    .line 573
    .line 574
    .line 575
    move-result v25

    .line 576
    sget v1, Lcom/friday/user/R$dimen;->view_14:I

    .line 577
    .line 578
    invoke-static {v1, v5, v2}, Landroidx/compose/ui/res/PrimitiveResources_androidKt;->dimensionResource(ILandroidx/compose/runtime/Composer;I)F

    .line 579
    .line 580
    .line 581
    move-result v27

    .line 582
    const/16 v29, 0xa

    .line 583
    .line 584
    const/16 v30, 0x0

    .line 585
    .line 586
    const/16 v26, 0x0

    .line 587
    .line 588
    const/16 v28, 0x0

    .line 589
    .line 590
    invoke-static/range {v24 .. v30}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 591
    .line 592
    .line 593
    move-result-object v1

    .line 594
    sget v3, Lcom/friday/user/R$dimen;->view_28:I

    .line 595
    .line 596
    invoke-static {v3, v5, v2}, Landroidx/compose/ui/res/PrimitiveResources_androidKt;->dimensionResource(ILandroidx/compose/runtime/Composer;I)F

    .line 597
    .line 598
    .line 599
    move-result v3

    .line 600
    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 601
    .line 602
    .line 603
    move-result-object v1

    .line 604
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/foundation/layout/Arrangement;->getSpaceBetween()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 605
    .line 606
    .line 607
    move-result-object v3

    .line 608
    invoke-virtual/range {p3 .. p3}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 609
    .line 610
    .line 611
    move-result-object v4

    .line 612
    const/16 v6, 0x36

    .line 613
    .line 614
    invoke-static {v3, v4, v5, v6}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 615
    .line 616
    .line 617
    move-result-object v3

    .line 618
    invoke-static {v5, v2}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 619
    .line 620
    .line 621
    move-result v4

    .line 622
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 623
    .line 624
    .line 625
    move-result-object v2

    .line 626
    invoke-static {v5, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 627
    .line 628
    .line 629
    move-result-object v1

    .line 630
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lhd/a;

    .line 631
    .line 632
    .line 633
    move-result-object v6

    .line 634
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 635
    .line 636
    .line 637
    move-result-object v7

    .line 638
    if-nez v7, :cond_e

    .line 639
    .line 640
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 641
    .line 642
    .line 643
    :cond_e
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 644
    .line 645
    .line 646
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 647
    .line 648
    .line 649
    move-result v7

    .line 650
    if-eqz v7, :cond_f

    .line 651
    .line 652
    invoke-interface {v5, v6}, Landroidx/compose/runtime/Composer;->createNode(Lhd/a;)V

    .line 653
    .line 654
    .line 655
    goto :goto_4

    .line 656
    :cond_f
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 657
    .line 658
    .line 659
    :goto_4
    invoke-static {v5}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 660
    .line 661
    .line 662
    move-result-object v6

    .line 663
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lhd/p;

    .line 664
    .line 665
    .line 666
    move-result-object v7

    .line 667
    invoke-static {v6, v3, v7}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 668
    .line 669
    .line 670
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lhd/p;

    .line 671
    .line 672
    .line 673
    move-result-object v3

    .line 674
    invoke-static {v6, v2, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 675
    .line 676
    .line 677
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lhd/p;

    .line 678
    .line 679
    .line 680
    move-result-object v2

    .line 681
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 682
    .line 683
    .line 684
    move-result v3

    .line 685
    if-nez v3, :cond_10

    .line 686
    .line 687
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 688
    .line 689
    .line 690
    move-result-object v3

    .line 691
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 692
    .line 693
    .line 694
    move-result-object v7

    .line 695
    invoke-static {v3, v7}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 696
    .line 697
    .line 698
    move-result v3

    .line 699
    if-nez v3, :cond_11

    .line 700
    .line 701
    :cond_10
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 702
    .line 703
    .line 704
    move-result-object v3

    .line 705
    invoke-interface {v6, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 706
    .line 707
    .line 708
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 709
    .line 710
    .line 711
    move-result-object v3

    .line 712
    invoke-interface {v6, v3, v2}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lhd/p;)V

    .line 713
    .line 714
    .line 715
    :cond_11
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lhd/p;

    .line 716
    .line 717
    .line 718
    move-result-object v2

    .line 719
    invoke-static {v6, v1, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 720
    .line 721
    .line 722
    sget v1, Lcom/friday/user/R$string;->nickname:I

    .line 723
    .line 724
    const/4 v2, 0x0

    .line 725
    invoke-static {v1, v5, v2}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 726
    .line 727
    .line 728
    move-result-object v1

    .line 729
    shl-int/lit8 v2, v17, 0x3

    .line 730
    .line 731
    invoke-virtual {v0, v1, v5, v2}, Lcom/friday/user/view/PersonalInfoFragment;->y(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    .line 732
    .line 733
    .line 734
    invoke-static/range {p1 .. p1}, Lcom/friday/user/view/PersonalInfoFragment;->v(Landroidx/compose/runtime/State;)Ljava/lang/String;

    .line 735
    .line 736
    .line 737
    move-result-object v1

    .line 738
    shl-int/lit8 v2, v17, 0x3

    .line 739
    .line 740
    invoke-virtual {v0, v1, v5, v2}, Lcom/friday/user/view/PersonalInfoFragment;->y(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    .line 741
    .line 742
    .line 743
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 744
    .line 745
    .line 746
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 747
    .line 748
    .line 749
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 750
    .line 751
    .line 752
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 753
    .line 754
    .line 755
    move-result v0

    .line 756
    if-eqz v0, :cond_13

    .line 757
    .line 758
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 759
    .line 760
    .line 761
    goto :goto_5

    .line 762
    :cond_12
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 763
    .line 764
    .line 765
    :cond_13
    :goto_5
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 766
    .line 767
    return-object v0
.end method

.method public static final x(Lcom/friday/user/view/PersonalInfoFragment;Lcom/friday/user/viewmodel/UserViewModel;IILandroidx/compose/runtime/Composer;I)Lqc/q;
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
    invoke-virtual {p0, p1, p4, p2, p3}, Lcom/friday/user/view/PersonalInfoFragment;->u(Lcom/friday/user/viewmodel/UserViewModel;Landroidx/compose/runtime/Composer;II)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 11
    .line 12
    return-object p0
.end method

.method public static final z(Lcom/friday/user/view/PersonalInfoFragment;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Lqc/q;
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
    invoke-virtual {p0, p1, p3, p2}, Lcom/friday/user/view/PersonalInfoFragment;->y(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

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
    new-instance p1, Lh4/m;

    .line 42
    .line 43
    invoke-direct {p1, p0}, Lh4/m;-><init>(Lcom/friday/user/view/PersonalInfoFragment;)V

    .line 44
    .line 45
    .line 46
    const p2, -0x330de090    # -1.2694208E8f

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

.method public final u(Lcom/friday/user/viewmodel/UserViewModel;Landroidx/compose/runtime/Composer;II)V
    .locals 11

    .line 1
    const v0, -0x4650400d

    .line 2
    .line 3
    .line 4
    invoke-interface {p2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 5
    .line 6
    .line 7
    move-result-object v5

    .line 8
    and-int/lit8 p2, p3, 0x6

    .line 9
    .line 10
    if-nez p2, :cond_1

    .line 11
    .line 12
    and-int/lit8 p2, p4, 0x1

    .line 13
    .line 14
    if-nez p2, :cond_0

    .line 15
    .line 16
    invoke-interface {v5, p1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    if-eqz p2, :cond_0

    .line 21
    .line 22
    const/4 p2, 0x4

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p2, 0x2

    .line 25
    :goto_0
    or-int/2addr p2, p3

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move p2, p3

    .line 28
    :goto_1
    and-int/lit8 v1, p3, 0x30

    .line 29
    .line 30
    if-nez v1, :cond_4

    .line 31
    .line 32
    and-int/lit8 v1, p3, 0x40

    .line 33
    .line 34
    if-nez v1, :cond_2

    .line 35
    .line 36
    invoke-interface {v5, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    goto :goto_2

    .line 41
    :cond_2
    invoke-interface {v5, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    :goto_2
    if-eqz v1, :cond_3

    .line 46
    .line 47
    const/16 v1, 0x20

    .line 48
    .line 49
    goto :goto_3

    .line 50
    :cond_3
    const/16 v1, 0x10

    .line 51
    .line 52
    :goto_3
    or-int/2addr p2, v1

    .line 53
    :cond_4
    and-int/lit8 v1, p2, 0x13

    .line 54
    .line 55
    const/16 v2, 0x12

    .line 56
    .line 57
    const/4 v9, 0x0

    .line 58
    const/4 v10, 0x1

    .line 59
    if-eq v1, v2, :cond_5

    .line 60
    .line 61
    move v1, v10

    .line 62
    goto :goto_4

    .line 63
    :cond_5
    move v1, v9

    .line 64
    :goto_4
    and-int/lit8 v2, p2, 0x1

    .line 65
    .line 66
    invoke-interface {v5, v1, v2}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-eqz v1, :cond_c

    .line 71
    .line 72
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 73
    .line 74
    .line 75
    and-int/lit8 v1, p3, 0x1

    .line 76
    .line 77
    if-eqz v1, :cond_7

    .line 78
    .line 79
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-eqz v1, :cond_6

    .line 84
    .line 85
    goto :goto_6

    .line 86
    :cond_6
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 87
    .line 88
    .line 89
    and-int/lit8 v1, p4, 0x1

    .line 90
    .line 91
    if-eqz v1, :cond_a

    .line 92
    .line 93
    :goto_5
    and-int/lit8 p2, p2, -0xf

    .line 94
    .line 95
    goto :goto_8

    .line 96
    :cond_7
    :goto_6
    and-int/lit8 v1, p4, 0x1

    .line 97
    .line 98
    if-eqz v1, :cond_a

    .line 99
    .line 100
    sget-object p1, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->INSTANCE:Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;

    .line 101
    .line 102
    const/4 v1, 0x6

    .line 103
    invoke-virtual {p1, v5, v1}, Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;->getCurrent(Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelStoreOwner;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    if-eqz v2, :cond_9

    .line 108
    .line 109
    instance-of p1, v2, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    .line 110
    .line 111
    if-eqz p1, :cond_8

    .line 112
    .line 113
    move-object p1, v2

    .line 114
    check-cast p1, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;

    .line 115
    .line 116
    invoke-interface {p1}, Landroidx/lifecycle/HasDefaultViewModelProviderFactory;->getDefaultViewModelCreationExtras()Landroidx/lifecycle/viewmodel/CreationExtras;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    goto :goto_7

    .line 121
    :cond_8
    sget-object p1, Landroidx/lifecycle/viewmodel/CreationExtras$Empty;->INSTANCE:Landroidx/lifecycle/viewmodel/CreationExtras$Empty;

    .line 122
    .line 123
    :goto_7
    const-class v1, Lcom/friday/user/viewmodel/UserViewModel;

    .line 124
    .line 125
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    const/4 v7, 0x0

    .line 130
    const/4 v8, 0x0

    .line 131
    const/4 v3, 0x0

    .line 132
    const/4 v4, 0x0

    .line 133
    move-object v6, v5

    .line 134
    move-object v5, p1

    .line 135
    invoke-static/range {v1 .. v8}, Landroidx/lifecycle/viewmodel/compose/ViewModelKt;->viewModel(Lod/c;Landroidx/lifecycle/ViewModelStoreOwner;Ljava/lang/String;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;Landroidx/compose/runtime/Composer;II)Landroidx/lifecycle/ViewModel;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    move-object v5, v6

    .line 140
    check-cast p1, Lcom/friday/user/viewmodel/UserViewModel;

    .line 141
    .line 142
    goto :goto_5

    .line 143
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 144
    .line 145
    const-string p2, "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"

    .line 146
    .line 147
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    throw p1

    .line 151
    :cond_a
    :goto_8
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 152
    .line 153
    .line 154
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    if-eqz v1, :cond_b

    .line 159
    .line 160
    const/4 v1, -0x1

    .line 161
    const-string v2, "com.friday.user.view.PersonalInfoFragment.InfoCard (PersonalInfoFragment.kt:51)"

    .line 162
    .line 163
    invoke-static {v0, p2, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 164
    .line 165
    .line 166
    :cond_b
    invoke-virtual {p1}, Lcom/friday/user/viewmodel/UserViewModel;->q()Lvd/u;

    .line 167
    .line 168
    .line 169
    move-result-object p2

    .line 170
    const/4 v0, 0x0

    .line 171
    invoke-static {p2, v0, v5, v9, v10}, Landroidx/compose/runtime/SnapshotStateKt;->collectAsState(Lvd/u;Lkotlin/coroutines/d;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;

    .line 172
    .line 173
    .line 174
    move-result-object p2

    .line 175
    new-instance v0, Lh4/n;

    .line 176
    .line 177
    invoke-direct {v0, p0, p2}, Lh4/n;-><init>(Lcom/friday/user/view/PersonalInfoFragment;Landroidx/compose/runtime/State;)V

    .line 178
    .line 179
    .line 180
    const/16 p2, 0x36

    .line 181
    .line 182
    const v1, -0x4bc9d361

    .line 183
    .line 184
    .line 185
    invoke-static {v1, v10, v0, v5, p2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    const/16 v6, 0xc00

    .line 190
    .line 191
    const/4 v7, 0x7

    .line 192
    const/4 v1, 0x0

    .line 193
    const/4 v2, 0x0

    .line 194
    const/4 v3, 0x0

    .line 195
    invoke-static/range {v1 .. v7}, Landroidx/compose/material3/MaterialThemeKt;->MaterialTheme(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/Shapes;Landroidx/compose/material3/Typography;Lhd/p;Landroidx/compose/runtime/Composer;II)V

    .line 196
    .line 197
    .line 198
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 199
    .line 200
    .line 201
    move-result p2

    .line 202
    if-eqz p2, :cond_d

    .line 203
    .line 204
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 205
    .line 206
    .line 207
    goto :goto_9

    .line 208
    :cond_c
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 209
    .line 210
    .line 211
    :cond_d
    :goto_9
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 212
    .line 213
    .line 214
    move-result-object p2

    .line 215
    if-eqz p2, :cond_e

    .line 216
    .line 217
    new-instance v0, Lh4/o;

    .line 218
    .line 219
    invoke-direct {v0, p0, p1, p3, p4}, Lh4/o;-><init>(Lcom/friday/user/view/PersonalInfoFragment;Lcom/friday/user/viewmodel/UserViewModel;II)V

    .line 220
    .line 221
    .line 222
    invoke-interface {p2, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lhd/p;)V

    .line 223
    .line 224
    .line 225
    :cond_e
    return-void
.end method

.method public final y(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
    .locals 25

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "text"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const v1, -0x1097b8c1

    .line 9
    .line 10
    .line 11
    move-object/from16 v2, p2

    .line 12
    .line 13
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    and-int/lit8 v3, p3, 0x6

    .line 18
    .line 19
    const/4 v4, 0x2

    .line 20
    if-nez v3, :cond_1

    .line 21
    .line 22
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    const/4 v3, 0x4

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move v3, v4

    .line 31
    :goto_0
    or-int v3, p3, v3

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move/from16 v3, p3

    .line 35
    .line 36
    :goto_1
    and-int/lit8 v5, v3, 0x3

    .line 37
    .line 38
    const/4 v6, 0x0

    .line 39
    if-eq v5, v4, :cond_2

    .line 40
    .line 41
    const/4 v4, 0x1

    .line 42
    goto :goto_2

    .line 43
    :cond_2
    move v4, v6

    .line 44
    :goto_2
    and-int/lit8 v5, v3, 0x1

    .line 45
    .line 46
    invoke-interface {v2, v4, v5}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_4

    .line 51
    .line 52
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-eqz v4, :cond_3

    .line 57
    .line 58
    const/4 v4, -0x1

    .line 59
    const-string v5, "com.friday.user.view.PersonalInfoFragment.TheText (PersonalInfoFragment.kt:115)"

    .line 60
    .line 61
    invoke-static {v1, v3, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 62
    .line 63
    .line 64
    :cond_3
    sget v1, Lcom/friday/user/R$color;->app_l_dark:I

    .line 65
    .line 66
    invoke-static {v1, v2, v6}, Landroidx/compose/ui/res/ColorResources_androidKt;->colorResource(ILandroidx/compose/runtime/Composer;I)J

    .line 67
    .line 68
    .line 69
    move-result-wide v4

    .line 70
    sget v1, Lcom/friday/user/R$dimen;->view_9:I

    .line 71
    .line 72
    invoke-static {v1, v2, v6}, Landroidx/compose/ui/res/PrimitiveResources_androidKt;->dimensionResource(ILandroidx/compose/runtime/Composer;I)F

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    invoke-static {v1, v2, v6}, Lz1/b;->m(FLandroidx/compose/runtime/Composer;I)J

    .line 77
    .line 78
    .line 79
    move-result-wide v6

    .line 80
    and-int/lit8 v22, v3, 0xe

    .line 81
    .line 82
    const/16 v23, 0x0

    .line 83
    .line 84
    const v24, 0x1fff2

    .line 85
    .line 86
    .line 87
    const/4 v1, 0x0

    .line 88
    move-object/from16 v21, v2

    .line 89
    .line 90
    move-wide v2, v4

    .line 91
    move-wide v4, v6

    .line 92
    const/4 v6, 0x0

    .line 93
    const/4 v7, 0x0

    .line 94
    const/4 v8, 0x0

    .line 95
    const-wide/16 v9, 0x0

    .line 96
    .line 97
    const/4 v11, 0x0

    .line 98
    const/4 v12, 0x0

    .line 99
    const-wide/16 v13, 0x0

    .line 100
    .line 101
    const/4 v15, 0x0

    .line 102
    const/16 v16, 0x0

    .line 103
    .line 104
    const/16 v17, 0x0

    .line 105
    .line 106
    const/16 v18, 0x0

    .line 107
    .line 108
    const/16 v19, 0x0

    .line 109
    .line 110
    const/16 v20, 0x0

    .line 111
    .line 112
    invoke-static/range {v0 .. v24}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILhd/l;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 113
    .line 114
    .line 115
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    if-eqz v1, :cond_5

    .line 120
    .line 121
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 122
    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_4
    move-object/from16 v21, v2

    .line 126
    .line 127
    invoke-interface/range {v21 .. v21}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 128
    .line 129
    .line 130
    :cond_5
    :goto_3
    invoke-interface/range {v21 .. v21}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    if-eqz v1, :cond_6

    .line 135
    .line 136
    new-instance v2, Lh4/p;

    .line 137
    .line 138
    move-object/from16 v3, p0

    .line 139
    .line 140
    move/from16 v4, p3

    .line 141
    .line 142
    invoke-direct {v2, v3, v0, v4}, Lh4/p;-><init>(Lcom/friday/user/view/PersonalInfoFragment;Ljava/lang/String;I)V

    .line 143
    .line 144
    .line 145
    invoke-interface {v1, v2}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lhd/p;)V

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :cond_6
    move-object/from16 v3, p0

    .line 150
    .line 151
    return-void
.end method
