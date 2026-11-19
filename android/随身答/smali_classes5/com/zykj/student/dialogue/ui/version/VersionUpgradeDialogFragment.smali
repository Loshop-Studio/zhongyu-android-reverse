.class public final Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;
.super Lcom/zykj/base/BaseDialogFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/base/BaseDialogFragment<",
        "Lcom/zykj/student/dialogue/databinding/DialogVersionUpgradeBinding;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 \u00172\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001a\u0010\u0008\u001a\u00020\u00072\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0094@\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u0004J\u000f\u0010\u000c\u001a\u00020\u000bH\u0014\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u0004R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;",
        "Lcom/zykj/base/BaseDialogFragment;",
        "Lcom/zykj/student/dialogue/databinding/DialogVersionUpgradeBinding;",
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
        "Lcom/zykj/student/dialogue/bean/resp/VersionResult;",
        "b",
        "Lcom/zykj/student/dialogue/bean/resp/VersionResult;",
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
.field public static final c:Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment$a;

.field public static final d:I


# instance fields
.field public a:Lcom/liulishuo/okdownload/a;

.field public b:Lcom/zykj/student/dialogue/bean/resp/VersionResult;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;->c:Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;->d:I

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

.method public static synthetic c(Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;->j(Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;->i(Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;->h(Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic f(Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;)Lcom/zykj/student/dialogue/bean/resp/VersionResult;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;->b:Lcom/zykj/student/dialogue/bean/resp/VersionResult;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final h(Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;Landroid/view/View;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;->a:Lcom/liulishuo/okdownload/a;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    new-instance v0, Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment$b;

    .line 11
    .line 12
    invoke-direct {v0, p0}, Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment$b;-><init>(Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v0}, Lcom/liulishuo/okdownload/a;->k(Lp1/a;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 19
    .line 20
    return-object p0
.end method

.method public static final i(Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;Landroid/view/View;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;->a:Lcom/liulishuo/okdownload/a;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/liulishuo/okdownload/a;->i()V

    .line 11
    .line 12
    .line 13
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 14
    .line 15
    return-object p0
.end method

.method public static final j(Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;Landroid/view/View;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;->b:Lcom/zykj/student/dialogue/bean/resp/VersionResult;

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    const-string p1, "versionResult"

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/student/dialogue/bean/resp/VersionResult;->getForceUpdate()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    invoke-static {}, Lcom/blankj/utilcode/util/AppUtils;->exitApp()V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->dismissAllowingStateLoss()V

    .line 27
    .line 28
    .line 29
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 30
    .line 31
    return-object p0
.end method


# virtual methods
.method public final g()V
    .locals 7

    .line 1
    invoke-static {}, Lcom/blankj/utilcode/util/PathUtils;->getExternalAppCachePath()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {}, Lcom/blankj/utilcode/util/AppUtils;->getAppVersionName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    new-instance v3, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v0, ".apk"

    .line 26
    .line 27
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-static {v2}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    invoke-static {v2}, Lcom/blankj/utilcode/util/FileUtils;->delete(Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    :cond_0
    invoke-static {}, Lcom/blankj/utilcode/util/PathUtils;->getExternalAppCachePath()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    iget-object v3, p0, Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;->b:Lcom/zykj/student/dialogue/bean/resp/VersionResult;

    .line 48
    .line 49
    const/4 v4, 0x0

    .line 50
    const-string v5, "versionResult"

    .line 51
    .line 52
    if-nez v3, :cond_1

    .line 53
    .line 54
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    move-object v3, v4

    .line 58
    :cond_1
    invoke-virtual {v3}, Lcom/zykj/student/dialogue/bean/resp/VersionResult;->getVersionName()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    new-instance v6, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;->b:Lcom/zykj/student/dialogue/bean/resp/VersionResult;

    .line 84
    .line 85
    if-nez v1, :cond_2

    .line 86
    .line 87
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_2
    move-object v4, v1

    .line 92
    :goto_0
    invoke-virtual {v4}, Lcom/zykj/student/dialogue/bean/resp/VersionResult;->getFileUrl()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    new-instance v2, Lcom/liulishuo/okdownload/a$a;

    .line 97
    .line 98
    new-instance v3, Ljava/io/File;

    .line 99
    .line 100
    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-direct {v2, v1, v3}, Lcom/liulishuo/okdownload/a$a;-><init>(Ljava/lang/String;Ljava/io/File;)V

    .line 104
    .line 105
    .line 106
    const/16 v0, 0x64

    .line 107
    .line 108
    invoke-virtual {v2, v0}, Lcom/liulishuo/okdownload/a$a;->b(I)Lcom/liulishuo/okdownload/a$a;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    const/4 v1, 0x1

    .line 113
    invoke-virtual {v0, v1}, Lcom/liulishuo/okdownload/a$a;->c(Z)Lcom/liulishuo/okdownload/a$a;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-virtual {v0}, Lcom/liulishuo/okdownload/a$a;->a()Lcom/liulishuo/okdownload/a;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    iput-object v0, p0, Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;->a:Lcom/liulishuo/okdownload/a;

    .line 122
    .line 123
    return-void
.end method

.method public initView(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3

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
    check-cast p1, Lcom/zykj/student/dialogue/bean/resp/VersionResult;

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
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;->b:Lcom/zykj/student/dialogue/bean/resp/VersionResult;

    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/zykj/student/dialogue/bean/resp/VersionResult;->getForceUpdate()Z

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
    check-cast p1, Lcom/zykj/student/dialogue/databinding/DialogVersionUpgradeBinding;

    .line 38
    .line 39
    iget-object p1, p1, Lcom/zykj/student/dialogue/databinding/DialogVersionUpgradeBinding;->g:Landroid/widget/TextView;

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
    check-cast p1, Lcom/zykj/student/dialogue/databinding/DialogVersionUpgradeBinding;

    .line 52
    .line 53
    iget-object p1, p1, Lcom/zykj/student/dialogue/databinding/DialogVersionUpgradeBinding;->g:Landroid/widget/TextView;

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
    check-cast p1, Lcom/zykj/student/dialogue/databinding/DialogVersionUpgradeBinding;

    .line 65
    .line 66
    iget-object p1, p1, Lcom/zykj/student/dialogue/databinding/DialogVersionUpgradeBinding;->k:Landroid/widget/TextView;

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
    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;->b:Lcom/zykj/student/dialogue/bean/resp/VersionResult;

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
    invoke-virtual {v1}, Lcom/zykj/student/dialogue/bean/resp/VersionResult;->getVersionName()Ljava/lang/String;

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
    check-cast p1, Lcom/zykj/student/dialogue/databinding/DialogVersionUpgradeBinding;

    .line 107
    .line 108
    iget-object p1, p1, Lcom/zykj/student/dialogue/databinding/DialogVersionUpgradeBinding;->e:Landroid/widget/TextView;

    .line 109
    .line 110
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;->b:Lcom/zykj/student/dialogue/bean/resp/VersionResult;

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
    invoke-virtual {p2}, Lcom/zykj/student/dialogue/bean/resp/VersionResult;->getSummary()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;->g()V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    check-cast p1, Lcom/zykj/student/dialogue/databinding/DialogVersionUpgradeBinding;

    .line 134
    .line 135
    iget-object p1, p1, Lcom/zykj/student/dialogue/databinding/DialogVersionUpgradeBinding;->h:Landroid/widget/TextView;

    .line 136
    .line 137
    const-string p2, "tvNow"

    .line 138
    .line 139
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    new-instance p2, Lw6/a;

    .line 143
    .line 144
    invoke-direct {p2, p0}, Lw6/a;-><init>(Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;)V

    .line 145
    .line 146
    .line 147
    invoke-static {p1, p2}, Li6/b;->h(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    check-cast p1, Lcom/zykj/student/dialogue/databinding/DialogVersionUpgradeBinding;

    .line 155
    .line 156
    iget-object p1, p1, Lcom/zykj/student/dialogue/databinding/DialogVersionUpgradeBinding;->d:Landroid/widget/TextView;

    .line 157
    .line 158
    const-string p2, "tvCancel"

    .line 159
    .line 160
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    new-instance p2, Lw6/b;

    .line 164
    .line 165
    invoke-direct {p2, p0}, Lw6/b;-><init>(Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;)V

    .line 166
    .line 167
    .line 168
    invoke-static {p1, p2}, Li6/b;->h(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    check-cast p1, Lcom/zykj/student/dialogue/databinding/DialogVersionUpgradeBinding;

    .line 176
    .line 177
    iget-object p1, p1, Lcom/zykj/student/dialogue/databinding/DialogVersionUpgradeBinding;->g:Landroid/widget/TextView;

    .line 178
    .line 179
    const-string p2, "tvNotNow"

    .line 180
    .line 181
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    new-instance p2, Lw6/c;

    .line 185
    .line 186
    invoke-direct {p2, p0}, Lw6/c;-><init>(Lcom/zykj/student/dialogue/ui/version/VersionUpgradeDialogFragment;)V

    .line 187
    .line 188
    .line 189
    invoke-static {p1, p2}, Li6/b;->h(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 190
    .line 191
    .line 192
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 193
    .line 194
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/student/dialogue/R$layout;->dialog_version_upgrade:I

    .line 2
    .line 3
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
    sget v2, Lcom/zykj/base/R$dimen;->view_216:I

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    float-to-int v1, v1

    .line 29
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    sget v3, Lcom/zykj/base/R$dimen;->view_234:I

    .line 34
    .line 35
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    float-to-int v2, v2

    .line 40
    invoke-virtual {v0, v1, v2}, Landroid/view/Window;->setLayout(II)V

    .line 41
    .line 42
    .line 43
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 54
    .line 55
    .line 56
    :cond_1
    invoke-super {p0}, Landroidx/fragment/app/DialogFragment;->onStart()V

    .line 57
    .line 58
    .line 59
    return-void
.end method
