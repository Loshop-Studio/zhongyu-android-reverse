.class public Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "g"
.end annotation


# instance fields
.field public a:Lcom/prolificinteractive/materialcalendarview/CalendarMode;

.field public b:I

.field public c:Z

.field public d:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

.field public e:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

.field public f:Z

.field public final synthetic g:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;


# direct methods
.method public constructor <init>(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;->g:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    sget-object p1, Lcom/prolificinteractive/materialcalendarview/CalendarMode;->b:Lcom/prolificinteractive/materialcalendarview/CalendarMode;

    iput-object p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;->a:Lcom/prolificinteractive/materialcalendarview/CalendarMode;

    .line 4
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Calendar;->getFirstDayOfWeek()I

    move-result p1

    iput p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;->b:I

    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;->c:Z

    const/4 p1, 0x0

    .line 6
    iput-object p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;->d:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 7
    iput-object p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;->e:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    return-void
.end method

.method public constructor <init>(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;)V
    .locals 0

    .line 8
    iput-object p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;->g:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    sget-object p1, Lcom/prolificinteractive/materialcalendarview/CalendarMode;->b:Lcom/prolificinteractive/materialcalendarview/CalendarMode;

    iput-object p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;->a:Lcom/prolificinteractive/materialcalendarview/CalendarMode;

    .line 10
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Calendar;->getFirstDayOfWeek()I

    move-result p1

    iput p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;->b:I

    const/4 p1, 0x0

    .line 11
    iput-boolean p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;->c:Z

    const/4 p1, 0x0

    .line 12
    iput-object p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;->d:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 13
    iput-object p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;->e:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 14
    invoke-static {p2}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;->a(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;)Lcom/prolificinteractive/materialcalendarview/CalendarMode;

    move-result-object p1

    iput-object p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;->a:Lcom/prolificinteractive/materialcalendarview/CalendarMode;

    .line 15
    invoke-static {p2}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;->b(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;)I

    move-result p1

    iput p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;->b:I

    .line 16
    invoke-static {p2}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;->c(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;)Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    move-result-object p1

    iput-object p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;->d:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 17
    invoke-static {p2}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;->d(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;)Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    move-result-object p1

    iput-object p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;->e:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 18
    invoke-static {p2}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;->f(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;->c:Z

    .line 19
    invoke-static {p2}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;->e(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;->f:Z

    return-void
.end method

.method public synthetic constructor <init>(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;-><init>(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;)V

    return-void
.end method

.method public static synthetic a(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;->b:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic b(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;)Lcom/prolificinteractive/materialcalendarview/CalendarDay;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;->d:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic c(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;)Lcom/prolificinteractive/materialcalendarview/CalendarDay;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;->e:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic d(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;->c:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic e(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;->f:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic f(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;)Lcom/prolificinteractive/materialcalendarview/CalendarMode;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;->a:Lcom/prolificinteractive/materialcalendarview/CalendarMode;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public g()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;->g:Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;

    .line 2
    .line 3
    new-instance v1, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, v0, p0, v2}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;-><init>(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$a;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;->d(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$f;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public h(Z)Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;->c:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public i(Lcom/prolificinteractive/materialcalendarview/CalendarMode;)Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;->a:Lcom/prolificinteractive/materialcalendarview/CalendarMode;

    .line 2
    .line 3
    return-object p0
.end method

.method public j(I)Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;
    .locals 0

    .line 1
    iput p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;->b:I

    .line 2
    .line 3
    return-object p0
.end method

.method public k(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;->e:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 2
    .line 3
    return-object p0
.end method

.method public l(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;->d:Lcom/prolificinteractive/materialcalendarview/CalendarDay;

    .line 2
    .line 3
    return-object p0
.end method

.method public m(Z)Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView$g;->f:Z

    .line 2
    .line 3
    return-object p0
.end method
