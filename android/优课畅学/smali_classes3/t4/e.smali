.class public final synthetic Lt4/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Lcom/zykj/study/repository/RefreshRepositoryImp;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/repository/RefreshRepositoryImp;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt4/e;->a:Lcom/zykj/study/repository/RefreshRepositoryImp;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lt4/e;->a:Lcom/zykj/study/repository/RefreshRepositoryImp;

    check-cast p1, Lcom/zykj/message/server/bean/ServerInfo;

    invoke-static {v0, p1}, Lcom/zykj/study/repository/RefreshRepositoryImp;->b(Lcom/zykj/study/repository/RefreshRepositoryImp;Lcom/zykj/message/server/bean/ServerInfo;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
