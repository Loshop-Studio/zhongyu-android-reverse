.class public final Lcom/friday/paint/view/NoteActivity;
.super Lcom/friday/paint/view/Hilt_NoteActivity;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation build Lcom/alibaba/android/arouter/facade/annotation/Route;
    path = "/paint/NoteActivity"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/paint/view/NoteActivity$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/friday/paint/view/Hilt_NoteActivity<",
        "Lcom/friday/paint/databinding/NoteActivityBinding;",
        ">;"
    }
.end annotation


# static fields
.field public static final m:Lcom/friday/paint/view/NoteActivity$a;

.field public static final n:I


# instance fields
.field public final g:Lqc/d;

.field public final h:Lqc/d;

.field public i:Ljava/lang/String;

.field public j:Ljava/lang/String;

.field public k:Ljava/lang/String;

.field public l:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/friday/paint/view/NoteActivity$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/friday/paint/view/NoteActivity$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/friday/paint/view/NoteActivity;->m:Lcom/friday/paint/view/NoteActivity$a;

    const/16 v0, 0x8

    sput v0, Lcom/friday/paint/view/NoteActivity;->n:I

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Lcom/friday/paint/view/Hilt_NoteActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/friday/paint/view/NoteActivity$special$$inlined$viewModels$default$1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/friday/paint/view/NoteActivity$special$$inlined$viewModels$default$1;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Landroidx/lifecycle/ViewModelLazy;

    .line 10
    .line 11
    const-class v2, Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 12
    .line 13
    invoke-static {v2}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    new-instance v3, Lcom/friday/paint/view/NoteActivity$special$$inlined$viewModels$default$2;

    .line 18
    .line 19
    invoke-direct {v3, p0}, Lcom/friday/paint/view/NoteActivity$special$$inlined$viewModels$default$2;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 20
    .line 21
    .line 22
    new-instance v4, Lcom/friday/paint/view/NoteActivity$special$$inlined$viewModels$default$3;

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    invoke-direct {v4, v5, p0}, Lcom/friday/paint/view/NoteActivity$special$$inlined$viewModels$default$3;-><init>(Lhd/a;Landroidx/activity/ComponentActivity;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/ViewModelLazy;-><init>(Lod/c;Lhd/a;Lhd/a;Lhd/a;)V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Lcom/friday/paint/view/NoteActivity;->g:Lqc/d;

    .line 32
    .line 33
    new-instance v0, Lc4/a;

    .line 34
    .line 35
    invoke-direct {v0, p0}, Lc4/a;-><init>(Lcom/friday/paint/view/NoteActivity;)V

    .line 36
    .line 37
    .line 38
    invoke-static {v0}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, Lcom/friday/paint/view/NoteActivity;->h:Lqc/d;

    .line 43
    .line 44
    const-string v0, ""

    .line 45
    .line 46
    iput-object v0, p0, Lcom/friday/paint/view/NoteActivity;->i:Ljava/lang/String;

    .line 47
    .line 48
    iput-object v0, p0, Lcom/friday/paint/view/NoteActivity;->j:Ljava/lang/String;

    .line 49
    .line 50
    iput-object v0, p0, Lcom/friday/paint/view/NoteActivity;->k:Ljava/lang/String;

    .line 51
    .line 52
    iput-object v0, p0, Lcom/friday/paint/view/NoteActivity;->l:Ljava/lang/String;

    .line 53
    .line 54
    return-void
.end method

.method public static synthetic N(Lcom/friday/paint/view/NoteActivity;)Landroidx/fragment/app/Fragment;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/paint/view/NoteActivity;->Q(Lcom/friday/paint/view/NoteActivity;)Landroidx/fragment/app/Fragment;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic O(Lcom/friday/paint/view/NoteActivity;)Landroidx/fragment/app/Fragment;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/paint/view/NoteActivity;->R()Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic P(Lcom/friday/paint/view/NoteActivity;)Lcom/friday/paint/viewmodel/NoteViewModel;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/paint/view/NoteActivity;->S()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final Q(Lcom/friday/paint/view/NoteActivity;)Landroidx/fragment/app/Fragment;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "the_paint_fragment"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    new-instance p0, Lcom/friday/paint/view/StudentPaintFragment;

    .line 14
    .line 15
    invoke-direct {p0}, Lcom/friday/paint/view/StudentPaintFragment;-><init>()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-object p0
.end method


# virtual methods
.method public final R()Landroidx/fragment/app/Fragment;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/view/NoteActivity;->h:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/fragment/app/Fragment;

    .line 8
    .line 9
    return-object v0
.end method

.method public final S()Lcom/friday/paint/viewmodel/NoteViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/view/NoteActivity;->g:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public getLayoutId()I
    .locals 1

    .line 1
    # RE layout layout/note_activity (0x7f0c00fd), APK res/wG.xml
    sget v0, Lcom/friday/paint/R$layout;->note_activity:I

    .line 2
    .line 3
    return v0
.end method

.method public initData()V
    .locals 0

    return-void
.end method

.method public onBackPressed()V
    .locals 2

    .line 1
    sget-object v0, Lk2/m;->a:Lk2/m$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lk2/m$a;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const/4 v0, 0x1

    .line 11
    invoke-virtual {p0, v0}, Lcom/friday/common/base/BaseActivity;->isShowLoading(Z)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/friday/paint/view/NoteActivity;->S()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Lcom/friday/paint/viewmodel/NoteViewModel;->A()Landroidx/lifecycle/MutableLiveData;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 6

    .line 1
    invoke-super {p0, p1}, Lcom/friday/paint/view/Hilt_NoteActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    sget-object p1, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/friday/common/helper/c;->c()V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/blankj/utilcode/util/ActivityUtils;->finishAllActivities()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-static {}, Lcom/alibaba/android/arouter/launcher/ARouter;->getInstance()Lcom/alibaba/android/arouter/launcher/ARouter;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1, p0}, Lcom/alibaba/android/arouter/launcher/ARouter;->inject(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    new-instance v3, Lcom/friday/paint/view/NoteActivity$onCreate$1;

    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    invoke-direct {v3, p0, p1}, Lcom/friday/paint/view/NoteActivity$onCreate$1;-><init>(Lcom/friday/paint/view/NoteActivity;Lvc/c;)V

    .line 30
    .line 31
    .line 32
    const/4 v4, 0x3

    .line 33
    const/4 v5, 0x0

    .line 34
    const/4 v1, 0x0

    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public onPause()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/friday/common/base/BaseActivity;->onPause()V

    .line 2
    .line 3
    .line 4
    const-string v0, "CanvasEnable"

    .line 5
    .line 6
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 7
    .line 8
    invoke-static {v0, v1}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-interface {v0, v1}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public onResume()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/friday/common/base/BaseActivity;->onResume()V

    .line 2
    .line 3
    .line 4
    const-string v0, "CanvasEnable"

    .line 5
    .line 6
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 7
    .line 8
    invoke-static {v0, v1}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-interface {v0, v1}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
