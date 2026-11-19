.class public final Lb/d/a/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/zykj/message/UnInstallActivity;


# direct methods
.method public constructor <init>(Lcom/zykj/message/UnInstallActivity;)V
    .locals 0

    iput-object p1, p0, Lb/d/a/a;->b:Lcom/zykj/message/UnInstallActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lb/d/a/a;->b:Lcom/zykj/message/UnInstallActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lb/d/a/a;->b:Lcom/zykj/message/UnInstallActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    :cond_0
    return-void
.end method
