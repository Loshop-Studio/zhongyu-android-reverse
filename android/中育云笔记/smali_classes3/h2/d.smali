.class public final synthetic Lh2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lcom/friday/common/network/RefreshRepositoryImpl;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/common/network/RefreshRepositoryImpl;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh2/d;->c:Lcom/friday/common/network/RefreshRepositoryImpl;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lh2/d;->c:Lcom/friday/common/network/RefreshRepositoryImpl;

    check-cast p1, Lcom/zykj/message/server/bean/ServerInfo;

    invoke-static {v0, p1}, Lcom/friday/common/network/RefreshRepositoryImpl;->b(Lcom/friday/common/network/RefreshRepositoryImpl;Lcom/zykj/message/server/bean/ServerInfo;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
