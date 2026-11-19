.class public abstract Lorg/android/agoo/control/BaseIntentService;
.super Landroid/app/Service;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "BaseIntentService"

.field private static final msgStatus:Ljava/lang/String; = "4"


# instance fields
.field private agooFactory:Lorg/android/agoo/control/AgooFactory;

.field private mContext:Landroid/content/Context;

.field private messageService:Lorg/android/agoo/message/MessageService;

.field private messenger:Landroid/os/Messenger;

.field private notifyManager:Lorg/android/agoo/control/NotifManager;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lorg/android/agoo/control/BaseIntentService;->mContext:Landroid/content/Context;

    .line 6
    .line 7
    new-instance v0, Landroid/os/Messenger;

    .line 8
    .line 9
    new-instance v1, Lorg/android/agoo/control/h;

    .line 10
    .line 11
    invoke-direct {v1, p0}, Lorg/android/agoo/control/h;-><init>(Lorg/android/agoo/control/BaseIntentService;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lorg/android/agoo/control/BaseIntentService;->messenger:Landroid/os/Messenger;

    .line 18
    .line 19
    return-void
.end method

.method public static synthetic access$000(Lorg/android/agoo/control/BaseIntentService;)Lorg/android/agoo/control/AgooFactory;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/android/agoo/control/BaseIntentService;->agooFactory:Lorg/android/agoo/control/AgooFactory;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$002(Lorg/android/agoo/control/BaseIntentService;Lorg/android/agoo/control/AgooFactory;)Lorg/android/agoo/control/AgooFactory;
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/android/agoo/control/BaseIntentService;->agooFactory:Lorg/android/agoo/control/AgooFactory;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$102(Lorg/android/agoo/control/BaseIntentService;Lorg/android/agoo/control/NotifManager;)Lorg/android/agoo/control/NotifManager;
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/android/agoo/control/BaseIntentService;->notifyManager:Lorg/android/agoo/control/NotifManager;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic access$202(Lorg/android/agoo/control/BaseIntentService;Lorg/android/agoo/message/MessageService;)Lorg/android/agoo/message/MessageService;
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/android/agoo/control/BaseIntentService;->messageService:Lorg/android/agoo/message/MessageService;

    .line 2
    .line 3
    return-object p1
.end method

.method private getTrace(J)Ljava/lang/String;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const-string v2, "unknow"

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    move-object v1, v2

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move-object v1, v0

    .line 13
    :goto_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-eqz v3, :cond_1

    .line 18
    .line 19
    move-object v0, v2

    .line 20
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string v3, "appkey|"

    .line 26
    .line 27
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string p1, "|"

    .line 34
    .line 35
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 39
    .line 40
    .line 41
    move-result-wide v3

    .line 42
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    return-object p1
.end method

.method private handleRemoteMessage(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 34

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    const-string v3, "messageId="

    .line 6
    .line 7
    const-string v4, "body"

    .line 8
    .line 9
    const-string v5, "agoo_arrive"

    .line 10
    .line 11
    const-string v6, "accs"

    .line 12
    .line 13
    const-string v7, "BaseIntentService"

    .line 14
    .line 15
    :try_start_0
    const-string v0, "id"

    .line 16
    .line 17
    invoke-virtual {v2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v15

    .line 21
    invoke-virtual {v2, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v11

    .line 25
    const-string v0, "type"

    .line 26
    .line 27
    invoke-virtual {v2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v10

    .line 31
    const-string v0, "message_source"

    .line 32
    .line 33
    invoke-virtual {v2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v13

    .line 37
    const-string v0, "report"

    .line 38
    .line 39
    invoke-virtual {v2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v12

    .line 43
    const-string v0, "encrypted"

    .line 44
    .line 45
    invoke-virtual {v2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v14

    .line 49
    const-string v0, "extData"

    .line 50
    .line 51
    invoke-virtual {v2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v8

    .line 55
    const-string v0, "oriData"

    .line 56
    .line 57
    invoke-virtual {v2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_d

    .line 61
    move-object/from16 v22, v5

    .line 62
    .line 63
    :try_start_1
    const-string v0, "trace"
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 64
    .line 65
    move-object/from16 v23, v6

    .line 66
    .line 67
    const-wide/16 v5, -0x1

    .line 68
    .line 69
    :try_start_2
    invoke-virtual {v2, v0, v5, v6}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 70
    .line 71
    .line 72
    move-result-wide v5

    .line 73
    invoke-direct {v1, v5, v6}, Lorg/android/agoo/control/BaseIntentService;->getTrace(J)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    const-string v0, "msg_agoo_bundle"

    .line 77
    .line 78
    invoke-virtual {v2, v0}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    const-string v5, "source"

    .line 83
    .line 84
    invoke-virtual {v2, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 88
    :try_start_3
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    if-eqz v6, :cond_0

    .line 93
    .line 94
    const-string v5, "oldsdk"

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :catchall_0
    move-exception v0

    .line 98
    move-object/from16 v16, v5

    .line 99
    .line 100
    goto :goto_5

    .line 101
    :cond_0
    :goto_0
    const-string v6, "fromAppkey"

    .line 102
    .line 103
    invoke-virtual {v2, v6}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v6
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 107
    if-eqz v0, :cond_1

    .line 108
    .line 109
    move-object/from16 v16, v5

    .line 110
    .line 111
    :try_start_4
    const-string v5, "accs_extra"

    .line 112
    .line 113
    invoke-virtual {v0, v5}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    check-cast v0, Lcom/taobao/accs/base/TaoBaseService$ExtraInfo;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :catchall_1
    :goto_1
    const/4 v0, 0x0

    .line 121
    goto :goto_2

    .line 122
    :cond_1
    move-object/from16 v16, v5

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :goto_2
    move-object/from16 v21, v6

    .line 126
    .line 127
    :goto_3
    move-object/from16 v19, v16

    .line 128
    .line 129
    goto :goto_6

    .line 130
    :catchall_2
    move-exception v0

    .line 131
    :goto_4
    const/16 v16, 0x0

    .line 132
    .line 133
    goto :goto_5

    .line 134
    :catchall_3
    move-exception v0

    .line 135
    move-object/from16 v23, v6

    .line 136
    .line 137
    goto :goto_4

    .line 138
    :goto_5
    :try_start_5
    new-instance v5, Ljava/lang/StringBuilder;

    .line 139
    .line 140
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 141
    .line 142
    .line 143
    const-string v6, "_trace,t="

    .line 144
    .line 145
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    const/4 v5, 0x0

    .line 156
    new-array v6, v5, [Ljava/lang/Object;

    .line 157
    .line 158
    invoke-static {v7, v0, v6}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    const/4 v0, 0x0

    .line 162
    const/16 v21, 0x0

    .line 163
    .line 164
    goto :goto_3

    .line 165
    :goto_6
    sget-object v5, Lcom/taobao/accs/utl/ALog$Level;->I:Lcom/taobao/accs/utl/ALog$Level;

    .line 166
    .line 167
    invoke-static {v5}, Lcom/taobao/accs/utl/ALog;->isPrintLog(Lcom/taobao/accs/utl/ALog$Level;)Z

    .line 168
    .line 169
    .line 170
    move-result v5

    .line 171
    if-eqz v5, :cond_2

    .line 172
    .line 173
    const-string v5, "handleRemoteMessage"

    .line 174
    .line 175
    move-object v6, v10

    .line 176
    const-string v10, "message"

    .line 177
    .line 178
    move-object/from16 v16, v12

    .line 179
    .line 180
    const-string v12, "source"

    .line 181
    .line 182
    move-object/from16 v17, v14

    .line 183
    .line 184
    const-string v14, "msgId"

    .line 185
    .line 186
    move-object/from16 v18, v16

    .line 187
    .line 188
    const-string v16, "utdid"

    .line 189
    .line 190
    move-object/from16 v20, v17

    .line 191
    .line 192
    invoke-static/range {p1 .. p1}, Lcom/taobao/accs/utl/AdapterUtilityImpl;->getDeviceId(Landroid/content/Context;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v17

    .line 196
    move-object/from16 v24, v18

    .line 197
    .line 198
    const-string v18, "fromPkg"

    .line 199
    .line 200
    move-object/from16 v25, v20

    .line 201
    .line 202
    const-string v20, "fromAppkey"

    .line 203
    .line 204
    move-object/from16 v33, v25

    .line 205
    .line 206
    move-object/from16 v25, v3

    .line 207
    .line 208
    move-object/from16 v3, v33

    .line 209
    .line 210
    move-object/from16 v33, v24

    .line 211
    .line 212
    move-object/from16 v24, v6

    .line 213
    .line 214
    move-object/from16 v6, v33

    .line 215
    .line 216
    filled-new-array/range {v10 .. v21}, [Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v10

    .line 220
    move-object/from16 v12, v19

    .line 221
    .line 222
    move-object/from16 v14, v21

    .line 223
    .line 224
    invoke-static {v7, v5, v10}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    goto :goto_7

    .line 228
    :catchall_4
    move-exception v0

    .line 229
    move-object/from16 v4, v22

    .line 230
    .line 231
    move-object/from16 v6, v23

    .line 232
    .line 233
    goto/16 :goto_d

    .line 234
    .line 235
    :cond_2
    move-object/from16 v25, v3

    .line 236
    .line 237
    move-object/from16 v24, v10

    .line 238
    .line 239
    move-object v6, v12

    .line 240
    move-object v3, v14

    .line 241
    move-object/from16 v12, v19

    .line 242
    .line 243
    move-object/from16 v14, v21

    .line 244
    .line 245
    :goto_7
    new-instance v5, Lorg/android/agoo/common/MsgDO;

    .line 246
    .line 247
    invoke-direct {v5}, Lorg/android/agoo/common/MsgDO;-><init>()V

    .line 248
    .line 249
    .line 250
    iput-object v15, v5, Lorg/android/agoo/common/MsgDO;->msgIds:Ljava/lang/String;

    .line 251
    .line 252
    iput-object v8, v5, Lorg/android/agoo/common/MsgDO;->extData:Ljava/lang/String;

    .line 253
    .line 254
    iput-object v13, v5, Lorg/android/agoo/common/MsgDO;->messageSource:Ljava/lang/String;

    .line 255
    .line 256
    const-string v8, "4"

    .line 257
    .line 258
    iput-object v8, v5, Lorg/android/agoo/common/MsgDO;->msgStatus:Ljava/lang/String;

    .line 259
    .line 260
    iput-object v6, v5, Lorg/android/agoo/common/MsgDO;->reportStr:Ljava/lang/String;

    .line 261
    .line 262
    iput-object v12, v5, Lorg/android/agoo/common/MsgDO;->fromPkg:Ljava/lang/String;

    .line 263
    .line 264
    iput-object v14, v5, Lorg/android/agoo/common/MsgDO;->fromAppkey:Ljava/lang/String;

    .line 265
    .line 266
    invoke-static {}, Lcom/taobao/accs/client/AdapterGlobalClientInfo;->isFirstStartProc()Z

    .line 267
    .line 268
    .line 269
    move-result v6

    .line 270
    iput-boolean v6, v5, Lorg/android/agoo/common/MsgDO;->isStartProc:Z

    .line 271
    .line 272
    iget-object v6, v1, Lorg/android/agoo/control/BaseIntentService;->mContext:Landroid/content/Context;

    .line 273
    .line 274
    invoke-static {v6}, Lcom/taobao/accs/utl/AdapterUtilityImpl;->isNotificationEnabled(Landroid/content/Context;)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v6

    .line 278
    iput-object v6, v5, Lorg/android/agoo/common/MsgDO;->notifyEnable:Ljava/lang/String;

    .line 279
    .line 280
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 281
    .line 282
    .line 283
    move-result v6

    .line 284
    if-nez v6, :cond_4

    .line 285
    .line 286
    const/4 v6, 0x4

    .line 287
    invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v6

    .line 291
    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    move-result v3

    .line 295
    if-eqz v3, :cond_3

    .line 296
    .line 297
    const-string v3, "message is encrypted, attempt to decrypt msg"

    .line 298
    .line 299
    const/4 v6, 0x0

    .line 300
    new-array v8, v6, [Ljava/lang/Object;

    .line 301
    .line 302
    invoke-static {v7, v3, v8}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    invoke-static {v11}, Lorg/android/agoo/control/AgooFactory;->parseEncryptedMsg(Ljava/lang/String;)Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v11

    .line 309
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 310
    .line 311
    .line 312
    move-result v3

    .line 313
    if-eqz v3, :cond_4

    .line 314
    .line 315
    const-string v2, "22"

    .line 316
    .line 317
    iput-object v2, v5, Lorg/android/agoo/common/MsgDO;->errorCode:Ljava/lang/String;

    .line 318
    .line 319
    iget-object v2, v1, Lorg/android/agoo/control/BaseIntentService;->notifyManager:Lorg/android/agoo/control/NotifManager;

    .line 320
    .line 321
    invoke-virtual {v2, v5, v0}, Lorg/android/agoo/control/NotifManager;->handlerACKMessage(Lorg/android/agoo/common/MsgDO;Lcom/taobao/accs/base/TaoBaseService$ExtraInfo;)V

    .line 322
    .line 323
    .line 324
    goto/16 :goto_e

    .line 325
    .line 326
    :cond_3
    const-string v2, "msg encrypted flag not exist~~"

    .line 327
    .line 328
    const/4 v6, 0x0

    .line 329
    new-array v3, v6, [Ljava/lang/Object;

    .line 330
    .line 331
    invoke-static {v7, v2, v3}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 332
    .line 333
    .line 334
    :try_start_6
    const-string v2, "24"

    .line 335
    .line 336
    iput-object v2, v5, Lorg/android/agoo/common/MsgDO;->errorCode:Ljava/lang/String;

    .line 337
    .line 338
    iget-object v2, v1, Lorg/android/agoo/control/BaseIntentService;->notifyManager:Lorg/android/agoo/control/NotifManager;

    .line 339
    .line 340
    invoke-virtual {v2, v5, v0}, Lorg/android/agoo/control/NotifManager;->report(Lorg/android/agoo/common/MsgDO;Lcom/taobao/accs/base/TaoBaseService$ExtraInfo;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_e

    .line 341
    .line 342
    .line 343
    goto/16 :goto_e

    .line 344
    .line 345
    :cond_4
    :try_start_7
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 346
    .line 347
    .line 348
    move-result v3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 349
    if-eqz v3, :cond_5

    .line 350
    .line 351
    :try_start_8
    const-string v2, "21"

    .line 352
    .line 353
    iput-object v2, v5, Lorg/android/agoo/common/MsgDO;->errorCode:Ljava/lang/String;

    .line 354
    .line 355
    iget-object v2, v1, Lorg/android/agoo/control/BaseIntentService;->notifyManager:Lorg/android/agoo/control/NotifManager;

    .line 356
    .line 357
    invoke-virtual {v2, v5, v0}, Lorg/android/agoo/control/NotifManager;->report(Lorg/android/agoo/common/MsgDO;Lcom/taobao/accs/base/TaoBaseService$ExtraInfo;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 358
    .line 359
    .line 360
    :catchall_5
    :try_start_9
    const-string v0, "handleMessage--->[null]"

    .line 361
    .line 362
    const/4 v6, 0x0

    .line 363
    new-array v2, v6, [Ljava/lang/Object;

    .line 364
    .line 365
    invoke-static {v7, v0, v2}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 366
    .line 367
    .line 368
    goto/16 :goto_e

    .line 369
    .line 370
    :cond_5
    invoke-virtual {v2, v4, v11}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 371
    .line 372
    .line 373
    :try_start_a
    iget-object v3, v1, Lorg/android/agoo/control/BaseIntentService;->notifyManager:Lorg/android/agoo/control/NotifManager;

    .line 374
    .line 375
    invoke-virtual {v3, v5, v0}, Lorg/android/agoo/control/NotifManager;->report(Lorg/android/agoo/common/MsgDO;Lcom/taobao/accs/base/TaoBaseService$ExtraInfo;)V

    .line 376
    .line 377
    .line 378
    iget-object v0, v1, Lorg/android/agoo/control/BaseIntentService;->messageService:Lorg/android/agoo/message/MessageService;

    .line 379
    .line 380
    const-string v3, "0"

    .line 381
    .line 382
    invoke-virtual {v0, v15, v9, v3}, Lorg/android/agoo/message/MessageService;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 383
    .line 384
    .line 385
    invoke-static {}, Lcom/taobao/accs/utl/UTMini;->getInstance()Lcom/taobao/accs/utl/UTMini;

    .line 386
    .line 387
    .line 388
    move-result-object v26

    .line 389
    const-string v28, "Page_Push"

    .line 390
    .line 391
    const-string v29, "agoo_arrive_id"

    .line 392
    .line 393
    new-instance v0, Ljava/lang/StringBuilder;

    .line 394
    .line 395
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    .line 396
    .line 397
    .line 398
    move-object/from16 v3, v25

    .line 399
    .line 400
    :try_start_b
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 401
    .line 402
    .line 403
    iget-object v4, v5, Lorg/android/agoo/common/MsgDO;->msgIds:Ljava/lang/String;

    .line 404
    .line 405
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 406
    .line 407
    .line 408
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    const/4 v4, 0x0

    .line 413
    filled-new-array {v4, v0}, [Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v32

    .line 417
    const/16 v27, 0x4e1f

    .line 418
    .line 419
    const/16 v30, 0x0

    .line 420
    .line 421
    const/16 v31, 0x0

    .line 422
    .line 423
    invoke-virtual/range {v26 .. v32}, Lcom/taobao/accs/utl/UTMini;->commitEvent(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    const-string v0, "arrive"
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    .line 427
    .line 428
    move-object/from16 v4, v22

    .line 429
    .line 430
    move-object/from16 v6, v23

    .line 431
    .line 432
    const-wide/16 v8, 0x0

    .line 433
    .line 434
    :try_start_c
    invoke-static {v6, v4, v0, v8, v9}, Lcom/taobao/accs/utl/AppMonitorAdapter;->commitCount(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    .line 435
    .line 436
    .line 437
    goto :goto_9

    .line 438
    :catchall_6
    move-exception v0

    .line 439
    goto :goto_8

    .line 440
    :catchall_7
    move-exception v0

    .line 441
    move-object/from16 v4, v22

    .line 442
    .line 443
    move-object/from16 v6, v23

    .line 444
    .line 445
    goto :goto_8

    .line 446
    :catchall_8
    move-exception v0

    .line 447
    move-object/from16 v4, v22

    .line 448
    .line 449
    move-object/from16 v6, v23

    .line 450
    .line 451
    move-object/from16 v3, v25

    .line 452
    .line 453
    :goto_8
    :try_start_d
    new-instance v8, Ljava/lang/StringBuilder;

    .line 454
    .line 455
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 456
    .line 457
    .line 458
    const-string v9, "report message Throwable--->t="

    .line 459
    .line 460
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 461
    .line 462
    .line 463
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 468
    .line 469
    .line 470
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    const/4 v8, 0x0

    .line 475
    new-array v9, v8, [Ljava/lang/Object;

    .line 476
    .line 477
    invoke-static {v7, v0, v9}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 478
    .line 479
    .line 480
    :goto_9
    iget-object v0, v1, Lorg/android/agoo/control/BaseIntentService;->messageService:Lorg/android/agoo/message/MessageService;

    .line 481
    .line 482
    invoke-virtual {v0, v15}, Lorg/android/agoo/message/MessageService;->a(Ljava/lang/String;)Z

    .line 483
    .line 484
    .line 485
    move-result v0

    .line 486
    if-eqz v0, :cond_7

    .line 487
    .line 488
    sget-object v0, Lcom/taobao/accs/utl/ALog$Level;->I:Lcom/taobao/accs/utl/ALog$Level;

    .line 489
    .line 490
    invoke-static {v0}, Lcom/taobao/accs/utl/ALog;->isPrintLog(Lcom/taobao/accs/utl/ALog$Level;)Z

    .line 491
    .line 492
    .line 493
    move-result v0

    .line 494
    if-eqz v0, :cond_6

    .line 495
    .line 496
    new-instance v0, Ljava/lang/StringBuilder;

    .line 497
    .line 498
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 499
    .line 500
    .line 501
    const-string v2, "handleRemoteMessage hasMessageDuplicate,messageId="

    .line 502
    .line 503
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 504
    .line 505
    .line 506
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 507
    .line 508
    .line 509
    const-string v2, ",utdid="

    .line 510
    .line 511
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 512
    .line 513
    .line 514
    invoke-static/range {p1 .. p1}, Lcom/taobao/accs/utl/AdapterUtilityImpl;->getDeviceId(Landroid/content/Context;)Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object v2

    .line 518
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 519
    .line 520
    .line 521
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 522
    .line 523
    .line 524
    move-result-object v0

    .line 525
    const/4 v5, 0x0

    .line 526
    new-array v2, v5, [Ljava/lang/Object;

    .line 527
    .line 528
    invoke-static {v7, v0, v2}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 529
    .line 530
    .line 531
    goto :goto_a

    .line 532
    :catchall_9
    move-exception v0

    .line 533
    goto/16 :goto_d

    .line 534
    .line 535
    :cond_6
    :goto_a
    const-string v0, "arrive_dup"

    .line 536
    .line 537
    const-wide/16 v8, 0x0

    .line 538
    .line 539
    invoke-static {v6, v4, v0, v8, v9}, Lcom/taobao/accs/utl/AppMonitorAdapter;->commitCount(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V

    .line 540
    .line 541
    .line 542
    goto/16 :goto_e

    .line 543
    .line 544
    :cond_7
    sget-object v0, Lcom/taobao/accs/utl/ALog$Level;->I:Lcom/taobao/accs/utl/ALog$Level;

    .line 545
    .line 546
    invoke-static {v0}, Lcom/taobao/accs/utl/ALog;->isPrintLog(Lcom/taobao/accs/utl/ALog$Level;)Z

    .line 547
    .line 548
    .line 549
    move-result v0

    .line 550
    if-eqz v0, :cond_8

    .line 551
    .line 552
    new-instance v0, Ljava/lang/StringBuilder;

    .line 553
    .line 554
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 555
    .line 556
    .line 557
    const-string v8, "handleMessage--->["

    .line 558
    .line 559
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 560
    .line 561
    .line 562
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 563
    .line 564
    .line 565
    const-string v8, "],["

    .line 566
    .line 567
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 568
    .line 569
    .line 570
    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 571
    .line 572
    .line 573
    const-string v8, "]"

    .line 574
    .line 575
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 576
    .line 577
    .line 578
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 579
    .line 580
    .line 581
    move-result-object v0

    .line 582
    const/4 v8, 0x0

    .line 583
    new-array v8, v8, [Ljava/lang/Object;

    .line 584
    .line 585
    invoke-static {v7, v0, v8}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_9

    .line 586
    .line 587
    .line 588
    :cond_8
    :try_start_e
    const-string v0, "notify"

    .line 589
    .line 590
    invoke-virtual {v2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 591
    .line 592
    .line 593
    move-result-object v0

    .line 594
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 595
    .line 596
    .line 597
    move-result v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_a

    .line 598
    goto :goto_b

    .line 599
    :catchall_a
    const/4 v0, -0x1

    .line 600
    :goto_b
    :try_start_f
    const-string v7, ""
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_9

    .line 601
    .line 602
    :try_start_10
    const-string v8, "has_test"

    .line 603
    .line 604
    invoke-virtual {v2, v8}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 605
    .line 606
    .line 607
    move-result-object v8

    .line 608
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 609
    .line 610
    .line 611
    move-result v9

    .line 612
    if-nez v9, :cond_9

    .line 613
    .line 614
    const-string v9, "1"

    .line 615
    .line 616
    invoke-static {v8, v9}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 617
    .line 618
    .line 619
    move-result v8

    .line 620
    if-eqz v8, :cond_9

    .line 621
    .line 622
    iget-object v8, v1, Lorg/android/agoo/control/BaseIntentService;->messageService:Lorg/android/agoo/message/MessageService;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_b

    .line 623
    .line 624
    move-object/from16 v9, v24

    .line 625
    .line 626
    :try_start_11
    invoke-virtual {v8, v15, v11, v9, v0}, Lorg/android/agoo/message/MessageService;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 627
    .line 628
    .line 629
    const-string v8, "arrive_test"

    .line 630
    .line 631
    const-wide/16 v12, 0x0

    .line 632
    .line 633
    invoke-static {v6, v4, v8, v12, v13}, Lcom/taobao/accs/utl/AppMonitorAdapter;->commitCount(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V

    .line 634
    .line 635
    .line 636
    goto/16 :goto_e

    .line 637
    .line 638
    :catchall_b
    move-object/from16 v9, v24

    .line 639
    .line 640
    goto :goto_c

    .line 641
    :cond_9
    move-object/from16 v9, v24

    .line 642
    .line 643
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 644
    .line 645
    .line 646
    move-result-object v8

    .line 647
    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 648
    .line 649
    .line 650
    move-result-object v7
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_c

    .line 651
    :catchall_c
    :goto_c
    :try_start_12
    iget-object v8, v1, Lorg/android/agoo/control/BaseIntentService;->mContext:Landroid/content/Context;

    .line 652
    .line 653
    invoke-static {v8}, Lorg/android/agoo/control/AgooFactory;->getInstance(Landroid/content/Context;)Lorg/android/agoo/control/AgooFactory;

    .line 654
    .line 655
    .line 656
    move-result-object v8

    .line 657
    invoke-virtual {v8}, Lorg/android/agoo/control/AgooFactory;->isCacheMessageEnabled()Z

    .line 658
    .line 659
    .line 660
    move-result v8

    .line 661
    if-eqz v8, :cond_a

    .line 662
    .line 663
    iget-object v8, v1, Lorg/android/agoo/control/BaseIntentService;->messageService:Lorg/android/agoo/message/MessageService;

    .line 664
    .line 665
    invoke-virtual {v8, v15, v11, v9, v0}, Lorg/android/agoo/message/MessageService;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 666
    .line 667
    .line 668
    :cond_a
    invoke-static {}, Lcom/taobao/accs/utl/UTMini;->getInstance()Lcom/taobao/accs/utl/UTMini;

    .line 669
    .line 670
    .line 671
    move-result-object v8

    .line 672
    const-string v10, "Page_Push"

    .line 673
    .line 674
    const-string v11, "agoo_arrive_real_id"

    .line 675
    .line 676
    new-instance v0, Ljava/lang/StringBuilder;

    .line 677
    .line 678
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 679
    .line 680
    .line 681
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 682
    .line 683
    .line 684
    iget-object v3, v5, Lorg/android/agoo/common/MsgDO;->msgIds:Ljava/lang/String;

    .line 685
    .line 686
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 687
    .line 688
    .line 689
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 690
    .line 691
    .line 692
    move-result-object v0

    .line 693
    const/4 v3, 0x0

    .line 694
    filled-new-array {v3, v0}, [Ljava/lang/String;

    .line 695
    .line 696
    .line 697
    move-result-object v14

    .line 698
    const/16 v9, 0x4e1f

    .line 699
    .line 700
    const/4 v12, 0x0

    .line 701
    const/4 v13, 0x0

    .line 702
    invoke-virtual/range {v8 .. v14}, Lcom/taobao/accs/utl/UTMini;->commitEvent(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/String;)V

    .line 703
    .line 704
    .line 705
    new-instance v0, Ljava/lang/StringBuilder;

    .line 706
    .line 707
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 708
    .line 709
    .line 710
    const-string v3, "arrive_real_"

    .line 711
    .line 712
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 713
    .line 714
    .line 715
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 716
    .line 717
    .line 718
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 719
    .line 720
    .line 721
    move-result-object v0

    .line 722
    const-wide/16 v8, 0x0

    .line 723
    .line 724
    invoke-static {v6, v4, v0, v8, v9}, Lcom/taobao/accs/utl/AppMonitorAdapter;->commitCount(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V

    .line 725
    .line 726
    .line 727
    const-string v0, "monitor"

    .line 728
    .line 729
    invoke-virtual {v2, v0}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    .line 730
    .line 731
    .line 732
    move-result-object v0

    .line 733
    check-cast v0, Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;

    .line 734
    .line 735
    if-eqz v0, :cond_b

    .line 736
    .line 737
    invoke-virtual {v0}, Lcom/taobao/accs/ut/monitor/NetPerformanceMonitor;->onToAgooTime()V

    .line 738
    .line 739
    .line 740
    invoke-static {}, Lanet/channel/appmonitor/AppMonitor;->getInstance()Lanet/channel/appmonitor/IAppMonitor;

    .line 741
    .line 742
    .line 743
    move-result-object v3

    .line 744
    invoke-interface {v3, v0}, Lanet/channel/appmonitor/IAppMonitor;->commitStat(Lanet/channel/statist/StatObject;)V

    .line 745
    .line 746
    .line 747
    :cond_b
    invoke-virtual/range {p0 .. p2}, Lorg/android/agoo/control/BaseIntentService;->onMessage(Landroid/content/Context;Landroid/content/Intent;)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_9

    .line 748
    .line 749
    .line 750
    goto :goto_e

    .line 751
    :catchall_d
    move-exception v0

    .line 752
    move-object v4, v5

    .line 753
    :goto_d
    new-instance v2, Ljava/lang/StringBuilder;

    .line 754
    .line 755
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 756
    .line 757
    .line 758
    const-string v3, "arrive_exception"

    .line 759
    .line 760
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 761
    .line 762
    .line 763
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 764
    .line 765
    .line 766
    move-result-object v3

    .line 767
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 768
    .line 769
    .line 770
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 771
    .line 772
    .line 773
    move-result-object v2

    .line 774
    const-wide/16 v8, 0x0

    .line 775
    .line 776
    invoke-static {v6, v4, v2, v8, v9}, Lcom/taobao/accs/utl/AppMonitorAdapter;->commitCount(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V

    .line 777
    .line 778
    .line 779
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 780
    .line 781
    .line 782
    :catchall_e
    :goto_e
    return-void
.end method

.method private handleRemovePackage(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    .line 1
    if-eqz p2, :cond_4

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/net/Uri;->getSchemeSpecificPart()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const/4 p1, 0x0

    .line 18
    :goto_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_2
    const-string v0, "android.intent.extra.REPLACING"

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    sget-object v0, Lcom/taobao/accs/utl/ALog$Level;->D:Lcom/taobao/accs/utl/ALog$Level;

    .line 33
    .line 34
    invoke-static {v0}, Lcom/taobao/accs/utl/ALog;->isPrintLog(Lcom/taobao/accs/utl/ALog$Level;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    new-instance v0, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    .line 45
    const-string v2, "handleRemovePackage---->[replacing:"

    .line 46
    .line 47
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v2, "],uninstallPack="

    .line 54
    .line 55
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    new-array v1, v1, [Ljava/lang/Object;

    .line 66
    .line 67
    const-string v2, "BaseIntentService"

    .line 68
    .line 69
    invoke-static {v2, v0, v1}, Lcom/taobao/accs/utl/ALog;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    :cond_3
    if-nez p2, :cond_4

    .line 73
    .line 74
    iget-object v0, p0, Lorg/android/agoo/control/BaseIntentService;->notifyManager:Lorg/android/agoo/control/NotifManager;

    .line 75
    .line 76
    invoke-virtual {v0, p1, p2}, Lorg/android/agoo/control/NotifManager;->doUninstall(Ljava/lang/String;Z)V

    .line 77
    .line 78
    .line 79
    :cond_4
    :goto_1
    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 3

    .line 1
    invoke-static {p0}, Lcom/taobao/accs/utl/OrangeAdapter;->isBindService(Landroid/content/Context;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, Lcom/taobao/accs/utl/Utils;->isTarget26(Landroid/content/Context;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    new-instance v0, Landroid/content/Intent;

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 24
    .line 25
    .line 26
    new-instance v1, Lorg/android/agoo/control/j;

    .line 27
    .line 28
    invoke-direct {v1, p0}, Lorg/android/agoo/control/j;-><init>(Lorg/android/agoo/control/BaseIntentService;)V

    .line 29
    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    invoke-virtual {p1, v0, v1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 33
    .line 34
    .line 35
    :cond_0
    iget-object p1, p0, Lorg/android/agoo/control/BaseIntentService;->messenger:Landroid/os/Messenger;

    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1
.end method

.method public onCreate()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/android/agoo/control/k;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lorg/android/agoo/control/k;-><init>(Lorg/android/agoo/control/BaseIntentService;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lcom/taobao/accs/common/ThreadPoolExecutorFactory;->execute(Ljava/lang/Runnable;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public abstract onError(Landroid/content/Context;Ljava/lang/String;)V
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public onHandleIntent(Landroid/content/Intent;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Lorg/android/agoo/control/BaseIntentService;->mContext:Landroid/content/Context;

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_4

    .line 10
    .line 11
    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    goto/16 :goto_4

    .line 22
    .line 23
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    const-string v2, "onHandleIntent,action="

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    const/4 v2, 0x0

    .line 41
    new-array v3, v2, [Ljava/lang/Object;

    .line 42
    .line 43
    const-string v4, "BaseIntentService"

    .line 44
    .line 45
    invoke-static {v4, v1, v3}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    :try_start_0
    const-string v1, "org.agoo.android.intent.action.RECEIVE"

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_2

    .line 55
    .line 56
    iget-object v0, p0, Lorg/android/agoo/control/BaseIntentService;->mContext:Landroid/content/Context;

    .line 57
    .line 58
    invoke-direct {p0, v0, p1}, Lorg/android/agoo/control/BaseIntentService;->handleRemoteMessage(Landroid/content/Context;Landroid/content/Intent;)V

    .line 59
    .line 60
    .line 61
    goto/16 :goto_2

    .line 62
    .line 63
    :catchall_0
    move-exception p1

    .line 64
    goto/16 :goto_3

    .line 65
    .line 66
    :cond_2
    const-string p1, "org.agoo.android.intent.action.REPORT"

    .line 67
    .line 68
    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 69
    .line 70
    .line 71
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    if-eqz p1, :cond_5

    .line 73
    .line 74
    :try_start_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 77
    .line 78
    .line 79
    const-string v0, "is report cache msg,Config.isReportCacheMsg(mContext)="

    .line 80
    .line 81
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    iget-object v0, p0, Lorg/android/agoo/control/BaseIntentService;->mContext:Landroid/content/Context;

    .line 85
    .line 86
    invoke-static {v0}, Lorg/android/agoo/common/Config;->e(Landroid/content/Context;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    new-array v0, v2, [Ljava/lang/Object;

    .line 98
    .line 99
    invoke-static {v4, p1, v0}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    iget-object p1, p0, Lorg/android/agoo/control/BaseIntentService;->mContext:Landroid/content/Context;

    .line 103
    .line 104
    invoke-static {p1}, Lorg/android/agoo/common/Config;->e(Landroid/content/Context;)Z

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    if-eqz p1, :cond_3

    .line 109
    .line 110
    iget-object p1, p0, Lorg/android/agoo/control/BaseIntentService;->mContext:Landroid/content/Context;

    .line 111
    .line 112
    invoke-static {p1}, Lcom/taobao/accs/utl/AdapterUtilityImpl;->isNetworkConnected(Landroid/content/Context;)Z

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    if-eqz p1, :cond_3

    .line 117
    .line 118
    iget-object p1, p0, Lorg/android/agoo/control/BaseIntentService;->mContext:Landroid/content/Context;

    .line 119
    .line 120
    invoke-static {p1}, Lorg/android/agoo/common/Config;->f(Landroid/content/Context;)V

    .line 121
    .line 122
    .line 123
    iget-object p1, p0, Lorg/android/agoo/control/BaseIntentService;->agooFactory:Lorg/android/agoo/control/AgooFactory;

    .line 124
    .line 125
    invoke-virtual {p1}, Lorg/android/agoo/control/AgooFactory;->reportCacheMsg()V

    .line 126
    .line 127
    .line 128
    iget-object p1, p0, Lorg/android/agoo/control/BaseIntentService;->messageService:Lorg/android/agoo/message/MessageService;

    .line 129
    .line 130
    invoke-virtual {p1}, Lorg/android/agoo/message/MessageService;->deleteCacheMessage()V

    .line 131
    .line 132
    .line 133
    goto :goto_0

    .line 134
    :catchall_1
    move-exception p1

    .line 135
    goto :goto_1

    .line 136
    :cond_3
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 137
    .line 138
    .line 139
    move-result-wide v0

    .line 140
    sget-object p1, Lcom/taobao/accs/utl/ALog$Level;->I:Lcom/taobao/accs/utl/ALog$Level;

    .line 141
    .line 142
    invoke-static {p1}, Lcom/taobao/accs/utl/ALog;->isPrintLog(Lcom/taobao/accs/utl/ALog$Level;)Z

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    if-eqz p1, :cond_4

    .line 147
    .line 148
    new-instance p1, Ljava/lang/StringBuilder;

    .line 149
    .line 150
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 151
    .line 152
    .line 153
    const-string v3, "is clear all msg="

    .line 154
    .line 155
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    iget-object v3, p0, Lorg/android/agoo/control/BaseIntentService;->mContext:Landroid/content/Context;

    .line 159
    .line 160
    invoke-static {v3, v0, v1}, Lorg/android/agoo/common/Config;->b(Landroid/content/Context;J)Z

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    new-array v3, v2, [Ljava/lang/Object;

    .line 172
    .line 173
    invoke-static {v4, p1, v3}, Lcom/taobao/accs/utl/ALog;->i(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    :cond_4
    iget-object p1, p0, Lorg/android/agoo/control/BaseIntentService;->mContext:Landroid/content/Context;

    .line 177
    .line 178
    invoke-static {p1, v0, v1}, Lorg/android/agoo/common/Config;->b(Landroid/content/Context;J)Z

    .line 179
    .line 180
    .line 181
    move-result p1

    .line 182
    if-eqz p1, :cond_5

    .line 183
    .line 184
    iget-object p1, p0, Lorg/android/agoo/control/BaseIntentService;->mContext:Landroid/content/Context;

    .line 185
    .line 186
    invoke-static {p1, v0, v1}, Lorg/android/agoo/common/Config;->a(Landroid/content/Context;J)V

    .line 187
    .line 188
    .line 189
    iget-object p1, p0, Lorg/android/agoo/control/BaseIntentService;->messageService:Lorg/android/agoo/message/MessageService;

    .line 190
    .line 191
    invoke-virtual {p1}, Lorg/android/agoo/message/MessageService;->deleteCacheMessage()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 192
    .line 193
    .line 194
    goto :goto_2

    .line 195
    :goto_1
    :try_start_2
    const-string v0, "reportCacheMsg"

    .line 196
    .line 197
    new-array v1, v2, [Ljava/lang/Object;

    .line 198
    .line 199
    invoke-static {v4, v0, p1, v1}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 200
    .line 201
    .line 202
    :cond_5
    :goto_2
    sget-object p1, Lcom/taobao/accs/client/AdapterGlobalClientInfo;->mStartServiceTimes:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 203
    .line 204
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 205
    .line 206
    .line 207
    goto :goto_4

    .line 208
    :goto_3
    :try_start_3
    sget-object v0, Lcom/taobao/accs/utl/ALog$Level;->E:Lcom/taobao/accs/utl/ALog$Level;

    .line 209
    .line 210
    invoke-static {v0}, Lcom/taobao/accs/utl/ALog;->isPrintLog(Lcom/taobao/accs/utl/ALog$Level;)Z

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    if-eqz v0, :cond_5

    .line 215
    .line 216
    const-string v0, "onHandleIntent deal error"

    .line 217
    .line 218
    new-array v1, v2, [Ljava/lang/Object;

    .line 219
    .line 220
    invoke-static {v4, v0, p1, v1}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 221
    .line 222
    .line 223
    goto :goto_2

    .line 224
    :catchall_2
    move-exception p1

    .line 225
    goto :goto_5

    .line 226
    :goto_4
    return-void

    .line 227
    :goto_5
    sget-object v0, Lcom/taobao/accs/client/AdapterGlobalClientInfo;->mStartServiceTimes:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 228
    .line 229
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 230
    .line 231
    .line 232
    throw p1
.end method

.method public abstract onMessage(Landroid/content/Context;Landroid/content/Intent;)V
.end method

.method public abstract onRegistered(Landroid/content/Context;Ljava/lang/String;)V
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 0

    .line 1
    new-instance p2, Lorg/android/agoo/control/l;

    .line 2
    .line 3
    invoke-direct {p2, p0, p1}, Lorg/android/agoo/control/l;-><init>(Lorg/android/agoo/control/BaseIntentService;Landroid/content/Intent;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p2}, Lcom/taobao/accs/common/ThreadPoolExecutorFactory;->execute(Ljava/lang/Runnable;)V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    return p1
.end method
