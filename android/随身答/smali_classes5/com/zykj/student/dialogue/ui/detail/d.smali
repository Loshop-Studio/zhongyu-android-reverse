.class public final synthetic Lcom/zykj/student/dialogue/ui/detail/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/view/board/play/SketchPlayFragment;

.field public final synthetic b:Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/play/SketchPlayFragment;Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/detail/d;->a:Lcom/zykj/view/board/play/SketchPlayFragment;

    iput-object p2, p0, Lcom/zykj/student/dialogue/ui/detail/d;->b:Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;

    iput p3, p0, Lcom/zykj/student/dialogue/ui/detail/d;->c:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/detail/d;->a:Lcom/zykj/view/board/play/SketchPlayFragment;

    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/detail/d;->b:Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;

    iget v2, p0, Lcom/zykj/student/dialogue/ui/detail/d;->c:I

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, v1, v2, p1}, Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment$loadMicroLesson$1$1$1;->t(Lcom/zykj/view/board/play/SketchPlayFragment;Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;IZ)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
