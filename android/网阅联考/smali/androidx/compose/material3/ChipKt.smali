.class public final Landroidx/compose/material3/ChipKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0010\u001a\u00a6\u0001\u0010\u0007\u001a\u00020\u00082\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\n2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\u00080\n\u00a2\u0006\u0002\u0008\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0015\u0008\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0008\u0018\u00010\n\u00a2\u0006\u0002\u0008\u000c2\u0015\u0008\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0008\u0018\u00010\n\u00a2\u0006\u0002\u0008\u000c2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00142\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00162\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001cH\u0007\u00a2\u0006\u0002\u0010\u001d\u001a\u00bc\u0001\u0010\u001e\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u000e2\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\u00080\n\u00a2\u0006\u0002\u0008\u000c2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0013\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0008\u0018\u00010\n\u00a2\u0006\u0002\u0008\u000c2\u0013\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0008\u0018\u00010\n\u00a2\u0006\u0002\u0008\u000c2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0008\u0010\u0019\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001cH\u0003\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008&\u0010\'\u001a\u0097\u0001\u0010(\u001a\u00020\u00082\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\u00080\n\u00a2\u0006\u0002\u0008\u000c2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0013\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0008\u0018\u00010\n\u00a2\u0006\u0002\u0008\u000c2\u0013\u0010)\u001a\u000f\u0012\u0004\u0012\u00020\u0008\u0018\u00010\n\u00a2\u0006\u0002\u0008\u000c2\u0013\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0008\u0018\u00010\n\u00a2\u0006\u0002\u0008\u000c2\u0006\u0010*\u001a\u00020\"2\u0006\u0010+\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0001H\u0003\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008,\u0010-\u001a\u00a6\u0001\u0010.\u001a\u00020\u00082\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\n2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\u00080\n\u00a2\u0006\u0002\u0008\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0015\u0008\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0008\u0018\u00010\n\u00a2\u0006\u0002\u0008\u000c2\u0015\u0008\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0008\u0018\u00010\n\u00a2\u0006\u0002\u0008\u000c2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00142\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00162\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001cH\u0007\u00a2\u0006\u0002\u0010\u001d\u001a\u00ae\u0001\u0010/\u001a\u00020\u00082\u0006\u00100\u001a\u00020\u00102\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\n2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\u00080\n\u00a2\u0006\u0002\u0008\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0015\u0008\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0008\u0018\u00010\n\u00a2\u0006\u0002\u0008\u000c2\u0015\u0008\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0008\u0018\u00010\n\u00a2\u0006\u0002\u0008\u000c2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00142\u0008\u0008\u0002\u0010\u0015\u001a\u0002012\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u0001022\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u0001032\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001cH\u0007\u00a2\u0006\u0002\u00104\u001a\u008f\u0001\u00105\u001a\u00020\u00082\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\n2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\u00080\n\u00a2\u0006\u0002\u0008\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0015\u0008\u0002\u00106\u001a\u000f\u0012\u0004\u0012\u00020\u0008\u0018\u00010\n\u00a2\u0006\u0002\u0008\u000c2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00142\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00162\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001cH\u0007\u00a2\u0006\u0002\u00107\u001a\u00ae\u0001\u00108\u001a\u00020\u00082\u0006\u00100\u001a\u00020\u00102\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\n2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\u00080\n\u00a2\u0006\u0002\u0008\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0015\u0008\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0008\u0018\u00010\n\u00a2\u0006\u0002\u0008\u000c2\u0015\u0008\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0008\u0018\u00010\n\u00a2\u0006\u0002\u0008\u000c2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00142\u0008\u0008\u0002\u0010\u0015\u001a\u0002012\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u0001022\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u0001032\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001cH\u0007\u00a2\u0006\u0002\u00104\u001a\u00c5\u0001\u00109\u001a\u00020\u00082\u0006\u00100\u001a\u00020\u00102\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\n2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\u00080\n\u00a2\u0006\u0002\u0008\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0015\u0008\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0008\u0018\u00010\n\u00a2\u0006\u0002\u0008\u000c2\u0015\u0008\u0002\u0010)\u001a\u000f\u0012\u0004\u0012\u00020\u0008\u0018\u00010\n\u00a2\u0006\u0002\u0008\u000c2\u0015\u0008\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0008\u0018\u00010\n\u00a2\u0006\u0002\u0008\u000c2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00142\u0008\u0008\u0002\u0010\u0015\u001a\u0002012\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u0001022\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u0001032\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001cH\u0007\u00a2\u0006\u0002\u0010:\u001a\u00d1\u0001\u0010;\u001a\u00020\u00082\u0006\u00100\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\u00080\n\u00a2\u0006\u0002\u0008\u000c2\u0006\u0010\u001f\u001a\u00020 2\u0013\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0008\u0018\u00010\n\u00a2\u0006\u0002\u0008\u000c2\u0013\u0010)\u001a\u000f\u0012\u0004\u0012\u00020\u0008\u0018\u00010\n\u00a2\u0006\u0002\u0008\u000c2\u0013\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0008\u0018\u00010\n\u00a2\u0006\u0002\u0008\u000c2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u0002012\u0008\u0010\u0017\u001a\u0004\u0018\u0001022\u0008\u0010\u0019\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001cH\u0003\u00f8\u0001\u0001\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008<\u0010=\u001a\u008f\u0001\u0010>\u001a\u00020\u00082\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\n2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\u00080\n\u00a2\u0006\u0002\u0008\u000c2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0015\u0008\u0002\u00106\u001a\u000f\u0012\u0004\u0012\u00020\u0008\u0018\u00010\n\u00a2\u0006\u0002\u0008\u000c2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u00142\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00162\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001cH\u0007\u00a2\u0006\u0002\u00107\u001a&\u0010?\u001a\u00020\u00012\u0008\u0008\u0002\u0010@\u001a\u00020\u00102\u0008\u0008\u0002\u0010A\u001a\u00020\u00102\u0008\u0008\u0002\u0010B\u001a\u00020\u0010H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u0013\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0004\n\u0002\u0010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006C"
    }
    d2 = {
        "AssistChipPadding",
        "Landroidx/compose/foundation/layout/PaddingValues;",
        "FilterChipPadding",
        "HorizontalElementsPadding",
        "Landroidx/compose/ui/unit/Dp;",
        "F",
        "SuggestionChipPadding",
        "AssistChip",
        "",
        "onClick",
        "Lkotlin/Function0;",
        "label",
        "Landroidx/compose/runtime/Composable;",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "enabled",
        "",
        "leadingIcon",
        "trailingIcon",
        "shape",
        "Landroidx/compose/ui/graphics/Shape;",
        "colors",
        "Landroidx/compose/material3/ChipColors;",
        "elevation",
        "Landroidx/compose/material3/ChipElevation;",
        "border",
        "Landroidx/compose/material3/ChipBorder;",
        "interactionSource",
        "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
        "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/material3/ChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V",
        "Chip",
        "labelTextStyle",
        "Landroidx/compose/ui/text/TextStyle;",
        "labelColor",
        "Landroidx/compose/ui/graphics/Color;",
        "Landroidx/compose/foundation/BorderStroke;",
        "minHeight",
        "paddingValues",
        "Chip-nkUnTEs",
        "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V",
        "ChipContent",
        "avatar",
        "leadingIconColor",
        "trailingIconColor",
        "ChipContent-fe0OD_I",
        "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V",
        "ElevatedAssistChip",
        "ElevatedFilterChip",
        "selected",
        "Landroidx/compose/material3/SelectableChipColors;",
        "Landroidx/compose/material3/SelectableChipElevation;",
        "Landroidx/compose/material3/SelectableChipBorder;",
        "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/material3/SelectableChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V",
        "ElevatedSuggestionChip",
        "icon",
        "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/material3/ChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V",
        "FilterChip",
        "InputChip",
        "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/material3/SelectableChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V",
        "SelectableChip",
        "SelectableChip-u0RnIRE",
        "(ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V",
        "SuggestionChip",
        "inputChipPadding",
        "hasAvatar",
        "hasLeadingIcon",
        "hasTrailingIcon",
        "material3_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field private static final AssistChipPadding:Landroidx/compose/foundation/layout/PaddingValues;

.field private static final FilterChipPadding:Landroidx/compose/foundation/layout/PaddingValues;

.field private static final HorizontalElementsPadding:F

.field private static final SuggestionChipPadding:Landroidx/compose/foundation/layout/PaddingValues;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    int-to-float v0, v0

    .line 4
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    sput v0, Landroidx/compose/material3/ChipKt;->HorizontalElementsPadding:F

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x2

    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-static {v0, v1, v2, v3}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-YgX7TsA$default(FFILjava/lang/Object;)Landroidx/compose/foundation/layout/PaddingValues;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    sput-object v4, Landroidx/compose/material3/ChipKt;->AssistChipPadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 18
    .line 19
    invoke-static {v0, v1, v2, v3}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-YgX7TsA$default(FFILjava/lang/Object;)Landroidx/compose/foundation/layout/PaddingValues;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    sput-object v4, Landroidx/compose/material3/ChipKt;->FilterChipPadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 24
    .line 25
    invoke-static {v0, v1, v2, v3}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-YgX7TsA$default(FFILjava/lang/Object;)Landroidx/compose/foundation/layout/PaddingValues;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, Landroidx/compose/material3/ChipKt;->SuggestionChipPadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 30
    .line 31
    return-void
.end method

.method public static final AssistChip(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/material3/ChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V
    .locals 47
    .annotation runtime Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/graphics/Shape;",
            "Landroidx/compose/material3/ChipColors;",
            "Landroidx/compose/material3/ChipElevation;",
            "Landroidx/compose/material3/ChipBorder;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    move-object/from16 v15, p0

    move-object/from16 v12, p1

    move/from16 v11, p12

    move/from16 v10, p14

    const-string v0, "onClick"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "label"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x732c9134

    move-object/from16 v1, p11

    .line 1
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v14

    and-int/lit8 v1, v10, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v11, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v11, 0xe

    if-nez v1, :cond_2

    invoke-interface {v14, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v11

    goto :goto_1

    :cond_2
    move v1, v11

    :goto_1
    and-int/lit8 v4, v10, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v11, 0x70

    if-nez v4, :cond_5

    invoke-interface {v14, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v1, v4

    :cond_5
    :goto_3
    and-int/lit8 v4, v10, 0x4

    if-eqz v4, :cond_6

    or-int/lit16 v1, v1, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v5, v11, 0x380

    if-nez v5, :cond_8

    move-object/from16 v5, p2

    invoke-interface {v14, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    const/16 v6, 0x100

    goto :goto_4

    :cond_7
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v1, v6

    goto :goto_6

    :cond_8
    :goto_5
    move-object/from16 v5, p2

    :goto_6
    and-int/lit8 v6, v10, 0x8

    if-eqz v6, :cond_9

    or-int/lit16 v1, v1, 0xc00

    goto :goto_8

    :cond_9
    and-int/lit16 v7, v11, 0x1c00

    if-nez v7, :cond_b

    move/from16 v7, p3

    invoke-interface {v14, v7}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v8

    if-eqz v8, :cond_a

    const/16 v8, 0x800

    goto :goto_7

    :cond_a
    const/16 v8, 0x400

    :goto_7
    or-int/2addr v1, v8

    goto :goto_9

    :cond_b
    :goto_8
    move/from16 v7, p3

    :goto_9
    and-int/lit8 v8, v10, 0x10

    const v36, 0xe000

    if-eqz v8, :cond_c

    or-int/lit16 v1, v1, 0x6000

    goto :goto_b

    :cond_c
    and-int v9, v11, v36

    if-nez v9, :cond_e

    move-object/from16 v9, p4

    invoke-interface {v14, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_d

    const/16 v13, 0x4000

    goto :goto_a

    :cond_d
    const/16 v13, 0x2000

    :goto_a
    or-int/2addr v1, v13

    goto :goto_c

    :cond_e
    :goto_b
    move-object/from16 v9, p4

    :goto_c
    and-int/lit8 v13, v10, 0x20

    if-eqz v13, :cond_f

    const/high16 v16, 0x30000

    or-int v1, v1, v16

    move-object/from16 v2, p5

    goto :goto_e

    :cond_f
    const/high16 v16, 0x70000

    and-int v16, v11, v16

    move-object/from16 v2, p5

    if-nez v16, :cond_11

    invoke-interface {v14, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_10

    const/high16 v16, 0x20000

    goto :goto_d

    :cond_10
    const/high16 v16, 0x10000

    :goto_d
    or-int v1, v1, v16

    :cond_11
    :goto_e
    const/high16 v37, 0x380000

    and-int v16, v11, v37

    if-nez v16, :cond_13

    and-int/lit8 v16, v10, 0x40

    move-object/from16 v0, p6

    if-nez v16, :cond_12

    invoke-interface {v14, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_12

    const/high16 v16, 0x100000

    goto :goto_f

    :cond_12
    const/high16 v16, 0x80000

    :goto_f
    or-int v1, v1, v16

    goto :goto_10

    :cond_13
    move-object/from16 v0, p6

    :goto_10
    const/high16 v38, 0x1c00000

    and-int v16, v11, v38

    if-nez v16, :cond_16

    and-int/lit16 v3, v10, 0x80

    if-nez v3, :cond_14

    move-object/from16 v3, p7

    invoke-interface {v14, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_15

    const/high16 v17, 0x800000

    goto :goto_11

    :cond_14
    move-object/from16 v3, p7

    :cond_15
    const/high16 v17, 0x400000

    :goto_11
    or-int v1, v1, v17

    goto :goto_12

    :cond_16
    move-object/from16 v3, p7

    :goto_12
    const/high16 v39, 0xe000000

    and-int v17, v11, v39

    if-nez v17, :cond_19

    and-int/lit16 v0, v10, 0x100

    if-nez v0, :cond_17

    move-object/from16 v0, p8

    invoke-interface {v14, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_18

    const/high16 v17, 0x4000000

    goto :goto_13

    :cond_17
    move-object/from16 v0, p8

    :cond_18
    const/high16 v17, 0x2000000

    :goto_13
    or-int v1, v1, v17

    goto :goto_14

    :cond_19
    move-object/from16 v0, p8

    :goto_14
    const/high16 v40, 0x70000000

    and-int v17, v11, v40

    if-nez v17, :cond_1c

    and-int/lit16 v0, v10, 0x200

    if-nez v0, :cond_1a

    move-object/from16 v0, p9

    invoke-interface {v14, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_1b

    const/high16 v17, 0x20000000

    goto :goto_15

    :cond_1a
    move-object/from16 v0, p9

    :cond_1b
    const/high16 v17, 0x10000000

    :goto_15
    or-int v1, v1, v17

    goto :goto_16

    :cond_1c
    move-object/from16 v0, p9

    :goto_16
    and-int/lit16 v9, v10, 0x400

    if-eqz v9, :cond_1d

    or-int/lit8 v17, p13, 0x6

    move/from16 v41, v9

    :goto_17
    move/from16 v9, v17

    goto :goto_19

    :cond_1d
    and-int/lit8 v17, p13, 0xe

    move/from16 v41, v9

    move-object/from16 v9, p10

    if-nez v17, :cond_1f

    invoke-interface {v14, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_1e

    const/16 v17, 0x4

    goto :goto_18

    :cond_1e
    const/16 v17, 0x2

    :goto_18
    or-int v17, p13, v17

    goto :goto_17

    :cond_1f
    move/from16 v9, p13

    :goto_19
    const v17, 0x5b6db6db

    and-int v0, v1, v17

    const v2, 0x12492492

    if-ne v0, v2, :cond_21

    and-int/lit8 v0, v9, 0xb

    const/4 v2, 0x2

    if-ne v0, v2, :cond_21

    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_20

    goto :goto_1a

    .line 2
    :cond_20
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v6, p5

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object v8, v3

    move-object v3, v5

    move v4, v7

    move-object/from16 v23, v14

    move-object/from16 v5, p4

    move-object/from16 v7, p6

    goto/16 :goto_26

    .line 3
    :cond_21
    :goto_1a
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v0, v11, 0x1

    const/16 v42, 0x0

    const/4 v2, 0x6

    if-eqz v0, :cond_27

    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v0

    if-eqz v0, :cond_22

    goto :goto_1b

    .line 4
    :cond_22
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v0, v10, 0x40

    if-eqz v0, :cond_23

    const v0, -0x380001

    and-int/2addr v1, v0

    :cond_23
    and-int/lit16 v0, v10, 0x80

    if-eqz v0, :cond_24

    const v0, -0x1c00001

    and-int/2addr v1, v0

    :cond_24
    and-int/lit16 v0, v10, 0x100

    if-eqz v0, :cond_25

    const v0, -0xe000001

    and-int/2addr v1, v0

    :cond_25
    and-int/lit16 v0, v10, 0x200

    if-eqz v0, :cond_26

    const v0, -0x70000001

    and-int/2addr v1, v0

    :cond_26
    move-object/from16 v44, p4

    move-object/from16 v20, p5

    move-object/from16 v45, p6

    move-object/from16 v21, p8

    move-object/from16 v22, p10

    move-object v8, v3

    move-object/from16 v19, v5

    move v0, v9

    move v9, v7

    move-object/from16 v7, p9

    goto/16 :goto_24

    :cond_27
    :goto_1b
    if-eqz v4, :cond_28

    .line 5
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    goto :goto_1c

    :cond_28
    move-object v0, v5

    :goto_1c
    if-eqz v6, :cond_29

    const/4 v4, 0x1

    move/from16 v43, v4

    goto :goto_1d

    :cond_29
    move/from16 v43, v7

    :goto_1d
    if-eqz v8, :cond_2a

    move-object/from16 v44, v42

    goto :goto_1e

    :cond_2a
    move-object/from16 v44, p4

    :goto_1e
    if-eqz v13, :cond_2b

    move-object/from16 v13, v42

    goto :goto_1f

    :cond_2b
    move-object/from16 v13, p5

    :goto_1f
    and-int/lit8 v4, v10, 0x40

    if-eqz v4, :cond_2c

    .line 6
    sget-object v4, Landroidx/compose/material3/AssistChipDefaults;->INSTANCE:Landroidx/compose/material3/AssistChipDefaults;

    invoke-virtual {v4, v14, v2}, Landroidx/compose/material3/AssistChipDefaults;->getShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    move-result-object v4

    const v5, -0x380001

    and-int/2addr v1, v5

    move-object/from16 v45, v4

    goto :goto_20

    :cond_2c
    move-object/from16 v45, p6

    :goto_20
    and-int/lit16 v4, v10, 0x80

    if-eqz v4, :cond_2d

    .line 7
    sget-object v16, Landroidx/compose/material3/AssistChipDefaults;->INSTANCE:Landroidx/compose/material3/AssistChipDefaults;

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const-wide/16 v27, 0x0

    const-wide/16 v29, 0x0

    const-wide/16 v31, 0x0

    const/high16 v34, 0x6000000

    const/16 v35, 0xff

    move-object/from16 v33, v14

    invoke-virtual/range {v16 .. v35}, Landroidx/compose/material3/AssistChipDefaults;->assistChipColors-oq7We08(JJJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipColors;

    move-result-object v3

    const v4, -0x1c00001

    and-int/2addr v1, v4

    :cond_2d
    move-object/from16 v26, v3

    and-int/lit16 v3, v10, 0x100

    if-eqz v3, :cond_2e

    .line 8
    sget-object v16, Landroidx/compose/material3/AssistChipDefaults;->INSTANCE:Landroidx/compose/material3/AssistChipDefaults;

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/high16 v24, 0x180000

    const/16 v25, 0x3f

    move-object/from16 v23, v14

    invoke-virtual/range {v16 .. v25}, Landroidx/compose/material3/AssistChipDefaults;->assistChipElevation-aqJV_2Y(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipElevation;

    move-result-object v3

    const v4, -0xe000001

    and-int/2addr v1, v4

    move/from16 v17, v1

    move-object/from16 v16, v3

    goto :goto_21

    :cond_2e
    move-object/from16 v16, p8

    move/from16 v17, v1

    :goto_21
    and-int/lit16 v1, v10, 0x200

    if-eqz v1, :cond_2f

    .line 9
    sget-object v1, Landroidx/compose/material3/AssistChipDefaults;->INSTANCE:Landroidx/compose/material3/AssistChipDefaults;

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/16 v8, 0xc00

    const/16 v18, 0x7

    move-wide v2, v3

    move-wide v4, v5

    move v6, v7

    move-object v7, v14

    move-object/from16 p2, v0

    move v0, v9

    move/from16 v19, v41

    move/from16 v9, v18

    invoke-virtual/range {v1 .. v9}, Landroidx/compose/material3/AssistChipDefaults;->assistChipBorder-d_3_b6Q(JJFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipBorder;

    move-result-object v1

    const v2, -0x70000001

    and-int v2, v17, v2

    move/from16 v17, v2

    goto :goto_22

    :cond_2f
    move-object/from16 p2, v0

    move v0, v9

    move/from16 v19, v41

    move-object/from16 v1, p9

    :goto_22
    if-eqz v19, :cond_31

    const v2, -0x1d58f75c

    .line 10
    invoke-interface {v14, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 11
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    .line 12
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_30

    .line 13
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-result-object v2

    .line 14
    invoke-interface {v14, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 15
    :cond_30
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    check-cast v2, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-object/from16 v19, p2

    move-object v7, v1

    move-object/from16 v22, v2

    goto :goto_23

    :cond_31
    move-object/from16 v19, p2

    move-object/from16 v22, p10

    move-object v7, v1

    :goto_23
    move-object/from16 v20, v13

    move-object/from16 v21, v16

    move/from16 v1, v17

    move-object/from16 v8, v26

    move/from16 v9, v43

    :goto_24
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_32

    const-string v2, "androidx.compose.material3.AssistChip (Chip.kt:104)"

    const v3, -0x732c9134

    .line 16
    invoke-static {v3, v1, v0, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 17
    :cond_32
    sget-object v2, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    const/4 v3, 0x6

    invoke-virtual {v2, v14, v3}, Landroidx/compose/material3/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Typography;

    move-result-object v2

    sget-object v3, Landroidx/compose/material3/tokens/AssistChipTokens;->INSTANCE:Landroidx/compose/material3/tokens/AssistChipTokens;

    invoke-virtual {v3}, Landroidx/compose/material3/tokens/AssistChipTokens;->getLabelTextFont()Landroidx/compose/material3/tokens/TypographyKeyTokens;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/compose/material3/TypographyKt;->fromToken(Landroidx/compose/material3/Typography;Landroidx/compose/material3/tokens/TypographyKeyTokens;)Landroidx/compose/ui/text/TextStyle;

    move-result-object v4

    shr-int/lit8 v2, v1, 0x9

    and-int/lit8 v2, v2, 0xe

    shr-int/lit8 v3, v1, 0x12

    and-int/lit8 v3, v3, 0x70

    or-int/2addr v3, v2

    .line 18
    invoke-virtual {v8, v9, v14, v3}, Landroidx/compose/material3/ChipColors;->labelColor$material3_release(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v3

    invoke-interface {v3}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {v3}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v5

    if-nez v7, :cond_33

    move-object/from16 v2, v42

    goto :goto_25

    :cond_33
    shr-int/lit8 v3, v1, 0x18

    and-int/lit8 v3, v3, 0x70

    or-int/2addr v2, v3

    .line 19
    invoke-virtual {v7, v9, v14, v2}, Landroidx/compose/material3/ChipBorder;->borderStroke$material3_release(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v2

    :goto_25
    if-eqz v2, :cond_34

    invoke-interface {v2}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/foundation/BorderStroke;

    move-object/from16 v42, v2

    .line 20
    :cond_34
    sget-object v2, Landroidx/compose/material3/AssistChipDefaults;->INSTANCE:Landroidx/compose/material3/AssistChipDefaults;

    invoke-virtual {v2}, Landroidx/compose/material3/AssistChipDefaults;->getHeight-D9Ej5fM()F

    move-result v13

    .line 21
    sget-object v2, Landroidx/compose/material3/ChipKt;->AssistChipPadding:Landroidx/compose/foundation/layout/PaddingValues;

    move-object/from16 v23, v14

    move-object v14, v2

    shr-int/lit8 v2, v1, 0x6

    and-int/lit8 v2, v2, 0xe

    shl-int/lit8 v3, v1, 0x3

    and-int/lit8 v3, v3, 0x70

    or-int/2addr v2, v3

    shr-int/lit8 v3, v1, 0x3

    and-int/lit16 v3, v3, 0x380

    or-int/2addr v2, v3

    shl-int/lit8 v3, v1, 0x6

    move-object/from16 p2, v7

    and-int/lit16 v7, v3, 0x1c00

    or-int/2addr v2, v7

    and-int v7, v3, v37

    or-int/2addr v2, v7

    and-int v7, v3, v38

    or-int/2addr v2, v7

    and-int v7, v3, v39

    or-int/2addr v2, v7

    and-int v3, v3, v40

    or-int v17, v2, v3

    shr-int/lit8 v1, v1, 0x18

    and-int/lit8 v1, v1, 0xe

    or-int/lit16 v1, v1, 0xd80

    shl-int/lit8 v0, v0, 0xc

    and-int v0, v0, v36

    or-int v18, v1, v0

    move-object/from16 v0, v19

    move-object/from16 v1, p0

    move v2, v9

    move-object/from16 v3, p1

    move-object/from16 v24, p2

    move-object/from16 v7, v44

    move-object/from16 v26, v8

    move-object/from16 v8, v20

    move/from16 v43, v9

    move-object/from16 v9, v45

    move-object/from16 v10, v26

    move-object/from16 v11, v21

    move-object/from16 v12, v42

    move-object/from16 v15, v22

    move-object/from16 v16, v23

    .line 22
    invoke-static/range {v0 .. v18}, Landroidx/compose/material3/ChipKt;->Chip-nkUnTEs(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_35

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_35
    move-object/from16 v3, v19

    move-object/from16 v6, v20

    move-object/from16 v9, v21

    move-object/from16 v11, v22

    move-object/from16 v10, v24

    move-object/from16 v8, v26

    move/from16 v4, v43

    move-object/from16 v5, v44

    move-object/from16 v7, v45

    .line 23
    :goto_26
    invoke-interface/range {v23 .. v23}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v15

    if-nez v15, :cond_36

    goto :goto_27

    :cond_36
    new-instance v14, Landroidx/compose/material3/ChipKt$AssistChip$2;

    move-object v0, v14

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v12, p12

    move/from16 v13, p13

    move-object/from16 v46, v14

    move/from16 v14, p14

    invoke-direct/range {v0 .. v14}, Landroidx/compose/material3/ChipKt$AssistChip$2;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/material3/ChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;III)V

    move-object/from16 v0, v46

    invoke-interface {v15, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :goto_27
    return-void
.end method

.method private static final Chip-nkUnTEs(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V
    .locals 29
    .annotation runtime Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;Z",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/text/TextStyle;",
            "J",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/graphics/Shape;",
            "Landroidx/compose/material3/ChipColors;",
            "Landroidx/compose/material3/ChipElevation;",
            "Landroidx/compose/foundation/BorderStroke;",
            "F",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v13, p2

    move-object/from16 v15, p10

    move-object/from16 v14, p11

    move-object/from16 v12, p15

    move/from16 v11, p17

    move/from16 v10, p18

    const v0, 0x537a018f

    move-object/from16 v1, p16

    .line 1
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v9

    and-int/lit8 v1, v11, 0xe

    const/4 v2, 0x4

    const/4 v3, 0x2

    move-object/from16 v8, p0

    if-nez v1, :cond_1

    invoke-interface {v9, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    or-int/2addr v1, v11

    goto :goto_1

    :cond_1
    move v1, v11

    :goto_1
    and-int/lit8 v4, v11, 0x70

    const/16 v5, 0x20

    const/16 v6, 0x10

    move-object/from16 v7, p1

    if-nez v4, :cond_3

    invoke-interface {v9, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    move v4, v5

    goto :goto_2

    :cond_2
    move v4, v6

    :goto_2
    or-int/2addr v1, v4

    :cond_3
    and-int/lit16 v4, v11, 0x380

    const/16 v16, 0x100

    const/16 v17, 0x80

    if-nez v4, :cond_5

    invoke-interface {v9, v13}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v4

    if-eqz v4, :cond_4

    move/from16 v4, v16

    goto :goto_3

    :cond_4
    move/from16 v4, v17

    :goto_3
    or-int/2addr v1, v4

    :cond_5
    and-int/lit16 v4, v11, 0x1c00

    const/16 v18, 0x800

    const/16 v19, 0x400

    if-nez v4, :cond_7

    move-object/from16 v4, p3

    invoke-interface {v9, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_6

    move/from16 v20, v18

    goto :goto_4

    :cond_6
    move/from16 v20, v19

    :goto_4
    or-int v1, v1, v20

    goto :goto_5

    :cond_7
    move-object/from16 v4, p3

    :goto_5
    const v20, 0xe000

    and-int v21, v11, v20

    const/16 v22, 0x4000

    const/16 v23, 0x2000

    move-object/from16 v0, p4

    if-nez v21, :cond_9

    invoke-interface {v9, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_8

    move/from16 v24, v22

    goto :goto_6

    :cond_8
    move/from16 v24, v23

    :goto_6
    or-int v1, v1, v24

    :cond_9
    const/high16 v24, 0x70000

    and-int v24, v11, v24

    move-wide/from16 v7, p5

    if-nez v24, :cond_b

    invoke-interface {v9, v7, v8}, Landroidx/compose/runtime/Composer;->changed(J)Z

    move-result v24

    if-eqz v24, :cond_a

    const/high16 v24, 0x20000

    goto :goto_7

    :cond_a
    const/high16 v24, 0x10000

    :goto_7
    or-int v1, v1, v24

    :cond_b
    const/high16 v24, 0x380000

    and-int v24, v11, v24

    move-object/from16 v8, p7

    if-nez v24, :cond_d

    invoke-interface {v9, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_c

    const/high16 v7, 0x100000

    goto :goto_8

    :cond_c
    const/high16 v7, 0x80000

    :goto_8
    or-int/2addr v1, v7

    :cond_d
    const/high16 v7, 0x1c00000

    and-int/2addr v7, v11

    if-nez v7, :cond_f

    move-object/from16 v7, p8

    invoke-interface {v9, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_e

    const/high16 v24, 0x800000

    goto :goto_9

    :cond_e
    const/high16 v24, 0x400000

    :goto_9
    or-int v1, v1, v24

    goto :goto_a

    :cond_f
    move-object/from16 v7, p8

    :goto_a
    const/high16 v24, 0xe000000

    and-int v25, v11, v24

    move-object/from16 v8, p9

    if-nez v25, :cond_11

    invoke-interface {v9, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_10

    const/high16 v25, 0x4000000

    goto :goto_b

    :cond_10
    const/high16 v25, 0x2000000

    :goto_b
    or-int v1, v1, v25

    :cond_11
    const/high16 v25, 0x70000000

    and-int v26, v11, v25

    if-nez v26, :cond_13

    invoke-interface {v9, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_12

    const/high16 v26, 0x20000000

    goto :goto_c

    :cond_12
    const/high16 v26, 0x10000000

    :goto_c
    or-int v1, v1, v26

    :cond_13
    and-int/lit8 v26, v10, 0xe

    if-nez v26, :cond_15

    invoke-interface {v9, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_14

    goto :goto_d

    :cond_14
    move v2, v3

    :goto_d
    or-int/2addr v2, v10

    goto :goto_e

    :cond_15
    move v2, v10

    :goto_e
    and-int/lit8 v3, v10, 0x70

    if-nez v3, :cond_17

    move-object/from16 v3, p12

    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_16

    goto :goto_f

    :cond_16
    move v5, v6

    :goto_f
    or-int/2addr v2, v5

    goto :goto_10

    :cond_17
    move-object/from16 v3, p12

    :goto_10
    and-int/lit16 v5, v10, 0x380

    move/from16 v6, p13

    if-nez v5, :cond_19

    invoke-interface {v9, v6}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v5

    if-eqz v5, :cond_18

    goto :goto_11

    :cond_18
    move/from16 v16, v17

    :goto_11
    or-int v2, v2, v16

    :cond_19
    and-int/lit16 v5, v10, 0x1c00

    if-nez v5, :cond_1b

    move-object/from16 v5, p14

    invoke-interface {v9, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_1a

    goto :goto_12

    :cond_1a
    move/from16 v18, v19

    :goto_12
    or-int v2, v2, v18

    goto :goto_13

    :cond_1b
    move-object/from16 v5, p14

    :goto_13
    and-int v16, v10, v20

    if-nez v16, :cond_1d

    invoke-interface {v9, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_1c

    goto :goto_14

    :cond_1c
    move/from16 v22, v23

    :goto_14
    or-int v2, v2, v22

    :cond_1d
    const v16, 0x5b6db6db

    and-int v0, v1, v16

    const v3, 0x12492492

    if-ne v0, v3, :cond_1f

    const v0, 0xb6db

    and-int/2addr v0, v2

    const/16 v3, 0x2492

    if-ne v0, v3, :cond_1f

    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_1e

    goto :goto_15

    .line 2
    :cond_1e
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v23, v9

    goto/16 :goto_1a

    .line 3
    :cond_1f
    :goto_15
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_20

    const-string v0, "androidx.compose.material3.Chip (Chip.kt:1308)"

    const v3, 0x537a018f

    invoke-static {v3, v1, v2, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_20
    shr-int/lit8 v0, v1, 0x6

    and-int/lit8 v0, v0, 0xe

    shr-int/lit8 v3, v1, 0x18

    and-int/lit8 v3, v3, 0x70

    or-int/2addr v3, v0

    .line 4
    invoke-virtual {v15, v13, v9, v3}, Landroidx/compose/material3/ChipColors;->containerColor$material3_release(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v3

    invoke-interface {v3}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {v3}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v17

    const-wide/16 v19, 0x0

    const v3, 0x3d0da9d

    .line 5
    invoke-interface {v9, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    if-nez v14, :cond_21

    const/4 v3, 0x0

    goto :goto_16

    :cond_21
    shr-int/lit8 v16, v2, 0x9

    and-int/lit8 v16, v16, 0x70

    or-int v16, v0, v16

    shl-int/lit8 v3, v2, 0x6

    and-int/lit16 v3, v3, 0x380

    or-int v3, v16, v3

    invoke-virtual {v14, v13, v12, v9, v3}, Landroidx/compose/material3/ChipElevation;->tonalElevation$material3_release(ZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v3

    :goto_16
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    move/from16 v16, v1

    const/4 v1, 0x0

    if-eqz v3, :cond_22

    invoke-interface {v3}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/compose/ui/unit/Dp;

    invoke-virtual {v3}, Landroidx/compose/ui/unit/Dp;->unbox-impl()F

    move-result v3

    goto :goto_17

    :cond_22
    int-to-float v3, v1

    .line 6
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v3

    :goto_17
    move/from16 v21, v3

    if-nez v14, :cond_23

    const/4 v3, 0x0

    goto :goto_18

    :cond_23
    shr-int/lit8 v3, v2, 0x9

    and-int/lit8 v3, v3, 0x70

    or-int/2addr v0, v3

    shl-int/lit8 v3, v2, 0x6

    and-int/lit16 v3, v3, 0x380

    or-int/2addr v0, v3

    .line 7
    invoke-virtual {v14, v13, v12, v9, v0}, Landroidx/compose/material3/ChipElevation;->shadowElevation$material3_release(ZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v3

    :goto_18
    if-eqz v3, :cond_24

    invoke-interface {v3}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/unit/Dp;

    invoke-virtual {v0}, Landroidx/compose/ui/unit/Dp;->unbox-impl()F

    move-result v0

    goto :goto_19

    :cond_24
    int-to-float v0, v1

    .line 8
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    :goto_19
    move/from16 v22, v0

    .line 9
    new-instance v3, Landroidx/compose/material3/ChipKt$Chip$1;

    move-object v0, v3

    move/from16 p16, v16

    move-object/from16 v1, p3

    move/from16 v16, v2

    move-object/from16 v2, p4

    move-object v13, v3

    move-wide/from16 v3, p5

    move-object/from16 v5, p7

    move-object/from16 v6, p8

    move-object/from16 v7, p10

    move/from16 v8, p2

    move-object v15, v9

    move/from16 v9, p16

    move/from16 v10, p13

    move-object/from16 v11, p14

    move/from16 v12, v16

    invoke-direct/range {v0 .. v12}, Landroidx/compose/material3/ChipKt$Chip$1;-><init>(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/ChipColors;ZIFLandroidx/compose/foundation/layout/PaddingValues;I)V

    const v0, -0x765f629c

    const/4 v1, 0x1

    invoke-static {v15, v0, v1, v13}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v12

    move/from16 v1, p16

    shr-int/lit8 v0, v1, 0x3

    and-int/lit8 v0, v0, 0xe

    shl-int/lit8 v2, v1, 0x3

    and-int/lit8 v2, v2, 0x70

    or-int/2addr v0, v2

    and-int/lit16 v2, v1, 0x380

    or-int/2addr v0, v2

    shr-int/lit8 v1, v1, 0xf

    and-int/lit16 v1, v1, 0x1c00

    or-int/2addr v0, v1

    shl-int/lit8 v1, v16, 0x15

    and-int v1, v1, v24

    or-int/2addr v0, v1

    shl-int/lit8 v1, v16, 0xf

    and-int v1, v1, v25

    or-int/2addr v0, v1

    move v14, v0

    const/4 v0, 0x6

    move-object/from16 v23, v15

    move v15, v0

    const/16 v16, 0x20

    move-object/from16 v0, p1

    move-object/from16 v1, p0

    move/from16 v2, p2

    move-object/from16 v3, p9

    move-wide/from16 v4, v17

    move-wide/from16 v6, v19

    move/from16 v8, v21

    move/from16 v9, v22

    move-object/from16 v10, p12

    move-object/from16 v11, p15

    move-object/from16 v13, v23

    .line 10
    invoke-static/range {v0 .. v16}, Landroidx/compose/material3/SurfaceKt;->Surface-o_FOJdg(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_25

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 11
    :cond_25
    :goto_1a
    invoke-interface/range {v23 .. v23}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v15

    if-nez v15, :cond_26

    goto :goto_1b

    :cond_26
    new-instance v14, Landroidx/compose/material3/ChipKt$Chip$2;

    move-object v0, v14

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-wide/from16 v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v27, v14

    move/from16 v14, p13

    move-object/from16 v28, v15

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move/from16 v17, p17

    move/from16 v18, p18

    invoke-direct/range {v0 .. v18}, Landroidx/compose/material3/ChipKt$Chip$2;-><init>(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;II)V

    move-object/from16 v1, v27

    move-object/from16 v0, v28

    invoke-interface {v0, v1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :goto_1b
    return-void
.end method

.method private static final ChipContent-fe0OD_I(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V
    .locals 28
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/text/TextStyle;",
            "J",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;JJF",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move/from16 v14, p14

    .line 4
    .line 5
    const v0, -0x2ea9c614

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p13

    .line 9
    .line 10
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    and-int/lit8 v3, v14, 0xe

    .line 15
    .line 16
    if-nez v3, :cond_1

    .line 17
    .line 18
    move-object/from16 v3, p0

    .line 19
    .line 20
    invoke-interface {v1, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-eqz v5, :cond_0

    .line 25
    .line 26
    const/4 v5, 0x4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v5, 0x2

    .line 29
    :goto_0
    or-int/2addr v5, v14

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move-object/from16 v3, p0

    .line 32
    .line 33
    move v5, v14

    .line 34
    :goto_1
    and-int/lit8 v6, v14, 0x70

    .line 35
    .line 36
    if-nez v6, :cond_3

    .line 37
    .line 38
    invoke-interface {v1, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    if-eqz v6, :cond_2

    .line 43
    .line 44
    const/16 v6, 0x20

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/16 v6, 0x10

    .line 48
    .line 49
    :goto_2
    or-int/2addr v5, v6

    .line 50
    :cond_3
    and-int/lit16 v6, v14, 0x380

    .line 51
    .line 52
    if-nez v6, :cond_5

    .line 53
    .line 54
    move-wide/from16 v6, p2

    .line 55
    .line 56
    invoke-interface {v1, v6, v7}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    if-eqz v8, :cond_4

    .line 61
    .line 62
    const/16 v8, 0x100

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_4
    const/16 v8, 0x80

    .line 66
    .line 67
    :goto_3
    or-int/2addr v5, v8

    .line 68
    goto :goto_4

    .line 69
    :cond_5
    move-wide/from16 v6, p2

    .line 70
    .line 71
    :goto_4
    and-int/lit16 v8, v14, 0x1c00

    .line 72
    .line 73
    if-nez v8, :cond_7

    .line 74
    .line 75
    move-object/from16 v8, p4

    .line 76
    .line 77
    invoke-interface {v1, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v9

    .line 81
    if-eqz v9, :cond_6

    .line 82
    .line 83
    const/16 v9, 0x800

    .line 84
    .line 85
    goto :goto_5

    .line 86
    :cond_6
    const/16 v9, 0x400

    .line 87
    .line 88
    :goto_5
    or-int/2addr v5, v9

    .line 89
    goto :goto_6

    .line 90
    :cond_7
    move-object/from16 v8, p4

    .line 91
    .line 92
    :goto_6
    const v9, 0xe000

    .line 93
    .line 94
    .line 95
    and-int/2addr v9, v14

    .line 96
    if-nez v9, :cond_9

    .line 97
    .line 98
    move-object/from16 v9, p5

    .line 99
    .line 100
    invoke-interface {v1, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v10

    .line 104
    if-eqz v10, :cond_8

    .line 105
    .line 106
    const/16 v10, 0x4000

    .line 107
    .line 108
    goto :goto_7

    .line 109
    :cond_8
    const/16 v10, 0x2000

    .line 110
    .line 111
    :goto_7
    or-int/2addr v5, v10

    .line 112
    goto :goto_8

    .line 113
    :cond_9
    move-object/from16 v9, p5

    .line 114
    .line 115
    :goto_8
    const/high16 v10, 0x70000

    .line 116
    .line 117
    and-int/2addr v10, v14

    .line 118
    if-nez v10, :cond_b

    .line 119
    .line 120
    move-object/from16 v10, p6

    .line 121
    .line 122
    invoke-interface {v1, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    move-result v11

    .line 126
    if-eqz v11, :cond_a

    .line 127
    .line 128
    const/high16 v11, 0x20000

    .line 129
    .line 130
    goto :goto_9

    .line 131
    :cond_a
    const/high16 v11, 0x10000

    .line 132
    .line 133
    :goto_9
    or-int/2addr v5, v11

    .line 134
    goto :goto_a

    .line 135
    :cond_b
    move-object/from16 v10, p6

    .line 136
    .line 137
    :goto_a
    const/high16 v11, 0x380000

    .line 138
    .line 139
    and-int/2addr v11, v14

    .line 140
    if-nez v11, :cond_d

    .line 141
    .line 142
    move-wide/from16 v11, p7

    .line 143
    .line 144
    invoke-interface {v1, v11, v12}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 145
    .line 146
    .line 147
    move-result v13

    .line 148
    if-eqz v13, :cond_c

    .line 149
    .line 150
    const/high16 v13, 0x100000

    .line 151
    .line 152
    goto :goto_b

    .line 153
    :cond_c
    const/high16 v13, 0x80000

    .line 154
    .line 155
    :goto_b
    or-int/2addr v5, v13

    .line 156
    goto :goto_c

    .line 157
    :cond_d
    move-wide/from16 v11, p7

    .line 158
    .line 159
    :goto_c
    const/high16 v13, 0x1c00000

    .line 160
    .line 161
    and-int/2addr v13, v14

    .line 162
    if-nez v13, :cond_f

    .line 163
    .line 164
    move v13, v5

    .line 165
    move-wide/from16 v4, p9

    .line 166
    .line 167
    invoke-interface {v1, v4, v5}, Landroidx/compose/runtime/Composer;->changed(J)Z

    .line 168
    .line 169
    .line 170
    move-result v15

    .line 171
    if-eqz v15, :cond_e

    .line 172
    .line 173
    const/high16 v15, 0x800000

    .line 174
    .line 175
    goto :goto_d

    .line 176
    :cond_e
    const/high16 v15, 0x400000

    .line 177
    .line 178
    :goto_d
    or-int/2addr v13, v15

    .line 179
    goto :goto_e

    .line 180
    :cond_f
    move v13, v5

    .line 181
    move-wide/from16 v4, p9

    .line 182
    .line 183
    :goto_e
    const/high16 v15, 0xe000000

    .line 184
    .line 185
    and-int/2addr v15, v14

    .line 186
    if-nez v15, :cond_11

    .line 187
    .line 188
    move/from16 v15, p11

    .line 189
    .line 190
    invoke-interface {v1, v15}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 191
    .line 192
    .line 193
    move-result v16

    .line 194
    if-eqz v16, :cond_10

    .line 195
    .line 196
    const/high16 v16, 0x4000000

    .line 197
    .line 198
    goto :goto_f

    .line 199
    :cond_10
    const/high16 v16, 0x2000000

    .line 200
    .line 201
    :goto_f
    or-int v13, v13, v16

    .line 202
    .line 203
    goto :goto_10

    .line 204
    :cond_11
    move/from16 v15, p11

    .line 205
    .line 206
    :goto_10
    const/high16 v16, 0x70000000

    .line 207
    .line 208
    and-int v16, v14, v16

    .line 209
    .line 210
    move-object/from16 v0, p12

    .line 211
    .line 212
    if-nez v16, :cond_13

    .line 213
    .line 214
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v17

    .line 218
    if-eqz v17, :cond_12

    .line 219
    .line 220
    const/high16 v17, 0x20000000

    .line 221
    .line 222
    goto :goto_11

    .line 223
    :cond_12
    const/high16 v17, 0x10000000

    .line 224
    .line 225
    :goto_11
    or-int v13, v13, v17

    .line 226
    .line 227
    :cond_13
    const v17, 0x5b6db6db

    .line 228
    .line 229
    .line 230
    and-int v0, v13, v17

    .line 231
    .line 232
    const v3, 0x12492492

    .line 233
    .line 234
    .line 235
    if-ne v0, v3, :cond_15

    .line 236
    .line 237
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    if-nez v0, :cond_14

    .line 242
    .line 243
    goto :goto_12

    .line 244
    :cond_14
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 245
    .line 246
    .line 247
    goto :goto_13

    .line 248
    :cond_15
    :goto_12
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 249
    .line 250
    .line 251
    move-result v0

    .line 252
    if-eqz v0, :cond_16

    .line 253
    .line 254
    const/4 v0, -0x1

    .line 255
    const-string v3, "androidx.compose.material3.ChipContent (Chip.kt:1402)"

    .line 256
    .line 257
    const v4, -0x2ea9c614

    .line 258
    .line 259
    .line 260
    invoke-static {v4, v13, v0, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 261
    .line 262
    .line 263
    :cond_16
    const/4 v0, 0x2

    .line 264
    new-array v0, v0, [Landroidx/compose/runtime/ProvidedValue;

    .line 265
    .line 266
    invoke-static {}, Landroidx/compose/material3/ContentColorKt;->getLocalContentColor()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 267
    .line 268
    .line 269
    move-result-object v3

    .line 270
    invoke-static/range {p2 .. p3}, Landroidx/compose/ui/graphics/Color;->box-impl(J)Landroidx/compose/ui/graphics/Color;

    .line 271
    .line 272
    .line 273
    move-result-object v4

    .line 274
    invoke-virtual {v3, v4}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    .line 275
    .line 276
    .line 277
    move-result-object v3

    .line 278
    const/4 v4, 0x0

    .line 279
    aput-object v3, v0, v4

    .line 280
    .line 281
    invoke-static {}, Landroidx/compose/material3/TextKt;->getLocalTextStyle()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 282
    .line 283
    .line 284
    move-result-object v3

    .line 285
    invoke-virtual {v3, v2}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    const/4 v4, 0x1

    .line 290
    aput-object v3, v0, v4

    .line 291
    .line 292
    new-instance v3, Landroidx/compose/material3/ChipKt$ChipContent$1;

    .line 293
    .line 294
    move-object v15, v3

    .line 295
    move/from16 v16, p11

    .line 296
    .line 297
    move-object/from16 v17, p12

    .line 298
    .line 299
    move-object/from16 v18, p5

    .line 300
    .line 301
    move/from16 v19, v13

    .line 302
    .line 303
    move-object/from16 v20, p4

    .line 304
    .line 305
    move-wide/from16 v21, p7

    .line 306
    .line 307
    move-object/from16 v23, p0

    .line 308
    .line 309
    move-object/from16 v24, p6

    .line 310
    .line 311
    move-wide/from16 v25, p9

    .line 312
    .line 313
    invoke-direct/range {v15 .. v26}, Landroidx/compose/material3/ChipKt$ChipContent$1;-><init>(FLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;ILkotlin/jvm/functions/Function2;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;J)V

    .line 314
    .line 315
    .line 316
    const v5, 0x683c8eac

    .line 317
    .line 318
    .line 319
    invoke-static {v1, v5, v4, v3}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    .line 320
    .line 321
    .line 322
    move-result-object v3

    .line 323
    const/16 v4, 0x38

    .line 324
    .line 325
    invoke-static {v0, v3, v1, v4}, Landroidx/compose/runtime/CompositionLocalKt;->CompositionLocalProvider([Landroidx/compose/runtime/ProvidedValue;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V

    .line 326
    .line 327
    .line 328
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 329
    .line 330
    .line 331
    move-result v0

    .line 332
    if-eqz v0, :cond_17

    .line 333
    .line 334
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 335
    .line 336
    .line 337
    :cond_17
    :goto_13
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 338
    .line 339
    .line 340
    move-result-object v15

    .line 341
    if-nez v15, :cond_18

    .line 342
    .line 343
    goto :goto_14

    .line 344
    :cond_18
    new-instance v13, Landroidx/compose/material3/ChipKt$ChipContent$2;

    .line 345
    .line 346
    move-object v0, v13

    .line 347
    move-object/from16 v1, p0

    .line 348
    .line 349
    move-object/from16 v2, p1

    .line 350
    .line 351
    move-wide/from16 v3, p2

    .line 352
    .line 353
    move-object/from16 v5, p4

    .line 354
    .line 355
    move-object/from16 v6, p5

    .line 356
    .line 357
    move-object/from16 v7, p6

    .line 358
    .line 359
    move-wide/from16 v8, p7

    .line 360
    .line 361
    move-wide/from16 v10, p9

    .line 362
    .line 363
    move/from16 v12, p11

    .line 364
    .line 365
    move-object/from16 v27, v13

    .line 366
    .line 367
    move-object/from16 v13, p12

    .line 368
    .line 369
    move/from16 v14, p14

    .line 370
    .line 371
    invoke-direct/range {v0 .. v14}, Landroidx/compose/material3/ChipKt$ChipContent$2;-><init>(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JJFLandroidx/compose/foundation/layout/PaddingValues;I)V

    .line 372
    .line 373
    .line 374
    move-object/from16 v0, v27

    .line 375
    .line 376
    invoke-interface {v15, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 377
    .line 378
    .line 379
    :goto_14
    return-void
.end method

.method public static final ElevatedAssistChip(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/material3/ChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V
    .locals 50
    .annotation runtime Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/graphics/Shape;",
            "Landroidx/compose/material3/ChipColors;",
            "Landroidx/compose/material3/ChipElevation;",
            "Landroidx/compose/material3/ChipBorder;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    move-object/from16 v15, p0

    move-object/from16 v14, p1

    move/from16 v13, p12

    move/from16 v12, p14

    const-string v0, "onClick"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "label"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x4d3d05c2    # 1.9820445E8f

    move-object/from16 v1, p11

    .line 1
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v11

    and-int/lit8 v1, v12, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v13, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v13, 0xe

    if-nez v1, :cond_2

    invoke-interface {v11, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v13

    goto :goto_1

    :cond_2
    move v1, v13

    :goto_1
    and-int/lit8 v4, v12, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v13, 0x70

    if-nez v4, :cond_5

    invoke-interface {v11, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v1, v4

    :cond_5
    :goto_3
    and-int/lit8 v4, v12, 0x4

    if-eqz v4, :cond_6

    or-int/lit16 v1, v1, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v5, v13, 0x380

    if-nez v5, :cond_8

    move-object/from16 v5, p2

    invoke-interface {v11, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    const/16 v6, 0x100

    goto :goto_4

    :cond_7
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v1, v6

    goto :goto_6

    :cond_8
    :goto_5
    move-object/from16 v5, p2

    :goto_6
    and-int/lit8 v6, v12, 0x8

    if-eqz v6, :cond_9

    or-int/lit16 v1, v1, 0xc00

    goto :goto_8

    :cond_9
    and-int/lit16 v7, v13, 0x1c00

    if-nez v7, :cond_b

    move/from16 v7, p3

    invoke-interface {v11, v7}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v8

    if-eqz v8, :cond_a

    const/16 v8, 0x800

    goto :goto_7

    :cond_a
    const/16 v8, 0x400

    :goto_7
    or-int/2addr v1, v8

    goto :goto_9

    :cond_b
    :goto_8
    move/from16 v7, p3

    :goto_9
    and-int/lit8 v8, v12, 0x10

    const v36, 0xe000

    if-eqz v8, :cond_c

    or-int/lit16 v1, v1, 0x6000

    goto :goto_b

    :cond_c
    and-int v9, v13, v36

    if-nez v9, :cond_e

    move-object/from16 v9, p4

    invoke-interface {v11, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_d

    const/16 v10, 0x4000

    goto :goto_a

    :cond_d
    const/16 v10, 0x2000

    :goto_a
    or-int/2addr v1, v10

    goto :goto_c

    :cond_e
    :goto_b
    move-object/from16 v9, p4

    :goto_c
    and-int/lit8 v10, v12, 0x20

    if-eqz v10, :cond_f

    const/high16 v16, 0x30000

    or-int v1, v1, v16

    move-object/from16 v2, p5

    goto :goto_e

    :cond_f
    const/high16 v16, 0x70000

    and-int v16, v13, v16

    move-object/from16 v2, p5

    if-nez v16, :cond_11

    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_10

    const/high16 v16, 0x20000

    goto :goto_d

    :cond_10
    const/high16 v16, 0x10000

    :goto_d
    or-int v1, v1, v16

    :cond_11
    :goto_e
    const/high16 v37, 0x380000

    and-int v16, v13, v37

    if-nez v16, :cond_13

    and-int/lit8 v16, v12, 0x40

    move-object/from16 v0, p6

    if-nez v16, :cond_12

    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_12

    const/high16 v16, 0x100000

    goto :goto_f

    :cond_12
    const/high16 v16, 0x80000

    :goto_f
    or-int v1, v1, v16

    goto :goto_10

    :cond_13
    move-object/from16 v0, p6

    :goto_10
    const/high16 v38, 0x1c00000

    and-int v16, v13, v38

    if-nez v16, :cond_16

    and-int/lit16 v3, v12, 0x80

    if-nez v3, :cond_14

    move-object/from16 v3, p7

    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_15

    const/high16 v17, 0x800000

    goto :goto_11

    :cond_14
    move-object/from16 v3, p7

    :cond_15
    const/high16 v17, 0x400000

    :goto_11
    or-int v1, v1, v17

    goto :goto_12

    :cond_16
    move-object/from16 v3, p7

    :goto_12
    const/high16 v39, 0xe000000

    and-int v17, v13, v39

    if-nez v17, :cond_19

    and-int/lit16 v0, v12, 0x100

    if-nez v0, :cond_17

    move-object/from16 v0, p8

    invoke-interface {v11, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_18

    const/high16 v17, 0x4000000

    goto :goto_13

    :cond_17
    move-object/from16 v0, p8

    :cond_18
    const/high16 v17, 0x2000000

    :goto_13
    or-int v1, v1, v17

    goto :goto_14

    :cond_19
    move-object/from16 v0, p8

    :goto_14
    and-int/lit16 v9, v12, 0x200

    const/high16 v40, 0x70000000

    if-eqz v9, :cond_1a

    const/high16 v17, 0x30000000

    or-int v1, v1, v17

    move/from16 v41, v9

    move-object/from16 v9, p9

    goto :goto_16

    :cond_1a
    and-int v17, v13, v40

    move/from16 v41, v9

    move-object/from16 v9, p9

    if-nez v17, :cond_1c

    invoke-interface {v11, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_1b

    const/high16 v17, 0x20000000

    goto :goto_15

    :cond_1b
    const/high16 v17, 0x10000000

    :goto_15
    or-int v1, v1, v17

    :cond_1c
    :goto_16
    and-int/lit16 v9, v12, 0x400

    if-eqz v9, :cond_1d

    or-int/lit8 v17, p13, 0x6

    move/from16 v42, v9

    :goto_17
    move/from16 v9, v17

    goto :goto_19

    :cond_1d
    and-int/lit8 v17, p13, 0xe

    move/from16 v42, v9

    move-object/from16 v9, p10

    if-nez v17, :cond_1f

    invoke-interface {v11, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_1e

    const/16 v17, 0x4

    goto :goto_18

    :cond_1e
    const/16 v17, 0x2

    :goto_18
    or-int v17, p13, v17

    goto :goto_17

    :cond_1f
    move/from16 v9, p13

    :goto_19
    const v17, 0x5b6db6db

    and-int v0, v1, v17

    const v2, 0x12492492

    if-ne v0, v2, :cond_21

    and-int/lit8 v0, v9, 0xb

    const/4 v2, 0x2

    if-ne v0, v2, :cond_21

    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_20

    goto :goto_1a

    .line 2
    :cond_20
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v6, p5

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object v8, v3

    move-object v3, v5

    move v4, v7

    move-object/from16 v25, v11

    move-object/from16 v5, p4

    move-object/from16 v7, p6

    move-object/from16 v11, p10

    goto/16 :goto_28

    .line 3
    :cond_21
    :goto_1a
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v0, v13, 0x1

    const v2, -0x380001

    const/16 v43, 0x0

    move/from16 p11, v9

    const/4 v9, 0x6

    if-eqz v0, :cond_26

    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v0

    if-eqz v0, :cond_22

    goto :goto_1b

    .line 4
    :cond_22
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v0, v12, 0x40

    if-eqz v0, :cond_23

    and-int/2addr v1, v2

    :cond_23
    and-int/lit16 v0, v12, 0x80

    if-eqz v0, :cond_24

    const v0, -0x1c00001

    and-int/2addr v1, v0

    :cond_24
    and-int/lit16 v0, v12, 0x100

    if-eqz v0, :cond_25

    const v0, -0xe000001

    and-int/2addr v1, v0

    :cond_25
    move-object/from16 v45, p4

    move-object/from16 v46, p5

    move-object/from16 v47, p6

    move-object/from16 v20, p8

    move-object/from16 v8, p9

    move-object/from16 v21, p10

    move/from16 v48, p11

    move-object v9, v3

    move-object/from16 v19, v5

    move v10, v7

    goto/16 :goto_25

    :cond_26
    :goto_1b
    if-eqz v4, :cond_27

    .line 5
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    goto :goto_1c

    :cond_27
    move-object v0, v5

    :goto_1c
    if-eqz v6, :cond_28

    const/4 v4, 0x1

    move/from16 v44, v4

    goto :goto_1d

    :cond_28
    move/from16 v44, v7

    :goto_1d
    if-eqz v8, :cond_29

    move-object/from16 v45, v43

    goto :goto_1e

    :cond_29
    move-object/from16 v45, p4

    :goto_1e
    if-eqz v10, :cond_2a

    move-object/from16 v46, v43

    goto :goto_1f

    :cond_2a
    move-object/from16 v46, p5

    :goto_1f
    and-int/lit8 v4, v12, 0x40

    if-eqz v4, :cond_2b

    .line 6
    sget-object v4, Landroidx/compose/material3/AssistChipDefaults;->INSTANCE:Landroidx/compose/material3/AssistChipDefaults;

    invoke-virtual {v4, v11, v9}, Landroidx/compose/material3/AssistChipDefaults;->getShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    move-result-object v4

    and-int/2addr v1, v2

    move-object/from16 v47, v4

    goto :goto_20

    :cond_2b
    move-object/from16 v47, p6

    :goto_20
    and-int/lit16 v2, v12, 0x80

    if-eqz v2, :cond_2c

    .line 7
    sget-object v16, Landroidx/compose/material3/AssistChipDefaults;->INSTANCE:Landroidx/compose/material3/AssistChipDefaults;

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const-wide/16 v27, 0x0

    const-wide/16 v29, 0x0

    const-wide/16 v31, 0x0

    const/high16 v34, 0x6000000

    const/16 v35, 0xff

    move-object/from16 v33, v11

    invoke-virtual/range {v16 .. v35}, Landroidx/compose/material3/AssistChipDefaults;->elevatedAssistChipColors-oq7We08(JJJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipColors;

    move-result-object v2

    const v3, -0x1c00001

    and-int/2addr v1, v3

    move/from16 v17, v1

    move-object/from16 v16, v2

    goto :goto_21

    :cond_2c
    move/from16 v17, v1

    move-object/from16 v16, v3

    :goto_21
    and-int/lit16 v1, v12, 0x100

    if-eqz v1, :cond_2d

    .line 8
    sget-object v1, Landroidx/compose/material3/AssistChipDefaults;->INSTANCE:Landroidx/compose/material3/AssistChipDefaults;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/high16 v10, 0x180000

    const/16 v18, 0x3f

    move-object v8, v11

    move/from16 v48, p11

    move/from16 v19, v41

    move/from16 v20, v42

    move v9, v10

    move/from16 v10, v18

    invoke-virtual/range {v1 .. v10}, Landroidx/compose/material3/AssistChipDefaults;->elevatedAssistChipElevation-aqJV_2Y(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipElevation;

    move-result-object v1

    const v2, -0xe000001

    and-int v2, v17, v2

    move/from16 v17, v2

    goto :goto_22

    :cond_2d
    move/from16 v48, p11

    move/from16 v19, v41

    move/from16 v20, v42

    move-object/from16 v1, p8

    :goto_22
    if-eqz v19, :cond_2e

    move-object/from16 v2, v43

    goto :goto_23

    :cond_2e
    move-object/from16 v2, p9

    :goto_23
    if-eqz v20, :cond_30

    const v3, -0x1d58f75c

    .line 9
    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 10
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    .line 11
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v3, v4, :cond_2f

    .line 12
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-result-object v3

    .line 13
    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 14
    :cond_2f
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    check-cast v3, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-object/from16 v19, v0

    move-object/from16 v20, v1

    move-object v8, v2

    move-object/from16 v21, v3

    goto :goto_24

    :cond_30
    move-object/from16 v21, p10

    move-object/from16 v19, v0

    move-object/from16 v20, v1

    move-object v8, v2

    :goto_24
    move-object/from16 v9, v16

    move/from16 v1, v17

    move/from16 v10, v44

    :goto_25
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_31

    const-string v0, "androidx.compose.material3.ElevatedAssistChip (Chip.kt:176)"

    move/from16 v2, v48

    const v3, 0x4d3d05c2    # 1.9820445E8f

    .line 15
    invoke-static {v3, v1, v2, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_26

    :cond_31
    move/from16 v2, v48

    .line 16
    :goto_26
    sget-object v0, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    const/4 v3, 0x6

    invoke-virtual {v0, v11, v3}, Landroidx/compose/material3/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Typography;

    move-result-object v0

    sget-object v3, Landroidx/compose/material3/tokens/AssistChipTokens;->INSTANCE:Landroidx/compose/material3/tokens/AssistChipTokens;

    invoke-virtual {v3}, Landroidx/compose/material3/tokens/AssistChipTokens;->getLabelTextFont()Landroidx/compose/material3/tokens/TypographyKeyTokens;

    move-result-object v3

    invoke-static {v0, v3}, Landroidx/compose/material3/TypographyKt;->fromToken(Landroidx/compose/material3/Typography;Landroidx/compose/material3/tokens/TypographyKeyTokens;)Landroidx/compose/ui/text/TextStyle;

    move-result-object v4

    shr-int/lit8 v0, v1, 0x9

    and-int/lit8 v0, v0, 0xe

    shr-int/lit8 v3, v1, 0x12

    and-int/lit8 v3, v3, 0x70

    or-int/2addr v3, v0

    .line 17
    invoke-virtual {v9, v10, v11, v3}, Landroidx/compose/material3/ChipColors;->labelColor$material3_release(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v3

    invoke-interface {v3}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {v3}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v5

    .line 18
    sget-object v3, Landroidx/compose/material3/AssistChipDefaults;->INSTANCE:Landroidx/compose/material3/AssistChipDefaults;

    invoke-virtual {v3}, Landroidx/compose/material3/AssistChipDefaults;->getHeight-D9Ej5fM()F

    move-result v16

    .line 19
    sget-object v22, Landroidx/compose/material3/ChipKt;->AssistChipPadding:Landroidx/compose/foundation/layout/PaddingValues;

    const v3, -0xd8858eb

    .line 20
    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    if-nez v8, :cond_32

    move-object/from16 v0, v43

    goto :goto_27

    :cond_32
    shr-int/lit8 v3, v1, 0x18

    and-int/lit8 v3, v3, 0x70

    or-int/2addr v0, v3

    invoke-virtual {v8, v10, v11, v0}, Landroidx/compose/material3/ChipBorder;->borderStroke$material3_release(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v0

    :goto_27
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    if-eqz v0, :cond_33

    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/foundation/BorderStroke;

    move-object/from16 v43, v0

    :cond_33
    shr-int/lit8 v0, v1, 0x6

    and-int/lit8 v0, v0, 0xe

    shl-int/lit8 v3, v1, 0x3

    and-int/lit8 v3, v3, 0x70

    or-int/2addr v0, v3

    shr-int/lit8 v3, v1, 0x3

    and-int/lit16 v3, v3, 0x380

    or-int/2addr v0, v3

    shl-int/lit8 v3, v1, 0x6

    and-int/lit16 v7, v3, 0x1c00

    or-int/2addr v0, v7

    and-int v7, v3, v37

    or-int/2addr v0, v7

    and-int v7, v3, v38

    or-int/2addr v0, v7

    and-int v7, v3, v39

    or-int/2addr v0, v7

    and-int v3, v3, v40

    or-int v17, v0, v3

    shr-int/lit8 v0, v1, 0x18

    and-int/lit8 v0, v0, 0xe

    or-int/lit16 v0, v0, 0xd80

    shl-int/lit8 v1, v2, 0xc

    and-int v1, v1, v36

    or-int v18, v0, v1

    move-object/from16 v0, v19

    move-object/from16 v1, p0

    move v2, v10

    move-object/from16 v3, p1

    move-object/from16 v7, v45

    move-object/from16 v23, v8

    move-object/from16 v8, v46

    move-object/from16 v24, v9

    move-object/from16 v9, v47

    move/from16 v44, v10

    move-object/from16 v10, v24

    move-object/from16 v25, v11

    move-object/from16 v11, v20

    move-object/from16 v12, v43

    move/from16 v13, v16

    move-object/from16 v14, v22

    move-object/from16 v15, v21

    move-object/from16 v16, v25

    .line 21
    invoke-static/range {v0 .. v18}, Landroidx/compose/material3/ChipKt;->Chip-nkUnTEs(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_34

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_34
    move-object/from16 v3, v19

    move-object/from16 v9, v20

    move-object/from16 v11, v21

    move-object/from16 v10, v23

    move-object/from16 v8, v24

    move/from16 v4, v44

    move-object/from16 v5, v45

    move-object/from16 v6, v46

    move-object/from16 v7, v47

    .line 22
    :goto_28
    invoke-interface/range {v25 .. v25}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v15

    if-nez v15, :cond_35

    goto :goto_29

    :cond_35
    new-instance v14, Landroidx/compose/material3/ChipKt$ElevatedAssistChip$2;

    move-object v0, v14

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v12, p12

    move/from16 v13, p13

    move-object/from16 v49, v14

    move/from16 v14, p14

    invoke-direct/range {v0 .. v14}, Landroidx/compose/material3/ChipKt$ElevatedAssistChip$2;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/material3/ChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;III)V

    move-object/from16 v0, v49

    invoke-interface {v15, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :goto_29
    return-void
.end method

.method public static final ElevatedFilterChip(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/material3/SelectableChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V
    .locals 57
    .annotation runtime Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/graphics/Shape;",
            "Landroidx/compose/material3/SelectableChipColors;",
            "Landroidx/compose/material3/SelectableChipElevation;",
            "Landroidx/compose/material3/SelectableChipBorder;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    move/from16 v15, p0

    move-object/from16 v14, p1

    move-object/from16 v13, p2

    move/from16 v12, p13

    move/from16 v11, p15

    const-string v0, "onClick"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "label"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7185902d

    move-object/from16 v1, p12

    .line 1
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v10

    and-int/lit8 v1, v11, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v12, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v12, 0xe

    if-nez v1, :cond_2

    invoke-interface {v10, v15}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v12

    goto :goto_1

    :cond_2
    move v1, v12

    :goto_1
    and-int/lit8 v4, v11, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v12, 0x70

    if-nez v4, :cond_5

    invoke-interface {v10, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v1, v4

    :cond_5
    :goto_3
    and-int/lit8 v4, v11, 0x4

    if-eqz v4, :cond_6

    or-int/lit16 v1, v1, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v4, v12, 0x380

    if-nez v4, :cond_8

    invoke-interface {v10, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    const/16 v4, 0x100

    goto :goto_4

    :cond_7
    const/16 v4, 0x80

    :goto_4
    or-int/2addr v1, v4

    :cond_8
    :goto_5
    and-int/lit8 v4, v11, 0x8

    if-eqz v4, :cond_9

    or-int/lit16 v1, v1, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v7, v12, 0x1c00

    if-nez v7, :cond_b

    move-object/from16 v7, p3

    invoke-interface {v10, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_a

    const/16 v8, 0x800

    goto :goto_6

    :cond_a
    const/16 v8, 0x400

    :goto_6
    or-int/2addr v1, v8

    goto :goto_8

    :cond_b
    :goto_7
    move-object/from16 v7, p3

    :goto_8
    and-int/lit8 v8, v11, 0x10

    const v45, 0xe000

    if-eqz v8, :cond_c

    or-int/lit16 v1, v1, 0x6000

    goto :goto_a

    :cond_c
    and-int v9, v12, v45

    if-nez v9, :cond_e

    move/from16 v9, p4

    invoke-interface {v10, v9}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v16

    if-eqz v16, :cond_d

    const/16 v16, 0x4000

    goto :goto_9

    :cond_d
    const/16 v16, 0x2000

    :goto_9
    or-int v1, v1, v16

    goto :goto_b

    :cond_e
    :goto_a
    move/from16 v9, p4

    :goto_b
    and-int/lit8 v16, v11, 0x20

    const/high16 v46, 0x70000

    if-eqz v16, :cond_f

    const/high16 v17, 0x30000

    or-int v1, v1, v17

    move-object/from16 v2, p5

    goto :goto_d

    :cond_f
    and-int v17, v12, v46

    move-object/from16 v2, p5

    if-nez v17, :cond_11

    invoke-interface {v10, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_10

    const/high16 v17, 0x20000

    goto :goto_c

    :cond_10
    const/high16 v17, 0x10000

    :goto_c
    or-int v1, v1, v17

    :cond_11
    :goto_d
    and-int/lit8 v17, v11, 0x40

    const/high16 v47, 0x380000

    if-eqz v17, :cond_12

    const/high16 v18, 0x180000

    or-int v1, v1, v18

    move-object/from16 v3, p6

    goto :goto_f

    :cond_12
    and-int v18, v12, v47

    move-object/from16 v3, p6

    if-nez v18, :cond_14

    invoke-interface {v10, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_13

    const/high16 v19, 0x100000

    goto :goto_e

    :cond_13
    const/high16 v19, 0x80000

    :goto_e
    or-int v1, v1, v19

    :cond_14
    :goto_f
    const/high16 v19, 0x1c00000

    and-int v19, v12, v19

    if-nez v19, :cond_17

    and-int/lit16 v5, v11, 0x80

    if-nez v5, :cond_15

    move-object/from16 v5, p7

    invoke-interface {v10, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_16

    const/high16 v20, 0x800000

    goto :goto_10

    :cond_15
    move-object/from16 v5, p7

    :cond_16
    const/high16 v20, 0x400000

    :goto_10
    or-int v1, v1, v20

    goto :goto_11

    :cond_17
    move-object/from16 v5, p7

    :goto_11
    const/high16 v20, 0xe000000

    and-int v20, v12, v20

    if-nez v20, :cond_1a

    and-int/lit16 v6, v11, 0x100

    if-nez v6, :cond_18

    move-object/from16 v6, p8

    invoke-interface {v10, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_19

    const/high16 v21, 0x4000000

    goto :goto_12

    :cond_18
    move-object/from16 v6, p8

    :cond_19
    const/high16 v21, 0x2000000

    :goto_12
    or-int v1, v1, v21

    goto :goto_13

    :cond_1a
    move-object/from16 v6, p8

    :goto_13
    const/high16 v21, 0x70000000

    and-int v21, v12, v21

    if-nez v21, :cond_1d

    and-int/lit16 v0, v11, 0x200

    if-nez v0, :cond_1b

    move-object/from16 v0, p9

    invoke-interface {v10, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_1c

    const/high16 v21, 0x20000000

    goto :goto_14

    :cond_1b
    move-object/from16 v0, p9

    :cond_1c
    const/high16 v21, 0x10000000

    :goto_14
    or-int v1, v1, v21

    goto :goto_15

    :cond_1d
    move-object/from16 v0, p9

    :goto_15
    and-int/lit16 v9, v11, 0x400

    if-eqz v9, :cond_1e

    or-int/lit8 v18, p14, 0x6

    move/from16 v48, v9

    move-object/from16 v9, p10

    goto :goto_17

    :cond_1e
    and-int/lit8 v21, p14, 0xe

    move/from16 v48, v9

    move-object/from16 v9, p10

    if-nez v21, :cond_20

    invoke-interface {v10, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_1f

    const/16 v18, 0x4

    goto :goto_16

    :cond_1f
    const/16 v18, 0x2

    :goto_16
    or-int v18, p14, v18

    goto :goto_17

    :cond_20
    move/from16 v18, p14

    :goto_17
    and-int/lit16 v9, v11, 0x800

    if-eqz v9, :cond_21

    or-int/lit8 v18, v18, 0x30

    move/from16 p12, v9

    goto :goto_19

    :cond_21
    and-int/lit8 v21, p14, 0x70

    move/from16 p12, v9

    move-object/from16 v9, p11

    if-nez v21, :cond_23

    invoke-interface {v10, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_22

    const/16 v19, 0x20

    goto :goto_18

    :cond_22
    const/16 v19, 0x10

    :goto_18
    or-int v18, v18, v19

    :cond_23
    :goto_19
    move/from16 v9, v18

    const v18, 0x5b6db6db

    and-int v0, v1, v18

    const v2, 0x12492492

    if-ne v0, v2, :cond_25

    and-int/lit8 v0, v9, 0x5b

    const/16 v2, 0x12

    if-ne v0, v2, :cond_25

    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_24

    goto :goto_1a

    .line 2
    :cond_24
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object v8, v5

    move-object v9, v6

    move-object v4, v7

    move-object/from16 v25, v10

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v10, p9

    move-object v7, v3

    goto/16 :goto_28

    .line 3
    :cond_25
    :goto_1a
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v0, v12, 0x1

    const/16 v49, 0x0

    const/4 v2, 0x6

    if-eqz v0, :cond_2a

    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v0

    if-eqz v0, :cond_26

    goto :goto_1b

    .line 4
    :cond_26
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit16 v0, v11, 0x80

    if-eqz v0, :cond_27

    const v0, -0x1c00001

    and-int/2addr v1, v0

    :cond_27
    and-int/lit16 v0, v11, 0x100

    if-eqz v0, :cond_28

    const v0, -0xe000001

    and-int/2addr v1, v0

    :cond_28
    and-int/lit16 v0, v11, 0x200

    if-eqz v0, :cond_29

    const v0, -0x70000001

    and-int/2addr v1, v0

    :cond_29
    move-object/from16 v51, p5

    move-object/from16 v21, p9

    move-object/from16 v22, p11

    move-object/from16 v52, v3

    move-object/from16 v53, v5

    move-object/from16 v20, v6

    move-object/from16 v19, v7

    move/from16 v54, v9

    move-object v14, v10

    move/from16 v10, p4

    move-object/from16 v9, p10

    goto/16 :goto_25

    :cond_2a
    :goto_1b
    if-eqz v4, :cond_2b

    .line 5
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    goto :goto_1c

    :cond_2b
    move-object v0, v7

    :goto_1c
    if-eqz v8, :cond_2c

    const/4 v4, 0x1

    move/from16 v50, v4

    goto :goto_1d

    :cond_2c
    move/from16 v50, p4

    :goto_1d
    if-eqz v16, :cond_2d

    move-object/from16 v51, v49

    goto :goto_1e

    :cond_2d
    move-object/from16 v51, p5

    :goto_1e
    if-eqz v17, :cond_2e

    move-object/from16 v52, v49

    goto :goto_1f

    :cond_2e
    move-object/from16 v52, v3

    :goto_1f
    and-int/lit16 v3, v11, 0x80

    if-eqz v3, :cond_2f

    .line 6
    sget-object v3, Landroidx/compose/material3/FilterChipDefaults;->INSTANCE:Landroidx/compose/material3/FilterChipDefaults;

    invoke-virtual {v3, v10, v2}, Landroidx/compose/material3/FilterChipDefaults;->getShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    move-result-object v3

    const v4, -0x1c00001

    and-int/2addr v1, v4

    move-object/from16 v53, v3

    goto :goto_20

    :cond_2f
    move-object/from16 v53, v5

    :goto_20
    and-int/lit16 v3, v11, 0x100

    if-eqz v3, :cond_30

    .line 7
    sget-object v16, Landroidx/compose/material3/FilterChipDefaults;->INSTANCE:Landroidx/compose/material3/FilterChipDefaults;

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const-wide/16 v27, 0x0

    const-wide/16 v29, 0x0

    const-wide/16 v31, 0x0

    const-wide/16 v33, 0x0

    const-wide/16 v35, 0x0

    const-wide/16 v37, 0x0

    const-wide/16 v39, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x180

    const/16 v44, 0xfff

    move-object/from16 v41, v10

    invoke-virtual/range {v16 .. v44}, Landroidx/compose/material3/FilterChipDefaults;->elevatedFilterChipColors-XqyqHi0(JJJJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SelectableChipColors;

    move-result-object v3

    const v4, -0xe000001

    and-int/2addr v1, v4

    move/from16 v17, v1

    move-object/from16 v16, v3

    goto :goto_21

    :cond_30
    move/from16 v17, v1

    move-object/from16 v16, v6

    :goto_21
    and-int/lit16 v1, v11, 0x200

    if-eqz v1, :cond_31

    .line 8
    sget-object v1, Landroidx/compose/material3/FilterChipDefaults;->INSTANCE:Landroidx/compose/material3/FilterChipDefaults;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/high16 v18, 0x180000

    const/16 v19, 0x3f

    move v2, v3

    move v3, v4

    move v4, v5

    move v5, v6

    move v6, v7

    move v7, v8

    move-object v8, v10

    move/from16 v21, p12

    move/from16 v54, v9

    move/from16 v20, v48

    move/from16 v9, v18

    move-object v14, v10

    move/from16 v10, v19

    invoke-virtual/range {v1 .. v10}, Landroidx/compose/material3/FilterChipDefaults;->elevatedFilterChipElevation-aqJV_2Y(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SelectableChipElevation;

    move-result-object v1

    const v2, -0x70000001

    and-int v2, v17, v2

    move/from16 v17, v2

    goto :goto_22

    :cond_31
    move/from16 v21, p12

    move/from16 v54, v9

    move-object v14, v10

    move/from16 v20, v48

    move-object/from16 v1, p9

    :goto_22
    if-eqz v20, :cond_32

    move-object/from16 v2, v49

    goto :goto_23

    :cond_32
    move-object/from16 v2, p10

    :goto_23
    if-eqz v21, :cond_34

    const v3, -0x1d58f75c

    .line 9
    invoke-interface {v14, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 10
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v3

    .line 11
    sget-object v4, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v4}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v4

    if-ne v3, v4, :cond_33

    .line 12
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-result-object v3

    .line 13
    invoke-interface {v14, v3}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 14
    :cond_33
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    check-cast v3, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-object/from16 v19, v0

    move-object/from16 v21, v1

    move-object v9, v2

    move-object/from16 v22, v3

    goto :goto_24

    :cond_34
    move-object/from16 v22, p11

    move-object/from16 v19, v0

    move-object/from16 v21, v1

    move-object v9, v2

    :goto_24
    move-object/from16 v20, v16

    move/from16 v1, v17

    move/from16 v10, v50

    :goto_25
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_35

    const-string v0, "androidx.compose.material3.ElevatedFilterChip (Chip.kt:337)"

    move/from16 v2, v54

    const v3, 0x7185902d

    .line 15
    invoke-static {v3, v1, v2, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    goto :goto_26

    :cond_35
    move/from16 v2, v54

    .line 16
    :goto_26
    sget-object v0, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    const/4 v3, 0x6

    invoke-virtual {v0, v14, v3}, Landroidx/compose/material3/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Typography;

    move-result-object v0

    sget-object v3, Landroidx/compose/material3/tokens/FilterChipTokens;->INSTANCE:Landroidx/compose/material3/tokens/FilterChipTokens;

    invoke-virtual {v3}, Landroidx/compose/material3/tokens/FilterChipTokens;->getLabelTextFont()Landroidx/compose/material3/tokens/TypographyKeyTokens;

    move-result-object v3

    invoke-static {v0, v3}, Landroidx/compose/material3/TypographyKt;->fromToken(Landroidx/compose/material3/Typography;Landroidx/compose/material3/tokens/TypographyKeyTokens;)Landroidx/compose/ui/text/TextStyle;

    move-result-object v5

    .line 17
    sget-object v0, Landroidx/compose/material3/FilterChipDefaults;->INSTANCE:Landroidx/compose/material3/FilterChipDefaults;

    invoke-virtual {v0}, Landroidx/compose/material3/FilterChipDefaults;->getHeight-D9Ej5fM()F

    move-result v16

    .line 18
    sget-object v23, Landroidx/compose/material3/ChipKt;->FilterChipPadding:Landroidx/compose/foundation/layout/PaddingValues;

    const v0, -0x2f22303e

    .line 19
    invoke-interface {v14, v0}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    if-nez v9, :cond_36

    move-object/from16 v0, v49

    goto :goto_27

    :cond_36
    shr-int/lit8 v0, v1, 0xc

    and-int/lit8 v0, v0, 0xe

    shl-int/lit8 v3, v1, 0x3

    and-int/lit8 v3, v3, 0x70

    or-int/2addr v0, v3

    shl-int/lit8 v3, v2, 0x6

    and-int/lit16 v3, v3, 0x380

    or-int/2addr v0, v3

    invoke-virtual {v9, v10, v15, v14, v0}, Landroidx/compose/material3/SelectableChipBorder;->borderStroke$material3_release(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v0

    :goto_27
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    if-eqz v0, :cond_37

    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/foundation/BorderStroke;

    move-object/from16 v49, v0

    :cond_37
    const/4 v7, 0x0

    and-int/lit8 v0, v1, 0xe

    const/high16 v3, 0xc00000

    or-int/2addr v0, v3

    shr-int/lit8 v3, v1, 0x6

    and-int/lit8 v3, v3, 0x70

    or-int/2addr v0, v3

    shl-int/lit8 v3, v1, 0x3

    and-int/lit16 v4, v3, 0x380

    or-int/2addr v0, v4

    shr-int/lit8 v4, v1, 0x3

    and-int/lit16 v4, v4, 0x1c00

    or-int/2addr v0, v4

    shl-int/lit8 v4, v1, 0x6

    and-int v6, v4, v45

    or-int/2addr v0, v6

    and-int v3, v3, v47

    or-int/2addr v0, v3

    const/high16 v3, 0xe000000

    and-int/2addr v3, v4

    or-int/2addr v0, v3

    const/high16 v3, 0x70000000

    and-int/2addr v3, v4

    or-int v17, v0, v3

    shr-int/lit8 v0, v1, 0x18

    and-int/lit8 v1, v0, 0xe

    or-int/lit16 v1, v1, 0x6c00

    and-int/lit8 v0, v0, 0x70

    or-int/2addr v0, v1

    shl-int/lit8 v1, v2, 0xc

    and-int v1, v1, v46

    or-int v18, v0, v1

    move/from16 v0, p0

    move-object/from16 v1, v19

    move-object/from16 v2, p1

    move v3, v10

    move-object/from16 v4, p2

    move-object/from16 v6, v51

    move-object/from16 v8, v52

    move-object/from16 v24, v9

    move-object/from16 v9, v53

    move/from16 v50, v10

    move-object/from16 v10, v20

    move-object/from16 v11, v21

    move-object/from16 v12, v49

    move/from16 v13, v16

    move-object/from16 v25, v14

    move-object/from16 v14, v23

    move-object/from16 v15, v22

    move-object/from16 v16, v25

    .line 20
    invoke-static/range {v0 .. v18}, Landroidx/compose/material3/ChipKt;->SelectableChip-u0RnIRE(ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_38

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_38
    move-object/from16 v4, v19

    move-object/from16 v9, v20

    move-object/from16 v10, v21

    move-object/from16 v12, v22

    move-object/from16 v11, v24

    move/from16 v5, v50

    move-object/from16 v6, v51

    move-object/from16 v7, v52

    move-object/from16 v8, v53

    .line 21
    :goto_28
    invoke-interface/range {v25 .. v25}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v15

    if-nez v15, :cond_39

    goto :goto_29

    :cond_39
    new-instance v14, Landroidx/compose/material3/ChipKt$ElevatedFilterChip$2;

    move-object v0, v14

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v13, p13

    move-object/from16 v55, v14

    move/from16 v14, p14

    move-object/from16 v56, v15

    move/from16 v15, p15

    invoke-direct/range {v0 .. v15}, Landroidx/compose/material3/ChipKt$ElevatedFilterChip$2;-><init>(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/material3/SelectableChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;III)V

    move-object/from16 v1, v55

    move-object/from16 v0, v56

    invoke-interface {v0, v1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :goto_29
    return-void
.end method

.method public static final ElevatedSuggestionChip(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/material3/ChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V
    .locals 42
    .annotation runtime Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/graphics/Shape;",
            "Landroidx/compose/material3/ChipColors;",
            "Landroidx/compose/material3/ChipElevation;",
            "Landroidx/compose/material3/ChipBorder;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1
    move-object/from16 v15, p0

    .line 2
    .line 3
    move-object/from16 v14, p1

    .line 4
    .line 5
    move/from16 v13, p11

    .line 6
    .line 7
    move/from16 v12, p12

    .line 8
    .line 9
    const-string v0, "onClick"

    .line 10
    .line 11
    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "label"

    .line 15
    .line 16
    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const v0, 0x637721bb

    .line 20
    .line 21
    .line 22
    move-object/from16 v1, p10

    .line 23
    .line 24
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 25
    .line 26
    .line 27
    move-result-object v11

    .line 28
    and-int/lit8 v1, v12, 0x1

    .line 29
    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    or-int/lit8 v1, v13, 0x6

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    and-int/lit8 v1, v13, 0xe

    .line 36
    .line 37
    if-nez v1, :cond_2

    .line 38
    .line 39
    invoke-interface {v11, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    const/4 v1, 0x4

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const/4 v1, 0x2

    .line 48
    :goto_0
    or-int/2addr v1, v13

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    move v1, v13

    .line 51
    :goto_1
    and-int/lit8 v2, v12, 0x2

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    or-int/lit8 v1, v1, 0x30

    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_3
    and-int/lit8 v2, v13, 0x70

    .line 59
    .line 60
    if-nez v2, :cond_5

    .line 61
    .line 62
    invoke-interface {v11, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-eqz v2, :cond_4

    .line 67
    .line 68
    const/16 v2, 0x20

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_4
    const/16 v2, 0x10

    .line 72
    .line 73
    :goto_2
    or-int/2addr v1, v2

    .line 74
    :cond_5
    :goto_3
    and-int/lit8 v2, v12, 0x4

    .line 75
    .line 76
    if-eqz v2, :cond_6

    .line 77
    .line 78
    or-int/lit16 v1, v1, 0x180

    .line 79
    .line 80
    goto :goto_5

    .line 81
    :cond_6
    and-int/lit16 v3, v13, 0x380

    .line 82
    .line 83
    if-nez v3, :cond_8

    .line 84
    .line 85
    move-object/from16 v3, p2

    .line 86
    .line 87
    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    if-eqz v4, :cond_7

    .line 92
    .line 93
    const/16 v4, 0x100

    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_7
    const/16 v4, 0x80

    .line 97
    .line 98
    :goto_4
    or-int/2addr v1, v4

    .line 99
    goto :goto_6

    .line 100
    :cond_8
    :goto_5
    move-object/from16 v3, p2

    .line 101
    .line 102
    :goto_6
    and-int/lit8 v4, v12, 0x8

    .line 103
    .line 104
    if-eqz v4, :cond_9

    .line 105
    .line 106
    or-int/lit16 v1, v1, 0xc00

    .line 107
    .line 108
    goto :goto_8

    .line 109
    :cond_9
    and-int/lit16 v5, v13, 0x1c00

    .line 110
    .line 111
    if-nez v5, :cond_b

    .line 112
    .line 113
    move/from16 v5, p3

    .line 114
    .line 115
    invoke-interface {v11, v5}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 116
    .line 117
    .line 118
    move-result v6

    .line 119
    if-eqz v6, :cond_a

    .line 120
    .line 121
    const/16 v6, 0x800

    .line 122
    .line 123
    goto :goto_7

    .line 124
    :cond_a
    const/16 v6, 0x400

    .line 125
    .line 126
    :goto_7
    or-int/2addr v1, v6

    .line 127
    goto :goto_9

    .line 128
    :cond_b
    :goto_8
    move/from16 v5, p3

    .line 129
    .line 130
    :goto_9
    and-int/lit8 v6, v12, 0x10

    .line 131
    .line 132
    const v32, 0xe000

    .line 133
    .line 134
    .line 135
    if-eqz v6, :cond_c

    .line 136
    .line 137
    or-int/lit16 v1, v1, 0x6000

    .line 138
    .line 139
    goto :goto_b

    .line 140
    :cond_c
    and-int v7, v13, v32

    .line 141
    .line 142
    if-nez v7, :cond_e

    .line 143
    .line 144
    move-object/from16 v7, p4

    .line 145
    .line 146
    invoke-interface {v11, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v8

    .line 150
    if-eqz v8, :cond_d

    .line 151
    .line 152
    const/16 v8, 0x4000

    .line 153
    .line 154
    goto :goto_a

    .line 155
    :cond_d
    const/16 v8, 0x2000

    .line 156
    .line 157
    :goto_a
    or-int/2addr v1, v8

    .line 158
    goto :goto_c

    .line 159
    :cond_e
    :goto_b
    move-object/from16 v7, p4

    .line 160
    .line 161
    :goto_c
    const/high16 v8, 0x70000

    .line 162
    .line 163
    and-int/2addr v8, v13

    .line 164
    if-nez v8, :cond_11

    .line 165
    .line 166
    and-int/lit8 v8, v12, 0x20

    .line 167
    .line 168
    if-nez v8, :cond_f

    .line 169
    .line 170
    move-object/from16 v8, p5

    .line 171
    .line 172
    invoke-interface {v11, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v9

    .line 176
    if-eqz v9, :cond_10

    .line 177
    .line 178
    const/high16 v9, 0x20000

    .line 179
    .line 180
    goto :goto_d

    .line 181
    :cond_f
    move-object/from16 v8, p5

    .line 182
    .line 183
    :cond_10
    const/high16 v9, 0x10000

    .line 184
    .line 185
    :goto_d
    or-int/2addr v1, v9

    .line 186
    goto :goto_e

    .line 187
    :cond_11
    move-object/from16 v8, p5

    .line 188
    .line 189
    :goto_e
    const/high16 v33, 0x380000

    .line 190
    .line 191
    and-int v9, v13, v33

    .line 192
    .line 193
    if-nez v9, :cond_14

    .line 194
    .line 195
    and-int/lit8 v9, v12, 0x40

    .line 196
    .line 197
    if-nez v9, :cond_12

    .line 198
    .line 199
    move-object/from16 v9, p6

    .line 200
    .line 201
    invoke-interface {v11, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v10

    .line 205
    if-eqz v10, :cond_13

    .line 206
    .line 207
    const/high16 v10, 0x100000

    .line 208
    .line 209
    goto :goto_f

    .line 210
    :cond_12
    move-object/from16 v9, p6

    .line 211
    .line 212
    :cond_13
    const/high16 v10, 0x80000

    .line 213
    .line 214
    :goto_f
    or-int/2addr v1, v10

    .line 215
    goto :goto_10

    .line 216
    :cond_14
    move-object/from16 v9, p6

    .line 217
    .line 218
    :goto_10
    const/high16 v10, 0x1c00000

    .line 219
    .line 220
    and-int/2addr v10, v13

    .line 221
    if-nez v10, :cond_17

    .line 222
    .line 223
    and-int/lit16 v10, v12, 0x80

    .line 224
    .line 225
    if-nez v10, :cond_15

    .line 226
    .line 227
    move-object/from16 v10, p7

    .line 228
    .line 229
    invoke-interface {v11, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result v16

    .line 233
    if-eqz v16, :cond_16

    .line 234
    .line 235
    const/high16 v16, 0x800000

    .line 236
    .line 237
    goto :goto_11

    .line 238
    :cond_15
    move-object/from16 v10, p7

    .line 239
    .line 240
    :cond_16
    const/high16 v16, 0x400000

    .line 241
    .line 242
    :goto_11
    or-int v1, v1, v16

    .line 243
    .line 244
    goto :goto_12

    .line 245
    :cond_17
    move-object/from16 v10, p7

    .line 246
    .line 247
    :goto_12
    and-int/lit16 v0, v12, 0x100

    .line 248
    .line 249
    const/high16 v34, 0xe000000

    .line 250
    .line 251
    if-eqz v0, :cond_18

    .line 252
    .line 253
    const/high16 v16, 0x6000000

    .line 254
    .line 255
    or-int v1, v1, v16

    .line 256
    .line 257
    move-object/from16 v10, p8

    .line 258
    .line 259
    goto :goto_14

    .line 260
    :cond_18
    and-int v16, v13, v34

    .line 261
    .line 262
    move-object/from16 v10, p8

    .line 263
    .line 264
    if-nez v16, :cond_1a

    .line 265
    .line 266
    invoke-interface {v11, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move-result v16

    .line 270
    if-eqz v16, :cond_19

    .line 271
    .line 272
    const/high16 v16, 0x4000000

    .line 273
    .line 274
    goto :goto_13

    .line 275
    :cond_19
    const/high16 v16, 0x2000000

    .line 276
    .line 277
    :goto_13
    or-int v1, v1, v16

    .line 278
    .line 279
    :cond_1a
    :goto_14
    and-int/lit16 v10, v12, 0x200

    .line 280
    .line 281
    const/high16 v35, 0x70000000

    .line 282
    .line 283
    if-eqz v10, :cond_1b

    .line 284
    .line 285
    const/high16 v16, 0x30000000

    .line 286
    .line 287
    or-int v1, v1, v16

    .line 288
    .line 289
    move/from16 p10, v10

    .line 290
    .line 291
    move-object/from16 v10, p9

    .line 292
    .line 293
    goto :goto_16

    .line 294
    :cond_1b
    and-int v16, v13, v35

    .line 295
    .line 296
    move/from16 p10, v10

    .line 297
    .line 298
    move-object/from16 v10, p9

    .line 299
    .line 300
    if-nez v16, :cond_1d

    .line 301
    .line 302
    invoke-interface {v11, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    move-result v16

    .line 306
    if-eqz v16, :cond_1c

    .line 307
    .line 308
    const/high16 v16, 0x20000000

    .line 309
    .line 310
    goto :goto_15

    .line 311
    :cond_1c
    const/high16 v16, 0x10000000

    .line 312
    .line 313
    :goto_15
    or-int v1, v1, v16

    .line 314
    .line 315
    :cond_1d
    :goto_16
    const v16, 0x5b6db6db

    .line 316
    .line 317
    .line 318
    and-int v3, v1, v16

    .line 319
    .line 320
    const v5, 0x12492492

    .line 321
    .line 322
    .line 323
    if-ne v3, v5, :cond_1f

    .line 324
    .line 325
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 326
    .line 327
    .line 328
    move-result v3

    .line 329
    if-nez v3, :cond_1e

    .line 330
    .line 331
    goto :goto_17

    .line 332
    :cond_1e
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 333
    .line 334
    .line 335
    move-object/from16 v3, p2

    .line 336
    .line 337
    move/from16 v4, p3

    .line 338
    .line 339
    move-object v5, v7

    .line 340
    move-object v6, v8

    .line 341
    move-object v7, v9

    .line 342
    move-object/from16 v24, v11

    .line 343
    .line 344
    move-object/from16 v8, p7

    .line 345
    .line 346
    move-object/from16 v9, p8

    .line 347
    .line 348
    goto/16 :goto_24

    .line 349
    .line 350
    :cond_1f
    :goto_17
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 351
    .line 352
    .line 353
    and-int/lit8 v3, v13, 0x1

    .line 354
    .line 355
    const v36, -0x1c00001

    .line 356
    .line 357
    .line 358
    const v5, -0x380001

    .line 359
    .line 360
    .line 361
    const v16, -0x70001

    .line 362
    .line 363
    .line 364
    const/16 v37, 0x0

    .line 365
    .line 366
    const/4 v10, 0x6

    .line 367
    if-eqz v3, :cond_24

    .line 368
    .line 369
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 370
    .line 371
    .line 372
    move-result v3

    .line 373
    if-eqz v3, :cond_20

    .line 374
    .line 375
    goto :goto_18

    .line 376
    :cond_20
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 377
    .line 378
    .line 379
    and-int/lit8 v0, v12, 0x20

    .line 380
    .line 381
    if-eqz v0, :cond_21

    .line 382
    .line 383
    and-int v1, v1, v16

    .line 384
    .line 385
    :cond_21
    and-int/lit8 v0, v12, 0x40

    .line 386
    .line 387
    if-eqz v0, :cond_22

    .line 388
    .line 389
    and-int/2addr v1, v5

    .line 390
    :cond_22
    and-int/lit16 v0, v12, 0x80

    .line 391
    .line 392
    if-eqz v0, :cond_23

    .line 393
    .line 394
    and-int v1, v1, v36

    .line 395
    .line 396
    :cond_23
    move-object/from16 v38, p2

    .line 397
    .line 398
    move-object/from16 v19, p7

    .line 399
    .line 400
    move-object/from16 v20, p9

    .line 401
    .line 402
    move-object/from16 v40, v7

    .line 403
    .line 404
    move-object/from16 v41, v8

    .line 405
    .line 406
    move v12, v10

    .line 407
    move/from16 v10, p3

    .line 408
    .line 409
    move-object/from16 v7, p8

    .line 410
    .line 411
    goto/16 :goto_21

    .line 412
    .line 413
    :cond_24
    :goto_18
    if-eqz v2, :cond_25

    .line 414
    .line 415
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 416
    .line 417
    move-object/from16 v38, v2

    .line 418
    .line 419
    goto :goto_19

    .line 420
    :cond_25
    move-object/from16 v38, p2

    .line 421
    .line 422
    :goto_19
    if-eqz v4, :cond_26

    .line 423
    .line 424
    const/4 v2, 0x1

    .line 425
    move/from16 v39, v2

    .line 426
    .line 427
    goto :goto_1a

    .line 428
    :cond_26
    move/from16 v39, p3

    .line 429
    .line 430
    :goto_1a
    if-eqz v6, :cond_27

    .line 431
    .line 432
    move-object/from16 v40, v37

    .line 433
    .line 434
    goto :goto_1b

    .line 435
    :cond_27
    move-object/from16 v40, v7

    .line 436
    .line 437
    :goto_1b
    and-int/lit8 v2, v12, 0x20

    .line 438
    .line 439
    if-eqz v2, :cond_28

    .line 440
    .line 441
    sget-object v2, Landroidx/compose/material3/SuggestionChipDefaults;->INSTANCE:Landroidx/compose/material3/SuggestionChipDefaults;

    .line 442
    .line 443
    invoke-virtual {v2, v11, v10}, Landroidx/compose/material3/SuggestionChipDefaults;->getShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    .line 444
    .line 445
    .line 446
    move-result-object v2

    .line 447
    and-int v1, v1, v16

    .line 448
    .line 449
    move-object/from16 v41, v2

    .line 450
    .line 451
    goto :goto_1c

    .line 452
    :cond_28
    move-object/from16 v41, v8

    .line 453
    .line 454
    :goto_1c
    and-int/lit8 v2, v12, 0x40

    .line 455
    .line 456
    if-eqz v2, :cond_29

    .line 457
    .line 458
    sget-object v16, Landroidx/compose/material3/SuggestionChipDefaults;->INSTANCE:Landroidx/compose/material3/SuggestionChipDefaults;

    .line 459
    .line 460
    const-wide/16 v17, 0x0

    .line 461
    .line 462
    const-wide/16 v19, 0x0

    .line 463
    .line 464
    const-wide/16 v21, 0x0

    .line 465
    .line 466
    const-wide/16 v23, 0x0

    .line 467
    .line 468
    const-wide/16 v25, 0x0

    .line 469
    .line 470
    const-wide/16 v27, 0x0

    .line 471
    .line 472
    const/high16 v30, 0x180000

    .line 473
    .line 474
    const/16 v31, 0x3f

    .line 475
    .line 476
    move-object/from16 v29, v11

    .line 477
    .line 478
    invoke-virtual/range {v16 .. v31}, Landroidx/compose/material3/SuggestionChipDefaults;->elevatedSuggestionChipColors-5tl4gsc(JJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipColors;

    .line 479
    .line 480
    .line 481
    move-result-object v2

    .line 482
    and-int/2addr v1, v5

    .line 483
    move/from16 v17, v1

    .line 484
    .line 485
    move-object/from16 v16, v2

    .line 486
    .line 487
    goto :goto_1d

    .line 488
    :cond_29
    move/from16 v17, v1

    .line 489
    .line 490
    move-object/from16 v16, v9

    .line 491
    .line 492
    :goto_1d
    and-int/lit16 v1, v12, 0x80

    .line 493
    .line 494
    if-eqz v1, :cond_2a

    .line 495
    .line 496
    sget-object v1, Landroidx/compose/material3/SuggestionChipDefaults;->INSTANCE:Landroidx/compose/material3/SuggestionChipDefaults;

    .line 497
    .line 498
    const/4 v2, 0x0

    .line 499
    const/4 v3, 0x0

    .line 500
    const/4 v4, 0x0

    .line 501
    const/4 v5, 0x0

    .line 502
    const/4 v6, 0x0

    .line 503
    const/4 v7, 0x0

    .line 504
    const/high16 v9, 0x180000

    .line 505
    .line 506
    const/16 v18, 0x3f

    .line 507
    .line 508
    move-object v8, v11

    .line 509
    move/from16 v19, p10

    .line 510
    .line 511
    move v12, v10

    .line 512
    move/from16 v10, v18

    .line 513
    .line 514
    invoke-virtual/range {v1 .. v10}, Landroidx/compose/material3/SuggestionChipDefaults;->elevatedSuggestionChipElevation-aqJV_2Y(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipElevation;

    .line 515
    .line 516
    .line 517
    move-result-object v1

    .line 518
    and-int v2, v17, v36

    .line 519
    .line 520
    move/from16 v17, v2

    .line 521
    .line 522
    goto :goto_1e

    .line 523
    :cond_2a
    move/from16 v19, p10

    .line 524
    .line 525
    move v12, v10

    .line 526
    move-object/from16 v1, p7

    .line 527
    .line 528
    :goto_1e
    if-eqz v0, :cond_2b

    .line 529
    .line 530
    move-object/from16 v0, v37

    .line 531
    .line 532
    goto :goto_1f

    .line 533
    :cond_2b
    move-object/from16 v0, p8

    .line 534
    .line 535
    :goto_1f
    if-eqz v19, :cond_2d

    .line 536
    .line 537
    const v2, -0x1d58f75c

    .line 538
    .line 539
    .line 540
    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 541
    .line 542
    .line 543
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v2

    .line 547
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 548
    .line 549
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 550
    .line 551
    .line 552
    move-result-object v3

    .line 553
    if-ne v2, v3, :cond_2c

    .line 554
    .line 555
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 556
    .line 557
    .line 558
    move-result-object v2

    .line 559
    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 560
    .line 561
    .line 562
    :cond_2c
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 563
    .line 564
    .line 565
    check-cast v2, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 566
    .line 567
    move-object v7, v0

    .line 568
    move-object/from16 v19, v1

    .line 569
    .line 570
    move-object/from16 v20, v2

    .line 571
    .line 572
    goto :goto_20

    .line 573
    :cond_2d
    move-object/from16 v20, p9

    .line 574
    .line 575
    move-object v7, v0

    .line 576
    move-object/from16 v19, v1

    .line 577
    .line 578
    :goto_20
    move-object/from16 v9, v16

    .line 579
    .line 580
    move/from16 v1, v17

    .line 581
    .line 582
    move/from16 v10, v39

    .line 583
    .line 584
    :goto_21
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 585
    .line 586
    .line 587
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 588
    .line 589
    .line 590
    move-result v0

    .line 591
    if-eqz v0, :cond_2e

    .line 592
    .line 593
    const/4 v0, -0x1

    .line 594
    const-string v2, "androidx.compose.material3.ElevatedSuggestionChip (Chip.kt:589)"

    .line 595
    .line 596
    const v3, 0x637721bb

    .line 597
    .line 598
    .line 599
    invoke-static {v3, v1, v0, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 600
    .line 601
    .line 602
    :cond_2e
    sget-object v0, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    .line 603
    .line 604
    invoke-virtual {v0, v11, v12}, Landroidx/compose/material3/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Typography;

    .line 605
    .line 606
    .line 607
    move-result-object v0

    .line 608
    sget-object v2, Landroidx/compose/material3/tokens/SuggestionChipTokens;->INSTANCE:Landroidx/compose/material3/tokens/SuggestionChipTokens;

    .line 609
    .line 610
    invoke-virtual {v2}, Landroidx/compose/material3/tokens/SuggestionChipTokens;->getLabelTextFont()Landroidx/compose/material3/tokens/TypographyKeyTokens;

    .line 611
    .line 612
    .line 613
    move-result-object v2

    .line 614
    invoke-static {v0, v2}, Landroidx/compose/material3/TypographyKt;->fromToken(Landroidx/compose/material3/Typography;Landroidx/compose/material3/tokens/TypographyKeyTokens;)Landroidx/compose/ui/text/TextStyle;

    .line 615
    .line 616
    .line 617
    move-result-object v4

    .line 618
    shr-int/lit8 v0, v1, 0x9

    .line 619
    .line 620
    and-int/lit8 v0, v0, 0xe

    .line 621
    .line 622
    shr-int/lit8 v2, v1, 0xf

    .line 623
    .line 624
    and-int/lit8 v3, v2, 0x70

    .line 625
    .line 626
    or-int/2addr v3, v0

    .line 627
    invoke-virtual {v9, v10, v11, v3}, Landroidx/compose/material3/ChipColors;->labelColor$material3_release(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 628
    .line 629
    .line 630
    move-result-object v3

    .line 631
    invoke-interface {v3}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 632
    .line 633
    .line 634
    move-result-object v3

    .line 635
    check-cast v3, Landroidx/compose/ui/graphics/Color;

    .line 636
    .line 637
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    .line 638
    .line 639
    .line 640
    move-result-wide v5

    .line 641
    sget-object v3, Landroidx/compose/material3/SuggestionChipDefaults;->INSTANCE:Landroidx/compose/material3/SuggestionChipDefaults;

    .line 642
    .line 643
    invoke-virtual {v3}, Landroidx/compose/material3/SuggestionChipDefaults;->getHeight-D9Ej5fM()F

    .line 644
    .line 645
    .line 646
    move-result v16

    .line 647
    sget-object v21, Landroidx/compose/material3/ChipKt;->SuggestionChipPadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 648
    .line 649
    const v3, -0x56c298ab

    .line 650
    .line 651
    .line 652
    invoke-interface {v11, v3}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 653
    .line 654
    .line 655
    if-nez v7, :cond_2f

    .line 656
    .line 657
    move-object/from16 v0, v37

    .line 658
    .line 659
    goto :goto_22

    .line 660
    :cond_2f
    shr-int/lit8 v3, v1, 0x15

    .line 661
    .line 662
    and-int/lit8 v3, v3, 0x70

    .line 663
    .line 664
    or-int/2addr v0, v3

    .line 665
    invoke-virtual {v7, v10, v11, v0}, Landroidx/compose/material3/ChipBorder;->borderStroke$material3_release(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 666
    .line 667
    .line 668
    move-result-object v0

    .line 669
    :goto_22
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 670
    .line 671
    .line 672
    if-eqz v0, :cond_30

    .line 673
    .line 674
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 675
    .line 676
    .line 677
    move-result-object v0

    .line 678
    check-cast v0, Landroidx/compose/foundation/BorderStroke;

    .line 679
    .line 680
    move-object v12, v0

    .line 681
    goto :goto_23

    .line 682
    :cond_30
    move-object/from16 v12, v37

    .line 683
    .line 684
    :goto_23
    const/4 v8, 0x0

    .line 685
    shr-int/lit8 v0, v1, 0x6

    .line 686
    .line 687
    and-int/lit8 v0, v0, 0xe

    .line 688
    .line 689
    const/high16 v3, 0xc00000

    .line 690
    .line 691
    or-int/2addr v0, v3

    .line 692
    shl-int/lit8 v3, v1, 0x3

    .line 693
    .line 694
    and-int/lit8 v3, v3, 0x70

    .line 695
    .line 696
    or-int/2addr v0, v3

    .line 697
    shr-int/lit8 v3, v1, 0x3

    .line 698
    .line 699
    and-int/lit16 v3, v3, 0x380

    .line 700
    .line 701
    or-int/2addr v0, v3

    .line 702
    shl-int/lit8 v3, v1, 0x6

    .line 703
    .line 704
    and-int/lit16 v8, v3, 0x1c00

    .line 705
    .line 706
    or-int/2addr v0, v8

    .line 707
    and-int v3, v3, v33

    .line 708
    .line 709
    or-int/2addr v0, v3

    .line 710
    shl-int/lit8 v3, v1, 0x9

    .line 711
    .line 712
    and-int v8, v3, v34

    .line 713
    .line 714
    or-int/2addr v0, v8

    .line 715
    and-int v3, v3, v35

    .line 716
    .line 717
    or-int v17, v0, v3

    .line 718
    .line 719
    shr-int/lit8 v0, v1, 0x15

    .line 720
    .line 721
    and-int/lit8 v0, v0, 0xe

    .line 722
    .line 723
    or-int/lit16 v0, v0, 0xd80

    .line 724
    .line 725
    and-int v1, v2, v32

    .line 726
    .line 727
    or-int v18, v0, v1

    .line 728
    .line 729
    move-object/from16 v0, v38

    .line 730
    .line 731
    move-object/from16 v1, p0

    .line 732
    .line 733
    move v2, v10

    .line 734
    move-object/from16 v3, p1

    .line 735
    .line 736
    move-object/from16 v22, v7

    .line 737
    .line 738
    move-object/from16 v7, v40

    .line 739
    .line 740
    move-object/from16 v23, v9

    .line 741
    .line 742
    move-object/from16 v9, v41

    .line 743
    .line 744
    move/from16 v39, v10

    .line 745
    .line 746
    move-object/from16 v10, v23

    .line 747
    .line 748
    move-object/from16 v24, v11

    .line 749
    .line 750
    move-object/from16 v11, v19

    .line 751
    .line 752
    move/from16 v13, v16

    .line 753
    .line 754
    move-object/from16 v14, v21

    .line 755
    .line 756
    move-object/from16 v15, v20

    .line 757
    .line 758
    move-object/from16 v16, v24

    .line 759
    .line 760
    const/4 v8, 0x0

    .line 761
    invoke-static/range {v0 .. v18}, Landroidx/compose/material3/ChipKt;->Chip-nkUnTEs(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V

    .line 762
    .line 763
    .line 764
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 765
    .line 766
    .line 767
    move-result v0

    .line 768
    if-eqz v0, :cond_31

    .line 769
    .line 770
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 771
    .line 772
    .line 773
    :cond_31
    move-object/from16 v8, v19

    .line 774
    .line 775
    move-object/from16 v10, v20

    .line 776
    .line 777
    move-object/from16 v9, v22

    .line 778
    .line 779
    move-object/from16 v7, v23

    .line 780
    .line 781
    move-object/from16 v3, v38

    .line 782
    .line 783
    move/from16 v4, v39

    .line 784
    .line 785
    move-object/from16 v5, v40

    .line 786
    .line 787
    move-object/from16 v6, v41

    .line 788
    .line 789
    :goto_24
    invoke-interface/range {v24 .. v24}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 790
    .line 791
    .line 792
    move-result-object v13

    .line 793
    if-nez v13, :cond_32

    .line 794
    .line 795
    goto :goto_25

    .line 796
    :cond_32
    new-instance v14, Landroidx/compose/material3/ChipKt$ElevatedSuggestionChip$2;

    .line 797
    .line 798
    move-object v0, v14

    .line 799
    move-object/from16 v1, p0

    .line 800
    .line 801
    move-object/from16 v2, p1

    .line 802
    .line 803
    move/from16 v11, p11

    .line 804
    .line 805
    move/from16 v12, p12

    .line 806
    .line 807
    invoke-direct/range {v0 .. v12}, Landroidx/compose/material3/ChipKt$ElevatedSuggestionChip$2;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/material3/ChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;II)V

    .line 808
    .line 809
    .line 810
    invoke-interface {v13, v14}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 811
    .line 812
    .line 813
    :goto_25
    return-void
.end method

.method public static final FilterChip(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/material3/SelectableChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V
    .locals 56
    .annotation runtime Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/graphics/Shape;",
            "Landroidx/compose/material3/SelectableChipColors;",
            "Landroidx/compose/material3/SelectableChipElevation;",
            "Landroidx/compose/material3/SelectableChipBorder;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    move/from16 v15, p0

    move-object/from16 v14, p1

    move-object/from16 v13, p2

    move/from16 v12, p13

    move/from16 v11, p15

    const-string v0, "onClick"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "label"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x6ff11e49

    move-object/from16 v1, p12

    .line 1
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v10

    and-int/lit8 v1, v11, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v12, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v12, 0xe

    if-nez v1, :cond_2

    invoke-interface {v10, v15}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v12

    goto :goto_1

    :cond_2
    move v1, v12

    :goto_1
    and-int/lit8 v4, v11, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v12, 0x70

    if-nez v4, :cond_5

    invoke-interface {v10, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v1, v4

    :cond_5
    :goto_3
    and-int/lit8 v4, v11, 0x4

    if-eqz v4, :cond_6

    or-int/lit16 v1, v1, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v4, v12, 0x380

    if-nez v4, :cond_8

    invoke-interface {v10, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    const/16 v4, 0x100

    goto :goto_4

    :cond_7
    const/16 v4, 0x80

    :goto_4
    or-int/2addr v1, v4

    :cond_8
    :goto_5
    and-int/lit8 v4, v11, 0x8

    if-eqz v4, :cond_9

    or-int/lit16 v1, v1, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v7, v12, 0x1c00

    if-nez v7, :cond_b

    move-object/from16 v7, p3

    invoke-interface {v10, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_a

    const/16 v8, 0x800

    goto :goto_6

    :cond_a
    const/16 v8, 0x400

    :goto_6
    or-int/2addr v1, v8

    goto :goto_8

    :cond_b
    :goto_7
    move-object/from16 v7, p3

    :goto_8
    and-int/lit8 v8, v11, 0x10

    const v45, 0xe000

    if-eqz v8, :cond_c

    or-int/lit16 v1, v1, 0x6000

    goto :goto_a

    :cond_c
    and-int v9, v12, v45

    if-nez v9, :cond_e

    move/from16 v9, p4

    invoke-interface {v10, v9}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v16

    if-eqz v16, :cond_d

    const/16 v16, 0x4000

    goto :goto_9

    :cond_d
    const/16 v16, 0x2000

    :goto_9
    or-int v1, v1, v16

    goto :goto_b

    :cond_e
    :goto_a
    move/from16 v9, p4

    :goto_b
    and-int/lit8 v16, v11, 0x20

    const/high16 v46, 0x70000

    if-eqz v16, :cond_f

    const/high16 v17, 0x30000

    or-int v1, v1, v17

    move-object/from16 v2, p5

    goto :goto_d

    :cond_f
    and-int v17, v12, v46

    move-object/from16 v2, p5

    if-nez v17, :cond_11

    invoke-interface {v10, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_10

    const/high16 v17, 0x20000

    goto :goto_c

    :cond_10
    const/high16 v17, 0x10000

    :goto_c
    or-int v1, v1, v17

    :cond_11
    :goto_d
    and-int/lit8 v17, v11, 0x40

    const/high16 v47, 0x380000

    if-eqz v17, :cond_12

    const/high16 v18, 0x180000

    or-int v1, v1, v18

    move-object/from16 v3, p6

    goto :goto_f

    :cond_12
    and-int v18, v12, v47

    move-object/from16 v3, p6

    if-nez v18, :cond_14

    invoke-interface {v10, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_13

    const/high16 v19, 0x100000

    goto :goto_e

    :cond_13
    const/high16 v19, 0x80000

    :goto_e
    or-int v1, v1, v19

    :cond_14
    :goto_f
    const/high16 v19, 0x1c00000

    and-int v19, v12, v19

    if-nez v19, :cond_17

    and-int/lit16 v5, v11, 0x80

    if-nez v5, :cond_15

    move-object/from16 v5, p7

    invoke-interface {v10, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_16

    const/high16 v20, 0x800000

    goto :goto_10

    :cond_15
    move-object/from16 v5, p7

    :cond_16
    const/high16 v20, 0x400000

    :goto_10
    or-int v1, v1, v20

    goto :goto_11

    :cond_17
    move-object/from16 v5, p7

    :goto_11
    const/high16 v20, 0xe000000

    and-int v20, v12, v20

    if-nez v20, :cond_1a

    and-int/lit16 v6, v11, 0x100

    if-nez v6, :cond_18

    move-object/from16 v6, p8

    invoke-interface {v10, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_19

    const/high16 v21, 0x4000000

    goto :goto_12

    :cond_18
    move-object/from16 v6, p8

    :cond_19
    const/high16 v21, 0x2000000

    :goto_12
    or-int v1, v1, v21

    goto :goto_13

    :cond_1a
    move-object/from16 v6, p8

    :goto_13
    const/high16 v21, 0x70000000

    and-int v21, v12, v21

    if-nez v21, :cond_1d

    and-int/lit16 v0, v11, 0x200

    if-nez v0, :cond_1b

    move-object/from16 v0, p9

    invoke-interface {v10, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_1c

    const/high16 v21, 0x20000000

    goto :goto_14

    :cond_1b
    move-object/from16 v0, p9

    :cond_1c
    const/high16 v21, 0x10000000

    :goto_14
    or-int v1, v1, v21

    goto :goto_15

    :cond_1d
    move-object/from16 v0, p9

    :goto_15
    and-int/lit8 v21, p14, 0xe

    if-nez v21, :cond_20

    and-int/lit16 v0, v11, 0x400

    if-nez v0, :cond_1e

    move-object/from16 v0, p10

    invoke-interface {v10, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_1f

    const/16 v18, 0x4

    goto :goto_16

    :cond_1e
    move-object/from16 v0, p10

    :cond_1f
    const/16 v18, 0x2

    :goto_16
    or-int v18, p14, v18

    goto :goto_17

    :cond_20
    move-object/from16 v0, p10

    move/from16 v18, p14

    :goto_17
    and-int/lit16 v9, v11, 0x800

    if-eqz v9, :cond_21

    or-int/lit8 v18, v18, 0x30

    move/from16 p12, v9

    move/from16 v48, v18

    move-object/from16 v9, p11

    goto :goto_19

    :cond_21
    and-int/lit8 v21, p14, 0x70

    move/from16 p12, v9

    move-object/from16 v9, p11

    if-nez v21, :cond_23

    invoke-interface {v10, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_22

    const/16 v19, 0x20

    goto :goto_18

    :cond_22
    const/16 v19, 0x10

    :goto_18
    or-int v18, v18, v19

    :cond_23
    move/from16 v48, v18

    :goto_19
    const v18, 0x5b6db6db

    and-int v0, v1, v18

    const v2, 0x12492492

    if-ne v0, v2, :cond_25

    and-int/lit8 v0, v48, 0x5b

    const/16 v2, 0x12

    if-ne v0, v2, :cond_25

    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_24

    goto :goto_1a

    .line 2
    :cond_24
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v11, p10

    move-object v8, v5

    move-object v4, v7

    move-object v12, v9

    move-object/from16 v24, v10

    move/from16 v5, p4

    move-object/from16 v10, p9

    move-object v7, v3

    move-object v9, v6

    move-object/from16 v6, p5

    goto/16 :goto_27

    .line 3
    :cond_25
    :goto_1a
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v0, v12, 0x1

    const/16 v49, 0x0

    const/4 v2, 0x6

    if-eqz v0, :cond_2b

    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v0

    if-eqz v0, :cond_26

    goto :goto_1b

    .line 4
    :cond_26
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit16 v0, v11, 0x80

    if-eqz v0, :cond_27

    const v0, -0x1c00001

    and-int/2addr v1, v0

    :cond_27
    and-int/lit16 v0, v11, 0x100

    if-eqz v0, :cond_28

    const v0, -0xe000001

    and-int/2addr v1, v0

    :cond_28
    and-int/lit16 v0, v11, 0x200

    if-eqz v0, :cond_29

    const v0, -0x70000001

    and-int/2addr v1, v0

    :cond_29
    and-int/lit16 v0, v11, 0x400

    if-eqz v0, :cond_2a

    and-int/lit8 v48, v48, -0xf

    :cond_2a
    move-object/from16 v51, p5

    move-object/from16 v20, p9

    move-object/from16 v8, p10

    move-object/from16 v52, v3

    move-object/from16 v53, v5

    move-object/from16 v30, v6

    move-object/from16 v19, v7

    move-object/from16 v21, v9

    move/from16 v0, v48

    move/from16 v9, p4

    goto/16 :goto_25

    :cond_2b
    :goto_1b
    if-eqz v4, :cond_2c

    .line 5
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    goto :goto_1c

    :cond_2c
    move-object v0, v7

    :goto_1c
    if-eqz v8, :cond_2d

    const/4 v4, 0x1

    move/from16 v50, v4

    goto :goto_1d

    :cond_2d
    move/from16 v50, p4

    :goto_1d
    if-eqz v16, :cond_2e

    move-object/from16 v51, v49

    goto :goto_1e

    :cond_2e
    move-object/from16 v51, p5

    :goto_1e
    if-eqz v17, :cond_2f

    move-object/from16 v52, v49

    goto :goto_1f

    :cond_2f
    move-object/from16 v52, v3

    :goto_1f
    and-int/lit16 v3, v11, 0x80

    if-eqz v3, :cond_30

    .line 6
    sget-object v3, Landroidx/compose/material3/FilterChipDefaults;->INSTANCE:Landroidx/compose/material3/FilterChipDefaults;

    invoke-virtual {v3, v10, v2}, Landroidx/compose/material3/FilterChipDefaults;->getShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    move-result-object v3

    const v4, -0x1c00001

    and-int/2addr v1, v4

    move-object/from16 v53, v3

    goto :goto_20

    :cond_30
    move-object/from16 v53, v5

    :goto_20
    and-int/lit16 v3, v11, 0x100

    if-eqz v3, :cond_31

    .line 7
    sget-object v16, Landroidx/compose/material3/FilterChipDefaults;->INSTANCE:Landroidx/compose/material3/FilterChipDefaults;

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const-wide/16 v27, 0x0

    const-wide/16 v29, 0x0

    const-wide/16 v31, 0x0

    const-wide/16 v33, 0x0

    const-wide/16 v35, 0x0

    const-wide/16 v37, 0x0

    const-wide/16 v39, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x180

    const/16 v44, 0xfff

    move-object/from16 v41, v10

    invoke-virtual/range {v16 .. v44}, Landroidx/compose/material3/FilterChipDefaults;->filterChipColors-XqyqHi0(JJJJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SelectableChipColors;

    move-result-object v3

    const v4, -0xe000001

    and-int/2addr v1, v4

    move/from16 v16, v1

    move-object/from16 v30, v3

    goto :goto_21

    :cond_31
    move/from16 v16, v1

    move-object/from16 v30, v6

    :goto_21
    and-int/lit16 v1, v11, 0x200

    if-eqz v1, :cond_32

    .line 8
    sget-object v1, Landroidx/compose/material3/FilterChipDefaults;->INSTANCE:Landroidx/compose/material3/FilterChipDefaults;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/high16 v17, 0x180000

    const/16 v18, 0x3f

    move v2, v3

    move v3, v4

    move v4, v5

    move v5, v6

    move v6, v7

    move v7, v8

    move-object v8, v10

    move/from16 v31, p12

    move/from16 v9, v17

    move-object/from16 p3, v10

    move/from16 v10, v18

    invoke-virtual/range {v1 .. v10}, Landroidx/compose/material3/FilterChipDefaults;->filterChipElevation-aqJV_2Y(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SelectableChipElevation;

    move-result-object v1

    const v2, -0x70000001

    and-int v2, v16, v2

    goto :goto_22

    :cond_32
    move/from16 v31, p12

    move-object/from16 p3, v10

    move-object/from16 v1, p9

    move/from16 v2, v16

    :goto_22
    and-int/lit16 v3, v11, 0x400

    if-eqz v3, :cond_33

    .line 9
    sget-object v16, Landroidx/compose/material3/FilterChipDefaults;->INSTANCE:Landroidx/compose/material3/FilterChipDefaults;

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/high16 v28, 0x180000

    const/16 v29, 0x3f

    move-object/from16 v27, p3

    invoke-virtual/range {v16 .. v29}, Landroidx/compose/material3/FilterChipDefaults;->filterChipBorder-gHcDVlo(JJJJFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SelectableChipBorder;

    move-result-object v3

    and-int/lit8 v48, v48, -0xf

    goto :goto_23

    :cond_33
    move-object/from16 v3, p10

    :goto_23
    if-eqz v31, :cond_35

    const v4, -0x1d58f75c

    move-object/from16 v10, p3

    .line 10
    invoke-interface {v10, v4}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 11
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v4

    .line 12
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v5

    if-ne v4, v5, :cond_34

    .line 13
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-result-object v4

    .line 14
    invoke-interface {v10, v4}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 15
    :cond_34
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    check-cast v4, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-object/from16 v19, v0

    move-object/from16 v20, v1

    move v1, v2

    move-object v8, v3

    move-object/from16 v21, v4

    goto :goto_24

    :cond_35
    move-object/from16 v10, p3

    move-object/from16 v21, p11

    move-object/from16 v19, v0

    move-object/from16 v20, v1

    move v1, v2

    move-object v8, v3

    :goto_24
    move/from16 v0, v48

    move/from16 v9, v50

    :goto_25
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_36

    const-string v2, "androidx.compose.material3.FilterChip (Chip.kt:257)"

    const v3, -0x6ff11e49

    .line 16
    invoke-static {v3, v1, v0, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 17
    :cond_36
    sget-object v2, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    const/4 v3, 0x6

    invoke-virtual {v2, v10, v3}, Landroidx/compose/material3/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Typography;

    move-result-object v2

    sget-object v3, Landroidx/compose/material3/tokens/FilterChipTokens;->INSTANCE:Landroidx/compose/material3/tokens/FilterChipTokens;

    invoke-virtual {v3}, Landroidx/compose/material3/tokens/FilterChipTokens;->getLabelTextFont()Landroidx/compose/material3/tokens/TypographyKeyTokens;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/compose/material3/TypographyKt;->fromToken(Landroidx/compose/material3/Typography;Landroidx/compose/material3/tokens/TypographyKeyTokens;)Landroidx/compose/ui/text/TextStyle;

    move-result-object v5

    .line 18
    sget-object v2, Landroidx/compose/material3/FilterChipDefaults;->INSTANCE:Landroidx/compose/material3/FilterChipDefaults;

    invoke-virtual {v2}, Landroidx/compose/material3/FilterChipDefaults;->getHeight-D9Ej5fM()F

    move-result v16

    .line 19
    sget-object v22, Landroidx/compose/material3/ChipKt;->FilterChipPadding:Landroidx/compose/foundation/layout/PaddingValues;

    const v2, 0x10760adb

    .line 20
    invoke-interface {v10, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    if-nez v8, :cond_37

    move-object/from16 v2, v49

    goto :goto_26

    :cond_37
    shr-int/lit8 v2, v1, 0xc

    and-int/lit8 v2, v2, 0xe

    shl-int/lit8 v3, v1, 0x3

    and-int/lit8 v3, v3, 0x70

    or-int/2addr v2, v3

    shl-int/lit8 v3, v0, 0x6

    and-int/lit16 v3, v3, 0x380

    or-int/2addr v2, v3

    invoke-virtual {v8, v9, v15, v10, v2}, Landroidx/compose/material3/SelectableChipBorder;->borderStroke$material3_release(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v2

    :goto_26
    invoke-interface {v10}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    if-eqz v2, :cond_38

    invoke-interface {v2}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/foundation/BorderStroke;

    move-object/from16 v49, v2

    :cond_38
    const/4 v7, 0x0

    and-int/lit8 v2, v1, 0xe

    const/high16 v3, 0xc00000

    or-int/2addr v2, v3

    shr-int/lit8 v3, v1, 0x6

    and-int/lit8 v3, v3, 0x70

    or-int/2addr v2, v3

    shl-int/lit8 v3, v1, 0x3

    and-int/lit16 v4, v3, 0x380

    or-int/2addr v2, v4

    shr-int/lit8 v4, v1, 0x3

    and-int/lit16 v4, v4, 0x1c00

    or-int/2addr v2, v4

    shl-int/lit8 v4, v1, 0x6

    and-int v6, v4, v45

    or-int/2addr v2, v6

    and-int v3, v3, v47

    or-int/2addr v2, v3

    const/high16 v3, 0xe000000

    and-int/2addr v3, v4

    or-int/2addr v2, v3

    const/high16 v3, 0x70000000

    and-int/2addr v3, v4

    or-int v17, v2, v3

    shr-int/lit8 v1, v1, 0x18

    and-int/lit8 v2, v1, 0xe

    or-int/lit16 v2, v2, 0x6c00

    and-int/lit8 v1, v1, 0x70

    or-int/2addr v1, v2

    shl-int/lit8 v0, v0, 0xc

    and-int v0, v0, v46

    or-int v18, v1, v0

    move/from16 v0, p0

    move-object/from16 v1, v19

    move-object/from16 v2, p1

    move v3, v9

    move-object/from16 v4, p2

    move-object/from16 v6, v51

    move-object/from16 v23, v8

    move-object/from16 v8, v52

    move/from16 v50, v9

    move-object/from16 v9, v53

    move-object/from16 v24, v10

    move-object/from16 v10, v30

    move-object/from16 v11, v20

    move-object/from16 v12, v49

    move/from16 v13, v16

    move-object/from16 v14, v22

    move-object/from16 v15, v21

    move-object/from16 v16, v24

    .line 21
    invoke-static/range {v0 .. v18}, Landroidx/compose/material3/ChipKt;->SelectableChip-u0RnIRE(ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_39

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_39
    move-object/from16 v4, v19

    move-object/from16 v10, v20

    move-object/from16 v12, v21

    move-object/from16 v11, v23

    move-object/from16 v9, v30

    move/from16 v5, v50

    move-object/from16 v6, v51

    move-object/from16 v7, v52

    move-object/from16 v8, v53

    .line 22
    :goto_27
    invoke-interface/range {v24 .. v24}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v15

    if-nez v15, :cond_3a

    goto :goto_28

    :cond_3a
    new-instance v14, Landroidx/compose/material3/ChipKt$FilterChip$2;

    move-object v0, v14

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v13, p13

    move-object/from16 v54, v14

    move/from16 v14, p14

    move-object/from16 v55, v15

    move/from16 v15, p15

    invoke-direct/range {v0 .. v15}, Landroidx/compose/material3/ChipKt$FilterChip$2;-><init>(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/material3/SelectableChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;III)V

    move-object/from16 v1, v54

    move-object/from16 v0, v55

    invoke-interface {v0, v1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :goto_28
    return-void
.end method

.method public static final InputChip(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/material3/SelectableChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V
    .locals 51
    .annotation runtime Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/graphics/Shape;",
            "Landroidx/compose/material3/SelectableChipColors;",
            "Landroidx/compose/material3/SelectableChipElevation;",
            "Landroidx/compose/material3/SelectableChipBorder;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    move/from16 v15, p0

    move-object/from16 v13, p1

    move-object/from16 v12, p2

    move/from16 v11, p14

    move/from16 v10, p15

    move/from16 v9, p16

    const-string v0, "onClick"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "label"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x5f4f4473

    move-object/from16 v1, p13

    .line 1
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v8

    and-int/lit8 v1, v9, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v1, v11, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v11, 0xe

    if-nez v1, :cond_2

    invoke-interface {v8, v15}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v11

    goto :goto_1

    :cond_2
    move v1, v11

    :goto_1
    and-int/lit8 v4, v9, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v11, 0x70

    if-nez v4, :cond_5

    invoke-interface {v8, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v1, v4

    :cond_5
    :goto_3
    and-int/lit8 v4, v9, 0x4

    if-eqz v4, :cond_6

    or-int/lit16 v1, v1, 0x180

    goto :goto_5

    :cond_6
    and-int/lit16 v4, v11, 0x380

    if-nez v4, :cond_8

    invoke-interface {v8, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    const/16 v4, 0x100

    goto :goto_4

    :cond_7
    const/16 v4, 0x80

    :goto_4
    or-int/2addr v1, v4

    :cond_8
    :goto_5
    and-int/lit8 v4, v9, 0x8

    if-eqz v4, :cond_9

    or-int/lit16 v1, v1, 0xc00

    goto :goto_7

    :cond_9
    and-int/lit16 v2, v11, 0x1c00

    if-nez v2, :cond_b

    move-object/from16 v2, p3

    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_a

    const/16 v16, 0x800

    goto :goto_6

    :cond_a
    const/16 v16, 0x400

    :goto_6
    or-int v1, v1, v16

    goto :goto_8

    :cond_b
    :goto_7
    move-object/from16 v2, p3

    :goto_8
    and-int/lit8 v16, v9, 0x10

    const v47, 0xe000

    if-eqz v16, :cond_c

    or-int/lit16 v1, v1, 0x6000

    move/from16 v3, p4

    goto :goto_a

    :cond_c
    and-int v17, v11, v47

    move/from16 v3, p4

    if-nez v17, :cond_e

    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v18

    if-eqz v18, :cond_d

    const/16 v18, 0x4000

    goto :goto_9

    :cond_d
    const/16 v18, 0x2000

    :goto_9
    or-int v1, v1, v18

    :cond_e
    :goto_a
    and-int/lit8 v18, v9, 0x20

    if-eqz v18, :cond_f

    const/high16 v19, 0x30000

    or-int v1, v1, v19

    move-object/from16 v5, p5

    goto :goto_c

    :cond_f
    const/high16 v19, 0x70000

    and-int v19, v11, v19

    move-object/from16 v5, p5

    if-nez v19, :cond_11

    invoke-interface {v8, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_10

    const/high16 v20, 0x20000

    goto :goto_b

    :cond_10
    const/high16 v20, 0x10000

    :goto_b
    or-int v1, v1, v20

    :cond_11
    :goto_c
    and-int/lit8 v20, v9, 0x40

    if-eqz v20, :cond_12

    const/high16 v21, 0x180000

    or-int v1, v1, v21

    move-object/from16 v6, p6

    goto :goto_e

    :cond_12
    const/high16 v21, 0x380000

    and-int v21, v11, v21

    move-object/from16 v6, p6

    if-nez v21, :cond_14

    invoke-interface {v8, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_13

    const/high16 v22, 0x100000

    goto :goto_d

    :cond_13
    const/high16 v22, 0x80000

    :goto_d
    or-int v1, v1, v22

    :cond_14
    :goto_e
    and-int/lit16 v7, v9, 0x80

    if-eqz v7, :cond_15

    const/high16 v23, 0xc00000

    or-int v1, v1, v23

    move-object/from16 v14, p7

    goto :goto_10

    :cond_15
    const/high16 v23, 0x1c00000

    and-int v23, v11, v23

    move-object/from16 v14, p7

    if-nez v23, :cond_17

    invoke-interface {v8, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_16

    const/high16 v24, 0x800000

    goto :goto_f

    :cond_16
    const/high16 v24, 0x400000

    :goto_f
    or-int v1, v1, v24

    :cond_17
    :goto_10
    const/high16 v24, 0xe000000

    and-int v24, v11, v24

    if-nez v24, :cond_1a

    and-int/lit16 v0, v9, 0x100

    if-nez v0, :cond_18

    move-object/from16 v0, p8

    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_19

    const/high16 v24, 0x4000000

    goto :goto_11

    :cond_18
    move-object/from16 v0, p8

    :cond_19
    const/high16 v24, 0x2000000

    :goto_11
    or-int v1, v1, v24

    goto :goto_12

    :cond_1a
    move-object/from16 v0, p8

    :goto_12
    const/high16 v24, 0x70000000

    and-int v24, v11, v24

    if-nez v24, :cond_1d

    and-int/lit16 v0, v9, 0x200

    if-nez v0, :cond_1b

    move-object/from16 v0, p9

    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_1c

    const/high16 v24, 0x20000000

    goto :goto_13

    :cond_1b
    move-object/from16 v0, p9

    :cond_1c
    const/high16 v24, 0x10000000

    :goto_13
    or-int v1, v1, v24

    goto :goto_14

    :cond_1d
    move-object/from16 v0, p9

    :goto_14
    and-int/lit8 v24, v10, 0xe

    if-nez v24, :cond_20

    and-int/lit16 v0, v9, 0x400

    if-nez v0, :cond_1e

    move-object/from16 v0, p10

    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_1f

    const/16 v17, 0x4

    goto :goto_15

    :cond_1e
    move-object/from16 v0, p10

    :cond_1f
    const/16 v17, 0x2

    :goto_15
    or-int v17, v10, v17

    goto :goto_16

    :cond_20
    move-object/from16 v0, p10

    move/from16 v17, v10

    :goto_16
    and-int/lit8 v24, v10, 0x70

    if-nez v24, :cond_23

    and-int/lit16 v0, v9, 0x800

    if-nez v0, :cond_21

    move-object/from16 v0, p11

    invoke-interface {v8, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_22

    const/16 v19, 0x20

    goto :goto_17

    :cond_21
    move-object/from16 v0, p11

    :cond_22
    const/16 v19, 0x10

    :goto_17
    or-int v17, v17, v19

    goto :goto_18

    :cond_23
    move-object/from16 v0, p11

    :goto_18
    move/from16 v0, v17

    and-int/lit16 v2, v9, 0x1000

    if-eqz v2, :cond_24

    or-int/lit16 v0, v0, 0x180

    goto :goto_1a

    :cond_24
    and-int/lit16 v3, v10, 0x380

    if-nez v3, :cond_26

    move-object/from16 v3, p12

    invoke-interface {v8, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_25

    const/16 v22, 0x100

    goto :goto_19

    :cond_25
    const/16 v22, 0x80

    :goto_19
    or-int v0, v0, v22

    goto :goto_1b

    :cond_26
    :goto_1a
    move-object/from16 v3, p12

    :goto_1b
    const v17, 0x5b6db6db

    and-int v3, v1, v17

    const v5, 0x12492492

    if-ne v3, v5, :cond_28

    and-int/lit16 v3, v0, 0x2db

    const/16 v5, 0x92

    if-ne v3, v5, :cond_28

    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v3

    if-nez v3, :cond_27

    goto :goto_1c

    .line 2
    :cond_27
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object v7, v6

    move-object/from16 v30, v8

    move-object v8, v14

    move-object/from16 v6, p5

    goto/16 :goto_2d

    .line 3
    :cond_28
    :goto_1c
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v3, v11, 0x1

    if-eqz v3, :cond_2e

    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v3

    if-eqz v3, :cond_29

    goto :goto_1d

    .line 4
    :cond_29
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit16 v2, v9, 0x100

    if-eqz v2, :cond_2a

    const v2, -0xe000001

    and-int/2addr v1, v2

    :cond_2a
    and-int/lit16 v2, v9, 0x200

    if-eqz v2, :cond_2b

    const v2, -0x70000001

    and-int/2addr v1, v2

    :cond_2b
    and-int/lit16 v2, v9, 0x400

    if-eqz v2, :cond_2c

    and-int/lit8 v0, v0, -0xf

    :cond_2c
    and-int/lit16 v2, v9, 0x800

    if-eqz v2, :cond_2d

    and-int/lit8 v0, v0, -0x71

    :cond_2d
    move-object/from16 v19, p3

    move/from16 v7, p4

    move-object/from16 v48, p5

    move-object/from16 v21, p8

    move-object/from16 v22, p9

    move-object/from16 v23, p10

    move-object/from16 v5, p11

    move-object/from16 v24, p12

    move-object/from16 v20, v14

    goto/16 :goto_26

    :cond_2e
    :goto_1d
    if-eqz v4, :cond_2f

    .line 5
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    goto :goto_1e

    :cond_2f
    move-object/from16 v3, p3

    :goto_1e
    if-eqz v16, :cond_30

    const/4 v4, 0x1

    goto :goto_1f

    :cond_30
    move/from16 v4, p4

    :goto_1f
    if-eqz v18, :cond_31

    const/16 v48, 0x0

    goto :goto_20

    :cond_31
    move-object/from16 v48, p5

    :goto_20
    if-eqz v20, :cond_32

    const/4 v6, 0x0

    :cond_32
    if-eqz v7, :cond_33

    const/4 v14, 0x0

    :cond_33
    and-int/lit16 v7, v9, 0x100

    if-eqz v7, :cond_34

    .line 6
    sget-object v7, Landroidx/compose/material3/InputChipDefaults;->INSTANCE:Landroidx/compose/material3/InputChipDefaults;

    const/4 v5, 0x6

    invoke-virtual {v7, v8, v5}, Landroidx/compose/material3/InputChipDefaults;->getShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    move-result-object v7

    const v5, -0xe000001

    and-int/2addr v1, v5

    goto :goto_21

    :cond_34
    move-object/from16 v7, p8

    :goto_21
    and-int/lit16 v5, v9, 0x200

    if-eqz v5, :cond_35

    .line 7
    sget-object v16, Landroidx/compose/material3/InputChipDefaults;->INSTANCE:Landroidx/compose/material3/InputChipDefaults;

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const-wide/16 v25, 0x0

    const-wide/16 v27, 0x0

    const-wide/16 v29, 0x0

    const-wide/16 v31, 0x0

    const-wide/16 v33, 0x0

    const-wide/16 v35, 0x0

    const-wide/16 v37, 0x0

    const-wide/16 v39, 0x0

    const-wide/16 v41, 0x0

    const/16 v44, 0x0

    const/16 v45, 0xc00

    const/16 v46, 0x1fff

    move-object/from16 v43, v8

    invoke-virtual/range {v16 .. v46}, Landroidx/compose/material3/InputChipDefaults;->inputChipColors-kwJvTHA(JJJJJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SelectableChipColors;

    move-result-object v5

    const v16, -0x70000001

    and-int v1, v1, v16

    goto :goto_22

    :cond_35
    move-object/from16 v5, p9

    :goto_22
    move/from16 p3, v1

    and-int/lit16 v1, v9, 0x400

    if-eqz v1, :cond_36

    .line 8
    sget-object v16, Landroidx/compose/material3/InputChipDefaults;->INSTANCE:Landroidx/compose/material3/InputChipDefaults;

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/high16 v24, 0x180000

    const/16 v25, 0x3f

    move-object/from16 v23, v8

    invoke-virtual/range {v16 .. v25}, Landroidx/compose/material3/InputChipDefaults;->inputChipElevation-aqJV_2Y(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SelectableChipElevation;

    move-result-object v1

    and-int/lit8 v0, v0, -0xf

    goto :goto_23

    :cond_36
    move-object/from16 v1, p10

    :goto_23
    move-object/from16 p4, v1

    and-int/lit16 v1, v9, 0x800

    if-eqz v1, :cond_37

    .line 9
    sget-object v16, Landroidx/compose/material3/InputChipDefaults;->INSTANCE:Landroidx/compose/material3/InputChipDefaults;

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/high16 v28, 0x180000

    const/16 v29, 0x3f

    move-object/from16 v27, v8

    invoke-virtual/range {v16 .. v29}, Landroidx/compose/material3/InputChipDefaults;->inputChipBorder-gHcDVlo(JJJJFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SelectableChipBorder;

    move-result-object v1

    and-int/lit8 v0, v0, -0x71

    goto :goto_24

    :cond_37
    move-object/from16 v1, p11

    :goto_24
    if-eqz v2, :cond_39

    const v2, -0x1d58f75c

    .line 10
    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 11
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    .line 12
    sget-object v16, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 p5, v0

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_38

    .line 13
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-result-object v2

    .line 14
    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 15
    :cond_38
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    move-object v0, v2

    check-cast v0, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-object/from16 v23, p4

    move-object/from16 v24, v0

    move-object/from16 v19, v3

    move-object/from16 v22, v5

    move-object/from16 v21, v7

    move-object/from16 v20, v14

    move/from16 v0, p5

    goto :goto_25

    :cond_39
    move/from16 p5, v0

    move-object/from16 v23, p4

    move-object/from16 v24, p12

    move-object/from16 v19, v3

    move-object/from16 v22, v5

    move-object/from16 v21, v7

    move-object/from16 v20, v14

    :goto_25
    move-object v5, v1

    move v7, v4

    move/from16 v1, p3

    :goto_26
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_3a

    const-string v2, "androidx.compose.material3.InputChip (Chip.kt:421)"

    const v3, -0x5f4f4473

    .line 16
    invoke-static {v3, v1, v0, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_3a
    const v2, -0x51c716f3

    .line 17
    invoke-interface {v8, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    if-eqz v6, :cond_3c

    if-eqz v7, :cond_3b

    const/high16 v2, 0x3f800000    # 1.0f

    goto :goto_27

    :cond_3b
    const v2, 0x3ec28f5c    # 0.38f

    .line 18
    :goto_27
    sget-object v3, Landroidx/compose/material3/tokens/InputChipTokens;->INSTANCE:Landroidx/compose/material3/tokens/InputChipTokens;

    invoke-virtual {v3}, Landroidx/compose/material3/tokens/InputChipTokens;->getAvatarShape()Landroidx/compose/material3/tokens/ShapeKeyTokens;

    move-result-object v3

    const/4 v4, 0x6

    invoke-static {v3, v8, v4}, Landroidx/compose/material3/ShapesKt;->toShape(Landroidx/compose/material3/tokens/ShapeKeyTokens;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    move-result-object v3

    .line 19
    new-instance v14, Landroidx/compose/material3/ChipKt$InputChip$2;

    invoke-direct {v14, v2, v3, v6, v1}, Landroidx/compose/material3/ChipKt$InputChip$2;-><init>(FLandroidx/compose/ui/graphics/Shape;Lkotlin/jvm/functions/Function2;I)V

    const v2, -0x15009343

    const/4 v3, 0x1

    invoke-static {v8, v2, v3, v14}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v2

    move-object/from16 v16, v2

    goto :goto_28

    :cond_3c
    const/4 v3, 0x1

    const/4 v4, 0x6

    const/16 v16, 0x0

    :goto_28
    invoke-interface {v8}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 20
    sget-object v2, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    invoke-virtual {v2, v8, v4}, Landroidx/compose/material3/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Typography;

    move-result-object v2

    sget-object v4, Landroidx/compose/material3/tokens/InputChipTokens;->INSTANCE:Landroidx/compose/material3/tokens/InputChipTokens;

    invoke-virtual {v4}, Landroidx/compose/material3/tokens/InputChipTokens;->getLabelTextFont()Landroidx/compose/material3/tokens/TypographyKeyTokens;

    move-result-object v4

    invoke-static {v2, v4}, Landroidx/compose/material3/TypographyKt;->fromToken(Landroidx/compose/material3/Typography;Landroidx/compose/material3/tokens/TypographyKeyTokens;)Landroidx/compose/ui/text/TextStyle;

    move-result-object v25

    if-nez v5, :cond_3d

    const/4 v2, 0x0

    goto :goto_29

    :cond_3d
    shr-int/lit8 v2, v1, 0xc

    and-int/lit8 v2, v2, 0xe

    shl-int/lit8 v4, v1, 0x3

    and-int/lit8 v4, v4, 0x70

    or-int/2addr v2, v4

    shl-int/lit8 v4, v0, 0x3

    and-int/lit16 v4, v4, 0x380

    or-int/2addr v2, v4

    .line 21
    invoke-virtual {v5, v7, v15, v8, v2}, Landroidx/compose/material3/SelectableChipBorder;->borderStroke$material3_release(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v2

    :goto_29
    if-eqz v2, :cond_3e

    invoke-interface {v2}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/foundation/BorderStroke;

    move-object/from16 v26, v2

    goto :goto_2a

    :cond_3e
    const/16 v26, 0x0

    .line 22
    :goto_2a
    sget-object v2, Landroidx/compose/material3/InputChipDefaults;->INSTANCE:Landroidx/compose/material3/InputChipDefaults;

    invoke-virtual {v2}, Landroidx/compose/material3/InputChipDefaults;->getHeight-D9Ej5fM()F

    move-result v27

    const/4 v2, 0x0

    if-eqz v16, :cond_3f

    move v4, v3

    goto :goto_2b

    :cond_3f
    move v4, v2

    :goto_2b
    if-eqz v48, :cond_40

    move v14, v3

    goto :goto_2c

    :cond_40
    move v14, v2

    :goto_2c
    if-eqz v20, :cond_41

    move v2, v3

    .line 23
    :cond_41
    invoke-static {v4, v14, v2}, Landroidx/compose/material3/ChipKt;->inputChipPadding(ZZZ)Landroidx/compose/foundation/layout/PaddingValues;

    move-result-object v14

    and-int/lit8 v2, v1, 0xe

    shr-int/lit8 v3, v1, 0x6

    and-int/lit8 v3, v3, 0x70

    or-int/2addr v2, v3

    shl-int/lit8 v3, v1, 0x3

    and-int/lit16 v4, v3, 0x380

    or-int/2addr v2, v4

    shr-int/lit8 v4, v1, 0x3

    and-int/lit16 v4, v4, 0x1c00

    or-int/2addr v2, v4

    shl-int/lit8 v4, v1, 0x6

    and-int v4, v4, v47

    or-int/2addr v2, v4

    const/high16 v4, 0x380000

    and-int/2addr v4, v3

    or-int/2addr v2, v4

    const/high16 v4, 0xe000000

    and-int/2addr v4, v3

    or-int/2addr v2, v4

    const/high16 v4, 0x70000000

    and-int/2addr v3, v4

    or-int v17, v2, v3

    shr-int/lit8 v1, v1, 0x1b

    and-int/lit8 v1, v1, 0xe

    or-int/lit16 v1, v1, 0xc00

    shl-int/lit8 v2, v0, 0x3

    and-int/lit8 v2, v2, 0x70

    or-int/2addr v1, v2

    shl-int/lit8 v0, v0, 0x9

    const/high16 v2, 0x70000

    and-int/2addr v0, v2

    or-int v18, v1, v0

    move/from16 v0, p0

    move-object/from16 v1, v19

    move-object/from16 v2, p1

    move v3, v7

    move-object/from16 v4, p2

    move-object/from16 v28, v5

    move-object/from16 v5, v25

    move-object/from16 v25, v6

    move-object/from16 v6, v48

    move/from16 v29, v7

    move-object/from16 v7, v16

    move-object/from16 v30, v8

    move-object/from16 v8, v20

    move-object/from16 v9, v21

    move-object/from16 v10, v22

    move-object/from16 v11, v23

    move-object/from16 v12, v26

    move/from16 v13, v27

    move-object/from16 v15, v24

    move-object/from16 v16, v30

    .line 24
    invoke-static/range {v0 .. v18}, Landroidx/compose/material3/ChipKt;->SelectableChip-u0RnIRE(ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_42

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_42
    move-object/from16 v4, v19

    move-object/from16 v8, v20

    move-object/from16 v9, v21

    move-object/from16 v10, v22

    move-object/from16 v11, v23

    move-object/from16 v13, v24

    move-object/from16 v7, v25

    move-object/from16 v12, v28

    move/from16 v5, v29

    move-object/from16 v6, v48

    .line 25
    :goto_2d
    invoke-interface/range {v30 .. v30}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v15

    if-nez v15, :cond_43

    goto :goto_2e

    :cond_43
    new-instance v14, Landroidx/compose/material3/ChipKt$InputChip$3;

    move-object v0, v14

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v49, v14

    move/from16 v14, p14

    move-object/from16 v50, v15

    move/from16 v15, p15

    move/from16 v16, p16

    invoke-direct/range {v0 .. v16}, Landroidx/compose/material3/ChipKt$InputChip$3;-><init>(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/material3/SelectableChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;III)V

    move-object/from16 v1, v49

    move-object/from16 v0, v50

    invoke-interface {v0, v1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :goto_2e
    return-void
.end method

.method private static final SelectableChip-u0RnIRE(ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V
    .locals 31
    .annotation runtime Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;Z",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/text/TextStyle;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/graphics/Shape;",
            "Landroidx/compose/material3/SelectableChipColors;",
            "Landroidx/compose/material3/SelectableChipElevation;",
            "Landroidx/compose/foundation/BorderStroke;",
            "F",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v14, p0

    move-object/from16 v15, p1

    move/from16 v13, p3

    move-object/from16 v12, p10

    move-object/from16 v11, p11

    move-object/from16 v10, p15

    move/from16 v9, p17

    move/from16 v8, p18

    const v0, 0x18048c8c

    move-object/from16 v1, p16

    .line 1
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v7

    and-int/lit8 v1, v9, 0xe

    const/4 v3, 0x2

    if-nez v1, :cond_1

    invoke-interface {v7, v14}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    or-int/2addr v1, v9

    goto :goto_1

    :cond_1
    move v1, v9

    :goto_1
    and-int/lit8 v4, v9, 0x70

    const/16 v5, 0x20

    if-nez v4, :cond_3

    invoke-interface {v7, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    move v4, v5

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v1, v4

    :cond_3
    and-int/lit16 v4, v9, 0x380

    const/16 v16, 0x100

    const/16 v17, 0x80

    if-nez v4, :cond_5

    move-object/from16 v4, p2

    invoke-interface {v7, v4}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_4

    move/from16 v18, v16

    goto :goto_3

    :cond_4
    move/from16 v18, v17

    :goto_3
    or-int v1, v1, v18

    goto :goto_4

    :cond_5
    move-object/from16 v4, p2

    :goto_4
    and-int/lit16 v2, v9, 0x1c00

    const/16 v18, 0x800

    const/16 v19, 0x400

    if-nez v2, :cond_7

    invoke-interface {v7, v13}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v2

    if-eqz v2, :cond_6

    move/from16 v2, v18

    goto :goto_5

    :cond_6
    move/from16 v2, v19

    :goto_5
    or-int/2addr v1, v2

    :cond_7
    const v20, 0xe000

    and-int v2, v9, v20

    const/16 v21, 0x4000

    const/16 v22, 0x2000

    if-nez v2, :cond_9

    move-object/from16 v2, p4

    invoke-interface {v7, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_8

    move/from16 v23, v21

    goto :goto_6

    :cond_8
    move/from16 v23, v22

    :goto_6
    or-int v1, v1, v23

    goto :goto_7

    :cond_9
    move-object/from16 v2, p4

    :goto_7
    const/high16 v23, 0x70000

    and-int v24, v9, v23

    const/high16 v25, 0x20000

    const/high16 v26, 0x10000

    move-object/from16 v0, p5

    if-nez v24, :cond_b

    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v27

    if-eqz v27, :cond_a

    move/from16 v27, v25

    goto :goto_8

    :cond_a
    move/from16 v27, v26

    :goto_8
    or-int v1, v1, v27

    :cond_b
    const/high16 v27, 0x380000

    and-int v27, v9, v27

    move-object/from16 v6, p6

    if-nez v27, :cond_d

    invoke-interface {v7, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_c

    const/high16 v28, 0x100000

    goto :goto_9

    :cond_c
    const/high16 v28, 0x80000

    :goto_9
    or-int v1, v1, v28

    :cond_d
    const/high16 v28, 0x1c00000

    and-int v28, v9, v28

    move-object/from16 v6, p7

    if-nez v28, :cond_f

    invoke-interface {v7, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_e

    const/high16 v28, 0x800000

    goto :goto_a

    :cond_e
    const/high16 v28, 0x400000

    :goto_a
    or-int v1, v1, v28

    :cond_f
    const/high16 v28, 0xe000000

    and-int v28, v9, v28

    move-object/from16 v6, p8

    if-nez v28, :cond_11

    invoke-interface {v7, v6}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_10

    const/high16 v28, 0x4000000

    goto :goto_b

    :cond_10
    const/high16 v28, 0x2000000

    :goto_b
    or-int v1, v1, v28

    :cond_11
    const/high16 v28, 0x70000000

    and-int v28, v9, v28

    move-object/from16 v9, p9

    if-nez v28, :cond_13

    invoke-interface {v7, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_12

    const/high16 v28, 0x20000000

    goto :goto_c

    :cond_12
    const/high16 v28, 0x10000000

    :goto_c
    or-int v1, v1, v28

    :cond_13
    and-int/lit8 v28, v8, 0xe

    if-nez v28, :cond_15

    invoke-interface {v7, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_14

    const/4 v3, 0x4

    :cond_14
    or-int/2addr v3, v8

    goto :goto_d

    :cond_15
    move v3, v8

    :goto_d
    and-int/lit8 v28, v8, 0x70

    if-nez v28, :cond_17

    invoke-interface {v7, v11}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_16

    goto :goto_e

    :cond_16
    const/16 v5, 0x10

    :goto_e
    or-int/2addr v3, v5

    :cond_17
    and-int/lit16 v5, v8, 0x380

    if-nez v5, :cond_19

    move-object/from16 v5, p12

    invoke-interface {v7, v5}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v27

    if-eqz v27, :cond_18

    goto :goto_f

    :cond_18
    move/from16 v16, v17

    :goto_f
    or-int v3, v3, v16

    goto :goto_10

    :cond_19
    move-object/from16 v5, p12

    :goto_10
    and-int/lit16 v0, v8, 0x1c00

    if-nez v0, :cond_1b

    move/from16 v0, p13

    invoke-interface {v7, v0}, Landroidx/compose/runtime/Composer;->changed(F)Z

    move-result v16

    if-eqz v16, :cond_1a

    goto :goto_11

    :cond_1a
    move/from16 v18, v19

    :goto_11
    or-int v3, v3, v18

    goto :goto_12

    :cond_1b
    move/from16 v0, p13

    :goto_12
    and-int v16, v8, v20

    move-object/from16 v9, p14

    if-nez v16, :cond_1d

    invoke-interface {v7, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_1c

    goto :goto_13

    :cond_1c
    move/from16 v21, v22

    :goto_13
    or-int v3, v3, v21

    :cond_1d
    and-int v16, v8, v23

    if-nez v16, :cond_1f

    invoke-interface {v7, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_1e

    goto :goto_14

    :cond_1e
    move/from16 v25, v26

    :goto_14
    or-int v3, v3, v25

    :cond_1f
    const v16, 0x5b6db6db

    and-int v0, v1, v16

    const v2, 0x12492492

    if-ne v0, v2, :cond_21

    const v0, 0x5b6db

    and-int/2addr v0, v3

    const v2, 0x12492

    if-ne v0, v2, :cond_21

    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_20

    goto :goto_15

    .line 2
    :cond_20
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v18, v7

    goto/16 :goto_1a

    .line 3
    :cond_21
    :goto_15
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_22

    const-string v0, "androidx.compose.material3.SelectableChip (Chip.kt:1353)"

    const v2, 0x18048c8c

    invoke-static {v2, v1, v3, v0}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 4
    :cond_22
    sget-object v0, Landroidx/compose/material3/ChipKt$SelectableChip$1;->INSTANCE:Landroidx/compose/material3/ChipKt$SelectableChip$1;

    const/4 v2, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v15, v4, v0, v2, v5}, Landroidx/compose/ui/semantics/SemanticsModifierKt;->semantics$default(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v18

    shr-int/lit8 v0, v1, 0x9

    and-int/lit8 v0, v0, 0xe

    shl-int/lit8 v2, v1, 0x3

    and-int/lit8 v2, v2, 0x70

    or-int/2addr v2, v0

    shl-int/lit8 v5, v3, 0x6

    and-int/lit16 v5, v5, 0x380

    or-int/2addr v2, v5

    .line 5
    invoke-virtual {v12, v13, v14, v7, v2}, Landroidx/compose/material3/SelectableChipColors;->containerColor$material3_release(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v2

    invoke-interface {v2}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/ui/graphics/Color;

    invoke-virtual {v2}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    move-result-wide v21

    const-wide/16 v23, 0x0

    const v2, 0x3dca322a

    .line 6
    invoke-interface {v7, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    if-nez v11, :cond_23

    const/4 v2, 0x0

    goto :goto_16

    :cond_23
    shr-int/lit8 v2, v3, 0xc

    and-int/lit8 v2, v2, 0x70

    or-int/2addr v2, v0

    shl-int/lit8 v5, v3, 0x3

    and-int/lit16 v5, v5, 0x380

    or-int/2addr v2, v5

    invoke-virtual {v11, v13, v10, v7, v2}, Landroidx/compose/material3/SelectableChipElevation;->tonalElevation$material3_release(ZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v2

    :goto_16
    invoke-interface {v7}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    if-eqz v2, :cond_24

    invoke-interface {v2}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/ui/unit/Dp;

    invoke-virtual {v2}, Landroidx/compose/ui/unit/Dp;->unbox-impl()F

    move-result v2

    goto :goto_17

    :cond_24
    int-to-float v2, v4

    .line 7
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v2

    :goto_17
    move/from16 v19, v2

    if-nez v11, :cond_25

    const/4 v5, 0x0

    goto :goto_18

    :cond_25
    shr-int/lit8 v2, v3, 0xc

    and-int/lit8 v2, v2, 0x70

    or-int/2addr v0, v2

    shl-int/lit8 v2, v3, 0x3

    and-int/lit16 v2, v2, 0x380

    or-int/2addr v0, v2

    .line 8
    invoke-virtual {v11, v13, v10, v7, v0}, Landroidx/compose/material3/SelectableChipElevation;->shadowElevation$material3_release(ZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v5

    :goto_18
    if-eqz v5, :cond_26

    invoke-interface {v5}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/unit/Dp;

    invoke-virtual {v0}, Landroidx/compose/ui/unit/Dp;->unbox-impl()F

    move-result v0

    goto :goto_19

    :cond_26
    int-to-float v0, v4

    .line 9
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v0

    :goto_19
    move/from16 v25, v0

    .line 10
    new-instance v5, Landroidx/compose/material3/ChipKt$SelectableChip$2;

    move-object v0, v5

    move v2, v1

    move-object/from16 v1, p10

    move/from16 p16, v2

    move/from16 v2, p3

    move/from16 v16, v3

    move/from16 v3, p0

    move/from16 v4, p16

    move-object v13, v5

    move/from16 v5, v16

    move-object/from16 v6, p4

    move-object v14, v7

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    move-object/from16 v10, p8

    move/from16 v11, p13

    move-object/from16 v12, p14

    invoke-direct/range {v0 .. v12}, Landroidx/compose/material3/ChipKt$SelectableChip$2;-><init>(Landroidx/compose/material3/SelectableChipColors;ZZIILkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;FLandroidx/compose/foundation/layout/PaddingValues;)V

    const v0, -0x226db3de

    const/4 v1, 0x1

    invoke-static {v14, v0, v1, v13}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambda(Landroidx/compose/runtime/Composer;IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v13

    move/from16 v1, p16

    and-int/lit8 v0, v1, 0xe

    shr-int/lit8 v2, v1, 0x3

    and-int/lit8 v2, v2, 0x70

    or-int/2addr v0, v2

    and-int/lit16 v2, v1, 0x1c00

    or-int/2addr v0, v2

    shr-int/lit8 v1, v1, 0xf

    and-int v1, v1, v20

    or-int/2addr v0, v1

    shl-int/lit8 v1, v16, 0x15

    const/high16 v2, 0x70000000

    and-int/2addr v1, v2

    or-int/2addr v0, v1

    move v15, v0

    shr-int/lit8 v0, v16, 0xf

    and-int/lit8 v0, v0, 0xe

    or-int/lit8 v16, v0, 0x30

    const/16 v17, 0x40

    move/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, v18

    move/from16 v3, p3

    move-object/from16 v4, p9

    move-wide/from16 v5, v21

    move-wide/from16 v7, v23

    move/from16 v9, v19

    move/from16 v10, v25

    move-object/from16 v11, p12

    move-object/from16 v12, p15

    move-object/from16 v18, v14

    .line 11
    invoke-static/range {v0 .. v17}, Landroidx/compose/material3/SurfaceKt;->Surface-d85dljk(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_27

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 12
    :cond_27
    :goto_1a
    invoke-interface/range {v18 .. v18}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v15

    if-nez v15, :cond_28

    goto :goto_1b

    :cond_28
    new-instance v14, Landroidx/compose/material3/ChipKt$SelectableChip$3;

    move-object v0, v14

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v29, v14

    move/from16 v14, p13

    move-object/from16 v30, v15

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move/from16 v17, p17

    move/from16 v18, p18

    invoke-direct/range {v0 .. v18}, Landroidx/compose/material3/ChipKt$SelectableChip$3;-><init>(ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;II)V

    move-object/from16 v1, v29

    move-object/from16 v0, v30

    invoke-interface {v0, v1}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :goto_1b
    return-void
.end method

.method public static final SuggestionChip(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/material3/ChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V
    .locals 41
    .annotation runtime Landroidx/compose/material3/ExperimentalMaterial3Api;
    .end annotation

    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Z",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/ui/graphics/Shape;",
            "Landroidx/compose/material3/ChipColors;",
            "Landroidx/compose/material3/ChipElevation;",
            "Landroidx/compose/material3/ChipBorder;",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1
    move-object/from16 v15, p0

    .line 2
    .line 3
    move-object/from16 v12, p1

    .line 4
    .line 5
    move/from16 v11, p11

    .line 6
    .line 7
    move/from16 v10, p12

    .line 8
    .line 9
    const-string v0, "onClick"

    .line 10
    .line 11
    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "label"

    .line 15
    .line 16
    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const v0, 0xa2b9a45

    .line 20
    .line 21
    .line 22
    move-object/from16 v1, p10

    .line 23
    .line 24
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 25
    .line 26
    .line 27
    move-result-object v14

    .line 28
    and-int/lit8 v1, v10, 0x1

    .line 29
    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    or-int/lit8 v1, v11, 0x6

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    and-int/lit8 v1, v11, 0xe

    .line 36
    .line 37
    if-nez v1, :cond_2

    .line 38
    .line 39
    invoke-interface {v14, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    const/4 v1, 0x4

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    const/4 v1, 0x2

    .line 48
    :goto_0
    or-int/2addr v1, v11

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    move v1, v11

    .line 51
    :goto_1
    and-int/lit8 v2, v10, 0x2

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    or-int/lit8 v1, v1, 0x30

    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_3
    and-int/lit8 v2, v11, 0x70

    .line 59
    .line 60
    if-nez v2, :cond_5

    .line 61
    .line 62
    invoke-interface {v14, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    if-eqz v2, :cond_4

    .line 67
    .line 68
    const/16 v2, 0x20

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_4
    const/16 v2, 0x10

    .line 72
    .line 73
    :goto_2
    or-int/2addr v1, v2

    .line 74
    :cond_5
    :goto_3
    and-int/lit8 v2, v10, 0x4

    .line 75
    .line 76
    if-eqz v2, :cond_6

    .line 77
    .line 78
    or-int/lit16 v1, v1, 0x180

    .line 79
    .line 80
    goto :goto_5

    .line 81
    :cond_6
    and-int/lit16 v3, v11, 0x380

    .line 82
    .line 83
    if-nez v3, :cond_8

    .line 84
    .line 85
    move-object/from16 v3, p2

    .line 86
    .line 87
    invoke-interface {v14, v3}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    if-eqz v4, :cond_7

    .line 92
    .line 93
    const/16 v4, 0x100

    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_7
    const/16 v4, 0x80

    .line 97
    .line 98
    :goto_4
    or-int/2addr v1, v4

    .line 99
    goto :goto_6

    .line 100
    :cond_8
    :goto_5
    move-object/from16 v3, p2

    .line 101
    .line 102
    :goto_6
    and-int/lit8 v4, v10, 0x8

    .line 103
    .line 104
    if-eqz v4, :cond_9

    .line 105
    .line 106
    or-int/lit16 v1, v1, 0xc00

    .line 107
    .line 108
    goto :goto_8

    .line 109
    :cond_9
    and-int/lit16 v5, v11, 0x1c00

    .line 110
    .line 111
    if-nez v5, :cond_b

    .line 112
    .line 113
    move/from16 v5, p3

    .line 114
    .line 115
    invoke-interface {v14, v5}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 116
    .line 117
    .line 118
    move-result v6

    .line 119
    if-eqz v6, :cond_a

    .line 120
    .line 121
    const/16 v6, 0x800

    .line 122
    .line 123
    goto :goto_7

    .line 124
    :cond_a
    const/16 v6, 0x400

    .line 125
    .line 126
    :goto_7
    or-int/2addr v1, v6

    .line 127
    goto :goto_9

    .line 128
    :cond_b
    :goto_8
    move/from16 v5, p3

    .line 129
    .line 130
    :goto_9
    and-int/lit8 v6, v10, 0x10

    .line 131
    .line 132
    const v32, 0xe000

    .line 133
    .line 134
    .line 135
    if-eqz v6, :cond_c

    .line 136
    .line 137
    or-int/lit16 v1, v1, 0x6000

    .line 138
    .line 139
    goto :goto_b

    .line 140
    :cond_c
    and-int v7, v11, v32

    .line 141
    .line 142
    if-nez v7, :cond_e

    .line 143
    .line 144
    move-object/from16 v7, p4

    .line 145
    .line 146
    invoke-interface {v14, v7}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v8

    .line 150
    if-eqz v8, :cond_d

    .line 151
    .line 152
    const/16 v8, 0x4000

    .line 153
    .line 154
    goto :goto_a

    .line 155
    :cond_d
    const/16 v8, 0x2000

    .line 156
    .line 157
    :goto_a
    or-int/2addr v1, v8

    .line 158
    goto :goto_c

    .line 159
    :cond_e
    :goto_b
    move-object/from16 v7, p4

    .line 160
    .line 161
    :goto_c
    const/high16 v8, 0x70000

    .line 162
    .line 163
    and-int/2addr v8, v11

    .line 164
    if-nez v8, :cond_11

    .line 165
    .line 166
    and-int/lit8 v8, v10, 0x20

    .line 167
    .line 168
    if-nez v8, :cond_f

    .line 169
    .line 170
    move-object/from16 v8, p5

    .line 171
    .line 172
    invoke-interface {v14, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v9

    .line 176
    if-eqz v9, :cond_10

    .line 177
    .line 178
    const/high16 v9, 0x20000

    .line 179
    .line 180
    goto :goto_d

    .line 181
    :cond_f
    move-object/from16 v8, p5

    .line 182
    .line 183
    :cond_10
    const/high16 v9, 0x10000

    .line 184
    .line 185
    :goto_d
    or-int/2addr v1, v9

    .line 186
    goto :goto_e

    .line 187
    :cond_11
    move-object/from16 v8, p5

    .line 188
    .line 189
    :goto_e
    const/high16 v33, 0x380000

    .line 190
    .line 191
    and-int v9, v11, v33

    .line 192
    .line 193
    if-nez v9, :cond_14

    .line 194
    .line 195
    and-int/lit8 v9, v10, 0x40

    .line 196
    .line 197
    if-nez v9, :cond_12

    .line 198
    .line 199
    move-object/from16 v9, p6

    .line 200
    .line 201
    invoke-interface {v14, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v13

    .line 205
    if-eqz v13, :cond_13

    .line 206
    .line 207
    const/high16 v13, 0x100000

    .line 208
    .line 209
    goto :goto_f

    .line 210
    :cond_12
    move-object/from16 v9, p6

    .line 211
    .line 212
    :cond_13
    const/high16 v13, 0x80000

    .line 213
    .line 214
    :goto_f
    or-int/2addr v1, v13

    .line 215
    goto :goto_10

    .line 216
    :cond_14
    move-object/from16 v9, p6

    .line 217
    .line 218
    :goto_10
    const/high16 v13, 0x1c00000

    .line 219
    .line 220
    and-int/2addr v13, v11

    .line 221
    if-nez v13, :cond_17

    .line 222
    .line 223
    and-int/lit16 v13, v10, 0x80

    .line 224
    .line 225
    if-nez v13, :cond_15

    .line 226
    .line 227
    move-object/from16 v13, p7

    .line 228
    .line 229
    invoke-interface {v14, v13}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result v16

    .line 233
    if-eqz v16, :cond_16

    .line 234
    .line 235
    const/high16 v16, 0x800000

    .line 236
    .line 237
    goto :goto_11

    .line 238
    :cond_15
    move-object/from16 v13, p7

    .line 239
    .line 240
    :cond_16
    const/high16 v16, 0x400000

    .line 241
    .line 242
    :goto_11
    or-int v1, v1, v16

    .line 243
    .line 244
    goto :goto_12

    .line 245
    :cond_17
    move-object/from16 v13, p7

    .line 246
    .line 247
    :goto_12
    const/high16 v34, 0xe000000

    .line 248
    .line 249
    and-int v16, v11, v34

    .line 250
    .line 251
    if-nez v16, :cond_1a

    .line 252
    .line 253
    and-int/lit16 v0, v10, 0x100

    .line 254
    .line 255
    if-nez v0, :cond_18

    .line 256
    .line 257
    move-object/from16 v0, p8

    .line 258
    .line 259
    invoke-interface {v14, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v16

    .line 263
    if-eqz v16, :cond_19

    .line 264
    .line 265
    const/high16 v16, 0x4000000

    .line 266
    .line 267
    goto :goto_13

    .line 268
    :cond_18
    move-object/from16 v0, p8

    .line 269
    .line 270
    :cond_19
    const/high16 v16, 0x2000000

    .line 271
    .line 272
    :goto_13
    or-int v1, v1, v16

    .line 273
    .line 274
    goto :goto_14

    .line 275
    :cond_1a
    move-object/from16 v0, p8

    .line 276
    .line 277
    :goto_14
    and-int/lit16 v9, v10, 0x200

    .line 278
    .line 279
    const/high16 v35, 0x70000000

    .line 280
    .line 281
    if-eqz v9, :cond_1b

    .line 282
    .line 283
    const/high16 v16, 0x30000000

    .line 284
    .line 285
    or-int v1, v1, v16

    .line 286
    .line 287
    move/from16 p10, v9

    .line 288
    .line 289
    move-object/from16 v9, p9

    .line 290
    .line 291
    goto :goto_16

    .line 292
    :cond_1b
    and-int v16, v11, v35

    .line 293
    .line 294
    move/from16 p10, v9

    .line 295
    .line 296
    move-object/from16 v9, p9

    .line 297
    .line 298
    if-nez v16, :cond_1d

    .line 299
    .line 300
    invoke-interface {v14, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    move-result v16

    .line 304
    if-eqz v16, :cond_1c

    .line 305
    .line 306
    const/high16 v16, 0x20000000

    .line 307
    .line 308
    goto :goto_15

    .line 309
    :cond_1c
    const/high16 v16, 0x10000000

    .line 310
    .line 311
    :goto_15
    or-int v1, v1, v16

    .line 312
    .line 313
    :cond_1d
    :goto_16
    const v16, 0x5b6db6db

    .line 314
    .line 315
    .line 316
    and-int v0, v1, v16

    .line 317
    .line 318
    const v3, 0x12492492

    .line 319
    .line 320
    .line 321
    if-ne v0, v3, :cond_1f

    .line 322
    .line 323
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 324
    .line 325
    .line 326
    move-result v0

    .line 327
    if-nez v0, :cond_1e

    .line 328
    .line 329
    goto :goto_17

    .line 330
    :cond_1e
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 331
    .line 332
    .line 333
    move-object/from16 v3, p2

    .line 334
    .line 335
    move v4, v5

    .line 336
    move-object v5, v7

    .line 337
    move-object v6, v8

    .line 338
    move-object v10, v9

    .line 339
    move-object v8, v13

    .line 340
    move-object/from16 v22, v14

    .line 341
    .line 342
    move-object/from16 v7, p6

    .line 343
    .line 344
    move-object/from16 v9, p8

    .line 345
    .line 346
    goto/16 :goto_23

    .line 347
    .line 348
    :cond_1f
    :goto_17
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->startDefaults()V

    .line 349
    .line 350
    .line 351
    and-int/lit8 v0, v11, 0x1

    .line 352
    .line 353
    const v3, -0x1c00001

    .line 354
    .line 355
    .line 356
    const v36, -0x380001

    .line 357
    .line 358
    .line 359
    const v16, -0x70001

    .line 360
    .line 361
    .line 362
    const/16 v37, 0x0

    .line 363
    .line 364
    const/4 v9, 0x6

    .line 365
    if-eqz v0, :cond_25

    .line 366
    .line 367
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    .line 368
    .line 369
    .line 370
    move-result v0

    .line 371
    if-eqz v0, :cond_20

    .line 372
    .line 373
    goto :goto_18

    .line 374
    :cond_20
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 375
    .line 376
    .line 377
    and-int/lit8 v0, v10, 0x20

    .line 378
    .line 379
    if-eqz v0, :cond_21

    .line 380
    .line 381
    and-int v1, v1, v16

    .line 382
    .line 383
    :cond_21
    and-int/lit8 v0, v10, 0x40

    .line 384
    .line 385
    if-eqz v0, :cond_22

    .line 386
    .line 387
    and-int v1, v1, v36

    .line 388
    .line 389
    :cond_22
    and-int/lit16 v0, v10, 0x80

    .line 390
    .line 391
    if-eqz v0, :cond_23

    .line 392
    .line 393
    and-int/2addr v1, v3

    .line 394
    :cond_23
    and-int/lit16 v0, v10, 0x100

    .line 395
    .line 396
    if-eqz v0, :cond_24

    .line 397
    .line 398
    const v0, -0xe000001

    .line 399
    .line 400
    .line 401
    and-int/2addr v1, v0

    .line 402
    :cond_24
    move-object/from16 v19, p2

    .line 403
    .line 404
    move-object/from16 v21, p9

    .line 405
    .line 406
    move-object/from16 v39, v7

    .line 407
    .line 408
    move-object/from16 v40, v8

    .line 409
    .line 410
    move v0, v9

    .line 411
    move-object/from16 v20, v13

    .line 412
    .line 413
    move-object/from16 v8, p6

    .line 414
    .line 415
    move-object/from16 v7, p8

    .line 416
    .line 417
    move v9, v5

    .line 418
    goto/16 :goto_21

    .line 419
    .line 420
    :cond_25
    :goto_18
    if-eqz v2, :cond_26

    .line 421
    .line 422
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 423
    .line 424
    goto :goto_19

    .line 425
    :cond_26
    move-object/from16 v0, p2

    .line 426
    .line 427
    :goto_19
    if-eqz v4, :cond_27

    .line 428
    .line 429
    const/4 v2, 0x1

    .line 430
    move/from16 v38, v2

    .line 431
    .line 432
    goto :goto_1a

    .line 433
    :cond_27
    move/from16 v38, v5

    .line 434
    .line 435
    :goto_1a
    if-eqz v6, :cond_28

    .line 436
    .line 437
    move-object/from16 v39, v37

    .line 438
    .line 439
    goto :goto_1b

    .line 440
    :cond_28
    move-object/from16 v39, v7

    .line 441
    .line 442
    :goto_1b
    and-int/lit8 v2, v10, 0x20

    .line 443
    .line 444
    if-eqz v2, :cond_29

    .line 445
    .line 446
    sget-object v2, Landroidx/compose/material3/SuggestionChipDefaults;->INSTANCE:Landroidx/compose/material3/SuggestionChipDefaults;

    .line 447
    .line 448
    invoke-virtual {v2, v14, v9}, Landroidx/compose/material3/SuggestionChipDefaults;->getShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    .line 449
    .line 450
    .line 451
    move-result-object v2

    .line 452
    and-int v1, v1, v16

    .line 453
    .line 454
    move-object/from16 v40, v2

    .line 455
    .line 456
    goto :goto_1c

    .line 457
    :cond_29
    move-object/from16 v40, v8

    .line 458
    .line 459
    :goto_1c
    and-int/lit8 v2, v10, 0x40

    .line 460
    .line 461
    if-eqz v2, :cond_2a

    .line 462
    .line 463
    sget-object v16, Landroidx/compose/material3/SuggestionChipDefaults;->INSTANCE:Landroidx/compose/material3/SuggestionChipDefaults;

    .line 464
    .line 465
    const-wide/16 v17, 0x0

    .line 466
    .line 467
    const-wide/16 v19, 0x0

    .line 468
    .line 469
    const-wide/16 v21, 0x0

    .line 470
    .line 471
    const-wide/16 v23, 0x0

    .line 472
    .line 473
    const-wide/16 v25, 0x0

    .line 474
    .line 475
    const-wide/16 v27, 0x0

    .line 476
    .line 477
    const/high16 v30, 0x180000

    .line 478
    .line 479
    const/16 v31, 0x3f

    .line 480
    .line 481
    move-object/from16 v29, v14

    .line 482
    .line 483
    invoke-virtual/range {v16 .. v31}, Landroidx/compose/material3/SuggestionChipDefaults;->suggestionChipColors-5tl4gsc(JJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipColors;

    .line 484
    .line 485
    .line 486
    move-result-object v2

    .line 487
    and-int v1, v1, v36

    .line 488
    .line 489
    move-object/from16 v26, v2

    .line 490
    .line 491
    goto :goto_1d

    .line 492
    :cond_2a
    move-object/from16 v26, p6

    .line 493
    .line 494
    :goto_1d
    and-int/lit16 v2, v10, 0x80

    .line 495
    .line 496
    if-eqz v2, :cond_2b

    .line 497
    .line 498
    sget-object v16, Landroidx/compose/material3/SuggestionChipDefaults;->INSTANCE:Landroidx/compose/material3/SuggestionChipDefaults;

    .line 499
    .line 500
    const/16 v17, 0x0

    .line 501
    .line 502
    const/16 v18, 0x0

    .line 503
    .line 504
    const/16 v19, 0x0

    .line 505
    .line 506
    const/16 v20, 0x0

    .line 507
    .line 508
    const/16 v21, 0x0

    .line 509
    .line 510
    const/16 v22, 0x0

    .line 511
    .line 512
    const/high16 v24, 0x180000

    .line 513
    .line 514
    const/16 v25, 0x3f

    .line 515
    .line 516
    move-object/from16 v23, v14

    .line 517
    .line 518
    invoke-virtual/range {v16 .. v25}, Landroidx/compose/material3/SuggestionChipDefaults;->suggestionChipElevation-aqJV_2Y(FFFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipElevation;

    .line 519
    .line 520
    .line 521
    move-result-object v2

    .line 522
    and-int/2addr v1, v3

    .line 523
    move/from16 v16, v1

    .line 524
    .line 525
    move-object v13, v2

    .line 526
    goto :goto_1e

    .line 527
    :cond_2b
    move/from16 v16, v1

    .line 528
    .line 529
    :goto_1e
    and-int/lit16 v1, v10, 0x100

    .line 530
    .line 531
    if-eqz v1, :cond_2c

    .line 532
    .line 533
    sget-object v1, Landroidx/compose/material3/SuggestionChipDefaults;->INSTANCE:Landroidx/compose/material3/SuggestionChipDefaults;

    .line 534
    .line 535
    const-wide/16 v2, 0x0

    .line 536
    .line 537
    const-wide/16 v4, 0x0

    .line 538
    .line 539
    const/4 v6, 0x0

    .line 540
    const/16 v8, 0xc00

    .line 541
    .line 542
    const/16 v17, 0x7

    .line 543
    .line 544
    move-object v7, v14

    .line 545
    move/from16 v18, p10

    .line 546
    .line 547
    move-object/from16 p2, v0

    .line 548
    .line 549
    move v0, v9

    .line 550
    move/from16 v9, v17

    .line 551
    .line 552
    invoke-virtual/range {v1 .. v9}, Landroidx/compose/material3/SuggestionChipDefaults;->suggestionChipBorder-d_3_b6Q(JJFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ChipBorder;

    .line 553
    .line 554
    .line 555
    move-result-object v1

    .line 556
    const v2, -0xe000001

    .line 557
    .line 558
    .line 559
    and-int v2, v16, v2

    .line 560
    .line 561
    move/from16 v16, v2

    .line 562
    .line 563
    goto :goto_1f

    .line 564
    :cond_2c
    move/from16 v18, p10

    .line 565
    .line 566
    move-object/from16 p2, v0

    .line 567
    .line 568
    move v0, v9

    .line 569
    move-object/from16 v1, p8

    .line 570
    .line 571
    :goto_1f
    if-eqz v18, :cond_2e

    .line 572
    .line 573
    const v2, -0x1d58f75c

    .line 574
    .line 575
    .line 576
    invoke-interface {v14, v2}, Landroidx/compose/runtime/Composer;->startReplaceableGroup(I)V

    .line 577
    .line 578
    .line 579
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 580
    .line 581
    .line 582
    move-result-object v2

    .line 583
    sget-object v3, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 584
    .line 585
    invoke-virtual {v3}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    move-result-object v3

    .line 589
    if-ne v2, v3, :cond_2d

    .line 590
    .line 591
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 592
    .line 593
    .line 594
    move-result-object v2

    .line 595
    invoke-interface {v14, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 596
    .line 597
    .line 598
    :cond_2d
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endReplaceableGroup()V

    .line 599
    .line 600
    .line 601
    check-cast v2, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    .line 602
    .line 603
    move-object/from16 v19, p2

    .line 604
    .line 605
    move-object v7, v1

    .line 606
    move-object/from16 v21, v2

    .line 607
    .line 608
    goto :goto_20

    .line 609
    :cond_2e
    move-object/from16 v19, p2

    .line 610
    .line 611
    move-object/from16 v21, p9

    .line 612
    .line 613
    move-object v7, v1

    .line 614
    :goto_20
    move-object/from16 v20, v13

    .line 615
    .line 616
    move/from16 v1, v16

    .line 617
    .line 618
    move-object/from16 v8, v26

    .line 619
    .line 620
    move/from16 v9, v38

    .line 621
    .line 622
    :goto_21
    invoke-interface {v14}, Landroidx/compose/runtime/Composer;->endDefaults()V

    .line 623
    .line 624
    .line 625
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 626
    .line 627
    .line 628
    move-result v2

    .line 629
    if-eqz v2, :cond_2f

    .line 630
    .line 631
    const/4 v2, -0x1

    .line 632
    const-string v3, "androidx.compose.material3.SuggestionChip (Chip.kt:520)"

    .line 633
    .line 634
    const v4, 0xa2b9a45

    .line 635
    .line 636
    .line 637
    invoke-static {v4, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 638
    .line 639
    .line 640
    :cond_2f
    sget-object v2, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    .line 641
    .line 642
    invoke-virtual {v2, v14, v0}, Landroidx/compose/material3/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Typography;

    .line 643
    .line 644
    .line 645
    move-result-object v0

    .line 646
    sget-object v2, Landroidx/compose/material3/tokens/SuggestionChipTokens;->INSTANCE:Landroidx/compose/material3/tokens/SuggestionChipTokens;

    .line 647
    .line 648
    invoke-virtual {v2}, Landroidx/compose/material3/tokens/SuggestionChipTokens;->getLabelTextFont()Landroidx/compose/material3/tokens/TypographyKeyTokens;

    .line 649
    .line 650
    .line 651
    move-result-object v2

    .line 652
    invoke-static {v0, v2}, Landroidx/compose/material3/TypographyKt;->fromToken(Landroidx/compose/material3/Typography;Landroidx/compose/material3/tokens/TypographyKeyTokens;)Landroidx/compose/ui/text/TextStyle;

    .line 653
    .line 654
    .line 655
    move-result-object v4

    .line 656
    shr-int/lit8 v0, v1, 0x9

    .line 657
    .line 658
    and-int/lit8 v0, v0, 0xe

    .line 659
    .line 660
    shr-int/lit8 v2, v1, 0xf

    .line 661
    .line 662
    and-int/lit8 v3, v2, 0x70

    .line 663
    .line 664
    or-int/2addr v3, v0

    .line 665
    invoke-virtual {v8, v9, v14, v3}, Landroidx/compose/material3/ChipColors;->labelColor$material3_release(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 666
    .line 667
    .line 668
    move-result-object v3

    .line 669
    invoke-interface {v3}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 670
    .line 671
    .line 672
    move-result-object v3

    .line 673
    check-cast v3, Landroidx/compose/ui/graphics/Color;

    .line 674
    .line 675
    invoke-virtual {v3}, Landroidx/compose/ui/graphics/Color;->unbox-impl()J

    .line 676
    .line 677
    .line 678
    move-result-wide v5

    .line 679
    const/16 v16, 0x0

    .line 680
    .line 681
    if-nez v7, :cond_30

    .line 682
    .line 683
    move-object/from16 v0, v37

    .line 684
    .line 685
    goto :goto_22

    .line 686
    :cond_30
    shr-int/lit8 v3, v1, 0x15

    .line 687
    .line 688
    and-int/lit8 v3, v3, 0x70

    .line 689
    .line 690
    or-int/2addr v0, v3

    .line 691
    invoke-virtual {v7, v9, v14, v0}, Landroidx/compose/material3/ChipBorder;->borderStroke$material3_release(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    .line 692
    .line 693
    .line 694
    move-result-object v0

    .line 695
    :goto_22
    if-eqz v0, :cond_31

    .line 696
    .line 697
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 698
    .line 699
    .line 700
    move-result-object v0

    .line 701
    check-cast v0, Landroidx/compose/foundation/BorderStroke;

    .line 702
    .line 703
    move-object/from16 v37, v0

    .line 704
    .line 705
    :cond_31
    sget-object v0, Landroidx/compose/material3/SuggestionChipDefaults;->INSTANCE:Landroidx/compose/material3/SuggestionChipDefaults;

    .line 706
    .line 707
    invoke-virtual {v0}, Landroidx/compose/material3/SuggestionChipDefaults;->getHeight-D9Ej5fM()F

    .line 708
    .line 709
    .line 710
    move-result v13

    .line 711
    sget-object v0, Landroidx/compose/material3/ChipKt;->SuggestionChipPadding:Landroidx/compose/foundation/layout/PaddingValues;

    .line 712
    .line 713
    move-object/from16 v22, v14

    .line 714
    .line 715
    move-object v14, v0

    .line 716
    shr-int/lit8 v0, v1, 0x6

    .line 717
    .line 718
    and-int/lit8 v0, v0, 0xe

    .line 719
    .line 720
    const/high16 v3, 0xc00000

    .line 721
    .line 722
    or-int/2addr v0, v3

    .line 723
    shl-int/lit8 v3, v1, 0x3

    .line 724
    .line 725
    and-int/lit8 v3, v3, 0x70

    .line 726
    .line 727
    or-int/2addr v0, v3

    .line 728
    shr-int/lit8 v3, v1, 0x3

    .line 729
    .line 730
    and-int/lit16 v3, v3, 0x380

    .line 731
    .line 732
    or-int/2addr v0, v3

    .line 733
    shl-int/lit8 v3, v1, 0x6

    .line 734
    .line 735
    move-object/from16 p2, v7

    .line 736
    .line 737
    and-int/lit16 v7, v3, 0x1c00

    .line 738
    .line 739
    or-int/2addr v0, v7

    .line 740
    and-int v3, v3, v33

    .line 741
    .line 742
    or-int/2addr v0, v3

    .line 743
    shl-int/lit8 v3, v1, 0x9

    .line 744
    .line 745
    and-int v7, v3, v34

    .line 746
    .line 747
    or-int/2addr v0, v7

    .line 748
    and-int v3, v3, v35

    .line 749
    .line 750
    or-int v17, v0, v3

    .line 751
    .line 752
    shr-int/lit8 v0, v1, 0x15

    .line 753
    .line 754
    and-int/lit8 v0, v0, 0xe

    .line 755
    .line 756
    or-int/lit16 v0, v0, 0xd80

    .line 757
    .line 758
    and-int v1, v2, v32

    .line 759
    .line 760
    or-int v18, v0, v1

    .line 761
    .line 762
    move-object/from16 v0, v19

    .line 763
    .line 764
    move-object/from16 v1, p0

    .line 765
    .line 766
    move v2, v9

    .line 767
    move-object/from16 v3, p1

    .line 768
    .line 769
    move-object/from16 v23, p2

    .line 770
    .line 771
    move-object/from16 v7, v39

    .line 772
    .line 773
    move-object/from16 v26, v8

    .line 774
    .line 775
    move-object/from16 v8, v16

    .line 776
    .line 777
    move/from16 v38, v9

    .line 778
    .line 779
    move-object/from16 v9, v40

    .line 780
    .line 781
    move-object/from16 v10, v26

    .line 782
    .line 783
    move-object/from16 v11, v20

    .line 784
    .line 785
    move-object/from16 v12, v37

    .line 786
    .line 787
    move-object/from16 v15, v21

    .line 788
    .line 789
    move-object/from16 v16, v22

    .line 790
    .line 791
    invoke-static/range {v0 .. v18}, Landroidx/compose/material3/ChipKt;->Chip-nkUnTEs(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V

    .line 792
    .line 793
    .line 794
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 795
    .line 796
    .line 797
    move-result v0

    .line 798
    if-eqz v0, :cond_32

    .line 799
    .line 800
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 801
    .line 802
    .line 803
    :cond_32
    move-object/from16 v3, v19

    .line 804
    .line 805
    move-object/from16 v8, v20

    .line 806
    .line 807
    move-object/from16 v10, v21

    .line 808
    .line 809
    move-object/from16 v9, v23

    .line 810
    .line 811
    move-object/from16 v7, v26

    .line 812
    .line 813
    move/from16 v4, v38

    .line 814
    .line 815
    move-object/from16 v5, v39

    .line 816
    .line 817
    move-object/from16 v6, v40

    .line 818
    .line 819
    :goto_23
    invoke-interface/range {v22 .. v22}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 820
    .line 821
    .line 822
    move-result-object v13

    .line 823
    if-nez v13, :cond_33

    .line 824
    .line 825
    goto :goto_24

    .line 826
    :cond_33
    new-instance v14, Landroidx/compose/material3/ChipKt$SuggestionChip$2;

    .line 827
    .line 828
    move-object v0, v14

    .line 829
    move-object/from16 v1, p0

    .line 830
    .line 831
    move-object/from16 v2, p1

    .line 832
    .line 833
    move/from16 v11, p11

    .line 834
    .line 835
    move/from16 v12, p12

    .line 836
    .line 837
    invoke-direct/range {v0 .. v12}, Landroidx/compose/material3/ChipKt$SuggestionChip$2;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/material3/ChipBorder;Landroidx/compose/foundation/interaction/MutableInteractionSource;II)V

    .line 838
    .line 839
    .line 840
    invoke-interface {v13, v14}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    .line 841
    .line 842
    .line 843
    :goto_24
    return-void
.end method

.method public static final synthetic access$Chip-nkUnTEs(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p18}, Landroidx/compose/material3/ChipKt;->Chip-nkUnTEs(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ChipColors;Landroidx/compose/material3/ChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$ChipContent-fe0OD_I(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p14}, Landroidx/compose/material3/ChipKt;->ChipContent-fe0OD_I(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;JJFLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$SelectableChip-u0RnIRE(ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p18}, Landroidx/compose/material3/ChipKt;->SelectableChip-u0RnIRE(ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/SelectableChipColors;Landroidx/compose/material3/SelectableChipElevation;Landroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getHorizontalElementsPadding$p()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/ChipKt;->HorizontalElementsPadding:F

    .line 2
    .line 3
    return v0
.end method

.method private static final inputChipPadding(ZZZ)Landroidx/compose/foundation/layout/PaddingValues;
    .locals 8

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    if-nez p0, :cond_1

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    int-to-float p0, v0

    .line 10
    goto :goto_1

    .line 11
    :cond_1
    :goto_0
    int-to-float p0, v1

    .line 12
    :goto_1
    invoke-static {p0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    move v2, p0

    .line 17
    if-eqz p2, :cond_2

    .line 18
    .line 19
    int-to-float p0, v0

    .line 20
    goto :goto_2

    .line 21
    :cond_2
    int-to-float p0, v1

    .line 22
    :goto_2
    invoke-static {p0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    move v4, p0

    .line 27
    const/4 v3, 0x0

    .line 28
    const/4 v5, 0x0

    .line 29
    const/16 v6, 0xa

    .line 30
    .line 31
    const/4 v7, 0x0

    .line 32
    invoke-static/range {v2 .. v7}, Landroidx/compose/foundation/layout/PaddingKt;->PaddingValues-a9UjIt4$default(FFFFILjava/lang/Object;)Landroidx/compose/foundation/layout/PaddingValues;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method public static synthetic inputChipPadding$default(ZZZILjava/lang/Object;)Landroidx/compose/foundation/layout/PaddingValues;
    .locals 1

    .line 1
    and-int/lit8 p4, p3, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p4, :cond_0

    .line 5
    .line 6
    move p0, v0

    .line 7
    :cond_0
    and-int/lit8 p4, p3, 0x2

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    move p1, v0

    .line 12
    :cond_1
    and-int/lit8 p3, p3, 0x4

    .line 13
    .line 14
    if-eqz p3, :cond_2

    .line 15
    .line 16
    move p2, v0

    .line 17
    :cond_2
    invoke-static {p0, p1, p2}, Landroidx/compose/material3/ChipKt;->inputChipPadding(ZZZ)Landroidx/compose/foundation/layout/PaddingValues;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method
