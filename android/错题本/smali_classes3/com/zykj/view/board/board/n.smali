.class public final synthetic Lcom/zykj/view/board/board/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# instance fields
.field public final synthetic a:Lcom/zykj/view/board/board/BoardViewModel;

.field public final synthetic b:Lcom/zykj/view/board/board/k;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/board/BoardViewModel;Lcom/zykj/view/board/board/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/view/board/board/n;->a:Lcom/zykj/view/board/board/BoardViewModel;

    iput-object p2, p0, Lcom/zykj/view/board/board/n;->b:Lcom/zykj/view/board/board/k;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/n;->a:Lcom/zykj/view/board/board/BoardViewModel;

    iget-object v1, p0, Lcom/zykj/view/board/board/n;->b:Lcom/zykj/view/board/board/k;

    invoke-static {v0, v1}, Lcom/zykj/view/board/board/BoardViewModel;->k(Lcom/zykj/view/board/board/BoardViewModel;Lcom/zykj/view/board/board/k;)Ld6/s;

    move-result-object v0

    return-object v0
.end method
