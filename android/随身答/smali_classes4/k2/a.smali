.class public abstract Lk2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Z = false

.field public static b:Lm2/f;

.field public static c:Z

.field public static d:Ljava/lang/Object;

.field public static e:Ljava/lang/String;

.field public static f:Ljava/lang/String;

.field public static g:Z

.field public static h:Z

.field public static i:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lm2/f;

    .line 2
    .line 3
    invoke-direct {v0}, Lm2/f;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lk2/a;->b:Lm2/f;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    sput-boolean v0, Lk2/a;->c:Z

    .line 10
    .line 11
    new-instance v1, Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    sput-object v1, Lk2/a;->d:Ljava/lang/Object;

    .line 17
    .line 18
    const-string v1, ""

    .line 19
    .line 20
    sput-object v1, Lk2/a;->e:Ljava/lang/String;

    .line 21
    .line 22
    sput-object v1, Lk2/a;->f:Ljava/lang/String;

    .line 23
    .line 24
    sput-boolean v0, Lk2/a;->g:Z

    .line 25
    .line 26
    sput-boolean v0, Lk2/a;->h:Z

    .line 27
    .line 28
    new-instance v0, Ljava/lang/Object;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    sput-object v0, Lk2/a;->i:Ljava/lang/Object;

    .line 34
    .line 35
    return-void
.end method

.method public static a(Ljava/lang/Class;)Z
    .locals 1

    .line 1
    :try_start_0
    const-string v0, "isZyb"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 4
    .line 5
    .line 6
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :catchall_0
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/Class;
    .locals 0

    .line 1
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p0

    .line 6
    :catch_0
    const/4 p0, 0x0

    .line 7
    return-object p0
.end method

.method public static c()Z
    .locals 2

    .line 1
    sget-object v0, Lk2/a;->i:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-boolean v1, Lk2/a;->h:Z

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw v1
.end method

.method public static d(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    :try_start_0
    sget-boolean v2, Lk2/a;->a:Z

    .line 4
    .line 5
    if-eqz v2, :cond_0

    .line 6
    .line 7
    const-string v2, "UMConfigure"

    .line 8
    .line 9
    const-string v3, "common version is 9.3.7"

    .line 10
    .line 11
    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    const-string v2, "UMConfigure"

    .line 15
    .line 16
    new-instance v3, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v4, "common type is "

    .line 22
    .line 23
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    sget v4, Lu2/b;->a:I

    .line 27
    .line 28
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception p1

    .line 40
    goto/16 :goto_4

    .line 41
    .line 42
    :catch_0
    move-exception p1

    .line 43
    goto/16 :goto_5

    .line 44
    .line 45
    :cond_0
    :goto_0
    if-nez p0, :cond_1

    .line 46
    .line 47
    sget-boolean p1, Lk2/a;->a:Z

    .line 48
    .line 49
    if-eqz p1, :cond_1f

    .line 50
    .line 51
    const-string p1, "UMConfigure"

    .line 52
    .line 53
    const-string p2, "context is null !!!"

    .line 54
    .line 55
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_1
    sget-boolean v2, Lk2/a;->g:Z

    .line 60
    .line 61
    if-eqz v2, :cond_2

    .line 62
    .line 63
    sget-boolean p1, Lk2/a;->a:Z

    .line 64
    .line 65
    if-eqz p1, :cond_1f

    .line 66
    .line 67
    const-string p1, "UMConfigure"

    .line 68
    .line 69
    const-string p2, "has inited !!!"

    .line 70
    .line 71
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_2
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 76
    .line 77
    .line 78
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    :try_start_1
    const-string v3, "com.umeng.umzid.ZIDManager"

    .line 80
    .line 81
    invoke-static {v3}, Lk2/a;->b(Ljava/lang/String;)Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    if-nez v3, :cond_3

    .line 86
    .line 87
    const-string v3, "UMConfigure"

    .line 88
    .line 89
    const-string v4, "--->>> SDK \u521d\u59cb\u5316\u5931\u8d25\uff0c\u8bf7\u68c0\u67e5\u662f\u5426\u96c6\u6210umeng-asms-1.2.x.aar\u5e93\u3002<<<--- "

    .line 90
    .line 91
    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 92
    .line 93
    .line 94
    new-instance v3, Lk2/a$a;

    .line 95
    .line 96
    invoke-direct {v3, v2}, Lk2/a$a;-><init>(Landroid/content/Context;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v3}, Ljava/lang/Thread;->start()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :catchall_1
    :cond_3
    :try_start_2
    const-string v3, "com.umeng.message.PushAgent"

    .line 104
    .line 105
    invoke-static {v3}, Lk2/a;->b(Ljava/lang/String;)Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    if-eqz v3, :cond_4

    .line 110
    .line 111
    invoke-static {v3}, Lk2/a;->a(Ljava/lang/Class;)Z

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    if-nez v3, :cond_4

    .line 116
    .line 117
    const-string v3, "UMLog"

    .line 118
    .line 119
    const-string v4, "\u57fa\u7840\u7ec4\u4ef6\u5e939.3.6\u7248\u672c\u4ec5\u652f\u63016.2.0\u53ca\u66f4\u9ad8\u7248\u672c\u63a8\u9001SDK\u30017.1.0\u53ca\u66f4\u9ad8\u7248\u672c\u5206\u4eabSDK\u3002"

    .line 120
    .line 121
    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 122
    .line 123
    .line 124
    new-instance v3, Lk2/a$b;

    .line 125
    .line 126
    invoke-direct {v3, v2}, Lk2/a$b;-><init>(Landroid/content/Context;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v3}, Ljava/lang/Thread;->start()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 130
    .line 131
    .line 132
    :catchall_2
    :cond_4
    :try_start_3
    const-string v3, "com.umeng.socialize.UMShareAPI"

    .line 133
    .line 134
    invoke-static {v3}, Lk2/a;->b(Ljava/lang/String;)Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    if-eqz v3, :cond_5

    .line 139
    .line 140
    invoke-static {v3}, Lk2/a;->a(Ljava/lang/Class;)Z

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    if-nez v3, :cond_5

    .line 145
    .line 146
    const-string v3, "UMLog"

    .line 147
    .line 148
    const-string v4, "\u57fa\u7840\u7ec4\u4ef6\u5e939.3.6\u7248\u672c\u4ec5\u652f\u63016.2.0\u53ca\u66f4\u9ad8\u7248\u672c\u63a8\u9001SDK\u30017.1.0\u53ca\u66f4\u9ad8\u7248\u672c\u5206\u4eabSDK\u3002"

    .line 149
    .line 150
    invoke-static {v3, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 151
    .line 152
    .line 153
    new-instance v3, Lk2/a$c;

    .line 154
    .line 155
    invoke-direct {v3, v2}, Lk2/a$c;-><init>(Landroid/content/Context;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v3}, Ljava/lang/Thread;->start()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 159
    .line 160
    .line 161
    :catchall_3
    :cond_5
    :try_start_4
    invoke-static {}, Lk2/a;->f()Z

    .line 162
    .line 163
    .line 164
    move-result v3

    .line 165
    if-nez v3, :cond_6

    .line 166
    .line 167
    invoke-static {v2, p1, p2}, Lk2/a;->h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    invoke-static {}, Lk2/a;->f()Z

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    if-nez p1, :cond_6

    .line 175
    .line 176
    goto/16 :goto_7

    .line 177
    .line 178
    :cond_6
    sget-object p1, Lk2/a;->e:Ljava/lang/String;

    .line 179
    .line 180
    invoke-static {v2, p1}, Lz2/d;->u(Landroid/content/Context;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    invoke-static {v2}, Lz2/d;->l(Landroid/content/Context;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    sget-object p2, Lk2/a;->e:Ljava/lang/String;

    .line 188
    .line 189
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 190
    .line 191
    .line 192
    move-result p2

    .line 193
    const/4 v3, 0x2

    .line 194
    if-nez p2, :cond_8

    .line 195
    .line 196
    sget-object p2, Lk2/a;->e:Ljava/lang/String;

    .line 197
    .line 198
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result p2

    .line 202
    if-nez p2, :cond_8

    .line 203
    .line 204
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 205
    .line 206
    .line 207
    move-result p2

    .line 208
    if-nez p2, :cond_7

    .line 209
    .line 210
    sget-boolean p2, Lk2/a;->a:Z

    .line 211
    .line 212
    if-eqz p2, :cond_7

    .line 213
    .line 214
    const-string p2, "AppKey\u6539\u53d8!!!"

    .line 215
    .line 216
    const-string v4, ""

    .line 217
    .line 218
    invoke-static {p2, v3, v4}, Lm2/f;->g(Ljava/lang/String;ILjava/lang/String;)V

    .line 219
    .line 220
    .line 221
    :cond_7
    sget-object p2, Lk2/a;->e:Ljava/lang/String;

    .line 222
    .line 223
    invoke-static {v2, p2}, Lz2/d;->w(Landroid/content/Context;Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    :cond_8
    sget-boolean p2, Lk2/a;->a:Z

    .line 227
    .line 228
    if-eqz p2, :cond_9

    .line 229
    .line 230
    const-string p2, "UMConfigure"

    .line 231
    .line 232
    new-instance v4, Ljava/lang/StringBuilder;

    .line 233
    .line 234
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 235
    .line 236
    .line 237
    const-string v5, "current appkey is "

    .line 238
    .line 239
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    sget-object v5, Lk2/a;->e:Ljava/lang/String;

    .line 243
    .line 244
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    const-string v5, ", last appkey is "

    .line 248
    .line 249
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    invoke-static {p2, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 260
    .line 261
    .line 262
    :cond_9
    sget-boolean p1, Lk2/a;->a:Z

    .line 263
    .line 264
    if-eqz p1, :cond_a

    .line 265
    .line 266
    invoke-static {v2}, Lz2/d;->g(Landroid/content/Context;)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    sget-object p2, Lk2/a;->e:Ljava/lang/String;

    .line 271
    .line 272
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 273
    .line 274
    .line 275
    move-result p2

    .line 276
    if-nez p2, :cond_a

    .line 277
    .line 278
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 279
    .line 280
    .line 281
    move-result p2

    .line 282
    if-nez p2, :cond_a

    .line 283
    .line 284
    sget-object p2, Lk2/a;->e:Ljava/lang/String;

    .line 285
    .line 286
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result p2

    .line 290
    if-nez p2, :cond_a

    .line 291
    .line 292
    const-string p2, "@"

    .line 293
    .line 294
    const-string v4, "#"

    .line 295
    .line 296
    filled-new-array {p2, v4}, [Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object p2

    .line 300
    sget-object v4, Lk2/a;->e:Ljava/lang/String;

    .line 301
    .line 302
    filled-new-array {v4, p1}, [Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object p1

    .line 306
    const-string v4, "\u8bf7\u6ce8\u610f\uff1a\u60a8init\u63a5\u53e3\u4e2d\u8bbe\u7f6e\u7684AppKey\u662f@\uff0cmanifest\u4e2d\u8bbe\u7f6e\u7684AppKey\u662f#\uff0cinit\u63a5\u53e3\u8bbe\u7f6e\u7684AppKey\u4f1a\u8986\u76d6manifest\u4e2d\u8bbe\u7f6e\u7684AppKey"

    .line 307
    .line 308
    const-string v5, ""

    .line 309
    .line 310
    const/4 v6, 0x3

    .line 311
    invoke-static {v4, v6, v5, p2, p1}, Lm2/f;->h(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    :cond_a
    sget-object p1, Lk2/a;->f:Ljava/lang/String;

    .line 315
    .line 316
    invoke-static {v2, p1}, Lz2/d;->v(Landroid/content/Context;Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    sget-boolean p1, Lk2/a;->a:Z

    .line 320
    .line 321
    if-eqz p1, :cond_b

    .line 322
    .line 323
    const-string p1, "UMConfigure"

    .line 324
    .line 325
    new-instance p2, Ljava/lang/StringBuilder;

    .line 326
    .line 327
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 328
    .line 329
    .line 330
    const-string v4, "channel is "

    .line 331
    .line 332
    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    sget-object v4, Lk2/a;->f:Ljava/lang/String;

    .line 336
    .line 337
    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object p2

    .line 344
    invoke-static {p1, p2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 345
    .line 346
    .line 347
    :cond_b
    :try_start_5
    const-class p1, Lcom/umeng/analytics/MobclickAgent;

    .line 348
    .line 349
    const-string p2, "init"

    .line 350
    .line 351
    const-class v4, Landroid/content/Context;

    .line 352
    .line 353
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    move-result-object v4

    .line 357
    invoke-virtual {p1, p2, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 358
    .line 359
    .line 360
    move-result-object p2

    .line 361
    if-eqz p2, :cond_d

    .line 362
    .line 363
    invoke-virtual {p2, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 364
    .line 365
    .line 366
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v4

    .line 370
    invoke-virtual {p2, p1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    const-string p2, "header_first_resume"

    .line 374
    .line 375
    invoke-static {p2}, Lcom/umeng/commonsdk/config/a;->e(Ljava/lang/String;)Z

    .line 376
    .line 377
    .line 378
    move-result p2

    .line 379
    if-eqz p2, :cond_c

    .line 380
    .line 381
    const-string p2, "MobclickRT"

    .line 382
    .line 383
    const-string v4, "--->>> FirstResumeTrigger enabled."

    .line 384
    .line 385
    invoke-static {p2, v4}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 386
    .line 387
    .line 388
    invoke-static {v2}, Lcom/umeng/analytics/pro/d;->b(Landroid/content/Context;)Lcom/umeng/analytics/pro/d;

    .line 389
    .line 390
    .line 391
    move-result-object p2

    .line 392
    invoke-virtual {p2, v2}, Lcom/umeng/analytics/pro/d;->k(Landroid/content/Context;)V

    .line 393
    .line 394
    .line 395
    goto :goto_1

    .line 396
    :cond_c
    const-string p2, "MobclickRT"

    .line 397
    .line 398
    const-string v4, "--->>> FirstResumeTrigger disabled."

    .line 399
    .line 400
    invoke-static {p2, v4}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    :goto_1
    sget-boolean p2, Lk2/a;->a:Z

    .line 404
    .line 405
    if-eqz p2, :cond_d

    .line 406
    .line 407
    const-string p2, "\u7edf\u8ba1SDK\u521d\u59cb\u5316\u6210\u529f"

    .line 408
    .line 409
    const-string v4, ""

    .line 410
    .line 411
    invoke-static {p2, v3, v4}, Lm2/f;->g(Ljava/lang/String;ILjava/lang/String;)V

    .line 412
    .line 413
    .line 414
    :cond_d
    const-string p2, "com.umeng.analytics.game.UMGameAgent"

    .line 415
    .line 416
    invoke-static {p2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 417
    .line 418
    .line 419
    const-string p2, "setGameScenarioType"

    .line 420
    .line 421
    const-class v4, Landroid/content/Context;

    .line 422
    .line 423
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 424
    .line 425
    .line 426
    move-result-object v4

    .line 427
    invoke-virtual {p1, p2, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 428
    .line 429
    .line 430
    move-result-object p2

    .line 431
    if-eqz p2, :cond_e

    .line 432
    .line 433
    invoke-virtual {p2, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 434
    .line 435
    .line 436
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v4

    .line 440
    invoke-virtual {p2, p1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    :cond_e
    sget-object p1, Lu2/e;->e:Ljava/lang/String;

    .line 444
    .line 445
    const-string p2, "e"

    .line 446
    .line 447
    invoke-virtual {p1, p2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 448
    .line 449
    .line 450
    move-result p1

    .line 451
    if-ltz p1, :cond_f

    .line 452
    .line 453
    const-class p1, Lcom/umeng/analytics/MobclickAgent;

    .line 454
    .line 455
    const-string p2, "disableExceptionCatch"

    .line 456
    .line 457
    invoke-virtual {p1, p2, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 458
    .line 459
    .line 460
    move-result-object p2

    .line 461
    if-eqz p2, :cond_f

    .line 462
    .line 463
    invoke-virtual {p2, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 464
    .line 465
    .line 466
    invoke-virtual {p2, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 467
    .line 468
    .line 469
    :catchall_4
    :cond_f
    :try_start_6
    const-string p1, "com.umeng.message.MessageSharedPrefs"

    .line 470
    .line 471
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 472
    .line 473
    .line 474
    move-result-object p1

    .line 475
    const-string p2, "getInstance"

    .line 476
    .line 477
    const-class v4, Landroid/content/Context;

    .line 478
    .line 479
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 480
    .line 481
    .line 482
    move-result-object v4

    .line 483
    invoke-virtual {p1, p2, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 484
    .line 485
    .line 486
    move-result-object p2

    .line 487
    if-eqz p2, :cond_14

    .line 488
    .line 489
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    move-result-object v4

    .line 493
    invoke-virtual {p2, p1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object p2

    .line 497
    if-eqz p2, :cond_14

    .line 498
    .line 499
    const-string v4, "setMessageAppKey"

    .line 500
    .line 501
    const-class v5, Ljava/lang/String;

    .line 502
    .line 503
    filled-new-array {v5}, [Ljava/lang/Class;

    .line 504
    .line 505
    .line 506
    move-result-object v5

    .line 507
    invoke-virtual {p1, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 508
    .line 509
    .line 510
    move-result-object v4

    .line 511
    if-eqz v4, :cond_10

    .line 512
    .line 513
    invoke-virtual {v4, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 514
    .line 515
    .line 516
    sget-object v5, Lk2/a;->e:Ljava/lang/String;

    .line 517
    .line 518
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object v5

    .line 522
    invoke-virtual {v4, p2, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    sget-boolean v4, Lk2/a;->a:Z

    .line 526
    .line 527
    if-eqz v4, :cond_10

    .line 528
    .line 529
    const-string v4, "PUSH AppKey\u8bbe\u7f6e\u6210\u529f"

    .line 530
    .line 531
    const-string v5, ""

    .line 532
    .line 533
    invoke-static {v4, v3, v5}, Lm2/f;->g(Ljava/lang/String;ILjava/lang/String;)V

    .line 534
    .line 535
    .line 536
    :cond_10
    const-string v4, "setMessageChannel"

    .line 537
    .line 538
    const-class v5, Ljava/lang/String;

    .line 539
    .line 540
    filled-new-array {v5}, [Ljava/lang/Class;

    .line 541
    .line 542
    .line 543
    move-result-object v5

    .line 544
    invoke-virtual {p1, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 545
    .line 546
    .line 547
    move-result-object v4

    .line 548
    if-eqz v4, :cond_11

    .line 549
    .line 550
    invoke-virtual {v4, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 551
    .line 552
    .line 553
    sget-object v5, Lk2/a;->f:Ljava/lang/String;

    .line 554
    .line 555
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v5

    .line 559
    invoke-virtual {v4, p2, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 560
    .line 561
    .line 562
    sget-boolean v4, Lk2/a;->a:Z

    .line 563
    .line 564
    if-eqz v4, :cond_11

    .line 565
    .line 566
    const-string v4, "PUSH Channel\u8bbe\u7f6e\u6210\u529f"

    .line 567
    .line 568
    const-string v5, ""

    .line 569
    .line 570
    invoke-static {v4, v3, v5}, Lm2/f;->g(Ljava/lang/String;ILjava/lang/String;)V

    .line 571
    .line 572
    .line 573
    :cond_11
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 574
    .line 575
    .line 576
    move-result v4

    .line 577
    if-eqz v4, :cond_12

    .line 578
    .line 579
    goto :goto_2

    .line 580
    :cond_12
    sget-boolean v4, Lk2/a;->a:Z

    .line 581
    .line 582
    if-eqz v4, :cond_13

    .line 583
    .line 584
    const-string v4, "UMConfigure"

    .line 585
    .line 586
    new-instance v5, Ljava/lang/StringBuilder;

    .line 587
    .line 588
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 589
    .line 590
    .line 591
    const-string v6, "push secret is "

    .line 592
    .line 593
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 594
    .line 595
    .line 596
    invoke-virtual {v5, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 597
    .line 598
    .line 599
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 600
    .line 601
    .line 602
    move-result-object v5

    .line 603
    invoke-static {v4, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 604
    .line 605
    .line 606
    :cond_13
    const-string v4, "setMessageAppSecret"

    .line 607
    .line 608
    const-class v5, Ljava/lang/String;

    .line 609
    .line 610
    filled-new-array {v5}, [Ljava/lang/Class;

    .line 611
    .line 612
    .line 613
    move-result-object v5

    .line 614
    invoke-virtual {p1, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 615
    .line 616
    .line 617
    move-result-object p1

    .line 618
    if-eqz p1, :cond_14

    .line 619
    .line 620
    invoke-virtual {p1, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 621
    .line 622
    .line 623
    filled-new-array {p4}, [Ljava/lang/Object;

    .line 624
    .line 625
    .line 626
    move-result-object v4

    .line 627
    invoke-virtual {p1, p2, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 628
    .line 629
    .line 630
    sget-boolean p1, Lk2/a;->a:Z

    .line 631
    .line 632
    if-eqz p1, :cond_14

    .line 633
    .line 634
    const-string p1, "PUSH Secret\u8bbe\u7f6e\u6210\u529f"

    .line 635
    .line 636
    const-string p2, ""

    .line 637
    .line 638
    invoke-static {p1, v3, p2}, Lm2/f;->g(Ljava/lang/String;ILjava/lang/String;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 639
    .line 640
    .line 641
    :catch_1
    :cond_14
    :goto_2
    :try_start_7
    const-string p1, "com.umeng.socialize.UMShareAPI"

    .line 642
    .line 643
    invoke-static {p1}, Lk2/a;->b(Ljava/lang/String;)Ljava/lang/Class;

    .line 644
    .line 645
    .line 646
    move-result-object p1

    .line 647
    const-string p2, "APPKEY"

    .line 648
    .line 649
    sget-object v4, Lk2/a;->e:Ljava/lang/String;

    .line 650
    .line 651
    invoke-static {p1, p2, v4}, Lk2/a;->i(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)V

    .line 652
    .line 653
    .line 654
    if-eqz p1, :cond_15

    .line 655
    .line 656
    const-string p2, "init"

    .line 657
    .line 658
    const-class v4, Landroid/content/Context;

    .line 659
    .line 660
    const-class v5, Ljava/lang/String;

    .line 661
    .line 662
    filled-new-array {v4, v5}, [Ljava/lang/Class;

    .line 663
    .line 664
    .line 665
    move-result-object v4

    .line 666
    invoke-virtual {p1, p2, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 667
    .line 668
    .line 669
    move-result-object p2

    .line 670
    if-eqz p2, :cond_15

    .line 671
    .line 672
    invoke-virtual {p2, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 673
    .line 674
    .line 675
    sget-object v4, Lk2/a;->e:Ljava/lang/String;

    .line 676
    .line 677
    filled-new-array {v2, v4}, [Ljava/lang/Object;

    .line 678
    .line 679
    .line 680
    move-result-object v4

    .line 681
    invoke-virtual {p2, p1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 682
    .line 683
    .line 684
    sget-boolean p1, Lk2/a;->a:Z

    .line 685
    .line 686
    if-eqz p1, :cond_15

    .line 687
    .line 688
    const-string p1, "Share AppKey\u8bbe\u7f6e\u6210\u529f"

    .line 689
    .line 690
    const-string p2, ""

    .line 691
    .line 692
    invoke-static {p1, v3, p2}, Lm2/f;->g(Ljava/lang/String;ILjava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 693
    .line 694
    .line 695
    :catchall_5
    :cond_15
    :try_start_8
    invoke-static {p3}, Lu2/a;->b(I)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 696
    .line 697
    .line 698
    :try_start_9
    const-string p1, "com.umeng.error.UMError"

    .line 699
    .line 700
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 701
    .line 702
    .line 703
    move-result-object p1

    .line 704
    const-string p2, "init"

    .line 705
    .line 706
    const-class v4, Landroid/content/Context;

    .line 707
    .line 708
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 709
    .line 710
    .line 711
    move-result-object v4

    .line 712
    invoke-virtual {p1, p2, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 713
    .line 714
    .line 715
    move-result-object p2

    .line 716
    if-eqz p2, :cond_16

    .line 717
    .line 718
    invoke-virtual {p2, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 719
    .line 720
    .line 721
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 722
    .line 723
    .line 724
    move-result-object v4

    .line 725
    invoke-virtual {p2, p1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 726
    .line 727
    .line 728
    sget-boolean p1, Lk2/a;->a:Z

    .line 729
    .line 730
    if-eqz p1, :cond_16

    .line 731
    .line 732
    const-string p1, "\u9519\u8bef\u5206\u6790SDK\u521d\u59cb\u5316\u6210\u529f"

    .line 733
    .line 734
    const-string p2, ""

    .line 735
    .line 736
    invoke-static {p1, v3, p2}, Lm2/f;->g(Ljava/lang/String;ILjava/lang/String;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 737
    .line 738
    .line 739
    :catchall_6
    :cond_16
    :try_start_a
    const-class p1, Lb3/a;

    .line 740
    .line 741
    sget-object p2, Lb3/a;->a:Ljava/lang/String;

    .line 742
    .line 743
    sget p2, Lu2/b;->a:I

    .line 744
    .line 745
    if-ne p2, v1, :cond_17

    .line 746
    .line 747
    const-string p2, "useIntlServices"

    .line 748
    .line 749
    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 750
    .line 751
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 752
    .line 753
    .line 754
    move-result-object v4

    .line 755
    invoke-virtual {p1, p2, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 756
    .line 757
    .line 758
    move-result-object p2

    .line 759
    if-eqz p2, :cond_17

    .line 760
    .line 761
    invoke-virtual {p2, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 762
    .line 763
    .line 764
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 765
    .line 766
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 767
    .line 768
    .line 769
    move-result-object v4

    .line 770
    invoke-virtual {p2, p1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 771
    .line 772
    .line 773
    :cond_17
    const-string p2, "init"

    .line 774
    .line 775
    const-class v4, Landroid/content/Context;

    .line 776
    .line 777
    const-class v5, Ljava/lang/String;

    .line 778
    .line 779
    const-class v6, Ljava/lang/String;

    .line 780
    .line 781
    filled-new-array {v4, v5, v6}, [Ljava/lang/Class;

    .line 782
    .line 783
    .line 784
    move-result-object v4

    .line 785
    invoke-virtual {p1, p2, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 786
    .line 787
    .line 788
    move-result-object p2

    .line 789
    if-eqz p2, :cond_18

    .line 790
    .line 791
    invoke-virtual {p2, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 792
    .line 793
    .line 794
    sget-object v4, Lk2/a;->e:Ljava/lang/String;

    .line 795
    .line 796
    sget-object v5, Lk2/a;->f:Ljava/lang/String;

    .line 797
    .line 798
    filled-new-array {v2, v4, v5}, [Ljava/lang/Object;

    .line 799
    .line 800
    .line 801
    move-result-object v4

    .line 802
    invoke-virtual {p2, p1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 803
    .line 804
    .line 805
    sget-boolean p1, Lk2/a;->a:Z

    .line 806
    .line 807
    if-eqz p1, :cond_18

    .line 808
    .line 809
    const-string p1, "APM SDK\u521d\u59cb\u5316\u6210\u529f"

    .line 810
    .line 811
    const-string p2, ""

    .line 812
    .line 813
    invoke-static {p1, v3, p2}, Lm2/f;->g(Ljava/lang/String;ILjava/lang/String;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 814
    .line 815
    .line 816
    :catchall_7
    :cond_18
    :try_start_b
    const-string p1, "com.umeng.vt.facade.EventFacade"

    .line 817
    .line 818
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 819
    .line 820
    .line 821
    move-result-object p1

    .line 822
    const-string p2, "init"

    .line 823
    .line 824
    const-class v3, Landroid/app/Application;

    .line 825
    .line 826
    const-class v4, Ljava/lang/String;

    .line 827
    .line 828
    const-class v5, Ljava/lang/String;

    .line 829
    .line 830
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 831
    .line 832
    const-class v7, Ljava/lang/String;

    .line 833
    .line 834
    filled-new-array {v3, v4, v5, v6, v7}, [Ljava/lang/Class;

    .line 835
    .line 836
    .line 837
    move-result-object v3

    .line 838
    invoke-virtual {p1, p2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 839
    .line 840
    .line 841
    move-result-object p1

    .line 842
    if-eqz p1, :cond_19

    .line 843
    .line 844
    sget-object p2, Lk2/a;->e:Ljava/lang/String;

    .line 845
    .line 846
    sget-object v3, Lk2/a;->f:Ljava/lang/String;

    .line 847
    .line 848
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 849
    .line 850
    .line 851
    move-result-object p3

    .line 852
    filled-new-array {v2, p2, v3, p3, p4}, [Ljava/lang/Object;

    .line 853
    .line 854
    .line 855
    move-result-object p2

    .line 856
    invoke-virtual {p1, v0, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 857
    .line 858
    .line 859
    const-string p1, "MobclickRT"

    .line 860
    .line 861
    const-string p2, "--->>>\u521d\u59cb\u5316 EventFacade \u6210\u529f."

    .line 862
    .line 863
    invoke-static {p1, p2}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_b
    .catch Ljava/lang/ClassNotFoundException; {:try_start_b .. :try_end_b} :catch_2
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    .line 864
    .line 865
    .line 866
    :catch_2
    :catchall_8
    :cond_19
    :try_start_c
    const-string p1, "com.umeng.vt.common.VTTracker"

    .line 867
    .line 868
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 869
    .line 870
    .line 871
    move-result-object p1

    .line 872
    const-string p2, "init"

    .line 873
    .line 874
    const-class p3, Landroid/app/Application;

    .line 875
    .line 876
    const-class p4, Ljava/lang/String;

    .line 877
    .line 878
    filled-new-array {p3, p4}, [Ljava/lang/Class;

    .line 879
    .line 880
    .line 881
    move-result-object p3

    .line 882
    invoke-virtual {p1, p2, p3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 883
    .line 884
    .line 885
    move-result-object p1

    .line 886
    if-eqz p1, :cond_1a

    .line 887
    .line 888
    sget-object p2, Lk2/a;->e:Ljava/lang/String;

    .line 889
    .line 890
    filled-new-array {v2, p2}, [Ljava/lang/Object;

    .line 891
    .line 892
    .line 893
    move-result-object p2

    .line 894
    invoke-virtual {p1, v0, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 895
    .line 896
    .line 897
    const-string p1, "MobclickRT"

    .line 898
    .line 899
    const-string p2, "--->>>\u521d\u59cb\u5316 VTTracker \u6210\u529f."

    .line 900
    .line 901
    invoke-static {p1, p2}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_c
    .catch Ljava/lang/ClassNotFoundException; {:try_start_c .. :try_end_c} :catch_3
    .catchall {:try_start_c .. :try_end_c} :catchall_9

    .line 902
    .line 903
    .line 904
    :catch_3
    :catchall_9
    :cond_1a
    :try_start_d
    sget-object p1, Lk2/a;->i:Ljava/lang/Object;

    .line 905
    .line 906
    monitor-enter p1
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_0
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    .line 907
    :try_start_e
    sput-boolean v1, Lk2/a;->h:Z

    .line 908
    .line 909
    monitor-exit p1
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_a

    .line 910
    :try_start_f
    invoke-static {v2}, Lk2/a;->g(Landroid/content/Context;)Z

    .line 911
    .line 912
    .line 913
    move-result p1

    .line 914
    if-eqz p1, :cond_1b

    .line 915
    .line 916
    const-string p1, "MobclickRT"

    .line 917
    .line 918
    const-string p2, "--->>> \u8d70\u96f6\u53f7\u62a5\u6587\u53d1\u9001\u903b\u8f91"

    .line 919
    .line 920
    invoke-static {p1, p2}, Lm2/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 921
    .line 922
    .line 923
    invoke-static {v2}, Lo2/b;->a(Landroid/content/Context;)Lo2/b;

    .line 924
    .line 925
    .line 926
    move-result-object p1

    .line 927
    invoke-virtual {p1}, Lo2/b;->b()Lo2/c;

    .line 928
    .line 929
    .line 930
    move-result-object p1

    .line 931
    const p2, 0x800d

    .line 932
    .line 933
    .line 934
    invoke-static {v2, p2, p1, v0}, Ln2/c;->m(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;)V

    .line 935
    .line 936
    .line 937
    goto :goto_3

    .line 938
    :cond_1b
    const-string p1, "MobclickRT"

    .line 939
    .line 940
    const-string p2, "--->>> \u8d70\u6b63\u5e38\u903b\u8f91."

    .line 941
    .line 942
    invoke-static {p1, p2}, Lm2/h;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 943
    .line 944
    .line 945
    invoke-static {}, Lcom/umeng/commonsdk/config/a;->f()Z

    .line 946
    .line 947
    .line 948
    move-result p1

    .line 949
    if-eqz p1, :cond_1c

    .line 950
    .line 951
    invoke-static {v2}, Lo2/b;->a(Landroid/content/Context;)Lo2/b;

    .line 952
    .line 953
    .line 954
    move-result-object p1

    .line 955
    invoke-virtual {p1}, Lo2/b;->b()Lo2/c;

    .line 956
    .line 957
    .line 958
    move-result-object p1

    .line 959
    const p2, 0x8017

    .line 960
    .line 961
    .line 962
    invoke-static {v2, p2, p1, v0}, Ln2/c;->m(Landroid/content/Context;ILcom/umeng/commonsdk/framework/UMLogDataProtocol;Ljava/lang/Object;)V

    .line 963
    .line 964
    .line 965
    :cond_1c
    :goto_3
    invoke-static {}, Lk2/a;->e()Z

    .line 966
    .line 967
    .line 968
    move-result p1

    .line 969
    if-eqz p1, :cond_1d

    .line 970
    .line 971
    invoke-static {v2}, Lk2/c;->a(Landroid/content/Context;)V
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_0
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    .line 972
    .line 973
    .line 974
    goto :goto_6

    .line 975
    :catchall_a
    move-exception p2

    .line 976
    :try_start_10
    monitor-exit p1
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_a

    .line 977
    :try_start_11
    throw p2
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_0
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    .line 978
    :goto_4
    sget-boolean p2, Lk2/a;->a:Z

    .line 979
    .line 980
    if-eqz p2, :cond_1d

    .line 981
    .line 982
    const-string p2, "UMConfigure"

    .line 983
    .line 984
    new-instance p3, Ljava/lang/StringBuilder;

    .line 985
    .line 986
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 987
    .line 988
    .line 989
    const-string p4, "init e is "

    .line 990
    .line 991
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 992
    .line 993
    .line 994
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 995
    .line 996
    .line 997
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 998
    .line 999
    .line 1000
    move-result-object p1

    .line 1001
    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1002
    .line 1003
    .line 1004
    goto :goto_6

    .line 1005
    :goto_5
    sget-boolean p2, Lk2/a;->a:Z

    .line 1006
    .line 1007
    if-eqz p2, :cond_1d

    .line 1008
    .line 1009
    const-string p2, "UMConfigure"

    .line 1010
    .line 1011
    new-instance p3, Ljava/lang/StringBuilder;

    .line 1012
    .line 1013
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 1014
    .line 1015
    .line 1016
    const-string p4, "init e is "

    .line 1017
    .line 1018
    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1019
    .line 1020
    .line 1021
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1022
    .line 1023
    .line 1024
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1025
    .line 1026
    .line 1027
    move-result-object p1

    .line 1028
    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1029
    .line 1030
    .line 1031
    :cond_1d
    :goto_6
    :try_start_12
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 1032
    .line 1033
    .line 1034
    move-result-object p0

    .line 1035
    const-string p1, "com.umeng.cconfig.UMRemoteConfig"

    .line 1036
    .line 1037
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 1038
    .line 1039
    .line 1040
    move-result-object p1

    .line 1041
    const-string p2, "getInstance"

    .line 1042
    .line 1043
    invoke-virtual {p1, p2, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 1044
    .line 1045
    .line 1046
    move-result-object p2

    .line 1047
    if-eqz p2, :cond_1e

    .line 1048
    .line 1049
    invoke-virtual {p2, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1050
    .line 1051
    .line 1052
    move-result-object p2

    .line 1053
    if-eqz p2, :cond_1e

    .line 1054
    .line 1055
    const-string p3, "init"

    .line 1056
    .line 1057
    const-class p4, Landroid/content/Context;

    .line 1058
    .line 1059
    filled-new-array {p4}, [Ljava/lang/Class;

    .line 1060
    .line 1061
    .line 1062
    move-result-object p4

    .line 1063
    invoke-virtual {p1, p3, p4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 1064
    .line 1065
    .line 1066
    move-result-object p1

    .line 1067
    if-eqz p1, :cond_1e

    .line 1068
    .line 1069
    invoke-virtual {p1, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1070
    .line 1071
    .line 1072
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 1073
    .line 1074
    .line 1075
    move-result-object p0

    .line 1076
    invoke-virtual {p1, p2, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_4

    .line 1077
    .line 1078
    .line 1079
    :catch_4
    :cond_1e
    sget-boolean p0, Lk2/a;->g:Z

    .line 1080
    .line 1081
    if-nez p0, :cond_1f

    .line 1082
    .line 1083
    sput-boolean v1, Lk2/a;->g:Z

    .line 1084
    .line 1085
    :cond_1f
    :goto_7
    return-void
.end method

.method public static e()Z
    .locals 1

    .line 1
    sget-boolean v0, Lk2/a;->a:Z

    .line 2
    .line 3
    return v0
.end method

.method public static f()Z
    .locals 2

    .line 1
    sget-object v0, Lk2/a;->d:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-boolean v1, Lk2/a;->c:Z

    .line 5
    .line 6
    monitor-exit v0

    .line 7
    return v1

    .line 8
    :catchall_0
    move-exception v1

    .line 9
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    throw v1
.end method

.method public static g(Landroid/content/Context;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance v0, Ljava/io/File;

    .line 6
    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    sget-object p0, Ljava/io/File;->separator:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string p0, "umeng_zcfg_flag"

    .line 25
    .line 26
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    if-eqz p0, :cond_0

    .line 41
    .line 42
    const/4 p0, 0x0

    .line 43
    return p0

    .line 44
    :cond_0
    const/4 p0, 0x1

    .line 45
    return p0
.end method

.method public static h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-boolean p0, Lk2/a;->a:Z

    .line 4
    .line 5
    if-eqz p0, :cond_4

    .line 6
    .line 7
    const-string p0, "UMConfigure"

    .line 8
    .line 9
    const-string p1, "preInit: context is null, pls check!"

    .line 10
    .line 11
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-static {p0}, Lz2/d;->g(Landroid/content/Context;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    :cond_1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    invoke-static {p0}, Lz2/d;->i(Landroid/content/Context;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    :cond_2
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    const-string p2, "Unknown"

    .line 46
    .line 47
    :cond_3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_5

    .line 52
    .line 53
    :cond_4
    return-void

    .line 54
    :cond_5
    sput-object p1, Lk2/a;->e:Ljava/lang/String;

    .line 55
    .line 56
    sput-object p2, Lk2/a;->f:Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {p0}, Ls2/a;->e(Landroid/content/Context;)Ls2/a;

    .line 59
    .line 60
    .line 61
    invoke-static {p0}, Lcom/umeng/analytics/pro/d;->b(Landroid/content/Context;)Lcom/umeng/analytics/pro/d;

    .line 62
    .line 63
    .line 64
    invoke-static {p0}, Lk2/a;->g(Landroid/content/Context;)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-nez p1, :cond_6

    .line 69
    .line 70
    invoke-static {}, Lcom/umeng/commonsdk/config/a;->b()Lcom/umeng/commonsdk/config/a;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p1, p0}, Lcom/umeng/commonsdk/config/a;->c(Landroid/content/Context;)V

    .line 75
    .line 76
    .line 77
    :cond_6
    sget-object p0, Lk2/a;->d:Ljava/lang/Object;

    .line 78
    .line 79
    monitor-enter p0

    .line 80
    const/4 p1, 0x1

    .line 81
    :try_start_0
    sput-boolean p1, Lk2/a;->c:Z

    .line 82
    .line 83
    monitor-exit p0

    .line 84
    return-void

    .line 85
    :catchall_0
    move-exception p1

    .line 86
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    throw p1
.end method

.method public static i(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0, p1, p2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    .line 10
    :catch_0
    :cond_0
    return-void
.end method

.method public static j(Z)V
    .locals 0

    .line 1
    sput-boolean p0, Lu2/a;->a:Z

    .line 2
    .line 3
    return-void
.end method
