.class public final synthetic Ls6/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb2/g;


# instance fields
.field public final synthetic a:Ljava/text/SimpleDateFormat;


# direct methods
.method public synthetic constructor <init>(Ljava/text/SimpleDateFormat;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls6/h;->a:Ljava/text/SimpleDateFormat;

    return-void
.end method


# virtual methods
.method public final a(Lcom/prolificinteractive/materialcalendarview/CalendarDay;)Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Ls6/h;->a:Ljava/text/SimpleDateFormat;

    invoke-static {v0, p1}, Lcom/zykj/student/dialogue/ui/home/DatePickerFragment;->k(Ljava/text/SimpleDateFormat;Lcom/prolificinteractive/materialcalendarview/CalendarDay;)Ljava/lang/CharSequence;

    move-result-object p1

    return-object p1
.end method
