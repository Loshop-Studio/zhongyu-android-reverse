.class public final Landroidx/navigation/compose/BackStackEntryIdViewModel;
.super Landroidx/lifecycle/ViewModel;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final IdKey:Ljava/lang/String;

.field private final id:Ljava/lang/String;

.field public saveableStateHolderRef:Landroidx/navigation/compose/internal/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/navigation/compose/internal/WeakReference<",
            "Landroidx/compose/runtime/saveable/SaveableStateHolder;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/SavedStateHandle;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/lifecycle/ViewModel;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "SaveableStateHolder_BackStackEntryKey"

    .line 5
    .line 6
    iput-object v0, p0, Landroidx/navigation/compose/BackStackEntryIdViewModel;->IdKey:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Ljava/lang/String;

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    invoke-static {}, Landroidx/navigation/compose/internal/NavComposeUtils_androidKt;->randomUUID()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {p1, v0, v1}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    iput-object v1, p0, Landroidx/navigation/compose/BackStackEntryIdViewModel;->id:Ljava/lang/String;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final getId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/navigation/compose/BackStackEntryIdViewModel;->id:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSaveableStateHolderRef()Landroidx/navigation/compose/internal/WeakReference;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/navigation/compose/internal/WeakReference<",
            "Landroidx/compose/runtime/saveable/SaveableStateHolder;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/navigation/compose/BackStackEntryIdViewModel;->saveableStateHolderRef:Landroidx/navigation/compose/internal/WeakReference;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "saveableStateHolderRef"

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

.method public onCleared()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/lifecycle/ViewModel;->onCleared()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/navigation/compose/BackStackEntryIdViewModel;->getSaveableStateHolderRef()Landroidx/navigation/compose/internal/WeakReference;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroidx/navigation/compose/internal/WeakReference;->get()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Landroidx/compose/runtime/saveable/SaveableStateHolder;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v1, p0, Landroidx/navigation/compose/BackStackEntryIdViewModel;->id:Ljava/lang/String;

    .line 17
    .line 18
    invoke-interface {v0, v1}, Landroidx/compose/runtime/saveable/SaveableStateHolder;->removeState(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {p0}, Landroidx/navigation/compose/BackStackEntryIdViewModel;->getSaveableStateHolderRef()Landroidx/navigation/compose/internal/WeakReference;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Landroidx/navigation/compose/internal/WeakReference;->clear()V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final setSaveableStateHolderRef(Landroidx/navigation/compose/internal/WeakReference;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/navigation/compose/internal/WeakReference<",
            "Landroidx/compose/runtime/saveable/SaveableStateHolder;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/navigation/compose/BackStackEntryIdViewModel;->saveableStateHolderRef:Landroidx/navigation/compose/internal/WeakReference;

    .line 2
    .line 3
    return-void
.end method
