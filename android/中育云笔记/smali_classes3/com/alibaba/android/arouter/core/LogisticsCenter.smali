.class public Lcom/alibaba/android/arouter/core/LogisticsCenter;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static executor:Ljava/util/concurrent/ThreadPoolExecutor;

.field private static mContext:Landroid/content/Context;

.field private static registerByPlugin:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static declared-synchronized addRouteGroupDynamic(Ljava/lang/String;Lcom/alibaba/android/arouter/facade/template/IRouteGroup;)V
    .locals 3

    .line 1
    const-class v0, Lcom/alibaba/android/arouter/core/LogisticsCenter;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/alibaba/android/arouter/core/Warehouse;->groupsIndex:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {v1, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    sget-object v1, Lcom/alibaba/android/arouter/core/Warehouse;->groupsIndex:Ljava/util/Map;

    .line 13
    .line 14
    invoke-interface {v1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ljava/lang/Class;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Lcom/alibaba/android/arouter/facade/template/IRouteGroup;

    .line 30
    .line 31
    sget-object v2, Lcom/alibaba/android/arouter/core/Warehouse;->routes:Ljava/util/Map;

    .line 32
    .line 33
    invoke-interface {v1, v2}, Lcom/alibaba/android/arouter/facade/template/IRouteGroup;->loadInto(Ljava/util/Map;)V

    .line 34
    .line 35
    .line 36
    sget-object v1, Lcom/alibaba/android/arouter/core/Warehouse;->groupsIndex:Ljava/util/Map;

    .line 37
    .line 38
    invoke-interface {v1, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception p0

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    :goto_0
    if-eqz p1, :cond_1

    .line 45
    .line 46
    sget-object p0, Lcom/alibaba/android/arouter/core/Warehouse;->routes:Ljava/util/Map;

    .line 47
    .line 48
    invoke-interface {p1, p0}, Lcom/alibaba/android/arouter/facade/template/IRouteGroup;->loadInto(Ljava/util/Map;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    .line 51
    :cond_1
    monitor-exit v0

    .line 52
    return-void

    .line 53
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    throw p0
.end method

.method public static buildProvider(Ljava/lang/String;)Lcom/alibaba/android/arouter/facade/Postcard;
    .locals 2

    .line 1
    sget-object v0, Lcom/alibaba/android/arouter/core/Warehouse;->providersIndex:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/alibaba/android/arouter/facade/model/RouteMeta;

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0

    .line 13
    :cond_0
    new-instance v0, Lcom/alibaba/android/arouter/facade/Postcard;

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/alibaba/android/arouter/facade/model/RouteMeta;->getPath()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {p0}, Lcom/alibaba/android/arouter/facade/model/RouteMeta;->getGroup()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-direct {v0, v1, p0}, Lcom/alibaba/android/arouter/facade/Postcard;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method

.method public static declared-synchronized completion(Lcom/alibaba/android/arouter/facade/Postcard;)V
    .locals 10

    .line 1
    const-class v0, Lcom/alibaba/android/arouter/core/LogisticsCenter;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    if-eqz p0, :cond_a

    .line 5
    .line 6
    :try_start_0
    sget-object v1, Lcom/alibaba/android/arouter/core/Warehouse;->routes:Ljava/util/Map;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/alibaba/android/arouter/facade/model/RouteMeta;->getPath()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lcom/alibaba/android/arouter/facade/model/RouteMeta;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    if-nez v1, :cond_3

    .line 20
    .line 21
    sget-object v1, Lcom/alibaba/android/arouter/core/Warehouse;->groupsIndex:Ljava/util/Map;

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/alibaba/android/arouter/facade/model/RouteMeta;->getGroup()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-interface {v1, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    :try_start_1
    invoke-static {}, Lcom/alibaba/android/arouter/launcher/ARouter;->debuggable()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_0

    .line 38
    .line 39
    sget-object v1, Lcom/alibaba/android/arouter/launcher/ARouter;->logger:Lcom/alibaba/android/arouter/facade/template/ILogger;

    .line 40
    .line 41
    const-string v3, "ARouter::"

    .line 42
    .line 43
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    const-string v5, "The group [%s] starts loading, trigger by [%s]"

    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/alibaba/android/arouter/facade/model/RouteMeta;->getGroup()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    invoke-virtual {p0}, Lcom/alibaba/android/arouter/facade/model/RouteMeta;->getPath()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    filled-new-array {v6, v7}, [Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    invoke-static {v4, v5, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-interface {v1, v3, v4}, Lcom/alibaba/android/arouter/facade/template/ILogger;->debug(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :catchall_0
    move-exception p0

    .line 70
    goto/16 :goto_5

    .line 71
    .line 72
    :catch_0
    move-exception p0

    .line 73
    goto :goto_1

    .line 74
    :cond_0
    :goto_0
    invoke-virtual {p0}, Lcom/alibaba/android/arouter/facade/model/RouteMeta;->getGroup()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-static {v1, v2}, Lcom/alibaba/android/arouter/core/LogisticsCenter;->addRouteGroupDynamic(Ljava/lang/String;Lcom/alibaba/android/arouter/facade/template/IRouteGroup;)V

    .line 79
    .line 80
    .line 81
    invoke-static {}, Lcom/alibaba/android/arouter/launcher/ARouter;->debuggable()Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-eqz v1, :cond_1

    .line 86
    .line 87
    sget-object v1, Lcom/alibaba/android/arouter/launcher/ARouter;->logger:Lcom/alibaba/android/arouter/facade/template/ILogger;

    .line 88
    .line 89
    const-string v2, "ARouter::"

    .line 90
    .line 91
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    const-string v4, "The group [%s] has already been loaded, trigger by [%s]"

    .line 96
    .line 97
    invoke-virtual {p0}, Lcom/alibaba/android/arouter/facade/model/RouteMeta;->getGroup()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    invoke-virtual {p0}, Lcom/alibaba/android/arouter/facade/model/RouteMeta;->getPath()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    filled-new-array {v5, v6}, [Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    invoke-static {v3, v4, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    invoke-interface {v1, v2, v3}, Lcom/alibaba/android/arouter/facade/template/ILogger;->debug(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 114
    .line 115
    .line 116
    :cond_1
    :try_start_2
    invoke-static {p0}, Lcom/alibaba/android/arouter/core/LogisticsCenter;->completion(Lcom/alibaba/android/arouter/facade/Postcard;)V

    .line 117
    .line 118
    .line 119
    goto/16 :goto_4

    .line 120
    .line 121
    :goto_1
    new-instance v1, Lcom/alibaba/android/arouter/exception/HandlerException;

    .line 122
    .line 123
    new-instance v2, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 126
    .line 127
    .line 128
    const-string v3, "ARouter::Fatal exception when loading group meta. ["

    .line 129
    .line 130
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    const-string p0, "]"

    .line 141
    .line 142
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    invoke-direct {v1, p0}, Lcom/alibaba/android/arouter/exception/HandlerException;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    throw v1

    .line 153
    :cond_2
    new-instance v1, Lcom/alibaba/android/arouter/exception/NoRouteFoundException;

    .line 154
    .line 155
    new-instance v2, Ljava/lang/StringBuilder;

    .line 156
    .line 157
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 158
    .line 159
    .line 160
    const-string v3, "ARouter::There is no route match the path ["

    .line 161
    .line 162
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0}, Lcom/alibaba/android/arouter/facade/model/RouteMeta;->getPath()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v3

    .line 169
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    const-string v3, "], in group ["

    .line 173
    .line 174
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {p0}, Lcom/alibaba/android/arouter/facade/model/RouteMeta;->getGroup()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    const-string p0, "]"

    .line 185
    .line 186
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object p0

    .line 193
    invoke-direct {v1, p0}, Lcom/alibaba/android/arouter/exception/NoRouteFoundException;-><init>(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    throw v1

    .line 197
    :cond_3
    invoke-virtual {v1}, Lcom/alibaba/android/arouter/facade/model/RouteMeta;->getDestination()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    invoke-virtual {p0, v3}, Lcom/alibaba/android/arouter/facade/model/RouteMeta;->setDestination(Ljava/lang/Class;)Lcom/alibaba/android/arouter/facade/model/RouteMeta;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v1}, Lcom/alibaba/android/arouter/facade/model/RouteMeta;->getType()Lcom/alibaba/android/arouter/facade/enums/RouteType;

    .line 205
    .line 206
    .line 207
    move-result-object v3

    .line 208
    invoke-virtual {p0, v3}, Lcom/alibaba/android/arouter/facade/model/RouteMeta;->setType(Lcom/alibaba/android/arouter/facade/enums/RouteType;)Lcom/alibaba/android/arouter/facade/model/RouteMeta;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v1}, Lcom/alibaba/android/arouter/facade/model/RouteMeta;->getPriority()I

    .line 212
    .line 213
    .line 214
    move-result v3

    .line 215
    invoke-virtual {p0, v3}, Lcom/alibaba/android/arouter/facade/model/RouteMeta;->setPriority(I)Lcom/alibaba/android/arouter/facade/model/RouteMeta;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v1}, Lcom/alibaba/android/arouter/facade/model/RouteMeta;->getExtra()I

    .line 219
    .line 220
    .line 221
    move-result v3

    .line 222
    invoke-virtual {p0, v3}, Lcom/alibaba/android/arouter/facade/model/RouteMeta;->setExtra(I)Lcom/alibaba/android/arouter/facade/model/RouteMeta;

    .line 223
    .line 224
    .line 225
    invoke-virtual {p0}, Lcom/alibaba/android/arouter/facade/Postcard;->getUri()Landroid/net/Uri;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    if-eqz v3, :cond_6

    .line 230
    .line 231
    invoke-static {v3}, Lcom/alibaba/android/arouter/utils/TextUtils;->splitQueryParameters(Landroid/net/Uri;)Ljava/util/Map;

    .line 232
    .line 233
    .line 234
    move-result-object v4

    .line 235
    invoke-virtual {v1}, Lcom/alibaba/android/arouter/facade/model/RouteMeta;->getParamsType()Ljava/util/Map;

    .line 236
    .line 237
    .line 238
    move-result-object v5

    .line 239
    invoke-static {v5}, Lcom/alibaba/android/arouter/utils/MapUtils;->isNotEmpty(Ljava/util/Map;)Z

    .line 240
    .line 241
    .line 242
    move-result v6

    .line 243
    if-eqz v6, :cond_5

    .line 244
    .line 245
    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 246
    .line 247
    .line 248
    move-result-object v6

    .line 249
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 250
    .line 251
    .line 252
    move-result-object v6

    .line 253
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 254
    .line 255
    .line 256
    move-result v7

    .line 257
    if-eqz v7, :cond_4

    .line 258
    .line 259
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v7

    .line 263
    check-cast v7, Ljava/util/Map$Entry;

    .line 264
    .line 265
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v8

    .line 269
    check-cast v8, Ljava/lang/Integer;

    .line 270
    .line 271
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v9

    .line 275
    check-cast v9, Ljava/lang/String;

    .line 276
    .line 277
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v7

    .line 281
    invoke-interface {v4, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v7

    .line 285
    check-cast v7, Ljava/lang/String;

    .line 286
    .line 287
    invoke-static {p0, v8, v9, v7}, Lcom/alibaba/android/arouter/core/LogisticsCenter;->setValue(Lcom/alibaba/android/arouter/facade/Postcard;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    goto :goto_2

    .line 291
    :cond_4
    invoke-virtual {p0}, Lcom/alibaba/android/arouter/facade/Postcard;->getExtras()Landroid/os/Bundle;

    .line 292
    .line 293
    .line 294
    move-result-object v4

    .line 295
    const-string v6, "wmHzgD4lOj5o4241"

    .line 296
    .line 297
    invoke-interface {v5}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 298
    .line 299
    .line 300
    move-result-object v5

    .line 301
    const/4 v7, 0x0

    .line 302
    new-array v7, v7, [Ljava/lang/String;

    .line 303
    .line 304
    invoke-interface {v5, v7}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v5

    .line 308
    check-cast v5, [Ljava/lang/String;

    .line 309
    .line 310
    invoke-virtual {v4, v6, v5}, Landroid/os/BaseBundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    :cond_5
    const-string v4, "NTeRQWvye18AkPd6G"

    .line 314
    .line 315
    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v3

    .line 319
    invoke-virtual {p0, v4, v3}, Lcom/alibaba/android/arouter/facade/Postcard;->withString(Ljava/lang/String;Ljava/lang/String;)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 320
    .line 321
    .line 322
    :cond_6
    sget-object v3, Lcom/alibaba/android/arouter/core/LogisticsCenter$1;->$SwitchMap$com$alibaba$android$arouter$facade$enums$RouteType:[I

    .line 323
    .line 324
    invoke-virtual {v1}, Lcom/alibaba/android/arouter/facade/model/RouteMeta;->getType()Lcom/alibaba/android/arouter/facade/enums/RouteType;

    .line 325
    .line 326
    .line 327
    move-result-object v4

    .line 328
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 329
    .line 330
    .line 331
    move-result v4

    .line 332
    aget v3, v3, v4

    .line 333
    .line 334
    const/4 v4, 0x1

    .line 335
    if-eq v3, v4, :cond_8

    .line 336
    .line 337
    const/4 v1, 0x2

    .line 338
    if-eq v3, v1, :cond_7

    .line 339
    .line 340
    goto :goto_4

    .line 341
    :cond_7
    invoke-virtual {p0}, Lcom/alibaba/android/arouter/facade/Postcard;->greenChannel()Lcom/alibaba/android/arouter/facade/Postcard;

    .line 342
    .line 343
    .line 344
    goto :goto_4

    .line 345
    :cond_8
    invoke-virtual {v1}, Lcom/alibaba/android/arouter/facade/model/RouteMeta;->getDestination()Ljava/lang/Class;

    .line 346
    .line 347
    .line 348
    move-result-object v1

    .line 349
    sget-object v3, Lcom/alibaba/android/arouter/core/Warehouse;->providers:Ljava/util/Map;

    .line 350
    .line 351
    invoke-interface {v3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v3

    .line 355
    check-cast v3, Lcom/alibaba/android/arouter/facade/template/IProvider;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 356
    .line 357
    if-nez v3, :cond_9

    .line 358
    .line 359
    :try_start_3
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 360
    .line 361
    .line 362
    move-result-object v3

    .line 363
    invoke-virtual {v3, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v2

    .line 367
    move-object v3, v2

    .line 368
    check-cast v3, Lcom/alibaba/android/arouter/facade/template/IProvider;

    .line 369
    .line 370
    sget-object v2, Lcom/alibaba/android/arouter/core/LogisticsCenter;->mContext:Landroid/content/Context;

    .line 371
    .line 372
    invoke-interface {v3, v2}, Lcom/alibaba/android/arouter/facade/template/IProvider;->init(Landroid/content/Context;)V

    .line 373
    .line 374
    .line 375
    sget-object v2, Lcom/alibaba/android/arouter/core/Warehouse;->providers:Ljava/util/Map;

    .line 376
    .line 377
    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 378
    .line 379
    .line 380
    goto :goto_3

    .line 381
    :catch_1
    move-exception p0

    .line 382
    :try_start_4
    sget-object v1, Lcom/alibaba/android/arouter/launcher/ARouter;->logger:Lcom/alibaba/android/arouter/facade/template/ILogger;

    .line 383
    .line 384
    const-string v2, "ARouter::"

    .line 385
    .line 386
    const-string v3, "Init provider failed!"

    .line 387
    .line 388
    invoke-interface {v1, v2, v3, p0}, Lcom/alibaba/android/arouter/facade/template/ILogger;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 389
    .line 390
    .line 391
    new-instance p0, Lcom/alibaba/android/arouter/exception/HandlerException;

    .line 392
    .line 393
    const-string v1, "Init provider failed!"

    .line 394
    .line 395
    invoke-direct {p0, v1}, Lcom/alibaba/android/arouter/exception/HandlerException;-><init>(Ljava/lang/String;)V

    .line 396
    .line 397
    .line 398
    throw p0

    .line 399
    :cond_9
    :goto_3
    invoke-virtual {p0, v3}, Lcom/alibaba/android/arouter/facade/Postcard;->setProvider(Lcom/alibaba/android/arouter/facade/template/IProvider;)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 400
    .line 401
    .line 402
    invoke-virtual {p0}, Lcom/alibaba/android/arouter/facade/Postcard;->greenChannel()Lcom/alibaba/android/arouter/facade/Postcard;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 403
    .line 404
    .line 405
    :goto_4
    monitor-exit v0

    .line 406
    return-void

    .line 407
    :cond_a
    :try_start_5
    new-instance p0, Lcom/alibaba/android/arouter/exception/NoRouteFoundException;

    .line 408
    .line 409
    const-string v1, "ARouter::No postcard!"

    .line 410
    .line 411
    invoke-direct {p0, v1}, Lcom/alibaba/android/arouter/exception/NoRouteFoundException;-><init>(Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    throw p0

    .line 415
    :goto_5
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 416
    throw p0
.end method

.method public static declared-synchronized init(Landroid/content/Context;Ljava/util/concurrent/ThreadPoolExecutor;)V
    .locals 7

    .line 1
    const-class v0, Lcom/alibaba/android/arouter/core/LogisticsCenter;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sput-object p0, Lcom/alibaba/android/arouter/core/LogisticsCenter;->mContext:Landroid/content/Context;

    .line 5
    .line 6
    sput-object p1, Lcom/alibaba/android/arouter/core/LogisticsCenter;->executor:Ljava/util/concurrent/ThreadPoolExecutor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    invoke-static {}, Lcom/alibaba/android/arouter/core/LogisticsCenter;->loadRouterMap()V

    .line 13
    .line 14
    .line 15
    sget-boolean p1, Lcom/alibaba/android/arouter/core/LogisticsCenter;->registerByPlugin:Z

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    sget-object p0, Lcom/alibaba/android/arouter/launcher/ARouter;->logger:Lcom/alibaba/android/arouter/facade/template/ILogger;

    .line 20
    .line 21
    const-string p1, "ARouter::"

    .line 22
    .line 23
    const-string v3, "Load router map by arouter-auto-register plugin."

    .line 24
    .line 25
    invoke-interface {p0, p1, v3}, Lcom/alibaba/android/arouter/facade/template/ILogger;->info(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    goto/16 :goto_3

    .line 29
    .line 30
    :catchall_0
    move-exception p0

    .line 31
    goto/16 :goto_5

    .line 32
    .line 33
    :catch_0
    move-exception p0

    .line 34
    goto/16 :goto_4

    .line 35
    .line 36
    :cond_0
    invoke-static {}, Lcom/alibaba/android/arouter/launcher/ARouter;->debuggable()Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    const/4 v3, 0x0

    .line 41
    if-nez p1, :cond_2

    .line 42
    .line 43
    invoke-static {p0}, Lcom/alibaba/android/arouter/utils/PackageUtils;->isNewVersion(Landroid/content/Context;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    sget-object p1, Lcom/alibaba/android/arouter/launcher/ARouter;->logger:Lcom/alibaba/android/arouter/facade/template/ILogger;

    .line 51
    .line 52
    const-string v4, "ARouter::"

    .line 53
    .line 54
    const-string v5, "Load router map from cache."

    .line 55
    .line 56
    invoke-interface {p1, v4, v5}, Lcom/alibaba/android/arouter/facade/template/ILogger;->info(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    new-instance p1, Ljava/util/HashSet;

    .line 60
    .line 61
    const-string v4, "SP_AROUTER_CACHE"

    .line 62
    .line 63
    invoke-virtual {p0, v4, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    const-string v3, "ROUTER_MAP"

    .line 68
    .line 69
    new-instance v4, Ljava/util/HashSet;

    .line 70
    .line 71
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-interface {p0, v3, v4}, Landroid/content/SharedPreferences;->getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-direct {p1, p0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    :goto_0
    sget-object p1, Lcom/alibaba/android/arouter/launcher/ARouter;->logger:Lcom/alibaba/android/arouter/facade/template/ILogger;

    .line 83
    .line 84
    const-string v4, "ARouter::"

    .line 85
    .line 86
    const-string v5, "Run with debug mode or new install, rebuild router map."

    .line 87
    .line 88
    invoke-interface {p1, v4, v5}, Lcom/alibaba/android/arouter/facade/template/ILogger;->info(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    sget-object p1, Lcom/alibaba/android/arouter/core/LogisticsCenter;->mContext:Landroid/content/Context;

    .line 92
    .line 93
    const-string v4, "com.alibaba.android.arouter.routes"

    .line 94
    .line 95
    invoke-static {p1, v4}, Lcom/alibaba/android/arouter/utils/ClassUtils;->getFileNameByPackageName(Landroid/content/Context;Ljava/lang/String;)Ljava/util/Set;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    if-nez v4, :cond_3

    .line 104
    .line 105
    const-string v4, "SP_AROUTER_CACHE"

    .line 106
    .line 107
    invoke-virtual {p0, v4, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    const-string v4, "ROUTER_MAP"

    .line 116
    .line 117
    invoke-interface {v3, v4, p1}, Landroid/content/SharedPreferences$Editor;->putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 122
    .line 123
    .line 124
    :cond_3
    invoke-static {p0}, Lcom/alibaba/android/arouter/utils/PackageUtils;->updateVersion(Landroid/content/Context;)V

    .line 125
    .line 126
    .line 127
    :goto_1
    sget-object p0, Lcom/alibaba/android/arouter/launcher/ARouter;->logger:Lcom/alibaba/android/arouter/facade/template/ILogger;

    .line 128
    .line 129
    const-string v3, "ARouter::"

    .line 130
    .line 131
    new-instance v4, Ljava/lang/StringBuilder;

    .line 132
    .line 133
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 134
    .line 135
    .line 136
    const-string v5, "Find router map finished, map size = "

    .line 137
    .line 138
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-interface {p1}, Ljava/util/Set;->size()I

    .line 142
    .line 143
    .line 144
    move-result v5

    .line 145
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    const-string v5, ", cost "

    .line 149
    .line 150
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 154
    .line 155
    .line 156
    move-result-wide v5

    .line 157
    sub-long/2addr v5, v1

    .line 158
    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    const-string v1, " ms."

    .line 162
    .line 163
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    invoke-interface {p0, v3, v1}, Lcom/alibaba/android/arouter/facade/template/ILogger;->info(Ljava/lang/String;Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 174
    .line 175
    .line 176
    move-result-wide v1

    .line 177
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    :cond_4
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 182
    .line 183
    .line 184
    move-result p1

    .line 185
    if-eqz p1, :cond_7

    .line 186
    .line 187
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    check-cast p1, Ljava/lang/String;

    .line 192
    .line 193
    const-string v3, "com.alibaba.android.arouter.routes.ARouter$$Root"

    .line 194
    .line 195
    invoke-virtual {p1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 196
    .line 197
    .line 198
    move-result v3

    .line 199
    const/4 v4, 0x0

    .line 200
    if-eqz v3, :cond_5

    .line 201
    .line 202
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    invoke-virtual {p1, v4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    invoke-virtual {p1, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    check-cast p1, Lcom/alibaba/android/arouter/facade/template/IRouteRoot;

    .line 215
    .line 216
    sget-object v3, Lcom/alibaba/android/arouter/core/Warehouse;->groupsIndex:Ljava/util/Map;

    .line 217
    .line 218
    invoke-interface {p1, v3}, Lcom/alibaba/android/arouter/facade/template/IRouteRoot;->loadInto(Ljava/util/Map;)V

    .line 219
    .line 220
    .line 221
    goto :goto_2

    .line 222
    :cond_5
    const-string v3, "com.alibaba.android.arouter.routes.ARouter$$Interceptors"

    .line 223
    .line 224
    invoke-virtual {p1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 225
    .line 226
    .line 227
    move-result v3

    .line 228
    if-eqz v3, :cond_6

    .line 229
    .line 230
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    invoke-virtual {p1, v4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    invoke-virtual {p1, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    check-cast p1, Lcom/alibaba/android/arouter/facade/template/IInterceptorGroup;

    .line 243
    .line 244
    sget-object v3, Lcom/alibaba/android/arouter/core/Warehouse;->interceptorsIndex:Ljava/util/Map;

    .line 245
    .line 246
    invoke-interface {p1, v3}, Lcom/alibaba/android/arouter/facade/template/IInterceptorGroup;->loadInto(Ljava/util/Map;)V

    .line 247
    .line 248
    .line 249
    goto :goto_2

    .line 250
    :cond_6
    const-string v3, "com.alibaba.android.arouter.routes.ARouter$$Providers"

    .line 251
    .line 252
    invoke-virtual {p1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 253
    .line 254
    .line 255
    move-result v3

    .line 256
    if-eqz v3, :cond_4

    .line 257
    .line 258
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    move-result-object p1

    .line 262
    invoke-virtual {p1, v4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    invoke-virtual {p1, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    check-cast p1, Lcom/alibaba/android/arouter/facade/template/IProviderGroup;

    .line 271
    .line 272
    sget-object v3, Lcom/alibaba/android/arouter/core/Warehouse;->providersIndex:Ljava/util/Map;

    .line 273
    .line 274
    invoke-interface {p1, v3}, Lcom/alibaba/android/arouter/facade/template/IProviderGroup;->loadInto(Ljava/util/Map;)V

    .line 275
    .line 276
    .line 277
    goto :goto_2

    .line 278
    :cond_7
    :goto_3
    sget-object p0, Lcom/alibaba/android/arouter/launcher/ARouter;->logger:Lcom/alibaba/android/arouter/facade/template/ILogger;

    .line 279
    .line 280
    const-string p1, "ARouter::"

    .line 281
    .line 282
    new-instance v3, Ljava/lang/StringBuilder;

    .line 283
    .line 284
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 285
    .line 286
    .line 287
    const-string v4, "Load root element finished, cost "

    .line 288
    .line 289
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 293
    .line 294
    .line 295
    move-result-wide v4

    .line 296
    sub-long/2addr v4, v1

    .line 297
    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    const-string v1, " ms."

    .line 301
    .line 302
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v1

    .line 309
    invoke-interface {p0, p1, v1}, Lcom/alibaba/android/arouter/facade/template/ILogger;->info(Ljava/lang/String;Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    sget-object p0, Lcom/alibaba/android/arouter/core/Warehouse;->groupsIndex:Ljava/util/Map;

    .line 313
    .line 314
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 315
    .line 316
    .line 317
    move-result p0

    .line 318
    if-nez p0, :cond_8

    .line 319
    .line 320
    sget-object p0, Lcom/alibaba/android/arouter/launcher/ARouter;->logger:Lcom/alibaba/android/arouter/facade/template/ILogger;

    .line 321
    .line 322
    const-string p1, "ARouter::"

    .line 323
    .line 324
    const-string v1, "No mapping files were found, check your configuration please!"

    .line 325
    .line 326
    invoke-interface {p0, p1, v1}, Lcom/alibaba/android/arouter/facade/template/ILogger;->error(Ljava/lang/String;Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    :cond_8
    invoke-static {}, Lcom/alibaba/android/arouter/launcher/ARouter;->debuggable()Z

    .line 330
    .line 331
    .line 332
    move-result p0

    .line 333
    if-eqz p0, :cond_9

    .line 334
    .line 335
    sget-object p0, Lcom/alibaba/android/arouter/launcher/ARouter;->logger:Lcom/alibaba/android/arouter/facade/template/ILogger;

    .line 336
    .line 337
    const-string p1, "ARouter::"

    .line 338
    .line 339
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 340
    .line 341
    .line 342
    move-result-object v1

    .line 343
    const-string v2, "LogisticsCenter has already been loaded, GroupIndex[%d], InterceptorIndex[%d], ProviderIndex[%d]"

    .line 344
    .line 345
    sget-object v3, Lcom/alibaba/android/arouter/core/Warehouse;->groupsIndex:Ljava/util/Map;

    .line 346
    .line 347
    invoke-interface {v3}, Ljava/util/Map;->size()I

    .line 348
    .line 349
    .line 350
    move-result v3

    .line 351
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 352
    .line 353
    .line 354
    move-result-object v3

    .line 355
    sget-object v4, Lcom/alibaba/android/arouter/core/Warehouse;->interceptorsIndex:Ljava/util/Map;

    .line 356
    .line 357
    invoke-interface {v4}, Ljava/util/Map;->size()I

    .line 358
    .line 359
    .line 360
    move-result v4

    .line 361
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 362
    .line 363
    .line 364
    move-result-object v4

    .line 365
    sget-object v5, Lcom/alibaba/android/arouter/core/Warehouse;->providersIndex:Ljava/util/Map;

    .line 366
    .line 367
    invoke-interface {v5}, Ljava/util/Map;->size()I

    .line 368
    .line 369
    .line 370
    move-result v5

    .line 371
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 372
    .line 373
    .line 374
    move-result-object v5

    .line 375
    filled-new-array {v3, v4, v5}, [Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v3

    .line 379
    invoke-static {v1, v2, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v1

    .line 383
    invoke-interface {p0, p1, v1}, Lcom/alibaba/android/arouter/facade/template/ILogger;->debug(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 384
    .line 385
    .line 386
    :cond_9
    monitor-exit v0

    .line 387
    return-void

    .line 388
    :goto_4
    :try_start_2
    new-instance p1, Lcom/alibaba/android/arouter/exception/HandlerException;

    .line 389
    .line 390
    new-instance v1, Ljava/lang/StringBuilder;

    .line 391
    .line 392
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 393
    .line 394
    .line 395
    const-string v2, "ARouter::ARouter init logistics center exception! ["

    .line 396
    .line 397
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 398
    .line 399
    .line 400
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object p0

    .line 404
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 405
    .line 406
    .line 407
    const-string p0, "]"

    .line 408
    .line 409
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object p0

    .line 416
    invoke-direct {p1, p0}, Lcom/alibaba/android/arouter/exception/HandlerException;-><init>(Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    throw p1

    .line 420
    :goto_5
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 421
    throw p0
.end method

.method private static loadRouterMap()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    sput-boolean v0, Lcom/alibaba/android/arouter/core/LogisticsCenter;->registerByPlugin:Z

    .line 3
    .line 4
    return-void
.end method

.method private static markRegisteredByPlugin()V
    .locals 1

    .line 1
    sget-boolean v0, Lcom/alibaba/android/arouter/core/LogisticsCenter;->registerByPlugin:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    sput-boolean v0, Lcom/alibaba/android/arouter/core/LogisticsCenter;->registerByPlugin:Z

    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method private static register(Ljava/lang/String;)V
    .locals 5

    .line 1
    const-string v0, "ARouter::"

    .line 2
    .line 3
    invoke-static {p0}, Lcom/alibaba/android/arouter/utils/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_3

    .line 8
    .line 9
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    instance-of v2, v1, Lcom/alibaba/android/arouter/facade/template/IRouteRoot;

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    check-cast v1, Lcom/alibaba/android/arouter/facade/template/IRouteRoot;

    .line 27
    .line 28
    invoke-static {v1}, Lcom/alibaba/android/arouter/core/LogisticsCenter;->registerRouteRoot(Lcom/alibaba/android/arouter/facade/template/IRouteRoot;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :catch_0
    move-exception v1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    instance-of v2, v1, Lcom/alibaba/android/arouter/facade/template/IProviderGroup;

    .line 35
    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    check-cast v1, Lcom/alibaba/android/arouter/facade/template/IProviderGroup;

    .line 39
    .line 40
    invoke-static {v1}, Lcom/alibaba/android/arouter/core/LogisticsCenter;->registerProvider(Lcom/alibaba/android/arouter/facade/template/IProviderGroup;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    instance-of v2, v1, Lcom/alibaba/android/arouter/facade/template/IInterceptorGroup;

    .line 45
    .line 46
    if-eqz v2, :cond_2

    .line 47
    .line 48
    check-cast v1, Lcom/alibaba/android/arouter/facade/template/IInterceptorGroup;

    .line 49
    .line 50
    invoke-static {v1}, Lcom/alibaba/android/arouter/core/LogisticsCenter;->registerInterceptor(Lcom/alibaba/android/arouter/facade/template/IInterceptorGroup;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_2
    sget-object v1, Lcom/alibaba/android/arouter/launcher/ARouter;->logger:Lcom/alibaba/android/arouter/facade/template/ILogger;

    .line 55
    .line 56
    new-instance v2, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    .line 60
    .line 61
    const-string v3, "register failed, class name: "

    .line 62
    .line 63
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v3, " should implements one of IRouteRoot/IProviderGroup/IInterceptorGroup."

    .line 70
    .line 71
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-interface {v1, v0, v2}, Lcom/alibaba/android/arouter/facade/template/ILogger;->info(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :goto_0
    sget-object v2, Lcom/alibaba/android/arouter/launcher/ARouter;->logger:Lcom/alibaba/android/arouter/facade/template/ILogger;

    .line 83
    .line 84
    new-instance v3, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 87
    .line 88
    .line 89
    const-string v4, "register class error:"

    .line 90
    .line 91
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-interface {v2, v0, p0, v1}, Lcom/alibaba/android/arouter/facade/template/ILogger;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 102
    .line 103
    .line 104
    :cond_3
    return-void
.end method

.method private static registerInterceptor(Lcom/alibaba/android/arouter/facade/template/IInterceptorGroup;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/alibaba/android/arouter/core/LogisticsCenter;->markRegisteredByPlugin()V

    .line 2
    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    sget-object v0, Lcom/alibaba/android/arouter/core/Warehouse;->interceptorsIndex:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {p0, v0}, Lcom/alibaba/android/arouter/facade/template/IInterceptorGroup;->loadInto(Ljava/util/Map;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method private static registerProvider(Lcom/alibaba/android/arouter/facade/template/IProviderGroup;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/alibaba/android/arouter/core/LogisticsCenter;->markRegisteredByPlugin()V

    .line 2
    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    sget-object v0, Lcom/alibaba/android/arouter/core/Warehouse;->providersIndex:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {p0, v0}, Lcom/alibaba/android/arouter/facade/template/IProviderGroup;->loadInto(Ljava/util/Map;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method private static registerRouteRoot(Lcom/alibaba/android/arouter/facade/template/IRouteRoot;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/alibaba/android/arouter/core/LogisticsCenter;->markRegisteredByPlugin()V

    .line 2
    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    sget-object v0, Lcom/alibaba/android/arouter/core/Warehouse;->groupsIndex:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {p0, v0}, Lcom/alibaba/android/arouter/facade/template/IRouteRoot;->loadInto(Ljava/util/Map;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method private static setValue(Lcom/alibaba/android/arouter/facade/Postcard;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {p2}, Lcom/alibaba/android/arouter/utils/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_c

    .line 6
    .line 7
    invoke-static {p3}, Lcom/alibaba/android/arouter/utils/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_0

    .line 14
    .line 15
    :cond_0
    if-eqz p1, :cond_b

    .line 16
    .line 17
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    sget-object v1, Lcom/alibaba/android/arouter/facade/enums/TypeKind;->BOOLEAN:Lcom/alibaba/android/arouter/facade/enums/TypeKind;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-ne v0, v1, :cond_1

    .line 28
    .line 29
    invoke-static {p3}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    invoke-virtual {p0, p2, p1}, Lcom/alibaba/android/arouter/facade/Postcard;->withBoolean(Ljava/lang/String;Z)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    sget-object v1, Lcom/alibaba/android/arouter/facade/enums/TypeKind;->BYTE:Lcom/alibaba/android/arouter/facade/enums/TypeKind;

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-ne v0, v1, :cond_2

    .line 48
    .line 49
    invoke-static {p3}, Ljava/lang/Byte;->parseByte(Ljava/lang/String;)B

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    invoke-virtual {p0, p2, p1}, Lcom/alibaba/android/arouter/facade/Postcard;->withByte(Ljava/lang/String;B)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    sget-object v1, Lcom/alibaba/android/arouter/facade/enums/TypeKind;->SHORT:Lcom/alibaba/android/arouter/facade/enums/TypeKind;

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-ne v0, v1, :cond_3

    .line 68
    .line 69
    invoke-static {p3}, Ljava/lang/Short;->parseShort(Ljava/lang/String;)S

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    invoke-virtual {p0, p2, p1}, Lcom/alibaba/android/arouter/facade/Postcard;->withShort(Ljava/lang/String;S)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    sget-object v1, Lcom/alibaba/android/arouter/facade/enums/TypeKind;->INT:Lcom/alibaba/android/arouter/facade/enums/TypeKind;

    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-ne v0, v1, :cond_4

    .line 88
    .line 89
    invoke-static {p3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    invoke-virtual {p0, p2, p1}, Lcom/alibaba/android/arouter/facade/Postcard;->withInt(Ljava/lang/String;I)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    sget-object v1, Lcom/alibaba/android/arouter/facade/enums/TypeKind;->LONG:Lcom/alibaba/android/arouter/facade/enums/TypeKind;

    .line 102
    .line 103
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-ne v0, v1, :cond_5

    .line 108
    .line 109
    invoke-static {p3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 110
    .line 111
    .line 112
    move-result-wide v0

    .line 113
    invoke-virtual {p0, p2, v0, v1}, Lcom/alibaba/android/arouter/facade/Postcard;->withLong(Ljava/lang/String;J)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :cond_5
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    sget-object v1, Lcom/alibaba/android/arouter/facade/enums/TypeKind;->FLOAT:Lcom/alibaba/android/arouter/facade/enums/TypeKind;

    .line 122
    .line 123
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    if-ne v0, v1, :cond_6

    .line 128
    .line 129
    invoke-static {p3}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    invoke-virtual {p0, p2, p1}, Lcom/alibaba/android/arouter/facade/Postcard;->withFloat(Ljava/lang/String;F)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :cond_6
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    sget-object v1, Lcom/alibaba/android/arouter/facade/enums/TypeKind;->DOUBLE:Lcom/alibaba/android/arouter/facade/enums/TypeKind;

    .line 142
    .line 143
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    if-ne v0, v1, :cond_7

    .line 148
    .line 149
    invoke-static {p3}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 150
    .line 151
    .line 152
    move-result-wide v0

    .line 153
    invoke-virtual {p0, p2, v0, v1}, Lcom/alibaba/android/arouter/facade/Postcard;->withDouble(Ljava/lang/String;D)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 154
    .line 155
    .line 156
    return-void

    .line 157
    :cond_7
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    sget-object v1, Lcom/alibaba/android/arouter/facade/enums/TypeKind;->STRING:Lcom/alibaba/android/arouter/facade/enums/TypeKind;

    .line 162
    .line 163
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    if-ne v0, v1, :cond_8

    .line 168
    .line 169
    invoke-virtual {p0, p2, p3}, Lcom/alibaba/android/arouter/facade/Postcard;->withString(Ljava/lang/String;Ljava/lang/String;)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 170
    .line 171
    .line 172
    return-void

    .line 173
    :cond_8
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    sget-object v1, Lcom/alibaba/android/arouter/facade/enums/TypeKind;->PARCELABLE:Lcom/alibaba/android/arouter/facade/enums/TypeKind;

    .line 178
    .line 179
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    if-ne v0, v1, :cond_9

    .line 184
    .line 185
    goto :goto_0

    .line 186
    :cond_9
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 187
    .line 188
    .line 189
    move-result p1

    .line 190
    sget-object v0, Lcom/alibaba/android/arouter/facade/enums/TypeKind;->OBJECT:Lcom/alibaba/android/arouter/facade/enums/TypeKind;

    .line 191
    .line 192
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    if-ne p1, v0, :cond_a

    .line 197
    .line 198
    invoke-virtual {p0, p2, p3}, Lcom/alibaba/android/arouter/facade/Postcard;->withString(Ljava/lang/String;Ljava/lang/String;)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 199
    .line 200
    .line 201
    return-void

    .line 202
    :cond_a
    invoke-virtual {p0, p2, p3}, Lcom/alibaba/android/arouter/facade/Postcard;->withString(Ljava/lang/String;Ljava/lang/String;)Lcom/alibaba/android/arouter/facade/Postcard;

    .line 203
    .line 204
    .line 205
    return-void

    .line 206
    :cond_b
    invoke-virtual {p0, p2, p3}, Lcom/alibaba/android/arouter/facade/Postcard;->withString(Ljava/lang/String;Ljava/lang/String;)Lcom/alibaba/android/arouter/facade/Postcard;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 207
    .line 208
    .line 209
    return-void

    .line 210
    :catchall_0
    move-exception p0

    .line 211
    sget-object p1, Lcom/alibaba/android/arouter/launcher/ARouter;->logger:Lcom/alibaba/android/arouter/facade/template/ILogger;

    .line 212
    .line 213
    new-instance p2, Ljava/lang/StringBuilder;

    .line 214
    .line 215
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 216
    .line 217
    .line 218
    const-string p3, "LogisticsCenter setValue failed! "

    .line 219
    .line 220
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    const-string p2, "ARouter::"

    .line 235
    .line 236
    invoke-interface {p1, p2, p0}, Lcom/alibaba/android/arouter/facade/template/ILogger;->warning(Ljava/lang/String;Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    :cond_c
    :goto_0
    return-void
.end method

.method public static suspend()V
    .locals 0

    .line 1
    invoke-static {}, Lcom/alibaba/android/arouter/core/Warehouse;->clear()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
