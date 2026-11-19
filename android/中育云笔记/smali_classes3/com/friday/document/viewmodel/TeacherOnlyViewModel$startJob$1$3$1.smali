.class final Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.friday.document.viewmodel.TeacherOnlyViewModel$startJob$1$3$1"
    f = "TeacherOnlyViewModel.kt"
    l = {
        0x39,
        0x3a,
        0x41,
        0x46,
        0x48,
        0x4a
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

.field public final synthetic m:Ljava/util/List;

.field public final synthetic n:Lcom/friday/document/viewmodel/TeacherOnlyViewModel;

.field public final synthetic o:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/friday/document/viewmodel/TeacherOnlyViewModel;Ljava/util/List;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->m:Ljava/util/List;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->n:Lcom/friday/document/viewmodel/TeacherOnlyViewModel;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->o:Ljava/util/List;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 3

    .line 1
    new-instance p1, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->m:Ljava/util/List;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->n:Lcom/friday/document/viewmodel/TeacherOnlyViewModel;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->o:Ljava/util/List;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;-><init>(Ljava/util/List;Lcom/friday/document/viewmodel/TeacherOnlyViewModel;Ljava/util/List;Lvc/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->l:I

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
    iget-object v0, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->e:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Ljava/util/List;

    .line 23
    .line 24
    iget-object v0, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->d:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Ljava/util/List;

    .line 27
    .line 28
    iget-object v0, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->c:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Ljava/util/List;

    .line 31
    .line 32
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    goto/16 :goto_a

    .line 36
    .line 37
    :pswitch_1
    iget-object v1, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->d:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v1, Ljava/util/List;

    .line 40
    .line 41
    iget-object v2, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->c:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v2, Ljava/util/List;

    .line 44
    .line 45
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto/16 :goto_8

    .line 49
    .line 50
    :pswitch_2
    iget v1, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->j:I

    .line 51
    .line 52
    iget-object v4, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->i:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v4, Lcom/friday/common/entity/FileEntity;

    .line 55
    .line 56
    iget-object v4, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->g:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v4, Ljava/util/Iterator;

    .line 59
    .line 60
    iget-object v5, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->f:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v5, Lcom/friday/document/viewmodel/TeacherOnlyViewModel;

    .line 63
    .line 64
    iget-object v6, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->e:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v6, Ljava/lang/Iterable;

    .line 67
    .line 68
    iget-object v7, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->d:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v7, Ljava/util/List;

    .line 71
    .line 72
    iget-object v8, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->c:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v8, Ljava/util/List;

    .line 75
    .line 76
    :try_start_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 77
    .line 78
    .line 79
    goto/16 :goto_6

    .line 80
    .line 81
    :catch_0
    move-exception p1

    .line 82
    goto/16 :goto_7

    .line 83
    .line 84
    :pswitch_3
    iget-object v0, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->d:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v0, Ljava/util/List;

    .line 87
    .line 88
    iget-object v0, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->c:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v0, Ljava/util/List;

    .line 91
    .line 92
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    goto/16 :goto_4

    .line 96
    .line 97
    :pswitch_4
    iget-object v1, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->d:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v1, Ljava/util/List;

    .line 100
    .line 101
    iget-object v2, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->c:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v2, Ljava/util/List;

    .line 104
    .line 105
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    goto/16 :goto_3

    .line 109
    .line 110
    :pswitch_5
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    iget-object p1, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->m:Ljava/util/List;

    .line 114
    .line 115
    check-cast p1, Ljava/lang/Iterable;

    .line 116
    .line 117
    iget-object v1, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->o:Ljava/util/List;

    .line 118
    .line 119
    new-instance v4, Ljava/util/ArrayList;

    .line 120
    .line 121
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 122
    .line 123
    .line 124
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    if-eqz v5, :cond_4

    .line 133
    .line 134
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    move-object v6, v5

    .line 139
    check-cast v6, Lcom/friday/common/entity/FileEntity;

    .line 140
    .line 141
    move-object v7, v1

    .line 142
    check-cast v7, Ljava/lang/Iterable;

    .line 143
    .line 144
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    :cond_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 149
    .line 150
    .line 151
    move-result v8

    .line 152
    if-eqz v8, :cond_2

    .line 153
    .line 154
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v8

    .line 158
    move-object v9, v8

    .line 159
    check-cast v9, Lcom/friday/common/entity/NoteBean;

    .line 160
    .line 161
    invoke-virtual {v9}, Lcom/friday/common/entity/NoteBean;->getFileId()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v9

    .line 165
    invoke-virtual {v6}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v10

    .line 169
    invoke-static {v9, v10}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v9

    .line 173
    if-eqz v9, :cond_1

    .line 174
    .line 175
    goto :goto_1

    .line 176
    :cond_2
    move-object v8, v3

    .line 177
    :goto_1
    check-cast v8, Lcom/friday/common/entity/NoteBean;

    .line 178
    .line 179
    if-eqz v8, :cond_3

    .line 180
    .line 181
    invoke-virtual {v8}, Lcom/friday/common/entity/NoteBean;->getVersion()I

    .line 182
    .line 183
    .line 184
    move-result v7

    .line 185
    goto :goto_2

    .line 186
    :cond_3
    move v7, v2

    .line 187
    :goto_2
    invoke-virtual {v6}, Lcom/friday/common/entity/FileEntity;->getVersion()I

    .line 188
    .line 189
    .line 190
    move-result v6

    .line 191
    if-le v7, v6, :cond_0

    .line 192
    .line 193
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    goto :goto_0

    .line 197
    :cond_4
    iget-object p1, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->m:Ljava/util/List;

    .line 198
    .line 199
    check-cast p1, Ljava/lang/Iterable;

    .line 200
    .line 201
    invoke-static {v4}, Lrc/g0;->c1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    check-cast v1, Ljava/lang/Iterable;

    .line 206
    .line 207
    invoke-static {p1, v1}, Lrc/g0;->F0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    sget-object p1, Lf2/c;->a:Lf2/c;

    .line 212
    .line 213
    invoke-virtual {p1}, Lf2/c;->e()Z

    .line 214
    .line 215
    .line 216
    move-result p1

    .line 217
    if-nez p1, :cond_7

    .line 218
    .line 219
    iget-object p1, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->n:Lcom/friday/document/viewmodel/TeacherOnlyViewModel;

    .line 220
    .line 221
    invoke-static {p1}, Lcom/friday/document/viewmodel/TeacherOnlyViewModel;->h(Lcom/friday/document/viewmodel/TeacherOnlyViewModel;)Lvd/k;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    new-instance v2, Lcom/friday/document/viewmodel/d$b;

    .line 226
    .line 227
    invoke-direct {v2, v1}, Lcom/friday/document/viewmodel/d$b;-><init>(Ljava/util/List;)V

    .line 228
    .line 229
    .line 230
    invoke-static {v4}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object v5

    .line 234
    iput-object v5, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->c:Ljava/lang/Object;

    .line 235
    .line 236
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v5

    .line 240
    iput-object v5, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->d:Ljava/lang/Object;

    .line 241
    .line 242
    const/4 v5, 0x1

    .line 243
    iput v5, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->l:I

    .line 244
    .line 245
    invoke-interface {p1, v2, p0}, Lvd/k;->emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    if-ne p1, v0, :cond_5

    .line 250
    .line 251
    goto/16 :goto_9

    .line 252
    .line 253
    :cond_5
    move-object v2, v4

    .line 254
    :goto_3
    invoke-static {}, Lsd/r0;->c()Lsd/t1;

    .line 255
    .line 256
    .line 257
    move-result-object p1

    .line 258
    new-instance v4, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1$1;

    .line 259
    .line 260
    invoke-direct {v4, v3}, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1$1;-><init>(Lvc/c;)V

    .line 261
    .line 262
    .line 263
    invoke-static {v2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    iput-object v2, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->c:Ljava/lang/Object;

    .line 268
    .line 269
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    iput-object v1, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->d:Ljava/lang/Object;

    .line 274
    .line 275
    const/4 v1, 0x2

    .line 276
    iput v1, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->l:I

    .line 277
    .line 278
    invoke-static {p1, v4, p0}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    if-ne p1, v0, :cond_6

    .line 283
    .line 284
    goto/16 :goto_9

    .line 285
    .line 286
    :cond_6
    :goto_4
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 287
    .line 288
    return-object p1

    .line 289
    :cond_7
    move-object p1, v1

    .line 290
    check-cast p1, Ljava/lang/Iterable;

    .line 291
    .line 292
    iget-object v5, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->n:Lcom/friday/document/viewmodel/TeacherOnlyViewModel;

    .line 293
    .line 294
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 295
    .line 296
    .line 297
    move-result-object v6

    .line 298
    move-object v7, p1

    .line 299
    move p1, v2

    .line 300
    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 301
    .line 302
    .line 303
    move-result v8

    .line 304
    if-eqz v8, :cond_9

    .line 305
    .line 306
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v8

    .line 310
    move-object v9, v8

    .line 311
    check-cast v9, Lcom/friday/common/entity/FileEntity;

    .line 312
    .line 313
    :try_start_1
    invoke-static {v5}, Lcom/friday/document/viewmodel/TeacherOnlyViewModel;->f(Lcom/friday/document/viewmodel/TeacherOnlyViewModel;)Lcom/friday/document/service/FileManager;

    .line 314
    .line 315
    .line 316
    move-result-object v10

    .line 317
    iput-object v4, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->c:Ljava/lang/Object;

    .line 318
    .line 319
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v11

    .line 323
    iput-object v11, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->d:Ljava/lang/Object;

    .line 324
    .line 325
    invoke-static {v7}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v11

    .line 329
    iput-object v11, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->e:Ljava/lang/Object;

    .line 330
    .line 331
    iput-object v5, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->f:Ljava/lang/Object;

    .line 332
    .line 333
    iput-object v6, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->g:Ljava/lang/Object;

    .line 334
    .line 335
    invoke-static {v8}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v8

    .line 339
    iput-object v8, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->h:Ljava/lang/Object;

    .line 340
    .line 341
    invoke-static {v9}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v8

    .line 345
    iput-object v8, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->i:Ljava/lang/Object;

    .line 346
    .line 347
    iput p1, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->j:I

    .line 348
    .line 349
    iput v2, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->k:I

    .line 350
    .line 351
    const/4 v8, 0x3

    .line 352
    iput v8, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->l:I

    .line 353
    .line 354
    invoke-virtual {v10, v9, p0}, Lcom/friday/document/service/FileManager;->G(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v8
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 358
    if-ne v8, v0, :cond_8

    .line 359
    .line 360
    goto/16 :goto_9

    .line 361
    .line 362
    :cond_8
    move-object v8, v4

    .line 363
    move-object v4, v6

    .line 364
    move-object v6, v7

    .line 365
    move-object v7, v1

    .line 366
    move v1, p1

    .line 367
    :goto_6
    move p1, v1

    .line 368
    move-object v1, v7

    .line 369
    move-object v7, v6

    .line 370
    move-object v6, v4

    .line 371
    move-object v4, v8

    .line 372
    goto :goto_5

    .line 373
    :catch_1
    move-exception v8

    .line 374
    move-object v12, v1

    .line 375
    move v1, p1

    .line 376
    move-object p1, v8

    .line 377
    move-object v8, v4

    .line 378
    move-object v4, v6

    .line 379
    move-object v6, v7

    .line 380
    move-object v7, v12

    .line 381
    :goto_7
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 382
    .line 383
    .line 384
    goto :goto_6

    .line 385
    :cond_9
    iget-object p1, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->n:Lcom/friday/document/viewmodel/TeacherOnlyViewModel;

    .line 386
    .line 387
    invoke-static {p1}, Lcom/friday/document/viewmodel/TeacherOnlyViewModel;->e(Lcom/friday/document/viewmodel/TeacherOnlyViewModel;)Lcom/friday/common/dao/FileDao;

    .line 388
    .line 389
    .line 390
    move-result-object p1

    .line 391
    iget-object v2, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->n:Lcom/friday/document/viewmodel/TeacherOnlyViewModel;

    .line 392
    .line 393
    invoke-static {v2}, Lcom/friday/document/viewmodel/TeacherOnlyViewModel;->i(Lcom/friday/document/viewmodel/TeacherOnlyViewModel;)J

    .line 394
    .line 395
    .line 396
    move-result-wide v5

    .line 397
    iput-object v4, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->c:Ljava/lang/Object;

    .line 398
    .line 399
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v2

    .line 403
    iput-object v2, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->d:Ljava/lang/Object;

    .line 404
    .line 405
    iput-object v3, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->e:Ljava/lang/Object;

    .line 406
    .line 407
    iput-object v3, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->f:Ljava/lang/Object;

    .line 408
    .line 409
    iput-object v3, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->g:Ljava/lang/Object;

    .line 410
    .line 411
    iput-object v3, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->h:Ljava/lang/Object;

    .line 412
    .line 413
    iput-object v3, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->i:Ljava/lang/Object;

    .line 414
    .line 415
    const/4 v2, 0x4

    .line 416
    iput v2, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->l:I

    .line 417
    .line 418
    invoke-interface {p1, v5, v6, p0}, Lcom/friday/common/dao/FileDao;->K(JLvc/c;)Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object p1

    .line 422
    if-ne p1, v0, :cond_a

    .line 423
    .line 424
    goto :goto_9

    .line 425
    :cond_a
    move-object v2, v4

    .line 426
    :goto_8
    check-cast p1, Ljava/util/List;

    .line 427
    .line 428
    move-object v3, p1

    .line 429
    check-cast v3, Ljava/lang/Iterable;

    .line 430
    .line 431
    move-object v4, v2

    .line 432
    check-cast v4, Ljava/lang/Iterable;

    .line 433
    .line 434
    invoke-static {v4}, Lrc/g0;->c1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 435
    .line 436
    .line 437
    move-result-object v5

    .line 438
    check-cast v5, Ljava/lang/Iterable;

    .line 439
    .line 440
    invoke-static {v3, v5}, Lrc/g0;->F0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    .line 441
    .line 442
    .line 443
    move-result-object v5

    .line 444
    check-cast v5, Ljava/util/Collection;

    .line 445
    .line 446
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 447
    .line 448
    .line 449
    move-result v5

    .line 450
    if-nez v5, :cond_b

    .line 451
    .line 452
    iget-object v5, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->n:Lcom/friday/document/viewmodel/TeacherOnlyViewModel;

    .line 453
    .line 454
    invoke-static {v5}, Lcom/friday/document/viewmodel/TeacherOnlyViewModel;->h(Lcom/friday/document/viewmodel/TeacherOnlyViewModel;)Lvd/k;

    .line 455
    .line 456
    .line 457
    move-result-object v5

    .line 458
    new-instance v6, Lcom/friday/document/viewmodel/d$b;

    .line 459
    .line 460
    invoke-static {v4}, Lrc/g0;->c1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 461
    .line 462
    .line 463
    move-result-object v4

    .line 464
    check-cast v4, Ljava/lang/Iterable;

    .line 465
    .line 466
    invoke-static {v3, v4}, Lrc/g0;->F0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    .line 467
    .line 468
    .line 469
    move-result-object v3

    .line 470
    invoke-direct {v6, v3}, Lcom/friday/document/viewmodel/d$b;-><init>(Ljava/util/List;)V

    .line 471
    .line 472
    .line 473
    invoke-static {v2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v2

    .line 477
    iput-object v2, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->c:Ljava/lang/Object;

    .line 478
    .line 479
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object v1

    .line 483
    iput-object v1, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->d:Ljava/lang/Object;

    .line 484
    .line 485
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object p1

    .line 489
    iput-object p1, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->e:Ljava/lang/Object;

    .line 490
    .line 491
    const/4 p1, 0x5

    .line 492
    iput p1, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->l:I

    .line 493
    .line 494
    invoke-interface {v5, v6, p0}, Lvd/k;->emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object p1

    .line 498
    if-ne p1, v0, :cond_c

    .line 499
    .line 500
    goto :goto_9

    .line 501
    :cond_b
    iget-object v3, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->n:Lcom/friday/document/viewmodel/TeacherOnlyViewModel;

    .line 502
    .line 503
    invoke-static {v3}, Lcom/friday/document/viewmodel/TeacherOnlyViewModel;->h(Lcom/friday/document/viewmodel/TeacherOnlyViewModel;)Lvd/k;

    .line 504
    .line 505
    .line 506
    move-result-object v3

    .line 507
    sget-object v4, Lcom/friday/document/viewmodel/d$a;->a:Lcom/friday/document/viewmodel/d$a;

    .line 508
    .line 509
    invoke-static {v2}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v2

    .line 513
    iput-object v2, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->c:Ljava/lang/Object;

    .line 514
    .line 515
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 516
    .line 517
    .line 518
    move-result-object v1

    .line 519
    iput-object v1, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->d:Ljava/lang/Object;

    .line 520
    .line 521
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object p1

    .line 525
    iput-object p1, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->e:Ljava/lang/Object;

    .line 526
    .line 527
    const/4 p1, 0x6

    .line 528
    iput p1, p0, Lcom/friday/document/viewmodel/TeacherOnlyViewModel$startJob$1$3$1;->l:I

    .line 529
    .line 530
    invoke-interface {v3, v4, p0}, Lvd/k;->emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    move-result-object p1

    .line 534
    if-ne p1, v0, :cond_c

    .line 535
    .line 536
    :goto_9
    return-object v0

    .line 537
    :cond_c
    :goto_a
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 538
    .line 539
    return-object p1

    .line 540
    nop

    .line 541
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
