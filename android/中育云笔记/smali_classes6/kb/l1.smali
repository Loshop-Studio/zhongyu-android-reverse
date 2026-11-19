.class public final synthetic Lkb/l1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:Lcom/zykj/view/board/board/BoardViewModel;

.field public final synthetic d:Lhd/l;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/board/BoardViewModel;Lhd/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkb/l1;->c:Lcom/zykj/view/board/board/BoardViewModel;

    iput-object p2, p0, Lkb/l1;->d:Lhd/l;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lkb/l1;->c:Lcom/zykj/view/board/board/BoardViewModel;

    iget-object v1, p0, Lkb/l1;->d:Lhd/l;

    invoke-static {v0, v1}, Lcom/zykj/view/board/board/BoardViewModel;->j(Lcom/zykj/view/board/board/BoardViewModel;Lhd/l;)Lqc/q;

    move-result-object v0

    return-object v0
.end method
