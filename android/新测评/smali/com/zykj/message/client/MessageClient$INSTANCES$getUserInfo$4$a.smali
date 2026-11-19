.class public final Lcom/zykj/message/client/MessageClient$INSTANCES$getUserInfo$4$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/message/client/MessageClient$INSTANCES$getUserInfo$4;->invoke()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/message/client/MessageClient$INSTANCES$getUserInfo$4;


# direct methods
.method public constructor <init>(Lcom/zykj/message/client/MessageClient$INSTANCES$getUserInfo$4;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$getUserInfo$4$a;->a:Lcom/zykj/message/client/MessageClient$INSTANCES$getUserInfo$4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$getUserInfo$4$a;->a:Lcom/zykj/message/client/MessageClient$INSTANCES$getUserInfo$4;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/zykj/message/client/MessageClient$INSTANCES$getUserInfo$4;->a:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/zykj/message/client/MessageClient$INSTANCES;->D()Ln7/b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v0}, Ln7/b;->b()Lcom/zykj/message/server/bean/UserInfo;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    iget-object v1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$getUserInfo$4$a;->a:Lcom/zykj/message/client/MessageClient$INSTANCES$getUserInfo$4;

    .line 18
    .line 19
    iget-object v1, v1, Lcom/zykj/message/client/MessageClient$INSTANCES$getUserInfo$4;->a:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 20
    .line 21
    invoke-static {v1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->y(Lcom/zykj/message/client/MessageClient$INSTANCES;)Landroid/os/Handler;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    new-instance v2, Lcom/zykj/message/client/MessageClient$INSTANCES$getUserInfo$4$a$a;

    .line 26
    .line 27
    invoke-direct {v2, p0, v0}, Lcom/zykj/message/client/MessageClient$INSTANCES$getUserInfo$4$a$a;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES$getUserInfo$4$a;Lcom/zykj/message/server/bean/UserInfo;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 31
    .line 32
    .line 33
    return-void
.end method
