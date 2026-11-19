.class public abstract Lcom/friday/document/databinding/FolderFragmentBinding;
.super Landroidx/databinding/ViewDataBinding;
.source "SourceFile"


# instance fields
.field public final c:Landroid/widget/FrameLayout;

.field public final d:Lcom/friday/document/databinding/LayoutFileFolderBinding;

.field public e:Landroidx/lifecycle/LiveData;

.field public f:Landroidx/lifecycle/LiveData;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/FrameLayout;Lcom/friday/document/databinding/LayoutFileFolderBinding;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lcom/friday/document/databinding/FolderFragmentBinding;->c:Landroid/widget/FrameLayout;

    .line 5
    .line 6
    iput-object p5, p0, Lcom/friday/document/databinding/FolderFragmentBinding;->d:Lcom/friday/document/databinding/LayoutFileFolderBinding;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public abstract a(Landroidx/lifecycle/LiveData;)V
.end method

.method public abstract c(Landroidx/lifecycle/LiveData;)V
.end method
