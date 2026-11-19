.class public final Landroidx/compose/material/icons/rounded/AddReactionKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_addReaction",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "AddReaction",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getAddReaction",
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
        "SMAP\nAddReaction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddReaction.kt\nandroidx/compose/material/icons/rounded/AddReactionKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,85:1\n212#2,12:86\n233#2,18:99\n253#2:136\n174#3:98\n705#4,2:117\n717#4,2:119\n719#4,11:125\n72#5,4:121\n*S KotlinDebug\n*F\n+ 1 AddReaction.kt\nandroidx/compose/material/icons/rounded/AddReactionKt\n*L\n29#1:86,12\n30#1:99,18\n30#1:136\n29#1:98\n30#1:117,2\n30#1:119,2\n30#1:125,11\n30#1:121,4\n*E\n"
    }
.end annotation


# static fields
.field private static _addReaction:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAddReaction(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/AddReactionKt;->_addReaction:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.AddReaction"

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
    const/high16 v2, 0x41c00000    # 24.0f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x40800000    # -1.0f

    .line 78
    .line 79
    const/high16 v18, 0x3f800000    # 1.0f

    .line 80
    .line 81
    const/4 v13, 0x0

    .line 82
    const v14, 0x3f0ccccd    # 0.55f

    .line 83
    .line 84
    .line 85
    const v15, -0x4119999a    # -0.45f

    .line 86
    .line 87
    .line 88
    const/high16 v16, 0x3f800000    # 1.0f

    .line 89
    .line 90
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 91
    .line 92
    .line 93
    const/high16 v0, -0x40800000    # -1.0f

    .line 94
    .line 95
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v0, 0x3f800000    # 1.0f

    .line 99
    .line 100
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 104
    .line 105
    .line 106
    const v0, -0x4119999a    # -0.45f

    .line 107
    .line 108
    .line 109
    const/high16 v2, -0x40800000    # -1.0f

    .line 110
    .line 111
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const/high16 v0, 0x40a00000    # 5.0f

    .line 115
    .line 116
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 117
    .line 118
    .line 119
    const/high16 v0, -0x40800000    # -1.0f

    .line 120
    .line 121
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const/high16 v18, -0x40800000    # -1.0f

    .line 125
    .line 126
    const v13, -0x40f33333    # -0.55f

    .line 127
    .line 128
    .line 129
    const/4 v14, 0x0

    .line 130
    const/high16 v15, -0x40800000    # -1.0f

    .line 131
    .line 132
    const v16, -0x4119999a    # -0.45f

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    const/high16 v17, 0x3f800000    # 1.0f

    .line 139
    .line 140
    const/4 v13, 0x0

    .line 141
    const v14, -0x40f33333    # -0.55f

    .line 142
    .line 143
    .line 144
    const v15, 0x3ee66666    # 0.45f

    .line 145
    .line 146
    .line 147
    const/high16 v16, -0x40800000    # -1.0f

    .line 148
    .line 149
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v0, 0x3f800000    # 1.0f

    .line 153
    .line 154
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const/high16 v0, 0x40000000    # 2.0f

    .line 158
    .line 159
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const v0, 0x3ee66666    # 0.45f

    .line 166
    .line 167
    .line 168
    const/high16 v2, 0x3f800000    # 1.0f

    .line 169
    .line 170
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v0, 0x3f800000    # 1.0f

    .line 174
    .line 175
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 179
    .line 180
    .line 181
    const/high16 v17, 0x41c00000    # 24.0f

    .line 182
    .line 183
    const/high16 v18, 0x40800000    # 4.0f

    .line 184
    .line 185
    const v13, 0x41bc6666    # 23.55f

    .line 186
    .line 187
    .line 188
    const/high16 v14, 0x40400000    # 3.0f

    .line 189
    .line 190
    const/high16 v15, 0x41c00000    # 24.0f

    .line 191
    .line 192
    const v16, 0x405ccccd    # 3.45f

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 199
    .line 200
    .line 201
    const v0, 0x41ac28f6    # 21.52f

    .line 202
    .line 203
    .line 204
    const v2, 0x410f3333    # 8.95f

    .line 205
    .line 206
    .line 207
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v17, 0x41b00000    # 22.0f

    .line 211
    .line 212
    const/high16 v18, 0x41400000    # 12.0f

    .line 213
    .line 214
    const v13, 0x41aea3d7    # 21.83f

    .line 215
    .line 216
    .line 217
    const v14, 0x411e8f5c    # 9.91f

    .line 218
    .line 219
    .line 220
    const/high16 v15, 0x41b00000    # 22.0f

    .line 221
    .line 222
    const v16, 0x412f0a3d    # 10.94f

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v17, -0x3ee00000    # -10.0f

    .line 229
    .line 230
    const/high16 v18, 0x41200000    # 10.0f

    .line 231
    .line 232
    const/4 v13, 0x0

    .line 233
    const v14, 0x40b0a3d7    # 5.52f

    .line 234
    .line 235
    .line 236
    const v15, -0x3f70a3d7    # -4.48f

    .line 237
    .line 238
    .line 239
    const/high16 v16, 0x41200000    # 10.0f

    .line 240
    .line 241
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const v0, 0x418c28f6    # 17.52f

    .line 245
    .line 246
    .line 247
    const/high16 v2, 0x41400000    # 12.0f

    .line 248
    .line 249
    const/high16 v4, 0x40000000    # 2.0f

    .line 250
    .line 251
    invoke-virtual {v12, v4, v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 252
    .line 253
    .line 254
    const/high16 v17, 0x41400000    # 12.0f

    .line 255
    .line 256
    const/high16 v18, 0x40000000    # 2.0f

    .line 257
    .line 258
    const/high16 v13, 0x40000000    # 2.0f

    .line 259
    .line 260
    const v14, 0x40cf5c29    # 6.48f

    .line 261
    .line 262
    .line 263
    const v15, 0x40cf5c29    # 6.48f

    .line 264
    .line 265
    .line 266
    const/high16 v16, 0x40000000    # 2.0f

    .line 267
    .line 268
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 269
    .line 270
    .line 271
    const v17, 0x40866666    # 4.2f

    .line 272
    .line 273
    .line 274
    const v18, 0x3f70a3d7    # 0.94f

    .line 275
    .line 276
    .line 277
    const/high16 v13, 0x3fc00000    # 1.5f

    .line 278
    .line 279
    const/4 v14, 0x0

    .line 280
    const v15, 0x403ae148    # 2.92f

    .line 281
    .line 282
    .line 283
    const v16, 0x3eae147b    # 0.34f

    .line 284
    .line 285
    .line 286
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/high16 v17, 0x41800000    # 16.0f

    .line 290
    .line 291
    const/high16 v18, 0x40800000    # 4.0f

    .line 292
    .line 293
    const v13, 0x4180a3d7    # 16.08f

    .line 294
    .line 295
    .line 296
    const v14, 0x405147ae    # 3.27f

    .line 297
    .line 298
    .line 299
    const/high16 v15, 0x41800000    # 16.0f

    .line 300
    .line 301
    const v16, 0x4067ae14    # 3.62f

    .line 302
    .line 303
    .line 304
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 305
    .line 306
    .line 307
    const v17, 0x400851ec    # 2.13f

    .line 308
    .line 309
    .line 310
    const v18, 0x4037ae14    # 2.87f

    .line 311
    .line 312
    .line 313
    const/4 v13, 0x0

    .line 314
    const v14, 0x3faccccd    # 1.35f

    .line 315
    .line 316
    .line 317
    const v15, 0x3f666666    # 0.9f

    .line 318
    .line 319
    .line 320
    const/high16 v16, 0x40200000    # 2.5f

    .line 321
    .line 322
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 323
    .line 324
    .line 325
    const/high16 v17, 0x41a80000    # 21.0f

    .line 326
    .line 327
    const/high16 v18, 0x41100000    # 9.0f

    .line 328
    .line 329
    const/high16 v13, 0x41940000    # 18.5f

    .line 330
    .line 331
    const v14, 0x4101999a    # 8.1f

    .line 332
    .line 333
    .line 334
    const v15, 0x419d3333    # 19.65f

    .line 335
    .line 336
    .line 337
    const/high16 v16, 0x41100000    # 9.0f

    .line 338
    .line 339
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 340
    .line 341
    .line 342
    const v17, 0x41ac28f6    # 21.52f

    .line 343
    .line 344
    .line 345
    const v18, 0x410f3333    # 8.95f

    .line 346
    .line 347
    .line 348
    const v13, 0x41a970a4    # 21.18f

    .line 349
    .line 350
    .line 351
    const/high16 v14, 0x41100000    # 9.0f

    .line 352
    .line 353
    const v15, 0x41aacccd    # 21.35f

    .line 354
    .line 355
    .line 356
    const v16, 0x410fae14    # 8.98f

    .line 357
    .line 358
    .line 359
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 363
    .line 364
    .line 365
    const/high16 v0, 0x40e00000    # 7.0f

    .line 366
    .line 367
    const/high16 v2, 0x41180000    # 9.5f

    .line 368
    .line 369
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 370
    .line 371
    .line 372
    const/high16 v17, 0x41080000    # 8.5f

    .line 373
    .line 374
    const/high16 v18, 0x41300000    # 11.0f

    .line 375
    .line 376
    const/high16 v13, 0x40e00000    # 7.0f

    .line 377
    .line 378
    const v14, 0x412547ae    # 10.33f

    .line 379
    .line 380
    .line 381
    const v15, 0x40f570a4    # 7.67f

    .line 382
    .line 383
    .line 384
    const/high16 v16, 0x41300000    # 11.0f

    .line 385
    .line 386
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 387
    .line 388
    .line 389
    const v0, 0x412547ae    # 10.33f

    .line 390
    .line 391
    .line 392
    const/high16 v2, 0x41200000    # 10.0f

    .line 393
    .line 394
    const/high16 v4, 0x41180000    # 9.5f

    .line 395
    .line 396
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 397
    .line 398
    .line 399
    const v0, 0x411547ae    # 9.33f

    .line 400
    .line 401
    .line 402
    const/high16 v2, 0x41080000    # 8.5f

    .line 403
    .line 404
    const/high16 v4, 0x41000000    # 8.0f

    .line 405
    .line 406
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v0, 0x410ab852    # 8.67f

    .line 410
    .line 411
    .line 412
    const/high16 v2, 0x40e00000    # 7.0f

    .line 413
    .line 414
    const/high16 v4, 0x41180000    # 9.5f

    .line 415
    .line 416
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 417
    .line 418
    .line 419
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 420
    .line 421
    .line 422
    const v0, 0x41827ae1    # 16.31f

    .line 423
    .line 424
    .line 425
    const/high16 v2, 0x41600000    # 14.0f

    .line 426
    .line 427
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 428
    .line 429
    .line 430
    const v0, 0x40f6147b    # 7.69f

    .line 431
    .line 432
    .line 433
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v17, -0x411eb852    # -0.44f

    .line 437
    .line 438
    .line 439
    const/high16 v18, 0x3f400000    # 0.75f

    .line 440
    .line 441
    const v13, -0x413d70a4    # -0.38f

    .line 442
    .line 443
    .line 444
    const/4 v14, 0x0

    .line 445
    const v15, -0x40deb852    # -0.63f

    .line 446
    .line 447
    .line 448
    const v16, 0x3ed70a3d    # 0.42f

    .line 449
    .line 450
    .line 451
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 452
    .line 453
    .line 454
    const/high16 v17, 0x41400000    # 12.0f

    .line 455
    .line 456
    const/high16 v18, 0x418c0000    # 17.5f

    .line 457
    .line 458
    const v13, 0x41033333    # 8.2f

    .line 459
    .line 460
    .line 461
    const v14, 0x41831eb8    # 16.39f

    .line 462
    .line 463
    .line 464
    const v15, 0x411f851f    # 9.97f

    .line 465
    .line 466
    .line 467
    const/high16 v16, 0x418c0000    # 17.5f

    .line 468
    .line 469
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const/high16 v0, 0x40980000    # 4.75f

    .line 473
    .line 474
    const/high16 v2, -0x3fd00000    # -2.75f

    .line 475
    .line 476
    const v4, 0x40733333    # 3.8f

    .line 477
    .line 478
    .line 479
    const v6, -0x4071eb85    # -1.11f

    .line 480
    .line 481
    .line 482
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 483
    .line 484
    .line 485
    const v17, 0x41827ae1    # 16.31f

    .line 486
    .line 487
    .line 488
    const/high16 v18, 0x41600000    # 14.0f

    .line 489
    .line 490
    const v13, 0x4187851f    # 16.94f

    .line 491
    .line 492
    .line 493
    const v14, 0x4166b852    # 14.42f

    .line 494
    .line 495
    .line 496
    const v15, 0x4185999a    # 16.7f

    .line 497
    .line 498
    .line 499
    const/high16 v16, 0x41600000    # 14.0f

    .line 500
    .line 501
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const/high16 v0, 0x41880000    # 17.0f

    .line 508
    .line 509
    const/high16 v2, 0x41180000    # 9.5f

    .line 510
    .line 511
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const/high16 v17, 0x41780000    # 15.5f

    .line 515
    .line 516
    const/high16 v18, 0x41000000    # 8.0f

    .line 517
    .line 518
    const/high16 v13, 0x41880000    # 17.0f

    .line 519
    .line 520
    const v14, 0x410ab852    # 8.67f

    .line 521
    .line 522
    .line 523
    const v15, 0x4182a3d7    # 16.33f

    .line 524
    .line 525
    .line 526
    const/high16 v16, 0x41000000    # 8.0f

    .line 527
    .line 528
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 529
    .line 530
    .line 531
    const v0, 0x410ab852    # 8.67f

    .line 532
    .line 533
    .line 534
    const/high16 v2, 0x41600000    # 14.0f

    .line 535
    .line 536
    const/high16 v4, 0x41180000    # 9.5f

    .line 537
    .line 538
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 539
    .line 540
    .line 541
    const v0, 0x3f2b851f    # 0.67f

    .line 542
    .line 543
    .line 544
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 545
    .line 546
    invoke-virtual {v12, v0, v2, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 547
    .line 548
    .line 549
    const v0, 0x412547ae    # 10.33f

    .line 550
    .line 551
    .line 552
    const/high16 v2, 0x41880000    # 17.0f

    .line 553
    .line 554
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 555
    .line 556
    .line 557
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 558
    .line 559
    .line 560
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 561
    .line 562
    .line 563
    move-result-object v2

    .line 564
    const/16 v16, 0x3800

    .line 565
    .line 566
    const/16 v17, 0x0

    .line 567
    .line 568
    const/high16 v6, 0x3f800000    # 1.0f

    .line 569
    .line 570
    const/high16 v8, 0x3f800000    # 1.0f

    .line 571
    .line 572
    const/4 v7, 0x0

    .line 573
    const/high16 v9, 0x3f800000    # 1.0f

    .line 574
    .line 575
    const/high16 v12, 0x3f800000    # 1.0f

    .line 576
    .line 577
    const/4 v13, 0x0

    .line 578
    const/4 v14, 0x0

    .line 579
    const/4 v15, 0x0

    .line 580
    const-string v4, ""

    .line 581
    .line 582
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 583
    .line 584
    .line 585
    move-result-object v0

    .line 586
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 587
    .line 588
    .line 589
    move-result-object v0

    .line 590
    sput-object v0, Landroidx/compose/material/icons/rounded/AddReactionKt;->_addReaction:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 591
    .line 592
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 593
    .line 594
    .line 595
    return-object v0
.end method
