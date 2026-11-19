.class public final Landroidx/compose/material/icons/rounded/CallEndKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "_callEnd",
        "Landroidx/compose/ui/graphics/vector/ImageVector;",
        "CallEnd",
        "Landroidx/compose/material/icons/Icons$Rounded;",
        "getCallEnd",
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
        "SMAP\nCallEnd.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallEnd.kt\nandroidx/compose/material/icons/rounded/CallEndKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,53:1\n212#2,12:54\n233#2,18:67\n253#2:104\n174#3:66\n705#4,2:85\n717#4,2:87\n719#4,11:93\n72#5,4:89\n*S KotlinDebug\n*F\n+ 1 CallEnd.kt\nandroidx/compose/material/icons/rounded/CallEndKt\n*L\n29#1:54,12\n30#1:67,18\n30#1:104\n29#1:66\n30#1:85,2\n30#1:87,2\n30#1:93,11\n30#1:89,4\n*E\n"
    }
.end annotation


# static fields
.field private static _callEnd:Landroidx/compose/ui/graphics/vector/ImageVector;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final getCallEnd(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;
    .locals 19

    .line 1
    sget-object v0, Landroidx/compose/material/icons/rounded/CallEndKt;->_callEnd:Landroidx/compose/ui/graphics/vector/ImageVector;

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
    const-string v2, "Rounded.CallEnd"

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
    const v0, 0x409051ec    # 4.51f

    .line 71
    .line 72
    .line 73
    const v2, 0x4177ae14    # 15.48f

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->moveTo(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 77
    .line 78
    .line 79
    const/high16 v0, 0x40000000    # 2.0f

    .line 80
    .line 81
    const v2, -0x40347ae1    # -1.59f

    .line 82
    .line 83
    .line 84
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 85
    .line 86
    .line 87
    const v17, 0x3f428f5c    # 0.76f

    .line 88
    .line 89
    .line 90
    const v18, -0x40370a3d    # -1.57f

    .line 91
    .line 92
    .line 93
    const v13, 0x3ef5c28f    # 0.48f

    .line 94
    .line 95
    .line 96
    const v14, -0x413d70a4    # -0.38f

    .line 97
    .line 98
    .line 99
    const v15, 0x3f428f5c    # 0.76f

    .line 100
    .line 101
    .line 102
    const v16, -0x408a3d71    # -0.96f

    .line 103
    .line 104
    .line 105
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 106
    .line 107
    .line 108
    const v0, -0x3fd9999a    # -2.6f

    .line 109
    .line 110
    .line 111
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 112
    .line 113
    .line 114
    const v17, 0x41151eb8    # 9.32f

    .line 115
    .line 116
    .line 117
    const/16 v18, 0x0

    .line 118
    .line 119
    const v13, 0x404147ae    # 3.02f

    .line 120
    .line 121
    .line 122
    const v14, -0x40851eb8    # -0.98f

    .line 123
    .line 124
    .line 125
    const v15, 0x40c947ae    # 6.29f

    .line 126
    .line 127
    .line 128
    const v16, -0x40828f5c    # -0.99f

    .line 129
    .line 130
    .line 131
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 132
    .line 133
    .line 134
    const v0, 0x40270a3d    # 2.61f

    .line 135
    .line 136
    .line 137
    invoke-virtual {v12, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->verticalLineToRelative(F)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 138
    .line 139
    .line 140
    const v17, 0x3f428f5c    # 0.76f

    .line 141
    .line 142
    .line 143
    const v18, 0x3fc8f5c3    # 1.57f

    .line 144
    .line 145
    .line 146
    const/4 v13, 0x0

    .line 147
    const v14, 0x3f1c28f6    # 0.61f

    .line 148
    .line 149
    .line 150
    const v15, 0x3e8f5c29    # 0.28f

    .line 151
    .line 152
    .line 153
    const v16, 0x3f9851ec    # 1.19f

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 157
    .line 158
    .line 159
    const v0, 0x3ffeb852    # 1.99f

    .line 160
    .line 161
    .line 162
    const v2, 0x3fca3d71    # 1.58f

    .line 163
    .line 164
    .line 165
    invoke-virtual {v12, v0, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 166
    .line 167
    .line 168
    const v17, 0x402a3d71    # 2.66f

    .line 169
    .line 170
    .line 171
    const v18, -0x41e66666    # -0.15f

    .line 172
    .line 173
    .line 174
    const v13, 0x3f4ccccd    # 0.8f

    .line 175
    .line 176
    .line 177
    const v14, 0x3f2147ae    # 0.63f

    .line 178
    .line 179
    .line 180
    const v15, 0x3ff851ec    # 1.94f

    .line 181
    .line 182
    .line 183
    const v16, 0x3f11eb85    # 0.57f

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 187
    .line 188
    .line 189
    const v0, -0x4063d70a    # -1.22f

    .line 190
    .line 191
    .line 192
    const v2, 0x3f9c28f6    # 1.22f

    .line 193
    .line 194
    .line 195
    invoke-virtual {v12, v2, v0}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 196
    .line 197
    .line 198
    const v17, -0x42b33333    # -0.05f

    .line 199
    .line 200
    .line 201
    const v18, -0x3fc7ae14    # -2.88f

    .line 202
    .line 203
    .line 204
    const v14, -0x40b33333    # -0.8f

    .line 205
    .line 206
    .line 207
    const v15, 0x3f4ccccd    # 0.8f

    .line 208
    .line 209
    .line 210
    const v16, -0x3ff7ae14    # -2.13f

    .line 211
    .line 212
    .line 213
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 214
    .line 215
    .line 216
    const v17, -0x3e4c28f6    # -22.48f

    .line 217
    .line 218
    .line 219
    const/16 v18, 0x0

    .line 220
    .line 221
    const v13, -0x3f32e148    # -6.41f

    .line 222
    .line 223
    .line 224
    const v14, -0x3f4ae148    # -5.66f

    .line 225
    .line 226
    .line 227
    const v15, -0x3e7f70a4    # -16.07f

    .line 228
    .line 229
    .line 230
    const v16, -0x3f4ae148    # -5.66f

    .line 231
    .line 232
    .line 233
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 234
    .line 235
    .line 236
    const v17, -0x42b33333    # -0.05f

    .line 237
    .line 238
    .line 239
    const v18, 0x403851ec    # 2.88f

    .line 240
    .line 241
    .line 242
    const v13, -0x40a66666    # -0.85f

    .line 243
    .line 244
    .line 245
    const/high16 v14, 0x3f400000    # 0.75f

    .line 246
    .line 247
    const v15, -0x40a66666    # -0.85f

    .line 248
    .line 249
    .line 250
    const v16, 0x40051eb8    # 2.08f

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v12, v2, v2}, Landroidx/compose/ui/graphics/vector/PathBuilder;->lineToRelative(FF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 257
    .line 258
    .line 259
    const v17, 0x4029999a    # 2.65f

    .line 260
    .line 261
    .line 262
    const v18, 0x3e19999a    # 0.15f

    .line 263
    .line 264
    .line 265
    const v13, 0x3f35c28f    # 0.71f

    .line 266
    .line 267
    .line 268
    const v14, 0x3f3851ec    # 0.72f

    .line 269
    .line 270
    .line 271
    const v15, 0x3feccccd    # 1.85f

    .line 272
    .line 273
    .line 274
    const v16, 0x3f47ae14    # 0.78f

    .line 275
    .line 276
    .line 277
    invoke-virtual/range {v12 .. v18}, Landroidx/compose/ui/graphics/vector/PathBuilder;->curveToRelative(FFFFFF)Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->close()Landroidx/compose/ui/graphics/vector/PathBuilder;

    .line 281
    .line 282
    .line 283
    invoke-virtual {v12}, Landroidx/compose/ui/graphics/vector/PathBuilder;->getNodes()Ljava/util/List;

    .line 284
    .line 285
    .line 286
    move-result-object v2

    .line 287
    const/16 v16, 0x3800

    .line 288
    .line 289
    const/16 v17, 0x0

    .line 290
    .line 291
    const-string v4, ""

    .line 292
    .line 293
    const/high16 v6, 0x3f800000    # 1.0f

    .line 294
    .line 295
    const/4 v7, 0x0

    .line 296
    const/high16 v8, 0x3f800000    # 1.0f

    .line 297
    .line 298
    const/high16 v9, 0x3f800000    # 1.0f

    .line 299
    .line 300
    const/high16 v12, 0x3f800000    # 1.0f

    .line 301
    .line 302
    const/4 v13, 0x0

    .line 303
    const/4 v14, 0x0

    .line 304
    const/4 v15, 0x0

    .line 305
    invoke-static/range {v1 .. v17}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->addPath-oIyEayM$default(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFILjava/lang/Object;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/vector/ImageVector$Builder;->build()Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    sput-object v0, Landroidx/compose/material/icons/rounded/CallEndKt;->_callEnd:Landroidx/compose/ui/graphics/vector/ImageVector;

    .line 314
    .line 315
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 316
    .line 317
    .line 318
    return-object v0
.end method
