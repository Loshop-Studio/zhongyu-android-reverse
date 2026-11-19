.class public final Lcom/zykj/mistake/feature/home/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/flow/g;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

.field public final synthetic c:Landroidx/lifecycle/SavedStateHandle;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;Landroidx/lifecycle/SavedStateHandle;I)V
    .locals 0

    .line 1
    iput p3, p0, Lcom/zykj/mistake/feature/home/f;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/feature/home/f;->b:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    iput-object p2, p0, Lcom/zykj/mistake/feature/home/f;->c:Landroidx/lifecycle/SavedStateHandle;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lh6/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget p2, p0, Lcom/zykj/mistake/feature/home/f;->a:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Integer;

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    new-instance p2, Lcom/zykj/mistake/feature/notebook/list/x0;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iget-object v0, p0, Lcom/zykj/mistake/feature/home/f;->c:Landroidx/lifecycle/SavedStateHandle;

    .line 18
    .line 19
    const-string v1, "nav_result_notebook_removed_item_is_mastered"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Ljava/lang/Boolean;

    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/4 v2, 0x0

    .line 35
    :goto_0
    invoke-direct {p2, p1, v2}, Lcom/zykj/mistake/feature/notebook/list/x0;-><init>(IZ)V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lcom/zykj/mistake/feature/home/f;->b:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 39
    .line 40
    invoke-virtual {p1, p2}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->c(Lcom/zykj/mistake/feature/notebook/list/d1;)V

    .line 41
    .line 42
    .line 43
    const-string p1, "nav_result_notebook_removed_item_id"

    .line 44
    .line 45
    const/4 p2, 0x0

    .line 46
    invoke-virtual {v0, p1, p2}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1, p2}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    :goto_1
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 53
    .line 54
    return-object p1

    .line 55
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-eqz p1, :cond_2

    .line 62
    .line 63
    iget-object p1, p0, Lcom/zykj/mistake/feature/home/f;->b:Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;

    .line 64
    .line 65
    sget-object p2, Lcom/zykj/mistake/feature/notebook/list/w0;->a:Lcom/zykj/mistake/feature/notebook/list/w0;

    .line 66
    .line 67
    invoke-virtual {p1, p2}, Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;->c(Lcom/zykj/mistake/feature/notebook/list/d1;)V

    .line 68
    .line 69
    .line 70
    const-string p1, "nav_result_refresh_notebook"

    .line 71
    .line 72
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 73
    .line 74
    iget-object v0, p0, Lcom/zykj/mistake/feature/home/f;->c:Landroidx/lifecycle/SavedStateHandle;

    .line 75
    .line 76
    invoke-virtual {v0, p1, p2}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    :cond_2
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 80
    .line 81
    return-object p1

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
