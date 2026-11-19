.class public Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBindingImpl;
.super Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBinding;
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

.field private final mboundView0:Landroid/widget/RelativeLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final mboundView1:Landroid/widget/TextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final mboundView2:Landroid/widget/TextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


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
    sget-object v0, Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/4 v2, 0x3

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 3

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    const-wide/16 v1, -0x1

    .line 3
    iput-wide v1, p0, Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBindingImpl;->mDirtyFlags:J

    .line 4
    aget-object p1, p3, v0

    check-cast p1, Landroid/widget/RelativeLayout;

    iput-object p1, p0, Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBindingImpl;->mboundView0:Landroid/widget/RelativeLayout;

    const/4 v0, 0x0

    .line 5
    invoke-virtual {p1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x1

    .line 6
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBindingImpl;->mboundView1:Landroid/widget/TextView;

    .line 7
    invoke-virtual {p1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x2

    .line 8
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBindingImpl;->mboundView2:Landroid/widget/TextView;

    .line 9
    invoke-virtual {p1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 10
    invoke-virtual {p0, p2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 11
    invoke-virtual {p0}, Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBindingImpl;->invalidateAll()V

    return-void
.end method


# virtual methods
.method public executeBindings()V
    .locals 14

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBindingImpl;->mDirtyFlags:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    iput-wide v2, p0, Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBindingImpl;->mDirtyFlags:J

    .line 7
    .line 8
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    iget-boolean v4, p0, Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBinding;->mIsSelected:Z

    .line 10
    .line 11
    iget-object v5, p0, Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBinding;->mClickListener:Landroid/view/View$OnClickListener;

    .line 12
    .line 13
    iget-object v6, p0, Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBinding;->mEntity:Lcom/zykj/study/bean/exercise/ChoiceBean;

    .line 14
    .line 15
    iget-object v7, p0, Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBinding;->mText:Ljava/lang/String;

    .line 16
    .line 17
    const-wide/16 v8, 0x11

    .line 18
    .line 19
    and-long/2addr v8, v0

    .line 20
    cmp-long v8, v8, v2

    .line 21
    .line 22
    if-eqz v8, :cond_0

    .line 23
    .line 24
    xor-int/lit8 v9, v4, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v9, 0x0

    .line 28
    :goto_0
    const-wide/16 v10, 0x12

    .line 29
    .line 30
    and-long/2addr v10, v0

    .line 31
    cmp-long v10, v10, v2

    .line 32
    .line 33
    const-wide/16 v11, 0x14

    .line 34
    .line 35
    and-long/2addr v11, v0

    .line 36
    cmp-long v11, v11, v2

    .line 37
    .line 38
    if-eqz v11, :cond_1

    .line 39
    .line 40
    if-eqz v6, :cond_1

    .line 41
    .line 42
    invoke-virtual {v6}, Lcom/zykj/study/bean/exercise/ChoiceBean;->getShowStatus()Lcom/zykj/study/bean/exercise/ChoiceStatus;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const/4 v6, 0x0

    .line 48
    :goto_1
    const-wide/16 v12, 0x18

    .line 49
    .line 50
    and-long/2addr v0, v12

    .line 51
    cmp-long v0, v0, v2

    .line 52
    .line 53
    if-eqz v10, :cond_2

    .line 54
    .line 55
    iget-object v1, p0, Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBindingImpl;->mboundView0:Landroid/widget/RelativeLayout;

    .line 56
    .line 57
    invoke-virtual {v1, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 58
    .line 59
    .line 60
    :cond_2
    if-eqz v0, :cond_3

    .line 61
    .line 62
    iget-object v0, p0, Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBindingImpl;->mboundView1:Landroid/widget/TextView;

    .line 63
    .line 64
    invoke-static {v0, v7}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 65
    .line 66
    .line 67
    iget-object v0, p0, Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBindingImpl;->mboundView2:Landroid/widget/TextView;

    .line 68
    .line 69
    invoke-static {v0, v7}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 70
    .line 71
    .line 72
    :cond_3
    if-eqz v11, :cond_4

    .line 73
    .line 74
    iget-object v0, p0, Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBindingImpl;->mboundView1:Landroid/widget/TextView;

    .line 75
    .line 76
    invoke-static {v0, v6}, Le5/c;->i(Landroid/widget/TextView;Lcom/zykj/study/bean/exercise/ChoiceStatus;)V

    .line 77
    .line 78
    .line 79
    iget-object v0, p0, Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBindingImpl;->mboundView2:Landroid/widget/TextView;

    .line 80
    .line 81
    invoke-static {v0, v6}, Le5/c;->i(Landroid/widget/TextView;Lcom/zykj/study/bean/exercise/ChoiceStatus;)V

    .line 82
    .line 83
    .line 84
    :cond_4
    if-eqz v8, :cond_5

    .line 85
    .line 86
    iget-object v0, p0, Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBindingImpl;->mboundView1:Landroid/widget/TextView;

    .line 87
    .line 88
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-static {v0, v1}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 93
    .line 94
    .line 95
    iget-object v0, p0, Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBindingImpl;->mboundView2:Landroid/widget/TextView;

    .line 96
    .line 97
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-static {v0, v1}, Lcom/zykj/base/ext/BindingAdaptersKt;->visibleOrGone(Landroid/view/View;Ljava/lang/Boolean;)V

    .line 102
    .line 103
    .line 104
    :cond_5
    return-void

    .line 105
    :catchall_0
    move-exception v0

    .line 106
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 107
    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBindingImpl;->mDirtyFlags:J

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
    const-wide/16 v0, 0x10

    .line 3
    .line 4
    :try_start_0
    iput-wide v0, p0, Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBindingImpl;->mDirtyFlags:J

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

.method public setClickListener(Landroid/view/View$OnClickListener;)V
    .locals 4
    .param p1    # Landroid/view/View$OnClickListener;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBinding;->mClickListener:Landroid/view/View$OnClickListener;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x2

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    const/4 p1, 0x5

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

.method public setEntity(Lcom/zykj/study/bean/exercise/ChoiceBean;)V
    .locals 4
    .param p1    # Lcom/zykj/study/bean/exercise/ChoiceBean;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBinding;->mEntity:Lcom/zykj/study/bean/exercise/ChoiceBean;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x4

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    const/16 p1, 0xf

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

.method public setIsSelected(Z)V
    .locals 4

    .line 1
    iput-boolean p1, p0, Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBinding;->mIsSelected:Z

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x1

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBindingImpl;->mDirtyFlags:J

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

.method public setText(Ljava/lang/String;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBinding;->mText:Ljava/lang/String;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x8

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    const/16 p1, 0x30

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
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-virtual {p0, p1}, Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBindingImpl;->setIsSelected(Z)V

    .line 13
    .line 14
    .line 15
    return v1

    .line 16
    :cond_0
    const/4 v0, 0x5

    .line 17
    if-ne v0, p1, :cond_1

    .line 18
    .line 19
    check-cast p2, Landroid/view/View$OnClickListener;

    .line 20
    .line 21
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBindingImpl;->setClickListener(Landroid/view/View$OnClickListener;)V

    .line 22
    .line 23
    .line 24
    return v1

    .line 25
    :cond_1
    const/16 v0, 0xf

    .line 26
    .line 27
    if-ne v0, p1, :cond_2

    .line 28
    .line 29
    check-cast p2, Lcom/zykj/study/bean/exercise/ChoiceBean;

    .line 30
    .line 31
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBindingImpl;->setEntity(Lcom/zykj/study/bean/exercise/ChoiceBean;)V

    .line 32
    .line 33
    .line 34
    return v1

    .line 35
    :cond_2
    const/16 v0, 0x30

    .line 36
    .line 37
    if-ne v0, p1, :cond_3

    .line 38
    .line 39
    check-cast p2, Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/ViewMultipleChoiceAnimationViewerBindingImpl;->setText(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return v1

    .line 45
    :cond_3
    const/4 p1, 0x0

    .line 46
    return p1
.end method
