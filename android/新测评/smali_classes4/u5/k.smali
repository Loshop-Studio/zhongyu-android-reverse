.class public final synthetic Lu5/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc2/g;


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/ui/datepicker/DatePickerFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/evaluation/ui/datepicker/DatePickerFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu5/k;->a:Lcom/zykj/evaluation/ui/datepicker/DatePickerFragment;

    return-void
.end method


# virtual methods
.method public final a(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Lu5/k;->a:Lcom/zykj/evaluation/ui/datepicker/DatePickerFragment;

    invoke-static {v0, p1}, Lcom/zykj/evaluation/ui/datepicker/DatePickerFragment;->g(Lcom/zykj/evaluation/ui/datepicker/DatePickerFragment;Lcom/prolificinteractive/materialcalendarview/CalendarDay;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
