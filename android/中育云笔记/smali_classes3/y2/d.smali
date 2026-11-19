.class public final synthetic Ly2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly2/d;->c:Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ly2/d;->c:Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;->s(Lcom/friday/document/view/viewer/ImagePreviewDialogFragment;Landroid/view/View;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
