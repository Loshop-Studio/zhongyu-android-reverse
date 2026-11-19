.class Lcom/xuexiang/xui/widget/imageview/edit/LinePath;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final mDrawPaint:Landroid/graphics/Paint;

.field private final mDrawPath:Landroid/graphics/Path;


# direct methods
.method constructor <init>(Landroid/graphics/Path;Landroid/graphics/Paint;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0, p2}, Landroid/graphics/Paint;-><init>(Landroid/graphics/Paint;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/LinePath;->mDrawPaint:Landroid/graphics/Paint;

    .line 3
    new-instance p2, Landroid/graphics/Path;

    invoke-direct {p2, p1}, Landroid/graphics/Path;-><init>(Landroid/graphics/Path;)V

    iput-object p2, p0, Lcom/xuexiang/xui/widget/imageview/edit/LinePath;->mDrawPath:Landroid/graphics/Path;

    return-void
.end method


# virtual methods
.method getDrawPaint()Landroid/graphics/Paint;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/LinePath;->mDrawPaint:Landroid/graphics/Paint;

    return-object v0
.end method

.method getDrawPath()Landroid/graphics/Path;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/LinePath;->mDrawPath:Landroid/graphics/Path;

    return-object v0
.end method
