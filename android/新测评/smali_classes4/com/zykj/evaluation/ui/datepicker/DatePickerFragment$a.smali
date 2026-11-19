.class public final Lcom/zykj/evaluation/ui/datepicker/DatePickerFragment$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/evaluation/ui/datepicker/DatePickerFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/evaluation/ui/datepicker/DatePickerFragment$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/zykj/evaluation/ui/datepicker/DatePickerFragmentArgs;)Lcom/zykj/evaluation/ui/datepicker/DatePickerFragment;
    .locals 1

    .line 1
    const-string v0, "args"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/zykj/evaluation/ui/datepicker/DatePickerFragment;

    .line 7
    .line 8
    invoke-direct {v0}, Lcom/zykj/evaluation/ui/datepicker/DatePickerFragment;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/zykj/evaluation/ui/datepicker/DatePickerFragmentArgs;->c()Landroid/os/Bundle;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {v0, p1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method
