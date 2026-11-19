.class public final Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;
.super Landroidx/compose/ui/node/DelegatingNode;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/node/DrawModifierNode;
.implements Landroidx/compose/ui/platform/PlatformTextInputModifierNode;
.implements Landroidx/compose/ui/node/SemanticsModifierNode;
.implements Landroidx/compose/ui/focus/FocusRequesterModifierNode;
.implements Landroidx/compose/ui/focus/FocusEventModifierNode;
.implements Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;
.implements Landroidx/compose/ui/node/PointerInputModifierNode;
.implements Landroidx/compose/ui/input/key/KeyInputModifierNode;
.implements Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;
.implements Landroidx/compose/ui/modifier/ModifierLocalModifierNode;
.implements Landroidx/compose/ui/node/ObserverModifierNode;
.implements Landroidx/compose/ui/node/LayoutAwareModifierNode;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final autofillHighlightOn$delegate:Landroidx/compose/runtime/MutableState;

.field private final clipboardKeyCommandsHandler:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field private final dragAndDropNode:Landroidx/compose/ui/draganddrop/DragAndDropTargetModifierNode;

.field private dragEnterEvent:Landroidx/compose/foundation/interaction/HoverInteraction$Enter;

.field private enabled:Z

.field private filter:Landroidx/compose/foundation/text/input/InputTransformation;

.field private inputSessionJob:Lkotlinx/coroutines/g;

.field private interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

.field private isElementFocused:Z

.field private isPassword:Z

.field private keyboardActionHandler:Landroidx/compose/foundation/text/input/KeyboardActionHandler;

.field private final keyboardActionScope:Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$keyboardActionScope$1;

.field private keyboardOptions:Landroidx/compose/foundation/text/KeyboardOptions;

.field private final pointerInputNode:Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;

.field private readOnly:Z

.field private final receiveContentConfigurationProvider:Lhd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/a;"
        }
    .end annotation
.end field

.field private singleLine:Z

.field private stylusHandwritingTrigger:Lvd/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvd/k;"
        }
    .end annotation
.end field

.field private final textFieldKeyEventHandler:Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;

.field private textFieldSelectionState:Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;

.field private textFieldState:Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;

.field private textLayoutState:Landroidx/compose/foundation/text/input/internal/TextLayoutState;

.field private toolbarAndHandlesVisibilityObserverJob:Lkotlinx/coroutines/g;

.field private windowInfo:Landroidx/compose/ui/platform/WindowInfo;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text/input/InputTransformation;ZZLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLvd/k;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;",
            "Landroidx/compose/foundation/text/input/internal/TextLayoutState;",
            "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;",
            "Landroidx/compose/foundation/text/input/InputTransformation;",
            "ZZ",
            "Landroidx/compose/foundation/text/KeyboardOptions;",
            "Landroidx/compose/foundation/text/input/KeyboardActionHandler;",
            "Z",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Z",
            "Lvd/k;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/node/DelegatingNode;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->textFieldState:Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->textLayoutState:Landroidx/compose/foundation/text/input/internal/TextLayoutState;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->textFieldSelectionState:Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;

    .line 9
    .line 10
    iput-object p4, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->filter:Landroidx/compose/foundation/text/input/InputTransformation;

    .line 11
    .line 12
    iput-boolean p5, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->enabled:Z

    .line 13
    .line 14
    iput-boolean p6, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->readOnly:Z

    .line 15
    .line 16
    iput-object p7, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->keyboardOptions:Landroidx/compose/foundation/text/KeyboardOptions;

    .line 17
    .line 18
    iput-object p8, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->keyboardActionHandler:Landroidx/compose/foundation/text/input/KeyboardActionHandler;

    .line 19
    .line 20
    iput-boolean p9, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->singleLine:Z

    .line 21
    .line 22
    iput-object p10, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 23
    .line 24
    iput-boolean p11, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->isPassword:Z

    .line 25
    .line 26
    iput-object p12, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->stylusHandwritingTrigger:Lvd/k;

    .line 27
    .line 28
    new-instance p1, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$1;

    .line 29
    .line 30
    invoke-direct {p1, p0}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$1;-><init>(Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p3, p1}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;->setRequestAutofillAction(Lhd/a;)V

    .line 34
    .line 35
    .line 36
    new-instance p1, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$pointerInputNode$1;

    .line 37
    .line 38
    invoke-direct {p1, p0}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$pointerInputNode$1;-><init>(Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;)V

    .line 39
    .line 40
    .line 41
    invoke-static {p1}, Landroidx/compose/ui/input/pointer/SuspendingPointerInputFilterKt;->SuspendingPointerInputModifierNode(Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p0, p1}, Landroidx/compose/ui/node/DelegatingNode;->delegate(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/DelegatableNode;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    check-cast p1, Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;

    .line 50
    .line 51
    iput-object p1, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->pointerInputNode:Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;

    .line 52
    .line 53
    new-instance p2, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$dragAndDropNode$1;

    .line 54
    .line 55
    invoke-direct {p2, p0}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$dragAndDropNode$1;-><init>(Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;)V

    .line 56
    .line 57
    .line 58
    new-instance p3, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$dragAndDropNode$2;

    .line 59
    .line 60
    invoke-direct {p3, p0}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$dragAndDropNode$2;-><init>(Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;)V

    .line 61
    .line 62
    .line 63
    new-instance p4, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$dragAndDropNode$3;

    .line 64
    .line 65
    invoke-direct {p4, p0}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$dragAndDropNode$3;-><init>(Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;)V

    .line 66
    .line 67
    .line 68
    new-instance p6, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$dragAndDropNode$4;

    .line 69
    .line 70
    invoke-direct {p6, p0}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$dragAndDropNode$4;-><init>(Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;)V

    .line 71
    .line 72
    .line 73
    new-instance p7, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$dragAndDropNode$5;

    .line 74
    .line 75
    invoke-direct {p7, p0}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$dragAndDropNode$5;-><init>(Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;)V

    .line 76
    .line 77
    .line 78
    new-instance p9, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$dragAndDropNode$6;

    .line 79
    .line 80
    invoke-direct {p9, p0}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$dragAndDropNode$6;-><init>(Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;)V

    .line 81
    .line 82
    .line 83
    new-instance p10, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$dragAndDropNode$7;

    .line 84
    .line 85
    invoke-direct {p10, p0}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$dragAndDropNode$7;-><init>(Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;)V

    .line 86
    .line 87
    .line 88
    const/16 p11, 0x48

    .line 89
    .line 90
    const/4 p12, 0x0

    .line 91
    const/4 p5, 0x0

    .line 92
    const/4 p8, 0x0

    .line 93
    invoke-static/range {p2 .. p12}, Landroidx/compose/foundation/text/input/internal/TextFieldDragAndDropNode_androidKt;->textFieldDragAndDropNode$default(Lhd/a;Lhd/p;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;Lhd/l;ILjava/lang/Object;)Landroidx/compose/ui/draganddrop/DragAndDropTargetModifierNode;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {p0, p1}, Landroidx/compose/ui/node/DelegatingNode;->delegate(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/DelegatableNode;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    check-cast p1, Landroidx/compose/ui/draganddrop/DragAndDropTargetModifierNode;

    .line 102
    .line 103
    iput-object p1, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->dragAndDropNode:Landroidx/compose/ui/draganddrop/DragAndDropTargetModifierNode;

    .line 104
    .line 105
    invoke-static {}, Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler_androidKt;->createTextFieldKeyEventHandler()Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    iput-object p1, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->textFieldKeyEventHandler:Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;

    .line 110
    .line 111
    new-instance p1, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$keyboardActionScope$1;

    .line 112
    .line 113
    invoke-direct {p1, p0}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$keyboardActionScope$1;-><init>(Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;)V

    .line 114
    .line 115
    .line 116
    iput-object p1, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->keyboardActionScope:Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$keyboardActionScope$1;

    .line 117
    .line 118
    new-instance p1, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1;

    .line 119
    .line 120
    invoke-direct {p1, p0}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1;-><init>(Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;)V

    .line 121
    .line 122
    .line 123
    invoke-static {p1}, Landroidx/compose/foundation/text/input/internal/ClipboardKeyCommandsHandler;->constructor-impl(Lhd/l;)Lhd/l;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    iput-object p1, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->clipboardKeyCommandsHandler:Lhd/l;

    .line 128
    .line 129
    new-instance p1, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$receiveContentConfigurationProvider$1;

    .line 130
    .line 131
    invoke-direct {p1, p0}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$receiveContentConfigurationProvider$1;-><init>(Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;)V

    .line 132
    .line 133
    .line 134
    iput-object p1, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->receiveContentConfigurationProvider:Lhd/a;

    .line 135
    .line 136
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 137
    .line 138
    const/4 p2, 0x0

    .line 139
    const/4 p3, 0x2

    .line 140
    invoke-static {p1, p2, p3, p2}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    iput-object p1, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->autofillHighlightOn$delegate:Landroidx/compose/runtime/MutableState;

    .line 145
    .line 146
    return-void
.end method

.method public static final synthetic access$emitDragExitEvent(Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->emitDragExitEvent()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getInputSessionJob$p(Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;)Lkotlinx/coroutines/g;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->inputSessionJob:Lkotlinx/coroutines/g;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getKeyboardActionScope$p(Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;)Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$keyboardActionScope$1;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->keyboardActionScope:Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$keyboardActionScope$1;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$isFocused(Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->isFocused()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$observeUntransformedTextChanges(Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->observeUntransformedTextChanges(Lvc/c;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$onFocusChange(Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->onFocusChange()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$onImeActionPerformed-KlQnJC8(Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->onImeActionPerformed-KlQnJC8(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$requireKeyboardController(Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;)Landroidx/compose/ui/platform/SoftwareKeyboardController;
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->requireKeyboardController()Landroidx/compose/ui/platform/SoftwareKeyboardController;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$setAutofillHighlightOn(Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->setAutofillHighlightOn(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$setDragEnterEvent$p(Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;Landroidx/compose/foundation/interaction/HoverInteraction$Enter;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->dragEnterEvent:Landroidx/compose/foundation/interaction/HoverInteraction$Enter;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$setWindowInfo$p(Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;Landroidx/compose/ui/platform/WindowInfo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->windowInfo:Landroidx/compose/ui/platform/WindowInfo;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic access$startInputSession(Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->startInputSession(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final disposeInputSession()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->inputSessionJob:Lkotlinx/coroutines/g;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/g$a;->a(Lkotlinx/coroutines/g;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iput-object v1, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->inputSessionJob:Lkotlinx/coroutines/g;

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->stylusHandwritingTrigger:Lvd/k;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-interface {v0}, Lvd/k;->f()V

    .line 17
    .line 18
    .line 19
    :cond_1
    return-void
.end method

.method private final emitDragExitEvent()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->dragEnterEvent:Landroidx/compose/foundation/interaction/HoverInteraction$Enter;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 6
    .line 7
    new-instance v2, Landroidx/compose/foundation/interaction/HoverInteraction$Exit;

    .line 8
    .line 9
    invoke-direct {v2, v0}, Landroidx/compose/foundation/interaction/HoverInteraction$Exit;-><init>(Landroidx/compose/foundation/interaction/HoverInteraction$Enter;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {v1, v2}, Landroidx/compose/foundation/interaction/MutableInteractionSource;->tryEmit(Landroidx/compose/foundation/interaction/Interaction;)Z

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-object v0, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->dragEnterEvent:Landroidx/compose/foundation/interaction/HoverInteraction$Enter;

    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method private final getAutofillHighlightOn()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->autofillHighlightOn$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method private final isFocused()Z
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->windowInfo:Landroidx/compose/ui/platform/WindowInfo;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, Landroidx/compose/ui/platform/WindowInfo;->isWindowFocused()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-ne v0, v2, :cond_0

    .line 12
    .line 13
    move v0, v2

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v0, v1

    .line 16
    :goto_0
    iget-boolean v3, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->isElementFocused:Z

    .line 17
    .line 18
    if-eqz v3, :cond_1

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    return v2

    .line 23
    :cond_1
    return v1
.end method

.method private final observeUntransformedTextChanges(Lvc/c;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvc/c<",
            "-",
            "Lqc/q;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$observeUntransformedTextChanges$2;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$observeUntransformedTextChanges$2;-><init>(Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Landroidx/compose/runtime/SnapshotStateKt;->snapshotFlow(Lhd/a;)Lvd/c;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-static {v0, v1}, Lvd/e;->q(Lvd/c;I)Lvd/c;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0, v1}, Lvd/e;->R(Lvd/c;I)Lvd/c;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$observeUntransformedTextChanges$3;

    .line 20
    .line 21
    invoke-direct {v1, p0}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$observeUntransformedTextChanges$3;-><init>(Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v0, v1, p1}, Lvd/c;->collect(Lvd/d;Lvc/c;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-ne p1, v0, :cond_0

    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_0
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 36
    .line 37
    return-object p1
.end method

.method private final onFocusChange()V
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->textFieldSelectionState:Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->isFocused()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {v0, v1}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;->setFocused(Z)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->isFocused()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->toolbarAndHandlesVisibilityObserverJob:Lkotlinx/coroutines/g;

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getCoroutineScope()Lsd/i0;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    new-instance v5, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$onFocusChange$1;

    .line 26
    .line 27
    invoke-direct {v5, p0, v1}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$onFocusChange$1;-><init>(Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;Lvc/c;)V

    .line 28
    .line 29
    .line 30
    const/4 v6, 0x3

    .line 31
    const/4 v7, 0x0

    .line 32
    const/4 v3, 0x0

    .line 33
    const/4 v4, 0x0

    .line 34
    invoke-static/range {v2 .. v7}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object v0, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->toolbarAndHandlesVisibilityObserverJob:Lkotlinx/coroutines/g;

    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    invoke-direct {p0}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->isFocused()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_2

    .line 46
    .line 47
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->toolbarAndHandlesVisibilityObserverJob:Lkotlinx/coroutines/g;

    .line 48
    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    const/4 v2, 0x1

    .line 52
    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/g$a;->a(Lkotlinx/coroutines/g;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    iput-object v1, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->toolbarAndHandlesVisibilityObserverJob:Lkotlinx/coroutines/g;

    .line 56
    .line 57
    :cond_2
    return-void
.end method

.method private final onImeActionPerformed-KlQnJC8(I)V
    .locals 2

    .line 1
    sget-object v0, Landroidx/compose/ui/text/input/ImeAction;->Companion:Landroidx/compose/ui/text/input/ImeAction$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/text/input/ImeAction$Companion;->getNone-eUduSuo()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {p1, v1}, Landroidx/compose/ui/text/input/ImeAction;->equals-impl0(II)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_2

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/compose/ui/text/input/ImeAction$Companion;->getDefault-eUduSuo()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-static {p1, v0}, Landroidx/compose/ui/text/input/ImeAction;->equals-impl0(II)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->keyboardActionHandler:Landroidx/compose/foundation/text/input/KeyboardActionHandler;

    .line 24
    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    if-eqz v0, :cond_1

    .line 29
    .line 30
    new-instance v1, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$onImeActionPerformed$1;

    .line 31
    .line 32
    invoke-direct {v1, p0, p1}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$onImeActionPerformed$1;-><init>(Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;I)V

    .line 33
    .line 34
    .line 35
    invoke-interface {v0, v1}, Landroidx/compose/foundation/text/input/KeyboardActionHandler;->onKeyboardAction(Lhd/a;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    return-void

    .line 39
    :cond_2
    :goto_0
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->keyboardActionScope:Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$keyboardActionScope$1;

    .line 40
    .line 41
    invoke-virtual {v0, p1}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$keyboardActionScope$1;->defaultKeyboardAction-KlQnJC8(I)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method private final requireKeyboardController()Landroidx/compose/ui/platform/SoftwareKeyboardController;
    .locals 2

    .line 1
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalSoftwareKeyboardController()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0, v0}, Landroidx/compose/ui/node/CompositionLocalConsumerModifierNodeKt;->currentValueOf(Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroidx/compose/ui/platform/SoftwareKeyboardController;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    const-string v1, "No software keyboard controller"

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw v0
.end method

.method private final setAutofillHighlightOn(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->autofillHighlightOn$delegate:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private final startInputSession(Z)V
    .locals 6

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->keyboardOptions:Landroidx/compose/foundation/text/KeyboardOptions;

    .line 4
    .line 5
    invoke-virtual {p1}, Landroidx/compose/foundation/text/KeyboardOptions;->getShowKeyboardOnFocusOrDefault$foundation_release()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-static {p0}, Landroidx/compose/foundation/content/internal/ReceiveContentConfigurationKt;->getReceiveContentConfiguration(Landroidx/compose/ui/modifier/ModifierLocalModifierNode;)Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p0}, Landroidx/compose/ui/Modifier$Node;->getCoroutineScope()Lsd/i0;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v3, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$startInputSession$1;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-direct {v3, p0, p1, v1}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$startInputSession$1;-><init>(Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;Lvc/c;)V

    .line 24
    .line 25
    .line 26
    const/4 v4, 0x3

    .line 27
    const/4 v5, 0x0

    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-static/range {v0 .. v5}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->inputSessionJob:Lkotlinx/coroutines/g;

    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public applySemantics(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V
    .locals 12

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->textFieldState:Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->getOutputText()Landroidx/compose/foundation/text/input/TextFieldCharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroidx/compose/foundation/text/input/TextFieldCharSequence;->getSelection-d9O1mEE()J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    new-instance v3, Landroidx/compose/ui/text/AnnotatedString;

    .line 12
    .line 13
    iget-object v4, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->textFieldState:Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;

    .line 14
    .line 15
    invoke-virtual {v4}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->getUntransformedText()Landroidx/compose/foundation/text/input/TextFieldCharSequence;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-virtual {v4}, Landroidx/compose/foundation/text/input/TextFieldCharSequence;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    const/4 v5, 0x0

    .line 24
    const/4 v6, 0x2

    .line 25
    invoke-direct {v3, v4, v5, v6, v5}, Landroidx/compose/ui/text/AnnotatedString;-><init>(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/n;)V

    .line 26
    .line 27
    .line 28
    invoke-static {p1, v3}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->setInputText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/text/AnnotatedString;)V

    .line 29
    .line 30
    .line 31
    new-instance v3, Landroidx/compose/ui/text/AnnotatedString;

    .line 32
    .line 33
    invoke-virtual {v0}, Landroidx/compose/foundation/text/input/TextFieldCharSequence;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-direct {v3, v0, v5, v6, v5}, Landroidx/compose/ui/text/AnnotatedString;-><init>(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/n;)V

    .line 38
    .line 39
    .line 40
    invoke-static {p1, v3}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->setEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/text/AnnotatedString;)V

    .line 41
    .line 42
    .line 43
    invoke-static {p1, v1, v2}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->setTextSelectionRange-FDrldGo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;J)V

    .line 44
    .line 45
    .line 46
    iget-boolean v0, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->enabled:Z

    .line 47
    .line 48
    if-nez v0, :cond_0

    .line 49
    .line 50
    invoke-static {p1}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->disabled(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V

    .line 51
    .line 52
    .line 53
    :cond_0
    iget-boolean v0, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->isPassword:Z

    .line 54
    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    invoke-static {p1}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->password(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V

    .line 58
    .line 59
    .line 60
    :cond_1
    iget-boolean v0, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->enabled:Z

    .line 61
    .line 62
    const/4 v3, 0x1

    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    iget-boolean v0, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->readOnly:Z

    .line 66
    .line 67
    if-nez v0, :cond_2

    .line 68
    .line 69
    move v0, v3

    .line 70
    goto :goto_0

    .line 71
    :cond_2
    const/4 v0, 0x0

    .line 72
    :goto_0
    invoke-static {p1, v0}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->setEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Z)V

    .line 73
    .line 74
    .line 75
    sget-object v4, Landroidx/compose/ui/autofill/ContentDataType;->Companion:Landroidx/compose/ui/autofill/ContentDataType$Companion;

    .line 76
    .line 77
    invoke-virtual {v4}, Landroidx/compose/ui/autofill/ContentDataType$Companion;->getText()Landroidx/compose/ui/autofill/ContentDataType;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-static {p1, v4}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->setContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/compose/ui/autofill/ContentDataType;)V

    .line 82
    .line 83
    .line 84
    new-instance v4, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$applySemantics$1;

    .line 85
    .line 86
    invoke-direct {v4, v0, p0}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$applySemantics$1;-><init>(ZLandroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;)V

    .line 87
    .line 88
    .line 89
    invoke-static {p1, v5, v4, v3, v5}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->onAutofillText$default(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lhd/l;ILjava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    new-instance v4, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$applySemantics$2;

    .line 93
    .line 94
    invoke-direct {v4, p0}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$applySemantics$2;-><init>(Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;)V

    .line 95
    .line 96
    .line 97
    invoke-static {p1, v5, v4, v3, v5}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->getTextLayoutResult$default(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lhd/l;ILjava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    if-eqz v0, :cond_3

    .line 101
    .line 102
    new-instance v4, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$applySemantics$3;

    .line 103
    .line 104
    invoke-direct {v4, v0, p0}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$applySemantics$3;-><init>(ZLandroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;)V

    .line 105
    .line 106
    .line 107
    invoke-static {p1, v5, v4, v3, v5}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->setText$default(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lhd/l;ILjava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    new-instance v4, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$applySemantics$4;

    .line 111
    .line 112
    invoke-direct {v4, v0, p0}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$applySemantics$4;-><init>(ZLandroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;)V

    .line 113
    .line 114
    .line 115
    invoke-static {p1, v5, v4, v3, v5}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->insertTextAtCursor$default(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lhd/l;ILjava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    :cond_3
    new-instance v4, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$applySemantics$5;

    .line 119
    .line 120
    invoke-direct {v4, p0}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$applySemantics$5;-><init>(Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;)V

    .line 121
    .line 122
    .line 123
    invoke-static {p1, v5, v4, v3, v5}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->setSelection$default(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lhd/q;ILjava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    iget-object v4, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->keyboardOptions:Landroidx/compose/foundation/text/KeyboardOptions;

    .line 127
    .line 128
    invoke-virtual {v4}, Landroidx/compose/foundation/text/KeyboardOptions;->getImeActionOrDefault-eUduSuo$foundation_release()I

    .line 129
    .line 130
    .line 131
    move-result v7

    .line 132
    new-instance v9, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$applySemantics$6;

    .line 133
    .line 134
    invoke-direct {v9, p0, v7}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$applySemantics$6;-><init>(Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;I)V

    .line 135
    .line 136
    .line 137
    const/4 v10, 0x2

    .line 138
    const/4 v11, 0x0

    .line 139
    const/4 v8, 0x0

    .line 140
    move-object v6, p1

    .line 141
    invoke-static/range {v6 .. v11}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->onImeAction-9UiTYpY$default(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;ILjava/lang/String;Lhd/a;ILjava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    new-instance p1, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$applySemantics$7;

    .line 145
    .line 146
    invoke-direct {p1, p0}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$applySemantics$7;-><init>(Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;)V

    .line 147
    .line 148
    .line 149
    invoke-static {v6, v5, p1, v3, v5}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->onClick$default(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lhd/a;ILjava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    new-instance p1, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$applySemantics$8;

    .line 153
    .line 154
    invoke-direct {p1, p0}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$applySemantics$8;-><init>(Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;)V

    .line 155
    .line 156
    .line 157
    invoke-static {v6, v5, p1, v3, v5}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->onLongClick$default(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lhd/a;ILjava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    invoke-static {v1, v2}, Landroidx/compose/ui/text/TextRange;->getCollapsed-impl(J)Z

    .line 161
    .line 162
    .line 163
    move-result p1

    .line 164
    if-nez p1, :cond_4

    .line 165
    .line 166
    iget-boolean p1, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->isPassword:Z

    .line 167
    .line 168
    if-nez p1, :cond_4

    .line 169
    .line 170
    new-instance p1, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$applySemantics$9;

    .line 171
    .line 172
    invoke-direct {p1, p0}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$applySemantics$9;-><init>(Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;)V

    .line 173
    .line 174
    .line 175
    invoke-static {v6, v5, p1, v3, v5}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->copyText$default(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lhd/a;ILjava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    iget-boolean p1, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->enabled:Z

    .line 179
    .line 180
    if-eqz p1, :cond_4

    .line 181
    .line 182
    iget-boolean p1, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->readOnly:Z

    .line 183
    .line 184
    if-nez p1, :cond_4

    .line 185
    .line 186
    new-instance p1, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$applySemantics$10;

    .line 187
    .line 188
    invoke-direct {p1, p0}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$applySemantics$10;-><init>(Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;)V

    .line 189
    .line 190
    .line 191
    invoke-static {v6, v5, p1, v3, v5}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->cutText$default(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lhd/a;ILjava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    :cond_4
    if-eqz v0, :cond_5

    .line 195
    .line 196
    new-instance p1, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$applySemantics$11;

    .line 197
    .line 198
    invoke-direct {p1, p0}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$applySemantics$11;-><init>(Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;)V

    .line 199
    .line 200
    .line 201
    invoke-static {v6, v5, p1, v3, v5}, Landroidx/compose/ui/semantics/SemanticsPropertiesKt;->pasteText$default(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Ljava/lang/String;Lhd/a;ILjava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    :cond_5
    iget-object p1, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->filter:Landroidx/compose/foundation/text/input/InputTransformation;

    .line 205
    .line 206
    if-eqz p1, :cond_6

    .line 207
    .line 208
    invoke-interface {p1, v6}, Landroidx/compose/foundation/text/input/InputTransformation;->applySemantics(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V

    .line 209
    .line 210
    .line 211
    :cond_6
    return-void
.end method

.method public draw(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V
    .locals 14

    .line 1
    invoke-interface {p1}, Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;->drawContent()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->getAutofillHighlightOn()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-static {}, Landroidx/compose/foundation/text/AutofillHighlightKt;->getLocalAutofillHighlightColor()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {p0, v0}, Landroidx/compose/ui/node/CompositionLocalConsumerModifierNodeKt;->currentValueOf(Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Landroidx/compose/ui/graphics/Color;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    .line 21
    .line 22
    .line 23
    move-result-wide v2

    .line 24
    const/16 v12, 0x7e

    .line 25
    .line 26
    const/4 v13, 0x0

    .line 27
    const-wide/16 v4, 0x0

    .line 28
    .line 29
    const-wide/16 v6, 0x0

    .line 30
    .line 31
    const/4 v8, 0x0

    .line 32
    const/4 v9, 0x0

    .line 33
    const/4 v10, 0x0

    .line 34
    const/4 v11, 0x0

    .line 35
    move-object v1, p1

    .line 36
    invoke-static/range {v1 .. v13}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->drawRect-n-J9OG0$default(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJJFLandroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/graphics/ColorFilter;IILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void
.end method

.method public final getEnabled()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->enabled:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getFilter()Landroidx/compose/foundation/text/input/InputTransformation;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->filter:Landroidx/compose/foundation/text/input/InputTransformation;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getKeyboardActionHandler()Landroidx/compose/foundation/text/input/KeyboardActionHandler;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->keyboardActionHandler:Landroidx/compose/foundation/text/input/KeyboardActionHandler;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getKeyboardOptions()Landroidx/compose/foundation/text/KeyboardOptions;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->keyboardOptions:Landroidx/compose/foundation/text/KeyboardOptions;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getReadOnly()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->readOnly:Z

    .line 2
    .line 3
    return v0
.end method

.method public getShouldMergeDescendantSemantics()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final getSingleLine()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->singleLine:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getStylusHandwritingTrigger()Lvd/k;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lvd/k;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->stylusHandwritingTrigger:Lvd/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTextFieldSelectionState()Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->textFieldSelectionState:Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTextFieldState()Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->textFieldState:Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTextLayoutState()Landroidx/compose/foundation/text/input/internal/TextLayoutState;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->textLayoutState:Landroidx/compose/foundation/text/input/internal/TextLayoutState;

    .line 2
    .line 3
    return-object v0
.end method

.method public final isPassword()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->isPassword:Z

    .line 2
    .line 3
    return v0
.end method

.method public onAttach()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->onObservedReadsChanged()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->textFieldSelectionState:Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;

    .line 5
    .line 6
    iget-object v1, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->receiveContentConfigurationProvider:Lhd/a;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;->setReceiveContentConfiguration(Lhd/a;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onCancelPointerInput()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->pointerInputNode:Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/ui/node/PointerInputModifierNode;->onCancelPointerInput()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onDetach()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->disposeInputSession()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->textFieldSelectionState:Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;->setReceiveContentConfiguration(Lhd/a;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public onFocusEvent(Landroidx/compose/ui/focus/FocusState;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->isElementFocused:Z

    .line 2
    .line 3
    invoke-interface {p1}, Landroidx/compose/ui/focus/FocusState;->isFocused()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    invoke-interface {p1}, Landroidx/compose/ui/focus/FocusState;->isFocused()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iput-boolean v0, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->isElementFocused:Z

    .line 15
    .line 16
    invoke-direct {p0}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->onFocusChange()V

    .line 17
    .line 18
    .line 19
    iget-boolean v0, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->enabled:Z

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    const/4 v2, 0x1

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    iget-boolean v0, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->readOnly:Z

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    move v0, v2

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move v0, v1

    .line 32
    :goto_0
    invoke-interface {p1}, Landroidx/compose/ui/focus/FocusState;->isFocused()Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_3

    .line 37
    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    invoke-direct {p0, v1}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->startInputSession(Z)V

    .line 41
    .line 42
    .line 43
    :cond_2
    :goto_1
    return-void

    .line 44
    :cond_3
    invoke-direct {p0}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->disposeInputSession()V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->textFieldState:Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;

    .line 48
    .line 49
    invoke-static {p1}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->access$getTextFieldState$p(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;)Landroidx/compose/foundation/text/input/TextFieldState;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-static {p1}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->access$getInputTransformation$p(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;)Landroidx/compose/foundation/text/input/InputTransformation;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    sget-object v3, Landroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;->MergeIfPossible:Landroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;

    .line 58
    .line 59
    invoke-virtual {v0}, Landroidx/compose/foundation/text/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text/input/TextFieldBuffer;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-virtual {v4}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->getChangeTracker$foundation_release()Landroidx/compose/foundation/text/input/internal/ChangeTracker;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-virtual {v4}, Landroidx/compose/foundation/text/input/internal/ChangeTracker;->clearChanges()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Landroidx/compose/foundation/text/input/TextFieldState;->getMainBuffer$foundation_release()Landroidx/compose/foundation/text/input/TextFieldBuffer;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-virtual {v4}, Landroidx/compose/foundation/text/input/TextFieldBuffer;->commitComposition$foundation_release()V

    .line 75
    .line 76
    .line 77
    invoke-static {p1, v4}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->access$updateWedgeAffinity(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/TextFieldBuffer;)V

    .line 78
    .line 79
    .line 80
    invoke-static {v0, v1, v2, v3}, Landroidx/compose/foundation/text/input/TextFieldState;->access$commitEditAsUser(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/foundation/text/input/InputTransformation;ZLandroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->textFieldState:Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;

    .line 84
    .line 85
    invoke-virtual {p1}, Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;->collapseSelectionToMax()V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public onGloballyPositioned(Landroidx/compose/ui/layout/LayoutCoordinates;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->textLayoutState:Landroidx/compose/foundation/text/input/internal/TextLayoutState;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/compose/foundation/text/input/internal/TextLayoutState;->setDecoratorNodeCoordinates(Landroidx/compose/ui/layout/LayoutCoordinates;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onKeyEvent-ZmokQxo(Landroid/view/KeyEvent;)Z
    .locals 9

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->textFieldKeyEventHandler:Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;

    .line 2
    .line 3
    iget-object v2, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->textFieldState:Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;

    .line 4
    .line 5
    iget-object v3, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->textLayoutState:Landroidx/compose/foundation/text/input/internal/TextLayoutState;

    .line 6
    .line 7
    iget-object v4, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->textFieldSelectionState:Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;

    .line 8
    .line 9
    iget-object v5, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->clipboardKeyCommandsHandler:Lhd/l;

    .line 10
    .line 11
    iget-boolean v1, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->enabled:Z

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-boolean v1, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->readOnly:Z

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    :goto_0
    move v6, v1

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    const/4 v1, 0x0

    .line 23
    goto :goto_0

    .line 24
    :goto_1
    iget-boolean v7, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->singleLine:Z

    .line 25
    .line 26
    new-instance v8, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$onKeyEvent$1;

    .line 27
    .line 28
    invoke-direct {v8, p0}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$onKeyEvent$1;-><init>(Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;)V

    .line 29
    .line 30
    .line 31
    move-object v1, p1

    .line 32
    invoke-virtual/range {v0 .. v8}, Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;->onKeyEvent-CJ9ybgU(Landroid/view/KeyEvent;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Lhd/l;ZZLhd/a;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    return p1
.end method

.method public onObservedReadsChanged()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$onObservedReadsChanged$1;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$onObservedReadsChanged$1;-><init>(Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Landroidx/compose/ui/node/ObserverModifierNodeKt;->observeReads(Landroidx/compose/ui/Modifier$Node;Lhd/a;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onPlaced(Landroidx/compose/ui/layout/LayoutCoordinates;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->dragAndDropNode:Landroidx/compose/ui/draganddrop/DragAndDropTargetModifierNode;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Landroidx/compose/ui/node/LayoutAwareModifierNode;->onPlaced(Landroidx/compose/ui/layout/LayoutCoordinates;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onPointerEvent-H0pRuoY(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->pointerInputNode:Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3, p4}, Landroidx/compose/ui/node/PointerInputModifierNode;->onPointerEvent-H0pRuoY(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onPreKeyEvent-ZmokQxo(Landroid/view/KeyEvent;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->textFieldKeyEventHandler:Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;

    .line 2
    .line 3
    iget-object v2, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->textFieldState:Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;

    .line 4
    .line 5
    iget-object v3, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->textFieldSelectionState:Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;

    .line 6
    .line 7
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalFocusManager()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {p0, v1}, Landroidx/compose/ui/node/CompositionLocalConsumerModifierNodeKt;->currentValueOf(Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    move-object v4, v1

    .line 16
    check-cast v4, Landroidx/compose/ui/focus/FocusManager;

    .line 17
    .line 18
    invoke-direct {p0}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->requireKeyboardController()Landroidx/compose/ui/platform/SoftwareKeyboardController;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    move-object v1, p1

    .line 23
    invoke-virtual/range {v0 .. v5}, Landroidx/compose/foundation/text/input/internal/TextFieldKeyEventHandler;->onPreKeyEvent-MyFupTE(Landroid/view/KeyEvent;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/focus/FocusManager;Landroidx/compose/ui/platform/SoftwareKeyboardController;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1
.end method

.method public onRemeasured-ozmzZPI(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->dragAndDropNode:Landroidx/compose/ui/draganddrop/DragAndDropTargetModifierNode;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Landroidx/compose/ui/node/LayoutAwareModifierNode;->onRemeasured-ozmzZPI(J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->enabled:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setFilter(Landroidx/compose/foundation/text/input/InputTransformation;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->filter:Landroidx/compose/foundation/text/input/InputTransformation;

    .line 2
    .line 3
    return-void
.end method

.method public final setInteractionSource(Landroidx/compose/foundation/interaction/MutableInteractionSource;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 2
    .line 3
    return-void
.end method

.method public final setKeyboardActionHandler(Landroidx/compose/foundation/text/input/KeyboardActionHandler;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->keyboardActionHandler:Landroidx/compose/foundation/text/input/KeyboardActionHandler;

    .line 2
    .line 3
    return-void
.end method

.method public final setKeyboardOptions(Landroidx/compose/foundation/text/KeyboardOptions;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->keyboardOptions:Landroidx/compose/foundation/text/KeyboardOptions;

    .line 2
    .line 3
    return-void
.end method

.method public final setPassword(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->isPassword:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setReadOnly(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->readOnly:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setSingleLine(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->singleLine:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setStylusHandwritingTrigger(Lvd/k;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvd/k;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->stylusHandwritingTrigger:Lvd/k;

    .line 2
    .line 3
    return-void
.end method

.method public final setTextFieldSelectionState(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->textFieldSelectionState:Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;

    .line 2
    .line 3
    return-void
.end method

.method public final setTextFieldState(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->textFieldState:Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;

    .line 2
    .line 3
    return-void
.end method

.method public final setTextLayoutState(Landroidx/compose/foundation/text/input/internal/TextLayoutState;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->textLayoutState:Landroidx/compose/foundation/text/input/internal/TextLayoutState;

    .line 2
    .line 3
    return-void
.end method

.method public final updateNode(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/foundation/text/input/InputTransformation;ZZLandroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;ZLvd/k;)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;",
            "Landroidx/compose/foundation/text/input/internal/TextLayoutState;",
            "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;",
            "Landroidx/compose/foundation/text/input/InputTransformation;",
            "ZZ",
            "Landroidx/compose/foundation/text/KeyboardOptions;",
            "Landroidx/compose/foundation/text/input/KeyboardActionHandler;",
            "Z",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Z",
            "Lvd/k;",
            ")V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move/from16 v3, p5

    .line 8
    .line 9
    move/from16 v4, p6

    .line 10
    .line 11
    move-object/from16 v5, p7

    .line 12
    .line 13
    move-object/from16 v6, p10

    .line 14
    .line 15
    move/from16 v7, p11

    .line 16
    .line 17
    move-object/from16 v8, p12

    .line 18
    .line 19
    iget-boolean v9, v0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->enabled:Z

    .line 20
    .line 21
    if-eqz v9, :cond_0

    .line 22
    .line 23
    iget-boolean v12, v0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->readOnly:Z

    .line 24
    .line 25
    if-nez v12, :cond_0

    .line 26
    .line 27
    const/4 v12, 0x1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v12, 0x0

    .line 30
    :goto_0
    iget-object v13, v0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->textFieldState:Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;

    .line 31
    .line 32
    iget-object v14, v0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->keyboardOptions:Landroidx/compose/foundation/text/KeyboardOptions;

    .line 33
    .line 34
    iget-object v15, v0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->textFieldSelectionState:Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;

    .line 35
    .line 36
    iget-object v11, v0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 37
    .line 38
    iget-boolean v10, v0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->isPassword:Z

    .line 39
    .line 40
    move-object/from16 v16, v11

    .line 41
    .line 42
    iget-object v11, v0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->stylusHandwritingTrigger:Lvd/k;

    .line 43
    .line 44
    if-eqz v3, :cond_1

    .line 45
    .line 46
    if-nez v4, :cond_1

    .line 47
    .line 48
    move-object/from16 v17, v15

    .line 49
    .line 50
    const/4 v15, 0x1

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    move-object/from16 v17, v15

    .line 53
    .line 54
    const/4 v15, 0x0

    .line 55
    :goto_1
    iput-object v1, v0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->textFieldState:Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;

    .line 56
    .line 57
    move/from16 v18, v10

    .line 58
    .line 59
    move-object/from16 v10, p2

    .line 60
    .line 61
    iput-object v10, v0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->textLayoutState:Landroidx/compose/foundation/text/input/internal/TextLayoutState;

    .line 62
    .line 63
    iput-object v2, v0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->textFieldSelectionState:Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;

    .line 64
    .line 65
    move-object/from16 v10, p4

    .line 66
    .line 67
    iput-object v10, v0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->filter:Landroidx/compose/foundation/text/input/InputTransformation;

    .line 68
    .line 69
    iput-boolean v3, v0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->enabled:Z

    .line 70
    .line 71
    iput-boolean v4, v0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->readOnly:Z

    .line 72
    .line 73
    iput-object v5, v0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->keyboardOptions:Landroidx/compose/foundation/text/KeyboardOptions;

    .line 74
    .line 75
    move-object/from16 v4, p8

    .line 76
    .line 77
    iput-object v4, v0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->keyboardActionHandler:Landroidx/compose/foundation/text/input/KeyboardActionHandler;

    .line 78
    .line 79
    move/from16 v4, p9

    .line 80
    .line 81
    iput-boolean v4, v0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->singleLine:Z

    .line 82
    .line 83
    iput-object v6, v0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->interactionSource:Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 84
    .line 85
    iput-boolean v7, v0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->isPassword:Z

    .line 86
    .line 87
    iput-object v8, v0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->stylusHandwritingTrigger:Lvd/k;

    .line 88
    .line 89
    if-ne v15, v12, :cond_2

    .line 90
    .line 91
    invoke-static {v1, v13}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-eqz v1, :cond_2

    .line 96
    .line 97
    invoke-static {v5, v14}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-eqz v1, :cond_2

    .line 102
    .line 103
    invoke-static {v8, v11}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-nez v1, :cond_4

    .line 108
    .line 109
    :cond_2
    if-eqz v15, :cond_3

    .line 110
    .line 111
    invoke-direct {v0}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->isFocused()Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-eqz v1, :cond_3

    .line 116
    .line 117
    const/4 v1, 0x0

    .line 118
    invoke-direct {v0, v1}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->startInputSession(Z)V

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_3
    if-nez v15, :cond_4

    .line 123
    .line 124
    invoke-direct {v0}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->disposeInputSession()V

    .line 125
    .line 126
    .line 127
    :cond_4
    :goto_2
    if-ne v3, v9, :cond_6

    .line 128
    .line 129
    if-ne v15, v12, :cond_6

    .line 130
    .line 131
    invoke-virtual {v5}, Landroidx/compose/foundation/text/KeyboardOptions;->getImeActionOrDefault-eUduSuo$foundation_release()I

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    invoke-virtual {v14}, Landroidx/compose/foundation/text/KeyboardOptions;->getImeActionOrDefault-eUduSuo$foundation_release()I

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    invoke-static {v1, v3}, Landroidx/compose/ui/text/input/ImeAction;->equals-impl0(II)Z

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    if-eqz v1, :cond_6

    .line 144
    .line 145
    move/from16 v1, v18

    .line 146
    .line 147
    if-eq v7, v1, :cond_5

    .line 148
    .line 149
    goto :goto_4

    .line 150
    :cond_5
    :goto_3
    move-object/from16 v1, v17

    .line 151
    .line 152
    goto :goto_5

    .line 153
    :cond_6
    :goto_4
    invoke-static {v0}, Landroidx/compose/ui/node/SemanticsModifierNodeKt;->invalidateSemantics(Landroidx/compose/ui/node/SemanticsModifierNode;)V

    .line 154
    .line 155
    .line 156
    goto :goto_3

    .line 157
    :goto_5
    invoke-static {v2, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    if-nez v1, :cond_9

    .line 162
    .line 163
    iget-object v1, v0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->pointerInputNode:Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;

    .line 164
    .line 165
    invoke-interface {v1}, Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;->resetPointerInputHandler()V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    if-eqz v1, :cond_8

    .line 173
    .line 174
    iget-object v1, v0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->receiveContentConfigurationProvider:Lhd/a;

    .line 175
    .line 176
    invoke-virtual {v2, v1}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;->setReceiveContentConfiguration(Lhd/a;)V

    .line 177
    .line 178
    .line 179
    invoke-direct {v0}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->isFocused()Z

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    if-eqz v1, :cond_8

    .line 184
    .line 185
    iget-object v1, v0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->toolbarAndHandlesVisibilityObserverJob:Lkotlinx/coroutines/g;

    .line 186
    .line 187
    if-eqz v1, :cond_8

    .line 188
    .line 189
    const/4 v3, 0x0

    .line 190
    if-eqz v1, :cond_7

    .line 191
    .line 192
    const/4 v4, 0x1

    .line 193
    invoke-static {v1, v3, v4, v3}, Lkotlinx/coroutines/g$a;->a(Lkotlinx/coroutines/g;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    :cond_7
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getCoroutineScope()Lsd/i0;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    new-instance v4, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$updateNode$1;

    .line 201
    .line 202
    invoke-direct {v4, v2, v3}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$updateNode$1;-><init>(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Lvc/c;)V

    .line 203
    .line 204
    .line 205
    const/4 v3, 0x3

    .line 206
    const/4 v5, 0x0

    .line 207
    const/4 v7, 0x0

    .line 208
    const/4 v8, 0x0

    .line 209
    move-object/from16 p4, v1

    .line 210
    .line 211
    move/from16 p8, v3

    .line 212
    .line 213
    move-object/from16 p7, v4

    .line 214
    .line 215
    move-object/from16 p9, v5

    .line 216
    .line 217
    move-object/from16 p5, v7

    .line 218
    .line 219
    move-object/from16 p6, v8

    .line 220
    .line 221
    invoke-static/range {p4 .. p9}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    iput-object v1, v0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->toolbarAndHandlesVisibilityObserverJob:Lkotlinx/coroutines/g;

    .line 226
    .line 227
    :cond_8
    new-instance v1, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$updateNode$2;

    .line 228
    .line 229
    invoke-direct {v1, v0}, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode$updateNode$2;-><init>(Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v2, v1}, Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;->setRequestAutofillAction(Lhd/a;)V

    .line 233
    .line 234
    .line 235
    :cond_9
    move-object/from16 v1, v16

    .line 236
    .line 237
    invoke-static {v6, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v1

    .line 241
    if-nez v1, :cond_a

    .line 242
    .line 243
    iget-object v1, v0, Landroidx/compose/foundation/text/input/internal/TextFieldDecoratorModifierNode;->pointerInputNode:Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;

    .line 244
    .line 245
    invoke-interface {v1}, Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;->resetPointerInputHandler()V

    .line 246
    .line 247
    .line 248
    :cond_a
    return-void
.end method
