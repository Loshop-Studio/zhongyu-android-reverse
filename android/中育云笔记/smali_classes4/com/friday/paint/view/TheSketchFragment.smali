.class public final Lcom/friday/paint/view/TheSketchFragment;
.super Lcom/friday/paint/view/Hilt_TheSketchFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/paint/view/TheSketchFragment$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/friday/paint/view/Hilt_TheSketchFragment<",
        "Lcom/friday/paint/databinding/FragmentTheSketchBinding;",
        ">;"
    }
.end annotation


# static fields
.field public static final n:Lcom/friday/paint/view/TheSketchFragment$a;

.field public static final o:I


# instance fields
.field public i:Ljava/lang/String;

.field public final j:Lqc/d;

.field public final k:Lqc/d;

.field public l:Z

.field public final m:Landroidx/activity/result/ActivityResultLauncher;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/friday/paint/view/TheSketchFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/friday/paint/view/TheSketchFragment$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/friday/paint/view/TheSketchFragment;->n:Lcom/friday/paint/view/TheSketchFragment$a;

    const/16 v0, 0x8

    sput v0, Lcom/friday/paint/view/TheSketchFragment;->o:I

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/friday/paint/view/Hilt_TheSketchFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 5
    .line 6
    invoke-static {v0}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Lcom/friday/paint/view/TheSketchFragment$special$$inlined$activityViewModels$default$1;

    .line 11
    .line 12
    invoke-direct {v1, p0}, Lcom/friday/paint/view/TheSketchFragment$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/friday/paint/view/TheSketchFragment$special$$inlined$activityViewModels$default$2;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v2, v3, p0}, Lcom/friday/paint/view/TheSketchFragment$special$$inlined$activityViewModels$default$2;-><init>(Lhd/a;Landroidx/fragment/app/Fragment;)V

    .line 19
    .line 20
    .line 21
    new-instance v4, Lcom/friday/paint/view/TheSketchFragment$special$$inlined$activityViewModels$default$3;

    .line 22
    .line 23
    invoke-direct {v4, p0}, Lcom/friday/paint/view/TheSketchFragment$special$$inlined$activityViewModels$default$3;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, v0, v1, v2, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lod/c;Lhd/a;Lhd/a;Lhd/a;)Lqc/d;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lcom/friday/paint/view/TheSketchFragment;->j:Lqc/d;

    .line 31
    .line 32
    const-class v0, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 33
    .line 34
    invoke-static {v0}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    new-instance v1, Lcom/friday/paint/view/TheSketchFragment$special$$inlined$activityViewModels$default$4;

    .line 39
    .line 40
    invoke-direct {v1, p0}, Lcom/friday/paint/view/TheSketchFragment$special$$inlined$activityViewModels$default$4;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 41
    .line 42
    .line 43
    new-instance v2, Lcom/friday/paint/view/TheSketchFragment$special$$inlined$activityViewModels$default$5;

    .line 44
    .line 45
    invoke-direct {v2, v3, p0}, Lcom/friday/paint/view/TheSketchFragment$special$$inlined$activityViewModels$default$5;-><init>(Lhd/a;Landroidx/fragment/app/Fragment;)V

    .line 46
    .line 47
    .line 48
    new-instance v3, Lcom/friday/paint/view/TheSketchFragment$special$$inlined$activityViewModels$default$6;

    .line 49
    .line 50
    invoke-direct {v3, p0}, Lcom/friday/paint/view/TheSketchFragment$special$$inlined$activityViewModels$default$6;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 51
    .line 52
    .line 53
    invoke-static {p0, v0, v1, v2, v3}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lod/c;Lhd/a;Lhd/a;Lhd/a;)Lqc/d;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-object v0, p0, Lcom/friday/paint/view/TheSketchFragment;->k:Lqc/d;

    .line 58
    .line 59
    new-instance v0, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;

    .line 60
    .line 61
    invoke-direct {v0}, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;-><init>()V

    .line 62
    .line 63
    .line 64
    new-instance v1, Lc4/f1;

    .line 65
    .line 66
    invoke-direct {v1}, Lc4/f1;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    const-string v1, "registerForActivityResult(...)"

    .line 74
    .line 75
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    iput-object v0, p0, Lcom/friday/paint/view/TheSketchFragment;->m:Landroidx/activity/result/ActivityResultLauncher;

    .line 79
    .line 80
    return-void
.end method

.method public static synthetic A(Lcom/friday/paint/view/TheSketchFragment;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/TheSketchFragment;->h0(Lcom/friday/paint/view/TheSketchFragment;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic B(Lcom/friday/paint/view/TheSketchFragment;Lcom/zykj/sketch/core/data/Mode;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/TheSketchFragment;->W(Lcom/friday/paint/view/TheSketchFragment;Lcom/zykj/sketch/core/data/Mode;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C(Lcom/friday/paint/view/TheSketchFragment;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/TheSketchFragment;->i0(Lcom/friday/paint/view/TheSketchFragment;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic D(Landroidx/activity/result/ActivityResult;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/paint/view/TheSketchFragment;->S(Landroidx/activity/result/ActivityResult;)V

    return-void
.end method

.method public static synthetic E(Lcom/friday/paint/view/TheSketchFragment;Lcom/zykj/sketch/core/config/SketchConfig;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/TheSketchFragment;->e0(Lcom/friday/paint/view/TheSketchFragment;Lcom/zykj/sketch/core/config/SketchConfig;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic F(Lcom/friday/paint/view/TheSketchFragment;Ljava/lang/String;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/TheSketchFragment;->k0(Lcom/friday/paint/view/TheSketchFragment;Ljava/lang/String;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic G(Ljava/lang/String;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/paint/view/TheSketchFragment;->Y(Ljava/lang/String;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic H(Lcom/friday/paint/view/TheSketchFragment;Lkotlin/Pair;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/TheSketchFragment;->a0(Lcom/friday/paint/view/TheSketchFragment;Lkotlin/Pair;)V

    return-void
.end method

.method public static synthetic I(Lcom/friday/paint/view/TheSketchFragment;Lcom/zykj/sketch/core/config/GraphConfig;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/TheSketchFragment;->d0(Lcom/friday/paint/view/TheSketchFragment;Lcom/zykj/sketch/core/config/GraphConfig;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic J(Lcom/friday/paint/view/TheSketchFragment;)Landroidx/activity/result/ActivityResultLauncher;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/paint/view/TheSketchFragment;->m:Landroidx/activity/result/ActivityResultLauncher;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic K(Lcom/friday/paint/view/TheSketchFragment;)Lcom/friday/paint/databinding/FragmentTheSketchBinding;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/friday/paint/databinding/FragmentTheSketchBinding;

    .line 6
    .line 7
    return-object p0
.end method

.method public static final synthetic L(Lcom/friday/paint/view/TheSketchFragment;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/paint/view/TheSketchFragment;->i:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic M(Lcom/friday/paint/view/TheSketchFragment;)Lcom/friday/paint/viewmodel/NoteViewModel;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/friday/paint/view/TheSketchFragment;->V()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic N(Lcom/friday/paint/view/TheSketchFragment;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/friday/paint/view/TheSketchFragment;->l:Z

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic O(Lcom/friday/paint/view/TheSketchFragment;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/paint/view/TheSketchFragment;->l0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final Q(Lcom/zykj/sketch/core/graph/ImageGraph;)Lqc/q;
    .locals 0

    .line 1
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final R(Lcom/friday/paint/view/TheSketchFragment;Ljava/lang/String;)Lqc/q;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/friday/paint/view/TheSketchFragment;->checkImageSafety(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :cond_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 7
    .line 8
    return-object p0
.end method

.method public static final S(Landroidx/activity/result/ActivityResult;)V
    .locals 1

    .line 1
    const-string v0, "activityResult"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/activity/result/ActivityResult;->getResultCode()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/activity/result/ActivityResult;->getData()Landroid/content/Intent;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    const-string v0, "errorMsg"

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    new-array v0, v0, [Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {p0, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method private final V()Lcom/friday/paint/viewmodel/NoteViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/view/TheSketchFragment;->j:Lqc/d;

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

.method public static final W(Lcom/friday/paint/view/TheSketchFragment;Lcom/zykj/sketch/core/data/Mode;)Lqc/q;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/friday/paint/databinding/FragmentTheSketchBinding;

    .line 6
    .line 7
    iget-object p0, p0, Lcom/friday/paint/databinding/FragmentTheSketchBinding;->c:Lcom/zykj/sketch/core/record/SketchRecorderView;

    .line 8
    .line 9
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/core/record/SketchRecorderView;->setMode(Lcom/zykj/sketch/core/data/Mode;)V

    .line 13
    .line 14
    .line 15
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 16
    .line 17
    return-object p0
.end method

.method public static final X(Lcom/friday/paint/view/TheSketchFragment;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/friday/paint/databinding/FragmentTheSketchBinding;

    .line 6
    .line 7
    iget-object p0, p0, Lcom/friday/paint/databinding/FragmentTheSketchBinding;->c:Lcom/zykj/sketch/core/record/SketchRecorderView;

    .line 8
    .line 9
    new-instance p1, Lc4/h1;

    .line 10
    .line 11
    invoke-direct {p1}, Lc4/h1;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/core/record/SketchRecorderView;->getRecordPath(Lhd/l;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static final Y(Ljava/lang/String;)Lqc/q;
    .locals 1

    .line 1
    const-string p0, "submitHomework"

    .line 2
    .line 3
    invoke-static {p0}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-interface {p0, v0}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 12
    .line 13
    return-object p0
.end method

.method public static final Z(Lcom/friday/paint/view/TheSketchFragment;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lcom/friday/paint/view/TheSketchFragment;->P(Landroid/graphics/Bitmap;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static final a0(Lcom/friday/paint/view/TheSketchFragment;Lkotlin/Pair;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Lkotlin/Pair;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v0, v0, Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Lkotlin/Pair;->g()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    instance-of v0, v0, Landroid/graphics/Bitmap;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lcom/friday/paint/databinding/FragmentTheSketchBinding;

    .line 22
    .line 23
    iget-object v1, v0, Lcom/friday/paint/databinding/FragmentTheSketchBinding;->c:Lcom/zykj/sketch/core/record/SketchRecorderView;

    .line 24
    .line 25
    invoke-virtual {p1}, Lkotlin/Pair;->g()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v2, "null cannot be cast to non-null type android.graphics.Bitmap"

    .line 30
    .line 31
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    move-object v2, v0

    .line 35
    check-cast v2, Landroid/graphics/Bitmap;

    .line 36
    .line 37
    invoke-virtual {p1}, Lkotlin/Pair;->f()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    const-string v0, "null cannot be cast to non-null type kotlin.String"

    .line 42
    .line 43
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    check-cast p1, Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 49
    .line 50
    .line 51
    move-result-wide v3

    .line 52
    new-instance v0, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string p1, "screenCapture"

    .line 61
    .line 62
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    new-instance v6, Lc4/i1;

    .line 73
    .line 74
    invoke-direct {v6}, Lc4/i1;-><init>()V

    .line 75
    .line 76
    .line 77
    new-instance v7, Lc4/j1;

    .line 78
    .line 79
    invoke-direct {v7, p0}, Lc4/j1;-><init>(Lcom/friday/paint/view/TheSketchFragment;)V

    .line 80
    .line 81
    .line 82
    const/4 v4, 0x0

    .line 83
    const/16 v5, 0x17

    .line 84
    .line 85
    invoke-virtual/range {v1 .. v7}, Lcom/zykj/sketch/core/record/SketchRecorderView;->addImage(Landroid/graphics/Bitmap;Ljava/lang/String;IILhd/l;Lhd/l;)V

    .line 86
    .line 87
    .line 88
    :cond_0
    return-void
.end method

.method public static final b0(Lcom/zykj/sketch/core/graph/ImageGraph;)Lqc/q;
    .locals 0

    .line 1
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final c0(Lcom/friday/paint/view/TheSketchFragment;Ljava/lang/String;)Lqc/q;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/friday/paint/view/TheSketchFragment;->checkImageSafety(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :cond_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 7
    .line 8
    return-object p0
.end method

.method public static final d0(Lcom/friday/paint/view/TheSketchFragment;Lcom/zykj/sketch/core/config/GraphConfig;)Lqc/q;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/friday/paint/databinding/FragmentTheSketchBinding;

    .line 6
    .line 7
    iget-object p0, p0, Lcom/friday/paint/databinding/FragmentTheSketchBinding;->c:Lcom/zykj/sketch/core/record/SketchRecorderView;

    .line 8
    .line 9
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/core/record/SketchRecorderView;->setGraphConfig(Lcom/zykj/sketch/core/config/GraphConfig;)V

    .line 13
    .line 14
    .line 15
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 16
    .line 17
    return-object p0
.end method

.method public static final e0(Lcom/friday/paint/view/TheSketchFragment;Lcom/zykj/sketch/core/config/SketchConfig;)Lqc/q;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/paint/databinding/FragmentTheSketchBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/friday/paint/databinding/FragmentTheSketchBinding;->c:Lcom/zykj/sketch/core/record/SketchRecorderView;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/zykj/sketch/core/record/SketchRecorderView;->getConfig()Lcom/zykj/sketch/core/config/SketchConfig;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p1}, Lcom/zykj/sketch/core/config/SketchConfig;->isTouchable()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-virtual {v0, p1}, Lcom/zykj/sketch/core/config/SketchConfig;->setTouchable(Z)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Lcom/friday/paint/databinding/FragmentTheSketchBinding;

    .line 25
    .line 26
    iget-object p1, p1, Lcom/friday/paint/databinding/FragmentTheSketchBinding;->c:Lcom/zykj/sketch/core/record/SketchRecorderView;

    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/zykj/sketch/core/record/SketchRecorderView;->getConfig()Lcom/zykj/sketch/core/config/SketchConfig;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const/4 v0, 0x5

    .line 33
    invoke-virtual {p1, v0}, Lcom/zykj/sketch/core/config/SketchConfig;->setMaxImageCount(I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Lcom/friday/paint/databinding/FragmentTheSketchBinding;

    .line 41
    .line 42
    iget-object p1, p1, Lcom/friday/paint/databinding/FragmentTheSketchBinding;->c:Lcom/zykj/sketch/core/record/SketchRecorderView;

    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/zykj/sketch/core/record/SketchRecorderView;->getConfig()Lcom/zykj/sketch/core/config/SketchConfig;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iget-object p0, p0, Lcom/friday/paint/view/TheSketchFragment;->i:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {p0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, p0}, Lcom/zykj/sketch/core/config/SketchConfig;->setSourcePath(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 57
    .line 58
    return-object p0
.end method

.method public static final f0(Lcom/friday/paint/view/TheSketchFragment;Ljava/lang/Boolean;)Lqc/q;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isResumed()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-virtual {p0, p1}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/friday/paint/view/TheSketchFragment;->T()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lcom/friday/paint/databinding/FragmentTheSketchBinding;

    .line 19
    .line 20
    iget-object p1, p1, Lcom/friday/paint/databinding/FragmentTheSketchBinding;->c:Lcom/zykj/sketch/core/record/SketchRecorderView;

    .line 21
    .line 22
    new-instance v0, Lc4/g1;

    .line 23
    .line 24
    invoke-direct {v0, p0}, Lc4/g1;-><init>(Lcom/friday/paint/view/TheSketchFragment;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v0}, Lcom/zykj/sketch/core/record/SketchRecorderView;->getRecordPath(Lhd/l;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 31
    .line 32
    return-object p0
.end method

.method public static final g0(Lcom/friday/paint/view/TheSketchFragment;Ljava/lang/String;)Lqc/q;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/friday/paint/view/TheSketchFragment;->V()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-virtual {p0, p1}, Lcom/friday/paint/viewmodel/NoteViewModel;->W(Z)V

    .line 7
    .line 8
    .line 9
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 10
    .line 11
    return-object p0
.end method

.method public static final h0(Lcom/friday/paint/view/TheSketchFragment;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/view/TheSketchFragment;->i:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Lcom/friday/paint/databinding/FragmentTheSketchBinding;

    .line 14
    .line 15
    iget-object p0, p0, Lcom/friday/paint/databinding/FragmentTheSketchBinding;->c:Lcom/zykj/sketch/core/record/SketchRecorderView;

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/zykj/sketch/core/record/SketchRecorderView;->clear()V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public static final i0(Lcom/friday/paint/view/TheSketchFragment;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/friday/paint/databinding/FragmentTheSketchBinding;

    .line 6
    .line 7
    iget-object p0, p0, Lcom/friday/paint/databinding/FragmentTheSketchBinding;->c:Lcom/zykj/sketch/core/record/SketchRecorderView;

    .line 8
    .line 9
    new-instance p1, Lc4/m1;

    .line 10
    .line 11
    invoke-direct {p1}, Lc4/m1;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/core/record/SketchRecorderView;->getRecordPath(Lhd/l;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static final j0(Ljava/lang/String;)Lqc/q;
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    const-string p0, "updateCurrentThumbnailSuccess"

    .line 4
    .line 5
    invoke-static {p0}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-interface {p0, v0}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 14
    .line 15
    return-object p0
.end method

.method public static final k0(Lcom/friday/paint/view/TheSketchFragment;Ljava/lang/String;)Lqc/q;
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/friday/paint/view/TheSketchFragment;->V()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance v0, Ljava/io/File;

    .line 6
    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string p1, "/thumbnail.jpg"

    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v0}, Lcom/friday/paint/viewmodel/NoteViewModel;->P(Ljava/io/File;)V

    .line 28
    .line 29
    .line 30
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 31
    .line 32
    return-object p0
.end method

.method public static synthetic r(Lcom/friday/paint/view/TheSketchFragment;Ljava/lang/String;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/TheSketchFragment;->R(Lcom/friday/paint/view/TheSketchFragment;Ljava/lang/String;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lcom/zykj/sketch/core/graph/ImageGraph;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/paint/view/TheSketchFragment;->b0(Lcom/zykj/sketch/core/graph/ImageGraph;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Lcom/zykj/sketch/core/graph/ImageGraph;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/paint/view/TheSketchFragment;->Q(Lcom/zykj/sketch/core/graph/ImageGraph;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Lcom/friday/paint/view/TheSketchFragment;Ljava/lang/String;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/TheSketchFragment;->c0(Lcom/friday/paint/view/TheSketchFragment;Ljava/lang/String;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v(Lcom/friday/paint/view/TheSketchFragment;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/TheSketchFragment;->X(Lcom/friday/paint/view/TheSketchFragment;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic w(Lcom/friday/paint/view/TheSketchFragment;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/TheSketchFragment;->Z(Lcom/friday/paint/view/TheSketchFragment;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public static synthetic x(Lcom/friday/paint/view/TheSketchFragment;Ljava/lang/String;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/TheSketchFragment;->g0(Lcom/friday/paint/view/TheSketchFragment;Ljava/lang/String;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic y(Ljava/lang/String;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/paint/view/TheSketchFragment;->j0(Ljava/lang/String;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/friday/paint/view/TheSketchFragment;Ljava/lang/Boolean;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/TheSketchFragment;->f0(Lcom/friday/paint/view/TheSketchFragment;Ljava/lang/Boolean;)Lqc/q;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final P(Landroid/graphics/Bitmap;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/paint/databinding/FragmentTheSketchBinding;

    .line 6
    .line 7
    iget-object v1, v0, Lcom/friday/paint/databinding/FragmentTheSketchBinding;->c:Lcom/zykj/sketch/core/record/SketchRecorderView;

    .line 8
    .line 9
    new-instance v5, Lc4/k1;

    .line 10
    .line 11
    invoke-direct {v5}, Lc4/k1;-><init>()V

    .line 12
    .line 13
    .line 14
    new-instance v6, Lc4/l1;

    .line 15
    .line 16
    invoke-direct {v6, p0}, Lc4/l1;-><init>(Lcom/friday/paint/view/TheSketchFragment;)V

    .line 17
    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    const/16 v4, 0x17

    .line 21
    .line 22
    move-object v2, p1

    .line 23
    invoke-virtual/range {v1 .. v6}, Lcom/zykj/sketch/core/record/SketchRecorderView;->addImage(Landroid/graphics/Bitmap;IILhd/l;Lhd/l;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final T()V
    .locals 14

    .line 1
    invoke-virtual {p0}, Lcom/friday/paint/view/TheSketchFragment;->U()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->k()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_3

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/friday/paint/view/TheSketchFragment;->U()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->g()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_3

    .line 20
    .line 21
    invoke-static {}, Lcom/blankj/utilcode/util/CacheMemoryUtils;->getInstance()Lcom/blankj/utilcode/util/CacheMemoryUtils;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v1, "answer_cache"

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/CacheMemoryUtils;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Lcom/friday/common/entity/AnswerCache;

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    goto :goto_3

    .line 36
    :cond_0
    invoke-virtual {p0}, Lcom/friday/paint/view/TheSketchFragment;->U()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-static {}, Lcom/blankj/utilcode/util/CacheMemoryUtils;->getInstance()Lcom/blankj/utilcode/util/CacheMemoryUtils;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    new-instance v3, Lcom/friday/common/entity/AnswerCache;

    .line 45
    .line 46
    invoke-virtual {v0}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->o()I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    invoke-virtual {v0}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->p()I

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    invoke-virtual {v0}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->r()Z

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    invoke-virtual {v0}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->n()I

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    invoke-virtual {v0}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->i()Z

    .line 63
    .line 64
    .line 65
    move-result v8

    .line 66
    invoke-virtual {v0}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->k()Z

    .line 67
    .line 68
    .line 69
    move-result v9

    .line 70
    invoke-virtual {v0}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->j()Landroidx/lifecycle/MutableLiveData;

    .line 71
    .line 72
    .line 73
    move-result-object v10

    .line 74
    invoke-virtual {v10}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v10

    .line 78
    check-cast v10, Ljava/lang/Boolean;

    .line 79
    .line 80
    invoke-virtual {v0}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->f()Ljava/util/ArrayList;

    .line 81
    .line 82
    .line 83
    move-result-object v11

    .line 84
    invoke-virtual {p0}, Lcom/friday/paint/view/TheSketchFragment;->U()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 85
    .line 86
    .line 87
    move-result-object v12

    .line 88
    invoke-virtual {v12}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->p()I

    .line 89
    .line 90
    .line 91
    move-result v12

    .line 92
    if-nez v12, :cond_1

    .line 93
    .line 94
    const/4 v12, 0x1

    .line 95
    goto :goto_0

    .line 96
    :cond_1
    const/4 v12, 0x0

    .line 97
    :goto_0
    invoke-virtual {v0}, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;->l()Lcom/friday/common/classtest/MqttResponse;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    if-eqz v0, :cond_2

    .line 102
    .line 103
    invoke-virtual {v0}, Lcom/friday/common/classtest/MqttResponse;->getGuid()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    :goto_1
    move-object v13, v0

    .line 108
    goto :goto_2

    .line 109
    :cond_2
    const/4 v0, 0x0

    .line 110
    goto :goto_1

    .line 111
    :goto_2
    invoke-direct/range {v3 .. v13}, Lcom/friday/common/entity/AnswerCache;-><init>(IIZIZZLjava/lang/Boolean;Ljava/util/ArrayList;ZLjava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2, v1, v3}, Lcom/blankj/utilcode/util/CacheMemoryUtils;->put(Ljava/lang/String;Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    :cond_3
    :goto_3
    return-void
.end method

.method public final U()Lcom/friday/paint/viewmodel/DoHomeworkViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/view/TheSketchFragment;->k:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/paint/viewmodel/DoHomeworkViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public final checkImageSafety(Ljava/lang/String;)V
    .locals 7

    .line 1
    sget-object v0, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/friday/common/helper/b;->v()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    new-instance v4, Lcom/friday/paint/view/TheSketchFragment$checkImageSafety$1;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-direct {v4, p0, p1, v0}, Lcom/friday/paint/view/TheSketchFragment$checkImageSafety$1;-><init>(Lcom/friday/paint/view/TheSketchFragment;Ljava/lang/String;Lvc/c;)V

    .line 21
    .line 22
    .line 23
    const/4 v5, 0x3

    .line 24
    const/4 v6, 0x0

    .line 25
    const/4 v2, 0x0

    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public getLayoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/friday/paint/R$layout;->fragment_the_sketch:I

    .line 2
    .line 3
    return v0
.end method

.method public initData()V
    .locals 14

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v2, "path"

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, v1

    .line 16
    :goto_0
    iput-object v0, p0, Lcom/friday/paint/view/TheSketchFragment;->i:Ljava/lang/String;

    .line 17
    .line 18
    if-eqz v0, :cond_4

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    goto/16 :goto_2

    .line 27
    .line 28
    :cond_1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Lcom/friday/paint/databinding/FragmentTheSketchBinding;

    .line 33
    .line 34
    iget-object v0, v0, Lcom/friday/paint/databinding/FragmentTheSketchBinding;->c:Lcom/zykj/sketch/core/record/SketchRecorderView;

    .line 35
    .line 36
    new-instance v2, Lcom/friday/paint/view/TheSketchFragment$initData$1;

    .line 37
    .line 38
    invoke-direct {v2, p0}, Lcom/friday/paint/view/TheSketchFragment$initData$1;-><init>(Lcom/friday/paint/view/TheSketchFragment;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v2}, Lcom/zykj/sketch/core/record/SketchRecorderView;->setImageDeleteListener(Lcom/zykj/sketch/core/listener/ImageDeleteListener;)V

    .line 42
    .line 43
    .line 44
    invoke-direct {p0}, Lcom/friday/paint/view/TheSketchFragment;->V()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Lcom/friday/paint/viewmodel/NoteViewModel;->L()Landroidx/lifecycle/MutableLiveData;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    new-instance v3, Lc4/e1;

    .line 57
    .line 58
    invoke-direct {v3, p0}, Lc4/e1;-><init>(Lcom/friday/paint/view/TheSketchFragment;)V

    .line 59
    .line 60
    .line 61
    new-instance v4, Lcom/friday/paint/view/TheSketchFragment$b;

    .line 62
    .line 63
    invoke-direct {v4, v3}, Lcom/friday/paint/view/TheSketchFragment$b;-><init>(Lhd/l;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v2, v4}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 67
    .line 68
    .line 69
    invoke-direct {p0}, Lcom/friday/paint/view/TheSketchFragment;->V()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v0}, Lcom/friday/paint/viewmodel/NoteViewModel;->E()Landroidx/lifecycle/MutableLiveData;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    new-instance v3, Lc4/n1;

    .line 82
    .line 83
    invoke-direct {v3, p0}, Lc4/n1;-><init>(Lcom/friday/paint/view/TheSketchFragment;)V

    .line 84
    .line 85
    .line 86
    new-instance v4, Lcom/friday/paint/view/TheSketchFragment$b;

    .line 87
    .line 88
    invoke-direct {v4, v3}, Lcom/friday/paint/view/TheSketchFragment$b;-><init>(Lhd/l;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v2, v4}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 92
    .line 93
    .line 94
    invoke-direct {p0}, Lcom/friday/paint/view/TheSketchFragment;->V()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v0}, Lcom/friday/paint/viewmodel/NoteViewModel;->K()Landroidx/lifecycle/MutableLiveData;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    new-instance v3, Lc4/o1;

    .line 107
    .line 108
    invoke-direct {v3, p0}, Lc4/o1;-><init>(Lcom/friday/paint/view/TheSketchFragment;)V

    .line 109
    .line 110
    .line 111
    new-instance v4, Lcom/friday/paint/view/TheSketchFragment$b;

    .line 112
    .line 113
    invoke-direct {v4, v3}, Lcom/friday/paint/view/TheSketchFragment$b;-><init>(Lhd/l;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v2, v4}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 117
    .line 118
    .line 119
    const/4 v0, 0x1

    .line 120
    invoke-virtual {p0, v0}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 121
    .line 122
    .line 123
    const/4 v0, 0x0

    .line 124
    iput-boolean v0, p0, Lcom/friday/paint/view/TheSketchFragment;->l:Z

    .line 125
    .line 126
    iget-object v0, p0, Lcom/friday/paint/view/TheSketchFragment;->i:Ljava/lang/String;

    .line 127
    .line 128
    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->listFilesInDir(Ljava/lang/String;)Ljava/util/List;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    const-string v2, "listFilesInDir(...)"

    .line 133
    .line 134
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    check-cast v0, Ljava/util/Collection;

    .line 138
    .line 139
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    if-nez v0, :cond_2

    .line 144
    .line 145
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    new-instance v5, Lcom/friday/paint/view/TheSketchFragment$initData$5;

    .line 150
    .line 151
    invoke-direct {v5, p0, v1}, Lcom/friday/paint/view/TheSketchFragment$initData$5;-><init>(Lcom/friday/paint/view/TheSketchFragment;Lvc/c;)V

    .line 152
    .line 153
    .line 154
    const/4 v6, 0x3

    .line 155
    const/4 v7, 0x0

    .line 156
    const/4 v3, 0x0

    .line 157
    const/4 v4, 0x0

    .line 158
    invoke-static/range {v2 .. v7}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 159
    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_2
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 163
    .line 164
    .line 165
    move-result-object v8

    .line 166
    new-instance v11, Lcom/friday/paint/view/TheSketchFragment$initData$6;

    .line 167
    .line 168
    invoke-direct {v11, p0, v1}, Lcom/friday/paint/view/TheSketchFragment$initData$6;-><init>(Lcom/friday/paint/view/TheSketchFragment;Lvc/c;)V

    .line 169
    .line 170
    .line 171
    const/4 v12, 0x3

    .line 172
    const/4 v13, 0x0

    .line 173
    const/4 v9, 0x0

    .line 174
    const/4 v10, 0x0

    .line 175
    invoke-static/range {v8 .. v13}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 176
    .line 177
    .line 178
    :goto_1
    invoke-direct {p0}, Lcom/friday/paint/view/TheSketchFragment;->V()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-virtual {v0}, Lcom/friday/paint/viewmodel/NoteViewModel;->A()Landroidx/lifecycle/MutableLiveData;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    new-instance v3, Lc4/p1;

    .line 191
    .line 192
    invoke-direct {v3, p0}, Lc4/p1;-><init>(Lcom/friday/paint/view/TheSketchFragment;)V

    .line 193
    .line 194
    .line 195
    new-instance v4, Lcom/friday/paint/view/TheSketchFragment$b;

    .line 196
    .line 197
    invoke-direct {v4, v3}, Lcom/friday/paint/view/TheSketchFragment$b;-><init>(Lhd/l;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v0, v2, v4}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    const-string v2, "getViewLifecycleOwner(...)"

    .line 208
    .line 209
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    new-instance v6, Lcom/friday/paint/view/TheSketchFragment$initData$8;

    .line 217
    .line 218
    invoke-direct {v6, p0, v1}, Lcom/friday/paint/view/TheSketchFragment$initData$8;-><init>(Lcom/friday/paint/view/TheSketchFragment;Lvc/c;)V

    .line 219
    .line 220
    .line 221
    const/4 v7, 0x3

    .line 222
    const/4 v8, 0x0

    .line 223
    const/4 v4, 0x0

    .line 224
    const/4 v5, 0x0

    .line 225
    invoke-static/range {v3 .. v8}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 226
    .line 227
    .line 228
    const-string v0, "clearBoard"

    .line 229
    .line 230
    invoke-static {v0}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    new-instance v2, Lc4/q1;

    .line 239
    .line 240
    invoke-direct {v2, p0}, Lc4/q1;-><init>(Lcom/friday/paint/view/TheSketchFragment;)V

    .line 241
    .line 242
    .line 243
    invoke-interface {v0, v1, v2}, Lcom/jeremyliao/liveeventbus/core/Observable;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 244
    .line 245
    .line 246
    const-string v0, "updateCurrentThumbnail"

    .line 247
    .line 248
    invoke-static {v0}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    new-instance v2, Lc4/r1;

    .line 257
    .line 258
    invoke-direct {v2, p0}, Lc4/r1;-><init>(Lcom/friday/paint/view/TheSketchFragment;)V

    .line 259
    .line 260
    .line 261
    invoke-interface {v0, v1, v2}, Lcom/jeremyliao/liveeventbus/core/Observable;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 262
    .line 263
    .line 264
    const-string v0, "updateThumbnailForHomework"

    .line 265
    .line 266
    invoke-static {v0}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    new-instance v2, Lc4/s1;

    .line 275
    .line 276
    invoke-direct {v2, p0}, Lc4/s1;-><init>(Lcom/friday/paint/view/TheSketchFragment;)V

    .line 277
    .line 278
    .line 279
    invoke-interface {v0, v1, v2}, Lcom/jeremyliao/liveeventbus/core/Observable;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 280
    .line 281
    .line 282
    const-string v0, "addBitmap"

    .line 283
    .line 284
    const-class v1, Landroid/graphics/Bitmap;

    .line 285
    .line 286
    invoke-static {v0, v1}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    new-instance v2, Lc4/t1;

    .line 295
    .line 296
    invoke-direct {v2, p0}, Lc4/t1;-><init>(Lcom/friday/paint/view/TheSketchFragment;)V

    .line 297
    .line 298
    .line 299
    invoke-interface {v0, v1, v2}, Lcom/jeremyliao/liveeventbus/core/Observable;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 300
    .line 301
    .line 302
    const-string v0, "ScreenCaptureImage"

    .line 303
    .line 304
    const-class v1, Lkotlin/Pair;

    .line 305
    .line 306
    invoke-static {v0, v1}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    new-instance v2, Lc4/u1;

    .line 315
    .line 316
    invoke-direct {v2, p0}, Lc4/u1;-><init>(Lcom/friday/paint/view/TheSketchFragment;)V

    .line 317
    .line 318
    .line 319
    invoke-interface {v0, v1, v2}, Lcom/jeremyliao/liveeventbus/core/Observable;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 320
    .line 321
    .line 322
    invoke-direct {p0}, Lcom/friday/paint/view/TheSketchFragment;->V()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    invoke-virtual {v0}, Lcom/friday/paint/viewmodel/NoteViewModel;->F()Ljava/util/HashMap;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 331
    .line 332
    .line 333
    move-result v0

    .line 334
    if-nez v0, :cond_3

    .line 335
    .line 336
    invoke-direct {p0}, Lcom/friday/paint/view/TheSketchFragment;->V()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    invoke-virtual {v0}, Lcom/friday/paint/viewmodel/NoteViewModel;->F()Ljava/util/HashMap;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    iget-object v1, p0, Lcom/friday/paint/view/TheSketchFragment;->i:Ljava/lang/String;

    .line 345
    .line 346
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    check-cast v0, Landroid/graphics/Bitmap;

    .line 351
    .line 352
    if-eqz v0, :cond_3

    .line 353
    .line 354
    invoke-virtual {p0, v0}, Lcom/friday/paint/view/TheSketchFragment;->P(Landroid/graphics/Bitmap;)V

    .line 355
    .line 356
    .line 357
    :cond_3
    return-void

    .line 358
    :cond_4
    :goto_2
    const-string v0, "\u8be5\u9875\u7b14\u8bb0\u5df2\u635f\u574f"

    .line 359
    .line 360
    invoke-static {v0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 361
    .line 362
    .line 363
    return-void
.end method

.method public final l0()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/friday/paint/view/TheSketchFragment;->V()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/friday/paint/viewmodel/NoteViewModel;->L()Landroidx/lifecycle/MutableLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lcom/zykj/sketch/core/data/Mode;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lcom/friday/paint/databinding/FragmentTheSketchBinding;

    .line 22
    .line 23
    iget-object v1, v1, Lcom/friday/paint/databinding/FragmentTheSketchBinding;->c:Lcom/zykj/sketch/core/record/SketchRecorderView;

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Lcom/zykj/sketch/core/record/SketchRecorderView;->setMode(Lcom/zykj/sketch/core/data/Mode;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-direct {p0}, Lcom/friday/paint/view/TheSketchFragment;->V()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Lcom/friday/paint/viewmodel/NoteViewModel;->E()Landroidx/lifecycle/MutableLiveData;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Lcom/zykj/sketch/core/config/GraphConfig;

    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Lcom/friday/paint/databinding/FragmentTheSketchBinding;

    .line 49
    .line 50
    iget-object v1, v1, Lcom/friday/paint/databinding/FragmentTheSketchBinding;->c:Lcom/zykj/sketch/core/record/SketchRecorderView;

    .line 51
    .line 52
    invoke-virtual {v1, v0}, Lcom/zykj/sketch/core/record/SketchRecorderView;->setGraphConfig(Lcom/zykj/sketch/core/config/GraphConfig;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    invoke-direct {p0}, Lcom/friday/paint/view/TheSketchFragment;->V()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, Lcom/friday/paint/viewmodel/NoteViewModel;->K()Landroidx/lifecycle/MutableLiveData;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    check-cast v0, Lcom/zykj/sketch/core/config/SketchConfig;

    .line 68
    .line 69
    if-eqz v0, :cond_2

    .line 70
    .line 71
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    check-cast v1, Lcom/friday/paint/databinding/FragmentTheSketchBinding;

    .line 76
    .line 77
    iget-object v1, v1, Lcom/friday/paint/databinding/FragmentTheSketchBinding;->c:Lcom/zykj/sketch/core/record/SketchRecorderView;

    .line 78
    .line 79
    invoke-virtual {v1}, Lcom/zykj/sketch/core/record/SketchRecorderView;->getConfig()Lcom/zykj/sketch/core/config/SketchConfig;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {v0}, Lcom/zykj/sketch/core/config/SketchConfig;->isTouchable()Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    invoke-virtual {v1, v0}, Lcom/zykj/sketch/core/config/SketchConfig;->setTouchable(Z)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, Lcom/friday/paint/databinding/FragmentTheSketchBinding;

    .line 95
    .line 96
    iget-object v0, v0, Lcom/friday/paint/databinding/FragmentTheSketchBinding;->c:Lcom/zykj/sketch/core/record/SketchRecorderView;

    .line 97
    .line 98
    invoke-virtual {v0}, Lcom/zykj/sketch/core/record/SketchRecorderView;->getConfig()Lcom/zykj/sketch/core/config/SketchConfig;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    const/4 v1, 0x5

    .line 103
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/core/config/SketchConfig;->setMaxImageCount(I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    check-cast v0, Lcom/friday/paint/databinding/FragmentTheSketchBinding;

    .line 111
    .line 112
    iget-object v0, v0, Lcom/friday/paint/databinding/FragmentTheSketchBinding;->c:Lcom/zykj/sketch/core/record/SketchRecorderView;

    .line 113
    .line 114
    invoke-virtual {v0}, Lcom/zykj/sketch/core/record/SketchRecorderView;->getConfig()Lcom/zykj/sketch/core/config/SketchConfig;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    iget-object v1, p0, Lcom/friday/paint/view/TheSketchFragment;->i:Ljava/lang/String;

    .line 119
    .line 120
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/core/config/SketchConfig;->setSourcePath(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    :cond_2
    return-void
.end method

.method public onPause()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/friday/paint/view/TheSketchFragment;->l:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lcom/friday/paint/databinding/FragmentTheSketchBinding;

    .line 10
    .line 11
    iget-object v0, v0, Lcom/friday/paint/databinding/FragmentTheSketchBinding;->c:Lcom/zykj/sketch/core/record/SketchRecorderView;

    .line 12
    .line 13
    new-instance v1, Lc4/v1;

    .line 14
    .line 15
    invoke-direct {v1, p0}, Lc4/v1;-><init>(Lcom/friday/paint/view/TheSketchFragment;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lcom/zykj/sketch/core/record/SketchRecorderView;->getRecordPath(Lhd/l;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onPause()V

    .line 22
    .line 23
    .line 24
    return-void
.end method
