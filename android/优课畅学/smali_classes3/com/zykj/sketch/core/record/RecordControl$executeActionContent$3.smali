.class final Lcom/zykj/sketch/core/record/RecordControl$executeActionContent$3;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/sketch/core/record/RecordControl;->executeActionContent(ILjava/util/List;Lx7/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lx7/l;"
    }
.end annotation


# instance fields
.field final synthetic $viewBack:Lx7/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx7/l;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/zykj/sketch/core/record/RecordControl;


# direct methods
.method public constructor <init>(Lcom/zykj/sketch/core/record/RecordControl;Lx7/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/sketch/core/record/RecordControl;",
            "Lx7/l;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/core/record/RecordControl$executeActionContent$3;->this$0:Lcom/zykj/sketch/core/record/RecordControl;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/sketch/core/record/RecordControl$executeActionContent$3;->$viewBack:Lx7/l;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/sketch/core/listener/ViewControl;

    invoke-virtual {p0, p1}, Lcom/zykj/sketch/core/record/RecordControl$executeActionContent$3;->invoke(Lcom/zykj/sketch/core/listener/ViewControl;)V

    sget-object p1, Lh7/p;->a:Lh7/p;

    return-object p1
.end method

.method public final invoke(Lcom/zykj/sketch/core/listener/ViewControl;)V
    .locals 1

    const-string v0, "viewControl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/zykj/sketch/core/record/RecordControl$executeActionContent$3;->this$0:Lcom/zykj/sketch/core/record/RecordControl;

    invoke-static {v0}, Lcom/zykj/sketch/core/record/RecordControl;->access$getActionExecute$p(Lcom/zykj/sketch/core/record/RecordControl;)Lcom/zykj/sketch/core/ActionRecordExecute;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/zykj/sketch/core/ActionExecute;->addViewControl(Lcom/zykj/sketch/core/listener/ViewControl;)V

    .line 3
    iget-object v0, p0, Lcom/zykj/sketch/core/record/RecordControl$executeActionContent$3;->$viewBack:Lx7/l;

    invoke-interface {v0, p1}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
