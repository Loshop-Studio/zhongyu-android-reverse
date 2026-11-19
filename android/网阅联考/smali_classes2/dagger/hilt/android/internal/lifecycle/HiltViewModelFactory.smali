.class public final Ldagger/hilt/android/internal/lifecycle/HiltViewModelFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/ViewModelProvider$Factory;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldagger/hilt/android/internal/lifecycle/HiltViewModelFactory$b;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/Set;

.field public final b:Landroidx/lifecycle/ViewModelProvider$Factory;

.field public final c:Landroidx/lifecycle/AbstractSavedStateViewModelFactory;


# direct methods
.method public constructor <init>(Landroidx/savedstate/SavedStateRegistryOwner;Landroid/os/Bundle;Ljava/util/Set;Landroidx/lifecycle/ViewModelProvider$Factory;Lg2/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Ldagger/hilt/android/internal/lifecycle/HiltViewModelFactory;->a:Ljava/util/Set;

    .line 5
    .line 6
    iput-object p4, p0, Ldagger/hilt/android/internal/lifecycle/HiltViewModelFactory;->b:Landroidx/lifecycle/ViewModelProvider$Factory;

    .line 7
    .line 8
    new-instance p1, Ldagger/hilt/android/internal/lifecycle/HiltViewModelFactory$a;

    .line 9
    .line 10
    invoke-direct {p1, p0, p5}, Ldagger/hilt/android/internal/lifecycle/HiltViewModelFactory$a;-><init>(Ldagger/hilt/android/internal/lifecycle/HiltViewModelFactory;Lg2/c;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Ldagger/hilt/android/internal/lifecycle/HiltViewModelFactory;->c:Landroidx/lifecycle/AbstractSavedStateViewModelFactory;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public create(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;
    .locals 2

    .line 4
    iget-object v0, p0, Ldagger/hilt/android/internal/lifecycle/HiltViewModelFactory;->a:Ljava/util/Set;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 5
    iget-object v0, p0, Ldagger/hilt/android/internal/lifecycle/HiltViewModelFactory;->c:Landroidx/lifecycle/AbstractSavedStateViewModelFactory;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/AbstractSavedStateViewModelFactory;->create(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    move-result-object p1

    return-object p1

    .line 6
    :cond_0
    iget-object v0, p0, Ldagger/hilt/android/internal/lifecycle/HiltViewModelFactory;->b:Landroidx/lifecycle/ViewModelProvider$Factory;

    invoke-interface {v0, p1}, Landroidx/lifecycle/ViewModelProvider$Factory;->create(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    move-result-object p1

    return-object p1
.end method

.method public create(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;
    .locals 2

    .line 1
    iget-object v0, p0, Ldagger/hilt/android/internal/lifecycle/HiltViewModelFactory;->a:Ljava/util/Set;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Ldagger/hilt/android/internal/lifecycle/HiltViewModelFactory;->c:Landroidx/lifecycle/AbstractSavedStateViewModelFactory;

    invoke-virtual {v0, p1, p2}, Landroidx/lifecycle/AbstractSavedStateViewModelFactory;->create(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    iget-object v0, p0, Ldagger/hilt/android/internal/lifecycle/HiltViewModelFactory;->b:Landroidx/lifecycle/ViewModelProvider$Factory;

    invoke-interface {v0, p1, p2}, Landroidx/lifecycle/ViewModelProvider$Factory;->create(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;

    move-result-object p1

    return-object p1
.end method
