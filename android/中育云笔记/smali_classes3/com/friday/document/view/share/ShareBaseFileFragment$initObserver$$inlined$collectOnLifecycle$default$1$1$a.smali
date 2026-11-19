.class public final Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$1$1$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvd/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lcom/friday/document/view/share/ShareBaseFileFragment;


# direct methods
.method public constructor <init>(Lcom/friday/document/view/share/ShareBaseFileFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$1$1$a;->c:Lcom/friday/document/view/share/ShareBaseFileFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Lcom/friday/document/model/ShareFile;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$1$1$a;->c:Lcom/friday/document/view/share/ShareBaseFileFragment;

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/friday/document/view/share/ShareBaseFileFragment;->B()Lcom/friday/document/viewmodel/ShareBaseViewModel;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const/4 p2, 0x2

    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {p1, v0, v0, p2, v0}, Lcom/friday/document/viewmodel/ShareBaseViewModel;->H(Lcom/friday/document/viewmodel/ShareBaseViewModel;Lcom/friday/document/model/ShareFile;Ljava/util/List;ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    goto/16 :goto_1

    .line 17
    .line 18
    :cond_0
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getType()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/16 v1, 0x30

    .line 27
    .line 28
    if-eq v0, v1, :cond_6

    .line 29
    .line 30
    const/16 v1, 0x31

    .line 31
    .line 32
    if-eq v0, v1, :cond_4

    .line 33
    .line 34
    const/16 v1, 0x36

    .line 35
    .line 36
    if-eq v0, v1, :cond_2

    .line 37
    .line 38
    const/16 v1, 0x621

    .line 39
    .line 40
    if-eq v0, v1, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const-string v0, "12"

    .line 44
    .line 45
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p2

    .line 49
    if-nez p2, :cond_5

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    const-string v0, "6"

    .line 53
    .line 54
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result p2

    .line 58
    if-nez p2, :cond_3

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    iget-object p2, p0, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$1$1$a;->c:Lcom/friday/document/view/share/ShareBaseFileFragment;

    .line 62
    .line 63
    invoke-virtual {p2}, Lcom/friday/document/view/share/ShareBaseFileFragment;->B()Lcom/friday/document/viewmodel/ShareBaseViewModel;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {v0, p1}, Lcom/friday/document/viewmodel/ShareBaseViewModel;->r(Lcom/friday/document/model/ShareFile;)Lcom/friday/document/view/share/SuspendCall;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    sget v1, Lcom/friday/document/R$string;->disconnected_net_without_text:I

    .line 72
    .line 73
    invoke-static {p2, p1, v0, v1}, Lcom/friday/document/view/share/ShareBaseFileFragment;->y(Lcom/friday/document/view/share/ShareBaseFileFragment;Lcom/friday/document/model/ShareFile;Lcom/friday/document/view/share/SuspendCall;I)V

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_4
    const-string v0, "1"

    .line 78
    .line 79
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    if-nez p2, :cond_5

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_5
    iget-object p2, p0, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$1$1$a;->c:Lcom/friday/document/view/share/ShareBaseFileFragment;

    .line 87
    .line 88
    invoke-virtual {p2}, Lcom/friday/document/view/share/ShareBaseFileFragment;->B()Lcom/friday/document/viewmodel/ShareBaseViewModel;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-virtual {v0, p1}, Lcom/friday/document/viewmodel/ShareBaseViewModel;->p(Lcom/friday/document/model/ShareFile;)Lcom/friday/document/view/share/SuspendCall;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    sget v1, Lcom/friday/document/R$string;->dis_net:I

    .line 97
    .line 98
    invoke-static {p2, p1, v0, v1}, Lcom/friday/document/view/share/ShareBaseFileFragment;->y(Lcom/friday/document/view/share/ShareBaseFileFragment;Lcom/friday/document/model/ShareFile;Lcom/friday/document/view/share/SuspendCall;I)V

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_6
    const-string v0, "0"

    .line 103
    .line 104
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result p2

    .line 108
    if-nez p2, :cond_7

    .line 109
    .line 110
    :goto_0
    iget-object p2, p0, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$1$1$a;->c:Lcom/friday/document/view/share/ShareBaseFileFragment;

    .line 111
    .line 112
    invoke-virtual {p2}, Lcom/friday/document/view/share/ShareBaseFileFragment;->B()Lcom/friday/document/viewmodel/ShareBaseViewModel;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {v0, p1}, Lcom/friday/document/viewmodel/ShareBaseViewModel;->q(Lcom/friday/document/model/ShareFile;)Lcom/friday/document/view/share/SuspendCall;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    sget v1, Lcom/friday/document/R$string;->download_cover_error:I

    .line 121
    .line 122
    invoke-static {p2, p1, v0, v1}, Lcom/friday/document/view/share/ShareBaseFileFragment;->y(Lcom/friday/document/view/share/ShareBaseFileFragment;Lcom/friday/document/model/ShareFile;Lcom/friday/document/view/share/SuspendCall;I)V

    .line 123
    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_7
    iget-object p1, p0, Lcom/friday/document/view/share/ShareBaseFileFragment$initObserver$$inlined$collectOnLifecycle$default$1$1$a;->c:Lcom/friday/document/view/share/ShareBaseFileFragment;

    .line 127
    .line 128
    invoke-virtual {p1}, Lcom/friday/document/view/share/ShareBaseFileFragment;->E()Lcom/friday/document/viewmodel/ShareFileViewModel;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-virtual {p1}, Lcom/friday/document/viewmodel/ShareFileViewModel;->v()V

    .line 133
    .line 134
    .line 135
    :goto_1
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 136
    .line 137
    return-object p1
.end method
