.class public final Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance$onAttach$1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/flow/FlowCollector;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance$onAttach$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lkotlin/jvm/internal/Ref$IntRef;

.field public final synthetic b:Lkotlin/jvm/internal/Ref$IntRef;

.field public final synthetic c:Lkotlin/jvm/internal/Ref$IntRef;

.field public final synthetic d:Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$IntRef;Lkotlin/jvm/internal/Ref$IntRef;Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance$onAttach$1$a;->a:Lkotlin/jvm/internal/Ref$IntRef;

    iput-object p2, p0, Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance$onAttach$1$a;->b:Lkotlin/jvm/internal/Ref$IntRef;

    iput-object p3, p0, Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance$onAttach$1$a;->c:Lkotlin/jvm/internal/Ref$IntRef;

    iput-object p4, p0, Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance$onAttach$1$a;->d:Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/foundation/interaction/Interaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of p2, p1, Landroidx/compose/foundation/interaction/PressInteraction$Press;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance$onAttach$1$a;->a:Lkotlin/jvm/internal/Ref$IntRef;

    .line 7
    .line 8
    iget p2, p1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 9
    .line 10
    add-int/2addr p2, v0

    .line 11
    iput p2, p1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    instance-of p2, p1, Landroidx/compose/foundation/interaction/PressInteraction$Release;

    .line 15
    .line 16
    if-eqz p2, :cond_1

    .line 17
    .line 18
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance$onAttach$1$a;->a:Lkotlin/jvm/internal/Ref$IntRef;

    .line 19
    .line 20
    iget p2, p1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 21
    .line 22
    add-int/lit8 p2, p2, -0x1

    .line 23
    .line 24
    iput p2, p1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    instance-of p2, p1, Landroidx/compose/foundation/interaction/PressInteraction$Cancel;

    .line 28
    .line 29
    if-eqz p2, :cond_2

    .line 30
    .line 31
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance$onAttach$1$a;->a:Lkotlin/jvm/internal/Ref$IntRef;

    .line 32
    .line 33
    iget p2, p1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 34
    .line 35
    add-int/lit8 p2, p2, -0x1

    .line 36
    .line 37
    iput p2, p1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    instance-of p2, p1, Landroidx/compose/foundation/interaction/HoverInteraction$Enter;

    .line 41
    .line 42
    if-eqz p2, :cond_3

    .line 43
    .line 44
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance$onAttach$1$a;->b:Lkotlin/jvm/internal/Ref$IntRef;

    .line 45
    .line 46
    iget p2, p1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 47
    .line 48
    add-int/2addr p2, v0

    .line 49
    iput p2, p1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    instance-of p2, p1, Landroidx/compose/foundation/interaction/HoverInteraction$Exit;

    .line 53
    .line 54
    if-eqz p2, :cond_4

    .line 55
    .line 56
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance$onAttach$1$a;->b:Lkotlin/jvm/internal/Ref$IntRef;

    .line 57
    .line 58
    iget p2, p1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 59
    .line 60
    add-int/lit8 p2, p2, -0x1

    .line 61
    .line 62
    iput p2, p1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_4
    instance-of p2, p1, Landroidx/compose/foundation/interaction/FocusInteraction$Focus;

    .line 66
    .line 67
    if-eqz p2, :cond_5

    .line 68
    .line 69
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance$onAttach$1$a;->c:Lkotlin/jvm/internal/Ref$IntRef;

    .line 70
    .line 71
    iget p2, p1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 72
    .line 73
    add-int/2addr p2, v0

    .line 74
    iput p2, p1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_5
    instance-of p1, p1, Landroidx/compose/foundation/interaction/FocusInteraction$Unfocus;

    .line 78
    .line 79
    if-eqz p1, :cond_6

    .line 80
    .line 81
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance$onAttach$1$a;->c:Lkotlin/jvm/internal/Ref$IntRef;

    .line 82
    .line 83
    iget p2, p1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 84
    .line 85
    add-int/lit8 p2, p2, -0x1

    .line 86
    .line 87
    iput p2, p1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 88
    .line 89
    :cond_6
    :goto_0
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance$onAttach$1$a;->a:Lkotlin/jvm/internal/Ref$IntRef;

    .line 90
    .line 91
    iget p1, p1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 92
    .line 93
    if-lez p1, :cond_7

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_7
    const/4 v0, 0x0

    .line 97
    :goto_1
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance$onAttach$1$a;->d:Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance;

    .line 98
    .line 99
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance;->b(Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance;)Z

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    if-eq p1, v0, :cond_8

    .line 104
    .line 105
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance$onAttach$1$a;->d:Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance;

    .line 106
    .line 107
    invoke-static {p1, v0}, Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance;->c(Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance;Z)V

    .line 108
    .line 109
    .line 110
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance$onAttach$1$a;->d:Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance;

    .line 111
    .line 112
    invoke-static {p1}, Landroidx/compose/ui/node/DrawModifierNodeKt;->invalidateDraw(Landroidx/compose/ui/node/DrawModifierNode;)V

    .line 113
    .line 114
    .line 115
    :cond_8
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 116
    .line 117
    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/foundation/interaction/Interaction;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/widget/CustomIndication$PressIndicationInstance$onAttach$1$a;->a(Landroidx/compose/foundation/interaction/Interaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
