.class public final synthetic Lkb/d1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lcom/zykj/view/board/board/BoardViewModel;

.field public final synthetic d:Ly9/n;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/board/BoardViewModel;Ly9/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkb/d1;->c:Lcom/zykj/view/board/board/BoardViewModel;

    iput-object p2, p0, Lkb/d1;->d:Ly9/n;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lkb/d1;->c:Lcom/zykj/view/board/board/BoardViewModel;

    iget-object v1, p0, Lkb/d1;->d:Ly9/n;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/zykj/view/board/board/BoardViewModel;->f(Lcom/zykj/view/board/board/BoardViewModel;Ly9/n;Ljava/lang/String;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
