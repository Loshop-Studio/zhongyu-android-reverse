.class public final Lcom/friday/cloudsnote/view/MainActivity$special$$inlined$viewModels$default$3;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/cloudsnote/view/MainActivity;-><init>()V
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

.field public final synthetic d:Landroidx/activity/ComponentActivity;


# direct methods
.method public constructor <init>(Lhd/a;Landroidx/activity/ComponentActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/cloudsnote/view/MainActivity$special$$inlined$viewModels$default$3;->c:Lhd/a;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/cloudsnote/view/MainActivity$special$$inlined$viewModels$default$3;->d:Landroidx/activity/ComponentActivity;

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

    .line 1
    iget-object v0, p0, Lcom/friday/cloudsnote/view/MainActivity$special$$inlined$viewModels$default$3;->c:Lhd/a;

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
    iget-object v0, p0, Lcom/friday/cloudsnote/view/MainActivity$special$$inlined$viewModels$default$3;->d:Landroidx/activity/ComponentActivity;

    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->getDefaultViewModelCreationExtras()Landroidx/lifecycle/viewmodel/CreationExtras;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/friday/cloudsnote/view/MainActivity$special$$inlined$viewModels$default$3;->invoke()Landroidx/lifecycle/viewmodel/CreationExtras;

    move-result-object v0

    return-object v0
.end method
