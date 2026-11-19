.class public final Lcom/zykj/mistake/feature/collection/detail/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/flow/g;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;

.field public final synthetic c:Landroidx/navigation/NavBackStackEntry;


# direct methods
.method public constructor <init>(Landroidx/navigation/NavBackStackEntry;Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/zykj/mistake/feature/collection/detail/c;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/c;->c:Landroidx/navigation/NavBackStackEntry;

    iput-object p2, p0, Lcom/zykj/mistake/feature/collection/detail/c;->b:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;Landroidx/navigation/NavBackStackEntry;I)V
    .locals 0

    .line 2
    iput p3, p0, Lcom/zykj/mistake/feature/collection/detail/c;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/c;->b:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;

    iput-object p2, p0, Lcom/zykj/mistake/feature/collection/detail/c;->c:Landroidx/navigation/NavBackStackEntry;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lh6/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget p2, p0, Lcom/zykj/mistake/feature/collection/detail/c;->a:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/c;->b:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;

    .line 16
    .line 17
    sget-object p2, Lcom/zykj/mistake/feature/collection/detail/h0;->a:Lcom/zykj/mistake/feature/collection/detail/h0;

    .line 18
    .line 19
    invoke-virtual {p1, p2}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->d(Lcom/zykj/mistake/feature/collection/detail/y0;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/c;->c:Landroidx/navigation/NavBackStackEntry;

    .line 23
    .line 24
    invoke-virtual {p1}, Landroidx/navigation/NavBackStackEntry;->getSavedStateHandle()Landroidx/lifecycle/SavedStateHandle;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    const-string p2, "nav_result_collection_detail_refresh_after_collection_change"

    .line 29
    .line 30
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-virtual {p1, p2, v0}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :goto_0
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 36
    .line 37
    return-object p1

    .line 38
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-nez p1, :cond_1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/c;->b:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;

    .line 48
    .line 49
    sget-object p2, Lcom/zykj/mistake/feature/collection/detail/h0;->a:Lcom/zykj/mistake/feature/collection/detail/h0;

    .line 50
    .line 51
    invoke-virtual {p1, p2}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->d(Lcom/zykj/mistake/feature/collection/detail/y0;)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/c;->c:Landroidx/navigation/NavBackStackEntry;

    .line 55
    .line 56
    invoke-virtual {p1}, Landroidx/navigation/NavBackStackEntry;->getSavedStateHandle()Landroidx/lifecycle/SavedStateHandle;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    const-string p2, "nav_result_collection_detail_refresh_after_practice"

    .line 61
    .line 62
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 63
    .line 64
    invoke-virtual {p1, p2, v0}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    :goto_1
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 68
    .line 69
    return-object p1

    .line 70
    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    if-nez p1, :cond_2

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_2
    iget-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/c;->c:Landroidx/navigation/NavBackStackEntry;

    .line 80
    .line 81
    invoke-virtual {p1}, Landroidx/navigation/NavBackStackEntry;->getSavedStateHandle()Landroidx/lifecycle/SavedStateHandle;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    const-string v0, "nav_result_collection_added_count"

    .line 86
    .line 87
    invoke-virtual {p2, v0}, Landroidx/lifecycle/SavedStateHandle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    check-cast p2, Ljava/lang/Integer;

    .line 92
    .line 93
    if-eqz p2, :cond_3

    .line 94
    .line 95
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    goto :goto_2

    .line 100
    :cond_3
    const/4 p2, 0x0

    .line 101
    :goto_2
    new-instance v0, Lcom/zykj/mistake/feature/collection/detail/i0;

    .line 102
    .line 103
    invoke-direct {v0, p2}, Lcom/zykj/mistake/feature/collection/detail/i0;-><init>(I)V

    .line 104
    .line 105
    .line 106
    iget-object p2, p0, Lcom/zykj/mistake/feature/collection/detail/c;->b:Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;

    .line 107
    .line 108
    invoke-virtual {p2, v0}, Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;->d(Lcom/zykj/mistake/feature/collection/detail/y0;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1}, Landroidx/navigation/NavBackStackEntry;->getSavedStateHandle()Landroidx/lifecycle/SavedStateHandle;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    const-string p2, "nav_result_collection_detail_refresh"

    .line 116
    .line 117
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 118
    .line 119
    invoke-virtual {p1, p2, v0}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    :goto_3
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 123
    .line 124
    return-object p1

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
