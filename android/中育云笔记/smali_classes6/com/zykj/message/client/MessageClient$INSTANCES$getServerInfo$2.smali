.class final Lcom/zykj/message/client/MessageClient$INSTANCES$getServerInfo$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/message/client/MessageClient$INSTANCES;->a(Lcb/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lhd/a;"
    }
.end annotation


# instance fields
.field public final synthetic c:Lcom/zykj/message/client/MessageClient$INSTANCES;

.field public final synthetic d:Lcb/b;


# direct methods
.method public constructor <init>(Lcom/zykj/message/client/MessageClient$INSTANCES;Lcb/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$getServerInfo$2;->c:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$getServerInfo$2;->d:Lcb/b;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/message/client/MessageClient$INSTANCES$getServerInfo$2;->invoke()V

    sget-object v0, Lqc/q;->a:Lqc/q;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 2
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/zykj/message/client/MessageClient$INSTANCES$getServerInfo$2$a;

    invoke-direct {v1, p0}, Lcom/zykj/message/client/MessageClient$INSTANCES$getServerInfo$2$a;-><init>(Lcom/zykj/message/client/MessageClient$INSTANCES$getServerInfo$2;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 3
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method
