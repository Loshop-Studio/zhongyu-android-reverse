.class public final Lcom/zykj/message/listener/DefaultMessageCallBack;
.super Lcom/zykj/message/listener/BaseMessageCallBack;
.source "DefaultMessageCallBack.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u00002\u00020\u0001B1\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\u0010\u0008J\u0012\u0010\u000c\u001a\u00020\u00052\u0008\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\u000e\u001a\u00020\u00052\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0016R\u001f\u0010\u0002\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u001f\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\n\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/zykj/message/listener/DefaultMessageCallBack;",
        "Lcom/zykj/message/listener/BaseMessageCallBack;",
        "serverCallBack",
        "Lkotlin/Function1;",
        "Lcom/zykj/message/server/bean/ServerInfo;",
        "",
        "userCallBack",
        "Lcom/zykj/message/server/bean/UserInfo;",
        "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V",
        "getServerCallBack",
        "()Lkotlin/jvm/functions/Function1;",
        "getUserCallBack",
        "serverInfoUpdate",
        "serverInfo",
        "userInfoUpdate",
        "userInfo",
        "messageclient_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xf
    }
.end annotation


# instance fields
.field private final serverCallBack:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/zykj/message/server/bean/ServerInfo;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final userCallBack:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/zykj/message/server/bean/UserInfo;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/zykj/message/server/bean/ServerInfo;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/zykj/message/server/bean/UserInfo;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "serverCallBack"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userCallBack"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Lcom/zykj/message/listener/BaseMessageCallBack;-><init>()V

    iput-object p1, p0, Lcom/zykj/message/listener/DefaultMessageCallBack;->serverCallBack:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lcom/zykj/message/listener/DefaultMessageCallBack;->userCallBack:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final getServerCallBack()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/zykj/message/server/bean/ServerInfo;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 11
    iget-object v0, p0, Lcom/zykj/message/listener/DefaultMessageCallBack;->serverCallBack:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getUserCallBack()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/zykj/message/server/bean/UserInfo;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 11
    iget-object v0, p0, Lcom/zykj/message/listener/DefaultMessageCallBack;->userCallBack:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public serverInfoUpdate(Lcom/zykj/message/server/bean/ServerInfo;)V
    .locals 1

    .line 14
    iget-object v0, p0, Lcom/zykj/message/listener/DefaultMessageCallBack;->serverCallBack:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public userInfoUpdate(Lcom/zykj/message/server/bean/UserInfo;)V
    .locals 1

    .line 18
    iget-object v0, p0, Lcom/zykj/message/listener/DefaultMessageCallBack;->userCallBack:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
