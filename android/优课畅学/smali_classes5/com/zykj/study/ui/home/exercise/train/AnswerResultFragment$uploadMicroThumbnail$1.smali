.class final Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$uploadMicroThumbnail$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;->L(Ljava/lang/String;ZLx7/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$uploadMicroThumbnail$1$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lx7/p;"
    }
.end annotation

.annotation runtime Lo7/d;
    c = "com.zykj.study.ui.home.exercise.train.AnswerResultFragment$uploadMicroThumbnail$1"
    f = "AnswerResultFragment.kt"
    l = {
        0xcd
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;

.field public final synthetic f:Z

.field public final synthetic g:Lx7/a;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;ZLx7/a;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$uploadMicroThumbnail$1;->d:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$uploadMicroThumbnail$1;->e:Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;

    .line 4
    .line 5
    iput-boolean p3, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$uploadMicroThumbnail$1;->f:Z

    .line 6
    .line 7
    iput-object p4, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$uploadMicroThumbnail$1;->g:Lx7/a;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static synthetic c(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;ZLx7/a;Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$uploadMicroThumbnail$1;->m(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;ZLx7/a;Landroid/content/DialogInterface;)V

    return-void
.end method

.method public static synthetic d(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$uploadMicroThumbnail$1;->l(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Landroid/content/DialogInterface;)V

    return-void
.end method

.method public static synthetic k(Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;ZLx7/a;Landroid/content/DialogInterface;Landroidx/work/WorkInfo;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$uploadMicroThumbnail$1;->n(Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;ZLx7/a;Landroid/content/DialogInterface;Landroidx/work/WorkInfo;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method private static final l(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Landroid/content/DialogInterface;)V
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

.method public static final m(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;ZLx7/a;Landroid/content/DialogInterface;)V
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
    new-instance v0, Lcom/zykj/study/ui/home/exercise/train/g;

    .line 14
    .line 15
    invoke-direct {v0, p2, p3, p4, p5}, Lcom/zykj/study/ui/home/exercise/train/g;-><init>(Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;ZLx7/a;Landroid/content/DialogInterface;)V

    .line 16
    .line 17
    .line 18
    new-instance p2, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$b;

    .line 19
    .line 20
    invoke-direct {p2, v0}, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$b;-><init>(Lx7/l;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1, p2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public static final n(Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;ZLx7/a;Landroid/content/DialogInterface;Landroidx/work/WorkInfo;)Lh7/p;
    .locals 2

    .line 1
    if-eqz p4, :cond_0

    .line 2
    .line 3
    invoke-virtual {p4}, Landroidx/work/WorkInfo;->getState()Landroidx/work/WorkInfo$State;

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
    sget-object v1, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$uploadMicroThumbnail$1$a;->a:[I

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
    if-nez p4, :cond_2

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
    invoke-static {p3, p0}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    check-cast p3, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 39
    .line 40
    invoke-virtual {p4}, Landroidx/work/WorkInfo;->getProgress()Landroidx/work/Data;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    const-string p2, "progress"

    .line 45
    .line 46
    invoke-virtual {p0, p2, p1}, Landroidx/work/Data;->getInt(Ljava/lang/String;I)I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    invoke-virtual {p3, p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->t(I)V

    .line 51
    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_3
    invoke-virtual {p4}, Landroidx/work/WorkInfo;->getOutputData()Landroidx/work/Data;

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
    if-eqz p0, :cond_6

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
    invoke-virtual {p4}, Landroidx/work/WorkInfo;->getOutputData()Landroidx/work/Data;

    .line 91
    .line 92
    .line 93
    move-result-object p4

    .line 94
    const-string v0, "success_key"

    .line 95
    .line 96
    invoke-virtual {p4, v0}, Landroidx/work/Data;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p4

    .line 100
    if-nez p4, :cond_5

    .line 101
    .line 102
    const-string p4, ""

    .line 103
    .line 104
    :cond_5
    invoke-static {p0, p4, p1, p2}, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;->o(Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;Ljava/lang/String;ZLx7/a;)V

    .line 105
    .line 106
    .line 107
    invoke-interface {p3}, Landroid/content/DialogInterface;->dismiss()V

    .line 108
    .line 109
    .line 110
    :cond_6
    :goto_2
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 111
    .line 112
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 6

    .line 1
    new-instance v0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$uploadMicroThumbnail$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$uploadMicroThumbnail$1;->d:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$uploadMicroThumbnail$1;->e:Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;

    .line 6
    .line 7
    iget-boolean v3, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$uploadMicroThumbnail$1;->f:Z

    .line 8
    .line 9
    iget-object v4, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$uploadMicroThumbnail$1;->g:Lx7/a;

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$uploadMicroThumbnail$1;-><init>(Ljava/lang/String;Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;ZLx7/a;Lm7/c;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, v0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$uploadMicroThumbnail$1;->c:Ljava/lang/Object;

    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$uploadMicroThumbnail$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$uploadMicroThumbnail$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$uploadMicroThumbnail$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$uploadMicroThumbnail$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$uploadMicroThumbnail$1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Li8/b0;

    .line 4
    .line 5
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v11

    .line 9
    iget v1, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$uploadMicroThumbnail$1;->b:I

    .line 10
    .line 11
    const/4 v12, 0x1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    if-ne v1, v12, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$uploadMicroThumbnail$1;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    move-object v0, p1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v0

    .line 33
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$uploadMicroThumbnail$1;->d:Ljava/lang/String;

    .line 37
    .line 38
    if-nez v1, :cond_2

    .line 39
    .line 40
    sget-object v0, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 41
    .line 42
    iget-object v1, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$uploadMicroThumbnail$1;->e:Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;

    .line 43
    .line 44
    sget v2, Lcom/zykj/study/R$string;->not_find_micro_thumbnail:I

    .line 45
    .line 46
    invoke-virtual {v1, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    const-string v2, "getString(...)"

    .line 51
    .line 52
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-static {v0, v1}, Le5/o;->d(Lcom/zykj/base/utils/XToastUtils;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    sget-object v0, Lh7/p;->a:Lh7/p;

    .line 59
    .line 60
    return-object v0

    .line 61
    :cond_2
    invoke-static {v1}, Lcom/blankj/utilcode/util/k;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    iget-object v2, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$uploadMicroThumbnail$1;->e:Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;

    .line 66
    .line 67
    invoke-static {v2}, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;->r(Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;)Lcom/zykj/study/viewmodels/OssTokenViewModel;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    sget-object v3, Lcom/zykj/study/bean/OssFileType$File;->INSTANCE:Lcom/zykj/study/bean/OssFileType$File;

    .line 72
    .line 73
    new-instance v4, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 76
    .line 77
    .line 78
    const-string v5, "."

    .line 79
    .line 80
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    move-object v5, v1

    .line 91
    move-object v1, v3

    .line 92
    sget-object v3, Lcom/zykj/study/bean/OssFileResource$Resource;->INSTANCE:Lcom/zykj/study/bean/OssFileResource$Resource;

    .line 93
    .line 94
    iput-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$uploadMicroThumbnail$1;->c:Ljava/lang/Object;

    .line 95
    .line 96
    invoke-static {v5}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    iput-object v0, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$uploadMicroThumbnail$1;->a:Ljava/lang/Object;

    .line 101
    .line 102
    iput v12, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$uploadMicroThumbnail$1;->b:I

    .line 103
    .line 104
    move-object v0, v2

    .line 105
    move-object v2, v4

    .line 106
    const/4 v4, 0x0

    .line 107
    const/4 v5, 0x0

    .line 108
    const-wide/16 v6, 0x0

    .line 109
    .line 110
    const/16 v9, 0x38

    .line 111
    .line 112
    const/4 v10, 0x0

    .line 113
    move-object v8, p0

    .line 114
    invoke-static/range {v0 .. v10}, Lcom/zykj/study/viewmodels/OssTokenViewModel;->b(Lcom/zykj/study/viewmodels/OssTokenViewModel;Lcom/zykj/study/bean/OssFileType;Ljava/lang/String;Lcom/zykj/study/bean/OssFileResource;Ljava/lang/String;Ljava/lang/String;JLm7/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    if-ne v0, v11, :cond_3

    .line 119
    .line 120
    return-object v11

    .line 121
    :cond_3
    :goto_0
    check-cast v0, Lcom/zykj/study/bean/OssData;

    .line 122
    .line 123
    if-nez v0, :cond_4

    .line 124
    .line 125
    sget-object v0, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 126
    .line 127
    sget v1, Lcom/zykj/study/R$string;->lost_oss_token_please_wait:I

    .line 128
    .line 129
    invoke-static {v0, v1}, Le5/o;->c(Lcom/zykj/base/utils/XToastUtils;I)V

    .line 130
    .line 131
    .line 132
    sget-object v0, Lh7/p;->a:Lh7/p;

    .line 133
    .line 134
    return-object v0

    .line 135
    :cond_4
    new-instance v1, Landroidx/work/OneTimeWorkRequest$Builder;

    .line 136
    .line 137
    const-class v2, Lcom/zykj/download/work/UploadFileOssWork;

    .line 138
    .line 139
    invoke-direct {v1, v2}, Landroidx/work/OneTimeWorkRequest$Builder;-><init>(Ljava/lang/Class;)V

    .line 140
    .line 141
    .line 142
    sget-object v2, Lcom/zykj/download/work/UploadFileOssWork;->Companion:Lcom/zykj/download/work/UploadFileOssWork$a;

    .line 143
    .line 144
    iget-object v3, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$uploadMicroThumbnail$1;->d:Ljava/lang/String;

    .line 145
    .line 146
    invoke-virtual {v0}, Lcom/zykj/study/bean/OssData;->getObjectKey()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    invoke-virtual {v0}, Lcom/zykj/study/bean/OssData;->getOssToken()Lcom/zykj/download/OssToken;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-virtual {v2, v3, v4, v0}, Lcom/zykj/download/work/UploadFileOssWork$a;->a(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/download/OssToken;)Landroidx/work/Data;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-virtual {v1, v0}, Landroidx/work/WorkRequest$Builder;->setInputData(Landroidx/work/Data;)Landroidx/work/WorkRequest$Builder;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    check-cast v0, Landroidx/work/OneTimeWorkRequest$Builder;

    .line 163
    .line 164
    invoke-virtual {v0}, Landroidx/work/WorkRequest$Builder;->build()Landroidx/work/WorkRequest;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    move-object v3, v0

    .line 169
    check-cast v3, Landroidx/work/OneTimeWorkRequest;

    .line 170
    .line 171
    sget-object v0, Landroidx/work/WorkManager;->Companion:Landroidx/work/WorkManager$Companion;

    .line 172
    .line 173
    iget-object v1, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$uploadMicroThumbnail$1;->e:Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;

    .line 174
    .line 175
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    const-string v2, "requireContext(...)"

    .line 180
    .line 181
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v0, v1}, Landroidx/work/WorkManager$Companion;->getInstance(Landroid/content/Context;)Landroidx/work/WorkManager;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    invoke-virtual {v2, v3}, Landroidx/work/WorkManager;->enqueue(Landroidx/work/WorkRequest;)Landroidx/work/Operation;

    .line 189
    .line 190
    .line 191
    new-instance v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 192
    .line 193
    iget-object v1, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$uploadMicroThumbnail$1;->e:Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;

    .line 194
    .line 195
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    invoke-direct {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;-><init>(Landroid/content/Context;)V

    .line 200
    .line 201
    .line 202
    iget-object v1, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$uploadMicroThumbnail$1;->e:Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;

    .line 203
    .line 204
    sget v4, Lcom/zykj/study/R$string;->upload_micro_thumbnail:I

    .line 205
    .line 206
    invoke-virtual {v1, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->j(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    sget-object v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->b:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 215
    .line 216
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->k(Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    const/4 v1, 0x0

    .line 221
    const/16 v4, 0x64

    .line 222
    .line 223
    invoke-virtual {v0, v1, v4, v12}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->C(ZIZ)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    new-instance v1, Lcom/zykj/study/ui/home/exercise/train/e;

    .line 228
    .line 229
    invoke-direct {v1, v2, v3}, Lcom/zykj/study/ui/home/exercise/train/e;-><init>(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->d(Landroid/content/DialogInterface$OnCancelListener;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    iget-object v4, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$uploadMicroThumbnail$1;->e:Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;

    .line 237
    .line 238
    iget-boolean v5, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$uploadMicroThumbnail$1;->f:Z

    .line 239
    .line 240
    iget-object v6, p0, Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment$uploadMicroThumbnail$1;->g:Lx7/a;

    .line 241
    .line 242
    new-instance v1, Lcom/zykj/study/ui/home/exercise/train/f;

    .line 243
    .line 244
    invoke-direct/range {v1 .. v6}, Lcom/zykj/study/ui/home/exercise/train/f;-><init>(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Lcom/zykj/study/ui/home/exercise/train/AnswerResultFragment;ZLx7/a;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->F(Landroid/content/DialogInterface$OnShowListener;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    sget v1, Lcom/zykj/study/R$string;->cancel:I

    .line 252
    .line 253
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->t(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->E()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 258
    .line 259
    .line 260
    sget-object v0, Lh7/p;->a:Lh7/p;

    .line 261
    .line 262
    return-object v0
.end method
