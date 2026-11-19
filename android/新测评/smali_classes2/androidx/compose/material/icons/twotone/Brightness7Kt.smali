.class public final Landroidx/compose/material/icons/twotone/Brightness7Kt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_brightness7",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Brightness7",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getBrightness7",
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
        "SMAP\nBrightness7.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Brightness7.kt\nandroidx/compose/material/icons/twotone/Brightness7Kt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,117:1\n212#2,12:118\n233#2,18:131\n253#2:168\n233#2,18:169\n253#2:206\n233#2,18:207\n253#2:244\n174#3:130\n705#4,2:149\n717#4,2:151\n719#4,11:157\n705#4,2:187\n717#4,2:189\n719#4,11:195\n705#4,2:225\n717#4,2:227\n719#4,11:233\n72#5,4:153\n72#5,4:191\n72#5,4:229\n*S KotlinDebug\n*F\n+ 1 Brightness7.kt\nandroidx/compose/material/icons/twotone/Brightness7Kt\n*L\n29#1:118,12\n30#1:131,18\n30#1:168\n56#1:169,18\n56#1:206\n106#1:207,18\n106#1:244\n29#1:130\n30#1:149,2\n30#1:151,2\n30#1:157,11\n56#1:187,2\n56#1:189,2\n56#1:195,11\n106#1:225,2\n106#1:227,2\n106#1:233,11\n30#1:153,4\n56#1:191,4\n106#1:229,4\n*E\n"
    }
.end annotation


# static fields
.field private static _brightness7:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBrightness7(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/Brightness7Kt;->_brightness7:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Brightness7"

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
    const v4, 0x411851ec    # 9.52f

    .line 71
    .line 72
    .line 73
    const/high16 v6, 0x41900000    # 18.0f

    .line 74
    .line 75
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v4, 0x40c00000    # 6.0f

    .line 79
    .line 80
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v4, -0x3f9eb852    # -3.52f

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 87
    .line 88
    .line 89
    const v4, 0x406147ae    # 3.52f

    .line 90
    .line 91
    .line 92
    const/high16 v6, 0x41400000    # 12.0f

    .line 93
    .line 94
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const v4, 0x411851ec    # 9.52f

    .line 98
    .line 99
    .line 100
    const/high16 v6, 0x40c00000    # 6.0f

    .line 101
    .line 102
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v4, 0x40c00000    # 6.0f

    .line 106
    .line 107
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const v4, 0x406147ae    # 3.52f

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 114
    .line 115
    .line 116
    const/high16 v6, 0x41400000    # 12.0f

    .line 117
    .line 118
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v4, 0x4167ae14    # 14.48f

    .line 122
    .line 123
    .line 124
    const/high16 v6, 0x40c00000    # 6.0f

    .line 125
    .line 126
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v4, 0x40c00000    # 6.0f

    .line 130
    .line 131
    const/high16 v6, 0x41900000    # 18.0f

    .line 132
    .line 133
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 134
    .line 135
    .line 136
    const v4, 0x406147ae    # 3.52f

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const v4, 0x41a3d70a    # 20.48f

    .line 143
    .line 144
    .line 145
    const/high16 v6, 0x41400000    # 12.0f

    .line 146
    .line 147
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const v4, 0x4167ae14    # 14.48f

    .line 151
    .line 152
    .line 153
    const/high16 v6, 0x41900000    # 18.0f

    .line 154
    .line 155
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const/high16 v4, 0x41900000    # 18.0f

    .line 159
    .line 160
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v4, -0x3f9eb852    # -3.52f

    .line 164
    .line 165
    .line 166
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const v4, 0x41a3d70a    # 20.48f

    .line 170
    .line 171
    .line 172
    const/high16 v6, 0x41400000    # 12.0f

    .line 173
    .line 174
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v4, 0x411851ec    # 9.52f

    .line 178
    .line 179
    .line 180
    const/high16 v6, 0x41900000    # 18.0f

    .line 181
    .line 182
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v4, 0x418c0000    # 17.5f

    .line 189
    .line 190
    const/high16 v6, 0x41400000    # 12.0f

    .line 191
    .line 192
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const/high16 v25, -0x3f500000    # -5.5f

    .line 196
    .line 197
    const/high16 v26, -0x3f500000    # -5.5f

    .line 198
    .line 199
    const v21, -0x3fbe147b    # -3.03f

    .line 200
    .line 201
    .line 202
    const/16 v22, 0x0

    .line 203
    .line 204
    const/high16 v23, -0x3f500000    # -5.5f

    .line 205
    .line 206
    const v24, -0x3fe1eb85    # -2.47f

    .line 207
    .line 208
    .line 209
    move-object/from16 v20, v2

    .line 210
    .line 211
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const v4, 0x410f851f    # 8.97f

    .line 215
    .line 216
    .line 217
    const/high16 v6, 0x40d00000    # 6.5f

    .line 218
    .line 219
    const/high16 v7, 0x41400000    # 12.0f

    .line 220
    .line 221
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    const v4, 0x401e147b    # 2.47f

    .line 225
    .line 226
    .line 227
    const/high16 v6, 0x40b00000    # 5.5f

    .line 228
    .line 229
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v4, -0x3fe1eb85    # -2.47f

    .line 233
    .line 234
    .line 235
    const/high16 v6, -0x3f500000    # -5.5f

    .line 236
    .line 237
    const/high16 v7, 0x40b00000    # 5.5f

    .line 238
    .line 239
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    const/16 v16, 0x3800

    .line 250
    .line 251
    const/16 v17, 0x0

    .line 252
    .line 253
    const v6, 0x3e99999a    # 0.3f

    .line 254
    .line 255
    .line 256
    const v8, 0x3e99999a    # 0.3f

    .line 257
    .line 258
    .line 259
    const/4 v7, 0x0

    .line 260
    const/high16 v9, 0x3f800000    # 1.0f

    .line 261
    .line 262
    const/high16 v12, 0x3f800000    # 1.0f

    .line 263
    .line 264
    const/4 v13, 0x0

    .line 265
    const/4 v14, 0x0

    .line 266
    const/4 v15, 0x0

    .line 267
    const-string v4, ""

    .line 268
    .line 269
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 270
    .line 271
    .line 272
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 273
    .line 274
    .line 275
    move-result v3

    .line 276
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 277
    .line 278
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 279
    .line 280
    .line 281
    move-result-wide v6

    .line 282
    const/4 v2, 0x0

    .line 283
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 284
    .line 285
    .line 286
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 287
    .line 288
    .line 289
    move-result v10

    .line 290
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 291
    .line 292
    .line 293
    move-result v11

    .line 294
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 297
    .line 298
    .line 299
    const v4, 0x410b0a3d    # 8.69f

    .line 300
    .line 301
    .line 302
    const/high16 v6, 0x41a00000    # 20.0f

    .line 303
    .line 304
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const/high16 v4, 0x40800000    # 4.0f

    .line 308
    .line 309
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v4, -0x3f69eb85    # -4.69f

    .line 313
    .line 314
    .line 315
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v4, 0x3f30a3d7    # 0.69f

    .line 319
    .line 320
    .line 321
    const/high16 v6, 0x41400000    # 12.0f

    .line 322
    .line 323
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const v4, 0x410b0a3d    # 8.69f

    .line 327
    .line 328
    .line 329
    const/high16 v6, 0x40800000    # 4.0f

    .line 330
    .line 331
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const/high16 v4, 0x40800000    # 4.0f

    .line 335
    .line 336
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v4, 0x4096147b    # 4.69f

    .line 340
    .line 341
    .line 342
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const v4, 0x3f30a3d7    # 0.69f

    .line 346
    .line 347
    .line 348
    const/high16 v6, 0x41400000    # 12.0f

    .line 349
    .line 350
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 351
    .line 352
    .line 353
    const v4, 0x4174f5c3    # 15.31f

    .line 354
    .line 355
    .line 356
    const/high16 v6, 0x40800000    # 4.0f

    .line 357
    .line 358
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 359
    .line 360
    .line 361
    const/high16 v4, 0x40800000    # 4.0f

    .line 362
    .line 363
    const/high16 v6, 0x41a00000    # 20.0f

    .line 364
    .line 365
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const v4, 0x4096147b    # 4.69f

    .line 369
    .line 370
    .line 371
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    const v4, 0x41ba7ae1    # 23.31f

    .line 375
    .line 376
    .line 377
    const/high16 v6, 0x41400000    # 12.0f

    .line 378
    .line 379
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 380
    .line 381
    .line 382
    const v4, 0x4174f5c3    # 15.31f

    .line 383
    .line 384
    .line 385
    const/high16 v6, 0x41a00000    # 20.0f

    .line 386
    .line 387
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v4, 0x41a00000    # 20.0f

    .line 391
    .line 392
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const v4, -0x3f69eb85    # -4.69f

    .line 396
    .line 397
    .line 398
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    const v4, 0x41ba7ae1    # 23.31f

    .line 402
    .line 403
    .line 404
    const/high16 v6, 0x41400000    # 12.0f

    .line 405
    .line 406
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v4, 0x410b0a3d    # 8.69f

    .line 410
    .line 411
    .line 412
    const/high16 v6, 0x41a00000    # 20.0f

    .line 413
    .line 414
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const v4, 0x4167ae14    # 14.48f

    .line 421
    .line 422
    .line 423
    const/high16 v6, 0x41900000    # 18.0f

    .line 424
    .line 425
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/high16 v4, 0x41900000    # 18.0f

    .line 429
    .line 430
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const v4, -0x3f9eb852    # -3.52f

    .line 434
    .line 435
    .line 436
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 437
    .line 438
    .line 439
    const v4, 0x41a3d70a    # 20.48f

    .line 440
    .line 441
    .line 442
    const/high16 v6, 0x41400000    # 12.0f

    .line 443
    .line 444
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const v4, 0x411851ec    # 9.52f

    .line 448
    .line 449
    .line 450
    const/high16 v6, 0x41900000    # 18.0f

    .line 451
    .line 452
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const/high16 v4, 0x40c00000    # 6.0f

    .line 456
    .line 457
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const v4, -0x3f9eb852    # -3.52f

    .line 461
    .line 462
    .line 463
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const v4, 0x406147ae    # 3.52f

    .line 467
    .line 468
    .line 469
    const/high16 v6, 0x41400000    # 12.0f

    .line 470
    .line 471
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const v4, 0x411851ec    # 9.52f

    .line 475
    .line 476
    .line 477
    const/high16 v6, 0x40c00000    # 6.0f

    .line 478
    .line 479
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    const/high16 v4, 0x40c00000    # 6.0f

    .line 483
    .line 484
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 485
    .line 486
    .line 487
    const v4, 0x406147ae    # 3.52f

    .line 488
    .line 489
    .line 490
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const/high16 v6, 0x41400000    # 12.0f

    .line 494
    .line 495
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const v4, 0x4167ae14    # 14.48f

    .line 499
    .line 500
    .line 501
    const/high16 v6, 0x40c00000    # 6.0f

    .line 502
    .line 503
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const/high16 v4, 0x40c00000    # 6.0f

    .line 507
    .line 508
    const/high16 v6, 0x41900000    # 18.0f

    .line 509
    .line 510
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const v4, 0x406147ae    # 3.52f

    .line 514
    .line 515
    .line 516
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 517
    .line 518
    .line 519
    const v4, 0x41a3d70a    # 20.48f

    .line 520
    .line 521
    .line 522
    const/high16 v6, 0x41400000    # 12.0f

    .line 523
    .line 524
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const v4, 0x4167ae14    # 14.48f

    .line 528
    .line 529
    .line 530
    const/high16 v6, 0x41900000    # 18.0f

    .line 531
    .line 532
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    const/high16 v4, 0x40d00000    # 6.5f

    .line 539
    .line 540
    const/high16 v6, 0x41400000    # 12.0f

    .line 541
    .line 542
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const/high16 v26, 0x40b00000    # 5.5f

    .line 546
    .line 547
    const v24, 0x401e147b    # 2.47f

    .line 548
    .line 549
    .line 550
    move-object/from16 v20, v2

    .line 551
    .line 552
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const v4, 0x401e147b    # 2.47f

    .line 556
    .line 557
    .line 558
    const/high16 v6, 0x40b00000    # 5.5f

    .line 559
    .line 560
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 561
    .line 562
    .line 563
    const v4, -0x3fe1eb85    # -2.47f

    .line 564
    .line 565
    .line 566
    const/high16 v6, -0x3f500000    # -5.5f

    .line 567
    .line 568
    const/high16 v7, 0x40b00000    # 5.5f

    .line 569
    .line 570
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 571
    .line 572
    .line 573
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    const/high16 v4, 0x41780000    # 15.5f

    .line 580
    .line 581
    const/high16 v6, 0x41400000    # 12.0f

    .line 582
    .line 583
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    const/high16 v25, -0x3fa00000    # -3.5f

    .line 587
    .line 588
    const/high16 v26, -0x3fa00000    # -3.5f

    .line 589
    .line 590
    const v21, -0x4008f5c3    # -1.93f

    .line 591
    .line 592
    .line 593
    const/high16 v23, -0x3fa00000    # -3.5f

    .line 594
    .line 595
    const v24, -0x40370a3d    # -1.57f

    .line 596
    .line 597
    .line 598
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    const v4, 0x3fc8f5c3    # 1.57f

    .line 602
    .line 603
    .line 604
    const/high16 v6, -0x3fa00000    # -3.5f

    .line 605
    .line 606
    const/high16 v7, 0x40600000    # 3.5f

    .line 607
    .line 608
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 609
    .line 610
    .line 611
    const/high16 v6, 0x40600000    # 3.5f

    .line 612
    .line 613
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 614
    .line 615
    .line 616
    const v4, -0x40370a3d    # -1.57f

    .line 617
    .line 618
    .line 619
    const/high16 v6, -0x3fa00000    # -3.5f

    .line 620
    .line 621
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 625
    .line 626
    .line 627
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 628
    .line 629
    .line 630
    move-result-object v2

    .line 631
    const/high16 v6, 0x3f800000    # 1.0f

    .line 632
    .line 633
    const/high16 v8, 0x3f800000    # 1.0f

    .line 634
    .line 635
    const/4 v7, 0x0

    .line 636
    const-string v4, ""

    .line 637
    .line 638
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 639
    .line 640
    .line 641
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 642
    .line 643
    .line 644
    move-result v3

    .line 645
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 646
    .line 647
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 648
    .line 649
    .line 650
    move-result-wide v6

    .line 651
    const/4 v0, 0x0

    .line 652
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 653
    .line 654
    .line 655
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 656
    .line 657
    .line 658
    move-result v10

    .line 659
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 660
    .line 661
    .line 662
    move-result v11

    .line 663
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 664
    .line 665
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 666
    .line 667
    .line 668
    const/high16 v0, 0x41400000    # 12.0f

    .line 669
    .line 670
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 671
    .line 672
    .line 673
    const/high16 v0, -0x40000000    # -2.0f

    .line 674
    .line 675
    const/4 v2, 0x0

    .line 676
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 677
    .line 678
    .line 679
    const/high16 v18, 0x40800000    # 4.0f

    .line 680
    .line 681
    const/16 v19, 0x0

    .line 682
    .line 683
    const/high16 v13, 0x40000000    # 2.0f

    .line 684
    .line 685
    const/high16 v14, 0x40000000    # 2.0f

    .line 686
    .line 687
    const/16 v16, 0x1

    .line 688
    .line 689
    const/16 v17, 0x1

    .line 690
    .line 691
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 692
    .line 693
    .line 694
    const/high16 v18, -0x3f800000    # -4.0f

    .line 695
    .line 696
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 697
    .line 698
    .line 699
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 700
    .line 701
    .line 702
    move-result-object v2

    .line 703
    const/16 v16, 0x3800

    .line 704
    .line 705
    const/16 v17, 0x0

    .line 706
    .line 707
    const/high16 v6, 0x3f800000    # 1.0f

    .line 708
    .line 709
    const/4 v7, 0x0

    .line 710
    const/high16 v12, 0x3f800000    # 1.0f

    .line 711
    .line 712
    const/4 v13, 0x0

    .line 713
    const/4 v14, 0x0

    .line 714
    const-string v4, ""

    .line 715
    .line 716
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 717
    .line 718
    .line 719
    move-result-object v0

    .line 720
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 721
    .line 722
    .line 723
    move-result-object v0

    .line 724
    sput-object v0, Landroidx/compose/material/icons/twotone/Brightness7Kt;->_brightness7:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 725
    .line 726
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 727
    .line 728
    .line 729
    return-object v0
.end method
