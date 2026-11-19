.class public abstract Lcom/zykj/message/listener/ServerCallBack;
.super Lcom/zykj/message/listener/BaseMessageCallBack;
.source "ServerCallBack.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/zykj/message/listener/ServerCallBack;",
        "Lcom/zykj/message/listener/BaseMessageCallBack;",
        "()V",
        "userInfoUpdate",
        "",
        "userInfo",
        "Lcom/zykj/message/server/bean/UserInfo;",
        "messageclient_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xf
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Lcom/zykj/message/listener/BaseMessageCallBack;-><init>()V

    return-void
.end method


# virtual methods
.method public userInfoUpdate(Lcom/zykj/message/server/bean/UserInfo;)V
    .locals 0

    return-void
.end method
