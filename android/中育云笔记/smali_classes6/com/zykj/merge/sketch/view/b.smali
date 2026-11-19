.class public final synthetic Lcom/zykj/merge/sketch/view/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Lhd/l;

.field public final synthetic d:Lha/m;


# direct methods
.method public synthetic constructor <init>(Lhd/l;Lha/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/merge/sketch/view/b;->c:Lhd/l;

    iput-object p2, p0, Lcom/zykj/merge/sketch/view/b;->d:Lha/m;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/b;->c:Lhd/l;

    iget-object v1, p0, Lcom/zykj/merge/sketch/view/b;->d:Lha/m;

    invoke-static {v0, v1}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$loadData$1$1$1;->a(Lhd/l;Lha/m;)V

    return-void
.end method
