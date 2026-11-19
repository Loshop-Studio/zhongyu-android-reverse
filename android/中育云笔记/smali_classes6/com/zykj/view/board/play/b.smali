.class public final synthetic Lcom/zykj/view/board/play/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Z

.field public final synthetic d:Lcom/zykj/view/board/play/SketchPlayFragment;

.field public final synthetic e:Lhd/l;


# direct methods
.method public synthetic constructor <init>(ZLcom/zykj/view/board/play/SketchPlayFragment;Lhd/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/zykj/view/board/play/b;->c:Z

    iput-object p2, p0, Lcom/zykj/view/board/play/b;->d:Lcom/zykj/view/board/play/SketchPlayFragment;

    iput-object p3, p0, Lcom/zykj/view/board/play/b;->e:Lhd/l;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/play/b;->c:Z

    iget-object v1, p0, Lcom/zykj/view/board/play/b;->d:Lcom/zykj/view/board/play/SketchPlayFragment;

    iget-object v2, p0, Lcom/zykj/view/board/play/b;->e:Lhd/l;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, v1, v2, p1}, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->g(ZLcom/zykj/view/board/play/SketchPlayFragment;Lhd/l;Ljava/lang/Throwable;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
