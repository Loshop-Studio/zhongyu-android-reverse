.class final Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1$onServiceConnected$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;->onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/zykj/message/server/bean/ServerInfo;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lcom/zykj/message/server/bean/ServerInfo;",
        "it",
        "",
        "a",
        "(Lcom/zykj/message/server/bean/ServerInfo;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;


# direct methods
.method public constructor <init>(Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1$onServiceConnected$1;->a:Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/zykj/message/server/bean/ServerInfo;)V
    .locals 2

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1$onServiceConnected$1;->a:Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;

    .line 7
    .line 8
    iget-object v0, v0, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1;->a:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-static {v0, p1, v1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->u(Lcom/zykj/message/client/MessageClient$INSTANCES;Lcom/zykj/message/server/bean/ServerInfo;Z)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/message/server/bean/ServerInfo;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/message/client/MessageClient$INSTANCES$mConnection$1$onServiceConnected$1;->a(Lcom/zykj/message/server/bean/ServerInfo;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 7
    .line 8
    return-object p1
.end method
