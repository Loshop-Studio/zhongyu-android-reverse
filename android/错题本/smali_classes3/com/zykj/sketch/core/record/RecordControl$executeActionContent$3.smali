.class final Lcom/zykj/sketch/core/record/RecordControl$executeActionContent$3;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/sketch/core/record/RecordControl;->executeActionContent(ILjava/util/List;Lr6/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lr6/c;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lcom/zykj/sketch/core/listener/ViewControl;",
        "viewControl",
        "Ld6/s;",
        "invoke",
        "(Lcom/zykj/sketch/core/listener/ViewControl;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field final synthetic $viewBack:Lr6/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/c;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/zykj/sketch/core/record/RecordControl;


# direct methods
.method public constructor <init>(Lcom/zykj/sketch/core/record/RecordControl;Lr6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/sketch/core/record/RecordControl;",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/core/record/RecordControl$executeActionContent$3;->this$0:Lcom/zykj/sketch/core/record/RecordControl;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/sketch/core/record/RecordControl$executeActionContent$3;->$viewBack:Lr6/c;

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

    sget-object p1, Ld6/s;->a:Ld6/s;

    return-object p1
.end method

.method public final invoke(Lcom/zykj/sketch/core/listener/ViewControl;)V
    .locals 1
    .param p1    # Lcom/zykj/sketch/core/listener/ViewControl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewControl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/zykj/sketch/core/record/RecordControl$executeActionContent$3;->this$0:Lcom/zykj/sketch/core/record/RecordControl;

    invoke-static {v0}, Lcom/zykj/sketch/core/record/RecordControl;->access$getActionExecute$p(Lcom/zykj/sketch/core/record/RecordControl;)Lcom/zykj/sketch/core/ActionRecordExecute;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/zykj/sketch/core/ActionExecute;->addViewControl(Lcom/zykj/sketch/core/listener/ViewControl;)V

    .line 3
    iget-object v0, p0, Lcom/zykj/sketch/core/record/RecordControl$executeActionContent$3;->$viewBack:Lr6/c;

    invoke-interface {v0, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
