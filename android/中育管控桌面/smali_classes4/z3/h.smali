.class public final synthetic Lz3/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li1/c;


# instance fields
.field public final synthetic a:Lcom/github/barteksc/pdfviewer/PDFView;

.field public final synthetic b:Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment;

.field public final synthetic c:F


# direct methods
.method public synthetic constructor <init>(Lcom/github/barteksc/pdfviewer/PDFView;Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment;F)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz3/h;->a:Lcom/github/barteksc/pdfviewer/PDFView;

    iput-object p2, p0, Lz3/h;->b:Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment;

    iput p3, p0, Lz3/h;->c:F

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lz3/h;->a:Lcom/github/barteksc/pdfviewer/PDFView;

    iget-object v1, p0, Lz3/h;->b:Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment;

    iget v2, p0, Lz3/h;->c:F

    invoke-static {v0, v1, v2, p1}, Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment;->f(Lcom/github/barteksc/pdfviewer/PDFView;Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment;FI)V

    return-void
.end method
