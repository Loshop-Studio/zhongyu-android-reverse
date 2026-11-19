.class Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/style/LeadingMarginSpan;
.implements Landroid/text/style/LineHeightSpan;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/utils/SpanUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "CustomIconMarginSpan"
.end annotation


# static fields
.field static final ALIGN_CENTER:I = 0x2

.field static final ALIGN_TOP:I = 0x3


# instance fields
.field private flag:Z

.field private lineHeight:I

.field mBitmap:Landroid/graphics/Bitmap;

.field private mPad:I

.field final mVerticalAlignment:I

.field private need0:I

.field private need1:I

.field private totalHeight:I


# direct methods
.method private constructor <init>(III)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->resource2Bitmap(I)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->mBitmap:Landroid/graphics/Bitmap;

    .line 19
    iput p2, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->mPad:I

    .line 20
    iput p3, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->mVerticalAlignment:I

    return-void
.end method

.method synthetic constructor <init>(IIILcom/xuexiang/xui/utils/SpanUtils$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;-><init>(III)V

    return-void
.end method

.method private constructor <init>(Landroid/graphics/Bitmap;II)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->mBitmap:Landroid/graphics/Bitmap;

    .line 7
    iput p2, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->mPad:I

    .line 8
    iput p3, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->mVerticalAlignment:I

    return-void
.end method

.method synthetic constructor <init>(Landroid/graphics/Bitmap;IILcom/xuexiang/xui/utils/SpanUtils$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;-><init>(Landroid/graphics/Bitmap;II)V

    return-void
.end method

.method private constructor <init>(Landroid/graphics/drawable/Drawable;II)V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->drawable2Bitmap(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->mBitmap:Landroid/graphics/Bitmap;

    .line 11
    iput p2, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->mPad:I

    .line 12
    iput p3, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->mVerticalAlignment:I

    return-void
.end method

.method synthetic constructor <init>(Landroid/graphics/drawable/Drawable;IILcom/xuexiang/xui/utils/SpanUtils$1;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;-><init>(Landroid/graphics/drawable/Drawable;II)V

    return-void
.end method

.method private constructor <init>(Landroid/net/Uri;II)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->uri2Bitmap(Landroid/net/Uri;)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->mBitmap:Landroid/graphics/Bitmap;

    .line 15
    iput p2, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->mPad:I

    .line 16
    iput p3, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->mVerticalAlignment:I

    return-void
.end method

.method synthetic constructor <init>(Landroid/net/Uri;IILcom/xuexiang/xui/utils/SpanUtils$1;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;-><init>(Landroid/net/Uri;II)V

    return-void
.end method

.method private drawable2Bitmap(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;
    .locals 5

    .line 1
    instance-of v0, p1, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v0, :cond_0

    .line 2
    move-object v0, p1

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    .line 3
    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1

    .line 5
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    const/4 v1, -0x1

    if-lez v0, :cond_3

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    if-gtz v0, :cond_1

    goto :goto_1

    .line 6
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v2

    .line 7
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    move-result v3

    if-eq v3, v1, :cond_2

    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    goto :goto_0

    :cond_2
    sget-object v1, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 8
    :goto_0
    invoke-static {v0, v2, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    goto :goto_3

    .line 9
    :cond_3
    :goto_1
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    move-result v0

    if-eq v0, v1, :cond_4

    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    goto :goto_2

    :cond_4
    sget-object v0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    :goto_2
    const/4 v1, 0x1

    .line 10
    invoke-static {v1, v1, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 11
    :goto_3
    new-instance v1, Landroid/graphics/Canvas;

    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 12
    invoke-virtual {v1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v2

    invoke-virtual {v1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v3

    const/4 v4, 0x0

    invoke-virtual {p1, v4, v4, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 13
    invoke-virtual {p1, v1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    return-object v0
.end method

.method private resource2Bitmap(I)Landroid/graphics/Bitmap;
    .locals 5

    .line 1
    invoke-static {}, Lcom/xuexiang/xui/XUI;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Landroidx/core/content/a;->d(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 2
    :cond_0
    new-instance v0, Landroid/graphics/Canvas;

    invoke-direct {v0}, Landroid/graphics/Canvas;-><init>()V

    .line 3
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v2

    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v1, v2, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 4
    invoke-virtual {v0, v1}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V

    .line 5
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v3

    const/4 v4, 0x0

    invoke-virtual {p1, v4, v4, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 6
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    return-object v1
.end method

.method private uri2Bitmap(Landroid/net/Uri;)Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    :try_start_0
    invoke-static {}, Lcom/xuexiang/xui/XUI;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-static {v0, p1}, Landroid/provider/MediaStore$Images$Media;->getBitmap(Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/graphics/Bitmap;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 2
    invoke-virtual {p1}, Ljava/io/IOException;->printStackTrace()V

    .line 3
    sget-object p1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    const/4 v0, 0x1

    invoke-static {v0, v0, p1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public chooseHeight(Ljava/lang/CharSequence;IIIILandroid/graphics/Paint$FontMetricsInt;)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->lineHeight:I

    if-nez v0, :cond_0

    sub-int v0, p5, p4

    .line 2
    iput v0, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->lineHeight:I

    .line 3
    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->need0:I

    if-nez v0, :cond_1

    move-object v0, p1

    check-cast v0, Landroid/text/Spanned;

    invoke-interface {v0, p0}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v0

    if-ne p3, v0, :cond_1

    .line 4
    iget-object p1, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->mBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p1

    .line 5
    iget p2, p6, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    add-int/2addr p2, p5

    iget p3, p6, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    sub-int/2addr p2, p3

    sub-int/2addr p2, p4

    sub-int p2, p1, p2

    iput p2, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->need0:I

    .line 6
    iget p2, p6, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    add-int/2addr p2, p5

    iget p3, p6, Landroid/graphics/Paint$FontMetricsInt;->top:I

    sub-int/2addr p2, p3

    sub-int/2addr p2, p4

    sub-int/2addr p1, p2

    iput p1, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->need1:I

    sub-int/2addr p5, p4

    .line 7
    iget p1, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->lineHeight:I

    add-int/2addr p5, p1

    iput p5, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->totalHeight:I

    return-void

    .line 8
    :cond_1
    iget p4, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->need0:I

    if-gtz p4, :cond_2

    iget p4, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->need1:I

    if-lez p4, :cond_10

    .line 9
    :cond_2
    iget p4, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->mVerticalAlignment:I

    const/4 p5, 0x3

    if-ne p4, p5, :cond_4

    .line 10
    check-cast p1, Landroid/text/Spanned;

    invoke-interface {p1, p0}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result p1

    if-ne p3, p1, :cond_10

    .line 11
    iget p1, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->need0:I

    if-lez p1, :cond_3

    .line 12
    iget p2, p6, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    add-int/2addr p2, p1

    iput p2, p6, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 13
    :cond_3
    iget p1, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->need1:I

    if-lez p1, :cond_10

    .line 14
    iget p2, p6, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    add-int/2addr p2, p1

    iput p2, p6, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    goto/16 :goto_1

    :cond_4
    const/4 p5, 0x1

    const/4 v0, 0x2

    if-ne p4, v0, :cond_b

    .line 15
    check-cast p1, Landroid/text/Spanned;

    invoke-interface {p1, p0}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result p4

    if-ne p2, p4, :cond_6

    .line 16
    iget p2, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->need0:I

    if-lez p2, :cond_5

    .line 17
    iget p4, p6, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    div-int/2addr p2, v0

    sub-int/2addr p4, p2

    iput p4, p6, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 18
    :cond_5
    iget p2, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->need1:I

    if-lez p2, :cond_9

    .line 19
    iget p4, p6, Landroid/graphics/Paint$FontMetricsInt;->top:I

    div-int/2addr p2, v0

    sub-int/2addr p4, p2

    iput p4, p6, Landroid/graphics/Paint$FontMetricsInt;->top:I

    goto :goto_0

    .line 20
    :cond_6
    iget-boolean p2, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->flag:Z

    if-nez p2, :cond_9

    .line 21
    iget p2, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->need0:I

    if-lez p2, :cond_7

    .line 22
    iget p4, p6, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    div-int/2addr p2, v0

    add-int/2addr p4, p2

    iput p4, p6, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 23
    :cond_7
    iget p2, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->need1:I

    if-lez p2, :cond_8

    .line 24
    iget p4, p6, Landroid/graphics/Paint$FontMetricsInt;->top:I

    div-int/2addr p2, v0

    add-int/2addr p4, p2

    iput p4, p6, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 25
    :cond_8
    iput-boolean p5, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->flag:Z

    .line 26
    :cond_9
    :goto_0
    invoke-interface {p1, p0}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result p1

    if-ne p3, p1, :cond_10

    .line 27
    iget p1, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->need0:I

    if-lez p1, :cond_a

    .line 28
    iget p2, p6, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    div-int/2addr p1, v0

    add-int/2addr p2, p1

    iput p2, p6, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 29
    :cond_a
    iget p1, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->need1:I

    if-lez p1, :cond_10

    .line 30
    iget p2, p6, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    div-int/2addr p1, v0

    add-int/2addr p2, p1

    iput p2, p6, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    goto :goto_1

    .line 31
    :cond_b
    check-cast p1, Landroid/text/Spanned;

    invoke-interface {p1, p0}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result p1

    if-ne p2, p1, :cond_d

    .line 32
    iget p1, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->need0:I

    if-lez p1, :cond_c

    .line 33
    iget p2, p6, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    sub-int/2addr p2, p1

    iput p2, p6, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 34
    :cond_c
    iget p1, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->need1:I

    if-lez p1, :cond_10

    .line 35
    iget p2, p6, Landroid/graphics/Paint$FontMetricsInt;->top:I

    sub-int/2addr p2, p1

    iput p2, p6, Landroid/graphics/Paint$FontMetricsInt;->top:I

    goto :goto_1

    .line 36
    :cond_d
    iget-boolean p1, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->flag:Z

    if-nez p1, :cond_10

    .line 37
    iget p1, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->need0:I

    if-lez p1, :cond_e

    .line 38
    iget p2, p6, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    add-int/2addr p2, p1

    iput p2, p6, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 39
    :cond_e
    iget p1, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->need1:I

    if-lez p1, :cond_f

    .line 40
    iget p2, p6, Landroid/graphics/Paint$FontMetricsInt;->top:I

    add-int/2addr p2, p1

    iput p2, p6, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 41
    :cond_f
    iput-boolean p5, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->flag:Z

    :cond_10
    :goto_1
    return-void
.end method

.method public drawLeadingMargin(Landroid/graphics/Canvas;Landroid/graphics/Paint;IIIIILjava/lang/CharSequence;IIZLandroid/text/Layout;)V
    .locals 0

    .line 1
    check-cast p8, Landroid/text/Spanned;

    invoke-interface {p8, p0}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result p5

    .line 2
    invoke-virtual {p12, p5}, Landroid/text/Layout;->getLineForOffset(I)I

    move-result p5

    invoke-virtual {p12, p5}, Landroid/text/Layout;->getLineTop(I)I

    move-result p5

    if-gez p4, :cond_0

    .line 3
    iget-object p4, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->mBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {p4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p4

    sub-int/2addr p3, p4

    .line 4
    :cond_0
    iget p4, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->totalHeight:I

    iget-object p6, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->mBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {p6}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p6

    sub-int/2addr p4, p6

    if-lez p4, :cond_3

    .line 5
    iget p6, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->mVerticalAlignment:I

    const/4 p7, 0x3

    if-ne p6, p7, :cond_1

    .line 6
    iget-object p4, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->mBitmap:Landroid/graphics/Bitmap;

    int-to-float p3, p3

    int-to-float p5, p5

    invoke-virtual {p1, p4, p3, p5, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    goto :goto_0

    :cond_1
    const/4 p7, 0x2

    if-ne p6, p7, :cond_2

    .line 7
    iget-object p6, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->mBitmap:Landroid/graphics/Bitmap;

    int-to-float p3, p3

    int-to-float p5, p5

    int-to-float p4, p4

    const/high16 p7, 0x40000000    # 2.0f

    div-float/2addr p4, p7

    add-float/2addr p5, p4

    invoke-virtual {p1, p6, p3, p5, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    goto :goto_0

    .line 8
    :cond_2
    iget-object p6, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->mBitmap:Landroid/graphics/Bitmap;

    int-to-float p3, p3

    add-int/2addr p5, p4

    int-to-float p4, p5

    invoke-virtual {p1, p6, p3, p4, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    goto :goto_0

    .line 9
    :cond_3
    iget-object p4, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->mBitmap:Landroid/graphics/Bitmap;

    int-to-float p3, p3

    int-to-float p5, p5

    invoke-virtual {p1, p4, p3, p5, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    :goto_0
    return-void
.end method

.method public getLeadingMargin(Z)I
    .locals 1

    iget-object p1, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->mBitmap:Landroid/graphics/Bitmap;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p1

    iget v0, p0, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;->mPad:I

    add-int/2addr p1, v0

    return p1
.end method
