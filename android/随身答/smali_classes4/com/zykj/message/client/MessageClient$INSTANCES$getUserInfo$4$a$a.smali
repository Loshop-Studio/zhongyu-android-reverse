.class public final Lcom/zykj/message/client/MessageClient$INSTANCES$getUserInfo$4$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/message/client/MessageClient$INSTANCES$getUserInfo$4$a;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/message/client/MessageClient$INSTANCES$getUserInfo$4$a;

.field public final synthetic b:Lcom/zykj/message/server/bean/UserInfo;


# direct methods
.method public constructor <init>(Lcom/zykj/message/client/MessageClient$INSTANCES$getUserInfo$4$a;Lcom/zykj/message/server/bean/UserInfo;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$getUserInfo$4$a$a;->a:Lcom/zykj/message/client/MessageClient$INSTANCES$getUserInfo$4$a;

    iput-object p2, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$getUserInfo$4$a$a;->b:Lcom/zykj/message/server/bean/UserInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$getUserInfo$4$a$a;->a:Lcom/zykj/message/client/MessageClient$INSTANCES$getUserInfo$4$a;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/zykj/message/client/MessageClient$INSTANCES$getUserInfo$4$a;->a:Lcom/zykj/message/client/MessageClient$INSTANCES$getUserInfo$4;

    .line 4
    .line 5
    iget-object v0, v0, Lcom/zykj/message/client/MessageClient$INSTANCES$getUserInfo$4;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/zykj/message/client/MessageClient$INSTANCES$getUserInfo$4$a$a;->b:Lcom/zykj/message/server/bean/UserInfo;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-static {}, Lkotlin/jvm/internal/Intrinsics;->throwNpe()V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    return-void
.end method
