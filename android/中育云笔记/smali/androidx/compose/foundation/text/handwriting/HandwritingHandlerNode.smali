.class final Landroidx/compose/foundation/text/handwriting/HandwritingHandlerNode;
.super Landroidx/compose/ui/Modifier$Node;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/focus/FocusEventModifierNode;


# instance fields
.field private final composeImm$delegate:Lqc/d;

.field private focusState:Landroidx/compose/ui/focus/FocusState;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/Modifier$Node;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->e:Lkotlin/LazyThreadSafetyMode;

    .line 5
    .line 6
    new-instance v1, Landroidx/compose/foundation/text/handwriting/HandwritingHandlerNode$composeImm$2;

    .line 7
    .line 8
    invoke-direct {v1, p0}, Landroidx/compose/foundation/text/handwriting/HandwritingHandlerNode$composeImm$2;-><init>(Landroidx/compose/foundation/text/handwriting/HandwritingHandlerNode;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/a;->b(Lkotlin/LazyThreadSafetyMode;Lhd/a;)Lqc/d;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Landroidx/compose/foundation/text/handwriting/HandwritingHandlerNode;->composeImm$delegate:Lqc/d;

    .line 16
    .line 17
    return-void
.end method

.method public static final synthetic access$getComposeImm(Landroidx/compose/foundation/text/handwriting/HandwritingHandlerNode;)Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/foundation/text/handwriting/HandwritingHandlerNode;->getComposeImm()Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final getComposeImm()Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/handwriting/HandwritingHandlerNode;->composeImm$delegate:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public onFocusEvent(Landroidx/compose/ui/focus/FocusState;)V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/handwriting/HandwritingHandlerNode;->focusState:Landroidx/compose/ui/focus/FocusState;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, Landroidx/compose/foundation/text/handwriting/HandwritingHandlerNode;->focusState:Landroidx/compose/ui/focus/FocusState;

    .line 10
    .line 11
    invoke-interface {p1}, Landroidx/compose/ui/focus/FocusState;->getHasFocus()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getCoroutineScope()Lsd/i0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v3, Landroidx/compose/foundation/text/handwriting/HandwritingHandlerNode$onFocusEvent$1;

    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    invoke-direct {v3, p0, p1}, Landroidx/compose/foundation/text/handwriting/HandwritingHandlerNode$onFocusEvent$1;-><init>(Landroidx/compose/foundation/text/handwriting/HandwritingHandlerNode;Lvc/c;)V

    .line 25
    .line 26
    .line 27
    const/4 v4, 0x3

    .line 28
    const/4 v5, 0x0

    .line 29
    const/4 v1, 0x0

    .line 30
    const/4 v2, 0x0

    .line 31
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void
.end method
