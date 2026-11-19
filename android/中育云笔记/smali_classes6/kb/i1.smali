.class public final synthetic Lkb/i1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lcom/zykj/view/board/board/BoardViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/board/BoardViewModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkb/i1;->c:Lcom/zykj/view/board/board/BoardViewModel;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lkb/i1;->c:Lcom/zykj/view/board/board/BoardViewModel;

    check-cast p1, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    invoke-static {v0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->d(Lcom/zykj/view/board/board/BoardViewModel;Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
