.class public final Lcom/zykj/message/client/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/message/client/s;

.field public final synthetic b:Lcom/zykj/message/server/bean/UserInfo;


# direct methods
.method public constructor <init>(Lcom/zykj/message/client/s;Lcom/zykj/message/server/bean/UserInfo;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/message/client/r;->a:Lcom/zykj/message/client/s;

    iput-object p2, p0, Lcom/zykj/message/client/r;->b:Lcom/zykj/message/server/bean/UserInfo;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/message/client/r;->a:Lcom/zykj/message/client/s;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/message/client/r;->b:Lcom/zykj/message/server/bean/UserInfo;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-static {}, Lkotlin/jvm/internal/k;->n()V

    .line 12
    .line 13
    .line 14
    throw v1

    .line 15
    :cond_0
    throw v1
.end method
