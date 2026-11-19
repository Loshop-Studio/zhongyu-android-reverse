.class final Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$5$onItemDragEnd$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$5;->a(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
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
    c = "com.zykj.study.ui.home.my.MyCourseDetailsFragment$initView$5$onItemDragEnd$1"
    f = "MyCourseDetailsFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public final synthetic b:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

.field public final synthetic c:Lcom/zykj/study/bean/course/CatalogBean;

.field public final synthetic d:Lcom/zykj/study/bean/course/CatalogBean;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lcom/zykj/study/bean/course/CatalogBean;Lcom/zykj/study/bean/course/CatalogBean;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$5$onItemDragEnd$1;->b:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$5$onItemDragEnd$1;->c:Lcom/zykj/study/bean/course/CatalogBean;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$5$onItemDragEnd$1;->d:Lcom/zykj/study/bean/course/CatalogBean;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 3

    .line 1
    new-instance p1, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$5$onItemDragEnd$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$5$onItemDragEnd$1;->b:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$5$onItemDragEnd$1;->c:Lcom/zykj/study/bean/course/CatalogBean;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$5$onItemDragEnd$1;->d:Lcom/zykj/study/bean/course/CatalogBean;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$5$onItemDragEnd$1;-><init>(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lcom/zykj/study/bean/course/CatalogBean;Lcom/zykj/study/bean/course/CatalogBean;Lm7/c;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$5$onItemDragEnd$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$5$onItemDragEnd$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$5$onItemDragEnd$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$5$onItemDragEnd$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget v1, v0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$5$onItemDragEnd$1;->a:I

    .line 7
    .line 8
    if-nez v1, :cond_c

    .line 9
    .line 10
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, v0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$5$onItemDragEnd$1;->b:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    .line 14
    .line 15
    invoke-static {v1}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->K(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->f()Ll8/h;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-interface {v1}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Lkotlin/Result;

    .line 28
    .line 29
    invoke-virtual {v1}, Lkotlin/Result;->j()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {}, Li7/v;->n()Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-static {v1}, Lkotlin/Result;->g(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_0

    .line 42
    .line 43
    move-object v1, v2

    .line 44
    :cond_0
    check-cast v1, Ljava/util/Collection;

    .line 45
    .line 46
    invoke-static {v1}, Li7/f0;->X0(Ljava/util/Collection;)Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iget-object v2, v0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$5$onItemDragEnd$1;->c:Lcom/zykj/study/bean/course/CatalogBean;

    .line 51
    .line 52
    iget-object v3, v0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$5$onItemDragEnd$1;->d:Lcom/zykj/study/bean/course/CatalogBean;

    .line 53
    .line 54
    iget-object v4, v0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$5$onItemDragEnd$1;->b:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;

    .line 55
    .line 56
    invoke-virtual {v2}, Lcom/zykj/study/bean/course/CatalogBean;->getChildren()Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    const/4 v6, 0x0

    .line 61
    if-eqz v5, :cond_1

    .line 62
    .line 63
    invoke-static {v5}, Li7/f0;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    check-cast v5, Lcom/zykj/study/bean/course/CatalogBean;

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    move-object v5, v6

    .line 71
    :goto_0
    if-eqz v5, :cond_3

    .line 72
    .line 73
    invoke-virtual {v5}, Lcom/zykj/study/bean/course/CatalogBean;->getId()I

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    invoke-virtual {v3}, Lcom/zykj/study/bean/course/CatalogBean;->getId()I

    .line 78
    .line 79
    .line 80
    move-result v7

    .line 81
    if-ne v5, v7, :cond_3

    .line 82
    .line 83
    invoke-static {v4}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->F(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)Lcom/zykj/study/adapter/CatalogEditAdapter;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-static {v4}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->K(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-virtual {v2}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->f()Ll8/h;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-interface {v2}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    check-cast v2, Lkotlin/Result;

    .line 100
    .line 101
    invoke-virtual {v2}, Lkotlin/Result;->j()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-static {v2}, Lkotlin/Result;->g(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    if-eqz v3, :cond_2

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_2
    move-object v6, v2

    .line 113
    :goto_1
    check-cast v6, Ljava/util/Collection;

    .line 114
    .line 115
    invoke-virtual {v1, v6}, Lcom/chad/library/adapter/base/BaseNodeAdapter;->R(Ljava/util/Collection;)V

    .line 116
    .line 117
    .line 118
    sget-object v1, Lh7/p;->a:Lh7/p;

    .line 119
    .line 120
    return-object v1

    .line 121
    :cond_3
    new-instance v5, Ljava/util/ArrayList;

    .line 122
    .line 123
    const/16 v7, 0xa

    .line 124
    .line 125
    invoke-static {v1, v7}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 126
    .line 127
    .line 128
    move-result v8

    .line 129
    invoke-direct {v5, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 130
    .line 131
    .line 132
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 137
    .line 138
    .line 139
    move-result v8

    .line 140
    if-eqz v8, :cond_5

    .line 141
    .line 142
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v8

    .line 146
    move-object v9, v8

    .line 147
    check-cast v9, Lcom/zykj/study/bean/course/CatalogBean;

    .line 148
    .line 149
    invoke-virtual {v9}, Lcom/zykj/study/bean/course/CatalogBean;->getChildren()Ljava/util/List;

    .line 150
    .line 151
    .line 152
    move-result-object v8

    .line 153
    if-eqz v8, :cond_4

    .line 154
    .line 155
    invoke-interface {v8, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v8

    .line 159
    const/4 v10, 0x1

    .line 160
    if-ne v8, v10, :cond_4

    .line 161
    .line 162
    invoke-virtual {v9}, Lcom/zykj/study/bean/course/CatalogBean;->getChildren()Ljava/util/List;

    .line 163
    .line 164
    .line 165
    move-result-object v8

    .line 166
    invoke-static {v8, v3}, Li7/f0;->E0(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/List;

    .line 167
    .line 168
    .line 169
    move-result-object v14

    .line 170
    const/16 v21, 0x7ef

    .line 171
    .line 172
    const/16 v22, 0x0

    .line 173
    .line 174
    const/4 v10, 0x0

    .line 175
    const/4 v11, 0x0

    .line 176
    const/4 v12, 0x0

    .line 177
    const/4 v13, 0x0

    .line 178
    const/4 v15, 0x0

    .line 179
    const/16 v16, 0x0

    .line 180
    .line 181
    const/16 v17, 0x0

    .line 182
    .line 183
    const/16 v18, 0x0

    .line 184
    .line 185
    const/16 v19, 0x0

    .line 186
    .line 187
    const/16 v20, 0x0

    .line 188
    .line 189
    invoke-static/range {v9 .. v22}, Lcom/zykj/study/bean/course/CatalogBean;->copy$default(Lcom/zykj/study/bean/course/CatalogBean;ILjava/lang/String;ZILjava/util/List;Ljava/util/List;ILcom/zykj/study/bean/course/StudyStatus;ZIIILjava/lang/Object;)Lcom/zykj/study/bean/course/CatalogBean;

    .line 190
    .line 191
    .line 192
    move-result-object v9

    .line 193
    :cond_4
    invoke-interface {v5, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    goto :goto_2

    .line 197
    :cond_5
    new-instance v1, Ljava/util/ArrayList;

    .line 198
    .line 199
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 200
    .line 201
    .line 202
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 203
    .line 204
    .line 205
    move-result-object v5

    .line 206
    :cond_6
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 207
    .line 208
    .line 209
    move-result v8

    .line 210
    if-eqz v8, :cond_7

    .line 211
    .line 212
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v8

    .line 216
    move-object v9, v8

    .line 217
    check-cast v9, Lcom/zykj/study/bean/course/CatalogBean;

    .line 218
    .line 219
    invoke-virtual {v9}, Lcom/zykj/study/bean/course/CatalogBean;->getId()I

    .line 220
    .line 221
    .line 222
    move-result v9

    .line 223
    invoke-virtual {v3}, Lcom/zykj/study/bean/course/CatalogBean;->getId()I

    .line 224
    .line 225
    .line 226
    move-result v10

    .line 227
    if-eq v9, v10, :cond_6

    .line 228
    .line 229
    invoke-interface {v1, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    goto :goto_3

    .line 233
    :cond_7
    new-instance v5, Ljava/util/ArrayList;

    .line 234
    .line 235
    invoke-static {v1, v7}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 236
    .line 237
    .line 238
    move-result v7

    .line 239
    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 240
    .line 241
    .line 242
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 247
    .line 248
    .line 249
    move-result v7

    .line 250
    if-eqz v7, :cond_b

    .line 251
    .line 252
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v7

    .line 256
    move-object v8, v7

    .line 257
    check-cast v8, Lcom/zykj/study/bean/course/CatalogBean;

    .line 258
    .line 259
    invoke-virtual {v8}, Lcom/zykj/study/bean/course/CatalogBean;->getId()I

    .line 260
    .line 261
    .line 262
    move-result v7

    .line 263
    invoke-virtual {v2}, Lcom/zykj/study/bean/course/CatalogBean;->getId()I

    .line 264
    .line 265
    .line 266
    move-result v9

    .line 267
    if-ne v7, v9, :cond_a

    .line 268
    .line 269
    invoke-virtual {v8}, Lcom/zykj/study/bean/course/CatalogBean;->getChildren()Ljava/util/List;

    .line 270
    .line 271
    .line 272
    move-result-object v7

    .line 273
    if-eqz v7, :cond_9

    .line 274
    .line 275
    invoke-static {v7, v3}, Li7/f0;->G0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    .line 276
    .line 277
    .line 278
    move-result-object v7

    .line 279
    if-nez v7, :cond_8

    .line 280
    .line 281
    goto :goto_6

    .line 282
    :cond_8
    :goto_5
    move-object v13, v7

    .line 283
    goto :goto_7

    .line 284
    :cond_9
    :goto_6
    invoke-static {v3}, Li7/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 285
    .line 286
    .line 287
    move-result-object v7

    .line 288
    goto :goto_5

    .line 289
    :goto_7
    const/16 v20, 0x7ef

    .line 290
    .line 291
    const/16 v21, 0x0

    .line 292
    .line 293
    const/4 v9, 0x0

    .line 294
    const/4 v10, 0x0

    .line 295
    const/4 v11, 0x0

    .line 296
    const/4 v12, 0x0

    .line 297
    const/4 v14, 0x0

    .line 298
    const/4 v15, 0x0

    .line 299
    const/16 v16, 0x0

    .line 300
    .line 301
    const/16 v17, 0x0

    .line 302
    .line 303
    const/16 v18, 0x0

    .line 304
    .line 305
    const/16 v19, 0x0

    .line 306
    .line 307
    invoke-static/range {v8 .. v21}, Lcom/zykj/study/bean/course/CatalogBean;->copy$default(Lcom/zykj/study/bean/course/CatalogBean;ILjava/lang/String;ZILjava/util/List;Ljava/util/List;ILcom/zykj/study/bean/course/StudyStatus;ZIIILjava/lang/Object;)Lcom/zykj/study/bean/course/CatalogBean;

    .line 308
    .line 309
    .line 310
    move-result-object v8

    .line 311
    :cond_a
    invoke-interface {v5, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    goto :goto_4

    .line 315
    :cond_b
    invoke-static {v4, v5}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->N(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Ljava/util/List;)Ljava/util/List;

    .line 316
    .line 317
    .line 318
    move-result-object v1

    .line 319
    invoke-static {v4}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->K(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    .line 320
    .line 321
    .line 322
    move-result-object v2

    .line 323
    invoke-virtual {v2, v1}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->o(Ljava/util/List;)V

    .line 324
    .line 325
    .line 326
    new-instance v1, Lkotlin/Pair;

    .line 327
    .line 328
    invoke-direct {v1, v6, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v4, v1}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->z0(Lkotlin/Pair;)V

    .line 332
    .line 333
    .line 334
    sget-object v1, Lh7/p;->a:Lh7/p;

    .line 335
    .line 336
    return-object v1

    .line 337
    :cond_c
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 338
    .line 339
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 340
    .line 341
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    throw v1
.end method
