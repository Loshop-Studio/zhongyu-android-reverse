.class public final Lcom/zykj/message/client/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/message/client/u;

.field public final synthetic b:Lcom/zykj/message/server/bean/UserInfo;


# direct methods
.method public constructor <init>(Lcom/zykj/message/client/u;Lcom/zykj/message/server/bean/UserInfo;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/message/client/t;->a:Lcom/zykj/message/client/u;

    iput-object p2, p0, Lcom/zykj/message/client/t;->b:Lcom/zykj/message/server/bean/UserInfo;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/message/client/t;->a:Lcom/zykj/message/client/u;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/zykj/message/client/u;->a:Lcom/zykj/message/client/MessageClient$INSTANCES$getUserInfo$2;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/zykj/message/client/t;->b:Lcom/zykj/message/server/bean/UserInfo;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-static {}, Lkotlin/jvm/internal/k;->n()V

    .line 14
    .line 15
    .line 16
    throw v1

    .line 17
    :cond_0
    throw v1
.end method
