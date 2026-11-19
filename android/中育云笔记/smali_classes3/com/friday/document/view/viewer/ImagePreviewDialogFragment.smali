.class public final Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;
.super Lcom/friday/common/base/BaseDialogFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/friday/common/base/BaseDialogFragment<",
        "Lcom/friday/document/databinding/DialogImageViewPagerBinding;",
        ">;"
    }
.end annotation


# instance fields
.field public final f:Lqc/d;

.field public g:Z

.field public h:Lcom/friday/document/model/ShareFile;

.field public i:Lcom/friday/document/adapter/ImagePagerAdapter;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/friday/common/base/BaseDialogFragment;-><init>()V

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
    new-instance v1, Lcom/friday/document/view/viewer/ImagePreviewDialogFragment$special$$inlined$activityViewModels$default$1;

    .line 11
    .line 12
    invoke-direct {v1, p0}, Lcom/friday/document/view/viewer/ImagePreviewDialogFragment$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/friday/document/view/viewer/ImagePreviewDialogFragment$special$$inlined$activityViewModels$default$2;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v2, v3, p0}, Lcom/friday/document/view/viewer/ImagePreviewDialogFragment$special$$inlined$activityViewModels$default$2;-><init>(Lhd/a;Landroidx/fragment/app/Fragment;)V

    .line 19
    .line 20
    .line 21
    new-instance v3, Lcom/friday/document/view/viewer/ImagePreviewDialogFragment$special$$inlined$activityViewModels$default$3;

    .line 22
    .line 23
    invoke-direct {v3, p0}, Lcom/friday/document/view/viewer/ImagePreviewDialogFragment$special$$inlined$activityViewModels$default$3;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, v0, v1, v2, v3}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lod/c;Lhd/a;Lhd/a;Lhd/a;)Lqc/d;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;->f:Lqc/d;

    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    iput-boolean v0, p0, Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;->g:Z

    .line 34
    .line 35
    return-void
.end method

.method public static final A(Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;Landroid/view/View;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;->x()V

    .line 7
    .line 8
    .line 9
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 10
    .line 11
    return-object p0
.end method

.method public static final B(Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    const/4 p1, 0x4

    .line 2
    if-ne p2, p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    const/4 p2, 0x1

    .line 9
    if-ne p1, p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;->x()V

    .line 12
    .line 13
    .line 14
    return p2

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method private final initClick()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/document/databinding/DialogImageViewPagerBinding;

    .line 6
    .line 7
    iget-object v0, v0, Lcom/friday/document/databinding/DialogImageViewPagerBinding;->c:Landroid/widget/TextView;

    .line 8
    .line 9
    const-string v1, "tvFinish"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Ly2/d;

    .line 15
    .line 16
    invoke-direct {v1, p0}, Ly2/d;-><init>(Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1}, Lgb/b;->e(Landroid/view/View;Lhd/l;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    new-instance v1, Ly2/e;

    .line 29
    .line 30
    invoke-direct {v1, p0}, Ly2/e;-><init>(Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method

.method public static synthetic q(Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;->z(Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;->B(Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic s(Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;Landroid/view/View;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;->A(Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;Landroid/view/View;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic t(Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;)Lcom/friday/document/viewmodel/ShareBaseViewModel;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;->w()Lcom/friday/document/viewmodel/ShareBaseViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic u(Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;)Lcom/friday/document/databinding/DialogImageViewPagerBinding;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/friday/document/databinding/DialogImageViewPagerBinding;

    .line 6
    .line 7
    return-object p0
.end method

.method public static final synthetic v(Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;Lcom/friday/document/model/ShareFile;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;->h:Lcom/friday/document/model/ShareFile;

    .line 2
    .line 3
    return-void
.end method

.method private final w()Lcom/friday/document/viewmodel/ShareBaseViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;->f:Lqc/d;

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

.method private final y()V
    .locals 6

    .line 1
    invoke-direct {p0}, Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;->w()Lcom/friday/document/viewmodel/ShareBaseViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/ShareBaseViewModel;->z()Lvd/u;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Lvd/u;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lcom/friday/document/model/ShareFile;

    .line 14
    .line 15
    iput-object v0, p0, Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;->h:Lcom/friday/document/model/ShareFile;

    .line 16
    .line 17
    invoke-direct {p0}, Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;->w()Lcom/friday/document/viewmodel/ShareBaseViewModel;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/ShareBaseViewModel;->C()Lvd/u;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0}, Lvd/u;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Ljava/util/List;

    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Lcom/friday/document/databinding/DialogImageViewPagerBinding;

    .line 36
    .line 37
    iget-object v1, v1, Lcom/friday/document/databinding/DialogImageViewPagerBinding;->c:Landroid/widget/TextView;

    .line 38
    .line 39
    iget-object v2, p0, Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;->h:Lcom/friday/document/model/ShareFile;

    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    if-eqz v2, :cond_0

    .line 43
    .line 44
    invoke-virtual {v2}, Lcom/friday/document/model/ShareFile;->getFileName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    move-object v2, v3

    .line 50
    :goto_0
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 51
    .line 52
    .line 53
    iget-object v1, p0, Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;->h:Lcom/friday/document/model/ShareFile;

    .line 54
    .line 55
    if-nez v1, :cond_1

    .line 56
    .line 57
    invoke-static {v0}, Lrc/g0;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    check-cast v1, Lcom/friday/document/model/ShareFile;

    .line 62
    .line 63
    :cond_1
    invoke-static {v0, v1}, Lrc/g0;->r0(Ljava/util/List;Ljava/lang/Object;)I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    const/4 v2, 0x0

    .line 68
    invoke-static {v1, v2}, Lnd/o;->e(II)I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    new-instance v4, Lcom/friday/document/adapter/ImagePagerAdapter;

    .line 73
    .line 74
    new-instance v5, Ly2/c;

    .line 75
    .line 76
    invoke-direct {v5, p0}, Ly2/c;-><init>(Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;)V

    .line 77
    .line 78
    .line 79
    invoke-direct {v4, v0, v5}, Lcom/friday/document/adapter/ImagePagerAdapter;-><init>(Ljava/util/List;Lhd/a;)V

    .line 80
    .line 81
    .line 82
    iput-object v4, p0, Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;->i:Lcom/friday/document/adapter/ImagePagerAdapter;

    .line 83
    .line 84
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    check-cast v0, Lcom/friday/document/databinding/DialogImageViewPagerBinding;

    .line 89
    .line 90
    iget-object v0, v0, Lcom/friday/document/databinding/DialogImageViewPagerBinding;->d:Landroidx/viewpager2/widget/ViewPager2;

    .line 91
    .line 92
    iget-object v4, p0, Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;->i:Lcom/friday/document/adapter/ImagePagerAdapter;

    .line 93
    .line 94
    if-nez v4, :cond_2

    .line 95
    .line 96
    const-string v4, "adapter"

    .line 97
    .line 98
    invoke-static {v4}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_2
    move-object v3, v4

    .line 103
    :goto_1
    invoke-virtual {v0, v3}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    check-cast v0, Lcom/friday/document/databinding/DialogImageViewPagerBinding;

    .line 111
    .line 112
    iget-object v0, v0, Lcom/friday/document/databinding/DialogImageViewPagerBinding;->d:Landroidx/viewpager2/widget/ViewPager2;

    .line 113
    .line 114
    invoke-virtual {v0, v1, v2}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(IZ)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    check-cast v0, Lcom/friday/document/databinding/DialogImageViewPagerBinding;

    .line 122
    .line 123
    iget-object v0, v0, Lcom/friday/document/databinding/DialogImageViewPagerBinding;->d:Landroidx/viewpager2/widget/ViewPager2;

    .line 124
    .line 125
    new-instance v1, Lcom/friday/document/view/viewer/ImagePreviewDialogFragment$init$2;

    .line 126
    .line 127
    invoke-direct {v1, p0}, Lcom/friday/document/view/viewer/ImagePreviewDialogFragment$init$2;-><init>(Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, v1}, Landroidx/viewpager2/widget/ViewPager2;->registerOnPageChangeCallback(Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;)V

    .line 131
    .line 132
    .line 133
    invoke-direct {p0}, Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;->initClick()V

    .line 134
    .line 135
    .line 136
    return-void
.end method

.method public static final z(Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;)Lqc/q;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;->C()V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 5
    .line 6
    return-object p0
.end method


# virtual methods
.method public final C()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;->g:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput-boolean v0, p0, Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;->g:Z

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/friday/common/base/BaseDialogFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/friday/document/databinding/DialogImageViewPagerBinding;

    .line 12
    .line 13
    iget-object v0, v0, Lcom/friday/document/databinding/DialogImageViewPagerBinding;->c:Landroid/widget/TextView;

    .line 14
    .line 15
    const-string v1, "tvFinish"

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-boolean v1, p0, Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;->g:Z

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/16 v1, 0x8

    .line 27
    .line 28
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public getLayoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/friday/document/R$layout;->dialog_image_view_pager:I

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
    invoke-super {p0, p1}, Landroidx/fragment/app/DialogFragment;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    const v0, 0x103000a

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/DialogFragment;->setStyle(II)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;->y()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final x()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;->h:Lcom/friday/document/model/ShareFile;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;->w()Lcom/friday/document/viewmodel/ShareBaseViewModel;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1, v0}, Lcom/friday/document/viewmodel/ShareBaseViewModel;->F(Lcom/friday/document/model/ShareFile;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->dismiss()V

    .line 13
    .line 14
    .line 15
    return-void
.end method
