.class public final Landroidx/compose/material3/SearchBarDefaults;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/material3/ExperimentalMaterial3Api;
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J&\u0010\n\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0004H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u009e\u0001\u0010\u001d\u001a\u00020\u001a2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00042\u0008\u0008\u0002\u0010\r\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u0004H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u00ca\u0001\u00101\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020!0 2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020!0 2\u0006\u0010%\u001a\u00020$2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020!0 2\u0008\u0008\u0002\u0010(\u001a\u00020\'2\u0008\u0008\u0002\u0010)\u001a\u00020$2\u0015\u0008\u0002\u0010,\u001a\u000f\u0012\u0004\u0012\u00020!\u0018\u00010*\u00a2\u0006\u0002\u0008+2\u0015\u0008\u0002\u0010-\u001a\u000f\u0012\u0004\u0012\u00020!\u0018\u00010*\u00a2\u0006\u0002\u0008+2\u0015\u0008\u0002\u0010.\u001a\u000f\u0012\u0004\u0012\u00020!\u0018\u00010*\u00a2\u0006\u0002\u0008+2\u0008\u0008\u0002\u0010\n\u001a\u00020\u001a2\n\u0008\u0002\u00100\u001a\u0004\u0018\u00010/H\u0007\u00a2\u0006\u0004\u00081\u00102J0\u0010\n\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u001d\u001a\u00020\u001aH\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u00083\u00104J\u008a\u0001\u0010\u001d\u001a\u00020\u001a2\u0008\u0008\u0002\u00105\u001a\u00020\u00042\u0008\u0008\u0002\u0010\r\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u00042\u0008\u0008\u0002\u00106\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u0004H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\u00087\u00108R\u001d\u0010:\u001a\u0002098\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u000c\n\u0004\u0008:\u0010;\u001a\u0004\u0008<\u0010=R\u001d\u0010>\u001a\u0002098\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u000c\n\u0004\u0008>\u0010;\u001a\u0004\u0008?\u0010=R&\u0010@\u001a\u0002098\u0006X\u0087\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0012\n\u0004\u0008@\u0010;\u0012\u0004\u0008B\u0010\u0003\u001a\u0004\u0008A\u0010=R\u001d\u0010C\u001a\u0002098\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u000c\n\u0004\u0008C\u0010;\u001a\u0004\u0008D\u0010=R\u0011\u0010H\u001a\u00020E8G\u00a2\u0006\u0006\u001a\u0004\u0008F\u0010GR\u0011\u0010J\u001a\u00020E8G\u00a2\u0006\u0006\u001a\u0004\u0008I\u0010GR\u0011\u0010L\u001a\u00020E8G\u00a2\u0006\u0006\u001a\u0004\u0008K\u0010GR\u0011\u0010P\u001a\u00020M8G\u00a2\u0006\u0006\u001a\u0004\u0008N\u0010O\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006Q"
    }
    d2 = {
        "Landroidx/compose/material3/SearchBarDefaults;",
        "",
        "<init>",
        "()V",
        "Landroidx/compose/ui/graphics/Color;",
        "containerColor",
        "dividerColor",
        "Landroidx/compose/material3/SearchBarColors;",
        "colors-dgg9oW8",
        "(JJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SearchBarColors;",
        "colors",
        "focusedTextColor",
        "unfocusedTextColor",
        "disabledTextColor",
        "cursorColor",
        "Landroidx/compose/foundation/text/selection/TextSelectionColors;",
        "selectionColors",
        "focusedLeadingIconColor",
        "unfocusedLeadingIconColor",
        "disabledLeadingIconColor",
        "focusedTrailingIconColor",
        "unfocusedTrailingIconColor",
        "disabledTrailingIconColor",
        "focusedPlaceholderColor",
        "unfocusedPlaceholderColor",
        "disabledPlaceholderColor",
        "Landroidx/compose/material3/TextFieldColors;",
        "inputFieldColors-ITpI4ow",
        "(JJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/TextFieldColors;",
        "inputFieldColors",
        "",
        "query",
        "Lkotlin/Function1;",
        "Ld6/s;",
        "onQueryChange",
        "onSearch",
        "",
        "expanded",
        "onExpandedChange",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "enabled",
        "Lkotlin/Function0;",
        "Landroidx/compose/runtime/Composable;",
        "placeholder",
        "leadingIcon",
        "trailingIcon",
        "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
        "interactionSource",
        "InputField",
        "(Ljava/lang/String;Lr6/c;Lr6/c;ZLr6/c;Landroidx/compose/ui/Modifier;ZLr6/e;Lr6/e;Lr6/e;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V",
        "colors-Klgx-Pg",
        "(JJLandroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SearchBarColors;",
        "textColor",
        "placeholderColor",
        "inputFieldColors--u-KgnY",
        "(JJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/TextFieldColors;",
        "Landroidx/compose/ui/unit/Dp;",
        "TonalElevation",
        "F",
        "getTonalElevation-D9Ej5fM",
        "()F",
        "ShadowElevation",
        "getShadowElevation-D9Ej5fM",
        "Elevation",
        "getElevation-D9Ej5fM",
        "getElevation-D9Ej5fM$annotations",
        "InputFieldHeight",
        "getInputFieldHeight-D9Ej5fM",
        "Landroidx/compose/ui/graphics/Shape;",
        "getInputFieldShape",
        "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;",
        "inputFieldShape",
        "getFullScreenShape",
        "fullScreenShape",
        "getDockedShape",
        "dockedShape",
        "Landroidx/compose/foundation/layout/WindowInsets;",
        "getWindowInsets",
        "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;",
        "windowInsets",
        "material3_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSearchBar.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBarDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 5 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,1243:1\n77#2:1244\n77#2:1257\n77#2:1260\n77#2:1275\n77#2:1288\n1223#3,6:1245\n1223#3,6:1251\n1223#3,6:1263\n1223#3,6:1269\n1223#3,6:1276\n1223#3,6:1282\n78#4:1258\n81#4:1259\n708#5:1261\n696#5:1262\n*S KotlinDebug\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBarDefaults\n*L\n418#1:1244\n501#1:1257\n507#1:1260\n535#1:1275\n606#1:1288\n497#1:1245,6\n500#1:1251,6\n522#1:1263,6\n523#1:1269,6\n538#1:1276,6\n567#1:1282,6\n503#1:1258\n504#1:1259\n507#1:1261\n507#1:1262\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I

.field private static final Elevation:F

.field public static final INSTANCE:Landroidx/compose/material3/SearchBarDefaults;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final InputFieldHeight:F

.field private static final ShadowElevation:F

.field private static final TonalElevation:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/material3/SearchBarDefaults;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/compose/material3/SearchBarDefaults;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/compose/material3/SearchBarDefaults;->INSTANCE:Landroidx/compose/material3/SearchBarDefaults;

    .line 7
    .line 8
    sget-object v0, Landroidx/compose/material3/tokens/ElevationTokens;->INSTANCE:Landroidx/compose/material3/tokens/ElevationTokens;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/ElevationTokens;->getLevel0-D9Ej5fM()F

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    sput v1, Landroidx/compose/material3/SearchBarDefaults;->TonalElevation:F

    .line 15
    .line 16
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/ElevationTokens;->getLevel0-D9Ej5fM()F

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    sput v0, Landroidx/compose/material3/SearchBarDefaults;->ShadowElevation:F

    .line 21
    .line 22
    sput v1, Landroidx/compose/material3/SearchBarDefaults;->Elevation:F

    .line 23
    .line 24
    sget-object v0, Landroidx/compose/material3/tokens/SearchBarTokens;->INSTANCE:Landroidx/compose/material3/tokens/SearchBarTokens;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroidx/compose/material3/tokens/SearchBarTokens;->getContainerHeight-D9Ej5fM()F

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    sput v0, Landroidx/compose/material3/SearchBarDefaults;->InputFieldHeight:F

    .line 31
    .line 32
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic getElevation-D9Ej5fM$annotations()V
    .locals 0
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->WARNING:Lkotlin/DeprecationLevel;
        message = "Renamed to TonalElevation. Not to be confused with ShadowElevation."
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "TonalElevation"
            imports = {}
        .end subannotation
    .end annotation

    return-void
.end method


# virtual methods
.method public final InputField(Ljava/lang/String;Lr6/c;Lr6/c;ZLr6/c;Landroidx/compose/ui/Modifier;ZLr6/e;Lr6/e;Lr6/e;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V
    .locals 82
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Landroidx/compose/ui/Modifier;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p8    # Lr6/e;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p9    # Lr6/e;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p10    # Lr6/e;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p11    # Landroidx/compose/material3/TextFieldColors;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p12    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p13    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lr6/c;",
            "Lr6/c;",
            "Z",
            "Lr6/c;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Lr6/e;",
            "Lr6/e;",
            "Lr6/e;",
            "Landroidx/compose/material3/TextFieldColors;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    move/from16 v2, p4

    .line 6
    .line 7
    move-object/from16 v3, p5

    .line 8
    .line 9
    move/from16 v4, p14

    .line 10
    .line 11
    move/from16 v5, p15

    .line 12
    .line 13
    move/from16 v6, p16

    .line 14
    .line 15
    const v7, 0x5682199f

    .line 16
    .line 17
    .line 18
    move-object/from16 v8, p13

    .line 19
    .line 20
    invoke-interface {v8, v7}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 21
    .line 22
    .line 23
    move-result-object v8

    .line 24
    and-int/lit8 v9, v6, 0x1

    .line 25
    .line 26
    if-eqz v9, :cond_0

    .line 27
    .line 28
    or-int/lit8 v9, v4, 0x6

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    and-int/lit8 v9, v4, 0x6

    .line 32
    .line 33
    if-nez v9, :cond_2

    .line 34
    .line 35
    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v9

    .line 39
    if-eqz v9, :cond_1

    .line 40
    .line 41
    const/4 v9, 0x4

    .line 42
    goto :goto_0

    .line 43
    :cond_1
    const/4 v9, 0x2

    .line 44
    :goto_0
    or-int/2addr v9, v4

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    move v9, v4

    .line 47
    :goto_1
    and-int/lit8 v12, v6, 0x2

    .line 48
    .line 49
    if-eqz v12, :cond_4

    .line 50
    .line 51
    or-int/lit8 v9, v9, 0x30

    .line 52
    .line 53
    :cond_3
    move-object/from16 v12, p2

    .line 54
    .line 55
    goto :goto_3

    .line 56
    :cond_4
    and-int/lit8 v12, v4, 0x30

    .line 57
    .line 58
    if-nez v12, :cond_3

    .line 59
    .line 60
    move-object/from16 v12, p2

    .line 61
    .line 62
    invoke-interface {v8, v12}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v15

    .line 66
    if-eqz v15, :cond_5

    .line 67
    .line 68
    const/16 v15, 0x20

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_5
    const/16 v15, 0x10

    .line 72
    .line 73
    :goto_2
    or-int/2addr v9, v15

    .line 74
    :goto_3
    and-int/lit8 v15, v6, 0x4

    .line 75
    .line 76
    const/16 v16, 0x80

    .line 77
    .line 78
    if-eqz v15, :cond_6

    .line 79
    .line 80
    or-int/lit16 v9, v9, 0x180

    .line 81
    .line 82
    goto :goto_5

    .line 83
    :cond_6
    and-int/lit16 v15, v4, 0x180

    .line 84
    .line 85
    if-nez v15, :cond_8

    .line 86
    .line 87
    invoke-interface {v8, v1}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v15

    .line 91
    if-eqz v15, :cond_7

    .line 92
    .line 93
    const/16 v15, 0x100

    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_7
    move/from16 v15, v16

    .line 97
    .line 98
    :goto_4
    or-int/2addr v9, v15

    .line 99
    :cond_8
    :goto_5
    and-int/lit8 v15, v6, 0x8

    .line 100
    .line 101
    if-eqz v15, :cond_9

    .line 102
    .line 103
    or-int/lit16 v9, v9, 0xc00

    .line 104
    .line 105
    goto :goto_7

    .line 106
    :cond_9
    and-int/lit16 v15, v4, 0xc00

    .line 107
    .line 108
    if-nez v15, :cond_b

    .line 109
    .line 110
    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 111
    .line 112
    .line 113
    move-result v15

    .line 114
    if-eqz v15, :cond_a

    .line 115
    .line 116
    const/16 v15, 0x800

    .line 117
    .line 118
    goto :goto_6

    .line 119
    :cond_a
    const/16 v15, 0x400

    .line 120
    .line 121
    :goto_6
    or-int/2addr v9, v15

    .line 122
    :cond_b
    :goto_7
    and-int/lit8 v15, v6, 0x10

    .line 123
    .line 124
    if-eqz v15, :cond_c

    .line 125
    .line 126
    or-int/lit16 v9, v9, 0x6000

    .line 127
    .line 128
    goto :goto_9

    .line 129
    :cond_c
    and-int/lit16 v15, v4, 0x6000

    .line 130
    .line 131
    if-nez v15, :cond_e

    .line 132
    .line 133
    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v15

    .line 137
    if-eqz v15, :cond_d

    .line 138
    .line 139
    const/16 v15, 0x4000

    .line 140
    .line 141
    goto :goto_8

    .line 142
    :cond_d
    const/16 v15, 0x2000

    .line 143
    .line 144
    :goto_8
    or-int/2addr v9, v15

    .line 145
    :cond_e
    :goto_9
    and-int/lit8 v15, v6, 0x20

    .line 146
    .line 147
    const/high16 v17, 0x30000

    .line 148
    .line 149
    if-eqz v15, :cond_f

    .line 150
    .line 151
    or-int v9, v9, v17

    .line 152
    .line 153
    move-object/from16 v10, p6

    .line 154
    .line 155
    goto :goto_b

    .line 156
    :cond_f
    and-int v17, v4, v17

    .line 157
    .line 158
    move-object/from16 v10, p6

    .line 159
    .line 160
    if-nez v17, :cond_11

    .line 161
    .line 162
    invoke-interface {v8, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v18

    .line 166
    if-eqz v18, :cond_10

    .line 167
    .line 168
    const/high16 v18, 0x20000

    .line 169
    .line 170
    goto :goto_a

    .line 171
    :cond_10
    const/high16 v18, 0x10000

    .line 172
    .line 173
    :goto_a
    or-int v9, v9, v18

    .line 174
    .line 175
    :cond_11
    :goto_b
    and-int/lit8 v18, v6, 0x40

    .line 176
    .line 177
    const/high16 v19, 0x180000

    .line 178
    .line 179
    if-eqz v18, :cond_12

    .line 180
    .line 181
    or-int v9, v9, v19

    .line 182
    .line 183
    move/from16 v11, p7

    .line 184
    .line 185
    goto :goto_d

    .line 186
    :cond_12
    and-int v19, v4, v19

    .line 187
    .line 188
    move/from16 v11, p7

    .line 189
    .line 190
    if-nez v19, :cond_14

    .line 191
    .line 192
    invoke-interface {v8, v11}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 193
    .line 194
    .line 195
    move-result v20

    .line 196
    if-eqz v20, :cond_13

    .line 197
    .line 198
    const/high16 v20, 0x100000

    .line 199
    .line 200
    goto :goto_c

    .line 201
    :cond_13
    const/high16 v20, 0x80000

    .line 202
    .line 203
    :goto_c
    or-int v9, v9, v20

    .line 204
    .line 205
    :cond_14
    :goto_d
    and-int/lit16 v13, v6, 0x80

    .line 206
    .line 207
    const/high16 v21, 0xc00000

    .line 208
    .line 209
    if-eqz v13, :cond_15

    .line 210
    .line 211
    or-int v9, v9, v21

    .line 212
    .line 213
    move-object/from16 v14, p8

    .line 214
    .line 215
    goto :goto_f

    .line 216
    :cond_15
    and-int v21, v4, v21

    .line 217
    .line 218
    move-object/from16 v14, p8

    .line 219
    .line 220
    if-nez v21, :cond_17

    .line 221
    .line 222
    invoke-interface {v8, v14}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v22

    .line 226
    if-eqz v22, :cond_16

    .line 227
    .line 228
    const/high16 v22, 0x800000

    .line 229
    .line 230
    goto :goto_e

    .line 231
    :cond_16
    const/high16 v22, 0x400000

    .line 232
    .line 233
    :goto_e
    or-int v9, v9, v22

    .line 234
    .line 235
    :cond_17
    :goto_f
    and-int/lit16 v7, v6, 0x100

    .line 236
    .line 237
    const/high16 v22, 0x6000000

    .line 238
    .line 239
    if-eqz v7, :cond_18

    .line 240
    .line 241
    or-int v9, v9, v22

    .line 242
    .line 243
    move-object/from16 v4, p9

    .line 244
    .line 245
    goto :goto_11

    .line 246
    :cond_18
    and-int v22, v4, v22

    .line 247
    .line 248
    move-object/from16 v4, p9

    .line 249
    .line 250
    if-nez v22, :cond_1a

    .line 251
    .line 252
    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result v22

    .line 256
    if-eqz v22, :cond_19

    .line 257
    .line 258
    const/high16 v22, 0x4000000

    .line 259
    .line 260
    goto :goto_10

    .line 261
    :cond_19
    const/high16 v22, 0x2000000

    .line 262
    .line 263
    :goto_10
    or-int v9, v9, v22

    .line 264
    .line 265
    :cond_1a
    :goto_11
    and-int/lit16 v4, v6, 0x200

    .line 266
    .line 267
    const/high16 v22, 0x30000000

    .line 268
    .line 269
    if-eqz v4, :cond_1c

    .line 270
    .line 271
    or-int v9, v9, v22

    .line 272
    .line 273
    :cond_1b
    move/from16 v22, v4

    .line 274
    .line 275
    move-object/from16 v4, p10

    .line 276
    .line 277
    goto :goto_13

    .line 278
    :cond_1c
    and-int v22, p14, v22

    .line 279
    .line 280
    if-nez v22, :cond_1b

    .line 281
    .line 282
    move/from16 v22, v4

    .line 283
    .line 284
    move-object/from16 v4, p10

    .line 285
    .line 286
    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result v23

    .line 290
    if-eqz v23, :cond_1d

    .line 291
    .line 292
    const/high16 v23, 0x20000000

    .line 293
    .line 294
    goto :goto_12

    .line 295
    :cond_1d
    const/high16 v23, 0x10000000

    .line 296
    .line 297
    :goto_12
    or-int v9, v9, v23

    .line 298
    .line 299
    :goto_13
    and-int/lit8 v23, v5, 0x6

    .line 300
    .line 301
    if-nez v23, :cond_20

    .line 302
    .line 303
    and-int/lit16 v4, v6, 0x400

    .line 304
    .line 305
    if-nez v4, :cond_1e

    .line 306
    .line 307
    move-object/from16 v4, p11

    .line 308
    .line 309
    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result v23

    .line 313
    if-eqz v23, :cond_1f

    .line 314
    .line 315
    const/16 v17, 0x4

    .line 316
    .line 317
    goto :goto_14

    .line 318
    :cond_1e
    move-object/from16 v4, p11

    .line 319
    .line 320
    :cond_1f
    const/16 v17, 0x2

    .line 321
    .line 322
    :goto_14
    or-int v17, v5, v17

    .line 323
    .line 324
    goto :goto_15

    .line 325
    :cond_20
    move-object/from16 v4, p11

    .line 326
    .line 327
    move/from16 v17, v5

    .line 328
    .line 329
    :goto_15
    move/from16 v23, v9

    .line 330
    .line 331
    and-int/lit16 v9, v6, 0x800

    .line 332
    .line 333
    if-eqz v9, :cond_21

    .line 334
    .line 335
    or-int/lit8 v17, v17, 0x30

    .line 336
    .line 337
    move/from16 v24, v9

    .line 338
    .line 339
    move/from16 v4, v17

    .line 340
    .line 341
    move-object/from16 v9, p12

    .line 342
    .line 343
    goto :goto_18

    .line 344
    :cond_21
    and-int/lit8 v24, v5, 0x30

    .line 345
    .line 346
    if-nez v24, :cond_23

    .line 347
    .line 348
    move/from16 v24, v9

    .line 349
    .line 350
    move-object/from16 v9, p12

    .line 351
    .line 352
    invoke-interface {v8, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    move-result v25

    .line 356
    if-eqz v25, :cond_22

    .line 357
    .line 358
    const/16 v20, 0x20

    .line 359
    .line 360
    goto :goto_16

    .line 361
    :cond_22
    const/16 v20, 0x10

    .line 362
    .line 363
    :goto_16
    or-int v17, v17, v20

    .line 364
    .line 365
    :goto_17
    move/from16 v4, v17

    .line 366
    .line 367
    goto :goto_18

    .line 368
    :cond_23
    move/from16 v24, v9

    .line 369
    .line 370
    move-object/from16 v9, p12

    .line 371
    .line 372
    goto :goto_17

    .line 373
    :goto_18
    move/from16 v17, v7

    .line 374
    .line 375
    and-int/lit16 v7, v6, 0x1000

    .line 376
    .line 377
    if-eqz v7, :cond_25

    .line 378
    .line 379
    or-int/lit16 v4, v4, 0x180

    .line 380
    .line 381
    :cond_24
    move-object/from16 v7, p0

    .line 382
    .line 383
    goto :goto_19

    .line 384
    :cond_25
    and-int/lit16 v7, v5, 0x180

    .line 385
    .line 386
    if-nez v7, :cond_24

    .line 387
    .line 388
    move-object/from16 v7, p0

    .line 389
    .line 390
    invoke-interface {v8, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 391
    .line 392
    .line 393
    move-result v20

    .line 394
    if-eqz v20, :cond_26

    .line 395
    .line 396
    const/16 v16, 0x100

    .line 397
    .line 398
    :cond_26
    or-int v4, v4, v16

    .line 399
    .line 400
    :goto_19
    const v16, 0x12492493

    .line 401
    .line 402
    .line 403
    and-int v5, v23, v16

    .line 404
    .line 405
    const v7, 0x12492492

    .line 406
    .line 407
    .line 408
    if-ne v5, v7, :cond_28

    .line 409
    .line 410
    and-int/lit16 v5, v4, 0x93

    .line 411
    .line 412
    const/16 v7, 0x92

    .line 413
    .line 414
    if-ne v5, v7, :cond_28

    .line 415
    .line 416
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 417
    .line 418
    .line 419
    move-result v5

    .line 420
    if-nez v5, :cond_27

    .line 421
    .line 422
    goto :goto_1a

    .line 423
    :cond_27
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 424
    .line 425
    .line 426
    move-object/from16 v12, p11

    .line 427
    .line 428
    move-object/from16 v16, v8

    .line 429
    .line 430
    move-object v13, v9

    .line 431
    move-object v7, v10

    .line 432
    move v8, v11

    .line 433
    move-object v9, v14

    .line 434
    move-object/from16 v10, p9

    .line 435
    .line 436
    move-object/from16 v11, p10

    .line 437
    .line 438
    goto/16 :goto_2c

    .line 439
    .line 440
    :cond_28
    :goto_1a
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 441
    .line 442
    .line 443
    and-int/lit8 v5, p14, 0x1

    .line 444
    .line 445
    const v7, 0xe000

    .line 446
    .line 447
    .line 448
    move/from16 v40, v4

    .line 449
    .line 450
    if-eqz v5, :cond_2b

    .line 451
    .line 452
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 453
    .line 454
    .line 455
    move-result v5

    .line 456
    if-eqz v5, :cond_29

    .line 457
    .line 458
    goto :goto_1c

    .line 459
    :cond_29
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 460
    .line 461
    .line 462
    and-int/lit16 v5, v6, 0x400

    .line 463
    .line 464
    if-eqz v5, :cond_2a

    .line 465
    .line 466
    and-int/lit8 v5, v40, -0xf

    .line 467
    .line 468
    move-object/from16 v20, v10

    .line 469
    .line 470
    move v10, v5

    .line 471
    move-object/from16 v5, v20

    .line 472
    .line 473
    move-object/from16 v44, p9

    .line 474
    .line 475
    move-object/from16 v45, p10

    .line 476
    .line 477
    move/from16 v46, v7

    .line 478
    .line 479
    move-object/from16 v20, v9

    .line 480
    .line 481
    move/from16 v7, v23

    .line 482
    .line 483
    :goto_1b
    move-object/from16 v9, p11

    .line 484
    .line 485
    goto/16 :goto_23

    .line 486
    .line 487
    :cond_2a
    move-object/from16 v44, p9

    .line 488
    .line 489
    move-object/from16 v45, p10

    .line 490
    .line 491
    move/from16 v46, v7

    .line 492
    .line 493
    move-object/from16 v20, v9

    .line 494
    .line 495
    move-object v5, v10

    .line 496
    move/from16 v7, v23

    .line 497
    .line 498
    move/from16 v10, v40

    .line 499
    .line 500
    goto :goto_1b

    .line 501
    :cond_2b
    :goto_1c
    if-eqz v15, :cond_2c

    .line 502
    .line 503
    sget-object v5, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 504
    .line 505
    goto :goto_1d

    .line 506
    :cond_2c
    move-object v5, v10

    .line 507
    :goto_1d
    if-eqz v18, :cond_2d

    .line 508
    .line 509
    const/16 v42, 0x1

    .line 510
    .line 511
    goto :goto_1e

    .line 512
    :cond_2d
    move/from16 v42, v11

    .line 513
    .line 514
    :goto_1e
    if-eqz v13, :cond_2e

    .line 515
    .line 516
    const/16 v43, 0x0

    .line 517
    .line 518
    goto :goto_1f

    .line 519
    :cond_2e
    move-object/from16 v43, v14

    .line 520
    .line 521
    :goto_1f
    if-eqz v17, :cond_2f

    .line 522
    .line 523
    const/16 v44, 0x0

    .line 524
    .line 525
    goto :goto_20

    .line 526
    :cond_2f
    move-object/from16 v44, p9

    .line 527
    .line 528
    :goto_20
    if-eqz v22, :cond_30

    .line 529
    .line 530
    const/16 v45, 0x0

    .line 531
    .line 532
    goto :goto_21

    .line 533
    :cond_30
    move-object/from16 v45, p10

    .line 534
    .line 535
    :goto_21
    and-int/lit16 v10, v6, 0x400

    .line 536
    .line 537
    if-eqz v10, :cond_31

    .line 538
    .line 539
    shl-int/lit8 v10, v40, 0x6

    .line 540
    .line 541
    and-int v38, v10, v7

    .line 542
    .line 543
    const/16 v39, 0x3fff

    .line 544
    .line 545
    const-wide/16 v9, 0x0

    .line 546
    .line 547
    const-wide/16 v11, 0x0

    .line 548
    .line 549
    const-wide/16 v13, 0x0

    .line 550
    .line 551
    const-wide/16 v15, 0x0

    .line 552
    .line 553
    const/16 v17, 0x0

    .line 554
    .line 555
    const/16 v20, 0x4

    .line 556
    .line 557
    const-wide/16 v18, 0x0

    .line 558
    .line 559
    move/from16 v22, v20

    .line 560
    .line 561
    const-wide/16 v20, 0x0

    .line 562
    .line 563
    move/from16 v26, v22

    .line 564
    .line 565
    move/from16 v25, v23

    .line 566
    .line 567
    const-wide/16 v22, 0x0

    .line 568
    .line 569
    move/from16 v28, v24

    .line 570
    .line 571
    move/from16 v27, v25

    .line 572
    .line 573
    const-wide/16 v24, 0x0

    .line 574
    .line 575
    move/from16 v30, v26

    .line 576
    .line 577
    move/from16 v29, v27

    .line 578
    .line 579
    const-wide/16 v26, 0x0

    .line 580
    .line 581
    move/from16 v32, v28

    .line 582
    .line 583
    move/from16 v31, v29

    .line 584
    .line 585
    const-wide/16 v28, 0x0

    .line 586
    .line 587
    move/from16 v34, v30

    .line 588
    .line 589
    move/from16 v33, v31

    .line 590
    .line 591
    const-wide/16 v30, 0x0

    .line 592
    .line 593
    move/from16 v36, v32

    .line 594
    .line 595
    move/from16 v35, v33

    .line 596
    .line 597
    const-wide/16 v32, 0x0

    .line 598
    .line 599
    move/from16 v46, v34

    .line 600
    .line 601
    move/from16 v37, v35

    .line 602
    .line 603
    const-wide/16 v34, 0x0

    .line 604
    .line 605
    move/from16 v47, v37

    .line 606
    .line 607
    const/16 v37, 0x0

    .line 608
    .line 609
    move/from16 v46, v7

    .line 610
    .line 611
    move/from16 v7, v47

    .line 612
    .line 613
    move/from16 v47, v36

    .line 614
    .line 615
    move-object/from16 v36, v8

    .line 616
    .line 617
    move-object/from16 v8, p0

    .line 618
    .line 619
    invoke-virtual/range {v8 .. v39}, Landroidx/compose/material3/SearchBarDefaults;->inputFieldColors-ITpI4ow(JJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/TextFieldColors;

    .line 620
    .line 621
    .line 622
    move-result-object v9

    .line 623
    move-object/from16 v8, v36

    .line 624
    .line 625
    and-int/lit8 v10, v40, -0xf

    .line 626
    .line 627
    goto :goto_22

    .line 628
    :cond_31
    move/from16 v46, v7

    .line 629
    .line 630
    move/from16 v7, v23

    .line 631
    .line 632
    move/from16 v47, v24

    .line 633
    .line 634
    move-object/from16 v9, p11

    .line 635
    .line 636
    move/from16 v10, v40

    .line 637
    .line 638
    :goto_22
    if-eqz v47, :cond_32

    .line 639
    .line 640
    move/from16 v11, v42

    .line 641
    .line 642
    move-object/from16 v14, v43

    .line 643
    .line 644
    const/16 v20, 0x0

    .line 645
    .line 646
    goto :goto_23

    .line 647
    :cond_32
    move-object/from16 v20, p12

    .line 648
    .line 649
    move/from16 v11, v42

    .line 650
    .line 651
    move-object/from16 v14, v43

    .line 652
    .line 653
    :goto_23
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 654
    .line 655
    .line 656
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 657
    .line 658
    .line 659
    move-result v12

    .line 660
    if-eqz v12, :cond_33

    .line 661
    .line 662
    const-string v12, "androidx.compose.material3.SearchBarDefaults.InputField (SearchBar.android.kt:494)"

    .line 663
    .line 664
    const v13, 0x5682199f

    .line 665
    .line 666
    .line 667
    invoke-static {v13, v7, v10, v12}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 668
    .line 669
    .line 670
    :cond_33
    const v10, -0x131994e0

    .line 671
    .line 672
    .line 673
    invoke-interface {v8, v10}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 674
    .line 675
    .line 676
    if-nez v20, :cond_35

    .line 677
    .line 678
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 679
    .line 680
    .line 681
    move-result-object v10

    .line 682
    sget-object v12, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 683
    .line 684
    invoke-virtual {v12}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 685
    .line 686
    .line 687
    move-result-object v12

    .line 688
    if-ne v10, v12, :cond_34

    .line 689
    .line 690
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 691
    .line 692
    .line 693
    move-result-object v10

    .line 694
    invoke-interface {v8, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 695
    .line 696
    .line 697
    :cond_34
    check-cast v10, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 698
    .line 699
    move-object v13, v10

    .line 700
    goto :goto_24

    .line 701
    :cond_35
    move-object/from16 v13, v20

    .line 702
    .line 703
    :goto_24
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 704
    .line 705
    .line 706
    const/4 v10, 0x0

    .line 707
    invoke-static {v13, v8, v10}, Landroidx/compose/foundation/interaction/FocusInteractionKt;->collectIsFocusedAsState(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 708
    .line 709
    .line 710
    move-result-object v12

    .line 711
    invoke-interface {v12}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 712
    .line 713
    .line 714
    move-result-object v12

    .line 715
    check-cast v12, Ljava/lang/Boolean;

    .line 716
    .line 717
    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    .line 718
    .line 719
    .line 720
    move-result v12

    .line 721
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 722
    .line 723
    .line 724
    move-result-object v15

    .line 725
    sget-object v21, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 726
    .line 727
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 728
    .line 729
    .line 730
    move-result-object v4

    .line 731
    if-ne v15, v4, :cond_36

    .line 732
    .line 733
    new-instance v15, Landroidx/compose/ui/focus/FocusRequester;

    .line 734
    .line 735
    invoke-direct {v15}, Landroidx/compose/ui/focus/FocusRequester;-><init>()V

    .line 736
    .line 737
    .line 738
    invoke-interface {v8, v15}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 739
    .line 740
    .line 741
    :cond_36
    check-cast v15, Landroidx/compose/ui/focus/FocusRequester;

    .line 742
    .line 743
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalFocusManager()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 744
    .line 745
    .line 746
    move-result-object v4

    .line 747
    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 748
    .line 749
    .line 750
    move-result-object v4

    .line 751
    check-cast v4, Landroidx/compose/ui/focus/FocusManager;

    .line 752
    .line 753
    sget-object v17, Landroidx/compose/material3/internal/Strings;->Companion:Landroidx/compose/material3/internal/Strings$Companion;

    .line 754
    .line 755
    sget v17, Landroidx/compose/material3/R$string;->m3c_search_bar_search:I

    .line 756
    .line 757
    move-object/from16 v18, v4

    .line 758
    .line 759
    invoke-static/range {v17 .. v17}, Landroidx/compose/material3/internal/Strings;->constructor-impl(I)I

    .line 760
    .line 761
    .line 762
    move-result v4

    .line 763
    invoke-static {v4, v8, v10}, Landroidx/compose/material3/internal/Strings_androidKt;->getString-2EP1pXo(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 764
    .line 765
    .line 766
    move-result-object v4

    .line 767
    sget v17, Landroidx/compose/material3/R$string;->m3c_suggestions_available:I

    .line 768
    .line 769
    move-object/from16 p6, v5

    .line 770
    .line 771
    invoke-static/range {v17 .. v17}, Landroidx/compose/material3/internal/Strings;->constructor-impl(I)I

    .line 772
    .line 773
    .line 774
    move-result v5

    .line 775
    invoke-static {v5, v8, v10}, Landroidx/compose/material3/internal/Strings_androidKt;->getString-2EP1pXo(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    .line 776
    .line 777
    .line 778
    move-result-object v5

    .line 779
    invoke-static {}, Landroidx/compose/material3/TextKt;->getLocalTextStyle()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 780
    .line 781
    .line 782
    move-result-object v10

    .line 783
    invoke-interface {v8, v10}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 784
    .line 785
    .line 786
    move-result-object v10

    .line 787
    check-cast v10, Landroidx/compose/ui/text/TextStyle;

    .line 788
    .line 789
    invoke-virtual {v10}, Landroidx/compose/ui/text/TextStyle;->getColor-0d7_KjU()J

    .line 790
    .line 791
    .line 792
    move-result-wide v22

    .line 793
    const-wide/16 v24, 0x10

    .line 794
    .line 795
    cmp-long v10, v22, v24

    .line 796
    .line 797
    if-eqz v10, :cond_37

    .line 798
    .line 799
    :goto_25
    move-wide/from16 v49, v22

    .line 800
    .line 801
    goto :goto_26

    .line 802
    :cond_37
    const/4 v10, 0x0

    .line 803
    invoke-virtual {v9, v11, v10, v12}, Landroidx/compose/material3/TextFieldColors;->textColor-XeAY9LY$material3_release(ZZZ)J

    .line 804
    .line 805
    .line 806
    move-result-wide v22

    .line 807
    goto :goto_25

    .line 808
    :goto_26
    invoke-static {}, Landroidx/compose/material3/SearchBar_androidKt;->getSearchBarMinWidth()F

    .line 809
    .line 810
    .line 811
    move-result v10

    .line 812
    invoke-static {}, Landroidx/compose/material3/SearchBar_androidKt;->access$getSearchBarMaxWidth$p()F

    .line 813
    .line 814
    .line 815
    move-result v19

    .line 816
    sget v22, Landroidx/compose/material3/SearchBarDefaults;->InputFieldHeight:F

    .line 817
    .line 818
    const/16 v23, 0x8

    .line 819
    .line 820
    const/16 v24, 0x0

    .line 821
    .line 822
    const/16 v25, 0x0

    .line 823
    .line 824
    move/from16 p7, v10

    .line 825
    .line 826
    move/from16 p9, v19

    .line 827
    .line 828
    move/from16 p8, v22

    .line 829
    .line 830
    move/from16 p11, v23

    .line 831
    .line 832
    move-object/from16 p12, v24

    .line 833
    .line 834
    move/from16 p10, v25

    .line 835
    .line 836
    invoke-static/range {p6 .. p12}, Landroidx/compose/foundation/layout/SizeKt;->sizeIn-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 837
    .line 838
    .line 839
    move-result-object v10

    .line 840
    move-object/from16 v22, p6

    .line 841
    .line 842
    invoke-static {v10, v15}, Landroidx/compose/ui/focus/FocusRequesterModifierKt;->focusRequester(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/focus/FocusRequester;)Landroidx/compose/ui/Modifier;

    .line 843
    .line 844
    .line 845
    move-result-object v10

    .line 846
    and-int v6, v7, v46

    .line 847
    .line 848
    move/from16 p8, v11

    .line 849
    .line 850
    const/16 v11, 0x4000

    .line 851
    .line 852
    if-ne v6, v11, :cond_38

    .line 853
    .line 854
    const/4 v6, 0x1

    .line 855
    goto :goto_27

    .line 856
    :cond_38
    const/4 v6, 0x0

    .line 857
    :goto_27
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 858
    .line 859
    .line 860
    move-result-object v11

    .line 861
    if-nez v6, :cond_39

    .line 862
    .line 863
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 864
    .line 865
    .line 866
    move-result-object v6

    .line 867
    if-ne v11, v6, :cond_3a

    .line 868
    .line 869
    :cond_39
    new-instance v11, Landroidx/compose/material3/SearchBarDefaults$InputField$1$1;

    .line 870
    .line 871
    invoke-direct {v11, v3}, Landroidx/compose/material3/SearchBarDefaults$InputField$1$1;-><init>(Lr6/c;)V

    .line 872
    .line 873
    .line 874
    invoke-interface {v8, v11}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 875
    .line 876
    .line 877
    :cond_3a
    check-cast v11, Lr6/c;

    .line 878
    .line 879
    invoke-static {v10, v11}, Landroidx/compose/ui/focus/FocusChangedModifierKt;->onFocusChanged(Landroidx/compose/ui/Modifier;Lr6/c;)Landroidx/compose/ui/Modifier;

    .line 880
    .line 881
    .line 882
    move-result-object v6

    .line 883
    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 884
    .line 885
    .line 886
    move-result v10

    .line 887
    and-int/lit16 v11, v7, 0x1c00

    .line 888
    .line 889
    const/16 v3, 0x800

    .line 890
    .line 891
    if-ne v11, v3, :cond_3b

    .line 892
    .line 893
    const/4 v3, 0x1

    .line 894
    goto :goto_28

    .line 895
    :cond_3b
    const/4 v3, 0x0

    .line 896
    :goto_28
    or-int/2addr v3, v10

    .line 897
    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 898
    .line 899
    .line 900
    move-result v10

    .line 901
    or-int/2addr v3, v10

    .line 902
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 903
    .line 904
    .line 905
    move-result-object v10

    .line 906
    if-nez v3, :cond_3c

    .line 907
    .line 908
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 909
    .line 910
    .line 911
    move-result-object v3

    .line 912
    if-ne v10, v3, :cond_3d

    .line 913
    .line 914
    :cond_3c
    new-instance v10, Landroidx/compose/material3/SearchBarDefaults$InputField$2$1;

    .line 915
    .line 916
    invoke-direct {v10, v4, v2, v5, v15}, Landroidx/compose/material3/SearchBarDefaults$InputField$2$1;-><init>(Ljava/lang/String;ZLjava/lang/String;Landroidx/compose/ui/focus/FocusRequester;)V

    .line 917
    .line 918
    .line 919
    invoke-interface {v8, v10}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 920
    .line 921
    .line 922
    :cond_3d
    check-cast v10, Lr6/c;

    .line 923
    .line 924
    const/4 v3, 0x0

    .line 925
    const/4 v4, 0x0

    .line 926
    const/4 v5, 0x1

    .line 927
    invoke-static {v6, v4, v10, v5, v3}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->semantics$default(Landroidx/compose/ui/Modifier;ZLr6/c;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 928
    .line 929
    .line 930
    move-result-object v6

    .line 931
    invoke-static {}, Landroidx/compose/material3/TextKt;->getLocalTextStyle()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 932
    .line 933
    .line 934
    move-result-object v3

    .line 935
    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 936
    .line 937
    .line 938
    move-result-object v3

    .line 939
    check-cast v3, Landroidx/compose/ui/text/TextStyle;

    .line 940
    .line 941
    new-instance v48, Landroidx/compose/ui/text/TextStyle;

    .line 942
    .line 943
    const v78, 0xfffffe

    .line 944
    .line 945
    .line 946
    const/16 v79, 0x0

    .line 947
    .line 948
    const-wide/16 v51, 0x0

    .line 949
    .line 950
    const/16 v53, 0x0

    .line 951
    .line 952
    const/16 v54, 0x0

    .line 953
    .line 954
    const/16 v55, 0x0

    .line 955
    .line 956
    const/16 v56, 0x0

    .line 957
    .line 958
    const/16 v57, 0x0

    .line 959
    .line 960
    const-wide/16 v58, 0x0

    .line 961
    .line 962
    const/16 v60, 0x0

    .line 963
    .line 964
    const/16 v61, 0x0

    .line 965
    .line 966
    const/16 v62, 0x0

    .line 967
    .line 968
    const-wide/16 v63, 0x0

    .line 969
    .line 970
    const/16 v65, 0x0

    .line 971
    .line 972
    const/16 v66, 0x0

    .line 973
    .line 974
    const/16 v67, 0x0

    .line 975
    .line 976
    const/16 v68, 0x0

    .line 977
    .line 978
    const/16 v69, 0x0

    .line 979
    .line 980
    const-wide/16 v70, 0x0

    .line 981
    .line 982
    const/16 v72, 0x0

    .line 983
    .line 984
    const/16 v73, 0x0

    .line 985
    .line 986
    const/16 v74, 0x0

    .line 987
    .line 988
    const/16 v75, 0x0

    .line 989
    .line 990
    const/16 v76, 0x0

    .line 991
    .line 992
    const/16 v77, 0x0

    .line 993
    .line 994
    invoke-direct/range {v48 .. v79}, Landroidx/compose/ui/text/TextStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILkotlin/jvm/internal/e;)V

    .line 995
    .line 996
    .line 997
    move-object/from16 v4, v48

    .line 998
    .line 999
    invoke-virtual {v3, v4}, Landroidx/compose/ui/text/TextStyle;->merge(Landroidx/compose/ui/text/TextStyle;)Landroidx/compose/ui/text/TextStyle;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v5

    .line 1003
    move-object/from16 v43, v14

    .line 1004
    .line 1005
    new-instance v14, Landroidx/compose/ui/graphics/SolidColor;

    .line 1006
    .line 1007
    const/4 v4, 0x0

    .line 1008
    invoke-virtual {v9, v4}, Landroidx/compose/material3/TextFieldColors;->cursorColor-vNxB06k$material3_release(Z)J

    .line 1009
    .line 1010
    .line 1011
    move-result-wide v10

    .line 1012
    const/4 v3, 0x0

    .line 1013
    invoke-direct {v14, v10, v11, v3}, Landroidx/compose/ui/graphics/SolidColor;-><init>(JLkotlin/jvm/internal/e;)V

    .line 1014
    .line 1015
    .line 1016
    new-instance v23, Landroidx/compose/foundation/text/KeyboardOptions;

    .line 1017
    .line 1018
    sget-object v10, Landroidx/compose/ui/text/input/ImeAction;->Companion:Landroidx/compose/ui/text/input/ImeAction$Companion;

    .line 1019
    .line 1020
    invoke-virtual {v10}, Landroidx/compose/ui/text/input/ImeAction$Companion;->getSearch-eUduSuo()I

    .line 1021
    .line 1022
    .line 1023
    move-result v27

    .line 1024
    const/16 v31, 0x77

    .line 1025
    .line 1026
    const/16 v32, 0x0

    .line 1027
    .line 1028
    const/16 v24, 0x0

    .line 1029
    .line 1030
    const/16 v25, 0x0

    .line 1031
    .line 1032
    const/16 v26, 0x0

    .line 1033
    .line 1034
    const/16 v28, 0x0

    .line 1035
    .line 1036
    const/16 v29, 0x0

    .line 1037
    .line 1038
    const/16 v30, 0x0

    .line 1039
    .line 1040
    invoke-direct/range {v23 .. v32}, Landroidx/compose/foundation/text/KeyboardOptions;-><init>(ILjava/lang/Boolean;IILandroidx/compose/ui/text/input/PlatformImeOptions;Ljava/lang/Boolean;Landroidx/compose/ui/text/intl/LocaleList;ILkotlin/jvm/internal/e;)V

    .line 1041
    .line 1042
    .line 1043
    and-int/lit16 v10, v7, 0x380

    .line 1044
    .line 1045
    const/16 v11, 0x100

    .line 1046
    .line 1047
    if-ne v10, v11, :cond_3e

    .line 1048
    .line 1049
    const/4 v10, 0x1

    .line 1050
    goto :goto_29

    .line 1051
    :cond_3e
    move v10, v4

    .line 1052
    :goto_29
    and-int/lit8 v11, v7, 0xe

    .line 1053
    .line 1054
    const/4 v15, 0x4

    .line 1055
    if-ne v11, v15, :cond_3f

    .line 1056
    .line 1057
    const/4 v15, 0x1

    .line 1058
    goto :goto_2a

    .line 1059
    :cond_3f
    move v15, v4

    .line 1060
    :goto_2a
    or-int/2addr v10, v15

    .line 1061
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v15

    .line 1065
    if-nez v10, :cond_40

    .line 1066
    .line 1067
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v10

    .line 1071
    if-ne v15, v10, :cond_41

    .line 1072
    .line 1073
    :cond_40
    new-instance v15, Landroidx/compose/material3/SearchBarDefaults$InputField$3$1;

    .line 1074
    .line 1075
    invoke-direct {v15, v1, v0}, Landroidx/compose/material3/SearchBarDefaults$InputField$3$1;-><init>(Lr6/c;Ljava/lang/String;)V

    .line 1076
    .line 1077
    .line 1078
    invoke-interface {v8, v15}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1079
    .line 1080
    .line 1081
    :cond_41
    move-object/from16 v29, v15

    .line 1082
    .line 1083
    check-cast v29, Lr6/c;

    .line 1084
    .line 1085
    new-instance v24, Landroidx/compose/foundation/text/KeyboardActions;

    .line 1086
    .line 1087
    const/16 v25, 0x0

    .line 1088
    .line 1089
    const/16 v26, 0x0

    .line 1090
    .line 1091
    const/16 v27, 0x0

    .line 1092
    .line 1093
    const/16 v28, 0x0

    .line 1094
    .line 1095
    const/16 v30, 0x0

    .line 1096
    .line 1097
    const/16 v31, 0x2f

    .line 1098
    .line 1099
    const/16 v32, 0x0

    .line 1100
    .line 1101
    invoke-direct/range {v24 .. v32}, Landroidx/compose/foundation/text/KeyboardActions;-><init>(Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;ILkotlin/jvm/internal/e;)V

    .line 1102
    .line 1103
    .line 1104
    new-instance v10, Landroidx/compose/material3/SearchBarDefaults$InputField$4;

    .line 1105
    .line 1106
    move-object/from16 p7, v0

    .line 1107
    .line 1108
    move-object/from16 p13, v9

    .line 1109
    .line 1110
    move-object/from16 p6, v10

    .line 1111
    .line 1112
    move-object/from16 p9, v13

    .line 1113
    .line 1114
    move-object/from16 p10, v43

    .line 1115
    .line 1116
    move-object/from16 p11, v44

    .line 1117
    .line 1118
    move-object/from16 p12, v45

    .line 1119
    .line 1120
    invoke-direct/range {p6 .. p13}, Landroidx/compose/material3/SearchBarDefaults$InputField$4;-><init>(Ljava/lang/String;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Lr6/e;Lr6/e;Lr6/e;Landroidx/compose/material3/TextFieldColors;)V

    .line 1121
    .line 1122
    .line 1123
    move-object/from16 v0, p6

    .line 1124
    .line 1125
    move-object/from16 v25, p13

    .line 1126
    .line 1127
    move-object/from16 v41, v3

    .line 1128
    .line 1129
    move/from16 v3, p8

    .line 1130
    .line 1131
    const/16 v9, 0x36

    .line 1132
    .line 1133
    const v10, -0x78f45657

    .line 1134
    .line 1135
    .line 1136
    const/4 v15, 0x1

    .line 1137
    invoke-static {v10, v15, v0, v8, v9}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v0

    .line 1141
    const/high16 v9, 0x6180000

    .line 1142
    .line 1143
    or-int/2addr v9, v11

    .line 1144
    and-int/lit8 v10, v7, 0x70

    .line 1145
    .line 1146
    or-int/2addr v9, v10

    .line 1147
    shr-int/lit8 v7, v7, 0x9

    .line 1148
    .line 1149
    and-int/lit16 v10, v7, 0x1c00

    .line 1150
    .line 1151
    or-int v17, v9, v10

    .line 1152
    .line 1153
    move-object/from16 v9, v18

    .line 1154
    .line 1155
    const/high16 v18, 0x30000

    .line 1156
    .line 1157
    const/16 v19, 0x1e10

    .line 1158
    .line 1159
    move v10, v4

    .line 1160
    const/4 v4, 0x0

    .line 1161
    move-object/from16 v16, v8

    .line 1162
    .line 1163
    const/4 v8, 0x1

    .line 1164
    move-object v11, v9

    .line 1165
    const/4 v9, 0x0

    .line 1166
    move/from16 v26, v10

    .line 1167
    .line 1168
    const/4 v10, 0x0

    .line 1169
    move-object/from16 v27, v11

    .line 1170
    .line 1171
    const/4 v11, 0x0

    .line 1172
    move/from16 v28, v12

    .line 1173
    .line 1174
    const/4 v12, 0x0

    .line 1175
    move-object/from16 v1, v24

    .line 1176
    .line 1177
    move/from16 v24, v7

    .line 1178
    .line 1179
    move-object v7, v1

    .line 1180
    move-object/from16 v1, p2

    .line 1181
    .line 1182
    move-object v2, v6

    .line 1183
    move-object/from16 v6, v23

    .line 1184
    .line 1185
    move-object/from16 v80, v27

    .line 1186
    .line 1187
    move/from16 v23, v15

    .line 1188
    .line 1189
    move-object v15, v0

    .line 1190
    move-object/from16 v0, p1

    .line 1191
    .line 1192
    invoke-static/range {v0 .. v19}, Landroidx/compose/foundation/text/BasicTextFieldKt;->BasicTextField(Ljava/lang/String;Lr6/c;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lr6/c;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lr6/f;Landroidx/compose/runtime/Composer;III)V

    .line 1193
    .line 1194
    .line 1195
    move-object/from16 v8, v16

    .line 1196
    .line 1197
    if-nez p4, :cond_42

    .line 1198
    .line 1199
    if-eqz v28, :cond_42

    .line 1200
    .line 1201
    move/from16 v4, v23

    .line 1202
    .line 1203
    goto :goto_2b

    .line 1204
    :cond_42
    move/from16 v4, v26

    .line 1205
    .line 1206
    :goto_2b
    invoke-static/range {p4 .. p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v0

    .line 1210
    invoke-interface {v8, v4}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 1211
    .line 1212
    .line 1213
    move-result v1

    .line 1214
    move-object/from16 v9, v80

    .line 1215
    .line 1216
    invoke-interface {v8, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 1217
    .line 1218
    .line 1219
    move-result v2

    .line 1220
    or-int/2addr v1, v2

    .line 1221
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v2

    .line 1225
    if-nez v1, :cond_43

    .line 1226
    .line 1227
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 1228
    .line 1229
    .line 1230
    move-result-object v1

    .line 1231
    if-ne v2, v1, :cond_44

    .line 1232
    .line 1233
    :cond_43
    new-instance v2, Landroidx/compose/material3/SearchBarDefaults$InputField$5$1;

    .line 1234
    .line 1235
    const/4 v1, 0x0

    .line 1236
    invoke-direct {v2, v4, v9, v1}, Landroidx/compose/material3/SearchBarDefaults$InputField$5$1;-><init>(ZLandroidx/compose/ui/focus/FocusManager;Lh6/c;)V

    .line 1237
    .line 1238
    .line 1239
    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 1240
    .line 1241
    .line 1242
    :cond_44
    check-cast v2, Lr6/e;

    .line 1243
    .line 1244
    and-int/lit8 v1, v24, 0xe

    .line 1245
    .line 1246
    invoke-static {v0, v2, v8, v1}, Landroidx/compose/runtime/EffectsKt;->LaunchedEffect(Ljava/lang/Object;Lr6/e;Landroidx/compose/runtime/Composer;I)V

    .line 1247
    .line 1248
    .line 1249
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 1250
    .line 1251
    .line 1252
    move-result v0

    .line 1253
    if-eqz v0, :cond_45

    .line 1254
    .line 1255
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 1256
    .line 1257
    .line 1258
    :cond_45
    move-object/from16 v16, v8

    .line 1259
    .line 1260
    move-object/from16 v13, v20

    .line 1261
    .line 1262
    move-object/from16 v7, v22

    .line 1263
    .line 1264
    move-object/from16 v12, v25

    .line 1265
    .line 1266
    move-object/from16 v9, v43

    .line 1267
    .line 1268
    move-object/from16 v10, v44

    .line 1269
    .line 1270
    move-object/from16 v11, v45

    .line 1271
    .line 1272
    move v8, v3

    .line 1273
    :goto_2c
    invoke-interface/range {v16 .. v16}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 1274
    .line 1275
    .line 1276
    move-result-object v0

    .line 1277
    if-eqz v0, :cond_46

    .line 1278
    .line 1279
    move-object v1, v0

    .line 1280
    new-instance v0, Landroidx/compose/material3/SearchBarDefaults$InputField$6;

    .line 1281
    .line 1282
    move-object/from16 v2, p1

    .line 1283
    .line 1284
    move-object/from16 v3, p2

    .line 1285
    .line 1286
    move-object/from16 v4, p3

    .line 1287
    .line 1288
    move/from16 v5, p4

    .line 1289
    .line 1290
    move-object/from16 v6, p5

    .line 1291
    .line 1292
    move/from16 v14, p14

    .line 1293
    .line 1294
    move/from16 v15, p15

    .line 1295
    .line 1296
    move/from16 v16, p16

    .line 1297
    .line 1298
    move-object/from16 v81, v1

    .line 1299
    .line 1300
    move-object/from16 v1, p0

    .line 1301
    .line 1302
    invoke-direct/range {v0 .. v16}, Landroidx/compose/material3/SearchBarDefaults$InputField$6;-><init>(Landroidx/compose/material3/SearchBarDefaults;Ljava/lang/String;Lr6/c;Lr6/c;ZLr6/c;Landroidx/compose/ui/Modifier;ZLr6/e;Lr6/e;Lr6/e;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;III)V

    .line 1303
    .line 1304
    .line 1305
    move-object/from16 v1, v81

    .line 1306
    .line 1307
    invoke-interface {v1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 1308
    .line 1309
    .line 1310
    :cond_46
    return-void
.end method

.method public final colors-Klgx-Pg(JJLandroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SearchBarColors;
    .locals 37
    .param p5    # Landroidx/compose/material3/TextFieldColors;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation runtime Lkotlin/Deprecated;
        message = "Search bars now take the input field as a parameter. `inputFieldColors` should be passed explicitly to the input field. This parameter will be removed in a future version of the library."
        replaceWith = .subannotation Lkotlin/ReplaceWith;
            expression = "colors(containerColor, dividerColor)"
            imports = {}
        .end subannotation
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    move-object/from16 v0, p6

    .line 2
    .line 3
    and-int/lit8 v1, p8, 0x1

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    sget-object v1, Landroidx/compose/material3/tokens/SearchBarTokens;->INSTANCE:Landroidx/compose/material3/tokens/SearchBarTokens;

    .line 9
    .line 10
    invoke-virtual {v1}, Landroidx/compose/material3/tokens/SearchBarTokens;->getContainerColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {v1, v0, v2}, Landroidx/compose/material3/ColorSchemeKt;->getValue(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    .line 15
    .line 16
    .line 17
    move-result-wide v3

    .line 18
    move-wide/from16 v33, v3

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-wide/from16 v33, p1

    .line 22
    .line 23
    :goto_0
    and-int/lit8 v1, p8, 0x2

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    sget-object v1, Landroidx/compose/material3/tokens/SearchViewTokens;->INSTANCE:Landroidx/compose/material3/tokens/SearchViewTokens;

    .line 28
    .line 29
    invoke-virtual {v1}, Landroidx/compose/material3/tokens/SearchViewTokens;->getDividerColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {v1, v0, v2}, Landroidx/compose/material3/ColorSchemeKt;->getValue(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    .line 34
    .line 35
    .line 36
    move-result-wide v1

    .line 37
    move-wide/from16 v35, v1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move-wide/from16 v35, p3

    .line 41
    .line 42
    :goto_1
    and-int/lit8 v1, p8, 0x4

    .line 43
    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    shl-int/lit8 v1, p7, 0x3

    .line 47
    .line 48
    const v2, 0xe000

    .line 49
    .line 50
    .line 51
    and-int v31, v1, v2

    .line 52
    .line 53
    const/16 v32, 0x3fff

    .line 54
    .line 55
    const-wide/16 v2, 0x0

    .line 56
    .line 57
    const-wide/16 v4, 0x0

    .line 58
    .line 59
    const-wide/16 v6, 0x0

    .line 60
    .line 61
    const-wide/16 v8, 0x0

    .line 62
    .line 63
    const/4 v10, 0x0

    .line 64
    const-wide/16 v11, 0x0

    .line 65
    .line 66
    const-wide/16 v13, 0x0

    .line 67
    .line 68
    const-wide/16 v15, 0x0

    .line 69
    .line 70
    const-wide/16 v17, 0x0

    .line 71
    .line 72
    const-wide/16 v19, 0x0

    .line 73
    .line 74
    const-wide/16 v21, 0x0

    .line 75
    .line 76
    const-wide/16 v23, 0x0

    .line 77
    .line 78
    const-wide/16 v25, 0x0

    .line 79
    .line 80
    const-wide/16 v27, 0x0

    .line 81
    .line 82
    const/16 v30, 0x0

    .line 83
    .line 84
    move-object/from16 v1, p0

    .line 85
    .line 86
    move-object/from16 v29, v0

    .line 87
    .line 88
    move/from16 v0, p7

    .line 89
    .line 90
    invoke-virtual/range {v1 .. v32}, Landroidx/compose/material3/SearchBarDefaults;->inputFieldColors-ITpI4ow(JJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/TextFieldColors;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    goto :goto_2

    .line 95
    :cond_2
    move/from16 v0, p7

    .line 96
    .line 97
    move-object/from16 v2, p5

    .line 98
    .line 99
    :goto_2
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-eqz v1, :cond_3

    .line 104
    .line 105
    const/4 v1, -0x1

    .line 106
    const-string v3, "androidx.compose.material3.SearchBarDefaults.colors (SearchBar.android.kt:590)"

    .line 107
    .line 108
    const v4, -0x487d4104

    .line 109
    .line 110
    .line 111
    invoke-static {v4, v0, v1, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 112
    .line 113
    .line 114
    :cond_3
    new-instance v0, Landroidx/compose/material3/SearchBarColors;

    .line 115
    .line 116
    const/4 v1, 0x0

    .line 117
    move-object/from16 p1, v0

    .line 118
    .line 119
    move-object/from16 p7, v1

    .line 120
    .line 121
    move-object/from16 p6, v2

    .line 122
    .line 123
    move-wide/from16 p2, v33

    .line 124
    .line 125
    move-wide/from16 p4, v35

    .line 126
    .line 127
    invoke-direct/range {p1 .. p7}, Landroidx/compose/material3/SearchBarColors;-><init>(JJLandroidx/compose/material3/TextFieldColors;Lkotlin/jvm/internal/e;)V

    .line 128
    .line 129
    .line 130
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    if-eqz v1, :cond_4

    .line 135
    .line 136
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 137
    .line 138
    .line 139
    :cond_4
    return-object v0
.end method

.method public final colors-dgg9oW8(JJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SearchBarColors;
    .locals 38
    .param p5    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    move-object/from16 v0, p5

    .line 2
    .line 3
    move/from16 v1, p6

    .line 4
    .line 5
    and-int/lit8 v2, p7, 0x1

    .line 6
    .line 7
    const/4 v3, 0x6

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    sget-object v2, Landroidx/compose/material3/tokens/SearchBarTokens;->INSTANCE:Landroidx/compose/material3/tokens/SearchBarTokens;

    .line 11
    .line 12
    invoke-virtual {v2}, Landroidx/compose/material3/tokens/SearchBarTokens;->getContainerColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-static {v2, v0, v3}, Landroidx/compose/material3/ColorSchemeKt;->getValue(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    .line 17
    .line 18
    .line 19
    move-result-wide v4

    .line 20
    move-wide/from16 v33, v4

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-wide/from16 v33, p1

    .line 24
    .line 25
    :goto_0
    and-int/lit8 v2, p7, 0x2

    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    sget-object v2, Landroidx/compose/material3/tokens/SearchViewTokens;->INSTANCE:Landroidx/compose/material3/tokens/SearchViewTokens;

    .line 30
    .line 31
    invoke-virtual {v2}, Landroidx/compose/material3/tokens/SearchViewTokens;->getDividerColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-static {v2, v0, v3}, Landroidx/compose/material3/ColorSchemeKt;->getValue(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    .line 36
    .line 37
    .line 38
    move-result-wide v4

    .line 39
    move-wide/from16 v35, v4

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move-wide/from16 v35, p3

    .line 43
    .line 44
    :goto_1
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    const/4 v2, -0x1

    .line 51
    const-string v4, "androidx.compose.material3.SearchBarDefaults.colors (SearchBar.android.kt:378)"

    .line 52
    .line 53
    const v5, -0x59d39153

    .line 54
    .line 55
    .line 56
    invoke-static {v5, v1, v2, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    :cond_2
    new-instance v37, Landroidx/compose/material3/SearchBarColors;

    .line 60
    .line 61
    const v2, 0xe000

    .line 62
    .line 63
    .line 64
    shl-int/2addr v1, v3

    .line 65
    and-int v31, v1, v2

    .line 66
    .line 67
    const/16 v32, 0x3fff

    .line 68
    .line 69
    const-wide/16 v2, 0x0

    .line 70
    .line 71
    const-wide/16 v4, 0x0

    .line 72
    .line 73
    const-wide/16 v6, 0x0

    .line 74
    .line 75
    const-wide/16 v8, 0x0

    .line 76
    .line 77
    const/4 v10, 0x0

    .line 78
    const-wide/16 v11, 0x0

    .line 79
    .line 80
    const-wide/16 v13, 0x0

    .line 81
    .line 82
    const-wide/16 v15, 0x0

    .line 83
    .line 84
    const-wide/16 v17, 0x0

    .line 85
    .line 86
    const-wide/16 v19, 0x0

    .line 87
    .line 88
    const-wide/16 v21, 0x0

    .line 89
    .line 90
    const-wide/16 v23, 0x0

    .line 91
    .line 92
    const-wide/16 v25, 0x0

    .line 93
    .line 94
    const-wide/16 v27, 0x0

    .line 95
    .line 96
    const/16 v30, 0x0

    .line 97
    .line 98
    move-object/from16 v1, p0

    .line 99
    .line 100
    move-object/from16 v29, v0

    .line 101
    .line 102
    invoke-virtual/range {v1 .. v32}, Landroidx/compose/material3/SearchBarDefaults;->inputFieldColors-ITpI4ow(JJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/TextFieldColors;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    const/4 v1, 0x0

    .line 107
    move-object/from16 p6, v0

    .line 108
    .line 109
    move-object/from16 p7, v1

    .line 110
    .line 111
    move-wide/from16 p2, v33

    .line 112
    .line 113
    move-wide/from16 p4, v35

    .line 114
    .line 115
    move-object/from16 p1, v37

    .line 116
    .line 117
    invoke-direct/range {p1 .. p7}, Landroidx/compose/material3/SearchBarColors;-><init>(JJLandroidx/compose/material3/TextFieldColors;Lkotlin/jvm/internal/e;)V

    .line 118
    .line 119
    .line 120
    move-object/from16 v0, p1

    .line 121
    .line 122
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    if-eqz v1, :cond_3

    .line 127
    .line 128
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 129
    .line 130
    .line 131
    :cond_3
    return-object v0
.end method

.method public final getDockedShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;
    .locals 3
    .param p1    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Lkotlin/jvm/JvmName;
        name = "getDockedShape"
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    const-string v1, "androidx.compose.material3.SearchBarDefaults.<get-dockedShape> (SearchBar.android.kt:357)"

    .line 9
    .line 10
    const v2, 0x3c04ded6

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    sget-object p2, Landroidx/compose/material3/tokens/SearchViewTokens;->INSTANCE:Landroidx/compose/material3/tokens/SearchViewTokens;

    .line 17
    .line 18
    invoke-virtual {p2}, Landroidx/compose/material3/tokens/SearchViewTokens;->getDockedContainerShape()Landroidx/compose/material3/tokens/ShapeKeyTokens;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    const/4 v0, 0x6

    .line 23
    invoke-static {p2, p1, v0}, Landroidx/compose/material3/ShapesKt;->getValue(Landroidx/compose/material3/tokens/ShapeKeyTokens;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-eqz p2, :cond_1

    .line 32
    .line 33
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 34
    .line 35
    .line 36
    :cond_1
    return-object p1
.end method

.method public final getElevation-D9Ej5fM()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/SearchBarDefaults;->Elevation:F

    .line 2
    .line 3
    return v0
.end method

.method public final getFullScreenShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;
    .locals 3
    .param p1    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Lkotlin/jvm/JvmName;
        name = "getFullScreenShape"
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    const-string v1, "androidx.compose.material3.SearchBarDefaults.<get-fullScreenShape> (SearchBar.android.kt:353)"

    .line 9
    .line 10
    const v2, 0x63458b68

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    sget-object p2, Landroidx/compose/material3/tokens/SearchViewTokens;->INSTANCE:Landroidx/compose/material3/tokens/SearchViewTokens;

    .line 17
    .line 18
    invoke-virtual {p2}, Landroidx/compose/material3/tokens/SearchViewTokens;->getFullScreenContainerShape()Landroidx/compose/material3/tokens/ShapeKeyTokens;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    const/4 v0, 0x6

    .line 23
    invoke-static {p2, p1, v0}, Landroidx/compose/material3/ShapesKt;->getValue(Landroidx/compose/material3/tokens/ShapeKeyTokens;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-eqz p2, :cond_1

    .line 32
    .line 33
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 34
    .line 35
    .line 36
    :cond_1
    return-object p1
.end method

.method public final getInputFieldHeight-D9Ej5fM()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/SearchBarDefaults;->InputFieldHeight:F

    .line 2
    .line 3
    return v0
.end method

.method public final getInputFieldShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;
    .locals 3
    .param p1    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Lkotlin/jvm/JvmName;
        name = "getInputFieldShape"
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    const-string v1, "androidx.compose.material3.SearchBarDefaults.<get-inputFieldShape> (SearchBar.android.kt:349)"

    .line 9
    .line 10
    const v2, -0x39e8c52e

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    sget-object p2, Landroidx/compose/material3/tokens/SearchBarTokens;->INSTANCE:Landroidx/compose/material3/tokens/SearchBarTokens;

    .line 17
    .line 18
    invoke-virtual {p2}, Landroidx/compose/material3/tokens/SearchBarTokens;->getContainerShape()Landroidx/compose/material3/tokens/ShapeKeyTokens;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    const/4 v0, 0x6

    .line 23
    invoke-static {p2, p1, v0}, Landroidx/compose/material3/ShapesKt;->getValue(Landroidx/compose/material3/tokens/ShapeKeyTokens;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-eqz p2, :cond_1

    .line 32
    .line 33
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 34
    .line 35
    .line 36
    :cond_1
    return-object p1
.end method

.method public final getShadowElevation-D9Ej5fM()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/SearchBarDefaults;->ShadowElevation:F

    .line 2
    .line 3
    return v0
.end method

.method public final getTonalElevation-D9Ej5fM()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/SearchBarDefaults;->TonalElevation:F

    .line 2
    .line 3
    return v0
.end method

.method public final getWindowInsets(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;
    .locals 3
    .param p1    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Lkotlin/jvm/JvmName;
        name = "getWindowInsets"
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    const-string v1, "androidx.compose.material3.SearchBarDefaults.<get-windowInsets> (SearchBar.android.kt:361)"

    .line 9
    .line 10
    const v2, 0x7de6af4d

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    sget-object p2, Landroidx/compose/foundation/layout/WindowInsets;->Companion:Landroidx/compose/foundation/layout/WindowInsets$Companion;

    .line 17
    .line 18
    const/4 v0, 0x6

    .line 19
    invoke-static {p2, p1, v0}, Landroidx/compose/foundation/layout/WindowInsets_androidKt;->getStatusBars(Landroidx/compose/foundation/layout/WindowInsets$Companion;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    if-eqz p2, :cond_1

    .line 28
    .line 29
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 30
    .line 31
    .line 32
    :cond_1
    return-object p1
.end method

.method public final synthetic inputFieldColors--u-KgnY(JJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/TextFieldColors;
    .locals 33
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
        message = "Maintained for binary compatibility"
    .end annotation

    .line 1
    move-object/from16 v0, p24

    .line 2
    .line 3
    move/from16 v1, p25

    .line 4
    .line 5
    move/from16 v2, p26

    .line 6
    .line 7
    move/from16 v3, p27

    .line 8
    .line 9
    and-int/lit8 v4, v3, 0x1

    .line 10
    .line 11
    const/4 v5, 0x6

    .line 12
    if-eqz v4, :cond_0

    .line 13
    .line 14
    sget-object v4, Landroidx/compose/material3/tokens/SearchBarTokens;->INSTANCE:Landroidx/compose/material3/tokens/SearchBarTokens;

    .line 15
    .line 16
    invoke-virtual {v4}, Landroidx/compose/material3/tokens/SearchBarTokens;->getInputTextColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-static {v4, v0, v5}, Landroidx/compose/material3/ColorSchemeKt;->getValue(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    .line 21
    .line 22
    .line 23
    move-result-wide v6

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-wide/from16 v6, p1

    .line 26
    .line 27
    :goto_0
    and-int/lit8 v4, v3, 0x2

    .line 28
    .line 29
    if-eqz v4, :cond_1

    .line 30
    .line 31
    sget-object v4, Landroidx/compose/material3/tokens/FilledTextFieldTokens;->INSTANCE:Landroidx/compose/material3/tokens/FilledTextFieldTokens;

    .line 32
    .line 33
    invoke-virtual {v4}, Landroidx/compose/material3/tokens/FilledTextFieldTokens;->getDisabledInputColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    .line 34
    .line 35
    .line 36
    move-result-object v8

    .line 37
    invoke-static {v8, v0, v5}, Landroidx/compose/material3/ColorSchemeKt;->getValue(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    .line 38
    .line 39
    .line 40
    move-result-wide v9

    .line 41
    invoke-virtual {v4}, Landroidx/compose/material3/tokens/FilledTextFieldTokens;->getDisabledInputOpacity()F

    .line 42
    .line 43
    .line 44
    move-result v11

    .line 45
    const/16 v15, 0xe

    .line 46
    .line 47
    const/16 v16, 0x0

    .line 48
    .line 49
    const/4 v12, 0x0

    .line 50
    const/4 v13, 0x0

    .line 51
    const/4 v14, 0x0

    .line 52
    invoke-static/range {v9 .. v16}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    .line 53
    .line 54
    .line 55
    move-result-wide v8

    .line 56
    goto :goto_1

    .line 57
    :cond_1
    move-wide/from16 v8, p3

    .line 58
    .line 59
    :goto_1
    and-int/lit8 v4, v3, 0x4

    .line 60
    .line 61
    if-eqz v4, :cond_2

    .line 62
    .line 63
    sget-object v4, Landroidx/compose/material3/tokens/FilledTextFieldTokens;->INSTANCE:Landroidx/compose/material3/tokens/FilledTextFieldTokens;

    .line 64
    .line 65
    invoke-virtual {v4}, Landroidx/compose/material3/tokens/FilledTextFieldTokens;->getCaretColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-static {v4, v0, v5}, Landroidx/compose/material3/ColorSchemeKt;->getValue(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    .line 70
    .line 71
    .line 72
    move-result-wide v10

    .line 73
    goto :goto_2

    .line 74
    :cond_2
    move-wide/from16 v10, p5

    .line 75
    .line 76
    :goto_2
    and-int/lit8 v4, v3, 0x8

    .line 77
    .line 78
    if-eqz v4, :cond_3

    .line 79
    .line 80
    invoke-static {}, Landroidx/compose/foundation/text/selection/TextSelectionColorsKt;->getLocalTextSelectionColors()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    invoke-interface {v0, v4}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    check-cast v4, Landroidx/compose/foundation/text/selection/TextSelectionColors;

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_3
    move-object/from16 v4, p7

    .line 92
    .line 93
    :goto_3
    and-int/lit8 v12, v3, 0x10

    .line 94
    .line 95
    if-eqz v12, :cond_4

    .line 96
    .line 97
    sget-object v12, Landroidx/compose/material3/tokens/SearchBarTokens;->INSTANCE:Landroidx/compose/material3/tokens/SearchBarTokens;

    .line 98
    .line 99
    invoke-virtual {v12}, Landroidx/compose/material3/tokens/SearchBarTokens;->getLeadingIconColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    .line 100
    .line 101
    .line 102
    move-result-object v12

    .line 103
    invoke-static {v12, v0, v5}, Landroidx/compose/material3/ColorSchemeKt;->getValue(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    .line 104
    .line 105
    .line 106
    move-result-wide v12

    .line 107
    goto :goto_4

    .line 108
    :cond_4
    move-wide/from16 v12, p8

    .line 109
    .line 110
    :goto_4
    and-int/lit8 v14, v3, 0x20

    .line 111
    .line 112
    if-eqz v14, :cond_5

    .line 113
    .line 114
    sget-object v14, Landroidx/compose/material3/tokens/SearchBarTokens;->INSTANCE:Landroidx/compose/material3/tokens/SearchBarTokens;

    .line 115
    .line 116
    invoke-virtual {v14}, Landroidx/compose/material3/tokens/SearchBarTokens;->getLeadingIconColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    .line 117
    .line 118
    .line 119
    move-result-object v14

    .line 120
    invoke-static {v14, v0, v5}, Landroidx/compose/material3/ColorSchemeKt;->getValue(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    .line 121
    .line 122
    .line 123
    move-result-wide v14

    .line 124
    goto :goto_5

    .line 125
    :cond_5
    move-wide/from16 v14, p10

    .line 126
    .line 127
    :goto_5
    and-int/lit8 v16, v3, 0x40

    .line 128
    .line 129
    if-eqz v16, :cond_6

    .line 130
    .line 131
    sget-object v16, Landroidx/compose/material3/tokens/FilledTextFieldTokens;->INSTANCE:Landroidx/compose/material3/tokens/FilledTextFieldTokens;

    .line 132
    .line 133
    move-object/from16 p1, v4

    .line 134
    .line 135
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/material3/tokens/FilledTextFieldTokens;->getDisabledLeadingIconColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    invoke-static {v4, v0, v5}, Landroidx/compose/material3/ColorSchemeKt;->getValue(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    .line 140
    .line 141
    .line 142
    move-result-wide v17

    .line 143
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/material3/tokens/FilledTextFieldTokens;->getDisabledLeadingIconOpacity()F

    .line 144
    .line 145
    .line 146
    move-result v4

    .line 147
    const/16 v16, 0xe

    .line 148
    .line 149
    const/16 v19, 0x0

    .line 150
    .line 151
    const/16 v20, 0x0

    .line 152
    .line 153
    const/16 v21, 0x0

    .line 154
    .line 155
    const/16 v22, 0x0

    .line 156
    .line 157
    move/from16 p4, v4

    .line 158
    .line 159
    move/from16 p8, v16

    .line 160
    .line 161
    move-wide/from16 p2, v17

    .line 162
    .line 163
    move-object/from16 p9, v19

    .line 164
    .line 165
    move/from16 p5, v20

    .line 166
    .line 167
    move/from16 p6, v21

    .line 168
    .line 169
    move/from16 p7, v22

    .line 170
    .line 171
    invoke-static/range {p2 .. p9}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    .line 172
    .line 173
    .line 174
    move-result-wide v16

    .line 175
    goto :goto_6

    .line 176
    :cond_6
    move-object/from16 p1, v4

    .line 177
    .line 178
    move-wide/from16 v16, p12

    .line 179
    .line 180
    :goto_6
    and-int/lit16 v4, v3, 0x80

    .line 181
    .line 182
    if-eqz v4, :cond_7

    .line 183
    .line 184
    sget-object v4, Landroidx/compose/material3/tokens/SearchBarTokens;->INSTANCE:Landroidx/compose/material3/tokens/SearchBarTokens;

    .line 185
    .line 186
    invoke-virtual {v4}, Landroidx/compose/material3/tokens/SearchBarTokens;->getTrailingIconColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    invoke-static {v4, v0, v5}, Landroidx/compose/material3/ColorSchemeKt;->getValue(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    .line 191
    .line 192
    .line 193
    move-result-wide v18

    .line 194
    goto :goto_7

    .line 195
    :cond_7
    move-wide/from16 v18, p14

    .line 196
    .line 197
    :goto_7
    and-int/lit16 v4, v3, 0x100

    .line 198
    .line 199
    if-eqz v4, :cond_8

    .line 200
    .line 201
    sget-object v4, Landroidx/compose/material3/tokens/SearchBarTokens;->INSTANCE:Landroidx/compose/material3/tokens/SearchBarTokens;

    .line 202
    .line 203
    invoke-virtual {v4}, Landroidx/compose/material3/tokens/SearchBarTokens;->getTrailingIconColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    .line 204
    .line 205
    .line 206
    move-result-object v4

    .line 207
    invoke-static {v4, v0, v5}, Landroidx/compose/material3/ColorSchemeKt;->getValue(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    .line 208
    .line 209
    .line 210
    move-result-wide v20

    .line 211
    goto :goto_8

    .line 212
    :cond_8
    move-wide/from16 v20, p16

    .line 213
    .line 214
    :goto_8
    and-int/lit16 v4, v3, 0x200

    .line 215
    .line 216
    if-eqz v4, :cond_9

    .line 217
    .line 218
    sget-object v4, Landroidx/compose/material3/tokens/FilledTextFieldTokens;->INSTANCE:Landroidx/compose/material3/tokens/FilledTextFieldTokens;

    .line 219
    .line 220
    move-object/from16 p2, v4

    .line 221
    .line 222
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/material3/tokens/FilledTextFieldTokens;->getDisabledTrailingIconColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    .line 223
    .line 224
    .line 225
    move-result-object v4

    .line 226
    invoke-static {v4, v0, v5}, Landroidx/compose/material3/ColorSchemeKt;->getValue(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    .line 227
    .line 228
    .line 229
    move-result-wide v22

    .line 230
    invoke-virtual/range {p2 .. p2}, Landroidx/compose/material3/tokens/FilledTextFieldTokens;->getDisabledTrailingIconOpacity()F

    .line 231
    .line 232
    .line 233
    move-result v4

    .line 234
    const/16 v24, 0xe

    .line 235
    .line 236
    const/16 v25, 0x0

    .line 237
    .line 238
    const/16 v26, 0x0

    .line 239
    .line 240
    const/16 v27, 0x0

    .line 241
    .line 242
    const/16 v28, 0x0

    .line 243
    .line 244
    move/from16 p5, v4

    .line 245
    .line 246
    move-wide/from16 p3, v22

    .line 247
    .line 248
    move/from16 p9, v24

    .line 249
    .line 250
    move-object/from16 p10, v25

    .line 251
    .line 252
    move/from16 p6, v26

    .line 253
    .line 254
    move/from16 p7, v27

    .line 255
    .line 256
    move/from16 p8, v28

    .line 257
    .line 258
    invoke-static/range {p3 .. p10}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    .line 259
    .line 260
    .line 261
    move-result-wide v22

    .line 262
    goto :goto_9

    .line 263
    :cond_9
    move-wide/from16 v22, p18

    .line 264
    .line 265
    :goto_9
    and-int/lit16 v4, v3, 0x400

    .line 266
    .line 267
    if-eqz v4, :cond_a

    .line 268
    .line 269
    sget-object v4, Landroidx/compose/material3/tokens/SearchBarTokens;->INSTANCE:Landroidx/compose/material3/tokens/SearchBarTokens;

    .line 270
    .line 271
    invoke-virtual {v4}, Landroidx/compose/material3/tokens/SearchBarTokens;->getSupportingTextColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    .line 272
    .line 273
    .line 274
    move-result-object v4

    .line 275
    invoke-static {v4, v0, v5}, Landroidx/compose/material3/ColorSchemeKt;->getValue(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    .line 276
    .line 277
    .line 278
    move-result-wide v24

    .line 279
    goto :goto_a

    .line 280
    :cond_a
    move-wide/from16 v24, p20

    .line 281
    .line 282
    :goto_a
    and-int/lit16 v3, v3, 0x800

    .line 283
    .line 284
    if-eqz v3, :cond_b

    .line 285
    .line 286
    sget-object v3, Landroidx/compose/material3/tokens/FilledTextFieldTokens;->INSTANCE:Landroidx/compose/material3/tokens/FilledTextFieldTokens;

    .line 287
    .line 288
    invoke-virtual {v3}, Landroidx/compose/material3/tokens/FilledTextFieldTokens;->getDisabledInputColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    .line 289
    .line 290
    .line 291
    move-result-object v4

    .line 292
    invoke-static {v4, v0, v5}, Landroidx/compose/material3/ColorSchemeKt;->getValue(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    .line 293
    .line 294
    .line 295
    move-result-wide v26

    .line 296
    invoke-virtual {v3}, Landroidx/compose/material3/tokens/FilledTextFieldTokens;->getDisabledInputOpacity()F

    .line 297
    .line 298
    .line 299
    move-result v3

    .line 300
    const/16 v4, 0xe

    .line 301
    .line 302
    const/16 v28, 0x0

    .line 303
    .line 304
    const/16 v29, 0x0

    .line 305
    .line 306
    const/16 v30, 0x0

    .line 307
    .line 308
    const/16 v31, 0x0

    .line 309
    .line 310
    move/from16 p4, v3

    .line 311
    .line 312
    move/from16 p8, v4

    .line 313
    .line 314
    move-wide/from16 p2, v26

    .line 315
    .line 316
    move-object/from16 p9, v28

    .line 317
    .line 318
    move/from16 p5, v29

    .line 319
    .line 320
    move/from16 p6, v30

    .line 321
    .line 322
    move/from16 p7, v31

    .line 323
    .line 324
    invoke-static/range {p2 .. p9}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    .line 325
    .line 326
    .line 327
    move-result-wide v3

    .line 328
    move-wide/from16 v27, v3

    .line 329
    .line 330
    goto :goto_b

    .line 331
    :cond_b
    move-wide/from16 v27, p22

    .line 332
    .line 333
    :goto_b
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 334
    .line 335
    .line 336
    move-result v3

    .line 337
    if-eqz v3, :cond_c

    .line 338
    .line 339
    const v3, 0x15370409

    .line 340
    .line 341
    .line 342
    const-string v4, "androidx.compose.material3.SearchBarDefaults.inputFieldColors (SearchBar.android.kt:624)"

    .line 343
    .line 344
    invoke-static {v3, v1, v2, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 345
    .line 346
    .line 347
    :cond_c
    and-int/lit8 v3, v1, 0xe

    .line 348
    .line 349
    shl-int/lit8 v4, v1, 0x3

    .line 350
    .line 351
    and-int/lit8 v26, v4, 0x70

    .line 352
    .line 353
    or-int v3, v3, v26

    .line 354
    .line 355
    move/from16 v26, v5

    .line 356
    .line 357
    and-int/lit16 v5, v4, 0x380

    .line 358
    .line 359
    or-int/2addr v3, v5

    .line 360
    and-int/lit16 v5, v4, 0x1c00

    .line 361
    .line 362
    or-int/2addr v3, v5

    .line 363
    const v5, 0xe000

    .line 364
    .line 365
    .line 366
    and-int v29, v4, v5

    .line 367
    .line 368
    or-int v3, v3, v29

    .line 369
    .line 370
    const/high16 v29, 0x70000

    .line 371
    .line 372
    and-int v29, v4, v29

    .line 373
    .line 374
    or-int v3, v3, v29

    .line 375
    .line 376
    const/high16 v29, 0x380000

    .line 377
    .line 378
    and-int v29, v4, v29

    .line 379
    .line 380
    or-int v3, v3, v29

    .line 381
    .line 382
    const/high16 v29, 0x1c00000

    .line 383
    .line 384
    and-int v29, v4, v29

    .line 385
    .line 386
    or-int v3, v3, v29

    .line 387
    .line 388
    const/high16 v29, 0xe000000

    .line 389
    .line 390
    and-int v29, v4, v29

    .line 391
    .line 392
    or-int v3, v3, v29

    .line 393
    .line 394
    const/high16 v29, 0x70000000

    .line 395
    .line 396
    and-int v4, v4, v29

    .line 397
    .line 398
    or-int v30, v3, v4

    .line 399
    .line 400
    shr-int/lit8 v1, v1, 0x1b

    .line 401
    .line 402
    and-int/lit8 v1, v1, 0xe

    .line 403
    .line 404
    shl-int/lit8 v3, v2, 0x3

    .line 405
    .line 406
    and-int/lit8 v3, v3, 0x70

    .line 407
    .line 408
    or-int/2addr v1, v3

    .line 409
    shl-int/lit8 v2, v2, 0x6

    .line 410
    .line 411
    and-int/lit16 v3, v2, 0x380

    .line 412
    .line 413
    or-int/2addr v1, v3

    .line 414
    and-int/lit16 v3, v2, 0x1c00

    .line 415
    .line 416
    or-int/2addr v1, v3

    .line 417
    and-int/2addr v2, v5

    .line 418
    or-int v31, v1, v2

    .line 419
    .line 420
    const/16 v32, 0x0

    .line 421
    .line 422
    move-wide v4, v6

    .line 423
    move-wide v2, v6

    .line 424
    move-wide v6, v8

    .line 425
    move-wide v8, v10

    .line 426
    move-wide v11, v12

    .line 427
    move-wide v13, v14

    .line 428
    move-wide/from16 v15, v16

    .line 429
    .line 430
    move-wide/from16 v17, v18

    .line 431
    .line 432
    move-wide/from16 v19, v20

    .line 433
    .line 434
    move-wide/from16 v21, v22

    .line 435
    .line 436
    move-wide/from16 v23, v24

    .line 437
    .line 438
    move-wide/from16 v25, v23

    .line 439
    .line 440
    move-object/from16 v1, p0

    .line 441
    .line 442
    move-object/from16 v10, p1

    .line 443
    .line 444
    move-object/from16 v29, v0

    .line 445
    .line 446
    invoke-virtual/range {v1 .. v32}, Landroidx/compose/material3/SearchBarDefaults;->inputFieldColors-ITpI4ow(JJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/TextFieldColors;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 451
    .line 452
    .line 453
    move-result v1

    .line 454
    if-eqz v1, :cond_d

    .line 455
    .line 456
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 457
    .line 458
    .line 459
    :cond_d
    return-object v0
.end method

.method public final inputFieldColors-ITpI4ow(JJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/TextFieldColors;
    .locals 95
    .param p9    # Landroidx/compose/foundation/text/selection/TextSelectionColors;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p28    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p28

    move/from16 v1, p29

    move/from16 v2, p30

    move/from16 v3, p31

    and-int/lit8 v4, v3, 0x1

    const/4 v5, 0x6

    if-eqz v4, :cond_0

    .line 1
    sget-object v4, Landroidx/compose/material3/tokens/SearchBarTokens;->INSTANCE:Landroidx/compose/material3/tokens/SearchBarTokens;

    invoke-virtual {v4}, Landroidx/compose/material3/tokens/SearchBarTokens;->getInputTextColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    move-result-object v4

    invoke-static {v4, v0, v5}, Landroidx/compose/material3/ColorSchemeKt;->getValue(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    move-result-wide v6

    goto :goto_0

    :cond_0
    move-wide/from16 v6, p1

    :goto_0
    and-int/lit8 v4, v3, 0x2

    if-eqz v4, :cond_1

    .line 2
    sget-object v4, Landroidx/compose/material3/tokens/SearchBarTokens;->INSTANCE:Landroidx/compose/material3/tokens/SearchBarTokens;

    invoke-virtual {v4}, Landroidx/compose/material3/tokens/SearchBarTokens;->getInputTextColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    move-result-object v4

    invoke-static {v4, v0, v5}, Landroidx/compose/material3/ColorSchemeKt;->getValue(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    move-result-wide v8

    goto :goto_1

    :cond_1
    move-wide/from16 v8, p3

    :goto_1
    and-int/lit8 v4, v3, 0x4

    if-eqz v4, :cond_2

    .line 3
    sget-object v4, Landroidx/compose/material3/tokens/FilledTextFieldTokens;->INSTANCE:Landroidx/compose/material3/tokens/FilledTextFieldTokens;

    invoke-virtual {v4}, Landroidx/compose/material3/tokens/FilledTextFieldTokens;->getDisabledInputColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    move-result-object v10

    invoke-static {v10, v0, v5}, Landroidx/compose/material3/ColorSchemeKt;->getValue(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    move-result-wide v11

    .line 4
    invoke-virtual {v4}, Landroidx/compose/material3/tokens/FilledTextFieldTokens;->getDisabledInputOpacity()F

    move-result v13

    const/16 v17, 0xe

    const/16 v18, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    .line 5
    invoke-static/range {v11 .. v18}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v10

    goto :goto_2

    :cond_2
    move-wide/from16 v10, p5

    :goto_2
    and-int/lit8 v4, v3, 0x8

    if-eqz v4, :cond_3

    .line 6
    sget-object v4, Landroidx/compose/material3/tokens/FilledTextFieldTokens;->INSTANCE:Landroidx/compose/material3/tokens/FilledTextFieldTokens;

    invoke-virtual {v4}, Landroidx/compose/material3/tokens/FilledTextFieldTokens;->getCaretColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    move-result-object v4

    invoke-static {v4, v0, v5}, Landroidx/compose/material3/ColorSchemeKt;->getValue(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    move-result-wide v12

    move-wide/from16 v18, v12

    goto :goto_3

    :cond_3
    move-wide/from16 v18, p7

    :goto_3
    and-int/lit8 v4, v3, 0x10

    if-eqz v4, :cond_4

    .line 7
    invoke-static {}, Landroidx/compose/foundation/text/selection/TextSelectionColorsKt;->getLocalTextSelectionColors()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v4

    .line 8
    invoke-interface {v0, v4}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/compose/foundation/text/selection/TextSelectionColors;

    move-object/from16 v22, v4

    goto :goto_4

    :cond_4
    move-object/from16 v22, p9

    :goto_4
    and-int/lit8 v4, v3, 0x20

    if-eqz v4, :cond_5

    .line 9
    sget-object v4, Landroidx/compose/material3/tokens/SearchBarTokens;->INSTANCE:Landroidx/compose/material3/tokens/SearchBarTokens;

    invoke-virtual {v4}, Landroidx/compose/material3/tokens/SearchBarTokens;->getLeadingIconColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    move-result-object v4

    invoke-static {v4, v0, v5}, Landroidx/compose/material3/ColorSchemeKt;->getValue(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    move-result-wide v12

    move-wide/from16 v31, v12

    goto :goto_5

    :cond_5
    move-wide/from16 v31, p10

    :goto_5
    and-int/lit8 v4, v3, 0x40

    if-eqz v4, :cond_6

    .line 10
    sget-object v4, Landroidx/compose/material3/tokens/SearchBarTokens;->INSTANCE:Landroidx/compose/material3/tokens/SearchBarTokens;

    invoke-virtual {v4}, Landroidx/compose/material3/tokens/SearchBarTokens;->getLeadingIconColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    move-result-object v4

    invoke-static {v4, v0, v5}, Landroidx/compose/material3/ColorSchemeKt;->getValue(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    move-result-wide v12

    move-wide/from16 v33, v12

    goto :goto_6

    :cond_6
    move-wide/from16 v33, p12

    :goto_6
    and-int/lit16 v4, v3, 0x80

    if-eqz v4, :cond_7

    .line 11
    sget-object v4, Landroidx/compose/material3/tokens/FilledTextFieldTokens;->INSTANCE:Landroidx/compose/material3/tokens/FilledTextFieldTokens;

    invoke-virtual {v4}, Landroidx/compose/material3/tokens/FilledTextFieldTokens;->getDisabledLeadingIconColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    move-result-object v12

    invoke-static {v12, v0, v5}, Landroidx/compose/material3/ColorSchemeKt;->getValue(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    move-result-wide v12

    .line 12
    invoke-virtual {v4}, Landroidx/compose/material3/tokens/FilledTextFieldTokens;->getDisabledLeadingIconOpacity()F

    move-result v4

    const/16 v14, 0xe

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v20, 0x0

    move/from16 p3, v4

    move-wide/from16 p1, v12

    move/from16 p7, v14

    move-object/from16 p8, v15

    move/from16 p4, v16

    move/from16 p5, v17

    move/from16 p6, v20

    .line 13
    invoke-static/range {p1 .. p8}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v12

    move-wide/from16 v35, v12

    goto :goto_7

    :cond_7
    move-wide/from16 v35, p14

    :goto_7
    and-int/lit16 v4, v3, 0x100

    if-eqz v4, :cond_8

    .line 14
    sget-object v4, Landroidx/compose/material3/tokens/SearchBarTokens;->INSTANCE:Landroidx/compose/material3/tokens/SearchBarTokens;

    invoke-virtual {v4}, Landroidx/compose/material3/tokens/SearchBarTokens;->getTrailingIconColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    move-result-object v4

    invoke-static {v4, v0, v5}, Landroidx/compose/material3/ColorSchemeKt;->getValue(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    move-result-wide v12

    move-wide/from16 v39, v12

    goto :goto_8

    :cond_8
    move-wide/from16 v39, p16

    :goto_8
    and-int/lit16 v4, v3, 0x200

    if-eqz v4, :cond_9

    .line 15
    sget-object v4, Landroidx/compose/material3/tokens/SearchBarTokens;->INSTANCE:Landroidx/compose/material3/tokens/SearchBarTokens;

    invoke-virtual {v4}, Landroidx/compose/material3/tokens/SearchBarTokens;->getTrailingIconColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    move-result-object v4

    invoke-static {v4, v0, v5}, Landroidx/compose/material3/ColorSchemeKt;->getValue(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    move-result-wide v12

    move-wide/from16 v41, v12

    goto :goto_9

    :cond_9
    move-wide/from16 v41, p18

    :goto_9
    and-int/lit16 v4, v3, 0x400

    if-eqz v4, :cond_a

    .line 16
    sget-object v4, Landroidx/compose/material3/tokens/FilledTextFieldTokens;->INSTANCE:Landroidx/compose/material3/tokens/FilledTextFieldTokens;

    invoke-virtual {v4}, Landroidx/compose/material3/tokens/FilledTextFieldTokens;->getDisabledTrailingIconColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    move-result-object v12

    invoke-static {v12, v0, v5}, Landroidx/compose/material3/ColorSchemeKt;->getValue(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    move-result-wide v12

    .line 17
    invoke-virtual {v4}, Landroidx/compose/material3/tokens/FilledTextFieldTokens;->getDisabledTrailingIconOpacity()F

    move-result v4

    const/16 v14, 0xe

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v20, 0x0

    move/from16 p3, v4

    move-wide/from16 p1, v12

    move/from16 p7, v14

    move-object/from16 p8, v15

    move/from16 p4, v16

    move/from16 p5, v17

    move/from16 p6, v20

    .line 18
    invoke-static/range {p1 .. p8}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v12

    move-wide/from16 v43, v12

    goto :goto_a

    :cond_a
    move-wide/from16 v43, p20

    :goto_a
    and-int/lit16 v4, v3, 0x800

    if-eqz v4, :cond_b

    .line 19
    sget-object v4, Landroidx/compose/material3/tokens/SearchBarTokens;->INSTANCE:Landroidx/compose/material3/tokens/SearchBarTokens;

    invoke-virtual {v4}, Landroidx/compose/material3/tokens/SearchBarTokens;->getSupportingTextColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    move-result-object v4

    invoke-static {v4, v0, v5}, Landroidx/compose/material3/ColorSchemeKt;->getValue(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    move-result-wide v12

    move-wide/from16 v55, v12

    goto :goto_b

    :cond_b
    move-wide/from16 v55, p22

    :goto_b
    and-int/lit16 v4, v3, 0x1000

    if-eqz v4, :cond_c

    .line 20
    sget-object v4, Landroidx/compose/material3/tokens/SearchBarTokens;->INSTANCE:Landroidx/compose/material3/tokens/SearchBarTokens;

    invoke-virtual {v4}, Landroidx/compose/material3/tokens/SearchBarTokens;->getSupportingTextColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    move-result-object v4

    invoke-static {v4, v0, v5}, Landroidx/compose/material3/ColorSchemeKt;->getValue(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    move-result-wide v12

    move-wide/from16 v57, v12

    goto :goto_c

    :cond_c
    move-wide/from16 v57, p24

    :goto_c
    and-int/lit16 v3, v3, 0x2000

    if-eqz v3, :cond_d

    .line 21
    sget-object v3, Landroidx/compose/material3/tokens/FilledTextFieldTokens;->INSTANCE:Landroidx/compose/material3/tokens/FilledTextFieldTokens;

    invoke-virtual {v3}, Landroidx/compose/material3/tokens/FilledTextFieldTokens;->getDisabledInputColor()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;

    move-result-object v4

    invoke-static {v4, v0, v5}, Landroidx/compose/material3/ColorSchemeKt;->getValue(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J

    move-result-wide v4

    .line 22
    invoke-virtual {v3}, Landroidx/compose/material3/tokens/FilledTextFieldTokens;->getDisabledInputOpacity()F

    move-result v3

    const/16 v12, 0xe

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move/from16 p3, v3

    move-wide/from16 p1, v4

    move/from16 p7, v12

    move-object/from16 p8, v13

    move/from16 p4, v14

    move/from16 p5, v15

    move/from16 p6, v16

    .line 23
    invoke-static/range {p1 .. p8}, Landroidx/compose/ui/graphics/Color;->copy-wmQWz5c$default(JFFFFILjava/lang/Object;)J

    move-result-wide v3

    move-wide/from16 v59, v3

    goto :goto_d

    :cond_d
    move-wide/from16 v59, p26

    :goto_d
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_e

    const v3, -0x23e40fe5

    const-string v4, "androidx.compose.material3.SearchBarDefaults.inputFieldColors (SearchBar.android.kt:437)"

    .line 24
    invoke-static {v3, v1, v2, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_e
    sget-object v3, Landroidx/compose/material3/TextFieldDefaults;->INSTANCE:Landroidx/compose/material3/TextFieldDefaults;

    and-int/lit16 v4, v1, 0x3fe

    shl-int/lit8 v5, v1, 0xf

    const/high16 v12, 0xe000000

    and-int/2addr v5, v12

    or-int v88, v4, v5

    shr-int/lit8 v4, v1, 0xc

    and-int/lit8 v4, v4, 0xe

    const/high16 v5, 0x70000

    and-int/2addr v5, v1

    or-int/2addr v4, v5

    const/high16 v5, 0x380000

    and-int/2addr v5, v1

    or-int/2addr v4, v5

    const/high16 v5, 0x1c00000

    and-int v13, v1, v5

    or-int/2addr v4, v13

    shl-int/lit8 v13, v1, 0x3

    const/high16 v14, 0x70000000

    and-int/2addr v13, v14

    or-int v89, v4, v13

    shr-int/lit8 v1, v1, 0x1b

    and-int/lit8 v1, v1, 0xe

    shl-int/lit8 v4, v2, 0x3

    and-int/lit8 v4, v4, 0x70

    or-int/2addr v1, v4

    shl-int/lit8 v2, v2, 0x12

    and-int v4, v2, v5

    or-int/2addr v1, v4

    and-int v4, v2, v12

    or-int/2addr v1, v4

    and-int/2addr v2, v14

    or-int v90, v1, v2

    const v93, 0x47c47af8

    const/16 v94, 0xfff

    move-wide v4, v8

    const-wide/16 v8, 0x0

    move-object v1, v3

    move-wide v2, v6

    move-wide v6, v10

    const-wide/16 v10, 0x0

    const-wide/16 v12, 0x0

    const-wide/16 v14, 0x0

    const-wide/16 v16, 0x0

    const-wide/16 v20, 0x0

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const-wide/16 v27, 0x0

    const-wide/16 v29, 0x0

    const-wide/16 v37, 0x0

    const-wide/16 v45, 0x0

    const-wide/16 v47, 0x0

    const-wide/16 v49, 0x0

    const-wide/16 v51, 0x0

    const-wide/16 v53, 0x0

    const-wide/16 v61, 0x0

    const-wide/16 v63, 0x0

    const-wide/16 v65, 0x0

    const-wide/16 v67, 0x0

    const-wide/16 v69, 0x0

    const-wide/16 v71, 0x0

    const-wide/16 v73, 0x0

    const-wide/16 v75, 0x0

    const-wide/16 v77, 0x0

    const-wide/16 v79, 0x0

    const-wide/16 v81, 0x0

    const-wide/16 v83, 0x0

    const-wide/16 v85, 0x0

    const/16 v91, 0x0

    const/16 v92, 0xc00

    move-object/from16 v87, v0

    invoke-virtual/range {v1 .. v94}, Landroidx/compose/material3/TextFieldDefaults;->colors-0hiis_0(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIIII)Landroidx/compose/material3/TextFieldColors;

    move-result-object v0

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_f
    return-object v0
.end method
