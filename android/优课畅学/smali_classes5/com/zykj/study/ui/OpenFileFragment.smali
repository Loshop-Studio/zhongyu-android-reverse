.class public final Lcom/zykj/study/ui/OpenFileFragment;
.super Lcom/zykj/study/ui/Hilt_OpenFileFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/ui/OpenFileFragment$a;,
        Lcom/zykj/study/ui/OpenFileFragment$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/study/ui/Hilt_OpenFileFragment<",
        "Lcom/zykj/study/databinding/FragmentOpenFileBinding;",
        ">;"
    }
.end annotation


# static fields
.field public static final h:Lcom/zykj/study/ui/OpenFileFragment$a;

.field public static final i:I


# instance fields
.field public final f:Landroidx/navigation/NavArgsLazy;

.field public final g:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/study/ui/OpenFileFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/study/ui/OpenFileFragment$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/study/ui/OpenFileFragment;->h:Lcom/zykj/study/ui/OpenFileFragment$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/study/ui/OpenFileFragment;->i:I

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/Hilt_OpenFileFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/navigation/NavArgsLazy;

    .line 5
    .line 6
    const-class v1, Lcom/zykj/study/ui/OpenFileFragmentArgs;

    .line 7
    .line 8
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Lcom/zykj/study/ui/OpenFileFragment$d;

    .line 13
    .line 14
    invoke-direct {v2, p0}, Lcom/zykj/study/ui/OpenFileFragment$d;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, Landroidx/navigation/NavArgsLazy;-><init>(Le8/c;Lx7/a;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/zykj/study/ui/OpenFileFragment;->f:Landroidx/navigation/NavArgsLazy;

    .line 21
    .line 22
    new-instance v0, Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lcom/zykj/study/ui/OpenFileFragment;->g:Ljava/util/HashMap;

    .line 28
    .line 29
    return-void
.end method

.method public static synthetic g(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/ui/OpenFileFragment;->q(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Landroid/content/DialogInterface;)V

    return-void
.end method

.method public static synthetic h(Lcom/zykj/study/ui/OpenFileFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/OpenFileFragment;->x(Lcom/zykj/study/ui/OpenFileFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic i(Landroidx/work/WorkManager;Ljava/lang/String;Lcom/zykj/study/ui/OpenFileFragment;Ljava/lang/String;Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/zykj/study/ui/OpenFileFragment;->r(Landroidx/work/WorkManager;Ljava/lang/String;Lcom/zykj/study/ui/OpenFileFragment;Ljava/lang/String;Landroid/content/DialogInterface;)V

    return-void
.end method

.method public static synthetic j(Landroid/content/DialogInterface;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/study/ui/OpenFileFragment;Ljava/util/List;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lcom/zykj/study/ui/OpenFileFragment;->s(Landroid/content/DialogInterface;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/study/ui/OpenFileFragment;Ljava/util/List;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic k(Lcom/zykj/study/ui/OpenFileFragment;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/study/ui/OpenFileFragment;->p(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic l(Landroidx/work/WorkInfo;Landroid/content/DialogInterface;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/ui/OpenFileFragment;->t(Landroidx/work/WorkInfo;Landroid/content/DialogInterface;Lm7/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic m(Lcom/zykj/study/ui/OpenFileFragment;)Ljava/util/HashMap;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/ui/OpenFileFragment;->g:Ljava/util/HashMap;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final q(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;Landroid/content/DialogInterface;)V
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

.method public static final r(Landroidx/work/WorkManager;Ljava/lang/String;Lcom/zykj/study/ui/OpenFileFragment;Ljava/lang/String;Landroid/content/DialogInterface;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Landroidx/work/WorkManager;->getWorkInfosForUniqueWorkLiveData(Ljava/lang/String;)Landroidx/lifecycle/LiveData;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Lu4/n;

    .line 10
    .line 11
    invoke-direct {v1, p4, p1, p3, p2}, Lu4/n;-><init>(Landroid/content/DialogInterface;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/study/ui/OpenFileFragment;)V

    .line 12
    .line 13
    .line 14
    new-instance p1, Lcom/zykj/study/ui/OpenFileFragment$c;

    .line 15
    .line 16
    invoke-direct {p1, v1}, Lcom/zykj/study/ui/OpenFileFragment$c;-><init>(Lx7/l;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0, p1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static final s(Landroid/content/DialogInterface;Ljava/lang/String;Ljava/lang/String;Lcom/zykj/study/ui/OpenFileFragment;Ljava/util/List;)Lh7/p;
    .locals 10

    .line 1
    invoke-static {p4}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p4}, Li7/f0;->n0(Ljava/util/List;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p4

    .line 8
    move-object v3, p4

    .line 9
    check-cast v3, Landroidx/work/WorkInfo;

    .line 10
    .line 11
    if-eqz v3, :cond_3

    .line 12
    .line 13
    invoke-virtual {v3}, Landroidx/work/WorkInfo;->getState()Landroidx/work/WorkInfo$State;

    .line 14
    .line 15
    .line 16
    move-result-object p4

    .line 17
    sget-object v0, Lcom/zykj/study/ui/OpenFileFragment$b;->a:[I

    .line 18
    .line 19
    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    .line 20
    .line 21
    .line 22
    move-result p4

    .line 23
    aget p4, v0, p4

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    if-eq p4, v0, :cond_2

    .line 27
    .line 28
    const/4 v0, 0x2

    .line 29
    if-eq p4, v0, :cond_0

    .line 30
    .line 31
    const-string p1, "null cannot be cast to non-null type com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog"

    .line 32
    .line 33
    invoke-static {p0, p1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    check-cast p0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 37
    .line 38
    invoke-virtual {v3}, Landroidx/work/WorkInfo;->getProgress()Landroidx/work/Data;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    const-string p2, "progress"

    .line 43
    .line 44
    const/4 p3, 0x0

    .line 45
    invoke-virtual {p1, p2, p3}, Landroidx/work/Data;->getInt(Ljava/lang/String;I)I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;->t(I)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    const-string p4, "getViewLifecycleOwner(...)"

    .line 58
    .line 59
    if-nez p1, :cond_1

    .line 60
    .line 61
    invoke-virtual {p3}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-static {p1, p4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    new-instance v0, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2;

    .line 73
    .line 74
    const/4 v5, 0x0

    .line 75
    move-object v4, p0

    .line 76
    move-object v2, p2

    .line 77
    move-object v1, p3

    .line 78
    invoke-direct/range {v0 .. v5}, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$2;-><init>(Lcom/zykj/study/ui/OpenFileFragment;Ljava/lang/String;Landroidx/work/WorkInfo;Landroid/content/DialogInterface;Lm7/c;)V

    .line 79
    .line 80
    .line 81
    const/4 v8, 0x3

    .line 82
    const/4 v9, 0x0

    .line 83
    const/4 v6, 0x0

    .line 84
    move-object v4, p1

    .line 85
    move-object v7, v0

    .line 86
    invoke-static/range {v4 .. v9}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    move-object v4, p0

    .line 91
    move-object v1, p3

    .line 92
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-static {p0, p4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    new-instance v7, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$3;

    .line 104
    .line 105
    const/4 p1, 0x0

    .line 106
    invoke-direct {v7, v1, v3, v4, p1}, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$2$1$1$3;-><init>(Lcom/zykj/study/ui/OpenFileFragment;Landroidx/work/WorkInfo;Landroid/content/DialogInterface;Lm7/c;)V

    .line 107
    .line 108
    .line 109
    const/4 v8, 0x3

    .line 110
    const/4 v9, 0x0

    .line 111
    const/4 v5, 0x0

    .line 112
    const/4 v6, 0x0

    .line 113
    move-object v4, p0

    .line 114
    invoke-static/range {v4 .. v9}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 115
    .line 116
    .line 117
    goto :goto_0

    .line 118
    :cond_2
    move-object v4, p0

    .line 119
    move-object v1, p3

    .line 120
    invoke-interface {v4}, Landroid/content/DialogInterface;->dismiss()V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v3}, Landroidx/work/WorkInfo;->getOutputData()Landroidx/work/Data;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    const-string p1, "success_key"

    .line 128
    .line 129
    invoke-virtual {p0, p1}, Landroidx/work/Data;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    if-eqz p0, :cond_3

    .line 134
    .line 135
    invoke-virtual {v1, p0}, Lcom/zykj/study/ui/OpenFileFragment;->o(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    :cond_3
    :goto_0
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 139
    .line 140
    return-object p0
.end method

.method public static final t(Landroidx/work/WorkInfo;Landroid/content/DialogInterface;Lm7/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Li8/i0;->c()Li8/h1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$showError$2;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, v2}, Lcom/zykj/study/ui/OpenFileFragment$downloadFile$showError$2;-><init>(Landroidx/work/WorkInfo;Landroid/content/DialogInterface;Lm7/c;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p2}, Li8/f;->g(Lkotlin/coroutines/d;Lx7/p;Lm7/c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-ne p0, p1, :cond_0

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 23
    .line 24
    return-object p0
.end method

.method public static final x(Lcom/zykj/study/ui/OpenFileFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/study/databinding/FragmentOpenFileBinding;

    .line 6
    .line 7
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentOpenFileBinding;->toolbar:Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 8
    .line 9
    sget p2, Lcom/zykj/study/R$string;->preview:I

    .line 10
    .line 11
    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->t(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    sget p2, Lcom/zykj/study/R$string;->arrow_left_return:I

    .line 20
    .line 21
    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->p(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    sget v0, Lcom/zykj/study/R$color;->toolbar_back_icon_color:I

    .line 34
    .line 35
    invoke-static {p2, v0}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->r(I)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    sget v0, Lcom/zykj/lib/ui/R$dimen;->text_9:I

    .line 48
    .line 49
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    int-to-float p2, p2

    .line 54
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->s(F)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    new-instance p2, Lu4/k;

    .line 59
    .line 60
    invoke-direct {p2, p0}, Lu4/k;-><init>(Lcom/zykj/study/ui/OpenFileFragment;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->n(Landroid/view/View$OnClickListener;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Lcom/zykj/study/ui/OpenFileFragment;->v()Lcom/zykj/study/ui/OpenFileFragmentArgs;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p1}, Lcom/zykj/study/ui/OpenFileFragmentArgs;->b()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p0, p1}, Lcom/zykj/study/ui/OpenFileFragment;->n(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 78
    .line 79
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->fragment_open_file:I

    .line 2
    .line 3
    return v0
.end method

.method public final n(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {p1}, Landroid/webkit/URLUtil;->isNetworkUrl(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/zykj/study/ui/OpenFileFragment;->p(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {p0, p1}, Lcom/zykj/study/ui/OpenFileFragment;->o(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final o(Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget v1, Lcom/zykj/study/R$id;->nav_file_fragment:I

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->findFragmentById(I)Landroidx/fragment/app/Fragment;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment"

    .line 12
    .line 13
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    check-cast v0, Landroidx/navigation/fragment/NavHostFragment;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/navigation/fragment/NavHostFragment;->getNavController()Landroidx/navigation/NavController;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Landroidx/navigation/NavController;->getNavInflater()Landroidx/navigation/NavInflater;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    sget v2, Lcom/zykj/study/R$navigation;->nav_file:I

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Landroidx/navigation/NavInflater;->inflate(I)Landroidx/navigation/NavGraph;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {p0, p1}, Lcom/zykj/study/ui/OpenFileFragment;->w(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    sparse-switch v3, :sswitch_data_0

    .line 41
    .line 42
    .line 43
    goto/16 :goto_1

    .line 44
    .line 45
    :sswitch_0
    const-string v3, "xlsx"

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-nez v3, :cond_0

    .line 52
    .line 53
    goto/16 :goto_1

    .line 54
    .line 55
    :sswitch_1
    const-string v3, "pptx"

    .line 56
    .line 57
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-nez v3, :cond_0

    .line 62
    .line 63
    goto/16 :goto_1

    .line 64
    .line 65
    :sswitch_2
    const-string v3, "jpeg"

    .line 66
    .line 67
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-nez v3, :cond_2

    .line 72
    .line 73
    goto/16 :goto_1

    .line 74
    .line 75
    :sswitch_3
    const-string v3, "epub"

    .line 76
    .line 77
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-nez v3, :cond_0

    .line 82
    .line 83
    goto/16 :goto_1

    .line 84
    .line 85
    :sswitch_4
    const-string v3, "docx"

    .line 86
    .line 87
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-nez v3, :cond_0

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :sswitch_5
    const-string v3, "xls"

    .line 95
    .line 96
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    if-eqz v3, :cond_1

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :sswitch_6
    const-string v3, "txt"

    .line 104
    .line 105
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    if-nez v3, :cond_0

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :sswitch_7
    const-string v3, "ppt"

    .line 113
    .line 114
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    if-nez v3, :cond_0

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :sswitch_8
    const-string v3, "png"

    .line 122
    .line 123
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    if-nez v3, :cond_2

    .line 128
    .line 129
    goto :goto_1

    .line 130
    :sswitch_9
    const-string v3, "pdf"

    .line 131
    .line 132
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    if-nez v3, :cond_0

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :sswitch_a
    const-string v3, "jpg"

    .line 140
    .line 141
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    if-nez v3, :cond_2

    .line 146
    .line 147
    goto :goto_1

    .line 148
    :sswitch_b
    const-string v3, "gif"

    .line 149
    .line 150
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    if-nez v3, :cond_2

    .line 155
    .line 156
    goto :goto_1

    .line 157
    :sswitch_c
    const-string v3, "doc"

    .line 158
    .line 159
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    if-nez v3, :cond_0

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_0
    :goto_0
    sget v2, Lcom/zykj/study/R$id;->pdfFragment:I

    .line 167
    .line 168
    invoke-virtual {v1, v2}, Landroidx/navigation/NavGraph;->setStartDestination(I)V

    .line 169
    .line 170
    .line 171
    goto :goto_2

    .line 172
    :sswitch_d
    const-string v3, "bmp"

    .line 173
    .line 174
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    if-nez v3, :cond_2

    .line 179
    .line 180
    :cond_1
    :goto_1
    sget-object p1, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 181
    .line 182
    new-instance v0, Ljava/lang/StringBuilder;

    .line 183
    .line 184
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 185
    .line 186
    .line 187
    const-string v1, "\u4e0d\u652f\u6301\u7684\u6587\u4ef6\u7c7b\u578b:"

    .line 188
    .line 189
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-static {p1, v0}, Le5/o;->d(Lcom/zykj/base/utils/XToastUtils;Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    invoke-virtual {p1}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 207
    .line 208
    .line 209
    return-void

    .line 210
    :cond_2
    sget v2, Lcom/zykj/study/R$id;->imageFragment:I

    .line 211
    .line 212
    invoke-virtual {v1, v2}, Landroidx/navigation/NavGraph;->setStartDestination(I)V

    .line 213
    .line 214
    .line 215
    :goto_2
    invoke-virtual {v0}, Landroidx/navigation/fragment/NavHostFragment;->getNavController()Landroidx/navigation/NavController;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-virtual {p0}, Lcom/zykj/study/ui/OpenFileFragment;->v()Lcom/zykj/study/ui/OpenFileFragmentArgs;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    invoke-virtual {v2, p1}, Lcom/zykj/study/ui/OpenFileFragmentArgs;->a(Ljava/lang/String;)Lcom/zykj/study/ui/OpenFileFragmentArgs;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    invoke-virtual {p1}, Lcom/zykj/study/ui/OpenFileFragmentArgs;->c()Landroid/os/Bundle;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    invoke-virtual {v0, v1, p1}, Landroidx/navigation/NavController;->setGraph(Landroidx/navigation/NavGraph;Landroid/os/Bundle;)V

    .line 232
    .line 233
    .line 234
    return-void

    .line 235
    :sswitch_data_0
    .sparse-switch
        0x17d85 -> :sswitch_d
        0x18538 -> :sswitch_c
        0x18fc4 -> :sswitch_b
        0x19be1 -> :sswitch_a
        0x1b0f2 -> :sswitch_9
        0x1b229 -> :sswitch_8
        0x1b274 -> :sswitch_7
        0x1c270 -> :sswitch_6
        0x1cfff -> :sswitch_5
        0x2f2240 -> :sswitch_4
        0x2f9c78 -> :sswitch_3
        0x31e068 -> :sswitch_2
        0x349c84 -> :sswitch_1
        0x383059 -> :sswitch_0
    .end sparse-switch
.end method

.method public final p(Ljava/lang/String;)V
    .locals 8

    .line 1
    const-string v5, "xlsx"

    .line 2
    .line 3
    const-string v6, "pdf"

    .line 4
    .line 5
    const-string v0, "doc"

    .line 6
    .line 7
    const-string v1, "docx"

    .line 8
    .line 9
    const-string v2, "ppt"

    .line 10
    .line 11
    const-string v3, "pptx"

    .line 12
    .line 13
    const-string v4, "xls"

    .line 14
    .line 15
    filled-new-array/range {v0 .. v6}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p0, p1, v0}, Lcom/zykj/study/ui/OpenFileFragment;->u(Ljava/lang/String;[Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const/4 v5, 0x4

    .line 26
    const/4 v6, 0x0

    .line 27
    const-string v2, "."

    .line 28
    .line 29
    const-string v3, "pdf"

    .line 30
    .line 31
    const/4 v4, 0x0

    .line 32
    move-object v1, p1

    .line 33
    invoke-static/range {v1 .. v6}, Lg8/c0;->B0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    move-object v3, p1

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move-object v1, p1

    .line 40
    move-object v3, v1

    .line 41
    :goto_0
    new-instance p1, Landroidx/work/OneTimeWorkRequest$Builder;

    .line 42
    .line 43
    const-class v0, Lcom/zykj/download/work/DownloadFileCommonWork;

    .line 44
    .line 45
    invoke-direct {p1, v0}, Landroidx/work/OneTimeWorkRequest$Builder;-><init>(Ljava/lang/Class;)V

    .line 46
    .line 47
    .line 48
    sget-object v2, Lcom/zykj/download/work/DownloadFileCommonWork;->Companion:Lcom/zykj/download/work/DownloadFileCommonWork$a;

    .line 49
    .line 50
    const/4 v6, 0x6

    .line 51
    const/4 v7, 0x0

    .line 52
    const/4 v4, 0x0

    .line 53
    const/4 v5, 0x0

    .line 54
    invoke-static/range {v2 .. v7}, Lcom/zykj/download/work/DownloadFileCommonWork$a;->b(Lcom/zykj/download/work/DownloadFileCommonWork$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Landroidx/work/Data;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {p1, v0}, Landroidx/work/WorkRequest$Builder;->setInputData(Landroidx/work/Data;)Landroidx/work/WorkRequest$Builder;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    check-cast p1, Landroidx/work/OneTimeWorkRequest$Builder;

    .line 63
    .line 64
    invoke-virtual {p1}, Landroidx/work/WorkRequest$Builder;->build()Landroidx/work/WorkRequest;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    check-cast p1, Landroidx/work/OneTimeWorkRequest;

    .line 69
    .line 70
    sget-object v0, Landroidx/work/WorkManager;->Companion:Landroidx/work/WorkManager$Companion;

    .line 71
    .line 72
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    const-string v4, "requireContext(...)"

    .line 77
    .line 78
    invoke-static {v2, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v2}, Landroidx/work/WorkManager$Companion;->getInstance(Landroid/content/Context;)Landroidx/work/WorkManager;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    sget-object v2, Landroidx/work/ExistingWorkPolicy;->KEEP:Landroidx/work/ExistingWorkPolicy;

    .line 86
    .line 87
    invoke-virtual {v0, v3, v2, p1}, Landroidx/work/WorkManager;->enqueueUniqueWork(Ljava/lang/String;Landroidx/work/ExistingWorkPolicy;Landroidx/work/OneTimeWorkRequest;)Landroidx/work/Operation;

    .line 88
    .line 89
    .line 90
    new-instance v2, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 91
    .line 92
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    invoke-direct {v2, v4}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;-><init>(Landroid/content/Context;)V

    .line 97
    .line 98
    .line 99
    sget v4, Lcom/zykj/study/R$string;->downloading_wait:I

    .line 100
    .line 101
    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    invoke-virtual {v2, v4}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->j(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    sget-object v4, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->b:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 110
    .line 111
    invoke-virtual {v2, v4}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->k(Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    const/16 v4, 0x64

    .line 116
    .line 117
    const/4 v5, 0x0

    .line 118
    const/4 v6, 0x1

    .line 119
    invoke-virtual {v2, v5, v4, v6}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->C(ZIZ)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-virtual {v2, v5}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->f(Z)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 124
    .line 125
    .line 126
    move-result-object v2

    .line 127
    invoke-virtual {v2, v6}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->e(Z)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    new-instance v4, Lu4/l;

    .line 132
    .line 133
    invoke-direct {v4, v0, p1}, Lu4/l;-><init>(Landroidx/work/WorkManager;Landroidx/work/OneTimeWorkRequest;)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2, v4}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->d(Landroid/content/DialogInterface$OnCancelListener;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    new-instance v2, Lu4/m;

    .line 141
    .line 142
    invoke-direct {v2, v0, v3, p0, v1}, Lu4/m;-><init>(Landroidx/work/WorkManager;Ljava/lang/String;Lcom/zykj/study/ui/OpenFileFragment;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1, v2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->F(Landroid/content/DialogInterface$OnShowListener;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    sget v0, Lcom/zykj/study/R$string;->cancel:I

    .line 150
    .line 151
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->t(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->E()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 156
    .line 157
    .line 158
    return-void
.end method

.method public final varargs u(Ljava/lang/String;[Ljava/lang/String;)Z
    .locals 6

    .line 1
    array-length v0, p2

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    if-ge v2, v0, :cond_1

    .line 5
    .line 6
    aget-object v3, p2, v2

    .line 7
    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x0

    .line 10
    invoke-static {p1, v3, v1, v4, v5}, Lg8/z;->z(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    return p1

    .line 18
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    return v1
.end method

.method public final v()Lcom/zykj/study/ui/OpenFileFragmentArgs;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/OpenFileFragment;->f:Landroidx/navigation/NavArgsLazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/ui/OpenFileFragmentArgs;

    .line 8
    .line 9
    return-object v0
.end method

.method public final w(Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v5, 0x6

    .line 9
    const/4 v6, 0x0

    .line 10
    const/16 v2, 0x2e

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x0

    .line 14
    move-object v1, p1

    .line 15
    invoke-static/range {v1 .. v6}, Lg8/c0;->k0(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    const/4 v0, -0x1

    .line 20
    if-gt p1, v0, :cond_1

    .line 21
    .line 22
    :goto_0
    const-string p1, ""

    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_1
    add-int/lit8 p1, p1, 0x1

    .line 26
    .line 27
    invoke-virtual {v1, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const-string v0, "substring(...)"

    .line 32
    .line 33
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-object p1
.end method
