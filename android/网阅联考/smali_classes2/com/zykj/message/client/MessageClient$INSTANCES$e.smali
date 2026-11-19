.class public final Lcom/zykj/message/client/MessageClient$INSTANCES$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/message/client/MessageClient$INSTANCES;->s(Lz1/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/message/client/MessageClient$INSTANCES;

.field public final synthetic b:Lz1/a;


# direct methods
.method public constructor <init>(Lcom/zykj/message/client/MessageClient$INSTANCES;Lz1/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$e;->a:Lcom/zykj/message/client/MessageClient$INSTANCES;

    iput-object p2, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$e;->b:Lz1/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$e;->a:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/message/client/MessageClient$INSTANCES;->o()La2/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$e;->b:Lz1/a;

    .line 10
    .line 11
    invoke-interface {v0, v1}, La2/b;->d(La2/a;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method
