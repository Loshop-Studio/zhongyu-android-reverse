.class public final synthetic Ly2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# instance fields
.field public final synthetic c:Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly2/e;->c:Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;

    return-void
.end method


# virtual methods
.method public final onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Ly2/e;->c:Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;

    invoke-static {v0, p1, p2, p3}, Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;->r(Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
