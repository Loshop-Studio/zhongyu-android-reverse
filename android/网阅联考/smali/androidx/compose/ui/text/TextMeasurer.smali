.class public final Landroidx/compose/ui/text/TextMeasurer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/Immutable;
.end annotation

.annotation build Landroidx/compose/ui/text/ExperimentalTextApi;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/text/TextMeasurer$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000 \'2\u00020\u0001:\u0001\'B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u008d\u0001\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00122\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00142\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00162\u0008\u0008\u0002\u0010\u0017\u001a\u00020\t2\u0014\u0008\u0002\u0010\u0018\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001b0\u001a0\u00192\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u001d2\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u001f\u001a\u00020\u00052\u0008\u0008\u0002\u0010 \u001a\u00020\u00032\u0008\u0008\u0002\u0010!\u001a\u00020\u0016H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008\"\u0010#Jw\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020$2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00122\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00142\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00162\u0008\u0008\u0002\u0010\u0017\u001a\u00020\t2\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u001d2\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u001f\u001a\u00020\u00052\u0008\u0008\u0002\u0010 \u001a\u00020\u00032\u0008\u0008\u0002\u0010!\u001a\u00020\u0016H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008%\u0010&R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006("
    }
    d2 = {
        "Landroidx/compose/ui/text/TextMeasurer;",
        "",
        "fallbackFontFamilyResolver",
        "Landroidx/compose/ui/text/font/FontFamily$Resolver;",
        "fallbackDensity",
        "Landroidx/compose/ui/unit/Density;",
        "fallbackLayoutDirection",
        "Landroidx/compose/ui/unit/LayoutDirection;",
        "cacheSize",
        "",
        "(Landroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;I)V",
        "textLayoutCache",
        "Landroidx/compose/ui/text/TextLayoutCache;",
        "measure",
        "Landroidx/compose/ui/text/TextLayoutResult;",
        "text",
        "Landroidx/compose/ui/text/AnnotatedString;",
        "style",
        "Landroidx/compose/ui/text/TextStyle;",
        "overflow",
        "Landroidx/compose/ui/text/style/TextOverflow;",
        "softWrap",
        "",
        "maxLines",
        "placeholders",
        "",
        "Landroidx/compose/ui/text/AnnotatedString$Range;",
        "Landroidx/compose/ui/text/Placeholder;",
        "constraints",
        "Landroidx/compose/ui/unit/Constraints;",
        "layoutDirection",
        "density",
        "fontFamilyResolver",
        "skipCache",
        "measure-xDpz5zY",
        "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;IZILjava/util/List;JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Z)Landroidx/compose/ui/text/TextLayoutResult;",
        "",
        "measure-wNUYSr0",
        "(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;IZIJLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Z)Landroidx/compose/ui/text/TextLayoutResult;",
        "Companion",
        "ui-text_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Landroidx/compose/ui/text/TextMeasurer$Companion;


# instance fields
.field private final cacheSize:I

.field private final fallbackDensity:Landroidx/compose/ui/unit/Density;

.field private final fallbackFontFamilyResolver:Landroidx/compose/ui/text/font/FontFamily$Resolver;

.field private final fallbackLayoutDirection:Landroidx/compose/ui/unit/LayoutDirection;

.field private final textLayoutCache:Landroidx/compose/ui/text/TextLayoutCache;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/compose/ui/text/TextMeasurer$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/compose/ui/text/TextMeasurer$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Landroidx/compose/ui/text/TextMeasurer;->Companion:Landroidx/compose/ui/text/TextMeasurer$Companion;

    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;I)V
    .locals 1

    const-string v0, "fallbackFontFamilyResolver"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fallbackDensity"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fallbackLayoutDirection"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Landroidx/compose/ui/text/TextMeasurer;->fallbackFontFamilyResolver:Landroidx/compose/ui/text/font/FontFamily$Resolver;

    .line 3
    iput-object p2, p0, Landroidx/compose/ui/text/TextMeasurer;->fallbackDensity:Landroidx/compose/ui/unit/Density;

    .line 4
    iput-object p3, p0, Landroidx/compose/ui/text/TextMeasurer;->fallbackLayoutDirection:Landroidx/compose/ui/unit/LayoutDirection;

    .line 5
    iput p4, p0, Landroidx/compose/ui/text/TextMeasurer;->cacheSize:I

    if-lez p4, :cond_0

    .line 6
    new-instance p1, Landroidx/compose/ui/text/TextLayoutCache;

    invoke-direct {p1, p4}, Landroidx/compose/ui/text/TextLayoutCache;-><init>(I)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 7
    :goto_0
    iput-object p1, p0, Landroidx/compose/ui/text/TextMeasurer;->textLayoutCache:Landroidx/compose/ui/text/TextLayoutCache;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 8
    invoke-static {}, Landroidx/compose/ui/text/TextMeasurerKt;->access$getDefaultCacheSize$p()I

    move-result p4

    .line 9
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/compose/ui/text/TextMeasurer;-><init>(Landroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;I)V

    return-void
.end method

.method public static synthetic measure-wNUYSr0$default(Landroidx/compose/ui/text/TextMeasurer;Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;IZIJLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;ZILjava/lang/Object;)Landroidx/compose/ui/text/TextLayoutResult;
    .locals 12

    .line 1
    move-object v0, p0

    .line 2
    move/from16 v1, p12

    .line 3
    .line 4
    and-int/lit8 v2, v1, 0x2

    .line 5
    .line 6
    if-eqz v2, :cond_0

    .line 7
    .line 8
    sget-object v2, Landroidx/compose/ui/text/TextStyle;->Companion:Landroidx/compose/ui/text/TextStyle$Companion;

    .line 9
    .line 10
    invoke-virtual {v2}, Landroidx/compose/ui/text/TextStyle$Companion;->getDefault()Landroidx/compose/ui/text/TextStyle;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v2, p2

    .line 16
    :goto_0
    and-int/lit8 v3, v1, 0x4

    .line 17
    .line 18
    if-eqz v3, :cond_1

    .line 19
    .line 20
    sget-object v3, Landroidx/compose/ui/text/style/TextOverflow;->Companion:Landroidx/compose/ui/text/style/TextOverflow$Companion;

    .line 21
    .line 22
    invoke-virtual {v3}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getClip-gIe3tQ8()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move v3, p3

    .line 28
    :goto_1
    and-int/lit8 v4, v1, 0x8

    .line 29
    .line 30
    if-eqz v4, :cond_2

    .line 31
    .line 32
    const/4 v4, 0x1

    .line 33
    goto :goto_2

    .line 34
    :cond_2
    move/from16 v4, p4

    .line 35
    .line 36
    :goto_2
    and-int/lit8 v5, v1, 0x10

    .line 37
    .line 38
    if-eqz v5, :cond_3

    .line 39
    .line 40
    const v5, 0x7fffffff

    .line 41
    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_3
    move/from16 v5, p5

    .line 45
    .line 46
    :goto_3
    and-int/lit8 v6, v1, 0x20

    .line 47
    .line 48
    if-eqz v6, :cond_4

    .line 49
    .line 50
    const/4 v6, 0x0

    .line 51
    const/4 v7, 0x0

    .line 52
    const/4 v8, 0x0

    .line 53
    const/4 v9, 0x0

    .line 54
    const/16 v10, 0xf

    .line 55
    .line 56
    const/4 v11, 0x0

    .line 57
    move p2, v6

    .line 58
    move p3, v7

    .line 59
    move/from16 p4, v8

    .line 60
    .line 61
    move/from16 p5, v9

    .line 62
    .line 63
    move/from16 p6, v10

    .line 64
    .line 65
    move-object/from16 p7, v11

    .line 66
    .line 67
    invoke-static/range {p2 .. p7}, Landroidx/compose/ui/unit/ConstraintsKt;->Constraints$default(IIIIILjava/lang/Object;)J

    .line 68
    .line 69
    .line 70
    move-result-wide v6

    .line 71
    goto :goto_4

    .line 72
    :cond_4
    move-wide/from16 v6, p6

    .line 73
    .line 74
    :goto_4
    and-int/lit8 v8, v1, 0x40

    .line 75
    .line 76
    if-eqz v8, :cond_5

    .line 77
    .line 78
    iget-object v8, v0, Landroidx/compose/ui/text/TextMeasurer;->fallbackLayoutDirection:Landroidx/compose/ui/unit/LayoutDirection;

    .line 79
    .line 80
    goto :goto_5

    .line 81
    :cond_5
    move-object/from16 v8, p8

    .line 82
    .line 83
    :goto_5
    and-int/lit16 v9, v1, 0x80

    .line 84
    .line 85
    if-eqz v9, :cond_6

    .line 86
    .line 87
    iget-object v9, v0, Landroidx/compose/ui/text/TextMeasurer;->fallbackDensity:Landroidx/compose/ui/unit/Density;

    .line 88
    .line 89
    goto :goto_6

    .line 90
    :cond_6
    move-object/from16 v9, p9

    .line 91
    .line 92
    :goto_6
    and-int/lit16 v10, v1, 0x100

    .line 93
    .line 94
    if-eqz v10, :cond_7

    .line 95
    .line 96
    iget-object v10, v0, Landroidx/compose/ui/text/TextMeasurer;->fallbackFontFamilyResolver:Landroidx/compose/ui/text/font/FontFamily$Resolver;

    .line 97
    .line 98
    goto :goto_7

    .line 99
    :cond_7
    move-object/from16 v10, p10

    .line 100
    .line 101
    :goto_7
    and-int/lit16 v1, v1, 0x200

    .line 102
    .line 103
    if-eqz v1, :cond_8

    .line 104
    .line 105
    const/4 v1, 0x0

    .line 106
    goto :goto_8

    .line 107
    :cond_8
    move/from16 v1, p11

    .line 108
    .line 109
    :goto_8
    move-object p2, p0

    .line 110
    move-object p3, p1

    .line 111
    move-object/from16 p4, v2

    .line 112
    .line 113
    move/from16 p5, v3

    .line 114
    .line 115
    move/from16 p6, v4

    .line 116
    .line 117
    move/from16 p7, v5

    .line 118
    .line 119
    move-wide/from16 p8, v6

    .line 120
    .line 121
    move-object/from16 p10, v8

    .line 122
    .line 123
    move-object/from16 p11, v9

    .line 124
    .line 125
    move-object/from16 p12, v10

    .line 126
    .line 127
    move/from16 p13, v1

    .line 128
    .line 129
    invoke-virtual/range {p2 .. p13}, Landroidx/compose/ui/text/TextMeasurer;->measure-wNUYSr0(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;IZIJLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Z)Landroidx/compose/ui/text/TextLayoutResult;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    return-object v0
.end method

.method public static synthetic measure-xDpz5zY$default(Landroidx/compose/ui/text/TextMeasurer;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;IZILjava/util/List;JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;ZILjava/lang/Object;)Landroidx/compose/ui/text/TextLayoutResult;
    .locals 13

    .line 1
    move-object v0, p0

    .line 2
    move/from16 v1, p13

    .line 3
    .line 4
    and-int/lit8 v2, v1, 0x2

    .line 5
    .line 6
    if-eqz v2, :cond_0

    .line 7
    .line 8
    sget-object v2, Landroidx/compose/ui/text/TextStyle;->Companion:Landroidx/compose/ui/text/TextStyle$Companion;

    .line 9
    .line 10
    invoke-virtual {v2}, Landroidx/compose/ui/text/TextStyle$Companion;->getDefault()Landroidx/compose/ui/text/TextStyle;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v2, p2

    .line 16
    :goto_0
    and-int/lit8 v3, v1, 0x4

    .line 17
    .line 18
    if-eqz v3, :cond_1

    .line 19
    .line 20
    sget-object v3, Landroidx/compose/ui/text/style/TextOverflow;->Companion:Landroidx/compose/ui/text/style/TextOverflow$Companion;

    .line 21
    .line 22
    invoke-virtual {v3}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getClip-gIe3tQ8()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move/from16 v3, p3

    .line 28
    .line 29
    :goto_1
    and-int/lit8 v4, v1, 0x8

    .line 30
    .line 31
    if-eqz v4, :cond_2

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    goto :goto_2

    .line 35
    :cond_2
    move/from16 v4, p4

    .line 36
    .line 37
    :goto_2
    and-int/lit8 v5, v1, 0x10

    .line 38
    .line 39
    if-eqz v5, :cond_3

    .line 40
    .line 41
    const v5, 0x7fffffff

    .line 42
    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_3
    move/from16 v5, p5

    .line 46
    .line 47
    :goto_3
    and-int/lit8 v6, v1, 0x20

    .line 48
    .line 49
    if-eqz v6, :cond_4

    .line 50
    .line 51
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    goto :goto_4

    .line 56
    :cond_4
    move-object/from16 v6, p6

    .line 57
    .line 58
    :goto_4
    and-int/lit8 v7, v1, 0x40

    .line 59
    .line 60
    if-eqz v7, :cond_5

    .line 61
    .line 62
    const/4 v7, 0x0

    .line 63
    const/4 v8, 0x0

    .line 64
    const/4 v9, 0x0

    .line 65
    const/4 v10, 0x0

    .line 66
    const/16 v11, 0xf

    .line 67
    .line 68
    const/4 v12, 0x0

    .line 69
    move p2, v7

    .line 70
    move/from16 p3, v8

    .line 71
    .line 72
    move/from16 p4, v9

    .line 73
    .line 74
    move/from16 p5, v10

    .line 75
    .line 76
    move/from16 p6, v11

    .line 77
    .line 78
    move-object/from16 p7, v12

    .line 79
    .line 80
    invoke-static/range {p2 .. p7}, Landroidx/compose/ui/unit/ConstraintsKt;->Constraints$default(IIIIILjava/lang/Object;)J

    .line 81
    .line 82
    .line 83
    move-result-wide v7

    .line 84
    goto :goto_5

    .line 85
    :cond_5
    move-wide/from16 v7, p7

    .line 86
    .line 87
    :goto_5
    and-int/lit16 v9, v1, 0x80

    .line 88
    .line 89
    if-eqz v9, :cond_6

    .line 90
    .line 91
    iget-object v9, v0, Landroidx/compose/ui/text/TextMeasurer;->fallbackLayoutDirection:Landroidx/compose/ui/unit/LayoutDirection;

    .line 92
    .line 93
    goto :goto_6

    .line 94
    :cond_6
    move-object/from16 v9, p9

    .line 95
    .line 96
    :goto_6
    and-int/lit16 v10, v1, 0x100

    .line 97
    .line 98
    if-eqz v10, :cond_7

    .line 99
    .line 100
    iget-object v10, v0, Landroidx/compose/ui/text/TextMeasurer;->fallbackDensity:Landroidx/compose/ui/unit/Density;

    .line 101
    .line 102
    goto :goto_7

    .line 103
    :cond_7
    move-object/from16 v10, p10

    .line 104
    .line 105
    :goto_7
    and-int/lit16 v11, v1, 0x200

    .line 106
    .line 107
    if-eqz v11, :cond_8

    .line 108
    .line 109
    iget-object v11, v0, Landroidx/compose/ui/text/TextMeasurer;->fallbackFontFamilyResolver:Landroidx/compose/ui/text/font/FontFamily$Resolver;

    .line 110
    .line 111
    goto :goto_8

    .line 112
    :cond_8
    move-object/from16 v11, p11

    .line 113
    .line 114
    :goto_8
    and-int/lit16 v1, v1, 0x400

    .line 115
    .line 116
    if-eqz v1, :cond_9

    .line 117
    .line 118
    const/4 v1, 0x0

    .line 119
    goto :goto_9

    .line 120
    :cond_9
    move/from16 v1, p12

    .line 121
    .line 122
    :goto_9
    move-object p2, p0

    .line 123
    move-object/from16 p3, p1

    .line 124
    .line 125
    move-object/from16 p4, v2

    .line 126
    .line 127
    move/from16 p5, v3

    .line 128
    .line 129
    move/from16 p6, v4

    .line 130
    .line 131
    move/from16 p7, v5

    .line 132
    .line 133
    move-object/from16 p8, v6

    .line 134
    .line 135
    move-wide/from16 p9, v7

    .line 136
    .line 137
    move-object/from16 p11, v9

    .line 138
    .line 139
    move-object/from16 p12, v10

    .line 140
    .line 141
    move-object/from16 p13, v11

    .line 142
    .line 143
    move/from16 p14, v1

    .line 144
    .line 145
    invoke-virtual/range {p2 .. p14}, Landroidx/compose/ui/text/TextMeasurer;->measure-xDpz5zY(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;IZILjava/util/List;JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Z)Landroidx/compose/ui/text/TextLayoutResult;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    return-object v0
.end method


# virtual methods
.method public final measure-wNUYSr0(Ljava/lang/String;Landroidx/compose/ui/text/TextStyle;IZIJLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Z)Landroidx/compose/ui/text/TextLayoutResult;
    .locals 16
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    .line 1
    const-string/jumbo v0, "text"

    .line 2
    .line 3
    .line 4
    move-object/from16 v2, p1

    .line 5
    .line 6
    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const-string/jumbo v0, "style"

    .line 10
    .line 11
    .line 12
    move-object/from16 v7, p2

    .line 13
    .line 14
    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string v0, "layoutDirection"

    .line 18
    .line 19
    move-object/from16 v10, p8

    .line 20
    .line 21
    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-string v0, "density"

    .line 25
    .line 26
    move-object/from16 v11, p9

    .line 27
    .line 28
    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v0, "fontFamilyResolver"

    .line 32
    .line 33
    move-object/from16 v12, p10

    .line 34
    .line 35
    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    new-instance v0, Landroidx/compose/ui/text/AnnotatedString;

    .line 39
    .line 40
    const/4 v3, 0x0

    .line 41
    const/4 v4, 0x0

    .line 42
    const/4 v5, 0x6

    .line 43
    const/4 v6, 0x0

    .line 44
    move-object v1, v0

    .line 45
    invoke-direct/range {v1 .. v6}, Landroidx/compose/ui/text/AnnotatedString;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 46
    .line 47
    .line 48
    const/4 v8, 0x0

    .line 49
    const/16 v14, 0x20

    .line 50
    .line 51
    const/4 v15, 0x0

    .line 52
    move-object/from16 v1, p0

    .line 53
    .line 54
    move-object v2, v0

    .line 55
    move-object/from16 v3, p2

    .line 56
    .line 57
    move/from16 v4, p3

    .line 58
    .line 59
    move/from16 v5, p4

    .line 60
    .line 61
    move/from16 v6, p5

    .line 62
    .line 63
    move-object v7, v8

    .line 64
    move-wide/from16 v8, p6

    .line 65
    .line 66
    move/from16 v13, p11

    .line 67
    .line 68
    invoke-static/range {v1 .. v15}, Landroidx/compose/ui/text/TextMeasurer;->measure-xDpz5zY$default(Landroidx/compose/ui/text/TextMeasurer;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;IZILjava/util/List;JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;ZILjava/lang/Object;)Landroidx/compose/ui/text/TextLayoutResult;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    return-object v0
.end method

.method public final measure-xDpz5zY(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;IZILjava/util/List;JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;Z)Landroidx/compose/ui/text/TextLayoutResult;
    .locals 15
    .annotation build Landroidx/compose/runtime/Stable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/text/AnnotatedString;",
            "Landroidx/compose/ui/text/TextStyle;",
            "IZI",
            "Ljava/util/List<",
            "Landroidx/compose/ui/text/AnnotatedString$Range<",
            "Landroidx/compose/ui/text/Placeholder;",
            ">;>;J",
            "Landroidx/compose/ui/unit/LayoutDirection;",
            "Landroidx/compose/ui/unit/Density;",
            "Landroidx/compose/ui/text/font/FontFamily$Resolver;",
            "Z)",
            "Landroidx/compose/ui/text/TextLayoutResult;"
        }
    .end annotation

    .line 1
    move-object v0, p0

    .line 2
    const-string/jumbo v1, "text"

    .line 3
    .line 4
    .line 5
    move-object/from16 v3, p1

    .line 6
    .line 7
    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string/jumbo v1, "style"

    .line 11
    .line 12
    .line 13
    move-object/from16 v4, p2

    .line 14
    .line 15
    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v1, "placeholders"

    .line 19
    .line 20
    move-object/from16 v5, p6

    .line 21
    .line 22
    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const-string v1, "layoutDirection"

    .line 26
    .line 27
    move-object/from16 v10, p9

    .line 28
    .line 29
    invoke-static {v10, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const-string v1, "density"

    .line 33
    .line 34
    move-object/from16 v9, p10

    .line 35
    .line 36
    invoke-static {v9, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v1, "fontFamilyResolver"

    .line 40
    .line 41
    move-object/from16 v11, p11

    .line 42
    .line 43
    invoke-static {v11, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    new-instance v1, Landroidx/compose/ui/text/TextLayoutInput;

    .line 47
    .line 48
    const/4 v14, 0x0

    .line 49
    move-object v2, v1

    .line 50
    move/from16 v6, p5

    .line 51
    .line 52
    move/from16 v7, p4

    .line 53
    .line 54
    move/from16 v8, p3

    .line 55
    .line 56
    move-wide/from16 v12, p7

    .line 57
    .line 58
    invoke-direct/range {v2 .. v14}, Landroidx/compose/ui/text/TextLayoutInput;-><init>(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IZILandroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/FontFamily$Resolver;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 59
    .line 60
    .line 61
    if-nez p12, :cond_0

    .line 62
    .line 63
    iget-object v2, v0, Landroidx/compose/ui/text/TextMeasurer;->textLayoutCache:Landroidx/compose/ui/text/TextLayoutCache;

    .line 64
    .line 65
    if-eqz v2, :cond_0

    .line 66
    .line 67
    invoke-virtual {v2, v1}, Landroidx/compose/ui/text/TextLayoutCache;->get(Landroidx/compose/ui/text/TextLayoutInput;)Landroidx/compose/ui/text/TextLayoutResult;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    goto :goto_0

    .line 72
    :cond_0
    const/4 v2, 0x0

    .line 73
    :goto_0
    if-eqz v2, :cond_1

    .line 74
    .line 75
    invoke-virtual {v2}, Landroidx/compose/ui/text/TextLayoutResult;->getMultiParagraph()Landroidx/compose/ui/text/MultiParagraph;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-virtual {v3}, Landroidx/compose/ui/text/MultiParagraph;->getWidth()F

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    invoke-static {v3}, Landroidx/compose/ui/text/ParagraphKt;->ceilToInt(F)I

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    invoke-virtual {v2}, Landroidx/compose/ui/text/TextLayoutResult;->getMultiParagraph()Landroidx/compose/ui/text/MultiParagraph;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-virtual {v4}, Landroidx/compose/ui/text/MultiParagraph;->getHeight()F

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    invoke-static {v4}, Landroidx/compose/ui/text/ParagraphKt;->ceilToInt(F)I

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    invoke-static {v3, v4}, Landroidx/compose/ui/unit/IntSizeKt;->IntSize(II)J

    .line 100
    .line 101
    .line 102
    move-result-wide v3

    .line 103
    move-wide/from16 v5, p7

    .line 104
    .line 105
    invoke-static {v5, v6, v3, v4}, Landroidx/compose/ui/unit/ConstraintsKt;->constrain-4WqzIAM(JJ)J

    .line 106
    .line 107
    .line 108
    move-result-wide v3

    .line 109
    invoke-virtual {v2, v1, v3, v4}, Landroidx/compose/ui/text/TextLayoutResult;->copy-O0kMr_c(Landroidx/compose/ui/text/TextLayoutInput;J)Landroidx/compose/ui/text/TextLayoutResult;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    goto :goto_1

    .line 114
    :cond_1
    sget-object v2, Landroidx/compose/ui/text/TextMeasurer;->Companion:Landroidx/compose/ui/text/TextMeasurer$Companion;

    .line 115
    .line 116
    invoke-static {v2, v1}, Landroidx/compose/ui/text/TextMeasurer$Companion;->access$layout(Landroidx/compose/ui/text/TextMeasurer$Companion;Landroidx/compose/ui/text/TextLayoutInput;)Landroidx/compose/ui/text/TextLayoutResult;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    iget-object v3, v0, Landroidx/compose/ui/text/TextMeasurer;->textLayoutCache:Landroidx/compose/ui/text/TextLayoutCache;

    .line 121
    .line 122
    if-eqz v3, :cond_2

    .line 123
    .line 124
    invoke-virtual {v3, v1, v2}, Landroidx/compose/ui/text/TextLayoutCache;->put(Landroidx/compose/ui/text/TextLayoutInput;Landroidx/compose/ui/text/TextLayoutResult;)Landroidx/compose/ui/text/TextLayoutResult;

    .line 125
    .line 126
    .line 127
    :cond_2
    move-object v1, v2

    .line 128
    :goto_1
    return-object v1
.end method
