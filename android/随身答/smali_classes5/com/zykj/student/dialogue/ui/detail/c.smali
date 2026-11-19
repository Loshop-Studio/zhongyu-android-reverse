.class public final synthetic Lcom/zykj/student/dialogue/ui/detail/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;

.field public final synthetic b:Lcom/zykj/view/board/play/SketchPlayFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Lcom/zykj/view/board/play/SketchPlayFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/c;->a:Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;

    iput-object p2, p0, Lcom/zykj/student/dialogue/ui/detail/c;->b:Lcom/zykj/view/board/play/SketchPlayFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/c;->a:Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;

    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/detail/c;->b:Lcom/zykj/view/board/play/SketchPlayFragment;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, v1, p1}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$loadMicroLesson$1$1$1;->n(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Lcom/zykj/view/board/play/SketchPlayFragment;Ljava/lang/Throwable;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
