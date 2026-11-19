.class public final Landroidx/compose/material/icons/rounded/InsertEmoticonKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_insertEmoticon",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "InsertEmoticon",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getInsertEmoticon",
        "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nInsertEmoticon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InsertEmoticon.kt\nandroidx/compose/material/icons/rounded/InsertEmoticonKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,62:1\n212#2,12:63\n233#2,18:76\n253#2:113\n174#3:75\n705#4,2:94\n717#4,2:96\n719#4,11:102\n72#5,4:98\n*S KotlinDebug\n*F\n+ 1 InsertEmoticon.kt\nandroidx/compose/material/icons/rounded/InsertEmoticonKt\n*L\n29#1:63,12\n30#1:76,18\n30#1:113\n29#1:75\n30#1:94,2\n30#1:96,2\n30#1:102,11\n30#1:98,4\n*E\n"
    }
.end annotation


# static fields
.field private static _insertEmoticon:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getInsertEmoticon(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/InsertEmoticonKt;->_insertEmoticon:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.InsertEmoticon"

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
    const/4 v0, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 51
    .line 52
    .line 53
    sget-object v0, Landroidx/compose/ui/graphics/StrokeCap;->Companion:Landroidx/compose/ui/graphics/StrokeCap$Companion;

    .line 54
    .line 55
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v0, Landroidx/compose/ui/graphics/StrokeJoin;->Companion:Landroidx/compose/ui/graphics/StrokeJoin$Companion;

    .line 60
    .line 61
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 66
    .line 67
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    const v0, 0x413fd70a    # 11.99f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x40000000    # 2.0f

    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v17, 0x40000000    # 2.0f

    .line 79
    .line 80
    const/high16 v18, 0x41400000    # 12.0f

    .line 81
    .line 82
    const v13, 0x40cf0a3d    # 6.47f

    .line 83
    .line 84
    .line 85
    const/high16 v14, 0x40000000    # 2.0f

    .line 86
    .line 87
    const/high16 v15, 0x40000000    # 2.0f

    .line 88
    .line 89
    const v16, 0x40cf5c29    # 6.48f

    .line 90
    .line 91
    .line 92
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const v0, 0x408f0a3d    # 4.47f

    .line 96
    .line 97
    .line 98
    const v2, 0x411fd70a    # 9.99f

    .line 99
    .line 100
    .line 101
    const/high16 v4, 0x41200000    # 10.0f

    .line 102
    .line 103
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const/high16 v17, 0x41b00000    # 22.0f

    .line 107
    .line 108
    const v13, 0x418c28f6    # 17.52f

    .line 109
    .line 110
    .line 111
    const/high16 v14, 0x41b00000    # 22.0f

    .line 112
    .line 113
    const/high16 v15, 0x41b00000    # 22.0f

    .line 114
    .line 115
    const v16, 0x418c28f6    # 17.52f

    .line 116
    .line 117
    .line 118
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const v0, 0x418c28f6    # 17.52f

    .line 122
    .line 123
    .line 124
    const v2, 0x413fd70a    # 11.99f

    .line 125
    .line 126
    .line 127
    const/high16 v4, 0x40000000    # 2.0f

    .line 128
    .line 129
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v0, 0x41080000    # 8.5f

    .line 136
    .line 137
    const/high16 v2, 0x41000000    # 8.0f

    .line 138
    .line 139
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    const/high16 v17, 0x41200000    # 10.0f

    .line 143
    .line 144
    const/high16 v18, 0x41180000    # 9.5f

    .line 145
    .line 146
    const v13, 0x411547ae    # 9.33f

    .line 147
    .line 148
    .line 149
    const/high16 v14, 0x41000000    # 8.0f

    .line 150
    .line 151
    const/high16 v15, 0x41200000    # 10.0f

    .line 152
    .line 153
    const v16, 0x410ab852    # 8.67f

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v0, 0x411547ae    # 9.33f

    .line 160
    .line 161
    .line 162
    const/high16 v2, 0x41080000    # 8.5f

    .line 163
    .line 164
    const/high16 v4, 0x41300000    # 11.0f

    .line 165
    .line 166
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const v0, 0x412547ae    # 10.33f

    .line 170
    .line 171
    .line 172
    const/high16 v2, 0x41180000    # 9.5f

    .line 173
    .line 174
    const/high16 v4, 0x40e00000    # 7.0f

    .line 175
    .line 176
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const v0, 0x40f570a4    # 7.67f

    .line 180
    .line 181
    .line 182
    const/high16 v2, 0x41080000    # 8.5f

    .line 183
    .line 184
    const/high16 v4, 0x41000000    # 8.0f

    .line 185
    .line 186
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const/high16 v0, 0x41860000    # 16.75f

    .line 193
    .line 194
    const/high16 v2, 0x416c0000    # 14.75f

    .line 195
    .line 196
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const/high16 v17, 0x41400000    # 12.0f

    .line 200
    .line 201
    const/high16 v18, 0x418c0000    # 17.5f

    .line 202
    .line 203
    const v13, 0x417ccccd    # 15.8f

    .line 204
    .line 205
    .line 206
    const v14, 0x41831eb8    # 16.39f

    .line 207
    .line 208
    .line 209
    const v15, 0x41607ae1    # 14.03f

    .line 210
    .line 211
    .line 212
    const/high16 v16, 0x418c0000    # 17.5f

    .line 213
    .line 214
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v0, -0x3f680000    # -4.75f

    .line 218
    .line 219
    const/high16 v2, -0x3fd00000    # -2.75f

    .line 220
    .line 221
    const v4, -0x3f8ccccd    # -3.8f

    .line 222
    .line 223
    .line 224
    const v6, -0x4071eb85    # -1.11f

    .line 225
    .line 226
    .line 227
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const v17, 0x40f6147b    # 7.69f

    .line 231
    .line 232
    .line 233
    const/high16 v18, 0x41600000    # 14.0f

    .line 234
    .line 235
    const v13, 0x40e1eb85    # 7.06f

    .line 236
    .line 237
    .line 238
    const v14, 0x4166b852    # 14.42f

    .line 239
    .line 240
    .line 241
    const v15, 0x40e9eb85    # 7.31f

    .line 242
    .line 243
    .line 244
    const/high16 v16, 0x41600000    # 14.0f

    .line 245
    .line 246
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const v0, 0x4109eb85    # 8.62f

    .line 250
    .line 251
    .line 252
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v17, 0x41860000    # 16.75f

    .line 256
    .line 257
    const/high16 v18, 0x416c0000    # 14.75f

    .line 258
    .line 259
    const v13, 0x4185999a    # 16.7f

    .line 260
    .line 261
    .line 262
    const/high16 v14, 0x41600000    # 14.0f

    .line 263
    .line 264
    const v15, 0x4187851f    # 16.94f

    .line 265
    .line 266
    .line 267
    const v16, 0x4166b852    # 14.42f

    .line 268
    .line 269
    .line 270
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const/high16 v0, 0x41780000    # 15.5f

    .line 277
    .line 278
    const/high16 v2, 0x41300000    # 11.0f

    .line 279
    .line 280
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    const/high16 v17, -0x40400000    # -1.5f

    .line 284
    .line 285
    const/high16 v18, -0x40400000    # -1.5f

    .line 286
    .line 287
    const v13, -0x40ab851f    # -0.83f

    .line 288
    .line 289
    .line 290
    const/4 v14, 0x0

    .line 291
    const/high16 v15, -0x40400000    # -1.5f

    .line 292
    .line 293
    const v16, -0x40d47ae1    # -0.67f

    .line 294
    .line 295
    .line 296
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v0, 0x416ab852    # 14.67f

    .line 300
    .line 301
    .line 302
    const/high16 v2, 0x41780000    # 15.5f

    .line 303
    .line 304
    const/high16 v4, 0x41000000    # 8.0f

    .line 305
    .line 306
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const v0, 0x410ab852    # 8.67f

    .line 310
    .line 311
    .line 312
    const/high16 v2, 0x41880000    # 17.0f

    .line 313
    .line 314
    const/high16 v4, 0x41180000    # 9.5f

    .line 315
    .line 316
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const v0, 0x4182a3d7    # 16.33f

    .line 320
    .line 321
    .line 322
    const/high16 v2, 0x41780000    # 15.5f

    .line 323
    .line 324
    const/high16 v4, 0x41300000    # 11.0f

    .line 325
    .line 326
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 333
    .line 334
    .line 335
    move-result-object v2

    .line 336
    const/16 v16, 0x3800

    .line 337
    .line 338
    const/16 v17, 0x0

    .line 339
    .line 340
    const/high16 v6, 0x3f800000    # 1.0f

    .line 341
    .line 342
    const/high16 v8, 0x3f800000    # 1.0f

    .line 343
    .line 344
    const/4 v7, 0x0

    .line 345
    const/high16 v9, 0x3f800000    # 1.0f

    .line 346
    .line 347
    const/high16 v12, 0x3f800000    # 1.0f

    .line 348
    .line 349
    const/4 v13, 0x0

    .line 350
    const/4 v15, 0x0

    .line 351
    const-string v4, ""

    .line 352
    .line 353
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    sput-object v0, Landroidx/compose/material/icons/rounded/InsertEmoticonKt;->_insertEmoticon:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 362
    .line 363
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 364
    .line 365
    .line 366
    return-object v0
.end method
