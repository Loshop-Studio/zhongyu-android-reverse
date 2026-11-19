.class public final Landroidx/compose/material/icons/twotone/MenuBookKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u001e\u0010\u0002\u001a\u00020\u0001*\u00020\u00038FX\u0087\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "_menuBook",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "MenuBook",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getMenuBook$annotations",
        "(Landroidx/compose/material/icons/Icons$TwoTone;)V",
        "getMenuBook",
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
        "SMAP\nMenuBook.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuBook.kt\nandroidx/compose/material/icons/twotone/MenuBookKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,116:1\n212#2,12:117\n233#2,18:130\n253#2:167\n233#2,18:168\n253#2:205\n233#2,18:206\n253#2:243\n233#2,18:244\n253#2:281\n233#2,18:282\n253#2:319\n174#3:129\n705#4,2:148\n717#4,2:150\n719#4,11:156\n705#4,2:186\n717#4,2:188\n719#4,11:194\n705#4,2:224\n717#4,2:226\n719#4,11:232\n705#4,2:262\n717#4,2:264\n719#4,11:270\n705#4,2:300\n717#4,2:302\n719#4,11:308\n72#5,4:152\n72#5,4:190\n72#5,4:228\n72#5,4:266\n72#5,4:304\n*S KotlinDebug\n*F\n+ 1 MenuBook.kt\nandroidx/compose/material/icons/twotone/MenuBookKt\n*L\n35#1:117,12\n36#1:130,18\n36#1:167\n71#1:168,18\n71#1:205\n81#1:206,18\n81#1:243\n91#1:244,18\n91#1:281\n101#1:282,18\n101#1:319\n35#1:129\n36#1:148,2\n36#1:150,2\n36#1:156,11\n71#1:186,2\n71#1:188,2\n71#1:194,11\n81#1:224,2\n81#1:226,2\n81#1:232,11\n91#1:262,2\n91#1:264,2\n91#1:270,11\n101#1:300,2\n101#1:302,2\n101#1:308,11\n36#1:152,4\n71#1:190,4\n81#1:228,4\n91#1:266,4\n101#1:304,4\n*E\n"
    }
.end annotation


# static fields
.field private static _menuBook:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getMenuBook(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 27

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/MenuBookKt;->_menuBook:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.MenuBook"

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
    const/high16 v4, 0x40c00000    # 6.0f

    .line 291
    .line 292
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v25, 0x41a80000    # 21.0f

    .line 296
    .line 297
    const/high16 v26, 0x40a00000    # 5.0f

    .line 298
    .line 299
    const v21, 0x41b33333    # 22.4f

    .line 300
    .line 301
    .line 302
    const v22, 0x40b1999a    # 5.55f

    .line 303
    .line 304
    .line 305
    const/high16 v23, 0x41ae0000    # 21.75f

    .line 306
    .line 307
    const/high16 v24, 0x40a80000    # 5.25f

    .line 308
    .line 309
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    const/high16 v4, 0x40400000    # 3.0f

    .line 316
    .line 317
    const/high16 v6, 0x41940000    # 18.5f

    .line 318
    .line 319
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const/high16 v4, 0x40e00000    # 7.0f

    .line 323
    .line 324
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const/high16 v25, 0x40600000    # 3.5f

    .line 328
    .line 329
    const/high16 v26, -0x41000000    # -0.5f

    .line 330
    .line 331
    const v21, 0x3f8ccccd    # 1.1f

    .line 332
    .line 333
    .line 334
    const v22, -0x414ccccd    # -0.35f

    .line 335
    .line 336
    .line 337
    const v23, 0x40133333    # 2.3f

    .line 338
    .line 339
    .line 340
    const/high16 v24, -0x41000000    # -0.5f

    .line 341
    .line 342
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const/high16 v25, 0x40900000    # 4.5f

    .line 346
    .line 347
    const v26, 0x3f7d70a4    # 0.99f

    .line 348
    .line 349
    .line 350
    const v21, 0x3fab851f    # 1.34f

    .line 351
    .line 352
    .line 353
    const/16 v22, 0x0

    .line 354
    .line 355
    const v23, 0x404851ec    # 3.13f

    .line 356
    .line 357
    .line 358
    const v24, 0x3ed1eb85    # 0.41f

    .line 359
    .line 360
    .line 361
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 362
    .line 363
    .line 364
    const/high16 v4, 0x41380000    # 11.5f

    .line 365
    .line 366
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 367
    .line 368
    .line 369
    const/high16 v25, 0x40d00000    # 6.5f

    .line 370
    .line 371
    const/high16 v26, 0x41900000    # 18.0f

    .line 372
    .line 373
    const v21, 0x411a147b    # 9.63f

    .line 374
    .line 375
    .line 376
    const v22, 0x419347ae    # 18.41f

    .line 377
    .line 378
    .line 379
    const v23, 0x40fae148    # 7.84f

    .line 380
    .line 381
    .line 382
    const/high16 v24, 0x41900000    # 18.0f

    .line 383
    .line 384
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 385
    .line 386
    .line 387
    const/high16 v25, 0x40400000    # 3.0f

    .line 388
    .line 389
    const/high16 v26, 0x41940000    # 18.5f

    .line 390
    .line 391
    const v21, 0x40a9999a    # 5.3f

    .line 392
    .line 393
    .line 394
    const/high16 v22, 0x41900000    # 18.0f

    .line 395
    .line 396
    const v23, 0x40833333    # 4.1f

    .line 397
    .line 398
    .line 399
    const v24, 0x41913333    # 18.15f

    .line 400
    .line 401
    .line 402
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 406
    .line 407
    .line 408
    const/high16 v4, 0x41a80000    # 21.0f

    .line 409
    .line 410
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 411
    .line 412
    .line 413
    const/high16 v25, -0x3fa00000    # -3.5f

    .line 414
    .line 415
    const/high16 v26, -0x41000000    # -0.5f

    .line 416
    .line 417
    const v21, -0x40733333    # -1.1f

    .line 418
    .line 419
    .line 420
    const v22, -0x414ccccd    # -0.35f

    .line 421
    .line 422
    .line 423
    const v23, -0x3feccccd    # -2.3f

    .line 424
    .line 425
    .line 426
    const/high16 v24, -0x41000000    # -0.5f

    .line 427
    .line 428
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 429
    .line 430
    .line 431
    const/high16 v25, -0x3f700000    # -4.5f

    .line 432
    .line 433
    const v26, 0x3f7d70a4    # 0.99f

    .line 434
    .line 435
    .line 436
    const v21, -0x40547ae1    # -1.34f

    .line 437
    .line 438
    .line 439
    const/16 v22, 0x0

    .line 440
    .line 441
    const v23, -0x3fb7ae14    # -3.13f

    .line 442
    .line 443
    .line 444
    const v24, 0x3ed1eb85    # 0.41f

    .line 445
    .line 446
    .line 447
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 448
    .line 449
    .line 450
    const v4, 0x40efae14    # 7.49f

    .line 451
    .line 452
    .line 453
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 454
    .line 455
    .line 456
    const/high16 v25, 0x40900000    # 4.5f

    .line 457
    .line 458
    const v26, -0x40828f5c    # -0.99f

    .line 459
    .line 460
    .line 461
    const v21, 0x3faf5c29    # 1.37f

    .line 462
    .line 463
    .line 464
    const v22, -0x40e8f5c3    # -0.59f

    .line 465
    .line 466
    .line 467
    const v23, 0x404a3d71    # 3.16f

    .line 468
    .line 469
    .line 470
    const v24, -0x40828f5c    # -0.99f

    .line 471
    .line 472
    .line 473
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 474
    .line 475
    .line 476
    const/high16 v25, 0x40600000    # 3.5f

    .line 477
    .line 478
    const/high16 v26, 0x3f000000    # 0.5f

    .line 479
    .line 480
    const v21, 0x3f99999a    # 1.2f

    .line 481
    .line 482
    .line 483
    const/16 v22, 0x0

    .line 484
    .line 485
    const v23, 0x4019999a    # 2.4f

    .line 486
    .line 487
    .line 488
    const v24, 0x3e19999a    # 0.15f

    .line 489
    .line 490
    .line 491
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 492
    .line 493
    .line 494
    const/high16 v4, 0x41940000    # 18.5f

    .line 495
    .line 496
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 497
    .line 498
    .line 499
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 500
    .line 501
    .line 502
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 503
    .line 504
    .line 505
    move-result-object v2

    .line 506
    const/16 v16, 0x3800

    .line 507
    .line 508
    const/16 v17, 0x0

    .line 509
    .line 510
    const/high16 v6, 0x3f800000    # 1.0f

    .line 511
    .line 512
    const/high16 v8, 0x3f800000    # 1.0f

    .line 513
    .line 514
    const/4 v7, 0x0

    .line 515
    const/high16 v9, 0x3f800000    # 1.0f

    .line 516
    .line 517
    const/high16 v12, 0x3f800000    # 1.0f

    .line 518
    .line 519
    const/4 v13, 0x0

    .line 520
    const/4 v14, 0x0

    .line 521
    const/4 v15, 0x0

    .line 522
    const-string v4, ""

    .line 523
    .line 524
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 525
    .line 526
    .line 527
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 528
    .line 529
    .line 530
    move-result v3

    .line 531
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 532
    .line 533
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 534
    .line 535
    .line 536
    move-result-wide v6

    .line 537
    const/4 v2, 0x0

    .line 538
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 539
    .line 540
    .line 541
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 542
    .line 543
    .line 544
    move-result v10

    .line 545
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 546
    .line 547
    .line 548
    move-result v11

    .line 549
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 550
    .line 551
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 552
    .line 553
    .line 554
    const/high16 v4, 0x41300000    # 11.0f

    .line 555
    .line 556
    const v6, 0x40efae14    # 7.49f

    .line 557
    .line 558
    .line 559
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 560
    .line 561
    .line 562
    const/high16 v25, 0x40d00000    # 6.5f

    .line 563
    .line 564
    const/high16 v26, 0x40d00000    # 6.5f

    .line 565
    .line 566
    const v21, 0x411a147b    # 9.63f

    .line 567
    .line 568
    .line 569
    const v22, 0x40dd1eb8    # 6.91f

    .line 570
    .line 571
    .line 572
    const v23, 0x40fae148    # 7.84f

    .line 573
    .line 574
    .line 575
    const/high16 v24, 0x40d00000    # 6.5f

    .line 576
    .line 577
    move-object/from16 v20, v2

    .line 578
    .line 579
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    .line 582
    const/high16 v25, 0x40400000    # 3.0f

    .line 583
    .line 584
    const/high16 v26, 0x40e00000    # 7.0f

    .line 585
    .line 586
    const v21, 0x40a9999a    # 5.3f

    .line 587
    .line 588
    .line 589
    const/high16 v22, 0x40d00000    # 6.5f

    .line 590
    .line 591
    const v23, 0x40833333    # 4.1f

    .line 592
    .line 593
    .line 594
    const v24, 0x40d4cccd    # 6.65f

    .line 595
    .line 596
    .line 597
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 598
    .line 599
    .line 600
    const/high16 v4, 0x41380000    # 11.5f

    .line 601
    .line 602
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 603
    .line 604
    .line 605
    const/high16 v25, 0x40d00000    # 6.5f

    .line 606
    .line 607
    const/high16 v26, 0x41900000    # 18.0f

    .line 608
    .line 609
    const v21, 0x40833333    # 4.1f

    .line 610
    .line 611
    .line 612
    const v22, 0x41913333    # 18.15f

    .line 613
    .line 614
    .line 615
    const v23, 0x40a9999a    # 5.3f

    .line 616
    .line 617
    .line 618
    const/high16 v24, 0x41900000    # 18.0f

    .line 619
    .line 620
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 621
    .line 622
    .line 623
    const/high16 v25, 0x40900000    # 4.5f

    .line 624
    .line 625
    const v26, 0x3f7d70a4    # 0.99f

    .line 626
    .line 627
    .line 628
    const v21, 0x3fab851f    # 1.34f

    .line 629
    .line 630
    .line 631
    const/16 v22, 0x0

    .line 632
    .line 633
    const v23, 0x404851ec    # 3.13f

    .line 634
    .line 635
    .line 636
    const v24, 0x3ed1eb85    # 0.41f

    .line 637
    .line 638
    .line 639
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 640
    .line 641
    .line 642
    const v4, 0x40efae14    # 7.49f

    .line 643
    .line 644
    .line 645
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 646
    .line 647
    .line 648
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 649
    .line 650
    .line 651
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 652
    .line 653
    .line 654
    move-result-object v2

    .line 655
    const v6, 0x3e99999a    # 0.3f

    .line 656
    .line 657
    .line 658
    const v8, 0x3e99999a    # 0.3f

    .line 659
    .line 660
    .line 661
    const/4 v7, 0x0

    .line 662
    const-string v4, ""

    .line 663
    .line 664
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 665
    .line 666
    .line 667
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 668
    .line 669
    .line 670
    move-result v3

    .line 671
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 672
    .line 673
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 674
    .line 675
    .line 676
    move-result-wide v6

    .line 677
    const/4 v2, 0x0

    .line 678
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 679
    .line 680
    .line 681
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 682
    .line 683
    .line 684
    move-result v10

    .line 685
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 686
    .line 687
    .line 688
    move-result v11

    .line 689
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 690
    .line 691
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 692
    .line 693
    .line 694
    const/high16 v4, 0x41280000    # 10.5f

    .line 695
    .line 696
    const/high16 v6, 0x418c0000    # 17.5f

    .line 697
    .line 698
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 699
    .line 700
    .line 701
    const/high16 v25, 0x40200000    # 2.5f

    .line 702
    .line 703
    const v26, 0x3e851eb8    # 0.26f

    .line 704
    .line 705
    .line 706
    const v21, 0x3f6147ae    # 0.88f

    .line 707
    .line 708
    .line 709
    const v23, 0x3fdd70a4    # 1.73f

    .line 710
    .line 711
    .line 712
    const v24, 0x3db851ec    # 0.09f

    .line 713
    .line 714
    .line 715
    move-object/from16 v20, v2

    .line 716
    .line 717
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 718
    .line 719
    .line 720
    const v4, 0x4113d70a    # 9.24f

    .line 721
    .line 722
    .line 723
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 724
    .line 725
    .line 726
    const/high16 v25, 0x418c0000    # 17.5f

    .line 727
    .line 728
    const/high16 v26, 0x41100000    # 9.0f

    .line 729
    .line 730
    const v21, 0x4199ae14    # 19.21f

    .line 731
    .line 732
    .line 733
    const v22, 0x411170a4    # 9.09f

    .line 734
    .line 735
    .line 736
    const v23, 0x4192e148    # 18.36f

    .line 737
    .line 738
    .line 739
    const/high16 v24, 0x41100000    # 9.0f

    .line 740
    .line 741
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 742
    .line 743
    .line 744
    const/high16 v25, -0x3fa00000    # -3.5f

    .line 745
    .line 746
    const v26, 0x3ef0a3d7    # 0.47f

    .line 747
    .line 748
    .line 749
    const v21, -0x405c28f6    # -1.28f

    .line 750
    .line 751
    .line 752
    const/16 v22, 0x0

    .line 753
    .line 754
    const v23, -0x3fe28f5c    # -2.46f

    .line 755
    .line 756
    .line 757
    const v24, 0x3e23d70a    # 0.16f

    .line 758
    .line 759
    .line 760
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 761
    .line 762
    .line 763
    const v4, 0x3fc8f5c3    # 1.57f

    .line 764
    .line 765
    .line 766
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 767
    .line 768
    .line 769
    const/high16 v25, 0x418c0000    # 17.5f

    .line 770
    .line 771
    const/high16 v26, 0x41280000    # 10.5f

    .line 772
    .line 773
    const v21, 0x416fd70a    # 14.99f

    .line 774
    .line 775
    .line 776
    const v22, 0x412b0a3d    # 10.69f

    .line 777
    .line 778
    .line 779
    const v23, 0x418170a4    # 16.18f

    .line 780
    .line 781
    .line 782
    const/high16 v24, 0x41280000    # 10.5f

    .line 783
    .line 784
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 785
    .line 786
    .line 787
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 788
    .line 789
    .line 790
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 791
    .line 792
    .line 793
    move-result-object v2

    .line 794
    const/high16 v6, 0x3f800000    # 1.0f

    .line 795
    .line 796
    const/high16 v8, 0x3f800000    # 1.0f

    .line 797
    .line 798
    const/4 v7, 0x0

    .line 799
    const-string v4, ""

    .line 800
    .line 801
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 802
    .line 803
    .line 804
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 805
    .line 806
    .line 807
    move-result v3

    .line 808
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 809
    .line 810
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 811
    .line 812
    .line 813
    move-result-wide v6

    .line 814
    const/4 v2, 0x0

    .line 815
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 816
    .line 817
    .line 818
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 819
    .line 820
    .line 821
    move-result v10

    .line 822
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 823
    .line 824
    .line 825
    move-result v11

    .line 826
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 827
    .line 828
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 829
    .line 830
    .line 831
    const v4, 0x41528f5c    # 13.16f

    .line 832
    .line 833
    .line 834
    const/high16 v6, 0x418c0000    # 17.5f

    .line 835
    .line 836
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 837
    .line 838
    .line 839
    const/high16 v25, 0x40200000    # 2.5f

    .line 840
    .line 841
    const v26, 0x3e851eb8    # 0.26f

    .line 842
    .line 843
    .line 844
    const v21, 0x3f6147ae    # 0.88f

    .line 845
    .line 846
    .line 847
    const/16 v22, 0x0

    .line 848
    .line 849
    const v23, 0x3fdd70a4    # 1.73f

    .line 850
    .line 851
    .line 852
    const v24, 0x3db851ec    # 0.09f

    .line 853
    .line 854
    .line 855
    move-object/from16 v20, v2

    .line 856
    .line 857
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 858
    .line 859
    .line 860
    const v4, 0x413e6666    # 11.9f

    .line 861
    .line 862
    .line 863
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 864
    .line 865
    .line 866
    const/high16 v25, -0x3fe00000    # -2.5f

    .line 867
    .line 868
    const v26, -0x418a3d71    # -0.24f

    .line 869
    .line 870
    .line 871
    const v21, -0x40b5c28f    # -0.79f

    .line 872
    .line 873
    .line 874
    const v22, -0x41e66666    # -0.15f

    .line 875
    .line 876
    .line 877
    const v23, -0x402e147b    # -1.64f

    .line 878
    .line 879
    .line 880
    const v24, -0x418a3d71    # -0.24f

    .line 881
    .line 882
    .line 883
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 884
    .line 885
    .line 886
    const/high16 v25, -0x3fa00000    # -3.5f

    .line 887
    .line 888
    const v26, 0x3ef0a3d7    # 0.47f

    .line 889
    .line 890
    .line 891
    const v21, -0x405c28f6    # -1.28f

    .line 892
    .line 893
    .line 894
    const/16 v22, 0x0

    .line 895
    .line 896
    const v23, -0x3fe28f5c    # -2.46f

    .line 897
    .line 898
    .line 899
    const v24, 0x3e23d70a    # 0.16f

    .line 900
    .line 901
    .line 902
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 903
    .line 904
    .line 905
    const v4, 0x3fc8f5c3    # 1.57f

    .line 906
    .line 907
    .line 908
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 909
    .line 910
    .line 911
    const/high16 v25, 0x418c0000    # 17.5f

    .line 912
    .line 913
    const v26, 0x41528f5c    # 13.16f

    .line 914
    .line 915
    .line 916
    const v21, 0x416fd70a    # 14.99f

    .line 917
    .line 918
    .line 919
    const v22, 0x4155c28f    # 13.36f

    .line 920
    .line 921
    .line 922
    const v23, 0x418170a4    # 16.18f

    .line 923
    .line 924
    .line 925
    const v24, 0x41528f5c    # 13.16f

    .line 926
    .line 927
    .line 928
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 929
    .line 930
    .line 931
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 932
    .line 933
    .line 934
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 935
    .line 936
    .line 937
    move-result-object v2

    .line 938
    const/high16 v6, 0x3f800000    # 1.0f

    .line 939
    .line 940
    const/4 v7, 0x0

    .line 941
    const-string v4, ""

    .line 942
    .line 943
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 944
    .line 945
    .line 946
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 947
    .line 948
    .line 949
    move-result v3

    .line 950
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 951
    .line 952
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 953
    .line 954
    .line 955
    move-result-wide v6

    .line 956
    const/4 v0, 0x0

    .line 957
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 958
    .line 959
    .line 960
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 961
    .line 962
    .line 963
    move-result v10

    .line 964
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 965
    .line 966
    .line 967
    move-result v11

    .line 968
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 969
    .line 970
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 971
    .line 972
    .line 973
    const v0, 0x417d47ae    # 15.83f

    .line 974
    .line 975
    .line 976
    const/high16 v2, 0x418c0000    # 17.5f

    .line 977
    .line 978
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 979
    .line 980
    .line 981
    const/high16 v17, 0x40200000    # 2.5f

    .line 982
    .line 983
    const v18, 0x3e851eb8    # 0.26f

    .line 984
    .line 985
    .line 986
    const v13, 0x3f6147ae    # 0.88f

    .line 987
    .line 988
    .line 989
    const v15, 0x3fdd70a4    # 1.73f

    .line 990
    .line 991
    .line 992
    const v16, 0x3db851ec    # 0.09f

    .line 993
    .line 994
    .line 995
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 996
    .line 997
    .line 998
    const v0, -0x403d70a4    # -1.52f

    .line 999
    .line 1000
    .line 1001
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1002
    .line 1003
    .line 1004
    const/high16 v17, -0x3fe00000    # -2.5f

    .line 1005
    .line 1006
    const v18, -0x418a3d71    # -0.24f

    .line 1007
    .line 1008
    .line 1009
    const v13, -0x40b5c28f    # -0.79f

    .line 1010
    .line 1011
    .line 1012
    const v14, -0x41e66666    # -0.15f

    .line 1013
    .line 1014
    .line 1015
    const v15, -0x402e147b    # -1.64f

    .line 1016
    .line 1017
    .line 1018
    const v16, -0x418a3d71    # -0.24f

    .line 1019
    .line 1020
    .line 1021
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1022
    .line 1023
    .line 1024
    const/high16 v17, -0x3fa00000    # -3.5f

    .line 1025
    .line 1026
    const v18, 0x3ef0a3d7    # 0.47f

    .line 1027
    .line 1028
    .line 1029
    const v13, -0x405c28f6    # -1.28f

    .line 1030
    .line 1031
    .line 1032
    const/4 v14, 0x0

    .line 1033
    const v15, -0x3fe28f5c    # -2.46f

    .line 1034
    .line 1035
    .line 1036
    const v16, 0x3e23d70a    # 0.16f

    .line 1037
    .line 1038
    .line 1039
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1040
    .line 1041
    .line 1042
    const v0, 0x3fc8f5c3    # 1.57f

    .line 1043
    .line 1044
    .line 1045
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1046
    .line 1047
    .line 1048
    const/high16 v17, 0x418c0000    # 17.5f

    .line 1049
    .line 1050
    const v18, 0x417d47ae    # 15.83f

    .line 1051
    .line 1052
    .line 1053
    const v13, 0x416fd70a    # 14.99f

    .line 1054
    .line 1055
    .line 1056
    const v14, 0x418028f6    # 16.02f

    .line 1057
    .line 1058
    .line 1059
    const v15, 0x418170a4    # 16.18f

    .line 1060
    .line 1061
    .line 1062
    const v16, 0x417d47ae    # 15.83f

    .line 1063
    .line 1064
    .line 1065
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1066
    .line 1067
    .line 1068
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1069
    .line 1070
    .line 1071
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v2

    .line 1075
    const/16 v16, 0x3800

    .line 1076
    .line 1077
    const/16 v17, 0x0

    .line 1078
    .line 1079
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1080
    .line 1081
    const/4 v7, 0x0

    .line 1082
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1083
    .line 1084
    const/4 v13, 0x0

    .line 1085
    const/4 v14, 0x0

    .line 1086
    const/4 v15, 0x0

    .line 1087
    const-string v4, ""

    .line 1088
    .line 1089
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v0

    .line 1093
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v0

    .line 1097
    sput-object v0, Landroidx/compose/material/icons/twotone/MenuBookKt;->_menuBook:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1098
    .line 1099
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1100
    .line 1101
    .line 1102
    return-object v0
.end method

.method public static synthetic getMenuBook$annotations(Landroidx/compose/material/icons/Icons$TwoTone;)V
    .locals 0
    .annotation runtime Lkotlin/Deprecated;
        message = "Use the AutoMirrored version at Icons.AutoMirrored.TwoTone.MenuBook"
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "Icons.AutoMirrored.TwoTone.MenuBook"
            imports = {
                "androidx.compose.material.icons.automirrored.twotone.MenuBook"
            }
        .end subannotation
    .end annotation

    return-void
.end method
