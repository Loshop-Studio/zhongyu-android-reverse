.class public final synthetic Lcom/zykj/view/board/play/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lcom/zykj/view/board/play/SketchPlayFragment;

.field public final synthetic c:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(ZLcom/zykj/view/board/play/SketchPlayFragment;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/zykj/view/board/play/d;->a:Z

    iput-object p2, p0, Lcom/zykj/view/board/play/d;->b:Lcom/zykj/view/board/play/SketchPlayFragment;

    iput-object p3, p0, Lcom/zykj/view/board/play/d;->c:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/zykj/view/board/play/d;->a:Z

    iget-object v1, p0, Lcom/zykj/view/board/play/d;->b:Lcom/zykj/view/board/play/SketchPlayFragment;

    iget-object v2, p0, Lcom/zykj/view/board/play/d;->c:Lkotlin/jvm/functions/Function0;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, v1, v2, p1}, Lcom/zykj/view/board/play/SketchPlayFragment$seekTo$1;->a(ZLcom/zykj/view/board/play/SketchPlayFragment;Lkotlin/jvm/functions/Function0;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
