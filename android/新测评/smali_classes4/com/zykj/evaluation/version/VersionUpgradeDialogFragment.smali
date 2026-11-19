.class public final Lcom/zykj/evaluation/version/VersionUpgradeDialogFragment;
.super Lcom/zykj/base/BaseDialogFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/evaluation/version/VersionUpgradeDialogFragment$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/base/BaseDialogFragment<",
        "Lcom/zykj/evaluation/databinding/DialogVersionUpgradeBinding;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 \u00172\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001a\u0010\u0008\u001a\u00020\u00072\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0094@\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u0004J\u000f\u0010\u000c\u001a\u00020\u000bH\u0014\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u0004R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/zykj/evaluation/version/VersionUpgradeDialogFragment;",
        "Lcom/zykj/base/BaseDialogFragment;",
        "Lcom/zykj/evaluation/databinding/DialogVersionUpgradeBinding;",
        "<init>",
        "()V",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "initView",
        "(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "onStart",
        "",
        "layoutId",
        "()I",
        "g",
        "Lcom/liulishuo/okdownload/a;",
        "a",
        "Lcom/liulishuo/okdownload/a;",
        "downloadTask",
        "Lcom/zykj/evaluation/version/VersionResult;",
        "b",
        "Lcom/zykj/evaluation/version/VersionResult;",
        "versionResult",
        "c",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final c:Lcom/zykj/evaluation/version/VersionUpgradeDialogFragment$a;

.field public static final d:I


# instance fields
.field public a:Lcom/liulishuo/okdownload/a;

.field public b:Lcom/zykj/evaluation/version/VersionResult;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/evaluation/version/VersionUpgradeDialogFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/evaluation/version/VersionUpgradeDialogFragment$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/zykj/evaluation/version/VersionUpgradeDialogFragment;->c:Lcom/zykj/evaluation/version/VersionUpgradeDialogFragment$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/evaluation/version/VersionUpgradeDialogFragment;->d:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/base/BaseDialogFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Lcom/zykj/evaluation/version/VersionUpgradeDialogFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/evaluation/version/VersionUpgradeDialogFragment;->h(Lcom/zykj/evaluation/version/VersionUpgradeDialogFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic d(Lcom/zykj/evaluation/version/VersionUpgradeDialogFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/evaluation/version/VersionUpgradeDialogFragment;->j(Lcom/zykj/evaluation/version/VersionUpgradeDialogFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic e(Lcom/zykj/evaluation/version/VersionUpgradeDialogFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/evaluation/version/VersionUpgradeDialogFragment;->i(Lcom/zykj/evaluation/version/VersionUpgradeDialogFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic f(Lcom/zykj/evaluation/version/VersionUpgradeDialogFragment;)Lcom/zykj/evaluation/version/VersionResult;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/version/VersionUpgradeDialogFragment;->b:Lcom/zykj/evaluation/version/VersionResult;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final h(Lcom/zykj/evaluation/version/VersionUpgradeDialogFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/zykj/evaluation/version/VersionUpgradeDialogFragment;->a:Lcom/liulishuo/okdownload/a;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/zykj/evaluation/version/VersionUpgradeDialogFragment$b;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lcom/zykj/evaluation/version/VersionUpgradeDialogFragment$b;-><init>(Lcom/zykj/evaluation/version/VersionUpgradeDialogFragment;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, v0}, Lcom/liulishuo/okdownload/a;->k(Lq1/a;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public static final i(Lcom/zykj/evaluation/version/VersionUpgradeDialogFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/evaluation/version/VersionUpgradeDialogFragment;->a:Lcom/liulishuo/okdownload/a;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/liulishuo/okdownload/a;->i()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public static final j(Lcom/zykj/evaluation/version/VersionUpgradeDialogFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/zykj/evaluation/version/VersionUpgradeDialogFragment;->b:Lcom/zykj/evaluation/version/VersionResult;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const-string p1, "versionResult"

    .line 6
    .line 7
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/evaluation/version/VersionResult;->getForceUpdate()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    invoke-static {}, Lcom/blankj/utilcode/util/AppUtils;->exitApp()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->dismissAllowingStateLoss()V

    .line 22
    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final g()V
    .locals 6

    .line 1
    new-instance v0, Lg7/e;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/evaluation/bean/TaskState$Done;->INSTANCE:Lcom/zykj/evaluation/bean/TaskState$Done;

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    const-wide/16 v4, 0x0

    .line 8
    .line 9
    invoke-direct/range {v0 .. v5}, Lg7/e;-><init>(Lcom/zykj/evaluation/bean/TaskState;JJ)V

    .line 10
    .line 11
    .line 12
    invoke-static {}, Lcom/blankj/utilcode/util/AppUtils;->getAppVersionName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v2, "getAppVersionName(...)"

    .line 17
    .line 18
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lg7/e;->s(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v1}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    invoke-static {v1}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    :cond_0
    iget-object v1, p0, Lcom/zykj/evaluation/version/VersionUpgradeDialogFragment;->b:Lcom/zykj/evaluation/version/VersionResult;

    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    const-string v3, "versionResult"

    .line 38
    .line 39
    if-nez v1, :cond_1

    .line 40
    .line 41
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    move-object v1, v2

    .line 45
    :cond_1
    invoke-virtual {v1}, Lcom/zykj/evaluation/version/VersionResult;->getVersionName()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v0, v1}, Lg7/e;->s(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iget-object v1, p0, Lcom/zykj/evaluation/version/VersionUpgradeDialogFragment;->b:Lcom/zykj/evaluation/version/VersionResult;

    .line 54
    .line 55
    if-nez v1, :cond_2

    .line 56
    .line 57
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    move-object v2, v1

    .line 62
    :goto_0
    invoke-virtual {v2}, Lcom/zykj/evaluation/version/VersionResult;->getFileUrl()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    new-instance v2, Lcom/liulishuo/okdownload/a$a;

    .line 67
    .line 68
    new-instance v3, Ljava/io/File;

    .line 69
    .line 70
    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-direct {v2, v1, v3}, Lcom/liulishuo/okdownload/a$a;-><init>(Ljava/lang/String;Ljava/io/File;)V

    .line 74
    .line 75
    .line 76
    const/16 v0, 0x64

    .line 77
    .line 78
    invoke-virtual {v2, v0}, Lcom/liulishuo/okdownload/a$a;->b(I)Lcom/liulishuo/okdownload/a$a;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    const/4 v1, 0x1

    .line 83
    invoke-virtual {v0, v1}, Lcom/liulishuo/okdownload/a$a;->c(Z)Lcom/liulishuo/okdownload/a$a;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-virtual {v0}, Lcom/liulishuo/okdownload/a$a;->a()Lcom/liulishuo/okdownload/a;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iput-object v0, p0, Lcom/zykj/evaluation/version/VersionUpgradeDialogFragment;->a:Lcom/liulishuo/okdownload/a;

    .line 92
    .line 93
    return-void
.end method

.method public initView(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 p2, 0x0

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    const-string v0, "VERSION_UPGRADE_KEY"

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lcom/zykj/evaluation/version/VersionResult;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object p1, p2

    .line 18
    :goto_0
    if-nez p1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->dismissAllowingStateLoss()V

    .line 21
    .line 22
    .line 23
    goto/16 :goto_3

    .line 24
    .line 25
    :cond_1
    iput-object p1, p0, Lcom/zykj/evaluation/version/VersionUpgradeDialogFragment;->b:Lcom/zykj/evaluation/version/VersionResult;

    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/zykj/evaluation/version/VersionResult;->getForceUpdate()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, Lcom/zykj/evaluation/databinding/DialogVersionUpgradeBinding;

    .line 38
    .line 39
    iget-object p1, p1, Lcom/zykj/evaluation/databinding/DialogVersionUpgradeBinding;->g:Landroid/widget/TextView;

    .line 40
    .line 41
    const-string v0, "\u9000\u51fa"

    .line 42
    .line 43
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    check-cast p1, Lcom/zykj/evaluation/databinding/DialogVersionUpgradeBinding;

    .line 52
    .line 53
    iget-object p1, p1, Lcom/zykj/evaluation/databinding/DialogVersionUpgradeBinding;->g:Landroid/widget/TextView;

    .line 54
    .line 55
    const-string v0, "\u6682\u4e0d\u66f4\u65b0"

    .line 56
    .line 57
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 58
    .line 59
    .line 60
    :goto_1
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    check-cast p1, Lcom/zykj/evaluation/databinding/DialogVersionUpgradeBinding;

    .line 65
    .line 66
    iget-object p1, p1, Lcom/zykj/evaluation/databinding/DialogVersionUpgradeBinding;->k:Landroid/widget/TextView;

    .line 67
    .line 68
    new-instance v0, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 71
    .line 72
    .line 73
    const-string v1, "v"

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-object v1, p0, Lcom/zykj/evaluation/version/VersionUpgradeDialogFragment;->b:Lcom/zykj/evaluation/version/VersionResult;

    .line 79
    .line 80
    const-string v2, "versionResult"

    .line 81
    .line 82
    if-nez v1, :cond_3

    .line 83
    .line 84
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    move-object v1, p2

    .line 88
    :cond_3
    invoke-virtual {v1}, Lcom/zykj/evaluation/version/VersionResult;->getVersionName()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    check-cast p1, Lcom/zykj/evaluation/databinding/DialogVersionUpgradeBinding;

    .line 107
    .line 108
    iget-object p1, p1, Lcom/zykj/evaluation/databinding/DialogVersionUpgradeBinding;->e:Landroid/widget/TextView;

    .line 109
    .line 110
    iget-object v0, p0, Lcom/zykj/evaluation/version/VersionUpgradeDialogFragment;->b:Lcom/zykj/evaluation/version/VersionResult;

    .line 111
    .line 112
    if-nez v0, :cond_4

    .line 113
    .line 114
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_4
    move-object p2, v0

    .line 119
    :goto_2
    invoke-virtual {p2}, Lcom/zykj/evaluation/version/VersionResult;->getSummary()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0}, Lcom/zykj/evaluation/version/VersionUpgradeDialogFragment;->g()V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    check-cast p1, Lcom/zykj/evaluation/databinding/DialogVersionUpgradeBinding;

    .line 134
    .line 135
    iget-object v0, p1, Lcom/zykj/evaluation/databinding/DialogVersionUpgradeBinding;->h:Landroid/widget/TextView;

    .line 136
    .line 137
    const-string p1, "tvNow"

    .line 138
    .line 139
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    new-instance v3, Lh7/c;

    .line 143
    .line 144
    invoke-direct {v3, p0}, Lh7/c;-><init>(Lcom/zykj/evaluation/version/VersionUpgradeDialogFragment;)V

    .line 145
    .line 146
    .line 147
    const/4 v4, 0x1

    .line 148
    const/4 v5, 0x0

    .line 149
    const-wide/16 v1, 0x0

    .line 150
    .line 151
    invoke-static/range {v0 .. v5}, Lb8/c;->f(Landroid/view/View;JLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    check-cast p1, Lcom/zykj/evaluation/databinding/DialogVersionUpgradeBinding;

    .line 159
    .line 160
    iget-object v0, p1, Lcom/zykj/evaluation/databinding/DialogVersionUpgradeBinding;->d:Landroid/widget/TextView;

    .line 161
    .line 162
    const-string p1, "tvCancel"

    .line 163
    .line 164
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    new-instance v3, Lh7/d;

    .line 168
    .line 169
    invoke-direct {v3, p0}, Lh7/d;-><init>(Lcom/zykj/evaluation/version/VersionUpgradeDialogFragment;)V

    .line 170
    .line 171
    .line 172
    invoke-static/range {v0 .. v5}, Lb8/c;->f(Landroid/view/View;JLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    check-cast p1, Lcom/zykj/evaluation/databinding/DialogVersionUpgradeBinding;

    .line 180
    .line 181
    iget-object v0, p1, Lcom/zykj/evaluation/databinding/DialogVersionUpgradeBinding;->g:Landroid/widget/TextView;

    .line 182
    .line 183
    const-string p1, "tvNotNow"

    .line 184
    .line 185
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    new-instance v3, Lh7/e;

    .line 189
    .line 190
    invoke-direct {v3, p0}, Lh7/e;-><init>(Lcom/zykj/evaluation/version/VersionUpgradeDialogFragment;)V

    .line 191
    .line 192
    .line 193
    invoke-static/range {v0 .. v5}, Lb8/c;->f(Landroid/view/View;JLandroid/view/View$OnClickListener;ILjava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 197
    .line 198
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0c003c

    return v0
.end method

.method public onStart()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/16 v1, 0x3e8

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/view/Window;->setType(I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const v2, 0x7f0704a2

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    float-to-int v1, v1

    .line 30
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const v3, 0x7f0704b6

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    float-to-int v2, v2

    .line 42
    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setLayout(II)V

    .line 43
    .line 44
    .line 45
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 56
    .line 57
    .line 58
    :cond_1
    invoke-super {p0}, Landroidx/fragment/app/DialogFragment;->onStart()V

    .line 59
    .line 60
    .line 61
    return-void
.end method
