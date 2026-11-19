.class final Landroidx/compose/foundation/ScrollNode$applySemantics$accessibilityScrollState$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/ScrollNode;->applySemantics(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V
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
.field final synthetic this$0:Landroidx/compose/foundation/ScrollNode;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/ScrollNode;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/ScrollNode$applySemantics$accessibilityScrollState$2;->this$0:Landroidx/compose/foundation/ScrollNode;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Float;
    .locals 1

    .line 2
    iget-object v0, p0, Landroidx/compose/foundation/ScrollNode$applySemantics$accessibilityScrollState$2;->this$0:Landroidx/compose/foundation/ScrollNode;

    invoke-virtual {v0}, Landroidx/compose/foundation/ScrollNode;->getState()Landroidx/compose/foundation/ScrollState;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/foundation/ScrollState;->getMaxValue()I

    move-result v0

    int-to-float v0, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/ScrollNode$applySemantics$accessibilityScrollState$2;->invoke()Ljava/lang/Float;

    move-result-object v0

    return-object v0
.end method
