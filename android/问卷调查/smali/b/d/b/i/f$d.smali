.class public Lb/d/b/i/f$d;
.super Landroid/os/Handler;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/d/b/i/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field public a:Lb/d/b/i/f$c;


# direct methods
.method public constructor <init>(Lb/d/b/i/f$c;)V
    .locals 0

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, Lb/d/b/i/f$d;->a:Lb/d/b/i/f$c;

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lb/d/b/i/f$d;->a:Lb/d/b/i/f$c;

    check-cast v0, Lb/d/b/i/c;

    .line 1
    iget-object v0, v0, Lb/d/b/i/c;->a:Lb/d/b/i/f;

    .line 2
    iget-object v1, v0, Lb/d/b/i/f;->c:Landroid/app/ProgressDialog;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/app/ProgressDialog;->isShowing()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, v0, Lb/d/b/i/f;->c:Landroid/app/ProgressDialog;

    invoke-virtual {v1}, Landroid/app/ProgressDialog;->dismiss()V

    const/4 v1, 0x0

    iput-object v1, v0, Lb/d/b/i/f;->c:Landroid/app/ProgressDialog;

    :cond_0
    if-eqz p1, :cond_2

    .line 3
    new-instance p1, Landroid/app/Dialog;

    iget-object v1, v0, Lb/d/b/i/f;->a:Landroid/content/Context;

    const v2, 0x103000b

    invoke-direct {p1, v1, v2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    iput-object p1, v0, Lb/d/b/i/f;->b:Landroid/app/Dialog;

    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    const v1, 0x106000d

    invoke-virtual {p1, v1}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    iget-object p1, v0, Lb/d/b/i/f;->b:Landroid/app/Dialog;

    const v1, 0x7f0c002f

    invoke-virtual {p1, v1}, Landroid/app/Dialog;->setContentView(I)V

    iget-object p1, v0, Lb/d/b/i/f;->b:Landroid/app/Dialog;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    iget-object p1, v0, Lb/d/b/i/f;->b:Landroid/app/Dialog;

    invoke-virtual {p1, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    iget-object p1, v0, Lb/d/b/i/f;->b:Landroid/app/Dialog;

    const v2, 0x7f090191

    invoke-virtual {p1, v2}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/zykj/satisfaction/update/PercentCircleView;

    new-instance v2, Lb/d/b/i/f$a;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Lb/d/b/i/a;

    invoke-direct {v3, p1}, Lb/d/b/i/a;-><init>(Lcom/zykj/satisfaction/update/PercentCircleView;)V

    invoke-direct {v2, v0, v3}, Lb/d/b/i/f$a;-><init>(Lb/d/b/i/f;Lb/d/b/i/f$b;)V

    iput-object v2, v0, Lb/d/b/i/f;->e:Lb/d/b/i/f$a;

    iget-object p1, v0, Lb/d/b/i/f;->b:Landroid/app/Dialog;

    new-instance v2, Lb/d/b/i/b;

    invoke-direct {v2, v0}, Lb/d/b/i/b;-><init>(Lb/d/b/i/f;)V

    invoke-virtual {p1, v2}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object p1

    const-string v2, "mounted"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, v0, Lb/d/b/i/f;->a:Landroid/content/Context;

    const v0, 0x7f0f005c

    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    goto :goto_0

    :cond_1
    iget-object p1, v0, Lb/d/b/i/f;->b:Landroid/app/Dialog;

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    new-instance p1, Lb/d/b/i/e;

    invoke-direct {p1, v0}, Lb/d/b/i/e;-><init>(Lb/d/b/i/f;)V

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    :cond_2
    :goto_0
    return-void
.end method
