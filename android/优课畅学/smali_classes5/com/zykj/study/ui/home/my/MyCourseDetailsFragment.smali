.class public final Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;
.super Lcom/zykj/study/ui/home/my/Hilt_MyCourseDetailsFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/study/ui/home/my/Hilt_MyCourseDetailsFragment<",
        "Lcom/zykj/study/databinding/FragmentMyCourseDetailsBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final f:Landroidx/navigation/NavArgsLazy;

.field public final g:Lh7/d;

.field public final h:Lh7/d;

.field public i:Lp4/y;

.field public j:Lp4/y;

.field public k:Lp4/a;

.field public l:Lp4/a;

.field public m:Ljava/util/List;

.field public n:Ljava/util/List;

.field public o:Ljava/util/List;

.field public p:Ljava/util/List;

.field public final q:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$a;

.field public final r:Lh7/d;

.field public s:Lkotlin/Pair;

.field public t:Landroid/view/View;

.field public u:Ljava/lang/Integer;

.field public final v:Lh7/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/Hilt_MyCourseDetailsFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/navigation/NavArgsLazy;

    .line 5
    .line 6
    const-class v1, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragmentArgs;

    .line 7
    .line 8
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$f;

    .line 13
    .line 14
    invoke-direct {v2, p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$f;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, Landroidx/navigation/NavArgsLazy;-><init>(Le8/c;Lx7/a;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->f:Landroidx/navigation/NavArgsLazy;

    .line 21
    .line 22
    const-class v0, Lcom/zykj/study/viewmodels/DictViewModel;

    .line 23
    .line 24
    invoke-static {v0}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    new-instance v1, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$special$$inlined$activityViewModels$default$1;

    .line 29
    .line 30
    invoke-direct {v1, p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 31
    .line 32
    .line 33
    new-instance v2, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$special$$inlined$activityViewModels$default$2;

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    invoke-direct {v2, v3, p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$special$$inlined$activityViewModels$default$2;-><init>(Lx7/a;Landroidx/fragment/app/Fragment;)V

    .line 37
    .line 38
    .line 39
    new-instance v4, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$special$$inlined$activityViewModels$default$3;

    .line 40
    .line 41
    invoke-direct {v4, p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$special$$inlined$activityViewModels$default$3;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 42
    .line 43
    .line 44
    invoke-static {p0, v0, v1, v2, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->g:Lh7/d;

    .line 49
    .line 50
    new-instance v0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$special$$inlined$viewModels$default$1;

    .line 51
    .line 52
    invoke-direct {v0, p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$special$$inlined$viewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 53
    .line 54
    .line 55
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->c:Lkotlin/LazyThreadSafetyMode;

    .line 56
    .line 57
    new-instance v2, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$special$$inlined$viewModels$default$2;

    .line 58
    .line 59
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$special$$inlined$viewModels$default$2;-><init>(Lx7/a;)V

    .line 60
    .line 61
    .line 62
    invoke-static {v1, v2}, Lkotlin/a;->a(Lkotlin/LazyThreadSafetyMode;Lx7/a;)Lh7/d;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    const-class v1, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    .line 67
    .line 68
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Le8/c;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    new-instance v2, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$special$$inlined$viewModels$default$3;

    .line 73
    .line 74
    invoke-direct {v2, v0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$special$$inlined$viewModels$default$3;-><init>(Lh7/d;)V

    .line 75
    .line 76
    .line 77
    new-instance v4, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$special$$inlined$viewModels$default$4;

    .line 78
    .line 79
    invoke-direct {v4, v3, v0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$special$$inlined$viewModels$default$4;-><init>(Lx7/a;Lh7/d;)V

    .line 80
    .line 81
    .line 82
    new-instance v5, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$special$$inlined$viewModels$default$5;

    .line 83
    .line 84
    invoke-direct {v5, p0, v0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$special$$inlined$viewModels$default$5;-><init>(Landroidx/fragment/app/Fragment;Lh7/d;)V

    .line 85
    .line 86
    .line 87
    invoke-static {p0, v1, v2, v4, v5}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Le8/c;Lx7/a;Lx7/a;Lx7/a;)Lh7/d;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->h:Lh7/d;

    .line 92
    .line 93
    new-instance v0, Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 96
    .line 97
    .line 98
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->m:Ljava/util/List;

    .line 99
    .line 100
    new-instance v0, Ljava/util/ArrayList;

    .line 101
    .line 102
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 103
    .line 104
    .line 105
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->n:Ljava/util/List;

    .line 106
    .line 107
    new-instance v0, Ljava/util/ArrayList;

    .line 108
    .line 109
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 110
    .line 111
    .line 112
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->o:Ljava/util/List;

    .line 113
    .line 114
    new-instance v0, Ljava/util/ArrayList;

    .line 115
    .line 116
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 117
    .line 118
    .line 119
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->p:Ljava/util/List;

    .line 120
    .line 121
    new-instance v0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$a;

    .line 122
    .line 123
    invoke-direct {v0, p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$a;-><init>(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)V

    .line 124
    .line 125
    .line 126
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->q:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$a;

    .line 127
    .line 128
    new-instance v0, Lb5/u2;

    .line 129
    .line 130
    invoke-direct {v0, p0}, Lb5/u2;-><init>(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)V

    .line 131
    .line 132
    .line 133
    invoke-static {v0}, Lkotlin/a;->b(Lx7/a;)Lh7/d;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->r:Lh7/d;

    .line 138
    .line 139
    new-instance v0, Lkotlin/Pair;

    .line 140
    .line 141
    invoke-direct {v0, v3, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->s:Lkotlin/Pair;

    .line 145
    .line 146
    new-instance v0, Lb5/v2;

    .line 147
    .line 148
    invoke-direct {v0, p0}, Lb5/v2;-><init>(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)V

    .line 149
    .line 150
    .line 151
    invoke-static {v0}, Lkotlin/a;->b(Lx7/a;)Lh7/d;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->v:Lh7/d;

    .line 156
    .line 157
    return-void
.end method

.method public static synthetic A(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lcom/zykj/study/bean/course/CatalogBean;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->P(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lcom/zykj/study/bean/course/CatalogBean;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->h0(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final B0(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->d0()Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->Y()Lcom/zykj/study/ui/home/my/MyCourseDetailsFragmentArgs;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragmentArgs;->a()Lcom/zykj/study/data/MyCourseEntity;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getId()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    const/4 v0, 0x0

    .line 27
    invoke-virtual {p1, p0, p2, v0, v0}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->c(ILjava/lang/String;IZ)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public static synthetic C(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->n0(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V

    return-void
.end method

.method public static synthetic D(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lm1/c;Lm1/a;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->q0(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lm1/c;Lm1/a;I)V

    return-void
.end method

.method public static final D0(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;ILcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->d0()Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->Y()Lcom/zykj/study/ui/home/my/MyCourseDetailsFragmentArgs;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragmentArgs;->a()Lcom/zykj/study/data/MyCourseEntity;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getId()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    const/4 v0, 0x1

    .line 27
    invoke-virtual {p2, p0, p3, p1, v0}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->c(ILjava/lang/String;IZ)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public static final synthetic E(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)Lcom/zykj/study/ui/home/my/MyCourseDetailsFragmentArgs;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->Y()Lcom/zykj/study/ui/home/my/MyCourseDetailsFragmentArgs;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic F(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)Lcom/zykj/study/adapter/CatalogEditAdapter;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->Z()Lcom/zykj/study/adapter/CatalogEditAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic G(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->u:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic H(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)Lp4/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->k:Lp4/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic I(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)Lp4/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->l:Lp4/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic J(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)Lp4/y;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->i:Lp4/y;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic K(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->d0()Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic L(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->l0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic M(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->u:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic N(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->E0(Ljava/util/List;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final O(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)Lcom/zykj/study/adapter/CatalogEditAdapter;
    .locals 4

    .line 1
    new-instance v0, Lcom/zykj/study/adapter/CatalogEditAdapter;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->d0()Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->k()Ljava/util/HashSet;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v2, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->q:Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$a;

    .line 12
    .line 13
    new-instance v3, Lb5/y2;

    .line 14
    .line 15
    invoke-direct {v3, p0}, Lb5/y2;-><init>(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1, v2, v3}, Lcom/zykj/study/adapter/CatalogEditAdapter;-><init>(Ljava/util/HashSet;Lcom/zykj/study/adapter/CatalogEditAdapter$b;Lx7/l;)V

    .line 19
    .line 20
    .line 21
    sget-object p0, Landroidx/recyclerview/widget/RecyclerView$Adapter$StateRestorationPolicy;->PREVENT_WHEN_EMPTY:Landroidx/recyclerview/widget/RecyclerView$Adapter$StateRestorationPolicy;

    .line 22
    .line 23
    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->setStateRestorationPolicy(Landroidx/recyclerview/widget/RecyclerView$Adapter$StateRestorationPolicy;)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method

.method public static final P(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lcom/zykj/study/bean/course/CatalogBean;)Lh7/p;
    .locals 7

    .line 1
    const-string v0, "catalogBean"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lcom/zykj/study/ui/home/my/i;->a:Lcom/zykj/study/ui/home/my/i$e;

    .line 7
    .line 8
    sget-object v0, Le5/e;->a:Le5/e;

    .line 9
    .line 10
    invoke-virtual {v0}, Le5/e;->c()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->d0()Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v2}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->i()Ll8/h;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-interface {v2}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Lcom/zykj/http/bean/HeaderBean;

    .line 27
    .line 28
    invoke-virtual {v2}, Lcom/zykj/http/bean/HeaderBean;->getAccessToken()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->d0()Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {v3}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->i()Ll8/h;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-interface {v3}, Ll8/h;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    check-cast v3, Lcom/zykj/http/bean/HeaderBean;

    .line 45
    .line 46
    invoke-virtual {v3}, Lcom/zykj/http/bean/HeaderBean;->getServerUrl()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CatalogBean;->getId()I

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->Y()Lcom/zykj/study/ui/home/my/MyCourseDetailsFragmentArgs;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    invoke-virtual {v5}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragmentArgs;->a()Lcom/zykj/study/data/MyCourseEntity;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    invoke-virtual {v5}, Lcom/zykj/study/bean/course/CourseBean;->getId()I

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    new-instance v6, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string v0, "?token="

    .line 75
    .line 76
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v0, "&url="

    .line 83
    .line 84
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v0, "#/?entry=mine&catalogId="

    .line 91
    .line 92
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const-string v0, "&courseId="

    .line 99
    .line 100
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CatalogBean;->getTitle()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->d0()Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->j()Landroidx/lifecycle/LiveData;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    move-object v2, p1

    .line 127
    check-cast v2, Lcom/zykj/study/data/MyCourseEntity;

    .line 128
    .line 129
    const/4 v3, 0x1

    .line 130
    const/4 v4, 0x0

    .line 131
    invoke-virtual/range {v1 .. v6}, Lcom/zykj/study/ui/home/my/i$e;->b(Lcom/zykj/study/bean/course/CourseBean;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroidx/navigation/NavDirections;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    invoke-virtual {p0, p1}, Landroidx/navigation/NavController;->navigate(Landroidx/navigation/NavDirections;)V

    .line 140
    .line 141
    .line 142
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 143
    .line 144
    return-object p0
.end method

.method public static final R(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;ILcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V
    .locals 1

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->d0()Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0, p1}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->d(I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static final T(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;ILcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V
    .locals 1

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->d0()Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0, p1}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->d(I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static final V(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lcom/zykj/study/bean/course/CatalogBean;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->d0()Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CatalogBean;->getId()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->r(ILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public static final X(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lcom/zykj/study/bean/course/CatalogBean;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->d0()Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CatalogBean;->getId()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->r(ILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method private final a0()Lcom/zykj/study/viewmodels/DictViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->g:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/DictViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method private final f0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/study/databinding/FragmentMyCourseDetailsBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentMyCourseDetailsBinding;->courseCatalog:Lcom/zykj/study/databinding/LayoutMyCourseDetailsCatalogBinding;

    .line 8
    .line 9
    iget-object v0, v0, Lcom/zykj/study/databinding/LayoutMyCourseDetailsCatalogBinding;->ivAdd:Landroid/widget/ImageView;

    .line 10
    .line 11
    new-instance v1, Lb5/z2;

    .line 12
    .line 13
    invoke-direct {v1, p0}, Lb5/z2;-><init>(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lcom/zykj/study/databinding/FragmentMyCourseDetailsBinding;

    .line 24
    .line 25
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentMyCourseDetailsBinding;->courseSynopsis:Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBinding;

    .line 26
    .line 27
    iget-object v0, v0, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBinding;->btUndercarriage:Landroid/widget/Button;

    .line 28
    .line 29
    new-instance v1, Lb5/a3;

    .line 30
    .line 31
    invoke-direct {v1, p0}, Lb5/a3;-><init>(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Lcom/zykj/study/databinding/FragmentMyCourseDetailsBinding;

    .line 42
    .line 43
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentMyCourseDetailsBinding;->courseSynopsis:Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBinding;

    .line 44
    .line 45
    iget-object v0, v0, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBinding;->btGrounding:Landroid/widget/Button;

    .line 46
    .line 47
    new-instance v1, Lb5/b3;

    .line 48
    .line 49
    invoke-direct {v1, p0}, Lb5/b3;-><init>(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public static synthetic g(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;ILcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->T(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;ILcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V

    return-void
.end method

.method public static final g0(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->j:Lp4/y;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lp4/y;->v(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public static synthetic h(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;ILcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->D0(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;ILcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static final h0(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    new-instance p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-direct {p1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    const-string v0, "\u662f\u5426\u4e0b\u67b6\u8bfe\u7a0b"

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->j(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    sget v0, Lcom/zykj/study/R$string;->sure:I

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->z(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    sget v0, Lcom/zykj/study/R$string;->cancel:I

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->t(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    new-instance v0, Lb5/r2;

    .line 29
    .line 30
    invoke-direct {v0, p0}, Lb5/r2;-><init>(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->w(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$i;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->E()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public static synthetic i(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$d;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->x0(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$d;

    move-result-object p0

    return-object p0
.end method

.method public static final i0(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V
    .locals 1

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->d0()Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->Y()Lcom/zykj/study/ui/home/my/MyCourseDetailsFragmentArgs;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragmentArgs;->a()Lcom/zykj/study/data/MyCourseEntity;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getId()I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    invoke-virtual {p1, p0}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->q(I)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public static synthetic j(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->s0(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final j0(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    new-instance p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-direct {p1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    const-string v0, "\u662f\u5426\u4e0a\u67b6\u8bfe\u7a0b"

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->j(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    sget v0, Lcom/zykj/study/R$string;->sure:I

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->z(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    sget v0, Lcom/zykj/study/R$string;->cancel:I

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->t(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    new-instance v0, Lb5/k2;

    .line 29
    .line 30
    invoke-direct {v0, p0}, Lb5/k2;-><init>(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->w(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$i;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->E()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public static synthetic k(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lcom/zykj/study/bean/course/CatalogBean;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->V(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lcom/zykj/study/bean/course/CatalogBean;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static final k0(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V
    .locals 1

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->d0()Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->Y()Lcom/zykj/study/ui/home/my/MyCourseDetailsFragmentArgs;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragmentArgs;->a()Lcom/zykj/study/data/MyCourseEntity;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getId()I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    invoke-virtual {p1, p0}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->m(I)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public static synthetic l(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->B0(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static synthetic m(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lm1/c;Lm1/a;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->p0(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lm1/c;Lm1/a;I)V

    return-void
.end method

.method public static final m0(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lm1/c;Lm1/a;I)V
    .locals 0

    .line 1
    const-string p1, "<unused var>"

    .line 2
    .line 3
    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p3, :cond_4

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    if-eq p3, p1, :cond_3

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    if-eq p3, p1, :cond_2

    .line 13
    .line 14
    const/4 p1, 0x3

    .line 15
    if-eq p3, p1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->d0()Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->j()Landroidx/lifecycle/LiveData;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Lcom/zykj/study/data/MyCourseEntity;

    .line 31
    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    sget-object p2, Lcom/zykj/study/ui/home/my/i;->a:Lcom/zykj/study/ui/home/my/i$e;

    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CourseBean;->getId()I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    invoke-virtual {p2, p1}, Lcom/zykj/study/ui/home/my/i$e;->a(I)Landroidx/navigation/NavDirections;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p0, p1}, Landroidx/navigation/NavController;->navigate(Landroidx/navigation/NavDirections;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    :goto_0
    return-void

    .line 52
    :cond_2
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    sget-object p2, Lcom/zykj/study/ui/home/my/i;->a:Lcom/zykj/study/ui/home/my/i$e;

    .line 57
    .line 58
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->Y()Lcom/zykj/study/ui/home/my/MyCourseDetailsFragmentArgs;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragmentArgs;->a()Lcom/zykj/study/data/MyCourseEntity;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getId()I

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    invoke-virtual {p2, p0}, Lcom/zykj/study/ui/home/my/i$e;->d(I)Landroidx/navigation/NavDirections;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {p1, p0}, Landroidx/navigation/NavController;->navigate(Landroidx/navigation/NavDirections;)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_3
    new-instance p1, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 79
    .line 80
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    invoke-direct {p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;-><init>(Landroid/content/Context;)V

    .line 85
    .line 86
    .line 87
    sget p2, Lcom/zykj/study/R$string;->delete_course_hint:I

    .line 88
    .line 89
    invoke-virtual {p0, p2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->j(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    sget p2, Lcom/zykj/study/R$string;->sure:I

    .line 98
    .line 99
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->z(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    sget p3, Lcom/xuexiang/xui/R$color;->xui_config_color_red:I

    .line 108
    .line 109
    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getColor(I)I

    .line 110
    .line 111
    .line 112
    move-result p2

    .line 113
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->x(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    sget p2, Lcom/zykj/study/R$string;->cancel:I

    .line 118
    .line 119
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->t(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    new-instance p2, Lb5/m2;

    .line 124
    .line 125
    invoke-direct {p2, p0}, Lb5/m2;-><init>(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->w(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$i;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->E()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    :cond_4
    sget-object p1, Lcom/zykj/study/ui/home/my/i;->a:Lcom/zykj/study/ui/home/my/i$e;

    .line 137
    .line 138
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->d0()Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    .line 139
    .line 140
    .line 141
    move-result-object p2

    .line 142
    invoke-virtual {p2}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->j()Landroidx/lifecycle/LiveData;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    invoke-virtual {p2}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p2

    .line 150
    check-cast p2, Lcom/zykj/study/data/MyCourseEntity;

    .line 151
    .line 152
    invoke-virtual {p1, p2}, Lcom/zykj/study/ui/home/my/i$e;->c(Lcom/zykj/study/data/MyCourseEntity;)Landroidx/navigation/NavDirections;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    invoke-virtual {p0, p1}, Landroidx/navigation/NavController;->navigate(Landroidx/navigation/NavDirections;)V

    .line 161
    .line 162
    .line 163
    return-void
.end method

.method public static synthetic n(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lcom/zykj/study/bean/course/CatalogBean;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->X(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lcom/zykj/study/bean/course/CatalogBean;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static final n0(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V
    .locals 7

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v4, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initPopup$1$1$1;

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    invoke-direct {v4, p0, p1}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initPopup$1$1$1;-><init>(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lm7/c;)V

    .line 17
    .line 18
    .line 19
    const/4 v5, 0x3

    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v2, 0x0

    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-static/range {v1 .. v6}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public static synthetic o(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->j0(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final o0(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lm1/c;Lm1/a;I)V
    .locals 0

    .line 1
    const-string p1, "<unused var>"

    .line 2
    .line 3
    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p3, :cond_1

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    if-eq p3, p1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    invoke-virtual {p0, p1}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->C0(I)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->A0()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public static synthetic p(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lm1/c;Lm1/a;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->o0(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lm1/c;Lm1/a;I)V

    return-void
.end method

.method public static final p0(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lm1/c;Lm1/a;I)V
    .locals 0

    .line 1
    const-string p1, "<unused var>"

    .line 2
    .line 3
    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p3, :cond_2

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    if-eq p3, p1, :cond_1

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    if-eq p3, p1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->k:Lp4/a;

    .line 16
    .line 17
    if-eqz p1, :cond_3

    .line 18
    .line 19
    invoke-virtual {p1}, Lp4/a;->D()Lcom/zykj/study/bean/course/CatalogBean;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-eqz p1, :cond_3

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CatalogBean;->getId()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-virtual {p0, p1}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->Q(I)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->k:Lp4/a;

    .line 34
    .line 35
    if-eqz p1, :cond_3

    .line 36
    .line 37
    invoke-virtual {p1}, Lp4/a;->D()Lcom/zykj/study/bean/course/CatalogBean;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-eqz p1, :cond_3

    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CatalogBean;->getId()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    invoke-virtual {p0, p1}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->C0(I)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_2
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->k:Lp4/a;

    .line 52
    .line 53
    if-eqz p1, :cond_3

    .line 54
    .line 55
    invoke-virtual {p1}, Lp4/a;->D()Lcom/zykj/study/bean/course/CatalogBean;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    if-eqz p1, :cond_3

    .line 60
    .line 61
    invoke-virtual {p0, p1}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->U(Lcom/zykj/study/bean/course/CatalogBean;)V

    .line 62
    .line 63
    .line 64
    :cond_3
    :goto_0
    return-void
.end method

.method public static synthetic q(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lcom/zykj/study/data/MyCourseEntity;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->v0(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lcom/zykj/study/data/MyCourseEntity;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final q0(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lm1/c;Lm1/a;I)V
    .locals 0

    .line 1
    const-string p1, "<unused var>"

    .line 2
    .line 3
    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p3, :cond_1

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    if-eq p3, p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->l:Lp4/a;

    .line 13
    .line 14
    if-eqz p1, :cond_2

    .line 15
    .line 16
    invoke-virtual {p1}, Lp4/a;->D()Lcom/zykj/study/bean/course/CatalogBean;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-eqz p1, :cond_2

    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CatalogBean;->getId()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-virtual {p0, p1}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->S(I)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->l:Lp4/a;

    .line 31
    .line 32
    if-eqz p1, :cond_2

    .line 33
    .line 34
    invoke-virtual {p1}, Lp4/a;->D()Lcom/zykj/study/bean/course/CatalogBean;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    if-eqz p1, :cond_2

    .line 39
    .line 40
    invoke-virtual {p0, p1}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->W(Lcom/zykj/study/bean/course/CatalogBean;)V

    .line 41
    .line 42
    .line 43
    :cond_2
    :goto_0
    return-void
.end method

.method public static synthetic r(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)Lcom/zykj/study/adapter/CatalogEditAdapter;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->O(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)Lcom/zykj/study/adapter/CatalogEditAdapter;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;ILcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->R(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;ILcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V

    return-void
.end method

.method public static final s0(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Landroid/view/View;)V
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

.method public static synthetic t(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->i0(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V

    return-void
.end method

.method public static final t0(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lcom/zykj/study/data/MyCourseEntity;)Lh7/p;
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/databinding/FragmentMyCourseDetailsBinding;

    .line 8
    .line 9
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentMyCourseDetailsBinding;->toolbar2:Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CourseBean;->getTitle()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->t(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    sget v0, Lcom/zykj/study/R$string;->arrow_left_return:I

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->p(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    sget v0, Lcom/zykj/study/R$drawable;->ic_arrow_left:I

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->o(I)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sget v1, Lcom/zykj/study/R$color;->toolbar_back_icon_color:I

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->r(I)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sget v1, Lcom/zykj/lib/ui/R$dimen;->text_9:I

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    int-to-float v0, v0

    .line 60
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->s(F)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    sget v1, Lcom/zykj/lib/ui/R$dimen;->text_9:I

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    int-to-float v0, v0

    .line 75
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->v(F)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    const/4 v0, 0x0

    .line 80
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->q(Z)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    const/4 v0, 0x1

    .line 85
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->l(Z)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    new-instance v0, Lb5/n2;

    .line 90
    .line 91
    invoke-direct {v0, p0}, Lb5/n2;-><init>(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->n(Landroid/view/View$OnClickListener;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    const-string v0, "setLeftClickListener(...)"

    .line 99
    .line 100
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->j()V

    .line 104
    .line 105
    .line 106
    sget v0, Lcom/zykj/study/R$drawable;->ic_menu:I

    .line 107
    .line 108
    new-instance v1, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$c;

    .line 109
    .line 110
    invoke-direct {v1, p0, v0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$c;-><init>(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;I)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1, v1}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->a(Lcom/xuexiang/xui/widget/actionbar/TitleBar$a;)Landroid/view/View;

    .line 114
    .line 115
    .line 116
    :cond_0
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 117
    .line 118
    return-object p0
.end method

.method public static synthetic u(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lcom/zykj/study/data/MyCourseEntity;)Lh7/p;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->t0(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lcom/zykj/study/data/MyCourseEntity;)Lh7/p;

    move-result-object p0

    return-object p0
.end method

.method public static final u0(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Landroid/view/View;)V
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

.method public static synthetic v(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lm1/c;Lm1/a;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->m0(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lm1/c;Lm1/a;I)V

    return-void
.end method

.method public static final v0(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lcom/zykj/study/data/MyCourseEntity;)Lh7/p;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/zykj/study/databinding/FragmentMyCourseDetailsBinding;

    .line 8
    .line 9
    iget-object p0, p0, Lcom/zykj/study/databinding/FragmentMyCourseDetailsBinding;->courseSynopsis:Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBinding;

    .line 10
    .line 11
    iget-object p0, p0, Lcom/zykj/study/databinding/LayoutMyCourseSynopsisBinding;->expandTextView:Lcom/xuexiang/xui/widget/textview/ExpandableTextView;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CourseBean;->getDescription()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/textview/ExpandableTextView;->setText(Ljava/lang/CharSequence;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    sget-object p0, Lh7/p;->a:Lh7/p;

    .line 21
    .line 22
    return-object p0
.end method

.method public static synthetic w(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->k0(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;Lcom/xuexiang/xui/widget/dialog/materialdialog/DialogAction;)V

    return-void
.end method

.method public static final w0(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->d0()Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->Y()Lcom/zykj/study/ui/home/my/MyCourseDetailsFragmentArgs;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragmentArgs;->a()Lcom/zykj/study/data/MyCourseEntity;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Lcom/zykj/study/bean/course/CourseBean;->getId()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    invoke-virtual {p1, p0}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->g(I)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public static synthetic x(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->u0(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final x0(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$d;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$d;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$d;-><init>(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static synthetic y(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->g0(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic z(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->w0(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final A0()V
    .locals 5

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    const-string v1, "\u7ae0\u8282\u540d"

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->j(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->b:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->k(Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v1, Lb5/s2;

    .line 23
    .line 24
    invoke-direct {v1, p0}, Lb5/s2;-><init>(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)V

    .line 25
    .line 26
    .line 27
    const-string v2, "\u8bf7\u8f93\u5165\u7ae0\u8282\u540d\u79f0"

    .line 28
    .line 29
    const-string v3, ""

    .line 30
    .line 31
    const/4 v4, 0x0

    .line 32
    invoke-virtual {v0, v2, v3, v4, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->n(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZLcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$h;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const/16 v1, 0xf

    .line 37
    .line 38
    invoke-virtual {v0, v4, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->o(II)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    sget v1, Lcom/zykj/study/R$string;->sure:I

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->z(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    sget v1, Lcom/zykj/study/R$string;->cancel:I

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->t(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->E()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public final C0(I)V
    .locals 4

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    const-string v1, "\u77e5\u8bc6\u70b9\u540d\u79f0"

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->j(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->b:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->k(Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v1, Lb5/q2;

    .line 23
    .line 24
    invoke-direct {v1, p0, p1}, Lb5/q2;-><init>(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;I)V

    .line 25
    .line 26
    .line 27
    const-string p1, "\u8bf7\u8f93\u5165\u77e5\u8bc6\u70b9\u540d\u79f0"

    .line 28
    .line 29
    const-string v2, ""

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    invoke-virtual {v0, p1, v2, v3, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->n(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZLcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$h;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const/16 v0, 0xf

    .line 37
    .line 38
    invoke-virtual {p1, v3, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->o(II)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    sget v0, Lcom/zykj/study/R$string;->sure:I

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->z(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    sget v0, Lcom/zykj/study/R$string;->cancel:I

    .line 49
    .line 50
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->t(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p1, v3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->e(Z)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->E()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public final E0(Ljava/util/List;)Ljava/util/List;
    .locals 28

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    invoke-static {v2, v1}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const/4 v3, 0x0

    .line 19
    move v4, v3

    .line 20
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_4

    .line 25
    .line 26
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    add-int/lit8 v13, v4, 0x1

    .line 31
    .line 32
    if-gez v4, :cond_0

    .line 33
    .line 34
    invoke-static {}, Li7/v;->w()V

    .line 35
    .line 36
    .line 37
    :cond_0
    move-object v6, v5

    .line 38
    check-cast v6, Lcom/zykj/study/bean/course/CatalogBean;

    .line 39
    .line 40
    invoke-virtual {v6}, Lcom/zykj/study/bean/course/CatalogBean;->getChildren()Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    if-eqz v4, :cond_3

    .line 45
    .line 46
    new-instance v5, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-static {v4, v1}, Li7/w;->x(Ljava/lang/Iterable;I)I

    .line 49
    .line 50
    .line 51
    move-result v7

    .line 52
    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 53
    .line 54
    .line 55
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    move v7, v3

    .line 60
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v8

    .line 64
    if-eqz v8, :cond_2

    .line 65
    .line 66
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v8

    .line 70
    add-int/lit8 v21, v7, 0x1

    .line 71
    .line 72
    if-gez v7, :cond_1

    .line 73
    .line 74
    invoke-static {}, Li7/v;->w()V

    .line 75
    .line 76
    .line 77
    :cond_1
    move-object v14, v8

    .line 78
    check-cast v14, Lcom/zykj/study/bean/course/CatalogBean;

    .line 79
    .line 80
    const/16 v26, 0x7bf

    .line 81
    .line 82
    const/16 v27, 0x0

    .line 83
    .line 84
    const/4 v15, 0x0

    .line 85
    const/16 v16, 0x0

    .line 86
    .line 87
    const/16 v17, 0x0

    .line 88
    .line 89
    const/16 v18, 0x0

    .line 90
    .line 91
    const/16 v19, 0x0

    .line 92
    .line 93
    const/16 v20, 0x0

    .line 94
    .line 95
    const/16 v22, 0x0

    .line 96
    .line 97
    const/16 v23, 0x0

    .line 98
    .line 99
    const/16 v24, 0x0

    .line 100
    .line 101
    const/16 v25, 0x0

    .line 102
    .line 103
    invoke-static/range {v14 .. v27}, Lcom/zykj/study/bean/course/CatalogBean;->copy$default(Lcom/zykj/study/bean/course/CatalogBean;ILjava/lang/String;ZILjava/util/List;Ljava/util/List;ILcom/zykj/study/bean/course/StudyStatus;ZIIILjava/lang/Object;)Lcom/zykj/study/bean/course/CatalogBean;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    invoke-interface {v5, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move/from16 v7, v21

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_2
    :goto_2
    move-object v11, v5

    .line 114
    goto :goto_3

    .line 115
    :cond_3
    const/4 v5, 0x0

    .line 116
    goto :goto_2

    .line 117
    :goto_3
    const/16 v18, 0x7af

    .line 118
    .line 119
    const/16 v19, 0x0

    .line 120
    .line 121
    const/4 v7, 0x0

    .line 122
    const/4 v8, 0x0

    .line 123
    const/4 v9, 0x0

    .line 124
    const/4 v10, 0x0

    .line 125
    const/4 v12, 0x0

    .line 126
    const/4 v14, 0x0

    .line 127
    const/4 v15, 0x0

    .line 128
    const/16 v16, 0x0

    .line 129
    .line 130
    const/16 v17, 0x0

    .line 131
    .line 132
    invoke-static/range {v6 .. v19}, Lcom/zykj/study/bean/course/CatalogBean;->copy$default(Lcom/zykj/study/bean/course/CatalogBean;ILjava/lang/String;ZILjava/util/List;Ljava/util/List;ILcom/zykj/study/bean/course/StudyStatus;ZIIILjava/lang/Object;)Lcom/zykj/study/bean/course/CatalogBean;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move v4, v13

    .line 140
    goto :goto_0

    .line 141
    :cond_4
    return-object v0
.end method

.method public final Q(I)V
    .locals 2

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    const-string v1, "\u662f\u5426\u5220\u9664\u7ae0\u8282\uff1f"

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->j(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget v1, Lcom/zykj/study/R$string;->sure:I

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->z(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sget v1, Lcom/zykj/study/R$string;->cancel:I

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->t(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    new-instance v1, Lb5/l2;

    .line 29
    .line 30
    invoke-direct {v1, p0, p1}, Lb5/l2;-><init>(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->w(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$i;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    const/4 v0, 0x0

    .line 38
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->e(Z)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->E()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final S(I)V
    .locals 2

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    const-string v1, "\u662f\u5426\u5220\u9664\u77e5\u8bc6\u70b9\uff1f"

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->j(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget v1, Lcom/zykj/study/R$string;->sure:I

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->z(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sget v1, Lcom/zykj/study/R$string;->cancel:I

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->t(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    new-instance v1, Lb5/j2;

    .line 29
    .line 30
    invoke-direct {v1, p0, p1}, Lb5/j2;-><init>(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->w(Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$i;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->E()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final U(Lcom/zykj/study/bean/course/CatalogBean;)V
    .locals 4

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    const-string v1, "\u7f16\u8f91\u7ae0\u8282\u540d"

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->j(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->b:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->k(Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CatalogBean;->getTitle()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v2, Lb5/o2;

    .line 27
    .line 28
    invoke-direct {v2, p0, p1}, Lb5/o2;-><init>(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lcom/zykj/study/bean/course/CatalogBean;)V

    .line 29
    .line 30
    .line 31
    const-string p1, "\u8bf7\u8f93\u5165\u7ae0\u8282\u540d\u79f0"

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    invoke-virtual {v0, p1, v1, v3, v2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->n(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZLcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$h;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const/16 v0, 0xf

    .line 39
    .line 40
    invoke-virtual {p1, v3, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->o(II)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    sget v0, Lcom/zykj/study/R$string;->sure:I

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->z(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    sget v0, Lcom/zykj/study/R$string;->cancel:I

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->t(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p1, v3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->e(Z)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->E()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final W(Lcom/zykj/study/bean/course/CatalogBean;)V
    .locals 4

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    const-string v1, "\u7f16\u8f91\u77e5\u8bc6\u70b9"

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->j(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v1, Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;->b:Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->k(Lcom/xuexiang/xui/widget/dialog/materialdialog/GravityEnum;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {p1}, Lcom/zykj/study/bean/course/CatalogBean;->getTitle()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v2, Lb5/t2;

    .line 27
    .line 28
    invoke-direct {v2, p0, p1}, Lb5/t2;-><init>(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lcom/zykj/study/bean/course/CatalogBean;)V

    .line 29
    .line 30
    .line 31
    const-string p1, "\u8bf7\u8f93\u5165\u77e5\u8bc6\u70b9\u540d\u79f0"

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    invoke-virtual {v0, p1, v1, v3, v2}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->n(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZLcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$h;)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    const/16 v0, 0xf

    .line 39
    .line 40
    invoke-virtual {p1, v3, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->o(II)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    sget v0, Lcom/zykj/study/R$string;->sure:I

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->z(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    sget v0, Lcom/zykj/study/R$string;->cancel:I

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->t(I)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p1, v3}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->e(Z)Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog$g;->E()Lcom/xuexiang/xui/widget/dialog/materialdialog/MaterialDialog;

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final Y()Lcom/zykj/study/ui/home/my/MyCourseDetailsFragmentArgs;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->f:Landroidx/navigation/NavArgsLazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragmentArgs;

    .line 8
    .line 9
    return-object v0
.end method

.method public final Z()Lcom/zykj/study/adapter/CatalogEditAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->r:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/adapter/CatalogEditAdapter;

    .line 8
    .line 9
    return-object v0
.end method

.method public final b0()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->t:Landroid/view/View;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c0()Lkotlin/Pair;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->s:Lkotlin/Pair;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d0()Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->h:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public final e0()Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$d;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->v:Lh7/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lh7/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$d;

    .line 8
    .line 9
    return-object v0
.end method

.method public initData(Lm7/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->m:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->m:Ljava/util/List;

    .line 7
    .line 8
    new-instance v0, Lm1/a;

    .line 9
    .line 10
    sget v1, Lcom/zykj/study/R$string;->modify_course_info:I

    .line 11
    .line 12
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sget v2, Lcom/zykj/study/R$drawable;->ic_edit:I

    .line 17
    .line 18
    invoke-direct {v0, v1, v2}, Lm1/a;-><init>(Ljava/lang/CharSequence;I)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->m:Ljava/util/List;

    .line 25
    .line 26
    new-instance v0, Lm1/a;

    .line 27
    .line 28
    sget v1, Lcom/zykj/study/R$string;->course_delete:I

    .line 29
    .line 30
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    sget v2, Lcom/zykj/study/R$drawable;->ic_delete:I

    .line 35
    .line 36
    invoke-direct {v0, v1, v2}, Lm1/a;-><init>(Ljava/lang/CharSequence;I)V

    .line 37
    .line 38
    .line 39
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->m:Ljava/util/List;

    .line 43
    .line 44
    new-instance v0, Lm1/a;

    .line 45
    .line 46
    sget v1, Lcom/zykj/study/R$string;->subscribe_management:I

    .line 47
    .line 48
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    sget v2, Lcom/zykj/study/R$drawable;->ic_subscribe:I

    .line 53
    .line 54
    invoke-direct {v0, v1, v2}, Lm1/a;-><init>(Ljava/lang/CharSequence;I)V

    .line 55
    .line 56
    .line 57
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->m:Ljava/util/List;

    .line 61
    .line 62
    new-instance v0, Lm1/a;

    .line 63
    .line 64
    sget v1, Lcom/zykj/study/R$string;->authorized_use:I

    .line 65
    .line 66
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    sget v2, Lcom/zykj/study/R$drawable;->ic_authorized:I

    .line 71
    .line 72
    invoke-direct {v0, v1, v2}, Lm1/a;-><init>(Ljava/lang/CharSequence;I)V

    .line 73
    .line 74
    .line 75
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->n:Ljava/util/List;

    .line 79
    .line 80
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->n:Ljava/util/List;

    .line 84
    .line 85
    new-instance v0, Lm1/a;

    .line 86
    .line 87
    sget v1, Lcom/zykj/study/R$string;->add_chapter:I

    .line 88
    .line 89
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    sget v2, Lcom/zykj/study/R$mipmap;->icon_chapter:I

    .line 94
    .line 95
    invoke-direct {v0, v1, v2}, Lm1/a;-><init>(Ljava/lang/CharSequence;I)V

    .line 96
    .line 97
    .line 98
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->n:Ljava/util/List;

    .line 102
    .line 103
    new-instance v0, Lm1/a;

    .line 104
    .line 105
    sget v1, Lcom/zykj/study/R$string;->add_knowledge:I

    .line 106
    .line 107
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    sget v2, Lcom/zykj/study/R$mipmap;->icon_knowledge:I

    .line 112
    .line 113
    invoke-direct {v0, v1, v2}, Lm1/a;-><init>(Ljava/lang/CharSequence;I)V

    .line 114
    .line 115
    .line 116
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->p:Ljava/util/List;

    .line 120
    .line 121
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 122
    .line 123
    .line 124
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->p:Ljava/util/List;

    .line 125
    .line 126
    new-instance v0, Lm1/a;

    .line 127
    .line 128
    sget v1, Lcom/zykj/study/R$string;->edit_chapter:I

    .line 129
    .line 130
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    sget v2, Lcom/zykj/study/R$mipmap;->icon_edit:I

    .line 135
    .line 136
    invoke-direct {v0, v1, v2}, Lm1/a;-><init>(Ljava/lang/CharSequence;I)V

    .line 137
    .line 138
    .line 139
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->p:Ljava/util/List;

    .line 143
    .line 144
    new-instance v0, Lm1/a;

    .line 145
    .line 146
    sget v1, Lcom/zykj/study/R$string;->add_knowledge:I

    .line 147
    .line 148
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    sget v2, Lcom/zykj/study/R$mipmap;->icon_knowledge:I

    .line 153
    .line 154
    invoke-direct {v0, v1, v2}, Lm1/a;-><init>(Ljava/lang/CharSequence;I)V

    .line 155
    .line 156
    .line 157
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->p:Ljava/util/List;

    .line 161
    .line 162
    new-instance v0, Lm1/a;

    .line 163
    .line 164
    sget v1, Lcom/zykj/study/R$string;->delete_chapter:I

    .line 165
    .line 166
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    sget v2, Lcom/zykj/study/R$mipmap;->icon_delete:I

    .line 171
    .line 172
    invoke-direct {v0, v1, v2}, Lm1/a;-><init>(Ljava/lang/CharSequence;I)V

    .line 173
    .line 174
    .line 175
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->o:Ljava/util/List;

    .line 179
    .line 180
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 181
    .line 182
    .line 183
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->o:Ljava/util/List;

    .line 184
    .line 185
    new-instance v0, Lm1/a;

    .line 186
    .line 187
    sget v1, Lcom/zykj/study/R$string;->edit_knowledge:I

    .line 188
    .line 189
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    sget v2, Lcom/zykj/study/R$mipmap;->icon_edit:I

    .line 194
    .line 195
    invoke-direct {v0, v1, v2}, Lm1/a;-><init>(Ljava/lang/CharSequence;I)V

    .line 196
    .line 197
    .line 198
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    iget-object p1, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->o:Ljava/util/List;

    .line 202
    .line 203
    new-instance v0, Lm1/a;

    .line 204
    .line 205
    sget v1, Lcom/zykj/study/R$string;->delete_knowledge:I

    .line 206
    .line 207
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    sget v2, Lcom/zykj/study/R$mipmap;->icon_delete:I

    .line 212
    .line 213
    invoke-direct {v0, v1, v2}, Lm1/a;-><init>(Ljava/lang/CharSequence;I)V

    .line 214
    .line 215
    .line 216
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->d0()Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->Y()Lcom/zykj/study/ui/home/my/MyCourseDetailsFragmentArgs;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    invoke-virtual {v0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragmentArgs;->a()Lcom/zykj/study/data/MyCourseEntity;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-virtual {v0}, Lcom/zykj/study/bean/course/CourseBean;->getId()I

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    invoke-virtual {p1, v0}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->n(I)V

    .line 236
    .line 237
    .line 238
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 239
    .line 240
    return-object p1
.end method

.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->r0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->e0()Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$d;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-static {p1}, Lcom/blankj/utilcode/util/NetworkUtils;->i(Lcom/blankj/utilcode/util/NetworkUtils$b;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string p2, "getViewLifecycleOwner(...)"

    .line 16
    .line 17
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-instance v3, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$2;

    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    invoke-direct {v3, p0, p1}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$2;-><init>(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lm7/c;)V

    .line 28
    .line 29
    .line 30
    const/4 v4, 0x3

    .line 31
    const/4 v5, 0x0

    .line 32
    const/4 v1, 0x0

    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-static/range {v0 .. v5}, Li8/f;->d(Li8/b0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lx7/p;ILjava/lang/Object;)Lkotlinx/coroutines/n;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->Z()Lcom/zykj/study/adapter/CatalogEditAdapter;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    new-instance v1, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$3;

    .line 42
    .line 43
    invoke-direct {v1, p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$3;-><init>(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->T(Ls0/f;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->Z()Lcom/zykj/study/adapter/CatalogEditAdapter;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->r()Lt0/a;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    const/4 v1, 0x1

    .line 58
    invoke-virtual {v0, v1}, Lt0/a;->s(Z)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Lt0/a;->c()Lcom/chad/library/adapter/base/dragswipe/DragAndSwipeCallback;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    const/4 v2, 0x3

    .line 66
    invoke-virtual {v1, v2}, Lcom/chad/library/adapter/base/dragswipe/DragAndSwipeCallback;->b(I)V

    .line 67
    .line 68
    .line 69
    new-instance v1, Landroidx/recyclerview/widget/ItemTouchHelper;

    .line 70
    .line 71
    new-instance v2, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$4$1;

    .line 72
    .line 73
    invoke-direct {v2, v0, p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$4$1;-><init>(Lt0/a;Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)V

    .line 74
    .line 75
    .line 76
    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/ItemTouchHelper;-><init>(Landroidx/recyclerview/widget/ItemTouchHelper$Callback;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v1}, Lt0/a;->t(Landroidx/recyclerview/widget/ItemTouchHelper;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->Z()Lcom/zykj/study/adapter/CatalogEditAdapter;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->r()Lt0/a;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    new-instance v1, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$5;

    .line 91
    .line 92
    invoke-direct {v1, p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$5;-><init>(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v1}, Lt0/a;->v(Ls0/e;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    check-cast v0, Lcom/zykj/study/databinding/FragmentMyCourseDetailsBinding;

    .line 103
    .line 104
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentMyCourseDetailsBinding;->courseCatalog:Lcom/zykj/study/databinding/LayoutMyCourseDetailsCatalogBinding;

    .line 105
    .line 106
    iget-object v0, v0, Lcom/zykj/study/databinding/LayoutMyCourseDetailsCatalogBinding;->recycle:Landroidx/recyclerview/widget/RecyclerView;

    .line 107
    .line 108
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->Z()Lcom/zykj/study/adapter/CatalogEditAdapter;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    check-cast v0, Lcom/zykj/study/databinding/FragmentMyCourseDetailsBinding;

    .line 120
    .line 121
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->d0()Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-virtual {v0, v1}, Lcom/zykj/study/databinding/FragmentMyCourseDetailsBinding;->setDetailsEntity(Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    check-cast v0, Lcom/zykj/study/databinding/FragmentMyCourseDetailsBinding;

    .line 133
    .line 134
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->a0()Lcom/zykj/study/viewmodels/DictViewModel;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-virtual {v0, v1}, Lcom/zykj/study/databinding/FragmentMyCourseDetailsBinding;->setDictViewModel(Lcom/zykj/study/viewmodels/DictViewModel;)V

    .line 139
    .line 140
    .line 141
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->f0()V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-static {v0, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 152
    .line 153
    .line 154
    move-result-object p2

    .line 155
    new-instance v0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$7;

    .line 156
    .line 157
    invoke-direct {v0, p0, p1}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$initView$7;-><init>(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;Lm7/c;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p2, v0}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenResumed(Lx7/p;)Lkotlinx/coroutines/n;

    .line 161
    .line 162
    .line 163
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->d0()Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    invoke-virtual {p1}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->j()Landroidx/lifecycle/LiveData;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 172
    .line 173
    .line 174
    move-result-object p2

    .line 175
    new-instance v0, Lb5/e2;

    .line 176
    .line 177
    invoke-direct {v0, p0}, Lb5/e2;-><init>(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)V

    .line 178
    .line 179
    .line 180
    new-instance v1, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$e;

    .line 181
    .line 182
    invoke-direct {v1, v0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$e;-><init>(Lx7/l;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1, p2, v1}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    check-cast p1, Lcom/zykj/study/databinding/FragmentMyCourseDetailsBinding;

    .line 193
    .line 194
    iget-object p1, p1, Lcom/zykj/study/databinding/FragmentMyCourseDetailsBinding;->courseCatalog:Lcom/zykj/study/databinding/LayoutMyCourseDetailsCatalogBinding;

    .line 195
    .line 196
    iget-object p1, p1, Lcom/zykj/study/databinding/LayoutMyCourseDetailsCatalogBinding;->multipleStatusView:Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;

    .line 197
    .line 198
    new-instance p2, Lb5/p2;

    .line 199
    .line 200
    invoke-direct {p2, p0}, Lb5/p2;-><init>(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->setOnRetryClickListener(Landroid/view/View$OnClickListener;)V

    .line 204
    .line 205
    .line 206
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 207
    .line 208
    return-object p1
.end method

.method public final l0()V
    .locals 6

    .line 1
    new-instance v0, Lp4/y;

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
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v3, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->m:Ljava/util/List;

    .line 13
    .line 14
    invoke-direct {v0, v1, v3}, Lp4/y;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    sget v3, Lcom/zykj/lib/ui/R$dimen;->view_70:I

    .line 22
    .line 23
    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    new-instance v3, Lb5/f2;

    .line 28
    .line 29
    invoke-direct {v3, p0}, Lb5/f2;-><init>(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)V

    .line 30
    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    invoke-virtual {v0, v1, v4, v3}, Lp2/d;->z(IILp2/d$b;)Lp2/d;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Lp4/y;

    .line 38
    .line 39
    const/4 v1, 0x1

    .line 40
    invoke-virtual {v0, v1}, Lp2/d;->B(Z)Lp2/d;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Lp4/y;

    .line 45
    .line 46
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->i:Lp4/y;

    .line 47
    .line 48
    new-instance v0, Lp4/y;

    .line 49
    .line 50
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-static {v3, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    iget-object v5, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->n:Ljava/util/List;

    .line 58
    .line 59
    invoke-direct {v0, v3, v5}, Lp4/y;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    sget v5, Lcom/zykj/lib/ui/R$dimen;->view_70:I

    .line 67
    .line 68
    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    new-instance v5, Lb5/g2;

    .line 73
    .line 74
    invoke-direct {v5, p0}, Lb5/g2;-><init>(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v3, v4, v5}, Lp2/d;->z(IILp2/d$b;)Lp2/d;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, Lp4/y;

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Lp2/d;->B(Z)Lp2/d;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    check-cast v0, Lp4/y;

    .line 88
    .line 89
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->j:Lp4/y;

    .line 90
    .line 91
    new-instance v0, Lp4/a;

    .line 92
    .line 93
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-static {v3, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    iget-object v5, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->p:Ljava/util/List;

    .line 101
    .line 102
    invoke-direct {v0, v3, v5}, Lp4/a;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    sget v5, Lcom/zykj/lib/ui/R$dimen;->view_70:I

    .line 110
    .line 111
    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    new-instance v5, Lb5/h2;

    .line 116
    .line 117
    invoke-direct {v5, p0}, Lb5/h2;-><init>(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v3, v4, v5}, Lp2/d;->z(IILp2/d$b;)Lp2/d;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    check-cast v0, Lp4/a;

    .line 125
    .line 126
    invoke-virtual {v0, v1}, Lp2/d;->B(Z)Lp2/d;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    check-cast v0, Lp4/a;

    .line 131
    .line 132
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->k:Lp4/a;

    .line 133
    .line 134
    new-instance v0, Lp4/a;

    .line 135
    .line 136
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    invoke-static {v3, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    iget-object v2, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->o:Ljava/util/List;

    .line 144
    .line 145
    invoke-direct {v0, v3, v2}, Lp4/a;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    sget v3, Lcom/zykj/lib/ui/R$dimen;->view_70:I

    .line 153
    .line 154
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    new-instance v3, Lb5/i2;

    .line 159
    .line 160
    invoke-direct {v3, p0}, Lb5/i2;-><init>(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0, v2, v4, v3}, Lp2/d;->z(IILp2/d$b;)Lp2/d;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    check-cast v0, Lp4/a;

    .line 168
    .line 169
    invoke-virtual {v0, v1}, Lp2/d;->B(Z)Lp2/d;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    check-cast v0, Lp4/a;

    .line 174
    .line 175
    iput-object v0, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->l:Lp4/a;

    .line 176
    .line 177
    return-void
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->fragment_my_course_details:I

    .line 2
    .line 3
    return v0
.end method

.method public onDestroyView()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDestroyView()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->e0()Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$d;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {v0}, Lcom/blankj/utilcode/util/NetworkUtils;->j(Lcom/blankj/utilcode/util/NetworkUtils$b;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final r0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/zykj/study/databinding/FragmentMyCourseDetailsBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/zykj/study/databinding/FragmentMyCourseDetailsBinding;->toolbar2:Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 8
    .line 9
    sget v1, Lcom/zykj/study/R$string;->arrow_left_return:I

    .line 10
    .line 11
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->p(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sget v1, Lcom/zykj/study/R$drawable;->ic_arrow_left:I

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->o(I)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    sget v2, Lcom/zykj/study/R$color;->toolbar_back_icon_color:I

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->r(I)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    sget v2, Lcom/zykj/lib/ui/R$dimen;->text_9:I

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    int-to-float v1, v1

    .line 50
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->s(F)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    sget v2, Lcom/zykj/lib/ui/R$dimen;->text_9:I

    .line 59
    .line 60
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    int-to-float v1, v1

    .line 65
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->v(F)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    const/4 v1, 0x0

    .line 70
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->q(Z)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    const/4 v1, 0x1

    .line 75
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->l(Z)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    new-instance v1, Lb5/w2;

    .line 80
    .line 81
    invoke-direct {v1, p0}, Lb5/w2;-><init>(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->n(Landroid/view/View$OnClickListener;)Lcom/xuexiang/xui/widget/actionbar/TitleBar;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    sget v1, Lcom/zykj/study/R$drawable;->ic_menu:I

    .line 89
    .line 90
    new-instance v2, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$b;

    .line 91
    .line 92
    invoke-direct {v2, p0, v1}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$b;-><init>(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;I)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v2}, Lcom/xuexiang/xui/widget/actionbar/TitleBar;->a(Lcom/xuexiang/xui/widget/actionbar/TitleBar$a;)Landroid/view/View;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->d0()Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-virtual {v0}, Lcom/zykj/study/viewmodels/MyCourseDetailsViewModel;->j()Landroidx/lifecycle/LiveData;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    new-instance v2, Lb5/x2;

    .line 111
    .line 112
    invoke-direct {v2, p0}, Lb5/x2;-><init>(Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;)V

    .line 113
    .line 114
    .line 115
    new-instance v3, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$e;

    .line 116
    .line 117
    invoke-direct {v3, v2}, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment$e;-><init>(Lx7/l;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 121
    .line 122
    .line 123
    return-void
.end method

.method public final y0(Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->t:Landroid/view/View;

    .line 2
    .line 3
    return-void
.end method

.method public final z0(Lkotlin/Pair;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/study/ui/home/my/MyCourseDetailsFragment;->s:Lkotlin/Pair;

    .line 7
    .line 8
    return-void
.end method
