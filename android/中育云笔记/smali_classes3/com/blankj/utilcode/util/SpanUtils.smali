.class public final Lcom/blankj/utilcode/util/SpanUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/blankj/utilcode/util/SpanUtils$SerializableSpannableStringBuilder;,
        Lcom/blankj/utilcode/util/SpanUtils$ShadowSpan;,
        Lcom/blankj/utilcode/util/SpanUtils$ShaderSpan;,
        Lcom/blankj/utilcode/util/SpanUtils$CustomDynamicDrawableSpan;,
        Lcom/blankj/utilcode/util/SpanUtils$CustomImageSpan;,
        Lcom/blankj/utilcode/util/SpanUtils$CustomTypefaceSpan;,
        Lcom/blankj/utilcode/util/SpanUtils$CustomBulletSpan;,
        Lcom/blankj/utilcode/util/SpanUtils$CustomQuoteSpan;,
        Lcom/blankj/utilcode/util/SpanUtils$SpaceSpan;,
        Lcom/blankj/utilcode/util/SpanUtils$CustomLineHeightSpan;,
        Lcom/blankj/utilcode/util/SpanUtils$VerticalAlignSpan;,
        Lcom/blankj/utilcode/util/SpanUtils$Align;
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

.field private foregroundColor:I

.field private imageBitmap:Landroid/graphics/Bitmap;

.field private imageDrawable:Landroid/graphics/drawable/Drawable;

.field private imageResourceId:I

.field private imageUri:Landroid/net/Uri;

.field private isBold:Z

.field private isBoldItalic:Z

.field private isCreated:Z

.field private isItalic:Z

.field private isStrikethrough:Z

.field private isSubscript:Z

.field private isSuperscript:Z

.field private isUnderline:Z

.field private lineHeight:I

.field private mBuilder:Lcom/blankj/utilcode/util/SpanUtils$SerializableSpannableStringBuilder;

.field private mText:Ljava/lang/CharSequence;

.field private mTextView:Landroid/widget/TextView;

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

.field private verticalAlign:I

.field private xProportion:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "line.separator"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lcom/blankj/utilcode/util/SpanUtils;->LINE_SEPARATOR:Ljava/lang/String;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lcom/blankj/utilcode/util/SpanUtils;->mTypeCharSequence:I

    const/4 v0, 0x1

    .line 5
    iput v0, p0, Lcom/blankj/utilcode/util/SpanUtils;->mTypeImage:I

    const/4 v0, 0x2

    .line 6
    iput v0, p0, Lcom/blankj/utilcode/util/SpanUtils;->mTypeSpace:I

    .line 7
    new-instance v0, Lcom/blankj/utilcode/util/SpanUtils$SerializableSpannableStringBuilder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/blankj/utilcode/util/SpanUtils$SerializableSpannableStringBuilder;-><init>(Lcom/blankj/utilcode/util/SpanUtils$1;)V

    iput-object v0, p0, Lcom/blankj/utilcode/util/SpanUtils;->mBuilder:Lcom/blankj/utilcode/util/SpanUtils$SerializableSpannableStringBuilder;

    .line 8
    const-string v0, ""

    iput-object v0, p0, Lcom/blankj/utilcode/util/SpanUtils;->mText:Ljava/lang/CharSequence;

    const/4 v0, -0x1

    .line 9
    iput v0, p0, Lcom/blankj/utilcode/util/SpanUtils;->mType:I

    .line 10
    invoke-direct {p0}, Lcom/blankj/utilcode/util/SpanUtils;->setDefault()V

    return-void
.end method

.method private constructor <init>(Landroid/widget/TextView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/blankj/utilcode/util/SpanUtils;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/blankj/utilcode/util/SpanUtils;->mTextView:Landroid/widget/TextView;

    return-void
.end method

.method private apply(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/blankj/utilcode/util/SpanUtils;->applyLast()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/blankj/utilcode/util/SpanUtils;->mType:I

    .line 5
    .line 6
    return-void
.end method

.method private applyLast()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/blankj/utilcode/util/SpanUtils;->isCreated:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget v0, p0, Lcom/blankj/utilcode/util/SpanUtils;->mType:I

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    invoke-direct {p0}, Lcom/blankj/utilcode/util/SpanUtils;->updateCharCharSequence()V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_1
    const/4 v1, 0x1

    .line 15
    if-ne v0, v1, :cond_2

    .line 16
    .line 17
    invoke-direct {p0}, Lcom/blankj/utilcode/util/SpanUtils;->updateImage()V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_2
    const/4 v1, 0x2

    .line 22
    if-ne v0, v1, :cond_3

    .line 23
    .line 24
    invoke-direct {p0}, Lcom/blankj/utilcode/util/SpanUtils;->updateSpace()V

    .line 25
    .line 26
    .line 27
    :cond_3
    :goto_0
    invoke-direct {p0}, Lcom/blankj/utilcode/util/SpanUtils;->setDefault()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method private setDefault()V
    .locals 3

    .line 1
    const/16 v0, 0x21

    .line 2
    .line 3
    iput v0, p0, Lcom/blankj/utilcode/util/SpanUtils;->flag:I

    .line 4
    .line 5
    const v0, -0x1000001

    .line 6
    .line 7
    .line 8
    iput v0, p0, Lcom/blankj/utilcode/util/SpanUtils;->foregroundColor:I

    .line 9
    .line 10
    iput v0, p0, Lcom/blankj/utilcode/util/SpanUtils;->backgroundColor:I

    .line 11
    .line 12
    const/4 v1, -0x1

    .line 13
    iput v1, p0, Lcom/blankj/utilcode/util/SpanUtils;->lineHeight:I

    .line 14
    .line 15
    iput v0, p0, Lcom/blankj/utilcode/util/SpanUtils;->quoteColor:I

    .line 16
    .line 17
    iput v1, p0, Lcom/blankj/utilcode/util/SpanUtils;->first:I

    .line 18
    .line 19
    iput v0, p0, Lcom/blankj/utilcode/util/SpanUtils;->bulletColor:I

    .line 20
    .line 21
    iput v1, p0, Lcom/blankj/utilcode/util/SpanUtils;->fontSize:I

    .line 22
    .line 23
    const/high16 v0, -0x40800000    # -1.0f

    .line 24
    .line 25
    iput v0, p0, Lcom/blankj/utilcode/util/SpanUtils;->proportion:F

    .line 26
    .line 27
    iput v0, p0, Lcom/blankj/utilcode/util/SpanUtils;->xProportion:F

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    iput-boolean v2, p0, Lcom/blankj/utilcode/util/SpanUtils;->isStrikethrough:Z

    .line 31
    .line 32
    iput-boolean v2, p0, Lcom/blankj/utilcode/util/SpanUtils;->isUnderline:Z

    .line 33
    .line 34
    iput-boolean v2, p0, Lcom/blankj/utilcode/util/SpanUtils;->isSuperscript:Z

    .line 35
    .line 36
    iput-boolean v2, p0, Lcom/blankj/utilcode/util/SpanUtils;->isSubscript:Z

    .line 37
    .line 38
    iput-boolean v2, p0, Lcom/blankj/utilcode/util/SpanUtils;->isBold:Z

    .line 39
    .line 40
    iput-boolean v2, p0, Lcom/blankj/utilcode/util/SpanUtils;->isItalic:Z

    .line 41
    .line 42
    iput-boolean v2, p0, Lcom/blankj/utilcode/util/SpanUtils;->isBoldItalic:Z

    .line 43
    .line 44
    const/4 v2, 0x0

    .line 45
    iput-object v2, p0, Lcom/blankj/utilcode/util/SpanUtils;->fontFamily:Ljava/lang/String;

    .line 46
    .line 47
    iput-object v2, p0, Lcom/blankj/utilcode/util/SpanUtils;->typeface:Landroid/graphics/Typeface;

    .line 48
    .line 49
    iput-object v2, p0, Lcom/blankj/utilcode/util/SpanUtils;->alignment:Landroid/text/Layout$Alignment;

    .line 50
    .line 51
    iput v1, p0, Lcom/blankj/utilcode/util/SpanUtils;->verticalAlign:I

    .line 52
    .line 53
    iput-object v2, p0, Lcom/blankj/utilcode/util/SpanUtils;->clickSpan:Landroid/text/style/ClickableSpan;

    .line 54
    .line 55
    iput-object v2, p0, Lcom/blankj/utilcode/util/SpanUtils;->url:Ljava/lang/String;

    .line 56
    .line 57
    iput v0, p0, Lcom/blankj/utilcode/util/SpanUtils;->blurRadius:F

    .line 58
    .line 59
    iput-object v2, p0, Lcom/blankj/utilcode/util/SpanUtils;->shader:Landroid/graphics/Shader;

    .line 60
    .line 61
    iput v0, p0, Lcom/blankj/utilcode/util/SpanUtils;->shadowRadius:F

    .line 62
    .line 63
    iput-object v2, p0, Lcom/blankj/utilcode/util/SpanUtils;->spans:[Ljava/lang/Object;

    .line 64
    .line 65
    iput-object v2, p0, Lcom/blankj/utilcode/util/SpanUtils;->imageBitmap:Landroid/graphics/Bitmap;

    .line 66
    .line 67
    iput-object v2, p0, Lcom/blankj/utilcode/util/SpanUtils;->imageDrawable:Landroid/graphics/drawable/Drawable;

    .line 68
    .line 69
    iput-object v2, p0, Lcom/blankj/utilcode/util/SpanUtils;->imageUri:Landroid/net/Uri;

    .line 70
    .line 71
    iput v1, p0, Lcom/blankj/utilcode/util/SpanUtils;->imageResourceId:I

    .line 72
    .line 73
    iput v1, p0, Lcom/blankj/utilcode/util/SpanUtils;->spaceSize:I

    .line 74
    .line 75
    return-void
.end method

.method private setMovementMethodIfNeed()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/blankj/utilcode/util/SpanUtils;->mTextView:Landroid/widget/TextView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/widget/TextView;->getMovementMethod()Landroid/text/method/MovementMethod;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/blankj/utilcode/util/SpanUtils;->mTextView:Landroid/widget/TextView;

    .line 12
    .line 13
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method private updateCharCharSequence()V
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/blankj/utilcode/util/SpanUtils;->mText:Ljava/lang/CharSequence;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_1

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/blankj/utilcode/util/SpanUtils;->mBuilder:Lcom/blankj/utilcode/util/SpanUtils$SerializableSpannableStringBuilder;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x0

    .line 18
    const/4 v2, 0x2

    .line 19
    const/4 v3, -0x1

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    iget v4, p0, Lcom/blankj/utilcode/util/SpanUtils;->lineHeight:I

    .line 23
    .line 24
    if-eq v4, v3, :cond_1

    .line 25
    .line 26
    iget-object v0, p0, Lcom/blankj/utilcode/util/SpanUtils;->mBuilder:Lcom/blankj/utilcode/util/SpanUtils$SerializableSpannableStringBuilder;

    .line 27
    .line 28
    invoke-static {v2}, Ljava/lang/Character;->toString(C)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-virtual {v0, v4}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const-string v4, "\n"

    .line 37
    .line 38
    invoke-virtual {v0, v4}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    new-instance v4, Landroid/text/style/AbsoluteSizeSpan;

    .line 43
    .line 44
    invoke-direct {v4, v1}, Landroid/text/style/AbsoluteSizeSpan;-><init>(I)V

    .line 45
    .line 46
    .line 47
    const/16 v5, 0x21

    .line 48
    .line 49
    invoke-virtual {v0, v4, v1, v2, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 50
    .line 51
    .line 52
    move v0, v2

    .line 53
    :cond_1
    iget-object v4, p0, Lcom/blankj/utilcode/util/SpanUtils;->mBuilder:Lcom/blankj/utilcode/util/SpanUtils$SerializableSpannableStringBuilder;

    .line 54
    .line 55
    iget-object v5, p0, Lcom/blankj/utilcode/util/SpanUtils;->mText:Ljava/lang/CharSequence;

    .line 56
    .line 57
    invoke-virtual {v4, v5}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 58
    .line 59
    .line 60
    iget-object v4, p0, Lcom/blankj/utilcode/util/SpanUtils;->mBuilder:Lcom/blankj/utilcode/util/SpanUtils$SerializableSpannableStringBuilder;

    .line 61
    .line 62
    invoke-virtual {v4}, Landroid/text/SpannableStringBuilder;->length()I

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    iget v5, p0, Lcom/blankj/utilcode/util/SpanUtils;->verticalAlign:I

    .line 67
    .line 68
    if-eq v5, v3, :cond_2

    .line 69
    .line 70
    iget-object v5, p0, Lcom/blankj/utilcode/util/SpanUtils;->mBuilder:Lcom/blankj/utilcode/util/SpanUtils$SerializableSpannableStringBuilder;

    .line 71
    .line 72
    new-instance v6, Lcom/blankj/utilcode/util/SpanUtils$VerticalAlignSpan;

    .line 73
    .line 74
    iget v7, p0, Lcom/blankj/utilcode/util/SpanUtils;->verticalAlign:I

    .line 75
    .line 76
    invoke-direct {v6, v7}, Lcom/blankj/utilcode/util/SpanUtils$VerticalAlignSpan;-><init>(I)V

    .line 77
    .line 78
    .line 79
    iget v7, p0, Lcom/blankj/utilcode/util/SpanUtils;->flag:I

    .line 80
    .line 81
    invoke-virtual {v5, v6, v0, v4, v7}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 82
    .line 83
    .line 84
    :cond_2
    iget v5, p0, Lcom/blankj/utilcode/util/SpanUtils;->foregroundColor:I

    .line 85
    .line 86
    const v6, -0x1000001

    .line 87
    .line 88
    .line 89
    if-eq v5, v6, :cond_3

    .line 90
    .line 91
    iget-object v5, p0, Lcom/blankj/utilcode/util/SpanUtils;->mBuilder:Lcom/blankj/utilcode/util/SpanUtils$SerializableSpannableStringBuilder;

    .line 92
    .line 93
    new-instance v7, Landroid/text/style/ForegroundColorSpan;

    .line 94
    .line 95
    iget v8, p0, Lcom/blankj/utilcode/util/SpanUtils;->foregroundColor:I

    .line 96
    .line 97
    invoke-direct {v7, v8}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 98
    .line 99
    .line 100
    iget v8, p0, Lcom/blankj/utilcode/util/SpanUtils;->flag:I

    .line 101
    .line 102
    invoke-virtual {v5, v7, v0, v4, v8}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 103
    .line 104
    .line 105
    :cond_3
    iget v5, p0, Lcom/blankj/utilcode/util/SpanUtils;->backgroundColor:I

    .line 106
    .line 107
    if-eq v5, v6, :cond_4

    .line 108
    .line 109
    iget-object v5, p0, Lcom/blankj/utilcode/util/SpanUtils;->mBuilder:Lcom/blankj/utilcode/util/SpanUtils$SerializableSpannableStringBuilder;

    .line 110
    .line 111
    new-instance v7, Landroid/text/style/BackgroundColorSpan;

    .line 112
    .line 113
    iget v8, p0, Lcom/blankj/utilcode/util/SpanUtils;->backgroundColor:I

    .line 114
    .line 115
    invoke-direct {v7, v8}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 116
    .line 117
    .line 118
    iget v8, p0, Lcom/blankj/utilcode/util/SpanUtils;->flag:I

    .line 119
    .line 120
    invoke-virtual {v5, v7, v0, v4, v8}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 121
    .line 122
    .line 123
    :cond_4
    iget v5, p0, Lcom/blankj/utilcode/util/SpanUtils;->first:I

    .line 124
    .line 125
    if-eq v5, v3, :cond_5

    .line 126
    .line 127
    iget-object v5, p0, Lcom/blankj/utilcode/util/SpanUtils;->mBuilder:Lcom/blankj/utilcode/util/SpanUtils$SerializableSpannableStringBuilder;

    .line 128
    .line 129
    new-instance v7, Landroid/text/style/LeadingMarginSpan$Standard;

    .line 130
    .line 131
    iget v8, p0, Lcom/blankj/utilcode/util/SpanUtils;->first:I

    .line 132
    .line 133
    iget v9, p0, Lcom/blankj/utilcode/util/SpanUtils;->rest:I

    .line 134
    .line 135
    invoke-direct {v7, v8, v9}, Landroid/text/style/LeadingMarginSpan$Standard;-><init>(II)V

    .line 136
    .line 137
    .line 138
    iget v8, p0, Lcom/blankj/utilcode/util/SpanUtils;->flag:I

    .line 139
    .line 140
    invoke-virtual {v5, v7, v0, v4, v8}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 141
    .line 142
    .line 143
    :cond_5
    iget v5, p0, Lcom/blankj/utilcode/util/SpanUtils;->quoteColor:I

    .line 144
    .line 145
    const/4 v7, 0x0

    .line 146
    if-eq v5, v6, :cond_6

    .line 147
    .line 148
    iget-object v8, p0, Lcom/blankj/utilcode/util/SpanUtils;->mBuilder:Lcom/blankj/utilcode/util/SpanUtils$SerializableSpannableStringBuilder;

    .line 149
    .line 150
    new-instance v9, Lcom/blankj/utilcode/util/SpanUtils$CustomQuoteSpan;

    .line 151
    .line 152
    iget v10, p0, Lcom/blankj/utilcode/util/SpanUtils;->stripeWidth:I

    .line 153
    .line 154
    iget v11, p0, Lcom/blankj/utilcode/util/SpanUtils;->quoteGapWidth:I

    .line 155
    .line 156
    invoke-direct {v9, v5, v10, v11, v7}, Lcom/blankj/utilcode/util/SpanUtils$CustomQuoteSpan;-><init>(IIILcom/blankj/utilcode/util/SpanUtils$1;)V

    .line 157
    .line 158
    .line 159
    iget v5, p0, Lcom/blankj/utilcode/util/SpanUtils;->flag:I

    .line 160
    .line 161
    invoke-virtual {v8, v9, v0, v4, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 162
    .line 163
    .line 164
    :cond_6
    iget v5, p0, Lcom/blankj/utilcode/util/SpanUtils;->bulletColor:I

    .line 165
    .line 166
    if-eq v5, v6, :cond_7

    .line 167
    .line 168
    iget-object v6, p0, Lcom/blankj/utilcode/util/SpanUtils;->mBuilder:Lcom/blankj/utilcode/util/SpanUtils$SerializableSpannableStringBuilder;

    .line 169
    .line 170
    new-instance v8, Lcom/blankj/utilcode/util/SpanUtils$CustomBulletSpan;

    .line 171
    .line 172
    iget v9, p0, Lcom/blankj/utilcode/util/SpanUtils;->bulletRadius:I

    .line 173
    .line 174
    iget v10, p0, Lcom/blankj/utilcode/util/SpanUtils;->bulletGapWidth:I

    .line 175
    .line 176
    invoke-direct {v8, v5, v9, v10, v7}, Lcom/blankj/utilcode/util/SpanUtils$CustomBulletSpan;-><init>(IIILcom/blankj/utilcode/util/SpanUtils$1;)V

    .line 177
    .line 178
    .line 179
    iget v5, p0, Lcom/blankj/utilcode/util/SpanUtils;->flag:I

    .line 180
    .line 181
    invoke-virtual {v6, v8, v0, v4, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 182
    .line 183
    .line 184
    :cond_7
    iget v5, p0, Lcom/blankj/utilcode/util/SpanUtils;->fontSize:I

    .line 185
    .line 186
    if-eq v5, v3, :cond_8

    .line 187
    .line 188
    iget-object v5, p0, Lcom/blankj/utilcode/util/SpanUtils;->mBuilder:Lcom/blankj/utilcode/util/SpanUtils$SerializableSpannableStringBuilder;

    .line 189
    .line 190
    new-instance v6, Landroid/text/style/AbsoluteSizeSpan;

    .line 191
    .line 192
    iget v8, p0, Lcom/blankj/utilcode/util/SpanUtils;->fontSize:I

    .line 193
    .line 194
    invoke-direct {v6, v8, v1}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    .line 195
    .line 196
    .line 197
    iget v8, p0, Lcom/blankj/utilcode/util/SpanUtils;->flag:I

    .line 198
    .line 199
    invoke-virtual {v5, v6, v0, v4, v8}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 200
    .line 201
    .line 202
    :cond_8
    iget v5, p0, Lcom/blankj/utilcode/util/SpanUtils;->proportion:F

    .line 203
    .line 204
    const/high16 v6, -0x40800000    # -1.0f

    .line 205
    .line 206
    cmpl-float v5, v5, v6

    .line 207
    .line 208
    if-eqz v5, :cond_9

    .line 209
    .line 210
    iget-object v5, p0, Lcom/blankj/utilcode/util/SpanUtils;->mBuilder:Lcom/blankj/utilcode/util/SpanUtils$SerializableSpannableStringBuilder;

    .line 211
    .line 212
    new-instance v8, Landroid/text/style/RelativeSizeSpan;

    .line 213
    .line 214
    iget v9, p0, Lcom/blankj/utilcode/util/SpanUtils;->proportion:F

    .line 215
    .line 216
    invoke-direct {v8, v9}, Landroid/text/style/RelativeSizeSpan;-><init>(F)V

    .line 217
    .line 218
    .line 219
    iget v9, p0, Lcom/blankj/utilcode/util/SpanUtils;->flag:I

    .line 220
    .line 221
    invoke-virtual {v5, v8, v0, v4, v9}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 222
    .line 223
    .line 224
    :cond_9
    iget v5, p0, Lcom/blankj/utilcode/util/SpanUtils;->xProportion:F

    .line 225
    .line 226
    cmpl-float v5, v5, v6

    .line 227
    .line 228
    if-eqz v5, :cond_a

    .line 229
    .line 230
    iget-object v5, p0, Lcom/blankj/utilcode/util/SpanUtils;->mBuilder:Lcom/blankj/utilcode/util/SpanUtils$SerializableSpannableStringBuilder;

    .line 231
    .line 232
    new-instance v8, Landroid/text/style/ScaleXSpan;

    .line 233
    .line 234
    iget v9, p0, Lcom/blankj/utilcode/util/SpanUtils;->xProportion:F

    .line 235
    .line 236
    invoke-direct {v8, v9}, Landroid/text/style/ScaleXSpan;-><init>(F)V

    .line 237
    .line 238
    .line 239
    iget v9, p0, Lcom/blankj/utilcode/util/SpanUtils;->flag:I

    .line 240
    .line 241
    invoke-virtual {v5, v8, v0, v4, v9}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 242
    .line 243
    .line 244
    :cond_a
    iget v5, p0, Lcom/blankj/utilcode/util/SpanUtils;->lineHeight:I

    .line 245
    .line 246
    if-eq v5, v3, :cond_b

    .line 247
    .line 248
    iget-object v3, p0, Lcom/blankj/utilcode/util/SpanUtils;->mBuilder:Lcom/blankj/utilcode/util/SpanUtils$SerializableSpannableStringBuilder;

    .line 249
    .line 250
    new-instance v8, Lcom/blankj/utilcode/util/SpanUtils$CustomLineHeightSpan;

    .line 251
    .line 252
    iget v9, p0, Lcom/blankj/utilcode/util/SpanUtils;->alignLine:I

    .line 253
    .line 254
    invoke-direct {v8, v5, v9}, Lcom/blankj/utilcode/util/SpanUtils$CustomLineHeightSpan;-><init>(II)V

    .line 255
    .line 256
    .line 257
    iget v5, p0, Lcom/blankj/utilcode/util/SpanUtils;->flag:I

    .line 258
    .line 259
    invoke-virtual {v3, v8, v0, v4, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 260
    .line 261
    .line 262
    :cond_b
    iget-boolean v3, p0, Lcom/blankj/utilcode/util/SpanUtils;->isStrikethrough:Z

    .line 263
    .line 264
    if-eqz v3, :cond_c

    .line 265
    .line 266
    iget-object v3, p0, Lcom/blankj/utilcode/util/SpanUtils;->mBuilder:Lcom/blankj/utilcode/util/SpanUtils$SerializableSpannableStringBuilder;

    .line 267
    .line 268
    new-instance v5, Landroid/text/style/StrikethroughSpan;

    .line 269
    .line 270
    invoke-direct {v5}, Landroid/text/style/StrikethroughSpan;-><init>()V

    .line 271
    .line 272
    .line 273
    iget v8, p0, Lcom/blankj/utilcode/util/SpanUtils;->flag:I

    .line 274
    .line 275
    invoke-virtual {v3, v5, v0, v4, v8}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 276
    .line 277
    .line 278
    :cond_c
    iget-boolean v3, p0, Lcom/blankj/utilcode/util/SpanUtils;->isUnderline:Z

    .line 279
    .line 280
    if-eqz v3, :cond_d

    .line 281
    .line 282
    iget-object v3, p0, Lcom/blankj/utilcode/util/SpanUtils;->mBuilder:Lcom/blankj/utilcode/util/SpanUtils$SerializableSpannableStringBuilder;

    .line 283
    .line 284
    new-instance v5, Landroid/text/style/UnderlineSpan;

    .line 285
    .line 286
    invoke-direct {v5}, Landroid/text/style/UnderlineSpan;-><init>()V

    .line 287
    .line 288
    .line 289
    iget v8, p0, Lcom/blankj/utilcode/util/SpanUtils;->flag:I

    .line 290
    .line 291
    invoke-virtual {v3, v5, v0, v4, v8}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 292
    .line 293
    .line 294
    :cond_d
    iget-boolean v3, p0, Lcom/blankj/utilcode/util/SpanUtils;->isSuperscript:Z

    .line 295
    .line 296
    if-eqz v3, :cond_e

    .line 297
    .line 298
    iget-object v3, p0, Lcom/blankj/utilcode/util/SpanUtils;->mBuilder:Lcom/blankj/utilcode/util/SpanUtils$SerializableSpannableStringBuilder;

    .line 299
    .line 300
    new-instance v5, Landroid/text/style/SuperscriptSpan;

    .line 301
    .line 302
    invoke-direct {v5}, Landroid/text/style/SuperscriptSpan;-><init>()V

    .line 303
    .line 304
    .line 305
    iget v8, p0, Lcom/blankj/utilcode/util/SpanUtils;->flag:I

    .line 306
    .line 307
    invoke-virtual {v3, v5, v0, v4, v8}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 308
    .line 309
    .line 310
    :cond_e
    iget-boolean v3, p0, Lcom/blankj/utilcode/util/SpanUtils;->isSubscript:Z

    .line 311
    .line 312
    if-eqz v3, :cond_f

    .line 313
    .line 314
    iget-object v3, p0, Lcom/blankj/utilcode/util/SpanUtils;->mBuilder:Lcom/blankj/utilcode/util/SpanUtils$SerializableSpannableStringBuilder;

    .line 315
    .line 316
    new-instance v5, Landroid/text/style/SubscriptSpan;

    .line 317
    .line 318
    invoke-direct {v5}, Landroid/text/style/SubscriptSpan;-><init>()V

    .line 319
    .line 320
    .line 321
    iget v8, p0, Lcom/blankj/utilcode/util/SpanUtils;->flag:I

    .line 322
    .line 323
    invoke-virtual {v3, v5, v0, v4, v8}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 324
    .line 325
    .line 326
    :cond_f
    iget-boolean v3, p0, Lcom/blankj/utilcode/util/SpanUtils;->isBold:Z

    .line 327
    .line 328
    if-eqz v3, :cond_10

    .line 329
    .line 330
    iget-object v3, p0, Lcom/blankj/utilcode/util/SpanUtils;->mBuilder:Lcom/blankj/utilcode/util/SpanUtils$SerializableSpannableStringBuilder;

    .line 331
    .line 332
    new-instance v5, Landroid/text/style/StyleSpan;

    .line 333
    .line 334
    const/4 v8, 0x1

    .line 335
    invoke-direct {v5, v8}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 336
    .line 337
    .line 338
    iget v8, p0, Lcom/blankj/utilcode/util/SpanUtils;->flag:I

    .line 339
    .line 340
    invoke-virtual {v3, v5, v0, v4, v8}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 341
    .line 342
    .line 343
    :cond_10
    iget-boolean v3, p0, Lcom/blankj/utilcode/util/SpanUtils;->isItalic:Z

    .line 344
    .line 345
    if-eqz v3, :cond_11

    .line 346
    .line 347
    iget-object v3, p0, Lcom/blankj/utilcode/util/SpanUtils;->mBuilder:Lcom/blankj/utilcode/util/SpanUtils$SerializableSpannableStringBuilder;

    .line 348
    .line 349
    new-instance v5, Landroid/text/style/StyleSpan;

    .line 350
    .line 351
    invoke-direct {v5, v2}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 352
    .line 353
    .line 354
    iget v2, p0, Lcom/blankj/utilcode/util/SpanUtils;->flag:I

    .line 355
    .line 356
    invoke-virtual {v3, v5, v0, v4, v2}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 357
    .line 358
    .line 359
    :cond_11
    iget-boolean v2, p0, Lcom/blankj/utilcode/util/SpanUtils;->isBoldItalic:Z

    .line 360
    .line 361
    if-eqz v2, :cond_12

    .line 362
    .line 363
    iget-object v2, p0, Lcom/blankj/utilcode/util/SpanUtils;->mBuilder:Lcom/blankj/utilcode/util/SpanUtils$SerializableSpannableStringBuilder;

    .line 364
    .line 365
    new-instance v3, Landroid/text/style/StyleSpan;

    .line 366
    .line 367
    const/4 v5, 0x3

    .line 368
    invoke-direct {v3, v5}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 369
    .line 370
    .line 371
    iget v5, p0, Lcom/blankj/utilcode/util/SpanUtils;->flag:I

    .line 372
    .line 373
    invoke-virtual {v2, v3, v0, v4, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 374
    .line 375
    .line 376
    :cond_12
    iget-object v2, p0, Lcom/blankj/utilcode/util/SpanUtils;->fontFamily:Ljava/lang/String;

    .line 377
    .line 378
    if-eqz v2, :cond_13

    .line 379
    .line 380
    iget-object v2, p0, Lcom/blankj/utilcode/util/SpanUtils;->mBuilder:Lcom/blankj/utilcode/util/SpanUtils$SerializableSpannableStringBuilder;

    .line 381
    .line 382
    new-instance v3, Landroid/text/style/TypefaceSpan;

    .line 383
    .line 384
    iget-object v5, p0, Lcom/blankj/utilcode/util/SpanUtils;->fontFamily:Ljava/lang/String;

    .line 385
    .line 386
    invoke-direct {v3, v5}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    .line 387
    .line 388
    .line 389
    iget v5, p0, Lcom/blankj/utilcode/util/SpanUtils;->flag:I

    .line 390
    .line 391
    invoke-virtual {v2, v3, v0, v4, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 392
    .line 393
    .line 394
    :cond_13
    iget-object v2, p0, Lcom/blankj/utilcode/util/SpanUtils;->typeface:Landroid/graphics/Typeface;

    .line 395
    .line 396
    if-eqz v2, :cond_14

    .line 397
    .line 398
    iget-object v2, p0, Lcom/blankj/utilcode/util/SpanUtils;->mBuilder:Lcom/blankj/utilcode/util/SpanUtils$SerializableSpannableStringBuilder;

    .line 399
    .line 400
    new-instance v3, Lcom/blankj/utilcode/util/SpanUtils$CustomTypefaceSpan;

    .line 401
    .line 402
    iget-object v5, p0, Lcom/blankj/utilcode/util/SpanUtils;->typeface:Landroid/graphics/Typeface;

    .line 403
    .line 404
    invoke-direct {v3, v5, v7}, Lcom/blankj/utilcode/util/SpanUtils$CustomTypefaceSpan;-><init>(Landroid/graphics/Typeface;Lcom/blankj/utilcode/util/SpanUtils$1;)V

    .line 405
    .line 406
    .line 407
    iget v5, p0, Lcom/blankj/utilcode/util/SpanUtils;->flag:I

    .line 408
    .line 409
    invoke-virtual {v2, v3, v0, v4, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 410
    .line 411
    .line 412
    :cond_14
    iget-object v2, p0, Lcom/blankj/utilcode/util/SpanUtils;->alignment:Landroid/text/Layout$Alignment;

    .line 413
    .line 414
    if-eqz v2, :cond_15

    .line 415
    .line 416
    iget-object v2, p0, Lcom/blankj/utilcode/util/SpanUtils;->mBuilder:Lcom/blankj/utilcode/util/SpanUtils$SerializableSpannableStringBuilder;

    .line 417
    .line 418
    new-instance v3, Landroid/text/style/AlignmentSpan$Standard;

    .line 419
    .line 420
    iget-object v5, p0, Lcom/blankj/utilcode/util/SpanUtils;->alignment:Landroid/text/Layout$Alignment;

    .line 421
    .line 422
    invoke-direct {v3, v5}, Landroid/text/style/AlignmentSpan$Standard;-><init>(Landroid/text/Layout$Alignment;)V

    .line 423
    .line 424
    .line 425
    iget v5, p0, Lcom/blankj/utilcode/util/SpanUtils;->flag:I

    .line 426
    .line 427
    invoke-virtual {v2, v3, v0, v4, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 428
    .line 429
    .line 430
    :cond_15
    iget-object v2, p0, Lcom/blankj/utilcode/util/SpanUtils;->clickSpan:Landroid/text/style/ClickableSpan;

    .line 431
    .line 432
    if-eqz v2, :cond_16

    .line 433
    .line 434
    iget-object v3, p0, Lcom/blankj/utilcode/util/SpanUtils;->mBuilder:Lcom/blankj/utilcode/util/SpanUtils$SerializableSpannableStringBuilder;

    .line 435
    .line 436
    iget v5, p0, Lcom/blankj/utilcode/util/SpanUtils;->flag:I

    .line 437
    .line 438
    invoke-virtual {v3, v2, v0, v4, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 439
    .line 440
    .line 441
    :cond_16
    iget-object v2, p0, Lcom/blankj/utilcode/util/SpanUtils;->url:Ljava/lang/String;

    .line 442
    .line 443
    if-eqz v2, :cond_17

    .line 444
    .line 445
    iget-object v2, p0, Lcom/blankj/utilcode/util/SpanUtils;->mBuilder:Lcom/blankj/utilcode/util/SpanUtils$SerializableSpannableStringBuilder;

    .line 446
    .line 447
    new-instance v3, Landroid/text/style/URLSpan;

    .line 448
    .line 449
    iget-object v5, p0, Lcom/blankj/utilcode/util/SpanUtils;->url:Ljava/lang/String;

    .line 450
    .line 451
    invoke-direct {v3, v5}, Landroid/text/style/URLSpan;-><init>(Ljava/lang/String;)V

    .line 452
    .line 453
    .line 454
    iget v5, p0, Lcom/blankj/utilcode/util/SpanUtils;->flag:I

    .line 455
    .line 456
    invoke-virtual {v2, v3, v0, v4, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 457
    .line 458
    .line 459
    :cond_17
    iget v2, p0, Lcom/blankj/utilcode/util/SpanUtils;->blurRadius:F

    .line 460
    .line 461
    cmpl-float v2, v2, v6

    .line 462
    .line 463
    if-eqz v2, :cond_18

    .line 464
    .line 465
    iget-object v2, p0, Lcom/blankj/utilcode/util/SpanUtils;->mBuilder:Lcom/blankj/utilcode/util/SpanUtils$SerializableSpannableStringBuilder;

    .line 466
    .line 467
    new-instance v3, Landroid/text/style/MaskFilterSpan;

    .line 468
    .line 469
    new-instance v5, Landroid/graphics/BlurMaskFilter;

    .line 470
    .line 471
    iget v8, p0, Lcom/blankj/utilcode/util/SpanUtils;->blurRadius:F

    .line 472
    .line 473
    iget-object v9, p0, Lcom/blankj/utilcode/util/SpanUtils;->style:Landroid/graphics/BlurMaskFilter$Blur;

    .line 474
    .line 475
    invoke-direct {v5, v8, v9}, Landroid/graphics/BlurMaskFilter;-><init>(FLandroid/graphics/BlurMaskFilter$Blur;)V

    .line 476
    .line 477
    .line 478
    invoke-direct {v3, v5}, Landroid/text/style/MaskFilterSpan;-><init>(Landroid/graphics/MaskFilter;)V

    .line 479
    .line 480
    .line 481
    iget v5, p0, Lcom/blankj/utilcode/util/SpanUtils;->flag:I

    .line 482
    .line 483
    invoke-virtual {v2, v3, v0, v4, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 484
    .line 485
    .line 486
    :cond_18
    iget-object v2, p0, Lcom/blankj/utilcode/util/SpanUtils;->shader:Landroid/graphics/Shader;

    .line 487
    .line 488
    if-eqz v2, :cond_19

    .line 489
    .line 490
    iget-object v2, p0, Lcom/blankj/utilcode/util/SpanUtils;->mBuilder:Lcom/blankj/utilcode/util/SpanUtils$SerializableSpannableStringBuilder;

    .line 491
    .line 492
    new-instance v3, Lcom/blankj/utilcode/util/SpanUtils$ShaderSpan;

    .line 493
    .line 494
    iget-object v5, p0, Lcom/blankj/utilcode/util/SpanUtils;->shader:Landroid/graphics/Shader;

    .line 495
    .line 496
    invoke-direct {v3, v5, v7}, Lcom/blankj/utilcode/util/SpanUtils$ShaderSpan;-><init>(Landroid/graphics/Shader;Lcom/blankj/utilcode/util/SpanUtils$1;)V

    .line 497
    .line 498
    .line 499
    iget v5, p0, Lcom/blankj/utilcode/util/SpanUtils;->flag:I

    .line 500
    .line 501
    invoke-virtual {v2, v3, v0, v4, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 502
    .line 503
    .line 504
    :cond_19
    iget v2, p0, Lcom/blankj/utilcode/util/SpanUtils;->shadowRadius:F

    .line 505
    .line 506
    cmpl-float v2, v2, v6

    .line 507
    .line 508
    if-eqz v2, :cond_1a

    .line 509
    .line 510
    iget-object v2, p0, Lcom/blankj/utilcode/util/SpanUtils;->mBuilder:Lcom/blankj/utilcode/util/SpanUtils$SerializableSpannableStringBuilder;

    .line 511
    .line 512
    new-instance v5, Lcom/blankj/utilcode/util/SpanUtils$ShadowSpan;

    .line 513
    .line 514
    iget v6, p0, Lcom/blankj/utilcode/util/SpanUtils;->shadowRadius:F

    .line 515
    .line 516
    iget v7, p0, Lcom/blankj/utilcode/util/SpanUtils;->shadowDx:F

    .line 517
    .line 518
    iget v8, p0, Lcom/blankj/utilcode/util/SpanUtils;->shadowDy:F

    .line 519
    .line 520
    iget v9, p0, Lcom/blankj/utilcode/util/SpanUtils;->shadowColor:I

    .line 521
    .line 522
    const/4 v10, 0x0

    .line 523
    invoke-direct/range {v5 .. v10}, Lcom/blankj/utilcode/util/SpanUtils$ShadowSpan;-><init>(FFFILcom/blankj/utilcode/util/SpanUtils$1;)V

    .line 524
    .line 525
    .line 526
    iget v3, p0, Lcom/blankj/utilcode/util/SpanUtils;->flag:I

    .line 527
    .line 528
    invoke-virtual {v2, v5, v0, v4, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 529
    .line 530
    .line 531
    :cond_1a
    iget-object v2, p0, Lcom/blankj/utilcode/util/SpanUtils;->spans:[Ljava/lang/Object;

    .line 532
    .line 533
    if-eqz v2, :cond_1b

    .line 534
    .line 535
    array-length v3, v2

    .line 536
    :goto_0
    if-ge v1, v3, :cond_1b

    .line 537
    .line 538
    aget-object v5, v2, v1

    .line 539
    .line 540
    iget-object v6, p0, Lcom/blankj/utilcode/util/SpanUtils;->mBuilder:Lcom/blankj/utilcode/util/SpanUtils$SerializableSpannableStringBuilder;

    .line 541
    .line 542
    iget v7, p0, Lcom/blankj/utilcode/util/SpanUtils;->flag:I

    .line 543
    .line 544
    invoke-virtual {v6, v5, v0, v4, v7}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 545
    .line 546
    .line 547
    add-int/lit8 v1, v1, 0x1

    .line 548
    .line 549
    goto :goto_0

    .line 550
    :cond_1b
    :goto_1
    return-void
.end method

.method private updateImage()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/blankj/utilcode/util/SpanUtils;->mBuilder:Lcom/blankj/utilcode/util/SpanUtils$SerializableSpannableStringBuilder;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-string v1, "<img>"

    .line 8
    .line 9
    iput-object v1, p0, Lcom/blankj/utilcode/util/SpanUtils;->mText:Ljava/lang/CharSequence;

    .line 10
    .line 11
    invoke-direct {p0}, Lcom/blankj/utilcode/util/SpanUtils;->updateCharCharSequence()V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lcom/blankj/utilcode/util/SpanUtils;->mBuilder:Lcom/blankj/utilcode/util/SpanUtils$SerializableSpannableStringBuilder;

    .line 15
    .line 16
    invoke-virtual {v1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    iget-object v2, p0, Lcom/blankj/utilcode/util/SpanUtils;->imageBitmap:Landroid/graphics/Bitmap;

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    iget-object v2, p0, Lcom/blankj/utilcode/util/SpanUtils;->mBuilder:Lcom/blankj/utilcode/util/SpanUtils$SerializableSpannableStringBuilder;

    .line 26
    .line 27
    new-instance v4, Lcom/blankj/utilcode/util/SpanUtils$CustomImageSpan;

    .line 28
    .line 29
    iget-object v5, p0, Lcom/blankj/utilcode/util/SpanUtils;->imageBitmap:Landroid/graphics/Bitmap;

    .line 30
    .line 31
    iget v6, p0, Lcom/blankj/utilcode/util/SpanUtils;->alignImage:I

    .line 32
    .line 33
    invoke-direct {v4, v5, v6, v3}, Lcom/blankj/utilcode/util/SpanUtils$CustomImageSpan;-><init>(Landroid/graphics/Bitmap;ILcom/blankj/utilcode/util/SpanUtils$1;)V

    .line 34
    .line 35
    .line 36
    iget v3, p0, Lcom/blankj/utilcode/util/SpanUtils;->flag:I

    .line 37
    .line 38
    invoke-virtual {v2, v4, v0, v1, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_0
    iget-object v2, p0, Lcom/blankj/utilcode/util/SpanUtils;->imageDrawable:Landroid/graphics/drawable/Drawable;

    .line 43
    .line 44
    if-eqz v2, :cond_1

    .line 45
    .line 46
    iget-object v2, p0, Lcom/blankj/utilcode/util/SpanUtils;->mBuilder:Lcom/blankj/utilcode/util/SpanUtils$SerializableSpannableStringBuilder;

    .line 47
    .line 48
    new-instance v4, Lcom/blankj/utilcode/util/SpanUtils$CustomImageSpan;

    .line 49
    .line 50
    iget-object v5, p0, Lcom/blankj/utilcode/util/SpanUtils;->imageDrawable:Landroid/graphics/drawable/Drawable;

    .line 51
    .line 52
    iget v6, p0, Lcom/blankj/utilcode/util/SpanUtils;->alignImage:I

    .line 53
    .line 54
    invoke-direct {v4, v5, v6, v3}, Lcom/blankj/utilcode/util/SpanUtils$CustomImageSpan;-><init>(Landroid/graphics/drawable/Drawable;ILcom/blankj/utilcode/util/SpanUtils$1;)V

    .line 55
    .line 56
    .line 57
    iget v3, p0, Lcom/blankj/utilcode/util/SpanUtils;->flag:I

    .line 58
    .line 59
    invoke-virtual {v2, v4, v0, v1, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_1
    iget-object v2, p0, Lcom/blankj/utilcode/util/SpanUtils;->imageUri:Landroid/net/Uri;

    .line 64
    .line 65
    if-eqz v2, :cond_2

    .line 66
    .line 67
    iget-object v2, p0, Lcom/blankj/utilcode/util/SpanUtils;->mBuilder:Lcom/blankj/utilcode/util/SpanUtils$SerializableSpannableStringBuilder;

    .line 68
    .line 69
    new-instance v4, Lcom/blankj/utilcode/util/SpanUtils$CustomImageSpan;

    .line 70
    .line 71
    iget-object v5, p0, Lcom/blankj/utilcode/util/SpanUtils;->imageUri:Landroid/net/Uri;

    .line 72
    .line 73
    iget v6, p0, Lcom/blankj/utilcode/util/SpanUtils;->alignImage:I

    .line 74
    .line 75
    invoke-direct {v4, v5, v6, v3}, Lcom/blankj/utilcode/util/SpanUtils$CustomImageSpan;-><init>(Landroid/net/Uri;ILcom/blankj/utilcode/util/SpanUtils$1;)V

    .line 76
    .line 77
    .line 78
    iget v3, p0, Lcom/blankj/utilcode/util/SpanUtils;->flag:I

    .line 79
    .line 80
    invoke-virtual {v2, v4, v0, v1, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_2
    iget v2, p0, Lcom/blankj/utilcode/util/SpanUtils;->imageResourceId:I

    .line 85
    .line 86
    const/4 v4, -0x1

    .line 87
    if-eq v2, v4, :cond_3

    .line 88
    .line 89
    iget-object v2, p0, Lcom/blankj/utilcode/util/SpanUtils;->mBuilder:Lcom/blankj/utilcode/util/SpanUtils$SerializableSpannableStringBuilder;

    .line 90
    .line 91
    new-instance v4, Lcom/blankj/utilcode/util/SpanUtils$CustomImageSpan;

    .line 92
    .line 93
    iget v5, p0, Lcom/blankj/utilcode/util/SpanUtils;->imageResourceId:I

    .line 94
    .line 95
    iget v6, p0, Lcom/blankj/utilcode/util/SpanUtils;->alignImage:I

    .line 96
    .line 97
    invoke-direct {v4, v5, v6, v3}, Lcom/blankj/utilcode/util/SpanUtils$CustomImageSpan;-><init>(IILcom/blankj/utilcode/util/SpanUtils$1;)V

    .line 98
    .line 99
    .line 100
    iget v3, p0, Lcom/blankj/utilcode/util/SpanUtils;->flag:I

    .line 101
    .line 102
    invoke-virtual {v2, v4, v0, v1, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 103
    .line 104
    .line 105
    :cond_3
    return-void
.end method

.method private updateSpace()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/blankj/utilcode/util/SpanUtils;->mBuilder:Lcom/blankj/utilcode/util/SpanUtils$SerializableSpannableStringBuilder;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-string v1, "< >"

    .line 8
    .line 9
    iput-object v1, p0, Lcom/blankj/utilcode/util/SpanUtils;->mText:Ljava/lang/CharSequence;

    .line 10
    .line 11
    invoke-direct {p0}, Lcom/blankj/utilcode/util/SpanUtils;->updateCharCharSequence()V

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lcom/blankj/utilcode/util/SpanUtils;->mBuilder:Lcom/blankj/utilcode/util/SpanUtils$SerializableSpannableStringBuilder;

    .line 15
    .line 16
    invoke-virtual {v1}, Landroid/text/SpannableStringBuilder;->length()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    iget-object v2, p0, Lcom/blankj/utilcode/util/SpanUtils;->mBuilder:Lcom/blankj/utilcode/util/SpanUtils$SerializableSpannableStringBuilder;

    .line 21
    .line 22
    new-instance v3, Lcom/blankj/utilcode/util/SpanUtils$SpaceSpan;

    .line 23
    .line 24
    iget v4, p0, Lcom/blankj/utilcode/util/SpanUtils;->spaceSize:I

    .line 25
    .line 26
    iget v5, p0, Lcom/blankj/utilcode/util/SpanUtils;->spaceColor:I

    .line 27
    .line 28
    const/4 v6, 0x0

    .line 29
    invoke-direct {v3, v4, v5, v6}, Lcom/blankj/utilcode/util/SpanUtils$SpaceSpan;-><init>(IILcom/blankj/utilcode/util/SpanUtils$1;)V

    .line 30
    .line 31
    .line 32
    iget v4, p0, Lcom/blankj/utilcode/util/SpanUtils;->flag:I

    .line 33
    .line 34
    invoke-virtual {v2, v3, v0, v1, v4}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public static with(Landroid/widget/TextView;)Lcom/blankj/utilcode/util/SpanUtils;
    .locals 1

    .line 1
    new-instance v0, Lcom/blankj/utilcode/util/SpanUtils;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/blankj/utilcode/util/SpanUtils;-><init>(Landroid/widget/TextView;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public append(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;
    .locals 1
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/blankj/utilcode/util/SpanUtils;->apply(I)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Lcom/blankj/utilcode/util/SpanUtils;->mText:Ljava/lang/CharSequence;

    .line 6
    .line 7
    return-object p0
.end method

.method public appendImage(I)Lcom/blankj/utilcode/util/SpanUtils;
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/DrawableRes;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 13
    invoke-virtual {p0, p1, v0}, Lcom/blankj/utilcode/util/SpanUtils;->appendImage(II)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object p1

    return-object p1
.end method

.method public appendImage(II)Lcom/blankj/utilcode/util/SpanUtils;
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/DrawableRes;
        .end annotation
    .end param

    const/4 v0, 0x1

    .line 14
    invoke-direct {p0, v0}, Lcom/blankj/utilcode/util/SpanUtils;->apply(I)V

    .line 15
    iput p1, p0, Lcom/blankj/utilcode/util/SpanUtils;->imageResourceId:I

    .line 16
    iput p2, p0, Lcom/blankj/utilcode/util/SpanUtils;->alignImage:I

    return-object p0
.end method

.method public appendImage(Landroid/graphics/Bitmap;)Lcom/blankj/utilcode/util/SpanUtils;
    .locals 1
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/blankj/utilcode/util/SpanUtils;->appendImage(Landroid/graphics/Bitmap;I)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object p1

    return-object p1
.end method

.method public appendImage(Landroid/graphics/Bitmap;I)Lcom/blankj/utilcode/util/SpanUtils;
    .locals 1
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lcom/blankj/utilcode/util/SpanUtils;->apply(I)V

    .line 3
    iput-object p1, p0, Lcom/blankj/utilcode/util/SpanUtils;->imageBitmap:Landroid/graphics/Bitmap;

    .line 4
    iput p2, p0, Lcom/blankj/utilcode/util/SpanUtils;->alignImage:I

    return-object p0
.end method

.method public appendImage(Landroid/graphics/drawable/Drawable;)Lcom/blankj/utilcode/util/SpanUtils;
    .locals 1
    .param p1    # Landroid/graphics/drawable/Drawable;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, p1, v0}, Lcom/blankj/utilcode/util/SpanUtils;->appendImage(Landroid/graphics/drawable/Drawable;I)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object p1

    return-object p1
.end method

.method public appendImage(Landroid/graphics/drawable/Drawable;I)Lcom/blankj/utilcode/util/SpanUtils;
    .locals 1
    .param p1    # Landroid/graphics/drawable/Drawable;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x1

    .line 6
    invoke-direct {p0, v0}, Lcom/blankj/utilcode/util/SpanUtils;->apply(I)V

    .line 7
    iput-object p1, p0, Lcom/blankj/utilcode/util/SpanUtils;->imageDrawable:Landroid/graphics/drawable/Drawable;

    .line 8
    iput p2, p0, Lcom/blankj/utilcode/util/SpanUtils;->alignImage:I

    return-object p0
.end method

.method public appendImage(Landroid/net/Uri;)Lcom/blankj/utilcode/util/SpanUtils;
    .locals 1
    .param p1    # Landroid/net/Uri;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 9
    invoke-virtual {p0, p1, v0}, Lcom/blankj/utilcode/util/SpanUtils;->appendImage(Landroid/net/Uri;I)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object p1

    return-object p1
.end method

.method public appendImage(Landroid/net/Uri;I)Lcom/blankj/utilcode/util/SpanUtils;
    .locals 1
    .param p1    # Landroid/net/Uri;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x1

    .line 10
    invoke-direct {p0, v0}, Lcom/blankj/utilcode/util/SpanUtils;->apply(I)V

    .line 11
    iput-object p1, p0, Lcom/blankj/utilcode/util/SpanUtils;->imageUri:Landroid/net/Uri;

    .line 12
    iput p2, p0, Lcom/blankj/utilcode/util/SpanUtils;->alignImage:I

    return-object p0
.end method

.method public appendLine()Lcom/blankj/utilcode/util/SpanUtils;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/blankj/utilcode/util/SpanUtils;->apply(I)V

    .line 2
    sget-object v0, Lcom/blankj/utilcode/util/SpanUtils;->LINE_SEPARATOR:Ljava/lang/String;

    iput-object v0, p0, Lcom/blankj/utilcode/util/SpanUtils;->mText:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public appendLine(Ljava/lang/CharSequence;)Lcom/blankj/utilcode/util/SpanUtils;
    .locals 1
    .param p1    # Ljava/lang/CharSequence;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, v0}, Lcom/blankj/utilcode/util/SpanUtils;->apply(I)V

    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object p1, Lcom/blankj/utilcode/util/SpanUtils;->LINE_SEPARATOR:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/blankj/utilcode/util/SpanUtils;->mText:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public appendSpace(I)Lcom/blankj/utilcode/util/SpanUtils;
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/blankj/utilcode/util/SpanUtils;->appendSpace(II)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object p1

    return-object p1
.end method

.method public appendSpace(II)Lcom/blankj/utilcode/util/SpanUtils;
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param
    .param p2    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    const/4 v0, 0x2

    .line 2
    invoke-direct {p0, v0}, Lcom/blankj/utilcode/util/SpanUtils;->apply(I)V

    .line 3
    iput p1, p0, Lcom/blankj/utilcode/util/SpanUtils;->spaceSize:I

    .line 4
    iput p2, p0, Lcom/blankj/utilcode/util/SpanUtils;->spaceColor:I

    return-object p0
.end method

.method public create()Landroid/text/SpannableStringBuilder;
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/blankj/utilcode/util/SpanUtils;->applyLast()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/blankj/utilcode/util/SpanUtils;->mTextView:Landroid/widget/TextView;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v1, p0, Lcom/blankj/utilcode/util/SpanUtils;->mBuilder:Lcom/blankj/utilcode/util/SpanUtils$SerializableSpannableStringBuilder;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    const/4 v0, 0x1

    .line 14
    iput-boolean v0, p0, Lcom/blankj/utilcode/util/SpanUtils;->isCreated:Z

    .line 15
    .line 16
    iget-object v0, p0, Lcom/blankj/utilcode/util/SpanUtils;->mBuilder:Lcom/blankj/utilcode/util/SpanUtils$SerializableSpannableStringBuilder;

    .line 17
    .line 18
    return-object v0
.end method

.method public get()Landroid/text/SpannableStringBuilder;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/blankj/utilcode/util/SpanUtils;->mBuilder:Lcom/blankj/utilcode/util/SpanUtils$SerializableSpannableStringBuilder;

    .line 2
    .line 3
    return-object v0
.end method

.method public setBackgroundColor(I)Lcom/blankj/utilcode/util/SpanUtils;
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/blankj/utilcode/util/SpanUtils;->backgroundColor:I

    .line 2
    .line 3
    return-object p0
.end method

.method public setBlur(FLandroid/graphics/BlurMaskFilter$Blur;)Lcom/blankj/utilcode/util/SpanUtils;
    .locals 0
    .param p1    # F
        .annotation build Landroidx/annotation/FloatRange;
            from = 0.0
            fromInclusive = false
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/blankj/utilcode/util/SpanUtils;->blurRadius:F

    .line 2
    .line 3
    iput-object p2, p0, Lcom/blankj/utilcode/util/SpanUtils;->style:Landroid/graphics/BlurMaskFilter$Blur;

    .line 4
    .line 5
    return-object p0
.end method

.method public setBold()Lcom/blankj/utilcode/util/SpanUtils;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/blankj/utilcode/util/SpanUtils;->isBold:Z

    .line 3
    .line 4
    return-object p0
.end method

.method public setBoldItalic()Lcom/blankj/utilcode/util/SpanUtils;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/blankj/utilcode/util/SpanUtils;->isBoldItalic:Z

    .line 3
    .line 4
    return-object p0
.end method

.method public setBullet(I)Lcom/blankj/utilcode/util/SpanUtils;
    .locals 2
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param

    const/4 v0, 0x0

    const/4 v1, 0x3

    .line 1
    invoke-virtual {p0, v0, v1, p1}, Lcom/blankj/utilcode/util/SpanUtils;->setBullet(III)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object p1

    return-object p1
.end method

.method public setBullet(III)Lcom/blankj/utilcode/util/SpanUtils;
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param
    .param p2    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param
    .param p3    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param

    .line 2
    iput p1, p0, Lcom/blankj/utilcode/util/SpanUtils;->bulletColor:I

    .line 3
    iput p2, p0, Lcom/blankj/utilcode/util/SpanUtils;->bulletRadius:I

    .line 4
    iput p3, p0, Lcom/blankj/utilcode/util/SpanUtils;->bulletGapWidth:I

    return-object p0
.end method

.method public setClickSpan(IZLandroid/view/View$OnClickListener;)Lcom/blankj/utilcode/util/SpanUtils;
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 3
    invoke-direct {p0}, Lcom/blankj/utilcode/util/SpanUtils;->setMovementMethodIfNeed()V

    .line 4
    new-instance v0, Lcom/blankj/utilcode/util/SpanUtils$1;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/blankj/utilcode/util/SpanUtils$1;-><init>(Lcom/blankj/utilcode/util/SpanUtils;IZLandroid/view/View$OnClickListener;)V

    iput-object v0, p0, Lcom/blankj/utilcode/util/SpanUtils;->clickSpan:Landroid/text/style/ClickableSpan;

    return-object p0
.end method

.method public setClickSpan(Landroid/text/style/ClickableSpan;)Lcom/blankj/utilcode/util/SpanUtils;
    .locals 0
    .param p1    # Landroid/text/style/ClickableSpan;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Lcom/blankj/utilcode/util/SpanUtils;->setMovementMethodIfNeed()V

    .line 2
    iput-object p1, p0, Lcom/blankj/utilcode/util/SpanUtils;->clickSpan:Landroid/text/style/ClickableSpan;

    return-object p0
.end method

.method public setFlag(I)Lcom/blankj/utilcode/util/SpanUtils;
    .locals 0

    .line 1
    iput p1, p0, Lcom/blankj/utilcode/util/SpanUtils;->flag:I

    .line 2
    .line 3
    return-object p0
.end method

.method public setFontFamily(Ljava/lang/String;)Lcom/blankj/utilcode/util/SpanUtils;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/blankj/utilcode/util/SpanUtils;->fontFamily:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public setFontProportion(F)Lcom/blankj/utilcode/util/SpanUtils;
    .locals 0

    .line 1
    iput p1, p0, Lcom/blankj/utilcode/util/SpanUtils;->proportion:F

    .line 2
    .line 3
    return-object p0
.end method

.method public setFontSize(I)Lcom/blankj/utilcode/util/SpanUtils;
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/blankj/utilcode/util/SpanUtils;->setFontSize(IZ)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object p1

    return-object p1
.end method

.method public setFontSize(IZ)Lcom/blankj/utilcode/util/SpanUtils;
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param

    if-eqz p2, :cond_0

    .line 2
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    iget p2, p2, Landroid/util/DisplayMetrics;->scaledDensity:F

    int-to-float p1, p1

    mul-float/2addr p1, p2

    const/high16 p2, 0x3f000000    # 0.5f

    add-float/2addr p1, p2

    float-to-int p1, p1

    .line 3
    iput p1, p0, Lcom/blankj/utilcode/util/SpanUtils;->fontSize:I

    return-object p0

    .line 4
    :cond_0
    iput p1, p0, Lcom/blankj/utilcode/util/SpanUtils;->fontSize:I

    return-object p0
.end method

.method public setFontXProportion(F)Lcom/blankj/utilcode/util/SpanUtils;
    .locals 0

    .line 1
    iput p1, p0, Lcom/blankj/utilcode/util/SpanUtils;->xProportion:F

    .line 2
    .line 3
    return-object p0
.end method

.method public setForegroundColor(I)Lcom/blankj/utilcode/util/SpanUtils;
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/blankj/utilcode/util/SpanUtils;->foregroundColor:I

    .line 2
    .line 3
    return-object p0
.end method

.method public setHorizontalAlign(Landroid/text/Layout$Alignment;)Lcom/blankj/utilcode/util/SpanUtils;
    .locals 0
    .param p1    # Landroid/text/Layout$Alignment;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/blankj/utilcode/util/SpanUtils;->alignment:Landroid/text/Layout$Alignment;

    .line 2
    .line 3
    return-object p0
.end method

.method public setItalic()Lcom/blankj/utilcode/util/SpanUtils;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/blankj/utilcode/util/SpanUtils;->isItalic:Z

    .line 3
    .line 4
    return-object p0
.end method

.method public setLeadingMargin(II)Lcom/blankj/utilcode/util/SpanUtils;
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param
    .param p2    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/blankj/utilcode/util/SpanUtils;->first:I

    .line 2
    .line 3
    iput p2, p0, Lcom/blankj/utilcode/util/SpanUtils;->rest:I

    .line 4
    .line 5
    return-object p0
.end method

.method public setLineHeight(I)Lcom/blankj/utilcode/util/SpanUtils;
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param

    const/4 v0, 0x2

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/blankj/utilcode/util/SpanUtils;->setLineHeight(II)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object p1

    return-object p1
.end method

.method public setLineHeight(II)Lcom/blankj/utilcode/util/SpanUtils;
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param

    .line 2
    iput p1, p0, Lcom/blankj/utilcode/util/SpanUtils;->lineHeight:I

    .line 3
    iput p2, p0, Lcom/blankj/utilcode/util/SpanUtils;->alignLine:I

    return-object p0
.end method

.method public setQuoteColor(I)Lcom/blankj/utilcode/util/SpanUtils;
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    const/4 v0, 0x2

    .line 1
    invoke-virtual {p0, p1, v0, v0}, Lcom/blankj/utilcode/util/SpanUtils;->setQuoteColor(III)Lcom/blankj/utilcode/util/SpanUtils;

    move-result-object p1

    return-object p1
.end method

.method public setQuoteColor(III)Lcom/blankj/utilcode/util/SpanUtils;
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param
    .param p2    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x1L
        .end annotation
    .end param
    .param p3    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param

    .line 2
    iput p1, p0, Lcom/blankj/utilcode/util/SpanUtils;->quoteColor:I

    .line 3
    iput p2, p0, Lcom/blankj/utilcode/util/SpanUtils;->stripeWidth:I

    .line 4
    iput p3, p0, Lcom/blankj/utilcode/util/SpanUtils;->quoteGapWidth:I

    return-object p0
.end method

.method public setShader(Landroid/graphics/Shader;)Lcom/blankj/utilcode/util/SpanUtils;
    .locals 0
    .param p1    # Landroid/graphics/Shader;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/blankj/utilcode/util/SpanUtils;->shader:Landroid/graphics/Shader;

    .line 2
    .line 3
    return-object p0
.end method

.method public setShadow(FFFI)Lcom/blankj/utilcode/util/SpanUtils;
    .locals 0
    .param p1    # F
        .annotation build Landroidx/annotation/FloatRange;
            from = 0.0
            fromInclusive = false
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lcom/blankj/utilcode/util/SpanUtils;->shadowRadius:F

    .line 2
    .line 3
    iput p2, p0, Lcom/blankj/utilcode/util/SpanUtils;->shadowDx:F

    .line 4
    .line 5
    iput p3, p0, Lcom/blankj/utilcode/util/SpanUtils;->shadowDy:F

    .line 6
    .line 7
    iput p4, p0, Lcom/blankj/utilcode/util/SpanUtils;->shadowColor:I

    .line 8
    .line 9
    return-object p0
.end method

.method public varargs setSpans([Ljava/lang/Object;)Lcom/blankj/utilcode/util/SpanUtils;
    .locals 1
    .param p1    # [Ljava/lang/Object;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    array-length v0, p1

    .line 2
    if-lez v0, :cond_0

    .line 3
    .line 4
    iput-object p1, p0, Lcom/blankj/utilcode/util/SpanUtils;->spans:[Ljava/lang/Object;

    .line 5
    .line 6
    :cond_0
    return-object p0
.end method

.method public setStrikethrough()Lcom/blankj/utilcode/util/SpanUtils;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/blankj/utilcode/util/SpanUtils;->isStrikethrough:Z

    .line 3
    .line 4
    return-object p0
.end method

.method public setSubscript()Lcom/blankj/utilcode/util/SpanUtils;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/blankj/utilcode/util/SpanUtils;->isSubscript:Z

    .line 3
    .line 4
    return-object p0
.end method

.method public setSuperscript()Lcom/blankj/utilcode/util/SpanUtils;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/blankj/utilcode/util/SpanUtils;->isSuperscript:Z

    .line 3
    .line 4
    return-object p0
.end method

.method public setTypeface(Landroid/graphics/Typeface;)Lcom/blankj/utilcode/util/SpanUtils;
    .locals 0
    .param p1    # Landroid/graphics/Typeface;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/blankj/utilcode/util/SpanUtils;->typeface:Landroid/graphics/Typeface;

    .line 2
    .line 3
    return-object p0
.end method

.method public setUnderline()Lcom/blankj/utilcode/util/SpanUtils;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/blankj/utilcode/util/SpanUtils;->isUnderline:Z

    .line 3
    .line 4
    return-object p0
.end method

.method public setUrl(Ljava/lang/String;)Lcom/blankj/utilcode/util/SpanUtils;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Lcom/blankj/utilcode/util/SpanUtils;->setMovementMethodIfNeed()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/blankj/utilcode/util/SpanUtils;->url:Ljava/lang/String;

    .line 5
    .line 6
    return-object p0
.end method

.method public setVerticalAlign(I)Lcom/blankj/utilcode/util/SpanUtils;
    .locals 0

    .line 1
    iput p1, p0, Lcom/blankj/utilcode/util/SpanUtils;->verticalAlign:I

    .line 2
    .line 3
    return-object p0
.end method
