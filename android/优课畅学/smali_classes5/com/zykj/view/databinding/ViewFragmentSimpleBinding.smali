.class public abstract Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;
.super Landroidx/databinding/ViewDataBinding;
.source "SourceFile"


# instance fields
.field public final a:Lcom/zykj/view/databinding/ViewIncludeBackgroundColorBinding;

.field public final b:Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;

.field public final c:Lcom/zykj/view/databinding/ViewIncludeEraserBinding;

.field public final d:Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;

.field public final e:Lcom/zykj/view/databinding/ViewIncludeMenuBinding;

.field public final f:Lcom/zykj/view/databinding/ViewIncludePenBinding;

.field public final g:Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;

.field public final h:Landroidx/appcompat/widget/AppCompatImageView;

.field public final i:Landroidx/appcompat/widget/AppCompatImageView;

.field public final j:Lcom/zykj/view/widget/SketchProgressView;

.field public final k:Lcom/zykj/view/widget/SketchProgressView;

.field public final l:Lcom/zykj/view/simpleBoard/SimpleBoardView;

.field public final m:Landroid/widget/FrameLayout;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILcom/zykj/view/databinding/ViewIncludeBackgroundColorBinding;Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;Lcom/zykj/view/databinding/ViewIncludeEraserBinding;Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;Lcom/zykj/view/databinding/ViewIncludeMenuBinding;Lcom/zykj/view/databinding/ViewIncludePenBinding;Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/appcompat/widget/AppCompatImageView;Lcom/zykj/view/widget/SketchProgressView;Lcom/zykj/view/widget/SketchProgressView;Lcom/zykj/view/simpleBoard/SimpleBoardView;Landroid/widget/FrameLayout;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p3}, Landroidx/databinding/ViewDataBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->a:Lcom/zykj/view/databinding/ViewIncludeBackgroundColorBinding;

    .line 5
    .line 6
    iput-object p5, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->b:Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;

    .line 7
    .line 8
    iput-object p6, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->c:Lcom/zykj/view/databinding/ViewIncludeEraserBinding;

    .line 9
    .line 10
    iput-object p7, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->d:Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;

    .line 11
    .line 12
    iput-object p8, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->e:Lcom/zykj/view/databinding/ViewIncludeMenuBinding;

    .line 13
    .line 14
    iput-object p9, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->f:Lcom/zykj/view/databinding/ViewIncludePenBinding;

    .line 15
    .line 16
    iput-object p10, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->g:Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;

    .line 17
    .line 18
    iput-object p11, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->h:Landroidx/appcompat/widget/AppCompatImageView;

    .line 19
    .line 20
    iput-object p12, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->i:Landroidx/appcompat/widget/AppCompatImageView;

    .line 21
    .line 22
    iput-object p13, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->j:Lcom/zykj/view/widget/SketchProgressView;

    .line 23
    .line 24
    iput-object p14, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->k:Lcom/zykj/view/widget/SketchProgressView;

    .line 25
    .line 26
    iput-object p15, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->l:Lcom/zykj/view/simpleBoard/SimpleBoardView;

    .line 27
    .line 28
    move-object/from16 p1, p16

    .line 29
    .line 30
    iput-object p1, p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->m:Landroid/widget/FrameLayout;

    .line 31
    .line 32
    return-void
.end method

.method public static a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;
    .locals 1

    .line 1
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0, p1, p2, v0}, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;->b(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static b(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;
    .locals 1

    .line 1
    sget v0, Lcom/zykj/view/R$layout;->view_fragment_simple:I

    .line 2
    .line 3
    invoke-static {p0, v0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;

    .line 8
    .line 9
    return-object p0
.end method
