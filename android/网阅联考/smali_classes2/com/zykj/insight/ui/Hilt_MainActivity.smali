.class public abstract Lcom/zykj/insight/ui/Hilt_MainActivity;
.super Landroidx/activity/ComponentActivity;
.source "SourceFile"

# interfaces
.implements Lj2/b;


# instance fields
.field public volatile a:Ldagger/hilt/android/internal/managers/a;

.field public final b:Ljava/lang/Object;

.field public c:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/activity/ComponentActivity;-><init>()V

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
    iput-object v0, p0, Lcom/zykj/insight/ui/Hilt_MainActivity;->b:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lcom/zykj/insight/ui/Hilt_MainActivity;->c:Z

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/zykj/insight/ui/Hilt_MainActivity;->e()V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/insight/ui/Hilt_MainActivity;->f()Ldagger/hilt/android/internal/managers/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ldagger/hilt/android/internal/managers/a;->a()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final e()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/insight/ui/Hilt_MainActivity$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/zykj/insight/ui/Hilt_MainActivity$a;-><init>(Lcom/zykj/insight/ui/Hilt_MainActivity;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroidx/activity/ComponentActivity;->addOnContextAvailableListener(Landroidx/activity/contextaware/OnContextAvailableListener;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final f()Ldagger/hilt/android/internal/managers/a;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/insight/ui/Hilt_MainActivity;->a:Ldagger/hilt/android/internal/managers/a;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/insight/ui/Hilt_MainActivity;->b:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, Lcom/zykj/insight/ui/Hilt_MainActivity;->a:Ldagger/hilt/android/internal/managers/a;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/zykj/insight/ui/Hilt_MainActivity;->g()Ldagger/hilt/android/internal/managers/a;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iput-object v1, p0, Lcom/zykj/insight/ui/Hilt_MainActivity;->a:Ldagger/hilt/android/internal/managers/a;

    .line 17
    .line 18
    :cond_0
    monitor-exit v0

    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    throw v1

    .line 23
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/zykj/insight/ui/Hilt_MainActivity;->a:Ldagger/hilt/android/internal/managers/a;

    .line 24
    .line 25
    return-object v0
.end method

.method public g()Ldagger/hilt/android/internal/managers/a;
    .locals 1

    .line 1
    new-instance v0, Ldagger/hilt/android/internal/managers/a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ldagger/hilt/android/internal/managers/a;-><init>(Landroid/app/Activity;)V

    .line 4
    .line 5
    .line 6
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
    invoke-static {p0, v0}, Lh2/a;->a(Landroidx/activity/ComponentActivity;Landroidx/lifecycle/ViewModelProvider$Factory;)Landroidx/lifecycle/ViewModelProvider$Factory;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public h()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/zykj/insight/ui/Hilt_MainActivity;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/zykj/insight/ui/Hilt_MainActivity;->c:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/zykj/insight/ui/Hilt_MainActivity;->a()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lv1/a;

    .line 13
    .line 14
    invoke-static {p0}, Lj2/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lcom/zykj/insight/ui/MainActivity;

    .line 19
    .line 20
    invoke-interface {v0, v1}, Lv1/a;->b(Lcom/zykj/insight/ui/MainActivity;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method
