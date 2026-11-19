.class final Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment;->x(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.huiwei.launcher.ui.fragment.NotificationDetailFragment$downloadAndOpen$1"
    f = "NotificationDetailFragment.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0xb9
    }
    m = "invokeSuspend"
    n = {
        "$this$launch",
        "file"
    }
    s = {
        "L$0",
        "L$1"
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nNotificationDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationDetailFragment.kt\ncom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1\n+ 2 OneTimeWorkRequest.kt\nandroidx/work/OneTimeWorkRequestKt\n*L\n1#1,254:1\n105#2:255\n*S KotlinDebug\n*F\n+ 1 NotificationDetailFragment.kt\ncom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1\n*L\n190#1:255\n*E\n"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Lcom/zykj/download/work/DownloadFileWorkProxy;


# direct methods
.method public constructor <init>(Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment;Ljava/lang/String;Lcom/zykj/download/work/DownloadFileWorkProxy;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1;->d:Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment;

    iput-object p2, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1;->e:Ljava/lang/String;

    iput-object p3, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1;->f:Lcom/zykj/download/work/DownloadFileWorkProxy;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method public static synthetic a(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment;Ljava/lang/String;Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1;->e(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment;Ljava/lang/String;Landroid/content/DialogInterface;)V

    return-void
.end method

.method public static synthetic b(Landroid/content/DialogInterface;Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment;Ljava/lang/String;Landroidx/work/WorkInfo;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1;->f(Landroid/content/DialogInterface;Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment;Ljava/lang/String;Landroidx/work/WorkInfo;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1;->d(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Landroid/content/DialogInterface;)V

    return-void
.end method

.method public static final d(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Landroid/content/DialogInterface;)V
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

.method public static final e(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment;Ljava/lang/String;Landroid/content/DialogInterface;)V
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
    new-instance v0, Lcom/zykj/huiwei/launcher/ui/fragment/d;

    .line 14
    .line 15
    invoke-direct {v0, p4, p2, p3}, Lcom/zykj/huiwei/launcher/ui/fragment/d;-><init>(Landroid/content/DialogInterface;Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    new-instance p2, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$b;

    .line 19
    .line 20
    invoke-direct {p2, v0}, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1, p2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public static final f(Landroid/content/DialogInterface;Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment;Ljava/lang/String;Landroidx/work/WorkInfo;)Lkotlin/Unit;
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
    sget-object v1, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1$a;->a:[I

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
    if-eq v0, v1, :cond_5

    .line 23
    .line 24
    const/4 p1, 0x2

    .line 25
    const/4 p2, 0x0

    .line 26
    if-eq v0, p1, :cond_3

    .line 27
    .line 28
    if-nez p3, :cond_2

    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_2
    const-string p1, "null cannot be cast to non-null type com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog"

    .line 34
    .line 35
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    check-cast p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 39
    .line 40
    invoke-virtual {p3}, Landroidx/work/WorkInfo;->getProgress()Landroidx/work/Data;

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
    invoke-interface {p0}, Landroid/content/DialogInterface;->dismiss()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p3}, Landroidx/work/WorkInfo;->getOutputData()Landroidx/work/Data;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    const-string p1, "error_key"

    .line 62
    .line 63
    invoke-virtual {p0, p1, p2}, Landroidx/work/Data;->getInt(Ljava/lang/String;I)I

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    sget-object p1, Lcom/zykj/lib/error/code/ErrorCodeHandler;->INSTANCE:Lcom/zykj/lib/error/code/ErrorCodeHandler;

    .line 68
    .line 69
    invoke-virtual {p1, p0}, Lcom/zykj/lib/error/code/ErrorCodeHandler;->getErrorCode(I)Lcom/zykj/lib/error/code/ErrorCode;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-virtual {p0}, Lcom/zykj/lib/error/code/ErrorCode;->getErrorCodeInfo()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-virtual {p0}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getMessage()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    if-eqz p0, :cond_4

    .line 82
    .line 83
    const-string p1, "DownLoad"

    .line 84
    .line 85
    invoke-static {p1, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 86
    .line 87
    .line 88
    :cond_4
    const-string p0, "\u6587\u4ef6\u4e0b\u8f7d\u5931\u8d25\uff0c\u8bf7\u91cd\u65b0\u5c1d\u8bd5"

    .line 89
    .line 90
    new-array p1, p2, [Ljava/lang/Object;

    .line 91
    .line 92
    invoke-static {p0, p1}, Lcom/blankj/utilcode/util/ToastUtils;->r(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_5
    invoke-interface {p0}, Landroid/content/DialogInterface;->dismiss()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p3}, Landroidx/work/WorkInfo;->getOutputData()Landroidx/work/Data;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    const-string p3, "success_key"

    .line 104
    .line 105
    invoke-virtual {p0, p3}, Landroidx/work/Data;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    if-eqz p0, :cond_6

    .line 110
    .line 111
    sget-object p3, Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;->d:Lcom/zykj/huiwei/launcher/ui/activity/FileActivity$a;

    .line 112
    .line 113
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    const-string v0, "requireContext(...)"

    .line 118
    .line 119
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p3, p1, p0, p2}, Lcom/zykj/huiwei/launcher/ui/activity/FileActivity$a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    :cond_6
    :goto_2
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 126
    .line 127
    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 4

    new-instance v0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1;

    iget-object v1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1;->d:Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment;

    iget-object v2, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1;->e:Ljava/lang/String;

    iget-object v3, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1;->f:Lcom/zykj/download/work/DownloadFileWorkProxy;

    invoke-direct {v0, v1, v2, v3, p2}, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1;-><init>(Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment;Ljava/lang/String;Lcom/zykj/download/work/DownloadFileWorkProxy;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkotlinx/coroutines/CoroutineScope;

    .line 4
    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v2, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1;->b:I

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    if-ne v2, v3, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Ljava/io/File;

    .line 19
    .line 20
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    new-instance p1, Ljava/io/File;

    .line 36
    .line 37
    iget-object v2, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1;->d:Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment;

    .line 38
    .line 39
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v2}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    sget-object v4, Ljava/io/File;->separator:Ljava/lang/String;

    .line 52
    .line 53
    new-instance v5, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v2, "notification"

    .line 65
    .line 66
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    iget-object v4, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1;->e:Ljava/lang/String;

    .line 74
    .line 75
    const-string v5, "/"

    .line 76
    .line 77
    const/4 v6, 0x2

    .line 78
    const/4 v7, 0x0

    .line 79
    invoke-static {v4, v5, v7, v6, v7}, Lkotlin/text/StringsKt;->substringAfterLast$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    invoke-direct {p1, v2, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    new-instance v4, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1$1;

    .line 91
    .line 92
    iget-object v5, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1;->f:Lcom/zykj/download/work/DownloadFileWorkProxy;

    .line 93
    .line 94
    iget-object v6, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1;->e:Ljava/lang/String;

    .line 95
    .line 96
    invoke-direct {v4, v5, v6, p1, v7}, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1$1;-><init>(Lcom/zykj/download/work/DownloadFileWorkProxy;Ljava/lang/String;Ljava/io/File;Lkotlin/coroutines/Continuation;)V

    .line 97
    .line 98
    .line 99
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1;->c:Ljava/lang/Object;

    .line 100
    .line 101
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1;->a:Ljava/lang/Object;

    .line 102
    .line 103
    iput v3, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1;->b:I

    .line 104
    .line 105
    invoke-static {v2, v4, p0}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    if-ne v0, v1, :cond_2

    .line 110
    .line 111
    return-object v1

    .line 112
    :cond_2
    move-object v8, v0

    .line 113
    move-object v0, p1

    .line 114
    move-object p1, v8

    .line 115
    :goto_0
    check-cast p1, Ljava/lang/String;

    .line 116
    .line 117
    const-string v1, "requireContext(...)"

    .line 118
    .line 119
    if-eqz p1, :cond_3

    .line 120
    .line 121
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1;->d:Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment;

    .line 122
    .line 123
    iget-object v2, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1;->e:Ljava/lang/String;

    .line 124
    .line 125
    sget-object v3, Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;->d:Lcom/zykj/huiwei/launcher/ui/activity/FileActivity$a;

    .line 126
    .line 127
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v3, v0, p1, v2}, Lcom/zykj/huiwei/launcher/ui/activity/FileActivity$a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_3
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1;->e:Ljava/lang/String;

    .line 139
    .line 140
    iget-object v2, p0, Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment$downloadAndOpen$1;->d:Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment;

    .line 141
    .line 142
    new-instance v4, Landroidx/work/OneTimeWorkRequest$Builder;

    .line 143
    .line 144
    const-class v5, Lcom/zykj/download/work/DownloadFileCommonWork;

    .line 145
    .line 146
    invoke-direct {v4, v5}, Landroidx/work/OneTimeWorkRequest$Builder;-><init>(Ljava/lang/Class;)V

    .line 147
    .line 148
    .line 149
    sget-object v5, Lcom/zykj/download/work/DownloadFileCommonWork;->Companion:Lcom/zykj/download/work/DownloadFileCommonWork$a;

    .line 150
    .line 151
    invoke-virtual {v0}, Ljava/io/File;->getParent()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v6

    .line 155
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    const-string v7, "getName(...)"

    .line 163
    .line 164
    invoke-static {v0, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v5, p1, v6, v0}, Lcom/zykj/download/work/DownloadFileCommonWork$a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroidx/work/Data;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-virtual {v4, v0}, Landroidx/work/WorkRequest$Builder;->setInputData(Landroidx/work/Data;)Landroidx/work/WorkRequest$Builder;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    check-cast v0, Landroidx/work/OneTimeWorkRequest$Builder;

    .line 176
    .line 177
    invoke-virtual {v0}, Landroidx/work/WorkRequest$Builder;->build()Landroidx/work/WorkRequest;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    check-cast v0, Landroidx/work/OneTimeWorkRequest;

    .line 182
    .line 183
    sget-object v4, Landroidx/work/WorkManager;->Companion:Landroidx/work/WorkManager$Companion;

    .line 184
    .line 185
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v4, v5}, Landroidx/work/WorkManager$Companion;->getInstance(Landroid/content/Context;)Landroidx/work/WorkManager;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    invoke-virtual {v1, v0}, Landroidx/work/WorkManager;->enqueue(Landroidx/work/WorkRequest;)Landroidx/work/Operation;

    .line 197
    .line 198
    .line 199
    new-instance v4, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 200
    .line 201
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    invoke-direct {v4, v5}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;-><init>(Landroid/content/Context;)V

    .line 206
    .line 207
    .line 208
    const-string v5, "\u4e0b\u8f7d\u4e2d"

    .line 209
    .line 210
    invoke-virtual {v4, v5}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->d(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 211
    .line 212
    .line 213
    move-result-object v4

    .line 214
    sget-object v5, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->b:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 215
    .line 216
    invoke-virtual {v4, v5}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->e(Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 217
    .line 218
    .line 219
    move-result-object v4

    .line 220
    const/4 v5, 0x0

    .line 221
    const/16 v6, 0x64

    .line 222
    .line 223
    invoke-virtual {v4, v5, v6, v3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->j(ZIZ)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 224
    .line 225
    .line 226
    move-result-object v3

    .line 227
    new-instance v4, Lcom/zykj/huiwei/launcher/ui/fragment/b;

    .line 228
    .line 229
    invoke-direct {v4, v1, v0}, Lcom/zykj/huiwei/launcher/ui/fragment/b;-><init>(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v3, v4}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->b(Landroid/content/DialogInterface$OnCancelListener;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 233
    .line 234
    .line 235
    move-result-object v3

    .line 236
    const-string v4, "\u53d6\u6d88"

    .line 237
    .line 238
    invoke-virtual {v3, v4}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->h(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 239
    .line 240
    .line 241
    move-result-object v3

    .line 242
    new-instance v4, Lcom/zykj/huiwei/launcher/ui/fragment/c;

    .line 243
    .line 244
    invoke-direct {v4, v1, v0, v2, p1}, Lcom/zykj/huiwei/launcher/ui/fragment/c;-><init>(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Lcom/zykj/huiwei/launcher/ui/fragment/NotificationDetailFragment;Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v3, v4}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->m(Landroid/content/DialogInterface$OnShowListener;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->l()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 252
    .line 253
    .line 254
    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 255
    .line 256
    return-object p1
.end method
