.class public final Lcom/friday/document/view/share/ShareTeacherFileFragment;
.super Lcom/friday/document/view/share/Hilt_ShareTeacherFileFragment;
.source "SourceFile"

# interfaces
.implements Lj2/i;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/document/view/share/ShareTeacherFileFragment$a;
    }
.end annotation


# static fields
.field public static final q:Lcom/friday/document/view/share/ShareTeacherFileFragment$a;

.field public static final r:I


# instance fields
.field public final o:Lqc/d;

.field public final p:Lqc/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/friday/document/view/share/ShareTeacherFileFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/friday/document/view/share/ShareTeacherFileFragment$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/friday/document/view/share/ShareTeacherFileFragment;->q:Lcom/friday/document/view/share/ShareTeacherFileFragment$a;

    const/16 v0, 0x8

    sput v0, Lcom/friday/document/view/share/ShareTeacherFileFragment;->r:I

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/friday/document/view/share/Hilt_ShareTeacherFileFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/friday/document/view/share/ShareTeacherFileFragment$special$$inlined$viewModels$default$1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/friday/document/view/share/ShareTeacherFileFragment$special$$inlined$viewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 7
    .line 8
    .line 9
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->e:Lkotlin/LazyThreadSafetyMode;

    .line 10
    .line 11
    new-instance v2, Lcom/friday/document/view/share/ShareTeacherFileFragment$special$$inlined$viewModels$default$2;

    .line 12
    .line 13
    invoke-direct {v2, v0}, Lcom/friday/document/view/share/ShareTeacherFileFragment$special$$inlined$viewModels$default$2;-><init>(Lhd/a;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v2}, Lkotlin/a;->b(Lkotlin/LazyThreadSafetyMode;Lhd/a;)Lqc/d;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-class v1, Lcom/friday/document/viewmodel/ShareFileViewModel;

    .line 21
    .line 22
    invoke-static {v1}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v2, Lcom/friday/document/view/share/ShareTeacherFileFragment$special$$inlined$viewModels$default$3;

    .line 27
    .line 28
    invoke-direct {v2, v0}, Lcom/friday/document/view/share/ShareTeacherFileFragment$special$$inlined$viewModels$default$3;-><init>(Lqc/d;)V

    .line 29
    .line 30
    .line 31
    new-instance v3, Lcom/friday/document/view/share/ShareTeacherFileFragment$special$$inlined$viewModels$default$4;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    invoke-direct {v3, v4, v0}, Lcom/friday/document/view/share/ShareTeacherFileFragment$special$$inlined$viewModels$default$4;-><init>(Lhd/a;Lqc/d;)V

    .line 35
    .line 36
    .line 37
    new-instance v4, Lcom/friday/document/view/share/ShareTeacherFileFragment$special$$inlined$viewModels$default$5;

    .line 38
    .line 39
    invoke-direct {v4, p0, v0}, Lcom/friday/document/view/share/ShareTeacherFileFragment$special$$inlined$viewModels$default$5;-><init>(Landroidx/fragment/app/Fragment;Lqc/d;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p0, v1, v2, v3, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lod/c;Lhd/a;Lhd/a;Lhd/a;)Lqc/d;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, Lcom/friday/document/view/share/ShareTeacherFileFragment;->o:Lqc/d;

    .line 47
    .line 48
    new-instance v0, Lx2/v;

    .line 49
    .line 50
    invoke-direct {v0, p0}, Lx2/v;-><init>(Lcom/friday/document/view/share/ShareTeacherFileFragment;)V

    .line 51
    .line 52
    .line 53
    invoke-static {v0}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-object v0, p0, Lcom/friday/document/view/share/ShareTeacherFileFragment;->p:Lqc/d;

    .line 58
    .line 59
    return-void
.end method

.method public static synthetic X(Lcom/friday/document/view/share/ShareTeacherFileFragment;)J
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/friday/document/view/share/ShareTeacherFileFragment;->Z(Lcom/friday/document/view/share/ShareTeacherFileFragment;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final Z(Lcom/friday/document/view/share/ShareTeacherFileFragment;)J
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const-string v0, "teacher_id"

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    return-wide v0

    .line 14
    :cond_0
    const-wide/16 v0, -0x1

    .line 15
    .line 16
    return-wide v0
.end method


# virtual methods
.method public C()Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/friday/document/databinding/FragmentShareFileBinding;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget v1, Lcom/friday/document/R$string;->teacher_name:I

    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    const-string v3, "teacher_name"

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v2, 0x0

    .line 31
    :goto_0
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    return-object v0
.end method

.method public E()Lcom/friday/document/viewmodel/ShareFileViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/view/share/ShareTeacherFileFragment;->o:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/document/viewmodel/ShareFileViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public H()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/share/ShareTeacherFileFragment;->E()Lcom/friday/document/viewmodel/ShareFileViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/friday/document/view/share/ShareTeacherFileFragment;->Y()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-static/range {v0 .. v5}, Lcom/friday/document/viewmodel/ShareFileViewModel;->H(Lcom/friday/document/viewmodel/ShareFileViewModel;JZILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public I()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/share/ShareTeacherFileFragment;->E()Lcom/friday/document/viewmodel/ShareFileViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/friday/document/view/share/ShareTeacherFileFragment;->Y()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    const/4 v3, 0x1

    .line 10
    invoke-virtual {v0, v1, v2, v3}, Lcom/friday/document/viewmodel/ShareFileViewModel;->G(JZ)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public P()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    return v0
.end method

.method public final Y()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/friday/document/view/share/ShareTeacherFileFragment;->p:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    return-wide v0
.end method

.method public getLayoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/friday/document/R$layout;->fragment_share_file:I

    .line 2
    .line 3
    return v0
.end method

.method public initView()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/friday/document/view/share/ShareBaseFileFragment;->initView()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/friday/common/base/BaseFragment;->getMBinding()Landroidx/databinding/ViewDataBinding;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Lcom/friday/document/databinding/FragmentShareFileBinding;

    .line 9
    .line 10
    iget-object v0, v0, Lcom/friday/document/databinding/FragmentShareFileBinding;->i:Landroid/widget/TextView;

    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    const-string v2, "teacher_name"

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const-string v1, ""

    .line 28
    .line 29
    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public l()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/share/ShareTeacherFileFragment;->E()Lcom/friday/document/viewmodel/ShareFileViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/ShareFileViewModel;->O()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isAdded()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->popBackStack()V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method
