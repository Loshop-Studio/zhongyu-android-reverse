.class public final synthetic Lkb/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/q;


# instance fields
.field public final synthetic c:Lcom/zykj/view/board/board/BoardFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/board/BoardFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkb/b0;->c:Lcom/zykj/view/board/board/BoardFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lkb/b0;->c:Lcom/zykj/view/board/board/BoardFragment;

    check-cast p1, Lcom/zykj/blackboard/core/edit/IBoardControl;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    check-cast p3, Ljava/lang/Long;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v0, p1, p2, v1, v2}, Lcom/zykj/view/board/board/BoardFragment;->m0(Lcom/zykj/view/board/board/BoardFragment;Lcom/zykj/blackboard/core/edit/IBoardControl;ZJ)Lqc/q;

    move-result-object p1

    return-object p1
.end method
