.class public abstract Lcom/zykj/mistake/feature/notebook/detail/q4;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:J

.field public static final synthetic b:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-wide v0, 0xffd8d8d8L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    sput-wide v0, Lcom/zykj/mistake/feature/notebook/detail/q4;->a:J

    .line 11
    .line 12
    return-void
.end method

.method public static final a(Lr6/a;Landroidx/compose/runtime/Composer;I)V
    .locals 12

    .line 1
    const-string v0, "onClick"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const v0, -0x2451d5aa

    .line 7
    .line 8
    .line 9
    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    and-int/lit8 v1, p2, 0x6

    .line 14
    .line 15
    const/4 v2, 0x2

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    invoke-interface {p1, p0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    const/4 v1, 0x4

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v1, v2

    .line 27
    :goto_0
    or-int/2addr v1, p2

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    move v1, p2

    .line 30
    :goto_1
    and-int/lit8 v3, v1, 0x3

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    if-eq v3, v2, :cond_2

    .line 34
    .line 35
    const/4 v2, 0x1

    .line 36
    goto :goto_2

    .line 37
    :cond_2
    move v2, v4

    .line 38
    :goto_2
    and-int/lit8 v3, v1, 0x1

    .line 39
    .line 40
    invoke-interface {p1, v2, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_9

    .line 45
    .line 46
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_3

    .line 51
    .line 52
    const/4 v2, -0x1

    .line 53
    const-string v3, "com.zykj.mistake.feature.notebook.detail.AddPictureNoteItem (MistakeDetailNotePanel.kt:293)"

    .line 54
    .line 55
    invoke-static {v0, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :cond_3
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 59
    .line 60
    sget v1, Lcom/zykj/mistake/feature/notebook/detail/t4;->f:F

    .line 61
    .line 62
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    sget v2, Lcom/zykj/mistake/feature/notebook/detail/t4;->e:F

    .line 67
    .line 68
    invoke-static {v2}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-static {v1, v3}, Landroidx/compose/ui/draw/ClipKt;->clip(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    const-string v3, "$this$dashedNoteBorder"

    .line 77
    .line 78
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    new-instance v3, Lcom/zykj/mistake/feature/notebook/detail/k4;

    .line 82
    .line 83
    invoke-direct {v3, v2}, Lcom/zykj/mistake/feature/notebook/detail/k4;-><init>(F)V

    .line 84
    .line 85
    .line 86
    invoke-static {v1, v3}, Landroidx/compose/ui/draw/DrawModifierKt;->drawBehind(Landroidx/compose/ui/Modifier;Lr6/c;)Landroidx/compose/ui/Modifier;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    const/4 v10, 0x7

    .line 91
    const/4 v11, 0x0

    .line 92
    const/4 v6, 0x0

    .line 93
    const/4 v7, 0x0

    .line 94
    const/4 v8, 0x0

    .line 95
    move-object v9, p0

    .line 96
    invoke-static/range {v5 .. v11}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lr6/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    sget-object v1, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 101
    .line 102
    invoke-virtual {v1}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-static {v1, v4}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-static {p1, v4}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    invoke-static {p1, p0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    sget-object v5, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 123
    .line 124
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 125
    .line 126
    .line 127
    move-result-object v6

    .line 128
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 129
    .line 130
    .line 131
    move-result-object v7

    .line 132
    if-nez v7, :cond_4

    .line 133
    .line 134
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 135
    .line 136
    .line 137
    :cond_4
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 138
    .line 139
    .line 140
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 141
    .line 142
    .line 143
    move-result v7

    .line 144
    if-eqz v7, :cond_5

    .line 145
    .line 146
    invoke-interface {p1, v6}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 147
    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_5
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 151
    .line 152
    .line 153
    :goto_3
    invoke-static {p1}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 154
    .line 155
    .line 156
    move-result-object v6

    .line 157
    invoke-static {v5, v6, v1, v6, v3}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 162
    .line 163
    .line 164
    move-result v3

    .line 165
    if-nez v3, :cond_6

    .line 166
    .line 167
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 172
    .line 173
    .line 174
    move-result-object v7

    .line 175
    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    if-nez v3, :cond_7

    .line 180
    .line 181
    :cond_6
    invoke-static {v2, v6, v2, v1}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 182
    .line 183
    .line 184
    :cond_7
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    invoke-static {v6, p0, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 189
    .line 190
    .line 191
    sget-object p0, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 192
    .line 193
    const/16 p0, 0x16

    .line 194
    .line 195
    int-to-float v1, p0

    .line 196
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 209
    .line 210
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    if-ne v1, v2, :cond_8

    .line 215
    .line 216
    new-instance v1, Lcom/zykj/mistake/feature/collection/component/j;

    .line 217
    .line 218
    invoke-direct {v1, p0}, Lcom/zykj/mistake/feature/collection/component/j;-><init>(I)V

    .line 219
    .line 220
    .line 221
    invoke-interface {p1, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    :cond_8
    check-cast v1, Lr6/c;

    .line 225
    .line 226
    const/16 p0, 0x36

    .line 227
    .line 228
    invoke-static {v0, v1, p1, p0}, Landroidx/compose/foundation/CanvasKt;->Canvas(Landroidx/compose/ui/Modifier;Lr6/c;Landroidx/compose/runtime/Composer;I)V

    .line 229
    .line 230
    .line 231
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 232
    .line 233
    .line 234
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 235
    .line 236
    .line 237
    move-result p0

    .line 238
    if-eqz p0, :cond_a

    .line 239
    .line 240
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 241
    .line 242
    .line 243
    goto :goto_4

    .line 244
    :cond_9
    move-object v9, p0

    .line 245
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 246
    .line 247
    .line 248
    :cond_a
    :goto_4
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    if-eqz p0, :cond_b

    .line 253
    .line 254
    new-instance p1, Lcom/zykj/mistake/feature/notebook/detail/l4;

    .line 255
    .line 256
    invoke-direct {p1, p2, v4, v9}, Lcom/zykj/mistake/feature/notebook/detail/l4;-><init>(IILr6/a;)V

    .line 257
    .line 258
    .line 259
    invoke-interface {p0, p1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 260
    .line 261
    .line 262
    :cond_b
    return-void
.end method

.method public static final b(Ljava/util/List;ZLr6/a;Lr6/c;Lr6/c;Landroidx/compose/runtime/Composer;I)V
    .locals 28

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v9, p1

    .line 4
    .line 5
    move-object/from16 v10, p2

    .line 6
    .line 7
    move-object/from16 v4, p3

    .line 8
    .line 9
    move-object/from16 v5, p4

    .line 10
    .line 11
    move/from16 v11, p6

    .line 12
    .line 13
    const-string v0, "pictureNotes"

    .line 14
    .line 15
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v0, "onAddClick"

    .line 19
    .line 20
    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const-string v0, "onImageClick"

    .line 24
    .line 25
    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-string v0, "onReorder"

    .line 29
    .line 30
    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const v0, 0x40bf245b

    .line 34
    .line 35
    .line 36
    move-object/from16 v2, p5

    .line 37
    .line 38
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 39
    .line 40
    .line 41
    move-result-object v12

    .line 42
    and-int/lit8 v2, v11, 0x6

    .line 43
    .line 44
    const/4 v13, 0x2

    .line 45
    if-nez v2, :cond_1

    .line 46
    .line 47
    invoke-interface {v12, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_0

    .line 52
    .line 53
    const/4 v2, 0x4

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    move v2, v13

    .line 56
    :goto_0
    or-int/2addr v2, v11

    .line 57
    goto :goto_1

    .line 58
    :cond_1
    move v2, v11

    .line 59
    :goto_1
    and-int/lit8 v3, v11, 0x30

    .line 60
    .line 61
    if-nez v3, :cond_3

    .line 62
    .line 63
    invoke-interface {v12, v9}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_2

    .line 68
    .line 69
    const/16 v3, 0x20

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_2
    const/16 v3, 0x10

    .line 73
    .line 74
    :goto_2
    or-int/2addr v2, v3

    .line 75
    :cond_3
    and-int/lit16 v3, v11, 0x180

    .line 76
    .line 77
    if-nez v3, :cond_5

    .line 78
    .line 79
    invoke-interface {v12, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-eqz v3, :cond_4

    .line 84
    .line 85
    const/16 v3, 0x100

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_4
    const/16 v3, 0x80

    .line 89
    .line 90
    :goto_3
    or-int/2addr v2, v3

    .line 91
    :cond_5
    and-int/lit16 v3, v11, 0xc00

    .line 92
    .line 93
    if-nez v3, :cond_7

    .line 94
    .line 95
    invoke-interface {v12, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    if-eqz v3, :cond_6

    .line 100
    .line 101
    const/16 v3, 0x800

    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_6
    const/16 v3, 0x400

    .line 105
    .line 106
    :goto_4
    or-int/2addr v2, v3

    .line 107
    :cond_7
    and-int/lit16 v3, v11, 0x6000

    .line 108
    .line 109
    if-nez v3, :cond_9

    .line 110
    .line 111
    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    if-eqz v3, :cond_8

    .line 116
    .line 117
    const/16 v3, 0x4000

    .line 118
    .line 119
    goto :goto_5

    .line 120
    :cond_8
    const/16 v3, 0x2000

    .line 121
    .line 122
    :goto_5
    or-int/2addr v2, v3

    .line 123
    :cond_9
    and-int/lit16 v3, v2, 0x2493

    .line 124
    .line 125
    const/16 v6, 0x2492

    .line 126
    .line 127
    const/16 v16, 0x1

    .line 128
    .line 129
    if-eq v3, v6, :cond_a

    .line 130
    .line 131
    move/from16 v3, v16

    .line 132
    .line 133
    goto :goto_6

    .line 134
    :cond_a
    const/4 v3, 0x0

    .line 135
    :goto_6
    and-int/lit8 v6, v2, 0x1

    .line 136
    .line 137
    invoke-interface {v12, v3, v6}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    if-eqz v3, :cond_20

    .line 142
    .line 143
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    if-eqz v3, :cond_b

    .line 148
    .line 149
    const/4 v3, -0x1

    .line 150
    const-string v6, "com.zykj.mistake.feature.notebook.detail.DraggableNotePictureRow (MistakeDetailNotePanel.kt:174)"

    .line 151
    .line 152
    invoke-static {v0, v2, v3, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 153
    .line 154
    .line 155
    :cond_b
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 160
    .line 161
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v6

    .line 165
    const/4 v8, 0x0

    .line 166
    if-ne v0, v6, :cond_c

    .line 167
    .line 168
    invoke-static {v1}, Lcom/zykj/mistake/feature/notebook/detail/q4;->i(Ljava/util/List;)Ljava/util/ArrayList;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-static {v0, v8, v13, v8}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-interface {v12, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    :cond_c
    check-cast v0, Landroidx/compose/runtime/MutableState;

    .line 180
    .line 181
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v6

    .line 185
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v15

    .line 189
    if-ne v6, v15, :cond_d

    .line 190
    .line 191
    invoke-static {v8, v8, v13, v8}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 192
    .line 193
    .line 194
    move-result-object v6

    .line 195
    invoke-interface {v12, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    :cond_d
    check-cast v6, Landroidx/compose/runtime/MutableState;

    .line 199
    .line 200
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v15

    .line 204
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v14

    .line 208
    const/16 v18, 0x0

    .line 209
    .line 210
    if-ne v15, v14, :cond_e

    .line 211
    .line 212
    invoke-static/range {v18 .. v18}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 213
    .line 214
    .line 215
    move-result-object v14

    .line 216
    invoke-static {v14, v8, v13, v8}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 217
    .line 218
    .line 219
    move-result-object v15

    .line 220
    invoke-interface {v12, v15}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    :cond_e
    check-cast v15, Landroidx/compose/runtime/MutableState;

    .line 224
    .line 225
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalDensity()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 226
    .line 227
    .line 228
    move-result-object v14

    .line 229
    invoke-interface {v12, v14}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v14

    .line 233
    check-cast v14, Landroidx/compose/ui/unit/Density;

    .line 234
    .line 235
    sget v19, Lcom/zykj/mistake/feature/notebook/detail/t4;->f:F

    .line 236
    .line 237
    sget v13, Lcom/zykj/mistake/feature/notebook/detail/t4;->g:F

    .line 238
    .line 239
    add-float v19, v19, v13

    .line 240
    .line 241
    invoke-static/range {v19 .. v19}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 242
    .line 243
    .line 244
    move-result v7

    .line 245
    invoke-interface {v14, v7}, Landroidx/compose/ui/unit/Density;->toPx-0680j_4(F)F

    .line 246
    .line 247
    .line 248
    move-result v7

    .line 249
    invoke-interface {v12, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move-result v14

    .line 253
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v8

    .line 257
    if-nez v14, :cond_f

    .line 258
    .line 259
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    if-ne v8, v3, :cond_10

    .line 264
    .line 265
    :cond_f
    new-instance v8, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$1$1;

    .line 266
    .line 267
    const/4 v3, 0x0

    .line 268
    invoke-direct {v8, v1, v0, v3}, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNotePanelKt$DraggableNotePictureRow$1$1;-><init>(Ljava/util/List;Landroidx/compose/runtime/MutableState;Lh6/c;)V

    .line 269
    .line 270
    .line 271
    invoke-interface {v12, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    :cond_10
    check-cast v8, Lr6/e;

    .line 275
    .line 276
    and-int/lit8 v3, v2, 0xe

    .line 277
    .line 278
    invoke-static {v1, v8, v12, v3}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lr6/e;Landroidx/compose/runtime/Composer;I)V

    .line 279
    .line 280
    .line 281
    sget-object v3, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 282
    .line 283
    invoke-virtual {v3, v13}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    sget-object v8, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 288
    .line 289
    sget-object v13, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 290
    .line 291
    invoke-virtual {v13}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    .line 292
    .line 293
    .line 294
    move-result-object v13

    .line 295
    const/4 v14, 0x6

    .line 296
    invoke-static {v3, v13, v12, v14}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 297
    .line 298
    .line 299
    move-result-object v3

    .line 300
    move/from16 v19, v14

    .line 301
    .line 302
    const/4 v13, 0x0

    .line 303
    invoke-static {v12, v13}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 304
    .line 305
    .line 306
    move-result v14

    .line 307
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 308
    .line 309
    .line 310
    move-result-object v13

    .line 311
    invoke-static {v12, v8}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 312
    .line 313
    .line 314
    move-result-object v8

    .line 315
    move-object/from16 v22, v0

    .line 316
    .line 317
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 318
    .line 319
    invoke-virtual {v0}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 320
    .line 321
    .line 322
    move-result-object v4

    .line 323
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 324
    .line 325
    .line 326
    move-result-object v23

    .line 327
    if-nez v23, :cond_11

    .line 328
    .line 329
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 330
    .line 331
    .line 332
    :cond_11
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 333
    .line 334
    .line 335
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 336
    .line 337
    .line 338
    move-result v23

    .line 339
    if-eqz v23, :cond_12

    .line 340
    .line 341
    invoke-interface {v12, v4}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 342
    .line 343
    .line 344
    goto :goto_7

    .line 345
    :cond_12
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 346
    .line 347
    .line 348
    :goto_7
    invoke-static {v12}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 349
    .line 350
    .line 351
    move-result-object v4

    .line 352
    invoke-static {v0, v4, v3, v4, v13}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 353
    .line 354
    .line 355
    move-result-object v3

    .line 356
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 357
    .line 358
    .line 359
    move-result v13

    .line 360
    if-nez v13, :cond_13

    .line 361
    .line 362
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v13

    .line 366
    move-object/from16 v23, v0

    .line 367
    .line 368
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 373
    .line 374
    .line 375
    move-result v0

    .line 376
    if-nez v0, :cond_14

    .line 377
    .line 378
    goto :goto_8

    .line 379
    :cond_13
    move-object/from16 v23, v0

    .line 380
    .line 381
    :goto_8
    invoke-static {v14, v4, v14, v3}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 382
    .line 383
    .line 384
    :cond_14
    invoke-virtual/range {v23 .. v23}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    invoke-static {v4, v8, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 389
    .line 390
    .line 391
    sget-object v0, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 392
    .line 393
    const v0, 0x176c72f1

    .line 394
    .line 395
    .line 396
    invoke-interface {v12, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 397
    .line 398
    .line 399
    invoke-interface/range {v22 .. v22}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    check-cast v0, Ljava/util/List;

    .line 404
    .line 405
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 406
    .line 407
    .line 408
    move-result-object v13

    .line 409
    :goto_9
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 410
    .line 411
    .line 412
    move-result v0

    .line 413
    if-eqz v0, :cond_1e

    .line 414
    .line 415
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    check-cast v0, Lcom/zykj/mistake/feature/notebook/detail/b5;

    .line 420
    .line 421
    iget-object v14, v0, Lcom/zykj/mistake/feature/notebook/detail/b5;->a:Ljava/lang/String;

    .line 422
    .line 423
    const v3, -0x4ed08997

    .line 424
    .line 425
    .line 426
    invoke-interface {v12, v3, v14}, Landroidx/compose/runtime/Composer;->startMovableGroup(ILjava/lang/Object;)V

    .line 427
    .line 428
    .line 429
    invoke-interface {v6}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v3

    .line 433
    check-cast v3, Ljava/lang/String;

    .line 434
    .line 435
    invoke-static {v3, v14}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 436
    .line 437
    .line 438
    move-result v3

    .line 439
    iget-object v4, v0, Lcom/zykj/mistake/feature/notebook/detail/b5;->b:Ljava/lang/String;

    .line 440
    .line 441
    sget-object v8, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 442
    .line 443
    if-eqz v3, :cond_15

    .line 444
    .line 445
    const/high16 v23, 0x3f800000    # 1.0f

    .line 446
    .line 447
    move/from16 v27, v23

    .line 448
    .line 449
    move-object/from16 v23, v4

    .line 450
    .line 451
    move/from16 v4, v27

    .line 452
    .line 453
    goto :goto_a

    .line 454
    :cond_15
    move-object/from16 v23, v4

    .line 455
    .line 456
    move/from16 v4, v18

    .line 457
    .line 458
    :goto_a
    invoke-static {v8, v4}, Landroidx/compose/ui/ZIndexModifierKt;->zIndex(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 459
    .line 460
    .line 461
    move-result-object v24

    .line 462
    invoke-interface {v12, v3}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 463
    .line 464
    .line 465
    move-result v4

    .line 466
    move/from16 v25, v4

    .line 467
    .line 468
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v4

    .line 472
    if-nez v25, :cond_17

    .line 473
    .line 474
    sget-object v25, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 475
    .line 476
    invoke-virtual/range {v25 .. v25}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 477
    .line 478
    .line 479
    move-result-object v5

    .line 480
    if-ne v4, v5, :cond_16

    .line 481
    .line 482
    goto :goto_b

    .line 483
    :cond_16
    const/4 v5, 0x2

    .line 484
    goto :goto_c

    .line 485
    :cond_17
    :goto_b
    new-instance v4, Lcom/zykj/mistake/feature/notebook/detail/v;

    .line 486
    .line 487
    const/4 v5, 0x2

    .line 488
    invoke-direct {v4, v3, v15, v5}, Lcom/zykj/mistake/feature/notebook/detail/v;-><init>(ZLjava/lang/Object;I)V

    .line 489
    .line 490
    .line 491
    invoke-interface {v12, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 492
    .line 493
    .line 494
    :goto_c
    check-cast v4, Lr6/c;

    .line 495
    .line 496
    invoke-static {v8, v4}, Landroidx/compose/foundation/layout/OffsetKt;->offset(Landroidx/compose/ui/Modifier;Lr6/c;)Landroidx/compose/ui/Modifier;

    .line 497
    .line 498
    .line 499
    move-result-object v4

    .line 500
    invoke-interface {v12, v3}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 501
    .line 502
    .line 503
    move-result v20

    .line 504
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v5

    .line 508
    if-nez v20, :cond_18

    .line 509
    .line 510
    sget-object v20, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 511
    .line 512
    move-object/from16 v26, v6

    .line 513
    .line 514
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 515
    .line 516
    .line 517
    move-result-object v6

    .line 518
    if-ne v5, v6, :cond_19

    .line 519
    .line 520
    goto :goto_d

    .line 521
    :cond_18
    move-object/from16 v26, v6

    .line 522
    .line 523
    :goto_d
    new-instance v5, Lcom/zykj/mistake/feature/notebook/detail/o4;

    .line 524
    .line 525
    invoke-direct {v5, v3}, Lcom/zykj/mistake/feature/notebook/detail/o4;-><init>(Z)V

    .line 526
    .line 527
    .line 528
    invoke-interface {v12, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 529
    .line 530
    .line 531
    :cond_19
    check-cast v5, Lr6/c;

    .line 532
    .line 533
    invoke-static {v4, v5}, Landroidx/compose/ui/graphics/GraphicsLayerModifierKt;->graphicsLayer(Landroidx/compose/ui/Modifier;Lr6/c;)Landroidx/compose/ui/Modifier;

    .line 534
    .line 535
    .line 536
    move-result-object v20

    .line 537
    invoke-interface/range {v22 .. v22}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object v3

    .line 541
    check-cast v3, Ljava/util/List;

    .line 542
    .line 543
    and-int/lit16 v4, v2, 0x1c00

    .line 544
    .line 545
    const/16 v5, 0x800

    .line 546
    .line 547
    if-ne v4, v5, :cond_1a

    .line 548
    .line 549
    move/from16 v4, v16

    .line 550
    .line 551
    goto :goto_e

    .line 552
    :cond_1a
    const/4 v4, 0x0

    .line 553
    :goto_e
    invoke-interface {v12, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 554
    .line 555
    .line 556
    move-result v6

    .line 557
    or-int/2addr v4, v6

    .line 558
    invoke-interface {v12, v7}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 559
    .line 560
    .line 561
    move-result v6

    .line 562
    or-int/2addr v4, v6

    .line 563
    invoke-interface {v12, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 564
    .line 565
    .line 566
    move-result v6

    .line 567
    or-int/2addr v4, v6

    .line 568
    const v6, 0xe000

    .line 569
    .line 570
    .line 571
    and-int/2addr v6, v2

    .line 572
    const/16 v9, 0x4000

    .line 573
    .line 574
    if-ne v6, v9, :cond_1b

    .line 575
    .line 576
    move/from16 v6, v16

    .line 577
    .line 578
    goto :goto_f

    .line 579
    :cond_1b
    const/4 v6, 0x0

    .line 580
    :goto_f
    or-int/2addr v4, v6

    .line 581
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 582
    .line 583
    .line 584
    move-result-object v6

    .line 585
    if-nez v4, :cond_1c

    .line 586
    .line 587
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 588
    .line 589
    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    move-result-object v4

    .line 593
    if-ne v6, v4, :cond_1d

    .line 594
    .line 595
    :cond_1c
    move v4, v2

    .line 596
    move-object v2, v0

    .line 597
    goto :goto_10

    .line 598
    :cond_1d
    move-object v11, v3

    .line 599
    move/from16 v17, v5

    .line 600
    .line 601
    move-object v9, v8

    .line 602
    move-object v8, v15

    .line 603
    const/16 v21, 0x0

    .line 604
    .line 605
    const/16 v25, 0x2

    .line 606
    .line 607
    move v15, v2

    .line 608
    goto :goto_11

    .line 609
    :goto_10
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/p4;

    .line 610
    .line 611
    move-object v11, v3

    .line 612
    move/from16 v17, v5

    .line 613
    .line 614
    move v3, v7

    .line 615
    move-object v9, v8

    .line 616
    move-object v8, v15

    .line 617
    move-object/from16 v7, v22

    .line 618
    .line 619
    move-object/from16 v6, v26

    .line 620
    .line 621
    const/16 v21, 0x0

    .line 622
    .line 623
    const/16 v25, 0x2

    .line 624
    .line 625
    move-object/from16 v5, p4

    .line 626
    .line 627
    move v15, v4

    .line 628
    move-object v4, v1

    .line 629
    move-object/from16 v1, p3

    .line 630
    .line 631
    invoke-direct/range {v0 .. v8}, Lcom/zykj/mistake/feature/notebook/detail/p4;-><init>(Lr6/c;Lcom/zykj/mistake/feature/notebook/detail/b5;FLjava/util/List;Lr6/c;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V

    .line 632
    .line 633
    .line 634
    move v7, v3

    .line 635
    invoke-interface {v12, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 636
    .line 637
    .line 638
    move-object v6, v0

    .line 639
    :goto_11
    check-cast v6, Landroidx/compose/ui/input/pointer/PointerInputEventHandler;

    .line 640
    .line 641
    invoke-static {v9, v14, v11, v6}, Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt;->pointerInput(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/Modifier;

    .line 642
    .line 643
    .line 644
    move-result-object v4

    .line 645
    const/4 v6, 0x0

    .line 646
    move-object v5, v12

    .line 647
    move-object/from16 v3, v20

    .line 648
    .line 649
    move-object/from16 v1, v23

    .line 650
    .line 651
    move-object/from16 v2, v24

    .line 652
    .line 653
    invoke-static/range {v1 .. v6}, Lcom/zykj/mistake/feature/notebook/detail/q4;->f(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 654
    .line 655
    .line 656
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endMovableGroup()V

    .line 657
    .line 658
    .line 659
    move-object/from16 v1, p0

    .line 660
    .line 661
    move/from16 v9, p1

    .line 662
    .line 663
    move/from16 v11, p6

    .line 664
    .line 665
    move v2, v15

    .line 666
    move-object/from16 v6, v26

    .line 667
    .line 668
    move-object/from16 v5, p4

    .line 669
    .line 670
    move-object v15, v8

    .line 671
    goto/16 :goto_9

    .line 672
    .line 673
    :cond_1e
    move v15, v2

    .line 674
    move-object v5, v12

    .line 675
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 676
    .line 677
    .line 678
    if-eqz p1, :cond_1f

    .line 679
    .line 680
    const v0, -0x29a8ea1d

    .line 681
    .line 682
    .line 683
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 684
    .line 685
    .line 686
    shr-int/lit8 v0, v15, 0x6

    .line 687
    .line 688
    and-int/lit8 v0, v0, 0xe

    .line 689
    .line 690
    invoke-static {v10, v5, v0}, Lcom/zykj/mistake/feature/notebook/detail/q4;->a(Lr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 691
    .line 692
    .line 693
    :goto_12
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 694
    .line 695
    .line 696
    goto :goto_13

    .line 697
    :cond_1f
    const v0, -0x2a49745d

    .line 698
    .line 699
    .line 700
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 701
    .line 702
    .line 703
    goto :goto_12

    .line 704
    :goto_13
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 705
    .line 706
    .line 707
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 708
    .line 709
    .line 710
    move-result v0

    .line 711
    if-eqz v0, :cond_21

    .line 712
    .line 713
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 714
    .line 715
    .line 716
    goto :goto_14

    .line 717
    :cond_20
    move-object v5, v12

    .line 718
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 719
    .line 720
    .line 721
    :cond_21
    :goto_14
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 722
    .line 723
    .line 724
    move-result-object v8

    .line 725
    if-eqz v8, :cond_22

    .line 726
    .line 727
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/j4;

    .line 728
    .line 729
    const/4 v7, 0x0

    .line 730
    move-object/from16 v1, p0

    .line 731
    .line 732
    move/from16 v2, p1

    .line 733
    .line 734
    move-object/from16 v4, p3

    .line 735
    .line 736
    move-object/from16 v5, p4

    .line 737
    .line 738
    move/from16 v6, p6

    .line 739
    .line 740
    move-object v3, v10

    .line 741
    invoke-direct/range {v0 .. v7}, Lcom/zykj/mistake/feature/notebook/detail/j4;-><init>(Ljava/util/List;ZLr6/a;Lr6/c;Lr6/c;II)V

    .line 742
    .line 743
    .line 744
    invoke-interface {v8, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 745
    .line 746
    .line 747
    :cond_22
    return-void
.end method

.method public static final c(Ljava/lang/String;JLr6/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v7, p3

    .line 4
    .line 5
    move-object/from16 v8, p4

    .line 6
    .line 7
    move/from16 v9, p6

    .line 8
    .line 9
    const-string v1, "onClick"

    .line 10
    .line 11
    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const v1, 0x6472062d

    .line 15
    .line 16
    .line 17
    move-object/from16 v2, p5

    .line 18
    .line 19
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    and-int/lit8 v2, v9, 0x6

    .line 24
    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    const/4 v2, 0x4

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 v2, 0x2

    .line 36
    :goto_0
    or-int/2addr v2, v9

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move v2, v9

    .line 39
    :goto_1
    and-int/lit8 v3, v9, 0x30

    .line 40
    .line 41
    move-wide/from16 v10, p1

    .line 42
    .line 43
    if-nez v3, :cond_3

    .line 44
    .line 45
    invoke-interface {v4, v10, v11}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-eqz v3, :cond_2

    .line 50
    .line 51
    const/16 v3, 0x20

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_2
    const/16 v3, 0x10

    .line 55
    .line 56
    :goto_2
    or-int/2addr v2, v3

    .line 57
    :cond_3
    and-int/lit16 v3, v9, 0x180

    .line 58
    .line 59
    if-nez v3, :cond_5

    .line 60
    .line 61
    invoke-interface {v4, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_4

    .line 66
    .line 67
    const/16 v3, 0x100

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_4
    const/16 v3, 0x80

    .line 71
    .line 72
    :goto_3
    or-int/2addr v2, v3

    .line 73
    :cond_5
    and-int/lit16 v3, v9, 0xc00

    .line 74
    .line 75
    if-nez v3, :cond_7

    .line 76
    .line 77
    invoke-interface {v4, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-eqz v3, :cond_6

    .line 82
    .line 83
    const/16 v3, 0x800

    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_6
    const/16 v3, 0x400

    .line 87
    .line 88
    :goto_4
    or-int/2addr v2, v3

    .line 89
    :cond_7
    and-int/lit16 v3, v2, 0x493

    .line 90
    .line 91
    const/16 v5, 0x492

    .line 92
    .line 93
    const/4 v6, 0x1

    .line 94
    const/4 v12, 0x0

    .line 95
    if-eq v3, v5, :cond_8

    .line 96
    .line 97
    move v3, v6

    .line 98
    goto :goto_5

    .line 99
    :cond_8
    move v3, v12

    .line 100
    :goto_5
    and-int/lit8 v5, v2, 0x1

    .line 101
    .line 102
    invoke-interface {v4, v3, v5}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    if-eqz v3, :cond_14

    .line 107
    .line 108
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    if-eqz v3, :cond_9

    .line 113
    .line 114
    const/4 v3, -0x1

    .line 115
    const-string v5, "com.zykj.mistake.feature.notebook.detail.NoteBoardSection (MistakeDetailNotePanel.kt:104)"

    .line 116
    .line 117
    invoke-static {v1, v2, v3, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 118
    .line 119
    .line 120
    :cond_9
    shr-int/lit8 v1, v2, 0x3

    .line 121
    .line 122
    and-int/lit8 v1, v1, 0x70

    .line 123
    .line 124
    or-int/lit16 v1, v1, 0x180

    .line 125
    .line 126
    invoke-static {v7, v4, v1, v6}, Lcom/zykj/mistake/utils/e;->c(Lr6/a;Landroidx/compose/runtime/Composer;II)Lr6/a;

    .line 127
    .line 128
    .line 129
    move-result-object v17

    .line 130
    sget-object v1, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 131
    .line 132
    invoke-virtual {v1}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    sget-object v3, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 137
    .line 138
    invoke-virtual {v3}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    invoke-static {v1, v5, v4, v12}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-static {v4, v12}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 147
    .line 148
    .line 149
    move-result v5

    .line 150
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 151
    .line 152
    .line 153
    move-result-object v13

    .line 154
    invoke-static {v4, v8}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 155
    .line 156
    .line 157
    move-result-object v14

    .line 158
    sget-object v15, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 159
    .line 160
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 161
    .line 162
    .line 163
    move-result-object v6

    .line 164
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 165
    .line 166
    .line 167
    move-result-object v16

    .line 168
    if-nez v16, :cond_a

    .line 169
    .line 170
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 171
    .line 172
    .line 173
    :cond_a
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 174
    .line 175
    .line 176
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 177
    .line 178
    .line 179
    move-result v16

    .line 180
    if-eqz v16, :cond_b

    .line 181
    .line 182
    invoke-interface {v4, v6}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 183
    .line 184
    .line 185
    goto :goto_6

    .line 186
    :cond_b
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 187
    .line 188
    .line 189
    :goto_6
    invoke-static {v4}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 190
    .line 191
    .line 192
    move-result-object v6

    .line 193
    invoke-static {v15, v6, v1, v6, v13}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 198
    .line 199
    .line 200
    move-result v13

    .line 201
    if-nez v13, :cond_c

    .line 202
    .line 203
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v13

    .line 207
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 208
    .line 209
    .line 210
    move-result-object v12

    .line 211
    invoke-static {v13, v12}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v12

    .line 215
    if-nez v12, :cond_d

    .line 216
    .line 217
    :cond_c
    invoke-static {v5, v6, v5, v1}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 218
    .line 219
    .line 220
    :cond_d
    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    invoke-static {v6, v14, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 225
    .line 226
    .line 227
    sget-object v21, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 228
    .line 229
    sget v1, Lcom/zykj/mistake/R$string;->board_note:I

    .line 230
    .line 231
    const/4 v5, 0x0

    .line 232
    invoke-static {v1, v4, v5}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    invoke-static {v1, v4, v5}, Lcom/zykj/mistake/feature/notebook/detail/q4;->h(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    .line 237
    .line 238
    .line 239
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 240
    .line 241
    const/16 v5, 0xc

    .line 242
    .line 243
    int-to-float v6, v5

    .line 244
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 245
    .line 246
    .line 247
    move-result v6

    .line 248
    invoke-static {v1, v6}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 249
    .line 250
    .line 251
    move-result-object v6

    .line 252
    const/4 v12, 0x6

    .line 253
    invoke-static {v6, v4, v12}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 254
    .line 255
    .line 256
    const/4 v6, 0x0

    .line 257
    const/4 v12, 0x0

    .line 258
    const/4 v13, 0x1

    .line 259
    invoke-static {v1, v6, v13, v12}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 260
    .line 261
    .line 262
    move-result-object v22

    .line 263
    const/16 v25, 0x2

    .line 264
    .line 265
    const/16 v26, 0x0

    .line 266
    .line 267
    const/high16 v23, 0x3f800000    # 1.0f

    .line 268
    .line 269
    const/16 v24, 0x0

    .line 270
    .line 271
    invoke-static/range {v21 .. v26}, Landroidx/compose/foundation/layout/ColumnScope;->weight$default(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 272
    .line 273
    .line 274
    move-result-object v13

    .line 275
    sget v14, Lcom/zykj/mistake/feature/notebook/detail/t4;->e:F

    .line 276
    .line 277
    move/from16 v21, v5

    .line 278
    .line 279
    invoke-static {v14}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 280
    .line 281
    .line 282
    move-result-object v5

    .line 283
    invoke-static {v13, v5}, Landroidx/compose/ui/draw/ClipKt;->clip(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 284
    .line 285
    .line 286
    move-result-object v5

    .line 287
    const-string v13, "$this$dashedNoteBorder"

    .line 288
    .line 289
    invoke-static {v5, v13}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    new-instance v13, Lcom/zykj/mistake/feature/notebook/detail/k4;

    .line 293
    .line 294
    invoke-direct {v13, v14}, Lcom/zykj/mistake/feature/notebook/detail/k4;-><init>(F)V

    .line 295
    .line 296
    .line 297
    invoke-static {v5, v13}, Landroidx/compose/ui/draw/DrawModifierKt;->drawBehind(Landroidx/compose/ui/Modifier;Lr6/c;)Landroidx/compose/ui/Modifier;

    .line 298
    .line 299
    .line 300
    move-result-object v13

    .line 301
    const/16 v18, 0x7

    .line 302
    .line 303
    const/16 v19, 0x0

    .line 304
    .line 305
    const/4 v14, 0x0

    .line 306
    move-object v5, v15

    .line 307
    const/4 v15, 0x0

    .line 308
    const/16 v16, 0x0

    .line 309
    .line 310
    invoke-static/range {v13 .. v19}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lr6/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 311
    .line 312
    .line 313
    move-result-object v13

    .line 314
    const/4 v14, 0x1

    .line 315
    int-to-float v15, v14

    .line 316
    invoke-static {v15}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 317
    .line 318
    .line 319
    move-result v14

    .line 320
    invoke-static {v13, v14}, Landroidx/compose/foundation/layout/PaddingKt;->padding-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 321
    .line 322
    .line 323
    move-result-object v13

    .line 324
    invoke-virtual {v3}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 325
    .line 326
    .line 327
    move-result-object v3

    .line 328
    const/4 v14, 0x0

    .line 329
    invoke-static {v3, v14}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 330
    .line 331
    .line 332
    move-result-object v3

    .line 333
    invoke-static {v4, v14}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 334
    .line 335
    .line 336
    move-result v14

    .line 337
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 338
    .line 339
    .line 340
    move-result-object v15

    .line 341
    invoke-static {v4, v13}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 342
    .line 343
    .line 344
    move-result-object v13

    .line 345
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 346
    .line 347
    .line 348
    move-result-object v6

    .line 349
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 350
    .line 351
    .line 352
    move-result-object v17

    .line 353
    if-nez v17, :cond_e

    .line 354
    .line 355
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 356
    .line 357
    .line 358
    :cond_e
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 359
    .line 360
    .line 361
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 362
    .line 363
    .line 364
    move-result v17

    .line 365
    if-eqz v17, :cond_f

    .line 366
    .line 367
    invoke-interface {v4, v6}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 368
    .line 369
    .line 370
    goto :goto_7

    .line 371
    :cond_f
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 372
    .line 373
    .line 374
    :goto_7
    invoke-static {v4}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 375
    .line 376
    .line 377
    move-result-object v6

    .line 378
    invoke-static {v5, v6, v3, v6, v15}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 379
    .line 380
    .line 381
    move-result-object v3

    .line 382
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 383
    .line 384
    .line 385
    move-result v15

    .line 386
    if-nez v15, :cond_10

    .line 387
    .line 388
    invoke-interface {v6}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v15

    .line 392
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 393
    .line 394
    .line 395
    move-result-object v12

    .line 396
    invoke-static {v15, v12}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 397
    .line 398
    .line 399
    move-result v12

    .line 400
    if-nez v12, :cond_11

    .line 401
    .line 402
    :cond_10
    invoke-static {v14, v6, v14, v3}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 403
    .line 404
    .line 405
    :cond_11
    invoke-virtual {v5}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 406
    .line 407
    .line 408
    move-result-object v3

    .line 409
    invoke-static {v6, v13, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 410
    .line 411
    .line 412
    sget-object v3, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 413
    .line 414
    if-eqz v0, :cond_13

    .line 415
    .line 416
    invoke-static {v0}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 417
    .line 418
    .line 419
    move-result v3

    .line 420
    if-eqz v3, :cond_12

    .line 421
    .line 422
    goto :goto_8

    .line 423
    :cond_12
    const v3, 0x16859153

    .line 424
    .line 425
    .line 426
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 427
    .line 428
    .line 429
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 430
    .line 431
    .line 432
    move-result-object v3

    .line 433
    invoke-interface {v4, v0, v3}, Landroidx/compose/runtime/Composer;->joinKey(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v3

    .line 437
    const v5, 0x42ca82af

    .line 438
    .line 439
    .line 440
    invoke-interface {v4, v5, v3}, Landroidx/compose/runtime/Composer;->startMovableGroup(ILjava/lang/Object;)V

    .line 441
    .line 442
    .line 443
    const/4 v3, 0x0

    .line 444
    const/4 v5, 0x0

    .line 445
    const/4 v13, 0x1

    .line 446
    invoke-static {v1, v5, v13, v3}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 447
    .line 448
    .line 449
    move-result-object v1

    .line 450
    move v3, v2

    .line 451
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 452
    .line 453
    .line 454
    move-result-object v2

    .line 455
    and-int/lit8 v5, v3, 0xe

    .line 456
    .line 457
    or-int/lit16 v5, v5, 0xc30

    .line 458
    .line 459
    shl-int/lit8 v3, v3, 0x3

    .line 460
    .line 461
    and-int/lit16 v3, v3, 0x380

    .line 462
    .line 463
    or-int/2addr v5, v3

    .line 464
    const/4 v6, 0x0

    .line 465
    const/4 v3, 0x1

    .line 466
    invoke-static/range {v0 .. v6}, Lcom/zykj/mistake/feature/notebook/detail/q4;->e(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/Object;ZLandroidx/compose/runtime/Composer;II)V

    .line 467
    .line 468
    .line 469
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endMovableGroup()V

    .line 470
    .line 471
    .line 472
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 473
    .line 474
    .line 475
    goto :goto_9

    .line 476
    :cond_13
    :goto_8
    const v0, 0x168adfff

    .line 477
    .line 478
    .line 479
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 480
    .line 481
    .line 482
    const-wide v0, 0xffccccccL

    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 488
    .line 489
    .line 490
    move-result-wide v12

    .line 491
    invoke-static/range {v21 .. v21}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 492
    .line 493
    .line 494
    move-result-wide v14

    .line 495
    const/16 v33, 0x0

    .line 496
    .line 497
    const v34, 0x1fff2

    .line 498
    .line 499
    .line 500
    const-string v10, "\u70b9\u51fb\u6dfb\u52a0\u753b\u677f\u7b14\u8bb0"

    .line 501
    .line 502
    const/4 v11, 0x0

    .line 503
    const/16 v16, 0x0

    .line 504
    .line 505
    const/16 v17, 0x0

    .line 506
    .line 507
    const/16 v18, 0x0

    .line 508
    .line 509
    const-wide/16 v19, 0x0

    .line 510
    .line 511
    const/16 v21, 0x0

    .line 512
    .line 513
    const/16 v22, 0x0

    .line 514
    .line 515
    const-wide/16 v23, 0x0

    .line 516
    .line 517
    const/16 v25, 0x0

    .line 518
    .line 519
    const/16 v26, 0x0

    .line 520
    .line 521
    const/16 v27, 0x0

    .line 522
    .line 523
    const/16 v28, 0x0

    .line 524
    .line 525
    const/16 v29, 0x0

    .line 526
    .line 527
    const/16 v30, 0x0

    .line 528
    .line 529
    const/16 v32, 0xd86

    .line 530
    .line 531
    move-object/from16 v31, v4

    .line 532
    .line 533
    invoke-static/range {v10 .. v34}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 534
    .line 535
    .line 536
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 537
    .line 538
    .line 539
    :goto_9
    invoke-static {v4}, Landroidx/collection/a;->D(Landroidx/compose/runtime/Composer;)Z

    .line 540
    .line 541
    .line 542
    move-result v0

    .line 543
    if-eqz v0, :cond_15

    .line 544
    .line 545
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 546
    .line 547
    .line 548
    goto :goto_a

    .line 549
    :cond_14
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 550
    .line 551
    .line 552
    :cond_15
    :goto_a
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 553
    .line 554
    .line 555
    move-result-object v10

    .line 556
    if-eqz v10, :cond_16

    .line 557
    .line 558
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/n4;

    .line 559
    .line 560
    move-object/from16 v1, p0

    .line 561
    .line 562
    move-wide/from16 v2, p1

    .line 563
    .line 564
    move-object v4, v7

    .line 565
    move-object v5, v8

    .line 566
    move v6, v9

    .line 567
    invoke-direct/range {v0 .. v6}, Lcom/zykj/mistake/feature/notebook/detail/n4;-><init>(Ljava/lang/String;JLr6/a;Landroidx/compose/ui/Modifier;I)V

    .line 568
    .line 569
    .line 570
    invoke-interface {v10, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 571
    .line 572
    .line 573
    :cond_16
    return-void
.end method

.method public static final d(Lcom/zykj/mistake/feature/notebook/detail/k3;Lr6/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move/from16 v4, p4

    .line 6
    .line 7
    const v0, 0x5f54a37c

    .line 8
    .line 9
    .line 10
    move-object/from16 v3, p3

    .line 11
    .line 12
    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v10

    .line 16
    and-int/lit8 v3, v4, 0x6

    .line 17
    .line 18
    if-nez v3, :cond_1

    .line 19
    .line 20
    invoke-interface {v10, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    const/4 v3, 0x4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v3, 0x2

    .line 29
    :goto_0
    or-int/2addr v3, v4

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move v3, v4

    .line 32
    :goto_1
    and-int/lit8 v5, v4, 0x30

    .line 33
    .line 34
    const/16 v6, 0x10

    .line 35
    .line 36
    if-nez v5, :cond_3

    .line 37
    .line 38
    invoke-interface {v10, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-eqz v5, :cond_2

    .line 43
    .line 44
    const/16 v5, 0x20

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    move v5, v6

    .line 48
    :goto_2
    or-int/2addr v3, v5

    .line 49
    :cond_3
    and-int/lit16 v5, v4, 0x180

    .line 50
    .line 51
    move-object/from16 v13, p2

    .line 52
    .line 53
    if-nez v5, :cond_5

    .line 54
    .line 55
    invoke-interface {v10, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    if-eqz v5, :cond_4

    .line 60
    .line 61
    const/16 v5, 0x100

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_4
    const/16 v5, 0x80

    .line 65
    .line 66
    :goto_3
    or-int/2addr v3, v5

    .line 67
    :cond_5
    and-int/lit16 v5, v3, 0x93

    .line 68
    .line 69
    const/16 v7, 0x92

    .line 70
    .line 71
    const/4 v8, 0x1

    .line 72
    const/4 v9, 0x0

    .line 73
    if-eq v5, v7, :cond_6

    .line 74
    .line 75
    move v5, v8

    .line 76
    goto :goto_4

    .line 77
    :cond_6
    move v5, v9

    .line 78
    :goto_4
    and-int/lit8 v7, v3, 0x1

    .line 79
    .line 80
    invoke-interface {v10, v5, v7}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    if-eqz v5, :cond_1d

    .line 85
    .line 86
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    if-eqz v5, :cond_7

    .line 91
    .line 92
    const/4 v5, -0x1

    .line 93
    const-string v7, "com.zykj.mistake.feature.notebook.detail.NoteContent (MistakeDetailNotePanel.kt:68)"

    .line 94
    .line 95
    invoke-static {v0, v3, v5, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 96
    .line 97
    .line 98
    :cond_7
    const-wide v14, 0xfff5f7faL

    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    invoke-static {v14, v15}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 104
    .line 105
    .line 106
    move-result-wide v14

    .line 107
    const/16 v17, 0x2

    .line 108
    .line 109
    const/16 v18, 0x0

    .line 110
    .line 111
    const/16 v16, 0x0

    .line 112
    .line 113
    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    int-to-float v5, v6

    .line 118
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    invoke-static {v0, v5}, Landroidx/compose/foundation/layout/PaddingKt;->padding-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    sget-object v5, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 127
    .line 128
    invoke-virtual {v5}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 129
    .line 130
    .line 131
    move-result-object v6

    .line 132
    sget-object v7, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 133
    .line 134
    invoke-virtual {v7}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 135
    .line 136
    .line 137
    move-result-object v11

    .line 138
    invoke-static {v6, v11, v10, v9}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    invoke-static {v10, v9}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 143
    .line 144
    .line 145
    move-result v11

    .line 146
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 147
    .line 148
    .line 149
    move-result-object v13

    .line 150
    invoke-static {v10, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    sget-object v14, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 155
    .line 156
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 157
    .line 158
    .line 159
    move-result-object v15

    .line 160
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 161
    .line 162
    .line 163
    move-result-object v16

    .line 164
    if-nez v16, :cond_8

    .line 165
    .line 166
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 167
    .line 168
    .line 169
    :cond_8
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 170
    .line 171
    .line 172
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 173
    .line 174
    .line 175
    move-result v16

    .line 176
    if-eqz v16, :cond_9

    .line 177
    .line 178
    invoke-interface {v10, v15}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 179
    .line 180
    .line 181
    goto :goto_5

    .line 182
    :cond_9
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 183
    .line 184
    .line 185
    :goto_5
    invoke-static {v10}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 186
    .line 187
    .line 188
    move-result-object v15

    .line 189
    invoke-static {v14, v15, v6, v15, v13}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 190
    .line 191
    .line 192
    move-result-object v6

    .line 193
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 194
    .line 195
    .line 196
    move-result v13

    .line 197
    if-nez v13, :cond_a

    .line 198
    .line 199
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v13

    .line 203
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 204
    .line 205
    .line 206
    move-result-object v12

    .line 207
    invoke-static {v13, v12}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v12

    .line 211
    if-nez v12, :cond_b

    .line 212
    .line 213
    :cond_a
    invoke-static {v11, v15, v11, v6}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 214
    .line 215
    .line 216
    :cond_b
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 217
    .line 218
    .line 219
    move-result-object v6

    .line 220
    invoke-static {v15, v0, v6}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 221
    .line 222
    .line 223
    sget-object v16, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 224
    .line 225
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 226
    .line 227
    const/4 v6, 0x0

    .line 228
    const/4 v11, 0x0

    .line 229
    invoke-static {v0, v6, v8, v11}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 230
    .line 231
    .line 232
    move-result-object v6

    .line 233
    sget-object v11, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 234
    .line 235
    invoke-virtual {v11}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 236
    .line 237
    .line 238
    move-result-wide v11

    .line 239
    const/4 v13, 0x6

    .line 240
    int-to-float v15, v13

    .line 241
    invoke-static {v15, v6, v11, v12}, Landroidx/compose/material3/c;->f(FLandroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;

    .line 242
    .line 243
    .line 244
    move-result-object v6

    .line 245
    const/16 v11, 0x16

    .line 246
    .line 247
    int-to-float v12, v11

    .line 248
    invoke-static {v12}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 249
    .line 250
    .line 251
    move-result v11

    .line 252
    invoke-static {v12}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 253
    .line 254
    .line 255
    move-result v15

    .line 256
    invoke-static {v6, v11, v15}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 257
    .line 258
    .line 259
    move-result-object v6

    .line 260
    invoke-virtual {v5}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 261
    .line 262
    .line 263
    move-result-object v5

    .line 264
    invoke-virtual {v7}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 265
    .line 266
    .line 267
    move-result-object v7

    .line 268
    invoke-static {v5, v7, v10, v9}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 269
    .line 270
    .line 271
    move-result-object v5

    .line 272
    invoke-static {v10, v9}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 273
    .line 274
    .line 275
    move-result v7

    .line 276
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 277
    .line 278
    .line 279
    move-result-object v11

    .line 280
    invoke-static {v10, v6}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 281
    .line 282
    .line 283
    move-result-object v6

    .line 284
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 285
    .line 286
    .line 287
    move-result-object v15

    .line 288
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 289
    .line 290
    .line 291
    move-result-object v17

    .line 292
    if-nez v17, :cond_c

    .line 293
    .line 294
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 295
    .line 296
    .line 297
    :cond_c
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 298
    .line 299
    .line 300
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 301
    .line 302
    .line 303
    move-result v17

    .line 304
    if-eqz v17, :cond_d

    .line 305
    .line 306
    invoke-interface {v10, v15}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 307
    .line 308
    .line 309
    goto :goto_6

    .line 310
    :cond_d
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 311
    .line 312
    .line 313
    :goto_6
    invoke-static {v10}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 314
    .line 315
    .line 316
    move-result-object v15

    .line 317
    invoke-static {v14, v15, v5, v15, v11}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 318
    .line 319
    .line 320
    move-result-object v5

    .line 321
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 322
    .line 323
    .line 324
    move-result v11

    .line 325
    if-nez v11, :cond_e

    .line 326
    .line 327
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v11

    .line 331
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 332
    .line 333
    .line 334
    move-result-object v8

    .line 335
    invoke-static {v11, v8}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 336
    .line 337
    .line 338
    move-result v8

    .line 339
    if-nez v8, :cond_f

    .line 340
    .line 341
    :cond_e
    invoke-static {v7, v15, v7, v5}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 342
    .line 343
    .line 344
    :cond_f
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 345
    .line 346
    .line 347
    move-result-object v5

    .line 348
    invoke-static {v15, v6, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 349
    .line 350
    .line 351
    iget-object v5, v1, Lcom/zykj/mistake/feature/notebook/detail/k3;->c:Ljava/lang/String;

    .line 352
    .line 353
    iget-wide v6, v1, Lcom/zykj/mistake/feature/notebook/detail/k3;->d:J

    .line 354
    .line 355
    and-int/lit8 v3, v3, 0x70

    .line 356
    .line 357
    const/16 v8, 0x20

    .line 358
    .line 359
    if-ne v3, v8, :cond_10

    .line 360
    .line 361
    const/4 v8, 0x1

    .line 362
    goto :goto_7

    .line 363
    :cond_10
    move v8, v9

    .line 364
    :goto_7
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v11

    .line 368
    if-nez v8, :cond_11

    .line 369
    .line 370
    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 371
    .line 372
    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v8

    .line 376
    if-ne v11, v8, :cond_12

    .line 377
    .line 378
    :cond_11
    new-instance v11, Lcom/zykj/mistake/feature/notebook/detail/s3;

    .line 379
    .line 380
    const/16 v8, 0xf

    .line 381
    .line 382
    invoke-direct {v11, v2, v8}, Lcom/zykj/mistake/feature/notebook/detail/s3;-><init>(Lr6/c;I)V

    .line 383
    .line 384
    .line 385
    invoke-interface {v10, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 386
    .line 387
    .line 388
    :cond_12
    move-object v8, v11

    .line 389
    check-cast v8, Lr6/a;

    .line 390
    .line 391
    const/16 v20, 0x2

    .line 392
    .line 393
    const/16 v21, 0x0

    .line 394
    .line 395
    const/high16 v18, 0x3f800000    # 1.0f

    .line 396
    .line 397
    const/16 v19, 0x0

    .line 398
    .line 399
    move-object/from16 v17, v0

    .line 400
    .line 401
    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/ColumnScope;->weight$default(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    move-object/from16 v14, v17

    .line 406
    .line 407
    const/4 v11, 0x0

    .line 408
    move/from16 v22, v9

    .line 409
    .line 410
    move-object v9, v0

    .line 411
    move/from16 v0, v22

    .line 412
    .line 413
    const/16 v22, 0x1

    .line 414
    .line 415
    invoke-static/range {v5 .. v11}, Lcom/zykj/mistake/feature/notebook/detail/q4;->c(Ljava/lang/String;JLr6/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 416
    .line 417
    .line 418
    invoke-static {v12}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 419
    .line 420
    .line 421
    move-result v5

    .line 422
    invoke-static {v14, v5}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 423
    .line 424
    .line 425
    move-result-object v5

    .line 426
    invoke-static {v5, v10, v13}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 427
    .line 428
    .line 429
    iget-object v5, v1, Lcom/zykj/mistake/feature/notebook/detail/k3;->e:Ljava/util/List;

    .line 430
    .line 431
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 432
    .line 433
    .line 434
    move-result v6

    .line 435
    iget v7, v1, Lcom/zykj/mistake/feature/notebook/detail/k3;->g:I

    .line 436
    .line 437
    if-ge v6, v7, :cond_13

    .line 438
    .line 439
    move/from16 v6, v22

    .line 440
    .line 441
    :goto_8
    const/16 v8, 0x20

    .line 442
    .line 443
    goto :goto_9

    .line 444
    :cond_13
    move v6, v0

    .line 445
    goto :goto_8

    .line 446
    :goto_9
    if-ne v3, v8, :cond_14

    .line 447
    .line 448
    move/from16 v8, v22

    .line 449
    .line 450
    goto :goto_a

    .line 451
    :cond_14
    move v8, v0

    .line 452
    :goto_a
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v7

    .line 456
    if-nez v8, :cond_15

    .line 457
    .line 458
    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 459
    .line 460
    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v8

    .line 464
    if-ne v7, v8, :cond_16

    .line 465
    .line 466
    :cond_15
    new-instance v7, Lcom/zykj/mistake/feature/notebook/detail/s3;

    .line 467
    .line 468
    const/16 v8, 0x10

    .line 469
    .line 470
    invoke-direct {v7, v2, v8}, Lcom/zykj/mistake/feature/notebook/detail/s3;-><init>(Lr6/c;I)V

    .line 471
    .line 472
    .line 473
    invoke-interface {v10, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 474
    .line 475
    .line 476
    :cond_16
    check-cast v7, Lr6/a;

    .line 477
    .line 478
    const/16 v8, 0x20

    .line 479
    .line 480
    if-ne v3, v8, :cond_17

    .line 481
    .line 482
    move/from16 v8, v22

    .line 483
    .line 484
    goto :goto_b

    .line 485
    :cond_17
    move v8, v0

    .line 486
    :goto_b
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v9

    .line 490
    if-nez v8, :cond_18

    .line 491
    .line 492
    sget-object v8, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 493
    .line 494
    invoke-virtual {v8}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v8

    .line 498
    if-ne v9, v8, :cond_19

    .line 499
    .line 500
    :cond_18
    new-instance v9, Lcom/zykj/mistake/feature/notebook/detail/m4;

    .line 501
    .line 502
    const/4 v8, 0x0

    .line 503
    invoke-direct {v9, v2, v8}, Lcom/zykj/mistake/feature/notebook/detail/m4;-><init>(Lr6/c;I)V

    .line 504
    .line 505
    .line 506
    invoke-interface {v10, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 507
    .line 508
    .line 509
    :cond_19
    move-object v8, v9

    .line 510
    check-cast v8, Lr6/c;

    .line 511
    .line 512
    const/16 v9, 0x20

    .line 513
    .line 514
    if-ne v3, v9, :cond_1a

    .line 515
    .line 516
    move/from16 v0, v22

    .line 517
    .line 518
    :cond_1a
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object v3

    .line 522
    if-nez v0, :cond_1b

    .line 523
    .line 524
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 525
    .line 526
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    move-result-object v0

    .line 530
    if-ne v3, v0, :cond_1c

    .line 531
    .line 532
    :cond_1b
    new-instance v3, Lcom/zykj/mistake/feature/notebook/detail/m4;

    .line 533
    .line 534
    const/4 v0, 0x1

    .line 535
    invoke-direct {v3, v2, v0}, Lcom/zykj/mistake/feature/notebook/detail/m4;-><init>(Lr6/c;I)V

    .line 536
    .line 537
    .line 538
    invoke-interface {v10, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 539
    .line 540
    .line 541
    :cond_1c
    move-object v9, v3

    .line 542
    check-cast v9, Lr6/c;

    .line 543
    .line 544
    const/4 v11, 0x0

    .line 545
    invoke-static/range {v5 .. v11}, Lcom/zykj/mistake/feature/notebook/detail/q4;->g(Ljava/util/List;ZLr6/a;Lr6/c;Lr6/c;Landroidx/compose/runtime/Composer;I)V

    .line 546
    .line 547
    .line 548
    invoke-static {v10}, Landroidx/collection/a;->D(Landroidx/compose/runtime/Composer;)Z

    .line 549
    .line 550
    .line 551
    move-result v0

    .line 552
    if-eqz v0, :cond_1e

    .line 553
    .line 554
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 555
    .line 556
    .line 557
    goto :goto_c

    .line 558
    :cond_1d
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 559
    .line 560
    .line 561
    :cond_1e
    :goto_c
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 562
    .line 563
    .line 564
    move-result-object v6

    .line 565
    if-eqz v6, :cond_1f

    .line 566
    .line 567
    new-instance v0, Landroidx/lifecycle/compose/g;

    .line 568
    .line 569
    const/16 v5, 0xc

    .line 570
    .line 571
    move-object/from16 v3, p2

    .line 572
    .line 573
    invoke-direct/range {v0 .. v5}, Landroidx/lifecycle/compose/g;-><init>(Ljava/lang/Object;Lr6/c;Ljava/lang/Object;II)V

    .line 574
    .line 575
    .line 576
    invoke-interface {v6, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 577
    .line 578
    .line 579
    :cond_1f
    return-void
.end method

.method public static final e(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/Object;ZLandroidx/compose/runtime/Composer;II)V
    .locals 13

    .line 1
    move/from16 v5, p5

    .line 2
    .line 3
    const-string v0, "imageUrl"

    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const v0, -0x70730b6b

    .line 9
    .line 10
    .line 11
    move-object/from16 v1, p4

    .line 12
    .line 13
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 14
    .line 15
    .line 16
    move-result-object v11

    .line 17
    and-int/lit8 v1, v5, 0x6

    .line 18
    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    invoke-interface {v11, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    const/4 v1, 0x4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v1, 0x2

    .line 30
    :goto_0
    or-int/2addr v1, v5

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v1, v5

    .line 33
    :goto_1
    and-int/lit8 v2, v5, 0x30

    .line 34
    .line 35
    if-nez v2, :cond_3

    .line 36
    .line 37
    invoke-interface {v11, p1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    const/16 v2, 0x20

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    const/16 v2, 0x10

    .line 47
    .line 48
    :goto_2
    or-int/2addr v1, v2

    .line 49
    :cond_3
    and-int/lit8 v2, p6, 0x4

    .line 50
    .line 51
    if-eqz v2, :cond_4

    .line 52
    .line 53
    or-int/lit16 v1, v1, 0x180

    .line 54
    .line 55
    goto :goto_4

    .line 56
    :cond_4
    and-int/lit16 v3, v5, 0x180

    .line 57
    .line 58
    if-nez v3, :cond_6

    .line 59
    .line 60
    invoke-interface {v11, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-eqz v3, :cond_5

    .line 65
    .line 66
    const/16 v3, 0x100

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_5
    const/16 v3, 0x80

    .line 70
    .line 71
    :goto_3
    or-int/2addr v1, v3

    .line 72
    :cond_6
    :goto_4
    and-int/lit8 v3, p6, 0x8

    .line 73
    .line 74
    if-eqz v3, :cond_8

    .line 75
    .line 76
    or-int/lit16 v1, v1, 0xc00

    .line 77
    .line 78
    :cond_7
    move/from16 v4, p3

    .line 79
    .line 80
    goto :goto_6

    .line 81
    :cond_8
    and-int/lit16 v4, v5, 0xc00

    .line 82
    .line 83
    if-nez v4, :cond_7

    .line 84
    .line 85
    move/from16 v4, p3

    .line 86
    .line 87
    invoke-interface {v11, v4}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    if-eqz v6, :cond_9

    .line 92
    .line 93
    const/16 v6, 0x800

    .line 94
    .line 95
    goto :goto_5

    .line 96
    :cond_9
    const/16 v6, 0x400

    .line 97
    .line 98
    :goto_5
    or-int/2addr v1, v6

    .line 99
    :goto_6
    and-int/lit16 v6, v1, 0x493

    .line 100
    .line 101
    const/16 v7, 0x492

    .line 102
    .line 103
    const/4 v8, 0x0

    .line 104
    if-eq v6, v7, :cond_a

    .line 105
    .line 106
    const/4 v6, 0x1

    .line 107
    goto :goto_7

    .line 108
    :cond_a
    move v6, v8

    .line 109
    :goto_7
    and-int/lit8 v7, v1, 0x1

    .line 110
    .line 111
    invoke-interface {v11, v6, v7}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 112
    .line 113
    .line 114
    move-result v6

    .line 115
    if-eqz v6, :cond_14

    .line 116
    .line 117
    if-eqz v2, :cond_b

    .line 118
    .line 119
    const/4 p2, 0x0

    .line 120
    :cond_b
    if-eqz v3, :cond_c

    .line 121
    .line 122
    move v4, v8

    .line 123
    :cond_c
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    const/4 v3, -0x1

    .line 128
    if-eqz v2, :cond_d

    .line 129
    .line 130
    const-string v2, "com.zykj.mistake.feature.notebook.detail.NoteImage (MistakeDetailNotePanel.kt:368)"

    .line 131
    .line 132
    invoke-static {v0, v1, v3, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 133
    .line 134
    .line 135
    :cond_d
    if-eqz v4, :cond_12

    .line 136
    .line 137
    const v0, -0x1fddc37a

    .line 138
    .line 139
    .line 140
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 141
    .line 142
    .line 143
    and-int/lit8 v0, v1, 0xe

    .line 144
    .line 145
    shr-int/lit8 v2, v1, 0x3

    .line 146
    .line 147
    and-int/lit8 v2, v2, 0x70

    .line 148
    .line 149
    or-int/2addr v0, v2

    .line 150
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    if-eqz v2, :cond_e

    .line 155
    .line 156
    const v2, 0x76c85ab8

    .line 157
    .line 158
    .line 159
    const-string v6, "com.zykj.mistake.utils.rememberNoCacheImageRequest (CoilImageRequests.kt:25)"

    .line 160
    .line 161
    invoke-static {v2, v0, v3, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 162
    .line 163
    .line 164
    :cond_e
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalContext()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    check-cast v0, Landroid/content/Context;

    .line 173
    .line 174
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    invoke-interface {v11, p0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v3

    .line 182
    or-int/2addr v2, v3

    .line 183
    invoke-interface {v11, p2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    or-int/2addr v2, v3

    .line 188
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    if-nez v2, :cond_f

    .line 193
    .line 194
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 195
    .line 196
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    if-ne v3, v2, :cond_10

    .line 201
    .line 202
    :cond_f
    const-string v2, "context"

    .line 203
    .line 204
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    new-instance v2, Ls/c;

    .line 208
    .line 209
    invoke-direct {v2, v0}, Ls/c;-><init>(Landroid/content/Context;)V

    .line 210
    .line 211
    .line 212
    iput-object p0, v2, Ls/c;->c:Ljava/lang/Object;

    .line 213
    .line 214
    sget-object v0, Lcoil3/request/CachePolicy;->DISABLED:Lcoil3/request/CachePolicy;

    .line 215
    .line 216
    iput-object v0, v2, Ls/c;->i:Lcoil3/request/CachePolicy;

    .line 217
    .line 218
    iput-object v0, v2, Ls/c;->j:Lcoil3/request/CachePolicy;

    .line 219
    .line 220
    invoke-virtual {v2}, Ls/c;->a()Ls/f;

    .line 221
    .line 222
    .line 223
    move-result-object v3

    .line 224
    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    :cond_10
    check-cast v3, Ls/f;

    .line 228
    .line 229
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 230
    .line 231
    .line 232
    move-result v0

    .line 233
    if-eqz v0, :cond_11

    .line 234
    .line 235
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 236
    .line 237
    .line 238
    :cond_11
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 239
    .line 240
    .line 241
    move-object v6, v3

    .line 242
    goto :goto_8

    .line 243
    :cond_12
    const v0, -0x1fddbcc3

    .line 244
    .line 245
    .line 246
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 247
    .line 248
    .line 249
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 250
    .line 251
    .line 252
    move-object v6, p0

    .line 253
    :goto_8
    sget-object v0, Lcom/zykj/mistake/utils/e;->a:Lcom/zykj/mistake/utils/e;

    .line 254
    .line 255
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalContext()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    check-cast v2, Landroid/content/Context;

    .line 264
    .line 265
    invoke-virtual {v0, v2}, Lcom/zykj/mistake/utils/e;->a(Landroid/content/Context;)Lcoil3/n;

    .line 266
    .line 267
    .line 268
    move-result-object v7

    .line 269
    sget-object v0, Landroidx/compose/ui/layout/ContentScale;->Companion:Landroidx/compose/ui/layout/ContentScale$Companion;

    .line 270
    .line 271
    invoke-virtual {v0}, Landroidx/compose/ui/layout/ContentScale$Companion;->getCrop()Landroidx/compose/ui/layout/ContentScale;

    .line 272
    .line 273
    .line 274
    move-result-object v10

    .line 275
    sget v0, Lcom/zykj/mistake/R$mipmap;->pic_error:I

    .line 276
    .line 277
    invoke-static {v0, v11, v8}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 278
    .line 279
    .line 280
    move-result-object v9

    .line 281
    shl-int/lit8 v0, v1, 0x6

    .line 282
    .line 283
    and-int/lit16 v0, v0, 0x1c00

    .line 284
    .line 285
    or-int/lit8 v12, v0, 0x30

    .line 286
    .line 287
    move-object v8, p1

    .line 288
    invoke-static/range {v6 .. v12}, Lcoil3/compose/b;->b(Ljava/lang/Object;Lcoil3/n;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/layout/ContentScale;Landroidx/compose/runtime/Composer;I)V

    .line 289
    .line 290
    .line 291
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 292
    .line 293
    .line 294
    move-result v0

    .line 295
    if-eqz v0, :cond_13

    .line 296
    .line 297
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 298
    .line 299
    .line 300
    :cond_13
    :goto_9
    move-object v3, p2

    .line 301
    goto :goto_a

    .line 302
    :cond_14
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 303
    .line 304
    .line 305
    goto :goto_9

    .line 306
    :goto_a
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 307
    .line 308
    .line 309
    move-result-object p2

    .line 310
    if-eqz p2, :cond_15

    .line 311
    .line 312
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/u3;

    .line 313
    .line 314
    move-object v1, p0

    .line 315
    move-object v2, p1

    .line 316
    move/from16 v6, p6

    .line 317
    .line 318
    invoke-direct/range {v0 .. v6}, Lcom/zykj/mistake/feature/notebook/detail/u3;-><init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/Object;ZII)V

    .line 319
    .line 320
    .line 321
    invoke-interface {p2, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 322
    .line 323
    .line 324
    :cond_15
    return-void
.end method

.method public static final f(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    move-object/from16 v8, p2

    .line 6
    .line 7
    move-object/from16 v9, p3

    .line 8
    .line 9
    move/from16 v10, p5

    .line 10
    .line 11
    const-string v1, "url"

    .line 12
    .line 13
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const v1, 0x3103b65b

    .line 17
    .line 18
    .line 19
    move-object/from16 v2, p4

    .line 20
    .line 21
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    and-int/lit8 v2, v10, 0x6

    .line 26
    .line 27
    if-nez v2, :cond_1

    .line 28
    .line 29
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    const/4 v2, 0x4

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 v2, 0x2

    .line 38
    :goto_0
    or-int/2addr v2, v10

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move v2, v10

    .line 41
    :goto_1
    and-int/lit8 v3, v10, 0x30

    .line 42
    .line 43
    if-nez v3, :cond_3

    .line 44
    .line 45
    invoke-interface {v4, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-eqz v3, :cond_2

    .line 50
    .line 51
    const/16 v3, 0x20

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_2
    const/16 v3, 0x10

    .line 55
    .line 56
    :goto_2
    or-int/2addr v2, v3

    .line 57
    :cond_3
    and-int/lit16 v3, v10, 0x180

    .line 58
    .line 59
    if-nez v3, :cond_5

    .line 60
    .line 61
    invoke-interface {v4, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_4

    .line 66
    .line 67
    const/16 v3, 0x100

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_4
    const/16 v3, 0x80

    .line 71
    .line 72
    :goto_3
    or-int/2addr v2, v3

    .line 73
    :cond_5
    and-int/lit16 v3, v10, 0xc00

    .line 74
    .line 75
    if-nez v3, :cond_7

    .line 76
    .line 77
    invoke-interface {v4, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-eqz v3, :cond_6

    .line 82
    .line 83
    const/16 v3, 0x800

    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_6
    const/16 v3, 0x400

    .line 87
    .line 88
    :goto_4
    or-int/2addr v2, v3

    .line 89
    :cond_7
    and-int/lit16 v3, v2, 0x493

    .line 90
    .line 91
    const/16 v5, 0x492

    .line 92
    .line 93
    const/4 v11, 0x0

    .line 94
    const/4 v12, 0x1

    .line 95
    if-eq v3, v5, :cond_8

    .line 96
    .line 97
    move v3, v12

    .line 98
    goto :goto_5

    .line 99
    :cond_8
    move v3, v11

    .line 100
    :goto_5
    and-int/lit8 v5, v2, 0x1

    .line 101
    .line 102
    invoke-interface {v4, v3, v5}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    if-eqz v3, :cond_12

    .line 107
    .line 108
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    if-eqz v3, :cond_9

    .line 113
    .line 114
    const/4 v3, -0x1

    .line 115
    const-string v5, "com.zykj.mistake.feature.notebook.detail.NotePictureItem (MistakeDetailNotePanel.kt:326)"

    .line 116
    .line 117
    invoke-static {v1, v2, v3, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 118
    .line 119
    .line 120
    :cond_9
    sget v1, Lcom/zykj/mistake/feature/notebook/detail/t4;->f:F

    .line 121
    .line 122
    invoke-static {v7, v1}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    sget-object v3, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 127
    .line 128
    invoke-virtual {v3}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    invoke-static {v5, v11}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    invoke-static {v4, v11}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 137
    .line 138
    .line 139
    move-result v6

    .line 140
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 141
    .line 142
    .line 143
    move-result-object v13

    .line 144
    invoke-static {v4, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    sget-object v14, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 149
    .line 150
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 151
    .line 152
    .line 153
    move-result-object v15

    .line 154
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 155
    .line 156
    .line 157
    move-result-object v16

    .line 158
    if-nez v16, :cond_a

    .line 159
    .line 160
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 161
    .line 162
    .line 163
    :cond_a
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 164
    .line 165
    .line 166
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 167
    .line 168
    .line 169
    move-result v16

    .line 170
    if-eqz v16, :cond_b

    .line 171
    .line 172
    invoke-interface {v4, v15}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 173
    .line 174
    .line 175
    goto :goto_6

    .line 176
    :cond_b
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 177
    .line 178
    .line 179
    :goto_6
    invoke-static {v4}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 180
    .line 181
    .line 182
    move-result-object v15

    .line 183
    invoke-static {v14, v15, v5, v15, v13}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 184
    .line 185
    .line 186
    move-result-object v5

    .line 187
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 188
    .line 189
    .line 190
    move-result v13

    .line 191
    if-nez v13, :cond_c

    .line 192
    .line 193
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v13

    .line 197
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 198
    .line 199
    .line 200
    move-result-object v11

    .line 201
    invoke-static {v13, v11}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v11

    .line 205
    if-nez v11, :cond_d

    .line 206
    .line 207
    :cond_c
    invoke-static {v6, v15, v6, v5}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 208
    .line 209
    .line 210
    :cond_d
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 211
    .line 212
    .line 213
    move-result-object v5

    .line 214
    invoke-static {v15, v1, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 215
    .line 216
    .line 217
    sget-object v1, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 218
    .line 219
    const/4 v11, 0x0

    .line 220
    const/4 v13, 0x0

    .line 221
    invoke-static {v8, v11, v12, v13}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    sget v5, Lcom/zykj/mistake/feature/notebook/detail/t4;->e:F

    .line 226
    .line 227
    invoke-static {v5}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 228
    .line 229
    .line 230
    move-result-object v6

    .line 231
    invoke-static {v1, v6}, Landroidx/compose/ui/draw/ClipKt;->clip(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 232
    .line 233
    .line 234
    move-result-object v15

    .line 235
    const-wide v16, 0xfff4f6f8L

    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    invoke-static/range {v16 .. v17}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 241
    .line 242
    .line 243
    move-result-wide v16

    .line 244
    const/16 v19, 0x2

    .line 245
    .line 246
    const/16 v20, 0x0

    .line 247
    .line 248
    const/16 v18, 0x0

    .line 249
    .line 250
    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 251
    .line 252
    .line 253
    move-result-object v1

    .line 254
    int-to-float v6, v12

    .line 255
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 256
    .line 257
    .line 258
    move-result v15

    .line 259
    sget-wide v11, Lcom/zykj/mistake/feature/notebook/detail/q4;->a:J

    .line 260
    .line 261
    invoke-static {v5}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 262
    .line 263
    .line 264
    move-result-object v5

    .line 265
    invoke-static {v1, v15, v11, v12, v5}, Landroidx/compose/foundation/BorderKt;->border-xT4_qwU(Landroidx/compose/ui/Modifier;FJLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 270
    .line 271
    .line 272
    move-result v5

    .line 273
    invoke-static {v1, v5}, Landroidx/compose/foundation/layout/PaddingKt;->padding-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    invoke-virtual {v3}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 278
    .line 279
    .line 280
    move-result-object v3

    .line 281
    const/4 v5, 0x0

    .line 282
    invoke-static {v3, v5}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 283
    .line 284
    .line 285
    move-result-object v3

    .line 286
    invoke-static {v4, v5}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 287
    .line 288
    .line 289
    move-result v6

    .line 290
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 291
    .line 292
    .line 293
    move-result-object v5

    .line 294
    invoke-static {v4, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 295
    .line 296
    .line 297
    move-result-object v1

    .line 298
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 299
    .line 300
    .line 301
    move-result-object v11

    .line 302
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 303
    .line 304
    .line 305
    move-result-object v12

    .line 306
    if-nez v12, :cond_e

    .line 307
    .line 308
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 309
    .line 310
    .line 311
    :cond_e
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 312
    .line 313
    .line 314
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 315
    .line 316
    .line 317
    move-result v12

    .line 318
    if-eqz v12, :cond_f

    .line 319
    .line 320
    invoke-interface {v4, v11}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 321
    .line 322
    .line 323
    goto :goto_7

    .line 324
    :cond_f
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 325
    .line 326
    .line 327
    :goto_7
    invoke-static {v4}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 328
    .line 329
    .line 330
    move-result-object v11

    .line 331
    invoke-static {v14, v11, v3, v11, v5}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 332
    .line 333
    .line 334
    move-result-object v3

    .line 335
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 336
    .line 337
    .line 338
    move-result v5

    .line 339
    if-nez v5, :cond_10

    .line 340
    .line 341
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v5

    .line 345
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 346
    .line 347
    .line 348
    move-result-object v12

    .line 349
    invoke-static {v5, v12}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 350
    .line 351
    .line 352
    move-result v5

    .line 353
    if-nez v5, :cond_11

    .line 354
    .line 355
    :cond_10
    invoke-static {v6, v11, v6, v3}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 356
    .line 357
    .line 358
    :cond_11
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 359
    .line 360
    .line 361
    move-result-object v3

    .line 362
    invoke-static {v11, v1, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 363
    .line 364
    .line 365
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 366
    .line 367
    const/4 v11, 0x0

    .line 368
    const/4 v12, 0x1

    .line 369
    invoke-static {v1, v11, v12, v13}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 370
    .line 371
    .line 372
    move-result-object v1

    .line 373
    and-int/lit8 v2, v2, 0xe

    .line 374
    .line 375
    or-int/lit8 v5, v2, 0x30

    .line 376
    .line 377
    const/16 v6, 0xc

    .line 378
    .line 379
    const/4 v2, 0x0

    .line 380
    const/4 v3, 0x0

    .line 381
    invoke-static/range {v0 .. v6}, Lcom/zykj/mistake/feature/notebook/detail/q4;->e(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/Object;ZLandroidx/compose/runtime/Composer;II)V

    .line 382
    .line 383
    .line 384
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 385
    .line 386
    .line 387
    invoke-static {v9, v11, v12, v13}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    const/4 v5, 0x0

    .line 392
    invoke-static {v0, v4, v5}, Landroidx/compose/foundation/layout/BoxKt;->Box(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 393
    .line 394
    .line 395
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 396
    .line 397
    .line 398
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 399
    .line 400
    .line 401
    move-result v0

    .line 402
    if-eqz v0, :cond_13

    .line 403
    .line 404
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 405
    .line 406
    .line 407
    goto :goto_8

    .line 408
    :cond_12
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 409
    .line 410
    .line 411
    :cond_13
    :goto_8
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 412
    .line 413
    .line 414
    move-result-object v6

    .line 415
    if-eqz v6, :cond_14

    .line 416
    .line 417
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/d0;

    .line 418
    .line 419
    move-object/from16 v1, p0

    .line 420
    .line 421
    move-object v2, v7

    .line 422
    move-object v3, v8

    .line 423
    move-object v4, v9

    .line 424
    move v5, v10

    .line 425
    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/feature/notebook/detail/d0;-><init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;I)V

    .line 426
    .line 427
    .line 428
    invoke-interface {v6, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 429
    .line 430
    .line 431
    :cond_14
    return-void
.end method

.method public static final g(Ljava/util/List;ZLr6/a;Lr6/c;Lr6/c;Landroidx/compose/runtime/Composer;I)V
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    move-object/from16 v3, p3

    .line 6
    .line 7
    move-object/from16 v4, p4

    .line 8
    .line 9
    move/from16 v7, p6

    .line 10
    .line 11
    const-string v1, "pictureNotes"

    .line 12
    .line 13
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v1, "onAddClick"

    .line 17
    .line 18
    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v1, "onImageClick"

    .line 22
    .line 23
    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v1, "onReorder"

    .line 27
    .line 28
    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const v1, -0x178170eb

    .line 32
    .line 33
    .line 34
    move-object/from16 v5, p5

    .line 35
    .line 36
    invoke-interface {v5, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    and-int/lit8 v6, v7, 0x6

    .line 41
    .line 42
    if-nez v6, :cond_1

    .line 43
    .line 44
    invoke-interface {v5, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-eqz v6, :cond_0

    .line 49
    .line 50
    const/4 v6, 0x4

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    const/4 v6, 0x2

    .line 53
    :goto_0
    or-int/2addr v6, v7

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    move v6, v7

    .line 56
    :goto_1
    and-int/lit8 v8, v7, 0x30

    .line 57
    .line 58
    if-nez v8, :cond_3

    .line 59
    .line 60
    move/from16 v8, p1

    .line 61
    .line 62
    invoke-interface {v5, v8}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 63
    .line 64
    .line 65
    move-result v9

    .line 66
    if-eqz v9, :cond_2

    .line 67
    .line 68
    const/16 v9, 0x20

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_2
    const/16 v9, 0x10

    .line 72
    .line 73
    :goto_2
    or-int/2addr v6, v9

    .line 74
    goto :goto_3

    .line 75
    :cond_3
    move/from16 v8, p1

    .line 76
    .line 77
    :goto_3
    and-int/lit16 v9, v7, 0x180

    .line 78
    .line 79
    if-nez v9, :cond_5

    .line 80
    .line 81
    invoke-interface {v5, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v9

    .line 85
    if-eqz v9, :cond_4

    .line 86
    .line 87
    const/16 v9, 0x100

    .line 88
    .line 89
    goto :goto_4

    .line 90
    :cond_4
    const/16 v9, 0x80

    .line 91
    .line 92
    :goto_4
    or-int/2addr v6, v9

    .line 93
    :cond_5
    and-int/lit16 v9, v7, 0xc00

    .line 94
    .line 95
    if-nez v9, :cond_7

    .line 96
    .line 97
    invoke-interface {v5, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v9

    .line 101
    if-eqz v9, :cond_6

    .line 102
    .line 103
    const/16 v9, 0x800

    .line 104
    .line 105
    goto :goto_5

    .line 106
    :cond_6
    const/16 v9, 0x400

    .line 107
    .line 108
    :goto_5
    or-int/2addr v6, v9

    .line 109
    :cond_7
    and-int/lit16 v9, v7, 0x6000

    .line 110
    .line 111
    if-nez v9, :cond_9

    .line 112
    .line 113
    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v9

    .line 117
    if-eqz v9, :cond_8

    .line 118
    .line 119
    const/16 v9, 0x4000

    .line 120
    .line 121
    goto :goto_6

    .line 122
    :cond_8
    const/16 v9, 0x2000

    .line 123
    .line 124
    :goto_6
    or-int/2addr v6, v9

    .line 125
    :cond_9
    and-int/lit16 v9, v6, 0x2493

    .line 126
    .line 127
    const/16 v10, 0x2492

    .line 128
    .line 129
    const/4 v11, 0x0

    .line 130
    if-eq v9, v10, :cond_a

    .line 131
    .line 132
    const/4 v9, 0x1

    .line 133
    goto :goto_7

    .line 134
    :cond_a
    move v9, v11

    .line 135
    :goto_7
    and-int/lit8 v10, v6, 0x1

    .line 136
    .line 137
    invoke-interface {v5, v9, v10}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 138
    .line 139
    .line 140
    move-result v9

    .line 141
    if-eqz v9, :cond_10

    .line 142
    .line 143
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 144
    .line 145
    .line 146
    move-result v9

    .line 147
    if-eqz v9, :cond_b

    .line 148
    .line 149
    const/4 v9, -0x1

    .line 150
    const-string v10, "com.zykj.mistake.feature.notebook.detail.NotePictureSection (MistakeDetailNotePanel.kt:146)"

    .line 151
    .line 152
    invoke-static {v1, v6, v9, v10}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 153
    .line 154
    .line 155
    :cond_b
    sget-object v1, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 156
    .line 157
    invoke-virtual {v1}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    sget-object v9, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 162
    .line 163
    sget-object v10, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 164
    .line 165
    invoke-virtual {v10}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 166
    .line 167
    .line 168
    move-result-object v10

    .line 169
    const/16 v12, 0x30

    .line 170
    .line 171
    invoke-static {v10, v1, v5, v12}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    invoke-static {v5, v11}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 176
    .line 177
    .line 178
    move-result v10

    .line 179
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 180
    .line 181
    .line 182
    move-result-object v12

    .line 183
    invoke-static {v5, v9}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 184
    .line 185
    .line 186
    move-result-object v13

    .line 187
    sget-object v14, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 188
    .line 189
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 190
    .line 191
    .line 192
    move-result-object v15

    .line 193
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 194
    .line 195
    .line 196
    move-result-object v16

    .line 197
    if-nez v16, :cond_c

    .line 198
    .line 199
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 200
    .line 201
    .line 202
    :cond_c
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 203
    .line 204
    .line 205
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 206
    .line 207
    .line 208
    move-result v16

    .line 209
    if-eqz v16, :cond_d

    .line 210
    .line 211
    invoke-interface {v5, v15}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 212
    .line 213
    .line 214
    goto :goto_8

    .line 215
    :cond_d
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 216
    .line 217
    .line 218
    :goto_8
    invoke-static {v5}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 219
    .line 220
    .line 221
    move-result-object v15

    .line 222
    invoke-static {v14, v15, v1, v15, v12}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 227
    .line 228
    .line 229
    move-result v12

    .line 230
    if-nez v12, :cond_e

    .line 231
    .line 232
    invoke-interface {v15}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v12

    .line 236
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 237
    .line 238
    .line 239
    move-result-object v11

    .line 240
    invoke-static {v12, v11}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result v11

    .line 244
    if-nez v11, :cond_f

    .line 245
    .line 246
    :cond_e
    invoke-static {v10, v15, v10, v1}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 247
    .line 248
    .line 249
    :cond_f
    invoke-virtual {v14}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    invoke-static {v15, v13, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 254
    .line 255
    .line 256
    sget-object v1, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 257
    .line 258
    sget v1, Lcom/zykj/mistake/R$string;->image_note:I

    .line 259
    .line 260
    const/4 v10, 0x0

    .line 261
    invoke-static {v1, v5, v10}, Landroidx/compose/ui/res/StringResources_androidKt;->stringResource(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    invoke-static {v1, v5, v10}, Lcom/zykj/mistake/feature/notebook/detail/q4;->h(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    .line 266
    .line 267
    .line 268
    const/16 v1, 0x8

    .line 269
    .line 270
    int-to-float v1, v1

    .line 271
    const/4 v10, 0x6

    .line 272
    invoke-static {v1, v9, v5, v10}, Landroidx/compose/material3/c;->s(FLandroidx/compose/ui/Modifier$Companion;Landroidx/compose/runtime/Composer;I)V

    .line 273
    .line 274
    .line 275
    const-wide v11, 0xffbbbbbbL

    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    invoke-static {v11, v12}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 281
    .line 282
    .line 283
    move-result-wide v11

    .line 284
    const/16 v1, 0xc

    .line 285
    .line 286
    move v14, v10

    .line 287
    move-wide v10, v11

    .line 288
    invoke-static {v1}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 289
    .line 290
    .line 291
    move-result-wide v12

    .line 292
    const/16 v31, 0xc00

    .line 293
    .line 294
    const v32, 0x1dff2

    .line 295
    .line 296
    .line 297
    const-string v8, "\u6309\u4f4f\u62d6\u52a8\u53ef\u8c03\u6574\u56fe\u7247\u987a\u5e8f"

    .line 298
    .line 299
    move-object v15, v9

    .line 300
    const/4 v9, 0x0

    .line 301
    move/from16 v16, v14

    .line 302
    .line 303
    const/4 v14, 0x0

    .line 304
    move-object/from16 v17, v15

    .line 305
    .line 306
    const/4 v15, 0x0

    .line 307
    move/from16 v18, v16

    .line 308
    .line 309
    const/16 v16, 0x0

    .line 310
    .line 311
    move-object/from16 v19, v17

    .line 312
    .line 313
    move/from16 v20, v18

    .line 314
    .line 315
    const-wide/16 v17, 0x0

    .line 316
    .line 317
    move-object/from16 v21, v19

    .line 318
    .line 319
    const/16 v19, 0x0

    .line 320
    .line 321
    move/from16 v22, v20

    .line 322
    .line 323
    const/16 v20, 0x0

    .line 324
    .line 325
    move-object/from16 v23, v21

    .line 326
    .line 327
    move/from16 v24, v22

    .line 328
    .line 329
    const-wide/16 v21, 0x0

    .line 330
    .line 331
    move-object/from16 v25, v23

    .line 332
    .line 333
    const/16 v23, 0x0

    .line 334
    .line 335
    move/from16 v26, v24

    .line 336
    .line 337
    const/16 v24, 0x0

    .line 338
    .line 339
    move-object/from16 v27, v25

    .line 340
    .line 341
    const/16 v25, 0x1

    .line 342
    .line 343
    move/from16 v28, v26

    .line 344
    .line 345
    const/16 v26, 0x0

    .line 346
    .line 347
    move-object/from16 v29, v27

    .line 348
    .line 349
    const/16 v27, 0x0

    .line 350
    .line 351
    move/from16 v30, v28

    .line 352
    .line 353
    const/16 v28, 0x0

    .line 354
    .line 355
    move/from16 v33, v30

    .line 356
    .line 357
    const/16 v30, 0xd86

    .line 358
    .line 359
    move-object/from16 v34, v29

    .line 360
    .line 361
    move-object/from16 v29, v5

    .line 362
    .line 363
    move-object/from16 v5, v34

    .line 364
    .line 365
    invoke-static/range {v8 .. v32}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 366
    .line 367
    .line 368
    move-object/from16 v8, v29

    .line 369
    .line 370
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 371
    .line 372
    .line 373
    int-to-float v1, v1

    .line 374
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 375
    .line 376
    .line 377
    move-result v1

    .line 378
    invoke-static {v5, v1}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 379
    .line 380
    .line 381
    move-result-object v1

    .line 382
    const/4 v14, 0x6

    .line 383
    invoke-static {v1, v8, v14}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 384
    .line 385
    .line 386
    const v1, 0xfffe

    .line 387
    .line 388
    .line 389
    and-int/2addr v6, v1

    .line 390
    move/from16 v1, p1

    .line 391
    .line 392
    move-object v5, v8

    .line 393
    invoke-static/range {v0 .. v6}, Lcom/zykj/mistake/feature/notebook/detail/q4;->b(Ljava/util/List;ZLr6/a;Lr6/c;Lr6/c;Landroidx/compose/runtime/Composer;I)V

    .line 394
    .line 395
    .line 396
    move-object/from16 v29, v5

    .line 397
    .line 398
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 399
    .line 400
    .line 401
    move-result v0

    .line 402
    if-eqz v0, :cond_11

    .line 403
    .line 404
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 405
    .line 406
    .line 407
    goto :goto_9

    .line 408
    :cond_10
    move-object/from16 v29, v5

    .line 409
    .line 410
    invoke-interface/range {v29 .. v29}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 411
    .line 412
    .line 413
    :cond_11
    :goto_9
    invoke-interface/range {v29 .. v29}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 414
    .line 415
    .line 416
    move-result-object v8

    .line 417
    if-eqz v8, :cond_12

    .line 418
    .line 419
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/j4;

    .line 420
    .line 421
    const/4 v7, 0x1

    .line 422
    move-object/from16 v1, p0

    .line 423
    .line 424
    move/from16 v2, p1

    .line 425
    .line 426
    move-object/from16 v3, p2

    .line 427
    .line 428
    move-object/from16 v4, p3

    .line 429
    .line 430
    move-object/from16 v5, p4

    .line 431
    .line 432
    move/from16 v6, p6

    .line 433
    .line 434
    invoke-direct/range {v0 .. v7}, Lcom/zykj/mistake/feature/notebook/detail/j4;-><init>(Ljava/util/List;ZLr6/a;Lr6/c;Lr6/c;II)V

    .line 435
    .line 436
    .line 437
    invoke-interface {v8, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 438
    .line 439
    .line 440
    :cond_12
    return-void
.end method

.method public static final h(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "title"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const v1, -0x193e8d31

    .line 9
    .line 10
    .line 11
    move-object/from16 v2, p1

    .line 12
    .line 13
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    and-int/lit8 v3, p2, 0x6

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
    or-int v3, p2, v3

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move/from16 v3, p2

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
    const/4 v5, 0x1

    .line 42
    goto :goto_2

    .line 43
    :cond_2
    move v5, v6

    .line 44
    :goto_2
    and-int/lit8 v7, v3, 0x1

    .line 45
    .line 46
    invoke-interface {v2, v5, v7}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-eqz v5, :cond_8

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
    const-string v7, "com.zykj.mistake.feature.notebook.detail.NoteSectionHeader (MistakeDetailNotePanel.kt:278)"

    .line 60
    .line 61
    invoke-static {v1, v3, v5, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 62
    .line 63
    .line 64
    :cond_3
    sget-object v1, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 65
    .line 66
    invoke-virtual {v1}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    sget-object v5, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 71
    .line 72
    sget-object v7, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 73
    .line 74
    invoke-virtual {v7}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    const/16 v8, 0x30

    .line 79
    .line 80
    invoke-static {v7, v1, v2, v8}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-static {v2, v6}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 89
    .line 90
    .line 91
    move-result-object v8

    .line 92
    invoke-static {v2, v5}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 93
    .line 94
    .line 95
    move-result-object v9

    .line 96
    sget-object v10, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 97
    .line 98
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 99
    .line 100
    .line 101
    move-result-object v11

    .line 102
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 103
    .line 104
    .line 105
    move-result-object v12

    .line 106
    if-nez v12, :cond_4

    .line 107
    .line 108
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 109
    .line 110
    .line 111
    :cond_4
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 112
    .line 113
    .line 114
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 115
    .line 116
    .line 117
    move-result v12

    .line 118
    if-eqz v12, :cond_5

    .line 119
    .line 120
    invoke-interface {v2, v11}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 121
    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_5
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 125
    .line 126
    .line 127
    :goto_3
    invoke-static {v2}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 128
    .line 129
    .line 130
    move-result-object v11

    .line 131
    invoke-static {v10, v11, v1, v11, v8}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 136
    .line 137
    .line 138
    move-result v8

    .line 139
    if-nez v8, :cond_6

    .line 140
    .line 141
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v8

    .line 145
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 146
    .line 147
    .line 148
    move-result-object v12

    .line 149
    invoke-static {v8, v12}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v8

    .line 153
    if-nez v8, :cond_7

    .line 154
    .line 155
    :cond_6
    invoke-static {v7, v11, v7, v1}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 156
    .line 157
    .line 158
    :cond_7
    invoke-virtual {v10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-static {v11, v9, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 163
    .line 164
    .line 165
    sget-object v1, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 166
    .line 167
    const/4 v1, 0x0

    .line 168
    invoke-static {v1, v2, v6}, Lcom/zykj/mistake/feature/notebook/detail/g0;->j(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 169
    .line 170
    .line 171
    const/4 v1, 0x7

    .line 172
    int-to-float v1, v1

    .line 173
    const/4 v6, 0x6

    .line 174
    invoke-static {v1, v5, v2, v6}, Landroidx/compose/material3/c;->s(FLandroidx/compose/ui/Modifier$Companion;Landroidx/compose/runtime/Composer;I)V

    .line 175
    .line 176
    .line 177
    const-wide v5, 0xff15171aL

    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    invoke-static {v5, v6}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 183
    .line 184
    .line 185
    move-result-wide v5

    .line 186
    const/16 v1, 0xf

    .line 187
    .line 188
    invoke-static {v1}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 189
    .line 190
    .line 191
    move-result-wide v7

    .line 192
    sget-object v1, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    .line 193
    .line 194
    invoke-virtual {v1}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    and-int/lit8 v3, v3, 0xe

    .line 199
    .line 200
    const v9, 0x30d80

    .line 201
    .line 202
    .line 203
    or-int v22, v3, v9

    .line 204
    .line 205
    const/16 v23, 0xc00

    .line 206
    .line 207
    const v24, 0x1dfd2

    .line 208
    .line 209
    .line 210
    move-object/from16 v21, v2

    .line 211
    .line 212
    move-wide v2, v5

    .line 213
    move v6, v4

    .line 214
    move-wide v4, v7

    .line 215
    move-object v7, v1

    .line 216
    const/4 v1, 0x0

    .line 217
    move v8, v6

    .line 218
    const/4 v6, 0x0

    .line 219
    move v9, v8

    .line 220
    const/4 v8, 0x0

    .line 221
    move v11, v9

    .line 222
    const-wide/16 v9, 0x0

    .line 223
    .line 224
    move v12, v11

    .line 225
    const/4 v11, 0x0

    .line 226
    move v13, v12

    .line 227
    const/4 v12, 0x0

    .line 228
    move v15, v13

    .line 229
    const-wide/16 v13, 0x0

    .line 230
    .line 231
    move/from16 v16, v15

    .line 232
    .line 233
    const/4 v15, 0x0

    .line 234
    move/from16 v17, v16

    .line 235
    .line 236
    const/16 v16, 0x0

    .line 237
    .line 238
    move/from16 v18, v17

    .line 239
    .line 240
    const/16 v17, 0x1

    .line 241
    .line 242
    move/from16 v19, v18

    .line 243
    .line 244
    const/16 v18, 0x0

    .line 245
    .line 246
    move/from16 v20, v19

    .line 247
    .line 248
    const/16 v19, 0x0

    .line 249
    .line 250
    move/from16 v25, v20

    .line 251
    .line 252
    const/16 v20, 0x0

    .line 253
    .line 254
    invoke-static/range {v0 .. v24}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 255
    .line 256
    .line 257
    invoke-interface/range {v21 .. v21}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 258
    .line 259
    .line 260
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 261
    .line 262
    .line 263
    move-result v1

    .line 264
    if-eqz v1, :cond_9

    .line 265
    .line 266
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 267
    .line 268
    .line 269
    goto :goto_4

    .line 270
    :cond_8
    move-object/from16 v21, v2

    .line 271
    .line 272
    invoke-interface/range {v21 .. v21}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 273
    .line 274
    .line 275
    :cond_9
    :goto_4
    invoke-interface/range {v21 .. v21}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    if-eqz v1, :cond_a

    .line 280
    .line 281
    new-instance v2, Lcom/zykj/mistake/feature/collection/component/m;

    .line 282
    .line 283
    move/from16 v3, p2

    .line 284
    .line 285
    const/4 v6, 0x2

    .line 286
    invoke-direct {v2, v0, v3, v6}, Lcom/zykj/mistake/feature/collection/component/m;-><init>(Ljava/lang/String;II)V

    .line 287
    .line 288
    .line 289
    invoke-interface {v1, v2}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 290
    .line 291
    .line 292
    :cond_a
    return-void
.end method

.method public static final i(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 7

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    const/16 v2, 0xa

    .line 9
    .line 10
    invoke-static {p0, v2}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Ljava/lang/String;

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-virtual {v0, v2, v3}, Ljava/util/LinkedHashMap;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Ljava/lang/Number;

    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    add-int/lit8 v4, v3, 0x1

    .line 49
    .line 50
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    invoke-interface {v0, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    new-instance v4, Lcom/zykj/mistake/feature/notebook/detail/b5;

    .line 58
    .line 59
    new-instance v5, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string v6, "#"

    .line 68
    .line 69
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-direct {v4, v3, v2}, Lcom/zykj/mistake/feature/notebook/detail/b5;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_0
    return-object v1
.end method
