.class final Lcom/zykj/blackboard/core/action/EraseWritingAction$singleTouchDown$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/action/EraseWritingAction;->singleTouchDown(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lx7/a;"
    }
.end annotation


# instance fields
.field final synthetic $event:Lcom/zykj/board/EzyTouchEvent$TouchEvent;

.field final synthetic this$0:Lcom/zykj/blackboard/core/action/EraseWritingAction;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/action/EraseWritingAction;Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction$singleTouchDown$1;->this$0:Lcom/zykj/blackboard/core/action/EraseWritingAction;

    iput-object p2, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction$singleTouchDown$1;->$event:Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/action/EraseWritingAction$singleTouchDown$1;->invoke()V

    sget-object v0, Lh7/p;->a:Lh7/p;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 2
    sget-object v0, Lcom/zykj/blackboard/utils/EventBus;->INSTANCE:Lcom/zykj/blackboard/utils/EventBus;

    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->TEXT_ACTION_SELECTED_CANCEL:Lcom/zykj/blackboard/utils/EventKey;

    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/utils/EventBus;->post(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 3
    sget-object v1, Lcom/zykj/blackboard/utils/EventKey;->SELECT_ACTION_SELECTED_CANCEL:Lcom/zykj/blackboard/utils/EventKey;

    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/utils/EventBus;->post(Lcom/zykj/blackboard/utils/EventKey;)V

    .line 4
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction$singleTouchDown$1;->this$0:Lcom/zykj/blackboard/core/action/EraseWritingAction;

    iget-object v1, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction$singleTouchDown$1;->$event:Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    invoke-static {v0, v1}, Lcom/zykj/blackboard/core/action/EraseWritingAction;->access$drawDeleteCircle(Lcom/zykj/blackboard/core/action/EraseWritingAction;Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    .line 5
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction$singleTouchDown$1;->this$0:Lcom/zykj/blackboard/core/action/EraseWritingAction;

    iget-object v1, p0, Lcom/zykj/blackboard/core/action/EraseWritingAction$singleTouchDown$1;->$event:Lcom/zykj/board/EzyTouchEvent$TouchEvent;

    invoke-static {v0, v1}, Lcom/zykj/blackboard/core/action/EraseWritingAction;->access$deleteGraph(Lcom/zykj/blackboard/core/action/EraseWritingAction;Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V

    return-void
.end method
