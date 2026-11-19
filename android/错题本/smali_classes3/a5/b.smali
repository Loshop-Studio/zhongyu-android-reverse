.class public final synthetic La5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:La5/e;

.field public final synthetic b:Lcom/zykj/mistake/platform/picker/CollectionDatePickerTarget;

.field public final synthetic c:Landroid/app/Dialog;

.field public final synthetic d:Landroid/widget/DatePicker;

.field public final synthetic e:Landroid/widget/DatePicker;


# direct methods
.method public synthetic constructor <init>(La5/e;Lcom/zykj/mistake/platform/picker/CollectionDatePickerTarget;Landroid/app/Dialog;Landroid/widget/DatePicker;Landroid/widget/DatePicker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La5/b;->a:La5/e;

    iput-object p2, p0, La5/b;->b:Lcom/zykj/mistake/platform/picker/CollectionDatePickerTarget;

    iput-object p3, p0, La5/b;->c:Landroid/app/Dialog;

    iput-object p4, p0, La5/b;->d:Landroid/widget/DatePicker;

    iput-object p5, p0, La5/b;->e:Landroid/widget/DatePicker;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, La5/b;->d:Landroid/widget/DatePicker;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/widget/DatePicker;->getYear()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {v0}, Landroid/widget/DatePicker;->getMonth()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-virtual {v0}, Landroid/widget/DatePicker;->getDayOfMonth()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-virtual {p1, v1, v2, v0}, Ljava/util/Calendar;->set(III)V

    .line 20
    .line 21
    .line 22
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v1, p0, La5/b;->e:Landroid/widget/DatePicker;

    .line 27
    .line 28
    invoke-virtual {v1}, Landroid/widget/DatePicker;->getYear()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    invoke-virtual {v1}, Landroid/widget/DatePicker;->getMonth()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    invoke-virtual {v1}, Landroid/widget/DatePicker;->getDayOfMonth()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-virtual {v0, v2, v3, v1}, Ljava/util/Calendar;->set(III)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v0}, Ljava/util/Calendar;->after(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    iget-object v2, p0, La5/b;->a:La5/e;

    .line 48
    .line 49
    if-eqz v1, :cond_0

    .line 50
    .line 51
    iget-object p1, v2, La5/e;->d:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p1, Lcom/zykj/mistake/activity/MainActivity;

    .line 54
    .line 55
    const-string v0, "\u5f00\u59cb\u65f6\u95f4\u4e0d\u80fd\u5927\u4e8e\u7ed3\u675f\u65f6\u95f4"

    .line 56
    .line 57
    invoke-virtual {p1, v0}, Lcom/zykj/mistake/activity/MainActivity;->b(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_0
    iget-object v1, v2, La5/e;->e:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v1, Lcom/zykj/mistake/activity/e;

    .line 64
    .line 65
    iget-object v2, v2, La5/e;->c:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v2, Ljava/text/SimpleDateFormat;

    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {v2, p1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    const-string v3, "format(...)"

    .line 78
    .line 79
    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {v2, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    iget-object v2, p0, La5/b;->b:Lcom/zykj/mistake/platform/picker/CollectionDatePickerTarget;

    .line 94
    .line 95
    invoke-virtual {v1, v2, p1, v0}, Lcom/zykj/mistake/activity/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    iget-object p1, p0, La5/b;->c:Landroid/app/Dialog;

    .line 99
    .line 100
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 101
    .line 102
    .line 103
    return-void
.end method
