.class final Landroidx/compose/foundation/text/handwriting/HandwritingDetectorNode$pointerInputNode$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text/handwriting/HandwritingDetectorNode;-><init>(Lx7/a;)V
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
.field final synthetic this$0:Landroidx/compose/foundation/text/handwriting/HandwritingDetectorNode;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/text/handwriting/HandwritingDetectorNode;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/text/handwriting/HandwritingDetectorNode$pointerInputNode$1;->this$0:Landroidx/compose/foundation/text/handwriting/HandwritingDetectorNode;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/text/handwriting/HandwritingDetectorNode$pointerInputNode$1;->invoke()V

    sget-object v0, Lh7/p;->a:Lh7/p;

    return-object v0
.end method

.method public final invoke()V
    .locals 1

    .line 2
    iget-object v0, p0, Landroidx/compose/foundation/text/handwriting/HandwritingDetectorNode$pointerInputNode$1;->this$0:Landroidx/compose/foundation/text/handwriting/HandwritingDetectorNode;

    invoke-virtual {v0}, Landroidx/compose/foundation/text/handwriting/HandwritingDetectorNode;->getCallback()Lx7/a;

    move-result-object v0

    invoke-interface {v0}, Lx7/a;->invoke()Ljava/lang/Object;

    .line 3
    iget-object v0, p0, Landroidx/compose/foundation/text/handwriting/HandwritingDetectorNode$pointerInputNode$1;->this$0:Landroidx/compose/foundation/text/handwriting/HandwritingDetectorNode;

    invoke-static {v0}, Landroidx/compose/foundation/text/handwriting/HandwritingDetectorNode;->access$getComposeImm(Landroidx/compose/foundation/text/handwriting/HandwritingDetectorNode;)Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;

    move-result-object v0

    invoke-interface {v0}, Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;->prepareStylusHandwritingDelegation()V

    return-void
.end method
