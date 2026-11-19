.class public final Landroidx/compose/material/icons/twotone/RunCircleKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_runCircle",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "RunCircle",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getRunCircle",
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
        "SMAP\nRunCircle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RunCircle.kt\nandroidx/compose/material/icons/twotone/RunCircleKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,115:1\n212#2,12:116\n233#2,18:129\n253#2:166\n233#2,18:167\n253#2:204\n233#2,18:205\n253#2:242\n233#2,18:243\n253#2:280\n174#3:128\n705#4,2:147\n717#4,2:149\n719#4,11:155\n705#4,2:185\n717#4,2:187\n719#4,11:193\n705#4,2:223\n717#4,2:225\n719#4,11:231\n705#4,2:261\n717#4,2:263\n719#4,11:269\n72#5,4:151\n72#5,4:189\n72#5,4:227\n72#5,4:265\n*S KotlinDebug\n*F\n+ 1 RunCircle.kt\nandroidx/compose/material/icons/twotone/RunCircleKt\n*L\n29#1:116,12\n30#1:129,18\n30#1:166\n66#1:167,18\n66#1:204\n80#1:205,18\n80#1:242\n104#1:243,18\n104#1:280\n29#1:128\n30#1:147,2\n30#1:149,2\n30#1:155,11\n66#1:185,2\n66#1:187,2\n66#1:193,11\n80#1:223,2\n80#1:225,2\n80#1:231,11\n104#1:261,2\n104#1:263,2\n104#1:269,11\n30#1:151,4\n66#1:189,4\n80#1:227,4\n104#1:265,4\n*E\n"
    }
.end annotation


# static fields
.field private static _runCircle:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getRunCircle(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/RunCircleKt;->_runCircle:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.RunCircle"

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
    const/high16 v4, 0x40800000    # 4.0f

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v25, -0x3f000000    # -8.0f

    .line 78
    .line 79
    const/high16 v26, 0x41000000    # 8.0f

    .line 80
    .line 81
    const v21, -0x3f728f5c    # -4.42f

    .line 82
    .line 83
    .line 84
    const/16 v22, 0x0

    .line 85
    .line 86
    const/high16 v23, -0x3f000000    # -8.0f

    .line 87
    .line 88
    const v24, 0x40651eb8    # 3.58f

    .line 89
    .line 90
    .line 91
    move-object/from16 v20, v2

    .line 92
    .line 93
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 94
    .line 95
    .line 96
    const v4, 0x40651eb8    # 3.58f

    .line 97
    .line 98
    .line 99
    const/high16 v6, 0x41000000    # 8.0f

    .line 100
    .line 101
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v4, -0x3f9ae148    # -3.58f

    .line 105
    .line 106
    .line 107
    const/high16 v6, -0x3f000000    # -8.0f

    .line 108
    .line 109
    const/high16 v7, 0x41000000    # 8.0f

    .line 110
    .line 111
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v4, 0x41835c29    # 16.42f

    .line 115
    .line 116
    .line 117
    const/high16 v6, 0x40800000    # 4.0f

    .line 118
    .line 119
    const/high16 v7, 0x41400000    # 12.0f

    .line 120
    .line 121
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 125
    .line 126
    .line 127
    const/high16 v4, 0x40c00000    # 6.0f

    .line 128
    .line 129
    const/high16 v6, 0x41580000    # 13.5f

    .line 130
    .line 131
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v25, 0x3f800000    # 1.0f

    .line 135
    .line 136
    const/high16 v26, 0x3f800000    # 1.0f

    .line 137
    .line 138
    const v21, 0x3f0ccccd    # 0.55f

    .line 139
    .line 140
    .line 141
    const/high16 v23, 0x3f800000    # 1.0f

    .line 142
    .line 143
    const v24, 0x3ee66666    # 0.45f

    .line 144
    .line 145
    .line 146
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    const/high16 v25, -0x40800000    # -1.0f

    .line 150
    .line 151
    const/16 v21, 0x0

    .line 152
    .line 153
    const v22, 0x3f0ccccd    # 0.55f

    .line 154
    .line 155
    .line 156
    const v23, -0x4119999a    # -0.45f

    .line 157
    .line 158
    .line 159
    const/high16 v24, 0x3f800000    # 1.0f

    .line 160
    .line 161
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const v4, -0x4119999a    # -0.45f

    .line 165
    .line 166
    .line 167
    const/high16 v6, -0x40800000    # -1.0f

    .line 168
    .line 169
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v25, 0x41580000    # 13.5f

    .line 173
    .line 174
    const/high16 v26, 0x40c00000    # 6.0f

    .line 175
    .line 176
    const/high16 v21, 0x41480000    # 12.5f

    .line 177
    .line 178
    const v22, 0x40ce6666    # 6.45f

    .line 179
    .line 180
    .line 181
    const v23, 0x414f3333    # 12.95f

    .line 182
    .line 183
    .line 184
    const/high16 v24, 0x40c00000    # 6.0f

    .line 185
    .line 186
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const/high16 v4, 0x41800000    # 16.0f

    .line 193
    .line 194
    const/high16 v6, 0x41400000    # 12.0f

    .line 195
    .line 196
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 197
    .line 198
    .line 199
    const v25, -0x3fc5c28f    # -2.91f

    .line 200
    .line 201
    .line 202
    const v26, -0x401eb852    # -1.76f

    .line 203
    .line 204
    .line 205
    const v21, -0x40cccccd    # -0.7f

    .line 206
    .line 207
    .line 208
    const/16 v22, 0x0

    .line 209
    .line 210
    const v23, -0x3fff5c29    # -2.01f

    .line 211
    .line 212
    .line 213
    const v24, -0x40f5c28f    # -0.54f

    .line 214
    .line 215
    .line 216
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 217
    .line 218
    .line 219
    const v4, -0x412e147b    # -0.41f

    .line 220
    .line 221
    .line 222
    const v6, 0x40166666    # 2.35f

    .line 223
    .line 224
    .line 225
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v4, 0x41600000    # 14.0f

    .line 229
    .line 230
    const v6, 0x41607ae1    # 14.03f

    .line 231
    .line 232
    .line 233
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/high16 v4, 0x41900000    # 18.0f

    .line 237
    .line 238
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 239
    .line 240
    .line 241
    const/high16 v4, -0x40800000    # -1.0f

    .line 242
    .line 243
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const v4, -0x3f9ae148    # -3.58f

    .line 247
    .line 248
    .line 249
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 250
    .line 251
    .line 252
    const v4, -0x4071eb85    # -1.11f

    .line 253
    .line 254
    .line 255
    const v6, -0x40651eb8    # -1.21f

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v4, -0x40fae148    # -0.52f

    .line 262
    .line 263
    .line 264
    const v6, 0x4028f5c3    # 2.64f

    .line 265
    .line 266
    .line 267
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v4, 0x40f33333    # 7.6f

    .line 271
    .line 272
    .line 273
    const v6, 0x417147ae    # 15.08f

    .line 274
    .line 275
    .line 276
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const v4, 0x3e4ccccd    # 0.2f

    .line 280
    .line 281
    .line 282
    const v6, -0x40851eb8    # -0.98f

    .line 283
    .line 284
    .line 285
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 286
    .line 287
    .line 288
    const v4, 0x4031eb85    # 2.78f

    .line 289
    .line 290
    .line 291
    const v6, 0x3f11eb85    # 0.57f

    .line 292
    .line 293
    .line 294
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 295
    .line 296
    .line 297
    const v4, 0x3f75c28f    # 0.96f

    .line 298
    .line 299
    .line 300
    const v6, -0x3f63851f    # -4.89f

    .line 301
    .line 302
    .line 303
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v4, 0x4125999a    # 10.35f

    .line 307
    .line 308
    .line 309
    const/high16 v6, 0x41200000    # 10.0f

    .line 310
    .line 311
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 312
    .line 313
    .line 314
    const/high16 v4, 0x41400000    # 12.0f

    .line 315
    .line 316
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 317
    .line 318
    .line 319
    const/high16 v4, 0x41100000    # 9.0f

    .line 320
    .line 321
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 322
    .line 323
    .line 324
    const v4, 0x411a6666    # 9.65f

    .line 325
    .line 326
    .line 327
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 328
    .line 329
    .line 330
    const v4, 0x4051eb85    # 3.28f

    .line 331
    .line 332
    .line 333
    const v6, -0x40651eb8    # -1.21f

    .line 334
    .line 335
    .line 336
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 337
    .line 338
    .line 339
    const v25, 0x3fa147ae    # 1.26f

    .line 340
    .line 341
    .line 342
    const v26, 0x3f07ae14    # 0.53f

    .line 343
    .line 344
    .line 345
    const v21, 0x3efae148    # 0.49f

    .line 346
    .line 347
    .line 348
    const v22, -0x41c7ae14    # -0.18f

    .line 349
    .line 350
    .line 351
    const v23, 0x3f83d70a    # 1.03f

    .line 352
    .line 353
    .line 354
    const v24, 0x3d75c28f    # 0.06f

    .line 355
    .line 356
    .line 357
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 358
    .line 359
    .line 360
    const/high16 v25, 0x41800000    # 16.0f

    .line 361
    .line 362
    const/high16 v26, 0x41300000    # 11.0f

    .line 363
    .line 364
    const v21, 0x4165eb85    # 14.37f

    .line 365
    .line 366
    .line 367
    const v22, 0x412ab852    # 10.67f

    .line 368
    .line 369
    .line 370
    const v23, 0x417970a4    # 15.59f

    .line 371
    .line 372
    .line 373
    const/high16 v24, 0x41300000    # 11.0f

    .line 374
    .line 375
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 376
    .line 377
    .line 378
    const/high16 v4, 0x41400000    # 12.0f

    .line 379
    .line 380
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 387
    .line 388
    .line 389
    move-result-object v2

    .line 390
    const/16 v16, 0x3800

    .line 391
    .line 392
    const/16 v17, 0x0

    .line 393
    .line 394
    const v6, 0x3e99999a    # 0.3f

    .line 395
    .line 396
    .line 397
    const v8, 0x3e99999a    # 0.3f

    .line 398
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
    const/4 v14, 0x0

    .line 407
    const/4 v15, 0x0

    .line 408
    const-string v4, ""

    .line 409
    .line 410
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 411
    .line 412
    .line 413
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 414
    .line 415
    .line 416
    move-result v3

    .line 417
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 418
    .line 419
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 420
    .line 421
    .line 422
    move-result-wide v6

    .line 423
    const/4 v2, 0x0

    .line 424
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 425
    .line 426
    .line 427
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 428
    .line 429
    .line 430
    move-result v10

    .line 431
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 432
    .line 433
    .line 434
    move-result v11

    .line 435
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 438
    .line 439
    .line 440
    const/high16 v4, 0x40000000    # 2.0f

    .line 441
    .line 442
    const/high16 v6, 0x41400000    # 12.0f

    .line 443
    .line 444
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 445
    .line 446
    .line 447
    const/high16 v25, 0x40000000    # 2.0f

    .line 448
    .line 449
    const/high16 v26, 0x41400000    # 12.0f

    .line 450
    .line 451
    const v21, 0x40cf5c29    # 6.48f

    .line 452
    .line 453
    .line 454
    const/high16 v22, 0x40000000    # 2.0f

    .line 455
    .line 456
    const/high16 v23, 0x40000000    # 2.0f

    .line 457
    .line 458
    const v24, 0x40cf5c29    # 6.48f

    .line 459
    .line 460
    .line 461
    move-object/from16 v20, v2

    .line 462
    .line 463
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 464
    .line 465
    .line 466
    const/high16 v25, 0x41200000    # 10.0f

    .line 467
    .line 468
    const/high16 v26, 0x41200000    # 10.0f

    .line 469
    .line 470
    const/16 v21, 0x0

    .line 471
    .line 472
    const v22, 0x40b0a3d7    # 5.52f

    .line 473
    .line 474
    .line 475
    const v23, 0x408f5c29    # 4.48f

    .line 476
    .line 477
    .line 478
    const/high16 v24, 0x41200000    # 10.0f

    .line 479
    .line 480
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const v4, -0x3f70a3d7    # -4.48f

    .line 484
    .line 485
    .line 486
    const/high16 v6, -0x3ee00000    # -10.0f

    .line 487
    .line 488
    const/high16 v7, 0x41200000    # 10.0f

    .line 489
    .line 490
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 491
    .line 492
    .line 493
    const/high16 v25, 0x41400000    # 12.0f

    .line 494
    .line 495
    const/high16 v26, 0x40000000    # 2.0f

    .line 496
    .line 497
    const/high16 v21, 0x41b00000    # 22.0f

    .line 498
    .line 499
    const v22, 0x40cf5c29    # 6.48f

    .line 500
    .line 501
    .line 502
    const v23, 0x418c28f6    # 17.52f

    .line 503
    .line 504
    .line 505
    const/high16 v24, 0x40000000    # 2.0f

    .line 506
    .line 507
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 508
    .line 509
    .line 510
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 511
    .line 512
    .line 513
    const/high16 v4, 0x41a00000    # 20.0f

    .line 514
    .line 515
    const/high16 v6, 0x41400000    # 12.0f

    .line 516
    .line 517
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 518
    .line 519
    .line 520
    const/high16 v25, -0x3f000000    # -8.0f

    .line 521
    .line 522
    const/high16 v26, -0x3f000000    # -8.0f

    .line 523
    .line 524
    const v21, -0x3f728f5c    # -4.42f

    .line 525
    .line 526
    .line 527
    const/16 v22, 0x0

    .line 528
    .line 529
    const/high16 v23, -0x3f000000    # -8.0f

    .line 530
    .line 531
    const v24, -0x3f9ae148    # -3.58f

    .line 532
    .line 533
    .line 534
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 535
    .line 536
    .line 537
    const/high16 v4, -0x3f000000    # -8.0f

    .line 538
    .line 539
    const v6, 0x40651eb8    # 3.58f

    .line 540
    .line 541
    .line 542
    const/high16 v7, 0x41000000    # 8.0f

    .line 543
    .line 544
    invoke-virtual {v2, v6, v4, v7, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 545
    .line 546
    .line 547
    const v4, 0x40651eb8    # 3.58f

    .line 548
    .line 549
    .line 550
    const/high16 v6, 0x41000000    # 8.0f

    .line 551
    .line 552
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 553
    .line 554
    .line 555
    const v4, 0x41835c29    # 16.42f

    .line 556
    .line 557
    .line 558
    const/high16 v6, 0x41a00000    # 20.0f

    .line 559
    .line 560
    const/high16 v7, 0x41400000    # 12.0f

    .line 561
    .line 562
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 563
    .line 564
    .line 565
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 566
    .line 567
    .line 568
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 569
    .line 570
    .line 571
    move-result-object v2

    .line 572
    const/high16 v6, 0x3f800000    # 1.0f

    .line 573
    .line 574
    const/high16 v8, 0x3f800000    # 1.0f

    .line 575
    .line 576
    const/4 v7, 0x0

    .line 577
    const-string v4, ""

    .line 578
    .line 579
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 580
    .line 581
    .line 582
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 583
    .line 584
    .line 585
    move-result v3

    .line 586
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 587
    .line 588
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 589
    .line 590
    .line 591
    move-result-wide v6

    .line 592
    const/4 v2, 0x0

    .line 593
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 594
    .line 595
    .line 596
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 597
    .line 598
    .line 599
    move-result v10

    .line 600
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 601
    .line 602
    .line 603
    move-result v11

    .line 604
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 605
    .line 606
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 607
    .line 608
    .line 609
    const v4, 0x4158a3d7    # 13.54f

    .line 610
    .line 611
    .line 612
    const v6, 0x410f851f    # 8.97f

    .line 613
    .line 614
    .line 615
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 616
    .line 617
    .line 618
    const v25, -0x405eb852    # -1.26f

    .line 619
    .line 620
    .line 621
    const v26, -0x40f851ec    # -0.53f

    .line 622
    .line 623
    .line 624
    const v21, -0x41947ae1    # -0.23f

    .line 625
    .line 626
    .line 627
    const v22, -0x410f5c29    # -0.47f

    .line 628
    .line 629
    .line 630
    const v23, -0x40bd70a4    # -0.76f

    .line 631
    .line 632
    .line 633
    const v24, -0x40ca3d71    # -0.71f

    .line 634
    .line 635
    .line 636
    move-object/from16 v20, v2

    .line 637
    .line 638
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 639
    .line 640
    .line 641
    const v4, 0x411a6666    # 9.65f

    .line 642
    .line 643
    .line 644
    const/high16 v6, 0x41100000    # 9.0f

    .line 645
    .line 646
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 647
    .line 648
    .line 649
    const/high16 v4, 0x41400000    # 12.0f

    .line 650
    .line 651
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 652
    .line 653
    .line 654
    const/high16 v4, 0x3f800000    # 1.0f

    .line 655
    .line 656
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 657
    .line 658
    .line 659
    const v4, -0x402ccccd    # -1.65f

    .line 660
    .line 661
    .line 662
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 663
    .line 664
    .line 665
    const v4, 0x3fc51eb8    # 1.54f

    .line 666
    .line 667
    .line 668
    const v6, -0x40ee147b    # -0.57f

    .line 669
    .line 670
    .line 671
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 672
    .line 673
    .line 674
    const v4, -0x408a3d71    # -0.96f

    .line 675
    .line 676
    .line 677
    const v6, 0x409c7ae1    # 4.89f

    .line 678
    .line 679
    .line 680
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 681
    .line 682
    .line 683
    const v4, 0x40f9999a    # 7.8f

    .line 684
    .line 685
    .line 686
    const v6, 0x4161999a    # 14.1f

    .line 687
    .line 688
    .line 689
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 690
    .line 691
    .line 692
    const v4, -0x41b33333    # -0.2f

    .line 693
    .line 694
    .line 695
    const v6, 0x3f7ae148    # 0.98f

    .line 696
    .line 697
    .line 698
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    const v4, 0x4070a3d7    # 3.76f

    .line 702
    .line 703
    .line 704
    const v6, 0x3f451eb8    # 0.77f

    .line 705
    .line 706
    .line 707
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 708
    .line 709
    .line 710
    const v4, 0x3f051eb8    # 0.52f

    .line 711
    .line 712
    .line 713
    const v6, -0x3fd70a3d    # -2.64f

    .line 714
    .line 715
    .line 716
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 717
    .line 718
    .line 719
    const/high16 v4, 0x41500000    # 13.0f

    .line 720
    .line 721
    const v6, 0x4166b852    # 14.42f

    .line 722
    .line 723
    .line 724
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 725
    .line 726
    .line 727
    const/high16 v4, 0x41900000    # 18.0f

    .line 728
    .line 729
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 730
    .line 731
    .line 732
    const/high16 v4, 0x3f800000    # 1.0f

    .line 733
    .line 734
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 735
    .line 736
    .line 737
    const v4, -0x3f81eb85    # -3.97f

    .line 738
    .line 739
    .line 740
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 741
    .line 742
    .line 743
    const v4, -0x40570a3d    # -1.32f

    .line 744
    .line 745
    .line 746
    const v6, -0x4047ae14    # -1.44f

    .line 747
    .line 748
    .line 749
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 750
    .line 751
    .line 752
    const v4, 0x3ed1eb85    # 0.41f

    .line 753
    .line 754
    .line 755
    const v6, -0x3fe9999a    # -2.35f

    .line 756
    .line 757
    .line 758
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 759
    .line 760
    .line 761
    const/high16 v25, 0x41800000    # 16.0f

    .line 762
    .line 763
    const/high16 v26, 0x41400000    # 12.0f

    .line 764
    .line 765
    const v21, 0x415fd70a    # 13.99f

    .line 766
    .line 767
    .line 768
    const v22, 0x41375c29    # 11.46f

    .line 769
    .line 770
    .line 771
    const v23, 0x4174cccd    # 15.3f

    .line 772
    .line 773
    .line 774
    const/high16 v24, 0x41400000    # 12.0f

    .line 775
    .line 776
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 777
    .line 778
    .line 779
    const/high16 v4, -0x40800000    # -1.0f

    .line 780
    .line 781
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 782
    .line 783
    .line 784
    const v25, 0x4158a3d7    # 13.54f

    .line 785
    .line 786
    .line 787
    const v26, 0x410f851f    # 8.97f

    .line 788
    .line 789
    .line 790
    const v21, 0x417970a4    # 15.59f

    .line 791
    .line 792
    .line 793
    const/high16 v22, 0x41300000    # 11.0f

    .line 794
    .line 795
    const v23, 0x4165eb85    # 14.37f

    .line 796
    .line 797
    .line 798
    const v24, 0x412ab852    # 10.67f

    .line 799
    .line 800
    .line 801
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 802
    .line 803
    .line 804
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 805
    .line 806
    .line 807
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 808
    .line 809
    .line 810
    move-result-object v2

    .line 811
    const/high16 v6, 0x3f800000    # 1.0f

    .line 812
    .line 813
    const/4 v7, 0x0

    .line 814
    const-string v4, ""

    .line 815
    .line 816
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 817
    .line 818
    .line 819
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 820
    .line 821
    .line 822
    move-result v3

    .line 823
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 824
    .line 825
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 826
    .line 827
    .line 828
    move-result-wide v6

    .line 829
    const/4 v0, 0x0

    .line 830
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 831
    .line 832
    .line 833
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 834
    .line 835
    .line 836
    move-result v10

    .line 837
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 838
    .line 839
    .line 840
    move-result v11

    .line 841
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 842
    .line 843
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 844
    .line 845
    .line 846
    const/high16 v0, 0x40e00000    # 7.0f

    .line 847
    .line 848
    const/high16 v2, 0x41580000    # 13.5f

    .line 849
    .line 850
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 851
    .line 852
    .line 853
    const/4 v0, 0x0

    .line 854
    const/high16 v2, -0x40800000    # -1.0f

    .line 855
    .line 856
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 857
    .line 858
    .line 859
    const/high16 v18, 0x40000000    # 2.0f

    .line 860
    .line 861
    const/16 v19, 0x0

    .line 862
    .line 863
    const/high16 v13, 0x3f800000    # 1.0f

    .line 864
    .line 865
    const/high16 v14, 0x3f800000    # 1.0f

    .line 866
    .line 867
    const/16 v16, 0x1

    .line 868
    .line 869
    const/16 v17, 0x1

    .line 870
    .line 871
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 872
    .line 873
    .line 874
    const/high16 v18, -0x40000000    # -2.0f

    .line 875
    .line 876
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 877
    .line 878
    .line 879
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 880
    .line 881
    .line 882
    move-result-object v2

    .line 883
    const/16 v16, 0x3800

    .line 884
    .line 885
    const/16 v17, 0x0

    .line 886
    .line 887
    const/high16 v6, 0x3f800000    # 1.0f

    .line 888
    .line 889
    const/4 v7, 0x0

    .line 890
    const/high16 v12, 0x3f800000    # 1.0f

    .line 891
    .line 892
    const/4 v13, 0x0

    .line 893
    const/4 v14, 0x0

    .line 894
    const-string v4, ""

    .line 895
    .line 896
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 897
    .line 898
    .line 899
    move-result-object v0

    .line 900
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 901
    .line 902
    .line 903
    move-result-object v0

    .line 904
    sput-object v0, Landroidx/compose/material/icons/twotone/RunCircleKt;->_runCircle:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 905
    .line 906
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 907
    .line 908
    .line 909
    return-object v0
.end method
