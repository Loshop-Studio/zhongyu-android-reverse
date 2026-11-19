.class public abstract Lcom/zykj/mistake/databinding/FragmentNoteBinding;
.super Landroidx/databinding/ViewDataBinding;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/appcompat/widget/AppCompatImageView;

.field public final b:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Landroidx/databinding/ViewDataBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    .line 3
    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/mistake/databinding/FragmentNoteBinding;->a:Landroidx/appcompat/widget/AppCompatImageView;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/zykj/mistake/databinding/FragmentNoteBinding;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    return-void
.end method
