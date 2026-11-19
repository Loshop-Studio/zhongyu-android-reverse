.class Lcom/zykj/subscriber/update/c$b;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/subscriber/update/c;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/zykj/subscriber/update/c;


# direct methods
.method constructor <init>(Lcom/zykj/subscriber/update/c;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/subscriber/update/c$b;->a:Lcom/zykj/subscriber/update/c;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/zykj/subscriber/update/c$b;->a:Lcom/zykj/subscriber/update/c;

    invoke-static {v0}, Lcom/zykj/subscriber/update/c;->e(Lcom/zykj/subscriber/update/c;)Lcom/zykj/subscriber/update/UpdateResp$UpdateInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/zykj/subscriber/update/UpdateResp$UpdateInfo;->getFileUrl()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/zykj/subscriber/update/c;->l(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    const-wide/16 v1, 0x3e8

    .line 2
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V

    .line 3
    iget-object v1, p0, Lcom/zykj/subscriber/update/c$b;->a:Lcom/zykj/subscriber/update/c;

    invoke-static {v1}, Lcom/zykj/subscriber/update/c;->f(Lcom/zykj/subscriber/update/c;)Landroid/app/Dialog;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V

    .line 4
    iget-object v1, p0, Lcom/zykj/subscriber/update/c$b;->a:Lcom/zykj/subscriber/update/c;

    invoke-virtual {v1, v0}, Lcom/zykj/subscriber/update/c;->m(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 5
    iget-object v1, p0, Lcom/zykj/subscriber/update/c$b;->a:Lcom/zykj/subscriber/update/c;

    invoke-static {v1}, Lcom/zykj/subscriber/update/c;->g(Lcom/zykj/subscriber/update/c;)Lcom/zykj/subscriber/update/c$c;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v1, v2}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    .line 6
    iget-object v1, p0, Lcom/zykj/subscriber/update/c$b;->a:Lcom/zykj/subscriber/update/c;

    invoke-static {v1}, Lcom/zykj/subscriber/update/c;->f(Lcom/zykj/subscriber/update/c;)Landroid/app/Dialog;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V

    .line 7
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method
