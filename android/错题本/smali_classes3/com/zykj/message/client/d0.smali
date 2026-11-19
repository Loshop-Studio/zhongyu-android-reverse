.class public final Lcom/zykj/message/client/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/message/client/MessageClient$INSTANCES;

.field public final synthetic b:Lc4/a;


# direct methods
.method public constructor <init>(Lcom/zykj/message/client/MessageClient$INSTANCES;Lc4/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/message/client/d0;->a:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/zykj/message/client/d0;->b:Lc4/a;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/message/client/d0;->a:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/message/client/MessageClient$INSTANCES;->getRemoteServer()Ld4/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lcom/zykj/message/client/d0;->b:Lc4/a;

    .line 10
    .line 11
    check-cast v0, Ld4/b;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ld4/b;->h(Ld4/a;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method
