.class public final Lb/d/a/b/e;
.super Ljava/util/TimerTask;
.source ""


# instance fields
.field public final synthetic b:Lb/d/a/b/b$a;


# direct methods
.method public constructor <init>(Lb/d/a/b/b$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lb/d/a/b/e;->b:Lb/d/a/b/b$a;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    const-string v0, "\u91cd\u542f\u670d\u52a1 1S\u540e\u7684\u8d85\u65f6\u4efb\u52a1\u542f\u52a8"

    invoke-static {v0}, Lb/a/a/a/a;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "MessageClient"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Landroid/content/Intent;

    const-string v2, "com.zykj.action.zykj.message.service"

    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v2, "com.zykj.manage"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v2, p0, Lb/d/a/b/e;->b:Lb/d/a/b/b$a;

    invoke-static {v2}, Lb/d/a/b/b$a;->h(Lb/d/a/b/b$a;)Landroid/app/Application;

    move-result-object v2

    iget-object v3, p0, Lb/d/a/b/e;->b:Lb/d/a/b/b$a;

    .line 1
    iget-object v3, v3, Lb/d/a/b/b$a;->i:Lb/d/a/b/b$a$e;

    const/4 v4, 0x1

    .line 2
    invoke-virtual {v2, v0, v3, v4}, Landroid/app/Application;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "\u670d\u52a1\u6ca1\u5728\u8fd0\u884c\uff1f\u7ed1\u5b9a\u5931\u8d25\u4e86 "

    invoke-static {v0}, Lb/a/a/a/a;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lb/d/a/b/e;->b:Lb/d/a/b/b$a;

    .line 3
    iget-object v0, v0, Lb/d/a/b/b$a;->j:Landroid/os/Handler;

    const/4 v1, 0x2

    .line 4
    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    :cond_0
    return-void
.end method
