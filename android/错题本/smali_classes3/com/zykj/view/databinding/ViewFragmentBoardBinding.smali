.class public abstract Lcom/zykj/view/databinding/ViewFragmentBoardBinding;
.super Landroidx/databinding/ViewDataBinding;
.source "SourceFile"


# instance fields
.field public final flBoardCustomColor:Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final flCustomColor:Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final flSketchBoardTouch:Lcom/zykj/view/widget/SketchBoardTouchFrameLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final includeBackground:Lcom/zykj/view/databinding/ViewIncludeBackgroundColorBinding;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final includeCommit:Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final includeEraser:Lcom/zykj/view/databinding/ViewIncludeEraserBinding;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final includeGraph:Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final includeMenu:Lcom/zykj/view/databinding/ViewIncludeMenuBinding;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final includePen:Lcom/zykj/view/databinding/ViewIncludePenBinding;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final includeRecord:Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final includeSelect:Lcom/zykj/view/databinding/ViewIncludeSelectTypeBinding;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final ivBack:Landroidx/appcompat/widget/AppCompatImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final ivExpansion:Landroidx/appcompat/widget/AppCompatImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final loadingLayout:Landroid/widget/FrameLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final sketchProgressHorizontal:Lcom/zykj/view/widget/SketchProgressView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final sketchProgressVertical:Lcom/zykj/view/widget/SketchProgressView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final sketchView:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final toolPanel:Landroid/widget/FrameLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvLoadingTips:Landroid/widget/TextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILcom/zykj/view/widget/customColor/CustomColorFrameLayout;Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;Lcom/zykj/view/widget/SketchBoardTouchFrameLayout;Lcom/zykj/view/databinding/ViewIncludeBackgroundColorBinding;Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;Lcom/zykj/view/databinding/ViewIncludeEraserBinding;Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;Lcom/zykj/view/databinding/ViewIncludeMenuBinding;Lcom/zykj/view/databinding/ViewIncludePenBinding;Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;Lcom/zykj/view/databinding/ViewIncludeSelectTypeBinding;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/appcompat/widget/AppCompatImageView;Landroid/widget/FrameLayout;Lcom/zykj/view/widget/SketchProgressView;Lcom/zykj/view/widget/SketchProgressView;Lcom/zykj/blackboard/core/canvas/SketchRecorderView;Landroid/widget/FrameLayout;Landroid/widget/TextView;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p3}, Landroidx/databinding/ViewDataBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    .line 2
    iput-object p4, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->flBoardCustomColor:Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;

    .line 3
    iput-object p5, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->flCustomColor:Lcom/zykj/view/widget/customColor/CustomColorFrameLayout;

    .line 4
    iput-object p6, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->flSketchBoardTouch:Lcom/zykj/view/widget/SketchBoardTouchFrameLayout;

    .line 5
    iput-object p7, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeBackground:Lcom/zykj/view/databinding/ViewIncludeBackgroundColorBinding;

    .line 6
    iput-object p8, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeCommit:Lcom/zykj/view/databinding/ViewItemSketchRecordBinding;

    .line 7
    iput-object p9, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeEraser:Lcom/zykj/view/databinding/ViewIncludeEraserBinding;

    .line 8
    iput-object p10, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeGraph:Lcom/zykj/view/databinding/ViewIncludeImageAddBinding;

    .line 9
    iput-object p11, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeMenu:Lcom/zykj/view/databinding/ViewIncludeMenuBinding;

    .line 10
    iput-object p12, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includePen:Lcom/zykj/view/databinding/ViewIncludePenBinding;

    .line 11
    iput-object p13, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeRecord:Lcom/zykj/view/databinding/ViewItemSketchRecordAudioBinding;

    .line 12
    iput-object p14, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->includeSelect:Lcom/zykj/view/databinding/ViewIncludeSelectTypeBinding;

    .line 13
    iput-object p15, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->ivBack:Landroidx/appcompat/widget/AppCompatImageView;

    move-object/from16 p1, p16

    .line 14
    iput-object p1, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->ivExpansion:Landroidx/appcompat/widget/AppCompatImageView;

    move-object/from16 p1, p17

    .line 15
    iput-object p1, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->loadingLayout:Landroid/widget/FrameLayout;

    move-object/from16 p1, p18

    .line 16
    iput-object p1, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->sketchProgressHorizontal:Lcom/zykj/view/widget/SketchProgressView;

    move-object/from16 p1, p19

    .line 17
    iput-object p1, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->sketchProgressVertical:Lcom/zykj/view/widget/SketchProgressView;

    move-object/from16 p1, p20

    .line 18
    iput-object p1, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->sketchView:Lcom/zykj/blackboard/core/canvas/SketchRecorderView;

    move-object/from16 p1, p21

    .line 19
    iput-object p1, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->toolPanel:Landroid/widget/FrameLayout;

    move-object/from16 p1, p22

    .line 20
    iput-object p1, p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->tvLoadingTips:Landroid/widget/TextView;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/zykj/view/databinding/ViewFragmentBoardBinding;
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->bind(Landroid/view/View;Ljava/lang/Object;)Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    move-result-object p0

    return-object p0
.end method

.method public static bind(Landroid/view/View;Ljava/lang/Object;)Lcom/zykj/view/databinding/ViewFragmentBoardBinding;
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    sget v0, Lcom/zykj/view/R$layout;->view_fragment_board:I

    invoke-static {p1, p0, v0}, Landroidx/databinding/ViewDataBinding;->bind(Ljava/lang/Object;Landroid/view/View;I)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lcom/zykj/view/databinding/ViewFragmentBoardBinding;
    .locals 1
    .param p0    # Landroid/view/LayoutInflater;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 3
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->inflate(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/view/databinding/ViewFragmentBoardBinding;
    .locals 1
    .param p0    # Landroid/view/LayoutInflater;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, p1, p2, v0}, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lcom/zykj/view/databinding/ViewFragmentBoardBinding;
    .locals 1
    .param p0    # Landroid/view/LayoutInflater;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    sget v0, Lcom/zykj/view/R$layout;->view_fragment_board:I

    invoke-static {p0, v0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lcom/zykj/view/databinding/ViewFragmentBoardBinding;
    .locals 3
    .param p0    # Landroid/view/LayoutInflater;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 4
    sget v0, Lcom/zykj/view/R$layout;->view_fragment_board:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v0, v1, v2, p1}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lcom/zykj/view/databinding/ViewFragmentBoardBinding;

    return-object p0
.end method
