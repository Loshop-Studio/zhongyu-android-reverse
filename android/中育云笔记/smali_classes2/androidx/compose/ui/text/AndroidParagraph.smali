.class public final Landroidx/compose/ui/text/AndroidParagraph;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/text/Paragraph;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/text/AndroidParagraph$WhenMappings;
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final charSequence:Ljava/lang/CharSequence;

.field private final constraints:J

.field private final layout:Landroidx/compose/ui/text/android/TextLayout;

.field private final maxLines:I

.field private final overflow:I

.field private final paragraphIntrinsics:Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;

.field private final placeholderRects:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/ui/geometry/Rect;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;IIJ)V
    .locals 22

    move-object/from16 v0, p0

    move/from16 v4, p2

    move/from16 v12, p3

    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v1, p1

    .line 4
    iput-object v1, v0, Landroidx/compose/ui/text/AndroidParagraph;->paragraphIntrinsics:Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;

    .line 5
    iput v4, v0, Landroidx/compose/ui/text/AndroidParagraph;->maxLines:I

    .line 6
    iput v12, v0, Landroidx/compose/ui/text/AndroidParagraph;->overflow:I

    move-wide/from16 v13, p4

    .line 7
    iput-wide v13, v0, Landroidx/compose/ui/text/AndroidParagraph;->constraints:J

    .line 8
    invoke-static {v13, v14}, Landroidx/compose/ui/unit/Constraints;->getMinHeight-impl(J)I

    move-result v2

    const/4 v15, 0x0

    const/4 v3, 0x1

    if-nez v2, :cond_0

    invoke-static {v13, v14}, Landroidx/compose/ui/unit/Constraints;->getMinWidth-impl(J)I

    move-result v2

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v15

    :goto_0
    if-nez v2, :cond_1

    .line 9
    const-string v2, "Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead."

    .line 10
    invoke-static {v2}, Landroidx/compose/ui/text/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    :cond_1
    if-lt v4, v3, :cond_2

    move v2, v3

    goto :goto_1

    :cond_2
    move v2, v15

    :goto_1
    if-nez v2, :cond_3

    .line 11
    const-string v2, "maxLines should be greater than 0"

    .line 12
    invoke-static {v2}, Landroidx/compose/ui/text/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 13
    :cond_3
    invoke-virtual {v1}, Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;->getStyle()Landroidx/compose/ui/text/TextStyle;

    move-result-object v2

    .line 14
    sget-object v16, Landroidx/compose/ui/text/style/TextOverflow;->Companion:Landroidx/compose/ui/text/style/TextOverflow$Companion;

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getEllipsis-gIe3tQ8()I

    move-result v5

    invoke-static {v12, v5}, Landroidx/compose/ui/text/style/TextOverflow;->equals-impl0(II)Z

    move-result v5

    invoke-static {v2, v5}, Landroidx/compose/ui/text/AndroidParagraph_androidKt;->access$shouldAttachIndentationFixSpan(Landroidx/compose/ui/text/TextStyle;Z)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 15
    invoke-virtual {v1}, Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;->getCharSequence$ui_text_release()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {v1}, Landroidx/compose/ui/text/AndroidParagraph_androidKt;->access$attachIndentationFixSpan(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    goto :goto_2

    .line 16
    :cond_4
    invoke-virtual {v1}, Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;->getCharSequence$ui_text_release()Ljava/lang/CharSequence;

    move-result-object v1

    .line 17
    :goto_2
    iput-object v1, v0, Landroidx/compose/ui/text/AndroidParagraph;->charSequence:Ljava/lang/CharSequence;

    .line 18
    invoke-virtual {v2}, Landroidx/compose/ui/text/TextStyle;->getTextAlign-e0LSkKk()I

    move-result v5

    invoke-static {v5}, Landroidx/compose/ui/text/AndroidParagraph_androidKt;->access$toLayoutAlign-aXe7zB0(I)I

    move-result v5

    .line 19
    invoke-virtual {v2}, Landroidx/compose/ui/text/TextStyle;->getTextAlign-e0LSkKk()I

    move-result v6

    .line 20
    sget-object v7, Landroidx/compose/ui/text/style/TextAlign;->Companion:Landroidx/compose/ui/text/style/TextAlign$Companion;

    invoke-virtual {v7}, Landroidx/compose/ui/text/style/TextAlign$Companion;->getJustify-e0LSkKk()I

    move-result v7

    invoke-static {v6, v7}, Landroidx/compose/ui/text/style/TextAlign;->equals-impl0(II)Z

    move-result v6

    .line 21
    invoke-virtual {v2}, Landroidx/compose/ui/text/TextStyle;->getParagraphStyle$ui_text_release()Landroidx/compose/ui/text/ParagraphStyle;

    move-result-object v7

    invoke-virtual {v7}, Landroidx/compose/ui/text/ParagraphStyle;->getHyphens-vmbZdU8()I

    move-result v7

    invoke-static {v7}, Landroidx/compose/ui/text/AndroidParagraph_androidKt;->access$toLayoutHyphenationFrequency--3fSNIE(I)I

    move-result v7

    .line 22
    invoke-virtual {v2}, Landroidx/compose/ui/text/TextStyle;->getLineBreak-rAG3T2k()I

    move-result v8

    invoke-static {v8}, Landroidx/compose/ui/text/style/LineBreak;->getStrategy-fcGXIks(I)I

    move-result v8

    invoke-static {v8}, Landroidx/compose/ui/text/AndroidParagraph_androidKt;->access$toLayoutBreakStrategy-xImikfE(I)I

    move-result v8

    .line 23
    invoke-virtual {v2}, Landroidx/compose/ui/text/TextStyle;->getLineBreak-rAG3T2k()I

    move-result v9

    invoke-static {v9}, Landroidx/compose/ui/text/style/LineBreak;->getStrictness-usljTpc(I)I

    move-result v9

    invoke-static {v9}, Landroidx/compose/ui/text/AndroidParagraph_androidKt;->access$toLayoutLineBreakStyle-hpcqdu8(I)I

    move-result v9

    .line 24
    invoke-virtual {v2}, Landroidx/compose/ui/text/TextStyle;->getLineBreak-rAG3T2k()I

    move-result v10

    invoke-static {v10}, Landroidx/compose/ui/text/style/LineBreak;->getWordBreak-jp8hJ3c(I)I

    move-result v10

    invoke-static {v10}, Landroidx/compose/ui/text/AndroidParagraph_androidKt;->access$toLayoutLineBreakWordStyle-wPN0Rpw(I)I

    move-result v10

    .line 25
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getEllipsis-gIe3tQ8()I

    move-result v11

    invoke-static {v12, v11}, Landroidx/compose/ui/text/style/TextOverflow;->equals-impl0(II)Z

    move-result v11

    const/16 v17, 0x0

    if-eqz v11, :cond_5

    sget-object v11, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    :goto_3
    move-object/from16 v18, v2

    move v2, v6

    move v6, v8

    move v8, v10

    goto :goto_4

    .line 26
    :cond_5
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getMiddleEllipsis-gIe3tQ8()I

    move-result v11

    invoke-static {v12, v11}, Landroidx/compose/ui/text/style/TextOverflow;->equals-impl0(II)Z

    move-result v11

    if-eqz v11, :cond_6

    sget-object v11, Landroid/text/TextUtils$TruncateAt;->MIDDLE:Landroid/text/TextUtils$TruncateAt;

    goto :goto_3

    .line 27
    :cond_6
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getStartEllipsis-gIe3tQ8()I

    move-result v11

    invoke-static {v12, v11}, Landroidx/compose/ui/text/style/TextOverflow;->equals-impl0(II)Z

    move-result v11

    if-eqz v11, :cond_7

    sget-object v11, Landroid/text/TextUtils$TruncateAt;->START:Landroid/text/TextUtils$TruncateAt;

    goto :goto_3

    :cond_7
    move-object/from16 v18, v2

    move v2, v6

    move v6, v8

    move v8, v10

    move-object/from16 v11, v17

    :goto_4
    const/16 v10, 0x100

    move/from16 v19, v3

    move-object v3, v11

    const/4 v11, 0x0

    move-object/from16 v20, v1

    move v1, v5

    move v5, v7

    move v7, v9

    const/4 v9, 0x0

    move-object/from16 v21, v20

    .line 28
    invoke-static/range {v0 .. v11}, Landroidx/compose/ui/text/AndroidParagraph;->constructTextLayout$default(Landroidx/compose/ui/text/AndroidParagraph;IILandroid/text/TextUtils$TruncateAt;IIIIILjava/lang/CharSequence;ILjava/lang/Object;)Landroidx/compose/ui/text/android/TextLayout;

    move-result-object v9

    .line 29
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x23

    const/4 v10, 0x2

    if-ge v0, v4, :cond_8

    .line 30
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/text/AndroidParagraph;->getTextPaint$ui_text_release()Landroidx/compose/ui/text/platform/AndroidTextPaint;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Paint;->getLetterSpacing()F

    move-result v0

    const/4 v4, 0x0

    cmpg-float v0, v0, v4

    if-nez v0, :cond_9

    :cond_8
    move/from16 v4, p2

    const/4 v11, 0x1

    goto :goto_5

    .line 31
    :cond_9
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getStartEllipsis-gIe3tQ8()I

    move-result v0

    invoke-static {v12, v0}, Landroidx/compose/ui/text/style/TextOverflow;->equals-impl0(II)Z

    move-result v0

    if-nez v0, :cond_a

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getMiddleEllipsis-gIe3tQ8()I

    move-result v0

    invoke-static {v12, v0}, Landroidx/compose/ui/text/style/TextOverflow;->equals-impl0(II)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 32
    :cond_a
    invoke-virtual {v9, v15}, Landroidx/compose/ui/text/android/TextLayout;->getLineEllipsisCount(I)I

    move-result v0

    if-lez v0, :cond_8

    .line 33
    invoke-virtual {v9, v15}, Landroidx/compose/ui/text/android/TextLayout;->getLineEllipsisOffset(I)I

    move-result v0

    .line 34
    invoke-virtual {v9, v15}, Landroidx/compose/ui/text/android/TextLayout;->getLineEllipsisCount(I)I

    move-result v4

    add-int/2addr v4, v0

    move-object/from16 v9, v21

    .line 35
    invoke-interface {v9, v15, v0}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    .line 36
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v11

    invoke-interface {v9, v4, v11}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v4

    const/4 v9, 0x3

    new-array v9, v9, [Ljava/lang/CharSequence;

    aput-object v0, v9, v15

    const-string/jumbo v0, "\u2026"

    const/4 v11, 0x1

    aput-object v0, v9, v11

    aput-object v4, v9, v10

    .line 37
    invoke-static {v9}, Landroid/text/TextUtils;->concat([Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v9

    move-object/from16 v0, p0

    move/from16 v4, p2

    .line 38
    invoke-direct/range {v0 .. v9}, Landroidx/compose/ui/text/AndroidParagraph;->constructTextLayout(IILandroid/text/TextUtils$TruncateAt;IIIIILjava/lang/CharSequence;)Landroidx/compose/ui/text/android/TextLayout;

    move-result-object v9

    .line 39
    :goto_5
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getEllipsis-gIe3tQ8()I

    move-result v0

    invoke-static {v12, v0}, Landroidx/compose/ui/text/style/TextOverflow;->equals-impl0(II)Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-virtual {v9}, Landroidx/compose/ui/text/android/TextLayout;->getHeight()I

    move-result v0

    invoke-static {v13, v14}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    move-result v12

    if-le v0, v12, :cond_c

    if-le v4, v11, :cond_c

    .line 40
    invoke-static {v13, v14}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    move-result v0

    invoke-static {v9, v0}, Landroidx/compose/ui/text/AndroidParagraph_androidKt;->access$numberOfLinesThatFitMaxHeight(Landroidx/compose/ui/text/android/TextLayout;I)I

    move-result v0

    if-ltz v0, :cond_b

    if-eq v0, v4, :cond_b

    .line 41
    invoke-static {v0, v11}, Lnd/o;->e(II)I

    move-result v4

    move v0, v10

    const/16 v10, 0x100

    move/from16 v19, v11

    const/4 v11, 0x0

    const/4 v9, 0x0

    move v12, v0

    move/from16 v13, v19

    move-object/from16 v0, p0

    .line 42
    invoke-static/range {v0 .. v11}, Landroidx/compose/ui/text/AndroidParagraph;->constructTextLayout$default(Landroidx/compose/ui/text/AndroidParagraph;IILandroid/text/TextUtils$TruncateAt;IIIIILjava/lang/CharSequence;ILjava/lang/Object;)Landroidx/compose/ui/text/android/TextLayout;

    move-result-object v9

    goto :goto_6

    :cond_b
    move-object/from16 v0, p0

    move v12, v10

    move v13, v11

    .line 43
    :goto_6
    iput-object v9, v0, Landroidx/compose/ui/text/AndroidParagraph;->layout:Landroidx/compose/ui/text/android/TextLayout;

    goto :goto_7

    :cond_c
    move-object/from16 v0, p0

    move v12, v10

    move v13, v11

    .line 44
    iput-object v9, v0, Landroidx/compose/ui/text/AndroidParagraph;->layout:Landroidx/compose/ui/text/android/TextLayout;

    .line 45
    :goto_7
    invoke-virtual {v0}, Landroidx/compose/ui/text/AndroidParagraph;->getTextPaint$ui_text_release()Landroidx/compose/ui/text/platform/AndroidTextPaint;

    move-result-object v1

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/text/TextStyle;->getBrush()Landroidx/compose/ui/graphics/Brush;

    move-result-object v2

    invoke-virtual {v0}, Landroidx/compose/ui/text/AndroidParagraph;->getWidth()F

    move-result v3

    invoke-virtual {v0}, Landroidx/compose/ui/text/AndroidParagraph;->getHeight()F

    move-result v4

    .line 46
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v5, v3

    .line 47
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v3, v3

    const/16 v7, 0x20

    shl-long/2addr v5, v7

    const-wide v8, 0xffffffffL

    and-long/2addr v3, v8

    or-long/2addr v3, v5

    .line 48
    invoke-static {v3, v4}, Landroidx/compose/ui/geometry/Size;->constructor-impl(J)J

    move-result-wide v3

    .line 49
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/text/TextStyle;->getAlpha()F

    move-result v5

    invoke-virtual {v1, v2, v3, v4, v5}, Landroidx/compose/ui/text/platform/AndroidTextPaint;->setBrush-12SF9DM(Landroidx/compose/ui/graphics/Brush;JF)V

    .line 50
    iget-object v1, v0, Landroidx/compose/ui/text/AndroidParagraph;->layout:Landroidx/compose/ui/text/android/TextLayout;

    invoke-direct {v0, v1}, Landroidx/compose/ui/text/AndroidParagraph;->getShaderBrushSpans(Landroidx/compose/ui/text/android/TextLayout;)[Landroidx/compose/ui/text/platform/style/ShaderBrushSpan;

    move-result-object v1

    if-eqz v1, :cond_d

    .line 51
    invoke-static {v1}, Lkotlin/jvm/internal/e;->a([Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v1

    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/ui/text/platform/style/ShaderBrushSpan;

    .line 52
    invoke-virtual {v0}, Landroidx/compose/ui/text/AndroidParagraph;->getWidth()F

    move-result v3

    invoke-virtual {v0}, Landroidx/compose/ui/text/AndroidParagraph;->getHeight()F

    move-result v4

    .line 53
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v5, v3

    .line 54
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v3, v3

    shl-long/2addr v5, v7

    and-long/2addr v3, v8

    or-long/2addr v3, v5

    .line 55
    invoke-static {v3, v4}, Landroidx/compose/ui/geometry/Size;->constructor-impl(J)J

    move-result-wide v3

    .line 56
    invoke-virtual {v2, v3, v4}, Landroidx/compose/ui/text/platform/style/ShaderBrushSpan;->setSize-uvyYCjk(J)V

    goto :goto_8

    .line 57
    :cond_d
    iget-object v1, v0, Landroidx/compose/ui/text/AndroidParagraph;->charSequence:Ljava/lang/CharSequence;

    .line 58
    instance-of v2, v1, Landroid/text/Spanned;

    if-nez v2, :cond_e

    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    move-result-object v1

    goto/16 :goto_13

    .line 59
    :cond_e
    move-object v2, v1

    check-cast v2, Landroid/text/Spanned;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const-class v3, Landroidx/compose/ui/text/android/style/PlaceholderSpan;

    invoke-interface {v2, v15, v1, v3}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v1

    .line 60
    new-instance v3, Ljava/util/ArrayList;

    array-length v4, v1

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 61
    array-length v4, v1

    move v5, v15

    :goto_9
    if-ge v5, v4, :cond_16

    aget-object v6, v1, v5

    .line 62
    check-cast v6, Landroidx/compose/ui/text/android/style/PlaceholderSpan;

    .line 63
    invoke-interface {v2, v6}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v7

    .line 64
    invoke-interface {v2, v6}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v8

    .line 65
    iget-object v9, v0, Landroidx/compose/ui/text/AndroidParagraph;->layout:Landroidx/compose/ui/text/android/TextLayout;

    invoke-virtual {v9, v7}, Landroidx/compose/ui/text/android/TextLayout;->getLineForOffset(I)I

    move-result v9

    .line 66
    iget v10, v0, Landroidx/compose/ui/text/AndroidParagraph;->maxLines:I

    if-lt v9, v10, :cond_f

    move v10, v13

    goto :goto_a

    :cond_f
    move v10, v15

    .line 67
    :goto_a
    iget-object v11, v0, Landroidx/compose/ui/text/AndroidParagraph;->layout:Landroidx/compose/ui/text/android/TextLayout;

    invoke-virtual {v11, v9}, Landroidx/compose/ui/text/android/TextLayout;->getLineEllipsisCount(I)I

    move-result v11

    if-lez v11, :cond_10

    .line 68
    iget-object v11, v0, Landroidx/compose/ui/text/AndroidParagraph;->layout:Landroidx/compose/ui/text/android/TextLayout;

    invoke-virtual {v11, v9}, Landroidx/compose/ui/text/android/TextLayout;->getLineEllipsisOffset(I)I

    move-result v11

    if-le v8, v11, :cond_10

    move v11, v13

    goto :goto_b

    :cond_10
    move v11, v15

    .line 69
    :goto_b
    iget-object v14, v0, Landroidx/compose/ui/text/AndroidParagraph;->layout:Landroidx/compose/ui/text/android/TextLayout;

    invoke-virtual {v14, v9}, Landroidx/compose/ui/text/android/TextLayout;->getLineEnd(I)I

    move-result v14

    if-le v8, v14, :cond_11

    move v8, v13

    goto :goto_c

    :cond_11
    move v8, v15

    :goto_c
    if-nez v11, :cond_15

    if-nez v8, :cond_15

    if-eqz v10, :cond_12

    goto/16 :goto_11

    .line 70
    :cond_12
    invoke-virtual {v0, v7}, Landroidx/compose/ui/text/AndroidParagraph;->getBidiRunDirection(I)Landroidx/compose/ui/text/style/ResolvedTextDirection;

    move-result-object v8

    .line 71
    sget-object v10, Landroidx/compose/ui/text/AndroidParagraph$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    aget v8, v10, v8

    if-eq v8, v13, :cond_14

    if-ne v8, v12, :cond_13

    .line 72
    invoke-virtual {v0, v7, v13}, Landroidx/compose/ui/text/AndroidParagraph;->getHorizontalPosition(IZ)F

    move-result v7

    invoke-virtual {v6}, Landroidx/compose/ui/text/android/style/PlaceholderSpan;->getWidthPx()I

    move-result v8

    int-to-float v8, v8

    sub-float/2addr v7, v8

    goto :goto_d

    :cond_13
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    .line 73
    :cond_14
    invoke-virtual {v0, v7, v13}, Landroidx/compose/ui/text/AndroidParagraph;->getHorizontalPosition(IZ)F

    move-result v7

    .line 74
    :goto_d
    invoke-virtual {v6}, Landroidx/compose/ui/text/android/style/PlaceholderSpan;->getWidthPx()I

    move-result v8

    int-to-float v8, v8

    add-float/2addr v8, v7

    .line 75
    iget-object v10, v0, Landroidx/compose/ui/text/AndroidParagraph;->layout:Landroidx/compose/ui/text/android/TextLayout;

    .line 76
    invoke-virtual {v6}, Landroidx/compose/ui/text/android/style/PlaceholderSpan;->getVerticalAlign()I

    move-result v11

    packed-switch v11, :pswitch_data_0

    .line 77
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string/jumbo v2, "unexpected verticalAlignment"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 78
    :pswitch_0
    invoke-virtual {v6}, Landroidx/compose/ui/text/android/style/PlaceholderSpan;->getFontMetrics()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v11

    .line 79
    iget v14, v11, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    iget v11, v11, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    add-int/2addr v14, v11

    invoke-virtual {v6}, Landroidx/compose/ui/text/android/style/PlaceholderSpan;->getHeightPx()I

    move-result v11

    sub-int/2addr v14, v11

    div-int/2addr v14, v12

    int-to-float v11, v14

    invoke-virtual {v10, v9}, Landroidx/compose/ui/text/android/TextLayout;->getLineBaseline(I)F

    move-result v9

    :goto_e
    add-float/2addr v11, v9

    goto :goto_10

    .line 80
    :pswitch_1
    invoke-virtual {v6}, Landroidx/compose/ui/text/android/style/PlaceholderSpan;->getFontMetrics()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v11

    iget v11, v11, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    int-to-float v11, v11

    invoke-virtual {v10, v9}, Landroidx/compose/ui/text/android/TextLayout;->getLineBaseline(I)F

    move-result v9

    add-float/2addr v11, v9

    invoke-virtual {v6}, Landroidx/compose/ui/text/android/style/PlaceholderSpan;->getHeightPx()I

    move-result v9

    int-to-float v9, v9

    sub-float/2addr v11, v9

    goto :goto_10

    .line 81
    :pswitch_2
    invoke-virtual {v6}, Landroidx/compose/ui/text/android/style/PlaceholderSpan;->getFontMetrics()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v11

    iget v11, v11, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    int-to-float v11, v11

    invoke-virtual {v10, v9}, Landroidx/compose/ui/text/android/TextLayout;->getLineBaseline(I)F

    move-result v9

    goto :goto_e

    .line 82
    :pswitch_3
    invoke-virtual {v10, v9}, Landroidx/compose/ui/text/android/TextLayout;->getLineTop(I)F

    move-result v11

    invoke-virtual {v10, v9}, Landroidx/compose/ui/text/android/TextLayout;->getLineBottom(I)F

    move-result v9

    add-float/2addr v11, v9

    invoke-virtual {v6}, Landroidx/compose/ui/text/android/style/PlaceholderSpan;->getHeightPx()I

    move-result v9

    int-to-float v9, v9

    sub-float/2addr v11, v9

    int-to-float v9, v12

    div-float/2addr v11, v9

    goto :goto_10

    .line 83
    :pswitch_4
    invoke-virtual {v10, v9}, Landroidx/compose/ui/text/android/TextLayout;->getLineBottom(I)F

    move-result v9

    invoke-virtual {v6}, Landroidx/compose/ui/text/android/style/PlaceholderSpan;->getHeightPx()I

    move-result v10

    :goto_f
    int-to-float v10, v10

    sub-float v11, v9, v10

    goto :goto_10

    .line 84
    :pswitch_5
    invoke-virtual {v10, v9}, Landroidx/compose/ui/text/android/TextLayout;->getLineTop(I)F

    move-result v11

    goto :goto_10

    .line 85
    :pswitch_6
    invoke-virtual {v10, v9}, Landroidx/compose/ui/text/android/TextLayout;->getLineBaseline(I)F

    move-result v9

    invoke-virtual {v6}, Landroidx/compose/ui/text/android/style/PlaceholderSpan;->getHeightPx()I

    move-result v10

    goto :goto_f

    .line 86
    :goto_10
    invoke-virtual {v6}, Landroidx/compose/ui/text/android/style/PlaceholderSpan;->getHeightPx()I

    move-result v6

    int-to-float v6, v6

    add-float/2addr v6, v11

    .line 87
    new-instance v9, Landroidx/compose/ui/geometry/Rect;

    invoke-direct {v9, v7, v11, v8, v6}, Landroidx/compose/ui/geometry/Rect;-><init>(FFFF)V

    goto :goto_12

    :cond_15
    :goto_11
    move-object/from16 v9, v17

    .line 88
    :goto_12
    invoke-interface {v3, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_9

    :cond_16
    move-object v1, v3

    .line 89
    :goto_13
    iput-object v1, v0, Landroidx/compose/ui/text/AndroidParagraph;->placeholderRects:Ljava/util/List;

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;IIJLkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Landroidx/compose/ui/text/AndroidParagraph;-><init>(Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;IIJ)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Ljava/util/List;IIJLandroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/ui/unit/Density;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroidx/compose/ui/text/TextStyle;",
            "Ljava/util/List<",
            "+",
            "Landroidx/compose/ui/text/AnnotatedString$Range<",
            "+",
            "Landroidx/compose/ui/text/AnnotatedString$Annotation;",
            ">;>;",
            "Ljava/util/List<",
            "Landroidx/compose/ui/text/AnnotatedString$Range<",
            "Landroidx/compose/ui/text/Placeholder;",
            ">;>;IIJ",
            "Landroidx/compose/ui/text/font/FontFamily$Resolver;",
            "Landroidx/compose/ui/unit/Density;",
            ")V"
        }
    .end annotation

    .line 90
    new-instance v0, Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object/from16 v5, p9

    move-object/from16 v6, p10

    invoke-direct/range {v0 .. v6}, Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;-><init>(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/ui/unit/Density;)V

    const/4 v6, 0x0

    move v2, p5

    move v3, p6

    move-wide v4, p7

    move-object v1, v0

    move-object v0, p0

    .line 91
    invoke-direct/range {v0 .. v6}, Landroidx/compose/ui/text/AndroidParagraph;-><init>(Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;IIJLkotlin/jvm/internal/n;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Ljava/util/List;IIJLandroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/ui/unit/Density;Lkotlin/jvm/internal/n;)V
    .locals 0

    .line 2
    invoke-direct/range {p0 .. p10}, Landroidx/compose/ui/text/AndroidParagraph;-><init>(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Ljava/util/List;IIJLandroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/ui/unit/Density;)V

    return-void
.end method

.method private final constructTextLayout(IILandroid/text/TextUtils$TruncateAt;IIIIILjava/lang/CharSequence;)Landroidx/compose/ui/text/android/TextLayout;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/text/AndroidParagraph;->getWidth()F

    .line 4
    .line 5
    .line 6
    move-result v3

    .line 7
    invoke-virtual {v0}, Landroidx/compose/ui/text/AndroidParagraph;->getTextPaint$ui_text_release()Landroidx/compose/ui/text/platform/AndroidTextPaint;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    iget-object v1, v0, Landroidx/compose/ui/text/AndroidParagraph;->paragraphIntrinsics:Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;

    .line 12
    .line 13
    invoke-virtual {v1}, Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;->getTextDirectionHeuristic$ui_text_release()I

    .line 14
    .line 15
    .line 16
    move-result v7

    .line 17
    iget-object v1, v0, Landroidx/compose/ui/text/AndroidParagraph;->paragraphIntrinsics:Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;

    .line 18
    .line 19
    invoke-virtual {v1}, Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;->getLayoutIntrinsics$ui_text_release()Landroidx/compose/ui/text/android/LayoutIntrinsics;

    .line 20
    .line 21
    .line 22
    move-result-object v20

    .line 23
    iget-object v1, v0, Landroidx/compose/ui/text/AndroidParagraph;->paragraphIntrinsics:Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;

    .line 24
    .line 25
    invoke-virtual {v1}, Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;->getStyle()Landroidx/compose/ui/text/TextStyle;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-static {v1}, Landroidx/compose/ui/text/platform/AndroidParagraphHelper_androidKt;->isIncludeFontPaddingEnabled(Landroidx/compose/ui/text/TextStyle;)Z

    .line 30
    .line 31
    .line 32
    move-result v10

    .line 33
    new-instance v1, Landroidx/compose/ui/text/android/TextLayout;

    .line 34
    .line 35
    const v21, 0x30080

    .line 36
    .line 37
    .line 38
    const/16 v22, 0x0

    .line 39
    .line 40
    const/high16 v8, 0x3f800000    # 1.0f

    .line 41
    .line 42
    const/4 v9, 0x0

    .line 43
    const/4 v11, 0x1

    .line 44
    const/16 v18, 0x0

    .line 45
    .line 46
    const/16 v19, 0x0

    .line 47
    .line 48
    move/from16 v5, p1

    .line 49
    .line 50
    move/from16 v17, p2

    .line 51
    .line 52
    move-object/from16 v6, p3

    .line 53
    .line 54
    move/from16 v12, p4

    .line 55
    .line 56
    move/from16 v16, p5

    .line 57
    .line 58
    move/from16 v13, p6

    .line 59
    .line 60
    move/from16 v14, p7

    .line 61
    .line 62
    move/from16 v15, p8

    .line 63
    .line 64
    move-object/from16 v2, p9

    .line 65
    .line 66
    invoke-direct/range {v1 .. v22}, Landroidx/compose/ui/text/android/TextLayout;-><init>(Ljava/lang/CharSequence;FLandroid/text/TextPaint;ILandroid/text/TextUtils$TruncateAt;IFFZZIIIIII[I[ILandroidx/compose/ui/text/android/LayoutIntrinsics;ILkotlin/jvm/internal/n;)V

    .line 67
    .line 68
    .line 69
    return-object v1
.end method

.method public static synthetic constructTextLayout$default(Landroidx/compose/ui/text/AndroidParagraph;IILandroid/text/TextUtils$TruncateAt;IIIIILjava/lang/CharSequence;ILjava/lang/Object;)Landroidx/compose/ui/text/android/TextLayout;
    .locals 11

    .line 1
    move/from16 v0, p10

    .line 2
    .line 3
    and-int/lit16 v0, v0, 0x100

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/compose/ui/text/AndroidParagraph;->charSequence:Ljava/lang/CharSequence;

    .line 8
    .line 9
    move-object v10, v0

    .line 10
    :goto_0
    move-object v1, p0

    .line 11
    move v2, p1

    .line 12
    move v3, p2

    .line 13
    move-object v4, p3

    .line 14
    move v5, p4

    .line 15
    move/from16 v6, p5

    .line 16
    .line 17
    move/from16 v7, p6

    .line 18
    .line 19
    move/from16 v8, p7

    .line 20
    .line 21
    move/from16 v9, p8

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    move-object/from16 v10, p9

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    invoke-direct/range {v1 .. v10}, Landroidx/compose/ui/text/AndroidParagraph;->constructTextLayout(IILandroid/text/TextUtils$TruncateAt;IIIIILjava/lang/CharSequence;)Landroidx/compose/ui/text/android/TextLayout;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method public static synthetic getCharSequence$ui_text_release$annotations()V
    .locals 0
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    return-void
.end method

.method private final getShaderBrushSpans(Landroidx/compose/ui/text/android/TextLayout;)[Landroidx/compose/ui/text/platform/style/ShaderBrushSpan;
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroidx/compose/ui/text/android/TextLayout;->getText()Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v0, v0, Landroid/text/Spanned;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return-object v1

    .line 11
    :cond_0
    invoke-virtual {p1}, Landroidx/compose/ui/text/android/TextLayout;->getText()Ljava/lang/CharSequence;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v2, "null cannot be cast to non-null type android.text.Spanned"

    .line 16
    .line 17
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    check-cast v0, Landroid/text/Spanned;

    .line 21
    .line 22
    const-class v3, Landroidx/compose/ui/text/platform/style/ShaderBrushSpan;

    .line 23
    .line 24
    invoke-direct {p0, v0, v3}, Landroidx/compose/ui/text/AndroidParagraph;->hasSpan(Landroid/text/Spanned;Ljava/lang/Class;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    return-object v1

    .line 31
    :cond_1
    invoke-virtual {p1}, Landroidx/compose/ui/text/android/TextLayout;->getText()Ljava/lang/CharSequence;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    check-cast v0, Landroid/text/Spanned;

    .line 39
    .line 40
    invoke-virtual {p1}, Landroidx/compose/ui/text/android/TextLayout;->getText()Ljava/lang/CharSequence;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    const/4 v1, 0x0

    .line 49
    invoke-interface {v0, v1, p1, v3}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    check-cast p1, [Landroidx/compose/ui/text/platform/style/ShaderBrushSpan;

    .line 54
    .line 55
    return-object p1
.end method

.method public static synthetic getTextLocale$ui_text_release$annotations()V
    .locals 0
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    return-void
.end method

.method public static synthetic getTextPaint$ui_text_release$annotations()V
    .locals 0
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    return-void
.end method

.method private final hasSpan(Landroid/text/Spanned;Ljava/lang/Class;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/text/Spanned;",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    const/4 v0, -0x1

    .line 2
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    invoke-interface {p1, v0, v1, p2}, Landroid/text/Spanned;->nextSpanTransition(IILjava/lang/Class;)I

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eq p2, p1, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    return p1

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    return p1
.end method

.method private final paint(Landroidx/compose/ui/graphics/Canvas;)V
    .locals 3

    .line 1
    invoke-static {p1}, Landroidx/compose/ui/graphics/AndroidCanvas_androidKt;->getNativeCanvas(Landroidx/compose/ui/graphics/Canvas;)Landroid/graphics/Canvas;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0}, Landroidx/compose/ui/text/AndroidParagraph;->getDidExceedMaxLines()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/compose/ui/text/AndroidParagraph;->getWidth()F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual {p0}, Landroidx/compose/ui/text/AndroidParagraph;->getHeight()F

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-virtual {p1, v2, v2, v0, v1}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    .line 24
    .line 25
    .line 26
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/text/AndroidParagraph;->layout:Landroidx/compose/ui/text/android/TextLayout;

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Landroidx/compose/ui/text/android/TextLayout;->paint(Landroid/graphics/Canvas;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Landroidx/compose/ui/text/AndroidParagraph;->getDidExceedMaxLines()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 38
    .line 39
    .line 40
    :cond_1
    return-void
.end method


# virtual methods
.method public fillBoundingBoxes-8ffj60Q(J[FI)V
    .locals 2
    .param p4    # I
        .annotation build Landroidx/annotation/IntRange;
            from = 0x0L
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/AndroidParagraph;->layout:Landroidx/compose/ui/text/android/TextLayout;

    .line 2
    .line 3
    invoke-static {p1, p2}, Landroidx/compose/ui/text/TextRange;->getMin-impl(J)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-static {p1, p2}, Landroidx/compose/ui/text/TextRange;->getMax-impl(J)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-virtual {v0, v1, p1, p3, p4}, Landroidx/compose/ui/text/android/TextLayout;->fillBoundingBoxes(II[FI)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public getBidiRunDirection(I)Landroidx/compose/ui/text/style/ResolvedTextDirection;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/AndroidParagraph;->layout:Landroidx/compose/ui/text/android/TextLayout;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/compose/ui/text/android/TextLayout;->isRtlCharAt(I)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    sget-object p1, Landroidx/compose/ui/text/style/ResolvedTextDirection;->Rtl:Landroidx/compose/ui/text/style/ResolvedTextDirection;

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    sget-object p1, Landroidx/compose/ui/text/style/ResolvedTextDirection;->Ltr:Landroidx/compose/ui/text/style/ResolvedTextDirection;

    .line 13
    .line 14
    return-object p1
.end method

.method public getBoundingBox(I)Landroidx/compose/ui/geometry/Rect;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-ltz p1, :cond_0

    .line 3
    .line 4
    iget-object v1, p0, Landroidx/compose/ui/text/AndroidParagraph;->charSequence:Ljava/lang/CharSequence;

    .line 5
    .line 6
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-ge p1, v1, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    :cond_0
    if-nez v0, :cond_1

    .line 14
    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string v1, "offset("

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ") is out of bounds [0,"

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, Landroidx/compose/ui/text/AndroidParagraph;->charSequence:Ljava/lang/CharSequence;

    .line 34
    .line 35
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const/16 v1, 0x29

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {v0}, Landroidx/compose/ui/text/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :cond_1
    iget-object v0, p0, Landroidx/compose/ui/text/AndroidParagraph;->layout:Landroidx/compose/ui/text/android/TextLayout;

    .line 55
    .line 56
    invoke-virtual {v0, p1}, Landroidx/compose/ui/text/android/TextLayout;->getBoundingBox(I)Landroid/graphics/RectF;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    new-instance v0, Landroidx/compose/ui/geometry/Rect;

    .line 61
    .line 62
    iget v1, p1, Landroid/graphics/RectF;->left:F

    .line 63
    .line 64
    iget v2, p1, Landroid/graphics/RectF;->top:F

    .line 65
    .line 66
    iget v3, p1, Landroid/graphics/RectF;->right:F

    .line 67
    .line 68
    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    .line 69
    .line 70
    invoke-direct {v0, v1, v2, v3, p1}, Landroidx/compose/ui/geometry/Rect;-><init>(FFFF)V

    .line 71
    .line 72
    .line 73
    return-object v0
.end method

.method public final getCharSequence$ui_text_release()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/AndroidParagraph;->charSequence:Ljava/lang/CharSequence;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getConstraints-msEJaDk()J
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/compose/ui/text/AndroidParagraph;->constraints:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getCursorRect(I)Landroidx/compose/ui/geometry/Rect;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-ltz p1, :cond_0

    .line 3
    .line 4
    iget-object v1, p0, Landroidx/compose/ui/text/AndroidParagraph;->charSequence:Ljava/lang/CharSequence;

    .line 5
    .line 6
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-gt p1, v1, :cond_0

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v1, v0

    .line 15
    :goto_0
    if-nez v1, :cond_1

    .line 16
    .line 17
    new-instance v1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v2, "offset("

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v2, ") is out of bounds [0,"

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object v2, p0, Landroidx/compose/ui/text/AndroidParagraph;->charSequence:Ljava/lang/CharSequence;

    .line 36
    .line 37
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const/16 v2, 0x5d

    .line 45
    .line 46
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-static {v1}, Landroidx/compose/ui/text/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    iget-object v1, p0, Landroidx/compose/ui/text/AndroidParagraph;->layout:Landroidx/compose/ui/text/android/TextLayout;

    .line 57
    .line 58
    const/4 v2, 0x2

    .line 59
    const/4 v3, 0x0

    .line 60
    invoke-static {v1, p1, v0, v2, v3}, Landroidx/compose/ui/text/android/TextLayout;->getPrimaryHorizontal$default(Landroidx/compose/ui/text/android/TextLayout;IZILjava/lang/Object;)F

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-object v1, p0, Landroidx/compose/ui/text/AndroidParagraph;->layout:Landroidx/compose/ui/text/android/TextLayout;

    .line 65
    .line 66
    invoke-virtual {v1, p1}, Landroidx/compose/ui/text/android/TextLayout;->getLineForOffset(I)I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    new-instance v1, Landroidx/compose/ui/geometry/Rect;

    .line 71
    .line 72
    iget-object v2, p0, Landroidx/compose/ui/text/AndroidParagraph;->layout:Landroidx/compose/ui/text/android/TextLayout;

    .line 73
    .line 74
    invoke-virtual {v2, p1}, Landroidx/compose/ui/text/android/TextLayout;->getLineTop(I)F

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    iget-object v3, p0, Landroidx/compose/ui/text/AndroidParagraph;->layout:Landroidx/compose/ui/text/android/TextLayout;

    .line 79
    .line 80
    invoke-virtual {v3, p1}, Landroidx/compose/ui/text/android/TextLayout;->getLineBottom(I)F

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    invoke-direct {v1, v0, v2, v0, p1}, Landroidx/compose/ui/geometry/Rect;-><init>(FFFF)V

    .line 85
    .line 86
    .line 87
    return-object v1
.end method

.method public getDidExceedMaxLines()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/AndroidParagraph;->layout:Landroidx/compose/ui/text/android/TextLayout;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/text/android/TextLayout;->getDidExceedMaxLines()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getFirstBaseline()F
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroidx/compose/ui/text/AndroidParagraph;->getLineBaseline(I)F

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    return v0
.end method

.method public getHeight()F
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/AndroidParagraph;->layout:Landroidx/compose/ui/text/android/TextLayout;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/text/android/TextLayout;->getHeight()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    int-to-float v0, v0

    .line 8
    return v0
.end method

.method public getHorizontalPosition(IZ)F
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x0

    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    iget-object p2, p0, Landroidx/compose/ui/text/AndroidParagraph;->layout:Landroidx/compose/ui/text/android/TextLayout;

    .line 7
    .line 8
    invoke-static {p2, p1, v2, v1, v0}, Landroidx/compose/ui/text/android/TextLayout;->getPrimaryHorizontal$default(Landroidx/compose/ui/text/android/TextLayout;IZILjava/lang/Object;)F

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1

    .line 13
    :cond_0
    iget-object p2, p0, Landroidx/compose/ui/text/AndroidParagraph;->layout:Landroidx/compose/ui/text/android/TextLayout;

    .line 14
    .line 15
    invoke-static {p2, p1, v2, v1, v0}, Landroidx/compose/ui/text/android/TextLayout;->getSecondaryHorizontal$default(Landroidx/compose/ui/text/android/TextLayout;IZILjava/lang/Object;)F

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1
.end method

.method public getLastBaseline()F
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/text/AndroidParagraph;->getLineCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroidx/compose/ui/text/AndroidParagraph;->getLineBaseline(I)F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public final getLineAscent$ui_text_release(I)F
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/AndroidParagraph;->layout:Landroidx/compose/ui/text/android/TextLayout;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/compose/ui/text/android/TextLayout;->getLineAscent(I)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public getLineBaseline(I)F
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/AndroidParagraph;->layout:Landroidx/compose/ui/text/android/TextLayout;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/compose/ui/text/android/TextLayout;->getLineBaseline(I)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public getLineBottom(I)F
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/AndroidParagraph;->layout:Landroidx/compose/ui/text/android/TextLayout;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/compose/ui/text/android/TextLayout;->getLineBottom(I)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public getLineCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/AndroidParagraph;->layout:Landroidx/compose/ui/text/android/TextLayout;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/text/android/TextLayout;->getLineCount()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final getLineDescent$ui_text_release(I)F
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/AndroidParagraph;->layout:Landroidx/compose/ui/text/android/TextLayout;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/compose/ui/text/android/TextLayout;->getLineDescent(I)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final getLineEllipsisCount$ui_text_release(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/AndroidParagraph;->layout:Landroidx/compose/ui/text/android/TextLayout;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/compose/ui/text/android/TextLayout;->getLineEllipsisCount(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final getLineEllipsisOffset$ui_text_release(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/AndroidParagraph;->layout:Landroidx/compose/ui/text/android/TextLayout;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/compose/ui/text/android/TextLayout;->getLineEllipsisOffset(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public getLineEnd(IZ)I
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget-object p2, p0, Landroidx/compose/ui/text/AndroidParagraph;->layout:Landroidx/compose/ui/text/android/TextLayout;

    .line 4
    .line 5
    invoke-virtual {p2, p1}, Landroidx/compose/ui/text/android/TextLayout;->getLineVisibleEnd(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1

    .line 10
    :cond_0
    iget-object p2, p0, Landroidx/compose/ui/text/AndroidParagraph;->layout:Landroidx/compose/ui/text/android/TextLayout;

    .line 11
    .line 12
    invoke-virtual {p2, p1}, Landroidx/compose/ui/text/android/TextLayout;->getLineEnd(I)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1
.end method

.method public getLineForOffset(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/AndroidParagraph;->layout:Landroidx/compose/ui/text/android/TextLayout;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/compose/ui/text/android/TextLayout;->getLineForOffset(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public getLineForVerticalPosition(F)I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/AndroidParagraph;->layout:Landroidx/compose/ui/text/android/TextLayout;

    .line 2
    .line 3
    float-to-int p1, p1

    .line 4
    invoke-virtual {v0, p1}, Landroidx/compose/ui/text/android/TextLayout;->getLineForVertical(I)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    return p1
.end method

.method public getLineHeight(I)F
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/AndroidParagraph;->layout:Landroidx/compose/ui/text/android/TextLayout;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/compose/ui/text/android/TextLayout;->getLineHeight(I)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public getLineLeft(I)F
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/AndroidParagraph;->layout:Landroidx/compose/ui/text/android/TextLayout;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/compose/ui/text/android/TextLayout;->getLineLeft(I)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public getLineRight(I)F
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/AndroidParagraph;->layout:Landroidx/compose/ui/text/android/TextLayout;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/compose/ui/text/android/TextLayout;->getLineRight(I)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public getLineStart(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/AndroidParagraph;->layout:Landroidx/compose/ui/text/android/TextLayout;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/compose/ui/text/android/TextLayout;->getLineStart(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public getLineTop(I)F
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/AndroidParagraph;->layout:Landroidx/compose/ui/text/android/TextLayout;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/compose/ui/text/android/TextLayout;->getLineTop(I)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public getLineWidth(I)F
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/AndroidParagraph;->layout:Landroidx/compose/ui/text/android/TextLayout;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/compose/ui/text/android/TextLayout;->getLineWidth(I)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public getMaxIntrinsicWidth()F
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/AndroidParagraph;->paragraphIntrinsics:Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;->getMaxIntrinsicWidth()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final getMaxLines()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/ui/text/AndroidParagraph;->maxLines:I

    .line 2
    .line 3
    return v0
.end method

.method public getMinIntrinsicWidth()F
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/AndroidParagraph;->paragraphIntrinsics:Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;->getMinIntrinsicWidth()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getOffsetForPosition-k-4lQ0M(J)I
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/AndroidParagraph;->layout:Landroidx/compose/ui/text/android/TextLayout;

    .line 2
    .line 3
    const-wide v1, 0xffffffffL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    and-long/2addr v1, p1

    .line 9
    long-to-int v1, v1

    .line 10
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    float-to-int v1, v1

    .line 15
    invoke-virtual {v0, v1}, Landroidx/compose/ui/text/android/TextLayout;->getLineForVertical(I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget-object v1, p0, Landroidx/compose/ui/text/AndroidParagraph;->layout:Landroidx/compose/ui/text/android/TextLayout;

    .line 20
    .line 21
    const/16 v2, 0x20

    .line 22
    .line 23
    shr-long/2addr p1, v2

    .line 24
    long-to-int p1, p1

    .line 25
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-virtual {v1, v0, p1}, Landroidx/compose/ui/text/android/TextLayout;->getOffsetForHorizontal(IF)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    return p1
.end method

.method public final getOverflow-gIe3tQ8()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/ui/text/AndroidParagraph;->overflow:I

    .line 2
    .line 3
    return v0
.end method

.method public getParagraphDirection(I)Landroidx/compose/ui/text/style/ResolvedTextDirection;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/AndroidParagraph;->layout:Landroidx/compose/ui/text/android/TextLayout;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/compose/ui/text/android/TextLayout;->getLineForOffset(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iget-object v0, p0, Landroidx/compose/ui/text/AndroidParagraph;->layout:Landroidx/compose/ui/text/android/TextLayout;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Landroidx/compose/ui/text/android/TextLayout;->getParagraphDirection(I)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    const/4 v0, 0x1

    .line 14
    if-ne p1, v0, :cond_0

    .line 15
    .line 16
    sget-object p1, Landroidx/compose/ui/text/style/ResolvedTextDirection;->Ltr:Landroidx/compose/ui/text/style/ResolvedTextDirection;

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_0
    sget-object p1, Landroidx/compose/ui/text/style/ResolvedTextDirection;->Rtl:Landroidx/compose/ui/text/style/ResolvedTextDirection;

    .line 20
    .line 21
    return-object p1
.end method

.method public final getParagraphIntrinsics()Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/AndroidParagraph;->paragraphIntrinsics:Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPathForRange(II)Landroidx/compose/ui/graphics/Path;
    .locals 2

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    if-gt p1, p2, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/compose/ui/text/AndroidParagraph;->charSequence:Ljava/lang/CharSequence;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-gt p2, v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    if-nez v0, :cond_1

    .line 17
    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string/jumbo v1, "start("

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v1, ") or end("

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, ") is out of range [0.."

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Landroidx/compose/ui/text/AndroidParagraph;->charSequence:Ljava/lang/CharSequence;

    .line 46
    .line 47
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v1, "], or start > end!"

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-static {v0}, Landroidx/compose/ui/text/internal/InlineClassHelperKt;->throwIllegalArgumentException(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    :cond_1
    new-instance v0, Landroid/graphics/Path;

    .line 67
    .line 68
    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    .line 69
    .line 70
    .line 71
    iget-object v1, p0, Landroidx/compose/ui/text/AndroidParagraph;->layout:Landroidx/compose/ui/text/android/TextLayout;

    .line 72
    .line 73
    invoke-virtual {v1, p1, p2, v0}, Landroidx/compose/ui/text/android/TextLayout;->getSelectionPath(IILandroid/graphics/Path;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v0}, Landroidx/compose/ui/graphics/AndroidPath_androidKt;->asComposePath(Landroid/graphics/Path;)Landroidx/compose/ui/graphics/Path;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    return-object p1
.end method

.method public getPlaceholderRects()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/compose/ui/geometry/Rect;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/AndroidParagraph;->placeholderRects:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public getRangeForRect-8-6BmAI(Landroidx/compose/ui/geometry/Rect;ILandroidx/compose/ui/text/TextInclusionStrategy;)J
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/AndroidParagraph;->layout:Landroidx/compose/ui/text/android/TextLayout;

    .line 2
    .line 3
    invoke-static {p1}, Landroidx/compose/ui/graphics/RectHelper_androidKt;->toAndroidRectF(Landroidx/compose/ui/geometry/Rect;)Landroid/graphics/RectF;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p2}, Landroidx/compose/ui/text/AndroidParagraph_androidKt;->access$toLayoutTextGranularity-duNsdkg(I)I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    new-instance v1, Landroidx/compose/ui/text/AndroidParagraph$getRangeForRect$range$1;

    .line 12
    .line 13
    invoke-direct {v1, p3}, Landroidx/compose/ui/text/AndroidParagraph$getRangeForRect$range$1;-><init>(Landroidx/compose/ui/text/TextInclusionStrategy;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1, p2, v1}, Landroidx/compose/ui/text/android/TextLayout;->getRangeForRect(Landroid/graphics/RectF;ILhd/p;)[I

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    sget-object p1, Landroidx/compose/ui/text/TextRange;->Companion:Landroidx/compose/ui/text/TextRange$Companion;

    .line 23
    .line 24
    invoke-virtual {p1}, Landroidx/compose/ui/text/TextRange$Companion;->getZero-d9O1mEE()J

    .line 25
    .line 26
    .line 27
    move-result-wide p1

    .line 28
    return-wide p1

    .line 29
    :cond_0
    const/4 p2, 0x0

    .line 30
    aget p2, p1, p2

    .line 31
    .line 32
    const/4 p3, 0x1

    .line 33
    aget p1, p1, p3

    .line 34
    .line 35
    invoke-static {p2, p1}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(II)J

    .line 36
    .line 37
    .line 38
    move-result-wide p1

    .line 39
    return-wide p1
.end method

.method public final getTextLocale$ui_text_release()Ljava/util/Locale;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/AndroidParagraph;->paragraphIntrinsics:Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;->getTextPaint$ui_text_release()Landroidx/compose/ui/text/platform/AndroidTextPaint;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/graphics/Paint;->getTextLocale()Ljava/util/Locale;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final getTextPaint$ui_text_release()Landroidx/compose/ui/text/platform/AndroidTextPaint;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/AndroidParagraph;->paragraphIntrinsics:Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/text/platform/AndroidParagraphIntrinsics;->getTextPaint$ui_text_release()Landroidx/compose/ui/text/platform/AndroidTextPaint;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getWidth()F
    .locals 2

    .line 1
    iget-wide v0, p0, Landroidx/compose/ui/text/AndroidParagraph;->constraints:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    int-to-float v0, v0

    .line 8
    return v0
.end method

.method public getWordBoundary--jx7JFs(I)J
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/AndroidParagraph;->layout:Landroidx/compose/ui/text/android/TextLayout;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/text/android/TextLayout;->getWordIterator()Landroidx/compose/ui/text/android/selection/WordIterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0, p1}, Landroidx/compose/ui/text/android/selection/WordBoundary_androidKt;->getWordStart(Landroidx/compose/ui/text/android/selection/WordIterator;I)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static {v0, p1}, Landroidx/compose/ui/text/android/selection/WordBoundary_androidKt;->getWordEnd(Landroidx/compose/ui/text/android/selection/WordIterator;I)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-static {v1, p1}, Landroidx/compose/ui/text/TextRangeKt;->TextRange(II)J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    return-wide v0
.end method

.method public isLineEllipsized(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/text/AndroidParagraph;->layout:Landroidx/compose/ui/text/android/TextLayout;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/compose/ui/text/android/TextLayout;->isLineEllipsized(I)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public paint-LG529CI(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/text/AndroidParagraph;->getTextPaint$ui_text_release()Landroidx/compose/ui/text/platform/AndroidTextPaint;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/ui/text/platform/AndroidTextPaint;->getBlendMode-0nO6VwU()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p0}, Landroidx/compose/ui/text/AndroidParagraph;->getTextPaint$ui_text_release()Landroidx/compose/ui/text/platform/AndroidTextPaint;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1, p2, p3}, Landroidx/compose/ui/text/platform/AndroidTextPaint;->setColor-8_81llA(J)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, p4}, Landroidx/compose/ui/text/platform/AndroidTextPaint;->setShadow(Landroidx/compose/ui/graphics/Shadow;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, p5}, Landroidx/compose/ui/text/platform/AndroidTextPaint;->setTextDecoration(Landroidx/compose/ui/text/style/TextDecoration;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p6}, Landroidx/compose/ui/text/platform/AndroidTextPaint;->setDrawStyle(Landroidx/compose/ui/graphics/drawscope/DrawStyle;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, p7}, Landroidx/compose/ui/text/platform/AndroidTextPaint;->setBlendMode-s9anfk8(I)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p0, p1}, Landroidx/compose/ui/text/AndroidParagraph;->paint(Landroidx/compose/ui/graphics/Canvas;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Landroidx/compose/ui/text/AndroidParagraph;->getTextPaint$ui_text_release()Landroidx/compose/ui/text/platform/AndroidTextPaint;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p1, v0}, Landroidx/compose/ui/text/platform/AndroidTextPaint;->setBlendMode-s9anfk8(I)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public paint-RPmYEkk(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/text/AndroidParagraph;->getTextPaint$ui_text_release()Landroidx/compose/ui/text/platform/AndroidTextPaint;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p2, p3}, Landroidx/compose/ui/text/platform/AndroidTextPaint;->setColor-8_81llA(J)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p4}, Landroidx/compose/ui/text/platform/AndroidTextPaint;->setShadow(Landroidx/compose/ui/graphics/Shadow;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p5}, Landroidx/compose/ui/text/platform/AndroidTextPaint;->setTextDecoration(Landroidx/compose/ui/text/style/TextDecoration;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, p1}, Landroidx/compose/ui/text/AndroidParagraph;->paint(Landroidx/compose/ui/graphics/Canvas;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public paint-hn5TExg(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/text/AndroidParagraph;->getTextPaint$ui_text_release()Landroidx/compose/ui/text/platform/AndroidTextPaint;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/ui/text/platform/AndroidTextPaint;->getBlendMode-0nO6VwU()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p0}, Landroidx/compose/ui/text/AndroidParagraph;->getTextPaint$ui_text_release()Landroidx/compose/ui/text/platform/AndroidTextPaint;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p0}, Landroidx/compose/ui/text/AndroidParagraph;->getWidth()F

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-virtual {p0}, Landroidx/compose/ui/text/AndroidParagraph;->getHeight()F

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    int-to-long v4, v2

    .line 26
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    int-to-long v2, v2

    .line 31
    const/16 v6, 0x20

    .line 32
    .line 33
    shl-long/2addr v4, v6

    .line 34
    const-wide v6, 0xffffffffL

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    and-long/2addr v2, v6

    .line 40
    or-long/2addr v2, v4

    .line 41
    invoke-static {v2, v3}, Landroidx/compose/ui/geometry/Size;->constructor-impl(J)J

    .line 42
    .line 43
    .line 44
    move-result-wide v2

    .line 45
    invoke-virtual {v1, p2, v2, v3, p3}, Landroidx/compose/ui/text/platform/AndroidTextPaint;->setBrush-12SF9DM(Landroidx/compose/ui/graphics/Brush;JF)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, p4}, Landroidx/compose/ui/text/platform/AndroidTextPaint;->setShadow(Landroidx/compose/ui/graphics/Shadow;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, p5}, Landroidx/compose/ui/text/platform/AndroidTextPaint;->setTextDecoration(Landroidx/compose/ui/text/style/TextDecoration;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, p6}, Landroidx/compose/ui/text/platform/AndroidTextPaint;->setDrawStyle(Landroidx/compose/ui/graphics/drawscope/DrawStyle;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1, p7}, Landroidx/compose/ui/text/platform/AndroidTextPaint;->setBlendMode-s9anfk8(I)V

    .line 58
    .line 59
    .line 60
    invoke-direct {p0, p1}, Landroidx/compose/ui/text/AndroidParagraph;->paint(Landroidx/compose/ui/graphics/Canvas;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Landroidx/compose/ui/text/AndroidParagraph;->getTextPaint$ui_text_release()Landroidx/compose/ui/text/platform/AndroidTextPaint;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p1, v0}, Landroidx/compose/ui/text/platform/AndroidTextPaint;->setBlendMode-s9anfk8(I)V

    .line 68
    .line 69
    .line 70
    return-void
.end method
