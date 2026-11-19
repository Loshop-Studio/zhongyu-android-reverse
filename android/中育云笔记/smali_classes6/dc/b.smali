.class public final Ldc/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfc/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldc/b$c;,
        Ldc/b$e;,
        Ldc/b$d;,
        Ldc/b$b;
    }
.end annotation


# instance fields
.field public final c:Landroidx/lifecycle/ViewModelStoreOwner;

.field public final d:Landroid/content/Context;

.field public volatile e:Lyb/b;

.field public final f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroidx/activity/ComponentActivity;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    iput-object v0, p0, Ldc/b;->f:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p1, p0, Ldc/b;->c:Landroidx/lifecycle/ViewModelStoreOwner;

    .line 12
    .line 13
    iput-object p1, p0, Ldc/b;->d:Landroid/content/Context;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a()Lyb/b;
    .locals 2

    .line 1
    iget-object v0, p0, Ldc/b;->c:Landroidx/lifecycle/ViewModelStoreOwner;

    .line 2
    .line 3
    iget-object v1, p0, Ldc/b;->d:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Ldc/b;->d(Landroidx/lifecycle/ViewModelStoreOwner;Landroid/content/Context;)Landroidx/lifecycle/ViewModelProvider;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-class v1, Ldc/b$c;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroidx/lifecycle/ViewModelProvider;->get(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ldc/b$c;

    .line 16
    .line 17
    invoke-virtual {v0}, Ldc/b$c;->a()Lyb/b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0
.end method

.method public b()Lyb/b;
    .locals 2

    .line 1
    iget-object v0, p0, Ldc/b;->e:Lyb/b;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Ldc/b;->f:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, Ldc/b;->e:Lyb/b;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Ldc/b;->a()Lyb/b;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iput-object v1, p0, Ldc/b;->e:Lyb/b;

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
    iget-object v0, p0, Ldc/b;->e:Lyb/b;

    .line 26
    .line 27
    return-object v0
.end method

.method public c()Ldc/h;
    .locals 2

    .line 1
    iget-object v0, p0, Ldc/b;->c:Landroidx/lifecycle/ViewModelStoreOwner;

    .line 2
    .line 3
    iget-object v1, p0, Ldc/b;->d:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Ldc/b;->d(Landroidx/lifecycle/ViewModelStoreOwner;Landroid/content/Context;)Landroidx/lifecycle/ViewModelProvider;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-class v1, Ldc/b$c;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroidx/lifecycle/ViewModelProvider;->get(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ldc/b$c;

    .line 16
    .line 17
    invoke-virtual {v0}, Ldc/b$c;->b()Ldc/h;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0
.end method

.method public final d(Landroidx/lifecycle/ViewModelStoreOwner;Landroid/content/Context;)Landroidx/lifecycle/ViewModelProvider;
    .locals 2

    .line 1
    new-instance v0, Landroidx/lifecycle/ViewModelProvider;

    .line 2
    .line 3
    new-instance v1, Ldc/b$a;

    .line 4
    .line 5
    invoke-direct {v1, p0, p2}, Ldc/b$a;-><init>(Ldc/b;Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p1, v1}, Landroidx/lifecycle/ViewModelProvider;-><init>(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/lifecycle/ViewModelProvider$Factory;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public bridge synthetic generatedComponent()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ldc/b;->b()Lyb/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
