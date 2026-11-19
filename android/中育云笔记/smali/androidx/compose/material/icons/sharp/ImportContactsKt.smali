.class public final Landroidx/compose/material/icons/sharp/ImportContactsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _importContacts:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getImportContacts(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/ImportContactsKt;->_importContacts:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.ImportContacts"

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
    const/high16 v0, 0x41780000    # 15.5f

    .line 142
    .line 143
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 144
    .line 145
    .line 146
    const/high16 v17, 0x40d00000    # 6.5f

    .line 147
    .line 148
    const/high16 v18, 0x41a00000    # 20.0f

    .line 149
    .line 150
    const v13, 0x401ccccd    # 2.45f

    .line 151
    .line 152
    .line 153
    const v14, 0x41a33333    # 20.4f

    .line 154
    .line 155
    .line 156
    const v15, 0x4091999a    # 4.55f

    .line 157
    .line 158
    .line 159
    const/high16 v16, 0x41a00000    # 20.0f

    .line 160
    .line 161
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 162
    .line 163
    .line 164
    const/high16 v0, 0x40b00000    # 5.5f

    .line 165
    .line 166
    const/high16 v2, 0x3fc00000    # 1.5f

    .line 167
    .line 168
    const v4, 0x4081999a    # 4.05f

    .line 169
    .line 170
    .line 171
    const v6, 0x3ecccccd    # 0.4f

    .line 172
    .line 173
    .line 174
    invoke-virtual {v12, v4, v6, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const/high16 v17, 0x40b00000    # 5.5f

    .line 178
    .line 179
    const/high16 v18, -0x40400000    # -1.5f

    .line 180
    .line 181
    const v13, 0x3fb9999a    # 1.45f

    .line 182
    .line 183
    .line 184
    const v14, -0x40733333    # -1.1f

    .line 185
    .line 186
    .line 187
    const v15, 0x40633333    # 3.55f

    .line 188
    .line 189
    .line 190
    const/high16 v16, -0x40400000    # -1.5f

    .line 191
    .line 192
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 193
    .line 194
    .line 195
    const/high16 v17, 0x40600000    # 3.5f

    .line 196
    .line 197
    const/high16 v18, 0x3f000000    # 0.5f

    .line 198
    .line 199
    const v13, 0x3f95c28f    # 1.17f

    .line 200
    .line 201
    .line 202
    const/4 v14, 0x0

    .line 203
    const v15, 0x4018f5c3    # 2.39f

    .line 204
    .line 205
    .line 206
    const v16, 0x3e19999a    # 0.15f

    .line 207
    .line 208
    .line 209
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/high16 v17, 0x40000000    # 2.0f

    .line 213
    .line 214
    const/high16 v18, 0x3f800000    # 1.0f

    .line 215
    .line 216
    const/high16 v13, 0x3f400000    # 0.75f

    .line 217
    .line 218
    const/high16 v14, 0x3e800000    # 0.25f

    .line 219
    .line 220
    const v15, 0x3fb33333    # 1.4f

    .line 221
    .line 222
    .line 223
    const v16, 0x3f0ccccd    # 0.55f

    .line 224
    .line 225
    .line 226
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const/high16 v0, 0x41b80000    # 23.0f

    .line 230
    .line 231
    const/high16 v2, 0x40c00000    # 6.0f

    .line 232
    .line 233
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const/high16 v17, -0x40000000    # -2.0f

    .line 237
    .line 238
    const/high16 v18, -0x40800000    # -1.0f

    .line 239
    .line 240
    const v13, -0x40e66666    # -0.6f

    .line 241
    .line 242
    .line 243
    const v14, -0x4119999a    # -0.45f

    .line 244
    .line 245
    .line 246
    const/high16 v15, -0x40600000    # -1.25f

    .line 247
    .line 248
    const/high16 v16, -0x40c00000    # -0.75f

    .line 249
    .line 250
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    const/high16 v0, 0x41940000    # 18.5f

    .line 257
    .line 258
    const/high16 v2, 0x41a80000    # 21.0f

    .line 259
    .line 260
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    const/high16 v17, -0x3fa00000    # -3.5f

    .line 264
    .line 265
    const/high16 v18, -0x41000000    # -0.5f

    .line 266
    .line 267
    const v13, -0x40733333    # -1.1f

    .line 268
    .line 269
    .line 270
    const v14, -0x414ccccd    # -0.35f

    .line 271
    .line 272
    .line 273
    const v15, -0x3feccccd    # -2.3f

    .line 274
    .line 275
    .line 276
    const/high16 v16, -0x41000000    # -0.5f

    .line 277
    .line 278
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 279
    .line 280
    .line 281
    const/high16 v17, -0x3f500000    # -5.5f

    .line 282
    .line 283
    const/high16 v18, 0x3fc00000    # 1.5f

    .line 284
    .line 285
    const v13, -0x40266666    # -1.7f

    .line 286
    .line 287
    .line 288
    const/4 v14, 0x0

    .line 289
    const v15, -0x3f7b3333    # -4.15f

    .line 290
    .line 291
    .line 292
    const v16, 0x3f266666    # 0.65f

    .line 293
    .line 294
    .line 295
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 296
    .line 297
    .line 298
    const/high16 v0, 0x41400000    # 12.0f

    .line 299
    .line 300
    const/high16 v2, 0x41000000    # 8.0f

    .line 301
    .line 302
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const/high16 v17, 0x40b00000    # 5.5f

    .line 306
    .line 307
    const/high16 v18, -0x40400000    # -1.5f

    .line 308
    .line 309
    const v13, 0x3faccccd    # 1.35f

    .line 310
    .line 311
    .line 312
    const v14, -0x40a66666    # -0.85f

    .line 313
    .line 314
    .line 315
    const v15, 0x40733333    # 3.8f

    .line 316
    .line 317
    .line 318
    const/high16 v16, -0x40400000    # -1.5f

    .line 319
    .line 320
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 321
    .line 322
    .line 323
    const/high16 v17, 0x40600000    # 3.5f

    .line 324
    .line 325
    const/high16 v18, 0x3f000000    # 0.5f

    .line 326
    .line 327
    const v13, 0x3f99999a    # 1.2f

    .line 328
    .line 329
    .line 330
    const/4 v14, 0x0

    .line 331
    const v15, 0x4019999a    # 2.4f

    .line 332
    .line 333
    .line 334
    const v16, 0x3e19999a    # 0.15f

    .line 335
    .line 336
    .line 337
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 338
    .line 339
    .line 340
    const/high16 v0, 0x41380000    # 11.5f

    .line 341
    .line 342
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    const/16 v16, 0x3800

    .line 353
    .line 354
    const/16 v17, 0x0

    .line 355
    .line 356
    const/high16 v6, 0x3f800000    # 1.0f

    .line 357
    .line 358
    const/high16 v8, 0x3f800000    # 1.0f

    .line 359
    .line 360
    const/4 v7, 0x0

    .line 361
    const/high16 v9, 0x3f800000    # 1.0f

    .line 362
    .line 363
    const/high16 v12, 0x3f800000    # 1.0f

    .line 364
    .line 365
    const/4 v13, 0x0

    .line 366
    const/4 v15, 0x0

    .line 367
    const-string v4, ""

    .line 368
    .line 369
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    sput-object v0, Landroidx/compose/material/icons/sharp/ImportContactsKt;->_importContacts:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 378
    .line 379
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 380
    .line 381
    .line 382
    return-object v0
.end method
