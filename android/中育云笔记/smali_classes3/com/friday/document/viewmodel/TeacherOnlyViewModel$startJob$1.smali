.class final Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/viewmodel/TeacherOnlyViewModel;->k()V
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
    c = "com.friday.document.viewmodel.TeacherOnlyViewModel$startJob$1"
    f = "TeacherOnlyViewModel.kt"
    l = {
        0x23,
        0x24,
        0x26,
        0x2a,
        0x2c,
        0x2d,
        0x32
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:I

.field public g:I

.field public final synthetic h:Lcom/friday/document/viewmodel/TeacherOnlyViewModel;


# direct methods
.method public constructor <init>(Lcom/friday/document/viewmodel/TeacherOnlyViewModel;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1;->h:Lcom/friday/document/viewmodel/TeacherOnlyViewModel;

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
    new-instance p1, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1;->h:Lcom/friday/document/viewmodel/TeacherOnlyViewModel;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1;-><init>(Lcom/friday/document/viewmodel/TeacherOnlyViewModel;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1;->g:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 15
    .line 16
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p1

    .line 20
    :pswitch_0
    iget-object v0, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1;->e:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Ljava/util/List;

    .line 23
    .line 24
    iget-object v0, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Ljava/util/List;

    .line 27
    .line 28
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto/16 :goto_a

    .line 32
    .line 33
    :pswitch_1
    iget-object v0, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1;->d:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Ljava/lang/Throwable;

    .line 36
    .line 37
    iget-object v0, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1;->c:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Ljava/util/List;

    .line 40
    .line 41
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto/16 :goto_8

    .line 45
    .line 46
    :pswitch_2
    iget v3, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1;->f:I

    .line 47
    .line 48
    iget-object v1, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1;->d:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, Ljava/lang/Throwable;

    .line 51
    .line 52
    iget-object v4, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1;->c:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v4, Ljava/util/List;

    .line 55
    .line 56
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto/16 :goto_7

    .line 60
    .line 61
    :pswitch_3
    iget-object v1, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1;->c:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v1, Ljava/util/List;

    .line 64
    .line 65
    :try_start_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 66
    .line 67
    .line 68
    goto/16 :goto_3

    .line 69
    .line 70
    :catchall_0
    move-exception p1

    .line 71
    goto/16 :goto_5

    .line 72
    .line 73
    :pswitch_4
    iget-object v0, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1;->c:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, Ljava/util/List;

    .line 76
    .line 77
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    goto :goto_2

    .line 81
    :pswitch_5
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :pswitch_6
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :pswitch_7
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    iget-object p1, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1;->h:Lcom/friday/document/viewmodel/TeacherOnlyViewModel;

    .line 93
    .line 94
    invoke-static {p1}, Lcom/friday/document/viewmodel/TeacherOnlyViewModel;->h(Lcom/friday/document/viewmodel/TeacherOnlyViewModel;)Lvd/k;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    sget-object v1, Lcom/friday/document/viewmodel/d$c;->a:Lcom/friday/document/viewmodel/d$c;

    .line 99
    .line 100
    const/4 v4, 0x1

    .line 101
    iput v4, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1;->g:I

    .line 102
    .line 103
    invoke-interface {p1, v1, p0}, Lvd/k;->emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    if-ne p1, v0, :cond_0

    .line 108
    .line 109
    goto/16 :goto_9

    .line 110
    .line 111
    :cond_0
    :goto_0
    iget-object p1, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1;->h:Lcom/friday/document/viewmodel/TeacherOnlyViewModel;

    .line 112
    .line 113
    invoke-static {p1}, Lcom/friday/document/viewmodel/TeacherOnlyViewModel;->e(Lcom/friday/document/viewmodel/TeacherOnlyViewModel;)Lcom/friday/common/dao/FileDao;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    iget-object v1, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1;->h:Lcom/friday/document/viewmodel/TeacherOnlyViewModel;

    .line 118
    .line 119
    invoke-static {v1}, Lcom/friday/document/viewmodel/TeacherOnlyViewModel;->i(Lcom/friday/document/viewmodel/TeacherOnlyViewModel;)J

    .line 120
    .line 121
    .line 122
    move-result-wide v4

    .line 123
    const/4 v1, 0x2

    .line 124
    iput v1, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1;->g:I

    .line 125
    .line 126
    invoke-interface {p1, v4, v5, p0}, Lcom/friday/common/dao/FileDao;->K(JLvc/c;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    if-ne p1, v0, :cond_1

    .line 131
    .line 132
    goto/16 :goto_9

    .line 133
    .line 134
    :cond_1
    :goto_1
    move-object v1, p1

    .line 135
    check-cast v1, Ljava/util/List;

    .line 136
    .line 137
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    if-eqz p1, :cond_3

    .line 142
    .line 143
    iget-object p1, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1;->h:Lcom/friday/document/viewmodel/TeacherOnlyViewModel;

    .line 144
    .line 145
    invoke-static {p1}, Lcom/friday/document/viewmodel/TeacherOnlyViewModel;->h(Lcom/friday/document/viewmodel/TeacherOnlyViewModel;)Lvd/k;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    sget-object v2, Lcom/friday/document/viewmodel/d$a;->a:Lcom/friday/document/viewmodel/d$a;

    .line 150
    .line 151
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    iput-object v1, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1;->c:Ljava/lang/Object;

    .line 156
    .line 157
    const/4 v1, 0x3

    .line 158
    iput v1, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1;->g:I

    .line 159
    .line 160
    invoke-interface {p1, v2, p0}, Lvd/k;->emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    if-ne p1, v0, :cond_2

    .line 165
    .line 166
    goto/16 :goto_9

    .line 167
    .line 168
    :cond_2
    :goto_2
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 169
    .line 170
    return-object p1

    .line 171
    :cond_3
    iget-object p1, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1;->h:Lcom/friday/document/viewmodel/TeacherOnlyViewModel;

    .line 172
    .line 173
    :try_start_1
    sget-object v4, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 174
    .line 175
    invoke-static {p1}, Lcom/friday/document/viewmodel/TeacherOnlyViewModel;->g(Lcom/friday/document/viewmodel/TeacherOnlyViewModel;)Ls2/a;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    iput-object v1, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1;->c:Ljava/lang/Object;

    .line 180
    .line 181
    iput v3, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1;->f:I

    .line 182
    .line 183
    const/4 v4, 0x4

    .line 184
    iput v4, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1;->g:I

    .line 185
    .line 186
    invoke-interface {p1, p0}, Ls2/a;->a(Lvc/c;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    if-ne p1, v0, :cond_4

    .line 191
    .line 192
    goto/16 :goto_9

    .line 193
    .line 194
    :cond_4
    :goto_3
    check-cast p1, Lcom/friday/common/property/BaseResponse;

    .line 195
    .line 196
    invoke-virtual {p1}, Lcom/friday/common/property/BaseResponse;->getData()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    check-cast p1, Lcom/friday/common/entity/FileBean;

    .line 201
    .line 202
    invoke-virtual {p1}, Lcom/friday/common/entity/FileBean;->getNoteList()Ljava/util/List;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    invoke-static {p1}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 210
    :goto_4
    move-object v4, v1

    .line 211
    goto :goto_6

    .line 212
    :goto_5
    sget-object v4, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 213
    .line 214
    invoke-static {p1}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    invoke-static {p1}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    goto :goto_4

    .line 223
    :goto_6
    iget-object v1, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1;->h:Lcom/friday/document/viewmodel/TeacherOnlyViewModel;

    .line 224
    .line 225
    invoke-static {p1}, Lkotlin/Result;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 226
    .line 227
    .line 228
    move-result-object v5

    .line 229
    if-eqz v5, :cond_7

    .line 230
    .line 231
    invoke-static {v1}, Lcom/friday/document/viewmodel/TeacherOnlyViewModel;->h(Lcom/friday/document/viewmodel/TeacherOnlyViewModel;)Lvd/k;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    new-instance v1, Lcom/friday/document/viewmodel/d$b;

    .line 236
    .line 237
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    .line 238
    .line 239
    .line 240
    move-result-object v6

    .line 241
    invoke-direct {v1, v6}, Lcom/friday/document/viewmodel/d$b;-><init>(Ljava/util/List;)V

    .line 242
    .line 243
    .line 244
    invoke-static {v4}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v6

    .line 248
    iput-object v6, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1;->c:Ljava/lang/Object;

    .line 249
    .line 250
    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v6

    .line 254
    iput-object v6, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1;->d:Ljava/lang/Object;

    .line 255
    .line 256
    iput v3, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1;->f:I

    .line 257
    .line 258
    const/4 v6, 0x5

    .line 259
    iput v6, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1;->g:I

    .line 260
    .line 261
    invoke-interface {p1, v1, p0}, Lvd/k;->emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    if-ne p1, v0, :cond_5

    .line 266
    .line 267
    goto :goto_9

    .line 268
    :cond_5
    move-object v1, v5

    .line 269
    :goto_7
    invoke-static {}, Lsd/r0;->c()Lsd/t1;

    .line 270
    .line 271
    .line 272
    move-result-object p1

    .line 273
    new-instance v5, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$2$1;

    .line 274
    .line 275
    invoke-direct {v5, v2}, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$2$1;-><init>(Lvc/c;)V

    .line 276
    .line 277
    .line 278
    invoke-static {v4}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    iput-object v2, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1;->c:Ljava/lang/Object;

    .line 283
    .line 284
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    iput-object v1, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1;->d:Ljava/lang/Object;

    .line 289
    .line 290
    iput v3, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1;->f:I

    .line 291
    .line 292
    const/4 v1, 0x6

    .line 293
    iput v1, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1;->g:I

    .line 294
    .line 295
    invoke-static {p1, v5, p0}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    if-ne p1, v0, :cond_6

    .line 300
    .line 301
    goto :goto_9

    .line 302
    :cond_6
    :goto_8
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 303
    .line 304
    return-object p1

    .line 305
    :cond_7
    iget-object v1, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1;->h:Lcom/friday/document/viewmodel/TeacherOnlyViewModel;

    .line 306
    .line 307
    invoke-static {p1}, Lkotlin/Result;->k(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    move-result v5

    .line 311
    if-eqz v5, :cond_8

    .line 312
    .line 313
    move-object v5, p1

    .line 314
    check-cast v5, Ljava/util/List;

    .line 315
    .line 316
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 317
    .line 318
    .line 319
    move-result-object v6

    .line 320
    new-instance v7, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;

    .line 321
    .line 322
    invoke-direct {v7, v4, v1, v5, v2}, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;-><init>(Ljava/util/List;Lcom/friday/document/viewmodel/TeacherOnlyViewModel;Ljava/util/List;Lvc/c;)V

    .line 323
    .line 324
    .line 325
    invoke-static {v4}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v1

    .line 329
    iput-object v1, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1;->c:Ljava/lang/Object;

    .line 330
    .line 331
    iput-object p1, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1;->d:Ljava/lang/Object;

    .line 332
    .line 333
    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object p1

    .line 337
    iput-object p1, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1;->e:Ljava/lang/Object;

    .line 338
    .line 339
    iput v3, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1;->f:I

    .line 340
    .line 341
    const/4 p1, 0x7

    .line 342
    iput p1, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1;->g:I

    .line 343
    .line 344
    invoke-static {v6, v7, p0}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object p1

    .line 348
    if-ne p1, v0, :cond_8

    .line 349
    .line 350
    :goto_9
    return-object v0

    .line 351
    :cond_8
    :goto_a
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 352
    .line 353
    return-object p1

    .line 354
    nop

    .line 355
    :pswitch_data_0
    .packed-switch 0x0
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
