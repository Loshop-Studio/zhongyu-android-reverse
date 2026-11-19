.class final Lcom/friday/document/view/document/FolderFragment$initObserver$3$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/document/FolderFragment;->initObserver()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.document.view.document.FolderFragment$initObserver$3$1"
    f = "FolderFragment.kt"
    l = {
        0xe0,
        0xe4,
        0xec
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public final synthetic d:Lcom/friday/common/entity/FileEntity;

.field public final synthetic e:Lcom/friday/document/view/document/FolderFragment;


# direct methods
.method public constructor <init>(Lcom/friday/common/entity/FileEntity;Lcom/friday/document/view/document/FolderFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/view/document/FolderFragment$initObserver$3$1;->d:Lcom/friday/common/entity/FileEntity;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/view/document/FolderFragment$initObserver$3$1;->e:Lcom/friday/document/view/document/FolderFragment;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 2

    .line 1
    new-instance p1, Lcom/friday/document/view/document/FolderFragment$initObserver$3$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/view/document/FolderFragment$initObserver$3$1;->d:Lcom/friday/common/entity/FileEntity;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/document/view/document/FolderFragment$initObserver$3$1;->e:Lcom/friday/document/view/document/FolderFragment;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/document/view/document/FolderFragment$initObserver$3$1;-><init>(Lcom/friday/common/entity/FileEntity;Lcom/friday/document/view/document/FolderFragment;Lvc/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/document/FolderFragment$initObserver$3$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/document/FolderFragment$initObserver$3$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/view/document/FolderFragment$initObserver$3$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/view/document/FolderFragment$initObserver$3$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/document/view/document/FolderFragment$initObserver$3$1;->c:I

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz v1, :cond_3

    .line 11
    .line 12
    if-eq v1, v4, :cond_2

    .line 13
    .line 14
    if-eq v1, v3, :cond_1

    .line 15
    .line 16
    if-ne v1, v2, :cond_0

    .line 17
    .line 18
    :try_start_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    goto/16 :goto_4

    .line 22
    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1
    :try_start_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_3
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    :try_start_2
    const-string p1, "checkTab"

    .line 43
    .line 44
    invoke-static {p1}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-static {v4}, Lxc/a;->c(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-interface {p1, v1}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iput v4, p0, Lcom/friday/document/view/document/FolderFragment$initObserver$3$1;->c:I

    .line 56
    .line 57
    const-wide/16 v4, 0x64

    .line 58
    .line 59
    invoke-static {v4, v5, p0}, Lkotlinx/coroutines/DelayKt;->b(JLvc/c;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    if-ne p1, v0, :cond_4

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_4
    :goto_0
    iget-object p1, p0, Lcom/friday/document/view/document/FolderFragment$initObserver$3$1;->d:Lcom/friday/common/entity/FileEntity;

    .line 67
    .line 68
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getParentId()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    const-string v1, "0"

    .line 73
    .line 74
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-eqz p1, :cond_5

    .line 79
    .line 80
    iget-object p1, p0, Lcom/friday/document/view/document/FolderFragment$initObserver$3$1;->e:Lcom/friday/document/view/document/FolderFragment;

    .line 81
    .line 82
    invoke-virtual {p1}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    check-cast p1, Lcom/friday/document/viewmodel/FolderViewModel;

    .line 87
    .line 88
    invoke-virtual {p1}, Lcom/friday/document/viewmodel/BaseFileViewModel;->y0()V

    .line 89
    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_5
    iget-object p1, p0, Lcom/friday/document/view/document/FolderFragment$initObserver$3$1;->e:Lcom/friday/document/view/document/FolderFragment;

    .line 93
    .line 94
    invoke-virtual {p1}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    check-cast p1, Lcom/friday/document/viewmodel/FolderViewModel;

    .line 99
    .line 100
    iget-object v1, p0, Lcom/friday/document/view/document/FolderFragment$initObserver$3$1;->d:Lcom/friday/common/entity/FileEntity;

    .line 101
    .line 102
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getParentId()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    iput v3, p0, Lcom/friday/document/view/document/FolderFragment$initObserver$3$1;->c:I

    .line 107
    .line 108
    invoke-virtual {p1, v1, p0}, Lcom/friday/document/viewmodel/FolderViewModel;->L0(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    if-ne p1, v0, :cond_6

    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_6
    :goto_1
    check-cast p1, Lcom/friday/common/entity/FileEntity;

    .line 116
    .line 117
    if-eqz p1, :cond_8

    .line 118
    .line 119
    iget-object v1, p0, Lcom/friday/document/view/document/FolderFragment$initObserver$3$1;->e:Lcom/friday/document/view/document/FolderFragment;

    .line 120
    .line 121
    invoke-static {v1, p1}, Lcom/friday/document/view/document/FolderFragment;->b0(Lcom/friday/document/view/document/FolderFragment;Lcom/friday/common/entity/FileEntity;)V

    .line 122
    .line 123
    .line 124
    :goto_2
    iput v2, p0, Lcom/friday/document/view/document/FolderFragment$initObserver$3$1;->c:I

    .line 125
    .line 126
    const-wide/16 v1, 0x3e8

    .line 127
    .line 128
    invoke-static {v1, v2, p0}, Lkotlinx/coroutines/DelayKt;->b(JLvc/c;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    if-ne p1, v0, :cond_7

    .line 133
    .line 134
    :goto_3
    return-object v0

    .line 135
    :cond_7
    :goto_4
    iget-object p1, p0, Lcom/friday/document/view/document/FolderFragment$initObserver$3$1;->e:Lcom/friday/document/view/document/FolderFragment;

    .line 136
    .line 137
    invoke-virtual {p1}, Lcom/friday/document/view/document/BaseDocumentFragment;->E()Lcom/friday/document/viewmodel/BaseFileViewModel;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    check-cast p1, Lcom/friday/document/viewmodel/FolderViewModel;

    .line 142
    .line 143
    iget-object v0, p0, Lcom/friday/document/view/document/FolderFragment$initObserver$3$1;->d:Lcom/friday/common/entity/FileEntity;

    .line 144
    .line 145
    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-virtual {p1, v0}, Lcom/friday/document/viewmodel/BaseFileViewModel;->s0(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    goto :goto_5

    .line 153
    :cond_8
    const-string p1, "\u672a\u627e\u5230\u8be5\u6587\u4ef6"

    .line 154
    .line 155
    invoke-static {p1}, Lz1/b;->i(Ljava/lang/CharSequence;)V

    .line 156
    .line 157
    .line 158
    sget-object p1, Lqc/q;->a:Lqc/q;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 159
    .line 160
    return-object p1

    .line 161
    :catch_0
    :goto_5
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 162
    .line 163
    return-object p1
.end method
