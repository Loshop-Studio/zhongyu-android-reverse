.class public final Lb5/a;
.super La/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/mistake/presenter/MainPresenter;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/presenter/MainPresenter;I)V
    .locals 0

    .line 1
    iput p2, p0, Lb5/a;->a:I

    iput-object p1, p0, Lb5/a;->b:Lcom/zykj/mistake/presenter/MainPresenter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final m(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget v0, p0, Lb5/a;->a:I

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
    iget-object v0, p0, Lb5/a;->b:Lcom/zykj/mistake/presenter/MainPresenter;

    .line 12
    .line 13
    iget-object v0, v0, Lcom/zykj/mistake/base/BasePresenter;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lj4/a;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    check-cast v0, Lcom/zykj/mistake/fragment/MistakeCollectionLegacyFragment;

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseFragment;->f()Landroidx/databinding/ViewDataBinding;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Lcom/zykj/mistake/databinding/FragmentMistakeNotebookBinding;

    .line 26
    .line 27
    iget-object v1, v1, Lcom/zykj/mistake/databinding/FragmentMistakeNotebookBinding;->d:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 28
    .line 29
    invoke-virtual {v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->isRefreshing()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseFragment;->f()Landroidx/databinding/ViewDataBinding;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Lcom/zykj/mistake/databinding/FragmentMistakeNotebookBinding;

    .line 40
    .line 41
    iget-object v1, v1, Lcom/zykj/mistake/databinding/FragmentMistakeNotebookBinding;->d:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 42
    .line 43
    const/4 v2, 0x0

    .line 44
    invoke-virtual {v1, v2}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 45
    .line 46
    .line 47
    :cond_0
    invoke-virtual {v0, p1}, Lcom/zykj/mistake/base/BaseFragment;->b(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    return-void

    .line 51
    :pswitch_0
    const-string v0, "e"

    .line 52
    .line 53
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, Lb5/a;->b:Lcom/zykj/mistake/presenter/MainPresenter;

    .line 57
    .line 58
    iget-object p1, p1, Lcom/zykj/mistake/base/BasePresenter;->c:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p1, Lj4/a;

    .line 61
    .line 62
    return-void

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final n(Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget v0, p0, Lb5/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lcom/zykj/mistake/entity/resp/MistakeBookResp;

    .line 7
    .line 8
    const-string v0, "resp"

    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lb5/a;->b:Lcom/zykj/mistake/presenter/MainPresenter;

    .line 14
    .line 15
    iget-object v0, v0, Lcom/zykj/mistake/base/BasePresenter;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lj4/a;

    .line 18
    .line 19
    if-eqz v0, :cond_4

    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/zykj/mistake/entity/resp/MistakeBookResp;->getResult()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast v0, Lcom/zykj/mistake/fragment/MistakeCollectionLegacyFragment;

    .line 26
    .line 27
    iget-object v1, v0, Lcom/zykj/mistake/fragment/MistakeCollectionLegacyFragment;->e:Ljava/util/ArrayList;

    .line 28
    .line 29
    const-string v2, "result"

    .line 30
    .line 31
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseFragment;->f()Landroidx/databinding/ViewDataBinding;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, Lcom/zykj/mistake/databinding/FragmentMistakeNotebookBinding;

    .line 39
    .line 40
    iget-object v2, v2, Lcom/zykj/mistake/databinding/FragmentMistakeNotebookBinding;->d:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 41
    .line 42
    invoke-virtual {v2}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->isRefreshing()Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    const/4 v3, 0x0

    .line 47
    if-eqz v2, :cond_0

    .line 48
    .line 49
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseFragment;->f()Landroidx/databinding/ViewDataBinding;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    check-cast v2, Lcom/zykj/mistake/databinding/FragmentMistakeNotebookBinding;

    .line 54
    .line 55
    iget-object v2, v2, Lcom/zykj/mistake/databinding/FragmentMistakeNotebookBinding;->d:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 56
    .line 57
    invoke-virtual {v2, v3}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 58
    .line 59
    .line 60
    :cond_0
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    const/4 v4, 0x0

    .line 65
    const-string v5, "mMistakeAdapter"

    .line 66
    .line 67
    if-nez v2, :cond_2

    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 73
    .line 74
    .line 75
    iget-object p1, v0, Lcom/zykj/mistake/fragment/MistakeCollectionLegacyFragment;->f:Lcom/zykj/mistake/adapter/MainLessonAdapter;

    .line 76
    .line 77
    if-eqz p1, :cond_1

    .line 78
    .line 79
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseFragment;->f()Landroidx/databinding/ViewDataBinding;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    check-cast p1, Lcom/zykj/mistake/databinding/FragmentMistakeNotebookBinding;

    .line 87
    .line 88
    iget-object p1, p1, Lcom/zykj/mistake/databinding/FragmentMistakeNotebookBinding;->b:Landroid/widget/LinearLayout;

    .line 89
    .line 90
    const/16 v0, 0x8

    .line 91
    .line 92
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_1
    invoke-static {v5}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw v4

    .line 100
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 101
    .line 102
    .line 103
    iget-object p1, v0, Lcom/zykj/mistake/fragment/MistakeCollectionLegacyFragment;->f:Lcom/zykj/mistake/adapter/MainLessonAdapter;

    .line 104
    .line 105
    if-eqz p1, :cond_3

    .line 106
    .line 107
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseFragment;->f()Landroidx/databinding/ViewDataBinding;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    check-cast p1, Lcom/zykj/mistake/databinding/FragmentMistakeNotebookBinding;

    .line 115
    .line 116
    iget-object p1, p1, Lcom/zykj/mistake/databinding/FragmentMistakeNotebookBinding;->b:Landroid/widget/LinearLayout;

    .line 117
    .line 118
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 119
    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_3
    invoke-static {v5}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    throw v4

    .line 126
    :cond_4
    :goto_0
    return-void

    .line 127
    :pswitch_0
    check-cast p1, Lcom/zykj/mistake/entity/resp/CameraPermissionResp;

    .line 128
    .line 129
    const-string v0, "resp"

    .line 130
    .line 131
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    iget-object v0, p0, Lb5/a;->b:Lcom/zykj/mistake/presenter/MainPresenter;

    .line 135
    .line 136
    iget-object v0, v0, Lcom/zykj/mistake/base/BasePresenter;->c:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v0, Lj4/a;

    .line 139
    .line 140
    if-eqz v0, :cond_8

    .line 141
    .line 142
    check-cast v0, Lcom/zykj/mistake/fragment/MistakeCollectionLegacyFragment;

    .line 143
    .line 144
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    const-string v2, "zykjMistake"

    .line 149
    .line 150
    const/4 v3, 0x0

    .line 151
    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    const-string v2, "SP_CAN_OPEN_CAMERA"

    .line 156
    .line 157
    if-nez v1, :cond_5

    .line 158
    .line 159
    move v1, v3

    .line 160
    goto :goto_1

    .line 161
    :cond_5
    invoke-interface {v1, v2}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    :goto_1
    if-eqz v1, :cond_8

    .line 166
    .line 167
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    invoke-static {v1, v2, v3}, Lcom/zykj/mistake/utils/d;->c(Landroid/content/Context;Ljava/lang/String;Z)Z

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    const-string v3, "SP_NEED_SHOW_CAMERA_DIALOG"

    .line 180
    .line 181
    const/4 v4, 0x1

    .line 182
    invoke-static {v2, v3, v4}, Lcom/zykj/mistake/utils/d;->c(Landroid/content/Context;Ljava/lang/String;Z)Z

    .line 183
    .line 184
    .line 185
    move-result v2

    .line 186
    invoke-virtual {p1}, Lcom/zykj/mistake/entity/resp/CameraPermissionResp;->getResult()Z

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    if-eq v3, v1, :cond_8

    .line 191
    .line 192
    if-eqz v2, :cond_8

    .line 193
    .line 194
    iget-object v1, v0, Lcom/zykj/mistake/fragment/MistakeCollectionLegacyFragment;->g:Ll4/e;

    .line 195
    .line 196
    if-eqz v1, :cond_7

    .line 197
    .line 198
    invoke-virtual {p1}, Lcom/zykj/mistake/entity/resp/CameraPermissionResp;->getResult()Z

    .line 199
    .line 200
    .line 201
    move-result p1

    .line 202
    new-instance v2, Landroidx/navigation/b;

    .line 203
    .line 204
    const/16 v3, 0x14

    .line 205
    .line 206
    invoke-direct {v2, v0, v3}, Landroidx/navigation/b;-><init>(Ljava/lang/Object;I)V

    .line 207
    .line 208
    .line 209
    iput-object v2, v1, Ll4/e;->a:Lr6/a;

    .line 210
    .line 211
    invoke-virtual {v1}, Landroid/app/Dialog;->show()V

    .line 212
    .line 213
    .line 214
    sget v0, Lcom/zykj/mistake/R$id;->tv_content:I

    .line 215
    .line 216
    invoke-virtual {v1, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    check-cast v0, Landroid/widget/TextView;

    .line 221
    .line 222
    if-eqz p1, :cond_6

    .line 223
    .line 224
    invoke-virtual {v1}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    sget v1, Lcom/zykj/mistake/R$string;->camera_open_warning:I

    .line 229
    .line 230
    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    goto :goto_2

    .line 235
    :cond_6
    invoke-virtual {v1}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    sget v1, Lcom/zykj/mistake/R$string;->camera_close_warning:I

    .line 240
    .line 241
    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    :goto_2
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 246
    .line 247
    .line 248
    goto :goto_3

    .line 249
    :cond_7
    const-string p1, "mCameraWarningDialog"

    .line 250
    .line 251
    invoke-static {p1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    const/4 p1, 0x0

    .line 255
    throw p1

    .line 256
    :cond_8
    :goto_3
    return-void

    .line 257
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
