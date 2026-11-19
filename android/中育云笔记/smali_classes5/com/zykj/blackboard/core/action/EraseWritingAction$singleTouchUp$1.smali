.class final Lcom/zykj/blackboard/core/action/EraseWritingAction$singleTouchUp$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/action/EraseWritingAction;->H(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lhd/a;"
    }
.end annotation


# instance fields
.field public final synthetic c:Lcom/zykj/blackboard/core/action/EraseWritingAction;

.field public final synthetic d:Lcom/zykj/board/EzyTouchEvent$TouchEvent;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/action/EraseWritingAction;Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction$singleTouchUp$1;->c:Lcom/zykj/blackboard/core/action/EraseWritingAction;

    iput-object p2, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction$singleTouchUp$1;->d:Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/EraseWritingAction$singleTouchUp$1;->invoke()V

    sget-object v0, Lqc/q;->a:Lqc/q;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction$singleTouchUp$1;->c:Lcom/zykj/blackboard/core/action/EraseWritingAction;

    iget-object v1, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction$singleTouchUp$1;->d:Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    invoke-static {v0, v1}, Lcom/zykj/blackboard/core/action/EraseWritingAction;->I(Lcom/zykj/blackboard/core/action/EraseWritingAction;Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    return-void
.end method
