.class public final Lcom/zykj/message/UnLoginActivity;
.super La/b/c/g;
.source ""


# static fields
.field public static final synthetic q:I


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
.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, La/k/b/p;->onActivityResult(IILandroid/content/Intent;)V

    const/16 p3, 0xc8

    if-ne p1, p3, :cond_0

    const/4 p1, -0x1

    if-ne p2, p1, :cond_0

    const-string p1, ""

    const-string p2, "\u4e2a\u4eba\u4e2d\u5fc3\u767b\u5f55\u6210\u529f"

    invoke-static {p1, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/zykj/message/UnLoginActivity;->w()V

    :cond_0
    return-void
.end method

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

    # RE layout layout/activity_un_login (0x7f0c001e), APK res/layout/activity_un_login.xml
    const p1, 0x7f0c001e

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
    const-string p1, "UnLoginActivity"

    const-string v0, "onCreate"

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const p1, 0x7f090235

    invoke-virtual {p0, p1}, Lcom/zykj/message/UnLoginActivity;->v(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    sget-object v0, Lcom/zykj/message/UnLoginActivity$a;->b:Lcom/zykj/message/UnLoginActivity$a;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p1, 0x7f09023d

    invoke-virtual {p0, p1}, Lcom/zykj/message/UnLoginActivity;->v(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    new-instance v0, Lcom/zykj/message/UnLoginActivity$b;

    invoke-direct {v0, p0}, Lcom/zykj/message/UnLoginActivity$b;-><init>(Lcom/zykj/message/UnLoginActivity;)V

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    invoke-super {p0}, La/b/c/g;->onDestroy()V

    const-string v0, "UnLoginActivity"

    const-string v1, "onDestroy"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public onPause()V
    .locals 2

    invoke-super {p0}, La/k/b/p;->onPause()V

    const-string v0, "UnLoginActivity"

    const-string v1, "onPause"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public onRestart()V
    .locals 2

    invoke-super {p0}, Landroid/app/Activity;->onRestart()V

    const-string v0, "UnLoginActivity"

    const-string v1, "onRestart"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public onResume()V
    .locals 2

    invoke-super {p0}, La/k/b/p;->onResume()V

    const-string v0, "UnLoginActivity"

    const-string v1, "onResume"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lb/d/a/b/b;->b:Lb/d/a/b/b;

    new-instance v1, Lcom/zykj/message/UnLoginActivity$c;

    invoke-direct {v1, p0}, Lcom/zykj/message/UnLoginActivity$c;-><init>(Lcom/zykj/message/UnLoginActivity;)V

    invoke-virtual {v0, v1}, Lb/d/a/b/b;->a(Ld/f/a/b;)V

    return-void
.end method

.method public onStart()V
    .locals 2

    invoke-super {p0}, La/b/c/g;->onStart()V

    const-string v0, "UnLoginActivity"

    const-string v1, "onStart"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public onStop()V
    .locals 2

    invoke-super {p0}, La/b/c/g;->onStop()V

    const-string v0, "UnLoginActivity"

    const-string v1, "onStop"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public v(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/zykj/message/UnLoginActivity;->p:Ljava/util/HashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/zykj/message/UnLoginActivity;->p:Ljava/util/HashMap;

    :cond_0
    iget-object v0, p0, Lcom/zykj/message/UnLoginActivity;->p:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, La/b/c/g;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/zykj/message/UnLoginActivity;->p:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public final w()V
    .locals 4

    iget-boolean v0, p0, Lcom/zykj/message/UnLoginActivity;->o:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/zykj/message/UnLoginActivity;->o:Z

    sget-object v0, Lb/d/a/b/b;->b:Lb/d/a/b/b;

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

    new-instance v1, Lcom/zykj/message/UnLoginActivity$d;

    invoke-direct {v1, p0}, Lcom/zykj/message/UnLoginActivity$d;-><init>(Lcom/zykj/message/UnLoginActivity;)V

    const-wide/16 v2, 0x1f4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
