.class public abstract Lcom/zykj/mistake/feature/review/y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0x34

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    sput v0, Lcom/zykj/mistake/feature/review/y;->a:F

    .line 9
    .line 10
    return-void
.end method

.method public static final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v4, p3

    .line 8
    .line 9
    move/from16 v5, p5

    .line 10
    .line 11
    const v0, -0x7bb5ca6a

    .line 12
    .line 13
    .line 14
    move-object/from16 v6, p4

    .line 15
    .line 16
    invoke-interface {v6, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 17
    .line 18
    .line 19
    move-result-object v10

    .line 20
    and-int/lit8 v6, v5, 0x6

    .line 21
    .line 22
    const/4 v7, 0x4

    .line 23
    if-nez v6, :cond_1

    .line 24
    .line 25
    invoke-interface {v10, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    if-eqz v6, :cond_0

    .line 30
    .line 31
    move v6, v7

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v6, 0x2

    .line 34
    :goto_0
    or-int/2addr v6, v5

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move v6, v5

    .line 37
    :goto_1
    and-int/lit8 v8, v5, 0x30

    .line 38
    .line 39
    if-nez v8, :cond_3

    .line 40
    .line 41
    invoke-interface {v10, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v8

    .line 45
    if-eqz v8, :cond_2

    .line 46
    .line 47
    const/16 v8, 0x20

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    const/16 v8, 0x10

    .line 51
    .line 52
    :goto_2
    or-int/2addr v6, v8

    .line 53
    :cond_3
    and-int/lit16 v8, v5, 0x180

    .line 54
    .line 55
    if-nez v8, :cond_5

    .line 56
    .line 57
    invoke-interface {v10, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v8

    .line 61
    if-eqz v8, :cond_4

    .line 62
    .line 63
    const/16 v8, 0x100

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_4
    const/16 v8, 0x80

    .line 67
    .line 68
    :goto_3
    or-int/2addr v6, v8

    .line 69
    :cond_5
    and-int/lit16 v8, v5, 0xc00

    .line 70
    .line 71
    if-nez v8, :cond_7

    .line 72
    .line 73
    invoke-interface {v10, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    if-eqz v8, :cond_6

    .line 78
    .line 79
    const/16 v8, 0x800

    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_6
    const/16 v8, 0x400

    .line 83
    .line 84
    :goto_4
    or-int/2addr v6, v8

    .line 85
    :cond_7
    and-int/lit16 v8, v6, 0x493

    .line 86
    .line 87
    const/16 v9, 0x492

    .line 88
    .line 89
    const/4 v11, 0x1

    .line 90
    if-eq v8, v9, :cond_8

    .line 91
    .line 92
    move v8, v11

    .line 93
    goto :goto_5

    .line 94
    :cond_8
    const/4 v8, 0x0

    .line 95
    :goto_5
    and-int/lit8 v9, v6, 0x1

    .line 96
    .line 97
    invoke-interface {v10, v8, v9}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 98
    .line 99
    .line 100
    move-result v8

    .line 101
    if-eqz v8, :cond_a

    .line 102
    .line 103
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 104
    .line 105
    .line 106
    move-result v8

    .line 107
    if-eqz v8, :cond_9

    .line 108
    .line 109
    const/4 v8, -0x1

    .line 110
    const-string v9, "com.zykj.mistake.feature.review.RecentMetricCell (ReviewScreen.kt:414)"

    .line 111
    .line 112
    invoke-static {v0, v6, v8, v9}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 113
    .line 114
    .line 115
    :cond_9
    int-to-float v0, v7

    .line 116
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    invoke-static {v0}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-static {v4, v0}, Landroidx/compose/ui/draw/ClipKt;->clip(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 125
    .line 126
    .line 127
    move-result-object v12

    .line 128
    sget-object v0, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 129
    .line 130
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 131
    .line 132
    .line 133
    move-result-wide v13

    .line 134
    const/16 v19, 0xe

    .line 135
    .line 136
    const/16 v20, 0x0

    .line 137
    .line 138
    const/high16 v15, 0x3f000000    # 0.5f

    .line 139
    .line 140
    const/16 v16, 0x0

    .line 141
    .line 142
    const/16 v17, 0x0

    .line 143
    .line 144
    const/16 v18, 0x0

    .line 145
    .line 146
    invoke-static/range {v13 .. v20}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    .line 147
    .line 148
    .line 149
    move-result-wide v13

    .line 150
    const/16 v16, 0x2

    .line 151
    .line 152
    const/16 v17, 0x0

    .line 153
    .line 154
    const/4 v15, 0x0

    .line 155
    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 156
    .line 157
    .line 158
    move-result-object v6

    .line 159
    sget-object v0, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 160
    .line 161
    invoke-virtual {v0}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 162
    .line 163
    .line 164
    move-result-object v7

    .line 165
    new-instance v0, Lcom/zykj/mistake/feature/review/x;

    .line 166
    .line 167
    const/4 v8, 0x0

    .line 168
    invoke-direct {v0, v8, v1, v2, v3}, Lcom/zykj/mistake/feature/review/x;-><init>(ILjava/io/Serializable;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    const/16 v8, 0x36

    .line 172
    .line 173
    const v9, -0x2ab2fa80

    .line 174
    .line 175
    .line 176
    invoke-static {v9, v11, v0, v10, v8}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 177
    .line 178
    .line 179
    move-result-object v9

    .line 180
    const/16 v11, 0xc30

    .line 181
    .line 182
    const/4 v12, 0x4

    .line 183
    const/4 v8, 0x0

    .line 184
    invoke-static/range {v6 .. v12}, Landroidx/compose/foundation/layout/BoxWithConstraintsKt;->BoxWithConstraints(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;ZLr6/f;Landroidx/compose/runtime/Composer;II)V

    .line 185
    .line 186
    .line 187
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    if-eqz v0, :cond_b

    .line 192
    .line 193
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 194
    .line 195
    .line 196
    goto :goto_6

    .line 197
    :cond_a
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 198
    .line 199
    .line 200
    :cond_b
    :goto_6
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 201
    .line 202
    .line 203
    move-result-object v7

    .line 204
    if-eqz v7, :cond_c

    .line 205
    .line 206
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/d0;

    .line 207
    .line 208
    const/4 v6, 0x2

    .line 209
    invoke-direct/range {v0 .. v6}, Lcom/zykj/mistake/feature/notebook/detail/d0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 210
    .line 211
    .line 212
    invoke-interface {v7, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 213
    .line 214
    .line 215
    :cond_c
    return-void
.end method

.method public static final b(Ljava/lang/Integer;IIIILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 64

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v6, p5

    .line 4
    .line 5
    move/from16 v7, p7

    .line 6
    .line 7
    const v0, -0xe63b20a

    .line 8
    .line 9
    .line 10
    move-object/from16 v2, p6

    .line 11
    .line 12
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v12

    .line 16
    and-int/lit8 v2, v7, 0x6

    .line 17
    .line 18
    if-nez v2, :cond_1

    .line 19
    .line 20
    invoke-interface {v12, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    const/4 v2, 0x4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v2, 0x2

    .line 29
    :goto_0
    or-int/2addr v2, v7

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move v2, v7

    .line 32
    :goto_1
    and-int/lit8 v4, v7, 0x30

    .line 33
    .line 34
    if-nez v4, :cond_3

    .line 35
    .line 36
    move/from16 v4, p1

    .line 37
    .line 38
    invoke-interface {v12, v4}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 39
    .line 40
    .line 41
    move-result v8

    .line 42
    if-eqz v8, :cond_2

    .line 43
    .line 44
    const/16 v8, 0x20

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/16 v8, 0x10

    .line 48
    .line 49
    :goto_2
    or-int/2addr v2, v8

    .line 50
    goto :goto_3

    .line 51
    :cond_3
    move/from16 v4, p1

    .line 52
    .line 53
    :goto_3
    and-int/lit16 v8, v7, 0x180

    .line 54
    .line 55
    if-nez v8, :cond_5

    .line 56
    .line 57
    move/from16 v8, p2

    .line 58
    .line 59
    invoke-interface {v12, v8}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 60
    .line 61
    .line 62
    move-result v9

    .line 63
    if-eqz v9, :cond_4

    .line 64
    .line 65
    const/16 v9, 0x100

    .line 66
    .line 67
    goto :goto_4

    .line 68
    :cond_4
    const/16 v9, 0x80

    .line 69
    .line 70
    :goto_4
    or-int/2addr v2, v9

    .line 71
    goto :goto_5

    .line 72
    :cond_5
    move/from16 v8, p2

    .line 73
    .line 74
    :goto_5
    and-int/lit16 v9, v7, 0xc00

    .line 75
    .line 76
    if-nez v9, :cond_7

    .line 77
    .line 78
    move/from16 v9, p3

    .line 79
    .line 80
    invoke-interface {v12, v9}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 81
    .line 82
    .line 83
    move-result v10

    .line 84
    if-eqz v10, :cond_6

    .line 85
    .line 86
    const/16 v10, 0x800

    .line 87
    .line 88
    goto :goto_6

    .line 89
    :cond_6
    const/16 v10, 0x400

    .line 90
    .line 91
    :goto_6
    or-int/2addr v2, v10

    .line 92
    goto :goto_7

    .line 93
    :cond_7
    move/from16 v9, p3

    .line 94
    .line 95
    :goto_7
    and-int/lit16 v10, v7, 0x6000

    .line 96
    .line 97
    if-nez v10, :cond_9

    .line 98
    .line 99
    move/from16 v10, p4

    .line 100
    .line 101
    invoke-interface {v12, v10}, Landroidx/compose/runtime/Composer;->changed(I)Z

    .line 102
    .line 103
    .line 104
    move-result v11

    .line 105
    if-eqz v11, :cond_8

    .line 106
    .line 107
    const/16 v11, 0x4000

    .line 108
    .line 109
    goto :goto_8

    .line 110
    :cond_8
    const/16 v11, 0x2000

    .line 111
    .line 112
    :goto_8
    or-int/2addr v2, v11

    .line 113
    goto :goto_9

    .line 114
    :cond_9
    move/from16 v10, p4

    .line 115
    .line 116
    :goto_9
    const/high16 v11, 0x30000

    .line 117
    .line 118
    and-int/2addr v11, v7

    .line 119
    if-nez v11, :cond_b

    .line 120
    .line 121
    invoke-interface {v12, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v11

    .line 125
    if-eqz v11, :cond_a

    .line 126
    .line 127
    const/high16 v11, 0x20000

    .line 128
    .line 129
    goto :goto_a

    .line 130
    :cond_a
    const/high16 v11, 0x10000

    .line 131
    .line 132
    :goto_a
    or-int/2addr v2, v11

    .line 133
    :cond_b
    const v11, 0x12493

    .line 134
    .line 135
    .line 136
    and-int/2addr v11, v2

    .line 137
    const v13, 0x12492

    .line 138
    .line 139
    .line 140
    const/4 v14, 0x1

    .line 141
    const/4 v15, 0x0

    .line 142
    if-eq v11, v13, :cond_c

    .line 143
    .line 144
    move v11, v14

    .line 145
    goto :goto_b

    .line 146
    :cond_c
    move v11, v15

    .line 147
    :goto_b
    and-int/lit8 v13, v2, 0x1

    .line 148
    .line 149
    invoke-interface {v12, v11, v13}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 150
    .line 151
    .line 152
    move-result v11

    .line 153
    if-eqz v11, :cond_28

    .line 154
    .line 155
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 156
    .line 157
    .line 158
    move-result v11

    .line 159
    if-eqz v11, :cond_d

    .line 160
    .line 161
    const/4 v11, -0x1

    .line 162
    const-string v13, "com.zykj.mistake.feature.review.RecentSevenDaysCard (ReviewScreen.kt:291)"

    .line 163
    .line 164
    invoke-static {v0, v2, v11, v13}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 165
    .line 166
    .line 167
    :cond_d
    const/4 v0, 0x0

    .line 168
    const/4 v2, 0x0

    .line 169
    invoke-static {v6, v0, v14, v2}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxHeight$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 170
    .line 171
    .line 172
    move-result-object v11

    .line 173
    const/16 v13, 0x8

    .line 174
    .line 175
    int-to-float v13, v13

    .line 176
    invoke-static {v13}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 177
    .line 178
    .line 179
    move-result v16

    .line 180
    invoke-static/range {v16 .. v16}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 181
    .line 182
    .line 183
    move-result-object v14

    .line 184
    invoke-static {v11, v14}, Landroidx/compose/ui/draw/ClipKt;->clip(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 185
    .line 186
    .line 187
    move-result-object v16

    .line 188
    sget-object v17, Landroidx/compose/ui/graphics/Brush;->Companion:Landroidx/compose/ui/graphics/Brush$Companion;

    .line 189
    .line 190
    const-wide v18, 0xffe8e6ffL

    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    invoke-static/range {v18 .. v19}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 196
    .line 197
    .line 198
    move-result-wide v18

    .line 199
    invoke-static/range {v18 .. v19}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 200
    .line 201
    .line 202
    move-result-object v11

    .line 203
    const-wide v18, 0xfffafafaL

    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    invoke-static/range {v18 .. v19}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 209
    .line 210
    .line 211
    move-result-wide v18

    .line 212
    invoke-static/range {v18 .. v19}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 213
    .line 214
    .line 215
    move-result-object v14

    .line 216
    filled-new-array {v11, v14}, [Landroidx/compose/ui/graphics/Color;

    .line 217
    .line 218
    .line 219
    move-result-object v11

    .line 220
    invoke-static {v11}, Lkotlin/collections/u;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 221
    .line 222
    .line 223
    move-result-object v18

    .line 224
    const/16 v22, 0xe

    .line 225
    .line 226
    const/16 v23, 0x0

    .line 227
    .line 228
    const/16 v19, 0x0

    .line 229
    .line 230
    const/16 v20, 0x0

    .line 231
    .line 232
    const/16 v21, 0x0

    .line 233
    .line 234
    invoke-static/range {v17 .. v23}, Landroidx/compose/ui/graphics/Brush$Companion;->verticalGradient-8A-3gB4$default(Landroidx/compose/ui/graphics/Brush$Companion;Ljava/util/List;FFIILjava/lang/Object;)Landroidx/compose/ui/graphics/Brush;

    .line 235
    .line 236
    .line 237
    move-result-object v17

    .line 238
    const/16 v20, 0x6

    .line 239
    .line 240
    const/16 v21, 0x0

    .line 241
    .line 242
    const/16 v18, 0x0

    .line 243
    .line 244
    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/BackgroundKt;->background$default(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 245
    .line 246
    .line 247
    move-result-object v11

    .line 248
    sget-object v34, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 249
    .line 250
    invoke-virtual/range {v34 .. v34}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 251
    .line 252
    .line 253
    move-result-object v14

    .line 254
    invoke-static {v14, v15}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 255
    .line 256
    .line 257
    move-result-object v14

    .line 258
    const/16 v18, 0x20

    .line 259
    .line 260
    invoke-static {v12, v15}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 261
    .line 262
    .line 263
    move-result v5

    .line 264
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    invoke-static {v12, v11}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 269
    .line 270
    .line 271
    move-result-object v11

    .line 272
    sget-object v9, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 273
    .line 274
    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 279
    .line 280
    .line 281
    move-result-object v16

    .line 282
    if-nez v16, :cond_e

    .line 283
    .line 284
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 285
    .line 286
    .line 287
    :cond_e
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 288
    .line 289
    .line 290
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 291
    .line 292
    .line 293
    move-result v16

    .line 294
    if-eqz v16, :cond_f

    .line 295
    .line 296
    invoke-interface {v12, v2}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 297
    .line 298
    .line 299
    goto :goto_c

    .line 300
    :cond_f
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 301
    .line 302
    .line 303
    :goto_c
    invoke-static {v12}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 304
    .line 305
    .line 306
    move-result-object v2

    .line 307
    invoke-static {v9, v2, v14, v2, v0}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 312
    .line 313
    .line 314
    move-result v14

    .line 315
    if-nez v14, :cond_10

    .line 316
    .line 317
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v14

    .line 321
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 322
    .line 323
    .line 324
    move-result-object v3

    .line 325
    invoke-static {v14, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result v3

    .line 329
    if-nez v3, :cond_11

    .line 330
    .line 331
    :cond_10
    invoke-static {v5, v2, v5, v0}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 332
    .line 333
    .line 334
    :cond_11
    invoke-virtual {v9}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    invoke-static {v2, v11, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 339
    .line 340
    .line 341
    sget-object v0, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 342
    .line 343
    sget v2, Lcom/zykj/mistake/R$drawable;->bg_seven_days_decoration:I

    .line 344
    .line 345
    invoke-static {v2, v12, v15}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 346
    .line 347
    .line 348
    move-result-object v2

    .line 349
    sget-object v3, Landroidx/compose/ui/layout/ContentScale;->Companion:Landroidx/compose/ui/layout/ContentScale$Companion;

    .line 350
    .line 351
    invoke-virtual {v3}, Landroidx/compose/ui/layout/ContentScale$Companion;->getFillBounds()Landroidx/compose/ui/layout/ContentScale;

    .line 352
    .line 353
    .line 354
    move-result-object v3

    .line 355
    sget-object v5, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 356
    .line 357
    invoke-virtual/range {v34 .. v34}, Landroidx/compose/ui/Alignment$Companion;->getBottomEnd()Landroidx/compose/ui/Alignment;

    .line 358
    .line 359
    .line 360
    move-result-object v11

    .line 361
    invoke-interface {v0, v5, v11}, Landroidx/compose/foundation/layout/BoxScope;->align(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;)Landroidx/compose/ui/Modifier;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    const v11, 0x3f65be5c

    .line 366
    .line 367
    .line 368
    invoke-static {v0, v11}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxHeight(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/painter/Painter;->getIntrinsicSize-NH-jbRc()J

    .line 373
    .line 374
    .line 375
    move-result-wide v19

    .line 376
    move-object v11, v2

    .line 377
    shr-long v1, v19, v18

    .line 378
    .line 379
    long-to-int v1, v1

    .line 380
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 381
    .line 382
    .line 383
    move-result v1

    .line 384
    invoke-virtual {v11}, Landroidx/compose/ui/graphics/painter/Painter;->getIntrinsicSize-NH-jbRc()J

    .line 385
    .line 386
    .line 387
    move-result-wide v19

    .line 388
    const-wide v21, 0xffffffffL

    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    move v14, v1

    .line 394
    and-long v1, v19, v21

    .line 395
    .line 396
    long-to-int v1, v1

    .line 397
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 398
    .line 399
    .line 400
    move-result v1

    .line 401
    div-float v1, v14, v1

    .line 402
    .line 403
    const/4 v2, 0x2

    .line 404
    const/4 v14, 0x0

    .line 405
    invoke-static {v0, v1, v15, v2, v14}, Landroidx/compose/foundation/layout/AspectRatioKt;->aspectRatio$default(Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    const/16 v16, 0x6030

    .line 410
    .line 411
    const/16 v17, 0x68

    .line 412
    .line 413
    move-object v1, v9

    .line 414
    const/4 v9, 0x0

    .line 415
    move-object v8, v11

    .line 416
    const/4 v11, 0x0

    .line 417
    move v2, v13

    .line 418
    const/4 v13, 0x0

    .line 419
    move-object/from16 v35, v14

    .line 420
    .line 421
    const/4 v14, 0x0

    .line 422
    move-object v10, v0

    .line 423
    move-object v15, v12

    .line 424
    const/4 v0, 0x1

    .line 425
    move-object v12, v3

    .line 426
    move-object/from16 v3, v35

    .line 427
    .line 428
    invoke-static/range {v8 .. v17}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 429
    .line 430
    .line 431
    move-object v12, v15

    .line 432
    const/4 v8, 0x0

    .line 433
    invoke-static {v5, v8, v0, v3}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 434
    .line 435
    .line 436
    move-result-object v9

    .line 437
    const/16 v3, 0x12

    .line 438
    .line 439
    int-to-float v8, v3

    .line 440
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 441
    .line 442
    .line 443
    move-result v8

    .line 444
    invoke-static {v9, v8}, Landroidx/compose/foundation/layout/PaddingKt;->padding-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 445
    .line 446
    .line 447
    move-result-object v8

    .line 448
    sget-object v9, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    .line 449
    .line 450
    invoke-virtual {v9}, Landroidx/compose/foundation/layout/Arrangement;->getTop()Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 451
    .line 452
    .line 453
    move-result-object v10

    .line 454
    invoke-virtual/range {v34 .. v34}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 455
    .line 456
    .line 457
    move-result-object v11

    .line 458
    const/4 v13, 0x0

    .line 459
    invoke-static {v10, v11, v12, v13}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 460
    .line 461
    .line 462
    move-result-object v10

    .line 463
    invoke-static {v12, v13}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 464
    .line 465
    .line 466
    move-result v11

    .line 467
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 468
    .line 469
    .line 470
    move-result-object v13

    .line 471
    invoke-static {v12, v8}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 472
    .line 473
    .line 474
    move-result-object v8

    .line 475
    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 476
    .line 477
    .line 478
    move-result-object v14

    .line 479
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 480
    .line 481
    .line 482
    move-result-object v15

    .line 483
    if-nez v15, :cond_12

    .line 484
    .line 485
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 486
    .line 487
    .line 488
    :cond_12
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 489
    .line 490
    .line 491
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 492
    .line 493
    .line 494
    move-result v15

    .line 495
    if-eqz v15, :cond_13

    .line 496
    .line 497
    invoke-interface {v12, v14}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 498
    .line 499
    .line 500
    goto :goto_d

    .line 501
    :cond_13
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 502
    .line 503
    .line 504
    :goto_d
    invoke-static {v12}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 505
    .line 506
    .line 507
    move-result-object v14

    .line 508
    invoke-static {v1, v14, v10, v14, v13}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 509
    .line 510
    .line 511
    move-result-object v10

    .line 512
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 513
    .line 514
    .line 515
    move-result v13

    .line 516
    if-nez v13, :cond_14

    .line 517
    .line 518
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object v13

    .line 522
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 523
    .line 524
    .line 525
    move-result-object v15

    .line 526
    invoke-static {v13, v15}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 527
    .line 528
    .line 529
    move-result v13

    .line 530
    if-nez v13, :cond_15

    .line 531
    .line 532
    :cond_14
    invoke-static {v11, v14, v11, v10}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 533
    .line 534
    .line 535
    :cond_15
    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 536
    .line 537
    .line 538
    move-result-object v10

    .line 539
    invoke-static {v14, v8, v10}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 540
    .line 541
    .line 542
    sget-object v36, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    .line 543
    .line 544
    invoke-virtual/range {v34 .. v34}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 545
    .line 546
    .line 547
    move-result-object v8

    .line 548
    invoke-virtual {v9}, Landroidx/compose/foundation/layout/Arrangement;->getStart()Landroidx/compose/foundation/layout/Arrangement$Horizontal;

    .line 549
    .line 550
    .line 551
    move-result-object v10

    .line 552
    const/16 v11, 0x30

    .line 553
    .line 554
    invoke-static {v10, v8, v12, v11}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 555
    .line 556
    .line 557
    move-result-object v8

    .line 558
    const/4 v13, 0x0

    .line 559
    invoke-static {v12, v13}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 560
    .line 561
    .line 562
    move-result v10

    .line 563
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 564
    .line 565
    .line 566
    move-result-object v11

    .line 567
    invoke-static {v12, v5}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 568
    .line 569
    .line 570
    move-result-object v13

    .line 571
    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 572
    .line 573
    .line 574
    move-result-object v14

    .line 575
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 576
    .line 577
    .line 578
    move-result-object v15

    .line 579
    if-nez v15, :cond_16

    .line 580
    .line 581
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 582
    .line 583
    .line 584
    :cond_16
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 585
    .line 586
    .line 587
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 588
    .line 589
    .line 590
    move-result v15

    .line 591
    if-eqz v15, :cond_17

    .line 592
    .line 593
    invoke-interface {v12, v14}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 594
    .line 595
    .line 596
    goto :goto_e

    .line 597
    :cond_17
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 598
    .line 599
    .line 600
    :goto_e
    invoke-static {v12}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 601
    .line 602
    .line 603
    move-result-object v14

    .line 604
    invoke-static {v1, v14, v8, v14, v11}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 605
    .line 606
    .line 607
    move-result-object v8

    .line 608
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 609
    .line 610
    .line 611
    move-result v11

    .line 612
    if-nez v11, :cond_18

    .line 613
    .line 614
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 615
    .line 616
    .line 617
    move-result-object v11

    .line 618
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 619
    .line 620
    .line 621
    move-result-object v15

    .line 622
    invoke-static {v11, v15}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 623
    .line 624
    .line 625
    move-result v11

    .line 626
    if-nez v11, :cond_19

    .line 627
    .line 628
    :cond_18
    invoke-static {v10, v14, v10, v8}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 629
    .line 630
    .line 631
    :cond_19
    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 632
    .line 633
    .line 634
    move-result-object v8

    .line 635
    invoke-static {v14, v13, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 636
    .line 637
    .line 638
    sget-object v37, Landroidx/compose/foundation/layout/RowScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/RowScopeInstance;

    .line 639
    .line 640
    sget v8, Lcom/zykj/mistake/R$drawable;->ic_recent_7_days:I

    .line 641
    .line 642
    const/4 v13, 0x0

    .line 643
    invoke-static {v8, v12, v13}, Landroidx/compose/ui/res/PainterResources_androidKt;->painterResource(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 644
    .line 645
    .line 646
    move-result-object v8

    .line 647
    move/from16 v10, v18

    .line 648
    .line 649
    int-to-float v10, v10

    .line 650
    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 651
    .line 652
    .line 653
    move-result v10

    .line 654
    invoke-static {v5, v10}, Landroidx/compose/foundation/layout/SizeKt;->size-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 655
    .line 656
    .line 657
    move-result-object v10

    .line 658
    const/16 v16, 0x1b0

    .line 659
    .line 660
    const/16 v17, 0x78

    .line 661
    .line 662
    move-object v11, v9

    .line 663
    const/4 v9, 0x0

    .line 664
    move-object v13, v11

    .line 665
    const/4 v11, 0x0

    .line 666
    move-object v15, v12

    .line 667
    const/4 v12, 0x0

    .line 668
    move-object v14, v13

    .line 669
    const/4 v13, 0x0

    .line 670
    move-object/from16 v18, v14

    .line 671
    .line 672
    const/4 v14, 0x0

    .line 673
    move/from16 v19, v3

    .line 674
    .line 675
    move-object/from16 v3, v18

    .line 676
    .line 677
    invoke-static/range {v8 .. v17}, Landroidx/compose/foundation/ImageKt;->Image(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Landroidx/compose/runtime/Composer;II)V

    .line 678
    .line 679
    .line 680
    move-object v12, v15

    .line 681
    const-wide v38, 0xff15171aL

    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    invoke-static/range {v38 .. v39}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 687
    .line 688
    .line 689
    move-result-wide v10

    .line 690
    invoke-static/range {v19 .. v19}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 691
    .line 692
    .line 693
    move-result-wide v8

    .line 694
    sget-object v33, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    .line 695
    .line 696
    invoke-virtual/range {v33 .. v33}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getBold()Landroidx/compose/ui/text/font/FontWeight;

    .line 697
    .line 698
    .line 699
    move-result-object v15

    .line 700
    const/16 v13, 0xe

    .line 701
    .line 702
    int-to-float v13, v13

    .line 703
    invoke-static {v13}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 704
    .line 705
    .line 706
    move-result v20

    .line 707
    const/16 v24, 0xe

    .line 708
    .line 709
    const/16 v25, 0x0

    .line 710
    .line 711
    const/16 v21, 0x0

    .line 712
    .line 713
    const/16 v22, 0x0

    .line 714
    .line 715
    const/16 v23, 0x0

    .line 716
    .line 717
    move-object/from16 v19, v5

    .line 718
    .line 719
    invoke-static/range {v19 .. v25}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 720
    .line 721
    .line 722
    move-result-object v5

    .line 723
    move-object/from16 v40, v19

    .line 724
    .line 725
    const/16 v31, 0x0

    .line 726
    .line 727
    const v32, 0x1ffd0

    .line 728
    .line 729
    .line 730
    move-object/from16 v29, v12

    .line 731
    .line 732
    move-wide v12, v8

    .line 733
    const-string v8, "\u8fd1\u4e03\u5929\u6570\u636e\u8868\u73b0"

    .line 734
    .line 735
    const/16 v16, 0x0

    .line 736
    .line 737
    const-wide/16 v17, 0x0

    .line 738
    .line 739
    const/16 v19, 0x0

    .line 740
    .line 741
    const/16 v20, 0x0

    .line 742
    .line 743
    const-wide/16 v21, 0x0

    .line 744
    .line 745
    const/16 v23, 0x0

    .line 746
    .line 747
    const/16 v24, 0x0

    .line 748
    .line 749
    const/16 v25, 0x0

    .line 750
    .line 751
    const/16 v26, 0x0

    .line 752
    .line 753
    const/16 v27, 0x0

    .line 754
    .line 755
    const/16 v28, 0x0

    .line 756
    .line 757
    const v30, 0x30db6

    .line 758
    .line 759
    .line 760
    move-object v9, v5

    .line 761
    invoke-static/range {v8 .. v32}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 762
    .line 763
    .line 764
    move-object/from16 v12, v29

    .line 765
    .line 766
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 767
    .line 768
    .line 769
    if-eqz p0, :cond_1a

    .line 770
    .line 771
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Integer;->intValue()I

    .line 772
    .line 773
    .line 774
    move-result v15

    .line 775
    goto :goto_f

    .line 776
    :cond_1a
    const/4 v15, 0x0

    .line 777
    :goto_f
    new-instance v5, Landroidx/compose/ui/text/AnnotatedString$Builder;

    .line 778
    .line 779
    const/4 v13, 0x0

    .line 780
    const/4 v14, 0x0

    .line 781
    invoke-direct {v5, v13, v0, v14}, Landroidx/compose/ui/text/AnnotatedString$Builder;-><init>(IILkotlin/jvm/internal/e;)V

    .line 782
    .line 783
    .line 784
    const-string v8, "\u6700\u8fd1\u6dfb\u52a0\u9519\u9898 "

    .line 785
    .line 786
    invoke-virtual {v5, v8}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V

    .line 787
    .line 788
    .line 789
    new-instance v41, Landroidx/compose/ui/text/SpanStyle;

    .line 790
    .line 791
    invoke-static/range {v38 .. v39}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 792
    .line 793
    .line 794
    move-result-wide v42

    .line 795
    invoke-virtual/range {v33 .. v33}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getSemiBold()Landroidx/compose/ui/text/font/FontWeight;

    .line 796
    .line 797
    .line 798
    move-result-object v46

    .line 799
    const v62, 0xfffa

    .line 800
    .line 801
    .line 802
    const/16 v63, 0x0

    .line 803
    .line 804
    const-wide/16 v44, 0x0

    .line 805
    .line 806
    const/16 v47, 0x0

    .line 807
    .line 808
    const/16 v48, 0x0

    .line 809
    .line 810
    const/16 v49, 0x0

    .line 811
    .line 812
    const/16 v50, 0x0

    .line 813
    .line 814
    const-wide/16 v51, 0x0

    .line 815
    .line 816
    const/16 v53, 0x0

    .line 817
    .line 818
    const/16 v54, 0x0

    .line 819
    .line 820
    const/16 v55, 0x0

    .line 821
    .line 822
    const-wide/16 v56, 0x0

    .line 823
    .line 824
    const/16 v58, 0x0

    .line 825
    .line 826
    const/16 v59, 0x0

    .line 827
    .line 828
    const/16 v60, 0x0

    .line 829
    .line 830
    const/16 v61, 0x0

    .line 831
    .line 832
    invoke-direct/range {v41 .. v63}, Landroidx/compose/ui/text/SpanStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/PlatformSpanStyle;Landroidx/compose/ui/graphics/drawscope/DrawStyle;ILkotlin/jvm/internal/e;)V

    .line 833
    .line 834
    .line 835
    move-object/from16 v8, v41

    .line 836
    .line 837
    invoke-virtual {v5, v8}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pushStyle(Landroidx/compose/ui/text/SpanStyle;)I

    .line 838
    .line 839
    .line 840
    move-result v8

    .line 841
    :try_start_0
    invoke-static {v15}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 842
    .line 843
    .line 844
    move-result-object v9

    .line 845
    invoke-virtual {v5, v9}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 846
    .line 847
    .line 848
    invoke-virtual {v5, v8}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pop(I)V

    .line 849
    .line 850
    .line 851
    const-string v8, " \u9053"

    .line 852
    .line 853
    invoke-virtual {v5, v8}, Landroidx/compose/ui/text/AnnotatedString$Builder;->append(Ljava/lang/String;)V

    .line 854
    .line 855
    .line 856
    invoke-virtual {v5}, Landroidx/compose/ui/text/AnnotatedString$Builder;->toAnnotatedString()Landroidx/compose/ui/text/AnnotatedString;

    .line 857
    .line 858
    .line 859
    move-result-object v8

    .line 860
    const-wide v9, 0xff666666L

    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    invoke-static {v9, v10}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 866
    .line 867
    .line 868
    move-result-wide v10

    .line 869
    const/16 v5, 0xc

    .line 870
    .line 871
    invoke-static {v5}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 872
    .line 873
    .line 874
    move-result-wide v13

    .line 875
    const/16 v5, 0x2e

    .line 876
    .line 877
    int-to-float v5, v5

    .line 878
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 879
    .line 880
    .line 881
    move-result v20

    .line 882
    const/16 v24, 0xe

    .line 883
    .line 884
    const/16 v25, 0x0

    .line 885
    .line 886
    const/16 v21, 0x0

    .line 887
    .line 888
    const/16 v22, 0x0

    .line 889
    .line 890
    const/16 v23, 0x0

    .line 891
    .line 892
    move-object/from16 v19, v40

    .line 893
    .line 894
    invoke-static/range {v19 .. v25}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 895
    .line 896
    .line 897
    move-result-object v5

    .line 898
    move-object/from16 v20, v19

    .line 899
    .line 900
    if-lez v15, :cond_1b

    .line 901
    .line 902
    const/high16 v9, 0x3f800000    # 1.0f

    .line 903
    .line 904
    goto :goto_10

    .line 905
    :cond_1b
    const/4 v9, 0x0

    .line 906
    :goto_10
    invoke-static {v5, v9}, Landroidx/compose/ui/draw/AlphaKt;->alpha(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 907
    .line 908
    .line 909
    move-result-object v9

    .line 910
    const/16 v32, 0x0

    .line 911
    .line 912
    const v33, 0x3fff0

    .line 913
    .line 914
    .line 915
    move-object v15, v12

    .line 916
    move-wide v12, v13

    .line 917
    const/4 v14, 0x0

    .line 918
    move-object/from16 v29, v15

    .line 919
    .line 920
    const/4 v15, 0x0

    .line 921
    const/16 v16, 0x0

    .line 922
    .line 923
    const-wide/16 v17, 0x0

    .line 924
    .line 925
    const/16 v19, 0x0

    .line 926
    .line 927
    move-object/from16 v40, v20

    .line 928
    .line 929
    const/16 v20, 0x0

    .line 930
    .line 931
    const-wide/16 v21, 0x0

    .line 932
    .line 933
    const/16 v23, 0x0

    .line 934
    .line 935
    const/16 v24, 0x0

    .line 936
    .line 937
    const/16 v25, 0x0

    .line 938
    .line 939
    const/16 v26, 0x0

    .line 940
    .line 941
    const/16 v27, 0x0

    .line 942
    .line 943
    const/16 v28, 0x0

    .line 944
    .line 945
    move-object/from16 v30, v29

    .line 946
    .line 947
    const/16 v29, 0x0

    .line 948
    .line 949
    const/16 v31, 0xd80

    .line 950
    .line 951
    move-object/from16 v5, v40

    .line 952
    .line 953
    invoke-static/range {v8 .. v33}, Landroidx/compose/material3/TextKt;->Text-IbK3jfQ(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILjava/util/Map;Lr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 954
    .line 955
    .line 956
    move-object/from16 v12, v30

    .line 957
    .line 958
    const/16 v8, 0xa

    .line 959
    .line 960
    int-to-float v8, v8

    .line 961
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 962
    .line 963
    .line 964
    move-result v9

    .line 965
    invoke-static {v5, v9}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 966
    .line 967
    .line 968
    move-result-object v9

    .line 969
    const/4 v14, 0x6

    .line 970
    invoke-static {v9, v12, v14}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 971
    .line 972
    .line 973
    const/16 v23, 0x2

    .line 974
    .line 975
    const/16 v24, 0x0

    .line 976
    .line 977
    const/high16 v21, 0x3f800000    # 1.0f

    .line 978
    .line 979
    const/16 v22, 0x0

    .line 980
    .line 981
    move-object/from16 v20, v5

    .line 982
    .line 983
    move-object/from16 v19, v36

    .line 984
    .line 985
    invoke-static/range {v19 .. v24}, Landroidx/compose/foundation/layout/ColumnScope;->weight$default(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 986
    .line 987
    .line 988
    move-result-object v5

    .line 989
    move-object/from16 v9, v20

    .line 990
    .line 991
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 992
    .line 993
    .line 994
    move-result v8

    .line 995
    invoke-virtual {v3, v8}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 996
    .line 997
    .line 998
    move-result-object v8

    .line 999
    invoke-virtual/range {v34 .. v34}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v10

    .line 1003
    invoke-static {v8, v10, v12, v14}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v8

    .line 1007
    const/4 v13, 0x0

    .line 1008
    invoke-static {v12, v13}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 1009
    .line 1010
    .line 1011
    move-result v10

    .line 1012
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v11

    .line 1016
    invoke-static {v12, v5}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v5

    .line 1020
    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v13

    .line 1024
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v15

    .line 1028
    if-nez v15, :cond_1c

    .line 1029
    .line 1030
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 1031
    .line 1032
    .line 1033
    :cond_1c
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 1034
    .line 1035
    .line 1036
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 1037
    .line 1038
    .line 1039
    move-result v15

    .line 1040
    if-eqz v15, :cond_1d

    .line 1041
    .line 1042
    invoke-interface {v12, v13}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 1043
    .line 1044
    .line 1045
    goto :goto_11

    .line 1046
    :cond_1d
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 1047
    .line 1048
    .line 1049
    :goto_11
    invoke-static {v12}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v13

    .line 1053
    invoke-static {v1, v13, v8, v13, v11}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v8

    .line 1057
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 1058
    .line 1059
    .line 1060
    move-result v11

    .line 1061
    if-nez v11, :cond_1e

    .line 1062
    .line 1063
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v11

    .line 1067
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v15

    .line 1071
    invoke-static {v11, v15}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1072
    .line 1073
    .line 1074
    move-result v11

    .line 1075
    if-nez v11, :cond_1f

    .line 1076
    .line 1077
    :cond_1e
    invoke-static {v10, v13, v10, v8}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 1078
    .line 1079
    .line 1080
    :cond_1f
    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v8

    .line 1084
    invoke-static {v13, v5, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 1085
    .line 1086
    .line 1087
    const/4 v5, 0x0

    .line 1088
    const/4 v8, 0x0

    .line 1089
    invoke-static {v9, v8, v0, v5}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v20

    .line 1093
    const/16 v23, 0x2

    .line 1094
    .line 1095
    const/16 v24, 0x0

    .line 1096
    .line 1097
    const/high16 v21, 0x3f800000    # 1.0f

    .line 1098
    .line 1099
    const/16 v22, 0x0

    .line 1100
    .line 1101
    invoke-static/range {v19 .. v24}, Landroidx/compose/foundation/layout/ColumnScope;->weight$default(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v5

    .line 1105
    move-object/from16 v15, v19

    .line 1106
    .line 1107
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 1108
    .line 1109
    .line 1110
    move-result v8

    .line 1111
    invoke-virtual {v3, v8}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v8

    .line 1115
    invoke-virtual/range {v34 .. v34}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v10

    .line 1119
    invoke-static {v8, v10, v12, v14}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v8

    .line 1123
    const/4 v13, 0x0

    .line 1124
    invoke-static {v12, v13}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 1125
    .line 1126
    .line 1127
    move-result v10

    .line 1128
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v11

    .line 1132
    invoke-static {v12, v5}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v5

    .line 1136
    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v13

    .line 1140
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v16

    .line 1144
    if-nez v16, :cond_20

    .line 1145
    .line 1146
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 1147
    .line 1148
    .line 1149
    :cond_20
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 1150
    .line 1151
    .line 1152
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 1153
    .line 1154
    .line 1155
    move-result v16

    .line 1156
    if-eqz v16, :cond_21

    .line 1157
    .line 1158
    invoke-interface {v12, v13}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 1159
    .line 1160
    .line 1161
    goto :goto_12

    .line 1162
    :cond_21
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 1163
    .line 1164
    .line 1165
    :goto_12
    invoke-static {v12}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v13

    .line 1169
    invoke-static {v1, v13, v8, v13, v11}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v8

    .line 1173
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 1174
    .line 1175
    .line 1176
    move-result v11

    .line 1177
    if-nez v11, :cond_22

    .line 1178
    .line 1179
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v11

    .line 1183
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1184
    .line 1185
    .line 1186
    move-result-object v14

    .line 1187
    invoke-static {v11, v14}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1188
    .line 1189
    .line 1190
    move-result v11

    .line 1191
    if-nez v11, :cond_23

    .line 1192
    .line 1193
    :cond_22
    invoke-static {v10, v13, v10, v8}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 1194
    .line 1195
    .line 1196
    :cond_23
    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v8

    .line 1200
    invoke-static {v13, v5, v8}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 1201
    .line 1202
    .line 1203
    move-object/from16 v20, v9

    .line 1204
    .line 1205
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1206
    .line 1207
    .line 1208
    move-result-object v9

    .line 1209
    const/16 v23, 0x2

    .line 1210
    .line 1211
    const/16 v24, 0x0

    .line 1212
    .line 1213
    const/high16 v21, 0x3f800000    # 1.0f

    .line 1214
    .line 1215
    const/16 v22, 0x0

    .line 1216
    .line 1217
    move-object/from16 v19, v37

    .line 1218
    .line 1219
    invoke-static/range {v19 .. v24}, Landroidx/compose/foundation/layout/RowScope;->weight$default(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1220
    .line 1221
    .line 1222
    move-result-object v5

    .line 1223
    const/4 v8, 0x0

    .line 1224
    const/4 v14, 0x0

    .line 1225
    invoke-static {v5, v14, v0, v8}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxHeight$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1226
    .line 1227
    .line 1228
    move-result-object v11

    .line 1229
    const/16 v13, 0x186

    .line 1230
    .line 1231
    move-object/from16 v35, v8

    .line 1232
    .line 1233
    const-string v8, "\u7ec3\u4e60\u9898\u6570"

    .line 1234
    .line 1235
    const-string v10, "\u9898"

    .line 1236
    .line 1237
    move-object/from16 v5, v35

    .line 1238
    .line 1239
    invoke-static/range {v8 .. v13}, Lcom/zykj/mistake/feature/review/y;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 1240
    .line 1241
    .line 1242
    invoke-static/range {p2 .. p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1243
    .line 1244
    .line 1245
    move-result-object v9

    .line 1246
    invoke-static/range {v19 .. v24}, Landroidx/compose/foundation/layout/RowScope;->weight$default(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v8

    .line 1250
    move-object/from16 v17, v19

    .line 1251
    .line 1252
    invoke-static {v8, v14, v0, v5}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxHeight$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v11

    .line 1256
    const-string v8, "\u7ec3\u4e60\u5929\u6570"

    .line 1257
    .line 1258
    const-string v10, "\u5929"

    .line 1259
    .line 1260
    move/from16 v18, v2

    .line 1261
    .line 1262
    move-object/from16 v2, v20

    .line 1263
    .line 1264
    invoke-static/range {v8 .. v13}, Lcom/zykj/mistake/feature/review/y;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 1265
    .line 1266
    .line 1267
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1268
    .line 1269
    .line 1270
    invoke-static {v2, v14, v0, v5}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1271
    .line 1272
    .line 1273
    move-result-object v20

    .line 1274
    move-object/from16 v19, v15

    .line 1275
    .line 1276
    invoke-static/range {v19 .. v24}, Landroidx/compose/foundation/layout/ColumnScope;->weight$default(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1277
    .line 1278
    .line 1279
    move-result-object v5

    .line 1280
    invoke-static/range {v18 .. v18}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 1281
    .line 1282
    .line 1283
    move-result v8

    .line 1284
    invoke-virtual {v3, v8}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    .line 1285
    .line 1286
    .line 1287
    move-result-object v3

    .line 1288
    invoke-virtual/range {v34 .. v34}, Landroidx/compose/ui/Alignment$Companion;->getTop()Landroidx/compose/ui/Alignment$Vertical;

    .line 1289
    .line 1290
    .line 1291
    move-result-object v8

    .line 1292
    const/4 v9, 0x6

    .line 1293
    invoke-static {v3, v8, v12, v9}, Landroidx/compose/foundation/layout/RowKt;->rowMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 1294
    .line 1295
    .line 1296
    move-result-object v3

    .line 1297
    const/4 v13, 0x0

    .line 1298
    invoke-static {v12, v13}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 1299
    .line 1300
    .line 1301
    move-result v8

    .line 1302
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 1303
    .line 1304
    .line 1305
    move-result-object v9

    .line 1306
    invoke-static {v12, v5}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v5

    .line 1310
    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 1311
    .line 1312
    .line 1313
    move-result-object v10

    .line 1314
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 1315
    .line 1316
    .line 1317
    move-result-object v11

    .line 1318
    if-nez v11, :cond_24

    .line 1319
    .line 1320
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 1321
    .line 1322
    .line 1323
    :cond_24
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 1324
    .line 1325
    .line 1326
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 1327
    .line 1328
    .line 1329
    move-result v11

    .line 1330
    if-eqz v11, :cond_25

    .line 1331
    .line 1332
    invoke-interface {v12, v10}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 1333
    .line 1334
    .line 1335
    goto :goto_13

    .line 1336
    :cond_25
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 1337
    .line 1338
    .line 1339
    :goto_13
    invoke-static {v12}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 1340
    .line 1341
    .line 1342
    move-result-object v10

    .line 1343
    invoke-static {v1, v10, v3, v10, v9}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 1344
    .line 1345
    .line 1346
    move-result-object v3

    .line 1347
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 1348
    .line 1349
    .line 1350
    move-result v9

    .line 1351
    if-nez v9, :cond_26

    .line 1352
    .line 1353
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1354
    .line 1355
    .line 1356
    move-result-object v9

    .line 1357
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1358
    .line 1359
    .line 1360
    move-result-object v11

    .line 1361
    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1362
    .line 1363
    .line 1364
    move-result v9

    .line 1365
    if-nez v9, :cond_27

    .line 1366
    .line 1367
    :cond_26
    invoke-static {v8, v10, v8, v3}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 1368
    .line 1369
    .line 1370
    :cond_27
    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 1371
    .line 1372
    .line 1373
    move-result-object v1

    .line 1374
    invoke-static {v10, v5, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 1375
    .line 1376
    .line 1377
    invoke-static/range {p3 .. p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1378
    .line 1379
    .line 1380
    move-result-object v9

    .line 1381
    const/16 v23, 0x2

    .line 1382
    .line 1383
    const/16 v24, 0x0

    .line 1384
    .line 1385
    const/high16 v21, 0x3f800000    # 1.0f

    .line 1386
    .line 1387
    const/16 v22, 0x0

    .line 1388
    .line 1389
    move-object/from16 v20, v2

    .line 1390
    .line 1391
    move-object/from16 v19, v17

    .line 1392
    .line 1393
    invoke-static/range {v19 .. v24}, Landroidx/compose/foundation/layout/RowScope;->weight$default(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1394
    .line 1395
    .line 1396
    move-result-object v1

    .line 1397
    const/4 v5, 0x0

    .line 1398
    const/4 v14, 0x0

    .line 1399
    invoke-static {v1, v14, v0, v5}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxHeight$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1400
    .line 1401
    .line 1402
    move-result-object v11

    .line 1403
    const/16 v13, 0x186

    .line 1404
    .line 1405
    const-string v8, "\u8fdb\u5165\u5de9\u56fa"

    .line 1406
    .line 1407
    const-string v10, "\u9898"

    .line 1408
    .line 1409
    invoke-static/range {v8 .. v13}, Lcom/zykj/mistake/feature/review/y;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 1410
    .line 1411
    .line 1412
    invoke-static/range {p4 .. p4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1413
    .line 1414
    .line 1415
    move-result-object v9

    .line 1416
    invoke-static/range {v19 .. v24}, Landroidx/compose/foundation/layout/RowScope;->weight$default(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/ui/Modifier;FZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1417
    .line 1418
    .line 1419
    move-result-object v1

    .line 1420
    invoke-static {v1, v14, v0, v5}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxHeight$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1421
    .line 1422
    .line 1423
    move-result-object v11

    .line 1424
    const-string v8, "\u8fdb\u5165\u638c\u63e1"

    .line 1425
    .line 1426
    const-string v10, "\u9898"

    .line 1427
    .line 1428
    invoke-static/range {v8 .. v13}, Lcom/zykj/mistake/feature/review/y;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 1429
    .line 1430
    .line 1431
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1432
    .line 1433
    .line 1434
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1435
    .line 1436
    .line 1437
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1438
    .line 1439
    .line 1440
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1441
    .line 1442
    .line 1443
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 1444
    .line 1445
    .line 1446
    move-result v0

    .line 1447
    if-eqz v0, :cond_29

    .line 1448
    .line 1449
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 1450
    .line 1451
    .line 1452
    goto :goto_14

    .line 1453
    :catchall_0
    move-exception v0

    .line 1454
    invoke-virtual {v5, v8}, Landroidx/compose/ui/text/AnnotatedString$Builder;->pop(I)V

    .line 1455
    .line 1456
    .line 1457
    throw v0

    .line 1458
    :cond_28
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 1459
    .line 1460
    .line 1461
    :cond_29
    :goto_14
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 1462
    .line 1463
    .line 1464
    move-result-object v8

    .line 1465
    if-eqz v8, :cond_2a

    .line 1466
    .line 1467
    new-instance v0, Lcom/zykj/mistake/feature/review/u;

    .line 1468
    .line 1469
    move-object/from16 v1, p0

    .line 1470
    .line 1471
    move/from16 v3, p2

    .line 1472
    .line 1473
    move/from16 v5, p4

    .line 1474
    .line 1475
    move v2, v4

    .line 1476
    move/from16 v4, p3

    .line 1477
    .line 1478
    invoke-direct/range {v0 .. v7}, Lcom/zykj/mistake/feature/review/u;-><init>(Ljava/lang/Integer;IIIILandroidx/compose/ui/Modifier;I)V

    .line 1479
    .line 1480
    .line 1481
    invoke-interface {v8, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 1482
    .line 1483
    .line 1484
    :cond_2a
    return-void
.end method

.method public static final c(Ljava/lang/String;ZLr6/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move-object/from16 v4, p3

    .line 6
    .line 7
    move/from16 v5, p5

    .line 8
    .line 9
    const v0, -0x2732b02f

    .line 10
    .line 11
    .line 12
    move-object/from16 v2, p4

    .line 13
    .line 14
    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 15
    .line 16
    .line 17
    move-result-object v10

    .line 18
    and-int/lit8 v2, v5, 0x6

    .line 19
    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    invoke-interface {v10, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    const/4 v2, 0x4

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v2, 0x2

    .line 31
    :goto_0
    or-int/2addr v2, v5

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move v2, v5

    .line 34
    :goto_1
    and-int/lit16 v6, v5, 0x180

    .line 35
    .line 36
    if-nez v6, :cond_3

    .line 37
    .line 38
    invoke-interface {v10, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    if-eqz v6, :cond_2

    .line 43
    .line 44
    const/16 v6, 0x100

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/16 v6, 0x80

    .line 48
    .line 49
    :goto_2
    or-int/2addr v2, v6

    .line 50
    :cond_3
    and-int/lit16 v6, v5, 0xc00

    .line 51
    .line 52
    if-nez v6, :cond_5

    .line 53
    .line 54
    invoke-interface {v10, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    if-eqz v6, :cond_4

    .line 59
    .line 60
    const/16 v6, 0x800

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_4
    const/16 v6, 0x400

    .line 64
    .line 65
    :goto_3
    or-int/2addr v2, v6

    .line 66
    :cond_5
    and-int/lit16 v6, v2, 0x483

    .line 67
    .line 68
    const/16 v7, 0x482

    .line 69
    .line 70
    const/4 v8, 0x1

    .line 71
    if-eq v6, v7, :cond_6

    .line 72
    .line 73
    move v6, v8

    .line 74
    goto :goto_4

    .line 75
    :cond_6
    const/4 v6, 0x0

    .line 76
    :goto_4
    and-int/lit8 v7, v2, 0x1

    .line 77
    .line 78
    invoke-interface {v10, v6, v7}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    if-eqz v6, :cond_8

    .line 83
    .line 84
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    if-eqz v6, :cond_7

    .line 89
    .line 90
    const/4 v6, -0x1

    .line 91
    const-string v7, "com.zykj.mistake.feature.review.RecommendedExercisesCard (ReviewScreen.kt:219)"

    .line 92
    .line 93
    invoke-static {v0, v2, v6, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 94
    .line 95
    .line 96
    :cond_7
    const/4 v0, 0x0

    .line 97
    const/4 v2, 0x0

    .line 98
    invoke-static {v4, v0, v8, v2}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxHeight$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    const/16 v2, 0x8

    .line 103
    .line 104
    int-to-float v2, v2

    .line 105
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    invoke-static {v2}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-static {v0, v2}, Landroidx/compose/ui/draw/ClipKt;->clip(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 114
    .line 115
    .line 116
    move-result-object v11

    .line 117
    const-wide v6, 0xffdcebffL    # 2.120859993E-314

    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    invoke-static {v6, v7}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 123
    .line 124
    .line 125
    move-result-wide v12

    .line 126
    const/4 v15, 0x2

    .line 127
    const/16 v16, 0x0

    .line 128
    .line 129
    const/4 v14, 0x0

    .line 130
    invoke-static/range {v11 .. v16}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    new-instance v0, Landroidx/navigation/serialization/c;

    .line 135
    .line 136
    const/4 v2, 0x3

    .line 137
    invoke-direct {v0, v2, v3, v1}, Landroidx/navigation/serialization/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    const/16 v2, 0x36

    .line 141
    .line 142
    const v7, -0x532a6f45

    .line 143
    .line 144
    .line 145
    invoke-static {v7, v8, v0, v10, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 146
    .line 147
    .line 148
    move-result-object v9

    .line 149
    const/16 v11, 0xc00

    .line 150
    .line 151
    const/4 v12, 0x6

    .line 152
    const/4 v7, 0x0

    .line 153
    const/4 v8, 0x0

    .line 154
    invoke-static/range {v6 .. v12}, Landroidx/compose/foundation/layout/BoxWithConstraintsKt;->BoxWithConstraints(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;ZLr6/f;Landroidx/compose/runtime/Composer;II)V

    .line 155
    .line 156
    .line 157
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    if-eqz v0, :cond_9

    .line 162
    .line 163
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 164
    .line 165
    .line 166
    goto :goto_5

    .line 167
    :cond_8
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 168
    .line 169
    .line 170
    :cond_9
    :goto_5
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 171
    .line 172
    .line 173
    move-result-object v6

    .line 174
    if-eqz v6, :cond_a

    .line 175
    .line 176
    new-instance v0, Lcom/zykj/mistake/feature/notebook/detail/p3;

    .line 177
    .line 178
    move/from16 v2, p1

    .line 179
    .line 180
    invoke-direct/range {v0 .. v5}, Lcom/zykj/mistake/feature/notebook/detail/p3;-><init>(Ljava/lang/String;ZLr6/a;Landroidx/compose/ui/Modifier;I)V

    .line 181
    .line 182
    .line 183
    invoke-interface {v6, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 184
    .line 185
    .line 186
    :cond_a
    return-void
.end method

.method public static final d(Ljava/lang/String;JJLandroidx/compose/ui/Modifier;Lr6/a;ZLandroidx/compose/runtime/Composer;II)V
    .locals 35

    .line 1
    move-object/from16 v6, p5

    .line 2
    .line 3
    move-object/from16 v7, p6

    .line 4
    .line 5
    move/from16 v9, p9

    .line 6
    .line 7
    const v0, -0x29c4e27d

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p8

    .line 11
    .line 12
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    and-int/lit8 v2, v9, 0x6

    .line 17
    .line 18
    move-object/from16 v10, p0

    .line 19
    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    invoke-interface {v1, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    const/4 v2, 0x4

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v2, 0x2

    .line 31
    :goto_0
    or-int/2addr v2, v9

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move v2, v9

    .line 34
    :goto_1
    and-int/lit8 v4, v9, 0x30

    .line 35
    .line 36
    move-wide/from16 v12, p1

    .line 37
    .line 38
    if-nez v4, :cond_3

    .line 39
    .line 40
    invoke-interface {v1, v12, v13}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-eqz v4, :cond_2

    .line 45
    .line 46
    const/16 v4, 0x20

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    const/16 v4, 0x10

    .line 50
    .line 51
    :goto_2
    or-int/2addr v2, v4

    .line 52
    :cond_3
    and-int/lit16 v4, v9, 0x180

    .line 53
    .line 54
    if-nez v4, :cond_5

    .line 55
    .line 56
    move-wide/from16 v4, p3

    .line 57
    .line 58
    invoke-interface {v1, v4, v5}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    if-eqz v8, :cond_4

    .line 63
    .line 64
    const/16 v8, 0x100

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_4
    const/16 v8, 0x80

    .line 68
    .line 69
    :goto_3
    or-int/2addr v2, v8

    .line 70
    goto :goto_4

    .line 71
    :cond_5
    move-wide/from16 v4, p3

    .line 72
    .line 73
    :goto_4
    and-int/lit16 v8, v9, 0xc00

    .line 74
    .line 75
    if-nez v8, :cond_7

    .line 76
    .line 77
    invoke-interface {v1, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v8

    .line 81
    if-eqz v8, :cond_6

    .line 82
    .line 83
    const/16 v8, 0x800

    .line 84
    .line 85
    goto :goto_5

    .line 86
    :cond_6
    const/16 v8, 0x400

    .line 87
    .line 88
    :goto_5
    or-int/2addr v2, v8

    .line 89
    :cond_7
    and-int/lit16 v8, v9, 0x6000

    .line 90
    .line 91
    if-nez v8, :cond_9

    .line 92
    .line 93
    invoke-interface {v1, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v8

    .line 97
    if-eqz v8, :cond_8

    .line 98
    .line 99
    const/16 v8, 0x4000

    .line 100
    .line 101
    goto :goto_6

    .line 102
    :cond_8
    const/16 v8, 0x2000

    .line 103
    .line 104
    :goto_6
    or-int/2addr v2, v8

    .line 105
    :cond_9
    and-int/lit8 v8, p10, 0x20

    .line 106
    .line 107
    const/high16 v11, 0x30000

    .line 108
    .line 109
    if-eqz v8, :cond_b

    .line 110
    .line 111
    or-int/2addr v2, v11

    .line 112
    :cond_a
    move/from16 v11, p7

    .line 113
    .line 114
    goto :goto_8

    .line 115
    :cond_b
    and-int/2addr v11, v9

    .line 116
    if-nez v11, :cond_a

    .line 117
    .line 118
    move/from16 v11, p7

    .line 119
    .line 120
    invoke-interface {v1, v11}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 121
    .line 122
    .line 123
    move-result v14

    .line 124
    if-eqz v14, :cond_c

    .line 125
    .line 126
    const/high16 v14, 0x20000

    .line 127
    .line 128
    goto :goto_7

    .line 129
    :cond_c
    const/high16 v14, 0x10000

    .line 130
    .line 131
    :goto_7
    or-int/2addr v2, v14

    .line 132
    :goto_8
    const v14, 0x12493

    .line 133
    .line 134
    .line 135
    and-int/2addr v14, v2

    .line 136
    const v15, 0x12492

    .line 137
    .line 138
    .line 139
    const/4 v3, 0x0

    .line 140
    if-eq v14, v15, :cond_d

    .line 141
    .line 142
    const/4 v14, 0x1

    .line 143
    goto :goto_9

    .line 144
    :cond_d
    move v14, v3

    .line 145
    :goto_9
    and-int/lit8 v15, v2, 0x1

    .line 146
    .line 147
    invoke-interface {v1, v14, v15}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 148
    .line 149
    .line 150
    move-result v14

    .line 151
    if-eqz v14, :cond_15

    .line 152
    .line 153
    if-eqz v8, :cond_e

    .line 154
    .line 155
    move v8, v3

    .line 156
    goto :goto_a

    .line 157
    :cond_e
    move v8, v11

    .line 158
    :goto_a
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 159
    .line 160
    .line 161
    move-result v11

    .line 162
    if-eqz v11, :cond_f

    .line 163
    .line 164
    const/4 v11, -0x1

    .line 165
    const-string v14, "com.zykj.mistake.feature.review.ReviewActionButton (ReviewScreen.kt:556)"

    .line 166
    .line 167
    invoke-static {v0, v2, v11, v14}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 168
    .line 169
    .line 170
    :cond_f
    const/4 v0, 0x4

    .line 171
    int-to-float v0, v0

    .line 172
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    invoke-static {v0}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    shr-int/lit8 v11, v2, 0x9

    .line 181
    .line 182
    const/16 v14, 0x70

    .line 183
    .line 184
    and-int/2addr v11, v14

    .line 185
    or-int/lit16 v11, v11, 0x186

    .line 186
    .line 187
    invoke-static {v7, v1, v11, v3}, Lcom/zykj/mistake/utils/e;->c(Lr6/a;Landroidx/compose/runtime/Composer;II)Lr6/a;

    .line 188
    .line 189
    .line 190
    move-result-object v22

    .line 191
    int-to-float v11, v14

    .line 192
    invoke-static {v11}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 193
    .line 194
    .line 195
    move-result v11

    .line 196
    invoke-static {v6, v11}, Landroidx/compose/foundation/layout/SizeKt;->width-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 197
    .line 198
    .line 199
    move-result-object v11

    .line 200
    const/16 v14, 0x28

    .line 201
    .line 202
    int-to-float v14, v14

    .line 203
    invoke-static {v14}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 204
    .line 205
    .line 206
    move-result v14

    .line 207
    invoke-static {v11, v14}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    .line 208
    .line 209
    .line 210
    move-result-object v11

    .line 211
    invoke-static {v11, v0}, Landroidx/compose/ui/draw/ClipKt;->clip(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 212
    .line 213
    .line 214
    move-result-object v11

    .line 215
    const/4 v15, 0x2

    .line 216
    const/16 v16, 0x0

    .line 217
    .line 218
    const/4 v14, 0x0

    .line 219
    invoke-static/range {v11 .. v16}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 220
    .line 221
    .line 222
    move-result-object v11

    .line 223
    if-eqz v8, :cond_10

    .line 224
    .line 225
    sget-object v12, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 226
    .line 227
    const/4 v13, 0x1

    .line 228
    int-to-float v13, v13

    .line 229
    invoke-static {v13}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 230
    .line 231
    .line 232
    move-result v13

    .line 233
    const-wide v14, 0xffb8efd8L

    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    invoke-static {v14, v15}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 239
    .line 240
    .line 241
    move-result-wide v14

    .line 242
    invoke-static {v12, v13, v14, v15, v0}, Landroidx/compose/foundation/BorderKt;->border-xT4_qwU(Landroidx/compose/ui/Modifier;FJLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    goto :goto_b

    .line 247
    :cond_10
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 248
    .line 249
    :goto_b
    invoke-interface {v11, v0}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 250
    .line 251
    .line 252
    move-result-object v18

    .line 253
    const/16 v23, 0x7

    .line 254
    .line 255
    const/16 v24, 0x0

    .line 256
    .line 257
    const/16 v19, 0x0

    .line 258
    .line 259
    const/16 v20, 0x0

    .line 260
    .line 261
    const/16 v21, 0x0

    .line 262
    .line 263
    invoke-static/range {v18 .. v24}, Landroidx/compose/foundation/ClickableKt;->clickable-XHw0xAI$default(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lr6/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    sget-object v11, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 268
    .line 269
    invoke-virtual {v11}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 270
    .line 271
    .line 272
    move-result-object v11

    .line 273
    invoke-static {v11, v3}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 274
    .line 275
    .line 276
    move-result-object v11

    .line 277
    invoke-static {v1, v3}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 278
    .line 279
    .line 280
    move-result v3

    .line 281
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 282
    .line 283
    .line 284
    move-result-object v12

    .line 285
    invoke-static {v1, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    sget-object v13, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 290
    .line 291
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 292
    .line 293
    .line 294
    move-result-object v14

    .line 295
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 296
    .line 297
    .line 298
    move-result-object v15

    .line 299
    if-nez v15, :cond_11

    .line 300
    .line 301
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 302
    .line 303
    .line 304
    :cond_11
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 305
    .line 306
    .line 307
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 308
    .line 309
    .line 310
    move-result v15

    .line 311
    if-eqz v15, :cond_12

    .line 312
    .line 313
    invoke-interface {v1, v14}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 314
    .line 315
    .line 316
    goto :goto_c

    .line 317
    :cond_12
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 318
    .line 319
    .line 320
    :goto_c
    invoke-static {v1}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 321
    .line 322
    .line 323
    move-result-object v14

    .line 324
    invoke-static {v13, v14, v11, v14, v12}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 325
    .line 326
    .line 327
    move-result-object v11

    .line 328
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 329
    .line 330
    .line 331
    move-result v12

    .line 332
    if-nez v12, :cond_13

    .line 333
    .line 334
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v12

    .line 338
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 339
    .line 340
    .line 341
    move-result-object v15

    .line 342
    invoke-static {v12, v15}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    move-result v12

    .line 346
    if-nez v12, :cond_14

    .line 347
    .line 348
    :cond_13
    invoke-static {v3, v14, v3, v11}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 349
    .line 350
    .line 351
    :cond_14
    invoke-virtual {v13}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 352
    .line 353
    .line 354
    move-result-object v3

    .line 355
    invoke-static {v14, v0, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 356
    .line 357
    .line 358
    sget-object v0, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 359
    .line 360
    const/16 v0, 0xf

    .line 361
    .line 362
    invoke-static {v0}, Landroidx/compose/ui/unit/TextUnitKt;->getSp(I)J

    .line 363
    .line 364
    .line 365
    move-result-wide v14

    .line 366
    sget-object v0, Landroidx/compose/ui/text/font/FontWeight;->Companion:Landroidx/compose/ui/text/font/FontWeight$Companion;

    .line 367
    .line 368
    invoke-virtual {v0}, Landroidx/compose/ui/text/font/FontWeight$Companion;->getSemiBold()Landroidx/compose/ui/text/font/FontWeight;

    .line 369
    .line 370
    .line 371
    move-result-object v17

    .line 372
    and-int/lit8 v0, v2, 0xe

    .line 373
    .line 374
    const v3, 0x30c00

    .line 375
    .line 376
    .line 377
    or-int/2addr v0, v3

    .line 378
    and-int/lit16 v2, v2, 0x380

    .line 379
    .line 380
    or-int v32, v0, v2

    .line 381
    .line 382
    const/16 v33, 0x0

    .line 383
    .line 384
    const v34, 0x1ffd2

    .line 385
    .line 386
    .line 387
    const/4 v11, 0x0

    .line 388
    const/16 v16, 0x0

    .line 389
    .line 390
    const/16 v18, 0x0

    .line 391
    .line 392
    const-wide/16 v19, 0x0

    .line 393
    .line 394
    const/16 v21, 0x0

    .line 395
    .line 396
    const/16 v22, 0x0

    .line 397
    .line 398
    const-wide/16 v23, 0x0

    .line 399
    .line 400
    const/16 v25, 0x0

    .line 401
    .line 402
    const/16 v26, 0x0

    .line 403
    .line 404
    const/16 v27, 0x0

    .line 405
    .line 406
    const/16 v28, 0x0

    .line 407
    .line 408
    const/16 v29, 0x0

    .line 409
    .line 410
    const/16 v30, 0x0

    .line 411
    .line 412
    move-object/from16 v31, v1

    .line 413
    .line 414
    move-wide v12, v4

    .line 415
    invoke-static/range {v10 .. v34}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILr6/c;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 416
    .line 417
    .line 418
    invoke-interface/range {v31 .. v31}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 419
    .line 420
    .line 421
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 422
    .line 423
    .line 424
    move-result v0

    .line 425
    if-eqz v0, :cond_16

    .line 426
    .line 427
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 428
    .line 429
    .line 430
    goto :goto_d

    .line 431
    :cond_15
    move-object/from16 v31, v1

    .line 432
    .line 433
    invoke-interface/range {v31 .. v31}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 434
    .line 435
    .line 436
    move v8, v11

    .line 437
    :cond_16
    :goto_d
    invoke-interface/range {v31 .. v31}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 438
    .line 439
    .line 440
    move-result-object v11

    .line 441
    if-eqz v11, :cond_17

    .line 442
    .line 443
    new-instance v0, Lcom/zykj/mistake/feature/review/s;

    .line 444
    .line 445
    move-object/from16 v1, p0

    .line 446
    .line 447
    move-wide/from16 v2, p1

    .line 448
    .line 449
    move-wide/from16 v4, p3

    .line 450
    .line 451
    move/from16 v10, p10

    .line 452
    .line 453
    invoke-direct/range {v0 .. v10}, Lcom/zykj/mistake/feature/review/s;-><init>(Ljava/lang/String;JJLandroidx/compose/ui/Modifier;Lr6/a;ZII)V

    .line 454
    .line 455
    .line 456
    invoke-interface {v11, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 457
    .line 458
    .line 459
    :cond_17
    return-void
.end method

.method public static final e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIJJZLjava/lang/String;JJLandroidx/compose/ui/Modifier;FZLr6/a;Landroidx/compose/runtime/Composer;III)V
    .locals 28

    move-object/from16 v0, p15

    move/from16 v1, p20

    move/from16 v2, p21

    const v3, 0x1bebdf9

    move-object/from16 v4, p19

    .line 1
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v8

    and-int/lit8 v4, v1, 0x6

    if-nez v4, :cond_1

    move-object/from16 v4, p0

    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    const/4 v7, 0x4

    goto :goto_0

    :cond_0
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v1

    goto :goto_1

    :cond_1
    move-object/from16 v4, p0

    move v7, v1

    :goto_1
    and-int/lit8 v9, v1, 0x30

    if-nez v9, :cond_3

    move-object/from16 v9, p1

    invoke-interface {v8, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_2

    const/16 v12, 0x20

    goto :goto_2

    :cond_2
    const/16 v12, 0x10

    :goto_2
    or-int/2addr v7, v12

    goto :goto_3

    :cond_3
    move-object/from16 v9, p1

    :goto_3
    and-int/lit16 v12, v1, 0x180

    if-nez v12, :cond_5

    move-object/from16 v12, p2

    invoke-interface {v8, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_4

    const/16 v15, 0x100

    goto :goto_4

    :cond_4
    const/16 v15, 0x80

    :goto_4
    or-int/2addr v7, v15

    goto :goto_5

    :cond_5
    move-object/from16 v12, p2

    :goto_5
    and-int/lit16 v15, v1, 0xc00

    const/16 v16, 0x400

    const/16 v17, 0x800

    if-nez v15, :cond_7

    move/from16 v15, p3

    invoke-interface {v8, v15}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v18

    if-eqz v18, :cond_6

    move/from16 v18, v17

    goto :goto_6

    :cond_6
    move/from16 v18, v16

    :goto_6
    or-int v7, v7, v18

    goto :goto_7

    :cond_7
    move/from16 v15, p3

    :goto_7
    and-int/lit16 v5, v1, 0x6000

    const/16 v18, 0x2000

    const/16 v19, 0x4000

    if-nez v5, :cond_9

    move/from16 v5, p4

    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v20

    if-eqz v20, :cond_8

    move/from16 v20, v19

    goto :goto_8

    :cond_8
    move/from16 v20, v18

    :goto_8
    or-int v7, v7, v20

    goto :goto_9

    :cond_9
    move/from16 v5, p4

    :goto_9
    const/high16 v20, 0x30000

    and-int v20, v1, v20

    move/from16 v21, v7

    move-wide/from16 v6, p5

    if-nez v20, :cond_b

    invoke-interface {v8, v6, v7}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v22

    if-eqz v22, :cond_a

    const/high16 v22, 0x20000

    goto :goto_a

    :cond_a
    const/high16 v22, 0x10000

    :goto_a
    or-int v21, v21, v22

    :cond_b
    const/high16 v22, 0x180000

    and-int v22, v1, v22

    move-wide/from16 v10, p7

    if-nez v22, :cond_d

    invoke-interface {v8, v10, v11}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v24

    if-eqz v24, :cond_c

    const/high16 v24, 0x100000

    goto :goto_b

    :cond_c
    const/high16 v24, 0x80000

    :goto_b
    or-int v21, v21, v24

    :cond_d
    const/high16 v24, 0x6000000

    and-int v24, v1, v24

    move-object/from16 v13, p10

    if-nez v24, :cond_f

    invoke-interface {v8, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_e

    const/high16 v25, 0x4000000

    goto :goto_c

    :cond_e
    const/high16 v25, 0x2000000

    :goto_c
    or-int v21, v21, v25

    :cond_f
    const/high16 v25, 0x30000000

    and-int v25, v1, v25

    move-wide/from16 v14, p11

    if-nez v25, :cond_11

    invoke-interface {v8, v14, v15}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v26

    if-eqz v26, :cond_10

    const/high16 v26, 0x20000000

    goto :goto_d

    :cond_10
    const/high16 v26, 0x10000000

    :goto_d
    or-int v21, v21, v26

    :cond_11
    move/from16 v3, v21

    and-int/lit8 v21, v2, 0x6

    move-wide/from16 v4, p13

    if-nez v21, :cond_13

    invoke-interface {v8, v4, v5}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v21

    if-eqz v21, :cond_12

    const/16 v20, 0x4

    goto :goto_e

    :cond_12
    const/16 v20, 0x2

    :goto_e
    or-int v20, v2, v20

    goto :goto_f

    :cond_13
    move/from16 v20, v2

    :goto_f
    and-int/lit8 v21, v2, 0x30

    if-nez v21, :cond_15

    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_14

    const/16 v22, 0x20

    goto :goto_10

    :cond_14
    const/16 v22, 0x10

    :goto_10
    or-int v20, v20, v22

    :cond_15
    and-int/lit16 v1, v2, 0x180

    if-nez v1, :cond_17

    move/from16 v1, p16

    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v21

    if-eqz v21, :cond_16

    const/16 v25, 0x100

    goto :goto_11

    :cond_16
    const/16 v25, 0x80

    :goto_11
    or-int v20, v20, v25

    :goto_12
    move/from16 v1, v20

    goto :goto_13

    :cond_17
    move/from16 v1, p16

    goto :goto_12

    :goto_13
    move/from16 v5, p22

    and-int/lit16 v4, v5, 0x2000

    if-eqz v4, :cond_18

    or-int/lit16 v1, v1, 0xc00

    move/from16 v16, v1

    move/from16 v1, p17

    goto :goto_14

    :cond_18
    move/from16 v20, v1

    and-int/lit16 v1, v2, 0xc00

    if-nez v1, :cond_1a

    move/from16 v1, p17

    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v21

    if-eqz v21, :cond_19

    move/from16 v16, v17

    :cond_19
    or-int v16, v20, v16

    goto :goto_14

    :cond_1a
    move/from16 v1, p17

    move/from16 v16, v20

    :goto_14
    and-int/lit16 v1, v2, 0x6000

    if-nez v1, :cond_1c

    move-object/from16 v1, p18

    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_1b

    move/from16 v18, v19

    :cond_1b
    or-int v16, v16, v18

    :goto_15
    move/from16 v1, v16

    goto :goto_16

    :cond_1c
    move-object/from16 v1, p18

    goto :goto_15

    :goto_16
    const v16, 0x12092493

    and-int v2, v3, v16

    move/from16 v16, v4

    const v4, 0x12092492

    const/16 v17, 0x0

    const/4 v5, 0x1

    if-ne v2, v4, :cond_1e

    and-int/lit16 v2, v1, 0x2493

    const/16 v4, 0x2492

    if-eq v2, v4, :cond_1d

    goto :goto_17

    :cond_1d
    move/from16 v2, v17

    goto :goto_18

    :cond_1e
    :goto_17
    move v2, v5

    :goto_18
    and-int/lit8 v4, v3, 0x1

    invoke-interface {v8, v2, v4}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v2

    if-eqz v2, :cond_21

    if-eqz v16, :cond_1f

    move/from16 v18, v17

    goto :goto_19

    :cond_1f
    move/from16 v18, p17

    .line 2
    :goto_19
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_20

    const-string v2, "com.zykj.mistake.feature.review.ReviewPracticeCard (ReviewScreen.kt:473)"

    const v4, 0x1bebdf9

    invoke-static {v4, v3, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_20
    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 3
    invoke-static {v0, v1, v5, v2}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxHeight$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/16 v2, 0x8

    int-to-float v2, v2

    .line 4
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v2

    .line 5
    invoke-static {v2}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/compose/ui/draw/ClipKt;->clip(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;

    move-result-object v21

    const/16 v25, 0x2

    const/16 v26, 0x0

    const/16 v24, 0x0

    move-wide/from16 v22, v6

    .line 6
    invoke-static/range {v21 .. v26}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    .line 7
    new-instance v9, Lcom/zykj/mistake/feature/review/v;

    move-object/from16 v21, p0

    move-object/from16 v22, p1

    move/from16 v20, p3

    move-object/from16 v17, p18

    move-wide/from16 v23, v10

    move-object/from16 v19, v12

    move-object v12, v13

    move-wide v13, v14

    move/from16 v11, p4

    move-wide/from16 v15, p13

    move/from16 v10, p16

    invoke-direct/range {v9 .. v24}, Lcom/zykj/mistake/feature/review/v;-><init>(FILjava/lang/String;JJLr6/a;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;J)V

    const/16 v1, 0x36

    const v2, 0x47b0854f

    invoke-static {v2, v5, v9, v8, v1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v7

    const/16 v9, 0xc00

    const/4 v10, 0x6

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 8
    invoke-static/range {v4 .. v10}, Landroidx/compose/foundation/layout/BoxWithConstraintsKt;->BoxWithConstraints(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;ZLr6/f;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_22

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_1a

    .line 9
    :cond_21
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move/from16 v18, p17

    .line 10
    :cond_22
    :goto_1a
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v1

    if-eqz v1, :cond_23

    new-instance v0, Lcom/zykj/mistake/feature/review/w;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-wide/from16 v6, p5

    move-wide/from16 v8, p7

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-wide/from16 v12, p11

    move-wide/from16 v14, p13

    move-object/from16 v16, p15

    move/from16 v17, p16

    move-object/from16 v19, p18

    move/from16 v20, p20

    move/from16 v21, p21

    move/from16 v22, p22

    move-object/from16 v27, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v22}, Lcom/zykj/mistake/feature/review/w;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIJJZLjava/lang/String;JJLandroidx/compose/ui/Modifier;FZLr6/a;III)V

    move-object v1, v0

    move-object/from16 v0, v27

    invoke-interface {v0, v1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    :cond_23
    return-void
.end method

.method public static final f(Lcom/zykj/mistake/feature/review/i;Lr6/c;Landroidx/compose/runtime/Composer;I)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    const v3, 0x1b4a87d9

    .line 8
    .line 9
    .line 10
    move-object/from16 v4, p2

    .line 11
    .line 12
    invoke-interface {v4, v3}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    .line 15
    move-result-object v11

    .line 16
    and-int/lit8 v4, v2, 0x6

    .line 17
    .line 18
    if-nez v4, :cond_1

    .line 19
    .line 20
    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    const/4 v4, 0x4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v4, 0x2

    .line 29
    :goto_0
    or-int/2addr v4, v2

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move v4, v2

    .line 32
    :goto_1
    and-int/lit8 v5, v2, 0x30

    .line 33
    .line 34
    const/16 v6, 0x20

    .line 35
    .line 36
    if-nez v5, :cond_3

    .line 37
    .line 38
    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-eqz v5, :cond_2

    .line 43
    .line 44
    move v5, v6

    .line 45
    goto :goto_2

    .line 46
    :cond_2
    const/16 v5, 0x10

    .line 47
    .line 48
    :goto_2
    or-int/2addr v4, v5

    .line 49
    :cond_3
    and-int/lit8 v5, v4, 0x13

    .line 50
    .line 51
    const/16 v7, 0x12

    .line 52
    .line 53
    const/4 v8, 0x0

    .line 54
    const/4 v9, 0x1

    .line 55
    if-eq v5, v7, :cond_4

    .line 56
    .line 57
    move v5, v9

    .line 58
    goto :goto_3

    .line 59
    :cond_4
    move v5, v8

    .line 60
    :goto_3
    and-int/lit8 v7, v4, 0x1

    .line 61
    .line 62
    invoke-interface {v11, v5, v7}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-eqz v5, :cond_b

    .line 67
    .line 68
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 69
    .line 70
    .line 71
    and-int/lit8 v5, v2, 0x1

    .line 72
    .line 73
    if-eqz v5, :cond_6

    .line 74
    .line 75
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    if-eqz v5, :cond_5

    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_5
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 83
    .line 84
    .line 85
    :cond_6
    :goto_4
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 86
    .line 87
    .line 88
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    if-eqz v5, :cond_7

    .line 93
    .line 94
    const/4 v5, -0x1

    .line 95
    const-string v7, "com.zykj.mistake.feature.review.ReviewScreen (ReviewScreen.kt:90)"

    .line 96
    .line 97
    invoke-static {v3, v4, v5, v7}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 98
    .line 99
    .line 100
    :cond_7
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalConfiguration()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    check-cast v3, Landroid/content/res/Configuration;

    .line 109
    .line 110
    iget v3, v3, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 111
    .line 112
    int-to-float v3, v3

    .line 113
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    sget-object v5, Landroidx/compose/foundation/layout/WindowInsets;->Companion:Landroidx/compose/foundation/layout/WindowInsets$Companion;

    .line 118
    .line 119
    const/4 v7, 0x6

    .line 120
    invoke-static {v5, v11, v7}, Landroidx/compose/foundation/layout/WindowInsets_androidKt;->getStatusBars(Landroidx/compose/foundation/layout/WindowInsets$Companion;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    invoke-static {v5, v11, v8}, Landroidx/compose/foundation/layout/WindowInsetsKt;->asPaddingValues(Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/PaddingValues;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    invoke-interface {v5}, Landroidx/compose/foundation/layout/PaddingValues;->calculateTopPadding-D9Ej5fM()F

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    sub-float/2addr v3, v5

    .line 133
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    sget v5, Lcom/zykj/mistake/feature/review/y;->a:F

    .line 138
    .line 139
    sub-float/2addr v3, v5

    .line 140
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    const/high16 v5, 0x43700000    # 240.0f

    .line 145
    .line 146
    mul-float/2addr v5, v3

    .line 147
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 148
    .line 149
    .line 150
    move-result v5

    .line 151
    const/high16 v7, 0x44210000    # 644.0f

    .line 152
    .line 153
    div-float/2addr v5, v7

    .line 154
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 155
    .line 156
    .line 157
    move-result v5

    .line 158
    const/high16 v10, 0x43480000    # 200.0f

    .line 159
    .line 160
    mul-float/2addr v3, v10

    .line 161
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 162
    .line 163
    .line 164
    move-result v3

    .line 165
    div-float/2addr v3, v7

    .line 166
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 167
    .line 168
    .line 169
    move-result v3

    .line 170
    move v7, v4

    .line 171
    iget-boolean v4, v0, Lcom/zykj/mistake/feature/review/i;->v:Z

    .line 172
    .line 173
    and-int/lit8 v7, v7, 0x70

    .line 174
    .line 175
    if-ne v7, v6, :cond_8

    .line 176
    .line 177
    move v8, v9

    .line 178
    :cond_8
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v6

    .line 182
    if-nez v8, :cond_9

    .line 183
    .line 184
    sget-object v7, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 185
    .line 186
    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v7

    .line 190
    if-ne v6, v7, :cond_a

    .line 191
    .line 192
    :cond_9
    new-instance v6, Lcom/zykj/mistake/feature/notebook/list/g1;

    .line 193
    .line 194
    const/16 v7, 0x8

    .line 195
    .line 196
    invoke-direct {v6, v1, v7}, Lcom/zykj/mistake/feature/notebook/list/g1;-><init>(Lr6/c;I)V

    .line 197
    .line 198
    .line 199
    invoke-interface {v11, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    :cond_a
    check-cast v6, Lr6/a;

    .line 203
    .line 204
    sget-object v7, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 205
    .line 206
    const/4 v8, 0x0

    .line 207
    const/4 v10, 0x0

    .line 208
    invoke-static {v7, v8, v9, v10}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 209
    .line 210
    .line 211
    move-result-object v12

    .line 212
    sget-object v7, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 213
    .line 214
    invoke-virtual {v7}, Landroidx/compose/ui/graphics/Color$Companion;->getWhite-0d7_KjU()J

    .line 215
    .line 216
    .line 217
    move-result-wide v13

    .line 218
    const/16 v16, 0x2

    .line 219
    .line 220
    const/16 v17, 0x0

    .line 221
    .line 222
    const/4 v15, 0x0

    .line 223
    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/BackgroundKt;->background-bw27NRU$default(Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/graphics/Shape;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 224
    .line 225
    .line 226
    move-result-object v7

    .line 227
    new-instance v8, Lcom/zykj/mistake/feature/review/t;

    .line 228
    .line 229
    invoke-direct {v8, v0, v5, v3, v1}, Lcom/zykj/mistake/feature/review/t;-><init>(Lcom/zykj/mistake/feature/review/i;FFLr6/c;)V

    .line 230
    .line 231
    .line 232
    const/16 v3, 0x36

    .line 233
    .line 234
    const v5, -0x4e0a2941

    .line 235
    .line 236
    .line 237
    invoke-static {v5, v9, v8, v11, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 238
    .line 239
    .line 240
    move-result-object v10

    .line 241
    const v12, 0x180180

    .line 242
    .line 243
    .line 244
    const/16 v13, 0x38

    .line 245
    .line 246
    move-object v5, v6

    .line 247
    move-object v6, v7

    .line 248
    const/4 v7, 0x0

    .line 249
    const/4 v8, 0x0

    .line 250
    const/4 v9, 0x0

    .line 251
    invoke-static/range {v4 .. v13}, Landroidx/compose/material3/pulltorefresh/PullToRefreshKt;->PullToRefreshBox(ZLr6/a;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/pulltorefresh/PullToRefreshState;Landroidx/compose/ui/Alignment;Lr6/f;Lr6/f;Landroidx/compose/runtime/Composer;II)V

    .line 252
    .line 253
    .line 254
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 255
    .line 256
    .line 257
    move-result v3

    .line 258
    if-eqz v3, :cond_c

    .line 259
    .line 260
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 261
    .line 262
    .line 263
    goto :goto_5

    .line 264
    :cond_b
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 265
    .line 266
    .line 267
    :cond_c
    :goto_5
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 268
    .line 269
    .line 270
    move-result-object v3

    .line 271
    if-eqz v3, :cond_d

    .line 272
    .line 273
    new-instance v4, Landroidx/navigation/compose/b;

    .line 274
    .line 275
    const/16 v5, 0xf

    .line 276
    .line 277
    invoke-direct {v4, v2, v5, v0, v1}, Landroidx/navigation/compose/b;-><init>(IILjava/lang/Object;Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    invoke-interface {v3, v4}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 281
    .line 282
    .line 283
    :cond_d
    return-void
.end method
