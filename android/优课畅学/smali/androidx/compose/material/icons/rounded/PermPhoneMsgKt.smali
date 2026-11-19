.class public final Landroidx/compose/material/icons/rounded/PermPhoneMsgKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _permPhoneMsg:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getPermPhoneMsg(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/PermPhoneMsgKt;->_permPhoneMsg:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

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
    const-string v2, "Rounded.PermPhoneMsg"

    .line 33
    .line 34
    invoke-direct/range {v1 .. v12}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/n;)V

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
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/n;)V

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
    const/high16 v0, 0x41a00000    # 20.0f

    .line 71
    .line 72
    const/high16 v2, 0x40400000    # 3.0f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v0, -0x3f200000    # -7.0f

    .line 78
    .line 79
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v17, -0x40800000    # -1.0f

    .line 83
    .line 84
    const/high16 v18, 0x3f800000    # 1.0f

    .line 85
    .line 86
    const v13, -0x40f33333    # -0.55f

    .line 87
    .line 88
    .line 89
    const/4 v14, 0x0

    .line 90
    const/high16 v15, -0x40800000    # -1.0f

    .line 91
    .line 92
    const v16, 0x3ee66666    # 0.45f

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v0, 0x41100000    # 9.0f

    .line 99
    .line 100
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    const/high16 v0, -0x3fc00000    # -3.0f

    .line 104
    .line 105
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const/high16 v0, 0x40a00000    # 5.0f

    .line 109
    .line 110
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 111
    .line 112
    .line 113
    const/high16 v17, 0x3f800000    # 1.0f

    .line 114
    .line 115
    const/high16 v18, -0x40800000    # -1.0f

    .line 116
    .line 117
    const v13, 0x3f0ccccd    # 0.55f

    .line 118
    .line 119
    .line 120
    const/high16 v15, 0x3f800000    # 1.0f

    .line 121
    .line 122
    const v16, -0x4119999a    # -0.45f

    .line 123
    .line 124
    .line 125
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v0, 0x41a80000    # 21.0f

    .line 129
    .line 130
    const/high16 v2, 0x40800000    # 4.0f

    .line 131
    .line 132
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 133
    .line 134
    .line 135
    const/high16 v17, -0x40800000    # -1.0f

    .line 136
    .line 137
    const/4 v13, 0x0

    .line 138
    const v14, -0x40f33333    # -0.55f

    .line 139
    .line 140
    .line 141
    const v15, -0x4119999a    # -0.45f

    .line 142
    .line 143
    .line 144
    const/high16 v16, -0x40800000    # -1.0f

    .line 145
    .line 146
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const v0, 0x4199d70a    # 19.23f

    .line 153
    .line 154
    .line 155
    const v2, 0x417428f6    # 15.26f

    .line 156
    .line 157
    .line 158
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const v0, -0x3fdd70a4    # -2.54f

    .line 162
    .line 163
    .line 164
    const v2, -0x416b851f    # -0.29f

    .line 165
    .line 166
    .line 167
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 168
    .line 169
    .line 170
    const v17, -0x402e147b    # -1.64f

    .line 171
    .line 172
    .line 173
    const v18, 0x3f11eb85    # 0.57f

    .line 174
    .line 175
    .line 176
    const v13, -0x40e3d70a    # -0.61f

    .line 177
    .line 178
    .line 179
    const v14, -0x4270a3d7    # -0.07f

    .line 180
    .line 181
    .line 182
    const v15, -0x40651eb8    # -1.21f

    .line 183
    .line 184
    .line 185
    const v16, 0x3e0f5c29    # 0.14f

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v0, -0x40147ae1    # -1.84f

    .line 192
    .line 193
    .line 194
    const v2, 0x3feb851f    # 1.84f

    .line 195
    .line 196
    .line 197
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v17, -0x3f2d1eb8    # -6.59f

    .line 201
    .line 202
    .line 203
    const v18, -0x3f2d1eb8    # -6.59f

    .line 204
    .line 205
    .line 206
    const v13, -0x3fcae148    # -2.83f

    .line 207
    .line 208
    .line 209
    const v14, -0x4047ae14    # -1.44f

    .line 210
    .line 211
    .line 212
    const v15, -0x3f5b3333    # -5.15f

    .line 213
    .line 214
    .line 215
    const/high16 v16, -0x3f900000    # -3.75f

    .line 216
    .line 217
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const v0, 0x3feccccd    # 1.85f

    .line 221
    .line 222
    .line 223
    const v2, -0x40133333    # -1.85f

    .line 224
    .line 225
    .line 226
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const v17, 0x3f11eb85    # 0.57f

    .line 230
    .line 231
    .line 232
    const v18, -0x402e147b    # -1.64f

    .line 233
    .line 234
    .line 235
    const v13, 0x3edc28f6    # 0.43f

    .line 236
    .line 237
    .line 238
    const v14, -0x4123d70a    # -0.43f

    .line 239
    .line 240
    .line 241
    const v15, 0x3f23d70a    # 0.64f

    .line 242
    .line 243
    .line 244
    const v16, -0x407c28f6    # -1.03f

    .line 245
    .line 246
    .line 247
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 248
    .line 249
    .line 250
    const v0, -0x3fdeb852    # -2.52f

    .line 251
    .line 252
    .line 253
    const v2, -0x416b851f    # -0.29f

    .line 254
    .line 255
    .line 256
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v17, -0x400147ae    # -1.99f

    .line 260
    .line 261
    .line 262
    const v18, -0x401d70a4    # -1.77f

    .line 263
    .line 264
    .line 265
    const v13, -0x420a3d71    # -0.12f

    .line 266
    .line 267
    .line 268
    const v14, -0x407eb852    # -1.01f

    .line 269
    .line 270
    .line 271
    const v15, -0x4087ae14    # -0.97f

    .line 272
    .line 273
    .line 274
    const v16, -0x401d70a4    # -1.77f

    .line 275
    .line 276
    .line 277
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    const v0, 0x40a0f5c3    # 5.03f

    .line 281
    .line 282
    .line 283
    const v2, 0x4040a3d7    # 3.01f

    .line 284
    .line 285
    .line 286
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/high16 v17, -0x40000000    # -2.0f

    .line 290
    .line 291
    const v18, 0x40047ae1    # 2.07f

    .line 292
    .line 293
    .line 294
    const v13, -0x406f5c29    # -1.13f

    .line 295
    .line 296
    .line 297
    const/4 v14, 0x0

    .line 298
    const v15, -0x3ffb851f    # -2.07f

    .line 299
    .line 300
    .line 301
    const v16, 0x3f70a3d7    # 0.94f

    .line 302
    .line 303
    .line 304
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v17, 0x417e3d71    # 15.89f

    .line 308
    .line 309
    .line 310
    const v18, 0x417e3d71    # 15.89f

    .line 311
    .line 312
    .line 313
    const v13, 0x3f07ae14    # 0.53f

    .line 314
    .line 315
    .line 316
    const v14, 0x4108a3d7    # 8.54f

    .line 317
    .line 318
    .line 319
    const v15, 0x40eb851f    # 7.36f

    .line 320
    .line 321
    .line 322
    const v16, 0x4175c28f    # 15.36f

    .line 323
    .line 324
    .line 325
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 326
    .line 327
    .line 328
    const v17, 0x40047ae1    # 2.07f

    .line 329
    .line 330
    .line 331
    const/high16 v18, -0x40000000    # -2.0f

    .line 332
    .line 333
    const v13, 0x3f90a3d7    # 1.13f

    .line 334
    .line 335
    .line 336
    const v14, 0x3d8f5c29    # 0.07f

    .line 337
    .line 338
    .line 339
    const v15, 0x40047ae1    # 2.07f

    .line 340
    .line 341
    .line 342
    const v16, -0x40a147ae    # -0.87f

    .line 343
    .line 344
    .line 345
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    const v0, -0x40228f5c    # -1.73f

    .line 349
    .line 350
    .line 351
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v17, -0x401eb852    # -1.76f

    .line 355
    .line 356
    .line 357
    const v18, -0x40028f5c    # -1.98f

    .line 358
    .line 359
    .line 360
    const v13, 0x3c23d70a    # 0.01f

    .line 361
    .line 362
    .line 363
    const v14, -0x407eb852    # -1.01f

    .line 364
    .line 365
    .line 366
    const/high16 v15, -0x40c00000    # -0.75f

    .line 367
    .line 368
    const v16, -0x4011eb85    # -1.86f

    .line 369
    .line 370
    .line 371
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 375
    .line 376
    .line 377
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 378
    .line 379
    .line 380
    move-result-object v2

    .line 381
    const/16 v16, 0x3800

    .line 382
    .line 383
    const/16 v17, 0x0

    .line 384
    .line 385
    const/high16 v6, 0x3f800000    # 1.0f

    .line 386
    .line 387
    const/high16 v8, 0x3f800000    # 1.0f

    .line 388
    .line 389
    const/4 v7, 0x0

    .line 390
    const/high16 v9, 0x3f800000    # 1.0f

    .line 391
    .line 392
    const/high16 v12, 0x3f800000    # 1.0f

    .line 393
    .line 394
    const/4 v13, 0x0

    .line 395
    const/4 v14, 0x0

    .line 396
    const/4 v15, 0x0

    .line 397
    const-string v4, ""

    .line 398
    .line 399
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    sput-object v0, Landroidx/compose/material/icons/rounded/PermPhoneMsgKt;->_permPhoneMsg:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 408
    .line 409
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 410
    .line 411
    .line 412
    return-object v0
.end method
