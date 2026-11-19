.class public final Lcom/zykj/study/dialog/ExerciseFinishDialog;
.super Lcom/zykj/base/BaseDialogFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/dialog/ExerciseFinishDialog$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/base/BaseDialogFragment<",
        "Lcom/zykj/study/databinding/DialogExerciseFinishBinding;",
        ">;"
    }
.end annotation


# static fields
.field public static final d:Lcom/zykj/study/dialog/ExerciseFinishDialog$a;

.field public static final e:I


# instance fields
.field public final a:Lh7/d;

.field public final b:Lh7/d;

.field public final c:Lh7/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/study/dialog/ExerciseFinishDialog$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/study/dialog/ExerciseFinishDialog$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/study/dialog/ExerciseFinishDialog;->d:Lcom/zykj/study/dialog/ExerciseFinishDialog$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/study/dialog/ExerciseFinishDialog;->e:I

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/zykj/base/BaseDialogFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lp4/q;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lp4/q;-><init>(Lcom/zykj/study/dialog/ExerciseFinishDialog;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lkotlin/a;->b(Lx7/a;)Lh7/d;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/zykj/study/dialog/ExerciseFinishDialog;->a:Lh7/d;

    .line 14
    .line 15
    new-instance v0, Lp4/r;

    .line 16
    .line 17
    invoke-direct {v0, p0}, Lp4/r;-><init>(Lcom/zykj/study/dialog/ExerciseFinishDialog;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Lkotlin/a;->b(Lx7/a;)Lh7/d;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iput-object v0, p0, Lcom/zykj/study/dialog/ExerciseFinishDialog;->b:Lh7/d;

    .line 25
    .line 26
    const-class v0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 27
    .line 28
    invoke-static {v0}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v1, Lcom/zykj/study/dialog/ExerciseFinishDialog$special$$inlined$activityViewModels$default$1;

    .line 33
    .line 34
    invoke-direct {v1, p0}, Lcom/zykj/study/dialog/ExerciseFinishDialog$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 35
    .line 36
    .line 37
    new-instance v2, Lcom/zykj/study/dialog/ExerciseFinishDialog$special$$inlined$activityViewModels$default$2;

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    invoke-direct {v2, v3, p0}, Lcom/zykj/study/dialog/ExerciseFinishDialog$special$$inlined$activityViewModels$default$2;-><init>(Lx7/a;Landroidx/fragment/app/Fragment;)V

    .line 41
    .line 42
    .line 43
    new-instance v3, Lcom/zykj/study/dialog/ExerciseFinishDialog$special$$inlined$activityViewModels$default$3;

    .line 44
    .line 45
    invoke-direct {v3, p0}, Lcom/zykj/study/dialog/ExerciseFinishDialog$special$$inlined$activityViewModels$default$3;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 46
    .line 47
    .line 48
    invoke-static {p0, v0, v1, v2, v3}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iput-object v0, p0, Lcom/zykj/study/dialog/ExerciseFinishDialog;->c:Lh7/d;

    .line 53
    .line 54
    return-void
.end method

.method public static synthetic f(Lcom/zykj/study/dialog/ExerciseFinishDialog;Lcom/google/android/material/tabs/TabLayout$Tab;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/dialog/ExerciseFinishDialog;->q(Lcom/zykj/study/dialog/ExerciseFinishDialog;Lcom/google/android/material/tabs/TabLayout$Tab;I)V

    return-void
.end method

.method public static synthetic g(Lcom/zykj/study/dialog/ExerciseFinishDialog;)F
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/dialog/ExerciseFinishDialog;->t(Lcom/zykj/study/dialog/ExerciseFinishDialog;)F

    move-result p0

    return p0
.end method

.method public static synthetic h(Lcom/zykj/study/dialog/ExerciseFinishDialog;)F
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/dialog/ExerciseFinishDialog;->s(Lcom/zykj/study/dialog/ExerciseFinishDialog;)F

    move-result p0

    return p0
.end method

.method public static synthetic i(Lcom/zykj/study/dialog/ExerciseFinishDialog;Landroid/view/View;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/dialog/ExerciseFinishDialog;->r(Lcom/zykj/study/dialog/ExerciseFinishDialog;Landroid/view/View;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic j(Lcom/zykj/study/dialog/ExerciseFinishDialog;)F
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/dialog/ExerciseFinishDialog;->m()F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic k(Lcom/zykj/study/dialog/ExerciseFinishDialog;)F
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/dialog/ExerciseFinishDialog;->n()F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic l(Lcom/zykj/study/dialog/ExerciseFinishDialog;)Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/dialog/ExerciseFinishDialog;->o()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final q(Lcom/zykj/study/dialog/ExerciseFinishDialog;Lcom/google/android/material/tabs/TabLayout$Tab;I)V
    .locals 3

    .line 1
    const-string v0, "tab"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getLayoutInflater()Landroid/view/LayoutInflater;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, Lcom/zykj/study/databinding/ItemStuTabBinding;->inflate(Landroid/view/LayoutInflater;)Lcom/zykj/study/databinding/ItemStuTabBinding;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "inflate(...)"

    .line 15
    .line 16
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {p1, v1}, Lcom/google/android/material/tabs/TabLayout$Tab;->setCustomView(Landroid/view/View;)Lcom/google/android/material/tabs/TabLayout$Tab;

    .line 24
    .line 25
    .line 26
    iget-object p1, v0, Lcom/zykj/study/databinding/ItemStuTabBinding;->tvContent:Landroid/widget/TextView;

    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/zykj/study/dialog/ExerciseFinishDialog;->n()F

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-virtual {p1, v2, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 34
    .line 35
    .line 36
    iget-object p1, v0, Lcom/zykj/study/databinding/ItemStuTabBinding;->tvContent:Landroid/widget/TextView;

    .line 37
    .line 38
    if-nez p2, :cond_0

    .line 39
    .line 40
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    sget v0, Lcom/zykj/study/R$string;->exercise_finish:I

    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/zykj/study/dialog/ExerciseFinishDialog;->o()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    const/4 v1, 0x1

    .line 51
    invoke-virtual {p0, v1}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->n(Z)Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-virtual {p2, v0, p0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    goto :goto_0

    .line 72
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    sget v0, Lcom/zykj/study/R$string;->exercise_unfinish:I

    .line 77
    .line 78
    invoke-virtual {p0}, Lcom/zykj/study/dialog/ExerciseFinishDialog;->o()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-virtual {p0, v2}, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;->n(Z)Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-virtual {p2, v0, p0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    :goto_0
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 103
    .line 104
    .line 105
    return-void
.end method

.method public static final r(Lcom/zykj/study/dialog/ExerciseFinishDialog;Landroid/view/View;)Lh7/p;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->dismiss()V

    .line 7
    .line 8
    .line 9
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 10
    .line 11
    return-object p0
.end method

.method public static final s(Lcom/zykj/study/dialog/ExerciseFinishDialog;)F
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget v0, Lcom/zykj/view/R$dimen;->text_9:I

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimension(I)F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public static final t(Lcom/zykj/study/dialog/ExerciseFinishDialog;)F
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget v0, Lcom/zykj/view/R$dimen;->text_8:I

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimension(I)F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method


# virtual methods
.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/dialog/ExerciseFinishDialog;->p()V

    .line 2
    .line 3
    .line 4
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 5
    .line 6
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->dialog_exercise_finish:I

    .line 2
    .line 3
    return v0
.end method

.method public final m()F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/dialog/ExerciseFinishDialog;->a:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final n()F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/dialog/ExerciseFinishDialog;->b:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final o()Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/dialog/ExerciseFinishDialog;->c:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/ExerciseStatisticsViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public final p()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->getDialog()Landroid/app/Dialog;

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
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0, v1}, Landroidx/fragment/app/DialogFragment;->setCancelable(Z)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lcom/zykj/study/databinding/DialogExerciseFinishBinding;

    .line 19
    .line 20
    iget-object v0, v0, Lcom/zykj/study/databinding/DialogExerciseFinishBinding;->viewPagerRead:Landroidx/viewpager2/widget/ViewPager2;

    .line 21
    .line 22
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-interface {v2}, Landroidx/lifecycle/LifecycleOwner;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    new-instance v3, Lcom/zykj/study/dialog/ExerciseFinishDialog$initUI$2;

    .line 35
    .line 36
    invoke-direct {v3, p0, v1, v2}, Lcom/zykj/study/dialog/ExerciseFinishDialog$initUI$2;-><init>(Lcom/zykj/study/dialog/ExerciseFinishDialog;Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/Lifecycle;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v3}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 40
    .line 41
    .line 42
    new-instance v0, Lcom/google/android/material/tabs/TabLayoutMediator;

    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Lcom/zykj/study/databinding/DialogExerciseFinishBinding;

    .line 49
    .line 50
    iget-object v1, v1, Lcom/zykj/study/databinding/DialogExerciseFinishBinding;->tabLayout:Lcom/google/android/material/tabs/TabLayout;

    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    check-cast v2, Lcom/zykj/study/databinding/DialogExerciseFinishBinding;

    .line 57
    .line 58
    iget-object v2, v2, Lcom/zykj/study/databinding/DialogExerciseFinishBinding;->viewPagerRead:Landroidx/viewpager2/widget/ViewPager2;

    .line 59
    .line 60
    new-instance v3, Lp4/o;

    .line 61
    .line 62
    invoke-direct {v3, p0}, Lp4/o;-><init>(Lcom/zykj/study/dialog/ExerciseFinishDialog;)V

    .line 63
    .line 64
    .line 65
    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/material/tabs/TabLayoutMediator;-><init>(Lcom/google/android/material/tabs/TabLayout;Landroidx/viewpager2/widget/ViewPager2;Lcom/google/android/material/tabs/TabLayoutMediator$TabConfigurationStrategy;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Lcom/google/android/material/tabs/TabLayoutMediator;->attach()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    check-cast v0, Lcom/zykj/study/databinding/DialogExerciseFinishBinding;

    .line 76
    .line 77
    iget-object v0, v0, Lcom/zykj/study/databinding/DialogExerciseFinishBinding;->tabLayout:Lcom/google/android/material/tabs/TabLayout;

    .line 78
    .line 79
    new-instance v1, Lcom/zykj/study/dialog/ExerciseFinishDialog$b;

    .line 80
    .line 81
    invoke-direct {v1, p0}, Lcom/zykj/study/dialog/ExerciseFinishDialog$b;-><init>(Lcom/zykj/study/dialog/ExerciseFinishDialog;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v1}, Lcom/google/android/material/tabs/TabLayout;->addOnTabSelectedListener(Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    check-cast v0, Lcom/zykj/study/databinding/DialogExerciseFinishBinding;

    .line 92
    .line 93
    iget-object v0, v0, Lcom/zykj/study/databinding/DialogExerciseFinishBinding;->tabLayout:Lcom/google/android/material/tabs/TabLayout;

    .line 94
    .line 95
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    check-cast v1, Lcom/zykj/study/databinding/DialogExerciseFinishBinding;

    .line 100
    .line 101
    iget-object v1, v1, Lcom/zykj/study/databinding/DialogExerciseFinishBinding;->tabLayout:Lcom/google/android/material/tabs/TabLayout;

    .line 102
    .line 103
    invoke-virtual {v1}, Lcom/google/android/material/tabs/TabLayout;->getSelectedTabPosition()I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    invoke-virtual {v0, v1}, Lcom/google/android/material/tabs/TabLayout;->getTabAt(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    if-eqz v0, :cond_1

    .line 112
    .line 113
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    check-cast v1, Lcom/zykj/study/databinding/DialogExerciseFinishBinding;

    .line 118
    .line 119
    iget-object v1, v1, Lcom/zykj/study/databinding/DialogExerciseFinishBinding;->tabLayout:Lcom/google/android/material/tabs/TabLayout;

    .line 120
    .line 121
    invoke-virtual {v1, v0}, Lcom/google/android/material/tabs/TabLayout;->selectTab(Lcom/google/android/material/tabs/TabLayout$Tab;)V

    .line 122
    .line 123
    .line 124
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    check-cast v0, Lcom/zykj/study/databinding/DialogExerciseFinishBinding;

    .line 129
    .line 130
    iget-object v0, v0, Lcom/zykj/study/databinding/DialogExerciseFinishBinding;->ivClose:Landroidx/appcompat/widget/AppCompatImageView;

    .line 131
    .line 132
    const-string v1, "ivClose"

    .line 133
    .line 134
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    new-instance v1, Lp4/p;

    .line 138
    .line 139
    invoke-direct {v1, p0}, Lp4/p;-><init>(Lcom/zykj/study/dialog/ExerciseFinishDialog;)V

    .line 140
    .line 141
    .line 142
    invoke-static {v0, v1}, Le5/c;->r(Landroid/view/View;Lx7/l;)V

    .line 143
    .line 144
    .line 145
    return-void
.end method
