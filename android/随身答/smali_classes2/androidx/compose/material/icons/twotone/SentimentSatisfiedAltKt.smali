.class public final Landroidx/compose/material/icons/twotone/SentimentSatisfiedAltKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_sentimentSatisfiedAlt",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "SentimentSatisfiedAlt",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getSentimentSatisfiedAlt",
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
        "SMAP\nSentimentSatisfiedAlt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SentimentSatisfiedAlt.kt\nandroidx/compose/material/icons/twotone/SentimentSatisfiedAltKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,97:1\n212#2,12:98\n233#2,18:111\n253#2:148\n233#2,18:149\n253#2:186\n233#2,18:187\n253#2:224\n233#2,18:225\n253#2:262\n174#3:110\n705#4,2:129\n717#4,2:131\n719#4,11:137\n705#4,2:167\n717#4,2:169\n719#4,11:175\n705#4,2:205\n717#4,2:207\n719#4,11:213\n705#4,2:243\n717#4,2:245\n719#4,11:251\n72#5,4:133\n72#5,4:171\n72#5,4:209\n72#5,4:247\n*S KotlinDebug\n*F\n+ 1 SentimentSatisfiedAlt.kt\nandroidx/compose/material/icons/twotone/SentimentSatisfiedAltKt\n*L\n29#1:98,12\n30#1:111,18\n30#1:148\n58#1:149,18\n58#1:186\n64#1:187,18\n64#1:224\n70#1:225,18\n70#1:262\n29#1:110\n30#1:129,2\n30#1:131,2\n30#1:137,11\n58#1:167,2\n58#1:169,2\n58#1:175,11\n64#1:205,2\n64#1:207,2\n64#1:213,11\n70#1:243,2\n70#1:245,2\n70#1:251,11\n30#1:133,4\n58#1:171,4\n64#1:209,4\n70#1:247,4\n*E\n"
    }
.end annotation


# static fields
.field private static _sentimentSatisfiedAlt:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getSentimentSatisfiedAlt(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/SentimentSatisfiedAltKt;->_sentimentSatisfiedAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.SentimentSatisfiedAlt"

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
    const v25, -0x3f5c28f6    # -5.12f

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
    const v23, -0x3f75c28f    # -4.32f

    .line 227
    .line 228
    .line 229
    const v24, -0x40466666    # -1.45f

    .line 230
    .line 231
    .line 232
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v4, 0x3fd5c28f    # 1.67f

    .line 236
    .line 237
    .line 238
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const v25, 0x405ccccd    # 3.45f

    .line 242
    .line 243
    .line 244
    const/high16 v26, 0x40000000    # 2.0f

    .line 245
    .line 246
    const v21, 0x3f333333    # 0.7f

    .line 247
    .line 248
    .line 249
    const v22, 0x3f9851ec    # 1.19f

    .line 250
    .line 251
    .line 252
    const v23, 0x3ffc28f6    # 1.97f

    .line 253
    .line 254
    .line 255
    const/high16 v24, 0x40000000    # 2.0f

    .line 256
    .line 257
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const v4, 0x405ccccd    # 3.45f

    .line 261
    .line 262
    .line 263
    const/high16 v6, -0x40000000    # -2.0f

    .line 264
    .line 265
    const v7, 0x4030a3d7    # 2.76f

    .line 266
    .line 267
    .line 268
    const v8, -0x40b0a3d7    # -0.81f

    .line 269
    .line 270
    .line 271
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 272
    .line 273
    .line 274
    const v4, 0x3fd5c28f    # 1.67f

    .line 275
    .line 276
    .line 277
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v25, -0x3f5c28f6    # -5.12f

    .line 281
    .line 282
    .line 283
    const/high16 v26, 0x40600000    # 3.5f

    .line 284
    .line 285
    const v21, -0x40b33333    # -0.8f

    .line 286
    .line 287
    .line 288
    const v22, 0x40033333    # 2.05f

    .line 289
    .line 290
    .line 291
    const v23, -0x3fcd70a4    # -2.79f

    .line 292
    .line 293
    .line 294
    const/high16 v24, 0x40600000    # 3.5f

    .line 295
    .line 296
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 303
    .line 304
    .line 305
    move-result-object v2

    .line 306
    const/16 v16, 0x3800

    .line 307
    .line 308
    const/16 v17, 0x0

    .line 309
    .line 310
    const v6, 0x3e99999a    # 0.3f

    .line 311
    .line 312
    .line 313
    const v8, 0x3e99999a    # 0.3f

    .line 314
    .line 315
    .line 316
    const/4 v7, 0x0

    .line 317
    const/high16 v9, 0x3f800000    # 1.0f

    .line 318
    .line 319
    const/high16 v12, 0x3f800000    # 1.0f

    .line 320
    .line 321
    const/4 v13, 0x0

    .line 322
    const/4 v14, 0x0

    .line 323
    const/4 v15, 0x0

    .line 324
    const-string v4, ""

    .line 325
    .line 326
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 327
    .line 328
    .line 329
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 330
    .line 331
    .line 332
    move-result v3

    .line 333
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 334
    .line 335
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 336
    .line 337
    .line 338
    move-result-wide v6

    .line 339
    const/4 v2, 0x0

    .line 340
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 341
    .line 342
    .line 343
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 344
    .line 345
    .line 346
    move-result v10

    .line 347
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 348
    .line 349
    .line 350
    move-result v11

    .line 351
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 354
    .line 355
    .line 356
    const/high16 v4, 0x41780000    # 15.5f

    .line 357
    .line 358
    const/high16 v6, 0x41180000    # 9.5f

    .line 359
    .line 360
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const/4 v4, 0x0

    .line 364
    const/high16 v6, -0x40400000    # -1.5f

    .line 365
    .line 366
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const/high16 v26, 0x40400000    # 3.0f

    .line 370
    .line 371
    const/16 v27, 0x0

    .line 372
    .line 373
    const/high16 v21, 0x3fc00000    # 1.5f

    .line 374
    .line 375
    const/high16 v22, 0x3fc00000    # 1.5f

    .line 376
    .line 377
    const/16 v23, 0x0

    .line 378
    .line 379
    const/16 v24, 0x1

    .line 380
    .line 381
    const/16 v25, 0x1

    .line 382
    .line 383
    move-object/from16 v20, v2

    .line 384
    .line 385
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 389
    .line 390
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 394
    .line 395
    .line 396
    move-result-object v2

    .line 397
    const/high16 v6, 0x3f800000    # 1.0f

    .line 398
    .line 399
    const/high16 v8, 0x3f800000    # 1.0f

    .line 400
    .line 401
    const/4 v7, 0x0

    .line 402
    const-string v4, ""

    .line 403
    .line 404
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 405
    .line 406
    .line 407
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 408
    .line 409
    .line 410
    move-result v3

    .line 411
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 412
    .line 413
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 414
    .line 415
    .line 416
    move-result-wide v6

    .line 417
    const/4 v2, 0x0

    .line 418
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 419
    .line 420
    .line 421
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 422
    .line 423
    .line 424
    move-result v10

    .line 425
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 426
    .line 427
    .line 428
    move-result v11

    .line 429
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 430
    .line 431
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 432
    .line 433
    .line 434
    const/high16 v4, 0x41180000    # 9.5f

    .line 435
    .line 436
    const/high16 v6, 0x41080000    # 8.5f

    .line 437
    .line 438
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const/4 v4, 0x0

    .line 442
    const/high16 v6, -0x40400000    # -1.5f

    .line 443
    .line 444
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const/high16 v26, 0x40400000    # 3.0f

    .line 448
    .line 449
    move-object/from16 v20, v2

    .line 450
    .line 451
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 455
    .line 456
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 460
    .line 461
    .line 462
    move-result-object v2

    .line 463
    const/high16 v6, 0x3f800000    # 1.0f

    .line 464
    .line 465
    const/4 v7, 0x0

    .line 466
    const-string v4, ""

    .line 467
    .line 468
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 469
    .line 470
    .line 471
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 472
    .line 473
    .line 474
    move-result v3

    .line 475
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 476
    .line 477
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 478
    .line 479
    .line 480
    move-result-wide v6

    .line 481
    const/4 v0, 0x0

    .line 482
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 483
    .line 484
    .line 485
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 486
    .line 487
    .line 488
    move-result v10

    .line 489
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 490
    .line 491
    .line 492
    move-result v11

    .line 493
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 494
    .line 495
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 496
    .line 497
    .line 498
    const/high16 v0, 0x41800000    # 16.0f

    .line 499
    .line 500
    const/high16 v2, 0x41400000    # 12.0f

    .line 501
    .line 502
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 503
    .line 504
    .line 505
    const v17, -0x3fa33333    # -3.45f

    .line 506
    .line 507
    .line 508
    const/high16 v18, -0x40000000    # -2.0f

    .line 509
    .line 510
    const v13, -0x40428f5c    # -1.48f

    .line 511
    .line 512
    .line 513
    const/high16 v15, -0x3fd00000    # -2.75f

    .line 514
    .line 515
    const v16, -0x40b0a3d7    # -0.81f

    .line 516
    .line 517
    .line 518
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const v0, 0x40dc28f6    # 6.88f

    .line 522
    .line 523
    .line 524
    const/high16 v2, 0x41600000    # 14.0f

    .line 525
    .line 526
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 527
    .line 528
    .line 529
    const v17, 0x40a3d70a    # 5.12f

    .line 530
    .line 531
    .line 532
    const/high16 v18, 0x40600000    # 3.5f

    .line 533
    .line 534
    const v13, 0x3f4ccccd    # 0.8f

    .line 535
    .line 536
    .line 537
    const v14, 0x40033333    # 2.05f

    .line 538
    .line 539
    .line 540
    const v15, 0x40328f5c    # 2.79f

    .line 541
    .line 542
    .line 543
    const/high16 v16, 0x40600000    # 3.5f

    .line 544
    .line 545
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const v0, 0x40a3d70a    # 5.12f

    .line 549
    .line 550
    .line 551
    const/high16 v2, -0x3fa00000    # -3.5f

    .line 552
    .line 553
    const v4, 0x408a3d71    # 4.32f

    .line 554
    .line 555
    .line 556
    const v6, -0x40466666    # -1.45f

    .line 557
    .line 558
    .line 559
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const v0, -0x402a3d71    # -1.67f

    .line 563
    .line 564
    .line 565
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    const v17, -0x3fa33333    # -3.45f

    .line 569
    .line 570
    .line 571
    const/high16 v18, 0x40000000    # 2.0f

    .line 572
    .line 573
    const v13, -0x40cf5c29    # -0.69f

    .line 574
    .line 575
    .line 576
    const v14, 0x3f9851ec    # 1.19f

    .line 577
    .line 578
    .line 579
    const v15, -0x4003d70a    # -1.97f

    .line 580
    .line 581
    .line 582
    const/high16 v16, 0x40000000    # 2.0f

    .line 583
    .line 584
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 585
    .line 586
    .line 587
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const v0, 0x413fd70a    # 11.99f

    .line 591
    .line 592
    .line 593
    const/high16 v2, 0x40000000    # 2.0f

    .line 594
    .line 595
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const/high16 v17, 0x40000000    # 2.0f

    .line 599
    .line 600
    const/high16 v18, 0x41400000    # 12.0f

    .line 601
    .line 602
    const v13, 0x40cf0a3d    # 6.47f

    .line 603
    .line 604
    .line 605
    const/high16 v14, 0x40000000    # 2.0f

    .line 606
    .line 607
    const/high16 v15, 0x40000000    # 2.0f

    .line 608
    .line 609
    const v16, 0x40cf5c29    # 6.48f

    .line 610
    .line 611
    .line 612
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 613
    .line 614
    .line 615
    const v0, 0x408f0a3d    # 4.47f

    .line 616
    .line 617
    .line 618
    const v2, 0x411fd70a    # 9.99f

    .line 619
    .line 620
    .line 621
    const/high16 v4, 0x41200000    # 10.0f

    .line 622
    .line 623
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    const/high16 v17, 0x41b00000    # 22.0f

    .line 627
    .line 628
    const v13, 0x418c28f6    # 17.52f

    .line 629
    .line 630
    .line 631
    const/high16 v14, 0x41b00000    # 22.0f

    .line 632
    .line 633
    const/high16 v15, 0x41b00000    # 22.0f

    .line 634
    .line 635
    const v16, 0x418c28f6    # 17.52f

    .line 636
    .line 637
    .line 638
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    const v0, 0x418c28f6    # 17.52f

    .line 642
    .line 643
    .line 644
    const v2, 0x413fd70a    # 11.99f

    .line 645
    .line 646
    .line 647
    const/high16 v4, 0x40000000    # 2.0f

    .line 648
    .line 649
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 650
    .line 651
    .line 652
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    const/high16 v0, 0x41a00000    # 20.0f

    .line 656
    .line 657
    const/high16 v2, 0x41400000    # 12.0f

    .line 658
    .line 659
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const/high16 v17, -0x3f000000    # -8.0f

    .line 663
    .line 664
    const/high16 v18, -0x3f000000    # -8.0f

    .line 665
    .line 666
    const v13, -0x3f728f5c    # -4.42f

    .line 667
    .line 668
    .line 669
    const/4 v14, 0x0

    .line 670
    const/high16 v15, -0x3f000000    # -8.0f

    .line 671
    .line 672
    const v16, -0x3f9ae148    # -3.58f

    .line 673
    .line 674
    .line 675
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 676
    .line 677
    .line 678
    const v0, 0x40651eb8    # 3.58f

    .line 679
    .line 680
    .line 681
    const/high16 v2, -0x3f000000    # -8.0f

    .line 682
    .line 683
    const/high16 v4, 0x41000000    # 8.0f

    .line 684
    .line 685
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 686
    .line 687
    .line 688
    const/high16 v2, 0x41000000    # 8.0f

    .line 689
    .line 690
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 691
    .line 692
    .line 693
    const v0, -0x3f9ae148    # -3.58f

    .line 694
    .line 695
    .line 696
    const/high16 v2, -0x3f000000    # -8.0f

    .line 697
    .line 698
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 702
    .line 703
    .line 704
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 705
    .line 706
    .line 707
    move-result-object v2

    .line 708
    const/16 v16, 0x3800

    .line 709
    .line 710
    const/16 v17, 0x0

    .line 711
    .line 712
    const/high16 v6, 0x3f800000    # 1.0f

    .line 713
    .line 714
    const/4 v7, 0x0

    .line 715
    const/high16 v12, 0x3f800000    # 1.0f

    .line 716
    .line 717
    const/4 v13, 0x0

    .line 718
    const/4 v15, 0x0

    .line 719
    const-string v4, ""

    .line 720
    .line 721
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 722
    .line 723
    .line 724
    move-result-object v0

    .line 725
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 726
    .line 727
    .line 728
    move-result-object v0

    .line 729
    sput-object v0, Landroidx/compose/material/icons/twotone/SentimentSatisfiedAltKt;->_sentimentSatisfiedAlt:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 730
    .line 731
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 732
    .line 733
    .line 734
    return-object v0
.end method
