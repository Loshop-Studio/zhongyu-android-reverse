.class public final Landroidx/compose/material/icons/outlined/VisibilityKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_visibility",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Visibility",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getVisibility",
        "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nVisibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Visibility.kt\nandroidx/compose/material/icons/outlined/VisibilityKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,59:1\n212#2,12:60\n233#2,18:73\n253#2:110\n174#3:72\n705#4,2:91\n717#4,2:93\n719#4,11:99\n72#5,4:95\n*S KotlinDebug\n*F\n+ 1 Visibility.kt\nandroidx/compose/material/icons/outlined/VisibilityKt\n*L\n29#1:60,12\n30#1:73,18\n30#1:110\n29#1:72\n30#1:91,2\n30#1:93,2\n30#1:99,11\n30#1:95,4\n*E\n"
    }
.end annotation


# static fields
.field private static _visibility:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getVisibility(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/VisibilityKt;->_visibility:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Visibility"

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
    const/high16 v0, 0x40c00000    # 6.0f

    .line 71
    .line 72
    const/high16 v2, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v17, 0x410d1eb8    # 8.82f

    .line 78
    .line 79
    .line 80
    const/high16 v18, 0x40b00000    # 5.5f

    .line 81
    .line 82
    const v13, 0x40728f5c    # 3.79f

    .line 83
    .line 84
    .line 85
    const/4 v14, 0x0

    .line 86
    const v15, 0x40e570a4    # 7.17f

    .line 87
    .line 88
    .line 89
    const v16, 0x400851ec    # 2.13f

    .line 90
    .line 91
    .line 92
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const/high16 v17, 0x41400000    # 12.0f

    .line 96
    .line 97
    const/high16 v18, 0x41880000    # 17.0f

    .line 98
    .line 99
    const v13, 0x41995c29    # 19.17f

    .line 100
    .line 101
    .line 102
    const v14, 0x416deb85    # 14.87f

    .line 103
    .line 104
    .line 105
    const v15, 0x417ca3d7    # 15.79f

    .line 106
    .line 107
    .line 108
    const/high16 v16, 0x41880000    # 17.0f

    .line 109
    .line 110
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const v0, -0x3ef2e148    # -8.82f

    .line 114
    .line 115
    .line 116
    const/high16 v2, -0x3f500000    # -5.5f

    .line 117
    .line 118
    const v4, -0x3f1a8f5c    # -7.17f

    .line 119
    .line 120
    .line 121
    const v6, -0x3ff7ae14    # -2.13f

    .line 122
    .line 123
    .line 124
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v18, 0x40c00000    # 6.0f

    .line 128
    .line 129
    const v13, 0x409a8f5c    # 4.83f

    .line 130
    .line 131
    .line 132
    const v14, 0x4102147b    # 8.13f

    .line 133
    .line 134
    .line 135
    const v15, 0x41035c29    # 8.21f

    .line 136
    .line 137
    .line 138
    const/high16 v16, 0x40c00000    # 6.0f

    .line 139
    .line 140
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v0, -0x40000000    # -2.0f

    .line 144
    .line 145
    const/4 v2, 0x0

    .line 146
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v17, 0x3f800000    # 1.0f

    .line 150
    .line 151
    const/high16 v18, 0x41380000    # 11.5f

    .line 152
    .line 153
    const/high16 v13, 0x40e00000    # 7.0f

    .line 154
    .line 155
    const/high16 v14, 0x40800000    # 4.0f

    .line 156
    .line 157
    const v15, 0x402eb852    # 2.73f

    .line 158
    .line 159
    .line 160
    const v16, 0x40e3851f    # 7.11f

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const/high16 v17, 0x41400000    # 12.0f

    .line 167
    .line 168
    const/high16 v18, 0x41980000    # 19.0f

    .line 169
    .line 170
    const v13, 0x402eb852    # 2.73f

    .line 171
    .line 172
    .line 173
    const v14, 0x417e3d71    # 15.89f

    .line 174
    .line 175
    .line 176
    const/high16 v15, 0x40e00000    # 7.0f

    .line 177
    .line 178
    const/high16 v16, 0x41980000    # 19.0f

    .line 179
    .line 180
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const/high16 v0, 0x41300000    # 11.0f

    .line 184
    .line 185
    const/high16 v2, -0x3f100000    # -7.5f

    .line 186
    .line 187
    const v4, 0x411451ec    # 9.27f

    .line 188
    .line 189
    .line 190
    const v6, -0x3fb8f5c3    # -3.11f

    .line 191
    .line 192
    .line 193
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const/high16 v18, 0x40800000    # 4.0f

    .line 197
    .line 198
    const v13, 0x41aa28f6    # 21.27f

    .line 199
    .line 200
    .line 201
    const v14, 0x40e3851f    # 7.11f

    .line 202
    .line 203
    .line 204
    const/high16 v15, 0x41880000    # 17.0f

    .line 205
    .line 206
    const/high16 v16, 0x40800000    # 4.0f

    .line 207
    .line 208
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const/high16 v0, 0x41100000    # 9.0f

    .line 215
    .line 216
    const/high16 v2, 0x41400000    # 12.0f

    .line 217
    .line 218
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const/high16 v17, 0x40200000    # 2.5f

    .line 222
    .line 223
    const/high16 v18, 0x40200000    # 2.5f

    .line 224
    .line 225
    const v13, 0x3fb0a3d7    # 1.38f

    .line 226
    .line 227
    .line 228
    const/4 v14, 0x0

    .line 229
    const/high16 v15, 0x40200000    # 2.5f

    .line 230
    .line 231
    const v16, 0x3f8f5c29    # 1.12f

    .line 232
    .line 233
    .line 234
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v0, 0x4156147b    # 13.38f

    .line 238
    .line 239
    .line 240
    const/high16 v2, 0x41600000    # 14.0f

    .line 241
    .line 242
    const/high16 v4, 0x41400000    # 12.0f

    .line 243
    .line 244
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    const v0, -0x4070a3d7    # -1.12f

    .line 248
    .line 249
    .line 250
    const/high16 v2, -0x3fe00000    # -2.5f

    .line 251
    .line 252
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const v0, 0x4129eb85    # 10.62f

    .line 256
    .line 257
    .line 258
    const/high16 v2, 0x41100000    # 9.0f

    .line 259
    .line 260
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/high16 v0, -0x40000000    # -2.0f

    .line 264
    .line 265
    const/4 v2, 0x0

    .line 266
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const/high16 v17, -0x3f700000    # -4.5f

    .line 270
    .line 271
    const/high16 v18, 0x40900000    # 4.5f

    .line 272
    .line 273
    const v13, -0x3fe147ae    # -2.48f

    .line 274
    .line 275
    .line 276
    const/high16 v15, -0x3f700000    # -4.5f

    .line 277
    .line 278
    const v16, 0x400147ae    # 2.02f

    .line 279
    .line 280
    .line 281
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const v0, 0x411851ec    # 9.52f

    .line 285
    .line 286
    .line 287
    const/high16 v2, 0x41800000    # 16.0f

    .line 288
    .line 289
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 290
    .line 291
    .line 292
    const v0, -0x3ffeb852    # -2.02f

    .line 293
    .line 294
    .line 295
    const/high16 v2, -0x3f700000    # -4.5f

    .line 296
    .line 297
    const/high16 v4, 0x40900000    # 4.5f

    .line 298
    .line 299
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 300
    .line 301
    .line 302
    const v0, 0x4167ae14    # 14.48f

    .line 303
    .line 304
    .line 305
    const/high16 v2, 0x40e00000    # 7.0f

    .line 306
    .line 307
    const/high16 v4, 0x41400000    # 12.0f

    .line 308
    .line 309
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    const/16 v16, 0x3800

    .line 320
    .line 321
    const/16 v17, 0x0

    .line 322
    .line 323
    const/high16 v6, 0x3f800000    # 1.0f

    .line 324
    .line 325
    const/high16 v8, 0x3f800000    # 1.0f

    .line 326
    .line 327
    const/4 v7, 0x0

    .line 328
    const/high16 v9, 0x3f800000    # 1.0f

    .line 329
    .line 330
    const/high16 v12, 0x3f800000    # 1.0f

    .line 331
    .line 332
    const/4 v13, 0x0

    .line 333
    const/4 v15, 0x0

    .line 334
    const-string v4, ""

    .line 335
    .line 336
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    sput-object v0, Landroidx/compose/material/icons/outlined/VisibilityKt;->_visibility:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 345
    .line 346
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 347
    .line 348
    .line 349
    return-object v0
.end method
