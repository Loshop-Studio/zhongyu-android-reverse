.class public final Landroidx/compose/material/icons/twotone/ImportContactsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_importContacts",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "ImportContacts",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getImportContacts",
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
        "SMAP\nImportContacts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImportContacts.kt\nandroidx/compose/material/icons/twotone/ImportContactsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,80:1\n212#2,12:81\n233#2,18:94\n253#2:131\n233#2,18:132\n253#2:169\n174#3:93\n705#4,2:112\n717#4,2:114\n719#4,11:120\n705#4,2:150\n717#4,2:152\n719#4,11:158\n72#5,4:116\n72#5,4:154\n*S KotlinDebug\n*F\n+ 1 ImportContacts.kt\nandroidx/compose/material/icons/twotone/ImportContactsKt\n*L\n29#1:81,12\n30#1:94,18\n30#1:131\n65#1:132,18\n65#1:169\n29#1:93\n30#1:112,2\n30#1:114,2\n30#1:120,11\n65#1:150,2\n65#1:152,2\n65#1:158,11\n30#1:116,4\n65#1:154,4\n*E\n"
    }
.end annotation


# static fields
.field private static _importContacts:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getImportContacts(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/ImportContactsKt;->_importContacts:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.ImportContacts"

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
    const/high16 v4, 0x40a00000    # 5.0f

    .line 71
    .line 72
    const/high16 v6, 0x41a80000    # 21.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x3fa00000    # -3.5f

    .line 78
    .line 79
    const/high16 v26, -0x41000000    # -0.5f

    .line 80
    .line 81
    const v21, -0x4071eb85    # -1.11f

    .line 82
    .line 83
    .line 84
    const v22, -0x414ccccd    # -0.35f

    .line 85
    .line 86
    .line 87
    const v23, -0x3feae148    # -2.33f

    .line 88
    .line 89
    .line 90
    const/high16 v24, -0x41000000    # -0.5f

    .line 91
    .line 92
    move-object/from16 v20, v2

    .line 93
    .line 94
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    const/high16 v25, -0x3f500000    # -5.5f

    .line 98
    .line 99
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 100
    .line 101
    const v21, -0x40066666    # -1.95f

    .line 102
    .line 103
    .line 104
    const/16 v22, 0x0

    .line 105
    .line 106
    const v23, -0x3f7e6666    # -4.05f

    .line 107
    .line 108
    .line 109
    const v24, 0x3ecccccd    # 0.4f

    .line 110
    .line 111
    .line 112
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 113
    .line 114
    .line 115
    const/high16 v26, -0x40400000    # -1.5f

    .line 116
    .line 117
    const v21, -0x40466666    # -1.45f

    .line 118
    .line 119
    .line 120
    const v22, -0x40733333    # -1.1f

    .line 121
    .line 122
    .line 123
    const v23, -0x3f9ccccd    # -3.55f

    .line 124
    .line 125
    .line 126
    const/high16 v24, -0x40400000    # -1.5f

    .line 127
    .line 128
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 129
    .line 130
    .line 131
    const v4, 0x409ccccd    # 4.9f

    .line 132
    .line 133
    .line 134
    const/high16 v6, 0x3f800000    # 1.0f

    .line 135
    .line 136
    const/high16 v7, 0x40c00000    # 6.0f

    .line 137
    .line 138
    const v8, 0x401ccccd    # 2.45f

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2, v8, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 142
    .line 143
    .line 144
    const v4, 0x416a6666    # 14.65f

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v25, 0x3f000000    # 0.5f

    .line 151
    .line 152
    const/high16 v26, 0x3f000000    # 0.5f

    .line 153
    .line 154
    const/16 v21, 0x0

    .line 155
    .line 156
    const/high16 v22, 0x3e800000    # 0.25f

    .line 157
    .line 158
    const/high16 v23, 0x3e800000    # 0.25f

    .line 159
    .line 160
    const/high16 v24, 0x3f000000    # 0.5f

    .line 161
    .line 162
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v25, 0x3e800000    # 0.25f

    .line 166
    .line 167
    const v26, -0x42b33333    # -0.05f

    .line 168
    .line 169
    .line 170
    const v21, 0x3dcccccd    # 0.1f

    .line 171
    .line 172
    .line 173
    const/16 v22, 0x0

    .line 174
    .line 175
    const v23, 0x3e19999a    # 0.15f

    .line 176
    .line 177
    .line 178
    const v24, -0x42b33333    # -0.05f

    .line 179
    .line 180
    .line 181
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 182
    .line 183
    .line 184
    const/high16 v25, 0x40d00000    # 6.5f

    .line 185
    .line 186
    const/high16 v26, 0x41a00000    # 20.0f

    .line 187
    .line 188
    const v21, 0x40466666    # 3.1f

    .line 189
    .line 190
    .line 191
    const v22, 0x41a3999a    # 20.45f

    .line 192
    .line 193
    .line 194
    const v23, 0x40a1999a    # 5.05f

    .line 195
    .line 196
    .line 197
    const/high16 v24, 0x41a00000    # 20.0f

    .line 198
    .line 199
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    const/high16 v25, 0x40b00000    # 5.5f

    .line 203
    .line 204
    const/high16 v26, 0x3fc00000    # 1.5f

    .line 205
    .line 206
    const v21, 0x3ff9999a    # 1.95f

    .line 207
    .line 208
    .line 209
    const/16 v22, 0x0

    .line 210
    .line 211
    const v23, 0x4081999a    # 4.05f

    .line 212
    .line 213
    .line 214
    const v24, 0x3ecccccd    # 0.4f

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 218
    .line 219
    .line 220
    const/high16 v26, -0x40400000    # -1.5f

    .line 221
    .line 222
    const v21, 0x3faccccd    # 1.35f

    .line 223
    .line 224
    .line 225
    const v22, -0x40a66666    # -0.85f

    .line 226
    .line 227
    .line 228
    const v23, 0x40733333    # 3.8f

    .line 229
    .line 230
    .line 231
    const/high16 v24, -0x40400000    # -1.5f

    .line 232
    .line 233
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/high16 v25, 0x40980000    # 4.75f

    .line 237
    .line 238
    const v26, 0x3f866666    # 1.05f

    .line 239
    .line 240
    .line 241
    const v21, 0x3fd33333    # 1.65f

    .line 242
    .line 243
    .line 244
    const/16 v22, 0x0

    .line 245
    .line 246
    const v23, 0x40566666    # 3.35f

    .line 247
    .line 248
    .line 249
    const v24, 0x3e99999a    # 0.3f

    .line 250
    .line 251
    .line 252
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v25, 0x3e800000    # 0.25f

    .line 256
    .line 257
    const v26, 0x3d4ccccd    # 0.05f

    .line 258
    .line 259
    .line 260
    const v21, 0x3dcccccd    # 0.1f

    .line 261
    .line 262
    .line 263
    const v22, 0x3d4ccccd    # 0.05f

    .line 264
    .line 265
    .line 266
    const v23, 0x3e19999a    # 0.15f

    .line 267
    .line 268
    .line 269
    const v24, 0x3d4ccccd    # 0.05f

    .line 270
    .line 271
    .line 272
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 273
    .line 274
    .line 275
    const/high16 v25, 0x3f000000    # 0.5f

    .line 276
    .line 277
    const/high16 v26, -0x41000000    # -0.5f

    .line 278
    .line 279
    const/high16 v21, 0x3e800000    # 0.25f

    .line 280
    .line 281
    const/16 v22, 0x0

    .line 282
    .line 283
    const/high16 v23, 0x3f000000    # 0.5f

    .line 284
    .line 285
    const/high16 v24, -0x41800000    # -0.25f

    .line 286
    .line 287
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const/high16 v4, 0x41b80000    # 23.0f

    .line 291
    .line 292
    const/high16 v6, 0x40c00000    # 6.0f

    .line 293
    .line 294
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const/high16 v25, -0x40000000    # -2.0f

    .line 298
    .line 299
    const/high16 v26, -0x40800000    # -1.0f

    .line 300
    .line 301
    const v21, -0x40e66666    # -0.6f

    .line 302
    .line 303
    .line 304
    const v22, -0x4119999a    # -0.45f

    .line 305
    .line 306
    .line 307
    const/high16 v23, -0x40600000    # -1.25f

    .line 308
    .line 309
    const/high16 v24, -0x40c00000    # -0.75f

    .line 310
    .line 311
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 315
    .line 316
    .line 317
    const/high16 v4, 0x41940000    # 18.5f

    .line 318
    .line 319
    const/high16 v6, 0x40400000    # 3.0f

    .line 320
    .line 321
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const/high16 v4, 0x40e00000    # 7.0f

    .line 325
    .line 326
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const/high16 v25, 0x40600000    # 3.5f

    .line 330
    .line 331
    const/high16 v26, -0x41000000    # -0.5f

    .line 332
    .line 333
    const v21, 0x3f8ccccd    # 1.1f

    .line 334
    .line 335
    .line 336
    const v22, -0x414ccccd    # -0.35f

    .line 337
    .line 338
    .line 339
    const v23, 0x40133333    # 2.3f

    .line 340
    .line 341
    .line 342
    const/high16 v24, -0x41000000    # -0.5f

    .line 343
    .line 344
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 345
    .line 346
    .line 347
    const/high16 v25, 0x40900000    # 4.5f

    .line 348
    .line 349
    const v26, 0x3f7d70a4    # 0.99f

    .line 350
    .line 351
    .line 352
    const v21, 0x3fab851f    # 1.34f

    .line 353
    .line 354
    .line 355
    const/16 v22, 0x0

    .line 356
    .line 357
    const v23, 0x404851ec    # 3.13f

    .line 358
    .line 359
    .line 360
    const v24, 0x3ed1eb85    # 0.41f

    .line 361
    .line 362
    .line 363
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const/high16 v4, 0x41380000    # 11.5f

    .line 367
    .line 368
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 369
    .line 370
    .line 371
    const/high16 v25, 0x40d00000    # 6.5f

    .line 372
    .line 373
    const/high16 v26, 0x41900000    # 18.0f

    .line 374
    .line 375
    const v21, 0x411a147b    # 9.63f

    .line 376
    .line 377
    .line 378
    const v22, 0x419347ae    # 18.41f

    .line 379
    .line 380
    .line 381
    const v23, 0x40fae148    # 7.84f

    .line 382
    .line 383
    .line 384
    const/high16 v24, 0x41900000    # 18.0f

    .line 385
    .line 386
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const/high16 v25, -0x3fa00000    # -3.5f

    .line 390
    .line 391
    const/high16 v26, 0x3f000000    # 0.5f

    .line 392
    .line 393
    const v21, -0x40666666    # -1.2f

    .line 394
    .line 395
    .line 396
    const/16 v22, 0x0

    .line 397
    .line 398
    const v23, -0x3fe66666    # -2.4f

    .line 399
    .line 400
    .line 401
    const v24, 0x3e19999a    # 0.15f

    .line 402
    .line 403
    .line 404
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 408
    .line 409
    .line 410
    const/high16 v4, 0x41940000    # 18.5f

    .line 411
    .line 412
    const/high16 v6, 0x41a80000    # 21.0f

    .line 413
    .line 414
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 415
    .line 416
    .line 417
    const/high16 v26, -0x41000000    # -0.5f

    .line 418
    .line 419
    const v21, -0x40733333    # -1.1f

    .line 420
    .line 421
    .line 422
    const v22, -0x414ccccd    # -0.35f

    .line 423
    .line 424
    .line 425
    const v23, -0x3feccccd    # -2.3f

    .line 426
    .line 427
    .line 428
    const/high16 v24, -0x41000000    # -0.5f

    .line 429
    .line 430
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 431
    .line 432
    .line 433
    const/high16 v25, -0x3f700000    # -4.5f

    .line 434
    .line 435
    const v26, 0x3f7d70a4    # 0.99f

    .line 436
    .line 437
    .line 438
    const v21, -0x40547ae1    # -1.34f

    .line 439
    .line 440
    .line 441
    const/16 v22, 0x0

    .line 442
    .line 443
    const v23, -0x3fb7ae14    # -3.13f

    .line 444
    .line 445
    .line 446
    const v24, 0x3ed1eb85    # 0.41f

    .line 447
    .line 448
    .line 449
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 450
    .line 451
    .line 452
    const/high16 v4, 0x41500000    # 13.0f

    .line 453
    .line 454
    const v6, 0x40efae14    # 7.49f

    .line 455
    .line 456
    .line 457
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const/high16 v25, 0x40900000    # 4.5f

    .line 461
    .line 462
    const v26, -0x40828f5c    # -0.99f

    .line 463
    .line 464
    .line 465
    const v21, 0x3faf5c29    # 1.37f

    .line 466
    .line 467
    .line 468
    const v22, -0x40e8f5c3    # -0.59f

    .line 469
    .line 470
    .line 471
    const v23, 0x404a3d71    # 3.16f

    .line 472
    .line 473
    .line 474
    const v24, -0x40828f5c    # -0.99f

    .line 475
    .line 476
    .line 477
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const/high16 v25, 0x40600000    # 3.5f

    .line 481
    .line 482
    const/high16 v26, 0x3f000000    # 0.5f

    .line 483
    .line 484
    const v21, 0x3f99999a    # 1.2f

    .line 485
    .line 486
    .line 487
    const/16 v22, 0x0

    .line 488
    .line 489
    const v23, 0x4019999a    # 2.4f

    .line 490
    .line 491
    .line 492
    const v24, 0x3e19999a    # 0.15f

    .line 493
    .line 494
    .line 495
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 496
    .line 497
    .line 498
    const/high16 v4, 0x41380000    # 11.5f

    .line 499
    .line 500
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 501
    .line 502
    .line 503
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 507
    .line 508
    .line 509
    move-result-object v2

    .line 510
    const/16 v16, 0x3800

    .line 511
    .line 512
    const/16 v17, 0x0

    .line 513
    .line 514
    const/high16 v6, 0x3f800000    # 1.0f

    .line 515
    .line 516
    const/high16 v8, 0x3f800000    # 1.0f

    .line 517
    .line 518
    const/4 v7, 0x0

    .line 519
    const/high16 v9, 0x3f800000    # 1.0f

    .line 520
    .line 521
    const/high16 v12, 0x3f800000    # 1.0f

    .line 522
    .line 523
    const/4 v13, 0x0

    .line 524
    const/4 v14, 0x0

    .line 525
    const/4 v15, 0x0

    .line 526
    const-string v4, ""

    .line 527
    .line 528
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 529
    .line 530
    .line 531
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 532
    .line 533
    .line 534
    move-result v3

    .line 535
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 536
    .line 537
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 538
    .line 539
    .line 540
    move-result-wide v6

    .line 541
    const/4 v0, 0x0

    .line 542
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 543
    .line 544
    .line 545
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 546
    .line 547
    .line 548
    move-result v10

    .line 549
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 550
    .line 551
    .line 552
    move-result v11

    .line 553
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 556
    .line 557
    .line 558
    const/high16 v0, 0x41300000    # 11.0f

    .line 559
    .line 560
    const v2, 0x40efae14    # 7.49f

    .line 561
    .line 562
    .line 563
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const/high16 v17, -0x3f700000    # -4.5f

    .line 567
    .line 568
    const v18, -0x40828f5c    # -0.99f

    .line 569
    .line 570
    .line 571
    const v13, -0x4050a3d7    # -1.37f

    .line 572
    .line 573
    .line 574
    const v14, -0x40eb851f    # -0.58f

    .line 575
    .line 576
    .line 577
    const v15, -0x3fb5c28f    # -3.16f

    .line 578
    .line 579
    .line 580
    const v16, -0x40828f5c    # -0.99f

    .line 581
    .line 582
    .line 583
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 584
    .line 585
    .line 586
    const/high16 v17, -0x3fa00000    # -3.5f

    .line 587
    .line 588
    const/high16 v18, 0x3f000000    # 0.5f

    .line 589
    .line 590
    const v13, -0x40666666    # -1.2f

    .line 591
    .line 592
    .line 593
    const/4 v14, 0x0

    .line 594
    const v15, -0x3fe66666    # -2.4f

    .line 595
    .line 596
    .line 597
    const v16, 0x3e19999a    # 0.15f

    .line 598
    .line 599
    .line 600
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 601
    .line 602
    .line 603
    const/high16 v0, 0x41380000    # 11.5f

    .line 604
    .line 605
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 606
    .line 607
    .line 608
    const/high16 v17, 0x40600000    # 3.5f

    .line 609
    .line 610
    const/high16 v18, -0x41000000    # -0.5f

    .line 611
    .line 612
    const v13, 0x3f8ccccd    # 1.1f

    .line 613
    .line 614
    .line 615
    const v14, -0x414ccccd    # -0.35f

    .line 616
    .line 617
    .line 618
    const v15, 0x40133333    # 2.3f

    .line 619
    .line 620
    .line 621
    const/high16 v16, -0x41000000    # -0.5f

    .line 622
    .line 623
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 624
    .line 625
    .line 626
    const/high16 v17, 0x40900000    # 4.5f

    .line 627
    .line 628
    const v18, 0x3f7d70a4    # 0.99f

    .line 629
    .line 630
    .line 631
    const v13, 0x3fab851f    # 1.34f

    .line 632
    .line 633
    .line 634
    const/4 v14, 0x0

    .line 635
    const v15, 0x404851ec    # 3.13f

    .line 636
    .line 637
    .line 638
    const v16, 0x3ed1eb85    # 0.41f

    .line 639
    .line 640
    .line 641
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 642
    .line 643
    .line 644
    const v0, 0x40efae14    # 7.49f

    .line 645
    .line 646
    .line 647
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 648
    .line 649
    .line 650
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 651
    .line 652
    .line 653
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 654
    .line 655
    .line 656
    move-result-object v2

    .line 657
    const/16 v16, 0x3800

    .line 658
    .line 659
    const/16 v17, 0x0

    .line 660
    .line 661
    const v6, 0x3e99999a    # 0.3f

    .line 662
    .line 663
    .line 664
    const v8, 0x3e99999a    # 0.3f

    .line 665
    .line 666
    .line 667
    const/4 v7, 0x0

    .line 668
    const/high16 v12, 0x3f800000    # 1.0f

    .line 669
    .line 670
    const/4 v13, 0x0

    .line 671
    const/4 v15, 0x0

    .line 672
    const-string v4, ""

    .line 673
    .line 674
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 675
    .line 676
    .line 677
    move-result-object v0

    .line 678
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 679
    .line 680
    .line 681
    move-result-object v0

    .line 682
    sput-object v0, Landroidx/compose/material/icons/twotone/ImportContactsKt;->_importContacts:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 683
    .line 684
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 685
    .line 686
    .line 687
    return-object v0
.end method
