.class final Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$pressIndicator$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text/ClickableTextKt;->ClickableText-4YKlhWE(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;ZIILhd/l;Lhd/l;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $layoutResult:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/compose/ui/text/TextLayoutResult;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onClick:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/compose/runtime/MutableState;Lhd/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Landroidx/compose/ui/text/TextLayoutResult;",
            ">;",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$pressIndicator$1$1;->$layoutResult:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$pressIndicator$1$1;->$onClick:Lhd/l;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Landroidx/compose/ui/input/pointer/PointerInputScope;Lvc/c;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/pointer/PointerInputScope;",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v4, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$pressIndicator$1$1$1;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$pressIndicator$1$1;->$layoutResult:Landroidx/compose/runtime/MutableState;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$pressIndicator$1$1;->$onClick:Lhd/l;

    .line 6
    .line 7
    invoke-direct {v4, v0, v1}, Landroidx/compose/foundation/text/ClickableTextKt$ClickableText$pressIndicator$1$1$1;-><init>(Landroidx/compose/runtime/MutableState;Lhd/l;)V

    .line 8
    .line 9
    .line 10
    const/4 v6, 0x7

    .line 11
    const/4 v7, 0x0

    .line 12
    const/4 v1, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    move-object v0, p1

    .line 16
    move-object v5, p2

    .line 17
    invoke-static/range {v0 .. v7}, Landroidx/compose/foundation/gestures/TapGestureDetectorKt;->detectTapGestures$default(Landroidx/compose/ui/input/pointer/PointerInputScope;Lhd/l;Lhd/l;Lhd/q;Lhd/l;Lvc/c;ILjava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    if-ne p1, p2, :cond_0

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 29
    .line 30
    return-object p1
.end method
