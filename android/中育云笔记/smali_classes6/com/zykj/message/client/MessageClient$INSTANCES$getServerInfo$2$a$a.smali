.class public final Lcom/zykj/message/client/MessageClient$INSTANCES$getServerInfo$2$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/message/client/MessageClient$INSTANCES$getServerInfo$2$a;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lcom/zykj/message/client/MessageClient$INSTANCES$getServerInfo$2$a;

.field public final synthetic d:Lcom/zykj/message/server/bean/ServerInfo;


# direct methods
.method public constructor <init>(Lcom/zykj/message/client/MessageClient$INSTANCES$getServerInfo$2$a;Lcom/zykj/message/server/bean/ServerInfo;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$getServerInfo$2$a$a;->c:Lcom/zykj/message/client/MessageClient$INSTANCES$getServerInfo$2$a;

    iput-object p2, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$getServerInfo$2$a$a;->d:Lcom/zykj/message/server/bean/ServerInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$getServerInfo$2$a$a;->c:Lcom/zykj/message/client/MessageClient$INSTANCES$getServerInfo$2$a;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/zykj/message/client/MessageClient$INSTANCES$getServerInfo$2$a;->c:Lcom/zykj/message/client/MessageClient$INSTANCES$getServerInfo$2;

    .line 4
    .line 5
    iget-object v0, v0, Lcom/zykj/message/client/MessageClient$INSTANCES$getServerInfo$2;->d:Lcb/b;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$getServerInfo$2$a$a;->d:Lcom/zykj/message/server/bean/ServerInfo;

    .line 8
    .line 9
    invoke-interface {v0, v1}, Lcb/b;->a(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
