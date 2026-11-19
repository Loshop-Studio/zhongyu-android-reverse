.class Lcom/github/barteksc/pdfviewer/PDFView$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/github/barteksc/pdfviewer/PDFView$b;->j()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/github/barteksc/pdfviewer/PDFView$b;


# direct methods
.method constructor <init>(Lcom/github/barteksc/pdfviewer/PDFView$b;)V
    .locals 0

    iput-object p1, p0, Lcom/github/barteksc/pdfviewer/PDFView$b$a;->a:Lcom/github/barteksc/pdfviewer/PDFView$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b$a;->a:Lcom/github/barteksc/pdfviewer/PDFView$b;

    invoke-static {v0}, Lcom/github/barteksc/pdfviewer/PDFView$b;->a(Lcom/github/barteksc/pdfviewer/PDFView$b;)[I

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b$a;->a:Lcom/github/barteksc/pdfviewer/PDFView$b;

    iget-object v1, v0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    invoke-static {v0}, Lcom/github/barteksc/pdfviewer/PDFView$b;->b(Lcom/github/barteksc/pdfviewer/PDFView$b;)Lq1/a;

    move-result-object v2

    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b$a;->a:Lcom/github/barteksc/pdfviewer/PDFView$b;

    invoke-static {v0}, Lcom/github/barteksc/pdfviewer/PDFView$b;->c(Lcom/github/barteksc/pdfviewer/PDFView$b;)Ljava/lang/String;

    move-result-object v3

    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b$a;->a:Lcom/github/barteksc/pdfviewer/PDFView$b;

    invoke-static {v0}, Lcom/github/barteksc/pdfviewer/PDFView$b;->d(Lcom/github/barteksc/pdfviewer/PDFView$b;)Ln1/c;

    move-result-object v4

    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b$a;->a:Lcom/github/barteksc/pdfviewer/PDFView$b;

    invoke-static {v0}, Lcom/github/barteksc/pdfviewer/PDFView$b;->e(Lcom/github/barteksc/pdfviewer/PDFView$b;)Ln1/b;

    move-result-object v5

    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b$a;->a:Lcom/github/barteksc/pdfviewer/PDFView$b;

    invoke-static {v0}, Lcom/github/barteksc/pdfviewer/PDFView$b;->a(Lcom/github/barteksc/pdfviewer/PDFView$b;)[I

    move-result-object v6

    invoke-static/range {v1 .. v6}, Lcom/github/barteksc/pdfviewer/PDFView;->f(Lcom/github/barteksc/pdfviewer/PDFView;Lq1/a;Ljava/lang/String;Ln1/c;Ln1/b;[I)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/PDFView$b$a;->a:Lcom/github/barteksc/pdfviewer/PDFView$b;

    iget-object v1, v0, Lcom/github/barteksc/pdfviewer/PDFView$b;->v:Lcom/github/barteksc/pdfviewer/PDFView;

    invoke-static {v0}, Lcom/github/barteksc/pdfviewer/PDFView$b;->b(Lcom/github/barteksc/pdfviewer/PDFView$b;)Lq1/a;

    move-result-object v0

    iget-object v2, p0, Lcom/github/barteksc/pdfviewer/PDFView$b$a;->a:Lcom/github/barteksc/pdfviewer/PDFView$b;

    invoke-static {v2}, Lcom/github/barteksc/pdfviewer/PDFView$b;->c(Lcom/github/barteksc/pdfviewer/PDFView$b;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/github/barteksc/pdfviewer/PDFView$b$a;->a:Lcom/github/barteksc/pdfviewer/PDFView$b;

    invoke-static {v3}, Lcom/github/barteksc/pdfviewer/PDFView$b;->d(Lcom/github/barteksc/pdfviewer/PDFView$b;)Ln1/c;

    move-result-object v3

    iget-object v4, p0, Lcom/github/barteksc/pdfviewer/PDFView$b$a;->a:Lcom/github/barteksc/pdfviewer/PDFView$b;

    invoke-static {v4}, Lcom/github/barteksc/pdfviewer/PDFView$b;->e(Lcom/github/barteksc/pdfviewer/PDFView$b;)Ln1/b;

    move-result-object v4

    invoke-static {v1, v0, v2, v3, v4}, Lcom/github/barteksc/pdfviewer/PDFView;->h(Lcom/github/barteksc/pdfviewer/PDFView;Lq1/a;Ljava/lang/String;Ln1/c;Ln1/b;)V

    :goto_0
    return-void
.end method
