.class public Lb/d/b/i/e;
.super Ljava/lang/Thread;
.source ""


# instance fields
.field public final synthetic b:Lb/d/b/i/f;


# direct methods
.method public constructor <init>(Lb/d/b/i/f;)V
    .locals 0

    iput-object p1, p0, Lb/d/b/i/e;->b:Lb/d/b/i/f;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lb/d/b/i/e;->b:Lb/d/b/i/f;

    .line 1
    iget-object v1, v0, Lb/d/b/i/f;->f:Lcom/zykj/satisfaction/update/UpdateResp$UpdateInfo;

    .line 2
    invoke-virtual {v1}, Lcom/zykj/satisfaction/update/UpdateResp$UpdateInfo;->getFileUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb/d/b/i/f;->a(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    const-wide/16 v1, 0x3e8

    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V

    iget-object v1, p0, Lb/d/b/i/e;->b:Lb/d/b/i/f;

    .line 3
    iget-object v1, v1, Lb/d/b/i/f;->b:Landroid/app/Dialog;

    .line 4
    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V

    iget-object v1, p0, Lb/d/b/i/e;->b:Lb/d/b/i/f;

    invoke-virtual {v1, v0}, Lb/d/b/i/f;->b(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lb/d/b/i/e;->b:Lb/d/b/i/f;

    .line 5
    iget-object v1, v1, Lb/d/b/i/f;->e:Lb/d/b/i/f$a;

    const/4 v2, 0x1

    .line 6
    invoke-static {v1, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    iget-object v1, p0, Lb/d/b/i/e;->b:Lb/d/b/i/f;

    .line 7
    iget-object v1, v1, Lb/d/b/i/f;->b:Landroid/app/Dialog;

    .line 8
    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method
