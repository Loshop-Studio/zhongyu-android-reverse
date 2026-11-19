.class public abstract Lcom/friday/document/databinding/ItemNoteListBinding;
.super Landroidx/databinding/ViewDataBinding;
.source "SourceFile"


# instance fields
.field public final c:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final d:Landroidx/appcompat/widget/AppCompatImageView;

.field public final e:Landroid/widget/ImageView;

.field public final f:Landroid/widget/ImageView;

.field public final g:Landroid/widget/ImageView;

.field public final h:Landroid/widget/TextView;

.field public final i:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILandroidx/constraintlayout/widget/ConstraintLayout;Landroidx/appcompat/widget/AppCompatImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lcom/friday/document/databinding/ItemNoteListBinding;->c:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 5
    .line 6
    iput-object p5, p0, Lcom/friday/document/databinding/ItemNoteListBinding;->d:Landroidx/appcompat/widget/AppCompatImageView;

    .line 7
    .line 8
    iput-object p6, p0, Lcom/friday/document/databinding/ItemNoteListBinding;->e:Landroid/widget/ImageView;

    .line 9
    .line 10
    iput-object p7, p0, Lcom/friday/document/databinding/ItemNoteListBinding;->f:Landroid/widget/ImageView;

    .line 11
    .line 12
    iput-object p8, p0, Lcom/friday/document/databinding/ItemNoteListBinding;->g:Landroid/widget/ImageView;

    .line 13
    .line 14
    iput-object p9, p0, Lcom/friday/document/databinding/ItemNoteListBinding;->h:Landroid/widget/TextView;

    .line 15
    .line 16
    iput-object p10, p0, Lcom/friday/document/databinding/ItemNoteListBinding;->i:Landroid/widget/TextView;

    .line 17
    .line 18
    return-void
.end method

.method public static a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/friday/document/databinding/ItemNoteListBinding;
    .locals 1

    .line 1
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0, p1, p2, v0}, Lcom/friday/document/databinding/ItemNoteListBinding;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lcom/friday/document/databinding/ItemNoteListBinding;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lcom/friday/document/databinding/ItemNoteListBinding;
    .locals 1

    .line 1
    sget v0, Lcom/friday/document/R$layout;->item_note_list:I

    .line 2
    .line 3
    invoke-static {p0, v0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/friday/document/databinding/ItemNoteListBinding;

    .line 8
    .line 9
    return-object p0
.end method
