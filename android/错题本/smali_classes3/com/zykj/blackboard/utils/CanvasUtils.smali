.class public final Lcom/zykj/blackboard/utils/CanvasUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/zykj/blackboard/utils/CanvasUtils;",
        "",
        "<init>",
        "()V",
        "Landroid/graphics/Canvas;",
        "canvas",
        "Landroid/graphics/Bitmap;",
        "largeBitmap",
        "Landroid/graphics/Matrix;",
        "matrix",
        "Ld6/s;",
        "drawLargeBitmap",
        "(Landroid/graphics/Canvas;Landroid/graphics/Bitmap;Landroid/graphics/Matrix;)V",
        "",
        "MAX_SAFE_BITMAP_BYTES",
        "J",
        "blackboard_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/zykj/blackboard/utils/CanvasUtils;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final MAX_SAFE_BITMAP_BYTES:J = 0x6400000L


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
    .locals 16
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Bitmap;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/Matrix;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

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
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v3, "largeBitmap"

    .line 13
    .line 14
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v3, "matrix"

    .line 18
    .line 19
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

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
    const-string v1, "CanvasUtils: \u62d2\u7edd\u7ed8\u5236\u8fc7\u5927\u56fe\u7247("

    .line 44
    .line 45
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v1, " bytes)\uff0c\u9632\u6b62\u7cfb\u7edf\u5d29\u6e83\u3002"

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {v0}, Lcom/blankj/utilcode/util/g;->b([Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    const-string v4, "CanvasUtils\uff1a\u5f00\u59cb\u6267\u884cCanvasUtils\u7ed8\u5236\uff0c\u56fe\u7247\u5927\u5c0f: "

    .line 71
    .line 72
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const/16 v4, 0x78

    .line 83
    .line 84
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-static {v3}, Lcom/blankj/utilcode/util/g;->a([Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1}, Landroid/graphics/Canvas;->getMaximumBitmapWidth()I

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    invoke-virtual {v1}, Landroid/graphics/Canvas;->getMaximumBitmapHeight()I

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 118
    .line 119
    .line 120
    move-result v6

    .line 121
    new-instance v7, Landroid/graphics/Rect;

    .line 122
    .line 123
    invoke-direct {v7}, Landroid/graphics/Rect;-><init>()V

    .line 124
    .line 125
    .line 126
    new-instance v8, Landroid/graphics/RectF;

    .line 127
    .line 128
    invoke-direct {v8}, Landroid/graphics/RectF;-><init>()V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 135
    .line 136
    .line 137
    add-int v0, v5, v3

    .line 138
    .line 139
    add-int/lit8 v0, v0, -0x1

    .line 140
    .line 141
    div-int v9, v0, v3

    .line 142
    .line 143
    add-int v0, v6, v4

    .line 144
    .line 145
    add-int/lit8 v0, v0, -0x1

    .line 146
    .line 147
    div-int v10, v0, v4

    .line 148
    .line 149
    const/4 v12, 0x0

    .line 150
    :goto_0
    if-ge v12, v9, :cond_3

    .line 151
    .line 152
    const/4 v0, 0x0

    .line 153
    :goto_1
    if-ge v0, v10, :cond_2

    .line 154
    .line 155
    mul-int v13, v12, v3

    .line 156
    .line 157
    mul-int v14, v0, v4

    .line 158
    .line 159
    add-int v15, v13, v3

    .line 160
    .line 161
    invoke-static {v15, v5}, Ljava/lang/Math;->min(II)I

    .line 162
    .line 163
    .line 164
    move-result v15

    .line 165
    add-int v11, v14, v4

    .line 166
    .line 167
    invoke-static {v11, v6}, Ljava/lang/Math;->min(II)I

    .line 168
    .line 169
    .line 170
    move-result v11

    .line 171
    invoke-virtual {v7, v13, v14, v15, v11}, Landroid/graphics/Rect;->set(IIII)V

    .line 172
    .line 173
    .line 174
    iget v11, v7, Landroid/graphics/Rect;->left:I

    .line 175
    .line 176
    int-to-float v11, v11

    .line 177
    iget v13, v7, Landroid/graphics/Rect;->top:I

    .line 178
    .line 179
    int-to-float v13, v13

    .line 180
    iget v14, v7, Landroid/graphics/Rect;->right:I

    .line 181
    .line 182
    int-to-float v14, v14

    .line 183
    iget v15, v7, Landroid/graphics/Rect;->bottom:I

    .line 184
    .line 185
    int-to-float v15, v15

    .line 186
    invoke-virtual {v8, v11, v13, v14, v15}, Landroid/graphics/RectF;->set(FFFF)V

    .line 187
    .line 188
    .line 189
    const/4 v11, 0x0

    .line 190
    :try_start_0
    invoke-virtual {v1, v2, v7, v8, v11}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 191
    .line 192
    .line 193
    add-int/lit8 v0, v0, 0x1

    .line 194
    .line 195
    goto :goto_1

    .line 196
    :catch_0
    move-exception v0

    .line 197
    new-instance v11, Ljava/lang/StringBuilder;

    .line 198
    .line 199
    const-string v13, "CanvasUtils drawBitmap \u5931\u8d25: "

    .line 200
    .line 201
    invoke-direct {v11, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-static {v0}, Lcom/blankj/utilcode/util/g;->b([Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    :cond_2
    add-int/lit8 v12, v12, 0x1

    .line 223
    .line 224
    goto :goto_0

    .line 225
    :cond_3
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 226
    .line 227
    .line 228
    return-void
.end method
