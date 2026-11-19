.class public final Lcom/zykj/student/dialogue/ui/MainActivity;
.super Lcom/zykj/student/dialogue/ui/Hilt_MainActivity;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/student/dialogue/ui/MainActivity$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\r\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\u0003R\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/zykj/student/dialogue/ui/MainActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "<init>",
        "()V",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "u",
        "Lcom/zykj/student/dialogue/ui/MainViewModel;",
        "e",
        "Lkotlin/Lazy;",
        "t",
        "()Lcom/zykj/student/dialogue/ui/MainViewModel;",
        "mainViewModel",
        "f",
        "a",
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
        "SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/zykj/student/dialogue/ui/MainActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,122:1\n70#2,11:123\n*S KotlinDebug\n*F\n+ 1 MainActivity.kt\ncom/zykj/student/dialogue/ui/MainActivity\n*L\n35#1:123,11\n*E\n"
    }
.end annotation


# static fields
.field public static final f:Lcom/zykj/student/dialogue/ui/MainActivity$a;

.field public static final g:I


# instance fields
.field public final e:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/student/dialogue/ui/MainActivity$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/student/dialogue/ui/MainActivity$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/zykj/student/dialogue/ui/MainActivity;->f:Lcom/zykj/student/dialogue/ui/MainActivity$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/student/dialogue/ui/MainActivity;->g:I

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Lcom/zykj/student/dialogue/ui/Hilt_MainActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/zykj/student/dialogue/ui/MainActivity$special$$inlined$viewModels$default$1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/zykj/student/dialogue/ui/MainActivity$special$$inlined$viewModels$default$1;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Landroidx/lifecycle/ViewModelLazy;

    .line 10
    .line 11
    const-class v2, Lcom/zykj/student/dialogue/ui/MainViewModel;

    .line 12
    .line 13
    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    new-instance v3, Lcom/zykj/student/dialogue/ui/MainActivity$special$$inlined$viewModels$default$2;

    .line 18
    .line 19
    invoke-direct {v3, p0}, Lcom/zykj/student/dialogue/ui/MainActivity$special$$inlined$viewModels$default$2;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 20
    .line 21
    .line 22
    new-instance v4, Lcom/zykj/student/dialogue/ui/MainActivity$special$$inlined$viewModels$default$3;

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    invoke-direct {v4, v5, p0}, Lcom/zykj/student/dialogue/ui/MainActivity$special$$inlined$viewModels$default$3;-><init>(Lkotlin/jvm/functions/Function0;Landroidx/activity/ComponentActivity;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/ViewModelLazy;-><init>(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Lcom/zykj/student/dialogue/ui/MainActivity;->e:Lkotlin/Lazy;

    .line 32
    .line 33
    return-void
.end method

.method public static synthetic r(Lcom/zykj/student/dialogue/ui/MainActivity;Lcom/zykj/lib/error/code/ErrorCode;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/student/dialogue/ui/MainActivity;->v(Lcom/zykj/student/dialogue/ui/MainActivity;Lcom/zykj/lib/error/code/ErrorCode;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic s(Lcom/zykj/student/dialogue/ui/MainActivity;)Lcom/zykj/student/dialogue/ui/MainViewModel;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/MainActivity;->t()Lcom/zykj/student/dialogue/ui/MainViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final v(Lcom/zykj/student/dialogue/ui/MainActivity;Lcom/zykj/lib/error/code/ErrorCode;)Lkotlin/Unit;
    .locals 7

    .line 1
    sget-object v0, Lcom/zykj/lib/error/code/ErrorCode;->NET_TOKEN_ERROR:Lcom/zykj/lib/error/code/ErrorCode;

    .line 2
    .line 3
    if-ne p1, v0, :cond_1

    .line 4
    .line 5
    new-instance v1, Lcom/zykj/base/bean/toast/ToastErrorMessage;

    .line 6
    .line 7
    const/16 p1, 0x191

    .line 8
    .line 9
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/4 v5, 0x4

    .line 14
    const/4 v6, 0x0

    .line 15
    const-string v3, "\u767b\u5f55\u5df2\u8fc7\u671f,\u8bf7\u91cd\u65b0\u767b\u5f55"

    .line 16
    .line 17
    const/4 v4, 0x0

    .line 18
    invoke-direct/range {v1 .. v6}, Lcom/zykj/base/bean/toast/ToastErrorMessage;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x2

    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-static {v1, v0, p1, v0}, Li6/e;->b(Lcom/zykj/base/bean/toast/ToastMessage;Ljava/lang/String;ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    const-string p1, "com.zykj.manage"

    .line 27
    .line 28
    invoke-static {p1}, Lcom/blankj/utilcode/util/AppUtils;->isAppInstalled(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    sget-object p0, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 47
    .line 48
    const-string p1, "\u7528\u6237\u4e2d\u5fc3\u672a\u5b89\u88c5"

    .line 49
    .line 50
    invoke-virtual {p0, p1}, Lcom/zykj/base/utils/XToastUtils;->toast(Ljava/lang/CharSequence;)V

    .line 51
    .line 52
    .line 53
    :goto_0
    const/4 p0, 0x0

    .line 54
    invoke-static {p0}, Ljava/lang/System;->exit(I)V

    .line 55
    .line 56
    .line 57
    new-instance p0, Ljava/lang/RuntimeException;

    .line 58
    .line 59
    const-string p1, "System.exit returned normally, while it was supposed to halt JVM."

    .line 60
    .line 61
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p0

    .line 65
    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 66
    .line 67
    return-object p0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 14

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-super {p0, p1}, Lcom/zykj/student/dialogue/ui/Hilt_MainActivity;->onCreate(Landroid/os/Bundle;)V

    .line 6
    .line 7
    .line 8
    # RE layout layout/activity_main (0x7f0c001c), APK res/v9.xml
    sget p1, Lcom/zykj/student/dialogue/R$layout;->activity_main:I

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(I)V

    .line 11
    .line 12
    .line 13
    const p1, 0x1020002

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    new-instance v3, Lcom/zykj/student/dialogue/ui/MainActivity$b;

    .line 25
    .line 26
    invoke-direct {v3, v0, v1, p0, p1}, Lcom/zykj/student/dialogue/ui/MainActivity$b;-><init>(JLcom/zykj/student/dialogue/ui/MainActivity;Landroid/view/View;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2, v3}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/MainActivity;->t()Lcom/zykj/student/dialogue/ui/MainViewModel;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Lcom/zykj/student/dialogue/ui/MainViewModel;->c()Lcom/zykj/http/bean/HeaderLiveData;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p1}, Lcom/zykj/http/bean/HeaderLiveData;->getUnauthorized()Landroidx/lifecycle/MutableLiveData;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    new-instance v0, Ll6/a;

    .line 45
    .line 46
    invoke-direct {v0, p0}, Ll6/a;-><init>(Lcom/zykj/student/dialogue/ui/MainActivity;)V

    .line 47
    .line 48
    .line 49
    new-instance v1, Lcom/zykj/student/dialogue/ui/MainActivity$c;

    .line 50
    .line 51
    invoke-direct {v1, v0}, Lcom/zykj/student/dialogue/ui/MainActivity$c;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, p0, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 55
    .line 56
    .line 57
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    new-instance v5, Lcom/zykj/student/dialogue/ui/MainActivity$onCreate$3;

    .line 62
    .line 63
    const/4 p1, 0x0

    .line 64
    invoke-direct {v5, p0, p1}, Lcom/zykj/student/dialogue/ui/MainActivity$onCreate$3;-><init>(Lcom/zykj/student/dialogue/ui/MainActivity;Lkotlin/coroutines/Continuation;)V

    .line 65
    .line 66
    .line 67
    const/4 v6, 0x3

    .line 68
    const/4 v7, 0x0

    .line 69
    const/4 v3, 0x0

    .line 70
    const/4 v4, 0x0

    .line 71
    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 72
    .line 73
    .line 74
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    new-instance v11, Lcom/zykj/student/dialogue/ui/MainActivity$onCreate$4;

    .line 79
    .line 80
    invoke-direct {v11, p0, p1}, Lcom/zykj/student/dialogue/ui/MainActivity$onCreate$4;-><init>(Lcom/zykj/student/dialogue/ui/MainActivity;Lkotlin/coroutines/Continuation;)V

    .line 81
    .line 82
    .line 83
    const/4 v12, 0x3

    .line 84
    const/4 v13, 0x0

    .line 85
    const/4 v9, 0x0

    .line 86
    const/4 v10, 0x0

    .line 87
    invoke-static/range {v8 .. v13}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method public final t()Lcom/zykj/student/dialogue/ui/MainViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/MainActivity;->e:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/student/dialogue/ui/MainViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public final u()V
    .locals 7

    .line 1
    const-string v0, "MainHostFragmentTag"

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const-string v2, "MainHostFragmentTag"

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    sget v2, Lcom/zykj/student/dialogue/R$id;->nav_host_fragment_container:I

    .line 25
    .line 26
    sget-object v3, Landroidx/navigation/fragment/NavHostFragment;->Companion:Landroidx/navigation/fragment/NavHostFragment$Companion;

    .line 27
    .line 28
    sget v4, Lcom/zykj/student/dialogue/R$navigation;->nav_graph:I

    .line 29
    .line 30
    const/4 v5, 0x2

    .line 31
    const/4 v6, 0x0

    .line 32
    invoke-static {v3, v4, v6, v5, v6}, Landroidx/navigation/fragment/NavHostFragment$Companion;->create$default(Landroidx/navigation/fragment/NavHostFragment$Companion;ILandroid/os/Bundle;ILjava/lang/Object;)Landroidx/navigation/fragment/NavHostFragment;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    const-string v4, "MainHostFragmentTag"

    .line 37
    .line 38
    invoke-virtual {v1, v2, v3, v4}, Landroidx/fragment/app/FragmentTransaction;->replace(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/FragmentTransaction;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, Landroidx/fragment/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception v1

    .line 47
    goto :goto_1

    .line 48
    :cond_0
    :goto_0
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    monitor-exit v0

    .line 51
    return-void

    .line 52
    :goto_1
    monitor-exit v0

    .line 53
    throw v1
.end method
