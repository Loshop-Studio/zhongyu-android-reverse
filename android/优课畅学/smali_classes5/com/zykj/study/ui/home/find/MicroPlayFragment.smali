.class public final Lcom/zykj/study/ui/home/find/MicroPlayFragment;
.super Lcom/zykj/study/ui/home/find/Hilt_MicroPlayFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/ui/home/find/MicroPlayFragment$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/study/ui/home/find/Hilt_MicroPlayFragment<",
        "Lcom/zykj/study/databinding/FragmentMicroPlayBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final f:Landroidx/navigation/NavArgsLazy;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/find/Hilt_MicroPlayFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/navigation/NavArgsLazy;

    .line 5
    .line 6
    const-class v1, Lcom/zykj/study/ui/home/find/MicroPlayFragmentArgs;

    .line 7
    .line 8
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Lcom/zykj/study/ui/home/find/MicroPlayFragment$c;

    .line 13
    .line 14
    invoke-direct {v2, p0}, Lcom/zykj/study/ui/home/find/MicroPlayFragment$c;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, Landroidx/navigation/NavArgsLazy;-><init>(Le8/c;Lx7/a;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/zykj/study/ui/home/find/MicroPlayFragment;->f:Landroidx/navigation/NavArgsLazy;

    .line 21
    .line 22
    return-void
.end method

.method public static synthetic g(Lcom/zykj/study/ui/home/find/MicroPlayFragment;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/find/MicroPlayFragment;->r(Lcom/zykj/study/ui/home/find/MicroPlayFragment;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Landroid/content/DialogInterface;Lcom/zykj/study/ui/home/find/MicroPlayFragment;Lcom/zykj/view/board/play/SketchPlayFragment;Ljava/util/List;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/study/ui/home/find/MicroPlayFragment;->o(Landroid/content/DialogInterface;Lcom/zykj/study/ui/home/find/MicroPlayFragment;Lcom/zykj/view/board/play/SketchPlayFragment;Ljava/util/List;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i()Lh7/p;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/study/ui/home/find/MicroPlayFragment;->t()Lh7/p;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic j()Lh7/p;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/study/ui/home/find/MicroPlayFragment;->s()Lh7/p;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic k(Landroidx/work/WorkManager;Ljava/lang/String;Lcom/zykj/study/ui/home/find/MicroPlayFragment;Lcom/zykj/view/board/play/SketchPlayFragment;Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/zykj/study/ui/home/find/MicroPlayFragment;->n(Landroidx/work/WorkManager;Ljava/lang/String;Lcom/zykj/study/ui/home/find/MicroPlayFragment;Lcom/zykj/view/board/play/SketchPlayFragment;Landroid/content/DialogInterface;)V

    return-void
.end method

.method public static synthetic l(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/ui/home/find/MicroPlayFragment;->p(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Landroid/content/DialogInterface;)V

    return-void
.end method

.method private final m(Lcom/zykj/view/board/play/SketchPlayFragment;Ljava/lang/String;)V
    .locals 8

    .line 1
    new-instance v0, Landroidx/work/OneTimeWorkRequest$Builder;

    .line 2
    .line 3
    const-class v1, Lcom/zykj/download/work/DownloadFileCommonWork;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroidx/work/OneTimeWorkRequest$Builder;-><init>(Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    sget-object v2, Lcom/zykj/download/work/DownloadFileCommonWork;->Companion:Lcom/zykj/download/work/DownloadFileCommonWork$a;

    .line 9
    .line 10
    const/4 v6, 0x6

    .line 11
    const/4 v7, 0x0

    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x0

    .line 14
    move-object v3, p2

    .line 15
    invoke-static/range {v2 .. v7}, Lcom/zykj/download/work/DownloadFileCommonWork$a;->b(Lcom/zykj/download/work/DownloadFileCommonWork$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Landroidx/work/Data;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-virtual {v0, p2}, Landroidx/work/WorkRequest$Builder;->setInputData(Landroidx/work/Data;)Landroidx/work/WorkRequest$Builder;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    check-cast p2, Landroidx/work/OneTimeWorkRequest$Builder;

    .line 24
    .line 25
    invoke-virtual {p2}, Landroidx/work/WorkRequest$Builder;->build()Landroidx/work/WorkRequest;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    check-cast p2, Landroidx/work/OneTimeWorkRequest;

    .line 30
    .line 31
    sget-object v0, Landroidx/work/WorkManager;->Companion:Landroidx/work/WorkManager$Companion;

    .line 32
    .line 33
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const-string v2, "requireContext(...)"

    .line 38
    .line 39
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroidx/work/WorkManager$Companion;->getInstance(Landroid/content/Context;)Landroidx/work/WorkManager;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sget-object v1, Landroidx/work/ExistingWorkPolicy;->KEEP:Landroidx/work/ExistingWorkPolicy;

    .line 47
    .line 48
    invoke-virtual {v0, v3, v1, p2}, Landroidx/work/WorkManager;->enqueueUniqueWork(Ljava/lang/String;Landroidx/work/ExistingWorkPolicy;Landroidx/work/OneTimeWorkRequest;)Landroidx/work/Operation;

    .line 49
    .line 50
    .line 51
    new-instance v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 52
    .line 53
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-direct {v1, v2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;-><init>(Landroid/content/Context;)V

    .line 58
    .line 59
    .line 60
    sget v2, Lcom/zykj/study/R$string;->downloading_wait:I

    .line 61
    .line 62
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->j(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    sget-object v2, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->b:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 71
    .line 72
    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->k(Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    const/16 v2, 0x64

    .line 77
    .line 78
    const/4 v4, 0x1

    .line 79
    const/4 v5, 0x0

    .line 80
    invoke-virtual {v1, v5, v2, v4}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->C(ZIZ)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    new-instance v2, Ly4/i0;

    .line 85
    .line 86
    invoke-direct {v2, v0, p2}, Ly4/i0;-><init>(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->d(Landroid/content/DialogInterface$OnCancelListener;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    new-instance v1, Ly4/j0;

    .line 94
    .line 95
    invoke-direct {v1, v0, v3, p0, p1}, Ly4/j0;-><init>(Landroidx/work/WorkManager;Ljava/lang/String;Lcom/zykj/study/ui/home/find/MicroPlayFragment;Lcom/zykj/view/board/play/SketchPlayFragment;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p2, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->F(Landroid/content/DialogInterface$OnShowListener;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    sget p2, Lcom/zykj/study/R$string;->cancel:I

    .line 103
    .line 104
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->t(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->E()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 109
    .line 110
    .line 111
    return-void
.end method

.method public static final n(Landroidx/work/WorkManager;Ljava/lang/String;Lcom/zykj/study/ui/home/find/MicroPlayFragment;Lcom/zykj/view/board/play/SketchPlayFragment;Landroid/content/DialogInterface;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Landroidx/work/WorkManager;->getWorkInfosForUniqueWorkLiveData(Ljava/lang/String;)Landroidx/lifecycle/LiveData;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    new-instance v0, Ly4/k0;

    .line 10
    .line 11
    invoke-direct {v0, p4, p2, p3}, Ly4/k0;-><init>(Landroid/content/DialogInterface;Lcom/zykj/study/ui/home/find/MicroPlayFragment;Lcom/zykj/view/board/play/SketchPlayFragment;)V

    .line 12
    .line 13
    .line 14
    new-instance p2, Lcom/zykj/study/ui/home/find/MicroPlayFragment$b;

    .line 15
    .line 16
    invoke-direct {p2, v0}, Lcom/zykj/study/ui/home/find/MicroPlayFragment$b;-><init>(Lx7/l;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1, p2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static final o(Landroid/content/DialogInterface;Lcom/zykj/study/ui/home/find/MicroPlayFragment;Lcom/zykj/view/board/play/SketchPlayFragment;Ljava/util/List;)Lh7/p;
    .locals 2

    .line 1
    invoke-static {p3}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p3}, Li7/f0;->n0(Ljava/util/List;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p3

    .line 8
    check-cast p3, Landroidx/work/WorkInfo;

    .line 9
    .line 10
    if-eqz p3, :cond_3

    .line 11
    .line 12
    invoke-virtual {p3}, Landroidx/work/WorkInfo;->getState()Landroidx/work/WorkInfo$State;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v1, Lcom/zykj/study/ui/home/find/MicroPlayFragment$a;->a:[I

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    aget v0, v1, v0

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    if-eq v0, v1, :cond_2

    .line 26
    .line 27
    const/4 p1, 0x2

    .line 28
    const/4 p2, 0x0

    .line 29
    if-eq v0, p1, :cond_0

    .line 30
    .line 31
    const-string p1, "null cannot be cast to non-null type com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog"

    .line 32
    .line 33
    invoke-static {p0, p1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    check-cast p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 37
    .line 38
    invoke-virtual {p3}, Landroidx/work/WorkInfo;->getProgress()Landroidx/work/Data;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    const-string p3, "progress"

    .line 43
    .line 44
    invoke-virtual {p1, p3, p2}, Landroidx/work/Data;->getInt(Ljava/lang/String;I)I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->t(I)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    invoke-virtual {p3}, Landroidx/work/WorkInfo;->getOutputData()Landroidx/work/Data;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    const-string p3, "error_key"

    .line 57
    .line 58
    invoke-virtual {p1, p3, p2}, Landroidx/work/Data;->getInt(Ljava/lang/String;I)I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    sget-object p2, Lcom/zykj/lib/error/code/ErrorCodeHandler;->INSTANCE:Lcom/zykj/lib/error/code/ErrorCodeHandler;

    .line 63
    .line 64
    invoke-virtual {p2, p1}, Lcom/zykj/lib/error/code/ErrorCodeHandler;->getErrorCode(I)Lcom/zykj/lib/error/code/ErrorCode;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p1}, Lcom/zykj/lib/error/code/ErrorCode;->getErrorCodeInfo()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p1}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getMessageResId()Ljava/lang/Integer;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    if-eqz p1, :cond_1

    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    sget-object p2, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 83
    .line 84
    invoke-static {p2, p1}, Le5/o;->c(Lcom/zykj/base/utils/XToastUtils;I)V

    .line 85
    .line 86
    .line 87
    :cond_1
    invoke-interface {p0}, Landroid/content/DialogInterface;->dismiss()V

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_2
    invoke-interface {p0}, Landroid/content/DialogInterface;->dismiss()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p3}, Landroidx/work/WorkInfo;->getOutputData()Landroidx/work/Data;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    const-string p3, "success_key"

    .line 99
    .line 100
    invoke-virtual {p0, p3}, Landroidx/work/Data;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    if-eqz p0, :cond_3

    .line 105
    .line 106
    new-instance p3, Ljava/io/File;

    .line 107
    .line 108
    invoke-direct {p3, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    new-instance p0, Ljava/io/File;

    .line 112
    .line 113
    invoke-virtual {p3}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-static {p3}, Lt7/h;->f(Ljava/io/File;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-direct {p0, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-static {p3, p0}, Lcom/blankj/utilcode/util/m0;->b(Ljava/io/File;Ljava/io/File;)Ljava/util/List;

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    const-string p3, "getAbsolutePath(...)"

    .line 132
    .line 133
    invoke-static {p0, p3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-direct {p1, p2, p0}, Lcom/zykj/study/ui/home/find/MicroPlayFragment;->u(Lcom/zykj/view/board/play/SketchPlayFragment;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    :cond_3
    :goto_0
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 140
    .line 141
    return-object p0
.end method

.method public static final p(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroidx/work/WorkRequest;->getId()Ljava/util/UUID;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Landroidx/work/WorkManager;->cancelWorkById(Ljava/util/UUID;)Landroidx/work/Operation;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final r(Lcom/zykj/study/ui/home/find/MicroPlayFragment;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 6
    .line 7
    .line 8
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 9
    .line 10
    return-object p0
.end method

.method public static final s()Lh7/p;
    .locals 1

    .line 1
    sget-object v0, Lh7/p;->a:Lh7/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final t()Lh7/p;
    .locals 1

    .line 1
    sget-object v0, Lh7/p;->a:Lh7/p;

    .line 2
    .line 3
    return-object v0
.end method

.method private final u(Lcom/zykj/view/board/play/SketchPlayFragment;Ljava/lang/String;)V
    .locals 8

    .line 1
    const/16 v6, 0x1e

    .line 2
    .line 3
    const/4 v7, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x0

    .line 7
    const/4 v5, 0x0

    .line 8
    move-object v0, p1

    .line 9
    move-object v1, p2

    .line 10
    invoke-static/range {v0 .. v7}, Lcom/zykj/view/board/play/SketchPlayFragment;->e0(Lcom/zykj/view/board/play/SketchPlayFragment;Ljava/lang/String;IZLx7/l;Lx7/l;ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 13

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget p2, Lcom/zykj/study/R$id;->sketch_play_fragment:I

    .line 6
    .line 7
    invoke-virtual {p1, p2}, Landroidx/fragment/app/FragmentManager;->findFragmentById(I)Landroidx/fragment/app/Fragment;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string p2, "null cannot be cast to non-null type com.zykj.view.board.play.SketchPlayFragment"

    .line 12
    .line 13
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    check-cast p1, Lcom/zykj/view/board/play/SketchPlayFragment;

    .line 17
    .line 18
    new-instance v0, Ls5/a;

    .line 19
    .line 20
    new-instance v2, Ly4/f0;

    .line 21
    .line 22
    invoke-direct {v2, p0}, Ly4/f0;-><init>(Lcom/zykj/study/ui/home/find/MicroPlayFragment;)V

    .line 23
    .line 24
    .line 25
    new-instance v3, Ly4/g0;

    .line 26
    .line 27
    invoke-direct {v3}, Ly4/g0;-><init>()V

    .line 28
    .line 29
    .line 30
    new-instance v5, Ly4/h0;

    .line 31
    .line 32
    invoke-direct {v5}, Ly4/h0;-><init>()V

    .line 33
    .line 34
    .line 35
    const/16 v11, 0x2e0

    .line 36
    .line 37
    const/4 v12, 0x0

    .line 38
    const/4 v1, 0x0

    .line 39
    const/4 v4, 0x0

    .line 40
    const/4 v6, 0x0

    .line 41
    const/4 v7, 0x0

    .line 42
    const/4 v8, 0x0

    .line 43
    const/4 v9, 0x1

    .line 44
    const/4 v10, 0x0

    .line 45
    invoke-direct/range {v0 .. v12}, Ls5/a;-><init>(ZLx7/a;Lx7/a;ZLx7/a;Ljava/util/List;Lx7/a;Ls5/b;ZZILkotlin/jvm/internal/n;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v0}, Lcom/zykj/view/board/play/SketchPlayFragment;->h0(Ls5/a;)V

    .line 49
    .line 50
    .line 51
    new-instance p2, Ljava/io/File;

    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/MicroPlayFragment;->q()Lcom/zykj/study/ui/home/find/MicroPlayFragmentArgs;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Lcom/zykj/study/ui/home/find/MicroPlayFragmentArgs;->a()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-direct {p2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p2}, Ljava/io/File;->exists()Z

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    if-eqz p2, :cond_0

    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/MicroPlayFragment;->q()Lcom/zykj/study/ui/home/find/MicroPlayFragmentArgs;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    invoke-virtual {p2}, Lcom/zykj/study/ui/home/find/MicroPlayFragmentArgs;->a()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    invoke-direct {p0, p1, p2}, Lcom/zykj/study/ui/home/find/MicroPlayFragment;->u(Lcom/zykj/view/board/play/SketchPlayFragment;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    goto/16 :goto_0

    .line 82
    .line 83
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/MicroPlayFragment;->q()Lcom/zykj/study/ui/home/find/MicroPlayFragmentArgs;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    invoke-virtual {p2}, Lcom/zykj/study/ui/home/find/MicroPlayFragmentArgs;->a()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    invoke-static {p2}, Landroid/webkit/URLUtil;->isNetworkUrl(Ljava/lang/String;)Z

    .line 92
    .line 93
    .line 94
    move-result p2

    .line 95
    if-eqz p2, :cond_2

    .line 96
    .line 97
    sget-object p2, Lcom/zykj/download/OssUtils;->INSTANCE:Lcom/zykj/download/OssUtils;

    .line 98
    .line 99
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    const-string v1, "requireContext(...)"

    .line 104
    .line 105
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/MicroPlayFragment;->q()Lcom/zykj/study/ui/home/find/MicroPlayFragmentArgs;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-virtual {v1}, Lcom/zykj/study/ui/home/find/MicroPlayFragmentArgs;->a()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-virtual {p2, v0, v1}, Lcom/zykj/download/OssUtils;->checkDownloadDir(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/MicroPlayFragment;->q()Lcom/zykj/study/ui/home/find/MicroPlayFragmentArgs;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-virtual {v1}, Lcom/zykj/study/ui/home/find/MicroPlayFragmentArgs;->a()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    const/4 v2, 0x0

    .line 129
    invoke-virtual {p2, v2, v1}, Lcom/zykj/download/OssUtils;->checkFileName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    new-instance v1, Ljava/io/File;

    .line 134
    .line 135
    new-instance v2, Ljava/io/File;

    .line 136
    .line 137
    invoke-direct {v2, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-static {v2}, Lt7/h;->f(Ljava/io/File;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p2

    .line 144
    invoke-direct {v1, v0, p2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 148
    .line 149
    .line 150
    move-result p2

    .line 151
    if-eqz p2, :cond_1

    .line 152
    .line 153
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p2

    .line 157
    const-string v0, "getAbsolutePath(...)"

    .line 158
    .line 159
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    invoke-direct {p0, p1, p2}, Lcom/zykj/study/ui/home/find/MicroPlayFragment;->u(Lcom/zykj/view/board/play/SketchPlayFragment;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    goto :goto_0

    .line 166
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/MicroPlayFragment;->q()Lcom/zykj/study/ui/home/find/MicroPlayFragmentArgs;

    .line 167
    .line 168
    .line 169
    move-result-object p2

    .line 170
    invoke-virtual {p2}, Lcom/zykj/study/ui/home/find/MicroPlayFragmentArgs;->a()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p2

    .line 174
    invoke-direct {p0, p1, p2}, Lcom/zykj/study/ui/home/find/MicroPlayFragment;->m(Lcom/zykj/view/board/play/SketchPlayFragment;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    goto :goto_0

    .line 178
    :cond_2
    sget-object p1, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 179
    .line 180
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/find/MicroPlayFragment;->q()Lcom/zykj/study/ui/home/find/MicroPlayFragmentArgs;

    .line 181
    .line 182
    .line 183
    move-result-object p2

    .line 184
    invoke-virtual {p2}, Lcom/zykj/study/ui/home/find/MicroPlayFragmentArgs;->a()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p2

    .line 188
    new-instance v0, Ljava/lang/StringBuilder;

    .line 189
    .line 190
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 191
    .line 192
    .line 193
    const-string v1, "\u6587\u4ef6\u4e0d\u5b58\u5728 "

    .line 194
    .line 195
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object p2

    .line 205
    invoke-static {p1, p2}, Le5/o;->d(Lcom/zykj/base/utils/XToastUtils;Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    :goto_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 209
    .line 210
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->fragment_micro_play:I

    .line 2
    .line 3
    return v0
.end method

.method public final q()Lcom/zykj/study/ui/home/find/MicroPlayFragmentArgs;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/find/MicroPlayFragment;->f:Landroidx/navigation/NavArgsLazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/ui/home/find/MicroPlayFragmentArgs;

    .line 8
    .line 9
    return-object v0
.end method
