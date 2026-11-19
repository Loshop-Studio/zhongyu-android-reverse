.class final Lcom/zykj/blackboard/core/edit/PageControl$save$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/edit/PageControl;->save()V
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
.field final synthetic this$0:Lcom/zykj/blackboard/core/edit/PageControl;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/edit/PageControl;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/blackboard/core/edit/PageControl$save$1;->this$0:Lcom/zykj/blackboard/core/edit/PageControl;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Landroid/graphics/Bitmap;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/PageControl$save$1;->this$0:Lcom/zykj/blackboard/core/edit/PageControl;

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->getGraphControl()Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    move-result-object v0

    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->screenshot()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/PageControl$save$1;->invoke()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method
