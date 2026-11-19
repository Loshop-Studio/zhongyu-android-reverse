.class public final Lcom/zykj/message/client/MessageClient$INSTANCES$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/message/client/MessageClient$INSTANCES;->q(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/message/client/MessageClient$INSTANCES;

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Lcom/zykj/message/client/MessageClient$INSTANCES;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$g;->a:Lcom/zykj/message/client/MessageClient$INSTANCES;

    iput-object p2, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$g;->b:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$g;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$g;->a:Lcom/zykj/message/client/MessageClient$INSTANCES;

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
    new-instance v1, Ld6/b;

    .line 10
    .line 11
    iget-object v2, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$g;->b:Lkotlin/jvm/functions/Function1;

    .line 12
    .line 13
    iget-object v3, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$g;->c:Lkotlin/jvm/functions/Function1;

    .line 14
    .line 15
    invoke-direct {v1, v2, v3}, Ld6/b;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, v1}, Le6/b;->a(Le6/a;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method
