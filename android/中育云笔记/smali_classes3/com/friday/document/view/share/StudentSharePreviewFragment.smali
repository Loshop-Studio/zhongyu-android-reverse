.class public final Lcom/friday/document/view/share/StudentSharePreviewFragment;
.super Lcom/friday/document/view/share/Hilt_StudentSharePreviewFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/friday/document/view/share/Hilt_StudentSharePreviewFragment<",
        "Lcom/friday/document/databinding/SharePreviewFragmentBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final i:Lqc/d;

.field public final j:Lcom/friday/document/view/preview/EmptyPreviewFragment;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/friday/document/view/share/Hilt_StudentSharePreviewFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, Lcom/friday/document/viewmodel/ShareBaseViewModel;

    .line 5
    .line 6
    invoke-static {v0}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Lcom/friday/document/view/share/StudentSharePreviewFragment$special$$inlined$activityViewModels$default$1;

    .line 11
    .line 12
    invoke-direct {v1, p0}, Lcom/friday/document/view/share/StudentSharePreviewFragment$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/friday/document/view/share/StudentSharePreviewFragment$special$$inlined$activityViewModels$default$2;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v2, v3, p0}, Lcom/friday/document/view/share/StudentSharePreviewFragment$special$$inlined$activityViewModels$default$2;-><init>(Lhd/a;Landroidx/fragment/app/Fragment;)V

    .line 19
    .line 20
    .line 21
    new-instance v3, Lcom/friday/document/view/share/StudentSharePreviewFragment$special$$inlined$activityViewModels$default$3;

    .line 22
    .line 23
    invoke-direct {v3, p0}, Lcom/friday/document/view/share/StudentSharePreviewFragment$special$$inlined$activityViewModels$default$3;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, v0, v1, v2, v3}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lod/c;Lhd/a;Lhd/a;Lhd/a;)Lqc/d;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lcom/friday/document/view/share/StudentSharePreviewFragment;->i:Lqc/d;

    .line 31
    .line 32
    sget-object v0, Lcom/friday/document/view/preview/EmptyPreviewFragment;->d:Lcom/friday/document/view/preview/EmptyPreviewFragment$a;

    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/friday/document/view/preview/EmptyPreviewFragment$a;->a()Lcom/friday/document/view/preview/EmptyPreviewFragment;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object v0, p0, Lcom/friday/document/view/share/StudentSharePreviewFragment;->j:Lcom/friday/document/view/preview/EmptyPreviewFragment;

    .line 39
    .line 40
    return-void
.end method

.method public static final synthetic A(Lcom/friday/document/view/share/StudentSharePreviewFragment;Lcom/friday/document/model/ShareFile;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/friday/document/view/share/StudentSharePreviewFragment;->K(Lcom/friday/document/model/ShareFile;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final I()Lcom/friday/document/viewmodel/ShareBaseViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/view/share/StudentSharePreviewFragment;->i:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/document/viewmodel/ShareBaseViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public static final J(Lcom/friday/document/view/share/StudentSharePreviewFragment;Landroid/view/View;Landroid/widget/PopupWindow;Lcom/friday/common/databinding/ViewNoteInfoShareToMeBinding;)Lqc/q;
    .locals 2

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "popupWindow"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p1, "binding"

    .line 12
    .line 13
    invoke-static {p3, p1}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Lcom/friday/document/view/share/StudentSharePreviewFragment;->I()Lcom/friday/document/viewmodel/ShareBaseViewModel;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1}, Lcom/friday/document/viewmodel/ShareBaseViewModel;->z()Lvd/u;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-interface {p1}, Lvd/u;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Lcom/friday/document/model/ShareFile;

    .line 29
    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    iget-object p1, p3, Lcom/friday/common/databinding/ViewNoteInfoShareToMeBinding;->d:Landroid/widget/TextView;

    .line 33
    .line 34
    invoke-direct {p0}, Lcom/friday/document/view/share/StudentSharePreviewFragment;->I()Lcom/friday/document/viewmodel/ShareBaseViewModel;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {p0}, Lcom/friday/document/viewmodel/ShareBaseViewModel;->z()Lvd/u;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-interface {p0}, Lvd/u;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    check-cast p0, Lcom/friday/document/model/ShareFile;

    .line 47
    .line 48
    if-eqz p0, :cond_0

    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/friday/document/model/ShareFile;->getShareTime()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    if-nez p0, :cond_1

    .line 55
    .line 56
    :cond_0
    const-string p0, ""

    .line 57
    .line 58
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 61
    .line 62
    .line 63
    const-string v1, "\u6536\u5230\u5206\u4eab\uff1a"

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 76
    .line 77
    .line 78
    iget-object p0, p3, Lcom/friday/common/databinding/ViewNoteInfoShareToMeBinding;->c:Landroid/widget/TextView;

    .line 79
    .line 80
    const/16 p1, 0x8

    .line 81
    .line 82
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 83
    .line 84
    .line 85
    :cond_2
    invoke-virtual {p2}, Landroid/widget/PopupWindow;->dismiss()V

    .line 86
    .line 87
    .line 88
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 89
    .line 90
    return-object p0
.end method

.method public static synthetic r(Lcom/friday/document/view/share/StudentSharePreviewFragment;Landroid/view/View;Landroid/widget/PopupWindow;Lcom/friday/common/databinding/ViewNoteInfoShareToMeBinding;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/document/view/share/StudentSharePreviewFragment;->J(Lcom/friday/document/view/share/StudentSharePreviewFragment;Landroid/view/View;Landroid/widget/PopupWindow;Lcom/friday/common/databinding/ViewNoteInfoShareToMeBinding;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic s(Lcom/friday/document/view/share/StudentSharePreviewFragment;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/share/StudentSharePreviewFragment;->B()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic t(Lcom/friday/document/view/share/StudentSharePreviewFragment;Lcom/friday/document/model/ShareFile;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/share/StudentSharePreviewFragment;->C(Lcom/friday/document/model/ShareFile;Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic u(Lcom/friday/document/view/share/StudentSharePreviewFragment;Lcom/friday/document/model/ShareFile;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/friday/document/view/share/StudentSharePreviewFragment;->D(Lcom/friday/document/model/ShareFile;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic v(Lcom/friday/document/view/share/StudentSharePreviewFragment;Lcom/friday/document/model/ShareFile;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/friday/document/view/share/StudentSharePreviewFragment;->E(Lcom/friday/document/model/ShareFile;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic w(Lcom/friday/document/view/share/StudentSharePreviewFragment;Lcom/friday/document/model/ShareFile;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/friday/document/view/share/StudentSharePreviewFragment;->F(Lcom/friday/document/model/ShareFile;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic x(Lcom/friday/document/view/share/StudentSharePreviewFragment;Lcom/friday/document/model/ShareFile;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/friday/document/view/share/StudentSharePreviewFragment;->G(Lcom/friday/document/model/ShareFile;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic y(Lcom/friday/document/view/share/StudentSharePreviewFragment;Lcom/friday/document/model/ShareFile;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/friday/document/view/share/StudentSharePreviewFragment;->H(Lcom/friday/document/model/ShareFile;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic z(Lcom/friday/document/view/share/StudentSharePreviewFragment;)Lcom/friday/document/viewmodel/ShareBaseViewModel;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/friday/document/view/share/StudentSharePreviewFragment;->I()Lcom/friday/document/viewmodel/ShareBaseViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final B()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/document/databinding/SharePreviewFragmentBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/friday/document/databinding/SharePreviewFragmentBinding;->d:Lcom/friday/document/databinding/IncludePreviewTitleBinding;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "getRoot(...)"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/16 v1, 0x8

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sget v1, Lcom/friday/document/R$id;->fragment_container:I

    .line 32
    .line 33
    iget-object v2, p0, Lcom/friday/document/view/share/StudentSharePreviewFragment;->j:Lcom/friday/document/view/preview/EmptyPreviewFragment;

    .line 34
    .line 35
    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/FragmentTransaction;->replace(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentTransaction;->commit()I

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final C(Lcom/friday/document/model/ShareFile;Lvc/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Lcom/friday/document/view/share/StudentSharePreviewFragment$displayMicroClass$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/friday/document/view/share/StudentSharePreviewFragment$displayMicroClass$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/friday/document/view/share/StudentSharePreviewFragment$displayMicroClass$1;->g:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/friday/document/view/share/StudentSharePreviewFragment$displayMicroClass$1;->g:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/friday/document/view/share/StudentSharePreviewFragment$displayMicroClass$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lcom/friday/document/view/share/StudentSharePreviewFragment$displayMicroClass$1;-><init>(Lcom/friday/document/view/share/StudentSharePreviewFragment;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lcom/friday/document/view/share/StudentSharePreviewFragment$displayMicroClass$1;->e:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/friday/document/view/share/StudentSharePreviewFragment$displayMicroClass$1;->g:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p1, v0, Lcom/friday/document/view/share/StudentSharePreviewFragment$displayMicroClass$1;->d:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Lcom/friday/document/view/preview/MicroClassPreviewFragment;

    .line 41
    .line 42
    iget-object v0, v0, Lcom/friday/document/view/share/StudentSharePreviewFragment$displayMicroClass$1;->c:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, Lcom/friday/document/model/ShareFile;

    .line 45
    .line 46
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p1

    .line 58
    :cond_2
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    sget-object p2, Lcom/friday/document/view/preview/MicroClassPreviewFragment;->e:Lcom/friday/document/view/preview/MicroClassPreviewFragment$a;

    .line 62
    .line 63
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getCoverFilePath()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getDirPath()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-virtual {p2, v2, v4}, Lcom/friday/document/view/preview/MicroClassPreviewFragment$a;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/friday/document/view/preview/MicroClassPreviewFragment;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    check-cast v2, Lcom/friday/document/databinding/SharePreviewFragmentBinding;

    .line 80
    .line 81
    iget-object v2, v2, Lcom/friday/document/databinding/SharePreviewFragmentBinding;->d:Lcom/friday/document/databinding/IncludePreviewTitleBinding;

    .line 82
    .line 83
    invoke-virtual {v2}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    const-string v4, "getRoot(...)"

    .line 88
    .line 89
    invoke-static {v2, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    const/4 v4, 0x0

    .line 93
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-virtual {v2}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    sget v4, Lcom/friday/document/R$id;->fragment_container:I

    .line 105
    .line 106
    invoke-virtual {v2, v4, p2}, Landroidx/fragment/app/FragmentTransaction;->replace(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    invoke-virtual {v2}, Landroidx/fragment/app/FragmentTransaction;->commit()I

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getCoverFilePath()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-static {v2}, Lcom/blankj/utilcode/util/FileUtils;->isFileExists(Ljava/lang/String;)Z

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    if-nez v2, :cond_5

    .line 122
    .line 123
    sget-object v2, Lf2/c;->a:Lf2/c;

    .line 124
    .line 125
    invoke-virtual {v2}, Lf2/c;->e()Z

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    if-nez v2, :cond_3

    .line 130
    .line 131
    sget p1, Lcom/friday/document/R$string;->connect_network_please:I

    .line 132
    .line 133
    invoke-static {p1}, Lz1/b;->h(I)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p2, v3}, Lcom/friday/document/view/preview/MicroClassPreviewFragment;->y(Z)V

    .line 137
    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_3
    invoke-direct {p0}, Lcom/friday/document/view/share/StudentSharePreviewFragment;->I()Lcom/friday/document/viewmodel/ShareBaseViewModel;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    iput-object v4, v0, Lcom/friday/document/view/share/StudentSharePreviewFragment$displayMicroClass$1;->c:Ljava/lang/Object;

    .line 149
    .line 150
    iput-object p2, v0, Lcom/friday/document/view/share/StudentSharePreviewFragment$displayMicroClass$1;->d:Ljava/lang/Object;

    .line 151
    .line 152
    iput v3, v0, Lcom/friday/document/view/share/StudentSharePreviewFragment$displayMicroClass$1;->g:I

    .line 153
    .line 154
    invoke-virtual {v2, p1, v0}, Lcom/friday/document/viewmodel/ShareBaseViewModel;->u(Lcom/friday/document/model/ShareFile;Lvc/c;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    if-ne p1, v1, :cond_4

    .line 159
    .line 160
    return-object v1

    .line 161
    :cond_4
    move-object p1, p2

    .line 162
    :goto_1
    invoke-virtual {p1, v3}, Lcom/friday/document/view/preview/MicroClassPreviewFragment;->y(Z)V

    .line 163
    .line 164
    .line 165
    goto :goto_2

    .line 166
    :cond_5
    invoke-virtual {p2, v3}, Lcom/friday/document/view/preview/MicroClassPreviewFragment;->y(Z)V

    .line 167
    .line 168
    .line 169
    :goto_2
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 170
    .line 171
    return-object p1
.end method

.method public final D(Lcom/friday/document/model/ShareFile;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/document/databinding/SharePreviewFragmentBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/friday/document/databinding/SharePreviewFragmentBinding;->d:Lcom/friday/document/databinding/IncludePreviewTitleBinding;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "getRoot(...)"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v1, "getViewLifecycleOwner(...)"

    .line 27
    .line 28
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    new-instance v5, Lcom/friday/document/view/share/StudentSharePreviewFragment$displayNote$1;

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    invoke-direct {v5, p0, p1, v0}, Lcom/friday/document/view/share/StudentSharePreviewFragment$displayNote$1;-><init>(Lcom/friday/document/view/share/StudentSharePreviewFragment;Lcom/friday/document/model/ShareFile;Lvc/c;)V

    .line 39
    .line 40
    .line 41
    const/4 v6, 0x3

    .line 42
    const/4 v7, 0x0

    .line 43
    const/4 v3, 0x0

    .line 44
    const/4 v4, 0x0

    .line 45
    invoke-static/range {v2 .. v7}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final E(Lcom/friday/document/model/ShareFile;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/document/databinding/SharePreviewFragmentBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/friday/document/databinding/SharePreviewFragmentBinding;->d:Lcom/friday/document/databinding/IncludePreviewTitleBinding;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "getRoot(...)"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sget v1, Lcom/friday/document/R$id;->fragment_container:I

    .line 31
    .line 32
    sget-object v2, Lcom/friday/document/view/preview/PdfPreviewFragment;->j:Lcom/friday/document/view/preview/PdfPreviewFragment$a;

    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getOthersPath()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {v2, p1}, Lcom/friday/document/view/preview/PdfPreviewFragment$a;->a(Ljava/lang/String;)Lcom/friday/document/view/preview/PdfPreviewFragment;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {v0, v1, p1}, Landroidx/fragment/app/FragmentTransaction;->replace(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentTransaction;->commit()I

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final F(Lcom/friday/document/model/ShareFile;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/friday/document/view/preview/PicturePreviewFragment;->d:Lcom/friday/document/view/preview/PicturePreviewFragment$a;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getOthersPath()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, Lcom/friday/document/view/preview/PicturePreviewFragment$a;->a(Ljava/lang/String;)Lcom/friday/document/view/preview/PicturePreviewFragment;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lcom/friday/document/databinding/SharePreviewFragmentBinding;

    .line 16
    .line 17
    iget-object v0, v0, Lcom/friday/document/databinding/SharePreviewFragmentBinding;->d:Lcom/friday/document/databinding/IncludePreviewTitleBinding;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "getRoot(...)"

    .line 24
    .line 25
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    sget v1, Lcom/friday/document/R$id;->fragment_container:I

    .line 41
    .line 42
    invoke-virtual {v0, v1, p1}, Landroidx/fragment/app/FragmentTransaction;->replace(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentTransaction;->commit()I

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public final G(Lcom/friday/document/model/ShareFile;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/document/databinding/SharePreviewFragmentBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/friday/document/databinding/SharePreviewFragmentBinding;->d:Lcom/friday/document/databinding/IncludePreviewTitleBinding;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "getRoot(...)"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 20
    .line 21
    .line 22
    sget-object v0, Lcom/friday/document/view/preview/TxtPreviewFragment;->i:Lcom/friday/document/view/preview/TxtPreviewFragment$a;

    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getFileName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getTxtFilePath()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getShareTime()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {v0, v1, v2, p1}, Lcom/friday/document/view/preview/TxtPreviewFragment$a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/friday/document/view/preview/TxtPreviewFragment;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    sget v1, Lcom/friday/document/R$id;->fragment_container:I

    .line 49
    .line 50
    invoke-virtual {v0, v1, p1}, Landroidx/fragment/app/FragmentTransaction;->replace(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentTransaction;->commit()I

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public final H(Lcom/friday/document/model/ShareFile;)V
    .locals 4

    .line 1
    sget-object v0, Lcom/friday/document/view/preview/VideoPreviewFragment;->j:Lcom/friday/document/view/preview/VideoPreviewFragment$a;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getFileName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getFileId()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getRealOssUrl()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getDirPath()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {v0, v1, v2, v3, p1}, Lcom/friday/document/view/preview/VideoPreviewFragment$a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/friday/document/view/preview/VideoPreviewFragment;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lcom/friday/document/databinding/SharePreviewFragmentBinding;

    .line 28
    .line 29
    iget-object v0, v0, Lcom/friday/document/databinding/SharePreviewFragmentBinding;->d:Lcom/friday/document/databinding/IncludePreviewTitleBinding;

    .line 30
    .line 31
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v1, "getRoot(...)"

    .line 36
    .line 37
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    sget v1, Lcom/friday/document/R$id;->fragment_container:I

    .line 53
    .line 54
    invoke-virtual {v0, v1, p1}, Landroidx/fragment/app/FragmentTransaction;->replace(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentTransaction;->commit()I

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public final K(Lcom/friday/document/model/ShareFile;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/document/databinding/SharePreviewFragmentBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/friday/document/databinding/SharePreviewFragmentBinding;->d:Lcom/friday/document/databinding/IncludePreviewTitleBinding;

    .line 8
    .line 9
    iget-object v0, v0, Lcom/friday/document/databinding/IncludePreviewTitleBinding;->f:Landroid/widget/TextView;

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getFileName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public getLayoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/friday/document/R$layout;->share_preview_fragment:I

    .line 2
    .line 3
    return v0
.end method

.method public initData()V
    .locals 10

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/share/StudentSharePreviewFragment;->initView()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const-string v0, "getViewLifecycleOwner(...)"

    .line 9
    .line 10
    invoke-static {v1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Lcom/friday/document/view/share/StudentSharePreviewFragment;->I()Lcom/friday/document/viewmodel/ShareBaseViewModel;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/ShareBaseViewModel;->z()Lvd/u;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    sget-object v2, Landroidx/lifecycle/Lifecycle$State;->STARTED:Landroidx/lifecycle/Lifecycle$State;

    .line 22
    .line 23
    invoke-static {v1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    new-instance v0, Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1;

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    move-object v5, p0

    .line 31
    invoke-direct/range {v0 .. v5}, Lcom/friday/document/view/share/StudentSharePreviewFragment$initData$$inlined$collectOnLifecycle$default$1;-><init>(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lvd/c;Lvc/c;Lcom/friday/document/view/share/StudentSharePreviewFragment;)V

    .line 32
    .line 33
    .line 34
    const/4 v8, 0x3

    .line 35
    const/4 v9, 0x0

    .line 36
    const/4 v5, 0x0

    .line 37
    move-object v4, v6

    .line 38
    const/4 v6, 0x0

    .line 39
    move-object v7, v0

    .line 40
    invoke-static/range {v4 .. v9}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public initView()V
    .locals 4

    .line 1
    invoke-super {p0}, Lcom/friday/common/base/BaseFragment;->initView()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/friday/document/view/share/StudentSharePreviewFragment;->B()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/friday/document/databinding/SharePreviewFragmentBinding;

    .line 12
    .line 13
    iget-object v0, v0, Lcom/friday/document/databinding/SharePreviewFragmentBinding;->d:Lcom/friday/document/databinding/IncludePreviewTitleBinding;

    .line 14
    .line 15
    iget-object v0, v0, Lcom/friday/document/databinding/IncludePreviewTitleBinding;->c:Landroid/widget/ImageView;

    .line 16
    .line 17
    const-string v1, "ivFullScreen"

    .line 18
    .line 19
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Lcom/friday/document/databinding/SharePreviewFragmentBinding;

    .line 27
    .line 28
    iget-object v1, v1, Lcom/friday/document/databinding/SharePreviewFragmentBinding;->d:Lcom/friday/document/databinding/IncludePreviewTitleBinding;

    .line 29
    .line 30
    iget-object v1, v1, Lcom/friday/document/databinding/IncludePreviewTitleBinding;->d:Landroid/widget/ImageView;

    .line 31
    .line 32
    const-string v2, "ivNoteInfo"

    .line 33
    .line 34
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const/4 v2, 0x2

    .line 38
    new-array v2, v2, [Landroid/view/View;

    .line 39
    .line 40
    const/4 v3, 0x0

    .line 41
    aput-object v0, v2, v3

    .line 42
    .line 43
    const/4 v0, 0x1

    .line 44
    aput-object v1, v2, v0

    .line 45
    .line 46
    invoke-virtual {p0, v2}, Lcom/friday/common/base/BaseFragment;->setClickListener([Landroid/view/View;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/friday/common/base/BaseFragment;->onClick(Landroid/view/View;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lcom/friday/document/databinding/SharePreviewFragmentBinding;

    .line 14
    .line 15
    iget-object v0, v0, Lcom/friday/document/databinding/SharePreviewFragmentBinding;->d:Lcom/friday/document/databinding/IncludePreviewTitleBinding;

    .line 16
    .line 17
    iget-object v0, v0, Lcom/friday/document/databinding/IncludePreviewTitleBinding;->c:Landroid/widget/ImageView;

    .line 18
    .line 19
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    sget v0, Lcom/friday/document/R$id;->fragment_container:I

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Landroidx/fragment/app/FragmentManager;->findFragmentById(I)Landroidx/fragment/app/Fragment;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    instance-of v0, p1, Lw2/b;

    .line 36
    .line 37
    if-eqz v0, :cond_1

    .line 38
    .line 39
    check-cast p1, Lw2/b;

    .line 40
    .line 41
    invoke-interface {p1}, Lw2/b;->i()V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Lcom/friday/document/databinding/SharePreviewFragmentBinding;

    .line 50
    .line 51
    iget-object v0, v0, Lcom/friday/document/databinding/SharePreviewFragmentBinding;->d:Lcom/friday/document/databinding/IncludePreviewTitleBinding;

    .line 52
    .line 53
    iget-object v0, v0, Lcom/friday/document/databinding/IncludePreviewTitleBinding;->d:Landroid/widget/ImageView;

    .line 54
    .line 55
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_1

    .line 60
    .line 61
    new-instance v0, Lm2/a$a;

    .line 62
    .line 63
    new-instance v1, Lm2/a;

    .line 64
    .line 65
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    const-string v3, "requireActivity(...)"

    .line 70
    .line 71
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-direct {v1, v2}, Lm2/a;-><init>(Landroid/content/Context;)V

    .line 75
    .line 76
    .line 77
    invoke-direct {v0, v1}, Lm2/a$a;-><init>(Lm2/a;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getLayoutInflater()Landroid/view/LayoutInflater;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-static {v1}, Lcom/friday/common/databinding/ViewNoteInfoShareToMeBinding;->a(Landroid/view/LayoutInflater;)Lcom/friday/common/databinding/ViewNoteInfoShareToMeBinding;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    const-string v2, "inflate(...)"

    .line 89
    .line 90
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v1}, Lm2/a$a;->b(Landroidx/databinding/ViewDataBinding;)Lm2/a$a;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    const/4 v1, 0x1

    .line 98
    invoke-virtual {v0, v1}, Lm2/a$a;->d(Z)Lm2/a$a;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    new-instance v1, Lx2/c0;

    .line 103
    .line 104
    invoke-direct {v1, p0}, Lx2/c0;-><init>(Lcom/friday/document/view/share/StudentSharePreviewFragment;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, v1}, Lm2/a$a;->c(Lhd/q;)Lm2/a$a;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-virtual {v0}, Lm2/a$a;->a()Lm2/a;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    const/16 v1, 0x50

    .line 116
    .line 117
    const/4 v2, 0x0

    .line 118
    invoke-virtual {v0, p1, v2, v2, v1}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;III)V

    .line 119
    .line 120
    .line 121
    :cond_1
    return-void
.end method
