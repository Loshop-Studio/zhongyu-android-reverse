.class public final Lcom/zykj/MyApplication;
.super Landroid/app/Application;
.source "MyApplication.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0003\u001a\u00020\u0004H\u0016J\u0008\u0010\u0005\u001a\u00020\u0004H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/zykj/MyApplication;",
        "Landroid/app/Application;",
        "()V",
        "onCreate",
        "",
        "onTerminate",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x1
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    return-void
.end method


# virtual methods
.method public onCreate()V
    .locals 2

    .line 9
    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    .line 11
    sget-object v0, Lcom/zykj/message/client/MessageClient;->INSTANCES:Lcom/zykj/message/client/MessageClient;

    move-object v1, p0

    check-cast v1, Landroid/app/Application;

    invoke-virtual {v0, v1}, Lcom/zykj/message/client/MessageClient;->startService(Landroid/app/Application;)V

    return-void
.end method

.method public onTerminate()V
    .locals 1

    .line 16
    invoke-super {p0}, Landroid/app/Application;->onTerminate()V

    .line 18
    sget-object v0, Lcom/zykj/message/client/MessageClient;->INSTANCES:Lcom/zykj/message/client/MessageClient;

    invoke-virtual {v0}, Lcom/zykj/message/client/MessageClient;->stopService()V

    return-void
.end method
