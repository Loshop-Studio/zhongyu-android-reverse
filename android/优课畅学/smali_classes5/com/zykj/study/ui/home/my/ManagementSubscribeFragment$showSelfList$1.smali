.class final Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$showSelfList$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->T()V
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
    c = "com.zykj.study.ui.home.my.ManagementSubscribeFragment$showSelfList$1"
    f = "ManagementSubscribeFragment.kt"
    l = {
        0x15f
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public c:I

.field public d:I

.field public final synthetic e:Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$showSelfList$1;->e:Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;

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
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 1

    .line 1
    new-instance p1, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$showSelfList$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$showSelfList$1;->e:Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$showSelfList$1;-><init>(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Lm7/c;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$showSelfList$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$showSelfList$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$showSelfList$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$showSelfList$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget v2, v0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$showSelfList$1;->d:I

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, 0x0

    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    if-ne v2, v3, :cond_0

    .line 15
    .line 16
    iget-object v1, v0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$showSelfList$1;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;

    .line 19
    .line 20
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    move-object/from16 v2, p1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 27
    .line 28
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 29
    .line 30
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw v1

    .line 34
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object v2, v0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$showSelfList$1;->e:Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;

    .line 38
    .line 39
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    if-eqz v2, :cond_c

    .line 44
    .line 45
    const-string v6, "courseId"

    .line 46
    .line 47
    invoke-virtual {v2, v6}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    iget-object v6, v0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$showSelfList$1;->e:Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;

    .line 52
    .line 53
    invoke-virtual {v6}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->A()Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    int-to-long v8, v2

    .line 58
    iput-object v6, v0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$showSelfList$1;->a:Ljava/lang/Object;

    .line 59
    .line 60
    iput v2, v0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$showSelfList$1;->b:I

    .line 61
    .line 62
    iput v5, v0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$showSelfList$1;->c:I

    .line 63
    .line 64
    iput v3, v0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$showSelfList$1;->d:I

    .line 65
    .line 66
    invoke-virtual {v7, v8, v9, v0}, Lcom/zykj/study/viewmodels/ManagementSubscribeViewModel;->h(JLm7/c;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    if-ne v2, v1, :cond_2

    .line 71
    .line 72
    return-object v1

    .line 73
    :cond_2
    move-object v1, v6

    .line 74
    :goto_0
    check-cast v2, Lcom/zykj/study/bean/SelfSubscribeList;

    .line 75
    .line 76
    if-eqz v2, :cond_c

    .line 77
    .line 78
    invoke-virtual {v2}, Lcom/zykj/study/bean/SelfSubscribeList;->isSupervise()Z

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    const/16 v7, 0x8

    .line 83
    .line 84
    if-nez v6, :cond_3

    .line 85
    .line 86
    invoke-virtual {v1}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    check-cast v6, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;

    .line 91
    .line 92
    iget-object v6, v6, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->selfCourseSubscriberList:Lcom/zykj/study/databinding/LayoutSelfCourseSubscriberListBinding;

    .line 93
    .line 94
    iget-object v6, v6, Lcom/zykj/study/databinding/LayoutSelfCourseSubscriberListBinding;->elvSelfGroupList:Landroid/widget/ExpandableListView;

    .line 95
    .line 96
    invoke-virtual {v6, v7}, Landroid/view/View;->setVisibility(I)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    check-cast v6, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;

    .line 104
    .line 105
    iget-object v6, v6, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->selfCourseSubscriberList:Lcom/zykj/study/databinding/LayoutSelfCourseSubscriberListBinding;

    .line 106
    .line 107
    iget-object v6, v6, Lcom/zykj/study/databinding/LayoutSelfCourseSubscriberListBinding;->llSelfCourseNoGroup:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 108
    .line 109
    invoke-virtual {v6, v7}, Landroid/view/View;->setVisibility(I)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    check-cast v6, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;

    .line 117
    .line 118
    iget-object v6, v6, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->selfCourseSubscriberList:Lcom/zykj/study/databinding/LayoutSelfCourseSubscriberListBinding;

    .line 119
    .line 120
    iget-object v6, v6, Lcom/zykj/study/databinding/LayoutSelfCourseSubscriberListBinding;->llSelfCourseNoSelect:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 121
    .line 122
    invoke-virtual {v6, v5}, Landroid/view/View;->setVisibility(I)V

    .line 123
    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_3
    invoke-virtual {v2}, Lcom/zykj/study/bean/SelfSubscribeList;->getGroups()Ljava/util/List;

    .line 127
    .line 128
    .line 129
    move-result-object v6

    .line 130
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 131
    .line 132
    .line 133
    move-result v6

    .line 134
    if-eqz v6, :cond_4

    .line 135
    .line 136
    invoke-virtual {v1}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 137
    .line 138
    .line 139
    move-result-object v6

    .line 140
    check-cast v6, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;

    .line 141
    .line 142
    iget-object v6, v6, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->selfCourseSubscriberList:Lcom/zykj/study/databinding/LayoutSelfCourseSubscriberListBinding;

    .line 143
    .line 144
    iget-object v6, v6, Lcom/zykj/study/databinding/LayoutSelfCourseSubscriberListBinding;->elvSelfGroupList:Landroid/widget/ExpandableListView;

    .line 145
    .line 146
    invoke-virtual {v6, v7}, Landroid/view/View;->setVisibility(I)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v1}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    check-cast v6, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;

    .line 154
    .line 155
    iget-object v6, v6, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->selfCourseSubscriberList:Lcom/zykj/study/databinding/LayoutSelfCourseSubscriberListBinding;

    .line 156
    .line 157
    iget-object v6, v6, Lcom/zykj/study/databinding/LayoutSelfCourseSubscriberListBinding;->llSelfCourseNoGroup:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 158
    .line 159
    invoke-virtual {v6, v5}, Landroid/view/View;->setVisibility(I)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v1}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 163
    .line 164
    .line 165
    move-result-object v6

    .line 166
    check-cast v6, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;

    .line 167
    .line 168
    iget-object v6, v6, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->selfCourseSubscriberList:Lcom/zykj/study/databinding/LayoutSelfCourseSubscriberListBinding;

    .line 169
    .line 170
    iget-object v6, v6, Lcom/zykj/study/databinding/LayoutSelfCourseSubscriberListBinding;->llSelfCourseNoSelect:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 171
    .line 172
    invoke-virtual {v6, v7}, Landroid/view/View;->setVisibility(I)V

    .line 173
    .line 174
    .line 175
    goto :goto_1

    .line 176
    :cond_4
    invoke-virtual {v1}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 177
    .line 178
    .line 179
    move-result-object v6

    .line 180
    check-cast v6, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;

    .line 181
    .line 182
    iget-object v6, v6, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->selfCourseSubscriberList:Lcom/zykj/study/databinding/LayoutSelfCourseSubscriberListBinding;

    .line 183
    .line 184
    iget-object v6, v6, Lcom/zykj/study/databinding/LayoutSelfCourseSubscriberListBinding;->elvSelfGroupList:Landroid/widget/ExpandableListView;

    .line 185
    .line 186
    invoke-virtual {v6, v5}, Landroid/view/View;->setVisibility(I)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v1}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 190
    .line 191
    .line 192
    move-result-object v6

    .line 193
    check-cast v6, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;

    .line 194
    .line 195
    iget-object v6, v6, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->selfCourseSubscriberList:Lcom/zykj/study/databinding/LayoutSelfCourseSubscriberListBinding;

    .line 196
    .line 197
    iget-object v6, v6, Lcom/zykj/study/databinding/LayoutSelfCourseSubscriberListBinding;->llSelfCourseNoGroup:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 198
    .line 199
    invoke-virtual {v6, v7}, Landroid/view/View;->setVisibility(I)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v1}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 203
    .line 204
    .line 205
    move-result-object v6

    .line 206
    check-cast v6, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;

    .line 207
    .line 208
    iget-object v6, v6, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->selfCourseSubscriberList:Lcom/zykj/study/databinding/LayoutSelfCourseSubscriberListBinding;

    .line 209
    .line 210
    iget-object v6, v6, Lcom/zykj/study/databinding/LayoutSelfCourseSubscriberListBinding;->llSelfCourseNoSelect:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 211
    .line 212
    invoke-virtual {v6, v7}, Landroid/view/View;->setVisibility(I)V

    .line 213
    .line 214
    .line 215
    :goto_1
    invoke-static {}, Li7/v;->n()Ljava/util/List;

    .line 216
    .line 217
    .line 218
    move-result-object v6

    .line 219
    new-array v3, v3, [Ljava/util/List;

    .line 220
    .line 221
    aput-object v6, v3, v5

    .line 222
    .line 223
    invoke-static {v3}, Li7/v;->g([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 224
    .line 225
    .line 226
    move-result-object v3

    .line 227
    invoke-virtual {v2}, Lcom/zykj/study/bean/SelfSubscribeList;->getStudents()Ljava/util/List;

    .line 228
    .line 229
    .line 230
    move-result-object v6

    .line 231
    new-instance v7, Ljava/util/ArrayList;

    .line 232
    .line 233
    const/16 v8, 0xa

    .line 234
    .line 235
    invoke-static {v6, v8}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 236
    .line 237
    .line 238
    move-result v9

    .line 239
    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 240
    .line 241
    .line 242
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 243
    .line 244
    .line 245
    move-result-object v6

    .line 246
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 247
    .line 248
    .line 249
    move-result v9

    .line 250
    if-eqz v9, :cond_5

    .line 251
    .line 252
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v9

    .line 256
    check-cast v9, Lcom/zykj/study/bean/Student;

    .line 257
    .line 258
    invoke-virtual {v9}, Lcom/zykj/study/bean/Student;->getGroupId()J

    .line 259
    .line 260
    .line 261
    move-result-wide v10

    .line 262
    invoke-static {v10, v11}, Lo7/a;->d(J)Ljava/lang/Long;

    .line 263
    .line 264
    .line 265
    move-result-object v10

    .line 266
    invoke-virtual {v9}, Lcom/zykj/study/bean/Student;->getStudentName()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v9

    .line 270
    invoke-static {v10, v9}, Lh7/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 271
    .line 272
    .line 273
    move-result-object v9

    .line 274
    invoke-interface {v7, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    goto :goto_2

    .line 278
    :cond_5
    new-instance v6, Ljava/util/ArrayList;

    .line 279
    .line 280
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v2}, Lcom/zykj/study/bean/SelfSubscribeList;->getGroups()Ljava/util/List;

    .line 284
    .line 285
    .line 286
    move-result-object v2

    .line 287
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 288
    .line 289
    .line 290
    move-result-object v2

    .line 291
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 292
    .line 293
    .line 294
    move-result v9

    .line 295
    if-eqz v9, :cond_9

    .line 296
    .line 297
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v9

    .line 301
    check-cast v9, Lcom/zykj/study/bean/Group;

    .line 302
    .line 303
    new-instance v10, Ljava/util/ArrayList;

    .line 304
    .line 305
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 306
    .line 307
    .line 308
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 309
    .line 310
    .line 311
    move-result-object v11

    .line 312
    :cond_6
    :goto_4
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 313
    .line 314
    .line 315
    move-result v12

    .line 316
    if-eqz v12, :cond_7

    .line 317
    .line 318
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v12

    .line 322
    move-object v13, v12

    .line 323
    check-cast v13, Lkotlin/Pair;

    .line 324
    .line 325
    invoke-virtual {v13}, Lkotlin/Pair;->e()Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v13

    .line 329
    check-cast v13, Ljava/lang/Number;

    .line 330
    .line 331
    invoke-virtual {v13}, Ljava/lang/Number;->longValue()J

    .line 332
    .line 333
    .line 334
    move-result-wide v13

    .line 335
    invoke-virtual {v9}, Lcom/zykj/study/bean/Group;->getGroupId()J

    .line 336
    .line 337
    .line 338
    move-result-wide v15

    .line 339
    cmp-long v13, v13, v15

    .line 340
    .line 341
    if-nez v13, :cond_6

    .line 342
    .line 343
    invoke-interface {v10, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    goto :goto_4

    .line 347
    :cond_7
    new-instance v11, Ljava/util/ArrayList;

    .line 348
    .line 349
    invoke-static {v10, v8}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 350
    .line 351
    .line 352
    move-result v12

    .line 353
    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 354
    .line 355
    .line 356
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 357
    .line 358
    .line 359
    move-result-object v10

    .line 360
    :goto_5
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 361
    .line 362
    .line 363
    move-result v12

    .line 364
    if-eqz v12, :cond_8

    .line 365
    .line 366
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v12

    .line 370
    check-cast v12, Lkotlin/Pair;

    .line 371
    .line 372
    invoke-virtual {v12}, Lkotlin/Pair;->g()Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v12

    .line 376
    check-cast v12, Ljava/lang/String;

    .line 377
    .line 378
    invoke-interface {v11, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    goto :goto_5

    .line 382
    :cond_8
    invoke-virtual {v9}, Lcom/zykj/study/bean/Group;->getGroupName()Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v9

    .line 386
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 390
    .line 391
    .line 392
    goto :goto_3

    .line 393
    :cond_9
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    new-instance v2, Ln4/o0;

    .line 397
    .line 398
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 399
    .line 400
    .line 401
    move-result-object v5

    .line 402
    const-string v7, "requireContext(...)"

    .line 403
    .line 404
    invoke-static {v5, v7}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 405
    .line 406
    .line 407
    invoke-direct {v2, v6, v3, v5}, Ln4/o0;-><init>(Ljava/util/List;Ljava/util/List;Landroid/content/Context;)V

    .line 408
    .line 409
    .line 410
    invoke-static {v1, v2}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->z(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;Ln4/o0;)V

    .line 411
    .line 412
    .line 413
    invoke-virtual {v1}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 414
    .line 415
    .line 416
    move-result-object v2

    .line 417
    check-cast v2, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;

    .line 418
    .line 419
    iget-object v2, v2, Lcom/zykj/study/databinding/FragmentManagementSubscribeBinding;->selfCourseSubscriberList:Lcom/zykj/study/databinding/LayoutSelfCourseSubscriberListBinding;

    .line 420
    .line 421
    iget-object v2, v2, Lcom/zykj/study/databinding/LayoutSelfCourseSubscriberListBinding;->elvSelfGroupList:Landroid/widget/ExpandableListView;

    .line 422
    .line 423
    invoke-static {v1}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->w(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;)Ln4/o0;

    .line 424
    .line 425
    .line 426
    move-result-object v3

    .line 427
    const-string v5, "selfAdapter"

    .line 428
    .line 429
    if-nez v3, :cond_a

    .line 430
    .line 431
    invoke-static {v5}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 432
    .line 433
    .line 434
    move-object v3, v4

    .line 435
    :cond_a
    invoke-virtual {v2, v3}, Landroid/widget/ExpandableListView;->setAdapter(Landroid/widget/ExpandableListAdapter;)V

    .line 436
    .line 437
    .line 438
    invoke-static {v1}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->w(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;)Ln4/o0;

    .line 439
    .line 440
    .line 441
    move-result-object v1

    .line 442
    if-nez v1, :cond_b

    .line 443
    .line 444
    invoke-static {v5}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 445
    .line 446
    .line 447
    move-object v1, v4

    .line 448
    :cond_b
    invoke-virtual {v1}, Landroid/widget/BaseExpandableListAdapter;->notifyDataSetChanged()V

    .line 449
    .line 450
    .line 451
    :cond_c
    iget-object v1, v0, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment$showSelfList$1;->e:Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;

    .line 452
    .line 453
    invoke-static {v1}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->x(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;)Lcom/zykj/study/adapter/SubscribeTabListAdapter;

    .line 454
    .line 455
    .line 456
    move-result-object v1

    .line 457
    if-nez v1, :cond_d

    .line 458
    .line 459
    const-string v1, "subscribeTabListAdapter"

    .line 460
    .line 461
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 462
    .line 463
    .line 464
    goto :goto_6

    .line 465
    :cond_d
    move-object v4, v1

    .line 466
    :goto_6
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 467
    .line 468
    .line 469
    sget-object v1, Lh7/p;->a:Lh7/p;

    .line 470
    .line 471
    return-object v1
.end method
