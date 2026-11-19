.class public final Landroidx/compose/material/icons/rounded/AttachFileKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_attachFile",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "AttachFile",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getAttachFile",
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
        "SMAP\nAttachFile.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttachFile.kt\nandroidx/compose/material/icons/rounded/AttachFileKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,63:1\n212#2,12:64\n233#2,18:77\n253#2:114\n174#3:76\n705#4,2:95\n717#4,2:97\n719#4,11:103\n72#5,4:99\n*S KotlinDebug\n*F\n+ 1 AttachFile.kt\nandroidx/compose/material/icons/rounded/AttachFileKt\n*L\n29#1:64,12\n30#1:77,18\n30#1:114\n29#1:76\n30#1:95,2\n30#1:97,2\n30#1:103,11\n30#1:99,4\n*E\n"
    }
.end annotation


# static fields
.field private static _attachFile:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAttachFile(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/AttachFileKt;->_attachFile:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.AttachFile"

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
    const/high16 v0, 0x41840000    # 16.5f

    .line 71
    .line 72
    const/high16 v2, 0x40d80000    # 6.75f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v0, 0x412947ae    # 10.58f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v17, -0x3f98f5c3    # -3.61f

    .line 84
    .line 85
    .line 86
    const v18, 0x4084cccd    # 4.15f

    .line 87
    .line 88
    .line 89
    const/4 v13, 0x0

    .line 90
    const v14, 0x4005c28f    # 2.09f

    .line 91
    .line 92
    .line 93
    const v15, -0x403c28f6    # -1.53f

    .line 94
    .line 95
    .line 96
    const v16, 0x407ccccd    # 3.95f

    .line 97
    .line 98
    .line 99
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const v17, -0x3f73851f    # -4.39f

    .line 103
    .line 104
    .line 105
    const v18, -0x3f8147ae    # -3.98f

    .line 106
    .line 107
    .line 108
    const v13, -0x3fe70a3d    # -2.39f

    .line 109
    .line 110
    .line 111
    const v14, 0x3e6b851f    # 0.23f

    .line 112
    .line 113
    .line 114
    const v15, -0x3f73851f    # -4.39f

    .line 115
    .line 116
    .line 117
    const v16, -0x402e147b    # -1.64f

    .line 118
    .line 119
    .line 120
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v0, 0x40a47ae1    # 5.14f

    .line 124
    .line 125
    .line 126
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const v17, 0x400f5c29    # 2.24f

    .line 130
    .line 131
    .line 132
    const v18, -0x3fd7ae14    # -2.63f

    .line 133
    .line 134
    .line 135
    const/4 v13, 0x0

    .line 136
    const v14, -0x405851ec    # -1.31f

    .line 137
    .line 138
    .line 139
    const v15, 0x3f70a3d7    # 0.94f

    .line 140
    .line 141
    .line 142
    const/high16 v16, -0x3fe00000    # -2.5f

    .line 143
    .line 144
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const v17, 0x4030a3d7    # 2.76f

    .line 148
    .line 149
    .line 150
    const v18, 0x401f5c29    # 2.49f

    .line 151
    .line 152
    .line 153
    const/high16 v13, 0x3fc00000    # 1.5f

    .line 154
    .line 155
    const v14, -0x41e66666    # -0.15f

    .line 156
    .line 157
    .line 158
    const v15, 0x4030a3d7    # 2.76f

    .line 159
    .line 160
    .line 161
    const v16, 0x3f828f5c    # 1.02f

    .line 162
    .line 163
    .line 164
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v0, 0x41280000    # 10.5f

    .line 168
    .line 169
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v17, -0x40800000    # -1.0f

    .line 173
    .line 174
    const/high16 v18, 0x3f800000    # 1.0f

    .line 175
    .line 176
    const/4 v13, 0x0

    .line 177
    const v14, 0x3f0ccccd    # 0.55f

    .line 178
    .line 179
    .line 180
    const v15, -0x4119999a    # -0.45f

    .line 181
    .line 182
    .line 183
    const/high16 v16, 0x3f800000    # 1.0f

    .line 184
    .line 185
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 186
    .line 187
    .line 188
    const v0, -0x4119999a    # -0.45f

    .line 189
    .line 190
    .line 191
    const/high16 v2, -0x40800000    # -1.0f

    .line 192
    .line 193
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 194
    .line 195
    .line 196
    const/high16 v0, 0x40d80000    # 6.75f

    .line 197
    .line 198
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const/high16 v17, -0x40c00000    # -0.75f

    .line 202
    .line 203
    const/high16 v18, -0x40c00000    # -0.75f

    .line 204
    .line 205
    const v14, -0x412e147b    # -0.41f

    .line 206
    .line 207
    .line 208
    const v15, -0x4151eb85    # -0.34f

    .line 209
    .line 210
    .line 211
    const/high16 v16, -0x40c00000    # -0.75f

    .line 212
    .line 213
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v0, 0x3f400000    # 0.75f

    .line 217
    .line 218
    const v2, 0x3eae147b    # 0.34f

    .line 219
    .line 220
    .line 221
    const/high16 v4, -0x40c00000    # -0.75f

    .line 222
    .line 223
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 224
    .line 225
    .line 226
    const v0, 0x4109c28f    # 8.61f

    .line 227
    .line 228
    .line 229
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 230
    .line 231
    .line 232
    const v17, 0x400f5c29    # 2.24f

    .line 233
    .line 234
    .line 235
    const v18, 0x402851ec    # 2.63f

    .line 236
    .line 237
    .line 238
    const v14, 0x3fa7ae14    # 1.31f

    .line 239
    .line 240
    .line 241
    const v15, 0x3f70a3d7    # 0.94f

    .line 242
    .line 243
    .line 244
    const/high16 v16, 0x40200000    # 2.5f

    .line 245
    .line 246
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const v17, 0x4030a3d7    # 2.76f

    .line 250
    .line 251
    .line 252
    const v18, -0x3fe0a3d7    # -2.49f

    .line 253
    .line 254
    .line 255
    const/high16 v13, 0x3fc00000    # 1.5f

    .line 256
    .line 257
    const v14, 0x3e19999a    # 0.15f

    .line 258
    .line 259
    .line 260
    const v15, 0x4030a3d7    # 2.76f

    .line 261
    .line 262
    .line 263
    const v16, -0x407d70a4    # -1.02f

    .line 264
    .line 265
    .line 266
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const v0, 0x40a570a4    # 5.17f

    .line 270
    .line 271
    .line 272
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const v17, -0x3f98f5c3    # -3.61f

    .line 276
    .line 277
    .line 278
    const v18, -0x3f7b3333    # -4.15f

    .line 279
    .line 280
    .line 281
    const/4 v13, 0x0

    .line 282
    const v14, -0x3ffa3d71    # -2.09f

    .line 283
    .line 284
    .line 285
    const v15, -0x403c28f6    # -1.53f

    .line 286
    .line 287
    .line 288
    const v16, -0x3f833333    # -3.95f

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    const/high16 v17, 0x40e00000    # 7.0f

    .line 295
    .line 296
    const/high16 v18, 0x40a00000    # 5.0f

    .line 297
    .line 298
    const v13, 0x411028f6    # 9.01f

    .line 299
    .line 300
    .line 301
    const v14, 0x3f4a3d71    # 0.79f

    .line 302
    .line 303
    .line 304
    const/high16 v15, 0x40e00000    # 7.0f

    .line 305
    .line 306
    const v16, 0x402a3d71    # 2.66f

    .line 307
    .line 308
    .line 309
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v0, 0x414451ec    # 12.27f

    .line 313
    .line 314
    .line 315
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v17, 0x409eb852    # 4.96f

    .line 319
    .line 320
    .line 321
    const v18, 0x40b6b852    # 5.71f

    .line 322
    .line 323
    .line 324
    const/4 v13, 0x0

    .line 325
    const v14, 0x4037ae14    # 2.87f

    .line 326
    .line 327
    .line 328
    const v15, 0x40066666    # 2.1f

    .line 329
    .line 330
    .line 331
    const v16, 0x40ae147b    # 5.44f

    .line 332
    .line 333
    .line 334
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const v17, 0x40c147ae    # 6.04f

    .line 338
    .line 339
    .line 340
    const v18, -0x3f50a3d7    # -5.48f

    .line 341
    .line 342
    .line 343
    const v13, 0x40528f5c    # 3.29f

    .line 344
    .line 345
    .line 346
    const v14, 0x3e99999a    # 0.3f

    .line 347
    .line 348
    .line 349
    const v15, 0x40c147ae    # 6.04f

    .line 350
    .line 351
    .line 352
    const v16, -0x3fef5c29    # -2.26f

    .line 353
    .line 354
    .line 355
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v0, 0x40d80000    # 6.75f

    .line 359
    .line 360
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const/high16 v17, -0x40c00000    # -0.75f

    .line 364
    .line 365
    const/high16 v18, -0x40c00000    # -0.75f

    .line 366
    .line 367
    const/4 v13, 0x0

    .line 368
    const v14, -0x412e147b    # -0.41f

    .line 369
    .line 370
    .line 371
    const v15, -0x4151eb85    # -0.34f

    .line 372
    .line 373
    .line 374
    const/high16 v16, -0x40c00000    # -0.75f

    .line 375
    .line 376
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const/high16 v0, 0x3f400000    # 0.75f

    .line 380
    .line 381
    invoke-virtual {v12, v4, v2, v4, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 382
    .line 383
    .line 384
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 388
    .line 389
    .line 390
    move-result-object v2

    .line 391
    const/16 v16, 0x3800

    .line 392
    .line 393
    const/16 v17, 0x0

    .line 394
    .line 395
    const/high16 v6, 0x3f800000    # 1.0f

    .line 396
    .line 397
    const/high16 v8, 0x3f800000    # 1.0f

    .line 398
    .line 399
    const/4 v7, 0x0

    .line 400
    const/high16 v9, 0x3f800000    # 1.0f

    .line 401
    .line 402
    const/high16 v12, 0x3f800000    # 1.0f

    .line 403
    .line 404
    const/4 v14, 0x0

    .line 405
    const/4 v15, 0x0

    .line 406
    const-string v4, ""

    .line 407
    .line 408
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    sput-object v0, Landroidx/compose/material/icons/rounded/AttachFileKt;->_attachFile:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 417
    .line 418
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 419
    .line 420
    .line 421
    return-object v0
.end method
