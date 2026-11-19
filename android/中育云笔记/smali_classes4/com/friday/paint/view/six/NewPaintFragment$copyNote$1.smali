.class final Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/paint/view/six/NewPaintFragment;->copyNote(I)V
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
    c = "com.friday.paint.view.six.NewPaintFragment$copyNote$1"
    f = "NewPaintFragment.kt"
    l = {
        0x2e2,
        0x386,
        0x38b
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

.field public l:Ljava/lang/Object;

.field public m:Ljava/lang/Object;

.field public n:Ljava/lang/Object;

.field public o:I

.field public p:I

.field public q:I

.field public r:I

.field public s:I

.field public t:I

.field public final synthetic u:Lcom/friday/paint/view/six/NewPaintFragment;

.field public final synthetic v:I


# direct methods
.method public constructor <init>(Lcom/friday/paint/view/six/NewPaintFragment;ILvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->u:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 2
    .line 3
    iput p2, p0, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->v:I

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

.method public static synthetic g(Lcom/friday/paint/view/six/NewPaintFragment;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->m(Lcom/friday/paint/view/six/NewPaintFragment;I)V

    return-void
.end method

.method public static final m(Lcom/friday/paint/view/six/NewPaintFragment;I)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/paint/view/six/NewPaintFragment;->access$getViewModel(Lcom/friday/paint/view/six/NewPaintFragment;)Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->b0(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 2

    .line 1
    new-instance p1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->u:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 4
    .line 5
    iget v1, p0, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->v:I

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;ILvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-string v0, "listFilesInDir(...)"

    .line 4
    .line 5
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    iget v3, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->t:I

    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x2

    .line 13
    const/4 v6, 0x1

    .line 14
    if-eqz v3, :cond_4

    .line 15
    .line 16
    if-eq v3, v6, :cond_2

    .line 17
    .line 18
    if-eq v3, v5, :cond_1

    .line 19
    .line 20
    if-ne v3, v4, :cond_0

    .line 21
    .line 22
    iget v0, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->r:I

    .line 23
    .line 24
    iget v3, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->q:I

    .line 25
    .line 26
    iget v9, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->p:I

    .line 27
    .line 28
    iget v10, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->o:I

    .line 29
    .line 30
    iget-object v11, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->n:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v11, [F

    .line 33
    .line 34
    iget-object v11, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->m:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v11, Ljava/io/File;

    .line 37
    .line 38
    iget-object v11, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->k:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v11, Ljava/util/Iterator;

    .line 41
    .line 42
    iget-object v12, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->j:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v12, Ljava/lang/Iterable;

    .line 45
    .line 46
    iget-object v13, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->i:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v13, Ljava/io/File;

    .line 49
    .line 50
    iget-object v14, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->h:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v14, Ljava/io/File;

    .line 53
    .line 54
    iget-object v15, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->g:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v15, Lcom/friday/paint/view/six/NewPaintFragment;

    .line 57
    .line 58
    iget-object v4, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->f:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v4, Ljava/lang/String;

    .line 61
    .line 62
    iget-object v5, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->e:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v5, Ljava/lang/String;

    .line 65
    .line 66
    iget-object v7, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->d:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v7, Ljava/lang/String;

    .line 69
    .line 70
    iget-object v6, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->c:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v6, Lcom/friday/paint/model/NoteListEntity;

    .line 73
    .line 74
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    .line 76
    .line 77
    move-object v8, v12

    .line 78
    move-object v12, v4

    .line 79
    move-object v4, v5

    .line 80
    move-object v5, v7

    .line 81
    move-object v7, v8

    .line 82
    move-object v8, v14

    .line 83
    const/16 v17, 0x1

    .line 84
    .line 85
    move v14, v0

    .line 86
    move-object v0, v11

    .line 87
    move v11, v9

    .line 88
    move-object v9, v13

    .line 89
    move v13, v3

    .line 90
    const/4 v3, 0x3

    .line 91
    goto/16 :goto_6

    .line 92
    .line 93
    :catchall_0
    move-exception v0

    .line 94
    goto/16 :goto_8

    .line 95
    .line 96
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 97
    .line 98
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 99
    .line 100
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw v0

    .line 104
    :cond_1
    iget v0, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->s:I

    .line 105
    .line 106
    iget v3, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->r:I

    .line 107
    .line 108
    iget v4, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->q:I

    .line 109
    .line 110
    iget v5, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->p:I

    .line 111
    .line 112
    iget v6, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->o:I

    .line 113
    .line 114
    iget-object v7, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->m:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v7, Ljava/io/File;

    .line 117
    .line 118
    iget-object v9, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->l:Ljava/lang/Object;

    .line 119
    .line 120
    iget-object v10, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->k:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v10, Ljava/util/Iterator;

    .line 123
    .line 124
    iget-object v11, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->j:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v11, Ljava/lang/Iterable;

    .line 127
    .line 128
    iget-object v12, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->i:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v12, Ljava/io/File;

    .line 131
    .line 132
    iget-object v13, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->h:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v13, Ljava/io/File;

    .line 135
    .line 136
    iget-object v14, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->g:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v14, Lcom/friday/paint/view/six/NewPaintFragment;

    .line 139
    .line 140
    iget-object v15, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->f:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v15, Ljava/lang/String;

    .line 143
    .line 144
    iget-object v8, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->e:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v8, Ljava/lang/String;

    .line 147
    .line 148
    move/from16 v18, v0

    .line 149
    .line 150
    iget-object v0, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->d:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v0, Ljava/lang/String;

    .line 153
    .line 154
    move-object/from16 v19, v0

    .line 155
    .line 156
    iget-object v0, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->c:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v0, Lcom/friday/paint/model/NoteListEntity;

    .line 159
    .line 160
    :try_start_1
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 161
    .line 162
    .line 163
    move-object/from16 v20, v11

    .line 164
    .line 165
    move-object/from16 v16, v13

    .line 166
    .line 167
    move v11, v5

    .line 168
    move-object v13, v10

    .line 169
    move-object/from16 v5, p1

    .line 170
    .line 171
    move-object v10, v9

    .line 172
    move-object/from16 p1, v14

    .line 173
    .line 174
    move-object v9, v7

    .line 175
    move-object v14, v12

    .line 176
    const/4 v7, 0x2

    .line 177
    move v12, v6

    .line 178
    move-object v6, v0

    .line 179
    move v0, v3

    .line 180
    move/from16 v3, v18

    .line 181
    .line 182
    move-object/from16 v18, v19

    .line 183
    .line 184
    goto/16 :goto_4

    .line 185
    .line 186
    :cond_2
    iget-object v3, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->f:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v3, Ljava/lang/String;

    .line 189
    .line 190
    iget-object v4, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->e:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v4, Ljava/lang/String;

    .line 193
    .line 194
    iget-object v5, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->d:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast v5, Ljava/lang/String;

    .line 197
    .line 198
    iget-object v6, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->c:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v6, Lcom/friday/paint/model/NoteListEntity;

    .line 201
    .line 202
    :try_start_2
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 203
    .line 204
    .line 205
    :cond_3
    move-object v12, v3

    .line 206
    goto/16 :goto_0

    .line 207
    .line 208
    :catch_0
    move-exception v0

    .line 209
    goto/16 :goto_b

    .line 210
    .line 211
    :cond_4
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    iget-object v3, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->u:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 215
    .line 216
    invoke-virtual {v3}, Lcom/friday/paint/view/six/NewPaintFragment;->getRightNoteListAdapter()Lcom/friday/paint/view/six/NewThumbnailListAdapter;

    .line 217
    .line 218
    .line 219
    move-result-object v3

    .line 220
    invoke-virtual {v3}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItemCount()I

    .line 221
    .line 222
    .line 223
    move-result v3

    .line 224
    const/16 v4, 0x63

    .line 225
    .line 226
    if-lt v3, v4, :cond_5

    .line 227
    .line 228
    const-string v0, "\u5df2\u8fbe\u9875\u6570\u4e0a\u9650\uff0c\u65e0\u6cd5\u65b0\u589e\u7b14\u8bb0\u9875"

    .line 229
    .line 230
    const/4 v2, 0x0

    .line 231
    new-array v2, v2, [Ljava/lang/Object;

    .line 232
    .line 233
    invoke-static {v0, v2}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 237
    .line 238
    return-object v0

    .line 239
    :cond_5
    iget-object v3, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->u:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 240
    .line 241
    const/4 v4, 0x1

    .line 242
    invoke-virtual {v3, v4}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 243
    .line 244
    .line 245
    iget-object v3, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->u:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 246
    .line 247
    invoke-virtual {v3}, Lcom/friday/paint/view/six/NewPaintFragment;->getRightNoteListAdapter()Lcom/friday/paint/view/six/NewThumbnailListAdapter;

    .line 248
    .line 249
    .line 250
    move-result-object v3

    .line 251
    invoke-virtual {v3}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 252
    .line 253
    .line 254
    move-result-object v3

    .line 255
    iget v5, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->v:I

    .line 256
    .line 257
    sub-int/2addr v5, v4

    .line 258
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v3

    .line 262
    move-object v6, v3

    .line 263
    check-cast v6, Lcom/friday/paint/model/NoteListEntity;

    .line 264
    .line 265
    invoke-virtual {v6}, Lcom/friday/paint/model/NoteListEntity;->getNoteDir()Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v5

    .line 269
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 270
    .line 271
    .line 272
    move-result-wide v3

    .line 273
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v4

    .line 277
    iget-object v3, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->u:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 278
    .line 279
    invoke-static {v3}, Lcom/friday/paint/view/six/NewPaintFragment;->access$getViewModel(Lcom/friday/paint/view/six/NewPaintFragment;)Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 280
    .line 281
    .line 282
    move-result-object v3

    .line 283
    invoke-virtual {v3}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->E()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    new-instance v7, Ljava/lang/StringBuilder;

    .line 288
    .line 289
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 296
    .line 297
    .line 298
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v3

    .line 302
    :try_start_3
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 303
    .line 304
    .line 305
    move-result-object v7

    .line 306
    new-instance v8, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;

    .line 307
    .line 308
    iget-object v9, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->u:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 309
    .line 310
    const/4 v10, 0x0

    .line 311
    invoke-direct {v8, v3, v5, v9, v10}, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$1;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/friday/paint/view/six/NewPaintFragment;Lvc/c;)V

    .line 312
    .line 313
    .line 314
    invoke-static {v6}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v9

    .line 318
    iput-object v9, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->c:Ljava/lang/Object;

    .line 319
    .line 320
    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v9

    .line 324
    iput-object v9, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->d:Ljava/lang/Object;

    .line 325
    .line 326
    invoke-static {v4}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v9

    .line 330
    iput-object v9, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->e:Ljava/lang/Object;

    .line 331
    .line 332
    iput-object v3, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->f:Ljava/lang/Object;

    .line 333
    .line 334
    const/4 v9, 0x1

    .line 335
    iput v9, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->t:I

    .line 336
    .line 337
    invoke-static {v7, v8, v1}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v7
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 341
    if-ne v7, v2, :cond_3

    .line 342
    .line 343
    goto/16 :goto_5

    .line 344
    .line 345
    :goto_0
    iget-object v3, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->u:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 346
    .line 347
    invoke-virtual {v3}, Lcom/friday/paint/view/six/NewPaintFragment;->getRightNoteListAdapter()Lcom/friday/paint/view/six/NewThumbnailListAdapter;

    .line 348
    .line 349
    .line 350
    move-result-object v3

    .line 351
    iget v7, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->v:I

    .line 352
    .line 353
    new-instance v8, Lcom/friday/paint/model/NoteListEntity;

    .line 354
    .line 355
    iget-object v9, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->u:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 356
    .line 357
    invoke-static {v9}, Lcom/friday/paint/view/six/NewPaintFragment;->access$getViewModel(Lcom/friday/paint/view/six/NewPaintFragment;)Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 358
    .line 359
    .line 360
    move-result-object v9

    .line 361
    invoke-virtual {v9, v12}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->J(Ljava/lang/String;)Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v9

    .line 365
    const/4 v13, 0x6

    .line 366
    const/4 v14, 0x0

    .line 367
    const/4 v10, 0x0

    .line 368
    const/4 v11, 0x0

    .line 369
    invoke-direct/range {v8 .. v14}, Lcom/friday/paint/model/NoteListEntity;-><init>(Ljava/lang/String;ZZLjava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v3, v7, v8}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->addData(ILjava/lang/Object;)V

    .line 373
    .line 374
    .line 375
    iget-object v3, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->u:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 376
    .line 377
    :try_start_4
    sget-object v7, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 378
    .line 379
    invoke-static {v12}, Lcom/blankj/utilcode/util/FileUtils;->listFilesInDir(Ljava/lang/String;)Ljava/util/List;

    .line 380
    .line 381
    .line 382
    move-result-object v7

    .line 383
    invoke-static {v7, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    check-cast v7, Ljava/lang/Iterable;

    .line 387
    .line 388
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 389
    .line 390
    .line 391
    move-result-object v7

    .line 392
    :cond_6
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 393
    .line 394
    .line 395
    move-result v8

    .line 396
    if-eqz v8, :cond_7

    .line 397
    .line 398
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 399
    .line 400
    .line 401
    move-result-object v8

    .line 402
    move-object v9, v8

    .line 403
    check-cast v9, Ljava/io/File;

    .line 404
    .line 405
    invoke-virtual {v9}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v9

    .line 409
    const-string v10, "res"

    .line 410
    .line 411
    invoke-static {v9, v10}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 412
    .line 413
    .line 414
    move-result v9

    .line 415
    if-eqz v9, :cond_6

    .line 416
    .line 417
    goto :goto_1

    .line 418
    :cond_7
    const/4 v8, 0x0

    .line 419
    :goto_1
    check-cast v8, Ljava/io/File;

    .line 420
    .line 421
    if-eqz v8, :cond_d

    .line 422
    .line 423
    invoke-static {v8}, Lcom/blankj/utilcode/util/FileUtils;->listFilesInDir(Ljava/io/File;)Ljava/util/List;

    .line 424
    .line 425
    .line 426
    move-result-object v7

    .line 427
    if-eqz v7, :cond_d

    .line 428
    .line 429
    check-cast v7, Ljava/lang/Iterable;

    .line 430
    .line 431
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 432
    .line 433
    .line 434
    move-result-object v7

    .line 435
    :cond_8
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 436
    .line 437
    .line 438
    move-result v9

    .line 439
    if-eqz v9, :cond_9

    .line 440
    .line 441
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object v9

    .line 445
    move-object v10, v9

    .line 446
    check-cast v10, Ljava/io/File;

    .line 447
    .line 448
    invoke-virtual {v10}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object v10

    .line 452
    const-string v11, "image"

    .line 453
    .line 454
    invoke-static {v10, v11}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 455
    .line 456
    .line 457
    move-result v10

    .line 458
    if-eqz v10, :cond_8

    .line 459
    .line 460
    goto :goto_2

    .line 461
    :cond_9
    const/4 v9, 0x0

    .line 462
    :goto_2
    check-cast v9, Ljava/io/File;

    .line 463
    .line 464
    if-eqz v9, :cond_d

    .line 465
    .line 466
    invoke-static {v9}, Lcom/blankj/utilcode/util/FileUtils;->listFilesInDir(Ljava/io/File;)Ljava/util/List;

    .line 467
    .line 468
    .line 469
    move-result-object v7

    .line 470
    invoke-static {v7, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 471
    .line 472
    .line 473
    check-cast v7, Ljava/lang/Iterable;

    .line 474
    .line 475
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 476
    .line 477
    .line 478
    move-result-object v0

    .line 479
    const/4 v10, 0x0

    .line 480
    const/4 v11, 0x0

    .line 481
    const/4 v13, 0x0

    .line 482
    const/4 v14, 0x0

    .line 483
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 484
    .line 485
    .line 486
    move-result v15

    .line 487
    if-eqz v15, :cond_c

    .line 488
    .line 489
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    move-result-object v15

    .line 493
    move-object/from16 p1, v4

    .line 494
    .line 495
    move-object v4, v15

    .line 496
    check-cast v4, Ljava/io/File;

    .line 497
    .line 498
    move-object/from16 v18, v5

    .line 499
    .line 500
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 501
    .line 502
    .line 503
    move-result-object v5

    .line 504
    move-object/from16 v19, v6

    .line 505
    .line 506
    new-instance v6, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$2$2$2$1$result$1;

    .line 507
    .line 508
    move-object/from16 v20, v7

    .line 509
    .line 510
    const/4 v7, 0x0

    .line 511
    invoke-direct {v6, v4, v7}, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1$2$2$2$1$result$1;-><init>(Ljava/io/File;Lvc/c;)V

    .line 512
    .line 513
    .line 514
    invoke-static/range {v19 .. v19}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 515
    .line 516
    .line 517
    move-result-object v7

    .line 518
    iput-object v7, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->c:Ljava/lang/Object;

    .line 519
    .line 520
    invoke-static/range {v18 .. v18}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 521
    .line 522
    .line 523
    move-result-object v7

    .line 524
    iput-object v7, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->d:Ljava/lang/Object;

    .line 525
    .line 526
    invoke-static/range {p1 .. p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    move-result-object v7

    .line 530
    iput-object v7, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->e:Ljava/lang/Object;

    .line 531
    .line 532
    invoke-static {v12}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    move-result-object v7

    .line 536
    iput-object v7, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->f:Ljava/lang/Object;

    .line 537
    .line 538
    iput-object v3, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->g:Ljava/lang/Object;

    .line 539
    .line 540
    invoke-static {v8}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v7

    .line 544
    iput-object v7, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->h:Ljava/lang/Object;

    .line 545
    .line 546
    invoke-static {v9}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    move-result-object v7

    .line 550
    iput-object v7, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->i:Ljava/lang/Object;

    .line 551
    .line 552
    invoke-static/range {v20 .. v20}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    move-result-object v7

    .line 556
    iput-object v7, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->j:Ljava/lang/Object;

    .line 557
    .line 558
    iput-object v0, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->k:Ljava/lang/Object;

    .line 559
    .line 560
    invoke-static {v15}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 561
    .line 562
    .line 563
    move-result-object v7

    .line 564
    iput-object v7, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->l:Ljava/lang/Object;

    .line 565
    .line 566
    iput-object v4, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->m:Ljava/lang/Object;

    .line 567
    .line 568
    const/4 v7, 0x0

    .line 569
    iput-object v7, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->n:Ljava/lang/Object;

    .line 570
    .line 571
    iput v10, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->o:I

    .line 572
    .line 573
    iput v11, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->p:I

    .line 574
    .line 575
    iput v13, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->q:I

    .line 576
    .line 577
    iput v14, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->r:I

    .line 578
    .line 579
    const/4 v7, 0x0

    .line 580
    iput v7, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->s:I

    .line 581
    .line 582
    const/4 v7, 0x2

    .line 583
    iput v7, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->t:I

    .line 584
    .line 585
    invoke-static {v5, v6, v1}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    move-result-object v5

    .line 589
    if-ne v5, v2, :cond_a

    .line 590
    .line 591
    goto/16 :goto_5

    .line 592
    .line 593
    :cond_a
    move v6, v13

    .line 594
    move-object v13, v0

    .line 595
    move v0, v14

    .line 596
    move-object v14, v9

    .line 597
    move-object v9, v4

    .line 598
    move v4, v6

    .line 599
    move-object v6, v12

    .line 600
    move v12, v10

    .line 601
    move-object v10, v15

    .line 602
    move-object v15, v6

    .line 603
    move-object/from16 v16, v8

    .line 604
    .line 605
    move-object/from16 v6, v19

    .line 606
    .line 607
    move-object/from16 v8, p1

    .line 608
    .line 609
    move-object/from16 p1, v3

    .line 610
    .line 611
    const/4 v3, 0x0

    .line 612
    :goto_4
    check-cast v5, [F

    .line 613
    .line 614
    invoke-static/range {p1 .. p1}, Lcom/friday/paint/view/six/NewPaintFragment;->access$getViewModel(Lcom/friday/paint/view/six/NewPaintFragment;)Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 615
    .line 616
    .line 617
    move-result-object v7

    .line 618
    move-object/from16 v21, v5

    .line 619
    .line 620
    new-instance v5, Lcom/friday/common/entity/ImageSafetyEntity;

    .line 621
    .line 622
    move-object/from16 v22, v6

    .line 623
    .line 624
    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 625
    .line 626
    .line 627
    move-result-object v6

    .line 628
    move-object/from16 v23, v8

    .line 629
    .line 630
    const-string v8, "getAbsolutePath(...)"

    .line 631
    .line 632
    invoke-static {v6, v8}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 633
    .line 634
    .line 635
    const/16 v17, 0x1

    .line 636
    .line 637
    aget v8, v21, v17

    .line 638
    .line 639
    move/from16 v24, v8

    .line 640
    .line 641
    const/16 v8, 0x64

    .line 642
    .line 643
    int-to-float v8, v8

    .line 644
    mul-float v8, v8, v24

    .line 645
    .line 646
    float-to-int v8, v8

    .line 647
    invoke-direct {v5, v6, v8}, Lcom/friday/common/entity/ImageSafetyEntity;-><init>(Ljava/lang/String;I)V

    .line 648
    .line 649
    .line 650
    invoke-static/range {v22 .. v22}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 651
    .line 652
    .line 653
    move-result-object v6

    .line 654
    iput-object v6, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->c:Ljava/lang/Object;

    .line 655
    .line 656
    invoke-static/range {v18 .. v18}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    move-result-object v6

    .line 660
    iput-object v6, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->d:Ljava/lang/Object;

    .line 661
    .line 662
    invoke-static/range {v23 .. v23}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 663
    .line 664
    .line 665
    move-result-object v6

    .line 666
    iput-object v6, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->e:Ljava/lang/Object;

    .line 667
    .line 668
    invoke-static {v15}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 669
    .line 670
    .line 671
    move-result-object v6

    .line 672
    iput-object v6, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->f:Ljava/lang/Object;

    .line 673
    .line 674
    move-object/from16 v6, p1

    .line 675
    .line 676
    iput-object v6, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->g:Ljava/lang/Object;

    .line 677
    .line 678
    invoke-static/range {v16 .. v16}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 679
    .line 680
    .line 681
    move-result-object v8

    .line 682
    iput-object v8, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->h:Ljava/lang/Object;

    .line 683
    .line 684
    invoke-static {v14}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 685
    .line 686
    .line 687
    move-result-object v8

    .line 688
    iput-object v8, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->i:Ljava/lang/Object;

    .line 689
    .line 690
    invoke-static/range {v20 .. v20}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 691
    .line 692
    .line 693
    move-result-object v8

    .line 694
    iput-object v8, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->j:Ljava/lang/Object;

    .line 695
    .line 696
    iput-object v13, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->k:Ljava/lang/Object;

    .line 697
    .line 698
    invoke-static {v10}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 699
    .line 700
    .line 701
    move-result-object v8

    .line 702
    iput-object v8, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->l:Ljava/lang/Object;

    .line 703
    .line 704
    invoke-static {v9}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 705
    .line 706
    .line 707
    move-result-object v8

    .line 708
    iput-object v8, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->m:Ljava/lang/Object;

    .line 709
    .line 710
    invoke-static/range {v21 .. v21}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 711
    .line 712
    .line 713
    move-result-object v8

    .line 714
    iput-object v8, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->n:Ljava/lang/Object;

    .line 715
    .line 716
    iput v12, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->o:I

    .line 717
    .line 718
    iput v11, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->p:I

    .line 719
    .line 720
    iput v4, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->q:I

    .line 721
    .line 722
    iput v0, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->r:I

    .line 723
    .line 724
    iput v3, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->s:I

    .line 725
    .line 726
    const/4 v3, 0x3

    .line 727
    iput v3, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->t:I

    .line 728
    .line 729
    invoke-virtual {v7, v5, v1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->S(Lcom/friday/common/entity/ImageSafetyEntity;Lvc/c;)Ljava/lang/Object;

    .line 730
    .line 731
    .line 732
    move-result-object v5

    .line 733
    if-ne v5, v2, :cond_b

    .line 734
    .line 735
    :goto_5
    return-object v2

    .line 736
    :cond_b
    move v10, v12

    .line 737
    move-object v9, v14

    .line 738
    move-object v12, v15

    .line 739
    move-object/from16 v8, v16

    .line 740
    .line 741
    move-object/from16 v5, v18

    .line 742
    .line 743
    move-object/from16 v7, v20

    .line 744
    .line 745
    move v14, v0

    .line 746
    move-object v15, v6

    .line 747
    move-object v0, v13

    .line 748
    move-object/from16 v6, v22

    .line 749
    .line 750
    move v13, v4

    .line 751
    move-object/from16 v4, v23

    .line 752
    .line 753
    :goto_6
    move-object v3, v15

    .line 754
    goto/16 :goto_3

    .line 755
    .line 756
    :cond_c
    sget-object v7, Lqc/q;->a:Lqc/q;

    .line 757
    .line 758
    goto :goto_7

    .line 759
    :cond_d
    const/4 v7, 0x0

    .line 760
    :goto_7
    invoke-static {v7}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 761
    .line 762
    .line 763
    goto :goto_9

    .line 764
    :goto_8
    sget-object v2, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 765
    .line 766
    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 767
    .line 768
    .line 769
    move-result-object v0

    .line 770
    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 771
    .line 772
    .line 773
    :goto_9
    iget v0, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->v:I

    .line 774
    .line 775
    iget-object v2, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->u:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 776
    .line 777
    invoke-virtual {v2}, Lcom/friday/paint/view/six/NewPaintFragment;->getRightNoteListAdapter()Lcom/friday/paint/view/six/NewThumbnailListAdapter;

    .line 778
    .line 779
    .line 780
    move-result-object v2

    .line 781
    invoke-virtual {v2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 782
    .line 783
    .line 784
    move-result-object v2

    .line 785
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 786
    .line 787
    .line 788
    move-result v2

    .line 789
    :goto_a
    if-ge v0, v2, :cond_e

    .line 790
    .line 791
    iget-object v3, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->u:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 792
    .line 793
    invoke-virtual {v3}, Lcom/friday/paint/view/six/NewPaintFragment;->getRightNoteListAdapter()Lcom/friday/paint/view/six/NewThumbnailListAdapter;

    .line 794
    .line 795
    .line 796
    move-result-object v3

    .line 797
    invoke-virtual {v3, v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 798
    .line 799
    .line 800
    add-int/lit8 v0, v0, 0x1

    .line 801
    .line 802
    goto :goto_a

    .line 803
    :cond_e
    iget-object v0, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->u:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 804
    .line 805
    invoke-static {v0}, Lcom/friday/paint/view/six/NewPaintFragment;->access$getMBinding(Lcom/friday/paint/view/six/NewPaintFragment;)Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;

    .line 806
    .line 807
    .line 808
    move-result-object v0

    .line 809
    iget-object v0, v0, Lcom/friday/paint/databinding/ResFragmentNewPaintBinding;->s:Landroidx/recyclerview/widget/RecyclerView;

    .line 810
    .line 811
    iget-object v2, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->u:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 812
    .line 813
    iget v3, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->v:I

    .line 814
    .line 815
    new-instance v4, Lcom/friday/paint/view/six/a;

    .line 816
    .line 817
    invoke-direct {v4, v2, v3}, Lcom/friday/paint/view/six/a;-><init>(Lcom/friday/paint/view/six/NewPaintFragment;I)V

    .line 818
    .line 819
    .line 820
    invoke-virtual {v0, v4}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 821
    .line 822
    .line 823
    iget-object v0, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->u:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 824
    .line 825
    const/4 v2, 0x0

    .line 826
    invoke-virtual {v0, v2}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 827
    .line 828
    .line 829
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 830
    .line 831
    return-object v0

    .line 832
    :goto_b
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 833
    .line 834
    .line 835
    iget-object v0, v1, Lcom/friday/paint/view/six/NewPaintFragment$copyNote$1;->u:Lcom/friday/paint/view/six/NewPaintFragment;

    .line 836
    .line 837
    const/4 v2, 0x0

    .line 838
    invoke-virtual {v0, v2}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 839
    .line 840
    .line 841
    invoke-static {v3}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/lang/String;)Z

    .line 842
    .line 843
    .line 844
    const-string v0, "\u590d\u5236\u5931\u8d25"

    .line 845
    .line 846
    new-array v2, v2, [Ljava/lang/Object;

    .line 847
    .line 848
    invoke-static {v0, v2}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 849
    .line 850
    .line 851
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 852
    .line 853
    return-object v0
.end method
