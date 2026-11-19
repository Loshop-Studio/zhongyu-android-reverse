.class public abstract Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;
.super Landroidx/databinding/ViewDataBinding;
.source "SourceFile"


# instance fields
.field public final a:Landroidx/constraintlayout/widget/ConstraintLayout;

.field public final b:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

.field public final c:Landroid/widget/ImageView;

.field public final d:Landroid/widget/ImageView;

.field public final e:Landroid/widget/ImageView;

.field public final f:Lcom/zykj/view/widget/SketchProgressView;

.field public final g:Lcom/zykj/view/widget/SketchProgressView;

.field public final h:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

.field public final i:Lcom/zykj/view/widget/TouchSwitchView;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILandroidx/constraintlayout/widget/ConstraintLayout;Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Lcom/zykj/view/widget/SketchProgressView;Lcom/zykj/view/widget/SketchProgressView;Lcom/zykj/merge/sketch/view/MergeSketchPlayView;Lcom/zykj/view/widget/TouchSwitchView;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 5
    .line 6
    iput-object p5, p0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->b:Lcom/zykj/view/databinding/ViewItemSketchPlayBinding;

    .line 7
    .line 8
    iput-object p6, p0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->c:Landroid/widget/ImageView;

    .line 9
    .line 10
    iput-object p7, p0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->d:Landroid/widget/ImageView;

    .line 11
    .line 12
    iput-object p8, p0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->e:Landroid/widget/ImageView;

    .line 13
    .line 14
    iput-object p9, p0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->f:Lcom/zykj/view/widget/SketchProgressView;

    .line 15
    .line 16
    iput-object p10, p0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->g:Lcom/zykj/view/widget/SketchProgressView;

    .line 17
    .line 18
    iput-object p11, p0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->h:Lcom/zykj/merge/sketch/view/MergeSketchPlayView;

    .line 19
    .line 20
    iput-object p12, p0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->i:Lcom/zykj/view/widget/TouchSwitchView;

    .line 21
    .line 22
    return-void
.end method

.method public static a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;
    .locals 1

    .line 1
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0, p1, p2, v0}, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;
    .locals 1

    .line 1
    sget v0, Lcom/zykj/view/R$layout;->view_fragment_sketch_play:I

    .line 2
    .line 3
    invoke-static {p0, v0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/zykj/view/databinding/ViewFragmentSketchPlayBinding;

    .line 8
    .line 9
    return-object p0
.end method
