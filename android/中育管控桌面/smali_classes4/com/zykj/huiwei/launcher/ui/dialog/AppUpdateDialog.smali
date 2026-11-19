.class public final Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;
.super Lcom/zykj/huiwei/launcher/ui/dialog/Hilt_AppUpdateDialog;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/huiwei/launcher/ui/dialog/Hilt_AppUpdateDialog<",
        "Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\t\u0010\u0004J\u0019\u0010\u000c\u001a\u00020\u00082\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u0010R\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;",
        "Lcom/zykj/huiwei/launcher/base/CommonDialogFragment;",
        "Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;",
        "<init>",
        "()V",
        "",
        "layoutId",
        "()I",
        "",
        "g",
        "Landroid/view/View;",
        "v",
        "onClick",
        "(Landroid/view/View;)V",
        "",
        "filePath",
        "(Ljava/lang/String;)V",
        "Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;",
        "Lkotlin/Lazy;",
        "r",
        "()Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;",
        "viewModel",
        "Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialogArgs;",
        "h",
        "Landroidx/navigation/NavArgsLazy;",
        "q",
        "()Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialogArgs;",
        "args",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAppUpdateDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppUpdateDialog.kt\ncom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n*L\n1#1,146:1\n106#2,15:147\n42#3,3:162\n*S KotlinDebug\n*F\n+ 1 AppUpdateDialog.kt\ncom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog\n*L\n28#1:147,15\n29#1:162,3\n*E\n"
    }
.end annotation


# instance fields
.field public final g:Lkotlin/Lazy;

.field public final h:Landroidx/navigation/NavArgsLazy;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/Hilt_AppUpdateDialog;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog$special$$inlined$viewModels$default$1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog$special$$inlined$viewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 7
    .line 8
    .line 9
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    .line 10
    .line 11
    new-instance v2, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog$special$$inlined$viewModels$default$2;

    .line 12
    .line 13
    invoke-direct {v2, v0}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog$special$$inlined$viewModels$default$2;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v2}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-class v1, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;

    .line 21
    .line 22
    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v2, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog$special$$inlined$viewModels$default$3;

    .line 27
    .line 28
    invoke-direct {v2, v0}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog$special$$inlined$viewModels$default$3;-><init>(Lkotlin/Lazy;)V

    .line 29
    .line 30
    .line 31
    new-instance v3, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog$special$$inlined$viewModels$default$4;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    invoke-direct {v3, v4, v0}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog$special$$inlined$viewModels$default$4;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/Lazy;)V

    .line 35
    .line 36
    .line 37
    new-instance v4, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog$special$$inlined$viewModels$default$5;

    .line 38
    .line 39
    invoke-direct {v4, p0, v0}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog$special$$inlined$viewModels$default$5;-><init>(Landroidx/fragment/app/Fragment;Lkotlin/Lazy;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p0, v1, v2, v3, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;->g:Lkotlin/Lazy;

    .line 47
    .line 48
    new-instance v0, Landroidx/navigation/NavArgsLazy;

    .line 49
    .line 50
    const-class v1, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialogArgs;

    .line 51
    .line 52
    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    new-instance v2, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog$c;

    .line 57
    .line 58
    invoke-direct {v2, p0}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog$c;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 59
    .line 60
    .line 61
    invoke-direct {v0, v1, v2}, Landroidx/navigation/NavArgsLazy;-><init>(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)V

    .line 62
    .line 63
    .line 64
    iput-object v0, p0, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;->h:Landroidx/navigation/NavArgsLazy;

    .line 65
    .line 66
    return-void
.end method

.method public static synthetic n(Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;->s(Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;Ljava/util/UUID;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;->t(Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;Ljava/util/UUID;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;Landroidx/work/WorkInfo;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;->u(Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;Landroidx/work/WorkInfo;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final s(Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;Ljava/lang/String;)Lkotlin/Unit;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;->r()Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->j()Landroidx/lifecycle/MutableLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/high16 v1, 0x3f800000    # 1.0f

    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;->r()Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->u()Landroidx/lifecycle/MutableLiveData;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;

    .line 36
    .line 37
    iget-object v0, v0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;->tvConfirm:Landroidx/appcompat/widget/AppCompatTextView;

    .line 38
    .line 39
    invoke-virtual {v0, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;->r()Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->g()Landroidx/lifecycle/MutableLiveData;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    const v2, 0x7f110075

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v0, v2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;->r()Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->s()Landroidx/lifecycle/MutableLiveData;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;->q()Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialogArgs;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialogArgs;->a()Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;->getForceUpdate()Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_0

    .line 84
    .line 85
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0, p1}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;->v(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 92
    .line 93
    return-object p0
.end method

.method public static final t(Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;Ljava/util/UUID;)Lkotlin/Unit;
    .locals 2

    .line 1
    sget-object v0, Landroidx/work/WorkManager;->Companion:Landroidx/work/WorkManager$Companion;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/huiwei/launcher/app/App;->Companion:Lcom/zykj/huiwei/launcher/app/App$a;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/zykj/huiwei/launcher/app/App$a;->a()Lcom/zykj/huiwei/launcher/app/App;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Landroidx/work/WorkManager$Companion;->getInstance(Landroid/content/Context;)Landroidx/work/WorkManager;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Landroidx/work/WorkManager;->getWorkInfoByIdLiveData(Ljava/util/UUID;)Landroidx/lifecycle/LiveData;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-instance v1, Lb4/c;

    .line 25
    .line 26
    invoke-direct {v1, p0}, Lb4/c;-><init>(Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;)V

    .line 27
    .line 28
    .line 29
    new-instance p0, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog$b;

    .line 30
    .line 31
    invoke-direct {p0, v1}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v0, p0}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 35
    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 38
    .line 39
    return-object p0
.end method

.method public static final u(Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;Landroidx/work/WorkInfo;)Lkotlin/Unit;
    .locals 3

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/work/WorkInfo;->getState()Landroidx/work/WorkInfo$State;

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
    sget-object v1, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog$a;->a:[I

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
    const/4 v1, 0x2

    .line 25
    const/4 v2, 0x0

    .line 26
    if-eq v0, v1, :cond_3

    .line 27
    .line 28
    if-nez p1, :cond_2

    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;->r()Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->j()Landroidx/lifecycle/MutableLiveData;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p1}, Landroidx/work/WorkInfo;->getProgress()Landroidx/work/Data;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    const-string v0, "progress"

    .line 46
    .line 47
    invoke-virtual {p1, v0, v2}, Landroidx/work/Data;->getInt(Ljava/lang/String;I)I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    int-to-float p1, p1

    .line 52
    const/high16 v0, 0x42c80000    # 100.0f

    .line 53
    .line 54
    div-float/2addr p1, v0

    .line 55
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p0, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_3
    invoke-virtual {p1}, Landroidx/work/WorkInfo;->getOutputData()Landroidx/work/Data;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    const-string v0, "error_key"

    .line 68
    .line 69
    invoke-virtual {p1, v0, v2}, Landroidx/work/Data;->getInt(Ljava/lang/String;I)I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    sget-object v0, Lcom/zykj/lib/error/code/ErrorCodeHandler;->INSTANCE:Lcom/zykj/lib/error/code/ErrorCodeHandler;

    .line 74
    .line 75
    invoke-virtual {v0, p1}, Lcom/zykj/lib/error/code/ErrorCodeHandler;->getErrorCode(I)Lcom/zykj/lib/error/code/ErrorCode;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {p1}, Lcom/zykj/lib/error/code/ErrorCode;->getErrorCodeInfo()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {p1}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getMessage()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    if-eqz p1, :cond_4

    .line 88
    .line 89
    const-string v0, "DownLoad"

    .line 90
    .line 91
    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 92
    .line 93
    .line 94
    :cond_4
    const-string p1, "\u6587\u4ef6\u4e0b\u8f7d\u5931\u8d25\uff0c\u8bf7\u91cd\u65b0\u5c1d\u8bd5"

    .line 95
    .line 96
    invoke-virtual {p0, p1}, Lcom/zykj/huiwei/launcher/base/CommonDialogFragment;->i(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-virtual {p0}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 104
    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_5
    invoke-virtual {p1}, Landroidx/work/WorkInfo;->getOutputData()Landroidx/work/Data;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    const-string v0, "success_key"

    .line 112
    .line 113
    invoke-virtual {p1, v0}, Landroidx/work/Data;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    if-eqz p1, :cond_6

    .line 118
    .line 119
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;->r()Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->i()Landroidx/lifecycle/MutableLiveData;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    invoke-virtual {p0, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    :cond_6
    :goto_2
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 131
    .line 132
    return-object p0
.end method


# virtual methods
.method public g()V
    .locals 5

    .line 1
    sget-object v0, Lcom/zykj/download/work/DownloadFileWorkProxy;->Companion:Lcom/zykj/download/work/DownloadFileWorkProxy$a;

    .line 2
    .line 3
    const-wide/16 v1, 0x32

    .line 4
    .line 5
    invoke-virtual {v0, v1, v2}, Lcom/zykj/download/work/DownloadFileWorkProxy$a;->b(J)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-virtual {p0, v0}, Landroidx/fragment/app/DialogFragment;->setCancelable(Z)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v1, v0}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    invoke-virtual {v1, v0}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;

    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;->r()Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v0, v1}, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;->setVm(Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;

    .line 48
    .line 49
    invoke-virtual {v0, p0}, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;->q()Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialogArgs;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialogArgs;->a()Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;->r()Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v1}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->n()Landroidx/lifecycle/MutableLiveData;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;->getVersionName()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    new-instance v3, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 75
    .line 76
    .line 77
    const-string v4, "v"

    .line 78
    .line 79
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-virtual {v1, v2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;->getVersionCode()I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    sget-object v2, Li4/g;->a:Li4/g$a;

    .line 97
    .line 98
    sget-object v3, Lcom/zykj/huiwei/launcher/app/App;->Companion:Lcom/zykj/huiwei/launcher/app/App$a;

    .line 99
    .line 100
    invoke-virtual {v3}, Lcom/zykj/huiwei/launcher/app/App$a;->a()Lcom/zykj/huiwei/launcher/app/App;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    invoke-virtual {v2, v3}, Li4/g$a;->c(Landroid/content/Context;)I

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-le v1, v2, :cond_2

    .line 109
    .line 110
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    check-cast v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;

    .line 115
    .line 116
    iget-object v1, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;->ivIcon:Landroid/widget/ImageView;

    .line 117
    .line 118
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    const v3, 0x7f070632

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 134
    .line 135
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    check-cast v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;

    .line 140
    .line 141
    iget-object v1, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;->ivIcon:Landroid/widget/ImageView;

    .line 142
    .line 143
    const v2, 0x7f0e001c

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;->r()Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-virtual {v1}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->m()Landroidx/lifecycle/MutableLiveData;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    const v2, 0x7f11008a

    .line 158
    .line 159
    .line 160
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    invoke-virtual {v1, v2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;->r()Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    invoke-virtual {v1}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->h()Landroidx/lifecycle/MutableLiveData;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;->getDescription()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    invoke-virtual {v1, v2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;->r()Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    invoke-virtual {v1}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->f()Landroidx/lifecycle/MutableLiveData;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    const v2, 0x7f110063

    .line 191
    .line 192
    .line 193
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    invoke-virtual {v1, v2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;->r()Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    invoke-virtual {v1}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->g()Landroidx/lifecycle/MutableLiveData;

    .line 205
    .line 206
    .line 207
    move-result-object v1

    .line 208
    const v2, 0x7f110099

    .line 209
    .line 210
    .line 211
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    invoke-virtual {v1, v2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;->r()Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    invoke-virtual {v1}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->t()Landroidx/lifecycle/MutableLiveData;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 227
    .line 228
    invoke-virtual {v1, v2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;->r()Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    invoke-virtual {v1}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->q()Landroidx/lifecycle/MutableLiveData;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;->getForceUpdate()Z

    .line 240
    .line 241
    .line 242
    move-result v2

    .line 243
    xor-int/lit8 v2, v2, 0x1

    .line 244
    .line 245
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    invoke-virtual {v1, v2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;->r()Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    invoke-virtual {v1}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->r()Landroidx/lifecycle/MutableLiveData;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;->getForceUpdate()Z

    .line 261
    .line 262
    .line 263
    move-result v2

    .line 264
    xor-int/lit8 v2, v2, 0x1

    .line 265
    .line 266
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    invoke-virtual {v1, v2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;->r()Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    invoke-virtual {v1, v0}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->a(Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;)V

    .line 278
    .line 279
    .line 280
    goto/16 :goto_0

    .line 281
    .line 282
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    check-cast v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;

    .line 287
    .line 288
    iget-object v1, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;->ivIcon:Landroid/widget/ImageView;

    .line 289
    .line 290
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 295
    .line 296
    .line 297
    move-result-object v2

    .line 298
    const v3, 0x7f070455

    .line 299
    .line 300
    .line 301
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 302
    .line 303
    .line 304
    move-result v2

    .line 305
    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 306
    .line 307
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    check-cast v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;

    .line 312
    .line 313
    iget-object v1, v1, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;->ivIcon:Landroid/widget/ImageView;

    .line 314
    .line 315
    const v2, 0x7f0e001d

    .line 316
    .line 317
    .line 318
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;->r()Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    invoke-virtual {v1}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->m()Landroidx/lifecycle/MutableLiveData;

    .line 326
    .line 327
    .line 328
    move-result-object v1

    .line 329
    const v2, 0x7f11008c

    .line 330
    .line 331
    .line 332
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v2

    .line 336
    invoke-virtual {v1, v2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;->r()Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;

    .line 340
    .line 341
    .line 342
    move-result-object v1

    .line 343
    invoke-virtual {v1}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->n()Landroidx/lifecycle/MutableLiveData;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;->getVersionName()Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    invoke-virtual {v1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;->r()Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->g()Landroidx/lifecycle/MutableLiveData;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    const v1, 0x7f110076

    .line 363
    .line 364
    .line 365
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v1

    .line 369
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;->r()Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->t()Landroidx/lifecycle/MutableLiveData;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 381
    .line 382
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;->r()Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->q()Landroidx/lifecycle/MutableLiveData;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;->r()Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->r()Landroidx/lifecycle/MutableLiveData;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 405
    .line 406
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 407
    .line 408
    .line 409
    :goto_0
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;->r()Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->i()Landroidx/lifecycle/MutableLiveData;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 418
    .line 419
    .line 420
    move-result-object v1

    .line 421
    new-instance v2, Lb4/a;

    .line 422
    .line 423
    invoke-direct {v2, p0}, Lb4/a;-><init>(Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;)V

    .line 424
    .line 425
    .line 426
    new-instance v3, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog$b;

    .line 427
    .line 428
    invoke-direct {v3, v2}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;->r()Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->k()Landroidx/lifecycle/MutableLiveData;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 443
    .line 444
    .line 445
    move-result-object v1

    .line 446
    new-instance v2, Lb4/b;

    .line 447
    .line 448
    invoke-direct {v2, p0}, Lb4/b;-><init>(Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;)V

    .line 449
    .line 450
    .line 451
    new-instance v3, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog$b;

    .line 452
    .line 453
    invoke-direct {v3, v2}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 454
    .line 455
    .line 456
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 457
    .line 458
    .line 459
    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0c003d

    return v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lcom/zykj/huiwei/launcher/base/CommonDialogFragment;->onClick(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    :goto_0
    if-nez p1, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const v1, 0x7f0901a9

    .line 24
    .line 25
    .line 26
    if-eq v0, v1, :cond_8

    .line 27
    .line 28
    :goto_1
    if-nez p1, :cond_2

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    const v1, 0x7f090352

    .line 36
    .line 37
    .line 38
    if-ne v0, v1, :cond_3

    .line 39
    .line 40
    goto :goto_4

    .line 41
    :cond_3
    :goto_2
    if-nez p1, :cond_4

    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    const v0, 0x7f090354

    .line 49
    .line 50
    .line 51
    if-ne p1, v0, :cond_7

    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;->q()Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialogArgs;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p1}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialogArgs;->a()Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p1}, Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;->getVersionCode()I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    sget-object v0, Li4/g;->a:Li4/g$a;

    .line 66
    .line 67
    sget-object v1, Lcom/zykj/huiwei/launcher/app/App;->Companion:Lcom/zykj/huiwei/launcher/app/App$a;

    .line 68
    .line 69
    invoke-virtual {v1}, Lcom/zykj/huiwei/launcher/app/App$a;->a()Lcom/zykj/huiwei/launcher/app/App;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {v0, v1}, Li4/g$a;->c(Landroid/content/Context;)I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-le p1, v0, :cond_6

    .line 78
    .line 79
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    check-cast p1, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;

    .line 84
    .line 85
    iget-object p1, p1, Lcom/zykj/huiwei/launcher/databinding/HwDialogAppUpdateBinding;->tvConfirm:Landroidx/appcompat/widget/AppCompatTextView;

    .line 86
    .line 87
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    if-eqz p1, :cond_5

    .line 92
    .line 93
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {p0, p1}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;->v(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_5
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;->q()Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialogArgs;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p1}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialogArgs;->a()Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;->r()Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->u()Landroidx/lifecycle/MutableLiveData;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 118
    .line 119
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;->r()Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {v0}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->s()Landroidx/lifecycle/MutableLiveData;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 131
    .line 132
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0}, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;->r()Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-virtual {v0, p1}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->w(Lcom/zykj/huiwei/launcher/bean/resp/VersionInfo;)V

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :cond_6
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    invoke-virtual {p1}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 148
    .line 149
    .line 150
    :cond_7
    :goto_3
    return-void

    .line 151
    :cond_8
    :goto_4
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-virtual {p1}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 156
    .line 157
    .line 158
    return-void
.end method

.method public final q()Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialogArgs;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;->h:Landroidx/navigation/NavArgsLazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialogArgs;

    .line 8
    .line 9
    return-object v0
.end method

.method public final r()Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/huiwei/launcher/ui/dialog/AppUpdateDialog;->g:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public final v(Ljava/lang/String;)V
    .locals 3

    .line 1
    sget-object v0, Lh/b;->a:Lh/b;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "requireContext(...)"

    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1, p1}, Lh/b;->b(Landroid/content/Context;Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method
