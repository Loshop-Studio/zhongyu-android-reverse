.class final Lcom/canhub/cropper/BitmapLoadingWorkerJob$start$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lr6/e;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lkotlinx/coroutines/v;",
        "Ld6/s;",
        "<anonymous>",
        "(Lkotlinx/coroutines/v;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.canhub.cropper.BitmapLoadingWorkerJob$start$1"
    f = "BitmapLoadingWorkerJob.kt"
    i = {}
    l = {
        0x34,
        0x42
    }
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/canhub/cropper/d;


# direct methods
.method public constructor <init>(Lcom/canhub/cropper/d;Lh6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/canhub/cropper/d;",
            "Lh6/c<",
            "-",
            "Lcom/canhub/cropper/BitmapLoadingWorkerJob$start$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$start$1;->this$0:Lcom/canhub/cropper/d;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILh6/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lh6/c;)Lh6/c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lh6/c<",
            "*>;)",
            "Lh6/c<",
            "Ld6/s;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$start$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$start$1;->this$0:Lcom/canhub/cropper/d;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/canhub/cropper/BitmapLoadingWorkerJob$start$1;-><init>(Lcom/canhub/cropper/d;Lh6/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcom/canhub/cropper/BitmapLoadingWorkerJob$start$1;->L$0:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/v;

    check-cast p2, Lh6/c;

    invoke-virtual {p0, p1, p2}, Lcom/canhub/cropper/BitmapLoadingWorkerJob$start$1;->invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/v;Lh6/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/v;",
            "Lh6/c<",
            "-",
            "Ld6/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/canhub/cropper/BitmapLoadingWorkerJob$start$1;->create(Ljava/lang/Object;Lh6/c;)Lh6/c;

    move-result-object p1

    check-cast p1, Lcom/canhub/cropper/BitmapLoadingWorkerJob$start$1;

    sget-object p2, Ld6/s;->a:Ld6/s;

    invoke-virtual {p1, p2}, Lcom/canhub/cropper/BitmapLoadingWorkerJob$start$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget-object v2, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 4
    .line 5
    iget v0, v1, Lcom/canhub/cropper/BitmapLoadingWorkerJob$start$1;->label:I

    .line 6
    .line 7
    sget-object v3, Ld6/s;->a:Ld6/s;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x1

    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    if-eq v0, v6, :cond_1

    .line 15
    .line 16
    if-ne v0, v5, :cond_0

    .line 17
    .line 18
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto/16 :goto_9

    .line 22
    .line 23
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw v0

    .line 31
    :cond_1
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    .line 34
    goto/16 :goto_9

    .line 35
    .line 36
    :catch_0
    move-exception v0

    .line 37
    move-object v13, v0

    .line 38
    goto/16 :goto_6

    .line 39
    .line 40
    :cond_2
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget-object v0, v1, Lcom/canhub/cropper/BitmapLoadingWorkerJob$start$1;->L$0:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Lkotlinx/coroutines/v;

    .line 46
    .line 47
    :try_start_1
    invoke-static {v0}, Lkotlinx/coroutines/x;->s(Lkotlinx/coroutines/v;)Z

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    if-eqz v7, :cond_e

    .line 52
    .line 53
    sget-object v7, Lcom/canhub/cropper/h;->a:Landroid/graphics/Rect;

    .line 54
    .line 55
    iget-object v7, v1, Lcom/canhub/cropper/BitmapLoadingWorkerJob$start$1;->this$0:Lcom/canhub/cropper/d;

    .line 56
    .line 57
    iget-object v8, v7, Lcom/canhub/cropper/d;->a:Landroid/content/Context;

    .line 58
    .line 59
    iget-object v9, v7, Lcom/canhub/cropper/d;->b:Landroid/net/Uri;

    .line 60
    .line 61
    iget v10, v7, Lcom/canhub/cropper/d;->c:I

    .line 62
    .line 63
    iget v7, v7, Lcom/canhub/cropper/d;->d:I

    .line 64
    .line 65
    invoke-static {v8, v9, v10, v7}, Lcom/canhub/cropper/h;->i(Landroid/content/Context;Landroid/net/Uri;II)Lcom/canhub/cropper/e;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    invoke-static {v0}, Lkotlinx/coroutines/x;->s(Lkotlinx/coroutines/v;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_e

    .line 74
    .line 75
    iget-object v8, v7, Lcom/canhub/cropper/e;->a:Landroid/graphics/Bitmap;

    .line 76
    .line 77
    iget-object v0, v1, Lcom/canhub/cropper/BitmapLoadingWorkerJob$start$1;->this$0:Lcom/canhub/cropper/d;

    .line 78
    .line 79
    iget-object v9, v0, Lcom/canhub/cropper/d;->a:Landroid/content/Context;

    .line 80
    .line 81
    iget-object v0, v0, Lcom/canhub/cropper/d;->b:Landroid/net/Uri;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 82
    .line 83
    :try_start_2
    invoke-virtual {v9}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    invoke-virtual {v9, v0}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 88
    .line 89
    .line 90
    move-result-object v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 91
    if-eqz v9, :cond_3

    .line 92
    .line 93
    :try_start_3
    new-instance v0, Landroidx/exifinterface/media/ExifInterface;

    .line 94
    .line 95
    invoke-direct {v0, v9}, Landroidx/exifinterface/media/ExifInterface;-><init>(Ljava/io/InputStream;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 96
    .line 97
    .line 98
    :try_start_4
    invoke-interface {v9}, Ljava/io/Closeable;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :catchall_0
    move-exception v0

    .line 103
    move-object v10, v0

    .line 104
    :try_start_5
    throw v10
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 105
    :catchall_1
    move-exception v0

    .line 106
    :try_start_6
    invoke-static {v9, v10}, Lcoil3/network/g;->e(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 107
    .line 108
    .line 109
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 110
    :catchall_2
    :cond_3
    move-object v0, v4

    .line 111
    :goto_0
    const/4 v9, 0x0

    .line 112
    if-eqz v0, :cond_b

    .line 113
    .line 114
    :try_start_7
    const-string v10, "Orientation"

    .line 115
    .line 116
    invoke-virtual {v0, v10, v6}, Landroidx/exifinterface/media/ExifInterface;->getAttributeInt(Ljava/lang/String;I)I

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    const/4 v10, 0x3

    .line 121
    const/4 v11, 0x7

    .line 122
    const/4 v12, 0x5

    .line 123
    if-eq v0, v10, :cond_6

    .line 124
    .line 125
    if-eq v0, v12, :cond_5

    .line 126
    .line 127
    const/4 v10, 0x6

    .line 128
    if-eq v0, v10, :cond_5

    .line 129
    .line 130
    if-eq v0, v11, :cond_5

    .line 131
    .line 132
    const/16 v10, 0x8

    .line 133
    .line 134
    if-eq v0, v10, :cond_4

    .line 135
    .line 136
    move v10, v9

    .line 137
    goto :goto_1

    .line 138
    :cond_4
    const/16 v10, 0x10e

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_5
    const/16 v10, 0x5a

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_6
    const/16 v10, 0xb4

    .line 145
    .line 146
    :goto_1
    if-eq v0, v5, :cond_8

    .line 147
    .line 148
    if-ne v0, v12, :cond_7

    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_7
    move v12, v9

    .line 152
    goto :goto_3

    .line 153
    :cond_8
    :goto_2
    move v12, v6

    .line 154
    :goto_3
    const/4 v13, 0x4

    .line 155
    if-eq v0, v13, :cond_9

    .line 156
    .line 157
    if-ne v0, v11, :cond_a

    .line 158
    .line 159
    :cond_9
    move v9, v6

    .line 160
    :cond_a
    new-instance v0, Lcom/canhub/cropper/f;

    .line 161
    .line 162
    invoke-direct {v0, v8, v10, v12, v9}, Lcom/canhub/cropper/f;-><init>(Landroid/graphics/Bitmap;IZZ)V

    .line 163
    .line 164
    .line 165
    goto :goto_4

    .line 166
    :cond_b
    new-instance v0, Lcom/canhub/cropper/f;

    .line 167
    .line 168
    invoke-direct {v0, v8, v9, v9, v9}, Lcom/canhub/cropper/f;-><init>(Landroid/graphics/Bitmap;IZZ)V

    .line 169
    .line 170
    .line 171
    :goto_4
    iget-object v8, v1, Lcom/canhub/cropper/BitmapLoadingWorkerJob$start$1;->this$0:Lcom/canhub/cropper/d;

    .line 172
    .line 173
    new-instance v9, Lcom/canhub/cropper/c;

    .line 174
    .line 175
    iget-object v10, v8, Lcom/canhub/cropper/d;->b:Landroid/net/Uri;

    .line 176
    .line 177
    iget-object v11, v0, Lcom/canhub/cropper/f;->d:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v11, Landroid/graphics/Bitmap;

    .line 180
    .line 181
    iget v12, v7, Lcom/canhub/cropper/e;->b:I

    .line 182
    .line 183
    iget v13, v0, Lcom/canhub/cropper/f;->a:I

    .line 184
    .line 185
    iget-boolean v14, v0, Lcom/canhub/cropper/f;->b:Z

    .line 186
    .line 187
    iget-boolean v15, v0, Lcom/canhub/cropper/f;->c:Z

    .line 188
    .line 189
    const/16 v16, 0x0

    .line 190
    .line 191
    invoke-direct/range {v9 .. v16}, Lcom/canhub/cropper/c;-><init>(Landroid/net/Uri;Landroid/graphics/Bitmap;IIZZLjava/lang/Exception;)V

    .line 192
    .line 193
    .line 194
    iput v6, v1, Lcom/canhub/cropper/BitmapLoadingWorkerJob$start$1;->label:I

    .line 195
    .line 196
    sget-object v0, Lkotlinx/coroutines/f0;->a:Lg7/e;

    .line 197
    .line 198
    sget-object v0, Le7/k;->a:Ld7/d;

    .line 199
    .line 200
    new-instance v6, Lcom/canhub/cropper/BitmapLoadingWorkerJob$onPostExecute$2;

    .line 201
    .line 202
    invoke-direct {v6, v8, v9, v4}, Lcom/canhub/cropper/BitmapLoadingWorkerJob$onPostExecute$2;-><init>(Lcom/canhub/cropper/d;Lcom/canhub/cropper/c;Lh6/c;)V

    .line 203
    .line 204
    .line 205
    invoke-static {v0, v6, v1}, Lkotlinx/coroutines/x;->F(Lh6/h;Lr6/e;Lh6/c;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    sget-object v4, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    .line 210
    .line 211
    if-ne v0, v4, :cond_c

    .line 212
    .line 213
    goto :goto_5

    .line 214
    :cond_c
    move-object v0, v3

    .line 215
    :goto_5
    if-ne v0, v2, :cond_e

    .line 216
    .line 217
    goto :goto_8

    .line 218
    :goto_6
    iget-object v0, v1, Lcom/canhub/cropper/BitmapLoadingWorkerJob$start$1;->this$0:Lcom/canhub/cropper/d;

    .line 219
    .line 220
    new-instance v6, Lcom/canhub/cropper/c;

    .line 221
    .line 222
    iget-object v7, v0, Lcom/canhub/cropper/d;->b:Landroid/net/Uri;

    .line 223
    .line 224
    const/4 v11, 0x0

    .line 225
    const/4 v12, 0x0

    .line 226
    const/4 v8, 0x0

    .line 227
    const/4 v9, 0x0

    .line 228
    const/4 v10, 0x0

    .line 229
    invoke-direct/range {v6 .. v13}, Lcom/canhub/cropper/c;-><init>(Landroid/net/Uri;Landroid/graphics/Bitmap;IIZZLjava/lang/Exception;)V

    .line 230
    .line 231
    .line 232
    iput v5, v1, Lcom/canhub/cropper/BitmapLoadingWorkerJob$start$1;->label:I

    .line 233
    .line 234
    sget-object v5, Lkotlinx/coroutines/f0;->a:Lg7/e;

    .line 235
    .line 236
    sget-object v5, Le7/k;->a:Ld7/d;

    .line 237
    .line 238
    new-instance v7, Lcom/canhub/cropper/BitmapLoadingWorkerJob$onPostExecute$2;

    .line 239
    .line 240
    invoke-direct {v7, v0, v6, v4}, Lcom/canhub/cropper/BitmapLoadingWorkerJob$onPostExecute$2;-><init>(Lcom/canhub/cropper/d;Lcom/canhub/cropper/c;Lh6/c;)V

    .line 241
    .line 242
    .line 243
    invoke-static {v5, v7, v1}, Lkotlinx/coroutines/x;->F(Lh6/h;Lr6/e;Lh6/c;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    sget-object v4, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 248
    .line 249
    if-ne v0, v4, :cond_d

    .line 250
    .line 251
    goto :goto_7

    .line 252
    :cond_d
    move-object v0, v3

    .line 253
    :goto_7
    if-ne v0, v2, :cond_e

    .line 254
    .line 255
    :goto_8
    return-object v2

    .line 256
    :cond_e
    :goto_9
    return-object v3
.end method
