.class public final Lcom/zykj/message/UnInstallActivity;
.super La/b/c/g;
.source ""


# instance fields
.field public o:Z

.field public p:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, La/b/c/g;-><init>()V

    return-void
.end method


# virtual methods
.method public onBackPressed()V
    .locals 1

    .line 1
    sget-object v0, Lb/d/a/b/a;->e:Lb/d/a/b/a;

    .line 2
    invoke-virtual {v0}, Lb/d/a/b/a;->a()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, La/k/b/p;->onCreate(Landroid/os/Bundle;)V

    # RE layout layout/activity_un_install (0x7f0c001d), APK res/layout/activity_un_install.xml
    const p1, 0x7f0c001d

    invoke-virtual {p0, p1}, La/b/c/g;->setContentView(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "hidden"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroid/app/Activity;->moveTaskToBack(Z)Z

    :cond_0
    const p1, 0x7f090237

    .line 1
    iget-object v0, p0, Lcom/zykj/message/UnInstallActivity;->p:Ljava/util/HashMap;

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/zykj/message/UnInstallActivity;->p:Ljava/util/HashMap;

    :cond_1
    iget-object v0, p0, Lcom/zykj/message/UnInstallActivity;->p:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_2

    invoke-virtual {p0, p1}, La/b/c/g;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/zykj/message/UnInstallActivity;->p:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    :cond_2
    check-cast v0, Landroid/widget/TextView;

    sget-object p1, Lcom/zykj/message/UnInstallActivity$a;->b:Lcom/zykj/message/UnInstallActivity$a;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public onResume()V
    .locals 4

    invoke-super {p0}, La/k/b/p;->onResume()V

    sget-object v0, Lb/d/a/b/b;->b:Lb/d/a/b/b;

    invoke-virtual {v0}, Lb/d/a/b/b;->c()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1
    iget-boolean v1, p0, Lcom/zykj/message/UnInstallActivity;->o:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/zykj/message/UnInstallActivity;->o:Z

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    const-string v2, "application"

    invoke-static {v1, v2}, Ld/f/b/d;->b(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lb/d/a/b/b;->e(Landroid/app/Application;)V

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/zykj/message/KillSelfService;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, Lb/d/a/a;

    invoke-direct {v1, p0}, Lb/d/a/a;-><init>(Lcom/zykj/message/UnInstallActivity;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_1
    :goto_0
    return-void
.end method
