.class public Lcom/tencent/liteav/renderer/a;
.super Lcom/tencent/liteav/renderer/e;
.source "SourceFile"

# interfaces
.implements Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/liteav/renderer/a$a;
    }
.end annotation


# instance fields
.field private A:Lcom/tencent/liteav/renderer/c;

.field private B:Lcom/tencent/liteav/basic/structs/TXSVideoFrame;

.field private C:Lcom/tencent/liteav/renderer/TXCYuvTextureRender;

.field private D:Ljava/lang/Object;

.field private E:Ljava/lang/Object;

.field private F:Lcom/tencent/liteav/renderer/h;

.field private G:Lcom/tencent/liteav/renderer/TXCYuvTextureRender;

.field private final H:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field a:Lcom/tencent/liteav/renderer/g;

.field b:Lcom/tencent/liteav/renderer/a$a;

.field c:Lcom/tencent/liteav/renderer/a$a;

.field private final q:I

.field private final r:I

.field private final s:I

.field private final t:I

.field private u:Ljava/lang/Object;

.field private v:Lcom/tencent/liteav/renderer/b;

.field private w:Landroid/graphics/SurfaceTexture;

.field private x:Lcom/tencent/liteav/renderer/c;

.field private y:Z

.field private z:[F


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/tencent/liteav/renderer/e;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/tencent/liteav/renderer/a;->q:I

    .line 6
    .line 7
    iput v0, p0, Lcom/tencent/liteav/renderer/a;->r:I

    .line 8
    .line 9
    iput v0, p0, Lcom/tencent/liteav/renderer/a;->s:I

    .line 10
    .line 11
    iput v0, p0, Lcom/tencent/liteav/renderer/a;->t:I

    .line 12
    .line 13
    new-instance v0, Ljava/lang/Object;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lcom/tencent/liteav/renderer/a;->u:Ljava/lang/Object;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput-object v0, p0, Lcom/tencent/liteav/renderer/a;->D:Ljava/lang/Object;

    .line 22
    .line 23
    new-instance v0, Ljava/lang/Object;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lcom/tencent/liteav/renderer/a;->E:Ljava/lang/Object;

    .line 29
    .line 30
    new-instance v0, Ljava/util/LinkedList;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lcom/tencent/liteav/renderer/a;->H:Ljava/util/Queue;

    .line 36
    .line 37
    const/16 v0, 0x10

    .line 38
    .line 39
    new-array v0, v0, [F

    .line 40
    .line 41
    iput-object v0, p0, Lcom/tencent/liteav/renderer/a;->z:[F

    .line 42
    .line 43
    return-void
.end method

.method private a(Ljava/util/Queue;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Queue<",
            "Ljava/lang/Runnable;",
            ">;)Z"
        }
    .end annotation

    .line 53
    monitor-enter p1

    .line 54
    :try_start_0
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    monitor-exit p1

    return v1

    :catchall_0
    move-exception v0

    goto :goto_0

    .line 55
    :cond_0
    invoke-interface {p1}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    .line 56
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_1

    return v1

    .line 57
    :cond_1
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    const/4 p1, 0x1

    return p1

    .line 58
    :goto_0
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private o()V
    .locals 2

    .line 1
    new-instance v0, Lcom/tencent/liteav/renderer/c;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lcom/tencent/liteav/renderer/c;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    iput-object v0, p0, Lcom/tencent/liteav/renderer/a;->x:Lcom/tencent/liteav/renderer/c;

    .line 8
    .line 9
    new-instance v0, Lcom/tencent/liteav/renderer/TXCYuvTextureRender;

    .line 10
    .line 11
    invoke-direct {v0}, Lcom/tencent/liteav/renderer/TXCYuvTextureRender;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/tencent/liteav/renderer/a;->C:Lcom/tencent/liteav/renderer/TXCYuvTextureRender;

    .line 15
    .line 16
    new-instance v0, Lcom/tencent/liteav/renderer/c;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-direct {v0, v1}, Lcom/tencent/liteav/renderer/c;-><init>(Z)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/tencent/liteav/renderer/a;->A:Lcom/tencent/liteav/renderer/c;

    .line 23
    .line 24
    return-void
.end method

.method private p()Z
    .locals 12

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lcom/tencent/liteav/renderer/a;->y:Z

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iput-boolean v1, p0, Lcom/tencent/liteav/renderer/a;->y:Z

    .line 9
    .line 10
    move-object v3, v2

    .line 11
    goto :goto_0

    .line 12
    :catchall_0
    move-exception v0

    .line 13
    goto/16 :goto_5

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/renderer/a;->B:Lcom/tencent/liteav/basic/structs/TXSVideoFrame;

    .line 16
    .line 17
    if-eqz v0, :cond_e

    .line 18
    .line 19
    iput-object v2, p0, Lcom/tencent/liteav/renderer/a;->B:Lcom/tencent/liteav/basic/structs/TXSVideoFrame;

    .line 20
    .line 21
    move-object v3, v0

    .line 22
    move v0, v1

    .line 23
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    invoke-virtual {p0}, Lcom/tencent/liteav/renderer/e;->g()I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    invoke-virtual {p0}, Lcom/tencent/liteav/renderer/e;->h()I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    invoke-static {v1, v1, v4, v5}, Landroid/opengl/GLES20;->glViewport(IIII)V

    .line 33
    .line 34
    .line 35
    iget v4, p0, Lcom/tencent/liteav/renderer/e;->l:I

    .line 36
    .line 37
    const/4 v5, 0x1

    .line 38
    if-ne v4, v5, :cond_1

    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/tencent/liteav/renderer/a;->b()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    move-object v4, v2

    .line 46
    :goto_1
    iget-object v6, p0, Lcom/tencent/liteav/renderer/a;->c:Lcom/tencent/liteav/renderer/a$a;

    .line 47
    .line 48
    const v7, 0x8d40

    .line 49
    .line 50
    .line 51
    if-eqz v0, :cond_7

    .line 52
    .line 53
    iget-object v0, p0, Lcom/tencent/liteav/renderer/a;->w:Landroid/graphics/SurfaceTexture;

    .line 54
    .line 55
    if-eqz v0, :cond_2

    .line 56
    .line 57
    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->updateTexImage()V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Lcom/tencent/liteav/renderer/a;->w:Landroid/graphics/SurfaceTexture;

    .line 61
    .line 62
    iget-object v2, p0, Lcom/tencent/liteav/renderer/a;->z:[F

    .line 63
    .line 64
    invoke-virtual {v0, v2}, Landroid/graphics/SurfaceTexture;->getTransformMatrix([F)V

    .line 65
    .line 66
    .line 67
    :cond_2
    iget-object v0, p0, Lcom/tencent/liteav/renderer/a;->a:Lcom/tencent/liteav/renderer/g;

    .line 68
    .line 69
    if-eqz v0, :cond_3

    .line 70
    .line 71
    iget-object v1, p0, Lcom/tencent/liteav/renderer/a;->x:Lcom/tencent/liteav/renderer/c;

    .line 72
    .line 73
    if-eqz v1, :cond_4

    .line 74
    .line 75
    invoke-virtual {v1}, Lcom/tencent/liteav/renderer/c;->a()I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    iget-object v2, p0, Lcom/tencent/liteav/renderer/a;->z:[F

    .line 80
    .line 81
    invoke-interface {v0, v1, v2}, Lcom/tencent/liteav/renderer/g;->a(I[F)I

    .line 82
    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_3
    iget-object v0, p0, Lcom/tencent/liteav/renderer/a;->x:Lcom/tencent/liteav/renderer/c;

    .line 86
    .line 87
    if-eqz v0, :cond_4

    .line 88
    .line 89
    invoke-static {v7, v1}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 90
    .line 91
    .line 92
    iget-object v0, p0, Lcom/tencent/liteav/renderer/a;->x:Lcom/tencent/liteav/renderer/c;

    .line 93
    .line 94
    iget-object v1, p0, Lcom/tencent/liteav/renderer/a;->w:Landroid/graphics/SurfaceTexture;

    .line 95
    .line 96
    invoke-virtual {v0, v1}, Lcom/tencent/liteav/renderer/c;->a(Landroid/graphics/SurfaceTexture;)V

    .line 97
    .line 98
    .line 99
    :cond_4
    :goto_2
    if-eqz v6, :cond_6

    .line 100
    .line 101
    iget-object v0, p0, Lcom/tencent/liteav/renderer/a;->x:Lcom/tencent/liteav/renderer/c;

    .line 102
    .line 103
    invoke-virtual {v0}, Lcom/tencent/liteav/renderer/c;->a()I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    iget-object v1, p0, Lcom/tencent/liteav/renderer/a;->F:Lcom/tencent/liteav/renderer/h;

    .line 108
    .line 109
    if-nez v1, :cond_5

    .line 110
    .line 111
    new-instance v1, Lcom/tencent/liteav/renderer/h;

    .line 112
    .line 113
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 114
    .line 115
    invoke-direct {v1, v2}, Lcom/tencent/liteav/renderer/h;-><init>(Ljava/lang/Boolean;)V

    .line 116
    .line 117
    .line 118
    iput-object v1, p0, Lcom/tencent/liteav/renderer/a;->F:Lcom/tencent/liteav/renderer/h;

    .line 119
    .line 120
    invoke-virtual {v1}, Lcom/tencent/liteav/renderer/h;->b()V

    .line 121
    .line 122
    .line 123
    iget-object v1, p0, Lcom/tencent/liteav/renderer/a;->F:Lcom/tencent/liteav/renderer/h;

    .line 124
    .line 125
    invoke-virtual {v1, v5}, Lcom/tencent/liteav/renderer/h;->a(Z)V

    .line 126
    .line 127
    .line 128
    iget-object v1, p0, Lcom/tencent/liteav/renderer/a;->F:Lcom/tencent/liteav/renderer/h;

    .line 129
    .line 130
    const/16 v2, 0xb4

    .line 131
    .line 132
    invoke-virtual {v1, v2}, Lcom/tencent/liteav/renderer/h;->b(I)V

    .line 133
    .line 134
    .line 135
    iget-object v1, p0, Lcom/tencent/liteav/renderer/a;->F:Lcom/tencent/liteav/renderer/h;

    .line 136
    .line 137
    sget v2, Lcom/tencent/liteav/renderer/h;->a:I

    .line 138
    .line 139
    invoke-virtual {v1, v2}, Lcom/tencent/liteav/renderer/h;->a(I)V

    .line 140
    .line 141
    .line 142
    :cond_5
    iget-object v1, p0, Lcom/tencent/liteav/renderer/a;->F:Lcom/tencent/liteav/renderer/h;

    .line 143
    .line 144
    iget-object v2, p0, Lcom/tencent/liteav/renderer/a;->z:[F

    .line 145
    .line 146
    invoke-virtual {v1, v2}, Lcom/tencent/liteav/renderer/h;->a([F)V

    .line 147
    .line 148
    .line 149
    iget-object v1, p0, Lcom/tencent/liteav/renderer/a;->F:Lcom/tencent/liteav/renderer/h;

    .line 150
    .line 151
    iget v2, p0, Lcom/tencent/liteav/renderer/e;->h:I

    .line 152
    .line 153
    iget v3, p0, Lcom/tencent/liteav/renderer/e;->i:I

    .line 154
    .line 155
    invoke-virtual {v1, v2, v3}, Lcom/tencent/liteav/renderer/h;->b(II)V

    .line 156
    .line 157
    .line 158
    iget-object v1, p0, Lcom/tencent/liteav/renderer/a;->F:Lcom/tencent/liteav/renderer/h;

    .line 159
    .line 160
    iget v2, p0, Lcom/tencent/liteav/renderer/e;->h:I

    .line 161
    .line 162
    iget v3, p0, Lcom/tencent/liteav/renderer/e;->i:I

    .line 163
    .line 164
    invoke-virtual {v1, v2, v3}, Lcom/tencent/liteav/renderer/h;->a(II)V

    .line 165
    .line 166
    .line 167
    iget-object v1, p0, Lcom/tencent/liteav/renderer/a;->F:Lcom/tencent/liteav/renderer/h;

    .line 168
    .line 169
    invoke-virtual {v1, v0}, Lcom/tencent/liteav/renderer/h;->d(I)I

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    invoke-virtual {p0}, Lcom/tencent/liteav/renderer/e;->i()I

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    invoke-virtual {p0}, Lcom/tencent/liteav/renderer/e;->j()I

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    iget v3, p0, Lcom/tencent/liteav/renderer/e;->k:I

    .line 182
    .line 183
    invoke-interface {v6, v0, v1, v2, v3}, Lcom/tencent/liteav/renderer/a$a;->onTextureProcess(IIII)V

    .line 184
    .line 185
    .line 186
    :cond_6
    iget v0, p0, Lcom/tencent/liteav/renderer/e;->l:I

    .line 187
    .line 188
    if-ne v0, v5, :cond_d

    .line 189
    .line 190
    iget-object v0, p0, Lcom/tencent/liteav/renderer/a;->x:Lcom/tencent/liteav/renderer/c;

    .line 191
    .line 192
    if-eqz v0, :cond_d

    .line 193
    .line 194
    invoke-virtual {v0}, Lcom/tencent/liteav/renderer/c;->a()I

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    iget-object v1, p0, Lcom/tencent/liteav/renderer/a;->z:[F

    .line 199
    .line 200
    invoke-virtual {p0, v4, v0, v1, v5}, Lcom/tencent/liteav/renderer/e;->a(Ljava/lang/Object;I[FZ)V

    .line 201
    .line 202
    .line 203
    goto/16 :goto_4

    .line 204
    .line 205
    :cond_7
    if-eqz v3, :cond_d

    .line 206
    .line 207
    iget-object v0, p0, Lcom/tencent/liteav/renderer/a;->C:Lcom/tencent/liteav/renderer/TXCYuvTextureRender;

    .line 208
    .line 209
    if-eqz v0, :cond_d

    .line 210
    .line 211
    iget-object v8, p0, Lcom/tencent/liteav/renderer/a;->b:Lcom/tencent/liteav/renderer/a$a;

    .line 212
    .line 213
    const/4 v9, -0x1

    .line 214
    if-eqz v8, :cond_8

    .line 215
    .line 216
    iget v7, p0, Lcom/tencent/liteav/renderer/e;->h:I

    .line 217
    .line 218
    iget v8, p0, Lcom/tencent/liteav/renderer/e;->i:I

    .line 219
    .line 220
    invoke-virtual {v0, v7, v8}, Lcom/tencent/liteav/renderer/TXCYuvTextureRender;->setHasFrameBuffer(II)V

    .line 221
    .line 222
    .line 223
    iget-object v0, p0, Lcom/tencent/liteav/renderer/a;->C:Lcom/tencent/liteav/renderer/TXCYuvTextureRender;

    .line 224
    .line 225
    invoke-virtual {v0, v3}, Lcom/tencent/liteav/renderer/TXCYuvTextureRender;->drawToTexture(Lcom/tencent/liteav/basic/structs/TXSVideoFrame;)I

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    iget-object v7, p0, Lcom/tencent/liteav/renderer/a;->b:Lcom/tencent/liteav/renderer/a$a;

    .line 230
    .line 231
    invoke-virtual {p0}, Lcom/tencent/liteav/renderer/e;->i()I

    .line 232
    .line 233
    .line 234
    move-result v8

    .line 235
    invoke-virtual {p0}, Lcom/tencent/liteav/renderer/e;->j()I

    .line 236
    .line 237
    .line 238
    move-result v10

    .line 239
    iget v11, p0, Lcom/tencent/liteav/renderer/e;->k:I

    .line 240
    .line 241
    invoke-interface {v7, v0, v8, v10, v11}, Lcom/tencent/liteav/renderer/a$a;->onTextureProcess(IIII)V

    .line 242
    .line 243
    .line 244
    goto :goto_3

    .line 245
    :cond_8
    iget v0, p0, Lcom/tencent/liteav/renderer/e;->l:I

    .line 246
    .line 247
    if-nez v0, :cond_9

    .line 248
    .line 249
    invoke-static {v7, v1}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    .line 250
    .line 251
    .line 252
    iget-object v0, p0, Lcom/tencent/liteav/renderer/a;->C:Lcom/tencent/liteav/renderer/TXCYuvTextureRender;

    .line 253
    .line 254
    invoke-virtual {v0, v3}, Lcom/tencent/liteav/renderer/TXCYuvTextureRender;->drawFrame(Lcom/tencent/liteav/basic/structs/TXSVideoFrame;)V

    .line 255
    .line 256
    .line 257
    :cond_9
    move v0, v9

    .line 258
    :goto_3
    iget v7, p0, Lcom/tencent/liteav/renderer/e;->l:I

    .line 259
    .line 260
    if-ne v7, v5, :cond_b

    .line 261
    .line 262
    if-ne v0, v9, :cond_a

    .line 263
    .line 264
    iget-object v0, p0, Lcom/tencent/liteav/renderer/a;->C:Lcom/tencent/liteav/renderer/TXCYuvTextureRender;

    .line 265
    .line 266
    iget v7, p0, Lcom/tencent/liteav/renderer/e;->h:I

    .line 267
    .line 268
    iget v8, p0, Lcom/tencent/liteav/renderer/e;->i:I

    .line 269
    .line 270
    invoke-virtual {v0, v7, v8}, Lcom/tencent/liteav/renderer/TXCYuvTextureRender;->setHasFrameBuffer(II)V

    .line 271
    .line 272
    .line 273
    iget-object v0, p0, Lcom/tencent/liteav/renderer/a;->C:Lcom/tencent/liteav/renderer/TXCYuvTextureRender;

    .line 274
    .line 275
    invoke-virtual {v0, v3}, Lcom/tencent/liteav/renderer/TXCYuvTextureRender;->drawToTexture(Lcom/tencent/liteav/basic/structs/TXSVideoFrame;)I

    .line 276
    .line 277
    .line 278
    move-result v0

    .line 279
    :cond_a
    invoke-virtual {p0, v4, v0, v2, v1}, Lcom/tencent/liteav/renderer/e;->a(Ljava/lang/Object;I[FZ)V

    .line 280
    .line 281
    .line 282
    :cond_b
    if-eqz v6, :cond_d

    .line 283
    .line 284
    iget-object v0, p0, Lcom/tencent/liteav/renderer/a;->G:Lcom/tencent/liteav/renderer/TXCYuvTextureRender;

    .line 285
    .line 286
    if-nez v0, :cond_c

    .line 287
    .line 288
    new-instance v0, Lcom/tencent/liteav/renderer/TXCYuvTextureRender;

    .line 289
    .line 290
    invoke-direct {v0}, Lcom/tencent/liteav/renderer/TXCYuvTextureRender;-><init>()V

    .line 291
    .line 292
    .line 293
    iput-object v0, p0, Lcom/tencent/liteav/renderer/a;->G:Lcom/tencent/liteav/renderer/TXCYuvTextureRender;

    .line 294
    .line 295
    invoke-virtual {v0}, Lcom/tencent/liteav/renderer/TXCYuvTextureRender;->createTexture()V

    .line 296
    .line 297
    .line 298
    iget-object v0, p0, Lcom/tencent/liteav/renderer/a;->G:Lcom/tencent/liteav/renderer/TXCYuvTextureRender;

    .line 299
    .line 300
    invoke-virtual {v0, v1}, Lcom/tencent/liteav/renderer/TXCYuvTextureRender;->flipVertical(Z)V

    .line 301
    .line 302
    .line 303
    :cond_c
    iget-object v0, p0, Lcom/tencent/liteav/renderer/a;->G:Lcom/tencent/liteav/renderer/TXCYuvTextureRender;

    .line 304
    .line 305
    iget v1, p0, Lcom/tencent/liteav/renderer/e;->h:I

    .line 306
    .line 307
    iget v2, p0, Lcom/tencent/liteav/renderer/e;->i:I

    .line 308
    .line 309
    invoke-virtual {v0, v1, v2}, Lcom/tencent/liteav/renderer/TXCYuvTextureRender;->setHasFrameBuffer(II)V

    .line 310
    .line 311
    .line 312
    iget-object v0, p0, Lcom/tencent/liteav/renderer/a;->G:Lcom/tencent/liteav/renderer/TXCYuvTextureRender;

    .line 313
    .line 314
    invoke-virtual {v0, v3}, Lcom/tencent/liteav/renderer/TXCYuvTextureRender;->drawToTexture(Lcom/tencent/liteav/basic/structs/TXSVideoFrame;)I

    .line 315
    .line 316
    .line 317
    move-result v0

    .line 318
    invoke-virtual {p0}, Lcom/tencent/liteav/renderer/e;->i()I

    .line 319
    .line 320
    .line 321
    move-result v1

    .line 322
    invoke-virtual {p0}, Lcom/tencent/liteav/renderer/e;->j()I

    .line 323
    .line 324
    .line 325
    move-result v2

    .line 326
    iget v3, p0, Lcom/tencent/liteav/renderer/e;->k:I

    .line 327
    .line 328
    invoke-interface {v6, v0, v1, v2, v3}, Lcom/tencent/liteav/renderer/a$a;->onTextureProcess(IIII)V

    .line 329
    .line 330
    .line 331
    :cond_d
    :goto_4
    return v5

    .line 332
    :cond_e
    :try_start_1
    monitor-exit p0

    .line 333
    return v1

    .line 334
    :goto_5
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 335
    throw v0
.end method


# virtual methods
.method public a()Landroid/graphics/SurfaceTexture;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/tencent/liteav/renderer/a;->w:Landroid/graphics/SurfaceTexture;

    return-object v0
.end method

.method public a(II)V
    .locals 1

    .line 28
    invoke-super {p0, p1, p2}, Lcom/tencent/liteav/renderer/e;->a(II)V

    .line 29
    iget-object v0, p0, Lcom/tencent/liteav/renderer/a;->C:Lcom/tencent/liteav/renderer/TXCYuvTextureRender;

    if-eqz v0, :cond_0

    .line 30
    invoke-virtual {v0, p1, p2}, Lcom/tencent/liteav/renderer/TXCYuvTextureRender;->setVideoSize(II)V

    .line 31
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/renderer/a;->x:Lcom/tencent/liteav/renderer/c;

    if-eqz v0, :cond_1

    .line 32
    invoke-virtual {v0, p1, p2}, Lcom/tencent/liteav/renderer/c;->a(II)V

    :cond_1
    return-void
.end method

.method public a(IIIZI)V
    .locals 3

    .line 16
    invoke-virtual {p0}, Lcom/tencent/liteav/renderer/e;->g()I

    move-result v0

    invoke-virtual {p0}, Lcom/tencent/liteav/renderer/e;->h()I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v2, v2, v0, v1}, Landroid/opengl/GLES20;->glViewport(IIII)V

    .line 17
    iget-object v0, p0, Lcom/tencent/liteav/renderer/a;->A:Lcom/tencent/liteav/renderer/c;

    if-eqz v0, :cond_0

    .line 18
    invoke-virtual {v0, p1, p4, p5}, Lcom/tencent/liteav/renderer/c;->a(IZI)V

    .line 19
    :cond_0
    invoke-super/range {p0 .. p5}, Lcom/tencent/liteav/renderer/e;->a(IIIZI)V

    move-object p1, p0

    .line 20
    iget-object p2, p1, Lcom/tencent/liteav/renderer/a;->u:Ljava/lang/Object;

    monitor-enter p2

    .line 21
    :try_start_0
    iget-object p3, p1, Lcom/tencent/liteav/renderer/a;->v:Lcom/tencent/liteav/renderer/b;

    if-eqz p3, :cond_1

    .line 22
    invoke-virtual {p3}, Lcom/tencent/liteav/renderer/b;->c()V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p3, v0

    goto :goto_1

    .line 23
    :cond_1
    :goto_0
    monitor-exit p2

    return-void

    :goto_1
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p3
.end method

.method public a(Landroid/graphics/SurfaceTexture;)V
    .locals 1

    .line 25
    invoke-super {p0, p1}, Lcom/tencent/liteav/renderer/e;->a(Landroid/graphics/SurfaceTexture;)V

    .line 26
    const-string p1, "TXCVideoRender"

    const-string v0, "play:vrender: create render thread when onSurfaceCreate"

    invoke-static {p1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 27
    invoke-virtual {p0, p1}, Lcom/tencent/liteav/renderer/a;->c(Ljava/lang/Object;)V

    return-void
.end method

.method public a(Lcom/tencent/liteav/basic/structs/TXSVideoFrame;III)V
    .locals 1

    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-object v0, p0, Lcom/tencent/liteav/renderer/a;->B:Lcom/tencent/liteav/basic/structs/TXSVideoFrame;

    if-eqz v0, :cond_0

    .line 7
    invoke-virtual {v0}, Lcom/tencent/liteav/basic/structs/TXSVideoFrame;->release()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    .line 8
    :cond_0
    :goto_0
    iput-object p1, p0, Lcom/tencent/liteav/renderer/a;->B:Lcom/tencent/liteav/basic/structs/TXSVideoFrame;

    .line 9
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    invoke-super {p0, p1, p2, p3, p4}, Lcom/tencent/liteav/renderer/e;->a(Lcom/tencent/liteav/basic/structs/TXSVideoFrame;III)V

    .line 11
    iget-object p1, p0, Lcom/tencent/liteav/renderer/a;->u:Ljava/lang/Object;

    monitor-enter p1

    .line 12
    :try_start_1
    iget-object p2, p0, Lcom/tencent/liteav/renderer/a;->v:Lcom/tencent/liteav/renderer/b;

    if-eqz p2, :cond_1

    .line 13
    invoke-virtual {p2}, Lcom/tencent/liteav/renderer/b;->c()V

    goto :goto_1

    :catchall_1
    move-exception p2

    goto :goto_2

    .line 14
    :cond_1
    :goto_1
    monitor-exit p1

    return-void

    :goto_2
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw p2

    .line 15
    :goto_3
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public a(Lcom/tencent/liteav/renderer/a$a;)V
    .locals 2

    .line 2
    iput-object p1, p0, Lcom/tencent/liteav/renderer/a;->b:Lcom/tencent/liteav/renderer/a$a;

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/tencent/liteav/renderer/a;->C:Lcom/tencent/liteav/renderer/TXCYuvTextureRender;

    if-eqz p1, :cond_0

    .line 4
    iget v0, p0, Lcom/tencent/liteav/renderer/e;->h:I

    iget v1, p0, Lcom/tencent/liteav/renderer/e;->i:I

    invoke-virtual {p1, v0, v1}, Lcom/tencent/liteav/renderer/TXCYuvTextureRender;->setHasFrameBuffer(II)V

    :cond_0
    return-void
.end method

.method public a(Lcom/tencent/liteav/renderer/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/liteav/renderer/a;->a:Lcom/tencent/liteav/renderer/g;

    return-void
.end method

.method public a(Ljava/lang/Object;)V
    .locals 3

    .line 33
    iget-object v0, p0, Lcom/tencent/liteav/renderer/a;->E:Ljava/lang/Object;

    monitor-enter v0

    .line 34
    :try_start_0
    iput-object p1, p0, Lcom/tencent/liteav/renderer/a;->D:Ljava/lang/Object;

    .line 35
    const-string p1, "TXCVideoRender"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "play:vrender: TXCGLRender initTextureRender "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    invoke-direct {p0}, Lcom/tencent/liteav/renderer/a;->o()V

    .line 37
    iget-object p1, p0, Lcom/tencent/liteav/renderer/e;->e:Lcom/tencent/liteav/renderer/d;

    if-eqz p1, :cond_0

    .line 38
    iget v1, p0, Lcom/tencent/liteav/renderer/e;->f:I

    iget v2, p0, Lcom/tencent/liteav/renderer/e;->g:I

    invoke-virtual {p1, v1, v2}, Lcom/tencent/liteav/renderer/d;->a(II)V

    .line 39
    iget-object p1, p0, Lcom/tencent/liteav/renderer/e;->e:Lcom/tencent/liteav/renderer/d;

    iget v1, p0, Lcom/tencent/liteav/renderer/e;->h:I

    iget v2, p0, Lcom/tencent/liteav/renderer/e;->i:I

    invoke-virtual {p1, v1, v2}, Lcom/tencent/liteav/renderer/d;->b(II)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 40
    :cond_0
    :goto_0
    iget-object p1, p0, Lcom/tencent/liteav/renderer/a;->x:Lcom/tencent/liteav/renderer/c;

    if-eqz p1, :cond_1

    .line 41
    invoke-virtual {p1}, Lcom/tencent/liteav/renderer/c;->b()V

    .line 42
    new-instance p1, Landroid/graphics/SurfaceTexture;

    iget-object v1, p0, Lcom/tencent/liteav/renderer/a;->x:Lcom/tencent/liteav/renderer/c;

    invoke-virtual {v1}, Lcom/tencent/liteav/renderer/c;->a()I

    move-result v1

    invoke-direct {p1, v1}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    iput-object p1, p0, Lcom/tencent/liteav/renderer/a;->w:Landroid/graphics/SurfaceTexture;

    .line 43
    invoke-virtual {p1, p0}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V

    .line 44
    :cond_1
    iget-object p1, p0, Lcom/tencent/liteav/renderer/a;->C:Lcom/tencent/liteav/renderer/TXCYuvTextureRender;

    if-eqz p1, :cond_2

    .line 45
    invoke-virtual {p1}, Lcom/tencent/liteav/renderer/TXCYuvTextureRender;->createTexture()V

    .line 46
    :cond_2
    iget-object p1, p0, Lcom/tencent/liteav/renderer/a;->b:Lcom/tencent/liteav/renderer/a$a;

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/tencent/liteav/renderer/a;->C:Lcom/tencent/liteav/renderer/TXCYuvTextureRender;

    if-eqz p1, :cond_3

    .line 47
    iget v1, p0, Lcom/tencent/liteav/renderer/e;->h:I

    iget v2, p0, Lcom/tencent/liteav/renderer/e;->i:I

    invoke-virtual {p1, v1, v2}, Lcom/tencent/liteav/renderer/TXCYuvTextureRender;->setHasFrameBuffer(II)V

    .line 48
    :cond_3
    iget-object p1, p0, Lcom/tencent/liteav/renderer/a;->A:Lcom/tencent/liteav/renderer/c;

    if-eqz p1, :cond_4

    .line 49
    invoke-virtual {p1}, Lcom/tencent/liteav/renderer/c;->b()V

    .line 50
    :cond_4
    iget-object p1, p0, Lcom/tencent/liteav/renderer/e;->o:Lcom/tencent/liteav/renderer/f;

    if-eqz p1, :cond_5

    .line 51
    iget-object v1, p0, Lcom/tencent/liteav/renderer/a;->w:Landroid/graphics/SurfaceTexture;

    invoke-interface {p1, v1}, Lcom/tencent/liteav/renderer/f;->onSurfaceTextureAvailable(Landroid/graphics/SurfaceTexture;)V

    .line 52
    :cond_5
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public b()Ljava/lang/Object;
    .locals 2

    .line 4
    iget-object v0, p0, Lcom/tencent/liteav/renderer/a;->u:Ljava/lang/Object;

    monitor-enter v0

    .line 5
    :try_start_0
    iget-object v1, p0, Lcom/tencent/liteav/renderer/a;->v:Lcom/tencent/liteav/renderer/b;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/tencent/liteav/renderer/b;->a()Ljava/lang/Object;

    move-result-object v1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return-object v1

    .line 6
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public b(Landroid/graphics/SurfaceTexture;)V
    .locals 1

    .line 7
    invoke-super {p0, p1}, Lcom/tencent/liteav/renderer/e;->b(Landroid/graphics/SurfaceTexture;)V

    .line 8
    const-string p1, "TXCVideoRender"

    const-string v0, "play:vrender: quit render thread when onSurfaceRelease"

    invoke-static {p1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    invoke-virtual {p0}, Lcom/tencent/liteav/renderer/a;->e()V

    return-void
.end method

.method public b(Lcom/tencent/liteav/renderer/a$a;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/tencent/liteav/renderer/a;->c:Lcom/tencent/liteav/renderer/a$a;

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/tencent/liteav/renderer/a;->C:Lcom/tencent/liteav/renderer/TXCYuvTextureRender;

    if-eqz p1, :cond_0

    .line 3
    iget v0, p0, Lcom/tencent/liteav/renderer/e;->h:I

    iget v1, p0, Lcom/tencent/liteav/renderer/e;->i:I

    invoke-virtual {p1, v0, v1}, Lcom/tencent/liteav/renderer/TXCYuvTextureRender;->setHasFrameBuffer(II)V

    :cond_0
    return-void
.end method

.method public b(Ljava/lang/Object;)V
    .locals 4

    .line 10
    iget-object v0, p0, Lcom/tencent/liteav/renderer/a;->E:Ljava/lang/Object;

    monitor-enter v0

    .line 11
    :try_start_0
    iget-object v1, p0, Lcom/tencent/liteav/renderer/a;->D:Ljava/lang/Object;

    if-eq v1, p1, :cond_0

    .line 12
    const-string p1, "TXCVideoRender"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "play:vrender: TXCGLRender destroyTextureRender ignore when not the same gl thread "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    .line 14
    iput-object p1, p0, Lcom/tencent/liteav/renderer/a;->D:Ljava/lang/Object;

    .line 15
    const-string v1, "TXCVideoRender"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "play:vrender: TXCGLRender destroyTextureRender "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    :try_start_1
    iget-object v1, p0, Lcom/tencent/liteav/renderer/e;->o:Lcom/tencent/liteav/renderer/f;

    if-eqz v1, :cond_1

    .line 17
    iget-object v2, p0, Lcom/tencent/liteav/renderer/a;->w:Landroid/graphics/SurfaceTexture;

    invoke-interface {v1, v2}, Lcom/tencent/liteav/renderer/f;->onSurfaceTextureDestroy(Landroid/graphics/SurfaceTexture;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 18
    :try_start_2
    const-string v2, "TXCVideoRender"

    const-string v3, "callback failed."

    invoke-static {v2, v3, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 19
    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/tencent/liteav/renderer/a;->x:Lcom/tencent/liteav/renderer/c;

    if-eqz v1, :cond_2

    .line 20
    invoke-virtual {v1}, Lcom/tencent/liteav/renderer/c;->c()V

    .line 21
    iput-object p1, p0, Lcom/tencent/liteav/renderer/a;->x:Lcom/tencent/liteav/renderer/c;

    .line 22
    :cond_2
    iget-object v1, p0, Lcom/tencent/liteav/renderer/a;->C:Lcom/tencent/liteav/renderer/TXCYuvTextureRender;

    if-eqz v1, :cond_3

    .line 23
    invoke-virtual {v1}, Lcom/tencent/liteav/renderer/TXCYuvTextureRender;->onSurfaceDestroy()V

    .line 24
    iput-object p1, p0, Lcom/tencent/liteav/renderer/a;->C:Lcom/tencent/liteav/renderer/TXCYuvTextureRender;

    .line 25
    :cond_3
    iget-object v1, p0, Lcom/tencent/liteav/renderer/a;->A:Lcom/tencent/liteav/renderer/c;

    if-eqz v1, :cond_4

    .line 26
    invoke-virtual {v1}, Lcom/tencent/liteav/renderer/c;->c()V

    .line 27
    iput-object p1, p0, Lcom/tencent/liteav/renderer/a;->A:Lcom/tencent/liteav/renderer/c;

    .line 28
    :cond_4
    iput-object p1, p0, Lcom/tencent/liteav/renderer/a;->w:Landroid/graphics/SurfaceTexture;

    .line 29
    iget-object v1, p0, Lcom/tencent/liteav/renderer/a;->F:Lcom/tencent/liteav/renderer/h;

    if-eqz v1, :cond_5

    .line 30
    invoke-virtual {v1}, Lcom/tencent/liteav/renderer/h;->c()V

    .line 31
    iput-object p1, p0, Lcom/tencent/liteav/renderer/a;->F:Lcom/tencent/liteav/renderer/h;

    .line 32
    :cond_5
    iget-object v1, p0, Lcom/tencent/liteav/renderer/a;->G:Lcom/tencent/liteav/renderer/TXCYuvTextureRender;

    if-eqz v1, :cond_6

    .line 33
    invoke-virtual {v1}, Lcom/tencent/liteav/renderer/TXCYuvTextureRender;->onSurfaceDestroy()V

    .line 34
    iput-object p1, p0, Lcom/tencent/liteav/renderer/a;->G:Lcom/tencent/liteav/renderer/TXCYuvTextureRender;

    .line 35
    :cond_6
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public c(Ljava/lang/Object;)V
    .locals 4

    .line 3
    iget-object v0, p0, Lcom/tencent/liteav/renderer/a;->u:Ljava/lang/Object;

    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/tencent/liteav/renderer/a;->v:Lcom/tencent/liteav/renderer/b;

    if-nez v1, :cond_0

    .line 5
    new-instance v1, Lcom/tencent/liteav/renderer/b;

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-direct {v1, v2}, Lcom/tencent/liteav/renderer/b;-><init>(Ljava/lang/ref/WeakReference;)V

    iput-object v1, p0, Lcom/tencent/liteav/renderer/a;->v:Lcom/tencent/liteav/renderer/b;

    .line 6
    invoke-virtual {v1, p1}, Lcom/tencent/liteav/renderer/b;->a(Ljava/lang/Object;)V

    .line 7
    iget-object v1, p0, Lcom/tencent/liteav/renderer/a;->v:Lcom/tencent/liteav/renderer/b;

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 8
    iget-object v1, p0, Lcom/tencent/liteav/renderer/a;->v:Lcom/tencent/liteav/renderer/b;

    invoke-virtual {v1}, Lcom/tencent/liteav/renderer/b;->c()V

    .line 9
    const-string v1, "TXCVideoRender"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "play:vrender: start render thread id "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", glContext "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 10
    :cond_0
    const-string p1, "TXCVideoRender"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "play:vrender: start render thread when running "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public c()Z
    .locals 1

    .line 1
    :goto_0
    iget-object v0, p0, Lcom/tencent/liteav/renderer/a;->H:Ljava/util/Queue;

    invoke-direct {p0, v0}, Lcom/tencent/liteav/renderer/a;->a(Ljava/util/Queue;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-direct {p0}, Lcom/tencent/liteav/renderer/a;->p()Z

    move-result v0

    return v0
.end method

.method public d()Landroid/graphics/SurfaceTexture;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/renderer/e;->d:Landroid/view/TextureView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public e()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/tencent/liteav/renderer/a;->u:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/tencent/liteav/renderer/a;->v:Lcom/tencent/liteav/renderer/b;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {v1}, Lcom/tencent/liteav/renderer/b;->b()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lcom/tencent/liteav/renderer/a;->v:Lcom/tencent/liteav/renderer/b;

    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/tencent/liteav/renderer/b;->c()V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    iput-object v1, p0, Lcom/tencent/liteav/renderer/a;->v:Lcom/tencent/liteav/renderer/b;

    .line 18
    .line 19
    const-string v1, "TXCVideoRender"

    .line 20
    .line 21
    new-instance v2, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string v3, "play:vrender: quit render thread id"

    .line 27
    .line 28
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/tencent/liteav/basic/module/a;->getID()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v3, ", "

    .line 39
    .line 40
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-static {v1, v2}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    move-exception v1

    .line 55
    goto :goto_1

    .line 56
    :cond_0
    :goto_0
    monitor-exit v0

    .line 57
    return-void

    .line 58
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    throw v1
.end method

.method public finalize()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/tencent/liteav/basic/module/a;->finalize()V

    .line 2
    .line 3
    .line 4
    const-string v0, "play:vrender: quit render thread when finalize"

    .line 5
    .line 6
    const-string v1, "TXCVideoRender"

    .line 7
    .line 8
    invoke-static {v1, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    :try_start_0
    invoke-virtual {p0}, Lcom/tencent/liteav/renderer/a;->e()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :catch_0
    move-exception v0

    .line 16
    const-string v2, "quit render thread failed."

    .line 17
    .line 18
    invoke-static {v1, v2, v0}, Lcom/tencent/liteav/basic/log/TXCLog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public onFrameAvailable(Landroid/graphics/SurfaceTexture;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    const/4 p1, 0x1

    .line 3
    :try_start_0
    iput-boolean p1, p0, Lcom/tencent/liteav/renderer/a;->y:Z

    .line 4
    .line 5
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 6
    iget-object p1, p0, Lcom/tencent/liteav/renderer/a;->u:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter p1

    .line 9
    :try_start_1
    iget-object v0, p0, Lcom/tencent/liteav/renderer/a;->v:Lcom/tencent/liteav/renderer/b;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/tencent/liteav/renderer/b;->c()V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    :goto_0
    monitor-exit p1

    .line 20
    return-void

    .line 21
    :goto_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    throw v0

    .line 23
    :catchall_1
    move-exception p1

    .line 24
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 25
    throw p1
.end method

.method public onSurfaceTextureUpdated(Landroid/graphics/SurfaceTexture;)V
    .locals 0

    return-void
.end method
