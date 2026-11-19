.class public final Landroidx/compose/ui/focus/FocusOwnerImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/focus/FocusOwner;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/focus/FocusOwnerImpl$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0000\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u00ac\u0001\u0012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012:\u0010\u000e\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0007\u00a2\u0006\u000c\u0008\u0008\u0012\u0008\u0008\t\u0012\u0004\u0008\u0008(\n\u0012\u0015\u0012\u0013\u0018\u00010\u000b\u00a2\u0006\u000c\u0008\u0008\u0012\u0008\u0008\t\u0012\u0004\u0008\u0008(\u000c\u0012\u0004\u0012\u00020\r0\u0006\u0012!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\u000c\u0008\u0008\u0012\u0008\u0008\t\u0012\u0004\u0008\u0008(\n\u0012\u0004\u0012\u00020\r0\u0002\u0012\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0003\u0012\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J&\u0010\u0018\u001a\u00020\r2\u0008\u0010\n\u001a\u0004\u0018\u00010\u00072\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J$\u0010\u001b\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00072\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u001f\u0010 J2\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0007H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008#\u0010$J\u001a\u0010\'\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0007H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008%\u0010&J:\u0010-\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\u00072\u0008\u0010(\u001a\u0004\u0018\u00010\u000b2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\r0\u0002H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008+\u0010,J(\u00103\u001a\u00020\r2\u0006\u0010/\u001a\u00020.2\u000c\u00100\u001a\u0008\u0012\u0004\u0012\u00020\r0\u0003H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u00081\u00102J\u001a\u00106\u001a\u00020\r2\u0006\u0010/\u001a\u00020.H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u00084\u00105J%\u00109\u001a\u00020\r2\u0006\u00108\u001a\u0002072\u000c\u00100\u001a\u0008\u0012\u0004\u0012\u00020\r0\u0003H\u0016\u00a2\u0006\u0004\u00089\u0010:J\u0017\u0010<\u001a\u00020\u00042\u0006\u0010;\u001a\u00020)H\u0016\u00a2\u0006\u0004\u0008<\u0010=J\u0017\u0010<\u001a\u00020\u00042\u0006\u0010;\u001a\u00020>H\u0016\u00a2\u0006\u0004\u0008<\u0010?J\u0017\u0010<\u001a\u00020\u00042\u0006\u0010;\u001a\u00020@H\u0016\u00a2\u0006\u0004\u0008<\u0010AJ\u000f\u0010B\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008B\u0010\u001dJ\u0011\u0010C\u001a\u0004\u0018\u00010\u000bH\u0016\u00a2\u0006\u0004\u0008C\u0010DJ!\u0010\u001f\u001a\u00020\r2\u0008\u0008\u0002\u0010E\u001a\u00020\r2\u0006\u0010!\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u001f\u0010FJ\u000f\u0010G\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008G\u0010\u001dJg\u0010Q\u001a\u00020\u0004\"\n\u0008\u0000\u0010I\u0018\u0001*\u00020H*\u00020H2\u000c\u0010K\u001a\u0008\u0012\u0004\u0012\u00028\u00000J2\u0012\u0010L\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00022\u000c\u0010M\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0002H\u0082\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008O\u0010PJ3\u0010U\u001a\u0004\u0018\u00018\u0000\"\n\u0008\u0000\u0010I\u0018\u0001*\u00020R*\u00020H2\u000c\u0010K\u001a\u0008\u0012\u0004\u0012\u00028\u00000JH\u0082\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008S\u0010TJ\u0011\u0010V\u001a\u0004\u0018\u00010)H\u0002\u00a2\u0006\u0004\u0008V\u0010WJ\u0015\u0010Y\u001a\u0004\u0018\u00010X*\u00020HH\u0002\u00a2\u0006\u0004\u0008Y\u0010ZJ\u001a\u0010\\\u001a\u00020\r2\u0006\u0010/\u001a\u00020.H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008[\u00105RH\u0010\u000e\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0007\u00a2\u0006\u000c\u0008\u0008\u0012\u0008\u0008\t\u0012\u0004\u0008\u0008(\n\u0012\u0015\u0012\u0013\u0018\u00010\u000b\u00a2\u0006\u000c\u0008\u0008\u0012\u0008\u0008\t\u0012\u0004\u0008\u0008(\u000c\u0012\u0004\u0012\u00020\r0\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010]R/\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0007\u00a2\u0006\u000c\u0008\u0008\u0012\u0008\u0008\t\u0012\u0004\u0008\u0008(\n\u0012\u0004\u0012\u00020\r0\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010^R\u001a\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010_R\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010_R\u001a\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010_R\"\u0010`\u001a\u00020)8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008`\u0010a\u001a\u0004\u0008b\u0010W\"\u0004\u0008c\u0010=R\u0014\u0010e\u001a\u00020d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008e\u0010fR\u001a\u0010h\u001a\u00020g8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008h\u0010i\u001a\u0004\u0008j\u0010kR\u001a\u0010m\u001a\u00020l8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008m\u0010n\u001a\u0004\u0008o\u0010pR\u0018\u0010r\u001a\u0004\u0018\u00010q8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008r\u0010sR \u0010v\u001a\u0008\u0012\u0004\u0012\u00020u0t8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008v\u0010w\u001a\u0004\u0008x\u0010yR.\u0010{\u001a\u0004\u0018\u00010)2\u0008\u0010z\u001a\u0004\u0018\u00010)8\u0016@VX\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008{\u0010a\u001a\u0004\u0008|\u0010W\"\u0004\u0008}\u0010=R,\u0010~\u001a\u00020\r2\u0006\u0010z\u001a\u00020\r8\u0016@VX\u0096\u000e\u00a2\u0006\u0014\n\u0004\u0008~\u0010\u007f\u001a\u0005\u0008~\u0010\u0080\u0001\"\u0005\u0008\u0081\u0001\u0010 R\u0018\u0010\u0085\u0001\u001a\u00030\u0082\u00018VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u0083\u0001\u0010\u0084\u0001\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u0086\u0001"
    }
    d2 = {
        "Landroidx/compose/ui/focus/FocusOwnerImpl;",
        "Landroidx/compose/ui/focus/FocusOwner;",
        "Lkotlin/Function1;",
        "Lkotlin/Function0;",
        "Ld6/s;",
        "onRequestApplyChangesListener",
        "Lkotlin/Function2;",
        "Landroidx/compose/ui/focus/FocusDirection;",
        "Lkotlin/ParameterName;",
        "name",
        "focusDirection",
        "Landroidx/compose/ui/geometry/Rect;",
        "previouslyFocusedRect",
        "",
        "onRequestFocusForOwner",
        "onMoveFocusInterop",
        "onClearFocusForOwner",
        "onFocusRectInterop",
        "Landroidx/compose/ui/unit/LayoutDirection;",
        "onLayoutDirection",
        "<init>",
        "(Lr6/c;Lr6/e;Lr6/c;Lr6/a;Lr6/a;Lr6/a;)V",
        "requestFocusForOwner-7o62pno",
        "(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z",
        "requestFocusForOwner",
        "takeFocus-aToIllA",
        "(ILandroidx/compose/ui/geometry/Rect;)Z",
        "takeFocus",
        "releaseFocus",
        "()V",
        "force",
        "clearFocus",
        "(Z)V",
        "refreshFocusEvents",
        "clearOwnerFocus",
        "clearFocus-I7lrPNg",
        "(ZZZI)Z",
        "moveFocus-3ESFkO8",
        "(I)Z",
        "moveFocus",
        "focusedRect",
        "Landroidx/compose/ui/focus/FocusTargetNode;",
        "onFound",
        "focusSearch-ULY8qGw",
        "(ILandroidx/compose/ui/geometry/Rect;Lr6/c;)Ljava/lang/Boolean;",
        "focusSearch",
        "Landroidx/compose/ui/input/key/KeyEvent;",
        "keyEvent",
        "onFocusedItem",
        "dispatchKeyEvent-YhN2O0w",
        "(Landroid/view/KeyEvent;Lr6/a;)Z",
        "dispatchKeyEvent",
        "dispatchInterceptedSoftKeyboardEvent-ZmokQxo",
        "(Landroid/view/KeyEvent;)Z",
        "dispatchInterceptedSoftKeyboardEvent",
        "Landroidx/compose/ui/input/rotary/RotaryScrollEvent;",
        "event",
        "dispatchRotaryEvent",
        "(Landroidx/compose/ui/input/rotary/RotaryScrollEvent;Lr6/a;)Z",
        "node",
        "scheduleInvalidation",
        "(Landroidx/compose/ui/focus/FocusTargetNode;)V",
        "Landroidx/compose/ui/focus/FocusEventModifierNode;",
        "(Landroidx/compose/ui/focus/FocusEventModifierNode;)V",
        "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;",
        "(Landroidx/compose/ui/focus/FocusPropertiesModifierNode;)V",
        "scheduleInvalidationForOwner",
        "getFocusRect",
        "()Landroidx/compose/ui/geometry/Rect;",
        "forced",
        "(ZZ)Z",
        "invalidateOwnerFocusState",
        "Landroidx/compose/ui/node/DelegatableNode;",
        "T",
        "Landroidx/compose/ui/node/NodeKind;",
        "type",
        "onPreVisit",
        "onVisit",
        "onPostVisit",
        "traverseAncestorsIncludingSelf-QFhIj7k",
        "(Landroidx/compose/ui/node/DelegatableNode;ILr6/c;Lr6/a;Lr6/c;)V",
        "traverseAncestorsIncludingSelf",
        "",
        "nearestAncestorIncludingSelf-64DMado",
        "(Landroidx/compose/ui/node/DelegatableNode;I)Ljava/lang/Object;",
        "nearestAncestorIncludingSelf",
        "findFocusTargetNode",
        "()Landroidx/compose/ui/focus/FocusTargetNode;",
        "Landroidx/compose/ui/Modifier$Node;",
        "lastLocalKeyInputNode",
        "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/Modifier$Node;",
        "validateKeyEvent-ZmokQxo",
        "validateKeyEvent",
        "Lr6/e;",
        "Lr6/c;",
        "Lr6/a;",
        "rootFocusNode",
        "Landroidx/compose/ui/focus/FocusTargetNode;",
        "getRootFocusNode$ui_release",
        "setRootFocusNode$ui_release",
        "Landroidx/compose/ui/focus/FocusInvalidationManager;",
        "focusInvalidationManager",
        "Landroidx/compose/ui/focus/FocusInvalidationManager;",
        "Landroidx/compose/ui/focus/FocusTransactionManager;",
        "focusTransactionManager",
        "Landroidx/compose/ui/focus/FocusTransactionManager;",
        "getFocusTransactionManager",
        "()Landroidx/compose/ui/focus/FocusTransactionManager;",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "getModifier",
        "()Landroidx/compose/ui/Modifier;",
        "Landroidx/collection/MutableLongSet;",
        "keysCurrentlyDown",
        "Landroidx/collection/MutableLongSet;",
        "Landroidx/collection/MutableObjectList;",
        "Landroidx/compose/ui/focus/FocusListener;",
        "listeners",
        "Landroidx/collection/MutableObjectList;",
        "getListeners",
        "()Landroidx/collection/MutableObjectList;",
        "value",
        "activeFocusTargetNode",
        "getActiveFocusTargetNode",
        "setActiveFocusTargetNode",
        "isFocusCaptured",
        "Z",
        "()Z",
        "setFocusCaptured",
        "Landroidx/compose/ui/focus/FocusState;",
        "getRootState",
        "()Landroidx/compose/ui/focus/FocusState;",
        "rootState",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFocusOwnerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl\n+ 2 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 8 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 9 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 10 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 11 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 12 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 13 ObjectList.kt\nandroidx/collection/ObjectList\n+ 14 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n*L\n1#1,534:1\n451#1:638\n452#1:659\n454#1:705\n440#1:780\n441#1:856\n442#1:863\n443#1,2:910\n445#1:958\n446#1:965\n451#1:967\n452#1:988\n454#1:1034\n440#1:1036\n441#1:1112\n442#1:1119\n443#1,2:1166\n445#1:1214\n446#1:1221\n451#1:1223\n452#1:1244\n454#1:1290\n440#1:1292\n441#1:1368\n442#1:1375\n443#1,2:1422\n445#1:1470\n446#1:1477\n68#2,5:535\n73#2,8:543\n52#2,4:551\n56#2,4:558\n1#3:540\n1#3:555\n1#3:1754\n641#4,2:541\n641#4,2:556\n119#5:562\n131#5:637\n131#5:706\n131#5:779\n143#5:966\n143#5:1035\n135#5:1222\n135#5:1291\n119#5:1727\n131#5:1728\n119#5:1749\n247#6,5:563\n90#6:568\n91#6,8:574\n437#6,6:582\n447#6,2:589\n449#6,8:594\n457#6,9:605\n466#6,8:617\n100#6,7:625\n251#6:639\n90#6:640\n91#6,8:646\n437#6,5:654\n442#6:660\n447#6,2:662\n449#6,8:667\n457#6,9:678\n466#6,8:690\n100#6,7:698\n277#6:707\n247#6,5:708\n90#6:713\n91#6,8:719\n437#6,5:727\n278#6:732\n442#6:733\n447#6,2:735\n449#6,8:740\n457#6,9:751\n466#6,8:763\n100#6,7:771\n280#6:778\n268#6,2:781\n247#6,5:783\n90#6:788\n91#6,8:794\n437#6,5:802\n270#6,3:807\n442#6:810\n447#6,2:812\n449#6,8:817\n457#6,9:828\n466#6,8:840\n100#6,7:848\n273#6:855\n437#6,12:864\n449#6,8:879\n457#6,9:890\n466#6,8:902\n437#6,12:912\n449#6,8:927\n457#6,9:938\n466#6,8:950\n251#6:968\n90#6:969\n91#6,8:975\n437#6,5:983\n442#6:989\n447#6,2:991\n449#6,8:996\n457#6,9:1007\n466#6,8:1019\n100#6,7:1027\n268#6,2:1037\n247#6,5:1039\n90#6:1044\n91#6,8:1050\n437#6,5:1058\n270#6,3:1063\n442#6:1066\n447#6,2:1068\n449#6,8:1073\n457#6,9:1084\n466#6,8:1096\n100#6,7:1104\n273#6:1111\n437#6,12:1120\n449#6,8:1135\n457#6,9:1146\n466#6,8:1158\n437#6,12:1168\n449#6,8:1183\n457#6,9:1194\n466#6,8:1206\n251#6:1224\n90#6:1225\n91#6,8:1231\n437#6,5:1239\n442#6:1245\n447#6,2:1247\n449#6,8:1252\n457#6,9:1263\n466#6,8:1275\n100#6,7:1283\n268#6,2:1293\n247#6,5:1295\n90#6:1300\n91#6,8:1306\n437#6,5:1314\n270#6,3:1319\n442#6:1322\n447#6,2:1324\n449#6,8:1329\n457#6,9:1340\n466#6,8:1352\n100#6,7:1360\n273#6:1367\n437#6,12:1376\n449#6,8:1391\n457#6,9:1402\n466#6,8:1414\n437#6,12:1424\n449#6,8:1439\n457#6,9:1450\n466#6,8:1462\n268#6,2:1478\n247#6,5:1480\n90#6:1485\n91#6,8:1491\n437#6,5:1499\n270#6,3:1504\n442#6:1507\n447#6,2:1509\n449#6,8:1514\n457#6,9:1525\n466#6,8:1537\n100#6,7:1545\n273#6:1552\n437#6,6:1559\n447#6,2:1566\n449#6,8:1571\n457#6,9:1582\n466#6,8:1594\n437#6,6:1602\n447#6,2:1609\n449#6,8:1614\n457#6,9:1625\n466#6,8:1637\n251#6:1651\n90#6:1652\n91#6,8:1658\n437#6,6:1666\n447#6,2:1673\n449#6,8:1678\n457#6,9:1689\n466#6,8:1701\n100#6,7:1709\n202#6,8:1730\n210#6,6:1743\n217#6,3:1751\n56#7,5:569\n56#7,5:641\n56#7,5:714\n56#7,5:789\n56#7,5:970\n56#7,5:1045\n56#7,5:1226\n56#7,5:1301\n56#7,5:1486\n56#7,5:1653\n102#7,5:1722\n56#7,5:1738\n246#8:588\n246#8:661\n246#8:734\n246#8:811\n246#8:990\n246#8:1067\n246#8:1246\n246#8:1323\n246#8:1508\n246#8:1565\n246#8:1608\n246#8:1672\n246#8:1750\n240#9,3:591\n243#9,3:614\n240#9,3:664\n243#9,3:687\n240#9,3:737\n243#9,3:760\n240#9,3:814\n243#9,3:837\n240#9,3:876\n243#9,3:899\n240#9,3:924\n243#9,3:947\n240#9,3:993\n243#9,3:1016\n240#9,3:1070\n243#9,3:1093\n240#9,3:1132\n243#9,3:1155\n240#9,3:1180\n243#9,3:1203\n240#9,3:1249\n243#9,3:1272\n240#9,3:1326\n243#9,3:1349\n240#9,3:1388\n243#9,3:1411\n240#9,3:1436\n243#9,3:1459\n240#9,3:1511\n243#9,3:1534\n240#9,3:1568\n243#9,3:1591\n240#9,3:1611\n243#9,3:1634\n240#9,3:1675\n243#9,3:1698\n1101#10:602\n1083#10,2:603\n1101#10:675\n1083#10,2:676\n1101#10:748\n1083#10,2:749\n1101#10:825\n1083#10,2:826\n1101#10:887\n1083#10,2:888\n1101#10:935\n1083#10,2:936\n1101#10:1004\n1083#10,2:1005\n1101#10:1081\n1083#10,2:1082\n1101#10:1143\n1083#10,2:1144\n1101#10:1191\n1083#10,2:1192\n1101#10:1260\n1083#10,2:1261\n1101#10:1337\n1083#10,2:1338\n1101#10:1399\n1083#10,2:1400\n1101#10:1447\n1083#10,2:1448\n1101#10:1522\n1083#10,2:1523\n1101#10:1579\n1083#10,2:1580\n1101#10:1622\n1083#10,2:1623\n1101#10:1686\n1083#10,2:1687\n26#11,5:632\n52#12,6:857\n34#12,6:959\n52#12,6:1113\n34#12,6:1215\n52#12,6:1369\n34#12,6:1471\n52#12,6:1553\n34#12,6:1645\n287#13,6:1716\n55#14:1729\n*S KotlinDebug\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl\n*L\n342#1:638\n342#1:659\n342#1:705\n345#1:780\n345#1:856\n345#1:863\n345#1:910,2\n345#1:958\n345#1:965\n368#1:967\n368#1:988\n368#1:1034\n370#1:1036\n370#1:1112\n370#1:1119\n370#1:1166,2\n370#1:1214\n370#1:1221\n391#1:1223\n391#1:1244\n391#1:1290\n393#1:1292\n393#1:1368\n393#1:1375\n393#1:1422,2\n393#1:1470\n393#1:1477\n161#1:535,5\n161#1:543,8\n200#1:551,4\n200#1:558,4\n161#1:540\n200#1:555\n161#1:541,2\n200#1:556,2\n239#1:562\n342#1:637\n343#1:706\n346#1:779\n368#1:966\n371#1:1035\n391#1:1222\n394#1:1291\n491#1:1727\n491#1:1728\n492#1:1749\n239#1:563,5\n239#1:568\n239#1:574,8\n239#1:582,6\n239#1:589,2\n239#1:594,8\n239#1:605,9\n239#1:617,8\n239#1:625,7\n342#1:639\n342#1:640\n342#1:646,8\n342#1:654,5\n342#1:660\n342#1:662,2\n342#1:667,8\n342#1:678,9\n342#1:690,8\n342#1:698,7\n343#1:707\n343#1:708,5\n343#1:713\n343#1:719,8\n343#1:727,5\n343#1:732\n343#1:733\n343#1:735,2\n343#1:740,8\n343#1:751,9\n343#1:763,8\n343#1:771,7\n343#1:778\n345#1:781,2\n345#1:783,5\n345#1:788\n345#1:794,8\n345#1:802,5\n345#1:807,3\n345#1:810\n345#1:812,2\n345#1:817,8\n345#1:828,9\n345#1:840,8\n345#1:848,7\n345#1:855\n345#1:864,12\n345#1:879,8\n345#1:890,9\n345#1:902,8\n345#1:912,12\n345#1:927,8\n345#1:938,9\n345#1:950,8\n368#1:968\n368#1:969\n368#1:975,8\n368#1:983,5\n368#1:989\n368#1:991,2\n368#1:996,8\n368#1:1007,9\n368#1:1019,8\n368#1:1027,7\n370#1:1037,2\n370#1:1039,5\n370#1:1044\n370#1:1050,8\n370#1:1058,5\n370#1:1063,3\n370#1:1066\n370#1:1068,2\n370#1:1073,8\n370#1:1084,9\n370#1:1096,8\n370#1:1104,7\n370#1:1111\n370#1:1120,12\n370#1:1135,8\n370#1:1146,9\n370#1:1158,8\n370#1:1168,12\n370#1:1183,8\n370#1:1194,9\n370#1:1206,8\n391#1:1224\n391#1:1225\n391#1:1231,8\n391#1:1239,5\n391#1:1245\n391#1:1247,2\n391#1:1252,8\n391#1:1263,9\n391#1:1275,8\n391#1:1283,7\n393#1:1293,2\n393#1:1295,5\n393#1:1300\n393#1:1306,8\n393#1:1314,5\n393#1:1319,3\n393#1:1322\n393#1:1324,2\n393#1:1329,8\n393#1:1340,9\n393#1:1352,8\n393#1:1360,7\n393#1:1367\n393#1:1376,12\n393#1:1391,8\n393#1:1402,9\n393#1:1414,8\n393#1:1424,12\n393#1:1439,8\n393#1:1450,9\n393#1:1462,8\n440#1:1478,2\n440#1:1480,5\n440#1:1485\n440#1:1491,8\n440#1:1499,5\n440#1:1504,3\n440#1:1507\n440#1:1509,2\n440#1:1514,8\n440#1:1525,9\n440#1:1537,8\n440#1:1545,7\n440#1:1552\n442#1:1559,6\n442#1:1566,2\n442#1:1571,8\n442#1:1582,9\n442#1:1594,8\n444#1:1602,6\n444#1:1609,2\n444#1:1614,8\n444#1:1625,9\n444#1:1637,8\n451#1:1651\n451#1:1652\n451#1:1658,8\n451#1:1666,6\n451#1:1673,2\n451#1:1678,8\n451#1:1689,9\n451#1:1701,8\n451#1:1709,7\n491#1:1730,8\n491#1:1743,6\n491#1:1751,3\n239#1:569,5\n342#1:641,5\n343#1:714,5\n345#1:789,5\n368#1:970,5\n370#1:1045,5\n391#1:1226,5\n393#1:1301,5\n440#1:1486,5\n451#1:1653,5\n483#1:1722,5\n491#1:1738,5\n239#1:588\n342#1:661\n343#1:734\n345#1:811\n368#1:990\n370#1:1067\n391#1:1246\n393#1:1323\n440#1:1508\n442#1:1565\n444#1:1608\n451#1:1672\n492#1:1750\n239#1:591,3\n239#1:614,3\n342#1:664,3\n342#1:687,3\n343#1:737,3\n343#1:760,3\n345#1:814,3\n345#1:837,3\n345#1:876,3\n345#1:899,3\n345#1:924,3\n345#1:947,3\n368#1:993,3\n368#1:1016,3\n370#1:1070,3\n370#1:1093,3\n370#1:1132,3\n370#1:1155,3\n370#1:1180,3\n370#1:1203,3\n391#1:1249,3\n391#1:1272,3\n393#1:1326,3\n393#1:1349,3\n393#1:1388,3\n393#1:1411,3\n393#1:1436,3\n393#1:1459,3\n440#1:1511,3\n440#1:1534,3\n442#1:1568,3\n442#1:1591,3\n444#1:1611,3\n444#1:1634,3\n451#1:1675,3\n451#1:1698,3\n239#1:602\n239#1:603,2\n342#1:675\n342#1:676,2\n343#1:748\n343#1:749,2\n345#1:825\n345#1:826,2\n345#1:887\n345#1:888,2\n345#1:935\n345#1:936,2\n368#1:1004\n368#1:1005,2\n370#1:1081\n370#1:1082,2\n370#1:1143\n370#1:1144,2\n370#1:1191\n370#1:1192,2\n391#1:1260\n391#1:1261,2\n393#1:1337\n393#1:1338,2\n393#1:1399\n393#1:1400,2\n393#1:1447\n393#1:1448,2\n440#1:1522\n440#1:1523,2\n442#1:1579\n442#1:1580,2\n444#1:1622\n444#1:1623,2\n451#1:1686\n451#1:1687,2\n331#1:632,5\n345#1:857,6\n345#1:959,6\n370#1:1113,6\n370#1:1215,6\n393#1:1369,6\n393#1:1471,6\n441#1:1553,6\n445#1:1645,6\n477#1:1716,6\n491#1:1729\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private activeFocusTargetNode:Landroidx/compose/ui/focus/FocusTargetNode;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final focusInvalidationManager:Landroidx/compose/ui/focus/FocusInvalidationManager;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final focusTransactionManager:Landroidx/compose/ui/focus/FocusTransactionManager;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private isFocusCaptured:Z

.field private keysCurrentlyDown:Landroidx/collection/MutableLongSet;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final listeners:Landroidx/collection/MutableObjectList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableObjectList<",
            "Landroidx/compose/ui/focus/FocusListener;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final modifier:Landroidx/compose/ui/Modifier;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final onClearFocusForOwner:Lr6/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/a;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final onFocusRectInterop:Lr6/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/a;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final onLayoutDirection:Lr6/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/a;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final onMoveFocusInterop:Lr6/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/c;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final onRequestFocusForOwner:Lr6/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/e;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lr6/c;Lr6/e;Lr6/c;Lr6/a;Lr6/a;Lr6/a;)V
    .locals 6
    .param p1    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lr6/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/c;",
            "Lr6/e;",
            "Lr6/c;",
            "Lr6/a;",
            "Lr6/a;",
            "Lr6/a;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->onRequestFocusForOwner:Lr6/e;

    .line 5
    .line 6
    iput-object p3, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->onMoveFocusInterop:Lr6/c;

    .line 7
    .line 8
    iput-object p4, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->onClearFocusForOwner:Lr6/a;

    .line 9
    .line 10
    iput-object p5, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->onFocusRectInterop:Lr6/a;

    .line 11
    .line 12
    iput-object p6, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->onLayoutDirection:Lr6/a;

    .line 13
    .line 14
    new-instance v0, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 15
    .line 16
    sget-object p2, Landroidx/compose/ui/focus/Focusability;->Companion:Landroidx/compose/ui/focus/Focusability$Companion;

    .line 17
    .line 18
    invoke-virtual {p2}, Landroidx/compose/ui/focus/Focusability$Companion;->getNever-LCbbffg()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const/4 v4, 0x6

    .line 23
    const/4 v5, 0x0

    .line 24
    const/4 v2, 0x0

    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-direct/range {v0 .. v5}, Landroidx/compose/ui/focus/FocusTargetNode;-><init>(ILr6/e;Lr6/c;ILkotlin/jvm/internal/e;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 30
    .line 31
    new-instance p2, Landroidx/compose/ui/focus/FocusInvalidationManager;

    .line 32
    .line 33
    new-instance p3, Landroidx/compose/ui/focus/FocusOwnerImpl$focusInvalidationManager$1;

    .line 34
    .line 35
    invoke-direct {p3, p0}, Landroidx/compose/ui/focus/FocusOwnerImpl$focusInvalidationManager$1;-><init>(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    new-instance p4, Landroidx/compose/ui/focus/FocusOwnerImpl$focusInvalidationManager$2;

    .line 39
    .line 40
    invoke-direct {p4, p0}, Landroidx/compose/ui/focus/FocusOwnerImpl$focusInvalidationManager$2;-><init>(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    new-instance p5, Landroidx/compose/ui/focus/FocusOwnerImpl$focusInvalidationManager$3;

    .line 44
    .line 45
    invoke-direct {p5, p0}, Landroidx/compose/ui/focus/FocusOwnerImpl$focusInvalidationManager$3;-><init>(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-direct {p2, p1, p3, p4, p5}, Landroidx/compose/ui/focus/FocusInvalidationManager;-><init>(Lr6/c;Lr6/a;Lr6/a;Lr6/a;)V

    .line 49
    .line 50
    .line 51
    iput-object p2, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->focusInvalidationManager:Landroidx/compose/ui/focus/FocusInvalidationManager;

    .line 52
    .line 53
    new-instance p1, Landroidx/compose/ui/focus/FocusTransactionManager;

    .line 54
    .line 55
    invoke-direct {p1}, Landroidx/compose/ui/focus/FocusTransactionManager;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->focusTransactionManager:Landroidx/compose/ui/focus/FocusTransactionManager;

    .line 59
    .line 60
    new-instance p1, Landroidx/compose/ui/focus/FocusOwnerImpl$modifier$1;

    .line 61
    .line 62
    invoke-direct {p1, p0}, Landroidx/compose/ui/focus/FocusOwnerImpl$modifier$1;-><init>(Landroidx/compose/ui/focus/FocusOwnerImpl;)V

    .line 63
    .line 64
    .line 65
    iput-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->modifier:Landroidx/compose/ui/Modifier;

    .line 66
    .line 67
    new-instance p1, Landroidx/collection/MutableObjectList;

    .line 68
    .line 69
    const/4 p2, 0x1

    .line 70
    invoke-direct {p1, p2}, Landroidx/collection/MutableObjectList;-><init>(I)V

    .line 71
    .line 72
    .line 73
    iput-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->listeners:Landroidx/collection/MutableObjectList;

    .line 74
    .line 75
    return-void
.end method

.method public static final synthetic access$invalidateOwnerFocusState(Landroidx/compose/ui/focus/FocusOwnerImpl;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->invalidateOwnerFocusState()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final clearFocus(ZZ)Z
    .locals 9

    .line 2
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->getActiveFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    .line 3
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->isFocusCaptured()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    if-nez p1, :cond_1

    return v2

    .line 4
    :cond_1
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->getActiveFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;

    move-result-object p1

    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, v0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->setActiveFocusTargetNode(Landroidx/compose/ui/focus/FocusTargetNode;)V

    if-eqz p2, :cond_e

    if-eqz p1, :cond_e

    .line 6
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->isFocusCaptured()Z

    move-result p2

    if-eqz p2, :cond_2

    sget-object p2, Landroidx/compose/ui/focus/FocusStateImpl;->Captured:Landroidx/compose/ui/focus/FocusStateImpl;

    goto :goto_0

    :cond_2
    sget-object p2, Landroidx/compose/ui/focus/FocusStateImpl;->Active:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 7
    :goto_0
    sget-object v3, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 8
    invoke-virtual {p1, p2, v3}, Landroidx/compose/ui/focus/FocusTargetNode;->dispatchFocusCallbacks$ui_release(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V

    const/16 p2, 0x400

    .line 9
    invoke-static {p2}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result p2

    .line 10
    invoke-interface {p1}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    move-result v3

    if-nez v3, :cond_3

    const-string/jumbo v3, "visitAncestors called on an unattached node"

    .line 11
    invoke-static {v3}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 12
    :cond_3
    invoke-interface {p1}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v3

    .line 13
    invoke-static {p1}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    move-result-object p1

    :goto_1
    if-eqz p1, :cond_e

    .line 14
    invoke-static {p1}, Landroidx/compose/material3/c;->c(Landroidx/compose/ui/node/LayoutNode;)I

    move-result v4

    and-int/2addr v4, p2

    if-eqz v4, :cond_c

    :goto_2
    if-eqz v3, :cond_c

    .line 15
    invoke-virtual {v3}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v4

    and-int/2addr v4, p2

    if-eqz v4, :cond_b

    move-object v5, v0

    move-object v4, v3

    :goto_3
    if-eqz v4, :cond_b

    .line 16
    instance-of v6, v4, Landroidx/compose/ui/focus/FocusTargetNode;

    if-eqz v6, :cond_4

    .line 17
    check-cast v4, Landroidx/compose/ui/focus/FocusTargetNode;

    .line 18
    sget-object v6, Landroidx/compose/ui/focus/FocusStateImpl;->ActiveParent:Landroidx/compose/ui/focus/FocusStateImpl;

    sget-object v7, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    invoke-virtual {v4, v6, v7}, Landroidx/compose/ui/focus/FocusTargetNode;->dispatchFocusCallbacks$ui_release(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V

    goto :goto_6

    .line 19
    :cond_4
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v6

    and-int/2addr v6, p2

    if-eqz v6, :cond_a

    .line 20
    instance-of v6, v4, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v6, :cond_a

    .line 21
    move-object v6, v4

    check-cast v6, Landroidx/compose/ui/node/DelegatingNode;

    .line 22
    invoke-virtual {v6}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v6

    move v7, v2

    :goto_4
    if-eqz v6, :cond_9

    .line 23
    invoke-virtual {v6}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v8

    and-int/2addr v8, p2

    if-eqz v8, :cond_8

    add-int/lit8 v7, v7, 0x1

    if-ne v7, v1, :cond_5

    move-object v4, v6

    goto :goto_5

    :cond_5
    if-nez v5, :cond_6

    .line 24
    new-instance v5, Landroidx/compose/runtime/collection/MutableVector;

    const/16 v8, 0x10

    new-array v8, v8, [Landroidx/compose/ui/Modifier$Node;

    invoke-direct {v5, v8, v2}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    :cond_6
    if-eqz v4, :cond_7

    .line 25
    invoke-virtual {v5, v4}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    move-object v4, v0

    .line 26
    :cond_7
    invoke-virtual {v5, v6}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 27
    :cond_8
    :goto_5
    invoke-virtual {v6}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v6

    goto :goto_4

    :cond_9
    if-ne v7, v1, :cond_a

    goto :goto_3

    .line 28
    :cond_a
    :goto_6
    invoke-static {v5}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v4

    goto :goto_3

    .line 29
    :cond_b
    invoke-virtual {v3}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v3

    goto :goto_2

    .line 30
    :cond_c
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    move-result-object p1

    if-eqz p1, :cond_d

    .line 31
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v3

    if-eqz v3, :cond_d

    invoke-virtual {v3}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v3

    goto :goto_1

    :cond_d
    move-object v3, v0

    goto :goto_1

    :cond_e
    return v1
.end method

.method public static synthetic clearFocus$default(Landroidx/compose/ui/focus/FocusOwnerImpl;ZZILjava/lang/Object;)Z
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x1

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2}, Landroidx/compose/ui/focus/FocusOwnerImpl;->clearFocus(ZZ)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method private final findFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTraversalKt;->findActiveFocusNode(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method private final invalidateOwnerFocusState()V
    .locals 2

    .line 1
    sget-boolean v0, Landroidx/compose/ui/ComposeUiFlags;->isTrackFocusEnabled:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->getActiveFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    .line 18
    .line 19
    if-ne v0, v1, :cond_2

    .line 20
    .line 21
    :cond_1
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->onClearFocusForOwner:Lr6/a;

    .line 22
    .line 23
    invoke-interface {v0}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    :cond_2
    return-void
.end method

.method private final lastLocalKeyInputNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/Modifier$Node;
    .locals 5

    .line 1
    const/16 v0, 0x400

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/16 v2, 0x2000

    .line 8
    .line 9
    invoke-static {v2}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    or-int/2addr v1, v2

    .line 14
    invoke-interface {p1}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v2}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    const-string/jumbo v2, "visitLocalDescendants called on an unattached node"

    .line 25
    .line 26
    .line 27
    invoke-static {v2}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-interface {p1}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    and-int/2addr v2, v1

    .line 39
    const/4 v3, 0x0

    .line 40
    if-eqz v2, :cond_3

    .line 41
    .line 42
    invoke-virtual {p1}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    :goto_0
    if-eqz p1, :cond_3

    .line 47
    .line 48
    invoke-virtual {p1}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    and-int/2addr v2, v1

    .line 53
    if-eqz v2, :cond_2

    .line 54
    .line 55
    invoke-static {v0}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    invoke-virtual {p1}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    and-int/2addr v2, v4

    .line 64
    if-eqz v2, :cond_1

    .line 65
    .line 66
    return-object v3

    .line 67
    :cond_1
    move-object v3, p1

    .line 68
    :cond_2
    invoke-virtual {p1}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    goto :goto_0

    .line 73
    :cond_3
    return-object v3
.end method

.method private final nearestAncestorIncludingSelf-64DMado(Landroidx/compose/ui/node/DelegatableNode;I)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/ui/node/DelegatableNode;",
            "I)TT;"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-string/jumbo v0, "visitAncestors called on an unattached node"

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-interface {p1}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {p1}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :goto_0
    const/4 v1, 0x0

    .line 26
    if-eqz p1, :cond_4

    .line 27
    .line 28
    invoke-static {p1}, Landroidx/compose/material3/c;->c(Landroidx/compose/ui/node/LayoutNode;)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    and-int/2addr v2, p2

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    :goto_1
    if-eqz v0, :cond_2

    .line 36
    .line 37
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    and-int/2addr v2, p2

    .line 42
    if-nez v2, :cond_1

    .line 43
    .line 44
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    invoke-static {}, Lkotlin/jvm/internal/k;->o()V

    .line 50
    .line 51
    .line 52
    throw v1

    .line 53
    :cond_2
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-eqz p1, :cond_3

    .line 58
    .line 59
    invoke-virtual {p1}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    if-eqz v0, :cond_3

    .line 64
    .line 65
    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    goto :goto_0

    .line 70
    :cond_3
    move-object v0, v1

    .line 71
    goto :goto_0

    .line 72
    :cond_4
    return-object v1
.end method

.method private final traverseAncestorsIncludingSelf-QFhIj7k(Landroidx/compose/ui/node/DelegatableNode;ILr6/c;Lr6/a;Lr6/c;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Landroidx/compose/ui/node/DelegatableNode;",
            ">(",
            "Landroidx/compose/ui/node/DelegatableNode;",
            "I",
            "Lr6/c;",
            "Lr6/a;",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    invoke-virtual {p3}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 6
    .line 7
    .line 8
    move-result p3

    .line 9
    if-nez p3, :cond_0

    .line 10
    .line 11
    const-string/jumbo p3, "visitAncestors called on an unattached node"

    .line 12
    .line 13
    .line 14
    invoke-static {p3}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-interface {p1}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    invoke-virtual {p3}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 22
    .line 23
    .line 24
    move-result-object p3

    .line 25
    invoke-static {p1}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    .line 26
    .line 27
    .line 28
    move-result-object p5

    .line 29
    :goto_0
    const/4 v0, 0x0

    .line 30
    if-eqz p5, :cond_4

    .line 31
    .line 32
    invoke-static {p5}, Landroidx/compose/material3/c;->c(Landroidx/compose/ui/node/LayoutNode;)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    and-int/2addr v1, p2

    .line 37
    if-eqz v1, :cond_2

    .line 38
    .line 39
    :goto_1
    if-eqz p3, :cond_2

    .line 40
    .line 41
    invoke-virtual {p3}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    and-int/2addr v1, p2

    .line 46
    if-nez v1, :cond_1

    .line 47
    .line 48
    invoke-virtual {p3}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 49
    .line 50
    .line 51
    move-result-object p3

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    invoke-static {}, Lkotlin/jvm/internal/k;->o()V

    .line 54
    .line 55
    .line 56
    throw v0

    .line 57
    :cond_2
    invoke-virtual {p5}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    .line 58
    .line 59
    .line 60
    move-result-object p5

    .line 61
    if-eqz p5, :cond_3

    .line 62
    .line 63
    invoke-virtual {p5}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 64
    .line 65
    .line 66
    move-result-object p3

    .line 67
    if-eqz p3, :cond_3

    .line 68
    .line 69
    invoke-virtual {p3}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 70
    .line 71
    .line 72
    move-result-object p3

    .line 73
    goto :goto_0

    .line 74
    :cond_3
    move-object p3, v0

    .line 75
    goto :goto_0

    .line 76
    :cond_4
    invoke-interface {p1}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    if-nez p2, :cond_6

    .line 81
    .line 82
    invoke-interface {p4}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    invoke-interface {p1}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    if-nez p1, :cond_5

    .line 90
    .line 91
    return-void

    .line 92
    :cond_5
    invoke-static {}, Lkotlin/jvm/internal/k;->o()V

    .line 93
    .line 94
    .line 95
    throw v0

    .line 96
    :cond_6
    invoke-static {}, Lkotlin/jvm/internal/k;->o()V

    .line 97
    .line 98
    .line 99
    throw v0
.end method

.method private final validateKeyEvent-ZmokQxo(Landroid/view/KeyEvent;)Z
    .locals 5

    .line 1
    invoke-static {p1}, Landroidx/compose/ui/input/key/KeyEvent_androidKt;->getKey-ZmokQxo(Landroid/view/KeyEvent;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {p1}, Landroidx/compose/ui/input/key/KeyEvent_androidKt;->getType-ZmokQxo(Landroid/view/KeyEvent;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    sget-object v2, Landroidx/compose/ui/input/key/KeyEventType;->Companion:Landroidx/compose/ui/input/key/KeyEventType$Companion;

    .line 10
    .line 11
    invoke-virtual {v2}, Landroidx/compose/ui/input/key/KeyEventType$Companion;->getKeyDown-CS__XNY()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    invoke-static {p1, v3}, Landroidx/compose/ui/input/key/KeyEventType;->equals-impl0(II)Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const/4 v4, 0x1

    .line 20
    if-eqz v3, :cond_1

    .line 21
    .line 22
    iget-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->keysCurrentlyDown:Landroidx/collection/MutableLongSet;

    .line 23
    .line 24
    if-nez p1, :cond_0

    .line 25
    .line 26
    new-instance p1, Landroidx/collection/MutableLongSet;

    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    invoke-direct {p1, v2}, Landroidx/collection/MutableLongSet;-><init>(I)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->keysCurrentlyDown:Landroidx/collection/MutableLongSet;

    .line 33
    .line 34
    :cond_0
    invoke-virtual {p1, v0, v1}, Landroidx/collection/MutableLongSet;->plusAssign(J)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-virtual {v2}, Landroidx/compose/ui/input/key/KeyEventType$Companion;->getKeyUp-CS__XNY()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    invoke-static {p1, v2}, Landroidx/compose/ui/input/key/KeyEventType;->equals-impl0(II)Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_3

    .line 47
    .line 48
    iget-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->keysCurrentlyDown:Landroidx/collection/MutableLongSet;

    .line 49
    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    invoke-virtual {p1, v0, v1}, Landroidx/collection/LongSet;->contains(J)Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-ne p1, v4, :cond_2

    .line 57
    .line 58
    iget-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->keysCurrentlyDown:Landroidx/collection/MutableLongSet;

    .line 59
    .line 60
    if-eqz p1, :cond_3

    .line 61
    .line 62
    invoke-virtual {p1, v0, v1}, Landroidx/collection/MutableLongSet;->remove(J)Z

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    const/4 p1, 0x0

    .line 67
    return p1

    .line 68
    :cond_3
    :goto_0
    return v4
.end method


# virtual methods
.method public clearFocus(Z)V
    .locals 2

    .line 1
    sget-object v0, Landroidx/compose/ui/focus/FocusDirection;->Companion:Landroidx/compose/ui/focus/FocusDirection$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusDirection$Companion;->getExit-dhqQ-8s()I

    move-result v0

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v1, v1, v0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->clearFocus-I7lrPNg(ZZZI)Z

    return-void
.end method

.method public clearFocus-I7lrPNg(ZZZI)Z
    .locals 7

    .line 1
    sget-boolean v0, Landroidx/compose/ui/ComposeUiFlags;->isTrackFocusEnabled:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x3

    .line 5
    const/4 v3, 0x2

    .line 6
    const/4 v4, 0x1

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    if-nez p1, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 12
    .line 13
    invoke-static {v0, p4}, Landroidx/compose/ui/focus/FocusTransactionsKt;->performCustomClearFocus-Mxy_nc0(Landroidx/compose/ui/focus/FocusTargetNode;I)Landroidx/compose/ui/focus/CustomDestinationResult;

    .line 14
    .line 15
    .line 16
    move-result-object p4

    .line 17
    sget-object v0, Landroidx/compose/ui/focus/FocusOwnerImpl$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 18
    .line 19
    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    .line 20
    .line 21
    .line 22
    move-result p4

    .line 23
    aget p4, v0, p4

    .line 24
    .line 25
    if-eq p4, v4, :cond_7

    .line 26
    .line 27
    if-eq p4, v3, :cond_7

    .line 28
    .line 29
    if-eq p4, v2, :cond_7

    .line 30
    .line 31
    const/4 v0, 0x4

    .line 32
    if-ne p4, v0, :cond_0

    .line 33
    .line 34
    invoke-direct {p0, p1, p2}, Landroidx/compose/ui/focus/FocusOwnerImpl;->clearFocus(ZZ)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 40
    .line 41
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 42
    .line 43
    .line 44
    throw p1

    .line 45
    :cond_1
    invoke-direct {p0, p1, p2}, Landroidx/compose/ui/focus/FocusOwnerImpl;->clearFocus(ZZ)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->getFocusTransactionManager()Landroidx/compose/ui/focus/FocusTransactionManager;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    sget-object v5, Landroidx/compose/ui/focus/FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1;->INSTANCE:Landroidx/compose/ui/focus/FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1;

    .line 55
    .line 56
    :try_start_0
    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->getOngoingTransaction()Z

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    if-eqz v6, :cond_3

    .line 61
    .line 62
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$cancelTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :catchall_0
    move-exception p1

    .line 67
    goto :goto_2

    .line 68
    :cond_3
    :goto_0
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$beginTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 69
    .line 70
    .line 71
    if-eqz v5, :cond_4

    .line 72
    .line 73
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$getCancellationListener$p(Landroidx/compose/ui/focus/FocusTransactionManager;)Landroidx/compose/runtime/collection/MutableVector;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    invoke-virtual {v6, v5}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    :cond_4
    if-nez p1, :cond_5

    .line 81
    .line 82
    iget-object v5, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 83
    .line 84
    invoke-static {v5, p4}, Landroidx/compose/ui/focus/FocusTransactionsKt;->performCustomClearFocus-Mxy_nc0(Landroidx/compose/ui/focus/FocusTargetNode;I)Landroidx/compose/ui/focus/CustomDestinationResult;

    .line 85
    .line 86
    .line 87
    move-result-object p4

    .line 88
    sget-object v5, Landroidx/compose/ui/focus/FocusOwnerImpl$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 89
    .line 90
    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    .line 91
    .line 92
    .line 93
    move-result p4

    .line 94
    aget p4, v5, p4

    .line 95
    .line 96
    if-eq p4, v4, :cond_6

    .line 97
    .line 98
    if-eq p4, v3, :cond_6

    .line 99
    .line 100
    if-eq p4, v2, :cond_6

    .line 101
    .line 102
    :cond_5
    iget-object p4, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 103
    .line 104
    invoke-static {p4, p1, p2}, Landroidx/compose/ui/focus/FocusTransactionsKt;->clearFocus(Landroidx/compose/ui/focus/FocusTargetNode;ZZ)Z

    .line 105
    .line 106
    .line 107
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 108
    :cond_6
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$commitTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 109
    .line 110
    .line 111
    :cond_7
    :goto_1
    if-eqz v1, :cond_8

    .line 112
    .line 113
    if-eqz p3, :cond_8

    .line 114
    .line 115
    iget-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->onClearFocusForOwner:Lr6/a;

    .line 116
    .line 117
    invoke-interface {p1}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    :cond_8
    return v1

    .line 121
    :goto_2
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$commitTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 122
    .line 123
    .line 124
    throw p1
.end method

.method public dispatchInterceptedSoftKeyboardEvent-ZmokQxo(Landroid/view/KeyEvent;)Z
    .locals 14
    .param p1    # Landroid/view/KeyEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->focusInvalidationManager:Landroidx/compose/ui/focus/FocusInvalidationManager;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusInvalidationManager;->hasPendingInvalidation()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-string p1, "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated."

    .line 11
    .line 12
    sget-object v0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return v1

    .line 18
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 19
    .line 20
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTraversalKt;->findActiveFocusNode(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string/jumbo v2, "visitAncestors called on an unattached node"

    .line 25
    .line 26
    .line 27
    const/high16 v3, 0x20000

    .line 28
    .line 29
    const/16 v4, 0x10

    .line 30
    .line 31
    const/4 v5, 0x0

    .line 32
    const/4 v6, 0x1

    .line 33
    if-eqz v0, :cond_d

    .line 34
    .line 35
    invoke-static {v3}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    invoke-interface {v0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 40
    .line 41
    .line 42
    move-result-object v8

    .line 43
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 44
    .line 45
    .line 46
    move-result v8

    .line 47
    if-nez v8, :cond_1

    .line 48
    .line 49
    invoke-static {v2}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    :cond_1
    invoke-interface {v0}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 53
    .line 54
    .line 55
    move-result-object v8

    .line 56
    invoke-static {v0}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    :goto_0
    if-eqz v0, :cond_c

    .line 61
    .line 62
    invoke-static {v0}, Landroidx/compose/material3/c;->c(Landroidx/compose/ui/node/LayoutNode;)I

    .line 63
    .line 64
    .line 65
    move-result v9

    .line 66
    and-int/2addr v9, v7

    .line 67
    if-eqz v9, :cond_a

    .line 68
    .line 69
    :goto_1
    if-eqz v8, :cond_a

    .line 70
    .line 71
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 72
    .line 73
    .line 74
    move-result v9

    .line 75
    and-int/2addr v9, v7

    .line 76
    if-eqz v9, :cond_9

    .line 77
    .line 78
    move-object v10, v5

    .line 79
    move-object v9, v8

    .line 80
    :goto_2
    if-eqz v9, :cond_9

    .line 81
    .line 82
    instance-of v11, v9, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;

    .line 83
    .line 84
    if-eqz v11, :cond_2

    .line 85
    .line 86
    goto :goto_5

    .line 87
    :cond_2
    invoke-virtual {v9}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 88
    .line 89
    .line 90
    move-result v11

    .line 91
    and-int/2addr v11, v7

    .line 92
    if-eqz v11, :cond_8

    .line 93
    .line 94
    instance-of v11, v9, Landroidx/compose/ui/node/DelegatingNode;

    .line 95
    .line 96
    if-eqz v11, :cond_8

    .line 97
    .line 98
    move-object v11, v9

    .line 99
    check-cast v11, Landroidx/compose/ui/node/DelegatingNode;

    .line 100
    .line 101
    invoke-virtual {v11}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 102
    .line 103
    .line 104
    move-result-object v11

    .line 105
    move v12, v1

    .line 106
    :goto_3
    if-eqz v11, :cond_7

    .line 107
    .line 108
    invoke-virtual {v11}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 109
    .line 110
    .line 111
    move-result v13

    .line 112
    and-int/2addr v13, v7

    .line 113
    if-eqz v13, :cond_6

    .line 114
    .line 115
    add-int/lit8 v12, v12, 0x1

    .line 116
    .line 117
    if-ne v12, v6, :cond_3

    .line 118
    .line 119
    move-object v9, v11

    .line 120
    goto :goto_4

    .line 121
    :cond_3
    if-nez v10, :cond_4

    .line 122
    .line 123
    new-instance v10, Landroidx/compose/runtime/collection/MutableVector;

    .line 124
    .line 125
    new-array v13, v4, [Landroidx/compose/ui/Modifier$Node;

    .line 126
    .line 127
    invoke-direct {v10, v13, v1}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 128
    .line 129
    .line 130
    :cond_4
    if-eqz v9, :cond_5

    .line 131
    .line 132
    invoke-virtual {v10, v9}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-object v9, v5

    .line 136
    :cond_5
    invoke-virtual {v10, v11}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    :cond_6
    :goto_4
    invoke-virtual {v11}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 140
    .line 141
    .line 142
    move-result-object v11

    .line 143
    goto :goto_3

    .line 144
    :cond_7
    if-ne v12, v6, :cond_8

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_8
    invoke-static {v10}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 148
    .line 149
    .line 150
    move-result-object v9

    .line 151
    goto :goto_2

    .line 152
    :cond_9
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 153
    .line 154
    .line 155
    move-result-object v8

    .line 156
    goto :goto_1

    .line 157
    :cond_a
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    if-eqz v0, :cond_b

    .line 162
    .line 163
    invoke-virtual {v0}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 164
    .line 165
    .line 166
    move-result-object v8

    .line 167
    if-eqz v8, :cond_b

    .line 168
    .line 169
    invoke-virtual {v8}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 170
    .line 171
    .line 172
    move-result-object v8

    .line 173
    goto :goto_0

    .line 174
    :cond_b
    move-object v8, v5

    .line 175
    goto :goto_0

    .line 176
    :cond_c
    move-object v9, v5

    .line 177
    :goto_5
    check-cast v9, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;

    .line 178
    .line 179
    goto :goto_6

    .line 180
    :cond_d
    move-object v9, v5

    .line 181
    :goto_6
    if-eqz v9, :cond_2f

    .line 182
    .line 183
    invoke-static {v3}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    invoke-interface {v9}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 188
    .line 189
    .line 190
    move-result-object v3

    .line 191
    invoke-virtual {v3}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 192
    .line 193
    .line 194
    move-result v3

    .line 195
    if-nez v3, :cond_e

    .line 196
    .line 197
    invoke-static {v2}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    :cond_e
    invoke-interface {v9}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    invoke-virtual {v2}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    invoke-static {v9}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    move-object v7, v5

    .line 213
    :goto_7
    if-eqz v3, :cond_1a

    .line 214
    .line 215
    invoke-static {v3}, Landroidx/compose/material3/c;->c(Landroidx/compose/ui/node/LayoutNode;)I

    .line 216
    .line 217
    .line 218
    move-result v8

    .line 219
    and-int/2addr v8, v0

    .line 220
    if-eqz v8, :cond_18

    .line 221
    .line 222
    :goto_8
    if-eqz v2, :cond_18

    .line 223
    .line 224
    invoke-virtual {v2}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 225
    .line 226
    .line 227
    move-result v8

    .line 228
    and-int/2addr v8, v0

    .line 229
    if-eqz v8, :cond_17

    .line 230
    .line 231
    move-object v8, v2

    .line 232
    move-object v10, v5

    .line 233
    :goto_9
    if-eqz v8, :cond_17

    .line 234
    .line 235
    instance-of v11, v8, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;

    .line 236
    .line 237
    if-eqz v11, :cond_10

    .line 238
    .line 239
    if-nez v7, :cond_f

    .line 240
    .line 241
    new-instance v7, Ljava/util/ArrayList;

    .line 242
    .line 243
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 244
    .line 245
    .line 246
    :cond_f
    invoke-interface {v7, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    goto :goto_c

    .line 250
    :cond_10
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 251
    .line 252
    .line 253
    move-result v11

    .line 254
    and-int/2addr v11, v0

    .line 255
    if-eqz v11, :cond_16

    .line 256
    .line 257
    instance-of v11, v8, Landroidx/compose/ui/node/DelegatingNode;

    .line 258
    .line 259
    if-eqz v11, :cond_16

    .line 260
    .line 261
    move-object v11, v8

    .line 262
    check-cast v11, Landroidx/compose/ui/node/DelegatingNode;

    .line 263
    .line 264
    invoke-virtual {v11}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 265
    .line 266
    .line 267
    move-result-object v11

    .line 268
    move v12, v1

    .line 269
    :goto_a
    if-eqz v11, :cond_15

    .line 270
    .line 271
    invoke-virtual {v11}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 272
    .line 273
    .line 274
    move-result v13

    .line 275
    and-int/2addr v13, v0

    .line 276
    if-eqz v13, :cond_14

    .line 277
    .line 278
    add-int/lit8 v12, v12, 0x1

    .line 279
    .line 280
    if-ne v12, v6, :cond_11

    .line 281
    .line 282
    move-object v8, v11

    .line 283
    goto :goto_b

    .line 284
    :cond_11
    if-nez v10, :cond_12

    .line 285
    .line 286
    new-instance v10, Landroidx/compose/runtime/collection/MutableVector;

    .line 287
    .line 288
    new-array v13, v4, [Landroidx/compose/ui/Modifier$Node;

    .line 289
    .line 290
    invoke-direct {v10, v13, v1}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 291
    .line 292
    .line 293
    :cond_12
    if-eqz v8, :cond_13

    .line 294
    .line 295
    invoke-virtual {v10, v8}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    move-object v8, v5

    .line 299
    :cond_13
    invoke-virtual {v10, v11}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    :cond_14
    :goto_b
    invoke-virtual {v11}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 303
    .line 304
    .line 305
    move-result-object v11

    .line 306
    goto :goto_a

    .line 307
    :cond_15
    if-ne v12, v6, :cond_16

    .line 308
    .line 309
    goto :goto_9

    .line 310
    :cond_16
    :goto_c
    invoke-static {v10}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 311
    .line 312
    .line 313
    move-result-object v8

    .line 314
    goto :goto_9

    .line 315
    :cond_17
    invoke-virtual {v2}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    goto :goto_8

    .line 320
    :cond_18
    invoke-virtual {v3}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    .line 321
    .line 322
    .line 323
    move-result-object v3

    .line 324
    if-eqz v3, :cond_19

    .line 325
    .line 326
    invoke-virtual {v3}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 327
    .line 328
    .line 329
    move-result-object v2

    .line 330
    if-eqz v2, :cond_19

    .line 331
    .line 332
    invoke-virtual {v2}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 333
    .line 334
    .line 335
    move-result-object v2

    .line 336
    goto :goto_7

    .line 337
    :cond_19
    move-object v2, v5

    .line 338
    goto :goto_7

    .line 339
    :cond_1a
    if-eqz v7, :cond_1d

    .line 340
    .line 341
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 342
    .line 343
    .line 344
    move-result v2

    .line 345
    add-int/lit8 v2, v2, -0x1

    .line 346
    .line 347
    if-ltz v2, :cond_1d

    .line 348
    .line 349
    :goto_d
    add-int/lit8 v3, v2, -0x1

    .line 350
    .line 351
    invoke-interface {v7, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    check-cast v2, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;

    .line 356
    .line 357
    invoke-interface {v2, p1}, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;->onPreInterceptKeyBeforeSoftKeyboard-ZmokQxo(Landroid/view/KeyEvent;)Z

    .line 358
    .line 359
    .line 360
    move-result v2

    .line 361
    if-eqz v2, :cond_1b

    .line 362
    .line 363
    return v6

    .line 364
    :cond_1b
    if-gez v3, :cond_1c

    .line 365
    .line 366
    goto :goto_e

    .line 367
    :cond_1c
    move v2, v3

    .line 368
    goto :goto_d

    .line 369
    :cond_1d
    :goto_e
    invoke-interface {v9}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 370
    .line 371
    .line 372
    move-result-object v2

    .line 373
    move-object v3, v5

    .line 374
    :goto_f
    if-eqz v2, :cond_25

    .line 375
    .line 376
    instance-of v8, v2, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;

    .line 377
    .line 378
    if-eqz v8, :cond_1e

    .line 379
    .line 380
    check-cast v2, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;

    .line 381
    .line 382
    invoke-interface {v2, p1}, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;->onPreInterceptKeyBeforeSoftKeyboard-ZmokQxo(Landroid/view/KeyEvent;)Z

    .line 383
    .line 384
    .line 385
    move-result v2

    .line 386
    if-eqz v2, :cond_24

    .line 387
    .line 388
    return v6

    .line 389
    :cond_1e
    invoke-virtual {v2}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 390
    .line 391
    .line 392
    move-result v8

    .line 393
    and-int/2addr v8, v0

    .line 394
    if-eqz v8, :cond_24

    .line 395
    .line 396
    instance-of v8, v2, Landroidx/compose/ui/node/DelegatingNode;

    .line 397
    .line 398
    if-eqz v8, :cond_24

    .line 399
    .line 400
    move-object v8, v2

    .line 401
    check-cast v8, Landroidx/compose/ui/node/DelegatingNode;

    .line 402
    .line 403
    invoke-virtual {v8}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 404
    .line 405
    .line 406
    move-result-object v8

    .line 407
    move v10, v1

    .line 408
    :goto_10
    if-eqz v8, :cond_23

    .line 409
    .line 410
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 411
    .line 412
    .line 413
    move-result v11

    .line 414
    and-int/2addr v11, v0

    .line 415
    if-eqz v11, :cond_22

    .line 416
    .line 417
    add-int/lit8 v10, v10, 0x1

    .line 418
    .line 419
    if-ne v10, v6, :cond_1f

    .line 420
    .line 421
    move-object v2, v8

    .line 422
    goto :goto_11

    .line 423
    :cond_1f
    if-nez v3, :cond_20

    .line 424
    .line 425
    new-instance v3, Landroidx/compose/runtime/collection/MutableVector;

    .line 426
    .line 427
    new-array v11, v4, [Landroidx/compose/ui/Modifier$Node;

    .line 428
    .line 429
    invoke-direct {v3, v11, v1}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 430
    .line 431
    .line 432
    :cond_20
    if-eqz v2, :cond_21

    .line 433
    .line 434
    invoke-virtual {v3, v2}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 435
    .line 436
    .line 437
    move-object v2, v5

    .line 438
    :cond_21
    invoke-virtual {v3, v8}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 439
    .line 440
    .line 441
    :cond_22
    :goto_11
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 442
    .line 443
    .line 444
    move-result-object v8

    .line 445
    goto :goto_10

    .line 446
    :cond_23
    if-ne v10, v6, :cond_24

    .line 447
    .line 448
    goto :goto_f

    .line 449
    :cond_24
    invoke-static {v3}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 450
    .line 451
    .line 452
    move-result-object v2

    .line 453
    goto :goto_f

    .line 454
    :cond_25
    invoke-interface {v9}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 455
    .line 456
    .line 457
    move-result-object v2

    .line 458
    move-object v3, v5

    .line 459
    :goto_12
    if-eqz v2, :cond_2d

    .line 460
    .line 461
    instance-of v8, v2, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;

    .line 462
    .line 463
    if-eqz v8, :cond_26

    .line 464
    .line 465
    check-cast v2, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;

    .line 466
    .line 467
    invoke-interface {v2, p1}, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;->onInterceptKeyBeforeSoftKeyboard-ZmokQxo(Landroid/view/KeyEvent;)Z

    .line 468
    .line 469
    .line 470
    move-result v2

    .line 471
    if-eqz v2, :cond_2c

    .line 472
    .line 473
    return v6

    .line 474
    :cond_26
    invoke-virtual {v2}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 475
    .line 476
    .line 477
    move-result v8

    .line 478
    and-int/2addr v8, v0

    .line 479
    if-eqz v8, :cond_2c

    .line 480
    .line 481
    instance-of v8, v2, Landroidx/compose/ui/node/DelegatingNode;

    .line 482
    .line 483
    if-eqz v8, :cond_2c

    .line 484
    .line 485
    move-object v8, v2

    .line 486
    check-cast v8, Landroidx/compose/ui/node/DelegatingNode;

    .line 487
    .line 488
    invoke-virtual {v8}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 489
    .line 490
    .line 491
    move-result-object v8

    .line 492
    move v9, v1

    .line 493
    :goto_13
    if-eqz v8, :cond_2b

    .line 494
    .line 495
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 496
    .line 497
    .line 498
    move-result v10

    .line 499
    and-int/2addr v10, v0

    .line 500
    if-eqz v10, :cond_2a

    .line 501
    .line 502
    add-int/lit8 v9, v9, 0x1

    .line 503
    .line 504
    if-ne v9, v6, :cond_27

    .line 505
    .line 506
    move-object v2, v8

    .line 507
    goto :goto_14

    .line 508
    :cond_27
    if-nez v3, :cond_28

    .line 509
    .line 510
    new-instance v3, Landroidx/compose/runtime/collection/MutableVector;

    .line 511
    .line 512
    new-array v10, v4, [Landroidx/compose/ui/Modifier$Node;

    .line 513
    .line 514
    invoke-direct {v3, v10, v1}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 515
    .line 516
    .line 517
    :cond_28
    if-eqz v2, :cond_29

    .line 518
    .line 519
    invoke-virtual {v3, v2}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 520
    .line 521
    .line 522
    move-object v2, v5

    .line 523
    :cond_29
    invoke-virtual {v3, v8}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 524
    .line 525
    .line 526
    :cond_2a
    :goto_14
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 527
    .line 528
    .line 529
    move-result-object v8

    .line 530
    goto :goto_13

    .line 531
    :cond_2b
    if-ne v9, v6, :cond_2c

    .line 532
    .line 533
    goto :goto_12

    .line 534
    :cond_2c
    invoke-static {v3}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 535
    .line 536
    .line 537
    move-result-object v2

    .line 538
    goto :goto_12

    .line 539
    :cond_2d
    if-eqz v7, :cond_2f

    .line 540
    .line 541
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 542
    .line 543
    .line 544
    move-result v0

    .line 545
    move v2, v1

    .line 546
    :goto_15
    if-ge v2, v0, :cond_2f

    .line 547
    .line 548
    invoke-interface {v7, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 549
    .line 550
    .line 551
    move-result-object v3

    .line 552
    check-cast v3, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;

    .line 553
    .line 554
    invoke-interface {v3, p1}, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;->onInterceptKeyBeforeSoftKeyboard-ZmokQxo(Landroid/view/KeyEvent;)Z

    .line 555
    .line 556
    .line 557
    move-result v3

    .line 558
    if-eqz v3, :cond_2e

    .line 559
    .line 560
    return v6

    .line 561
    :cond_2e
    add-int/lit8 v2, v2, 0x1

    .line 562
    .line 563
    goto :goto_15

    .line 564
    :cond_2f
    return v1
.end method

.method public dispatchKeyEvent-YhN2O0w(Landroid/view/KeyEvent;Lr6/a;)Z
    .locals 16
    .param p1    # Landroid/view/KeyEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/KeyEvent;",
            "Lr6/a;",
            ")Z"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    const-string v2, "FocusOwnerImpl:dispatchKeyEvent"

    .line 6
    .line 7
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :try_start_0
    iget-object v2, v1, Landroidx/compose/ui/focus/FocusOwnerImpl;->focusInvalidationManager:Landroidx/compose/ui/focus/FocusInvalidationManager;

    .line 11
    .line 12
    invoke-virtual {v2}, Landroidx/compose/ui/focus/FocusInvalidationManager;->hasPendingInvalidation()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const/4 v3, 0x0

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    const-string v0, "FocusRelatedWarning: Dispatching key event while focus system is invalidated."

    .line 20
    .line 21
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 22
    .line 23
    invoke-virtual {v2, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 27
    .line 28
    .line 29
    return v3

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    goto/16 :goto_1c

    .line 32
    .line 33
    :cond_0
    :try_start_1
    invoke-direct/range {p0 .. p1}, Landroidx/compose/ui/focus/FocusOwnerImpl;->validateKeyEvent-ZmokQxo(Landroid/view/KeyEvent;)Z

    .line 34
    .line 35
    .line 36
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    if-nez v2, :cond_1

    .line 38
    .line 39
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 40
    .line 41
    .line 42
    return v3

    .line 43
    :cond_1
    :try_start_2
    invoke-direct {v1}, Landroidx/compose/ui/focus/FocusOwnerImpl;->findFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 44
    .line 45
    .line 46
    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 47
    const-string/jumbo v4, "visitAncestors called on an unattached node"

    .line 48
    .line 49
    .line 50
    const/16 v5, 0x2000

    .line 51
    .line 52
    const/16 v6, 0x10

    .line 53
    .line 54
    const/4 v7, 0x0

    .line 55
    const/4 v8, 0x1

    .line 56
    if-eqz v2, :cond_2

    .line 57
    .line 58
    :try_start_3
    invoke-direct {v1, v2}, Landroidx/compose/ui/focus/FocusOwnerImpl;->lastLocalKeyInputNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/Modifier$Node;

    .line 59
    .line 60
    .line 61
    move-result-object v9

    .line 62
    if-nez v9, :cond_1d

    .line 63
    .line 64
    :cond_2
    if-eqz v2, :cond_f

    .line 65
    .line 66
    invoke-static {v5}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 67
    .line 68
    .line 69
    move-result v9

    .line 70
    invoke-interface {v2}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 71
    .line 72
    .line 73
    move-result-object v10

    .line 74
    invoke-virtual {v10}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 75
    .line 76
    .line 77
    move-result v10

    .line 78
    if-nez v10, :cond_3

    .line 79
    .line 80
    invoke-static {v4}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :cond_3
    invoke-interface {v2}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 84
    .line 85
    .line 86
    move-result-object v10

    .line 87
    invoke-static {v2}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    :goto_0
    if-eqz v2, :cond_e

    .line 92
    .line 93
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 94
    .line 95
    .line 96
    move-result-object v11

    .line 97
    invoke-virtual {v11}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 98
    .line 99
    .line 100
    move-result-object v11

    .line 101
    invoke-virtual {v11}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 102
    .line 103
    .line 104
    move-result v11

    .line 105
    and-int/2addr v11, v9

    .line 106
    if-eqz v11, :cond_c

    .line 107
    .line 108
    :goto_1
    if-eqz v10, :cond_c

    .line 109
    .line 110
    invoke-virtual {v10}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 111
    .line 112
    .line 113
    move-result v11

    .line 114
    and-int/2addr v11, v9

    .line 115
    if-eqz v11, :cond_b

    .line 116
    .line 117
    move-object v12, v7

    .line 118
    move-object v11, v10

    .line 119
    :goto_2
    if-eqz v11, :cond_b

    .line 120
    .line 121
    instance-of v13, v11, Landroidx/compose/ui/input/key/KeyInputModifierNode;

    .line 122
    .line 123
    if-eqz v13, :cond_4

    .line 124
    .line 125
    goto :goto_5

    .line 126
    :cond_4
    invoke-virtual {v11}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 127
    .line 128
    .line 129
    move-result v13

    .line 130
    and-int/2addr v13, v9

    .line 131
    if-eqz v13, :cond_a

    .line 132
    .line 133
    instance-of v13, v11, Landroidx/compose/ui/node/DelegatingNode;

    .line 134
    .line 135
    if-eqz v13, :cond_a

    .line 136
    .line 137
    move-object v13, v11

    .line 138
    check-cast v13, Landroidx/compose/ui/node/DelegatingNode;

    .line 139
    .line 140
    invoke-virtual {v13}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 141
    .line 142
    .line 143
    move-result-object v13

    .line 144
    move v14, v3

    .line 145
    :goto_3
    if-eqz v13, :cond_9

    .line 146
    .line 147
    invoke-virtual {v13}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 148
    .line 149
    .line 150
    move-result v15

    .line 151
    and-int/2addr v15, v9

    .line 152
    if-eqz v15, :cond_8

    .line 153
    .line 154
    add-int/lit8 v14, v14, 0x1

    .line 155
    .line 156
    if-ne v14, v8, :cond_5

    .line 157
    .line 158
    move-object v11, v13

    .line 159
    goto :goto_4

    .line 160
    :cond_5
    if-nez v12, :cond_6

    .line 161
    .line 162
    new-instance v12, Landroidx/compose/runtime/collection/MutableVector;

    .line 163
    .line 164
    new-array v15, v6, [Landroidx/compose/ui/Modifier$Node;

    .line 165
    .line 166
    invoke-direct {v12, v15, v3}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 167
    .line 168
    .line 169
    :cond_6
    if-eqz v11, :cond_7

    .line 170
    .line 171
    invoke-virtual {v12, v11}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-object v11, v7

    .line 175
    :cond_7
    invoke-virtual {v12, v13}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    :cond_8
    :goto_4
    invoke-virtual {v13}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 179
    .line 180
    .line 181
    move-result-object v13

    .line 182
    goto :goto_3

    .line 183
    :cond_9
    if-ne v14, v8, :cond_a

    .line 184
    .line 185
    goto :goto_2

    .line 186
    :cond_a
    invoke-static {v12}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 187
    .line 188
    .line 189
    move-result-object v11

    .line 190
    goto :goto_2

    .line 191
    :cond_b
    invoke-virtual {v10}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 192
    .line 193
    .line 194
    move-result-object v10

    .line 195
    goto :goto_1

    .line 196
    :cond_c
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    if-eqz v2, :cond_d

    .line 201
    .line 202
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 203
    .line 204
    .line 205
    move-result-object v10

    .line 206
    if-eqz v10, :cond_d

    .line 207
    .line 208
    invoke-virtual {v10}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 209
    .line 210
    .line 211
    move-result-object v10

    .line 212
    goto :goto_0

    .line 213
    :cond_d
    move-object v10, v7

    .line 214
    goto :goto_0

    .line 215
    :cond_e
    move-object v11, v7

    .line 216
    :goto_5
    check-cast v11, Landroidx/compose/ui/input/key/KeyInputModifierNode;

    .line 217
    .line 218
    if-eqz v11, :cond_f

    .line 219
    .line 220
    invoke-interface {v11}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 221
    .line 222
    .line 223
    move-result-object v9

    .line 224
    goto/16 :goto_c

    .line 225
    .line 226
    :cond_f
    iget-object v2, v1, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 227
    .line 228
    invoke-static {v5}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 229
    .line 230
    .line 231
    move-result v9

    .line 232
    invoke-interface {v2}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 233
    .line 234
    .line 235
    move-result-object v10

    .line 236
    invoke-virtual {v10}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 237
    .line 238
    .line 239
    move-result v10

    .line 240
    if-nez v10, :cond_10

    .line 241
    .line 242
    invoke-static {v4}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    :cond_10
    invoke-interface {v2}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 246
    .line 247
    .line 248
    move-result-object v10

    .line 249
    invoke-virtual {v10}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 250
    .line 251
    .line 252
    move-result-object v10

    .line 253
    invoke-static {v2}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    :goto_6
    if-eqz v2, :cond_1b

    .line 258
    .line 259
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 260
    .line 261
    .line 262
    move-result-object v11

    .line 263
    invoke-virtual {v11}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 264
    .line 265
    .line 266
    move-result-object v11

    .line 267
    invoke-virtual {v11}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 268
    .line 269
    .line 270
    move-result v11

    .line 271
    and-int/2addr v11, v9

    .line 272
    if-eqz v11, :cond_19

    .line 273
    .line 274
    :goto_7
    if-eqz v10, :cond_19

    .line 275
    .line 276
    invoke-virtual {v10}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 277
    .line 278
    .line 279
    move-result v11

    .line 280
    and-int/2addr v11, v9

    .line 281
    if-eqz v11, :cond_18

    .line 282
    .line 283
    move-object v12, v7

    .line 284
    move-object v11, v10

    .line 285
    :goto_8
    if-eqz v11, :cond_18

    .line 286
    .line 287
    instance-of v13, v11, Landroidx/compose/ui/input/key/KeyInputModifierNode;

    .line 288
    .line 289
    if-eqz v13, :cond_11

    .line 290
    .line 291
    goto :goto_b

    .line 292
    :cond_11
    invoke-virtual {v11}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 293
    .line 294
    .line 295
    move-result v13

    .line 296
    and-int/2addr v13, v9

    .line 297
    if-eqz v13, :cond_17

    .line 298
    .line 299
    instance-of v13, v11, Landroidx/compose/ui/node/DelegatingNode;

    .line 300
    .line 301
    if-eqz v13, :cond_17

    .line 302
    .line 303
    move-object v13, v11

    .line 304
    check-cast v13, Landroidx/compose/ui/node/DelegatingNode;

    .line 305
    .line 306
    invoke-virtual {v13}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 307
    .line 308
    .line 309
    move-result-object v13

    .line 310
    move v14, v3

    .line 311
    :goto_9
    if-eqz v13, :cond_16

    .line 312
    .line 313
    invoke-virtual {v13}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 314
    .line 315
    .line 316
    move-result v15

    .line 317
    and-int/2addr v15, v9

    .line 318
    if-eqz v15, :cond_15

    .line 319
    .line 320
    add-int/lit8 v14, v14, 0x1

    .line 321
    .line 322
    if-ne v14, v8, :cond_12

    .line 323
    .line 324
    move-object v11, v13

    .line 325
    goto :goto_a

    .line 326
    :cond_12
    if-nez v12, :cond_13

    .line 327
    .line 328
    new-instance v12, Landroidx/compose/runtime/collection/MutableVector;

    .line 329
    .line 330
    new-array v15, v6, [Landroidx/compose/ui/Modifier$Node;

    .line 331
    .line 332
    invoke-direct {v12, v15, v3}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 333
    .line 334
    .line 335
    :cond_13
    if-eqz v11, :cond_14

    .line 336
    .line 337
    invoke-virtual {v12, v11}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    move-object v11, v7

    .line 341
    :cond_14
    invoke-virtual {v12, v13}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 342
    .line 343
    .line 344
    :cond_15
    :goto_a
    invoke-virtual {v13}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 345
    .line 346
    .line 347
    move-result-object v13

    .line 348
    goto :goto_9

    .line 349
    :cond_16
    if-ne v14, v8, :cond_17

    .line 350
    .line 351
    goto :goto_8

    .line 352
    :cond_17
    invoke-static {v12}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 353
    .line 354
    .line 355
    move-result-object v11

    .line 356
    goto :goto_8

    .line 357
    :cond_18
    invoke-virtual {v10}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 358
    .line 359
    .line 360
    move-result-object v10

    .line 361
    goto :goto_7

    .line 362
    :cond_19
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    .line 363
    .line 364
    .line 365
    move-result-object v2

    .line 366
    if-eqz v2, :cond_1a

    .line 367
    .line 368
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 369
    .line 370
    .line 371
    move-result-object v10

    .line 372
    if-eqz v10, :cond_1a

    .line 373
    .line 374
    invoke-virtual {v10}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 375
    .line 376
    .line 377
    move-result-object v10

    .line 378
    goto :goto_6

    .line 379
    :cond_1a
    move-object v10, v7

    .line 380
    goto :goto_6

    .line 381
    :cond_1b
    move-object v11, v7

    .line 382
    :goto_b
    check-cast v11, Landroidx/compose/ui/input/key/KeyInputModifierNode;

    .line 383
    .line 384
    if-eqz v11, :cond_1c

    .line 385
    .line 386
    invoke-interface {v11}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 387
    .line 388
    .line 389
    move-result-object v9

    .line 390
    goto :goto_c

    .line 391
    :cond_1c
    move-object v9, v7

    .line 392
    :cond_1d
    :goto_c
    if-eqz v9, :cond_40

    .line 393
    .line 394
    invoke-static {v5}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 395
    .line 396
    .line 397
    move-result v2

    .line 398
    invoke-interface {v9}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 399
    .line 400
    .line 401
    move-result-object v5

    .line 402
    invoke-virtual {v5}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 403
    .line 404
    .line 405
    move-result v5

    .line 406
    if-nez v5, :cond_1e

    .line 407
    .line 408
    invoke-static {v4}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    :cond_1e
    invoke-interface {v9}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 412
    .line 413
    .line 414
    move-result-object v4

    .line 415
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 416
    .line 417
    .line 418
    move-result-object v4

    .line 419
    invoke-static {v9}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    .line 420
    .line 421
    .line 422
    move-result-object v5

    .line 423
    move-object v10, v7

    .line 424
    :goto_d
    if-eqz v5, :cond_2a

    .line 425
    .line 426
    invoke-virtual {v5}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 427
    .line 428
    .line 429
    move-result-object v11

    .line 430
    invoke-virtual {v11}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 431
    .line 432
    .line 433
    move-result-object v11

    .line 434
    invoke-virtual {v11}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    .line 435
    .line 436
    .line 437
    move-result v11

    .line 438
    and-int/2addr v11, v2

    .line 439
    if-eqz v11, :cond_28

    .line 440
    .line 441
    :goto_e
    if-eqz v4, :cond_28

    .line 442
    .line 443
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 444
    .line 445
    .line 446
    move-result v11

    .line 447
    and-int/2addr v11, v2

    .line 448
    if-eqz v11, :cond_27

    .line 449
    .line 450
    move-object v11, v4

    .line 451
    move-object v12, v7

    .line 452
    :goto_f
    if-eqz v11, :cond_27

    .line 453
    .line 454
    instance-of v13, v11, Landroidx/compose/ui/input/key/KeyInputModifierNode;

    .line 455
    .line 456
    if-eqz v13, :cond_20

    .line 457
    .line 458
    if-nez v10, :cond_1f

    .line 459
    .line 460
    new-instance v10, Ljava/util/ArrayList;

    .line 461
    .line 462
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 463
    .line 464
    .line 465
    :cond_1f
    invoke-interface {v10, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 466
    .line 467
    .line 468
    goto :goto_12

    .line 469
    :cond_20
    invoke-virtual {v11}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 470
    .line 471
    .line 472
    move-result v13

    .line 473
    and-int/2addr v13, v2

    .line 474
    if-eqz v13, :cond_26

    .line 475
    .line 476
    instance-of v13, v11, Landroidx/compose/ui/node/DelegatingNode;

    .line 477
    .line 478
    if-eqz v13, :cond_26

    .line 479
    .line 480
    move-object v13, v11

    .line 481
    check-cast v13, Landroidx/compose/ui/node/DelegatingNode;

    .line 482
    .line 483
    invoke-virtual {v13}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 484
    .line 485
    .line 486
    move-result-object v13

    .line 487
    move v14, v3

    .line 488
    :goto_10
    if-eqz v13, :cond_25

    .line 489
    .line 490
    invoke-virtual {v13}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 491
    .line 492
    .line 493
    move-result v15

    .line 494
    and-int/2addr v15, v2

    .line 495
    if-eqz v15, :cond_24

    .line 496
    .line 497
    add-int/lit8 v14, v14, 0x1

    .line 498
    .line 499
    if-ne v14, v8, :cond_21

    .line 500
    .line 501
    move-object v11, v13

    .line 502
    goto :goto_11

    .line 503
    :cond_21
    if-nez v12, :cond_22

    .line 504
    .line 505
    new-instance v12, Landroidx/compose/runtime/collection/MutableVector;

    .line 506
    .line 507
    new-array v15, v6, [Landroidx/compose/ui/Modifier$Node;

    .line 508
    .line 509
    invoke-direct {v12, v15, v3}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 510
    .line 511
    .line 512
    :cond_22
    if-eqz v11, :cond_23

    .line 513
    .line 514
    invoke-virtual {v12, v11}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 515
    .line 516
    .line 517
    move-object v11, v7

    .line 518
    :cond_23
    invoke-virtual {v12, v13}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 519
    .line 520
    .line 521
    :cond_24
    :goto_11
    invoke-virtual {v13}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 522
    .line 523
    .line 524
    move-result-object v13

    .line 525
    goto :goto_10

    .line 526
    :cond_25
    if-ne v14, v8, :cond_26

    .line 527
    .line 528
    goto :goto_f

    .line 529
    :cond_26
    :goto_12
    invoke-static {v12}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 530
    .line 531
    .line 532
    move-result-object v11

    .line 533
    goto :goto_f

    .line 534
    :cond_27
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 535
    .line 536
    .line 537
    move-result-object v4

    .line 538
    goto :goto_e

    .line 539
    :cond_28
    invoke-virtual {v5}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    .line 540
    .line 541
    .line 542
    move-result-object v5

    .line 543
    if-eqz v5, :cond_29

    .line 544
    .line 545
    invoke-virtual {v5}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 546
    .line 547
    .line 548
    move-result-object v4

    .line 549
    if-eqz v4, :cond_29

    .line 550
    .line 551
    invoke-virtual {v4}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 552
    .line 553
    .line 554
    move-result-object v4

    .line 555
    goto/16 :goto_d

    .line 556
    .line 557
    :cond_29
    move-object v4, v7

    .line 558
    goto/16 :goto_d

    .line 559
    .line 560
    :cond_2a
    if-eqz v10, :cond_2d

    .line 561
    .line 562
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 563
    .line 564
    .line 565
    move-result v4

    .line 566
    add-int/lit8 v4, v4, -0x1

    .line 567
    .line 568
    if-ltz v4, :cond_2d

    .line 569
    .line 570
    :goto_13
    add-int/lit8 v5, v4, -0x1

    .line 571
    .line 572
    invoke-interface {v10, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 573
    .line 574
    .line 575
    move-result-object v4

    .line 576
    check-cast v4, Landroidx/compose/ui/input/key/KeyInputModifierNode;

    .line 577
    .line 578
    invoke-interface {v4, v0}, Landroidx/compose/ui/input/key/KeyInputModifierNode;->onPreKeyEvent-ZmokQxo(Landroid/view/KeyEvent;)Z

    .line 579
    .line 580
    .line 581
    move-result v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 582
    if-eqz v4, :cond_2b

    .line 583
    .line 584
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 585
    .line 586
    .line 587
    return v8

    .line 588
    :cond_2b
    if-gez v5, :cond_2c

    .line 589
    .line 590
    goto :goto_14

    .line 591
    :cond_2c
    move v4, v5

    .line 592
    goto :goto_13

    .line 593
    :cond_2d
    :goto_14
    :try_start_4
    invoke-interface {v9}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 594
    .line 595
    .line 596
    move-result-object v4

    .line 597
    new-instance v5, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 598
    .line 599
    invoke-direct {v5}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 600
    .line 601
    .line 602
    new-instance v11, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 603
    .line 604
    invoke-direct {v11}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 605
    .line 606
    .line 607
    iput-object v4, v11, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 608
    .line 609
    :goto_15
    iget-object v4, v11, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 610
    .line 611
    if-eqz v4, :cond_35

    .line 612
    .line 613
    instance-of v12, v4, Landroidx/compose/ui/input/key/KeyInputModifierNode;

    .line 614
    .line 615
    if-eqz v12, :cond_2e

    .line 616
    .line 617
    check-cast v4, Landroidx/compose/ui/input/key/KeyInputModifierNode;

    .line 618
    .line 619
    invoke-interface {v4, v0}, Landroidx/compose/ui/input/key/KeyInputModifierNode;->onPreKeyEvent-ZmokQxo(Landroid/view/KeyEvent;)Z

    .line 620
    .line 621
    .line 622
    move-result v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 623
    if-eqz v4, :cond_34

    .line 624
    .line 625
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 626
    .line 627
    .line 628
    return v8

    .line 629
    :cond_2e
    :try_start_5
    check-cast v4, Landroidx/compose/ui/Modifier$Node;

    .line 630
    .line 631
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 632
    .line 633
    .line 634
    move-result v4

    .line 635
    and-int/2addr v4, v2

    .line 636
    if-eqz v4, :cond_34

    .line 637
    .line 638
    iget-object v4, v11, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 639
    .line 640
    instance-of v12, v4, Landroidx/compose/ui/node/DelegatingNode;

    .line 641
    .line 642
    if-eqz v12, :cond_34

    .line 643
    .line 644
    check-cast v4, Landroidx/compose/ui/node/DelegatingNode;

    .line 645
    .line 646
    invoke-virtual {v4}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 647
    .line 648
    .line 649
    move-result-object v4

    .line 650
    move v12, v3

    .line 651
    :goto_16
    if-eqz v4, :cond_33

    .line 652
    .line 653
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 654
    .line 655
    .line 656
    move-result v13

    .line 657
    and-int/2addr v13, v2

    .line 658
    if-eqz v13, :cond_32

    .line 659
    .line 660
    add-int/lit8 v12, v12, 0x1

    .line 661
    .line 662
    if-ne v12, v8, :cond_2f

    .line 663
    .line 664
    iput-object v4, v11, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 665
    .line 666
    goto :goto_17

    .line 667
    :cond_2f
    iget-object v13, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 668
    .line 669
    check-cast v13, Landroidx/compose/runtime/collection/MutableVector;

    .line 670
    .line 671
    if-nez v13, :cond_30

    .line 672
    .line 673
    new-instance v13, Landroidx/compose/runtime/collection/MutableVector;

    .line 674
    .line 675
    new-array v14, v6, [Landroidx/compose/ui/Modifier$Node;

    .line 676
    .line 677
    invoke-direct {v13, v14, v3}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 678
    .line 679
    .line 680
    :cond_30
    iput-object v13, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 681
    .line 682
    iget-object v14, v11, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 683
    .line 684
    check-cast v14, Landroidx/compose/ui/Modifier$Node;

    .line 685
    .line 686
    if-eqz v14, :cond_31

    .line 687
    .line 688
    invoke-virtual {v13, v14}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 689
    .line 690
    .line 691
    iput-object v7, v11, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 692
    .line 693
    :cond_31
    iget-object v13, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 694
    .line 695
    check-cast v13, Landroidx/compose/runtime/collection/MutableVector;

    .line 696
    .line 697
    if-eqz v13, :cond_32

    .line 698
    .line 699
    invoke-virtual {v13, v4}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 700
    .line 701
    .line 702
    :cond_32
    :goto_17
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 703
    .line 704
    .line 705
    move-result-object v4

    .line 706
    goto :goto_16

    .line 707
    :cond_33
    if-ne v12, v8, :cond_34

    .line 708
    .line 709
    goto :goto_15

    .line 710
    :cond_34
    iget-object v4, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 711
    .line 712
    check-cast v4, Landroidx/compose/runtime/collection/MutableVector;

    .line 713
    .line 714
    invoke-static {v4}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 715
    .line 716
    .line 717
    move-result-object v4

    .line 718
    iput-object v4, v11, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 719
    .line 720
    goto :goto_15

    .line 721
    :cond_35
    invoke-interface/range {p2 .. p2}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 722
    .line 723
    .line 724
    move-result-object v4

    .line 725
    check-cast v4, Ljava/lang/Boolean;

    .line 726
    .line 727
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 728
    .line 729
    .line 730
    move-result v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 731
    if-eqz v4, :cond_36

    .line 732
    .line 733
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 734
    .line 735
    .line 736
    return v8

    .line 737
    :cond_36
    :try_start_6
    invoke-interface {v9}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 738
    .line 739
    .line 740
    move-result-object v4

    .line 741
    new-instance v5, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 742
    .line 743
    invoke-direct {v5}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 744
    .line 745
    .line 746
    new-instance v9, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 747
    .line 748
    invoke-direct {v9}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 749
    .line 750
    .line 751
    iput-object v4, v9, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 752
    .line 753
    :goto_18
    iget-object v4, v9, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 754
    .line 755
    if-eqz v4, :cond_3e

    .line 756
    .line 757
    instance-of v11, v4, Landroidx/compose/ui/input/key/KeyInputModifierNode;

    .line 758
    .line 759
    if-eqz v11, :cond_37

    .line 760
    .line 761
    check-cast v4, Landroidx/compose/ui/input/key/KeyInputModifierNode;

    .line 762
    .line 763
    invoke-interface {v4, v0}, Landroidx/compose/ui/input/key/KeyInputModifierNode;->onKeyEvent-ZmokQxo(Landroid/view/KeyEvent;)Z

    .line 764
    .line 765
    .line 766
    move-result v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 767
    if-eqz v4, :cond_3d

    .line 768
    .line 769
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 770
    .line 771
    .line 772
    return v8

    .line 773
    :cond_37
    :try_start_7
    check-cast v4, Landroidx/compose/ui/Modifier$Node;

    .line 774
    .line 775
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 776
    .line 777
    .line 778
    move-result v4

    .line 779
    and-int/2addr v4, v2

    .line 780
    if-eqz v4, :cond_3d

    .line 781
    .line 782
    iget-object v4, v9, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 783
    .line 784
    instance-of v11, v4, Landroidx/compose/ui/node/DelegatingNode;

    .line 785
    .line 786
    if-eqz v11, :cond_3d

    .line 787
    .line 788
    check-cast v4, Landroidx/compose/ui/node/DelegatingNode;

    .line 789
    .line 790
    invoke-virtual {v4}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 791
    .line 792
    .line 793
    move-result-object v4

    .line 794
    move v11, v3

    .line 795
    :goto_19
    if-eqz v4, :cond_3c

    .line 796
    .line 797
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 798
    .line 799
    .line 800
    move-result v12

    .line 801
    and-int/2addr v12, v2

    .line 802
    if-eqz v12, :cond_3b

    .line 803
    .line 804
    add-int/lit8 v11, v11, 0x1

    .line 805
    .line 806
    if-ne v11, v8, :cond_38

    .line 807
    .line 808
    iput-object v4, v9, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 809
    .line 810
    goto :goto_1a

    .line 811
    :cond_38
    iget-object v12, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 812
    .line 813
    check-cast v12, Landroidx/compose/runtime/collection/MutableVector;

    .line 814
    .line 815
    if-nez v12, :cond_39

    .line 816
    .line 817
    new-instance v12, Landroidx/compose/runtime/collection/MutableVector;

    .line 818
    .line 819
    new-array v13, v6, [Landroidx/compose/ui/Modifier$Node;

    .line 820
    .line 821
    invoke-direct {v12, v13, v3}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 822
    .line 823
    .line 824
    :cond_39
    iput-object v12, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 825
    .line 826
    iget-object v13, v9, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 827
    .line 828
    check-cast v13, Landroidx/compose/ui/Modifier$Node;

    .line 829
    .line 830
    if-eqz v13, :cond_3a

    .line 831
    .line 832
    invoke-virtual {v12, v13}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 833
    .line 834
    .line 835
    iput-object v7, v9, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 836
    .line 837
    :cond_3a
    iget-object v12, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 838
    .line 839
    check-cast v12, Landroidx/compose/runtime/collection/MutableVector;

    .line 840
    .line 841
    if-eqz v12, :cond_3b

    .line 842
    .line 843
    invoke-virtual {v12, v4}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 844
    .line 845
    .line 846
    :cond_3b
    :goto_1a
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 847
    .line 848
    .line 849
    move-result-object v4

    .line 850
    goto :goto_19

    .line 851
    :cond_3c
    if-ne v11, v8, :cond_3d

    .line 852
    .line 853
    goto :goto_18

    .line 854
    :cond_3d
    iget-object v4, v5, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 855
    .line 856
    check-cast v4, Landroidx/compose/runtime/collection/MutableVector;

    .line 857
    .line 858
    invoke-static {v4}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 859
    .line 860
    .line 861
    move-result-object v4

    .line 862
    iput-object v4, v9, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 863
    .line 864
    goto :goto_18

    .line 865
    :cond_3e
    if-eqz v10, :cond_40

    .line 866
    .line 867
    invoke-interface {v10}, Ljava/util/Collection;->size()I

    .line 868
    .line 869
    .line 870
    move-result v2

    .line 871
    move v4, v3

    .line 872
    :goto_1b
    if-ge v4, v2, :cond_40

    .line 873
    .line 874
    invoke-interface {v10, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 875
    .line 876
    .line 877
    move-result-object v5

    .line 878
    check-cast v5, Landroidx/compose/ui/input/key/KeyInputModifierNode;

    .line 879
    .line 880
    invoke-interface {v5, v0}, Landroidx/compose/ui/input/key/KeyInputModifierNode;->onKeyEvent-ZmokQxo(Landroid/view/KeyEvent;)Z

    .line 881
    .line 882
    .line 883
    move-result v5
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 884
    if-eqz v5, :cond_3f

    .line 885
    .line 886
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 887
    .line 888
    .line 889
    return v8

    .line 890
    :cond_3f
    add-int/lit8 v4, v4, 0x1

    .line 891
    .line 892
    goto :goto_1b

    .line 893
    :cond_40
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 894
    .line 895
    .line 896
    return v3

    .line 897
    :goto_1c
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 898
    .line 899
    .line 900
    throw v0
.end method

.method public dispatchRotaryEvent(Landroidx/compose/ui/input/rotary/RotaryScrollEvent;Lr6/a;)Z
    .locals 16
    .param p1    # Landroidx/compose/ui/input/rotary/RotaryScrollEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/input/rotary/RotaryScrollEvent;",
            "Lr6/a;",
            ")Z"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v2, v1, Landroidx/compose/ui/focus/FocusOwnerImpl;->focusInvalidationManager:Landroidx/compose/ui/focus/FocusInvalidationManager;

    .line 6
    .line 7
    invoke-virtual {v2}, Landroidx/compose/ui/focus/FocusInvalidationManager;->hasPendingInvalidation()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    const-string v0, "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated."

    .line 15
    .line 16
    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 17
    .line 18
    invoke-virtual {v2, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return v3

    .line 22
    :cond_0
    invoke-direct {v1}, Landroidx/compose/ui/focus/FocusOwnerImpl;->findFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const-string/jumbo v4, "visitAncestors called on an unattached node"

    .line 27
    .line 28
    .line 29
    const/16 v5, 0x4000

    .line 30
    .line 31
    const/16 v6, 0x10

    .line 32
    .line 33
    const/4 v7, 0x0

    .line 34
    const/4 v8, 0x1

    .line 35
    if-eqz v2, :cond_d

    .line 36
    .line 37
    invoke-static {v5}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 38
    .line 39
    .line 40
    move-result v9

    .line 41
    invoke-interface {v2}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 42
    .line 43
    .line 44
    move-result-object v10

    .line 45
    invoke-virtual {v10}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 46
    .line 47
    .line 48
    move-result v10

    .line 49
    if-nez v10, :cond_1

    .line 50
    .line 51
    invoke-static {v4}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    invoke-interface {v2}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 55
    .line 56
    .line 57
    move-result-object v10

    .line 58
    invoke-static {v2}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    :goto_0
    if-eqz v2, :cond_c

    .line 63
    .line 64
    invoke-static {v2}, Landroidx/compose/material3/c;->c(Landroidx/compose/ui/node/LayoutNode;)I

    .line 65
    .line 66
    .line 67
    move-result v11

    .line 68
    and-int/2addr v11, v9

    .line 69
    if-eqz v11, :cond_a

    .line 70
    .line 71
    :goto_1
    if-eqz v10, :cond_a

    .line 72
    .line 73
    invoke-virtual {v10}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 74
    .line 75
    .line 76
    move-result v11

    .line 77
    and-int/2addr v11, v9

    .line 78
    if-eqz v11, :cond_9

    .line 79
    .line 80
    move-object v12, v7

    .line 81
    move-object v11, v10

    .line 82
    :goto_2
    if-eqz v11, :cond_9

    .line 83
    .line 84
    instance-of v13, v11, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;

    .line 85
    .line 86
    if-eqz v13, :cond_2

    .line 87
    .line 88
    goto :goto_5

    .line 89
    :cond_2
    invoke-virtual {v11}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 90
    .line 91
    .line 92
    move-result v13

    .line 93
    and-int/2addr v13, v9

    .line 94
    if-eqz v13, :cond_8

    .line 95
    .line 96
    instance-of v13, v11, Landroidx/compose/ui/node/DelegatingNode;

    .line 97
    .line 98
    if-eqz v13, :cond_8

    .line 99
    .line 100
    move-object v13, v11

    .line 101
    check-cast v13, Landroidx/compose/ui/node/DelegatingNode;

    .line 102
    .line 103
    invoke-virtual {v13}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 104
    .line 105
    .line 106
    move-result-object v13

    .line 107
    move v14, v3

    .line 108
    :goto_3
    if-eqz v13, :cond_7

    .line 109
    .line 110
    invoke-virtual {v13}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 111
    .line 112
    .line 113
    move-result v15

    .line 114
    and-int/2addr v15, v9

    .line 115
    if-eqz v15, :cond_6

    .line 116
    .line 117
    add-int/lit8 v14, v14, 0x1

    .line 118
    .line 119
    if-ne v14, v8, :cond_3

    .line 120
    .line 121
    move-object v11, v13

    .line 122
    goto :goto_4

    .line 123
    :cond_3
    if-nez v12, :cond_4

    .line 124
    .line 125
    new-instance v12, Landroidx/compose/runtime/collection/MutableVector;

    .line 126
    .line 127
    new-array v15, v6, [Landroidx/compose/ui/Modifier$Node;

    .line 128
    .line 129
    invoke-direct {v12, v15, v3}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 130
    .line 131
    .line 132
    :cond_4
    if-eqz v11, :cond_5

    .line 133
    .line 134
    invoke-virtual {v12, v11}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-object v11, v7

    .line 138
    :cond_5
    invoke-virtual {v12, v13}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    :cond_6
    :goto_4
    invoke-virtual {v13}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 142
    .line 143
    .line 144
    move-result-object v13

    .line 145
    goto :goto_3

    .line 146
    :cond_7
    if-ne v14, v8, :cond_8

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_8
    invoke-static {v12}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 150
    .line 151
    .line 152
    move-result-object v11

    .line 153
    goto :goto_2

    .line 154
    :cond_9
    invoke-virtual {v10}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 155
    .line 156
    .line 157
    move-result-object v10

    .line 158
    goto :goto_1

    .line 159
    :cond_a
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    if-eqz v2, :cond_b

    .line 164
    .line 165
    invoke-virtual {v2}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 166
    .line 167
    .line 168
    move-result-object v10

    .line 169
    if-eqz v10, :cond_b

    .line 170
    .line 171
    invoke-virtual {v10}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 172
    .line 173
    .line 174
    move-result-object v10

    .line 175
    goto :goto_0

    .line 176
    :cond_b
    move-object v10, v7

    .line 177
    goto :goto_0

    .line 178
    :cond_c
    move-object v11, v7

    .line 179
    :goto_5
    check-cast v11, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;

    .line 180
    .line 181
    goto :goto_6

    .line 182
    :cond_d
    move-object v11, v7

    .line 183
    :goto_6
    if-eqz v11, :cond_30

    .line 184
    .line 185
    invoke-static {v5}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    invoke-interface {v11}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 190
    .line 191
    .line 192
    move-result-object v5

    .line 193
    invoke-virtual {v5}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    .line 194
    .line 195
    .line 196
    move-result v5

    .line 197
    if-nez v5, :cond_e

    .line 198
    .line 199
    invoke-static {v4}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    :cond_e
    invoke-interface {v11}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    invoke-static {v11}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    .line 211
    .line 212
    .line 213
    move-result-object v5

    .line 214
    move-object v9, v7

    .line 215
    :goto_7
    if-eqz v5, :cond_1a

    .line 216
    .line 217
    invoke-static {v5}, Landroidx/compose/material3/c;->c(Landroidx/compose/ui/node/LayoutNode;)I

    .line 218
    .line 219
    .line 220
    move-result v10

    .line 221
    and-int/2addr v10, v2

    .line 222
    if-eqz v10, :cond_18

    .line 223
    .line 224
    :goto_8
    if-eqz v4, :cond_18

    .line 225
    .line 226
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 227
    .line 228
    .line 229
    move-result v10

    .line 230
    and-int/2addr v10, v2

    .line 231
    if-eqz v10, :cond_17

    .line 232
    .line 233
    move-object v10, v4

    .line 234
    move-object v12, v7

    .line 235
    :goto_9
    if-eqz v10, :cond_17

    .line 236
    .line 237
    instance-of v13, v10, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;

    .line 238
    .line 239
    if-eqz v13, :cond_10

    .line 240
    .line 241
    if-nez v9, :cond_f

    .line 242
    .line 243
    new-instance v9, Ljava/util/ArrayList;

    .line 244
    .line 245
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 246
    .line 247
    .line 248
    :cond_f
    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    goto :goto_c

    .line 252
    :cond_10
    invoke-virtual {v10}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 253
    .line 254
    .line 255
    move-result v13

    .line 256
    and-int/2addr v13, v2

    .line 257
    if-eqz v13, :cond_16

    .line 258
    .line 259
    instance-of v13, v10, Landroidx/compose/ui/node/DelegatingNode;

    .line 260
    .line 261
    if-eqz v13, :cond_16

    .line 262
    .line 263
    move-object v13, v10

    .line 264
    check-cast v13, Landroidx/compose/ui/node/DelegatingNode;

    .line 265
    .line 266
    invoke-virtual {v13}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 267
    .line 268
    .line 269
    move-result-object v13

    .line 270
    move v14, v3

    .line 271
    :goto_a
    if-eqz v13, :cond_15

    .line 272
    .line 273
    invoke-virtual {v13}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 274
    .line 275
    .line 276
    move-result v15

    .line 277
    and-int/2addr v15, v2

    .line 278
    if-eqz v15, :cond_14

    .line 279
    .line 280
    add-int/lit8 v14, v14, 0x1

    .line 281
    .line 282
    if-ne v14, v8, :cond_11

    .line 283
    .line 284
    move-object v10, v13

    .line 285
    goto :goto_b

    .line 286
    :cond_11
    if-nez v12, :cond_12

    .line 287
    .line 288
    new-instance v12, Landroidx/compose/runtime/collection/MutableVector;

    .line 289
    .line 290
    new-array v15, v6, [Landroidx/compose/ui/Modifier$Node;

    .line 291
    .line 292
    invoke-direct {v12, v15, v3}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 293
    .line 294
    .line 295
    :cond_12
    if-eqz v10, :cond_13

    .line 296
    .line 297
    invoke-virtual {v12, v10}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    move-object v10, v7

    .line 301
    :cond_13
    invoke-virtual {v12, v13}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    :cond_14
    :goto_b
    invoke-virtual {v13}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 305
    .line 306
    .line 307
    move-result-object v13

    .line 308
    goto :goto_a

    .line 309
    :cond_15
    if-ne v14, v8, :cond_16

    .line 310
    .line 311
    goto :goto_9

    .line 312
    :cond_16
    :goto_c
    invoke-static {v12}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 313
    .line 314
    .line 315
    move-result-object v10

    .line 316
    goto :goto_9

    .line 317
    :cond_17
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 318
    .line 319
    .line 320
    move-result-object v4

    .line 321
    goto :goto_8

    .line 322
    :cond_18
    invoke-virtual {v5}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    .line 323
    .line 324
    .line 325
    move-result-object v5

    .line 326
    if-eqz v5, :cond_19

    .line 327
    .line 328
    invoke-virtual {v5}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    .line 329
    .line 330
    .line 331
    move-result-object v4

    .line 332
    if-eqz v4, :cond_19

    .line 333
    .line 334
    invoke-virtual {v4}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 335
    .line 336
    .line 337
    move-result-object v4

    .line 338
    goto :goto_7

    .line 339
    :cond_19
    move-object v4, v7

    .line 340
    goto :goto_7

    .line 341
    :cond_1a
    if-eqz v9, :cond_1d

    .line 342
    .line 343
    invoke-interface {v9}, Ljava/util/Collection;->size()I

    .line 344
    .line 345
    .line 346
    move-result v4

    .line 347
    add-int/lit8 v4, v4, -0x1

    .line 348
    .line 349
    if-ltz v4, :cond_1d

    .line 350
    .line 351
    :goto_d
    add-int/lit8 v5, v4, -0x1

    .line 352
    .line 353
    invoke-interface {v9, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v4

    .line 357
    check-cast v4, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;

    .line 358
    .line 359
    invoke-interface {v4, v0}, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;->onPreRotaryScrollEvent(Landroidx/compose/ui/input/rotary/RotaryScrollEvent;)Z

    .line 360
    .line 361
    .line 362
    move-result v4

    .line 363
    if-eqz v4, :cond_1b

    .line 364
    .line 365
    return v8

    .line 366
    :cond_1b
    if-gez v5, :cond_1c

    .line 367
    .line 368
    goto :goto_e

    .line 369
    :cond_1c
    move v4, v5

    .line 370
    goto :goto_d

    .line 371
    :cond_1d
    :goto_e
    invoke-interface {v11}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 372
    .line 373
    .line 374
    move-result-object v4

    .line 375
    move-object v5, v7

    .line 376
    :goto_f
    if-eqz v4, :cond_25

    .line 377
    .line 378
    instance-of v10, v4, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;

    .line 379
    .line 380
    if-eqz v10, :cond_1e

    .line 381
    .line 382
    check-cast v4, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;

    .line 383
    .line 384
    invoke-interface {v4, v0}, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;->onPreRotaryScrollEvent(Landroidx/compose/ui/input/rotary/RotaryScrollEvent;)Z

    .line 385
    .line 386
    .line 387
    move-result v4

    .line 388
    if-eqz v4, :cond_24

    .line 389
    .line 390
    return v8

    .line 391
    :cond_1e
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 392
    .line 393
    .line 394
    move-result v10

    .line 395
    and-int/2addr v10, v2

    .line 396
    if-eqz v10, :cond_24

    .line 397
    .line 398
    instance-of v10, v4, Landroidx/compose/ui/node/DelegatingNode;

    .line 399
    .line 400
    if-eqz v10, :cond_24

    .line 401
    .line 402
    move-object v10, v4

    .line 403
    check-cast v10, Landroidx/compose/ui/node/DelegatingNode;

    .line 404
    .line 405
    invoke-virtual {v10}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 406
    .line 407
    .line 408
    move-result-object v10

    .line 409
    move v12, v3

    .line 410
    :goto_10
    if-eqz v10, :cond_23

    .line 411
    .line 412
    invoke-virtual {v10}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 413
    .line 414
    .line 415
    move-result v13

    .line 416
    and-int/2addr v13, v2

    .line 417
    if-eqz v13, :cond_22

    .line 418
    .line 419
    add-int/lit8 v12, v12, 0x1

    .line 420
    .line 421
    if-ne v12, v8, :cond_1f

    .line 422
    .line 423
    move-object v4, v10

    .line 424
    goto :goto_11

    .line 425
    :cond_1f
    if-nez v5, :cond_20

    .line 426
    .line 427
    new-instance v5, Landroidx/compose/runtime/collection/MutableVector;

    .line 428
    .line 429
    new-array v13, v6, [Landroidx/compose/ui/Modifier$Node;

    .line 430
    .line 431
    invoke-direct {v5, v13, v3}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 432
    .line 433
    .line 434
    :cond_20
    if-eqz v4, :cond_21

    .line 435
    .line 436
    invoke-virtual {v5, v4}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 437
    .line 438
    .line 439
    move-object v4, v7

    .line 440
    :cond_21
    invoke-virtual {v5, v10}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 441
    .line 442
    .line 443
    :cond_22
    :goto_11
    invoke-virtual {v10}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 444
    .line 445
    .line 446
    move-result-object v10

    .line 447
    goto :goto_10

    .line 448
    :cond_23
    if-ne v12, v8, :cond_24

    .line 449
    .line 450
    goto :goto_f

    .line 451
    :cond_24
    invoke-static {v5}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 452
    .line 453
    .line 454
    move-result-object v4

    .line 455
    goto :goto_f

    .line 456
    :cond_25
    invoke-interface/range {p2 .. p2}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v4

    .line 460
    check-cast v4, Ljava/lang/Boolean;

    .line 461
    .line 462
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 463
    .line 464
    .line 465
    move-result v4

    .line 466
    if-eqz v4, :cond_26

    .line 467
    .line 468
    return v8

    .line 469
    :cond_26
    invoke-interface {v11}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    .line 470
    .line 471
    .line 472
    move-result-object v4

    .line 473
    move-object v5, v7

    .line 474
    :goto_12
    if-eqz v4, :cond_2e

    .line 475
    .line 476
    instance-of v10, v4, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;

    .line 477
    .line 478
    if-eqz v10, :cond_27

    .line 479
    .line 480
    check-cast v4, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;

    .line 481
    .line 482
    invoke-interface {v4, v0}, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;->onRotaryScrollEvent(Landroidx/compose/ui/input/rotary/RotaryScrollEvent;)Z

    .line 483
    .line 484
    .line 485
    move-result v4

    .line 486
    if-eqz v4, :cond_2d

    .line 487
    .line 488
    return v8

    .line 489
    :cond_27
    invoke-virtual {v4}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 490
    .line 491
    .line 492
    move-result v10

    .line 493
    and-int/2addr v10, v2

    .line 494
    if-eqz v10, :cond_2d

    .line 495
    .line 496
    instance-of v10, v4, Landroidx/compose/ui/node/DelegatingNode;

    .line 497
    .line 498
    if-eqz v10, :cond_2d

    .line 499
    .line 500
    move-object v10, v4

    .line 501
    check-cast v10, Landroidx/compose/ui/node/DelegatingNode;

    .line 502
    .line 503
    invoke-virtual {v10}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 504
    .line 505
    .line 506
    move-result-object v10

    .line 507
    move v11, v3

    .line 508
    :goto_13
    if-eqz v10, :cond_2c

    .line 509
    .line 510
    invoke-virtual {v10}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    .line 511
    .line 512
    .line 513
    move-result v12

    .line 514
    and-int/2addr v12, v2

    .line 515
    if-eqz v12, :cond_2b

    .line 516
    .line 517
    add-int/lit8 v11, v11, 0x1

    .line 518
    .line 519
    if-ne v11, v8, :cond_28

    .line 520
    .line 521
    move-object v4, v10

    .line 522
    goto :goto_14

    .line 523
    :cond_28
    if-nez v5, :cond_29

    .line 524
    .line 525
    new-instance v5, Landroidx/compose/runtime/collection/MutableVector;

    .line 526
    .line 527
    new-array v12, v6, [Landroidx/compose/ui/Modifier$Node;

    .line 528
    .line 529
    invoke-direct {v5, v12, v3}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 530
    .line 531
    .line 532
    :cond_29
    if-eqz v4, :cond_2a

    .line 533
    .line 534
    invoke-virtual {v5, v4}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 535
    .line 536
    .line 537
    move-object v4, v7

    .line 538
    :cond_2a
    invoke-virtual {v5, v10}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 539
    .line 540
    .line 541
    :cond_2b
    :goto_14
    invoke-virtual {v10}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    .line 542
    .line 543
    .line 544
    move-result-object v10

    .line 545
    goto :goto_13

    .line 546
    :cond_2c
    if-ne v11, v8, :cond_2d

    .line 547
    .line 548
    goto :goto_12

    .line 549
    :cond_2d
    invoke-static {v5}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    .line 550
    .line 551
    .line 552
    move-result-object v4

    .line 553
    goto :goto_12

    .line 554
    :cond_2e
    if-eqz v9, :cond_30

    .line 555
    .line 556
    invoke-interface {v9}, Ljava/util/Collection;->size()I

    .line 557
    .line 558
    .line 559
    move-result v2

    .line 560
    move v4, v3

    .line 561
    :goto_15
    if-ge v4, v2, :cond_30

    .line 562
    .line 563
    invoke-interface {v9, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 564
    .line 565
    .line 566
    move-result-object v5

    .line 567
    check-cast v5, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;

    .line 568
    .line 569
    invoke-interface {v5, v0}, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;->onRotaryScrollEvent(Landroidx/compose/ui/input/rotary/RotaryScrollEvent;)Z

    .line 570
    .line 571
    .line 572
    move-result v5

    .line 573
    if-eqz v5, :cond_2f

    .line 574
    .line 575
    return v8

    .line 576
    :cond_2f
    add-int/lit8 v4, v4, 0x1

    .line 577
    .line 578
    goto :goto_15

    .line 579
    :cond_30
    return v3
.end method

.method public focusSearch-ULY8qGw(ILandroidx/compose/ui/geometry/Rect;Lr6/c;)Ljava/lang/Boolean;
    .locals 5
    .param p2    # Landroidx/compose/ui/geometry/Rect;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroidx/compose/ui/geometry/Rect;",
            "Lr6/c;",
            ")",
            "Ljava/lang/Boolean;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->findFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    iget-object v2, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->onLayoutDirection:Lr6/a;

    .line 9
    .line 10
    invoke-interface {v2}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, Landroidx/compose/ui/unit/LayoutDirection;

    .line 15
    .line 16
    invoke-static {v0, p1, v2}, Landroidx/compose/ui/focus/FocusTraversalKt;->customFocusSearch--OM-vw8(Landroidx/compose/ui/focus/FocusTargetNode;ILandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/focus/FocusRequester;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    sget-object v3, Landroidx/compose/ui/focus/FocusRequester;->Companion:Landroidx/compose/ui/focus/FocusRequester$Companion;

    .line 21
    .line 22
    invoke-virtual {v3}, Landroidx/compose/ui/focus/FocusRequester$Companion;->getCancel()Landroidx/compose/ui/focus/FocusRequester;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-eqz v4, :cond_0

    .line 31
    .line 32
    return-object v1

    .line 33
    :cond_0
    invoke-virtual {v3}, Landroidx/compose/ui/focus/FocusRequester$Companion;->getRedirect$ui_release()Landroidx/compose/ui/focus/FocusRequester;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_2

    .line 42
    .line 43
    invoke-direct {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->findFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-eqz p1, :cond_1

    .line 48
    .line 49
    invoke-interface {p3, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, Ljava/lang/Boolean;

    .line 54
    .line 55
    return-object p1

    .line 56
    :cond_1
    return-object v1

    .line 57
    :cond_2
    invoke-virtual {v3}, Landroidx/compose/ui/focus/FocusRequester$Companion;->getDefault()Landroidx/compose/ui/focus/FocusRequester;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-nez v1, :cond_4

    .line 66
    .line 67
    invoke-virtual {v2, p3}, Landroidx/compose/ui/focus/FocusRequester;->findFocusTargetNode$ui_release(Lr6/c;)Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    return-object p1

    .line 76
    :cond_3
    move-object v0, v1

    .line 77
    :cond_4
    iget-object v1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 78
    .line 79
    iget-object v2, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->onLayoutDirection:Lr6/a;

    .line 80
    .line 81
    invoke-interface {v2}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    check-cast v2, Landroidx/compose/ui/unit/LayoutDirection;

    .line 86
    .line 87
    new-instance v3, Landroidx/compose/ui/focus/FocusOwnerImpl$focusSearch$1;

    .line 88
    .line 89
    invoke-direct {v3, v0, p0, p3}, Landroidx/compose/ui/focus/FocusOwnerImpl$focusSearch$1;-><init>(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusOwnerImpl;Lr6/c;)V

    .line 90
    .line 91
    .line 92
    invoke-static {v1, p1, v2, p2, v3}, Landroidx/compose/ui/focus/FocusTraversalKt;->focusSearch-0X8WOeE(Landroidx/compose/ui/focus/FocusTargetNode;ILandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/geometry/Rect;Lr6/c;)Ljava/lang/Boolean;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    return-object p1
.end method

.method public getActiveFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->activeFocusTargetNode:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 2
    .line 3
    return-object v0
.end method

.method public getFocusRect()Landroidx/compose/ui/geometry/Rect;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->findFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTraversalKt;->focusRect(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/geometry/Rect;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return-object v0
.end method

.method public getFocusTransactionManager()Landroidx/compose/ui/focus/FocusTransactionManager;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->focusTransactionManager:Landroidx/compose/ui/focus/FocusTransactionManager;

    .line 2
    .line 3
    return-object v0
.end method

.method public getListeners()Landroidx/collection/MutableObjectList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/collection/MutableObjectList<",
            "Landroidx/compose/ui/focus/FocusListener;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->listeners:Landroidx/collection/MutableObjectList;

    .line 2
    .line 3
    return-object v0
.end method

.method public getModifier()Landroidx/compose/ui/Modifier;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->modifier:Landroidx/compose/ui/Modifier;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRootFocusNode$ui_release()Landroidx/compose/ui/focus/FocusTargetNode;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRootState()Landroidx/compose/ui/focus/FocusState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public isFocusCaptured()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->isFocusCaptured:Z

    .line 2
    .line 3
    return v0
.end method

.method public moveFocus-3ESFkO8(I)Z
    .locals 8

    .line 1
    sget-boolean v0, Landroidx/compose/ui/ComposeUiFlags;->isViewFocusFixEnabled:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->onMoveFocusInterop:Lr6/c;

    .line 7
    .line 8
    invoke-static {p1}, Landroidx/compose/ui/focus/FocusDirection;->box-impl(I)Landroidx/compose/ui/focus/FocusDirection;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-interface {v0, v2}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    return v1

    .line 25
    :cond_0
    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 26
    .line 27
    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 28
    .line 29
    .line 30
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 31
    .line 32
    iput-object v2, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 33
    .line 34
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->getFocusTransactionManager()Landroidx/compose/ui/focus/FocusTransactionManager;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v2}, Landroidx/compose/ui/focus/FocusTransactionManager;->getGeneration()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->getActiveFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    iget-object v4, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->onFocusRectInterop:Lr6/a;

    .line 47
    .line 48
    invoke-interface {v4}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    check-cast v4, Landroidx/compose/ui/geometry/Rect;

    .line 53
    .line 54
    new-instance v5, Landroidx/compose/ui/focus/FocusOwnerImpl$moveFocus$focusSearchSuccess$1;

    .line 55
    .line 56
    invoke-direct {v5, v0, p1}, Landroidx/compose/ui/focus/FocusOwnerImpl$moveFocus$focusSearchSuccess$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, p1, v4, v5}, Landroidx/compose/ui/focus/FocusOwnerImpl;->focusSearch-ULY8qGw(ILandroidx/compose/ui/geometry/Rect;Lr6/c;)Ljava/lang/Boolean;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->getFocusTransactionManager()Landroidx/compose/ui/focus/FocusTransactionManager;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    invoke-virtual {v5}, Landroidx/compose/ui/focus/FocusTransactionManager;->getGeneration()I

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 72
    .line 73
    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v7

    .line 77
    if-eqz v7, :cond_2

    .line 78
    .line 79
    if-ne v2, v5, :cond_1

    .line 80
    .line 81
    sget-boolean v2, Landroidx/compose/ui/ComposeUiFlags;->isTrackFocusEnabled:Z

    .line 82
    .line 83
    if-eqz v2, :cond_2

    .line 84
    .line 85
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->getActiveFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    if-eq v3, v2, :cond_2

    .line 90
    .line 91
    :cond_1
    return v1

    .line 92
    :cond_2
    const/4 v2, 0x0

    .line 93
    if-eqz v4, :cond_7

    .line 94
    .line 95
    iget-object v3, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 96
    .line 97
    if-nez v3, :cond_3

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_3
    invoke-virtual {v4, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    if-eqz v3, :cond_4

    .line 105
    .line 106
    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 107
    .line 108
    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-eqz v0, :cond_4

    .line 113
    .line 114
    return v1

    .line 115
    :cond_4
    invoke-static {p1}, Landroidx/compose/ui/focus/FocusOwnerImplKt;->is1dFocusSearch-3ESFkO8(I)Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    if-eqz v0, :cond_6

    .line 120
    .line 121
    invoke-virtual {p0, v2, v1, v2, p1}, Landroidx/compose/ui/focus/FocusOwnerImpl;->clearFocus-I7lrPNg(ZZZI)Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-eqz v0, :cond_5

    .line 126
    .line 127
    const/4 v0, 0x0

    .line 128
    invoke-virtual {p0, p1, v0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->takeFocus-aToIllA(ILandroidx/compose/ui/geometry/Rect;)Z

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    if-eqz p1, :cond_5

    .line 133
    .line 134
    return v1

    .line 135
    :cond_5
    return v2

    .line 136
    :cond_6
    sget-boolean v0, Landroidx/compose/ui/ComposeUiFlags;->isViewFocusFixEnabled:Z

    .line 137
    .line 138
    if-nez v0, :cond_7

    .line 139
    .line 140
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->onMoveFocusInterop:Lr6/c;

    .line 141
    .line 142
    invoke-static {p1}, Landroidx/compose/ui/focus/FocusDirection;->box-impl(I)Landroidx/compose/ui/focus/FocusDirection;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-interface {v0, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    check-cast p1, Ljava/lang/Boolean;

    .line 151
    .line 152
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    if-eqz p1, :cond_7

    .line 157
    .line 158
    return v1

    .line 159
    :cond_7
    :goto_0
    return v2
.end method

.method public releaseFocus()V
    .locals 3

    .line 1
    sget-boolean v0, Landroidx/compose/ui/ComposeUiFlags;->isTrackFocusEnabled:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 7
    .line 8
    invoke-static {v0, v1, v1}, Landroidx/compose/ui/focus/FocusTransactionsKt;->clearFocus(Landroidx/compose/ui/focus/FocusTargetNode;ZZ)Z

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->getFocusTransactionManager()Landroidx/compose/ui/focus/FocusTransactionManager;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->getOngoingTransaction()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 23
    .line 24
    invoke-static {v0, v1, v1}, Landroidx/compose/ui/focus/FocusTransactionsKt;->clearFocus(Landroidx/compose/ui/focus/FocusTargetNode;ZZ)Z

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    :try_start_0
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$beginTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 29
    .line 30
    .line 31
    iget-object v2, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 32
    .line 33
    invoke-static {v2, v1, v1}, Landroidx/compose/ui/focus/FocusTransactionsKt;->clearFocus(Landroidx/compose/ui/focus/FocusTargetNode;ZZ)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$commitTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :catchall_0
    move-exception v1

    .line 41
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$commitTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 42
    .line 43
    .line 44
    throw v1
.end method

.method public requestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z
    .locals 1
    .param p1    # Landroidx/compose/ui/focus/FocusDirection;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/geometry/Rect;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->onRequestFocusForOwner:Lr6/e;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lr6/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public scheduleInvalidation(Landroidx/compose/ui/focus/FocusEventModifierNode;)V
    .locals 1
    .param p1    # Landroidx/compose/ui/focus/FocusEventModifierNode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 2
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->focusInvalidationManager:Landroidx/compose/ui/focus/FocusInvalidationManager;

    invoke-virtual {v0, p1}, Landroidx/compose/ui/focus/FocusInvalidationManager;->scheduleInvalidation(Landroidx/compose/ui/focus/FocusEventModifierNode;)V

    return-void
.end method

.method public scheduleInvalidation(Landroidx/compose/ui/focus/FocusPropertiesModifierNode;)V
    .locals 1
    .param p1    # Landroidx/compose/ui/focus/FocusPropertiesModifierNode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 3
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->focusInvalidationManager:Landroidx/compose/ui/focus/FocusInvalidationManager;

    invoke-virtual {v0, p1}, Landroidx/compose/ui/focus/FocusInvalidationManager;->scheduleInvalidation(Landroidx/compose/ui/focus/FocusPropertiesModifierNode;)V

    return-void
.end method

.method public scheduleInvalidation(Landroidx/compose/ui/focus/FocusTargetNode;)V
    .locals 1
    .param p1    # Landroidx/compose/ui/focus/FocusTargetNode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->focusInvalidationManager:Landroidx/compose/ui/focus/FocusInvalidationManager;

    invoke-virtual {v0, p1}, Landroidx/compose/ui/focus/FocusInvalidationManager;->scheduleInvalidation(Landroidx/compose/ui/focus/FocusTargetNode;)V

    return-void
.end method

.method public scheduleInvalidationForOwner()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->focusInvalidationManager:Landroidx/compose/ui/focus/FocusInvalidationManager;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusInvalidationManager;->scheduleInvalidationForOwner()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setActiveFocusTargetNode(Landroidx/compose/ui/focus/FocusTargetNode;)V
    .locals 5
    .param p1    # Landroidx/compose/ui/focus/FocusTargetNode;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->activeFocusTargetNode:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->activeFocusTargetNode:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    if-eq v0, p1, :cond_1

    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0, v1}, Landroidx/compose/ui/focus/FocusOwnerImpl;->setFocusCaptured(Z)V

    .line 11
    .line 12
    .line 13
    :cond_1
    sget-boolean v2, Landroidx/compose/ui/ComposeUiFlags;->isSemanticAutofillEnabled:Z

    .line 14
    .line 15
    if-eqz v2, :cond_2

    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->getListeners()Landroidx/collection/MutableObjectList;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iget-object v3, v2, Landroidx/collection/ObjectList;->content:[Ljava/lang/Object;

    .line 22
    .line 23
    iget v2, v2, Landroidx/collection/ObjectList;->_size:I

    .line 24
    .line 25
    :goto_0
    if-ge v1, v2, :cond_2

    .line 26
    .line 27
    aget-object v4, v3, v1

    .line 28
    .line 29
    check-cast v4, Landroidx/compose/ui/focus/FocusListener;

    .line 30
    .line 31
    invoke-interface {v4, v0, p1}, Landroidx/compose/ui/focus/FocusListener;->onFocusChanged(Landroidx/compose/ui/focus/FocusTargetModifierNode;Landroidx/compose/ui/focus/FocusTargetModifierNode;)V

    .line 32
    .line 33
    .line 34
    add-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    return-void
.end method

.method public setFocusCaptured(Z)V
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->getActiveFocusTargetNode()Landroidx/compose/ui/focus/FocusTargetNode;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    goto :goto_1

    .line 12
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 13
    :goto_1
    if-nez v0, :cond_2

    .line 14
    .line 15
    const-string v0, "Cannot capture focus when the active focus target node is unset"

    .line 16
    .line 17
    invoke-static {v0}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :cond_2
    iput-boolean p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->isFocusCaptured:Z

    .line 21
    .line 22
    return-void
.end method

.method public final setRootFocusNode$ui_release(Landroidx/compose/ui/focus/FocusTargetNode;)V
    .locals 0
    .param p1    # Landroidx/compose/ui/focus/FocusTargetNode;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 2
    .line 3
    return-void
.end method

.method public takeFocus-aToIllA(ILandroidx/compose/ui/geometry/Rect;)Z
    .locals 1
    .param p2    # Landroidx/compose/ui/geometry/Rect;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    new-instance v0, Landroidx/compose/ui/focus/FocusOwnerImpl$takeFocus$1;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroidx/compose/ui/focus/FocusOwnerImpl$takeFocus$1;-><init>(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1, p2, v0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->focusSearch-ULY8qGw(ILandroidx/compose/ui/geometry/Rect;Lr6/c;)Ljava/lang/Boolean;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    return p1
.end method
