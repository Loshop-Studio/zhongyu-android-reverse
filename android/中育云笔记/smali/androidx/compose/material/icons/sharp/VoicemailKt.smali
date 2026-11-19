.class public final Landroidx/compose/material/icons/sharp/VoicemailKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static _voicemail:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getVoicemail(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/VoicemailKt;->_voicemail:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.Voicemail"

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
    const/high16 v0, 0x40c00000    # 6.0f

    .line 71
    .line 72
    const/high16 v2, 0x41940000    # 18.5f

    .line 73
    .line 74
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v17, 0x41500000    # 13.0f

    .line 78
    .line 79
    const/high16 v18, 0x41380000    # 11.5f

    .line 80
    .line 81
    const v13, 0x41775c29    # 15.46f

    .line 82
    .line 83
    .line 84
    const/high16 v14, 0x40c00000    # 6.0f

    .line 85
    .line 86
    const/high16 v15, 0x41500000    # 13.0f

    .line 87
    .line 88
    const v16, 0x41075c29    # 8.46f

    .line 89
    .line 90
    .line 91
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 92
    .line 93
    .line 94
    const v17, 0x3fa147ae    # 1.26f

    .line 95
    .line 96
    .line 97
    const/high16 v18, 0x40600000    # 3.5f

    .line 98
    .line 99
    const/4 v13, 0x0

    .line 100
    const v14, 0x3faa3d71    # 1.33f

    .line 101
    .line 102
    .line 103
    const v15, 0x3ef0a3d7    # 0.47f

    .line 104
    .line 105
    .line 106
    const v16, 0x40233333    # 2.55f

    .line 107
    .line 108
    .line 109
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 110
    .line 111
    .line 112
    const v0, 0x411bd70a    # 9.74f

    .line 113
    .line 114
    .line 115
    const/high16 v2, 0x41700000    # 15.0f

    .line 116
    .line 117
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 118
    .line 119
    .line 120
    const/high16 v18, -0x3fa00000    # -3.5f

    .line 121
    .line 122
    const v13, 0x3f4a3d71    # 0.79f

    .line 123
    .line 124
    .line 125
    const v14, -0x408ccccd    # -0.95f

    .line 126
    .line 127
    .line 128
    const v15, 0x3fa147ae    # 1.26f

    .line 129
    .line 130
    .line 131
    const v16, -0x3ff51eb8    # -2.17f

    .line 132
    .line 133
    .line 134
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 135
    .line 136
    .line 137
    const/high16 v17, 0x40b00000    # 5.5f

    .line 138
    .line 139
    const/high16 v18, 0x40c00000    # 6.0f

    .line 140
    .line 141
    const/high16 v13, 0x41300000    # 11.0f

    .line 142
    .line 143
    const v14, 0x41075c29    # 8.46f

    .line 144
    .line 145
    .line 146
    const v15, 0x4108a3d7    # 8.54f

    .line 147
    .line 148
    .line 149
    const/high16 v16, 0x40c00000    # 6.0f

    .line 150
    .line 151
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 152
    .line 153
    .line 154
    const v0, 0x41075c29    # 8.46f

    .line 155
    .line 156
    .line 157
    const/4 v2, 0x0

    .line 158
    const/high16 v4, 0x41380000    # 11.5f

    .line 159
    .line 160
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 161
    .line 162
    .line 163
    const v0, 0x401d70a4    # 2.46f

    .line 164
    .line 165
    .line 166
    const/high16 v2, 0x41880000    # 17.0f

    .line 167
    .line 168
    const/high16 v4, 0x40b00000    # 5.5f

    .line 169
    .line 170
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 171
    .line 172
    .line 173
    const/high16 v0, 0x41500000    # 13.0f

    .line 174
    .line 175
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 176
    .line 177
    .line 178
    const/high16 v18, -0x3f500000    # -5.5f

    .line 179
    .line 180
    const v13, 0x40428f5c    # 3.04f

    .line 181
    .line 182
    .line 183
    const/4 v14, 0x0

    .line 184
    const/high16 v15, 0x40b00000    # 5.5f

    .line 185
    .line 186
    const v16, -0x3fe28f5c    # -2.46f

    .line 187
    .line 188
    .line 189
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 190
    .line 191
    .line 192
    const v0, 0x41ac51ec    # 21.54f

    .line 193
    .line 194
    .line 195
    const/high16 v2, 0x40c00000    # 6.0f

    .line 196
    .line 197
    const/high16 v4, 0x41940000    # 18.5f

    .line 198
    .line 199
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 203
    .line 204
    .line 205
    const/high16 v0, 0x40b00000    # 5.5f

    .line 206
    .line 207
    const/high16 v2, 0x41700000    # 15.0f

    .line 208
    .line 209
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 210
    .line 211
    .line 212
    const/high16 v17, 0x40000000    # 2.0f

    .line 213
    .line 214
    const/high16 v18, 0x41380000    # 11.5f

    .line 215
    .line 216
    const v13, 0x40647ae1    # 3.57f

    .line 217
    .line 218
    .line 219
    const/high16 v14, 0x41700000    # 15.0f

    .line 220
    .line 221
    const/high16 v15, 0x40000000    # 2.0f

    .line 222
    .line 223
    const v16, 0x4156e148    # 13.43f

    .line 224
    .line 225
    .line 226
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 227
    .line 228
    .line 229
    const v0, 0x40647ae1    # 3.57f

    .line 230
    .line 231
    .line 232
    const/high16 v2, 0x41000000    # 8.0f

    .line 233
    .line 234
    const/high16 v4, 0x40b00000    # 5.5f

    .line 235
    .line 236
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 237
    .line 238
    .line 239
    const v0, 0x41191eb8    # 9.57f

    .line 240
    .line 241
    .line 242
    const/high16 v2, 0x41100000    # 9.0f

    .line 243
    .line 244
    const/high16 v4, 0x41380000    # 11.5f

    .line 245
    .line 246
    invoke-virtual {v12, v2, v0, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 247
    .line 248
    .line 249
    const v0, 0x40edc28f    # 7.43f

    .line 250
    .line 251
    .line 252
    const/high16 v2, 0x40b00000    # 5.5f

    .line 253
    .line 254
    const/high16 v4, 0x41700000    # 15.0f

    .line 255
    .line 256
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 260
    .line 261
    .line 262
    const/high16 v0, 0x41940000    # 18.5f

    .line 263
    .line 264
    const/high16 v2, 0x41700000    # 15.0f

    .line 265
    .line 266
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 267
    .line 268
    .line 269
    const/high16 v17, -0x3fa00000    # -3.5f

    .line 270
    .line 271
    const/high16 v18, -0x3fa00000    # -3.5f

    .line 272
    .line 273
    const v13, -0x4008f5c3    # -1.93f

    .line 274
    .line 275
    .line 276
    const/4 v14, 0x0

    .line 277
    const/high16 v15, -0x3fa00000    # -3.5f

    .line 278
    .line 279
    const v16, -0x40370a3d    # -1.57f

    .line 280
    .line 281
    .line 282
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const v0, 0x41848f5c    # 16.57f

    .line 286
    .line 287
    .line 288
    const/high16 v2, 0x41000000    # 8.0f

    .line 289
    .line 290
    const/high16 v4, 0x41940000    # 18.5f

    .line 291
    .line 292
    invoke-virtual {v12, v0, v2, v4, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 293
    .line 294
    .line 295
    const/high16 v0, 0x41b00000    # 22.0f

    .line 296
    .line 297
    const v2, 0x41191eb8    # 9.57f

    .line 298
    .line 299
    .line 300
    const/high16 v4, 0x41380000    # 11.5f

    .line 301
    .line 302
    invoke-virtual {v12, v0, v2, v0, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 303
    .line 304
    .line 305
    const v0, 0x41a370a4    # 20.43f

    .line 306
    .line 307
    .line 308
    const/high16 v2, 0x41940000    # 18.5f

    .line 309
    .line 310
    const/high16 v4, 0x41700000    # 15.0f

    .line 311
    .line 312
    invoke-virtual {v12, v0, v4, v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    const/16 v16, 0x3800

    .line 323
    .line 324
    const/16 v17, 0x0

    .line 325
    .line 326
    const/high16 v6, 0x3f800000    # 1.0f

    .line 327
    .line 328
    const/high16 v8, 0x3f800000    # 1.0f

    .line 329
    .line 330
    const/4 v7, 0x0

    .line 331
    const/high16 v9, 0x3f800000    # 1.0f

    .line 332
    .line 333
    const/high16 v12, 0x3f800000    # 1.0f

    .line 334
    .line 335
    const/4 v13, 0x0

    .line 336
    const/4 v15, 0x0

    .line 337
    const-string v4, ""

    .line 338
    .line 339
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    sput-object v0, Landroidx/compose/material/icons/sharp/VoicemailKt;->_voicemail:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 348
    .line 349
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 350
    .line 351
    .line 352
    return-object v0
.end method
