.class public abstract Lcom/zykj/view/databinding/ViewFragmentBoardBinding;
.super Landroidx/databinding/ViewDataBinding;
.source "SourceFile"


# instance fields
.field public final c:Lcom/zykj/view/databinding/ViewIncludeBackgroundColorBinding;

.field public final d:Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;

.field public final e:Lcom/zykj/view/databinding/ViewIncludeEraserBinding;

.field public final f:Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;

.field public final g:Lcom/zykj/view/databinding/ViewIncludeMenuBinding;

.field public final h:Lcom/zykj/view/databinding/ViewIncludePenBinding;

.field public final i:Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;

.field public final j:Landroidx/appcompat/widget/AppCompatImageView;

.field public final k:Landroidx/appcompat/widget/AppCompatImageView;

.field public final l:Landroid/widget/FrameLayout;

.field public final m:Lcom/zykj/view/widget/SketchProgressView;

.field public final n:Lcom/zykj/view/widget/SketchProgressView;

.field public final o:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

.field public final p:Landroid/widget/FrameLayout;

.field public final q:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILcom/zykj/view/databinding/ViewIncludeBackgroundColorBinding;Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;Lcom/zykj/view/databinding/ViewIncludeEraserBinding;Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;Lcom/zykj/view/databinding/ViewIncludeMenuBinding;Lcom/zykj/view/databinding/ViewIncludePenBinding;Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/appcompat/widget/AppCompatImageView;Landroid/widget/FrameLayout;Lcom/zykj/view/widget/SketchProgressView;Lcom/zykj/view/widget/SketchProgressView;Lcom/zykj/blackboard/core/canvas/SketchRecorderView;Landroid/widget/FrameLayout;Landroid/widget/TextView;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p3}, Landroidx/databinding/ViewDataBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    .line 2
    iput-object p4, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->c:Lcom/zykj/view/databinding/ViewIncludeBackgroundColorBinding;

    .line 3
    iput-object p5, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->d:Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;

    .line 4
    iput-object p6, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->e:Lcom/zykj/view/databinding/ViewIncludeEraserBinding;

    .line 5
    iput-object p7, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->f:Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;

    .line 6
    iput-object p8, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->g:Lcom/zykj/view/databinding/ViewIncludeMenuBinding;

    .line 7
    iput-object p9, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->h:Lcom/zykj/view/databinding/ViewIncludePenBinding;

    .line 8
    iput-object p10, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->i:Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;

    .line 9
    iput-object p11, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->j:Landroidx/appcompat/widget/AppCompatImageView;

    .line 10
    iput-object p12, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->k:Landroidx/appcompat/widget/AppCompatImageView;

    .line 11
    iput-object p13, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->l:Landroid/widget/FrameLayout;

    .line 12
    iput-object p14, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->m:Lcom/zykj/view/widget/SketchProgressView;

    .line 13
    iput-object p15, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->n:Lcom/zykj/view/widget/SketchProgressView;

    move-object/from16 p1, p16

    .line 14
    iput-object p1, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->o:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

    move-object/from16 p1, p17

    .line 15
    iput-object p1, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->p:Landroid/widget/FrameLayout;

    move-object/from16 p1, p18

    .line 16
    iput-object p1, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->q:Landroid/widget/TextView;

    return-void
.end method

.method public static a(Landroid/view/LayoutInflater;)Lcom/zykj/view/databinding/ViewFragmentBoardBinding;
    .locals 1

    .line 1
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0, v0}, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->c(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static c(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lcom/zykj/view/databinding/ViewFragmentBoardBinding;
    .locals 3

    .line 1
    sget v0, Lcom/zykj/view/R$layout;->view_fragment_board:I

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
    check-cast p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    .line 10
    .line 11
    return-object p0
.end method
