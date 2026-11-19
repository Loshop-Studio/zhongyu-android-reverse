.class public final Lcom/zykj/mistake/activity/MainActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "SourceFile"

# interfaces
.implements Lw4/c;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0007\u00b2\u0006\u000c\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/zykj/mistake/activity/MainActivity;",
        "Landroidx/appcompat/app/AppCompatActivity;",
        "Lw4/c;",
        "<init>",
        "()V",
        "",
        "isLoading",
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
        "SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/zykj/mistake/activity/MainActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,322:1\n70#2,11:323\n85#3:334\n1247#4,6:335\n1247#4,6:341\n1247#4,6:347\n*S KotlinDebug\n*F\n+ 1 MainActivity.kt\ncom/zykj/mistake/activity/MainActivity\n*L\n70#1:323,11\n137#1:334\n143#1:335,6\n144#1:341,6\n131#1:347,6\n*E\n"
    }
.end annotation


# static fields
.field public static final synthetic o:I


# instance fields
.field public final a:Landroidx/lifecycle/ViewModelLazy;

.field public final b:Lo2/a;

.field public c:Lo1/c;

.field public d:Z

.field public final e:Landroidx/activity/result/ActivityResultLauncher;

.field public f:Lr6/a;

.field public final g:Landroidx/activity/result/ActivityResultLauncher;

.field public h:Lcom/zykj/mistake/utils/g;

.field public final i:Lcom/zykj/view/utils/ImagePicker;

.field public j:Ll4/d;

.field public final k:Landroidx/activity/result/ActivityResultLauncher;

.field public final l:Lkotlinx/serialization/json/internal/l;

.field public m:Lw4/a;

.field public final n:Lcom/zykj/mistake/activity/g;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/zykj/mistake/activity/MainActivity$special$$inlined$viewModels$default$1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/zykj/mistake/activity/MainActivity$special$$inlined$viewModels$default$1;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Landroidx/lifecycle/ViewModelLazy;

    .line 10
    .line 11
    const-class v2, Lcom/zykj/mistake/main/MainShellViewModel;

    .line 12
    .line 13
    invoke-static {v2}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Class;)Lkotlin/jvm/internal/d;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    new-instance v3, Lcom/zykj/mistake/activity/MainActivity$special$$inlined$viewModels$default$2;

    .line 18
    .line 19
    invoke-direct {v3, p0}, Lcom/zykj/mistake/activity/MainActivity$special$$inlined$viewModels$default$2;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 20
    .line 21
    .line 22
    new-instance v4, Lcom/zykj/mistake/activity/MainActivity$special$$inlined$viewModels$default$3;

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    invoke-direct {v4, v5, p0}, Lcom/zykj/mistake/activity/MainActivity$special$$inlined$viewModels$default$3;-><init>(Lr6/a;Landroidx/activity/ComponentActivity;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/ViewModelLazy;-><init>(Ly6/c;Lr6/a;Lr6/a;Lr6/a;)V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Lcom/zykj/mistake/activity/MainActivity;->a:Landroidx/lifecycle/ViewModelLazy;

    .line 32
    .line 33
    new-instance v0, Lo2/a;

    .line 34
    .line 35
    const/16 v1, 0xb

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    invoke-direct {v0, v1, v2}, Lo2/a;-><init>(IZ)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Lcom/zykj/mistake/activity/MainActivity;->b:Lo2/a;

    .line 42
    .line 43
    const/4 v0, 0x1

    .line 44
    iput-boolean v0, p0, Lcom/zykj/mistake/activity/MainActivity;->d:Z

    .line 45
    .line 46
    new-instance v1, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;

    .line 47
    .line 48
    invoke-direct {v1}, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;-><init>()V

    .line 49
    .line 50
    .line 51
    new-instance v2, Lp7/a;

    .line 52
    .line 53
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, v1, v2}, Landroidx/activity/ComponentActivity;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    iput-object v1, p0, Lcom/zykj/mistake/activity/MainActivity;->e:Landroidx/activity/result/ActivityResultLauncher;

    .line 61
    .line 62
    new-instance v1, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;

    .line 63
    .line 64
    invoke-direct {v1}, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;-><init>()V

    .line 65
    .line 66
    .line 67
    new-instance v2, Lcom/zykj/mistake/activity/b;

    .line 68
    .line 69
    const/4 v3, 0x0

    .line 70
    invoke-direct {v2, p0, v3}, Lcom/zykj/mistake/activity/b;-><init>(Lcom/zykj/mistake/activity/MainActivity;I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, v1, v2}, Landroidx/activity/ComponentActivity;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    iput-object v1, p0, Lcom/zykj/mistake/activity/MainActivity;->g:Landroidx/activity/result/ActivityResultLauncher;

    .line 78
    .line 79
    new-instance v1, Lcom/zykj/view/utils/ImagePicker;

    .line 80
    .line 81
    invoke-direct {v1, v5, p0, v0, v5}, Lcom/zykj/view/utils/ImagePicker;-><init>(Landroidx/fragment/app/Fragment;Landroidx/activity/ComponentActivity;ILkotlin/jvm/internal/e;)V

    .line 82
    .line 83
    .line 84
    iput-object v1, p0, Lcom/zykj/mistake/activity/MainActivity;->i:Lcom/zykj/view/utils/ImagePicker;

    .line 85
    .line 86
    new-instance v0, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;

    .line 87
    .line 88
    invoke-direct {v0}, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;-><init>()V

    .line 89
    .line 90
    .line 91
    new-instance v1, Lcom/zykj/mistake/activity/b;

    .line 92
    .line 93
    const/4 v2, 0x1

    .line 94
    invoke-direct {v1, p0, v2}, Lcom/zykj/mistake/activity/b;-><init>(Lcom/zykj/mistake/activity/MainActivity;I)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0, v0, v1}, Landroidx/activity/ComponentActivity;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    iput-object v0, p0, Lcom/zykj/mistake/activity/MainActivity;->k:Landroidx/activity/result/ActivityResultLauncher;

    .line 102
    .line 103
    new-instance v0, Lkotlinx/serialization/json/internal/l;

    .line 104
    .line 105
    const/4 v1, 0x2

    .line 106
    invoke-direct {v0, v1}, Lkotlinx/serialization/json/internal/l;-><init>(I)V

    .line 107
    .line 108
    .line 109
    iput-object v0, p0, Lcom/zykj/mistake/activity/MainActivity;->l:Lkotlinx/serialization/json/internal/l;

    .line 110
    .line 111
    new-instance v0, Lcom/zykj/mistake/activity/g;

    .line 112
    .line 113
    invoke-direct {v0, p0}, Lcom/zykj/mistake/activity/g;-><init>(Lcom/zykj/mistake/activity/MainActivity;)V

    .line 114
    .line 115
    .line 116
    iput-object v0, p0, Lcom/zykj/mistake/activity/MainActivity;->n:Lcom/zykj/mistake/activity/g;

    .line 117
    .line 118
    return-void
.end method


# virtual methods
.method public final attachBaseContext(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "newBase"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lkotlin/collections/u;->O(Landroid/content/Context;)Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-super {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->attachBaseContext(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final b(Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "message"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/zykj/mistake/data/b;->a:Lcom/zykj/mistake/data/b;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    sget-boolean v1, Lcom/zykj/mistake/data/b;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    monitor-exit v0

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "getApplicationContext(...)"

    .line 20
    .line 21
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    sget-object v1, Lcom/zykj/mistake/utils/d;->e:Landroid/widget/Toast;

    .line 25
    .line 26
    if-nez v1, :cond_1

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const/16 v0, 0x51

    .line 34
    .line 35
    const/16 v2, 0xdc

    .line 36
    .line 37
    invoke-virtual {p1, v0, v1, v2}, Landroid/widget/Toast;->setGravity(III)V

    .line 38
    .line 39
    .line 40
    sput-object p1, Lcom/zykj/mistake/utils/d;->e:Landroid/widget/Toast;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-virtual {v1, p1}, Landroid/widget/Toast;->setText(Ljava/lang/CharSequence;)V

    .line 44
    .line 45
    .line 46
    :goto_0
    sget-object p1, Lcom/zykj/mistake/utils/d;->e:Landroid/widget/Toast;

    .line 47
    .line 48
    invoke-static {p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :catchall_0
    move-exception p1

    .line 56
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 57
    throw p1
.end method

.method public final c()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/activity/MainActivity;->l:Lkotlinx/serialization/json/internal/l;

    .line 2
    .line 3
    iget v1, v0, Lkotlinx/serialization/json/internal/l;->b:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    sub-int/2addr v1, v2

    .line 7
    const/4 v3, 0x0

    .line 8
    if-gez v1, :cond_0

    .line 9
    .line 10
    move v1, v3

    .line 11
    :cond_0
    iput v1, v0, Lkotlinx/serialization/json/internal/l;->b:I

    .line 12
    .line 13
    iget-object v0, v0, Lkotlinx/serialization/json/internal/l;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lkotlinx/coroutines/flow/n0;

    .line 16
    .line 17
    if-lez v1, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    move v2, v3

    .line 21
    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-virtual {v0, v2, v1}, Lkotlinx/coroutines/flow/n0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final d(Z)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/zykj/mistake/activity/MainActivity;->l:Lkotlinx/serialization/json/internal/l;

    .line 2
    .line 3
    iget v0, p1, Lkotlinx/serialization/json/internal/l;->b:I

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    add-int/2addr v0, v1

    .line 7
    iput v0, p1, Lkotlinx/serialization/json/internal/l;->b:I

    .line 8
    .line 9
    iget-object p1, p1, Lkotlinx/serialization/json/internal/l;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, Lkotlinx/coroutines/flow/n0;

    .line 12
    .line 13
    if-lez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-virtual {p1, v1, v0}, Lkotlinx/coroutines/flow/n0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final o()Lcom/zykj/mistake/main/MainShellViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/activity/MainActivity;->a:Landroidx/lifecycle/ViewModelLazy;

    .line 2
    .line 3
    invoke-interface {v0}, Ld6/e;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/mistake/main/MainShellViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 11

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const/4 v0, -0x1

    .line 9
    invoke-virtual {p1, v0}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 10
    .line 11
    .line 12
    new-instance p1, Landroidx/core/view/WindowInsetsControllerCompat;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-direct {p1, v0, v1}, Landroidx/core/view/WindowInsetsControllerCompat;-><init>(Landroid/view/Window;Landroid/view/View;)V

    .line 27
    .line 28
    .line 29
    const/4 v1, 0x1

    .line 30
    invoke-virtual {p1, v1}, Landroidx/core/view/WindowInsetsControllerCompat;->setAppearanceLightStatusBars(Z)V

    .line 31
    .line 32
    .line 33
    sget-object p1, Lcom/zykj/mistake/data/b;->a:Lcom/zykj/mistake/data/b;

    .line 34
    .line 35
    monitor-enter p1

    .line 36
    const/4 v2, 0x0

    .line 37
    :try_start_0
    sput-boolean v2, Lcom/zykj/mistake/data/b;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    monitor-exit p1

    .line 40
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    new-instance v0, Lcom/zykj/mistake/activity/MainActivity$observeComposeAuthExpired$1;

    .line 45
    .line 46
    const/4 v3, 0x0

    .line 47
    invoke-direct {v0, p0, v3}, Lcom/zykj/mistake/activity/MainActivity$observeComposeAuthExpired$1;-><init>(Lcom/zykj/mistake/activity/MainActivity;Lh6/c;)V

    .line 48
    .line 49
    .line 50
    const/4 v4, 0x3

    .line 51
    invoke-static {p1, v3, v3, v0, v4}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 52
    .line 53
    .line 54
    new-instance p1, Lcom/zykj/mistake/utils/g;

    .line 55
    .line 56
    invoke-direct {p1, p0}, Lcom/zykj/mistake/utils/g;-><init>(Landroidx/activity/result/ActivityResultCaller;)V

    .line 57
    .line 58
    .line 59
    iput-object p1, p0, Lcom/zykj/mistake/activity/MainActivity;->h:Lcom/zykj/mistake/utils/g;

    .line 60
    .line 61
    new-instance p1, Ll4/d;

    .line 62
    .line 63
    invoke-direct {p1, p0}, Ll4/d;-><init>(Landroid/content/Context;)V

    .line 64
    .line 65
    .line 66
    iput-object p1, p0, Lcom/zykj/mistake/activity/MainActivity;->j:Ll4/d;

    .line 67
    .line 68
    new-instance p1, La5/e;

    .line 69
    .line 70
    new-instance v0, Lcom/zykj/mistake/activity/e;

    .line 71
    .line 72
    invoke-direct {v0, p0}, Lcom/zykj/mistake/activity/e;-><init>(Lcom/zykj/mistake/activity/MainActivity;)V

    .line 73
    .line 74
    .line 75
    new-instance v4, Lcom/zykj/mistake/activity/a;

    .line 76
    .line 77
    const/4 v5, 0x3

    .line 78
    invoke-direct {v4, p0, v5}, Lcom/zykj/mistake/activity/a;-><init>(Lcom/zykj/mistake/activity/MainActivity;I)V

    .line 79
    .line 80
    .line 81
    invoke-direct {p1, p0, p0, v0, v4}, La5/e;-><init>(Lcom/zykj/mistake/activity/MainActivity;Lcom/zykj/mistake/activity/MainActivity;Lcom/zykj/mistake/activity/e;Lcom/zykj/mistake/activity/a;)V

    .line 82
    .line 83
    .line 84
    new-instance v0, La5/e;

    .line 85
    .line 86
    new-instance v4, Lcom/zykj/mistake/activity/MainActivity$buildRouteInfrastructure$notebookDatePickerHost$1;

    .line 87
    .line 88
    invoke-direct {v4, p0}, Lcom/zykj/mistake/activity/MainActivity$buildRouteInfrastructure$notebookDatePickerHost$1;-><init>(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    new-instance v5, Lcom/zykj/mistake/activity/c;

    .line 92
    .line 93
    const/4 v6, 0x1

    .line 94
    invoke-direct {v5, p0, v6}, Lcom/zykj/mistake/activity/c;-><init>(Lcom/zykj/mistake/activity/MainActivity;I)V

    .line 95
    .line 96
    .line 97
    new-instance v6, Lcom/zykj/mistake/activity/f;

    .line 98
    .line 99
    const/4 v7, 0x1

    .line 100
    invoke-direct {v6, p0, v7}, Lcom/zykj/mistake/activity/f;-><init>(Lcom/zykj/mistake/activity/MainActivity;I)V

    .line 101
    .line 102
    .line 103
    invoke-direct {v0, p0, v4, v5, v6}, La5/e;-><init>(Lcom/zykj/mistake/activity/MainActivity;Lr6/c;Lcom/zykj/mistake/activity/c;Lcom/zykj/mistake/activity/f;)V

    .line 104
    .line 105
    .line 106
    new-instance v4, Lw4/a;

    .line 107
    .line 108
    new-instance v5, Lz4/e;

    .line 109
    .line 110
    iget-object v7, p0, Lcom/zykj/mistake/activity/MainActivity;->h:Lcom/zykj/mistake/utils/g;

    .line 111
    .line 112
    if-eqz v7, :cond_1

    .line 113
    .line 114
    iget-object v8, p0, Lcom/zykj/mistake/activity/MainActivity;->i:Lcom/zykj/view/utils/ImagePicker;

    .line 115
    .line 116
    iget-object v9, p0, Lcom/zykj/mistake/activity/MainActivity;->j:Ll4/d;

    .line 117
    .line 118
    iget-object v10, p0, Lcom/zykj/mistake/activity/MainActivity;->k:Landroidx/activity/result/ActivityResultLauncher;

    .line 119
    .line 120
    move-object v6, p0

    .line 121
    invoke-direct/range {v5 .. v10}, Lz4/e;-><init>(Lcom/zykj/mistake/activity/MainActivity;Lcom/zykj/mistake/utils/g;Lcom/zykj/view/utils/ImagePicker;Ll4/d;Landroidx/activity/result/ActivityResultLauncher;)V

    .line 122
    .line 123
    .line 124
    new-instance v7, Lz4/a;

    .line 125
    .line 126
    iget-object v8, v6, Lcom/zykj/mistake/activity/MainActivity;->b:Lo2/a;

    .line 127
    .line 128
    invoke-direct {v7, p0, v8}, Lz4/a;-><init>(Lcom/zykj/mistake/activity/MainActivity;Lo2/a;)V

    .line 129
    .line 130
    .line 131
    new-instance v8, Lz4/c;

    .line 132
    .line 133
    invoke-direct {v8, p1}, Lz4/c;-><init>(La5/e;)V

    .line 134
    .line 135
    .line 136
    new-instance p1, Lz4/g;

    .line 137
    .line 138
    new-instance v9, Lcom/zykj/mistake/activity/a;

    .line 139
    .line 140
    const/4 v10, 0x1

    .line 141
    invoke-direct {v9, p0, v10}, Lcom/zykj/mistake/activity/a;-><init>(Lcom/zykj/mistake/activity/MainActivity;I)V

    .line 142
    .line 143
    .line 144
    invoke-direct {p1, p0, v0, v9}, Lz4/g;-><init>(Lcom/zykj/mistake/activity/MainActivity;La5/e;Lcom/zykj/mistake/activity/a;)V

    .line 145
    .line 146
    .line 147
    invoke-direct {v4, v5, v7, v8, p1}, Lw4/a;-><init>(Lz4/e;Lz4/a;Lz4/c;Lz4/g;)V

    .line 148
    .line 149
    .line 150
    iput-object v4, v6, Lcom/zykj/mistake/activity/MainActivity;->m:Lw4/a;

    .line 151
    .line 152
    iget-object p1, v6, Lcom/zykj/mistake/activity/MainActivity;->e:Landroidx/activity/result/ActivityResultLauncher;

    .line 153
    .line 154
    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    .line 155
    .line 156
    invoke-virtual {p1, v0}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    new-instance p1, Lcom/zykj/mistake/activity/c;

    .line 160
    .line 161
    const/4 v0, 0x0

    .line 162
    invoke-direct {p1, p0, v0}, Lcom/zykj/mistake/activity/c;-><init>(Lcom/zykj/mistake/activity/MainActivity;I)V

    .line 163
    .line 164
    .line 165
    const v0, 0x62cdf6d6

    .line 166
    .line 167
    .line 168
    invoke-static {v0, v1, p1}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    invoke-static {p0, v3, p1, v1, v3}, Landroidx/activity/compose/ComponentActivityKt;->setContent$default(Landroidx/activity/ComponentActivity;Landroidx/compose/runtime/CompositionContext;Lr6/e;ILjava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    const-string p1, "cn.com.techvision.appstore"

    .line 176
    .line 177
    :try_start_1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-virtual {v0, p1, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    iget-boolean v2, v0, Landroid/content/pm/ApplicationInfo;->enabled:Z
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    .line 186
    .line 187
    goto :goto_0

    .line 188
    :catch_0
    move-exception v0

    .line 189
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 190
    .line 191
    .line 192
    :goto_0
    if-eqz v2, :cond_0

    .line 193
    .line 194
    new-instance v0, Landroid/content/Intent;

    .line 195
    .line 196
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0, p1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 200
    .line 201
    .line 202
    const-string p1, "cn.com.techvision.appstore.action.CHECK_UPDATE_SERVICE"

    .line 203
    .line 204
    invoke-virtual {v0, p1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 205
    .line 206
    .line 207
    iget-object p1, v6, Lcom/zykj/mistake/activity/MainActivity;->n:Lcom/zykj/mistake/activity/g;

    .line 208
    .line 209
    invoke-virtual {p0, v0, p1, v1}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 210
    .line 211
    .line 212
    :cond_0
    return-void

    .line 213
    :cond_1
    move-object v6, p0

    .line 214
    const-string p1, "galleryLauncher"

    .line 215
    .line 216
    invoke-static {p1}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    throw v3

    .line 220
    :catchall_0
    move-exception v0

    .line 221
    move-object v6, p0

    .line 222
    :goto_1
    :try_start_2
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 223
    throw v0

    .line 224
    :catchall_1
    move-exception v0

    .line 225
    goto :goto_1
.end method

.method public final onDestroy()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/activity/MainActivity;->j:Ll4/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/zykj/mistake/activity/MainActivity;->j:Ll4/d;

    .line 10
    .line 11
    iget-object v1, p0, Lcom/zykj/mistake/activity/MainActivity;->l:Lkotlinx/serialization/json/internal/l;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    iput v2, v1, Lkotlinx/serialization/json/internal/l;->b:I

    .line 15
    .line 16
    iget-object v1, v1, Lkotlinx/serialization/json/internal/l;->c:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Lkotlinx/coroutines/flow/n0;

    .line 19
    .line 20
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v0, v3}, Lkotlinx/coroutines/flow/n0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onDestroy()V

    .line 29
    .line 30
    .line 31
    const-string v0, "cn.com.techvision.appstore"

    .line 32
    .line 33
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-boolean v2, v0, Landroid/content/pm/ApplicationInfo;->enabled:Z
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catch_0
    move-exception v0

    .line 45
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 46
    .line 47
    .line 48
    :goto_0
    if-eqz v2, :cond_1

    .line 49
    .line 50
    iget-object v0, p0, Lcom/zykj/mistake/activity/MainActivity;->n:Lcom/zykj/mistake/activity/g;

    .line 51
    .line 52
    invoke-virtual {p0, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    return-void
.end method

.method public final onResume()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/zykj/message/client/MessageClient;->INSTANCES:Lcom/zykj/message/client/MessageClient;

    .line 5
    .line 6
    new-instance v1, Lcom/zykj/mistake/activity/a;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {v1, p0, v2}, Lcom/zykj/mistake/activity/a;-><init>(Lcom/zykj/mistake/activity/MainActivity;I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/zykj/message/client/MessageClient;->getServerInfo(Lr6/c;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
