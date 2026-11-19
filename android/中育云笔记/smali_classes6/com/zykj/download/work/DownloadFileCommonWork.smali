.class public Lcom/zykj/download/work/DownloadFileCommonWork;
.super Lcom/zykj/download/work/DownloadFileWork;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/download/work/DownloadFileCommonWork$a;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/zykj/download/work/DownloadFileCommonWork$a;

.field private static downLoadApi:Lcom/zykj/download/api/DownLoadApi;

.field private static final okHttpClient:Lje/v;


# instance fields
.field private final TAG:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/zykj/download/work/DownloadFileCommonWork$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/zykj/download/work/DownloadFileCommonWork$a;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/zykj/download/work/DownloadFileCommonWork;->Companion:Lcom/zykj/download/work/DownloadFileCommonWork$a;

    .line 8
    .line 9
    new-instance v0, Lje/v$a;

    .line 10
    .line 11
    invoke-direct {v0}, Lje/v$a;-><init>()V

    .line 12
    .line 13
    .line 14
    const-wide/16 v1, 0x2

    .line 15
    .line 16
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 17
    .line 18
    invoke-virtual {v0, v1, v2, v3}, Lje/v$a;->O(JLjava/util/concurrent/TimeUnit;)Lje/v$a;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lje/v$a;->c()Lje/v;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lcom/zykj/download/work/DownloadFileCommonWork;->okHttpClient:Lje/v;

    .line 26
    .line 27
    new-instance v1, Ldf/d0$b;

    .line 28
    .line 29
    invoke-direct {v1}, Ldf/d0$b;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v0}, Ldf/d0$b;->f(Lje/v;)Ldf/d0$b;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const-string v1, "http://www.zykj.com/"

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ldf/d0$b;->b(Ljava/lang/String;)Ldf/d0$b;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Ldf/d0$b;->d()Ldf/d0;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    const-class v1, Lcom/zykj/download/api/DownLoadApi;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ldf/d0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    const-string v1, "Builder()\n            .client(okHttpClient)\n            .baseUrl(\"http://www.zykj.com/\")//\u8fd9\u91cc\u4e0d\u91cd\u8981\uff0c\u5728\u8bf7\u6c42\u65f6\uff0c\u4f1a\u88ab\u5b8c\u6574url\u66ff\u6362\u6389\n            .build().create(DownLoadApi::class.java)"

    .line 53
    .line 54
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    check-cast v0, Lcom/zykj/download/api/DownLoadApi;

    .line 58
    .line 59
    sput-object v0, Lcom/zykj/download/work/DownloadFileCommonWork;->downLoadApi:Lcom/zykj/download/api/DownLoadApi;

    .line 60
    .line 61
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    .line 1
    const-string v0, "appContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "workerParams"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1, p2}, Lcom/zykj/download/work/DownloadFileWork;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    .line 12
    .line 13
    .line 14
    const-string p1, "DownloadFileCommonWork"

    .line 15
    .line 16
    iput-object p1, p0, Lcom/zykj/download/work/DownloadFileCommonWork;->TAG:Ljava/lang/String;

    .line 17
    .line 18
    return-void
.end method

.method public static synthetic downloadFile$suspendImpl(Lcom/zykj/download/work/DownloadFileCommonWork;Lxa/b;Lvc/c;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    instance-of v2, v1, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->s:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->s:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;-><init>(Lcom/zykj/download/work/DownloadFileCommonWork;Lvc/c;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->q:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget v4, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->s:I

    .line 36
    .line 37
    const/4 v6, 0x4

    .line 38
    const/4 v7, 0x3

    .line 39
    const/4 v8, 0x2

    .line 40
    const/4 v9, 0x1

    .line 41
    if-eqz v4, :cond_5

    .line 42
    .line 43
    if-eq v4, v9, :cond_4

    .line 44
    .line 45
    if-eq v4, v8, :cond_3

    .line 46
    .line 47
    if-eq v4, v7, :cond_2

    .line 48
    .line 49
    if-ne v4, v6, :cond_1

    .line 50
    .line 51
    iget-object v0, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->e:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Ljava/lang/Throwable;

    .line 54
    .line 55
    iget-object v3, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->d:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v3, Ljava/io/Closeable;

    .line 58
    .line 59
    iget-object v2, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->c:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v2, Lcom/zykj/download/work/DownloadFileCommonWork;

    .line 62
    .line 63
    :try_start_0
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    .line 65
    .line 66
    goto/16 :goto_9

    .line 67
    .line 68
    :catchall_0
    move-exception v0

    .line 69
    move-object v1, v0

    .line 70
    goto/16 :goto_d

    .line 71
    .line 72
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 73
    .line 74
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 75
    .line 76
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw v0

    .line 80
    :cond_2
    iget-wide v11, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->p:J

    .line 81
    .line 82
    iget-object v0, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->o:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v0, Ljava/lang/Throwable;

    .line 85
    .line 86
    iget-object v4, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->n:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v4, Ljava/io/Closeable;

    .line 89
    .line 90
    iget-object v8, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->m:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v8, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 93
    .line 94
    iget-object v13, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->l:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v13, Lkotlin/jvm/internal/Ref$LongRef;

    .line 97
    .line 98
    iget-object v14, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->k:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v14, Lkotlin/jvm/internal/Ref$IntRef;

    .line 101
    .line 102
    iget-object v15, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->j:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v15, Ljava/io/RandomAccessFile;

    .line 105
    .line 106
    const/high16 p2, 0x42c80000    # 100.0f

    .line 107
    .line 108
    iget-object v5, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->i:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v5, Ljava/lang/Throwable;

    .line 111
    .line 112
    iget-object v6, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->h:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v6, Ljava/io/Closeable;

    .line 115
    .line 116
    iget-object v10, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->g:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v10, Ljava/io/InputStream;

    .line 119
    .line 120
    iget-object v7, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->f:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v7, [B

    .line 123
    .line 124
    iget-object v9, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->e:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v9, Ldf/c0;

    .line 127
    .line 128
    move-object/from16 p0, v0

    .line 129
    .line 130
    iget-object v0, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->d:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v0, Lxa/b;

    .line 133
    .line 134
    move-object/from16 p1, v0

    .line 135
    .line 136
    iget-object v0, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->c:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v0, Lcom/zykj/download/work/DownloadFileCommonWork;

    .line 139
    .line 140
    :try_start_1
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 141
    .line 142
    .line 143
    move-object/from16 v20, p1

    .line 144
    .line 145
    move-object/from16 p1, p0

    .line 146
    .line 147
    move-object/from16 p0, v20

    .line 148
    .line 149
    move-object/from16 v20, v5

    .line 150
    .line 151
    move-object v5, v2

    .line 152
    move-object/from16 v2, v20

    .line 153
    .line 154
    move-object/from16 v20, v4

    .line 155
    .line 156
    move-object v4, v0

    .line 157
    move-object v0, v13

    .line 158
    move-object v13, v3

    .line 159
    move-object v3, v15

    .line 160
    move-object/from16 v21, v6

    .line 161
    .line 162
    move-object/from16 v6, v20

    .line 163
    .line 164
    move-wide/from16 v22, v11

    .line 165
    .line 166
    move-object/from16 v11, v21

    .line 167
    .line 168
    move-object v12, v10

    .line 169
    move-object v10, v9

    .line 170
    move-object v9, v14

    .line 171
    move-wide/from16 v14, v22

    .line 172
    .line 173
    goto/16 :goto_6

    .line 174
    .line 175
    :catchall_1
    move-exception v0

    .line 176
    move-object v1, v0

    .line 177
    move-object v3, v6

    .line 178
    goto/16 :goto_c

    .line 179
    .line 180
    :cond_3
    const/high16 p2, 0x42c80000    # 100.0f

    .line 181
    .line 182
    iget-wide v4, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->p:J

    .line 183
    .line 184
    iget-object v0, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->g:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v0, Lje/z;

    .line 187
    .line 188
    iget-object v6, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->f:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v6, Ldf/c0;

    .line 191
    .line 192
    iget-object v7, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->e:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v7, Lkotlin/jvm/internal/Ref$LongRef;

    .line 195
    .line 196
    iget-object v8, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->d:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v8, Lxa/b;

    .line 199
    .line 200
    iget-object v9, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->c:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast v9, Lcom/zykj/download/work/DownloadFileCommonWork;

    .line 203
    .line 204
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    move-object v1, v9

    .line 208
    const/4 v9, 0x1

    .line 209
    goto/16 :goto_3

    .line 210
    .line 211
    :cond_4
    const/high16 p2, 0x42c80000    # 100.0f

    .line 212
    .line 213
    iget-object v0, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->e:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v0, Lkotlin/jvm/internal/Ref$LongRef;

    .line 216
    .line 217
    iget-object v4, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->d:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v4, Lxa/b;

    .line 220
    .line 221
    iget-object v5, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->c:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast v5, Lcom/zykj/download/work/DownloadFileCommonWork;

    .line 224
    .line 225
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    move-object v7, v0

    .line 229
    move-object v0, v5

    .line 230
    const/4 v9, 0x1

    .line 231
    goto :goto_2

    .line 232
    :cond_5
    const/high16 p2, 0x42c80000    # 100.0f

    .line 233
    .line 234
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    new-instance v1, Lkotlin/jvm/internal/Ref$LongRef;

    .line 238
    .line 239
    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 240
    .line 241
    .line 242
    invoke-virtual/range {p1 .. p1}, Lxa/b;->c()J

    .line 243
    .line 244
    .line 245
    move-result-wide v4

    .line 246
    const-wide/16 v6, 0x0

    .line 247
    .line 248
    cmp-long v4, v4, v6

    .line 249
    .line 250
    if-lez v4, :cond_6

    .line 251
    .line 252
    invoke-virtual/range {p1 .. p1}, Lxa/b;->c()J

    .line 253
    .line 254
    .line 255
    move-result-wide v4

    .line 256
    const-wide/16 v6, 0x1

    .line 257
    .line 258
    sub-long/2addr v4, v6

    .line 259
    iput-wide v4, v1, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 260
    .line 261
    :cond_6
    new-instance v4, Ljava/lang/StringBuilder;

    .line 262
    .line 263
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 264
    .line 265
    .line 266
    const-string v5, "bytes="

    .line 267
    .line 268
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    iget-wide v5, v1, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 272
    .line 273
    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    const/16 v5, 0x2d

    .line 277
    .line 278
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v4

    .line 285
    iget-object v5, v0, Lcom/zykj/download/work/DownloadFileCommonWork;->TAG:Ljava/lang/String;

    .line 286
    .line 287
    const-string v6, "Content-range="

    .line 288
    .line 289
    invoke-static {v6, v4}, Lkotlin/jvm/internal/u;->p(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v6

    .line 293
    invoke-static {v5, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 294
    .line 295
    .line 296
    sget-object v5, Lcom/zykj/download/work/DownloadFileCommonWork;->downLoadApi:Lcom/zykj/download/api/DownLoadApi;

    .line 297
    .line 298
    invoke-virtual {v0}, Lcom/zykj/download/work/DownloadFileWork;->getDownloadUrl()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v6

    .line 302
    iput-object v0, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->c:Ljava/lang/Object;

    .line 303
    .line 304
    move-object/from16 v7, p1

    .line 305
    .line 306
    iput-object v7, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->d:Ljava/lang/Object;

    .line 307
    .line 308
    iput-object v1, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->e:Ljava/lang/Object;

    .line 309
    .line 310
    const/4 v9, 0x1

    .line 311
    iput v9, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->s:I

    .line 312
    .line 313
    invoke-interface {v5, v6, v4, v2}, Lcom/zykj/download/api/DownLoadApi;->download(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v4

    .line 317
    if-ne v4, v3, :cond_7

    .line 318
    .line 319
    :goto_1
    move-object v13, v3

    .line 320
    goto/16 :goto_8

    .line 321
    .line 322
    :cond_7
    move-object/from16 v20, v7

    .line 323
    .line 324
    move-object v7, v1

    .line 325
    move-object v1, v4

    .line 326
    move-object/from16 v4, v20

    .line 327
    .line 328
    :goto_2
    move-object v6, v1

    .line 329
    check-cast v6, Ldf/c0;

    .line 330
    .line 331
    invoke-virtual {v6}, Ldf/c0;->e()Z

    .line 332
    .line 333
    .line 334
    move-result v1

    .line 335
    if-eqz v1, :cond_11

    .line 336
    .line 337
    invoke-virtual {v6}, Ldf/c0;->a()Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v1

    .line 341
    if-eqz v1, :cond_10

    .line 342
    .line 343
    invoke-virtual {v6}, Ldf/c0;->a()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    check-cast v1, Lje/z;

    .line 348
    .line 349
    if-nez v1, :cond_8

    .line 350
    .line 351
    goto/16 :goto_b

    .line 352
    .line 353
    :cond_8
    iget-wide v10, v7, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 354
    .line 355
    invoke-virtual {v1}, Lje/z;->contentLength()J

    .line 356
    .line 357
    .line 358
    move-result-wide v12

    .line 359
    add-long/2addr v10, v12

    .line 360
    invoke-virtual {v0}, Lcom/zykj/download/work/DownloadFileWork;->getProxy()Lcom/zykj/download/work/DownloadFileWorkProxy;

    .line 361
    .line 362
    .line 363
    move-result-object v5

    .line 364
    iput-object v0, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->c:Ljava/lang/Object;

    .line 365
    .line 366
    iput-object v4, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->d:Ljava/lang/Object;

    .line 367
    .line 368
    iput-object v7, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->e:Ljava/lang/Object;

    .line 369
    .line 370
    iput-object v6, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->f:Ljava/lang/Object;

    .line 371
    .line 372
    iput-object v1, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->g:Ljava/lang/Object;

    .line 373
    .line 374
    iput-wide v10, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->p:J

    .line 375
    .line 376
    iput v8, v2, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->s:I

    .line 377
    .line 378
    invoke-virtual {v5, v4, v10, v11, v2}, Lcom/zykj/download/work/DownloadFileWorkProxy;->updateTotalSize(Lxa/b;JLvc/c;)Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v5

    .line 382
    if-ne v5, v3, :cond_9

    .line 383
    .line 384
    goto :goto_1

    .line 385
    :cond_9
    move-object v5, v1

    .line 386
    move-object v1, v0

    .line 387
    move-object v0, v5

    .line 388
    move-object v8, v4

    .line 389
    move-wide v4, v10

    .line 390
    :goto_3
    iget-object v10, v1, Lcom/zykj/download/work/DownloadFileCommonWork;->TAG:Ljava/lang/String;

    .line 391
    .line 392
    invoke-virtual {v1}, Lcom/zykj/download/work/DownloadFileWork;->getDownloadUrl()Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    const/16 v10, 0x800

    .line 396
    .line 397
    new-array v10, v10, [B

    .line 398
    .line 399
    invoke-virtual {v0}, Lje/z;->byteStream()Ljava/io/InputStream;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    new-instance v11, Ljava/io/RandomAccessFile;

    .line 404
    .line 405
    invoke-virtual {v8}, Lxa/b;->g()Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v12

    .line 409
    const-string v13, "rwd"

    .line 410
    .line 411
    invoke-direct {v11, v12, v13}, Ljava/io/RandomAccessFile;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    :try_start_2
    iget-wide v12, v7, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 415
    .line 416
    invoke-virtual {v11, v12, v13}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 417
    .line 418
    .line 419
    new-instance v12, Lkotlin/jvm/internal/Ref$IntRef;

    .line 420
    .line 421
    invoke-direct {v12}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    .line 422
    .line 423
    .line 424
    new-instance v13, Lkotlin/jvm/internal/Ref$LongRef;

    .line 425
    .line 426
    invoke-direct {v13}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    .line 427
    .line 428
    .line 429
    iget-wide v14, v7, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 430
    .line 431
    iput-wide v14, v13, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 432
    .line 433
    new-instance v7, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 434
    .line 435
    invoke-direct {v7}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 436
    .line 437
    .line 438
    move-object/from16 v16, v3

    .line 439
    .line 440
    move-object v3, v11

    .line 441
    move-object v9, v12

    .line 442
    move-object v15, v13

    .line 443
    move-object v12, v0

    .line 444
    move-wide v13, v4

    .line 445
    move-object v4, v1

    .line 446
    move-object v5, v2

    .line 447
    move-object v0, v8

    .line 448
    const/4 v1, 0x0

    .line 449
    const/4 v2, 0x0

    .line 450
    move-object v8, v7

    .line 451
    move-object v7, v10

    .line 452
    move-object v10, v6

    .line 453
    move-object v6, v12

    .line 454
    :goto_4
    :try_start_3
    invoke-virtual {v12, v7}, Ljava/io/InputStream;->read([B)I

    .line 455
    .line 456
    .line 457
    move-result v17

    .line 458
    invoke-static/range {v17 .. v17}, Lxc/a;->c(I)Ljava/lang/Integer;

    .line 459
    .line 460
    .line 461
    move-result-object v17

    .line 462
    move-wide/from16 p0, v13

    .line 463
    .line 464
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Number;->intValue()I

    .line 465
    .line 466
    .line 467
    move-result v13

    .line 468
    iput v13, v9, Lkotlin/jvm/internal/Ref$IntRef;->c:I

    .line 469
    .line 470
    const/4 v14, -0x1

    .line 471
    if-ne v13, v14, :cond_a

    .line 472
    .line 473
    const/4 v13, 0x1

    .line 474
    goto :goto_5

    .line 475
    :cond_a
    const/4 v13, 0x0

    .line 476
    :goto_5
    iput-boolean v13, v8, Lkotlin/jvm/internal/Ref$BooleanRef;->c:Z

    .line 477
    .line 478
    sget-object v13, Lqc/q;->a:Lqc/q;

    .line 479
    .line 480
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Number;->intValue()I

    .line 481
    .line 482
    .line 483
    move-result v13

    .line 484
    if-eq v14, v13, :cond_c

    .line 485
    .line 486
    invoke-virtual {v4}, Landroidx/work/ListenableWorker;->isStopped()Z

    .line 487
    .line 488
    .line 489
    move-result v13

    .line 490
    if-nez v13, :cond_c

    .line 491
    .line 492
    iget v13, v9, Lkotlin/jvm/internal/Ref$IntRef;->c:I

    .line 493
    .line 494
    const/4 v14, 0x0

    .line 495
    invoke-virtual {v3, v7, v14, v13}, Ljava/io/RandomAccessFile;->write([BII)V

    .line 496
    .line 497
    .line 498
    iget-wide v13, v15, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 499
    .line 500
    move-wide/from16 v17, v13

    .line 501
    .line 502
    iget v13, v9, Lkotlin/jvm/internal/Ref$IntRef;->c:I

    .line 503
    .line 504
    int-to-long v13, v13

    .line 505
    add-long v13, v17, v13

    .line 506
    .line 507
    iput-wide v13, v15, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 508
    .line 509
    invoke-virtual {v4}, Lcom/zykj/download/work/DownloadFileWork;->getProxy()Lcom/zykj/download/work/DownloadFileWorkProxy;

    .line 510
    .line 511
    .line 512
    move-result-object v13

    .line 513
    move-object/from16 v17, v13

    .line 514
    .line 515
    iget-wide v13, v15, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 516
    .line 517
    iput-object v4, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->c:Ljava/lang/Object;

    .line 518
    .line 519
    iput-object v0, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->d:Ljava/lang/Object;

    .line 520
    .line 521
    iput-object v10, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->e:Ljava/lang/Object;

    .line 522
    .line 523
    iput-object v7, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->f:Ljava/lang/Object;

    .line 524
    .line 525
    iput-object v12, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->g:Ljava/lang/Object;

    .line 526
    .line 527
    iput-object v11, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->h:Ljava/lang/Object;

    .line 528
    .line 529
    iput-object v2, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->i:Ljava/lang/Object;

    .line 530
    .line 531
    iput-object v3, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->j:Ljava/lang/Object;

    .line 532
    .line 533
    iput-object v9, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->k:Ljava/lang/Object;

    .line 534
    .line 535
    iput-object v15, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->l:Ljava/lang/Object;

    .line 536
    .line 537
    iput-object v8, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->m:Ljava/lang/Object;

    .line 538
    .line 539
    iput-object v6, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->n:Ljava/lang/Object;

    .line 540
    .line 541
    iput-object v1, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->o:Ljava/lang/Object;

    .line 542
    .line 543
    move-object/from16 v19, v9

    .line 544
    .line 545
    move-object/from16 v18, v10

    .line 546
    .line 547
    move-wide/from16 v9, p0

    .line 548
    .line 549
    iput-wide v9, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->p:J

    .line 550
    .line 551
    move-object/from16 p0, v3

    .line 552
    .line 553
    const/4 v3, 0x3

    .line 554
    iput v3, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->s:I

    .line 555
    .line 556
    move-object/from16 v3, v17

    .line 557
    .line 558
    invoke-virtual {v3, v0, v13, v14, v5}, Lcom/zykj/download/work/DownloadFileWorkProxy;->updateDownloadSize(Lxa/b;JLvc/c;)Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object v3

    .line 562
    move-object/from16 v13, v16

    .line 563
    .line 564
    if-ne v3, v13, :cond_b

    .line 565
    .line 566
    goto/16 :goto_8

    .line 567
    .line 568
    :cond_b
    move-object/from16 v3, p0

    .line 569
    .line 570
    move-object/from16 p0, v0

    .line 571
    .line 572
    move-object/from16 p1, v1

    .line 573
    .line 574
    move-object v0, v15

    .line 575
    move-wide v14, v9

    .line 576
    move-object/from16 v10, v18

    .line 577
    .line 578
    move-object/from16 v9, v19

    .line 579
    .line 580
    :goto_6
    invoke-virtual {v4}, Lcom/zykj/download/work/DownloadFileWork;->getReceiverLengthLiveData()Landroidx/lifecycle/MutableLiveData;

    .line 581
    .line 582
    .line 583
    move-result-object v1

    .line 584
    move-object/from16 v16, v2

    .line 585
    .line 586
    move-object/from16 v17, v3

    .line 587
    .line 588
    iget-wide v2, v0, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 589
    .line 590
    invoke-static {v2, v3}, Lxc/a;->d(J)Ljava/lang/Long;

    .line 591
    .line 592
    .line 593
    move-result-object v2

    .line 594
    invoke-virtual {v1, v2}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 595
    .line 596
    .line 597
    invoke-virtual {v4}, Lcom/zykj/download/work/DownloadFileWork;->getProgressLiveData()Landroidx/lifecycle/MutableLiveData;

    .line 598
    .line 599
    .line 600
    move-result-object v1

    .line 601
    iget-wide v2, v0, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 602
    .line 603
    long-to-float v2, v2

    .line 604
    mul-float v2, v2, p2

    .line 605
    .line 606
    long-to-float v3, v14

    .line 607
    div-float/2addr v2, v3

    .line 608
    float-to-int v2, v2

    .line 609
    invoke-static {v2}, Lxc/a;->c(I)Ljava/lang/Integer;

    .line 610
    .line 611
    .line 612
    move-result-object v2

    .line 613
    invoke-virtual {v1, v2}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 614
    .line 615
    .line 616
    move-object/from16 v1, p1

    .line 617
    .line 618
    move-object/from16 v2, v16

    .line 619
    .line 620
    move-object/from16 v3, v17

    .line 621
    .line 622
    move-object/from16 v16, v13

    .line 623
    .line 624
    move-wide v13, v14

    .line 625
    move-object v15, v0

    .line 626
    move-object/from16 v0, p0

    .line 627
    .line 628
    goto/16 :goto_4

    .line 629
    .line 630
    :catchall_2
    move-exception v0

    .line 631
    move-object v1, v0

    .line 632
    move-object v4, v6

    .line 633
    move-object v3, v11

    .line 634
    goto/16 :goto_c

    .line 635
    .line 636
    :cond_c
    move-object/from16 v18, v10

    .line 637
    .line 638
    move-object/from16 v13, v16

    .line 639
    .line 640
    move-wide/from16 v9, p0

    .line 641
    .line 642
    invoke-virtual {v4}, Lcom/zykj/download/work/DownloadFileWork;->getReceiverLengthLiveData()Landroidx/lifecycle/MutableLiveData;

    .line 643
    .line 644
    .line 645
    move-result-object v3

    .line 646
    move-object/from16 v16, v13

    .line 647
    .line 648
    iget-wide v12, v15, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 649
    .line 650
    invoke-static {v12, v13}, Lxc/a;->d(J)Ljava/lang/Long;

    .line 651
    .line 652
    .line 653
    move-result-object v7

    .line 654
    invoke-virtual {v3, v7}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 655
    .line 656
    .line 657
    invoke-virtual {v4}, Lcom/zykj/download/work/DownloadFileWork;->getProgressLiveData()Landroidx/lifecycle/MutableLiveData;

    .line 658
    .line 659
    .line 660
    move-result-object v3

    .line 661
    iget-wide v12, v15, Lkotlin/jvm/internal/Ref$LongRef;->c:J

    .line 662
    .line 663
    long-to-float v7, v12

    .line 664
    mul-float v7, v7, p2

    .line 665
    .line 666
    long-to-float v12, v9

    .line 667
    div-float/2addr v7, v12

    .line 668
    float-to-int v7, v7

    .line 669
    invoke-static {v7}, Lxc/a;->c(I)Ljava/lang/Integer;

    .line 670
    .line 671
    .line 672
    move-result-object v7

    .line 673
    invoke-virtual {v3, v7}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 674
    .line 675
    .line 676
    :try_start_4
    invoke-static {v6, v1}, Lcd/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 677
    .line 678
    .line 679
    iget-boolean v1, v8, Lkotlin/jvm/internal/Ref$BooleanRef;->c:Z

    .line 680
    .line 681
    if-eqz v1, :cond_f

    .line 682
    .line 683
    new-instance v1, Ljava/io/File;

    .line 684
    .line 685
    invoke-virtual {v0}, Lxa/b;->g()Ljava/lang/String;

    .line 686
    .line 687
    .line 688
    move-result-object v3

    .line 689
    invoke-direct {v1, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 690
    .line 691
    .line 692
    invoke-virtual {v4, v9, v10, v1}, Lcom/zykj/download/work/DownloadFileCommonWork;->checkContentLength(JLjava/io/File;)V

    .line 693
    .line 694
    .line 695
    invoke-virtual {v0}, Lxa/b;->g()Ljava/lang/String;

    .line 696
    .line 697
    .line 698
    move-result-object v1

    .line 699
    invoke-static {v1}, Lcom/alibaba/sdk/android/oss/common/utils/BinaryUtil;->calculateBase64Md5(Ljava/lang/String;)Ljava/lang/String;

    .line 700
    .line 701
    .line 702
    move-result-object v1

    .line 703
    invoke-virtual/range {v18 .. v18}, Ldf/c0;->d()Lje/q;

    .line 704
    .line 705
    .line 706
    move-result-object v3

    .line 707
    const-string v6, "Content-MD5"

    .line 708
    .line 709
    invoke-virtual {v3, v6}, Lje/q;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 710
    .line 711
    .line 712
    move-result-object v3

    .line 713
    if-nez v3, :cond_d

    .line 714
    .line 715
    goto :goto_7

    .line 716
    :cond_d
    const-string v6, "it"

    .line 717
    .line 718
    invoke-static {v1, v6}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 719
    .line 720
    .line 721
    invoke-virtual {v0}, Lxa/b;->g()Ljava/lang/String;

    .line 722
    .line 723
    .line 724
    move-result-object v6

    .line 725
    invoke-virtual {v4, v3, v1, v6}, Lcom/zykj/download/work/DownloadFileCommonWork;->checkMD5(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 726
    .line 727
    .line 728
    :goto_7
    invoke-virtual {v4}, Lcom/zykj/download/work/DownloadFileWork;->getProxy()Lcom/zykj/download/work/DownloadFileWorkProxy;

    .line 729
    .line 730
    .line 731
    move-result-object v3

    .line 732
    iput-object v4, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->c:Ljava/lang/Object;

    .line 733
    .line 734
    iput-object v11, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->d:Ljava/lang/Object;

    .line 735
    .line 736
    iput-object v2, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->e:Ljava/lang/Object;

    .line 737
    .line 738
    const/4 v6, 0x0

    .line 739
    iput-object v6, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->f:Ljava/lang/Object;

    .line 740
    .line 741
    iput-object v6, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->g:Ljava/lang/Object;

    .line 742
    .line 743
    iput-object v6, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->h:Ljava/lang/Object;

    .line 744
    .line 745
    iput-object v6, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->i:Ljava/lang/Object;

    .line 746
    .line 747
    iput-object v6, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->j:Ljava/lang/Object;

    .line 748
    .line 749
    iput-object v6, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->k:Ljava/lang/Object;

    .line 750
    .line 751
    iput-object v6, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->l:Ljava/lang/Object;

    .line 752
    .line 753
    iput-object v6, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->m:Ljava/lang/Object;

    .line 754
    .line 755
    iput-object v6, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->n:Ljava/lang/Object;

    .line 756
    .line 757
    iput-object v6, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->o:Ljava/lang/Object;

    .line 758
    .line 759
    const/4 v6, 0x4

    .line 760
    iput v6, v5, Lcom/zykj/download/work/DownloadFileCommonWork$downloadFile$1;->s:I

    .line 761
    .line 762
    invoke-virtual {v3, v0, v1, v5}, Lcom/zykj/download/work/DownloadFileWorkProxy;->updateVerifyCode(Lxa/b;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 763
    .line 764
    .line 765
    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 766
    move-object/from16 v13, v16

    .line 767
    .line 768
    if-ne v0, v13, :cond_e

    .line 769
    .line 770
    :goto_8
    return-object v13

    .line 771
    :cond_e
    move-object v0, v2

    .line 772
    move-object v2, v4

    .line 773
    move-object v3, v11

    .line 774
    :goto_9
    move-object v4, v2

    .line 775
    move-object v2, v0

    .line 776
    goto :goto_a

    .line 777
    :catchall_3
    move-exception v0

    .line 778
    move-object v1, v0

    .line 779
    move-object v3, v11

    .line 780
    goto :goto_d

    .line 781
    :cond_f
    move-object v3, v11

    .line 782
    :goto_a
    :try_start_5
    iget-object v0, v4, Lcom/zykj/download/work/DownloadFileCommonWork;->TAG:Ljava/lang/String;

    .line 783
    .line 784
    const-string v1, "download complete url="

    .line 785
    .line 786
    invoke-virtual {v4}, Lcom/zykj/download/work/DownloadFileWork;->getDownloadUrl()Ljava/lang/String;

    .line 787
    .line 788
    .line 789
    move-result-object v4

    .line 790
    invoke-static {v1, v4}, Lkotlin/jvm/internal/u;->p(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 791
    .line 792
    .line 793
    move-result-object v1

    .line 794
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 795
    .line 796
    .line 797
    move-result v0

    .line 798
    invoke-static {v0}, Lxc/a;->c(I)Ljava/lang/Integer;

    .line 799
    .line 800
    .line 801
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 802
    invoke-static {v3, v2}, Lcd/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 803
    .line 804
    .line 805
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 806
    .line 807
    .line 808
    move-result v0

    .line 809
    invoke-static {v0}, Lxc/a;->c(I)Ljava/lang/Integer;

    .line 810
    .line 811
    .line 812
    :goto_b
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 813
    .line 814
    return-object v0

    .line 815
    :goto_c
    :try_start_6
    throw v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 816
    :catchall_4
    move-exception v0

    .line 817
    :try_start_7
    invoke-static {v4, v1}, Lcd/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 818
    .line 819
    .line 820
    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 821
    :goto_d
    :try_start_8
    throw v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 822
    :catchall_5
    move-exception v0

    .line 823
    invoke-static {v3, v1}, Lcd/b;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 824
    .line 825
    .line 826
    throw v0

    .line 827
    :cond_10
    iget-object v0, v0, Lcom/zykj/download/work/DownloadFileCommonWork;->TAG:Ljava/lang/String;

    .line 828
    .line 829
    const-string v1, "download fail response=null"

    .line 830
    .line 831
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 832
    .line 833
    .line 834
    new-instance v0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 835
    .line 836
    sget-object v1, Lcom/zykj/lib/error/code/ErrorCode;->NET_RESPONSE_NULL:Lcom/zykj/lib/error/code/ErrorCode;

    .line 837
    .line 838
    invoke-direct {v0, v1}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;)V

    .line 839
    .line 840
    .line 841
    throw v0

    .line 842
    :cond_11
    iget-object v0, v0, Lcom/zykj/download/work/DownloadFileCommonWork;->TAG:Ljava/lang/String;

    .line 843
    .line 844
    const-string v1, "download fail response="

    .line 845
    .line 846
    invoke-static {v1, v6}, Lkotlin/jvm/internal/u;->p(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 847
    .line 848
    .line 849
    move-result-object v1

    .line 850
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 851
    .line 852
    .line 853
    new-instance v0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 854
    .line 855
    sget-object v1, Lcom/zykj/lib/error/code/ErrorCodeHandler;->INSTANCE:Lcom/zykj/lib/error/code/ErrorCodeHandler;

    .line 856
    .line 857
    invoke-virtual {v6}, Ldf/c0;->b()I

    .line 858
    .line 859
    .line 860
    move-result v2

    .line 861
    invoke-virtual {v1, v2}, Lcom/zykj/lib/error/code/ErrorCodeHandler;->getErrorCode(I)Lcom/zykj/lib/error/code/ErrorCode;

    .line 862
    .line 863
    .line 864
    move-result-object v1

    .line 865
    invoke-direct {v0, v1}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;)V

    .line 866
    .line 867
    .line 868
    throw v0
.end method


# virtual methods
.method public final checkContentLength(JLjava/io/File;)V
    .locals 5

    .line 1
    const-string v0, "file"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p3}, Ljava/io/File;->length()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    cmp-long v0, p1, v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {p3}, Ljava/io/File;->delete()Z

    .line 16
    .line 17
    .line 18
    new-instance v0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 19
    .line 20
    sget-object v1, Lcom/zykj/lib/error/code/ErrorCode;->FILE_BREAKDOWN:Lcom/zykj/lib/error/code/ErrorCode;

    .line 21
    .line 22
    new-instance v2, Ljava/lang/Exception;

    .line 23
    .line 24
    new-instance v3, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    const-string v4, "totalLength = "

    .line 30
    .line 31
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string p1, " ,file.length = "

    .line 38
    .line 39
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p3}, Ljava/io/File;->length()J

    .line 43
    .line 44
    .line 45
    move-result-wide p1

    .line 46
    invoke-virtual {v3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-direct {v2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-direct {v0, v1, v2}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    throw v0
.end method

.method public final checkMD5(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 1
    const-string v0, "md5"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fileMd5"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "localPath"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    iget-object v0, p0, Lcom/zykj/download/work/DownloadFileCommonWork;->TAG:Ljava/lang/String;

    .line 24
    .line 25
    new-instance v1, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    const-string v2, " net md5 = "

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v3, " ,local md5 = "

    .line 39
    .line 40
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    new-instance v0, Ljava/io/File;

    .line 54
    .line 55
    invoke-direct {v0, p3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 59
    .line 60
    .line 61
    new-instance p3, Lcom/zykj/http/exception/RemoteCodeException;

    .line 62
    .line 63
    sget-object v0, Lcom/zykj/lib/error/code/ErrorCode;->FILE_BREAKDOWN:Lcom/zykj/lib/error/code/ErrorCode;

    .line 64
    .line 65
    new-instance v1, Ljava/lang/Exception;

    .line 66
    .line 67
    new-instance v4, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-direct {v1, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-direct {p3, v0, v1}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    throw p3
.end method

.method public downloadFile(Lxa/b;Lvc/c;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxa/b;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/download/work/DownloadFileCommonWork;->downloadFile$suspendImpl(Lcom/zykj/download/work/DownloadFileCommonWork;Lxa/b;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public initParameter()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/Data;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "file_url"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroidx/work/Data;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lcom/zykj/download/work/DownloadFileWork;->setDownloadUrl(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lcom/zykj/download/OssUtils;->INSTANCE:Lcom/zykj/download/OssUtils;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->getApplicationContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string v2, "applicationContext"

    .line 23
    .line 24
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/Data;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    const-string v3, "file_dir"

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Landroidx/work/Data;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v0, v1, v2}, Lcom/zykj/download/OssUtils;->checkDownloadDir(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {p0, v1}, Lcom/zykj/download/work/DownloadFileWork;->setDir(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Landroidx/work/ListenableWorker;->getInputData()Landroidx/work/Data;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    const-string v2, "file_name"

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Landroidx/work/Data;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {p0}, Lcom/zykj/download/work/DownloadFileWork;->getDownloadUrl()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {v0, v1, v2}, Lcom/zykj/download/OssUtils;->checkFileName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {p0, v0}, Lcom/zykj/download/work/DownloadFileWork;->setFileName(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Lcom/zykj/download/work/DownloadFileWork;->getDownloadUrl()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    new-instance v0, Ljava/io/File;

    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/zykj/download/work/DownloadFileWork;->getDir()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {p0}, Lcom/zykj/download/work/DownloadFileWork;->getFileName()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_0
    new-instance v0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 86
    .line 87
    sget-object v1, Lcom/zykj/lib/error/code/ErrorCode;->FILE_NO_FOUND:Lcom/zykj/lib/error/code/ErrorCode;

    .line 88
    .line 89
    new-instance v2, Ljava/lang/NullPointerException;

    .line 90
    .line 91
    const-string v3, "DownloadOssFileWork ->downloadUrl is not set"

    .line 92
    .line 93
    invoke-direct {v2, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-direct {v0, v1, v2}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCode;Ljava/lang/Throwable;)V

    .line 97
    .line 98
    .line 99
    throw v0
.end method
