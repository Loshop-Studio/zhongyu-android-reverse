.class public final synthetic Lp5/l1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic a:Lcom/zykj/view/board/board/BoardViewModel;

.field public final synthetic b:Lx7/l;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/board/BoardViewModel;Lx7/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp5/l1;->a:Lcom/zykj/view/board/board/BoardViewModel;

    iput-object p2, p0, Lp5/l1;->b:Lx7/l;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lp5/l1;->a:Lcom/zykj/view/board/board/BoardViewModel;

    iget-object v1, p0, Lp5/l1;->b:Lx7/l;

    invoke-static {v0, v1}, Lcom/zykj/view/board/board/BoardViewModel;->j(Lcom/zykj/view/board/board/BoardViewModel;Lx7/l;)Lh7/p;

    move-result-object v0

    return-object v0
.end method
