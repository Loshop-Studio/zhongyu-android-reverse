.class public final synthetic Lcom/zykj/view/board/board/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lcom/zykj/view/board/board/BoardViewModel;

.field public final synthetic d:Lhd/p;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/board/BoardViewModel;Lhd/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/view/board/board/e;->c:Lcom/zykj/view/board/board/BoardViewModel;

    iput-object p2, p0, Lcom/zykj/view/board/board/e;->d:Lhd/p;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/e;->c:Lcom/zykj/view/board/board/BoardViewModel;

    iget-object v1, p0, Lcom/zykj/view/board/board/e;->d:Lhd/p;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->m(Lcom/zykj/view/board/board/BoardViewModel;Lhd/p;Ljava/lang/String;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
