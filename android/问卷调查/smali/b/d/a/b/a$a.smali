.class public Lb/d/a/b/a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/d/a/b/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lb/d/a/b/a;


# direct methods
.method public constructor <init>(Lb/d/a/b/a;)V
    .locals 0

    iput-object p1, p0, Lb/d/a/b/a$a;->a:Lb/d/a/b/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    iget-object p2, p0, Lb/d/a/b/a$a;->a:Lb/d/a/b/a;

    .line 1
    iget-object p2, p2, Lb/d/a/b/a;->a:Ljava/util/List;

    .line 2
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 1

    iget-object v0, p0, Lb/d/a/b/a$a;->a:Lb/d/a/b/a;

    .line 1
    iget-object v0, v0, Lb/d/a/b/a;->a:Ljava/util/List;

    .line 2
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 0

    iget-object p1, p0, Lb/d/a/b/a$a;->a:Lb/d/a/b/a;

    .line 1
    iget-object p1, p1, Lb/d/a/b/a;->c:Lb/d/a/b/a$b;

    if-eqz p1, :cond_0

    .line 2
    invoke-interface {p1}, Lb/d/a/b/a$b;->a()V

    :cond_0
    return-void
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method
