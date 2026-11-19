.class public final Lcom/friday/common/network/StudentSession$3$1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcb/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/common/network/StudentSession$3$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lsd/j;


# direct methods
.method public constructor <init>(Lsd/j;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/common/network/StudentSession$3$1$a;->a:Lsd/j;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/message/server/bean/ServerInfo;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/friday/common/network/StudentSession$3$1$a;->b(Lcom/zykj/message/server/bean/ServerInfo;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b(Lcom/zykj/message/server/bean/ServerInfo;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/network/StudentSession$3$1$a;->a:Lsd/j;

    .line 2
    .line 3
    invoke-interface {v0}, Lsd/j;->isActive()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/friday/common/network/StudentSession$3$1$a;->a:Lsd/j;

    .line 10
    .line 11
    invoke-static {p1}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-interface {v0, p1}, Lvc/c;->resumeWith(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method
