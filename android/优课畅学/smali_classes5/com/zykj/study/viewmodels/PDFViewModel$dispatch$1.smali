.class final Lcom/zykj/study/viewmodels/PDFViewModel$dispatch$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/viewmodels/PDFViewModel;->c(Lcom/zykj/study/viewmodels/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lx7/p;"
    }
.end annotation

.annotation runtime Lo7/d;
    c = "com.zykj.study.viewmodels.PDFViewModel$dispatch$1"
    f = "PDFViewModel.kt"
    l = {
        0x1a,
        0x1b,
        0x1e
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:Ljava/lang/Object;

.field public b:I

.field public final synthetic c:Lcom/zykj/study/viewmodels/a;

.field public final synthetic d:Lcom/zykj/study/viewmodels/PDFViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/study/viewmodels/a;Lcom/zykj/study/viewmodels/PDFViewModel;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/viewmodels/PDFViewModel$dispatch$1;->c:Lcom/zykj/study/viewmodels/a;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/viewmodels/PDFViewModel$dispatch$1;->d:Lcom/zykj/study/viewmodels/PDFViewModel;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 2

    .line 1
    new-instance p1, Lcom/zykj/study/viewmodels/PDFViewModel$dispatch$1;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/study/viewmodels/PDFViewModel$dispatch$1;->c:Lcom/zykj/study/viewmodels/a;

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/study/viewmodels/PDFViewModel$dispatch$1;->d:Lcom/zykj/study/viewmodels/PDFViewModel;

    .line 6
    .line 7
    invoke-direct {p1, v0, v1, p2}, Lcom/zykj/study/viewmodels/PDFViewModel$dispatch$1;-><init>(Lcom/zykj/study/viewmodels/a;Lcom/zykj/study/viewmodels/PDFViewModel;Lm7/c;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method public final invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/PDFViewModel$dispatch$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    move-result-object p1

    check-cast p1, Lcom/zykj/study/viewmodels/PDFViewModel$dispatch$1;

    sget-object p2, Lh7/p;->a:Lh7/p;

    invoke-virtual {p1, p2}, Lcom/zykj/study/viewmodels/PDFViewModel$dispatch$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Li8/b0;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/viewmodels/PDFViewModel$dispatch$1;->invoke(Li8/b0;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lcom/zykj/study/viewmodels/PDFViewModel$dispatch$1;->b:I

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
    iget-object v0, p0, Lcom/zykj/study/viewmodels/PDFViewModel$dispatch$1;->a:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Lcom/zykj/study/data/PdfEntity;

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
    iget-object p1, p0, Lcom/zykj/study/viewmodels/PDFViewModel$dispatch$1;->c:Lcom/zykj/study/viewmodels/a;

    .line 43
    .line 44
    instance-of v1, p1, Lcom/zykj/study/viewmodels/a$a;

    .line 45
    .line 46
    if-eqz v1, :cond_5

    .line 47
    .line 48
    iget-object p1, p0, Lcom/zykj/study/viewmodels/PDFViewModel$dispatch$1;->d:Lcom/zykj/study/viewmodels/PDFViewModel;

    .line 49
    .line 50
    invoke-static {p1}, Lcom/zykj/study/viewmodels/PDFViewModel;->a(Lcom/zykj/study/viewmodels/PDFViewModel;)Lcom/zykj/study/data/PdfDao;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iget-object v1, p0, Lcom/zykj/study/viewmodels/PDFViewModel$dispatch$1;->c:Lcom/zykj/study/viewmodels/a;

    .line 55
    .line 56
    check-cast v1, Lcom/zykj/study/viewmodels/a$a;

    .line 57
    .line 58
    invoke-virtual {v1}, Lcom/zykj/study/viewmodels/a$a;->a()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    iput v4, p0, Lcom/zykj/study/viewmodels/PDFViewModel$dispatch$1;->b:I

    .line 63
    .line 64
    invoke-interface {p1, v1, p0}, Lcom/zykj/study/data/PdfDao;->queryPdf(Ljava/lang/String;Lm7/c;)Ljava/lang/Object;

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
    check-cast p1, Lcom/zykj/study/data/PdfEntity;

    .line 72
    .line 73
    iget-object v1, p0, Lcom/zykj/study/viewmodels/PDFViewModel$dispatch$1;->d:Lcom/zykj/study/viewmodels/PDFViewModel;

    .line 74
    .line 75
    invoke-static {v1}, Lcom/zykj/study/viewmodels/PDFViewModel;->b(Lcom/zykj/study/viewmodels/PDFViewModel;)Ll8/g;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    new-instance v2, Lg5/k2;

    .line 80
    .line 81
    invoke-direct {v2, p1}, Lg5/k2;-><init>(Lcom/zykj/study/data/PdfEntity;)V

    .line 82
    .line 83
    .line 84
    invoke-static {p1}, Lo7/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    iput-object p1, p0, Lcom/zykj/study/viewmodels/PDFViewModel$dispatch$1;->a:Ljava/lang/Object;

    .line 89
    .line 90
    iput v3, p0, Lcom/zykj/study/viewmodels/PDFViewModel$dispatch$1;->b:I

    .line 91
    .line 92
    invoke-interface {v1, v2, p0}, Ll8/g;->emit(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;

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
    instance-of p1, p1, Lcom/zykj/study/viewmodels/a$b;

    .line 100
    .line 101
    if-eqz p1, :cond_7

    .line 102
    .line 103
    iget-object p1, p0, Lcom/zykj/study/viewmodels/PDFViewModel$dispatch$1;->d:Lcom/zykj/study/viewmodels/PDFViewModel;

    .line 104
    .line 105
    invoke-static {p1}, Lcom/zykj/study/viewmodels/PDFViewModel;->a(Lcom/zykj/study/viewmodels/PDFViewModel;)Lcom/zykj/study/data/PdfDao;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    iget-object v1, p0, Lcom/zykj/study/viewmodels/PDFViewModel$dispatch$1;->c:Lcom/zykj/study/viewmodels/a;

    .line 110
    .line 111
    check-cast v1, Lcom/zykj/study/viewmodels/a$b;

    .line 112
    .line 113
    invoke-virtual {v1}, Lcom/zykj/study/viewmodels/a$b;->a()Lcom/zykj/study/data/PdfEntity;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    iput v2, p0, Lcom/zykj/study/viewmodels/PDFViewModel$dispatch$1;->b:I

    .line 118
    .line 119
    invoke-interface {p1, v1, p0}, Lcom/zykj/study/data/PdfDao;->insertPdf(Lcom/zykj/study/data/PdfEntity;Lm7/c;)Ljava/lang/Object;

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
    sget-object p1, Lh7/p;->a:Lh7/p;

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
