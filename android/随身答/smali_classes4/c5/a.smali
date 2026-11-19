.class public final synthetic Lc5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/board/EzyPageRouter$PageRouter;

.field public final synthetic b:Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/board/EzyPageRouter$PageRouter;Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc5/a;->a:Lcom/zykj/board/EzyPageRouter$PageRouter;

    iput-object p2, p0, Lc5/a;->b:Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    iput-object p3, p0, Lc5/a;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lc5/a;->a:Lcom/zykj/board/EzyPageRouter$PageRouter;

    iget-object v1, p0, Lc5/a;->b:Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    iget-object v2, p0, Lc5/a;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lc5/b;->a(Lcom/zykj/board/EzyPageRouter$PageRouter;Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;Ljava/lang/String;)V

    return-void
.end method
