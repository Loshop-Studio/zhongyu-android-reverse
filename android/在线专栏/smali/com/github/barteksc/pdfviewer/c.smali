.class Lcom/github/barteksc/pdfviewer/c;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Throwable;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Z

.field private b:Lcom/github/barteksc/pdfviewer/PDFView;

.field private c:Landroid/content/Context;

.field private d:Lcom/shockwave/pdfium/PdfiumCore;

.field private e:Lcom/shockwave/pdfium/a;

.field private f:Ljava/lang/String;

.field private g:Lq1/a;

.field private h:I

.field private i:I

.field private j:I


# direct methods
.method constructor <init>(Lq1/a;Ljava/lang/String;Lcom/github/barteksc/pdfviewer/PDFView;Lcom/shockwave/pdfium/PdfiumCore;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/github/barteksc/pdfviewer/c;->g:Lq1/a;

    .line 3
    iput p5, p0, Lcom/github/barteksc/pdfviewer/c;->h:I

    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Lcom/github/barteksc/pdfviewer/c;->a:Z

    .line 5
    iput-object p3, p0, Lcom/github/barteksc/pdfviewer/c;->b:Lcom/github/barteksc/pdfviewer/PDFView;

    .line 6
    iput-object p2, p0, Lcom/github/barteksc/pdfviewer/c;->f:Ljava/lang/String;

    .line 7
    iput-object p4, p0, Lcom/github/barteksc/pdfviewer/c;->d:Lcom/shockwave/pdfium/PdfiumCore;

    .line 8
    invoke-virtual {p3}, Landroid/widget/RelativeLayout;->getContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/github/barteksc/pdfviewer/c;->c:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method protected varargs a([Ljava/lang/Void;)Ljava/lang/Throwable;
    .locals 3

    .line 1
    :try_start_0
    iget-object p1, p0, Lcom/github/barteksc/pdfviewer/c;->g:Lq1/a;

    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/c;->c:Landroid/content/Context;

    iget-object v1, p0, Lcom/github/barteksc/pdfviewer/c;->d:Lcom/shockwave/pdfium/PdfiumCore;

    iget-object v2, p0, Lcom/github/barteksc/pdfviewer/c;->f:Ljava/lang/String;

    invoke-interface {p1, v0, v1, v2}, Lq1/a;->a(Landroid/content/Context;Lcom/shockwave/pdfium/PdfiumCore;Ljava/lang/String;)Lcom/shockwave/pdfium/a;

    move-result-object p1

    iput-object p1, p0, Lcom/github/barteksc/pdfviewer/c;->e:Lcom/shockwave/pdfium/a;

    .line 2
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/c;->d:Lcom/shockwave/pdfium/PdfiumCore;

    iget v1, p0, Lcom/github/barteksc/pdfviewer/c;->h:I

    invoke-virtual {v0, p1, v1}, Lcom/shockwave/pdfium/PdfiumCore;->i(Lcom/shockwave/pdfium/a;I)J

    .line 3
    iget-object p1, p0, Lcom/github/barteksc/pdfviewer/c;->d:Lcom/shockwave/pdfium/PdfiumCore;

    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/c;->e:Lcom/shockwave/pdfium/a;

    iget v1, p0, Lcom/github/barteksc/pdfviewer/c;->h:I

    invoke-virtual {p1, v0, v1}, Lcom/shockwave/pdfium/PdfiumCore;->f(Lcom/shockwave/pdfium/a;I)I

    move-result p1

    iput p1, p0, Lcom/github/barteksc/pdfviewer/c;->i:I

    .line 4
    iget-object p1, p0, Lcom/github/barteksc/pdfviewer/c;->d:Lcom/shockwave/pdfium/PdfiumCore;

    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/c;->e:Lcom/shockwave/pdfium/a;

    iget v1, p0, Lcom/github/barteksc/pdfviewer/c;->h:I

    invoke-virtual {p1, v0, v1}, Lcom/shockwave/pdfium/PdfiumCore;->e(Lcom/shockwave/pdfium/a;I)I

    move-result p1

    iput p1, p0, Lcom/github/barteksc/pdfviewer/c;->j:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x0

    return-object p1

    :catchall_0
    move-exception p1

    return-object p1
.end method

.method protected b(Ljava/lang/Throwable;)V
    .locals 3

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/c;->b:Lcom/github/barteksc/pdfviewer/PDFView;

    invoke-virtual {v0, p1}, Lcom/github/barteksc/pdfviewer/PDFView;->L(Ljava/lang/Throwable;)V

    return-void

    .line 2
    :cond_0
    iget-boolean p1, p0, Lcom/github/barteksc/pdfviewer/c;->a:Z

    if-nez p1, :cond_1

    .line 3
    iget-object p1, p0, Lcom/github/barteksc/pdfviewer/c;->b:Lcom/github/barteksc/pdfviewer/PDFView;

    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/c;->e:Lcom/shockwave/pdfium/a;

    iget v1, p0, Lcom/github/barteksc/pdfviewer/c;->i:I

    iget v2, p0, Lcom/github/barteksc/pdfviewer/c;->j:I

    invoke-virtual {p1, v0, v1, v2}, Lcom/github/barteksc/pdfviewer/PDFView;->K(Lcom/shockwave/pdfium/a;II)V

    :cond_1
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/github/barteksc/pdfviewer/c;->a([Ljava/lang/Void;)Ljava/lang/Throwable;

    move-result-object p1

    return-object p1
.end method

.method protected onCancelled()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/github/barteksc/pdfviewer/c;->a:Z

    return-void
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lcom/github/barteksc/pdfviewer/c;->b(Ljava/lang/Throwable;)V

    return-void
.end method
