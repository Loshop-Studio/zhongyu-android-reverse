.class public final Landroidx/compose/material/icons/outlined/ImportContactsKt;
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
        "Landroidx/compose/material/icons/Icons$Outlined;",
        "getImportContacts",
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
        "SMAP\nImportContacts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImportContacts.kt\nandroidx/compose/material/icons/outlined/ImportContactsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,62:1\n212#2,12:63\n233#2,18:76\n253#2:113\n174#3:75\n705#4,2:94\n717#4,2:96\n719#4,11:102\n72#5,4:98\n*S KotlinDebug\n*F\n+ 1 ImportContacts.kt\nandroidx/compose/material/icons/outlined/ImportContactsKt\n*L\n29#1:63,12\n30#1:76,18\n30#1:113\n29#1:75\n30#1:94,2\n30#1:96,2\n30#1:102,11\n30#1:98,4\n*E\n"
    }
.end annotation


# static fields
.field private static _importContacts:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getImportContacts(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/outlined/ImportContactsKt;->_importContacts:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Outlined.ImportContacts"

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
    const/high16 v0, 0x40a00000    # 5.0f

    .line 71
    .line 72
    const/high16 v2, 0x41a80000    # 21.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x3fa00000    # -3.5f

    .line 78
    .line 79
    const/high16 v18, -0x41000000    # -0.5f

    .line 80
    .line 81
    const v13, -0x4071eb85    # -1.11f

    .line 82
    .line 83
    .line 84
    const v14, -0x414ccccd    # -0.35f

    .line 85
    .line 86
    .line 87
    const v15, -0x3feae148    # -2.33f

    .line 88
    .line 89
    .line 90
    const/high16 v16, -0x41000000    # -0.5f

    .line 91
    .line 92
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    const/high16 v17, -0x3f500000    # -5.5f

    .line 96
    .line 97
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 98
    .line 99
    const v13, -0x40066666    # -1.95f

    .line 100
    .line 101
    .line 102
    const/4 v14, 0x0

    .line 103
    const v15, -0x3f7e6666    # -4.05f

    .line 104
    .line 105
    .line 106
    const v16, 0x3ecccccd    # 0.4f

    .line 107
    .line 108
    .line 109
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const/high16 v18, -0x40400000    # -1.5f

    .line 113
    .line 114
    const v13, -0x40466666    # -1.45f

    .line 115
    .line 116
    .line 117
    const v14, -0x40733333    # -1.1f

    .line 118
    .line 119
    .line 120
    const v15, -0x3f9ccccd    # -3.55f

    .line 121
    .line 122
    .line 123
    const/high16 v16, -0x40400000    # -1.5f

    .line 124
    .line 125
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const v0, 0x409ccccd    # 4.9f

    .line 129
    .line 130
    .line 131
    const/high16 v2, 0x3f800000    # 1.0f

    .line 132
    .line 133
    const/high16 v4, 0x40c00000    # 6.0f

    .line 134
    .line 135
    const v6, 0x401ccccd    # 2.45f

    .line 136
    .line 137
    .line 138
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v0, 0x416a6666    # 14.65f

    .line 142
    .line 143
    .line 144
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v17, 0x3f000000    # 0.5f

    .line 148
    .line 149
    const/high16 v18, 0x3f000000    # 0.5f

    .line 150
    .line 151
    const/4 v13, 0x0

    .line 152
    const/high16 v14, 0x3e800000    # 0.25f

    .line 153
    .line 154
    const/high16 v15, 0x3e800000    # 0.25f

    .line 155
    .line 156
    const/high16 v16, 0x3f000000    # 0.5f

    .line 157
    .line 158
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 159
    .line 160
    .line 161
    const/high16 v17, 0x3e800000    # 0.25f

    .line 162
    .line 163
    const v18, -0x42b33333    # -0.05f

    .line 164
    .line 165
    .line 166
    const v13, 0x3dcccccd    # 0.1f

    .line 167
    .line 168
    .line 169
    const/4 v14, 0x0

    .line 170
    const v15, 0x3e19999a    # 0.15f

    .line 171
    .line 172
    .line 173
    const v16, -0x42b33333    # -0.05f

    .line 174
    .line 175
    .line 176
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 177
    .line 178
    .line 179
    const/high16 v17, 0x40d00000    # 6.5f

    .line 180
    .line 181
    const/high16 v18, 0x41a00000    # 20.0f

    .line 182
    .line 183
    const v13, 0x40466666    # 3.1f

    .line 184
    .line 185
    .line 186
    const v14, 0x41a3999a    # 20.45f

    .line 187
    .line 188
    .line 189
    const v15, 0x40a1999a    # 5.05f

    .line 190
    .line 191
    .line 192
    const/high16 v16, 0x41a00000    # 20.0f

    .line 193
    .line 194
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v17, 0x40b00000    # 5.5f

    .line 198
    .line 199
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 200
    .line 201
    const v13, 0x3ff9999a    # 1.95f

    .line 202
    .line 203
    .line 204
    const/4 v14, 0x0

    .line 205
    const v15, 0x4081999a    # 4.05f

    .line 206
    .line 207
    .line 208
    const v16, 0x3ecccccd    # 0.4f

    .line 209
    .line 210
    .line 211
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 212
    .line 213
    .line 214
    const/high16 v18, -0x40400000    # -1.5f

    .line 215
    .line 216
    const v13, 0x3faccccd    # 1.35f

    .line 217
    .line 218
    .line 219
    const v14, -0x40a66666    # -0.85f

    .line 220
    .line 221
    .line 222
    const v15, 0x40733333    # 3.8f

    .line 223
    .line 224
    .line 225
    const/high16 v16, -0x40400000    # -1.5f

    .line 226
    .line 227
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v17, 0x40980000    # 4.75f

    .line 231
    .line 232
    const v18, 0x3f866666    # 1.05f

    .line 233
    .line 234
    .line 235
    const v13, 0x3fd33333    # 1.65f

    .line 236
    .line 237
    .line 238
    const/4 v14, 0x0

    .line 239
    const v15, 0x40566666    # 3.35f

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
    const/high16 v17, 0x3e800000    # 0.25f

    .line 249
    .line 250
    const v18, 0x3d4ccccd    # 0.05f

    .line 251
    .line 252
    .line 253
    const v13, 0x3dcccccd    # 0.1f

    .line 254
    .line 255
    .line 256
    const v14, 0x3d4ccccd    # 0.05f

    .line 257
    .line 258
    .line 259
    const v15, 0x3e19999a    # 0.15f

    .line 260
    .line 261
    .line 262
    const v16, 0x3d4ccccd    # 0.05f

    .line 263
    .line 264
    .line 265
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v17, 0x3f000000    # 0.5f

    .line 269
    .line 270
    const/high16 v18, -0x41000000    # -0.5f

    .line 271
    .line 272
    const/high16 v13, 0x3e800000    # 0.25f

    .line 273
    .line 274
    const/4 v14, 0x0

    .line 275
    const/high16 v15, 0x3f000000    # 0.5f

    .line 276
    .line 277
    const/high16 v16, -0x41800000    # -0.25f

    .line 278
    .line 279
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/high16 v0, 0x41b80000    # 23.0f

    .line 283
    .line 284
    const/high16 v2, 0x40c00000    # 6.0f

    .line 285
    .line 286
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/high16 v17, -0x40000000    # -2.0f

    .line 290
    .line 291
    const/high16 v18, -0x40800000    # -1.0f

    .line 292
    .line 293
    const v13, -0x40e66666    # -0.6f

    .line 294
    .line 295
    .line 296
    const v14, -0x4119999a    # -0.45f

    .line 297
    .line 298
    .line 299
    const/high16 v15, -0x40600000    # -1.25f

    .line 300
    .line 301
    const/high16 v16, -0x40c00000    # -0.75f

    .line 302
    .line 303
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    const/high16 v0, 0x41940000    # 18.5f

    .line 310
    .line 311
    const/high16 v2, 0x41a80000    # 21.0f

    .line 312
    .line 313
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const/high16 v17, -0x3fa00000    # -3.5f

    .line 317
    .line 318
    const/high16 v18, -0x41000000    # -0.5f

    .line 319
    .line 320
    const v13, -0x40733333    # -1.1f

    .line 321
    .line 322
    .line 323
    const v14, -0x414ccccd    # -0.35f

    .line 324
    .line 325
    .line 326
    const v15, -0x3feccccd    # -2.3f

    .line 327
    .line 328
    .line 329
    const/high16 v16, -0x41000000    # -0.5f

    .line 330
    .line 331
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 332
    .line 333
    .line 334
    const/high16 v17, -0x3f500000    # -5.5f

    .line 335
    .line 336
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 337
    .line 338
    const v13, -0x40266666    # -1.7f

    .line 339
    .line 340
    .line 341
    const/4 v14, 0x0

    .line 342
    const v15, -0x3f7b3333    # -4.15f

    .line 343
    .line 344
    .line 345
    const v16, 0x3f266666    # 0.65f

    .line 346
    .line 347
    .line 348
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    const/high16 v0, 0x41400000    # 12.0f

    .line 352
    .line 353
    const/high16 v2, 0x41000000    # 8.0f

    .line 354
    .line 355
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 356
    .line 357
    .line 358
    const/high16 v17, 0x40b00000    # 5.5f

    .line 359
    .line 360
    const/high16 v18, -0x40400000    # -1.5f

    .line 361
    .line 362
    const v13, 0x3faccccd    # 1.35f

    .line 363
    .line 364
    .line 365
    const v14, -0x40a66666    # -0.85f

    .line 366
    .line 367
    .line 368
    const v15, 0x40733333    # 3.8f

    .line 369
    .line 370
    .line 371
    const/high16 v16, -0x40400000    # -1.5f

    .line 372
    .line 373
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 374
    .line 375
    .line 376
    const/high16 v17, 0x40600000    # 3.5f

    .line 377
    .line 378
    const/high16 v18, 0x3f000000    # 0.5f

    .line 379
    .line 380
    const v13, 0x3f99999a    # 1.2f

    .line 381
    .line 382
    .line 383
    const/4 v14, 0x0

    .line 384
    const v15, 0x4019999a    # 2.4f

    .line 385
    .line 386
    .line 387
    const v16, 0x3e19999a    # 0.15f

    .line 388
    .line 389
    .line 390
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 391
    .line 392
    .line 393
    const/high16 v0, 0x41380000    # 11.5f

    .line 394
    .line 395
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 396
    .line 397
    .line 398
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 402
    .line 403
    .line 404
    move-result-object v2

    .line 405
    const/16 v16, 0x3800

    .line 406
    .line 407
    const/16 v17, 0x0

    .line 408
    .line 409
    const/high16 v6, 0x3f800000    # 1.0f

    .line 410
    .line 411
    const/high16 v8, 0x3f800000    # 1.0f

    .line 412
    .line 413
    const/4 v7, 0x0

    .line 414
    const/high16 v9, 0x3f800000    # 1.0f

    .line 415
    .line 416
    const/high16 v12, 0x3f800000    # 1.0f

    .line 417
    .line 418
    const/4 v13, 0x0

    .line 419
    const/4 v15, 0x0

    .line 420
    const-string v4, ""

    .line 421
    .line 422
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    sput-object v0, Landroidx/compose/material/icons/outlined/ImportContactsKt;->_importContacts:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 431
    .line 432
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 433
    .line 434
    .line 435
    return-object v0
.end method
