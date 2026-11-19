.class public final Landroidx/compose/material/icons/rounded/AttachmentKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_attachment",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Attachment",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getAttachment",
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
        "SMAP\nAttachment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Attachment.kt\nandroidx/compose/material/icons/rounded/AttachmentKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,63:1\n212#2,12:64\n233#2,18:77\n253#2:114\n174#3:76\n705#4,2:95\n717#4,2:97\n719#4,11:103\n72#5,4:99\n*S KotlinDebug\n*F\n+ 1 Attachment.kt\nandroidx/compose/material/icons/rounded/AttachmentKt\n*L\n29#1:64,12\n30#1:77,18\n30#1:114\n29#1:76\n30#1:95,2\n30#1:97,2\n30#1:103,11\n30#1:99,4\n*E\n"
    }
.end annotation


# static fields
.field private static _attachment:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAttachment(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/AttachmentKt;->_attachment:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.Attachment"

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
    const/high16 v0, 0x418e0000    # 17.75f

    .line 71
    .line 72
    const/high16 v2, 0x41800000    # 16.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v0, 0x40e570a4    # 7.17f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v17, -0x3f7b3333    # -4.15f

    .line 84
    .line 85
    .line 86
    const v18, -0x3f98f5c3    # -3.61f

    .line 87
    .line 88
    .line 89
    const v13, -0x3ffa3d71    # -2.09f

    .line 90
    .line 91
    .line 92
    const/4 v14, 0x0

    .line 93
    const v15, -0x3f833333    # -3.95f

    .line 94
    .line 95
    .line 96
    const v16, -0x403c28f6    # -1.53f

    .line 97
    .line 98
    .line 99
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 100
    .line 101
    .line 102
    const/high16 v17, 0x40e00000    # 7.0f

    .line 103
    .line 104
    const/high16 v18, 0x41000000    # 8.0f

    .line 105
    .line 106
    const v13, 0x40328f5c    # 2.79f

    .line 107
    .line 108
    .line 109
    const v14, 0x412028f6    # 10.01f

    .line 110
    .line 111
    .line 112
    const v15, 0x40951eb8    # 4.66f

    .line 113
    .line 114
    .line 115
    const/high16 v16, 0x41000000    # 8.0f

    .line 116
    .line 117
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const v0, 0x4145c28f    # 12.36f

    .line 121
    .line 122
    .line 123
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const v17, 0x402851ec    # 2.63f

    .line 127
    .line 128
    .line 129
    const v18, 0x400f5c29    # 2.24f

    .line 130
    .line 131
    .line 132
    const v13, 0x3fa7ae14    # 1.31f

    .line 133
    .line 134
    .line 135
    const/4 v14, 0x0

    .line 136
    const/high16 v15, 0x40200000    # 2.5f

    .line 137
    .line 138
    const v16, 0x3f70a3d7    # 0.94f

    .line 139
    .line 140
    .line 141
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v17, -0x3fe0a3d7    # -2.49f

    .line 145
    .line 146
    .line 147
    const v18, 0x4030a3d7    # 2.76f

    .line 148
    .line 149
    .line 150
    const v13, 0x3e19999a    # 0.15f

    .line 151
    .line 152
    .line 153
    const/high16 v14, 0x3fc00000    # 1.5f

    .line 154
    .line 155
    const v15, -0x407d70a4    # -1.02f

    .line 156
    .line 157
    .line 158
    const v16, 0x4030a3d7    # 2.76f

    .line 159
    .line 160
    .line 161
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/high16 v0, 0x41100000    # 9.0f

    .line 165
    .line 166
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 167
    .line 168
    .line 169
    const/high16 v17, -0x40800000    # -1.0f

    .line 170
    .line 171
    const/high16 v18, -0x40800000    # -1.0f

    .line 172
    .line 173
    const v13, -0x40f33333    # -0.55f

    .line 174
    .line 175
    .line 176
    const/4 v14, 0x0

    .line 177
    const/high16 v15, -0x40800000    # -1.0f

    .line 178
    .line 179
    const v16, -0x4119999a    # -0.45f

    .line 180
    .line 181
    .line 182
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 183
    .line 184
    .line 185
    const v0, 0x3ee66666    # 0.45f

    .line 186
    .line 187
    .line 188
    const/high16 v2, 0x3f800000    # 1.0f

    .line 189
    .line 190
    const/high16 v4, -0x40800000    # -1.0f

    .line 191
    .line 192
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const/high16 v0, 0x410c0000    # 8.75f

    .line 196
    .line 197
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const/high16 v17, 0x3f400000    # 0.75f

    .line 201
    .line 202
    const/high16 v18, -0x40c00000    # -0.75f

    .line 203
    .line 204
    const v13, 0x3ed1eb85    # 0.41f

    .line 205
    .line 206
    .line 207
    const/high16 v15, 0x3f400000    # 0.75f

    .line 208
    .line 209
    const v16, -0x4151eb85    # -0.34f

    .line 210
    .line 211
    .line 212
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v0, -0x4151eb85    # -0.34f

    .line 216
    .line 217
    .line 218
    const/high16 v2, -0x40c00000    # -0.75f

    .line 219
    .line 220
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 221
    .line 222
    .line 223
    const v0, 0x41123d71    # 9.14f

    .line 224
    .line 225
    .line 226
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const v17, -0x3fd7ae14    # -2.63f

    .line 230
    .line 231
    .line 232
    const v18, 0x400f5c29    # 2.24f

    .line 233
    .line 234
    .line 235
    const v13, -0x405851ec    # -1.31f

    .line 236
    .line 237
    .line 238
    const/high16 v15, -0x3fe00000    # -2.5f

    .line 239
    .line 240
    const v16, 0x3f70a3d7    # 0.94f

    .line 241
    .line 242
    .line 243
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const v17, 0x401f5c29    # 2.49f

    .line 247
    .line 248
    .line 249
    const v18, 0x4030a3d7    # 2.76f

    .line 250
    .line 251
    .line 252
    const v13, -0x41e66666    # -0.15f

    .line 253
    .line 254
    .line 255
    const/high16 v14, 0x3fc00000    # 1.5f

    .line 256
    .line 257
    const v15, 0x3f828f5c    # 1.02f

    .line 258
    .line 259
    .line 260
    const v16, 0x4030a3d7    # 2.76f

    .line 261
    .line 262
    .line 263
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v0, 0x412547ae    # 10.33f

    .line 267
    .line 268
    .line 269
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const v17, 0x4084cccd    # 4.15f

    .line 273
    .line 274
    .line 275
    const v18, -0x3f98f5c3    # -3.61f

    .line 276
    .line 277
    .line 278
    const v13, 0x4005c28f    # 2.09f

    .line 279
    .line 280
    .line 281
    const/4 v14, 0x0

    .line 282
    const v15, 0x407ccccd    # 3.95f

    .line 283
    .line 284
    .line 285
    const v16, -0x403c28f6    # -1.53f

    .line 286
    .line 287
    .line 288
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const v17, -0x3f8147ae    # -3.98f

    .line 292
    .line 293
    .line 294
    const v18, -0x3f73851f    # -4.39f

    .line 295
    .line 296
    .line 297
    const v13, 0x3e6b851f    # 0.23f

    .line 298
    .line 299
    .line 300
    const v14, -0x3fe70a3d    # -2.39f

    .line 301
    .line 302
    .line 303
    const v15, -0x402e147b    # -1.64f

    .line 304
    .line 305
    .line 306
    const v16, -0x3f73851f    # -4.39f

    .line 307
    .line 308
    .line 309
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v0, 0x40e75c29    # 7.23f

    .line 313
    .line 314
    .line 315
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    const v17, -0x3f4947ae    # -5.71f

    .line 319
    .line 320
    .line 321
    const v18, 0x409eb852    # 4.96f

    .line 322
    .line 323
    .line 324
    const v13, -0x3fc851ec    # -2.87f

    .line 325
    .line 326
    .line 327
    const/4 v14, 0x0

    .line 328
    const v15, -0x3f51eb85    # -5.44f

    .line 329
    .line 330
    .line 331
    const v16, 0x40066666    # 2.1f

    .line 332
    .line 333
    .line 334
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 335
    .line 336
    .line 337
    const v17, 0x40af5c29    # 5.48f

    .line 338
    .line 339
    .line 340
    const v18, 0x40c147ae    # 6.04f

    .line 341
    .line 342
    .line 343
    const v13, -0x41666666    # -0.3f

    .line 344
    .line 345
    .line 346
    const v14, 0x40528f5c    # 3.29f

    .line 347
    .line 348
    .line 349
    const v15, 0x4010a3d7    # 2.26f

    .line 350
    .line 351
    .line 352
    const v16, 0x40c147ae    # 6.04f

    .line 353
    .line 354
    .line 355
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v0, 0x412c0000    # 10.75f

    .line 359
    .line 360
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 361
    .line 362
    .line 363
    const/high16 v17, 0x3f400000    # 0.75f

    .line 364
    .line 365
    const/high16 v18, -0x40c00000    # -0.75f

    .line 366
    .line 367
    const v13, 0x3ed1eb85    # 0.41f

    .line 368
    .line 369
    .line 370
    const/4 v14, 0x0

    .line 371
    const/high16 v15, 0x3f400000    # 0.75f

    .line 372
    .line 373
    const v16, -0x4151eb85    # -0.34f

    .line 374
    .line 375
    .line 376
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 377
    .line 378
    .line 379
    const v0, -0x4151eb85    # -0.34f

    .line 380
    .line 381
    .line 382
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 389
    .line 390
    .line 391
    move-result-object v2

    .line 392
    const/16 v16, 0x3800

    .line 393
    .line 394
    const/16 v17, 0x0

    .line 395
    .line 396
    const/high16 v6, 0x3f800000    # 1.0f

    .line 397
    .line 398
    const/high16 v8, 0x3f800000    # 1.0f

    .line 399
    .line 400
    const/4 v7, 0x0

    .line 401
    const/high16 v9, 0x3f800000    # 1.0f

    .line 402
    .line 403
    const/high16 v12, 0x3f800000    # 1.0f

    .line 404
    .line 405
    const/4 v13, 0x0

    .line 406
    const/4 v15, 0x0

    .line 407
    const-string v4, ""

    .line 408
    .line 409
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    sput-object v0, Landroidx/compose/material/icons/rounded/AttachmentKt;->_attachment:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 418
    .line 419
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 420
    .line 421
    .line 422
    return-object v0
.end method
