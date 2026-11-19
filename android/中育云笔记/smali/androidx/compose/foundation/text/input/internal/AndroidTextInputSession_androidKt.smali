.class public final Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final ALL_MIME_TYPES:[Ljava/lang/String;

.field public static final TIA_DEBUG:Z = false

.field private static final TIA_TAG:Ljava/lang/String; = "AndroidTextInputSession"


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "image/*"

    .line 2
    .line 3
    const-string v1, "video/*"

    .line 4
    .line 5
    const-string v2, "*/*"

    .line 6
    .line 7
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt;->ALL_MIME_TYPES:[Ljava/lang/String;

    .line 12
    .line 13
    return-void
.end method

.method public static final synthetic access$getALL_MIME_TYPES$p()[Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt;->ALL_MIME_TYPES:[Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic getTIA_DEBUG$annotations()V
    .locals 0
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    return-void
.end method

.method private static final logDebug(Ljava/lang/String;Lhd/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lhd/a;",
            ")V"
        }
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic logDebug$default(Ljava/lang/String;Lhd/a;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const-string p0, "AndroidTextInputSession"

    .line 6
    .line 7
    :cond_0
    invoke-static {p0, p1}, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt;->logDebug(Ljava/lang/String;Lhd/a;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static final platformSpecificTextInputSession(Landroidx/compose/ui/platform/PlatformTextInputSession;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;Lhd/l;Lhd/a;Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;Lvd/k;Landroidx/compose/ui/platform/ViewConfiguration;Lvc/c;)Ljava/lang/Object;
    .locals 17
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/platform/PlatformTextInputSession;",
            "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;",
            "Landroidx/compose/foundation/text/input/internal/TextLayoutState;",
            "Landroidx/compose/ui/text/input/ImeOptions;",
            "Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;",
            "Lhd/l;",
            "Lhd/a;",
            "Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;",
            "Lvd/k;",
            "Landroidx/compose/ui/platform/ViewConfiguration;",
            "Lvc/c<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p10

    instance-of v1, v0, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2;

    iget v2, v1, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2;->label:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2;

    invoke-direct {v1, v0}, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2;-><init>(Lvc/c;)V

    :goto_0
    iget-object v0, v1, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2;->result:Ljava/lang/Object;

    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    move-result-object v2

    .line 4
    iget v3, v1, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2;->label:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-eq v3, v4, :cond_1

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 5
    new-instance v5, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3;

    const/16 v16, 0x0

    move-object/from16 v10, p0

    move-object/from16 v7, p1

    move-object/from16 v8, p2

    move-object/from16 v11, p3

    move-object/from16 v12, p4

    move-object/from16 v13, p5

    move-object/from16 v14, p6

    move-object/from16 v9, p7

    move-object/from16 v6, p8

    move-object/from16 v15, p9

    invoke-direct/range {v5 .. v16}, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3;-><init>(Lvd/k;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;Landroidx/compose/ui/platform/PlatformTextInputSession;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;Lhd/l;Lhd/a;Landroidx/compose/ui/platform/ViewConfiguration;Lvc/c;)V

    iput v4, v1, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2;->label:I

    invoke-static {v5, v1}, Lkotlinx/coroutines/d;->e(Lhd/p;Lvc/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_3

    return-object v2

    :cond_3
    :goto_1
    new-instance v0, Lkotlin/KotlinNothingValueException;

    invoke-direct {v0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw v0
.end method

.method public static final platformSpecificTextInputSession(Landroidx/compose/ui/platform/PlatformTextInputSession;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;Lhd/l;Lhd/a;Lvd/k;Landroidx/compose/ui/platform/ViewConfiguration;Lvc/c;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/platform/PlatformTextInputSession;",
            "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;",
            "Landroidx/compose/foundation/text/input/internal/TextLayoutState;",
            "Landroidx/compose/ui/text/input/ImeOptions;",
            "Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;",
            "Lhd/l;",
            "Lhd/a;",
            "Lvd/k;",
            "Landroidx/compose/ui/platform/ViewConfiguration;",
            "Lvc/c<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p9

    instance-of v1, v0, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1;

    iget v2, v1, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1;->label:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1;->label:I

    :goto_0
    move-object v12, v1

    goto :goto_1

    :cond_0
    new-instance v1, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1;

    invoke-direct {v1, v0}, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1;-><init>(Lvc/c;)V

    goto :goto_0

    :goto_1
    iget-object v0, v12, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1;->result:Ljava/lang/Object;

    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    move-result-object v1

    .line 1
    iget v2, v12, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    invoke-static {v0}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 2
    invoke-interface {p0}, Landroidx/compose/ui/platform/PlatformTextInputSession;->getView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager_androidKt;->ComposeInputMethodManager(Landroid/view/View;)Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;

    move-result-object v9

    .line 3
    iput v3, v12, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1;->label:I

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v10, p7

    move-object/from16 v11, p8

    invoke-static/range {v2 .. v12}, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt;->platformSpecificTextInputSession(Landroidx/compose/ui/platform/PlatformTextInputSession;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;Lhd/l;Lhd/a;Landroidx/compose/foundation/text/input/internal/ComposeInputMethodManager;Lvd/k;Landroidx/compose/ui/platform/ViewConfiguration;Lvc/c;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    :goto_2
    new-instance p0, Lkotlin/KotlinNothingValueException;

    invoke-direct {p0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p0
.end method

.method public static synthetic platformSpecificTextInputSession$default(Landroidx/compose/ui/platform/PlatformTextInputSession;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;Lhd/l;Lhd/a;Lvd/k;Landroidx/compose/ui/platform/ViewConfiguration;Lvc/c;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    and-int/lit8 p11, p10, 0x20

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p11, :cond_0

    .line 5
    .line 6
    move-object p6, v0

    .line 7
    :cond_0
    and-int/lit8 p11, p10, 0x40

    .line 8
    .line 9
    if-eqz p11, :cond_1

    .line 10
    .line 11
    move-object p7, v0

    .line 12
    :cond_1
    and-int/lit16 p10, p10, 0x80

    .line 13
    .line 14
    if-eqz p10, :cond_2

    .line 15
    .line 16
    move-object p8, v0

    .line 17
    :cond_2
    invoke-static/range {p0 .. p9}, Landroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt;->platformSpecificTextInputSession(Landroidx/compose/ui/platform/PlatformTextInputSession;Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/foundation/content/internal/ReceiveContentConfiguration;Lhd/l;Lhd/a;Lvd/k;Landroidx/compose/ui/platform/ViewConfiguration;Lvc/c;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method
