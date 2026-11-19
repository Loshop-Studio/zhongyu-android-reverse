.class public final Landroidx/compose/material/icons/outlined/EcoKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_eco",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Eco",
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getEco",
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
        "SMAP\nEco.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Eco.kt\nandroidx/compose/material/icons/outlined/EcoKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,53:1\n212#2,12:54\n233#2,18:67\n253#2:104\n174#3:66\n705#4,2:85\n717#4,2:87\n719#4,11:93\n72#5,4:89\n*S KotlinDebug\n*F\n+ 1 Eco.kt\nandroidx/compose/material/icons/outlined/EcoKt\n*L\n29#1:54,12\n30#1:67,18\n30#1:104\n29#1:66\n30#1:85,2\n30#1:87,2\n30#1:93,11\n30#1:89,4\n*E\n"
    }
.end annotation


# static fields
.field private static _eco:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getEco(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/EcoKt;->_eco:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.Eco"

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
    const v0, 0x4100cccd    # 8.05f

    .line 71
    .line 72
    .line 73
    const v2, 0x40c1999a    # 6.05f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/16 v17, 0x0

    .line 80
    .line 81
    const v18, 0x411e6666    # 9.9f

    .line 82
    .line 83
    .line 84
    const v13, -0x3fd147ae    # -2.73f

    .line 85
    .line 86
    .line 87
    const v14, 0x402eb852    # 2.73f

    .line 88
    .line 89
    .line 90
    const v15, -0x3fd147ae    # -2.73f

    .line 91
    .line 92
    .line 93
    const v16, 0x40e570a4    # 7.17f

    .line 94
    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v17, 0x41300000    # 11.0f

    .line 100
    .line 101
    const/high16 v18, 0x41a00000    # 20.0f

    .line 102
    .line 103
    const v13, 0x40ed70a4    # 7.42f

    .line 104
    .line 105
    .line 106
    const v14, 0x419a8f5c    # 19.32f

    .line 107
    .line 108
    .line 109
    const v15, 0x41135c29    # 9.21f

    .line 110
    .line 111
    .line 112
    const/high16 v16, 0x41a00000    # 20.0f

    .line 113
    .line 114
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v0, 0x409e6666    # 4.95f

    .line 118
    .line 119
    .line 120
    const v2, -0x3ffccccd    # -2.05f

    .line 121
    .line 122
    .line 123
    const v4, 0x40651eb8    # 3.58f

    .line 124
    .line 125
    .line 126
    const v6, -0x40d1eb85    # -0.68f

    .line 127
    .line 128
    .line 129
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 130
    .line 131
    .line 132
    const/high16 v17, 0x41a00000    # 20.0f

    .line 133
    .line 134
    const/high16 v18, 0x40800000    # 4.0f

    .line 135
    .line 136
    const v13, 0x419b70a4    # 19.43f

    .line 137
    .line 138
    .line 139
    const v14, 0x4167851f    # 14.47f

    .line 140
    .line 141
    .line 142
    const/high16 v15, 0x41a00000    # 20.0f

    .line 143
    .line 144
    const/high16 v16, 0x40800000    # 4.0f

    .line 145
    .line 146
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const v0, 0x41187ae1    # 9.53f

    .line 150
    .line 151
    .line 152
    const v2, 0x40923d71    # 4.57f

    .line 153
    .line 154
    .line 155
    const v4, 0x4100cccd    # 8.05f

    .line 156
    .line 157
    .line 158
    const v6, 0x40c1999a    # 6.05f

    .line 159
    .line 160
    .line 161
    invoke-virtual {v12, v0, v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const v0, 0x4168a3d7    # 14.54f

    .line 168
    .line 169
    .line 170
    const v2, 0x418451ec    # 16.54f

    .line 171
    .line 172
    .line 173
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 174
    .line 175
    .line 176
    const/high16 v17, 0x41300000    # 11.0f

    .line 177
    .line 178
    const/high16 v18, 0x41900000    # 18.0f

    .line 179
    .line 180
    const v13, 0x415970a4    # 13.59f

    .line 181
    .line 182
    .line 183
    const v14, 0x418bd70a    # 17.48f

    .line 184
    .line 185
    .line 186
    const v15, 0x414570a4    # 12.34f

    .line 187
    .line 188
    .line 189
    const/high16 v16, 0x41900000    # 18.0f

    .line 190
    .line 191
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 192
    .line 193
    .line 194
    const v17, -0x3fe147ae    # -2.48f

    .line 195
    .line 196
    .line 197
    const v18, -0x40d1eb85    # -0.68f

    .line 198
    .line 199
    .line 200
    const v13, -0x409c28f6    # -0.89f

    .line 201
    .line 202
    .line 203
    const/4 v14, 0x0

    .line 204
    const v15, -0x40228f5c    # -1.73f

    .line 205
    .line 206
    .line 207
    const/high16 v16, -0x41800000    # -0.25f

    .line 208
    .line 209
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const v17, 0x409c28f6    # 4.88f

    .line 213
    .line 214
    .line 215
    const v18, -0x3f15c28f    # -7.32f

    .line 216
    .line 217
    .line 218
    const v13, 0x3f6b851f    # 0.92f

    .line 219
    .line 220
    .line 221
    const v14, -0x3fc7ae14    # -2.88f

    .line 222
    .line 223
    .line 224
    const v15, 0x4027ae14    # 2.62f

    .line 225
    .line 226
    .line 227
    const v16, -0x3f52e148    # -5.41f

    .line 228
    .line 229
    .line 230
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 231
    .line 232
    .line 233
    const v17, -0x3f3428f6    # -6.37f

    .line 234
    .line 235
    .line 236
    const/high16 v18, 0x40c00000    # 6.0f

    .line 237
    .line 238
    const v13, -0x3fd7ae14    # -2.63f

    .line 239
    .line 240
    .line 241
    const v14, 0x3fae147b    # 1.36f

    .line 242
    .line 243
    .line 244
    const v15, -0x3f651eb8    # -4.84f

    .line 245
    .line 246
    .line 247
    const v16, 0x405d70a4    # 3.46f

    .line 248
    .line 249
    .line 250
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v17, 0x3ee147ae    # 0.44f

    .line 254
    .line 255
    .line 256
    const v18, -0x3f2eb852    # -6.54f

    .line 257
    .line 258
    .line 259
    const v13, -0x40428f5c    # -1.48f

    .line 260
    .line 261
    .line 262
    const v14, -0x40051eb8    # -1.96f

    .line 263
    .line 264
    .line 265
    const v15, -0x40533333    # -1.35f

    .line 266
    .line 267
    .line 268
    const/high16 v16, -0x3f680000    # -4.75f

    .line 269
    .line 270
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    const v17, 0x418e6666    # 17.8f

    .line 274
    .line 275
    .line 276
    const v18, 0x40c66666    # 6.2f

    .line 277
    .line 278
    .line 279
    const v13, 0x41135c29    # 9.21f

    .line 280
    .line 281
    .line 282
    const v14, 0x40f70a3d    # 7.72f

    .line 283
    .line 284
    .line 285
    const v15, 0x4160a3d7    # 14.04f

    .line 286
    .line 287
    .line 288
    const v16, 0x40d4cccd    # 6.65f

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const v17, 0x4168a3d7    # 14.54f

    .line 295
    .line 296
    .line 297
    const v18, 0x418451ec    # 16.54f

    .line 298
    .line 299
    .line 300
    const v13, 0x418acccd    # 17.35f

    .line 301
    .line 302
    .line 303
    const v14, 0x411f5c29    # 9.96f

    .line 304
    .line 305
    .line 306
    const v15, 0x41823d71    # 16.28f

    .line 307
    .line 308
    .line 309
    const v16, 0x416ca3d7    # 14.79f

    .line 310
    .line 311
    .line 312
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    const/16 v16, 0x3800

    .line 323
    .line 324
    const/16 v17, 0x0

    .line 325
    .line 326
    const/high16 v6, 0x3f800000    # 1.0f

    .line 327
    .line 328
    const/high16 v8, 0x3f800000    # 1.0f

    .line 329
    .line 330
    const/4 v7, 0x0

    .line 331
    const/high16 v9, 0x3f800000    # 1.0f

    .line 332
    .line 333
    const/high16 v12, 0x3f800000    # 1.0f

    .line 334
    .line 335
    const/4 v13, 0x0

    .line 336
    const/4 v14, 0x0

    .line 337
    const/4 v15, 0x0

    .line 338
    const-string v4, ""

    .line 339
    .line 340
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    sput-object v0, Landroidx/compose/material/icons/outlined/EcoKt;->_eco:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 349
    .line 350
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 351
    .line 352
    .line 353
    return-object v0
.end method
