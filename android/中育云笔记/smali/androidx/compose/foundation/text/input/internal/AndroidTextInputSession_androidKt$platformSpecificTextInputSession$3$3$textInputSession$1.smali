.class public final Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/foundation/text/input/internal/TextInputSession;
.implements Landroidx/compose/foundation/text/input/internal/ImeEditCommandScope;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final synthetic $$delegate_0:Landroidx/compose/foundation/text/input/internal/DefaultImeEditCommandScope;

.field final synthetic $composeImm:Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;

.field final synthetic $cursorUpdatesController:Landroidx/compose/foundation/text/input/internal/CursorAnchorInfoController;

.field final synthetic $layoutState:Landroidx/compose/foundation/text/input/internal/TextLayoutState;

.field final synthetic $onImeAction:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field final synthetic $receiveContentConfiguration:Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;

.field final synthetic $state:Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;

.field final synthetic $updateSelectionState:Lhd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/a;"
        }
    .end annotation
.end field

.field final synthetic $viewConfiguration:Landroidx/compose/ui/platform/ViewConfiguration;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/text/input/internal/DefaultImeEditCommandScope;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;Lhd/l;Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;Landroidx/compose/foundation/text/input/internal/CursorAnchorInfoController;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Lhd/a;Landroidx/compose/ui/platform/ViewConfiguration;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text/input/internal/DefaultImeEditCommandScope;",
            "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;",
            "Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;",
            "Lhd/l;",
            "Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;",
            "Landroidx/compose/foundation/text/input/internal/CursorAnchorInfoController;",
            "Landroidx/compose/foundation/text/input/internal/TextLayoutState;",
            "Lhd/a;",
            "Landroidx/compose/ui/platform/ViewConfiguration;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p2, p0, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1;->$state:Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;

    .line 2
    .line 3
    iput-object p3, p0, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1;->$composeImm:Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;

    .line 4
    .line 5
    iput-object p4, p0, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1;->$onImeAction:Lhd/l;

    .line 6
    .line 7
    iput-object p5, p0, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1;->$receiveContentConfiguration:Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;

    .line 8
    .line 9
    iput-object p6, p0, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1;->$cursorUpdatesController:Landroidx/compose/foundation/text/input/internal/CursorAnchorInfoController;

    .line 10
    .line 11
    iput-object p7, p0, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1;->$layoutState:Landroidx/compose/foundation/text/input/internal/TextLayoutState;

    .line 12
    .line 13
    iput-object p8, p0, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1;->$updateSelectionState:Lhd/a;

    .line 14
    .line 15
    iput-object p9, p0, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1;->$viewConfiguration:Landroidx/compose/ui/platform/ViewConfiguration;

    .line 16
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1;->$$delegate_0:Landroidx/compose/foundation/text/input/internal/DefaultImeEditCommandScope;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public beginBatchEdit()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1;->$$delegate_0:Landroidx/compose/foundation/text/input/internal/DefaultImeEditCommandScope;

    invoke-virtual {v0}, Landroidx/compose/foundation/text/input/internal/DefaultImeEditCommandScope;->beginBatchEdit()Z

    move-result v0

    return v0
.end method

.method public edit(Lhd/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1;->$$delegate_0:Landroidx/compose/foundation/text/input/internal/DefaultImeEditCommandScope;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/compose/foundation/text/input/internal/DefaultImeEditCommandScope;->edit(Lhd/l;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public endBatchEdit()Z
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1;->$$delegate_0:Landroidx/compose/foundation/text/input/internal/DefaultImeEditCommandScope;

    invoke-virtual {v0}, Landroidx/compose/foundation/text/input/internal/DefaultImeEditCommandScope;->endBatchEdit()Z

    move-result v0

    return v0
.end method

.method public getText()Landroidx/compose/foundation/text/input/TextFieldCharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1;->$state:Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->getVisualText()Landroidx/compose/foundation/text/input/TextFieldCharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public mapFromTransformed-GEjPoXI(J)J
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1;->$$delegate_0:Landroidx/compose/foundation/text/input/internal/DefaultImeEditCommandScope;

    invoke-virtual {v0, p1, p2}, Landroidx/compose/foundation/text/input/internal/DefaultImeEditCommandScope;->mapFromTransformed-GEjPoXI(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public mapToTransformed-GEjPoXI(J)J
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1;->$$delegate_0:Landroidx/compose/foundation/text/input/internal/DefaultImeEditCommandScope;

    invoke-virtual {v0, p1, p2}, Landroidx/compose/foundation/text/input/internal/DefaultImeEditCommandScope;->mapToTransformed-GEjPoXI(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public onCommitContent(Landroidx/compose/foundation/content/TransferableContent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1;->$receiveContentConfiguration:Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;->onCommitContent(Landroidx/compose/foundation/content/TransferableContent;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    return p1
.end method

.method public onImeAction-KlQnJC8(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1;->$onImeAction:Lhd/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Landroidx/compose/ui/text/input/ImeAction;->box-impl(I)Landroidx/compose/ui/text/input/ImeAction;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {v0, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public performHandwritingGesture(Landroid/view/inputmethod/HandwritingGesture;)I
    .locals 8

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    sget-object v2, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->INSTANCE:Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;

    .line 8
    .line 9
    iget-object v3, p0, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1;->$state:Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;

    .line 10
    .line 11
    iget-object v5, p0, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1;->$layoutState:Landroidx/compose/foundation/text/input/internal/TextLayoutState;

    .line 12
    .line 13
    iget-object v6, p0, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1;->$updateSelectionState:Lhd/a;

    .line 14
    .line 15
    iget-object v7, p0, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1;->$viewConfiguration:Landroidx/compose/ui/platform/ViewConfiguration;

    .line 16
    .line 17
    move-object v4, p1

    .line 18
    invoke-virtual/range {v2 .. v7}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->performHandwritingGesture$foundation_release(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/HandwritingGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Lhd/a;Landroidx/compose/ui/platform/ViewConfiguration;)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    return p1

    .line 23
    :cond_0
    const/4 p1, 0x2

    .line 24
    return p1
.end method

.method public previewHandwritingGesture(Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroid/os/CancellationSignal;)Z
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    sget-object v0, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->INSTANCE:Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1;->$state:Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;

    .line 10
    .line 11
    iget-object v2, p0, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1;->$layoutState:Landroidx/compose/foundation/text/input/internal/TextLayoutState;

    .line 12
    .line 13
    invoke-virtual {v0, v1, p1, v2, p2}, Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;->previewHandwritingGesture$foundation_release(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroid/os/CancellationSignal;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    return p1
.end method

.method public requestCursorUpdates(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1;->$cursorUpdatesController:Landroidx/compose/foundation/text/input/internal/CursorAnchorInfoController;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/compose/foundation/text/input/internal/CursorAnchorInfoController;->requestUpdates(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public sendKeyEvent(Landroid/view/KeyEvent;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1;->$composeImm:Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;->sendKeyEvent(Landroid/view/KeyEvent;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
