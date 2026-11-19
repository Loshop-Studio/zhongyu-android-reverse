.class public final Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment$b;
.super Ly1/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;->initView(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic b:Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment$b;->b:Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Ly1/b;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Lcom/liulishuo/okdownload/a;Lr1/c;ZLz1/b$b;)V
    .locals 0

    .line 1
    const-string p3, "task"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "info"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "model"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public b(Lcom/liulishuo/okdownload/a;Lcom/liulishuo/okdownload/core/cause/EndCause;Ljava/lang/Exception;Lp1/f;)V
    .locals 0

    .line 1
    const-string p3, "task"

    .line 2
    .line 3
    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p3, "cause"

    .line 7
    .line 8
    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p3, "taskSpeed"

    .line 12
    .line 13
    invoke-static {p4, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object p3, Lcom/liulishuo/okdownload/core/cause/EndCause;->a:Lcom/liulishuo/okdownload/core/cause/EndCause;

    .line 17
    .line 18
    if-ne p2, p3, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/liulishuo/okdownload/a;->l()Ljava/io/File;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    if-eqz p2, :cond_0

    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/liulishuo/okdownload/a;->l()Ljava/io/File;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {p1}, Lcom/blankj/utilcode/util/AppUtils;->installApp(Ljava/io/File;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment$b;->b:Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;

    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Lcom/zykj/student/dialogue/databinding/DialogVersionUpgradeBinding;

    .line 40
    .line 41
    iget-object p1, p1, Lcom/zykj/student/dialogue/databinding/DialogVersionUpgradeBinding;->h:Landroid/widget/TextView;

    .line 42
    .line 43
    const-string p2, "tvNow"

    .line 44
    .line 45
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const/4 p2, 0x0

    .line 49
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment$b;->b:Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;

    .line 53
    .line 54
    invoke-virtual {p1}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, Lcom/zykj/student/dialogue/databinding/DialogVersionUpgradeBinding;

    .line 59
    .line 60
    iget-object p1, p1, Lcom/zykj/student/dialogue/databinding/DialogVersionUpgradeBinding;->g:Landroid/widget/TextView;

    .line 61
    .line 62
    const-string p3, "tvNotNow"

    .line 63
    .line 64
    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 68
    .line 69
    .line 70
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment$b;->b:Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;

    .line 71
    .line 72
    invoke-virtual {p1}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    check-cast p1, Lcom/zykj/student/dialogue/databinding/DialogVersionUpgradeBinding;

    .line 77
    .line 78
    iget-object p1, p1, Lcom/zykj/student/dialogue/databinding/DialogVersionUpgradeBinding;->d:Landroid/widget/TextView;

    .line 79
    .line 80
    const-string p2, "tvCancel"

    .line 81
    .line 82
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    const/16 p2, 0x8

    .line 86
    .line 87
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 88
    .line 89
    .line 90
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment$b;->b:Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;

    .line 91
    .line 92
    invoke-virtual {p1}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    check-cast p1, Lcom/zykj/student/dialogue/databinding/DialogVersionUpgradeBinding;

    .line 97
    .line 98
    iget-object p1, p1, Lcom/zykj/student/dialogue/databinding/DialogVersionUpgradeBinding;->c:Landroid/widget/ProgressBar;

    .line 99
    .line 100
    const-string p3, "progressBar"

    .line 101
    .line 102
    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 106
    .line 107
    .line 108
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment$b;->b:Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;

    .line 109
    .line 110
    invoke-virtual {p1}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    check-cast p1, Lcom/zykj/student/dialogue/databinding/DialogVersionUpgradeBinding;

    .line 115
    .line 116
    iget-object p1, p1, Lcom/zykj/student/dialogue/databinding/DialogVersionUpgradeBinding;->i:Landroid/widget/TextView;

    .line 117
    .line 118
    const-string p3, "tvProgress"

    .line 119
    .line 120
    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 124
    .line 125
    .line 126
    return-void
.end method

.method public g(Lcom/liulishuo/okdownload/a;)V
    .locals 2

    .line 1
    const-string v0, "task"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment$b;->b:Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lcom/zykj/student/dialogue/databinding/DialogVersionUpgradeBinding;

    .line 13
    .line 14
    iget-object p1, p1, Lcom/zykj/student/dialogue/databinding/DialogVersionUpgradeBinding;->h:Landroid/widget/TextView;

    .line 15
    .line 16
    const-string v0, "tvNow"

    .line 17
    .line 18
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/16 v0, 0x8

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment$b;->b:Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;

    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, Lcom/zykj/student/dialogue/databinding/DialogVersionUpgradeBinding;

    .line 33
    .line 34
    iget-object p1, p1, Lcom/zykj/student/dialogue/databinding/DialogVersionUpgradeBinding;->g:Landroid/widget/TextView;

    .line 35
    .line 36
    const-string v1, "tvNotNow"

    .line 37
    .line 38
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment$b;->b:Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;

    .line 45
    .line 46
    invoke-virtual {p1}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, Lcom/zykj/student/dialogue/databinding/DialogVersionUpgradeBinding;

    .line 51
    .line 52
    iget-object p1, p1, Lcom/zykj/student/dialogue/databinding/DialogVersionUpgradeBinding;->d:Landroid/widget/TextView;

    .line 53
    .line 54
    const-string v0, "tvCancel"

    .line 55
    .line 56
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const/4 v0, 0x0

    .line 60
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 61
    .line 62
    .line 63
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment$b;->b:Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;

    .line 64
    .line 65
    invoke-virtual {p1}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    check-cast p1, Lcom/zykj/student/dialogue/databinding/DialogVersionUpgradeBinding;

    .line 70
    .line 71
    iget-object p1, p1, Lcom/zykj/student/dialogue/databinding/DialogVersionUpgradeBinding;->c:Landroid/widget/ProgressBar;

    .line 72
    .line 73
    const-string v1, "progressBar"

    .line 74
    .line 75
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 79
    .line 80
    .line 81
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment$b;->b:Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;

    .line 82
    .line 83
    invoke-virtual {p1}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    check-cast p1, Lcom/zykj/student/dialogue/databinding/DialogVersionUpgradeBinding;

    .line 88
    .line 89
    iget-object p1, p1, Lcom/zykj/student/dialogue/databinding/DialogVersionUpgradeBinding;->i:Landroid/widget/TextView;

    .line 90
    .line 91
    const-string v1, "tvProgress"

    .line 92
    .line 93
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 97
    .line 98
    .line 99
    return-void
.end method

.method public h(Lcom/liulishuo/okdownload/a;ILr1/a;Lp1/f;)V
    .locals 0

    .line 1
    const-string p2, "task"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "blockSpeed"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public j(Lcom/liulishuo/okdownload/a;IJLp1/f;)V
    .locals 0

    .line 1
    const-string p2, "task"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "blockSpeed"

    invoke-static {p5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public l(Lcom/liulishuo/okdownload/a;JLp1/f;)V
    .locals 1

    .line 1
    const-string v0, "task"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "taskSpeed"

    .line 7
    .line 8
    invoke-static {p4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment$b;->b:Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Lcom/zykj/student/dialogue/databinding/DialogVersionUpgradeBinding;

    .line 18
    .line 19
    iget-object p1, p1, Lcom/zykj/student/dialogue/databinding/DialogVersionUpgradeBinding;->c:Landroid/widget/ProgressBar;

    .line 20
    .line 21
    long-to-float p2, p2

    .line 22
    const/high16 p3, 0x3f800000    # 1.0f

    .line 23
    .line 24
    mul-float/2addr p2, p3

    .line 25
    iget-object p3, p0, Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment$b;->b:Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;

    .line 26
    .line 27
    invoke-static {p3}, Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;->f(Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;)Lcom/zykj/student/dialogue/bean/resp/VersionResult;

    .line 28
    .line 29
    .line 30
    move-result-object p3

    .line 31
    if-nez p3, :cond_0

    .line 32
    .line 33
    const-string p3, "versionResult"

    .line 34
    .line 35
    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const/4 p3, 0x0

    .line 39
    :cond_0
    invoke-virtual {p3}, Lcom/zykj/student/dialogue/bean/resp/VersionResult;->getSize()I

    .line 40
    .line 41
    .line 42
    move-result p3

    .line 43
    int-to-float p3, p3

    .line 44
    div-float/2addr p2, p3

    .line 45
    const/16 p3, 0x64

    .line 46
    .line 47
    int-to-float p3, p3

    .line 48
    mul-float/2addr p2, p3

    .line 49
    float-to-int p2, p2

    .line 50
    invoke-virtual {p1, p2}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment$b;->b:Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;

    .line 54
    .line 55
    invoke-virtual {p1}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    check-cast p1, Lcom/zykj/student/dialogue/databinding/DialogVersionUpgradeBinding;

    .line 60
    .line 61
    iget-object p1, p1, Lcom/zykj/student/dialogue/databinding/DialogVersionUpgradeBinding;->i:Landroid/widget/TextView;

    .line 62
    .line 63
    iget-object p2, p0, Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment$b;->b:Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;

    .line 64
    .line 65
    new-instance p3, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p2}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    check-cast p2, Lcom/zykj/student/dialogue/databinding/DialogVersionUpgradeBinding;

    .line 75
    .line 76
    iget-object p2, p2, Lcom/zykj/student/dialogue/databinding/DialogVersionUpgradeBinding;->c:Landroid/widget/ProgressBar;

    .line 77
    .line 78
    invoke-virtual {p2}, Landroid/widget/ProgressBar;->getProgress()I

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string p2, "%"

    .line 86
    .line 87
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p2

    .line 94
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 95
    .line 96
    .line 97
    return-void
.end method

.method public o(Lcom/liulishuo/okdownload/a;IILjava/util/Map;)V
    .locals 0

    .line 1
    const-string p2, "task"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "responseHeaderFields"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public u(Lcom/liulishuo/okdownload/a;ILjava/util/Map;)V
    .locals 0

    .line 1
    const-string p2, "task"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "requestHeaderFields"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
