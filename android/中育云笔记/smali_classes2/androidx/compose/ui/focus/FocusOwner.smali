.class public interface abstract Landroidx/compose/ui/focus/FocusOwner;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/focus/FocusManager;


# direct methods
.method public static synthetic dispatchKeyEvent-YhN2O0w$default(Landroidx/compose/ui/focus/FocusOwner;Landroid/view/KeyEvent;Lhd/a;ILjava/lang/Object;)Z
    .locals 0

    .line 1
    if-nez p4, :cond_1

    .line 2
    .line 3
    and-int/lit8 p3, p3, 0x2

    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    sget-object p2, Landroidx/compose/ui/focus/FocusOwner$dispatchKeyEvent$1;->INSTANCE:Landroidx/compose/ui/focus/FocusOwner$dispatchKeyEvent$1;

    .line 8
    .line 9
    :cond_0
    invoke-interface {p0, p1, p2}, Landroidx/compose/ui/focus/FocusOwner;->dispatchKeyEvent-YhN2O0w(Landroid/view/KeyEvent;Lhd/a;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0

    .line 14
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 15
    .line 16
    const-string p1, "Super calls with default arguments not supported in this target, function: dispatchKeyEvent-YhN2O0w"

    .line 17
    .line 18
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p0
.end method

.method public static synthetic dispatchRotaryEvent$default(Landroidx/compose/ui/focus/FocusOwner;Landroidx/compose/ui/input/rotary/RotaryScrollEvent;Lhd/a;ILjava/lang/Object;)Z
    .locals 0

    .line 1
    if-nez p4, :cond_1

    .line 2
    .line 3
    and-int/lit8 p3, p3, 0x2

    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    sget-object p2, Landroidx/compose/ui/focus/FocusOwner$dispatchRotaryEvent$1;->INSTANCE:Landroidx/compose/ui/focus/FocusOwner$dispatchRotaryEvent$1;

    .line 8
    .line 9
    :cond_0
    invoke-interface {p0, p1, p2}, Landroidx/compose/ui/focus/FocusOwner;->dispatchRotaryEvent(Landroidx/compose/ui/input/rotary/RotaryScrollEvent;Lhd/a;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0

    .line 14
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 15
    .line 16
    const-string p1, "Super calls with default arguments not supported in this target, function: dispatchRotaryEvent"

    .line 17
    .line 18
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p0
.end method


# virtual methods
.method public abstract clearFocus-I7lrPNg(ZZZI)Z
.end method

.method public abstract dispatchInterceptedSoftKeyboardEvent-ZmokQxo(Landroid/view/KeyEvent;)Z
.end method

.method public abstract dispatchKeyEvent-YhN2O0w(Landroid/view/KeyEvent;Lhd/a;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/KeyEvent;",
            "Lhd/a;",
            ")Z"
        }
    .end annotation
.end method

.method public abstract dispatchRotaryEvent(Landroidx/compose/ui/input/rotary/RotaryScrollEvent;Lhd/a;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/rotary/RotaryScrollEvent;",
            "Lhd/a;",
            ")Z"
        }
    .end annotation
.end method

.method public abstract focusSearch-ULY8qGw(ILandroidx/compose/ui/geometry/Rect;Lhd/l;)Ljava/lang/Boolean;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroidx/compose/ui/geometry/Rect;",
            "Lhd/l;",
            ")",
            "Ljava/lang/Boolean;"
        }
    .end annotation
.end method

.method public abstract getActiveFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;
.end method

.method public abstract getFocusRect()Landroidx/compose/ui/geometry/Rect;
.end method

.method public abstract getFocusTransactionManager()Landroidx/compose/ui/focus/FocusTransactionManager;
.end method

.method public abstract getListeners()Landroidx/collection/MutableObjectList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/collection/MutableObjectList<",
            "Landroidx/compose/ui/focus/FocusListener;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getModifier()Landroidx/compose/ui/Modifier;
.end method

.method public abstract getRootState()Landroidx/compose/ui/focus/FocusState;
.end method

.method public abstract isFocusCaptured()Z
.end method

.method public abstract releaseFocus()V
.end method

.method public abstract requestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z
.end method

.method public abstract scheduleInvalidation(Landroidx/compose/ui/focus/FocusEventModifierNode;)V
.end method

.method public abstract scheduleInvalidation(Landroidx/compose/ui/focus/FocusPropertiesModifierNode;)V
.end method

.method public abstract scheduleInvalidation(Landroidx/compose/ui/focus/FocusTargetNode;)V
.end method

.method public abstract scheduleInvalidationForOwner()V
.end method

.method public abstract setActiveFocusTargetNode(Landroidx/compose/ui/focus/FocusTargetNode;)V
.end method

.method public abstract setFocusCaptured(Z)V
.end method

.method public abstract takeFocus-aToIllA(ILandroidx/compose/ui/geometry/Rect;)Z
.end method
