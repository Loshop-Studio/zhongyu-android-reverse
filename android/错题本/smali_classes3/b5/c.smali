.class public final Lb5/c;
.super La/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:J

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lcom/zykj/mistake/base/BasePresenter;


# direct methods
.method public synthetic constructor <init>(JLcom/zykj/mistake/base/BasePresenter;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p6, p0, Lb5/c;->a:I

    iput-wide p1, p0, Lb5/c;->b:J

    iput-object p3, p0, Lb5/c;->e:Lcom/zykj/mistake/base/BasePresenter;

    iput-object p4, p0, Lb5/c;->c:Ljava/lang/String;

    iput-object p5, p0, Lb5/c;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final m(Ljava/lang/String;)V
    .locals 5

    .line 1
    iget v0, p0, Lb5/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb5/c;->e:Lcom/zykj/mistake/base/BasePresenter;

    .line 7
    .line 8
    check-cast v0, Lcom/zykj/mistake/presenter/MistakeListPresenter;

    .line 9
    .line 10
    const-string v1, "e"

    .line 11
    .line 12
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-wide v1, p0, Lb5/c;->b:J

    .line 16
    .line 17
    const-wide/16 v3, 0x0

    .line 18
    .line 19
    cmp-long v1, v1, v3

    .line 20
    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    iget-object v0, v0, Lcom/zykj/mistake/base/BasePresenter;->c:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Lcom/zykj/mistake/activity/MistakeListActivity;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Lcom/zykj/mistake/base/BaseMVPActivity;->b(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget-object v0, v0, Lcom/zykj/mistake/base/BasePresenter;->c:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Lcom/zykj/mistake/activity/MistakeListActivity;

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    invoke-virtual {v0, p1}, Lcom/zykj/mistake/base/BaseMVPActivity;->b(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    :goto_0
    return-void

    .line 43
    :pswitch_0
    iget-object v0, p0, Lb5/c;->e:Lcom/zykj/mistake/base/BasePresenter;

    .line 44
    .line 45
    check-cast v0, Lcom/zykj/mistake/presenter/MistakeDetailPresenter;

    .line 46
    .line 47
    const-string v1, "e"

    .line 48
    .line 49
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iget-wide v1, p0, Lb5/c;->b:J

    .line 53
    .line 54
    const-wide/16 v3, 0x0

    .line 55
    .line 56
    cmp-long v1, v1, v3

    .line 57
    .line 58
    if-nez v1, :cond_2

    .line 59
    .line 60
    iget-object v0, v0, Lcom/zykj/mistake/base/BasePresenter;->c:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v0, Lcom/zykj/mistake/activity/MistakeDetailActivity;

    .line 63
    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    invoke-virtual {v0, p1}, Lcom/zykj/mistake/base/BaseMVPActivity;->b(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    iget-object v0, v0, Lcom/zykj/mistake/base/BasePresenter;->c:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v0, Lcom/zykj/mistake/activity/MistakeDetailActivity;

    .line 73
    .line 74
    if-eqz v0, :cond_3

    .line 75
    .line 76
    invoke-virtual {v0, p1}, Lcom/zykj/mistake/base/BaseMVPActivity;->b(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    :cond_3
    :goto_1
    return-void

    .line 80
    :pswitch_1
    iget-object v0, p0, Lb5/c;->e:Lcom/zykj/mistake/base/BasePresenter;

    .line 81
    .line 82
    check-cast v0, Lcom/zykj/mistake/presenter/MistakeCreateOrEditPresenter;

    .line 83
    .line 84
    const-string v1, "e"

    .line 85
    .line 86
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    iget-wide v1, p0, Lb5/c;->b:J

    .line 90
    .line 91
    const-wide/16 v3, 0x0

    .line 92
    .line 93
    cmp-long v1, v1, v3

    .line 94
    .line 95
    if-nez v1, :cond_4

    .line 96
    .line 97
    iget-object v0, v0, Lcom/zykj/mistake/base/BasePresenter;->c:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 100
    .line 101
    if-eqz v0, :cond_5

    .line 102
    .line 103
    invoke-virtual {v0, p1}, Lcom/zykj/mistake/base/BaseMVPActivity;->b(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_4
    iget-object v0, v0, Lcom/zykj/mistake/base/BasePresenter;->c:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 110
    .line 111
    if-eqz v0, :cond_5

    .line 112
    .line 113
    invoke-virtual {v0, p1}, Lcom/zykj/mistake/base/BaseMVPActivity;->b(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    :cond_5
    :goto_2
    return-void

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Ljava/lang/Object;)V
    .locals 14

    .line 1
    iget v0, p0, Lb5/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lcom/zykj/mistake/entity/resp/CreateOrEditTagResp;

    .line 7
    .line 8
    iget-object v0, p0, Lb5/c;->e:Lcom/zykj/mistake/base/BasePresenter;

    .line 9
    .line 10
    check-cast v0, Lcom/zykj/mistake/presenter/MistakeListPresenter;

    .line 11
    .line 12
    const-string v1, "resp"

    .line 13
    .line 14
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-wide/16 v1, 0x0

    .line 18
    .line 19
    iget-wide v3, p0, Lb5/c;->b:J

    .line 20
    .line 21
    cmp-long v1, v3, v1

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    iget-object v6, p0, Lb5/c;->c:Ljava/lang/String;

    .line 25
    .line 26
    if-nez v1, :cond_1

    .line 27
    .line 28
    iget-object v0, v0, Lcom/zykj/mistake/base/BasePresenter;->c:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Lcom/zykj/mistake/activity/MistakeListActivity;

    .line 31
    .line 32
    if-eqz v0, :cond_9

    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/zykj/mistake/entity/resp/CreateOrEditTagResp;->getResult()J

    .line 35
    .line 36
    .line 37
    move-result-wide v7

    .line 38
    const-string p1, "name"

    .line 39
    .line 40
    invoke-static {v6, p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    new-instance v5, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 44
    .line 45
    const/16 v11, 0xc

    .line 46
    .line 47
    const/4 v12, 0x0

    .line 48
    const/4 v9, 0x0

    .line 49
    const/4 v10, 0x0

    .line 50
    invoke-direct/range {v5 .. v12}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;-><init>(Ljava/lang/String;JIIILkotlin/jvm/internal/e;)V

    .line 51
    .line 52
    .line 53
    iget-object p1, v0, Lcom/zykj/mistake/activity/MistakeListActivity;->u:Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-virtual {p1, v2, v5}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    check-cast p1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 63
    .line 64
    iget-object p1, p1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->b:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 65
    .line 66
    iget-object p1, p1, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->d:Lcom/zykj/mistake/widget/FlowLayout;

    .line 67
    .line 68
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    check-cast p1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 76
    .line 77
    iget-object p1, p1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->b:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 78
    .line 79
    iget-object p1, p1, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->d:Lcom/zykj/mistake/widget/FlowLayout;

    .line 80
    .line 81
    iget-object v1, v0, Lcom/zykj/mistake/activity/MistakeListActivity;->t:Ljava/util/ArrayList;

    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    iget v4, v0, Lcom/zykj/mistake/activity/MistakeListActivity;->v:I

    .line 88
    .line 89
    if-ge v3, v4, :cond_0

    .line 90
    .line 91
    const/4 v3, 0x1

    .line 92
    goto :goto_0

    .line 93
    :cond_0
    move v3, v2

    .line 94
    :goto_0
    const/4 v6, 0x4

    .line 95
    invoke-static {v0, v5, v3, v6}, Lcom/zykj/mistake/activity/MistakeListActivity;->y(Lcom/zykj/mistake/activity/MistakeListActivity;Lcom/zykj/mistake/entity/resp/CustomTagInfo;ZI)Landroid/view/View;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    invoke-virtual {p1, v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    check-cast p1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 107
    .line 108
    iget-object p1, p1, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->b:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 109
    .line 110
    iget-object p1, p1, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->d:Lcom/zykj/mistake/widget/FlowLayout;

    .line 111
    .line 112
    new-instance v6, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 113
    .line 114
    const/16 v12, 0xf

    .line 115
    .line 116
    const/4 v13, 0x0

    .line 117
    const/4 v7, 0x0

    .line 118
    const-wide/16 v8, 0x0

    .line 119
    .line 120
    const/4 v10, 0x0

    .line 121
    const/4 v11, 0x0

    .line 122
    invoke-direct/range {v6 .. v13}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;-><init>(Ljava/lang/String;JIIILkotlin/jvm/internal/e;)V

    .line 123
    .line 124
    .line 125
    const/4 v3, 0x2

    .line 126
    invoke-static {v0, v6, v2, v3}, Lcom/zykj/mistake/activity/MistakeListActivity;->y(Lcom/zykj/mistake/activity/MistakeListActivity;Lcom/zykj/mistake/entity/resp/CustomTagInfo;ZI)Landroid/view/View;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-virtual {p1, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    if-ge p1, v4, :cond_9

    .line 138
    .line 139
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    goto/16 :goto_6

    .line 143
    .line 144
    :cond_1
    iget-object p1, v0, Lcom/zykj/mistake/base/BasePresenter;->c:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast p1, Lcom/zykj/mistake/activity/MistakeListActivity;

    .line 147
    .line 148
    if-eqz p1, :cond_9

    .line 149
    .line 150
    const-string v0, "oldName"

    .line 151
    .line 152
    iget-object v1, p0, Lb5/c;->d:Ljava/lang/String;

    .line 153
    .line 154
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    const-string v0, "newName"

    .line 158
    .line 159
    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    iget-object v0, p1, Lcom/zykj/mistake/activity/MistakeListActivity;->u:Ljava/util/ArrayList;

    .line 163
    .line 164
    new-instance v5, Ljava/util/ArrayList;

    .line 165
    .line 166
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 170
    .line 171
    .line 172
    move-result v7

    .line 173
    move v8, v2

    .line 174
    :cond_2
    :goto_1
    const/4 v9, -0x1

    .line 175
    if-ge v8, v7, :cond_3

    .line 176
    .line 177
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v10

    .line 181
    add-int/lit8 v8, v8, 0x1

    .line 182
    .line 183
    move-object v11, v10

    .line 184
    check-cast v11, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 185
    .line 186
    invoke-virtual {v11}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 187
    .line 188
    .line 189
    move-result-wide v12

    .line 190
    cmp-long v12, v12, v3

    .line 191
    .line 192
    if-nez v12, :cond_2

    .line 193
    .line 194
    invoke-virtual {v11}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 195
    .line 196
    .line 197
    move-result v11

    .line 198
    if-ne v11, v9, :cond_2

    .line 199
    .line 200
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    goto :goto_1

    .line 204
    :cond_3
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    move v7, v2

    .line 209
    :goto_2
    if-ge v7, v0, :cond_4

    .line 210
    .line 211
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v8

    .line 215
    add-int/lit8 v7, v7, 0x1

    .line 216
    .line 217
    check-cast v8, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 218
    .line 219
    invoke-virtual {v8, v6}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->setName(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    goto :goto_2

    .line 223
    :cond_4
    iget-object v0, p1, Lcom/zykj/mistake/activity/MistakeListActivity;->t:Ljava/util/ArrayList;

    .line 224
    .line 225
    new-instance v5, Ljava/util/ArrayList;

    .line 226
    .line 227
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 231
    .line 232
    .line 233
    move-result v7

    .line 234
    move v8, v2

    .line 235
    :cond_5
    :goto_3
    if-ge v8, v7, :cond_6

    .line 236
    .line 237
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v10

    .line 241
    add-int/lit8 v8, v8, 0x1

    .line 242
    .line 243
    move-object v11, v10

    .line 244
    check-cast v11, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 245
    .line 246
    invoke-virtual {v11}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 247
    .line 248
    .line 249
    move-result-wide v12

    .line 250
    cmp-long v12, v12, v3

    .line 251
    .line 252
    if-nez v12, :cond_5

    .line 253
    .line 254
    invoke-virtual {v11}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 255
    .line 256
    .line 257
    move-result v11

    .line 258
    if-ne v11, v9, :cond_5

    .line 259
    .line 260
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    goto :goto_3

    .line 264
    :cond_6
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 265
    .line 266
    .line 267
    move-result v0

    .line 268
    move v3, v2

    .line 269
    :goto_4
    if-ge v3, v0, :cond_7

    .line 270
    .line 271
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v4

    .line 275
    add-int/lit8 v3, v3, 0x1

    .line 276
    .line 277
    check-cast v4, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 278
    .line 279
    invoke-virtual {v4, v6}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->setName(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    goto :goto_4

    .line 283
    :cond_7
    invoke-virtual {p1}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 288
    .line 289
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->b:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 290
    .line 291
    iget-object v0, v0, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->d:Lcom/zykj/mistake/widget/FlowLayout;

    .line 292
    .line 293
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 294
    .line 295
    .line 296
    move-result v0

    .line 297
    :goto_5
    if-ge v2, v0, :cond_9

    .line 298
    .line 299
    invoke-virtual {p1}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 300
    .line 301
    .line 302
    move-result-object v3

    .line 303
    check-cast v3, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;

    .line 304
    .line 305
    iget-object v3, v3, Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;->b:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 306
    .line 307
    iget-object v3, v3, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->d:Lcom/zykj/mistake/widget/FlowLayout;

    .line 308
    .line 309
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 310
    .line 311
    .line 312
    move-result-object v3

    .line 313
    sget v4, Lcom/zykj/mistake/R$id;->tv_item_tag_content:I

    .line 314
    .line 315
    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 316
    .line 317
    .line 318
    move-result-object v3

    .line 319
    check-cast v3, Landroid/widget/TextView;

    .line 320
    .line 321
    invoke-virtual {v3}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 322
    .line 323
    .line 324
    move-result-object v4

    .line 325
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result v4

    .line 329
    if-eqz v4, :cond_8

    .line 330
    .line 331
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 332
    .line 333
    .line 334
    goto :goto_6

    .line 335
    :cond_8
    add-int/lit8 v2, v2, 0x1

    .line 336
    .line 337
    goto :goto_5

    .line 338
    :cond_9
    :goto_6
    return-void

    .line 339
    :pswitch_0
    check-cast p1, Lcom/zykj/mistake/entity/resp/CreateOrEditTagResp;

    .line 340
    .line 341
    iget-object v0, p0, Lb5/c;->e:Lcom/zykj/mistake/base/BasePresenter;

    .line 342
    .line 343
    check-cast v0, Lcom/zykj/mistake/presenter/MistakeDetailPresenter;

    .line 344
    .line 345
    const-string v1, "resp"

    .line 346
    .line 347
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    const-wide/16 v1, 0x0

    .line 351
    .line 352
    iget-wide v3, p0, Lb5/c;->b:J

    .line 353
    .line 354
    cmp-long v1, v3, v1

    .line 355
    .line 356
    const/4 v2, 0x0

    .line 357
    iget-object v6, p0, Lb5/c;->c:Ljava/lang/String;

    .line 358
    .line 359
    if-nez v1, :cond_b

    .line 360
    .line 361
    iget-object v0, v0, Lcom/zykj/mistake/base/BasePresenter;->c:Ljava/lang/Object;

    .line 362
    .line 363
    check-cast v0, Lcom/zykj/mistake/activity/MistakeDetailActivity;

    .line 364
    .line 365
    if-eqz v0, :cond_13

    .line 366
    .line 367
    invoke-virtual {p1}, Lcom/zykj/mistake/entity/resp/CreateOrEditTagResp;->getResult()J

    .line 368
    .line 369
    .line 370
    move-result-wide v7

    .line 371
    const-string p1, "name"

    .line 372
    .line 373
    invoke-static {v6, p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    new-instance v5, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 377
    .line 378
    const/16 v11, 0xc

    .line 379
    .line 380
    const/4 v12, 0x0

    .line 381
    const/4 v9, 0x0

    .line 382
    const/4 v10, 0x0

    .line 383
    invoke-direct/range {v5 .. v12}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;-><init>(Ljava/lang/String;JIIILkotlin/jvm/internal/e;)V

    .line 384
    .line 385
    .line 386
    iget-object p1, v0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->k:Ljava/util/ArrayList;

    .line 387
    .line 388
    invoke-virtual {p1, v2, v5}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 392
    .line 393
    .line 394
    move-result-object p1

    .line 395
    check-cast p1, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;

    .line 396
    .line 397
    iget-object p1, p1, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;->c:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 398
    .line 399
    iget-object p1, p1, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->d:Lcom/zykj/mistake/widget/FlowLayout;

    .line 400
    .line 401
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 405
    .line 406
    .line 407
    move-result-object p1

    .line 408
    check-cast p1, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;

    .line 409
    .line 410
    iget-object p1, p1, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;->c:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 411
    .line 412
    iget-object p1, p1, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->d:Lcom/zykj/mistake/widget/FlowLayout;

    .line 413
    .line 414
    iget-object v1, v0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->i:Ljava/util/ArrayList;

    .line 415
    .line 416
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 417
    .line 418
    .line 419
    move-result v3

    .line 420
    iget v4, v0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->j:I

    .line 421
    .line 422
    if-ge v3, v4, :cond_a

    .line 423
    .line 424
    const/4 v3, 0x1

    .line 425
    goto :goto_7

    .line 426
    :cond_a
    move v3, v2

    .line 427
    :goto_7
    const/4 v6, 0x4

    .line 428
    invoke-static {v0, v5, v3, v6}, Lcom/zykj/mistake/activity/MistakeDetailActivity;->x(Lcom/zykj/mistake/activity/MistakeDetailActivity;Lcom/zykj/mistake/entity/resp/CustomTagInfo;ZI)Landroid/view/View;

    .line 429
    .line 430
    .line 431
    move-result-object v3

    .line 432
    invoke-virtual {p1, v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 433
    .line 434
    .line 435
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 436
    .line 437
    .line 438
    move-result-object p1

    .line 439
    check-cast p1, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;

    .line 440
    .line 441
    iget-object p1, p1, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;->c:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 442
    .line 443
    iget-object p1, p1, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->d:Lcom/zykj/mistake/widget/FlowLayout;

    .line 444
    .line 445
    new-instance v6, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 446
    .line 447
    const/16 v12, 0xf

    .line 448
    .line 449
    const/4 v13, 0x0

    .line 450
    const/4 v7, 0x0

    .line 451
    const-wide/16 v8, 0x0

    .line 452
    .line 453
    const/4 v10, 0x0

    .line 454
    const/4 v11, 0x0

    .line 455
    invoke-direct/range {v6 .. v13}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;-><init>(Ljava/lang/String;JIIILkotlin/jvm/internal/e;)V

    .line 456
    .line 457
    .line 458
    const/4 v3, 0x2

    .line 459
    invoke-static {v0, v6, v2, v3}, Lcom/zykj/mistake/activity/MistakeDetailActivity;->x(Lcom/zykj/mistake/activity/MistakeDetailActivity;Lcom/zykj/mistake/entity/resp/CustomTagInfo;ZI)Landroid/view/View;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    invoke-virtual {p1, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 464
    .line 465
    .line 466
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 467
    .line 468
    .line 469
    move-result p1

    .line 470
    if-ge p1, v4, :cond_13

    .line 471
    .line 472
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 473
    .line 474
    .line 475
    goto/16 :goto_d

    .line 476
    .line 477
    :cond_b
    iget-object p1, v0, Lcom/zykj/mistake/base/BasePresenter;->c:Ljava/lang/Object;

    .line 478
    .line 479
    check-cast p1, Lcom/zykj/mistake/activity/MistakeDetailActivity;

    .line 480
    .line 481
    if-eqz p1, :cond_13

    .line 482
    .line 483
    const-string v0, "oldName"

    .line 484
    .line 485
    iget-object v1, p0, Lb5/c;->d:Ljava/lang/String;

    .line 486
    .line 487
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 488
    .line 489
    .line 490
    const-string v0, "newName"

    .line 491
    .line 492
    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 493
    .line 494
    .line 495
    iget-object v0, p1, Lcom/zykj/mistake/activity/MistakeDetailActivity;->k:Ljava/util/ArrayList;

    .line 496
    .line 497
    new-instance v5, Ljava/util/ArrayList;

    .line 498
    .line 499
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 500
    .line 501
    .line 502
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 503
    .line 504
    .line 505
    move-result v7

    .line 506
    move v8, v2

    .line 507
    :cond_c
    :goto_8
    const/4 v9, -0x1

    .line 508
    if-ge v8, v7, :cond_d

    .line 509
    .line 510
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v10

    .line 514
    add-int/lit8 v8, v8, 0x1

    .line 515
    .line 516
    move-object v11, v10

    .line 517
    check-cast v11, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 518
    .line 519
    invoke-virtual {v11}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 520
    .line 521
    .line 522
    move-result v12

    .line 523
    if-ne v12, v9, :cond_c

    .line 524
    .line 525
    invoke-virtual {v11}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 526
    .line 527
    .line 528
    move-result-wide v11

    .line 529
    cmp-long v9, v11, v3

    .line 530
    .line 531
    if-nez v9, :cond_c

    .line 532
    .line 533
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 534
    .line 535
    .line 536
    goto :goto_8

    .line 537
    :cond_d
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 538
    .line 539
    .line 540
    move-result v0

    .line 541
    move v7, v2

    .line 542
    :goto_9
    if-ge v7, v0, :cond_e

    .line 543
    .line 544
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 545
    .line 546
    .line 547
    move-result-object v8

    .line 548
    add-int/lit8 v7, v7, 0x1

    .line 549
    .line 550
    check-cast v8, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 551
    .line 552
    invoke-virtual {v8, v6}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->setName(Ljava/lang/String;)V

    .line 553
    .line 554
    .line 555
    goto :goto_9

    .line 556
    :cond_e
    iget-object v0, p1, Lcom/zykj/mistake/activity/MistakeDetailActivity;->i:Ljava/util/ArrayList;

    .line 557
    .line 558
    new-instance v5, Ljava/util/ArrayList;

    .line 559
    .line 560
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 561
    .line 562
    .line 563
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 564
    .line 565
    .line 566
    move-result v7

    .line 567
    move v8, v2

    .line 568
    :cond_f
    :goto_a
    if-ge v8, v7, :cond_10

    .line 569
    .line 570
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    move-result-object v10

    .line 574
    add-int/lit8 v8, v8, 0x1

    .line 575
    .line 576
    move-object v11, v10

    .line 577
    check-cast v11, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 578
    .line 579
    invoke-virtual {v11}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 580
    .line 581
    .line 582
    move-result v12

    .line 583
    if-ne v12, v9, :cond_f

    .line 584
    .line 585
    invoke-virtual {v11}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 586
    .line 587
    .line 588
    move-result-wide v11

    .line 589
    cmp-long v11, v11, v3

    .line 590
    .line 591
    if-nez v11, :cond_f

    .line 592
    .line 593
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 594
    .line 595
    .line 596
    goto :goto_a

    .line 597
    :cond_10
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 598
    .line 599
    .line 600
    move-result v0

    .line 601
    move v3, v2

    .line 602
    :goto_b
    if-ge v3, v0, :cond_11

    .line 603
    .line 604
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 605
    .line 606
    .line 607
    move-result-object v4

    .line 608
    add-int/lit8 v3, v3, 0x1

    .line 609
    .line 610
    check-cast v4, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 611
    .line 612
    invoke-virtual {v4, v6}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->setName(Ljava/lang/String;)V

    .line 613
    .line 614
    .line 615
    goto :goto_b

    .line 616
    :cond_11
    invoke-virtual {p1}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 617
    .line 618
    .line 619
    move-result-object v0

    .line 620
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;

    .line 621
    .line 622
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;->c:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 623
    .line 624
    iget-object v0, v0, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->d:Lcom/zykj/mistake/widget/FlowLayout;

    .line 625
    .line 626
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 627
    .line 628
    .line 629
    move-result v0

    .line 630
    :goto_c
    if-ge v2, v0, :cond_13

    .line 631
    .line 632
    invoke-virtual {p1}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 633
    .line 634
    .line 635
    move-result-object v3

    .line 636
    check-cast v3, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;

    .line 637
    .line 638
    iget-object v3, v3, Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;->c:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 639
    .line 640
    iget-object v3, v3, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->d:Lcom/zykj/mistake/widget/FlowLayout;

    .line 641
    .line 642
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 643
    .line 644
    .line 645
    move-result-object v3

    .line 646
    sget v4, Lcom/zykj/mistake/R$id;->tv_item_tag_content:I

    .line 647
    .line 648
    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 649
    .line 650
    .line 651
    move-result-object v3

    .line 652
    check-cast v3, Landroid/widget/TextView;

    .line 653
    .line 654
    invoke-virtual {v3}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 655
    .line 656
    .line 657
    move-result-object v4

    .line 658
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 659
    .line 660
    .line 661
    move-result v4

    .line 662
    if-eqz v4, :cond_12

    .line 663
    .line 664
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 665
    .line 666
    .line 667
    goto :goto_d

    .line 668
    :cond_12
    add-int/lit8 v2, v2, 0x1

    .line 669
    .line 670
    goto :goto_c

    .line 671
    :cond_13
    :goto_d
    return-void

    .line 672
    :pswitch_1
    check-cast p1, Lcom/zykj/mistake/entity/resp/CreateOrEditTagResp;

    .line 673
    .line 674
    iget-object v0, p0, Lb5/c;->e:Lcom/zykj/mistake/base/BasePresenter;

    .line 675
    .line 676
    check-cast v0, Lcom/zykj/mistake/presenter/MistakeCreateOrEditPresenter;

    .line 677
    .line 678
    const-string v1, "resp"

    .line 679
    .line 680
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 681
    .line 682
    .line 683
    const-wide/16 v1, 0x0

    .line 684
    .line 685
    iget-wide v3, p0, Lb5/c;->b:J

    .line 686
    .line 687
    cmp-long v1, v3, v1

    .line 688
    .line 689
    const/4 v2, 0x0

    .line 690
    iget-object v6, p0, Lb5/c;->c:Ljava/lang/String;

    .line 691
    .line 692
    if-nez v1, :cond_15

    .line 693
    .line 694
    iget-object v0, v0, Lcom/zykj/mistake/base/BasePresenter;->c:Ljava/lang/Object;

    .line 695
    .line 696
    check-cast v0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 697
    .line 698
    if-eqz v0, :cond_1d

    .line 699
    .line 700
    invoke-virtual {p1}, Lcom/zykj/mistake/entity/resp/CreateOrEditTagResp;->getResult()J

    .line 701
    .line 702
    .line 703
    move-result-wide v7

    .line 704
    const-string p1, "name"

    .line 705
    .line 706
    invoke-static {v6, p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 707
    .line 708
    .line 709
    new-instance v5, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 710
    .line 711
    const/16 v11, 0xc

    .line 712
    .line 713
    const/4 v12, 0x0

    .line 714
    const/4 v9, 0x0

    .line 715
    const/4 v10, 0x0

    .line 716
    invoke-direct/range {v5 .. v12}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;-><init>(Ljava/lang/String;JIIILkotlin/jvm/internal/e;)V

    .line 717
    .line 718
    .line 719
    iget-object p1, v0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->g:Ljava/util/ArrayList;

    .line 720
    .line 721
    invoke-virtual {p1, v2, v5}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 722
    .line 723
    .line 724
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 725
    .line 726
    .line 727
    move-result-object p1

    .line 728
    check-cast p1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    .line 729
    .line 730
    iget-object p1, p1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->i:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 731
    .line 732
    iget-object p1, p1, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->d:Lcom/zykj/mistake/widget/FlowLayout;

    .line 733
    .line 734
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 735
    .line 736
    .line 737
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 738
    .line 739
    .line 740
    move-result-object p1

    .line 741
    check-cast p1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    .line 742
    .line 743
    iget-object p1, p1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->i:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 744
    .line 745
    iget-object p1, p1, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->d:Lcom/zykj/mistake/widget/FlowLayout;

    .line 746
    .line 747
    iget-object v1, v0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->h:Ljava/util/ArrayList;

    .line 748
    .line 749
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 750
    .line 751
    .line 752
    move-result v3

    .line 753
    iget v4, v0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->i:I

    .line 754
    .line 755
    if-ge v3, v4, :cond_14

    .line 756
    .line 757
    const/4 v3, 0x1

    .line 758
    goto :goto_e

    .line 759
    :cond_14
    move v3, v2

    .line 760
    :goto_e
    const/4 v6, 0x4

    .line 761
    invoke-static {v0, v5, v3, v6}, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->v(Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;Lcom/zykj/mistake/entity/resp/CustomTagInfo;ZI)Landroid/view/View;

    .line 762
    .line 763
    .line 764
    move-result-object v3

    .line 765
    invoke-virtual {p1, v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 766
    .line 767
    .line 768
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 769
    .line 770
    .line 771
    move-result-object p1

    .line 772
    check-cast p1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    .line 773
    .line 774
    iget-object p1, p1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->i:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 775
    .line 776
    iget-object p1, p1, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->d:Lcom/zykj/mistake/widget/FlowLayout;

    .line 777
    .line 778
    new-instance v6, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 779
    .line 780
    const/16 v12, 0xf

    .line 781
    .line 782
    const/4 v13, 0x0

    .line 783
    const/4 v7, 0x0

    .line 784
    const-wide/16 v8, 0x0

    .line 785
    .line 786
    const/4 v10, 0x0

    .line 787
    const/4 v11, 0x0

    .line 788
    invoke-direct/range {v6 .. v13}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;-><init>(Ljava/lang/String;JIIILkotlin/jvm/internal/e;)V

    .line 789
    .line 790
    .line 791
    const/4 v3, 0x2

    .line 792
    invoke-static {v0, v6, v2, v3}, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->v(Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;Lcom/zykj/mistake/entity/resp/CustomTagInfo;ZI)Landroid/view/View;

    .line 793
    .line 794
    .line 795
    move-result-object v0

    .line 796
    invoke-virtual {p1, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 797
    .line 798
    .line 799
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 800
    .line 801
    .line 802
    move-result p1

    .line 803
    if-ge p1, v4, :cond_1d

    .line 804
    .line 805
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 806
    .line 807
    .line 808
    goto/16 :goto_14

    .line 809
    .line 810
    :cond_15
    iget-object p1, v0, Lcom/zykj/mistake/base/BasePresenter;->c:Ljava/lang/Object;

    .line 811
    .line 812
    check-cast p1, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 813
    .line 814
    if-eqz p1, :cond_1d

    .line 815
    .line 816
    const-string v0, "oldName"

    .line 817
    .line 818
    iget-object v1, p0, Lb5/c;->d:Ljava/lang/String;

    .line 819
    .line 820
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 821
    .line 822
    .line 823
    const-string v0, "newName"

    .line 824
    .line 825
    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 826
    .line 827
    .line 828
    iget-object v0, p1, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->g:Ljava/util/ArrayList;

    .line 829
    .line 830
    new-instance v5, Ljava/util/ArrayList;

    .line 831
    .line 832
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 833
    .line 834
    .line 835
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 836
    .line 837
    .line 838
    move-result v7

    .line 839
    move v8, v2

    .line 840
    :cond_16
    :goto_f
    const/4 v9, -0x1

    .line 841
    if-ge v8, v7, :cond_17

    .line 842
    .line 843
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 844
    .line 845
    .line 846
    move-result-object v10

    .line 847
    add-int/lit8 v8, v8, 0x1

    .line 848
    .line 849
    move-object v11, v10

    .line 850
    check-cast v11, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 851
    .line 852
    invoke-virtual {v11}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 853
    .line 854
    .line 855
    move-result-wide v12

    .line 856
    cmp-long v12, v12, v3

    .line 857
    .line 858
    if-nez v12, :cond_16

    .line 859
    .line 860
    invoke-virtual {v11}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 861
    .line 862
    .line 863
    move-result v11

    .line 864
    if-ne v11, v9, :cond_16

    .line 865
    .line 866
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 867
    .line 868
    .line 869
    goto :goto_f

    .line 870
    :cond_17
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 871
    .line 872
    .line 873
    move-result v0

    .line 874
    move v7, v2

    .line 875
    :goto_10
    if-ge v7, v0, :cond_18

    .line 876
    .line 877
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 878
    .line 879
    .line 880
    move-result-object v8

    .line 881
    add-int/lit8 v7, v7, 0x1

    .line 882
    .line 883
    check-cast v8, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 884
    .line 885
    invoke-virtual {v8, v6}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->setName(Ljava/lang/String;)V

    .line 886
    .line 887
    .line 888
    goto :goto_10

    .line 889
    :cond_18
    iget-object v0, p1, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->h:Ljava/util/ArrayList;

    .line 890
    .line 891
    new-instance v5, Ljava/util/ArrayList;

    .line 892
    .line 893
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 894
    .line 895
    .line 896
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 897
    .line 898
    .line 899
    move-result v7

    .line 900
    move v8, v2

    .line 901
    :cond_19
    :goto_11
    if-ge v8, v7, :cond_1a

    .line 902
    .line 903
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 904
    .line 905
    .line 906
    move-result-object v10

    .line 907
    add-int/lit8 v8, v8, 0x1

    .line 908
    .line 909
    move-object v11, v10

    .line 910
    check-cast v11, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 911
    .line 912
    invoke-virtual {v11}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 913
    .line 914
    .line 915
    move-result-wide v12

    .line 916
    cmp-long v12, v12, v3

    .line 917
    .line 918
    if-nez v12, :cond_19

    .line 919
    .line 920
    invoke-virtual {v11}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 921
    .line 922
    .line 923
    move-result v11

    .line 924
    if-ne v11, v9, :cond_19

    .line 925
    .line 926
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 927
    .line 928
    .line 929
    goto :goto_11

    .line 930
    :cond_1a
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 931
    .line 932
    .line 933
    move-result v0

    .line 934
    move v3, v2

    .line 935
    :goto_12
    if-ge v3, v0, :cond_1b

    .line 936
    .line 937
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 938
    .line 939
    .line 940
    move-result-object v4

    .line 941
    add-int/lit8 v3, v3, 0x1

    .line 942
    .line 943
    check-cast v4, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 944
    .line 945
    invoke-virtual {v4, v6}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->setName(Ljava/lang/String;)V

    .line 946
    .line 947
    .line 948
    goto :goto_12

    .line 949
    :cond_1b
    invoke-virtual {p1}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 950
    .line 951
    .line 952
    move-result-object v0

    .line 953
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    .line 954
    .line 955
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->i:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 956
    .line 957
    iget-object v0, v0, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->d:Lcom/zykj/mistake/widget/FlowLayout;

    .line 958
    .line 959
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 960
    .line 961
    .line 962
    move-result v0

    .line 963
    :goto_13
    if-ge v2, v0, :cond_1d

    .line 964
    .line 965
    invoke-virtual {p1}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 966
    .line 967
    .line 968
    move-result-object v3

    .line 969
    check-cast v3, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    .line 970
    .line 971
    iget-object v3, v3, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->i:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 972
    .line 973
    iget-object v3, v3, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->d:Lcom/zykj/mistake/widget/FlowLayout;

    .line 974
    .line 975
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 976
    .line 977
    .line 978
    move-result-object v3

    .line 979
    sget v4, Lcom/zykj/mistake/R$id;->tv_item_tag_content:I

    .line 980
    .line 981
    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 982
    .line 983
    .line 984
    move-result-object v3

    .line 985
    check-cast v3, Landroid/widget/TextView;

    .line 986
    .line 987
    invoke-virtual {v3}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 988
    .line 989
    .line 990
    move-result-object v4

    .line 991
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 992
    .line 993
    .line 994
    move-result v4

    .line 995
    if-eqz v4, :cond_1c

    .line 996
    .line 997
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 998
    .line 999
    .line 1000
    goto :goto_14

    .line 1001
    :cond_1c
    add-int/lit8 v2, v2, 0x1

    .line 1002
    .line 1003
    goto :goto_13

    .line 1004
    :cond_1d
    :goto_14
    return-void

    .line 1005
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
