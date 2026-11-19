.class public final Lcom/zykj/message/client/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/message/client/q;

.field public final synthetic b:Lcom/zykj/message/server/bean/ServerInfo;


# direct methods
.method public constructor <init>(Lcom/zykj/message/client/q;Lcom/zykj/message/server/bean/ServerInfo;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/message/client/p;->a:Lcom/zykj/message/client/q;

    iput-object p2, p0, Lcom/zykj/message/client/p;->b:Lcom/zykj/message/server/bean/ServerInfo;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/message/client/p;->a:Lcom/zykj/message/client/q;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/zykj/message/client/q;->a:Lcom/zykj/message/client/MessageClient$INSTANCES$getServerInfo$4;

    .line 4
    .line 5
    iget-object v0, v0, Lcom/zykj/message/client/MessageClient$INSTANCES$getServerInfo$4;->$callBack:Lr6/c;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/zykj/message/client/p;->b:Lcom/zykj/message/server/bean/ServerInfo;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-interface {v0, v1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-static {}, Lkotlin/jvm/internal/k;->n()V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    throw v0
.end method
