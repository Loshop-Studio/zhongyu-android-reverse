.class public final Landroidx/compose/material/icons/twotone/ContactEmergencyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_contactEmergency",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "ContactEmergency",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getContactEmergency",
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
        "SMAP\nContactEmergency.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContactEmergency.kt\nandroidx/compose/material/icons/twotone/ContactEmergencyKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,133:1\n212#2,12:134\n233#2,18:147\n253#2:184\n233#2,18:185\n253#2:222\n233#2,18:223\n253#2:260\n233#2,18:261\n253#2:298\n174#3:146\n705#4,2:165\n717#4,2:167\n719#4,11:173\n705#4,2:203\n717#4,2:205\n719#4,11:211\n705#4,2:241\n717#4,2:243\n719#4,11:249\n705#4,2:279\n717#4,2:281\n719#4,11:287\n72#5,4:169\n72#5,4:207\n72#5,4:245\n72#5,4:283\n*S KotlinDebug\n*F\n+ 1 ContactEmergency.kt\nandroidx/compose/material/icons/twotone/ContactEmergencyKt\n*L\n29#1:134,12\n30#1:147,18\n30#1:184\n67#1:185,18\n67#1:222\n81#1:223,18\n81#1:260\n107#1:261,18\n107#1:298\n29#1:146\n30#1:165,2\n30#1:167,2\n30#1:173,11\n67#1:203,2\n67#1:205,2\n67#1:211,11\n81#1:241,2\n81#1:243,2\n81#1:249,11\n107#1:279,2\n107#1:281,2\n107#1:287,11\n30#1:169,4\n67#1:207,4\n81#1:245,4\n107#1:283,4\n*E\n"
    }
.end annotation


# static fields
.field private static _contactEmergency:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getContactEmergency(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/ContactEmergencyKt;->_contactEmergency:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.ContactEmergency"

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
    const/high16 v6, 0x40000000    # 2.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const v4, 0x3da3d70a    # 0.08f

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 81
    .line 82
    .line 83
    const v25, 0x40dd70a4    # 6.92f

    .line 84
    .line 85
    .line 86
    const/high16 v26, -0x3f800000    # -4.0f

    .line 87
    .line 88
    const v21, 0x3fb0a3d7    # 1.38f

    .line 89
    .line 90
    .line 91
    const v22, -0x3fe70a3d    # -2.39f

    .line 92
    .line 93
    .line 94
    const v23, 0x407d70a4    # 3.96f

    .line 95
    .line 96
    .line 97
    const/high16 v24, -0x3f800000    # -4.0f

    .line 98
    .line 99
    move-object/from16 v20, v2

    .line 100
    .line 101
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 102
    .line 103
    .line 104
    const v4, 0x40dd70a4    # 6.92f

    .line 105
    .line 106
    .line 107
    const/high16 v6, 0x40800000    # 4.0f

    .line 108
    .line 109
    const v7, 0x40b147ae    # 5.54f

    .line 110
    .line 111
    .line 112
    const v8, 0x3fce147b    # 1.61f

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 116
    .line 117
    .line 118
    const/high16 v4, 0x41b00000    # 22.0f

    .line 119
    .line 120
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const/high16 v4, 0x40a00000    # 5.0f

    .line 124
    .line 125
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 126
    .line 127
    .line 128
    const/high16 v4, 0x40000000    # 2.0f

    .line 129
    .line 130
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const/high16 v4, 0x41980000    # 19.0f

    .line 134
    .line 135
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 139
    .line 140
    .line 141
    const v4, 0x41707ae1    # 15.03f

    .line 142
    .line 143
    .line 144
    const v6, 0x41026666    # 8.15f

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 148
    .line 149
    .line 150
    const/high16 v4, 0x3f400000    # 0.75f

    .line 151
    .line 152
    const v6, -0x4059999a    # -1.3f

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 156
    .line 157
    .line 158
    const v4, 0x3f59999a    # 0.85f

    .line 159
    .line 160
    .line 161
    const v6, 0x3fbc28f6    # 1.47f

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 165
    .line 166
    .line 167
    const/high16 v4, 0x40c00000    # 6.0f

    .line 168
    .line 169
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v4, 0x3fc00000    # 1.5f

    .line 173
    .line 174
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v4, 0x3fd9999a    # 1.7f

    .line 178
    .line 179
    .line 180
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 181
    .line 182
    .line 183
    const v4, -0x40a66666    # -0.85f

    .line 184
    .line 185
    .line 186
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v4, 0x3fa66666    # 1.3f

    .line 190
    .line 191
    .line 192
    const/high16 v6, 0x3f400000    # 0.75f

    .line 193
    .line 194
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    const/high16 v4, 0x419c0000    # 19.5f

    .line 198
    .line 199
    const/high16 v6, 0x41100000    # 9.0f

    .line 200
    .line 201
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 202
    .line 203
    .line 204
    const v4, 0x3f59999a    # 0.85f

    .line 205
    .line 206
    .line 207
    const v6, 0x3fbc28f6    # 1.47f

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 211
    .line 212
    .line 213
    const v4, 0x3fa66666    # 1.3f

    .line 214
    .line 215
    .line 216
    const/high16 v6, -0x40c00000    # -0.75f

    .line 217
    .line 218
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 219
    .line 220
    .line 221
    const v4, -0x4043d70a    # -1.47f

    .line 222
    .line 223
    .line 224
    const v6, -0x40a66666    # -0.85f

    .line 225
    .line 226
    .line 227
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 228
    .line 229
    .line 230
    const/high16 v4, 0x41400000    # 12.0f

    .line 231
    .line 232
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const/high16 v4, -0x40400000    # -1.5f

    .line 236
    .line 237
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const v4, -0x40266666    # -1.7f

    .line 241
    .line 242
    .line 243
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 244
    .line 245
    .line 246
    const v4, -0x4043d70a    # -1.47f

    .line 247
    .line 248
    .line 249
    const v6, 0x3f59999a    # 0.85f

    .line 250
    .line 251
    .line 252
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 253
    .line 254
    .line 255
    const/high16 v4, -0x40c00000    # -0.75f

    .line 256
    .line 257
    const v6, -0x4059999a    # -1.3f

    .line 258
    .line 259
    .line 260
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/high16 v4, 0x41840000    # 16.5f

    .line 264
    .line 265
    const/high16 v6, 0x41100000    # 9.0f

    .line 266
    .line 267
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v4, 0x41707ae1    # 15.03f

    .line 271
    .line 272
    .line 273
    const v6, 0x41026666    # 8.15f

    .line 274
    .line 275
    .line 276
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 280
    .line 281
    .line 282
    const/high16 v4, 0x41000000    # 8.0f

    .line 283
    .line 284
    const/high16 v6, 0x41100000    # 9.0f

    .line 285
    .line 286
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 287
    .line 288
    .line 289
    const/high16 v25, 0x40400000    # 3.0f

    .line 290
    .line 291
    const/high16 v26, 0x40400000    # 3.0f

    .line 292
    .line 293
    const v21, 0x3fd33333    # 1.65f

    .line 294
    .line 295
    .line 296
    const/16 v22, 0x0

    .line 297
    .line 298
    const/high16 v23, 0x40400000    # 3.0f

    .line 299
    .line 300
    const v24, 0x3faccccd    # 1.35f

    .line 301
    .line 302
    .line 303
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 304
    .line 305
    .line 306
    const v4, -0x40533333    # -1.35f

    .line 307
    .line 308
    .line 309
    const/high16 v6, 0x40400000    # 3.0f

    .line 310
    .line 311
    const/high16 v7, -0x3fc00000    # -3.0f

    .line 312
    .line 313
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 314
    .line 315
    .line 316
    const/high16 v6, -0x3fc00000    # -3.0f

    .line 317
    .line 318
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 319
    .line 320
    .line 321
    const/high16 v4, 0x41000000    # 8.0f

    .line 322
    .line 323
    const/high16 v6, 0x41000000    # 8.0f

    .line 324
    .line 325
    const/high16 v7, 0x41100000    # 9.0f

    .line 326
    .line 327
    const v8, 0x40eb3333    # 7.35f

    .line 328
    .line 329
    .line 330
    invoke-virtual {v2, v8, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 331
    .line 332
    .line 333
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 337
    .line 338
    .line 339
    move-result-object v2

    .line 340
    const/16 v16, 0x3800

    .line 341
    .line 342
    const/16 v17, 0x0

    .line 343
    .line 344
    const v6, 0x3e99999a    # 0.3f

    .line 345
    .line 346
    .line 347
    const v8, 0x3e99999a    # 0.3f

    .line 348
    .line 349
    .line 350
    const/4 v7, 0x0

    .line 351
    const/high16 v9, 0x3f800000    # 1.0f

    .line 352
    .line 353
    const/high16 v12, 0x3f800000    # 1.0f

    .line 354
    .line 355
    const/4 v13, 0x0

    .line 356
    const/4 v14, 0x0

    .line 357
    const/4 v15, 0x0

    .line 358
    const-string v4, ""

    .line 359
    .line 360
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 361
    .line 362
    .line 363
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 364
    .line 365
    .line 366
    move-result v3

    .line 367
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 368
    .line 369
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 370
    .line 371
    .line 372
    move-result-wide v6

    .line 373
    const/4 v2, 0x0

    .line 374
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 375
    .line 376
    .line 377
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 378
    .line 379
    .line 380
    move-result v10

    .line 381
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 382
    .line 383
    .line 384
    move-result v11

    .line 385
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 388
    .line 389
    .line 390
    const/high16 v4, 0x41600000    # 14.0f

    .line 391
    .line 392
    const/high16 v6, 0x41100000    # 9.0f

    .line 393
    .line 394
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 395
    .line 396
    .line 397
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 398
    .line 399
    const v24, -0x40533333    # -1.35f

    .line 400
    .line 401
    .line 402
    move-object/from16 v20, v2

    .line 403
    .line 404
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 405
    .line 406
    .line 407
    const v4, -0x40533333    # -1.35f

    .line 408
    .line 409
    .line 410
    const/high16 v6, -0x3fc00000    # -3.0f

    .line 411
    .line 412
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 413
    .line 414
    .line 415
    const v4, 0x3faccccd    # 1.35f

    .line 416
    .line 417
    .line 418
    const/high16 v6, 0x40400000    # 3.0f

    .line 419
    .line 420
    const/high16 v7, -0x3fc00000    # -3.0f

    .line 421
    .line 422
    invoke-virtual {v2, v7, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 423
    .line 424
    .line 425
    const v4, 0x40eb3333    # 7.35f

    .line 426
    .line 427
    .line 428
    const/high16 v6, 0x41600000    # 14.0f

    .line 429
    .line 430
    const/high16 v7, 0x41100000    # 9.0f

    .line 431
    .line 432
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 433
    .line 434
    .line 435
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 436
    .line 437
    .line 438
    const/high16 v4, 0x41200000    # 10.0f

    .line 439
    .line 440
    const/high16 v6, 0x41100000    # 9.0f

    .line 441
    .line 442
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 443
    .line 444
    .line 445
    const/high16 v25, 0x3f800000    # 1.0f

    .line 446
    .line 447
    const/high16 v26, 0x3f800000    # 1.0f

    .line 448
    .line 449
    const v21, 0x3f0a3d71    # 0.54f

    .line 450
    .line 451
    .line 452
    const/high16 v23, 0x3f800000    # 1.0f

    .line 453
    .line 454
    const v24, 0x3eeb851f    # 0.46f

    .line 455
    .line 456
    .line 457
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 458
    .line 459
    .line 460
    const/high16 v4, 0x3f800000    # 1.0f

    .line 461
    .line 462
    const/high16 v6, 0x3f800000    # 1.0f

    .line 463
    .line 464
    const/high16 v7, -0x40800000    # -1.0f

    .line 465
    .line 466
    const v8, -0x41147ae1    # -0.46f

    .line 467
    .line 468
    .line 469
    invoke-virtual {v2, v8, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 470
    .line 471
    .line 472
    const v4, -0x41147ae1    # -0.46f

    .line 473
    .line 474
    .line 475
    const/high16 v6, -0x40800000    # -1.0f

    .line 476
    .line 477
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 478
    .line 479
    .line 480
    const/high16 v4, 0x41200000    # 10.0f

    .line 481
    .line 482
    const/high16 v6, 0x41200000    # 10.0f

    .line 483
    .line 484
    const/high16 v7, 0x41100000    # 9.0f

    .line 485
    .line 486
    const v8, 0x41075c29    # 8.46f

    .line 487
    .line 488
    .line 489
    invoke-virtual {v2, v8, v4, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 490
    .line 491
    .line 492
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 493
    .line 494
    .line 495
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 496
    .line 497
    .line 498
    move-result-object v2

    .line 499
    const/high16 v6, 0x3f800000    # 1.0f

    .line 500
    .line 501
    const/high16 v8, 0x3f800000    # 1.0f

    .line 502
    .line 503
    const/4 v7, 0x0

    .line 504
    const-string v4, ""

    .line 505
    .line 506
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 507
    .line 508
    .line 509
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 510
    .line 511
    .line 512
    move-result v3

    .line 513
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 514
    .line 515
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 516
    .line 517
    .line 518
    move-result-wide v6

    .line 519
    const/4 v2, 0x0

    .line 520
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 521
    .line 522
    .line 523
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 524
    .line 525
    .line 526
    move-result v10

    .line 527
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 528
    .line 529
    .line 530
    move-result v11

    .line 531
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 532
    .line 533
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 534
    .line 535
    .line 536
    const/high16 v4, 0x41b00000    # 22.0f

    .line 537
    .line 538
    const/high16 v6, 0x40400000    # 3.0f

    .line 539
    .line 540
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 541
    .line 542
    .line 543
    const/high16 v4, 0x40000000    # 2.0f

    .line 544
    .line 545
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 546
    .line 547
    .line 548
    const/16 v25, 0x0

    .line 549
    .line 550
    const/high16 v26, 0x40a00000    # 5.0f

    .line 551
    .line 552
    const v21, 0x3f666666    # 0.9f

    .line 553
    .line 554
    .line 555
    const/high16 v22, 0x40400000    # 3.0f

    .line 556
    .line 557
    const/16 v23, 0x0

    .line 558
    .line 559
    const v24, 0x4079999a    # 3.9f

    .line 560
    .line 561
    .line 562
    move-object/from16 v20, v2

    .line 563
    .line 564
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 565
    .line 566
    .line 567
    const/high16 v4, 0x41600000    # 14.0f

    .line 568
    .line 569
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 570
    .line 571
    .line 572
    const/high16 v25, 0x40000000    # 2.0f

    .line 573
    .line 574
    const/high16 v26, 0x40000000    # 2.0f

    .line 575
    .line 576
    const/16 v21, 0x0

    .line 577
    .line 578
    const v22, 0x3f8ccccd    # 1.1f

    .line 579
    .line 580
    .line 581
    const v23, 0x3f666666    # 0.9f

    .line 582
    .line 583
    .line 584
    const/high16 v24, 0x40000000    # 2.0f

    .line 585
    .line 586
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 587
    .line 588
    .line 589
    const/high16 v4, 0x41a00000    # 20.0f

    .line 590
    .line 591
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 592
    .line 593
    .line 594
    const v25, 0x3ffeb852    # 1.99f

    .line 595
    .line 596
    .line 597
    const/high16 v26, -0x40000000    # -2.0f

    .line 598
    .line 599
    const v21, 0x3f8ccccd    # 1.1f

    .line 600
    .line 601
    .line 602
    const/16 v22, 0x0

    .line 603
    .line 604
    const v23, 0x3ffeb852    # 1.99f

    .line 605
    .line 606
    .line 607
    const v24, -0x4099999a    # -0.9f

    .line 608
    .line 609
    .line 610
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 611
    .line 612
    .line 613
    const/high16 v4, 0x40a00000    # 5.0f

    .line 614
    .line 615
    const/high16 v6, 0x41c00000    # 24.0f

    .line 616
    .line 617
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 618
    .line 619
    .line 620
    const/high16 v25, 0x41b00000    # 22.0f

    .line 621
    .line 622
    const/high16 v26, 0x40400000    # 3.0f

    .line 623
    .line 624
    const/high16 v21, 0x41c00000    # 24.0f

    .line 625
    .line 626
    const v22, 0x4079999a    # 3.9f

    .line 627
    .line 628
    .line 629
    const v23, 0x41b8cccd    # 23.1f

    .line 630
    .line 631
    .line 632
    const/high16 v24, 0x40400000    # 3.0f

    .line 633
    .line 634
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 635
    .line 636
    .line 637
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 638
    .line 639
    .line 640
    const v4, 0x409147ae    # 4.54f

    .line 641
    .line 642
    .line 643
    const/high16 v6, 0x41980000    # 19.0f

    .line 644
    .line 645
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    const v25, 0x408eb852    # 4.46f

    .line 649
    .line 650
    .line 651
    const/high16 v26, -0x40000000    # -2.0f

    .line 652
    .line 653
    const v21, 0x3f8ccccd    # 1.1f

    .line 654
    .line 655
    .line 656
    const v22, -0x4063d70a    # -1.22f

    .line 657
    .line 658
    .line 659
    const v23, 0x402c28f6    # 2.69f

    .line 660
    .line 661
    .line 662
    const/high16 v24, -0x40000000    # -2.0f

    .line 663
    .line 664
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 665
    .line 666
    .line 667
    const v4, 0x3f47ae14    # 0.78f

    .line 668
    .line 669
    .line 670
    const v6, 0x408eb852    # 4.46f

    .line 671
    .line 672
    .line 673
    const/high16 v7, 0x40000000    # 2.0f

    .line 674
    .line 675
    const v8, 0x40570a3d    # 3.36f

    .line 676
    .line 677
    .line 678
    invoke-virtual {v2, v8, v4, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 679
    .line 680
    .line 681
    const v4, 0x409147ae    # 4.54f

    .line 682
    .line 683
    .line 684
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 685
    .line 686
    .line 687
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 688
    .line 689
    .line 690
    const/high16 v4, 0x41b00000    # 22.0f

    .line 691
    .line 692
    const/high16 v6, 0x41980000    # 19.0f

    .line 693
    .line 694
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 695
    .line 696
    .line 697
    const v4, -0x3f3d70a4    # -6.08f

    .line 698
    .line 699
    .line 700
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 701
    .line 702
    .line 703
    const v25, -0x3f228f5c    # -6.92f

    .line 704
    .line 705
    .line 706
    const/high16 v26, -0x3f800000    # -4.0f

    .line 707
    .line 708
    const v21, -0x404f5c29    # -1.38f

    .line 709
    .line 710
    .line 711
    const v22, -0x3fe70a3d    # -2.39f

    .line 712
    .line 713
    .line 714
    const v23, -0x3f828f5c    # -3.96f

    .line 715
    .line 716
    .line 717
    const/high16 v24, -0x3f800000    # -4.0f

    .line 718
    .line 719
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 720
    .line 721
    .line 722
    const v4, -0x3f228f5c    # -6.92f

    .line 723
    .line 724
    .line 725
    const/high16 v6, 0x40800000    # 4.0f

    .line 726
    .line 727
    const v7, -0x3f4eb852    # -5.54f

    .line 728
    .line 729
    .line 730
    const v8, 0x3fce147b    # 1.61f

    .line 731
    .line 732
    .line 733
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 734
    .line 735
    .line 736
    const/high16 v4, 0x40000000    # 2.0f

    .line 737
    .line 738
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 739
    .line 740
    .line 741
    const/high16 v4, 0x40a00000    # 5.0f

    .line 742
    .line 743
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 744
    .line 745
    .line 746
    const/high16 v4, 0x41a00000    # 20.0f

    .line 747
    .line 748
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 749
    .line 750
    .line 751
    const/high16 v4, 0x41980000    # 19.0f

    .line 752
    .line 753
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 754
    .line 755
    .line 756
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 757
    .line 758
    .line 759
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 760
    .line 761
    .line 762
    move-result-object v2

    .line 763
    const/high16 v6, 0x3f800000    # 1.0f

    .line 764
    .line 765
    const/high16 v8, 0x3f800000    # 1.0f

    .line 766
    .line 767
    const/4 v7, 0x0

    .line 768
    const-string v4, ""

    .line 769
    .line 770
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 771
    .line 772
    .line 773
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 774
    .line 775
    .line 776
    move-result v3

    .line 777
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 778
    .line 779
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 780
    .line 781
    .line 782
    move-result-wide v6

    .line 783
    const/4 v0, 0x0

    .line 784
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 785
    .line 786
    .line 787
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 788
    .line 789
    .line 790
    move-result v10

    .line 791
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 792
    .line 793
    .line 794
    move-result v11

    .line 795
    new-instance v0, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 796
    .line 797
    invoke-direct {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 798
    .line 799
    .line 800
    const v2, 0x417c7ae1    # 15.78f

    .line 801
    .line 802
    .line 803
    const v4, 0x41326666    # 11.15f

    .line 804
    .line 805
    .line 806
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 807
    .line 808
    .line 809
    const v2, -0x40a66666    # -0.85f

    .line 810
    .line 811
    .line 812
    const v4, 0x3fbc28f6    # 1.47f

    .line 813
    .line 814
    .line 815
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 816
    .line 817
    .line 818
    const v2, 0x3fd9999a    # 1.7f

    .line 819
    .line 820
    .line 821
    const/4 v4, 0x0

    .line 822
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 823
    .line 824
    .line 825
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 826
    .line 827
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 828
    .line 829
    .line 830
    const v2, -0x40266666    # -1.7f

    .line 831
    .line 832
    .line 833
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 834
    .line 835
    .line 836
    const v2, 0x3f59999a    # 0.85f

    .line 837
    .line 838
    .line 839
    const v4, 0x3fbc28f6    # 1.47f

    .line 840
    .line 841
    .line 842
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 843
    .line 844
    .line 845
    const/high16 v2, 0x3f400000    # 0.75f

    .line 846
    .line 847
    const v4, -0x4059999a    # -1.3f

    .line 848
    .line 849
    .line 850
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 851
    .line 852
    .line 853
    const v2, -0x4043d70a    # -1.47f

    .line 854
    .line 855
    .line 856
    const v4, -0x40a66666    # -0.85f

    .line 857
    .line 858
    .line 859
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 860
    .line 861
    .line 862
    const v2, -0x40a66666    # -0.85f

    .line 863
    .line 864
    .line 865
    const v4, 0x3fbc28f6    # 1.47f

    .line 866
    .line 867
    .line 868
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 869
    .line 870
    .line 871
    const/high16 v2, -0x40c00000    # -0.75f

    .line 872
    .line 873
    const v4, -0x4059999a    # -1.3f

    .line 874
    .line 875
    .line 876
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 877
    .line 878
    .line 879
    const v2, -0x4043d70a    # -1.47f

    .line 880
    .line 881
    .line 882
    const v4, 0x3f59999a    # 0.85f

    .line 883
    .line 884
    .line 885
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 886
    .line 887
    .line 888
    const v2, -0x40266666    # -1.7f

    .line 889
    .line 890
    .line 891
    const/4 v4, 0x0

    .line 892
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 893
    .line 894
    .line 895
    const/high16 v2, -0x40400000    # -1.5f

    .line 896
    .line 897
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 898
    .line 899
    .line 900
    const v2, 0x3fd9999a    # 1.7f

    .line 901
    .line 902
    .line 903
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 904
    .line 905
    .line 906
    const v2, -0x4043d70a    # -1.47f

    .line 907
    .line 908
    .line 909
    const v4, -0x40a66666    # -0.85f

    .line 910
    .line 911
    .line 912
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 913
    .line 914
    .line 915
    const v2, 0x3fa66666    # 1.3f

    .line 916
    .line 917
    .line 918
    const/high16 v4, -0x40c00000    # -0.75f

    .line 919
    .line 920
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 921
    .line 922
    .line 923
    const v2, 0x3f59999a    # 0.85f

    .line 924
    .line 925
    .line 926
    const v4, 0x3fbc28f6    # 1.47f

    .line 927
    .line 928
    .line 929
    invoke-virtual {v0, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 930
    .line 931
    .line 932
    const v2, -0x4043d70a    # -1.47f

    .line 933
    .line 934
    .line 935
    const v4, 0x3f59999a    # 0.85f

    .line 936
    .line 937
    .line 938
    invoke-virtual {v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 939
    .line 940
    .line 941
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 942
    .line 943
    .line 944
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 945
    .line 946
    .line 947
    move-result-object v2

    .line 948
    const/high16 v6, 0x3f800000    # 1.0f

    .line 949
    .line 950
    const/4 v7, 0x0

    .line 951
    const-string v4, ""

    .line 952
    .line 953
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 954
    .line 955
    .line 956
    move-result-object v0

    .line 957
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 958
    .line 959
    .line 960
    move-result-object v0

    .line 961
    sput-object v0, Landroidx/compose/material/icons/twotone/ContactEmergencyKt;->_contactEmergency:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 962
    .line 963
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 964
    .line 965
    .line 966
    return-object v0
.end method
