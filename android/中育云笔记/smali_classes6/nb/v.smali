.class public final synthetic Lnb/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lcom/zykj/view/board/play/SketchPlayFragment$f;

.field public final synthetic d:Lcom/zykj/view/board/play/SketchPlayFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/play/SketchPlayFragment$f;Lcom/zykj/view/board/play/SketchPlayFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnb/v;->c:Lcom/zykj/view/board/play/SketchPlayFragment$f;

    iput-object p2, p0, Lnb/v;->d:Lcom/zykj/view/board/play/SketchPlayFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lnb/v;->c:Lcom/zykj/view/board/play/SketchPlayFragment$f;

    iget-object v1, p0, Lnb/v;->d:Lcom/zykj/view/board/play/SketchPlayFragment;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, v1, p1}, Lcom/zykj/view/board/play/SketchPlayFragment$f;->a(Lcom/zykj/view/board/play/SketchPlayFragment$f;Lcom/zykj/view/board/play/SketchPlayFragment;I)Lqc/q;

    move-result-object p1

    return-object p1
.end method
