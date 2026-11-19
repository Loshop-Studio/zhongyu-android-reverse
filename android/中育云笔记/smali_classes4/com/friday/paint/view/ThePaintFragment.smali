.class public Lcom/friday/paint/view/ThePaintFragment;
.super Lcom/friday/paint/view/Hilt_ThePaintFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/paint/view/ThePaintFragment$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/friday/paint/view/Hilt_ThePaintFragment<",
        "Lcom/friday/paint/databinding/FragmentThePaintBinding;",
        ">;"
    }
.end annotation


# static fields
.field public static final m:Lcom/friday/paint/view/ThePaintFragment$a;

.field public static final n:I


# instance fields
.field public final i:Lqc/d;

.field public final j:Lqc/d;

.field public k:Lj2/b;

.field public final l:Lqc/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/friday/paint/view/ThePaintFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/friday/paint/view/ThePaintFragment$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/friday/paint/view/ThePaintFragment;->m:Lcom/friday/paint/view/ThePaintFragment$a;

    const/16 v0, 0x8

    sput v0, Lcom/friday/paint/view/ThePaintFragment;->n:I

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/friday/paint/view/Hilt_ThePaintFragment;-><init>()V

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
    new-instance v1, Lcom/friday/paint/view/ThePaintFragment$special$$inlined$activityViewModels$default$1;

    .line 11
    .line 12
    invoke-direct {v1, p0}, Lcom/friday/paint/view/ThePaintFragment$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/friday/paint/view/ThePaintFragment$special$$inlined$activityViewModels$default$2;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v2, v3, p0}, Lcom/friday/paint/view/ThePaintFragment$special$$inlined$activityViewModels$default$2;-><init>(Lhd/a;Landroidx/fragment/app/Fragment;)V

    .line 19
    .line 20
    .line 21
    new-instance v3, Lcom/friday/paint/view/ThePaintFragment$special$$inlined$activityViewModels$default$3;

    .line 22
    .line 23
    invoke-direct {v3, p0}, Lcom/friday/paint/view/ThePaintFragment$special$$inlined$activityViewModels$default$3;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, v0, v1, v2, v3}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lod/c;Lhd/a;Lhd/a;Lhd/a;)Lqc/d;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lcom/friday/paint/view/ThePaintFragment;->i:Lqc/d;

    .line 31
    .line 32
    new-instance v0, Lc4/r;

    .line 33
    .line 34
    invoke-direct {v0}, Lc4/r;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-static {v0}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iput-object v0, p0, Lcom/friday/paint/view/ThePaintFragment;->j:Lqc/d;

    .line 42
    .line 43
    new-instance v0, Lc4/c0;

    .line 44
    .line 45
    invoke-direct {v0, p0}, Lc4/c0;-><init>(Lcom/friday/paint/view/ThePaintFragment;)V

    .line 46
    .line 47
    .line 48
    invoke-static {v0}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iput-object v0, p0, Lcom/friday/paint/view/ThePaintFragment;->l:Lqc/d;

    .line 53
    .line 54
    return-void
.end method

.method public static synthetic A(Lcom/friday/paint/view/ThePaintFragment;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/paint/view/ThePaintFragment;->E0(Lcom/friday/paint/view/ThePaintFragment;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final A0(Lcom/friday/paint/databinding/ItemPaintPenColorBinding;Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p2, v0}, Landroid/view/View;->setSelected(Z)V

    .line 3
    .line 4
    .line 5
    iget-object p2, p0, Lcom/friday/paint/databinding/ItemPaintPenColorBinding;->d:Landroid/widget/ImageView;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lcom/friday/paint/databinding/ItemPaintPenColorBinding;->e:Landroid/widget/ImageView;

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p1}, Lcom/friday/paint/view/ThePaintFragment;->v0()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Lcom/friday/paint/viewmodel/NoteViewModel;->E()Landroidx/lifecycle/MutableLiveData;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Lcom/zykj/sketch/core/config/GraphConfig;

    .line 29
    .line 30
    if-eqz p0, :cond_0

    .line 31
    .line 32
    invoke-direct {p1}, Lcom/friday/paint/view/ThePaintFragment;->v0()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Lcom/friday/paint/viewmodel/NoteViewModel;->E()Landroidx/lifecycle/MutableLiveData;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    new-instance p2, Lcom/zykj/sketch/core/config/GraphConfig;

    .line 41
    .line 42
    const/high16 v0, 0x40400000    # 3.0f

    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/zykj/sketch/core/config/GraphConfig;->getColor()I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    invoke-direct {p2, v0, p0}, Lcom/zykj/sketch/core/config/GraphConfig;-><init>(FI)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, p2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    :cond_0
    return-void
.end method

.method public static synthetic B(Lcom/friday/paint/view/ThePaintFragment;I)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/ThePaintFragment;->O0(Lcom/friday/paint/view/ThePaintFragment;I)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final B0(Lcom/friday/paint/databinding/ItemPaintPenColorBinding;Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p2, v0}, Landroid/view/View;->setSelected(Z)V

    .line 3
    .line 4
    .line 5
    iget-object p2, p0, Lcom/friday/paint/databinding/ItemPaintPenColorBinding;->c:Landroid/widget/ImageView;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lcom/friday/paint/databinding/ItemPaintPenColorBinding;->e:Landroid/widget/ImageView;

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p1}, Lcom/friday/paint/view/ThePaintFragment;->v0()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Lcom/friday/paint/viewmodel/NoteViewModel;->E()Landroidx/lifecycle/MutableLiveData;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Lcom/zykj/sketch/core/config/GraphConfig;

    .line 29
    .line 30
    if-eqz p0, :cond_0

    .line 31
    .line 32
    invoke-direct {p1}, Lcom/friday/paint/view/ThePaintFragment;->v0()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Lcom/friday/paint/viewmodel/NoteViewModel;->E()Landroidx/lifecycle/MutableLiveData;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    new-instance p2, Lcom/zykj/sketch/core/config/GraphConfig;

    .line 41
    .line 42
    const/high16 v0, 0x41000000    # 8.0f

    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/zykj/sketch/core/config/GraphConfig;->getColor()I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    invoke-direct {p2, v0, p0}, Lcom/zykj/sketch/core/config/GraphConfig;-><init>(FI)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, p2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    :cond_0
    return-void
.end method

.method public static synthetic C(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/ThePaintFragment;->Z0(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final C0(Lcom/friday/paint/databinding/ItemPaintPenColorBinding;Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p2, v0}, Landroid/view/View;->setSelected(Z)V

    .line 3
    .line 4
    .line 5
    iget-object p2, p0, Lcom/friday/paint/databinding/ItemPaintPenColorBinding;->c:Landroid/widget/ImageView;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lcom/friday/paint/databinding/ItemPaintPenColorBinding;->d:Landroid/widget/ImageView;

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p1}, Lcom/friday/paint/view/ThePaintFragment;->v0()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Lcom/friday/paint/viewmodel/NoteViewModel;->E()Landroidx/lifecycle/MutableLiveData;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Lcom/zykj/sketch/core/config/GraphConfig;

    .line 29
    .line 30
    if-eqz p0, :cond_0

    .line 31
    .line 32
    invoke-direct {p1}, Lcom/friday/paint/view/ThePaintFragment;->v0()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Lcom/friday/paint/viewmodel/NoteViewModel;->E()Landroidx/lifecycle/MutableLiveData;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    new-instance p2, Lcom/zykj/sketch/core/config/GraphConfig;

    .line 41
    .line 42
    const/high16 v0, 0x41700000    # 15.0f

    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/zykj/sketch/core/config/GraphConfig;->getColor()I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    invoke-direct {p2, v0, p0}, Lcom/zykj/sketch/core/config/GraphConfig;-><init>(FI)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, p2}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    :cond_0
    return-void
.end method

.method public static synthetic D(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/ThePaintFragment;->n0(Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static final D0(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V
    .locals 13

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 6
    .line 7
    iget-object p1, p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;->G:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    const/4 v0, 0x2

    .line 14
    const/4 v1, 0x1

    .line 15
    const/4 v2, 0x3

    .line 16
    const/4 v3, 0x0

    .line 17
    const-string v4, "ivExpansion"

    .line 18
    .line 19
    const-string v5, "penEraser"

    .line 20
    .line 21
    const-string v6, "tooBox"

    .line 22
    .line 23
    if-nez p1, :cond_0

    .line 24
    .line 25
    sget-object v7, Lf2/a;->a:Lf2/a;

    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 32
    .line 33
    iget-object p1, p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;->G:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 34
    .line 35
    invoke-static {p1, v6}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    check-cast v6, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 43
    .line 44
    iget-object v6, v6, Lcom/friday/paint/databinding/FragmentThePaintBinding;->A:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 45
    .line 46
    invoke-static {v6, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    check-cast v5, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 54
    .line 55
    iget-object v5, v5, Lcom/friday/paint/databinding/FragmentThePaintBinding;->o:Landroid/widget/ImageView;

    .line 56
    .line 57
    invoke-static {v5, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    new-array v11, v2, [Landroid/view/View;

    .line 61
    .line 62
    aput-object p1, v11, v3

    .line 63
    .line 64
    aput-object v6, v11, v1

    .line 65
    .line 66
    aput-object v5, v11, v0

    .line 67
    .line 68
    new-instance v12, Lc4/r0;

    .line 69
    .line 70
    invoke-direct {v12, p0}, Lc4/r0;-><init>(Lcom/friday/paint/view/ThePaintFragment;)V

    .line 71
    .line 72
    .line 73
    const-wide/16 v8, 0x1f4

    .line 74
    .line 75
    const/4 v10, 0x1

    .line 76
    invoke-virtual/range {v7 .. v12}, Lf2/a;->c(JZ[Landroid/view/View;Lhd/a;)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :cond_0
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    check-cast p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 85
    .line 86
    iget-object p1, p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;->G:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 87
    .line 88
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 89
    .line 90
    .line 91
    sget-object v7, Lf2/a;->a:Lf2/a;

    .line 92
    .line 93
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    check-cast p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 98
    .line 99
    iget-object p1, p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;->G:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 100
    .line 101
    invoke-static {p1, v6}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    check-cast v6, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 109
    .line 110
    iget-object v6, v6, Lcom/friday/paint/databinding/FragmentThePaintBinding;->A:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 111
    .line 112
    invoke-static {v6, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    check-cast v5, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 120
    .line 121
    iget-object v5, v5, Lcom/friday/paint/databinding/FragmentThePaintBinding;->o:Landroid/widget/ImageView;

    .line 122
    .line 123
    invoke-static {v5, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    new-array v11, v2, [Landroid/view/View;

    .line 127
    .line 128
    aput-object p1, v11, v3

    .line 129
    .line 130
    aput-object v6, v11, v1

    .line 131
    .line 132
    aput-object v5, v11, v0

    .line 133
    .line 134
    new-instance v12, Lc4/s0;

    .line 135
    .line 136
    invoke-direct {v12, p0}, Lc4/s0;-><init>(Lcom/friday/paint/view/ThePaintFragment;)V

    .line 137
    .line 138
    .line 139
    const-wide/16 v8, 0x1f4

    .line 140
    .line 141
    const/4 v10, 0x0

    .line 142
    invoke-virtual/range {v7 .. v12}, Lf2/a;->c(JZ[Landroid/view/View;Lhd/a;)V

    .line 143
    .line 144
    .line 145
    return-void
.end method

.method public static synthetic E(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/ThePaintFragment;->L0(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final E0(Lcom/friday/paint/view/ThePaintFragment;)Lqc/q;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->o:Landroid/widget/ImageView;

    .line 8
    .line 9
    sget v1, Lcom/friday/paint/R$drawable;->view_icon_expansion_right:I

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 19
    .line 20
    iget-object v0, v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->A:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 21
    .line 22
    const/16 v1, 0x8

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 32
    .line 33
    iget-object v0, v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->G:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 43
    .line 44
    iget-object v0, v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->D:Landroid/widget/RadioGroup;

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 54
    .line 55
    iget-object p0, p0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->c:Lcom/friday/paint/databinding/ItemPaintPenColorBinding;

    .line 56
    .line 57
    invoke-virtual {p0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 62
    .line 63
    .line 64
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 65
    .line 66
    return-object p0
.end method

.method public static synthetic F(Lcom/friday/paint/view/ThePaintFragment;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/paint/view/ThePaintFragment;->m0(Lcom/friday/paint/view/ThePaintFragment;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static final F0(Lcom/friday/paint/view/ThePaintFragment;)Lqc/q;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 6
    .line 7
    iget-object p0, p0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->o:Landroid/widget/ImageView;

    .line 8
    .line 9
    sget v0, Lcom/friday/paint/R$drawable;->view_icon_expansion_left:I

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 12
    .line 13
    .line 14
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 15
    .line 16
    return-object p0
.end method

.method public static synthetic G(Lcom/friday/paint/view/ThePaintFragment;Landroid/widget/RadioGroup;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/paint/view/ThePaintFragment;->z0(Lcom/friday/paint/view/ThePaintFragment;Landroid/widget/RadioGroup;I)V

    return-void
.end method

.method public static final G0(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/friday/paint/view/ThePaintFragment;->v0()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/friday/paint/viewmodel/NoteViewModel;->K()Landroidx/lifecycle/MutableLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lcom/zykj/sketch/core/config/SketchConfig;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-direct {p0}, Lcom/friday/paint/view/ThePaintFragment;->v0()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Lcom/friday/paint/viewmodel/NoteViewModel;->K()Landroidx/lifecycle/MutableLiveData;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    new-instance v1, Lcom/zykj/sketch/core/config/SketchConfig$Builder;

    .line 26
    .line 27
    invoke-direct {v1}, Lcom/zykj/sketch/core/config/SketchConfig$Builder;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/zykj/sketch/core/config/SketchConfig;->isTouchable()Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    xor-int/lit8 p1, p1, 0x1

    .line 35
    .line 36
    invoke-virtual {v1, p1}, Lcom/zykj/sketch/core/config/SketchConfig$Builder;->setTouchable(Z)Lcom/zykj/sketch/core/config/SketchConfig$Builder;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    const-string v1, "requireContext(...)"

    .line 45
    .line 46
    invoke-static {p0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, p0}, Lcom/zykj/sketch/core/config/SketchConfig$Builder;->build(Landroid/content/Context;)Lcom/zykj/sketch/core/config/SketchConfig;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {v0, p0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    :cond_0
    return-void
.end method

.method public static synthetic H(Lcom/friday/paint/view/ThePaintFragment;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/ThePaintFragment;->U0(Lcom/friday/paint/view/ThePaintFragment;Ljava/lang/Object;)V

    return-void
.end method

.method public static final H0(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/paint/view/ThePaintFragment;->o0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic I(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/ThePaintFragment;->G0(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final I0(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/paint/view/ThePaintFragment;->q0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic J(Lcom/friday/paint/databinding/ItemPaintPenColorBinding;Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/paint/view/ThePaintFragment;->C0(Lcom/friday/paint/databinding/ItemPaintPenColorBinding;Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final J0(Lcom/friday/paint/view/ThePaintFragment;Landroid/widget/RadioGroup;I)V
    .locals 0

    .line 1
    sget p1, Lcom/friday/paint/R$id;->rb_line:I

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/friday/paint/view/ThePaintFragment;->v0()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Lcom/friday/paint/viewmodel/NoteViewModel;->L()Landroidx/lifecycle/MutableLiveData;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    sget-object p1, Lcom/zykj/sketch/core/data/Mode;->ACTION_ERASER_WRITING:Lcom/zykj/sketch/core/data/Mode;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    sget p1, Lcom/friday/paint/R$id;->rb_image:I

    .line 20
    .line 21
    if-ne p2, p1, :cond_1

    .line 22
    .line 23
    invoke-direct {p0}, Lcom/friday/paint/view/ThePaintFragment;->v0()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Lcom/friday/paint/viewmodel/NoteViewModel;->L()Landroidx/lifecycle/MutableLiveData;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    sget-object p1, Lcom/zykj/sketch/core/data/Mode;->ACTION_ERASER_VIEW:Lcom/zykj/sketch/core/data/Mode;

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    return-void
.end method

.method public static synthetic K(Lcom/friday/paint/databinding/ItemPaintPenColorBinding;Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/paint/view/ThePaintFragment;->B0(Lcom/friday/paint/databinding/ItemPaintPenColorBinding;Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final K0(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 6
    .line 7
    iget-object p1, p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;->D:Landroid/widget/RadioGroup;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/widget/RadioGroup;->getCheckedRadioButtonId()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    const/4 v0, -0x1

    .line 14
    if-ne p1, v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 21
    .line 22
    iget-object p1, p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;->D:Landroid/widget/RadioGroup;

    .line 23
    .line 24
    sget v0, Lcom/friday/paint/R$id;->rb_line:I

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Landroid/widget/RadioGroup;->check(I)V

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-direct {p0}, Lcom/friday/paint/view/ThePaintFragment;->v0()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Lcom/friday/paint/viewmodel/NoteViewModel;->L()Landroidx/lifecycle/MutableLiveData;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 42
    .line 43
    iget-object v0, v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->D:Landroid/widget/RadioGroup;

    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/widget/RadioGroup;->getCheckedRadioButtonId()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    sget v1, Lcom/friday/paint/R$id;->rb_line:I

    .line 50
    .line 51
    if-ne v0, v1, :cond_1

    .line 52
    .line 53
    sget-object v0, Lcom/zykj/sketch/core/data/Mode;->ACTION_ERASER_WRITING:Lcom/zykj/sketch/core/data/Mode;

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    sget-object v0, Lcom/zykj/sketch/core/data/Mode;->ACTION_ERASER_VIEW:Lcom/zykj/sketch/core/data/Mode;

    .line 57
    .line 58
    :goto_0
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    check-cast p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 66
    .line 67
    iget-object p1, p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;->D:Landroid/widget/RadioGroup;

    .line 68
    .line 69
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    check-cast v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 74
    .line 75
    iget-object v0, v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->D:Landroid/widget/RadioGroup;

    .line 76
    .line 77
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    const/4 v1, 0x0

    .line 82
    const/16 v2, 0x8

    .line 83
    .line 84
    if-ne v0, v2, :cond_2

    .line 85
    .line 86
    move v0, v1

    .line 87
    goto :goto_1

    .line 88
    :cond_2
    move v0, v2

    .line 89
    :goto_1
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    check-cast p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 97
    .line 98
    iget-object p1, p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;->A:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 99
    .line 100
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    check-cast v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 105
    .line 106
    iget-object v0, v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->D:Landroid/widget/RadioGroup;

    .line 107
    .line 108
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-nez v0, :cond_3

    .line 113
    .line 114
    move v0, v1

    .line 115
    goto :goto_2

    .line 116
    :cond_3
    move v0, v2

    .line 117
    :goto_2
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    check-cast p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 125
    .line 126
    iget-object p1, p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;->c:Lcom/friday/paint/databinding/ItemPaintPenColorBinding;

    .line 127
    .line 128
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    check-cast p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 140
    .line 141
    iget-object p1, p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;->v:Landroid/widget/ImageView;

    .line 142
    .line 143
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    check-cast p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 151
    .line 152
    iget-object p1, p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;->r:Landroid/widget/ImageView;

    .line 153
    .line 154
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    check-cast p0, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 162
    .line 163
    iget-object p0, p0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->n:Landroid/widget/ImageView;

    .line 164
    .line 165
    const/4 p1, 0x1

    .line 166
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 167
    .line 168
    .line 169
    return-void
.end method

.method public static synthetic L(Lcom/friday/paint/view/ThePaintFragment;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/paint/view/ThePaintFragment;->F0(Lcom/friday/paint/view/ThePaintFragment;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final L0(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/friday/paint/view/ThePaintFragment;->v0()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/friday/paint/viewmodel/NoteViewModel;->L()Landroidx/lifecycle/MutableLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    sget-object v0, Lcom/zykj/sketch/core/data/Mode;->ACTION_SELECT:Lcom/zykj/sketch/core/data/Mode;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 19
    .line 20
    iget-object p1, p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;->c:Lcom/friday/paint/databinding/ItemPaintPenColorBinding;

    .line 21
    .line 22
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const/16 v0, 0x8

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 36
    .line 37
    iget-object p1, p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;->D:Landroid/widget/RadioGroup;

    .line 38
    .line 39
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    check-cast p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 47
    .line 48
    iget-object p1, p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;->c:Lcom/friday/paint/databinding/ItemPaintPenColorBinding;

    .line 49
    .line 50
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    check-cast p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 62
    .line 63
    iget-object p1, p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;->A:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 64
    .line 65
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    check-cast p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 73
    .line 74
    iget-object p1, p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;->v:Landroid/widget/ImageView;

    .line 75
    .line 76
    const/4 v0, 0x1

    .line 77
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    check-cast p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 85
    .line 86
    iget-object p1, p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;->r:Landroid/widget/ImageView;

    .line 87
    .line 88
    const/4 v0, 0x0

    .line 89
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    check-cast p0, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 97
    .line 98
    iget-object p0, p0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->n:Landroid/widget/ImageView;

    .line 99
    .line 100
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 101
    .line 102
    .line 103
    return-void
.end method

.method public static synthetic M(Lcom/friday/paint/view/ThePaintFragment;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/ThePaintFragment;->k0(Lcom/friday/paint/view/ThePaintFragment;I)V

    return-void
.end method

.method public static final M0(Lcom/friday/paint/view/ThePaintFragment;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
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
    invoke-direct {p0}, Lcom/friday/paint/view/ThePaintFragment;->v0()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0, p3}, Lcom/friday/paint/viewmodel/NoteViewModel;->V(I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static synthetic N(Lcom/friday/paint/view/ThePaintFragment;Ljava/lang/Integer;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/ThePaintFragment;->V0(Lcom/friday/paint/view/ThePaintFragment;Ljava/lang/Integer;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final N0(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/friday/paint/view/ThePaintFragment;->v0()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/friday/paint/viewmodel/NoteViewModel;->x()Landroidx/lifecycle/MutableLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Ljava/lang/Integer;

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-virtual {p0}, Lcom/friday/paint/view/ThePaintFragment;->t0()Lcom/friday/paint/adapter/NoteFragmentStateAdapter;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Lcom/friday/paint/adapter/NoteFragmentStateAdapter;->getItemCount()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const/4 v1, 0x1

    .line 30
    if-ne v0, v1, :cond_0

    .line 31
    .line 32
    const-string p0, "\u4e0d\u80fd\u5220\u9664\u6240\u6709\u7b14\u8bb0"

    .line 33
    .line 34
    invoke-static {p0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    sget-object v0, Lcom/friday/common/widget/dialog/a;->a:Lcom/friday/common/widget/dialog/a;

    .line 39
    .line 40
    new-instance v1, Lc4/t0;

    .line 41
    .line 42
    invoke-direct {v1, p0, p1}, Lc4/t0;-><init>(Lcom/friday/paint/view/ThePaintFragment;I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Lcom/friday/common/widget/dialog/a;->B(Lhd/a;)Lcom/friday/common/widget/dialog/BaseDialog;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    const-string v0, "getChildFragmentManager(...)"

    .line 54
    .line 55
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const-string v0, "delete"

    .line 59
    .line 60
    invoke-virtual {p1, p0, v0}, Lcom/friday/common/widget/dialog/BaseDialog;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    :cond_1
    return-void
.end method

.method public static synthetic O(Lcom/friday/paint/view/ThePaintFragment;Lcom/zykj/sketch/core/config/SketchConfig;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/ThePaintFragment;->S0(Lcom/friday/paint/view/ThePaintFragment;Lcom/zykj/sketch/core/config/SketchConfig;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final O0(Lcom/friday/paint/view/ThePaintFragment;I)Lqc/q;
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/friday/paint/view/ThePaintFragment;->v0()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/friday/paint/view/ThePaintFragment;->t0()Lcom/friday/paint/adapter/NoteFragmentStateAdapter;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Lcom/friday/paint/adapter/NoteFragmentStateAdapter;->getData()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Ljava/lang/Iterable;

    .line 14
    .line 15
    new-instance v1, Ljava/util/ArrayList;

    .line 16
    .line 17
    const/16 v2, 0xa

    .line 18
    .line 19
    invoke-static {p0, v2}, Lrc/x;->x(Ljava/lang/Iterable;I)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Lcom/friday/paint/model/PaintEntity;

    .line 41
    .line 42
    invoke-virtual {v2}, Lcom/friday/paint/model/PaintEntity;->getPath()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    invoke-virtual {v0, p1, v1}, Lcom/friday/paint/viewmodel/NoteViewModel;->q(ILjava/util/List;)V

    .line 51
    .line 52
    .line 53
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 54
    .line 55
    return-object p0
.end method

.method public static synthetic P(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/ThePaintFragment;->w0(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final P0(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/friday/paint/view/ThePaintFragment;->v0()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcom/friday/paint/viewmodel/NoteViewModel;->n()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic Q(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/ThePaintFragment;->x0(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final Q0(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/friday/paint/view/ThePaintFragment;->v0()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/friday/paint/viewmodel/NoteViewModel;->x()Landroidx/lifecycle/MutableLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Ljava/lang/Integer;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    add-int/lit8 p1, p1, 0x1

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Lcom/friday/paint/view/ThePaintFragment;->copyNote(I)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method public static synthetic R(Lcom/friday/paint/databinding/ItemPaintPenColorBinding;Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/paint/view/ThePaintFragment;->A0(Lcom/friday/paint/databinding/ItemPaintPenColorBinding;Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final R0(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Lcom/friday/paint/view/ThePaintFragment;->v0()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/friday/paint/viewmodel/NoteViewModel;->x()Landroidx/lifecycle/MutableLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Ljava/lang/Integer;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    add-int/lit8 v1, p1, 0x1

    .line 22
    .line 23
    const/4 v4, 0x6

    .line 24
    const/4 v5, 0x0

    .line 25
    const/4 v2, 0x0

    .line 26
    const/4 v3, 0x0

    .line 27
    move-object v0, p0

    .line 28
    invoke-static/range {v0 .. v5}, Lcom/friday/paint/view/ThePaintFragment;->j0(Lcom/friday/paint/view/ThePaintFragment;ILandroid/graphics/Bitmap;ZILjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void
.end method

.method public static synthetic S(Lcom/friday/paint/view/ThePaintFragment;I)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/ThePaintFragment;->r0(Lcom/friday/paint/view/ThePaintFragment;I)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final S0(Lcom/friday/paint/view/ThePaintFragment;Lcom/zykj/sketch/core/config/SketchConfig;)Lqc/q;
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/zykj/sketch/core/config/SketchConfig;->isTouchable()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lvb/n;->q(Ljava/lang/Boolean;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 17
    .line 18
    iget-object p0, p0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->x:Landroid/widget/ImageView;

    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/zykj/sketch/core/config/SketchConfig;->isTouchable()Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 25
    .line 26
    .line 27
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 28
    .line 29
    return-object p0
.end method

.method public static synthetic T(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/ThePaintFragment;->K0(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final T0(Lcom/friday/paint/view/ThePaintFragment;Ljava/lang/Integer;)Lqc/q;
    .locals 3

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-ltz v0, :cond_1

    .line 8
    .line 9
    const-string v0, "\u5220\u9664\u6210\u529f"

    .line 10
    .line 11
    invoke-static {v0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/friday/paint/view/ThePaintFragment;->t0()Lcom/friday/paint/adapter/NoteFragmentStateAdapter;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Lcom/friday/paint/adapter/NoteFragmentStateAdapter;->getItemCount()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    add-int/lit8 v0, v0, -0x1

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-ne v1, v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    add-int/lit8 v0, v0, -0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    :goto_0
    invoke-virtual {p0}, Lcom/friday/paint/view/ThePaintFragment;->t0()Lcom/friday/paint/adapter/NoteFragmentStateAdapter;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    invoke-virtual {v1, v2}, Lcom/friday/paint/adapter/NoteFragmentStateAdapter;->c(I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/friday/paint/view/ThePaintFragment;->u0()Lcom/friday/paint/adapter/ThumbnailListAdapter;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    invoke-virtual {v1, p1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->removeAt(I)V

    .line 61
    .line 62
    .line 63
    invoke-direct {p0}, Lcom/friday/paint/view/ThePaintFragment;->v0()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-virtual {p0, v0}, Lcom/friday/paint/viewmodel/NoteViewModel;->V(I)V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    const-string p0, "\u5220\u9664\u5931\u8d25"

    .line 72
    .line 73
    invoke-static {p0}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 74
    .line 75
    .line 76
    :cond_2
    :goto_1
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 77
    .line 78
    return-object p0
.end method

.method public static synthetic U(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/ThePaintFragment;->N0(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final U0(Lcom/friday/paint/view/ThePaintFragment;Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/friday/paint/view/ThePaintFragment;->v0()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/friday/paint/viewmodel/NoteViewModel;->x()Landroidx/lifecycle/MutableLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Ljava/lang/Integer;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-virtual {p0}, Lcom/friday/paint/view/ThePaintFragment;->u0()Lcom/friday/paint/adapter/ThumbnailListAdapter;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    sget-object v0, Lcom/friday/common/entity/PayloadKey;->THUMBNAIL:Lcom/friday/common/entity/PayloadKey;

    .line 26
    .line 27
    invoke-virtual {p0, p1, v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public static synthetic V(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/ThePaintFragment;->a1(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final V0(Lcom/friday/paint/view/ThePaintFragment;Ljava/lang/Integer;)Lqc/q;
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/friday/paint/view/ThePaintFragment$initObserver$4$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, p1, v1}, Lcom/friday/paint/view/ThePaintFragment$initObserver$4$1;-><init>(Lcom/friday/paint/view/ThePaintFragment;Ljava/lang/Integer;Lvc/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 15
    .line 16
    .line 17
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 18
    .line 19
    return-object p0
.end method

.method public static synthetic W(Lcom/friday/paint/view/ThePaintFragment;)Lcom/friday/paint/adapter/NoteFragmentStateAdapter;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/paint/view/ThePaintFragment;->s0(Lcom/friday/paint/view/ThePaintFragment;)Lcom/friday/paint/adapter/NoteFragmentStateAdapter;

    move-result-object p0

    return-object p0
.end method

.method public static final W0(Lcom/friday/paint/view/ThePaintFragment;Ljava/lang/Boolean;)Lqc/q;
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lcom/friday/paint/view/ThePaintFragment$initObserver$5$1;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p1, p0, v1}, Lcom/friday/paint/view/ThePaintFragment$initObserver$5$1;-><init>(Ljava/lang/Boolean;Lcom/friday/paint/view/ThePaintFragment;Lvc/c;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 15
    .line 16
    .line 17
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 18
    .line 19
    return-object p0
.end method

.method public static synthetic X(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/ThePaintFragment;->y0(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic Y()Lcom/friday/paint/adapter/ThumbnailListAdapter;
    .locals 1

    .line 1
    invoke-static {}, Lcom/friday/paint/view/ThePaintFragment;->c1()Lcom/friday/paint/adapter/ThumbnailListAdapter;

    move-result-object v0

    return-object v0
.end method

.method public static final Y0(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 6
    .line 7
    iget-object v0, p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;->d:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 8
    .line 9
    iget-object v1, p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;->y:Landroid/widget/LinearLayout;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->isDrawerOpen(Landroid/view/View;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;->d:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 18
    .line 19
    iget-object p1, p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;->y:Landroid/widget/LinearLayout;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Landroidx/drawerlayout/widget/DrawerLayout;->openDrawer(Landroid/view/View;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {p0}, Lcom/friday/paint/view/ThePaintFragment;->v0()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const/4 p1, 0x1

    .line 29
    invoke-virtual {p0, p1}, Lcom/friday/paint/viewmodel/NoteViewModel;->W(Z)V

    .line 30
    .line 31
    .line 32
    sget-object p0, Lk2/v;->a:Lk2/v$a;

    .line 33
    .line 34
    const-string p1, "PageDrawer"

    .line 35
    .line 36
    invoke-virtual {p0, p1}, Lk2/v$a;->a(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void
.end method

.method public static synthetic Z(Lcom/friday/paint/view/ThePaintFragment;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/paint/view/ThePaintFragment;->M0(Lcom/friday/paint/view/ThePaintFragment;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V

    return-void
.end method

.method public static final Z0(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "getViewLifecycleOwner(...)"

    .line 6
    .line 7
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    new-instance v4, Lcom/friday/paint/view/ThePaintFragment$initViewPager2$3$1;

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    invoke-direct {v4, p0, p1}, Lcom/friday/paint/view/ThePaintFragment$initViewPager2$3$1;-><init>(Lcom/friday/paint/view/ThePaintFragment;Lvc/c;)V

    .line 18
    .line 19
    .line 20
    const/4 v5, 0x3

    .line 21
    const/4 v6, 0x0

    .line 22
    const/4 v2, 0x0

    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-static/range {v1 .. v6}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public static synthetic a0(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/ThePaintFragment;->Y0(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final a1(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Lcom/friday/paint/view/ThePaintFragment;->v0()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/friday/paint/viewmodel/NoteViewModel;->x()Landroidx/lifecycle/MutableLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Ljava/lang/Integer;

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-virtual {p0}, Lcom/friday/paint/view/ThePaintFragment;->t0()Lcom/friday/paint/adapter/NoteFragmentStateAdapter;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Lcom/friday/paint/adapter/NoteFragmentStateAdapter;->getItemCount()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    add-int/lit8 v0, v0, -0x1

    .line 30
    .line 31
    if-ne p1, v0, :cond_0

    .line 32
    .line 33
    add-int/lit8 v2, p1, 0x1

    .line 34
    .line 35
    const/4 v5, 0x6

    .line 36
    const/4 v6, 0x0

    .line 37
    const/4 v3, 0x0

    .line 38
    const/4 v4, 0x0

    .line 39
    move-object v1, p0

    .line 40
    invoke-static/range {v1 .. v6}, Lcom/friday/paint/view/ThePaintFragment;->j0(Lcom/friday/paint/view/ThePaintFragment;ILandroid/graphics/Bitmap;ZILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_0
    move-object v1, p0

    .line 45
    invoke-direct {v1}, Lcom/friday/paint/view/ThePaintFragment;->v0()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    add-int/lit8 p1, p1, 0x1

    .line 50
    .line 51
    invoke-virtual {p0, p1}, Lcom/friday/paint/viewmodel/NoteViewModel;->V(I)V

    .line 52
    .line 53
    .line 54
    :cond_1
    return-void
.end method

.method public static synthetic b0(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/ThePaintFragment;->Q0(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final b1(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/friday/paint/view/ThePaintFragment;->v0()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/friday/paint/viewmodel/NoteViewModel;->x()Landroidx/lifecycle/MutableLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Ljava/lang/Integer;

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-direct {p0}, Lcom/friday/paint/view/ThePaintFragment;->v0()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    add-int/lit8 p1, p1, -0x1

    .line 29
    .line 30
    :goto_0
    invoke-virtual {p0, p1}, Lcom/friday/paint/viewmodel/NoteViewModel;->V(I)V

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void
.end method

.method public static final synthetic c0(Lcom/friday/paint/view/ThePaintFragment;Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/friday/paint/view/ThePaintFragment;->p0(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final c1()Lcom/friday/paint/adapter/ThumbnailListAdapter;
    .locals 1

    .line 1
    new-instance v0, Lcom/friday/paint/adapter/ThumbnailListAdapter;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/friday/paint/adapter/ThumbnailListAdapter;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final varargs synthetic d0(Lcom/friday/paint/view/ThePaintFragment;[Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/friday/paint/view/ThePaintFragment;->convertEnable([Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic e0(Lcom/friday/paint/view/ThePaintFragment;)Lcom/friday/paint/databinding/FragmentThePaintBinding;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 6
    .line 7
    return-object p0
.end method

.method public static final synthetic f0(Lcom/friday/paint/view/ThePaintFragment;)Lcom/friday/paint/viewmodel/NoteViewModel;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/friday/paint/view/ThePaintFragment;->v0()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic g0(Lcom/friday/paint/view/ThePaintFragment;Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/ThePaintFragment;->moveToPosition(Landroidx/recyclerview/widget/RecyclerView;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic h0(Lcom/friday/paint/view/ThePaintFragment;II)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/ThePaintFragment;->updateCurrentPage(II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final initClick()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->r:Landroid/widget/ImageView;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 18
    .line 19
    iget-object v0, v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->h:Landroid/widget/ImageView;

    .line 20
    .line 21
    new-instance v2, Lc4/u;

    .line 22
    .line 23
    invoke-direct {v2, p0}, Lc4/u;-><init>(Lcom/friday/paint/view/ThePaintFragment;)V

    .line 24
    .line 25
    .line 26
    const-wide/16 v3, 0x3e8

    .line 27
    .line 28
    invoke-static {v0, v3, v4, v2}, Lcom/blankj/utilcode/util/ClickUtils;->applyGlobalDebouncing(Landroid/view/View;JLandroid/view/View$OnClickListener;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 36
    .line 37
    iget-object v0, v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->x:Landroid/widget/ImageView;

    .line 38
    .line 39
    new-instance v2, Lc4/z;

    .line 40
    .line 41
    invoke-direct {v2, p0}, Lc4/z;-><init>(Lcom/friday/paint/view/ThePaintFragment;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 52
    .line 53
    iget-object v0, v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->i:Landroid/widget/ImageView;

    .line 54
    .line 55
    const-string v2, "ivCamera"

    .line 56
    .line 57
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    new-instance v2, Lc4/a0;

    .line 61
    .line 62
    invoke-direct {v2, p0}, Lc4/a0;-><init>(Lcom/friday/paint/view/ThePaintFragment;)V

    .line 63
    .line 64
    .line 65
    invoke-static {v0, v3, v4, v2}, Lz1/b;->l(Landroid/view/View;JLandroid/view/View$OnClickListener;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    check-cast v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 73
    .line 74
    iget-object v0, v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->p:Landroid/widget/ImageView;

    .line 75
    .line 76
    const-string v2, "ivGallery"

    .line 77
    .line 78
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    new-instance v2, Lc4/b0;

    .line 82
    .line 83
    invoke-direct {v2, p0}, Lc4/b0;-><init>(Lcom/friday/paint/view/ThePaintFragment;)V

    .line 84
    .line 85
    .line 86
    invoke-static {v0, v3, v4, v2}, Lz1/b;->l(Landroid/view/View;JLandroid/view/View$OnClickListener;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    check-cast v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 94
    .line 95
    iget-object v0, v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->D:Landroid/widget/RadioGroup;

    .line 96
    .line 97
    new-instance v2, Lc4/d0;

    .line 98
    .line 99
    invoke-direct {v2, p0}, Lc4/d0;-><init>(Lcom/friday/paint/view/ThePaintFragment;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v2}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    check-cast v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 110
    .line 111
    iget-object v0, v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->n:Landroid/widget/ImageView;

    .line 112
    .line 113
    new-instance v2, Lc4/e0;

    .line 114
    .line 115
    invoke-direct {v2, p0}, Lc4/e0;-><init>(Lcom/friday/paint/view/ThePaintFragment;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    check-cast v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 126
    .line 127
    iget-object v0, v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->v:Landroid/widget/ImageView;

    .line 128
    .line 129
    new-instance v2, Lc4/f0;

    .line 130
    .line 131
    invoke-direct {v2, p0}, Lc4/f0;-><init>(Lcom/friday/paint/view/ThePaintFragment;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    check-cast v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 142
    .line 143
    iget-object v0, v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->l:Landroid/widget/ImageView;

    .line 144
    .line 145
    const-string v2, "ivDelete"

    .line 146
    .line 147
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    new-instance v2, Lc4/g0;

    .line 151
    .line 152
    invoke-direct {v2, p0}, Lc4/g0;-><init>(Lcom/friday/paint/view/ThePaintFragment;)V

    .line 153
    .line 154
    .line 155
    invoke-static {v0, v3, v4, v2}, Lz1/b;->l(Landroid/view/View;JLandroid/view/View$OnClickListener;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    check-cast v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 163
    .line 164
    iget-object v0, v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->r:Landroid/widget/ImageView;

    .line 165
    .line 166
    new-instance v2, Lc4/h0;

    .line 167
    .line 168
    invoke-direct {v2, p0}, Lc4/h0;-><init>(Lcom/friday/paint/view/ThePaintFragment;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    check-cast v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 179
    .line 180
    iget-object v0, v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->c:Lcom/friday/paint/databinding/ItemPaintPenColorBinding;

    .line 181
    .line 182
    iget-object v2, v0, Lcom/friday/paint/databinding/ItemPaintPenColorBinding;->g:Landroid/widget/RadioGroup;

    .line 183
    .line 184
    new-instance v3, Lc4/i0;

    .line 185
    .line 186
    invoke-direct {v3, p0}, Lc4/i0;-><init>(Lcom/friday/paint/view/ThePaintFragment;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v2, v3}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    .line 190
    .line 191
    .line 192
    iget-object v2, v0, Lcom/friday/paint/databinding/ItemPaintPenColorBinding;->g:Landroid/widget/RadioGroup;

    .line 193
    .line 194
    const/4 v3, 0x0

    .line 195
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    .line 200
    .line 201
    .line 202
    move-result v3

    .line 203
    invoke-virtual {v2, v3}, Landroid/widget/RadioGroup;->check(I)V

    .line 204
    .line 205
    .line 206
    iget-object v2, v0, Lcom/friday/paint/databinding/ItemPaintPenColorBinding;->c:Landroid/widget/ImageView;

    .line 207
    .line 208
    invoke-virtual {v2}, Landroid/view/View;->isSelected()Z

    .line 209
    .line 210
    .line 211
    move-result v2

    .line 212
    if-nez v2, :cond_0

    .line 213
    .line 214
    iget-object v2, v0, Lcom/friday/paint/databinding/ItemPaintPenColorBinding;->d:Landroid/widget/ImageView;

    .line 215
    .line 216
    invoke-virtual {v2}, Landroid/view/View;->isSelected()Z

    .line 217
    .line 218
    .line 219
    move-result v2

    .line 220
    if-nez v2, :cond_0

    .line 221
    .line 222
    iget-object v2, v0, Lcom/friday/paint/databinding/ItemPaintPenColorBinding;->e:Landroid/widget/ImageView;

    .line 223
    .line 224
    invoke-virtual {v2}, Landroid/view/View;->isSelected()Z

    .line 225
    .line 226
    .line 227
    move-result v2

    .line 228
    if-nez v2, :cond_0

    .line 229
    .line 230
    iget-object v2, v0, Lcom/friday/paint/databinding/ItemPaintPenColorBinding;->c:Landroid/widget/ImageView;

    .line 231
    .line 232
    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 233
    .line 234
    .line 235
    :cond_0
    iget-object v1, v0, Lcom/friday/paint/databinding/ItemPaintPenColorBinding;->c:Landroid/widget/ImageView;

    .line 236
    .line 237
    new-instance v2, Lc4/v;

    .line 238
    .line 239
    invoke-direct {v2, v0, p0}, Lc4/v;-><init>(Lcom/friday/paint/databinding/ItemPaintPenColorBinding;Lcom/friday/paint/view/ThePaintFragment;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 243
    .line 244
    .line 245
    iget-object v1, v0, Lcom/friday/paint/databinding/ItemPaintPenColorBinding;->d:Landroid/widget/ImageView;

    .line 246
    .line 247
    new-instance v2, Lc4/w;

    .line 248
    .line 249
    invoke-direct {v2, v0, p0}, Lc4/w;-><init>(Lcom/friday/paint/databinding/ItemPaintPenColorBinding;Lcom/friday/paint/view/ThePaintFragment;)V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 253
    .line 254
    .line 255
    iget-object v1, v0, Lcom/friday/paint/databinding/ItemPaintPenColorBinding;->e:Landroid/widget/ImageView;

    .line 256
    .line 257
    new-instance v2, Lc4/x;

    .line 258
    .line 259
    invoke-direct {v2, v0, p0}, Lc4/x;-><init>(Lcom/friday/paint/databinding/ItemPaintPenColorBinding;Lcom/friday/paint/view/ThePaintFragment;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    check-cast v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 270
    .line 271
    iget-object v0, v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->o:Landroid/widget/ImageView;

    .line 272
    .line 273
    new-instance v1, Lc4/y;

    .line 274
    .line 275
    invoke-direct {v1, p0}, Lc4/y;-><init>(Lcom/friday/paint/view/ThePaintFragment;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 279
    .line 280
    .line 281
    return-void
.end method

.method private final initObserver()V
    .locals 8

    .line 1
    invoke-direct {p0}, Lcom/friday/paint/view/ThePaintFragment;->v0()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/friday/paint/viewmodel/NoteViewModel;->K()Landroidx/lifecycle/MutableLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v2, Lc4/n0;

    .line 14
    .line 15
    invoke-direct {v2, p0}, Lc4/n0;-><init>(Lcom/friday/paint/view/ThePaintFragment;)V

    .line 16
    .line 17
    .line 18
    new-instance v3, Lcom/friday/paint/view/ThePaintFragment$c;

    .line 19
    .line 20
    invoke-direct {v3, v2}, Lcom/friday/paint/view/ThePaintFragment$c;-><init>(Lhd/l;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Lcom/friday/paint/view/ThePaintFragment;->v0()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Lcom/friday/paint/viewmodel/NoteViewModel;->z()Landroidx/lifecycle/LiveData;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    new-instance v2, Lc4/v0;

    .line 39
    .line 40
    invoke-direct {v2, p0}, Lc4/v0;-><init>(Lcom/friday/paint/view/ThePaintFragment;)V

    .line 41
    .line 42
    .line 43
    new-instance v3, Lcom/friday/paint/view/ThePaintFragment$c;

    .line 44
    .line 45
    invoke-direct {v3, v2}, Lcom/friday/paint/view/ThePaintFragment$c;-><init>(Lhd/l;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 49
    .line 50
    .line 51
    const-string v0, "updateCurrentThumbnailSuccess"

    .line 52
    .line 53
    invoke-static {v0}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    new-instance v2, Lc4/w0;

    .line 62
    .line 63
    invoke-direct {v2, p0}, Lc4/w0;-><init>(Lcom/friday/paint/view/ThePaintFragment;)V

    .line 64
    .line 65
    .line 66
    invoke-interface {v0, v1, v2}, Lcom/jeremyliao/liveeventbus/core/Observable;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 67
    .line 68
    .line 69
    invoke-direct {p0}, Lcom/friday/paint/view/ThePaintFragment;->v0()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v0}, Lcom/friday/paint/viewmodel/NoteViewModel;->x()Landroidx/lifecycle/MutableLiveData;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    new-instance v2, Lc4/x0;

    .line 82
    .line 83
    invoke-direct {v2, p0}, Lc4/x0;-><init>(Lcom/friday/paint/view/ThePaintFragment;)V

    .line 84
    .line 85
    .line 86
    new-instance v3, Lcom/friday/paint/view/ThePaintFragment$c;

    .line 87
    .line 88
    invoke-direct {v3, v2}, Lcom/friday/paint/view/ThePaintFragment$c;-><init>(Lhd/l;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 92
    .line 93
    .line 94
    invoke-direct {p0}, Lcom/friday/paint/view/ThePaintFragment;->v0()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v0}, Lcom/friday/paint/viewmodel/NoteViewModel;->y()Landroidx/lifecycle/MutableLiveData;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    new-instance v2, Lc4/y0;

    .line 107
    .line 108
    invoke-direct {v2, p0}, Lc4/y0;-><init>(Lcom/friday/paint/view/ThePaintFragment;)V

    .line 109
    .line 110
    .line 111
    new-instance v3, Lcom/friday/paint/view/ThePaintFragment$c;

    .line 112
    .line 113
    invoke-direct {v3, v2}, Lcom/friday/paint/view/ThePaintFragment$c;-><init>(Lhd/l;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v1, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    const-string v1, "getViewLifecycleOwner(...)"

    .line 124
    .line 125
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    new-instance v5, Lcom/friday/paint/view/ThePaintFragment$initObserver$6;

    .line 133
    .line 134
    const/4 v0, 0x0

    .line 135
    invoke-direct {v5, p0, v0}, Lcom/friday/paint/view/ThePaintFragment$initObserver$6;-><init>(Lcom/friday/paint/view/ThePaintFragment;Lvc/c;)V

    .line 136
    .line 137
    .line 138
    const/4 v6, 0x3

    .line 139
    const/4 v7, 0x0

    .line 140
    const/4 v3, 0x0

    .line 141
    const/4 v4, 0x0

    .line 142
    invoke-static/range {v2 .. v7}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 143
    .line 144
    .line 145
    return-void
.end method

.method public static synthetic j0(Lcom/friday/paint/view/ThePaintFragment;ILandroid/graphics/Bitmap;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    if-nez p5, :cond_2

    .line 2
    .line 3
    and-int/lit8 p5, p4, 0x2

    .line 4
    .line 5
    if-eqz p5, :cond_0

    .line 6
    .line 7
    const/4 p2, 0x0

    .line 8
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 9
    .line 10
    if-eqz p4, :cond_1

    .line 11
    .line 12
    const/4 p3, 0x0

    .line 13
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/friday/paint/view/ThePaintFragment;->i0(ILandroid/graphics/Bitmap;Z)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 18
    .line 19
    const-string p1, "Super calls with default arguments not supported in this target, function: addNote"

    .line 20
    .line 21
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw p0
.end method

.method public static final k0(Lcom/friday/paint/view/ThePaintFragment;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/friday/paint/view/ThePaintFragment;->v0()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lcom/friday/paint/viewmodel/NoteViewModel;->V(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final m0(Lcom/friday/paint/view/ThePaintFragment;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/friday/paint/view/ThePaintFragment;->v0()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/friday/paint/viewmodel/NoteViewModel;->x()Landroidx/lifecycle/MutableLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Ljava/lang/Integer;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    const-string p2, "clearBoard"

    .line 22
    .line 23
    invoke-static {p2}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-virtual {p0}, Lcom/friday/paint/view/ThePaintFragment;->t0()Lcom/friday/paint/adapter/NoteFragmentStateAdapter;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0}, Lcom/friday/paint/adapter/NoteFragmentStateAdapter;->getData()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, Lcom/friday/paint/model/PaintEntity;

    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/friday/paint/model/PaintEntity;->getPath()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-interface {p2, p0}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    return-void
.end method

.method public static final n0(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-interface {p0}, Landroid/content/DialogInterface;->dismiss()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic r(Lcom/friday/paint/view/ThePaintFragment;Ljava/lang/Integer;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/ThePaintFragment;->T0(Lcom/friday/paint/view/ThePaintFragment;Ljava/lang/Integer;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final r0(Lcom/friday/paint/view/ThePaintFragment;I)Lqc/q;
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/friday/paint/view/ThePaintFragment;->getIClassManager()Lj2/b;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-interface {p0, p1}, Lj2/b;->a(Z)V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/friday/paint/view/ThePaintFragment;->getIClassManager()Lj2/b;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const/4 p1, 0x1

    .line 17
    invoke-interface {p0, p1}, Lj2/b;->a(Z)V

    .line 18
    .line 19
    .line 20
    :goto_0
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 21
    .line 22
    return-object p0
.end method

.method public static synthetic s(Lcom/friday/paint/view/ThePaintFragment;Landroid/widget/RadioGroup;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/paint/view/ThePaintFragment;->J0(Lcom/friday/paint/view/ThePaintFragment;Landroid/widget/RadioGroup;I)V

    return-void
.end method

.method public static final s0(Lcom/friday/paint/view/ThePaintFragment;)Lcom/friday/paint/adapter/NoteFragmentStateAdapter;
    .locals 3

    .line 1
    new-instance v0, Lcom/friday/paint/adapter/NoteFragmentStateAdapter;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "getChildFragmentManager(...)"

    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const-string v2, "<get-lifecycle>(...)"

    .line 17
    .line 18
    invoke-static {p0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, v1, p0}, Lcom/friday/paint/adapter/NoteFragmentStateAdapter;-><init>(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/Lifecycle;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method public static synthetic t(Lcom/friday/paint/view/ThePaintFragment;Ljava/lang/Boolean;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/ThePaintFragment;->W0(Lcom/friday/paint/view/ThePaintFragment;Ljava/lang/Boolean;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/ThePaintFragment;->P0(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic v(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/ThePaintFragment;->H0(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V

    return-void
.end method

.method private final v0()Lcom/friday/paint/viewmodel/NoteViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/view/ThePaintFragment;->i:Lqc/d;

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

.method public static synthetic w(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/ThePaintFragment;->D0(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final w0(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/paint/view/ThePaintFragment;->l0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic x(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/ThePaintFragment;->R0(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final x0(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/friday/paint/view/ThePaintFragment;->v0()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/friday/paint/viewmodel/NoteViewModel;->L()Landroidx/lifecycle/MutableLiveData;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    sget-object v0, Lcom/zykj/sketch/core/data/Mode;->ACTION_WRITING:Lcom/zykj/sketch/core/data/Mode;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 19
    .line 20
    iget-object p1, p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;->c:Lcom/friday/paint/databinding/ItemPaintPenColorBinding;

    .line 21
    .line 22
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 31
    .line 32
    iget-object v0, v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->c:Lcom/friday/paint/databinding/ItemPaintPenColorBinding;

    .line 33
    .line 34
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    const/4 v1, 0x0

    .line 43
    const/16 v2, 0x8

    .line 44
    .line 45
    if-ne v0, v2, :cond_0

    .line 46
    .line 47
    move v0, v1

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    move v0, v2

    .line 50
    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 58
    .line 59
    iget-object p1, p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;->A:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 60
    .line 61
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    check-cast v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 66
    .line 67
    iget-object v0, v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->c:Lcom/friday/paint/databinding/ItemPaintPenColorBinding;

    .line 68
    .line 69
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_1

    .line 78
    .line 79
    move v0, v1

    .line 80
    goto :goto_1

    .line 81
    :cond_1
    move v0, v2

    .line 82
    :goto_1
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    check-cast p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 90
    .line 91
    iget-object p1, p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;->D:Landroid/widget/RadioGroup;

    .line 92
    .line 93
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    check-cast p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 101
    .line 102
    iget-object p1, p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;->v:Landroid/widget/ImageView;

    .line 103
    .line 104
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    check-cast p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 112
    .line 113
    iget-object p1, p1, Lcom/friday/paint/databinding/FragmentThePaintBinding;->r:Landroid/widget/ImageView;

    .line 114
    .line 115
    const/4 v0, 0x1

    .line 116
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    check-cast p0, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 124
    .line 125
    iget-object p0, p0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->n:Landroid/widget/ImageView;

    .line 126
    .line 127
    invoke-virtual {p0, v1}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 128
    .line 129
    .line 130
    return-void
.end method

.method public static synthetic y(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/ThePaintFragment;->b1(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final y0(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public static synthetic z(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/paint/view/ThePaintFragment;->I0(Lcom/friday/paint/view/ThePaintFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final z0(Lcom/friday/paint/view/ThePaintFragment;Landroid/widget/RadioGroup;I)V
    .locals 1

    .line 1
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-direct {p0}, Lcom/friday/paint/view/ThePaintFragment;->v0()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-virtual {p2}, Lcom/friday/paint/viewmodel/NoteViewModel;->E()Landroidx/lifecycle/MutableLiveData;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-virtual {p2}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    check-cast p2, Lcom/zykj/sketch/core/config/GraphConfig;

    .line 30
    .line 31
    if-eqz p2, :cond_0

    .line 32
    .line 33
    invoke-direct {p0}, Lcom/friday/paint/view/ThePaintFragment;->v0()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p0}, Lcom/friday/paint/viewmodel/NoteViewModel;->E()Landroidx/lifecycle/MutableLiveData;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    new-instance v0, Lcom/zykj/sketch/core/config/GraphConfig;

    .line 42
    .line 43
    invoke-virtual {p2}, Lcom/zykj/sketch/core/config/GraphConfig;->getWidth()F

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    invoke-direct {v0, p2, p1}, Lcom/zykj/sketch/core/config/GraphConfig;-><init>(FI)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v0}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    :cond_0
    return-void
.end method


# virtual methods
.method public final X0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->I:Landroidx/viewpager2/widget/ViewPager2;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/friday/paint/view/ThePaintFragment;->t0()Lcom/friday/paint/adapter/NoteFragmentStateAdapter;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v0, v1}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {v0, v1}, Landroidx/viewpager2/widget/ViewPager2;->setUserInputEnabled(Z)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 25
    .line 26
    iget-object v0, v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->m:Landroid/widget/ImageView;

    .line 27
    .line 28
    new-instance v1, Lc4/j0;

    .line 29
    .line 30
    invoke-direct {v1, p0}, Lc4/j0;-><init>(Lcom/friday/paint/view/ThePaintFragment;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 41
    .line 42
    iget-object v0, v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->g:Landroid/widget/ImageView;

    .line 43
    .line 44
    const-string v1, "ivAsk"

    .line 45
    .line 46
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    new-instance v1, Lc4/k0;

    .line 50
    .line 51
    invoke-direct {v1, p0}, Lc4/k0;-><init>(Lcom/friday/paint/view/ThePaintFragment;)V

    .line 52
    .line 53
    .line 54
    const-wide/16 v2, 0x7d0

    .line 55
    .line 56
    invoke-static {v0, v2, v3, v1}, Lz1/b;->l(Landroid/view/View;JLandroid/view/View$OnClickListener;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 64
    .line 65
    iget-object v0, v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->q:Landroid/widget/ImageView;

    .line 66
    .line 67
    const-string v1, "ivNextPage"

    .line 68
    .line 69
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    new-instance v1, Lc4/l0;

    .line 73
    .line 74
    invoke-direct {v1, p0}, Lc4/l0;-><init>(Lcom/friday/paint/view/ThePaintFragment;)V

    .line 75
    .line 76
    .line 77
    const-wide/16 v2, 0x3e8

    .line 78
    .line 79
    invoke-static {v0, v2, v3, v1}, Lz1/b;->l(Landroid/view/View;JLandroid/view/View$OnClickListener;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    check-cast v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 87
    .line 88
    iget-object v0, v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->s:Landroid/widget/ImageView;

    .line 89
    .line 90
    const-string v1, "ivPrevPage"

    .line 91
    .line 92
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    new-instance v1, Lc4/m0;

    .line 96
    .line 97
    invoke-direct {v1, p0}, Lc4/m0;-><init>(Lcom/friday/paint/view/ThePaintFragment;)V

    .line 98
    .line 99
    .line 100
    invoke-static {v0, v2, v3, v1}, Lz1/b;->l(Landroid/view/View;JLandroid/view/View$OnClickListener;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    check-cast v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 108
    .line 109
    iget-object v0, v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->y:Landroid/widget/LinearLayout;

    .line 110
    .line 111
    const/4 v1, 0x1

    .line 112
    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 113
    .line 114
    .line 115
    return-void
.end method

.method public final varargs convertEnable([Landroid/view/View;)V
    .locals 4

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    if-ge v1, v0, :cond_0

    .line 4
    .line 5
    aget-object v2, p1, v1

    .line 6
    .line 7
    invoke-virtual {v2}, Landroid/view/View;->isEnabled()Z

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    xor-int/lit8 v3, v3, 0x1

    .line 12
    .line 13
    invoke-virtual {v2, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 14
    .line 15
    .line 16
    add-int/lit8 v1, v1, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return-void
.end method

.method public final copyNote(I)V
    .locals 6

    .line 1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lsd/r0;->b()Lsd/e0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v3, Lcom/friday/paint/view/ThePaintFragment$copyNote$1;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-direct {v3, p0, p1, v2}, Lcom/friday/paint/view/ThePaintFragment$copyNote$1;-><init>(Lcom/friday/paint/view/ThePaintFragment;ILvc/c;)V

    .line 13
    .line 14
    .line 15
    const/4 v4, 0x2

    .line 16
    const/4 v5, 0x0

    .line 17
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final getIClassManager()Lj2/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/view/ThePaintFragment;->k:Lj2/b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "iClassManager"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public getLayoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/friday/paint/R$layout;->fragment_the_paint:I

    .line 2
    .line 3
    return v0
.end method

.method public final i0(ILandroid/graphics/Bitmap;Z)V
    .locals 8

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/friday/paint/view/ThePaintFragment;->u0()Lcom/friday/paint/adapter/ThumbnailListAdapter;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/16 v1, 0x63

    .line 16
    .line 17
    if-lt v0, v1, :cond_0

    .line 18
    .line 19
    const-string p1, "\u5df2\u8fbe\u9875\u6570\u4e0a\u9650\uff0c\u65e0\u6cd5\u65b0\u589e\u7b14\u8bb0\u9875"

    .line 20
    .line 21
    invoke-static {p1}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    invoke-static {}, Lcom/blankj/utilcode/util/PathUtils;->getExternalAppDocumentsPath()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 32
    .line 33
    .line 34
    move-result-wide v2

    .line 35
    new-instance v4, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    if-eqz p2, :cond_1

    .line 54
    .line 55
    invoke-direct {p0}, Lcom/friday/paint/view/ThePaintFragment;->v0()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v1}, Lcom/friday/paint/viewmodel/NoteViewModel;->F()Ljava/util/HashMap;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-interface {v1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    :cond_1
    invoke-static {v0}, Lcom/blankj/utilcode/util/FileUtils;->createOrExistsDir(Ljava/lang/String;)Z

    .line 67
    .line 68
    .line 69
    new-instance p2, Lcom/friday/paint/model/PaintEntity;

    .line 70
    .line 71
    invoke-direct {p2, v0}, Lcom/friday/paint/model/PaintEntity;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Lcom/friday/paint/view/ThePaintFragment;->t0()Lcom/friday/paint/adapter/NoteFragmentStateAdapter;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-virtual {v1, p1, p2}, Lcom/friday/paint/adapter/NoteFragmentStateAdapter;->a(ILcom/friday/paint/model/PaintEntity;)V

    .line 79
    .line 80
    .line 81
    if-eqz p3, :cond_3

    .line 82
    .line 83
    invoke-virtual {p0}, Lcom/friday/paint/view/ThePaintFragment;->u0()Lcom/friday/paint/adapter/ThumbnailListAdapter;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    invoke-virtual {p2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    check-cast p2, Ljava/lang/Iterable;

    .line 92
    .line 93
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    const/4 v1, 0x0

    .line 98
    move v2, v1

    .line 99
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    if-eqz v3, :cond_3

    .line 104
    .line 105
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    add-int/lit8 v4, v2, 0x1

    .line 110
    .line 111
    if-gez v2, :cond_2

    .line 112
    .line 113
    invoke-static {}, Lrc/w;->w()V

    .line 114
    .line 115
    .line 116
    :cond_2
    check-cast v3, Lcom/friday/paint/model/NoteListEntity;

    .line 117
    .line 118
    invoke-virtual {v3, v1}, Lcom/friday/paint/model/NoteListEntity;->setInClass(Z)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0}, Lcom/friday/paint/view/ThePaintFragment;->u0()Lcom/friday/paint/adapter/ThumbnailListAdapter;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    sget-object v5, Lcom/friday/common/entity/PayloadKey;->IN_CLASS:Lcom/friday/common/entity/PayloadKey;

    .line 126
    .line 127
    invoke-virtual {v3, v2, v5}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(ILjava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    move v2, v4

    .line 131
    goto :goto_0

    .line 132
    :cond_3
    invoke-virtual {p0}, Lcom/friday/paint/view/ThePaintFragment;->u0()Lcom/friday/paint/adapter/ThumbnailListAdapter;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    new-instance v1, Lcom/friday/paint/model/NoteListEntity;

    .line 137
    .line 138
    new-instance v2, Ljava/lang/StringBuilder;

    .line 139
    .line 140
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    const-string v0, "/thumbnail.jpg"

    .line 147
    .line 148
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    const/16 v6, 0x8

    .line 156
    .line 157
    const/4 v7, 0x0

    .line 158
    const/4 v3, 0x1

    .line 159
    const/4 v5, 0x0

    .line 160
    move v4, p3

    .line 161
    invoke-direct/range {v1 .. v7}, Lcom/friday/paint/model/NoteListEntity;-><init>(Ljava/lang/String;ZZLjava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p2, p1, v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->addData(ILjava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0}, Lcom/friday/paint/view/ThePaintFragment;->u0()Lcom/friday/paint/adapter/ThumbnailListAdapter;

    .line 168
    .line 169
    .line 170
    move-result-object p2

    .line 171
    invoke-virtual {p2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 172
    .line 173
    .line 174
    move-result-object p2

    .line 175
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 176
    .line 177
    .line 178
    move-result p2

    .line 179
    move p3, p1

    .line 180
    :goto_1
    if-ge p3, p2, :cond_4

    .line 181
    .line 182
    invoke-virtual {p0}, Lcom/friday/paint/view/ThePaintFragment;->u0()Lcom/friday/paint/adapter/ThumbnailListAdapter;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-virtual {v0, p3}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 187
    .line 188
    .line 189
    add-int/lit8 p3, p3, 0x1

    .line 190
    .line 191
    goto :goto_1

    .line 192
    :cond_4
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 193
    .line 194
    .line 195
    move-result-object p2

    .line 196
    check-cast p2, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 197
    .line 198
    iget-object p2, p2, Lcom/friday/paint/databinding/FragmentThePaintBinding;->E:Landroidx/recyclerview/widget/RecyclerView;

    .line 199
    .line 200
    new-instance p3, Lc4/u0;

    .line 201
    .line 202
    invoke-direct {p3, p0, p1}, Lc4/u0;-><init>(Lcom/friday/paint/view/ThePaintFragment;I)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {p2, p3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 206
    .line 207
    .line 208
    return-void
.end method

.method public initData()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/paint/view/ThePaintFragment;->X0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/friday/paint/view/ThePaintFragment;->initDrawerRight()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/friday/paint/view/ThePaintFragment;->initPaint()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/friday/paint/view/ThePaintFragment;->initObserver()V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Lcom/friday/paint/view/ThePaintFragment;->initClick()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final initDrawerRight()V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->E:Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-direct {v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/friday/paint/view/ThePaintFragment;->u0()Lcom/friday/paint/adapter/ThumbnailListAdapter;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/friday/paint/view/ThePaintFragment;->u0()Lcom/friday/paint/adapter/ThumbnailListAdapter;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    new-instance v2, Lc4/z0;

    .line 33
    .line 34
    invoke-direct {v2, p0}, Lc4/z0;-><init>(Lcom/friday/paint/view/ThePaintFragment;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setOnItemClickListener(Lo1/d;)V

    .line 38
    .line 39
    .line 40
    new-instance v1, Lcom/friday/common/helper/RightListDecoration;

    .line 41
    .line 42
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    const-string v3, "getContext(...)"

    .line 47
    .line 48
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-direct {v1, v2}, Lcom/friday/common/helper/RightListDecoration;-><init>(Landroid/content/Context;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 62
    .line 63
    iget-object v0, v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->d:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 64
    .line 65
    new-instance v1, Lcom/friday/paint/view/ThePaintFragment$initDrawerRight$2;

    .line 66
    .line 67
    invoke-direct {v1, p0}, Lcom/friday/paint/view/ThePaintFragment$initDrawerRight$2;-><init>(Lcom/friday/paint/view/ThePaintFragment;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->addDrawerListener(Landroidx/drawerlayout/widget/DrawerLayout$DrawerListener;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    check-cast v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 78
    .line 79
    iget-object v0, v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->d:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 80
    .line 81
    const/4 v1, 0x1

    .line 82
    invoke-virtual {v0, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->setDrawerLockMode(I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 90
    .line 91
    iget-object v0, v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->t:Landroid/widget/ImageView;

    .line 92
    .line 93
    new-instance v2, Lc4/a1;

    .line 94
    .line 95
    invoke-direct {v2, p0}, Lc4/a1;-><init>(Lcom/friday/paint/view/ThePaintFragment;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    check-cast v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 106
    .line 107
    iget-object v0, v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->k:Landroid/widget/ImageView;

    .line 108
    .line 109
    const-string v2, "ivCopyToOthers"

    .line 110
    .line 111
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    new-instance v2, Lc4/b1;

    .line 115
    .line 116
    invoke-direct {v2, p0}, Lc4/b1;-><init>(Lcom/friday/paint/view/ThePaintFragment;)V

    .line 117
    .line 118
    .line 119
    const-wide/16 v3, 0x3e8

    .line 120
    .line 121
    invoke-static {v0, v3, v4, v2}, Lz1/b;->l(Landroid/view/View;JLandroid/view/View$OnClickListener;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    check-cast v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 129
    .line 130
    iget-object v0, v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->j:Landroid/widget/ImageView;

    .line 131
    .line 132
    const-string v2, "ivCopyPage"

    .line 133
    .line 134
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    new-instance v2, Lc4/s;

    .line 138
    .line 139
    invoke-direct {v2, p0}, Lc4/s;-><init>(Lcom/friday/paint/view/ThePaintFragment;)V

    .line 140
    .line 141
    .line 142
    const-wide/16 v5, 0x7d0

    .line 143
    .line 144
    invoke-static {v0, v5, v6, v2}, Lz1/b;->l(Landroid/view/View;JLandroid/view/View$OnClickListener;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    check-cast v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 152
    .line 153
    iget-object v0, v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->e:Landroid/widget/ImageView;

    .line 154
    .line 155
    const-string v2, "ivAddPage"

    .line 156
    .line 157
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    new-instance v2, Lc4/t;

    .line 161
    .line 162
    invoke-direct {v2, p0}, Lc4/t;-><init>(Lcom/friday/paint/view/ThePaintFragment;)V

    .line 163
    .line 164
    .line 165
    invoke-static {v0, v3, v4, v2}, Lz1/b;->l(Landroid/view/View;JLandroid/view/View$OnClickListener;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p0}, Lcom/friday/paint/view/ThePaintFragment;->u0()Lcom/friday/paint/adapter/ThumbnailListAdapter;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-virtual {v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getDraggableModule()Lp1/a;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-virtual {v0, v1}, Lp1/a;->s(Z)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0}, Lp1/a;->c()Lcom/chad/library/adapter/base/dragswipe/DragAndSwipeCallback;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    const/4 v1, 0x3

    .line 184
    invoke-virtual {v0, v1}, Lcom/chad/library/adapter/base/dragswipe/DragAndSwipeCallback;->b(I)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p0}, Lcom/friday/paint/view/ThePaintFragment;->u0()Lcom/friday/paint/adapter/ThumbnailListAdapter;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-virtual {v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getDraggableModule()Lp1/a;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    new-instance v1, Lcom/friday/paint/view/ThePaintFragment$b;

    .line 196
    .line 197
    invoke-direct {v1, p0}, Lcom/friday/paint/view/ThePaintFragment$b;-><init>(Lcom/friday/paint/view/ThePaintFragment;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v0, v1}, Lp1/a;->v(Lo1/e;)V

    .line 201
    .line 202
    .line 203
    return-void
.end method

.method public final initPaint()V
    .locals 14

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/friday/paint/view/ThePaintFragment;->v0()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Lcom/friday/paint/viewmodel/NoteViewModel;->C()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Ljava/lang/Iterable;

    .line 15
    .line 16
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const/4 v2, 0x0

    .line 21
    move v3, v2

    .line 22
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-eqz v4, :cond_2

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    add-int/lit8 v5, v3, 0x1

    .line 33
    .line 34
    if-gez v3, :cond_0

    .line 35
    .line 36
    invoke-static {}, Lrc/w;->w()V

    .line 37
    .line 38
    .line 39
    :cond_0
    check-cast v4, Ljava/io/File;

    .line 40
    .line 41
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    new-instance v6, Lcom/friday/paint/model/PaintEntity;

    .line 46
    .line 47
    invoke-static {v4}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-direct {v6, v4}, Lcom/friday/paint/model/PaintEntity;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/friday/paint/view/ThePaintFragment;->u0()Lcom/friday/paint/adapter/ThumbnailListAdapter;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    new-instance v7, Lcom/friday/paint/model/NoteListEntity;

    .line 61
    .line 62
    new-instance v8, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v4, "/thumbnail.jpg"

    .line 71
    .line 72
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v8

    .line 79
    if-nez v3, :cond_1

    .line 80
    .line 81
    const/4 v3, 0x1

    .line 82
    move v9, v3

    .line 83
    goto :goto_1

    .line 84
    :cond_1
    move v9, v2

    .line 85
    :goto_1
    const/16 v12, 0xc

    .line 86
    .line 87
    const/4 v13, 0x0

    .line 88
    const/4 v10, 0x0

    .line 89
    const/4 v11, 0x0

    .line 90
    invoke-direct/range {v7 .. v13}, Lcom/friday/paint/model/NoteListEntity;-><init>(Ljava/lang/String;ZZLjava/lang/String;ILkotlin/jvm/internal/n;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v6, v7}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->addData(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    move v3, v5

    .line 97
    goto :goto_0

    .line 98
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-eqz v1, :cond_3

    .line 103
    .line 104
    const/4 v7, 0x6

    .line 105
    const/4 v8, 0x0

    .line 106
    const/4 v4, 0x0

    .line 107
    const/4 v5, 0x0

    .line 108
    const/4 v6, 0x0

    .line 109
    move-object v3, p0

    .line 110
    invoke-static/range {v3 .. v8}, Lcom/friday/paint/view/ThePaintFragment;->j0(Lcom/friday/paint/view/ThePaintFragment;ILandroid/graphics/Bitmap;ZILjava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :cond_3
    invoke-virtual {p0}, Lcom/friday/paint/view/ThePaintFragment;->t0()Lcom/friday/paint/adapter/NoteFragmentStateAdapter;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-virtual {v1, v0}, Lcom/friday/paint/adapter/NoteFragmentStateAdapter;->b(Ljava/util/List;)V

    .line 119
    .line 120
    .line 121
    invoke-direct {p0}, Lcom/friday/paint/view/ThePaintFragment;->v0()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-virtual {v0, v2}, Lcom/friday/paint/viewmodel/NoteViewModel;->V(I)V

    .line 126
    .line 127
    .line 128
    return-void
.end method

.method public final l0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v1, Landroidx/appcompat/app/AlertDialog$Builder;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Landroidx/appcompat/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    sget v0, Lcom/friday/paint/R$string;->clear_canvas:I

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Landroidx/appcompat/app/AlertDialog$Builder;->setMessage(I)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sget v1, Lcom/friday/paint/R$string;->sure:I

    .line 19
    .line 20
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    new-instance v2, Lc4/p0;

    .line 25
    .line 26
    invoke-direct {v2, p0}, Lc4/p0;-><init>(Lcom/friday/paint/view/ThePaintFragment;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sget v1, Lcom/friday/paint/R$string;->cancel:I

    .line 34
    .line 35
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    new-instance v2, Lc4/q0;

    .line 40
    .line 41
    invoke-direct {v2}, Lc4/q0;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Landroidx/appcompat/app/AlertDialog$Builder;->create()Landroidx/appcompat/app/AlertDialog;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 53
    .line 54
    .line 55
    :cond_0
    return-void
.end method

.method public final moveToPosition(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstCompletelyVisibleItemPosition()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastCompletelyVisibleItemPosition()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-gt v1, p2, :cond_0

    .line 21
    .line 22
    if-gt p2, v0, :cond_0

    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    if-nez v1, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->getChildLayoutPosition(Landroid/view/View;)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    add-int/lit8 v2, v2, -0x1

    .line 42
    .line 43
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->getChildLayoutPosition(Landroid/view/View;)I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-lt p2, v1, :cond_4

    .line 52
    .line 53
    if-le p2, v2, :cond_2

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_2
    sub-int/2addr p2, v1

    .line 57
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    if-eqz p2, :cond_3

    .line 62
    .line 63
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    invoke-virtual {p1, v0, p2}, Landroidx/recyclerview/widget/RecyclerView;->scrollBy(II)V

    .line 68
    .line 69
    .line 70
    :cond_3
    :goto_0
    return-void

    .line 71
    :cond_4
    :goto_1
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public final o0()V
    .locals 4

    .line 1
    sget-object v0, Lk2/n;->a:Lk2/n$a;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-static {v0, v3, v1, v2}, Lk2/n$a;->g(Lk2/n$a;IILjava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final p0(Ljava/lang/String;Ljava/lang/String;Lvc/c;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    instance-of v1, v0, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;

    .line 9
    .line 10
    iget v2, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->o:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->o:I

    .line 20
    .line 21
    move-object/from16 v2, p0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;

    .line 25
    .line 26
    move-object/from16 v2, p0

    .line 27
    .line 28
    invoke-direct {v1, v2, v0}, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;-><init>(Lcom/friday/paint/view/ThePaintFragment;Lvc/c;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v0, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->m:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    iget v4, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->o:I

    .line 38
    .line 39
    const/4 v5, 0x3

    .line 40
    const/4 v6, 0x2

    .line 41
    const/4 v7, 0x1

    .line 42
    const-string v8, "getAbsolutePath(...)"

    .line 43
    .line 44
    if-eqz v4, :cond_4

    .line 45
    .line 46
    if-eq v4, v7, :cond_3

    .line 47
    .line 48
    if-eq v4, v6, :cond_2

    .line 49
    .line 50
    if-ne v4, v5, :cond_1

    .line 51
    .line 52
    iget-object v4, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->j:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v4, Ljava/io/File;

    .line 55
    .line 56
    iget-object v4, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->i:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v4, Ljava/util/Iterator;

    .line 59
    .line 60
    iget-object v9, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->h:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v9, Ljava/util/List;

    .line 63
    .line 64
    iget-object v10, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->g:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v10, Ljava/io/File;

    .line 67
    .line 68
    iget-object v11, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->f:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v11, Ljava/util/Iterator;

    .line 71
    .line 72
    iget-object v12, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->e:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v12, Ljava/util/List;

    .line 75
    .line 76
    iget-object v13, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->d:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v13, Ljava/lang/String;

    .line 79
    .line 80
    iget-object v14, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->c:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v14, Ljava/lang/String;

    .line 83
    .line 84
    :try_start_0
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    .line 86
    .line 87
    move v6, v5

    .line 88
    move/from16 v23, v7

    .line 89
    .line 90
    move-object v5, v12

    .line 91
    move-object v12, v4

    .line 92
    move-object v4, v13

    .line 93
    move-object v13, v10

    .line 94
    move-object v10, v11

    .line 95
    move-object v11, v9

    .line 96
    move-object v9, v1

    .line 97
    move-object v1, v14

    .line 98
    goto/16 :goto_a

    .line 99
    .line 100
    :catchall_0
    move-exception v0

    .line 101
    move v6, v5

    .line 102
    move/from16 v23, v7

    .line 103
    .line 104
    move-object v5, v12

    .line 105
    move-object v12, v4

    .line 106
    move-object v4, v13

    .line 107
    move-object v13, v10

    .line 108
    move-object v10, v11

    .line 109
    move-object v11, v9

    .line 110
    move-object v9, v1

    .line 111
    move-object v1, v14

    .line 112
    goto/16 :goto_f

    .line 113
    .line 114
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 115
    .line 116
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 117
    .line 118
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw v0

    .line 122
    :cond_2
    iget v4, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->k:I

    .line 123
    .line 124
    iget-object v9, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->j:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v9, Ljava/io/File;

    .line 127
    .line 128
    iget-object v10, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->i:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v10, Ljava/util/Iterator;

    .line 131
    .line 132
    iget-object v11, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->h:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v11, Ljava/util/List;

    .line 135
    .line 136
    iget-object v12, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->g:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v12, Ljava/io/File;

    .line 139
    .line 140
    iget-object v13, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->f:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v13, Ljava/util/Iterator;

    .line 143
    .line 144
    iget-object v14, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->e:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v14, Ljava/util/List;

    .line 147
    .line 148
    iget-object v15, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->d:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v15, Ljava/lang/String;

    .line 151
    .line 152
    iget-object v5, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->c:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v5, Ljava/lang/String;

    .line 155
    .line 156
    :try_start_1
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 157
    .line 158
    .line 159
    move/from16 v23, v7

    .line 160
    .line 161
    move v7, v6

    .line 162
    move v6, v4

    .line 163
    move-object v4, v10

    .line 164
    move-object v10, v11

    .line 165
    move-object v11, v13

    .line 166
    move-object v13, v15

    .line 167
    move-object v15, v5

    .line 168
    goto/16 :goto_5

    .line 169
    .line 170
    :catchall_1
    move-exception v0

    .line 171
    move-object v4, v12

    .line 172
    move-object v12, v10

    .line 173
    move-object v10, v13

    .line 174
    move-object v13, v4

    .line 175
    move-object v9, v1

    .line 176
    move-object v1, v5

    .line 177
    move/from16 v23, v7

    .line 178
    .line 179
    move-object v5, v14

    .line 180
    move-object v4, v15

    .line 181
    :goto_1
    const/4 v6, 0x3

    .line 182
    goto/16 :goto_f

    .line 183
    .line 184
    :cond_3
    iget v4, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->k:I

    .line 185
    .line 186
    iget-object v5, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->j:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v5, Ljava/io/File;

    .line 189
    .line 190
    iget-object v9, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->i:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast v9, Ljava/util/Iterator;

    .line 193
    .line 194
    iget-object v10, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->h:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast v10, Ljava/util/List;

    .line 197
    .line 198
    iget-object v11, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->g:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v11, Ljava/io/File;

    .line 201
    .line 202
    iget-object v12, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->f:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v12, Ljava/util/Iterator;

    .line 205
    .line 206
    iget-object v13, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->e:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v13, Ljava/util/List;

    .line 209
    .line 210
    iget-object v14, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->d:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v14, Ljava/lang/String;

    .line 213
    .line 214
    iget-object v15, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->c:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v15, Ljava/lang/String;

    .line 217
    .line 218
    :try_start_2
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 219
    .line 220
    .line 221
    move-object v6, v13

    .line 222
    move-object v13, v11

    .line 223
    move-object v11, v12

    .line 224
    move-object v12, v6

    .line 225
    move v6, v4

    .line 226
    move-object v4, v9

    .line 227
    move-object v9, v5

    .line 228
    goto/16 :goto_4

    .line 229
    .line 230
    :catchall_2
    move-exception v0

    .line 231
    move/from16 v23, v7

    .line 232
    .line 233
    move-object v5, v13

    .line 234
    move-object v4, v14

    .line 235
    const/4 v6, 0x3

    .line 236
    move-object v13, v11

    .line 237
    move-object v11, v10

    .line 238
    move-object v10, v12

    .line 239
    move-object v12, v9

    .line 240
    move-object v9, v1

    .line 241
    move-object v1, v15

    .line 242
    goto/16 :goto_f

    .line 243
    .line 244
    :cond_4
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    invoke-static/range {p1 .. p1}, Lcom/blankj/utilcode/util/FileUtils;->listFilesInDir(Ljava/lang/String;)Ljava/util/List;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 252
    .line 253
    .line 254
    move-result-object v4

    .line 255
    move-object v5, v1

    .line 256
    move-object v9, v4

    .line 257
    move-object/from16 v1, p2

    .line 258
    .line 259
    move-object v4, v0

    .line 260
    move-object/from16 v0, p1

    .line 261
    .line 262
    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 263
    .line 264
    .line 265
    move-result v10

    .line 266
    if-eqz v10, :cond_b

    .line 267
    .line 268
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v10

    .line 272
    check-cast v10, Ljava/io/File;

    .line 273
    .line 274
    invoke-virtual {v10}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v11

    .line 278
    const-string v12, "res"

    .line 279
    .line 280
    invoke-static {v11, v12}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result v11

    .line 284
    if-eqz v11, :cond_a

    .line 285
    .line 286
    invoke-virtual {v10}, Ljava/io/File;->isDirectory()Z

    .line 287
    .line 288
    .line 289
    move-result v11

    .line 290
    if-eqz v11, :cond_a

    .line 291
    .line 292
    invoke-static {v10}, Lcom/blankj/utilcode/util/FileUtils;->listFilesInDir(Ljava/io/File;)Ljava/util/List;

    .line 293
    .line 294
    .line 295
    move-result-object v11

    .line 296
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 297
    .line 298
    .line 299
    move-result-object v12

    .line 300
    move-object v13, v10

    .line 301
    move-object v10, v9

    .line 302
    move-object v9, v5

    .line 303
    move-object v5, v4

    .line 304
    move-object v4, v1

    .line 305
    move-object v1, v0

    .line 306
    :goto_3
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    if-eqz v0, :cond_9

    .line 311
    .line 312
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    check-cast v0, Ljava/io/File;

    .line 317
    .line 318
    :try_start_3
    sget-object v14, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 319
    .line 320
    invoke-direct {v2}, Lcom/friday/paint/view/ThePaintFragment;->v0()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 321
    .line 322
    .line 323
    move-result-object v14

    .line 324
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v15

    .line 328
    invoke-static {v15, v8}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    iput-object v1, v9, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->c:Ljava/lang/Object;

    .line 332
    .line 333
    iput-object v4, v9, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->d:Ljava/lang/Object;

    .line 334
    .line 335
    invoke-static {v5}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v6

    .line 339
    iput-object v6, v9, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->e:Ljava/lang/Object;

    .line 340
    .line 341
    iput-object v10, v9, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->f:Ljava/lang/Object;

    .line 342
    .line 343
    invoke-static {v13}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v6

    .line 347
    iput-object v6, v9, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->g:Ljava/lang/Object;

    .line 348
    .line 349
    invoke-static {v11}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v6

    .line 353
    iput-object v6, v9, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->h:Ljava/lang/Object;

    .line 354
    .line 355
    iput-object v12, v9, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->i:Ljava/lang/Object;

    .line 356
    .line 357
    iput-object v0, v9, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->j:Ljava/lang/Object;

    .line 358
    .line 359
    const/4 v6, 0x0

    .line 360
    iput v6, v9, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->k:I

    .line 361
    .line 362
    iput v7, v9, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->o:I

    .line 363
    .line 364
    invoke-virtual {v14, v15, v9}, Lcom/friday/paint/viewmodel/NoteViewModel;->I(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v14
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_d

    .line 368
    if-ne v14, v3, :cond_5

    .line 369
    .line 370
    goto/16 :goto_9

    .line 371
    .line 372
    :cond_5
    move-object v15, v11

    .line 373
    move-object v11, v10

    .line 374
    move-object v10, v15

    .line 375
    move-object v15, v1

    .line 376
    move-object v1, v9

    .line 377
    move-object v9, v0

    .line 378
    move-object v0, v14

    .line 379
    move-object v14, v4

    .line 380
    move-object v4, v12

    .line 381
    move-object v12, v5

    .line 382
    :goto_4
    if-eqz v0, :cond_7

    .line 383
    .line 384
    :try_start_4
    invoke-direct {v2}, Lcom/friday/paint/view/ThePaintFragment;->v0()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v5

    .line 392
    invoke-static {v5, v8}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    iput-object v15, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->c:Ljava/lang/Object;

    .line 396
    .line 397
    iput-object v14, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->d:Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_6

    .line 398
    .line 399
    move/from16 v23, v7

    .line 400
    .line 401
    :try_start_5
    invoke-static {v12}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v7

    .line 405
    iput-object v7, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->e:Ljava/lang/Object;

    .line 406
    .line 407
    iput-object v11, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->f:Ljava/lang/Object;

    .line 408
    .line 409
    invoke-static {v13}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v7

    .line 413
    iput-object v7, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->g:Ljava/lang/Object;

    .line 414
    .line 415
    invoke-static {v10}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v7

    .line 419
    iput-object v7, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->h:Ljava/lang/Object;

    .line 420
    .line 421
    iput-object v4, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->i:Ljava/lang/Object;

    .line 422
    .line 423
    iput-object v9, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->j:Ljava/lang/Object;

    .line 424
    .line 425
    iput v6, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->k:I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 426
    .line 427
    const/4 v7, 0x2

    .line 428
    :try_start_6
    iput v7, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->o:I

    .line 429
    .line 430
    invoke-virtual {v0, v5, v1}, Lcom/friday/paint/viewmodel/NoteViewModel;->I(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 434
    if-ne v0, v3, :cond_6

    .line 435
    .line 436
    goto/16 :goto_9

    .line 437
    .line 438
    :cond_6
    move-object/from16 v24, v14

    .line 439
    .line 440
    move-object v14, v12

    .line 441
    move-object v12, v13

    .line 442
    move-object/from16 v13, v24

    .line 443
    .line 444
    :goto_5
    :try_start_7
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 445
    .line 446
    .line 447
    check-cast v0, Ljava/lang/Number;

    .line 448
    .line 449
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 450
    .line 451
    .line 452
    move-result v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 453
    move-object/from16 v17, v13

    .line 454
    .line 455
    move-object/from16 v16, v15

    .line 456
    .line 457
    goto/16 :goto_8

    .line 458
    .line 459
    :catchall_3
    move-exception v0

    .line 460
    move-object v5, v12

    .line 461
    move-object v12, v4

    .line 462
    move-object v4, v13

    .line 463
    move-object v13, v5

    .line 464
    move-object v5, v11

    .line 465
    move-object v11, v10

    .line 466
    move-object v10, v5

    .line 467
    move-object v9, v1

    .line 468
    move-object v5, v14

    .line 469
    move-object v1, v15

    .line 470
    goto/16 :goto_1

    .line 471
    .line 472
    :catchall_4
    move-exception v0

    .line 473
    :goto_6
    move-object v5, v11

    .line 474
    move-object v11, v10

    .line 475
    move-object v10, v5

    .line 476
    move-object v9, v1

    .line 477
    move-object v5, v12

    .line 478
    move-object v1, v15

    .line 479
    const/4 v6, 0x3

    .line 480
    move-object v12, v4

    .line 481
    move-object v4, v14

    .line 482
    goto/16 :goto_f

    .line 483
    .line 484
    :catchall_5
    move-exception v0

    .line 485
    :goto_7
    const/4 v7, 0x2

    .line 486
    goto :goto_6

    .line 487
    :catchall_6
    move-exception v0

    .line 488
    move/from16 v23, v7

    .line 489
    .line 490
    goto :goto_7

    .line 491
    :cond_7
    move/from16 v23, v7

    .line 492
    .line 493
    const/4 v7, 0x2

    .line 494
    :try_start_8
    sget-object v0, Lf2/d;->a:Lf2/d;

    .line 495
    .line 496
    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 497
    .line 498
    .line 499
    move-result-object v5

    .line 500
    invoke-static {v5, v8}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_c

    .line 501
    .line 502
    .line 503
    const/16 v21, 0x4

    .line 504
    .line 505
    const/16 v22, 0x0

    .line 506
    .line 507
    const/16 v20, 0x0

    .line 508
    .line 509
    move-object/from16 v17, v5

    .line 510
    .line 511
    move-object/from16 v19, v14

    .line 512
    .line 513
    move-object/from16 v18, v15

    .line 514
    .line 515
    :try_start_9
    invoke-static/range {v17 .. v22}, Lqd/z;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 516
    .line 517
    .line 518
    move-result-object v5

    .line 519
    invoke-virtual {v0, v5}, Lf2/d;->d(Ljava/lang/String;)[F

    .line 520
    .line 521
    .line 522
    move-result-object v0

    .line 523
    aget v0, v0, v23
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_b

    .line 524
    .line 525
    const/16 v5, 0x64

    .line 526
    .line 527
    int-to-float v5, v5

    .line 528
    mul-float/2addr v0, v5

    .line 529
    float-to-int v0, v0

    .line 530
    move-object v14, v12

    .line 531
    move-object v12, v13

    .line 532
    move-object/from16 v16, v18

    .line 533
    .line 534
    move-object/from16 v17, v19

    .line 535
    .line 536
    :goto_8
    :try_start_a
    invoke-direct {v2}, Lcom/friday/paint/view/ThePaintFragment;->v0()Lcom/friday/paint/viewmodel/NoteViewModel;

    .line 537
    .line 538
    .line 539
    move-result-object v5

    .line 540
    new-instance v13, Lcom/friday/common/entity/ImageSafetyEntity;

    .line 541
    .line 542
    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 543
    .line 544
    .line 545
    move-result-object v15

    .line 546
    invoke-static {v15, v8}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 547
    .line 548
    .line 549
    const/16 v19, 0x4

    .line 550
    .line 551
    const/16 v20, 0x0

    .line 552
    .line 553
    const/16 v18, 0x0

    .line 554
    .line 555
    invoke-static/range {v15 .. v20}, Lqd/z;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 556
    .line 557
    .line 558
    move-result-object v15
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    .line 559
    move-object/from16 v2, v16

    .line 560
    .line 561
    move-object/from16 v7, v17

    .line 562
    .line 563
    :try_start_b
    invoke-direct {v13, v15, v0}, Lcom/friday/common/entity/ImageSafetyEntity;-><init>(Ljava/lang/String;I)V

    .line 564
    .line 565
    .line 566
    iput-object v2, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->c:Ljava/lang/Object;

    .line 567
    .line 568
    iput-object v7, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->d:Ljava/lang/Object;

    .line 569
    .line 570
    invoke-static {v14}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 571
    .line 572
    .line 573
    move-result-object v15

    .line 574
    iput-object v15, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->e:Ljava/lang/Object;

    .line 575
    .line 576
    iput-object v11, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->f:Ljava/lang/Object;

    .line 577
    .line 578
    invoke-static {v12}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    move-result-object v15

    .line 582
    iput-object v15, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->g:Ljava/lang/Object;

    .line 583
    .line 584
    invoke-static {v10}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 585
    .line 586
    .line 587
    move-result-object v15

    .line 588
    iput-object v15, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->h:Ljava/lang/Object;

    .line 589
    .line 590
    iput-object v4, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->i:Ljava/lang/Object;

    .line 591
    .line 592
    invoke-static {v9}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 593
    .line 594
    .line 595
    move-result-object v9

    .line 596
    iput-object v9, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->j:Ljava/lang/Object;

    .line 597
    .line 598
    iput v6, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->k:I

    .line 599
    .line 600
    iput v0, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->l:I
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_9

    .line 601
    .line 602
    const/4 v6, 0x3

    .line 603
    :try_start_c
    iput v6, v1, Lcom/friday/paint/view/ThePaintFragment$checkCopyImageSafe$1;->o:I

    .line 604
    .line 605
    invoke-virtual {v5, v13, v1}, Lcom/friday/paint/viewmodel/NoteViewModel;->O(Lcom/friday/common/entity/ImageSafetyEntity;Lvc/c;)Ljava/lang/Object;

    .line 606
    .line 607
    .line 608
    move-result-object v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    .line 609
    if-ne v0, v3, :cond_8

    .line 610
    .line 611
    :goto_9
    return-object v3

    .line 612
    :cond_8
    move-object v5, v11

    .line 613
    move-object v11, v10

    .line 614
    move-object v10, v5

    .line 615
    move-object v9, v1

    .line 616
    move-object v1, v2

    .line 617
    move-object v13, v12

    .line 618
    move-object v5, v14

    .line 619
    move-object v12, v4

    .line 620
    move-object v4, v7

    .line 621
    :goto_a
    :try_start_d
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 622
    .line 623
    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    .line 624
    .line 625
    .line 626
    :goto_b
    const/4 v6, 0x2

    .line 627
    move-object/from16 v2, p0

    .line 628
    .line 629
    move/from16 v7, v23

    .line 630
    .line 631
    goto/16 :goto_3

    .line 632
    .line 633
    :catchall_7
    move-exception v0

    .line 634
    goto :goto_f

    .line 635
    :catchall_8
    move-exception v0

    .line 636
    :goto_c
    move-object v5, v11

    .line 637
    move-object v11, v10

    .line 638
    move-object v10, v5

    .line 639
    move-object v9, v1

    .line 640
    move-object v1, v2

    .line 641
    move-object v13, v12

    .line 642
    move-object v5, v14

    .line 643
    move-object v12, v4

    .line 644
    move-object v4, v7

    .line 645
    goto :goto_f

    .line 646
    :catchall_9
    move-exception v0

    .line 647
    :goto_d
    const/4 v6, 0x3

    .line 648
    goto :goto_c

    .line 649
    :catchall_a
    move-exception v0

    .line 650
    move-object/from16 v2, v16

    .line 651
    .line 652
    move-object/from16 v7, v17

    .line 653
    .line 654
    goto :goto_d

    .line 655
    :catchall_b
    move-exception v0

    .line 656
    :goto_e
    const/4 v6, 0x3

    .line 657
    move-object v5, v11

    .line 658
    move-object v11, v10

    .line 659
    move-object v10, v5

    .line 660
    move-object v9, v1

    .line 661
    move-object v5, v12

    .line 662
    move-object/from16 v1, v18

    .line 663
    .line 664
    move-object v12, v4

    .line 665
    move-object/from16 v4, v19

    .line 666
    .line 667
    goto :goto_f

    .line 668
    :catchall_c
    move-exception v0

    .line 669
    move-object/from16 v19, v14

    .line 670
    .line 671
    move-object/from16 v18, v15

    .line 672
    .line 673
    goto :goto_e

    .line 674
    :catchall_d
    move-exception v0

    .line 675
    move/from16 v23, v7

    .line 676
    .line 677
    goto/16 :goto_1

    .line 678
    .line 679
    :goto_f
    sget-object v2, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 680
    .line 681
    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 682
    .line 683
    .line 684
    move-result-object v0

    .line 685
    invoke-static {v0}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 686
    .line 687
    .line 688
    goto :goto_b

    .line 689
    :cond_9
    move-object/from16 v2, p0

    .line 690
    .line 691
    move-object v0, v1

    .line 692
    move-object v1, v4

    .line 693
    move-object v4, v5

    .line 694
    move-object v5, v9

    .line 695
    move-object v9, v10

    .line 696
    goto/16 :goto_2

    .line 697
    .line 698
    :cond_a
    move/from16 v23, v7

    .line 699
    .line 700
    const/4 v6, 0x3

    .line 701
    const/4 v6, 0x2

    .line 702
    move-object/from16 v2, p0

    .line 703
    .line 704
    move/from16 v7, v23

    .line 705
    .line 706
    goto/16 :goto_2

    .line 707
    .line 708
    :cond_b
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 709
    .line 710
    return-object v0
.end method

.method public final q0()V
    .locals 2

    .line 1
    sget-object v0, Lk2/n;->a:Lk2/n$a;

    .line 2
    .line 3
    new-instance v1, Lc4/o0;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lc4/o0;-><init>(Lcom/friday/paint/view/ThePaintFragment;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p0, v1}, Lk2/n$a;->e(Landroidx/fragment/app/Fragment;Lhd/l;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final t0()Lcom/friday/paint/adapter/NoteFragmentStateAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/view/ThePaintFragment;->l:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/paint/adapter/NoteFragmentStateAdapter;

    .line 8
    .line 9
    return-object v0
.end method

.method public final u0()Lcom/friday/paint/adapter/ThumbnailListAdapter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/paint/view/ThePaintFragment;->j:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/paint/adapter/ThumbnailListAdapter;

    .line 8
    .line 9
    return-object v0
.end method

.method public final updateCurrentPage(II)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/friday/paint/databinding/FragmentThePaintBinding;->H:Landroid/widget/TextView;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    sget v2, Lcom/friday/paint/R$string;->current_page_and_total:I

    .line 14
    .line 15
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {v1, v2, p1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method
