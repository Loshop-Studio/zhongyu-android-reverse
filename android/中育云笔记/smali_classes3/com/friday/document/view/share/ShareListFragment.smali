.class public final Lcom/friday/document/view/share/ShareListFragment;
.super Lcom/friday/document/view/share/Hilt_ShareListFragment;
.source "SourceFile"

# interfaces
.implements Lj2/i;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public final o:Lqc/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/friday/document/view/share/Hilt_ShareListFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/friday/document/view/share/ShareListFragment$special$$inlined$viewModels$default$1;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/friday/document/view/share/ShareListFragment$special$$inlined$viewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 7
    .line 8
    .line 9
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->e:Lkotlin/LazyThreadSafetyMode;

    .line 10
    .line 11
    new-instance v2, Lcom/friday/document/view/share/ShareListFragment$special$$inlined$viewModels$default$2;

    .line 12
    .line 13
    invoke-direct {v2, v0}, Lcom/friday/document/view/share/ShareListFragment$special$$inlined$viewModels$default$2;-><init>(Lhd/a;)V

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
    new-instance v2, Lcom/friday/document/view/share/ShareListFragment$special$$inlined$viewModels$default$3;

    .line 27
    .line 28
    invoke-direct {v2, v0}, Lcom/friday/document/view/share/ShareListFragment$special$$inlined$viewModels$default$3;-><init>(Lqc/d;)V

    .line 29
    .line 30
    .line 31
    new-instance v3, Lcom/friday/document/view/share/ShareListFragment$special$$inlined$viewModels$default$4;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    invoke-direct {v3, v4, v0}, Lcom/friday/document/view/share/ShareListFragment$special$$inlined$viewModels$default$4;-><init>(Lhd/a;Lqc/d;)V

    .line 35
    .line 36
    .line 37
    new-instance v4, Lcom/friday/document/view/share/ShareListFragment$special$$inlined$viewModels$default$5;

    .line 38
    .line 39
    invoke-direct {v4, p0, v0}, Lcom/friday/document/view/share/ShareListFragment$special$$inlined$viewModels$default$5;-><init>(Landroidx/fragment/app/Fragment;Lqc/d;)V

    .line 40
    .line 41
    .line 42
    invoke-static {p0, v1, v2, v3, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lod/c;Lhd/a;Lhd/a;Lhd/a;)Lqc/d;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, Lcom/friday/document/view/share/ShareListFragment;->o:Lqc/d;

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public E()Lcom/friday/document/viewmodel/ShareFileViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/view/share/ShareListFragment;->o:Lqc/d;

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
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/share/ShareListFragment;->E()Lcom/friday/document/viewmodel/ShareFileViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-static {v0, v3, v1, v2}, Lcom/friday/document/viewmodel/ShareFileViewModel;->D(Lcom/friday/document/viewmodel/ShareFileViewModel;ZILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public I()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/share/ShareListFragment;->E()Lcom/friday/document/viewmodel/ShareFileViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, v1}, Lcom/friday/document/viewmodel/ShareFileViewModel;->C(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public P()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    return v0
.end method

.method public X(Lcom/friday/document/model/ShareFile;)V
    .locals 4

    .line 1
    const-string v0, "file"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/friday/document/view/share/ShareBaseFileFragment;->M(Lcom/friday/document/model/ShareFile;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/friday/document/view/share/ShareListFragment;->E()Lcom/friday/document/viewmodel/ShareFileViewModel;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getParentId()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getOwnerId()J

    .line 18
    .line 19
    .line 20
    move-result-wide v2

    .line 21
    invoke-virtual {v0, v1, v2, v3}, Lcom/friday/document/viewmodel/ShareFileViewModel;->L(Ljava/lang/String;J)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public getLayoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/friday/document/R$layout;->fragment_share_file:I

    .line 2
    .line 3
    return v0
.end method

.method public l()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/share/ShareListFragment;->E()Lcom/friday/document/viewmodel/ShareFileViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/friday/document/viewmodel/ShareFileViewModel;->O()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/friday/document/view/share/ShareListFragment;->H()V

    .line 9
    .line 10
    .line 11
    return-void
.end method
