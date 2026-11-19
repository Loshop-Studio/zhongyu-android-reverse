.class public final synthetic Lcom/zykj/view/board/play/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/view/board/play/SketchPlayFragment;

.field public final synthetic c:I

.field public final synthetic d:Z

.field public final synthetic e:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(ILcom/zykj/view/board/play/SketchPlayFragment;IZLkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/zykj/view/board/play/c;->a:I

    iput-object p2, p0, Lcom/zykj/view/board/play/c;->b:Lcom/zykj/view/board/play/SketchPlayFragment;

    iput p3, p0, Lcom/zykj/view/board/play/c;->c:I

    iput-boolean p4, p0, Lcom/zykj/view/board/play/c;->d:Z

    iput-object p5, p0, Lcom/zykj/view/board/play/c;->e:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lcom/zykj/view/board/play/c;->a:I

    iget-object v1, p0, Lcom/zykj/view/board/play/c;->b:Lcom/zykj/view/board/play/SketchPlayFragment;

    iget v2, p0, Lcom/zykj/view/board/play/c;->c:I

    iget-boolean v3, p0, Lcom/zykj/view/board/play/c;->d:Z

    iget-object v4, p0, Lcom/zykj/view/board/play/c;->e:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->c(ILcom/zykj/view/board/play/SketchPlayFragment;IZLkotlin/jvm/functions/Function1;)V

    return-void
.end method
