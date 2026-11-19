# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/study/provide/AccountRepositoryImp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp3/a;


# instance fields
.field public final a:Lo4/a;

.field public final b:Lo4/e;

.field public final c:Ll8/h;

.field public final d:Lcom/zykj/study/bean/ClientCodeLiveData;

.field public e:Lcom/zykj/lib/login/proto/UserBean;

.field public f:Lcom/zykj/lib/login/proto/ServerBean;

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;

.field public i:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lo4/a;Lo4/e;Ll8/h;Lcom/zykj/study/bean/ClientCodeLiveData;)V
    .locals 1

    .line 1
    const-string v0, "accountApi"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "gatewayService"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "headerBeanFlow"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "clientCodeLiveData"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lcom/zykj/study/provide/AccountRepositoryImp;->a:Lo4/a;

    .line 25
    .line 26
    iput-object p2, p0, Lcom/zykj/study/provide/AccountRepositoryImp;->b:Lo4/e;

    .line 27
    .line 28
    iput-object p3, p0, Lcom/zykj/study/provide/AccountRepositoryImp;->c:Ll8/h;

    .line 29
    .line 30
    iput-object p4, p0, Lcom/zykj/study/provide/AccountRepositoryImp;->d:Lcom/zykj/study/bean/ClientCodeLiveData;

    .line 31
    .line 32
    invoke-static {}, Lcom/zykj/lib/login/proto/UserBean;->getDefaultInstance()Lcom/zykj/lib/login/proto/UserBean;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const-string p2, "getDefaultInstance(...)"

    .line 37
    .line 38
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Lcom/zykj/study/provide/AccountRepositoryImp;->e:Lcom/zykj/lib/login/proto/UserBean;

    .line 42
    .line 43
    invoke-static {}, Lcom/zykj/lib/login/proto/ServerBean;->getDefaultInstance()Lcom/zykj/lib/login/proto/ServerBean;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    iput-object p1, p0, Lcom/zykj/study/provide/AccountRepositoryImp;->f:Lcom/zykj/lib/login/proto/ServerBean;

    .line 51
    .line 52
    const-string p1, ""

    .line 53
    .line 54
    iput-object p1, p0, Lcom/zykj/study/provide/AccountRepositoryImp;->g:Ljava/lang/String;

    .line 55
    .line 56
    iput-object p1, p0, Lcom/zykj/study/provide/AccountRepositoryImp;->h:Ljava/lang/String;

    .line 57
    .line 58
    iput-object p1, p0, Lcom/zykj/study/provide/AccountRepositoryImp;->i:Ljava/lang/String;

    .line 59
    .line 60
    return-void
.end method

.method public static final synthetic h(Lcom/zykj/study/provide/AccountRepositoryImp;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/study/provide/AccountRepositoryImp;->j(Lm7/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/provide/AccountRepositoryImp;->g:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm7/c;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    instance-of v3, v2, Lcom/zykj/study/provide/AccountRepositoryImp$login$1;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, Lcom/zykj/study/provide/AccountRepositoryImp$login$1;

    .line 13
    .line 14
    iget v4, v3, Lcom/zykj/study/provide/AccountRepositoryImp$login$1;->i:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, Lcom/zykj/study/provide/AccountRepositoryImp$login$1;->i:I

    .line 24
    .line 25
    :goto_0
    move-object v9, v3

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    new-instance v3, Lcom/zykj/study/provide/AccountRepositoryImp$login$1;

    .line 28
    .line 29
    invoke-direct {v3, v0, v2}, Lcom/zykj/study/provide/AccountRepositoryImp$login$1;-><init>(Lcom/zykj/study/provide/AccountRepositoryImp;Lm7/c;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :goto_1
    iget-object v2, v9, Lcom/zykj/study/provide/AccountRepositoryImp$login$1;->g:Ljava/lang/Object;

    .line 34
    .line 35
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    iget v4, v9, Lcom/zykj/study/provide/AccountRepositoryImp$login$1;->i:I

    .line 40
    .line 41
    const-string v10, "build(...)"

    .line 42
    .line 43
    const/4 v11, 0x4

    .line 44
    const/4 v5, 0x3

    .line 45
    const/4 v12, 0x0

    .line 46
    const/4 v13, 0x1

    .line 47
    const/4 v14, 0x2

    .line 48
    const-string v15, ""

    .line 49
    .line 50
    if-eqz v4, :cond_5

    .line 51
    .line 52
    if-eq v4, v13, :cond_4

    .line 53
    .line 54
    if-eq v4, v14, :cond_3

    .line 55
    .line 56
    if-eq v4, v5, :cond_2

    .line 57
    .line 58
    if-ne v4, v11, :cond_1

    .line 59
    .line 60
    iget-object v1, v9, Lcom/zykj/study/provide/AccountRepositoryImp$login$1;->f:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v1, Lcom/zykj/study/bean/TokenResponse;

    .line 63
    .line 64
    iget-object v3, v9, Lcom/zykj/study/provide/AccountRepositoryImp$login$1;->e:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v3, Ljava/lang/String;

    .line 67
    .line 68
    iget-object v3, v9, Lcom/zykj/study/provide/AccountRepositoryImp$login$1;->d:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v3, Lcom/zykj/study/bean/GatewayBean;

    .line 71
    .line 72
    iget-object v3, v9, Lcom/zykj/study/provide/AccountRepositoryImp$login$1;->c:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v3, Ljava/lang/String;

    .line 75
    .line 76
    iget-object v3, v9, Lcom/zykj/study/provide/AccountRepositoryImp$login$1;->b:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v3, Ljava/lang/String;

    .line 79
    .line 80
    iget-object v4, v9, Lcom/zykj/study/provide/AccountRepositoryImp$login$1;->a:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v4, Ljava/lang/String;

    .line 83
    .line 84
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    goto/16 :goto_a

    .line 88
    .line 89
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 90
    .line 91
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 92
    .line 93
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw v1

    .line 97
    :cond_2
    iget-object v1, v9, Lcom/zykj/study/provide/AccountRepositoryImp$login$1;->e:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v1, Ljava/lang/String;

    .line 100
    .line 101
    iget-object v4, v9, Lcom/zykj/study/provide/AccountRepositoryImp$login$1;->d:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v4, Lcom/zykj/study/bean/GatewayBean;

    .line 104
    .line 105
    iget-object v5, v9, Lcom/zykj/study/provide/AccountRepositoryImp$login$1;->c:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v5, Ljava/lang/String;

    .line 108
    .line 109
    iget-object v6, v9, Lcom/zykj/study/provide/AccountRepositoryImp$login$1;->b:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v6, Ljava/lang/String;

    .line 112
    .line 113
    iget-object v7, v9, Lcom/zykj/study/provide/AccountRepositoryImp$login$1;->a:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v7, Ljava/lang/String;

    .line 116
    .line 117
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    move-object/from16 v19, v1

    .line 121
    .line 122
    move-object v13, v4

    .line 123
    move-object v1, v5

    .line 124
    move-object v8, v6

    .line 125
    move-object v4, v7

    .line 126
    goto/16 :goto_4

    .line 127
    .line 128
    :cond_3
    iget-object v1, v9, Lcom/zykj/study/provide/AccountRepositoryImp$login$1;->d:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v1, Lcom/zykj/study/bean/GatewayBean;

    .line 131
    .line 132
    iget-object v4, v9, Lcom/zykj/study/provide/AccountRepositoryImp$login$1;->c:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v4, Ljava/lang/String;

    .line 135
    .line 136
    iget-object v6, v9, Lcom/zykj/study/provide/AccountRepositoryImp$login$1;->b:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v6, Ljava/lang/String;

    .line 139
    .line 140
    iget-object v7, v9, Lcom/zykj/study/provide/AccountRepositoryImp$login$1;->a:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v7, Ljava/lang/String;

    .line 143
    .line 144
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    move-object/from16 v18, v4

    .line 148
    .line 149
    move-object/from16 v17, v6

    .line 150
    .line 151
    move-object v13, v7

    .line 152
    goto/16 :goto_3

    .line 153
    .line 154
    :cond_4
    iget-object v1, v9, Lcom/zykj/study/provide/AccountRepositoryImp$login$1;->c:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v1, Ljava/lang/String;

    .line 157
    .line 158
    iget-object v4, v9, Lcom/zykj/study/provide/AccountRepositoryImp$login$1;->b:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v4, Ljava/lang/String;

    .line 161
    .line 162
    iget-object v6, v9, Lcom/zykj/study/provide/AccountRepositoryImp$login$1;->a:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v6, Ljava/lang/String;

    .line 165
    .line 166
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    move-object/from16 v28, v6

    .line 170
    .line 171
    move-object v6, v1

    .line 172
    move-object/from16 v1, v28

    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_5
    invoke-static {v2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    iget-object v2, v0, Lcom/zykj/study/provide/AccountRepositoryImp;->b:Lo4/e;

    .line 179
    .line 180
    iput-object v1, v9, Lcom/zykj/study/provide/AccountRepositoryImp$login$1;->a:Ljava/lang/Object;

    .line 181
    .line 182
    move-object/from16 v4, p2

    .line 183
    .line 184
    iput-object v4, v9, Lcom/zykj/study/provide/AccountRepositoryImp$login$1;->b:Ljava/lang/Object;

    .line 185
    .line 186
    move-object/from16 v6, p3

    .line 187
    .line 188
    iput-object v6, v9, Lcom/zykj/study/provide/AccountRepositoryImp$login$1;->c:Ljava/lang/Object;

    .line 189
    .line 190
    iput v13, v9, Lcom/zykj/study/provide/AccountRepositoryImp$login$1;->i:I

    .line 191
    .line 192
    invoke-interface {v2, v1, v9}, Lo4/e;->a(Ljava/lang/String;Lm7/c;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    if-ne v2, v3, :cond_6

    .line 197
    .line 198
    goto/16 :goto_9

    .line 199
    .line 200
    :cond_6
    :goto_2
    check-cast v2, Lcom/zykj/study/bean/GatewayBean;

    .line 201
    .line 202
    invoke-virtual {v2}, Lcom/zykj/study/bean/GatewayBean;->getServer()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v7

    .line 206
    if-eqz v7, :cond_1b

    .line 207
    .line 208
    invoke-virtual {v2}, Lcom/zykj/study/bean/GatewayBean;->getServer()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v7

    .line 212
    const-string v8, "https"

    .line 213
    .line 214
    const/4 v13, 0x0

    .line 215
    invoke-static {v7, v8, v12, v14, v13}, Lg8/z;->M(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v7

    .line 219
    invoke-virtual {v0, v1, v7}, Lcom/zykj/study/provide/AccountRepositoryImp;->k(Ljava/lang/String;Z)V

    .line 220
    .line 221
    .line 222
    new-instance v7, Ljava/lang/StringBuilder;

    .line 223
    .line 224
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 225
    .line 226
    .line 227
    const-string v8, "server -> "

    .line 228
    .line 229
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v7

    .line 239
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v7

    .line 243
    invoke-static {v7}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    iget-object v7, v0, Lcom/zykj/study/provide/AccountRepositoryImp;->c:Ll8/h;

    .line 247
    .line 248
    :cond_7
    invoke-interface {v7}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v8

    .line 252
    move-object/from16 v16, v8

    .line 253
    .line 254
    check-cast v16, Lcom/zykj/http/bean/HeaderBean;

    .line 255
    .line 256
    invoke-virtual {v2}, Lcom/zykj/study/bean/GatewayBean;->getServer()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v19

    .line 260
    const/16 v22, 0x1b

    .line 261
    .line 262
    const/16 v23, 0x0

    .line 263
    .line 264
    const/16 v17, 0x0

    .line 265
    .line 266
    const/16 v18, 0x0

    .line 267
    .line 268
    const/16 v20, 0x0

    .line 269
    .line 270
    const/16 v21, 0x0

    .line 271
    .line 272
    invoke-static/range {v16 .. v23}, Lcom/zykj/http/bean/HeaderBean;->copy$default(Lcom/zykj/http/bean/HeaderBean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/zykj/http/bean/HeaderBean;

    .line 273
    .line 274
    .line 275
    move-result-object v13

    .line 276
    invoke-interface {v7, v8, v13}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-result v8

    .line 280
    if-eqz v8, :cond_7

    .line 281
    .line 282
    iput-object v1, v9, Lcom/zykj/study/provide/AccountRepositoryImp$login$1;->a:Ljava/lang/Object;

    .line 283
    .line 284
    iput-object v4, v9, Lcom/zykj/study/provide/AccountRepositoryImp$login$1;->b:Ljava/lang/Object;

    .line 285
    .line 286
    iput-object v6, v9, Lcom/zykj/study/provide/AccountRepositoryImp$login$1;->c:Ljava/lang/Object;

    .line 287
    .line 288
    iput-object v2, v9, Lcom/zykj/study/provide/AccountRepositoryImp$login$1;->d:Ljava/lang/Object;

    .line 289
    .line 290
    iput v14, v9, Lcom/zykj/study/provide/AccountRepositoryImp$login$1;->i:I

    .line 291
    .line 292
    invoke-virtual {v0, v1, v4, v9}, Lcom/zykj/study/provide/AccountRepositoryImp;->i(Ljava/lang/String;Ljava/lang/String;Lm7/c;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v7

    .line 296
    if-ne v7, v3, :cond_8

    .line 297
    .line 298
    goto/16 :goto_9

    .line 299
    .line 300
    :cond_8
    move-object v13, v1

    .line 301
    move-object v1, v2

    .line 302
    move-object/from16 v17, v4

    .line 303
    .line 304
    move-object/from16 v18, v6

    .line 305
    .line 306
    move-object v2, v7

    .line 307
    :goto_3
    move-object/from16 v19, v2

    .line 308
    .line 309
    check-cast v19, Ljava/lang/String;

    .line 310
    .line 311
    iget-object v4, v0, Lcom/zykj/study/provide/AccountRepositoryImp;->a:Lo4/a;

    .line 312
    .line 313
    new-instance v16, Lcom/zykj/study/bean/TokenReq;

    .line 314
    .line 315
    const/16 v24, 0x78

    .line 316
    .line 317
    const/16 v25, 0x0

    .line 318
    .line 319
    const/16 v20, 0x0

    .line 320
    .line 321
    const/16 v21, 0x0

    .line 322
    .line 323
    const/16 v22, 0x0

    .line 324
    .line 325
    const/16 v23, 0x0

    .line 326
    .line 327
    invoke-direct/range {v16 .. v25}, Lcom/zykj/study/bean/TokenReq;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLjava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 328
    .line 329
    .line 330
    move-object/from16 v6, v17

    .line 331
    .line 332
    move-object/from16 v2, v18

    .line 333
    .line 334
    iput-object v13, v9, Lcom/zykj/study/provide/AccountRepositoryImp$login$1;->a:Ljava/lang/Object;

    .line 335
    .line 336
    iput-object v6, v9, Lcom/zykj/study/provide/AccountRepositoryImp$login$1;->b:Ljava/lang/Object;

    .line 337
    .line 338
    iput-object v2, v9, Lcom/zykj/study/provide/AccountRepositoryImp$login$1;->c:Ljava/lang/Object;

    .line 339
    .line 340
    iput-object v1, v9, Lcom/zykj/study/provide/AccountRepositoryImp$login$1;->d:Ljava/lang/Object;

    .line 341
    .line 342
    invoke-static/range {v19 .. v19}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v7

    .line 346
    iput-object v7, v9, Lcom/zykj/study/provide/AccountRepositoryImp$login$1;->e:Ljava/lang/Object;

    .line 347
    .line 348
    iput v5, v9, Lcom/zykj/study/provide/AccountRepositoryImp$login$1;->i:I

    .line 349
    .line 350
    const-string v6, "com.zhongyukejiao.learningexpert"

    .line 351
    .line 352
    const/16 v7, 0x2777

    .line 353
    .line 354
    move-object/from16 v5, v16

    .line 355
    .line 356
    move-object/from16 v8, v19

    .line 357
    .line 358
    invoke-interface/range {v4 .. v9}, Lo4/a;->d(Lcom/zykj/study/bean/TokenReq;Ljava/lang/String;ILjava/lang/String;Lm7/c;)Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v4

    .line 362
    if-ne v4, v3, :cond_9

    .line 363
    .line 364
    goto/16 :goto_9

    .line 365
    .line 366
    :cond_9
    move-object v8, v13

    .line 367
    move-object v13, v1

    .line 368
    move-object v1, v2

    .line 369
    move-object v2, v4

    .line 370
    move-object v4, v8

    .line 371
    move-object/from16 v8, v17

    .line 372
    .line 373
    :goto_4
    check-cast v2, Lcom/zykj/study/bean/TokenResponse;

    .line 374
    .line 375
    new-instance v5, Ljava/lang/StringBuilder;

    .line 376
    .line 377
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 378
    .line 379
    .line 380
    const-string v6, "login -> "

    .line 381
    .line 382
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 383
    .line 384
    .line 385
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 386
    .line 387
    .line 388
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v5

    .line 392
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v5

    .line 396
    invoke-static {v5}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v2}, Lcom/zykj/study/bean/TokenResponse;->getResult()Lcom/zykj/study/bean/LoginResp;

    .line 400
    .line 401
    .line 402
    move-result-object v5

    .line 403
    if-nez v5, :cond_d

    .line 404
    .line 405
    new-instance v1, Lcom/zykj/http/exception/RemoteCodeException;

    .line 406
    .line 407
    new-instance v3, Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 408
    .line 409
    invoke-virtual {v2}, Lcom/zykj/study/bean/TokenResponse;->getError()Lcom/zykj/study/bean/ErrorRemote;

    .line 410
    .line 411
    .line 412
    move-result-object v4

    .line 413
    if-eqz v4, :cond_a

    .line 414
    .line 415
    invoke-virtual {v4}, Lcom/zykj/study/bean/ErrorRemote;->getCode()I

    .line 416
    .line 417
    .line 418
    move-result v12

    .line 419
    :cond_a
    move v4, v12

    .line 420
    invoke-virtual {v2}, Lcom/zykj/study/bean/TokenResponse;->getError()Lcom/zykj/study/bean/ErrorRemote;

    .line 421
    .line 422
    .line 423
    move-result-object v2

    .line 424
    if-eqz v2, :cond_c

    .line 425
    .line 426
    invoke-virtual {v2}, Lcom/zykj/study/bean/ErrorRemote;->getMessage()Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object v2

    .line 430
    if-nez v2, :cond_b

    .line 431
    .line 432
    goto :goto_5

    .line 433
    :cond_b
    move-object v7, v2

    .line 434
    goto :goto_6

    .line 435
    :cond_c
    :goto_5
    move-object v7, v15

    .line 436
    :goto_6
    const/4 v8, 0x4

    .line 437
    const/4 v9, 0x0

    .line 438
    const-string v5, "token\u83b7\u53d6\u5931\u8d25"

    .line 439
    .line 440
    const/4 v6, 0x0

    .line 441
    invoke-direct/range {v3 .. v9}, Lcom/zykj/lib/error/code/ErrorCodeInfo;-><init>(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 442
    .line 443
    .line 444
    invoke-direct {v1, v3}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCodeInfo;)V

    .line 445
    .line 446
    .line 447
    throw v1

    .line 448
    :cond_d
    invoke-virtual {v2}, Lcom/zykj/study/bean/TokenResponse;->getResult()Lcom/zykj/study/bean/LoginResp;

    .line 449
    .line 450
    .line 451
    move-result-object v5

    .line 452
    invoke-virtual {v5}, Lcom/zykj/study/bean/LoginResp;->getMobile()Ljava/lang/String;

    .line 453
    .line 454
    .line 455
    move-result-object v5

    .line 456
    if-nez v5, :cond_e

    .line 457
    .line 458
    move-object v5, v15

    .line 459
    :cond_e
    iput-object v5, v0, Lcom/zykj/study/provide/AccountRepositoryImp;->g:Ljava/lang/String;

    .line 460
    .line 461
    iput-object v1, v0, Lcom/zykj/study/provide/AccountRepositoryImp;->h:Ljava/lang/String;

    .line 462
    .line 463
    invoke-virtual {v2}, Lcom/zykj/study/bean/TokenResponse;->getResult()Lcom/zykj/study/bean/LoginResp;

    .line 464
    .line 465
    .line 466
    move-result-object v5

    .line 467
    invoke-virtual {v5}, Lcom/zykj/study/bean/LoginResp;->getUserId()J

    .line 468
    .line 469
    .line 470
    move-result-wide v5

    .line 471
    invoke-static {v5, v6}, Le5/n;->b(J)V

    .line 472
    .line 473
    .line 474
    iget-object v5, v0, Lcom/zykj/study/provide/AccountRepositoryImp;->f:Lcom/zykj/lib/login/proto/ServerBean;

    .line 475
    .line 476
    invoke-virtual {v5}, Lcom/google/protobuf/GeneratedMessageLite;->toBuilder()Lcom/google/protobuf/GeneratedMessageLite$Builder;

    .line 477
    .line 478
    .line 479
    move-result-object v5

    .line 480
    check-cast v5, Lcom/zykj/lib/login/proto/ServerBean$Builder;

    .line 481
    .line 482
    invoke-virtual {v5, v4}, Lcom/zykj/lib/login/proto/ServerBean$Builder;->setSchoolCode(Ljava/lang/String;)Lcom/zykj/lib/login/proto/ServerBean$Builder;

    .line 483
    .line 484
    .line 485
    move-result-object v5

    .line 486
    invoke-virtual {v13}, Lcom/zykj/study/bean/GatewayBean;->getServer()Ljava/lang/String;

    .line 487
    .line 488
    .line 489
    move-result-object v6

    .line 490
    invoke-virtual {v5, v6}, Lcom/zykj/lib/login/proto/ServerBean$Builder;->setServerUrl(Ljava/lang/String;)Lcom/zykj/lib/login/proto/ServerBean$Builder;

    .line 491
    .line 492
    .line 493
    move-result-object v5

    .line 494
    invoke-virtual {v13}, Lcom/zykj/study/bean/GatewayBean;->getWebServer()Ljava/lang/String;

    .line 495
    .line 496
    .line 497
    move-result-object v6

    .line 498
    if-nez v6, :cond_f

    .line 499
    .line 500
    move-object v6, v15

    .line 501
    :cond_f
    invoke-virtual {v5, v6}, Lcom/zykj/lib/login/proto/ServerBean$Builder;->setWebServerUrl(Ljava/lang/String;)Lcom/zykj/lib/login/proto/ServerBean$Builder;

    .line 502
    .line 503
    .line 504
    move-result-object v5

    .line 505
    invoke-virtual {v2}, Lcom/zykj/study/bean/TokenResponse;->getResult()Lcom/zykj/study/bean/LoginResp;

    .line 506
    .line 507
    .line 508
    move-result-object v6

    .line 509
    invoke-virtual {v6}, Lcom/zykj/study/bean/LoginResp;->getAccessToken()Ljava/lang/String;

    .line 510
    .line 511
    .line 512
    move-result-object v6

    .line 513
    if-nez v6, :cond_10

    .line 514
    .line 515
    move-object v6, v15

    .line 516
    :cond_10
    invoke-virtual {v5, v6}, Lcom/zykj/lib/login/proto/ServerBean$Builder;->setAccessToken(Ljava/lang/String;)Lcom/zykj/lib/login/proto/ServerBean$Builder;

    .line 517
    .line 518
    .line 519
    move-result-object v5

    .line 520
    invoke-virtual {v2}, Lcom/zykj/study/bean/TokenResponse;->getResult()Lcom/zykj/study/bean/LoginResp;

    .line 521
    .line 522
    .line 523
    move-result-object v6

    .line 524
    invoke-virtual {v6}, Lcom/zykj/study/bean/LoginResp;->getRefreshToken()Ljava/lang/String;

    .line 525
    .line 526
    .line 527
    move-result-object v6

    .line 528
    if-nez v6, :cond_11

    .line 529
    .line 530
    move-object v6, v15

    .line 531
    :cond_11
    invoke-virtual {v5, v6}, Lcom/zykj/lib/login/proto/ServerBean$Builder;->setRefreshToken(Ljava/lang/String;)Lcom/zykj/lib/login/proto/ServerBean$Builder;

    .line 532
    .line 533
    .line 534
    move-result-object v5

    .line 535
    invoke-virtual {v5}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 536
    .line 537
    .line 538
    move-result-object v5

    .line 539
    invoke-static {v5, v10}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 540
    .line 541
    .line 542
    check-cast v5, Lcom/zykj/lib/login/proto/ServerBean;

    .line 543
    .line 544
    iput-object v5, v0, Lcom/zykj/study/provide/AccountRepositoryImp;->f:Lcom/zykj/lib/login/proto/ServerBean;

    .line 545
    .line 546
    iget-object v5, v0, Lcom/zykj/study/provide/AccountRepositoryImp;->c:Ll8/h;

    .line 547
    .line 548
    :cond_12
    invoke-interface {v5}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 549
    .line 550
    .line 551
    move-result-object v6

    .line 552
    move-object/from16 v20, v6

    .line 553
    .line 554
    check-cast v20, Lcom/zykj/http/bean/HeaderBean;

    .line 555
    .line 556
    invoke-virtual {v2}, Lcom/zykj/study/bean/TokenResponse;->getResult()Lcom/zykj/study/bean/LoginResp;

    .line 557
    .line 558
    .line 559
    move-result-object v7

    .line 560
    invoke-virtual {v7}, Lcom/zykj/study/bean/LoginResp;->getAccessToken()Ljava/lang/String;

    .line 561
    .line 562
    .line 563
    move-result-object v7

    .line 564
    if-nez v7, :cond_13

    .line 565
    .line 566
    move-object/from16 v24, v15

    .line 567
    .line 568
    goto :goto_7

    .line 569
    :cond_13
    move-object/from16 v24, v7

    .line 570
    .line 571
    :goto_7
    invoke-virtual {v2}, Lcom/zykj/study/bean/TokenResponse;->getResult()Lcom/zykj/study/bean/LoginResp;

    .line 572
    .line 573
    .line 574
    move-result-object v7

    .line 575
    invoke-virtual {v7}, Lcom/zykj/study/bean/LoginResp;->getRefreshToken()Ljava/lang/String;

    .line 576
    .line 577
    .line 578
    move-result-object v7

    .line 579
    if-nez v7, :cond_14

    .line 580
    .line 581
    move-object/from16 v25, v15

    .line 582
    .line 583
    goto :goto_8

    .line 584
    :cond_14
    move-object/from16 v25, v7

    .line 585
    .line 586
    :goto_8
    const/16 v26, 0x7

    .line 587
    .line 588
    const/16 v27, 0x0

    .line 589
    .line 590
    const/16 v21, 0x0

    .line 591
    .line 592
    const/16 v22, 0x0

    .line 593
    .line 594
    const/16 v23, 0x0

    .line 595
    .line 596
    invoke-static/range {v20 .. v27}, Lcom/zykj/http/bean/HeaderBean;->copy$default(Lcom/zykj/http/bean/HeaderBean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/zykj/http/bean/HeaderBean;

    .line 597
    .line 598
    .line 599
    move-result-object v7

    .line 600
    invoke-interface {v5, v6, v7}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 601
    .line 602
    .line 603
    move-result v6

    .line 604
    if-eqz v6, :cond_12

    .line 605
    .line 606
    invoke-virtual {v2}, Lcom/zykj/study/bean/TokenResponse;->getResult()Lcom/zykj/study/bean/LoginResp;

    .line 607
    .line 608
    .line 609
    move-result-object v5

    .line 610
    invoke-virtual {v5}, Lcom/zykj/study/bean/LoginResp;->getAccessToken()Ljava/lang/String;

    .line 611
    .line 612
    .line 613
    move-result-object v5

    .line 614
    if-eqz v5, :cond_19

    .line 615
    .line 616
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 617
    .line 618
    .line 619
    move-result v5

    .line 620
    if-nez v5, :cond_15

    .line 621
    .line 622
    goto :goto_c

    .line 623
    :cond_15
    invoke-static {v4}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 624
    .line 625
    .line 626
    move-result-object v4

    .line 627
    iput-object v4, v9, Lcom/zykj/study/provide/AccountRepositoryImp$login$1;->a:Ljava/lang/Object;

    .line 628
    .line 629
    iput-object v8, v9, Lcom/zykj/study/provide/AccountRepositoryImp$login$1;->b:Ljava/lang/Object;

    .line 630
    .line 631
    invoke-static {v1}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 632
    .line 633
    .line 634
    move-result-object v1

    .line 635
    iput-object v1, v9, Lcom/zykj/study/provide/AccountRepositoryImp$login$1;->c:Ljava/lang/Object;

    .line 636
    .line 637
    invoke-static {v13}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 638
    .line 639
    .line 640
    move-result-object v1

    .line 641
    iput-object v1, v9, Lcom/zykj/study/provide/AccountRepositoryImp$login$1;->d:Ljava/lang/Object;

    .line 642
    .line 643
    invoke-static/range {v19 .. v19}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 644
    .line 645
    .line 646
    move-result-object v1

    .line 647
    iput-object v1, v9, Lcom/zykj/study/provide/AccountRepositoryImp$login$1;->e:Ljava/lang/Object;

    .line 648
    .line 649
    iput-object v2, v9, Lcom/zykj/study/provide/AccountRepositoryImp$login$1;->f:Ljava/lang/Object;

    .line 650
    .line 651
    iput v11, v9, Lcom/zykj/study/provide/AccountRepositoryImp$login$1;->i:I

    .line 652
    .line 653
    invoke-virtual {v0, v9}, Lcom/zykj/study/provide/AccountRepositoryImp;->j(Lm7/c;)Ljava/lang/Object;

    .line 654
    .line 655
    .line 656
    move-result-object v1

    .line 657
    if-ne v1, v3, :cond_16

    .line 658
    .line 659
    :goto_9
    return-object v3

    .line 660
    :cond_16
    move-object v3, v2

    .line 661
    move-object v2, v1

    .line 662
    move-object v1, v3

    .line 663
    move-object v3, v8

    .line 664
    :goto_a
    check-cast v2, Lcom/zykj/study/bean/UserInfo;

    .line 665
    .line 666
    iget-object v4, v0, Lcom/zykj/study/provide/AccountRepositoryImp;->e:Lcom/zykj/lib/login/proto/UserBean;

    .line 667
    .line 668
    invoke-virtual {v4}, Lcom/google/protobuf/GeneratedMessageLite;->toBuilder()Lcom/google/protobuf/GeneratedMessageLite$Builder;

    .line 669
    .line 670
    .line 671
    move-result-object v4

    .line 672
    check-cast v4, Lcom/zykj/lib/login/proto/UserBean$Builder;

    .line 673
    .line 674
    invoke-virtual {v4, v3}, Lcom/zykj/lib/login/proto/UserBean$Builder;->setUserName(Ljava/lang/String;)Lcom/zykj/lib/login/proto/UserBean$Builder;

    .line 675
    .line 676
    .line 677
    move-result-object v3

    .line 678
    sget-object v4, Lcom/zykj/lib/login/proto/RoleType;->Teacher:Lcom/zykj/lib/login/proto/RoleType;

    .line 679
    .line 680
    invoke-virtual {v3, v4}, Lcom/zykj/lib/login/proto/UserBean$Builder;->setRole(Lcom/zykj/lib/login/proto/RoleType;)Lcom/zykj/lib/login/proto/UserBean$Builder;

    .line 681
    .line 682
    .line 683
    move-result-object v3

    .line 684
    invoke-virtual {v2}, Lcom/zykj/study/bean/UserInfo;->getId()Ljava/lang/String;

    .line 685
    .line 686
    .line 687
    move-result-object v4

    .line 688
    invoke-virtual {v3, v4}, Lcom/zykj/lib/login/proto/UserBean$Builder;->setId(Ljava/lang/String;)Lcom/zykj/lib/login/proto/UserBean$Builder;

    .line 689
    .line 690
    .line 691
    move-result-object v3

    .line 692
    invoke-virtual {v2}, Lcom/zykj/study/bean/UserInfo;->getName()Ljava/lang/String;

    .line 693
    .line 694
    .line 695
    move-result-object v4

    .line 696
    if-nez v4, :cond_17

    .line 697
    .line 698
    move-object v4, v15

    .line 699
    :cond_17
    invoke-virtual {v3, v4}, Lcom/zykj/lib/login/proto/UserBean$Builder;->setRealName(Ljava/lang/String;)Lcom/zykj/lib/login/proto/UserBean$Builder;

    .line 700
    .line 701
    .line 702
    move-result-object v3

    .line 703
    invoke-virtual {v2}, Lcom/zykj/study/bean/UserInfo;->getAvatar()Ljava/lang/String;

    .line 704
    .line 705
    .line 706
    move-result-object v2

    .line 707
    if-nez v2, :cond_18

    .line 708
    .line 709
    goto :goto_b

    .line 710
    :cond_18
    move-object v15, v2

    .line 711
    :goto_b
    invoke-virtual {v3, v15}, Lcom/zykj/lib/login/proto/UserBean$Builder;->setAvatar(Ljava/lang/String;)Lcom/zykj/lib/login/proto/UserBean$Builder;

    .line 712
    .line 713
    .line 714
    move-result-object v2

    .line 715
    invoke-virtual {v2}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 716
    .line 717
    .line 718
    move-result-object v2

    .line 719
    invoke-static {v2, v10}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 720
    .line 721
    .line 722
    check-cast v2, Lcom/zykj/lib/login/proto/UserBean;

    .line 723
    .line 724
    iput-object v2, v0, Lcom/zykj/study/provide/AccountRepositoryImp;->e:Lcom/zykj/lib/login/proto/UserBean;

    .line 725
    .line 726
    move-object v2, v1

    .line 727
    :cond_19
    :goto_c
    new-instance v1, Lcom/zykj/lib/login/bean/LoginInfo;

    .line 728
    .line 729
    invoke-virtual {v2}, Lcom/zykj/study/bean/TokenResponse;->getResult()Lcom/zykj/study/bean/LoginResp;

    .line 730
    .line 731
    .line 732
    move-result-object v3

    .line 733
    invoke-virtual {v3}, Lcom/zykj/study/bean/LoginResp;->getRoleType()I

    .line 734
    .line 735
    .line 736
    move-result v3

    .line 737
    if-ne v3, v14, :cond_1a

    .line 738
    .line 739
    const/4 v12, 0x1

    .line 740
    :cond_1a
    invoke-virtual {v2}, Lcom/zykj/study/bean/TokenResponse;->getResult()Lcom/zykj/study/bean/LoginResp;

    .line 741
    .line 742
    .line 743
    move-result-object v3

    .line 744
    invoke-virtual {v3}, Lcom/zykj/study/bean/LoginResp;->getNeedSmsVerification()Z

    .line 745
    .line 746
    .line 747
    move-result v3

    .line 748
    invoke-virtual {v2}, Lcom/zykj/study/bean/TokenResponse;->getResult()Lcom/zykj/study/bean/LoginResp;

    .line 749
    .line 750
    .line 751
    move-result-object v4

    .line 752
    invoke-virtual {v4}, Lcom/zykj/study/bean/LoginResp;->getNeedChangePwd()Z

    .line 753
    .line 754
    .line 755
    move-result v4

    .line 756
    invoke-virtual {v2}, Lcom/zykj/study/bean/TokenResponse;->getResult()Lcom/zykj/study/bean/LoginResp;

    .line 757
    .line 758
    .line 759
    move-result-object v2

    .line 760
    invoke-virtual {v2}, Lcom/zykj/study/bean/LoginResp;->getPasswordStrength()I

    .line 761
    .line 762
    .line 763
    move-result v2

    .line 764
    invoke-direct {v1, v12, v3, v4, v2}, Lcom/zykj/lib/login/bean/LoginInfo;-><init>(ZZZI)V

    .line 765
    .line 766
    .line 767
    return-object v1

    .line 768
    :cond_1b
    new-instance v1, Lcom/zykj/http/exception/RemoteCodeException;

    .line 769
    .line 770
    new-instance v2, Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 771
    .line 772
    sget v3, Lcom/zykj/study/R$string;->school_code_error:I

    .line 773
    .line 774
    invoke-static {v3}, Lo7/a;->c(I)Ljava/lang/Integer;

    .line 775
    .line 776
    .line 777
    move-result-object v5

    .line 778
    const/16 v7, 0x8

    .line 779
    .line 780
    const/4 v8, 0x0

    .line 781
    const/4 v3, 0x0

    .line 782
    const-string v4, "\u5b66\u6821\u4ee3\u7801\u9519\u8bef"

    .line 783
    .line 784
    const/4 v6, 0x0

    .line 785
    invoke-direct/range {v2 .. v8}, Lcom/zykj/lib/error/code/ErrorCodeInfo;-><init>(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 786
    .line 787
    .line 788
    invoke-direct {v1, v2}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCodeInfo;)V

    .line 789
    .line 790
    .line 791
    throw v1
.end method

.method public c()Lcom/zykj/lib/login/proto/ServerBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/provide/AccountRepositoryImp;->f:Lcom/zykj/lib/login/proto/ServerBean;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()Lcom/zykj/lib/login/proto/UserBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/provide/AccountRepositoryImp;->e:Lcom/zykj/lib/login/proto/UserBean;

    .line 2
    .line 3
    return-object v0
.end method

.method public e(Ljava/lang/String;Lm7/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/study/provide/AccountRepositoryImp;->a:Lo4/a;

    .line 2
    .line 3
    new-instance v1, Lcom/zykj/study/bean/UpdatePwdReq;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/study/provide/AccountRepositoryImp;->h:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {v1, v2, p1}, Lcom/zykj/study/bean/UpdatePwdReq;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1, p2}, Lo4/a;->c(Lcom/zykj/study/bean/UpdatePwdReq;Lm7/c;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    if-ne p1, p2, :cond_0

    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 22
    .line 23
    return-object p1
.end method

.method public f(Ljava/lang/String;Lm7/c;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    instance-of v2, v1, Lcom/zykj/study/provide/AccountRepositoryImp$verifySmsCode$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcom/zykj/study/provide/AccountRepositoryImp$verifySmsCode$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/zykj/study/provide/AccountRepositoryImp$verifySmsCode$1;->i:I

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
    iput v3, v2, Lcom/zykj/study/provide/AccountRepositoryImp$verifySmsCode$1;->i:I

    .line 22
    .line 23
    :goto_0
    move-object v8, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, Lcom/zykj/study/provide/AccountRepositoryImp$verifySmsCode$1;

    .line 26
    .line 27
    invoke-direct {v2, v0, v1}, Lcom/zykj/study/provide/AccountRepositoryImp$verifySmsCode$1;-><init>(Lcom/zykj/study/provide/AccountRepositoryImp;Lm7/c;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v1, v8, Lcom/zykj/study/provide/AccountRepositoryImp$verifySmsCode$1;->g:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iget v3, v8, Lcom/zykj/study/provide/AccountRepositoryImp$verifySmsCode$1;->i:I

    .line 38
    .line 39
    const-string v9, "build(...)"

    .line 40
    .line 41
    const/4 v10, 0x3

    .line 42
    const/4 v11, 0x0

    .line 43
    const/4 v12, 0x2

    .line 44
    const/4 v13, 0x1

    .line 45
    const-string v14, ""

    .line 46
    .line 47
    if-eqz v3, :cond_4

    .line 48
    .line 49
    if-eq v3, v13, :cond_3

    .line 50
    .line 51
    if-eq v3, v12, :cond_2

    .line 52
    .line 53
    if-ne v3, v10, :cond_1

    .line 54
    .line 55
    iget-object v2, v8, Lcom/zykj/study/provide/AccountRepositoryImp$verifySmsCode$1;->f:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v2, Lcom/zykj/study/bean/TokenResponse;

    .line 58
    .line 59
    iget-object v3, v8, Lcom/zykj/study/provide/AccountRepositoryImp$verifySmsCode$1;->e:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v3, Ljava/lang/String;

    .line 62
    .line 63
    iget-object v3, v8, Lcom/zykj/study/provide/AccountRepositoryImp$verifySmsCode$1;->d:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v3, Ljava/lang/String;

    .line 66
    .line 67
    iget-object v3, v8, Lcom/zykj/study/provide/AccountRepositoryImp$verifySmsCode$1;->c:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v3, Ljava/lang/String;

    .line 70
    .line 71
    iget-object v4, v8, Lcom/zykj/study/provide/AccountRepositoryImp$verifySmsCode$1;->b:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v4, Ljava/lang/String;

    .line 74
    .line 75
    iget-object v4, v8, Lcom/zykj/study/provide/AccountRepositoryImp$verifySmsCode$1;->a:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v4, Ljava/lang/String;

    .line 78
    .line 79
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    goto/16 :goto_b

    .line 83
    .line 84
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 85
    .line 86
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 87
    .line 88
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw v1

    .line 92
    :cond_2
    iget-object v3, v8, Lcom/zykj/study/provide/AccountRepositoryImp$verifySmsCode$1;->e:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v3, Ljava/lang/String;

    .line 95
    .line 96
    iget-object v4, v8, Lcom/zykj/study/provide/AccountRepositoryImp$verifySmsCode$1;->d:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v4, Ljava/lang/String;

    .line 99
    .line 100
    iget-object v5, v8, Lcom/zykj/study/provide/AccountRepositoryImp$verifySmsCode$1;->c:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v5, Ljava/lang/String;

    .line 103
    .line 104
    iget-object v6, v8, Lcom/zykj/study/provide/AccountRepositoryImp$verifySmsCode$1;->b:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v6, Ljava/lang/String;

    .line 107
    .line 108
    iget-object v7, v8, Lcom/zykj/study/provide/AccountRepositoryImp$verifySmsCode$1;->a:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v7, Ljava/lang/String;

    .line 111
    .line 112
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    move-object/from16 v18, v3

    .line 116
    .line 117
    move-object v3, v5

    .line 118
    goto/16 :goto_4

    .line 119
    .line 120
    :cond_3
    iget-object v3, v8, Lcom/zykj/study/provide/AccountRepositoryImp$verifySmsCode$1;->d:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v3, Ljava/lang/String;

    .line 123
    .line 124
    iget-object v4, v8, Lcom/zykj/study/provide/AccountRepositoryImp$verifySmsCode$1;->c:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v4, Ljava/lang/String;

    .line 127
    .line 128
    iget-object v5, v8, Lcom/zykj/study/provide/AccountRepositoryImp$verifySmsCode$1;->b:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v5, Ljava/lang/String;

    .line 131
    .line 132
    iget-object v6, v8, Lcom/zykj/study/provide/AccountRepositoryImp$verifySmsCode$1;->a:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v6, Ljava/lang/String;

    .line 135
    .line 136
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    move-object/from16 v17, v3

    .line 140
    .line 141
    move-object v3, v5

    .line 142
    move-object/from16 v22, v6

    .line 143
    .line 144
    :goto_2
    move-object/from16 v16, v4

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_4
    invoke-static {v1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    iget-object v1, v0, Lcom/zykj/study/provide/AccountRepositoryImp;->f:Lcom/zykj/lib/login/proto/ServerBean;

    .line 151
    .line 152
    invoke-virtual {v1}, Lcom/zykj/lib/login/proto/ServerBean;->getSchoolCode()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    iget-object v3, v0, Lcom/zykj/study/provide/AccountRepositoryImp;->e:Lcom/zykj/lib/login/proto/UserBean;

    .line 157
    .line 158
    invoke-virtual {v3}, Lcom/zykj/lib/login/proto/UserBean;->getUserName()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v4

    .line 162
    iget-object v3, v0, Lcom/zykj/study/provide/AccountRepositoryImp;->h:Ljava/lang/String;

    .line 163
    .line 164
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    invoke-static {v4}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    move-object/from16 v5, p1

    .line 171
    .line 172
    iput-object v5, v8, Lcom/zykj/study/provide/AccountRepositoryImp$verifySmsCode$1;->a:Ljava/lang/Object;

    .line 173
    .line 174
    iput-object v1, v8, Lcom/zykj/study/provide/AccountRepositoryImp$verifySmsCode$1;->b:Ljava/lang/Object;

    .line 175
    .line 176
    iput-object v4, v8, Lcom/zykj/study/provide/AccountRepositoryImp$verifySmsCode$1;->c:Ljava/lang/Object;

    .line 177
    .line 178
    iput-object v3, v8, Lcom/zykj/study/provide/AccountRepositoryImp$verifySmsCode$1;->d:Ljava/lang/Object;

    .line 179
    .line 180
    iput v13, v8, Lcom/zykj/study/provide/AccountRepositoryImp$verifySmsCode$1;->i:I

    .line 181
    .line 182
    invoke-virtual {v0, v1, v4, v8}, Lcom/zykj/study/provide/AccountRepositoryImp;->i(Ljava/lang/String;Ljava/lang/String;Lm7/c;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v6

    .line 186
    if-ne v6, v2, :cond_5

    .line 187
    .line 188
    goto/16 :goto_a

    .line 189
    .line 190
    :cond_5
    move-object/from16 v17, v3

    .line 191
    .line 192
    move-object/from16 v22, v5

    .line 193
    .line 194
    move-object v3, v1

    .line 195
    move-object v1, v6

    .line 196
    goto :goto_2

    .line 197
    :goto_3
    move-object/from16 v18, v1

    .line 198
    .line 199
    check-cast v18, Ljava/lang/String;

    .line 200
    .line 201
    iget-object v1, v0, Lcom/zykj/study/provide/AccountRepositoryImp;->a:Lo4/a;

    .line 202
    .line 203
    new-instance v15, Lcom/zykj/study/bean/TokenReq;

    .line 204
    .line 205
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    const/16 v23, 0x38

    .line 209
    .line 210
    const/16 v24, 0x0

    .line 211
    .line 212
    const/16 v19, 0x0

    .line 213
    .line 214
    const/16 v20, 0x0

    .line 215
    .line 216
    const/16 v21, 0x0

    .line 217
    .line 218
    invoke-direct/range {v15 .. v24}, Lcom/zykj/study/bean/TokenReq;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLjava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 219
    .line 220
    .line 221
    move-object v4, v15

    .line 222
    move-object/from16 v15, v16

    .line 223
    .line 224
    invoke-static/range {v22 .. v22}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v5

    .line 228
    iput-object v5, v8, Lcom/zykj/study/provide/AccountRepositoryImp$verifySmsCode$1;->a:Ljava/lang/Object;

    .line 229
    .line 230
    iput-object v3, v8, Lcom/zykj/study/provide/AccountRepositoryImp$verifySmsCode$1;->b:Ljava/lang/Object;

    .line 231
    .line 232
    iput-object v15, v8, Lcom/zykj/study/provide/AccountRepositoryImp$verifySmsCode$1;->c:Ljava/lang/Object;

    .line 233
    .line 234
    invoke-static/range {v17 .. v17}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v5

    .line 238
    iput-object v5, v8, Lcom/zykj/study/provide/AccountRepositoryImp$verifySmsCode$1;->d:Ljava/lang/Object;

    .line 239
    .line 240
    invoke-static/range {v18 .. v18}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v5

    .line 244
    iput-object v5, v8, Lcom/zykj/study/provide/AccountRepositoryImp$verifySmsCode$1;->e:Ljava/lang/Object;

    .line 245
    .line 246
    iput v12, v8, Lcom/zykj/study/provide/AccountRepositoryImp$verifySmsCode$1;->i:I

    .line 247
    .line 248
    const-string v5, "com.zhongyukejiao.learningexpert"

    .line 249
    .line 250
    const/16 v6, 0x2777

    .line 251
    .line 252
    move-object v7, v3

    .line 253
    move-object v3, v1

    .line 254
    move-object v1, v7

    .line 255
    move-object/from16 v7, v18

    .line 256
    .line 257
    invoke-interface/range {v3 .. v8}, Lo4/a;->d(Lcom/zykj/study/bean/TokenReq;Ljava/lang/String;ILjava/lang/String;Lm7/c;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v3

    .line 261
    if-ne v3, v2, :cond_6

    .line 262
    .line 263
    goto/16 :goto_a

    .line 264
    .line 265
    :cond_6
    move-object v6, v1

    .line 266
    move-object v1, v3

    .line 267
    move-object v3, v15

    .line 268
    move-object/from16 v4, v17

    .line 269
    .line 270
    move-object/from16 v7, v22

    .line 271
    .line 272
    :goto_4
    check-cast v1, Lcom/zykj/study/bean/TokenResponse;

    .line 273
    .line 274
    invoke-virtual {v1}, Lcom/zykj/study/bean/TokenResponse;->getResult()Lcom/zykj/study/bean/LoginResp;

    .line 275
    .line 276
    .line 277
    move-result-object v5

    .line 278
    if-nez v5, :cond_a

    .line 279
    .line 280
    new-instance v2, Lcom/zykj/http/exception/RemoteCodeException;

    .line 281
    .line 282
    new-instance v3, Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 283
    .line 284
    invoke-virtual {v1}, Lcom/zykj/study/bean/TokenResponse;->getError()Lcom/zykj/study/bean/ErrorRemote;

    .line 285
    .line 286
    .line 287
    move-result-object v4

    .line 288
    if-eqz v4, :cond_7

    .line 289
    .line 290
    invoke-virtual {v4}, Lcom/zykj/study/bean/ErrorRemote;->getCode()I

    .line 291
    .line 292
    .line 293
    move-result v11

    .line 294
    :cond_7
    move v4, v11

    .line 295
    invoke-virtual {v1}, Lcom/zykj/study/bean/TokenResponse;->getError()Lcom/zykj/study/bean/ErrorRemote;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    if-eqz v1, :cond_9

    .line 300
    .line 301
    invoke-virtual {v1}, Lcom/zykj/study/bean/ErrorRemote;->getMessage()Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v1

    .line 305
    if-nez v1, :cond_8

    .line 306
    .line 307
    goto :goto_5

    .line 308
    :cond_8
    move-object v7, v1

    .line 309
    goto :goto_6

    .line 310
    :cond_9
    :goto_5
    move-object v7, v14

    .line 311
    :goto_6
    const/4 v8, 0x4

    .line 312
    const/4 v9, 0x0

    .line 313
    const-string v5, "\u9a8c\u8bc1\u7801\u9a8c\u8bc1\u5931\u8d25"

    .line 314
    .line 315
    const/4 v6, 0x0

    .line 316
    invoke-direct/range {v3 .. v9}, Lcom/zykj/lib/error/code/ErrorCodeInfo;-><init>(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 317
    .line 318
    .line 319
    invoke-direct {v2, v3}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCodeInfo;)V

    .line 320
    .line 321
    .line 322
    throw v2

    .line 323
    :cond_a
    invoke-virtual {v1}, Lcom/zykj/study/bean/TokenResponse;->getResult()Lcom/zykj/study/bean/LoginResp;

    .line 324
    .line 325
    .line 326
    move-result-object v5

    .line 327
    invoke-virtual {v5}, Lcom/zykj/study/bean/LoginResp;->getUserId()J

    .line 328
    .line 329
    .line 330
    move-result-wide v15

    .line 331
    invoke-static/range {v15 .. v16}, Le5/n;->b(J)V

    .line 332
    .line 333
    .line 334
    iget-object v5, v0, Lcom/zykj/study/provide/AccountRepositoryImp;->f:Lcom/zykj/lib/login/proto/ServerBean;

    .line 335
    .line 336
    invoke-virtual {v5}, Lcom/google/protobuf/GeneratedMessageLite;->toBuilder()Lcom/google/protobuf/GeneratedMessageLite$Builder;

    .line 337
    .line 338
    .line 339
    move-result-object v5

    .line 340
    check-cast v5, Lcom/zykj/lib/login/proto/ServerBean$Builder;

    .line 341
    .line 342
    invoke-virtual {v5, v6}, Lcom/zykj/lib/login/proto/ServerBean$Builder;->setSchoolCode(Ljava/lang/String;)Lcom/zykj/lib/login/proto/ServerBean$Builder;

    .line 343
    .line 344
    .line 345
    move-result-object v5

    .line 346
    invoke-virtual {v1}, Lcom/zykj/study/bean/TokenResponse;->getResult()Lcom/zykj/study/bean/LoginResp;

    .line 347
    .line 348
    .line 349
    move-result-object v15

    .line 350
    invoke-virtual {v15}, Lcom/zykj/study/bean/LoginResp;->getAccessToken()Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object v15

    .line 354
    if-nez v15, :cond_b

    .line 355
    .line 356
    move-object v15, v14

    .line 357
    :cond_b
    invoke-virtual {v5, v15}, Lcom/zykj/lib/login/proto/ServerBean$Builder;->setAccessToken(Ljava/lang/String;)Lcom/zykj/lib/login/proto/ServerBean$Builder;

    .line 358
    .line 359
    .line 360
    move-result-object v5

    .line 361
    invoke-virtual {v1}, Lcom/zykj/study/bean/TokenResponse;->getResult()Lcom/zykj/study/bean/LoginResp;

    .line 362
    .line 363
    .line 364
    move-result-object v15

    .line 365
    invoke-virtual {v15}, Lcom/zykj/study/bean/LoginResp;->getRefreshToken()Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v15

    .line 369
    if-nez v15, :cond_c

    .line 370
    .line 371
    move-object v15, v14

    .line 372
    :cond_c
    invoke-virtual {v5, v15}, Lcom/zykj/lib/login/proto/ServerBean$Builder;->setRefreshToken(Ljava/lang/String;)Lcom/zykj/lib/login/proto/ServerBean$Builder;

    .line 373
    .line 374
    .line 375
    move-result-object v5

    .line 376
    invoke-virtual {v5}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 377
    .line 378
    .line 379
    move-result-object v5

    .line 380
    invoke-static {v5, v9}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    check-cast v5, Lcom/zykj/lib/login/proto/ServerBean;

    .line 384
    .line 385
    iput-object v5, v0, Lcom/zykj/study/provide/AccountRepositoryImp;->f:Lcom/zykj/lib/login/proto/ServerBean;

    .line 386
    .line 387
    invoke-virtual {v1}, Lcom/zykj/study/bean/TokenResponse;->getResult()Lcom/zykj/study/bean/LoginResp;

    .line 388
    .line 389
    .line 390
    move-result-object v5

    .line 391
    invoke-virtual {v5}, Lcom/zykj/study/bean/LoginResp;->getClientCode()Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v5

    .line 395
    sget-object v15, Le5/h;->a:Le5/h;

    .line 396
    .line 397
    invoke-static {v6}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 398
    .line 399
    .line 400
    invoke-static {v3}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 401
    .line 402
    .line 403
    if-nez v5, :cond_d

    .line 404
    .line 405
    move-object v5, v14

    .line 406
    :cond_d
    invoke-virtual {v15, v6, v3, v5}, Le5/h;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 407
    .line 408
    .line 409
    iget-object v5, v0, Lcom/zykj/study/provide/AccountRepositoryImp;->d:Lcom/zykj/study/bean/ClientCodeLiveData;

    .line 410
    .line 411
    invoke-virtual {v15, v6, v3}, Le5/h;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v15

    .line 415
    invoke-virtual {v5, v15}, Landroidx/lifecycle/MutableLiveData;->postValue(Ljava/lang/Object;)V

    .line 416
    .line 417
    .line 418
    iget-object v5, v0, Lcom/zykj/study/provide/AccountRepositoryImp;->c:Ll8/h;

    .line 419
    .line 420
    :goto_7
    invoke-interface {v5}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v15

    .line 424
    move-object/from16 v19, v15

    .line 425
    .line 426
    check-cast v19, Lcom/zykj/http/bean/HeaderBean;

    .line 427
    .line 428
    invoke-virtual {v1}, Lcom/zykj/study/bean/TokenResponse;->getResult()Lcom/zykj/study/bean/LoginResp;

    .line 429
    .line 430
    .line 431
    move-result-object v16

    .line 432
    invoke-virtual/range {v16 .. v16}, Lcom/zykj/study/bean/LoginResp;->getAccessToken()Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object v16

    .line 436
    if-nez v16, :cond_e

    .line 437
    .line 438
    move-object/from16 v23, v14

    .line 439
    .line 440
    goto :goto_8

    .line 441
    :cond_e
    move-object/from16 v23, v16

    .line 442
    .line 443
    :goto_8
    invoke-virtual {v1}, Lcom/zykj/study/bean/TokenResponse;->getResult()Lcom/zykj/study/bean/LoginResp;

    .line 444
    .line 445
    .line 446
    move-result-object v16

    .line 447
    invoke-virtual/range {v16 .. v16}, Lcom/zykj/study/bean/LoginResp;->getRefreshToken()Ljava/lang/String;

    .line 448
    .line 449
    .line 450
    move-result-object v16

    .line 451
    if-nez v16, :cond_f

    .line 452
    .line 453
    move-object/from16 v24, v14

    .line 454
    .line 455
    goto :goto_9

    .line 456
    :cond_f
    move-object/from16 v24, v16

    .line 457
    .line 458
    :goto_9
    const/16 v25, 0x7

    .line 459
    .line 460
    const/16 v26, 0x0

    .line 461
    .line 462
    const/16 v20, 0x0

    .line 463
    .line 464
    const/16 v21, 0x0

    .line 465
    .line 466
    const/16 v22, 0x0

    .line 467
    .line 468
    invoke-static/range {v19 .. v26}, Lcom/zykj/http/bean/HeaderBean;->copy$default(Lcom/zykj/http/bean/HeaderBean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/zykj/http/bean/HeaderBean;

    .line 469
    .line 470
    .line 471
    move-result-object v13

    .line 472
    invoke-interface {v5, v15, v13}, Ll8/h;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 473
    .line 474
    .line 475
    move-result v13

    .line 476
    if-eqz v13, :cond_16

    .line 477
    .line 478
    invoke-virtual {v1}, Lcom/zykj/study/bean/TokenResponse;->getResult()Lcom/zykj/study/bean/LoginResp;

    .line 479
    .line 480
    .line 481
    move-result-object v5

    .line 482
    invoke-virtual {v5}, Lcom/zykj/study/bean/LoginResp;->getAccessToken()Ljava/lang/String;

    .line 483
    .line 484
    .line 485
    move-result-object v5

    .line 486
    if-eqz v5, :cond_14

    .line 487
    .line 488
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 489
    .line 490
    .line 491
    move-result v5

    .line 492
    if-nez v5, :cond_10

    .line 493
    .line 494
    goto :goto_d

    .line 495
    :cond_10
    invoke-static {v7}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object v5

    .line 499
    iput-object v5, v8, Lcom/zykj/study/provide/AccountRepositoryImp$verifySmsCode$1;->a:Ljava/lang/Object;

    .line 500
    .line 501
    invoke-static {v6}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object v5

    .line 505
    iput-object v5, v8, Lcom/zykj/study/provide/AccountRepositoryImp$verifySmsCode$1;->b:Ljava/lang/Object;

    .line 506
    .line 507
    iput-object v3, v8, Lcom/zykj/study/provide/AccountRepositoryImp$verifySmsCode$1;->c:Ljava/lang/Object;

    .line 508
    .line 509
    invoke-static {v4}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v4

    .line 513
    iput-object v4, v8, Lcom/zykj/study/provide/AccountRepositoryImp$verifySmsCode$1;->d:Ljava/lang/Object;

    .line 514
    .line 515
    invoke-static/range {v18 .. v18}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 516
    .line 517
    .line 518
    move-result-object v4

    .line 519
    iput-object v4, v8, Lcom/zykj/study/provide/AccountRepositoryImp$verifySmsCode$1;->e:Ljava/lang/Object;

    .line 520
    .line 521
    iput-object v1, v8, Lcom/zykj/study/provide/AccountRepositoryImp$verifySmsCode$1;->f:Ljava/lang/Object;

    .line 522
    .line 523
    iput v10, v8, Lcom/zykj/study/provide/AccountRepositoryImp$verifySmsCode$1;->i:I

    .line 524
    .line 525
    invoke-virtual {v0, v8}, Lcom/zykj/study/provide/AccountRepositoryImp;->j(Lm7/c;)Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object v4

    .line 529
    if-ne v4, v2, :cond_11

    .line 530
    .line 531
    :goto_a
    return-object v2

    .line 532
    :cond_11
    move-object v2, v1

    .line 533
    move-object v1, v4

    .line 534
    :goto_b
    check-cast v1, Lcom/zykj/study/bean/UserInfo;

    .line 535
    .line 536
    iget-object v4, v0, Lcom/zykj/study/provide/AccountRepositoryImp;->e:Lcom/zykj/lib/login/proto/UserBean;

    .line 537
    .line 538
    invoke-virtual {v4}, Lcom/google/protobuf/GeneratedMessageLite;->toBuilder()Lcom/google/protobuf/GeneratedMessageLite$Builder;

    .line 539
    .line 540
    .line 541
    move-result-object v4

    .line 542
    check-cast v4, Lcom/zykj/lib/login/proto/UserBean$Builder;

    .line 543
    .line 544
    invoke-virtual {v4, v3}, Lcom/zykj/lib/login/proto/UserBean$Builder;->setUserName(Ljava/lang/String;)Lcom/zykj/lib/login/proto/UserBean$Builder;

    .line 545
    .line 546
    .line 547
    move-result-object v3

    .line 548
    sget-object v4, Lcom/zykj/lib/login/proto/RoleType;->Teacher:Lcom/zykj/lib/login/proto/RoleType;

    .line 549
    .line 550
    invoke-virtual {v3, v4}, Lcom/zykj/lib/login/proto/UserBean$Builder;->setRole(Lcom/zykj/lib/login/proto/RoleType;)Lcom/zykj/lib/login/proto/UserBean$Builder;

    .line 551
    .line 552
    .line 553
    move-result-object v3

    .line 554
    invoke-virtual {v1}, Lcom/zykj/study/bean/UserInfo;->getId()Ljava/lang/String;

    .line 555
    .line 556
    .line 557
    move-result-object v4

    .line 558
    invoke-virtual {v3, v4}, Lcom/zykj/lib/login/proto/UserBean$Builder;->setId(Ljava/lang/String;)Lcom/zykj/lib/login/proto/UserBean$Builder;

    .line 559
    .line 560
    .line 561
    move-result-object v3

    .line 562
    invoke-virtual {v1}, Lcom/zykj/study/bean/UserInfo;->getName()Ljava/lang/String;

    .line 563
    .line 564
    .line 565
    move-result-object v4

    .line 566
    if-nez v4, :cond_12

    .line 567
    .line 568
    move-object v4, v14

    .line 569
    :cond_12
    invoke-virtual {v3, v4}, Lcom/zykj/lib/login/proto/UserBean$Builder;->setRealName(Ljava/lang/String;)Lcom/zykj/lib/login/proto/UserBean$Builder;

    .line 570
    .line 571
    .line 572
    move-result-object v3

    .line 573
    invoke-virtual {v1}, Lcom/zykj/study/bean/UserInfo;->getAvatar()Ljava/lang/String;

    .line 574
    .line 575
    .line 576
    move-result-object v1

    .line 577
    if-nez v1, :cond_13

    .line 578
    .line 579
    goto :goto_c

    .line 580
    :cond_13
    move-object v14, v1

    .line 581
    :goto_c
    invoke-virtual {v3, v14}, Lcom/zykj/lib/login/proto/UserBean$Builder;->setAvatar(Ljava/lang/String;)Lcom/zykj/lib/login/proto/UserBean$Builder;

    .line 582
    .line 583
    .line 584
    move-result-object v1

    .line 585
    invoke-virtual {v1}, Lcom/google/protobuf/GeneratedMessageLite$Builder;->build()Lcom/google/protobuf/GeneratedMessageLite;

    .line 586
    .line 587
    .line 588
    move-result-object v1

    .line 589
    invoke-static {v1, v9}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 590
    .line 591
    .line 592
    check-cast v1, Lcom/zykj/lib/login/proto/UserBean;

    .line 593
    .line 594
    iput-object v1, v0, Lcom/zykj/study/provide/AccountRepositoryImp;->e:Lcom/zykj/lib/login/proto/UserBean;

    .line 595
    .line 596
    move-object v1, v2

    .line 597
    :cond_14
    :goto_d
    new-instance v2, Lcom/zykj/lib/login/bean/LoginInfo;

    .line 598
    .line 599
    invoke-virtual {v1}, Lcom/zykj/study/bean/TokenResponse;->getResult()Lcom/zykj/study/bean/LoginResp;

    .line 600
    .line 601
    .line 602
    move-result-object v3

    .line 603
    invoke-virtual {v3}, Lcom/zykj/study/bean/LoginResp;->getRoleType()I

    .line 604
    .line 605
    .line 606
    move-result v3

    .line 607
    if-ne v3, v12, :cond_15

    .line 608
    .line 609
    const/4 v13, 0x1

    .line 610
    goto :goto_e

    .line 611
    :cond_15
    move v13, v11

    .line 612
    :goto_e
    invoke-virtual {v1}, Lcom/zykj/study/bean/TokenResponse;->getResult()Lcom/zykj/study/bean/LoginResp;

    .line 613
    .line 614
    .line 615
    move-result-object v3

    .line 616
    invoke-virtual {v3}, Lcom/zykj/study/bean/LoginResp;->getNeedChangePwd()Z

    .line 617
    .line 618
    .line 619
    move-result v3

    .line 620
    invoke-virtual {v1}, Lcom/zykj/study/bean/TokenResponse;->getResult()Lcom/zykj/study/bean/LoginResp;

    .line 621
    .line 622
    .line 623
    move-result-object v1

    .line 624
    invoke-virtual {v1}, Lcom/zykj/study/bean/LoginResp;->getPasswordStrength()I

    .line 625
    .line 626
    .line 627
    move-result v1

    .line 628
    invoke-direct {v2, v13, v11, v3, v1}, Lcom/zykj/lib/login/bean/LoginInfo;-><init>(ZZZI)V

    .line 629
    .line 630
    .line 631
    return-object v2

    .line 632
    :cond_16
    const/4 v13, 0x1

    .line 633
    goto/16 :goto_7
.end method

.method public g(Lm7/c;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p1, Lcom/zykj/study/provide/AccountRepositoryImp$sendSms$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/study/provide/AccountRepositoryImp$sendSms$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/provide/AccountRepositoryImp$sendSms$1;->c:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/zykj/study/provide/AccountRepositoryImp$sendSms$1;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/provide/AccountRepositoryImp$sendSms$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/study/provide/AccountRepositoryImp$sendSms$1;-><init>(Lcom/zykj/study/provide/AccountRepositoryImp;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/study/provide/AccountRepositoryImp$sendSms$1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/provide/AccountRepositoryImp$sendSms$1;->c:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lcom/zykj/study/provide/AccountRepositoryImp;->a:Lo4/a;

    .line 54
    .line 55
    new-instance v4, Lcom/zykj/study/bean/SmsReq;

    .line 56
    .line 57
    invoke-static {}, Le5/n;->a()J

    .line 58
    .line 59
    .line 60
    move-result-wide v5

    .line 61
    sget-object v2, Le5/h;->a:Le5/h;

    .line 62
    .line 63
    invoke-virtual {v2}, Le5/h;->a()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v8

    .line 67
    const/4 v9, 0x2

    .line 68
    const/4 v10, 0x0

    .line 69
    const/4 v7, 0x0

    .line 70
    invoke-direct/range {v4 .. v10}, Lcom/zykj/study/bean/SmsReq;-><init>(JLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 71
    .line 72
    .line 73
    iget-object v2, p0, Lcom/zykj/study/provide/AccountRepositoryImp;->f:Lcom/zykj/lib/login/proto/ServerBean;

    .line 74
    .line 75
    invoke-virtual {v2}, Lcom/zykj/lib/login/proto/ServerBean;->getAccessToken()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    new-instance v5, Ljava/lang/StringBuilder;

    .line 80
    .line 81
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 82
    .line 83
    .line 84
    const-string v6, "Bearer "

    .line 85
    .line 86
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    iput v3, v0, Lcom/zykj/study/provide/AccountRepositoryImp$sendSms$1;->c:I

    .line 97
    .line 98
    invoke-interface {p1, v4, v2, v0}, Lo4/a;->a(Lcom/zykj/study/bean/SmsReq;Ljava/lang/String;Lm7/c;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    if-ne p1, v1, :cond_3

    .line 103
    .line 104
    return-object v1

    .line 105
    :cond_3
    :goto_1
    check-cast p1, Lcom/zykj/http/bean/ApiResp;

    .line 106
    .line 107
    invoke-virtual {p1}, Lcom/zykj/http/bean/ApiResp;->getSuccess()Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-nez v0, :cond_6

    .line 112
    .line 113
    new-instance v0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 114
    .line 115
    new-instance v1, Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 116
    .line 117
    invoke-virtual {p1}, Lcom/zykj/http/bean/ApiResp;->getError()Lcom/zykj/http/bean/ErrorInfo;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    if-eqz v2, :cond_4

    .line 122
    .line 123
    invoke-virtual {v2}, Lcom/zykj/http/bean/ErrorInfo;->getCode()I

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    goto :goto_2

    .line 128
    :cond_4
    const/4 v2, 0x0

    .line 129
    :goto_2
    invoke-virtual {p1}, Lcom/zykj/http/bean/ApiResp;->getError()Lcom/zykj/http/bean/ErrorInfo;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    if-eqz p1, :cond_5

    .line 134
    .line 135
    invoke-virtual {p1}, Lcom/zykj/http/bean/ErrorInfo;->getMessage()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    :goto_3
    move-object v5, p1

    .line 140
    goto :goto_4

    .line 141
    :cond_5
    const/4 p1, 0x0

    .line 142
    goto :goto_3

    .line 143
    :goto_4
    const/4 v6, 0x4

    .line 144
    const/4 v7, 0x0

    .line 145
    const-string v3, "\u9a8c\u8bc1\u7801\u53d1\u9001\u5931\u8d25"

    .line 146
    .line 147
    const/4 v4, 0x0

    .line 148
    invoke-direct/range {v1 .. v7}, Lcom/zykj/lib/error/code/ErrorCodeInfo;-><init>(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 149
    .line 150
    .line 151
    invoke-direct {v0, v1}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCodeInfo;)V

    .line 152
    .line 153
    .line 154
    throw v0

    .line 155
    :cond_6
    invoke-static {v3}, Lo7/a;->a(Z)Ljava/lang/Boolean;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    return-object p1
.end method

.method public final i(Ljava/lang/String;Ljava/lang/String;Lm7/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/study/provide/AccountRepositoryImp;->i:Ljava/lang/String;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    invoke-static {}, Li8/i0;->b()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, Lcom/zykj/study/provide/AccountRepositoryImp$getDeviceId$2$1;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-direct {v1, p1, p2, v2}, Lcom/zykj/study/provide/AccountRepositoryImp$getDeviceId$2$1;-><init>(Ljava/lang/String;Ljava/lang/String;Lm7/c;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1, p3}, Li8/f;->g(Lkotlin/coroutines/d;Lx7/p;Lm7/c;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    if-ne p1, p2, :cond_0

    .line 28
    .line 29
    return-object p1

    .line 30
    :cond_0
    check-cast p1, Ljava/lang/String;

    .line 31
    .line 32
    return-object p1

    .line 33
    :cond_1
    return-object v0
.end method

.method public final j(Lm7/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p1, Lcom/zykj/study/provide/AccountRepositoryImp$getUserInfo$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lcom/zykj/study/provide/AccountRepositoryImp$getUserInfo$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/study/provide/AccountRepositoryImp$getUserInfo$1;->c:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/zykj/study/provide/AccountRepositoryImp$getUserInfo$1;->c:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/zykj/study/provide/AccountRepositoryImp$getUserInfo$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lcom/zykj/study/provide/AccountRepositoryImp$getUserInfo$1;-><init>(Lcom/zykj/study/provide/AccountRepositoryImp;Lm7/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lcom/zykj/study/provide/AccountRepositoryImp$getUserInfo$1;->a:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/zykj/study/provide/AccountRepositoryImp$getUserInfo$1;->c:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lcom/zykj/study/provide/AccountRepositoryImp;->a:Lo4/a;

    .line 54
    .line 55
    iput v3, v0, Lcom/zykj/study/provide/AccountRepositoryImp$getUserInfo$1;->c:I

    .line 56
    .line 57
    invoke-interface {p1, v0}, Lo4/a;->b(Lm7/c;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    if-ne p1, v1, :cond_3

    .line 62
    .line 63
    return-object v1

    .line 64
    :cond_3
    :goto_1
    check-cast p1, Lcom/zykj/study/bean/UserResponse;

    .line 65
    .line 66
    invoke-virtual {p1}, Lcom/zykj/study/bean/UserResponse;->getCode()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-nez v0, :cond_4

    .line 71
    .line 72
    invoke-virtual {p1}, Lcom/zykj/study/bean/UserResponse;->getResult()Lcom/zykj/study/bean/UserInfo;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    if-eqz v0, :cond_4

    .line 77
    .line 78
    invoke-virtual {p1}, Lcom/zykj/study/bean/UserResponse;->getResult()Lcom/zykj/study/bean/UserInfo;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    return-object p1

    .line 83
    :cond_4
    new-instance v0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 84
    .line 85
    new-instance v1, Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 86
    .line 87
    invoke-virtual {p1}, Lcom/zykj/study/bean/UserResponse;->getCode()I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    invoke-virtual {p1}, Lcom/zykj/study/bean/UserResponse;->getMessage()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    const/4 v6, 0x4

    .line 96
    const/4 v7, 0x0

    .line 97
    const-string v3, "\u7528\u6237\u4fe1\u606f\u83b7\u53d6\u5931\u8d25"

    .line 98
    .line 99
    const/4 v4, 0x0

    .line 100
    invoke-direct/range {v1 .. v7}, Lcom/zykj/lib/error/code/ErrorCodeInfo;-><init>(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 101
    .line 102
    .line 103
    invoke-direct {v0, v1}, Lcom/zykj/http/exception/RemoteCodeException;-><init>(Lcom/zykj/lib/error/code/ErrorCodeInfo;)V

    .line 104
    .line 105
    .line 106
    throw v0
.end method

.method public final k(Ljava/lang/String;Z)V
    .locals 2

    .line 1
    sget-object v0, Le5/e;->a:Le5/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Le5/e;->e(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v1, "dev"

    .line 7
    .line 8
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    const-string p2, "http://ykcx-pad-dev.xxg.zyyx.cc:8010/"

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    if-eqz p2, :cond_1

    .line 18
    .line 19
    const-string p2, "https://ykcx-pad.zyai.cc/"

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const-string p2, "http://ykcx-pad.school.zykj.org/"

    .line 23
    .line 24
    :goto_0
    invoke-virtual {v0, p1}, Le5/e;->e(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p2}, Le5/e;->f(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method
