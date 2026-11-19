.class public final Landroidx/compose/material/icons/twotone/BathroomKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_bathroom",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "Bathroom",
        "Landroidx/compose/material/icons/Icons$TwoTone;",
        "getBathroom",
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
        "SMAP\nBathroom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Bathroom.kt\nandroidx/compose/material/icons/twotone/BathroomKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,154:1\n212#2,12:155\n233#2,18:168\n253#2:205\n233#2,18:206\n253#2:243\n233#2,18:244\n253#2:281\n233#2,18:282\n253#2:319\n233#2,18:320\n253#2:357\n233#2,18:358\n253#2:395\n233#2,18:396\n253#2:433\n233#2,18:434\n253#2:471\n233#2,18:472\n253#2:509\n174#3:167\n705#4,2:186\n717#4,2:188\n719#4,11:194\n705#4,2:224\n717#4,2:226\n719#4,11:232\n705#4,2:262\n717#4,2:264\n719#4,11:270\n705#4,2:300\n717#4,2:302\n719#4,11:308\n705#4,2:338\n717#4,2:340\n719#4,11:346\n705#4,2:376\n717#4,2:378\n719#4,11:384\n705#4,2:414\n717#4,2:416\n719#4,11:422\n705#4,2:452\n717#4,2:454\n719#4,11:460\n705#4,2:490\n717#4,2:492\n719#4,11:498\n72#5,4:190\n72#5,4:228\n72#5,4:266\n72#5,4:304\n72#5,4:342\n72#5,4:380\n72#5,4:418\n72#5,4:456\n72#5,4:494\n*S KotlinDebug\n*F\n+ 1 Bathroom.kt\nandroidx/compose/material/icons/twotone/BathroomKt\n*L\n29#1:155,12\n30#1:168,18\n30#1:205\n81#1:206,18\n81#1:243\n87#1:244,18\n87#1:281\n93#1:282,18\n93#1:319\n99#1:320,18\n99#1:357\n117#1:358,18\n117#1:395\n131#1:396,18\n131#1:433\n137#1:434,18\n137#1:471\n143#1:472,18\n143#1:509\n29#1:167\n30#1:186,2\n30#1:188,2\n30#1:194,11\n81#1:224,2\n81#1:226,2\n81#1:232,11\n87#1:262,2\n87#1:264,2\n87#1:270,11\n93#1:300,2\n93#1:302,2\n93#1:308,11\n99#1:338,2\n99#1:340,2\n99#1:346,11\n117#1:376,2\n117#1:378,2\n117#1:384,11\n131#1:414,2\n131#1:416,2\n131#1:422,11\n137#1:452,2\n137#1:454,2\n137#1:460,11\n143#1:490,2\n143#1:492,2\n143#1:498,11\n30#1:190,4\n81#1:228,4\n87#1:266,4\n93#1:304,4\n99#1:342,4\n117#1:380,4\n131#1:418,4\n137#1:456,4\n143#1:494,4\n*E\n"
    }
.end annotation


# static fields
.field private static _bathroom:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBathroom(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 28

    .line 1
    sget-object v0, Landroidx/compose/material/icons/twotone/BathroomKt;->_bathroom:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "TwoTone.Bathroom"

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
    const/high16 v4, 0x41a00000    # 20.0f

    .line 71
    .line 72
    const/high16 v6, 0x40800000    # 4.0f

    .line 73
    .line 74
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 75
    .line 76
    .line 77
    const/high16 v4, 0x41800000    # 16.0f

    .line 78
    .line 79
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 80
    .line 81
    .line 82
    const/high16 v4, 0x40800000    # 4.0f

    .line 83
    .line 84
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 88
    .line 89
    .line 90
    const/high16 v4, 0x41a00000    # 20.0f

    .line 91
    .line 92
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 96
    .line 97
    .line 98
    const/high16 v4, 0x41100000    # 9.0f

    .line 99
    .line 100
    const/high16 v6, 0x41900000    # 18.0f

    .line 101
    .line 102
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 103
    .line 104
    .line 105
    const/high16 v25, -0x40800000    # -1.0f

    .line 106
    .line 107
    const/high16 v26, -0x40800000    # -1.0f

    .line 108
    .line 109
    const v21, -0x40f33333    # -0.55f

    .line 110
    .line 111
    .line 112
    const/16 v22, 0x0

    .line 113
    .line 114
    const/high16 v23, -0x40800000    # -1.0f

    .line 115
    .line 116
    const v24, -0x4119999a    # -0.45f

    .line 117
    .line 118
    .line 119
    move-object/from16 v20, v2

    .line 120
    .line 121
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 122
    .line 123
    .line 124
    const v4, 0x3ee66666    # 0.45f

    .line 125
    .line 126
    .line 127
    const/high16 v6, -0x40800000    # -1.0f

    .line 128
    .line 129
    const/high16 v7, 0x3f800000    # 1.0f

    .line 130
    .line 131
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const/high16 v6, 0x3f800000    # 1.0f

    .line 135
    .line 136
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 137
    .line 138
    .line 139
    const v4, 0x4118cccd    # 9.55f

    .line 140
    .line 141
    .line 142
    const/high16 v6, 0x41100000    # 9.0f

    .line 143
    .line 144
    const/high16 v7, 0x41900000    # 18.0f

    .line 145
    .line 146
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 150
    .line 151
    .line 152
    const/high16 v4, 0x41100000    # 9.0f

    .line 153
    .line 154
    const/high16 v6, 0x41700000    # 15.0f

    .line 155
    .line 156
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 160
    .line 161
    .line 162
    const v4, 0x3ee66666    # 0.45f

    .line 163
    .line 164
    .line 165
    const/high16 v6, -0x40800000    # -1.0f

    .line 166
    .line 167
    const/high16 v7, 0x3f800000    # 1.0f

    .line 168
    .line 169
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 170
    .line 171
    .line 172
    const/high16 v6, 0x3f800000    # 1.0f

    .line 173
    .line 174
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 175
    .line 176
    .line 177
    const v4, 0x4118cccd    # 9.55f

    .line 178
    .line 179
    .line 180
    const/high16 v6, 0x41100000    # 9.0f

    .line 181
    .line 182
    const/high16 v7, 0x41700000    # 15.0f

    .line 183
    .line 184
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 188
    .line 189
    .line 190
    const/high16 v4, 0x41400000    # 12.0f

    .line 191
    .line 192
    const/high16 v6, 0x41900000    # 18.0f

    .line 193
    .line 194
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 198
    .line 199
    .line 200
    const v4, 0x3ee66666    # 0.45f

    .line 201
    .line 202
    .line 203
    const/high16 v6, -0x40800000    # -1.0f

    .line 204
    .line 205
    const/high16 v7, 0x3f800000    # 1.0f

    .line 206
    .line 207
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 208
    .line 209
    .line 210
    const/high16 v6, 0x3f800000    # 1.0f

    .line 211
    .line 212
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 213
    .line 214
    .line 215
    const v4, 0x4148cccd    # 12.55f

    .line 216
    .line 217
    .line 218
    const/high16 v6, 0x41400000    # 12.0f

    .line 219
    .line 220
    const/high16 v7, 0x41900000    # 18.0f

    .line 221
    .line 222
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const/high16 v4, 0x41400000    # 12.0f

    .line 229
    .line 230
    const/high16 v6, 0x41700000    # 15.0f

    .line 231
    .line 232
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 236
    .line 237
    .line 238
    const v4, 0x3ee66666    # 0.45f

    .line 239
    .line 240
    .line 241
    const/high16 v6, -0x40800000    # -1.0f

    .line 242
    .line 243
    const/high16 v7, 0x3f800000    # 1.0f

    .line 244
    .line 245
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 246
    .line 247
    .line 248
    const/high16 v6, 0x3f800000    # 1.0f

    .line 249
    .line 250
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 251
    .line 252
    .line 253
    const v4, 0x4148cccd    # 12.55f

    .line 254
    .line 255
    .line 256
    const/high16 v6, 0x41400000    # 12.0f

    .line 257
    .line 258
    const/high16 v7, 0x41700000    # 15.0f

    .line 259
    .line 260
    invoke-virtual {v2, v4, v7, v6, v7}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 264
    .line 265
    .line 266
    const/high16 v4, 0x41900000    # 18.0f

    .line 267
    .line 268
    const/high16 v6, 0x41700000    # 15.0f

    .line 269
    .line 270
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 274
    .line 275
    .line 276
    const v4, 0x3ee66666    # 0.45f

    .line 277
    .line 278
    .line 279
    const/high16 v6, -0x40800000    # -1.0f

    .line 280
    .line 281
    const/high16 v7, 0x3f800000    # 1.0f

    .line 282
    .line 283
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 284
    .line 285
    .line 286
    const/high16 v6, 0x3f800000    # 1.0f

    .line 287
    .line 288
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    const v4, 0x4178cccd    # 15.55f

    .line 292
    .line 293
    .line 294
    const/high16 v6, 0x41900000    # 18.0f

    .line 295
    .line 296
    const/high16 v7, 0x41700000    # 15.0f

    .line 297
    .line 298
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 302
    .line 303
    .line 304
    const/high16 v4, 0x41700000    # 15.0f

    .line 305
    .line 306
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 310
    .line 311
    .line 312
    const v4, 0x3ee66666    # 0.45f

    .line 313
    .line 314
    .line 315
    const/high16 v6, -0x40800000    # -1.0f

    .line 316
    .line 317
    const/high16 v7, 0x3f800000    # 1.0f

    .line 318
    .line 319
    invoke-virtual {v2, v4, v6, v7, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 320
    .line 321
    .line 322
    const/high16 v6, 0x3f800000    # 1.0f

    .line 323
    .line 324
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 325
    .line 326
    .line 327
    const v4, 0x4178cccd    # 15.55f

    .line 328
    .line 329
    .line 330
    const/high16 v6, 0x41700000    # 15.0f

    .line 331
    .line 332
    invoke-virtual {v2, v4, v6, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveTo(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 333
    .line 334
    .line 335
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 336
    .line 337
    .line 338
    const/high16 v4, 0x40e00000    # 7.0f

    .line 339
    .line 340
    const/high16 v6, 0x41300000    # 11.0f

    .line 341
    .line 342
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 343
    .line 344
    .line 345
    const/high16 v25, 0x40a00000    # 5.0f

    .line 346
    .line 347
    const/high16 v26, -0x3f600000    # -5.0f

    .line 348
    .line 349
    const/16 v21, 0x0

    .line 350
    .line 351
    const v22, -0x3fcf5c29    # -2.76f

    .line 352
    .line 353
    .line 354
    const v23, 0x400f5c29    # 2.24f

    .line 355
    .line 356
    .line 357
    const/high16 v24, -0x3f600000    # -5.0f

    .line 358
    .line 359
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 360
    .line 361
    .line 362
    const v4, 0x400f5c29    # 2.24f

    .line 363
    .line 364
    .line 365
    const/high16 v6, 0x40a00000    # 5.0f

    .line 366
    .line 367
    invoke-virtual {v2, v6, v4, v6, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 368
    .line 369
    .line 370
    const/high16 v4, 0x3f800000    # 1.0f

    .line 371
    .line 372
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 373
    .line 374
    .line 375
    const/high16 v4, 0x40e00000    # 7.0f

    .line 376
    .line 377
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 378
    .line 379
    .line 380
    const/high16 v4, 0x41300000    # 11.0f

    .line 381
    .line 382
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 383
    .line 384
    .line 385
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 386
    .line 387
    .line 388
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 389
    .line 390
    .line 391
    move-result-object v2

    .line 392
    const/16 v16, 0x3800

    .line 393
    .line 394
    const/16 v17, 0x0

    .line 395
    .line 396
    const v6, 0x3e99999a    # 0.3f

    .line 397
    .line 398
    .line 399
    const v8, 0x3e99999a    # 0.3f

    .line 400
    .line 401
    .line 402
    const/4 v7, 0x0

    .line 403
    const/high16 v9, 0x3f800000    # 1.0f

    .line 404
    .line 405
    const/high16 v12, 0x3f800000    # 1.0f

    .line 406
    .line 407
    const/4 v13, 0x0

    .line 408
    const/4 v14, 0x0

    .line 409
    const/4 v15, 0x0

    .line 410
    const-string v4, ""

    .line 411
    .line 412
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 413
    .line 414
    .line 415
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 416
    .line 417
    .line 418
    move-result v3

    .line 419
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 420
    .line 421
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 422
    .line 423
    .line 424
    move-result-wide v6

    .line 425
    const/4 v2, 0x0

    .line 426
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 427
    .line 428
    .line 429
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 430
    .line 431
    .line 432
    move-result v10

    .line 433
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 434
    .line 435
    .line 436
    move-result v11

    .line 437
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 438
    .line 439
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 440
    .line 441
    .line 442
    const/high16 v4, 0x41600000    # 14.0f

    .line 443
    .line 444
    const/high16 v6, 0x41700000    # 15.0f

    .line 445
    .line 446
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 447
    .line 448
    .line 449
    const/4 v4, 0x0

    .line 450
    const/high16 v6, -0x40800000    # -1.0f

    .line 451
    .line 452
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 453
    .line 454
    .line 455
    const/high16 v26, 0x40000000    # 2.0f

    .line 456
    .line 457
    const/16 v27, 0x0

    .line 458
    .line 459
    const/high16 v21, 0x3f800000    # 1.0f

    .line 460
    .line 461
    const/high16 v22, 0x3f800000    # 1.0f

    .line 462
    .line 463
    const/16 v23, 0x0

    .line 464
    .line 465
    const/16 v24, 0x1

    .line 466
    .line 467
    const/16 v25, 0x1

    .line 468
    .line 469
    move-object/from16 v20, v2

    .line 470
    .line 471
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 472
    .line 473
    .line 474
    const/high16 v26, -0x40000000    # -2.0f

    .line 475
    .line 476
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 477
    .line 478
    .line 479
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 480
    .line 481
    .line 482
    move-result-object v2

    .line 483
    const/high16 v6, 0x3f800000    # 1.0f

    .line 484
    .line 485
    const/high16 v8, 0x3f800000    # 1.0f

    .line 486
    .line 487
    const/4 v7, 0x0

    .line 488
    const-string v4, ""

    .line 489
    .line 490
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 491
    .line 492
    .line 493
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 494
    .line 495
    .line 496
    move-result v3

    .line 497
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 498
    .line 499
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 500
    .line 501
    .line 502
    move-result-wide v6

    .line 503
    const/4 v2, 0x0

    .line 504
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 505
    .line 506
    .line 507
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 508
    .line 509
    .line 510
    move-result v10

    .line 511
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 512
    .line 513
    .line 514
    move-result v11

    .line 515
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 516
    .line 517
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 518
    .line 519
    .line 520
    const/high16 v4, 0x41600000    # 14.0f

    .line 521
    .line 522
    const/high16 v6, 0x41400000    # 12.0f

    .line 523
    .line 524
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 525
    .line 526
    .line 527
    const/4 v4, 0x0

    .line 528
    const/high16 v6, -0x40800000    # -1.0f

    .line 529
    .line 530
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 531
    .line 532
    .line 533
    const/high16 v26, 0x40000000    # 2.0f

    .line 534
    .line 535
    move-object/from16 v20, v2

    .line 536
    .line 537
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 538
    .line 539
    .line 540
    const/high16 v26, -0x40000000    # -2.0f

    .line 541
    .line 542
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 543
    .line 544
    .line 545
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 546
    .line 547
    .line 548
    move-result-object v2

    .line 549
    const/high16 v6, 0x3f800000    # 1.0f

    .line 550
    .line 551
    const/4 v7, 0x0

    .line 552
    const-string v4, ""

    .line 553
    .line 554
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 555
    .line 556
    .line 557
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 558
    .line 559
    .line 560
    move-result v3

    .line 561
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 562
    .line 563
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 564
    .line 565
    .line 566
    move-result-wide v6

    .line 567
    const/4 v2, 0x0

    .line 568
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 569
    .line 570
    .line 571
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 572
    .line 573
    .line 574
    move-result v10

    .line 575
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 576
    .line 577
    .line 578
    move-result v11

    .line 579
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 580
    .line 581
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 582
    .line 583
    .line 584
    const/high16 v4, 0x41880000    # 17.0f

    .line 585
    .line 586
    const/high16 v6, 0x41700000    # 15.0f

    .line 587
    .line 588
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 589
    .line 590
    .line 591
    const/4 v4, 0x0

    .line 592
    const/high16 v6, -0x40800000    # -1.0f

    .line 593
    .line 594
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 595
    .line 596
    .line 597
    const/high16 v26, 0x40000000    # 2.0f

    .line 598
    .line 599
    move-object/from16 v20, v2

    .line 600
    .line 601
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 602
    .line 603
    .line 604
    const/high16 v26, -0x40000000    # -2.0f

    .line 605
    .line 606
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 607
    .line 608
    .line 609
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 610
    .line 611
    .line 612
    move-result-object v2

    .line 613
    const/high16 v6, 0x3f800000    # 1.0f

    .line 614
    .line 615
    const/4 v7, 0x0

    .line 616
    const-string v4, ""

    .line 617
    .line 618
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 619
    .line 620
    .line 621
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 622
    .line 623
    .line 624
    move-result v3

    .line 625
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 626
    .line 627
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 628
    .line 629
    .line 630
    move-result-wide v6

    .line 631
    const/4 v2, 0x0

    .line 632
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 633
    .line 634
    .line 635
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 636
    .line 637
    .line 638
    move-result v10

    .line 639
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 640
    .line 641
    .line 642
    move-result v11

    .line 643
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 644
    .line 645
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 646
    .line 647
    .line 648
    const/high16 v4, 0x40000000    # 2.0f

    .line 649
    .line 650
    const/high16 v6, 0x41a00000    # 20.0f

    .line 651
    .line 652
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 653
    .line 654
    .line 655
    const/high16 v4, 0x40800000    # 4.0f

    .line 656
    .line 657
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 658
    .line 659
    .line 660
    const/high16 v25, 0x40000000    # 2.0f

    .line 661
    .line 662
    const/high16 v26, 0x40800000    # 4.0f

    .line 663
    .line 664
    const v21, 0x4039999a    # 2.9f

    .line 665
    .line 666
    .line 667
    const/high16 v22, 0x40000000    # 2.0f

    .line 668
    .line 669
    const/high16 v23, 0x40000000    # 2.0f

    .line 670
    .line 671
    const v24, 0x4039999a    # 2.9f

    .line 672
    .line 673
    .line 674
    move-object/from16 v20, v2

    .line 675
    .line 676
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 677
    .line 678
    .line 679
    const/high16 v4, 0x41800000    # 16.0f

    .line 680
    .line 681
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 682
    .line 683
    .line 684
    const/high16 v26, 0x40000000    # 2.0f

    .line 685
    .line 686
    const/16 v21, 0x0

    .line 687
    .line 688
    const v22, 0x3f8ccccd    # 1.1f

    .line 689
    .line 690
    .line 691
    const v23, 0x3f666666    # 0.9f

    .line 692
    .line 693
    .line 694
    const/high16 v24, 0x40000000    # 2.0f

    .line 695
    .line 696
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 697
    .line 698
    .line 699
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 700
    .line 701
    .line 702
    const/high16 v26, -0x40000000    # -2.0f

    .line 703
    .line 704
    const v21, 0x3f8ccccd    # 1.1f

    .line 705
    .line 706
    .line 707
    const/16 v22, 0x0

    .line 708
    .line 709
    const/high16 v23, 0x40000000    # 2.0f

    .line 710
    .line 711
    const v24, -0x4099999a    # -0.9f

    .line 712
    .line 713
    .line 714
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 715
    .line 716
    .line 717
    const/high16 v4, 0x40800000    # 4.0f

    .line 718
    .line 719
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 720
    .line 721
    .line 722
    const/high16 v25, 0x41a00000    # 20.0f

    .line 723
    .line 724
    const/high16 v26, 0x40000000    # 2.0f

    .line 725
    .line 726
    const/high16 v21, 0x41b00000    # 22.0f

    .line 727
    .line 728
    const v22, 0x4039999a    # 2.9f

    .line 729
    .line 730
    .line 731
    const v23, 0x41a8cccd    # 21.1f

    .line 732
    .line 733
    .line 734
    const/high16 v24, 0x40000000    # 2.0f

    .line 735
    .line 736
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 737
    .line 738
    .line 739
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 740
    .line 741
    .line 742
    const/high16 v4, 0x41a00000    # 20.0f

    .line 743
    .line 744
    invoke-virtual {v2, v4, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 745
    .line 746
    .line 747
    const/high16 v4, 0x40800000    # 4.0f

    .line 748
    .line 749
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 750
    .line 751
    .line 752
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 753
    .line 754
    .line 755
    const/high16 v4, 0x41800000    # 16.0f

    .line 756
    .line 757
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 758
    .line 759
    .line 760
    const/high16 v4, 0x41a00000    # 20.0f

    .line 761
    .line 762
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 763
    .line 764
    .line 765
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 766
    .line 767
    .line 768
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 769
    .line 770
    .line 771
    move-result-object v2

    .line 772
    const/high16 v6, 0x3f800000    # 1.0f

    .line 773
    .line 774
    const/4 v7, 0x0

    .line 775
    const-string v4, ""

    .line 776
    .line 777
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 778
    .line 779
    .line 780
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 781
    .line 782
    .line 783
    move-result v3

    .line 784
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 785
    .line 786
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 787
    .line 788
    .line 789
    move-result-wide v6

    .line 790
    const/4 v2, 0x0

    .line 791
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 792
    .line 793
    .line 794
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 795
    .line 796
    .line 797
    move-result v10

    .line 798
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 799
    .line 800
    .line 801
    move-result v11

    .line 802
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 803
    .line 804
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 805
    .line 806
    .line 807
    const/high16 v4, 0x41880000    # 17.0f

    .line 808
    .line 809
    const/high16 v6, 0x41300000    # 11.0f

    .line 810
    .line 811
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 812
    .line 813
    .line 814
    const/high16 v25, -0x3f600000    # -5.0f

    .line 815
    .line 816
    const/high16 v26, -0x3f600000    # -5.0f

    .line 817
    .line 818
    const/16 v21, 0x0

    .line 819
    .line 820
    const v22, -0x3fcf5c29    # -2.76f

    .line 821
    .line 822
    .line 823
    const v23, -0x3ff0a3d7    # -2.24f

    .line 824
    .line 825
    .line 826
    const/high16 v24, -0x3f600000    # -5.0f

    .line 827
    .line 828
    move-object/from16 v20, v2

    .line 829
    .line 830
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 831
    .line 832
    .line 833
    const/high16 v4, -0x3f600000    # -5.0f

    .line 834
    .line 835
    const/high16 v6, -0x3f600000    # -5.0f

    .line 836
    .line 837
    const v7, 0x400f5c29    # 2.24f

    .line 838
    .line 839
    .line 840
    const/high16 v8, 0x40a00000    # 5.0f

    .line 841
    .line 842
    invoke-virtual {v2, v4, v7, v6, v8}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 843
    .line 844
    .line 845
    const/high16 v4, 0x3f800000    # 1.0f

    .line 846
    .line 847
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 848
    .line 849
    .line 850
    const/high16 v4, 0x41200000    # 10.0f

    .line 851
    .line 852
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 853
    .line 854
    .line 855
    const/high16 v4, 0x41300000    # 11.0f

    .line 856
    .line 857
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 858
    .line 859
    .line 860
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 861
    .line 862
    .line 863
    const v4, 0x4108a3d7    # 8.54f

    .line 864
    .line 865
    .line 866
    const/high16 v6, 0x41280000    # 10.5f

    .line 867
    .line 868
    invoke-virtual {v2, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 869
    .line 870
    .line 871
    const v25, 0x405d70a4    # 3.46f

    .line 872
    .line 873
    .line 874
    const/high16 v26, -0x3fc00000    # -3.0f

    .line 875
    .line 876
    const v21, 0x3e75c28f    # 0.24f

    .line 877
    .line 878
    .line 879
    const v22, -0x4027ae14    # -1.69f

    .line 880
    .line 881
    .line 882
    const v23, 0x3fd9999a    # 1.7f

    .line 883
    .line 884
    .line 885
    const/high16 v24, -0x3fc00000    # -3.0f

    .line 886
    .line 887
    invoke-virtual/range {v20 .. v26}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 888
    .line 889
    .line 890
    const v4, 0x405e147b    # 3.47f

    .line 891
    .line 892
    .line 893
    const/high16 v6, 0x40400000    # 3.0f

    .line 894
    .line 895
    const v7, 0x404e147b    # 3.22f

    .line 896
    .line 897
    .line 898
    const v8, 0x3fa7ae14    # 1.31f

    .line 899
    .line 900
    .line 901
    invoke-virtual {v2, v7, v8, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->reflectiveCurveToRelative(FFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 902
    .line 903
    .line 904
    const v4, 0x4108a3d7    # 8.54f

    .line 905
    .line 906
    .line 907
    invoke-virtual {v2, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->horizontalLineTo(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 908
    .line 909
    .line 910
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 911
    .line 912
    .line 913
    invoke-virtual {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 914
    .line 915
    .line 916
    move-result-object v2

    .line 917
    const/high16 v6, 0x3f800000    # 1.0f

    .line 918
    .line 919
    const/high16 v8, 0x3f800000    # 1.0f

    .line 920
    .line 921
    const/4 v7, 0x0

    .line 922
    const-string v4, ""

    .line 923
    .line 924
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 925
    .line 926
    .line 927
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 928
    .line 929
    .line 930
    move-result v3

    .line 931
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 932
    .line 933
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 934
    .line 935
    .line 936
    move-result-wide v6

    .line 937
    const/4 v2, 0x0

    .line 938
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 939
    .line 940
    .line 941
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 942
    .line 943
    .line 944
    move-result v10

    .line 945
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 946
    .line 947
    .line 948
    move-result v11

    .line 949
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 950
    .line 951
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 952
    .line 953
    .line 954
    const/high16 v4, 0x41880000    # 17.0f

    .line 955
    .line 956
    const/high16 v6, 0x41100000    # 9.0f

    .line 957
    .line 958
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 959
    .line 960
    .line 961
    const/4 v4, 0x0

    .line 962
    const/high16 v6, -0x40800000    # -1.0f

    .line 963
    .line 964
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 965
    .line 966
    .line 967
    const/high16 v26, 0x40000000    # 2.0f

    .line 968
    .line 969
    const/high16 v21, 0x3f800000    # 1.0f

    .line 970
    .line 971
    const/high16 v22, 0x3f800000    # 1.0f

    .line 972
    .line 973
    const/16 v23, 0x0

    .line 974
    .line 975
    const/16 v24, 0x1

    .line 976
    .line 977
    const/16 v25, 0x1

    .line 978
    .line 979
    move-object/from16 v20, v2

    .line 980
    .line 981
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 982
    .line 983
    .line 984
    const/high16 v26, -0x40000000    # -2.0f

    .line 985
    .line 986
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 987
    .line 988
    .line 989
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 990
    .line 991
    .line 992
    move-result-object v2

    .line 993
    const/high16 v6, 0x3f800000    # 1.0f

    .line 994
    .line 995
    const/4 v7, 0x0

    .line 996
    const-string v4, ""

    .line 997
    .line 998
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 999
    .line 1000
    .line 1001
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1002
    .line 1003
    .line 1004
    move-result v3

    .line 1005
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1006
    .line 1007
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1008
    .line 1009
    .line 1010
    move-result-wide v6

    .line 1011
    const/4 v2, 0x0

    .line 1012
    invoke-direct {v5, v6, v7, v2}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1013
    .line 1014
    .line 1015
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1016
    .line 1017
    .line 1018
    move-result v10

    .line 1019
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1020
    .line 1021
    .line 1022
    move-result v11

    .line 1023
    new-instance v2, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1024
    .line 1025
    invoke-direct {v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1026
    .line 1027
    .line 1028
    const/high16 v4, 0x41600000    # 14.0f

    .line 1029
    .line 1030
    const/high16 v6, 0x41100000    # 9.0f

    .line 1031
    .line 1032
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1033
    .line 1034
    .line 1035
    const/4 v4, 0x0

    .line 1036
    const/high16 v6, -0x40800000    # -1.0f

    .line 1037
    .line 1038
    invoke-virtual {v2, v6, v4}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1039
    .line 1040
    .line 1041
    const/high16 v26, 0x40000000    # 2.0f

    .line 1042
    .line 1043
    move-object/from16 v20, v2

    .line 1044
    .line 1045
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1046
    .line 1047
    .line 1048
    const/high16 v26, -0x40000000    # -2.0f

    .line 1049
    .line 1050
    invoke-virtual/range {v20 .. v27}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1051
    .line 1052
    .line 1053
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v2

    .line 1057
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1058
    .line 1059
    const/4 v7, 0x0

    .line 1060
    const-string v4, ""

    .line 1061
    .line 1062
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1063
    .line 1064
    .line 1065
    invoke-static {}, Landroidx/compose/ui/graphics/vector/VectorKt;->getDefaultFillType()I

    .line 1066
    .line 1067
    .line 1068
    move-result v3

    .line 1069
    new-instance v5, Landroidx/compose/ui/graphics/SolidColor;

    .line 1070
    .line 1071
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color$Companion;->getBlack-0d7_KjU()J

    .line 1072
    .line 1073
    .line 1074
    move-result-wide v6

    .line 1075
    const/4 v0, 0x0

    .line 1076
    invoke-direct {v5, v6, v7, v0}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 1077
    .line 1078
    .line 1079
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/graphics/StrokeCap$Companion;->getButt-KaPHkGw()I

    .line 1080
    .line 1081
    .line 1082
    move-result v10

    .line 1083
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/graphics/StrokeJoin$Companion;->getBevel-LxFBmk8()I

    .line 1084
    .line 1085
    .line 1086
    move-result v11

    .line 1087
    new-instance v12, Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1088
    .line 1089
    invoke-direct {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;-><init>()V

    .line 1090
    .line 1091
    .line 1092
    const/high16 v0, 0x41880000    # 17.0f

    .line 1093
    .line 1094
    const/high16 v2, 0x41400000    # 12.0f

    .line 1095
    .line 1096
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1097
    .line 1098
    .line 1099
    const/4 v0, 0x0

    .line 1100
    const/high16 v2, -0x40800000    # -1.0f

    .line 1101
    .line 1102
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1103
    .line 1104
    .line 1105
    const/high16 v18, 0x40000000    # 2.0f

    .line 1106
    .line 1107
    const/16 v19, 0x0

    .line 1108
    .line 1109
    const/high16 v13, 0x3f800000    # 1.0f

    .line 1110
    .line 1111
    const/high16 v14, 0x3f800000    # 1.0f

    .line 1112
    .line 1113
    const/16 v16, 0x1

    .line 1114
    .line 1115
    const/16 v17, 0x1

    .line 1116
    .line 1117
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1118
    .line 1119
    .line 1120
    const/high16 v18, -0x40000000    # -2.0f

    .line 1121
    .line 1122
    invoke-virtual/range {v12 .. v19}, Landroidx/compose/ui/graphics/vector/PathBuilder;->arcToRelative(FFFZZFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 1123
    .line 1124
    .line 1125
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v2

    .line 1129
    const/16 v16, 0x3800

    .line 1130
    .line 1131
    const/16 v17, 0x0

    .line 1132
    .line 1133
    const/high16 v6, 0x3f800000    # 1.0f

    .line 1134
    .line 1135
    const/4 v7, 0x0

    .line 1136
    const/high16 v12, 0x3f800000    # 1.0f

    .line 1137
    .line 1138
    const/4 v13, 0x0

    .line 1139
    const/4 v14, 0x0

    .line 1140
    const-string v4, ""

    .line 1141
    .line 1142
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v0

    .line 1146
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1147
    .line 1148
    .line 1149
    move-result-object v0

    .line 1150
    sput-object v0, Landroidx/compose/material/icons/twotone/BathroomKt;->_bathroom:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 1151
    .line 1152
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 1153
    .line 1154
    .line 1155
    return-object v0
.end method
