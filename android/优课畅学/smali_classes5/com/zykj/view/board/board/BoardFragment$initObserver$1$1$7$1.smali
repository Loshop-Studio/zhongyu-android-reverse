.class final Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$7$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lx7/p;"
    }
.end annotation

.annotation runtime Lo7/d;
    c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$7$1"
    f = "BoardFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/zykj/view/board/board/BoardFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/board/BoardFragment;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$7$1;->c:Lcom/zykj/view/board/board/BoardFragment;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final c(Lcom/zykj/view/board/board/m;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$7$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$7$1;

    .line 6
    .line 7
    sget-object p2, Lh7/p;->a:Lh7/p;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$7$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$7$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$7$1;->c:Lcom/zykj/view/board/board/BoardFragment;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$7$1;-><init>(Lcom/zykj/view/board/board/BoardFragment;Lm7/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$7$1;->b:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/zykj/view/board/board/m;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$7$1;->c(Lcom/zykj/view/board/board/m;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$7$1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/zykj/view/board/board/m;

    .line 4
    .line 5
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$7$1;->a:I

    .line 9
    .line 10
    if-nez v1, :cond_10

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$7$1;->c:Lcom/zykj/view/board/board/BoardFragment;

    .line 16
    .line 17
    invoke-static {p1}, Lcom/zykj/view/board/board/BoardFragment;->e0(Lcom/zykj/view/board/board/BoardFragment;)Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const/4 v1, 0x0

    .line 22
    const-string v2, "mBinding"

    .line 23
    .line 24
    if-nez p1, :cond_0

    .line 25
    .line 26
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    move-object p1, v1

    .line 30
    :cond_0
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->f:Lcom/zykj/view/databinding/ViewIncludePenBinding;

    .line 31
    .line 32
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const-string v3, "getRoot(...)"

    .line 37
    .line 38
    invoke-static {p1, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/zykj/view/board/board/m;->f()Lcom/zykj/view/board/board/r;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-virtual {v4}, Lcom/zykj/view/board/board/r;->d()Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    const/16 v5, 0x8

    .line 50
    .line 51
    const/4 v6, 0x0

    .line 52
    if-eqz v4, :cond_1

    .line 53
    .line 54
    move v4, v6

    .line 55
    goto :goto_0

    .line 56
    :cond_1
    move v4, v5

    .line 57
    :goto_0
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 58
    .line 59
    .line 60
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$7$1;->c:Lcom/zykj/view/board/board/BoardFragment;

    .line 61
    .line 62
    invoke-static {p1}, Lcom/zykj/view/board/board/BoardFragment;->e0(Lcom/zykj/view/board/board/BoardFragment;)Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    if-nez p1, :cond_2

    .line 67
    .line 68
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    move-object p1, v1

    .line 72
    :cond_2
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->c:Lcom/zykj/view/databinding/ViewIncludeEraserBinding;

    .line 73
    .line 74
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-static {p1, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Lcom/zykj/view/board/board/m;->f()Lcom/zykj/view/board/board/r;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    invoke-virtual {v4}, Lcom/zykj/view/board/board/r;->b()Z

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    if-eqz v4, :cond_3

    .line 90
    .line 91
    move v4, v6

    .line 92
    goto :goto_1

    .line 93
    :cond_3
    move v4, v5

    .line 94
    :goto_1
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 95
    .line 96
    .line 97
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$7$1;->c:Lcom/zykj/view/board/board/BoardFragment;

    .line 98
    .line 99
    invoke-static {p1}, Lcom/zykj/view/board/board/BoardFragment;->e0(Lcom/zykj/view/board/board/BoardFragment;)Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    if-nez p1, :cond_4

    .line 104
    .line 105
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    move-object p1, v1

    .line 109
    :cond_4
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->d:Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;

    .line 110
    .line 111
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-static {p1, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0}, Lcom/zykj/view/board/board/m;->f()Lcom/zykj/view/board/board/r;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    invoke-virtual {v4}, Lcom/zykj/view/board/board/r;->c()Z

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    if-eqz v4, :cond_5

    .line 127
    .line 128
    move v4, v6

    .line 129
    goto :goto_2

    .line 130
    :cond_5
    move v4, v5

    .line 131
    :goto_2
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 132
    .line 133
    .line 134
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$7$1;->c:Lcom/zykj/view/board/board/BoardFragment;

    .line 135
    .line 136
    invoke-static {p1}, Lcom/zykj/view/board/board/BoardFragment;->e0(Lcom/zykj/view/board/board/BoardFragment;)Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    if-nez p1, :cond_6

    .line 141
    .line 142
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    move-object p1, v1

    .line 146
    :cond_6
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->a:Lcom/zykj/view/databinding/ViewIncludeBackgroundColorBinding;

    .line 147
    .line 148
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-static {p1, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0}, Lcom/zykj/view/board/board/m;->f()Lcom/zykj/view/board/board/r;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    invoke-virtual {v4}, Lcom/zykj/view/board/board/r;->a()Z

    .line 160
    .line 161
    .line 162
    move-result v4

    .line 163
    if-eqz v4, :cond_7

    .line 164
    .line 165
    move v4, v6

    .line 166
    goto :goto_3

    .line 167
    :cond_7
    move v4, v5

    .line 168
    :goto_3
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 169
    .line 170
    .line 171
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$7$1;->c:Lcom/zykj/view/board/board/BoardFragment;

    .line 172
    .line 173
    invoke-static {p1}, Lcom/zykj/view/board/board/BoardFragment;->e0(Lcom/zykj/view/board/board/BoardFragment;)Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    if-nez p1, :cond_8

    .line 178
    .line 179
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    move-object p1, v1

    .line 183
    :cond_8
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->b:Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;

    .line 184
    .line 185
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    invoke-static {p1, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0}, Lcom/zykj/view/board/board/m;->c()Lcom/zykj/view/board/board/g;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    invoke-virtual {v4}, Lcom/zykj/view/board/board/g;->a()Z

    .line 197
    .line 198
    .line 199
    move-result v4

    .line 200
    if-eqz v4, :cond_9

    .line 201
    .line 202
    move v4, v6

    .line 203
    goto :goto_4

    .line 204
    :cond_9
    move v4, v5

    .line 205
    :goto_4
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 206
    .line 207
    .line 208
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$7$1;->c:Lcom/zykj/view/board/board/BoardFragment;

    .line 209
    .line 210
    invoke-static {p1}, Lcom/zykj/view/board/board/BoardFragment;->e0(Lcom/zykj/view/board/board/BoardFragment;)Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    if-nez p1, :cond_a

    .line 215
    .line 216
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    move-object p1, v1

    .line 220
    :cond_a
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->g:Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;

    .line 221
    .line 222
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 223
    .line 224
    .line 225
    move-result-object p1

    .line 226
    invoke-static {p1, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v0}, Lcom/zykj/view/board/board/m;->c()Lcom/zykj/view/board/board/g;

    .line 230
    .line 231
    .line 232
    move-result-object v3

    .line 233
    invoke-virtual {v3}, Lcom/zykj/view/board/board/g;->b()Z

    .line 234
    .line 235
    .line 236
    move-result v3

    .line 237
    if-eqz v3, :cond_b

    .line 238
    .line 239
    move v3, v6

    .line 240
    goto :goto_5

    .line 241
    :cond_b
    move v3, v5

    .line 242
    :goto_5
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 243
    .line 244
    .line 245
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$7$1;->c:Lcom/zykj/view/board/board/BoardFragment;

    .line 246
    .line 247
    invoke-static {p1}, Lcom/zykj/view/board/board/BoardFragment;->e0(Lcom/zykj/view/board/board/BoardFragment;)Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    if-nez p1, :cond_c

    .line 252
    .line 253
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    move-object p1, v1

    .line 257
    :cond_c
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->g:Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;

    .line 258
    .line 259
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;->d:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 260
    .line 261
    const-string v3, "llDeleteDraft"

    .line 262
    .line 263
    invoke-static {p1, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v0}, Lcom/zykj/view/board/board/m;->i()Z

    .line 267
    .line 268
    .line 269
    move-result v3

    .line 270
    if-eqz v3, :cond_d

    .line 271
    .line 272
    move v5, v6

    .line 273
    :cond_d
    invoke-virtual {p1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 274
    .line 275
    .line 276
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$7$1;->c:Lcom/zykj/view/board/board/BoardFragment;

    .line 277
    .line 278
    invoke-static {p1}, Lcom/zykj/view/board/board/BoardFragment;->e0(Lcom/zykj/view/board/board/BoardFragment;)Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    if-nez p1, :cond_e

    .line 283
    .line 284
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    move-object p1, v1

    .line 288
    :cond_e
    iget-object p1, p1, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->l:Lcom/zykj/view/widget/SketchProgressView;

    .line 289
    .line 290
    invoke-virtual {v0}, Lcom/zykj/view/board/board/m;->k()Z

    .line 291
    .line 292
    .line 293
    move-result v3

    .line 294
    invoke-virtual {p1, v3}, Lcom/zykj/view/widget/SketchProgressView;->setTouchable(Z)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v0}, Lcom/zykj/view/board/board/m;->g()F

    .line 298
    .line 299
    .line 300
    move-result v3

    .line 301
    invoke-virtual {p1, v3}, Lcom/zykj/view/widget/SketchProgressView;->setProgress(F)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v0}, Lcom/zykj/view/board/board/m;->h()F

    .line 305
    .line 306
    .line 307
    move-result v3

    .line 308
    invoke-virtual {p1, v3}, Lcom/zykj/view/widget/SketchProgressView;->setThumbTime(F)V

    .line 309
    .line 310
    .line 311
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardFragment$initObserver$1$1$7$1;->c:Lcom/zykj/view/board/board/BoardFragment;

    .line 312
    .line 313
    invoke-static {p1}, Lcom/zykj/view/board/board/BoardFragment;->e0(Lcom/zykj/view/board/board/BoardFragment;)Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 314
    .line 315
    .line 316
    move-result-object p1

    .line 317
    if-nez p1, :cond_f

    .line 318
    .line 319
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    goto :goto_6

    .line 323
    :cond_f
    move-object v1, p1

    .line 324
    :goto_6
    iget-object p1, v1, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->k:Lcom/zykj/view/widget/SketchProgressView;

    .line 325
    .line 326
    invoke-virtual {v0}, Lcom/zykj/view/board/board/m;->j()Z

    .line 327
    .line 328
    .line 329
    move-result v1

    .line 330
    invoke-virtual {p1, v1}, Lcom/zykj/view/widget/SketchProgressView;->setTouchable(Z)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v0}, Lcom/zykj/view/board/board/m;->d()F

    .line 334
    .line 335
    .line 336
    move-result v1

    .line 337
    invoke-virtual {p1, v1}, Lcom/zykj/view/widget/SketchProgressView;->setProgress(F)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v0}, Lcom/zykj/view/board/board/m;->e()F

    .line 341
    .line 342
    .line 343
    move-result v0

    .line 344
    invoke-virtual {p1, v0}, Lcom/zykj/view/widget/SketchProgressView;->setThumbTime(F)V

    .line 345
    .line 346
    .line 347
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 348
    .line 349
    return-object p1

    .line 350
    :cond_10
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 351
    .line 352
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 353
    .line 354
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    throw p1
.end method
