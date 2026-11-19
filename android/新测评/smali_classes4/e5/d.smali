.class public final Le5/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Le5/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le5/d;

    .line 2
    .line 3
    invoke-direct {v0}, Le5/d;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Le5/d;->a:Le5/d;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;Landroid/graphics/Matrix;)V
    .locals 16

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    move-object/from16 v0, p3

    .line 6
    .line 7
    const-string v3, "canvas"

    .line 8
    .line 9
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v3, "largeBitmap"

    .line 13
    .line 14
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v3, "matrix"

    .line 18
    .line 19
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getAllocationByteCount()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    int-to-long v3, v3

    .line 34
    const-wide/32 v5, 0x6400000

    .line 35
    .line 36
    .line 37
    cmp-long v5, v3, v5

    .line 38
    .line 39
    if-ltz v5, :cond_1

    .line 40
    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    const-string v1, "CanvasUtils: \u62d2\u7edd\u7ed8\u5236\u8fc7\u5927\u56fe\u7247("

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v1, " bytes)\uff0c\u9632\u6b62\u7cfb\u7edf\u5d29\u6e83\u3002"

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 74
    .line 75
    .line 76
    const-string v4, "CanvasUtils\uff1a\u5f00\u59cb\u6267\u884cCanvasUtils\u7ed8\u5236\uff0c\u56fe\u7247\u5927\u5c0f: "

    .line 77
    .line 78
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const/16 v4, 0x78

    .line 89
    .line 90
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    invoke-static {v3}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1}, Landroid/graphics/Canvas;->getMaximumBitmapWidth()I

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    invoke-virtual {v1}, Landroid/graphics/Canvas;->getMaximumBitmapHeight()I

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 124
    .line 125
    .line 126
    move-result v6

    .line 127
    new-instance v7, Landroid/graphics/Rect;

    .line 128
    .line 129
    invoke-direct {v7}, Landroid/graphics/Rect;-><init>()V

    .line 130
    .line 131
    .line 132
    new-instance v8, Landroid/graphics/RectF;

    .line 133
    .line 134
    invoke-direct {v8}, Landroid/graphics/RectF;-><init>()V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 138
    .line 139
    .line 140
    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 141
    .line 142
    .line 143
    add-int v0, v5, v3

    .line 144
    .line 145
    add-int/lit8 v0, v0, -0x1

    .line 146
    .line 147
    div-int v9, v0, v3

    .line 148
    .line 149
    add-int v0, v6, v4

    .line 150
    .line 151
    add-int/lit8 v0, v0, -0x1

    .line 152
    .line 153
    div-int v10, v0, v4

    .line 154
    .line 155
    const/4 v12, 0x0

    .line 156
    :goto_0
    if-ge v12, v9, :cond_3

    .line 157
    .line 158
    const/4 v0, 0x0

    .line 159
    :goto_1
    if-ge v0, v10, :cond_2

    .line 160
    .line 161
    mul-int v13, v12, v3

    .line 162
    .line 163
    mul-int v14, v0, v4

    .line 164
    .line 165
    add-int v15, v13, v3

    .line 166
    .line 167
    invoke-static {v15, v5}, Ljava/lang/Math;->min(II)I

    .line 168
    .line 169
    .line 170
    move-result v15

    .line 171
    add-int v11, v14, v4

    .line 172
    .line 173
    invoke-static {v11, v6}, Ljava/lang/Math;->min(II)I

    .line 174
    .line 175
    .line 176
    move-result v11

    .line 177
    invoke-virtual {v7, v13, v14, v15, v11}, Landroid/graphics/Rect;->set(IIII)V

    .line 178
    .line 179
    .line 180
    iget v11, v7, Landroid/graphics/Rect;->left:I

    .line 181
    .line 182
    int-to-float v11, v11

    .line 183
    iget v13, v7, Landroid/graphics/Rect;->top:I

    .line 184
    .line 185
    int-to-float v13, v13

    .line 186
    iget v14, v7, Landroid/graphics/Rect;->right:I

    .line 187
    .line 188
    int-to-float v14, v14

    .line 189
    iget v15, v7, Landroid/graphics/Rect;->bottom:I

    .line 190
    .line 191
    int-to-float v15, v15

    .line 192
    invoke-virtual {v8, v11, v13, v14, v15}, Landroid/graphics/RectF;->set(FFFF)V

    .line 193
    .line 194
    .line 195
    const/4 v11, 0x0

    .line 196
    :try_start_0
    invoke-virtual {v1, v2, v7, v8, v11}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 197
    .line 198
    .line 199
    add-int/lit8 v0, v0, 0x1

    .line 200
    .line 201
    goto :goto_1

    .line 202
    :catch_0
    move-exception v0

    .line 203
    new-instance v11, Ljava/lang/StringBuilder;

    .line 204
    .line 205
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 206
    .line 207
    .line 208
    const-string v13, "CanvasUtils drawBitmap \u5931\u8d25: "

    .line 209
    .line 210
    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    :cond_2
    add-int/lit8 v12, v12, 0x1

    .line 232
    .line 233
    goto :goto_0

    .line 234
    :cond_3
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 235
    .line 236
    .line 237
    return-void
.end method
