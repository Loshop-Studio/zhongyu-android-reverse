.class public Lcom/zykj/study/databinding/FragmentCourseViewCatalogBindingImpl;
.super Lcom/zykj/study/databinding/FragmentCourseViewCatalogBinding;
.source "SourceFile"


# static fields
.field private static final sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private static final sViewsWithIds:Landroid/util/SparseIntArray;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field


# instance fields
.field private mDirtyFlags:J

.field private final mboundView3:Landroid/widget/TextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final mboundView4:Landroidx/appcompat/widget/AppCompatImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


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
    sput-object v0, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    .line 7
    .line 8
    sget v1, Lcom/zykj/study/R$id;->multiple_status_view:I

    .line 9
    .line 10
    const/4 v2, 0x5

    .line 11
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 12
    .line 13
    .line 14
    sget v1, Lcom/zykj/study/R$id;->recycler:I

    .line 15
    .line 16
    const/4 v2, 0x6

    .line 17
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;)V
    .locals 3
    .param p1    # Landroidx/databinding/DataBindingComponent;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    sget-object v0, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/4 v2, 0x7

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 10

    const/4 v0, 0x0

    .line 2
    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Landroidx/constraintlayout/widget/ConstraintLayout;

    const/4 v0, 0x2

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Landroid/widget/LinearLayout;

    const/4 v0, 0x5

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Lcom/zykj/study/view/MultipleStatusView;

    const/4 v0, 0x6

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Landroidx/recyclerview/widget/RecyclerView;

    const/4 v0, 0x1

    aget-object v0, p3, v0

    move-object v9, v0

    check-cast v9, Landroid/widget/TextView;

    const/4 v4, 0x3

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v9}, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/LinearLayout;Lcom/zykj/study/view/MultipleStatusView;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/TextView;)V

    const-wide/16 p1, -0x1

    .line 3
    iput-wide p1, v1, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBindingImpl;->mDirtyFlags:J

    .line 4
    iget-object p1, v1, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBinding;->container:Landroidx/constraintlayout/widget/ConstraintLayout;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 5
    iget-object p1, v1, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBinding;->imageView35:Landroid/widget/LinearLayout;

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x3

    .line 6
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, v1, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBindingImpl;->mboundView3:Landroid/widget/TextView;

    .line 7
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x4

    .line 8
    aget-object p1, p3, p1

    check-cast p1, Landroidx/appcompat/widget/AppCompatImageView;

    iput-object p1, v1, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBindingImpl;->mboundView4:Landroidx/appcompat/widget/AppCompatImageView;

    .line 9
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 10
    iget-object p1, v1, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBinding;->textView33:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 11
    invoke-virtual {p0, v3}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 12
    invoke-virtual {p0}, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBindingImpl;->invalidateAll()V

    return-void
.end method

.method private onChangeViewModelCourseBeanLiveData(Landroidx/lifecycle/MutableLiveData;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/MutableLiveData<",
            "Lcom/zykj/study/bean/course/CourseBean;",
            ">;I)Z"
        }
    .end annotation

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x2

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0

    .line 12
    const/4 p1, 0x1

    .line 13
    return p1

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    throw p1

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    return p1
.end method

.method private onChangeViewModelCurrentMemberProgressLiveData(Landroidx/lifecycle/MutableLiveData;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/MutableLiveData<",
            "Lcom/zykj/study/bean/teach/GroupMemberProgress;",
            ">;I)Z"
        }
    .end annotation

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x4

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0

    .line 12
    const/4 p1, 0x1

    .line 13
    return p1

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    throw p1

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    return p1
.end method

.method private onChangeViewModelSelectedCatalogBeanLiveData(Landroidx/lifecycle/MutableLiveData;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/MutableLiveData<",
            "Lcom/zykj/study/bean/course/CatalogBean;",
            ">;I)Z"
        }
    .end annotation

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide p1, p0, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v0, 0x1

    .line 7
    .line 8
    or-long/2addr p1, v0

    .line 9
    iput-wide p1, p0, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0

    .line 12
    const/4 p1, 0x1

    .line 13
    return p1

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    throw p1

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    return p1
.end method


# virtual methods
.method public executeBindings()V
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v2, v1, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v4, 0x0

    .line 7
    .line 8
    iput-wide v4, v1, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBindingImpl;->mDirtyFlags:J

    .line 9
    .line 10
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    iget-object v0, v1, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBinding;->mOnClickManage:Landroid/view/View$OnClickListener;

    .line 12
    .line 13
    iget-object v6, v1, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBinding;->mOnClick:Landroid/view/View$OnClickListener;

    .line 14
    .line 15
    iget-object v7, v1, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBinding;->mViewModel:Lcom/zykj/study/viewmodels/CourseViewViewModel;

    .line 16
    .line 17
    const-wide/16 v8, 0x67

    .line 18
    .line 19
    and-long/2addr v8, v2

    .line 20
    cmp-long v8, v8, v4

    .line 21
    .line 22
    const-wide/16 v11, 0x62

    .line 23
    .line 24
    const-wide/16 v13, 0x61

    .line 25
    .line 26
    const/4 v15, 0x0

    .line 27
    const/16 v16, 0x0

    .line 28
    .line 29
    if-eqz v8, :cond_f

    .line 30
    .line 31
    and-long v17, v2, v13

    .line 32
    .line 33
    cmp-long v8, v17, v4

    .line 34
    .line 35
    move-wide/from16 v17, v4

    .line 36
    .line 37
    const/4 v4, 0x1

    .line 38
    if-eqz v8, :cond_7

    .line 39
    .line 40
    if-eqz v7, :cond_0

    .line 41
    .line 42
    invoke-virtual {v7}, Lcom/zykj/study/viewmodels/CourseViewViewModel;->f()Landroidx/lifecycle/MutableLiveData;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move-object/from16 v5, v16

    .line 48
    .line 49
    :goto_0
    invoke-virtual {v1, v15, v5}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 50
    .line 51
    .line 52
    if-eqz v5, :cond_1

    .line 53
    .line 54
    invoke-virtual {v5}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    check-cast v5, Lcom/zykj/study/bean/course/CatalogBean;

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    move-object/from16 v5, v16

    .line 62
    .line 63
    :goto_1
    if-nez v5, :cond_2

    .line 64
    .line 65
    move v5, v4

    .line 66
    goto :goto_2

    .line 67
    :cond_2
    move v5, v15

    .line 68
    :goto_2
    if-eqz v8, :cond_4

    .line 69
    .line 70
    if-eqz v5, :cond_3

    .line 71
    .line 72
    const-wide/16 v19, 0x500

    .line 73
    .line 74
    :goto_3
    or-long v2, v2, v19

    .line 75
    .line 76
    goto :goto_4

    .line 77
    :cond_3
    const-wide/16 v19, 0x280

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_4
    :goto_4
    if-eqz v5, :cond_5

    .line 81
    .line 82
    iget-object v8, v1, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBindingImpl;->mboundView3:Landroid/widget/TextView;

    .line 83
    .line 84
    const-wide/16 v19, 0x64

    .line 85
    .line 86
    sget v9, Lcom/zykj/study/R$color;->white:I

    .line 87
    .line 88
    :goto_5
    invoke-static {v8, v9}, Landroidx/databinding/ViewDataBinding;->getColorFromResource(Landroid/view/View;I)I

    .line 89
    .line 90
    .line 91
    move-result v8

    .line 92
    goto :goto_6

    .line 93
    :cond_5
    const-wide/16 v19, 0x64

    .line 94
    .line 95
    iget-object v8, v1, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBindingImpl;->mboundView3:Landroid/widget/TextView;

    .line 96
    .line 97
    sget v9, Lcom/zykj/study/R$color;->text_label_normal:I

    .line 98
    .line 99
    goto :goto_5

    .line 100
    :goto_6
    if-eqz v5, :cond_6

    .line 101
    .line 102
    iget-object v5, v1, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBinding;->imageView35:Landroid/widget/LinearLayout;

    .line 103
    .line 104
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    sget v9, Lcom/zykj/study/R$drawable;->shape_catalog_complete_pass:I

    .line 109
    .line 110
    :goto_7
    invoke-static {v5, v9}, Landroidx/appcompat/content/res/AppCompatResources;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    goto :goto_8

    .line 115
    :cond_6
    iget-object v5, v1, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBinding;->imageView35:Landroid/widget/LinearLayout;

    .line 116
    .line 117
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    sget v9, Lcom/zykj/study/R$drawable;->shape_catalog_complete_normal:I

    .line 122
    .line 123
    goto :goto_7

    .line 124
    :cond_7
    const-wide/16 v19, 0x64

    .line 125
    .line 126
    move v8, v15

    .line 127
    move-object/from16 v5, v16

    .line 128
    .line 129
    :goto_8
    and-long v9, v2, v11

    .line 130
    .line 131
    cmp-long v9, v9, v17

    .line 132
    .line 133
    if-eqz v9, :cond_a

    .line 134
    .line 135
    if-eqz v7, :cond_8

    .line 136
    .line 137
    invoke-virtual {v7}, Lcom/zykj/study/viewmodels/CourseViewViewModel;->b()Landroidx/lifecycle/MutableLiveData;

    .line 138
    .line 139
    .line 140
    move-result-object v9

    .line 141
    goto :goto_9

    .line 142
    :cond_8
    move-object/from16 v9, v16

    .line 143
    .line 144
    :goto_9
    invoke-virtual {v1, v4, v9}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 145
    .line 146
    .line 147
    if-eqz v9, :cond_9

    .line 148
    .line 149
    invoke-virtual {v9}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    check-cast v4, Lcom/zykj/study/bean/course/CourseBean;

    .line 154
    .line 155
    goto :goto_a

    .line 156
    :cond_9
    move-object/from16 v4, v16

    .line 157
    .line 158
    :goto_a
    if-eqz v4, :cond_a

    .line 159
    .line 160
    invoke-virtual {v4}, Lcom/zykj/study/bean/course/CourseBean;->getTitle()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    goto :goto_b

    .line 165
    :cond_a
    move-object/from16 v4, v16

    .line 166
    .line 167
    :goto_b
    and-long v9, v2, v19

    .line 168
    .line 169
    cmp-long v9, v9, v17

    .line 170
    .line 171
    if-eqz v9, :cond_e

    .line 172
    .line 173
    if-eqz v7, :cond_b

    .line 174
    .line 175
    invoke-virtual {v7}, Lcom/zykj/study/viewmodels/CourseViewViewModel;->c()Landroidx/lifecycle/MutableLiveData;

    .line 176
    .line 177
    .line 178
    move-result-object v7

    .line 179
    goto :goto_c

    .line 180
    :cond_b
    move-object/from16 v7, v16

    .line 181
    .line 182
    :goto_c
    const/4 v9, 0x2

    .line 183
    invoke-virtual {v1, v9, v7}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    .line 184
    .line 185
    .line 186
    if-eqz v7, :cond_c

    .line 187
    .line 188
    invoke-virtual {v7}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v7

    .line 192
    move-object/from16 v16, v7

    .line 193
    .line 194
    check-cast v16, Lcom/zykj/study/bean/teach/GroupMemberProgress;

    .line 195
    .line 196
    :cond_c
    if-eqz v16, :cond_d

    .line 197
    .line 198
    invoke-virtual/range {v16 .. v16}, Lcom/zykj/study/bean/teach/GroupMemberProgress;->getCompleted()I

    .line 199
    .line 200
    .line 201
    move-result v15

    .line 202
    invoke-virtual/range {v16 .. v16}, Lcom/zykj/study/bean/teach/GroupMemberProgress;->getMembers()I

    .line 203
    .line 204
    .line 205
    move-result v7

    .line 206
    goto :goto_d

    .line 207
    :cond_d
    move v7, v15

    .line 208
    :goto_d
    iget-object v9, v1, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBindingImpl;->mboundView3:Landroid/widget/TextView;

    .line 209
    .line 210
    invoke-virtual {v9}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 211
    .line 212
    .line 213
    move-result-object v9

    .line 214
    sget v10, Lcom/zykj/study/R$string;->complete_proportion:I

    .line 215
    .line 216
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 217
    .line 218
    .line 219
    move-result-object v15

    .line 220
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 221
    .line 222
    .line 223
    move-result-object v7

    .line 224
    filled-new-array {v15, v7}, [Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v7

    .line 228
    invoke-virtual {v9, v10, v7}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v16

    .line 232
    :cond_e
    move-object v7, v4

    .line 233
    move v15, v8

    .line 234
    move-object/from16 v4, v16

    .line 235
    .line 236
    goto :goto_e

    .line 237
    :cond_f
    move-wide/from16 v17, v4

    .line 238
    .line 239
    const-wide/16 v19, 0x64

    .line 240
    .line 241
    move-object/from16 v4, v16

    .line 242
    .line 243
    move-object v5, v4

    .line 244
    move-object v7, v5

    .line 245
    :goto_e
    and-long v8, v2, v13

    .line 246
    .line 247
    cmp-long v8, v8, v17

    .line 248
    .line 249
    if-eqz v8, :cond_10

    .line 250
    .line 251
    iget-object v8, v1, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBinding;->imageView35:Landroid/widget/LinearLayout;

    .line 252
    .line 253
    invoke-static {v8, v5}, Landroidx/databinding/adapters/ViewBindingAdapter;->setBackground(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 254
    .line 255
    .line 256
    iget-object v5, v1, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBindingImpl;->mboundView3:Landroid/widget/TextView;

    .line 257
    .line 258
    invoke-virtual {v5, v15}, Landroid/widget/TextView;->setTextColor(I)V

    .line 259
    .line 260
    .line 261
    :cond_10
    const-wide/16 v8, 0x50

    .line 262
    .line 263
    and-long/2addr v8, v2

    .line 264
    cmp-long v5, v8, v17

    .line 265
    .line 266
    if-eqz v5, :cond_11

    .line 267
    .line 268
    iget-object v5, v1, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBinding;->imageView35:Landroid/widget/LinearLayout;

    .line 269
    .line 270
    invoke-virtual {v5, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 271
    .line 272
    .line 273
    :cond_11
    and-long v5, v2, v19

    .line 274
    .line 275
    cmp-long v5, v5, v17

    .line 276
    .line 277
    if-eqz v5, :cond_12

    .line 278
    .line 279
    iget-object v5, v1, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBindingImpl;->mboundView3:Landroid/widget/TextView;

    .line 280
    .line 281
    invoke-static {v5, v4}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 282
    .line 283
    .line 284
    :cond_12
    const-wide/16 v4, 0x48

    .line 285
    .line 286
    and-long/2addr v4, v2

    .line 287
    cmp-long v4, v4, v17

    .line 288
    .line 289
    if-eqz v4, :cond_13

    .line 290
    .line 291
    iget-object v4, v1, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBindingImpl;->mboundView4:Landroidx/appcompat/widget/AppCompatImageView;

    .line 292
    .line 293
    invoke-virtual {v4, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 294
    .line 295
    .line 296
    :cond_13
    and-long/2addr v2, v11

    .line 297
    cmp-long v0, v2, v17

    .line 298
    .line 299
    if-eqz v0, :cond_14

    .line 300
    .line 301
    iget-object v0, v1, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBinding;->textView33:Landroid/widget/TextView;

    .line 302
    .line 303
    invoke-static {v0, v7}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 304
    .line 305
    .line 306
    :cond_14
    return-void

    .line 307
    :catchall_0
    move-exception v0

    .line 308
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 309
    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBindingImpl;->mDirtyFlags:J

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
    const-wide/16 v0, 0x40

    .line 3
    .line 4
    :try_start_0
    iput-wide v0, p0, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBindingImpl;->mDirtyFlags:J

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
    .locals 1

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p1, v0, :cond_1

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-eq p1, v0, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_0
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 12
    .line 13
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBindingImpl;->onChangeViewModelCurrentMemberProgressLiveData(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1

    .line 18
    :cond_1
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 19
    .line 20
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBindingImpl;->onChangeViewModelCourseBeanLiveData(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    return p1

    .line 25
    :cond_2
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    .line 26
    .line 27
    invoke-direct {p0, p2, p3}, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBindingImpl;->onChangeViewModelSelectedCatalogBeanLiveData(Landroidx/lifecycle/MutableLiveData;I)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    return p1
.end method

.method public setOnClick(Landroid/view/View$OnClickListener;)V
    .locals 4
    .param p1    # Landroid/view/View$OnClickListener;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBinding;->mOnClick:Landroid/view/View$OnClickListener;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x10

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    const/16 p1, 0x25

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

.method public setOnClickManage(Landroid/view/View$OnClickListener;)V
    .locals 4
    .param p1    # Landroid/view/View$OnClickListener;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBinding;->mOnClickManage:Landroid/view/View$OnClickListener;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x8

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    const/16 p1, 0x26

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

.method public setVariable(ILjava/lang/Object;)Z
    .locals 2
    .param p2    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    const/16 v0, 0x26

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, p1, :cond_0

    .line 5
    .line 6
    check-cast p2, Landroid/view/View$OnClickListener;

    .line 7
    .line 8
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBindingImpl;->setOnClickManage(Landroid/view/View$OnClickListener;)V

    .line 9
    .line 10
    .line 11
    return v1

    .line 12
    :cond_0
    const/16 v0, 0x25

    .line 13
    .line 14
    if-ne v0, p1, :cond_1

    .line 15
    .line 16
    check-cast p2, Landroid/view/View$OnClickListener;

    .line 17
    .line 18
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBindingImpl;->setOnClick(Landroid/view/View$OnClickListener;)V

    .line 19
    .line 20
    .line 21
    return v1

    .line 22
    :cond_1
    const/16 v0, 0x3b

    .line 23
    .line 24
    if-ne v0, p1, :cond_2

    .line 25
    .line 26
    check-cast p2, Lcom/zykj/study/viewmodels/CourseViewViewModel;

    .line 27
    .line 28
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBindingImpl;->setViewModel(Lcom/zykj/study/viewmodels/CourseViewViewModel;)V

    .line 29
    .line 30
    .line 31
    return v1

    .line 32
    :cond_2
    const/4 p1, 0x0

    .line 33
    return p1
.end method

.method public setViewModel(Lcom/zykj/study/viewmodels/CourseViewViewModel;)V
    .locals 4
    .param p1    # Lcom/zykj/study/viewmodels/CourseViewViewModel;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBinding;->mViewModel:Lcom/zykj/study/viewmodels/CourseViewViewModel;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x20

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/FragmentCourseViewCatalogBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    const/16 p1, 0x3b

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
