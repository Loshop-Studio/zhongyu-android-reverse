.class public final Landroidx/compose/material/icons/sharp/BeachAccessKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_beachAccess",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "BeachAccess",
        "Landroidx/compose/material/icons/Icons$Sharp;",
        "getBeachAccess",
        "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;",
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
        "SMAP\nBeachAccess.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BeachAccess.kt\nandroidx/compose/material/icons/sharp/BeachAccessKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,58:1\n212#2,12:59\n233#2,18:72\n253#2:109\n174#3:71\n705#4,2:90\n717#4,2:92\n719#4,11:98\n72#5,4:94\n*S KotlinDebug\n*F\n+ 1 BeachAccess.kt\nandroidx/compose/material/icons/sharp/BeachAccessKt\n*L\n29#1:59,12\n30#1:72,18\n30#1:109\n29#1:71\n30#1:90,2\n30#1:92,2\n30#1:98,11\n30#1:94,4\n*E\n"
    }
.end annotation


# static fields
.field private static _beachAccess:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getBeachAccess(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/sharp/BeachAccessKt;->_beachAccess:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Sharp.BeachAccess"

    .line 25
    .line 26
    const/high16 v5, 0x41c00000    # 24.0f

    .line 27
    .line 28
    const/high16 v6, 0x41c00000    # 24.0f

    .line 29
    .line 30
    const-wide/16 v7, 0x0

    .line 31
    .line 32
    const/4 v9, 0x0

    .line 33
    const/4 v10, 0x0

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
    const v0, 0x40be6666    # 5.95f

    .line 71
    .line 72
    .line 73
    const v2, 0x40bf5c29    # 5.98f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const v17, 0x3ca3d70a    # 0.02f

    .line 80
    .line 81
    .line 82
    const v18, 0x4164cccd    # 14.3f

    .line 83
    .line 84
    .line 85
    const v13, -0x3f83d70a    # -3.94f

    .line 86
    .line 87
    .line 88
    const v14, 0x407ccccd    # 3.95f

    .line 89
    .line 90
    .line 91
    const v15, -0x3f847ae1    # -3.93f

    .line 92
    .line 93
    .line 94
    const v16, 0x4125999a    # 10.35f

    .line 95
    .line 96
    .line 97
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 98
    .line 99
    .line 100
    const v0, 0x40370a3d    # 2.86f

    .line 101
    .line 102
    .line 103
    const v2, -0x3fc8f5c3    # -2.86f

    .line 104
    .line 105
    .line 106
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 107
    .line 108
    .line 109
    const v17, 0x40be6666    # 5.95f

    .line 110
    .line 111
    .line 112
    const v18, 0x40bf5c29    # 5.98f

    .line 113
    .line 114
    .line 115
    const v13, 0x40b66666    # 5.7f

    .line 116
    .line 117
    .line 118
    const v14, 0x4164a3d7    # 14.29f

    .line 119
    .line 120
    .line 121
    const v15, 0x4094cccd    # 4.65f

    .line 122
    .line 123
    .line 124
    const v16, 0x411e8f5c    # 9.91f

    .line 125
    .line 126
    .line 127
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveTo(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 131
    .line 132
    .line 133
    const v4, 0x418b5c29    # 17.42f

    .line 134
    .line 135
    .line 136
    const v6, 0x410d47ae    # 8.83f

    .line 137
    .line 138
    .line 139
    invoke-virtual {v12, v4, v6}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 143
    .line 144
    .line 145
    const v17, -0x3e9b3333    # -14.3f

    .line 146
    .line 147
    .line 148
    const v18, -0x435c28f6    # -0.02f

    .line 149
    .line 150
    .line 151
    const v13, -0x3f833333    # -3.95f

    .line 152
    .line 153
    .line 154
    const v14, -0x3f833333    # -3.95f

    .line 155
    .line 156
    .line 157
    const v15, -0x3eda6666    # -10.35f

    .line 158
    .line 159
    .line 160
    const v16, -0x3f828f5c    # -3.96f

    .line 161
    .line 162
    .line 163
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 164
    .line 165
    .line 166
    const v17, 0x41370a3d    # 11.44f

    .line 167
    .line 168
    .line 169
    const v18, 0x403851ec    # 2.88f

    .line 170
    .line 171
    .line 172
    const v13, 0x407b851f    # 3.93f

    .line 173
    .line 174
    .line 175
    const v14, -0x4059999a    # -1.3f

    .line 176
    .line 177
    .line 178
    const v15, 0x4104f5c3    # 8.31f

    .line 179
    .line 180
    .line 181
    const/high16 v16, -0x41800000    # -0.25f

    .line 182
    .line 183
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v0, 0x40bf0a3d    # 5.97f

    .line 190
    .line 191
    .line 192
    const v2, 0x40beb852    # 5.96f

    .line 193
    .line 194
    .line 195
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v0, -0x43dc28f6    # -0.01f

    .line 199
    .line 200
    .line 201
    const v2, 0x3c23d70a    # 0.01f

    .line 202
    .line 203
    .line 204
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 205
    .line 206
    .line 207
    const v17, 0x4089999a    # 4.3f

    .line 208
    .line 209
    .line 210
    const v18, 0x412051ec    # 10.02f

    .line 211
    .line 212
    .line 213
    const v13, -0x413d70a4    # -0.38f

    .line 214
    .line 215
    .line 216
    const v14, 0x4040a3d7    # 3.01f

    .line 217
    .line 218
    .line 219
    const v15, 0x3f95c28f    # 1.17f

    .line 220
    .line 221
    .line 222
    const v16, 0x40dc28f6    # 6.88f

    .line 223
    .line 224
    .line 225
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 226
    .line 227
    .line 228
    const v0, 0x40b75c29    # 5.73f

    .line 229
    .line 230
    .line 231
    const v2, -0x3f48a3d7    # -5.73f

    .line 232
    .line 233
    .line 234
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 235
    .line 236
    .line 237
    const v17, -0x3edfae14    # -10.02f

    .line 238
    .line 239
    .line 240
    const v18, -0x3f766666    # -4.3f

    .line 241
    .line 242
    .line 243
    const v13, -0x3fb7ae14    # -3.13f

    .line 244
    .line 245
    .line 246
    const v14, -0x3fb7ae14    # -3.13f

    .line 247
    .line 248
    .line 249
    const v15, -0x3f1fae14    # -7.01f

    .line 250
    .line 251
    .line 252
    const v16, -0x3f6a3d71    # -4.68f

    .line 253
    .line 254
    .line 255
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 259
    .line 260
    .line 261
    const v0, 0x41520419    # 13.126f

    .line 262
    .line 263
    .line 264
    const v2, 0x4168f5c3    # 14.56f

    .line 265
    .line 266
    .line 267
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 268
    .line 269
    .line 270
    const v0, -0x4049374c    # -1.428f

    .line 271
    .line 272
    .line 273
    const v2, 0x3fb6c8b4    # 1.428f

    .line 274
    .line 275
    .line 276
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 277
    .line 278
    .line 279
    const v0, 0x40ce24dd    # 6.442f

    .line 280
    .line 281
    .line 282
    invoke-virtual {v12, v0, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 283
    .line 284
    .line 285
    const v0, -0x4048f5c3    # -1.43f

    .line 286
    .line 287
    .line 288
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 295
    .line 296
    .line 297
    move-result-object v2

    .line 298
    const/16 v16, 0x3800

    .line 299
    .line 300
    const/16 v17, 0x0

    .line 301
    .line 302
    const-string v4, ""

    .line 303
    .line 304
    const/high16 v6, 0x3f800000    # 1.0f

    .line 305
    .line 306
    const/4 v7, 0x0

    .line 307
    const/high16 v8, 0x3f800000    # 1.0f

    .line 308
    .line 309
    const/high16 v9, 0x3f800000    # 1.0f

    .line 310
    .line 311
    const/high16 v12, 0x3f800000    # 1.0f

    .line 312
    .line 313
    const/4 v13, 0x0

    .line 314
    const/4 v14, 0x0

    .line 315
    const/4 v15, 0x0

    .line 316
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    sput-object v0, Landroidx/compose/material/icons/sharp/BeachAccessKt;->_beachAccess:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 325
    .line 326
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 327
    .line 328
    .line 329
    return-object v0
.end method
