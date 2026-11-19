.class public final Lcom/zykj/cloudhelper/fragment/StoreNoteFragment$special$$inlined$activityViewModels$default$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lhd/a;"
    }
.end annotation


# instance fields
.field public final synthetic c:Lhd/a;

.field public final synthetic d:Landroidx/fragment/app/Fragment;


# direct methods
.method public constructor <init>(Lhd/a;Landroidx/fragment/app/Fragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment$special$$inlined$activityViewModels$default$2;->c:Lhd/a;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment$special$$inlined$activityViewModels$default$2;->d:Landroidx/fragment/app/Fragment;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke()Landroidx/lifecycle/viewmodel/CreationExtras;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment$special$$inlined$activityViewModels$default$2;->c:Lhd/a;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lhd/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/lifecycle/viewmodel/CreationExtras;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment$special$$inlined$activityViewModels$default$2;->d:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->getDefaultViewModelCreationExtras()Landroidx/lifecycle/viewmodel/CreationExtras;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment$special$$inlined$activityViewModels$default$2;->invoke()Landroidx/lifecycle/viewmodel/CreationExtras;

    move-result-object v0

    return-object v0
.end method
