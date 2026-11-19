.class public Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private brushDrawingView:Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;

.field private context:Landroid/content/Context;

.field private deleteView:Landroid/view/View;

.field private emojiTypeface:Landroid/graphics/Typeface;

.field private imageView:Landroid/widget/ImageView;

.field private isTextPinchZoomable:Z

.field private parentView:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;

.field private textTypeface:Landroid/graphics/Typeface;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;->isTextPinchZoomable:Z

    .line 3
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;->context:Landroid/content/Context;

    .line 4
    iput-object p2, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;->parentView:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;

    .line 5
    invoke-virtual {p2}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->getSource()Landroid/widget/ImageView;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;->imageView:Landroid/widget/ImageView;

    .line 6
    invoke-virtual {p2}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;->getBrushDrawingView()Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;->brushDrawingView:Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;)Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;->parentView:Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditorView;

    return-object p0
.end method

.method static synthetic access$100(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;)Landroid/widget/ImageView;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;->imageView:Landroid/widget/ImageView;

    return-object p0
.end method

.method static synthetic access$200(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;)Landroid/view/View;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;->deleteView:Landroid/view/View;

    return-object p0
.end method

.method static synthetic access$300(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;)Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;->brushDrawingView:Lcom/xuexiang/xui/widget/imageview/edit/BrushDrawingView;

    return-object p0
.end method

.method static synthetic access$400(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;->isTextPinchZoomable:Z

    return p0
.end method

.method static synthetic access$500(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;)Landroid/graphics/Typeface;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;->textTypeface:Landroid/graphics/Typeface;

    return-object p0
.end method

.method static synthetic access$600(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;)Landroid/graphics/Typeface;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;->emojiTypeface:Landroid/graphics/Typeface;

    return-object p0
.end method

.method static synthetic access$700(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;->context:Landroid/content/Context;

    return-object p0
.end method


# virtual methods
.method public build()Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;
    .locals 2

    new-instance v0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor;-><init>(Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$1;)V

    return-object v0
.end method

.method public setDefaultEmojiTypeface(Landroid/graphics/Typeface;)Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;->emojiTypeface:Landroid/graphics/Typeface;

    return-object p0
.end method

.method public setDefaultTextTypeface(Landroid/graphics/Typeface;)Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;->textTypeface:Landroid/graphics/Typeface;

    return-object p0
.end method

.method setDeleteView(Landroid/view/View;)Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;->deleteView:Landroid/view/View;

    return-object p0
.end method

.method public setPinchTextScalable(Z)Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/PhotoEditor$Builder;->isTextPinchZoomable:Z

    return-object p0
.end method
