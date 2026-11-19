.class final Ldagger/hilt/android/lifecycle/HiltViewModelExtensions$addCreationCallback$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldagger/hilt/android/lifecycle/HiltViewModelExtensions;->a(Landroidx/lifecycle/viewmodel/MutableCreationExtras;Lhd/l;)Landroidx/lifecycle/viewmodel/CreationExtras;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lhd/l;"
    }
.end annotation


# instance fields
.field public final synthetic c:Lhd/l;


# direct methods
.method public constructor <init>(Lhd/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldagger/hilt/android/lifecycle/HiltViewModelExtensions$addCreationCallback$1$1;->c:Lhd/l;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Landroidx/lifecycle/ViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Ldagger/hilt/android/lifecycle/HiltViewModelExtensions$addCreationCallback$1$1;->c:Lhd/l;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Landroidx/lifecycle/ViewModel;

    .line 8
    .line 9
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ldagger/hilt/android/lifecycle/HiltViewModelExtensions$addCreationCallback$1$1;->a(Ljava/lang/Object;)Landroidx/lifecycle/ViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
