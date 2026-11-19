.class public final synthetic Lcom/zykj/view/board/board/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/f;


# instance fields
.field public final synthetic a:Lcom/zykj/view/board/board/BoardFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/board/BoardFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/view/board/board/h;->a:Lcom/zykj/view/board/board/BoardFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Lcom/zykj/blackboard/core/edit/IBoardControl;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    check-cast p3, Ljava/lang/Long;

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iget-object p3, p0, Lcom/zykj/view/board/board/h;->a:Lcom/zykj/view/board/board/BoardFragment;

    invoke-static {p3, p1, p2, v0, v1}, Lcom/zykj/view/board/board/BoardFragment;->j0(Lcom/zykj/view/board/board/BoardFragment;Lcom/zykj/blackboard/core/edit/IBoardControl;ZJ)Ld6/s;

    move-result-object p1

    return-object p1
.end method
