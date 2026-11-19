.class public abstract Lcom/zykj/study/utils/BaseFragmentExtKt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lcom/zykj/base/BaseFragment;Landroidx/paging/PagingDataAdapter;Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;Landroidx/paging/LoadState$Error;)V
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p0, "adapter"

    .line 7
    .line 8
    invoke-static {p1, p0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p0, "state"

    .line 12
    .line 13
    invoke-static {p3, p0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object p0, Lcom/zykj/base/utils/ExceptionHandle;->INSTANCE:Lcom/zykj/base/utils/ExceptionHandle;

    .line 17
    .line 18
    invoke-virtual {p3}, Landroidx/paging/LoadState$Error;->getError()Ljava/lang/Throwable;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    invoke-virtual {p0, p3}, Lcom/zykj/base/utils/ExceptionHandle;->handleException(Ljava/lang/Throwable;)Lcom/zykj/http/exception/RemoteCodeException;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Lcom/zykj/http/exception/RemoteCodeException;->getErrorCodeInfo()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getMessageResId()Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object p3

    .line 34
    if-eqz p3, :cond_0

    .line 35
    .line 36
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result p3

    .line 40
    sget-object v0, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 41
    .line 42
    invoke-static {v0, p3}, Le5/o;->c(Lcom/zykj/base/utils/XToastUtils;I)V

    .line 43
    .line 44
    .line 45
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getCode()I

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    const/16 p3, 0x255

    .line 50
    .line 51
    const/4 v0, 0x1

    .line 52
    if-gt p3, p0, :cond_1

    .line 53
    .line 54
    const/16 p3, 0x258

    .line 55
    .line 56
    if-ge p0, p3, :cond_1

    .line 57
    .line 58
    invoke-virtual {p1}, Landroidx/paging/PagingDataAdapter;->getItemCount()I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-ge p0, v0, :cond_2

    .line 63
    .line 64
    if-eqz p2, :cond_2

    .line 65
    .line 66
    invoke-virtual {p2}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->o()V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_1
    invoke-virtual {p1}, Landroidx/paging/PagingDataAdapter;->getItemCount()I

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    if-ge p0, v0, :cond_2

    .line 75
    .line 76
    if-eqz p2, :cond_2

    .line 77
    .line 78
    invoke-virtual {p2}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->i()V

    .line 79
    .line 80
    .line 81
    :cond_2
    return-void
.end method

.method public static final b(Lcom/zykj/base/BaseFragment;Lcom/zykj/study/view/MultipleStatusView;Lcom/zykj/base/bean/toast/ToastMessage;)V
    .locals 4

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "toastMessage"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    instance-of v0, p2, Lcom/zykj/base/bean/toast/ToastErrorMessage;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    sget v0, Lcom/zykj/study/R$layout;->layout_status_error:I

    .line 26
    .line 27
    invoke-static {p0, v0, v2, v1}, Landroidx/databinding/DataBindingUtil;->inflate(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroidx/databinding/ViewDataBinding;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Lcom/zykj/study/databinding/LayoutStatusErrorBinding;

    .line 32
    .line 33
    invoke-virtual {p2}, Lcom/zykj/base/bean/toast/ToastMessage;->getMessage()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-virtual {p0, p2}, Lcom/zykj/study/databinding/LayoutStatusErrorBinding;->setErrorMessage(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    if-eqz p1, :cond_3

    .line 41
    .line 42
    invoke-virtual {p0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p1, p0}, Lcom/zykj/study/view/MultipleStatusView;->e(Landroid/view/View;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_0
    instance-of v0, p2, Lcom/zykj/base/bean/toast/ToastErrorCodeMessage;

    .line 51
    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    check-cast p2, Lcom/zykj/base/bean/toast/ToastErrorCodeMessage;

    .line 55
    .line 56
    invoke-virtual {p2}, Lcom/zykj/base/bean/toast/ToastErrorCodeMessage;->getErrorInfo()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getCode()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    const/16 v3, 0x255

    .line 65
    .line 66
    if-gt v3, v0, :cond_1

    .line 67
    .line 68
    const/16 v3, 0x258

    .line 69
    .line 70
    if-ge v0, v3, :cond_1

    .line 71
    .line 72
    if-eqz p1, :cond_3

    .line 73
    .line 74
    invoke-virtual {p1}, Lcom/zykj/study/view/MultipleStatusView;->n()V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    sget v3, Lcom/zykj/study/R$layout;->layout_status_error:I

    .line 87
    .line 88
    invoke-static {v0, v3, v2, v1}, Landroidx/databinding/DataBindingUtil;->inflate(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroidx/databinding/ViewDataBinding;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    check-cast v0, Lcom/zykj/study/databinding/LayoutStatusErrorBinding;

    .line 93
    .line 94
    sget-object v1, Lcom/zykj/lib/error/code/ErrorCodeHandler;->INSTANCE:Lcom/zykj/lib/error/code/ErrorCodeHandler;

    .line 95
    .line 96
    invoke-virtual {p2}, Lcom/zykj/base/bean/toast/ToastErrorCodeMessage;->getErrorInfo()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-virtual {v2}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getCode()I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    invoke-virtual {v1, v2}, Lcom/zykj/lib/error/code/ErrorCodeHandler;->getErrorCode(I)Lcom/zykj/lib/error/code/ErrorCode;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p2}, Lcom/zykj/base/bean/toast/ToastErrorCodeMessage;->getErrorInfo()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-virtual {v1}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getMessageResId()Ljava/lang/Integer;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    if-eqz v1, :cond_2

    .line 116
    .line 117
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 118
    .line 119
    .line 120
    move-result p2

    .line 121
    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-virtual {v0, p0}, Lcom/zykj/study/databinding/LayoutStatusErrorBinding;->setErrorMessage(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    if-eqz p1, :cond_3

    .line 129
    .line 130
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-virtual {p1, p0}, Lcom/zykj/study/view/MultipleStatusView;->e(Landroid/view/View;)V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :cond_2
    invoke-virtual {p2}, Lcom/zykj/base/bean/toast/ToastErrorCodeMessage;->getErrorInfo()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    invoke-virtual {p0}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getMessage()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    if-eqz p0, :cond_3

    .line 147
    .line 148
    invoke-virtual {v0, p0}, Lcom/zykj/study/databinding/LayoutStatusErrorBinding;->setErrorMessage(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    if-eqz p1, :cond_3

    .line 152
    .line 153
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    invoke-virtual {p1, p0}, Lcom/zykj/study/view/MultipleStatusView;->e(Landroid/view/View;)V

    .line 158
    .line 159
    .line 160
    :cond_3
    return-void
.end method

.method public static final c(Lcom/zykj/base/BaseFragment;Landroidx/paging/PagingDataAdapter;Lx7/a;Lx7/a;Lx7/a;ZLm7/c;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-interface {p2}, Lx7/a;->invoke()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    move-object v4, p2

    .line 6
    check-cast v4, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;

    .line 7
    .line 8
    invoke-interface {p3}, Lx7/a;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    move-object v1, p2

    .line 13
    check-cast v1, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 14
    .line 15
    invoke-interface {p4}, Lx7/a;->invoke()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    move-object v6, p2

    .line 20
    check-cast v6, Landroidx/recyclerview/widget/RecyclerView;

    .line 21
    .line 22
    invoke-virtual {p1}, Landroidx/paging/PagingDataAdapter;->getLoadStateFlow()Ll8/c;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    new-instance v0, Lcom/zykj/study/utils/BaseFragmentExtKt$setRecycleView$5;

    .line 27
    .line 28
    const/4 v7, 0x0

    .line 29
    move-object v2, p0

    .line 30
    move-object v3, p1

    .line 31
    move v5, p5

    .line 32
    invoke-direct/range {v0 .. v7}, Lcom/zykj/study/utils/BaseFragmentExtKt$setRecycleView$5;-><init>(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;Lcom/zykj/base/BaseFragment;Landroidx/paging/PagingDataAdapter;Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;ZLandroidx/recyclerview/widget/RecyclerView;Lm7/c;)V

    .line 33
    .line 34
    .line 35
    invoke-static {p2, v0, p6}, Ll8/e;->i(Ll8/c;Lx7/p;Lm7/c;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-ne p0, p1, :cond_0

    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_0
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 47
    .line 48
    return-object p0
.end method

.method public static synthetic d(Lcom/zykj/base/BaseFragment;Landroidx/paging/PagingDataAdapter;Lx7/a;Lx7/a;Lx7/a;ZLm7/c;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    and-int/lit8 p8, p7, 0x2

    .line 2
    .line 3
    if-eqz p8, :cond_0

    .line 4
    .line 5
    sget-object p2, Lcom/zykj/study/utils/BaseFragmentExtKt$a;->a:Lcom/zykj/study/utils/BaseFragmentExtKt$a;

    .line 6
    .line 7
    :cond_0
    move-object v2, p2

    .line 8
    and-int/lit8 p2, p7, 0x4

    .line 9
    .line 10
    if-eqz p2, :cond_1

    .line 11
    .line 12
    sget-object p3, Lcom/zykj/study/utils/BaseFragmentExtKt$b;->a:Lcom/zykj/study/utils/BaseFragmentExtKt$b;

    .line 13
    .line 14
    :cond_1
    move-object v3, p3

    .line 15
    and-int/lit8 p2, p7, 0x8

    .line 16
    .line 17
    if-eqz p2, :cond_2

    .line 18
    .line 19
    sget-object p4, Lcom/zykj/study/utils/BaseFragmentExtKt$c;->a:Lcom/zykj/study/utils/BaseFragmentExtKt$c;

    .line 20
    .line 21
    :cond_2
    move-object v4, p4

    .line 22
    and-int/lit8 p2, p7, 0x10

    .line 23
    .line 24
    if-eqz p2, :cond_3

    .line 25
    .line 26
    const/4 p5, 0x0

    .line 27
    :cond_3
    move-object v0, p0

    .line 28
    move-object v1, p1

    .line 29
    move v5, p5

    .line 30
    move-object v6, p6

    .line 31
    invoke-static/range {v0 .. v6}, Lcom/zykj/study/utils/BaseFragmentExtKt;->c(Lcom/zykj/base/BaseFragment;Landroidx/paging/PagingDataAdapter;Lx7/a;Lx7/a;Lx7/a;ZLm7/c;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method
