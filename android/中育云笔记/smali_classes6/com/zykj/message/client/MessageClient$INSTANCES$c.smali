.class public final Lcom/zykj/message/client/MessageClient$INSTANCES$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/message/client/MessageClient$INSTANCES;-><init>(Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lcom/zykj/message/client/MessageClient$INSTANCES;


# direct methods
.method public constructor <init>(Lcom/zykj/message/client/MessageClient$INSTANCES;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$c;->c:Lcom/zykj/message/client/MessageClient$INSTANCES;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 2

    .line 1
    iget p1, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    if-eq p1, v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    iget-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$c;->c:Lcom/zykj/message/client/MessageClient$INSTANCES;

    .line 8
    .line 9
    invoke-static {p1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->u(Lcom/zykj/message/client/MessageClient$INSTANCES;)Landroid/app/Application;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {p1, v0, v1}, Lcom/zykj/message/client/MessageClient$INSTANCES;->F(Landroid/content/Context;Z)V

    .line 15
    .line 16
    .line 17
    :goto_0
    const/4 p1, 0x1

    .line 18
    return p1
.end method
