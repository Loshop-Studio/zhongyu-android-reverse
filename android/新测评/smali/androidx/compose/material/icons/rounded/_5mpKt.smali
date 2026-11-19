.class public final Landroidx/compose/material/icons/rounded/_5mpKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "__5mp",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "_5mp",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "get_5mp",
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
        "SMAP\n_5mp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _5mp.kt\nandroidx/compose/material/icons/rounded/_5mpKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,105:1\n212#2,12:106\n233#2,18:119\n253#2:156\n233#2,18:157\n253#2:194\n174#3:118\n705#4,2:137\n717#4,2:139\n719#4,11:145\n705#4,2:175\n717#4,2:177\n719#4,11:183\n72#5,4:141\n72#5,4:179\n*S KotlinDebug\n*F\n+ 1 _5mp.kt\nandroidx/compose/material/icons/rounded/_5mpKt\n*L\n29#1:106,12\n30#1:119,18\n30#1:156\n37#1:157,18\n37#1:194\n29#1:118\n30#1:137,2\n30#1:139,2\n30#1:145,11\n37#1:175,2\n37#1:177,2\n37#1:183,11\n30#1:141,4\n37#1:179,4\n*E\n"
    }
.end annotation


# static fields
.field private static __5mp:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final get_5mp(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 20

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/_5mpKt;->__5mp:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded._5mp"

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
    const/high16 v4, 0x41700000    # 15.0f

    .line 71
    .line 72
    const/high16 v6, 0x41600000    # 14.0f

    .line 73
    .line 74
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 83
    .line 84
    .line 85
    const/high16 v4, -0x40400000    # -1.5f

    .line 86
    .line 87
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    const/16 v16, 0x3800

    .line 98
    .line 99
    const/16 v17, 0x0

    .line 100
    .line 101
    const/high16 v6, 0x3f800000    # 1.0f

    .line 102
    .line 103
    const/high16 v8, 0x3f800000    # 1.0f

    .line 104
    .line 105
    const/4 v7, 0x0

    .line 106
    const/high16 v9, 0x3f800000    # 1.0f

    .line 107
    .line 108
    const/high16 v12, 0x3f800000    # 1.0f

    .line 109
    .line 110
    const/4 v13, 0x0

    .line 111
    const/4 v14, 0x0

    .line 112
    const/4 v15, 0x0

    .line 113
    const-string v4, ""

    .line 114
    .line 115
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 116
    .line 117
    .line 118
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 123
    .line 124
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 125
    .line 126
    .line 127
    move-result-wide v6

    .line 128
    const/4 v0, 0x0

    .line 129
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 133
    .line 134
    .line 135
    move-result v10

    .line 136
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 137
    .line 138
    .line 139
    move-result v11

    .line 140
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 143
    .line 144
    .line 145
    const/high16 v0, 0x41980000    # 19.0f

    .line 146
    .line 147
    const/high16 v2, 0x40400000    # 3.0f

    .line 148
    .line 149
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v0, 0x40a00000    # 5.0f

    .line 153
    .line 154
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const/high16 v17, 0x40400000    # 3.0f

    .line 158
    .line 159
    const/high16 v18, 0x40a00000    # 5.0f

    .line 160
    .line 161
    const v13, 0x4079999a    # 3.9f

    .line 162
    .line 163
    .line 164
    const/high16 v14, 0x40400000    # 3.0f

    .line 165
    .line 166
    const/high16 v15, 0x40400000    # 3.0f

    .line 167
    .line 168
    const v16, 0x4079999a    # 3.9f

    .line 169
    .line 170
    .line 171
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 172
    .line 173
    .line 174
    const/high16 v0, 0x41600000    # 14.0f

    .line 175
    .line 176
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const/high16 v17, 0x40000000    # 2.0f

    .line 180
    .line 181
    const/high16 v18, 0x40000000    # 2.0f

    .line 182
    .line 183
    const/4 v13, 0x0

    .line 184
    const v14, 0x3f8ccccd    # 1.1f

    .line 185
    .line 186
    .line 187
    const v15, 0x3f666666    # 0.9f

    .line 188
    .line 189
    .line 190
    const/high16 v16, 0x40000000    # 2.0f

    .line 191
    .line 192
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v18, -0x40000000    # -2.0f

    .line 199
    .line 200
    const v13, 0x3f8ccccd    # 1.1f

    .line 201
    .line 202
    .line 203
    const/4 v14, 0x0

    .line 204
    const/high16 v15, 0x40000000    # 2.0f

    .line 205
    .line 206
    const v16, -0x4099999a    # -0.9f

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/high16 v0, 0x40a00000    # 5.0f

    .line 213
    .line 214
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 215
    .line 216
    .line 217
    const/high16 v17, 0x41980000    # 19.0f

    .line 218
    .line 219
    const/high16 v18, 0x40400000    # 3.0f

    .line 220
    .line 221
    const/high16 v13, 0x41a80000    # 21.0f

    .line 222
    .line 223
    const v14, 0x4079999a    # 3.9f

    .line 224
    .line 225
    .line 226
    const v15, 0x41a0cccd    # 20.1f

    .line 227
    .line 228
    .line 229
    const/high16 v16, 0x40400000    # 3.0f

    .line 230
    .line 231
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const/high16 v0, 0x41100000    # 9.0f

    .line 238
    .line 239
    const/high16 v2, 0x41300000    # 11.0f

    .line 240
    .line 241
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v17, -0x40800000    # -1.0f

    .line 245
    .line 246
    const/high16 v18, -0x40800000    # -1.0f

    .line 247
    .line 248
    const v13, -0x40f33333    # -0.55f

    .line 249
    .line 250
    .line 251
    const/4 v14, 0x0

    .line 252
    const/high16 v15, -0x40800000    # -1.0f

    .line 253
    .line 254
    const v16, -0x4119999a    # -0.45f

    .line 255
    .line 256
    .line 257
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 258
    .line 259
    .line 260
    const/high16 v0, 0x40d00000    # 6.5f

    .line 261
    .line 262
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 263
    .line 264
    .line 265
    const/high16 v17, 0x3f800000    # 1.0f

    .line 266
    .line 267
    const/4 v13, 0x0

    .line 268
    const v14, -0x40f33333    # -0.55f

    .line 269
    .line 270
    .line 271
    const v15, 0x3ee66666    # 0.45f

    .line 272
    .line 273
    .line 274
    const/high16 v16, -0x40800000    # -1.0f

    .line 275
    .line 276
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const/high16 v0, 0x40300000    # 2.75f

    .line 280
    .line 281
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 282
    .line 283
    .line 284
    const/high16 v17, 0x3f400000    # 0.75f

    .line 285
    .line 286
    const/high16 v18, 0x3f400000    # 0.75f

    .line 287
    .line 288
    const v13, 0x3ed1eb85    # 0.41f

    .line 289
    .line 290
    .line 291
    const/4 v14, 0x0

    .line 292
    const/high16 v15, 0x3f400000    # 0.75f

    .line 293
    .line 294
    const v16, 0x3eae147b    # 0.34f

    .line 295
    .line 296
    .line 297
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 298
    .line 299
    .line 300
    const v0, 0x41628f5c    # 14.16f

    .line 301
    .line 302
    .line 303
    const/high16 v2, 0x415c0000    # 13.75f

    .line 304
    .line 305
    const/high16 v4, 0x40e00000    # 7.0f

    .line 306
    .line 307
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 308
    .line 309
    .line 310
    const/high16 v0, 0x41380000    # 11.5f

    .line 311
    .line 312
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v0, 0x3f800000    # 1.0f

    .line 316
    .line 317
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 318
    .line 319
    .line 320
    const/high16 v0, 0x40000000    # 2.0f

    .line 321
    .line 322
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const/high16 v17, 0x3f800000    # 1.0f

    .line 326
    .line 327
    const/high16 v18, 0x3f800000    # 1.0f

    .line 328
    .line 329
    const v13, 0x3f0ccccd    # 0.55f

    .line 330
    .line 331
    .line 332
    const/high16 v15, 0x3f800000    # 1.0f

    .line 333
    .line 334
    const v16, 0x3ee66666    # 0.45f

    .line 335
    .line 336
    .line 337
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 341
    .line 342
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const/high16 v17, -0x40800000    # -1.0f

    .line 346
    .line 347
    const/4 v13, 0x0

    .line 348
    const v14, 0x3f0ccccd    # 0.55f

    .line 349
    .line 350
    .line 351
    const v15, -0x4119999a    # -0.45f

    .line 352
    .line 353
    .line 354
    const/high16 v16, 0x3f800000    # 1.0f

    .line 355
    .line 356
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 357
    .line 358
    .line 359
    const/high16 v0, -0x3fd00000    # -2.75f

    .line 360
    .line 361
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const/high16 v17, -0x40c00000    # -0.75f

    .line 365
    .line 366
    const/high16 v18, -0x40c00000    # -0.75f

    .line 367
    .line 368
    const v13, -0x412e147b    # -0.41f

    .line 369
    .line 370
    .line 371
    const/4 v14, 0x0

    .line 372
    const/high16 v15, -0x40c00000    # -0.75f

    .line 373
    .line 374
    const v16, -0x4151eb85    # -0.34f

    .line 375
    .line 376
    .line 377
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const v0, 0x412570a4    # 10.34f

    .line 381
    .line 382
    .line 383
    const/high16 v2, 0x412c0000    # 10.75f

    .line 384
    .line 385
    const/high16 v4, 0x41200000    # 10.0f

    .line 386
    .line 387
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const/high16 v0, 0x41500000    # 13.0f

    .line 391
    .line 392
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 393
    .line 394
    .line 395
    const/high16 v0, 0x41100000    # 9.0f

    .line 396
    .line 397
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 398
    .line 399
    .line 400
    const/high16 v0, 0x41300000    # 11.0f

    .line 401
    .line 402
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const/high16 v0, 0x41480000    # 12.5f

    .line 409
    .line 410
    const/high16 v2, 0x418e0000    # 17.75f

    .line 411
    .line 412
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v18, 0x3f400000    # 0.75f

    .line 416
    .line 417
    const/4 v13, 0x0

    .line 418
    const v14, 0x3ed1eb85    # 0.41f

    .line 419
    .line 420
    .line 421
    const v15, -0x4151eb85    # -0.34f

    .line 422
    .line 423
    .line 424
    const/high16 v16, 0x3f400000    # 0.75f

    .line 425
    .line 426
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 427
    .line 428
    .line 429
    const v0, 0x41915c29    # 18.17f

    .line 430
    .line 431
    .line 432
    const/high16 v4, 0x41300000    # 11.0f

    .line 433
    .line 434
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 435
    .line 436
    .line 437
    const/high16 v0, 0x41600000    # 14.0f

    .line 438
    .line 439
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 440
    .line 441
    .line 442
    const/high16 v0, -0x40800000    # -1.0f

    .line 443
    .line 444
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const/high16 v0, 0x40100000    # 2.25f

    .line 448
    .line 449
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const/high16 v17, 0x41140000    # 9.25f

    .line 453
    .line 454
    const/high16 v18, 0x41880000    # 17.0f

    .line 455
    .line 456
    const/high16 v13, 0x41200000    # 10.0f

    .line 457
    .line 458
    const v14, 0x41855c29    # 16.67f

    .line 459
    .line 460
    .line 461
    const v15, 0x411a8f5c    # 9.66f

    .line 462
    .line 463
    .line 464
    const/high16 v16, 0x41880000    # 17.0f

    .line 465
    .line 466
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 467
    .line 468
    .line 469
    const v0, 0x41855c29    # 16.67f

    .line 470
    .line 471
    .line 472
    const/high16 v2, 0x41820000    # 16.25f

    .line 473
    .line 474
    const/high16 v4, 0x41080000    # 8.5f

    .line 475
    .line 476
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    const/high16 v0, 0x41600000    # 14.0f

    .line 480
    .line 481
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 482
    .line 483
    .line 484
    const/high16 v0, -0x40800000    # -1.0f

    .line 485
    .line 486
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 487
    .line 488
    .line 489
    const/high16 v0, 0x40700000    # 3.75f

    .line 490
    .line 491
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const/high16 v17, -0x40c00000    # -0.75f

    .line 495
    .line 496
    const/high16 v18, 0x3f400000    # 0.75f

    .line 497
    .line 498
    const/4 v13, 0x0

    .line 499
    const v14, 0x3ed1eb85    # 0.41f

    .line 500
    .line 501
    .line 502
    const v15, -0x4151eb85    # -0.34f

    .line 503
    .line 504
    .line 505
    const/high16 v16, 0x3f400000    # 0.75f

    .line 506
    .line 507
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const/high16 v0, 0x40c00000    # 6.0f

    .line 511
    .line 512
    const v2, 0x41915c29    # 18.17f

    .line 513
    .line 514
    .line 515
    const/high16 v4, 0x418e0000    # 17.75f

    .line 516
    .line 517
    invoke-virtual {v12, v0, v2, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const/high16 v0, 0x41580000    # 13.5f

    .line 521
    .line 522
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 523
    .line 524
    .line 525
    const/high16 v17, 0x3f800000    # 1.0f

    .line 526
    .line 527
    const/high16 v18, -0x40800000    # -1.0f

    .line 528
    .line 529
    const v14, -0x40f33333    # -0.55f

    .line 530
    .line 531
    .line 532
    const v15, 0x3ee66666    # 0.45f

    .line 533
    .line 534
    .line 535
    const/high16 v16, -0x40800000    # -1.0f

    .line 536
    .line 537
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const/high16 v0, 0x40900000    # 4.5f

    .line 541
    .line 542
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const/high16 v18, 0x3f800000    # 1.0f

    .line 546
    .line 547
    const v13, 0x3f0ccccd    # 0.55f

    .line 548
    .line 549
    .line 550
    const/4 v14, 0x0

    .line 551
    const/high16 v15, 0x3f800000    # 1.0f

    .line 552
    .line 553
    const v16, 0x3ee66666    # 0.45f

    .line 554
    .line 555
    .line 556
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 557
    .line 558
    .line 559
    const/high16 v0, 0x418e0000    # 17.75f

    .line 560
    .line 561
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 562
    .line 563
    .line 564
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const/high16 v0, 0x41900000    # 18.0f

    .line 568
    .line 569
    const/high16 v2, 0x41800000    # 16.0f

    .line 570
    .line 571
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 572
    .line 573
    .line 574
    const/high16 v17, -0x40800000    # -1.0f

    .line 575
    .line 576
    const/4 v13, 0x0

    .line 577
    const v14, 0x3f0ccccd    # 0.55f

    .line 578
    .line 579
    .line 580
    const v15, -0x4119999a    # -0.45f

    .line 581
    .line 582
    .line 583
    const/high16 v16, 0x3f800000    # 1.0f

    .line 584
    .line 585
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 586
    .line 587
    .line 588
    const/high16 v0, -0x40000000    # -2.0f

    .line 589
    .line 590
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 591
    .line 592
    .line 593
    const/high16 v0, 0x3f400000    # 0.75f

    .line 594
    .line 595
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 596
    .line 597
    .line 598
    const/high16 v17, -0x40c00000    # -0.75f

    .line 599
    .line 600
    const/high16 v18, 0x3f400000    # 0.75f

    .line 601
    .line 602
    const v14, 0x3ed1eb85    # 0.41f

    .line 603
    .line 604
    .line 605
    const v15, -0x4151eb85    # -0.34f

    .line 606
    .line 607
    .line 608
    const/high16 v16, 0x3f400000    # 0.75f

    .line 609
    .line 610
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const v0, -0x4151eb85    # -0.34f

    .line 614
    .line 615
    .line 616
    const/high16 v2, -0x40c00000    # -0.75f

    .line 617
    .line 618
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 619
    .line 620
    .line 621
    const/high16 v0, 0x41580000    # 13.5f

    .line 622
    .line 623
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    const/high16 v17, 0x3f800000    # 1.0f

    .line 627
    .line 628
    const/high16 v18, -0x40800000    # -1.0f

    .line 629
    .line 630
    const v14, -0x40f33333    # -0.55f

    .line 631
    .line 632
    .line 633
    const v15, 0x3ee66666    # 0.45f

    .line 634
    .line 635
    .line 636
    const/high16 v16, -0x40800000    # -1.0f

    .line 637
    .line 638
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    const/high16 v0, 0x41880000    # 17.0f

    .line 642
    .line 643
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 644
    .line 645
    .line 646
    const/high16 v18, 0x3f800000    # 1.0f

    .line 647
    .line 648
    const v13, 0x3f0ccccd    # 0.55f

    .line 649
    .line 650
    .line 651
    const/4 v14, 0x0

    .line 652
    const/high16 v15, 0x3f800000    # 1.0f

    .line 653
    .line 654
    const v16, 0x3ee66666    # 0.45f

    .line 655
    .line 656
    .line 657
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    const/high16 v0, 0x41800000    # 16.0f

    .line 661
    .line 662
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 666
    .line 667
    .line 668
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 669
    .line 670
    .line 671
    move-result-object v2

    .line 672
    const/16 v16, 0x3800

    .line 673
    .line 674
    const/16 v17, 0x0

    .line 675
    .line 676
    const/high16 v6, 0x3f800000    # 1.0f

    .line 677
    .line 678
    const/4 v7, 0x0

    .line 679
    const/high16 v12, 0x3f800000    # 1.0f

    .line 680
    .line 681
    const/4 v13, 0x0

    .line 682
    const/4 v15, 0x0

    .line 683
    const-string v4, ""

    .line 684
    .line 685
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 686
    .line 687
    .line 688
    move-result-object v0

    .line 689
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 690
    .line 691
    .line 692
    move-result-object v0

    .line 693
    sput-object v0, Landroidx/compose/material/icons/rounded/_5mpKt;->__5mp:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 694
    .line 695
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 696
    .line 697
    .line 698
    return-object v0
.end method
