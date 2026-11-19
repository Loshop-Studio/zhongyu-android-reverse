.class public final Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;
.super Lcom/zykj/student/dialogue/ui/home/Hilt_DatePickerFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0019\u0010\u000e\u001a\u00020\r2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0003J!\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\n2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J3\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r0\u0018H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0014\u0010%\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010\"R\u001b\u0010+\u001a\u00020&8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\'\u0010(\u001a\u0004\u0008)\u0010*R\u001b\u00101\u001a\u00020,8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008-\u0010.\u001a\u0004\u0008/\u00100\u00a8\u00062"
    }
    d2 = {
        "Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;",
        "Landroidx/fragment/app/DialogFragment;",
        "<init>",
        "()V",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroid/view/View;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;",
        "",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "onStart",
        "view",
        "onViewCreated",
        "(Landroid/view/View;Landroid/os/Bundle;)V",
        "",
        "title",
        "Ljava/util/Date;",
        "currentTime",
        "Lkotlin/Function1;",
        "callback",
        "H",
        "(Ljava/lang/String;Ljava/util/Date;Lkotlin/jvm/functions/Function1;)V",
        "Lcom/zykj/student/dialogue/databinding/FragmentDatePickerBinding;",
        "f",
        "Lcom/zykj/student/dialogue/databinding/FragmentDatePickerBinding;",
        "binding",
        "Ljava/text/SimpleDateFormat;",
        "g",
        "Ljava/text/SimpleDateFormat;",
        "timeFormat",
        "h",
        "dateFormat",
        "Lcom/zykj/student/dialogue/ui/home/DatePickerViewModel;",
        "i",
        "Lkotlin/Lazy;",
        "w",
        "()Lcom/zykj/student/dialogue/ui/home/DatePickerViewModel;",
        "viewModel",
        "Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;",
        "j",
        "Landroidx/navigation/NavArgsLazy;",
        "v",
        "()Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;",
        "args",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDatePickerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePickerFragment.kt\ncom/zykj/student/dialogue/ui/home/DatePickerFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n*L\n1#1,233:1\n106#2,15:234\n42#3,3:249\n*S KotlinDebug\n*F\n+ 1 DatePickerFragment.kt\ncom/zykj/student/dialogue/ui/home/DatePickerFragment\n*L\n35#1:234,15\n37#1:249,3\n*E\n"
    }
.end annotation


# instance fields
.field public f:Lcom/zykj/student/dialogue/databinding/FragmentDatePickerBinding;

.field public final g:Ljava/text/SimpleDateFormat;

.field public final h:Ljava/text/SimpleDateFormat;

.field public final i:Lkotlin/Lazy;

.field public final j:Landroidx/navigation/NavArgsLazy;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/zykj/student/dialogue/ui/home/Hilt_DatePickerFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 5
    .line 6
    sget-object v1, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 7
    .line 8
    const-string v2, "HH:mm"

    .line 9
    .line 10
    invoke-direct {v0, v2, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->g:Ljava/text/SimpleDateFormat;

    .line 14
    .line 15
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 16
    .line 17
    const-string v2, "yyyy-MM-dd"

    .line 18
    .line 19
    invoke-direct {v0, v2, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->h:Ljava/text/SimpleDateFormat;

    .line 23
    .line 24
    new-instance v0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment$special$$inlined$viewModels$default$1;

    .line 25
    .line 26
    invoke-direct {v0, p0}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment$special$$inlined$viewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 27
    .line 28
    .line 29
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    .line 30
    .line 31
    new-instance v2, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment$special$$inlined$viewModels$default$2;

    .line 32
    .line 33
    invoke-direct {v2, v0}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment$special$$inlined$viewModels$default$2;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 34
    .line 35
    .line 36
    invoke-static {v1, v2}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const-class v1, Lcom/zykj/student/dialogue/ui/home/DatePickerViewModel;

    .line 41
    .line 42
    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    new-instance v2, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment$special$$inlined$viewModels$default$3;

    .line 47
    .line 48
    invoke-direct {v2, v0}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment$special$$inlined$viewModels$default$3;-><init>(Lkotlin/Lazy;)V

    .line 49
    .line 50
    .line 51
    new-instance v3, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment$special$$inlined$viewModels$default$4;

    .line 52
    .line 53
    const/4 v4, 0x0

    .line 54
    invoke-direct {v3, v4, v0}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment$special$$inlined$viewModels$default$4;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/Lazy;)V

    .line 55
    .line 56
    .line 57
    new-instance v4, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment$special$$inlined$viewModels$default$5;

    .line 58
    .line 59
    invoke-direct {v4, p0, v0}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment$special$$inlined$viewModels$default$5;-><init>(Landroidx/fragment/app/Fragment;Lkotlin/Lazy;)V

    .line 60
    .line 61
    .line 62
    invoke-static {p0, v1, v2, v3, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iput-object v0, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->i:Lkotlin/Lazy;

    .line 67
    .line 68
    new-instance v0, Landroidx/navigation/NavArgsLazy;

    .line 69
    .line 70
    const-class v1, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;

    .line 71
    .line 72
    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    new-instance v2, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment$a;

    .line 77
    .line 78
    invoke-direct {v2, p0}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment$a;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 79
    .line 80
    .line 81
    invoke-direct {v0, v1, v2}, Landroidx/navigation/NavArgsLazy;-><init>(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;)V

    .line 82
    .line 83
    .line 84
    iput-object v0, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->j:Landroidx/navigation/NavArgsLazy;

    .line 85
    .line 86
    return-void
.end method

.method public static final A(Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;Lcom/prolificinteractive/materialcalendarview/CalendarDay;Z)V
    .locals 0

    .line 1
    const-string p3, "<unused var>"

    .line 2
    .line 3
    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "date"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->w()Lcom/zykj/student/dialogue/ui/home/DatePickerViewModel;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p2}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->f()Ljava/util/Date;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p0, p1}, Lcom/zykj/student/dialogue/ui/home/DatePickerViewModel;->j(Ljava/util/Date;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static final B(Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->w()Lcom/zykj/student/dialogue/ui/home/DatePickerViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p1, v0}, Lcom/zykj/student/dialogue/ui/home/DatePickerViewModel;->l(Ljava/util/Date;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->w()Lcom/zykj/student/dialogue/ui/home/DatePickerViewModel;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1, v0}, Lcom/zykj/student/dialogue/ui/home/DatePickerViewModel;->j(Ljava/util/Date;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->w()Lcom/zykj/student/dialogue/ui/home/DatePickerViewModel;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p1, v0}, Lcom/zykj/student/dialogue/ui/home/DatePickerViewModel;->k(Ljava/util/Date;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->w()Lcom/zykj/student/dialogue/ui/home/DatePickerViewModel;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0, v0}, Lcom/zykj/student/dialogue/ui/home/DatePickerViewModel;->m(Ljava/util/Date;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public static final C(Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;Landroid/view/View;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->w()Lcom/zykj/student/dialogue/ui/home/DatePickerViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zykj/student/dialogue/ui/home/DatePickerViewModel;->h()Lkotlinx/coroutines/flow/StateFlow;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Ljava/util/Date;

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->w()Lcom/zykj/student/dialogue/ui/home/DatePickerViewModel;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Lcom/zykj/student/dialogue/ui/home/DatePickerViewModel;->f()Lkotlinx/coroutines/flow/StateFlow;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {v0}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Ljava/util/Date;

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->w()Lcom/zykj/student/dialogue/ui/home/DatePickerViewModel;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1}, Lcom/zykj/student/dialogue/ui/home/DatePickerViewModel;->i()Lkotlinx/coroutines/flow/StateFlow;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-interface {v1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Ljava/util/Date;

    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->w()Lcom/zykj/student/dialogue/ui/home/DatePickerViewModel;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v2}, Lcom/zykj/student/dialogue/ui/home/DatePickerViewModel;->g()Lkotlinx/coroutines/flow/StateFlow;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-interface {v2}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    check-cast v2, Ljava/util/Date;

    .line 56
    .line 57
    if-eqz p1, :cond_1

    .line 58
    .line 59
    if-eqz v0, :cond_1

    .line 60
    .line 61
    if-eqz v1, :cond_1

    .line 62
    .line 63
    if-eqz v2, :cond_1

    .line 64
    .line 65
    iget-object v3, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->g:Ljava/text/SimpleDateFormat;

    .line 66
    .line 67
    invoke-virtual {v3, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    iget-object v4, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->g:Ljava/text/SimpleDateFormat;

    .line 72
    .line 73
    invoke-virtual {v4, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    iget-object v5, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->g:Ljava/text/SimpleDateFormat;

    .line 78
    .line 79
    invoke-static {v3, v5}, Lcom/blankj/utilcode/util/TimeUtils;->string2Date(Ljava/lang/String;Ljava/text/DateFormat;)Ljava/util/Date;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    iget-object v5, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->g:Ljava/text/SimpleDateFormat;

    .line 84
    .line 85
    invoke-static {v4, v5}, Lcom/blankj/utilcode/util/TimeUtils;->string2Date(Ljava/lang/String;Ljava/text/DateFormat;)Ljava/util/Date;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    invoke-virtual {v0, p1}, Ljava/util/Date;->before(Ljava/util/Date;)Z

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    if-nez v5, :cond_0

    .line 94
    .line 95
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    if-eqz v5, :cond_1

    .line 100
    .line 101
    invoke-virtual {v3, v4}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    if-eqz v3, :cond_1

    .line 106
    .line 107
    :cond_0
    const/4 p0, 0x0

    .line 108
    new-array p0, p0, [Ljava/lang/Object;

    .line 109
    .line 110
    const-string p1, "\u5f00\u59cb\u65f6\u95f4\u4e0d\u80fd\u5927\u4e8e\u7ed3\u675f\u65f6\u95f4"

    .line 111
    .line 112
    invoke-static {p1, p0}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :cond_1
    const-string v3, " "

    .line 117
    .line 118
    const-string v4, "HH:mm:ss"

    .line 119
    .line 120
    const/4 v5, 0x0

    .line 121
    if-nez p1, :cond_2

    .line 122
    .line 123
    move-object p1, v5

    .line 124
    goto :goto_0

    .line 125
    :cond_2
    iget-object v6, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->h:Ljava/text/SimpleDateFormat;

    .line 126
    .line 127
    invoke-virtual {v6, p1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    new-instance v6, Ljava/text/SimpleDateFormat;

    .line 132
    .line 133
    sget-object v7, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 134
    .line 135
    invoke-direct {v6, v4, v7}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 136
    .line 137
    .line 138
    if-nez v1, :cond_3

    .line 139
    .line 140
    new-instance v1, Ljava/util/Date;

    .line 141
    .line 142
    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    .line 143
    .line 144
    .line 145
    :cond_3
    invoke-virtual {v6, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    new-instance v6, Ljava/lang/StringBuilder;

    .line 150
    .line 151
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    :goto_0
    const-string v1, "startDateTime"

    .line 168
    .line 169
    invoke-static {v1, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    if-nez v0, :cond_4

    .line 174
    .line 175
    goto :goto_1

    .line 176
    :cond_4
    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->h:Ljava/text/SimpleDateFormat;

    .line 177
    .line 178
    invoke-virtual {v1, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    new-instance v1, Ljava/text/SimpleDateFormat;

    .line 183
    .line 184
    sget-object v5, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    .line 185
    .line 186
    invoke-direct {v1, v4, v5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 187
    .line 188
    .line 189
    if-nez v2, :cond_5

    .line 190
    .line 191
    new-instance v2, Ljava/util/Date;

    .line 192
    .line 193
    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    .line 194
    .line 195
    .line 196
    :cond_5
    invoke-virtual {v1, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    new-instance v2, Ljava/lang/StringBuilder;

    .line 201
    .line 202
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v5

    .line 218
    :goto_1
    const-string v0, "endDateTime"

    .line 219
    .line 220
    invoke-static {v0, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->v()Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    invoke-virtual {v1}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;->f()Z

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    const-string v2, "isJoinedTime"

    .line 237
    .line 238
    invoke-static {v2, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->v()Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    invoke-virtual {v2}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;->e()I

    .line 247
    .line 248
    .line 249
    move-result v2

    .line 250
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    const-string v3, "type"

    .line 255
    .line 256
    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    filled-new-array {p1, v0, v1, v2}, [Lkotlin/Pair;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    invoke-static {p1}, Landroidx/core/os/BundleKt;->bundleOf([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    const-string v0, "date_picker_result"

    .line 269
    .line 270
    invoke-static {p0, v0, p1}, Landroidx/fragment/app/FragmentKt;->setFragmentResult(Landroidx/fragment/app/Fragment;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 271
    .line 272
    .line 273
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 274
    .line 275
    .line 276
    move-result-object p0

    .line 277
    invoke-virtual {p0}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 278
    .line 279
    .line 280
    return-void
.end method

.method public static final D(Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->w()Lcom/zykj/student/dialogue/ui/home/DatePickerViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zykj/student/dialogue/ui/home/DatePickerViewModel;->i()Lkotlinx/coroutines/flow/StateFlow;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Ljava/util/Date;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    new-instance v0, Ls6/o;

    .line 18
    .line 19
    invoke-direct {v0, p0}, Ls6/o;-><init>(Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;)V

    .line 20
    .line 21
    .line 22
    const-string v1, "\u5f00\u59cb\u65f6\u95f4\u9009\u62e9"

    .line 23
    .line 24
    invoke-virtual {p0, v1, p1, v0}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->H(Ljava/lang/String;Ljava/util/Date;Lkotlin/jvm/functions/Function1;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public static final E(Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;Ljava/util/Date;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->w()Lcom/zykj/student/dialogue/ui/home/DatePickerViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0, p1}, Lcom/zykj/student/dialogue/ui/home/DatePickerViewModel;->m(Ljava/util/Date;)V

    .line 11
    .line 12
    .line 13
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 14
    .line 15
    return-object p0
.end method

.method public static final F(Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->w()Lcom/zykj/student/dialogue/ui/home/DatePickerViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/zykj/student/dialogue/ui/home/DatePickerViewModel;->g()Lkotlinx/coroutines/flow/StateFlow;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1}, Lkotlinx/coroutines/flow/StateFlow;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Ljava/util/Date;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    new-instance v0, Ls6/n;

    .line 18
    .line 19
    invoke-direct {v0, p0}, Ls6/n;-><init>(Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;)V

    .line 20
    .line 21
    .line 22
    const-string v1, "\u622a\u6b62\u65f6\u95f4\u9009\u62e9"

    .line 23
    .line 24
    invoke-virtual {p0, v1, p1, v0}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->H(Ljava/lang/String;Ljava/util/Date;Lkotlin/jvm/functions/Function1;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public static final G(Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;Ljava/util/Date;)Lkotlin/Unit;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->w()Lcom/zykj/student/dialogue/ui/home/DatePickerViewModel;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0, p1}, Lcom/zykj/student/dialogue/ui/home/DatePickerViewModel;->k(Ljava/util/Date;)V

    .line 11
    .line 12
    .line 13
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 14
    .line 15
    return-object p0
.end method

.method public static final I(Lkotlin/jvm/functions/Function1;Ljava/util/Date;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static synthetic g(Ljava/text/SimpleDateFormat;Lcom/prolificinteractive/materialcalendarview/CalendarDay;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->y(Ljava/text/SimpleDateFormat;Lcom/prolificinteractive/materialcalendarview/CalendarDay;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;Ljava/util/Date;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->G(Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;Ljava/util/Date;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lkotlin/jvm/functions/Function1;Ljava/util/Date;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->I(Lkotlin/jvm/functions/Function1;Ljava/util/Date;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic j(Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->C(Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic k(Ljava/text/SimpleDateFormat;Lcom/prolificinteractive/materialcalendarview/CalendarDay;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->x(Ljava/text/SimpleDateFormat;Lcom/prolificinteractive/materialcalendarview/CalendarDay;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;Lcom/prolificinteractive/materialcalendarview/CalendarDay;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->z(Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;Lcom/prolificinteractive/materialcalendarview/CalendarDay;Z)V

    return-void
.end method

.method public static synthetic m(Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->D(Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic n(Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->F(Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic o(Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;Ljava/util/Date;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->E(Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;Ljava/util/Date;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;Lcom/prolificinteractive/materialcalendarview/CalendarDay;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->A(Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;Lcom/prolificinteractive/materialcalendarview/CalendarDay;Z)V

    return-void
.end method

.method public static synthetic q(Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->B(Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;Landroid/view/View;)V

    return-void
.end method

.method public static final synthetic r(Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;)Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->v()Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic s(Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;)Lcom/zykj/student/dialogue/databinding/FragmentDatePickerBinding;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->f:Lcom/zykj/student/dialogue/databinding/FragmentDatePickerBinding;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic t(Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;)Ljava/text/SimpleDateFormat;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->g:Ljava/text/SimpleDateFormat;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic u(Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;)Lcom/zykj/student/dialogue/ui/home/DatePickerViewModel;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->w()Lcom/zykj/student/dialogue/ui/home/DatePickerViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final x(Ljava/text/SimpleDateFormat;Lcom/prolificinteractive/materialcalendarview/CalendarDay;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->f()Ljava/util/Date;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static final y(Ljava/text/SimpleDateFormat;Lcom/prolificinteractive/materialcalendarview/CalendarDay;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->f()Ljava/util/Date;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static final z(Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;Lcom/prolificinteractive/materialcalendarview/CalendarDay;Z)V
    .locals 0

    .line 1
    const-string p3, "<unused var>"

    .line 2
    .line 3
    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "date"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->w()Lcom/zykj/student/dialogue/ui/home/DatePickerViewModel;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p2}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->f()Ljava/util/Date;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p0, p1}, Lcom/zykj/student/dialogue/ui/home/DatePickerViewModel;->l(Ljava/util/Date;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final H(Ljava/lang/String;Ljava/util/Date;Lkotlin/jvm/functions/Function1;)V
    .locals 5

    .line 1
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Li4/a;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    new-instance v3, Ls6/f;

    .line 12
    .line 13
    invoke-direct {v3, p3}, Ls6/f;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {v1, v2, v3}, Li4/a;-><init>(Landroid/content/Context;Lk4/c;)V

    .line 17
    .line 18
    .line 19
    sget-object p3, Lcom/xuexiang/xui/widget/picker/widget/configure/TimePickerType;->d:Lcom/xuexiang/xui/widget/picker/widget/configure/TimePickerType;

    .line 20
    .line 21
    invoke-virtual {p3}, Lcom/xuexiang/xui/widget/picker/widget/configure/TimePickerType;->a()[Z

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    const/4 v3, 0x5

    .line 26
    const/4 v4, 0x0

    .line 27
    aput-boolean v4, v2, v3

    .line 28
    .line 29
    invoke-virtual {v1, p3}, Li4/a;->e(Lcom/xuexiang/xui/widget/picker/widget/configure/TimePickerType;)Li4/a;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    invoke-virtual {p3, p1}, Li4/a;->d(Ljava/lang/String;)Li4/a;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {v0, p2}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 38
    .line 39
    .line 40
    const/4 p2, 0x0

    .line 41
    invoke-virtual {p1, v0, p2}, Li4/a;->c(Ljava/util/Calendar;Ljava/util/Calendar;)Li4/a;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    .line 46
    .line 47
    .line 48
    move-result-object p3

    .line 49
    if-eqz p3, :cond_0

    .line 50
    .line 51
    invoke-virtual {p3}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 52
    .line 53
    .line 54
    move-result-object p3

    .line 55
    if-eqz p3, :cond_0

    .line 56
    .line 57
    invoke-virtual {p3}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    :cond_0
    const-string p3, "null cannot be cast to non-null type android.view.ViewGroup"

    .line 62
    .line 63
    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    check-cast p2, Landroid/view/ViewGroup;

    .line 67
    .line 68
    invoke-virtual {p1, p2}, Li4/a;->b(Landroid/view/ViewGroup;)Li4/a;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p1}, Li4/a;->a()Lg4/b;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p1}, Lg4/a;->v()V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/DialogFragment;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    sget v0, Lcom/zykj/student/dialogue/R$style;->CustomDialog:I

    .line 6
    .line 7
    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/DialogFragment;->setStyle(II)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    const-string p3, "inflater"

    .line 2
    .line 3
    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p3, 0x0

    .line 7
    invoke-static {p1, p2, p3}, Lcom/zykj/student/dialogue/databinding/FragmentDatePickerBinding;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/student/dialogue/databinding/FragmentDatePickerBinding;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string p2, "inflate(...)"

    .line 12
    .line 13
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->f:Lcom/zykj/student/dialogue/databinding/FragmentDatePickerBinding;

    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    const-string p1, "binding"

    .line 21
    .line 22
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    :cond_0
    invoke-virtual {p1}, Lcom/zykj/student/dialogue/databinding/FragmentDatePickerBinding;->b()Landroid/widget/FrameLayout;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const-string p2, "getRoot(...)"

    .line 31
    .line 32
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-object p1
.end method

.method public onStart()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/16 v1, 0x3e8

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/view/Window;->setType(I)V

    .line 16
    .line 17
    .line 18
    const/4 v1, -0x1

    .line 19
    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setLayout(II)V

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-super {p0}, Landroidx/fragment/app/DialogFragment;->onStart()V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 7

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    move-result-object p1

    const-string p2, "getViewLifecycleOwner(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v0

    new-instance v3, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment$onViewCreated$1;

    const/4 p1, 0x0

    invoke-direct {v3, p0, p1}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment$onViewCreated$1;-><init>(Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    move-result-object v0

    invoke-static {v0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v1

    new-instance v4, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment$onViewCreated$2;

    invoke-direct {v4, p0, p1}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment$onViewCreated$2;-><init>(Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    move-result-object v0

    invoke-static {v0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v1

    new-instance v4, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment$onViewCreated$3;

    invoke-direct {v4, p0, p1}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment$onViewCreated$3;-><init>(Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;Lkotlin/coroutines/Continuation;)V

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    move-result-object v0

    invoke-static {v0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v1

    new-instance v4, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment$onViewCreated$4;

    invoke-direct {v4, p0, p1}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment$onViewCreated$4;-><init>(Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;Lkotlin/coroutines/Continuation;)V

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 6
    iget-object p2, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->f:Lcom/zykj/student/dialogue/databinding/FragmentDatePickerBinding;

    const-string v0, "binding"

    if-nez p2, :cond_0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p2, p1

    :cond_0
    iget-object p2, p2, Lcom/zykj/student/dialogue/databinding/FragmentDatePickerBinding;->d:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;

    invoke-virtual {p2}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->L()Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;

    move-result-object p2

    invoke-virtual {p2}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;->g()Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;

    move-result-object p2

    invoke-virtual {p2}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;->g()V

    .line 7
    iget-object p2, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->f:Lcom/zykj/student/dialogue/databinding/FragmentDatePickerBinding;

    if-nez p2, :cond_1

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p2, p1

    :cond_1
    iget-object p2, p2, Lcom/zykj/student/dialogue/databinding/FragmentDatePickerBinding;->c:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;

    invoke-virtual {p2}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->L()Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;

    move-result-object p2

    invoke-virtual {p2}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;->g()Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;

    move-result-object p2

    invoke-virtual {p2}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;->g()V

    .line 8
    iget-object p2, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->f:Lcom/zykj/student/dialogue/databinding/FragmentDatePickerBinding;

    if-nez p2, :cond_2

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p2, p1

    :cond_2
    iget-object p2, p2, Lcom/zykj/student/dialogue/databinding/FragmentDatePickerBinding;->h:Landroid/widget/TextView;

    new-instance v1, Ls6/e;

    invoke-direct {v1, p0}, Ls6/e;-><init>(Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;)V

    invoke-virtual {p2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 9
    iget-object p2, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->f:Lcom/zykj/student/dialogue/databinding/FragmentDatePickerBinding;

    if-nez p2, :cond_3

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p2, p1

    :cond_3
    iget-object p2, p2, Lcom/zykj/student/dialogue/databinding/FragmentDatePickerBinding;->f:Landroid/widget/TextView;

    new-instance v1, Ls6/g;

    invoke-direct {v1, p0}, Ls6/g;-><init>(Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;)V

    invoke-virtual {p2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 10
    new-instance p2, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy.MM"

    sget-object v2, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    invoke-direct {p2, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 11
    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->f:Lcom/zykj/student/dialogue/databinding/FragmentDatePickerBinding;

    if-nez v1, :cond_4

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, p1

    :cond_4
    iget-object v1, v1, Lcom/zykj/student/dialogue/databinding/FragmentDatePickerBinding;->d:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;

    new-instance v2, Ls6/h;

    invoke-direct {v2, p2}, Ls6/h;-><init>(Ljava/text/SimpleDateFormat;)V

    invoke-virtual {v1, v2}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setTitleFormatter(Lb2/g;)V

    .line 12
    iget-object v1, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->f:Lcom/zykj/student/dialogue/databinding/FragmentDatePickerBinding;

    if-nez v1, :cond_5

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, p1

    :cond_5
    iget-object v1, v1, Lcom/zykj/student/dialogue/databinding/FragmentDatePickerBinding;->c:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;

    new-instance v2, Ls6/i;

    invoke-direct {v2, p2}, Ls6/i;-><init>(Ljava/text/SimpleDateFormat;)V

    invoke-virtual {v1, v2}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setTitleFormatter(Lb2/g;)V

    .line 13
    iget-object p2, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->f:Lcom/zykj/student/dialogue/databinding/FragmentDatePickerBinding;

    if-nez p2, :cond_6

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p2, p1

    :cond_6
    iget-object p2, p2, Lcom/zykj/student/dialogue/databinding/FragmentDatePickerBinding;->d:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;

    new-instance v1, Ls6/j;

    invoke-direct {v1, p0}, Ls6/j;-><init>(Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;)V

    invoke-virtual {p2, v1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setOnDateChangedListener(La2/n;)V

    .line 14
    iget-object p2, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->f:Lcom/zykj/student/dialogue/databinding/FragmentDatePickerBinding;

    if-nez p2, :cond_7

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p2, p1

    :cond_7
    iget-object p2, p2, Lcom/zykj/student/dialogue/databinding/FragmentDatePickerBinding;->c:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;

    new-instance v1, Ls6/k;

    invoke-direct {v1, p0}, Ls6/k;-><init>(Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;)V

    invoke-virtual {p2, v1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setOnDateChangedListener(La2/n;)V

    .line 15
    iget-object p2, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->f:Lcom/zykj/student/dialogue/databinding/FragmentDatePickerBinding;

    if-nez p2, :cond_8

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p2, p1

    :cond_8
    iget-object p2, p2, Lcom/zykj/student/dialogue/databinding/FragmentDatePickerBinding;->g:Landroidx/appcompat/widget/AppCompatTextView;

    new-instance v1, Ls6/l;

    invoke-direct {v1, p0}, Ls6/l;-><init>(Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;)V

    invoke-virtual {p2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 16
    iget-object p2, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->f:Lcom/zykj/student/dialogue/databinding/FragmentDatePickerBinding;

    if-nez p2, :cond_9

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p2, p1

    :cond_9
    iget-object p2, p2, Lcom/zykj/student/dialogue/databinding/FragmentDatePickerBinding;->e:Landroidx/appcompat/widget/AppCompatTextView;

    new-instance v1, Ls6/m;

    invoke-direct {v1, p0}, Ls6/m;-><init>(Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;)V

    invoke-virtual {p2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/activity/ComponentActivity;->getOnBackPressedDispatcher()Landroidx/activity/OnBackPressedDispatcher;

    move-result-object p2

    .line 18
    new-instance v1, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment$onViewCreated$12;

    invoke-direct {v1, p0}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment$onViewCreated$12;-><init>(Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;)V

    .line 19
    invoke-virtual {p2, p0, v1}, Landroidx/activity/OnBackPressedDispatcher;->addCallback(Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/OnBackPressedCallback;)V

    .line 20
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->w()Lcom/zykj/student/dialogue/ui/home/DatePickerViewModel;

    move-result-object p2

    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->v()Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;

    move-result-object v1

    invoke-virtual {v1}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;->d()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {p2, v1}, Lcom/zykj/student/dialogue/ui/home/DatePickerViewModel;->m(Ljava/util/Date;)V

    .line 21
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->w()Lcom/zykj/student/dialogue/ui/home/DatePickerViewModel;

    move-result-object p2

    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->v()Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;

    move-result-object v1

    invoke-virtual {v1}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;->b()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {p2, v1}, Lcom/zykj/student/dialogue/ui/home/DatePickerViewModel;->k(Ljava/util/Date;)V

    .line 22
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->w()Lcom/zykj/student/dialogue/ui/home/DatePickerViewModel;

    move-result-object p2

    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->v()Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;

    move-result-object v1

    invoke-virtual {v1}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;->c()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {p2, v1}, Lcom/zykj/student/dialogue/ui/home/DatePickerViewModel;->l(Ljava/util/Date;)V

    .line 23
    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->w()Lcom/zykj/student/dialogue/ui/home/DatePickerViewModel;

    move-result-object p2

    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->v()Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;

    move-result-object v1

    invoke-virtual {v1}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;->a()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {p2, v1}, Lcom/zykj/student/dialogue/ui/home/DatePickerViewModel;->j(Ljava/util/Date;)V

    .line 24
    iget-object p2, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->f:Lcom/zykj/student/dialogue/databinding/FragmentDatePickerBinding;

    if-nez p2, :cond_a

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p2, p1

    :cond_a
    iget-object p2, p2, Lcom/zykj/student/dialogue/databinding/FragmentDatePickerBinding;->d:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;

    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->v()Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;

    move-result-object v1

    invoke-virtual {v1}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;->c()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {p2, v1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setSelectedDate(Ljava/util/Date;)V

    .line 25
    iget-object p2, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->f:Lcom/zykj/student/dialogue/databinding/FragmentDatePickerBinding;

    if-nez p2, :cond_b

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p2, p1

    :cond_b
    iget-object p2, p2, Lcom/zykj/student/dialogue/databinding/FragmentDatePickerBinding;->d:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;

    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->v()Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;

    move-result-object v1

    invoke-virtual {v1}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;->c()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {p2, v1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setCurrentDate(Ljava/util/Date;)V

    .line 26
    iget-object p2, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->f:Lcom/zykj/student/dialogue/databinding/FragmentDatePickerBinding;

    if-nez p2, :cond_c

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object p2, p1

    :cond_c
    iget-object p2, p2, Lcom/zykj/student/dialogue/databinding/FragmentDatePickerBinding;->c:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;

    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->v()Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;

    move-result-object v1

    invoke-virtual {v1}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;->a()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {p2, v1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setSelectedDate(Ljava/util/Date;)V

    .line 27
    iget-object p2, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->f:Lcom/zykj/student/dialogue/databinding/FragmentDatePickerBinding;

    if-nez p2, :cond_d

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_d
    move-object p1, p2

    :goto_0
    iget-object p1, p1, Lcom/zykj/student/dialogue/databinding/FragmentDatePickerBinding;->c:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;

    invoke-virtual {p0}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->v()Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;

    move-result-object p2

    invoke-virtual {p2}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;->a()Ljava/util/Date;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setCurrentDate(Ljava/util/Date;)V

    return-void
.end method

.method public final v()Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->j:Landroidx/navigation/NavArgsLazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragmentArgs;

    .line 8
    .line 9
    return-object v0
.end method

.method public final w()Lcom/zykj/student/dialogue/ui/home/DatePickerViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->i:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/zykj/student/dialogue/ui/home/DatePickerViewModel;

    .line 8
    .line 9
    return-object v0
.end method
