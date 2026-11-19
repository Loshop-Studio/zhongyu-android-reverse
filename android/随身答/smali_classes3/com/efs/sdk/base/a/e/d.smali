.class public final Lcom/efs/sdk/base/a/e/d;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/efs/sdk/base/a/e/d$a;
    }
.end annotation


# instance fields
.field public a:I

.field public b:Lcom/efs/sdk/base/a/e/c;

.field private c:Lcom/efs/sdk/base/a/e/c;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private e:Ljava/util/concurrent/atomic/AtomicInteger;

.field private f:Lcom/efs/sdk/base/a/b/f;


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 2
    sget-object v0, Lcom/efs/sdk/base/a/h/a/a;->a:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    const/4 v0, 0x5

    .line 3
    iput v0, p0, Lcom/efs/sdk/base/a/e/d;->a:I

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/efs/sdk/base/a/e/d;->d:Ljava/util/List;

    .line 5
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Lcom/efs/sdk/base/a/e/d;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 6
    new-instance v0, Lcom/efs/sdk/base/a/e/a;

    invoke-direct {v0}, Lcom/efs/sdk/base/a/e/a;-><init>()V

    iput-object v0, p0, Lcom/efs/sdk/base/a/e/d;->b:Lcom/efs/sdk/base/a/e/c;

    .line 7
    new-instance v0, Lcom/efs/sdk/base/a/i/e;

    invoke-direct {v0}, Lcom/efs/sdk/base/a/i/e;-><init>()V

    iput-object v0, p0, Lcom/efs/sdk/base/a/e/d;->c:Lcom/efs/sdk/base/a/e/c;

    .line 8
    new-instance v0, Lcom/efs/sdk/base/a/b/h;

    invoke-direct {v0}, Lcom/efs/sdk/base/a/b/h;-><init>()V

    iput-object v0, p0, Lcom/efs/sdk/base/a/e/d;->f:Lcom/efs/sdk/base/a/b/f;

    return-void
.end method

.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/efs/sdk/base/a/e/d;-><init>()V

    return-void
.end method

.method public static a()Lcom/efs/sdk/base/a/e/d;
    .locals 1

    .line 1
    invoke-static {}, Lcom/efs/sdk/base/a/e/d$a;->a()Lcom/efs/sdk/base/a/e/d;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;I)V
    .locals 2

    .line 2
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    const/4 v1, 0x1

    .line 3
    iput v1, v0, Landroid/os/Message;->what:I

    .line 4
    iput-object p1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 5
    iput p2, v0, Landroid/os/Message;->arg1:I

    .line 6
    invoke-virtual {p0, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public final handleMessage(Landroid/os/Message;)V
    .locals 12

    .line 1
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/efs/sdk/base/a/e/f$a;->a()Lcom/efs/sdk/base/a/e/f;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lcom/efs/sdk/base/a/e/f;->a()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_14

    .line 13
    .line 14
    iget v0, p1, Landroid/os/Message;->what:I

    .line 15
    .line 16
    const-string v1, "efs.send_log"

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    const/4 v3, 0x0

    .line 20
    if-eqz v0, :cond_4

    .line 21
    .line 22
    if-eq v0, v2, :cond_0

    .line 23
    .line 24
    goto/16 :goto_7

    .line 25
    .line 26
    :cond_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    iget-object v2, p0, Lcom/efs/sdk/base/a/e/d;->d:Ljava/util/List;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-interface {v2, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    :cond_1
    iget p1, p1, Landroid/os/Message;->arg1:I

    .line 40
    .line 41
    if-eqz p1, :cond_2

    .line 42
    .line 43
    iget-object p1, p0, Lcom/efs/sdk/base/a/e/d;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    goto :goto_0

    .line 50
    :cond_2
    move p1, v3

    .line 51
    :goto_0
    iget-object v0, p0, Lcom/efs/sdk/base/a/e/d;->d:Ljava/util/List;

    .line 52
    .line 53
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_14

    .line 58
    .line 59
    const/4 v0, 0x5

    .line 60
    if-ge p1, v0, :cond_3

    .line 61
    .line 62
    invoke-virtual {p0, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_3
    iget-object p1, p0, Lcom/efs/sdk/base/a/e/d;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 67
    .line 68
    invoke-virtual {p1, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 69
    .line 70
    .line 71
    invoke-static {}, Lcom/efs/sdk/base/a/d/a;->a()Lcom/efs/sdk/base/a/c/a;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    iget-wide v4, p1, Lcom/efs/sdk/base/a/c/a;->k:J

    .line 76
    .line 77
    invoke-virtual {p0, v3, v4, v5}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 78
    .line 79
    .line 80
    const-string p1, "request error cnt gt 5, next request delay 10s"

    .line 81
    .line 82
    invoke-static {v1, p1}, Lcom/efs/sdk/base/a/h/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_4
    invoke-static {}, Lcom/efs/sdk/base/a/c/c$a;->a()Lcom/efs/sdk/base/a/c/c;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {p1}, Lcom/efs/sdk/base/a/c/c;->a()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    const-string v0, "denied"

    .line 95
    .line 96
    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-nez v0, :cond_13

    .line 101
    .line 102
    const-string v0, "disconnected"

    .line 103
    .line 104
    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-eqz v0, :cond_5

    .line 109
    .line 110
    goto/16 :goto_6

    .line 111
    .line 112
    :cond_5
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 113
    .line 114
    :try_start_0
    invoke-static {}, Lcom/efs/sdk/base/a/b/a$b;->a()Lcom/efs/sdk/base/a/b/a;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    iget v1, p0, Lcom/efs/sdk/base/a/e/d;->a:I

    .line 119
    .line 120
    iget-object v4, p0, Lcom/efs/sdk/base/a/e/d;->f:Lcom/efs/sdk/base/a/b/f;

    .line 121
    .line 122
    invoke-virtual {v0}, Lcom/efs/sdk/base/a/b/a;->a()V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0}, Lcom/efs/sdk/base/a/b/a;->a()V

    .line 126
    .line 127
    .line 128
    invoke-static {}, Lcom/efs/sdk/base/a/d/a;->a()Lcom/efs/sdk/base/a/c/a;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    iget-object v5, v5, Lcom/efs/sdk/base/a/c/a;->c:Landroid/content/Context;

    .line 133
    .line 134
    invoke-static {}, Lcom/efs/sdk/base/a/d/a;->a()Lcom/efs/sdk/base/a/c/a;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    iget-object v6, v6, Lcom/efs/sdk/base/a/c/a;->a:Ljava/lang/String;

    .line 139
    .line 140
    invoke-static {v5, v6}, Lcom/efs/sdk/base/a/h/a;->f(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    .line 145
    .line 146
    .line 147
    move-result v6

    .line 148
    if-nez v6, :cond_6

    .line 149
    .line 150
    move-object v6, p1

    .line 151
    goto :goto_3

    .line 152
    :cond_6
    invoke-static {v5}, Lcom/efs/sdk/base/a/h/b;->d(Ljava/io/File;)Ljava/util/List;

    .line 153
    .line 154
    .line 155
    move-result-object v5

    .line 156
    iget-boolean v6, v0, Lcom/efs/sdk/base/a/b/a;->b:Z

    .line 157
    .line 158
    if-eqz v6, :cond_9

    .line 159
    .line 160
    invoke-static {}, Lcom/efs/sdk/base/a/i/f$a;->a()Lcom/efs/sdk/base/a/i/f;

    .line 161
    .line 162
    .line 163
    move-result-object v6

    .line 164
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 165
    .line 166
    .line 167
    move-result v7

    .line 168
    iget-object v8, v6, Lcom/efs/sdk/base/a/i/f;->b:Lcom/efs/sdk/base/a/d/a;

    .line 169
    .line 170
    if-eqz v8, :cond_8

    .line 171
    .line 172
    invoke-static {}, Lcom/efs/sdk/base/a/d/a;->a()Lcom/efs/sdk/base/a/c/a;

    .line 173
    .line 174
    .line 175
    move-result-object v8

    .line 176
    iget-boolean v8, v8, Lcom/efs/sdk/base/a/c/a;->d:Z

    .line 177
    .line 178
    if-nez v8, :cond_7

    .line 179
    .line 180
    goto :goto_1

    .line 181
    :cond_7
    new-instance v8, Lcom/efs/sdk/base/a/i/b;

    .line 182
    .line 183
    const-string v9, "efs_core"

    .line 184
    .line 185
    const-string v10, "log_lag"

    .line 186
    .line 187
    iget-object v11, v6, Lcom/efs/sdk/base/a/i/f;->a:Lcom/efs/sdk/base/a/i/c;

    .line 188
    .line 189
    iget-object v11, v11, Lcom/efs/sdk/base/a/i/c;->c:Ljava/lang/String;

    .line 190
    .line 191
    invoke-direct {v8, v9, v10, v11}, Lcom/efs/sdk/base/a/i/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    const-string v9, "cnt"

    .line 195
    .line 196
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 197
    .line 198
    .line 199
    move-result-object v7

    .line 200
    invoke-virtual {v8, v9, v7}, Lcom/efs/sdk/base/protocol/record/AbsRecordLog;->put(Ljava/lang/String;Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    iget-object v6, v6, Lcom/efs/sdk/base/a/i/f;->b:Lcom/efs/sdk/base/a/d/a;

    .line 204
    .line 205
    invoke-virtual {v6, v8}, Lcom/efs/sdk/base/a/d/a;->a(Lcom/efs/sdk/base/protocol/ILogProtocol;)V

    .line 206
    .line 207
    .line 208
    :cond_8
    :goto_1
    iput-boolean v3, v0, Lcom/efs/sdk/base/a/b/a;->b:Z

    .line 209
    .line 210
    :cond_9
    iget-object v6, v0, Lcom/efs/sdk/base/a/b/a;->d:Lcom/efs/sdk/base/a/b/a$a;

    .line 211
    .line 212
    invoke-static {v5, v6}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 213
    .line 214
    .line 215
    new-instance v6, Ljava/util/ArrayList;

    .line 216
    .line 217
    invoke-direct {v6, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 218
    .line 219
    .line 220
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 221
    .line 222
    .line 223
    move-result v7

    .line 224
    sub-int/2addr v7, v2

    .line 225
    :goto_2
    if-ltz v7, :cond_c

    .line 226
    .line 227
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 228
    .line 229
    .line 230
    move-result v2

    .line 231
    if-ge v2, v1, :cond_c

    .line 232
    .line 233
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v2

    .line 237
    check-cast v2, Ljava/io/File;

    .line 238
    .line 239
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 240
    .line 241
    .line 242
    move-result v8

    .line 243
    if-eqz v8, :cond_b

    .line 244
    .line 245
    if-eqz v4, :cond_a

    .line 246
    .line 247
    invoke-interface {v4, v2}, Lcom/efs/sdk/base/a/b/f;->a(Ljava/io/File;)Z

    .line 248
    .line 249
    .line 250
    move-result v8

    .line 251
    if-nez v8, :cond_b

    .line 252
    .line 253
    :cond_a
    invoke-interface {v6, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    :cond_b
    add-int/lit8 v7, v7, -0x1

    .line 257
    .line 258
    goto :goto_2

    .line 259
    :cond_c
    :goto_3
    new-instance v2, Ljava/util/ArrayList;

    .line 260
    .line 261
    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 262
    .line 263
    .line 264
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 269
    .line 270
    .line 271
    move-result v4

    .line 272
    if-eqz v4, :cond_e

    .line 273
    .line 274
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v4

    .line 278
    check-cast v4, Ljava/io/File;

    .line 279
    .line 280
    invoke-virtual {v0, v4}, Lcom/efs/sdk/base/a/b/a;->a(Ljava/io/File;)Lcom/efs/sdk/base/a/f/b;

    .line 281
    .line 282
    .line 283
    move-result-object v5

    .line 284
    if-nez v5, :cond_d

    .line 285
    .line 286
    const-string v5, "efs.cache"

    .line 287
    .line 288
    new-instance v6, Ljava/lang/StringBuilder;

    .line 289
    .line 290
    const-string v7, "file upload error, name is "

    .line 291
    .line 292
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v4

    .line 299
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v4

    .line 306
    const/4 v6, 0x0

    .line 307
    invoke-static {v5, v4, v6}, Lcom/efs/sdk/base/a/h/d;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 308
    .line 309
    .line 310
    goto :goto_4

    .line 311
    :cond_d
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 312
    .line 313
    .line 314
    goto :goto_4

    .line 315
    :cond_e
    move-object p1, v2

    .line 316
    :catchall_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 317
    .line 318
    .line 319
    move-result-object p1

    .line 320
    :cond_f
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 321
    .line 322
    .line 323
    move-result v0

    .line 324
    if-eqz v0, :cond_12

    .line 325
    .line 326
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    check-cast v0, Lcom/efs/sdk/base/a/f/b;

    .line 331
    .line 332
    iget-object v1, v0, Lcom/efs/sdk/base/a/f/b;->a:Lcom/efs/sdk/base/a/f/a;

    .line 333
    .line 334
    iget-object v1, v1, Lcom/efs/sdk/base/a/f/a;->a:Ljava/lang/String;

    .line 335
    .line 336
    const-string v2, "wa"

    .line 337
    .line 338
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    move-result v1

    .line 342
    if-nez v1, :cond_10

    .line 343
    .line 344
    invoke-static {}, Lcom/efs/sdk/base/a/e/b;->a()Lcom/efs/sdk/base/a/e/b;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    iget-object v4, v0, Lcom/efs/sdk/base/a/f/b;->a:Lcom/efs/sdk/base/a/f/a;

    .line 349
    .line 350
    iget-object v4, v4, Lcom/efs/sdk/base/a/f/a;->a:Ljava/lang/String;

    .line 351
    .line 352
    invoke-virtual {v0}, Lcom/efs/sdk/base/a/f/b;->a()J

    .line 353
    .line 354
    .line 355
    move-result-wide v5

    .line 356
    invoke-virtual {v1, v4, v5, v6}, Lcom/efs/sdk/base/a/e/b;->a(Ljava/lang/String;J)Z

    .line 357
    .line 358
    .line 359
    move-result v1

    .line 360
    if-eqz v1, :cond_f

    .line 361
    .line 362
    :cond_10
    iget-object v1, p0, Lcom/efs/sdk/base/a/e/d;->b:Lcom/efs/sdk/base/a/e/c;

    .line 363
    .line 364
    iget-object v4, v0, Lcom/efs/sdk/base/a/f/b;->a:Lcom/efs/sdk/base/a/f/a;

    .line 365
    .line 366
    iget-object v4, v4, Lcom/efs/sdk/base/a/f/a;->a:Ljava/lang/String;

    .line 367
    .line 368
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    move-result v2

    .line 372
    if-eqz v2, :cond_11

    .line 373
    .line 374
    iget-object v1, p0, Lcom/efs/sdk/base/a/e/d;->c:Lcom/efs/sdk/base/a/e/c;

    .line 375
    .line 376
    :cond_11
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 377
    .line 378
    .line 379
    move-result-object v2

    .line 380
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v2

    .line 384
    iget-object v4, p0, Lcom/efs/sdk/base/a/e/d;->d:Ljava/util/List;

    .line 385
    .line 386
    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    new-instance v4, Lcom/efs/sdk/base/a/e/e;

    .line 390
    .line 391
    invoke-direct {v4, v0, v1, v2}, Lcom/efs/sdk/base/a/e/e;-><init>(Lcom/efs/sdk/base/a/f/b;Lcom/efs/sdk/base/a/e/c;Ljava/lang/String;)V

    .line 392
    .line 393
    .line 394
    invoke-static {v4}, Lcom/efs/sdk/base/a/h/a/d;->a(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    if-nez v0, :cond_f

    .line 399
    .line 400
    const/4 v0, -0x1

    .line 401
    invoke-virtual {p0, v2, v0}, Lcom/efs/sdk/base/a/e/d;->a(Ljava/lang/Object;I)V

    .line 402
    .line 403
    .line 404
    goto :goto_5

    .line 405
    :cond_12
    iget-object p1, p0, Lcom/efs/sdk/base/a/e/d;->d:Ljava/util/List;

    .line 406
    .line 407
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 408
    .line 409
    .line 410
    move-result p1

    .line 411
    if-gtz p1, :cond_14

    .line 412
    .line 413
    invoke-static {}, Lcom/efs/sdk/base/a/d/a;->a()Lcom/efs/sdk/base/a/c/a;

    .line 414
    .line 415
    .line 416
    move-result-object p1

    .line 417
    iget-wide v0, p1, Lcom/efs/sdk/base/a/c/a;->l:J

    .line 418
    .line 419
    invoke-virtual {p0, v3, v0, v1}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 420
    .line 421
    .line 422
    goto :goto_7

    .line 423
    :cond_13
    :goto_6
    const-string v0, "log cann\'t be send because net status is "

    .line 424
    .line 425
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object p1

    .line 429
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 430
    .line 431
    .line 432
    move-result-object p1

    .line 433
    invoke-static {v1, p1}, Lcom/efs/sdk/base/a/h/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 434
    .line 435
    .line 436
    invoke-static {}, Lcom/efs/sdk/base/a/d/a;->a()Lcom/efs/sdk/base/a/c/a;

    .line 437
    .line 438
    .line 439
    move-result-object p1

    .line 440
    iget-wide v0, p1, Lcom/efs/sdk/base/a/c/a;->l:J

    .line 441
    .line 442
    invoke-virtual {p0, v3, v0, v1}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 443
    .line 444
    .line 445
    :cond_14
    :goto_7
    return-void
.end method
