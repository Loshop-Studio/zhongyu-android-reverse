.class public final synthetic Lc2/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln1/c;


# instance fields
.field public final synthetic a:Lcom/github/barteksc/pdfviewer/PDFView;

.field public final synthetic b:Lc2/t;

.field public final synthetic c:F


# direct methods
.method public synthetic constructor <init>(Lcom/github/barteksc/pdfviewer/PDFView;Lc2/t;F)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc2/p;->a:Lcom/github/barteksc/pdfviewer/PDFView;

    iput-object p2, p0, Lc2/p;->b:Lc2/t;

    iput p3, p0, Lc2/p;->c:F

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 3

    iget-object v0, p0, Lc2/p;->a:Lcom/github/barteksc/pdfviewer/PDFView;

    iget-object v1, p0, Lc2/p;->b:Lc2/t;

    iget v2, p0, Lc2/p;->c:F

    invoke-static {v0, v1, v2, p1}, Lc2/t;->f(Lcom/github/barteksc/pdfviewer/PDFView;Lc2/t;FI)V

    return-void
.end method
