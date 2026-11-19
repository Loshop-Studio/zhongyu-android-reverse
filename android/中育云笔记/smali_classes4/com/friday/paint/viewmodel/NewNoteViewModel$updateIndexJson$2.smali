.class final Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/viewmodel/NewNoteViewModel;->d0(Ljava/util/List;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/l;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.paint.viewmodel.NewNoteViewModel$updateIndexJson$2"
    f = "NewNoteViewModel.kt"
    l = {
        0x9d,
        0xa0,
        0xab,
        0xae,
        0xaf,
        0xb0
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:I

.field public final synthetic g:Ljava/util/List;

.field public final synthetic h:Lcom/friday/paint/viewmodel/NewNoteViewModel;


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/friday/paint/viewmodel/NewNoteViewModel;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->g:Ljava/util/List;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->h:Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Lvc/c;)Lvc/c;
    .locals 3

    .line 1
    new-instance v0, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->g:Ljava/util/List;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->h:Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p1}, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;-><init>(Ljava/util/List;Lcom/friday/paint/viewmodel/NewNoteViewModel;Lvc/c;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lvc/c;

    invoke-virtual {p0, p1}, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->invoke(Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lvc/c;)Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0, p1}, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->create(Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;

    sget-object v0, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, v0}, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v6

    .line 7
    iget v0, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->f:I

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw v0

    .line 20
    :pswitch_0
    iget-object v0, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->e:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Ljava/lang/String;

    .line 23
    .line 24
    iget-object v0, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->d:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Lcom/friday/common/entity/FileEntity;

    .line 27
    .line 28
    iget-object v0, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->c:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Ljava/util/List;

    .line 31
    .line 32
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    goto/16 :goto_7

    .line 36
    .line 37
    :pswitch_1
    iget-object v0, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->e:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Ljava/lang/String;

    .line 40
    .line 41
    iget-object v1, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->d:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, Lcom/friday/common/entity/FileEntity;

    .line 44
    .line 45
    iget-object v2, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->c:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v2, Ljava/util/List;

    .line 48
    .line 49
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    goto/16 :goto_4

    .line 53
    .line 54
    :pswitch_2
    iget-object v0, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->e:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Ljava/lang/String;

    .line 57
    .line 58
    iget-object v1, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->d:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v1, Lcom/friday/common/entity/FileEntity;

    .line 61
    .line 62
    iget-object v2, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->c:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v2, Ljava/util/List;

    .line 65
    .line 66
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    goto/16 :goto_3

    .line 70
    .line 71
    :pswitch_3
    iget-object v0, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->e:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v0, Ljava/lang/String;

    .line 74
    .line 75
    iget-object v1, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->d:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v1, Lcom/friday/common/entity/FileEntity;

    .line 78
    .line 79
    iget-object v2, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->c:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v2, Ljava/util/List;

    .line 82
    .line 83
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    goto/16 :goto_2

    .line 87
    .line 88
    :pswitch_4
    iget-object v0, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->c:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v0, Ljava/util/List;

    .line 91
    .line 92
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    move-object v7, v0

    .line 96
    move-object/from16 v0, p1

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :pswitch_5
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    iget-object v0, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->g:Ljava/util/List;

    .line 103
    .line 104
    check-cast v0, Ljava/lang/Iterable;

    .line 105
    .line 106
    new-instance v1, Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 109
    .line 110
    .line 111
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-eqz v2, :cond_1

    .line 120
    .line 121
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    move-object v3, v2

    .line 126
    check-cast v3, Ljava/lang/String;

    .line 127
    .line 128
    sget-object v4, Lf2/e;->a:Lf2/e;

    .line 129
    .line 130
    new-instance v7, Ljava/io/File;

    .line 131
    .line 132
    invoke-direct {v7, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v4, v7}, Lf2/e;->a(Ljava/io/File;)Z

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    if-nez v3, :cond_0

    .line 140
    .line 141
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_1
    iget-object v0, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->h:Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 146
    .line 147
    invoke-static {v0}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->h(Lcom/friday/paint/viewmodel/NewNoteViewModel;)Lcom/friday/common/dao/FileDao;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    iget-object v2, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->h:Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 152
    .line 153
    invoke-virtual {v2}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->G()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    iput-object v1, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->c:Ljava/lang/Object;

    .line 158
    .line 159
    const/4 v3, 0x1

    .line 160
    iput v3, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->f:I

    .line 161
    .line 162
    invoke-interface {v0, v2, v5}, Lcom/friday/common/dao/FileDao;->r(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    if-ne v0, v6, :cond_2

    .line 167
    .line 168
    goto/16 :goto_6

    .line 169
    .line 170
    :cond_2
    move-object v7, v1

    .line 171
    :goto_1
    move-object v8, v0

    .line 172
    check-cast v8, Lcom/friday/common/entity/FileEntity;

    .line 173
    .line 174
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 175
    .line 176
    const-string v1, "yyyy-MM-dd HH:mm:ss"

    .line 177
    .line 178
    sget-object v2, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 179
    .line 180
    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 181
    .line 182
    .line 183
    new-instance v1, Ljava/util/Date;

    .line 184
    .line 185
    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    if-nez v8, :cond_4

    .line 193
    .line 194
    iget-object v0, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->h:Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 195
    .line 196
    invoke-static {v4}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    new-instance v9, Lcom/friday/common/entity/CreateNoteInput;

    .line 200
    .line 201
    iget-object v1, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->h:Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 202
    .line 203
    invoke-virtual {v1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->G()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v10

    .line 207
    iget-object v1, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->h:Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 208
    .line 209
    invoke-virtual {v1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->H()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v11

    .line 213
    iget-object v1, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->h:Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 214
    .line 215
    invoke-virtual {v1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->K()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v12

    .line 219
    iget-object v1, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->h:Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 220
    .line 221
    invoke-static {v1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->l(Lcom/friday/paint/viewmodel/NewNoteViewModel;)J

    .line 222
    .line 223
    .line 224
    move-result-wide v13

    .line 225
    iget-object v1, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->h:Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 226
    .line 227
    invoke-virtual {v1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->E()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v15

    .line 231
    const/16 v17, 0x20

    .line 232
    .line 233
    const/16 v18, 0x0

    .line 234
    .line 235
    const/16 v16, 0x0

    .line 236
    .line 237
    invoke-direct/range {v9 .. v18}, Lcom/friday/common/entity/CreateNoteInput;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 238
    .line 239
    .line 240
    iput-object v7, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->c:Ljava/lang/Object;

    .line 241
    .line 242
    invoke-static {v8}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    iput-object v1, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->d:Ljava/lang/Object;

    .line 247
    .line 248
    iput-object v4, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->e:Ljava/lang/Object;

    .line 249
    .line 250
    const/4 v1, 0x2

    .line 251
    iput v1, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->f:I

    .line 252
    .line 253
    invoke-static {v0, v4, v9, v5}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->f(Lcom/friday/paint/viewmodel/NewNoteViewModel;Ljava/lang/String;Lcom/friday/common/entity/CreateNoteInput;Lvc/c;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    if-ne v0, v6, :cond_3

    .line 258
    .line 259
    goto/16 :goto_6

    .line 260
    .line 261
    :cond_3
    move-object v0, v4

    .line 262
    move-object v2, v7

    .line 263
    move-object v1, v8

    .line 264
    goto :goto_2

    .line 265
    :cond_4
    iget-object v0, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->h:Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 266
    .line 267
    invoke-virtual {v0}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->G()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    iget-object v2, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->h:Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 272
    .line 273
    invoke-virtual {v2}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->H()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    invoke-static {v4}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    iput-object v7, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->c:Ljava/lang/Object;

    .line 281
    .line 282
    invoke-static {v8}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v3

    .line 286
    iput-object v3, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->d:Ljava/lang/Object;

    .line 287
    .line 288
    iput-object v4, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->e:Ljava/lang/Object;

    .line 289
    .line 290
    const/4 v3, 0x3

    .line 291
    iput v3, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->f:I

    .line 292
    .line 293
    const/4 v3, 0x1

    .line 294
    invoke-static/range {v0 .. v5}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->r(Lcom/friday/paint/viewmodel/NewNoteViewModel;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    if-ne v0, v6, :cond_3

    .line 299
    .line 300
    goto/16 :goto_6

    .line 301
    .line 302
    :goto_2
    iget-object v3, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->h:Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 303
    .line 304
    invoke-static {v3}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->h(Lcom/friday/paint/viewmodel/NewNoteViewModel;)Lcom/friday/common/dao/FileDao;

    .line 305
    .line 306
    .line 307
    move-result-object v3

    .line 308
    iget-object v4, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->h:Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 309
    .line 310
    invoke-virtual {v4}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->G()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v4

    .line 314
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 315
    .line 316
    .line 317
    iput-object v2, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->c:Ljava/lang/Object;

    .line 318
    .line 319
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v7

    .line 323
    iput-object v7, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->d:Ljava/lang/Object;

    .line 324
    .line 325
    invoke-static {v0}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v7

    .line 329
    iput-object v7, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->e:Ljava/lang/Object;

    .line 330
    .line 331
    const/4 v7, 0x4

    .line 332
    iput v7, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->f:I

    .line 333
    .line 334
    invoke-interface {v3, v4, v0, v5}, Lcom/friday/common/dao/FileDao;->p(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v3

    .line 338
    if-ne v3, v6, :cond_5

    .line 339
    .line 340
    goto/16 :goto_6

    .line 341
    .line 342
    :cond_5
    :goto_3
    iget-object v3, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->h:Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 343
    .line 344
    iput-object v2, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->c:Ljava/lang/Object;

    .line 345
    .line 346
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v4

    .line 350
    iput-object v4, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->d:Ljava/lang/Object;

    .line 351
    .line 352
    invoke-static {v0}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v4

    .line 356
    iput-object v4, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->e:Ljava/lang/Object;

    .line 357
    .line 358
    const/4 v4, 0x5

    .line 359
    iput v4, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->f:I

    .line 360
    .line 361
    invoke-static {v3, v2, v5}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->q(Lcom/friday/paint/viewmodel/NewNoteViewModel;Ljava/util/List;Lvc/c;)Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v3

    .line 365
    if-ne v3, v6, :cond_6

    .line 366
    .line 367
    goto/16 :goto_6

    .line 368
    .line 369
    :cond_6
    :goto_4
    iget-object v3, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->h:Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 370
    .line 371
    invoke-static {v3}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->k(Lcom/friday/paint/viewmodel/NewNoteViewModel;)Lcom/friday/common/dao/ResourceDao;

    .line 372
    .line 373
    .line 374
    move-result-object v3

    .line 375
    iget-object v4, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->h:Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 376
    .line 377
    invoke-virtual {v4}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->G()Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v4

    .line 381
    move-object v7, v2

    .line 382
    check-cast v7, Ljava/lang/Iterable;

    .line 383
    .line 384
    invoke-static {v7}, Lrc/g0;->f1(Ljava/lang/Iterable;)Ljava/lang/Iterable;

    .line 385
    .line 386
    .line 387
    move-result-object v7

    .line 388
    const/16 v8, 0xa

    .line 389
    .line 390
    invoke-static {v7, v8}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 391
    .line 392
    .line 393
    move-result v8

    .line 394
    invoke-static {v8}, Lrc/q0;->e(I)I

    .line 395
    .line 396
    .line 397
    move-result v8

    .line 398
    const/16 v9, 0x10

    .line 399
    .line 400
    invoke-static {v8, v9}, Lnd/o;->e(II)I

    .line 401
    .line 402
    .line 403
    move-result v8

    .line 404
    move-object v9, v2

    .line 405
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 406
    .line 407
    invoke-direct {v2, v8}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 408
    .line 409
    .line 410
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 411
    .line 412
    .line 413
    move-result-object v7

    .line 414
    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 415
    .line 416
    .line 417
    move-result v8

    .line 418
    if-eqz v8, :cond_7

    .line 419
    .line 420
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v8

    .line 424
    check-cast v8, Lrc/k0;

    .line 425
    .line 426
    invoke-virtual {v8}, Lrc/k0;->b()Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v10

    .line 430
    invoke-virtual {v8}, Lrc/k0;->a()I

    .line 431
    .line 432
    .line 433
    move-result v8

    .line 434
    invoke-static {v8}, Lxc/a;->c(I)Ljava/lang/Integer;

    .line 435
    .line 436
    .line 437
    move-result-object v8

    .line 438
    invoke-static {v10, v8}, Lqc/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 439
    .line 440
    .line 441
    move-result-object v8

    .line 442
    invoke-virtual {v8}, Lkotlin/Pair;->f()Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v10

    .line 446
    invoke-virtual {v8}, Lkotlin/Pair;->g()Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v8

    .line 450
    invoke-interface {v2, v10, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    goto :goto_5

    .line 454
    :cond_7
    iget-object v7, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->h:Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 455
    .line 456
    invoke-static {v7}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->l(Lcom/friday/paint/viewmodel/NewNoteViewModel;)J

    .line 457
    .line 458
    .line 459
    move-result-wide v7

    .line 460
    invoke-static {v9}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v9

    .line 464
    iput-object v9, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->c:Ljava/lang/Object;

    .line 465
    .line 466
    invoke-static {v1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v1

    .line 470
    iput-object v1, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->d:Ljava/lang/Object;

    .line 471
    .line 472
    invoke-static {v0}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object v0

    .line 476
    iput-object v0, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->e:Ljava/lang/Object;

    .line 477
    .line 478
    const/4 v0, 0x6

    .line 479
    iput v0, v5, Lcom/friday/paint/viewmodel/NewNoteViewModel$updateIndexJson$2;->f:I

    .line 480
    .line 481
    move-object v0, v3

    .line 482
    move-object v1, v4

    .line 483
    move-wide v3, v7

    .line 484
    invoke-interface/range {v0 .. v5}, Lcom/friday/common/dao/ResourceDao;->o(Ljava/lang/String;Ljava/util/Map;JLvc/c;)Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    if-ne v0, v6, :cond_8

    .line 489
    .line 490
    :goto_6
    return-object v6

    .line 491
    :cond_8
    :goto_7
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 492
    .line 493
    return-object v0

    .line 494
    nop

    .line 495
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
