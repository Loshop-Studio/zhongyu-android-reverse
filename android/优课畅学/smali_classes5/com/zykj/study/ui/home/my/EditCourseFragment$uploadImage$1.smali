.class final Lcom/zykj/study/ui/home/my/EditCourseFragment$uploadImage$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/my/EditCourseFragment;->K(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/ui/home/my/EditCourseFragment$uploadImage$1$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lx7/p;"
    }
.end annotation

.annotation runtime Lo7/d;
    c = "com.zykj.study.ui.home.my.EditCourseFragment$uploadImage$1"
    f = "EditCourseFragment.kt"
    l = {
        0xa5
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lcom/zykj/study/ui/home/my/EditCourseFragment;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/zykj/study/ui/home/my/EditCourseFragment;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/my/EditCourseFragment$uploadImage$1;->d:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/ui/home/my/EditCourseFragment$uploadImage$1;->e:Lcom/zykj/study/ui/home/my/EditCourseFragment;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static synthetic c(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Lcom/zykj/study/ui/home/my/EditCourseFragment;Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/study/ui/home/my/EditCourseFragment$uploadImage$1;->m(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Lcom/zykj/study/ui/home/my/EditCourseFragment;Landroid/content/DialogInterface;)V

    return-void
.end method

.method public static synthetic d(Landroid/content/DialogInterface;Lcom/zykj/study/ui/home/my/EditCourseFragment;Landroidx/work/WorkInfo;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/ui/home/my/EditCourseFragment$uploadImage$1;->n(Landroid/content/DialogInterface;Lcom/zykj/study/ui/home/my/EditCourseFragment;Landroidx/work/WorkInfo;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/ui/home/my/EditCourseFragment$uploadImage$1;->l(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Landroid/content/DialogInterface;)V

    return-void
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

.method public static final m(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Lcom/zykj/study/ui/home/my/EditCourseFragment;Landroid/content/DialogInterface;)V
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
    new-instance v0, Lcom/zykj/study/ui/home/my/f;

    .line 14
    .line 15
    invoke-direct {v0, p3, p2}, Lcom/zykj/study/ui/home/my/f;-><init>(Landroid/content/DialogInterface;Lcom/zykj/study/ui/home/my/EditCourseFragment;)V

    .line 16
    .line 17
    .line 18
    new-instance p2, Lcom/zykj/study/ui/home/my/EditCourseFragment$a;

    .line 19
    .line 20
    invoke-direct {p2, v0}, Lcom/zykj/study/ui/home/my/EditCourseFragment$a;-><init>(Lx7/l;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1, p2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public static final n(Landroid/content/DialogInterface;Lcom/zykj/study/ui/home/my/EditCourseFragment;Landroidx/work/WorkInfo;)Lh7/p;
    .locals 2

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p2}, Landroidx/work/WorkInfo;->getState()Landroidx/work/WorkInfo$State;

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
    sget-object v1, Lcom/zykj/study/ui/home/my/EditCourseFragment$uploadImage$1$a;->a:[I

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
    const/4 p1, 0x2

    .line 25
    const/4 v1, 0x0

    .line 26
    if-eq v0, p1, :cond_3

    .line 27
    .line 28
    if-nez p2, :cond_2

    .line 29
    .line 30
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_2
    const-string p1, "null cannot be cast to non-null type com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog"

    .line 34
    .line 35
    invoke-static {p0, p1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    check-cast p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 39
    .line 40
    invoke-virtual {p2}, Landroidx/work/WorkInfo;->getProgress()Landroidx/work/Data;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    const-string p2, "progress"

    .line 45
    .line 46
    invoke-virtual {p1, p2, v1}, Landroidx/work/Data;->getInt(Ljava/lang/String;I)I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->t(I)V

    .line 51
    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_3
    invoke-virtual {p2}, Landroidx/work/WorkInfo;->getOutputData()Landroidx/work/Data;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    const-string p1, "error_key"

    .line 59
    .line 60
    invoke-virtual {p0, p1, v1}, Landroidx/work/Data;->getInt(Ljava/lang/String;I)I

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
    invoke-interface {p0}, Landroid/content/DialogInterface;->dismiss()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p2}, Landroidx/work/WorkInfo;->getOutputData()Landroidx/work/Data;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    const-string p2, "success_key"

    .line 98
    .line 99
    invoke-virtual {p0, p2}, Landroidx/work/Data;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-static {p1}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->q(Lcom/zykj/study/ui/home/my/EditCourseFragment;)Lcom/zykj/study/viewmodels/EditCourseViewModel;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/EditCourseViewModel;->f()Landroidx/lifecycle/MutableLiveData;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-virtual {p1, p0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    :cond_5
    :goto_2
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 115
    .line 116
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 3

    .line 1
    new-instance v0, Lcom/zykj/study/ui/home/my/EditCourseFragment$uploadImage$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/study/ui/home/my/EditCourseFragment$uploadImage$1;->d:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/study/ui/home/my/EditCourseFragment$uploadImage$1;->e:Lcom/zykj/study/ui/home/my/EditCourseFragment;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lcom/zykj/study/ui/home/my/EditCourseFragment$uploadImage$1;-><init>(Ljava/lang/String;Lcom/zykj/study/ui/home/my/EditCourseFragment;Lm7/c;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lcom/zykj/study/ui/home/my/EditCourseFragment$uploadImage$1;->c:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/my/EditCourseFragment$uploadImage$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/ui/home/my/EditCourseFragment$uploadImage$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/ui/home/my/EditCourseFragment$uploadImage$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/my/EditCourseFragment$uploadImage$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/EditCourseFragment$uploadImage$1;->c:Ljava/lang/Object;

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
    iget v1, p0, Lcom/zykj/study/ui/home/my/EditCourseFragment$uploadImage$1;->b:I

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
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/EditCourseFragment$uploadImage$1;->a:Ljava/lang/Object;

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
    iget-object v1, p0, Lcom/zykj/study/ui/home/my/EditCourseFragment$uploadImage$1;->d:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v1}, Lcom/blankj/utilcode/util/k;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iget-object v2, p0, Lcom/zykj/study/ui/home/my/EditCourseFragment$uploadImage$1;->e:Lcom/zykj/study/ui/home/my/EditCourseFragment;

    .line 43
    .line 44
    invoke-static {v2}, Lcom/zykj/study/ui/home/my/EditCourseFragment;->r(Lcom/zykj/study/ui/home/my/EditCourseFragment;)Lcom/zykj/study/viewmodels/OssTokenViewModel;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    sget-object v3, Lcom/zykj/study/bean/OssFileType$File;->INSTANCE:Lcom/zykj/study/bean/OssFileType$File;

    .line 49
    .line 50
    new-instance v4, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 53
    .line 54
    .line 55
    const-string v5, "."

    .line 56
    .line 57
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    move-object v5, v1

    .line 68
    move-object v1, v3

    .line 69
    sget-object v3, Lcom/zykj/study/bean/OssFileResource$Resource;->INSTANCE:Lcom/zykj/study/bean/OssFileResource$Resource;

    .line 70
    .line 71
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/EditCourseFragment$uploadImage$1;->c:Ljava/lang/Object;

    .line 72
    .line 73
    invoke-static {v5}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/EditCourseFragment$uploadImage$1;->a:Ljava/lang/Object;

    .line 78
    .line 79
    iput v12, p0, Lcom/zykj/study/ui/home/my/EditCourseFragment$uploadImage$1;->b:I

    .line 80
    .line 81
    move-object v0, v2

    .line 82
    move-object v2, v4

    .line 83
    const/4 v4, 0x0

    .line 84
    const/4 v5, 0x0

    .line 85
    const-wide/16 v6, 0x0

    .line 86
    .line 87
    const/16 v9, 0x38

    .line 88
    .line 89
    const/4 v10, 0x0

    .line 90
    move-object v8, p0

    .line 91
    invoke-static/range {v0 .. v10}, Lcom/zykj/study/viewmodels/OssTokenViewModel;->b(Lcom/zykj/study/viewmodels/OssTokenViewModel;Lcom/zykj/study/bean/OssFileType;Ljava/lang/String;Lcom/zykj/study/bean/OssFileResource;Ljava/lang/String;Ljava/lang/String;JLm7/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    if-ne v0, v11, :cond_2

    .line 96
    .line 97
    return-object v11

    .line 98
    :cond_2
    :goto_0
    check-cast v0, Lcom/zykj/study/bean/OssData;

    .line 99
    .line 100
    if-nez v0, :cond_3

    .line 101
    .line 102
    sget-object v0, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 103
    .line 104
    sget v1, Lcom/zykj/study/R$string;->lost_oss_token_please_wait:I

    .line 105
    .line 106
    invoke-static {v0, v1}, Le5/o;->c(Lcom/zykj/base/utils/XToastUtils;I)V

    .line 107
    .line 108
    .line 109
    sget-object v0, Lh7/p;->a:Lh7/p;

    .line 110
    .line 111
    return-object v0

    .line 112
    :cond_3
    new-instance v1, Landroidx/work/OneTimeWorkRequest$Builder;

    .line 113
    .line 114
    const-class v2, Lcom/zykj/download/work/UploadFileOssWork;

    .line 115
    .line 116
    invoke-direct {v1, v2}, Landroidx/work/OneTimeWorkRequest$Builder;-><init>(Ljava/lang/Class;)V

    .line 117
    .line 118
    .line 119
    sget-object v2, Lcom/zykj/download/work/UploadFileOssWork;->Companion:Lcom/zykj/download/work/UploadFileOssWork$a;

    .line 120
    .line 121
    iget-object v3, p0, Lcom/zykj/study/ui/home/my/EditCourseFragment$uploadImage$1;->d:Ljava/lang/String;

    .line 122
    .line 123
    invoke-virtual {v0}, Lcom/zykj/study/bean/OssData;->getObjectKey()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    invoke-virtual {v0}, Lcom/zykj/study/bean/OssData;->getOssToken()Lcom/zykj/download/OssToken;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {v2, v3, v4, v0}, Lcom/zykj/download/work/UploadFileOssWork$a;->a(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/download/OssToken;)Landroidx/work/Data;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-virtual {v1, v0}, Landroidx/work/WorkRequest$Builder;->setInputData(Landroidx/work/Data;)Landroidx/work/WorkRequest$Builder;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    check-cast v0, Landroidx/work/OneTimeWorkRequest$Builder;

    .line 140
    .line 141
    invoke-virtual {v0}, Landroidx/work/WorkRequest$Builder;->build()Landroidx/work/WorkRequest;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    check-cast v0, Landroidx/work/OneTimeWorkRequest;

    .line 146
    .line 147
    sget-object v1, Landroidx/work/WorkManager;->Companion:Landroidx/work/WorkManager$Companion;

    .line 148
    .line 149
    iget-object v2, p0, Lcom/zykj/study/ui/home/my/EditCourseFragment$uploadImage$1;->e:Lcom/zykj/study/ui/home/my/EditCourseFragment;

    .line 150
    .line 151
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    const-string v3, "requireContext(...)"

    .line 156
    .line 157
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1, v2}, Landroidx/work/WorkManager$Companion;->getInstance(Landroid/content/Context;)Landroidx/work/WorkManager;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    invoke-virtual {v1, v0}, Landroidx/work/WorkManager;->enqueue(Landroidx/work/WorkRequest;)Landroidx/work/Operation;

    .line 165
    .line 166
    .line 167
    new-instance v2, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 168
    .line 169
    iget-object v3, p0, Lcom/zykj/study/ui/home/my/EditCourseFragment$uploadImage$1;->e:Lcom/zykj/study/ui/home/my/EditCourseFragment;

    .line 170
    .line 171
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    invoke-direct {v2, v3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;-><init>(Landroid/content/Context;)V

    .line 176
    .line 177
    .line 178
    iget-object v3, p0, Lcom/zykj/study/ui/home/my/EditCourseFragment$uploadImage$1;->e:Lcom/zykj/study/ui/home/my/EditCourseFragment;

    .line 179
    .line 180
    sget v4, Lcom/zykj/study/R$string;->uploading:I

    .line 181
    .line 182
    invoke-virtual {v3, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    invoke-virtual {v2, v3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->j(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    sget-object v3, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->b:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 191
    .line 192
    invoke-virtual {v2, v3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->k(Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    const/4 v3, 0x0

    .line 197
    const/16 v4, 0x64

    .line 198
    .line 199
    invoke-virtual {v2, v3, v4, v12}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->C(ZIZ)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    new-instance v3, Lcom/zykj/study/ui/home/my/d;

    .line 204
    .line 205
    invoke-direct {v3, v1, v0}, Lcom/zykj/study/ui/home/my/d;-><init>(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v2, v3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->d(Landroid/content/DialogInterface$OnCancelListener;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    iget-object v3, p0, Lcom/zykj/study/ui/home/my/EditCourseFragment$uploadImage$1;->e:Lcom/zykj/study/ui/home/my/EditCourseFragment;

    .line 213
    .line 214
    new-instance v4, Lcom/zykj/study/ui/home/my/e;

    .line 215
    .line 216
    invoke-direct {v4, v1, v0, v3}, Lcom/zykj/study/ui/home/my/e;-><init>(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Lcom/zykj/study/ui/home/my/EditCourseFragment;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v2, v4}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->F(Landroid/content/DialogInterface$OnShowListener;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    sget v1, Lcom/zykj/study/R$string;->cancel:I

    .line 224
    .line 225
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->t(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->E()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 230
    .line 231
    .line 232
    sget-object v0, Lh7/p;->a:Lh7/p;

    .line 233
    .line 234
    return-object v0
.end method
