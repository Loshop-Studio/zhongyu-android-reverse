.class public abstract Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;
.super Landroidx/databinding/ViewDataBinding;
.source "SourceFile"


# instance fields
.field public final c:Landroid/widget/ImageView;

.field public final d:Landroid/widget/LinearLayout;

.field public final e:Landroid/widget/TextView;

.field public final f:Landroid/widget/TextView;

.field public final g:Landroid/widget/TextView;

.field public final h:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/ImageView;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->c:Landroid/widget/ImageView;

    .line 5
    .line 6
    iput-object p5, p0, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->d:Landroid/widget/LinearLayout;

    .line 7
    .line 8
    iput-object p6, p0, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->e:Landroid/widget/TextView;

    .line 9
    .line 10
    iput-object p7, p0, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->f:Landroid/widget/TextView;

    .line 11
    .line 12
    iput-object p8, p0, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->g:Landroid/widget/TextView;

    .line 13
    .line 14
    iput-object p9, p0, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->h:Landroid/widget/TextView;

    .line 15
    .line 16
    return-void
.end method

.method public static a(Landroid/view/LayoutInflater;)Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;
    .locals 1

    .line 1
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0, v0}, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;->c(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static c(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;
    .locals 3

    .line 1
    sget v0, Lcom/friday/common/R$layout;->popup_window_note_info:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-static {p0, v0, v1, v2, p1}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lcom/friday/common/databinding/PopupWindowNoteInfoBinding;

    .line 10
    .line 11
    return-object p0
.end method
