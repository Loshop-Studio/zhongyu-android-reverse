.class final Lcom/zykj/study/ui/PdfFragment$initView$2$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/PdfFragment$initView$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.zykj.study.ui.PdfFragment$initView$2$1"
    f = "PdfFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public a:I

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lcom/zykj/study/ui/PdfFragment;


# direct methods
.method public constructor <init>(Lcom/zykj/study/ui/PdfFragment;Lm7/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/PdfFragment$initView$2$1;->c:Lcom/zykj/study/ui/PdfFragment;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILm7/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final c(Lg5/k2;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/PdfFragment$initView$2$1;->create(Ljava/lang/Object;Lm7/c;)Lm7/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/zykj/study/ui/PdfFragment$initView$2$1;

    .line 6
    .line 7
    sget-object p2, Lh7/p;->a:Lh7/p;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lcom/zykj/study/ui/PdfFragment$initView$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final create(Ljava/lang/Object;Lm7/c;)Lm7/c;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/study/ui/PdfFragment$initView$2$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/zykj/study/ui/PdfFragment$initView$2$1;->c:Lcom/zykj/study/ui/PdfFragment;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/zykj/study/ui/PdfFragment$initView$2$1;-><init>(Lcom/zykj/study/ui/PdfFragment;Lm7/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcom/zykj/study/ui/PdfFragment$initView$2$1;->b:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lg5/k2;

    check-cast p2, Lm7/c;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/study/ui/PdfFragment$initView$2$1;->c(Lg5/k2;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/PdfFragment$initView$2$1;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lg5/k2;

    .line 4
    .line 5
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/zykj/study/ui/PdfFragment$initView$2$1;->a:I

    .line 9
    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lg5/k2;->a()Lcom/zykj/study/data/PdfEntity;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const/4 v0, 0x0

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/zykj/study/data/PdfEntity;->getCurrentPage()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move p1, v0

    .line 28
    :goto_0
    iget-object v1, p0, Lcom/zykj/study/ui/PdfFragment$initView$2$1;->c:Lcom/zykj/study/ui/PdfFragment;

    .line 29
    .line 30
    invoke-virtual {v1}, Lcom/zykj/base/BaseFragment;->getMBindView()Landroidx/databinding/ViewDataBinding;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Lcom/zykj/study/databinding/FragmentPdfBinding;

    .line 35
    .line 36
    iget-object v1, v1, Lcom/zykj/study/databinding/FragmentPdfBinding;->pdfView:Lcom/github/barteksc/pdfviewer/PDFView;

    .line 37
    .line 38
    new-instance v2, Ljava/io/File;

    .line 39
    .line 40
    iget-object v3, p0, Lcom/zykj/study/ui/PdfFragment$initView$2$1;->c:Lcom/zykj/study/ui/PdfFragment;

    .line 41
    .line 42
    invoke-static {v3}, Lcom/zykj/study/ui/PdfFragment;->g(Lcom/zykj/study/ui/PdfFragment;)Lcom/zykj/study/ui/PdfFragmentArgs;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v3}, Lcom/zykj/study/ui/PdfFragmentArgs;->a()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v2}, Lcom/github/barteksc/pdfviewer/PDFView;->u(Ljava/io/File;)Lcom/github/barteksc/pdfviewer/PDFView$b;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v1, p1}, Lcom/github/barteksc/pdfviewer/PDFView$b;->a(I)Lcom/github/barteksc/pdfviewer/PDFView$b;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    iget-object v1, p0, Lcom/zykj/study/ui/PdfFragment$initView$2$1;->c:Lcom/zykj/study/ui/PdfFragment;

    .line 62
    .line 63
    invoke-virtual {p1, v1}, Lcom/github/barteksc/pdfviewer/PDFView$b;->e(Lz0/f;)Lcom/github/barteksc/pdfviewer/PDFView$b;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    const/4 v1, 0x1

    .line 68
    invoke-virtual {p1, v1}, Lcom/github/barteksc/pdfviewer/PDFView$b;->b(Z)Lcom/github/barteksc/pdfviewer/PDFView$b;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    iget-object v1, p0, Lcom/zykj/study/ui/PdfFragment$initView$2$1;->c:Lcom/zykj/study/ui/PdfFragment;

    .line 73
    .line 74
    invoke-virtual {p1, v1}, Lcom/github/barteksc/pdfviewer/PDFView$b;->d(Lz0/d;)Lcom/github/barteksc/pdfviewer/PDFView$b;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    new-instance v1, Lb1/a;

    .line 79
    .line 80
    iget-object v2, p0, Lcom/zykj/study/ui/PdfFragment$initView$2$1;->c:Lcom/zykj/study/ui/PdfFragment;

    .line 81
    .line 82
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-direct {v1, v2}, Lb1/a;-><init>(Landroid/content/Context;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, v1}, Lcom/github/barteksc/pdfviewer/PDFView$b;->i(Lb1/b;)Lcom/github/barteksc/pdfviewer/PDFView$b;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    const/16 v1, 0xa

    .line 94
    .line 95
    invoke-virtual {p1, v1}, Lcom/github/barteksc/pdfviewer/PDFView$b;->j(I)Lcom/github/barteksc/pdfviewer/PDFView$b;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {p1, v0}, Lcom/github/barteksc/pdfviewer/PDFView$b;->g(Z)Lcom/github/barteksc/pdfviewer/PDFView$b;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {p1, v0}, Lcom/github/barteksc/pdfviewer/PDFView$b;->h(Z)Lcom/github/barteksc/pdfviewer/PDFView$b;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    iget-object v0, p0, Lcom/zykj/study/ui/PdfFragment$initView$2$1;->c:Lcom/zykj/study/ui/PdfFragment;

    .line 108
    .line 109
    invoke-virtual {p1, v0}, Lcom/github/barteksc/pdfviewer/PDFView$b;->f(Lz0/g;)Lcom/github/barteksc/pdfviewer/PDFView$b;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-virtual {p1}, Lcom/github/barteksc/pdfviewer/PDFView$b;->c()V

    .line 114
    .line 115
    .line 116
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 117
    .line 118
    return-object p1

    .line 119
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 120
    .line 121
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 122
    .line 123
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    throw p1
.end method
