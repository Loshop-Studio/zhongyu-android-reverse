.class public final synthetic Lcom/zykj/mistake/feature/collection/component/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/f;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/component/a;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/zykj/mistake/feature/collection/component/a;->b:Ljava/lang/String;

    iput-wide p3, p0, Lcom/zykj/mistake/feature/collection/component/a;->c:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lr6/e;

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    check-cast v2, Landroidx/compose/runtime/Composer;

    .line 10
    .line 11
    move-object/from16 v3, p3

    .line 12
    .line 13
    check-cast v3, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const-string v4, "innerTextField"

    .line 20
    .line 21
    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    and-int/lit8 v4, v3, 0x6

    .line 25
    .line 26
    if-nez v4, :cond_1

    .line 27
    .line 28
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_0

    .line 33
    .line 34
    const/4 v4, 0x4

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v4, 0x2

    .line 37
    :goto_0
    or-int/2addr v3, v4

    .line 38
    :cond_1
    and-int/lit8 v4, v3, 0x13

    .line 39
    .line 40
    const/16 v5, 0x12

    .line 41
    .line 42
    const/4 v6, 0x0

    .line 43
    if-eq v4, v5, :cond_2

    .line 44
    .line 45
    const/4 v4, 0x1

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    move v4, v6

    .line 48
    :goto_1
    and-int/lit8 v5, v3, 0x1

    .line 49
    .line 50
    invoke-interface {v2, v4, v5}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-eqz v4, :cond_a

    .line 55
    .line 56
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    if-eqz v4, :cond_3

    .line 61
    .line 62
    const/4 v4, -0x1

    .line 63
    const-string v5, "com.zykj.mistake.feature.collection.component.NameInputField.<anonymous> (MistakeCollectionNameDialog.kt:225)"

    .line 64
    .line 65
    const v7, 0x603d5cb8

    .line 66
    .line 67
    .line 68
    invoke-static {v7, v3, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    :cond_3
    sget-object v4, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 72
    .line 73
    invoke-virtual {v4}, Landroidx/compose/ui/Alignment$Companion;->getCenterStart()Landroidx/compose/ui/Alignment;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    sget-object v5, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 78
    .line 79
    invoke-static {v4, v6}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    invoke-static {v2, v6}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    invoke-static {v2, v5}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    sget-object v8, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 96
    .line 97
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 98
    .line 99
    .line 100
    move-result-object v9

    .line 101
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 102
    .line 103
    .line 104
    move-result-object v10

    .line 105
    if-nez v10, :cond_4

    .line 106
    .line 107
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 108
    .line 109
    .line 110
    :cond_4
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 111
    .line 112
    .line 113
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 114
    .line 115
    .line 116
    move-result v10

    .line 117
    if-eqz v10, :cond_5

    .line 118
    .line 119
    invoke-interface {v2, v9}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 120
    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_5
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 124
    .line 125
    .line 126
    :goto_2
    invoke-static {v2}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 127
    .line 128
    .line 129
    move-result-object v9

    .line 130
    invoke-static {v8, v9, v4, v9, v7}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 135
    .line 136
    .line 137
    move-result v7

    .line 138
    if-nez v7, :cond_6

    .line 139
    .line 140
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v7

    .line 144
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 145
    .line 146
    .line 147
    move-result-object v10

    .line 148
    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v7

    .line 152
    if-nez v7, :cond_7

    .line 153
    .line 154
    :cond_6
    invoke-static {v6, v9, v6, v4}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 155
    .line 156
    .line 157
    :cond_7
    invoke-virtual {v8}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    invoke-static {v9, v5, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 162
    .line 163
    .line 164
    sget-object v4, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 165
    .line 166
    iget-object v4, v0, Lcom/zykj/mistake/feature/collection/component/a;->a:Ljava/lang/String;

    .line 167
    .line 168
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 169
    .line 170
    .line 171
    move-result v4

    .line 172
    if-nez v4, :cond_9

    .line 173
    .line 174
    iget-object v4, v0, Lcom/zykj/mistake/feature/collection/component/a;->b:Ljava/lang/String;

    .line 175
    .line 176
    if-eqz v4, :cond_9

    .line 177
    .line 178
    invoke-static {v4}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 179
    .line 180
    .line 181
    move-result v5

    .line 182
    if-eqz v5, :cond_8

    .line 183
    .line 184
    goto :goto_4

    .line 185
    :cond_8
    const v5, 0x3f4f66b6

    .line 186
    .line 187
    .line 188
    invoke-interface {v2, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 189
    .line 190
    .line 191
    const-wide v5, 0xffc2c2c2L

    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    invoke-static {v5, v6}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 197
    .line 198
    .line 199
    move-result-wide v5

    .line 200
    const/16 v25, 0x0

    .line 201
    .line 202
    const v26, 0x1fff2

    .line 203
    .line 204
    .line 205
    move v7, v3

    .line 206
    const/4 v3, 0x0

    .line 207
    move-wide v8, v5

    .line 208
    move v5, v7

    .line 209
    iget-wide v6, v0, Lcom/zykj/mistake/feature/collection/component/a;->c:J

    .line 210
    .line 211
    move-object/from16 v23, v2

    .line 212
    .line 213
    move-object v2, v4

    .line 214
    move-wide/from16 v28, v8

    .line 215
    .line 216
    move v9, v5

    .line 217
    move-wide/from16 v4, v28

    .line 218
    .line 219
    const/4 v8, 0x0

    .line 220
    move v10, v9

    .line 221
    const/4 v9, 0x0

    .line 222
    move v11, v10

    .line 223
    const/4 v10, 0x0

    .line 224
    move v13, v11

    .line 225
    const-wide/16 v11, 0x0

    .line 226
    .line 227
    move v14, v13

    .line 228
    const/4 v13, 0x0

    .line 229
    move v15, v14

    .line 230
    const/4 v14, 0x0

    .line 231
    move/from16 v17, v15

    .line 232
    .line 233
    const-wide/16 v15, 0x0

    .line 234
    .line 235
    move/from16 v18, v17

    .line 236
    .line 237
    const/16 v17, 0x0

    .line 238
    .line 239
    move/from16 v19, v18

    .line 240
    .line 241
    const/16 v18, 0x0

    .line 242
    .line 243
    move/from16 v20, v19

    .line 244
    .line 245
    const/16 v19, 0x0

    .line 246
    .line 247
    move/from16 v21, v20

    .line 248
    .line 249
    const/16 v20, 0x0

    .line 250
    .line 251
    move/from16 v22, v21

    .line 252
    .line 253
    const/16 v21, 0x0

    .line 254
    .line 255
    move/from16 v24, v22

    .line 256
    .line 257
    const/16 v22, 0x0

    .line 258
    .line 259
    move/from16 v27, v24

    .line 260
    .line 261
    const/16 v24, 0x180

    .line 262
    .line 263
    invoke-static/range {v2 .. v26}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 264
    .line 265
    .line 266
    move-object/from16 v2, v23

    .line 267
    .line 268
    :goto_3
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 269
    .line 270
    .line 271
    goto :goto_5

    .line 272
    :cond_9
    :goto_4
    move/from16 v27, v3

    .line 273
    .line 274
    const v3, 0x3ec93144

    .line 275
    .line 276
    .line 277
    invoke-interface {v2, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 278
    .line 279
    .line 280
    goto :goto_3

    .line 281
    :goto_5
    and-int/lit8 v3, v27, 0xe

    .line 282
    .line 283
    invoke-static {v2, v3, v1}, Landroidx/collection/a;->y(Landroidx/compose/runtime/Composer;ILr6/e;)Z

    .line 284
    .line 285
    .line 286
    move-result v1

    .line 287
    if-eqz v1, :cond_b

    .line 288
    .line 289
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 290
    .line 291
    .line 292
    goto :goto_6

    .line 293
    :cond_a
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 294
    .line 295
    .line 296
    :cond_b
    :goto_6
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 297
    .line 298
    return-object v1
.end method
