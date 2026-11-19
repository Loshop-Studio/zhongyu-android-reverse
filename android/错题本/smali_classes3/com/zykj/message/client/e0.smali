.class public final Lcom/zykj/message/client/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/message/client/MessageClient$INSTANCES;

.field public final synthetic b:Lr6/c;

.field public final synthetic c:Lr6/c;


# direct methods
.method public constructor <init>(Lcom/zykj/message/client/MessageClient$INSTANCES;Lr6/c;Lr6/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/message/client/e0;->a:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/zykj/message/client/e0;->b:Lr6/c;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/zykj/message/client/e0;->c:Lr6/c;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/message/client/e0;->a:Lcom/zykj/message/client/MessageClient$INSTANCES;

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
    new-instance v1, Lc4/b;

    .line 10
    .line 11
    iget-object v2, p0, Lcom/zykj/message/client/e0;->b:Lr6/c;

    .line 12
    .line 13
    iget-object v3, p0, Lcom/zykj/message/client/e0;->c:Lr6/c;

    .line 14
    .line 15
    invoke-direct {v1, v2, v3}, Lc4/b;-><init>(Lr6/c;Lr6/c;)V

    .line 16
    .line 17
    .line 18
    check-cast v0, Ld4/b;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ld4/b;->h(Ld4/a;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method
