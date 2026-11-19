.class final Lcom/zykj/study/ui/home/find/MicroCodeFragment$uploadMicro$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/find/MicroCodeFragment;->C(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/ui/home/find/MicroCodeFragment$uploadMicro$1$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lx7/p;"
    }
.end annotation

.annotation runtime Lo7/d;
    c = "com.zykj.study.ui.home.find.MicroCodeFragment$uploadMicro$1"
    f = "MicroCodeFragment.kt"
    l = {
        0x98
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/zykj/study/ui/home/find/MicroCodeFragment;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/home/find/MicroCodeFragment;Ljava/lang/String;Ljava/lang/String;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$uploadMicro$1;->c:Lcom/zykj/study/ui/home/find/MicroCodeFragment;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$uploadMicro$1;->d:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$uploadMicro$1;->e:Ljava/lang/String;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static synthetic c(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Lcom/zykj/study/ui/home/find/MicroCodeFragment;Ljava/lang/String;Lcom/zykj/study/bean/OssData;Ljava/lang/String;Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p6}, Lcom/zykj/study/ui/home/find/MicroCodeFragment$uploadMicro$1;->m(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Lcom/zykj/study/ui/home/find/MicroCodeFragment;Ljava/lang/String;Lcom/zykj/study/bean/OssData;Ljava/lang/String;Landroid/content/DialogInterface;)V

    return-void
.end method

.method public static synthetic d(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/ui/home/find/MicroCodeFragment$uploadMicro$1;->l(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Landroid/content/DialogInterface;)V

    return-void
.end method

.method public static synthetic k(Landroid/content/DialogInterface;Lcom/zykj/study/ui/home/find/MicroCodeFragment;Ljava/lang/String;Lcom/zykj/study/bean/OssData;Ljava/lang/String;Landroidx/work/WorkInfo;)Lh7/p;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p5}, Lcom/zykj/study/ui/home/find/MicroCodeFragment$uploadMicro$1;->n(Landroid/content/DialogInterface;Lcom/zykj/study/ui/home/find/MicroCodeFragment;Ljava/lang/String;Lcom/zykj/study/bean/OssData;Ljava/lang/String;Landroidx/work/WorkInfo;)Lh7/p;

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

.method public static final m(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Lcom/zykj/study/ui/home/find/MicroCodeFragment;Ljava/lang/String;Lcom/zykj/study/bean/OssData;Ljava/lang/String;Landroid/content/DialogInterface;)V
    .locals 6

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
    new-instance v0, Lcom/zykj/study/ui/home/find/g;

    .line 14
    .line 15
    move-object v2, p2

    .line 16
    move-object v3, p3

    .line 17
    move-object v4, p4

    .line 18
    move-object v5, p5

    .line 19
    move-object v1, p6

    .line 20
    invoke-direct/range {v0 .. v5}, Lcom/zykj/study/ui/home/find/g;-><init>(Landroid/content/DialogInterface;Lcom/zykj/study/ui/home/find/MicroCodeFragment;Ljava/lang/String;Lcom/zykj/study/bean/OssData;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    new-instance p2, Lcom/zykj/study/ui/home/find/MicroCodeFragment$a;

    .line 24
    .line 25
    invoke-direct {p2, v0}, Lcom/zykj/study/ui/home/find/MicroCodeFragment$a;-><init>(Lx7/l;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p1, p2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public static final n(Landroid/content/DialogInterface;Lcom/zykj/study/ui/home/find/MicroCodeFragment;Ljava/lang/String;Lcom/zykj/study/bean/OssData;Ljava/lang/String;Landroidx/work/WorkInfo;)Lh7/p;
    .locals 2

    .line 1
    if-eqz p5, :cond_0

    .line 2
    .line 3
    invoke-virtual {p5}, Landroidx/work/WorkInfo;->getState()Landroidx/work/WorkInfo$State;

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
    sget-object v1, Lcom/zykj/study/ui/home/find/MicroCodeFragment$uploadMicro$1$a;->a:[I

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
    const/4 p2, 0x0

    .line 26
    if-eq v0, p1, :cond_3

    .line 27
    .line 28
    if-nez p5, :cond_2

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
    invoke-virtual {p5}, Landroidx/work/WorkInfo;->getProgress()Landroidx/work/Data;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    const-string p3, "progress"

    .line 45
    .line 46
    invoke-virtual {p1, p3, p2}, Landroidx/work/Data;->getInt(Ljava/lang/String;I)I

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
    invoke-virtual {p5}, Landroidx/work/WorkInfo;->getOutputData()Landroidx/work/Data;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    const-string p1, "error_key"

    .line 59
    .line 60
    invoke-virtual {p0, p1, p2}, Landroidx/work/Data;->getInt(Ljava/lang/String;I)I

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
    invoke-virtual {p5}, Landroidx/work/WorkInfo;->getOutputData()Landroidx/work/Data;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    const-string p5, "success_key"

    .line 98
    .line 99
    invoke-virtual {p0, p5}, Landroidx/work/Data;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    if-eqz p0, :cond_5

    .line 104
    .line 105
    invoke-static {p1, p2, p0, p3, p4}, Lcom/zykj/study/ui/home/find/MicroCodeFragment;->r(Lcom/zykj/study/ui/home/find/MicroCodeFragment;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/study/bean/OssData;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    :cond_5
    :goto_2
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 109
    .line 110
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 4

    .line 1
    new-instance v0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$uploadMicro$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$uploadMicro$1;->c:Lcom/zykj/study/ui/home/find/MicroCodeFragment;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$uploadMicro$1;->d:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$uploadMicro$1;->e:Ljava/lang/String;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3, p2}, Lcom/zykj/study/ui/home/find/MicroCodeFragment$uploadMicro$1;-><init>(Lcom/zykj/study/ui/home/find/MicroCodeFragment;Ljava/lang/String;Ljava/lang/String;Lm7/c;)V

    .line 10
    .line 11
    .line 12
    iput-object p1, v0, Lcom/zykj/study/ui/home/find/MicroCodeFragment$uploadMicro$1;->b:Ljava/lang/Object;

    .line 13
    .line 14
    return-object v0
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/find/MicroCodeFragment$uploadMicro$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/ui/home/find/MicroCodeFragment$uploadMicro$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/ui/home/find/MicroCodeFragment$uploadMicro$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/home/find/MicroCodeFragment$uploadMicro$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v8, p0

    .line 2
    .line 3
    iget-object v0, v8, Lcom/zykj/study/ui/home/find/MicroCodeFragment$uploadMicro$1;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Li8/b0;

    .line 6
    .line 7
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v11

    .line 11
    iget v1, v8, Lcom/zykj/study/ui/home/find/MicroCodeFragment$uploadMicro$1;->a:I

    .line 12
    .line 13
    const/4 v12, 0x1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    if-ne v1, v12, :cond_0

    .line 17
    .line 18
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    move-object/from16 v0, p1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v0

    .line 32
    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object v1, v8, Lcom/zykj/study/ui/home/find/MicroCodeFragment$uploadMicro$1;->c:Lcom/zykj/study/ui/home/find/MicroCodeFragment;

    .line 36
    .line 37
    invoke-static {v1}, Lcom/zykj/study/ui/home/find/MicroCodeFragment;->o(Lcom/zykj/study/ui/home/find/MicroCodeFragment;)Lcom/zykj/study/viewmodels/OssTokenViewModel;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    move-object v2, v1

    .line 42
    sget-object v1, Lcom/zykj/study/bean/OssFileType$Folder;->INSTANCE:Lcom/zykj/study/bean/OssFileType$Folder;

    .line 43
    .line 44
    sget-object v3, Lcom/zykj/study/bean/OssFileResource$Resource;->INSTANCE:Lcom/zykj/study/bean/OssFileResource$Resource;

    .line 45
    .line 46
    iput-object v0, v8, Lcom/zykj/study/ui/home/find/MicroCodeFragment$uploadMicro$1;->b:Ljava/lang/Object;

    .line 47
    .line 48
    iput v12, v8, Lcom/zykj/study/ui/home/find/MicroCodeFragment$uploadMicro$1;->a:I

    .line 49
    .line 50
    move-object v0, v2

    .line 51
    const/4 v2, 0x0

    .line 52
    const/4 v4, 0x0

    .line 53
    const/4 v5, 0x0

    .line 54
    const-wide/16 v6, 0x0

    .line 55
    .line 56
    const/16 v9, 0x3a

    .line 57
    .line 58
    const/4 v10, 0x0

    .line 59
    invoke-static/range {v0 .. v10}, Lcom/zykj/study/viewmodels/OssTokenViewModel;->b(Lcom/zykj/study/viewmodels/OssTokenViewModel;Lcom/zykj/study/bean/OssFileType;Ljava/lang/String;Lcom/zykj/study/bean/OssFileResource;Ljava/lang/String;Ljava/lang/String;JLm7/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    if-ne v0, v11, :cond_2

    .line 64
    .line 65
    return-object v11

    .line 66
    :cond_2
    :goto_0
    move-object v6, v0

    .line 67
    check-cast v6, Lcom/zykj/study/bean/OssData;

    .line 68
    .line 69
    if-nez v6, :cond_3

    .line 70
    .line 71
    sget-object v0, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 72
    .line 73
    sget v1, Lcom/zykj/study/R$string;->lost_oss_token_please_wait:I

    .line 74
    .line 75
    invoke-static {v0, v1}, Le5/o;->c(Lcom/zykj/base/utils/XToastUtils;I)V

    .line 76
    .line 77
    .line 78
    sget-object v0, Lh7/p;->a:Lh7/p;

    .line 79
    .line 80
    return-object v0

    .line 81
    :cond_3
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v13

    .line 89
    const-string v0, "toString(...)"

    .line 90
    .line 91
    invoke-static {v13, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    const/16 v17, 0x4

    .line 95
    .line 96
    const/16 v18, 0x0

    .line 97
    .line 98
    const-string v14, "-"

    .line 99
    .line 100
    const-string v15, ""

    .line 101
    .line 102
    const/16 v16, 0x0

    .line 103
    .line 104
    invoke-static/range {v13 .. v18}, Lg8/z;->I(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    new-instance v1, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const-string v0, "_6"

    .line 117
    .line 118
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v7

    .line 125
    new-instance v0, Landroidx/work/OneTimeWorkRequest$Builder;

    .line 126
    .line 127
    const-class v1, Lcom/zykj/download/work/UploadFileOssWork;

    .line 128
    .line 129
    invoke-direct {v0, v1}, Landroidx/work/OneTimeWorkRequest$Builder;-><init>(Ljava/lang/Class;)V

    .line 130
    .line 131
    .line 132
    sget-object v1, Lcom/zykj/download/work/UploadFileOssWork;->Companion:Lcom/zykj/download/work/UploadFileOssWork$a;

    .line 133
    .line 134
    iget-object v2, v8, Lcom/zykj/study/ui/home/find/MicroCodeFragment$uploadMicro$1;->d:Ljava/lang/String;

    .line 135
    .line 136
    invoke-virtual {v6}, Lcom/zykj/study/bean/OssData;->getObjectKey()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    new-instance v4, Ljava/lang/StringBuilder;

    .line 141
    .line 142
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    const-string v3, "/"

    .line 149
    .line 150
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    const-string v3, ".zip"

    .line 157
    .line 158
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    invoke-virtual {v6}, Lcom/zykj/study/bean/OssData;->getOssToken()Lcom/zykj/download/OssToken;

    .line 166
    .line 167
    .line 168
    move-result-object v4

    .line 169
    invoke-virtual {v1, v2, v3, v4}, Lcom/zykj/download/work/UploadFileOssWork$a;->a(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/download/OssToken;)Landroidx/work/Data;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    invoke-virtual {v0, v1}, Landroidx/work/WorkRequest$Builder;->setInputData(Landroidx/work/Data;)Landroidx/work/WorkRequest$Builder;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    check-cast v0, Landroidx/work/OneTimeWorkRequest$Builder;

    .line 178
    .line 179
    invoke-virtual {v0}, Landroidx/work/WorkRequest$Builder;->build()Landroidx/work/WorkRequest;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    move-object v3, v0

    .line 184
    check-cast v3, Landroidx/work/OneTimeWorkRequest;

    .line 185
    .line 186
    sget-object v0, Landroidx/work/WorkManager;->Companion:Landroidx/work/WorkManager$Companion;

    .line 187
    .line 188
    iget-object v1, v8, Lcom/zykj/study/ui/home/find/MicroCodeFragment$uploadMicro$1;->c:Lcom/zykj/study/ui/home/find/MicroCodeFragment;

    .line 189
    .line 190
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    const-string v2, "requireContext(...)"

    .line 195
    .line 196
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0, v1}, Landroidx/work/WorkManager$Companion;->getInstance(Landroid/content/Context;)Landroidx/work/WorkManager;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    invoke-virtual {v2, v3}, Landroidx/work/WorkManager;->enqueue(Landroidx/work/WorkRequest;)Landroidx/work/Operation;

    .line 204
    .line 205
    .line 206
    new-instance v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 207
    .line 208
    iget-object v1, v8, Lcom/zykj/study/ui/home/find/MicroCodeFragment$uploadMicro$1;->c:Lcom/zykj/study/ui/home/find/MicroCodeFragment;

    .line 209
    .line 210
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    invoke-direct {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;-><init>(Landroid/content/Context;)V

    .line 215
    .line 216
    .line 217
    iget-object v1, v8, Lcom/zykj/study/ui/home/find/MicroCodeFragment$uploadMicro$1;->c:Lcom/zykj/study/ui/home/find/MicroCodeFragment;

    .line 218
    .line 219
    sget v4, Lcom/zykj/study/R$string;->upload_micro:I

    .line 220
    .line 221
    invoke-virtual {v1, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->j(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    sget-object v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->b:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 230
    .line 231
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->k(Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    const/4 v1, 0x0

    .line 236
    const/16 v4, 0x64

    .line 237
    .line 238
    invoke-virtual {v0, v1, v4, v12}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->C(ZIZ)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    new-instance v1, Lcom/zykj/study/ui/home/find/e;

    .line 243
    .line 244
    invoke-direct {v1, v2, v3}, Lcom/zykj/study/ui/home/find/e;-><init>(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->d(Landroid/content/DialogInterface$OnCancelListener;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    iget-object v4, v8, Lcom/zykj/study/ui/home/find/MicroCodeFragment$uploadMicro$1;->c:Lcom/zykj/study/ui/home/find/MicroCodeFragment;

    .line 252
    .line 253
    iget-object v5, v8, Lcom/zykj/study/ui/home/find/MicroCodeFragment$uploadMicro$1;->e:Ljava/lang/String;

    .line 254
    .line 255
    new-instance v1, Lcom/zykj/study/ui/home/find/f;

    .line 256
    .line 257
    invoke-direct/range {v1 .. v7}, Lcom/zykj/study/ui/home/find/f;-><init>(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Lcom/zykj/study/ui/home/find/MicroCodeFragment;Ljava/lang/String;Lcom/zykj/study/bean/OssData;Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->F(Landroid/content/DialogInterface$OnShowListener;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    sget v1, Lcom/zykj/study/R$string;->cancel:I

    .line 265
    .line 266
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->t(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->E()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 271
    .line 272
    .line 273
    sget-object v0, Lh7/p;->a:Lh7/p;

    .line 274
    .line 275
    return-object v0
.end method
