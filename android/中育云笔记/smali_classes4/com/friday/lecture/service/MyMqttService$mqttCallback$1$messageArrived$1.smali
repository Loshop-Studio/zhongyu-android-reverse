.class final Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/lecture/service/MyMqttService$mqttCallback$1;->messageArrived(Ljava/lang/String;Lorg/eclipse/paho/client/mqttv3/MqttMessage;)V
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
    c = "com.friday.lecture.service.MyMqttService$mqttCallback$1$messageArrived$1"
    f = "MyMqttService.kt"
    l = {
        0x139,
        0x13f
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:I

.field public h:I

.field public final synthetic i:Lcom/friday/lecture/service/MyMqttService;

.field public final synthetic j:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/friday/lecture/service/MyMqttService;Ljava/lang/String;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$1;->i:Lcom/friday/lecture/service/MyMqttService;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$1;->j:Ljava/lang/String;

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
    .locals 2

    .line 1
    new-instance p1, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$1;->i:Lcom/friday/lecture/service/MyMqttService;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$1;->j:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$1;-><init>(Lcom/friday/lecture/service/MyMqttService;Ljava/lang/String;Lvc/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v0, p0, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$1;->h:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    const/4 v4, 0x0

    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    if-eq v0, v3, :cond_1

    .line 13
    .line 14
    if-ne v0, v2, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$1;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Ljava/lang/Exception;

    .line 19
    .line 20
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto/16 :goto_3

    .line 24
    .line 25
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1

    .line 33
    :cond_1
    iget-object v0, p0, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$1;->f:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Ljava/lang/String;

    .line 36
    .line 37
    iget-object v0, p0, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$1;->e:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Lcom/friday/common/classtest/ResponseScreenCaptureData;

    .line 40
    .line 41
    iget-object v0, p0, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$1;->d:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Lcom/friday/common/classtest/ResponseScreenCaptureData;

    .line 44
    .line 45
    iget-object v0, p0, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$1;->c:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Lcom/friday/common/classtest/ResponseScreenCaptureData;

    .line 48
    .line 49
    :try_start_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    .line 51
    .line 52
    goto/16 :goto_0

    .line 53
    .line 54
    :catch_0
    move-exception v0

    .line 55
    move-object p1, v0

    .line 56
    goto/16 :goto_1

    .line 57
    .line 58
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-object p1, p0, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$1;->i:Lcom/friday/lecture/service/MyMqttService;

    .line 62
    .line 63
    invoke-static {p1}, Lcom/friday/lecture/service/MyMqttService;->h(Lcom/friday/lecture/service/MyMqttService;)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-nez p1, :cond_3

    .line 68
    .line 69
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 70
    .line 71
    return-object p1

    .line 72
    :cond_3
    :try_start_1
    iget-object p1, p0, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$1;->j:Ljava/lang/String;

    .line 73
    .line 74
    const-class v0, Lcom/friday/common/classtest/ResponseScreenCaptureData;

    .line 75
    .line 76
    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/GsonUtils;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    check-cast p1, Lcom/friday/common/classtest/ResponseScreenCaptureData;

    .line 81
    .line 82
    if-eqz p1, :cond_7

    .line 83
    .line 84
    invoke-virtual {p1}, Lcom/friday/common/classtest/ResponseScreenCaptureData;->getData()Lcom/friday/common/entity/ScreenCaptureEntity;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-virtual {v0}, Lcom/friday/common/entity/ScreenCaptureEntity;->getVersionCode()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    const-string v5, "null"

    .line 93
    .line 94
    invoke-static {v0, v5}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-nez v0, :cond_6

    .line 99
    .line 100
    invoke-virtual {p1}, Lcom/friday/common/classtest/ResponseScreenCaptureData;->getData()Lcom/friday/common/entity/ScreenCaptureEntity;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {v0}, Lcom/friday/common/entity/ScreenCaptureEntity;->getVersionCode()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    const-string v6, "."

    .line 109
    .line 110
    const-string v7, ""

    .line 111
    .line 112
    const/4 v9, 0x4

    .line 113
    const/4 v10, 0x0

    .line 114
    const/4 v8, 0x0

    .line 115
    invoke-static/range {v5 .. v10}, Lqd/z;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    const/16 v5, 0xcd

    .line 124
    .line 125
    if-lt v0, v5, :cond_5

    .line 126
    .line 127
    sget-object v0, Lk2/q;->a:Lk2/q;

    .line 128
    .line 129
    invoke-virtual {p1}, Lcom/friday/common/classtest/ResponseScreenCaptureData;->getData()Lcom/friday/common/entity/ScreenCaptureEntity;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    invoke-virtual {v5}, Lcom/friday/common/entity/ScreenCaptureEntity;->getName()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    invoke-virtual {v0, v5}, Lk2/q;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v7

    .line 141
    invoke-static {v7}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-eqz v0, :cond_4

    .line 146
    .line 147
    invoke-static {v7}, Lcom/blankj/utilcode/util/FileUtils;->getFileLength(Ljava/lang/String;)J

    .line 148
    .line 149
    .line 150
    move-result-wide v5

    .line 151
    const-wide/16 v8, 0x0

    .line 152
    .line 153
    cmp-long v0, v5, v8

    .line 154
    .line 155
    if-lez v0, :cond_4

    .line 156
    .line 157
    sget-object v6, Lk2/n;->a:Lk2/n$a;

    .line 158
    .line 159
    invoke-static {v7}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p1}, Lcom/friday/common/classtest/ResponseScreenCaptureData;->getData()Lcom/friday/common/entity/ScreenCaptureEntity;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    invoke-virtual {p1}, Lcom/friday/common/entity/ScreenCaptureEntity;->getDeviceCode()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v8

    .line 170
    const/4 v10, 0x4

    .line 171
    const/4 v11, 0x0

    .line 172
    const/4 v9, 0x0

    .line 173
    invoke-static/range {v6 .. v11}, Lk2/n$a;->b(Lk2/n$a;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    goto :goto_0

    .line 177
    :cond_4
    invoke-static {}, Lsd/r0;->c()Lsd/t1;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    new-instance v5, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$1$1$1;

    .line 182
    .line 183
    invoke-direct {v5, v4}, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$1$1$1;-><init>(Lvc/c;)V

    .line 184
    .line 185
    .line 186
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v6

    .line 190
    iput-object v6, p0, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$1;->c:Ljava/lang/Object;

    .line 191
    .line 192
    iput-object p1, p0, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$1;->d:Ljava/lang/Object;

    .line 193
    .line 194
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    iput-object p1, p0, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$1;->e:Ljava/lang/Object;

    .line 199
    .line 200
    invoke-static {v7}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    iput-object p1, p0, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$1;->f:Ljava/lang/Object;

    .line 205
    .line 206
    const/4 p1, 0x0

    .line 207
    iput p1, p0, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$1;->g:I

    .line 208
    .line 209
    iput v3, p0, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$1;->h:I

    .line 210
    .line 211
    invoke-static {v0, v5, p0}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    if-ne p1, v1, :cond_7

    .line 216
    .line 217
    goto :goto_2

    .line 218
    :cond_5
    new-instance p1, Ljava/lang/Exception;

    .line 219
    .line 220
    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    .line 221
    .line 222
    .line 223
    throw p1

    .line 224
    :cond_6
    new-instance p1, Ljava/lang/Exception;

    .line 225
    .line 226
    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    .line 227
    .line 228
    .line 229
    throw p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 230
    :cond_7
    :goto_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 231
    .line 232
    return-object p1

    .line 233
    :goto_1
    invoke-static {}, Lsd/r0;->c()Lsd/t1;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    new-instance v3, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$1$2;

    .line 238
    .line 239
    invoke-direct {v3, v4}, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$1$2;-><init>(Lvc/c;)V

    .line 240
    .line 241
    .line 242
    iput-object v0, p0, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$1;->c:Ljava/lang/Object;

    .line 243
    .line 244
    iput-object v4, p0, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$1;->d:Ljava/lang/Object;

    .line 245
    .line 246
    iput-object v4, p0, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$1;->e:Ljava/lang/Object;

    .line 247
    .line 248
    iput-object v4, p0, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$1;->f:Ljava/lang/Object;

    .line 249
    .line 250
    iput v2, p0, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$1;->h:I

    .line 251
    .line 252
    invoke-static {p1, v3, p0}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    if-ne p1, v1, :cond_8

    .line 257
    .line 258
    :goto_2
    return-object v1

    .line 259
    :cond_8
    :goto_3
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 260
    .line 261
    .line 262
    iget-object p1, p0, Lcom/friday/lecture/service/MyMqttService$mqttCallback$1$messageArrived$1;->i:Lcom/friday/lecture/service/MyMqttService;

    .line 263
    .line 264
    invoke-static {p1, v0}, Lcom/friday/lecture/service/MyMqttService;->d(Lcom/friday/lecture/service/MyMqttService;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    new-instance v0, Ljava/lang/StringBuilder;

    .line 269
    .line 270
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 271
    .line 272
    .line 273
    const-string v1, "MyMqttService -> mqttCallback catch,\u8bfe\u5802\u52a9\u624b\u7248\u672c\u8fc7\u4f4e\uff0c\u8bf7\u66f4\u65b0\u8bfe\u5802\u52a9\u624b, "

    .line 274
    .line 275
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object p1

    .line 285
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object p1

    .line 289
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 293
    .line 294
    return-object p1
.end method
