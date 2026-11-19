.class public abstract Lcom/zykj/evaluation/ui/Hilt_MainActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "SourceFile"

# interfaces
.implements Ln8/b;


# instance fields
.field public a:Ll8/g;

.field public volatile b:Ll8/a;

.field public final c:Ljava/lang/Object;

.field public d:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

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
    iput-object v0, p0, Lcom/zykj/evaluation/ui/Hilt_MainActivity;->c:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lcom/zykj/evaluation/ui/Hilt_MainActivity;->d:Z

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/Hilt_MainActivity;->m()V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final generatedComponent()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/Hilt_MainActivity;->n()Ll8/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ll8/a;->generatedComponent()Ljava/lang/Object;

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
    invoke-static {p0, v0}, Lk8/a;->a(Landroidx/activity/ComponentActivity;Landroidx/lifecycle/ViewModelProvider$Factory;)Landroidx/lifecycle/ViewModelProvider$Factory;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final m()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/evaluation/ui/Hilt_MainActivity$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/zykj/evaluation/ui/Hilt_MainActivity$a;-><init>(Lcom/zykj/evaluation/ui/Hilt_MainActivity;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroidx/activity/ComponentActivity;->addOnContextAvailableListener(Landroidx/activity/contextaware/OnContextAvailableListener;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final n()Ll8/a;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/Hilt_MainActivity;->b:Ll8/a;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/evaluation/ui/Hilt_MainActivity;->c:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, Lcom/zykj/evaluation/ui/Hilt_MainActivity;->b:Ll8/a;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/Hilt_MainActivity;->o()Ll8/a;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iput-object v1, p0, Lcom/zykj/evaluation/ui/Hilt_MainActivity;->b:Ll8/a;

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
    iget-object v0, p0, Lcom/zykj/evaluation/ui/Hilt_MainActivity;->b:Ll8/a;

    .line 26
    .line 27
    return-object v0
.end method

.method public o()Ll8/a;
    .locals 1

    .line 1
    new-instance v0, Ll8/a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ll8/a;-><init>(Landroid/app/Activity;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/Hilt_MainActivity;->p()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onDestroy()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/evaluation/ui/Hilt_MainActivity;->a:Ll8/g;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Ll8/g;->a()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final p()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v0, v0, Ln8/b;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/Hilt_MainActivity;->n()Ll8/a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ll8/a;->b()Ll8/g;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lcom/zykj/evaluation/ui/Hilt_MainActivity;->a:Ll8/g;

    .line 18
    .line 19
    invoke-virtual {v0}, Ll8/g;->b()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    iget-object v0, p0, Lcom/zykj/evaluation/ui/Hilt_MainActivity;->a:Ll8/g;

    .line 26
    .line 27
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->getDefaultViewModelCreationExtras()Landroidx/lifecycle/viewmodel/CreationExtras;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Ll8/g;->c(Landroidx/lifecycle/viewmodel/CreationExtras;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void
.end method

.method public q()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/zykj/evaluation/ui/Hilt_MainActivity;->d:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/zykj/evaluation/ui/Hilt_MainActivity;->d:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/zykj/evaluation/ui/Hilt_MainActivity;->generatedComponent()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ls5/h;

    .line 13
    .line 14
    invoke-static {p0}, Ln8/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lcom/zykj/evaluation/ui/MainActivity;

    .line 19
    .line 20
    invoke-interface {v0, v1}, Ls5/h;->c(Lcom/zykj/evaluation/ui/MainActivity;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method
