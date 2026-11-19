.class public abstract Lcom/zykj/image/Hilt_ImageCropFragment;
.super Lcom/zykj/base/BaseFragment;
.source "SourceFile"

# interfaces
.implements Lk6/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Landroidx/databinding/ViewDataBinding;",
        ">",
        "Lcom/zykj/base/BaseFragment<",
        "TT;>;",
        "Lk6/b;"
    }
.end annotation


# instance fields
.field private componentContext:Landroid/content/ContextWrapper;

.field private volatile componentManager:Li6/f;

.field private final componentManagerLock:Ljava/lang/Object;

.field private injected:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/zykj/base/BaseFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/zykj/image/Hilt_ImageCropFragment;->componentManagerLock:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lcom/zykj/image/Hilt_ImageCropFragment;->injected:Z

    .line 13
    .line 14
    return-void
.end method

.method private f()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/image/Hilt_ImageCropFragment;->componentContext:Landroid/content/ContextWrapper;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0, p0}, Li6/f;->b(Landroid/content/Context;Landroidx/fragment/app/Fragment;)Landroid/content/ContextWrapper;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/zykj/image/Hilt_ImageCropFragment;->componentContext:Landroid/content/ContextWrapper;

    .line 14
    .line 15
    :cond_0
    return-void
.end method


# virtual methods
.method public final componentManager()Li6/f;
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/zykj/image/Hilt_ImageCropFragment;->componentManager:Li6/f;

    if-nez v0, :cond_1

    .line 3
    iget-object v0, p0, Lcom/zykj/image/Hilt_ImageCropFragment;->componentManagerLock:Ljava/lang/Object;

    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lcom/zykj/image/Hilt_ImageCropFragment;->componentManager:Li6/f;

    if-nez v1, :cond_0

    .line 5
    invoke-virtual {p0}, Lcom/zykj/image/Hilt_ImageCropFragment;->createComponentManager()Li6/f;

    move-result-object v1

    iput-object v1, p0, Lcom/zykj/image/Hilt_ImageCropFragment;->componentManager:Li6/f;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    .line 6
    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 7
    :cond_1
    :goto_2
    iget-object v0, p0, Lcom/zykj/image/Hilt_ImageCropFragment;->componentManager:Li6/f;

    return-object v0
.end method

.method public bridge synthetic componentManager()Lk6/b;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/image/Hilt_ImageCropFragment;->componentManager()Li6/f;

    move-result-object v0

    return-object v0
.end method

.method public createComponentManager()Li6/f;
    .locals 1

    .line 1
    new-instance v0, Li6/f;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Li6/f;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final generatedComponent()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/image/Hilt_ImageCropFragment;->componentManager()Li6/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Li6/f;->generatedComponent()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getContext()Landroid/content/Context;
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/zykj/image/Hilt_ImageCropFragment;->componentContext:Landroid/content/ContextWrapper;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0

    .line 13
    :cond_0
    invoke-direct {p0}, Lcom/zykj/image/Hilt_ImageCropFragment;->f()V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/zykj/image/Hilt_ImageCropFragment;->componentContext:Landroid/content/ContextWrapper;

    .line 17
    .line 18
    return-object v0
.end method

.method public getDefaultViewModelProviderFactory()Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->getDefaultViewModelProviderFactory()Landroidx/lifecycle/ViewModelProvider$Factory;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0, v0}, Lh6/a;->b(Landroidx/fragment/app/Fragment;Landroidx/lifecycle/ViewModelProvider$Factory;)Landroidx/lifecycle/ViewModelProvider$Factory;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public inject()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/zykj/image/Hilt_ImageCropFragment;->injected:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/zykj/image/Hilt_ImageCropFragment;->injected:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/zykj/image/Hilt_ImageCropFragment;->generatedComponent()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lj3/f;

    .line 13
    .line 14
    invoke-static {p0}, Lk6/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lcom/zykj/image/ImageCropFragment;

    .line 19
    .line 20
    invoke-interface {v0, v1}, Lj3/f;->p0(Lcom/zykj/image/ImageCropFragment;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public onAttach(Landroid/app/Activity;)V
    .locals 2
    .annotation build Landroidx/annotation/CallSuper;
    .end annotation

    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 4
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onAttach(Landroid/app/Activity;)V

    .line 5
    iget-object v0, p0, Lcom/zykj/image/Hilt_ImageCropFragment;->componentContext:Landroid/content/ContextWrapper;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-static {v0}, Li6/f;->d(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v0

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    move p1, v1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    const-string v0, "onAttach called multiple times with different Context! Hilt Fragments should not be retained."

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Lk6/c;->c(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 6
    invoke-direct {p0}, Lcom/zykj/image/Hilt_ImageCropFragment;->f()V

    .line 7
    invoke-virtual {p0}, Lcom/zykj/image/Hilt_ImageCropFragment;->inject()V

    return-void
.end method

.method public onAttach(Landroid/content/Context;)V
    .locals 0
    .annotation build Landroidx/annotation/CallSuper;
    .end annotation

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onAttach(Landroid/content/Context;)V

    .line 2
    invoke-direct {p0}, Lcom/zykj/image/Hilt_ImageCropFragment;->f()V

    .line 3
    invoke-virtual {p0}, Lcom/zykj/image/Hilt_ImageCropFragment;->inject()V

    return-void
.end method

.method public onGetLayoutInflater(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onGetLayoutInflater(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1, p0}, Li6/f;->c(Landroid/view/LayoutInflater;Landroidx/fragment/app/Fragment;)Landroid/content/ContextWrapper;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method
