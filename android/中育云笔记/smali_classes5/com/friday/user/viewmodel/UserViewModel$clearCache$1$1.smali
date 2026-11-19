.class final Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/user/viewmodel/UserViewModel$clearCache$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.friday.user.viewmodel.UserViewModel$clearCache$1$1"
    f = "UserViewModel.kt"
    l = {
        0x54,
        0x5f,
        0x61,
        0x63,
        0x69,
        0x71,
        0x89,
        0x8a,
        0x8f
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:J

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;

.field public m:Ljava/lang/Object;

.field public n:Ljava/lang/Object;

.field public o:I

.field public p:I

.field public q:I

.field public final synthetic r:Lcom/friday/user/viewmodel/UserViewModel;


# direct methods
.method public constructor <init>(Lcom/friday/user/viewmodel/UserViewModel;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->r:Lcom/friday/user/viewmodel/UserViewModel;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 1

    .line 1
    new-instance p1, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->r:Lcom/friday/user/viewmodel/UserViewModel;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;-><init>(Lcom/friday/user/viewmodel/UserViewModel;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v4, p0

    .line 2
    .line 3
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v7

    .line 7
    iget v0, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->q:I

    .line 8
    .line 9
    const/4 v8, 0x0

    .line 10
    const/4 v9, 0x0

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw v0

    .line 22
    :pswitch_0
    iget-object v0, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->f:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Ljava/util/List;

    .line 25
    .line 26
    iget-object v0, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->e:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Ljava/util/List;

    .line 29
    .line 30
    iget-object v0, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->d:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Ljava/util/List;

    .line 33
    .line 34
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    move-object v9, v4

    .line 38
    goto/16 :goto_14

    .line 39
    .line 40
    :pswitch_1
    iget-wide v0, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->c:J

    .line 41
    .line 42
    iget-object v2, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->i:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v2, Ljava/util/List;

    .line 45
    .line 46
    iget-object v3, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->h:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v3, Ljava/util/List;

    .line 49
    .line 50
    iget-object v3, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->g:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v3, Ljava/util/List;

    .line 53
    .line 54
    iget-object v3, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->f:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v3, Ljava/util/List;

    .line 57
    .line 58
    iget-object v5, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->e:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v5, Ljava/util/List;

    .line 61
    .line 62
    iget-object v6, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->d:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v6, Ljava/util/List;

    .line 65
    .line 66
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    move-object v9, v4

    .line 70
    goto/16 :goto_10

    .line 71
    .line 72
    :pswitch_2
    iget-wide v0, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->c:J

    .line 73
    .line 74
    iget-object v2, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->i:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v2, Ljava/util/List;

    .line 77
    .line 78
    iget-object v3, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->h:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v3, Ljava/util/List;

    .line 81
    .line 82
    iget-object v5, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->g:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v5, Ljava/util/List;

    .line 85
    .line 86
    iget-object v6, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->f:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v6, Ljava/util/List;

    .line 89
    .line 90
    iget-object v8, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->e:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v8, Ljava/util/List;

    .line 93
    .line 94
    iget-object v10, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->d:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v10, Ljava/util/List;

    .line 97
    .line 98
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    move-object v9, v4

    .line 102
    move-object v4, v5

    .line 103
    move-object v15, v6

    .line 104
    move-object v5, v8

    .line 105
    move-object v6, v10

    .line 106
    goto/16 :goto_f

    .line 107
    .line 108
    :pswitch_3
    iget v0, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->o:I

    .line 109
    .line 110
    iget-wide v1, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->c:J

    .line 111
    .line 112
    iget-object v3, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->n:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v3, Lcom/friday/common/entity/FileEntity;

    .line 115
    .line 116
    iget-object v3, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->l:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v3, Ljava/util/Iterator;

    .line 119
    .line 120
    iget-object v5, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->k:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v5, Lcom/friday/user/viewmodel/UserViewModel;

    .line 123
    .line 124
    iget-object v6, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->j:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v6, Ljava/lang/Iterable;

    .line 127
    .line 128
    iget-object v10, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->i:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v10, Ljava/util/List;

    .line 131
    .line 132
    iget-object v11, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->h:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v11, Ljava/util/List;

    .line 135
    .line 136
    iget-object v12, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->g:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v12, Ljava/util/List;

    .line 139
    .line 140
    iget-object v13, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->f:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v13, Ljava/util/List;

    .line 143
    .line 144
    iget-object v14, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->e:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v14, Ljava/util/List;

    .line 147
    .line 148
    iget-object v15, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->d:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v15, Ljava/util/List;

    .line 151
    .line 152
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    move-object v9, v4

    .line 156
    goto/16 :goto_d

    .line 157
    .line 158
    :pswitch_4
    iget-wide v0, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->c:J

    .line 159
    .line 160
    iget-object v2, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->e:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v2, Ljava/util/List;

    .line 163
    .line 164
    iget-object v3, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->d:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v3, Ljava/util/List;

    .line 167
    .line 168
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    move-object/from16 v5, p1

    .line 172
    .line 173
    goto/16 :goto_8

    .line 174
    .line 175
    :pswitch_5
    iget-wide v0, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->c:J

    .line 176
    .line 177
    iget-object v2, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->e:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v2, Ljava/util/List;

    .line 180
    .line 181
    iget-object v3, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->d:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast v3, Ljava/util/List;

    .line 184
    .line 185
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    goto/16 :goto_7

    .line 189
    .line 190
    :pswitch_6
    iget v0, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->o:I

    .line 191
    .line 192
    iget-wide v1, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->c:J

    .line 193
    .line 194
    iget-object v3, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->j:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast v3, Lcom/friday/common/entity/ShareCacheEntity;

    .line 197
    .line 198
    iget-object v3, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->h:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v3, Ljava/util/Iterator;

    .line 201
    .line 202
    iget-object v5, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->g:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v5, Lcom/friday/user/viewmodel/UserViewModel;

    .line 205
    .line 206
    iget-object v6, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->f:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v6, Ljava/lang/Iterable;

    .line 209
    .line 210
    iget-object v10, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->e:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v10, Ljava/util/List;

    .line 213
    .line 214
    iget-object v11, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->d:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v11, Ljava/util/List;

    .line 217
    .line 218
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    move-object v13, v3

    .line 222
    move-object v14, v5

    .line 223
    move-object v15, v6

    .line 224
    move-object/from16 v16, v10

    .line 225
    .line 226
    move-object/from16 v17, v11

    .line 227
    .line 228
    move v10, v0

    .line 229
    move-wide v11, v1

    .line 230
    goto/16 :goto_6

    .line 231
    .line 232
    :pswitch_7
    iget-wide v0, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->c:J

    .line 233
    .line 234
    iget-object v2, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->d:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast v2, Ljava/util/List;

    .line 237
    .line 238
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    move-object/from16 v3, p1

    .line 242
    .line 243
    goto/16 :goto_5

    .line 244
    .line 245
    :pswitch_8
    iget-wide v0, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->c:J

    .line 246
    .line 247
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    move-object/from16 v2, p1

    .line 251
    .line 252
    goto :goto_1

    .line 253
    :pswitch_9
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    sget-object v0, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 257
    .line 258
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    invoke-virtual {v0}, Lcom/friday/common/helper/b;->t()J

    .line 263
    .line 264
    .line 265
    move-result-wide v0

    .line 266
    iget-object v2, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->r:Lcom/friday/user/viewmodel/UserViewModel;

    .line 267
    .line 268
    invoke-static {v2}, Lcom/friday/user/viewmodel/UserViewModel;->g(Lcom/friday/user/viewmodel/UserViewModel;)Lcom/friday/common/dao/FileDao;

    .line 269
    .line 270
    .line 271
    move-result-object v2

    .line 272
    iput-wide v0, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->c:J

    .line 273
    .line 274
    const/4 v3, 0x1

    .line 275
    iput v3, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->q:I

    .line 276
    .line 277
    invoke-interface {v2, v0, v1, v4}, Lcom/friday/common/dao/FileDao;->K(JLvc/c;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    if-ne v2, v7, :cond_0

    .line 282
    .line 283
    :goto_0
    move-object v9, v4

    .line 284
    goto/16 :goto_13

    .line 285
    .line 286
    :cond_0
    :goto_1
    check-cast v2, Ljava/util/List;

    .line 287
    .line 288
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 289
    .line 290
    .line 291
    move-result v3

    .line 292
    if-eqz v3, :cond_1

    .line 293
    .line 294
    const-string v3, "\u9875\u9762UserViewModel.kt -> \u6e05\u7406\u7f13\u5b58\u524d\u6ca1\u6709\u672a\u540c\u6b65\u7684\u6587\u4ef6\u6216\u6587\u4ef6\u5939"

    .line 295
    .line 296
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v3

    .line 300
    invoke-static {v3}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 301
    .line 302
    .line 303
    goto/16 :goto_4

    .line 304
    .line 305
    :cond_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 306
    .line 307
    .line 308
    move-result v3

    .line 309
    new-instance v5, Ljava/lang/StringBuilder;

    .line 310
    .line 311
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 312
    .line 313
    .line 314
    const-string v6, "\u9875\u9762UserViewModel.kt -> \u6e05\u7406\u7f13\u5b58\u524d\u672a\u540c\u6b65\u7684\u6587\u4ef6\u6216\u6587\u4ef6\u5939\u6570\u91cf="

    .line 315
    .line 316
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v3

    .line 326
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v3

    .line 330
    invoke-static {v3}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 331
    .line 332
    .line 333
    move-object v3, v2

    .line 334
    check-cast v3, Ljava/lang/Iterable;

    .line 335
    .line 336
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 337
    .line 338
    .line 339
    move-result-object v3

    .line 340
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 341
    .line 342
    .line 343
    move-result v5

    .line 344
    if-eqz v5, :cond_3

    .line 345
    .line 346
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v5

    .line 350
    check-cast v5, Lcom/friday/common/entity/FileEntity;

    .line 351
    .line 352
    invoke-virtual {v5}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v6

    .line 356
    invoke-virtual {v5}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v10

    .line 360
    invoke-virtual {v5}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v11

    .line 364
    const-string v12, "0"

    .line 365
    .line 366
    invoke-static {v11, v12}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 367
    .line 368
    .line 369
    move-result v11

    .line 370
    if-eqz v11, :cond_2

    .line 371
    .line 372
    const-string v11, "\u6587\u4ef6\u5939"

    .line 373
    .line 374
    goto :goto_3

    .line 375
    :cond_2
    const-string v11, "\u6587\u4ef6"

    .line 376
    .line 377
    :goto_3
    invoke-virtual {v5}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v12

    .line 381
    invoke-virtual {v5}, Lcom/friday/common/entity/FileEntity;->getState()I

    .line 382
    .line 383
    .line 384
    move-result v13

    .line 385
    invoke-virtual {v5}, Lcom/friday/common/entity/FileEntity;->getParentId()Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v5

    .line 389
    new-instance v14, Ljava/lang/StringBuilder;

    .line 390
    .line 391
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 392
    .line 393
    .line 394
    const-string v15, "\u9875\u9762UserViewModel.kt -> \u6e05\u7406\u7f13\u5b58\u524d\u672a\u540c\u6b65\u9879 \u540d\u79f0="

    .line 395
    .line 396
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 400
    .line 401
    .line 402
    const-string v6, ", fileId="

    .line 403
    .line 404
    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 405
    .line 406
    .line 407
    invoke-virtual {v14, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 408
    .line 409
    .line 410
    const-string v6, ", \u7c7b\u578b="

    .line 411
    .line 412
    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 413
    .line 414
    .line 415
    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 416
    .line 417
    .line 418
    const-string v6, ", fileType="

    .line 419
    .line 420
    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 421
    .line 422
    .line 423
    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 424
    .line 425
    .line 426
    const-string v6, ", state="

    .line 427
    .line 428
    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 429
    .line 430
    .line 431
    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 432
    .line 433
    .line 434
    const-string v6, ", parentId="

    .line 435
    .line 436
    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 437
    .line 438
    .line 439
    invoke-virtual {v14, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 440
    .line 441
    .line 442
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 443
    .line 444
    .line 445
    move-result-object v5

    .line 446
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v5

    .line 450
    invoke-static {v5}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    .line 451
    .line 452
    .line 453
    goto :goto_2

    .line 454
    :cond_3
    :goto_4
    iget-object v3, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->r:Lcom/friday/user/viewmodel/UserViewModel;

    .line 455
    .line 456
    invoke-static {v3}, Lcom/friday/user/viewmodel/UserViewModel;->i(Lcom/friday/user/viewmodel/UserViewModel;)Lc2/g2;

    .line 457
    .line 458
    .line 459
    move-result-object v3

    .line 460
    invoke-static {v2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v5

    .line 464
    iput-object v5, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->d:Ljava/lang/Object;

    .line 465
    .line 466
    iput-wide v0, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->c:J

    .line 467
    .line 468
    const/4 v5, 0x2

    .line 469
    iput v5, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->q:I

    .line 470
    .line 471
    invoke-interface {v3, v0, v1, v4}, Lc2/g2;->e(JLvc/c;)Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v3

    .line 475
    if-ne v3, v7, :cond_4

    .line 476
    .line 477
    goto/16 :goto_0

    .line 478
    .line 479
    :cond_4
    :goto_5
    check-cast v3, Ljava/util/List;

    .line 480
    .line 481
    move-object v5, v3

    .line 482
    check-cast v5, Ljava/lang/Iterable;

    .line 483
    .line 484
    iget-object v6, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->r:Lcom/friday/user/viewmodel/UserViewModel;

    .line 485
    .line 486
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 487
    .line 488
    .line 489
    move-result-object v10

    .line 490
    move-wide v11, v0

    .line 491
    move-object/from16 v17, v2

    .line 492
    .line 493
    move-object/from16 v16, v3

    .line 494
    .line 495
    move-object v15, v5

    .line 496
    move-object v14, v6

    .line 497
    move-object v13, v10

    .line 498
    move v10, v8

    .line 499
    :cond_5
    :goto_6
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 500
    .line 501
    .line 502
    move-result v0

    .line 503
    if-eqz v0, :cond_6

    .line 504
    .line 505
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v0

    .line 509
    move-object v1, v0

    .line 510
    check-cast v1, Lcom/friday/common/entity/ShareCacheEntity;

    .line 511
    .line 512
    move-object v2, v0

    .line 513
    invoke-static {v14}, Lcom/friday/user/viewmodel/UserViewModel;->h(Lcom/friday/user/viewmodel/UserViewModel;)Lcom/friday/common/dao/ResourceDao;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    move-object v3, v1

    .line 518
    invoke-virtual {v3}, Lcom/friday/common/entity/ShareCacheEntity;->getFileId()Ljava/lang/String;

    .line 519
    .line 520
    .line 521
    move-result-object v1

    .line 522
    invoke-static/range {v17 .. v17}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v5

    .line 526
    iput-object v5, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->d:Ljava/lang/Object;

    .line 527
    .line 528
    invoke-static/range {v16 .. v16}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object v5

    .line 532
    iput-object v5, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->e:Ljava/lang/Object;

    .line 533
    .line 534
    invoke-static {v15}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object v5

    .line 538
    iput-object v5, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->f:Ljava/lang/Object;

    .line 539
    .line 540
    iput-object v14, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->g:Ljava/lang/Object;

    .line 541
    .line 542
    iput-object v13, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->h:Ljava/lang/Object;

    .line 543
    .line 544
    invoke-static {v2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 545
    .line 546
    .line 547
    move-result-object v2

    .line 548
    iput-object v2, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->i:Ljava/lang/Object;

    .line 549
    .line 550
    invoke-static {v3}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 551
    .line 552
    .line 553
    move-result-object v2

    .line 554
    iput-object v2, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->j:Ljava/lang/Object;

    .line 555
    .line 556
    iput-wide v11, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->c:J

    .line 557
    .line 558
    iput v10, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->o:I

    .line 559
    .line 560
    iput v8, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->p:I

    .line 561
    .line 562
    const/4 v2, 0x3

    .line 563
    iput v2, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->q:I

    .line 564
    .line 565
    const-wide/16 v2, 0x0

    .line 566
    .line 567
    const/4 v5, 0x2

    .line 568
    const/4 v6, 0x0

    .line 569
    invoke-static/range {v0 .. v6}, Lcom/friday/common/dao/ResourceDao;->U(Lcom/friday/common/dao/ResourceDao;Ljava/lang/String;JLvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 570
    .line 571
    .line 572
    move-result-object v0

    .line 573
    if-ne v0, v7, :cond_5

    .line 574
    .line 575
    goto/16 :goto_0

    .line 576
    .line 577
    :cond_6
    iget-object v0, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->r:Lcom/friday/user/viewmodel/UserViewModel;

    .line 578
    .line 579
    invoke-static {v0}, Lcom/friday/user/viewmodel/UserViewModel;->i(Lcom/friday/user/viewmodel/UserViewModel;)Lc2/g2;

    .line 580
    .line 581
    .line 582
    move-result-object v0

    .line 583
    invoke-static/range {v17 .. v17}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 584
    .line 585
    .line 586
    move-result-object v1

    .line 587
    iput-object v1, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->d:Ljava/lang/Object;

    .line 588
    .line 589
    invoke-static/range {v16 .. v16}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    move-result-object v1

    .line 593
    iput-object v1, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->e:Ljava/lang/Object;

    .line 594
    .line 595
    iput-object v9, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->f:Ljava/lang/Object;

    .line 596
    .line 597
    iput-object v9, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->g:Ljava/lang/Object;

    .line 598
    .line 599
    iput-object v9, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->h:Ljava/lang/Object;

    .line 600
    .line 601
    iput-object v9, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->i:Ljava/lang/Object;

    .line 602
    .line 603
    iput-object v9, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->j:Ljava/lang/Object;

    .line 604
    .line 605
    iput-wide v11, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->c:J

    .line 606
    .line 607
    const/4 v1, 0x4

    .line 608
    iput v1, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->q:I

    .line 609
    .line 610
    invoke-interface {v0, v11, v12, v4}, Lc2/g2;->b(JLvc/c;)Ljava/lang/Object;

    .line 611
    .line 612
    .line 613
    move-result-object v0

    .line 614
    if-ne v0, v7, :cond_7

    .line 615
    .line 616
    goto/16 :goto_0

    .line 617
    .line 618
    :cond_7
    move-wide v0, v11

    .line 619
    move-object/from16 v2, v16

    .line 620
    .line 621
    move-object/from16 v3, v17

    .line 622
    .line 623
    :goto_7
    iget-object v5, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->r:Lcom/friday/user/viewmodel/UserViewModel;

    .line 624
    .line 625
    invoke-static {v5}, Lcom/friday/user/viewmodel/UserViewModel;->j(Lcom/friday/user/viewmodel/UserViewModel;)Ljava/lang/String;

    .line 626
    .line 627
    .line 628
    move-result-object v5

    .line 629
    invoke-static {v5}, Lcom/blankj/utilcode/util/FileUtils;->deleteAllInDir(Ljava/lang/String;)Z

    .line 630
    .line 631
    .line 632
    iget-object v5, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->r:Lcom/friday/user/viewmodel/UserViewModel;

    .line 633
    .line 634
    invoke-static {v5}, Lcom/friday/user/viewmodel/UserViewModel;->g(Lcom/friday/user/viewmodel/UserViewModel;)Lcom/friday/common/dao/FileDao;

    .line 635
    .line 636
    .line 637
    move-result-object v5

    .line 638
    invoke-static {v3}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 639
    .line 640
    .line 641
    move-result-object v6

    .line 642
    iput-object v6, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->d:Ljava/lang/Object;

    .line 643
    .line 644
    invoke-static {v2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 645
    .line 646
    .line 647
    move-result-object v6

    .line 648
    iput-object v6, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->e:Ljava/lang/Object;

    .line 649
    .line 650
    iput-wide v0, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->c:J

    .line 651
    .line 652
    const/4 v6, 0x5

    .line 653
    iput v6, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->q:I

    .line 654
    .line 655
    invoke-interface {v5, v0, v1, v4}, Lcom/friday/common/dao/FileDao;->W(JLvc/c;)Ljava/lang/Object;

    .line 656
    .line 657
    .line 658
    move-result-object v5

    .line 659
    if-ne v5, v7, :cond_8

    .line 660
    .line 661
    goto/16 :goto_0

    .line 662
    .line 663
    :cond_8
    :goto_8
    check-cast v5, Ljava/util/List;

    .line 664
    .line 665
    move-object v6, v5

    .line 666
    check-cast v6, Ljava/util/Collection;

    .line 667
    .line 668
    if-eqz v6, :cond_9

    .line 669
    .line 670
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 671
    .line 672
    .line 673
    move-result v6

    .line 674
    if-eqz v6, :cond_a

    .line 675
    .line 676
    :cond_9
    move-object v9, v4

    .line 677
    goto/16 :goto_12

    .line 678
    .line 679
    :cond_a
    new-instance v6, Ljava/util/ArrayList;

    .line 680
    .line 681
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 682
    .line 683
    .line 684
    new-instance v10, Ljava/util/ArrayList;

    .line 685
    .line 686
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 687
    .line 688
    .line 689
    new-instance v11, Ljava/util/ArrayList;

    .line 690
    .line 691
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 692
    .line 693
    .line 694
    move-object v12, v5

    .line 695
    check-cast v12, Ljava/lang/Iterable;

    .line 696
    .line 697
    iget-object v13, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->r:Lcom/friday/user/viewmodel/UserViewModel;

    .line 698
    .line 699
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 700
    .line 701
    .line 702
    move-result-object v14

    .line 703
    move-object/from16 v16, v2

    .line 704
    .line 705
    move-object/from16 v17, v3

    .line 706
    .line 707
    move-object v15, v5

    .line 708
    move-object v3, v6

    .line 709
    move v6, v8

    .line 710
    move-object/from16 v19, v12

    .line 711
    .line 712
    move-object v12, v10

    .line 713
    move-wide/from16 v20, v0

    .line 714
    .line 715
    move-object v0, v11

    .line 716
    move-wide/from16 v10, v20

    .line 717
    .line 718
    move-object v1, v13

    .line 719
    move-object/from16 v13, v19

    .line 720
    .line 721
    :goto_9
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 722
    .line 723
    .line 724
    move-result v2

    .line 725
    if-eqz v2, :cond_11

    .line 726
    .line 727
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 728
    .line 729
    .line 730
    move-result-object v2

    .line 731
    move-object v5, v2

    .line 732
    check-cast v5, Lcom/friday/common/entity/FileEntity;

    .line 733
    .line 734
    invoke-virtual {v5}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 735
    .line 736
    .line 737
    move-result-object v9

    .line 738
    invoke-interface {v12, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 739
    .line 740
    .line 741
    invoke-virtual {v5}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 742
    .line 743
    .line 744
    move-result-object v9

    .line 745
    const-string v8, "1"

    .line 746
    .line 747
    invoke-static {v9, v8}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 748
    .line 749
    .line 750
    move-result v8

    .line 751
    if-nez v8, :cond_b

    .line 752
    .line 753
    invoke-virtual {v5}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 754
    .line 755
    .line 756
    move-result-object v8

    .line 757
    const-string v9, "12"

    .line 758
    .line 759
    invoke-static {v8, v9}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 760
    .line 761
    .line 762
    move-result v8

    .line 763
    if-eqz v8, :cond_c

    .line 764
    .line 765
    :cond_b
    move-object/from16 p1, v5

    .line 766
    .line 767
    move-object/from16 v18, v13

    .line 768
    .line 769
    goto/16 :goto_c

    .line 770
    .line 771
    :cond_c
    invoke-virtual {v5}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 772
    .line 773
    .line 774
    move-result-object v2

    .line 775
    const-string v8, "6"

    .line 776
    .line 777
    invoke-static {v2, v8}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 778
    .line 779
    .line 780
    move-result v8

    .line 781
    const-string v9, "11"

    .line 782
    .line 783
    if-eqz v8, :cond_d

    .line 784
    .line 785
    invoke-virtual {v5}, Lcom/friday/common/entity/FileEntity;->getTxtFilePath()Ljava/lang/String;

    .line 786
    .line 787
    .line 788
    move-result-object v2

    .line 789
    goto :goto_a

    .line 790
    :cond_d
    invoke-static {v2, v9}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 791
    .line 792
    .line 793
    move-result v2

    .line 794
    if-eqz v2, :cond_e

    .line 795
    .line 796
    invoke-virtual {v5}, Lcom/friday/common/entity/FileEntity;->getZipFilePath()Ljava/lang/String;

    .line 797
    .line 798
    .line 799
    move-result-object v2

    .line 800
    goto :goto_a

    .line 801
    :cond_e
    invoke-virtual {v5}, Lcom/friday/common/entity/FileEntity;->getOfficePath()Ljava/lang/String;

    .line 802
    .line 803
    .line 804
    move-result-object v2

    .line 805
    :goto_a
    new-instance v8, Ljava/io/File;

    .line 806
    .line 807
    invoke-direct {v8, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 808
    .line 809
    .line 810
    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 811
    .line 812
    .line 813
    invoke-virtual {v5}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 814
    .line 815
    .line 816
    move-result-object v2

    .line 817
    invoke-static {v2, v9}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 818
    .line 819
    .line 820
    move-result v2

    .line 821
    if-eqz v2, :cond_f

    .line 822
    .line 823
    new-instance v2, Ljava/io/File;

    .line 824
    .line 825
    invoke-virtual {v5}, Lcom/friday/common/entity/FileEntity;->getLocalFileUrl()Ljava/lang/String;

    .line 826
    .line 827
    .line 828
    move-result-object v8

    .line 829
    sget-object v9, Ljava/io/File;->separator:Ljava/lang/String;

    .line 830
    .line 831
    move-object/from16 p1, v5

    .line 832
    .line 833
    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 834
    .line 835
    .line 836
    move-result-object v5

    .line 837
    move-object/from16 v18, v13

    .line 838
    .line 839
    new-instance v13, Ljava/lang/StringBuilder;

    .line 840
    .line 841
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 842
    .line 843
    .line 844
    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 845
    .line 846
    .line 847
    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 848
    .line 849
    .line 850
    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 851
    .line 852
    .line 853
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 854
    .line 855
    .line 856
    move-result-object v5

    .line 857
    invoke-direct {v2, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 858
    .line 859
    .line 860
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 861
    .line 862
    .line 863
    new-instance v2, Ljava/io/File;

    .line 864
    .line 865
    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/entity/FileEntity;->getLocalFileUrl()Ljava/lang/String;

    .line 866
    .line 867
    .line 868
    move-result-object v5

    .line 869
    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 870
    .line 871
    .line 872
    move-result-object v8

    .line 873
    new-instance v13, Ljava/lang/StringBuilder;

    .line 874
    .line 875
    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    .line 876
    .line 877
    .line 878
    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 879
    .line 880
    .line 881
    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 882
    .line 883
    .line 884
    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 885
    .line 886
    .line 887
    const-string v5, ".jpg"

    .line 888
    .line 889
    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 890
    .line 891
    .line 892
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 893
    .line 894
    .line 895
    move-result-object v5

    .line 896
    invoke-direct {v2, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 897
    .line 898
    .line 899
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 900
    .line 901
    .line 902
    goto :goto_b

    .line 903
    :cond_f
    move-object/from16 v18, v13

    .line 904
    .line 905
    :goto_b
    move-object v9, v4

    .line 906
    move-object/from16 v13, v18

    .line 907
    .line 908
    const/4 v8, 0x0

    .line 909
    goto/16 :goto_e

    .line 910
    .line 911
    :goto_c
    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 912
    .line 913
    .line 914
    move-result-object v5

    .line 915
    move-object v8, v2

    .line 916
    invoke-virtual/range {p1 .. p1}, Lcom/friday/common/entity/FileEntity;->getLocalFileUrl()Ljava/lang/String;

    .line 917
    .line 918
    .line 919
    move-result-object v2

    .line 920
    invoke-static/range {v17 .. v17}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 921
    .line 922
    .line 923
    move-result-object v9

    .line 924
    iput-object v9, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->d:Ljava/lang/Object;

    .line 925
    .line 926
    invoke-static/range {v16 .. v16}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 927
    .line 928
    .line 929
    move-result-object v9

    .line 930
    iput-object v9, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->e:Ljava/lang/Object;

    .line 931
    .line 932
    invoke-static {v15}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 933
    .line 934
    .line 935
    move-result-object v9

    .line 936
    iput-object v9, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->f:Ljava/lang/Object;

    .line 937
    .line 938
    iput-object v3, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->g:Ljava/lang/Object;

    .line 939
    .line 940
    iput-object v12, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->h:Ljava/lang/Object;

    .line 941
    .line 942
    iput-object v0, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->i:Ljava/lang/Object;

    .line 943
    .line 944
    invoke-static/range {v18 .. v18}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 945
    .line 946
    .line 947
    move-result-object v9

    .line 948
    iput-object v9, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->j:Ljava/lang/Object;

    .line 949
    .line 950
    iput-object v1, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->k:Ljava/lang/Object;

    .line 951
    .line 952
    iput-object v14, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->l:Ljava/lang/Object;

    .line 953
    .line 954
    invoke-static {v8}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 955
    .line 956
    .line 957
    move-result-object v8

    .line 958
    iput-object v8, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->m:Ljava/lang/Object;

    .line 959
    .line 960
    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 961
    .line 962
    .line 963
    move-result-object v8

    .line 964
    iput-object v8, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->n:Ljava/lang/Object;

    .line 965
    .line 966
    iput-wide v10, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->c:J

    .line 967
    .line 968
    iput v6, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->o:I

    .line 969
    .line 970
    const/4 v8, 0x0

    .line 971
    iput v8, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->p:I

    .line 972
    .line 973
    const/4 v9, 0x6

    .line 974
    iput v9, v4, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->q:I

    .line 975
    .line 976
    move-object/from16 v19, v4

    .line 977
    .line 978
    move-object v4, v0

    .line 979
    move-object v0, v1

    .line 980
    move-object v1, v5

    .line 981
    move-object/from16 v5, v19

    .line 982
    .line 983
    invoke-static/range {v0 .. v5}, Lcom/friday/user/viewmodel/UserViewModel;->e(Lcom/friday/user/viewmodel/UserViewModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    .line 984
    .line 985
    .line 986
    move-result-object v1

    .line 987
    move-object v9, v5

    .line 988
    if-ne v1, v7, :cond_10

    .line 989
    .line 990
    goto/16 :goto_13

    .line 991
    .line 992
    :cond_10
    move-object v5, v0

    .line 993
    move v0, v6

    .line 994
    move-wide v1, v10

    .line 995
    move-object v11, v12

    .line 996
    move-object v13, v15

    .line 997
    move-object/from16 v15, v17

    .line 998
    .line 999
    move-object/from16 v6, v18

    .line 1000
    .line 1001
    move-object v12, v3

    .line 1002
    move-object v10, v4

    .line 1003
    move-object v3, v14

    .line 1004
    move-object/from16 v14, v16

    .line 1005
    .line 1006
    :goto_d
    move-object/from16 v16, v14

    .line 1007
    .line 1008
    move-object/from16 v17, v15

    .line 1009
    .line 1010
    move-object v14, v3

    .line 1011
    move-object v3, v12

    .line 1012
    move-object v15, v13

    .line 1013
    move-object v13, v6

    .line 1014
    move-object v12, v11

    .line 1015
    move v6, v0

    .line 1016
    move-object v0, v10

    .line 1017
    move-wide v10, v1

    .line 1018
    move-object v1, v5

    .line 1019
    :goto_e
    move-object v4, v9

    .line 1020
    const/4 v9, 0x0

    .line 1021
    goto/16 :goto_9

    .line 1022
    .line 1023
    :cond_11
    move-object v9, v4

    .line 1024
    move-object v4, v0

    .line 1025
    iget-object v0, v9, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->r:Lcom/friday/user/viewmodel/UserViewModel;

    .line 1026
    .line 1027
    invoke-static {v0}, Lcom/friday/user/viewmodel/UserViewModel;->h(Lcom/friday/user/viewmodel/UserViewModel;)Lcom/friday/common/dao/ResourceDao;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v0

    .line 1031
    invoke-static/range {v17 .. v17}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v1

    .line 1035
    iput-object v1, v9, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->d:Ljava/lang/Object;

    .line 1036
    .line 1037
    invoke-static/range {v16 .. v16}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v1

    .line 1041
    iput-object v1, v9, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->e:Ljava/lang/Object;

    .line 1042
    .line 1043
    invoke-static {v15}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v1

    .line 1047
    iput-object v1, v9, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->f:Ljava/lang/Object;

    .line 1048
    .line 1049
    invoke-static {v3}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v1

    .line 1053
    iput-object v1, v9, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->g:Ljava/lang/Object;

    .line 1054
    .line 1055
    iput-object v12, v9, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->h:Ljava/lang/Object;

    .line 1056
    .line 1057
    iput-object v4, v9, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->i:Ljava/lang/Object;

    .line 1058
    .line 1059
    const/4 v1, 0x0

    .line 1060
    iput-object v1, v9, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->j:Ljava/lang/Object;

    .line 1061
    .line 1062
    iput-object v1, v9, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->k:Ljava/lang/Object;

    .line 1063
    .line 1064
    iput-object v1, v9, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->l:Ljava/lang/Object;

    .line 1065
    .line 1066
    iput-object v1, v9, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->m:Ljava/lang/Object;

    .line 1067
    .line 1068
    iput-object v1, v9, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->n:Ljava/lang/Object;

    .line 1069
    .line 1070
    iput-wide v10, v9, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->c:J

    .line 1071
    .line 1072
    const/4 v1, 0x7

    .line 1073
    iput v1, v9, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->q:I

    .line 1074
    .line 1075
    invoke-interface {v0, v3, v9}, Lcom/friday/common/dao/ResourceDao;->O(Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v0

    .line 1079
    if-ne v0, v7, :cond_12

    .line 1080
    .line 1081
    goto/16 :goto_13

    .line 1082
    .line 1083
    :cond_12
    move-object v2, v4

    .line 1084
    move-wide v0, v10

    .line 1085
    move-object/from16 v5, v16

    .line 1086
    .line 1087
    move-object/from16 v6, v17

    .line 1088
    .line 1089
    move-object v4, v3

    .line 1090
    move-object v3, v12

    .line 1091
    :goto_f
    iget-object v8, v9, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->r:Lcom/friday/user/viewmodel/UserViewModel;

    .line 1092
    .line 1093
    invoke-static {v8}, Lcom/friday/user/viewmodel/UserViewModel;->g(Lcom/friday/user/viewmodel/UserViewModel;)Lcom/friday/common/dao/FileDao;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v8

    .line 1097
    invoke-static {v6}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v10

    .line 1101
    iput-object v10, v9, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->d:Ljava/lang/Object;

    .line 1102
    .line 1103
    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v10

    .line 1107
    iput-object v10, v9, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->e:Ljava/lang/Object;

    .line 1108
    .line 1109
    invoke-static {v15}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v10

    .line 1113
    iput-object v10, v9, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->f:Ljava/lang/Object;

    .line 1114
    .line 1115
    invoke-static {v4}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v4

    .line 1119
    iput-object v4, v9, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->g:Ljava/lang/Object;

    .line 1120
    .line 1121
    invoke-static {v3}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v4

    .line 1125
    iput-object v4, v9, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->h:Ljava/lang/Object;

    .line 1126
    .line 1127
    iput-object v2, v9, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->i:Ljava/lang/Object;

    .line 1128
    .line 1129
    iput-wide v0, v9, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->c:J

    .line 1130
    .line 1131
    const/16 v4, 0x8

    .line 1132
    .line 1133
    iput v4, v9, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->q:I

    .line 1134
    .line 1135
    invoke-interface {v8, v3, v9}, Lcom/friday/common/dao/FileDao;->z(Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    .line 1136
    .line 1137
    .line 1138
    move-result-object v3

    .line 1139
    if-ne v3, v7, :cond_13

    .line 1140
    .line 1141
    goto :goto_13

    .line 1142
    :cond_13
    move-object v3, v15

    .line 1143
    :goto_10
    check-cast v2, Ljava/lang/Iterable;

    .line 1144
    .line 1145
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v2

    .line 1149
    :goto_11
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1150
    .line 1151
    .line 1152
    move-result v4

    .line 1153
    if-eqz v4, :cond_14

    .line 1154
    .line 1155
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v4

    .line 1159
    check-cast v4, Ljava/io/File;

    .line 1160
    .line 1161
    invoke-static {v4}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/io/File;)Z

    .line 1162
    .line 1163
    .line 1164
    goto :goto_11

    .line 1165
    :cond_14
    move-object v2, v5

    .line 1166
    move-object v5, v3

    .line 1167
    move-object v3, v6

    .line 1168
    :goto_12
    invoke-static {}, Lsd/r0;->c()Lsd/t1;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v4

    .line 1172
    new-instance v6, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1$5;

    .line 1173
    .line 1174
    const/4 v8, 0x0

    .line 1175
    invoke-direct {v6, v8}, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1$5;-><init>(Lvc/c;)V

    .line 1176
    .line 1177
    .line 1178
    invoke-static {v3}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1179
    .line 1180
    .line 1181
    move-result-object v3

    .line 1182
    iput-object v3, v9, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->d:Ljava/lang/Object;

    .line 1183
    .line 1184
    invoke-static {v2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1185
    .line 1186
    .line 1187
    move-result-object v2

    .line 1188
    iput-object v2, v9, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->e:Ljava/lang/Object;

    .line 1189
    .line 1190
    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1191
    .line 1192
    .line 1193
    move-result-object v2

    .line 1194
    iput-object v2, v9, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->f:Ljava/lang/Object;

    .line 1195
    .line 1196
    iput-object v8, v9, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->g:Ljava/lang/Object;

    .line 1197
    .line 1198
    iput-object v8, v9, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->h:Ljava/lang/Object;

    .line 1199
    .line 1200
    iput-object v8, v9, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->i:Ljava/lang/Object;

    .line 1201
    .line 1202
    iput-wide v0, v9, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->c:J

    .line 1203
    .line 1204
    const/16 v0, 0x9

    .line 1205
    .line 1206
    iput v0, v9, Lcom/friday/user/viewmodel/UserViewModel$clearCache$1$1;->q:I

    .line 1207
    .line 1208
    invoke-static {v4, v6, v9}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 1209
    .line 1210
    .line 1211
    move-result-object v0

    .line 1212
    if-ne v0, v7, :cond_15

    .line 1213
    .line 1214
    :goto_13
    return-object v7

    .line 1215
    :cond_15
    :goto_14
    invoke-static {}, Lcom/blankj/utilcode/util/CleanUtils;->cleanExternalCache()Z

    .line 1216
    .line 1217
    .line 1218
    invoke-static {}, Lcom/blankj/utilcode/util/CleanUtils;->cleanInternalCache()Z

    .line 1219
    .line 1220
    .line 1221
    move-result v0

    .line 1222
    invoke-static {v0}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v0

    .line 1226
    return-object v0

    .line 1227
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
