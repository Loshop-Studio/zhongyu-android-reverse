.class public final Lcom/friday/paint/view/six/NewNoteActivity;
.super Lcom/friday/paint/view/six/Hilt_NewNoteActivity;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation build Lcom/alibaba/android/arouter/facade/annotation/Route;
    path = "/paint/NewNoteActivity"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/paint/view/six/NewNoteActivity$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/friday/paint/view/six/Hilt_NewNoteActivity<",
        "Lcom/friday/paint/databinding/ResFragmentNoteDetailBinding;",
        ">;"
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/friday/paint/view/six/NewNoteActivity$a;

.field private static final FRAGMENT_TAG:Ljava/lang/String; = "NewNoteActivity_the_paint_fragment"


# instance fields
.field public fileId:Ljava/lang/String;
    .annotation build Lcom/alibaba/android/arouter/facade/annotation/Autowired;
    .end annotation
.end field

.field public fileName:Ljava/lang/String;
    .annotation build Lcom/alibaba/android/arouter/facade/annotation/Autowired;
    .end annotation
.end field

.field public fromPage:Ljava/lang/String;
    .annotation build Lcom/alibaba/android/arouter/facade/annotation/Autowired;
    .end annotation
.end field

.field private paintFragment:Lcom/friday/paint/view/six/NewStudentPaintFragment;

.field public parentId:Ljava/lang/String;
    .annotation build Lcom/alibaba/android/arouter/facade/annotation/Autowired;
    .end annotation
.end field

.field private final viewModel$delegate:Lqc/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/friday/paint/view/six/NewNoteActivity$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/friday/paint/view/six/NewNoteActivity$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/friday/paint/view/six/NewNoteActivity;->Companion:Lcom/friday/paint/view/six/NewNoteActivity$a;

    const/16 v0, 0x8

    sput v0, Lcom/friday/paint/view/six/NewNoteActivity;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Lcom/friday/paint/view/six/Hilt_NewNoteActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/friday/paint/view/six/NewNoteActivity$special$$inlined$viewModels$default$1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/friday/paint/view/six/NewNoteActivity$special$$inlined$viewModels$default$1;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Landroidx/lifecycle/ViewModelLazy;

    .line 10
    .line 11
    const-class v2, Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 12
    .line 13
    invoke-static {v2}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    new-instance v3, Lcom/friday/paint/view/six/NewNoteActivity$special$$inlined$viewModels$default$2;

    .line 18
    .line 19
    invoke-direct {v3, p0}, Lcom/friday/paint/view/six/NewNoteActivity$special$$inlined$viewModels$default$2;-><init>(Landroidx/activity/ComponentActivity;)V

    .line 20
    .line 21
    .line 22
    new-instance v4, Lcom/friday/paint/view/six/NewNoteActivity$special$$inlined$viewModels$default$3;

    .line 23
    .line 24
    const/4 v5, 0x0

    .line 25
    invoke-direct {v4, v5, p0}, Lcom/friday/paint/view/six/NewNoteActivity$special$$inlined$viewModels$default$3;-><init>(Lhd/a;Landroidx/activity/ComponentActivity;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {v1, v2, v3, v0, v4}, Landroidx/lifecycle/ViewModelLazy;-><init>(Lod/c;Lhd/a;Lhd/a;Lhd/a;)V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, Lcom/friday/paint/view/six/NewNoteActivity;->viewModel$delegate:Lqc/d;

    .line 32
    .line 33
    const-string v0, ""

    .line 34
    .line 35
    iput-object v0, p0, Lcom/friday/paint/view/six/NewNoteActivity;->parentId:Ljava/lang/String;

    .line 36
    .line 37
    iput-object v0, p0, Lcom/friday/paint/view/six/NewNoteActivity;->fileName:Ljava/lang/String;

    .line 38
    .line 39
    iput-object v0, p0, Lcom/friday/paint/view/six/NewNoteActivity;->fileId:Ljava/lang/String;

    .line 40
    .line 41
    iput-object v0, p0, Lcom/friday/paint/view/six/NewNoteActivity;->fromPage:Ljava/lang/String;

    .line 42
    .line 43
    return-void
.end method

.method public static final synthetic access$getViewModel(Lcom/friday/paint/view/six/NewNoteActivity;)Lcom/friday/paint/viewmodel/NewNoteViewModel;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewNoteActivity;->getViewModel()Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$setPaintFragment$p(Lcom/friday/paint/view/six/NewNoteActivity;Lcom/friday/paint/view/six/NewStudentPaintFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/paint/view/six/NewNoteActivity;->paintFragment:Lcom/friday/paint/view/six/NewStudentPaintFragment;

    .line 2
    .line 3
    return-void
.end method

.method private final getViewModel()Lcom/friday/paint/viewmodel/NewNoteViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/view/six/NewNoteActivity;->viewModel$delegate:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method private final initFragment()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/friday/paint/view/six/NewNoteActivity$initFragment$1;

    .line 6
    .line 7
    invoke-direct {v1, p0}, Lcom/friday/paint/view/six/NewNoteActivity$initFragment$1;-><init>(Lcom/friday/paint/view/six/NewNoteActivity;)V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/FragmentManager;->registerFragmentLifecycleCallbacks(Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;Z)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v1, "NewNoteActivity_the_paint_fragment"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sget v2, Lcom/friday/paint/R$id;->paint_common_fragment:I

    .line 35
    .line 36
    new-instance v3, Lcom/friday/paint/view/six/NewStudentPaintFragment;

    .line 37
    .line 38
    invoke-direct {v3}, Lcom/friday/paint/view/six/NewStudentPaintFragment;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v2, v3, v1}, Landroidx/fragment/app/FragmentTransaction;->add(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/FragmentTransaction;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_0
    check-cast v0, Lcom/friday/paint/view/six/NewStudentPaintFragment;

    .line 50
    .line 51
    iput-object v0, p0, Lcom/friday/paint/view/six/NewNoteActivity;->paintFragment:Lcom/friday/paint/view/six/NewStudentPaintFragment;

    .line 52
    .line 53
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    if-eqz v0, :cond_1

    .line 58
    .line 59
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewNoteActivity;->getViewModel()Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->M()V

    .line 64
    .line 65
    .line 66
    :cond_1
    return-void
.end method

.method private final initViewModel()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewNoteActivity;->getViewModel()Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/friday/paint/view/six/NewNoteActivity;->fileId:Ljava/lang/String;

    .line 6
    .line 7
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v1, 0x0

    .line 16
    :goto_0
    invoke-virtual {v0, v1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->V(Z)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewNoteActivity;->getViewModel()Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v1, p0, Lcom/friday/paint/view/six/NewNoteActivity;->fileId:Ljava/lang/String;

    .line 24
    .line 25
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-nez v2, :cond_1

    .line 30
    .line 31
    invoke-static {}, Lk2/u;->a()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    const-string v2, "get32UUID(...)"

    .line 36
    .line 37
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    invoke-virtual {v0, v1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->X(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewNoteActivity;->getViewModel()Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sget-object v1, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 48
    .line 49
    invoke-virtual {v1}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v1}, Lcom/friday/common/helper/b;->l()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewNoteActivity;->getViewModel()Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v2}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->G()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    .line 66
    .line 67
    new-instance v4, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-virtual {v0, v1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->W(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewNoteActivity;->getViewModel()Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    iget-object v1, p0, Lcom/friday/paint/view/six/NewNoteActivity;->fileName:Ljava/lang/String;

    .line 93
    .line 94
    invoke-virtual {v0, v1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->Y(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewNoteActivity;->getViewModel()Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    iget-object v1, p0, Lcom/friday/paint/view/six/NewNoteActivity;->parentId:Ljava/lang/String;

    .line 102
    .line 103
    invoke-virtual {v0, v1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->a0(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewNoteActivity;->getViewModel()Lcom/friday/paint/viewmodel/NewNoteViewModel;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    iget-object v1, p0, Lcom/friday/paint/view/six/NewNoteActivity;->fromPage:Ljava/lang/String;

    .line 111
    .line 112
    invoke-virtual {v0, v1}, Lcom/friday/paint/viewmodel/NewNoteViewModel;->Z(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    return-void
.end method

.method private final isRestoreArgsMissing()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/view/six/NewNoteActivity;->fileId:Ljava/lang/String;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/friday/paint/view/six/NewNoteActivity;->parentId:Ljava/lang/String;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lcom/friday/paint/view/six/NewNoteActivity;->fileName:Ljava/lang/String;

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    iget-object v0, p0, Lcom/friday/paint/view/six/NewNoteActivity;->fromPage:Ljava/lang/String;

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    const/4 v0, 0x1

    .line 34
    return v0

    .line 35
    :cond_0
    const/4 v0, 0x0

    .line 36
    return v0
.end method


# virtual methods
.method public getLayoutId()I
    .locals 1

    .line 1
    # RE layout layout/res_fragment_note_detail (0x7f0c0141), APK res/pi.xml
    sget v0, Lcom/friday/paint/R$layout;->res_fragment_note_detail:I

    .line 2
    .line 3
    return v0
.end method

.method public initData()V
    .locals 0

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/friday/paint/view/six/Hilt_NewNoteActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/alibaba/android/arouter/launcher/ARouter;->getInstance()Lcom/alibaba/android/arouter/launcher/ARouter;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0, p0}, Lcom/alibaba/android/arouter/launcher/ARouter;->inject(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewNoteActivity;->isRestoreArgsMissing()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    const-string p1, "\u9875\u9762NewNoteActivity.kt -> onCreate, \u91cd\u5efa\u65f6\u8def\u7531\u53c2\u6570\u4e22\u5931\uff0c\u8fd4\u56de\u9996\u9875"

    .line 20
    .line 21
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    sget-object p1, Lcom/friday/common/helper/c;->a:Lcom/friday/common/helper/c;

    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/friday/common/helper/c;->c()V

    .line 31
    .line 32
    .line 33
    invoke-static {}, Lcom/blankj/utilcode/util/ActivityUtils;->finishAllActivities()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewNoteActivity;->initViewModel()V

    .line 38
    .line 39
    .line 40
    invoke-direct {p0}, Lcom/friday/paint/view/six/NewNoteActivity;->initFragment()V

    .line 41
    .line 42
    .line 43
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
