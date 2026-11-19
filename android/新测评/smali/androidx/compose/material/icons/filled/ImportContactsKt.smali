.class public final Landroidx/compose/material/icons/filled/ImportContactsKt;
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
        "Landroidx/compose/material/icons/Icons$Filled;",
        "getImportContacts",
        "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nImportContacts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImportContacts.kt\nandroidx/compose/material/icons/filled/ImportContactsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,59:1\n212#2,12:60\n233#2,18:73\n253#2:110\n174#3:72\n705#4,2:91\n717#4,2:93\n719#4,11:99\n72#5,4:95\n*S KotlinDebug\n*F\n+ 1 ImportContacts.kt\nandroidx/compose/material/icons/filled/ImportContactsKt\n*L\n29#1:60,12\n30#1:73,18\n30#1:110\n29#1:72\n30#1:91,2\n30#1:93,2\n30#1:99,11\n30#1:95,4\n*E\n"
    }
.end annotation


# static fields
.field private static _importContacts:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getImportContacts(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/filled/ImportContactsKt;->_importContacts:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Filled.ImportContacts"

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
    const/high16 v0, 0x418c0000    # 17.5f

    .line 71
    .line 72
    const/high16 v2, 0x40900000    # 4.5f

    .line 73
    .line 74
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, -0x3f500000    # -5.5f

    .line 78
    .line 79
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 80
    .line 81
    const v13, -0x40066666    # -1.95f

    .line 82
    .line 83
    .line 84
    const/4 v14, 0x0

    .line 85
    const v15, -0x3f7e6666    # -4.05f

    .line 86
    .line 87
    .line 88
    const v16, 0x3ecccccd    # 0.4f

    .line 89
    .line 90
    .line 91
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const/high16 v18, -0x40400000    # -1.5f

    .line 95
    .line 96
    const v13, -0x40466666    # -1.45f

    .line 97
    .line 98
    .line 99
    const v14, -0x40733333    # -1.1f

    .line 100
    .line 101
    .line 102
    const v15, -0x3f9ccccd    # -3.55f

    .line 103
    .line 104
    .line 105
    const/high16 v16, -0x40400000    # -1.5f

    .line 106
    .line 107
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 108
    .line 109
    .line 110
    const v0, 0x409ccccd    # 4.9f

    .line 111
    .line 112
    .line 113
    const/high16 v2, 0x3f800000    # 1.0f

    .line 114
    .line 115
    const/high16 v4, 0x40c00000    # 6.0f

    .line 116
    .line 117
    const v6, 0x401ccccd    # 2.45f

    .line 118
    .line 119
    .line 120
    invoke-virtual {v12, v6, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 121
    .line 122
    .line 123
    const v0, 0x416a6666    # 14.65f

    .line 124
    .line 125
    .line 126
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 127
    .line 128
    .line 129
    const/high16 v17, 0x3f400000    # 0.75f

    .line 130
    .line 131
    const v18, 0x3ee66666    # 0.45f

    .line 132
    .line 133
    .line 134
    const/4 v13, 0x0

    .line 135
    const v14, 0x3f266666    # 0.65f

    .line 136
    .line 137
    .line 138
    const v15, 0x3f3ae148    # 0.73f

    .line 139
    .line 140
    .line 141
    const v16, 0x3ee66666    # 0.45f

    .line 142
    .line 143
    .line 144
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 145
    .line 146
    .line 147
    const/high16 v17, 0x40d00000    # 6.5f

    .line 148
    .line 149
    const/high16 v18, 0x41a00000    # 20.0f

    .line 150
    .line 151
    const v13, 0x40466666    # 3.1f

    .line 152
    .line 153
    .line 154
    const v14, 0x41a3999a    # 20.45f

    .line 155
    .line 156
    .line 157
    const v15, 0x40a1999a    # 5.05f

    .line 158
    .line 159
    .line 160
    const/high16 v16, 0x41a00000    # 20.0f

    .line 161
    .line 162
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 163
    .line 164
    .line 165
    const/high16 v17, 0x40b00000    # 5.5f

    .line 166
    .line 167
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 168
    .line 169
    const v13, 0x3ff9999a    # 1.95f

    .line 170
    .line 171
    .line 172
    const/4 v14, 0x0

    .line 173
    const v15, 0x4081999a    # 4.05f

    .line 174
    .line 175
    .line 176
    const v16, 0x3ecccccd    # 0.4f

    .line 177
    .line 178
    .line 179
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 180
    .line 181
    .line 182
    const/high16 v18, -0x40400000    # -1.5f

    .line 183
    .line 184
    const v13, 0x3faccccd    # 1.35f

    .line 185
    .line 186
    .line 187
    const v14, -0x40a66666    # -0.85f

    .line 188
    .line 189
    .line 190
    const v15, 0x40733333    # 3.8f

    .line 191
    .line 192
    .line 193
    const/high16 v16, -0x40400000    # -1.5f

    .line 194
    .line 195
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const/high16 v17, 0x40980000    # 4.75f

    .line 199
    .line 200
    const v18, 0x3f866666    # 1.05f

    .line 201
    .line 202
    .line 203
    const v13, 0x3fd33333    # 1.65f

    .line 204
    .line 205
    .line 206
    const/4 v14, 0x0

    .line 207
    const v15, 0x40566666    # 3.35f

    .line 208
    .line 209
    .line 210
    const v16, 0x3e99999a    # 0.3f

    .line 211
    .line 212
    .line 213
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const/high16 v17, 0x41b80000    # 23.0f

    .line 217
    .line 218
    const v18, 0x41a4cccd    # 20.6f

    .line 219
    .line 220
    .line 221
    const v13, 0x41b547ae    # 22.66f

    .line 222
    .line 223
    .line 224
    const v14, 0x41aa147b    # 21.26f

    .line 225
    .line 226
    .line 227
    const/high16 v15, 0x41b80000    # 23.0f

    .line 228
    .line 229
    const v16, 0x41a6e148    # 20.86f

    .line 230
    .line 231
    .line 232
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    const/high16 v0, 0x40c00000    # 6.0f

    .line 236
    .line 237
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 238
    .line 239
    .line 240
    const/high16 v17, 0x418c0000    # 17.5f

    .line 241
    .line 242
    const/high16 v18, 0x40900000    # 4.5f

    .line 243
    .line 244
    const v13, 0x41ac147b    # 21.51f

    .line 245
    .line 246
    .line 247
    const v14, 0x409c28f6    # 4.88f

    .line 248
    .line 249
    .line 250
    const v15, 0x419af5c3    # 19.37f

    .line 251
    .line 252
    .line 253
    const/high16 v16, 0x40900000    # 4.5f

    .line 254
    .line 255
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const/high16 v0, 0x41a80000    # 21.0f

    .line 262
    .line 263
    const/high16 v2, 0x41940000    # 18.5f

    .line 264
    .line 265
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 266
    .line 267
    .line 268
    const/high16 v17, -0x3fa00000    # -3.5f

    .line 269
    .line 270
    const/high16 v18, -0x41000000    # -0.5f

    .line 271
    .line 272
    const v13, -0x40733333    # -1.1f

    .line 273
    .line 274
    .line 275
    const v14, -0x414ccccd    # -0.35f

    .line 276
    .line 277
    .line 278
    const v15, -0x3feccccd    # -2.3f

    .line 279
    .line 280
    .line 281
    const/high16 v16, -0x41000000    # -0.5f

    .line 282
    .line 283
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const/high16 v17, -0x3f500000    # -5.5f

    .line 287
    .line 288
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 289
    .line 290
    const v13, -0x40266666    # -1.7f

    .line 291
    .line 292
    .line 293
    const/4 v14, 0x0

    .line 294
    const v15, -0x3f7b3333    # -4.15f

    .line 295
    .line 296
    .line 297
    const v16, 0x3f266666    # 0.65f

    .line 298
    .line 299
    .line 300
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 301
    .line 302
    .line 303
    const/high16 v0, 0x41000000    # 8.0f

    .line 304
    .line 305
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 306
    .line 307
    .line 308
    const/high16 v17, 0x40b00000    # 5.5f

    .line 309
    .line 310
    const/high16 v18, -0x40400000    # -1.5f

    .line 311
    .line 312
    const v13, 0x3faccccd    # 1.35f

    .line 313
    .line 314
    .line 315
    const v14, -0x40a66666    # -0.85f

    .line 316
    .line 317
    .line 318
    const v15, 0x40733333    # 3.8f

    .line 319
    .line 320
    .line 321
    const/high16 v16, -0x40400000    # -1.5f

    .line 322
    .line 323
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 324
    .line 325
    .line 326
    const/high16 v17, 0x40600000    # 3.5f

    .line 327
    .line 328
    const/high16 v18, 0x3f000000    # 0.5f

    .line 329
    .line 330
    const v13, 0x3f99999a    # 1.2f

    .line 331
    .line 332
    .line 333
    const/4 v14, 0x0

    .line 334
    const v15, 0x4019999a    # 2.4f

    .line 335
    .line 336
    .line 337
    const v16, 0x3e19999a    # 0.15f

    .line 338
    .line 339
    .line 340
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 341
    .line 342
    .line 343
    const/high16 v0, 0x41940000    # 18.5f

    .line 344
    .line 345
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    const/16 v16, 0x3800

    .line 356
    .line 357
    const/16 v17, 0x0

    .line 358
    .line 359
    const/high16 v6, 0x3f800000    # 1.0f

    .line 360
    .line 361
    const/high16 v8, 0x3f800000    # 1.0f

    .line 362
    .line 363
    const/4 v7, 0x0

    .line 364
    const/high16 v9, 0x3f800000    # 1.0f

    .line 365
    .line 366
    const/high16 v12, 0x3f800000    # 1.0f

    .line 367
    .line 368
    const/4 v13, 0x0

    .line 369
    const/4 v15, 0x0

    .line 370
    const-string v4, ""

    .line 371
    .line 372
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    sput-object v0, Landroidx/compose/material/icons/filled/ImportContactsKt;->_importContacts:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 381
    .line 382
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 383
    .line 384
    .line 385
    return-object v0
.end method
