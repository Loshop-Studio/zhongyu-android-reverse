.class public final Lcom/xuexiang/xui/utils/SpanUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/utils/SpanUtils$ShadowSpan;,
        Lcom/xuexiang/xui/utils/SpanUtils$ShaderSpan;,
        Lcom/xuexiang/xui/utils/SpanUtils$CustomDynamicDrawableSpan;,
        Lcom/xuexiang/xui/utils/SpanUtils$CustomImageSpan;,
        Lcom/xuexiang/xui/utils/SpanUtils$CustomTypefaceSpan;,
        Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;,
        Lcom/xuexiang/xui/utils/SpanUtils$CustomBulletSpan;,
        Lcom/xuexiang/xui/utils/SpanUtils$CustomQuoteSpan;,
        Lcom/xuexiang/xui/utils/SpanUtils$SpaceSpan;,
        Lcom/xuexiang/xui/utils/SpanUtils$CustomLineHeightSpan;,
        Lcom/xuexiang/xui/utils/SpanUtils$Align;
    }
.end annotation


# static fields
.field public static final ALIGN_BASELINE:I = 0x1

.field public static final ALIGN_BOTTOM:I = 0x0

.field public static final ALIGN_CENTER:I = 0x2

.field public static final ALIGN_TOP:I = 0x3

.field private static final COLOR_DEFAULT:I = -0x1000001

.field private static final LINE_SEPARATOR:Ljava/lang/String;


# instance fields
.field private alignIconMargin:I

.field private alignImage:I

.field private alignLine:I

.field private alignment:Landroid/text/Layout$Alignment;

.field private backgroundColor:I

.field private blurRadius:F

.field private bulletColor:I

.field private bulletGapWidth:I

.field private bulletRadius:I

.field private clickSpan:Landroid/text/style/ClickableSpan;

.field private first:I

.field private flag:I

.field private fontFamily:Ljava/lang/String;

.field private fontSize:I

.field private fontSizeIsDp:Z

.field private foregroundColor:I

.field private iconMarginBitmap:Landroid/graphics/Bitmap;

.field private iconMarginDrawable:Landroid/graphics/drawable/Drawable;

.field private iconMarginGapWidth:I

.field private iconMarginResourceId:I

.field private iconMarginUri:Landroid/net/Uri;

.field private imageBitmap:Landroid/graphics/Bitmap;

.field private imageDrawable:Landroid/graphics/drawable/Drawable;

.field private imageResourceId:I

.field private imageUri:Landroid/net/Uri;

.field private isBold:Z

.field private isBoldItalic:Z

.field private isItalic:Z

.field private isStrikethrough:Z

.field private isSubscript:Z

.field private isSuperscript:Z

.field private isUnderline:Z

.field private lineHeight:I

.field private mBuilder:Landroid/text/SpannableStringBuilder;

.field private mText:Ljava/lang/CharSequence;

.field private mType:I

.field private final mTypeCharSequence:I

.field private final mTypeImage:I

.field private final mTypeSpace:I

.field private proportion:F

.field private quoteColor:I

.field private quoteGapWidth:I

.field private rest:I

.field private shader:Landroid/graphics/Shader;

.field private shadowColor:I

.field private shadowDx:F

.field private shadowDy:F

.field private shadowRadius:F

.field private spaceColor:I

.field private spaceSize:I

.field private spans:[Ljava/lang/Object;

.field private stripeWidth:I

.field private style:Landroid/graphics/BlurMaskFilter$Blur;

.field private typeface:Landroid/graphics/Typeface;

.field private url:Ljava/lang/String;

.field private xProportion:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "line.separator"

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/xuexiang/xui/utils/SpanUtils;->LINE_SEPARATOR:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mTypeCharSequence:I

    const/4 v0, 0x1

    .line 3
    iput v0, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mTypeImage:I

    const/4 v0, 0x2

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mTypeSpace:I

    .line 5
    new-instance v0, Landroid/text/SpannableStringBuilder;

    invoke-direct {v0}, Landroid/text/SpannableStringBuilder;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mBuilder:Landroid/text/SpannableStringBuilder;

    const-string v0, ""

    .line 6
    iput-object v0, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mText:Ljava/lang/CharSequence;

    .line 7
    invoke-direct {p0}, Lcom/xuexiang/xui/utils/SpanUtils;->setDefault()V

    return-void
.end method

.method private apply(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/utils/SpanUtils;->applyLast()V

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mType:I

    return-void
.end method

.method private applyLast()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mType:I

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/utils/SpanUtils;->updateCharCharSequence()V

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 3
    invoke-direct {p0}, Lcom/xuexiang/xui/utils/SpanUtils;->updateImage()V

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 4
    invoke-direct {p0}, Lcom/xuexiang/xui/utils/SpanUtils;->updateSpace()V

    .line 5
    :cond_2
    :goto_0
    invoke-direct {p0}, Lcom/xuexiang/xui/utils/SpanUtils;->setDefault()V

    return-void
.end method

.method private setDefault()V
    .locals 4

    const/16 v0, 0x21

    .line 1
    iput v0, p0, Lcom/xuexiang/xui/utils/SpanUtils;->flag:I

    const v0, -0x1000001

    .line 2
    iput v0, p0, Lcom/xuexiang/xui/utils/SpanUtils;->foregroundColor:I

    .line 3
    iput v0, p0, Lcom/xuexiang/xui/utils/SpanUtils;->backgroundColor:I

    const/4 v1, -0x1

    .line 4
    iput v1, p0, Lcom/xuexiang/xui/utils/SpanUtils;->lineHeight:I

    .line 5
    iput v0, p0, Lcom/xuexiang/xui/utils/SpanUtils;->quoteColor:I

    .line 6
    iput v1, p0, Lcom/xuexiang/xui/utils/SpanUtils;->first:I

    .line 7
    iput v0, p0, Lcom/xuexiang/xui/utils/SpanUtils;->bulletColor:I

    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Lcom/xuexiang/xui/utils/SpanUtils;->iconMarginBitmap:Landroid/graphics/Bitmap;

    .line 9
    iput-object v0, p0, Lcom/xuexiang/xui/utils/SpanUtils;->iconMarginDrawable:Landroid/graphics/drawable/Drawable;

    .line 10
    iput-object v0, p0, Lcom/xuexiang/xui/utils/SpanUtils;->iconMarginUri:Landroid/net/Uri;

    .line 11
    iput v1, p0, Lcom/xuexiang/xui/utils/SpanUtils;->iconMarginResourceId:I

    .line 12
    iput v1, p0, Lcom/xuexiang/xui/utils/SpanUtils;->iconMarginGapWidth:I

    .line 13
    iput v1, p0, Lcom/xuexiang/xui/utils/SpanUtils;->fontSize:I

    const/high16 v2, -0x40800000    # -1.0f

    .line 14
    iput v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->proportion:F

    .line 15
    iput v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->xProportion:F

    const/4 v3, 0x0

    .line 16
    iput-boolean v3, p0, Lcom/xuexiang/xui/utils/SpanUtils;->isStrikethrough:Z

    .line 17
    iput-boolean v3, p0, Lcom/xuexiang/xui/utils/SpanUtils;->isUnderline:Z

    .line 18
    iput-boolean v3, p0, Lcom/xuexiang/xui/utils/SpanUtils;->isSuperscript:Z

    .line 19
    iput-boolean v3, p0, Lcom/xuexiang/xui/utils/SpanUtils;->isSubscript:Z

    .line 20
    iput-boolean v3, p0, Lcom/xuexiang/xui/utils/SpanUtils;->isBold:Z

    .line 21
    iput-boolean v3, p0, Lcom/xuexiang/xui/utils/SpanUtils;->isItalic:Z

    .line 22
    iput-boolean v3, p0, Lcom/xuexiang/xui/utils/SpanUtils;->isBoldItalic:Z

    .line 23
    iput-object v0, p0, Lcom/xuexiang/xui/utils/SpanUtils;->fontFamily:Ljava/lang/String;

    .line 24
    iput-object v0, p0, Lcom/xuexiang/xui/utils/SpanUtils;->typeface:Landroid/graphics/Typeface;

    .line 25
    iput-object v0, p0, Lcom/xuexiang/xui/utils/SpanUtils;->alignment:Landroid/text/Layout$Alignment;

    .line 26
    iput-object v0, p0, Lcom/xuexiang/xui/utils/SpanUtils;->clickSpan:Landroid/text/style/ClickableSpan;

    .line 27
    iput-object v0, p0, Lcom/xuexiang/xui/utils/SpanUtils;->url:Ljava/lang/String;

    .line 28
    iput v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->blurRadius:F

    .line 29
    iput-object v0, p0, Lcom/xuexiang/xui/utils/SpanUtils;->shader:Landroid/graphics/Shader;

    .line 30
    iput v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->shadowRadius:F

    .line 31
    iput-object v0, p0, Lcom/xuexiang/xui/utils/SpanUtils;->spans:[Ljava/lang/Object;

    .line 32
    iput-object v0, p0, Lcom/xuexiang/xui/utils/SpanUtils;->imageBitmap:Landroid/graphics/Bitmap;

    .line 33
    iput-object v0, p0, Lcom/xuexiang/xui/utils/SpanUtils;->imageDrawable:Landroid/graphics/drawable/Drawable;

    .line 34
    iput-object v0, p0, Lcom/xuexiang/xui/utils/SpanUtils;->imageUri:Landroid/net/Uri;

    .line 35
    iput v1, p0, Lcom/xuexiang/xui/utils/SpanUtils;->imageResourceId:I

    .line 36
    iput v1, p0, Lcom/xuexiang/xui/utils/SpanUtils;->spaceSize:I

    return-void
.end method

.method private updateCharCharSequence()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mText:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mBuilder:Landroid/text/SpannableStringBuilder;

    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    .line 3
    iget-object v1, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mBuilder:Landroid/text/SpannableStringBuilder;

    iget-object v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mText:Ljava/lang/CharSequence;

    invoke-virtual {v1, v2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 4
    iget-object v1, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mBuilder:Landroid/text/SpannableStringBuilder;

    invoke-virtual {v1}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v1

    .line 5
    iget v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->foregroundColor:I

    const v3, -0x1000001

    if-eq v2, v3, :cond_1

    .line 6
    iget-object v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mBuilder:Landroid/text/SpannableStringBuilder;

    new-instance v4, Landroid/text/style/ForegroundColorSpan;

    iget v5, p0, Lcom/xuexiang/xui/utils/SpanUtils;->foregroundColor:I

    invoke-direct {v4, v5}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    iget v5, p0, Lcom/xuexiang/xui/utils/SpanUtils;->flag:I

    invoke-virtual {v2, v4, v0, v1, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 7
    :cond_1
    iget v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->backgroundColor:I

    if-eq v2, v3, :cond_2

    .line 8
    iget-object v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mBuilder:Landroid/text/SpannableStringBuilder;

    new-instance v4, Landroid/text/style/BackgroundColorSpan;

    iget v5, p0, Lcom/xuexiang/xui/utils/SpanUtils;->backgroundColor:I

    invoke-direct {v4, v5}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    iget v5, p0, Lcom/xuexiang/xui/utils/SpanUtils;->flag:I

    invoke-virtual {v2, v4, v0, v1, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 9
    :cond_2
    iget v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->first:I

    const/4 v4, -0x1

    if-eq v2, v4, :cond_3

    .line 10
    iget-object v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mBuilder:Landroid/text/SpannableStringBuilder;

    new-instance v5, Landroid/text/style/LeadingMarginSpan$Standard;

    iget v6, p0, Lcom/xuexiang/xui/utils/SpanUtils;->first:I

    iget v7, p0, Lcom/xuexiang/xui/utils/SpanUtils;->rest:I

    invoke-direct {v5, v6, v7}, Landroid/text/style/LeadingMarginSpan$Standard;-><init>(II)V

    iget v6, p0, Lcom/xuexiang/xui/utils/SpanUtils;->flag:I

    invoke-virtual {v2, v5, v0, v1, v6}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 11
    :cond_3
    iget v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->quoteColor:I

    const/4 v5, 0x0

    if-eq v2, v3, :cond_4

    .line 12
    iget-object v6, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mBuilder:Landroid/text/SpannableStringBuilder;

    new-instance v7, Lcom/xuexiang/xui/utils/SpanUtils$CustomQuoteSpan;

    iget v8, p0, Lcom/xuexiang/xui/utils/SpanUtils;->stripeWidth:I

    iget v9, p0, Lcom/xuexiang/xui/utils/SpanUtils;->quoteGapWidth:I

    invoke-direct {v7, v2, v8, v9, v5}, Lcom/xuexiang/xui/utils/SpanUtils$CustomQuoteSpan;-><init>(IIILcom/xuexiang/xui/utils/SpanUtils$1;)V

    iget v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->flag:I

    invoke-virtual {v6, v7, v0, v1, v2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 13
    :cond_4
    iget v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->bulletColor:I

    if-eq v2, v3, :cond_5

    .line 14
    iget-object v3, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mBuilder:Landroid/text/SpannableStringBuilder;

    new-instance v6, Lcom/xuexiang/xui/utils/SpanUtils$CustomBulletSpan;

    iget v7, p0, Lcom/xuexiang/xui/utils/SpanUtils;->bulletRadius:I

    iget v8, p0, Lcom/xuexiang/xui/utils/SpanUtils;->bulletGapWidth:I

    invoke-direct {v6, v2, v7, v8, v5}, Lcom/xuexiang/xui/utils/SpanUtils$CustomBulletSpan;-><init>(IIILcom/xuexiang/xui/utils/SpanUtils$1;)V

    iget v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->flag:I

    invoke-virtual {v3, v6, v0, v1, v2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 15
    :cond_5
    iget v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->iconMarginGapWidth:I

    if-eq v2, v4, :cond_9

    .line 16
    iget-object v3, p0, Lcom/xuexiang/xui/utils/SpanUtils;->iconMarginBitmap:Landroid/graphics/Bitmap;

    if-eqz v3, :cond_6

    .line 17
    iget-object v6, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mBuilder:Landroid/text/SpannableStringBuilder;

    new-instance v7, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;

    iget v8, p0, Lcom/xuexiang/xui/utils/SpanUtils;->alignIconMargin:I

    invoke-direct {v7, v3, v2, v8, v5}, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;-><init>(Landroid/graphics/Bitmap;IILcom/xuexiang/xui/utils/SpanUtils$1;)V

    iget v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->flag:I

    invoke-virtual {v6, v7, v0, v1, v2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    goto :goto_0

    .line 18
    :cond_6
    iget-object v3, p0, Lcom/xuexiang/xui/utils/SpanUtils;->iconMarginDrawable:Landroid/graphics/drawable/Drawable;

    if-eqz v3, :cond_7

    .line 19
    iget-object v6, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mBuilder:Landroid/text/SpannableStringBuilder;

    new-instance v7, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;

    iget v8, p0, Lcom/xuexiang/xui/utils/SpanUtils;->alignIconMargin:I

    invoke-direct {v7, v3, v2, v8, v5}, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;-><init>(Landroid/graphics/drawable/Drawable;IILcom/xuexiang/xui/utils/SpanUtils$1;)V

    iget v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->flag:I

    invoke-virtual {v6, v7, v0, v1, v2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    goto :goto_0

    .line 20
    :cond_7
    iget-object v3, p0, Lcom/xuexiang/xui/utils/SpanUtils;->iconMarginUri:Landroid/net/Uri;

    if-eqz v3, :cond_8

    .line 21
    iget-object v6, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mBuilder:Landroid/text/SpannableStringBuilder;

    new-instance v7, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;

    iget v8, p0, Lcom/xuexiang/xui/utils/SpanUtils;->alignIconMargin:I

    invoke-direct {v7, v3, v2, v8, v5}, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;-><init>(Landroid/net/Uri;IILcom/xuexiang/xui/utils/SpanUtils$1;)V

    iget v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->flag:I

    invoke-virtual {v6, v7, v0, v1, v2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    goto :goto_0

    .line 22
    :cond_8
    iget v3, p0, Lcom/xuexiang/xui/utils/SpanUtils;->iconMarginResourceId:I

    if-eq v3, v4, :cond_9

    .line 23
    iget-object v6, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mBuilder:Landroid/text/SpannableStringBuilder;

    new-instance v7, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;

    iget v8, p0, Lcom/xuexiang/xui/utils/SpanUtils;->alignIconMargin:I

    invoke-direct {v7, v3, v2, v8, v5}, Lcom/xuexiang/xui/utils/SpanUtils$CustomIconMarginSpan;-><init>(IIILcom/xuexiang/xui/utils/SpanUtils$1;)V

    iget v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->flag:I

    invoke-virtual {v6, v7, v0, v1, v2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 24
    :cond_9
    :goto_0
    iget v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->fontSize:I

    if-eq v2, v4, :cond_a

    .line 25
    iget-object v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mBuilder:Landroid/text/SpannableStringBuilder;

    new-instance v3, Landroid/text/style/AbsoluteSizeSpan;

    iget v6, p0, Lcom/xuexiang/xui/utils/SpanUtils;->fontSize:I

    iget-boolean v7, p0, Lcom/xuexiang/xui/utils/SpanUtils;->fontSizeIsDp:Z

    invoke-direct {v3, v6, v7}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    iget v6, p0, Lcom/xuexiang/xui/utils/SpanUtils;->flag:I

    invoke-virtual {v2, v3, v0, v1, v6}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 26
    :cond_a
    iget v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->proportion:F

    const/high16 v3, -0x40800000    # -1.0f

    cmpl-float v2, v2, v3

    if-eqz v2, :cond_b

    .line 27
    iget-object v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mBuilder:Landroid/text/SpannableStringBuilder;

    new-instance v6, Landroid/text/style/RelativeSizeSpan;

    iget v7, p0, Lcom/xuexiang/xui/utils/SpanUtils;->proportion:F

    invoke-direct {v6, v7}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    iget v7, p0, Lcom/xuexiang/xui/utils/SpanUtils;->flag:I

    invoke-virtual {v2, v6, v0, v1, v7}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 28
    :cond_b
    iget v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->xProportion:F

    cmpl-float v2, v2, v3

    if-eqz v2, :cond_c

    .line 29
    iget-object v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mBuilder:Landroid/text/SpannableStringBuilder;

    new-instance v6, Landroid/text/style/ScaleXSpan;

    iget v7, p0, Lcom/xuexiang/xui/utils/SpanUtils;->xProportion:F

    invoke-direct {v6, v7}, Landroid/text/style/ScaleXSpan;-><init>(F)V

    iget v7, p0, Lcom/xuexiang/xui/utils/SpanUtils;->flag:I

    invoke-virtual {v2, v6, v0, v1, v7}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 30
    :cond_c
    iget v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->lineHeight:I

    if-eq v2, v4, :cond_d

    .line 31
    iget-object v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mBuilder:Landroid/text/SpannableStringBuilder;

    new-instance v4, Lcom/xuexiang/xui/utils/SpanUtils$CustomLineHeightSpan;

    iget v6, p0, Lcom/xuexiang/xui/utils/SpanUtils;->lineHeight:I

    iget v7, p0, Lcom/xuexiang/xui/utils/SpanUtils;->alignLine:I

    invoke-direct {v4, v6, v7}, Lcom/xuexiang/xui/utils/SpanUtils$CustomLineHeightSpan;-><init>(II)V

    iget v6, p0, Lcom/xuexiang/xui/utils/SpanUtils;->flag:I

    invoke-virtual {v2, v4, v0, v1, v6}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 32
    :cond_d
    iget-boolean v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->isStrikethrough:Z

    if-eqz v2, :cond_e

    .line 33
    iget-object v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mBuilder:Landroid/text/SpannableStringBuilder;

    new-instance v4, Landroid/text/style/StrikethroughSpan;

    invoke-direct {v4}, Landroid/text/style/StrikethroughSpan;-><init>()V

    iget v6, p0, Lcom/xuexiang/xui/utils/SpanUtils;->flag:I

    invoke-virtual {v2, v4, v0, v1, v6}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 34
    :cond_e
    iget-boolean v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->isUnderline:Z

    if-eqz v2, :cond_f

    .line 35
    iget-object v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mBuilder:Landroid/text/SpannableStringBuilder;

    new-instance v4, Landroid/text/style/UnderlineSpan;

    invoke-direct {v4}, Landroid/text/style/UnderlineSpan;-><init>()V

    iget v6, p0, Lcom/xuexiang/xui/utils/SpanUtils;->flag:I

    invoke-virtual {v2, v4, v0, v1, v6}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 36
    :cond_f
    iget-boolean v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->isSuperscript:Z

    if-eqz v2, :cond_10

    .line 37
    iget-object v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mBuilder:Landroid/text/SpannableStringBuilder;

    new-instance v4, Landroid/text/style/SuperscriptSpan;

    invoke-direct {v4}, Landroid/text/style/SuperscriptSpan;-><init>()V

    iget v6, p0, Lcom/xuexiang/xui/utils/SpanUtils;->flag:I

    invoke-virtual {v2, v4, v0, v1, v6}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 38
    :cond_10
    iget-boolean v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->isSubscript:Z

    if-eqz v2, :cond_11

    .line 39
    iget-object v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mBuilder:Landroid/text/SpannableStringBuilder;

    new-instance v4, Landroid/text/style/SubscriptSpan;

    invoke-direct {v4}, Landroid/text/style/SubscriptSpan;-><init>()V

    iget v6, p0, Lcom/xuexiang/xui/utils/SpanUtils;->flag:I

    invoke-virtual {v2, v4, v0, v1, v6}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 40
    :cond_11
    iget-boolean v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->isBold:Z

    if-eqz v2, :cond_12

    .line 41
    iget-object v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mBuilder:Landroid/text/SpannableStringBuilder;

    new-instance v4, Landroid/text/style/StyleSpan;

    const/4 v6, 0x1

    invoke-direct {v4, v6}, Landroid/text/style/StyleSpan;-><init>(I)V

    iget v6, p0, Lcom/xuexiang/xui/utils/SpanUtils;->flag:I

    invoke-virtual {v2, v4, v0, v1, v6}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 42
    :cond_12
    iget-boolean v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->isItalic:Z

    if-eqz v2, :cond_13

    .line 43
    iget-object v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mBuilder:Landroid/text/SpannableStringBuilder;

    new-instance v4, Landroid/text/style/StyleSpan;

    const/4 v6, 0x2

    invoke-direct {v4, v6}, Landroid/text/style/StyleSpan;-><init>(I)V

    iget v6, p0, Lcom/xuexiang/xui/utils/SpanUtils;->flag:I

    invoke-virtual {v2, v4, v0, v1, v6}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 44
    :cond_13
    iget-boolean v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->isBoldItalic:Z

    if-eqz v2, :cond_14

    .line 45
    iget-object v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mBuilder:Landroid/text/SpannableStringBuilder;

    new-instance v4, Landroid/text/style/StyleSpan;

    const/4 v6, 0x3

    invoke-direct {v4, v6}, Landroid/text/style/StyleSpan;-><init>(I)V

    iget v6, p0, Lcom/xuexiang/xui/utils/SpanUtils;->flag:I

    invoke-virtual {v2, v4, v0, v1, v6}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 46
    :cond_14
    iget-object v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->fontFamily:Ljava/lang/String;

    if-eqz v2, :cond_15

    .line 47
    iget-object v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mBuilder:Landroid/text/SpannableStringBuilder;

    new-instance v4, Landroid/text/style/TypefaceSpan;

    iget-object v6, p0, Lcom/xuexiang/xui/utils/SpanUtils;->fontFamily:Ljava/lang/String;

    invoke-direct {v4, v6}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    iget v6, p0, Lcom/xuexiang/xui/utils/SpanUtils;->flag:I

    invoke-virtual {v2, v4, v0, v1, v6}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 48
    :cond_15
    iget-object v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->typeface:Landroid/graphics/Typeface;

    if-eqz v2, :cond_16

    .line 49
    iget-object v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mBuilder:Landroid/text/SpannableStringBuilder;

    new-instance v4, Lcom/xuexiang/xui/utils/SpanUtils$CustomTypefaceSpan;

    iget-object v6, p0, Lcom/xuexiang/xui/utils/SpanUtils;->typeface:Landroid/graphics/Typeface;

    invoke-direct {v4, v6, v5}, Lcom/xuexiang/xui/utils/SpanUtils$CustomTypefaceSpan;-><init>(Landroid/graphics/Typeface;Lcom/xuexiang/xui/utils/SpanUtils$1;)V

    iget v6, p0, Lcom/xuexiang/xui/utils/SpanUtils;->flag:I

    invoke-virtual {v2, v4, v0, v1, v6}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 50
    :cond_16
    iget-object v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->alignment:Landroid/text/Layout$Alignment;

    if-eqz v2, :cond_17

    .line 51
    iget-object v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mBuilder:Landroid/text/SpannableStringBuilder;

    new-instance v4, Landroid/text/style/AlignmentSpan$Standard;

    iget-object v6, p0, Lcom/xuexiang/xui/utils/SpanUtils;->alignment:Landroid/text/Layout$Alignment;

    invoke-direct {v4, v6}, Landroid/text/style/AlignmentSpan$Standard;-><init>(Landroid/text/Layout$Alignment;)V

    iget v6, p0, Lcom/xuexiang/xui/utils/SpanUtils;->flag:I

    invoke-virtual {v2, v4, v0, v1, v6}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 52
    :cond_17
    iget-object v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->clickSpan:Landroid/text/style/ClickableSpan;

    if-eqz v2, :cond_18

    .line 53
    iget-object v4, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mBuilder:Landroid/text/SpannableStringBuilder;

    iget v6, p0, Lcom/xuexiang/xui/utils/SpanUtils;->flag:I

    invoke-virtual {v4, v2, v0, v1, v6}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 54
    :cond_18
    iget-object v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->url:Ljava/lang/String;

    if-eqz v2, :cond_19

    .line 55
    iget-object v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mBuilder:Landroid/text/SpannableStringBuilder;

    new-instance v4, Landroid/text/style/URLSpan;

    iget-object v6, p0, Lcom/xuexiang/xui/utils/SpanUtils;->url:Ljava/lang/String;

    invoke-direct {v4, v6}, Landroid/text/style/URLSpan;-><init>(Ljava/lang/String;)V

    iget v6, p0, Lcom/xuexiang/xui/utils/SpanUtils;->flag:I

    invoke-virtual {v2, v4, v0, v1, v6}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 56
    :cond_19
    iget v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->blurRadius:F

    cmpl-float v2, v2, v3

    if-eqz v2, :cond_1a

    .line 57
    iget-object v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mBuilder:Landroid/text/SpannableStringBuilder;

    new-instance v4, Landroid/text/style/MaskFilterSpan;

    new-instance v6, Landroid/graphics/BlurMaskFilter;

    iget v7, p0, Lcom/xuexiang/xui/utils/SpanUtils;->blurRadius:F

    iget-object v8, p0, Lcom/xuexiang/xui/utils/SpanUtils;->style:Landroid/graphics/BlurMaskFilter$Blur;

    invoke-direct {v6, v7, v8}, Landroid/graphics/BlurMaskFilter;-><init>(FLandroid/graphics/BlurMaskFilter$Blur;)V

    invoke-direct {v4, v6}, Landroid/text/style/MaskFilterSpan;-><init>(Landroid/graphics/MaskFilter;)V

    iget v6, p0, Lcom/xuexiang/xui/utils/SpanUtils;->flag:I

    invoke-virtual {v2, v4, v0, v1, v6}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 58
    :cond_1a
    iget-object v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->shader:Landroid/graphics/Shader;

    if-eqz v2, :cond_1b

    .line 59
    iget-object v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mBuilder:Landroid/text/SpannableStringBuilder;

    new-instance v4, Lcom/xuexiang/xui/utils/SpanUtils$ShaderSpan;

    iget-object v6, p0, Lcom/xuexiang/xui/utils/SpanUtils;->shader:Landroid/graphics/Shader;

    invoke-direct {v4, v6, v5}, Lcom/xuexiang/xui/utils/SpanUtils$ShaderSpan;-><init>(Landroid/graphics/Shader;Lcom/xuexiang/xui/utils/SpanUtils$1;)V

    iget v5, p0, Lcom/xuexiang/xui/utils/SpanUtils;->flag:I

    invoke-virtual {v2, v4, v0, v1, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 60
    :cond_1b
    iget v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->shadowRadius:F

    cmpl-float v2, v2, v3

    if-eqz v2, :cond_1c

    .line 61
    iget-object v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mBuilder:Landroid/text/SpannableStringBuilder;

    new-instance v9, Lcom/xuexiang/xui/utils/SpanUtils$ShadowSpan;

    iget v4, p0, Lcom/xuexiang/xui/utils/SpanUtils;->shadowRadius:F

    iget v5, p0, Lcom/xuexiang/xui/utils/SpanUtils;->shadowDx:F

    iget v6, p0, Lcom/xuexiang/xui/utils/SpanUtils;->shadowDy:F

    iget v7, p0, Lcom/xuexiang/xui/utils/SpanUtils;->shadowColor:I

    const/4 v8, 0x0

    move-object v3, v9

    invoke-direct/range {v3 .. v8}, Lcom/xuexiang/xui/utils/SpanUtils$ShadowSpan;-><init>(FFFILcom/xuexiang/xui/utils/SpanUtils$1;)V

    iget v3, p0, Lcom/xuexiang/xui/utils/SpanUtils;->flag:I

    invoke-virtual {v2, v9, v0, v1, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 62
    :cond_1c
    iget-object v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->spans:[Ljava/lang/Object;

    if-eqz v2, :cond_1d

    .line 63
    array-length v3, v2

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_1d

    aget-object v5, v2, v4

    .line 64
    iget-object v6, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mBuilder:Landroid/text/SpannableStringBuilder;

    iget v7, p0, Lcom/xuexiang/xui/utils/SpanUtils;->flag:I

    invoke-virtual {v6, v5, v0, v1, v7}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1d
    return-void
.end method

.method private updateImage()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mBuilder:Landroid/text/SpannableStringBuilder;

    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mBuilder:Landroid/text/SpannableStringBuilder;

    const-string v2, "<img>"

    invoke-virtual {v1, v2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    add-int/lit8 v1, v0, 0x5

    .line 3
    iget-object v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->imageBitmap:Landroid/graphics/Bitmap;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    .line 4
    iget-object v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mBuilder:Landroid/text/SpannableStringBuilder;

    new-instance v4, Lcom/xuexiang/xui/utils/SpanUtils$CustomImageSpan;

    iget-object v5, p0, Lcom/xuexiang/xui/utils/SpanUtils;->imageBitmap:Landroid/graphics/Bitmap;

    iget v6, p0, Lcom/xuexiang/xui/utils/SpanUtils;->alignImage:I

    invoke-direct {v4, p0, v5, v6, v3}, Lcom/xuexiang/xui/utils/SpanUtils$CustomImageSpan;-><init>(Lcom/xuexiang/xui/utils/SpanUtils;Landroid/graphics/Bitmap;ILcom/xuexiang/xui/utils/SpanUtils$1;)V

    iget v3, p0, Lcom/xuexiang/xui/utils/SpanUtils;->flag:I

    invoke-virtual {v2, v4, v0, v1, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->imageDrawable:Landroid/graphics/drawable/Drawable;

    if-eqz v2, :cond_1

    .line 6
    iget-object v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mBuilder:Landroid/text/SpannableStringBuilder;

    new-instance v4, Lcom/xuexiang/xui/utils/SpanUtils$CustomImageSpan;

    iget-object v5, p0, Lcom/xuexiang/xui/utils/SpanUtils;->imageDrawable:Landroid/graphics/drawable/Drawable;

    iget v6, p0, Lcom/xuexiang/xui/utils/SpanUtils;->alignImage:I

    invoke-direct {v4, p0, v5, v6, v3}, Lcom/xuexiang/xui/utils/SpanUtils$CustomImageSpan;-><init>(Lcom/xuexiang/xui/utils/SpanUtils;Landroid/graphics/drawable/Drawable;ILcom/xuexiang/xui/utils/SpanUtils$1;)V

    iget v3, p0, Lcom/xuexiang/xui/utils/SpanUtils;->flag:I

    invoke-virtual {v2, v4, v0, v1, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    goto :goto_0

    .line 7
    :cond_1
    iget-object v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->imageUri:Landroid/net/Uri;

    if-eqz v2, :cond_2

    .line 8
    iget-object v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mBuilder:Landroid/text/SpannableStringBuilder;

    new-instance v4, Lcom/xuexiang/xui/utils/SpanUtils$CustomImageSpan;

    iget-object v5, p0, Lcom/xuexiang/xui/utils/SpanUtils;->imageUri:Landroid/net/Uri;

    iget v6, p0, Lcom/xuexiang/xui/utils/SpanUtils;->alignImage:I

    invoke-direct {v4, p0, v5, v6, v3}, Lcom/xuexiang/xui/utils/SpanUtils$CustomImageSpan;-><init>(Lcom/xuexiang/xui/utils/SpanUtils;Landroid/net/Uri;ILcom/xuexiang/xui/utils/SpanUtils$1;)V

    iget v3, p0, Lcom/xuexiang/xui/utils/SpanUtils;->flag:I

    invoke-virtual {v2, v4, v0, v1, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    goto :goto_0

    .line 9
    :cond_2
    iget v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->imageResourceId:I

    const/4 v4, -0x1

    if-eq v2, v4, :cond_3

    .line 10
    iget-object v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mBuilder:Landroid/text/SpannableStringBuilder;

    new-instance v4, Lcom/xuexiang/xui/utils/SpanUtils$CustomImageSpan;

    iget v5, p0, Lcom/xuexiang/xui/utils/SpanUtils;->imageResourceId:I

    iget v6, p0, Lcom/xuexiang/xui/utils/SpanUtils;->alignImage:I

    invoke-direct {v4, p0, v5, v6, v3}, Lcom/xuexiang/xui/utils/SpanUtils$CustomImageSpan;-><init>(Lcom/xuexiang/xui/utils/SpanUtils;IILcom/xuexiang/xui/utils/SpanUtils$1;)V

    iget v3, p0, Lcom/xuexiang/xui/utils/SpanUtils;->flag:I

    invoke-virtual {v2, v4, v0, v1, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    :cond_3
    :goto_0
    return-void
.end method

.method private updateSpace()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mBuilder:Landroid/text/SpannableStringBuilder;

    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mBuilder:Landroid/text/SpannableStringBuilder;

    const-string v2, "< >"

    invoke-virtual {v1, v2}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    add-int/lit8 v1, v0, 0x3

    .line 3
    iget-object v2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mBuilder:Landroid/text/SpannableStringBuilder;

    new-instance v3, Lcom/xuexiang/xui/utils/SpanUtils$SpaceSpan;

    iget v4, p0, Lcom/xuexiang/xui/utils/SpanUtils;->spaceSize:I

    iget v5, p0, Lcom/xuexiang/xui/utils/SpanUtils;->spaceColor:I

    const/4 v6, 0x0

    invoke-direct {v3, v4, v5, v6}, Lcom/xuexiang/xui/utils/SpanUtils$SpaceSpan;-><init>(IILcom/xuexiang/xui/utils/SpanUtils$1;)V

    iget v4, p0, Lcom/xuexiang/xui/utils/SpanUtils;->flag:I

    invoke-virtual {v2, v3, v0, v1, v4}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    return-void
.end method


# virtual methods
.method public append(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/utils/SpanUtils;->apply(I)V

    .line 2
    iput-object p1, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mText:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public appendImage(I)Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 1

    const/4 v0, 0x0

    .line 13
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/utils/SpanUtils;->appendImage(II)Lcom/xuexiang/xui/utils/SpanUtils;

    move-result-object p1

    return-object p1
.end method

.method public appendImage(II)Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 1

    const/4 v0, 0x1

    .line 14
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/utils/SpanUtils;->apply(I)V

    .line 15
    iput p1, p0, Lcom/xuexiang/xui/utils/SpanUtils;->imageResourceId:I

    .line 16
    iput p2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->alignImage:I

    return-object p0
.end method

.method public appendImage(Landroid/graphics/Bitmap;)Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/utils/SpanUtils;->appendImage(Landroid/graphics/Bitmap;I)Lcom/xuexiang/xui/utils/SpanUtils;

    move-result-object p1

    return-object p1
.end method

.method public appendImage(Landroid/graphics/Bitmap;I)Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 1

    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/utils/SpanUtils;->apply(I)V

    .line 3
    iput-object p1, p0, Lcom/xuexiang/xui/utils/SpanUtils;->imageBitmap:Landroid/graphics/Bitmap;

    .line 4
    iput p2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->alignImage:I

    return-object p0
.end method

.method public appendImage(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 1

    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/utils/SpanUtils;->appendImage(Landroid/graphics/drawable/Drawable;I)Lcom/xuexiang/xui/utils/SpanUtils;

    move-result-object p1

    return-object p1
.end method

.method public appendImage(Landroid/graphics/drawable/Drawable;I)Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 1

    const/4 v0, 0x1

    .line 6
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/utils/SpanUtils;->apply(I)V

    .line 7
    iput-object p1, p0, Lcom/xuexiang/xui/utils/SpanUtils;->imageDrawable:Landroid/graphics/drawable/Drawable;

    .line 8
    iput p2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->alignImage:I

    return-object p0
.end method

.method public appendImage(Landroid/net/Uri;)Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 1

    const/4 v0, 0x0

    .line 9
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/utils/SpanUtils;->appendImage(Landroid/net/Uri;I)Lcom/xuexiang/xui/utils/SpanUtils;

    move-result-object p1

    return-object p1
.end method

.method public appendImage(Landroid/net/Uri;I)Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 1

    const/4 v0, 0x1

    .line 10
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/utils/SpanUtils;->apply(I)V

    .line 11
    iput-object p1, p0, Lcom/xuexiang/xui/utils/SpanUtils;->imageUri:Landroid/net/Uri;

    .line 12
    iput p2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->alignImage:I

    return-object p0
.end method

.method public appendLine()Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/utils/SpanUtils;->apply(I)V

    .line 2
    sget-object v0, Lcom/xuexiang/xui/utils/SpanUtils;->LINE_SEPARATOR:Ljava/lang/String;

    iput-object v0, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mText:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public appendLine(Ljava/lang/CharSequence;)Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 1

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/utils/SpanUtils;->apply(I)V

    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object p1, Lcom/xuexiang/xui/utils/SpanUtils;->LINE_SEPARATOR:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mText:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public appendSpace(I)Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/utils/SpanUtils;->appendSpace(II)Lcom/xuexiang/xui/utils/SpanUtils;

    move-result-object p1

    return-object p1
.end method

.method public appendSpace(II)Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 1

    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/utils/SpanUtils;->apply(I)V

    .line 3
    iput p1, p0, Lcom/xuexiang/xui/utils/SpanUtils;->spaceSize:I

    .line 4
    iput p2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->spaceColor:I

    return-object p0
.end method

.method public create()Landroid/text/SpannableStringBuilder;
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/xuexiang/xui/utils/SpanUtils;->applyLast()V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/utils/SpanUtils;->mBuilder:Landroid/text/SpannableStringBuilder;

    return-object v0
.end method

.method public setAlign(Landroid/text/Layout$Alignment;)Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/utils/SpanUtils;->alignment:Landroid/text/Layout$Alignment;

    return-object p0
.end method

.method public setBackgroundColor(I)Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/utils/SpanUtils;->backgroundColor:I

    return-object p0
.end method

.method public setBlur(FLandroid/graphics/BlurMaskFilter$Blur;)Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/utils/SpanUtils;->blurRadius:F

    .line 2
    iput-object p2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->style:Landroid/graphics/BlurMaskFilter$Blur;

    return-object p0
.end method

.method public setBold()Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/xuexiang/xui/utils/SpanUtils;->isBold:Z

    return-object p0
.end method

.method public setBoldItalic()Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/xuexiang/xui/utils/SpanUtils;->isBoldItalic:Z

    return-object p0
.end method

.method public setBullet(I)Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x3

    .line 1
    invoke-virtual {p0, v0, v1, p1}, Lcom/xuexiang/xui/utils/SpanUtils;->setBullet(III)Lcom/xuexiang/xui/utils/SpanUtils;

    move-result-object p1

    return-object p1
.end method

.method public setBullet(III)Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 0

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/utils/SpanUtils;->bulletColor:I

    .line 3
    iput p2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->bulletRadius:I

    .line 4
    iput p3, p0, Lcom/xuexiang/xui/utils/SpanUtils;->bulletGapWidth:I

    return-object p0
.end method

.method public setClickSpan(Landroid/text/style/ClickableSpan;)Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/utils/SpanUtils;->clickSpan:Landroid/text/style/ClickableSpan;

    return-object p0
.end method

.method public setFlag(I)Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/utils/SpanUtils;->flag:I

    return-object p0
.end method

.method public setFontFamily(Ljava/lang/String;)Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/utils/SpanUtils;->fontFamily:Ljava/lang/String;

    return-object p0
.end method

.method public setFontProportion(F)Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/utils/SpanUtils;->proportion:F

    return-object p0
.end method

.method public setFontSize(I)Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/utils/SpanUtils;->setFontSize(IZ)Lcom/xuexiang/xui/utils/SpanUtils;

    move-result-object p1

    return-object p1
.end method

.method public setFontSize(IZ)Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 0

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/utils/SpanUtils;->fontSize:I

    .line 3
    iput-boolean p2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->fontSizeIsDp:Z

    return-object p0
.end method

.method public setFontXProportion(F)Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/utils/SpanUtils;->xProportion:F

    return-object p0
.end method

.method public setForegroundColor(I)Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/utils/SpanUtils;->foregroundColor:I

    return-object p0
.end method

.method public setIconMargin(I)Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x2

    .line 13
    invoke-virtual {p0, p1, v0, v1}, Lcom/xuexiang/xui/utils/SpanUtils;->setIconMargin(III)Lcom/xuexiang/xui/utils/SpanUtils;

    move-result-object p1

    return-object p1
.end method

.method public setIconMargin(III)Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 0

    .line 14
    iput p1, p0, Lcom/xuexiang/xui/utils/SpanUtils;->iconMarginResourceId:I

    .line 15
    iput p2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->iconMarginGapWidth:I

    .line 16
    iput p3, p0, Lcom/xuexiang/xui/utils/SpanUtils;->alignIconMargin:I

    return-object p0
.end method

.method public setIconMargin(Landroid/graphics/Bitmap;)Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x2

    .line 1
    invoke-virtual {p0, p1, v0, v1}, Lcom/xuexiang/xui/utils/SpanUtils;->setIconMargin(Landroid/graphics/Bitmap;II)Lcom/xuexiang/xui/utils/SpanUtils;

    move-result-object p1

    return-object p1
.end method

.method public setIconMargin(Landroid/graphics/Bitmap;II)Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/xuexiang/xui/utils/SpanUtils;->iconMarginBitmap:Landroid/graphics/Bitmap;

    .line 3
    iput p2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->iconMarginGapWidth:I

    .line 4
    iput p3, p0, Lcom/xuexiang/xui/utils/SpanUtils;->alignIconMargin:I

    return-object p0
.end method

.method public setIconMargin(Landroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x2

    .line 5
    invoke-virtual {p0, p1, v0, v1}, Lcom/xuexiang/xui/utils/SpanUtils;->setIconMargin(Landroid/graphics/drawable/Drawable;II)Lcom/xuexiang/xui/utils/SpanUtils;

    move-result-object p1

    return-object p1
.end method

.method public setIconMargin(Landroid/graphics/drawable/Drawable;II)Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 0

    .line 6
    iput-object p1, p0, Lcom/xuexiang/xui/utils/SpanUtils;->iconMarginDrawable:Landroid/graphics/drawable/Drawable;

    .line 7
    iput p2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->iconMarginGapWidth:I

    .line 8
    iput p3, p0, Lcom/xuexiang/xui/utils/SpanUtils;->alignIconMargin:I

    return-object p0
.end method

.method public setIconMargin(Landroid/net/Uri;)Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x2

    .line 9
    invoke-virtual {p0, p1, v0, v1}, Lcom/xuexiang/xui/utils/SpanUtils;->setIconMargin(Landroid/net/Uri;II)Lcom/xuexiang/xui/utils/SpanUtils;

    move-result-object p1

    return-object p1
.end method

.method public setIconMargin(Landroid/net/Uri;II)Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 0

    .line 10
    iput-object p1, p0, Lcom/xuexiang/xui/utils/SpanUtils;->iconMarginUri:Landroid/net/Uri;

    .line 11
    iput p2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->iconMarginGapWidth:I

    .line 12
    iput p3, p0, Lcom/xuexiang/xui/utils/SpanUtils;->alignIconMargin:I

    return-object p0
.end method

.method public setItalic()Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/xuexiang/xui/utils/SpanUtils;->isItalic:Z

    return-object p0
.end method

.method public setLeadingMargin(II)Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/utils/SpanUtils;->first:I

    .line 2
    iput p2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->rest:I

    return-object p0
.end method

.method public setLineHeight(I)Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 1

    const/4 v0, 0x2

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/utils/SpanUtils;->setLineHeight(II)Lcom/xuexiang/xui/utils/SpanUtils;

    move-result-object p1

    return-object p1
.end method

.method public setLineHeight(II)Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 0

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/utils/SpanUtils;->lineHeight:I

    .line 3
    iput p2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->alignLine:I

    return-object p0
.end method

.method public setQuoteColor(I)Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 1

    const/4 v0, 0x2

    .line 1
    invoke-virtual {p0, p1, v0, v0}, Lcom/xuexiang/xui/utils/SpanUtils;->setQuoteColor(III)Lcom/xuexiang/xui/utils/SpanUtils;

    move-result-object p1

    return-object p1
.end method

.method public setQuoteColor(III)Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 0

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/utils/SpanUtils;->quoteColor:I

    .line 3
    iput p2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->stripeWidth:I

    .line 4
    iput p3, p0, Lcom/xuexiang/xui/utils/SpanUtils;->quoteGapWidth:I

    return-object p0
.end method

.method public setShader(Landroid/graphics/Shader;)Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/utils/SpanUtils;->shader:Landroid/graphics/Shader;

    return-object p0
.end method

.method public setShadow(FFFI)Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/utils/SpanUtils;->shadowRadius:F

    .line 2
    iput p2, p0, Lcom/xuexiang/xui/utils/SpanUtils;->shadowDx:F

    .line 3
    iput p3, p0, Lcom/xuexiang/xui/utils/SpanUtils;->shadowDy:F

    .line 4
    iput p4, p0, Lcom/xuexiang/xui/utils/SpanUtils;->shadowColor:I

    return-object p0
.end method

.method public varargs setSpans([Ljava/lang/Object;)Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 1

    .line 1
    array-length v0, p1

    if-lez v0, :cond_0

    .line 2
    iput-object p1, p0, Lcom/xuexiang/xui/utils/SpanUtils;->spans:[Ljava/lang/Object;

    :cond_0
    return-object p0
.end method

.method public setStrikethrough()Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/xuexiang/xui/utils/SpanUtils;->isStrikethrough:Z

    return-object p0
.end method

.method public setSubscript()Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/xuexiang/xui/utils/SpanUtils;->isSubscript:Z

    return-object p0
.end method

.method public setSuperscript()Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/xuexiang/xui/utils/SpanUtils;->isSuperscript:Z

    return-object p0
.end method

.method public setTypeface(Landroid/graphics/Typeface;)Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/utils/SpanUtils;->typeface:Landroid/graphics/Typeface;

    return-object p0
.end method

.method public setUnderline()Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/xuexiang/xui/utils/SpanUtils;->isUnderline:Z

    return-object p0
.end method

.method public setUrl(Ljava/lang/String;)Lcom/xuexiang/xui/utils/SpanUtils;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/utils/SpanUtils;->url:Ljava/lang/String;

    return-object p0
.end method
