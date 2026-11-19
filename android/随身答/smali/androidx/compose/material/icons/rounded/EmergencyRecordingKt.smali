.class public final Landroidx/compose/material/icons/rounded/EmergencyRecordingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_emergencyRecording",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "EmergencyRecording",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getEmergencyRecording",
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
        "SMAP\nEmergencyRecording.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmergencyRecording.kt\nandroidx/compose/material/icons/rounded/EmergencyRecordingKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,79:1\n212#2,12:80\n233#2,18:93\n253#2:130\n174#3:92\n705#4,2:111\n717#4,2:113\n719#4,11:119\n72#5,4:115\n*S KotlinDebug\n*F\n+ 1 EmergencyRecording.kt\nandroidx/compose/material/icons/rounded/EmergencyRecordingKt\n*L\n29#1:80,12\n30#1:93,18\n30#1:130\n29#1:92\n30#1:111,2\n30#1:113,2\n30#1:119,11\n30#1:115,4\n*E\n"
    }
.end annotation


# static fields
.field private static _emergencyRecording:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getEmergencyRecording(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/EmergencyRecordingKt;->_emergencyRecording:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.EmergencyRecording"

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
    const v0, 0x4127ae14    # 10.48f

    .line 71
    .line 72
    .line 73
    const/high16 v2, 0x41900000    # 18.0f

    .line 74
    .line 75
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 76
    .line 77
    .line 78
    const/high16 v0, 0x40c00000    # 6.0f

    .line 79
    .line 80
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const/high16 v17, -0x40000000    # -2.0f

    .line 84
    .line 85
    const/high16 v18, -0x40000000    # -2.0f

    .line 86
    .line 87
    const/4 v13, 0x0

    .line 88
    const v14, -0x40733333    # -1.1f

    .line 89
    .line 90
    .line 91
    const v15, -0x4099999a    # -0.9f

    .line 92
    .line 93
    .line 94
    const/high16 v16, -0x40000000    # -2.0f

    .line 95
    .line 96
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 97
    .line 98
    .line 99
    const/high16 v0, 0x40800000    # 4.0f

    .line 100
    .line 101
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const/high16 v17, 0x40000000    # 2.0f

    .line 105
    .line 106
    const/high16 v18, 0x40c00000    # 6.0f

    .line 107
    .line 108
    const v13, 0x4039999a    # 2.9f

    .line 109
    .line 110
    .line 111
    const/high16 v14, 0x40800000    # 4.0f

    .line 112
    .line 113
    const/high16 v15, 0x40000000    # 2.0f

    .line 114
    .line 115
    const v16, 0x409ccccd    # 4.9f

    .line 116
    .line 117
    .line 118
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 119
    .line 120
    .line 121
    const/high16 v0, 0x41400000    # 12.0f

    .line 122
    .line 123
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v18, 0x40000000    # 2.0f

    .line 127
    .line 128
    const/4 v13, 0x0

    .line 129
    const v14, 0x3f8ccccd    # 1.1f

    .line 130
    .line 131
    .line 132
    const v15, 0x3f666666    # 0.9f

    .line 133
    .line 134
    .line 135
    const/high16 v16, 0x40000000    # 2.0f

    .line 136
    .line 137
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 141
    .line 142
    .line 143
    const/high16 v18, -0x40000000    # -2.0f

    .line 144
    .line 145
    const v13, 0x3f8ccccd    # 1.1f

    .line 146
    .line 147
    .line 148
    const/4 v14, 0x0

    .line 149
    const/high16 v15, 0x40000000    # 2.0f

    .line 150
    .line 151
    const v16, -0x4099999a    # -0.9f

    .line 152
    .line 153
    .line 154
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    const v0, -0x3f70a3d7    # -4.48f

    .line 158
    .line 159
    .line 160
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v0, 0x4049999a    # 3.15f

    .line 164
    .line 165
    .line 166
    const v2, 0x404851ec    # 3.13f

    .line 167
    .line 168
    .line 169
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v17, 0x41b00000    # 22.0f

    .line 173
    .line 174
    const v18, 0x41826666    # 16.3f

    .line 175
    .line 176
    .line 177
    const v13, 0x41abae14    # 21.46f

    .line 178
    .line 179
    .line 180
    const v14, 0x4187c28f    # 16.97f

    .line 181
    .line 182
    .line 183
    const/high16 v15, 0x41b00000    # 22.0f

    .line 184
    .line 185
    const v16, 0x4185eb85    # 16.74f

    .line 186
    .line 187
    .line 188
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 189
    .line 190
    .line 191
    const v0, 0x40f66666    # 7.7f

    .line 192
    .line 193
    .line 194
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const v17, -0x40a66666    # -0.85f

    .line 198
    .line 199
    .line 200
    const v18, -0x414ccccd    # -0.35f

    .line 201
    .line 202
    .line 203
    const/4 v13, 0x0

    .line 204
    const v14, -0x411eb852    # -0.44f

    .line 205
    .line 206
    .line 207
    const v15, -0x40f5c28f    # -0.54f

    .line 208
    .line 209
    .line 210
    const v16, -0x40d47ae1    # -0.67f

    .line 211
    .line 212
    .line 213
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v0, 0x4127ae14    # 10.48f

    .line 217
    .line 218
    .line 219
    const/high16 v2, 0x41900000    # 18.0f

    .line 220
    .line 221
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const/high16 v0, 0x41680000    # 14.5f

    .line 228
    .line 229
    const v2, 0x4169999a    # 14.6f

    .line 230
    .line 231
    .line 232
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v17, -0x4050a3d7    # -1.37f

    .line 236
    .line 237
    .line 238
    const v18, 0x3ebd70a4    # 0.37f

    .line 239
    .line 240
    .line 241
    const v13, -0x4170a3d7    # -0.28f

    .line 242
    .line 243
    .line 244
    const v14, 0x3ef5c28f    # 0.48f

    .line 245
    .line 246
    .line 247
    const v15, -0x409c28f6    # -0.89f

    .line 248
    .line 249
    .line 250
    const v16, 0x3f23d70a    # 0.64f

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const/high16 v0, 0x41300000    # 11.0f

    .line 257
    .line 258
    const v2, 0x415bae14    # 13.73f

    .line 259
    .line 260
    .line 261
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 262
    .line 263
    .line 264
    const/high16 v0, 0x41800000    # 16.0f

    .line 265
    .line 266
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const/high16 v17, -0x40800000    # -1.0f

    .line 270
    .line 271
    const/high16 v18, 0x3f800000    # 1.0f

    .line 272
    .line 273
    const/4 v13, 0x0

    .line 274
    const v14, 0x3f0ccccd    # 0.55f

    .line 275
    .line 276
    .line 277
    const v15, -0x4119999a    # -0.45f

    .line 278
    .line 279
    .line 280
    const/high16 v16, 0x3f800000    # 1.0f

    .line 281
    .line 282
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const v0, -0x4119999a    # -0.45f

    .line 286
    .line 287
    .line 288
    const/high16 v2, -0x40800000    # -1.0f

    .line 289
    .line 290
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 291
    .line 292
    .line 293
    const v0, -0x3feeb852    # -2.27f

    .line 294
    .line 295
    .line 296
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 297
    .line 298
    .line 299
    const v0, 0x3f9d70a4    # 1.23f

    .line 300
    .line 301
    .line 302
    const v2, -0x3ff7ae14    # -2.13f

    .line 303
    .line 304
    .line 305
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const v17, -0x4050a3d7    # -1.37f

    .line 309
    .line 310
    .line 311
    const v18, -0x41428f5c    # -0.37f

    .line 312
    .line 313
    .line 314
    const v13, -0x410a3d71    # -0.48f

    .line 315
    .line 316
    .line 317
    const v14, 0x3e8f5c29    # 0.28f

    .line 318
    .line 319
    .line 320
    const v15, -0x40747ae1    # -1.09f

    .line 321
    .line 322
    .line 323
    const v16, 0x3de147ae    # 0.11f

    .line 324
    .line 325
    .line 326
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 327
    .line 328
    .line 329
    const v17, 0x3ebd70a4    # 0.37f

    .line 330
    .line 331
    .line 332
    const v18, -0x4050a3d7    # -1.37f

    .line 333
    .line 334
    .line 335
    const v13, -0x4170a3d7    # -0.28f

    .line 336
    .line 337
    .line 338
    const v14, -0x410a3d71    # -0.48f

    .line 339
    .line 340
    .line 341
    const v15, -0x421eb852    # -0.11f

    .line 342
    .line 343
    .line 344
    const v16, -0x40747ae1    # -1.09f

    .line 345
    .line 346
    .line 347
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 348
    .line 349
    .line 350
    const/high16 v0, 0x41000000    # 8.0f

    .line 351
    .line 352
    const/high16 v2, 0x41400000    # 12.0f

    .line 353
    .line 354
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 355
    .line 356
    .line 357
    const v0, -0x40628f5c    # -1.23f

    .line 358
    .line 359
    .line 360
    const v2, -0x3ff7ae14    # -2.13f

    .line 361
    .line 362
    .line 363
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 364
    .line 365
    .line 366
    const/high16 v17, 0x40b00000    # 5.5f

    .line 367
    .line 368
    const v18, 0x41166666    # 9.4f

    .line 369
    .line 370
    .line 371
    const v13, 0x40ac7ae1    # 5.39f

    .line 372
    .line 373
    .line 374
    const v14, 0x4127d70a    # 10.49f

    .line 375
    .line 376
    .line 377
    const v15, 0x40a70a3d    # 5.22f

    .line 378
    .line 379
    .line 380
    const v16, 0x411e147b    # 9.88f

    .line 381
    .line 382
    .line 383
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 384
    .line 385
    .line 386
    const v17, 0x3faf5c29    # 1.37f

    .line 387
    .line 388
    .line 389
    const v18, -0x41428f5c    # -0.37f

    .line 390
    .line 391
    .line 392
    const v13, 0x3e8f5c29    # 0.28f

    .line 393
    .line 394
    .line 395
    const v14, -0x410a3d71    # -0.48f

    .line 396
    .line 397
    .line 398
    const v15, 0x3f63d70a    # 0.89f

    .line 399
    .line 400
    .line 401
    const v16, -0x40dc28f6    # -0.64f

    .line 402
    .line 403
    .line 404
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const/high16 v0, 0x41100000    # 9.0f

    .line 408
    .line 409
    const v2, 0x412451ec    # 10.27f

    .line 410
    .line 411
    .line 412
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const/high16 v0, 0x41000000    # 8.0f

    .line 416
    .line 417
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 418
    .line 419
    .line 420
    const/high16 v17, 0x3f800000    # 1.0f

    .line 421
    .line 422
    const/high16 v18, -0x40800000    # -1.0f

    .line 423
    .line 424
    const/4 v13, 0x0

    .line 425
    const v14, -0x40f33333    # -0.55f

    .line 426
    .line 427
    .line 428
    const v15, 0x3ee66666    # 0.45f

    .line 429
    .line 430
    .line 431
    const/high16 v16, -0x40800000    # -1.0f

    .line 432
    .line 433
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 434
    .line 435
    .line 436
    const v0, 0x3ee66666    # 0.45f

    .line 437
    .line 438
    .line 439
    const/high16 v2, 0x3f800000    # 1.0f

    .line 440
    .line 441
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 442
    .line 443
    .line 444
    const v0, 0x401147ae    # 2.27f

    .line 445
    .line 446
    .line 447
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v0, 0x400851ec    # 2.13f

    .line 451
    .line 452
    .line 453
    const v2, -0x40628f5c    # -1.23f

    .line 454
    .line 455
    .line 456
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 457
    .line 458
    .line 459
    const v17, 0x3faf5c29    # 1.37f

    .line 460
    .line 461
    .line 462
    const v18, 0x3ebd70a4    # 0.37f

    .line 463
    .line 464
    .line 465
    const v13, 0x3ef5c28f    # 0.48f

    .line 466
    .line 467
    .line 468
    const v14, -0x4170a3d7    # -0.28f

    .line 469
    .line 470
    .line 471
    const v15, 0x3f8b851f    # 1.09f

    .line 472
    .line 473
    .line 474
    const v16, -0x421eb852    # -0.11f

    .line 475
    .line 476
    .line 477
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const v17, -0x41428f5c    # -0.37f

    .line 481
    .line 482
    .line 483
    const v18, 0x3faf5c29    # 1.37f

    .line 484
    .line 485
    .line 486
    const v13, 0x3e8f5c29    # 0.28f

    .line 487
    .line 488
    .line 489
    const v14, 0x3ef5c28f    # 0.48f

    .line 490
    .line 491
    .line 492
    const v15, 0x3de147ae    # 0.11f

    .line 493
    .line 494
    .line 495
    const v16, 0x3f8b851f    # 1.09f

    .line 496
    .line 497
    .line 498
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 499
    .line 500
    .line 501
    const/high16 v0, 0x41400000    # 12.0f

    .line 502
    .line 503
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 504
    .line 505
    .line 506
    const v0, 0x400851ec    # 2.13f

    .line 507
    .line 508
    .line 509
    const v2, 0x3f9d70a4    # 1.23f

    .line 510
    .line 511
    .line 512
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 513
    .line 514
    .line 515
    const/high16 v17, 0x41680000    # 14.5f

    .line 516
    .line 517
    const v18, 0x4169999a    # 14.6f

    .line 518
    .line 519
    .line 520
    const v13, 0x4169c28f    # 14.61f

    .line 521
    .line 522
    .line 523
    const v14, 0x415828f6    # 13.51f

    .line 524
    .line 525
    .line 526
    const v15, 0x416c7ae1    # 14.78f

    .line 527
    .line 528
    .line 529
    const v16, 0x4161eb85    # 14.12f

    .line 530
    .line 531
    .line 532
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 533
    .line 534
    .line 535
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 536
    .line 537
    .line 538
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 539
    .line 540
    .line 541
    move-result-object v2

    .line 542
    const/16 v16, 0x3800

    .line 543
    .line 544
    const/16 v17, 0x0

    .line 545
    .line 546
    const/high16 v6, 0x3f800000    # 1.0f

    .line 547
    .line 548
    const/high16 v8, 0x3f800000    # 1.0f

    .line 549
    .line 550
    const/4 v7, 0x0

    .line 551
    const/high16 v9, 0x3f800000    # 1.0f

    .line 552
    .line 553
    const/high16 v12, 0x3f800000    # 1.0f

    .line 554
    .line 555
    const/4 v13, 0x0

    .line 556
    const/4 v14, 0x0

    .line 557
    const/4 v15, 0x0

    .line 558
    const-string v4, ""

    .line 559
    .line 560
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 561
    .line 562
    .line 563
    move-result-object v0

    .line 564
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 565
    .line 566
    .line 567
    move-result-object v0

    .line 568
    sput-object v0, Landroidx/compose/material/icons/rounded/EmergencyRecordingKt;->_emergencyRecording:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 569
    .line 570
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 571
    .line 572
    .line 573
    return-object v0
.end method
