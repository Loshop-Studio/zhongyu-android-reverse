.class public final Lcom/zykj/blackboard/utils/CanvasUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final INSTANCE:Lcom/zykj/blackboard/utils/CanvasUtils;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/blackboard/utils/CanvasUtils;

    invoke-direct {v0}, Lcom/zykj/blackboard/utils/CanvasUtils;-><init>()V

    sput-object v0, Lcom/zykj/blackboard/utils/CanvasUtils;->INSTANCE:Lcom/zykj/blackboard/utils/CanvasUtils;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final drawLargeBitmap(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;Landroid/graphics/Matrix;)V
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    const-string v3, "canvas"

    .line 8
    .line 9
    invoke-static {v0, v3}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v3, "largeBitmap"

    .line 13
    .line 14
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v3, "matrix"

    .line 18
    .line 19
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/graphics/Canvas;->getMaximumBitmapWidth()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    invoke-virtual {v0}, Landroid/graphics/Canvas;->getMaximumBitmapHeight()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    div-int v7, v5, v3

    .line 39
    .line 40
    div-int v8, v6, v4

    .line 41
    .line 42
    new-instance v9, Landroid/graphics/Rect;

    .line 43
    .line 44
    invoke-direct {v9}, Landroid/graphics/Rect;-><init>()V

    .line 45
    .line 46
    .line 47
    new-instance v10, Landroid/graphics/Matrix;

    .line 48
    .line 49
    invoke-direct {v10}, Landroid/graphics/Matrix;-><init>()V

    .line 50
    .line 51
    .line 52
    const/4 v12, 0x0

    .line 53
    :goto_0
    if-ge v12, v7, :cond_1

    .line 54
    .line 55
    const/4 v14, 0x0

    .line 56
    :goto_1
    if-ge v14, v8, :cond_0

    .line 57
    .line 58
    mul-int v15, v12, v3

    .line 59
    .line 60
    mul-int v11, v14, v4

    .line 61
    .line 62
    add-int/lit8 v16, v12, 0x1

    .line 63
    .line 64
    mul-int v13, v16, v3

    .line 65
    .line 66
    add-int/lit8 v14, v14, 0x1

    .line 67
    .line 68
    move/from16 v16, v3

    .line 69
    .line 70
    mul-int v3, v14, v4

    .line 71
    .line 72
    invoke-virtual {v9, v15, v11, v13, v3}, Landroid/graphics/Rect;->set(IIII)V

    .line 73
    .line 74
    .line 75
    iget v3, v9, Landroid/graphics/Rect;->left:I

    .line 76
    .line 77
    iget v11, v9, Landroid/graphics/Rect;->top:I

    .line 78
    .line 79
    invoke-virtual {v9}, Landroid/graphics/Rect;->width()I

    .line 80
    .line 81
    .line 82
    move-result v13

    .line 83
    invoke-virtual {v9}, Landroid/graphics/Rect;->height()I

    .line 84
    .line 85
    .line 86
    move-result v15

    .line 87
    invoke-static {v1, v3, v11, v13, v15}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    iget v11, v9, Landroid/graphics/Rect;->left:I

    .line 92
    .line 93
    int-to-float v11, v11

    .line 94
    iget v13, v9, Landroid/graphics/Rect;->top:I

    .line 95
    .line 96
    int-to-float v13, v13

    .line 97
    invoke-virtual {v10, v11, v13}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v10, v2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 101
    .line 102
    .line 103
    const/4 v11, 0x0

    .line 104
    invoke-virtual {v0, v3, v10, v11}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 105
    .line 106
    .line 107
    move/from16 v3, v16

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_0
    move/from16 v16, v3

    .line 111
    .line 112
    mul-int v3, v12, v16

    .line 113
    .line 114
    mul-int v11, v8, v4

    .line 115
    .line 116
    add-int/lit8 v12, v12, 0x1

    .line 117
    .line 118
    mul-int v13, v12, v16

    .line 119
    .line 120
    invoke-virtual {v9, v3, v11, v13, v6}, Landroid/graphics/Rect;->set(IIII)V

    .line 121
    .line 122
    .line 123
    iget v3, v9, Landroid/graphics/Rect;->left:I

    .line 124
    .line 125
    iget v11, v9, Landroid/graphics/Rect;->top:I

    .line 126
    .line 127
    invoke-virtual {v9}, Landroid/graphics/Rect;->width()I

    .line 128
    .line 129
    .line 130
    move-result v13

    .line 131
    invoke-virtual {v9}, Landroid/graphics/Rect;->height()I

    .line 132
    .line 133
    .line 134
    move-result v14

    .line 135
    invoke-static {v1, v3, v11, v13, v14}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    iget v11, v9, Landroid/graphics/Rect;->left:I

    .line 140
    .line 141
    int-to-float v11, v11

    .line 142
    iget v13, v9, Landroid/graphics/Rect;->top:I

    .line 143
    .line 144
    int-to-float v13, v13

    .line 145
    invoke-virtual {v10, v11, v13}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v10, v2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 149
    .line 150
    .line 151
    const/4 v11, 0x0

    .line 152
    invoke-virtual {v0, v3, v10, v11}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 153
    .line 154
    .line 155
    move/from16 v3, v16

    .line 156
    .line 157
    goto :goto_0

    .line 158
    :cond_1
    move/from16 v16, v3

    .line 159
    .line 160
    const/4 v11, 0x0

    .line 161
    :goto_2
    if-ge v11, v8, :cond_2

    .line 162
    .line 163
    mul-int v3, v7, v16

    .line 164
    .line 165
    mul-int v12, v11, v4

    .line 166
    .line 167
    add-int/lit8 v11, v11, 0x1

    .line 168
    .line 169
    mul-int v13, v11, v4

    .line 170
    .line 171
    invoke-virtual {v9, v3, v12, v5, v13}, Landroid/graphics/Rect;->set(IIII)V

    .line 172
    .line 173
    .line 174
    iget v3, v9, Landroid/graphics/Rect;->left:I

    .line 175
    .line 176
    iget v12, v9, Landroid/graphics/Rect;->top:I

    .line 177
    .line 178
    invoke-virtual {v9}, Landroid/graphics/Rect;->width()I

    .line 179
    .line 180
    .line 181
    move-result v13

    .line 182
    invoke-virtual {v9}, Landroid/graphics/Rect;->height()I

    .line 183
    .line 184
    .line 185
    move-result v14

    .line 186
    invoke-static {v1, v3, v12, v13, v14}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    iget v12, v9, Landroid/graphics/Rect;->left:I

    .line 191
    .line 192
    int-to-float v12, v12

    .line 193
    iget v13, v9, Landroid/graphics/Rect;->top:I

    .line 194
    .line 195
    int-to-float v13, v13

    .line 196
    invoke-virtual {v10, v12, v13}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v10, v2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 200
    .line 201
    .line 202
    const/4 v12, 0x0

    .line 203
    invoke-virtual {v0, v3, v10, v12}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 204
    .line 205
    .line 206
    goto :goto_2

    .line 207
    :cond_2
    mul-int v7, v7, v16

    .line 208
    .line 209
    mul-int/2addr v8, v4

    .line 210
    invoke-virtual {v9, v7, v8, v5, v6}, Landroid/graphics/Rect;->set(IIII)V

    .line 211
    .line 212
    .line 213
    iget v3, v9, Landroid/graphics/Rect;->left:I

    .line 214
    .line 215
    iget v4, v9, Landroid/graphics/Rect;->top:I

    .line 216
    .line 217
    invoke-virtual {v9}, Landroid/graphics/Rect;->width()I

    .line 218
    .line 219
    .line 220
    move-result v5

    .line 221
    invoke-virtual {v9}, Landroid/graphics/Rect;->height()I

    .line 222
    .line 223
    .line 224
    move-result v6

    .line 225
    invoke-static {v1, v3, v4, v5, v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    iget v3, v9, Landroid/graphics/Rect;->left:I

    .line 230
    .line 231
    int-to-float v3, v3

    .line 232
    iget v4, v9, Landroid/graphics/Rect;->top:I

    .line 233
    .line 234
    int-to-float v4, v4

    .line 235
    invoke-virtual {v10, v3, v4}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v10, v2}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 239
    .line 240
    .line 241
    const/4 v11, 0x0

    .line 242
    invoke-virtual {v0, v1, v10, v11}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V

    .line 243
    .line 244
    .line 245
    return-void
.end method
