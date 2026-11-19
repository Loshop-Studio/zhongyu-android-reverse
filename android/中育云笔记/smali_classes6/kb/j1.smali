.class public final synthetic Lkb/j1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# instance fields
.field public final synthetic c:Lcom/zykj/view/board/board/BoardViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/board/BoardViewModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkb/j1;->c:Lcom/zykj/view/board/board/BoardViewModel;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lkb/j1;->c:Lcom/zykj/view/board/board/BoardViewModel;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-static {v0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel;->h(Lcom/zykj/view/board/board/BoardViewModel;ZZ)Lqc/q;

    move-result-object p1

    return-object p1
.end method
