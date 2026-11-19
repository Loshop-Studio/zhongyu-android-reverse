.class public final synthetic Ly2/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic c:Lcom/friday/document/view/viewer/PdfViewerActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/document/view/viewer/PdfViewerActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly2/j;->c:Lcom/friday/document/view/viewer/PdfViewerActivity;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ly2/j;->c:Lcom/friday/document/view/viewer/PdfViewerActivity;

    invoke-static {v0, p1}, Lcom/friday/document/view/viewer/PdfViewerActivity;->N(Lcom/friday/document/view/viewer/PdfViewerActivity;Landroid/view/View;)V

    return-void
.end method
