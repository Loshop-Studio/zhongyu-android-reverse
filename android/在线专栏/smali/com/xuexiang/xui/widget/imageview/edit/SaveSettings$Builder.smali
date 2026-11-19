.class public Lcom/xuexiang/xui/widget/imageview/edit/SaveSettings$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/imageview/edit/SaveSettings;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private compressFormat:Landroid/graphics/Bitmap$CompressFormat;

.field private compressQuality:I

.field private isClearViewsEnabled:Z

.field private isTransparencyEnabled:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/SaveSettings$Builder;->isTransparencyEnabled:Z

    .line 3
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/SaveSettings$Builder;->isClearViewsEnabled:Z

    .line 4
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/SaveSettings$Builder;->compressFormat:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v0, 0x64

    .line 5
    iput v0, p0, Lcom/xuexiang/xui/widget/imageview/edit/SaveSettings$Builder;->compressQuality:I

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/imageview/edit/SaveSettings$Builder;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/imageview/edit/SaveSettings$Builder;->isClearViewsEnabled:Z

    return p0
.end method

.method static synthetic access$100(Lcom/xuexiang/xui/widget/imageview/edit/SaveSettings$Builder;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/imageview/edit/SaveSettings$Builder;->isTransparencyEnabled:Z

    return p0
.end method

.method static synthetic access$200(Lcom/xuexiang/xui/widget/imageview/edit/SaveSettings$Builder;)Landroid/graphics/Bitmap$CompressFormat;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/imageview/edit/SaveSettings$Builder;->compressFormat:Landroid/graphics/Bitmap$CompressFormat;

    return-object p0
.end method

.method static synthetic access$300(Lcom/xuexiang/xui/widget/imageview/edit/SaveSettings$Builder;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/imageview/edit/SaveSettings$Builder;->compressQuality:I

    return p0
.end method


# virtual methods
.method public build()Lcom/xuexiang/xui/widget/imageview/edit/SaveSettings;
    .locals 2

    new-instance v0, Lcom/xuexiang/xui/widget/imageview/edit/SaveSettings;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/xuexiang/xui/widget/imageview/edit/SaveSettings;-><init>(Lcom/xuexiang/xui/widget/imageview/edit/SaveSettings$Builder;Lcom/xuexiang/xui/widget/imageview/edit/SaveSettings$1;)V

    return-object v0
.end method

.method public setClearViewsEnabled(Z)Lcom/xuexiang/xui/widget/imageview/edit/SaveSettings$Builder;
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/SaveSettings$Builder;->isClearViewsEnabled:Z

    return-object p0
.end method

.method public setCompressFormat(Landroid/graphics/Bitmap$CompressFormat;)Lcom/xuexiang/xui/widget/imageview/edit/SaveSettings$Builder;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/SaveSettings$Builder;->compressFormat:Landroid/graphics/Bitmap$CompressFormat;

    return-object p0
.end method

.method public setCompressQuality(I)Lcom/xuexiang/xui/widget/imageview/edit/SaveSettings$Builder;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/SaveSettings$Builder;->compressQuality:I

    return-object p0
.end method

.method public setTransparencyEnabled(Z)Lcom/xuexiang/xui/widget/imageview/edit/SaveSettings$Builder;
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/SaveSettings$Builder;->isTransparencyEnabled:Z

    return-object p0
.end method
