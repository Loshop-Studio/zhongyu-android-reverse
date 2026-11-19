.class public final synthetic Lu2/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/q;


# instance fields
.field public final synthetic c:Lcom/friday/document/view/RecycleBinPreviewFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/document/view/RecycleBinPreviewFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu2/c0;->c:Lcom/friday/document/view/RecycleBinPreviewFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lu2/c0;->c:Lcom/friday/document/view/RecycleBinPreviewFragment;

    check-cast p1, Landroid/view/View;

    check-cast p2, Landroid/widget/PopupWindow;

    check-cast p3, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;

    invoke-static {v0, p1, p2, p3}, Lcom/friday/document/view/RecycleBinPreviewFragment;->t(Lcom/friday/document/view/RecycleBinPreviewFragment;Landroid/view/View;Landroid/widget/PopupWindow;Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
