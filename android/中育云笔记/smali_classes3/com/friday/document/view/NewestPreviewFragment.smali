.class public final Lcom/friday/document/view/NewestPreviewFragment;
.super Lcom/friday/document/view/Hilt_NewestPreviewFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/friday/document/view/Hilt_NewestPreviewFragment<",
        "Lcom/friday/document/databinding/PreviewFragmentBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final i:Lqc/d;

.field public final j:Lqc/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/friday/document/view/Hilt_NewestPreviewFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lu2/p;

    .line 5
    .line 6
    invoke-direct {v0}, Lu2/p;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/friday/document/view/NewestPreviewFragment;->i:Lqc/d;

    .line 14
    .line 15
    const-class v0, Lcom/friday/document/viewmodel/NewestViewModel;

    .line 16
    .line 17
    invoke-static {v0}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v1, Lcom/friday/document/view/NewestPreviewFragment$special$$inlined$activityViewModels$default$1;

    .line 22
    .line 23
    invoke-direct {v1, p0}, Lcom/friday/document/view/NewestPreviewFragment$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 24
    .line 25
    .line 26
    new-instance v2, Lcom/friday/document/view/NewestPreviewFragment$special$$inlined$activityViewModels$default$2;

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-direct {v2, v3, p0}, Lcom/friday/document/view/NewestPreviewFragment$special$$inlined$activityViewModels$default$2;-><init>(Lhd/a;Landroidx/fragment/app/Fragment;)V

    .line 30
    .line 31
    .line 32
    new-instance v3, Lcom/friday/document/view/NewestPreviewFragment$special$$inlined$activityViewModels$default$3;

    .line 33
    .line 34
    invoke-direct {v3, p0}, Lcom/friday/document/view/NewestPreviewFragment$special$$inlined$activityViewModels$default$3;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 35
    .line 36
    .line 37
    invoke-static {p0, v0, v1, v2, v3}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lod/c;Lhd/a;Lhd/a;Lhd/a;)Lqc/d;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iput-object v0, p0, Lcom/friday/document/view/NewestPreviewFragment;->j:Lqc/d;

    .line 42
    .line 43
    return-void
.end method

.method public static synthetic A(Lcom/friday/document/view/NewestPreviewFragment;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/NewestPreviewFragment;->X(Lcom/friday/document/view/NewestPreviewFragment;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V

    return-void
.end method

.method public static final synthetic B(Lcom/friday/document/view/NewestPreviewFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/friday/document/view/NewestPreviewFragment;->K()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic C(Lcom/friday/document/view/NewestPreviewFragment;Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/friday/document/view/NewestPreviewFragment;->L(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic D(Lcom/friday/document/view/NewestPreviewFragment;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/friday/document/view/NewestPreviewFragment;->O(Ljava/util/List;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic E(Lcom/friday/document/view/NewestPreviewFragment;Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/friday/document/view/NewestPreviewFragment;->P(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic F(Lcom/friday/document/view/NewestPreviewFragment;)Lcom/friday/document/databinding/PreviewFragmentBinding;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/friday/document/databinding/PreviewFragmentBinding;

    .line 6
    .line 7
    return-object p0
.end method

.method public static final synthetic G(Lcom/friday/document/view/NewestPreviewFragment;)Lcom/friday/document/adapter/PreviewAdapter;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/friday/document/view/NewestPreviewFragment;->Q()Lcom/friday/document/adapter/PreviewAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic H(Lcom/friday/document/view/NewestPreviewFragment;)Lcom/friday/document/viewmodel/NewestViewModel;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/NewestPreviewFragment;->R()Lcom/friday/document/viewmodel/NewestViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic I(Lcom/friday/document/view/NewestPreviewFragment;Lcom/friday/common/entity/FileEntity;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/friday/document/view/NewestPreviewFragment;->c0(Lcom/friday/common/entity/FileEntity;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final J()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/NewestPreviewFragment;->R()Lcom/friday/document/viewmodel/NewestViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->t0(Lcom/friday/common/entity/FileEntity;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private final K()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/document/databinding/PreviewFragmentBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/friday/document/databinding/PreviewFragmentBinding;->c:Lcom/friday/document/databinding/LayoutEmptyPreviewBinding;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Lcom/friday/document/view/NewestPreviewFragment;->Q()Lcom/friday/document/adapter/PreviewAdapter;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/ListAdapter;->submitList(Ljava/util/List;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Lcom/friday/document/databinding/PreviewFragmentBinding;

    .line 33
    .line 34
    iget-object v0, v0, Lcom/friday/document/databinding/PreviewFragmentBinding;->e:Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;

    .line 35
    .line 36
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const/16 v1, 0x8

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method private final L(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "8"

    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x1

    .line 16
    const/4 v4, 0x0

    .line 17
    if-nez v2, :cond_1

    .line 18
    .line 19
    const-string v2, "9"

    .line 20
    .line 21
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    invoke-static {v2, v5}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v2, v4

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    :goto_0
    move v2, v3

    .line 35
    :goto_1
    const-string v5, "11"

    .line 36
    .line 37
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    invoke-static {v5, v6}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    sget-object v6, Lk2/n;->a:Lk2/n$a;

    .line 46
    .line 47
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    invoke-virtual {v6, v7}, Lk2/n$a;->c(Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    invoke-virtual {v0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    check-cast v7, Lcom/friday/document/databinding/PreviewFragmentBinding;

    .line 60
    .line 61
    iget-object v7, v7, Lcom/friday/document/databinding/PreviewFragmentBinding;->e:Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;

    .line 62
    .line 63
    iget-object v7, v7, Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;->f:Landroid/widget/ImageView;

    .line 64
    .line 65
    invoke-virtual {v7, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    check-cast v6, Lcom/friday/document/databinding/PreviewFragmentBinding;

    .line 73
    .line 74
    iget-object v6, v6, Lcom/friday/document/databinding/PreviewFragmentBinding;->d:Lcom/friday/document/databinding/LayoutNotePreviewBinding;

    .line 75
    .line 76
    invoke-virtual {v6}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    const/16 v7, 0x8

    .line 81
    .line 82
    invoke-virtual {v6, v7}, Landroid/view/View;->setVisibility(I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    check-cast v6, Lcom/friday/document/databinding/PreviewFragmentBinding;

    .line 90
    .line 91
    iget-object v6, v6, Lcom/friday/document/databinding/PreviewFragmentBinding;->c:Lcom/friday/document/databinding/LayoutEmptyPreviewBinding;

    .line 92
    .line 93
    invoke-virtual {v6}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    invoke-virtual {v6, v7}, Landroid/view/View;->setVisibility(I)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    check-cast v6, Lcom/friday/document/databinding/PreviewFragmentBinding;

    .line 105
    .line 106
    iget-object v6, v6, Lcom/friday/document/databinding/PreviewFragmentBinding;->e:Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;

    .line 107
    .line 108
    invoke-virtual {v6}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    invoke-virtual {v6, v4}, Landroid/view/View;->setVisibility(I)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 116
    .line 117
    .line 118
    move-result-object v6

    .line 119
    check-cast v6, Lcom/friday/document/databinding/PreviewFragmentBinding;

    .line 120
    .line 121
    iget-object v6, v6, Lcom/friday/document/databinding/PreviewFragmentBinding;->d:Lcom/friday/document/databinding/LayoutNotePreviewBinding;

    .line 122
    .line 123
    iget-object v6, v6, Lcom/friday/document/databinding/LayoutNotePreviewBinding;->h:Landroidx/core/widget/NestedScrollView;

    .line 124
    .line 125
    invoke-virtual {v6, v7}, Landroid/view/View;->setVisibility(I)V

    .line 126
    .line 127
    .line 128
    const/4 v6, 0x2

    .line 129
    const/4 v7, 0x3

    .line 130
    const-string v8, "ivCoverIcon"

    .line 131
    .line 132
    const-string v9, "microClassName"

    .line 133
    .line 134
    const-string v10, "ivLogo"

    .line 135
    .line 136
    const-string v11, "tvName"

    .line 137
    .line 138
    const-string v12, "ivCover"

    .line 139
    .line 140
    const-string v13, "tvView"

    .line 141
    .line 142
    if-eqz v5, :cond_4

    .line 143
    .line 144
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getLocalFileUrl()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v14

    .line 148
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v15

    .line 152
    move/from16 p2, v4

    .line 153
    .line 154
    new-instance v4, Ljava/lang/StringBuilder;

    .line 155
    .line 156
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    const-string v14, ".jpg"

    .line 166
    .line 167
    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    invoke-static {v4}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 175
    .line 176
    .line 177
    move-result v4

    .line 178
    if-nez v4, :cond_3

    .line 179
    .line 180
    sget-object v4, Lf2/c;->a:Lf2/c;

    .line 181
    .line 182
    invoke-virtual {v4}, Lf2/c;->e()Z

    .line 183
    .line 184
    .line 185
    move-result v4

    .line 186
    if-nez v4, :cond_2

    .line 187
    .line 188
    sget v4, Lcom/friday/document/R$string;->connect_network_please:I

    .line 189
    .line 190
    invoke-static {v4}, Lz1/b;->h(I)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v0}, Lcom/friday/document/view/NewestPreviewFragment;->R()Lcom/friday/document/viewmodel/NewestViewModel;

    .line 194
    .line 195
    .line 196
    move-result-object v4

    .line 197
    const/4 v14, 0x0

    .line 198
    invoke-virtual {v4, v14}, Lcom/friday/document/viewmodel/BaseFileViewModel;->u0(Lcom/friday/common/entity/FileEntity;)V

    .line 199
    .line 200
    .line 201
    goto :goto_2

    .line 202
    :cond_2
    invoke-virtual {v0, v3}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v0}, Lcom/friday/document/view/NewestPreviewFragment;->R()Lcom/friday/document/viewmodel/NewestViewModel;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    invoke-virtual {v4, v1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->x(Lcom/friday/common/entity/FileEntity;)V

    .line 210
    .line 211
    .line 212
    goto :goto_2

    .line 213
    :cond_3
    invoke-virtual {v0}, Lcom/friday/document/view/NewestPreviewFragment;->R()Lcom/friday/document/viewmodel/NewestViewModel;

    .line 214
    .line 215
    .line 216
    move-result-object v4

    .line 217
    invoke-virtual {v4, v1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->u0(Lcom/friday/common/entity/FileEntity;)V

    .line 218
    .line 219
    .line 220
    :goto_2
    invoke-virtual {v0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    check-cast v4, Lcom/friday/document/databinding/PreviewFragmentBinding;

    .line 225
    .line 226
    iget-object v4, v4, Lcom/friday/document/databinding/PreviewFragmentBinding;->e:Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;

    .line 227
    .line 228
    iget-object v14, v4, Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;->j:Landroid/widget/TextView;

    .line 229
    .line 230
    invoke-static {v14, v11}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    iget-object v11, v4, Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;->k:Landroid/widget/TextView;

    .line 234
    .line 235
    invoke-static {v11, v13}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    iget-object v15, v4, Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;->f:Landroid/widget/ImageView;

    .line 239
    .line 240
    invoke-static {v15, v10}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    new-array v10, v7, [Landroid/view/View;

    .line 244
    .line 245
    aput-object v14, v10, p2

    .line 246
    .line 247
    aput-object v11, v10, v3

    .line 248
    .line 249
    aput-object v15, v10, v6

    .line 250
    .line 251
    invoke-direct {v0, v10}, Lcom/friday/document/view/NewestPreviewFragment;->a0([Landroid/view/View;)V

    .line 252
    .line 253
    .line 254
    iget-object v10, v4, Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;->i:Landroidx/appcompat/widget/AppCompatTextView;

    .line 255
    .line 256
    invoke-static {v10, v9}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    iget-object v9, v4, Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;->d:Landroidx/appcompat/widget/AppCompatImageView;

    .line 260
    .line 261
    invoke-static {v9, v12}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    iget-object v4, v4, Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;->e:Landroidx/appcompat/widget/AppCompatImageView;

    .line 265
    .line 266
    invoke-static {v4, v8}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    new-array v7, v7, [Landroid/view/View;

    .line 270
    .line 271
    aput-object v10, v7, p2

    .line 272
    .line 273
    aput-object v9, v7, v3

    .line 274
    .line 275
    aput-object v4, v7, v6

    .line 276
    .line 277
    invoke-direct {v0, v7}, Lcom/friday/document/view/NewestPreviewFragment;->b0([Landroid/view/View;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 281
    .line 282
    .line 283
    move-result-object v3

    .line 284
    check-cast v3, Lcom/friday/document/databinding/PreviewFragmentBinding;

    .line 285
    .line 286
    iget-object v3, v3, Lcom/friday/document/databinding/PreviewFragmentBinding;->e:Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;

    .line 287
    .line 288
    iget-object v3, v3, Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;->i:Landroidx/appcompat/widget/AppCompatTextView;

    .line 289
    .line 290
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v4

    .line 294
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 295
    .line 296
    .line 297
    goto :goto_3

    .line 298
    :cond_4
    move/from16 p2, v4

    .line 299
    .line 300
    invoke-virtual {v0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 301
    .line 302
    .line 303
    move-result-object v4

    .line 304
    check-cast v4, Lcom/friday/document/databinding/PreviewFragmentBinding;

    .line 305
    .line 306
    iget-object v4, v4, Lcom/friday/document/databinding/PreviewFragmentBinding;->e:Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;

    .line 307
    .line 308
    iget-object v14, v4, Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;->k:Landroid/widget/TextView;

    .line 309
    .line 310
    invoke-static {v14, v13}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    iget-object v15, v4, Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;->j:Landroid/widget/TextView;

    .line 314
    .line 315
    invoke-static {v15, v11}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    iget-object v11, v4, Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;->f:Landroid/widget/ImageView;

    .line 319
    .line 320
    invoke-static {v11, v10}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 321
    .line 322
    .line 323
    new-array v10, v7, [Landroid/view/View;

    .line 324
    .line 325
    aput-object v14, v10, p2

    .line 326
    .line 327
    aput-object v15, v10, v3

    .line 328
    .line 329
    aput-object v11, v10, v6

    .line 330
    .line 331
    invoke-direct {v0, v10}, Lcom/friday/document/view/NewestPreviewFragment;->b0([Landroid/view/View;)V

    .line 332
    .line 333
    .line 334
    iget-object v10, v4, Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;->i:Landroidx/appcompat/widget/AppCompatTextView;

    .line 335
    .line 336
    invoke-static {v10, v9}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 337
    .line 338
    .line 339
    iget-object v9, v4, Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;->d:Landroidx/appcompat/widget/AppCompatImageView;

    .line 340
    .line 341
    invoke-static {v9, v12}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    iget-object v4, v4, Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;->e:Landroidx/appcompat/widget/AppCompatImageView;

    .line 345
    .line 346
    invoke-static {v4, v8}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    new-array v7, v7, [Landroid/view/View;

    .line 350
    .line 351
    aput-object v10, v7, p2

    .line 352
    .line 353
    aput-object v9, v7, v3

    .line 354
    .line 355
    aput-object v4, v7, v6

    .line 356
    .line 357
    invoke-direct {v0, v7}, Lcom/friday/document/view/NewestPreviewFragment;->a0([Landroid/view/View;)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 361
    .line 362
    .line 363
    move-result-object v3

    .line 364
    check-cast v3, Lcom/friday/document/databinding/PreviewFragmentBinding;

    .line 365
    .line 366
    iget-object v3, v3, Lcom/friday/document/databinding/PreviewFragmentBinding;->e:Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;

    .line 367
    .line 368
    iget-object v3, v3, Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;->j:Landroid/widget/TextView;

    .line 369
    .line 370
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v4

    .line 374
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 375
    .line 376
    .line 377
    :goto_3
    invoke-virtual {v0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 378
    .line 379
    .line 380
    move-result-object v3

    .line 381
    check-cast v3, Lcom/friday/document/databinding/PreviewFragmentBinding;

    .line 382
    .line 383
    iget-object v3, v3, Lcom/friday/document/databinding/PreviewFragmentBinding;->e:Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;

    .line 384
    .line 385
    iget-object v3, v3, Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;->d:Landroidx/appcompat/widget/AppCompatImageView;

    .line 386
    .line 387
    invoke-static {v3, v12}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    new-instance v4, Lu2/x;

    .line 391
    .line 392
    invoke-direct {v4, v0, v5, v1}, Lu2/x;-><init>(Lcom/friday/document/view/NewestPreviewFragment;ZLcom/friday/common/entity/FileEntity;)V

    .line 393
    .line 394
    .line 395
    const-wide/16 v5, 0x3e8

    .line 396
    .line 397
    invoke-static {v3, v5, v6, v4}, Lz1/b;->l(Landroid/view/View;JLandroid/view/View$OnClickListener;)V

    .line 398
    .line 399
    .line 400
    invoke-virtual {v0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 401
    .line 402
    .line 403
    move-result-object v3

    .line 404
    check-cast v3, Lcom/friday/document/databinding/PreviewFragmentBinding;

    .line 405
    .line 406
    iget-object v3, v3, Lcom/friday/document/databinding/PreviewFragmentBinding;->e:Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;

    .line 407
    .line 408
    iget-object v3, v3, Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;->k:Landroid/widget/TextView;

    .line 409
    .line 410
    invoke-static {v3, v13}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 411
    .line 412
    .line 413
    new-instance v4, Lu2/y;

    .line 414
    .line 415
    invoke-direct {v4, v0, v2, v1}, Lu2/y;-><init>(Lcom/friday/document/view/NewestPreviewFragment;ZLcom/friday/common/entity/FileEntity;)V

    .line 416
    .line 417
    .line 418
    invoke-static {v3, v5, v6, v4}, Lz1/b;->l(Landroid/view/View;JLandroid/view/View$OnClickListener;)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 422
    .line 423
    .line 424
    move-result-object v1

    .line 425
    check-cast v1, Lcom/friday/document/databinding/PreviewFragmentBinding;

    .line 426
    .line 427
    iget-object v1, v1, Lcom/friday/document/databinding/PreviewFragmentBinding;->e:Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;

    .line 428
    .line 429
    iget-object v1, v1, Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;->k:Landroid/widget/TextView;

    .line 430
    .line 431
    sget v2, Lcom/friday/document/R$string;->others_play:I

    .line 432
    .line 433
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v2

    .line 437
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 438
    .line 439
    .line 440
    sget-object v1, Lqc/q;->a:Lqc/q;

    .line 441
    .line 442
    return-object v1
.end method

.method public static final M(Lcom/friday/document/view/NewestPreviewFragment;ZLcom/friday/common/entity/FileEntity;Landroid/view/View;)V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/friday/document/view/NewestPreviewFragment$displayOthers$4$1;

    .line 6
    .line 7
    const/4 p3, 0x0

    .line 8
    invoke-direct {v3, p1, p0, p2, p3}, Lcom/friday/document/view/NewestPreviewFragment$displayOthers$4$1;-><init>(ZLcom/friday/document/view/NewestPreviewFragment;Lcom/friday/common/entity/FileEntity;Lvc/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public static final N(Lcom/friday/document/view/NewestPreviewFragment;ZLcom/friday/common/entity/FileEntity;Landroid/view/View;)V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/friday/document/view/NewestPreviewFragment$displayOthers$5$1;

    .line 6
    .line 7
    const/4 p3, 0x0

    .line 8
    invoke-direct {v3, p1, p2, p0, p3}, Lcom/friday/document/view/NewestPreviewFragment$displayOthers$5$1;-><init>(ZLcom/friday/common/entity/FileEntity;Lcom/friday/document/view/NewestPreviewFragment;Lvc/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method private final O(Ljava/util/List;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/document/databinding/PreviewFragmentBinding;

    .line 6
    .line 7
    iget-object v1, v0, Lcom/friday/document/databinding/PreviewFragmentBinding;->e:Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "getRoot(...)"

    .line 14
    .line 15
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v3, v0, Lcom/friday/document/databinding/PreviewFragmentBinding;->c:Lcom/friday/document/databinding/LayoutEmptyPreviewBinding;

    .line 19
    .line 20
    invoke-virtual {v3}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-static {v3, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object v4, v0, Lcom/friday/document/databinding/PreviewFragmentBinding;->d:Lcom/friday/document/databinding/LayoutNotePreviewBinding;

    .line 28
    .line 29
    iget-object v4, v4, Lcom/friday/document/databinding/LayoutNotePreviewBinding;->h:Landroidx/core/widget/NestedScrollView;

    .line 30
    .line 31
    const-string v5, "scrollView"

    .line 32
    .line 33
    invoke-static {v4, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 v5, 0x3

    .line 37
    new-array v6, v5, [Landroid/view/View;

    .line 38
    .line 39
    const/4 v7, 0x0

    .line 40
    aput-object v1, v6, v7

    .line 41
    .line 42
    const/4 v1, 0x1

    .line 43
    aput-object v3, v6, v1

    .line 44
    .line 45
    const/4 v3, 0x2

    .line 46
    aput-object v4, v6, v3

    .line 47
    .line 48
    invoke-direct {p0, v6}, Lcom/friday/document/view/NewestPreviewFragment;->a0([Landroid/view/View;)V

    .line 49
    .line 50
    .line 51
    iget-object v4, v0, Lcom/friday/document/databinding/PreviewFragmentBinding;->d:Lcom/friday/document/databinding/LayoutNotePreviewBinding;

    .line 52
    .line 53
    invoke-virtual {v4}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-static {v4, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    iget-object v2, v0, Lcom/friday/document/databinding/PreviewFragmentBinding;->d:Lcom/friday/document/databinding/LayoutNotePreviewBinding;

    .line 61
    .line 62
    iget-object v2, v2, Lcom/friday/document/databinding/LayoutNotePreviewBinding;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 63
    .line 64
    const-string v6, "rvNote"

    .line 65
    .line 66
    invoke-static {v2, v6}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    iget-object v6, v0, Lcom/friday/document/databinding/PreviewFragmentBinding;->d:Lcom/friday/document/databinding/LayoutNotePreviewBinding;

    .line 70
    .line 71
    iget-object v6, v6, Lcom/friday/document/databinding/LayoutNotePreviewBinding;->d:Landroid/widget/ImageView;

    .line 72
    .line 73
    const-string v8, "ivFullScreen"

    .line 74
    .line 75
    invoke-static {v6, v8}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    iget-object v8, v0, Lcom/friday/document/databinding/PreviewFragmentBinding;->d:Lcom/friday/document/databinding/LayoutNotePreviewBinding;

    .line 79
    .line 80
    iget-object v8, v8, Lcom/friday/document/databinding/LayoutNotePreviewBinding;->f:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 81
    .line 82
    const-string v9, "refreshImage"

    .line 83
    .line 84
    invoke-static {v8, v9}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    const/4 v9, 0x4

    .line 88
    new-array v9, v9, [Landroid/view/View;

    .line 89
    .line 90
    aput-object v4, v9, v7

    .line 91
    .line 92
    aput-object v2, v9, v1

    .line 93
    .line 94
    aput-object v6, v9, v3

    .line 95
    .line 96
    aput-object v8, v9, v5

    .line 97
    .line 98
    invoke-direct {p0, v9}, Lcom/friday/document/view/NewestPreviewFragment;->b0([Landroid/view/View;)V

    .line 99
    .line 100
    .line 101
    iget-object v1, v0, Lcom/friday/document/databinding/PreviewFragmentBinding;->d:Lcom/friday/document/databinding/LayoutNotePreviewBinding;

    .line 102
    .line 103
    iget-object v1, v1, Lcom/friday/document/databinding/LayoutNotePreviewBinding;->c:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 104
    .line 105
    const-string v2, "fabEdit"

    .line 106
    .line 107
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1, v7}, Landroid/view/View;->setVisibility(I)V

    .line 111
    .line 112
    .line 113
    iget-object v0, v0, Lcom/friday/document/databinding/PreviewFragmentBinding;->d:Lcom/friday/document/databinding/LayoutNotePreviewBinding;

    .line 114
    .line 115
    iget-object v0, v0, Lcom/friday/document/databinding/LayoutNotePreviewBinding;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 116
    .line 117
    invoke-virtual {v0, v7}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollToPosition(I)V

    .line 118
    .line 119
    .line 120
    invoke-direct {p0}, Lcom/friday/document/view/NewestPreviewFragment;->Q()Lcom/friday/document/adapter/PreviewAdapter;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/ListAdapter;->submitList(Ljava/util/List;)V

    .line 125
    .line 126
    .line 127
    return-void
.end method

.method private final P(Lcom/friday/common/entity/FileEntity;Lvc/c;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/document/databinding/PreviewFragmentBinding;

    .line 6
    .line 7
    iget-object v1, v0, Lcom/friday/document/databinding/PreviewFragmentBinding;->e:Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "getRoot(...)"

    .line 14
    .line 15
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v3, v0, Lcom/friday/document/databinding/PreviewFragmentBinding;->c:Lcom/friday/document/databinding/LayoutEmptyPreviewBinding;

    .line 19
    .line 20
    invoke-virtual {v3}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-static {v3, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object v4, v0, Lcom/friday/document/databinding/PreviewFragmentBinding;->d:Lcom/friday/document/databinding/LayoutNotePreviewBinding;

    .line 28
    .line 29
    iget-object v4, v4, Lcom/friday/document/databinding/LayoutNotePreviewBinding;->d:Landroid/widget/ImageView;

    .line 30
    .line 31
    const-string v5, "ivFullScreen"

    .line 32
    .line 33
    invoke-static {v4, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget-object v5, v0, Lcom/friday/document/databinding/PreviewFragmentBinding;->d:Lcom/friday/document/databinding/LayoutNotePreviewBinding;

    .line 37
    .line 38
    iget-object v5, v5, Lcom/friday/document/databinding/LayoutNotePreviewBinding;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 39
    .line 40
    const-string v6, "rvNote"

    .line 41
    .line 42
    invoke-static {v5, v6}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iget-object v6, v0, Lcom/friday/document/databinding/PreviewFragmentBinding;->d:Lcom/friday/document/databinding/LayoutNotePreviewBinding;

    .line 46
    .line 47
    iget-object v6, v6, Lcom/friday/document/databinding/LayoutNotePreviewBinding;->f:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 48
    .line 49
    const-string v7, "refreshImage"

    .line 50
    .line 51
    invoke-static {v6, v7}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/4 v7, 0x5

    .line 55
    new-array v7, v7, [Landroid/view/View;

    .line 56
    .line 57
    const/4 v8, 0x0

    .line 58
    aput-object v1, v7, v8

    .line 59
    .line 60
    const/4 v1, 0x1

    .line 61
    aput-object v3, v7, v1

    .line 62
    .line 63
    const/4 v3, 0x2

    .line 64
    aput-object v4, v7, v3

    .line 65
    .line 66
    const/4 v4, 0x3

    .line 67
    aput-object v5, v7, v4

    .line 68
    .line 69
    const/4 v4, 0x4

    .line 70
    aput-object v6, v7, v4

    .line 71
    .line 72
    invoke-direct {p0, v7}, Lcom/friday/document/view/NewestPreviewFragment;->a0([Landroid/view/View;)V

    .line 73
    .line 74
    .line 75
    iget-object v4, v0, Lcom/friday/document/databinding/PreviewFragmentBinding;->d:Lcom/friday/document/databinding/LayoutNotePreviewBinding;

    .line 76
    .line 77
    iget-object v4, v4, Lcom/friday/document/databinding/LayoutNotePreviewBinding;->c:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 78
    .line 79
    const-string v5, "fabEdit"

    .line 80
    .line 81
    invoke-static {v4, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    const/16 v5, 0x8

    .line 85
    .line 86
    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    .line 87
    .line 88
    .line 89
    iget-object v4, v0, Lcom/friday/document/databinding/PreviewFragmentBinding;->d:Lcom/friday/document/databinding/LayoutNotePreviewBinding;

    .line 90
    .line 91
    invoke-virtual {v4}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    invoke-static {v4, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    iget-object v0, v0, Lcom/friday/document/databinding/PreviewFragmentBinding;->d:Lcom/friday/document/databinding/LayoutNotePreviewBinding;

    .line 99
    .line 100
    iget-object v0, v0, Lcom/friday/document/databinding/LayoutNotePreviewBinding;->h:Landroidx/core/widget/NestedScrollView;

    .line 101
    .line 102
    const-string v2, "scrollView"

    .line 103
    .line 104
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    new-array v2, v3, [Landroid/view/View;

    .line 108
    .line 109
    aput-object v4, v2, v8

    .line 110
    .line 111
    aput-object v0, v2, v1

    .line 112
    .line 113
    invoke-direct {p0, v2}, Lcom/friday/document/view/NewestPreviewFragment;->b0([Landroid/view/View;)V

    .line 114
    .line 115
    .line 116
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    new-instance v1, Lcom/friday/document/view/NewestPreviewFragment$displayTxt$3;

    .line 121
    .line 122
    const/4 v2, 0x0

    .line 123
    invoke-direct {v1, p1, p0, v2}, Lcom/friday/document/view/NewestPreviewFragment$displayTxt$3;-><init>(Lcom/friday/common/entity/FileEntity;Lcom/friday/document/view/NewestPreviewFragment;Lvc/c;)V

    .line 124
    .line 125
    .line 126
    invoke-static {v0, v1, p2}, Lsd/f;->g(Lkotlin/coroutines/d;Lhd/p;Lvc/c;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    if-ne p1, p2, :cond_0

    .line 135
    .line 136
    return-object p1

    .line 137
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 138
    .line 139
    return-object p1
.end method

.method private final Q()Lcom/friday/document/adapter/PreviewAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/view/NewestPreviewFragment;->i:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/document/adapter/PreviewAdapter;

    .line 8
    .line 9
    return-object v0
.end method

.method public static final S(Lcom/friday/document/view/NewestPreviewFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    new-instance p1, Lcom/friday/common/widget/dialog/FBIWarningDialog;

    .line 2
    .line 3
    invoke-direct {p1}, Lcom/friday/common/widget/dialog/FBIWarningDialog;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-class v0, Lcom/friday/common/widget/dialog/FBIWarningDialog;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p1, p0, v0}, Landroidx/fragment/app/DialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public static final T(Lcom/friday/document/view/NewestPreviewFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/friday/document/view/NewestPreviewFragment$initData$2$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p1, p0, v1}, Lcom/friday/document/view/NewestPreviewFragment$initData$2$1;-><init>(Lcom/friday/common/entity/FileEntity;Lcom/friday/document/view/NewestPreviewFragment;Lvc/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 15
    .line 16
    .line 17
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 18
    .line 19
    return-object p0
.end method

.method public static final U(Lcom/friday/document/view/NewestPreviewFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 3
    .line 4
    .line 5
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 6
    .line 7
    return-object p0
.end method

.method public static final V(Lcom/friday/document/view/NewestPreviewFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getLocalFileUrl()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    new-instance v3, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-static {v1}, Lcom/blankj/utilcode/util/FileUtils;->isDir(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_0

    .line 32
    .line 33
    :try_start_0
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getZipFilePath()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getLocalFileUrl()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    new-instance v4, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-static {v1, v2}, Lcom/blankj/utilcode/util/ZipUtils;->unzipFile(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :catch_0
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getLocalFileUrl()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    new-instance v2, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/lang/String;)Z

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, v0}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 91
    .line 92
    .line 93
    const-string p0, "\u5fae\u8bfe\u6587\u4ef6\u89e3\u538b\u5931\u8d25\uff0c\u8bf7\u91cd\u8bd5"

    .line 94
    .line 95
    invoke-static {p0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 96
    .line 97
    .line 98
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 99
    .line 100
    return-object p0

    .line 101
    :cond_0
    :goto_0
    invoke-virtual {p0, v0}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 102
    .line 103
    .line 104
    sget-object p0, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 105
    .line 106
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getLocalFileUrl()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    new-instance v1, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-virtual {p0, p1}, Lcom/friday/common/helper/c;->t(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_1
    invoke-direct {p0}, Lcom/friday/document/view/NewestPreviewFragment;->J()V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0, v0}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 137
    .line 138
    .line 139
    :goto_1
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 140
    .line 141
    return-object p0
.end method

.method public static final W(Lcom/friday/document/view/NewestPreviewFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 4

    .line 1
    const-string v0, "ivCover"

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Lcom/friday/document/databinding/PreviewFragmentBinding;

    .line 10
    .line 11
    iget-object v1, v1, Lcom/friday/document/databinding/PreviewFragmentBinding;->e:Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;

    .line 12
    .line 13
    iget-object v1, v1, Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;->d:Landroidx/appcompat/widget/AppCompatImageView;

    .line 14
    .line 15
    invoke-static {v1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    new-instance v0, Ljava/io/File;

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getLocalFileUrl()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    new-instance v3, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string p1, ".jpg"

    .line 40
    .line 41
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-static {p1}, Lcoil3/l;->a(Landroid/content/Context;)Lcoil3/e;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    new-instance v2, Lw/g$a;

    .line 60
    .line 61
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-direct {v2, v3}, Lw/g$a;-><init>(Landroid/content/Context;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2, v0}, Lw/g$a;->d(Ljava/lang/Object;)Lw/g$a;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {v0, v1}, Lw/j;->q(Lw/g$a;Landroid/widget/ImageView;)Lw/g$a;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    sget-object v1, Lcoil3/request/CachePolicy;->h:Lcoil3/request/CachePolicy;

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Lw/g$a;->k(Lcoil3/request/CachePolicy;)Lw/g$a;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v1}, Lw/g$a;->f(Lcoil3/request/CachePolicy;)Lw/g$a;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v1}, Lw/g$a;->l(Lcoil3/request/CachePolicy;)Lw/g$a;

    .line 85
    .line 86
    .line 87
    sget v1, Lcom/friday/document/R$drawable;->icon_micor_class_normal:I

    .line 88
    .line 89
    invoke-static {v0, v1}, Lw/j;->b(Lw/g$a;I)Lw/g$a;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Lw/g$a;->c()Lw/g;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-interface {p1, v0}, Lcoil3/e;->c(Lw/g;)Lw/c;

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_0
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    check-cast p1, Lcom/friday/document/databinding/PreviewFragmentBinding;

    .line 105
    .line 106
    iget-object p1, p1, Lcom/friday/document/databinding/PreviewFragmentBinding;->e:Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;

    .line 107
    .line 108
    iget-object p1, p1, Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;->d:Landroidx/appcompat/widget/AppCompatImageView;

    .line 109
    .line 110
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    sget v0, Lcom/friday/document/R$drawable;->icon_micor_class_normal:I

    .line 114
    .line 115
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-static {v1}, Lcoil3/l;->a(Landroid/content/Context;)Lcoil3/e;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    new-instance v2, Lw/g$a;

    .line 128
    .line 129
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    invoke-direct {v2, v3}, Lw/g$a;-><init>(Landroid/content/Context;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2, v0}, Lw/g$a;->d(Ljava/lang/Object;)Lw/g$a;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-static {v0, p1}, Lw/j;->q(Lw/g$a;Landroid/widget/ImageView;)Lw/g$a;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-virtual {p1}, Lw/g$a;->c()Lw/g;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    invoke-interface {v1, p1}, Lcoil3/e;->c(Lw/g;)Lw/c;

    .line 149
    .line 150
    .line 151
    :goto_0
    const/4 p1, 0x0

    .line 152
    invoke-virtual {p0, p1}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 153
    .line 154
    .line 155
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 156
    .line 157
    return-object p0
.end method

.method public static final X(Lcom/friday/document/view/NewestPreviewFragment;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/friday/document/view/NewestPreviewFragment;->Q()Lcom/friday/document/adapter/PreviewAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/friday/document/adapter/PreviewAdapter;->d()V

    .line 6
    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    invoke-virtual {p1, p0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private static final Y()Lcom/friday/document/adapter/PreviewAdapter;
    .locals 1

    .line 1
    new-instance v0, Lcom/friday/document/adapter/PreviewAdapter;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/friday/document/adapter/PreviewAdapter;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final Z(Lcom/friday/document/view/NewestPreviewFragment;Landroid/view/View;Landroid/widget/PopupWindow;Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;)Lqc/q;
    .locals 4

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "popupWindow"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p1, "dataBinding"

    .line 12
    .line 13
    invoke-static {p3, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/friday/document/view/NewestPreviewFragment;->R()Lcom/friday/document/viewmodel/NewestViewModel;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->W()Lcom/friday/common/entity/FileEntity;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-eqz p1, :cond_2

    .line 25
    .line 26
    iget-object v0, p3, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->f:Landroid/widget/TextView;

    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getUpdateTime()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    new-instance v2, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    const-string v3, "\u4fee\u6539\u65f6\u95f4\uff1a"

    .line 38
    .line 39
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p3, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->e:Landroid/widget/TextView;

    .line 53
    .line 54
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getCreateTime()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    new-instance v2, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 61
    .line 62
    .line 63
    const-string v3, "\u521b\u5efa\u65f6\u95f4\uff1a"

    .line 64
    .line 65
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->syncUncompleted()Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_1

    .line 83
    .line 84
    iget-object v0, p3, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->d:Landroid/widget/LinearLayout;

    .line 85
    .line 86
    const/4 v1, 0x0

    .line 87
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 88
    .line 89
    .line 90
    iget-object v0, p3, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->h:Landroid/widget/TextView;

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->isFailedState()Z

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    if-eqz p1, :cond_0

    .line 100
    .line 101
    iget-object p0, p3, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->c:Landroid/widget/ImageView;

    .line 102
    .line 103
    sget p1, Lcom/friday/document/R$drawable;->icon_sync_failed:I

    .line 104
    .line 105
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 106
    .line 107
    .line 108
    iget-object p0, p3, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->g:Landroid/widget/TextView;

    .line 109
    .line 110
    const-string p1, "\u6587\u4ef6\u540c\u6b65\u5931\u8d25"

    .line 111
    .line 112
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 113
    .line 114
    .line 115
    iget-object p0, p3, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->g:Landroid/widget/TextView;

    .line 116
    .line 117
    const/high16 p1, -0x10000

    .line 118
    .line 119
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_0
    iget-object p1, p3, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->c:Landroid/widget/ImageView;

    .line 124
    .line 125
    sget v0, Lcom/friday/document/R$drawable;->icon_to_be_synced:I

    .line 126
    .line 127
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 128
    .line 129
    .line 130
    iget-object p1, p3, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->g:Landroid/widget/TextView;

    .line 131
    .line 132
    const-string v0, "\u6587\u4ef6\u7b49\u5f85\u540c\u6b65"

    .line 133
    .line 134
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 135
    .line 136
    .line 137
    iget-object p1, p3, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->g:Landroid/widget/TextView;

    .line 138
    .line 139
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    sget p3, Lcom/friday/document/R$color;->app_l_dark:I

    .line 144
    .line 145
    invoke-static {p0, p3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 146
    .line 147
    .line 148
    move-result p0

    .line 149
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 150
    .line 151
    .line 152
    goto :goto_0

    .line 153
    :cond_1
    iget-object p0, p3, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->d:Landroid/widget/LinearLayout;

    .line 154
    .line 155
    const/16 p1, 0x8

    .line 156
    .line 157
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 158
    .line 159
    .line 160
    iget-object p0, p3, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->h:Landroid/widget/TextView;

    .line 161
    .line 162
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 163
    .line 164
    .line 165
    :goto_0
    sget-object p0, Lk2/v;->a:Lk2/v$a;

    .line 166
    .line 167
    const-string p1, "Info"

    .line 168
    .line 169
    invoke-virtual {p0, p1}, Lk2/v$a;->a(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p2}, Landroid/widget/PopupWindow;->dismiss()V

    .line 173
    .line 174
    .line 175
    :cond_2
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 176
    .line 177
    return-object p0
.end method

.method private final varargs a0([Landroid/view/View;)V
    .locals 4

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    if-ge v1, v0, :cond_0

    .line 4
    .line 5
    aget-object v2, p1, v1

    .line 6
    .line 7
    const/16 v3, 0x8

    .line 8
    .line 9
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 10
    .line 11
    .line 12
    add-int/lit8 v1, v1, 0x1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void
.end method

.method private final varargs b0([Landroid/view/View;)V
    .locals 4

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    if-ge v2, v0, :cond_0

    .line 5
    .line 6
    aget-object v3, p1, v2

    .line 7
    .line 8
    invoke-virtual {v3, v1}, Landroid/view/View;->setVisibility(I)V

    .line 9
    .line 10
    .line 11
    add-int/lit8 v2, v2, 0x1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    return-void
.end method

.method private final c0(Lcom/friday/common/entity/FileEntity;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->syncUncompleted()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lcom/friday/document/databinding/PreviewFragmentBinding;

    .line 12
    .line 13
    iget-object p1, p1, Lcom/friday/document/databinding/PreviewFragmentBinding;->d:Lcom/friday/document/databinding/LayoutNotePreviewBinding;

    .line 14
    .line 15
    iget-object p1, p1, Lcom/friday/document/databinding/LayoutNotePreviewBinding;->e:Landroid/widget/ImageView;

    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sget v1, Lcom/friday/document/R$drawable;->ic_error_note_info:I

    .line 22
    .line 23
    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, Lcom/friday/document/databinding/PreviewFragmentBinding;

    .line 35
    .line 36
    iget-object p1, p1, Lcom/friday/document/databinding/PreviewFragmentBinding;->e:Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;

    .line 37
    .line 38
    iget-object p1, p1, Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;->g:Landroid/widget/ImageView;

    .line 39
    .line 40
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    sget v1, Lcom/friday/document/R$drawable;->ic_error_note_info:I

    .line 45
    .line 46
    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_0
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, Lcom/friday/document/databinding/PreviewFragmentBinding;

    .line 59
    .line 60
    iget-object p1, p1, Lcom/friday/document/databinding/PreviewFragmentBinding;->d:Lcom/friday/document/databinding/LayoutNotePreviewBinding;

    .line 61
    .line 62
    iget-object p1, p1, Lcom/friday/document/databinding/LayoutNotePreviewBinding;->e:Landroid/widget/ImageView;

    .line 63
    .line 64
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    sget v1, Lcom/friday/document/R$mipmap;->icon_note_info:I

    .line 69
    .line 70
    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    check-cast p1, Lcom/friday/document/databinding/PreviewFragmentBinding;

    .line 82
    .line 83
    iget-object p1, p1, Lcom/friday/document/databinding/PreviewFragmentBinding;->e:Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;

    .line 84
    .line 85
    iget-object p1, p1, Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;->g:Landroid/widget/ImageView;

    .line 86
    .line 87
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    sget v1, Lcom/friday/document/R$mipmap;->icon_note_info:I

    .line 92
    .line 93
    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 98
    .line 99
    .line 100
    return-void
.end method

.method public static synthetic r(Lcom/friday/document/view/NewestPreviewFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/NewestPreviewFragment;->S(Lcom/friday/document/view/NewestPreviewFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic s()Lcom/friday/document/adapter/PreviewAdapter;
    .locals 1

    .line 1
    invoke-static {}, Lcom/friday/document/view/NewestPreviewFragment;->Y()Lcom/friday/document/adapter/PreviewAdapter;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic t(Lcom/friday/document/view/NewestPreviewFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/NewestPreviewFragment;->U(Lcom/friday/document/view/NewestPreviewFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Lcom/friday/document/view/NewestPreviewFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/NewestPreviewFragment;->T(Lcom/friday/document/view/NewestPreviewFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v(Lcom/friday/document/view/NewestPreviewFragment;ZLcom/friday/common/entity/FileEntity;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/document/view/NewestPreviewFragment;->N(Lcom/friday/document/view/NewestPreviewFragment;ZLcom/friday/common/entity/FileEntity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic w(Lcom/friday/document/view/NewestPreviewFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/NewestPreviewFragment;->W(Lcom/friday/document/view/NewestPreviewFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic x(Lcom/friday/document/view/NewestPreviewFragment;ZLcom/friday/common/entity/FileEntity;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/document/view/NewestPreviewFragment;->M(Lcom/friday/document/view/NewestPreviewFragment;ZLcom/friday/common/entity/FileEntity;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic y(Lcom/friday/document/view/NewestPreviewFragment;Landroid/view/View;Landroid/widget/PopupWindow;Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/document/view/NewestPreviewFragment;->Z(Lcom/friday/document/view/NewestPreviewFragment;Landroid/view/View;Landroid/widget/PopupWindow;Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/friday/document/view/NewestPreviewFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/NewestPreviewFragment;->V(Lcom/friday/document/view/NewestPreviewFragment;Lcom/friday/common/entity/FileEntity;)Lqc/q;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final R()Lcom/friday/document/viewmodel/NewestViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/view/NewestPreviewFragment;->j:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/document/viewmodel/NewestViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public getLayoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/friday/document/R$layout;->preview_fragment:I

    .line 2
    .line 3
    return v0
.end method

.method public initData()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/NewestPreviewFragment;->initView()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lcom/friday/common/helper/b;->v()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lcom/friday/document/databinding/PreviewFragmentBinding;

    .line 21
    .line 22
    iget-object v0, v0, Lcom/friday/document/databinding/PreviewFragmentBinding;->c:Lcom/friday/document/databinding/LayoutEmptyPreviewBinding;

    .line 23
    .line 24
    iget-object v0, v0, Lcom/friday/document/databinding/LayoutEmptyPreviewBinding;->c:Landroid/widget/ImageView;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Lcom/friday/document/databinding/PreviewFragmentBinding;

    .line 35
    .line 36
    iget-object v0, v0, Lcom/friday/document/databinding/PreviewFragmentBinding;->c:Lcom/friday/document/databinding/LayoutEmptyPreviewBinding;

    .line 37
    .line 38
    iget-object v0, v0, Lcom/friday/document/databinding/LayoutEmptyPreviewBinding;->c:Landroid/widget/ImageView;

    .line 39
    .line 40
    new-instance v1, Lu2/r;

    .line 41
    .line 42
    invoke-direct {v1, p0}, Lu2/r;-><init>(Lcom/friday/document/view/NewestPreviewFragment;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    invoke-virtual {p0}, Lcom/friday/document/view/NewestPreviewFragment;->R()Lcom/friday/document/viewmodel/NewestViewModel;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->F()Landroidx/lifecycle/LiveData;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    new-instance v2, Lu2/s;

    .line 61
    .line 62
    invoke-direct {v2, p0}, Lu2/s;-><init>(Lcom/friday/document/view/NewestPreviewFragment;)V

    .line 63
    .line 64
    .line 65
    new-instance v3, Lcom/friday/document/view/NewestPreviewFragment$a;

    .line 66
    .line 67
    invoke-direct {v3, v2}, Lcom/friday/document/view/NewestPreviewFragment$a;-><init>(Lhd/l;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Lcom/friday/document/view/NewestPreviewFragment;->R()Lcom/friday/document/viewmodel/NewestViewModel;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->J()Landroidx/lifecycle/MutableLiveData;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    new-instance v2, Lu2/t;

    .line 86
    .line 87
    invoke-direct {v2, p0}, Lu2/t;-><init>(Lcom/friday/document/view/NewestPreviewFragment;)V

    .line 88
    .line 89
    .line 90
    new-instance v3, Lcom/friday/document/view/NewestPreviewFragment$a;

    .line 91
    .line 92
    invoke-direct {v3, v2}, Lcom/friday/document/view/NewestPreviewFragment$a;-><init>(Lhd/l;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0}, Lcom/friday/document/view/NewestPreviewFragment;->R()Lcom/friday/document/viewmodel/NewestViewModel;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->I()Landroidx/lifecycle/MutableLiveData;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    new-instance v2, Lu2/u;

    .line 111
    .line 112
    invoke-direct {v2, p0}, Lu2/u;-><init>(Lcom/friday/document/view/NewestPreviewFragment;)V

    .line 113
    .line 114
    .line 115
    new-instance v3, Lcom/friday/document/view/NewestPreviewFragment$a;

    .line 116
    .line 117
    invoke-direct {v3, v2}, Lcom/friday/document/view/NewestPreviewFragment$a;-><init>(Lhd/l;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0}, Lcom/friday/document/view/NewestPreviewFragment;->R()Lcom/friday/document/viewmodel/NewestViewModel;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->H()Landroidx/lifecycle/MutableLiveData;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    new-instance v2, Lu2/v;

    .line 136
    .line 137
    invoke-direct {v2, p0}, Lu2/v;-><init>(Lcom/friday/document/view/NewestPreviewFragment;)V

    .line 138
    .line 139
    .line 140
    new-instance v3, Lcom/friday/document/view/NewestPreviewFragment$a;

    .line 141
    .line 142
    invoke-direct {v3, v2}, Lcom/friday/document/view/NewestPreviewFragment$a;-><init>(Lhd/l;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 146
    .line 147
    .line 148
    return-void
.end method

.method public initView()V
    .locals 6

    .line 1
    invoke-super {p0}, Lcom/friday/common/base/BaseFragment;->initView()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/friday/document/view/NewestPreviewFragment;->K()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/friday/document/databinding/PreviewFragmentBinding;

    .line 12
    .line 13
    iget-object v0, v0, Lcom/friday/document/databinding/PreviewFragmentBinding;->d:Lcom/friday/document/databinding/LayoutNotePreviewBinding;

    .line 14
    .line 15
    iget-object v0, v0, Lcom/friday/document/databinding/LayoutNotePreviewBinding;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 16
    .line 17
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0}, Lcom/friday/document/view/NewestPreviewFragment;->Q()Lcom/friday/document/adapter/PreviewAdapter;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Lcom/friday/document/databinding/PreviewFragmentBinding;

    .line 41
    .line 42
    iget-object v0, v0, Lcom/friday/document/databinding/PreviewFragmentBinding;->d:Lcom/friday/document/databinding/LayoutNotePreviewBinding;

    .line 43
    .line 44
    iget-object v0, v0, Lcom/friday/document/databinding/LayoutNotePreviewBinding;->f:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 45
    .line 46
    sget v1, Lcom/friday/document/R$color;->colorAccent:I

    .line 47
    .line 48
    invoke-static {v1}, Lz1/b;->a(I)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    filled-new-array {v1}, [I

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setColorSchemeColors([I)V

    .line 57
    .line 58
    .line 59
    new-instance v1, Lu2/w;

    .line 60
    .line 61
    invoke-direct {v1, p0, v0}, Lu2/w;-><init>(Lcom/friday/document/view/NewestPreviewFragment;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnRefreshListener(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, Lcom/friday/document/databinding/PreviewFragmentBinding;

    .line 72
    .line 73
    iget-object v0, v0, Lcom/friday/document/databinding/PreviewFragmentBinding;->d:Lcom/friday/document/databinding/LayoutNotePreviewBinding;

    .line 74
    .line 75
    iget-object v0, v0, Lcom/friday/document/databinding/LayoutNotePreviewBinding;->d:Landroid/widget/ImageView;

    .line 76
    .line 77
    const-string v1, "ivFullScreen"

    .line 78
    .line 79
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    check-cast v1, Lcom/friday/document/databinding/PreviewFragmentBinding;

    .line 87
    .line 88
    iget-object v1, v1, Lcom/friday/document/databinding/PreviewFragmentBinding;->d:Lcom/friday/document/databinding/LayoutNotePreviewBinding;

    .line 89
    .line 90
    iget-object v1, v1, Lcom/friday/document/databinding/LayoutNotePreviewBinding;->e:Landroid/widget/ImageView;

    .line 91
    .line 92
    const-string v2, "ivNoteInfo"

    .line 93
    .line 94
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    check-cast v2, Lcom/friday/document/databinding/PreviewFragmentBinding;

    .line 102
    .line 103
    iget-object v2, v2, Lcom/friday/document/databinding/PreviewFragmentBinding;->e:Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;

    .line 104
    .line 105
    iget-object v2, v2, Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;->g:Landroid/widget/ImageView;

    .line 106
    .line 107
    const-string v3, "ivNoteInfoOthers"

    .line 108
    .line 109
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    check-cast v3, Lcom/friday/document/databinding/PreviewFragmentBinding;

    .line 117
    .line 118
    iget-object v3, v3, Lcom/friday/document/databinding/PreviewFragmentBinding;->d:Lcom/friday/document/databinding/LayoutNotePreviewBinding;

    .line 119
    .line 120
    iget-object v3, v3, Lcom/friday/document/databinding/LayoutNotePreviewBinding;->c:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 121
    .line 122
    const-string v4, "fabEdit"

    .line 123
    .line 124
    invoke-static {v3, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    const/4 v4, 0x4

    .line 128
    new-array v4, v4, [Landroid/view/View;

    .line 129
    .line 130
    const/4 v5, 0x0

    .line 131
    aput-object v0, v4, v5

    .line 132
    .line 133
    const/4 v0, 0x1

    .line 134
    aput-object v1, v4, v0

    .line 135
    .line 136
    const/4 v0, 0x2

    .line 137
    aput-object v2, v4, v0

    .line 138
    .line 139
    const/4 v0, 0x3

    .line 140
    aput-object v3, v4, v0

    .line 141
    .line 142
    invoke-virtual {p0, v4}, Lcom/friday/common/base/BaseFragment;->setClickListener([Landroid/view/View;)V

    .line 143
    .line 144
    .line 145
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 8

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/friday/common/base/BaseFragment;->onClick(Landroid/view/View;)V

    .line 7
    .line 8
    .line 9
    sget-object v0, Lk2/m;->a:Lk2/m$a;

    .line 10
    .line 11
    invoke-virtual {v0}, Lk2/m$a;->a()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lcom/friday/document/databinding/PreviewFragmentBinding;

    .line 23
    .line 24
    iget-object v0, v0, Lcom/friday/document/databinding/PreviewFragmentBinding;->d:Lcom/friday/document/databinding/LayoutNotePreviewBinding;

    .line 25
    .line 26
    iget-object v0, v0, Lcom/friday/document/databinding/LayoutNotePreviewBinding;->d:Landroid/widget/ImageView;

    .line 27
    .line 28
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    const/4 v1, 0x0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    new-instance v5, Lcom/friday/document/view/NewestPreviewFragment$onClick$1;

    .line 40
    .line 41
    invoke-direct {v5, p0, v1}, Lcom/friday/document/view/NewestPreviewFragment$onClick$1;-><init>(Lcom/friday/document/view/NewestPreviewFragment;Lvc/c;)V

    .line 42
    .line 43
    .line 44
    const/4 v6, 0x3

    .line 45
    const/4 v7, 0x0

    .line 46
    const/4 v3, 0x0

    .line 47
    const/4 v4, 0x0

    .line 48
    invoke-static/range {v2 .. v7}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Lcom/friday/document/databinding/PreviewFragmentBinding;

    .line 57
    .line 58
    iget-object v0, v0, Lcom/friday/document/databinding/PreviewFragmentBinding;->e:Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;

    .line 59
    .line 60
    iget-object v0, v0, Lcom/friday/document/databinding/LayoutNotePreviewOthersBinding;->g:Landroid/widget/ImageView;

    .line 61
    .line 62
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_4

    .line 67
    .line 68
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    check-cast v0, Lcom/friday/document/databinding/PreviewFragmentBinding;

    .line 73
    .line 74
    iget-object v0, v0, Lcom/friday/document/databinding/PreviewFragmentBinding;->d:Lcom/friday/document/databinding/LayoutNotePreviewBinding;

    .line 75
    .line 76
    iget-object v0, v0, Lcom/friday/document/databinding/LayoutNotePreviewBinding;->e:Landroid/widget/ImageView;

    .line 77
    .line 78
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_2

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_2
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, Lcom/friday/document/databinding/PreviewFragmentBinding;

    .line 90
    .line 91
    iget-object v0, v0, Lcom/friday/document/databinding/PreviewFragmentBinding;->d:Lcom/friday/document/databinding/LayoutNotePreviewBinding;

    .line 92
    .line 93
    iget-object v0, v0, Lcom/friday/document/databinding/LayoutNotePreviewBinding;->c:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 94
    .line 95
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    if-eqz p1, :cond_3

    .line 100
    .line 101
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    new-instance v5, Lcom/friday/document/view/NewestPreviewFragment$onClick$2;

    .line 106
    .line 107
    invoke-direct {v5, p0, v1}, Lcom/friday/document/view/NewestPreviewFragment$onClick$2;-><init>(Lcom/friday/document/view/NewestPreviewFragment;Lvc/c;)V

    .line 108
    .line 109
    .line 110
    const/4 v6, 0x3

    .line 111
    const/4 v7, 0x0

    .line 112
    const/4 v3, 0x0

    .line 113
    const/4 v4, 0x0

    .line 114
    invoke-static/range {v2 .. v7}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 115
    .line 116
    .line 117
    :cond_3
    :goto_0
    return-void

    .line 118
    :cond_4
    :goto_1
    new-instance v0, Lm2/a$a;

    .line 119
    .line 120
    new-instance v1, Lm2/a;

    .line 121
    .line 122
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    const-string v3, "requireActivity(...)"

    .line 127
    .line 128
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-direct {v1, v2}, Lm2/a;-><init>(Landroid/content/Context;)V

    .line 132
    .line 133
    .line 134
    invoke-direct {v0, v1}, Lm2/a$a;-><init>(Lm2/a;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getLayoutInflater()Landroid/view/LayoutInflater;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-static {v1}, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->a(Landroid/view/LayoutInflater;)Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    const-string v2, "inflate(...)"

    .line 146
    .line 147
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, v1}, Lm2/a$a;->b(Landroidx/databinding/ViewDataBinding;)Lm2/a$a;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    const/4 v1, 0x1

    .line 155
    invoke-virtual {v0, v1}, Lm2/a$a;->d(Z)Lm2/a$a;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    new-instance v1, Lu2/q;

    .line 160
    .line 161
    invoke-direct {v1, p0}, Lu2/q;-><init>(Lcom/friday/document/view/NewestPreviewFragment;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, v1}, Lm2/a$a;->c(Lhd/q;)Lm2/a$a;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-virtual {v0}, Lm2/a$a;->a()Lm2/a;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    const/16 v1, 0x50

    .line 173
    .line 174
    const/4 v2, 0x0

    .line 175
    invoke-virtual {v0, p1, v2, v2, v1}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;III)V

    .line 176
    .line 177
    .line 178
    return-void
.end method

.method public onResume()V
    .locals 7

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/friday/document/view/NewestPreviewFragment;->Q()Lcom/friday/document/adapter/PreviewAdapter;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lcom/friday/document/adapter/PreviewAdapter;->a()V

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    new-instance v4, Lcom/friday/document/view/NewestPreviewFragment$onResume$1;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {v4, p0, v0}, Lcom/friday/document/view/NewestPreviewFragment$onResume$1;-><init>(Lcom/friday/document/view/NewestPreviewFragment;Lvc/c;)V

    .line 19
    .line 20
    .line 21
    const/4 v5, 0x3

    .line 22
    const/4 v6, 0x0

    .line 23
    const/4 v2, 0x0

    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 26
    .line 27
    .line 28
    return-void
.end method
