.class public abstract Lt1/o;
.super Landroid/app/Application;
.source "SourceFile"

# interfaces
.implements Lj2/b;


# instance fields
.field public a:Z

.field public final b:Ldagger/hilt/android/internal/managers/d;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lt1/o;->a:Z

    .line 6
    .line 7
    new-instance v0, Ldagger/hilt/android/internal/managers/d;

    .line 8
    .line 9
    new-instance v1, Lt1/o$a;

    .line 10
    .line 11
    invoke-direct {v1, p0}, Lt1/o$a;-><init>(Lt1/o;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1}, Ldagger/hilt/android/internal/managers/d;-><init>(Ldagger/hilt/android/internal/managers/e;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lt1/o;->b:Ldagger/hilt/android/internal/managers/d;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lt1/o;->b()Ldagger/hilt/android/internal/managers/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ldagger/hilt/android/internal/managers/d;->a()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final b()Ldagger/hilt/android/internal/managers/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lt1/o;->b:Ldagger/hilt/android/internal/managers/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lt1/o;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lt1/o;->a:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lt1/o;->a()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lt1/a;

    .line 13
    .line 14
    invoke-static {p0}, Lj2/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lcom/zykj/insight/App;

    .line 19
    .line 20
    invoke-interface {v0, v1}, Lt1/a;->b(Lcom/zykj/insight/App;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public onCreate()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lt1/o;->c()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    .line 5
    .line 6
    .line 7
    return-void
.end method
