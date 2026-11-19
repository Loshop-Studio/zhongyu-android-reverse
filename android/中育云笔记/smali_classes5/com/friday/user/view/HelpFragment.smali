.class public final Lcom/friday/user/view/HelpFragment;
.super Lcom/friday/user/view/Hilt_HelpFragment;
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

    sput v0, Lcom/friday/user/view/HelpFragment;->k:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/friday/user/view/Hilt_HelpFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final B(Lcom/friday/user/view/HelpFragment;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Lqc/q;
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
    invoke-virtual {p0, p1, p3, p2}, Lcom/friday/user/view/HelpFragment;->A(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 11
    .line 12
    return-object p0
.end method

.method public static final C(Lcom/friday/user/view/HelpFragment;Landroidx/compose/runtime/Composer;I)Lqc/q;
    .locals 3

    .line 1
    and-int/lit8 v0, p2, 0x3

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    and-int/lit8 v1, p2, 0x1

    .line 10
    .line 11
    invoke-interface {p1, v0, v1}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    const/4 v0, -0x1

    .line 24
    const-string v1, "com.friday.user.view.HelpFragment.onCreateView.<anonymous>.<anonymous> (HelpFragment.kt:41)"

    .line 25
    .line 26
    const v2, -0x215ccab0

    .line 27
    .line 28
    .line 29
    invoke-static {v2, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    sget p2, Lcom/friday/common/base/SimpleFragment;->e:I

    .line 33
    .line 34
    invoke-virtual {p0, p1, p2}, Lcom/friday/user/view/HelpFragment;->x(Landroidx/compose/runtime/Composer;I)V

    .line 35
    .line 36
    .line 37
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-eqz p0, :cond_3

    .line 42
    .line 43
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 48
    .line 49
    .line 50
    :cond_3
    :goto_1
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 51
    .line 52
    return-object p0
.end method

.method public static synthetic q(Lcom/friday/user/view/HelpFragment;Landroidx/compose/runtime/Composer;I)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/user/view/HelpFragment;->y(Lcom/friday/user/view/HelpFragment;Landroidx/compose/runtime/Composer;I)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lcom/friday/user/view/HelpFragment;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/friday/user/view/HelpFragment;->w(Lcom/friday/user/view/HelpFragment;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lcom/friday/user/view/HelpFragment;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/friday/user/view/HelpFragment;->B(Lcom/friday/user/view/HelpFragment;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Lcom/friday/user/view/HelpFragment;ILandroidx/compose/runtime/Composer;I)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/user/view/HelpFragment;->z(Lcom/friday/user/view/HelpFragment;ILandroidx/compose/runtime/Composer;I)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Lcom/friday/user/view/HelpFragment;Landroidx/compose/runtime/Composer;I)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/user/view/HelpFragment;->C(Lcom/friday/user/view/HelpFragment;Landroidx/compose/runtime/Composer;I)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final w(Lcom/friday/user/view/HelpFragment;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Lqc/q;
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
    invoke-virtual {p0, p1, p3, p2}, Lcom/friday/user/view/HelpFragment;->v(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 11
    .line 12
    return-object p0
.end method

.method public static final y(Lcom/friday/user/view/HelpFragment;Landroidx/compose/runtime/Composer;I)Lqc/q;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    and-int/lit8 v3, v2, 0x3

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x1

    .line 11
    const/4 v6, 0x0

    .line 12
    if-eq v3, v4, :cond_0

    .line 13
    .line 14
    move v3, v5

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v3, v6

    .line 17
    :goto_0
    and-int/lit8 v4, v2, 0x1

    .line 18
    .line 19
    invoke-interface {v1, v3, v4}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_6

    .line 24
    .line 25
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    const/4 v3, -0x1

    .line 32
    const-string v4, "com.friday.user.view.HelpFragment.InfoCard.<anonymous> (HelpFragment.kt:48)"

    .line 33
    .line 34
    const v7, -0x85fa8ba

    .line 35
    .line 36
    .line 37
    invoke-static {v7, v2, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    sget-object v8, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 41
    .line 42
    sget v2, Lcom/friday/user/R$dimen;->view_16:I

    .line 43
    .line 44
    invoke-static {v2, v1, v6}, Landroidx/compose/ui/res/PrimitiveResources_androidKt;->dimensionResource(ILandroidx/compose/runtime/Composer;I)F

    .line 45
    .line 46
    .line 47
    move-result v9

    .line 48
    sget v2, Lcom/friday/user/R$dimen;->view_16:I

    .line 49
    .line 50
    invoke-static {v2, v1, v6}, Landroidx/compose/ui/res/PrimitiveResources_androidKt;->dimensionResource(ILandroidx/compose/runtime/Composer;I)F

    .line 51
    .line 52
    .line 53
    move-result v10

    .line 54
    sget v2, Lcom/friday/user/R$dimen;->view_16:I

    .line 55
    .line 56
    invoke-static {v2, v1, v6}, Landroidx/compose/ui/res/PrimitiveResources_androidKt;->dimensionResource(ILandroidx/compose/runtime/Composer;I)F

    .line 57
    .line 58
    .line 59
    move-result v11

    .line 60
    const/16 v13, 0x8

    .line 61
    .line 62
    const/4 v14, 0x0

    .line 63
    const/4 v12, 0x0

    .line 64
    invoke-static/range {v8 .. v14}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 65
    .line 66
    .line 67
    move-result-object v15

    .line 68
    invoke-static {v6, v1, v6, v5}, Landroidx/compose/foundation/ScrollKt;->rememberScrollState(ILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/ScrollState;

    .line 69
    .line 70
    .line 71
    move-result-object v16

    .line 72
    const/16 v20, 0xe

    .line 73
    .line 74
    const/16 v21, 0x0

    .line 75
    .line 76
    const/16 v17, 0x0

    .line 77
    .line 78
    const/16 v18, 0x0

    .line 79
    .line 80
    const/16 v19, 0x0

    .line 81
    .line 82
    invoke-static/range {v15 .. v21}, Landroidx/compose/foundation/ScrollKt;->verticalScroll$default(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;ZLandroidx/compose/foundation/gestures/FlingBehavior;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    sget-object v3, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 87
    .line 88
    invoke-virtual {v3}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    sget-object v4, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 93
    .line 94
    invoke-virtual {v4}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    invoke-static {v3, v4, v1, v6}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-static {v1, v6}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    invoke-static {v1, v2}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    sget-object v7, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 115
    .line 116
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lhd/a;

    .line 117
    .line 118
    .line 119
    move-result-object v8

    .line 120
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 121
    .line 122
    .line 123
    move-result-object v9

    .line 124
    if-nez v9, :cond_2

    .line 125
    .line 126
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 127
    .line 128
    .line 129
    :cond_2
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 130
    .line 131
    .line 132
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 133
    .line 134
    .line 135
    move-result v9

    .line 136
    if-eqz v9, :cond_3

    .line 137
    .line 138
    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->createNode(Lhd/a;)V

    .line 139
    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_3
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 143
    .line 144
    .line 145
    :goto_1
    invoke-static {v1}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 146
    .line 147
    .line 148
    move-result-object v8

    .line 149
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lhd/p;

    .line 150
    .line 151
    .line 152
    move-result-object v9

    .line 153
    invoke-static {v8, v3, v9}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lhd/p;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    invoke-static {v8, v5, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lhd/p;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 168
    .line 169
    .line 170
    move-result v5

    .line 171
    if-nez v5, :cond_4

    .line 172
    .line 173
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v5

    .line 177
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 178
    .line 179
    .line 180
    move-result-object v9

    .line 181
    invoke-static {v5, v9}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v5

    .line 185
    if-nez v5, :cond_5

    .line 186
    .line 187
    :cond_4
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 188
    .line 189
    .line 190
    move-result-object v5

    .line 191
    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 195
    .line 196
    .line 197
    move-result-object v4

    .line 198
    invoke-interface {v8, v4, v3}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lhd/p;)V

    .line 199
    .line 200
    .line 201
    :cond_5
    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lhd/p;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    invoke-static {v8, v2, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 206
    .line 207
    .line 208
    sget-object v2, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 209
    .line 210
    sget v2, Lcom/friday/common/base/SimpleFragment;->e:I

    .line 211
    .line 212
    shl-int/lit8 v3, v2, 0x3

    .line 213
    .line 214
    or-int/lit8 v3, v3, 0x6

    .line 215
    .line 216
    const-string v4, "\u5e08\u751f\u5982\u4f55\u4f7f\u7528\u4e91\u7b14\u8bb0\u4e0a\u8bfe"

    .line 217
    .line 218
    invoke-virtual {v0, v4, v1, v3}, Lcom/friday/user/view/HelpFragment;->A(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    .line 219
    .line 220
    .line 221
    sget v3, Lcom/friday/user/R$string;->help_class:I

    .line 222
    .line 223
    invoke-static {v3, v1, v6}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v3

    .line 227
    shl-int/lit8 v4, v2, 0x3

    .line 228
    .line 229
    invoke-virtual {v0, v3, v1, v4}, Lcom/friday/user/view/HelpFragment;->v(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    .line 230
    .line 231
    .line 232
    shl-int/lit8 v3, v2, 0x3

    .line 233
    .line 234
    or-int/lit8 v3, v3, 0x6

    .line 235
    .line 236
    const-string v4, "\u8bfe\u5802\u6f14\u793a\u529f\u80fd"

    .line 237
    .line 238
    invoke-virtual {v0, v4, v1, v3}, Lcom/friday/user/view/HelpFragment;->A(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    .line 239
    .line 240
    .line 241
    sget v3, Lcom/friday/user/R$string;->class_demo:I

    .line 242
    .line 243
    invoke-static {v3, v1, v6}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    shl-int/lit8 v4, v2, 0x3

    .line 248
    .line 249
    invoke-virtual {v0, v3, v1, v4}, Lcom/friday/user/view/HelpFragment;->v(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    .line 250
    .line 251
    .line 252
    shl-int/lit8 v3, v2, 0x3

    .line 253
    .line 254
    or-int/lit8 v3, v3, 0x6

    .line 255
    .line 256
    const-string v4, "\u8bfe\u5802\u4e92\u52a8\u529f\u80fd"

    .line 257
    .line 258
    invoke-virtual {v0, v4, v1, v3}, Lcom/friday/user/view/HelpFragment;->A(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    .line 259
    .line 260
    .line 261
    sget v3, Lcom/friday/user/R$string;->class_usage:I

    .line 262
    .line 263
    invoke-static {v3, v1, v6}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v3

    .line 267
    shl-int/lit8 v4, v2, 0x3

    .line 268
    .line 269
    invoke-virtual {v0, v3, v1, v4}, Lcom/friday/user/view/HelpFragment;->v(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    .line 270
    .line 271
    .line 272
    shl-int/lit8 v3, v2, 0x3

    .line 273
    .line 274
    or-int/lit8 v3, v3, 0x6

    .line 275
    .line 276
    const-string v4, "\u7f16\u8f91\u7b14\u8bb0"

    .line 277
    .line 278
    invoke-virtual {v0, v4, v1, v3}, Lcom/friday/user/view/HelpFragment;->A(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    .line 279
    .line 280
    .line 281
    sget v3, Lcom/friday/user/R$string;->help_text_compile:I

    .line 282
    .line 283
    invoke-static {v3, v1, v6}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    shl-int/lit8 v4, v2, 0x3

    .line 288
    .line 289
    invoke-virtual {v0, v3, v1, v4}, Lcom/friday/user/view/HelpFragment;->v(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    .line 290
    .line 291
    .line 292
    shl-int/lit8 v3, v2, 0x3

    .line 293
    .line 294
    or-int/lit8 v3, v3, 0x6

    .line 295
    .line 296
    const-string v4, "\u7ba1\u7406\u7b14\u8bb0"

    .line 297
    .line 298
    invoke-virtual {v0, v4, v1, v3}, Lcom/friday/user/view/HelpFragment;->A(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    .line 299
    .line 300
    .line 301
    sget v3, Lcom/friday/user/R$string;->help_text_management:I

    .line 302
    .line 303
    invoke-static {v3, v1, v6}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v3

    .line 307
    shl-int/lit8 v4, v2, 0x3

    .line 308
    .line 309
    invoke-virtual {v0, v3, v1, v4}, Lcom/friday/user/view/HelpFragment;->v(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    .line 310
    .line 311
    .line 312
    shl-int/lit8 v3, v2, 0x3

    .line 313
    .line 314
    or-int/lit8 v3, v3, 0x6

    .line 315
    .line 316
    const-string v4, "\u79bb\u7ebf\u673a\u5236"

    .line 317
    .line 318
    invoke-virtual {v0, v4, v1, v3}, Lcom/friday/user/view/HelpFragment;->A(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    .line 319
    .line 320
    .line 321
    sget v3, Lcom/friday/user/R$string;->offline_help:I

    .line 322
    .line 323
    invoke-static {v3, v1, v6}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v3

    .line 327
    shl-int/lit8 v2, v2, 0x3

    .line 328
    .line 329
    invoke-virtual {v0, v3, v1, v2}, Lcom/friday/user/view/HelpFragment;->v(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    .line 330
    .line 331
    .line 332
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 333
    .line 334
    .line 335
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 336
    .line 337
    .line 338
    move-result v0

    .line 339
    if-eqz v0, :cond_7

    .line 340
    .line 341
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 342
    .line 343
    .line 344
    goto :goto_2

    .line 345
    :cond_6
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 346
    .line 347
    .line 348
    :cond_7
    :goto_2
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 349
    .line 350
    return-object v0
.end method

.method public static final z(Lcom/friday/user/view/HelpFragment;ILandroidx/compose/runtime/Composer;I)Lqc/q;
    .locals 0

    .line 1
    or-int/lit8 p1, p1, 0x1

    .line 2
    .line 3
    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {p0, p2, p1}, Lcom/friday/user/view/HelpFragment;->x(Landroidx/compose/runtime/Composer;I)V

    .line 8
    .line 9
    .line 10
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 11
    .line 12
    return-object p0
.end method


# virtual methods
.method public final A(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
    .locals 30

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "content"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const v1, 0x63ed2898

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
    if-eqz v4, :cond_8

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
    const-string v5, "com.friday.user.view.HelpFragment.TitleText (HelpFragment.kt:74)"

    .line 60
    .line 61
    invoke-static {v1, v3, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 62
    .line 63
    .line 64
    :cond_3
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 65
    .line 66
    sget-object v4, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 67
    .line 68
    invoke-virtual {v4}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    sget-object v5, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 73
    .line 74
    invoke-virtual {v5}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    invoke-static {v4, v5, v2, v6}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-static {v2, v6}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    invoke-static {v2, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 91
    .line 92
    .line 93
    move-result-object v8

    .line 94
    sget-object v9, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 95
    .line 96
    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lhd/a;

    .line 97
    .line 98
    .line 99
    move-result-object v10

    .line 100
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 101
    .line 102
    .line 103
    move-result-object v11

    .line 104
    if-nez v11, :cond_4

    .line 105
    .line 106
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 107
    .line 108
    .line 109
    :cond_4
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 110
    .line 111
    .line 112
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 113
    .line 114
    .line 115
    move-result v11

    .line 116
    if-eqz v11, :cond_5

    .line 117
    .line 118
    invoke-interface {v2, v10}, Landroidx/compose/runtime/Composer;->createNode(Lhd/a;)V

    .line 119
    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_5
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 123
    .line 124
    .line 125
    :goto_3
    invoke-static {v2}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 126
    .line 127
    .line 128
    move-result-object v10

    .line 129
    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lhd/p;

    .line 130
    .line 131
    .line 132
    move-result-object v11

    .line 133
    invoke-static {v10, v4, v11}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lhd/p;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    invoke-static {v10, v7, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lhd/p;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 148
    .line 149
    .line 150
    move-result v7

    .line 151
    if-nez v7, :cond_6

    .line 152
    .line 153
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 158
    .line 159
    .line 160
    move-result-object v11

    .line 161
    invoke-static {v7, v11}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v7

    .line 165
    if-nez v7, :cond_7

    .line 166
    .line 167
    :cond_6
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 168
    .line 169
    .line 170
    move-result-object v7

    .line 171
    invoke-interface {v10, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 175
    .line 176
    .line 177
    move-result-object v5

    .line 178
    invoke-interface {v10, v5, v4}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lhd/p;)V

    .line 179
    .line 180
    .line 181
    :cond_7
    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lhd/p;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    invoke-static {v10, v8, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 186
    .line 187
    .line 188
    sget-object v4, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 189
    .line 190
    sget v4, Lcom/friday/user/R$color;->app_l_dark:I

    .line 191
    .line 192
    invoke-static {v4, v2, v6}, Landroidx/compose/ui/res/ColorResources_androidKt;->colorResource(ILandroidx/compose/runtime/Composer;I)J

    .line 193
    .line 194
    .line 195
    move-result-wide v4

    .line 196
    sget v7, Lcom/friday/user/R$dimen;->view_9:I

    .line 197
    .line 198
    invoke-static {v7, v2, v6}, Landroidx/compose/ui/res/PrimitiveResources_androidKt;->dimensionResource(ILandroidx/compose/runtime/Composer;I)F

    .line 199
    .line 200
    .line 201
    move-result v7

    .line 202
    invoke-static {v7, v2, v6}, Lz1/b;->m(FLandroidx/compose/runtime/Composer;I)J

    .line 203
    .line 204
    .line 205
    move-result-wide v7

    .line 206
    sget-object v9, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    .line 207
    .line 208
    invoke-virtual {v9}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    .line 209
    .line 210
    .line 211
    move-result-object v9

    .line 212
    and-int/lit8 v3, v3, 0xe

    .line 213
    .line 214
    const/high16 v10, 0x30000

    .line 215
    .line 216
    or-int v22, v3, v10

    .line 217
    .line 218
    const/16 v23, 0x0

    .line 219
    .line 220
    const v24, 0x1ffd2

    .line 221
    .line 222
    .line 223
    move-object v3, v1

    .line 224
    const/4 v1, 0x0

    .line 225
    move v10, v6

    .line 226
    const/4 v6, 0x0

    .line 227
    move-object/from16 v21, v2

    .line 228
    .line 229
    move-wide/from16 v28, v7

    .line 230
    .line 231
    move-object v7, v3

    .line 232
    move-wide v2, v4

    .line 233
    move-wide/from16 v4, v28

    .line 234
    .line 235
    const/4 v8, 0x0

    .line 236
    move-object v11, v7

    .line 237
    move-object v7, v9

    .line 238
    move v12, v10

    .line 239
    const-wide/16 v9, 0x0

    .line 240
    .line 241
    move-object v13, v11

    .line 242
    const/4 v11, 0x0

    .line 243
    move v14, v12

    .line 244
    const/4 v12, 0x0

    .line 245
    move-object v15, v13

    .line 246
    move/from16 v16, v14

    .line 247
    .line 248
    const-wide/16 v13, 0x0

    .line 249
    .line 250
    move-object/from16 v17, v15

    .line 251
    .line 252
    const/4 v15, 0x0

    .line 253
    move/from16 v18, v16

    .line 254
    .line 255
    const/16 v16, 0x0

    .line 256
    .line 257
    move-object/from16 v19, v17

    .line 258
    .line 259
    const/16 v17, 0x0

    .line 260
    .line 261
    move/from16 v20, v18

    .line 262
    .line 263
    const/16 v18, 0x0

    .line 264
    .line 265
    move-object/from16 v25, v19

    .line 266
    .line 267
    const/16 v19, 0x0

    .line 268
    .line 269
    move/from16 v26, v20

    .line 270
    .line 271
    const/16 v20, 0x0

    .line 272
    .line 273
    move-object/from16 v27, v25

    .line 274
    .line 275
    invoke-static/range {v0 .. v24}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILhd/l;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 276
    .line 277
    .line 278
    move-object/from16 v1, v21

    .line 279
    .line 280
    sget v2, Lcom/friday/user/R$dimen;->view_5:I

    .line 281
    .line 282
    const/4 v12, 0x0

    .line 283
    invoke-static {v2, v1, v12}, Landroidx/compose/ui/res/PrimitiveResources_androidKt;->dimensionResource(ILandroidx/compose/runtime/Composer;I)F

    .line 284
    .line 285
    .line 286
    move-result v2

    .line 287
    move-object/from16 v13, v27

    .line 288
    .line 289
    invoke-static {v13, v2}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 290
    .line 291
    .line 292
    move-result-object v2

    .line 293
    invoke-static {v2, v1, v12}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 294
    .line 295
    .line 296
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 297
    .line 298
    .line 299
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 300
    .line 301
    .line 302
    move-result v2

    .line 303
    if-eqz v2, :cond_9

    .line 304
    .line 305
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 306
    .line 307
    .line 308
    goto :goto_4

    .line 309
    :cond_8
    move-object v1, v2

    .line 310
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 311
    .line 312
    .line 313
    :cond_9
    :goto_4
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    if-eqz v1, :cond_a

    .line 318
    .line 319
    new-instance v2, Lh4/k;

    .line 320
    .line 321
    move-object/from16 v3, p0

    .line 322
    .line 323
    move/from16 v4, p3

    .line 324
    .line 325
    invoke-direct {v2, v3, v0, v4}, Lh4/k;-><init>(Lcom/friday/user/view/HelpFragment;Ljava/lang/String;I)V

    .line 326
    .line 327
    .line 328
    invoke-interface {v1, v2}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lhd/p;)V

    .line 329
    .line 330
    .line 331
    return-void

    .line 332
    :cond_a
    move-object/from16 v3, p0

    .line 333
    .line 334
    return-void
.end method

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
    new-instance p1, Lh4/g;

    .line 42
    .line 43
    invoke-direct {p1, p0}, Lh4/g;-><init>(Lcom/friday/user/view/HelpFragment;)V

    .line 44
    .line 45
    .line 46
    const p2, -0x215ccab0

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

.method public final v(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
    .locals 30

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "content"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const v1, -0x65784ee9

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
    if-eqz v4, :cond_8

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
    const-string v5, "com.friday.user.view.HelpFragment.ContentText (HelpFragment.kt:86)"

    .line 60
    .line 61
    invoke-static {v1, v3, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 62
    .line 63
    .line 64
    :cond_3
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 65
    .line 66
    sget-object v4, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 67
    .line 68
    invoke-virtual {v4}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    sget-object v5, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 73
    .line 74
    invoke-virtual {v5}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    invoke-static {v4, v5, v2, v6}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-static {v2, v6}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    invoke-static {v2, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 91
    .line 92
    .line 93
    move-result-object v8

    .line 94
    sget-object v9, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 95
    .line 96
    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lhd/a;

    .line 97
    .line 98
    .line 99
    move-result-object v10

    .line 100
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 101
    .line 102
    .line 103
    move-result-object v11

    .line 104
    if-nez v11, :cond_4

    .line 105
    .line 106
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 107
    .line 108
    .line 109
    :cond_4
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 110
    .line 111
    .line 112
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 113
    .line 114
    .line 115
    move-result v11

    .line 116
    if-eqz v11, :cond_5

    .line 117
    .line 118
    invoke-interface {v2, v10}, Landroidx/compose/runtime/Composer;->createNode(Lhd/a;)V

    .line 119
    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_5
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 123
    .line 124
    .line 125
    :goto_3
    invoke-static {v2}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 126
    .line 127
    .line 128
    move-result-object v10

    .line 129
    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lhd/p;

    .line 130
    .line 131
    .line 132
    move-result-object v11

    .line 133
    invoke-static {v10, v4, v11}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lhd/p;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    invoke-static {v10, v7, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lhd/p;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 148
    .line 149
    .line 150
    move-result v7

    .line 151
    if-nez v7, :cond_6

    .line 152
    .line 153
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 158
    .line 159
    .line 160
    move-result-object v11

    .line 161
    invoke-static {v7, v11}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v7

    .line 165
    if-nez v7, :cond_7

    .line 166
    .line 167
    :cond_6
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 168
    .line 169
    .line 170
    move-result-object v7

    .line 171
    invoke-interface {v10, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 175
    .line 176
    .line 177
    move-result-object v5

    .line 178
    invoke-interface {v10, v5, v4}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lhd/p;)V

    .line 179
    .line 180
    .line 181
    :cond_7
    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lhd/p;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    invoke-static {v10, v8, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lhd/p;)V

    .line 186
    .line 187
    .line 188
    sget-object v4, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 189
    .line 190
    sget v4, Lcom/friday/user/R$color;->app_l_dark:I

    .line 191
    .line 192
    invoke-static {v4, v2, v6}, Landroidx/compose/ui/res/ColorResources_androidKt;->colorResource(ILandroidx/compose/runtime/Composer;I)J

    .line 193
    .line 194
    .line 195
    move-result-wide v4

    .line 196
    sget v7, Lcom/friday/user/R$dimen;->view_9:I

    .line 197
    .line 198
    invoke-static {v7, v2, v6}, Landroidx/compose/ui/res/PrimitiveResources_androidKt;->dimensionResource(ILandroidx/compose/runtime/Composer;I)F

    .line 199
    .line 200
    .line 201
    move-result v7

    .line 202
    invoke-static {v7, v2, v6}, Lz1/b;->m(FLandroidx/compose/runtime/Composer;I)J

    .line 203
    .line 204
    .line 205
    move-result-wide v7

    .line 206
    sget v9, Lcom/friday/user/R$dimen;->view_20:I

    .line 207
    .line 208
    invoke-static {v9, v2, v6}, Landroidx/compose/ui/res/PrimitiveResources_androidKt;->dimensionResource(ILandroidx/compose/runtime/Composer;I)F

    .line 209
    .line 210
    .line 211
    move-result v9

    .line 212
    invoke-static {v9, v2, v6}, Lz1/b;->m(FLandroidx/compose/runtime/Composer;I)J

    .line 213
    .line 214
    .line 215
    move-result-wide v13

    .line 216
    and-int/lit8 v22, v3, 0xe

    .line 217
    .line 218
    const/16 v23, 0x0

    .line 219
    .line 220
    const v24, 0x1fbf2

    .line 221
    .line 222
    .line 223
    move-object v3, v1

    .line 224
    const/4 v1, 0x0

    .line 225
    move v9, v6

    .line 226
    const/4 v6, 0x0

    .line 227
    move-object/from16 v21, v2

    .line 228
    .line 229
    move-wide/from16 v28, v7

    .line 230
    .line 231
    move-object v8, v3

    .line 232
    move-wide v2, v4

    .line 233
    move-wide/from16 v4, v28

    .line 234
    .line 235
    const/4 v7, 0x0

    .line 236
    move-object v10, v8

    .line 237
    const/4 v8, 0x0

    .line 238
    move v12, v9

    .line 239
    move-object v11, v10

    .line 240
    const-wide/16 v9, 0x0

    .line 241
    .line 242
    move-object v15, v11

    .line 243
    const/4 v11, 0x0

    .line 244
    move/from16 v16, v12

    .line 245
    .line 246
    const/4 v12, 0x0

    .line 247
    move-object/from16 v17, v15

    .line 248
    .line 249
    const/4 v15, 0x0

    .line 250
    move/from16 v18, v16

    .line 251
    .line 252
    const/16 v16, 0x0

    .line 253
    .line 254
    move-object/from16 v19, v17

    .line 255
    .line 256
    const/16 v17, 0x0

    .line 257
    .line 258
    move/from16 v20, v18

    .line 259
    .line 260
    const/16 v18, 0x0

    .line 261
    .line 262
    move-object/from16 v25, v19

    .line 263
    .line 264
    const/16 v19, 0x0

    .line 265
    .line 266
    move/from16 v26, v20

    .line 267
    .line 268
    const/16 v20, 0x0

    .line 269
    .line 270
    move-object/from16 v27, v25

    .line 271
    .line 272
    invoke-static/range {v0 .. v24}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILhd/l;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 273
    .line 274
    .line 275
    move-object/from16 v1, v21

    .line 276
    .line 277
    sget v2, Lcom/friday/user/R$dimen;->view_5:I

    .line 278
    .line 279
    const/4 v12, 0x0

    .line 280
    invoke-static {v2, v1, v12}, Landroidx/compose/ui/res/PrimitiveResources_androidKt;->dimensionResource(ILandroidx/compose/runtime/Composer;I)F

    .line 281
    .line 282
    .line 283
    move-result v2

    .line 284
    move-object/from16 v15, v27

    .line 285
    .line 286
    invoke-static {v15, v2}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 287
    .line 288
    .line 289
    move-result-object v2

    .line 290
    invoke-static {v2, v1, v12}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 291
    .line 292
    .line 293
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 294
    .line 295
    .line 296
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 297
    .line 298
    .line 299
    move-result v2

    .line 300
    if-eqz v2, :cond_9

    .line 301
    .line 302
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 303
    .line 304
    .line 305
    goto :goto_4

    .line 306
    :cond_8
    move-object v1, v2

    .line 307
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 308
    .line 309
    .line 310
    :cond_9
    :goto_4
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    if-eqz v1, :cond_a

    .line 315
    .line 316
    new-instance v2, Lh4/j;

    .line 317
    .line 318
    move-object/from16 v3, p0

    .line 319
    .line 320
    move/from16 v4, p3

    .line 321
    .line 322
    invoke-direct {v2, v3, v0, v4}, Lh4/j;-><init>(Lcom/friday/user/view/HelpFragment;Ljava/lang/String;I)V

    .line 323
    .line 324
    .line 325
    invoke-interface {v1, v2}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lhd/p;)V

    .line 326
    .line 327
    .line 328
    return-void

    .line 329
    :cond_a
    move-object/from16 v3, p0

    .line 330
    .line 331
    return-void
.end method

.method public final x(Landroidx/compose/runtime/Composer;I)V
    .locals 8

    .line 1
    const v0, 0x1e1bc372

    .line 2
    .line 3
    .line 4
    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 5
    .line 6
    .line 7
    move-result-object v5

    .line 8
    and-int/lit8 p1, p2, 0x6

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    if-nez p1, :cond_2

    .line 12
    .line 13
    and-int/lit8 p1, p2, 0x8

    .line 14
    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    invoke-interface {v5, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-interface {v5, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    :goto_0
    if-eqz p1, :cond_1

    .line 27
    .line 28
    const/4 p1, 0x4

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move p1, v1

    .line 31
    :goto_1
    or-int/2addr p1, p2

    .line 32
    goto :goto_2

    .line 33
    :cond_2
    move p1, p2

    .line 34
    :goto_2
    and-int/lit8 v2, p1, 0x3

    .line 35
    .line 36
    const/4 v3, 0x1

    .line 37
    if-eq v2, v1, :cond_3

    .line 38
    .line 39
    move v1, v3

    .line 40
    goto :goto_3

    .line 41
    :cond_3
    const/4 v1, 0x0

    .line 42
    :goto_3
    and-int/lit8 v2, p1, 0x1

    .line 43
    .line 44
    invoke-interface {v5, v1, v2}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_5

    .line 49
    .line 50
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_4

    .line 55
    .line 56
    const/4 v1, -0x1

    .line 57
    const-string v2, "com.friday.user.view.HelpFragment.InfoCard (HelpFragment.kt:47)"

    .line 58
    .line 59
    invoke-static {v0, p1, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 60
    .line 61
    .line 62
    :cond_4
    new-instance p1, Lh4/h;

    .line 63
    .line 64
    invoke-direct {p1, p0}, Lh4/h;-><init>(Lcom/friday/user/view/HelpFragment;)V

    .line 65
    .line 66
    .line 67
    const/16 v0, 0x36

    .line 68
    .line 69
    const v1, -0x85fa8ba

    .line 70
    .line 71
    .line 72
    invoke-static {v1, v3, p1, v5, v0}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    const/16 v6, 0xc00

    .line 77
    .line 78
    const/4 v7, 0x7

    .line 79
    const/4 v1, 0x0

    .line 80
    const/4 v2, 0x0

    .line 81
    const/4 v3, 0x0

    .line 82
    invoke-static/range {v1 .. v7}, Landroidx/compose/material3/MaterialThemeKt;->MaterialTheme(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/Shapes;Landroidx/compose/material3/Typography;Lhd/p;Landroidx/compose/runtime/Composer;II)V

    .line 83
    .line 84
    .line 85
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-eqz p1, :cond_6

    .line 90
    .line 91
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 92
    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_5
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 96
    .line 97
    .line 98
    :cond_6
    :goto_4
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    if-eqz p1, :cond_7

    .line 103
    .line 104
    new-instance v0, Lh4/i;

    .line 105
    .line 106
    invoke-direct {v0, p0, p2}, Lh4/i;-><init>(Lcom/friday/user/view/HelpFragment;I)V

    .line 107
    .line 108
    .line 109
    invoke-interface {p1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lhd/p;)V

    .line 110
    .line 111
    .line 112
    :cond_7
    return-void
.end method
