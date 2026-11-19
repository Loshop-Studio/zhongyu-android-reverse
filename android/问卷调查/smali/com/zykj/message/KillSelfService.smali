.class public final Lcom/zykj/message/KillSelfService;
.super Landroid/app/Service;
.source ""


# instance fields
.field public final b:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/zykj/message/KillSelfService;->b:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    const-string v0, "intent"

    invoke-static {p1, v0}, Ld/f/b/d;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 4

    iget-object v0, p0, Lcom/zykj/message/KillSelfService;->b:Landroid/os/Handler;

    new-instance v1, Lcom/zykj/message/KillSelfService$a;

    invoke-direct {v1, p0}, Lcom/zykj/message/KillSelfService$a;-><init>(Lcom/zykj/message/KillSelfService;)V

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    move-result p1

    return p1
.end method
