.class final Lcom/friday/document/view/preview/PdfPreviewFragment$onViewCreated$1$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/preview/PdfPreviewFragment$onViewCreated$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.friday.document.view.preview.PdfPreviewFragment$onViewCreated$1$1$1"
    f = "PdfPreviewFragment.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:I

.field public synthetic d:Ljava/lang/Object;

.field public final synthetic e:Lcom/friday/document/view/preview/PdfPreviewFragment;


# direct methods
.method public constructor <init>(Lcom/friday/document/view/preview/PdfPreviewFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/view/preview/PdfPreviewFragment$onViewCreated$1$1$1;->e:Lcom/friday/document/view/preview/PdfPreviewFragment;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 2

    .line 1
    new-instance v0, Lcom/friday/document/view/preview/PdfPreviewFragment$onViewCreated$1$1$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/document/view/preview/PdfPreviewFragment$onViewCreated$1$1$1;->e:Lcom/friday/document/view/preview/PdfPreviewFragment;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/friday/document/view/preview/PdfPreviewFragment$onViewCreated$1$1$1;-><init>(Lcom/friday/document/view/preview/PdfPreviewFragment;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcom/friday/document/view/preview/PdfPreviewFragment$onViewCreated$1$1$1;->d:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final g(Lz2/m;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/preview/PdfPreviewFragment$onViewCreated$1$1$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/friday/document/view/preview/PdfPreviewFragment$onViewCreated$1$1$1;

    .line 6
    .line 7
    sget-object p2, Lqc/q;->a:Lqc/q;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Lcom/friday/document/view/preview/PdfPreviewFragment$onViewCreated$1$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lz2/m;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/view/preview/PdfPreviewFragment$onViewCreated$1$1$1;->g(Lz2/m;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/friday/document/view/preview/PdfPreviewFragment$onViewCreated$1$1$1;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lz2/m;

    .line 4
    .line 5
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget v1, p0, Lcom/friday/document/view/preview/PdfPreviewFragment$onViewCreated$1$1$1;->c:I

    .line 9
    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lz2/m;->a()Lcom/friday/common/entity/PdfEntity;

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
    invoke-virtual {p1}, Lcom/friday/common/entity/PdfEntity;->getCurrentPage()I

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
    iget-object v1, p0, Lcom/friday/document/view/preview/PdfPreviewFragment$onViewCreated$1$1$1;->e:Lcom/friday/document/view/preview/PdfPreviewFragment;

    .line 29
    .line 30
    invoke-static {v1}, Lcom/friday/document/view/preview/PdfPreviewFragment;->s(Lcom/friday/document/view/preview/PdfPreviewFragment;)Lcom/friday/document/databinding/FragmentPreviewPdfBinding;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    iget-object v1, v1, Lcom/friday/document/databinding/FragmentPreviewPdfBinding;->c:Lcom/github/barteksc/pdfviewer/PDFView;

    .line 35
    .line 36
    new-instance v2, Ljava/io/File;

    .line 37
    .line 38
    iget-object v3, p0, Lcom/friday/document/view/preview/PdfPreviewFragment$onViewCreated$1$1$1;->e:Lcom/friday/document/view/preview/PdfPreviewFragment;

    .line 39
    .line 40
    invoke-static {v3}, Lcom/friday/document/view/preview/PdfPreviewFragment;->r(Lcom/friday/document/view/preview/PdfPreviewFragment;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v2}, Lcom/github/barteksc/pdfviewer/PDFView;->u(Ljava/io/File;)Lcom/github/barteksc/pdfviewer/PDFView$b;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {v1, p1}, Lcom/github/barteksc/pdfviewer/PDFView$b;->a(I)Lcom/github/barteksc/pdfviewer/PDFView$b;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iget-object v1, p0, Lcom/friday/document/view/preview/PdfPreviewFragment$onViewCreated$1$1$1;->e:Lcom/friday/document/view/preview/PdfPreviewFragment;

    .line 56
    .line 57
    invoke-virtual {p1, v1}, Lcom/github/barteksc/pdfviewer/PDFView$b;->e(Ll4/f;)Lcom/github/barteksc/pdfviewer/PDFView$b;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    const/4 v1, 0x1

    .line 62
    invoke-virtual {p1, v1}, Lcom/github/barteksc/pdfviewer/PDFView$b;->b(Z)Lcom/github/barteksc/pdfviewer/PDFView$b;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iget-object v1, p0, Lcom/friday/document/view/preview/PdfPreviewFragment$onViewCreated$1$1$1;->e:Lcom/friday/document/view/preview/PdfPreviewFragment;

    .line 67
    .line 68
    invoke-virtual {p1, v1}, Lcom/github/barteksc/pdfviewer/PDFView$b;->d(Ll4/d;)Lcom/github/barteksc/pdfviewer/PDFView$b;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    new-instance v1, Lcom/github/barteksc/pdfviewer/scroll/DefaultScrollHandle;

    .line 73
    .line 74
    iget-object v2, p0, Lcom/friday/document/view/preview/PdfPreviewFragment$onViewCreated$1$1$1;->e:Lcom/friday/document/view/preview/PdfPreviewFragment;

    .line 75
    .line 76
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-direct {v1, v2}, Lcom/github/barteksc/pdfviewer/scroll/DefaultScrollHandle;-><init>(Landroid/content/Context;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, v1}, Lcom/github/barteksc/pdfviewer/PDFView$b;->i(Ln4/a;)Lcom/github/barteksc/pdfviewer/PDFView$b;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    const/16 v1, 0xa

    .line 88
    .line 89
    invoke-virtual {p1, v1}, Lcom/github/barteksc/pdfviewer/PDFView$b;->j(I)Lcom/github/barteksc/pdfviewer/PDFView$b;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-virtual {p1, v0}, Lcom/github/barteksc/pdfviewer/PDFView$b;->g(Z)Lcom/github/barteksc/pdfviewer/PDFView$b;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {p1, v0}, Lcom/github/barteksc/pdfviewer/PDFView$b;->h(Z)Lcom/github/barteksc/pdfviewer/PDFView$b;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    iget-object v0, p0, Lcom/friday/document/view/preview/PdfPreviewFragment$onViewCreated$1$1$1;->e:Lcom/friday/document/view/preview/PdfPreviewFragment;

    .line 102
    .line 103
    invoke-virtual {p1, v0}, Lcom/github/barteksc/pdfviewer/PDFView$b;->f(Ll4/g;)Lcom/github/barteksc/pdfviewer/PDFView$b;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-virtual {p1}, Lcom/github/barteksc/pdfviewer/PDFView$b;->c()V

    .line 108
    .line 109
    .line 110
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 111
    .line 112
    return-object p1

    .line 113
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 114
    .line 115
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 116
    .line 117
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    throw p1
.end method
