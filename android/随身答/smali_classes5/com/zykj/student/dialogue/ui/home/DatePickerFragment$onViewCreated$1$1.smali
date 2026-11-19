.class final Lcom/zykj/student/dialogue/ui/home/DatePickerFragment$onViewCreated$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/student/dialogue/ui/home/DatePickerFragment$onViewCreated$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Ljava/util/Date;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Ljava/util/Date;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zykj.student.dialogue.ui.home.DatePickerFragment$onViewCreated$1$1"
    f = "DatePickerFragment.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;Lkotlin/coroutines/Continuation;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment$onViewCreated$1$1;->c:Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Date;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment$onViewCreated$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment$onViewCreated$1$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment$onViewCreated$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    new-instance v0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment$onViewCreated$1$1;

    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment$onViewCreated$1$1;->c:Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;

    invoke-direct {v0, v1, p2}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment$onViewCreated$1$1;-><init>(Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment$onViewCreated$1$1;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/Date;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment$onViewCreated$1$1;->a(Ljava/util/Date;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment$onViewCreated$1$1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/Date;

    .line 4
    .line 5
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment$onViewCreated$1$1;->a:I

    .line 9
    .line 10
    if-nez v1, :cond_5

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment$onViewCreated$1$1;->c:Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;

    .line 16
    .line 17
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->s(Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;)Lcom/zykj/student/dialogue/databinding/FragmentDatePickerBinding;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string v1, "binding"

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    if-nez p1, :cond_0

    .line 25
    .line 26
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    move-object p1, v2

    .line 30
    :cond_0
    iget-object p1, p1, Lcom/zykj/student/dialogue/databinding/FragmentDatePickerBinding;->h:Landroid/widget/TextView;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    const/4 v3, 0x1

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v3, 0x0

    .line 37
    :goto_0
    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 38
    .line 39
    .line 40
    if-nez v0, :cond_4

    .line 41
    .line 42
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment$onViewCreated$1$1;->c:Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;

    .line 43
    .line 44
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->s(Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;)Lcom/zykj/student/dialogue/databinding/FragmentDatePickerBinding;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    if-nez p1, :cond_2

    .line 49
    .line 50
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    move-object p1, v2

    .line 54
    :cond_2
    iget-object p1, p1, Lcom/zykj/student/dialogue/databinding/FragmentDatePickerBinding;->d:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;

    .line 55
    .line 56
    invoke-virtual {p1, v2}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setSelectedDate(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)V

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment$onViewCreated$1$1;->c:Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;

    .line 60
    .line 61
    invoke-static {p1}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->s(Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;)Lcom/zykj/student/dialogue/databinding/FragmentDatePickerBinding;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    if-nez p1, :cond_3

    .line 66
    .line 67
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    move-object v2, p1

    .line 72
    :goto_1
    iget-object p1, v2, Lcom/zykj/student/dialogue/databinding/FragmentDatePickerBinding;->d:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;

    .line 73
    .line 74
    new-instance v0, Ljava/util/Date;

    .line 75
    .line 76
    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, v0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setCurrentDate(Ljava/util/Date;)V

    .line 80
    .line 81
    .line 82
    :cond_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 83
    .line 84
    return-object p1

    .line 85
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 86
    .line 87
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 88
    .line 89
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw p1
.end method
