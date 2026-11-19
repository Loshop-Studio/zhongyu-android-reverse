.class final Lcom/friday/document/viewmodel/PdfViewerViewModel$dispatch$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/viewmodel/PdfViewerViewModel;->c(Lcom/friday/document/viewmodel/a;)V
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
    c = "com.friday.document.viewmodel.PdfViewerViewModel$dispatch$1"
    f = "PdfViewerViewModel.kt"
    l = {
        0x18,
        0x19,
        0x1c
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:I

.field public final synthetic e:Lcom/friday/document/viewmodel/a;

.field public final synthetic f:Lcom/friday/document/viewmodel/PdfViewerViewModel;


# direct methods
.method public constructor <init>(Lcom/friday/document/viewmodel/a;Lcom/friday/document/viewmodel/PdfViewerViewModel;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/viewmodel/PdfViewerViewModel$dispatch$1;->e:Lcom/friday/document/viewmodel/a;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/friday/document/viewmodel/PdfViewerViewModel$dispatch$1;->f:Lcom/friday/document/viewmodel/PdfViewerViewModel;

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
    new-instance p1, Lcom/friday/document/viewmodel/PdfViewerViewModel$dispatch$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/friday/document/viewmodel/PdfViewerViewModel$dispatch$1;->e:Lcom/friday/document/viewmodel/a;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/friday/document/viewmodel/PdfViewerViewModel$dispatch$1;->f:Lcom/friday/document/viewmodel/PdfViewerViewModel;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/friday/document/viewmodel/PdfViewerViewModel$dispatch$1;-><init>(Lcom/friday/document/viewmodel/a;Lcom/friday/document/viewmodel/PdfViewerViewModel;Lvc/c;)V

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

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/PdfViewerViewModel$dispatch$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/viewmodel/PdfViewerViewModel$dispatch$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/document/viewmodel/PdfViewerViewModel$dispatch$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/document/viewmodel/PdfViewerViewModel$dispatch$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/friday/document/viewmodel/PdfViewerViewModel$dispatch$1;->d:I

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
    goto :goto_0

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_1
    iget-object v0, p0, Lcom/friday/document/viewmodel/PdfViewerViewModel$dispatch$1;->c:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Lcom/friday/common/entity/PdfEntity;

    .line 30
    .line 31
    :goto_0
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_3

    .line 35
    :cond_2
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_3
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, Lcom/friday/document/viewmodel/PdfViewerViewModel$dispatch$1;->e:Lcom/friday/document/viewmodel/a;

    .line 43
    .line 44
    instance-of v1, p1, Lcom/friday/document/viewmodel/a$a;

    .line 45
    .line 46
    if-eqz v1, :cond_5

    .line 47
    .line 48
    iget-object p1, p0, Lcom/friday/document/viewmodel/PdfViewerViewModel$dispatch$1;->f:Lcom/friday/document/viewmodel/PdfViewerViewModel;

    .line 49
    .line 50
    invoke-static {p1}, Lcom/friday/document/viewmodel/PdfViewerViewModel;->a(Lcom/friday/document/viewmodel/PdfViewerViewModel;)Lc2/a1;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iget-object v1, p0, Lcom/friday/document/viewmodel/PdfViewerViewModel$dispatch$1;->e:Lcom/friday/document/viewmodel/a;

    .line 55
    .line 56
    check-cast v1, Lcom/friday/document/viewmodel/a$a;

    .line 57
    .line 58
    invoke-virtual {v1}, Lcom/friday/document/viewmodel/a$a;->a()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    iput v4, p0, Lcom/friday/document/viewmodel/PdfViewerViewModel$dispatch$1;->d:I

    .line 63
    .line 64
    invoke-interface {p1, v1, p0}, Lc2/a1;->b(Ljava/lang/String;Lvc/c;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    if-ne p1, v0, :cond_4

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_4
    :goto_1
    check-cast p1, Lcom/friday/common/entity/PdfEntity;

    .line 72
    .line 73
    iget-object v1, p0, Lcom/friday/document/viewmodel/PdfViewerViewModel$dispatch$1;->f:Lcom/friday/document/viewmodel/PdfViewerViewModel;

    .line 74
    .line 75
    invoke-static {v1}, Lcom/friday/document/viewmodel/PdfViewerViewModel;->b(Lcom/friday/document/viewmodel/PdfViewerViewModel;)Lvd/l;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    new-instance v2, Lz2/m;

    .line 80
    .line 81
    invoke-direct {v2, p1}, Lz2/m;-><init>(Lcom/friday/common/entity/PdfEntity;)V

    .line 82
    .line 83
    .line 84
    invoke-static {p1}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    iput-object p1, p0, Lcom/friday/document/viewmodel/PdfViewerViewModel$dispatch$1;->c:Ljava/lang/Object;

    .line 89
    .line 90
    iput v3, p0, Lcom/friday/document/viewmodel/PdfViewerViewModel$dispatch$1;->d:I

    .line 91
    .line 92
    invoke-interface {v1, v2, p0}, Lvd/k;->emit(Ljava/lang/Object;Lvc/c;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    if-ne p1, v0, :cond_6

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_5
    instance-of p1, p1, Lcom/friday/document/viewmodel/a$b;

    .line 100
    .line 101
    if-eqz p1, :cond_7

    .line 102
    .line 103
    iget-object p1, p0, Lcom/friday/document/viewmodel/PdfViewerViewModel$dispatch$1;->f:Lcom/friday/document/viewmodel/PdfViewerViewModel;

    .line 104
    .line 105
    invoke-static {p1}, Lcom/friday/document/viewmodel/PdfViewerViewModel;->a(Lcom/friday/document/viewmodel/PdfViewerViewModel;)Lc2/a1;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    iget-object v1, p0, Lcom/friday/document/viewmodel/PdfViewerViewModel$dispatch$1;->e:Lcom/friday/document/viewmodel/a;

    .line 110
    .line 111
    check-cast v1, Lcom/friday/document/viewmodel/a$b;

    .line 112
    .line 113
    invoke-virtual {v1}, Lcom/friday/document/viewmodel/a$b;->a()Lcom/friday/common/entity/PdfEntity;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    iput v2, p0, Lcom/friday/document/viewmodel/PdfViewerViewModel$dispatch$1;->d:I

    .line 118
    .line 119
    invoke-interface {p1, v1, p0}, Lc2/a1;->a(Lcom/friday/common/entity/PdfEntity;Lvc/c;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    if-ne p1, v0, :cond_6

    .line 124
    .line 125
    :goto_2
    return-object v0

    .line 126
    :cond_6
    :goto_3
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 127
    .line 128
    return-object p1

    .line 129
    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 130
    .line 131
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 132
    .line 133
    .line 134
    throw p1
.end method
