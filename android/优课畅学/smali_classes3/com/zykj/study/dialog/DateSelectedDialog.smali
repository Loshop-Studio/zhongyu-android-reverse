.class public final Lcom/zykj/study/dialog/DateSelectedDialog;
.super Lcom/zykj/base/BaseDialogFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/dialog/DateSelectedDialog$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/base/BaseDialogFragment<",
        "Lcom/zykj/study/databinding/DialogDateSearchBinding;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lcom/zykj/study/dialog/DateSelectedDialog$a;

.field public static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/study/dialog/DateSelectedDialog$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/study/dialog/DateSelectedDialog$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/study/dialog/DateSelectedDialog;->a:Lcom/zykj/study/dialog/DateSelectedDialog$a;

    const/16 v0, 0x8

    sput v0, Lcom/zykj/study/dialog/DateSelectedDialog;->b:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/base/BaseDialogFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic f(Ljava/text/SimpleDateFormat;Lcom/prolificinteractive/materialcalendarview/CalendarDay;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/dialog/DateSelectedDialog;->n(Ljava/text/SimpleDateFormat;Lcom/prolificinteractive/materialcalendarview/CalendarDay;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lcom/zykj/study/dialog/DateSelectedDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/dialog/DateSelectedDialog;->p(Lcom/zykj/study/dialog/DateSelectedDialog;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic h(Ljava/text/SimpleDateFormat;Lcom/prolificinteractive/materialcalendarview/CalendarDay;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/dialog/DateSelectedDialog;->m(Ljava/text/SimpleDateFormat;Lcom/prolificinteractive/materialcalendarview/CalendarDay;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/zykj/study/dialog/DateSelectedDialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/dialog/DateSelectedDialog;->o(Lcom/zykj/study/dialog/DateSelectedDialog;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic j(Lcom/zykj/study/dialog/DateSelectedDialog;Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/zykj/study/dialog/DateSelectedDialog;->q(Lcom/zykj/study/dialog/DateSelectedDialog;Landroid/content/DialogInterface;)V

    return-void
.end method

.method public static final m(Ljava/text/SimpleDateFormat;Lcom/prolificinteractive/materialcalendarview/CalendarDay;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->i()Ljava/util/Date;

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

.method public static final n(Ljava/text/SimpleDateFormat;Lcom/prolificinteractive/materialcalendarview/CalendarDay;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->i()Ljava/util/Date;

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

.method public static final o(Lcom/zykj/study/dialog/DateSelectedDialog;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/study/databinding/DialogDateSearchBinding;

    .line 6
    .line 7
    iget-object p1, p1, Lcom/zykj/study/databinding/DialogDateSearchBinding;->mcvStartDate:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p1, v0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setSelectedDate(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Lcom/zykj/study/databinding/DialogDateSearchBinding;

    .line 18
    .line 19
    iget-object p0, p0, Lcom/zykj/study/databinding/DialogDateSearchBinding;->mcvEndDate:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setSelectedDate(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public static final p(Lcom/zykj/study/dialog/DateSelectedDialog;Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/study/databinding/DialogDateSearchBinding;

    .line 6
    .line 7
    iget-object p1, p1, Lcom/zykj/study/databinding/DialogDateSearchBinding;->mcvStartDate:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;

    .line 8
    .line 9
    const-string v0, "mcvStartDate"

    .line 10
    .line 11
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    invoke-virtual {p0, p1, v0}, Lcom/zykj/study/dialog/DateSelectedDialog;->l(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;Z)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lcom/zykj/study/databinding/DialogDateSearchBinding;

    .line 24
    .line 25
    iget-object v0, v0, Lcom/zykj/study/databinding/DialogDateSearchBinding;->mcvEndDate:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;

    .line 26
    .line 27
    const-string v1, "mcvEndDate"

    .line 28
    .line 29
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    invoke-virtual {p0, v0, v1}, Lcom/zykj/study/dialog/DateSelectedDialog;->l(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;Z)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    if-eqz v0, :cond_2

    .line 47
    .line 48
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-nez v1, :cond_1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    check-cast v1, Lcom/zykj/study/databinding/DialogDateSearchBinding;

    .line 60
    .line 61
    iget-object v1, v1, Lcom/zykj/study/databinding/DialogDateSearchBinding;->mcvStartDate:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;

    .line 62
    .line 63
    invoke-virtual {v1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->getSelectedDate()Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    check-cast v2, Lcom/zykj/study/databinding/DialogDateSearchBinding;

    .line 72
    .line 73
    iget-object v2, v2, Lcom/zykj/study/databinding/DialogDateSearchBinding;->mcvEndDate:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;

    .line 74
    .line 75
    invoke-virtual {v2}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->getSelectedDate()Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-virtual {v1, v2}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->n(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-eqz v1, :cond_2

    .line 84
    .line 85
    sget-object p1, Lcom/zykj/base/utils/XToastUtils;->INSTANCE:Lcom/zykj/base/utils/XToastUtils;

    .line 86
    .line 87
    sget v0, Lcom/zykj/study/R$string;->date_dialog_tip:I

    .line 88
    .line 89
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    const-string v0, "getString(...)"

    .line 94
    .line 95
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, p0}, Lcom/zykj/base/utils/XToastUtils;->toast(Ljava/lang/CharSequence;)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_2
    :goto_0
    new-instance v1, Landroid/os/Bundle;

    .line 103
    .line 104
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 105
    .line 106
    .line 107
    const-string v2, "START_DATE"

    .line 108
    .line 109
    invoke-virtual {v1, v2, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    const-string p1, "END_DATE"

    .line 113
    .line 114
    invoke-virtual {v1, p1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 118
    .line 119
    const-string p1, "REQUEST_DATE"

    .line 120
    .line 121
    invoke-static {p0, p1, v1}, Landroidx/fragment/app/FragmentKt;->setFragmentResult(Landroidx/fragment/app/Fragment;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 122
    .line 123
    .line 124
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    invoke-virtual {p0}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 129
    .line 130
    .line 131
    return-void
.end method

.method public static final q(Lcom/zykj/study/dialog/DateSelectedDialog;Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/navigation/fragment/FragmentKt;->findNavController(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroidx/navigation/NavController;->navigateUp()Z

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public initView(Landroid/os/Bundle;Lm7/c;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 p2, 0x0

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object p1, p2

    .line 20
    :goto_0
    if-eqz p1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sget v1, Lcom/zykj/lib/ui/R$dimen;->view_350:I

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    float-to-int v0, v0

    .line 33
    iput v0, p1, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 34
    .line 35
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Lcom/zykj/study/databinding/DialogDateSearchBinding;

    .line 40
    .line 41
    iget-object p1, p1, Lcom/zykj/study/databinding/DialogDateSearchBinding;->mcvStartDate:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;

    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->L()Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;->g()Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;->g()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, Lcom/zykj/study/databinding/DialogDateSearchBinding;

    .line 59
    .line 60
    iget-object p1, p1, Lcom/zykj/study/databinding/DialogDateSearchBinding;->mcvEndDate:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;

    .line 61
    .line 62
    invoke-virtual {p1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->L()Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;->g()Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;->g()V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    check-cast p1, Lcom/zykj/study/databinding/DialogDateSearchBinding;

    .line 78
    .line 79
    iget-object p1, p1, Lcom/zykj/study/databinding/DialogDateSearchBinding;->mcvStartDate:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;

    .line 80
    .line 81
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    if-eqz v0, :cond_2

    .line 86
    .line 87
    const-string v1, "start"

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    if-eqz v0, :cond_2

    .line 94
    .line 95
    invoke-virtual {p0, v0}, Lcom/zykj/study/dialog/DateSelectedDialog;->k(Ljava/lang/String;)Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    goto :goto_1

    .line 100
    :cond_2
    move-object v0, p2

    .line 101
    :goto_1
    invoke-virtual {p1, v0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setSelectedDate(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    check-cast p1, Lcom/zykj/study/databinding/DialogDateSearchBinding;

    .line 109
    .line 110
    iget-object p1, p1, Lcom/zykj/study/databinding/DialogDateSearchBinding;->mcvEndDate:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;

    .line 111
    .line 112
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    if-eqz v0, :cond_3

    .line 117
    .line 118
    const-string v1, "end"

    .line 119
    .line 120
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    if-eqz v0, :cond_3

    .line 125
    .line 126
    invoke-virtual {p0, v0}, Lcom/zykj/study/dialog/DateSelectedDialog;->k(Ljava/lang/String;)Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    :cond_3
    invoke-virtual {p1, p2}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setSelectedDate(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)V

    .line 131
    .line 132
    .line 133
    const-string v5, "\u4e94"

    .line 134
    .line 135
    const-string v6, "\u516d"

    .line 136
    .line 137
    const-string v0, "\u65e5"

    .line 138
    .line 139
    const-string v1, "\u4e00"

    .line 140
    .line 141
    const-string v2, "\u4e8c"

    .line 142
    .line 143
    const-string v3, "\u4e09"

    .line 144
    .line 145
    const-string v4, "\u56db"

    .line 146
    .line 147
    filled-new-array/range {v0 .. v6}, [Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 152
    .line 153
    .line 154
    move-result-object p2

    .line 155
    check-cast p2, Lcom/zykj/study/databinding/DialogDateSearchBinding;

    .line 156
    .line 157
    iget-object p2, p2, Lcom/zykj/study/databinding/DialogDateSearchBinding;->mcvStartDate:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;

    .line 158
    .line 159
    check-cast p1, [Ljava/lang/CharSequence;

    .line 160
    .line 161
    invoke-virtual {p2, p1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setWeekDayLabels([Ljava/lang/CharSequence;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 165
    .line 166
    .line 167
    move-result-object p2

    .line 168
    check-cast p2, Lcom/zykj/study/databinding/DialogDateSearchBinding;

    .line 169
    .line 170
    iget-object p2, p2, Lcom/zykj/study/databinding/DialogDateSearchBinding;->mcvEndDate:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;

    .line 171
    .line 172
    invoke-virtual {p2, p1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setWeekDayLabels([Ljava/lang/CharSequence;)V

    .line 173
    .line 174
    .line 175
    new-instance p1, Ljava/text/SimpleDateFormat;

    .line 176
    .line 177
    const-string p2, "yyyy.MM"

    .line 178
    .line 179
    invoke-direct {p1, p2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 183
    .line 184
    .line 185
    move-result-object p2

    .line 186
    check-cast p2, Lcom/zykj/study/databinding/DialogDateSearchBinding;

    .line 187
    .line 188
    iget-object p2, p2, Lcom/zykj/study/databinding/DialogDateSearchBinding;->mcvStartDate:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;

    .line 189
    .line 190
    new-instance v0, Lp4/e;

    .line 191
    .line 192
    invoke-direct {v0, p1}, Lp4/e;-><init>(Ljava/text/SimpleDateFormat;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {p2, v0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setTitleFormatter(Lg1/g;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 199
    .line 200
    .line 201
    move-result-object p2

    .line 202
    check-cast p2, Lcom/zykj/study/databinding/DialogDateSearchBinding;

    .line 203
    .line 204
    iget-object p2, p2, Lcom/zykj/study/databinding/DialogDateSearchBinding;->mcvEndDate:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;

    .line 205
    .line 206
    new-instance v0, Lp4/f;

    .line 207
    .line 208
    invoke-direct {v0, p1}, Lp4/f;-><init>(Ljava/text/SimpleDateFormat;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p2, v0}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->setTitleFormatter(Lg1/g;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    check-cast p1, Lcom/zykj/study/databinding/DialogDateSearchBinding;

    .line 219
    .line 220
    iget-object p1, p1, Lcom/zykj/study/databinding/DialogDateSearchBinding;->btDialogLeft:Landroid/widget/Button;

    .line 221
    .line 222
    new-instance p2, Lp4/g;

    .line 223
    .line 224
    invoke-direct {p2, p0}, Lp4/g;-><init>(Lcom/zykj/study/dialog/DateSelectedDialog;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {p0}, Lcom/zykj/base/BaseDialogFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    check-cast p1, Lcom/zykj/study/databinding/DialogDateSearchBinding;

    .line 235
    .line 236
    iget-object p1, p1, Lcom/zykj/study/databinding/DialogDateSearchBinding;->btDialogRight:Landroid/widget/Button;

    .line 237
    .line 238
    new-instance p2, Lp4/h;

    .line 239
    .line 240
    invoke-direct {p2, p0}, Lp4/h;-><init>(Lcom/zykj/study/dialog/DateSelectedDialog;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {p0}, Landroidx/fragment/app/DialogFragment;->getDialog()Landroid/app/Dialog;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    if-eqz p1, :cond_4

    .line 251
    .line 252
    new-instance p2, Lp4/i;

    .line 253
    .line 254
    invoke-direct {p2, p0}, Lp4/i;-><init>(Lcom/zykj/study/dialog/DateSelectedDialog;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {p1, p2}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 258
    .line 259
    .line 260
    :cond_4
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 261
    .line 262
    return-object p1
.end method

.method public final k(Ljava/lang/String;)Lcom/prolificinteractive/materialcalendarview/CalendarDay;
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-static {p1}, Lg8/c0;->h0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 11
    .line 12
    const-string v1, "yyyy-MM-dd"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-static {p1}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->f(Ljava/util/Date;)Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1

    .line 26
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 27
    return-object p1
.end method

.method public final l(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;Z)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->getSelectedDate()Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    new-instance p2, Ljava/text/SimpleDateFormat;

    .line 8
    .line 9
    const-string v0, "yyyy-MM-dd 00:00:00"

    .line 10
    .line 11
    invoke-direct {p2, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    new-instance p2, Ljava/text/SimpleDateFormat;

    .line 16
    .line 17
    const-string v0, "yyyy-MM-dd 23:59:59"

    .line 18
    .line 19
    invoke-direct {p2, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    if-nez p1, :cond_1

    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    return-object p1

    .line 26
    :cond_1
    invoke-virtual {p1}, Lcom/prolificinteractive/materialcalendarview/CalendarDay;->i()Ljava/util/Date;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p2, p1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1
.end method

.method public layoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/study/R$layout;->dialog_date_search:I

    .line 2
    .line 3
    return v0
.end method
