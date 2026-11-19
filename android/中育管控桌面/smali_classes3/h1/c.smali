.class public Lh1/c;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Lcom/github/barteksc/pdfviewer/PDFView;

.field public c:Landroid/content/Context;

.field public d:Lcom/shockwave/pdfium/PdfiumCore;

.field public e:Lcom/shockwave/pdfium/a;

.field public f:Ljava/lang/String;

.field public g:Ll1/a;

.field public h:I

.field public i:I

.field public j:I


# direct methods
.method public constructor <init>(Ll1/a;Ljava/lang/String;Lcom/github/barteksc/pdfviewer/PDFView;Lcom/shockwave/pdfium/PdfiumCore;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh1/c;->g:Ll1/a;

    .line 5
    .line 6
    iput p5, p0, Lh1/c;->h:I

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-boolean p1, p0, Lh1/c;->a:Z

    .line 10
    .line 11
    iput-object p3, p0, Lh1/c;->b:Lcom/github/barteksc/pdfviewer/PDFView;

    .line 12
    .line 13
    iput-object p2, p0, Lh1/c;->f:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p4, p0, Lh1/c;->d:Lcom/shockwave/pdfium/PdfiumCore;

    .line 16
    .line 17
    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, Lh1/c;->c:Landroid/content/Context;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public varargs a([Ljava/lang/Void;)Ljava/lang/Throwable;
    .locals 3

    .line 1
    :try_start_0
    iget-object p1, p0, Lh1/c;->g:Ll1/a;

    .line 2
    .line 3
    iget-object v0, p0, Lh1/c;->c:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v1, p0, Lh1/c;->d:Lcom/shockwave/pdfium/PdfiumCore;

    .line 6
    .line 7
    iget-object v2, p0, Lh1/c;->f:Ljava/lang/String;

    .line 8
    .line 9
    invoke-interface {p1, v0, v1, v2}, Ll1/a;->a(Landroid/content/Context;Lcom/shockwave/pdfium/PdfiumCore;Ljava/lang/String;)Lcom/shockwave/pdfium/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Lh1/c;->e:Lcom/shockwave/pdfium/a;

    .line 14
    .line 15
    iget-object v0, p0, Lh1/c;->d:Lcom/shockwave/pdfium/PdfiumCore;

    .line 16
    .line 17
    iget v1, p0, Lh1/c;->h:I

    .line 18
    .line 19
    invoke-virtual {v0, p1, v1}, Lcom/shockwave/pdfium/PdfiumCore;->i(Lcom/shockwave/pdfium/a;I)J

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lh1/c;->d:Lcom/shockwave/pdfium/PdfiumCore;

    .line 23
    .line 24
    iget-object v0, p0, Lh1/c;->e:Lcom/shockwave/pdfium/a;

    .line 25
    .line 26
    iget v1, p0, Lh1/c;->h:I

    .line 27
    .line 28
    invoke-virtual {p1, v0, v1}, Lcom/shockwave/pdfium/PdfiumCore;->f(Lcom/shockwave/pdfium/a;I)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    iput p1, p0, Lh1/c;->i:I

    .line 33
    .line 34
    iget-object p1, p0, Lh1/c;->d:Lcom/shockwave/pdfium/PdfiumCore;

    .line 35
    .line 36
    iget-object v0, p0, Lh1/c;->e:Lcom/shockwave/pdfium/a;

    .line 37
    .line 38
    iget v1, p0, Lh1/c;->h:I

    .line 39
    .line 40
    invoke-virtual {p1, v0, v1}, Lcom/shockwave/pdfium/PdfiumCore;->e(Lcom/shockwave/pdfium/a;I)I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    iput p1, p0, Lh1/c;->j:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    const/4 p1, 0x0

    .line 47
    return-object p1

    .line 48
    :catchall_0
    move-exception p1

    .line 49
    return-object p1
.end method

.method public b(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lh1/c;->b:Lcom/github/barteksc/pdfviewer/PDFView;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/github/barteksc/pdfviewer/PDFView;->K(Ljava/lang/Throwable;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-boolean p1, p0, Lh1/c;->a:Z

    .line 10
    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    iget-object p1, p0, Lh1/c;->b:Lcom/github/barteksc/pdfviewer/PDFView;

    .line 14
    .line 15
    iget-object v0, p0, Lh1/c;->e:Lcom/shockwave/pdfium/a;

    .line 16
    .line 17
    iget v1, p0, Lh1/c;->i:I

    .line 18
    .line 19
    iget v2, p0, Lh1/c;->j:I

    .line 20
    .line 21
    invoke-virtual {p1, v0, v1, v2}, Lcom/github/barteksc/pdfviewer/PDFView;->J(Lcom/shockwave/pdfium/a;II)V

    .line 22
    .line 23
    .line 24
    :cond_1
    return-void
.end method

.method public bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, [Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lh1/c;->a([Ljava/lang/Void;)Ljava/lang/Throwable;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public onCancelled()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lh1/c;->a:Z

    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lh1/c;->b(Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
