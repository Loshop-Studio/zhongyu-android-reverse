.class public final Landroidx/navigation/NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/navigation/NavGraphViewModelLazyKt;->navGraphViewModels(Landroidx/fragment/app/Fragment;ILhd/a;)Lqc/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lhd/a;"
    }
.end annotation


# instance fields
.field final synthetic $backStackEntry$delegate:Lqc/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lqc/d;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lqc/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqc/d;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/navigation/NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1;->$backStackEntry$delegate:Lqc/d;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke()Landroidx/lifecycle/ViewModelStore;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/navigation/NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1;->$backStackEntry$delegate:Lqc/d;

    invoke-static {v0}, Landroidx/navigation/NavGraphViewModelLazyKt;->access$navGraphViewModels$lambda-0(Lqc/d;)Landroidx/navigation/NavBackStackEntry;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/navigation/NavBackStackEntry;->getViewModelStore()Landroidx/lifecycle/ViewModelStore;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0}, Landroidx/navigation/NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1;->invoke()Landroidx/lifecycle/ViewModelStore;

    move-result-object v0

    return-object v0
.end method
