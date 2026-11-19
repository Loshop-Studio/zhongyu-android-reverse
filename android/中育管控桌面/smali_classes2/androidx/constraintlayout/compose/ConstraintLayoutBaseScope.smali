.class public abstract Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$BaselineAnchor;,
        Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;,
        Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00c4\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u000c\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0014\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0002\u0008&\u0008\'\u0018\u00002\u00020\u0001:\u0006\u00a5\u0001\u00a6\u0001\u00a7\u0001B\u0007\u0008\u0016\u00a2\u0006\u0002\u0010\u0002B\u0011\u0008\u0000\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0016J\'\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0017\u0010!\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00170\u0015\u00a2\u0006\u0002\u0008\"J\'\u0010\u001d\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020$2\u0017\u0010!\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00170\u0015\u00a2\u0006\u0002\u0008\"J\'\u0010\u001d\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020&2\u0017\u0010!\u001a\u0013\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00170\u0015\u00a2\u0006\u0002\u0008\"J8\u0010\u001d\u001a\u00020\u00172\u0012\u0010\'\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020 0(\"\u00020 2\u0017\u0010!\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00170\u0015\u00a2\u0006\u0002\u0008\"\u00a2\u0006\u0002\u0010)J.\u0010*\u001a\u00020+2\u0012\u0010,\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020-0(\"\u00020-2\u0008\u0008\u0002\u0010.\u001a\u00020/\u00f8\u0001\u0000\u00a2\u0006\u0004\u00080\u00101J.\u00102\u001a\u00020+2\u0012\u0010,\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020-0(\"\u00020-2\u0008\u0008\u0002\u0010.\u001a\u00020/\u00f8\u0001\u0000\u00a2\u0006\u0004\u00083\u00101J.\u00104\u001a\u0002052\u0012\u0010,\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020-0(\"\u00020-2\u0008\u0008\u0002\u0010.\u001a\u00020/\u00f8\u0001\u0000\u00a2\u0006\u0004\u00086\u00107J:\u00108\u001a\u00020 2\u0012\u0010,\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020-0(\"\u00020-2\u0008\u0008\u0002\u00109\u001a\u00020/2\u0008\u0008\u0002\u0010:\u001a\u00020;H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008<\u0010=J.\u0010>\u001a\u00020+2\u0012\u0010,\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020-0(\"\u00020-2\u0008\u0008\u0002\u0010.\u001a\u00020/\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008?\u00101J\u00be\u0001\u0010@\u001a\u00020 2\u0016\u0010,\u001a\u000c\u0012\u0008\u0008\u0001\u0012\u0004\u0018\u00010-0(\"\u0004\u0018\u00010-2\u0008\u0008\u0002\u0010A\u001a\u00020B2\u0008\u0008\u0002\u0010C\u001a\u00020/2\u0008\u0008\u0002\u0010D\u001a\u00020/2\u0008\u0008\u0002\u0010E\u001a\u00020\u00072\u0008\u0008\u0002\u0010F\u001a\u00020/2\u0008\u0008\u0002\u0010G\u001a\u00020/2\u0008\u0008\u0002\u0010H\u001a\u00020/2\u0008\u0008\u0002\u0010I\u001a\u00020/2\u0008\u0008\u0002\u0010J\u001a\u00020K2\u0008\u0008\u0002\u0010L\u001a\u00020M2\u0008\u0008\u0002\u0010N\u001a\u00020O2\u0008\u0008\u0002\u0010P\u001a\u00020Q2\u0008\u0008\u0002\u0010R\u001a\u00020Q2\u0008\u0008\u0002\u0010S\u001a\u00020T2\u0008\u0008\u0002\u0010U\u001a\u00020T\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008V\u0010WJ\u00aa\u0001\u0010@\u001a\u00020 2\u0016\u0010,\u001a\u000c\u0012\u0008\u0008\u0001\u0012\u0004\u0018\u00010-0(\"\u0004\u0018\u00010-2\u0008\u0008\u0002\u0010A\u001a\u00020B2\u0008\u0008\u0002\u0010C\u001a\u00020/2\u0008\u0008\u0002\u0010D\u001a\u00020/2\u0008\u0008\u0002\u0010E\u001a\u00020\u00072\u0008\u0008\u0002\u0010X\u001a\u00020/2\u0008\u0008\u0002\u0010Y\u001a\u00020/2\u0008\u0008\u0002\u0010J\u001a\u00020K2\u0008\u0008\u0002\u0010L\u001a\u00020M2\u0008\u0008\u0002\u0010N\u001a\u00020O2\u0008\u0008\u0002\u0010P\u001a\u00020Q2\u0008\u0008\u0002\u0010R\u001a\u00020Q2\u0008\u0008\u0002\u0010S\u001a\u00020T2\u0008\u0008\u0002\u0010U\u001a\u00020T\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008Z\u0010[J\u00a0\u0001\u0010@\u001a\u00020 2\u0016\u0010,\u001a\u000c\u0012\u0008\u0008\u0001\u0012\u0004\u0018\u00010-0(\"\u0004\u0018\u00010-2\u0008\u0008\u0002\u0010A\u001a\u00020B2\u0008\u0008\u0002\u0010C\u001a\u00020/2\u0008\u0008\u0002\u0010D\u001a\u00020/2\u0008\u0008\u0002\u0010E\u001a\u00020\u00072\u0008\u0008\u0002\u0010\\\u001a\u00020/2\u0008\u0008\u0002\u0010J\u001a\u00020K2\u0008\u0008\u0002\u0010L\u001a\u00020M2\u0008\u0008\u0002\u0010N\u001a\u00020O2\u0008\u0008\u0002\u0010P\u001a\u00020Q2\u0008\u0008\u0002\u0010R\u001a\u00020Q2\u0008\u0008\u0002\u0010S\u001a\u00020T2\u0008\u0008\u0002\u0010U\u001a\u00020T\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008]\u0010^J\u0094\u0001\u0010_\u001a\u00020 2\u0012\u0010,\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020-0(\"\u00020-2\u0008\u0008\u0001\u0010`\u001a\u00020\u00072\u0008\u0008\u0001\u0010a\u001a\u00020\u00072\u0008\u0008\u0002\u0010b\u001a\u00020B2\u0008\u0008\u0002\u0010c\u001a\u00020/2\u0008\u0008\u0002\u0010d\u001a\u00020/2\u0008\u0008\u0002\u0010e\u001a\u00020;2\u0008\u0008\u0002\u0010f\u001a\u00020;2\u000e\u0008\u0002\u0010g\u001a\u0008\u0012\u0004\u0012\u00020h0(2\u000e\u0008\u0002\u0010i\u001a\u0008\u0012\u0004\u0012\u00020j0(2\u0008\u0008\u0002\u0010k\u001a\u00020l\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008m\u0010nJ\u0018\u0010o\u001a\u00020+2\u0006\u0010p\u001a\u00020/\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008q\u0010rJ\u000e\u0010o\u001a\u00020+2\u0006\u0010s\u001a\u00020QJ\u0018\u0010t\u001a\u00020+2\u0006\u0010p\u001a\u00020/\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008u\u0010rJ\u000e\u0010t\u001a\u00020+2\u0006\u0010s\u001a\u00020QJ\u0018\u0010v\u001a\u0002052\u0006\u0010p\u001a\u00020/\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008w\u0010xJ\u000e\u0010v\u001a\u0002052\u0006\u0010s\u001a\u00020QJ\u0018\u0010y\u001a\u00020+2\u0006\u0010p\u001a\u00020/\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008z\u0010rJ\u000e\u0010y\u001a\u00020+2\u0006\u0010s\u001a\u00020QJ\u0018\u0010{\u001a\u00020+2\u0006\u0010p\u001a\u00020/\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008|\u0010rJ\u000e\u0010{\u001a\u00020+2\u0006\u0010s\u001a\u00020QJ\u0018\u0010}\u001a\u0002052\u0006\u0010p\u001a\u00020/\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008~\u0010xJ\u000e\u0010}\u001a\u0002052\u0006\u0010s\u001a\u00020QJ\u0008\u0010\u007f\u001a\u00020\u0007H\u0002J-\u0010\u0080\u0001\u001a\u00020$2\u0012\u0010,\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020-0(\"\u00020-2\n\u0008\u0002\u0010\u0081\u0001\u001a\u00030\u0082\u0001\u00a2\u0006\u0003\u0010\u0083\u0001J<\u0010\u0084\u0001\u001a\u00020 2\u0012\u0010,\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020-0(\"\u00020-2\u0008\u0008\u0002\u00109\u001a\u00020/2\u0008\u0008\u0002\u0010:\u001a\u00020;H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0005\u0008\u0085\u0001\u0010=J0\u0010\u0086\u0001\u001a\u00020+2\u0012\u0010,\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020-0(\"\u00020-2\u0008\u0008\u0002\u0010.\u001a\u00020/\u00f8\u0001\u0000\u00a2\u0006\u0005\u0008\u0087\u0001\u00101J0\u0010\u0088\u0001\u001a\u0002052\u0012\u0010,\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020-0(\"\u00020-2\u0008\u0008\u0002\u0010.\u001a\u00020/\u00f8\u0001\u0000\u00a2\u0006\u0005\u0008\u0089\u0001\u00107J-\u0010\u008a\u0001\u001a\u00020&2\u0012\u0010,\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020-0(\"\u00020-2\n\u0008\u0002\u0010\u0081\u0001\u001a\u00030\u0082\u0001\u00a2\u0006\u0003\u0010\u008b\u0001J\u0015\u0010\u008c\u0001\u001a\u00020B2\t\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\t\u0010\u008e\u0001\u001a\u00020\u0007H\u0016J\t\u0010\u008f\u0001\u001a\u00020\u0017H\u0016J\u0012\u0010\u0090\u0001\u001a\u00020\u00172\u0007\u0010\u0091\u0001\u001a\u00020\u0007H\u0002J\u0013\u0010\u0092\u0001\u001a\u00020\u0004*\u00020-H\u0000\u00a2\u0006\u0003\u0008\u0093\u0001Jz\u0010\u0094\u0001\u001a\u00020-*\u00020-2\t\u0008\u0002\u0010\u0095\u0001\u001a\u00020/2\t\u0008\u0002\u0010\u0096\u0001\u001a\u00020/2\t\u0008\u0002\u0010\u0097\u0001\u001a\u00020/2\t\u0008\u0002\u0010\u0098\u0001\u001a\u00020/2\t\u0008\u0002\u0010\u0099\u0001\u001a\u00020/2\t\u0008\u0002\u0010\u009a\u0001\u001a\u00020/2\t\u0008\u0002\u0010\u009b\u0001\u001a\u00020/2\t\u0008\u0002\u0010\u009c\u0001\u001a\u00020/2\t\u0008\u0002\u0010\u009d\u0001\u001a\u00020Q\u00f8\u0001\u0000\u00a2\u0006\u0006\u0008\u009e\u0001\u0010\u009f\u0001JN\u0010\u00a0\u0001\u001a\u00020-*\u00020-2\t\u0008\u0002\u0010\u0095\u0001\u001a\u00020/2\t\u0008\u0002\u0010\u0097\u0001\u001a\u00020/2\t\u0008\u0002\u0010\u0099\u0001\u001a\u00020/2\t\u0008\u0002\u0010\u009b\u0001\u001a\u00020/2\t\u0008\u0002\u0010\u009d\u0001\u001a\u00020Q\u00f8\u0001\u0000\u00a2\u0006\u0006\u0008\u00a1\u0001\u0010\u00a2\u0001JN\u0010\u00a3\u0001\u001a\u00020-*\u00020-2\t\u0008\u0002\u0010\u0096\u0001\u001a\u00020/2\t\u0008\u0002\u0010\u0098\u0001\u001a\u00020/2\t\u0008\u0002\u0010\u009a\u0001\u001a\u00020/2\t\u0008\u0002\u0010\u009c\u0001\u001a\u00020/2\t\u0008\u0002\u0010\u009d\u0001\u001a\u00020Q\u00f8\u0001\u0000\u00a2\u0006\u0006\u0008\u00a4\u0001\u0010\u00a2\u0001R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0008\u001a\u00020\u00048\u0000X\u0081\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\t\u0010\u0002\u001a\u0004\u0008\n\u0010\u000bR\u000e\u0010\u000c\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\r\u001a\u00020\u00078\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\u0008\u000e\u0010\u0002\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012R.\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00150\u00148\u0004X\u0085\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0018\u0010\u0002\u001a\u0004\u0008\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006\u00a8\u0001"
    }
    d2 = {
        "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;",
        "",
        "()V",
        "extendFrom",
        "Landroidx/constraintlayout/core/parser/CLObject;",
        "(Landroidx/constraintlayout/core/parser/CLObject;)V",
        "HelpersStartId",
        "",
        "containerObject",
        "getContainerObject$annotations",
        "getContainerObject",
        "()Landroidx/constraintlayout/core/parser/CLObject;",
        "helperId",
        "helpersHashCode",
        "getHelpersHashCode$annotations",
        "getHelpersHashCode",
        "()I",
        "setHelpersHashCode",
        "(I)V",
        "tasks",
        "",
        "Lkotlin/Function1;",
        "Landroidx/constraintlayout/compose/State;",
        "",
        "getTasks$annotations",
        "getTasks",
        "()Ljava/util/List;",
        "applyTo",
        "state",
        "constrain",
        "Landroidx/constraintlayout/compose/ConstrainScope;",
        "ref",
        "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;",
        "constrainBlock",
        "Lkotlin/ExtensionFunctionType;",
        "Landroidx/constraintlayout/compose/HorizontalChainScope;",
        "Landroidx/constraintlayout/compose/HorizontalChainReference;",
        "Landroidx/constraintlayout/compose/VerticalChainScope;",
        "Landroidx/constraintlayout/compose/VerticalChainReference;",
        "refs",
        "",
        "([Landroidx/constraintlayout/compose/ConstrainedLayoutReference;Lkotlin/jvm/functions/Function1;)V",
        "createAbsoluteLeftBarrier",
        "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;",
        "elements",
        "Landroidx/constraintlayout/compose/LayoutReference;",
        "margin",
        "Landroidx/compose/ui/unit/Dp;",
        "createAbsoluteLeftBarrier-3ABfNKs",
        "([Landroidx/constraintlayout/compose/LayoutReference;F)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;",
        "createAbsoluteRightBarrier",
        "createAbsoluteRightBarrier-3ABfNKs",
        "createBottomBarrier",
        "Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;",
        "createBottomBarrier-3ABfNKs",
        "([Landroidx/constraintlayout/compose/LayoutReference;F)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;",
        "createColumn",
        "spacing",
        "weights",
        "",
        "createColumn-lG28NQ4",
        "([Landroidx/constraintlayout/compose/LayoutReference;F[F)Landroidx/constraintlayout/compose/ConstrainedLayoutReference;",
        "createEndBarrier",
        "createEndBarrier-3ABfNKs",
        "createFlow",
        "flowVertically",
        "",
        "verticalGap",
        "horizontalGap",
        "maxElement",
        "paddingLeft",
        "paddingTop",
        "paddingRight",
        "paddingBottom",
        "wrapMode",
        "Landroidx/constraintlayout/compose/Wrap;",
        "verticalAlign",
        "Landroidx/constraintlayout/compose/VerticalAlign;",
        "horizontalAlign",
        "Landroidx/constraintlayout/compose/HorizontalAlign;",
        "horizontalFlowBias",
        "",
        "verticalFlowBias",
        "verticalStyle",
        "Landroidx/constraintlayout/compose/FlowStyle;",
        "horizontalStyle",
        "createFlow-Fgo90cY",
        "([Landroidx/constraintlayout/compose/LayoutReference;ZFFIFFFFLandroidx/constraintlayout/compose/Wrap;Landroidx/constraintlayout/compose/VerticalAlign;Landroidx/constraintlayout/compose/HorizontalAlign;FFLandroidx/constraintlayout/compose/FlowStyle;Landroidx/constraintlayout/compose/FlowStyle;)Landroidx/constraintlayout/compose/ConstrainedLayoutReference;",
        "paddingHorizontal",
        "paddingVertical",
        "createFlow-6oEtc9w",
        "([Landroidx/constraintlayout/compose/LayoutReference;ZFFIFFLandroidx/constraintlayout/compose/Wrap;Landroidx/constraintlayout/compose/VerticalAlign;Landroidx/constraintlayout/compose/HorizontalAlign;FFLandroidx/constraintlayout/compose/FlowStyle;Landroidx/constraintlayout/compose/FlowStyle;)Landroidx/constraintlayout/compose/ConstrainedLayoutReference;",
        "padding",
        "createFlow-IkjhEj4",
        "([Landroidx/constraintlayout/compose/LayoutReference;ZFFIFLandroidx/constraintlayout/compose/Wrap;Landroidx/constraintlayout/compose/VerticalAlign;Landroidx/constraintlayout/compose/HorizontalAlign;FFLandroidx/constraintlayout/compose/FlowStyle;Landroidx/constraintlayout/compose/FlowStyle;)Landroidx/constraintlayout/compose/ConstrainedLayoutReference;",
        "createGrid",
        "rows",
        "columns",
        "isHorizontalArrangement",
        "verticalSpacing",
        "horizontalSpacing",
        "rowWeights",
        "columnWeights",
        "skips",
        "Landroidx/constraintlayout/compose/Skip;",
        "spans",
        "Landroidx/constraintlayout/compose/Span;",
        "flags",
        "Landroidx/constraintlayout/compose/GridFlag;",
        "createGrid-Hu23Yyw",
        "([Landroidx/constraintlayout/compose/LayoutReference;IIZFF[F[F[Landroidx/constraintlayout/compose/Skip;[Landroidx/constraintlayout/compose/Span;I)Landroidx/constraintlayout/compose/ConstrainedLayoutReference;",
        "createGuidelineFromAbsoluteLeft",
        "offset",
        "createGuidelineFromAbsoluteLeft-0680j_4",
        "(F)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;",
        "fraction",
        "createGuidelineFromAbsoluteRight",
        "createGuidelineFromAbsoluteRight-0680j_4",
        "createGuidelineFromBottom",
        "createGuidelineFromBottom-0680j_4",
        "(F)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;",
        "createGuidelineFromEnd",
        "createGuidelineFromEnd-0680j_4",
        "createGuidelineFromStart",
        "createGuidelineFromStart-0680j_4",
        "createGuidelineFromTop",
        "createGuidelineFromTop-0680j_4",
        "createHelperId",
        "createHorizontalChain",
        "chainStyle",
        "Landroidx/constraintlayout/compose/ChainStyle;",
        "([Landroidx/constraintlayout/compose/LayoutReference;Landroidx/constraintlayout/compose/ChainStyle;)Landroidx/constraintlayout/compose/HorizontalChainReference;",
        "createRow",
        "createRow-lG28NQ4",
        "createStartBarrier",
        "createStartBarrier-3ABfNKs",
        "createTopBarrier",
        "createTopBarrier-3ABfNKs",
        "createVerticalChain",
        "([Landroidx/constraintlayout/compose/LayoutReference;Landroidx/constraintlayout/compose/ChainStyle;)Landroidx/constraintlayout/compose/VerticalChainReference;",
        "equals",
        "other",
        "hashCode",
        "reset",
        "updateHelpersHashCode",
        "value",
        "asCLContainer",
        "asCLContainer$constraintlayout_compose_release",
        "withChainParams",
        "startMargin",
        "topMargin",
        "endMargin",
        "bottomMargin",
        "startGoneMargin",
        "topGoneMargin",
        "endGoneMargin",
        "bottomGoneMargin",
        "weight",
        "withChainParams-ouYQatA",
        "(Landroidx/constraintlayout/compose/LayoutReference;FFFFFFFFF)Landroidx/constraintlayout/compose/LayoutReference;",
        "withHorizontalChainParams",
        "withHorizontalChainParams-YLPp7PM",
        "(Landroidx/constraintlayout/compose/LayoutReference;FFFFF)Landroidx/constraintlayout/compose/LayoutReference;",
        "withVerticalChainParams",
        "withVerticalChainParams-YLPp7PM",
        "BaselineAnchor",
        "HorizontalAnchor",
        "VerticalAnchor",
        "constraintlayout-compose_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nConstraintLayoutBaseScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayoutBaseScope.kt\nandroidx/constraintlayout/compose/ConstraintLayoutBaseScope\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ConstraintLayoutBaseScope.kt\nandroidx/constraintlayout/compose/LayoutReference\n*L\n1#1,1456:1\n13579#2,2:1457\n13579#2,2:1459\n13579#2,2:1461\n13579#2,2:1464\n13579#2,2:1466\n13579#2,2:1469\n13579#2,2:1471\n13579#2,2:1474\n13579#2,2:1476\n13579#2,2:1479\n13579#2,2:1481\n13579#2,2:1484\n13579#2,2:1486\n13579#2,2:1496\n13579#2,2:1498\n13579#2,2:1508\n13579#2:1512\n13580#2:1514\n13579#2,2:1515\n13579#2:1517\n13580#2:1519\n13579#2,2:1520\n149#3:1463\n149#3:1468\n149#3:1473\n149#3:1478\n149#3:1483\n149#3:1488\n149#3:1489\n149#3:1490\n149#3:1491\n149#3:1492\n149#3:1493\n149#3:1494\n149#3:1495\n149#3:1500\n149#3:1501\n149#3:1502\n149#3:1503\n149#3:1504\n149#3:1505\n149#3:1506\n149#3:1507\n149#3:1510\n149#3:1511\n149#3:1522\n149#3:1523\n149#3:1524\n149#3:1525\n149#3:1526\n149#3:1527\n149#3:1528\n149#3:1529\n149#3:1530\n149#3:1531\n149#3:1532\n149#3:1533\n149#3:1534\n149#3:1535\n149#3:1536\n149#3:1537\n149#3:1538\n149#3:1539\n149#3:1540\n149#3:1541\n149#3:1542\n149#3:1543\n149#3:1544\n149#3:1545\n1110#4:1513\n1110#4:1518\n*S KotlinDebug\n*F\n+ 1 ConstraintLayoutBaseScope.kt\nandroidx/constraintlayout/compose/ConstraintLayoutBaseScope\n*L\n139#1:1457,2\n333#1:1459,2\n343#1:1461,2\n356#1:1464,2\n366#1:1466,2\n376#1:1469,2\n386#1:1471,2\n396#1:1474,2\n406#1:1476,2\n419#1:1479,2\n429#1:1481,2\n439#1:1484,2\n449#1:1486,2\n612#1:1496,2\n640#1:1498,2\n788#1:1508,2\n837#1:1512\n837#1:1514\n865#1:1515,2\n882#1:1517\n882#1:1519\n910#1:1520,2\n329#1:1463\n351#1:1468\n372#1:1473\n392#1:1478\n414#1:1483\n435#1:1488\n478#1:1489\n479#1:1490\n481#1:1491\n535#1:1492\n536#1:1493\n538#1:1494\n539#1:1495\n595#1:1500\n596#1:1501\n598#1:1502\n599#1:1503\n600#1:1504\n601#1:1505\n661#1:1506\n694#1:1507\n767#1:1510\n768#1:1511\n944#1:1522\n945#1:1523\n946#1:1524\n947#1:1525\n948#1:1526\n949#1:1527\n950#1:1528\n951#1:1529\n1002#1:1530\n1004#1:1531\n1006#1:1532\n1008#1:1533\n994#1:1534\n995#1:1535\n996#1:1536\n997#1:1537\n1043#1:1538\n1045#1:1539\n1047#1:1540\n1049#1:1541\n1036#1:1542\n1037#1:1543\n1038#1:1544\n1039#1:1545\n838#1:1513\n883#1:1518\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final HelpersStartId:I

.field private final containerObject:Landroidx/constraintlayout/core/parser/CLObject;

.field private helperId:I

.field private helpersHashCode:I

.field private final tasks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/constraintlayout/compose/State;",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 6
    invoke-direct {p0, v0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;-><init>(Landroidx/constraintlayout/core/parser/CLObject;)V

    return-void
.end method

.method public constructor <init>(Landroidx/constraintlayout/core/parser/CLObject;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->tasks:Ljava/util/List;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, Landroidx/constraintlayout/core/parser/CLObject;->clone()Landroidx/constraintlayout/core/parser/CLObject;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    new-instance p1, Landroidx/constraintlayout/core/parser/CLObject;

    const/4 v0, 0x0

    new-array v0, v0, [C

    invoke-direct {p1, v0}, Landroidx/constraintlayout/core/parser/CLObject;-><init>([C)V

    :cond_1
    iput-object p1, p0, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->containerObject:Landroidx/constraintlayout/core/parser/CLObject;

    const/16 p1, 0x3e8

    .line 4
    iput p1, p0, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->HelpersStartId:I

    .line 5
    iput p1, p0, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->helperId:I

    return-void
.end method

.method public static synthetic createAbsoluteLeftBarrier-3ABfNKs$default(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;[Landroidx/constraintlayout/compose/LayoutReference;FILjava/lang/Object;)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;
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
    const/4 p2, 0x0

    .line 8
    int-to-float p2, p2

    .line 9
    invoke-static {p2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    :cond_0
    invoke-virtual {p0, p1, p2}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->createAbsoluteLeftBarrier-3ABfNKs([Landroidx/constraintlayout/compose/LayoutReference;F)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 19
    .line 20
    const-string p1, "Super calls with default arguments not supported in this target, function: createAbsoluteLeftBarrier-3ABfNKs"

    .line 21
    .line 22
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p0
.end method

.method public static synthetic createAbsoluteRightBarrier-3ABfNKs$default(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;[Landroidx/constraintlayout/compose/LayoutReference;FILjava/lang/Object;)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;
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
    const/4 p2, 0x0

    .line 8
    int-to-float p2, p2

    .line 9
    invoke-static {p2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    :cond_0
    invoke-virtual {p0, p1, p2}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->createAbsoluteRightBarrier-3ABfNKs([Landroidx/constraintlayout/compose/LayoutReference;F)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 19
    .line 20
    const-string p1, "Super calls with default arguments not supported in this target, function: createAbsoluteRightBarrier-3ABfNKs"

    .line 21
    .line 22
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p0
.end method

.method public static synthetic createBottomBarrier-3ABfNKs$default(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;[Landroidx/constraintlayout/compose/LayoutReference;FILjava/lang/Object;)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;
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
    const/4 p2, 0x0

    .line 8
    int-to-float p2, p2

    .line 9
    invoke-static {p2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    :cond_0
    invoke-virtual {p0, p1, p2}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->createBottomBarrier-3ABfNKs([Landroidx/constraintlayout/compose/LayoutReference;F)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 19
    .line 20
    const-string p1, "Super calls with default arguments not supported in this target, function: createBottomBarrier-3ABfNKs"

    .line 21
    .line 22
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p0
.end method

.method public static synthetic createColumn-lG28NQ4$default(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;[Landroidx/constraintlayout/compose/LayoutReference;F[FILjava/lang/Object;)Landroidx/constraintlayout/compose/ConstrainedLayoutReference;
    .locals 1

    .line 1
    if-nez p5, :cond_2

    .line 2
    .line 3
    and-int/lit8 p5, p4, 0x2

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p5, :cond_0

    .line 7
    .line 8
    int-to-float p2, v0

    .line 9
    invoke-static {p2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 14
    .line 15
    if-eqz p4, :cond_1

    .line 16
    .line 17
    new-array p3, v0, [F

    .line 18
    .line 19
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->createColumn-lG28NQ4([Landroidx/constraintlayout/compose/LayoutReference;F[F)Landroidx/constraintlayout/compose/ConstrainedLayoutReference;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 25
    .line 26
    const-string p1, "Super calls with default arguments not supported in this target, function: createColumn-lG28NQ4"

    .line 27
    .line 28
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p0
.end method

.method public static synthetic createEndBarrier-3ABfNKs$default(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;[Landroidx/constraintlayout/compose/LayoutReference;FILjava/lang/Object;)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;
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
    const/4 p2, 0x0

    .line 8
    int-to-float p2, p2

    .line 9
    invoke-static {p2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    :cond_0
    invoke-virtual {p0, p1, p2}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->createEndBarrier-3ABfNKs([Landroidx/constraintlayout/compose/LayoutReference;F)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 19
    .line 20
    const-string p1, "Super calls with default arguments not supported in this target, function: createEndBarrier-3ABfNKs"

    .line 21
    .line 22
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p0
.end method

.method public static synthetic createFlow-6oEtc9w$default(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;[Landroidx/constraintlayout/compose/LayoutReference;ZFFIFFLandroidx/constraintlayout/compose/Wrap;Landroidx/constraintlayout/compose/VerticalAlign;Landroidx/constraintlayout/compose/HorizontalAlign;FFLandroidx/constraintlayout/compose/FlowStyle;Landroidx/constraintlayout/compose/FlowStyle;ILjava/lang/Object;)Landroidx/constraintlayout/compose/ConstrainedLayoutReference;
    .locals 12

    .line 1
    move/from16 v0, p15

    .line 2
    .line 3
    if-nez p16, :cond_d

    .line 4
    .line 5
    and-int/lit8 v1, v0, 0x2

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    move p2, v2

    .line 11
    :cond_0
    and-int/lit8 v1, v0, 0x4

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    int-to-float v1, v2

    .line 16
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    move v1, p3

    .line 22
    :goto_0
    and-int/lit8 v3, v0, 0x8

    .line 23
    .line 24
    if-eqz v3, :cond_2

    .line 25
    .line 26
    int-to-float v3, v2

    .line 27
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    goto :goto_1

    .line 32
    :cond_2
    move/from16 v3, p4

    .line 33
    .line 34
    :goto_1
    and-int/lit8 v4, v0, 0x10

    .line 35
    .line 36
    if-eqz v4, :cond_3

    .line 37
    .line 38
    move v4, v2

    .line 39
    goto :goto_2

    .line 40
    :cond_3
    move/from16 v4, p5

    .line 41
    .line 42
    :goto_2
    and-int/lit8 v5, v0, 0x20

    .line 43
    .line 44
    if-eqz v5, :cond_4

    .line 45
    .line 46
    int-to-float v5, v2

    .line 47
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    goto :goto_3

    .line 52
    :cond_4
    move/from16 v5, p6

    .line 53
    .line 54
    :goto_3
    and-int/lit8 v6, v0, 0x40

    .line 55
    .line 56
    if-eqz v6, :cond_5

    .line 57
    .line 58
    int-to-float v2, v2

    .line 59
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    goto :goto_4

    .line 64
    :cond_5
    move/from16 v2, p7

    .line 65
    .line 66
    :goto_4
    and-int/lit16 v6, v0, 0x80

    .line 67
    .line 68
    if-eqz v6, :cond_6

    .line 69
    .line 70
    sget-object v6, Landroidx/constraintlayout/compose/Wrap;->Companion:Landroidx/constraintlayout/compose/Wrap$Companion;

    .line 71
    .line 72
    invoke-virtual {v6}, Landroidx/constraintlayout/compose/Wrap$Companion;->getNone()Landroidx/constraintlayout/compose/Wrap;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    goto :goto_5

    .line 77
    :cond_6
    move-object/from16 v6, p8

    .line 78
    .line 79
    :goto_5
    and-int/lit16 v7, v0, 0x100

    .line 80
    .line 81
    if-eqz v7, :cond_7

    .line 82
    .line 83
    sget-object v7, Landroidx/constraintlayout/compose/VerticalAlign;->Companion:Landroidx/constraintlayout/compose/VerticalAlign$Companion;

    .line 84
    .line 85
    invoke-virtual {v7}, Landroidx/constraintlayout/compose/VerticalAlign$Companion;->getCenter()Landroidx/constraintlayout/compose/VerticalAlign;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    goto :goto_6

    .line 90
    :cond_7
    move-object/from16 v7, p9

    .line 91
    .line 92
    :goto_6
    and-int/lit16 v8, v0, 0x200

    .line 93
    .line 94
    if-eqz v8, :cond_8

    .line 95
    .line 96
    sget-object v8, Landroidx/constraintlayout/compose/HorizontalAlign;->Companion:Landroidx/constraintlayout/compose/HorizontalAlign$Companion;

    .line 97
    .line 98
    invoke-virtual {v8}, Landroidx/constraintlayout/compose/HorizontalAlign$Companion;->getCenter()Landroidx/constraintlayout/compose/HorizontalAlign;

    .line 99
    .line 100
    .line 101
    move-result-object v8

    .line 102
    goto :goto_7

    .line 103
    :cond_8
    move-object/from16 v8, p10

    .line 104
    .line 105
    :goto_7
    and-int/lit16 v9, v0, 0x400

    .line 106
    .line 107
    const/4 v10, 0x0

    .line 108
    if-eqz v9, :cond_9

    .line 109
    .line 110
    move v9, v10

    .line 111
    goto :goto_8

    .line 112
    :cond_9
    move/from16 v9, p11

    .line 113
    .line 114
    :goto_8
    and-int/lit16 v11, v0, 0x800

    .line 115
    .line 116
    if-eqz v11, :cond_a

    .line 117
    .line 118
    goto :goto_9

    .line 119
    :cond_a
    move/from16 v10, p12

    .line 120
    .line 121
    :goto_9
    and-int/lit16 v11, v0, 0x1000

    .line 122
    .line 123
    if-eqz v11, :cond_b

    .line 124
    .line 125
    sget-object v11, Landroidx/constraintlayout/compose/FlowStyle;->Companion:Landroidx/constraintlayout/compose/FlowStyle$Companion;

    .line 126
    .line 127
    invoke-virtual {v11}, Landroidx/constraintlayout/compose/FlowStyle$Companion;->getPacked()Landroidx/constraintlayout/compose/FlowStyle;

    .line 128
    .line 129
    .line 130
    move-result-object v11

    .line 131
    goto :goto_a

    .line 132
    :cond_b
    move-object/from16 v11, p13

    .line 133
    .line 134
    :goto_a
    and-int/lit16 v0, v0, 0x2000

    .line 135
    .line 136
    if-eqz v0, :cond_c

    .line 137
    .line 138
    sget-object v0, Landroidx/constraintlayout/compose/FlowStyle;->Companion:Landroidx/constraintlayout/compose/FlowStyle$Companion;

    .line 139
    .line 140
    invoke-virtual {v0}, Landroidx/constraintlayout/compose/FlowStyle$Companion;->getPacked()Landroidx/constraintlayout/compose/FlowStyle;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    move-object/from16 p16, v0

    .line 145
    .line 146
    :goto_b
    move-object p3, p1

    .line 147
    move/from16 p4, p2

    .line 148
    .line 149
    move/from16 p5, v1

    .line 150
    .line 151
    move/from16 p9, v2

    .line 152
    .line 153
    move/from16 p6, v3

    .line 154
    .line 155
    move/from16 p7, v4

    .line 156
    .line 157
    move/from16 p8, v5

    .line 158
    .line 159
    move-object/from16 p10, v6

    .line 160
    .line 161
    move-object/from16 p11, v7

    .line 162
    .line 163
    move-object/from16 p12, v8

    .line 164
    .line 165
    move/from16 p13, v9

    .line 166
    .line 167
    move/from16 p14, v10

    .line 168
    .line 169
    move-object/from16 p15, v11

    .line 170
    .line 171
    move-object p2, p0

    .line 172
    goto :goto_c

    .line 173
    :cond_c
    move-object/from16 p16, p14

    .line 174
    .line 175
    goto :goto_b

    .line 176
    :goto_c
    invoke-virtual/range {p2 .. p16}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->createFlow-6oEtc9w([Landroidx/constraintlayout/compose/LayoutReference;ZFFIFFLandroidx/constraintlayout/compose/Wrap;Landroidx/constraintlayout/compose/VerticalAlign;Landroidx/constraintlayout/compose/HorizontalAlign;FFLandroidx/constraintlayout/compose/FlowStyle;Landroidx/constraintlayout/compose/FlowStyle;)Landroidx/constraintlayout/compose/ConstrainedLayoutReference;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    return-object p0

    .line 181
    :cond_d
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 182
    .line 183
    const-string p1, "Super calls with default arguments not supported in this target, function: createFlow-6oEtc9w"

    .line 184
    .line 185
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    throw p0
.end method

.method public static synthetic createFlow-Fgo90cY$default(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;[Landroidx/constraintlayout/compose/LayoutReference;ZFFIFFFFLandroidx/constraintlayout/compose/Wrap;Landroidx/constraintlayout/compose/VerticalAlign;Landroidx/constraintlayout/compose/HorizontalAlign;FFLandroidx/constraintlayout/compose/FlowStyle;Landroidx/constraintlayout/compose/FlowStyle;ILjava/lang/Object;)Landroidx/constraintlayout/compose/ConstrainedLayoutReference;
    .locals 16

    move/from16 v0, p17

    if-nez p18, :cond_f

    and-int/lit8 v1, v0, 0x2

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move/from16 v1, p2

    :goto_0
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_1

    int-to-float v3, v2

    .line 1
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v3

    goto :goto_1

    :cond_1
    move/from16 v3, p3

    :goto_1
    and-int/lit8 v4, v0, 0x8

    if-eqz v4, :cond_2

    int-to-float v4, v2

    .line 2
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v4

    goto :goto_2

    :cond_2
    move/from16 v4, p4

    :goto_2
    and-int/lit8 v5, v0, 0x10

    if-eqz v5, :cond_3

    move v5, v2

    goto :goto_3

    :cond_3
    move/from16 v5, p5

    :goto_3
    and-int/lit8 v6, v0, 0x20

    if-eqz v6, :cond_4

    int-to-float v6, v2

    .line 3
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v6

    goto :goto_4

    :cond_4
    move/from16 v6, p6

    :goto_4
    and-int/lit8 v7, v0, 0x40

    if-eqz v7, :cond_5

    int-to-float v7, v2

    .line 4
    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v7

    goto :goto_5

    :cond_5
    move/from16 v7, p7

    :goto_5
    and-int/lit16 v8, v0, 0x80

    if-eqz v8, :cond_6

    int-to-float v8, v2

    .line 5
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v8

    goto :goto_6

    :cond_6
    move/from16 v8, p8

    :goto_6
    and-int/lit16 v9, v0, 0x100

    if-eqz v9, :cond_7

    int-to-float v2, v2

    .line 6
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v2

    goto :goto_7

    :cond_7
    move/from16 v2, p9

    :goto_7
    and-int/lit16 v9, v0, 0x200

    if-eqz v9, :cond_8

    .line 7
    sget-object v9, Landroidx/constraintlayout/compose/Wrap;->Companion:Landroidx/constraintlayout/compose/Wrap$Companion;

    invoke-virtual {v9}, Landroidx/constraintlayout/compose/Wrap$Companion;->getNone()Landroidx/constraintlayout/compose/Wrap;

    move-result-object v9

    goto :goto_8

    :cond_8
    move-object/from16 v9, p10

    :goto_8
    and-int/lit16 v10, v0, 0x400

    if-eqz v10, :cond_9

    .line 8
    sget-object v10, Landroidx/constraintlayout/compose/VerticalAlign;->Companion:Landroidx/constraintlayout/compose/VerticalAlign$Companion;

    invoke-virtual {v10}, Landroidx/constraintlayout/compose/VerticalAlign$Companion;->getCenter()Landroidx/constraintlayout/compose/VerticalAlign;

    move-result-object v10

    goto :goto_9

    :cond_9
    move-object/from16 v10, p11

    :goto_9
    and-int/lit16 v11, v0, 0x800

    if-eqz v11, :cond_a

    .line 9
    sget-object v11, Landroidx/constraintlayout/compose/HorizontalAlign;->Companion:Landroidx/constraintlayout/compose/HorizontalAlign$Companion;

    invoke-virtual {v11}, Landroidx/constraintlayout/compose/HorizontalAlign$Companion;->getCenter()Landroidx/constraintlayout/compose/HorizontalAlign;

    move-result-object v11

    goto :goto_a

    :cond_a
    move-object/from16 v11, p12

    :goto_a
    and-int/lit16 v12, v0, 0x1000

    const/4 v13, 0x0

    if-eqz v12, :cond_b

    move v12, v13

    goto :goto_b

    :cond_b
    move/from16 v12, p13

    :goto_b
    and-int/lit16 v14, v0, 0x2000

    if-eqz v14, :cond_c

    goto :goto_c

    :cond_c
    move/from16 v13, p14

    :goto_c
    and-int/lit16 v14, v0, 0x4000

    if-eqz v14, :cond_d

    .line 10
    sget-object v14, Landroidx/constraintlayout/compose/FlowStyle;->Companion:Landroidx/constraintlayout/compose/FlowStyle$Companion;

    invoke-virtual {v14}, Landroidx/constraintlayout/compose/FlowStyle$Companion;->getPacked()Landroidx/constraintlayout/compose/FlowStyle;

    move-result-object v14

    goto :goto_d

    :cond_d
    move-object/from16 v14, p15

    :goto_d
    const v15, 0x8000

    and-int/2addr v0, v15

    if-eqz v0, :cond_e

    .line 11
    sget-object v0, Landroidx/constraintlayout/compose/FlowStyle;->Companion:Landroidx/constraintlayout/compose/FlowStyle$Companion;

    invoke-virtual {v0}, Landroidx/constraintlayout/compose/FlowStyle$Companion;->getPacked()Landroidx/constraintlayout/compose/FlowStyle;

    move-result-object v0

    move-object/from16 p18, v0

    :goto_e
    move-object/from16 p2, p0

    move-object/from16 p3, p1

    move/from16 p4, v1

    move/from16 p11, v2

    move/from16 p5, v3

    move/from16 p6, v4

    move/from16 p7, v5

    move/from16 p8, v6

    move/from16 p9, v7

    move/from16 p10, v8

    move-object/from16 p12, v9

    move-object/from16 p13, v10

    move-object/from16 p14, v11

    move/from16 p15, v12

    move/from16 p16, v13

    move-object/from16 p17, v14

    goto :goto_f

    :cond_e
    move-object/from16 p18, p16

    goto :goto_e

    .line 12
    :goto_f
    invoke-virtual/range {p2 .. p18}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->createFlow-Fgo90cY([Landroidx/constraintlayout/compose/LayoutReference;ZFFIFFFFLandroidx/constraintlayout/compose/Wrap;Landroidx/constraintlayout/compose/VerticalAlign;Landroidx/constraintlayout/compose/HorizontalAlign;FFLandroidx/constraintlayout/compose/FlowStyle;Landroidx/constraintlayout/compose/FlowStyle;)Landroidx/constraintlayout/compose/ConstrainedLayoutReference;

    move-result-object v0

    return-object v0

    :cond_f
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Super calls with default arguments not supported in this target, function: createFlow-Fgo90cY"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic createFlow-IkjhEj4$default(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;[Landroidx/constraintlayout/compose/LayoutReference;ZFFIFLandroidx/constraintlayout/compose/Wrap;Landroidx/constraintlayout/compose/VerticalAlign;Landroidx/constraintlayout/compose/HorizontalAlign;FFLandroidx/constraintlayout/compose/FlowStyle;Landroidx/constraintlayout/compose/FlowStyle;ILjava/lang/Object;)Landroidx/constraintlayout/compose/ConstrainedLayoutReference;
    .locals 10

    move/from16 v0, p14

    if-nez p15, :cond_c

    and-int/lit8 v1, v0, 0x2

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move p2, v2

    :cond_0
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_1

    int-to-float p3, v2

    .line 1
    invoke-static {p3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result p3

    :cond_1
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_2

    int-to-float v1, v2

    .line 2
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    goto :goto_0

    :cond_2
    move v1, p4

    :goto_0
    and-int/lit8 v3, v0, 0x10

    if-eqz v3, :cond_3

    move v3, v2

    goto :goto_1

    :cond_3
    move v3, p5

    :goto_1
    and-int/lit8 v4, v0, 0x20

    if-eqz v4, :cond_4

    int-to-float v2, v2

    .line 3
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v2

    goto :goto_2

    :cond_4
    move/from16 v2, p6

    :goto_2
    and-int/lit8 v4, v0, 0x40

    if-eqz v4, :cond_5

    .line 4
    sget-object v4, Landroidx/constraintlayout/compose/Wrap;->Companion:Landroidx/constraintlayout/compose/Wrap$Companion;

    invoke-virtual {v4}, Landroidx/constraintlayout/compose/Wrap$Companion;->getNone()Landroidx/constraintlayout/compose/Wrap;

    move-result-object v4

    goto :goto_3

    :cond_5
    move-object/from16 v4, p7

    :goto_3
    and-int/lit16 v5, v0, 0x80

    if-eqz v5, :cond_6

    .line 5
    sget-object v5, Landroidx/constraintlayout/compose/VerticalAlign;->Companion:Landroidx/constraintlayout/compose/VerticalAlign$Companion;

    invoke-virtual {v5}, Landroidx/constraintlayout/compose/VerticalAlign$Companion;->getCenter()Landroidx/constraintlayout/compose/VerticalAlign;

    move-result-object v5

    goto :goto_4

    :cond_6
    move-object/from16 v5, p8

    :goto_4
    and-int/lit16 v6, v0, 0x100

    if-eqz v6, :cond_7

    .line 6
    sget-object v6, Landroidx/constraintlayout/compose/HorizontalAlign;->Companion:Landroidx/constraintlayout/compose/HorizontalAlign$Companion;

    invoke-virtual {v6}, Landroidx/constraintlayout/compose/HorizontalAlign$Companion;->getCenter()Landroidx/constraintlayout/compose/HorizontalAlign;

    move-result-object v6

    goto :goto_5

    :cond_7
    move-object/from16 v6, p9

    :goto_5
    and-int/lit16 v7, v0, 0x200

    const/4 v8, 0x0

    if-eqz v7, :cond_8

    move v7, v8

    goto :goto_6

    :cond_8
    move/from16 v7, p10

    :goto_6
    and-int/lit16 v9, v0, 0x400

    if-eqz v9, :cond_9

    goto :goto_7

    :cond_9
    move/from16 v8, p11

    :goto_7
    and-int/lit16 v9, v0, 0x800

    if-eqz v9, :cond_a

    .line 7
    sget-object v9, Landroidx/constraintlayout/compose/FlowStyle;->Companion:Landroidx/constraintlayout/compose/FlowStyle$Companion;

    invoke-virtual {v9}, Landroidx/constraintlayout/compose/FlowStyle$Companion;->getPacked()Landroidx/constraintlayout/compose/FlowStyle;

    move-result-object v9

    goto :goto_8

    :cond_a
    move-object/from16 v9, p12

    :goto_8
    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_b

    .line 8
    sget-object v0, Landroidx/constraintlayout/compose/FlowStyle;->Companion:Landroidx/constraintlayout/compose/FlowStyle$Companion;

    invoke-virtual {v0}, Landroidx/constraintlayout/compose/FlowStyle$Companion;->getPacked()Landroidx/constraintlayout/compose/FlowStyle;

    move-result-object v0

    move-object/from16 p15, v0

    :goto_9
    move p4, p2

    move p5, p3

    move/from16 p6, v1

    move/from16 p8, v2

    move/from16 p7, v3

    move-object/from16 p9, v4

    move-object/from16 p10, v5

    move-object/from16 p11, v6

    move/from16 p12, v7

    move/from16 p13, v8

    move-object/from16 p14, v9

    move-object p2, p0

    move-object p3, p1

    goto :goto_a

    :cond_b
    move-object/from16 p15, p13

    goto :goto_9

    .line 9
    :goto_a
    invoke-virtual/range {p2 .. p15}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->createFlow-IkjhEj4([Landroidx/constraintlayout/compose/LayoutReference;ZFFIFLandroidx/constraintlayout/compose/Wrap;Landroidx/constraintlayout/compose/VerticalAlign;Landroidx/constraintlayout/compose/HorizontalAlign;FFLandroidx/constraintlayout/compose/FlowStyle;Landroidx/constraintlayout/compose/FlowStyle;)Landroidx/constraintlayout/compose/ConstrainedLayoutReference;

    move-result-object p0

    return-object p0

    :cond_c
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: createFlow-IkjhEj4"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic createGrid-Hu23Yyw$default(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;[Landroidx/constraintlayout/compose/LayoutReference;IIZFF[F[F[Landroidx/constraintlayout/compose/Skip;[Landroidx/constraintlayout/compose/Span;IILjava/lang/Object;)Landroidx/constraintlayout/compose/ConstrainedLayoutReference;
    .locals 14

    .line 1
    move/from16 v0, p12

    .line 2
    .line 3
    if-nez p13, :cond_8

    .line 4
    .line 5
    and-int/lit8 v1, v0, 0x8

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    move v6, v1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move/from16 v6, p4

    .line 13
    .line 14
    :goto_0
    and-int/lit8 v1, v0, 0x10

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    int-to-float v1, v2

    .line 20
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    move v7, v1

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move/from16 v7, p5

    .line 27
    .line 28
    :goto_1
    and-int/lit8 v1, v0, 0x20

    .line 29
    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    int-to-float v1, v2

    .line 33
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    move v8, v1

    .line 38
    goto :goto_2

    .line 39
    :cond_2
    move/from16 v8, p6

    .line 40
    .line 41
    :goto_2
    and-int/lit8 v1, v0, 0x40

    .line 42
    .line 43
    if-eqz v1, :cond_3

    .line 44
    .line 45
    new-array v1, v2, [F

    .line 46
    .line 47
    move-object v9, v1

    .line 48
    goto :goto_3

    .line 49
    :cond_3
    move-object/from16 v9, p7

    .line 50
    .line 51
    :goto_3
    and-int/lit16 v1, v0, 0x80

    .line 52
    .line 53
    if-eqz v1, :cond_4

    .line 54
    .line 55
    new-array v1, v2, [F

    .line 56
    .line 57
    move-object v10, v1

    .line 58
    goto :goto_4

    .line 59
    :cond_4
    move-object/from16 v10, p8

    .line 60
    .line 61
    :goto_4
    and-int/lit16 v1, v0, 0x100

    .line 62
    .line 63
    if-eqz v1, :cond_5

    .line 64
    .line 65
    new-array v1, v2, [Landroidx/constraintlayout/compose/Skip;

    .line 66
    .line 67
    move-object v11, v1

    .line 68
    goto :goto_5

    .line 69
    :cond_5
    move-object/from16 v11, p9

    .line 70
    .line 71
    :goto_5
    and-int/lit16 v1, v0, 0x200

    .line 72
    .line 73
    if-eqz v1, :cond_6

    .line 74
    .line 75
    new-array v1, v2, [Landroidx/constraintlayout/compose/Span;

    .line 76
    .line 77
    move-object v12, v1

    .line 78
    goto :goto_6

    .line 79
    :cond_6
    move-object/from16 v12, p10

    .line 80
    .line 81
    :goto_6
    and-int/lit16 v0, v0, 0x400

    .line 82
    .line 83
    if-eqz v0, :cond_7

    .line 84
    .line 85
    sget-object v0, Landroidx/constraintlayout/compose/GridFlag;->Companion:Landroidx/constraintlayout/compose/GridFlag$Companion;

    .line 86
    .line 87
    invoke-virtual {v0}, Landroidx/constraintlayout/compose/GridFlag$Companion;->getNone-dTRCCdc()I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    move v13, v0

    .line 92
    :goto_7
    move-object v2, p0

    .line 93
    move-object v3, p1

    .line 94
    move/from16 v4, p2

    .line 95
    .line 96
    move/from16 v5, p3

    .line 97
    .line 98
    goto :goto_8

    .line 99
    :cond_7
    move/from16 v13, p11

    .line 100
    .line 101
    goto :goto_7

    .line 102
    :goto_8
    invoke-virtual/range {v2 .. v13}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->createGrid-Hu23Yyw([Landroidx/constraintlayout/compose/LayoutReference;IIZFF[F[F[Landroidx/constraintlayout/compose/Skip;[Landroidx/constraintlayout/compose/Span;I)Landroidx/constraintlayout/compose/ConstrainedLayoutReference;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    return-object p0

    .line 107
    :cond_8
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 108
    .line 109
    const-string p1, "Super calls with default arguments not supported in this target, function: createGrid-Hu23Yyw"

    .line 110
    .line 111
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    throw p0
.end method

.method private final createHelperId()I
    .locals 2

    .line 1
    iget v0, p0, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->helperId:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iput v1, p0, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->helperId:I

    .line 6
    .line 7
    return v0
.end method

.method public static synthetic createHorizontalChain$default(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;[Landroidx/constraintlayout/compose/LayoutReference;Landroidx/constraintlayout/compose/ChainStyle;ILjava/lang/Object;)Landroidx/constraintlayout/compose/HorizontalChainReference;
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
    sget-object p2, Landroidx/constraintlayout/compose/ChainStyle;->Companion:Landroidx/constraintlayout/compose/ChainStyle$Companion;

    .line 8
    .line 9
    invoke-virtual {p2}, Landroidx/constraintlayout/compose/ChainStyle$Companion;->getSpread()Landroidx/constraintlayout/compose/ChainStyle;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    :cond_0
    invoke-virtual {p0, p1, p2}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->createHorizontalChain([Landroidx/constraintlayout/compose/LayoutReference;Landroidx/constraintlayout/compose/ChainStyle;)Landroidx/constraintlayout/compose/HorizontalChainReference;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 19
    .line 20
    const-string p1, "Super calls with default arguments not supported in this target, function: createHorizontalChain"

    .line 21
    .line 22
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p0
.end method

.method public static synthetic createRow-lG28NQ4$default(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;[Landroidx/constraintlayout/compose/LayoutReference;F[FILjava/lang/Object;)Landroidx/constraintlayout/compose/ConstrainedLayoutReference;
    .locals 1

    .line 1
    if-nez p5, :cond_2

    .line 2
    .line 3
    and-int/lit8 p5, p4, 0x2

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p5, :cond_0

    .line 7
    .line 8
    int-to-float p2, v0

    .line 9
    invoke-static {p2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 14
    .line 15
    if-eqz p4, :cond_1

    .line 16
    .line 17
    new-array p3, v0, [F

    .line 18
    .line 19
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->createRow-lG28NQ4([Landroidx/constraintlayout/compose/LayoutReference;F[F)Landroidx/constraintlayout/compose/ConstrainedLayoutReference;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 25
    .line 26
    const-string p1, "Super calls with default arguments not supported in this target, function: createRow-lG28NQ4"

    .line 27
    .line 28
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p0
.end method

.method public static synthetic createStartBarrier-3ABfNKs$default(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;[Landroidx/constraintlayout/compose/LayoutReference;FILjava/lang/Object;)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;
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
    const/4 p2, 0x0

    .line 8
    int-to-float p2, p2

    .line 9
    invoke-static {p2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    :cond_0
    invoke-virtual {p0, p1, p2}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->createStartBarrier-3ABfNKs([Landroidx/constraintlayout/compose/LayoutReference;F)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 19
    .line 20
    const-string p1, "Super calls with default arguments not supported in this target, function: createStartBarrier-3ABfNKs"

    .line 21
    .line 22
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p0
.end method

.method public static synthetic createTopBarrier-3ABfNKs$default(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;[Landroidx/constraintlayout/compose/LayoutReference;FILjava/lang/Object;)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;
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
    const/4 p2, 0x0

    .line 8
    int-to-float p2, p2

    .line 9
    invoke-static {p2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    :cond_0
    invoke-virtual {p0, p1, p2}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->createTopBarrier-3ABfNKs([Landroidx/constraintlayout/compose/LayoutReference;F)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 19
    .line 20
    const-string p1, "Super calls with default arguments not supported in this target, function: createTopBarrier-3ABfNKs"

    .line 21
    .line 22
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p0
.end method

.method public static synthetic createVerticalChain$default(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;[Landroidx/constraintlayout/compose/LayoutReference;Landroidx/constraintlayout/compose/ChainStyle;ILjava/lang/Object;)Landroidx/constraintlayout/compose/VerticalChainReference;
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
    sget-object p2, Landroidx/constraintlayout/compose/ChainStyle;->Companion:Landroidx/constraintlayout/compose/ChainStyle$Companion;

    .line 8
    .line 9
    invoke-virtual {p2}, Landroidx/constraintlayout/compose/ChainStyle$Companion;->getSpread()Landroidx/constraintlayout/compose/ChainStyle;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    :cond_0
    invoke-virtual {p0, p1, p2}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->createVerticalChain([Landroidx/constraintlayout/compose/LayoutReference;Landroidx/constraintlayout/compose/ChainStyle;)Landroidx/constraintlayout/compose/VerticalChainReference;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 19
    .line 20
    const-string p1, "Super calls with default arguments not supported in this target, function: createVerticalChain"

    .line 21
    .line 22
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p0
.end method

.method public static synthetic getContainerObject$annotations()V
    .locals 0
    .annotation build Lkotlin/PublishedApi;
    .end annotation

    return-void
.end method

.method public static synthetic getHelpersHashCode$annotations()V
    .locals 0
    .annotation build Lkotlin/PublishedApi;
    .end annotation

    return-void
.end method

.method public static synthetic getTasks$annotations()V
    .locals 0
    .annotation runtime Lkotlin/Deprecated;
        message = "Tasks is unused, it breaks the immutability promise."
    .end annotation

    return-void
.end method

.method private final updateHelpersHashCode(I)V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->helpersHashCode:I

    .line 2
    .line 3
    mul-int/lit16 v0, v0, 0x3f1

    .line 4
    .line 5
    add-int/2addr v0, p1

    .line 6
    const p1, 0x3b9aca07

    .line 7
    .line 8
    .line 9
    rem-int/2addr v0, p1

    .line 10
    iput v0, p0, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->helpersHashCode:I

    .line 11
    .line 12
    return-void
.end method

.method public static synthetic withChainParams-ouYQatA$default(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;Landroidx/constraintlayout/compose/LayoutReference;FFFFFFFFFILjava/lang/Object;)Landroidx/constraintlayout/compose/LayoutReference;
    .locals 10

    .line 1
    move/from16 v0, p11

    .line 2
    .line 3
    if-nez p12, :cond_9

    .line 4
    .line 5
    and-int/lit8 v1, v0, 0x1

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    int-to-float v1, v2

    .line 11
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v1, p2

    .line 17
    :goto_0
    and-int/lit8 v3, v0, 0x2

    .line 18
    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    int-to-float v3, v2

    .line 22
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move v3, p3

    .line 28
    :goto_1
    and-int/lit8 v4, v0, 0x4

    .line 29
    .line 30
    if-eqz v4, :cond_2

    .line 31
    .line 32
    int-to-float v4, v2

    .line 33
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    goto :goto_2

    .line 38
    :cond_2
    move v4, p4

    .line 39
    :goto_2
    and-int/lit8 v5, v0, 0x8

    .line 40
    .line 41
    if-eqz v5, :cond_3

    .line 42
    .line 43
    int-to-float v5, v2

    .line 44
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    goto :goto_3

    .line 49
    :cond_3
    move v5, p5

    .line 50
    :goto_3
    and-int/lit8 v6, v0, 0x10

    .line 51
    .line 52
    if-eqz v6, :cond_4

    .line 53
    .line 54
    int-to-float v6, v2

    .line 55
    invoke-static {v6}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    goto :goto_4

    .line 60
    :cond_4
    move/from16 v6, p6

    .line 61
    .line 62
    :goto_4
    and-int/lit8 v7, v0, 0x20

    .line 63
    .line 64
    if-eqz v7, :cond_5

    .line 65
    .line 66
    int-to-float v7, v2

    .line 67
    invoke-static {v7}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    goto :goto_5

    .line 72
    :cond_5
    move/from16 v7, p7

    .line 73
    .line 74
    :goto_5
    and-int/lit8 v8, v0, 0x40

    .line 75
    .line 76
    if-eqz v8, :cond_6

    .line 77
    .line 78
    int-to-float v8, v2

    .line 79
    invoke-static {v8}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 80
    .line 81
    .line 82
    move-result v8

    .line 83
    goto :goto_6

    .line 84
    :cond_6
    move/from16 v8, p8

    .line 85
    .line 86
    :goto_6
    and-int/lit16 v9, v0, 0x80

    .line 87
    .line 88
    if-eqz v9, :cond_7

    .line 89
    .line 90
    int-to-float v2, v2

    .line 91
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    goto :goto_7

    .line 96
    :cond_7
    move/from16 v2, p9

    .line 97
    .line 98
    :goto_7
    and-int/lit16 v0, v0, 0x100

    .line 99
    .line 100
    if-eqz v0, :cond_8

    .line 101
    .line 102
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 103
    .line 104
    move/from16 p12, v0

    .line 105
    .line 106
    :goto_8
    move-object p2, p0

    .line 107
    move-object p3, p1

    .line 108
    move p4, v1

    .line 109
    move/from16 p11, v2

    .line 110
    .line 111
    move p5, v3

    .line 112
    move/from16 p6, v4

    .line 113
    .line 114
    move/from16 p7, v5

    .line 115
    .line 116
    move/from16 p8, v6

    .line 117
    .line 118
    move/from16 p9, v7

    .line 119
    .line 120
    move/from16 p10, v8

    .line 121
    .line 122
    goto :goto_9

    .line 123
    :cond_8
    move/from16 p12, p10

    .line 124
    .line 125
    goto :goto_8

    .line 126
    :goto_9
    invoke-virtual/range {p2 .. p12}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->withChainParams-ouYQatA(Landroidx/constraintlayout/compose/LayoutReference;FFFFFFFFF)Landroidx/constraintlayout/compose/LayoutReference;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    return-object v0

    .line 131
    :cond_9
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 132
    .line 133
    const-string v1, "Super calls with default arguments not supported in this target, function: withChainParams-ouYQatA"

    .line 134
    .line 135
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    throw v0
.end method

.method public static synthetic withHorizontalChainParams-YLPp7PM$default(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;Landroidx/constraintlayout/compose/LayoutReference;FFFFFILjava/lang/Object;)Landroidx/constraintlayout/compose/LayoutReference;
    .locals 5

    .line 1
    if-nez p8, :cond_5

    .line 2
    .line 3
    and-int/lit8 v0, p7, 0x1

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    int-to-float v0, v1

    .line 9
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v0, p2

    .line 15
    :goto_0
    and-int/lit8 v2, p7, 0x2

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    int-to-float v2, v1

    .line 20
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move v2, p3

    .line 26
    :goto_1
    and-int/lit8 v3, p7, 0x4

    .line 27
    .line 28
    if-eqz v3, :cond_2

    .line 29
    .line 30
    int-to-float v3, v1

    .line 31
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    goto :goto_2

    .line 36
    :cond_2
    move v3, p4

    .line 37
    :goto_2
    and-int/lit8 v4, p7, 0x8

    .line 38
    .line 39
    if-eqz v4, :cond_3

    .line 40
    .line 41
    int-to-float v1, v1

    .line 42
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    goto :goto_3

    .line 47
    :cond_3
    move v1, p5

    .line 48
    :goto_3
    and-int/lit8 v4, p7, 0x10

    .line 49
    .line 50
    if-eqz v4, :cond_4

    .line 51
    .line 52
    const/high16 v4, 0x7fc00000    # Float.NaN

    .line 53
    .line 54
    move p8, v4

    .line 55
    :goto_4
    move-object p2, p0

    .line 56
    move-object p3, p1

    .line 57
    move p4, v0

    .line 58
    move p7, v1

    .line 59
    move p5, v2

    .line 60
    move p6, v3

    .line 61
    goto :goto_5

    .line 62
    :cond_4
    move p8, p6

    .line 63
    goto :goto_4

    .line 64
    :goto_5
    invoke-virtual/range {p2 .. p8}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->withHorizontalChainParams-YLPp7PM(Landroidx/constraintlayout/compose/LayoutReference;FFFFF)Landroidx/constraintlayout/compose/LayoutReference;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    return-object v0

    .line 69
    :cond_5
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 70
    .line 71
    const-string v1, "Super calls with default arguments not supported in this target, function: withHorizontalChainParams-YLPp7PM"

    .line 72
    .line 73
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw v0
.end method

.method public static synthetic withVerticalChainParams-YLPp7PM$default(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;Landroidx/constraintlayout/compose/LayoutReference;FFFFFILjava/lang/Object;)Landroidx/constraintlayout/compose/LayoutReference;
    .locals 5

    .line 1
    if-nez p8, :cond_5

    .line 2
    .line 3
    and-int/lit8 v0, p7, 0x1

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    int-to-float v0, v1

    .line 9
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v0, p2

    .line 15
    :goto_0
    and-int/lit8 v2, p7, 0x2

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    int-to-float v2, v1

    .line 20
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move v2, p3

    .line 26
    :goto_1
    and-int/lit8 v3, p7, 0x4

    .line 27
    .line 28
    if-eqz v3, :cond_2

    .line 29
    .line 30
    int-to-float v3, v1

    .line 31
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    goto :goto_2

    .line 36
    :cond_2
    move v3, p4

    .line 37
    :goto_2
    and-int/lit8 v4, p7, 0x8

    .line 38
    .line 39
    if-eqz v4, :cond_3

    .line 40
    .line 41
    int-to-float v1, v1

    .line 42
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    goto :goto_3

    .line 47
    :cond_3
    move v1, p5

    .line 48
    :goto_3
    and-int/lit8 v4, p7, 0x10

    .line 49
    .line 50
    if-eqz v4, :cond_4

    .line 51
    .line 52
    const/high16 v4, 0x7fc00000    # Float.NaN

    .line 53
    .line 54
    move p8, v4

    .line 55
    :goto_4
    move-object p2, p0

    .line 56
    move-object p3, p1

    .line 57
    move p4, v0

    .line 58
    move p7, v1

    .line 59
    move p5, v2

    .line 60
    move p6, v3

    .line 61
    goto :goto_5

    .line 62
    :cond_4
    move p8, p6

    .line 63
    goto :goto_4

    .line 64
    :goto_5
    invoke-virtual/range {p2 .. p8}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->withVerticalChainParams-YLPp7PM(Landroidx/constraintlayout/compose/LayoutReference;FFFFF)Landroidx/constraintlayout/compose/LayoutReference;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    return-object v0

    .line 69
    :cond_5
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 70
    .line 71
    const-string v1, "Super calls with default arguments not supported in this target, function: withVerticalChainParams-YLPp7PM"

    .line 72
    .line 73
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw v0
.end method


# virtual methods
.method public final applyTo(Landroidx/constraintlayout/compose/State;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->containerObject:Landroidx/constraintlayout/core/parser/CLObject;

    .line 2
    .line 3
    new-instance v1, Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;

    .line 4
    .line 5
    invoke-direct {v1}, Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {v0, p1, v1}, Landroidx/constraintlayout/core/state/ConstraintSetParser;->populateState(Landroidx/constraintlayout/core/parser/CLObject;Landroidx/constraintlayout/core/state/State;Landroidx/constraintlayout/core/state/ConstraintSetParser$LayoutVariables;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final asCLContainer$constraintlayout_compose_release(Landroidx/constraintlayout/compose/LayoutReference;)Landroidx/constraintlayout/core/parser/CLObject;
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroidx/constraintlayout/compose/LayoutReference;->getId$constraintlayout_compose_release()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->containerObject:Landroidx/constraintlayout/core/parser/CLObject;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroidx/constraintlayout/core/parser/CLContainer;->getObjectOrNull(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLObject;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->containerObject:Landroidx/constraintlayout/core/parser/CLObject;

    .line 18
    .line 19
    new-instance v1, Landroidx/constraintlayout/core/parser/CLObject;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    new-array v2, v2, [C

    .line 23
    .line 24
    invoke-direct {v1, v2}, Landroidx/constraintlayout/core/parser/CLObject;-><init>([C)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1, v1}, Landroidx/constraintlayout/core/parser/CLContainer;->put(Ljava/lang/String;Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->containerObject:Landroidx/constraintlayout/core/parser/CLObject;

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Landroidx/constraintlayout/core/parser/CLContainer;->getObject(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLObject;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1
.end method

.method public final constrain(Landroidx/constraintlayout/compose/ConstrainedLayoutReference;Lkotlin/jvm/functions/Function1;)Landroidx/constraintlayout/compose/ConstrainScope;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/constraintlayout/compose/ConstrainScope;",
            "Lkotlin/Unit;",
            ">;)",
            "Landroidx/constraintlayout/compose/ConstrainScope;"
        }
    .end annotation

    .line 3
    new-instance v0, Landroidx/constraintlayout/compose/ConstrainScope;

    invoke-virtual {p1}, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;->getId$constraintlayout_compose_release()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, p1}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->asCLContainer$constraintlayout_compose_release(Landroidx/constraintlayout/compose/LayoutReference;)Landroidx/constraintlayout/core/parser/CLObject;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Landroidx/constraintlayout/compose/ConstrainScope;-><init>(Ljava/lang/Object;Landroidx/constraintlayout/core/parser/CLObject;)V

    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final constrain(Landroidx/constraintlayout/compose/HorizontalChainReference;Lkotlin/jvm/functions/Function1;)Landroidx/constraintlayout/compose/HorizontalChainScope;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/constraintlayout/compose/HorizontalChainReference;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/constraintlayout/compose/HorizontalChainScope;",
            "Lkotlin/Unit;",
            ">;)",
            "Landroidx/constraintlayout/compose/HorizontalChainScope;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/constraintlayout/compose/HorizontalChainScope;

    invoke-virtual {p1}, Landroidx/constraintlayout/compose/LayoutReference;->getId$constraintlayout_compose_release()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, p1}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->asCLContainer$constraintlayout_compose_release(Landroidx/constraintlayout/compose/LayoutReference;)Landroidx/constraintlayout/core/parser/CLObject;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Landroidx/constraintlayout/compose/HorizontalChainScope;-><init>(Ljava/lang/Object;Landroidx/constraintlayout/core/parser/CLObject;)V

    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final constrain(Landroidx/constraintlayout/compose/VerticalChainReference;Lkotlin/jvm/functions/Function1;)Landroidx/constraintlayout/compose/VerticalChainScope;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/constraintlayout/compose/VerticalChainReference;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/constraintlayout/compose/VerticalChainScope;",
            "Lkotlin/Unit;",
            ">;)",
            "Landroidx/constraintlayout/compose/VerticalChainScope;"
        }
    .end annotation

    .line 2
    new-instance v0, Landroidx/constraintlayout/compose/VerticalChainScope;

    invoke-virtual {p1}, Landroidx/constraintlayout/compose/LayoutReference;->getId$constraintlayout_compose_release()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, p1}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->asCLContainer$constraintlayout_compose_release(Landroidx/constraintlayout/compose/LayoutReference;)Landroidx/constraintlayout/core/parser/CLObject;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Landroidx/constraintlayout/compose/VerticalChainScope;-><init>(Ljava/lang/Object;Landroidx/constraintlayout/core/parser/CLObject;)V

    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final constrain([Landroidx/constraintlayout/compose/ConstrainedLayoutReference;Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/constraintlayout/compose/ConstrainScope;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 4
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    .line 5
    invoke-virtual {p0, v2, p2}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->constrain(Landroidx/constraintlayout/compose/ConstrainedLayoutReference;Lkotlin/jvm/functions/Function1;)Landroidx/constraintlayout/compose/ConstrainScope;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final createAbsoluteLeftBarrier-3ABfNKs([Landroidx/constraintlayout/compose/LayoutReference;F)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;
    .locals 6

    .line 1
    new-instance v0, Landroidx/constraintlayout/compose/LayoutReferenceImpl;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->createHelperId()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/LayoutReferenceImpl;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Landroidx/constraintlayout/core/parser/CLArray;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    new-array v3, v2, [C

    .line 18
    .line 19
    invoke-direct {v1, v3}, Landroidx/constraintlayout/core/parser/CLArray;-><init>([C)V

    .line 20
    .line 21
    .line 22
    array-length v3, p1

    .line 23
    move v4, v2

    .line 24
    :goto_0
    if-ge v4, v3, :cond_0

    .line 25
    .line 26
    aget-object v5, p1, v4

    .line 27
    .line 28
    invoke-virtual {v5}, Landroidx/constraintlayout/compose/LayoutReference;->getId$constraintlayout_compose_release()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-static {v5}, Landroidx/constraintlayout/core/parser/CLString;->from(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLString;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-virtual {v1, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->add(Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 41
    .line 42
    .line 43
    add-int/lit8 v4, v4, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->asCLContainer$constraintlayout_compose_release(Landroidx/constraintlayout/compose/LayoutReference;)Landroidx/constraintlayout/core/parser/CLObject;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    const-string v4, "type"

    .line 51
    .line 52
    const-string v5, "barrier"

    .line 53
    .line 54
    invoke-virtual {v3, v4, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const-string v4, "direction"

    .line 58
    .line 59
    const-string v5, "left"

    .line 60
    .line 61
    invoke-virtual {v3, v4, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const-string v4, "margin"

    .line 65
    .line 66
    invoke-virtual {v3, v4, p2}, Landroidx/constraintlayout/core/parser/CLContainer;->putNumber(Ljava/lang/String;F)V

    .line 67
    .line 68
    .line 69
    const-string v4, "contains"

    .line 70
    .line 71
    invoke-virtual {v3, v4, v1}, Landroidx/constraintlayout/core/parser/CLContainer;->put(Ljava/lang/String;Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 72
    .line 73
    .line 74
    const/16 v1, 0xb

    .line 75
    .line 76
    invoke-direct {p0, v1}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->updateHelpersHashCode(I)V

    .line 77
    .line 78
    .line 79
    array-length v1, p1

    .line 80
    move v3, v2

    .line 81
    :goto_1
    if-ge v3, v1, :cond_1

    .line 82
    .line 83
    aget-object v4, p1, v3

    .line 84
    .line 85
    invoke-virtual {v4}, Landroidx/constraintlayout/compose/LayoutReference;->hashCode()I

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    invoke-direct {p0, v4}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->updateHelpersHashCode(I)V

    .line 90
    .line 91
    .line 92
    add-int/lit8 v3, v3, 0x1

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_1
    invoke-static {p2}, Landroidx/compose/ui/unit/Dp;->hashCode-impl(F)I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    invoke-direct {p0, p1}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->updateHelpersHashCode(I)V

    .line 100
    .line 101
    .line 102
    new-instance p1, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;

    .line 103
    .line 104
    invoke-virtual {v0}, Landroidx/constraintlayout/compose/LayoutReference;->getId$constraintlayout_compose_release()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    invoke-direct {p1, p2, v2, v0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;-><init>(Ljava/lang/Object;ILandroidx/constraintlayout/compose/LayoutReference;)V

    .line 109
    .line 110
    .line 111
    return-object p1
.end method

.method public final createAbsoluteRightBarrier-3ABfNKs([Landroidx/constraintlayout/compose/LayoutReference;F)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;
    .locals 6

    .line 1
    new-instance v0, Landroidx/constraintlayout/compose/LayoutReferenceImpl;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->createHelperId()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/LayoutReferenceImpl;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Landroidx/constraintlayout/core/parser/CLArray;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    new-array v3, v2, [C

    .line 18
    .line 19
    invoke-direct {v1, v3}, Landroidx/constraintlayout/core/parser/CLArray;-><init>([C)V

    .line 20
    .line 21
    .line 22
    array-length v3, p1

    .line 23
    move v4, v2

    .line 24
    :goto_0
    if-ge v4, v3, :cond_0

    .line 25
    .line 26
    aget-object v5, p1, v4

    .line 27
    .line 28
    invoke-virtual {v5}, Landroidx/constraintlayout/compose/LayoutReference;->getId$constraintlayout_compose_release()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-static {v5}, Landroidx/constraintlayout/core/parser/CLString;->from(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLString;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-virtual {v1, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->add(Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 41
    .line 42
    .line 43
    add-int/lit8 v4, v4, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->asCLContainer$constraintlayout_compose_release(Landroidx/constraintlayout/compose/LayoutReference;)Landroidx/constraintlayout/core/parser/CLObject;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    const-string v4, "type"

    .line 51
    .line 52
    const-string v5, "barrier"

    .line 53
    .line 54
    invoke-virtual {v3, v4, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const-string v4, "direction"

    .line 58
    .line 59
    const-string v5, "right"

    .line 60
    .line 61
    invoke-virtual {v3, v4, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const-string v4, "margin"

    .line 65
    .line 66
    invoke-virtual {v3, v4, p2}, Landroidx/constraintlayout/core/parser/CLContainer;->putNumber(Ljava/lang/String;F)V

    .line 67
    .line 68
    .line 69
    const-string v4, "contains"

    .line 70
    .line 71
    invoke-virtual {v3, v4, v1}, Landroidx/constraintlayout/core/parser/CLContainer;->put(Ljava/lang/String;Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 72
    .line 73
    .line 74
    const/16 v1, 0xe

    .line 75
    .line 76
    invoke-direct {p0, v1}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->updateHelpersHashCode(I)V

    .line 77
    .line 78
    .line 79
    array-length v1, p1

    .line 80
    move v3, v2

    .line 81
    :goto_1
    if-ge v3, v1, :cond_1

    .line 82
    .line 83
    aget-object v4, p1, v3

    .line 84
    .line 85
    invoke-virtual {v4}, Landroidx/constraintlayout/compose/LayoutReference;->hashCode()I

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    invoke-direct {p0, v4}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->updateHelpersHashCode(I)V

    .line 90
    .line 91
    .line 92
    add-int/lit8 v3, v3, 0x1

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_1
    invoke-static {p2}, Landroidx/compose/ui/unit/Dp;->hashCode-impl(F)I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    invoke-direct {p0, p1}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->updateHelpersHashCode(I)V

    .line 100
    .line 101
    .line 102
    new-instance p1, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;

    .line 103
    .line 104
    invoke-virtual {v0}, Landroidx/constraintlayout/compose/LayoutReference;->getId$constraintlayout_compose_release()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    invoke-direct {p1, p2, v2, v0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;-><init>(Ljava/lang/Object;ILandroidx/constraintlayout/compose/LayoutReference;)V

    .line 109
    .line 110
    .line 111
    return-object p1
.end method

.method public final createBottomBarrier-3ABfNKs([Landroidx/constraintlayout/compose/LayoutReference;F)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;
    .locals 6

    .line 1
    new-instance v0, Landroidx/constraintlayout/compose/LayoutReferenceImpl;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->createHelperId()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/LayoutReferenceImpl;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Landroidx/constraintlayout/core/parser/CLArray;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    new-array v3, v2, [C

    .line 18
    .line 19
    invoke-direct {v1, v3}, Landroidx/constraintlayout/core/parser/CLArray;-><init>([C)V

    .line 20
    .line 21
    .line 22
    array-length v3, p1

    .line 23
    move v4, v2

    .line 24
    :goto_0
    if-ge v4, v3, :cond_0

    .line 25
    .line 26
    aget-object v5, p1, v4

    .line 27
    .line 28
    invoke-virtual {v5}, Landroidx/constraintlayout/compose/LayoutReference;->getId$constraintlayout_compose_release()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-static {v5}, Landroidx/constraintlayout/core/parser/CLString;->from(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLString;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-virtual {v1, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->add(Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 41
    .line 42
    .line 43
    add-int/lit8 v4, v4, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->asCLContainer$constraintlayout_compose_release(Landroidx/constraintlayout/compose/LayoutReference;)Landroidx/constraintlayout/core/parser/CLObject;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    const-string v4, "type"

    .line 51
    .line 52
    const-string v5, "barrier"

    .line 53
    .line 54
    invoke-virtual {v3, v4, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const-string v4, "direction"

    .line 58
    .line 59
    const-string v5, "bottom"

    .line 60
    .line 61
    invoke-virtual {v3, v4, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const-string v4, "margin"

    .line 65
    .line 66
    invoke-virtual {v3, v4, p2}, Landroidx/constraintlayout/core/parser/CLContainer;->putNumber(Ljava/lang/String;F)V

    .line 67
    .line 68
    .line 69
    const-string v4, "contains"

    .line 70
    .line 71
    invoke-virtual {v3, v4, v1}, Landroidx/constraintlayout/core/parser/CLContainer;->put(Ljava/lang/String;Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 72
    .line 73
    .line 74
    const/16 v1, 0xf

    .line 75
    .line 76
    invoke-direct {p0, v1}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->updateHelpersHashCode(I)V

    .line 77
    .line 78
    .line 79
    array-length v1, p1

    .line 80
    move v3, v2

    .line 81
    :goto_1
    if-ge v3, v1, :cond_1

    .line 82
    .line 83
    aget-object v4, p1, v3

    .line 84
    .line 85
    invoke-virtual {v4}, Landroidx/constraintlayout/compose/LayoutReference;->hashCode()I

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    invoke-direct {p0, v4}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->updateHelpersHashCode(I)V

    .line 90
    .line 91
    .line 92
    add-int/lit8 v3, v3, 0x1

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_1
    invoke-static {p2}, Landroidx/compose/ui/unit/Dp;->hashCode-impl(F)I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    invoke-direct {p0, p1}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->updateHelpersHashCode(I)V

    .line 100
    .line 101
    .line 102
    new-instance p1, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;

    .line 103
    .line 104
    invoke-virtual {v0}, Landroidx/constraintlayout/compose/LayoutReference;->getId$constraintlayout_compose_release()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    invoke-direct {p1, p2, v2, v0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;-><init>(Ljava/lang/Object;ILandroidx/constraintlayout/compose/LayoutReference;)V

    .line 109
    .line 110
    .line 111
    return-object p1
.end method

.method public final createColumn-lG28NQ4([Landroidx/constraintlayout/compose/LayoutReference;F[F)Landroidx/constraintlayout/compose/ConstrainedLayoutReference;
    .locals 14
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "Range"
        }
    .end annotation

    .line 1
    move-object/from16 v7, p3

    .line 2
    .line 3
    array-length v0, v7

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    if-nez v0, :cond_2

    .line 10
    .line 11
    array-length v0, p1

    .line 12
    array-length v1, v7

    .line 13
    if-ne v0, v1, :cond_1

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    new-instance v1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v2, "Number of weights ("

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    array-length v2, v7

    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v2, ") should match number of elements ("

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    array-length p1, p1

    .line 38
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string p1, ")."

    .line 42
    .line 43
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw v0

    .line 54
    :cond_2
    :goto_1
    array-length v0, p1

    .line 55
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    move-object v1, p1

    .line 60
    check-cast v1, [Landroidx/constraintlayout/compose/LayoutReference;

    .line 61
    .line 62
    const/16 v12, 0x7a8

    .line 63
    .line 64
    const/4 v13, 0x0

    .line 65
    const/4 v2, 0x0

    .line 66
    const/4 v3, 0x1

    .line 67
    const/4 v4, 0x0

    .line 68
    const/4 v6, 0x0

    .line 69
    const/4 v8, 0x0

    .line 70
    const/4 v9, 0x0

    .line 71
    const/4 v10, 0x0

    .line 72
    const/4 v11, 0x0

    .line 73
    move-object v0, p0

    .line 74
    move/from16 v5, p2

    .line 75
    .line 76
    invoke-static/range {v0 .. v13}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->createGrid-Hu23Yyw$default(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;[Landroidx/constraintlayout/compose/LayoutReference;IIZFF[F[F[Landroidx/constraintlayout/compose/Skip;[Landroidx/constraintlayout/compose/Span;IILjava/lang/Object;)Landroidx/constraintlayout/compose/ConstrainedLayoutReference;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    return-object p1
.end method

.method public final createEndBarrier-3ABfNKs([Landroidx/constraintlayout/compose/LayoutReference;F)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;
    .locals 6

    .line 1
    new-instance v0, Landroidx/constraintlayout/compose/LayoutReferenceImpl;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->createHelperId()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/LayoutReferenceImpl;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Landroidx/constraintlayout/core/parser/CLArray;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    new-array v3, v2, [C

    .line 18
    .line 19
    invoke-direct {v1, v3}, Landroidx/constraintlayout/core/parser/CLArray;-><init>([C)V

    .line 20
    .line 21
    .line 22
    array-length v3, p1

    .line 23
    move v4, v2

    .line 24
    :goto_0
    if-ge v4, v3, :cond_0

    .line 25
    .line 26
    aget-object v5, p1, v4

    .line 27
    .line 28
    invoke-virtual {v5}, Landroidx/constraintlayout/compose/LayoutReference;->getId$constraintlayout_compose_release()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-static {v5}, Landroidx/constraintlayout/core/parser/CLString;->from(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLString;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-virtual {v1, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->add(Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 41
    .line 42
    .line 43
    add-int/lit8 v4, v4, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->asCLContainer$constraintlayout_compose_release(Landroidx/constraintlayout/compose/LayoutReference;)Landroidx/constraintlayout/core/parser/CLObject;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    const-string v4, "type"

    .line 51
    .line 52
    const-string v5, "barrier"

    .line 53
    .line 54
    invoke-virtual {v3, v4, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const-string v4, "direction"

    .line 58
    .line 59
    const-string v5, "end"

    .line 60
    .line 61
    invoke-virtual {v3, v4, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const-string v4, "margin"

    .line 65
    .line 66
    invoke-virtual {v3, v4, p2}, Landroidx/constraintlayout/core/parser/CLContainer;->putNumber(Ljava/lang/String;F)V

    .line 67
    .line 68
    .line 69
    const-string v4, "contains"

    .line 70
    .line 71
    invoke-virtual {v3, v4, v1}, Landroidx/constraintlayout/core/parser/CLContainer;->put(Ljava/lang/String;Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 72
    .line 73
    .line 74
    const/16 v1, 0xd

    .line 75
    .line 76
    invoke-direct {p0, v1}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->updateHelpersHashCode(I)V

    .line 77
    .line 78
    .line 79
    array-length v1, p1

    .line 80
    move v3, v2

    .line 81
    :goto_1
    if-ge v3, v1, :cond_1

    .line 82
    .line 83
    aget-object v4, p1, v3

    .line 84
    .line 85
    invoke-virtual {v4}, Landroidx/constraintlayout/compose/LayoutReference;->hashCode()I

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    invoke-direct {p0, v4}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->updateHelpersHashCode(I)V

    .line 90
    .line 91
    .line 92
    add-int/lit8 v3, v3, 0x1

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_1
    invoke-static {p2}, Landroidx/compose/ui/unit/Dp;->hashCode-impl(F)I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    invoke-direct {p0, p1}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->updateHelpersHashCode(I)V

    .line 100
    .line 101
    .line 102
    new-instance p1, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;

    .line 103
    .line 104
    invoke-virtual {v0}, Landroidx/constraintlayout/compose/LayoutReference;->getId$constraintlayout_compose_release()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    invoke-direct {p1, p2, v2, v0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;-><init>(Ljava/lang/Object;ILandroidx/constraintlayout/compose/LayoutReference;)V

    .line 109
    .line 110
    .line 111
    return-object p1
.end method

.method public final createFlow-6oEtc9w([Landroidx/constraintlayout/compose/LayoutReference;ZFFIFFLandroidx/constraintlayout/compose/Wrap;Landroidx/constraintlayout/compose/VerticalAlign;Landroidx/constraintlayout/compose/HorizontalAlign;FFLandroidx/constraintlayout/compose/FlowStyle;Landroidx/constraintlayout/compose/FlowStyle;)Landroidx/constraintlayout/compose/ConstrainedLayoutReference;
    .locals 18

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    move-object v2, v0

    .line 9
    check-cast v2, [Landroidx/constraintlayout/compose/LayoutReference;

    .line 10
    .line 11
    move/from16 v9, p6

    .line 12
    .line 13
    move/from16 v10, p7

    .line 14
    .line 15
    move-object/from16 v1, p0

    .line 16
    .line 17
    move/from16 v3, p2

    .line 18
    .line 19
    move/from16 v4, p3

    .line 20
    .line 21
    move/from16 v5, p4

    .line 22
    .line 23
    move/from16 v6, p5

    .line 24
    .line 25
    move/from16 v7, p6

    .line 26
    .line 27
    move/from16 v8, p7

    .line 28
    .line 29
    move-object/from16 v11, p8

    .line 30
    .line 31
    move-object/from16 v12, p9

    .line 32
    .line 33
    move-object/from16 v13, p10

    .line 34
    .line 35
    move/from16 v14, p11

    .line 36
    .line 37
    move/from16 v15, p12

    .line 38
    .line 39
    move-object/from16 v16, p13

    .line 40
    .line 41
    move-object/from16 v17, p14

    .line 42
    .line 43
    invoke-virtual/range {v1 .. v17}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->createFlow-Fgo90cY([Landroidx/constraintlayout/compose/LayoutReference;ZFFIFFFFLandroidx/constraintlayout/compose/Wrap;Landroidx/constraintlayout/compose/VerticalAlign;Landroidx/constraintlayout/compose/HorizontalAlign;FFLandroidx/constraintlayout/compose/FlowStyle;Landroidx/constraintlayout/compose/FlowStyle;)Landroidx/constraintlayout/compose/ConstrainedLayoutReference;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    return-object v0
.end method

.method public final createFlow-Fgo90cY([Landroidx/constraintlayout/compose/LayoutReference;ZFFIFFFFLandroidx/constraintlayout/compose/Wrap;Landroidx/constraintlayout/compose/VerticalAlign;Landroidx/constraintlayout/compose/HorizontalAlign;FFLandroidx/constraintlayout/compose/FlowStyle;Landroidx/constraintlayout/compose/FlowStyle;)Landroidx/constraintlayout/compose/ConstrainedLayoutReference;
    .locals 6

    .line 1
    new-instance v0, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;

    invoke-direct {p0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->createHelperId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;-><init>(Ljava/lang/Object;)V

    .line 2
    new-instance v1, Landroidx/constraintlayout/core/parser/CLArray;

    const/4 v2, 0x0

    new-array v3, v2, [C

    invoke-direct {v1, v3}, Landroidx/constraintlayout/core/parser/CLArray;-><init>([C)V

    .line 3
    array-length v3, p1

    move v4, v2

    :goto_0
    if-ge v4, v3, :cond_1

    aget-object v5, p1, v4

    if-eqz v5, :cond_0

    .line 4
    invoke-virtual {v5}, Landroidx/constraintlayout/compose/LayoutReference;->getId$constraintlayout_compose_release()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroidx/constraintlayout/core/parser/CLString;->from(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLString;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->add(Landroidx/constraintlayout/core/parser/CLElement;)V

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 5
    :cond_1
    new-instance v3, Landroidx/constraintlayout/core/parser/CLArray;

    new-array v4, v2, [C

    invoke-direct {v3, v4}, Landroidx/constraintlayout/core/parser/CLArray;-><init>([C)V

    .line 6
    new-instance v4, Landroidx/constraintlayout/core/parser/CLNumber;

    invoke-direct {v4, p6}, Landroidx/constraintlayout/core/parser/CLNumber;-><init>(F)V

    invoke-virtual {v3, v4}, Landroidx/constraintlayout/core/parser/CLContainer;->add(Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 7
    new-instance p6, Landroidx/constraintlayout/core/parser/CLNumber;

    invoke-direct {p6, p7}, Landroidx/constraintlayout/core/parser/CLNumber;-><init>(F)V

    invoke-virtual {v3, p6}, Landroidx/constraintlayout/core/parser/CLContainer;->add(Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 8
    new-instance p6, Landroidx/constraintlayout/core/parser/CLNumber;

    invoke-direct {p6, p8}, Landroidx/constraintlayout/core/parser/CLNumber;-><init>(F)V

    invoke-virtual {v3, p6}, Landroidx/constraintlayout/core/parser/CLContainer;->add(Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 9
    new-instance p6, Landroidx/constraintlayout/core/parser/CLNumber;

    invoke-direct {p6, p9}, Landroidx/constraintlayout/core/parser/CLNumber;-><init>(F)V

    invoke-virtual {v3, p6}, Landroidx/constraintlayout/core/parser/CLContainer;->add(Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 10
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->asCLContainer$constraintlayout_compose_release(Landroidx/constraintlayout/compose/LayoutReference;)Landroidx/constraintlayout/core/parser/CLObject;

    move-result-object p6

    .line 11
    const-string p7, "contains"

    invoke-virtual {p6, p7, v1}, Landroidx/constraintlayout/core/parser/CLContainer;->put(Ljava/lang/String;Landroidx/constraintlayout/core/parser/CLElement;)V

    if-eqz p2, :cond_2

    .line 12
    const-string p2, "vFlow"

    goto :goto_1

    :cond_2
    const-string p2, "hFlow"

    :goto_1
    const-string p7, "type"

    invoke-virtual {p6, p7, p2}, Landroidx/constraintlayout/core/parser/CLContainer;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    const-string p2, "vGap"

    invoke-virtual {p6, p2, p3}, Landroidx/constraintlayout/core/parser/CLContainer;->putNumber(Ljava/lang/String;F)V

    .line 14
    const-string p2, "hGap"

    invoke-virtual {p6, p2, p4}, Landroidx/constraintlayout/core/parser/CLContainer;->putNumber(Ljava/lang/String;F)V

    .line 15
    const-string p2, "maxElement"

    int-to-float p3, p5

    invoke-virtual {p6, p2, p3}, Landroidx/constraintlayout/core/parser/CLContainer;->putNumber(Ljava/lang/String;F)V

    .line 16
    const-string p2, "padding"

    invoke-virtual {p6, p2, v3}, Landroidx/constraintlayout/core/parser/CLContainer;->put(Ljava/lang/String;Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 17
    const-string p2, "wrap"

    invoke-virtual/range {p10 .. p10}, Landroidx/constraintlayout/compose/Wrap;->getName$constraintlayout_compose_release()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p6, p2, p3}, Landroidx/constraintlayout/core/parser/CLContainer;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    const-string p2, "vAlign"

    invoke-virtual/range {p11 .. p11}, Landroidx/constraintlayout/compose/VerticalAlign;->getName$constraintlayout_compose_release()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p6, p2, p3}, Landroidx/constraintlayout/core/parser/CLContainer;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    const-string p2, "hAlign"

    invoke-virtual/range {p12 .. p12}, Landroidx/constraintlayout/compose/HorizontalAlign;->getName$constraintlayout_compose_release()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p6, p2, p3}, Landroidx/constraintlayout/core/parser/CLContainer;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    const-string p2, "hFlowBias"

    move/from16 p3, p13

    invoke-virtual {p6, p2, p3}, Landroidx/constraintlayout/core/parser/CLContainer;->putNumber(Ljava/lang/String;F)V

    .line 21
    const-string p2, "vFlowBias"

    move/from16 p3, p14

    invoke-virtual {p6, p2, p3}, Landroidx/constraintlayout/core/parser/CLContainer;->putNumber(Ljava/lang/String;F)V

    .line 22
    const-string p2, "vStyle"

    invoke-virtual/range {p15 .. p15}, Landroidx/constraintlayout/compose/FlowStyle;->getName$constraintlayout_compose_release()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p6, p2, p3}, Landroidx/constraintlayout/core/parser/CLContainer;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    const-string p2, "hStyle"

    invoke-virtual/range {p16 .. p16}, Landroidx/constraintlayout/compose/FlowStyle;->getName$constraintlayout_compose_release()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p6, p2, p3}, Landroidx/constraintlayout/core/parser/CLContainer;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const/16 p2, 0x10

    .line 24
    invoke-direct {p0, p2}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->updateHelpersHashCode(I)V

    .line 25
    array-length p2, p1

    move p3, v2

    :goto_2
    if-ge p3, p2, :cond_4

    aget-object p4, p1, p3

    if-eqz p4, :cond_3

    .line 26
    invoke-virtual {p4}, Ljava/lang/Object;->hashCode()I

    move-result p4

    goto :goto_3

    :cond_3
    move p4, v2

    :goto_3
    invoke-direct {p0, p4}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->updateHelpersHashCode(I)V

    add-int/lit8 p3, p3, 0x1

    goto :goto_2

    :cond_4
    return-object v0
.end method

.method public final createFlow-IkjhEj4([Landroidx/constraintlayout/compose/LayoutReference;ZFFIFLandroidx/constraintlayout/compose/Wrap;Landroidx/constraintlayout/compose/VerticalAlign;Landroidx/constraintlayout/compose/HorizontalAlign;FFLandroidx/constraintlayout/compose/FlowStyle;Landroidx/constraintlayout/compose/FlowStyle;)Landroidx/constraintlayout/compose/ConstrainedLayoutReference;
    .locals 18

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    move-object v2, v0

    .line 9
    check-cast v2, [Landroidx/constraintlayout/compose/LayoutReference;

    .line 10
    .line 11
    move/from16 v8, p6

    .line 12
    .line 13
    move/from16 v9, p6

    .line 14
    .line 15
    move/from16 v10, p6

    .line 16
    .line 17
    move-object/from16 v1, p0

    .line 18
    .line 19
    move/from16 v3, p2

    .line 20
    .line 21
    move/from16 v4, p3

    .line 22
    .line 23
    move/from16 v5, p4

    .line 24
    .line 25
    move/from16 v6, p5

    .line 26
    .line 27
    move/from16 v7, p6

    .line 28
    .line 29
    move-object/from16 v11, p7

    .line 30
    .line 31
    move-object/from16 v12, p8

    .line 32
    .line 33
    move-object/from16 v13, p9

    .line 34
    .line 35
    move/from16 v14, p10

    .line 36
    .line 37
    move/from16 v15, p11

    .line 38
    .line 39
    move-object/from16 v16, p12

    .line 40
    .line 41
    move-object/from16 v17, p13

    .line 42
    .line 43
    invoke-virtual/range {v1 .. v17}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->createFlow-Fgo90cY([Landroidx/constraintlayout/compose/LayoutReference;ZFFIFFFFLandroidx/constraintlayout/compose/Wrap;Landroidx/constraintlayout/compose/VerticalAlign;Landroidx/constraintlayout/compose/HorizontalAlign;FFLandroidx/constraintlayout/compose/FlowStyle;Landroidx/constraintlayout/compose/FlowStyle;)Landroidx/constraintlayout/compose/ConstrainedLayoutReference;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    return-object v0
.end method

.method public final createGrid-Hu23Yyw([Landroidx/constraintlayout/compose/LayoutReference;IIZFF[F[F[Landroidx/constraintlayout/compose/Skip;[Landroidx/constraintlayout/compose/Span;I)Landroidx/constraintlayout/compose/ConstrainedLayoutReference;
    .locals 27
    .param p2    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x1L
        .end annotation
    .end param
    .param p3    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x1L
        .end annotation
    .end param

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p7

    .line 8
    .line 9
    move-object/from16 v12, p8

    .line 10
    .line 11
    array-length v4, v3

    .line 12
    const/4 v13, 0x0

    .line 13
    const/4 v14, 0x1

    .line 14
    if-nez v4, :cond_0

    .line 15
    .line 16
    move v4, v14

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v4, v13

    .line 19
    :goto_0
    const-string v5, ")."

    .line 20
    .line 21
    const-string v6, "Number of weights ("

    .line 22
    .line 23
    if-nez v4, :cond_2

    .line 24
    .line 25
    if-lez v1, :cond_2

    .line 26
    .line 27
    array-length v4, v3

    .line 28
    if-ne v1, v4, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 32
    .line 33
    new-instance v2, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    array-length v3, v3

    .line 42
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v3, ") should match number of rows ("

    .line 46
    .line 47
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw v0

    .line 64
    :cond_2
    :goto_1
    array-length v4, v12

    .line 65
    if-nez v4, :cond_3

    .line 66
    .line 67
    move v4, v14

    .line 68
    goto :goto_2

    .line 69
    :cond_3
    move v4, v13

    .line 70
    :goto_2
    if-nez v4, :cond_5

    .line 71
    .line 72
    if-lez v2, :cond_5

    .line 73
    .line 74
    array-length v4, v12

    .line 75
    if-ne v2, v4, :cond_4

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 79
    .line 80
    new-instance v1, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    array-length v3, v12

    .line 89
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v3, ") should match number of columns ("

    .line 93
    .line 94
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    throw v0

    .line 111
    :cond_5
    :goto_3
    new-instance v15, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;

    .line 112
    .line 113
    invoke-direct/range {p0 .. p0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->createHelperId()I

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    invoke-direct {v15, v4}, Landroidx/constraintlayout/compose/ConstrainedLayoutReference;-><init>(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    new-instance v4, Landroidx/constraintlayout/core/parser/CLArray;

    .line 125
    .line 126
    new-array v5, v13, [C

    .line 127
    .line 128
    invoke-direct {v4, v5}, Landroidx/constraintlayout/core/parser/CLArray;-><init>([C)V

    .line 129
    .line 130
    .line 131
    array-length v5, v0

    .line 132
    move v6, v13

    .line 133
    :goto_4
    if-ge v6, v5, :cond_6

    .line 134
    .line 135
    aget-object v7, v0, v6

    .line 136
    .line 137
    invoke-virtual {v7}, Landroidx/constraintlayout/compose/LayoutReference;->getId$constraintlayout_compose_release()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v7

    .line 141
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v7

    .line 145
    invoke-static {v7}, Landroidx/constraintlayout/core/parser/CLString;->from(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLString;

    .line 146
    .line 147
    .line 148
    move-result-object v7

    .line 149
    invoke-virtual {v4, v7}, Landroidx/constraintlayout/core/parser/CLContainer;->add(Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 150
    .line 151
    .line 152
    add-int/lit8 v6, v6, 0x1

    .line 153
    .line 154
    goto :goto_4

    .line 155
    :cond_6
    array-length v0, v3

    .line 156
    const-string v16, ""

    .line 157
    .line 158
    if-le v0, v14, :cond_7

    .line 159
    .line 160
    const/16 v10, 0x3e

    .line 161
    .line 162
    const/4 v11, 0x0

    .line 163
    move-object v0, v4

    .line 164
    const-string v4, ","

    .line 165
    .line 166
    const/4 v5, 0x0

    .line 167
    const/4 v6, 0x0

    .line 168
    const/4 v7, 0x0

    .line 169
    const/4 v8, 0x0

    .line 170
    const/4 v9, 0x0

    .line 171
    invoke-static/range {v3 .. v11}, Lkotlin/collections/ArraysKt;->joinToString$default([FLjava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    goto :goto_5

    .line 176
    :cond_7
    move-object v0, v4

    .line 177
    move-object/from16 v3, v16

    .line 178
    .line 179
    :goto_5
    array-length v4, v12

    .line 180
    if-le v4, v14, :cond_8

    .line 181
    .line 182
    const/16 v10, 0x3e

    .line 183
    .line 184
    const/4 v11, 0x0

    .line 185
    const-string v4, ","

    .line 186
    .line 187
    const/4 v5, 0x0

    .line 188
    const/4 v6, 0x0

    .line 189
    const/4 v7, 0x0

    .line 190
    const/4 v8, 0x0

    .line 191
    const/4 v9, 0x0

    .line 192
    move-object/from16 v26, v12

    .line 193
    .line 194
    move-object v12, v3

    .line 195
    move-object/from16 v3, v26

    .line 196
    .line 197
    invoke-static/range {v3 .. v11}, Lkotlin/collections/ArraysKt;->joinToString$default([FLjava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v3

    .line 201
    :goto_6
    move-object/from16 v4, p9

    .line 202
    .line 203
    goto :goto_7

    .line 204
    :cond_8
    move-object v12, v3

    .line 205
    move-object/from16 v3, v16

    .line 206
    .line 207
    goto :goto_6

    .line 208
    :goto_7
    array-length v5, v4

    .line 209
    if-nez v5, :cond_9

    .line 210
    .line 211
    move v5, v14

    .line 212
    goto :goto_8

    .line 213
    :cond_9
    move v5, v13

    .line 214
    :goto_8
    if-nez v5, :cond_a

    .line 215
    .line 216
    sget-object v23, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$createGrid$2;->INSTANCE:Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$createGrid$2;

    .line 217
    .line 218
    const/16 v24, 0x1e

    .line 219
    .line 220
    const/16 v25, 0x0

    .line 221
    .line 222
    const-string v18, ","

    .line 223
    .line 224
    const/16 v19, 0x0

    .line 225
    .line 226
    const/16 v20, 0x0

    .line 227
    .line 228
    const/16 v21, 0x0

    .line 229
    .line 230
    const/16 v22, 0x0

    .line 231
    .line 232
    move-object/from16 v17, v4

    .line 233
    .line 234
    invoke-static/range {v17 .. v25}, Lkotlin/collections/ArraysKt;->joinToString$default([Ljava/lang/Object;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v4

    .line 238
    :goto_9
    move-object/from16 v5, p10

    .line 239
    .line 240
    goto :goto_a

    .line 241
    :cond_a
    move-object/from16 v4, v16

    .line 242
    .line 243
    goto :goto_9

    .line 244
    :goto_a
    array-length v6, v5

    .line 245
    if-nez v6, :cond_b

    .line 246
    .line 247
    move v13, v14

    .line 248
    :cond_b
    if-nez v13, :cond_c

    .line 249
    .line 250
    sget-object v23, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$createGrid$3;->INSTANCE:Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$createGrid$3;

    .line 251
    .line 252
    const/16 v24, 0x1e

    .line 253
    .line 254
    const/16 v25, 0x0

    .line 255
    .line 256
    const-string v18, ","

    .line 257
    .line 258
    const/16 v19, 0x0

    .line 259
    .line 260
    const/16 v20, 0x0

    .line 261
    .line 262
    const/16 v21, 0x0

    .line 263
    .line 264
    const/16 v22, 0x0

    .line 265
    .line 266
    move-object/from16 v17, v5

    .line 267
    .line 268
    invoke-static/range {v17 .. v25}, Lkotlin/collections/ArraysKt;->joinToString$default([Ljava/lang/Object;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v16

    .line 272
    :cond_c
    move-object/from16 v6, p0

    .line 273
    .line 274
    move-object/from16 v5, v16

    .line 275
    .line 276
    invoke-virtual {v6, v15}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->asCLContainer$constraintlayout_compose_release(Landroidx/constraintlayout/compose/LayoutReference;)Landroidx/constraintlayout/core/parser/CLObject;

    .line 277
    .line 278
    .line 279
    move-result-object v7

    .line 280
    const-string v8, "contains"

    .line 281
    .line 282
    invoke-virtual {v7, v8, v0}, Landroidx/constraintlayout/core/parser/CLContainer;->put(Ljava/lang/String;Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 283
    .line 284
    .line 285
    const-string v0, "type"

    .line 286
    .line 287
    const-string v8, "grid"

    .line 288
    .line 289
    invoke-virtual {v7, v0, v8}, Landroidx/constraintlayout/core/parser/CLContainer;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    if-eqz p4, :cond_d

    .line 293
    .line 294
    const/4 v0, 0x0

    .line 295
    goto :goto_b

    .line 296
    :cond_d
    const/high16 v0, 0x3f800000    # 1.0f

    .line 297
    .line 298
    :goto_b
    const-string v8, "orientation"

    .line 299
    .line 300
    invoke-virtual {v7, v8, v0}, Landroidx/constraintlayout/core/parser/CLContainer;->putNumber(Ljava/lang/String;F)V

    .line 301
    .line 302
    .line 303
    const-string v0, "rows"

    .line 304
    .line 305
    int-to-float v1, v1

    .line 306
    invoke-virtual {v7, v0, v1}, Landroidx/constraintlayout/core/parser/CLContainer;->putNumber(Ljava/lang/String;F)V

    .line 307
    .line 308
    .line 309
    const-string v0, "columns"

    .line 310
    .line 311
    int-to-float v1, v2

    .line 312
    invoke-virtual {v7, v0, v1}, Landroidx/constraintlayout/core/parser/CLContainer;->putNumber(Ljava/lang/String;F)V

    .line 313
    .line 314
    .line 315
    const-string v0, "vGap"

    .line 316
    .line 317
    move/from16 v1, p5

    .line 318
    .line 319
    invoke-virtual {v7, v0, v1}, Landroidx/constraintlayout/core/parser/CLContainer;->putNumber(Ljava/lang/String;F)V

    .line 320
    .line 321
    .line 322
    const-string v0, "hGap"

    .line 323
    .line 324
    move/from16 v1, p6

    .line 325
    .line 326
    invoke-virtual {v7, v0, v1}, Landroidx/constraintlayout/core/parser/CLContainer;->putNumber(Ljava/lang/String;F)V

    .line 327
    .line 328
    .line 329
    const-string v0, "rowWeights"

    .line 330
    .line 331
    invoke-virtual {v7, v0, v12}, Landroidx/constraintlayout/core/parser/CLContainer;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    const-string v0, "columnWeights"

    .line 335
    .line 336
    invoke-virtual {v7, v0, v3}, Landroidx/constraintlayout/core/parser/CLContainer;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 337
    .line 338
    .line 339
    const-string v0, "skips"

    .line 340
    .line 341
    invoke-virtual {v7, v0, v4}, Landroidx/constraintlayout/core/parser/CLContainer;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 342
    .line 343
    .line 344
    const-string v0, "spans"

    .line 345
    .line 346
    invoke-virtual {v7, v0, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 347
    .line 348
    .line 349
    const-string v0, "flags"

    .line 350
    .line 351
    move/from16 v1, p11

    .line 352
    .line 353
    int-to-float v1, v1

    .line 354
    invoke-virtual {v7, v0, v1}, Landroidx/constraintlayout/core/parser/CLContainer;->putNumber(Ljava/lang/String;F)V

    .line 355
    .line 356
    .line 357
    return-object v15
.end method

.method public final createGuidelineFromAbsoluteLeft(F)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;
    .locals 4

    .line 1
    new-instance v0, Landroidx/constraintlayout/compose/LayoutReferenceImpl;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->createHelperId()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/LayoutReferenceImpl;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->asCLContainer$constraintlayout_compose_release(Landroidx/constraintlayout/compose/LayoutReference;)Landroidx/constraintlayout/core/parser/CLObject;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v2, "type"

    .line 19
    .line 20
    const-string v3, "vGuideline"

    .line 21
    .line 22
    invoke-virtual {v1, v2, v3}, Landroidx/constraintlayout/core/parser/CLContainer;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const-string v2, "percent"

    .line 26
    .line 27
    invoke-virtual {v1, v2, p1}, Landroidx/constraintlayout/core/parser/CLContainer;->putNumber(Ljava/lang/String;F)V

    .line 28
    .line 29
    .line 30
    const/4 v1, 0x4

    .line 31
    invoke-direct {p0, v1}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->updateHelpersHashCode(I)V

    .line 32
    .line 33
    .line 34
    invoke-static {p1}, Ljava/lang/Float;->hashCode(F)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-direct {p0, p1}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->updateHelpersHashCode(I)V

    .line 39
    .line 40
    .line 41
    new-instance p1, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;

    .line 42
    .line 43
    invoke-virtual {v0}, Landroidx/constraintlayout/compose/LayoutReference;->getId$constraintlayout_compose_release()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const/4 v2, 0x0

    .line 48
    invoke-direct {p1, v1, v2, v0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;-><init>(Ljava/lang/Object;ILandroidx/constraintlayout/compose/LayoutReference;)V

    .line 49
    .line 50
    .line 51
    return-object p1
.end method

.method public final createGuidelineFromAbsoluteLeft-0680j_4(F)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;
    .locals 4

    .line 1
    new-instance v0, Landroidx/constraintlayout/compose/LayoutReferenceImpl;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->createHelperId()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/LayoutReferenceImpl;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->asCLContainer$constraintlayout_compose_release(Landroidx/constraintlayout/compose/LayoutReference;)Landroidx/constraintlayout/core/parser/CLObject;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v2, "type"

    .line 19
    .line 20
    const-string v3, "vGuideline"

    .line 21
    .line 22
    invoke-virtual {v1, v2, v3}, Landroidx/constraintlayout/core/parser/CLContainer;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const-string v2, "left"

    .line 26
    .line 27
    invoke-virtual {v1, v2, p1}, Landroidx/constraintlayout/core/parser/CLContainer;->putNumber(Ljava/lang/String;F)V

    .line 28
    .line 29
    .line 30
    const/4 v1, 0x2

    .line 31
    invoke-direct {p0, v1}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->updateHelpersHashCode(I)V

    .line 32
    .line 33
    .line 34
    invoke-static {p1}, Landroidx/compose/ui/unit/Dp;->hashCode-impl(F)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-direct {p0, p1}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->updateHelpersHashCode(I)V

    .line 39
    .line 40
    .line 41
    new-instance p1, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;

    .line 42
    .line 43
    invoke-virtual {v0}, Landroidx/constraintlayout/compose/LayoutReference;->getId$constraintlayout_compose_release()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const/4 v2, 0x0

    .line 48
    invoke-direct {p1, v1, v2, v0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;-><init>(Ljava/lang/Object;ILandroidx/constraintlayout/compose/LayoutReference;)V

    .line 49
    .line 50
    .line 51
    return-object p1
.end method

.method public final createGuidelineFromAbsoluteRight(F)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;
    .locals 1

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    sub-float/2addr v0, p1

    .line 4
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->createGuidelineFromAbsoluteLeft(F)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    return-object p1
.end method

.method public final createGuidelineFromAbsoluteRight-0680j_4(F)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;
    .locals 4

    .line 1
    new-instance v0, Landroidx/constraintlayout/compose/LayoutReferenceImpl;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->createHelperId()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/LayoutReferenceImpl;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->asCLContainer$constraintlayout_compose_release(Landroidx/constraintlayout/compose/LayoutReference;)Landroidx/constraintlayout/core/parser/CLObject;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v2, "type"

    .line 19
    .line 20
    const-string v3, "vGuideline"

    .line 21
    .line 22
    invoke-virtual {v1, v2, v3}, Landroidx/constraintlayout/core/parser/CLContainer;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const-string v2, "right"

    .line 26
    .line 27
    invoke-virtual {v1, v2, p1}, Landroidx/constraintlayout/core/parser/CLContainer;->putNumber(Ljava/lang/String;F)V

    .line 28
    .line 29
    .line 30
    const/4 v1, 0x6

    .line 31
    invoke-direct {p0, v1}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->updateHelpersHashCode(I)V

    .line 32
    .line 33
    .line 34
    invoke-static {p1}, Landroidx/compose/ui/unit/Dp;->hashCode-impl(F)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-direct {p0, p1}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->updateHelpersHashCode(I)V

    .line 39
    .line 40
    .line 41
    new-instance p1, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;

    .line 42
    .line 43
    invoke-virtual {v0}, Landroidx/constraintlayout/compose/LayoutReference;->getId$constraintlayout_compose_release()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const/4 v2, 0x0

    .line 48
    invoke-direct {p1, v1, v2, v0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;-><init>(Ljava/lang/Object;ILandroidx/constraintlayout/compose/LayoutReference;)V

    .line 49
    .line 50
    .line 51
    return-object p1
.end method

.method public final createGuidelineFromBottom(F)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;
    .locals 1

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    sub-float/2addr v0, p1

    .line 4
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->createGuidelineFromTop(F)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    return-object p1
.end method

.method public final createGuidelineFromBottom-0680j_4(F)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;
    .locals 4

    .line 1
    new-instance v0, Landroidx/constraintlayout/compose/LayoutReferenceImpl;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->createHelperId()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/LayoutReferenceImpl;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->asCLContainer$constraintlayout_compose_release(Landroidx/constraintlayout/compose/LayoutReference;)Landroidx/constraintlayout/core/parser/CLObject;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v2, "type"

    .line 19
    .line 20
    const-string v3, "hGuideline"

    .line 21
    .line 22
    invoke-virtual {v1, v2, v3}, Landroidx/constraintlayout/core/parser/CLContainer;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const-string v2, "end"

    .line 26
    .line 27
    invoke-virtual {v1, v2, p1}, Landroidx/constraintlayout/core/parser/CLContainer;->putNumber(Ljava/lang/String;F)V

    .line 28
    .line 29
    .line 30
    const/16 v1, 0x9

    .line 31
    .line 32
    invoke-direct {p0, v1}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->updateHelpersHashCode(I)V

    .line 33
    .line 34
    .line 35
    invoke-static {p1}, Landroidx/compose/ui/unit/Dp;->hashCode-impl(F)I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    invoke-direct {p0, p1}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->updateHelpersHashCode(I)V

    .line 40
    .line 41
    .line 42
    new-instance p1, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;

    .line 43
    .line 44
    invoke-virtual {v0}, Landroidx/constraintlayout/compose/LayoutReference;->getId$constraintlayout_compose_release()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    const/4 v2, 0x0

    .line 49
    invoke-direct {p1, v1, v2, v0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;-><init>(Ljava/lang/Object;ILandroidx/constraintlayout/compose/LayoutReference;)V

    .line 50
    .line 51
    .line 52
    return-object p1
.end method

.method public final createGuidelineFromEnd(F)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;
    .locals 6

    .line 1
    new-instance v0, Landroidx/constraintlayout/compose/LayoutReferenceImpl;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->createHelperId()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/LayoutReferenceImpl;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Landroidx/constraintlayout/core/parser/CLArray;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    new-array v3, v2, [C

    .line 18
    .line 19
    invoke-direct {v1, v3}, Landroidx/constraintlayout/core/parser/CLArray;-><init>([C)V

    .line 20
    .line 21
    .line 22
    const-string v3, "end"

    .line 23
    .line 24
    invoke-static {v3}, Landroidx/constraintlayout/core/parser/CLString;->from(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLString;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v1, v3}, Landroidx/constraintlayout/core/parser/CLContainer;->add(Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 29
    .line 30
    .line 31
    new-instance v3, Landroidx/constraintlayout/core/parser/CLNumber;

    .line 32
    .line 33
    invoke-direct {v3, p1}, Landroidx/constraintlayout/core/parser/CLNumber;-><init>(F)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v3}, Landroidx/constraintlayout/core/parser/CLContainer;->add(Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->asCLContainer$constraintlayout_compose_release(Landroidx/constraintlayout/compose/LayoutReference;)Landroidx/constraintlayout/core/parser/CLObject;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    const-string v4, "type"

    .line 44
    .line 45
    const-string v5, "vGuideline"

    .line 46
    .line 47
    invoke-virtual {v3, v4, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const-string v4, "percent"

    .line 51
    .line 52
    invoke-virtual {v3, v4, v1}, Landroidx/constraintlayout/core/parser/CLContainer;->put(Ljava/lang/String;Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 53
    .line 54
    .line 55
    const/4 v1, 0x3

    .line 56
    invoke-direct {p0, v1}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->updateHelpersHashCode(I)V

    .line 57
    .line 58
    .line 59
    invoke-static {p1}, Ljava/lang/Float;->hashCode(F)I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    invoke-direct {p0, p1}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->updateHelpersHashCode(I)V

    .line 64
    .line 65
    .line 66
    new-instance p1, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;

    .line 67
    .line 68
    invoke-virtual {v0}, Landroidx/constraintlayout/compose/LayoutReference;->getId$constraintlayout_compose_release()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-direct {p1, v1, v2, v0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;-><init>(Ljava/lang/Object;ILandroidx/constraintlayout/compose/LayoutReference;)V

    .line 73
    .line 74
    .line 75
    return-object p1
.end method

.method public final createGuidelineFromEnd-0680j_4(F)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;
    .locals 4

    .line 1
    new-instance v0, Landroidx/constraintlayout/compose/LayoutReferenceImpl;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->createHelperId()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/LayoutReferenceImpl;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->asCLContainer$constraintlayout_compose_release(Landroidx/constraintlayout/compose/LayoutReference;)Landroidx/constraintlayout/core/parser/CLObject;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v2, "type"

    .line 19
    .line 20
    const-string v3, "vGuideline"

    .line 21
    .line 22
    invoke-virtual {v1, v2, v3}, Landroidx/constraintlayout/core/parser/CLContainer;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const-string v2, "end"

    .line 26
    .line 27
    invoke-virtual {v1, v2, p1}, Landroidx/constraintlayout/core/parser/CLContainer;->putNumber(Ljava/lang/String;F)V

    .line 28
    .line 29
    .line 30
    const/4 v1, 0x5

    .line 31
    invoke-direct {p0, v1}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->updateHelpersHashCode(I)V

    .line 32
    .line 33
    .line 34
    invoke-static {p1}, Landroidx/compose/ui/unit/Dp;->hashCode-impl(F)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-direct {p0, p1}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->updateHelpersHashCode(I)V

    .line 39
    .line 40
    .line 41
    new-instance p1, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;

    .line 42
    .line 43
    invoke-virtual {v0}, Landroidx/constraintlayout/compose/LayoutReference;->getId$constraintlayout_compose_release()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const/4 v2, 0x0

    .line 48
    invoke-direct {p1, v1, v2, v0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;-><init>(Ljava/lang/Object;ILandroidx/constraintlayout/compose/LayoutReference;)V

    .line 49
    .line 50
    .line 51
    return-object p1
.end method

.method public final createGuidelineFromStart(F)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;
    .locals 6

    .line 1
    new-instance v0, Landroidx/constraintlayout/compose/LayoutReferenceImpl;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->createHelperId()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/LayoutReferenceImpl;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Landroidx/constraintlayout/core/parser/CLArray;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    new-array v3, v2, [C

    .line 18
    .line 19
    invoke-direct {v1, v3}, Landroidx/constraintlayout/core/parser/CLArray;-><init>([C)V

    .line 20
    .line 21
    .line 22
    const-string v3, "start"

    .line 23
    .line 24
    invoke-static {v3}, Landroidx/constraintlayout/core/parser/CLString;->from(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLString;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v1, v3}, Landroidx/constraintlayout/core/parser/CLContainer;->add(Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 29
    .line 30
    .line 31
    new-instance v3, Landroidx/constraintlayout/core/parser/CLNumber;

    .line 32
    .line 33
    invoke-direct {v3, p1}, Landroidx/constraintlayout/core/parser/CLNumber;-><init>(F)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v3}, Landroidx/constraintlayout/core/parser/CLContainer;->add(Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->asCLContainer$constraintlayout_compose_release(Landroidx/constraintlayout/compose/LayoutReference;)Landroidx/constraintlayout/core/parser/CLObject;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    const-string v4, "type"

    .line 44
    .line 45
    const-string v5, "vGuideline"

    .line 46
    .line 47
    invoke-virtual {v3, v4, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const-string v4, "percent"

    .line 51
    .line 52
    invoke-virtual {v3, v4, v1}, Landroidx/constraintlayout/core/parser/CLContainer;->put(Ljava/lang/String;Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 53
    .line 54
    .line 55
    const/4 v1, 0x3

    .line 56
    invoke-direct {p0, v1}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->updateHelpersHashCode(I)V

    .line 57
    .line 58
    .line 59
    invoke-static {p1}, Ljava/lang/Float;->hashCode(F)I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    invoke-direct {p0, p1}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->updateHelpersHashCode(I)V

    .line 64
    .line 65
    .line 66
    new-instance p1, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;

    .line 67
    .line 68
    invoke-virtual {v0}, Landroidx/constraintlayout/compose/LayoutReference;->getId$constraintlayout_compose_release()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-direct {p1, v1, v2, v0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;-><init>(Ljava/lang/Object;ILandroidx/constraintlayout/compose/LayoutReference;)V

    .line 73
    .line 74
    .line 75
    return-object p1
.end method

.method public final createGuidelineFromStart-0680j_4(F)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;
    .locals 4

    .line 1
    new-instance v0, Landroidx/constraintlayout/compose/LayoutReferenceImpl;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->createHelperId()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/LayoutReferenceImpl;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->asCLContainer$constraintlayout_compose_release(Landroidx/constraintlayout/compose/LayoutReference;)Landroidx/constraintlayout/core/parser/CLObject;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v2, "type"

    .line 19
    .line 20
    const-string v3, "vGuideline"

    .line 21
    .line 22
    invoke-virtual {v1, v2, v3}, Landroidx/constraintlayout/core/parser/CLContainer;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const-string v2, "start"

    .line 26
    .line 27
    invoke-virtual {v1, v2, p1}, Landroidx/constraintlayout/core/parser/CLContainer;->putNumber(Ljava/lang/String;F)V

    .line 28
    .line 29
    .line 30
    const/4 v1, 0x1

    .line 31
    invoke-direct {p0, v1}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->updateHelpersHashCode(I)V

    .line 32
    .line 33
    .line 34
    invoke-static {p1}, Landroidx/compose/ui/unit/Dp;->hashCode-impl(F)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-direct {p0, p1}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->updateHelpersHashCode(I)V

    .line 39
    .line 40
    .line 41
    new-instance p1, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;

    .line 42
    .line 43
    invoke-virtual {v0}, Landroidx/constraintlayout/compose/LayoutReference;->getId$constraintlayout_compose_release()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const/4 v2, 0x0

    .line 48
    invoke-direct {p1, v1, v2, v0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;-><init>(Ljava/lang/Object;ILandroidx/constraintlayout/compose/LayoutReference;)V

    .line 49
    .line 50
    .line 51
    return-object p1
.end method

.method public final createGuidelineFromTop(F)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;
    .locals 4

    .line 1
    new-instance v0, Landroidx/constraintlayout/compose/LayoutReferenceImpl;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->createHelperId()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/LayoutReferenceImpl;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->asCLContainer$constraintlayout_compose_release(Landroidx/constraintlayout/compose/LayoutReference;)Landroidx/constraintlayout/core/parser/CLObject;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v2, "type"

    .line 19
    .line 20
    const-string v3, "hGuideline"

    .line 21
    .line 22
    invoke-virtual {v1, v2, v3}, Landroidx/constraintlayout/core/parser/CLContainer;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const-string v2, "percent"

    .line 26
    .line 27
    invoke-virtual {v1, v2, p1}, Landroidx/constraintlayout/core/parser/CLContainer;->putNumber(Ljava/lang/String;F)V

    .line 28
    .line 29
    .line 30
    const/16 v1, 0x8

    .line 31
    .line 32
    invoke-direct {p0, v1}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->updateHelpersHashCode(I)V

    .line 33
    .line 34
    .line 35
    invoke-static {p1}, Ljava/lang/Float;->hashCode(F)I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    invoke-direct {p0, p1}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->updateHelpersHashCode(I)V

    .line 40
    .line 41
    .line 42
    new-instance p1, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;

    .line 43
    .line 44
    invoke-virtual {v0}, Landroidx/constraintlayout/compose/LayoutReference;->getId$constraintlayout_compose_release()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    const/4 v2, 0x0

    .line 49
    invoke-direct {p1, v1, v2, v0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;-><init>(Ljava/lang/Object;ILandroidx/constraintlayout/compose/LayoutReference;)V

    .line 50
    .line 51
    .line 52
    return-object p1
.end method

.method public final createGuidelineFromTop-0680j_4(F)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;
    .locals 4

    .line 1
    new-instance v0, Landroidx/constraintlayout/compose/LayoutReferenceImpl;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->createHelperId()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/LayoutReferenceImpl;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->asCLContainer$constraintlayout_compose_release(Landroidx/constraintlayout/compose/LayoutReference;)Landroidx/constraintlayout/core/parser/CLObject;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v2, "type"

    .line 19
    .line 20
    const-string v3, "hGuideline"

    .line 21
    .line 22
    invoke-virtual {v1, v2, v3}, Landroidx/constraintlayout/core/parser/CLContainer;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const-string v2, "start"

    .line 26
    .line 27
    invoke-virtual {v1, v2, p1}, Landroidx/constraintlayout/core/parser/CLContainer;->putNumber(Ljava/lang/String;F)V

    .line 28
    .line 29
    .line 30
    const/4 v1, 0x7

    .line 31
    invoke-direct {p0, v1}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->updateHelpersHashCode(I)V

    .line 32
    .line 33
    .line 34
    invoke-static {p1}, Landroidx/compose/ui/unit/Dp;->hashCode-impl(F)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-direct {p0, p1}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->updateHelpersHashCode(I)V

    .line 39
    .line 40
    .line 41
    new-instance p1, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;

    .line 42
    .line 43
    invoke-virtual {v0}, Landroidx/constraintlayout/compose/LayoutReference;->getId$constraintlayout_compose_release()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const/4 v2, 0x0

    .line 48
    invoke-direct {p1, v1, v2, v0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;-><init>(Ljava/lang/Object;ILandroidx/constraintlayout/compose/LayoutReference;)V

    .line 49
    .line 50
    .line 51
    return-object p1
.end method

.method public final createHorizontalChain([Landroidx/constraintlayout/compose/LayoutReference;Landroidx/constraintlayout/compose/ChainStyle;)Landroidx/constraintlayout/compose/HorizontalChainReference;
    .locals 9

    .line 1
    new-instance v0, Landroidx/constraintlayout/compose/HorizontalChainReference;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->createHelperId()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/HorizontalChainReference;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Landroidx/constraintlayout/core/parser/CLArray;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    new-array v3, v2, [C

    .line 18
    .line 19
    invoke-direct {v1, v3}, Landroidx/constraintlayout/core/parser/CLArray;-><init>([C)V

    .line 20
    .line 21
    .line 22
    array-length v3, p1

    .line 23
    move v4, v2

    .line 24
    :goto_0
    if-ge v4, v3, :cond_2

    .line 25
    .line 26
    aget-object v5, p1, v4

    .line 27
    .line 28
    invoke-static {v5}, Landroidx/constraintlayout/compose/LayoutReference;->access$getHelperParamsMap$p(Landroidx/constraintlayout/compose/LayoutReference;)Ljava/util/Map;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    const-class v7, Landroidx/constraintlayout/compose/ChainParams;

    .line 33
    .line 34
    invoke-static {v7}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    invoke-interface {v7}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    instance-of v7, v6, Landroidx/constraintlayout/compose/ChainParams;

    .line 47
    .line 48
    if-nez v7, :cond_0

    .line 49
    .line 50
    const/4 v6, 0x0

    .line 51
    :cond_0
    check-cast v6, Landroidx/constraintlayout/compose/ChainParams;

    .line 52
    .line 53
    if-eqz v6, :cond_1

    .line 54
    .line 55
    new-instance v7, Landroidx/constraintlayout/core/parser/CLArray;

    .line 56
    .line 57
    new-array v8, v2, [C

    .line 58
    .line 59
    invoke-direct {v7, v8}, Landroidx/constraintlayout/core/parser/CLArray;-><init>([C)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v5}, Landroidx/constraintlayout/compose/LayoutReference;->getId$constraintlayout_compose_release()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    invoke-static {v5}, Landroidx/constraintlayout/core/parser/CLString;->from(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLString;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    invoke-virtual {v7, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->add(Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 75
    .line 76
    .line 77
    new-instance v5, Landroidx/constraintlayout/core/parser/CLNumber;

    .line 78
    .line 79
    invoke-virtual {v6}, Landroidx/constraintlayout/compose/ChainParams;->getWeight()F

    .line 80
    .line 81
    .line 82
    move-result v8

    .line 83
    invoke-direct {v5, v8}, Landroidx/constraintlayout/core/parser/CLNumber;-><init>(F)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v7, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->add(Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 87
    .line 88
    .line 89
    new-instance v5, Landroidx/constraintlayout/core/parser/CLNumber;

    .line 90
    .line 91
    invoke-virtual {v6}, Landroidx/constraintlayout/compose/ChainParams;->getStartMargin-D9Ej5fM()F

    .line 92
    .line 93
    .line 94
    move-result v8

    .line 95
    invoke-direct {v5, v8}, Landroidx/constraintlayout/core/parser/CLNumber;-><init>(F)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v7, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->add(Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 99
    .line 100
    .line 101
    new-instance v5, Landroidx/constraintlayout/core/parser/CLNumber;

    .line 102
    .line 103
    invoke-virtual {v6}, Landroidx/constraintlayout/compose/ChainParams;->getEndMargin-D9Ej5fM()F

    .line 104
    .line 105
    .line 106
    move-result v8

    .line 107
    invoke-direct {v5, v8}, Landroidx/constraintlayout/core/parser/CLNumber;-><init>(F)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v7, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->add(Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 111
    .line 112
    .line 113
    new-instance v5, Landroidx/constraintlayout/core/parser/CLNumber;

    .line 114
    .line 115
    invoke-virtual {v6}, Landroidx/constraintlayout/compose/ChainParams;->getStartGoneMargin-D9Ej5fM()F

    .line 116
    .line 117
    .line 118
    move-result v8

    .line 119
    invoke-direct {v5, v8}, Landroidx/constraintlayout/core/parser/CLNumber;-><init>(F)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v7, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->add(Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 123
    .line 124
    .line 125
    new-instance v5, Landroidx/constraintlayout/core/parser/CLNumber;

    .line 126
    .line 127
    invoke-virtual {v6}, Landroidx/constraintlayout/compose/ChainParams;->getEndGoneMargin-D9Ej5fM()F

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    invoke-direct {v5, v6}, Landroidx/constraintlayout/core/parser/CLNumber;-><init>(F)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v7, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->add(Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 135
    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_1
    invoke-virtual {v5}, Landroidx/constraintlayout/compose/LayoutReference;->getId$constraintlayout_compose_release()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    invoke-static {v5}, Landroidx/constraintlayout/core/parser/CLString;->from(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLString;

    .line 147
    .line 148
    .line 149
    move-result-object v7

    .line 150
    :goto_1
    invoke-virtual {v1, v7}, Landroidx/constraintlayout/core/parser/CLContainer;->add(Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 151
    .line 152
    .line 153
    add-int/lit8 v4, v4, 0x1

    .line 154
    .line 155
    goto/16 :goto_0

    .line 156
    .line 157
    :cond_2
    new-instance v3, Landroidx/constraintlayout/core/parser/CLArray;

    .line 158
    .line 159
    new-array v4, v2, [C

    .line 160
    .line 161
    invoke-direct {v3, v4}, Landroidx/constraintlayout/core/parser/CLArray;-><init>([C)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p2}, Landroidx/constraintlayout/compose/ChainStyle;->getName$constraintlayout_compose_release()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    invoke-static {v4}, Landroidx/constraintlayout/core/parser/CLString;->from(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLString;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    invoke-virtual {v3, v4}, Landroidx/constraintlayout/core/parser/CLContainer;->add(Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 173
    .line 174
    .line 175
    new-instance v4, Landroidx/constraintlayout/core/parser/CLNumber;

    .line 176
    .line 177
    invoke-virtual {p2}, Landroidx/constraintlayout/compose/ChainStyle;->getBias$constraintlayout_compose_release()Ljava/lang/Float;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    if-eqz v5, :cond_3

    .line 182
    .line 183
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    .line 184
    .line 185
    .line 186
    move-result v5

    .line 187
    goto :goto_2

    .line 188
    :cond_3
    const/high16 v5, 0x3f000000    # 0.5f

    .line 189
    .line 190
    :goto_2
    invoke-direct {v4, v5}, Landroidx/constraintlayout/core/parser/CLNumber;-><init>(F)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v3, v4}, Landroidx/constraintlayout/core/parser/CLContainer;->add(Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->asCLContainer$constraintlayout_compose_release(Landroidx/constraintlayout/compose/LayoutReference;)Landroidx/constraintlayout/core/parser/CLObject;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    const-string v5, "type"

    .line 201
    .line 202
    const-string v6, "hChain"

    .line 203
    .line 204
    invoke-virtual {v4, v5, v6}, Landroidx/constraintlayout/core/parser/CLContainer;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    const-string v5, "contains"

    .line 208
    .line 209
    invoke-virtual {v4, v5, v1}, Landroidx/constraintlayout/core/parser/CLContainer;->put(Ljava/lang/String;Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 210
    .line 211
    .line 212
    const-string v1, "style"

    .line 213
    .line 214
    invoke-virtual {v4, v1, v3}, Landroidx/constraintlayout/core/parser/CLContainer;->put(Ljava/lang/String;Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 215
    .line 216
    .line 217
    const/16 v1, 0x10

    .line 218
    .line 219
    invoke-direct {p0, v1}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->updateHelpersHashCode(I)V

    .line 220
    .line 221
    .line 222
    array-length v1, p1

    .line 223
    :goto_3
    if-ge v2, v1, :cond_4

    .line 224
    .line 225
    aget-object v3, p1, v2

    .line 226
    .line 227
    invoke-virtual {v3}, Landroidx/constraintlayout/compose/LayoutReference;->hashCode()I

    .line 228
    .line 229
    .line 230
    move-result v3

    .line 231
    invoke-direct {p0, v3}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->updateHelpersHashCode(I)V

    .line 232
    .line 233
    .line 234
    add-int/lit8 v2, v2, 0x1

    .line 235
    .line 236
    goto :goto_3

    .line 237
    :cond_4
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    .line 238
    .line 239
    .line 240
    move-result p1

    .line 241
    invoke-direct {p0, p1}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->updateHelpersHashCode(I)V

    .line 242
    .line 243
    .line 244
    return-object v0
.end method

.method public final createRow-lG28NQ4([Landroidx/constraintlayout/compose/LayoutReference;F[F)Landroidx/constraintlayout/compose/ConstrainedLayoutReference;
    .locals 14
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "Range"
        }
    .end annotation

    .line 1
    move-object/from16 v8, p3

    .line 2
    .line 3
    array-length v0, v8

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    if-nez v0, :cond_2

    .line 10
    .line 11
    array-length v0, p1

    .line 12
    array-length v1, v8

    .line 13
    if-ne v0, v1, :cond_1

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    new-instance v1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v2, "Number of weights ("

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    array-length v2, v8

    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v2, ") should match number of elements ("

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    array-length p1, p1

    .line 38
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string p1, ")."

    .line 42
    .line 43
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw v0

    .line 54
    :cond_2
    :goto_1
    array-length v0, p1

    .line 55
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    move-object v1, p1

    .line 60
    check-cast v1, [Landroidx/constraintlayout/compose/LayoutReference;

    .line 61
    .line 62
    const/16 v12, 0x758

    .line 63
    .line 64
    const/4 v13, 0x0

    .line 65
    const/4 v2, 0x1

    .line 66
    const/4 v3, 0x0

    .line 67
    const/4 v4, 0x0

    .line 68
    const/4 v5, 0x0

    .line 69
    const/4 v7, 0x0

    .line 70
    const/4 v9, 0x0

    .line 71
    const/4 v10, 0x0

    .line 72
    const/4 v11, 0x0

    .line 73
    move-object v0, p0

    .line 74
    move/from16 v6, p2

    .line 75
    .line 76
    invoke-static/range {v0 .. v13}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->createGrid-Hu23Yyw$default(Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;[Landroidx/constraintlayout/compose/LayoutReference;IIZFF[F[F[Landroidx/constraintlayout/compose/Skip;[Landroidx/constraintlayout/compose/Span;IILjava/lang/Object;)Landroidx/constraintlayout/compose/ConstrainedLayoutReference;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    return-object p1
.end method

.method public final createStartBarrier-3ABfNKs([Landroidx/constraintlayout/compose/LayoutReference;F)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;
    .locals 6

    .line 1
    new-instance v0, Landroidx/constraintlayout/compose/LayoutReferenceImpl;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->createHelperId()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/LayoutReferenceImpl;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Landroidx/constraintlayout/core/parser/CLArray;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    new-array v3, v2, [C

    .line 18
    .line 19
    invoke-direct {v1, v3}, Landroidx/constraintlayout/core/parser/CLArray;-><init>([C)V

    .line 20
    .line 21
    .line 22
    array-length v3, p1

    .line 23
    move v4, v2

    .line 24
    :goto_0
    if-ge v4, v3, :cond_0

    .line 25
    .line 26
    aget-object v5, p1, v4

    .line 27
    .line 28
    invoke-virtual {v5}, Landroidx/constraintlayout/compose/LayoutReference;->getId$constraintlayout_compose_release()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-static {v5}, Landroidx/constraintlayout/core/parser/CLString;->from(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLString;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-virtual {v1, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->add(Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 41
    .line 42
    .line 43
    add-int/lit8 v4, v4, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->asCLContainer$constraintlayout_compose_release(Landroidx/constraintlayout/compose/LayoutReference;)Landroidx/constraintlayout/core/parser/CLObject;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    const-string v4, "type"

    .line 51
    .line 52
    const-string v5, "barrier"

    .line 53
    .line 54
    invoke-virtual {v3, v4, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const-string v4, "direction"

    .line 58
    .line 59
    const-string v5, "start"

    .line 60
    .line 61
    invoke-virtual {v3, v4, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const-string v4, "margin"

    .line 65
    .line 66
    invoke-virtual {v3, v4, p2}, Landroidx/constraintlayout/core/parser/CLContainer;->putNumber(Ljava/lang/String;F)V

    .line 67
    .line 68
    .line 69
    const-string v4, "contains"

    .line 70
    .line 71
    invoke-virtual {v3, v4, v1}, Landroidx/constraintlayout/core/parser/CLContainer;->put(Ljava/lang/String;Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 72
    .line 73
    .line 74
    const/16 v1, 0xa

    .line 75
    .line 76
    invoke-direct {p0, v1}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->updateHelpersHashCode(I)V

    .line 77
    .line 78
    .line 79
    array-length v1, p1

    .line 80
    move v3, v2

    .line 81
    :goto_1
    if-ge v3, v1, :cond_1

    .line 82
    .line 83
    aget-object v4, p1, v3

    .line 84
    .line 85
    invoke-virtual {v4}, Landroidx/constraintlayout/compose/LayoutReference;->hashCode()I

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    invoke-direct {p0, v4}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->updateHelpersHashCode(I)V

    .line 90
    .line 91
    .line 92
    add-int/lit8 v3, v3, 0x1

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_1
    invoke-static {p2}, Landroidx/compose/ui/unit/Dp;->hashCode-impl(F)I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    invoke-direct {p0, p1}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->updateHelpersHashCode(I)V

    .line 100
    .line 101
    .line 102
    new-instance p1, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;

    .line 103
    .line 104
    invoke-virtual {v0}, Landroidx/constraintlayout/compose/LayoutReference;->getId$constraintlayout_compose_release()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    invoke-direct {p1, p2, v2, v0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$VerticalAnchor;-><init>(Ljava/lang/Object;ILandroidx/constraintlayout/compose/LayoutReference;)V

    .line 109
    .line 110
    .line 111
    return-object p1
.end method

.method public final createTopBarrier-3ABfNKs([Landroidx/constraintlayout/compose/LayoutReference;F)Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;
    .locals 6

    .line 1
    new-instance v0, Landroidx/constraintlayout/compose/LayoutReferenceImpl;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->createHelperId()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/LayoutReferenceImpl;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Landroidx/constraintlayout/core/parser/CLArray;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    new-array v3, v2, [C

    .line 18
    .line 19
    invoke-direct {v1, v3}, Landroidx/constraintlayout/core/parser/CLArray;-><init>([C)V

    .line 20
    .line 21
    .line 22
    array-length v3, p1

    .line 23
    move v4, v2

    .line 24
    :goto_0
    if-ge v4, v3, :cond_0

    .line 25
    .line 26
    aget-object v5, p1, v4

    .line 27
    .line 28
    invoke-virtual {v5}, Landroidx/constraintlayout/compose/LayoutReference;->getId$constraintlayout_compose_release()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-static {v5}, Landroidx/constraintlayout/core/parser/CLString;->from(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLString;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-virtual {v1, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->add(Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 41
    .line 42
    .line 43
    add-int/lit8 v4, v4, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->asCLContainer$constraintlayout_compose_release(Landroidx/constraintlayout/compose/LayoutReference;)Landroidx/constraintlayout/core/parser/CLObject;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    const-string v4, "type"

    .line 51
    .line 52
    const-string v5, "barrier"

    .line 53
    .line 54
    invoke-virtual {v3, v4, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const-string v4, "direction"

    .line 58
    .line 59
    const-string v5, "top"

    .line 60
    .line 61
    invoke-virtual {v3, v4, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const-string v4, "margin"

    .line 65
    .line 66
    invoke-virtual {v3, v4, p2}, Landroidx/constraintlayout/core/parser/CLContainer;->putNumber(Ljava/lang/String;F)V

    .line 67
    .line 68
    .line 69
    const-string v4, "contains"

    .line 70
    .line 71
    invoke-virtual {v3, v4, v1}, Landroidx/constraintlayout/core/parser/CLContainer;->put(Ljava/lang/String;Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 72
    .line 73
    .line 74
    const/16 v1, 0xc

    .line 75
    .line 76
    invoke-direct {p0, v1}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->updateHelpersHashCode(I)V

    .line 77
    .line 78
    .line 79
    array-length v1, p1

    .line 80
    move v3, v2

    .line 81
    :goto_1
    if-ge v3, v1, :cond_1

    .line 82
    .line 83
    aget-object v4, p1, v3

    .line 84
    .line 85
    invoke-virtual {v4}, Landroidx/constraintlayout/compose/LayoutReference;->hashCode()I

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    invoke-direct {p0, v4}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->updateHelpersHashCode(I)V

    .line 90
    .line 91
    .line 92
    add-int/lit8 v3, v3, 0x1

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_1
    invoke-static {p2}, Landroidx/compose/ui/unit/Dp;->hashCode-impl(F)I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    invoke-direct {p0, p1}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->updateHelpersHashCode(I)V

    .line 100
    .line 101
    .line 102
    new-instance p1, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;

    .line 103
    .line 104
    invoke-virtual {v0}, Landroidx/constraintlayout/compose/LayoutReference;->getId$constraintlayout_compose_release()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    invoke-direct {p1, p2, v2, v0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope$HorizontalAnchor;-><init>(Ljava/lang/Object;ILandroidx/constraintlayout/compose/LayoutReference;)V

    .line 109
    .line 110
    .line 111
    return-object p1
.end method

.method public final createVerticalChain([Landroidx/constraintlayout/compose/LayoutReference;Landroidx/constraintlayout/compose/ChainStyle;)Landroidx/constraintlayout/compose/VerticalChainReference;
    .locals 9

    .line 1
    new-instance v0, Landroidx/constraintlayout/compose/VerticalChainReference;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->createHelperId()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Landroidx/constraintlayout/compose/VerticalChainReference;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Landroidx/constraintlayout/core/parser/CLArray;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    new-array v3, v2, [C

    .line 18
    .line 19
    invoke-direct {v1, v3}, Landroidx/constraintlayout/core/parser/CLArray;-><init>([C)V

    .line 20
    .line 21
    .line 22
    array-length v3, p1

    .line 23
    move v4, v2

    .line 24
    :goto_0
    if-ge v4, v3, :cond_2

    .line 25
    .line 26
    aget-object v5, p1, v4

    .line 27
    .line 28
    invoke-static {v5}, Landroidx/constraintlayout/compose/LayoutReference;->access$getHelperParamsMap$p(Landroidx/constraintlayout/compose/LayoutReference;)Ljava/util/Map;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    const-class v7, Landroidx/constraintlayout/compose/ChainParams;

    .line 33
    .line 34
    invoke-static {v7}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    invoke-interface {v7}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    instance-of v7, v6, Landroidx/constraintlayout/compose/ChainParams;

    .line 47
    .line 48
    if-nez v7, :cond_0

    .line 49
    .line 50
    const/4 v6, 0x0

    .line 51
    :cond_0
    check-cast v6, Landroidx/constraintlayout/compose/ChainParams;

    .line 52
    .line 53
    if-eqz v6, :cond_1

    .line 54
    .line 55
    new-instance v7, Landroidx/constraintlayout/core/parser/CLArray;

    .line 56
    .line 57
    new-array v8, v2, [C

    .line 58
    .line 59
    invoke-direct {v7, v8}, Landroidx/constraintlayout/core/parser/CLArray;-><init>([C)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v5}, Landroidx/constraintlayout/compose/LayoutReference;->getId$constraintlayout_compose_release()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    invoke-static {v5}, Landroidx/constraintlayout/core/parser/CLString;->from(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLString;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    invoke-virtual {v7, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->add(Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 75
    .line 76
    .line 77
    new-instance v5, Landroidx/constraintlayout/core/parser/CLNumber;

    .line 78
    .line 79
    invoke-virtual {v6}, Landroidx/constraintlayout/compose/ChainParams;->getWeight()F

    .line 80
    .line 81
    .line 82
    move-result v8

    .line 83
    invoke-direct {v5, v8}, Landroidx/constraintlayout/core/parser/CLNumber;-><init>(F)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v7, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->add(Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 87
    .line 88
    .line 89
    new-instance v5, Landroidx/constraintlayout/core/parser/CLNumber;

    .line 90
    .line 91
    invoke-virtual {v6}, Landroidx/constraintlayout/compose/ChainParams;->getTopMargin-D9Ej5fM()F

    .line 92
    .line 93
    .line 94
    move-result v8

    .line 95
    invoke-direct {v5, v8}, Landroidx/constraintlayout/core/parser/CLNumber;-><init>(F)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v7, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->add(Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 99
    .line 100
    .line 101
    new-instance v5, Landroidx/constraintlayout/core/parser/CLNumber;

    .line 102
    .line 103
    invoke-virtual {v6}, Landroidx/constraintlayout/compose/ChainParams;->getBottomMargin-D9Ej5fM()F

    .line 104
    .line 105
    .line 106
    move-result v8

    .line 107
    invoke-direct {v5, v8}, Landroidx/constraintlayout/core/parser/CLNumber;-><init>(F)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v7, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->add(Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 111
    .line 112
    .line 113
    new-instance v5, Landroidx/constraintlayout/core/parser/CLNumber;

    .line 114
    .line 115
    invoke-virtual {v6}, Landroidx/constraintlayout/compose/ChainParams;->getTopGoneMargin-D9Ej5fM()F

    .line 116
    .line 117
    .line 118
    move-result v8

    .line 119
    invoke-direct {v5, v8}, Landroidx/constraintlayout/core/parser/CLNumber;-><init>(F)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v7, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->add(Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 123
    .line 124
    .line 125
    new-instance v5, Landroidx/constraintlayout/core/parser/CLNumber;

    .line 126
    .line 127
    invoke-virtual {v6}, Landroidx/constraintlayout/compose/ChainParams;->getBottomGoneMargin-D9Ej5fM()F

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    invoke-direct {v5, v6}, Landroidx/constraintlayout/core/parser/CLNumber;-><init>(F)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v7, v5}, Landroidx/constraintlayout/core/parser/CLContainer;->add(Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 135
    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_1
    invoke-virtual {v5}, Landroidx/constraintlayout/compose/LayoutReference;->getId$constraintlayout_compose_release()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    invoke-static {v5}, Landroidx/constraintlayout/core/parser/CLString;->from(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLString;

    .line 147
    .line 148
    .line 149
    move-result-object v7

    .line 150
    :goto_1
    invoke-virtual {v1, v7}, Landroidx/constraintlayout/core/parser/CLContainer;->add(Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 151
    .line 152
    .line 153
    add-int/lit8 v4, v4, 0x1

    .line 154
    .line 155
    goto/16 :goto_0

    .line 156
    .line 157
    :cond_2
    new-instance v3, Landroidx/constraintlayout/core/parser/CLArray;

    .line 158
    .line 159
    new-array v4, v2, [C

    .line 160
    .line 161
    invoke-direct {v3, v4}, Landroidx/constraintlayout/core/parser/CLArray;-><init>([C)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p2}, Landroidx/constraintlayout/compose/ChainStyle;->getName$constraintlayout_compose_release()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    invoke-static {v4}, Landroidx/constraintlayout/core/parser/CLString;->from(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLString;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    invoke-virtual {v3, v4}, Landroidx/constraintlayout/core/parser/CLContainer;->add(Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 173
    .line 174
    .line 175
    new-instance v4, Landroidx/constraintlayout/core/parser/CLNumber;

    .line 176
    .line 177
    invoke-virtual {p2}, Landroidx/constraintlayout/compose/ChainStyle;->getBias$constraintlayout_compose_release()Ljava/lang/Float;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    if-eqz v5, :cond_3

    .line 182
    .line 183
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    .line 184
    .line 185
    .line 186
    move-result v5

    .line 187
    goto :goto_2

    .line 188
    :cond_3
    const/high16 v5, 0x3f000000    # 0.5f

    .line 189
    .line 190
    :goto_2
    invoke-direct {v4, v5}, Landroidx/constraintlayout/core/parser/CLNumber;-><init>(F)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v3, v4}, Landroidx/constraintlayout/core/parser/CLContainer;->add(Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p0, v0}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->asCLContainer$constraintlayout_compose_release(Landroidx/constraintlayout/compose/LayoutReference;)Landroidx/constraintlayout/core/parser/CLObject;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    const-string v5, "type"

    .line 201
    .line 202
    const-string v6, "vChain"

    .line 203
    .line 204
    invoke-virtual {v4, v5, v6}, Landroidx/constraintlayout/core/parser/CLContainer;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    const-string v5, "contains"

    .line 208
    .line 209
    invoke-virtual {v4, v5, v1}, Landroidx/constraintlayout/core/parser/CLContainer;->put(Ljava/lang/String;Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 210
    .line 211
    .line 212
    const-string v1, "style"

    .line 213
    .line 214
    invoke-virtual {v4, v1, v3}, Landroidx/constraintlayout/core/parser/CLContainer;->put(Ljava/lang/String;Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 215
    .line 216
    .line 217
    const/16 v1, 0x11

    .line 218
    .line 219
    invoke-direct {p0, v1}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->updateHelpersHashCode(I)V

    .line 220
    .line 221
    .line 222
    array-length v1, p1

    .line 223
    :goto_3
    if-ge v2, v1, :cond_4

    .line 224
    .line 225
    aget-object v3, p1, v2

    .line 226
    .line 227
    invoke-virtual {v3}, Landroidx/constraintlayout/compose/LayoutReference;->hashCode()I

    .line 228
    .line 229
    .line 230
    move-result v3

    .line 231
    invoke-direct {p0, v3}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->updateHelpersHashCode(I)V

    .line 232
    .line 233
    .line 234
    add-int/lit8 v2, v2, 0x1

    .line 235
    .line 236
    goto :goto_3

    .line 237
    :cond_4
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    .line 238
    .line 239
    .line 240
    move-result p1

    .line 241
    invoke-direct {p0, p1}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->updateHelpersHashCode(I)V

    .line 242
    .line 243
    .line 244
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    instance-of v0, p1, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->containerObject:Landroidx/constraintlayout/core/parser/CLObject;

    .line 10
    .line 11
    check-cast p1, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;

    .line 12
    .line 13
    iget-object p1, p1, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->containerObject:Landroidx/constraintlayout/core/parser/CLObject;

    .line 14
    .line 15
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1

    .line 20
    :cond_1
    const/4 p1, 0x0

    .line 21
    return p1
.end method

.method public final getContainerObject()Landroidx/constraintlayout/core/parser/CLObject;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->containerObject:Landroidx/constraintlayout/core/parser/CLObject;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getHelpersHashCode()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->helpersHashCode:I

    .line 2
    .line 3
    return v0
.end method

.method public final getTasks()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/constraintlayout/compose/State;",
            "Lkotlin/Unit;",
            ">;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->tasks:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->containerObject:Landroidx/constraintlayout/core/parser/CLObject;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/constraintlayout/core/parser/CLContainer;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public reset()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->containerObject:Landroidx/constraintlayout/core/parser/CLObject;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/constraintlayout/core/parser/CLContainer;->clear()V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->HelpersStartId:I

    .line 7
    .line 8
    iput v0, p0, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->helperId:I

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput v0, p0, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->helpersHashCode:I

    .line 12
    .line 13
    return-void
.end method

.method public final setHelpersHashCode(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->helpersHashCode:I

    .line 2
    .line 3
    return-void
.end method

.method public final withChainParams-ouYQatA(Landroidx/constraintlayout/compose/LayoutReference;FFFFFFFFF)Landroidx/constraintlayout/compose/LayoutReference;
    .locals 11

    .line 1
    new-instance v0, Landroidx/constraintlayout/compose/ChainParams;

    .line 2
    .line 3
    const/4 v10, 0x0

    .line 4
    move v1, p2

    .line 5
    move v2, p3

    .line 6
    move v3, p4

    .line 7
    move/from16 v4, p5

    .line 8
    .line 9
    move/from16 v5, p6

    .line 10
    .line 11
    move/from16 v6, p7

    .line 12
    .line 13
    move/from16 v7, p8

    .line 14
    .line 15
    move/from16 v8, p9

    .line 16
    .line 17
    move/from16 v9, p10

    .line 18
    .line 19
    invoke-direct/range {v0 .. v10}, Landroidx/constraintlayout/compose/ChainParams;-><init>(FFFFFFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v0}, Landroidx/constraintlayout/compose/LayoutReference;->setHelperParams$constraintlayout_compose_release(Landroidx/constraintlayout/compose/HelperParams;)V

    .line 23
    .line 24
    .line 25
    return-object p1
.end method

.method public final withHorizontalChainParams-YLPp7PM(Landroidx/constraintlayout/compose/LayoutReference;FFFFF)Landroidx/constraintlayout/compose/LayoutReference;
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    int-to-float v0, v0

    .line 3
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 4
    .line 5
    .line 6
    move-result v4

    .line 7
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 8
    .line 9
    .line 10
    move-result v6

    .line 11
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 12
    .line 13
    .line 14
    move-result v8

    .line 15
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 16
    .line 17
    .line 18
    move-result v10

    .line 19
    move-object v1, p0

    .line 20
    move-object v2, p1

    .line 21
    move v3, p2

    .line 22
    move v5, p3

    .line 23
    move/from16 v7, p4

    .line 24
    .line 25
    move/from16 v9, p5

    .line 26
    .line 27
    move/from16 v11, p6

    .line 28
    .line 29
    invoke-virtual/range {v1 .. v11}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->withChainParams-ouYQatA(Landroidx/constraintlayout/compose/LayoutReference;FFFFFFFFF)Landroidx/constraintlayout/compose/LayoutReference;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
.end method

.method public final withVerticalChainParams-YLPp7PM(Landroidx/constraintlayout/compose/LayoutReference;FFFFF)Landroidx/constraintlayout/compose/LayoutReference;
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    int-to-float v0, v0

    .line 3
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 4
    .line 5
    .line 6
    move-result v3

    .line 7
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 8
    .line 9
    .line 10
    move-result v5

    .line 11
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 12
    .line 13
    .line 14
    move-result v7

    .line 15
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 16
    .line 17
    .line 18
    move-result v9

    .line 19
    move-object v1, p0

    .line 20
    move-object v2, p1

    .line 21
    move v4, p2

    .line 22
    move v6, p3

    .line 23
    move/from16 v8, p4

    .line 24
    .line 25
    move/from16 v10, p5

    .line 26
    .line 27
    move/from16 v11, p6

    .line 28
    .line 29
    invoke-virtual/range {v1 .. v11}, Landroidx/constraintlayout/compose/ConstraintLayoutBaseScope;->withChainParams-ouYQatA(Landroidx/constraintlayout/compose/LayoutReference;FFFFFFFFF)Landroidx/constraintlayout/compose/LayoutReference;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    return-object p1
.end method
