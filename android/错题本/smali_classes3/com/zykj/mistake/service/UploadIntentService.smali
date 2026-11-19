# RE note 本类字节码直接引用的读写或显示接口包括偏好设置、ZIP、文件流。
.class public final Lcom/zykj/mistake/service/UploadIntentService;
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
        "Lcom/zykj/mistake/service/UploadIntentService;",
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
    const-string v0, "UploadIntentService"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Landroid/app/IntentService;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/zykj/mistake/service/UploadIntentService;->a:Ljava/lang/String;

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

.method public static c(Ljava/lang/String;Landroid/os/Messenger;)Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    const-string v1, "_upload.zip"

    .line 4
    .line 5
    invoke-virtual {p0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Ljava/io/File;

    .line 13
    .line 14
    invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const/4 v1, 0x0

    .line 22
    if-eqz p0, :cond_3

    .line 23
    .line 24
    invoke-static {p0}, Lkotlin/collections/q;->e0([Ljava/lang/Object;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    if-eqz p0, :cond_3

    .line 29
    .line 30
    :try_start_0
    new-instance v2, Ljava/util/zip/ZipOutputStream;

    .line 31
    .line 32
    new-instance v3, Ljava/io/FileOutputStream;

    .line 33
    .line 34
    invoke-direct {v3, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 35
    .line 36
    .line 37
    invoke-direct {v2, v3}, Ljava/util/zip/ZipOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 38
    .line 39
    .line 40
    :try_start_1
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_1

    .line 49
    .line 50
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    check-cast v3, Ljava/io/File;

    .line 55
    .line 56
    const-string v4, ""

    .line 57
    .line 58
    invoke-static {v3, v4, v2}, Lcom/blankj/utilcode/util/c;->v(Ljava/io/File;Ljava/lang/String;Ljava/util/zip/ZipOutputStream;)Z

    .line 59
    .line 60
    .line 61
    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 62
    if-nez v3, :cond_0

    .line 63
    .line 64
    :cond_1
    invoke-virtual {v2}, Ljava/util/zip/ZipOutputStream;->finish()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2}, Ljava/util/zip/ZipOutputStream;->close()V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :catchall_0
    move-exception p0

    .line 72
    move-object v1, v2

    .line 73
    goto :goto_0

    .line 74
    :catchall_1
    move-exception p0

    .line 75
    :goto_0
    if-eqz v1, :cond_2

    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/util/zip/ZipOutputStream;->finish()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/util/zip/ZipOutputStream;->close()V

    .line 81
    .line 82
    .line 83
    :cond_2
    throw p0

    .line 84
    :cond_3
    :goto_1
    const/16 p0, 0x65

    .line 85
    .line 86
    invoke-static {p0, v1, p1}, Lcom/zykj/mistake/service/UploadIntentService;->b(ILandroid/os/Bundle;Landroid/os/Messenger;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    const-string p1, "getAbsolutePath(...)"

    .line 94
    .line 95
    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Messenger;Z)V
    .locals 3

    .line 1
    if-nez p4, :cond_0

    .line 2
    .line 3
    new-instance p4, Landroid/os/Bundle;

    .line 4
    .line 5
    invoke-direct {p4}, Landroid/os/Bundle;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v0, "UPLOAD_SUCCESS_URL"

    .line 9
    .line 10
    invoke-virtual {p4, v0, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string p1, "UPLOAD_DATA"

    .line 14
    .line 15
    invoke-virtual {p4, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/16 p1, 0x67

    .line 19
    .line 20
    invoke-static {p1, p4, p3}, Lcom/zykj/mistake/service/UploadIntentService;->b(ILandroid/os/Bundle;Landroid/os/Messenger;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    new-instance p4, Lcom/zykj/mistake/entity/req/MonitorPictureReq;

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sget v1, Lcom/zykj/mistake/R$string;->app_name:I

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const-string v1, "getString(...)"

    .line 37
    .line 38
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    filled-new-array {p1}, [Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-static {v1}, Lkotlin/collections/u;->f([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const-string v2, "com.zykj.mistake"

    .line 50
    .line 51
    invoke-direct {p4, v0, v2, v1}, Lcom/zykj/mistake/entity/req/MonitorPictureReq;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 52
    .line 53
    .line 54
    sget-object v0, Lcom/zykj/mistake/network/a;->a:Lcom/zykj/mistake/network/a;

    .line 55
    .line 56
    invoke-static {}, Lcom/zykj/mistake/network/a;->b()Lcom/zykj/mistake/network/b;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-interface {v0, p4}, Lcom/zykj/mistake/network/b;->r(Lcom/zykj/mistake/entity/req/MonitorPictureReq;)Lq5/e;

    .line 61
    .line 62
    .line 63
    move-result-object p4

    .line 64
    sget-object v0, Lc6/f;->a:Lq5/j;

    .line 65
    .line 66
    invoke-virtual {p4, v0}, Lq5/e;->d(Lq5/j;)Lio/reactivex/internal/operators/observable/j;

    .line 67
    .line 68
    .line 69
    move-result-object p4

    .line 70
    invoke-static {}, Lr5/b;->a()Lr5/e;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {p4, v0}, Lq5/e;->a(Lr5/e;)Lio/reactivex/internal/operators/observable/f;

    .line 75
    .line 76
    .line 77
    move-result-object p4

    .line 78
    new-instance v0, Lcom/zykj/mistake/service/b;

    .line 79
    .line 80
    invoke-direct {v0, p0, p3, p1, p2}, Lcom/zykj/mistake/service/b;-><init>(Lcom/zykj/mistake/service/UploadIntentService;Landroid/os/Messenger;Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p4, v0}, Lq5/e;->b(Lq5/g;)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

# RE I/O 读取长整数偏好（SharedPreferences.getLong）。
.method public final onHandleIntent(Landroid/content/Intent;)V
    .locals 29

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "/"

    .line 4
    .line 5
    const-string v2, "_upload.zip"

    .line 6
    .line 7
    const-string v3, "mistake_v2/res/"

    .line 8
    .line 9
    const-string v4, "+0+"

    .line 10
    .line 11
    const-string v5, "+mistake_v2+res+1+"

    .line 12
    .line 13
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    const-string v6, "UPLOAD_TYPE"

    .line 17
    .line 18
    const/4 v7, 0x0

    .line 19
    invoke-virtual {v0, v6, v7}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 20
    .line 21
    .line 22
    move-result v6

    .line 23
    const-string v8, "UPLOAD_PATH"

    .line 24
    .line 25
    invoke-virtual {v0, v8}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v8

    .line 29
    const-string v9, ""

    .line 30
    .line 31
    if-nez v8, :cond_0

    .line 32
    .line 33
    move-object v8, v9

    .line 34
    :cond_0
    const-string v10, "UPLOAD_DATA"

    .line 35
    .line 36
    invoke-virtual {v0, v10}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v10

    .line 40
    if-nez v10, :cond_1

    .line 41
    .line 42
    move-object v10, v9

    .line 43
    :cond_1
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->hashCode()I

    .line 44
    .line 45
    .line 46
    move-result v11

    .line 47
    new-instance v12, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v13, "start1:"

    .line 50
    .line 51
    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v11, ", tag--->> "

    .line 58
    .line 59
    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v11

    .line 69
    const-string v12, "uploadImage"

    .line 70
    .line 71
    invoke-static {v12, v11}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    const-string v11, "UPLOAD_MESSENGER"

    .line 82
    .line 83
    invoke-virtual {v0, v11}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    const-string v11, "null cannot be cast to non-null type android.os.Messenger"

    .line 88
    .line 89
    invoke-static {v0, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    move-object v11, v0

    .line 93
    check-cast v11, Landroid/os/Messenger;

    .line 94
    .line 95
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-static {v0}, Lcom/zykj/mistake/utils/d;->d(Landroid/content/Context;)Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    const/4 v13, 0x0

    .line 104
    if-eqz v0, :cond_b

    .line 105
    .line 106
    :try_start_0
    sget-object v0, Lh4/b;->a:Landroid/app/Application;

    .line 107
    .line 108
    const-string v14, "SP_USER_ID"

    .line 109
    .line 110
    const-string v15, "zykjMistake"

    .line 111
    .line 112
    invoke-virtual {v0, v15, v7}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    move-object/from16 v16, v8

    .line 117
    .line 118
    const-wide/16 v7, -0x1

    .line 119
    .line 120
    invoke-interface {v0, v14, v7, v8}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 121
    .line 122
    .line 123
    move-result-wide v7

    .line 124
    const/4 v0, 0x1

    .line 125
    if-ne v6, v0, :cond_2

    .line 126
    .line 127
    const-string v14, ".jpg"

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :catch_0
    move-exception v0

    .line 131
    move-object/from16 v1, p0

    .line 132
    .line 133
    :goto_0
    const/16 v2, 0xca

    .line 134
    .line 135
    goto/16 :goto_7

    .line 136
    .line 137
    :cond_2
    const-string v14, ".zip"

    .line 138
    .line 139
    :goto_1
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 140
    .line 141
    .line 142
    move-result-object v17

    .line 143
    invoke-virtual/range {v17 .. v17}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v15

    .line 147
    const-string v12, "toString(...)"

    .line 148
    .line 149
    invoke-static {v15, v12}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    const-string v12, "-"

    .line 153
    .line 154
    invoke-static {v15, v12, v9}, Lkotlin/text/w;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v9

    .line 158
    move-object v12, v1

    .line 159
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 160
    .line 161
    .line 162
    move-result-wide v0

    .line 163
    new-instance v15, Ljava/lang/StringBuilder;

    .line 164
    .line 165
    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v15, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v15, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v15, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v15, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    const-string v4, "+"

    .line 184
    .line 185
    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v15, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    invoke-static {v4}, Lcom/blankj/utilcode/util/c;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v26

    .line 199
    new-instance v17, Lcom/zykj/mistake/entity/req/TokenReq;

    .line 200
    .line 201
    const/16 v27, 0x1b

    .line 202
    .line 203
    const/16 v28, 0x0

    .line 204
    .line 205
    const/16 v18, 0x0

    .line 206
    .line 207
    const/16 v19, 0x0

    .line 208
    .line 209
    const/16 v21, 0x0

    .line 210
    .line 211
    const/16 v22, 0x0

    .line 212
    .line 213
    move-wide/from16 v24, v0

    .line 214
    .line 215
    move-object/from16 v23, v9

    .line 216
    .line 217
    move-object/from16 v20, v14

    .line 218
    .line 219
    invoke-direct/range {v17 .. v28}, Lcom/zykj/mistake/entity/req/TokenReq;-><init>(IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;ILkotlin/jvm/internal/e;)V

    .line 220
    .line 221
    .line 222
    move-object/from16 v1, v17

    .line 223
    .line 224
    move-object/from16 v0, v23

    .line 225
    .line 226
    move-wide/from16 v4, v24

    .line 227
    .line 228
    invoke-static {}, Lcom/blankj/utilcode/util/s;->a()Ljava/text/SimpleDateFormat;

    .line 229
    .line 230
    .line 231
    move-result-object v9

    .line 232
    new-instance v15, Ljava/util/Date;

    .line 233
    .line 234
    invoke-direct {v15, v4, v5}, Ljava/util/Date;-><init>(J)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v9, v15}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v4

    .line 241
    new-instance v5, Ljava/lang/StringBuilder;

    .line 242
    .line 243
    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v5, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    sget-object v3, Lcom/zykj/mistake/network/a;->a:Lcom/zykj/mistake/network/a;

    .line 269
    .line 270
    invoke-static {}, Lcom/zykj/mistake/network/a;->b()Lcom/zykj/mistake/network/b;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    invoke-interface {v3, v1}, Lcom/zykj/mistake/network/b;->o(Lcom/zykj/mistake/entity/req/TokenReq;)Lretrofit2/e;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    invoke-interface {v1}, Lretrofit2/e;->d()Lretrofit2/n0;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    const-string v3, "execute(...)"

    .line 283
    .line 284
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    iget-object v3, v1, Lretrofit2/n0;->a:Lokhttp3/i0;

    .line 288
    .line 289
    iget v3, v3, Lokhttp3/i0;->d:I

    .line 290
    .line 291
    const/16 v4, 0x191

    .line 292
    .line 293
    if-ne v3, v4, :cond_3

    .line 294
    .line 295
    const/16 v0, 0xcb

    .line 296
    .line 297
    invoke-static {v0, v13, v11}, Lcom/zykj/mistake/service/UploadIntentService;->b(ILandroid/os/Bundle;Landroid/os/Messenger;)V

    .line 298
    .line 299
    .line 300
    return-void

    .line 301
    :cond_3
    iget-object v1, v1, Lretrofit2/n0;->b:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast v1, Lcom/zykj/mistake/entity/resp/GeneratorResp;

    .line 304
    .line 305
    if-eqz v1, :cond_4

    .line 306
    .line 307
    invoke-virtual {v1}, Lcom/zykj/mistake/network/ApiResp;->getSuccess()Z

    .line 308
    .line 309
    .line 310
    move-result v3

    .line 311
    if-nez v3, :cond_5

    .line 312
    .line 313
    :cond_4
    move-object/from16 v1, p0

    .line 314
    .line 315
    const/16 v2, 0xca

    .line 316
    .line 317
    goto :goto_6

    .line 318
    :cond_5
    const/4 v3, 0x2

    .line 319
    if-ne v6, v3, :cond_6

    .line 320
    .line 321
    move-object/from16 v8, v16

    .line 322
    .line 323
    invoke-static {v8, v11}, Lcom/zykj/mistake/service/UploadIntentService;->c(Ljava/lang/String;Landroid/os/Messenger;)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v3

    .line 327
    goto :goto_2

    .line 328
    :cond_6
    move-object/from16 v8, v16

    .line 329
    .line 330
    move-object v3, v8

    .line 331
    :goto_2
    const/16 v4, 0x66

    .line 332
    .line 333
    invoke-static {v4, v13, v11}, Lcom/zykj/mistake/service/UploadIntentService;->b(ILandroid/os/Bundle;Landroid/os/Messenger;)V

    .line 334
    .line 335
    .line 336
    new-instance v4, Lcom/zykj/mistake/service/UploadIntentService$onHandleIntent$resultUrl$1;

    .line 337
    .line 338
    invoke-direct {v4, v3, v0, v1, v13}, Lcom/zykj/mistake/service/UploadIntentService$onHandleIntent$resultUrl$1;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/mistake/entity/resp/GeneratorResp;Lh6/c;)V

    .line 339
    .line 340
    .line 341
    sget-object v0, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 342
    .line 343
    invoke-static {v0, v4}, Lkotlinx/coroutines/x;->z(Lh6/h;Lr6/e;)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    check-cast v0, Ljava/lang/String;

    .line 348
    .line 349
    if-eqz v0, :cond_7

    .line 350
    .line 351
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 352
    .line 353
    .line 354
    move-result v1

    .line 355
    if-nez v1, :cond_8

    .line 356
    .line 357
    :cond_7
    move-object/from16 v1, p0

    .line 358
    .line 359
    const/16 v2, 0xca

    .line 360
    .line 361
    goto :goto_5

    .line 362
    :cond_8
    new-instance v1, Ljava/io/File;

    .line 363
    .line 364
    invoke-virtual {v8, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v2

    .line 368
    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 372
    .line 373
    .line 374
    move-result v2

    .line 375
    if-eqz v2, :cond_9

    .line 376
    .line 377
    invoke-virtual {v1}, Ljava/io/File;->delete()Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 378
    .line 379
    .line 380
    :cond_9
    const/4 v15, 0x1

    .line 381
    if-ne v6, v15, :cond_a

    .line 382
    .line 383
    move v7, v15

    .line 384
    :goto_3
    move-object/from16 v1, p0

    .line 385
    .line 386
    goto :goto_4

    .line 387
    :cond_a
    const/4 v7, 0x0

    .line 388
    goto :goto_3

    .line 389
    :goto_4
    :try_start_1
    invoke-virtual {v1, v0, v10, v11, v7}, Lcom/zykj/mistake/service/UploadIntentService;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Messenger;Z)V

    .line 390
    .line 391
    .line 392
    return-void

    .line 393
    :catch_1
    move-exception v0

    .line 394
    goto/16 :goto_0

    .line 395
    .line 396
    :goto_5
    invoke-static {v2, v13, v11}, Lcom/zykj/mistake/service/UploadIntentService;->b(ILandroid/os/Bundle;Landroid/os/Messenger;)V

    .line 397
    .line 398
    .line 399
    return-void

    .line 400
    :goto_6
    invoke-static {v2, v13, v11}, Lcom/zykj/mistake/service/UploadIntentService;->b(ILandroid/os/Bundle;Landroid/os/Messenger;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 401
    .line 402
    .line 403
    return-void

    .line 404
    :goto_7
    invoke-static {v2, v13, v11}, Lcom/zykj/mistake/service/UploadIntentService;->b(ILandroid/os/Bundle;Landroid/os/Messenger;)V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 408
    .line 409
    .line 410
    return-void

    .line 411
    :cond_b
    move-object/from16 v1, p0

    .line 412
    .line 413
    const/16 v2, 0xca

    .line 414
    .line 415
    invoke-static {v2, v13, v11}, Lcom/zykj/mistake/service/UploadIntentService;->b(ILandroid/os/Bundle;Landroid/os/Messenger;)V

    .line 416
    .line 417
    .line 418
    return-void
.end method
