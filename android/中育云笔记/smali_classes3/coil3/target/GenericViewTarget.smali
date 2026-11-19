.class public abstract Lcoil3/target/GenericViewTarget;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly/b;
.implements Lz/d;
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Landroid/view/View;",
        ">",
        "Ljava/lang/Object;",
        "Ly/b;",
        "Lz/d;",
        "Landroidx/lifecycle/DefaultLifecycleObserver;"
    }
.end annotation


# instance fields
.field public c:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Lk/j;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcoil3/target/GenericViewTarget;->g(Lk/j;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public b(Lk/j;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcoil3/target/GenericViewTarget;->g(Lk/j;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public c(Lk/j;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcoil3/target/GenericViewTarget;->g(Lk/j;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public abstract d()Landroid/graphics/drawable/Drawable;
.end method

.method public abstract e(Landroid/graphics/drawable/Drawable;)V
.end method

.method public final f()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcoil3/target/GenericViewTarget;->d()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Landroid/graphics/drawable/Animatable;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Landroid/graphics/drawable/Animatable;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-nez v0, :cond_1

    .line 14
    .line 15
    return-void

    .line 16
    :cond_1
    iget-boolean v1, p0, Lcoil3/target/GenericViewTarget;->c:Z

    .line 17
    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    invoke-interface {v0}, Landroid/graphics/drawable/Animatable;->start()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_2
    invoke-interface {v0}, Landroid/graphics/drawable/Animatable;->stop()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final g(Lk/j;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-interface {p0}, Ly/b;->getView()Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {p1, v1}, Lk/o;->a(Lk/j;Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object p1, v0

    .line 18
    :goto_0
    invoke-virtual {p0}, Lcoil3/target/GenericViewTarget;->d()Landroid/graphics/drawable/Drawable;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    instance-of v2, v1, Landroid/graphics/drawable/Animatable;

    .line 23
    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    move-object v0, v1

    .line 27
    check-cast v0, Landroid/graphics/drawable/Animatable;

    .line 28
    .line 29
    :cond_1
    if-eqz v0, :cond_2

    .line 30
    .line 31
    invoke-interface {v0}, Landroid/graphics/drawable/Animatable;->stop()V

    .line 32
    .line 33
    .line 34
    :cond_2
    invoke-virtual {p0, p1}, Lcoil3/target/GenericViewTarget;->e(Landroid/graphics/drawable/Drawable;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lcoil3/target/GenericViewTarget;->f()V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public onStart(Landroidx/lifecycle/LifecycleOwner;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcoil3/target/GenericViewTarget;->c:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lcoil3/target/GenericViewTarget;->f()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onStop(Landroidx/lifecycle/LifecycleOwner;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcoil3/target/GenericViewTarget;->c:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lcoil3/target/GenericViewTarget;->f()V

    .line 5
    .line 6
    .line 7
    return-void
.end method
