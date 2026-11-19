.class public final Landroidx/compose/material/icons/rounded/CssKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_css",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Css",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getCss",
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
        "SMAP\nCss.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Css.kt\nandroidx/compose/material/icons/rounded/CssKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,105:1\n212#2,12:106\n233#2,18:119\n253#2:156\n174#3:118\n705#4,2:137\n717#4,2:139\n719#4,11:145\n72#5,4:141\n*S KotlinDebug\n*F\n+ 1 Css.kt\nandroidx/compose/material/icons/rounded/CssKt\n*L\n29#1:106,12\n30#1:119,18\n30#1:156\n29#1:118\n30#1:137,2\n30#1:139,2\n30#1:145,11\n30#1:141,4\n*E\n"
    }
.end annotation


# static fields
.field private static _css:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCss(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/CssKt;->_css:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Css"

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
    const/high16 v0, 0x41000000    # 8.0f

    .line 71
    .line 72
    const/high16 v2, 0x41240000    # 10.25f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x40e80000    # 7.25f

    .line 78
    .line 79
    const/high16 v18, 0x41300000    # 11.0f

    .line 80
    .line 81
    const/high16 v13, 0x41000000    # 8.0f

    .line 82
    .line 83
    const v14, 0x412a8f5c    # 10.66f

    .line 84
    .line 85
    .line 86
    const v15, 0x40f51eb8    # 7.66f

    .line 87
    .line 88
    .line 89
    const/high16 v16, 0x41300000    # 11.0f

    .line 90
    .line 91
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const v17, -0x40ca3d71    # -0.71f

    .line 95
    .line 96
    .line 97
    const/high16 v18, -0x41000000    # -0.5f

    .line 98
    .line 99
    const v13, -0x41570a3d    # -0.33f

    .line 100
    .line 101
    .line 102
    const/4 v14, 0x0

    .line 103
    const v15, -0x40e66666    # -0.6f

    .line 104
    .line 105
    .line 106
    const v16, -0x41a8f5c3    # -0.21f

    .line 107
    .line 108
    .line 109
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v0, -0x3ffd70a4    # -2.04f

    .line 113
    .line 114
    .line 115
    const/4 v2, 0x0

    .line 116
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v0, 0x40400000    # 3.0f

    .line 120
    .line 121
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const v0, 0x40028f5c    # 2.04f

    .line 125
    .line 126
    .line 127
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    const v17, 0x3f35c28f    # 0.71f

    .line 131
    .line 132
    .line 133
    const v13, 0x3dcccccd    # 0.1f

    .line 134
    .line 135
    .line 136
    const v14, -0x416b851f    # -0.29f

    .line 137
    .line 138
    .line 139
    const v15, 0x3ec28f5c    # 0.38f

    .line 140
    .line 141
    .line 142
    const/high16 v16, -0x41000000    # -0.5f

    .line 143
    .line 144
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v17, 0x41000000    # 8.0f

    .line 148
    .line 149
    const/high16 v18, 0x415c0000    # 13.75f

    .line 150
    .line 151
    const v13, 0x40f51eb8    # 7.66f

    .line 152
    .line 153
    .line 154
    const/high16 v14, 0x41500000    # 13.0f

    .line 155
    .line 156
    const/high16 v15, 0x41000000    # 8.0f

    .line 157
    .line 158
    const v16, 0x415570a4    # 13.34f

    .line 159
    .line 160
    .line 161
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/high16 v0, 0x41600000    # 14.0f

    .line 165
    .line 166
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const/high16 v17, -0x40800000    # -1.0f

    .line 170
    .line 171
    const/high16 v18, 0x3f800000    # 1.0f

    .line 172
    .line 173
    const/4 v13, 0x0

    .line 174
    const v14, 0x3f0ccccd    # 0.55f

    .line 175
    .line 176
    .line 177
    const v15, -0x4119999a    # -0.45f

    .line 178
    .line 179
    .line 180
    const/high16 v16, 0x3f800000    # 1.0f

    .line 181
    .line 182
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const/high16 v0, 0x40800000    # 4.0f

    .line 186
    .line 187
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v18, -0x40800000    # -1.0f

    .line 191
    .line 192
    const v13, -0x40f33333    # -0.55f

    .line 193
    .line 194
    .line 195
    const/4 v14, 0x0

    .line 196
    const/high16 v15, -0x40800000    # -1.0f

    .line 197
    .line 198
    const v16, -0x4119999a    # -0.45f

    .line 199
    .line 200
    .line 201
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const/high16 v0, -0x3f800000    # -4.0f

    .line 205
    .line 206
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    .line 209
    const/high16 v17, 0x3f800000    # 1.0f

    .line 210
    .line 211
    const/4 v13, 0x0

    .line 212
    const v14, -0x40f33333    # -0.55f

    .line 213
    .line 214
    .line 215
    const v15, 0x3ee66666    # 0.45f

    .line 216
    .line 217
    .line 218
    const/high16 v16, -0x40800000    # -1.0f

    .line 219
    .line 220
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const/high16 v0, 0x40400000    # 3.0f

    .line 224
    .line 225
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v18, 0x3f800000    # 1.0f

    .line 229
    .line 230
    const v13, 0x3f0ccccd    # 0.55f

    .line 231
    .line 232
    .line 233
    const/4 v14, 0x0

    .line 234
    const/high16 v15, 0x3f800000    # 1.0f

    .line 235
    .line 236
    const v16, 0x3ee66666    # 0.45f

    .line 237
    .line 238
    .line 239
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 240
    .line 241
    .line 242
    const/high16 v0, 0x41240000    # 10.25f

    .line 243
    .line 244
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v0, 0x4150a3d7    # 13.04f

    .line 251
    .line 252
    .line 253
    const/high16 v2, 0x41280000    # 10.5f

    .line 254
    .line 255
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    const v17, 0x3f35c28f    # 0.71f

    .line 259
    .line 260
    .line 261
    const/high16 v18, 0x3f000000    # 0.5f

    .line 262
    .line 263
    const v13, 0x3dcccccd    # 0.1f

    .line 264
    .line 265
    .line 266
    const v14, 0x3e947ae1    # 0.29f

    .line 267
    .line 268
    .line 269
    const v15, 0x3ec28f5c    # 0.38f

    .line 270
    .line 271
    .line 272
    const/high16 v16, 0x3f000000    # 0.5f

    .line 273
    .line 274
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 275
    .line 276
    .line 277
    const/high16 v17, 0x3f400000    # 0.75f

    .line 278
    .line 279
    const/high16 v18, -0x40c00000    # -0.75f

    .line 280
    .line 281
    const v13, 0x3ed1eb85    # 0.41f

    .line 282
    .line 283
    .line 284
    const/4 v14, 0x0

    .line 285
    const/high16 v15, 0x3f400000    # 0.75f

    .line 286
    .line 287
    const v16, -0x4151eb85    # -0.34f

    .line 288
    .line 289
    .line 290
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const/high16 v0, 0x41200000    # 10.0f

    .line 294
    .line 295
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v17, -0x40800000    # -1.0f

    .line 299
    .line 300
    const/high16 v18, -0x40800000    # -1.0f

    .line 301
    .line 302
    const/4 v13, 0x0

    .line 303
    const v14, -0x40f33333    # -0.55f

    .line 304
    .line 305
    .line 306
    const v15, -0x4119999a    # -0.45f

    .line 307
    .line 308
    .line 309
    const/high16 v16, -0x40800000    # -1.0f

    .line 310
    .line 311
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 315
    .line 316
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v18, 0x3f800000    # 1.0f

    .line 320
    .line 321
    const v13, -0x40f33333    # -0.55f

    .line 322
    .line 323
    .line 324
    const/4 v14, 0x0

    .line 325
    const/high16 v15, -0x40800000    # -1.0f

    .line 326
    .line 327
    const v16, 0x3ee66666    # 0.45f

    .line 328
    .line 329
    .line 330
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 334
    .line 335
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const/high16 v17, 0x3f800000    # 1.0f

    .line 339
    .line 340
    const/4 v13, 0x0

    .line 341
    const v14, 0x3f0ccccd    # 0.55f

    .line 342
    .line 343
    .line 344
    const v15, 0x3ee66666    # 0.45f

    .line 345
    .line 346
    .line 347
    const/high16 v16, 0x3f800000    # 1.0f

    .line 348
    .line 349
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 350
    .line 351
    .line 352
    const/high16 v0, 0x41500000    # 13.0f

    .line 353
    .line 354
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const/high16 v0, 0x3f800000    # 1.0f

    .line 358
    .line 359
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v0, -0x3ffd70a4    # -2.04f

    .line 363
    .line 364
    .line 365
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 366
    .line 367
    .line 368
    const/4 v0, 0x0

    .line 369
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const v17, -0x40ca3d71    # -0.71f

    .line 373
    .line 374
    .line 375
    const/high16 v18, -0x41000000    # -0.5f

    .line 376
    .line 377
    const v13, -0x42333333    # -0.1f

    .line 378
    .line 379
    .line 380
    const v14, -0x416b851f    # -0.29f

    .line 381
    .line 382
    .line 383
    const v15, -0x413d70a4    # -0.38f

    .line 384
    .line 385
    .line 386
    const/high16 v16, -0x41000000    # -0.5f

    .line 387
    .line 388
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 389
    .line 390
    .line 391
    const/high16 v17, -0x40c00000    # -0.75f

    .line 392
    .line 393
    const/high16 v18, 0x3f400000    # 0.75f

    .line 394
    .line 395
    const v13, -0x412e147b    # -0.41f

    .line 396
    .line 397
    .line 398
    const/4 v14, 0x0

    .line 399
    const/high16 v15, -0x40c00000    # -0.75f

    .line 400
    .line 401
    const v16, 0x3eae147b    # 0.34f

    .line 402
    .line 403
    .line 404
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const/high16 v0, 0x41600000    # 14.0f

    .line 408
    .line 409
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 410
    .line 411
    .line 412
    const/high16 v17, 0x3f800000    # 1.0f

    .line 413
    .line 414
    const/high16 v18, 0x3f800000    # 1.0f

    .line 415
    .line 416
    const/4 v13, 0x0

    .line 417
    const v14, 0x3f0ccccd    # 0.55f

    .line 418
    .line 419
    .line 420
    const v15, 0x3ee66666    # 0.45f

    .line 421
    .line 422
    .line 423
    const/high16 v16, 0x3f800000    # 1.0f

    .line 424
    .line 425
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 426
    .line 427
    .line 428
    const/high16 v0, 0x40400000    # 3.0f

    .line 429
    .line 430
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const/high16 v18, -0x40800000    # -1.0f

    .line 434
    .line 435
    const v13, 0x3f0ccccd    # 0.55f

    .line 436
    .line 437
    .line 438
    const/4 v14, 0x0

    .line 439
    const/high16 v15, 0x3f800000    # 1.0f

    .line 440
    .line 441
    const v16, -0x4119999a    # -0.45f

    .line 442
    .line 443
    .line 444
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const/high16 v0, -0x40400000    # -1.5f

    .line 448
    .line 449
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const/high16 v17, -0x40800000    # -1.0f

    .line 453
    .line 454
    const/4 v13, 0x0

    .line 455
    const v14, -0x40f33333    # -0.55f

    .line 456
    .line 457
    .line 458
    const v15, -0x4119999a    # -0.45f

    .line 459
    .line 460
    .line 461
    const/high16 v16, -0x40800000    # -1.0f

    .line 462
    .line 463
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const/high16 v0, 0x41300000    # 11.0f

    .line 467
    .line 468
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 469
    .line 470
    .line 471
    const/high16 v0, -0x40800000    # -1.0f

    .line 472
    .line 473
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const v0, 0x4150a3d7    # 13.04f

    .line 477
    .line 478
    .line 479
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 480
    .line 481
    .line 482
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const v0, 0x419c51ec    # 19.54f

    .line 486
    .line 487
    .line 488
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 489
    .line 490
    .line 491
    const v17, 0x3f35c28f    # 0.71f

    .line 492
    .line 493
    .line 494
    const/high16 v18, 0x3f000000    # 0.5f

    .line 495
    .line 496
    const v13, 0x3dcccccd    # 0.1f

    .line 497
    .line 498
    .line 499
    const v14, 0x3e947ae1    # 0.29f

    .line 500
    .line 501
    .line 502
    const v15, 0x3ec28f5c    # 0.38f

    .line 503
    .line 504
    .line 505
    const/high16 v16, 0x3f000000    # 0.5f

    .line 506
    .line 507
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    const/high16 v17, 0x3f400000    # 0.75f

    .line 511
    .line 512
    const/high16 v18, -0x40c00000    # -0.75f

    .line 513
    .line 514
    const v13, 0x3ed1eb85    # 0.41f

    .line 515
    .line 516
    .line 517
    const/4 v14, 0x0

    .line 518
    const/high16 v15, 0x3f400000    # 0.75f

    .line 519
    .line 520
    const v16, -0x4151eb85    # -0.34f

    .line 521
    .line 522
    .line 523
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 524
    .line 525
    .line 526
    const/high16 v0, 0x41200000    # 10.0f

    .line 527
    .line 528
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const/high16 v17, -0x40800000    # -1.0f

    .line 532
    .line 533
    const/high16 v18, -0x40800000    # -1.0f

    .line 534
    .line 535
    const/4 v13, 0x0

    .line 536
    const v14, -0x40f33333    # -0.55f

    .line 537
    .line 538
    .line 539
    const v15, -0x4119999a    # -0.45f

    .line 540
    .line 541
    .line 542
    const/high16 v16, -0x40800000    # -1.0f

    .line 543
    .line 544
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 548
    .line 549
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    .line 552
    const/high16 v18, 0x3f800000    # 1.0f

    .line 553
    .line 554
    const v13, -0x40f33333    # -0.55f

    .line 555
    .line 556
    .line 557
    const/4 v14, 0x0

    .line 558
    const/high16 v15, -0x40800000    # -1.0f

    .line 559
    .line 560
    const v16, 0x3ee66666    # 0.45f

    .line 561
    .line 562
    .line 563
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const/high16 v0, 0x3fc00000    # 1.5f

    .line 567
    .line 568
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const/high16 v17, 0x3f800000    # 1.0f

    .line 572
    .line 573
    const/4 v13, 0x0

    .line 574
    const v14, 0x3f0ccccd    # 0.55f

    .line 575
    .line 576
    .line 577
    const v15, 0x3ee66666    # 0.45f

    .line 578
    .line 579
    .line 580
    const/high16 v16, 0x3f800000    # 1.0f

    .line 581
    .line 582
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 583
    .line 584
    .line 585
    const/high16 v0, 0x40200000    # 2.5f

    .line 586
    .line 587
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 588
    .line 589
    .line 590
    const/high16 v0, 0x3f800000    # 1.0f

    .line 591
    .line 592
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 593
    .line 594
    .line 595
    const v0, -0x3ffd70a4    # -2.04f

    .line 596
    .line 597
    .line 598
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 599
    .line 600
    .line 601
    const/4 v0, 0x0

    .line 602
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const v17, -0x40ca3d71    # -0.71f

    .line 606
    .line 607
    .line 608
    const/high16 v18, -0x41000000    # -0.5f

    .line 609
    .line 610
    const v13, -0x42333333    # -0.1f

    .line 611
    .line 612
    .line 613
    const v14, -0x416b851f    # -0.29f

    .line 614
    .line 615
    .line 616
    const v15, -0x413d70a4    # -0.38f

    .line 617
    .line 618
    .line 619
    const/high16 v16, -0x41000000    # -0.5f

    .line 620
    .line 621
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 622
    .line 623
    .line 624
    const/high16 v17, 0x41800000    # 16.0f

    .line 625
    .line 626
    const/high16 v18, 0x415c0000    # 13.75f

    .line 627
    .line 628
    const v13, 0x4182b852    # 16.34f

    .line 629
    .line 630
    .line 631
    const/high16 v14, 0x41500000    # 13.0f

    .line 632
    .line 633
    const/high16 v15, 0x41800000    # 16.0f

    .line 634
    .line 635
    const v16, 0x415570a4    # 13.34f

    .line 636
    .line 637
    .line 638
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    const/high16 v0, 0x41600000    # 14.0f

    .line 642
    .line 643
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 644
    .line 645
    .line 646
    const/high16 v17, 0x3f800000    # 1.0f

    .line 647
    .line 648
    const/high16 v18, 0x3f800000    # 1.0f

    .line 649
    .line 650
    const/4 v13, 0x0

    .line 651
    const v14, 0x3f0ccccd    # 0.55f

    .line 652
    .line 653
    .line 654
    const v15, 0x3ee66666    # 0.45f

    .line 655
    .line 656
    .line 657
    const/high16 v16, 0x3f800000    # 1.0f

    .line 658
    .line 659
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 660
    .line 661
    .line 662
    const/high16 v0, 0x40400000    # 3.0f

    .line 663
    .line 664
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    const/high16 v18, -0x40800000    # -1.0f

    .line 668
    .line 669
    const v13, 0x3f0ccccd    # 0.55f

    .line 670
    .line 671
    .line 672
    const/4 v14, 0x0

    .line 673
    const/high16 v15, 0x3f800000    # 1.0f

    .line 674
    .line 675
    const v16, -0x4119999a    # -0.45f

    .line 676
    .line 677
    .line 678
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    const/high16 v0, -0x40400000    # -1.5f

    .line 682
    .line 683
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 684
    .line 685
    .line 686
    const/high16 v17, -0x40800000    # -1.0f

    .line 687
    .line 688
    const/4 v13, 0x0

    .line 689
    const v14, -0x40f33333    # -0.55f

    .line 690
    .line 691
    .line 692
    const v15, -0x4119999a    # -0.45f

    .line 693
    .line 694
    .line 695
    const/high16 v16, -0x40800000    # -1.0f

    .line 696
    .line 697
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 698
    .line 699
    .line 700
    const/high16 v0, -0x3fe00000    # -2.5f

    .line 701
    .line 702
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 703
    .line 704
    .line 705
    const/high16 v0, -0x40800000    # -1.0f

    .line 706
    .line 707
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    const v0, 0x419c51ec    # 19.54f

    .line 711
    .line 712
    .line 713
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 714
    .line 715
    .line 716
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 717
    .line 718
    .line 719
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 720
    .line 721
    .line 722
    move-result-object v2

    .line 723
    const/16 v16, 0x3800

    .line 724
    .line 725
    const/16 v17, 0x0

    .line 726
    .line 727
    const/high16 v6, 0x3f800000    # 1.0f

    .line 728
    .line 729
    const/high16 v8, 0x3f800000    # 1.0f

    .line 730
    .line 731
    const/4 v7, 0x0

    .line 732
    const/high16 v9, 0x3f800000    # 1.0f

    .line 733
    .line 734
    const/high16 v12, 0x3f800000    # 1.0f

    .line 735
    .line 736
    const/4 v14, 0x0

    .line 737
    const/4 v15, 0x0

    .line 738
    const-string v4, ""

    .line 739
    .line 740
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 741
    .line 742
    .line 743
    move-result-object v0

    .line 744
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 745
    .line 746
    .line 747
    move-result-object v0

    .line 748
    sput-object v0, Landroidx/compose/material/icons/rounded/CssKt;->_css:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 749
    .line 750
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 751
    .line 752
    .line 753
    return-object v0
.end method
