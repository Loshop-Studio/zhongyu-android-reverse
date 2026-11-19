.class public final Lcom/zykj/insight/App;
.super Lt1/o;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0003\u001a\u00020\u0004H\u0016J\u0008\u0010\u0005\u001a\u00020\u0004H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/zykj/insight/App;",
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
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lt1/o;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public onCreate()V
    .locals 1

    .line 1
    invoke-super {p0}, Lt1/o;->onCreate()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/zykj/message/client/MessageClient;->a:Lcom/zykj/message/client/MessageClient;

    .line 5
    .line 6
    invoke-virtual {v0, p0}, Lcom/zykj/message/client/MessageClient;->d(Landroid/app/Application;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onTerminate()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Application;->onTerminate()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/zykj/message/client/MessageClient;->a:Lcom/zykj/message/client/MessageClient;

    .line 5
    .line 6
    invoke-virtual {v0}, Lcom/zykj/message/client/MessageClient;->e()V

    .line 7
    .line 8
    .line 9
    return-void
.end method
