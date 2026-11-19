.class final Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "com.zykj.download.work.DownloadFileWork$downloadFileWithProgress$error$1$1"
    f = "DownloadFileWork.kt"
    l = {
        0x6c,
        0x78,
        0x7b,
        0x78,
        0x7b,
        0x78,
        0x7b,
        0x78,
        0x7b,
        0x78,
        0x7b
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:I

.field public synthetic f:Ljava/lang/Object;

.field public final synthetic g:Lcom/zykj/download/work/DownloadFileWork;

.field public final synthetic h:Lxa/b;


# direct methods
.method public constructor <init>(Lcom/zykj/download/work/DownloadFileWork;Lxa/b;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->g:Lcom/zykj/download/work/DownloadFileWork;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->h:Lxa/b;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->g:Lcom/zykj/download/work/DownloadFileWork;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->h:Lxa/b;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;-><init>(Lcom/zykj/download/work/DownloadFileWork;Lxa/b;Lvc/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->f:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    iget v0, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->e:I

    .line 6
    .line 7
    const-wide/16 v2, 0x3e8

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :pswitch_0
    iget-object v0, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Ljava/lang/Throwable;

    .line 25
    .line 26
    iget-object v1, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->f:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Lkotlinx/coroutines/g;

    .line 29
    .line 30
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    goto/16 :goto_11

    .line 34
    .line 35
    :pswitch_1
    iget-object v0, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->d:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Ljava/lang/Throwable;

    .line 38
    .line 39
    iget-object v2, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->c:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v2, Lcom/zykj/http/exception/RemoteCodeException;

    .line 42
    .line 43
    iget-object v3, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->f:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v3, Lkotlinx/coroutines/g;

    .line 46
    .line 47
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto/16 :goto_f

    .line 51
    .line 52
    :pswitch_2
    iget-object v0, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->c:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 55
    .line 56
    iget-object v1, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->f:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v1, Lkotlinx/coroutines/g;

    .line 59
    .line 60
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto/16 :goto_8

    .line 64
    .line 65
    :pswitch_3
    iget-object v0, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->c:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 68
    .line 69
    iget-object v2, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->f:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v2, Lkotlinx/coroutines/g;

    .line 72
    .line 73
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    goto/16 :goto_7

    .line 77
    .line 78
    :pswitch_4
    iget-object v0, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->c:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 81
    .line 82
    iget-object v1, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->f:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v1, Lkotlinx/coroutines/g;

    .line 85
    .line 86
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    goto/16 :goto_8

    .line 90
    .line 91
    :pswitch_5
    iget-object v0, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->c:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 94
    .line 95
    iget-object v2, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->f:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v2, Lkotlinx/coroutines/g;

    .line 98
    .line 99
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    goto/16 :goto_a

    .line 103
    .line 104
    :pswitch_6
    iget-object v0, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->c:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 107
    .line 108
    iget-object v1, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->f:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v1, Lkotlinx/coroutines/g;

    .line 111
    .line 112
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    goto/16 :goto_8

    .line 116
    .line 117
    :pswitch_7
    iget-object v0, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->c:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 120
    .line 121
    iget-object v2, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->f:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v2, Lkotlinx/coroutines/g;

    .line 124
    .line 125
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    goto/16 :goto_c

    .line 129
    .line 130
    :pswitch_8
    iget-object v0, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->f:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v0, Lkotlinx/coroutines/g;

    .line 133
    .line 134
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    goto/16 :goto_5

    .line 138
    .line 139
    :pswitch_9
    iget-object v0, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->f:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v0, Lkotlinx/coroutines/g;

    .line 142
    .line 143
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    goto :goto_4

    .line 147
    :pswitch_a
    iget-object v0, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->f:Ljava/lang/Object;

    .line 148
    .line 149
    move-object v6, v0

    .line 150
    check-cast v6, Lkotlinx/coroutines/g;

    .line 151
    .line 152
    :try_start_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/net/UnknownServiceException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/net/SocketException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 153
    .line 154
    .line 155
    goto :goto_3

    .line 156
    :catchall_0
    move-exception v0

    .line 157
    :goto_0
    move-object p1, v0

    .line 158
    goto/16 :goto_6

    .line 159
    .line 160
    :catch_0
    move-exception v0

    .line 161
    :goto_1
    move-object p1, v0

    .line 162
    goto/16 :goto_9

    .line 163
    .line 164
    :catch_1
    move-exception v0

    .line 165
    :goto_2
    move-object p1, v0

    .line 166
    goto/16 :goto_b

    .line 167
    .line 168
    :pswitch_b
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    iget-object p1, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->f:Ljava/lang/Object;

    .line 172
    .line 173
    move-object v6, p1

    .line 174
    check-cast v6, Lsd/i0;

    .line 175
    .line 176
    new-instance v9, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1$job$1;

    .line 177
    .line 178
    iget-object p1, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->g:Lcom/zykj/download/work/DownloadFileWork;

    .line 179
    .line 180
    invoke-direct {v9, p1, v5}, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1$job$1;-><init>(Lcom/zykj/download/work/DownloadFileWork;Lvc/c;)V

    .line 181
    .line 182
    .line 183
    const/4 v10, 0x3

    .line 184
    const/4 v11, 0x0

    .line 185
    const/4 v7, 0x0

    .line 186
    const/4 v8, 0x0

    .line 187
    invoke-static/range {v6 .. v11}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    new-instance v9, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1$download$1;

    .line 192
    .line 193
    iget-object v0, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->g:Lcom/zykj/download/work/DownloadFileWork;

    .line 194
    .line 195
    iget-object v7, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->h:Lxa/b;

    .line 196
    .line 197
    invoke-direct {v9, v0, v7, v5}, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1$download$1;-><init>(Lcom/zykj/download/work/DownloadFileWork;Lxa/b;Lvc/c;)V

    .line 198
    .line 199
    .line 200
    const/4 v7, 0x0

    .line 201
    invoke-static/range {v6 .. v11}, Lsd/f;->b(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lsd/m0;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    :try_start_1
    iput-object p1, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->f:Ljava/lang/Object;

    .line 206
    .line 207
    iput v4, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->e:I

    .line 208
    .line 209
    invoke-interface {v0, p0}, Lsd/m0;->z(Lvc/c;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v0
    :try_end_1
    .catch Ljava/net/UnknownServiceException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/net/SocketException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 213
    if-ne v0, v1, :cond_0

    .line 214
    .line 215
    goto/16 :goto_10

    .line 216
    .line 217
    :cond_0
    move-object v6, p1

    .line 218
    :goto_3
    iput-object v6, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->f:Ljava/lang/Object;

    .line 219
    .line 220
    const/4 p1, 0x2

    .line 221
    iput p1, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->e:I

    .line 222
    .line 223
    invoke-static {v2, v3, p0}, Lkotlinx/coroutines/DelayKt;->b(JLvc/c;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    if-ne p1, v1, :cond_1

    .line 228
    .line 229
    goto/16 :goto_10

    .line 230
    .line 231
    :cond_1
    move-object v0, v6

    .line 232
    :goto_4
    iget-object p1, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->g:Lcom/zykj/download/work/DownloadFileWork;

    .line 233
    .line 234
    invoke-virtual {p1}, Lcom/zykj/download/work/DownloadFileWork;->getProxy()Lcom/zykj/download/work/DownloadFileWorkProxy;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    iget-object v2, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->h:Lxa/b;

    .line 239
    .line 240
    sget-object v3, Lcom/zykj/download/DownloadFlag;->DOWNLOAD_SUCCESS:Lcom/zykj/download/DownloadFlag;

    .line 241
    .line 242
    iput-object v0, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->f:Ljava/lang/Object;

    .line 243
    .line 244
    const/4 v6, 0x3

    .line 245
    iput v6, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->e:I

    .line 246
    .line 247
    invoke-virtual {p1, v2, v3, p0}, Lcom/zykj/download/work/DownloadFileWorkProxy;->updateFlag(Lxa/b;Lcom/zykj/download/DownloadFlag;Lvc/c;)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    if-ne p1, v1, :cond_2

    .line 252
    .line 253
    goto/16 :goto_10

    .line 254
    .line 255
    :cond_2
    :goto_5
    invoke-static {v0, v5, v4, v5}, Lkotlinx/coroutines/g$a;->a(Lkotlinx/coroutines/g;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    return-object v5

    .line 259
    :catchall_1
    move-exception v0

    .line 260
    move-object v6, p1

    .line 261
    goto :goto_0

    .line 262
    :catch_2
    move-exception v0

    .line 263
    move-object v6, p1

    .line 264
    goto :goto_1

    .line 265
    :catch_3
    move-exception v0

    .line 266
    move-object v6, p1

    .line 267
    goto :goto_2

    .line 268
    :goto_6
    :try_start_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 269
    .line 270
    .line 271
    new-instance v0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 272
    .line 273
    sget-object v7, Lcom/zykj/lib/error/code/ErrorCode;->DEFAULT_ERROR:Lcom/zykj/lib/error/code/ErrorCode;

    .line 274
    .line 275
    invoke-direct {v0, v7, p1}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 276
    .line 277
    .line 278
    iput-object v6, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->f:Ljava/lang/Object;

    .line 279
    .line 280
    iput-object v0, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->c:Ljava/lang/Object;

    .line 281
    .line 282
    const/16 p1, 0x8

    .line 283
    .line 284
    iput p1, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->e:I

    .line 285
    .line 286
    invoke-static {v2, v3, p0}, Lkotlinx/coroutines/DelayKt;->b(JLvc/c;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object p1

    .line 290
    if-ne p1, v1, :cond_3

    .line 291
    .line 292
    goto/16 :goto_10

    .line 293
    .line 294
    :cond_3
    move-object v2, v6

    .line 295
    :goto_7
    if-nez v0, :cond_5

    .line 296
    .line 297
    iget-object p1, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->g:Lcom/zykj/download/work/DownloadFileWork;

    .line 298
    .line 299
    invoke-virtual {p1}, Lcom/zykj/download/work/DownloadFileWork;->getProxy()Lcom/zykj/download/work/DownloadFileWorkProxy;

    .line 300
    .line 301
    .line 302
    move-result-object p1

    .line 303
    iget-object v3, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->h:Lxa/b;

    .line 304
    .line 305
    sget-object v6, Lcom/zykj/download/DownloadFlag;->DOWNLOAD_SUCCESS:Lcom/zykj/download/DownloadFlag;

    .line 306
    .line 307
    iput-object v2, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->f:Ljava/lang/Object;

    .line 308
    .line 309
    iput-object v0, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->c:Ljava/lang/Object;

    .line 310
    .line 311
    const/16 v7, 0x9

    .line 312
    .line 313
    iput v7, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->e:I

    .line 314
    .line 315
    invoke-virtual {p1, v3, v6, p0}, Lcom/zykj/download/work/DownloadFileWorkProxy;->updateFlag(Lxa/b;Lcom/zykj/download/DownloadFlag;Lvc/c;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object p1

    .line 319
    if-ne p1, v1, :cond_4

    .line 320
    .line 321
    goto/16 :goto_10

    .line 322
    .line 323
    :cond_4
    move-object v1, v2

    .line 324
    :goto_8
    move-object v2, v1

    .line 325
    :cond_5
    invoke-static {v2, v5, v4, v5}, Lkotlinx/coroutines/g$a;->a(Lkotlinx/coroutines/g;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 326
    .line 327
    .line 328
    goto/16 :goto_d

    .line 329
    .line 330
    :catchall_2
    move-exception v0

    .line 331
    move-object p1, v0

    .line 332
    goto/16 :goto_e

    .line 333
    .line 334
    :goto_9
    :try_start_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 335
    .line 336
    .line 337
    new-instance v0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 338
    .line 339
    sget-object v7, Lcom/zykj/lib/error/code/ErrorCode;->NET_SOCKET_TIME_OUT:Lcom/zykj/lib/error/code/ErrorCode;

    .line 340
    .line 341
    invoke-direct {v0, v7, p1}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 342
    .line 343
    .line 344
    iput-object v6, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->f:Ljava/lang/Object;

    .line 345
    .line 346
    iput-object v0, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->c:Ljava/lang/Object;

    .line 347
    .line 348
    const/4 p1, 0x6

    .line 349
    iput p1, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->e:I

    .line 350
    .line 351
    invoke-static {v2, v3, p0}, Lkotlinx/coroutines/DelayKt;->b(JLvc/c;)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object p1

    .line 355
    if-ne p1, v1, :cond_6

    .line 356
    .line 357
    goto/16 :goto_10

    .line 358
    .line 359
    :cond_6
    move-object v2, v6

    .line 360
    :goto_a
    if-nez v0, :cond_5

    .line 361
    .line 362
    iget-object p1, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->g:Lcom/zykj/download/work/DownloadFileWork;

    .line 363
    .line 364
    invoke-virtual {p1}, Lcom/zykj/download/work/DownloadFileWork;->getProxy()Lcom/zykj/download/work/DownloadFileWorkProxy;

    .line 365
    .line 366
    .line 367
    move-result-object p1

    .line 368
    iget-object v3, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->h:Lxa/b;

    .line 369
    .line 370
    sget-object v6, Lcom/zykj/download/DownloadFlag;->DOWNLOAD_SUCCESS:Lcom/zykj/download/DownloadFlag;

    .line 371
    .line 372
    iput-object v2, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->f:Ljava/lang/Object;

    .line 373
    .line 374
    iput-object v0, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->c:Ljava/lang/Object;

    .line 375
    .line 376
    const/4 v7, 0x7

    .line 377
    iput v7, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->e:I

    .line 378
    .line 379
    invoke-virtual {p1, v3, v6, p0}, Lcom/zykj/download/work/DownloadFileWorkProxy;->updateFlag(Lxa/b;Lcom/zykj/download/DownloadFlag;Lvc/c;)Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object p1

    .line 383
    if-ne p1, v1, :cond_7

    .line 384
    .line 385
    goto/16 :goto_10

    .line 386
    .line 387
    :cond_7
    move-object v1, v2

    .line 388
    goto :goto_8

    .line 389
    :goto_b
    :try_start_4
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 390
    .line 391
    .line 392
    new-instance v0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 393
    .line 394
    sget-object v7, Lcom/zykj/lib/error/code/ErrorCode;->NET_UN_KNOW_SERVER:Lcom/zykj/lib/error/code/ErrorCode;

    .line 395
    .line 396
    invoke-direct {v0, v7, p1}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 397
    .line 398
    .line 399
    iput-object v6, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->f:Ljava/lang/Object;

    .line 400
    .line 401
    iput-object v0, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->c:Ljava/lang/Object;

    .line 402
    .line 403
    const/4 p1, 0x4

    .line 404
    iput p1, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->e:I

    .line 405
    .line 406
    invoke-static {v2, v3, p0}, Lkotlinx/coroutines/DelayKt;->b(JLvc/c;)Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object p1

    .line 410
    if-ne p1, v1, :cond_8

    .line 411
    .line 412
    goto :goto_10

    .line 413
    :cond_8
    move-object v2, v6

    .line 414
    :goto_c
    if-nez v0, :cond_5

    .line 415
    .line 416
    iget-object p1, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->g:Lcom/zykj/download/work/DownloadFileWork;

    .line 417
    .line 418
    invoke-virtual {p1}, Lcom/zykj/download/work/DownloadFileWork;->getProxy()Lcom/zykj/download/work/DownloadFileWorkProxy;

    .line 419
    .line 420
    .line 421
    move-result-object p1

    .line 422
    iget-object v3, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->h:Lxa/b;

    .line 423
    .line 424
    sget-object v6, Lcom/zykj/download/DownloadFlag;->DOWNLOAD_SUCCESS:Lcom/zykj/download/DownloadFlag;

    .line 425
    .line 426
    iput-object v2, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->f:Ljava/lang/Object;

    .line 427
    .line 428
    iput-object v0, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->c:Ljava/lang/Object;

    .line 429
    .line 430
    const/4 v7, 0x5

    .line 431
    iput v7, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->e:I

    .line 432
    .line 433
    invoke-virtual {p1, v3, v6, p0}, Lcom/zykj/download/work/DownloadFileWorkProxy;->updateFlag(Lxa/b;Lcom/zykj/download/DownloadFlag;Lvc/c;)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object p1

    .line 437
    if-ne p1, v1, :cond_9

    .line 438
    .line 439
    goto :goto_10

    .line 440
    :cond_9
    move-object v1, v2

    .line 441
    goto :goto_8

    .line 442
    :goto_d
    return-object v0

    .line 443
    :goto_e
    iput-object v6, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->f:Ljava/lang/Object;

    .line 444
    .line 445
    iput-object v5, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->c:Ljava/lang/Object;

    .line 446
    .line 447
    iput-object p1, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->d:Ljava/lang/Object;

    .line 448
    .line 449
    const/16 v0, 0xa

    .line 450
    .line 451
    iput v0, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->e:I

    .line 452
    .line 453
    invoke-static {v2, v3, p0}, Lkotlinx/coroutines/DelayKt;->b(JLvc/c;)Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    if-ne v0, v1, :cond_a

    .line 458
    .line 459
    goto :goto_10

    .line 460
    :cond_a
    move-object v0, p1

    .line 461
    move-object v2, v5

    .line 462
    move-object v3, v6

    .line 463
    :goto_f
    if-nez v2, :cond_c

    .line 464
    .line 465
    iget-object p1, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->g:Lcom/zykj/download/work/DownloadFileWork;

    .line 466
    .line 467
    invoke-virtual {p1}, Lcom/zykj/download/work/DownloadFileWork;->getProxy()Lcom/zykj/download/work/DownloadFileWorkProxy;

    .line 468
    .line 469
    .line 470
    move-result-object p1

    .line 471
    iget-object v2, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->h:Lxa/b;

    .line 472
    .line 473
    sget-object v6, Lcom/zykj/download/DownloadFlag;->DOWNLOAD_SUCCESS:Lcom/zykj/download/DownloadFlag;

    .line 474
    .line 475
    iput-object v3, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->f:Ljava/lang/Object;

    .line 476
    .line 477
    iput-object v0, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->c:Ljava/lang/Object;

    .line 478
    .line 479
    iput-object v5, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->d:Ljava/lang/Object;

    .line 480
    .line 481
    const/16 v7, 0xb

    .line 482
    .line 483
    iput v7, p0, Lcom/zykj/download/work/DownloadFileWork$downloadFileWithProgress$error$1$1;->e:I

    .line 484
    .line 485
    invoke-virtual {p1, v2, v6, p0}, Lcom/zykj/download/work/DownloadFileWorkProxy;->updateFlag(Lxa/b;Lcom/zykj/download/DownloadFlag;Lvc/c;)Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object p1

    .line 489
    if-ne p1, v1, :cond_b

    .line 490
    .line 491
    :goto_10
    return-object v1

    .line 492
    :cond_b
    move-object v1, v3

    .line 493
    :goto_11
    move-object v3, v1

    .line 494
    :cond_c
    invoke-static {v3, v5, v4, v5}, Lkotlinx/coroutines/g$a;->a(Lkotlinx/coroutines/g;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 495
    .line 496
    .line 497
    throw v0

    .line 498
    nop

    .line 499
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
