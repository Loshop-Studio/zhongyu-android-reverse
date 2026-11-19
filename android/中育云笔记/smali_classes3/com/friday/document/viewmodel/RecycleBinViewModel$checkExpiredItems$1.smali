.class final Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/viewmodel/RecycleBinViewModel;->H0()V
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
    c = "com.friday.document.viewmodel.RecycleBinViewModel$checkExpiredItems$1"
    f = "RecycleBinViewModel.kt"
    l = {
        0x26,
        0x2e,
        0x31,
        0x37
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

.field public j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;

.field public l:I

.field public m:I

.field public n:I

.field public final synthetic o:Lcom/friday/document/viewmodel/RecycleBinViewModel;


# direct methods
.method public constructor <init>(Lcom/friday/document/viewmodel/RecycleBinViewModel;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->o:Lcom/friday/document/viewmodel/RecycleBinViewModel;

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
    new-instance p1, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->o:Lcom/friday/document/viewmodel/RecycleBinViewModel;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;-><init>(Lcom/friday/document/viewmodel/RecycleBinViewModel;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->n:I

    .line 6
    .line 7
    const/4 v2, 0x4

    .line 8
    const/4 v3, 0x3

    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x1

    .line 11
    const/4 v6, 0x0

    .line 12
    if-eqz v1, :cond_4

    .line 13
    .line 14
    if-eq v1, v5, :cond_3

    .line 15
    .line 16
    if-eq v1, v4, :cond_2

    .line 17
    .line 18
    if-eq v1, v3, :cond_1

    .line 19
    .line 20
    if-ne v1, v2, :cond_0

    .line 21
    .line 22
    iget v1, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->l:I

    .line 23
    .line 24
    iget-object v3, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->k:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v3, Lcom/friday/common/entity/FileEntity;

    .line 27
    .line 28
    iget-object v3, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->i:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v3, Ljava/util/Iterator;

    .line 31
    .line 32
    iget-object v4, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->h:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v4, Lcom/friday/document/viewmodel/RecycleBinViewModel;

    .line 35
    .line 36
    iget-object v5, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->g:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v5, Ljava/lang/Iterable;

    .line 39
    .line 40
    iget-object v7, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->f:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v7, Lcom/friday/common/property/BaseResponse;

    .line 43
    .line 44
    iget-object v8, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->e:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v8, Ljava/util/List;

    .line 47
    .line 48
    iget-object v9, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->d:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v9, Ljava/util/List;

    .line 51
    .line 52
    iget-object v10, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->c:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v10, Ljava/util/List;

    .line 55
    .line 56
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto/16 :goto_6

    .line 60
    .line 61
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 62
    .line 63
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 64
    .line 65
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p1

    .line 69
    :cond_1
    iget v1, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->l:I

    .line 70
    .line 71
    iget-object v2, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->k:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v2, Lcom/friday/common/entity/FileEntity;

    .line 74
    .line 75
    iget-object v2, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->i:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v2, Ljava/util/Iterator;

    .line 78
    .line 79
    iget-object v4, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->h:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v4, Lcom/friday/document/viewmodel/RecycleBinViewModel;

    .line 82
    .line 83
    iget-object v5, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->g:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v5, Ljava/lang/Iterable;

    .line 86
    .line 87
    iget-object v7, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->f:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v7, Lcom/friday/common/property/BaseResponse;

    .line 90
    .line 91
    iget-object v8, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->e:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v8, Ljava/util/List;

    .line 94
    .line 95
    iget-object v9, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->d:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v9, Ljava/util/List;

    .line 98
    .line 99
    iget-object v10, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->c:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v10, Ljava/util/List;

    .line 102
    .line 103
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    goto/16 :goto_4

    .line 107
    .line 108
    :cond_2
    iget-object v1, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->e:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v1, Ljava/util/List;

    .line 111
    .line 112
    iget-object v4, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->d:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v4, Ljava/util/List;

    .line 115
    .line 116
    iget-object v5, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->c:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v5, Ljava/util/List;

    .line 119
    .line 120
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    goto/16 :goto_3

    .line 124
    .line 125
    :cond_3
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_4
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    iget-object p1, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->o:Lcom/friday/document/viewmodel/RecycleBinViewModel;

    .line 133
    .line 134
    invoke-virtual {p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->M()Lcom/friday/common/dao/FileDao;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    iget-object v1, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->o:Lcom/friday/document/viewmodel/RecycleBinViewModel;

    .line 139
    .line 140
    invoke-virtual {v1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->X()J

    .line 141
    .line 142
    .line 143
    move-result-wide v7

    .line 144
    iput v5, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->n:I

    .line 145
    .line 146
    invoke-interface {p1, v7, v8, p0}, Lcom/friday/common/dao/FileDao;->x(JLvc/c;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    if-ne p1, v0, :cond_5

    .line 151
    .line 152
    goto/16 :goto_7

    .line 153
    .line 154
    :cond_5
    :goto_0
    move-object v5, p1

    .line 155
    check-cast v5, Ljava/util/List;

    .line 156
    .line 157
    move-object p1, v5

    .line 158
    check-cast p1, Ljava/lang/Iterable;

    .line 159
    .line 160
    iget-object v1, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->o:Lcom/friday/document/viewmodel/RecycleBinViewModel;

    .line 161
    .line 162
    new-instance v7, Ljava/util/ArrayList;

    .line 163
    .line 164
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 165
    .line 166
    .line 167
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    :cond_6
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 172
    .line 173
    .line 174
    move-result v8

    .line 175
    if-eqz v8, :cond_7

    .line 176
    .line 177
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v8

    .line 181
    move-object v9, v8

    .line 182
    check-cast v9, Lcom/friday/common/entity/FileEntity;

    .line 183
    .line 184
    invoke-static {v1, v9}, Lcom/friday/document/viewmodel/RecycleBinViewModel;->F0(Lcom/friday/document/viewmodel/RecycleBinViewModel;Lcom/friday/common/entity/FileEntity;)Z

    .line 185
    .line 186
    .line 187
    move-result v9

    .line 188
    if-nez v9, :cond_6

    .line 189
    .line 190
    invoke-interface {v7, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    goto :goto_1

    .line 194
    :cond_7
    new-instance v1, Ljava/util/ArrayList;

    .line 195
    .line 196
    const/16 p1, 0xa

    .line 197
    .line 198
    invoke-static {v7, p1}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 199
    .line 200
    .line 201
    move-result p1

    .line 202
    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 206
    .line 207
    .line 208
    move-result p1

    .line 209
    move v8, v6

    .line 210
    :goto_2
    if-ge v8, p1, :cond_8

    .line 211
    .line 212
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v9

    .line 216
    add-int/lit8 v8, v8, 0x1

    .line 217
    .line 218
    check-cast v9, Lcom/friday/common/entity/FileEntity;

    .line 219
    .line 220
    invoke-virtual {v9}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v9

    .line 224
    invoke-interface {v1, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    goto :goto_2

    .line 228
    :cond_8
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 229
    .line 230
    .line 231
    move-result p1

    .line 232
    if-nez p1, :cond_f

    .line 233
    .line 234
    iget-object p1, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->o:Lcom/friday/document/viewmodel/RecycleBinViewModel;

    .line 235
    .line 236
    invoke-virtual {p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->G()Ls2/a;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v8

    .line 244
    iput-object v8, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->c:Ljava/lang/Object;

    .line 245
    .line 246
    iput-object v7, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->d:Ljava/lang/Object;

    .line 247
    .line 248
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v8

    .line 252
    iput-object v8, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->e:Ljava/lang/Object;

    .line 253
    .line 254
    iput v4, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->n:I

    .line 255
    .line 256
    invoke-interface {p1, v1, p0}, Ls2/a;->h(Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    if-ne p1, v0, :cond_9

    .line 261
    .line 262
    goto/16 :goto_7

    .line 263
    .line 264
    :cond_9
    move-object v4, v7

    .line 265
    :goto_3
    check-cast p1, Lcom/friday/common/property/BaseResponse;

    .line 266
    .line 267
    invoke-virtual {p1}, Lcom/friday/common/property/BaseResponse;->getCode()I

    .line 268
    .line 269
    .line 270
    move-result v7

    .line 271
    if-nez v7, :cond_b

    .line 272
    .line 273
    move-object v2, v4

    .line 274
    check-cast v2, Ljava/lang/Iterable;

    .line 275
    .line 276
    iget-object v7, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->o:Lcom/friday/document/viewmodel/RecycleBinViewModel;

    .line 277
    .line 278
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 279
    .line 280
    .line 281
    move-result-object v8

    .line 282
    move-object v9, v4

    .line 283
    move-object v10, v5

    .line 284
    move-object v4, v7

    .line 285
    move-object v7, p1

    .line 286
    move-object v5, v2

    .line 287
    move-object v2, v8

    .line 288
    move-object v8, v1

    .line 289
    move v1, v6

    .line 290
    :cond_a
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 291
    .line 292
    .line 293
    move-result p1

    .line 294
    if-eqz p1, :cond_f

    .line 295
    .line 296
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object p1

    .line 300
    move-object v11, p1

    .line 301
    check-cast v11, Lcom/friday/common/entity/FileEntity;

    .line 302
    .line 303
    invoke-static {v10}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v12

    .line 307
    iput-object v12, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->c:Ljava/lang/Object;

    .line 308
    .line 309
    invoke-static {v9}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v12

    .line 313
    iput-object v12, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->d:Ljava/lang/Object;

    .line 314
    .line 315
    invoke-static {v8}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v12

    .line 319
    iput-object v12, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->e:Ljava/lang/Object;

    .line 320
    .line 321
    invoke-static {v7}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v12

    .line 325
    iput-object v12, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->f:Ljava/lang/Object;

    .line 326
    .line 327
    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v12

    .line 331
    iput-object v12, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->g:Ljava/lang/Object;

    .line 332
    .line 333
    iput-object v4, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->h:Ljava/lang/Object;

    .line 334
    .line 335
    iput-object v2, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->i:Ljava/lang/Object;

    .line 336
    .line 337
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object p1

    .line 341
    iput-object p1, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->j:Ljava/lang/Object;

    .line 342
    .line 343
    invoke-static {v11}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object p1

    .line 347
    iput-object p1, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->k:Ljava/lang/Object;

    .line 348
    .line 349
    iput v1, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->l:I

    .line 350
    .line 351
    iput v6, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->m:I

    .line 352
    .line 353
    iput v3, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->n:I

    .line 354
    .line 355
    invoke-static {v4, v11, p0}, Lcom/friday/document/viewmodel/RecycleBinViewModel;->G0(Lcom/friday/document/viewmodel/RecycleBinViewModel;Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object p1

    .line 359
    if-ne p1, v0, :cond_a

    .line 360
    .line 361
    goto/16 :goto_7

    .line 362
    .line 363
    :cond_b
    move-object v3, v4

    .line 364
    check-cast v3, Ljava/lang/Iterable;

    .line 365
    .line 366
    new-instance v7, Ljava/util/ArrayList;

    .line 367
    .line 368
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 369
    .line 370
    .line 371
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 372
    .line 373
    .line 374
    move-result-object v3

    .line 375
    :cond_c
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 376
    .line 377
    .line 378
    move-result v8

    .line 379
    if-eqz v8, :cond_d

    .line 380
    .line 381
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v8

    .line 385
    move-object v9, v8

    .line 386
    check-cast v9, Lcom/friday/common/entity/FileEntity;

    .line 387
    .line 388
    invoke-virtual {p1}, Lcom/friday/common/property/BaseResponse;->getData()Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v10

    .line 392
    check-cast v10, Ljava/util/List;

    .line 393
    .line 394
    invoke-virtual {v9}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v9

    .line 398
    invoke-interface {v10, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 399
    .line 400
    .line 401
    move-result v9

    .line 402
    if-nez v9, :cond_c

    .line 403
    .line 404
    invoke-interface {v7, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 405
    .line 406
    .line 407
    goto :goto_5

    .line 408
    :cond_d
    iget-object v3, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->o:Lcom/friday/document/viewmodel/RecycleBinViewModel;

    .line 409
    .line 410
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 411
    .line 412
    .line 413
    move-result-object v8

    .line 414
    move-object v9, v4

    .line 415
    move-object v10, v5

    .line 416
    move-object v5, v7

    .line 417
    move-object v7, p1

    .line 418
    move-object v4, v3

    .line 419
    move-object v3, v8

    .line 420
    move-object v8, v1

    .line 421
    move v1, v6

    .line 422
    :cond_e
    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 423
    .line 424
    .line 425
    move-result p1

    .line 426
    if-eqz p1, :cond_f

    .line 427
    .line 428
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object p1

    .line 432
    move-object v11, p1

    .line 433
    check-cast v11, Lcom/friday/common/entity/FileEntity;

    .line 434
    .line 435
    invoke-static {v10}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object v12

    .line 439
    iput-object v12, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->c:Ljava/lang/Object;

    .line 440
    .line 441
    invoke-static {v9}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object v12

    .line 445
    iput-object v12, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->d:Ljava/lang/Object;

    .line 446
    .line 447
    invoke-static {v8}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v12

    .line 451
    iput-object v12, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->e:Ljava/lang/Object;

    .line 452
    .line 453
    invoke-static {v7}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v12

    .line 457
    iput-object v12, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->f:Ljava/lang/Object;

    .line 458
    .line 459
    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object v12

    .line 463
    iput-object v12, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->g:Ljava/lang/Object;

    .line 464
    .line 465
    iput-object v4, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->h:Ljava/lang/Object;

    .line 466
    .line 467
    iput-object v3, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->i:Ljava/lang/Object;

    .line 468
    .line 469
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object p1

    .line 473
    iput-object p1, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->j:Ljava/lang/Object;

    .line 474
    .line 475
    invoke-static {v11}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    move-result-object p1

    .line 479
    iput-object p1, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->k:Ljava/lang/Object;

    .line 480
    .line 481
    iput v1, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->l:I

    .line 482
    .line 483
    iput v6, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->m:I

    .line 484
    .line 485
    iput v2, p0, Lcom/friday/document/viewmodel/RecycleBinViewModel$checkExpiredItems$1;->n:I

    .line 486
    .line 487
    invoke-static {v4, v11, p0}, Lcom/friday/document/viewmodel/RecycleBinViewModel;->G0(Lcom/friday/document/viewmodel/RecycleBinViewModel;Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object p1

    .line 491
    if-ne p1, v0, :cond_e

    .line 492
    .line 493
    :goto_7
    return-object v0

    .line 494
    :cond_f
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 495
    .line 496
    return-object p1
.end method
