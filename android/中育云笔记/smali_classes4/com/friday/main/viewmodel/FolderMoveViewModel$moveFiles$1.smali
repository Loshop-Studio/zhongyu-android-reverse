.class final Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/main/viewmodel/FolderMoveViewModel;->H(Ljava/lang/String;Ljava/util/List;)V
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
    c = "com.friday.main.viewmodel.FolderMoveViewModel$moveFiles$1"
    f = "FolderMoveViewModel.kt"
    l = {
        0x96,
        0x99,
        0x9f,
        0xa0,
        0xa2
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:I

.field public final synthetic g:Lcom/friday/main/viewmodel/FolderMoveViewModel;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ljava/util/List;


# direct methods
.method public constructor <init>(Lcom/friday/main/viewmodel/FolderMoveViewModel;Ljava/lang/String;Ljava/util/List;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;->g:Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;->h:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;->i:Ljava/util/List;

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
    new-instance p1, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;->g:Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;->h:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;->i:Ljava/util/List;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;-><init>(Lcom/friday/main/viewmodel/FolderMoveViewModel;Ljava/lang/String;Ljava/util/List;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    move-result-object v1

    .line 5
    iget v0, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;->f:I

    .line 6
    .line 7
    const/4 v2, 0x5

    .line 8
    const/4 v3, 0x4

    .line 9
    const/4 v4, 0x3

    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x1

    .line 12
    if-eqz v0, :cond_6

    .line 13
    .line 14
    if-eq v0, v6, :cond_4

    .line 15
    .line 16
    if-eq v0, v5, :cond_3

    .line 17
    .line 18
    if-eq v0, v4, :cond_2

    .line 19
    .line 20
    if-eq v0, v3, :cond_1

    .line 21
    .line 22
    if-ne v0, v2, :cond_0

    .line 23
    .line 24
    iget-object v0, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Ljava/lang/Exception;

    .line 27
    .line 28
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 33
    .line 34
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 35
    .line 36
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p1

    .line 40
    :cond_1
    iget-object v0, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;->e:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Ljava/util/List;

    .line 43
    .line 44
    iget-object v0, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;->d:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Ljava/util/List;

    .line 47
    .line 48
    iget-object v0, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;->c:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Ljava/lang/String;

    .line 51
    .line 52
    :try_start_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    .line 54
    .line 55
    :goto_0
    move-object v12, p0

    .line 56
    goto/16 :goto_8

    .line 57
    .line 58
    :catch_0
    move-exception v0

    .line 59
    move-object p1, v0

    .line 60
    move-object v12, p0

    .line 61
    goto/16 :goto_6

    .line 62
    .line 63
    :cond_2
    iget-object v0, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;->e:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v0, Ljava/util/List;

    .line 66
    .line 67
    iget-object v4, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;->d:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v4, Ljava/util/List;

    .line 70
    .line 71
    iget-object v5, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;->c:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v5, Ljava/lang/String;

    .line 74
    .line 75
    :try_start_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 76
    .line 77
    .line 78
    move-object v12, p0

    .line 79
    goto/16 :goto_4

    .line 80
    .line 81
    :cond_3
    iget-object v0, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;->e:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, Ljava/util/List;

    .line 84
    .line 85
    iget-object v5, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;->d:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v5, Ljava/util/List;

    .line 88
    .line 89
    iget-object v7, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;->c:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v7, Ljava/lang/String;

    .line 92
    .line 93
    :try_start_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 94
    .line 95
    .line 96
    move-object v12, p0

    .line 97
    move-object p1, v5

    .line 98
    move-object v5, v7

    .line 99
    goto/16 :goto_3

    .line 100
    .line 101
    :cond_4
    iget-object v0, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;->c:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v0, Ljava/lang/String;

    .line 104
    .line 105
    :try_start_3
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 106
    .line 107
    .line 108
    :cond_5
    move-object v11, v0

    .line 109
    goto :goto_1

    .line 110
    :cond_6
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    :try_start_4
    new-instance p1, Ljava/text/SimpleDateFormat;

    .line 114
    .line 115
    const-string v0, "yyyy-MM-dd HH:mm:ss"

    .line 116
    .line 117
    sget-object v7, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 118
    .line 119
    invoke-direct {p1, v0, v7}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 120
    .line 121
    .line 122
    new-instance v0, Ljava/util/Date;

    .line 123
    .line 124
    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    iget-object p1, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;->g:Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 132
    .line 133
    invoke-static {p1}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->h(Lcom/friday/main/viewmodel/FolderMoveViewModel;)Lcom/friday/common/dao/FileDao;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    iget-object v7, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;->h:Ljava/lang/String;

    .line 138
    .line 139
    iput-object v0, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;->c:Ljava/lang/Object;

    .line 140
    .line 141
    iput v6, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;->f:I

    .line 142
    .line 143
    invoke-interface {p1, v7, p0}, Lcom/friday/common/dao/FileDao;->E(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    if-ne p1, v1, :cond_5

    .line 148
    .line 149
    move-object v12, p0

    .line 150
    goto/16 :goto_7

    .line 151
    .line 152
    :goto_1
    check-cast p1, Ljava/util/List;

    .line 153
    .line 154
    iget-object v0, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;->i:Ljava/util/List;

    .line 155
    .line 156
    check-cast v0, Ljava/lang/Iterable;

    .line 157
    .line 158
    new-instance v9, Ljava/util/ArrayList;

    .line 159
    .line 160
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 161
    .line 162
    .line 163
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    :cond_7
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 168
    .line 169
    .line 170
    move-result v7
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 171
    if-eqz v7, :cond_8

    .line 172
    .line 173
    :try_start_5
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v7

    .line 177
    move-object v8, v7

    .line 178
    check-cast v8, Ljava/lang/String;

    .line 179
    .line 180
    invoke-interface {p1, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v8

    .line 184
    if-nez v8, :cond_7

    .line 185
    .line 186
    invoke-interface {v9, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 187
    .line 188
    .line 189
    goto :goto_2

    .line 190
    :cond_8
    :try_start_6
    iget-object v0, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;->g:Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 191
    .line 192
    invoke-static {v0}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->h(Lcom/friday/main/viewmodel/FolderMoveViewModel;)Lcom/friday/common/dao/FileDao;

    .line 193
    .line 194
    .line 195
    move-result-object v7

    .line 196
    iget-object v8, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;->h:Ljava/lang/String;

    .line 197
    .line 198
    invoke-static {v11}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    iput-object v11, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;->c:Ljava/lang/Object;

    .line 202
    .line 203
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    iput-object v0, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;->d:Ljava/lang/Object;

    .line 208
    .line 209
    invoke-static {v9}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    iput-object v0, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;->e:Ljava/lang/Object;

    .line 214
    .line 215
    iput v5, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;->f:I
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    .line 216
    .line 217
    const/4 v10, 0x1

    .line 218
    move-object v12, p0

    .line 219
    :try_start_7
    invoke-interface/range {v7 .. v12}, Lcom/friday/common/dao/FileDao;->y(Ljava/lang/String;Ljava/util/List;ILjava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    if-ne v0, v1, :cond_9

    .line 224
    .line 225
    goto/16 :goto_7

    .line 226
    .line 227
    :cond_9
    move-object v0, v9

    .line 228
    move-object v5, v11

    .line 229
    :goto_3
    iget-object v7, v12, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;->g:Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 230
    .line 231
    invoke-static {v7}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->h(Lcom/friday/main/viewmodel/FolderMoveViewModel;)Lcom/friday/common/dao/FileDao;

    .line 232
    .line 233
    .line 234
    move-result-object v7

    .line 235
    iget-object v8, v12, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;->h:Ljava/lang/String;

    .line 236
    .line 237
    invoke-static {v5}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v9

    .line 244
    iput-object v9, v12, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;->c:Ljava/lang/Object;

    .line 245
    .line 246
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v9

    .line 250
    iput-object v9, v12, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;->d:Ljava/lang/Object;

    .line 251
    .line 252
    invoke-static {v0}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v9

    .line 256
    iput-object v9, v12, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;->e:Ljava/lang/Object;

    .line 257
    .line 258
    iput v4, v12, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;->f:I

    .line 259
    .line 260
    invoke-interface {v7, v8, v5, p0}, Lcom/friday/common/dao/FileDao;->p(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v4

    .line 264
    if-ne v4, v1, :cond_a

    .line 265
    .line 266
    goto :goto_7

    .line 267
    :cond_a
    move-object v4, p1

    .line 268
    :goto_4
    iget-object p1, v12, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;->g:Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 269
    .line 270
    invoke-static {p1}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->n(Lcom/friday/main/viewmodel/FolderMoveViewModel;)Lvd/k;

    .line 271
    .line 272
    .line 273
    move-result-object p1

    .line 274
    invoke-static {v6}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 275
    .line 276
    .line 277
    move-result-object v6

    .line 278
    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v5

    .line 282
    iput-object v5, v12, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;->c:Ljava/lang/Object;

    .line 283
    .line 284
    invoke-static {v4}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v4

    .line 288
    iput-object v4, v12, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;->d:Ljava/lang/Object;

    .line 289
    .line 290
    invoke-static {v0}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v0

    .line 294
    iput-object v0, v12, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;->e:Ljava/lang/Object;

    .line 295
    .line 296
    iput v3, v12, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;->f:I

    .line 297
    .line 298
    invoke-interface {p1, v6, p0}, Lvd/k;->emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object p1
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1

    .line 302
    if-ne p1, v1, :cond_b

    .line 303
    .line 304
    goto :goto_7

    .line 305
    :catch_1
    move-exception v0

    .line 306
    :goto_5
    move-object p1, v0

    .line 307
    goto :goto_6

    .line 308
    :catch_2
    move-exception v0

    .line 309
    move-object v12, p0

    .line 310
    goto :goto_5

    .line 311
    :goto_6
    iget-object v0, v12, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;->g:Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 312
    .line 313
    invoke-static {v0}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->n(Lcom/friday/main/viewmodel/FolderMoveViewModel;)Lvd/k;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    const/4 v3, 0x0

    .line 318
    invoke-static {v3}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 319
    .line 320
    .line 321
    move-result-object v3

    .line 322
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object p1

    .line 326
    iput-object p1, v12, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;->c:Ljava/lang/Object;

    .line 327
    .line 328
    const/4 p1, 0x0

    .line 329
    iput-object p1, v12, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;->d:Ljava/lang/Object;

    .line 330
    .line 331
    iput-object p1, v12, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;->e:Ljava/lang/Object;

    .line 332
    .line 333
    iput v2, v12, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFiles$1;->f:I

    .line 334
    .line 335
    invoke-interface {v0, v3, p0}, Lvd/k;->emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object p1

    .line 339
    if-ne p1, v1, :cond_b

    .line 340
    .line 341
    :goto_7
    return-object v1

    .line 342
    :cond_b
    :goto_8
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 343
    .line 344
    return-object p1
.end method
