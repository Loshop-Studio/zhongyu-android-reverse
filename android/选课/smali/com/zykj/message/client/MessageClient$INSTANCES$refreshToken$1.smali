.class public final Lcom/zykj/message/client/MessageClient$INSTANCES$refreshToken$1;
.super Lcom/zykj/message/listener/ServerCallBack;
.source "MessageClient.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/message/client/MessageClient$INSTANCES;->refreshToken(Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "com/zykj/message/client/MessageClient$INSTANCES$refreshToken$1",
        "Lcom/zykj/message/listener/ServerCallBack;",
        "serverInfoUpdate",
        "",
        "serverInfo",
        "Lcom/zykj/message/server/bean/ServerInfo;",
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
.field final synthetic $callBack:Lkotlin/jvm/functions/Function1;


# direct methods
.method constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 334
    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$refreshToken$1;->$callBack:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Lcom/zykj/message/listener/ServerCallBack;-><init>()V

    return-void
.end method


# virtual methods
.method public serverInfoUpdate(Lcom/zykj/message/server/bean/ServerInfo;)V
    .locals 1

    .line 336
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$refreshToken$1;->$callBack:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
