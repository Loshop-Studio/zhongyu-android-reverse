.class final Lcom/zykj/message/UnInstallActivity$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/message/UnInstallActivity;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/zykj/message/UnInstallActivity;


# direct methods
.method constructor <init>(Lcom/zykj/message/UnInstallActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/message/UnInstallActivity$b;->a:Lcom/zykj/message/UnInstallActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/message/UnInstallActivity$b;->a:Lcom/zykj/message/UnInstallActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/zykj/message/UnInstallActivity$b;->a:Lcom/zykj/message/UnInstallActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    :cond_0
    return-void
.end method
