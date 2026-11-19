.class public final Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;
.super Landroidx/compose/ui/node/ModifierNodeElement;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/compose/ui/node/ModifierNodeElement<",
        "Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringNode;",
        ">;"
    }
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final autoSize:Landroidx/compose/foundation/text/TextAutoSize;

.field private final color:Landroidx/compose/ui/graphics/ColorProducer;

.field private final fontFamilyResolver:Landroidx/compose/ui/text/font/FontFamily$Resolver;

.field private final maxLines:I

.field private final minLines:I

.field private final onPlaceholderLayout:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field private final onTextLayout:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field

.field private final overflow:I

.field private final placeholders:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/compose/ui/text/AnnotatedString$Range<",
            "Landroidx/compose/ui/text/Placeholder;",
            ">;>;"
        }
    .end annotation
.end field

.field private final selectionController:Landroidx/compose/foundation/text/modifiers/SelectionController;

.field private final softWrap:Z

.field private final style:Landroidx/compose/ui/text/TextStyle;

.field private final text:Landroidx/compose/ui/text/AnnotatedString;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lhd/l;IZIILjava/util/List;Lhd/l;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/foundation/text/TextAutoSize;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/text/AnnotatedString;",
            "Landroidx/compose/ui/text/TextStyle;",
            "Landroidx/compose/ui/text/font/FontFamily$Resolver;",
            "Lhd/l;",
            "IZII",
            "Ljava/util/List<",
            "Landroidx/compose/ui/text/AnnotatedString$Range<",
            "Landroidx/compose/ui/text/Placeholder;",
            ">;>;",
            "Lhd/l;",
            "Landroidx/compose/foundation/text/modifiers/SelectionController;",
            "Landroidx/compose/ui/graphics/ColorProducer;",
            "Landroidx/compose/foundation/text/TextAutoSize;",
            ")V"
        }
    .end annotation

    .line 4
    invoke-direct {p0}, Landroidx/compose/ui/node/ModifierNodeElement;-><init>()V

    .line 5
    iput-object p1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->text:Landroidx/compose/ui/text/AnnotatedString;

    .line 6
    iput-object p2, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->style:Landroidx/compose/ui/text/TextStyle;

    .line 7
    iput-object p3, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->fontFamilyResolver:Landroidx/compose/ui/text/font/FontFamily$Resolver;

    .line 8
    iput-object p4, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->onTextLayout:Lhd/l;

    .line 9
    iput p5, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->overflow:I

    .line 10
    iput-boolean p6, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->softWrap:Z

    .line 11
    iput p7, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->maxLines:I

    .line 12
    iput p8, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->minLines:I

    .line 13
    iput-object p9, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->placeholders:Ljava/util/List;

    .line 14
    iput-object p10, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->onPlaceholderLayout:Lhd/l;

    .line 15
    iput-object p11, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->selectionController:Landroidx/compose/foundation/text/modifiers/SelectionController;

    .line 16
    iput-object p12, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->color:Landroidx/compose/ui/graphics/ColorProducer;

    .line 17
    iput-object p13, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->autoSize:Landroidx/compose/foundation/text/TextAutoSize;

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lhd/l;IZIILjava/util/List;Lhd/l;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/foundation/text/TextAutoSize;ILkotlin/jvm/internal/n;)V
    .locals 18

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x8

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v7, v2

    goto :goto_0

    :cond_0
    move-object/from16 v7, p4

    :goto_0
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_1

    .line 2
    sget-object v1, Landroidx/compose/ui/text/style/TextOverflow;->Companion:Landroidx/compose/ui/text/style/TextOverflow$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/text/style/TextOverflow$Companion;->getClip-gIe3tQ8()I

    move-result v1

    move v8, v1

    goto :goto_1

    :cond_1
    move/from16 v8, p5

    :goto_1
    and-int/lit8 v1, v0, 0x20

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    move v9, v3

    goto :goto_2

    :cond_2
    move/from16 v9, p6

    :goto_2
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_3

    const v1, 0x7fffffff

    move v10, v1

    goto :goto_3

    :cond_3
    move/from16 v10, p7

    :goto_3
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_4

    move v11, v3

    goto :goto_4

    :cond_4
    move/from16 v11, p8

    :goto_4
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_5

    move-object v12, v2

    goto :goto_5

    :cond_5
    move-object/from16 v12, p9

    :goto_5
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_6

    move-object v13, v2

    goto :goto_6

    :cond_6
    move-object/from16 v13, p10

    :goto_6
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_7

    move-object v14, v2

    goto :goto_7

    :cond_7
    move-object/from16 v14, p11

    :goto_7
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_8

    move-object v15, v2

    goto :goto_8

    :cond_8
    move-object/from16 v15, p12

    :goto_8
    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_9

    move-object/from16 v16, v2

    goto :goto_9

    :cond_9
    move-object/from16 v16, p13

    :goto_9
    const/16 v17, 0x0

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    .line 3
    invoke-direct/range {v3 .. v17}, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;-><init>(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lhd/l;IZIILjava/util/List;Lhd/l;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/foundation/text/TextAutoSize;Lkotlin/jvm/internal/n;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lhd/l;IZIILjava/util/List;Lhd/l;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/foundation/text/TextAutoSize;Lkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p13}, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;-><init>(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lhd/l;IZIILjava/util/List;Lhd/l;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/foundation/text/TextAutoSize;)V

    return-void
.end method

.method private final component1()Landroidx/compose/ui/text/AnnotatedString;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->text:Landroidx/compose/ui/text/AnnotatedString;

    return-object v0
.end method

.method private final component10()Lhd/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/l;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->onPlaceholderLayout:Lhd/l;

    .line 2
    .line 3
    return-object v0
.end method

.method private final component11()Landroidx/compose/foundation/text/modifiers/SelectionController;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->selectionController:Landroidx/compose/foundation/text/modifiers/SelectionController;

    return-object v0
.end method

.method private final component12()Landroidx/compose/ui/graphics/ColorProducer;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->color:Landroidx/compose/ui/graphics/ColorProducer;

    return-object v0
.end method

.method private final component13()Landroidx/compose/foundation/text/TextAutoSize;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->autoSize:Landroidx/compose/foundation/text/TextAutoSize;

    return-object v0
.end method

.method private final component2()Landroidx/compose/ui/text/TextStyle;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->style:Landroidx/compose/ui/text/TextStyle;

    return-object v0
.end method

.method private final component3()Landroidx/compose/ui/text/font/FontFamily$Resolver;
    .locals 1

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->fontFamilyResolver:Landroidx/compose/ui/text/font/FontFamily$Resolver;

    return-object v0
.end method

.method private final component4()Lhd/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lhd/l;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->onTextLayout:Lhd/l;

    .line 2
    .line 3
    return-object v0
.end method

.method private final component5-gIe3tQ8()I
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->overflow:I

    return v0
.end method

.method private final component6()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->softWrap:Z

    return v0
.end method

.method private final component7()I
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->maxLines:I

    return v0
.end method

.method private final component8()I
    .locals 1

    iget v0, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->minLines:I

    return v0
.end method

.method private final component9()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/compose/ui/text/AnnotatedString$Range<",
            "Landroidx/compose/ui/text/Placeholder;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->placeholders:Ljava/util/List;

    return-object v0
.end method

.method public static synthetic copy-RWo7tUw$default(Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lhd/l;IZIILjava/util/List;Lhd/l;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/foundation/text/TextAutoSize;ILjava/lang/Object;)Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;
    .locals 12

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 1
    iget-object p1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->text:Landroidx/compose/ui/text/AnnotatedString;

    :cond_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->style:Landroidx/compose/ui/text/TextStyle;

    goto :goto_0

    :cond_1
    move-object v1, p2

    :goto_0
    and-int/lit8 v2, v0, 0x4

    if-eqz v2, :cond_2

    iget-object v2, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->fontFamilyResolver:Landroidx/compose/ui/text/font/FontFamily$Resolver;

    goto :goto_1

    :cond_2
    move-object v2, p3

    :goto_1
    and-int/lit8 v3, v0, 0x8

    if-eqz v3, :cond_3

    iget-object v3, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->onTextLayout:Lhd/l;

    goto :goto_2

    :cond_3
    move-object/from16 v3, p4

    :goto_2
    and-int/lit8 v4, v0, 0x10

    if-eqz v4, :cond_4

    iget v4, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->overflow:I

    goto :goto_3

    :cond_4
    move/from16 v4, p5

    :goto_3
    and-int/lit8 v5, v0, 0x20

    if-eqz v5, :cond_5

    iget-boolean v5, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->softWrap:Z

    goto :goto_4

    :cond_5
    move/from16 v5, p6

    :goto_4
    and-int/lit8 v6, v0, 0x40

    if-eqz v6, :cond_6

    iget v6, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->maxLines:I

    goto :goto_5

    :cond_6
    move/from16 v6, p7

    :goto_5
    and-int/lit16 v7, v0, 0x80

    if-eqz v7, :cond_7

    iget v7, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->minLines:I

    goto :goto_6

    :cond_7
    move/from16 v7, p8

    :goto_6
    and-int/lit16 v8, v0, 0x100

    if-eqz v8, :cond_8

    iget-object v8, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->placeholders:Ljava/util/List;

    goto :goto_7

    :cond_8
    move-object/from16 v8, p9

    :goto_7
    and-int/lit16 v9, v0, 0x200

    if-eqz v9, :cond_9

    iget-object v9, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->onPlaceholderLayout:Lhd/l;

    goto :goto_8

    :cond_9
    move-object/from16 v9, p10

    :goto_8
    and-int/lit16 v10, v0, 0x400

    if-eqz v10, :cond_a

    iget-object v10, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->selectionController:Landroidx/compose/foundation/text/modifiers/SelectionController;

    goto :goto_9

    :cond_a
    move-object/from16 v10, p11

    :goto_9
    and-int/lit16 v11, v0, 0x800

    if-eqz v11, :cond_b

    iget-object v11, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->color:Landroidx/compose/ui/graphics/ColorProducer;

    goto :goto_a

    :cond_b
    move-object/from16 v11, p12

    :goto_a
    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_c

    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->autoSize:Landroidx/compose/foundation/text/TextAutoSize;

    move-object/from16 p15, v0

    :goto_b
    move-object p2, p0

    move-object p3, p1

    move-object/from16 p4, v1

    move-object/from16 p5, v2

    move-object/from16 p6, v3

    move/from16 p7, v4

    move/from16 p8, v5

    move/from16 p9, v6

    move/from16 p10, v7

    move-object/from16 p11, v8

    move-object/from16 p12, v9

    move-object/from16 p13, v10

    move-object/from16 p14, v11

    goto :goto_c

    :cond_c
    move-object/from16 p15, p13

    goto :goto_b

    :goto_c
    invoke-virtual/range {p2 .. p15}, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->copy-RWo7tUw(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lhd/l;IZIILjava/util/List;Lhd/l;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/foundation/text/TextAutoSize;)Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final copy-RWo7tUw(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lhd/l;IZIILjava/util/List;Lhd/l;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/foundation/text/TextAutoSize;)Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/text/AnnotatedString;",
            "Landroidx/compose/ui/text/TextStyle;",
            "Landroidx/compose/ui/text/font/FontFamily$Resolver;",
            "Lhd/l;",
            "IZII",
            "Ljava/util/List<",
            "Landroidx/compose/ui/text/AnnotatedString$Range<",
            "Landroidx/compose/ui/text/Placeholder;",
            ">;>;",
            "Lhd/l;",
            "Landroidx/compose/foundation/text/modifiers/SelectionController;",
            "Landroidx/compose/ui/graphics/ColorProducer;",
            "Landroidx/compose/foundation/text/TextAutoSize;",
            ")",
            "Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;

    .line 2
    .line 3
    const/4 v14, 0x0

    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    move-object/from16 v2, p2

    .line 7
    .line 8
    move-object/from16 v3, p3

    .line 9
    .line 10
    move-object/from16 v4, p4

    .line 11
    .line 12
    move/from16 v5, p5

    .line 13
    .line 14
    move/from16 v6, p6

    .line 15
    .line 16
    move/from16 v7, p7

    .line 17
    .line 18
    move/from16 v8, p8

    .line 19
    .line 20
    move-object/from16 v9, p9

    .line 21
    .line 22
    move-object/from16 v10, p10

    .line 23
    .line 24
    move-object/from16 v11, p11

    .line 25
    .line 26
    move-object/from16 v12, p12

    .line 27
    .line 28
    move-object/from16 v13, p13

    .line 29
    .line 30
    invoke-direct/range {v0 .. v14}, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;-><init>(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lhd/l;IZIILjava/util/List;Lhd/l;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/foundation/text/TextAutoSize;Lkotlin/jvm/internal/n;)V

    .line 31
    .line 32
    .line 33
    return-object v0
.end method

.method public create()Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringNode;
    .locals 18

    move-object/from16 v0, p0

    .line 2
    new-instance v1, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringNode;

    .line 3
    iget-object v2, v0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->text:Landroidx/compose/ui/text/AnnotatedString;

    .line 4
    iget-object v3, v0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->style:Landroidx/compose/ui/text/TextStyle;

    .line 5
    iget-object v4, v0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->fontFamilyResolver:Landroidx/compose/ui/text/font/FontFamily$Resolver;

    .line 6
    iget-object v5, v0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->onTextLayout:Lhd/l;

    .line 7
    iget v6, v0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->overflow:I

    .line 8
    iget-boolean v7, v0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->softWrap:Z

    .line 9
    iget v8, v0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->maxLines:I

    .line 10
    iget v9, v0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->minLines:I

    .line 11
    iget-object v10, v0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->placeholders:Ljava/util/List;

    .line 12
    iget-object v11, v0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->onPlaceholderLayout:Lhd/l;

    .line 13
    iget-object v12, v0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->selectionController:Landroidx/compose/foundation/text/modifiers/SelectionController;

    .line 14
    iget-object v13, v0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->color:Landroidx/compose/ui/graphics/ColorProducer;

    .line 15
    iget-object v14, v0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->autoSize:Landroidx/compose/foundation/text/TextAutoSize;

    const/16 v16, 0x2000

    const/16 v17, 0x0

    const/4 v15, 0x0

    .line 16
    invoke-direct/range {v1 .. v17}, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringNode;-><init>(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/font/FontFamily$Resolver;Lhd/l;IZIILjava/util/List;Lhd/l;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/foundation/text/TextAutoSize;Lhd/l;ILkotlin/jvm/internal/n;)V

    return-object v1
.end method

.method public bridge synthetic create()Landroidx/compose/ui/Modifier$Node;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->create()Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringNode;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->color:Landroidx/compose/ui/graphics/ColorProducer;

    .line 12
    .line 13
    check-cast p1, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;

    .line 14
    .line 15
    iget-object v3, p1, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->color:Landroidx/compose/ui/graphics/ColorProducer;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->text:Landroidx/compose/ui/text/AnnotatedString;

    .line 25
    .line 26
    iget-object v3, p1, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->text:Landroidx/compose/ui/text/AnnotatedString;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->style:Landroidx/compose/ui/text/TextStyle;

    .line 36
    .line 37
    iget-object v3, p1, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->style:Landroidx/compose/ui/text/TextStyle;

    .line 38
    .line 39
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->placeholders:Ljava/util/List;

    .line 47
    .line 48
    iget-object v3, p1, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->placeholders:Ljava/util/List;

    .line 49
    .line 50
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_5

    .line 55
    .line 56
    return v2

    .line 57
    :cond_5
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->fontFamilyResolver:Landroidx/compose/ui/text/font/FontFamily$Resolver;

    .line 58
    .line 59
    iget-object v3, p1, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->fontFamilyResolver:Landroidx/compose/ui/text/font/FontFamily$Resolver;

    .line 60
    .line 61
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-nez v1, :cond_6

    .line 66
    .line 67
    return v2

    .line 68
    :cond_6
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->autoSize:Landroidx/compose/foundation/text/TextAutoSize;

    .line 69
    .line 70
    iget-object v3, p1, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->autoSize:Landroidx/compose/foundation/text/TextAutoSize;

    .line 71
    .line 72
    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-nez v1, :cond_7

    .line 77
    .line 78
    return v2

    .line 79
    :cond_7
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->onTextLayout:Lhd/l;

    .line 80
    .line 81
    iget-object v3, p1, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->onTextLayout:Lhd/l;

    .line 82
    .line 83
    if-eq v1, v3, :cond_8

    .line 84
    .line 85
    return v2

    .line 86
    :cond_8
    iget v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->overflow:I

    .line 87
    .line 88
    iget v3, p1, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->overflow:I

    .line 89
    .line 90
    invoke-static {v1, v3}, Landroidx/compose/ui/text/style/TextOverflow;->equals-impl0(II)Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-nez v1, :cond_9

    .line 95
    .line 96
    return v2

    .line 97
    :cond_9
    iget-boolean v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->softWrap:Z

    .line 98
    .line 99
    iget-boolean v3, p1, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->softWrap:Z

    .line 100
    .line 101
    if-eq v1, v3, :cond_a

    .line 102
    .line 103
    return v2

    .line 104
    :cond_a
    iget v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->maxLines:I

    .line 105
    .line 106
    iget v3, p1, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->maxLines:I

    .line 107
    .line 108
    if-eq v1, v3, :cond_b

    .line 109
    .line 110
    return v2

    .line 111
    :cond_b
    iget v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->minLines:I

    .line 112
    .line 113
    iget v3, p1, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->minLines:I

    .line 114
    .line 115
    if-eq v1, v3, :cond_c

    .line 116
    .line 117
    return v2

    .line 118
    :cond_c
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->onPlaceholderLayout:Lhd/l;

    .line 119
    .line 120
    iget-object v3, p1, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->onPlaceholderLayout:Lhd/l;

    .line 121
    .line 122
    if-eq v1, v3, :cond_d

    .line 123
    .line 124
    return v2

    .line 125
    :cond_d
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->selectionController:Landroidx/compose/foundation/text/modifiers/SelectionController;

    .line 126
    .line 127
    iget-object p1, p1, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->selectionController:Landroidx/compose/foundation/text/modifiers/SelectionController;

    .line 128
    .line 129
    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    if-nez p1, :cond_e

    .line 134
    .line 135
    return v2

    .line 136
    :cond_e
    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->text:Landroidx/compose/ui/text/AnnotatedString;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/text/AnnotatedString;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->style:Landroidx/compose/ui/text/TextStyle;

    .line 10
    .line 11
    invoke-virtual {v1}, Landroidx/compose/ui/text/TextStyle;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v0, v1

    .line 16
    mul-int/lit8 v0, v0, 0x1f

    .line 17
    .line 18
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->fontFamilyResolver:Landroidx/compose/ui/text/font/FontFamily$Resolver;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    add-int/2addr v0, v1

    .line 25
    mul-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->onTextLayout:Lhd/l;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move v1, v2

    .line 38
    :goto_0
    add-int/2addr v0, v1

    .line 39
    mul-int/lit8 v0, v0, 0x1f

    .line 40
    .line 41
    iget v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->overflow:I

    .line 42
    .line 43
    invoke-static {v1}, Landroidx/compose/ui/text/style/TextOverflow;->hashCode-impl(I)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    add-int/2addr v0, v1

    .line 48
    mul-int/lit8 v0, v0, 0x1f

    .line 49
    .line 50
    iget-boolean v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->softWrap:Z

    .line 51
    .line 52
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    add-int/2addr v0, v1

    .line 57
    mul-int/lit8 v0, v0, 0x1f

    .line 58
    .line 59
    iget v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->maxLines:I

    .line 60
    .line 61
    add-int/2addr v0, v1

    .line 62
    mul-int/lit8 v0, v0, 0x1f

    .line 63
    .line 64
    iget v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->minLines:I

    .line 65
    .line 66
    add-int/2addr v0, v1

    .line 67
    mul-int/lit8 v0, v0, 0x1f

    .line 68
    .line 69
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->placeholders:Ljava/util/List;

    .line 70
    .line 71
    if-eqz v1, :cond_1

    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    goto :goto_1

    .line 78
    :cond_1
    move v1, v2

    .line 79
    :goto_1
    add-int/2addr v0, v1

    .line 80
    mul-int/lit8 v0, v0, 0x1f

    .line 81
    .line 82
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->onPlaceholderLayout:Lhd/l;

    .line 83
    .line 84
    if-eqz v1, :cond_2

    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    goto :goto_2

    .line 91
    :cond_2
    move v1, v2

    .line 92
    :goto_2
    add-int/2addr v0, v1

    .line 93
    mul-int/lit8 v0, v0, 0x1f

    .line 94
    .line 95
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->selectionController:Landroidx/compose/foundation/text/modifiers/SelectionController;

    .line 96
    .line 97
    if-eqz v1, :cond_3

    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    goto :goto_3

    .line 104
    :cond_3
    move v1, v2

    .line 105
    :goto_3
    add-int/2addr v0, v1

    .line 106
    mul-int/lit8 v0, v0, 0x1f

    .line 107
    .line 108
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->autoSize:Landroidx/compose/foundation/text/TextAutoSize;

    .line 109
    .line 110
    if-eqz v1, :cond_4

    .line 111
    .line 112
    invoke-interface {v1}, Landroidx/compose/foundation/text/TextAutoSize;->hashCode()I

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    goto :goto_4

    .line 117
    :cond_4
    move v1, v2

    .line 118
    :goto_4
    add-int/2addr v0, v1

    .line 119
    mul-int/lit8 v0, v0, 0x1f

    .line 120
    .line 121
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->color:Landroidx/compose/ui/graphics/ColorProducer;

    .line 122
    .line 123
    if-eqz v1, :cond_5

    .line 124
    .line 125
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    :cond_5
    add-int/2addr v0, v2

    .line 130
    return v0
.end method

.method public inspectableProperties(Landroidx/compose/ui/platform/InspectorInfo;)V
    .locals 0

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SelectableTextAnnotatedStringElement(text="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->text:Landroidx/compose/ui/text/AnnotatedString;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", style="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->style:Landroidx/compose/ui/text/TextStyle;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", fontFamilyResolver="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->fontFamilyResolver:Landroidx/compose/ui/text/font/FontFamily$Resolver;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", onTextLayout="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->onTextLayout:Lhd/l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", overflow="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->overflow:I

    invoke-static {v1}, Landroidx/compose/ui/text/style/TextOverflow;->toString-impl(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", softWrap="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->softWrap:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", maxLines="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->maxLines:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", minLines="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->minLines:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", placeholders="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->placeholders:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", onPlaceholderLayout="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->onPlaceholderLayout:Lhd/l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", selectionController="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->selectionController:Landroidx/compose/foundation/text/modifiers/SelectionController;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", color="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->color:Landroidx/compose/ui/graphics/ColorProducer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", autoSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->autoSize:Landroidx/compose/foundation/text/TextAutoSize;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public update(Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringNode;)V
    .locals 14

    .line 2
    iget-object v1, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->text:Landroidx/compose/ui/text/AnnotatedString;

    .line 3
    iget-object v2, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->style:Landroidx/compose/ui/text/TextStyle;

    .line 4
    iget-object v3, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->placeholders:Ljava/util/List;

    .line 5
    iget v4, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->minLines:I

    .line 6
    iget v5, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->maxLines:I

    .line 7
    iget-boolean v6, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->softWrap:Z

    .line 8
    iget-object v7, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->fontFamilyResolver:Landroidx/compose/ui/text/font/FontFamily$Resolver;

    .line 9
    iget v8, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->overflow:I

    .line 10
    iget-object v9, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->onTextLayout:Lhd/l;

    .line 11
    iget-object v10, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->onPlaceholderLayout:Lhd/l;

    .line 12
    iget-object v11, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->selectionController:Landroidx/compose/foundation/text/modifiers/SelectionController;

    .line 13
    iget-object v12, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->color:Landroidx/compose/ui/graphics/ColorProducer;

    .line 14
    iget-object v13, p0, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->autoSize:Landroidx/compose/foundation/text/TextAutoSize;

    move-object v0, p1

    .line 15
    invoke-virtual/range {v0 .. v13}, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringNode;->update-7NebLg4(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;IIZLandroidx/compose/ui/text/font/FontFamily$Resolver;ILhd/l;Lhd/l;Landroidx/compose/foundation/text/modifiers/SelectionController;Landroidx/compose/ui/graphics/ColorProducer;Landroidx/compose/foundation/text/TextAutoSize;)V

    return-void
.end method

.method public bridge synthetic update(Landroidx/compose/ui/Modifier$Node;)V
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringNode;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;->update(Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringNode;)V

    return-void
.end method
