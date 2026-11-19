.class public La/k/b/p;
.super Landroidx/activity/ComponentActivity;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/k/b/p$a;
    }
.end annotation


# instance fields
.field public final i:La/k/b/x;

.field public final j:La/m/h;

.field public k:Z

.field public l:Z

.field public m:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Landroidx/activity/ComponentActivity;-><init>()V

    new-instance v0, La/k/b/p$a;

    invoke-direct {v0, p0}, La/k/b/p$a;-><init>(La/k/b/p;)V

    .line 1
    new-instance v1, La/k/b/x;

    const-string v2, "callbacks == null"

    invoke-static {v0, v2}, La/h/b/e;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v1, v0}, La/k/b/x;-><init>(La/k/b/z;)V

    .line 2
    iput-object v1, p0, La/k/b/p;->i:La/k/b/x;

    new-instance v0, La/m/h;

    invoke-direct {v0, p0}, La/m/h;-><init>(La/m/g;)V

    iput-object v0, p0, La/k/b/p;->j:La/m/h;

    const/4 v0, 0x1

    iput-boolean v0, p0, La/k/b/p;->m:Z

    .line 3
    iget-object v0, p0, Landroidx/activity/ComponentActivity;->e:La/p/b;

    .line 4
    iget-object v0, v0, La/p/b;->b:La/p/a;

    .line 5
    new-instance v1, La/k/b/n;

    invoke-direct {v1, p0}, La/k/b/n;-><init>(La/k/b/p;)V

    const-string v2, "android:support:fragments"

    invoke-virtual {v0, v2, v1}, La/p/a;->b(Ljava/lang/String;La/p/a$b;)V

    new-instance v0, La/k/b/o;

    invoke-direct {v0, p0}, La/k/b/o;-><init>(La/k/b/p;)V

    invoke-virtual {p0, v0}, Landroidx/activity/ComponentActivity;->k(La/a/d/b;)V

    return-void
.end method

.method public static n(La/k/b/c0;La/m/d$b;)Z
    .locals 7

    sget-object v0, La/m/d$b;->e:La/m/d$b;

    .line 1
    iget-object p0, p0, La/k/b/c0;->c:La/k/b/k0;

    invoke-virtual {p0}, La/k/b/k0;->i()Ljava/util/List;

    move-result-object p0

    .line 2
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v1, 0x0

    move v2, v1

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La/k/b/m;

    if-nez v3, :cond_1

    goto :goto_0

    .line 3
    :cond_1
    iget-object v4, v3, La/k/b/m;->u:La/k/b/z;

    if-nez v4, :cond_2

    const/4 v4, 0x0

    goto :goto_1

    :cond_2
    invoke-virtual {v4}, La/k/b/z;->i()Ljava/lang/Object;

    move-result-object v4

    :goto_1
    if-eqz v4, :cond_3

    .line 4
    invoke-virtual {v3}, La/k/b/m;->j()La/k/b/c0;

    move-result-object v4

    invoke-static {v4, p1}, La/k/b/p;->n(La/k/b/c0;La/m/d$b;)Z

    move-result v4

    or-int/2addr v2, v4

    :cond_3
    iget-object v4, v3, La/k/b/m;->Q:La/k/b/x0;

    const-string v5, "setCurrentState"

    const/4 v6, 0x1

    if-eqz v4, :cond_5

    .line 5
    invoke-virtual {v4}, La/k/b/x0;->f()V

    iget-object v4, v4, La/k/b/x0;->c:La/m/h;

    .line 6
    iget-object v4, v4, La/m/h;->b:La/m/d$b;

    .line 7
    invoke-virtual {v4, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v4

    if-ltz v4, :cond_4

    move v4, v6

    goto :goto_2

    :cond_4
    move v4, v1

    :goto_2
    if-eqz v4, :cond_5

    .line 8
    iget-object v2, v3, La/k/b/m;->Q:La/k/b/x0;

    .line 9
    iget-object v2, v2, La/k/b/x0;->c:La/m/h;

    .line 10
    invoke-virtual {v2, v5}, La/m/h;->c(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, La/m/h;->f(La/m/d$b;)V

    move v2, v6

    .line 11
    :cond_5
    iget-object v4, v3, La/k/b/m;->P:La/m/h;

    .line 12
    iget-object v4, v4, La/m/h;->b:La/m/d$b;

    .line 13
    invoke-virtual {v4, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v4

    if-ltz v4, :cond_6

    move v4, v6

    goto :goto_3

    :cond_6
    move v4, v1

    :goto_3
    if-eqz v4, :cond_0

    .line 14
    iget-object v2, v3, La/k/b/m;->P:La/m/h;

    .line 15
    invoke-virtual {v2, v5}, La/m/h;->c(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, La/m/h;->f(La/m/d$b;)V

    move v2, v6

    goto :goto_0

    :cond_7
    return v2
.end method


# virtual methods
.method public dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 2

    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Local FragmentActivity "

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, " State:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "mCreated="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v1, p0, La/k/b/p;->k:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    const-string v1, " mResumed="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v1, p0, La/k/b/p;->l:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    const-string v1, " mStopped="

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v1, p0, La/k/b/p;->m:Z

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Z)V

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {p0}, La/n/a/a;->b(La/m/g;)La/n/a/a;

    move-result-object v1

    invoke-virtual {v1, v0, p2, p3, p4}, La/n/a/a;->a(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, La/k/b/p;->i:La/k/b/x;

    .line 1
    iget-object v0, v0, La/k/b/x;->a:La/k/b/z;

    iget-object v0, v0, La/k/b/z;->e:La/k/b/c0;

    .line 2
    invoke-virtual {v0, p1, p2, p3, p4}, La/k/b/c0;->y(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    return-void
.end method

.method public o()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, La/k/b/p;->i:La/k/b/x;

    invoke-virtual {v0}, La/k/b/x;->a()V

    invoke-super {p0, p1, p2, p3}, Landroidx/activity/ComponentActivity;->onActivityResult(IILandroid/content/Intent;)V

    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 1

    iget-object v0, p0, La/k/b/p;->i:La/k/b/x;

    invoke-virtual {v0}, La/k/b/x;->a()V

    invoke-super {p0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    iget-object v0, p0, La/k/b/p;->i:La/k/b/x;

    .line 1
    iget-object v0, v0, La/k/b/x;->a:La/k/b/z;

    iget-object v0, v0, La/k/b/z;->e:La/k/b/c0;

    invoke-virtual {v0, p1}, La/k/b/c0;->k(Landroid/content/res/Configuration;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onCreate(Landroid/os/Bundle;)V

    iget-object p1, p0, La/k/b/p;->j:La/m/h;

    sget-object v0, La/m/d$a;->ON_CREATE:La/m/d$a;

    invoke-virtual {p1, v0}, La/m/h;->d(La/m/d$a;)V

    iget-object p1, p0, La/k/b/p;->i:La/k/b/x;

    .line 1
    iget-object p1, p1, La/k/b/x;->a:La/k/b/z;

    iget-object p1, p1, La/k/b/z;->e:La/k/b/c0;

    invoke-virtual {p1}, La/k/b/c0;->m()V

    return-void
.end method

.method public onCreatePanelMenu(ILandroid/view/Menu;)Z
    .locals 2

    if-nez p1, :cond_0

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result p1

    iget-object v0, p0, La/k/b/p;->i:La/k/b/x;

    invoke-virtual {p0}, Landroid/app/Activity;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v1

    .line 1
    iget-object v0, v0, La/k/b/x;->a:La/k/b/z;

    iget-object v0, v0, La/k/b/z;->e:La/k/b/c0;

    invoke-virtual {v0, p2, v1}, La/k/b/c0;->n(Landroid/view/Menu;Landroid/view/MenuInflater;)Z

    move-result p2

    or-int/2addr p1, p2

    return p1

    .line 2
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, La/k/b/p;->i:La/k/b/x;

    .line 2
    iget-object v0, v0, La/k/b/x;->a:La/k/b/z;

    iget-object v0, v0, La/k/b/z;->e:La/k/b/c0;

    .line 3
    iget-object v0, v0, La/k/b/c0;->f:La/k/b/a0;

    .line 4
    invoke-virtual {v0, p1, p2, p3, p4}, La/k/b/a0;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    .line 5
    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 2

    .line 6
    iget-object v0, p0, La/k/b/p;->i:La/k/b/x;

    .line 7
    iget-object v0, v0, La/k/b/x;->a:La/k/b/z;

    iget-object v0, v0, La/k/b/z;->e:La/k/b/c0;

    .line 8
    iget-object v0, v0, La/k/b/c0;->f:La/k/b/a0;

    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1, p1, p2, p3}, La/k/b/a0;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    .line 10
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public onDestroy()V
    .locals 2

    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    iget-object v0, p0, La/k/b/p;->i:La/k/b/x;

    .line 1
    iget-object v0, v0, La/k/b/x;->a:La/k/b/z;

    iget-object v0, v0, La/k/b/z;->e:La/k/b/c0;

    invoke-virtual {v0}, La/k/b/c0;->o()V

    .line 2
    iget-object v0, p0, La/k/b/p;->j:La/m/h;

    sget-object v1, La/m/d$a;->ON_DESTROY:La/m/d$a;

    invoke-virtual {v0, v1}, La/m/h;->d(La/m/d$a;)V

    return-void
.end method

.method public onLowMemory()V
    .locals 1

    invoke-super {p0}, Landroid/app/Activity;->onLowMemory()V

    iget-object v0, p0, La/k/b/p;->i:La/k/b/x;

    .line 1
    iget-object v0, v0, La/k/b/x;->a:La/k/b/z;

    iget-object v0, v0, La/k/b/z;->e:La/k/b/c0;

    invoke-virtual {v0}, La/k/b/c0;->p()V

    return-void
.end method

.method public onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 1

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    const/4 v0, 0x6

    if-eq p1, v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    iget-object p1, p0, La/k/b/p;->i:La/k/b/x;

    .line 1
    iget-object p1, p1, La/k/b/x;->a:La/k/b/z;

    iget-object p1, p1, La/k/b/z;->e:La/k/b/c0;

    invoke-virtual {p1, p2}, La/k/b/c0;->l(Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    .line 2
    :cond_2
    iget-object p1, p0, La/k/b/p;->i:La/k/b/x;

    .line 3
    iget-object p1, p1, La/k/b/x;->a:La/k/b/z;

    iget-object p1, p1, La/k/b/z;->e:La/k/b/c0;

    invoke-virtual {p1, p2}, La/k/b/c0;->r(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public onMultiWindowModeChanged(Z)V
    .locals 1

    iget-object v0, p0, La/k/b/p;->i:La/k/b/x;

    .line 1
    iget-object v0, v0, La/k/b/x;->a:La/k/b/z;

    iget-object v0, v0, La/k/b/z;->e:La/k/b/c0;

    invoke-virtual {v0, p1}, La/k/b/c0;->q(Z)V

    return-void
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 1
    .param p1    # Landroid/content/Intent;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param

    iget-object v0, p0, La/k/b/p;->i:La/k/b/x;

    invoke-virtual {v0}, La/k/b/x;->a()V

    invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V

    return-void
.end method

.method public onPanelClosed(ILandroid/view/Menu;)V
    .locals 1

    if-nez p1, :cond_0

    iget-object v0, p0, La/k/b/p;->i:La/k/b/x;

    .line 1
    iget-object v0, v0, La/k/b/x;->a:La/k/b/z;

    iget-object v0, v0, La/k/b/z;->e:La/k/b/c0;

    invoke-virtual {v0, p2}, La/k/b/c0;->s(Landroid/view/Menu;)V

    .line 2
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onPanelClosed(ILandroid/view/Menu;)V

    return-void
.end method

.method public onPause()V
    .locals 2

    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    const/4 v0, 0x0

    iput-boolean v0, p0, La/k/b/p;->l:Z

    iget-object v0, p0, La/k/b/p;->i:La/k/b/x;

    .line 1
    iget-object v0, v0, La/k/b/x;->a:La/k/b/z;

    iget-object v0, v0, La/k/b/z;->e:La/k/b/c0;

    const/4 v1, 0x5

    .line 2
    invoke-virtual {v0, v1}, La/k/b/c0;->w(I)V

    .line 3
    iget-object v0, p0, La/k/b/p;->j:La/m/h;

    sget-object v1, La/m/d$a;->ON_PAUSE:La/m/d$a;

    invoke-virtual {v0, v1}, La/m/h;->d(La/m/d$a;)V

    return-void
.end method

.method public onPictureInPictureModeChanged(Z)V
    .locals 1

    iget-object v0, p0, La/k/b/p;->i:La/k/b/x;

    .line 1
    iget-object v0, v0, La/k/b/x;->a:La/k/b/z;

    iget-object v0, v0, La/k/b/z;->e:La/k/b/c0;

    invoke-virtual {v0, p1}, La/k/b/c0;->u(Z)V

    return-void
.end method

.method public onPostResume()V
    .locals 3

    invoke-super {p0}, Landroid/app/Activity;->onPostResume()V

    .line 1
    iget-object v0, p0, La/k/b/p;->j:La/m/h;

    sget-object v1, La/m/d$a;->ON_RESUME:La/m/d$a;

    invoke-virtual {v0, v1}, La/m/h;->d(La/m/d$a;)V

    iget-object v0, p0, La/k/b/p;->i:La/k/b/x;

    .line 2
    iget-object v0, v0, La/k/b/x;->a:La/k/b/z;

    iget-object v0, v0, La/k/b/z;->e:La/k/b/c0;

    const/4 v1, 0x0

    .line 3
    iput-boolean v1, v0, La/k/b/c0;->B:Z

    iput-boolean v1, v0, La/k/b/c0;->C:Z

    iget-object v2, v0, La/k/b/c0;->J:La/k/b/f0;

    .line 4
    iput-boolean v1, v2, La/k/b/f0;->g:Z

    const/4 v1, 0x7

    .line 5
    invoke-virtual {v0, v1}, La/k/b/c0;->w(I)V

    return-void
.end method

.method public onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
    .locals 0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 1
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result p1

    .line 2
    iget-object p2, p0, La/k/b/p;->i:La/k/b/x;

    .line 3
    iget-object p2, p2, La/k/b/x;->a:La/k/b/z;

    iget-object p2, p2, La/k/b/z;->e:La/k/b/c0;

    invoke-virtual {p2, p3}, La/k/b/c0;->v(Landroid/view/Menu;)Z

    move-result p2

    or-int/2addr p1, p2

    return p1

    .line 4
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    iget-object v0, p0, La/k/b/p;->i:La/k/b/x;

    invoke-virtual {v0}, La/k/b/x;->a()V

    invoke-super {p0, p1, p2, p3}, Landroidx/activity/ComponentActivity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    return-void
.end method

.method public onResume()V
    .locals 2

    iget-object v0, p0, La/k/b/p;->i:La/k/b/x;

    invoke-virtual {v0}, La/k/b/x;->a()V

    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    const/4 v0, 0x1

    iput-boolean v0, p0, La/k/b/p;->l:Z

    iget-object v1, p0, La/k/b/p;->i:La/k/b/x;

    .line 1
    iget-object v1, v1, La/k/b/x;->a:La/k/b/z;

    iget-object v1, v1, La/k/b/z;->e:La/k/b/c0;

    invoke-virtual {v1, v0}, La/k/b/c0;->C(Z)Z

    return-void
.end method

.method public onStart()V
    .locals 4

    iget-object v0, p0, La/k/b/p;->i:La/k/b/x;

    invoke-virtual {v0}, La/k/b/x;->a()V

    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    const/4 v0, 0x0

    iput-boolean v0, p0, La/k/b/p;->m:Z

    iget-boolean v1, p0, La/k/b/p;->k:Z

    const/4 v2, 0x1

    if-nez v1, :cond_0

    iput-boolean v2, p0, La/k/b/p;->k:Z

    iget-object v1, p0, La/k/b/p;->i:La/k/b/x;

    .line 1
    iget-object v1, v1, La/k/b/x;->a:La/k/b/z;

    iget-object v1, v1, La/k/b/z;->e:La/k/b/c0;

    .line 2
    iput-boolean v0, v1, La/k/b/c0;->B:Z

    iput-boolean v0, v1, La/k/b/c0;->C:Z

    iget-object v3, v1, La/k/b/c0;->J:La/k/b/f0;

    .line 3
    iput-boolean v0, v3, La/k/b/f0;->g:Z

    const/4 v3, 0x4

    .line 4
    invoke-virtual {v1, v3}, La/k/b/c0;->w(I)V

    .line 5
    :cond_0
    iget-object v1, p0, La/k/b/p;->i:La/k/b/x;

    .line 6
    iget-object v1, v1, La/k/b/x;->a:La/k/b/z;

    iget-object v1, v1, La/k/b/z;->e:La/k/b/c0;

    invoke-virtual {v1, v2}, La/k/b/c0;->C(Z)Z

    .line 7
    iget-object v1, p0, La/k/b/p;->j:La/m/h;

    sget-object v2, La/m/d$a;->ON_START:La/m/d$a;

    invoke-virtual {v1, v2}, La/m/h;->d(La/m/d$a;)V

    iget-object v1, p0, La/k/b/p;->i:La/k/b/x;

    .line 8
    iget-object v1, v1, La/k/b/x;->a:La/k/b/z;

    iget-object v1, v1, La/k/b/z;->e:La/k/b/c0;

    .line 9
    iput-boolean v0, v1, La/k/b/c0;->B:Z

    iput-boolean v0, v1, La/k/b/c0;->C:Z

    iget-object v2, v1, La/k/b/c0;->J:La/k/b/f0;

    .line 10
    iput-boolean v0, v2, La/k/b/f0;->g:Z

    const/4 v0, 0x5

    .line 11
    invoke-virtual {v1, v0}, La/k/b/c0;->w(I)V

    return-void
.end method

.method public onStateNotSaved()V
    .locals 1

    iget-object v0, p0, La/k/b/p;->i:La/k/b/x;

    invoke-virtual {v0}, La/k/b/x;->a()V

    return-void
.end method

.method public onStop()V
    .locals 3

    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    const/4 v0, 0x1

    iput-boolean v0, p0, La/k/b/p;->m:Z

    .line 1
    :cond_0
    iget-object v1, p0, La/k/b/p;->i:La/k/b/x;

    .line 2
    iget-object v1, v1, La/k/b/x;->a:La/k/b/z;

    iget-object v1, v1, La/k/b/z;->e:La/k/b/c0;

    .line 3
    sget-object v2, La/m/d$b;->d:La/m/d$b;

    invoke-static {v1, v2}, La/k/b/p;->n(La/k/b/c0;La/m/d$b;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 4
    iget-object v1, p0, La/k/b/p;->i:La/k/b/x;

    .line 5
    iget-object v1, v1, La/k/b/x;->a:La/k/b/z;

    iget-object v1, v1, La/k/b/z;->e:La/k/b/c0;

    .line 6
    iput-boolean v0, v1, La/k/b/c0;->C:Z

    iget-object v2, v1, La/k/b/c0;->J:La/k/b/f0;

    .line 7
    iput-boolean v0, v2, La/k/b/f0;->g:Z

    const/4 v0, 0x4

    .line 8
    invoke-virtual {v1, v0}, La/k/b/c0;->w(I)V

    .line 9
    iget-object v0, p0, La/k/b/p;->j:La/m/h;

    sget-object v1, La/m/d$a;->ON_STOP:La/m/d$a;

    invoke-virtual {v0, v1}, La/m/h;->d(La/m/d$a;)V

    return-void
.end method

.method public p()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0}, Landroid/app/Activity;->invalidateOptionsMenu()V

    return-void
.end method
