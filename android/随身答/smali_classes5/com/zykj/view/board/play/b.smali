.class public final synthetic Lcom/zykj/view/board/play/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lcom/zykj/view/board/play/SketchPlayFragment;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(ZLcom/zykj/view/board/play/SketchPlayFragment;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/zykj/view/board/play/b;->a:Z

    iput-object p2, p0, Lcom/zykj/view/board/play/b;->b:Lcom/zykj/view/board/play/SketchPlayFragment;

    iput-object p3, p0, Lcom/zykj/view/board/play/b;->c:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/play/b;->a:Z

    iget-object v1, p0, Lcom/zykj/view/board/play/b;->b:Lcom/zykj/view/board/play/SketchPlayFragment;

    iget-object v2, p0, Lcom/zykj/view/board/play/b;->c:Lkotlin/jvm/functions/Function1;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, v1, v2, p1}, Lcom/zykj/view/board/play/SketchPlayFragment$play$1$1;->a(ZLcom/zykj/view/board/play/SketchPlayFragment;Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
