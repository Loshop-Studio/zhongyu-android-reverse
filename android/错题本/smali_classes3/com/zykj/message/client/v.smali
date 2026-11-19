.class public final Lcom/zykj/message/client/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/message/client/w;

.field public final synthetic b:Lcom/zykj/message/server/bean/UserInfo;


# direct methods
.method public constructor <init>(Lcom/zykj/message/client/w;Lcom/zykj/message/server/bean/UserInfo;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/message/client/v;->a:Lcom/zykj/message/client/w;

    iput-object p2, p0, Lcom/zykj/message/client/v;->b:Lcom/zykj/message/server/bean/UserInfo;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/message/client/v;->a:Lcom/zykj/message/client/w;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/zykj/message/client/w;->b:Lr6/c;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/message/client/v;->b:Lcom/zykj/message/server/bean/UserInfo;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-interface {v0, v1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-static {}, Lkotlin/jvm/internal/k;->n()V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    throw v0
.end method
