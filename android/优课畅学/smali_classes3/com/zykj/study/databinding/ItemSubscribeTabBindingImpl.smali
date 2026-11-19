.class public Lcom/zykj/study/databinding/ItemSubscribeTabBindingImpl;
.super Lcom/zykj/study/databinding/ItemSubscribeTabBinding;
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


# direct methods
.method static constructor <clinit>()V
    .locals 0

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
    sget-object v0, Lcom/zykj/study/databinding/ItemSubscribeTabBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/zykj/study/databinding/ItemSubscribeTabBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/4 v2, 0x1

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/study/databinding/ItemSubscribeTabBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 2

    const/4 v0, 0x0

    .line 2
    aget-object p3, p3, v0

    check-cast p3, Landroidx/appcompat/widget/AppCompatTextView;

    invoke-direct {p0, p1, p2, v0, p3}, Lcom/zykj/study/databinding/ItemSubscribeTabBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroidx/appcompat/widget/AppCompatTextView;)V

    const-wide/16 v0, -0x1

    .line 3
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemSubscribeTabBindingImpl;->mDirtyFlags:J

    .line 4
    iget-object p1, p0, Lcom/zykj/study/databinding/ItemSubscribeTabBinding;->tvTitle:Landroidx/appcompat/widget/AppCompatTextView;

    const/4 p3, 0x0

    invoke-virtual {p1, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 5
    invoke-virtual {p0, p2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 6
    invoke-virtual {p0}, Lcom/zykj/study/databinding/ItemSubscribeTabBindingImpl;->invalidateAll()V

    return-void
.end method


# virtual methods
.method public executeBindings()V
    .locals 13

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemSubscribeTabBindingImpl;->mDirtyFlags:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    iput-wide v2, p0, Lcom/zykj/study/databinding/ItemSubscribeTabBindingImpl;->mDirtyFlags:J

    .line 7
    .line 8
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    iget-object v4, p0, Lcom/zykj/study/databinding/ItemSubscribeTabBinding;->mIsSelected:Ljava/lang/Boolean;

    .line 10
    .line 11
    iget-object v5, p0, Lcom/zykj/study/databinding/ItemSubscribeTabBinding;->mOnClick:Landroid/view/View$OnClickListener;

    .line 12
    .line 13
    iget-object v6, p0, Lcom/zykj/study/databinding/ItemSubscribeTabBinding;->mTitle:Ljava/lang/String;

    .line 14
    .line 15
    const-wide/16 v7, 0x9

    .line 16
    .line 17
    and-long v9, v0, v7

    .line 18
    .line 19
    cmp-long v9, v9, v2

    .line 20
    .line 21
    if-eqz v9, :cond_4

    .line 22
    .line 23
    invoke-static {v4}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-eqz v9, :cond_1

    .line 28
    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    const-wide/16 v9, 0xa0

    .line 32
    .line 33
    :goto_0
    or-long/2addr v0, v9

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    const-wide/16 v9, 0x50

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    :goto_1
    iget-object v9, p0, Lcom/zykj/study/databinding/ItemSubscribeTabBinding;->tvTitle:Landroidx/appcompat/widget/AppCompatTextView;

    .line 39
    .line 40
    if-eqz v4, :cond_2

    .line 41
    .line 42
    sget v10, Lcom/zykj/study/R$color;->subscribe_tab_bg_select:I

    .line 43
    .line 44
    :goto_2
    invoke-static {v9, v10}, Landroidx/databinding/ViewDataBinding;->getColorFromResource(Landroid/view/View;I)I

    .line 45
    .line 46
    .line 47
    move-result v9

    .line 48
    goto :goto_3

    .line 49
    :cond_2
    sget v10, Lcom/zykj/study/R$color;->subscribe_tab_bg_normal:I

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :goto_3
    if-eqz v4, :cond_3

    .line 53
    .line 54
    iget-object v4, p0, Lcom/zykj/study/databinding/ItemSubscribeTabBinding;->tvTitle:Landroidx/appcompat/widget/AppCompatTextView;

    .line 55
    .line 56
    sget v10, Lcom/zykj/study/R$color;->subscribe_tab_text_select:I

    .line 57
    .line 58
    :goto_4
    invoke-static {v4, v10}, Landroidx/databinding/ViewDataBinding;->getColorFromResource(Landroid/view/View;I)I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    goto :goto_5

    .line 63
    :cond_3
    iget-object v4, p0, Lcom/zykj/study/databinding/ItemSubscribeTabBinding;->tvTitle:Landroidx/appcompat/widget/AppCompatTextView;

    .line 64
    .line 65
    sget v10, Lcom/zykj/study/R$color;->subscribe_tab_text_normal:I

    .line 66
    .line 67
    goto :goto_4

    .line 68
    :cond_4
    const/4 v9, 0x0

    .line 69
    move v4, v9

    .line 70
    :goto_5
    const-wide/16 v10, 0xa

    .line 71
    .line 72
    and-long/2addr v10, v0

    .line 73
    cmp-long v10, v10, v2

    .line 74
    .line 75
    const-wide/16 v11, 0xc

    .line 76
    .line 77
    and-long/2addr v11, v0

    .line 78
    cmp-long v11, v11, v2

    .line 79
    .line 80
    and-long/2addr v0, v7

    .line 81
    cmp-long v0, v0, v2

    .line 82
    .line 83
    if-eqz v0, :cond_5

    .line 84
    .line 85
    iget-object v0, p0, Lcom/zykj/study/databinding/ItemSubscribeTabBinding;->tvTitle:Landroidx/appcompat/widget/AppCompatTextView;

    .line 86
    .line 87
    invoke-static {v9}, Landroidx/databinding/adapters/Converters;->convertColorToDrawable(I)Landroid/graphics/drawable/ColorDrawable;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-static {v0, v1}, Landroidx/databinding/adapters/ViewBindingAdapter;->setBackground(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 92
    .line 93
    .line 94
    iget-object v0, p0, Lcom/zykj/study/databinding/ItemSubscribeTabBinding;->tvTitle:Landroidx/appcompat/widget/AppCompatTextView;

    .line 95
    .line 96
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 97
    .line 98
    .line 99
    :cond_5
    if-eqz v10, :cond_6

    .line 100
    .line 101
    iget-object v0, p0, Lcom/zykj/study/databinding/ItemSubscribeTabBinding;->tvTitle:Landroidx/appcompat/widget/AppCompatTextView;

    .line 102
    .line 103
    invoke-virtual {v0, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 104
    .line 105
    .line 106
    :cond_6
    if-eqz v11, :cond_7

    .line 107
    .line 108
    iget-object v0, p0, Lcom/zykj/study/databinding/ItemSubscribeTabBinding;->tvTitle:Landroidx/appcompat/widget/AppCompatTextView;

    .line 109
    .line 110
    invoke-static {v0, v6}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 111
    .line 112
    .line 113
    :cond_7
    return-void

    .line 114
    :catchall_0
    move-exception v0

    .line 115
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 116
    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemSubscribeTabBindingImpl;->mDirtyFlags:J

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
    const-wide/16 v0, 0x8

    .line 3
    .line 4
    :try_start_0
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemSubscribeTabBindingImpl;->mDirtyFlags:J

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

.method public setIsSelected(Ljava/lang/Boolean;)V
    .locals 4
    .param p1    # Ljava/lang/Boolean;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/study/databinding/ItemSubscribeTabBinding;->mIsSelected:Ljava/lang/Boolean;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemSubscribeTabBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x1

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemSubscribeTabBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    const/16 p1, 0x1c

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

.method public setOnClick(Landroid/view/View$OnClickListener;)V
    .locals 4
    .param p1    # Landroid/view/View$OnClickListener;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/study/databinding/ItemSubscribeTabBinding;->mOnClick:Landroid/view/View$OnClickListener;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemSubscribeTabBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x2

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemSubscribeTabBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    const/4 p1, 0x1

    .line 13
    invoke-virtual {p0, p1}, Landroidx/databinding/BaseObservable;->notifyPropertyChanged(I)V

    .line 14
    .line 15
    .line 16
    invoke-super {p0}, Landroidx/databinding/ViewDataBinding;->requestRebind()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    throw p1
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/study/databinding/ItemSubscribeTabBinding;->mTitle:Ljava/lang/String;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ItemSubscribeTabBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x4

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/ItemSubscribeTabBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    const/16 p1, 0x32

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
    const/16 v0, 0x1c

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, p1, :cond_0

    .line 5
    .line 6
    check-cast p2, Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/ItemSubscribeTabBindingImpl;->setIsSelected(Ljava/lang/Boolean;)V

    .line 9
    .line 10
    .line 11
    return v1

    .line 12
    :cond_0
    if-ne v1, p1, :cond_1

    .line 13
    .line 14
    check-cast p2, Landroid/view/View$OnClickListener;

    .line 15
    .line 16
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/ItemSubscribeTabBindingImpl;->setOnClick(Landroid/view/View$OnClickListener;)V

    .line 17
    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    const/16 v0, 0x32

    .line 21
    .line 22
    if-ne v0, p1, :cond_2

    .line 23
    .line 24
    check-cast p2, Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/ItemSubscribeTabBindingImpl;->setTitle(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return v1

    .line 30
    :cond_2
    const/4 p1, 0x0

    .line 31
    return p1
.end method
