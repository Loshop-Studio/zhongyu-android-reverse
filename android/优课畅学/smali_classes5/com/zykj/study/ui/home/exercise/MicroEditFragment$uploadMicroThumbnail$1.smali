.class final Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicroThumbnail$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->T(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/study/bean/OssData;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicroThumbnail$1$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lx7/p;"
    }
.end annotation

.annotation runtime Lo7/d;
    c = "com.zykj.study.ui.home.exercise.MicroEditFragment$uploadMicroThumbnail$1"
    f = "MicroEditFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lcom/zykj/study/bean/OssData;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Lcom/zykj/study/ui/home/exercise/MicroEditFragment;

.field public final synthetic g:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/zykj/study/bean/OssData;Ljava/lang/String;Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Ljava/lang/String;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicroThumbnail$1;->c:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicroThumbnail$1;->d:Lcom/zykj/study/bean/OssData;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicroThumbnail$1;->e:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicroThumbnail$1;->f:Lcom/zykj/study/ui/home/exercise/MicroEditFragment;

    .line 8
    .line 9
    iput-object p5, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicroThumbnail$1;->g:Ljava/lang/String;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static synthetic c(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicroThumbnail$1;->l(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Landroid/content/DialogInterface;)V

    return-void
.end method

.method public static synthetic d(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Ljava/lang/String;Landroid/content/DialogInterface;Landroidx/work/WorkInfo;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicroThumbnail$1;->n(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Ljava/lang/String;Landroid/content/DialogInterface;Landroidx/work/WorkInfo;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Ljava/lang/String;Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicroThumbnail$1;->m(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Ljava/lang/String;Landroid/content/DialogInterface;)V

    return-void
.end method

.method public static final l(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Landroid/content/DialogInterface;)V
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

.method public static final m(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Ljava/lang/String;Landroid/content/DialogInterface;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroidx/work/WorkRequest;->getId()Ljava/util/UUID;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Landroidx/work/WorkManager;->getWorkInfoByIdLiveData(Ljava/util/UUID;)Landroidx/lifecycle/LiveData;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    new-instance v0, Lcom/zykj/study/ui/home/exercise/h;

    .line 14
    .line 15
    invoke-direct {v0, p2, p3, p4}, Lcom/zykj/study/ui/home/exercise/h;-><init>(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Ljava/lang/String;Landroid/content/DialogInterface;)V

    .line 16
    .line 17
    .line 18
    new-instance p2, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$c;

    .line 19
    .line 20
    invoke-direct {p2, v0}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$c;-><init>(Lx7/l;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1, p2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public static final n(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Ljava/lang/String;Landroid/content/DialogInterface;Landroidx/work/WorkInfo;)Lh7/p;
    .locals 2

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    invoke-virtual {p3}, Landroidx/work/WorkInfo;->getState()Landroidx/work/WorkInfo$State;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    if-nez v0, :cond_1

    .line 10
    .line 11
    const/4 v0, -0x1

    .line 12
    goto :goto_1

    .line 13
    :cond_1
    sget-object v1, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicroThumbnail$1$a;->a:[I

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    aget v0, v1, v0

    .line 20
    .line 21
    :goto_1
    const/4 v1, 0x1

    .line 22
    if-eq v0, v1, :cond_4

    .line 23
    .line 24
    const/4 p0, 0x2

    .line 25
    const/4 p1, 0x0

    .line 26
    if-eq v0, p0, :cond_3

    .line 27
    .line 28
    if-nez p3, :cond_2

    .line 29
    .line 30
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_2
    const-string p0, "null cannot be cast to non-null type com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog"

    .line 34
    .line 35
    invoke-static {p2, p0}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    check-cast p2, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 39
    .line 40
    invoke-virtual {p3}, Landroidx/work/WorkInfo;->getProgress()Landroidx/work/Data;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    const-string p3, "progress"

    .line 45
    .line 46
    invoke-virtual {p0, p3, p1}, Landroidx/work/Data;->getInt(Ljava/lang/String;I)I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    invoke-virtual {p2, p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->t(I)V

    .line 51
    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_3
    invoke-virtual {p3}, Landroidx/work/WorkInfo;->getOutputData()Landroidx/work/Data;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    const-string p2, "error_key"

    .line 59
    .line 60
    invoke-virtual {p0, p2, p1}, Landroidx/work/Data;->getInt(Ljava/lang/String;I)I

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    sget-object p1, Lcom/zykj/lib/error/code/ErrorCodeHandler;->INSTANCE:Lcom/zykj/lib/error/code/ErrorCodeHandler;

    .line 65
    .line 66
    invoke-virtual {p1, p0}, Lcom/zykj/lib/error/code/ErrorCodeHandler;->getErrorCode(I)Lcom/zykj/lib/error/code/ErrorCode;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-virtual {p0}, Lcom/zykj/lib/error/code/ErrorCode;->getErrorCodeInfo()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {p0}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getMessageResId()Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    if-eqz p0, :cond_5

    .line 79
    .line 80
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    sget-object p1, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 85
    .line 86
    invoke-static {p1, p0}, Le5/o;->c(Lcom/zykj/base/utils/XToastUtils;I)V

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_4
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment;->t(Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-interface {p2}, Landroid/content/DialogInterface;->dismiss()V

    .line 94
    .line 95
    .line 96
    :cond_5
    :goto_2
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 97
    .line 98
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 7

    .line 1
    new-instance v0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicroThumbnail$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicroThumbnail$1;->c:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicroThumbnail$1;->d:Lcom/zykj/study/bean/OssData;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicroThumbnail$1;->e:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicroThumbnail$1;->f:Lcom/zykj/study/ui/home/exercise/MicroEditFragment;

    .line 10
    .line 11
    iget-object v5, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicroThumbnail$1;->g:Ljava/lang/String;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicroThumbnail$1;-><init>(Ljava/lang/String;Lcom/zykj/study/bean/OssData;Ljava/lang/String;Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Ljava/lang/String;Lm7/c;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, v0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicroThumbnail$1;->b:Ljava/lang/Object;

    .line 18
    .line 19
    return-object v0
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicroThumbnail$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicroThumbnail$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicroThumbnail$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicroThumbnail$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicroThumbnail$1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Li8/b0;

    .line 4
    .line 5
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v0, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicroThumbnail$1;->a:I

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    new-instance p1, Le5/k;

    .line 16
    .line 17
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicroThumbnail$1;->c:Ljava/lang/String;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p1, v0, v1}, Le5/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Le5/k;->c()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    if-nez p1, :cond_0

    .line 28
    .line 29
    iget-object p1, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicroThumbnail$1;->f:Lcom/zykj/study/ui/home/exercise/MicroEditFragment;

    .line 30
    .line 31
    sget-object v0, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 32
    .line 33
    sget v1, Lcom/zykj/study/R$string;->not_find_micro_thumbnail:I

    .line 34
    .line 35
    invoke-virtual {p1, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    const-string v1, "getString(...)"

    .line 40
    .line 41
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-static {v0, p1}, Le5/o;->d(Lcom/zykj/base/utils/XToastUtils;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 48
    .line 49
    return-object p1

    .line 50
    :cond_0
    new-instance v0, Landroidx/work/OneTimeWorkRequest$Builder;

    .line 51
    .line 52
    const-class v1, Lcom/zykj/download/work/UploadFileOssWork;

    .line 53
    .line 54
    invoke-direct {v0, v1}, Landroidx/work/OneTimeWorkRequest$Builder;-><init>(Ljava/lang/Class;)V

    .line 55
    .line 56
    .line 57
    sget-object v1, Lcom/zykj/download/work/UploadFileOssWork;->Companion:Lcom/zykj/download/work/UploadFileOssWork$a;

    .line 58
    .line 59
    iget-object v2, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicroThumbnail$1;->d:Lcom/zykj/study/bean/OssData;

    .line 60
    .line 61
    invoke-virtual {v2}, Lcom/zykj/study/bean/OssData;->getObjectKey()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    iget-object v3, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicroThumbnail$1;->e:Ljava/lang/String;

    .line 66
    .line 67
    new-instance v4, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v2, "/"

    .line 76
    .line 77
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v2, ".jpg"

    .line 84
    .line 85
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    iget-object v3, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicroThumbnail$1;->d:Lcom/zykj/study/bean/OssData;

    .line 93
    .line 94
    invoke-virtual {v3}, Lcom/zykj/study/bean/OssData;->getOssToken()Lcom/zykj/download/OssToken;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    invoke-virtual {v1, p1, v2, v3}, Lcom/zykj/download/work/UploadFileOssWork$a;->a(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/download/OssToken;)Landroidx/work/Data;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-virtual {v0, p1}, Landroidx/work/WorkRequest$Builder;->setInputData(Landroidx/work/Data;)Landroidx/work/WorkRequest$Builder;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    check-cast p1, Landroidx/work/OneTimeWorkRequest$Builder;

    .line 107
    .line 108
    invoke-virtual {p1}, Landroidx/work/WorkRequest$Builder;->build()Landroidx/work/WorkRequest;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    check-cast p1, Landroidx/work/OneTimeWorkRequest;

    .line 113
    .line 114
    sget-object v0, Landroidx/work/WorkManager;->Companion:Landroidx/work/WorkManager$Companion;

    .line 115
    .line 116
    iget-object v1, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicroThumbnail$1;->f:Lcom/zykj/study/ui/home/exercise/MicroEditFragment;

    .line 117
    .line 118
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    const-string v2, "requireContext(...)"

    .line 123
    .line 124
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, v1}, Landroidx/work/WorkManager$Companion;->getInstance(Landroid/content/Context;)Landroidx/work/WorkManager;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {v0, p1}, Landroidx/work/WorkManager;->enqueue(Landroidx/work/WorkRequest;)Landroidx/work/Operation;

    .line 132
    .line 133
    .line 134
    new-instance v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 135
    .line 136
    iget-object v2, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicroThumbnail$1;->f:Lcom/zykj/study/ui/home/exercise/MicroEditFragment;

    .line 137
    .line 138
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    invoke-direct {v1, v2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;-><init>(Landroid/content/Context;)V

    .line 143
    .line 144
    .line 145
    iget-object v2, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicroThumbnail$1;->f:Lcom/zykj/study/ui/home/exercise/MicroEditFragment;

    .line 146
    .line 147
    sget v3, Lcom/zykj/study/R$string;->upload_micro_thumbnail:I

    .line 148
    .line 149
    invoke-virtual {v2, v3}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->j(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    sget-object v2, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->b:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 158
    .line 159
    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->k(Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    const/16 v2, 0x64

    .line 164
    .line 165
    const/4 v3, 0x1

    .line 166
    const/4 v4, 0x0

    .line 167
    invoke-virtual {v1, v4, v2, v3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->C(ZIZ)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    new-instance v2, Lcom/zykj/study/ui/home/exercise/f;

    .line 172
    .line 173
    invoke-direct {v2, v0, p1}, Lcom/zykj/study/ui/home/exercise/f;-><init>(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v1, v2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->d(Landroid/content/DialogInterface$OnCancelListener;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    iget-object v2, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicroThumbnail$1;->f:Lcom/zykj/study/ui/home/exercise/MicroEditFragment;

    .line 181
    .line 182
    iget-object v3, p0, Lcom/zykj/study/ui/home/exercise/MicroEditFragment$uploadMicroThumbnail$1;->g:Ljava/lang/String;

    .line 183
    .line 184
    new-instance v4, Lcom/zykj/study/ui/home/exercise/g;

    .line 185
    .line 186
    invoke-direct {v4, v0, p1, v2, v3}, Lcom/zykj/study/ui/home/exercise/g;-><init>(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Lcom/zykj/study/ui/home/exercise/MicroEditFragment;Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v1, v4}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->F(Landroid/content/DialogInterface$OnShowListener;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    sget v0, Lcom/zykj/study/R$string;->cancel:I

    .line 194
    .line 195
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->t(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->E()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 200
    .line 201
    .line 202
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 203
    .line 204
    return-object p1

    .line 205
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 206
    .line 207
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 208
    .line 209
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    throw p1
.end method
