.class public final synthetic Lcom/zykj/student/dialogue/ui/detail/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;

.field public final synthetic b:Lcom/zykj/view/board/play/SketchPlayFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Lcom/zykj/view/board/play/SketchPlayFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/i;->a:Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;

    iput-object p2, p0, Lcom/zykj/student/dialogue/ui/detail/i;->b:Lcom/zykj/view/board/play/SketchPlayFragment;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/i;->a:Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;

    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/detail/i;->b:Lcom/zykj/view/board/play/SketchPlayFragment;

    invoke-static {v0, v1}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$loadMicroLesson$1$1$1;->g(Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;Lcom/zykj/view/board/play/SketchPlayFragment;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
