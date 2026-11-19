.class public Lcom/zykj/view/databinding/ViewActivityEzyCropBindingImpl;
.super Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;
.source "SourceFile"


# static fields
.field public static final p:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

.field public static final q:Landroid/util/SparseIntArray;


# instance fields
.field public final j:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final k:Landroid/widget/ImageView;

.field public final l:Landroid/widget/TextView;

.field public final m:Landroid/widget/ImageView;

.field public final n:Landroid/widget/TextView;

.field public o:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Landroid/util/SparseIntArray;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/view/databinding/ViewActivityEzyCropBindingImpl;->q:Landroid/util/SparseIntArray;

    .line 7
    .line 8
    sget v1, Lcom/zykj/view/R$id;->cropImageView:I

    .line 9
    .line 10
    const/16 v2, 0x8

    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 13
    .line 14
    .line 15
    sget v1, Lcom/zykj/view/R$id;->cancel:I

    .line 16
    .line 17
    const/16 v2, 0x9

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 20
    .line 21
    .line 22
    sget v1, Lcom/zykj/view/R$id;->confirm_crop:I

    .line 23
    .line 24
    const/16 v2, 0xa

    .line 25
    .line 26
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 27
    .line 28
    .line 29
    sget v1, Lcom/zykj/view/R$id;->rotate:I

    .line 30
    .line 31
    const/16 v2, 0xb

    .line 32
    .line 33
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 34
    .line 35
    .line 36
    sget v1, Lcom/zykj/view/R$id;->iv_tip:I

    .line 37
    .line 38
    const/16 v2, 0xc

    .line 39
    .line 40
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/zykj/view/databinding/ViewActivityEzyCropBindingImpl;->p:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/zykj/view/databinding/ViewActivityEzyCropBindingImpl;->q:Landroid/util/SparseIntArray;

    const/16 v2, 0xd

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/view/databinding/ViewActivityEzyCropBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 12

    const/16 v0, 0x9

    .line 2
    aget-object v0, p3, v0

    move-object v4, v0

    check-cast v4, Landroid/widget/LinearLayout;

    const/16 v0, 0xa

    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Landroid/widget/FrameLayout;

    const/4 v0, 0x6

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Landroid/view/View;

    const/4 v0, 0x1

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Landroidx/constraintlayout/widget/ConstraintLayout;

    const/16 v0, 0x8

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Lcom/canhub/cropper/CropImageView;

    const/16 v0, 0xc

    aget-object v0, p3, v0

    move-object v9, v0

    check-cast v9, Landroid/widget/ImageView;

    const/16 v0, 0xb

    aget-object v0, p3, v0

    move-object v10, v0

    check-cast v10, Landroid/widget/LinearLayout;

    const/4 v0, 0x7

    aget-object v0, p3, v0

    move-object v11, v0

    check-cast v11, Landroid/widget/TextView;

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v11}, Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/LinearLayout;Landroid/widget/FrameLayout;Landroid/view/View;Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/canhub/cropper/CropImageView;Landroid/widget/ImageView;Landroid/widget/LinearLayout;Landroid/widget/TextView;)V

    const-wide/16 v1, -0x1

    .line 3
    iput-wide v1, p0, Lcom/zykj/view/databinding/ViewActivityEzyCropBindingImpl;->o:J

    .line 4
    iget-object v1, p0, Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;->c:Landroid/view/View;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 5
    iget-object v1, p0, Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;->d:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 v1, 0x0

    .line 6
    aget-object v1, p3, v1

    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object v1, p0, Lcom/zykj/view/databinding/ViewActivityEzyCropBindingImpl;->j:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 7
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 v1, 0x2

    .line 8
    aget-object v1, p3, v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/zykj/view/databinding/ViewActivityEzyCropBindingImpl;->k:Landroid/widget/ImageView;

    .line 9
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 v1, 0x3

    .line 10
    aget-object v1, p3, v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/zykj/view/databinding/ViewActivityEzyCropBindingImpl;->l:Landroid/widget/TextView;

    .line 11
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 v1, 0x4

    .line 12
    aget-object v1, p3, v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/zykj/view/databinding/ViewActivityEzyCropBindingImpl;->m:Landroid/widget/ImageView;

    .line 13
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 v1, 0x5

    .line 14
    aget-object v1, p3, v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/zykj/view/databinding/ViewActivityEzyCropBindingImpl;->n:Landroid/widget/TextView;

    .line 15
    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 16
    iget-object v1, p0, Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;->h:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 17
    invoke-virtual {p0, p2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 18
    invoke-virtual {p0}, Lcom/zykj/view/databinding/ViewActivityEzyCropBindingImpl;->invalidateAll()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 4

    .line 1
    iput-boolean p1, p0, Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;->i:Z

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/view/databinding/ViewActivityEzyCropBindingImpl;->o:J

    .line 5
    .line 6
    const-wide/16 v2, 0x1

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/view/databinding/ViewActivityEzyCropBindingImpl;->o:J

    .line 10
    .line 11
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    sget p1, La7/a;->b:I

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Landroidx/databinding/BaseObservable;->notifyPropertyChanged(I)V

    .line 15
    .line 16
    .line 17
    invoke-super {p0}, Landroidx/databinding/ViewDataBinding;->requestRebind()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    throw p1
.end method

.method public executeBindings()V
    .locals 15

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/view/databinding/ViewActivityEzyCropBindingImpl;->o:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    iput-wide v2, p0, Lcom/zykj/view/databinding/ViewActivityEzyCropBindingImpl;->o:J

    .line 7
    .line 8
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    iget-boolean v4, p0, Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;->i:Z

    .line 10
    .line 11
    const-wide/16 v5, 0x3

    .line 12
    .line 13
    and-long v7, v0, v5

    .line 14
    .line 15
    cmp-long v7, v7, v2

    .line 16
    .line 17
    if-eqz v7, :cond_a

    .line 18
    .line 19
    if-eqz v7, :cond_1

    .line 20
    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    const-wide/32 v7, 0x2aaa8

    .line 24
    .line 25
    .line 26
    :goto_0
    or-long/2addr v0, v7

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    const-wide/32 v7, 0x15554

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    :goto_1
    iget-object v7, p0, Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;->c:Landroid/view/View;

    .line 33
    .line 34
    if-eqz v4, :cond_2

    .line 35
    .line 36
    sget v8, Lcom/zykj/view/R$color;->frame_gray:I

    .line 37
    .line 38
    :goto_2
    invoke-static {v7, v8}, Landroidx/databinding/ViewDataBinding;->getColorFromResource(Landroid/view/View;I)I

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    goto :goto_3

    .line 43
    :cond_2
    sget v8, Lcom/zykj/view/R$color;->guide_line_color:I

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :goto_3
    iget-object v8, p0, Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;->h:Landroid/widget/TextView;

    .line 47
    .line 48
    if-eqz v4, :cond_3

    .line 49
    .line 50
    sget v9, Lcom/zykj/view/R$color;->view_crop_content_light:I

    .line 51
    .line 52
    :goto_4
    invoke-static {v8, v9}, Landroidx/databinding/ViewDataBinding;->getColorFromResource(Landroid/view/View;I)I

    .line 53
    .line 54
    .line 55
    move-result v8

    .line 56
    goto :goto_5

    .line 57
    :cond_3
    sget v9, Lcom/zykj/view/R$color;->view_crop_content_dark:I

    .line 58
    .line 59
    goto :goto_4

    .line 60
    :goto_5
    iget-object v9, p0, Lcom/zykj/view/databinding/ViewActivityEzyCropBindingImpl;->l:Landroid/widget/TextView;

    .line 61
    .line 62
    if-eqz v4, :cond_4

    .line 63
    .line 64
    sget v10, Lcom/zykj/view/R$color;->view_crop_content_light:I

    .line 65
    .line 66
    :goto_6
    invoke-static {v9, v10}, Landroidx/databinding/ViewDataBinding;->getColorFromResource(Landroid/view/View;I)I

    .line 67
    .line 68
    .line 69
    move-result v9

    .line 70
    goto :goto_7

    .line 71
    :cond_4
    sget v10, Lcom/zykj/view/R$color;->view_crop_content_dark:I

    .line 72
    .line 73
    goto :goto_6

    .line 74
    :goto_7
    iget-object v10, p0, Lcom/zykj/view/databinding/ViewActivityEzyCropBindingImpl;->k:Landroid/widget/ImageView;

    .line 75
    .line 76
    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 77
    .line 78
    .line 79
    move-result-object v10

    .line 80
    if-eqz v4, :cond_5

    .line 81
    .line 82
    sget v11, Lcom/zykj/view/R$drawable;->view_icon_crop_cancel_light:I

    .line 83
    .line 84
    :goto_8
    invoke-static {v10, v11}, Landroidx/appcompat/content/res/AppCompatResources;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 85
    .line 86
    .line 87
    move-result-object v10

    .line 88
    goto :goto_9

    .line 89
    :cond_5
    sget v11, Lcom/zykj/view/R$drawable;->selector_icon_cancel:I

    .line 90
    .line 91
    goto :goto_8

    .line 92
    :goto_9
    iget-object v11, p0, Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;->d:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 93
    .line 94
    if-eqz v4, :cond_6

    .line 95
    .line 96
    sget v12, Lcom/zykj/view/R$color;->view_crop_background_light:I

    .line 97
    .line 98
    :goto_a
    invoke-static {v11, v12}, Landroidx/databinding/ViewDataBinding;->getColorFromResource(Landroid/view/View;I)I

    .line 99
    .line 100
    .line 101
    move-result v11

    .line 102
    goto :goto_b

    .line 103
    :cond_6
    sget v12, Lcom/zykj/view/R$color;->view_crop_background_dark:I

    .line 104
    .line 105
    goto :goto_a

    .line 106
    :goto_b
    iget-object v12, p0, Lcom/zykj/view/databinding/ViewActivityEzyCropBindingImpl;->j:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 107
    .line 108
    if-eqz v4, :cond_7

    .line 109
    .line 110
    sget v13, Lcom/zykj/view/R$color;->view_crop_background_light:I

    .line 111
    .line 112
    :goto_c
    invoke-static {v12, v13}, Landroidx/databinding/ViewDataBinding;->getColorFromResource(Landroid/view/View;I)I

    .line 113
    .line 114
    .line 115
    move-result v12

    .line 116
    goto :goto_d

    .line 117
    :cond_7
    sget v13, Lcom/zykj/view/R$color;->view_crop_background_dark:I

    .line 118
    .line 119
    goto :goto_c

    .line 120
    :goto_d
    iget-object v13, p0, Lcom/zykj/view/databinding/ViewActivityEzyCropBindingImpl;->m:Landroid/widget/ImageView;

    .line 121
    .line 122
    invoke-virtual {v13}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 123
    .line 124
    .line 125
    move-result-object v13

    .line 126
    if-eqz v4, :cond_8

    .line 127
    .line 128
    sget v14, Lcom/zykj/view/R$drawable;->view_icon_crop_rotate_light:I

    .line 129
    .line 130
    :goto_e
    invoke-static {v13, v14}, Landroidx/appcompat/content/res/AppCompatResources;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 131
    .line 132
    .line 133
    move-result-object v13

    .line 134
    goto :goto_f

    .line 135
    :cond_8
    sget v14, Lcom/zykj/view/R$drawable;->view_icon_rotate:I

    .line 136
    .line 137
    goto :goto_e

    .line 138
    :goto_f
    if-eqz v4, :cond_9

    .line 139
    .line 140
    iget-object v4, p0, Lcom/zykj/view/databinding/ViewActivityEzyCropBindingImpl;->n:Landroid/widget/TextView;

    .line 141
    .line 142
    sget v14, Lcom/zykj/view/R$color;->view_crop_content_light:I

    .line 143
    .line 144
    :goto_10
    invoke-static {v4, v14}, Landroidx/databinding/ViewDataBinding;->getColorFromResource(Landroid/view/View;I)I

    .line 145
    .line 146
    .line 147
    move-result v4

    .line 148
    goto :goto_11

    .line 149
    :cond_9
    iget-object v4, p0, Lcom/zykj/view/databinding/ViewActivityEzyCropBindingImpl;->n:Landroid/widget/TextView;

    .line 150
    .line 151
    sget v14, Lcom/zykj/view/R$color;->view_crop_content_dark:I

    .line 152
    .line 153
    goto :goto_10

    .line 154
    :cond_a
    const/4 v10, 0x0

    .line 155
    const/4 v7, 0x0

    .line 156
    move v4, v7

    .line 157
    move v8, v4

    .line 158
    move v9, v8

    .line 159
    move v11, v9

    .line 160
    move v12, v11

    .line 161
    move-object v13, v10

    .line 162
    :goto_11
    and-long/2addr v0, v5

    .line 163
    cmp-long v0, v0, v2

    .line 164
    .line 165
    if-eqz v0, :cond_b

    .line 166
    .line 167
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;->c:Landroid/view/View;

    .line 168
    .line 169
    invoke-static {v7}, Landroidx/databinding/adapters/Converters;->convertColorToDrawable(I)Landroid/graphics/drawable/ColorDrawable;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    invoke-static {v0, v1}, Landroidx/databinding/adapters/ViewBindingAdapter;->setBackground(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 174
    .line 175
    .line 176
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;->d:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 177
    .line 178
    invoke-static {v11}, Landroidx/databinding/adapters/Converters;->convertColorToDrawable(I)Landroid/graphics/drawable/ColorDrawable;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    invoke-static {v0, v1}, Landroidx/databinding/adapters/ViewBindingAdapter;->setBackground(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 183
    .line 184
    .line 185
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewActivityEzyCropBindingImpl;->j:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 186
    .line 187
    invoke-static {v12}, Landroidx/databinding/adapters/Converters;->convertColorToDrawable(I)Landroid/graphics/drawable/ColorDrawable;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    invoke-static {v0, v1}, Landroidx/databinding/adapters/ViewBindingAdapter;->setBackground(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 192
    .line 193
    .line 194
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewActivityEzyCropBindingImpl;->k:Landroid/widget/ImageView;

    .line 195
    .line 196
    invoke-static {v0, v10}, Landroidx/databinding/adapters/ImageViewBindingAdapter;->setImageDrawable(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V

    .line 197
    .line 198
    .line 199
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewActivityEzyCropBindingImpl;->l:Landroid/widget/TextView;

    .line 200
    .line 201
    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 202
    .line 203
    .line 204
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewActivityEzyCropBindingImpl;->m:Landroid/widget/ImageView;

    .line 205
    .line 206
    invoke-static {v0, v13}, Landroidx/databinding/adapters/ImageViewBindingAdapter;->setImageDrawable(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V

    .line 207
    .line 208
    .line 209
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewActivityEzyCropBindingImpl;->n:Landroid/widget/TextView;

    .line 210
    .line 211
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 212
    .line 213
    .line 214
    iget-object v0, p0, Lcom/zykj/view/databinding/ViewActivityEzyCropBinding;->h:Landroid/widget/TextView;

    .line 215
    .line 216
    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setTextColor(I)V

    .line 217
    .line 218
    .line 219
    :cond_b
    return-void

    .line 220
    :catchall_0
    move-exception v0

    .line 221
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 222
    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/view/databinding/ViewActivityEzyCropBindingImpl;->o:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    monitor-exit p0

    .line 12
    return v0

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    monitor-exit p0

    .line 16
    const/4 v0, 0x0

    .line 17
    return v0

    .line 18
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    throw v0
.end method

.method public invalidateAll()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    const-wide/16 v0, 0x2

    .line 3
    .line 4
    :try_start_0
    iput-wide v0, p0, Lcom/zykj/view/databinding/ViewActivityEzyCropBindingImpl;->o:J

    .line 5
    .line 6
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    invoke-virtual {p0}, Landroidx/databinding/ViewDataBinding;->requestRebind()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception v0

    .line 12
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 13
    throw v0
.end method

.method public onFieldChange(ILjava/lang/Object;I)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public setVariable(ILjava/lang/Object;)Z
    .locals 1

    .line 1
    sget v0, La7/a;->b:I

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    check-cast p2, Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-virtual {p0, p1}, Lcom/zykj/view/databinding/ViewActivityEzyCropBindingImpl;->a(Z)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    return p1

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return p1
.end method
