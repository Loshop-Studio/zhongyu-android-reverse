.class public abstract Ld7/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroidx/compose/material3/ColorScheme;

.field public static final b:Landroidx/compose/material3/ColorScheme;


# direct methods
.method static constructor <clinit>()V
    .locals 76

    .line 1
    invoke-static {}, Ld7/a;->l()J

    .line 2
    .line 3
    .line 4
    move-result-wide v1

    .line 5
    invoke-static {}, Ld7/a;->n()J

    .line 6
    .line 7
    .line 8
    move-result-wide v11

    .line 9
    invoke-static {}, Ld7/a;->k()J

    .line 10
    .line 11
    .line 12
    move-result-wide v19

    .line 13
    const/16 v74, 0xf

    .line 14
    .line 15
    const/16 v75, 0x0

    .line 16
    .line 17
    const-wide/16 v3, 0x0

    .line 18
    .line 19
    const-wide/16 v5, 0x0

    .line 20
    .line 21
    const-wide/16 v7, 0x0

    .line 22
    .line 23
    const-wide/16 v9, 0x0

    .line 24
    .line 25
    const-wide/16 v13, 0x0

    .line 26
    .line 27
    const-wide/16 v15, 0x0

    .line 28
    .line 29
    const-wide/16 v17, 0x0

    .line 30
    .line 31
    const-wide/16 v21, 0x0

    .line 32
    .line 33
    const-wide/16 v23, 0x0

    .line 34
    .line 35
    const-wide/16 v25, 0x0

    .line 36
    .line 37
    const-wide/16 v27, 0x0

    .line 38
    .line 39
    const-wide/16 v29, 0x0

    .line 40
    .line 41
    const-wide/16 v31, 0x0

    .line 42
    .line 43
    const-wide/16 v33, 0x0

    .line 44
    .line 45
    const-wide/16 v35, 0x0

    .line 46
    .line 47
    const-wide/16 v37, 0x0

    .line 48
    .line 49
    const-wide/16 v39, 0x0

    .line 50
    .line 51
    const-wide/16 v41, 0x0

    .line 52
    .line 53
    const-wide/16 v43, 0x0

    .line 54
    .line 55
    const-wide/16 v45, 0x0

    .line 56
    .line 57
    const-wide/16 v47, 0x0

    .line 58
    .line 59
    const-wide/16 v49, 0x0

    .line 60
    .line 61
    const-wide/16 v51, 0x0

    .line 62
    .line 63
    const-wide/16 v53, 0x0

    .line 64
    .line 65
    const-wide/16 v55, 0x0

    .line 66
    .line 67
    const-wide/16 v57, 0x0

    .line 68
    .line 69
    const-wide/16 v59, 0x0

    .line 70
    .line 71
    const-wide/16 v61, 0x0

    .line 72
    .line 73
    const-wide/16 v63, 0x0

    .line 74
    .line 75
    const-wide/16 v65, 0x0

    .line 76
    .line 77
    const-wide/16 v67, 0x0

    .line 78
    .line 79
    const-wide/16 v69, 0x0

    .line 80
    .line 81
    const-wide/16 v71, 0x0

    .line 82
    .line 83
    const/16 v73, -0x222

    .line 84
    .line 85
    invoke-static/range {v1 .. v75}, Landroidx/compose/material3/ColorSchemeKt;->darkColorScheme-C-Xl9yA$default(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJIILjava/lang/Object;)Landroidx/compose/material3/ColorScheme;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    sput-object v0, Ld7/c;->a:Landroidx/compose/material3/ColorScheme;

    .line 90
    .line 91
    invoke-static {}, Ld7/a;->i()J

    .line 92
    .line 93
    .line 94
    move-result-wide v1

    .line 95
    invoke-static {}, Ld7/a;->m()J

    .line 96
    .line 97
    .line 98
    move-result-wide v11

    .line 99
    invoke-static {}, Ld7/a;->j()J

    .line 100
    .line 101
    .line 102
    move-result-wide v19

    .line 103
    invoke-static/range {v1 .. v75}, Landroidx/compose/material3/ColorSchemeKt;->lightColorScheme-C-Xl9yA$default(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJIILjava/lang/Object;)Landroidx/compose/material3/ColorScheme;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    sput-object v0, Ld7/c;->b:Landroidx/compose/material3/ColorScheme;

    .line 108
    .line 109
    return-void
.end method

.method public static synthetic a(ZZLkotlin/jvm/functions/Function2;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Ld7/c;->c(ZZLkotlin/jvm/functions/Function2;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final b(ZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
    .locals 12

    .line 1
    move/from16 v4, p4

    .line 2
    .line 3
    const-string v0, "content"

    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const v0, 0x1072a487

    .line 9
    .line 10
    .line 11
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 12
    .line 13
    .line 14
    move-result-object v9

    .line 15
    and-int/lit8 p3, v4, 0x6

    .line 16
    .line 17
    if-nez p3, :cond_1

    .line 18
    .line 19
    and-int/lit8 p3, p5, 0x1

    .line 20
    .line 21
    if-nez p3, :cond_0

    .line 22
    .line 23
    invoke-interface {v9, p0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 24
    .line 25
    .line 26
    move-result p3

    .line 27
    if-eqz p3, :cond_0

    .line 28
    .line 29
    const/4 p3, 0x4

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 p3, 0x2

    .line 32
    :goto_0
    or-int/2addr p3, v4

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move p3, v4

    .line 35
    :goto_1
    and-int/lit8 v1, p5, 0x2

    .line 36
    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    or-int/lit8 p3, p3, 0x30

    .line 40
    .line 41
    goto :goto_3

    .line 42
    :cond_2
    and-int/lit8 v2, v4, 0x30

    .line 43
    .line 44
    if-nez v2, :cond_4

    .line 45
    .line 46
    invoke-interface {v9, p1}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_3

    .line 51
    .line 52
    const/16 v2, 0x20

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_3
    const/16 v2, 0x10

    .line 56
    .line 57
    :goto_2
    or-int/2addr p3, v2

    .line 58
    :cond_4
    :goto_3
    and-int/lit16 v2, v4, 0x180

    .line 59
    .line 60
    if-nez v2, :cond_6

    .line 61
    .line 62
    invoke-interface {v9, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-eqz v2, :cond_5

    .line 67
    .line 68
    const/16 v2, 0x100

    .line 69
    .line 70
    goto :goto_4

    .line 71
    :cond_5
    const/16 v2, 0x80

    .line 72
    .line 73
    :goto_4
    or-int/2addr p3, v2

    .line 74
    :cond_6
    and-int/lit16 v2, p3, 0x93

    .line 75
    .line 76
    const/16 v3, 0x92

    .line 77
    .line 78
    const/4 v5, 0x0

    .line 79
    const/4 v6, 0x1

    .line 80
    if-eq v2, v3, :cond_7

    .line 81
    .line 82
    move v2, v6

    .line 83
    goto :goto_5

    .line 84
    :cond_7
    move v2, v5

    .line 85
    :goto_5
    and-int/lit8 v3, p3, 0x1

    .line 86
    .line 87
    invoke-interface {v9, v2, v3}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-eqz v2, :cond_11

    .line 92
    .line 93
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 94
    .line 95
    .line 96
    and-int/lit8 v2, v4, 0x1

    .line 97
    .line 98
    if-eqz v2, :cond_9

    .line 99
    .line 100
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-eqz v2, :cond_8

    .line 105
    .line 106
    goto :goto_6

    .line 107
    :cond_8
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 108
    .line 109
    .line 110
    and-int/lit8 v1, p5, 0x1

    .line 111
    .line 112
    if-eqz v1, :cond_b

    .line 113
    .line 114
    and-int/lit8 p3, p3, -0xf

    .line 115
    .line 116
    goto :goto_7

    .line 117
    :cond_9
    :goto_6
    and-int/lit8 v2, p5, 0x1

    .line 118
    .line 119
    if-eqz v2, :cond_a

    .line 120
    .line 121
    invoke-static {v9, v5}, Landroidx/compose/foundation/DarkThemeKt;->isSystemInDarkTheme(Landroidx/compose/runtime/Composer;I)Z

    .line 122
    .line 123
    .line 124
    move-result p0

    .line 125
    and-int/lit8 p3, p3, -0xf

    .line 126
    .line 127
    :cond_a
    if-eqz v1, :cond_b

    .line 128
    .line 129
    move p1, v6

    .line 130
    :cond_b
    :goto_7
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 131
    .line 132
    .line 133
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    if-eqz v1, :cond_c

    .line 138
    .line 139
    const/4 v1, -0x1

    .line 140
    const-string v2, "com.zykj.evaluation.ui.theme.NewEvaluationTheme (Theme.kt:40)"

    .line 141
    .line 142
    invoke-static {v0, p3, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 143
    .line 144
    .line 145
    :cond_c
    if-eqz p1, :cond_e

    .line 146
    .line 147
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 148
    .line 149
    const/16 v1, 0x1f

    .line 150
    .line 151
    if-lt v0, v1, :cond_e

    .line 152
    .line 153
    const v0, 0xd1cfe20

    .line 154
    .line 155
    .line 156
    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 157
    .line 158
    .line 159
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalContext()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    check-cast v0, Landroid/content/Context;

    .line 168
    .line 169
    if-eqz p0, :cond_d

    .line 170
    .line 171
    invoke-static {v0}, Landroidx/compose/material3/DynamicTonalPaletteKt;->dynamicDarkColorScheme(Landroid/content/Context;)Landroidx/compose/material3/ColorScheme;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    goto :goto_8

    .line 176
    :cond_d
    invoke-static {v0}, Landroidx/compose/material3/DynamicTonalPaletteKt;->dynamicLightColorScheme(Landroid/content/Context;)Landroidx/compose/material3/ColorScheme;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    :goto_8
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 181
    .line 182
    .line 183
    :goto_9
    move-object v5, v0

    .line 184
    goto :goto_a

    .line 185
    :cond_e
    if-eqz p0, :cond_f

    .line 186
    .line 187
    const v0, -0x41a4244a

    .line 188
    .line 189
    .line 190
    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 191
    .line 192
    .line 193
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 194
    .line 195
    .line 196
    sget-object v0, Ld7/c;->a:Landroidx/compose/material3/ColorScheme;

    .line 197
    .line 198
    goto :goto_9

    .line 199
    :cond_f
    const v0, -0x41a42049

    .line 200
    .line 201
    .line 202
    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 203
    .line 204
    .line 205
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 206
    .line 207
    .line 208
    sget-object v0, Ld7/c;->b:Landroidx/compose/material3/ColorScheme;

    .line 209
    .line 210
    goto :goto_9

    .line 211
    :goto_a
    invoke-static {}, Ld7/d;->a()Landroidx/compose/material3/Typography;

    .line 212
    .line 213
    .line 214
    move-result-object v7

    .line 215
    shl-int/lit8 p3, p3, 0x3

    .line 216
    .line 217
    and-int/lit16 p3, p3, 0x1c00

    .line 218
    .line 219
    or-int/lit16 v10, p3, 0x180

    .line 220
    .line 221
    const/4 v11, 0x2

    .line 222
    const/4 v6, 0x0

    .line 223
    move-object v8, p2

    .line 224
    invoke-static/range {v5 .. v11}, Landroidx/compose/material3/MaterialThemeKt;->MaterialTheme(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/Shapes;Landroidx/compose/material3/Typography;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    .line 225
    .line 226
    .line 227
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 228
    .line 229
    .line 230
    move-result p3

    .line 231
    if-eqz p3, :cond_10

    .line 232
    .line 233
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 234
    .line 235
    .line 236
    :cond_10
    :goto_b
    move v1, p0

    .line 237
    move v2, p1

    .line 238
    goto :goto_c

    .line 239
    :cond_11
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 240
    .line 241
    .line 242
    goto :goto_b

    .line 243
    :goto_c
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 244
    .line 245
    .line 246
    move-result-object p0

    .line 247
    if-eqz p0, :cond_12

    .line 248
    .line 249
    new-instance v0, Ld7/b;

    .line 250
    .line 251
    move-object v3, p2

    .line 252
    move/from16 v5, p5

    .line 253
    .line 254
    invoke-direct/range {v0 .. v5}, Ld7/b;-><init>(ZZLkotlin/jvm/functions/Function2;II)V

    .line 255
    .line 256
    .line 257
    invoke-interface {p0, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 258
    .line 259
    .line 260
    :cond_12
    return-void
.end method

.method public static final c(ZZLkotlin/jvm/functions/Function2;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 6

    .line 1
    or-int/lit8 p3, p3, 0x1

    .line 2
    .line 3
    invoke-static {p3}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 4
    .line 5
    .line 6
    move-result v4

    .line 7
    move v0, p0

    .line 8
    move v1, p1

    .line 9
    move-object v2, p2

    .line 10
    move v5, p4

    .line 11
    move-object v3, p5

    .line 12
    invoke-static/range {v0 .. v5}, Ld7/c;->b(ZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    .line 13
    .line 14
    .line 15
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    .line 17
    return-object p0
.end method
