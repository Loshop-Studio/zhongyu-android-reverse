.class public final La0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcoil3/decode/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La0/d$a;
    }
.end annotation


# instance fields
.field public final a:Ln/r;

.field public final b:Ly/m;

.field public final c:Z

.field public final d:Z

.field public final e:Z


# direct methods
.method public constructor <init>(Ln/r;Ly/m;ZZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, La0/d;->a:Ln/r;

    .line 3
    iput-object p2, p0, La0/d;->b:Ly/m;

    .line 4
    iput-boolean p3, p0, La0/d;->c:Z

    .line 5
    iput-boolean p4, p0, La0/d;->d:Z

    .line 6
    iput-boolean p5, p0, La0/d;->e:Z

    return-void
.end method

.method public synthetic constructor <init>(Ln/r;Ly/m;ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p6, 0x4

    const/4 v0, 0x1

    if-eqz p7, :cond_0

    move p3, v0

    :cond_0
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_1

    move p4, v0

    :cond_1
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_2

    const/4 p5, 0x0

    :cond_2
    move p6, p5

    move p5, p4

    move p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    .line 7
    invoke-direct/range {p1 .. p6}, La0/d;-><init>(Ln/r;Ly/m;ZZZ)V

    return-void
.end method

.method public static synthetic b(La0/d;)Ln/g;
    .locals 0

    .line 1
    invoke-static {p0}, La0/d;->c(La0/d;)Ln/g;

    move-result-object p0

    return-object p0
.end method

.method public static final c(La0/d;)Ln/g;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, La0/d;->a:Ln/r;

    .line 4
    .line 5
    invoke-interface {v0}, Ln/r;->source()Lokio/BufferedSource;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const/4 v3, 0x0

    .line 10
    :try_start_0
    invoke-static {v2}, Lb0/d;->a(Lokio/BufferedSource;)Lb0/b;

    .line 11
    .line 12
    .line 13
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    :try_start_1
    invoke-interface {v2}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    goto :goto_2

    .line 22
    :cond_0
    :goto_0
    move-object v0, v3

    .line 23
    goto :goto_2

    .line 24
    :catchall_1
    move-exception v0

    .line 25
    move-object v4, v0

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    :try_start_2
    invoke-interface {v2}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :catchall_2
    move-exception v0

    .line 33
    invoke-static {v4, v0}, Lkotlin/ExceptionsKt;->addSuppressed(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    :goto_1
    move-object v0, v4

    .line 37
    move-object v4, v3

    .line 38
    :goto_2
    if-nez v0, :cond_a

    .line 39
    .line 40
    invoke-interface {v4}, Lb0/b;->e()[F

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget-boolean v2, v1, La0/d;->c:Z

    .line 45
    .line 46
    const/4 v5, 0x2

    .line 47
    const/4 v6, 0x1

    .line 48
    const/4 v7, 0x3

    .line 49
    const/4 v8, 0x0

    .line 50
    if-eqz v2, :cond_2

    .line 51
    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    aget v2, v0, v5

    .line 55
    .line 56
    aget v9, v0, v8

    .line 57
    .line 58
    sub-float/2addr v2, v9

    .line 59
    aget v9, v0, v7

    .line 60
    .line 61
    aget v10, v0, v6

    .line 62
    .line 63
    sub-float/2addr v9, v10

    .line 64
    goto :goto_3

    .line 65
    :cond_2
    invoke-interface {v4}, Lb0/b;->getWidth()F

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    invoke-interface {v4}, Lb0/b;->getHeight()F

    .line 70
    .line 71
    .line 72
    move-result v9

    .line 73
    :goto_3
    iget-boolean v10, v1, La0/d;->e:Z

    .line 74
    .line 75
    const/4 v11, 0x0

    .line 76
    if-eqz v10, :cond_4

    .line 77
    .line 78
    iget-object v10, v1, La0/d;->b:Ly/m;

    .line 79
    .line 80
    invoke-virtual {v10}, Ly/m;->k()Lz/e;

    .line 81
    .line 82
    .line 83
    move-result-object v10

    .line 84
    invoke-static {v10}, Lz/f;->b(Lz/e;)Z

    .line 85
    .line 86
    .line 87
    move-result v10

    .line 88
    if-eqz v10, :cond_4

    .line 89
    .line 90
    iget-object v10, v1, La0/d;->b:Ly/m;

    .line 91
    .line 92
    invoke-virtual {v10}, Ly/m;->c()Landroid/content/Context;

    .line 93
    .line 94
    .line 95
    move-result-object v10

    .line 96
    invoke-static {v10}, Lb0/f;->a(Landroid/content/Context;)F

    .line 97
    .line 98
    .line 99
    move-result v10

    .line 100
    cmpl-float v12, v2, v11

    .line 101
    .line 102
    if-lez v12, :cond_3

    .line 103
    .line 104
    mul-float/2addr v2, v10

    .line 105
    :cond_3
    cmpl-float v12, v9, v11

    .line 106
    .line 107
    if-lez v12, :cond_4

    .line 108
    .line 109
    mul-float/2addr v9, v10

    .line 110
    :cond_4
    cmpl-float v10, v2, v11

    .line 111
    .line 112
    const/16 v12, 0x200

    .line 113
    .line 114
    if-lez v10, :cond_5

    .line 115
    .line 116
    invoke-static {v2}, Lkotlin/math/MathKt;->roundToInt(F)I

    .line 117
    .line 118
    .line 119
    move-result v13

    .line 120
    goto :goto_4

    .line 121
    :cond_5
    move v13, v12

    .line 122
    :goto_4
    cmpl-float v14, v9, v11

    .line 123
    .line 124
    if-lez v14, :cond_6

    .line 125
    .line 126
    invoke-static {v9}, Lkotlin/math/MathKt;->roundToInt(F)I

    .line 127
    .line 128
    .line 129
    move-result v12

    .line 130
    :cond_6
    iget-object v15, v1, La0/d;->b:Ly/m;

    .line 131
    .line 132
    invoke-virtual {v15}, Ly/m;->k()Lz/e;

    .line 133
    .line 134
    .line 135
    move-result-object v15

    .line 136
    move/from16 v16, v5

    .line 137
    .line 138
    iget-object v5, v1, La0/d;->b:Ly/m;

    .line 139
    .line 140
    invoke-virtual {v5}, Ly/m;->j()Lcoil3/size/Scale;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    move/from16 v17, v11

    .line 145
    .line 146
    iget-object v11, v1, La0/d;->b:Ly/m;

    .line 147
    .line 148
    invoke-static {v11}, Ly/f;->d(Ly/m;)Lz/e;

    .line 149
    .line 150
    .line 151
    move-result-object v11

    .line 152
    invoke-static {v13, v12, v15, v5, v11}, Ln/h;->b(IILz/e;Lcoil3/size/Scale;Lz/e;)J

    .line 153
    .line 154
    .line 155
    move-result-wide v11

    .line 156
    invoke-static {v11, v12}, Le0/n;->c(J)I

    .line 157
    .line 158
    .line 159
    move-result v5

    .line 160
    invoke-static {v11, v12}, Le0/n;->d(J)I

    .line 161
    .line 162
    .line 163
    move-result v11

    .line 164
    if-lez v10, :cond_8

    .line 165
    .line 166
    if-lez v14, :cond_8

    .line 167
    .line 168
    int-to-float v5, v5

    .line 169
    int-to-float v10, v11

    .line 170
    iget-object v11, v1, La0/d;->b:Ly/m;

    .line 171
    .line 172
    invoke-virtual {v11}, Ly/m;->j()Lcoil3/size/Scale;

    .line 173
    .line 174
    .line 175
    move-result-object v11

    .line 176
    invoke-static {v2, v9, v5, v10, v11}, Ln/h;->e(FFFFLcoil3/size/Scale;)F

    .line 177
    .line 178
    .line 179
    move-result v5

    .line 180
    mul-float v10, v5, v2

    .line 181
    .line 182
    float-to-int v10, v10

    .line 183
    mul-float/2addr v5, v9

    .line 184
    float-to-int v11, v5

    .line 185
    if-nez v0, :cond_7

    .line 186
    .line 187
    const/4 v0, 0x4

    .line 188
    new-array v0, v0, [F

    .line 189
    .line 190
    aput v17, v0, v8

    .line 191
    .line 192
    aput v17, v0, v6

    .line 193
    .line 194
    aput v2, v0, v16

    .line 195
    .line 196
    aput v9, v0, v7

    .line 197
    .line 198
    invoke-interface {v4, v0}, Lb0/b;->d([F)V

    .line 199
    .line 200
    .line 201
    :cond_7
    move v5, v10

    .line 202
    :cond_8
    const-string v0, "100%"

    .line 203
    .line 204
    invoke-interface {v4, v0}, Lb0/b;->a(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    invoke-interface {v4, v0}, Lb0/b;->c(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    iget-object v0, v1, La0/d;->b:Ly/m;

    .line 211
    .line 212
    invoke-interface {v4, v0}, Lb0/b;->b(Ly/m;)V

    .line 213
    .line 214
    .line 215
    invoke-interface {v4, v5, v11}, Lb0/b;->f(II)Lk/j;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    iget-boolean v2, v1, La0/d;->d:Z

    .line 220
    .line 221
    if-eqz v2, :cond_9

    .line 222
    .line 223
    invoke-static {v0, v8, v8, v7, v3}, Lk/n;->g(Lk/j;IIILjava/lang/Object;)Landroid/graphics/Bitmap;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    invoke-static {v0, v8, v6, v3}, Lk/n;->d(Landroid/graphics/Bitmap;ZILjava/lang/Object;)Lk/a;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    :cond_9
    new-instance v2, Ln/g;

    .line 232
    .line 233
    iget-boolean v1, v1, La0/d;->d:Z

    .line 234
    .line 235
    invoke-direct {v2, v0, v1}, Ln/g;-><init>(Lk/j;Z)V

    .line 236
    .line 237
    .line 238
    return-object v2

    .line 239
    :cond_a
    throw v0
.end method


# virtual methods
.method public a(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, La0/c;

    .line 2
    .line 3
    invoke-direct {v0, p0}, La0/c;-><init>(La0/d;)V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 7
    .line 8
    invoke-static {v1, v0, p1}, Lkotlinx/coroutines/InterruptibleKt;->runInterruptible(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method
