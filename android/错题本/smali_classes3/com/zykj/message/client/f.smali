.class public final Lcom/zykj/message/client/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/message/client/g;


# direct methods
.method public constructor <init>(Lcom/zykj/message/client/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/message/client/f;->a:Lcom/zykj/message/client/g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/message/client/f;->a:Lcom/zykj/message/client/g;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/zykj/message/client/g;->b:Lr6/c;

    .line 4
    .line 5
    iget-object v0, v0, Lcom/zykj/message/client/g;->a:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/zykj/message/client/MessageClient$INSTANCES;->getRemoteServer()Ld4/d;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    check-cast v0, Ld4/b;

    .line 14
    .line 15
    invoke-virtual {v0}, Ld4/b;->e()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    :goto_0
    invoke-interface {v1, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    return-void
.end method
