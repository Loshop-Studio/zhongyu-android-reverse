# RE note 本类字节码直接引用的读写或显示接口包括偏好设置。
.class public final Lcom/zykj/mistake/service/UploadFolderIntentService;
.super Landroid/app/IntentService;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/zykj/mistake/service/UploadFolderIntentService;",
        "Landroid/app/IntentService;",
        "<init>",
        "()V",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "UploadFolderIntentService"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Landroid/app/IntentService;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/zykj/mistake/service/UploadFolderIntentService;->a:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public static b(ILandroid/os/Bundle;Landroid/os/Messenger;)V
    .locals 1

    .line 1
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput p0, v0, Landroid/os/Message;->what:I

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    iput p0, v0, Landroid/os/Message;->arg1:I

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    :try_start_0
    invoke-virtual {p2, v0}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :catch_0
    move-exception p0

    .line 20
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/util/ArrayList;Landroid/os/Messenger;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance p2, Landroid/os/Bundle;

    .line 8
    .line 9
    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v0, "UPLOAD_SUCCESS_URL"

    .line 13
    .line 14
    invoke-virtual {p2, v0, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/16 p1, 0x67

    .line 18
    .line 19
    invoke-static {p1, p2, p3}, Lcom/zykj/mistake/service/UploadFolderIntentService;->b(ILandroid/os/Bundle;Landroid/os/Messenger;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    new-instance v0, Lcom/zykj/mistake/entity/req/MonitorPictureReq;

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    sget v2, Lcom/zykj/mistake/R$string;->app_name:I

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const-string v2, "getString(...)"

    .line 36
    .line 37
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const-string v2, "com.zykj.mistake"

    .line 41
    .line 42
    invoke-direct {v0, v1, v2, p2}, Lcom/zykj/mistake/entity/req/MonitorPictureReq;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 43
    .line 44
    .line 45
    sget-object p2, Lcom/zykj/mistake/network/a;->a:Lcom/zykj/mistake/network/a;

    .line 46
    .line 47
    invoke-static {}, Lcom/zykj/mistake/network/a;->b()Lcom/zykj/mistake/network/b;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-interface {p2, v0}, Lcom/zykj/mistake/network/b;->r(Lcom/zykj/mistake/entity/req/MonitorPictureReq;)Lq5/e;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    sget-object v0, Lc6/f;->a:Lq5/j;

    .line 56
    .line 57
    invoke-virtual {p2, v0}, Lq5/e;->d(Lq5/j;)Lio/reactivex/internal/operators/observable/j;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    invoke-static {}, Lr5/b;->a()Lr5/e;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {p2, v0}, Lq5/e;->a(Lr5/e;)Lio/reactivex/internal/operators/observable/f;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    new-instance v0, Lcom/zykj/mistake/service/a;

    .line 70
    .line 71
    invoke-direct {v0, p0, p3, p1}, Lcom/zykj/mistake/service/a;-><init>(Lcom/zykj/mistake/service/UploadFolderIntentService;Landroid/os/Messenger;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p2, v0}, Lq5/e;->b(Lq5/g;)V

    .line 75
    .line 76
    .line 77
    return-void
.end method

# RE I/O 读取长整数偏好（SharedPreferences.getLong）。
.method public final onHandleIntent(Landroid/content/Intent;)V
    .locals 27

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "/"

    .line 4
    .line 5
    const-string v2, "mistake_v2/res/"

    .line 6
    .line 7
    const-string v3, "+mistake_v2+res+2++0+"

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const-string v4, "UPLOAD_PATH"

    .line 13
    .line 14
    invoke-virtual {v0, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    const-string v5, ""

    .line 19
    .line 20
    if-nez v4, :cond_1

    .line 21
    .line 22
    move-object v8, v5

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    move-object v8, v4

    .line 25
    :goto_0
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    const-string v4, "UPLOAD_MESSENGER"

    .line 33
    .line 34
    invoke-virtual {v0, v4}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-string v4, "null cannot be cast to non-null type android.os.Messenger"

    .line 39
    .line 40
    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    move-object v4, v0

    .line 44
    check-cast v4, Landroid/os/Messenger;

    .line 45
    .line 46
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-static {v0}, Lcom/zykj/mistake/utils/d;->d(Landroid/content/Context;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    const/16 v13, 0xca

    .line 55
    .line 56
    const/4 v14, 0x0

    .line 57
    if-eqz v0, :cond_5

    .line 58
    .line 59
    :try_start_0
    sget-object v0, Lh4/b;->a:Landroid/app/Application;

    .line 60
    .line 61
    const-string v6, "SP_USER_ID"

    .line 62
    .line 63
    const-string v7, "zykjMistake"

    .line 64
    .line 65
    const/4 v9, 0x0

    .line 66
    invoke-virtual {v0, v7, v9}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    const-wide/16 v9, -0x1

    .line 71
    .line 72
    invoke-interface {v0, v6, v9, v10}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 73
    .line 74
    .line 75
    move-result-wide v6

    .line 76
    const-string v18, ""

    .line 77
    .line 78
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    const-string v9, "toString(...)"

    .line 87
    .line 88
    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    const-string v9, "-"

    .line 92
    .line 93
    invoke-static {v0, v9, v5}, Lkotlin/text/w;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 98
    .line 99
    .line 100
    move-result-wide v9

    .line 101
    new-instance v5, Ljava/lang/StringBuilder;

    .line 102
    .line 103
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    const-string v3, "+"

    .line 116
    .line 117
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v5, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    invoke-static {v3}, Lcom/blankj/utilcode/util/c;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v24

    .line 131
    new-instance v15, Lcom/zykj/mistake/entity/req/TokenReq;

    .line 132
    .line 133
    const/16 v25, 0x19

    .line 134
    .line 135
    const/16 v26, 0x0

    .line 136
    .line 137
    const/16 v16, 0x0

    .line 138
    .line 139
    const/16 v17, 0x2

    .line 140
    .line 141
    const/16 v19, 0x0

    .line 142
    .line 143
    const/16 v20, 0x0

    .line 144
    .line 145
    move-object/from16 v21, v0

    .line 146
    .line 147
    move-wide/from16 v22, v9

    .line 148
    .line 149
    invoke-direct/range {v15 .. v26}, Lcom/zykj/mistake/entity/req/TokenReq;-><init>(IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;ILkotlin/jvm/internal/e;)V

    .line 150
    .line 151
    .line 152
    move-object/from16 v0, v18

    .line 153
    .line 154
    move-object/from16 v3, v21

    .line 155
    .line 156
    invoke-static {}, Lcom/blankj/utilcode/util/s;->a()Ljava/text/SimpleDateFormat;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    new-instance v11, Ljava/util/Date;

    .line 161
    .line 162
    invoke-direct {v11, v9, v10}, Ljava/util/Date;-><init>(J)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v5, v11}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    new-instance v9, Ljava/lang/StringBuilder;

    .line 170
    .line 171
    invoke-direct {v9, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v9, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v9

    .line 196
    sget-object v0, Lcom/zykj/mistake/network/a;->a:Lcom/zykj/mistake/network/a;

    .line 197
    .line 198
    invoke-static {}, Lcom/zykj/mistake/network/a;->b()Lcom/zykj/mistake/network/b;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    invoke-interface {v0, v15}, Lcom/zykj/mistake/network/b;->o(Lcom/zykj/mistake/entity/req/TokenReq;)Lretrofit2/e;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-interface {v0}, Lretrofit2/e;->d()Lretrofit2/n0;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    const-string v1, "execute(...)"

    .line 211
    .line 212
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    iget-object v1, v0, Lretrofit2/n0;->a:Lokhttp3/i0;

    .line 216
    .line 217
    iget v1, v1, Lokhttp3/i0;->d:I

    .line 218
    .line 219
    const/16 v2, 0x191

    .line 220
    .line 221
    if-ne v1, v2, :cond_2

    .line 222
    .line 223
    const/16 v0, 0xcb

    .line 224
    .line 225
    invoke-static {v0, v14, v4}, Lcom/zykj/mistake/service/UploadFolderIntentService;->b(ILandroid/os/Bundle;Landroid/os/Messenger;)V

    .line 226
    .line 227
    .line 228
    return-void

    .line 229
    :catch_0
    move-exception v0

    .line 230
    move-object/from16 v1, p0

    .line 231
    .line 232
    goto :goto_2

    .line 233
    :cond_2
    iget-object v0, v0, Lretrofit2/n0;->b:Ljava/lang/Object;

    .line 234
    .line 235
    move-object v10, v0

    .line 236
    check-cast v10, Lcom/zykj/mistake/entity/resp/GeneratorResp;

    .line 237
    .line 238
    if-eqz v10, :cond_3

    .line 239
    .line 240
    invoke-virtual {v10}, Lcom/zykj/mistake/network/ApiResp;->getSuccess()Z

    .line 241
    .line 242
    .line 243
    move-result v0

    .line 244
    if-nez v0, :cond_4

    .line 245
    .line 246
    :cond_3
    move-object/from16 v1, p0

    .line 247
    .line 248
    goto :goto_1

    .line 249
    :cond_4
    const/16 v0, 0x66

    .line 250
    .line 251
    invoke-static {v0, v14, v4}, Lcom/zykj/mistake/service/UploadFolderIntentService;->b(ILandroid/os/Bundle;Landroid/os/Messenger;)V

    .line 252
    .line 253
    .line 254
    new-instance v11, Ljava/util/ArrayList;

    .line 255
    .line 256
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 257
    .line 258
    .line 259
    new-instance v7, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 260
    .line 261
    invoke-direct {v7}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 262
    .line 263
    .line 264
    new-instance v6, Lcom/zykj/mistake/service/UploadFolderIntentService$onHandleIntent$1;

    .line 265
    .line 266
    const/4 v12, 0x0

    .line 267
    invoke-direct/range {v6 .. v12}, Lcom/zykj/mistake/service/UploadFolderIntentService$onHandleIntent$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/entity/resp/GeneratorResp;Ljava/util/ArrayList;Lh6/c;)V

    .line 268
    .line 269
    .line 270
    sget-object v0, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 271
    .line 272
    invoke-static {v0, v6}, Lkotlinx/coroutines/x;->z(Lh6/h;Lr6/e;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    iget-object v0, v7, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 276
    .line 277
    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 278
    .line 279
    move-object/from16 v1, p0

    .line 280
    .line 281
    :try_start_1
    invoke-virtual {v1, v0, v11, v4}, Lcom/zykj/mistake/service/UploadFolderIntentService;->a(Ljava/lang/String;Ljava/util/ArrayList;Landroid/os/Messenger;)V

    .line 282
    .line 283
    .line 284
    return-void

    .line 285
    :catch_1
    move-exception v0

    .line 286
    goto :goto_2

    .line 287
    :goto_1
    invoke-static {v13, v14, v4}, Lcom/zykj/mistake/service/UploadFolderIntentService;->b(ILandroid/os/Bundle;Landroid/os/Messenger;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 288
    .line 289
    .line 290
    return-void

    .line 291
    :goto_2
    invoke-static {v13, v14, v4}, Lcom/zykj/mistake/service/UploadFolderIntentService;->b(ILandroid/os/Bundle;Landroid/os/Messenger;)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 295
    .line 296
    .line 297
    return-void

    .line 298
    :cond_5
    move-object/from16 v1, p0

    .line 299
    .line 300
    invoke-static {v13, v14, v4}, Lcom/zykj/mistake/service/UploadFolderIntentService;->b(ILandroid/os/Bundle;Landroid/os/Messenger;)V

    .line 301
    .line 302
    .line 303
    return-void
.end method
