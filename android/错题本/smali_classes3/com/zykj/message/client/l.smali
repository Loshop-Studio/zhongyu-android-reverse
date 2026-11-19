.class public final Lcom/zykj/message/client/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/message/client/m;


# direct methods
.method public constructor <init>(Lcom/zykj/message/client/m;Lcom/zykj/message/server/bean/ServerInfo;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/message/client/l;->a:Lcom/zykj/message/client/m;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/message/client/l;->a:Lcom/zykj/message/client/m;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/zykj/message/client/m;->a:Lcom/zykj/message/client/MessageClient$INSTANCES$getServerInfo$2;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    throw v0
.end method
