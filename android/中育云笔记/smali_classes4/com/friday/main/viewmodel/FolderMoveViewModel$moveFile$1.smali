.class final Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/main/viewmodel/FolderMoveViewModel;->G(Ljava/lang/String;Ljava/lang/String;)V
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
    c = "com.friday.main.viewmodel.FolderMoveViewModel$moveFile$1"
    f = "FolderMoveViewModel.kt"
    l = {
        0x80,
        0x82,
        0x88,
        0x89,
        0x8a,
        0x8c
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

.field public i:I

.field public j:I

.field public final synthetic k:Lcom/friday/main/viewmodel/FolderMoveViewModel;

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/friday/main/viewmodel/FolderMoveViewModel;Ljava/lang/String;Ljava/lang/String;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->k:Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->l:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->m:Ljava/lang/String;

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
    new-instance p1, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->k:Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->l:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->m:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;-><init>(Lcom/friday/main/viewmodel/FolderMoveViewModel;Ljava/lang/String;Ljava/lang/String;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v0, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->j:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 14
    .line 15
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 16
    .line 17
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p1

    .line 21
    :pswitch_0
    iget-object v0, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->c:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Ljava/lang/Exception;

    .line 24
    .line 25
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    move-object v10, p0

    .line 29
    goto/16 :goto_9

    .line 30
    .line 31
    :pswitch_1
    iget-object v0, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->d:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Lcom/friday/common/entity/FileEntity;

    .line 34
    .line 35
    iget-object v0, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->c:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Ljava/lang/String;

    .line 38
    .line 39
    :try_start_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    .line 42
    move-object v10, p0

    .line 43
    goto/16 :goto_6

    .line 44
    .line 45
    :catch_0
    move-exception v0

    .line 46
    move-object p1, v0

    .line 47
    move-object v10, p0

    .line 48
    goto/16 :goto_7

    .line 49
    .line 50
    :pswitch_2
    iget-object v0, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->f:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v0, Lcom/friday/common/entity/FileEntity;

    .line 53
    .line 54
    iget-object v0, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->e:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Lcom/friday/common/entity/FileEntity;

    .line 57
    .line 58
    iget-object v2, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->d:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v2, Lcom/friday/common/entity/FileEntity;

    .line 61
    .line 62
    iget-object v5, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->c:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v5, Ljava/lang/String;

    .line 65
    .line 66
    :try_start_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 67
    .line 68
    .line 69
    move-object v10, p0

    .line 70
    goto/16 :goto_3

    .line 71
    .line 72
    :pswitch_3
    iget v0, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->i:I

    .line 73
    .line 74
    iget-object v5, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->g:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v5, Lcom/friday/common/entity/FileEntity;

    .line 77
    .line 78
    iget-object v6, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->f:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v6, Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 81
    .line 82
    iget-object v7, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->e:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v7, Lcom/friday/common/entity/FileEntity;

    .line 85
    .line 86
    iget-object v8, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->d:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v8, Lcom/friday/common/entity/FileEntity;

    .line 89
    .line 90
    iget-object v9, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->c:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v9, Ljava/lang/String;

    .line 93
    .line 94
    :try_start_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 95
    .line 96
    .line 97
    move-object v10, p0

    .line 98
    move p1, v0

    .line 99
    move-object v0, v7

    .line 100
    move-object v7, v6

    .line 101
    move-object v6, v5

    .line 102
    move-object v5, v9

    .line 103
    goto/16 :goto_2

    .line 104
    .line 105
    :pswitch_4
    iget v0, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->i:I

    .line 106
    .line 107
    iget-object v5, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->h:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v5, Lcom/friday/common/entity/FileEntity;

    .line 110
    .line 111
    iget-object v6, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->g:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v6, Ljava/lang/String;

    .line 114
    .line 115
    iget-object v7, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->f:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v7, Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 118
    .line 119
    iget-object v8, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->e:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v8, Lcom/friday/common/entity/FileEntity;

    .line 122
    .line 123
    iget-object v9, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->d:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v9, Lcom/friday/common/entity/FileEntity;

    .line 126
    .line 127
    iget-object v10, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->c:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v10, Ljava/lang/String;

    .line 130
    .line 131
    :try_start_3
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 132
    .line 133
    .line 134
    move-object p1, v6

    .line 135
    move-object v6, v7

    .line 136
    move-object v7, v10

    .line 137
    move-object v10, p0

    .line 138
    goto/16 :goto_1

    .line 139
    .line 140
    :pswitch_5
    iget-object v0, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->c:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v0, Ljava/lang/String;

    .line 143
    .line 144
    :try_start_4
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 145
    .line 146
    .line 147
    :cond_0
    move-object v9, v0

    .line 148
    goto :goto_0

    .line 149
    :pswitch_6
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    :try_start_5
    new-instance p1, Ljava/text/SimpleDateFormat;

    .line 153
    .line 154
    const-string v0, "yyyy-MM-dd HH:mm:ss"

    .line 155
    .line 156
    sget-object v5, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 157
    .line 158
    invoke-direct {p1, v0, v5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 159
    .line 160
    .line 161
    new-instance v0, Ljava/util/Date;

    .line 162
    .line 163
    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    iget-object p1, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->k:Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 171
    .line 172
    invoke-static {p1}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->h(Lcom/friday/main/viewmodel/FolderMoveViewModel;)Lcom/friday/common/dao/FileDao;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    iget-object v5, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->l:Ljava/lang/String;

    .line 177
    .line 178
    iput-object v0, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->c:Ljava/lang/Object;

    .line 179
    .line 180
    iput v2, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->j:I

    .line 181
    .line 182
    invoke-interface {p1, v5, p0}, Lcom/friday/common/dao/FileDao;->r(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    if-ne p1, v1, :cond_0

    .line 187
    .line 188
    move-object v10, p0

    .line 189
    goto/16 :goto_8

    .line 190
    .line 191
    :goto_0
    check-cast p1, Lcom/friday/common/entity/FileEntity;

    .line 192
    .line 193
    if-eqz p1, :cond_4

    .line 194
    .line 195
    iget-object v0, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->k:Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 196
    .line 197
    iget-object v6, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->m:Ljava/lang/String;

    .line 198
    .line 199
    iget-object v7, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->l:Ljava/lang/String;

    .line 200
    .line 201
    invoke-static {v0}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->h(Lcom/friday/main/viewmodel/FolderMoveViewModel;)Lcom/friday/common/dao/FileDao;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    invoke-static {v9}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    iput-object v9, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->c:Ljava/lang/Object;

    .line 209
    .line 210
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v8

    .line 214
    iput-object v8, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->d:Ljava/lang/Object;

    .line 215
    .line 216
    iput-object p1, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->e:Ljava/lang/Object;

    .line 217
    .line 218
    iput-object v0, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->f:Ljava/lang/Object;

    .line 219
    .line 220
    iput-object v6, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->g:Ljava/lang/Object;

    .line 221
    .line 222
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v8

    .line 226
    iput-object v8, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->h:Ljava/lang/Object;

    .line 227
    .line 228
    iput v3, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->i:I

    .line 229
    .line 230
    const/4 v8, 0x2

    .line 231
    iput v8, p0, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->j:I
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    .line 232
    .line 233
    const/4 v8, 0x1

    .line 234
    move-object v10, p0

    .line 235
    :try_start_6
    invoke-interface/range {v5 .. v10}, Lcom/friday/common/dao/FileDao;->L(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v5

    .line 239
    if-ne v5, v1, :cond_1

    .line 240
    .line 241
    goto/16 :goto_8

    .line 242
    .line 243
    :cond_1
    move-object v5, p1

    .line 244
    move-object v8, v5

    .line 245
    move-object v7, v9

    .line 246
    move-object v9, v8

    .line 247
    move-object p1, v6

    .line 248
    move-object v6, v0

    .line 249
    move v0, v3

    .line 250
    :goto_1
    invoke-static {v6}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->h(Lcom/friday/main/viewmodel/FolderMoveViewModel;)Lcom/friday/common/dao/FileDao;

    .line 251
    .line 252
    .line 253
    move-result-object v11

    .line 254
    invoke-static {v7}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    invoke-static {v7}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v12

    .line 261
    iput-object v12, v10, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->c:Ljava/lang/Object;

    .line 262
    .line 263
    invoke-static {v9}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v12

    .line 267
    iput-object v12, v10, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->d:Ljava/lang/Object;

    .line 268
    .line 269
    iput-object v8, v10, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->e:Ljava/lang/Object;

    .line 270
    .line 271
    iput-object v6, v10, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->f:Ljava/lang/Object;

    .line 272
    .line 273
    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v12

    .line 277
    iput-object v12, v10, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->g:Ljava/lang/Object;

    .line 278
    .line 279
    iput-object v4, v10, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->h:Ljava/lang/Object;

    .line 280
    .line 281
    iput v0, v10, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->i:I

    .line 282
    .line 283
    const/4 v12, 0x3

    .line 284
    iput v12, v10, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->j:I

    .line 285
    .line 286
    invoke-interface {v11, p1, v7, p0}, Lcom/friday/common/dao/FileDao;->p(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object p1

    .line 290
    if-ne p1, v1, :cond_2

    .line 291
    .line 292
    goto/16 :goto_8

    .line 293
    .line 294
    :cond_2
    move-object p1, v6

    .line 295
    move-object v6, v5

    .line 296
    move-object v5, v7

    .line 297
    move-object v7, p1

    .line 298
    move p1, v0

    .line 299
    move-object v0, v8

    .line 300
    move-object v8, v9

    .line 301
    :goto_2
    invoke-static {v7}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->n(Lcom/friday/main/viewmodel/FolderMoveViewModel;)Lvd/k;

    .line 302
    .line 303
    .line 304
    move-result-object v7

    .line 305
    invoke-static {v2}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 306
    .line 307
    .line 308
    move-result-object v2

    .line 309
    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v9

    .line 313
    iput-object v9, v10, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->c:Ljava/lang/Object;

    .line 314
    .line 315
    invoke-static {v8}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v9

    .line 319
    iput-object v9, v10, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->d:Ljava/lang/Object;

    .line 320
    .line 321
    iput-object v0, v10, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->e:Ljava/lang/Object;

    .line 322
    .line 323
    invoke-static {v6}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v6

    .line 327
    iput-object v6, v10, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->f:Ljava/lang/Object;

    .line 328
    .line 329
    iput-object v4, v10, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->g:Ljava/lang/Object;

    .line 330
    .line 331
    iput p1, v10, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->i:I

    .line 332
    .line 333
    const/4 p1, 0x4

    .line 334
    iput p1, v10, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->j:I

    .line 335
    .line 336
    invoke-interface {v7, v2, p0}, Lvd/k;->emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object p1

    .line 340
    if-ne p1, v1, :cond_3

    .line 341
    .line 342
    goto :goto_8

    .line 343
    :cond_3
    move-object v2, v8

    .line 344
    :goto_3
    if-nez v0, :cond_6

    .line 345
    .line 346
    move-object p1, v2

    .line 347
    move-object v9, v5

    .line 348
    goto :goto_5

    .line 349
    :catch_1
    move-exception v0

    .line 350
    :goto_4
    move-object p1, v0

    .line 351
    goto :goto_7

    .line 352
    :catch_2
    move-exception v0

    .line 353
    move-object v10, p0

    .line 354
    goto :goto_4

    .line 355
    :cond_4
    move-object v10, p0

    .line 356
    :goto_5
    iget-object v0, v10, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->k:Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 357
    .line 358
    invoke-static {v0}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->n(Lcom/friday/main/viewmodel/FolderMoveViewModel;)Lvd/k;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    invoke-static {v3}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 363
    .line 364
    .line 365
    move-result-object v2

    .line 366
    invoke-static {v9}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v5

    .line 370
    iput-object v5, v10, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->c:Ljava/lang/Object;

    .line 371
    .line 372
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object p1

    .line 376
    iput-object p1, v10, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->d:Ljava/lang/Object;

    .line 377
    .line 378
    iput-object v4, v10, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->e:Ljava/lang/Object;

    .line 379
    .line 380
    iput-object v4, v10, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->f:Ljava/lang/Object;

    .line 381
    .line 382
    const/4 p1, 0x5

    .line 383
    iput p1, v10, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->j:I

    .line 384
    .line 385
    invoke-interface {v0, v2, p0}, Lvd/k;->emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object p1

    .line 389
    if-ne p1, v1, :cond_5

    .line 390
    .line 391
    goto :goto_8

    .line 392
    :cond_5
    :goto_6
    sget-object p1, Lqc/q;->a:Lqc/q;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    .line 393
    .line 394
    goto :goto_9

    .line 395
    :goto_7
    iget-object v0, v10, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->k:Lcom/friday/main/viewmodel/FolderMoveViewModel;

    .line 396
    .line 397
    invoke-static {v0}, Lcom/friday/main/viewmodel/FolderMoveViewModel;->n(Lcom/friday/main/viewmodel/FolderMoveViewModel;)Lvd/k;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    invoke-static {v3}, Lxc/a;->a(Z)Ljava/lang/Boolean;

    .line 402
    .line 403
    .line 404
    move-result-object v2

    .line 405
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object p1

    .line 409
    iput-object p1, v10, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->c:Ljava/lang/Object;

    .line 410
    .line 411
    iput-object v4, v10, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->d:Ljava/lang/Object;

    .line 412
    .line 413
    iput-object v4, v10, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->e:Ljava/lang/Object;

    .line 414
    .line 415
    iput-object v4, v10, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->f:Ljava/lang/Object;

    .line 416
    .line 417
    iput-object v4, v10, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->g:Ljava/lang/Object;

    .line 418
    .line 419
    iput-object v4, v10, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->h:Ljava/lang/Object;

    .line 420
    .line 421
    const/4 p1, 0x6

    .line 422
    iput p1, v10, Lcom/friday/main/viewmodel/FolderMoveViewModel$moveFile$1;->j:I

    .line 423
    .line 424
    invoke-interface {v0, v2, p0}, Lvd/k;->emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object p1

    .line 428
    if-ne p1, v1, :cond_6

    .line 429
    .line 430
    :goto_8
    return-object v1

    .line 431
    :cond_6
    :goto_9
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 432
    .line 433
    return-object p1

    .line 434
    nop

    .line 435
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
