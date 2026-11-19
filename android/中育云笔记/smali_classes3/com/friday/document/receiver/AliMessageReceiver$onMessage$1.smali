.class final Lcom/friday/document/receiver/AliMessageReceiver$onMessage$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/receiver/AliMessageReceiver;->onMessage(Landroid/content/Context;Lcom/alibaba/sdk/android/push/notification/CPushMessage;)V
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
    c = "com.friday.document.receiver.AliMessageReceiver$onMessage$1"
    f = "AliMessageReceiver.kt"
    l = {
        0x3c
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:I

.field public k:I

.field public l:I

.field public final synthetic m:Lcom/alibaba/sdk/android/push/notification/CPushMessage;

.field public final synthetic n:Lcom/friday/document/receiver/AliMessageReceiver;


# direct methods
.method public constructor <init>(Lcom/alibaba/sdk/android/push/notification/CPushMessage;Lcom/friday/document/receiver/AliMessageReceiver;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/receiver/AliMessageReceiver$onMessage$1;->m:Lcom/alibaba/sdk/android/push/notification/CPushMessage;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/receiver/AliMessageReceiver$onMessage$1;->n:Lcom/friday/document/receiver/AliMessageReceiver;

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
    new-instance p1, Lcom/friday/document/receiver/AliMessageReceiver$onMessage$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/receiver/AliMessageReceiver$onMessage$1;->m:Lcom/alibaba/sdk/android/push/notification/CPushMessage;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/document/receiver/AliMessageReceiver$onMessage$1;->n:Lcom/friday/document/receiver/AliMessageReceiver;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/document/receiver/AliMessageReceiver$onMessage$1;-><init>(Lcom/alibaba/sdk/android/push/notification/CPushMessage;Lcom/friday/document/receiver/AliMessageReceiver;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/receiver/AliMessageReceiver$onMessage$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/receiver/AliMessageReceiver$onMessage$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/receiver/AliMessageReceiver$onMessage$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/receiver/AliMessageReceiver$onMessage$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    const-string v0, "\uff0cmessage="

    .line 2
    .line 3
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget v2, p0, Lcom/friday/document/receiver/AliMessageReceiver$onMessage$1;->l:I

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    const/4 v4, 0x0

    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    if-ne v2, v3, :cond_0

    .line 14
    .line 15
    iget v0, p0, Lcom/friday/document/receiver/AliMessageReceiver$onMessage$1;->j:I

    .line 16
    .line 17
    iget-object v2, p0, Lcom/friday/document/receiver/AliMessageReceiver$onMessage$1;->i:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Lcom/friday/document/receiver/AliMessageReceiver$a;

    .line 20
    .line 21
    iget-object v2, p0, Lcom/friday/document/receiver/AliMessageReceiver$onMessage$1;->g:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, Ljava/util/Iterator;

    .line 24
    .line 25
    iget-object v5, p0, Lcom/friday/document/receiver/AliMessageReceiver$onMessage$1;->f:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v5, Lcom/friday/document/receiver/AliMessageReceiver;

    .line 28
    .line 29
    iget-object v6, p0, Lcom/friday/document/receiver/AliMessageReceiver$onMessage$1;->e:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v6, Ljava/lang/Iterable;

    .line 32
    .line 33
    iget-object v7, p0, Lcom/friday/document/receiver/AliMessageReceiver$onMessage$1;->d:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v7, Ljava/util/List;

    .line 36
    .line 37
    iget-object v8, p0, Lcom/friday/document/receiver/AliMessageReceiver$onMessage$1;->c:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v8, Ljava/util/List;

    .line 40
    .line 41
    :try_start_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    .line 43
    .line 44
    goto/16 :goto_1

    .line 45
    .line 46
    :catch_0
    move-exception p1

    .line 47
    goto/16 :goto_2

    .line 48
    .line 49
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1

    .line 57
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    :try_start_1
    iget-object p1, p0, Lcom/friday/document/receiver/AliMessageReceiver$onMessage$1;->m:Lcom/alibaba/sdk/android/push/notification/CPushMessage;

    .line 61
    .line 62
    invoke-virtual {p1}, Lcom/alibaba/sdk/android/push/notification/CPushMessage;->getTitle()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iget-object v2, p0, Lcom/friday/document/receiver/AliMessageReceiver$onMessage$1;->m:Lcom/alibaba/sdk/android/push/notification/CPushMessage;

    .line 67
    .line 68
    invoke-virtual {v2}, Lcom/alibaba/sdk/android/push/notification/CPushMessage;->getContent()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    new-instance v5, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 75
    .line 76
    .line 77
    const-string v6, "\u9875\u9762 AliMessageReceiver.kt -> onMessage\uff0cSDK\u539f\u59cb\u6536\u5230\u963f\u91cc\u4e91\u63a8\u9001\uff0ctitle="

    .line 78
    .line 79
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    iget-object p1, p0, Lcom/friday/document/receiver/AliMessageReceiver$onMessage$1;->m:Lcom/alibaba/sdk/android/push/notification/CPushMessage;

    .line 103
    .line 104
    invoke-virtual {p1}, Lcom/alibaba/sdk/android/push/notification/CPushMessage;->getContent()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    const-string v2, "getContent(...)"

    .line 109
    .line 110
    invoke-static {p1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    iget-object v2, p0, Lcom/friday/document/receiver/AliMessageReceiver$onMessage$1;->n:Lcom/friday/document/receiver/AliMessageReceiver;

    .line 114
    .line 115
    invoke-static {v2}, Lcom/friday/document/receiver/AliMessageReceiver;->b(Lcom/friday/document/receiver/AliMessageReceiver;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    const/4 v5, 0x2

    .line 120
    const/4 v6, 0x0

    .line 121
    invoke-static {p1, v2, v4, v5, v6}, Lqd/c0;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    if-nez p1, :cond_2

    .line 126
    .line 127
    iget-object p1, p0, Lcom/friday/document/receiver/AliMessageReceiver$onMessage$1;->n:Lcom/friday/document/receiver/AliMessageReceiver;

    .line 128
    .line 129
    invoke-static {p1}, Lcom/friday/document/receiver/AliMessageReceiver;->b(Lcom/friday/document/receiver/AliMessageReceiver;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    iget-object v1, p0, Lcom/friday/document/receiver/AliMessageReceiver$onMessage$1;->m:Lcom/alibaba/sdk/android/push/notification/CPushMessage;

    .line 134
    .line 135
    invoke-virtual {v1}, Lcom/alibaba/sdk/android/push/notification/CPushMessage;->getContent()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    new-instance v2, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 142
    .line 143
    .line 144
    const-string v3, "\u9875\u9762 AliMessageReceiver.kt -> onMessage\uff0c\u63a8\u9001\u4e0d\u5305\u542b\u5f53\u524d\u7528\u6237id\uff0c\u8df3\u8fc7\u5904\u7406\uff0cuserId="

    .line 145
    .line 146
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 170
    .line 171
    return-object p1

    .line 172
    :cond_2
    iget-object p1, p0, Lcom/friday/document/receiver/AliMessageReceiver$onMessage$1;->m:Lcom/alibaba/sdk/android/push/notification/CPushMessage;

    .line 173
    .line 174
    invoke-virtual {p1}, Lcom/alibaba/sdk/android/push/notification/CPushMessage;->getTitle()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    iget-object v2, p0, Lcom/friday/document/receiver/AliMessageReceiver$onMessage$1;->m:Lcom/alibaba/sdk/android/push/notification/CPushMessage;

    .line 179
    .line 180
    invoke-virtual {v2}, Lcom/alibaba/sdk/android/push/notification/CPushMessage;->getContent()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    new-instance v5, Ljava/lang/StringBuilder;

    .line 185
    .line 186
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 187
    .line 188
    .line 189
    const-string v6, "\u9875\u9762 AliMessageReceiver.kt -> onMessage\uff0c\u6536\u5230\u963f\u91cc\u4e91\u63a8\u9001\uff0ctitle="

    .line 190
    .line 191
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    iget-object p1, p0, Lcom/friday/document/receiver/AliMessageReceiver$onMessage$1;->m:Lcom/alibaba/sdk/android/push/notification/CPushMessage;

    .line 215
    .line 216
    invoke-virtual {p1}, Lcom/alibaba/sdk/android/push/notification/CPushMessage;->getContent()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    new-instance v0, Lcom/friday/document/receiver/AliMessageReceiver$onMessage$1$a;

    .line 221
    .line 222
    invoke-direct {v0}, Lcom/friday/document/receiver/AliMessageReceiver$onMessage$1$a;-><init>()V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v0}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/GsonUtils;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    check-cast p1, Ljava/util/List;

    .line 234
    .line 235
    if-nez p1, :cond_3

    .line 236
    .line 237
    new-instance p1, Ljava/util/ArrayList;

    .line 238
    .line 239
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 240
    .line 241
    .line 242
    :cond_3
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 243
    .line 244
    .line 245
    move-result v0

    .line 246
    if-eqz v0, :cond_4

    .line 247
    .line 248
    const-string p1, "\u9875\u9762 AliMessageReceiver.kt -> onMessage\uff0c\u63a8\u9001\u5185\u5bb9\u4e3a\u7a7a\u6216\u89e3\u6790\u5931\u8d25"

    .line 249
    .line 250
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 258
    .line 259
    return-object p1

    .line 260
    :cond_4
    move-object v0, p1

    .line 261
    check-cast v0, Ljava/lang/Iterable;

    .line 262
    .line 263
    new-instance v2, Ljava/util/HashSet;

    .line 264
    .line 265
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 266
    .line 267
    .line 268
    new-instance v5, Ljava/util/ArrayList;

    .line 269
    .line 270
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 271
    .line 272
    .line 273
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    :cond_5
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 278
    .line 279
    .line 280
    move-result v6

    .line 281
    if-eqz v6, :cond_6

    .line 282
    .line 283
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v6

    .line 287
    move-object v7, v6

    .line 288
    check-cast v7, Lcom/friday/document/receiver/AliMessageReceiver$a;

    .line 289
    .line 290
    invoke-virtual {v7}, Lcom/friday/document/receiver/AliMessageReceiver$a;->a()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v7

    .line 294
    invoke-virtual {v2, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    move-result v7

    .line 298
    if-eqz v7, :cond_5

    .line 299
    .line 300
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    goto :goto_0

    .line 304
    :cond_6
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 305
    .line 306
    .line 307
    move-result v0

    .line 308
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 309
    .line 310
    .line 311
    move-result v2

    .line 312
    if-eq v0, v2, :cond_7

    .line 313
    .line 314
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 315
    .line 316
    .line 317
    move-result v0

    .line 318
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 319
    .line 320
    .line 321
    move-result v2

    .line 322
    new-instance v6, Ljava/lang/StringBuilder;

    .line 323
    .line 324
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 325
    .line 326
    .line 327
    const-string v7, "\u9875\u9762 AliMessageReceiver.kt -> onMessage\uff0c\u68c0\u6d4b\u5230\u91cd\u590d\u63a8\u9001\uff0c\u539f\u59cb\u6761\u6570="

    .line 328
    .line 329
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    const-string v0, "\uff0c\u53bb\u91cd\u540e\u6761\u6570="

    .line 336
    .line 337
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    :cond_7
    iget-object v0, p0, Lcom/friday/document/receiver/AliMessageReceiver$onMessage$1;->n:Lcom/friday/document/receiver/AliMessageReceiver;

    .line 355
    .line 356
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 357
    .line 358
    .line 359
    move-result-object v2

    .line 360
    move-object v8, p1

    .line 361
    move-object v6, v5

    .line 362
    move-object v7, v6

    .line 363
    move-object v5, v0

    .line 364
    move v0, v4

    .line 365
    :cond_8
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 366
    .line 367
    .line 368
    move-result p1

    .line 369
    if-eqz p1, :cond_9

    .line 370
    .line 371
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object p1

    .line 375
    move-object v9, p1

    .line 376
    check-cast v9, Lcom/friday/document/receiver/AliMessageReceiver$a;

    .line 377
    .line 378
    invoke-static {v8}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v10

    .line 382
    iput-object v10, p0, Lcom/friday/document/receiver/AliMessageReceiver$onMessage$1;->c:Ljava/lang/Object;

    .line 383
    .line 384
    invoke-static {v7}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v10

    .line 388
    iput-object v10, p0, Lcom/friday/document/receiver/AliMessageReceiver$onMessage$1;->d:Ljava/lang/Object;

    .line 389
    .line 390
    invoke-static {v6}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    move-result-object v10

    .line 394
    iput-object v10, p0, Lcom/friday/document/receiver/AliMessageReceiver$onMessage$1;->e:Ljava/lang/Object;

    .line 395
    .line 396
    iput-object v5, p0, Lcom/friday/document/receiver/AliMessageReceiver$onMessage$1;->f:Ljava/lang/Object;

    .line 397
    .line 398
    iput-object v2, p0, Lcom/friday/document/receiver/AliMessageReceiver$onMessage$1;->g:Ljava/lang/Object;

    .line 399
    .line 400
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object p1

    .line 404
    iput-object p1, p0, Lcom/friday/document/receiver/AliMessageReceiver$onMessage$1;->h:Ljava/lang/Object;

    .line 405
    .line 406
    invoke-static {v9}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object p1

    .line 410
    iput-object p1, p0, Lcom/friday/document/receiver/AliMessageReceiver$onMessage$1;->i:Ljava/lang/Object;

    .line 411
    .line 412
    iput v0, p0, Lcom/friday/document/receiver/AliMessageReceiver$onMessage$1;->j:I

    .line 413
    .line 414
    iput v4, p0, Lcom/friday/document/receiver/AliMessageReceiver$onMessage$1;->k:I

    .line 415
    .line 416
    iput v3, p0, Lcom/friday/document/receiver/AliMessageReceiver$onMessage$1;->l:I

    .line 417
    .line 418
    invoke-static {v5, v9, p0}, Lcom/friday/document/receiver/AliMessageReceiver;->c(Lcom/friday/document/receiver/AliMessageReceiver;Lcom/friday/document/receiver/AliMessageReceiver$a;Lvc/c;)Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 422
    if-ne p1, v1, :cond_8

    .line 423
    .line 424
    return-object v1

    .line 425
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object p1

    .line 429
    new-instance v0, Ljava/lang/StringBuilder;

    .line 430
    .line 431
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 432
    .line 433
    .line 434
    const-string v1, "\u9875\u9762 AliMessageReceiver.kt -> onMessage\uff0c\u5904\u7406\u963f\u91cc\u4e91\u63a8\u9001\u5931\u8d25\uff0c\u5f02\u5e38="

    .line 435
    .line 436
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 437
    .line 438
    .line 439
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 440
    .line 441
    .line 442
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 443
    .line 444
    .line 445
    move-result-object p1

    .line 446
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object p1

    .line 450
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 451
    .line 452
    .line 453
    :cond_9
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 454
    .line 455
    return-object p1
.end method
