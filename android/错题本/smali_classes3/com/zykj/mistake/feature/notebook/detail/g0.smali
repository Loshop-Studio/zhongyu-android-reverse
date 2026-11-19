.class public abstract Lcom/zykj/mistake/feature/notebook/detail/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/compose/runtime/Composer;I)V
    .locals 38

    .line 1
    move/from16 v0, p1

    .line 2
    .line 3
    const v1, -0x7f0a3cd

    .line 4
    .line 5
    .line 6
    move-object/from16 v2, p0

    .line 7
    .line 8
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v4, v3

    .line 18
    :goto_0
    and-int/lit8 v5, v0, 0x1

    .line 19
    .line 20
    invoke-interface {v2, v4, v5}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_2

    .line 25
    .line 26
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-eqz v4, :cond_1

    .line 31
    .line 32
    const/4 v4, -0x1

    .line 33
    const-string v5, "com.zykj.mistake.feature.notebook.detail.DetailEmptyTagChip (MistakeDetailDraftPanel.kt:1031)"

    .line 34
    .line 35
    invoke-static {v1, v0, v4, v5}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    const-wide v4, 0xff666666L

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    invoke-static {v4, v5}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 44
    .line 45
    .line 46
    move-result-wide v4

    .line 47
    new-instance v6, Landroidx/compose/ui/text/TextStyle;

    .line 48
    .line 49
    const/16 v1, 0xb

    .line 50
    .line 51
    invoke-static {v1}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 52
    .line 53
    .line 54
    move-result-wide v9

    .line 55
    invoke-static {v1}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 56
    .line 57
    .line 58
    move-result-wide v28

    .line 59
    new-instance v1, Landroidx/compose/ui/text/PlatformTextStyle;

    .line 60
    .line 61
    invoke-direct {v1, v3}, Landroidx/compose/ui/text/PlatformTextStyle;-><init>(Z)V

    .line 62
    .line 63
    .line 64
    const v36, 0xf5fffd

    .line 65
    .line 66
    .line 67
    const/16 v37, 0x0

    .line 68
    .line 69
    const-wide/16 v7, 0x0

    .line 70
    .line 71
    const/4 v11, 0x0

    .line 72
    const/4 v12, 0x0

    .line 73
    const/4 v13, 0x0

    .line 74
    const/4 v14, 0x0

    .line 75
    const/4 v15, 0x0

    .line 76
    const-wide/16 v16, 0x0

    .line 77
    .line 78
    const/16 v18, 0x0

    .line 79
    .line 80
    const/16 v19, 0x0

    .line 81
    .line 82
    const/16 v20, 0x0

    .line 83
    .line 84
    const-wide/16 v21, 0x0

    .line 85
    .line 86
    const/16 v23, 0x0

    .line 87
    .line 88
    const/16 v24, 0x0

    .line 89
    .line 90
    const/16 v25, 0x0

    .line 91
    .line 92
    const/16 v26, 0x0

    .line 93
    .line 94
    const/16 v27, 0x0

    .line 95
    .line 96
    const/16 v30, 0x0

    .line 97
    .line 98
    const/16 v32, 0x0

    .line 99
    .line 100
    const/16 v33, 0x0

    .line 101
    .line 102
    const/16 v34, 0x0

    .line 103
    .line 104
    const/16 v35, 0x0

    .line 105
    .line 106
    move-object/from16 v31, v1

    .line 107
    .line 108
    invoke-direct/range {v6 .. v37}, Landroidx/compose/ui/text/TextStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILkotlin/jvm/internal/e;)V

    .line 109
    .line 110
    .line 111
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 112
    .line 113
    const-wide v7, 0xfff5f5f5L

    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    invoke-static {v7, v8}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 119
    .line 120
    .line 121
    move-result-wide v7

    .line 122
    const/4 v3, 0x2

    .line 123
    int-to-float v3, v3

    .line 124
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 125
    .line 126
    .line 127
    move-result v3

    .line 128
    invoke-static {v3}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    invoke-static {v1, v7, v8, v3}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    const/4 v3, 0x6

    .line 137
    int-to-float v3, v3

    .line 138
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    const/4 v7, 0x4

    .line 143
    int-to-float v7, v7

    .line 144
    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 145
    .line 146
    .line 147
    move-result v7

    .line 148
    invoke-static {v1, v3, v7}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    const/16 v25, 0x0

    .line 153
    .line 154
    const v26, 0xfff8

    .line 155
    .line 156
    .line 157
    move-object/from16 v23, v2

    .line 158
    .line 159
    const-string v2, "\u6682\u65e0\u6807\u7b7e"

    .line 160
    .line 161
    move-object/from16 v22, v6

    .line 162
    .line 163
    const-wide/16 v6, 0x0

    .line 164
    .line 165
    const/4 v8, 0x0

    .line 166
    const/4 v9, 0x0

    .line 167
    const/4 v10, 0x0

    .line 168
    const-wide/16 v11, 0x0

    .line 169
    .line 170
    const-wide/16 v15, 0x0

    .line 171
    .line 172
    const/16 v17, 0x0

    .line 173
    .line 174
    const/16 v18, 0x0

    .line 175
    .line 176
    const/16 v19, 0x0

    .line 177
    .line 178
    const/16 v20, 0x0

    .line 179
    .line 180
    const/16 v21, 0x0

    .line 181
    .line 182
    const/16 v24, 0x186

    .line 183
    .line 184
    invoke-static/range {v2 .. v26}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 185
    .line 186
    .line 187
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 188
    .line 189
    .line 190
    move-result v1

    .line 191
    if-eqz v1, :cond_3

    .line 192
    .line 193
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 194
    .line 195
    .line 196
    goto :goto_1

    .line 197
    :cond_2
    move-object/from16 v23, v2

    .line 198
    .line 199
    invoke-interface/range {v23 .. v23}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 200
    .line 201
    .line 202
    :cond_3
    :goto_1
    invoke-interface/range {v23 .. v23}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    if-eqz v1, :cond_4

    .line 207
    .line 208
    new-instance v2, Lcom/zykj/mistake/feature/notebook/detail/x;

    .line 209
    .line 210
    const/4 v3, 0x0

    .line 211
    invoke-direct {v2, v0, v3}, Lcom/zykj/mistake/feature/notebook/detail/x;-><init>(II)V

    .line 212
    .line 213
    .line 214
    invoke-interface {v1, v2}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 215
    .line 216
    .line 217
    :cond_4
    return-void
.end method

.method public static final b(Lcom/zykj/mistake/feature/notebook/detail/m3;Lcom/zykj/mistake/feature/notebook/detail/a5;Lr6/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v13, p2

    .line 6
    .line 7
    move/from16 v14, p5

    .line 8
    .line 9
    const-string v1, "state"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->s:Ljava/util/List;

    .line 15
    .line 16
    iget v3, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->b:I

    .line 17
    .line 18
    const-string v4, "draftController"

    .line 19
    .line 20
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const v4, -0x7a364aab

    .line 24
    .line 25
    .line 26
    move-object/from16 v5, p4

    .line 27
    .line 28
    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 29
    .line 30
    .line 31
    move-result-object v11

    .line 32
    and-int/lit8 v5, v14, 0x6

    .line 33
    .line 34
    const/4 v6, 0x2

    .line 35
    if-nez v5, :cond_1

    .line 36
    .line 37
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-eqz v5, :cond_0

    .line 42
    .line 43
    const/4 v5, 0x4

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    move v5, v6

    .line 46
    :goto_0
    or-int/2addr v5, v14

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    move v5, v14

    .line 49
    :goto_1
    and-int/lit8 v7, v14, 0x30

    .line 50
    .line 51
    if-nez v7, :cond_3

    .line 52
    .line 53
    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    if-eqz v7, :cond_2

    .line 58
    .line 59
    const/16 v7, 0x20

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_2
    const/16 v7, 0x10

    .line 63
    .line 64
    :goto_2
    or-int/2addr v5, v7

    .line 65
    :cond_3
    and-int/lit16 v7, v14, 0x180

    .line 66
    .line 67
    if-nez v7, :cond_5

    .line 68
    .line 69
    invoke-interface {v11, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    if-eqz v7, :cond_4

    .line 74
    .line 75
    const/16 v7, 0x100

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_4
    const/16 v7, 0x80

    .line 79
    .line 80
    :goto_3
    or-int/2addr v5, v7

    .line 81
    :cond_5
    and-int/lit16 v7, v14, 0xc00

    .line 82
    .line 83
    move-object/from16 v15, p3

    .line 84
    .line 85
    if-nez v7, :cond_7

    .line 86
    .line 87
    invoke-interface {v11, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v7

    .line 91
    if-eqz v7, :cond_6

    .line 92
    .line 93
    const/16 v7, 0x800

    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_6
    const/16 v7, 0x400

    .line 97
    .line 98
    :goto_4
    or-int/2addr v5, v7

    .line 99
    :cond_7
    and-int/lit16 v7, v5, 0x493

    .line 100
    .line 101
    const/16 v9, 0x492

    .line 102
    .line 103
    const/4 v12, 0x0

    .line 104
    if-eq v7, v9, :cond_8

    .line 105
    .line 106
    const/4 v7, 0x1

    .line 107
    goto :goto_5

    .line 108
    :cond_8
    move v7, v12

    .line 109
    :goto_5
    and-int/lit8 v9, v5, 0x1

    .line 110
    .line 111
    invoke-interface {v11, v7, v9}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 112
    .line 113
    .line 114
    move-result v7

    .line 115
    if-eqz v7, :cond_30

    .line 116
    .line 117
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 118
    .line 119
    .line 120
    move-result v7

    .line 121
    if-eqz v7, :cond_9

    .line 122
    .line 123
    const/4 v7, -0x1

    .line 124
    const-string v9, "com.zykj.mistake.feature.notebook.detail.DetailLeftPanel (MistakeDetailDraftPanel.kt:76)"

    .line 125
    .line 126
    invoke-static {v4, v5, v7, v9}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 127
    .line 128
    .line 129
    :cond_9
    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    const/4 v9, 0x0

    .line 138
    if-nez v4, :cond_a

    .line 139
    .line 140
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 141
    .line 142
    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    if-ne v7, v4, :cond_b

    .line 147
    .line 148
    :cond_a
    sget-object v4, Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;->PEN:Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;

    .line 149
    .line 150
    invoke-static {v4, v9, v6, v9}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 151
    .line 152
    .line 153
    move-result-object v7

    .line 154
    invoke-interface {v11, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    :cond_b
    check-cast v7, Landroidx/compose/runtime/MutableState;

    .line 158
    .line 159
    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    if-nez v3, :cond_c

    .line 168
    .line 169
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 170
    .line 171
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    if-ne v4, v3, :cond_d

    .line 176
    .line 177
    :cond_c
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 178
    .line 179
    invoke-static {v3, v9, v6, v9}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    invoke-interface {v11, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    :cond_d
    move-object v3, v4

    .line 187
    check-cast v3, Landroidx/compose/runtime/MutableState;

    .line 188
    .line 189
    sget-object v4, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 190
    .line 191
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 192
    .line 193
    .line 194
    move-result-wide v16

    .line 195
    const/16 v19, 0x2

    .line 196
    .line 197
    const/16 v20, 0x0

    .line 198
    .line 199
    const/16 v18, 0x0

    .line 200
    .line 201
    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    sget-object v6, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 206
    .line 207
    invoke-virtual {v6}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 208
    .line 209
    .line 210
    move-result-object v15

    .line 211
    sget-object v16, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 212
    .line 213
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 214
    .line 215
    .line 216
    move-result-object v8

    .line 217
    invoke-static {v15, v8, v11, v12}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 218
    .line 219
    .line 220
    move-result-object v8

    .line 221
    invoke-static {v11, v12}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 222
    .line 223
    .line 224
    move-result v15

    .line 225
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 226
    .line 227
    .line 228
    move-result-object v12

    .line 229
    invoke-static {v11, v4}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 230
    .line 231
    .line 232
    move-result-object v4

    .line 233
    sget-object v9, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 234
    .line 235
    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 236
    .line 237
    .line 238
    move-result-object v10

    .line 239
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 240
    .line 241
    .line 242
    move-result-object v17

    .line 243
    if-nez v17, :cond_e

    .line 244
    .line 245
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 246
    .line 247
    .line 248
    :cond_e
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 249
    .line 250
    .line 251
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 252
    .line 253
    .line 254
    move-result v17

    .line 255
    if-eqz v17, :cond_f

    .line 256
    .line 257
    invoke-interface {v11, v10}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 258
    .line 259
    .line 260
    goto :goto_6

    .line 261
    :cond_f
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 262
    .line 263
    .line 264
    :goto_6
    invoke-static {v11}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 265
    .line 266
    .line 267
    move-result-object v10

    .line 268
    invoke-static {v9, v10, v8, v10, v12}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 269
    .line 270
    .line 271
    move-result-object v8

    .line 272
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 273
    .line 274
    .line 275
    move-result v12

    .line 276
    if-nez v12, :cond_10

    .line 277
    .line 278
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v12

    .line 282
    move-object/from16 v17, v1

    .line 283
    .line 284
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    invoke-static {v12, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    move-result v1

    .line 292
    if-nez v1, :cond_11

    .line 293
    .line 294
    goto :goto_7

    .line 295
    :cond_10
    move-object/from16 v17, v1

    .line 296
    .line 297
    :goto_7
    invoke-static {v15, v10, v15, v8}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 298
    .line 299
    .line 300
    :cond_11
    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    invoke-static {v10, v4, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 305
    .line 306
    .line 307
    sget-object v26, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 308
    .line 309
    sget-object v1, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 310
    .line 311
    const/4 v4, 0x0

    .line 312
    const/4 v8, 0x0

    .line 313
    const/4 v10, 0x1

    .line 314
    invoke-static {v1, v4, v10, v8}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 315
    .line 316
    .line 317
    move-result-object v12

    .line 318
    const/16 v8, 0x36

    .line 319
    .line 320
    int-to-float v10, v8

    .line 321
    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 322
    .line 323
    .line 324
    move-result v10

    .line 325
    invoke-static {v12, v10}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 326
    .line 327
    .line 328
    move-result-object v18

    .line 329
    const/16 v10, 0x12

    .line 330
    .line 331
    int-to-float v10, v10

    .line 332
    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 333
    .line 334
    .line 335
    move-result v19

    .line 336
    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 337
    .line 338
    .line 339
    move-result v21

    .line 340
    const/16 v23, 0xa

    .line 341
    .line 342
    const/16 v24, 0x0

    .line 343
    .line 344
    const/16 v20, 0x0

    .line 345
    .line 346
    const/16 v22, 0x0

    .line 347
    .line 348
    invoke-static/range {v18 .. v24}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 349
    .line 350
    .line 351
    move-result-object v12

    .line 352
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 353
    .line 354
    .line 355
    move-result-object v15

    .line 356
    invoke-virtual {v6}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 357
    .line 358
    .line 359
    move-result-object v4

    .line 360
    const/16 v8, 0x30

    .line 361
    .line 362
    invoke-static {v4, v15, v11, v8}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 363
    .line 364
    .line 365
    move-result-object v4

    .line 366
    const/4 v8, 0x0

    .line 367
    invoke-static {v11, v8}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 368
    .line 369
    .line 370
    move-result v15

    .line 371
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 372
    .line 373
    .line 374
    move-result-object v8

    .line 375
    invoke-static {v11, v12}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 376
    .line 377
    .line 378
    move-result-object v12

    .line 379
    move-object/from16 v19, v1

    .line 380
    .line 381
    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 382
    .line 383
    .line 384
    move-result-object v1

    .line 385
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 386
    .line 387
    .line 388
    move-result-object v18

    .line 389
    if-nez v18, :cond_12

    .line 390
    .line 391
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 392
    .line 393
    .line 394
    :cond_12
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 395
    .line 396
    .line 397
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 398
    .line 399
    .line 400
    move-result v18

    .line 401
    if-eqz v18, :cond_13

    .line 402
    .line 403
    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 404
    .line 405
    .line 406
    goto :goto_8

    .line 407
    :cond_13
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 408
    .line 409
    .line 410
    :goto_8
    invoke-static {v11}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 411
    .line 412
    .line 413
    move-result-object v1

    .line 414
    invoke-static {v9, v1, v4, v1, v8}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 415
    .line 416
    .line 417
    move-result-object v4

    .line 418
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 419
    .line 420
    .line 421
    move-result v8

    .line 422
    if-nez v8, :cond_14

    .line 423
    .line 424
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v8

    .line 428
    move/from16 v27, v10

    .line 429
    .line 430
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 431
    .line 432
    .line 433
    move-result-object v10

    .line 434
    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 435
    .line 436
    .line 437
    move-result v8

    .line 438
    if-nez v8, :cond_15

    .line 439
    .line 440
    goto :goto_9

    .line 441
    :cond_14
    move/from16 v27, v10

    .line 442
    .line 443
    :goto_9
    invoke-static {v15, v1, v15, v4}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 444
    .line 445
    .line 446
    :cond_15
    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 447
    .line 448
    .line 449
    move-result-object v4

    .line 450
    invoke-static {v1, v12, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 451
    .line 452
    .line 453
    sget-object v18, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 454
    .line 455
    const/16 v22, 0x2

    .line 456
    .line 457
    const/16 v23, 0x0

    .line 458
    .line 459
    const/high16 v20, 0x3f800000    # 1.0f

    .line 460
    .line 461
    const/16 v21, 0x0

    .line 462
    .line 463
    invoke-static/range {v18 .. v23}, Landroidx/compose/foundation/layout/RowScope;->weight$default(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 464
    .line 465
    .line 466
    move-result-object v28

    .line 467
    const/4 v8, 0x0

    .line 468
    const/4 v10, 0x1

    .line 469
    invoke-static {v8, v11, v8, v10}, Landroidx/compose/foundation/ScrollKt;->rememberScrollState(ILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/ScrollState;

    .line 470
    .line 471
    .line 472
    move-result-object v29

    .line 473
    const/16 v33, 0xe

    .line 474
    .line 475
    const/16 v34, 0x0

    .line 476
    .line 477
    const/16 v30, 0x0

    .line 478
    .line 479
    const/16 v31, 0x0

    .line 480
    .line 481
    const/16 v32, 0x0

    .line 482
    .line 483
    invoke-static/range {v28 .. v34}, Landroidx/compose/foundation/ScrollKt;->horizontalScroll$default(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;ZLandroidx/compose/foundation/gestures/FlingBehavior;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 484
    .line 485
    .line 486
    move-result-object v1

    .line 487
    const/16 v4, 0x8

    .line 488
    .line 489
    int-to-float v4, v4

    .line 490
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 491
    .line 492
    .line 493
    move-result v4

    .line 494
    invoke-virtual {v6, v4}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 495
    .line 496
    .line 497
    move-result-object v4

    .line 498
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 499
    .line 500
    .line 501
    move-result-object v6

    .line 502
    const/16 v8, 0x36

    .line 503
    .line 504
    invoke-static {v4, v6, v11, v8}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 505
    .line 506
    .line 507
    move-result-object v4

    .line 508
    const/4 v8, 0x0

    .line 509
    invoke-static {v11, v8}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 510
    .line 511
    .line 512
    move-result v6

    .line 513
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 514
    .line 515
    .line 516
    move-result-object v8

    .line 517
    invoke-static {v11, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 518
    .line 519
    .line 520
    move-result-object v1

    .line 521
    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 522
    .line 523
    .line 524
    move-result-object v12

    .line 525
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 526
    .line 527
    .line 528
    move-result-object v15

    .line 529
    if-nez v15, :cond_16

    .line 530
    .line 531
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 532
    .line 533
    .line 534
    :cond_16
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 535
    .line 536
    .line 537
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 538
    .line 539
    .line 540
    move-result v15

    .line 541
    if-eqz v15, :cond_17

    .line 542
    .line 543
    invoke-interface {v11, v12}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 544
    .line 545
    .line 546
    goto :goto_a

    .line 547
    :cond_17
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 548
    .line 549
    .line 550
    :goto_a
    invoke-static {v11}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 551
    .line 552
    .line 553
    move-result-object v12

    .line 554
    invoke-static {v9, v12, v4, v12, v8}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 555
    .line 556
    .line 557
    move-result-object v4

    .line 558
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 559
    .line 560
    .line 561
    move-result v8

    .line 562
    if-nez v8, :cond_18

    .line 563
    .line 564
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 565
    .line 566
    .line 567
    move-result-object v8

    .line 568
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 569
    .line 570
    .line 571
    move-result-object v15

    .line 572
    invoke-static {v8, v15}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 573
    .line 574
    .line 575
    move-result v8

    .line 576
    if-nez v8, :cond_19

    .line 577
    .line 578
    :cond_18
    invoke-static {v6, v12, v6, v4}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 579
    .line 580
    .line 581
    :cond_19
    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 582
    .line 583
    .line 584
    move-result-object v4

    .line 585
    invoke-static {v12, v1, v4}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 586
    .line 587
    .line 588
    invoke-interface/range {v17 .. v17}, Ljava/util/List;->isEmpty()Z

    .line 589
    .line 590
    .line 591
    move-result v1

    .line 592
    if-eqz v1, :cond_1a

    .line 593
    .line 594
    const v1, 0x5d72d953

    .line 595
    .line 596
    .line 597
    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 598
    .line 599
    .line 600
    const/4 v8, 0x0

    .line 601
    invoke-static {v11, v8}, Lcom/zykj/mistake/feature/notebook/detail/g0;->a(Landroidx/compose/runtime/Composer;I)V

    .line 602
    .line 603
    .line 604
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 605
    .line 606
    .line 607
    goto :goto_c

    .line 608
    :cond_1a
    const/4 v8, 0x0

    .line 609
    const v1, 0x5d73e285

    .line 610
    .line 611
    .line 612
    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 613
    .line 614
    .line 615
    invoke-interface/range {v17 .. v17}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 616
    .line 617
    .line 618
    move-result-object v1

    .line 619
    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 620
    .line 621
    .line 622
    move-result v4

    .line 623
    if-eqz v4, :cond_1b

    .line 624
    .line 625
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 626
    .line 627
    .line 628
    move-result-object v4

    .line 629
    check-cast v4, Lp4/i;

    .line 630
    .line 631
    invoke-static {v4, v11, v8}, Lcom/zykj/mistake/feature/notebook/detail/g0;->d(Lp4/i;Landroidx/compose/runtime/Composer;I)V

    .line 632
    .line 633
    .line 634
    goto :goto_b

    .line 635
    :cond_1b
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 636
    .line 637
    .line 638
    :goto_c
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 639
    .line 640
    .line 641
    sget v1, Lcom/zykj/mistake/R$drawable;->ic_detail_tag_edit:I

    .line 642
    .line 643
    invoke-static {v1, v11, v8}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 644
    .line 645
    .line 646
    move-result-object v15

    .line 647
    sget-object v19, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 648
    .line 649
    const/16 v1, 0xa

    .line 650
    .line 651
    int-to-float v1, v1

    .line 652
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 653
    .line 654
    .line 655
    move-result v17

    .line 656
    const/16 v21, 0xe

    .line 657
    .line 658
    const/16 v22, 0x0

    .line 659
    .line 660
    const/16 v18, 0x0

    .line 661
    .line 662
    move-object/from16 v16, v19

    .line 663
    .line 664
    const/16 v19, 0x0

    .line 665
    .line 666
    const/16 v20, 0x0

    .line 667
    .line 668
    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 669
    .line 670
    .line 671
    move-result-object v1

    .line 672
    move-object/from16 v25, v16

    .line 673
    .line 674
    invoke-static/range {v27 .. v27}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 675
    .line 676
    .line 677
    move-result v4

    .line 678
    invoke-static {v1, v4}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 679
    .line 680
    .line 681
    move-result-object v16

    .line 682
    and-int/lit16 v1, v5, 0x380

    .line 683
    .line 684
    const/16 v4, 0x100

    .line 685
    .line 686
    if-ne v1, v4, :cond_1c

    .line 687
    .line 688
    move v4, v10

    .line 689
    goto :goto_d

    .line 690
    :cond_1c
    const/4 v4, 0x0

    .line 691
    :goto_d
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 692
    .line 693
    .line 694
    move-result-object v6

    .line 695
    if-nez v4, :cond_1d

    .line 696
    .line 697
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 698
    .line 699
    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 700
    .line 701
    .line 702
    move-result-object v4

    .line 703
    if-ne v6, v4, :cond_1e

    .line 704
    .line 705
    :cond_1d
    new-instance v6, Lcom/zykj/mistake/feature/collection/filter/u0;

    .line 706
    .line 707
    const/16 v4, 0x14

    .line 708
    .line 709
    invoke-direct {v6, v13, v4}, Lcom/zykj/mistake/feature/collection/filter/u0;-><init>(Lr6/c;I)V

    .line 710
    .line 711
    .line 712
    invoke-interface {v11, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 713
    .line 714
    .line 715
    :cond_1e
    move-object/from16 v20, v6

    .line 716
    .line 717
    check-cast v20, Lr6/a;

    .line 718
    .line 719
    const/16 v21, 0x7

    .line 720
    .line 721
    const/16 v22, 0x0

    .line 722
    .line 723
    const/16 v17, 0x0

    .line 724
    .line 725
    const/16 v18, 0x0

    .line 726
    .line 727
    const/16 v19, 0x0

    .line 728
    .line 729
    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lr6/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 730
    .line 731
    .line 732
    move-result-object v17

    .line 733
    const/16 v23, 0x30

    .line 734
    .line 735
    const/16 v24, 0x78

    .line 736
    .line 737
    const-string v16, "\u7f16\u8f91\u6807\u7b7e"

    .line 738
    .line 739
    const/16 v20, 0x0

    .line 740
    .line 741
    const/16 v21, 0x0

    .line 742
    .line 743
    move-object/from16 v22, v11

    .line 744
    .line 745
    invoke-static/range {v15 .. v24}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 746
    .line 747
    .line 748
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 749
    .line 750
    .line 751
    const/4 v4, 0x0

    .line 752
    const/4 v8, 0x0

    .line 753
    invoke-static {v4, v11, v8}, Ly4/g;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 754
    .line 755
    .line 756
    iget-boolean v6, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->L:Z

    .line 757
    .line 758
    invoke-interface {v7}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 759
    .line 760
    .line 761
    move-result-object v9

    .line 762
    check-cast v9, Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;

    .line 763
    .line 764
    invoke-interface {v3}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 765
    .line 766
    .line 767
    move-result-object v12

    .line 768
    check-cast v12, Ljava/lang/Boolean;

    .line 769
    .line 770
    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    .line 771
    .line 772
    .line 773
    move-result v12

    .line 774
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 775
    .line 776
    .line 777
    move-result v15

    .line 778
    const/16 v4, 0x100

    .line 779
    .line 780
    if-ne v1, v4, :cond_1f

    .line 781
    .line 782
    move/from16 v16, v10

    .line 783
    .line 784
    goto :goto_e

    .line 785
    :cond_1f
    move/from16 v16, v8

    .line 786
    .line 787
    :goto_e
    or-int v15, v15, v16

    .line 788
    .line 789
    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 790
    .line 791
    .line 792
    move-result v16

    .line 793
    or-int v15, v15, v16

    .line 794
    .line 795
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 796
    .line 797
    .line 798
    move-result-object v4

    .line 799
    if-nez v15, :cond_20

    .line 800
    .line 801
    sget-object v15, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 802
    .line 803
    invoke-virtual {v15}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 804
    .line 805
    .line 806
    move-result-object v15

    .line 807
    if-ne v4, v15, :cond_21

    .line 808
    .line 809
    :cond_20
    new-instance v4, Landroidx/lifecycle/compose/a;

    .line 810
    .line 811
    const/4 v15, 0x3

    .line 812
    invoke-direct {v4, v0, v13, v15, v2}, Landroidx/lifecycle/compose/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 813
    .line 814
    .line 815
    invoke-interface {v11, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 816
    .line 817
    .line 818
    :cond_21
    check-cast v4, Lr6/a;

    .line 819
    .line 820
    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 821
    .line 822
    .line 823
    move-result v15

    .line 824
    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 825
    .line 826
    .line 827
    move-result v16

    .line 828
    or-int v15, v15, v16

    .line 829
    .line 830
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 831
    .line 832
    .line 833
    move-result-object v8

    .line 834
    if-nez v15, :cond_22

    .line 835
    .line 836
    sget-object v15, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 837
    .line 838
    invoke-virtual {v15}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 839
    .line 840
    .line 841
    move-result-object v15

    .line 842
    if-ne v8, v15, :cond_23

    .line 843
    .line 844
    :cond_22
    new-instance v8, Landroidx/navigation/e;

    .line 845
    .line 846
    const/16 v15, 0xb

    .line 847
    .line 848
    invoke-direct {v8, v15, v2, v3}, Landroidx/navigation/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 849
    .line 850
    .line 851
    invoke-interface {v11, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 852
    .line 853
    .line 854
    :cond_23
    check-cast v8, Lr6/a;

    .line 855
    .line 856
    invoke-interface {v11, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 857
    .line 858
    .line 859
    move-result v15

    .line 860
    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 861
    .line 862
    .line 863
    move-result v16

    .line 864
    or-int v15, v15, v16

    .line 865
    .line 866
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 867
    .line 868
    .line 869
    move-result-object v10

    .line 870
    if-nez v15, :cond_24

    .line 871
    .line 872
    sget-object v15, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 873
    .line 874
    invoke-virtual {v15}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 875
    .line 876
    .line 877
    move-result-object v15

    .line 878
    if-ne v10, v15, :cond_25

    .line 879
    .line 880
    :cond_24
    new-instance v10, Landroidx/navigation/d;

    .line 881
    .line 882
    const/16 v15, 0x8

    .line 883
    .line 884
    invoke-direct {v10, v15, v2, v7}, Landroidx/navigation/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 885
    .line 886
    .line 887
    invoke-interface {v11, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 888
    .line 889
    .line 890
    :cond_25
    move-object v7, v10

    .line 891
    check-cast v7, Lr6/c;

    .line 892
    .line 893
    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 894
    .line 895
    .line 896
    move-result v10

    .line 897
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 898
    .line 899
    .line 900
    move-result-object v15

    .line 901
    if-nez v10, :cond_26

    .line 902
    .line 903
    sget-object v10, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 904
    .line 905
    invoke-virtual {v10}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 906
    .line 907
    .line 908
    move-result-object v10

    .line 909
    if-ne v15, v10, :cond_27

    .line 910
    .line 911
    :cond_26
    new-instance v15, Lcom/zykj/mistake/feature/notebook/detail/c0;

    .line 912
    .line 913
    const/4 v10, 0x0

    .line 914
    invoke-direct {v15, v2, v10}, Lcom/zykj/mistake/feature/notebook/detail/c0;-><init>(Lcom/zykj/mistake/feature/notebook/detail/a5;I)V

    .line 915
    .line 916
    .line 917
    invoke-interface {v11, v15}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 918
    .line 919
    .line 920
    :cond_27
    check-cast v15, Lr6/a;

    .line 921
    .line 922
    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 923
    .line 924
    .line 925
    move-result v10

    .line 926
    move/from16 v17, v1

    .line 927
    .line 928
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 929
    .line 930
    .line 931
    move-result-object v1

    .line 932
    if-nez v10, :cond_28

    .line 933
    .line 934
    sget-object v10, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 935
    .line 936
    invoke-virtual {v10}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 937
    .line 938
    .line 939
    move-result-object v10

    .line 940
    if-ne v1, v10, :cond_29

    .line 941
    .line 942
    :cond_28
    new-instance v1, Lcom/zykj/mistake/feature/notebook/detail/c0;

    .line 943
    .line 944
    const/4 v10, 0x1

    .line 945
    invoke-direct {v1, v2, v10}, Lcom/zykj/mistake/feature/notebook/detail/c0;-><init>(Lcom/zykj/mistake/feature/notebook/detail/a5;I)V

    .line 946
    .line 947
    .line 948
    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 949
    .line 950
    .line 951
    :cond_29
    check-cast v1, Lr6/a;

    .line 952
    .line 953
    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 954
    .line 955
    .line 956
    move-result v10

    .line 957
    move-object/from16 v18, v1

    .line 958
    .line 959
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 960
    .line 961
    .line 962
    move-result-object v1

    .line 963
    if-nez v10, :cond_2a

    .line 964
    .line 965
    sget-object v10, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 966
    .line 967
    invoke-virtual {v10}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 968
    .line 969
    .line 970
    move-result-object v10

    .line 971
    if-ne v1, v10, :cond_2b

    .line 972
    .line 973
    :cond_2a
    new-instance v1, Lcom/zykj/mistake/feature/notebook/detail/c0;

    .line 974
    .line 975
    const/4 v10, 0x2

    .line 976
    invoke-direct {v1, v2, v10}, Lcom/zykj/mistake/feature/notebook/detail/c0;-><init>(Lcom/zykj/mistake/feature/notebook/detail/a5;I)V

    .line 977
    .line 978
    .line 979
    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 980
    .line 981
    .line 982
    :cond_2b
    move-object v10, v1

    .line 983
    check-cast v10, Lr6/a;

    .line 984
    .line 985
    move v1, v5

    .line 986
    move-object v5, v4

    .line 987
    move v4, v12

    .line 988
    and-int/lit8 v12, v1, 0x70

    .line 989
    .line 990
    move/from16 v16, v1

    .line 991
    .line 992
    move v1, v6

    .line 993
    move-object v6, v8

    .line 994
    move-object v8, v15

    .line 995
    move/from16 v15, v17

    .line 996
    .line 997
    const/16 v14, 0x100

    .line 998
    .line 999
    move-object/from16 v17, v3

    .line 1000
    .line 1001
    move-object v3, v9

    .line 1002
    move-object/from16 v9, v18

    .line 1003
    .line 1004
    invoke-static/range {v1 .. v12}, Lcom/zykj/mistake/feature/notebook/detail/g0;->c(ZLcom/zykj/mistake/feature/notebook/detail/a5;Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;ZLr6/a;Lr6/a;Lr6/c;Lr6/a;Lr6/a;Lr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 1005
    .line 1006
    .line 1007
    iget-boolean v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->K:Z

    .line 1008
    .line 1009
    const/16 v2, 0xc

    .line 1010
    .line 1011
    if-eqz v1, :cond_2f

    .line 1012
    .line 1013
    const v1, -0x38931889

    .line 1014
    .line 1015
    .line 1016
    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1017
    .line 1018
    .line 1019
    iget-boolean v1, v0, Lcom/zykj/mistake/feature/notebook/detail/m3;->L:Z

    .line 1020
    .line 1021
    invoke-interface/range {v17 .. v17}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v3

    .line 1025
    check-cast v3, Ljava/lang/Boolean;

    .line 1026
    .line 1027
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1028
    .line 1029
    .line 1030
    move-result v3

    .line 1031
    if-ne v15, v14, :cond_2c

    .line 1032
    .line 1033
    const/4 v10, 0x1

    .line 1034
    goto :goto_f

    .line 1035
    :cond_2c
    const/4 v10, 0x0

    .line 1036
    :goto_f
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v4

    .line 1040
    if-nez v10, :cond_2d

    .line 1041
    .line 1042
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 1043
    .line 1044
    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v5

    .line 1048
    if-ne v4, v5, :cond_2e

    .line 1049
    .line 1050
    :cond_2d
    new-instance v4, Lcom/zykj/mistake/feature/notebook/detail/m;

    .line 1051
    .line 1052
    const/4 v5, 0x1

    .line 1053
    invoke-direct {v4, v13, v5}, Lcom/zykj/mistake/feature/notebook/detail/m;-><init>(Lr6/c;I)V

    .line 1054
    .line 1055
    .line 1056
    invoke-interface {v11, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1057
    .line 1058
    .line 1059
    :cond_2e
    check-cast v4, Lr6/e;

    .line 1060
    .line 1061
    const/16 v22, 0x2

    .line 1062
    .line 1063
    const/16 v23, 0x0

    .line 1064
    .line 1065
    const/high16 v20, 0x3f800000    # 1.0f

    .line 1066
    .line 1067
    const/16 v21, 0x0

    .line 1068
    .line 1069
    move-object/from16 v19, v25

    .line 1070
    .line 1071
    move-object/from16 v18, v26

    .line 1072
    .line 1073
    invoke-static/range {v18 .. v23}, Landroidx/compose/foundation/layout/ColumnScope;->weight$default(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v5

    .line 1077
    const/4 v6, 0x0

    .line 1078
    const/4 v8, 0x0

    .line 1079
    const/4 v10, 0x1

    .line 1080
    invoke-static {v5, v6, v10, v8}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v17

    .line 1084
    invoke-static/range {v27 .. v27}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 1085
    .line 1086
    .line 1087
    move-result v18

    .line 1088
    invoke-static/range {v27 .. v27}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 1089
    .line 1090
    .line 1091
    move-result v20

    .line 1092
    int-to-float v2, v2

    .line 1093
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 1094
    .line 1095
    .line 1096
    move-result v19

    .line 1097
    const/16 v22, 0x8

    .line 1098
    .line 1099
    const/16 v21, 0x0

    .line 1100
    .line 1101
    invoke-static/range {v17 .. v23}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v5

    .line 1105
    and-int/lit8 v7, v16, 0x7e

    .line 1106
    .line 1107
    move v2, v1

    .line 1108
    move-object v6, v11

    .line 1109
    move-object/from16 v1, p1

    .line 1110
    .line 1111
    invoke-static/range {v0 .. v7}, Lcom/zykj/mistake/feature/notebook/detail/g0;->i(Lcom/zykj/mistake/feature/notebook/detail/m3;Lcom/zykj/mistake/feature/notebook/detail/a5;ZZLr6/e;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 1112
    .line 1113
    .line 1114
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 1115
    .line 1116
    .line 1117
    goto :goto_10

    .line 1118
    :cond_2f
    move-object/from16 v16, v25

    .line 1119
    .line 1120
    move-object/from16 v18, v26

    .line 1121
    .line 1122
    const/4 v8, 0x0

    .line 1123
    const v0, -0x388a6f6e

    .line 1124
    .line 1125
    .line 1126
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1127
    .line 1128
    .line 1129
    const/16 v22, 0x2

    .line 1130
    .line 1131
    const/16 v23, 0x0

    .line 1132
    .line 1133
    const/high16 v20, 0x3f800000    # 1.0f

    .line 1134
    .line 1135
    const/16 v21, 0x0

    .line 1136
    .line 1137
    move-object/from16 v19, v16

    .line 1138
    .line 1139
    invoke-static/range {v18 .. v23}, Landroidx/compose/foundation/layout/ColumnScope;->weight$default(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v0

    .line 1143
    const/4 v6, 0x0

    .line 1144
    const/4 v10, 0x1

    .line 1145
    invoke-static {v0, v6, v10, v8}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v14

    .line 1149
    invoke-static/range {v27 .. v27}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 1150
    .line 1151
    .line 1152
    move-result v15

    .line 1153
    invoke-static/range {v27 .. v27}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 1154
    .line 1155
    .line 1156
    move-result v17

    .line 1157
    int-to-float v0, v2

    .line 1158
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 1159
    .line 1160
    .line 1161
    move-result v16

    .line 1162
    const/16 v19, 0x8

    .line 1163
    .line 1164
    const/16 v20, 0x0

    .line 1165
    .line 1166
    const/16 v18, 0x0

    .line 1167
    .line 1168
    invoke-static/range {v14 .. v20}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v0

    .line 1172
    sget-object v1, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 1173
    .line 1174
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 1175
    .line 1176
    .line 1177
    move-result-wide v1

    .line 1178
    const/4 v4, 0x2

    .line 1179
    const/4 v5, 0x0

    .line 1180
    const/4 v3, 0x0

    .line 1181
    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v0

    .line 1185
    const/4 v8, 0x0

    .line 1186
    invoke-static {v0, v11, v8}, Landroidx/compose/foundation/layout/BoxKt;->Box(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 1187
    .line 1188
    .line 1189
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 1190
    .line 1191
    .line 1192
    :goto_10
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1193
    .line 1194
    .line 1195
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 1196
    .line 1197
    .line 1198
    move-result v0

    .line 1199
    if-eqz v0, :cond_31

    .line 1200
    .line 1201
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 1202
    .line 1203
    .line 1204
    goto :goto_11

    .line 1205
    :cond_30
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 1206
    .line 1207
    .line 1208
    :cond_31
    :goto_11
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 1209
    .line 1210
    .line 1211
    move-result-object v7

    .line 1212
    if-eqz v7, :cond_32

    .line 1213
    .line 1214
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/d0;

    .line 1215
    .line 1216
    const/4 v6, 0x0

    .line 1217
    move-object/from16 v1, p0

    .line 1218
    .line 1219
    move-object/from16 v2, p1

    .line 1220
    .line 1221
    move-object/from16 v4, p3

    .line 1222
    .line 1223
    move/from16 v5, p5

    .line 1224
    .line 1225
    move-object v3, v13

    .line 1226
    invoke-direct/range {v0 .. v6}, Lcom/zykj/mistake/feature/notebook/detail/d0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 1227
    .line 1228
    .line 1229
    invoke-interface {v7, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 1230
    .line 1231
    .line 1232
    :cond_32
    return-void
.end method

.method public static final c(ZLcom/zykj/mistake/feature/notebook/detail/a5;Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;ZLr6/a;Lr6/a;Lr6/c;Lr6/a;Lr6/a;Lr6/a;Landroidx/compose/runtime/Composer;I)V
    .locals 22

    move/from16 v1, p0

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v0, p8

    move-object/from16 v2, p9

    move/from16 v3, p11

    const-string v4, "draftController"

    move-object/from16 v13, p1

    invoke-static {v13, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "selectedMode"

    move-object/from16 v9, p2

    invoke-static {v9, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onToggle"

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onTouchToggle"

    invoke-static {v6, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onModeSelect"

    invoke-static {v7, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onClean"

    invoke-static {v8, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onZoomIn"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onZoomOut"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const v4, -0x76452492

    move-object/from16 v10, p10

    .line 1
    invoke-interface {v10, v4}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v11

    and-int/lit8 v10, v3, 0x6

    if-nez v10, :cond_1

    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v10

    if-eqz v10, :cond_0

    const/4 v10, 0x4

    goto :goto_0

    :cond_0
    const/4 v10, 0x2

    :goto_0
    or-int/2addr v10, v3

    goto :goto_1

    :cond_1
    move v10, v3

    :goto_1
    and-int/lit16 v12, v3, 0x180

    if-nez v12, :cond_3

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v12

    invoke-interface {v11, v12}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v12

    if-eqz v12, :cond_2

    const/16 v12, 0x100

    goto :goto_2

    :cond_2
    const/16 v12, 0x80

    :goto_2
    or-int/2addr v10, v12

    :cond_3
    and-int/lit16 v12, v3, 0xc00

    if-nez v12, :cond_5

    move/from16 v12, p3

    invoke-interface {v11, v12}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v14

    if-eqz v14, :cond_4

    const/16 v14, 0x800

    goto :goto_3

    :cond_4
    const/16 v14, 0x400

    :goto_3
    or-int/2addr v10, v14

    goto :goto_4

    :cond_5
    move/from16 v12, p3

    :goto_4
    and-int/lit16 v14, v3, 0x6000

    if-nez v14, :cond_7

    invoke-interface {v11, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_6

    const/16 v14, 0x4000

    goto :goto_5

    :cond_6
    const/16 v14, 0x2000

    :goto_5
    or-int/2addr v10, v14

    :cond_7
    const/high16 v14, 0x30000

    and-int/2addr v14, v3

    if-nez v14, :cond_9

    invoke-interface {v11, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_8

    const/high16 v14, 0x20000

    goto :goto_6

    :cond_8
    const/high16 v14, 0x10000

    :goto_6
    or-int/2addr v10, v14

    :cond_9
    const/high16 v14, 0x180000

    and-int/2addr v14, v3

    if-nez v14, :cond_b

    invoke-interface {v11, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_a

    const/high16 v14, 0x100000

    goto :goto_7

    :cond_a
    const/high16 v14, 0x80000

    :goto_7
    or-int/2addr v10, v14

    :cond_b
    const/high16 v14, 0xc00000

    and-int/2addr v14, v3

    if-nez v14, :cond_d

    invoke-interface {v11, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_c

    const/high16 v14, 0x800000

    goto :goto_8

    :cond_c
    const/high16 v14, 0x400000

    :goto_8
    or-int/2addr v10, v14

    :cond_d
    const/high16 v14, 0x6000000

    and-int/2addr v14, v3

    if-nez v14, :cond_f

    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_e

    const/high16 v14, 0x4000000

    goto :goto_9

    :cond_e
    const/high16 v14, 0x2000000

    :goto_9
    or-int/2addr v10, v14

    :cond_f
    const/high16 v14, 0x30000000

    and-int/2addr v14, v3

    if-nez v14, :cond_11

    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_10

    const/high16 v14, 0x20000000

    goto :goto_a

    :cond_10
    const/high16 v14, 0x10000000

    :goto_a
    or-int/2addr v10, v14

    :cond_11
    move v14, v10

    const v10, 0x12492483

    and-int/2addr v10, v14

    const v15, 0x12492482

    if-eq v10, v15, :cond_12

    const/4 v10, 0x1

    goto :goto_b

    :cond_12
    const/4 v10, 0x0

    :goto_b
    and-int/lit8 v15, v14, 0x1

    invoke-interface {v11, v10, v15}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v10

    if-eqz v10, :cond_19

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v10

    if-eqz v10, :cond_13

    const/4 v10, -0x1

    const-string v15, "com.zykj.mistake.feature.notebook.detail.DetailStemToolbar (MistakeDetailDraftPanel.kt:196)"

    const v4, -0x76452492

    invoke-static {v4, v14, v10, v15}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 2
    :cond_13
    sget-object v4, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    const/4 v10, 0x0

    const/4 v15, 0x0

    const/4 v3, 0x1

    .line 3
    invoke-static {v4, v10, v3, v15}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v10, 0x2c

    int-to-float v10, v10

    .line 4
    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v10

    .line 5
    invoke-static {v3, v10}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v15

    const/16 v3, 0x12

    int-to-float v3, v3

    .line 6
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v16

    const/16 v3, 0x8

    int-to-float v3, v3

    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v17

    const/16 v20, 0xc

    const/16 v21, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    .line 7
    invoke-static/range {v15 .. v21}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    .line 8
    sget-object v10, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v10}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    move-result-object v10

    .line 9
    sget-object v15, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v15}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    move-result-object v15

    const/16 v6, 0x30

    .line 10
    invoke-static {v15, v10, v11, v6}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v6

    const/4 v10, 0x0

    .line 11
    invoke-static {v11, v10}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v10

    .line 12
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v15

    .line 13
    invoke-static {v11, v3}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    .line 14
    sget-object v7, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v7}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    move-result-object v8

    .line 15
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v16

    if-nez v16, :cond_14

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 16
    :cond_14
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 17
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v16

    if-eqz v16, :cond_15

    .line 18
    invoke-interface {v11, v8}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    goto :goto_c

    .line 19
    :cond_15
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 20
    :goto_c
    invoke-static {v11}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v8

    .line 21
    invoke-static {v7, v8, v6, v8, v15}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    move-result-object v6

    .line 22
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v15

    if-nez v15, :cond_16

    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v15

    move-object/from16 p10, v7

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v15, v7}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_17

    goto :goto_d

    :cond_16
    move-object/from16 p10, v7

    .line 23
    :goto_d
    invoke-static {v10, v8, v10, v6}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 24
    :cond_17
    invoke-virtual/range {p10 .. p10}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    move-result-object v6

    invoke-static {v8, v3, v6}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 25
    sget-object v3, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    const/4 v3, 0x6

    if-eqz v1, :cond_18

    const v6, 0x4d92c036    # 3.077588E8f

    .line 26
    invoke-interface {v11, v6}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    shr-int/lit8 v6, v14, 0x6

    and-int/lit8 v6, v6, 0x7e

    shr-int/lit8 v7, v14, 0x9

    and-int/lit16 v8, v7, 0x380

    or-int/2addr v6, v8

    and-int/lit16 v8, v7, 0x1c00

    or-int/2addr v6, v8

    const v8, 0xe000

    and-int/2addr v7, v8

    or-int/2addr v6, v7

    move-object/from16 v8, p5

    move-object/from16 v10, p7

    move v7, v12

    move v12, v6

    move-object v6, v9

    move-object/from16 v9, p6

    .line 27
    invoke-static/range {v6 .. v12}, Lcom/zykj/mistake/feature/notebook/detail/g0;->f(Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;ZLr6/a;Lr6/c;Lr6/a;Landroidx/compose/runtime/Composer;I)V

    const/16 v6, 0x10

    int-to-float v6, v6

    .line 28
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v6

    .line 29
    invoke-static {v4, v6}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v6, v11, v3}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 30
    :goto_e
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    goto :goto_f

    :cond_18
    const v6, 0x4d1c93d8    # 1.6418342E8f

    invoke-interface {v11, v6}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    goto :goto_e

    :goto_f
    and-int/lit8 v6, v14, 0xe

    shr-int/lit8 v7, v14, 0x9

    and-int/lit8 v7, v7, 0x70

    or-int/2addr v6, v7

    .line 31
    invoke-static {v1, v5, v11, v6}, Lcom/zykj/mistake/feature/notebook/detail/g0;->e(ZLr6/a;Landroidx/compose/runtime/Composer;I)V

    const/16 v6, 0xe

    int-to-float v6, v6

    .line 32
    invoke-static {v6, v4, v11, v3}, Landroidx/compose/material3/c;->s(FLandroidx/compose/ui/Modifier$Companion;Landroidx/compose/runtime/Composer;I)V

    shr-int/lit8 v3, v14, 0x18

    and-int/lit8 v3, v3, 0x7e

    .line 33
    invoke-static {v0, v2, v11, v3}, Lcom/zykj/mistake/feature/notebook/detail/g0;->g(Lr6/a;Lr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 34
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 35
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_1a

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_10

    .line 36
    :cond_19
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 37
    :cond_1a
    :goto_10
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v12

    if-eqz v12, :cond_1b

    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/e0;

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v11, p11

    move-object v10, v2

    move-object v2, v13

    invoke-direct/range {v0 .. v11}, Lcom/zykj/mistake/feature/notebook/detail/e0;-><init>(ZLcom/zykj/mistake/feature/notebook/detail/a5;Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;ZLr6/a;Lr6/a;Lr6/c;Lr6/a;Lr6/a;Lr6/a;I)V

    invoke-interface {v12, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    :cond_1b
    return-void
.end method

.method public static final d(Lp4/i;Landroidx/compose/runtime/Composer;I)V
    .locals 57

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    const-string v2, "tag"

    .line 6
    .line 7
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const v2, -0x7330f9fd

    .line 11
    .line 12
    .line 13
    move-object/from16 v3, p1

    .line 14
    .line 15
    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    and-int/lit8 v4, v1, 0x6

    .line 20
    .line 21
    const/4 v5, 0x4

    .line 22
    const/4 v6, 0x2

    .line 23
    if-nez v4, :cond_1

    .line 24
    .line 25
    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    move v4, v5

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move v4, v6

    .line 34
    :goto_0
    or-int/2addr v4, v1

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move v4, v1

    .line 37
    :goto_1
    and-int/lit8 v7, v4, 0x3

    .line 38
    .line 39
    const/4 v8, 0x0

    .line 40
    const/4 v9, 0x1

    .line 41
    if-eq v7, v6, :cond_2

    .line 42
    .line 43
    move v7, v9

    .line 44
    goto :goto_2

    .line 45
    :cond_2
    move v7, v8

    .line 46
    :goto_2
    and-int/lit8 v10, v4, 0x1

    .line 47
    .line 48
    invoke-interface {v3, v7, v10}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 49
    .line 50
    .line 51
    move-result v7

    .line 52
    if-eqz v7, :cond_8

    .line 53
    .line 54
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 55
    .line 56
    .line 57
    move-result v7

    .line 58
    if-eqz v7, :cond_3

    .line 59
    .line 60
    const/4 v7, -0x1

    .line 61
    const-string v10, "com.zykj.mistake.feature.notebook.detail.DetailTagChip (MistakeDetailDraftPanel.kt:1007)"

    .line 62
    .line 63
    invoke-static {v2, v4, v7, v10}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 64
    .line 65
    .line 66
    :cond_3
    iget-object v2, v0, Lp4/i;->b:Lcom/zykj/mistake/feature/mistake/model/MistakeTagType;

    .line 67
    .line 68
    sget-object v4, Lcom/zykj/mistake/feature/notebook/detail/f0;->a:[I

    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    aget v2, v4, v2

    .line 75
    .line 76
    if-eq v2, v9, :cond_7

    .line 77
    .line 78
    if-eq v2, v6, :cond_6

    .line 79
    .line 80
    const/4 v4, 0x3

    .line 81
    if-eq v2, v4, :cond_5

    .line 82
    .line 83
    if-ne v2, v5, :cond_4

    .line 84
    .line 85
    const-wide v9, 0xffeff6ffL

    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    invoke-static {v9, v10}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 91
    .line 92
    .line 93
    move-result-wide v9

    .line 94
    invoke-static {v9, v10}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    const-wide v9, 0xff1576ffL

    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    invoke-static {v9, v10}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 104
    .line 105
    .line 106
    move-result-wide v9

    .line 107
    invoke-static {v9, v10}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    new-instance v7, Lkotlin/Pair;

    .line 112
    .line 113
    invoke-direct {v7, v2, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    :goto_3
    move-object/from16 v24, v3

    .line 117
    .line 118
    goto :goto_4

    .line 119
    :cond_4
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 120
    .line 121
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 122
    .line 123
    .line 124
    throw v0

    .line 125
    :cond_5
    const-wide v9, 0xfffff6ebL

    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    invoke-static {v9, v10}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 131
    .line 132
    .line 133
    move-result-wide v9

    .line 134
    invoke-static {v9, v10}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    const-wide v9, 0xffff9a2bL

    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    invoke-static {v9, v10}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 144
    .line 145
    .line 146
    move-result-wide v9

    .line 147
    invoke-static {v9, v10}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    new-instance v7, Lkotlin/Pair;

    .line 152
    .line 153
    invoke-direct {v7, v2, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_6
    const-wide v9, 0xffeffff9L

    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    invoke-static {v9, v10}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 163
    .line 164
    .line 165
    move-result-wide v9

    .line 166
    invoke-static {v9, v10}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    const-wide v9, 0xff20b486L

    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    invoke-static {v9, v10}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 176
    .line 177
    .line 178
    move-result-wide v9

    .line 179
    invoke-static {v9, v10}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    new-instance v7, Lkotlin/Pair;

    .line 184
    .line 185
    invoke-direct {v7, v2, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    goto :goto_3

    .line 189
    :cond_7
    const-wide v9, 0xfffff0f0L

    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    invoke-static {v9, v10}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 195
    .line 196
    .line 197
    move-result-wide v9

    .line 198
    invoke-static {v9, v10}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    const-wide v9, 0xffff5e5eL

    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    invoke-static {v9, v10}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 208
    .line 209
    .line 210
    move-result-wide v9

    .line 211
    invoke-static {v9, v10}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    new-instance v7, Lkotlin/Pair;

    .line 216
    .line 217
    invoke-direct {v7, v2, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    goto :goto_3

    .line 221
    :goto_4
    iget-object v3, v0, Lp4/i;->a:Ljava/lang/String;

    .line 222
    .line 223
    invoke-virtual {v7}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    check-cast v2, Landroidx/compose/ui/graphics/Color;

    .line 228
    .line 229
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    .line 230
    .line 231
    .line 232
    move-result-wide v9

    .line 233
    new-instance v23, Landroidx/compose/ui/text/TextStyle;

    .line 234
    .line 235
    const/16 v2, 0xb

    .line 236
    .line 237
    invoke-static {v2}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 238
    .line 239
    .line 240
    move-result-wide v28

    .line 241
    invoke-static {v2}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 242
    .line 243
    .line 244
    move-result-wide v47

    .line 245
    new-instance v2, Landroidx/compose/ui/text/PlatformTextStyle;

    .line 246
    .line 247
    invoke-direct {v2, v8}, Landroidx/compose/ui/text/PlatformTextStyle;-><init>(Z)V

    .line 248
    .line 249
    .line 250
    const v55, 0xf5fffd

    .line 251
    .line 252
    .line 253
    const/16 v56, 0x0

    .line 254
    .line 255
    const-wide/16 v26, 0x0

    .line 256
    .line 257
    const/16 v30, 0x0

    .line 258
    .line 259
    const/16 v31, 0x0

    .line 260
    .line 261
    const/16 v32, 0x0

    .line 262
    .line 263
    const/16 v33, 0x0

    .line 264
    .line 265
    const/16 v34, 0x0

    .line 266
    .line 267
    const-wide/16 v35, 0x0

    .line 268
    .line 269
    const/16 v37, 0x0

    .line 270
    .line 271
    const/16 v38, 0x0

    .line 272
    .line 273
    const/16 v39, 0x0

    .line 274
    .line 275
    const-wide/16 v40, 0x0

    .line 276
    .line 277
    const/16 v42, 0x0

    .line 278
    .line 279
    const/16 v43, 0x0

    .line 280
    .line 281
    const/16 v44, 0x0

    .line 282
    .line 283
    const/16 v45, 0x0

    .line 284
    .line 285
    const/16 v46, 0x0

    .line 286
    .line 287
    const/16 v49, 0x0

    .line 288
    .line 289
    const/16 v51, 0x0

    .line 290
    .line 291
    const/16 v52, 0x0

    .line 292
    .line 293
    const/16 v53, 0x0

    .line 294
    .line 295
    const/16 v54, 0x0

    .line 296
    .line 297
    move-object/from16 v50, v2

    .line 298
    .line 299
    move-object/from16 v25, v23

    .line 300
    .line 301
    invoke-direct/range {v25 .. v56}, Landroidx/compose/ui/text/TextStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILkotlin/jvm/internal/e;)V

    .line 302
    .line 303
    .line 304
    sget-object v2, Landroidx/compose/ui/text/style/TextOverflow;->Companion:Landroidx/compose/ui/text/style/TextOverflow$Companion;

    .line 305
    .line 306
    invoke-virtual {v2}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getEllipsis-gIe3tQ8()I

    .line 307
    .line 308
    .line 309
    move-result v18

    .line 310
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 311
    .line 312
    invoke-virtual {v7}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v4

    .line 316
    check-cast v4, Landroidx/compose/ui/graphics/Color;

    .line 317
    .line 318
    invoke-virtual {v4}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    .line 319
    .line 320
    .line 321
    move-result-wide v7

    .line 322
    int-to-float v4, v6

    .line 323
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 324
    .line 325
    .line 326
    move-result v4

    .line 327
    invoke-static {v4}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 328
    .line 329
    .line 330
    move-result-object v4

    .line 331
    invoke-static {v2, v7, v8, v4}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 332
    .line 333
    .line 334
    move-result-object v2

    .line 335
    const/4 v4, 0x6

    .line 336
    int-to-float v4, v4

    .line 337
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 338
    .line 339
    .line 340
    move-result v4

    .line 341
    int-to-float v5, v5

    .line 342
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 343
    .line 344
    .line 345
    move-result v5

    .line 346
    invoke-static {v2, v4, v5}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 347
    .line 348
    .line 349
    move-result-object v4

    .line 350
    const/16 v26, 0xc30

    .line 351
    .line 352
    const v27, 0xd7f8

    .line 353
    .line 354
    .line 355
    const-wide/16 v7, 0x0

    .line 356
    .line 357
    move-wide v5, v9

    .line 358
    const/4 v9, 0x0

    .line 359
    const/4 v10, 0x0

    .line 360
    const/4 v11, 0x0

    .line 361
    const-wide/16 v12, 0x0

    .line 362
    .line 363
    const/4 v14, 0x0

    .line 364
    const/4 v15, 0x0

    .line 365
    const-wide/16 v16, 0x0

    .line 366
    .line 367
    const/16 v19, 0x0

    .line 368
    .line 369
    const/16 v20, 0x1

    .line 370
    .line 371
    const/16 v21, 0x0

    .line 372
    .line 373
    const/16 v22, 0x0

    .line 374
    .line 375
    const/16 v25, 0x0

    .line 376
    .line 377
    invoke-static/range {v3 .. v27}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 378
    .line 379
    .line 380
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 381
    .line 382
    .line 383
    move-result v2

    .line 384
    if-eqz v2, :cond_9

    .line 385
    .line 386
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 387
    .line 388
    .line 389
    goto :goto_5

    .line 390
    :cond_8
    move-object/from16 v24, v3

    .line 391
    .line 392
    invoke-interface/range {v24 .. v24}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 393
    .line 394
    .line 395
    :cond_9
    :goto_5
    invoke-interface/range {v24 .. v24}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 396
    .line 397
    .line 398
    move-result-object v2

    .line 399
    if-eqz v2, :cond_a

    .line 400
    .line 401
    new-instance v3, Lcom/zykj/mistake/feature/notebook/detail/y;

    .line 402
    .line 403
    const/4 v4, 0x0

    .line 404
    invoke-direct {v3, v0, v1, v4}, Lcom/zykj/mistake/feature/notebook/detail/y;-><init>(Lp4/i;II)V

    .line 405
    .line 406
    .line 407
    invoke-interface {v2, v3}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 408
    .line 409
    .line 410
    :cond_a
    return-void
.end method

.method public static final e(ZLr6/a;Landroidx/compose/runtime/Composer;I)V
    .locals 19

    .line 1
    move/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v5, p1

    .line 4
    .line 5
    move/from16 v8, p3

    .line 6
    .line 7
    const-string v1, "onClick"

    .line 8
    .line 9
    invoke-static {v5, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const v1, -0x38eb70f8

    .line 13
    .line 14
    .line 15
    move-object/from16 v2, p2

    .line 16
    .line 17
    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 18
    .line 19
    .line 20
    move-result-object v9

    .line 21
    and-int/lit8 v2, v8, 0x6

    .line 22
    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    const/4 v2, 0x4

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v2, 0x2

    .line 34
    :goto_0
    or-int/2addr v2, v8

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move v2, v8

    .line 37
    :goto_1
    and-int/lit8 v3, v8, 0x30

    .line 38
    .line 39
    if-nez v3, :cond_3

    .line 40
    .line 41
    invoke-interface {v9, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_2

    .line 46
    .line 47
    const/16 v3, 0x20

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    const/16 v3, 0x10

    .line 51
    .line 52
    :goto_2
    or-int/2addr v2, v3

    .line 53
    :cond_3
    and-int/lit8 v3, v2, 0x13

    .line 54
    .line 55
    const/16 v4, 0x12

    .line 56
    .line 57
    const/4 v10, 0x0

    .line 58
    if-eq v3, v4, :cond_4

    .line 59
    .line 60
    const/4 v3, 0x1

    .line 61
    goto :goto_3

    .line 62
    :cond_4
    move v3, v10

    .line 63
    :goto_3
    and-int/lit8 v4, v2, 0x1

    .line 64
    .line 65
    invoke-interface {v9, v3, v4}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-eqz v3, :cond_c

    .line 70
    .line 71
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-eqz v3, :cond_5

    .line 76
    .line 77
    const/4 v3, -0x1

    .line 78
    const-string v4, "com.zykj.mistake.feature.notebook.detail.DraftToggleButton (MistakeDetailDraftPanel.kt:303)"

    .line 79
    .line 80
    invoke-static {v1, v2, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :cond_5
    sget-object v11, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 84
    .line 85
    const/16 v1, 0x1e

    .line 86
    .line 87
    int-to-float v12, v1

    .line 88
    invoke-static {v12}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    const/16 v2, 0x1c

    .line 93
    .line 94
    int-to-float v2, v2

    .line 95
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    invoke-static {v11, v1, v2}, Landroidx/compose/foundation/layout/SizeKt;->size-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    const/4 v6, 0x7

    .line 104
    const/4 v7, 0x0

    .line 105
    const/4 v2, 0x0

    .line 106
    const/4 v3, 0x0

    .line 107
    const/4 v4, 0x0

    .line 108
    invoke-static/range {v1 .. v7}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lr6/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    sget-object v2, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 113
    .line 114
    invoke-virtual {v2}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    invoke-static {v2, v10}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    invoke-static {v9, v10}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    invoke-static {v9, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    sget-object v6, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 135
    .line 136
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 137
    .line 138
    .line 139
    move-result-object v7

    .line 140
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 141
    .line 142
    .line 143
    move-result-object v13

    .line 144
    if-nez v13, :cond_6

    .line 145
    .line 146
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 147
    .line 148
    .line 149
    :cond_6
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 150
    .line 151
    .line 152
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 153
    .line 154
    .line 155
    move-result v13

    .line 156
    if-eqz v13, :cond_7

    .line 157
    .line 158
    invoke-interface {v9, v7}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 159
    .line 160
    .line 161
    goto :goto_4

    .line 162
    :cond_7
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 163
    .line 164
    .line 165
    :goto_4
    invoke-static {v9}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 166
    .line 167
    .line 168
    move-result-object v7

    .line 169
    invoke-static {v6, v7, v2, v7, v4}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 174
    .line 175
    .line 176
    move-result v4

    .line 177
    if-nez v4, :cond_8

    .line 178
    .line 179
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 184
    .line 185
    .line 186
    move-result-object v13

    .line 187
    invoke-static {v4, v13}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v4

    .line 191
    if-nez v4, :cond_9

    .line 192
    .line 193
    :cond_8
    invoke-static {v3, v7, v3, v2}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 194
    .line 195
    .line 196
    :cond_9
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    invoke-static {v7, v1, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 201
    .line 202
    .line 203
    sget-object v1, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 204
    .line 205
    if-eqz v0, :cond_a

    .line 206
    .line 207
    sget v1, Lcom/zykj/mistake/R$drawable;->ic_collapse_board:I

    .line 208
    .line 209
    goto :goto_5

    .line 210
    :cond_a
    sget v1, Lcom/zykj/mistake/R$drawable;->ic_expand_board:I

    .line 211
    .line 212
    :goto_5
    invoke-static {v1, v9, v10}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    if-eqz v0, :cond_b

    .line 217
    .line 218
    const-string v2, "\u6536\u8d77\u753b\u677f"

    .line 219
    .line 220
    goto :goto_6

    .line 221
    :cond_b
    const-string v2, "\u5c55\u5f00\u753b\u677f"

    .line 222
    .line 223
    :goto_6
    invoke-static {v12}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 224
    .line 225
    .line 226
    move-result v3

    .line 227
    invoke-static {v11, v3}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 228
    .line 229
    .line 230
    move-result-object v11

    .line 231
    const/16 v17, 0x180

    .line 232
    .line 233
    const/16 v18, 0x78

    .line 234
    .line 235
    const/4 v12, 0x0

    .line 236
    const/4 v13, 0x0

    .line 237
    const/4 v14, 0x0

    .line 238
    const/4 v15, 0x0

    .line 239
    move-object/from16 v16, v9

    .line 240
    .line 241
    move-object v9, v1

    .line 242
    move v1, v10

    .line 243
    move-object v10, v2

    .line 244
    invoke-static/range {v9 .. v18}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 245
    .line 246
    .line 247
    invoke-interface/range {v16 .. v16}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 248
    .line 249
    .line 250
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 251
    .line 252
    .line 253
    move-result v2

    .line 254
    if-eqz v2, :cond_d

    .line 255
    .line 256
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 257
    .line 258
    .line 259
    goto :goto_7

    .line 260
    :cond_c
    move-object/from16 v16, v9

    .line 261
    .line 262
    move v1, v10

    .line 263
    invoke-interface/range {v16 .. v16}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 264
    .line 265
    .line 266
    :cond_d
    :goto_7
    invoke-interface/range {v16 .. v16}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    if-eqz v2, :cond_e

    .line 271
    .line 272
    new-instance v3, Lcom/zykj/mistake/feature/notebook/detail/z;

    .line 273
    .line 274
    invoke-direct {v3, v0, v5, v8, v1}, Lcom/zykj/mistake/feature/notebook/detail/z;-><init>(ZLr6/a;II)V

    .line 275
    .line 276
    .line 277
    invoke-interface {v2, v3}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 278
    .line 279
    .line 280
    :cond_e
    return-void
.end method

.method public static final f(Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;ZLr6/a;Lr6/c;Lr6/a;Landroidx/compose/runtime/Composer;I)V
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move-object/from16 v0, p3

    .line 6
    .line 7
    move-object/from16 v10, p4

    .line 8
    .line 9
    move/from16 v11, p6

    .line 10
    .line 11
    const-string v2, "selectedMode"

    .line 12
    .line 13
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v2, "onTouchToggle"

    .line 17
    .line 18
    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v2, "onModeSelect"

    .line 22
    .line 23
    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v2, "onClean"

    .line 27
    .line 28
    invoke-static {v10, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const v2, -0xed751d6

    .line 32
    .line 33
    .line 34
    move-object/from16 v4, p5

    .line 35
    .line 36
    invoke-interface {v4, v2}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    and-int/lit8 v4, v11, 0x6

    .line 41
    .line 42
    const/4 v5, 0x4

    .line 43
    const/4 v6, 0x2

    .line 44
    if-nez v4, :cond_1

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    invoke-interface {v7, v4}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-eqz v4, :cond_0

    .line 55
    .line 56
    move v4, v5

    .line 57
    goto :goto_0

    .line 58
    :cond_0
    move v4, v6

    .line 59
    :goto_0
    or-int/2addr v4, v11

    .line 60
    goto :goto_1

    .line 61
    :cond_1
    move v4, v11

    .line 62
    :goto_1
    and-int/lit8 v8, v11, 0x30

    .line 63
    .line 64
    if-nez v8, :cond_3

    .line 65
    .line 66
    move/from16 v8, p1

    .line 67
    .line 68
    invoke-interface {v7, v8}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 69
    .line 70
    .line 71
    move-result v9

    .line 72
    if-eqz v9, :cond_2

    .line 73
    .line 74
    const/16 v9, 0x20

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_2
    const/16 v9, 0x10

    .line 78
    .line 79
    :goto_2
    or-int/2addr v4, v9

    .line 80
    goto :goto_3

    .line 81
    :cond_3
    move/from16 v8, p1

    .line 82
    .line 83
    :goto_3
    and-int/lit16 v9, v11, 0x180

    .line 84
    .line 85
    if-nez v9, :cond_5

    .line 86
    .line 87
    invoke-interface {v7, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v9

    .line 91
    if-eqz v9, :cond_4

    .line 92
    .line 93
    const/16 v9, 0x100

    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_4
    const/16 v9, 0x80

    .line 97
    .line 98
    :goto_4
    or-int/2addr v4, v9

    .line 99
    :cond_5
    and-int/lit16 v9, v11, 0xc00

    .line 100
    .line 101
    if-nez v9, :cond_7

    .line 102
    .line 103
    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v9

    .line 107
    if-eqz v9, :cond_6

    .line 108
    .line 109
    const/16 v9, 0x800

    .line 110
    .line 111
    goto :goto_5

    .line 112
    :cond_6
    const/16 v9, 0x400

    .line 113
    .line 114
    :goto_5
    or-int/2addr v4, v9

    .line 115
    :cond_7
    and-int/lit16 v9, v11, 0x6000

    .line 116
    .line 117
    if-nez v9, :cond_9

    .line 118
    .line 119
    invoke-interface {v7, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v9

    .line 123
    if-eqz v9, :cond_8

    .line 124
    .line 125
    const/16 v9, 0x4000

    .line 126
    .line 127
    goto :goto_6

    .line 128
    :cond_8
    const/16 v9, 0x2000

    .line 129
    .line 130
    :goto_6
    or-int/2addr v4, v9

    .line 131
    :cond_9
    move v13, v4

    .line 132
    and-int/lit16 v4, v13, 0x2493

    .line 133
    .line 134
    const/16 v9, 0x2492

    .line 135
    .line 136
    const/4 v14, 0x0

    .line 137
    const/16 v20, 0x1

    .line 138
    .line 139
    if-eq v4, v9, :cond_a

    .line 140
    .line 141
    move/from16 v4, v20

    .line 142
    .line 143
    goto :goto_7

    .line 144
    :cond_a
    move v4, v14

    .line 145
    :goto_7
    and-int/lit8 v9, v13, 0x1

    .line 146
    .line 147
    invoke-interface {v7, v4, v9}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    if-eqz v4, :cond_25

    .line 152
    .line 153
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 154
    .line 155
    .line 156
    move-result v4

    .line 157
    if-eqz v4, :cond_b

    .line 158
    .line 159
    const/4 v4, -0x1

    .line 160
    const-string v9, "com.zykj.mistake.feature.notebook.detail.DraftToolGroup (MistakeDetailDraftPanel.kt:233)"

    .line 161
    .line 162
    invoke-static {v2, v13, v4, v9}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 163
    .line 164
    .line 165
    :cond_b
    sget-object v15, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 166
    .line 167
    sget v2, Lcom/zykj/mistake/feature/notebook/detail/t4;->q:F

    .line 168
    .line 169
    invoke-static {v15, v2}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    sget-object v9, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 174
    .line 175
    move/from16 v16, v13

    .line 176
    .line 177
    invoke-virtual {v9}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 178
    .line 179
    .line 180
    move-result-wide v12

    .line 181
    int-to-float v5, v5

    .line 182
    invoke-static {v5, v4, v12, v13}, Landroidx/compose/material3/c;->f(FLandroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    sget-object v21, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 191
    .line 192
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v9

    .line 196
    if-ne v5, v9, :cond_c

    .line 197
    .line 198
    new-instance v5, Lcom/zykj/mistake/feature/collection/component/j;

    .line 199
    .line 200
    const/16 v9, 0xd

    .line 201
    .line 202
    invoke-direct {v5, v9}, Lcom/zykj/mistake/feature/collection/component/j;-><init>(I)V

    .line 203
    .line 204
    .line 205
    invoke-interface {v7, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    :cond_c
    check-cast v5, Lr6/c;

    .line 209
    .line 210
    invoke-static {v4, v5}, Landroidx/compose/ui/draw/DrawModifierKt;->drawBehind(Landroidx/compose/ui/Modifier;Lr6/c;)Landroidx/compose/ui/Modifier;

    .line 211
    .line 212
    .line 213
    move-result-object v4

    .line 214
    int-to-float v5, v6

    .line 215
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 216
    .line 217
    .line 218
    move-result v5

    .line 219
    const/4 v9, 0x0

    .line 220
    const/4 v12, 0x0

    .line 221
    invoke-static {v4, v5, v9, v6, v12}, Landroidx/compose/foundation/layout/PaddingKt;->padding-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 222
    .line 223
    .line 224
    move-result-object v4

    .line 225
    sget-object v5, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 226
    .line 227
    invoke-virtual {v5}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 228
    .line 229
    .line 230
    move-result-object v5

    .line 231
    sget-object v6, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 232
    .line 233
    invoke-virtual {v6}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 234
    .line 235
    .line 236
    move-result-object v6

    .line 237
    const/16 v9, 0x30

    .line 238
    .line 239
    invoke-static {v6, v5, v7, v9}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 240
    .line 241
    .line 242
    move-result-object v5

    .line 243
    invoke-static {v7, v14}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 244
    .line 245
    .line 246
    move-result v6

    .line 247
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 248
    .line 249
    .line 250
    move-result-object v9

    .line 251
    invoke-static {v7, v4}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 252
    .line 253
    .line 254
    move-result-object v4

    .line 255
    sget-object v12, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 256
    .line 257
    invoke-virtual {v12}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 258
    .line 259
    .line 260
    move-result-object v13

    .line 261
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 262
    .line 263
    .line 264
    move-result-object v17

    .line 265
    if-nez v17, :cond_d

    .line 266
    .line 267
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 268
    .line 269
    .line 270
    :cond_d
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 271
    .line 272
    .line 273
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 274
    .line 275
    .line 276
    move-result v17

    .line 277
    if-eqz v17, :cond_e

    .line 278
    .line 279
    invoke-interface {v7, v13}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 280
    .line 281
    .line 282
    goto :goto_8

    .line 283
    :cond_e
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 284
    .line 285
    .line 286
    :goto_8
    invoke-static {v7}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 287
    .line 288
    .line 289
    move-result-object v13

    .line 290
    invoke-static {v12, v13, v5, v13, v9}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 291
    .line 292
    .line 293
    move-result-object v5

    .line 294
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 295
    .line 296
    .line 297
    move-result v9

    .line 298
    if-nez v9, :cond_f

    .line 299
    .line 300
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v9

    .line 304
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 305
    .line 306
    .line 307
    move-result-object v14

    .line 308
    invoke-static {v9, v14}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    move-result v9

    .line 312
    if-nez v9, :cond_10

    .line 313
    .line 314
    :cond_f
    invoke-static {v6, v13, v6, v5}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 315
    .line 316
    .line 317
    :cond_10
    invoke-virtual {v12}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 318
    .line 319
    .line 320
    move-result-object v5

    .line 321
    invoke-static {v13, v4, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 322
    .line 323
    .line 324
    sget-object v4, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 325
    .line 326
    sget v4, Lcom/zykj/view/R$drawable;->view_selector_icon_evaluation_touch:I

    .line 327
    .line 328
    move v5, v4

    .line 329
    invoke-static {v15, v2}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 330
    .line 331
    .line 332
    move-result-object v4

    .line 333
    shl-int/lit8 v6, v16, 0x6

    .line 334
    .line 335
    and-int/lit16 v9, v6, 0x1c00

    .line 336
    .line 337
    or-int/lit16 v9, v9, 0x1b0

    .line 338
    .line 339
    const v22, 0xe000

    .line 340
    .line 341
    .line 342
    and-int v6, v6, v22

    .line 343
    .line 344
    or-int/2addr v6, v9

    .line 345
    const/4 v9, 0x0

    .line 346
    const-string v3, "\u624b\u5199\u5f00\u5173"

    .line 347
    .line 348
    move v12, v2

    .line 349
    move v2, v5

    .line 350
    move v5, v8

    .line 351
    move v8, v6

    .line 352
    move-object/from16 v6, p2

    .line 353
    .line 354
    invoke-static/range {v2 .. v9}, Lcom/zykj/mistake/feature/notebook/detail/g0;->h(ILjava/lang/String;Landroidx/compose/ui/Modifier;ZLr6/a;Landroidx/compose/runtime/Composer;II)V

    .line 355
    .line 356
    .line 357
    sget v2, Lcom/zykj/view/R$drawable;->view_selector_draw_select:I

    .line 358
    .line 359
    sget-object v3, Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;->SELECT:Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;

    .line 360
    .line 361
    if-ne v1, v3, :cond_11

    .line 362
    .line 363
    move/from16 v3, v20

    .line 364
    .line 365
    goto :goto_9

    .line 366
    :cond_11
    const/4 v3, 0x0

    .line 367
    :goto_9
    invoke-static {v15, v12}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 368
    .line 369
    .line 370
    move-result-object v14

    .line 371
    move/from16 v4, v16

    .line 372
    .line 373
    and-int/lit16 v5, v4, 0x1c00

    .line 374
    .line 375
    const/16 v6, 0x800

    .line 376
    .line 377
    if-ne v5, v6, :cond_12

    .line 378
    .line 379
    move/from16 v8, v20

    .line 380
    .line 381
    goto :goto_a

    .line 382
    :cond_12
    const/4 v8, 0x0

    .line 383
    :goto_a
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v9

    .line 387
    if-nez v8, :cond_13

    .line 388
    .line 389
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v8

    .line 393
    if-ne v9, v8, :cond_14

    .line 394
    .line 395
    :cond_13
    new-instance v9, Lcom/zykj/mistake/feature/collection/filter/u0;

    .line 396
    .line 397
    const/16 v8, 0x15

    .line 398
    .line 399
    invoke-direct {v9, v0, v8}, Lcom/zykj/mistake/feature/collection/filter/u0;-><init>(Lr6/c;I)V

    .line 400
    .line 401
    .line 402
    invoke-interface {v7, v9}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 403
    .line 404
    .line 405
    :cond_14
    move-object/from16 v16, v9

    .line 406
    .line 407
    check-cast v16, Lr6/a;

    .line 408
    .line 409
    const/16 v18, 0x1b0

    .line 410
    .line 411
    const/16 v19, 0x0

    .line 412
    .line 413
    const-string v13, "\u9009\u62e9"

    .line 414
    .line 415
    move-object/from16 v17, v15

    .line 416
    .line 417
    move v15, v3

    .line 418
    move-object/from16 v3, v17

    .line 419
    .line 420
    move-object/from16 v17, v7

    .line 421
    .line 422
    move v7, v6

    .line 423
    move v6, v12

    .line 424
    move v12, v2

    .line 425
    const/4 v2, 0x0

    .line 426
    invoke-static/range {v12 .. v19}, Lcom/zykj/mistake/feature/notebook/detail/g0;->h(ILjava/lang/String;Landroidx/compose/ui/Modifier;ZLr6/a;Landroidx/compose/runtime/Composer;II)V

    .line 427
    .line 428
    .line 429
    move-object/from16 v8, v17

    .line 430
    .line 431
    sget v12, Lcom/zykj/view/R$drawable;->view_selector_icon_evaluation_pen:I

    .line 432
    .line 433
    sget-object v9, Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;->PEN:Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;

    .line 434
    .line 435
    if-ne v1, v9, :cond_15

    .line 436
    .line 437
    move/from16 v15, v20

    .line 438
    .line 439
    goto :goto_b

    .line 440
    :cond_15
    move v15, v2

    .line 441
    :goto_b
    invoke-static {v3, v6}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 442
    .line 443
    .line 444
    move-result-object v14

    .line 445
    if-ne v5, v7, :cond_16

    .line 446
    .line 447
    move/from16 v9, v20

    .line 448
    .line 449
    goto :goto_c

    .line 450
    :cond_16
    move v9, v2

    .line 451
    :goto_c
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v13

    .line 455
    if-nez v9, :cond_17

    .line 456
    .line 457
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v9

    .line 461
    if-ne v13, v9, :cond_18

    .line 462
    .line 463
    :cond_17
    new-instance v13, Lcom/zykj/mistake/feature/collection/filter/u0;

    .line 464
    .line 465
    const/16 v9, 0x16

    .line 466
    .line 467
    invoke-direct {v13, v0, v9}, Lcom/zykj/mistake/feature/collection/filter/u0;-><init>(Lr6/c;I)V

    .line 468
    .line 469
    .line 470
    invoke-interface {v8, v13}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 471
    .line 472
    .line 473
    :cond_18
    move-object/from16 v16, v13

    .line 474
    .line 475
    check-cast v16, Lr6/a;

    .line 476
    .line 477
    const/16 v18, 0x1b0

    .line 478
    .line 479
    const/16 v19, 0x0

    .line 480
    .line 481
    const-string v13, "\u7b14"

    .line 482
    .line 483
    move-object/from16 v17, v8

    .line 484
    .line 485
    invoke-static/range {v12 .. v19}, Lcom/zykj/mistake/feature/notebook/detail/g0;->h(ILjava/lang/String;Landroidx/compose/ui/Modifier;ZLr6/a;Landroidx/compose/runtime/Composer;II)V

    .line 486
    .line 487
    .line 488
    sget v12, Lcom/zykj/view/R$drawable;->view_selector_icon_evaluation_line:I

    .line 489
    .line 490
    sget-object v9, Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;->LINE:Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;

    .line 491
    .line 492
    if-ne v1, v9, :cond_19

    .line 493
    .line 494
    move/from16 v15, v20

    .line 495
    .line 496
    goto :goto_d

    .line 497
    :cond_19
    move v15, v2

    .line 498
    :goto_d
    invoke-static {v3, v6}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 499
    .line 500
    .line 501
    move-result-object v14

    .line 502
    if-ne v5, v7, :cond_1a

    .line 503
    .line 504
    move/from16 v9, v20

    .line 505
    .line 506
    goto :goto_e

    .line 507
    :cond_1a
    move v9, v2

    .line 508
    :goto_e
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v13

    .line 512
    if-nez v9, :cond_1b

    .line 513
    .line 514
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 515
    .line 516
    .line 517
    move-result-object v9

    .line 518
    if-ne v13, v9, :cond_1c

    .line 519
    .line 520
    :cond_1b
    new-instance v13, Lcom/zykj/mistake/feature/collection/filter/u0;

    .line 521
    .line 522
    const/16 v9, 0x17

    .line 523
    .line 524
    invoke-direct {v13, v0, v9}, Lcom/zykj/mistake/feature/collection/filter/u0;-><init>(Lr6/c;I)V

    .line 525
    .line 526
    .line 527
    invoke-interface {v8, v13}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 528
    .line 529
    .line 530
    :cond_1c
    move-object/from16 v16, v13

    .line 531
    .line 532
    check-cast v16, Lr6/a;

    .line 533
    .line 534
    const/16 v18, 0x1b0

    .line 535
    .line 536
    const/16 v19, 0x0

    .line 537
    .line 538
    const-string v13, "\u76f4\u7ebf"

    .line 539
    .line 540
    move-object/from16 v17, v8

    .line 541
    .line 542
    invoke-static/range {v12 .. v19}, Lcom/zykj/mistake/feature/notebook/detail/g0;->h(ILjava/lang/String;Landroidx/compose/ui/Modifier;ZLr6/a;Landroidx/compose/runtime/Composer;II)V

    .line 543
    .line 544
    .line 545
    sget v12, Lcom/zykj/view/R$drawable;->view_selector_icon_evaluation_dotline:I

    .line 546
    .line 547
    sget-object v9, Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;->DOTTED_LINE:Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;

    .line 548
    .line 549
    if-ne v1, v9, :cond_1d

    .line 550
    .line 551
    move/from16 v15, v20

    .line 552
    .line 553
    goto :goto_f

    .line 554
    :cond_1d
    move v15, v2

    .line 555
    :goto_f
    invoke-static {v3, v6}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 556
    .line 557
    .line 558
    move-result-object v14

    .line 559
    if-ne v5, v7, :cond_1e

    .line 560
    .line 561
    move/from16 v9, v20

    .line 562
    .line 563
    goto :goto_10

    .line 564
    :cond_1e
    move v9, v2

    .line 565
    :goto_10
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    move-result-object v13

    .line 569
    if-nez v9, :cond_1f

    .line 570
    .line 571
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object v9

    .line 575
    if-ne v13, v9, :cond_20

    .line 576
    .line 577
    :cond_1f
    new-instance v13, Lcom/zykj/mistake/feature/collection/filter/u0;

    .line 578
    .line 579
    const/16 v9, 0x18

    .line 580
    .line 581
    invoke-direct {v13, v0, v9}, Lcom/zykj/mistake/feature/collection/filter/u0;-><init>(Lr6/c;I)V

    .line 582
    .line 583
    .line 584
    invoke-interface {v8, v13}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 585
    .line 586
    .line 587
    :cond_20
    move-object/from16 v16, v13

    .line 588
    .line 589
    check-cast v16, Lr6/a;

    .line 590
    .line 591
    const/16 v18, 0x1b0

    .line 592
    .line 593
    const/16 v19, 0x0

    .line 594
    .line 595
    const-string v13, "\u865a\u7ebf"

    .line 596
    .line 597
    move-object/from16 v17, v8

    .line 598
    .line 599
    invoke-static/range {v12 .. v19}, Lcom/zykj/mistake/feature/notebook/detail/g0;->h(ILjava/lang/String;Landroidx/compose/ui/Modifier;ZLr6/a;Landroidx/compose/runtime/Composer;II)V

    .line 600
    .line 601
    .line 602
    sget v12, Lcom/zykj/view/R$drawable;->view_selector_icon_evaluation_eraser:I

    .line 603
    .line 604
    sget-object v9, Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;->ERASER:Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;

    .line 605
    .line 606
    if-ne v1, v9, :cond_21

    .line 607
    .line 608
    move/from16 v15, v20

    .line 609
    .line 610
    goto :goto_11

    .line 611
    :cond_21
    move v15, v2

    .line 612
    :goto_11
    invoke-static {v3, v6}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 613
    .line 614
    .line 615
    move-result-object v14

    .line 616
    if-ne v5, v7, :cond_22

    .line 617
    .line 618
    move/from16 v2, v20

    .line 619
    .line 620
    :cond_22
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 621
    .line 622
    .line 623
    move-result-object v5

    .line 624
    if-nez v2, :cond_23

    .line 625
    .line 626
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 627
    .line 628
    .line 629
    move-result-object v2

    .line 630
    if-ne v5, v2, :cond_24

    .line 631
    .line 632
    :cond_23
    new-instance v5, Lcom/zykj/mistake/feature/collection/filter/u0;

    .line 633
    .line 634
    const/16 v2, 0x19

    .line 635
    .line 636
    invoke-direct {v5, v0, v2}, Lcom/zykj/mistake/feature/collection/filter/u0;-><init>(Lr6/c;I)V

    .line 637
    .line 638
    .line 639
    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 640
    .line 641
    .line 642
    :cond_24
    move-object/from16 v16, v5

    .line 643
    .line 644
    check-cast v16, Lr6/a;

    .line 645
    .line 646
    const/16 v18, 0x1b0

    .line 647
    .line 648
    const/16 v19, 0x0

    .line 649
    .line 650
    const-string v13, "\u6a61\u76ae"

    .line 651
    .line 652
    move-object/from16 v17, v8

    .line 653
    .line 654
    invoke-static/range {v12 .. v19}, Lcom/zykj/mistake/feature/notebook/detail/g0;->h(ILjava/lang/String;Landroidx/compose/ui/Modifier;ZLr6/a;Landroidx/compose/runtime/Composer;II)V

    .line 655
    .line 656
    .line 657
    sget v2, Lcom/zykj/view/R$drawable;->view_selector_icon_evaluation_delete:I

    .line 658
    .line 659
    invoke-static {v3, v6}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 660
    .line 661
    .line 662
    move-result-object v3

    .line 663
    and-int v4, v4, v22

    .line 664
    .line 665
    or-int/lit16 v8, v4, 0x1b0

    .line 666
    .line 667
    const/16 v9, 0x8

    .line 668
    .line 669
    move-object v4, v3

    .line 670
    const-string v3, "\u6e05\u7a7a"

    .line 671
    .line 672
    const/4 v5, 0x0

    .line 673
    move-object v6, v10

    .line 674
    move-object/from16 v7, v17

    .line 675
    .line 676
    invoke-static/range {v2 .. v9}, Lcom/zykj/mistake/feature/notebook/detail/g0;->h(ILjava/lang/String;Landroidx/compose/ui/Modifier;ZLr6/a;Landroidx/compose/runtime/Composer;II)V

    .line 677
    .line 678
    .line 679
    invoke-interface/range {v17 .. v17}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 680
    .line 681
    .line 682
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 683
    .line 684
    .line 685
    move-result v2

    .line 686
    if-eqz v2, :cond_26

    .line 687
    .line 688
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 689
    .line 690
    .line 691
    goto :goto_12

    .line 692
    :cond_25
    move-object/from16 v17, v7

    .line 693
    .line 694
    invoke-interface/range {v17 .. v17}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 695
    .line 696
    .line 697
    :cond_26
    :goto_12
    invoke-interface/range {v17 .. v17}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 698
    .line 699
    .line 700
    move-result-object v7

    .line 701
    if-eqz v7, :cond_27

    .line 702
    .line 703
    new-instance v0, Lcom/zykj/mistake/feature/ask/g0;

    .line 704
    .line 705
    move/from16 v2, p1

    .line 706
    .line 707
    move-object/from16 v3, p2

    .line 708
    .line 709
    move-object/from16 v4, p3

    .line 710
    .line 711
    move-object/from16 v5, p4

    .line 712
    .line 713
    move v6, v11

    .line 714
    invoke-direct/range {v0 .. v6}, Lcom/zykj/mistake/feature/ask/g0;-><init>(Lcom/zykj/mistake/feature/notebook/detail/DraftActionMode;ZLr6/a;Lr6/c;Lr6/a;I)V

    .line 715
    .line 716
    .line 717
    invoke-interface {v7, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 718
    .line 719
    .line 720
    :cond_27
    return-void
.end method

.method public static final g(Lr6/a;Lr6/a;Landroidx/compose/runtime/Composer;I)V
    .locals 19

    .line 1
    move-object/from16 v4, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    move/from16 v9, p3

    .line 6
    .line 7
    const-string v0, "onZoomIn"

    .line 8
    .line 9
    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v0, "onZoomOut"

    .line 13
    .line 14
    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const v0, -0x6cdcfb1a

    .line 18
    .line 19
    .line 20
    move-object/from16 v1, p2

    .line 21
    .line 22
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    and-int/lit8 v1, v9, 0x6

    .line 27
    .line 28
    const/4 v2, 0x4

    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    move v1, v2

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v1, 0x2

    .line 40
    :goto_0
    or-int/2addr v1, v9

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move v1, v9

    .line 43
    :goto_1
    and-int/lit8 v3, v9, 0x30

    .line 44
    .line 45
    if-nez v3, :cond_3

    .line 46
    .line 47
    invoke-interface {v5, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_2

    .line 52
    .line 53
    const/16 v3, 0x20

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    const/16 v3, 0x10

    .line 57
    .line 58
    :goto_2
    or-int/2addr v1, v3

    .line 59
    :cond_3
    move v10, v1

    .line 60
    and-int/lit8 v1, v10, 0x13

    .line 61
    .line 62
    const/16 v3, 0x12

    .line 63
    .line 64
    const/4 v11, 0x0

    .line 65
    if-eq v1, v3, :cond_4

    .line 66
    .line 67
    const/4 v1, 0x1

    .line 68
    goto :goto_3

    .line 69
    :cond_4
    move v1, v11

    .line 70
    :goto_3
    and-int/lit8 v3, v10, 0x1

    .line 71
    .line 72
    invoke-interface {v5, v1, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    const/16 v12, 0xc

    .line 77
    .line 78
    if-eqz v1, :cond_13

    .line 79
    .line 80
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-eqz v1, :cond_5

    .line 85
    .line 86
    const/4 v1, -0x1

    .line 87
    const-string v3, "com.zykj.mistake.feature.notebook.detail.DraftZoomButtonGroup (MistakeDetailDraftPanel.kt:324)"

    .line 88
    .line 89
    invoke-static {v0, v10, v1, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 90
    .line 91
    .line 92
    :cond_5
    sget-object v13, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 93
    .line 94
    sget v14, Lcom/zykj/mistake/feature/notebook/detail/t4;->q:F

    .line 95
    .line 96
    invoke-static {v13, v14}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    sget-object v1, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 101
    .line 102
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 103
    .line 104
    .line 105
    move-result-wide v6

    .line 106
    int-to-float v1, v2

    .line 107
    invoke-static {v1, v0, v6, v7}, Landroidx/compose/material3/c;->f(FLandroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 116
    .line 117
    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    if-ne v1, v2, :cond_6

    .line 122
    .line 123
    new-instance v1, Lcom/zykj/mistake/feature/collection/component/j;

    .line 124
    .line 125
    invoke-direct {v1, v12}, Lcom/zykj/mistake/feature/collection/component/j;-><init>(I)V

    .line 126
    .line 127
    .line 128
    invoke-interface {v5, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    :cond_6
    check-cast v1, Lr6/c;

    .line 132
    .line 133
    invoke-static {v0, v1}, Landroidx/compose/ui/draw/DrawModifierKt;->drawBehind(Landroidx/compose/ui/Modifier;Lr6/c;)Landroidx/compose/ui/Modifier;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    sget-object v1, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 138
    .line 139
    invoke-virtual {v1}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    sget-object v15, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 144
    .line 145
    invoke-virtual {v15}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-static {v1, v2, v5, v11}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-static {v5, v11}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    invoke-static {v5, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    sget-object v6, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 166
    .line 167
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 168
    .line 169
    .line 170
    move-result-object v7

    .line 171
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 172
    .line 173
    .line 174
    move-result-object v16

    .line 175
    if-nez v16, :cond_7

    .line 176
    .line 177
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 178
    .line 179
    .line 180
    :cond_7
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 181
    .line 182
    .line 183
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 184
    .line 185
    .line 186
    move-result v16

    .line 187
    if-eqz v16, :cond_8

    .line 188
    .line 189
    invoke-interface {v5, v7}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 190
    .line 191
    .line 192
    goto :goto_4

    .line 193
    :cond_8
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 194
    .line 195
    .line 196
    :goto_4
    invoke-static {v5}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 197
    .line 198
    .line 199
    move-result-object v7

    .line 200
    invoke-static {v6, v7, v1, v7, v3}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 205
    .line 206
    .line 207
    move-result v3

    .line 208
    if-nez v3, :cond_9

    .line 209
    .line 210
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 215
    .line 216
    .line 217
    move-result-object v12

    .line 218
    invoke-static {v3, v12}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v3

    .line 222
    if-nez v3, :cond_a

    .line 223
    .line 224
    :cond_9
    invoke-static {v2, v7, v2, v1}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 225
    .line 226
    .line 227
    :cond_a
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    invoke-static {v7, v0, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 232
    .line 233
    .line 234
    sget-object v0, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 235
    .line 236
    invoke-static {v13, v14, v14}, Landroidx/compose/foundation/layout/SizeKt;->size-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    invoke-virtual {v15}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    invoke-static {v1, v11}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    invoke-static {v5, v11}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 249
    .line 250
    .line 251
    move-result v2

    .line 252
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 253
    .line 254
    .line 255
    move-result-object v3

    .line 256
    invoke-static {v5, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 261
    .line 262
    .line 263
    move-result-object v7

    .line 264
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 265
    .line 266
    .line 267
    move-result-object v12

    .line 268
    if-nez v12, :cond_b

    .line 269
    .line 270
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 271
    .line 272
    .line 273
    :cond_b
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 274
    .line 275
    .line 276
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 277
    .line 278
    .line 279
    move-result v12

    .line 280
    if-eqz v12, :cond_c

    .line 281
    .line 282
    invoke-interface {v5, v7}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 283
    .line 284
    .line 285
    goto :goto_5

    .line 286
    :cond_c
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 287
    .line 288
    .line 289
    :goto_5
    invoke-static {v5}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 290
    .line 291
    .line 292
    move-result-object v7

    .line 293
    invoke-static {v6, v7, v1, v7, v3}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 298
    .line 299
    .line 300
    move-result v3

    .line 301
    if-nez v3, :cond_d

    .line 302
    .line 303
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v3

    .line 307
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 308
    .line 309
    .line 310
    move-result-object v12

    .line 311
    invoke-static {v3, v12}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    move-result v3

    .line 315
    if-nez v3, :cond_e

    .line 316
    .line 317
    :cond_d
    invoke-static {v2, v7, v2, v1}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 318
    .line 319
    .line 320
    :cond_e
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 321
    .line 322
    .line 323
    move-result-object v1

    .line 324
    invoke-static {v7, v0, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 325
    .line 326
    .line 327
    sget-object v0, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 328
    .line 329
    sget v0, Lcom/zykj/view/R$drawable;->view_selector_draw_enlarge:I

    .line 330
    .line 331
    invoke-static {v13, v14, v14}, Landroidx/compose/foundation/layout/SizeKt;->size-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 332
    .line 333
    .line 334
    move-result-object v2

    .line 335
    shl-int/lit8 v1, v10, 0xc

    .line 336
    .line 337
    const v12, 0xe000

    .line 338
    .line 339
    .line 340
    and-int/2addr v1, v12

    .line 341
    or-int/lit16 v1, v1, 0x1b0

    .line 342
    .line 343
    const/16 v7, 0x8

    .line 344
    .line 345
    move-object v3, v6

    .line 346
    move v6, v1

    .line 347
    const-string v1, "\u653e\u5927"

    .line 348
    .line 349
    move-object/from16 v16, v3

    .line 350
    .line 351
    const/4 v3, 0x0

    .line 352
    move-object/from16 v17, v16

    .line 353
    .line 354
    invoke-static/range {v0 .. v7}, Lcom/zykj/mistake/feature/notebook/detail/g0;->h(ILjava/lang/String;Landroidx/compose/ui/Modifier;ZLr6/a;Landroidx/compose/runtime/Composer;II)V

    .line 355
    .line 356
    .line 357
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 358
    .line 359
    .line 360
    invoke-static {v13, v14, v14}, Landroidx/compose/foundation/layout/SizeKt;->size-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    invoke-virtual {v15}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 365
    .line 366
    .line 367
    move-result-object v1

    .line 368
    invoke-static {v1, v11}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 369
    .line 370
    .line 371
    move-result-object v1

    .line 372
    invoke-static {v5, v11}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 373
    .line 374
    .line 375
    move-result v2

    .line 376
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 377
    .line 378
    .line 379
    move-result-object v3

    .line 380
    invoke-static {v5, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 385
    .line 386
    .line 387
    move-result-object v4

    .line 388
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 389
    .line 390
    .line 391
    move-result-object v6

    .line 392
    if-nez v6, :cond_f

    .line 393
    .line 394
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 395
    .line 396
    .line 397
    :cond_f
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 398
    .line 399
    .line 400
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 401
    .line 402
    .line 403
    move-result v6

    .line 404
    if-eqz v6, :cond_10

    .line 405
    .line 406
    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 407
    .line 408
    .line 409
    goto :goto_6

    .line 410
    :cond_10
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 411
    .line 412
    .line 413
    :goto_6
    invoke-static {v5}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 414
    .line 415
    .line 416
    move-result-object v4

    .line 417
    move-object/from16 v6, v17

    .line 418
    .line 419
    invoke-static {v6, v4, v1, v4, v3}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 420
    .line 421
    .line 422
    move-result-object v1

    .line 423
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 424
    .line 425
    .line 426
    move-result v3

    .line 427
    if-nez v3, :cond_11

    .line 428
    .line 429
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v3

    .line 433
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 434
    .line 435
    .line 436
    move-result-object v7

    .line 437
    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 438
    .line 439
    .line 440
    move-result v3

    .line 441
    if-nez v3, :cond_12

    .line 442
    .line 443
    :cond_11
    invoke-static {v2, v4, v2, v1}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 444
    .line 445
    .line 446
    :cond_12
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 447
    .line 448
    .line 449
    move-result-object v1

    .line 450
    invoke-static {v4, v0, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 451
    .line 452
    .line 453
    sget v0, Lcom/zykj/view/R$drawable;->view_selector_draw_reduce:I

    .line 454
    .line 455
    invoke-static {v13, v14, v14}, Landroidx/compose/foundation/layout/SizeKt;->size-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 456
    .line 457
    .line 458
    move-result-object v2

    .line 459
    shl-int/lit8 v1, v10, 0x9

    .line 460
    .line 461
    and-int/2addr v1, v12

    .line 462
    or-int/lit16 v6, v1, 0x1b0

    .line 463
    .line 464
    const/16 v7, 0x8

    .line 465
    .line 466
    const-string v1, "\u7f29\u5c0f"

    .line 467
    .line 468
    const/4 v3, 0x0

    .line 469
    move-object v4, v8

    .line 470
    move-object/from16 v8, p0

    .line 471
    .line 472
    invoke-static/range {v0 .. v7}, Lcom/zykj/mistake/feature/notebook/detail/g0;->h(ILjava/lang/String;Landroidx/compose/ui/Modifier;ZLr6/a;Landroidx/compose/runtime/Composer;II)V

    .line 473
    .line 474
    .line 475
    invoke-static {v5}, Landroidx/collection/a;->D(Landroidx/compose/runtime/Composer;)Z

    .line 476
    .line 477
    .line 478
    move-result v0

    .line 479
    if-eqz v0, :cond_14

    .line 480
    .line 481
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 482
    .line 483
    .line 484
    goto :goto_7

    .line 485
    :cond_13
    move-object/from16 v18, v8

    .line 486
    .line 487
    move-object v8, v4

    .line 488
    move-object/from16 v4, v18

    .line 489
    .line 490
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 491
    .line 492
    .line 493
    :cond_14
    :goto_7
    invoke-interface {v5}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    if-eqz v0, :cond_15

    .line 498
    .line 499
    new-instance v1, Landroidx/navigation/compose/b;

    .line 500
    .line 501
    const/16 v2, 0xc

    .line 502
    .line 503
    invoke-direct {v1, v9, v2, v8, v4}, Landroidx/navigation/compose/b;-><init>(IILjava/lang/Object;Ljava/lang/Object;)V

    .line 504
    .line 505
    .line 506
    invoke-interface {v0, v1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 507
    .line 508
    .line 509
    :cond_15
    return-void
.end method

.method public static final h(ILjava/lang/String;Landroidx/compose/ui/Modifier;ZLr6/a;Landroidx/compose/runtime/Composer;II)V
    .locals 18

    .line 1
    move/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v5, p4

    .line 6
    .line 7
    move/from16 v6, p6

    .line 8
    .line 9
    const-string v0, "onClick"

    .line 10
    .line 11
    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const v0, 0x31fc71e4

    .line 15
    .line 16
    .line 17
    move-object/from16 v3, p5

    .line 18
    .line 19
    invoke-interface {v3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 20
    .line 21
    .line 22
    move-result-object v10

    .line 23
    and-int/lit8 v3, v6, 0x6

    .line 24
    .line 25
    const/4 v4, 0x4

    .line 26
    if-nez v3, :cond_1

    .line 27
    .line 28
    invoke-interface {v10, v1}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    move v3, v4

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v3, 0x2

    .line 37
    :goto_0
    or-int/2addr v3, v6

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move v3, v6

    .line 40
    :goto_1
    and-int/lit8 v7, v6, 0x30

    .line 41
    .line 42
    const/16 v8, 0x20

    .line 43
    .line 44
    if-nez v7, :cond_3

    .line 45
    .line 46
    invoke-interface {v10, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    if-eqz v7, :cond_2

    .line 51
    .line 52
    move v7, v8

    .line 53
    goto :goto_2

    .line 54
    :cond_2
    const/16 v7, 0x10

    .line 55
    .line 56
    :goto_2
    or-int/2addr v3, v7

    .line 57
    :cond_3
    and-int/lit16 v7, v6, 0x180

    .line 58
    .line 59
    if-nez v7, :cond_5

    .line 60
    .line 61
    move-object/from16 v7, p2

    .line 62
    .line 63
    invoke-interface {v10, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v9

    .line 67
    if-eqz v9, :cond_4

    .line 68
    .line 69
    const/16 v9, 0x100

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_4
    const/16 v9, 0x80

    .line 73
    .line 74
    :goto_3
    or-int/2addr v3, v9

    .line 75
    goto :goto_4

    .line 76
    :cond_5
    move-object/from16 v7, p2

    .line 77
    .line 78
    :goto_4
    and-int/lit8 v9, p7, 0x8

    .line 79
    .line 80
    const/16 v11, 0x800

    .line 81
    .line 82
    if-eqz v9, :cond_7

    .line 83
    .line 84
    or-int/lit16 v3, v3, 0xc00

    .line 85
    .line 86
    :cond_6
    move/from16 v12, p3

    .line 87
    .line 88
    goto :goto_6

    .line 89
    :cond_7
    and-int/lit16 v12, v6, 0xc00

    .line 90
    .line 91
    if-nez v12, :cond_6

    .line 92
    .line 93
    move/from16 v12, p3

    .line 94
    .line 95
    invoke-interface {v10, v12}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 96
    .line 97
    .line 98
    move-result v13

    .line 99
    if-eqz v13, :cond_8

    .line 100
    .line 101
    move v13, v11

    .line 102
    goto :goto_5

    .line 103
    :cond_8
    const/16 v13, 0x400

    .line 104
    .line 105
    :goto_5
    or-int/2addr v3, v13

    .line 106
    :goto_6
    and-int/lit16 v13, v6, 0x6000

    .line 107
    .line 108
    const/16 v14, 0x4000

    .line 109
    .line 110
    if-nez v13, :cond_a

    .line 111
    .line 112
    invoke-interface {v10, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v13

    .line 116
    if-eqz v13, :cond_9

    .line 117
    .line 118
    move v13, v14

    .line 119
    goto :goto_7

    .line 120
    :cond_9
    const/16 v13, 0x2000

    .line 121
    .line 122
    :goto_7
    or-int/2addr v3, v13

    .line 123
    :cond_a
    and-int/lit16 v13, v3, 0x2493

    .line 124
    .line 125
    const/16 v15, 0x2492

    .line 126
    .line 127
    const/16 v16, 0x0

    .line 128
    .line 129
    const/16 v17, 0x1

    .line 130
    .line 131
    if-eq v13, v15, :cond_b

    .line 132
    .line 133
    move/from16 v13, v17

    .line 134
    .line 135
    goto :goto_8

    .line 136
    :cond_b
    move/from16 v13, v16

    .line 137
    .line 138
    :goto_8
    and-int/lit8 v15, v3, 0x1

    .line 139
    .line 140
    invoke-interface {v10, v13, v15}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 141
    .line 142
    .line 143
    move-result v13

    .line 144
    if-eqz v13, :cond_19

    .line 145
    .line 146
    if-eqz v9, :cond_c

    .line 147
    .line 148
    move/from16 v13, v16

    .line 149
    .line 150
    goto :goto_9

    .line 151
    :cond_c
    move v13, v12

    .line 152
    :goto_9
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 153
    .line 154
    .line 155
    move-result v9

    .line 156
    if-eqz v9, :cond_d

    .line 157
    .line 158
    const/4 v9, -0x1

    .line 159
    const-string v12, "com.zykj.mistake.feature.notebook.detail.DrawableResourceButton (MistakeDetailDraftPanel.kt:377)"

    .line 160
    .line 161
    invoke-static {v0, v3, v9, v12}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 162
    .line 163
    .line 164
    :cond_d
    and-int/lit8 v0, v3, 0x70

    .line 165
    .line 166
    if-ne v0, v8, :cond_e

    .line 167
    .line 168
    move/from16 v9, v17

    .line 169
    .line 170
    goto :goto_a

    .line 171
    :cond_e
    move/from16 v9, v16

    .line 172
    .line 173
    :goto_a
    const v12, 0xe000

    .line 174
    .line 175
    .line 176
    and-int/2addr v12, v3

    .line 177
    if-ne v12, v14, :cond_f

    .line 178
    .line 179
    move/from16 v15, v17

    .line 180
    .line 181
    goto :goto_b

    .line 182
    :cond_f
    move/from16 v15, v16

    .line 183
    .line 184
    :goto_b
    or-int/2addr v9, v15

    .line 185
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v15

    .line 189
    if-nez v9, :cond_10

    .line 190
    .line 191
    sget-object v9, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 192
    .line 193
    invoke-virtual {v9}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v9

    .line 197
    if-ne v15, v9, :cond_11

    .line 198
    .line 199
    :cond_10
    new-instance v15, Landroidx/navigation/d;

    .line 200
    .line 201
    const/4 v9, 0x7

    .line 202
    invoke-direct {v15, v9, v2, v5}, Landroidx/navigation/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 203
    .line 204
    .line 205
    invoke-interface {v10, v15}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    :cond_11
    check-cast v15, Lr6/c;

    .line 209
    .line 210
    and-int/lit8 v9, v3, 0xe

    .line 211
    .line 212
    if-ne v9, v4, :cond_12

    .line 213
    .line 214
    move/from16 v4, v17

    .line 215
    .line 216
    goto :goto_c

    .line 217
    :cond_12
    move/from16 v4, v16

    .line 218
    .line 219
    :goto_c
    if-ne v0, v8, :cond_13

    .line 220
    .line 221
    move/from16 v0, v17

    .line 222
    .line 223
    goto :goto_d

    .line 224
    :cond_13
    move/from16 v0, v16

    .line 225
    .line 226
    :goto_d
    or-int/2addr v0, v4

    .line 227
    and-int/lit16 v4, v3, 0x1c00

    .line 228
    .line 229
    if-ne v4, v11, :cond_14

    .line 230
    .line 231
    move/from16 v4, v17

    .line 232
    .line 233
    goto :goto_e

    .line 234
    :cond_14
    move/from16 v4, v16

    .line 235
    .line 236
    :goto_e
    or-int/2addr v0, v4

    .line 237
    if-ne v12, v14, :cond_15

    .line 238
    .line 239
    move/from16 v16, v17

    .line 240
    .line 241
    :cond_15
    or-int v0, v0, v16

    .line 242
    .line 243
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v4

    .line 247
    if-nez v0, :cond_16

    .line 248
    .line 249
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 250
    .line 251
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    if-ne v4, v0, :cond_17

    .line 256
    .line 257
    :cond_16
    new-instance v4, Lcom/zykj/mistake/feature/notebook/detail/a0;

    .line 258
    .line 259
    invoke-direct {v4, v1, v2, v5, v13}, Lcom/zykj/mistake/feature/notebook/detail/a0;-><init>(ILjava/lang/String;Lr6/a;Z)V

    .line 260
    .line 261
    .line 262
    invoke-interface {v10, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    :cond_17
    move-object v9, v4

    .line 266
    check-cast v9, Lr6/c;

    .line 267
    .line 268
    shr-int/lit8 v0, v3, 0x3

    .line 269
    .line 270
    and-int/lit8 v11, v0, 0x70

    .line 271
    .line 272
    const/4 v12, 0x0

    .line 273
    move-object v8, v7

    .line 274
    move-object v7, v15

    .line 275
    invoke-static/range {v7 .. v12}, Landroidx/compose/ui/viewinterop/AndroidView_androidKt;->AndroidView(Lr6/c;Landroidx/compose/ui/Modifier;Lr6/c;Landroidx/compose/runtime/Composer;II)V

    .line 276
    .line 277
    .line 278
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 279
    .line 280
    .line 281
    move-result v0

    .line 282
    if-eqz v0, :cond_18

    .line 283
    .line 284
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 285
    .line 286
    .line 287
    :cond_18
    move v4, v13

    .line 288
    goto :goto_f

    .line 289
    :cond_19
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 290
    .line 291
    .line 292
    move v4, v12

    .line 293
    :goto_f
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 294
    .line 295
    .line 296
    move-result-object v9

    .line 297
    if-eqz v9, :cond_1a

    .line 298
    .line 299
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/b0;

    .line 300
    .line 301
    const/4 v8, 0x0

    .line 302
    move-object/from16 v3, p2

    .line 303
    .line 304
    move/from16 v7, p7

    .line 305
    .line 306
    invoke-direct/range {v0 .. v8}, Lcom/zykj/mistake/feature/notebook/detail/b0;-><init>(ILjava/lang/String;Landroidx/compose/ui/Modifier;ZLr6/a;III)V

    .line 307
    .line 308
    .line 309
    invoke-interface {v9, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 310
    .line 311
    .line 312
    :cond_1a
    return-void
.end method

.method public static final i(Lcom/zykj/mistake/feature/notebook/detail/m3;Lcom/zykj/mistake/feature/notebook/detail/a5;ZZLr6/e;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v5, p4

    .line 6
    .line 7
    move/from16 v7, p7

    .line 8
    .line 9
    const-string v0, "state"

    .line 10
    .line 11
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, v1, Lcom/zykj/mistake/feature/notebook/detail/m3;->e:Ljava/lang/String;

    .line 15
    .line 16
    iget v3, v1, Lcom/zykj/mistake/feature/notebook/detail/m3;->b:I

    .line 17
    .line 18
    const-string v4, "controller"

    .line 19
    .line 20
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const-string v4, "onStemSnapshotReady"

    .line 24
    .line 25
    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const v4, 0x97ee360

    .line 29
    .line 30
    .line 31
    move-object/from16 v6, p6

    .line 32
    .line 33
    invoke-interface {v6, v4}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 34
    .line 35
    .line 36
    move-result-object v8

    .line 37
    and-int/lit8 v6, v7, 0x6

    .line 38
    .line 39
    if-nez v6, :cond_1

    .line 40
    .line 41
    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    if-eqz v6, :cond_0

    .line 46
    .line 47
    const/4 v6, 0x4

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    const/4 v6, 0x2

    .line 50
    :goto_0
    or-int/2addr v6, v7

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    move v6, v7

    .line 53
    :goto_1
    and-int/lit8 v9, v7, 0x30

    .line 54
    .line 55
    if-nez v9, :cond_3

    .line 56
    .line 57
    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v9

    .line 61
    if-eqz v9, :cond_2

    .line 62
    .line 63
    const/16 v9, 0x20

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_2
    const/16 v9, 0x10

    .line 67
    .line 68
    :goto_2
    or-int/2addr v6, v9

    .line 69
    :cond_3
    and-int/lit16 v9, v7, 0x180

    .line 70
    .line 71
    const/16 v10, 0x100

    .line 72
    .line 73
    if-nez v9, :cond_5

    .line 74
    .line 75
    move/from16 v9, p2

    .line 76
    .line 77
    invoke-interface {v8, v9}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 78
    .line 79
    .line 80
    move-result v11

    .line 81
    if-eqz v11, :cond_4

    .line 82
    .line 83
    move v11, v10

    .line 84
    goto :goto_3

    .line 85
    :cond_4
    const/16 v11, 0x80

    .line 86
    .line 87
    :goto_3
    or-int/2addr v6, v11

    .line 88
    goto :goto_4

    .line 89
    :cond_5
    move/from16 v9, p2

    .line 90
    .line 91
    :goto_4
    and-int/lit16 v11, v7, 0xc00

    .line 92
    .line 93
    if-nez v11, :cond_7

    .line 94
    .line 95
    move/from16 v11, p3

    .line 96
    .line 97
    invoke-interface {v8, v11}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 98
    .line 99
    .line 100
    move-result v13

    .line 101
    if-eqz v13, :cond_6

    .line 102
    .line 103
    const/16 v13, 0x800

    .line 104
    .line 105
    goto :goto_5

    .line 106
    :cond_6
    const/16 v13, 0x400

    .line 107
    .line 108
    :goto_5
    or-int/2addr v6, v13

    .line 109
    goto :goto_6

    .line 110
    :cond_7
    move/from16 v11, p3

    .line 111
    .line 112
    :goto_6
    and-int/lit16 v13, v7, 0x6000

    .line 113
    .line 114
    if-nez v13, :cond_9

    .line 115
    .line 116
    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v13

    .line 120
    if-eqz v13, :cond_8

    .line 121
    .line 122
    const/16 v13, 0x4000

    .line 123
    .line 124
    goto :goto_7

    .line 125
    :cond_8
    const/16 v13, 0x2000

    .line 126
    .line 127
    :goto_7
    or-int/2addr v6, v13

    .line 128
    :cond_9
    const/high16 v13, 0x30000

    .line 129
    .line 130
    and-int/2addr v13, v7

    .line 131
    move-object/from16 v15, p5

    .line 132
    .line 133
    if-nez v13, :cond_b

    .line 134
    .line 135
    invoke-interface {v8, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v13

    .line 139
    if-eqz v13, :cond_a

    .line 140
    .line 141
    const/high16 v13, 0x20000

    .line 142
    .line 143
    goto :goto_8

    .line 144
    :cond_a
    const/high16 v13, 0x10000

    .line 145
    .line 146
    :goto_8
    or-int/2addr v6, v13

    .line 147
    :cond_b
    const v13, 0x12493

    .line 148
    .line 149
    .line 150
    and-int/2addr v13, v6

    .line 151
    const v14, 0x12492

    .line 152
    .line 153
    .line 154
    const/16 v21, 0x1

    .line 155
    .line 156
    const/4 v12, 0x0

    .line 157
    if-eq v13, v14, :cond_c

    .line 158
    .line 159
    move/from16 v13, v21

    .line 160
    .line 161
    goto :goto_9

    .line 162
    :cond_c
    move v13, v12

    .line 163
    :goto_9
    and-int/lit8 v14, v6, 0x1

    .line 164
    .line 165
    invoke-interface {v8, v13, v14}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 166
    .line 167
    .line 168
    move-result v13

    .line 169
    if-eqz v13, :cond_23

    .line 170
    .line 171
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 172
    .line 173
    .line 174
    move-result v13

    .line 175
    if-eqz v13, :cond_d

    .line 176
    .line 177
    const/4 v13, -0x1

    .line 178
    const-string v14, "com.zykj.mistake.feature.notebook.detail.MistakeDraftSketchView (MistakeDetailDraftPanel.kt:407)"

    .line 179
    .line 180
    invoke-static {v4, v6, v13, v14}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 181
    .line 182
    .line 183
    :cond_d
    invoke-static {}, Landroidx/compose/ui/platform/InspectionModeKt;->getLocalInspectionMode()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    check-cast v4, Ljava/lang/Boolean;

    .line 192
    .line 193
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 194
    .line 195
    .line 196
    move-result v4

    .line 197
    if-eqz v4, :cond_f

    .line 198
    .line 199
    const v0, 0x5232ad3

    .line 200
    .line 201
    .line 202
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 203
    .line 204
    .line 205
    sget-object v0, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 206
    .line 207
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 208
    .line 209
    .line 210
    move-result-wide v16

    .line 211
    const/16 v19, 0x2

    .line 212
    .line 213
    const/16 v20, 0x0

    .line 214
    .line 215
    const/16 v18, 0x0

    .line 216
    .line 217
    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    invoke-static {v0, v8, v12}, Landroidx/compose/foundation/layout/BoxKt;->Box(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 222
    .line 223
    .line 224
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 225
    .line 226
    .line 227
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    if-eqz v0, :cond_e

    .line 232
    .line 233
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 234
    .line 235
    .line 236
    :cond_e
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 237
    .line 238
    .line 239
    move-result-object v10

    .line 240
    if-eqz v10, :cond_25

    .line 241
    .line 242
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/u;

    .line 243
    .line 244
    const/4 v8, 0x0

    .line 245
    move-object/from16 v6, p5

    .line 246
    .line 247
    move v3, v9

    .line 248
    move v4, v11

    .line 249
    invoke-direct/range {v0 .. v8}, Lcom/zykj/mistake/feature/notebook/detail/u;-><init>(Lcom/zykj/mistake/feature/notebook/detail/m3;Lcom/zykj/mistake/feature/notebook/detail/a5;ZZLr6/e;Landroidx/compose/ui/Modifier;II)V

    .line 250
    .line 251
    .line 252
    invoke-interface {v10, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 253
    .line 254
    .line 255
    return-void

    .line 256
    :cond_f
    const v4, 0x43ef962

    .line 257
    .line 258
    .line 259
    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 260
    .line 261
    .line 262
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 263
    .line 264
    .line 265
    iget-object v4, v1, Lcom/zykj/mistake/feature/notebook/detail/m3;->J:Lcom/zykj/mistake/feature/notebook/detail/q0;

    .line 266
    .line 267
    invoke-static {v1}, Lcom/zykj/mistake/feature/notebook/detail/g0;->k(Lcom/zykj/mistake/feature/notebook/detail/m3;)Z

    .line 268
    .line 269
    .line 270
    move-result v5

    .line 271
    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 272
    .line 273
    .line 274
    move-result v5

    .line 275
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v7

    .line 279
    or-int/2addr v5, v7

    .line 280
    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 281
    .line 282
    .line 283
    move-result v7

    .line 284
    or-int/2addr v5, v7

    .line 285
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v7

    .line 289
    if-nez v5, :cond_10

    .line 290
    .line 291
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 292
    .line 293
    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v5

    .line 297
    if-ne v7, v5, :cond_13

    .line 298
    .line 299
    :cond_10
    invoke-static {v1}, Lcom/zykj/mistake/feature/notebook/detail/g0;->k(Lcom/zykj/mistake/feature/notebook/detail/m3;)Z

    .line 300
    .line 301
    .line 302
    move-result v5

    .line 303
    if-eqz v5, :cond_12

    .line 304
    .line 305
    invoke-static {v0}, Lkotlin/text/p;->P(Ljava/lang/CharSequence;)Z

    .line 306
    .line 307
    .line 308
    move-result v5

    .line 309
    if-eqz v5, :cond_11

    .line 310
    .line 311
    const-string v0, "default"

    .line 312
    .line 313
    :cond_11
    sget-object v5, Lcom/zykj/mistake/utils/f;->a:Ljava/lang/String;

    .line 314
    .line 315
    new-instance v5, Ljava/lang/StringBuilder;

    .line 316
    .line 317
    const-string v7, "DrawBoardDraftData/practice_temp/"

    .line 318
    .line 319
    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 323
    .line 324
    .line 325
    const-string v0, "/"

    .line 326
    .line 327
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 328
    .line 329
    .line 330
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    invoke-static {v0}, Lcom/zykj/mistake/utils/f;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    :goto_a
    move-object v7, v0

    .line 342
    goto :goto_b

    .line 343
    :cond_12
    sget-object v0, Lcom/zykj/mistake/utils/f;->a:Ljava/lang/String;

    .line 344
    .line 345
    new-instance v0, Ljava/lang/StringBuilder;

    .line 346
    .line 347
    const-string v5, "DrawBoardDraftData/"

    .line 348
    .line 349
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    invoke-static {v0}, Lcom/zykj/mistake/utils/f;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    goto :goto_a

    .line 364
    :goto_b
    invoke-interface {v8, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 365
    .line 366
    .line 367
    :cond_13
    move-object v3, v7

    .line 368
    check-cast v3, Ljava/lang/String;

    .line 369
    .line 370
    invoke-static {v1}, Lcom/zykj/mistake/feature/notebook/detail/g0;->k(Lcom/zykj/mistake/feature/notebook/detail/m3;)Z

    .line 371
    .line 372
    .line 373
    move-result v0

    .line 374
    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 375
    .line 376
    .line 377
    move-result v5

    .line 378
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 379
    .line 380
    .line 381
    move-result v7

    .line 382
    or-int/2addr v5, v7

    .line 383
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v7

    .line 387
    if-nez v5, :cond_14

    .line 388
    .line 389
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 390
    .line 391
    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v5

    .line 395
    if-ne v7, v5, :cond_15

    .line 396
    .line 397
    :cond_14
    new-instance v7, Lcom/zykj/mistake/feature/notebook/detail/v;

    .line 398
    .line 399
    invoke-direct {v7, v2, v0, v12}, Lcom/zykj/mistake/feature/notebook/detail/v;-><init>(Ljava/lang/Object;ZI)V

    .line 400
    .line 401
    .line 402
    invoke-interface {v8, v7}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 403
    .line 404
    .line 405
    :cond_15
    check-cast v7, Lr6/c;

    .line 406
    .line 407
    invoke-static {v3, v7, v8, v12}, Landroidx/compose/runtime/EffectsKt;->DisposableEffect(Ljava/lang/Object;Lr6/c;Landroidx/compose/runtime/Composer;I)V

    .line 408
    .line 409
    .line 410
    sget-object v0, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 411
    .line 412
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 413
    .line 414
    .line 415
    move-result-wide v16

    .line 416
    const/16 v19, 0x2

    .line 417
    .line 418
    const/16 v20, 0x0

    .line 419
    .line 420
    const/16 v18, 0x0

    .line 421
    .line 422
    move-object/from16 v15, p5

    .line 423
    .line 424
    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    sget-object v5, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 429
    .line 430
    invoke-virtual {v5}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 431
    .line 432
    .line 433
    move-result-object v5

    .line 434
    invoke-static {v5, v12}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 435
    .line 436
    .line 437
    move-result-object v5

    .line 438
    invoke-static {v8, v12}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 439
    .line 440
    .line 441
    move-result v7

    .line 442
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 443
    .line 444
    .line 445
    move-result-object v9

    .line 446
    invoke-static {v8, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    sget-object v11, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 451
    .line 452
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 453
    .line 454
    .line 455
    move-result-object v13

    .line 456
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 457
    .line 458
    .line 459
    move-result-object v14

    .line 460
    if-nez v14, :cond_16

    .line 461
    .line 462
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 463
    .line 464
    .line 465
    :cond_16
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 466
    .line 467
    .line 468
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 469
    .line 470
    .line 471
    move-result v14

    .line 472
    if-eqz v14, :cond_17

    .line 473
    .line 474
    invoke-interface {v8, v13}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 475
    .line 476
    .line 477
    goto :goto_c

    .line 478
    :cond_17
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 479
    .line 480
    .line 481
    :goto_c
    invoke-static {v8}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 482
    .line 483
    .line 484
    move-result-object v13

    .line 485
    invoke-static {v11, v13, v5, v13, v9}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 486
    .line 487
    .line 488
    move-result-object v5

    .line 489
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 490
    .line 491
    .line 492
    move-result v9

    .line 493
    if-nez v9, :cond_18

    .line 494
    .line 495
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object v9

    .line 499
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 500
    .line 501
    .line 502
    move-result-object v14

    .line 503
    invoke-static {v9, v14}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 504
    .line 505
    .line 506
    move-result v9

    .line 507
    if-nez v9, :cond_19

    .line 508
    .line 509
    :cond_18
    invoke-static {v7, v13, v7, v5}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 510
    .line 511
    .line 512
    :cond_19
    invoke-virtual {v11}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 513
    .line 514
    .line 515
    move-result-object v5

    .line 516
    invoke-static {v13, v0, v5}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 517
    .line 518
    .line 519
    sget-object v11, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 520
    .line 521
    const v0, -0x16fb3abd

    .line 522
    .line 523
    .line 524
    invoke-interface {v8, v0, v3}, Landroidx/compose/runtime/Composer;->startMovableGroup(ILjava/lang/Object;)V

    .line 525
    .line 526
    .line 527
    sget-object v13, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 528
    .line 529
    invoke-interface {v11, v13}, Landroidx/compose/foundation/layout/BoxScope;->matchParentSize(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 530
    .line 531
    .line 532
    move-result-object v9

    .line 533
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v0

    .line 537
    sget-object v14, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 538
    .line 539
    invoke-virtual {v14}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 540
    .line 541
    .line 542
    move-result-object v5

    .line 543
    if-ne v0, v5, :cond_1a

    .line 544
    .line 545
    new-instance v0, Lcom/zykj/mistake/feature/collection/component/j;

    .line 546
    .line 547
    const/16 v5, 0xa

    .line 548
    .line 549
    invoke-direct {v0, v5}, Lcom/zykj/mistake/feature/collection/component/j;-><init>(I)V

    .line 550
    .line 551
    .line 552
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 553
    .line 554
    .line 555
    :cond_1a
    move-object v15, v0

    .line 556
    check-cast v15, Lr6/c;

    .line 557
    .line 558
    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 559
    .line 560
    .line 561
    move-result v0

    .line 562
    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 563
    .line 564
    .line 565
    move-result v5

    .line 566
    or-int/2addr v0, v5

    .line 567
    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 568
    .line 569
    .line 570
    move-result v5

    .line 571
    or-int/2addr v0, v5

    .line 572
    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 573
    .line 574
    .line 575
    move-result v5

    .line 576
    or-int/2addr v0, v5

    .line 577
    and-int/lit16 v5, v6, 0x380

    .line 578
    .line 579
    if-ne v5, v10, :cond_1b

    .line 580
    .line 581
    move/from16 v5, v21

    .line 582
    .line 583
    goto :goto_d

    .line 584
    :cond_1b
    move v5, v12

    .line 585
    :goto_d
    or-int/2addr v0, v5

    .line 586
    and-int/lit16 v5, v6, 0x1c00

    .line 587
    .line 588
    const/16 v7, 0x800

    .line 589
    .line 590
    if-ne v5, v7, :cond_1c

    .line 591
    .line 592
    move/from16 v5, v21

    .line 593
    .line 594
    goto :goto_e

    .line 595
    :cond_1c
    move v5, v12

    .line 596
    :goto_e
    or-int/2addr v0, v5

    .line 597
    const v5, 0xe000

    .line 598
    .line 599
    .line 600
    and-int/2addr v5, v6

    .line 601
    const/16 v6, 0x4000

    .line 602
    .line 603
    if-ne v5, v6, :cond_1d

    .line 604
    .line 605
    goto :goto_f

    .line 606
    :cond_1d
    move/from16 v21, v12

    .line 607
    .line 608
    :goto_f
    or-int v0, v0, v21

    .line 609
    .line 610
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 611
    .line 612
    .line 613
    move-result-object v5

    .line 614
    if-nez v0, :cond_1e

    .line 615
    .line 616
    invoke-virtual {v14}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 617
    .line 618
    .line 619
    move-result-object v0

    .line 620
    if-ne v5, v0, :cond_1f

    .line 621
    .line 622
    :cond_1e
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/w;

    .line 623
    .line 624
    move-object v5, v2

    .line 625
    move-object v2, v1

    .line 626
    move-object v1, v5

    .line 627
    move/from16 v5, p2

    .line 628
    .line 629
    move/from16 v6, p3

    .line 630
    .line 631
    move-object/from16 v7, p4

    .line 632
    .line 633
    invoke-direct/range {v0 .. v7}, Lcom/zykj/mistake/feature/notebook/detail/w;-><init>(Lcom/zykj/mistake/feature/notebook/detail/a5;Lcom/zykj/mistake/feature/notebook/detail/m3;Ljava/lang/String;Lcom/zykj/mistake/feature/notebook/detail/q0;ZZLr6/e;)V

    .line 634
    .line 635
    .line 636
    move-object v2, v1

    .line 637
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 638
    .line 639
    .line 640
    move-object v5, v0

    .line 641
    :cond_1f
    move-object v7, v5

    .line 642
    check-cast v7, Lr6/c;

    .line 643
    .line 644
    move-object v6, v9

    .line 645
    const/4 v9, 0x6

    .line 646
    const/4 v10, 0x0

    .line 647
    move-object v5, v15

    .line 648
    invoke-static/range {v5 .. v10}, Landroidx/compose/ui/viewinterop/AndroidView_androidKt;->AndroidView(Lr6/c;Landroidx/compose/ui/Modifier;Lr6/c;Landroidx/compose/runtime/Composer;II)V

    .line 649
    .line 650
    .line 651
    invoke-interface {v11, v13}, Landroidx/compose/foundation/layout/BoxScope;->matchParentSize(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 652
    .line 653
    .line 654
    move-result-object v6

    .line 655
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 656
    .line 657
    .line 658
    move-result-object v0

    .line 659
    invoke-virtual {v14}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 660
    .line 661
    .line 662
    move-result-object v1

    .line 663
    if-ne v0, v1, :cond_20

    .line 664
    .line 665
    new-instance v0, Lcom/zykj/mistake/feature/collection/component/j;

    .line 666
    .line 667
    const/16 v1, 0xb

    .line 668
    .line 669
    invoke-direct {v0, v1}, Lcom/zykj/mistake/feature/collection/component/j;-><init>(I)V

    .line 670
    .line 671
    .line 672
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 673
    .line 674
    .line 675
    :cond_20
    move-object v5, v0

    .line 676
    check-cast v5, Lr6/c;

    .line 677
    .line 678
    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 679
    .line 680
    .line 681
    move-result v0

    .line 682
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 683
    .line 684
    .line 685
    move-result-object v1

    .line 686
    if-nez v0, :cond_21

    .line 687
    .line 688
    invoke-virtual {v14}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 689
    .line 690
    .line 691
    move-result-object v0

    .line 692
    if-ne v1, v0, :cond_22

    .line 693
    .line 694
    :cond_21
    new-instance v1, Landroidx/navigation/i;

    .line 695
    .line 696
    const/4 v0, 0x7

    .line 697
    invoke-direct {v1, v2, v0}, Landroidx/navigation/i;-><init>(Ljava/lang/Object;I)V

    .line 698
    .line 699
    .line 700
    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 701
    .line 702
    .line 703
    :cond_22
    move-object v7, v1

    .line 704
    check-cast v7, Lr6/c;

    .line 705
    .line 706
    const/4 v9, 0x6

    .line 707
    const/4 v10, 0x0

    .line 708
    invoke-static/range {v5 .. v10}, Landroidx/compose/ui/viewinterop/AndroidView_androidKt;->AndroidView(Lr6/c;Landroidx/compose/ui/Modifier;Lr6/c;Landroidx/compose/runtime/Composer;II)V

    .line 709
    .line 710
    .line 711
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endMovableGroup()V

    .line 712
    .line 713
    .line 714
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 715
    .line 716
    .line 717
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 718
    .line 719
    .line 720
    move-result v0

    .line 721
    if-eqz v0, :cond_24

    .line 722
    .line 723
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 724
    .line 725
    .line 726
    goto :goto_10

    .line 727
    :cond_23
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 728
    .line 729
    .line 730
    :cond_24
    :goto_10
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 731
    .line 732
    .line 733
    move-result-object v9

    .line 734
    if-eqz v9, :cond_25

    .line 735
    .line 736
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/u;

    .line 737
    .line 738
    const/4 v8, 0x1

    .line 739
    move-object/from16 v1, p0

    .line 740
    .line 741
    move/from16 v3, p2

    .line 742
    .line 743
    move/from16 v4, p3

    .line 744
    .line 745
    move-object/from16 v5, p4

    .line 746
    .line 747
    move-object/from16 v6, p5

    .line 748
    .line 749
    move/from16 v7, p7

    .line 750
    .line 751
    invoke-direct/range {v0 .. v8}, Lcom/zykj/mistake/feature/notebook/detail/u;-><init>(Lcom/zykj/mistake/feature/notebook/detail/m3;Lcom/zykj/mistake/feature/notebook/detail/a5;ZZLr6/e;Landroidx/compose/ui/Modifier;II)V

    .line 752
    .line 753
    .line 754
    invoke-interface {v9, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 755
    .line 756
    .line 757
    :cond_25
    return-void
.end method

.method public static final j(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 9

    .line 1
    const v0, 0x3cbcc7e1

    .line 2
    .line 3
    .line 4
    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    or-int/lit8 v1, p2, 0x6

    .line 9
    .line 10
    and-int/lit8 v2, v1, 0x3

    .line 11
    .line 12
    const/4 v3, 0x2

    .line 13
    const/4 v4, 0x0

    .line 14
    if-eq v2, v3, :cond_0

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v2, v4

    .line 19
    :goto_0
    and-int/lit8 v3, v1, 0x1

    .line 20
    .line 21
    invoke-interface {p1, v2, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_6

    .line 26
    .line 27
    sget-object p0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 28
    .line 29
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    const/4 v2, -0x1

    .line 36
    const-string v3, "com.zykj.mistake.feature.notebook.detail.SectionDoubleDot (MistakeDetailDraftPanel.kt:1046)"

    .line 37
    .line 38
    invoke-static {v0, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    const/16 v0, 0xc

    .line 42
    .line 43
    int-to-float v0, v0

    .line 44
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    const/16 v1, 0x8

    .line 49
    .line 50
    int-to-float v1, v1

    .line 51
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    invoke-static {p0, v0, v1}, Landroidx/compose/foundation/layout/SizeKt;->size-VpY3zN4(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sget-object v1, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 60
    .line 61
    invoke-virtual {v1}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-static {v2, v4}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-static {p1, v4}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    invoke-static {p1, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    sget-object v6, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 82
    .line 83
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 88
    .line 89
    .line 90
    move-result-object v8

    .line 91
    if-nez v8, :cond_2

    .line 92
    .line 93
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 94
    .line 95
    .line 96
    :cond_2
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 97
    .line 98
    .line 99
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 100
    .line 101
    .line 102
    move-result v8

    .line 103
    if-eqz v8, :cond_3

    .line 104
    .line 105
    invoke-interface {p1, v7}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_3
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 110
    .line 111
    .line 112
    :goto_1
    invoke-static {p1}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 113
    .line 114
    .line 115
    move-result-object v7

    .line 116
    invoke-static {v6, v7, v2, v7, v5}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    if-nez v5, :cond_4

    .line 125
    .line 126
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 131
    .line 132
    .line 133
    move-result-object v8

    .line 134
    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v5

    .line 138
    if-nez v5, :cond_5

    .line 139
    .line 140
    :cond_4
    invoke-static {v3, v7, v3, v2}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 141
    .line 142
    .line 143
    :cond_5
    invoke-virtual {v6}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-static {v7, v0, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 148
    .line 149
    .line 150
    sget-object v0, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 151
    .line 152
    invoke-virtual {v1}, Landroidx/compose/ui/Alignment$Companion;->getCenterEnd()Landroidx/compose/ui/Alignment;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    invoke-interface {v0, p0, v2}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    const/4 v3, 0x7

    .line 161
    int-to-float v3, v3

    .line 162
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 163
    .line 164
    .line 165
    move-result v5

    .line 166
    invoke-static {v2, v5}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    sget-wide v5, Lcom/zykj/mistake/feature/notebook/detail/t4;->b:J

    .line 171
    .line 172
    const-wide/high16 v7, 0x400c000000000000L    # 3.5

    .line 173
    .line 174
    double-to-float v7, v7

    .line 175
    invoke-static {v7, v2, v5, v6}, Landroidx/compose/material3/c;->f(FLandroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    invoke-static {v2, p1, v4}, Landroidx/compose/foundation/layout/BoxKt;->Box(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v1}, Landroidx/compose/ui/Alignment$Companion;->getCenterStart()Landroidx/compose/ui/Alignment;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    invoke-interface {v0, p0, v1}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 191
    .line 192
    .line 193
    move-result v1

    .line 194
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    sget-wide v1, Lcom/zykj/mistake/feature/notebook/detail/t4;->a:J

    .line 199
    .line 200
    invoke-static {v7, v0, v1, v2}, Landroidx/compose/material3/c;->f(FLandroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-static {v0, p1, v4}, Landroidx/compose/foundation/layout/BoxKt;->Box(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 205
    .line 206
    .line 207
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 208
    .line 209
    .line 210
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    if-eqz v0, :cond_7

    .line 215
    .line 216
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 217
    .line 218
    .line 219
    goto :goto_2

    .line 220
    :cond_6
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 221
    .line 222
    .line 223
    :cond_7
    :goto_2
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    if-eqz p1, :cond_8

    .line 228
    .line 229
    new-instance v0, Lcom/zykj/mistake/feature/collection/filter/w0;

    .line 230
    .line 231
    const/4 v1, 0x2

    .line 232
    invoke-direct {v0, p0, p2, v1}, Lcom/zykj/mistake/feature/collection/filter/w0;-><init>(Landroidx/compose/ui/Modifier;II)V

    .line 233
    .line 234
    .line 235
    invoke-interface {p1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 236
    .line 237
    .line 238
    :cond_8
    return-void
.end method

.method public static final k(Lcom/zykj/mistake/feature/notebook/detail/m3;)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->z:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object p0, p0, Lcom/zykj/mistake/feature/notebook/detail/m3;->d:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;

    .line 6
    .line 7
    sget-object v0, Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;->REVIEW_RECOMMEND:Lcom/zykj/mistake/feature/notebook/detail/MistakeDetailNewContract$EntryMode;

    .line 8
    .line 9
    if-ne p0, v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0

    .line 14
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 15
    return p0
.end method
