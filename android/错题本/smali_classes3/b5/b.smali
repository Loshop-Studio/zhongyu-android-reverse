.class public final Lb5/b;
.super La/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/mistake/presenter/MistakeCreateOrEditPresenter;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/presenter/MistakeCreateOrEditPresenter;I)V
    .locals 0

    .line 1
    iput p2, p0, Lb5/b;->a:I

    iput-object p1, p0, Lb5/b;->b:Lcom/zykj/mistake/presenter/MistakeCreateOrEditPresenter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final m(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget v0, p0, Lb5/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "e"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lb5/b;->b:Lcom/zykj/mistake/presenter/MistakeCreateOrEditPresenter;

    .line 12
    .line 13
    iget-object v0, v0, Lcom/zykj/mistake/base/BasePresenter;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lcom/zykj/mistake/base/BaseMVPActivity;->b(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void

    .line 23
    :pswitch_0
    const-string v0, "e"

    .line 24
    .line 25
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lb5/b;->b:Lcom/zykj/mistake/presenter/MistakeCreateOrEditPresenter;

    .line 29
    .line 30
    iget-object v0, v0, Lcom/zykj/mistake/base/BasePresenter;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    invoke-virtual {v0, p1}, Lcom/zykj/mistake/base/BaseMVPActivity;->b(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    return-void

    .line 40
    :pswitch_1
    const-string v0, "e"

    .line 41
    .line 42
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lb5/b;->b:Lcom/zykj/mistake/presenter/MistakeCreateOrEditPresenter;

    .line 46
    .line 47
    iget-object v0, v0, Lcom/zykj/mistake/base/BasePresenter;->c:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 50
    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseMVPActivity;->c()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    .line 61
    .line 62
    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->b:Landroid/widget/TextView;

    .line 63
    .line 64
    const/4 v2, 0x1

    .line 65
    invoke-virtual {v1, v2}, Landroid/view/View;->setClickable(Z)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, p1}, Lcom/zykj/mistake/base/BaseMVPActivity;->b(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    :cond_2
    return-void

    .line 72
    :pswitch_2
    const-string v0, "e"

    .line 73
    .line 74
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    iget-object v0, p0, Lb5/b;->b:Lcom/zykj/mistake/presenter/MistakeCreateOrEditPresenter;

    .line 78
    .line 79
    iget-object v0, v0, Lcom/zykj/mistake/base/BasePresenter;->c:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 82
    .line 83
    if-eqz v0, :cond_3

    .line 84
    .line 85
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseMVPActivity;->c()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    .line 93
    .line 94
    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->b:Landroid/widget/TextView;

    .line 95
    .line 96
    const/4 v2, 0x1

    .line 97
    invoke-virtual {v1, v2}, Landroid/view/View;->setClickable(Z)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, p1}, Lcom/zykj/mistake/base/BaseMVPActivity;->b(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    :cond_3
    return-void

    .line 104
    :pswitch_3
    const-string v0, "e"

    .line 105
    .line 106
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    iget-object v0, p0, Lb5/b;->b:Lcom/zykj/mistake/presenter/MistakeCreateOrEditPresenter;

    .line 110
    .line 111
    iget-object v0, v0, Lcom/zykj/mistake/base/BasePresenter;->c:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 114
    .line 115
    if-eqz v0, :cond_4

    .line 116
    .line 117
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseMVPActivity;->c()V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    check-cast v1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    .line 125
    .line 126
    iget-object v1, v1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->b:Landroid/widget/TextView;

    .line 127
    .line 128
    const/4 v2, 0x1

    .line 129
    invoke-virtual {v1, v2}, Landroid/view/View;->setClickable(Z)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, p1}, Lcom/zykj/mistake/base/BaseMVPActivity;->b(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    :cond_4
    return-void

    .line 136
    :pswitch_4
    const-string v0, "e"

    .line 137
    .line 138
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    iget-object p1, p0, Lb5/b;->b:Lcom/zykj/mistake/presenter/MistakeCreateOrEditPresenter;

    .line 142
    .line 143
    iget-object p1, p1, Lcom/zykj/mistake/base/BasePresenter;->c:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast p1, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 146
    .line 147
    return-void

    .line 148
    nop

    .line 149
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Ljava/lang/Object;)V
    .locals 14

    .line 1
    iget v0, p0, Lb5/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lcom/zykj/mistake/entity/resp/GetMyTagResp;

    .line 7
    .line 8
    const-string v0, "resp"

    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lb5/b;->b:Lcom/zykj/mistake/presenter/MistakeCreateOrEditPresenter;

    .line 14
    .line 15
    iget-object v0, v0, Lcom/zykj/mistake/base/BasePresenter;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 18
    .line 19
    if-eqz v0, :cond_17

    .line 20
    .line 21
    iget-object v1, v0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->g:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/zykj/mistake/entity/resp/GetMyTagResp;->getResult()Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    .line 40
    .line 41
    iget-object p1, p1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->i:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 42
    .line 43
    iget-object p1, p1, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->d:Lcom/zykj/mistake/widget/FlowLayout;

    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    check-cast p1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    .line 53
    .line 54
    iget-object p1, p1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->i:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 55
    .line 56
    iget-object p1, p1, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->d:Lcom/zykj/mistake/widget/FlowLayout;

    .line 57
    .line 58
    new-instance v2, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 59
    .line 60
    const/16 v8, 0xf

    .line 61
    .line 62
    const/4 v9, 0x0

    .line 63
    const/4 v3, 0x0

    .line 64
    const-wide/16 v4, 0x0

    .line 65
    .line 66
    const/4 v6, 0x0

    .line 67
    const/4 v7, 0x0

    .line 68
    invoke-direct/range {v2 .. v9}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;-><init>(Ljava/lang/String;JIIILkotlin/jvm/internal/e;)V

    .line 69
    .line 70
    .line 71
    const/4 v3, 0x0

    .line 72
    const/4 v4, 0x2

    .line 73
    invoke-static {v0, v2, v3, v4}, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->v(Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;Lcom/zykj/mistake/entity/resp/CustomTagInfo;ZI)Landroid/view/View;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    move v2, v3

    .line 85
    :goto_0
    if-ge v2, p1, :cond_1

    .line 86
    .line 87
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    add-int/lit8 v2, v2, 0x1

    .line 92
    .line 93
    check-cast v5, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 94
    .line 95
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    check-cast v6, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    .line 100
    .line 101
    iget-object v6, v6, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->i:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 102
    .line 103
    iget-object v6, v6, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->d:Lcom/zykj/mistake/widget/FlowLayout;

    .line 104
    .line 105
    const/4 v7, 0x6

    .line 106
    invoke-static {v0, v5, v3, v7}, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->v(Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;Lcom/zykj/mistake/entity/resp/CustomTagInfo;ZI)Landroid/view/View;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    invoke-virtual {v6, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_1
    iget-object p1, v0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->h:Ljava/util/ArrayList;

    .line 115
    .line 116
    iget-object v2, v0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->f:Ljava/util/ArrayList;

    .line 117
    .line 118
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    check-cast v5, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    .line 123
    .line 124
    iget-object v5, v5, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->i:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 125
    .line 126
    iget-object v5, v5, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->e:Lcom/zykj/mistake/widget/FlowLayout;

    .line 127
    .line 128
    invoke-virtual {v5}, Landroid/view/ViewGroup;->getChildCount()I

    .line 129
    .line 130
    .line 131
    move-result v5

    .line 132
    move v6, v3

    .line 133
    :goto_1
    const/4 v7, 0x1

    .line 134
    if-ge v6, v5, :cond_5

    .line 135
    .line 136
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 137
    .line 138
    .line 139
    move-result-object v8

    .line 140
    check-cast v8, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    .line 141
    .line 142
    iget-object v8, v8, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->i:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 143
    .line 144
    iget-object v8, v8, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->e:Lcom/zykj/mistake/widget/FlowLayout;

    .line 145
    .line 146
    invoke-virtual {v8, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 147
    .line 148
    .line 149
    move-result-object v8

    .line 150
    sget v9, Lcom/zykj/mistake/R$id;->tv_item_tag_content:I

    .line 151
    .line 152
    invoke-virtual {v8, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 153
    .line 154
    .line 155
    move-result-object v9

    .line 156
    check-cast v9, Landroid/widget/TextView;

    .line 157
    .line 158
    invoke-virtual {v9}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 159
    .line 160
    .line 161
    move-result-object v9

    .line 162
    if-eqz v2, :cond_3

    .line 163
    .line 164
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 165
    .line 166
    .line 167
    move-result v10

    .line 168
    if-eqz v10, :cond_3

    .line 169
    .line 170
    :cond_2
    move v7, v3

    .line 171
    goto :goto_2

    .line 172
    :cond_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 173
    .line 174
    .line 175
    move-result v10

    .line 176
    move v11, v3

    .line 177
    :cond_4
    if-ge v11, v10, :cond_2

    .line 178
    .line 179
    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v12

    .line 183
    add-int/lit8 v11, v11, 0x1

    .line 184
    .line 185
    check-cast v12, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 186
    .line 187
    invoke-virtual {v12}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 188
    .line 189
    .line 190
    move-result v13

    .line 191
    if-nez v13, :cond_4

    .line 192
    .line 193
    invoke-virtual {v12}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getName()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v12

    .line 197
    invoke-static {v12, v9}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v12

    .line 201
    if-eqz v12, :cond_4

    .line 202
    .line 203
    :goto_2
    invoke-virtual {v8, v7}, Landroid/view/View;->setSelected(Z)V

    .line 204
    .line 205
    .line 206
    add-int/lit8 v6, v6, 0x1

    .line 207
    .line 208
    goto :goto_1

    .line 209
    :cond_5
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 210
    .line 211
    .line 212
    move-result-object v5

    .line 213
    check-cast v5, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    .line 214
    .line 215
    iget-object v5, v5, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->i:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 216
    .line 217
    iget-object v5, v5, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->f:Lcom/zykj/mistake/widget/FlowLayout;

    .line 218
    .line 219
    invoke-virtual {v5}, Landroid/view/ViewGroup;->getChildCount()I

    .line 220
    .line 221
    .line 222
    move-result v5

    .line 223
    move v6, v3

    .line 224
    :goto_3
    if-ge v6, v5, :cond_9

    .line 225
    .line 226
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 227
    .line 228
    .line 229
    move-result-object v8

    .line 230
    check-cast v8, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    .line 231
    .line 232
    iget-object v8, v8, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->i:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 233
    .line 234
    iget-object v8, v8, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->f:Lcom/zykj/mistake/widget/FlowLayout;

    .line 235
    .line 236
    invoke-virtual {v8, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 237
    .line 238
    .line 239
    move-result-object v8

    .line 240
    sget v9, Lcom/zykj/mistake/R$id;->tv_item_tag_content:I

    .line 241
    .line 242
    invoke-virtual {v8, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 243
    .line 244
    .line 245
    move-result-object v9

    .line 246
    check-cast v9, Landroid/widget/TextView;

    .line 247
    .line 248
    invoke-virtual {v9}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 249
    .line 250
    .line 251
    move-result-object v9

    .line 252
    if-eqz v2, :cond_7

    .line 253
    .line 254
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 255
    .line 256
    .line 257
    move-result v10

    .line 258
    if-eqz v10, :cond_7

    .line 259
    .line 260
    :cond_6
    move v9, v3

    .line 261
    goto :goto_4

    .line 262
    :cond_7
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 263
    .line 264
    .line 265
    move-result v10

    .line 266
    move v11, v3

    .line 267
    :cond_8
    if-ge v11, v10, :cond_6

    .line 268
    .line 269
    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v12

    .line 273
    add-int/lit8 v11, v11, 0x1

    .line 274
    .line 275
    check-cast v12, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 276
    .line 277
    invoke-virtual {v12}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 278
    .line 279
    .line 280
    move-result v13

    .line 281
    if-ne v13, v7, :cond_8

    .line 282
    .line 283
    invoke-virtual {v12}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getName()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v12

    .line 287
    invoke-static {v12, v9}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    move-result v12

    .line 291
    if-eqz v12, :cond_8

    .line 292
    .line 293
    move v9, v7

    .line 294
    :goto_4
    invoke-virtual {v8, v9}, Landroid/view/View;->setSelected(Z)V

    .line 295
    .line 296
    .line 297
    add-int/lit8 v6, v6, 0x1

    .line 298
    .line 299
    goto :goto_3

    .line 300
    :cond_9
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 301
    .line 302
    .line 303
    move-result-object v5

    .line 304
    check-cast v5, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    .line 305
    .line 306
    iget-object v5, v5, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->i:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 307
    .line 308
    iget-object v5, v5, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->g:Lcom/zykj/mistake/widget/FlowLayout;

    .line 309
    .line 310
    invoke-virtual {v5}, Landroid/view/ViewGroup;->getChildCount()I

    .line 311
    .line 312
    .line 313
    move-result v5

    .line 314
    move v6, v3

    .line 315
    :goto_5
    if-ge v6, v5, :cond_d

    .line 316
    .line 317
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 318
    .line 319
    .line 320
    move-result-object v8

    .line 321
    check-cast v8, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    .line 322
    .line 323
    iget-object v8, v8, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->i:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 324
    .line 325
    iget-object v8, v8, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->g:Lcom/zykj/mistake/widget/FlowLayout;

    .line 326
    .line 327
    invoke-virtual {v8, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 328
    .line 329
    .line 330
    move-result-object v8

    .line 331
    sget v9, Lcom/zykj/mistake/R$id;->tv_item_tag_content:I

    .line 332
    .line 333
    invoke-virtual {v8, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 334
    .line 335
    .line 336
    move-result-object v9

    .line 337
    check-cast v9, Landroid/widget/TextView;

    .line 338
    .line 339
    invoke-virtual {v9}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 340
    .line 341
    .line 342
    move-result-object v9

    .line 343
    if-eqz v2, :cond_b

    .line 344
    .line 345
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 346
    .line 347
    .line 348
    move-result v10

    .line 349
    if-eqz v10, :cond_b

    .line 350
    .line 351
    :cond_a
    move v9, v3

    .line 352
    goto :goto_6

    .line 353
    :cond_b
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 354
    .line 355
    .line 356
    move-result v10

    .line 357
    move v11, v3

    .line 358
    :cond_c
    if-ge v11, v10, :cond_a

    .line 359
    .line 360
    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v12

    .line 364
    add-int/lit8 v11, v11, 0x1

    .line 365
    .line 366
    check-cast v12, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 367
    .line 368
    invoke-virtual {v12}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 369
    .line 370
    .line 371
    move-result v13

    .line 372
    if-ne v13, v4, :cond_c

    .line 373
    .line 374
    invoke-virtual {v12}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getName()Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v12

    .line 378
    invoke-static {v12, v9}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 379
    .line 380
    .line 381
    move-result v12

    .line 382
    if-eqz v12, :cond_c

    .line 383
    .line 384
    move v9, v7

    .line 385
    :goto_6
    invoke-virtual {v8, v9}, Landroid/view/View;->setSelected(Z)V

    .line 386
    .line 387
    .line 388
    add-int/lit8 v6, v6, 0x1

    .line 389
    .line 390
    goto :goto_5

    .line 391
    :cond_d
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 392
    .line 393
    .line 394
    move-result-object v4

    .line 395
    check-cast v4, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    .line 396
    .line 397
    iget-object v4, v4, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->i:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 398
    .line 399
    iget-object v4, v4, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->d:Lcom/zykj/mistake/widget/FlowLayout;

    .line 400
    .line 401
    invoke-virtual {v4}, Landroid/view/ViewGroup;->getChildCount()I

    .line 402
    .line 403
    .line 404
    move-result v4

    .line 405
    move v5, v3

    .line 406
    :goto_7
    if-ge v5, v4, :cond_11

    .line 407
    .line 408
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 409
    .line 410
    .line 411
    move-result-object v6

    .line 412
    check-cast v6, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    .line 413
    .line 414
    iget-object v6, v6, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->i:Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;

    .line 415
    .line 416
    iget-object v6, v6, Lcom/zykj/mistake/databinding/IncludeMistakeDetailEndBinding;->d:Lcom/zykj/mistake/widget/FlowLayout;

    .line 417
    .line 418
    invoke-virtual {v6, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 419
    .line 420
    .line 421
    move-result-object v6

    .line 422
    sget v8, Lcom/zykj/mistake/R$id;->tv_item_tag_content:I

    .line 423
    .line 424
    invoke-virtual {v6, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 425
    .line 426
    .line 427
    move-result-object v8

    .line 428
    check-cast v8, Landroid/widget/TextView;

    .line 429
    .line 430
    invoke-virtual {v8}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 431
    .line 432
    .line 433
    move-result-object v8

    .line 434
    if-eqz v2, :cond_f

    .line 435
    .line 436
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 437
    .line 438
    .line 439
    move-result v9

    .line 440
    if-eqz v9, :cond_f

    .line 441
    .line 442
    :cond_e
    move v8, v3

    .line 443
    goto :goto_8

    .line 444
    :cond_f
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 445
    .line 446
    .line 447
    move-result v9

    .line 448
    move v10, v3

    .line 449
    :cond_10
    if-ge v10, v9, :cond_e

    .line 450
    .line 451
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v11

    .line 455
    add-int/lit8 v10, v10, 0x1

    .line 456
    .line 457
    check-cast v11, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 458
    .line 459
    invoke-virtual {v11}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getLocalType()I

    .line 460
    .line 461
    .line 462
    move-result v12

    .line 463
    const/4 v13, -0x1

    .line 464
    if-ne v12, v13, :cond_10

    .line 465
    .line 466
    invoke-virtual {v11}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getName()Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object v11

    .line 470
    invoke-static {v11, v8}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 471
    .line 472
    .line 473
    move-result v11

    .line 474
    if-eqz v11, :cond_10

    .line 475
    .line 476
    move v8, v7

    .line 477
    :goto_8
    invoke-virtual {v6, v8}, Landroid/view/View;->setSelected(Z)V

    .line 478
    .line 479
    .line 480
    add-int/lit8 v5, v5, 0x1

    .line 481
    .line 482
    goto :goto_7

    .line 483
    :cond_11
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 484
    .line 485
    .line 486
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 487
    .line 488
    .line 489
    move-result v4

    .line 490
    move v5, v3

    .line 491
    :cond_12
    :goto_9
    if-ge v5, v4, :cond_16

    .line 492
    .line 493
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object v6

    .line 497
    add-int/lit8 v5, v5, 0x1

    .line 498
    .line 499
    check-cast v6, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 500
    .line 501
    invoke-static {v6}, Lcom/zykj/mistake/entity/resp/CustomTagInfoKt;->isSystemTag(Lcom/zykj/mistake/entity/resp/CustomTagInfo;)Z

    .line 502
    .line 503
    .line 504
    move-result v7

    .line 505
    if-nez v7, :cond_15

    .line 506
    .line 507
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 508
    .line 509
    .line 510
    move-result v7

    .line 511
    if-eqz v7, :cond_13

    .line 512
    .line 513
    goto :goto_9

    .line 514
    :cond_13
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 515
    .line 516
    .line 517
    move-result v7

    .line 518
    move v8, v3

    .line 519
    :cond_14
    if-ge v8, v7, :cond_12

    .line 520
    .line 521
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v9

    .line 525
    add-int/lit8 v8, v8, 0x1

    .line 526
    .line 527
    check-cast v9, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 528
    .line 529
    invoke-virtual {v9}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 530
    .line 531
    .line 532
    move-result-wide v9

    .line 533
    invoke-virtual {v6}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 534
    .line 535
    .line 536
    move-result-wide v11

    .line 537
    cmp-long v9, v9, v11

    .line 538
    .line 539
    if-nez v9, :cond_14

    .line 540
    .line 541
    :cond_15
    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 542
    .line 543
    .line 544
    goto :goto_9

    .line 545
    :cond_16
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 546
    .line 547
    .line 548
    move-result-object p1

    .line 549
    check-cast p1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    .line 550
    .line 551
    iget-object p1, p1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->c:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 552
    .line 553
    const v0, 0x800005

    .line 554
    .line 555
    .line 556
    invoke-virtual {p1, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->openDrawer(I)V

    .line 557
    .line 558
    .line 559
    :cond_17
    return-void

    .line 560
    :pswitch_0
    check-cast p1, Lcom/zykj/mistake/entity/resp/SubjectResp;

    .line 561
    .line 562
    const-string v0, "resp"

    .line 563
    .line 564
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 565
    .line 566
    .line 567
    iget-object v0, p0, Lb5/b;->b:Lcom/zykj/mistake/presenter/MistakeCreateOrEditPresenter;

    .line 568
    .line 569
    iget-object v0, v0, Lcom/zykj/mistake/base/BasePresenter;->c:Ljava/lang/Object;

    .line 570
    .line 571
    check-cast v0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 572
    .line 573
    if-eqz v0, :cond_1d

    .line 574
    .line 575
    iget-object v1, v0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->e:Ljava/util/ArrayList;

    .line 576
    .line 577
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 578
    .line 579
    .line 580
    invoke-virtual {p1}, Lcom/zykj/mistake/entity/resp/SubjectResp;->getResult()Ljava/util/List;

    .line 581
    .line 582
    .line 583
    move-result-object p1

    .line 584
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 585
    .line 586
    .line 587
    const-string p1, "zykjMistake"

    .line 588
    .line 589
    const/4 v2, 0x0

    .line 590
    invoke-virtual {v0, p1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 591
    .line 592
    .line 593
    move-result-object p1

    .line 594
    const-string v3, "SP_SUBJECT_ID"

    .line 595
    .line 596
    const-wide/16 v4, -0x1

    .line 597
    .line 598
    invoke-interface {p1, v3, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 599
    .line 600
    .line 601
    move-result-wide v6

    .line 602
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 603
    .line 604
    .line 605
    move-result-object p1

    .line 606
    cmp-long v3, v6, v4

    .line 607
    .line 608
    if-eqz v3, :cond_18

    .line 609
    .line 610
    goto :goto_a

    .line 611
    :cond_18
    const/4 p1, 0x0

    .line 612
    :goto_a
    iget-object v3, v0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->o:Lcom/zykj/mistake/entity/EditMistakeData;

    .line 613
    .line 614
    if-eqz v3, :cond_19

    .line 615
    .line 616
    invoke-virtual {v3}, Lcom/zykj/mistake/entity/EditMistakeData;->getTopicId()J

    .line 617
    .line 618
    .line 619
    move-result-wide v3

    .line 620
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 621
    .line 622
    .line 623
    move-result-object p1

    .line 624
    :cond_19
    if-eqz p1, :cond_1b

    .line 625
    .line 626
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 627
    .line 628
    .line 629
    move-result-wide v3

    .line 630
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 631
    .line 632
    .line 633
    move-result p1

    .line 634
    move v5, v2

    .line 635
    :goto_b
    if-ge v5, p1, :cond_1b

    .line 636
    .line 637
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 638
    .line 639
    .line 640
    move-result-object v6

    .line 641
    check-cast v6, Lcom/zykj/mistake/entity/resp/SubjectResp$Subject;

    .line 642
    .line 643
    invoke-virtual {v6}, Lcom/zykj/mistake/entity/resp/SubjectResp$Subject;->getId()J

    .line 644
    .line 645
    .line 646
    move-result-wide v6

    .line 647
    cmp-long v6, v6, v3

    .line 648
    .line 649
    if-nez v6, :cond_1a

    .line 650
    .line 651
    goto :goto_c

    .line 652
    :cond_1a
    add-int/lit8 v5, v5, 0x1

    .line 653
    .line 654
    goto :goto_b

    .line 655
    :cond_1b
    move v5, v2

    .line 656
    :goto_c
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 657
    .line 658
    .line 659
    move-result-object p1

    .line 660
    check-cast p1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    .line 661
    .line 662
    iget-object p1, p1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->t:Lorg/angmarch/views/NiceSpinner;

    .line 663
    .line 664
    new-instance v3, Ljava/util/ArrayList;

    .line 665
    .line 666
    const/16 v4, 0xa

    .line 667
    .line 668
    invoke-static {v1, v4}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 669
    .line 670
    .line 671
    move-result v4

    .line 672
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 673
    .line 674
    .line 675
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 676
    .line 677
    .line 678
    move-result v4

    .line 679
    :goto_d
    if-ge v2, v4, :cond_1c

    .line 680
    .line 681
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 682
    .line 683
    .line 684
    move-result-object v6

    .line 685
    add-int/lit8 v2, v2, 0x1

    .line 686
    .line 687
    check-cast v6, Lcom/zykj/mistake/entity/resp/SubjectResp$Subject;

    .line 688
    .line 689
    invoke-virtual {v6}, Lcom/zykj/mistake/entity/resp/SubjectResp$Subject;->getContent()Ljava/lang/String;

    .line 690
    .line 691
    .line 692
    move-result-object v6

    .line 693
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 694
    .line 695
    .line 696
    goto :goto_d

    .line 697
    :cond_1c
    invoke-virtual {p1, v3}, Lorg/angmarch/views/NiceSpinner;->d(Ljava/util/List;)V

    .line 698
    .line 699
    .line 700
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 701
    .line 702
    .line 703
    move-result p1

    .line 704
    if-nez p1, :cond_1d

    .line 705
    .line 706
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 707
    .line 708
    .line 709
    move-result-object p1

    .line 710
    check-cast p1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    .line 711
    .line 712
    iget-object p1, p1, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->t:Lorg/angmarch/views/NiceSpinner;

    .line 713
    .line 714
    invoke-virtual {p1, v5}, Lorg/angmarch/views/NiceSpinner;->setSelectedIndex(I)V

    .line 715
    .line 716
    .line 717
    :cond_1d
    return-void

    .line 718
    :pswitch_1
    check-cast p1, Lcom/zykj/mistake/network/ApiResp;

    .line 719
    .line 720
    const-string v0, "resp"

    .line 721
    .line 722
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 723
    .line 724
    .line 725
    iget-object p1, p0, Lb5/b;->b:Lcom/zykj/mistake/presenter/MistakeCreateOrEditPresenter;

    .line 726
    .line 727
    iget-object p1, p1, Lcom/zykj/mistake/base/BasePresenter;->c:Ljava/lang/Object;

    .line 728
    .line 729
    check-cast p1, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 730
    .line 731
    if-eqz p1, :cond_1e

    .line 732
    .line 733
    invoke-virtual {p1}, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->A()V

    .line 734
    .line 735
    .line 736
    :cond_1e
    return-void

    .line 737
    :pswitch_2
    check-cast p1, Lcom/zykj/mistake/network/ApiResp;

    .line 738
    .line 739
    const-string v0, "resp"

    .line 740
    .line 741
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 742
    .line 743
    .line 744
    iget-object p1, p0, Lb5/b;->b:Lcom/zykj/mistake/presenter/MistakeCreateOrEditPresenter;

    .line 745
    .line 746
    iget-object p1, p1, Lcom/zykj/mistake/base/BasePresenter;->c:Ljava/lang/Object;

    .line 747
    .line 748
    check-cast p1, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 749
    .line 750
    if-eqz p1, :cond_1f

    .line 751
    .line 752
    invoke-virtual {p1}, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->A()V

    .line 753
    .line 754
    .line 755
    :cond_1f
    return-void

    .line 756
    :pswitch_3
    check-cast p1, Lcom/zykj/mistake/network/ApiResp;

    .line 757
    .line 758
    const-string v0, "resp"

    .line 759
    .line 760
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 761
    .line 762
    .line 763
    iget-object p1, p0, Lb5/b;->b:Lcom/zykj/mistake/presenter/MistakeCreateOrEditPresenter;

    .line 764
    .line 765
    iget-object p1, p1, Lcom/zykj/mistake/base/BasePresenter;->c:Ljava/lang/Object;

    .line 766
    .line 767
    check-cast p1, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 768
    .line 769
    if-eqz p1, :cond_20

    .line 770
    .line 771
    invoke-virtual {p1}, Lcom/zykj/mistake/base/BaseMVPActivity;->c()V

    .line 772
    .line 773
    .line 774
    invoke-virtual {p1}, Lcom/zykj/mistake/base/BaseActivity;->p()Landroidx/databinding/ViewDataBinding;

    .line 775
    .line 776
    .line 777
    move-result-object v0

    .line 778
    check-cast v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;

    .line 779
    .line 780
    iget-object v0, v0, Lcom/zykj/mistake/databinding/ActivityMistakeCreateOrEditBinding;->b:Landroid/widget/TextView;

    .line 781
    .line 782
    const/4 v1, 0x1

    .line 783
    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 784
    .line 785
    .line 786
    sget v0, Lcom/zykj/mistake/R$string;->create_mistake_success:I

    .line 787
    .line 788
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 789
    .line 790
    .line 791
    move-result-object v0

    .line 792
    const-string v1, "getString(...)"

    .line 793
    .line 794
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 795
    .line 796
    .line 797
    invoke-virtual {p1, v0}, Lcom/zykj/mistake/base/BaseMVPActivity;->b(Ljava/lang/String;)V

    .line 798
    .line 799
    .line 800
    const/4 v0, -0x1

    .line 801
    invoke-virtual {p1, v0}, Landroid/app/Activity;->setResult(I)V

    .line 802
    .line 803
    .line 804
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 805
    .line 806
    .line 807
    :cond_20
    return-void

    .line 808
    :pswitch_4
    check-cast p1, Lcom/zykj/mistake/entity/resp/CameraPermissionResp;

    .line 809
    .line 810
    const-string v0, "resp"

    .line 811
    .line 812
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 813
    .line 814
    .line 815
    iget-object v0, p0, Lb5/b;->b:Lcom/zykj/mistake/presenter/MistakeCreateOrEditPresenter;

    .line 816
    .line 817
    iget-object v0, v0, Lcom/zykj/mistake/base/BasePresenter;->c:Ljava/lang/Object;

    .line 818
    .line 819
    check-cast v0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 820
    .line 821
    if-eqz v0, :cond_21

    .line 822
    .line 823
    invoke-virtual {p1}, Lcom/zykj/mistake/entity/resp/CameraPermissionResp;->getResult()Z

    .line 824
    .line 825
    .line 826
    move-result v1

    .line 827
    iput-boolean v1, v0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->m:Z

    .line 828
    .line 829
    const-string v1, "SP_CAN_OPEN_CAMERA"

    .line 830
    .line 831
    invoke-virtual {p1}, Lcom/zykj/mistake/entity/resp/CameraPermissionResp;->getResult()Z

    .line 832
    .line 833
    .line 834
    move-result p1

    .line 835
    invoke-static {v0, v1, p1}, Lcom/zykj/mistake/utils/d;->e(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 836
    .line 837
    .line 838
    const-string p1, "SP_NEED_SHOW_CAMERA_DIALOG"

    .line 839
    .line 840
    const/4 v1, 0x1

    .line 841
    invoke-static {v0, p1, v1}, Lcom/zykj/mistake/utils/d;->e(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 842
    .line 843
    .line 844
    :cond_21
    return-void

    .line 845
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
