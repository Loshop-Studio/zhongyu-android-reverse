.class public final synthetic Landroidx/navigation/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/navigation/j;->a:I

    iput-object p1, p0, Landroidx/navigation/j;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget v0, p0, Landroidx/navigation/j;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/navigation/j;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast v1, Lcom/zykj/mistake/fragment/MistakeCollectionLegacyFragment;

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    const/4 v0, 0x6

    .line 12
    const-string v2, "MainFloatingButton"

    .line 13
    .line 14
    invoke-static {v0, v2, p1}, Lcom/zykj/mistake/utils/e;->b(ILjava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sget p1, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->u:I

    .line 18
    .line 19
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const-string/jumbo v0, "requireActivity(...)"

    .line 24
    .line 25
    .line 26
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    new-instance v0, Landroid/content/Intent;

    .line 30
    .line 31
    const-class v1, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 32
    .line 33
    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_0
    check-cast v1, Lcom/zykj/mistake/activity/f;

    .line 41
    .line 42
    invoke-virtual {v1}, Lcom/zykj/mistake/activity/f;->invoke()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :pswitch_1
    check-cast v1, Ll4/e;

    .line 47
    .line 48
    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V

    .line 49
    .line 50
    .line 51
    iget-object p1, v1, Ll4/e;->a:Lr6/a;

    .line 52
    .line 53
    invoke-interface {p1}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :pswitch_2
    check-cast v1, Ll4/d;

    .line 58
    .line 59
    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V

    .line 60
    .line 61
    .line 62
    iget-object p1, v1, Ll4/d;->a:Lcom/zykj/view/board/play/b;

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :pswitch_3
    check-cast v1, Lcom/zykj/blackboard/widgets/TextDialog;

    .line 69
    .line 70
    invoke-static {v1, p1}, Lcom/zykj/blackboard/widgets/TextDialog;->a(Lcom/zykj/blackboard/widgets/TextDialog;Landroid/view/View;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :pswitch_4
    check-cast v1, Lcom/google/android/material/datepicker/MaterialDatePicker;

    .line 75
    .line 76
    invoke-static {v1, p1}, Lcom/google/android/material/datepicker/MaterialDatePicker;->e(Lcom/google/android/material/datepicker/MaterialDatePicker;Landroid/view/View;)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :pswitch_5
    check-cast v1, Landroidx/navigation/NavDirections;

    .line 81
    .line 82
    invoke-static {v1, p1}, Landroidx/navigation/Navigation;->c(Landroidx/navigation/NavDirections;Landroid/view/View;)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
