.class public final Landroidx/compose/material/icons/sharp/PanoramaHorizontalKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_panoramaHorizontal",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "PanoramaHorizontal",
        "Landroidx/compose/material/icons/Icons$Sharp;",
        "getPanoramaHorizontal",
        "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nPanoramaHorizontal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PanoramaHorizontal.kt\nandroidx/compose/material/icons/sharp/PanoramaHorizontalKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,56:1\n212#2,12:57\n233#2,18:70\n253#2:107\n174#3:69\n705#4,2:88\n717#4,2:90\n719#4,11:96\n72#5,4:92\n*S KotlinDebug\n*F\n+ 1 PanoramaHorizontal.kt\nandroidx/compose/material/icons/sharp/PanoramaHorizontalKt\n*L\n29#1:57,12\n30#1:70,18\n30#1:107\n29#1:69\n30#1:88,2\n30#1:90,2\n30#1:96,11\n30#1:92,4\n*E\n"
    }
.end annotation


# static fields
.field private static _panoramaHorizontal:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPanoramaHorizontal(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/PanoramaHorizontalKt;->_panoramaHorizontal:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.PanoramaHorizontal"

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
    const/high16 v0, 0x40800000    # 4.0f

    .line 71
    .line 72
    const v2, 0x40d1999a    # 6.55f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v17, 0x41000000    # 8.0f

    .line 79
    .line 80
    const v18, 0x3f947ae1    # 1.16f

    .line 81
    .line 82
    .line 83
    const v13, 0x40266666    # 2.6f

    .line 84
    .line 85
    .line 86
    const v14, 0x3f451eb8    # 0.77f

    .line 87
    .line 88
    .line 89
    const v15, 0x40a8f5c3    # 5.28f

    .line 90
    .line 91
    .line 92
    const v16, 0x3f947ae1    # 1.16f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const v18, -0x406b851f    # -1.16f

    .line 99
    .line 100
    .line 101
    const v13, 0x402e147b    # 2.72f

    .line 102
    .line 103
    .line 104
    const/4 v14, 0x0

    .line 105
    const v15, 0x40ad1eb8    # 5.41f

    .line 106
    .line 107
    .line 108
    const v16, -0x413851ec    # -0.39f

    .line 109
    .line 110
    .line 111
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v0, 0x412e8f5c    # 10.91f

    .line 115
    .line 116
    .line 117
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v17, -0x3f000000    # -8.0f

    .line 121
    .line 122
    const v13, -0x3fd9999a    # -2.6f

    .line 123
    .line 124
    .line 125
    const v14, -0x40bae148    # -0.77f

    .line 126
    .line 127
    .line 128
    const v15, -0x3f570a3d    # -5.28f

    .line 129
    .line 130
    .line 131
    const v16, -0x406b851f    # -1.16f

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const v18, 0x3f947ae1    # 1.16f

    .line 138
    .line 139
    .line 140
    const v13, -0x3fd1eb85    # -2.72f

    .line 141
    .line 142
    .line 143
    const/4 v14, 0x0

    .line 144
    const v15, -0x3f52e148    # -5.41f

    .line 145
    .line 146
    .line 147
    const v16, 0x3ec7ae14    # 0.39f

    .line 148
    .line 149
    .line 150
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 151
    .line 152
    .line 153
    const v0, 0x40d1999a    # 6.55f

    .line 154
    .line 155
    .line 156
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const/high16 v0, 0x40000000    # 2.0f

    .line 160
    .line 161
    const v2, 0x407147ae    # 3.77f

    .line 162
    .line 163
    .line 164
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const v0, 0x4183c28f    # 16.47f

    .line 168
    .line 169
    .line 170
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const v0, 0x3f6147ae    # 0.88f

    .line 174
    .line 175
    .line 176
    const v2, -0x41666666    # -0.3f

    .line 177
    .line 178
    .line 179
    const v4, 0x3f451eb8    # 0.77f

    .line 180
    .line 181
    .line 182
    const v6, -0x417ae148    # -0.26f

    .line 183
    .line 184
    .line 185
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const/high16 v17, 0x41400000    # 12.0f

    .line 189
    .line 190
    const v18, 0x41926666    # 18.3f

    .line 191
    .line 192
    .line 193
    const v13, 0x40ba3d71    # 5.82f

    .line 194
    .line 195
    .line 196
    const v14, 0x4196cccd    # 18.85f

    .line 197
    .line 198
    .line 199
    const v15, 0x410e8f5c    # 8.91f

    .line 200
    .line 201
    .line 202
    const v16, 0x41926666    # 18.3f

    .line 203
    .line 204
    .line 205
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 206
    .line 207
    .line 208
    const v17, 0x4111eb85    # 9.12f

    .line 209
    .line 210
    .line 211
    const v18, 0x3fd1eb85    # 1.64f

    .line 212
    .line 213
    .line 214
    const v13, 0x4045c28f    # 3.09f

    .line 215
    .line 216
    .line 217
    const/4 v14, 0x0

    .line 218
    const v15, 0x40c5c28f    # 6.18f

    .line 219
    .line 220
    .line 221
    const v16, 0x3f0ccccd    # 0.55f

    .line 222
    .line 223
    .line 224
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const v17, 0x3f6147ae    # 0.88f

    .line 228
    .line 229
    .line 230
    const v18, 0x3e99999a    # 0.3f

    .line 231
    .line 232
    .line 233
    const v13, 0x3de147ae    # 0.11f

    .line 234
    .line 235
    .line 236
    const v14, 0x3d23d70a    # 0.04f

    .line 237
    .line 238
    .line 239
    const v15, 0x3f6147ae    # 0.88f

    .line 240
    .line 241
    .line 242
    const v16, 0x3e99999a    # 0.3f

    .line 243
    .line 244
    .line 245
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const v0, 0x407147ae    # 3.77f

    .line 249
    .line 250
    .line 251
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const v0, -0x409eb852    # -0.88f

    .line 255
    .line 256
    .line 257
    const v2, 0x3e99999a    # 0.3f

    .line 258
    .line 259
    .line 260
    const v4, -0x40bae148    # -0.77f

    .line 261
    .line 262
    .line 263
    const v6, 0x3e851eb8    # 0.26f

    .line 264
    .line 265
    .line 266
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const/high16 v17, 0x41400000    # 12.0f

    .line 270
    .line 271
    const v18, 0x40b6b852    # 5.71f

    .line 272
    .line 273
    .line 274
    const v13, 0x419170a4    # 18.18f

    .line 275
    .line 276
    .line 277
    const v14, 0x40a4cccd    # 5.15f

    .line 278
    .line 279
    .line 280
    const v15, 0x417170a4    # 15.09f

    .line 281
    .line 282
    .line 283
    const v16, 0x40b6b852    # 5.71f

    .line 284
    .line 285
    .line 286
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const v0, -0x3eee147b    # -9.12f

    .line 290
    .line 291
    .line 292
    const v2, -0x402e147b    # -1.64f

    .line 293
    .line 294
    .line 295
    const v4, -0x3f3a3d71    # -6.18f

    .line 296
    .line 297
    .line 298
    const v6, -0x40f0a3d7    # -0.56f

    .line 299
    .line 300
    .line 301
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const v17, -0x409eb852    # -0.88f

    .line 305
    .line 306
    .line 307
    const v18, -0x41666666    # -0.3f

    .line 308
    .line 309
    .line 310
    const v13, -0x421eb852    # -0.11f

    .line 311
    .line 312
    .line 313
    const v14, -0x42b33333    # -0.05f

    .line 314
    .line 315
    .line 316
    const v15, -0x409eb852    # -0.88f

    .line 317
    .line 318
    .line 319
    const v16, -0x41666666    # -0.3f

    .line 320
    .line 321
    .line 322
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 329
    .line 330
    .line 331
    move-result-object v2

    .line 332
    const/16 v16, 0x3800

    .line 333
    .line 334
    const/16 v17, 0x0

    .line 335
    .line 336
    const/high16 v6, 0x3f800000    # 1.0f

    .line 337
    .line 338
    const/high16 v8, 0x3f800000    # 1.0f

    .line 339
    .line 340
    const/4 v7, 0x0

    .line 341
    const/high16 v9, 0x3f800000    # 1.0f

    .line 342
    .line 343
    const/high16 v12, 0x3f800000    # 1.0f

    .line 344
    .line 345
    const/4 v13, 0x0

    .line 346
    const/4 v14, 0x0

    .line 347
    const/4 v15, 0x0

    .line 348
    const-string v4, ""

    .line 349
    .line 350
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    sput-object v0, Landroidx/compose/material/icons/sharp/PanoramaHorizontalKt;->_panoramaHorizontal:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 359
    .line 360
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 361
    .line 362
    .line 363
    return-object v0
.end method
