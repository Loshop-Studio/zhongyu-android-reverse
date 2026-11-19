.class public abstract Lcom/friday/document/view/viewer/Hilt_MicroClassPlayActivity;
.super Lcom/friday/common/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Lfc/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Binding:",
        "Landroidx/databinding/ViewDataBinding;",
        ">",
        "Lcom/friday/common/base/BaseActivity<",
        "TBinding;>;",
        "Lfc/c;"
    }
.end annotation


# instance fields
.field public c:Ldc/h;

.field public volatile d:Ldc/a;

.field public final e:Ljava/lang/Object;

.field public f:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/friday/common/base/BaseActivity;-><init>()V

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
    iput-object v0, p0, Lcom/friday/document/view/viewer/Hilt_MicroClassPlayActivity;->e:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lcom/friday/document/view/viewer/Hilt_MicroClassPlayActivity;->f:Z

    .line 13
    .line 14
    invoke-direct {p0}, Lcom/friday/document/view/viewer/Hilt_MicroClassPlayActivity;->L()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method private L()V
    .locals 1

    .line 1
    new-instance v0, Lcom/friday/document/view/viewer/Hilt_MicroClassPlayActivity$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/friday/document/view/viewer/Hilt_MicroClassPlayActivity$a;-><init>(Lcom/friday/document/view/viewer/Hilt_MicroClassPlayActivity;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroidx/activity/ComponentActivity;->addOnContextAvailableListener(Landroidx/activity/contextaware/OnContextAvailableListener;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private M()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v0, v0, Lfc/b;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/friday/document/view/viewer/Hilt_MicroClassPlayActivity;->componentManager()Ldc/a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ldc/a;->b()Ldc/h;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lcom/friday/document/view/viewer/Hilt_MicroClassPlayActivity;->c:Ldc/h;

    .line 18
    .line 19
    invoke-virtual {v0}, Ldc/h;->b()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object v0, p0, Lcom/friday/document/view/viewer/Hilt_MicroClassPlayActivity;->c:Ldc/h;

    .line 26
    .line 27
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->getDefaultViewModelCreationExtras()Landroidx/lifecycle/viewmodel/CreationExtras;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Ldc/h;->c(Landroidx/lifecycle/viewmodel/CreationExtras;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void
.end method


# virtual methods
.method public final componentManager()Ldc/a;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/friday/document/view/viewer/Hilt_MicroClassPlayActivity;->d:Ldc/a;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/friday/document/view/viewer/Hilt_MicroClassPlayActivity;->e:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, Lcom/friday/document/view/viewer/Hilt_MicroClassPlayActivity;->d:Ldc/a;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/friday/document/view/viewer/Hilt_MicroClassPlayActivity;->createComponentManager()Ldc/a;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iput-object v1, p0, Lcom/friday/document/view/viewer/Hilt_MicroClassPlayActivity;->d:Ldc/a;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception v1

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    :goto_0
    monitor-exit v0

    .line 22
    goto :goto_2

    .line 23
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    throw v1

    .line 25
    :cond_1
    :goto_2
    iget-object v0, p0, Lcom/friday/document/view/viewer/Hilt_MicroClassPlayActivity;->d:Ldc/a;

    .line 26
    .line 27
    return-object v0
.end method

.method public createComponentManager()Ldc/a;
    .locals 1

    .line 1
    new-instance v0, Ldc/a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ldc/a;-><init>(Landroid/app/Activity;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final generatedComponent()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/friday/document/view/viewer/Hilt_MicroClassPlayActivity;->componentManager()Ldc/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ldc/a;->generatedComponent()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public getDefaultViewModelProviderFactory()Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/activity/ComponentActivity;->getDefaultViewModelProviderFactory()Landroidx/lifecycle/ViewModelProvider$Factory;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0, v0}, Lcc/a;->a(Landroidx/activity/ComponentActivity;Landroidx/lifecycle/ViewModelProvider$Factory;)Landroidx/lifecycle/ViewModelProvider$Factory;

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
    iget-boolean v0, p0, Lcom/friday/document/view/viewer/Hilt_MicroClassPlayActivity;->f:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/friday/document/view/viewer/Hilt_MicroClassPlayActivity;->f:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/friday/document/view/viewer/Hilt_MicroClassPlayActivity;->generatedComponent()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ly2/i;

    .line 13
    .line 14
    invoke-static {p0}, Lfc/e;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lcom/friday/document/view/viewer/MicroClassPlayActivity;

    .line 19
    .line 20
    invoke-interface {v0, v1}, Ly2/i;->j(Lcom/friday/document/view/viewer/MicroClassPlayActivity;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/friday/common/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/friday/document/view/viewer/Hilt_MicroClassPlayActivity;->M()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/friday/common/base/BaseActivity;->onDestroy()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/friday/document/view/viewer/Hilt_MicroClassPlayActivity;->c:Ldc/h;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Ldc/h;->a()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method
