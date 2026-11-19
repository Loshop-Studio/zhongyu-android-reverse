.class public final Landroidx/hilt/navigation/fragment/HiltNavGraphViewModelLazyKt$hiltNavGraphViewModels$3;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/hilt/navigation/fragment/HiltNavGraphViewModelLazyKt;->hiltNavGraphViewModels(Landroidx/fragment/app/Fragment;ILhd/l;)Lqc/d;
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
.field final synthetic $backStackEntry$delegate:Lqc/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lqc/d;"
        }
    .end annotation
.end field

.field final synthetic $creationCallback:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhd/l;Lqc/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            "Lqc/d;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/hilt/navigation/fragment/HiltNavGraphViewModelLazyKt$hiltNavGraphViewModels$3;->$creationCallback:Lhd/l;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/hilt/navigation/fragment/HiltNavGraphViewModelLazyKt$hiltNavGraphViewModels$3;->$backStackEntry$delegate:Lqc/d;

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
    .locals 2

    .line 2
    iget-object v0, p0, Landroidx/hilt/navigation/fragment/HiltNavGraphViewModelLazyKt$hiltNavGraphViewModels$3;->$backStackEntry$delegate:Lqc/d;

    invoke-static {v0}, Landroidx/hilt/navigation/fragment/HiltNavGraphViewModelLazyKt;->access$hiltNavGraphViewModels$lambda-1(Lqc/d;)Landroidx/navigation/NavBackStackEntry;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/navigation/NavBackStackEntry;->getDefaultViewModelCreationExtras()Landroidx/lifecycle/viewmodel/CreationExtras;

    move-result-object v0

    iget-object v1, p0, Landroidx/hilt/navigation/fragment/HiltNavGraphViewModelLazyKt$hiltNavGraphViewModels$3;->$creationCallback:Lhd/l;

    invoke-static {v0, v1}, Ldagger/hilt/android/lifecycle/HiltViewModelExtensions;->b(Landroidx/lifecycle/viewmodel/CreationExtras;Lhd/l;)Landroidx/lifecycle/viewmodel/CreationExtras;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/hilt/navigation/fragment/HiltNavGraphViewModelLazyKt$hiltNavGraphViewModels$3;->invoke()Landroidx/lifecycle/viewmodel/CreationExtras;

    move-result-object v0

    return-object v0
.end method
