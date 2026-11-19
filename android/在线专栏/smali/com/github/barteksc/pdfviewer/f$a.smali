.class Lcom/github/barteksc/pdfviewer/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/github/barteksc/pdfviewer/f;->handleMessage(Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo1/a;

.field final synthetic b:Lcom/github/barteksc/pdfviewer/f;


# direct methods
.method constructor <init>(Lcom/github/barteksc/pdfviewer/f;Lo1/a;)V
    .locals 0

    iput-object p1, p0, Lcom/github/barteksc/pdfviewer/f$a;->b:Lcom/github/barteksc/pdfviewer/f;

    iput-object p2, p0, Lcom/github/barteksc/pdfviewer/f$a;->a:Lo1/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/github/barteksc/pdfviewer/f$a;->b:Lcom/github/barteksc/pdfviewer/f;

    invoke-static {v0}, Lcom/github/barteksc/pdfviewer/f;->a(Lcom/github/barteksc/pdfviewer/f;)Lcom/github/barteksc/pdfviewer/PDFView;

    move-result-object v0

    iget-object v1, p0, Lcom/github/barteksc/pdfviewer/f$a;->a:Lo1/a;

    invoke-virtual {v0, v1}, Lcom/github/barteksc/pdfviewer/PDFView;->R(Lo1/a;)V

    return-void
.end method
