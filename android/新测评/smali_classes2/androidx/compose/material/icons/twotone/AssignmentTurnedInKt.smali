.class public final Landroidx/compose/material/icons/twotone/AssignmentTurnedInKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_assignmentTurnedIn",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "AssignmentTurnedIn",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getAssignmentTurnedIn",
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
        "SMAP\nAssignmentTurnedIn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssignmentTurnedIn.kt\nandroidx/compose/material/icons/twotone/AssignmentTurnedInKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,91:1\n212#2,12:92\n233#2,18:105\n253#2:142\n233#2,18:143\n253#2:180\n174#3:104\n705#4,2:123\n717#4,2:125\n719#4,11:131\n705#4,2:161\n717#4,2:163\n719#4,11:169\n72#5,4:127\n72#5,4:165\n*S KotlinDebug\n*F\n+ 1 AssignmentTurnedIn.kt\nandroidx/compose/material/icons/twotone/AssignmentTurnedInKt\n*L\n29#1:92,12\n30#1:105,18\n30#1:142\n46#1:143,18\n46#1:180\n29#1:104\n30#1:123,2\n30#1:125,2\n30#1:131,11\n46#1:161,2\n46#1:163,2\n46#1:169,11\n30#1:127,4\n46#1:165,4\n*E\n"
    }
.end annotation


# static fields
.field private static _assignmentTurnedIn:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getAssignmentTurnedIn(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 20

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/AssignmentTurnedInKt;->_assignmentTurnedIn:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.AssignmentTurnedIn"

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
    const/high16 v4, 0x41980000    # 19.0f

    .line 71
    .line 72
    const/high16 v6, 0x40a00000    # 5.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x41600000    # 14.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x41980000    # 19.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const/high16 v4, 0x40a00000    # 5.0f

    .line 88
    .line 89
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 90
    .line 91
    .line 92
    const/high16 v4, 0x41600000    # 14.0f

    .line 93
    .line 94
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v4, 0x40ed1eb8    # 7.41f

    .line 101
    .line 102
    .line 103
    const v6, 0x413970a4    # 11.59f

    .line 104
    .line 105
    .line 106
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v4, 0x4162b852    # 14.17f

    .line 110
    .line 111
    .line 112
    const/high16 v6, 0x41200000    # 10.0f

    .line 113
    .line 114
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 115
    .line 116
    .line 117
    const v4, 0x40d2e148    # 6.59f

    .line 118
    .line 119
    .line 120
    const v6, -0x3f2d1eb8    # -6.59f

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 124
    .line 125
    .line 126
    const/high16 v4, 0x41100000    # 9.0f

    .line 127
    .line 128
    const/high16 v6, 0x41900000    # 18.0f

    .line 129
    .line 130
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v4, -0x3f000000    # -8.0f

    .line 134
    .line 135
    const/high16 v6, 0x41000000    # 8.0f

    .line 136
    .line 137
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const/high16 v4, -0x3f800000    # -4.0f

    .line 141
    .line 142
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v4, 0x3fb47ae1    # 1.41f

    .line 146
    .line 147
    .line 148
    const v6, -0x404b851f    # -1.41f

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    const/16 v16, 0x3800

    .line 162
    .line 163
    const/16 v17, 0x0

    .line 164
    .line 165
    const v6, 0x3e99999a    # 0.3f

    .line 166
    .line 167
    .line 168
    const v8, 0x3e99999a    # 0.3f

    .line 169
    .line 170
    .line 171
    const/4 v7, 0x0

    .line 172
    const/high16 v9, 0x3f800000    # 1.0f

    .line 173
    .line 174
    const/high16 v12, 0x3f800000    # 1.0f

    .line 175
    .line 176
    const/4 v13, 0x0

    .line 177
    const/4 v14, 0x0

    .line 178
    const/4 v15, 0x0

    .line 179
    const-string v4, ""

    .line 180
    .line 181
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 182
    .line 183
    .line 184
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 189
    .line 190
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 191
    .line 192
    .line 193
    move-result-wide v6

    .line 194
    const/4 v0, 0x0

    .line 195
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 199
    .line 200
    .line 201
    move-result v10

    .line 202
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 203
    .line 204
    .line 205
    move-result v11

    .line 206
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 207
    .line 208
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 209
    .line 210
    .line 211
    const/high16 v0, 0x41100000    # 9.0f

    .line 212
    .line 213
    const/high16 v2, 0x41900000    # 18.0f

    .line 214
    .line 215
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 216
    .line 217
    .line 218
    const v0, -0x404a3d71    # -1.42f

    .line 219
    .line 220
    .line 221
    const v2, -0x404b851f    # -1.41f

    .line 222
    .line 223
    .line 224
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 225
    .line 226
    .line 227
    const v0, 0x4162b852    # 14.17f

    .line 228
    .line 229
    .line 230
    const/high16 v2, 0x41200000    # 10.0f

    .line 231
    .line 232
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const v0, -0x3fda3d71    # -2.59f

    .line 236
    .line 237
    .line 238
    const v2, -0x3fdae148    # -2.58f

    .line 239
    .line 240
    .line 241
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 242
    .line 243
    .line 244
    const/high16 v0, 0x40c00000    # 6.0f

    .line 245
    .line 246
    const/high16 v2, 0x41500000    # 13.0f

    .line 247
    .line 248
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 249
    .line 250
    .line 251
    const/high16 v0, 0x40800000    # 4.0f

    .line 252
    .line 253
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const/high16 v0, 0x40400000    # 3.0f

    .line 260
    .line 261
    const/high16 v2, 0x41980000    # 19.0f

    .line 262
    .line 263
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const v0, -0x3f7a3d71    # -4.18f

    .line 267
    .line 268
    .line 269
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 270
    .line 271
    .line 272
    const/high16 v17, 0x41400000    # 12.0f

    .line 273
    .line 274
    const/high16 v18, 0x3f800000    # 1.0f

    .line 275
    .line 276
    const v13, 0x41666666    # 14.4f

    .line 277
    .line 278
    .line 279
    const v14, 0x3feb851f    # 1.84f

    .line 280
    .line 281
    .line 282
    const v15, 0x4154cccd    # 13.3f

    .line 283
    .line 284
    .line 285
    const/high16 v16, 0x3f800000    # 1.0f

    .line 286
    .line 287
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 288
    .line 289
    .line 290
    const v17, -0x3fcb851f    # -2.82f

    .line 291
    .line 292
    .line 293
    const/high16 v18, 0x40000000    # 2.0f

    .line 294
    .line 295
    const v13, -0x4059999a    # -1.3f

    .line 296
    .line 297
    .line 298
    const/4 v14, 0x0

    .line 299
    const v15, -0x3fe66666    # -2.4f

    .line 300
    .line 301
    .line 302
    const v16, 0x3f570a3d    # 0.84f

    .line 303
    .line 304
    .line 305
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const/high16 v0, 0x40400000    # 3.0f

    .line 309
    .line 310
    const/high16 v2, 0x40a00000    # 5.0f

    .line 311
    .line 312
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const v17, -0x41333333    # -0.4f

    .line 316
    .line 317
    .line 318
    const v18, 0x3d23d70a    # 0.04f

    .line 319
    .line 320
    .line 321
    const v13, -0x41f0a3d7    # -0.14f

    .line 322
    .line 323
    .line 324
    const v15, -0x4175c28f    # -0.27f

    .line 325
    .line 326
    .line 327
    const v16, 0x3c23d70a    # 0.01f

    .line 328
    .line 329
    .line 330
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    const v17, -0x407eb852    # -1.01f

    .line 334
    .line 335
    .line 336
    const v18, 0x3f0ccccd    # 0.55f

    .line 337
    .line 338
    .line 339
    const v13, -0x413851ec    # -0.39f

    .line 340
    .line 341
    .line 342
    const v14, 0x3da3d70a    # 0.08f

    .line 343
    .line 344
    .line 345
    const v15, -0x40c28f5c    # -0.74f

    .line 346
    .line 347
    .line 348
    const v16, 0x3e8f5c29    # 0.28f

    .line 349
    .line 350
    .line 351
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 352
    .line 353
    .line 354
    const v17, -0x4123d70a    # -0.43f

    .line 355
    .line 356
    .line 357
    const v18, 0x3f23d70a    # 0.64f

    .line 358
    .line 359
    .line 360
    const v13, -0x41c7ae14    # -0.18f

    .line 361
    .line 362
    .line 363
    const v14, 0x3e3851ec    # 0.18f

    .line 364
    .line 365
    .line 366
    const v15, -0x41570a3d    # -0.33f

    .line 367
    .line 368
    .line 369
    const v16, 0x3ecccccd    # 0.4f

    .line 370
    .line 371
    .line 372
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const v0, 0x40970a3d    # 4.72f

    .line 376
    .line 377
    .line 378
    const/high16 v2, 0x40400000    # 3.0f

    .line 379
    .line 380
    const/high16 v4, 0x40a00000    # 5.0f

    .line 381
    .line 382
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    const/high16 v0, 0x41600000    # 14.0f

    .line 386
    .line 387
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 388
    .line 389
    .line 390
    const v17, 0x3e23d70a    # 0.16f

    .line 391
    .line 392
    .line 393
    const v18, 0x3f47ae14    # 0.78f

    .line 394
    .line 395
    .line 396
    const/4 v13, 0x0

    .line 397
    const v14, 0x3e8a3d71    # 0.27f

    .line 398
    .line 399
    .line 400
    const v15, 0x3d75c28f    # 0.06f

    .line 401
    .line 402
    .line 403
    const v16, 0x3f0a3d71    # 0.54f

    .line 404
    .line 405
    .line 406
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 407
    .line 408
    .line 409
    const v0, 0x3edc28f6    # 0.43f

    .line 410
    .line 411
    .line 412
    const v2, 0x3f23d70a    # 0.64f

    .line 413
    .line 414
    .line 415
    const/high16 v4, 0x3e800000    # 0.25f

    .line 416
    .line 417
    const v6, 0x3ee66666    # 0.45f

    .line 418
    .line 419
    .line 420
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 421
    .line 422
    .line 423
    const v17, 0x3f8147ae    # 1.01f

    .line 424
    .line 425
    .line 426
    const v18, 0x3f0ccccd    # 0.55f

    .line 427
    .line 428
    .line 429
    const v13, 0x3e8a3d71    # 0.27f

    .line 430
    .line 431
    .line 432
    const v15, 0x3f1eb852    # 0.62f

    .line 433
    .line 434
    .line 435
    const v16, 0x3ef0a3d7    # 0.47f

    .line 436
    .line 437
    .line 438
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 439
    .line 440
    .line 441
    const v17, 0x3ecccccd    # 0.4f

    .line 442
    .line 443
    .line 444
    const v18, 0x3cf5c28f    # 0.03f

    .line 445
    .line 446
    .line 447
    const v13, 0x3e051eb8    # 0.13f

    .line 448
    .line 449
    .line 450
    const v14, 0x3ca3d70a    # 0.02f

    .line 451
    .line 452
    .line 453
    const v15, 0x3e851eb8    # 0.26f

    .line 454
    .line 455
    .line 456
    const v16, 0x3cf5c28f    # 0.03f

    .line 457
    .line 458
    .line 459
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 460
    .line 461
    .line 462
    const/high16 v0, 0x41600000    # 14.0f

    .line 463
    .line 464
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 465
    .line 466
    .line 467
    const/high16 v17, 0x40000000    # 2.0f

    .line 468
    .line 469
    const/high16 v18, -0x40000000    # -2.0f

    .line 470
    .line 471
    const v13, 0x3f8ccccd    # 1.1f

    .line 472
    .line 473
    .line 474
    const/4 v14, 0x0

    .line 475
    const/high16 v15, 0x40000000    # 2.0f

    .line 476
    .line 477
    const v16, -0x4099999a    # -0.9f

    .line 478
    .line 479
    .line 480
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 481
    .line 482
    .line 483
    const/high16 v0, 0x41a80000    # 21.0f

    .line 484
    .line 485
    const/high16 v2, 0x40a00000    # 5.0f

    .line 486
    .line 487
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 488
    .line 489
    .line 490
    const/high16 v17, -0x40000000    # -2.0f

    .line 491
    .line 492
    const/4 v13, 0x0

    .line 493
    const v14, -0x40733333    # -1.1f

    .line 494
    .line 495
    .line 496
    const v15, -0x4099999a    # -0.9f

    .line 497
    .line 498
    .line 499
    const/high16 v16, -0x40000000    # -2.0f

    .line 500
    .line 501
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 502
    .line 503
    .line 504
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 505
    .line 506
    .line 507
    const/high16 v0, 0x41400000    # 12.0f

    .line 508
    .line 509
    const/high16 v2, 0x40300000    # 2.75f

    .line 510
    .line 511
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 512
    .line 513
    .line 514
    const/high16 v17, 0x3f400000    # 0.75f

    .line 515
    .line 516
    const/high16 v18, 0x3f400000    # 0.75f

    .line 517
    .line 518
    const v13, 0x3ed1eb85    # 0.41f

    .line 519
    .line 520
    .line 521
    const/4 v14, 0x0

    .line 522
    const/high16 v15, 0x3f400000    # 0.75f

    .line 523
    .line 524
    const v16, 0x3eae147b    # 0.34f

    .line 525
    .line 526
    .line 527
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 528
    .line 529
    .line 530
    const v0, -0x4151eb85    # -0.34f

    .line 531
    .line 532
    .line 533
    const/high16 v2, 0x3f400000    # 0.75f

    .line 534
    .line 535
    const/high16 v4, -0x40c00000    # -0.75f

    .line 536
    .line 537
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const/high16 v2, -0x40c00000    # -0.75f

    .line 541
    .line 542
    invoke-virtual {v12, v2, v0, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    const v0, 0x3eae147b    # 0.34f

    .line 546
    .line 547
    .line 548
    const/high16 v2, 0x3f400000    # 0.75f

    .line 549
    .line 550
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 551
    .line 552
    .line 553
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 554
    .line 555
    .line 556
    const/high16 v0, 0x41980000    # 19.0f

    .line 557
    .line 558
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 559
    .line 560
    .line 561
    const/high16 v2, 0x40a00000    # 5.0f

    .line 562
    .line 563
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 564
    .line 565
    .line 566
    const/high16 v0, 0x40a00000    # 5.0f

    .line 567
    .line 568
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 569
    .line 570
    .line 571
    const/high16 v0, 0x41600000    # 14.0f

    .line 572
    .line 573
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 574
    .line 575
    .line 576
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 577
    .line 578
    .line 579
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 583
    .line 584
    .line 585
    move-result-object v2

    .line 586
    const/16 v16, 0x3800

    .line 587
    .line 588
    const/16 v17, 0x0

    .line 589
    .line 590
    const/high16 v6, 0x3f800000    # 1.0f

    .line 591
    .line 592
    const/high16 v8, 0x3f800000    # 1.0f

    .line 593
    .line 594
    const/4 v7, 0x0

    .line 595
    const/high16 v12, 0x3f800000    # 1.0f

    .line 596
    .line 597
    const/4 v13, 0x0

    .line 598
    const/4 v15, 0x0

    .line 599
    const-string v4, ""

    .line 600
    .line 601
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 602
    .line 603
    .line 604
    move-result-object v0

    .line 605
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 606
    .line 607
    .line 608
    move-result-object v0

    .line 609
    sput-object v0, Landroidx/compose/material/icons/twotone/AssignmentTurnedInKt;->_assignmentTurnedIn:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 610
    .line 611
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 612
    .line 613
    .line 614
    return-object v0
.end method
