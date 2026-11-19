.class public final synthetic Lp5/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/network/RefreshRepositoryImpl;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/evaluation/network/RefreshRepositoryImpl;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp5/o;->a:Lcom/zykj/evaluation/network/RefreshRepositoryImpl;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lp5/o;->a:Lcom/zykj/evaluation/network/RefreshRepositoryImpl;

    check-cast p1, Lcom/zykj/message/server/bean/ServerInfo;

    invoke-static {v0, p1}, Lcom/zykj/evaluation/network/RefreshRepositoryImpl;->b(Lcom/zykj/evaluation/network/RefreshRepositoryImpl;Lcom/zykj/message/server/bean/ServerInfo;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
