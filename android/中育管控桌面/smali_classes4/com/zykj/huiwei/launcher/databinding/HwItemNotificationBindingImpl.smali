.class public Lcom/zykj/huiwei/launcher/databinding/HwItemNotificationBindingImpl;
.super Lcom/zykj/huiwei/launcher/databinding/HwItemNotificationBinding;
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

.field private final mboundView0:Landroidx/constraintlayout/widget/ConstraintLayout;
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
    sget-object v0, Lcom/zykj/huiwei/launcher/databinding/HwItemNotificationBindingImpl;->sIncludes:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/zykj/huiwei/launcher/databinding/HwItemNotificationBindingImpl;->sViewsWithIds:Landroid/util/SparseIntArray;

    const/4 v2, 0x4

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/huiwei/launcher/databinding/HwItemNotificationBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 8

    const/4 v0, 0x1

    .line 2
    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Lcom/google/android/material/imageview/ShapeableImageView;

    const/4 v0, 0x3

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Landroid/widget/TextView;

    const/4 v0, 0x2

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Landroid/widget/TextView;

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v7}, Lcom/zykj/huiwei/launcher/databinding/HwItemNotificationBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILcom/google/android/material/imageview/ShapeableImageView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    const-wide/16 p1, -0x1

    .line 3
    iput-wide p1, v1, Lcom/zykj/huiwei/launcher/databinding/HwItemNotificationBindingImpl;->mDirtyFlags:J

    .line 4
    iget-object p1, v1, Lcom/zykj/huiwei/launcher/databinding/HwItemNotificationBinding;->ivAvatar:Lcom/google/android/material/imageview/ShapeableImageView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x0

    .line 5
    aget-object p1, p3, p1

    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p1, v1, Lcom/zykj/huiwei/launcher/databinding/HwItemNotificationBindingImpl;->mboundView0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 6
    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 7
    iget-object p1, v1, Lcom/zykj/huiwei/launcher/databinding/HwItemNotificationBinding;->tvContent:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 8
    iget-object p1, v1, Lcom/zykj/huiwei/launcher/databinding/HwItemNotificationBinding;->tvTitle:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 9
    invoke-virtual {p0, v3}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 10
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/databinding/HwItemNotificationBindingImpl;->invalidateAll()V

    return-void
.end method


# virtual methods
.method public executeBindings()V
    .locals 15

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwItemNotificationBindingImpl;->mDirtyFlags:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    iput-wide v2, p0, Lcom/zykj/huiwei/launcher/databinding/HwItemNotificationBindingImpl;->mDirtyFlags:J

    .line 7
    .line 8
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    iget-object v4, p0, Lcom/zykj/huiwei/launcher/databinding/HwItemNotificationBinding;->mMessageInfo:Lcom/zykj/huiwei/launcher/bean/resp/MessageInfo;

    .line 10
    .line 11
    iget-object v5, p0, Lcom/zykj/huiwei/launcher/databinding/HwItemNotificationBinding;->mClickListener:Landroid/view/View$OnClickListener;

    .line 12
    .line 13
    const-wide/16 v6, 0x5

    .line 14
    .line 15
    and-long v8, v0, v6

    .line 16
    .line 17
    cmp-long v8, v8, v2

    .line 18
    .line 19
    const/4 v9, 0x0

    .line 20
    if-eqz v8, :cond_5

    .line 21
    .line 22
    if-eqz v4, :cond_0

    .line 23
    .line 24
    invoke-virtual {v4}, Lcom/zykj/huiwei/launcher/bean/resp/MessageInfo;->getCreationTime()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v10

    .line 28
    invoke-virtual {v4}, Lcom/zykj/huiwei/launcher/bean/resp/MessageInfo;->getTitle()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v11

    .line 32
    invoke-virtual {v4}, Lcom/zykj/huiwei/launcher/bean/resp/MessageInfo;->isRead()Z

    .line 33
    .line 34
    .line 35
    move-result v12

    .line 36
    invoke-virtual {v4}, Lcom/zykj/huiwei/launcher/bean/resp/MessageInfo;->getSenderInfo()Lcom/zykj/huiwei/launcher/bean/resp/SenderInfo;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const/4 v12, 0x0

    .line 42
    move-object v4, v9

    .line 43
    move-object v10, v4

    .line 44
    move-object v11, v10

    .line 45
    :goto_0
    if-eqz v8, :cond_2

    .line 46
    .line 47
    if-eqz v12, :cond_1

    .line 48
    .line 49
    const-wide/16 v13, 0x50

    .line 50
    .line 51
    :goto_1
    or-long/2addr v0, v13

    .line 52
    goto :goto_2

    .line 53
    :cond_1
    const-wide/16 v13, 0x28

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    :goto_2
    if-eqz v12, :cond_3

    .line 57
    .line 58
    const-string v8, "#CECECE"

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_3
    const-string v8, "#333333"

    .line 62
    .line 63
    :goto_3
    if-eqz v12, :cond_4

    .line 64
    .line 65
    const-string v12, "#CECECE"

    .line 66
    .line 67
    goto :goto_4

    .line 68
    :cond_4
    const-string v12, "#999999"

    .line 69
    .line 70
    :goto_4
    if-eqz v4, :cond_6

    .line 71
    .line 72
    invoke-virtual {v4}, Lcom/zykj/huiwei/launcher/bean/resp/SenderInfo;->getPicture()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v9

    .line 76
    goto :goto_5

    .line 77
    :cond_5
    move-object v8, v9

    .line 78
    move-object v10, v8

    .line 79
    move-object v11, v10

    .line 80
    move-object v12, v11

    .line 81
    :cond_6
    :goto_5
    const-wide/16 v13, 0x6

    .line 82
    .line 83
    and-long/2addr v13, v0

    .line 84
    cmp-long v4, v13, v2

    .line 85
    .line 86
    and-long/2addr v0, v6

    .line 87
    cmp-long v0, v0, v2

    .line 88
    .line 89
    if-eqz v0, :cond_7

    .line 90
    .line 91
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwItemNotificationBinding;->ivAvatar:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 92
    .line 93
    invoke-static {v0, v9}, Li4/h;->b(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwItemNotificationBinding;->tvContent:Landroid/widget/TextView;

    .line 97
    .line 98
    invoke-static {v0, v10}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 99
    .line 100
    .line 101
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwItemNotificationBinding;->tvContent:Landroid/widget/TextView;

    .line 102
    .line 103
    invoke-static {v0, v12}, Li4/h;->d(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwItemNotificationBinding;->tvTitle:Landroid/widget/TextView;

    .line 107
    .line 108
    invoke-static {v0, v11}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 109
    .line 110
    .line 111
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwItemNotificationBinding;->tvTitle:Landroid/widget/TextView;

    .line 112
    .line 113
    invoke-static {v0, v8}, Li4/h;->d(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    :cond_7
    if-eqz v4, :cond_8

    .line 117
    .line 118
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwItemNotificationBindingImpl;->mboundView0:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 119
    .line 120
    invoke-virtual {v0, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 121
    .line 122
    .line 123
    :cond_8
    return-void

    .line 124
    :catchall_0
    move-exception v0

    .line 125
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 126
    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwItemNotificationBindingImpl;->mDirtyFlags:J

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
    const-wide/16 v0, 0x4

    .line 3
    .line 4
    :try_start_0
    iput-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwItemNotificationBindingImpl;->mDirtyFlags:J

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
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwItemNotificationBinding;->mClickListener:Landroid/view/View$OnClickListener;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwItemNotificationBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x2

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwItemNotificationBindingImpl;->mDirtyFlags:J

    .line 10
    .line 11
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    const/4 p1, 0x2

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

.method public setMessageInfo(Lcom/zykj/huiwei/launcher/bean/resp/MessageInfo;)V
    .locals 4
    .param p1    # Lcom/zykj/huiwei/launcher/bean/resp/MessageInfo;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/databinding/HwItemNotificationBinding;->mMessageInfo:Lcom/zykj/huiwei/launcher/bean/resp/MessageInfo;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwItemNotificationBindingImpl;->mDirtyFlags:J

    .line 5
    .line 6
    const-wide/16 v2, 0x1

    .line 7
    .line 8
    or-long/2addr v0, v2

    .line 9
    iput-wide v0, p0, Lcom/zykj/huiwei/launcher/databinding/HwItemNotificationBindingImpl;->mDirtyFlags:J

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

.method public setVariable(ILjava/lang/Object;)Z
    .locals 2
    .param p2    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x5

    .line 2
    const/4 v1, 0x1

    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    check-cast p2, Lcom/zykj/huiwei/launcher/bean/resp/MessageInfo;

    .line 6
    .line 7
    invoke-virtual {p0, p2}, Lcom/zykj/huiwei/launcher/databinding/HwItemNotificationBindingImpl;->setMessageInfo(Lcom/zykj/huiwei/launcher/bean/resp/MessageInfo;)V

    .line 8
    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    const/4 v0, 0x2

    .line 12
    if-ne v0, p1, :cond_1

    .line 13
    .line 14
    check-cast p2, Landroid/view/View$OnClickListener;

    .line 15
    .line 16
    invoke-virtual {p0, p2}, Lcom/zykj/huiwei/launcher/databinding/HwItemNotificationBindingImpl;->setClickListener(Landroid/view/View$OnClickListener;)V

    .line 17
    .line 18
    .line 19
    return v1

    .line 20
    :cond_1
    const/4 p1, 0x0

    .line 21
    return p1
.end method
