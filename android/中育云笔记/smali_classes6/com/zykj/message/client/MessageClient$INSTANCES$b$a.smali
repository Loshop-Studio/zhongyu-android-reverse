.class public final Lcom/zykj/message/client/MessageClient$INSTANCES$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/message/client/MessageClient$INSTANCES$b;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lcom/zykj/message/client/MessageClient$INSTANCES$b;

.field public final synthetic d:Lcom/zykj/message/server/bean/ServerInfo;


# direct methods
.method public constructor <init>(Lcom/zykj/message/client/MessageClient$INSTANCES$b;Lcom/zykj/message/server/bean/ServerInfo;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$b$a;->c:Lcom/zykj/message/client/MessageClient$INSTANCES$b;

    iput-object p2, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$b$a;->d:Lcom/zykj/message/server/bean/ServerInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$b$a;->c:Lcom/zykj/message/client/MessageClient$INSTANCES$b;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/zykj/message/client/MessageClient$INSTANCES$b;->d:Lhd/l;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$b$a;->d:Lcom/zykj/message/server/bean/ServerInfo;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lkotlin/jvm/internal/u;->s()V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-interface {v0, v1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    return-void
.end method
