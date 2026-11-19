.class public Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/imageview/edit/BrushViewChangeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;,
        Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$OnSaveListener;
    }
.end annotation


# instance fields
.field private mAddedViews:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private mBrushDrawingView:Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;

.field private mDefaultEmojiTypeface:Landroid/graphics/Typeface;

.field private mDefaultTextTypeface:Landroid/graphics/Typeface;

.field private mDeleteView:Landroid/view/View;

.field private mImageView:Landroid/widget/ImageView;

.field private mIsTextPinchZoomable:Z

.field private final mLayoutInflater:Landroid/view/LayoutInflater;

.field private mOnPhotoEditorListener:Lcom/xuexiang/xui/widget/imageview/edit/OnPhotoEditorListener;

.field private mParentView:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;

.field private mRedoViews:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;->access$000(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;)Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mParentView:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;

    .line 4
    invoke-static {p1}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;->access$100(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;)Landroid/widget/ImageView;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mImageView:Landroid/widget/ImageView;

    .line 5
    invoke-static {p1}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;->access$200(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mDeleteView:Landroid/view/View;

    .line 6
    invoke-static {p1}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;->access$300(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;)Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mBrushDrawingView:Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;

    .line 7
    invoke-static {p1}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;->access$400(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mIsTextPinchZoomable:Z

    .line 8
    invoke-static {p1}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;->access$500(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;)Landroid/graphics/Typeface;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mDefaultTextTypeface:Landroid/graphics/Typeface;

    .line 9
    invoke-static {p1}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;->access$600(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;)Landroid/graphics/Typeface;

    move-result-object v0

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mDefaultEmojiTypeface:Landroid/graphics/Typeface;

    .line 10
    invoke-static {p1}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;->access$700(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;)Landroid/content/Context;

    move-result-object p1

    const-string v0, "layout_inflater"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/LayoutInflater;

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mLayoutInflater:Landroid/view/LayoutInflater;

    .line 11
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mBrushDrawingView:Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;

    invoke-virtual {p1, p0}, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->setBrushViewChangeListener(Lcom/xuexiang/xui/widget/imageview/edit/BrushViewChangeListener;)V

    .line 12
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mAddedViews:Ljava/util/List;

    .line 13
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mRedoViews:Ljava/util/List;

    return-void
.end method

.method synthetic constructor <init>(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;-><init>(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;)V

    return-void
.end method

.method static synthetic access$1000(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;)Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mParentView:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;

    return-object p0
.end method

.method static synthetic access$800(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;)Lcom/xuexiang/xui/widget/imageview/edit/OnPhotoEditorListener;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mOnPhotoEditorListener:Lcom/xuexiang/xui/widget/imageview/edit/OnPhotoEditorListener;

    return-object p0
.end method

.method static synthetic access$900(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;Landroid/view/View;Lcom/xuexiang/xui/widget/imageview/edit/ViewType;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->viewUndo(Landroid/view/View;Lcom/xuexiang/xui/widget/imageview/edit/ViewType;)V

    return-void
.end method

.method private addViewToParent(Landroid/view/View;Lcom/xuexiang/xui/widget/imageview/edit/ViewType;)V
    .locals 3

    .line 1
    new-instance v0, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0xd

    const/4 v2, -0x1

    .line 2
    invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(II)V

    .line 3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mParentView:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;

    invoke-virtual {v1, p1, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mAddedViews:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mOnPhotoEditorListener:Lcom/xuexiang/xui/widget/imageview/edit/OnPhotoEditorListener;

    if-eqz p1, :cond_0

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mAddedViews:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p1, p2, v0}, Lcom/xuexiang/xui/widget/imageview/edit/OnPhotoEditorListener;->onAddViewListener(Lcom/xuexiang/xui/widget/imageview/edit/ViewType;I)V

    :cond_0
    return-void
.end method

.method private clearBrushAllViews()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mBrushDrawingView:Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->clearAll()V

    :cond_0
    return-void
.end method

.method private static convertEmoji(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const/4 v0, 0x2

    .line 1
    :try_start_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    const/16 v0, 0x10

    invoke-static {p0, v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result p0

    .line 2
    new-instance v0, Ljava/lang/String;

    invoke-static {p0}, Ljava/lang/Character;->toChars(I)[C

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/String;-><init>([C)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method

.method public static getEmojis(Landroid/content/Context;)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    sget v1, Lcom/xuexiang/xui/R$array;->photo_editor_emoji:I

    invoke-virtual {p0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object p0

    .line 3
    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p0, v2

    .line 4
    invoke-static {v3}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->convertEmoji(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private getLayout(Lcom/xuexiang/xui/widget/imageview/edit/ViewType;)Landroid/view/View;
    .locals 6

    .line 1
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$7;->$SwitchMap$com$xuexiang$xui$widget$imageview$edit$ViewType:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/16 v1, 0x11

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v2, :cond_4

    const/4 v4, 0x2

    if-eq v0, v4, :cond_3

    const/4 v4, 0x3

    if-eq v0, v4, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mLayoutInflater:Landroid/view/LayoutInflater;

    sget v4, Lcom/xuexiang/xui/R$layout;->xui_layout_photo_editor_text:I

    invoke-virtual {v0, v4, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 3
    sget v4, Lcom/xuexiang/xui/R$id;->tv_editor_text:I

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    if-eqz v4, :cond_2

    .line 4
    iget-object v5, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mDefaultEmojiTypeface:Landroid/graphics/Typeface;

    if-eqz v5, :cond_1

    .line 5
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 6
    :cond_1
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 7
    invoke-virtual {v4, v2, v3}, Landroid/widget/TextView;->setLayerType(ILandroid/graphics/Paint;)V

    :cond_2
    move-object v3, v0

    goto :goto_0

    .line 8
    :cond_3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mLayoutInflater:Landroid/view/LayoutInflater;

    sget v1, Lcom/xuexiang/xui/R$layout;->xui_layout_photo_editor_image:I

    invoke-virtual {v0, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    goto :goto_0

    .line 9
    :cond_4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mLayoutInflater:Landroid/view/LayoutInflater;

    sget v2, Lcom/xuexiang/xui/R$layout;->xui_layout_photo_editor_text:I

    invoke-virtual {v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    .line 10
    sget v0, Lcom/xuexiang/xui/R$id;->tv_editor_text:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_5

    .line 11
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mDefaultTextTypeface:Landroid/graphics/Typeface;

    if-eqz v2, :cond_5

    .line 12
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 13
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mDefaultEmojiTypeface:Landroid/graphics/Typeface;

    if-eqz v1, :cond_5

    .line 14
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mDefaultTextTypeface:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_5
    :goto_0
    if-eqz v3, :cond_6

    .line 15
    invoke-virtual {v3, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 16
    sget v0, Lcom/xuexiang/xui/R$id;->iv_editor_close:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    if-eqz v0, :cond_6

    .line 17
    new-instance v1, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$4;

    invoke-direct {v1, p0, v3, p1}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$4;-><init>(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;Landroid/view/View;Lcom/xuexiang/xui/widget/imageview/edit/ViewType;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_6
    return-object v3
.end method

.method private getMultiTouchListener()Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;
    .locals 7

    new-instance v6, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mDeleteView:Landroid/view/View;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mParentView:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;

    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mImageView:Landroid/widget/ImageView;

    iget-boolean v4, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mIsTextPinchZoomable:Z

    iget-object v5, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mOnPhotoEditorListener:Lcom/xuexiang/xui/widget/imageview/edit/OnPhotoEditorListener;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;-><init>(Landroid/view/View;Landroid/widget/RelativeLayout;Landroid/widget/ImageView;ZLcom/xuexiang/xui/widget/imageview/edit/OnPhotoEditorListener;)V

    return-object v6
.end method

.method private viewUndo(Landroid/view/View;Lcom/xuexiang/xui/widget/imageview/edit/ViewType;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mAddedViews:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mAddedViews:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mParentView:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;

    invoke-virtual {v0, p1}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mAddedViews:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mRedoViews:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mOnPhotoEditorListener:Lcom/xuexiang/xui/widget/imageview/edit/OnPhotoEditorListener;

    if-eqz p1, :cond_0

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mAddedViews:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p1, p2, v0}, Lcom/xuexiang/xui/widget/imageview/edit/OnPhotoEditorListener;->onRemoveViewListener(Lcom/xuexiang/xui/widget/imageview/edit/ViewType;I)V

    :cond_0
    return-void
.end method


# virtual methods
.method public addEmoji(Landroid/graphics/Typeface;Ljava/lang/String;)V
    .locals 5

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mBrushDrawingView:Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->setBrushDrawingMode(Z)V

    .line 3
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/edit/ViewType;->EMOJI:Lcom/xuexiang/xui/widget/imageview/edit/ViewType;

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->getLayout(Lcom/xuexiang/xui/widget/imageview/edit/ViewType;)Landroid/view/View;

    move-result-object v1

    .line 4
    sget v2, Lcom/xuexiang/xui/R$id;->tv_editor_text:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 5
    sget v3, Lcom/xuexiang/xui/R$id;->fl_border:I

    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/FrameLayout;

    .line 6
    sget v4, Lcom/xuexiang/xui/R$id;->iv_editor_close:I

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    if-eqz p1, :cond_0

    .line 7
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_0
    const/high16 p1, 0x42600000    # 56.0f

    .line 8
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 9
    invoke-virtual {v2, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->getMultiTouchListener()Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;

    move-result-object p1

    .line 11
    new-instance p2, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$3;

    invoke-direct {p2, p0, v3, v4}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$3;-><init>(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;Landroid/widget/FrameLayout;Landroid/widget/ImageView;)V

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->setOnGestureControl(Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$OnGestureControl;)V

    .line 12
    invoke-virtual {v1, p1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 13
    invoke-direct {p0, v1, v0}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->addViewToParent(Landroid/view/View;Lcom/xuexiang/xui/widget/imageview/edit/ViewType;)V

    return-void
.end method

.method public addEmoji(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0, p1}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->addEmoji(Landroid/graphics/Typeface;Ljava/lang/String;)V

    return-void
.end method

.method public addImage(Landroid/graphics/Bitmap;)V
    .locals 5

    .line 1
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/edit/ViewType;->IMAGE:Lcom/xuexiang/xui/widget/imageview/edit/ViewType;

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->getLayout(Lcom/xuexiang/xui/widget/imageview/edit/ViewType;)Landroid/view/View;

    move-result-object v1

    .line 2
    sget v2, Lcom/xuexiang/xui/R$id;->iv_editor_image:I

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    .line 3
    sget v3, Lcom/xuexiang/xui/R$id;->fl_border:I

    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/FrameLayout;

    .line 4
    sget v4, Lcom/xuexiang/xui/R$id;->iv_editor_close:I

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    .line 5
    invoke-virtual {v2, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 6
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->getMultiTouchListener()Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;

    move-result-object p1

    .line 7
    new-instance v2, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$1;

    invoke-direct {v2, p0, v3, v4}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$1;-><init>(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;Landroid/widget/FrameLayout;Landroid/widget/ImageView;)V

    invoke-virtual {p1, v2}, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->setOnGestureControl(Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$OnGestureControl;)V

    .line 8
    invoke-virtual {v1, p1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 9
    invoke-direct {p0, v1, v0}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->addViewToParent(Landroid/view/View;Lcom/xuexiang/xui/widget/imageview/edit/ViewType;)V

    return-void
.end method

.method public addText(Landroid/graphics/Typeface;Ljava/lang/String;I)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    .line 2
    new-instance v0, Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder;

    invoke-direct {v0}, Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder;-><init>()V

    .line 3
    invoke-virtual {v0, p3}, Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder;->withTextColor(I)V

    if-eqz p1, :cond_0

    .line 4
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder;->withTextFont(Landroid/graphics/Typeface;)V

    .line 5
    :cond_0
    invoke-virtual {p0, p2, v0}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->addText(Ljava/lang/String;Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder;)V

    return-void
.end method

.method public addText(Ljava/lang/String;I)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0, p1, p2}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->addText(Landroid/graphics/Typeface;Ljava/lang/String;I)V

    return-void
.end method

.method public addText(Ljava/lang/String;Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder;)V
    .locals 8
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mBrushDrawingView:Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->setBrushDrawingMode(Z)V

    .line 7
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/edit/ViewType;->TEXT:Lcom/xuexiang/xui/widget/imageview/edit/ViewType;

    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->getLayout(Lcom/xuexiang/xui/widget/imageview/edit/ViewType;)Landroid/view/View;

    move-result-object v7

    .line 8
    sget v1, Lcom/xuexiang/xui/R$id;->tv_editor_text:I

    invoke-virtual {v7, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroid/widget/TextView;

    .line 9
    sget v1, Lcom/xuexiang/xui/R$id;->iv_editor_close:I

    invoke-virtual {v7, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Landroid/widget/ImageView;

    .line 10
    sget v1, Lcom/xuexiang/xui/R$id;->fl_border:I

    invoke-virtual {v7, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Landroid/widget/FrameLayout;

    .line 11
    invoke-virtual {v5, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-eqz p2, :cond_0

    .line 12
    invoke-virtual {p2, v5}, Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder;->applyStyle(Landroid/widget/TextView;)V

    .line 13
    :cond_0
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->getMultiTouchListener()Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;

    move-result-object p1

    .line 14
    new-instance p2, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$2;

    move-object v1, p2

    move-object v2, p0

    move-object v6, v7

    invoke-direct/range {v1 .. v6}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$2;-><init>(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;Landroid/widget/FrameLayout;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/view/View;)V

    invoke-virtual {p1, p2}, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->setOnGestureControl(Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$OnGestureControl;)V

    .line 15
    invoke-virtual {v7, p1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 16
    invoke-direct {p0, v7, v0}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->addViewToParent(Landroid/view/View;Lcom/xuexiang/xui/widget/imageview/edit/ViewType;)V

    return-void
.end method

.method public brushEraser()Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mBrushDrawingView:Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->brushEraser()V

    :cond_0
    return-object p0
.end method

.method public clearAllViews()V
    .locals 3

    const/4 v0, 0x0

    .line 1
    :goto_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mAddedViews:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mParentView:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mAddedViews:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mAddedViews:Ljava/util/List;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mBrushDrawingView:Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mParentView:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mBrushDrawingView:Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mAddedViews:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mRedoViews:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 7
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->clearBrushAllViews()V

    return-void
.end method

.method public clearHelperBox()V
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    :goto_0
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mParentView:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;

    invoke-virtual {v2}, Landroid/widget/RelativeLayout;->getChildCount()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 2
    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mParentView:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;

    invoke-virtual {v2, v1}, Landroid/widget/RelativeLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 3
    sget v3, Lcom/xuexiang/xui/R$id;->fl_border:I

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/FrameLayout;

    if-eqz v3, :cond_0

    .line 4
    invoke-virtual {v3, v0}, Landroid/widget/FrameLayout;->setBackgroundResource(I)V

    .line 5
    :cond_0
    sget v3, Lcom/xuexiang/xui/R$id;->iv_editor_close:I

    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    if-eqz v2, :cond_1

    const/16 v3, 0x8

    .line 6
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public editText(Landroid/view/View;Landroid/graphics/Typeface;Ljava/lang/String;I)V
    .locals 1

    .line 2
    new-instance v0, Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder;

    invoke-direct {v0}, Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder;-><init>()V

    .line 3
    invoke-virtual {v0, p4}, Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder;->withTextColor(I)V

    if-eqz p2, :cond_0

    .line 4
    invoke-virtual {v0, p2}, Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder;->withTextFont(Landroid/graphics/Typeface;)V

    .line 5
    :cond_0
    invoke-virtual {p0, p1, p3, v0}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->editText(Landroid/view/View;Ljava/lang/String;Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder;)V

    return-void
.end method

.method public editText(Landroid/view/View;Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0, p2, p3}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->editText(Landroid/view/View;Landroid/graphics/Typeface;Ljava/lang/String;I)V

    return-void
.end method

.method public editText(Landroid/view/View;Ljava/lang/String;Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder;)V
    .locals 2

    .line 6
    sget v0, Lcom/xuexiang/xui/R$id;->tv_editor_text:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_1

    .line 7
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mAddedViews:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 8
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-eqz p3, :cond_0

    .line 9
    invoke-virtual {p3, v0}, Lcom/xuexiang/xui/widget/imageview/edit/TextStyleBuilder;->applyStyle(Landroid/widget/TextView;)V

    .line 10
    :cond_0
    iget-object p2, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mParentView:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p3

    invoke-virtual {p2, p1, p3}, Landroid/widget/RelativeLayout;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 11
    iget-object p2, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mAddedViews:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p2

    const/4 p3, -0x1

    if-le p2, p3, :cond_1

    .line 12
    iget-object p3, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mAddedViews:Ljava/util/List;

    invoke-interface {p3, p2, p1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public getBrushColor()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mBrushDrawingView:Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->getBrushColor()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getBrushDrawableMode()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mBrushDrawingView:Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->getBrushDrawingMode()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public getBrushSize()F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mBrushDrawingView:Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->getBrushSize()F

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getEraserSize()F
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mBrushDrawingView:Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->getEraserSize()F

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isCacheEmpty()Z
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mAddedViews:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mRedoViews:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onStartDrawing()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mOnPhotoEditorListener:Lcom/xuexiang/xui/widget/imageview/edit/OnPhotoEditorListener;

    if-eqz v0, :cond_0

    .line 2
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/edit/ViewType;->BRUSH_DRAWING:Lcom/xuexiang/xui/widget/imageview/edit/ViewType;

    invoke-interface {v0, v1}, Lcom/xuexiang/xui/widget/imageview/edit/OnPhotoEditorListener;->onStartViewChangeListener(Lcom/xuexiang/xui/widget/imageview/edit/ViewType;)V

    :cond_0
    return-void
.end method

.method public onStopDrawing()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mOnPhotoEditorListener:Lcom/xuexiang/xui/widget/imageview/edit/OnPhotoEditorListener;

    if-eqz v0, :cond_0

    .line 2
    sget-object v1, Lcom/xuexiang/xui/widget/imageview/edit/ViewType;->BRUSH_DRAWING:Lcom/xuexiang/xui/widget/imageview/edit/ViewType;

    invoke-interface {v0, v1}, Lcom/xuexiang/xui/widget/imageview/edit/OnPhotoEditorListener;->onStopViewChangeListener(Lcom/xuexiang/xui/widget/imageview/edit/ViewType;)V

    :cond_0
    return-void
.end method

.method public onViewAdd(Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mRedoViews:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mRedoViews:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mAddedViews:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mOnPhotoEditorListener:Lcom/xuexiang/xui/widget/imageview/edit/OnPhotoEditorListener;

    if-eqz p1, :cond_1

    .line 5
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/edit/ViewType;->BRUSH_DRAWING:Lcom/xuexiang/xui/widget/imageview/edit/ViewType;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mAddedViews:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {p1, v0, v1}, Lcom/xuexiang/xui/widget/imageview/edit/OnPhotoEditorListener;->onAddViewListener(Lcom/xuexiang/xui/widget/imageview/edit/ViewType;I)V

    :cond_1
    return-void
.end method

.method public onViewRemoved(Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mAddedViews:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_1

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mAddedViews:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-interface {p1, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    .line 3
    instance-of v0, p1, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;

    if-nez v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mParentView:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;

    invoke-virtual {v0, p1}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mRedoViews:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mOnPhotoEditorListener:Lcom/xuexiang/xui/widget/imageview/edit/OnPhotoEditorListener;

    if-eqz p1, :cond_2

    .line 7
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/edit/ViewType;->BRUSH_DRAWING:Lcom/xuexiang/xui/widget/imageview/edit/ViewType;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mAddedViews:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {p1, v0, v1}, Lcom/xuexiang/xui/widget/imageview/edit/OnPhotoEditorListener;->onRemoveViewListener(Lcom/xuexiang/xui/widget/imageview/edit/ViewType;I)V

    :cond_2
    return-void
.end method

.method public redo()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mRedoViews:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-lez v0, :cond_2

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mRedoViews:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    sub-int/2addr v3, v2

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 3
    instance-of v3, v0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;

    if-eqz v3, :cond_1

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mBrushDrawingView:Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->redo()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1

    .line 5
    :cond_1
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mRedoViews:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    sub-int/2addr v4, v2

    invoke-interface {v3, v4}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 6
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mParentView:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;

    invoke-virtual {v3, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V

    .line 7
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mAddedViews:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 8
    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    .line 9
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mOnPhotoEditorListener:Lcom/xuexiang/xui/widget/imageview/edit/OnPhotoEditorListener;

    if-eqz v3, :cond_2

    if-eqz v0, :cond_2

    instance-of v4, v0, Lcom/xuexiang/xui/widget/imageview/edit/ViewType;

    if-eqz v4, :cond_2

    .line 10
    check-cast v0, Lcom/xuexiang/xui/widget/imageview/edit/ViewType;

    iget-object v4, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mAddedViews:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-interface {v3, v0, v4}, Lcom/xuexiang/xui/widget/imageview/edit/OnPhotoEditorListener;->onAddViewListener(Lcom/xuexiang/xui/widget/imageview/edit/ViewType;I)V

    .line 11
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mRedoViews:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_3

    const/4 v1, 0x1

    :cond_3
    return v1
.end method

.method public saveAsBitmap(Lcom/xuexiang/xui/widget/imageview/edit/OnBitmapSaveListener;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "StaticFieldLeak"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/imageview/edit/SaveSettings$Builder;

    invoke-direct {v0}, Lcom/xuexiang/xui/widget/imageview/edit/SaveSettings$Builder;-><init>()V

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/edit/SaveSettings$Builder;->build()Lcom/xuexiang/xui/widget/imageview/edit/SaveSettings;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->saveAsBitmap(Lcom/xuexiang/xui/widget/imageview/edit/SaveSettings;Lcom/xuexiang/xui/widget/imageview/edit/OnBitmapSaveListener;)V

    return-void
.end method

.method public saveAsBitmap(Lcom/xuexiang/xui/widget/imageview/edit/SaveSettings;Lcom/xuexiang/xui/widget/imageview/edit/OnBitmapSaveListener;)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "StaticFieldLeak"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mParentView:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;

    new-instance v1, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6;

    invoke-direct {v1, p0, p1, p2}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$6;-><init>(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;Lcom/xuexiang/xui/widget/imageview/edit/SaveSettings;Lcom/xuexiang/xui/widget/imageview/edit/OnBitmapSaveListener;)V

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->saveFilter(Lcom/xuexiang/xui/widget/imageview/edit/OnBitmapSaveListener;)V

    return-void
.end method

.method public saveAsFile(Ljava/lang/String;Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$OnSaveListener;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/imageview/edit/SaveSettings$Builder;

    invoke-direct {v0}, Lcom/xuexiang/xui/widget/imageview/edit/SaveSettings$Builder;-><init>()V

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/edit/SaveSettings$Builder;->build()Lcom/xuexiang/xui/widget/imageview/edit/SaveSettings;

    move-result-object v0

    invoke-virtual {p0, p1, v0, p2}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->saveAsFile(Ljava/lang/String;Lcom/xuexiang/xui/widget/imageview/edit/SaveSettings;Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$OnSaveListener;)V

    return-void
.end method

.method public saveAsFile(Ljava/lang/String;Lcom/xuexiang/xui/widget/imageview/edit/SaveSettings;Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$OnSaveListener;)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "StaticFieldLeak"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mParentView:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;

    new-instance v1, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$5;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$5;-><init>(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;Ljava/lang/String;Lcom/xuexiang/xui/widget/imageview/edit/SaveSettings;Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$OnSaveListener;)V

    invoke-virtual {v0, v1}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->saveFilter(Lcom/xuexiang/xui/widget/imageview/edit/OnBitmapSaveListener;)V

    return-void
.end method

.method public setBrushColor(I)Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mBrushDrawingView:Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->setBrushColor(I)V

    :cond_0
    return-object p0
.end method

.method public setBrushDrawingMode(Z)Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mBrushDrawingView:Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->setBrushDrawingMode(Z)V

    :cond_0
    return-object p0
.end method

.method setBrushEraserColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mBrushDrawingView:Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->setBrushEraserColor(I)V

    :cond_0
    return-void
.end method

.method public setBrushEraserSize(F)Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mBrushDrawingView:Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->setBrushEraserSize(F)V

    :cond_0
    return-object p0
.end method

.method public setBrushSize(F)Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mBrushDrawingView:Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->setBrushSize(F)V

    :cond_0
    return-object p0
.end method

.method public setFilterEffect(Lcom/xuexiang/xui/widget/imageview/edit/CustomEffect;)Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mParentView:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->setFilterEffect(Lcom/xuexiang/xui/widget/imageview/edit/CustomEffect;)V

    return-object p0
.end method

.method public setFilterEffect(Lcom/xuexiang/xui/widget/imageview/edit/PhotoFilter;)Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mParentView:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;

    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->setFilterEffect(Lcom/xuexiang/xui/widget/imageview/edit/PhotoFilter;)V

    return-object p0
.end method

.method public setOnPhotoEditorListener(Lcom/xuexiang/xui/widget/imageview/edit/OnPhotoEditorListener;)Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mOnPhotoEditorListener:Lcom/xuexiang/xui/widget/imageview/edit/OnPhotoEditorListener;

    return-object p0
.end method

.method public setOpacity(I)Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mBrushDrawingView:Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;

    if-eqz v0, :cond_0

    int-to-double v1, p1

    const-wide/high16 v3, 0x4059000000000000L    # 100.0

    div-double/2addr v1, v3

    const-wide v3, 0x406fe00000000000L    # 255.0

    mul-double v1, v1, v3

    double-to-int p1, v1

    .line 2
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->setOpacity(I)V

    :cond_0
    return-object p0
.end method

.method public undo()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mAddedViews:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-lez v0, :cond_2

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mAddedViews:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    sub-int/2addr v3, v2

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 3
    instance-of v3, v0, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;

    if-eqz v3, :cond_1

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mBrushDrawingView:Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;->undo()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1

    .line 5
    :cond_1
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mAddedViews:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    sub-int/2addr v4, v2

    invoke-interface {v3, v4}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 6
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mParentView:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;

    invoke-virtual {v3, v0}, Landroid/widget/RelativeLayout;->removeView(Landroid/view/View;)V

    .line 7
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mRedoViews:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 8
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mOnPhotoEditorListener:Lcom/xuexiang/xui/widget/imageview/edit/OnPhotoEditorListener;

    if-eqz v3, :cond_2

    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 10
    instance-of v3, v0, Lcom/xuexiang/xui/widget/imageview/edit/ViewType;

    if-eqz v3, :cond_2

    .line 11
    iget-object v3, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mOnPhotoEditorListener:Lcom/xuexiang/xui/widget/imageview/edit/OnPhotoEditorListener;

    check-cast v0, Lcom/xuexiang/xui/widget/imageview/edit/ViewType;

    iget-object v4, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mAddedViews:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-interface {v3, v0, v4}, Lcom/xuexiang/xui/widget/imageview/edit/OnPhotoEditorListener;->onRemoveViewListener(Lcom/xuexiang/xui/widget/imageview/edit/ViewType;I)V

    .line 12
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;->mAddedViews:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_3

    const/4 v1, 0x1

    :cond_3
    return v1
.end method
