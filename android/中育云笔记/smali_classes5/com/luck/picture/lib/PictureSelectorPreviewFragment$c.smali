.class public Lcom/luck/picture/lib/PictureSelectorPreviewFragment$c;
.super Landroidx/recyclerview/widget/ItemTouchHelper$Callback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->O1(Landroid/view/ViewGroup;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;


# direct methods
.method public constructor <init>(Lcom/luck/picture/lib/PictureSelectorPreviewFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$c;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/recyclerview/widget/ItemTouchHelper$Callback;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public clearView(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 8

    .line 1
    iget-object v0, p2, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 2
    .line 3
    const/high16 v1, 0x3f800000    # 1.0f

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$c;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 9
    .line 10
    iget-boolean v1, v0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->K:Z

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    iput-boolean v3, v0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->K:Z

    .line 17
    .line 18
    new-instance v0, Landroid/animation/AnimatorSet;

    .line 19
    .line 20
    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    .line 21
    .line 22
    .line 23
    iget-object v1, p2, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    new-array v5, v4, [F

    .line 27
    .line 28
    fill-array-data v5, :array_0

    .line 29
    .line 30
    .line 31
    const-string v6, "scaleX"

    .line 32
    .line 33
    invoke-static {v1, v6, v5}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iget-object v5, p2, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 38
    .line 39
    new-array v6, v4, [F

    .line 40
    .line 41
    fill-array-data v6, :array_1

    .line 42
    .line 43
    .line 44
    const-string v7, "scaleY"

    .line 45
    .line 46
    invoke-static {v5, v7, v6}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    new-array v4, v4, [Landroid/animation/Animator;

    .line 51
    .line 52
    aput-object v1, v4, v3

    .line 53
    .line 54
    aput-object v5, v4, v2

    .line 55
    .line 56
    invoke-virtual {v0, v4}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 57
    .line 58
    .line 59
    new-instance v1, Landroid/view/animation/LinearInterpolator;

    .line 60
    .line 61
    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 65
    .line 66
    .line 67
    const-wide/16 v4, 0x32

    .line 68
    .line 69
    invoke-virtual {v0, v4, v5}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 73
    .line 74
    .line 75
    new-instance v1, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$c$b;

    .line 76
    .line 77
    invoke-direct {v1, p0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$c$b;-><init>(Lcom/luck/picture/lib/PictureSelectorPreviewFragment$c;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 81
    .line 82
    .line 83
    :cond_0
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/ItemTouchHelper$Callback;->clearView(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    .line 84
    .line 85
    .line 86
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$c;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 87
    .line 88
    iget-object p1, p1, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->M:Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;

    .line 89
    .line 90
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getAbsoluteAdapterPosition()I

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 95
    .line 96
    .line 97
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$c;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 98
    .line 99
    iget-boolean p2, p1, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->u:Z

    .line 100
    .line 101
    if-eqz p2, :cond_2

    .line 102
    .line 103
    iget-object p1, p1, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->M:Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;

    .line 104
    .line 105
    invoke-virtual {p1}, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;->f()I

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    iget-object p2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$c;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 110
    .line 111
    iget-object p2, p2, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->o:Landroidx/viewpager2/widget/ViewPager2;

    .line 112
    .line 113
    invoke-virtual {p2}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 114
    .line 115
    .line 116
    move-result p2

    .line 117
    if-eq p2, p1, :cond_2

    .line 118
    .line 119
    const/4 p2, -0x1

    .line 120
    if-eq p1, p2, :cond_2

    .line 121
    .line 122
    iget-object p2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$c;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 123
    .line 124
    iget-object p2, p2, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->o:Landroidx/viewpager2/widget/ViewPager2;

    .line 125
    .line 126
    invoke-virtual {p2}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    if-eqz p2, :cond_1

    .line 131
    .line 132
    iget-object p2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$c;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 133
    .line 134
    iget-object p2, p2, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->o:Landroidx/viewpager2/widget/ViewPager2;

    .line 135
    .line 136
    const/4 v0, 0x0

    .line 137
    invoke-virtual {p2, v0}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 138
    .line 139
    .line 140
    iget-object p2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$c;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 141
    .line 142
    iget-object v0, p2, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->o:Landroidx/viewpager2/widget/ViewPager2;

    .line 143
    .line 144
    iget-object p2, p2, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->p:Lcom/luck/picture/lib/adapter/PicturePreviewAdapter;

    .line 145
    .line 146
    invoke-virtual {v0, p2}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 147
    .line 148
    .line 149
    :cond_1
    iget-object p2, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$c;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 150
    .line 151
    iget-object p2, p2, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->o:Landroidx/viewpager2/widget/ViewPager2;

    .line 152
    .line 153
    invoke-virtual {p2, p1, v3}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(IZ)V

    .line 154
    .line 155
    .line 156
    :cond_2
    sget-object p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->P0:Lz6/a;

    .line 157
    .line 158
    invoke-virtual {p1}, Lz6/a;->c()Lcom/luck/picture/lib/style/SelectMainStyle;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    invoke-virtual {p1}, Lcom/luck/picture/lib/style/SelectMainStyle;->Z()Z

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    if-eqz p1, :cond_4

    .line 167
    .line 168
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$c;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 169
    .line 170
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    invoke-static {p1}, La7/a;->c(Landroid/app/Activity;)Z

    .line 175
    .line 176
    .line 177
    move-result p1

    .line 178
    if-nez p1, :cond_4

    .line 179
    .line 180
    iget-object p1, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$c;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 181
    .line 182
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->getFragments()Ljava/util/List;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 195
    .line 196
    .line 197
    move-result p2

    .line 198
    if-ge v3, p2, :cond_4

    .line 199
    .line 200
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object p2

    .line 204
    check-cast p2, Landroidx/fragment/app/Fragment;

    .line 205
    .line 206
    instance-of v0, p2, Lcom/luck/picture/lib/basic/PictureCommonFragment;

    .line 207
    .line 208
    if-eqz v0, :cond_3

    .line 209
    .line 210
    check-cast p2, Lcom/luck/picture/lib/basic/PictureCommonFragment;

    .line 211
    .line 212
    invoke-virtual {p2, v2}, Lcom/luck/picture/lib/basic/PictureCommonFragment;->F0(Z)V

    .line 213
    .line 214
    .line 215
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 216
    .line 217
    goto :goto_0

    .line 218
    :cond_4
    return-void

    .line 219
    :array_0
    .array-data 4
        0x3f8ccccd    # 1.1f
        0x3f800000    # 1.0f
    .end array-data

    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    :array_1
    .array-data 4
        0x3f8ccccd    # 1.1f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public getAnimationDuration(Landroidx/recyclerview/widget/RecyclerView;IFF)J
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroidx/recyclerview/widget/ItemTouchHelper$Callback;->getAnimationDuration(Landroidx/recyclerview/widget/RecyclerView;IFF)J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    return-wide p1
.end method

.method public getMovementFlags(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)I
    .locals 0

    .line 1
    iget-object p1, p2, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 2
    .line 3
    const p2, 0x3f333333    # 0.7f

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V

    .line 7
    .line 8
    .line 9
    const/16 p1, 0xc

    .line 10
    .line 11
    const/4 p2, 0x0

    .line 12
    invoke-static {p1, p2}, Landroidx/recyclerview/widget/ItemTouchHelper$Callback;->makeMovementFlags(II)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1
.end method

.method public isLongPressDragEnabled()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public onChildDraw(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;FFIZ)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$c;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 2
    .line 3
    iget-boolean v1, v0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->J:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    iput-boolean v1, v0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->J:Z

    .line 9
    .line 10
    new-instance v0, Landroid/animation/AnimatorSet;

    .line 11
    .line 12
    invoke-direct {v0}, Landroid/animation/AnimatorSet;-><init>()V

    .line 13
    .line 14
    .line 15
    iget-object v2, p3, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    new-array v4, v3, [F

    .line 19
    .line 20
    fill-array-data v4, :array_0

    .line 21
    .line 22
    .line 23
    const-string v5, "scaleX"

    .line 24
    .line 25
    invoke-static {v2, v5, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    iget-object v4, p3, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 30
    .line 31
    new-array v5, v3, [F

    .line 32
    .line 33
    fill-array-data v5, :array_1

    .line 34
    .line 35
    .line 36
    const-string v6, "scaleY"

    .line 37
    .line 38
    invoke-static {v4, v6, v5}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    new-array v3, v3, [Landroid/animation/Animator;

    .line 43
    .line 44
    aput-object v2, v3, v1

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    aput-object v4, v3, v1

    .line 48
    .line 49
    invoke-virtual {v0, v3}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 50
    .line 51
    .line 52
    const-wide/16 v1, 0x32

    .line 53
    .line 54
    invoke-virtual {v0, v1, v2}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 55
    .line 56
    .line 57
    new-instance v1, Landroid/view/animation/LinearInterpolator;

    .line 58
    .line 59
    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v1}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 66
    .line 67
    .line 68
    new-instance v1, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$c$a;

    .line 69
    .line 70
    invoke-direct {v1, p0}, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$c$a;-><init>(Lcom/luck/picture/lib/PictureSelectorPreviewFragment$c;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 74
    .line 75
    .line 76
    :cond_0
    invoke-super/range {p0 .. p7}, Landroidx/recyclerview/widget/ItemTouchHelper$Callback;->onChildDraw(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;FFIZ)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    nop

    .line 81
    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x3f8ccccd    # 1.1f
    .end array-data

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x3f8ccccd    # 1.1f
    .end array-data
.end method

.method public onMove(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getAbsoluteAdapterPosition()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getAbsoluteAdapterPosition()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-ge p1, p2, :cond_1

    .line 10
    .line 11
    move p3, p1

    .line 12
    :goto_0
    if-ge p3, p2, :cond_3

    .line 13
    .line 14
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$c;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 15
    .line 16
    iget-object v0, v0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->M:Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;->getData()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    add-int/lit8 v1, p3, 0x1

    .line 23
    .line 24
    invoke-static {v0, p3, v1}, Ljava/util/Collections;->swap(Ljava/util/List;II)V

    .line 25
    .line 26
    .line 27
    invoke-static {}, Lu6/a;->n()Ljava/util/ArrayList;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0, p3, v1}, Ljava/util/Collections;->swap(Ljava/util/List;II)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$c;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 35
    .line 36
    iget-boolean v2, v0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->u:Z

    .line 37
    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    iget-object v0, v0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->m:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-static {v0, p3, v1}, Ljava/util/Collections;->swap(Ljava/util/List;II)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :catch_0
    move-exception p1

    .line 47
    goto :goto_3

    .line 48
    :cond_0
    :goto_1
    move p3, v1

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    move p3, p1

    .line 51
    :goto_2
    if-le p3, p2, :cond_3

    .line 52
    .line 53
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$c;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 54
    .line 55
    iget-object v0, v0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->M:Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;

    .line 56
    .line 57
    invoke-virtual {v0}, Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;->getData()Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    add-int/lit8 v1, p3, -0x1

    .line 62
    .line 63
    invoke-static {v0, p3, v1}, Ljava/util/Collections;->swap(Ljava/util/List;II)V

    .line 64
    .line 65
    .line 66
    invoke-static {}, Lu6/a;->n()Ljava/util/ArrayList;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {v0, p3, v1}, Ljava/util/Collections;->swap(Ljava/util/List;II)V

    .line 71
    .line 72
    .line 73
    iget-object v0, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$c;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 74
    .line 75
    iget-boolean v2, v0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->u:Z

    .line 76
    .line 77
    if-eqz v2, :cond_2

    .line 78
    .line 79
    iget-object v0, v0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->m:Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-static {v0, p3, v1}, Ljava/util/Collections;->swap(Ljava/util/List;II)V

    .line 82
    .line 83
    .line 84
    :cond_2
    add-int/lit8 p3, p3, -0x1

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_3
    iget-object p3, p0, Lcom/luck/picture/lib/PictureSelectorPreviewFragment$c;->a:Lcom/luck/picture/lib/PictureSelectorPreviewFragment;

    .line 88
    .line 89
    iget-object p3, p3, Lcom/luck/picture/lib/PictureSelectorPreviewFragment;->M:Lcom/luck/picture/lib/adapter/holder/PreviewGalleryAdapter;

    .line 90
    .line 91
    invoke-virtual {p3, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemMoved(II)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 92
    .line 93
    .line 94
    goto :goto_4

    .line 95
    :goto_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 96
    .line 97
    .line 98
    :goto_4
    const/4 p1, 0x1

    .line 99
    return p1
.end method

.method public onSelectedChanged(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/ItemTouchHelper$Callback;->onSelectedChanged(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onSwiped(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    return-void
.end method
