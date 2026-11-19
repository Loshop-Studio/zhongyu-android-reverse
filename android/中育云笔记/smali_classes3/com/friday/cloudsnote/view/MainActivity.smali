.class public final Lcom/friday/cloudsnote/view/MainActivity;
.super Lcom/friday/cloudsnote/view/Hilt_MainActivity;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation build Lcom/alibaba/android/arouter/facade/annotation/Route;
    path = "/app/MainActivity"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/friday/cloudsnote/view/Hilt_MainActivity<",
        "Lcom/friday/cloudsnote/databinding/MainActivityBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final g:Lqc/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Lcom/friday/cloudsnote/view/Hilt_MainActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/friday/cloudsnote/view/MainActivity$special$$inlined$viewModels$default$1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/friday/cloudsnote/view/MainActivity$special$$inlined$viewModels$default$1;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Landroidx/lifecycle/ViewModelLazy;

    .line 10
    .line 11
    const-class v2, Lcom/friday/cloudsnote/viewModel/MainViewModel;

    .line 12
    .line 13
    invoke-static {v2}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    new-instance v3, Lcom/friday/cloudsnote/view/MainActivity$special$$inlined$viewModels$default$2;

    .line 18
    .line 19
    invoke-direct {v3, p0}, Lcom/friday/cloudsnote/view/MainActivity$special$$inlined$viewModels$default$2;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 20
    .line 21
    .line 22
    new-instance v4, Lcom/friday/cloudsnote/view/MainActivity$special$$inlined$viewModels$default$3;

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    invoke-direct {v4, v5, p0}, Lcom/friday/cloudsnote/view/MainActivity$special$$inlined$viewModels$default$3;-><init>(Lhd/a;Landroidx/activity/ComponentActivity;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/ViewModelLazy;-><init>(Lod/c;Lhd/a;Lhd/a;Lhd/a;)V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Lcom/friday/cloudsnote/view/MainActivity;->g:Lqc/d;

    .line 32
    .line 33
    return-void
.end method

.method public static final synthetic N(Lcom/friday/cloudsnote/view/MainActivity;)Lcom/friday/cloudsnote/viewModel/MainViewModel;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/cloudsnote/view/MainActivity;->O()Lcom/friday/cloudsnote/viewModel/MainViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final O()Lcom/friday/cloudsnote/viewModel/MainViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/cloudsnote/view/MainActivity;->g:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/cloudsnote/viewModel/MainViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public getLayoutId()I
    .locals 1

    .line 1
    # RE layout layout/main_activity (0x7f0c00b0), APK res/Xp.xml
    sget v0, Lcom/friday/cloudsnote/R$layout;->main_activity:I

    .line 2
    .line 3
    return v0
.end method

.method public initData()V
    .locals 7

    .line 1
    invoke-static {}, Lcom/alibaba/android/arouter/launcher/ARouter;->getInstance()Lcom/alibaba/android/arouter/launcher/ARouter;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p0}, Lcom/alibaba/android/arouter/launcher/ARouter;->inject(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Landroid/content/Intent;->getFlags()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/high16 v1, 0x400000

    .line 17
    .line 18
    and-int/2addr v0, v1

    .line 19
    if-lez v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    new-instance v4, Lcom/friday/cloudsnote/view/MainActivity$initData$1;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    invoke-direct {v4, p0, v0}, Lcom/friday/cloudsnote/view/MainActivity$initData$1;-><init>(Lcom/friday/cloudsnote/view/MainActivity;Lvc/c;)V

    .line 33
    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v6, 0x0

    .line 37
    const/4 v2, 0x0

    .line 38
    const/4 v3, 0x0

    .line 39
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-super {p0, p1}, Lcom/friday/cloudsnote/view/Hilt_MainActivity;->onCreate(Landroid/os/Bundle;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
