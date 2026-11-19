.class public final Landroidx/compose/material/icons/twotone/PlayLessonKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_playLesson",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "PlayLesson",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getPlayLesson",
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
        "SMAP\nPlayLesson.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlayLesson.kt\nandroidx/compose/material/icons/twotone/PlayLessonKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,86:1\n212#2,12:87\n233#2,18:100\n253#2:137\n233#2,18:138\n253#2:175\n233#2,18:176\n253#2:213\n174#3:99\n705#4,2:118\n717#4,2:120\n719#4,11:126\n705#4,2:156\n717#4,2:158\n719#4,11:164\n705#4,2:194\n717#4,2:196\n719#4,11:202\n72#5,4:122\n72#5,4:160\n72#5,4:198\n*S KotlinDebug\n*F\n+ 1 PlayLesson.kt\nandroidx/compose/material/icons/twotone/PlayLessonKt\n*L\n29#1:87,12\n30#1:100,18\n30#1:137\n45#1:138,18\n45#1:175\n68#1:176,18\n68#1:213\n29#1:99\n30#1:118,2\n30#1:120,2\n30#1:126,11\n45#1:156,2\n45#1:158,2\n45#1:164,11\n68#1:194,2\n68#1:196,2\n68#1:202,11\n30#1:122,4\n45#1:160,4\n68#1:198,4\n*E\n"
    }
.end annotation


# static fields
.field private static _playLesson:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPlayLesson(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/PlayLessonKt;->_playLesson:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.PlayLesson"

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
    const/high16 v4, 0x41400000    # 12.0f

    .line 71
    .line 72
    const/high16 v6, 0x40800000    # 4.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x40e00000    # 7.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x41180000    # 9.5f

    .line 83
    .line 84
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v4, 0x41300000    # 11.0f

    .line 88
    .line 89
    const/high16 v6, 0x40e00000    # 7.0f

    .line 90
    .line 91
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const/high16 v4, 0x40800000    # 4.0f

    .line 95
    .line 96
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v4, 0x40a00000    # 5.0f

    .line 100
    .line 101
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v4, 0x41800000    # 16.0f

    .line 105
    .line 106
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v4, 0x40c947ae    # 6.29f

    .line 110
    .line 111
    .line 112
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const/high16 v25, 0x41300000    # 11.0f

    .line 116
    .line 117
    const/high16 v26, 0x41900000    # 18.0f

    .line 118
    .line 119
    const v21, 0x4131999a    # 11.1f

    .line 120
    .line 121
    .line 122
    const v22, 0x419af5c3    # 19.37f

    .line 123
    .line 124
    .line 125
    const/high16 v23, 0x41300000    # 11.0f

    .line 126
    .line 127
    const v24, 0x4195999a    # 18.7f

    .line 128
    .line 129
    .line 130
    move-object/from16 v20, v2

    .line 131
    .line 132
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v25, 0x40c00000    # 6.0f

    .line 136
    .line 137
    const v26, -0x3f228f5c    # -6.92f

    .line 138
    .line 139
    .line 140
    const/16 v21, 0x0

    .line 141
    .line 142
    const v22, -0x3f9e147b    # -3.53f

    .line 143
    .line 144
    .line 145
    const v23, 0x40270a3d    # 2.61f

    .line 146
    .line 147
    .line 148
    const v24, -0x3f323d71    # -6.43f

    .line 149
    .line 150
    .line 151
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const/high16 v4, 0x40800000    # 4.0f

    .line 155
    .line 156
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v4, 0x41400000    # 12.0f

    .line 160
    .line 161
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    const/16 v16, 0x3800

    .line 172
    .line 173
    const/16 v17, 0x0

    .line 174
    .line 175
    const v6, 0x3e99999a    # 0.3f

    .line 176
    .line 177
    .line 178
    const v8, 0x3e99999a    # 0.3f

    .line 179
    .line 180
    .line 181
    const/4 v7, 0x0

    .line 182
    const/high16 v9, 0x3f800000    # 1.0f

    .line 183
    .line 184
    const/high16 v12, 0x3f800000    # 1.0f

    .line 185
    .line 186
    const/4 v13, 0x0

    .line 187
    const/4 v14, 0x0

    .line 188
    const/4 v15, 0x0

    .line 189
    const-string v4, ""

    .line 190
    .line 191
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 192
    .line 193
    .line 194
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 195
    .line 196
    .line 197
    move-result v3

    .line 198
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 199
    .line 200
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 201
    .line 202
    .line 203
    move-result-wide v6

    .line 204
    const/4 v2, 0x0

    .line 205
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 209
    .line 210
    .line 211
    move-result v10

    .line 212
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 213
    .line 214
    .line 215
    move-result v11

    .line 216
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 219
    .line 220
    .line 221
    const/high16 v4, 0x41a00000    # 20.0f

    .line 222
    .line 223
    const/high16 v6, 0x40a00000    # 5.0f

    .line 224
    .line 225
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v4, 0x40800000    # 4.0f

    .line 229
    .line 230
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const/high16 v4, 0x40000000    # 2.0f

    .line 234
    .line 235
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const/high16 v4, 0x40e00000    # 7.0f

    .line 239
    .line 240
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 241
    .line 242
    .line 243
    const/high16 v4, -0x40400000    # -1.5f

    .line 244
    .line 245
    const/high16 v6, 0x40200000    # 2.5f

    .line 246
    .line 247
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const/high16 v4, 0x41300000    # 11.0f

    .line 251
    .line 252
    const/high16 v6, 0x41400000    # 12.0f

    .line 253
    .line 254
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 255
    .line 256
    .line 257
    const/high16 v4, 0x40800000    # 4.0f

    .line 258
    .line 259
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const/high16 v4, 0x40a00000    # 5.0f

    .line 263
    .line 264
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 265
    .line 266
    .line 267
    const v4, 0x40e28f5c    # 7.08f

    .line 268
    .line 269
    .line 270
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const/high16 v25, 0x3f800000    # 1.0f

    .line 274
    .line 275
    const v26, -0x425c28f6    # -0.08f

    .line 276
    .line 277
    .line 278
    const v21, 0x3ea8f5c3    # 0.33f

    .line 279
    .line 280
    .line 281
    const v22, -0x42b33333    # -0.05f

    .line 282
    .line 283
    .line 284
    const v23, 0x3f28f5c3    # 0.66f

    .line 285
    .line 286
    .line 287
    const v24, -0x425c28f6    # -0.08f

    .line 288
    .line 289
    .line 290
    move-object/from16 v20, v2

    .line 291
    .line 292
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v4, 0x3f800000    # 1.0f

    .line 296
    .line 297
    const v6, 0x3da3d70a    # 0.08f

    .line 298
    .line 299
    .line 300
    const v7, 0x3f2b851f    # 0.67f

    .line 301
    .line 302
    .line 303
    const v8, 0x3cf5c28f    # 0.03f

    .line 304
    .line 305
    .line 306
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const/high16 v4, 0x40800000    # 4.0f

    .line 310
    .line 311
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const/high16 v25, -0x40000000    # -2.0f

    .line 315
    .line 316
    const/high16 v26, -0x40000000    # -2.0f

    .line 317
    .line 318
    const/16 v21, 0x0

    .line 319
    .line 320
    const v22, -0x40733333    # -1.1f

    .line 321
    .line 322
    .line 323
    const v23, -0x4099999a    # -0.9f

    .line 324
    .line 325
    .line 326
    const/high16 v24, -0x40000000    # -2.0f

    .line 327
    .line 328
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 329
    .line 330
    .line 331
    const/high16 v4, 0x40a00000    # 5.0f

    .line 332
    .line 333
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    const/high16 v25, 0x40400000    # 3.0f

    .line 337
    .line 338
    const/high16 v26, 0x40800000    # 4.0f

    .line 339
    .line 340
    const v21, 0x4079999a    # 3.9f

    .line 341
    .line 342
    .line 343
    const/high16 v22, 0x40000000    # 2.0f

    .line 344
    .line 345
    const/high16 v23, 0x40400000    # 3.0f

    .line 346
    .line 347
    const v24, 0x4039999a    # 2.9f

    .line 348
    .line 349
    .line 350
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const/high16 v4, 0x41800000    # 16.0f

    .line 354
    .line 355
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v25, 0x40000000    # 2.0f

    .line 359
    .line 360
    const/high16 v26, 0x40000000    # 2.0f

    .line 361
    .line 362
    const/16 v21, 0x0

    .line 363
    .line 364
    const v22, 0x3f8ccccd    # 1.1f

    .line 365
    .line 366
    .line 367
    const v23, 0x3f666666    # 0.9f

    .line 368
    .line 369
    .line 370
    const/high16 v24, 0x40000000    # 2.0f

    .line 371
    .line 372
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v4, 0x40e851ec    # 7.26f

    .line 376
    .line 377
    .line 378
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 379
    .line 380
    .line 381
    const v25, -0x4087ae14    # -0.97f

    .line 382
    .line 383
    .line 384
    const/high16 v26, -0x40000000    # -2.0f

    .line 385
    .line 386
    const v21, -0x4128f5c3    # -0.42f

    .line 387
    .line 388
    .line 389
    const v22, -0x40e66666    # -0.6f

    .line 390
    .line 391
    .line 392
    const/high16 v23, -0x40c00000    # -0.75f

    .line 393
    .line 394
    const v24, -0x405c28f6    # -1.28f

    .line 395
    .line 396
    .line 397
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v4, 0x40a00000    # 5.0f

    .line 401
    .line 402
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 409
    .line 410
    .line 411
    move-result-object v2

    .line 412
    const/high16 v6, 0x3f800000    # 1.0f

    .line 413
    .line 414
    const/high16 v8, 0x3f800000    # 1.0f

    .line 415
    .line 416
    const/4 v7, 0x0

    .line 417
    const-string v4, ""

    .line 418
    .line 419
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 420
    .line 421
    .line 422
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 423
    .line 424
    .line 425
    move-result v3

    .line 426
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 427
    .line 428
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 429
    .line 430
    .line 431
    move-result-wide v6

    .line 432
    const/4 v0, 0x0

    .line 433
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 434
    .line 435
    .line 436
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 437
    .line 438
    .line 439
    move-result v10

    .line 440
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 441
    .line 442
    .line 443
    move-result v11

    .line 444
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 447
    .line 448
    .line 449
    const/high16 v0, 0x41900000    # 18.0f

    .line 450
    .line 451
    const/high16 v2, 0x41500000    # 13.0f

    .line 452
    .line 453
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const/high16 v17, -0x3f600000    # -5.0f

    .line 457
    .line 458
    const/high16 v18, 0x40a00000    # 5.0f

    .line 459
    .line 460
    const v13, -0x3fcf5c29    # -2.76f

    .line 461
    .line 462
    .line 463
    const/high16 v15, -0x3f600000    # -5.0f

    .line 464
    .line 465
    const v16, 0x400f5c29    # 2.24f

    .line 466
    .line 467
    .line 468
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const v0, 0x400f5c29    # 2.24f

    .line 472
    .line 473
    .line 474
    const/high16 v2, 0x40a00000    # 5.0f

    .line 475
    .line 476
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const v0, -0x3ff0a3d7    # -2.24f

    .line 480
    .line 481
    .line 482
    const/high16 v2, -0x3f600000    # -5.0f

    .line 483
    .line 484
    const/high16 v4, 0x40a00000    # 5.0f

    .line 485
    .line 486
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const v0, 0x41a6147b    # 20.76f

    .line 490
    .line 491
    .line 492
    const/high16 v2, 0x41900000    # 18.0f

    .line 493
    .line 494
    const/high16 v4, 0x41500000    # 13.0f

    .line 495
    .line 496
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    const/high16 v0, 0x41a40000    # 20.5f

    .line 503
    .line 504
    const/high16 v2, 0x41860000    # 16.75f

    .line 505
    .line 506
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 507
    .line 508
    .line 509
    const/high16 v0, -0x3f600000    # -5.0f

    .line 510
    .line 511
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const/high16 v0, 0x40200000    # 2.5f

    .line 515
    .line 516
    const/high16 v2, 0x40800000    # 4.0f

    .line 517
    .line 518
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 519
    .line 520
    .line 521
    const/high16 v0, 0x41a40000    # 20.5f

    .line 522
    .line 523
    const/high16 v2, 0x41860000    # 16.75f

    .line 524
    .line 525
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 526
    .line 527
    .line 528
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 532
    .line 533
    .line 534
    move-result-object v2

    .line 535
    const/16 v16, 0x3800

    .line 536
    .line 537
    const/16 v17, 0x0

    .line 538
    .line 539
    const/high16 v6, 0x3f800000    # 1.0f

    .line 540
    .line 541
    const/4 v7, 0x0

    .line 542
    const/high16 v12, 0x3f800000    # 1.0f

    .line 543
    .line 544
    const/4 v13, 0x0

    .line 545
    const/4 v15, 0x0

    .line 546
    const-string v4, ""

    .line 547
    .line 548
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 549
    .line 550
    .line 551
    move-result-object v0

    .line 552
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 553
    .line 554
    .line 555
    move-result-object v0

    .line 556
    sput-object v0, Landroidx/compose/material/icons/twotone/PlayLessonKt;->_playLesson:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 557
    .line 558
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 559
    .line 560
    .line 561
    return-object v0
.end method
