.class final Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1;->showTextToolbar(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/geometry/Rect;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lxc/d;
    c = "androidx.compose.foundation.text.BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1"
    f = "BasicTextField.kt"
    l = {
        0x141
    }
    m = "showTextToolbar"
.end annotation


# instance fields
.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field L$2:Ljava/lang/Object;

.field L$3:Ljava/lang/Object;

.field L$4:Ljava/lang/Object;

.field L$5:Ljava/lang/Object;

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1;Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1;",
            "Lvc/c<",
            "-",
            "Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1;->this$0:Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lvc/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1;->result:Ljava/lang/Object;

    iget p1, p0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1;->label:I

    iget-object p1, p0, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1$showTextToolbar$1;->this$0:Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Landroidx/compose/foundation/text/BasicTextFieldKt$BasicTextField$textToolbarHandler$1$1;->showTextToolbar(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/geometry/Rect;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
