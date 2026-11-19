.class public final Lcom/zykj/message/client/MessageClient$INSTANCES$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/message/client/MessageClient$INSTANCES;->a(Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/message/client/MessageClient$INSTANCES;

.field public final synthetic b:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Lcom/zykj/message/client/MessageClient$INSTANCES;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$a;->a:Lcom/zykj/message/client/MessageClient$INSTANCES;

    iput-object p2, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$a;->b:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$a;->a:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/message/client/MessageClient$INSTANCES;->D()Le6/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0}, Le6/b;->e()Lcom/zykj/message/server/bean/ServerInfo;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    iget-object v1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$a;->a:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 16
    .line 17
    invoke-static {v1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->y(Lcom/zykj/message/client/MessageClient$INSTANCES;)Landroid/os/Handler;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    new-instance v2, Lcom/zykj/message/client/MessageClient$INSTANCES$a$a;

    .line 22
    .line 23
    invoke-direct {v2, p0, v0}, Lcom/zykj/message/client/MessageClient$INSTANCES$a$a;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES$a;Lcom/zykj/message/server/bean/ServerInfo;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 27
    .line 28
    .line 29
    return-void
.end method
