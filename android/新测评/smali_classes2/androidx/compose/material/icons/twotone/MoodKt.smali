.class public final Landroidx/compose/material/icons/twotone/MoodKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_mood",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Mood",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getMood",
        "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;",
        "material-icons-extended_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMood.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mood.kt\nandroidx/compose/material/icons/twotone/MoodKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,93:1\n212#2,12:94\n233#2,18:107\n253#2:144\n233#2,18:145\n253#2:182\n233#2,18:183\n253#2:220\n233#2,18:221\n253#2:258\n233#2,18:259\n253#2:296\n174#3:106\n705#4,2:125\n717#4,2:127\n719#4,11:133\n705#4,2:163\n717#4,2:165\n719#4,11:171\n705#4,2:201\n717#4,2:203\n719#4,11:209\n705#4,2:239\n717#4,2:241\n719#4,11:247\n705#4,2:277\n717#4,2:279\n719#4,11:285\n72#5,4:129\n72#5,4:167\n72#5,4:205\n72#5,4:243\n72#5,4:281\n*S KotlinDebug\n*F\n+ 1 Mood.kt\nandroidx/compose/material/icons/twotone/MoodKt\n*L\n29#1:94,12\n30#1:107,18\n30#1:144\n55#1:145,18\n55#1:182\n61#1:183,18\n61#1:220\n75#1:221,18\n75#1:258\n81#1:259,18\n81#1:296\n29#1:106\n30#1:125,2\n30#1:127,2\n30#1:133,11\n55#1:163,2\n55#1:165,2\n55#1:171,11\n61#1:201,2\n61#1:203,2\n61#1:209,11\n75#1:239,2\n75#1:241,2\n75#1:247,11\n81#1:277,2\n81#1:279,2\n81#1:285,11\n30#1:129,4\n55#1:167,4\n61#1:205,4\n75#1:243,4\n81#1:281,4\n*E\n"
    }
.end annotation


# static fields
.field private static _mood:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMood(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/MoodKt;->_mood:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    new-instance v1, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 10
    .line 11
    const/high16 v0, 0x41c00000    # 24.0f

    .line 12
    .line 13
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    const/16 v11, 0x60

    .line 22
    .line 23
    const/4 v12, 0x0

    .line 24
    const/4 v10, 0x0

    .line 25
    const/high16 v5, 0x41c00000    # 24.0f

    .line 26
    .line 27
    const/high16 v6, 0x41c00000    # 24.0f

    .line 28
    .line 29
    const-wide/16 v7, 0x0

    .line 30
    .line 31
    const/4 v9, 0x0

    .line 32
    const-string v2, "TwoTone.Mood"

    .line 33
    .line 34
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 35
    .line 36
    .line 37
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 42
    .line 43
    sget-object v0, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    .line 44
    .line 45
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 46
    .line 47
    .line 48
    move-result-wide v6

    .line 49
    const/4 v2, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 51
    .line 52
    .line 53
    sget-object v18, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v19, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const/high16 v4, 0x40800000    # 4.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x3f000000    # -8.0f

    .line 78
    .line 79
    const/high16 v26, 0x41000000    # 8.0f

    .line 80
    .line 81
    const v21, -0x3f728f5c    # -4.42f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, -0x3f000000    # -8.0f

    .line 87
    .line 88
    const v24, 0x40651eb8    # 3.58f

    .line 89
    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v4, 0x40651eb8    # 3.58f

    .line 97
    .line 98
    .line 99
    const/high16 v6, 0x41000000    # 8.0f

    .line 100
    .line 101
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v4, -0x3f9ae148    # -3.58f

    .line 105
    .line 106
    .line 107
    const/high16 v6, -0x3f000000    # -8.0f

    .line 108
    .line 109
    const/high16 v7, 0x41000000    # 8.0f

    .line 110
    .line 111
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v4, 0x41780000    # 15.5f

    .line 121
    .line 122
    const/high16 v6, 0x41000000    # 8.0f

    .line 123
    .line 124
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v25, 0x3fc00000    # 1.5f

    .line 128
    .line 129
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 130
    .line 131
    const v21, 0x3f547ae1    # 0.83f

    .line 132
    .line 133
    .line 134
    const/high16 v23, 0x3fc00000    # 1.5f

    .line 135
    .line 136
    const v24, 0x3f2b851f    # 0.67f

    .line 137
    .line 138
    .line 139
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v4, -0x40d47ae1    # -0.67f

    .line 143
    .line 144
    .line 145
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 146
    .line 147
    const/high16 v7, -0x40400000    # -1.5f

    .line 148
    .line 149
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v6, -0x40400000    # -1.5f

    .line 153
    .line 154
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v4, 0x3f2b851f    # 0.67f

    .line 158
    .line 159
    .line 160
    const/high16 v6, 0x3fc00000    # 1.5f

    .line 161
    .line 162
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const/high16 v4, 0x41080000    # 8.5f

    .line 169
    .line 170
    const/high16 v6, 0x41000000    # 8.0f

    .line 171
    .line 172
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const v4, 0x411547ae    # 9.33f

    .line 179
    .line 180
    .line 181
    const/high16 v6, 0x41300000    # 11.0f

    .line 182
    .line 183
    const/high16 v7, 0x41080000    # 8.5f

    .line 184
    .line 185
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v4, 0x412547ae    # 10.33f

    .line 189
    .line 190
    .line 191
    const/high16 v6, 0x40e00000    # 7.0f

    .line 192
    .line 193
    const/high16 v7, 0x41180000    # 9.5f

    .line 194
    .line 195
    invoke-virtual {v2, v6, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v4, 0x40f570a4    # 7.67f

    .line 199
    .line 200
    .line 201
    const/high16 v6, 0x41080000    # 8.5f

    .line 202
    .line 203
    const/high16 v7, 0x41000000    # 8.0f

    .line 204
    .line 205
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    const/high16 v4, 0x418c0000    # 17.5f

    .line 212
    .line 213
    const/high16 v6, 0x41400000    # 12.0f

    .line 214
    .line 215
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v25, -0x3f5c7ae1    # -5.11f

    .line 219
    .line 220
    .line 221
    const/high16 v26, -0x3fa00000    # -3.5f

    .line 222
    .line 223
    const v21, -0x3feae148    # -2.33f

    .line 224
    .line 225
    .line 226
    const v23, -0x3f76147b    # -4.31f

    .line 227
    .line 228
    .line 229
    const v24, -0x40451eb8    # -1.46f

    .line 230
    .line 231
    .line 232
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v4, 0x4123851f    # 10.22f

    .line 236
    .line 237
    .line 238
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const/high16 v26, 0x40600000    # 3.5f

    .line 242
    .line 243
    const v21, -0x40b33333    # -0.8f

    .line 244
    .line 245
    .line 246
    const v22, 0x40028f5c    # 2.04f

    .line 247
    .line 248
    .line 249
    const v23, -0x3fce147b    # -2.78f

    .line 250
    .line 251
    .line 252
    const/high16 v24, 0x40600000    # 3.5f

    .line 253
    .line 254
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    const/16 v16, 0x3800

    .line 265
    .line 266
    const/16 v17, 0x0

    .line 267
    .line 268
    const v6, 0x3e99999a    # 0.3f

    .line 269
    .line 270
    .line 271
    const v8, 0x3e99999a    # 0.3f

    .line 272
    .line 273
    .line 274
    const/4 v7, 0x0

    .line 275
    const/high16 v9, 0x3f800000    # 1.0f

    .line 276
    .line 277
    const/high16 v12, 0x3f800000    # 1.0f

    .line 278
    .line 279
    const/4 v13, 0x0

    .line 280
    const/4 v14, 0x0

    .line 281
    const/4 v15, 0x0

    .line 282
    const-string v4, ""

    .line 283
    .line 284
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 285
    .line 286
    .line 287
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 288
    .line 289
    .line 290
    move-result v3

    .line 291
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 292
    .line 293
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 294
    .line 295
    .line 296
    move-result-wide v6

    .line 297
    const/4 v2, 0x0

    .line 298
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 299
    .line 300
    .line 301
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 302
    .line 303
    .line 304
    move-result v10

    .line 305
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 306
    .line 307
    .line 308
    move-result v11

    .line 309
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 312
    .line 313
    .line 314
    const/high16 v4, 0x41180000    # 9.5f

    .line 315
    .line 316
    const/high16 v6, 0x41080000    # 8.5f

    .line 317
    .line 318
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/4 v4, 0x0

    .line 322
    const/high16 v6, -0x40400000    # -1.5f

    .line 323
    .line 324
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/high16 v26, 0x40400000    # 3.0f

    .line 328
    .line 329
    const/16 v27, 0x0

    .line 330
    .line 331
    const/high16 v21, 0x3fc00000    # 1.5f

    .line 332
    .line 333
    const/high16 v22, 0x3fc00000    # 1.5f

    .line 334
    .line 335
    const/16 v23, 0x0

    .line 336
    .line 337
    const/16 v24, 0x1

    .line 338
    .line 339
    const/16 v25, 0x1

    .line 340
    .line 341
    move-object/from16 v20, v2

    .line 342
    .line 343
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 344
    .line 345
    .line 346
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 347
    .line 348
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    const/high16 v6, 0x3f800000    # 1.0f

    .line 356
    .line 357
    const/high16 v8, 0x3f800000    # 1.0f

    .line 358
    .line 359
    const/4 v7, 0x0

    .line 360
    const-string v4, ""

    .line 361
    .line 362
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 363
    .line 364
    .line 365
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 366
    .line 367
    .line 368
    move-result v3

    .line 369
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 370
    .line 371
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 372
    .line 373
    .line 374
    move-result-wide v6

    .line 375
    const/4 v2, 0x0

    .line 376
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 377
    .line 378
    .line 379
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 380
    .line 381
    .line 382
    move-result v10

    .line 383
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 384
    .line 385
    .line 386
    move-result v11

    .line 387
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 390
    .line 391
    .line 392
    const v4, 0x413fd70a    # 11.99f

    .line 393
    .line 394
    .line 395
    const/high16 v6, 0x40000000    # 2.0f

    .line 396
    .line 397
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v25, 0x40000000    # 2.0f

    .line 401
    .line 402
    const/high16 v26, 0x41400000    # 12.0f

    .line 403
    .line 404
    const v21, 0x40cf0a3d    # 6.47f

    .line 405
    .line 406
    .line 407
    const/high16 v22, 0x40000000    # 2.0f

    .line 408
    .line 409
    const/high16 v23, 0x40000000    # 2.0f

    .line 410
    .line 411
    const v24, 0x40cf5c29    # 6.48f

    .line 412
    .line 413
    .line 414
    move-object/from16 v20, v2

    .line 415
    .line 416
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    const v4, 0x408f0a3d    # 4.47f

    .line 420
    .line 421
    .line 422
    const v6, 0x411fd70a    # 9.99f

    .line 423
    .line 424
    .line 425
    const/high16 v7, 0x41200000    # 10.0f

    .line 426
    .line 427
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const/high16 v25, 0x41b00000    # 22.0f

    .line 431
    .line 432
    const v21, 0x418c28f6    # 17.52f

    .line 433
    .line 434
    .line 435
    const/high16 v22, 0x41b00000    # 22.0f

    .line 436
    .line 437
    const/high16 v23, 0x41b00000    # 22.0f

    .line 438
    .line 439
    const v24, 0x418c28f6    # 17.52f

    .line 440
    .line 441
    .line 442
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const v4, 0x418c28f6    # 17.52f

    .line 446
    .line 447
    .line 448
    const v6, 0x413fd70a    # 11.99f

    .line 449
    .line 450
    .line 451
    const/high16 v7, 0x40000000    # 2.0f

    .line 452
    .line 453
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const/high16 v4, 0x41a00000    # 20.0f

    .line 460
    .line 461
    const/high16 v6, 0x41400000    # 12.0f

    .line 462
    .line 463
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const/high16 v25, -0x3f000000    # -8.0f

    .line 467
    .line 468
    const/high16 v26, -0x3f000000    # -8.0f

    .line 469
    .line 470
    const v21, -0x3f728f5c    # -4.42f

    .line 471
    .line 472
    .line 473
    const/16 v22, 0x0

    .line 474
    .line 475
    const/high16 v23, -0x3f000000    # -8.0f

    .line 476
    .line 477
    const v24, -0x3f9ae148    # -3.58f

    .line 478
    .line 479
    .line 480
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const v4, 0x40651eb8    # 3.58f

    .line 484
    .line 485
    .line 486
    const/high16 v6, -0x3f000000    # -8.0f

    .line 487
    .line 488
    const/high16 v7, 0x41000000    # 8.0f

    .line 489
    .line 490
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const/high16 v6, 0x41000000    # 8.0f

    .line 494
    .line 495
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const v4, -0x3f9ae148    # -3.58f

    .line 499
    .line 500
    .line 501
    const/high16 v6, -0x3f000000    # -8.0f

    .line 502
    .line 503
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 510
    .line 511
    .line 512
    move-result-object v2

    .line 513
    const/high16 v6, 0x3f800000    # 1.0f

    .line 514
    .line 515
    const/4 v7, 0x0

    .line 516
    const-string v4, ""

    .line 517
    .line 518
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 519
    .line 520
    .line 521
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 522
    .line 523
    .line 524
    move-result v3

    .line 525
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 526
    .line 527
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 528
    .line 529
    .line 530
    move-result-wide v6

    .line 531
    const/4 v2, 0x0

    .line 532
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 533
    .line 534
    .line 535
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 536
    .line 537
    .line 538
    move-result v10

    .line 539
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 540
    .line 541
    .line 542
    move-result v11

    .line 543
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 544
    .line 545
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 546
    .line 547
    .line 548
    const/high16 v4, 0x41780000    # 15.5f

    .line 549
    .line 550
    const/high16 v6, 0x41180000    # 9.5f

    .line 551
    .line 552
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const/4 v4, 0x0

    .line 556
    const/high16 v6, -0x40400000    # -1.5f

    .line 557
    .line 558
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const/high16 v26, 0x40400000    # 3.0f

    .line 562
    .line 563
    const/high16 v21, 0x3fc00000    # 1.5f

    .line 564
    .line 565
    const/high16 v22, 0x3fc00000    # 1.5f

    .line 566
    .line 567
    const/16 v23, 0x0

    .line 568
    .line 569
    const/16 v24, 0x1

    .line 570
    .line 571
    const/16 v25, 0x1

    .line 572
    .line 573
    move-object/from16 v20, v2

    .line 574
    .line 575
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 576
    .line 577
    .line 578
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 579
    .line 580
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 581
    .line 582
    .line 583
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 584
    .line 585
    .line 586
    move-result-object v2

    .line 587
    const/high16 v6, 0x3f800000    # 1.0f

    .line 588
    .line 589
    const/4 v7, 0x0

    .line 590
    const-string v4, ""

    .line 591
    .line 592
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 593
    .line 594
    .line 595
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 596
    .line 597
    .line 598
    move-result v3

    .line 599
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 600
    .line 601
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 602
    .line 603
    .line 604
    move-result-wide v6

    .line 605
    const/4 v0, 0x0

    .line 606
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 607
    .line 608
    .line 609
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 610
    .line 611
    .line 612
    move-result v10

    .line 613
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 614
    .line 615
    .line 616
    move-result v11

    .line 617
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 620
    .line 621
    .line 622
    const/high16 v0, 0x418c0000    # 17.5f

    .line 623
    .line 624
    const/high16 v2, 0x41400000    # 12.0f

    .line 625
    .line 626
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 627
    .line 628
    .line 629
    const v17, 0x40a3851f    # 5.11f

    .line 630
    .line 631
    .line 632
    const/high16 v18, -0x3fa00000    # -3.5f

    .line 633
    .line 634
    const v13, 0x40151eb8    # 2.33f

    .line 635
    .line 636
    .line 637
    const v15, 0x4089eb85    # 4.31f

    .line 638
    .line 639
    .line 640
    const v16, -0x40451eb8    # -1.46f

    .line 641
    .line 642
    .line 643
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 644
    .line 645
    .line 646
    const v0, 0x40dc7ae1    # 6.89f

    .line 647
    .line 648
    .line 649
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    const/high16 v18, 0x40600000    # 3.5f

    .line 653
    .line 654
    const v13, 0x3f4ccccd    # 0.8f

    .line 655
    .line 656
    .line 657
    const v14, 0x40028f5c    # 2.04f

    .line 658
    .line 659
    .line 660
    const v15, 0x4031eb85    # 2.78f

    .line 661
    .line 662
    .line 663
    const/high16 v16, 0x40600000    # 3.5f

    .line 664
    .line 665
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 669
    .line 670
    .line 671
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 672
    .line 673
    .line 674
    move-result-object v2

    .line 675
    const/16 v16, 0x3800

    .line 676
    .line 677
    const/16 v17, 0x0

    .line 678
    .line 679
    const/high16 v6, 0x3f800000    # 1.0f

    .line 680
    .line 681
    const/4 v7, 0x0

    .line 682
    const/high16 v12, 0x3f800000    # 1.0f

    .line 683
    .line 684
    const/4 v13, 0x0

    .line 685
    const/4 v14, 0x0

    .line 686
    const/4 v15, 0x0

    .line 687
    const-string v4, ""

    .line 688
    .line 689
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 690
    .line 691
    .line 692
    move-result-object v0

    .line 693
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 694
    .line 695
    .line 696
    move-result-object v0

    .line 697
    sput-object v0, Landroidx/compose/material/icons/twotone/MoodKt;->_mood:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 698
    .line 699
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 700
    .line 701
    .line 702
    return-object v0
.end method
