.class public final Landroidx/compose/material3/TextFieldKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a4\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\u00da\u0002\u0010&\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0015\u0008\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c\u00a2\u0006\u0002\u0008\r2\u0015\u0008\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c\u00a2\u0006\u0002\u0008\r2\u0015\u0008\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c\u00a2\u0006\u0002\u0008\r2\u0015\u0008\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c\u00a2\u0006\u0002\u0008\r2\u0015\u0008\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c\u00a2\u0006\u0002\u0008\r2\u0015\u0008\u0002\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c\u00a2\u0006\u0002\u0008\r2\u0015\u0008\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c\u00a2\u0006\u0002\u0008\r2\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00162\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u00182\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001a2\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u001d2\u0008\u0008\u0002\u0010\u001f\u001a\u00020\u001d2\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010 2\u0008\u0008\u0002\u0010#\u001a\u00020\"2\u0008\u0008\u0002\u0010%\u001a\u00020$H\u0007\u00a2\u0006\u0004\u0008&\u0010\'\u001a\u00da\u0002\u0010&\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020(2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00030\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0015\u0008\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c\u00a2\u0006\u0002\u0008\r2\u0015\u0008\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c\u00a2\u0006\u0002\u0008\r2\u0015\u0008\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c\u00a2\u0006\u0002\u0008\r2\u0015\u0008\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c\u00a2\u0006\u0002\u0008\r2\u0015\u0008\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c\u00a2\u0006\u0002\u0008\r2\u0015\u0008\u0002\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c\u00a2\u0006\u0002\u0008\r2\u0015\u0008\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c\u00a2\u0006\u0002\u0008\r2\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u00162\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u00182\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001a2\u0008\u0008\u0002\u0010\u001c\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u001e\u001a\u00020\u001d2\u0008\u0008\u0002\u0010\u001f\u001a\u00020\u001d2\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010 2\u0008\u0008\u0002\u0010#\u001a\u00020\"2\u0008\u0008\u0002\u0010%\u001a\u00020$H\u0007\u00a2\u0006\u0004\u0008&\u0010)\u001a\u00ee\u0001\u00103\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0011\u0010*\u001a\r\u0012\u0004\u0012\u00020\u00030\u000c\u00a2\u0006\u0002\u0008\r2\u0013\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c\u00a2\u0006\u0002\u0008\r2\u0019\u0010\u000f\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u00a2\u0006\u0002\u0008\r2\u0013\u0010+\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c\u00a2\u0006\u0002\u0008\r2\u0013\u0010,\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c\u00a2\u0006\u0002\u0008\r2\u0013\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c\u00a2\u0006\u0002\u0008\r2\u0013\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c\u00a2\u0006\u0002\u0008\r2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010.\u001a\u00020-2\u0011\u0010/\u001a\r\u0012\u0004\u0012\u00020\u00030\u000c\u00a2\u0006\u0002\u0008\r2\u0013\u00100\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000c\u00a2\u0006\u0002\u0008\r2\u0006\u00102\u001a\u000201H\u0001\u00a2\u0006\u0004\u00083\u00104\u001a\u001b\u00106\u001a\u00020\u001d*\u00020\u001d2\u0006\u00105\u001a\u00020\u001dH\u0002\u00a2\u0006\u0004\u00086\u00107\u001aR\u0010C\u001a\u00020\u001d2\u0006\u00108\u001a\u00020\u001d2\u0006\u00109\u001a\u00020\u001d2\u0006\u0010:\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020\u001d2\u0006\u0010<\u001a\u00020\u001d2\u0006\u0010=\u001a\u00020\u001d2\u0006\u0010>\u001a\u00020\u001d2\u0006\u0010@\u001a\u00020?H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008A\u0010B\u001ar\u0010O\u001a\u00020\u001d2\u0006\u0010D\u001a\u00020\u001d2\u0006\u0010E\u001a\u00020\u001d2\u0006\u0010F\u001a\u00020\u001d2\u0006\u0010G\u001a\u00020\u001d2\u0006\u0010H\u001a\u00020\u001d2\u0006\u0010I\u001a\u00020\u001d2\u0006\u0010J\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020-2\u0006\u0010@\u001a\u00020?2\u0006\u0010L\u001a\u00020-2\u0006\u00102\u001a\u000201H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008M\u0010N\u001a\u00a1\u0001\u0010_\u001a\u00020\u0003*\u00020P2\u0006\u0010Q\u001a\u00020\u001d2\u0006\u0010R\u001a\u00020\u001d2\u0006\u0010T\u001a\u00020S2\u0008\u0010U\u001a\u0004\u0018\u00010S2\u0008\u0010V\u001a\u0004\u0018\u00010S2\u0008\u0010W\u001a\u0004\u0018\u00010S2\u0008\u0010X\u001a\u0004\u0018\u00010S2\u0008\u0010Y\u001a\u0004\u0018\u00010S2\u0008\u0010Z\u001a\u0004\u0018\u00010S2\u0006\u0010[\u001a\u00020S2\u0008\u0010\\\u001a\u0004\u0018\u00010S2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010]\u001a\u00020\u001d2\u0006\u0010^\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020-2\u0006\u0010L\u001a\u00020-H\u0002\u00a2\u0006\u0004\u0008_\u0010`\u001a\u0087\u0001\u0010b\u001a\u00020\u0003*\u00020P2\u0006\u0010Q\u001a\u00020\u001d2\u0006\u0010R\u001a\u00020\u001d2\u0006\u0010a\u001a\u00020S2\u0008\u0010V\u001a\u0004\u0018\u00010S2\u0008\u0010W\u001a\u0004\u0018\u00010S2\u0008\u0010X\u001a\u0004\u0018\u00010S2\u0008\u0010Y\u001a\u0004\u0018\u00010S2\u0008\u0010Z\u001a\u0004\u0018\u00010S2\u0006\u0010[\u001a\u00020S2\u0008\u0010\\\u001a\u0004\u0018\u00010S2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010L\u001a\u00020-2\u0006\u00102\u001a\u000201H\u0002\u00a2\u0006\u0004\u0008b\u0010c\u001a!\u0010g\u001a\u00020\u0005*\u00020\u00052\u000c\u0010f\u001a\u0008\u0012\u0004\u0012\u00020e0dH\u0000\u00a2\u0006\u0004\u0008g\u0010h\"\u001a\u0010j\u001a\u00020i8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008j\u0010k\u001a\u0004\u0008l\u0010m\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006n"
    }
    d2 = {
        "",
        "value",
        "Lkotlin/Function1;",
        "Ld6/s;",
        "onValueChange",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "enabled",
        "readOnly",
        "Landroidx/compose/ui/text/TextStyle;",
        "textStyle",
        "Lkotlin/Function0;",
        "Landroidx/compose/runtime/Composable;",
        "label",
        "placeholder",
        "leadingIcon",
        "trailingIcon",
        "prefix",
        "suffix",
        "supportingText",
        "isError",
        "Landroidx/compose/ui/text/input/VisualTransformation;",
        "visualTransformation",
        "Landroidx/compose/foundation/text/KeyboardOptions;",
        "keyboardOptions",
        "Landroidx/compose/foundation/text/KeyboardActions;",
        "keyboardActions",
        "singleLine",
        "",
        "maxLines",
        "minLines",
        "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
        "interactionSource",
        "Landroidx/compose/ui/graphics/Shape;",
        "shape",
        "Landroidx/compose/material3/TextFieldColors;",
        "colors",
        "TextField",
        "(Ljava/lang/String;Lr6/c;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lr6/e;Lr6/e;Lr6/e;Lr6/e;Lr6/e;Lr6/e;Lr6/e;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V",
        "Landroidx/compose/ui/text/input/TextFieldValue;",
        "(Landroidx/compose/ui/text/input/TextFieldValue;Lr6/c;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lr6/e;Lr6/e;Lr6/e;Lr6/e;Lr6/e;Lr6/e;Lr6/e;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V",
        "textField",
        "leading",
        "trailing",
        "",
        "animationProgress",
        "container",
        "supporting",
        "Landroidx/compose/foundation/layout/PaddingValues;",
        "paddingValues",
        "TextFieldLayout",
        "(Landroidx/compose/ui/Modifier;Lr6/e;Lr6/e;Lr6/f;Lr6/e;Lr6/e;Lr6/e;Lr6/e;ZFLr6/e;Lr6/e;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V",
        "from",
        "substractConstraintSafely",
        "(II)I",
        "leadingWidth",
        "trailingWidth",
        "prefixWidth",
        "suffixWidth",
        "textFieldWidth",
        "labelWidth",
        "placeholderWidth",
        "Landroidx/compose/ui/unit/Constraints;",
        "constraints",
        "calculateWidth-yeHjK3Y",
        "(IIIIIIIJ)I",
        "calculateWidth",
        "textFieldHeight",
        "labelHeight",
        "leadingHeight",
        "trailingHeight",
        "prefixHeight",
        "suffixHeight",
        "placeholderHeight",
        "supportingHeight",
        "density",
        "calculateHeight-mKXJcVc",
        "(IIIIIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I",
        "calculateHeight",
        "Landroidx/compose/ui/layout/Placeable$PlacementScope;",
        "width",
        "totalHeight",
        "Landroidx/compose/ui/layout/Placeable;",
        "textfieldPlaceable",
        "labelPlaceable",
        "placeholderPlaceable",
        "leadingPlaceable",
        "trailingPlaceable",
        "prefixPlaceable",
        "suffixPlaceable",
        "containerPlaceable",
        "supportingPlaceable",
        "labelEndPosition",
        "textPosition",
        "placeWithLabel",
        "(Landroidx/compose/ui/layout/Placeable$PlacementScope;IILandroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;ZIIFF)V",
        "textPlaceable",
        "placeWithoutLabel",
        "(Landroidx/compose/ui/layout/Placeable$PlacementScope;IILandroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;ZFLandroidx/compose/foundation/layout/PaddingValues;)V",
        "Landroidx/compose/runtime/State;",
        "Landroidx/compose/foundation/BorderStroke;",
        "indicatorBorder",
        "drawIndicatorLine",
        "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/State;)Landroidx/compose/ui/Modifier;",
        "Landroidx/compose/ui/unit/Dp;",
        "TextFieldWithLabelVerticalPadding",
        "F",
        "getTextFieldWithLabelVerticalPadding",
        "()F",
        "material3_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextField.kt\nandroidx/compose/material3/TextFieldKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1140:1\n77#2:1141\n77#2:1150\n77#2:1165\n1223#3,6:1142\n1223#3,6:1151\n1223#3,6:1159\n708#4:1148\n696#4:1149\n708#4:1157\n696#4:1158\n78#5,6:1166\n85#5,4:1181\n89#5,2:1191\n78#5,6:1200\n85#5,4:1215\n89#5,2:1225\n93#5:1231\n78#5,6:1239\n85#5,4:1254\n89#5,2:1264\n93#5:1270\n78#5,6:1285\n85#5,4:1300\n89#5,2:1310\n93#5:1316\n78#5,6:1325\n85#5,4:1340\n89#5,2:1350\n93#5:1356\n78#5,6:1365\n85#5,4:1380\n89#5,2:1390\n93#5:1396\n78#5,6:1407\n85#5,4:1422\n89#5,2:1432\n93#5:1438\n78#5,6:1447\n85#5,4:1462\n89#5,2:1472\n93#5:1478\n93#5:1482\n368#6,9:1172\n377#6:1193\n368#6,9:1206\n377#6:1227\n378#6,2:1229\n368#6,9:1245\n377#6:1266\n378#6,2:1268\n368#6,9:1291\n377#6:1312\n378#6,2:1314\n368#6,9:1331\n377#6:1352\n378#6,2:1354\n368#6,9:1371\n377#6:1392\n378#6,2:1394\n368#6,9:1413\n377#6:1434\n378#6,2:1436\n368#6,9:1453\n377#6:1474\n378#6,2:1476\n378#6,2:1480\n4032#7,6:1185\n4032#7,6:1219\n4032#7,6:1258\n4032#7,6:1304\n4032#7,6:1344\n4032#7,6:1384\n4032#7,6:1426\n4032#7,6:1466\n71#8:1194\n69#8,5:1195\n74#8:1228\n78#8:1232\n71#8:1233\n69#8,5:1234\n74#8:1267\n78#8:1271\n71#8:1278\n68#8,6:1279\n74#8:1313\n78#8:1317\n71#8:1318\n68#8,6:1319\n74#8:1353\n78#8:1357\n71#8:1358\n68#8,6:1359\n74#8:1393\n78#8:1397\n71#8:1400\n68#8,6:1401\n74#8:1435\n78#8:1439\n71#8:1440\n68#8,6:1441\n74#8:1475\n78#8:1479\n56#9:1272\n56#9:1275\n50#9:1483\n86#9:1484\n148#10:1273\n205#10:1274\n148#10:1276\n205#10:1277\n148#10:1398\n148#10:1399\n148#10:1485\n*S KotlinDebug\n*F\n+ 1 TextField.kt\nandroidx/compose/material3/TextFieldKt\n*L\n202#1:1141\n358#1:1150\n459#1:1165\n222#1:1142,6\n378#1:1151,6\n456#1:1159,6\n225#1:1148\n225#1:1149\n381#1:1157\n381#1:1158\n460#1:1166,6\n460#1:1181,4\n460#1:1191,2\n469#1:1200,6\n469#1:1215,4\n469#1:1225,2\n469#1:1231\n477#1:1239,6\n477#1:1254,4\n477#1:1264,2\n477#1:1270\n502#1:1285,6\n502#1:1300,4\n502#1:1310,2\n502#1:1316\n512#1:1325,6\n512#1:1340,4\n512#1:1350,2\n512#1:1356\n523#1:1365,6\n523#1:1380,4\n523#1:1390,2\n523#1:1396\n551#1:1407,6\n551#1:1422,4\n551#1:1432,2\n551#1:1438\n560#1:1447,6\n560#1:1462,4\n560#1:1472,2\n560#1:1478\n460#1:1482\n460#1:1172,9\n460#1:1193\n469#1:1206,9\n469#1:1227\n469#1:1229,2\n477#1:1245,9\n477#1:1266\n477#1:1268,2\n502#1:1291,9\n502#1:1312\n502#1:1314,2\n512#1:1331,9\n512#1:1352\n512#1:1354,2\n523#1:1371,9\n523#1:1392\n523#1:1394,2\n551#1:1413,9\n551#1:1434\n551#1:1436,2\n560#1:1453,9\n560#1:1474\n560#1:1476,2\n460#1:1480,2\n460#1:1185,6\n469#1:1219,6\n477#1:1258,6\n502#1:1304,6\n512#1:1344,6\n523#1:1384,6\n551#1:1426,6\n560#1:1466,6\n469#1:1194\n469#1:1195,5\n469#1:1228\n469#1:1232\n477#1:1233\n477#1:1234,5\n477#1:1267\n477#1:1271\n502#1:1278\n502#1:1279,6\n502#1:1313\n502#1:1317\n512#1:1318\n512#1:1319,6\n512#1:1353\n512#1:1357\n523#1:1358\n523#1:1359,6\n523#1:1393\n523#1:1397\n551#1:1400\n551#1:1401,6\n551#1:1435\n551#1:1439\n560#1:1440\n560#1:1441,6\n560#1:1475\n560#1:1479\n490#1:1272\n496#1:1275\n960#1:1483\n965#1:1484\n490#1:1273\n490#1:1274\n496#1:1276\n496#1:1277\n544#1:1398\n545#1:1399\n1139#1:1485\n*E\n"
    }
.end annotation


# static fields
.field private static final TextFieldWithLabelVerticalPadding:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

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
    sput v0, Landroidx/compose/material3/TextFieldKt;->TextFieldWithLabelVerticalPadding:F

    .line 9
    .line 10
    return-void
.end method

.method public static final TextField(Landroidx/compose/ui/text/input/TextFieldValue;Lr6/c;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lr6/e;Lr6/e;Lr6/e;Lr6/e;Lr6/e;Lr6/e;Lr6/e;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V
    .locals 65
    .param p0    # Landroidx/compose/ui/text/input/TextFieldValue;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/Modifier;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Landroidx/compose/ui/text/TextStyle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Lr6/e;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Lr6/e;
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
    .param p11    # Lr6/e;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p12    # Lr6/e;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p14    # Landroidx/compose/ui/text/input/VisualTransformation;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p15    # Landroidx/compose/foundation/text/KeyboardOptions;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p16    # Landroidx/compose/foundation/text/KeyboardActions;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p20    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p21    # Landroidx/compose/ui/graphics/Shape;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p22    # Landroidx/compose/material3/TextFieldColors;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p23    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/text/input/TextFieldValue;",
            "Lr6/c;",
            "Landroidx/compose/ui/Modifier;",
            "ZZ",
            "Landroidx/compose/ui/text/TextStyle;",
            "Lr6/e;",
            "Lr6/e;",
            "Lr6/e;",
            "Lr6/e;",
            "Lr6/e;",
            "Lr6/e;",
            "Lr6/e;",
            "Z",
            "Landroidx/compose/ui/text/input/VisualTransformation;",
            "Landroidx/compose/foundation/text/KeyboardOptions;",
            "Landroidx/compose/foundation/text/KeyboardActions;",
            "ZII",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/ui/graphics/Shape;",
            "Landroidx/compose/material3/TextFieldColors;",
            "Landroidx/compose/runtime/Composer;",
            "IIII)V"
        }
    .end annotation

    move/from16 v0, p24

    move/from16 v1, p25

    move/from16 v2, p26

    move/from16 v3, p27

    const v4, -0x4b9c3470

    move-object/from16 v5, p23

    .line 27
    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v4

    and-int/lit8 v5, v3, 0x1

    if-eqz v5, :cond_0

    or-int/lit8 v5, v0, 0x6

    move-object/from16 v12, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v0, 0x6

    move-object/from16 v12, p0

    if-nez v5, :cond_2

    invoke-interface {v4, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v0

    goto :goto_1

    :cond_2
    move v5, v0

    :goto_1
    and-int/lit8 v8, v3, 0x2

    if-eqz v8, :cond_3

    or-int/lit8 v5, v5, 0x30

    move-object/from16 v13, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v8, v0, 0x30

    move-object/from16 v13, p1

    if-nez v8, :cond_5

    invoke-interface {v4, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_2

    :cond_4
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v5, v8

    :cond_5
    :goto_3
    and-int/lit8 v8, v3, 0x4

    if-eqz v8, :cond_7

    or-int/lit16 v5, v5, 0x180

    :cond_6
    move-object/from16 v15, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v15, v0, 0x180

    if-nez v15, :cond_6

    move-object/from16 v15, p2

    invoke-interface {v4, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_8

    const/16 v16, 0x100

    goto :goto_4

    :cond_8
    const/16 v16, 0x80

    :goto_4
    or-int v5, v5, v16

    :goto_5
    and-int/lit8 v16, v3, 0x8

    const/16 v17, 0x400

    const/16 v18, 0x800

    if-eqz v16, :cond_a

    or-int/lit16 v5, v5, 0xc00

    :cond_9
    move/from16 v6, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v6, v0, 0xc00

    if-nez v6, :cond_9

    move/from16 v6, p3

    invoke-interface {v4, v6}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v19

    if-eqz v19, :cond_b

    move/from16 v19, v18

    goto :goto_6

    :cond_b
    move/from16 v19, v17

    :goto_6
    or-int v5, v5, v19

    :goto_7
    and-int/lit8 v19, v3, 0x10

    const/16 v20, 0x2000

    const/16 v21, 0x4000

    if-eqz v19, :cond_d

    or-int/lit16 v5, v5, 0x6000

    :cond_c
    move/from16 v7, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v7, v0, 0x6000

    if-nez v7, :cond_c

    move/from16 v7, p4

    invoke-interface {v4, v7}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v23

    if-eqz v23, :cond_e

    move/from16 v23, v21

    goto :goto_8

    :cond_e
    move/from16 v23, v20

    :goto_8
    or-int v5, v5, v23

    :goto_9
    const/high16 v23, 0x30000

    and-int v23, v0, v23

    if-nez v23, :cond_10

    and-int/lit8 v23, v3, 0x20

    move-object/from16 v9, p5

    if-nez v23, :cond_f

    invoke-interface {v4, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_f

    const/high16 v24, 0x20000

    goto :goto_a

    :cond_f
    const/high16 v24, 0x10000

    :goto_a
    or-int v5, v5, v24

    goto :goto_b

    :cond_10
    move-object/from16 v9, p5

    :goto_b
    and-int/lit8 v24, v3, 0x40

    const/high16 v25, 0x180000

    if-eqz v24, :cond_11

    or-int v5, v5, v25

    move-object/from16 v10, p6

    goto :goto_d

    :cond_11
    and-int v26, v0, v25

    move-object/from16 v10, p6

    if-nez v26, :cond_13

    invoke-interface {v4, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v27

    if-eqz v27, :cond_12

    const/high16 v27, 0x100000

    goto :goto_c

    :cond_12
    const/high16 v27, 0x80000

    :goto_c
    or-int v5, v5, v27

    :cond_13
    :goto_d
    and-int/lit16 v11, v3, 0x80

    const/high16 v28, 0x400000

    const/high16 v29, 0xc00000

    if-eqz v11, :cond_14

    or-int v5, v5, v29

    move-object/from16 v14, p7

    goto :goto_f

    :cond_14
    and-int v30, v0, v29

    move-object/from16 v14, p7

    if-nez v30, :cond_16

    invoke-interface {v4, v14}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v31

    if-eqz v31, :cond_15

    const/high16 v31, 0x800000

    goto :goto_e

    :cond_15
    move/from16 v31, v28

    :goto_e
    or-int v5, v5, v31

    :cond_16
    :goto_f
    and-int/lit16 v0, v3, 0x100

    const/high16 v31, 0x6000000

    if-eqz v0, :cond_18

    or-int v5, v5, v31

    :cond_17
    move/from16 v31, v0

    move-object/from16 v0, p8

    goto :goto_11

    :cond_18
    and-int v31, p24, v31

    if-nez v31, :cond_17

    move/from16 v31, v0

    move-object/from16 v0, p8

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v32

    if-eqz v32, :cond_19

    const/high16 v32, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v32, 0x2000000

    :goto_10
    or-int v5, v5, v32

    :goto_11
    and-int/lit16 v0, v3, 0x200

    const/high16 v32, 0x30000000

    if-eqz v0, :cond_1b

    or-int v5, v5, v32

    :cond_1a
    move/from16 v33, v0

    move-object/from16 v0, p9

    goto :goto_13

    :cond_1b
    and-int v33, p24, v32

    if-nez v33, :cond_1a

    move/from16 v33, v0

    move-object/from16 v0, p9

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v34

    if-eqz v34, :cond_1c

    const/high16 v34, 0x20000000

    goto :goto_12

    :cond_1c
    const/high16 v34, 0x10000000

    :goto_12
    or-int v5, v5, v34

    :goto_13
    and-int/lit16 v0, v3, 0x400

    if-eqz v0, :cond_1d

    or-int/lit8 v34, v1, 0x6

    move/from16 v35, v34

    move/from16 v34, v0

    move-object/from16 v0, p10

    goto :goto_15

    :cond_1d
    and-int/lit8 v34, v1, 0x6

    if-nez v34, :cond_1f

    move/from16 v34, v0

    move-object/from16 v0, p10

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v35

    if-eqz v35, :cond_1e

    const/16 v35, 0x4

    goto :goto_14

    :cond_1e
    const/16 v35, 0x2

    :goto_14
    or-int v35, v1, v35

    goto :goto_15

    :cond_1f
    move/from16 v34, v0

    move-object/from16 v0, p10

    move/from16 v35, v1

    :goto_15
    and-int/lit16 v0, v3, 0x800

    if-eqz v0, :cond_20

    or-int/lit8 v35, v35, 0x30

    move/from16 v36, v0

    :goto_16
    move/from16 v0, v35

    goto :goto_18

    :cond_20
    and-int/lit8 v36, v1, 0x30

    if-nez v36, :cond_22

    move/from16 v36, v0

    move-object/from16 v0, p11

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v37

    if-eqz v37, :cond_21

    const/16 v37, 0x20

    goto :goto_17

    :cond_21
    const/16 v37, 0x10

    :goto_17
    or-int v35, v35, v37

    goto :goto_16

    :cond_22
    move/from16 v36, v0

    move-object/from16 v0, p11

    goto :goto_16

    :goto_18
    move/from16 v35, v5

    and-int/lit16 v5, v3, 0x1000

    if-eqz v5, :cond_23

    or-int/lit16 v0, v0, 0x180

    goto :goto_1b

    :cond_23
    move/from16 v37, v0

    and-int/lit16 v0, v1, 0x180

    if-nez v0, :cond_25

    move-object/from16 v0, p12

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v38

    if-eqz v38, :cond_24

    const/16 v38, 0x100

    goto :goto_19

    :cond_24
    const/16 v38, 0x80

    :goto_19
    or-int v37, v37, v38

    :goto_1a
    move/from16 v0, v37

    goto :goto_1b

    :cond_25
    move-object/from16 v0, p12

    goto :goto_1a

    :goto_1b
    move/from16 v37, v5

    and-int/lit16 v5, v3, 0x2000

    if-eqz v5, :cond_26

    or-int/lit16 v0, v0, 0xc00

    goto :goto_1c

    :cond_26
    move/from16 v38, v0

    and-int/lit16 v0, v1, 0xc00

    if-nez v0, :cond_28

    move/from16 v0, p13

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v39

    if-eqz v39, :cond_27

    move/from16 v17, v18

    :cond_27
    or-int v17, v38, v17

    move/from16 v0, v17

    goto :goto_1c

    :cond_28
    move/from16 v0, p13

    move/from16 v0, v38

    :goto_1c
    move/from16 v17, v5

    and-int/lit16 v5, v3, 0x4000

    if-eqz v5, :cond_2a

    or-int/lit16 v0, v0, 0x6000

    move/from16 v18, v0

    :cond_29
    move-object/from16 v0, p14

    goto :goto_1d

    :cond_2a
    move/from16 v18, v0

    and-int/lit16 v0, v1, 0x6000

    if-nez v0, :cond_29

    move-object/from16 v0, p14

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v38

    if-eqz v38, :cond_2b

    move/from16 v20, v21

    :cond_2b
    or-int v18, v18, v20

    :goto_1d
    const v20, 0x8000

    and-int v20, v3, v20

    const/high16 v21, 0x30000

    if-eqz v20, :cond_2c

    or-int v18, v18, v21

    move-object/from16 v0, p15

    goto :goto_1f

    :cond_2c
    and-int v21, v1, v21

    move-object/from16 v0, p15

    if-nez v21, :cond_2e

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_2d

    const/high16 v21, 0x20000

    goto :goto_1e

    :cond_2d
    const/high16 v21, 0x10000

    :goto_1e
    or-int v18, v18, v21

    :cond_2e
    :goto_1f
    const/high16 v21, 0x10000

    and-int v21, v3, v21

    if-eqz v21, :cond_2f

    or-int v18, v18, v25

    move-object/from16 v0, p16

    goto :goto_21

    :cond_2f
    and-int v25, v1, v25

    move-object/from16 v0, p16

    if-nez v25, :cond_31

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_30

    const/high16 v25, 0x100000

    goto :goto_20

    :cond_30
    const/high16 v25, 0x80000

    :goto_20
    or-int v18, v18, v25

    :cond_31
    :goto_21
    const/high16 v25, 0x20000

    and-int v25, v3, v25

    if-eqz v25, :cond_32

    or-int v18, v18, v29

    move/from16 v0, p17

    goto :goto_23

    :cond_32
    and-int v29, v1, v29

    move/from16 v0, p17

    if-nez v29, :cond_34

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v29

    if-eqz v29, :cond_33

    const/high16 v29, 0x800000

    goto :goto_22

    :cond_33
    move/from16 v29, v28

    :goto_22
    or-int v18, v18, v29

    :cond_34
    :goto_23
    const/high16 v29, 0x6000000

    and-int v29, v1, v29

    if-nez v29, :cond_36

    const/high16 v29, 0x40000

    and-int v29, v3, v29

    move/from16 v0, p18

    if-nez v29, :cond_35

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v29

    if-eqz v29, :cond_35

    const/high16 v29, 0x4000000

    goto :goto_24

    :cond_35
    const/high16 v29, 0x2000000

    :goto_24
    or-int v18, v18, v29

    goto :goto_25

    :cond_36
    move/from16 v0, p18

    :goto_25
    const/high16 v29, 0x80000

    and-int v29, v3, v29

    if-eqz v29, :cond_37

    or-int v18, v18, v32

    move/from16 v0, p19

    goto :goto_27

    :cond_37
    and-int v32, v1, v32

    move/from16 v0, p19

    if-nez v32, :cond_39

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v32

    if-eqz v32, :cond_38

    const/high16 v32, 0x20000000

    goto :goto_26

    :cond_38
    const/high16 v32, 0x10000000

    :goto_26
    or-int v18, v18, v32

    :cond_39
    :goto_27
    const/high16 v32, 0x100000

    and-int v32, v3, v32

    if-eqz v32, :cond_3a

    or-int/lit8 v22, v2, 0x6

    move-object/from16 v0, p20

    goto :goto_29

    :cond_3a
    and-int/lit8 v38, v2, 0x6

    move-object/from16 v0, p20

    if-nez v38, :cond_3c

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v38

    if-eqz v38, :cond_3b

    const/16 v22, 0x4

    goto :goto_28

    :cond_3b
    const/16 v22, 0x2

    :goto_28
    or-int v22, v2, v22

    goto :goto_29

    :cond_3c
    move/from16 v22, v2

    :goto_29
    and-int/lit8 v38, v2, 0x30

    if-nez v38, :cond_3e

    const/high16 v38, 0x200000

    and-int v38, v3, v38

    move-object/from16 v0, p21

    if-nez v38, :cond_3d

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v38

    if-eqz v38, :cond_3d

    const/16 v23, 0x20

    goto :goto_2a

    :cond_3d
    const/16 v23, 0x10

    :goto_2a
    or-int v22, v22, v23

    goto :goto_2b

    :cond_3e
    move-object/from16 v0, p21

    :goto_2b
    and-int/lit16 v0, v2, 0x180

    if-nez v0, :cond_41

    and-int v0, v3, v28

    if-nez v0, :cond_3f

    move-object/from16 v0, p22

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_40

    const/16 v27, 0x100

    goto :goto_2c

    :cond_3f
    move-object/from16 v0, p22

    :cond_40
    const/16 v27, 0x80

    :goto_2c
    or-int v22, v22, v27

    :goto_2d
    move/from16 v0, v22

    goto :goto_2e

    :cond_41
    move-object/from16 v0, p22

    goto :goto_2d

    :goto_2e
    const v22, 0x12492493

    and-int v1, v35, v22

    const v2, 0x12492492

    if-ne v1, v2, :cond_43

    const v1, 0x12492493

    and-int v1, v18, v1

    const v2, 0x12492492

    if-ne v1, v2, :cond_43

    and-int/lit16 v0, v0, 0x93

    const/16 v1, 0x92

    if-ne v0, v1, :cond_43

    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_42

    goto :goto_2f

    .line 28
    :cond_42
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v26, p8

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move/from16 v18, p17

    move/from16 v19, p18

    move/from16 v20, p19

    move-object/from16 v21, p20

    move-object/from16 v22, p21

    move-object/from16 v23, p22

    move-object v0, v4

    move v4, v6

    move v5, v7

    move-object v6, v9

    move-object v7, v10

    move-object v8, v14

    move-object v9, v15

    move-object/from16 v10, p9

    move/from16 v14, p13

    move-object/from16 v15, p14

    goto/16 :goto_48

    .line 29
    :cond_43
    :goto_2f
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v0, p24, 0x1

    if-eqz v0, :cond_47

    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v0

    if-eqz v0, :cond_44

    goto :goto_33

    .line 30
    :cond_44
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v0, v3, 0x20

    if-eqz v0, :cond_45

    const v0, -0x70001

    and-int v5, v35, v0

    goto :goto_30

    :cond_45
    move/from16 v5, v35

    :goto_30
    const/high16 v0, 0x40000

    and-int/2addr v0, v3

    if-eqz v0, :cond_46

    const v0, -0xe000001

    and-int v18, v18, v0

    :cond_46
    move-object/from16 v26, p8

    move-object/from16 v27, p9

    move-object/from16 v28, p10

    move-object/from16 v29, p11

    move-object/from16 v30, p12

    move-object/from16 v22, p14

    move-object/from16 v17, p15

    move/from16 v19, p17

    move/from16 v20, p18

    move/from16 v21, p19

    move-object/from16 v1, p20

    move-object/from16 v31, p21

    move-object/from16 v11, p22

    move-object v0, v9

    move-object/from16 v24, v10

    move-object/from16 v25, v14

    move-object v9, v15

    move/from16 v2, v18

    move/from16 v10, p13

    move-object/from16 v18, p16

    :goto_31
    move v14, v6

    move v15, v7

    :goto_32
    const/4 v6, 0x0

    goto/16 :goto_44

    :cond_47
    :goto_33
    if-eqz v8, :cond_48

    .line 31
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    move-object v15, v0

    :cond_48
    if-eqz v16, :cond_49

    const/4 v6, 0x1

    :cond_49
    if-eqz v19, :cond_4a

    const/4 v7, 0x0

    :cond_4a
    and-int/lit8 v0, v3, 0x20

    if-eqz v0, :cond_4b

    .line 32
    invoke-static {}, Landroidx/compose/material3/TextKt;->getLocalTextStyle()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    .line 33
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/text/TextStyle;

    const v8, -0x70001

    and-int v8, v35, v8

    move-object v9, v0

    goto :goto_34

    :cond_4b
    move/from16 v8, v35

    :goto_34
    const/4 v0, 0x0

    if-eqz v24, :cond_4c

    move-object v10, v0

    :cond_4c
    if-eqz v11, :cond_4d

    move-object v14, v0

    :cond_4d
    if-eqz v31, :cond_4e

    move-object v11, v0

    goto :goto_35

    :cond_4e
    move-object/from16 v11, p8

    :goto_35
    if-eqz v33, :cond_4f

    move-object/from16 v16, v0

    goto :goto_36

    :cond_4f
    move-object/from16 v16, p9

    :goto_36
    if-eqz v34, :cond_50

    move-object/from16 v19, v0

    goto :goto_37

    :cond_50
    move-object/from16 v19, p10

    :goto_37
    if-eqz v36, :cond_51

    move-object/from16 v22, v0

    goto :goto_38

    :cond_51
    move-object/from16 v22, p11

    :goto_38
    if-eqz v37, :cond_52

    move-object/from16 v23, v0

    goto :goto_39

    :cond_52
    move-object/from16 v23, p12

    :goto_39
    if-eqz v17, :cond_53

    const/16 v17, 0x0

    goto :goto_3a

    :cond_53
    move/from16 v17, p13

    :goto_3a
    if-eqz v5, :cond_54

    .line 34
    sget-object v5, Landroidx/compose/ui/text/input/VisualTransformation;->Companion:Landroidx/compose/ui/text/input/VisualTransformation$Companion;

    invoke-virtual {v5}, Landroidx/compose/ui/text/input/VisualTransformation$Companion;->getNone()Landroidx/compose/ui/text/input/VisualTransformation;

    move-result-object v5

    goto :goto_3b

    :cond_54
    move-object/from16 v5, p14

    :goto_3b
    if-eqz v20, :cond_55

    .line 35
    sget-object v20, Landroidx/compose/foundation/text/KeyboardOptions;->Companion:Landroidx/compose/foundation/text/KeyboardOptions$Companion;

    invoke-virtual/range {v20 .. v20}, Landroidx/compose/foundation/text/KeyboardOptions$Companion;->getDefault()Landroidx/compose/foundation/text/KeyboardOptions;

    move-result-object v20

    goto :goto_3c

    :cond_55
    move-object/from16 v20, p15

    :goto_3c
    if-eqz v21, :cond_56

    .line 36
    sget-object v21, Landroidx/compose/foundation/text/KeyboardActions;->Companion:Landroidx/compose/foundation/text/KeyboardActions$Companion;

    invoke-virtual/range {v21 .. v21}, Landroidx/compose/foundation/text/KeyboardActions$Companion;->getDefault()Landroidx/compose/foundation/text/KeyboardActions;

    move-result-object v21

    goto :goto_3d

    :cond_56
    move-object/from16 v21, p16

    :goto_3d
    if-eqz v25, :cond_57

    const/16 v24, 0x0

    goto :goto_3e

    :cond_57
    move/from16 v24, p17

    :goto_3e
    const/high16 v25, 0x40000

    and-int v25, v3, v25

    if-eqz v25, :cond_59

    if-eqz v24, :cond_58

    const/16 v25, 0x1

    goto :goto_3f

    :cond_58
    const v25, 0x7fffffff

    :goto_3f
    const v26, -0xe000001

    and-int v18, v18, v26

    goto :goto_40

    :cond_59
    move/from16 v25, p18

    :goto_40
    if-eqz v29, :cond_5a

    const/16 v26, 0x1

    goto :goto_41

    :cond_5a
    move/from16 v26, p19

    :goto_41
    if-eqz v32, :cond_5b

    goto :goto_42

    :cond_5b
    move-object/from16 v0, p20

    :goto_42
    const/high16 v27, 0x200000

    and-int v27, v3, v27

    const/4 v2, 0x6

    if-eqz v27, :cond_5c

    .line 37
    sget-object v1, Landroidx/compose/material3/TextFieldDefaults;->INSTANCE:Landroidx/compose/material3/TextFieldDefaults;

    invoke-virtual {v1, v4, v2}, Landroidx/compose/material3/TextFieldDefaults;->getShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    move-result-object v1

    goto :goto_43

    :cond_5c
    move-object/from16 v1, p21

    :goto_43
    and-int v28, v3, v28

    move-object/from16 p2, v0

    if-eqz v28, :cond_5d

    .line 38
    sget-object v0, Landroidx/compose/material3/TextFieldDefaults;->INSTANCE:Landroidx/compose/material3/TextFieldDefaults;

    invoke-virtual {v0, v4, v2}, Landroidx/compose/material3/TextFieldDefaults;->colors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TextFieldColors;

    move-result-object v0

    move-object/from16 v31, v1

    move-object/from16 v27, v16

    move/from16 v2, v18

    move-object/from16 v28, v19

    move-object/from16 v18, v21

    move-object/from16 v29, v22

    move-object/from16 v30, v23

    move/from16 v19, v24

    move/from16 v21, v26

    move-object/from16 v1, p2

    move-object/from16 v22, v5

    move v5, v8

    move-object/from16 v24, v10

    move-object/from16 v26, v11

    move/from16 v10, v17

    move-object/from16 v17, v20

    move/from16 v20, v25

    move-object v11, v0

    move-object v0, v9

    move-object/from16 v25, v14

    move-object v9, v15

    goto/16 :goto_31

    :cond_5d
    move-object/from16 v31, v1

    move-object v0, v9

    move-object v9, v15

    move-object/from16 v27, v16

    move/from16 v2, v18

    move-object/from16 v28, v19

    move-object/from16 v18, v21

    move-object/from16 v29, v22

    move-object/from16 v30, v23

    move/from16 v19, v24

    move/from16 v21, v26

    move-object/from16 v1, p2

    move-object/from16 v22, v5

    move v15, v7

    move v5, v8

    move-object/from16 v24, v10

    move-object/from16 v26, v11

    move/from16 v10, v17

    move-object/from16 v17, v20

    move/from16 v20, v25

    move-object/from16 v11, p22

    move-object/from16 v25, v14

    move v14, v6

    goto/16 :goto_32

    :goto_44
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v7

    if-eqz v7, :cond_5e

    const v7, -0x4b9c3470

    const-string v8, "androidx.compose.material3.TextField (TextField.kt:375)"

    .line 39
    invoke-static {v7, v5, v2, v8}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_5e
    const v2, -0x1e4b253a

    .line 40
    invoke-interface {v4, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    if-nez v1, :cond_60

    .line 41
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    .line 42
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v5

    if-ne v2, v5, :cond_5f

    .line 43
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-result-object v2

    .line 44
    invoke-interface {v4, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 45
    :cond_5f
    check-cast v2, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    goto :goto_45

    :cond_60
    move-object v2, v1

    :goto_45
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const v5, -0x1e4b0d5c

    invoke-interface {v4, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 46
    invoke-virtual {v0}, Landroidx/compose/ui/text/TextStyle;->getColor-0d7_KjU()J

    move-result-wide v7

    const-wide/16 v32, 0x10

    cmp-long v5, v7, v32

    if-eqz v5, :cond_61

    :goto_46
    move-wide/from16 v33, v7

    goto :goto_47

    .line 47
    :cond_61
    invoke-static {v2, v4, v6}, Landroidx/compose/foundation/interaction/FocusInteractionKt;->collectIsFocusedAsState(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v5

    invoke-interface {v5}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    .line 48
    invoke-virtual {v11, v14, v10, v5}, Landroidx/compose/material3/TextFieldColors;->textColor-XeAY9LY$material3_release(ZZZ)J

    move-result-wide v7

    goto :goto_46

    .line 49
    :goto_47
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 50
    new-instance v32, Landroidx/compose/ui/text/TextStyle;

    const v62, 0xfffffe

    const/16 v63, 0x0

    const-wide/16 v35, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const-wide/16 v42, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const-wide/16 v47, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const-wide/16 v54, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    invoke-direct/range {v32 .. v63}, Landroidx/compose/ui/text/TextStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILkotlin/jvm/internal/e;)V

    move-object/from16 v5, v32

    invoke-virtual {v0, v5}, Landroidx/compose/ui/text/TextStyle;->merge(Landroidx/compose/ui/text/TextStyle;)Landroidx/compose/ui/text/TextStyle;

    move-result-object v16

    .line 51
    invoke-static {}, Landroidx/compose/foundation/text/selection/TextSelectionColorsKt;->getLocalTextSelectionColors()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v5

    invoke-virtual {v11}, Landroidx/compose/material3/TextFieldColors;->getTextSelectionColors()Landroidx/compose/foundation/text/selection/TextSelectionColors;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    move-result-object v5

    new-instance v8, Landroidx/compose/material3/TextFieldKt$TextField$3;

    move-object/from16 v23, v2

    invoke-direct/range {v8 .. v31}, Landroidx/compose/material3/TextFieldKt$TextField$3;-><init>(Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/text/input/TextFieldValue;Lr6/c;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lr6/e;Lr6/e;Lr6/e;Lr6/e;Lr6/e;Lr6/e;Lr6/e;Landroidx/compose/ui/graphics/Shape;)V

    const/16 v2, 0x36

    const v6, -0x455dffb0

    const/4 v7, 0x1

    invoke-static {v6, v7, v8, v4, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v2

    sget v6, Landroidx/compose/runtime/ProvidedValue;->$stable:I

    or-int/lit8 v6, v6, 0x30

    invoke-static {v5, v2, v4, v6}, Landroidx/compose/runtime/CompositionLocalKt;->CompositionLocalProvider(Landroidx/compose/runtime/ProvidedValue;Lr6/e;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_62

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_62
    move-object v6, v0

    move-object v0, v4

    move-object/from16 v23, v11

    move v4, v14

    move v5, v15

    move-object/from16 v16, v17

    move-object/from16 v17, v18

    move/from16 v18, v19

    move/from16 v19, v20

    move/from16 v20, v21

    move-object/from16 v15, v22

    move-object/from16 v7, v24

    move-object/from16 v8, v25

    move-object/from16 v11, v28

    move-object/from16 v12, v29

    move-object/from16 v13, v30

    move-object/from16 v22, v31

    move-object/from16 v21, v1

    move v14, v10

    move-object/from16 v10, v27

    .line 52
    :goto_48
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_63

    move-object v1, v0

    new-instance v0, Landroidx/compose/material3/TextFieldKt$TextField$4;

    move-object/from16 v2, p1

    move/from16 v24, p24

    move/from16 v25, p25

    move-object/from16 v64, v1

    move/from16 v27, v3

    move-object v3, v9

    move-object/from16 v9, v26

    move-object/from16 v1, p0

    move/from16 v26, p26

    invoke-direct/range {v0 .. v27}, Landroidx/compose/material3/TextFieldKt$TextField$4;-><init>(Landroidx/compose/ui/text/input/TextFieldValue;Lr6/c;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lr6/e;Lr6/e;Lr6/e;Lr6/e;Lr6/e;Lr6/e;Lr6/e;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;IIII)V

    move-object/from16 v1, v64

    invoke-interface {v1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    :cond_63
    return-void
.end method

.method public static final TextField(Ljava/lang/String;Lr6/c;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lr6/e;Lr6/e;Lr6/e;Lr6/e;Lr6/e;Lr6/e;Lr6/e;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V
    .locals 65
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/compose/ui/Modifier;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Landroidx/compose/ui/text/TextStyle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Lr6/e;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Lr6/e;
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
    .param p11    # Lr6/e;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p12    # Lr6/e;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p14    # Landroidx/compose/ui/text/input/VisualTransformation;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p15    # Landroidx/compose/foundation/text/KeyboardOptions;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p16    # Landroidx/compose/foundation/text/KeyboardActions;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p20    # Landroidx/compose/foundation/interaction/MutableInteractionSource;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p21    # Landroidx/compose/ui/graphics/Shape;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p22    # Landroidx/compose/material3/TextFieldColors;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p23    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lr6/c;",
            "Landroidx/compose/ui/Modifier;",
            "ZZ",
            "Landroidx/compose/ui/text/TextStyle;",
            "Lr6/e;",
            "Lr6/e;",
            "Lr6/e;",
            "Lr6/e;",
            "Lr6/e;",
            "Lr6/e;",
            "Lr6/e;",
            "Z",
            "Landroidx/compose/ui/text/input/VisualTransformation;",
            "Landroidx/compose/foundation/text/KeyboardOptions;",
            "Landroidx/compose/foundation/text/KeyboardActions;",
            "ZII",
            "Landroidx/compose/foundation/interaction/MutableInteractionSource;",
            "Landroidx/compose/ui/graphics/Shape;",
            "Landroidx/compose/material3/TextFieldColors;",
            "Landroidx/compose/runtime/Composer;",
            "IIII)V"
        }
    .end annotation

    move/from16 v0, p24

    move/from16 v1, p25

    move/from16 v2, p26

    move/from16 v3, p27

    const v4, -0x284ea3bd

    move-object/from16 v5, p23

    .line 1
    invoke-interface {v5, v4}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v4

    and-int/lit8 v5, v3, 0x1

    if-eqz v5, :cond_0

    or-int/lit8 v5, v0, 0x6

    move-object/from16 v12, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v0, 0x6

    move-object/from16 v12, p0

    if-nez v5, :cond_2

    invoke-interface {v4, v12}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v0

    goto :goto_1

    :cond_2
    move v5, v0

    :goto_1
    and-int/lit8 v8, v3, 0x2

    if-eqz v8, :cond_3

    or-int/lit8 v5, v5, 0x30

    move-object/from16 v13, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v8, v0, 0x30

    move-object/from16 v13, p1

    if-nez v8, :cond_5

    invoke-interface {v4, v13}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_2

    :cond_4
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v5, v8

    :cond_5
    :goto_3
    and-int/lit8 v8, v3, 0x4

    if-eqz v8, :cond_7

    or-int/lit16 v5, v5, 0x180

    :cond_6
    move-object/from16 v15, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v15, v0, 0x180

    if-nez v15, :cond_6

    move-object/from16 v15, p2

    invoke-interface {v4, v15}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_8

    const/16 v16, 0x100

    goto :goto_4

    :cond_8
    const/16 v16, 0x80

    :goto_4
    or-int v5, v5, v16

    :goto_5
    and-int/lit8 v16, v3, 0x8

    const/16 v17, 0x400

    const/16 v18, 0x800

    if-eqz v16, :cond_a

    or-int/lit16 v5, v5, 0xc00

    :cond_9
    move/from16 v6, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v6, v0, 0xc00

    if-nez v6, :cond_9

    move/from16 v6, p3

    invoke-interface {v4, v6}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v19

    if-eqz v19, :cond_b

    move/from16 v19, v18

    goto :goto_6

    :cond_b
    move/from16 v19, v17

    :goto_6
    or-int v5, v5, v19

    :goto_7
    and-int/lit8 v19, v3, 0x10

    const/16 v20, 0x2000

    const/16 v21, 0x4000

    if-eqz v19, :cond_d

    or-int/lit16 v5, v5, 0x6000

    :cond_c
    move/from16 v7, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v7, v0, 0x6000

    if-nez v7, :cond_c

    move/from16 v7, p4

    invoke-interface {v4, v7}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v23

    if-eqz v23, :cond_e

    move/from16 v23, v21

    goto :goto_8

    :cond_e
    move/from16 v23, v20

    :goto_8
    or-int v5, v5, v23

    :goto_9
    const/high16 v23, 0x30000

    and-int v23, v0, v23

    if-nez v23, :cond_10

    and-int/lit8 v23, v3, 0x20

    move-object/from16 v9, p5

    if-nez v23, :cond_f

    invoke-interface {v4, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_f

    const/high16 v24, 0x20000

    goto :goto_a

    :cond_f
    const/high16 v24, 0x10000

    :goto_a
    or-int v5, v5, v24

    goto :goto_b

    :cond_10
    move-object/from16 v9, p5

    :goto_b
    and-int/lit8 v24, v3, 0x40

    const/high16 v25, 0x180000

    if-eqz v24, :cond_11

    or-int v5, v5, v25

    move-object/from16 v10, p6

    goto :goto_d

    :cond_11
    and-int v26, v0, v25

    move-object/from16 v10, p6

    if-nez v26, :cond_13

    invoke-interface {v4, v10}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v27

    if-eqz v27, :cond_12

    const/high16 v27, 0x100000

    goto :goto_c

    :cond_12
    const/high16 v27, 0x80000

    :goto_c
    or-int v5, v5, v27

    :cond_13
    :goto_d
    and-int/lit16 v11, v3, 0x80

    const/high16 v28, 0x400000

    const/high16 v29, 0xc00000

    if-eqz v11, :cond_14

    or-int v5, v5, v29

    move-object/from16 v14, p7

    goto :goto_f

    :cond_14
    and-int v30, v0, v29

    move-object/from16 v14, p7

    if-nez v30, :cond_16

    invoke-interface {v4, v14}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v31

    if-eqz v31, :cond_15

    const/high16 v31, 0x800000

    goto :goto_e

    :cond_15
    move/from16 v31, v28

    :goto_e
    or-int v5, v5, v31

    :cond_16
    :goto_f
    and-int/lit16 v0, v3, 0x100

    const/high16 v31, 0x6000000

    if-eqz v0, :cond_18

    or-int v5, v5, v31

    :cond_17
    move/from16 v31, v0

    move-object/from16 v0, p8

    goto :goto_11

    :cond_18
    and-int v31, p24, v31

    if-nez v31, :cond_17

    move/from16 v31, v0

    move-object/from16 v0, p8

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v32

    if-eqz v32, :cond_19

    const/high16 v32, 0x4000000

    goto :goto_10

    :cond_19
    const/high16 v32, 0x2000000

    :goto_10
    or-int v5, v5, v32

    :goto_11
    and-int/lit16 v0, v3, 0x200

    const/high16 v32, 0x30000000

    if-eqz v0, :cond_1b

    or-int v5, v5, v32

    :cond_1a
    move/from16 v33, v0

    move-object/from16 v0, p9

    goto :goto_13

    :cond_1b
    and-int v33, p24, v32

    if-nez v33, :cond_1a

    move/from16 v33, v0

    move-object/from16 v0, p9

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v34

    if-eqz v34, :cond_1c

    const/high16 v34, 0x20000000

    goto :goto_12

    :cond_1c
    const/high16 v34, 0x10000000

    :goto_12
    or-int v5, v5, v34

    :goto_13
    and-int/lit16 v0, v3, 0x400

    if-eqz v0, :cond_1d

    or-int/lit8 v34, v1, 0x6

    move/from16 v35, v34

    move/from16 v34, v0

    move-object/from16 v0, p10

    goto :goto_15

    :cond_1d
    and-int/lit8 v34, v1, 0x6

    if-nez v34, :cond_1f

    move/from16 v34, v0

    move-object/from16 v0, p10

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v35

    if-eqz v35, :cond_1e

    const/16 v35, 0x4

    goto :goto_14

    :cond_1e
    const/16 v35, 0x2

    :goto_14
    or-int v35, v1, v35

    goto :goto_15

    :cond_1f
    move/from16 v34, v0

    move-object/from16 v0, p10

    move/from16 v35, v1

    :goto_15
    and-int/lit16 v0, v3, 0x800

    if-eqz v0, :cond_20

    or-int/lit8 v35, v35, 0x30

    move/from16 v36, v0

    :goto_16
    move/from16 v0, v35

    goto :goto_18

    :cond_20
    and-int/lit8 v36, v1, 0x30

    if-nez v36, :cond_22

    move/from16 v36, v0

    move-object/from16 v0, p11

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v37

    if-eqz v37, :cond_21

    const/16 v37, 0x20

    goto :goto_17

    :cond_21
    const/16 v37, 0x10

    :goto_17
    or-int v35, v35, v37

    goto :goto_16

    :cond_22
    move/from16 v36, v0

    move-object/from16 v0, p11

    goto :goto_16

    :goto_18
    move/from16 v35, v5

    and-int/lit16 v5, v3, 0x1000

    if-eqz v5, :cond_23

    or-int/lit16 v0, v0, 0x180

    goto :goto_1b

    :cond_23
    move/from16 v37, v0

    and-int/lit16 v0, v1, 0x180

    if-nez v0, :cond_25

    move-object/from16 v0, p12

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v38

    if-eqz v38, :cond_24

    const/16 v38, 0x100

    goto :goto_19

    :cond_24
    const/16 v38, 0x80

    :goto_19
    or-int v37, v37, v38

    :goto_1a
    move/from16 v0, v37

    goto :goto_1b

    :cond_25
    move-object/from16 v0, p12

    goto :goto_1a

    :goto_1b
    move/from16 v37, v5

    and-int/lit16 v5, v3, 0x2000

    if-eqz v5, :cond_26

    or-int/lit16 v0, v0, 0xc00

    goto :goto_1c

    :cond_26
    move/from16 v38, v0

    and-int/lit16 v0, v1, 0xc00

    if-nez v0, :cond_28

    move/from16 v0, p13

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v39

    if-eqz v39, :cond_27

    move/from16 v17, v18

    :cond_27
    or-int v17, v38, v17

    move/from16 v0, v17

    goto :goto_1c

    :cond_28
    move/from16 v0, p13

    move/from16 v0, v38

    :goto_1c
    move/from16 v17, v5

    and-int/lit16 v5, v3, 0x4000

    if-eqz v5, :cond_2a

    or-int/lit16 v0, v0, 0x6000

    move/from16 v18, v0

    :cond_29
    move-object/from16 v0, p14

    goto :goto_1d

    :cond_2a
    move/from16 v18, v0

    and-int/lit16 v0, v1, 0x6000

    if-nez v0, :cond_29

    move-object/from16 v0, p14

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v38

    if-eqz v38, :cond_2b

    move/from16 v20, v21

    :cond_2b
    or-int v18, v18, v20

    :goto_1d
    const v20, 0x8000

    and-int v20, v3, v20

    const/high16 v21, 0x30000

    if-eqz v20, :cond_2c

    or-int v18, v18, v21

    move-object/from16 v0, p15

    goto :goto_1f

    :cond_2c
    and-int v21, v1, v21

    move-object/from16 v0, p15

    if-nez v21, :cond_2e

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_2d

    const/high16 v21, 0x20000

    goto :goto_1e

    :cond_2d
    const/high16 v21, 0x10000

    :goto_1e
    or-int v18, v18, v21

    :cond_2e
    :goto_1f
    const/high16 v21, 0x10000

    and-int v21, v3, v21

    if-eqz v21, :cond_2f

    or-int v18, v18, v25

    move-object/from16 v0, p16

    goto :goto_21

    :cond_2f
    and-int v25, v1, v25

    move-object/from16 v0, p16

    if-nez v25, :cond_31

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_30

    const/high16 v25, 0x100000

    goto :goto_20

    :cond_30
    const/high16 v25, 0x80000

    :goto_20
    or-int v18, v18, v25

    :cond_31
    :goto_21
    const/high16 v25, 0x20000

    and-int v25, v3, v25

    if-eqz v25, :cond_32

    or-int v18, v18, v29

    move/from16 v0, p17

    goto :goto_23

    :cond_32
    and-int v29, v1, v29

    move/from16 v0, p17

    if-nez v29, :cond_34

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v29

    if-eqz v29, :cond_33

    const/high16 v29, 0x800000

    goto :goto_22

    :cond_33
    move/from16 v29, v28

    :goto_22
    or-int v18, v18, v29

    :cond_34
    :goto_23
    const/high16 v29, 0x6000000

    and-int v29, v1, v29

    if-nez v29, :cond_36

    const/high16 v29, 0x40000

    and-int v29, v3, v29

    move/from16 v0, p18

    if-nez v29, :cond_35

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v29

    if-eqz v29, :cond_35

    const/high16 v29, 0x4000000

    goto :goto_24

    :cond_35
    const/high16 v29, 0x2000000

    :goto_24
    or-int v18, v18, v29

    goto :goto_25

    :cond_36
    move/from16 v0, p18

    :goto_25
    const/high16 v29, 0x80000

    and-int v29, v3, v29

    if-eqz v29, :cond_37

    or-int v18, v18, v32

    move/from16 v0, p19

    goto :goto_27

    :cond_37
    and-int v32, v1, v32

    move/from16 v0, p19

    if-nez v32, :cond_39

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v32

    if-eqz v32, :cond_38

    const/high16 v32, 0x20000000

    goto :goto_26

    :cond_38
    const/high16 v32, 0x10000000

    :goto_26
    or-int v18, v18, v32

    :cond_39
    :goto_27
    const/high16 v32, 0x100000

    and-int v32, v3, v32

    if-eqz v32, :cond_3a

    or-int/lit8 v22, v2, 0x6

    move-object/from16 v0, p20

    goto :goto_29

    :cond_3a
    and-int/lit8 v38, v2, 0x6

    move-object/from16 v0, p20

    if-nez v38, :cond_3c

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v38

    if-eqz v38, :cond_3b

    const/16 v22, 0x4

    goto :goto_28

    :cond_3b
    const/16 v22, 0x2

    :goto_28
    or-int v22, v2, v22

    goto :goto_29

    :cond_3c
    move/from16 v22, v2

    :goto_29
    and-int/lit8 v38, v2, 0x30

    if-nez v38, :cond_3e

    const/high16 v38, 0x200000

    and-int v38, v3, v38

    move-object/from16 v0, p21

    if-nez v38, :cond_3d

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v38

    if-eqz v38, :cond_3d

    const/16 v23, 0x20

    goto :goto_2a

    :cond_3d
    const/16 v23, 0x10

    :goto_2a
    or-int v22, v22, v23

    goto :goto_2b

    :cond_3e
    move-object/from16 v0, p21

    :goto_2b
    and-int/lit16 v0, v2, 0x180

    if-nez v0, :cond_41

    and-int v0, v3, v28

    if-nez v0, :cond_3f

    move-object/from16 v0, p22

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_40

    const/16 v27, 0x100

    goto :goto_2c

    :cond_3f
    move-object/from16 v0, p22

    :cond_40
    const/16 v27, 0x80

    :goto_2c
    or-int v22, v22, v27

    :goto_2d
    move/from16 v0, v22

    goto :goto_2e

    :cond_41
    move-object/from16 v0, p22

    goto :goto_2d

    :goto_2e
    const v22, 0x12492493

    and-int v1, v35, v22

    const v2, 0x12492492

    if-ne v1, v2, :cond_43

    const v1, 0x12492493

    and-int v1, v18, v1

    const v2, 0x12492492

    if-ne v1, v2, :cond_43

    and-int/lit16 v0, v0, 0x93

    const/16 v1, 0x92

    if-ne v0, v1, :cond_43

    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_42

    goto :goto_2f

    .line 2
    :cond_42
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    move-object/from16 v26, p8

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move/from16 v18, p17

    move/from16 v19, p18

    move/from16 v20, p19

    move-object/from16 v21, p20

    move-object/from16 v22, p21

    move-object/from16 v23, p22

    move-object v0, v4

    move v4, v6

    move v5, v7

    move-object v6, v9

    move-object v7, v10

    move-object v8, v14

    move-object v9, v15

    move-object/from16 v10, p9

    move/from16 v14, p13

    move-object/from16 v15, p14

    goto/16 :goto_48

    .line 3
    :cond_43
    :goto_2f
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startDefaults()V

    and-int/lit8 v0, p24, 0x1

    if-eqz v0, :cond_47

    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v0

    if-eqz v0, :cond_44

    goto :goto_33

    .line 4
    :cond_44
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v0, v3, 0x20

    if-eqz v0, :cond_45

    const v0, -0x70001

    and-int v5, v35, v0

    goto :goto_30

    :cond_45
    move/from16 v5, v35

    :goto_30
    const/high16 v0, 0x40000

    and-int/2addr v0, v3

    if-eqz v0, :cond_46

    const v0, -0xe000001

    and-int v18, v18, v0

    :cond_46
    move-object/from16 v26, p8

    move-object/from16 v27, p9

    move-object/from16 v28, p10

    move-object/from16 v29, p11

    move-object/from16 v30, p12

    move-object/from16 v22, p14

    move-object/from16 v17, p15

    move/from16 v19, p17

    move/from16 v20, p18

    move/from16 v21, p19

    move-object/from16 v1, p20

    move-object/from16 v31, p21

    move-object/from16 v11, p22

    move-object v0, v9

    move-object/from16 v24, v10

    move-object/from16 v25, v14

    move-object v9, v15

    move/from16 v2, v18

    move/from16 v10, p13

    move-object/from16 v18, p16

    :goto_31
    move v14, v6

    move v15, v7

    :goto_32
    const/4 v6, 0x0

    goto/16 :goto_44

    :cond_47
    :goto_33
    if-eqz v8, :cond_48

    .line 5
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    move-object v15, v0

    :cond_48
    if-eqz v16, :cond_49

    const/4 v6, 0x1

    :cond_49
    if-eqz v19, :cond_4a

    const/4 v7, 0x0

    :cond_4a
    and-int/lit8 v0, v3, 0x20

    if-eqz v0, :cond_4b

    .line 6
    invoke-static {}, Landroidx/compose/material3/TextKt;->getLocalTextStyle()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    .line 7
    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/text/TextStyle;

    const v8, -0x70001

    and-int v8, v35, v8

    move-object v9, v0

    goto :goto_34

    :cond_4b
    move/from16 v8, v35

    :goto_34
    const/4 v0, 0x0

    if-eqz v24, :cond_4c

    move-object v10, v0

    :cond_4c
    if-eqz v11, :cond_4d

    move-object v14, v0

    :cond_4d
    if-eqz v31, :cond_4e

    move-object v11, v0

    goto :goto_35

    :cond_4e
    move-object/from16 v11, p8

    :goto_35
    if-eqz v33, :cond_4f

    move-object/from16 v16, v0

    goto :goto_36

    :cond_4f
    move-object/from16 v16, p9

    :goto_36
    if-eqz v34, :cond_50

    move-object/from16 v19, v0

    goto :goto_37

    :cond_50
    move-object/from16 v19, p10

    :goto_37
    if-eqz v36, :cond_51

    move-object/from16 v22, v0

    goto :goto_38

    :cond_51
    move-object/from16 v22, p11

    :goto_38
    if-eqz v37, :cond_52

    move-object/from16 v23, v0

    goto :goto_39

    :cond_52
    move-object/from16 v23, p12

    :goto_39
    if-eqz v17, :cond_53

    const/16 v17, 0x0

    goto :goto_3a

    :cond_53
    move/from16 v17, p13

    :goto_3a
    if-eqz v5, :cond_54

    .line 8
    sget-object v5, Landroidx/compose/ui/text/input/VisualTransformation;->Companion:Landroidx/compose/ui/text/input/VisualTransformation$Companion;

    invoke-virtual {v5}, Landroidx/compose/ui/text/input/VisualTransformation$Companion;->getNone()Landroidx/compose/ui/text/input/VisualTransformation;

    move-result-object v5

    goto :goto_3b

    :cond_54
    move-object/from16 v5, p14

    :goto_3b
    if-eqz v20, :cond_55

    .line 9
    sget-object v20, Landroidx/compose/foundation/text/KeyboardOptions;->Companion:Landroidx/compose/foundation/text/KeyboardOptions$Companion;

    invoke-virtual/range {v20 .. v20}, Landroidx/compose/foundation/text/KeyboardOptions$Companion;->getDefault()Landroidx/compose/foundation/text/KeyboardOptions;

    move-result-object v20

    goto :goto_3c

    :cond_55
    move-object/from16 v20, p15

    :goto_3c
    if-eqz v21, :cond_56

    .line 10
    sget-object v21, Landroidx/compose/foundation/text/KeyboardActions;->Companion:Landroidx/compose/foundation/text/KeyboardActions$Companion;

    invoke-virtual/range {v21 .. v21}, Landroidx/compose/foundation/text/KeyboardActions$Companion;->getDefault()Landroidx/compose/foundation/text/KeyboardActions;

    move-result-object v21

    goto :goto_3d

    :cond_56
    move-object/from16 v21, p16

    :goto_3d
    if-eqz v25, :cond_57

    const/16 v24, 0x0

    goto :goto_3e

    :cond_57
    move/from16 v24, p17

    :goto_3e
    const/high16 v25, 0x40000

    and-int v25, v3, v25

    if-eqz v25, :cond_59

    if-eqz v24, :cond_58

    const/16 v25, 0x1

    goto :goto_3f

    :cond_58
    const v25, 0x7fffffff

    :goto_3f
    const v26, -0xe000001

    and-int v18, v18, v26

    goto :goto_40

    :cond_59
    move/from16 v25, p18

    :goto_40
    if-eqz v29, :cond_5a

    const/16 v26, 0x1

    goto :goto_41

    :cond_5a
    move/from16 v26, p19

    :goto_41
    if-eqz v32, :cond_5b

    goto :goto_42

    :cond_5b
    move-object/from16 v0, p20

    :goto_42
    const/high16 v27, 0x200000

    and-int v27, v3, v27

    const/4 v2, 0x6

    if-eqz v27, :cond_5c

    .line 11
    sget-object v1, Landroidx/compose/material3/TextFieldDefaults;->INSTANCE:Landroidx/compose/material3/TextFieldDefaults;

    invoke-virtual {v1, v4, v2}, Landroidx/compose/material3/TextFieldDefaults;->getShape(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;

    move-result-object v1

    goto :goto_43

    :cond_5c
    move-object/from16 v1, p21

    :goto_43
    and-int v28, v3, v28

    move-object/from16 p2, v0

    if-eqz v28, :cond_5d

    .line 12
    sget-object v0, Landroidx/compose/material3/TextFieldDefaults;->INSTANCE:Landroidx/compose/material3/TextFieldDefaults;

    invoke-virtual {v0, v4, v2}, Landroidx/compose/material3/TextFieldDefaults;->colors(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TextFieldColors;

    move-result-object v0

    move-object/from16 v31, v1

    move-object/from16 v27, v16

    move/from16 v2, v18

    move-object/from16 v28, v19

    move-object/from16 v18, v21

    move-object/from16 v29, v22

    move-object/from16 v30, v23

    move/from16 v19, v24

    move/from16 v21, v26

    move-object/from16 v1, p2

    move-object/from16 v22, v5

    move v5, v8

    move-object/from16 v24, v10

    move-object/from16 v26, v11

    move/from16 v10, v17

    move-object/from16 v17, v20

    move/from16 v20, v25

    move-object v11, v0

    move-object v0, v9

    move-object/from16 v25, v14

    move-object v9, v15

    goto/16 :goto_31

    :cond_5d
    move-object/from16 v31, v1

    move-object v0, v9

    move-object v9, v15

    move-object/from16 v27, v16

    move/from16 v2, v18

    move-object/from16 v28, v19

    move-object/from16 v18, v21

    move-object/from16 v29, v22

    move-object/from16 v30, v23

    move/from16 v19, v24

    move/from16 v21, v26

    move-object/from16 v1, p2

    move-object/from16 v22, v5

    move v15, v7

    move v5, v8

    move-object/from16 v24, v10

    move-object/from16 v26, v11

    move/from16 v10, v17

    move-object/from16 v17, v20

    move/from16 v20, v25

    move-object/from16 v11, p22

    move-object/from16 v25, v14

    move v14, v6

    goto/16 :goto_32

    :goto_44
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v7

    if-eqz v7, :cond_5e

    const v7, -0x284ea3bd

    const-string v8, "androidx.compose.material3.TextField (TextField.kt:219)"

    .line 13
    invoke-static {v7, v5, v2, v8}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_5e
    const v2, -0x1e4f53da

    .line 14
    invoke-interface {v4, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    if-nez v1, :cond_60

    .line 15
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    .line 16
    sget-object v5, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v5}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v5

    if-ne v2, v5, :cond_5f

    .line 17
    invoke-static {}, Landroidx/compose/foundation/interaction/InteractionSourceKt;->MutableInteractionSource()Landroidx/compose/foundation/interaction/MutableInteractionSource;

    move-result-object v2

    .line 18
    invoke-interface {v4, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 19
    :cond_5f
    check-cast v2, Landroidx/compose/foundation/interaction/MutableInteractionSource;

    goto :goto_45

    :cond_60
    move-object v2, v1

    :goto_45
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    const v5, -0x1e4f3bfc

    invoke-interface {v4, v5}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 20
    invoke-virtual {v0}, Landroidx/compose/ui/text/TextStyle;->getColor-0d7_KjU()J

    move-result-wide v7

    const-wide/16 v32, 0x10

    cmp-long v5, v7, v32

    if-eqz v5, :cond_61

    :goto_46
    move-wide/from16 v33, v7

    goto :goto_47

    .line 21
    :cond_61
    invoke-static {v2, v4, v6}, Landroidx/compose/foundation/interaction/FocusInteractionKt;->collectIsFocusedAsState(Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;

    move-result-object v5

    invoke-interface {v5}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    .line 22
    invoke-virtual {v11, v14, v10, v5}, Landroidx/compose/material3/TextFieldColors;->textColor-XeAY9LY$material3_release(ZZZ)J

    move-result-wide v7

    goto :goto_46

    .line 23
    :goto_47
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 24
    new-instance v32, Landroidx/compose/ui/text/TextStyle;

    const v62, 0xfffffe

    const/16 v63, 0x0

    const-wide/16 v35, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const-wide/16 v42, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const-wide/16 v47, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const-wide/16 v54, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    invoke-direct/range {v32 .. v63}, Landroidx/compose/ui/text/TextStyle;-><init>(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;ILkotlin/jvm/internal/e;)V

    move-object/from16 v5, v32

    invoke-virtual {v0, v5}, Landroidx/compose/ui/text/TextStyle;->merge(Landroidx/compose/ui/text/TextStyle;)Landroidx/compose/ui/text/TextStyle;

    move-result-object v16

    .line 25
    invoke-static {}, Landroidx/compose/foundation/text/selection/TextSelectionColorsKt;->getLocalTextSelectionColors()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v5

    invoke-virtual {v11}, Landroidx/compose/material3/TextFieldColors;->getTextSelectionColors()Landroidx/compose/foundation/text/selection/TextSelectionColors;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroidx/compose/runtime/ProvidableCompositionLocal;->provides(Ljava/lang/Object;)Landroidx/compose/runtime/ProvidedValue;

    move-result-object v5

    new-instance v8, Landroidx/compose/material3/TextFieldKt$TextField$1;

    move-object/from16 v23, v2

    invoke-direct/range {v8 .. v31}, Landroidx/compose/material3/TextFieldKt$TextField$1;-><init>(Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/TextFieldColors;Ljava/lang/String;Lr6/c;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lr6/e;Lr6/e;Lr6/e;Lr6/e;Lr6/e;Lr6/e;Lr6/e;Landroidx/compose/ui/graphics/Shape;)V

    const/16 v2, 0x36

    const v6, 0x6ed05103

    const/4 v7, 0x1

    invoke-static {v6, v7, v8, v4, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->rememberComposableLambda(IZLjava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object v2

    sget v6, Landroidx/compose/runtime/ProvidedValue;->$stable:I

    or-int/lit8 v6, v6, 0x30

    invoke-static {v5, v2, v4, v6}, Landroidx/compose/runtime/CompositionLocalKt;->CompositionLocalProvider(Landroidx/compose/runtime/ProvidedValue;Lr6/e;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_62

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_62
    move-object v6, v0

    move-object v0, v4

    move-object/from16 v23, v11

    move v4, v14

    move v5, v15

    move-object/from16 v16, v17

    move-object/from16 v17, v18

    move/from16 v18, v19

    move/from16 v19, v20

    move/from16 v20, v21

    move-object/from16 v15, v22

    move-object/from16 v7, v24

    move-object/from16 v8, v25

    move-object/from16 v11, v28

    move-object/from16 v12, v29

    move-object/from16 v13, v30

    move-object/from16 v22, v31

    move-object/from16 v21, v1

    move v14, v10

    move-object/from16 v10, v27

    .line 26
    :goto_48
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object v0

    if-eqz v0, :cond_63

    move-object v1, v0

    new-instance v0, Landroidx/compose/material3/TextFieldKt$TextField$2;

    move-object/from16 v2, p1

    move/from16 v24, p24

    move/from16 v25, p25

    move-object/from16 v64, v1

    move/from16 v27, v3

    move-object v3, v9

    move-object/from16 v9, v26

    move-object/from16 v1, p0

    move/from16 v26, p26

    invoke-direct/range {v0 .. v27}, Landroidx/compose/material3/TextFieldKt$TextField$2;-><init>(Ljava/lang/String;Lr6/c;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lr6/e;Lr6/e;Lr6/e;Lr6/e;Lr6/e;Lr6/e;Lr6/e;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;IIII)V

    move-object/from16 v1, v64

    invoke-interface {v1, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    :cond_63
    return-void
.end method

.method public static final TextFieldLayout(Landroidx/compose/ui/Modifier;Lr6/e;Lr6/e;Lr6/f;Lr6/e;Lr6/e;Lr6/e;Lr6/e;ZFLr6/e;Lr6/e;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V
    .locals 38
    .param p0    # Landroidx/compose/ui/Modifier;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lr6/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lr6/e;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lr6/f;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Lr6/e;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Lr6/e;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Lr6/e;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Lr6/e;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p10    # Lr6/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p11    # Lr6/e;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p12    # Landroidx/compose/foundation/layout/PaddingValues;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p13    # Landroidx/compose/runtime/Composer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/compose/runtime/Composable;
    .end annotation

    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lr6/e;",
            "Lr6/e;",
            "Lr6/f;",
            "Lr6/e;",
            "Lr6/e;",
            "Lr6/e;",
            "Lr6/e;",
            "ZF",
            "Lr6/e;",
            "Lr6/e;",
            "Landroidx/compose/foundation/layout/PaddingValues;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v4, p3

    .line 8
    .line 9
    move-object/from16 v5, p4

    .line 10
    .line 11
    move-object/from16 v6, p5

    .line 12
    .line 13
    move-object/from16 v7, p6

    .line 14
    .line 15
    move-object/from16 v8, p7

    .line 16
    .line 17
    move/from16 v9, p8

    .line 18
    .line 19
    move/from16 v10, p9

    .line 20
    .line 21
    move-object/from16 v11, p10

    .line 22
    .line 23
    move-object/from16 v12, p11

    .line 24
    .line 25
    move/from16 v14, p14

    .line 26
    .line 27
    move/from16 v15, p15

    .line 28
    .line 29
    const v0, -0x6d184570

    .line 30
    .line 31
    .line 32
    move-object/from16 v13, p13

    .line 33
    .line 34
    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    .line 35
    .line 36
    .line 37
    move-result-object v13

    .line 38
    and-int/lit8 v16, v14, 0x6

    .line 39
    .line 40
    const/16 v17, 0x4

    .line 41
    .line 42
    if-nez v16, :cond_1

    .line 43
    .line 44
    invoke-interface {v13, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v16

    .line 48
    if-eqz v16, :cond_0

    .line 49
    .line 50
    move/from16 v16, v17

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    const/16 v16, 0x2

    .line 54
    .line 55
    :goto_0
    or-int v16, v14, v16

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    move/from16 v16, v14

    .line 59
    .line 60
    :goto_1
    and-int/lit8 v19, v14, 0x30

    .line 61
    .line 62
    const/16 v20, 0x10

    .line 63
    .line 64
    const/16 v21, 0x20

    .line 65
    .line 66
    if-nez v19, :cond_3

    .line 67
    .line 68
    invoke-interface {v13, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v19

    .line 72
    if-eqz v19, :cond_2

    .line 73
    .line 74
    move/from16 v19, v21

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_2
    move/from16 v19, v20

    .line 78
    .line 79
    :goto_2
    or-int v16, v16, v19

    .line 80
    .line 81
    :cond_3
    and-int/lit16 v0, v14, 0x180

    .line 82
    .line 83
    const/16 v19, 0x80

    .line 84
    .line 85
    move/from16 v22, v0

    .line 86
    .line 87
    if-nez v22, :cond_5

    .line 88
    .line 89
    invoke-interface {v13, v3}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v22

    .line 93
    if-eqz v22, :cond_4

    .line 94
    .line 95
    const/16 v22, 0x100

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_4
    move/from16 v22, v19

    .line 99
    .line 100
    :goto_3
    or-int v16, v16, v22

    .line 101
    .line 102
    :cond_5
    and-int/lit16 v0, v14, 0xc00

    .line 103
    .line 104
    if-nez v0, :cond_7

    .line 105
    .line 106
    invoke-interface {v13, v4}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-eqz v0, :cond_6

    .line 111
    .line 112
    const/16 v0, 0x800

    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_6
    const/16 v0, 0x400

    .line 116
    .line 117
    :goto_4
    or-int v16, v16, v0

    .line 118
    .line 119
    :cond_7
    and-int/lit16 v0, v14, 0x6000

    .line 120
    .line 121
    if-nez v0, :cond_9

    .line 122
    .line 123
    invoke-interface {v13, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-eqz v0, :cond_8

    .line 128
    .line 129
    const/16 v0, 0x4000

    .line 130
    .line 131
    goto :goto_5

    .line 132
    :cond_8
    const/16 v0, 0x2000

    .line 133
    .line 134
    :goto_5
    or-int v16, v16, v0

    .line 135
    .line 136
    :cond_9
    const/high16 v0, 0x30000

    .line 137
    .line 138
    and-int/2addr v0, v14

    .line 139
    if-nez v0, :cond_b

    .line 140
    .line 141
    invoke-interface {v13, v6}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-eqz v0, :cond_a

    .line 146
    .line 147
    const/high16 v0, 0x20000

    .line 148
    .line 149
    goto :goto_6

    .line 150
    :cond_a
    const/high16 v0, 0x10000

    .line 151
    .line 152
    :goto_6
    or-int v16, v16, v0

    .line 153
    .line 154
    :cond_b
    const/high16 v0, 0x180000

    .line 155
    .line 156
    and-int/2addr v0, v14

    .line 157
    if-nez v0, :cond_d

    .line 158
    .line 159
    invoke-interface {v13, v7}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    if-eqz v0, :cond_c

    .line 164
    .line 165
    const/high16 v0, 0x100000

    .line 166
    .line 167
    goto :goto_7

    .line 168
    :cond_c
    const/high16 v0, 0x80000

    .line 169
    .line 170
    :goto_7
    or-int v16, v16, v0

    .line 171
    .line 172
    :cond_d
    const/high16 v0, 0xc00000

    .line 173
    .line 174
    and-int/2addr v0, v14

    .line 175
    if-nez v0, :cond_f

    .line 176
    .line 177
    invoke-interface {v13, v8}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    if-eqz v0, :cond_e

    .line 182
    .line 183
    const/high16 v0, 0x800000

    .line 184
    .line 185
    goto :goto_8

    .line 186
    :cond_e
    const/high16 v0, 0x400000

    .line 187
    .line 188
    :goto_8
    or-int v16, v16, v0

    .line 189
    .line 190
    :cond_f
    const/high16 v0, 0x6000000

    .line 191
    .line 192
    and-int/2addr v0, v14

    .line 193
    move/from16 v23, v0

    .line 194
    .line 195
    if-nez v23, :cond_11

    .line 196
    .line 197
    invoke-interface {v13, v9}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    .line 198
    .line 199
    .line 200
    move-result v23

    .line 201
    if-eqz v23, :cond_10

    .line 202
    .line 203
    const/high16 v23, 0x4000000

    .line 204
    .line 205
    goto :goto_9

    .line 206
    :cond_10
    const/high16 v23, 0x2000000

    .line 207
    .line 208
    :goto_9
    or-int v16, v16, v23

    .line 209
    .line 210
    :cond_11
    const/high16 v23, 0x30000000

    .line 211
    .line 212
    and-int v23, v14, v23

    .line 213
    .line 214
    if-nez v23, :cond_13

    .line 215
    .line 216
    invoke-interface {v13, v10}, Landroidx/compose/runtime/Composer;->changed(F)Z

    .line 217
    .line 218
    .line 219
    move-result v23

    .line 220
    if-eqz v23, :cond_12

    .line 221
    .line 222
    const/high16 v23, 0x20000000

    .line 223
    .line 224
    goto :goto_a

    .line 225
    :cond_12
    const/high16 v23, 0x10000000

    .line 226
    .line 227
    :goto_a
    or-int v16, v16, v23

    .line 228
    .line 229
    :cond_13
    move/from16 v0, v16

    .line 230
    .line 231
    and-int/lit8 v16, v15, 0x6

    .line 232
    .line 233
    if-nez v16, :cond_15

    .line 234
    .line 235
    invoke-interface {v13, v11}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v16

    .line 239
    if-eqz v16, :cond_14

    .line 240
    .line 241
    goto :goto_b

    .line 242
    :cond_14
    const/16 v17, 0x2

    .line 243
    .line 244
    :goto_b
    or-int v16, v15, v17

    .line 245
    .line 246
    goto :goto_c

    .line 247
    :cond_15
    move/from16 v16, v15

    .line 248
    .line 249
    :goto_c
    and-int/lit8 v17, v15, 0x30

    .line 250
    .line 251
    if-nez v17, :cond_17

    .line 252
    .line 253
    invoke-interface {v13, v12}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v17

    .line 257
    if-eqz v17, :cond_16

    .line 258
    .line 259
    move/from16 v20, v21

    .line 260
    .line 261
    :cond_16
    or-int v16, v16, v20

    .line 262
    .line 263
    :cond_17
    and-int/lit16 v14, v15, 0x180

    .line 264
    .line 265
    if-nez v14, :cond_19

    .line 266
    .line 267
    move-object/from16 v14, p12

    .line 268
    .line 269
    invoke-interface {v13, v14}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    move-result v17

    .line 273
    if-eqz v17, :cond_18

    .line 274
    .line 275
    const/16 v19, 0x100

    .line 276
    .line 277
    :cond_18
    or-int v16, v16, v19

    .line 278
    .line 279
    :goto_d
    move/from16 v15, v16

    .line 280
    .line 281
    goto :goto_e

    .line 282
    :cond_19
    move-object/from16 v14, p12

    .line 283
    .line 284
    goto :goto_d

    .line 285
    :goto_e
    const v16, 0x12492493

    .line 286
    .line 287
    .line 288
    and-int v12, v0, v16

    .line 289
    .line 290
    const v2, 0x12492492

    .line 291
    .line 292
    .line 293
    if-ne v12, v2, :cond_1b

    .line 294
    .line 295
    and-int/lit16 v2, v15, 0x93

    .line 296
    .line 297
    const/16 v12, 0x92

    .line 298
    .line 299
    if-ne v2, v12, :cond_1b

    .line 300
    .line 301
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    .line 302
    .line 303
    .line 304
    move-result v2

    .line 305
    if-nez v2, :cond_1a

    .line 306
    .line 307
    goto :goto_f

    .line 308
    :cond_1a
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    .line 309
    .line 310
    .line 311
    move-object/from16 v3, p1

    .line 312
    .line 313
    move-object/from16 v1, p11

    .line 314
    .line 315
    move-object v12, v4

    .line 316
    goto/16 :goto_22

    .line 317
    .line 318
    :cond_1b
    :goto_f
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    .line 319
    .line 320
    .line 321
    move-result v2

    .line 322
    if-eqz v2, :cond_1c

    .line 323
    .line 324
    const-string v2, "androidx.compose.material3.TextFieldLayout (TextField.kt:453)"

    .line 325
    .line 326
    const v12, -0x6d184570

    .line 327
    .line 328
    .line 329
    invoke-static {v12, v0, v15, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 330
    .line 331
    .line 332
    :cond_1c
    const/high16 v2, 0xe000000

    .line 333
    .line 334
    and-int/2addr v2, v0

    .line 335
    const/high16 v12, 0x4000000

    .line 336
    .line 337
    if-ne v2, v12, :cond_1d

    .line 338
    .line 339
    const/4 v2, 0x1

    .line 340
    goto :goto_10

    .line 341
    :cond_1d
    const/4 v2, 0x0

    .line 342
    :goto_10
    const/high16 v12, 0x70000000

    .line 343
    .line 344
    and-int/2addr v12, v0

    .line 345
    move/from16 v18, v0

    .line 346
    .line 347
    const/high16 v0, 0x20000000

    .line 348
    .line 349
    if-ne v12, v0, :cond_1e

    .line 350
    .line 351
    const/4 v0, 0x1

    .line 352
    goto :goto_11

    .line 353
    :cond_1e
    const/4 v0, 0x0

    .line 354
    :goto_11
    or-int/2addr v0, v2

    .line 355
    and-int/lit16 v2, v15, 0x380

    .line 356
    .line 357
    const/16 v12, 0x100

    .line 358
    .line 359
    if-ne v2, v12, :cond_1f

    .line 360
    .line 361
    const/4 v2, 0x1

    .line 362
    goto :goto_12

    .line 363
    :cond_1f
    const/4 v2, 0x0

    .line 364
    :goto_12
    or-int/2addr v0, v2

    .line 365
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v2

    .line 369
    if-nez v0, :cond_20

    .line 370
    .line 371
    sget-object v0, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    .line 372
    .line 373
    invoke-virtual {v0}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    if-ne v2, v0, :cond_21

    .line 378
    .line 379
    :cond_20
    new-instance v2, Landroidx/compose/material3/TextFieldMeasurePolicy;

    .line 380
    .line 381
    invoke-direct {v2, v9, v10, v14}, Landroidx/compose/material3/TextFieldMeasurePolicy;-><init>(ZFLandroidx/compose/foundation/layout/PaddingValues;)V

    .line 382
    .line 383
    .line 384
    invoke-interface {v13, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 385
    .line 386
    .line 387
    :cond_21
    check-cast v2, Landroidx/compose/material3/TextFieldMeasurePolicy;

    .line 388
    .line 389
    invoke-static {}, Landroidx/compose/ui/platform/CompositionLocalsKt;->getLocalLayoutDirection()Landroidx/compose/runtime/ProvidableCompositionLocal;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    check-cast v0, Landroidx/compose/ui/unit/LayoutDirection;

    .line 398
    .line 399
    const/4 v12, 0x0

    .line 400
    invoke-static {v13, v12}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 401
    .line 402
    .line 403
    move-result v9

    .line 404
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 405
    .line 406
    .line 407
    move-result-object v12

    .line 408
    move/from16 v19, v15

    .line 409
    .line 410
    invoke-static {v13, v1}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 411
    .line 412
    .line 413
    move-result-object v15

    .line 414
    sget-object v1, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    .line 415
    .line 416
    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 417
    .line 418
    .line 419
    move-result-object v4

    .line 420
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 421
    .line 422
    .line 423
    move-result-object v20

    .line 424
    if-nez v20, :cond_22

    .line 425
    .line 426
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 427
    .line 428
    .line 429
    :cond_22
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 430
    .line 431
    .line 432
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 433
    .line 434
    .line 435
    move-result v20

    .line 436
    if-eqz v20, :cond_23

    .line 437
    .line 438
    invoke-interface {v13, v4}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 439
    .line 440
    .line 441
    goto :goto_13

    .line 442
    :cond_23
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 443
    .line 444
    .line 445
    :goto_13
    invoke-static {v13}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 446
    .line 447
    .line 448
    move-result-object v4

    .line 449
    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lr6/e;

    .line 450
    .line 451
    .line 452
    move-result-object v3

    .line 453
    invoke-static {v4, v2, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 454
    .line 455
    .line 456
    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lr6/e;

    .line 457
    .line 458
    .line 459
    move-result-object v2

    .line 460
    invoke-static {v4, v12, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 461
    .line 462
    .line 463
    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lr6/e;

    .line 464
    .line 465
    .line 466
    move-result-object v2

    .line 467
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 468
    .line 469
    .line 470
    move-result v3

    .line 471
    if-nez v3, :cond_24

    .line 472
    .line 473
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v3

    .line 477
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 478
    .line 479
    .line 480
    move-result-object v12

    .line 481
    invoke-static {v3, v12}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 482
    .line 483
    .line 484
    move-result v3

    .line 485
    if-nez v3, :cond_25

    .line 486
    .line 487
    :cond_24
    invoke-static {v9, v4, v9, v2}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 488
    .line 489
    .line 490
    :cond_25
    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 491
    .line 492
    .line 493
    move-result-object v2

    .line 494
    invoke-static {v4, v15, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 495
    .line 496
    .line 497
    and-int/lit8 v2, v19, 0xe

    .line 498
    .line 499
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 500
    .line 501
    .line 502
    move-result-object v2

    .line 503
    invoke-interface {v11, v13, v2}, Lr6/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    const v2, 0x4ff5ed83

    .line 507
    .line 508
    .line 509
    invoke-interface {v13, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 510
    .line 511
    .line 512
    if-eqz v5, :cond_2a

    .line 513
    .line 514
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 515
    .line 516
    const-string v3, "Leading"

    .line 517
    .line 518
    invoke-static {v2, v3}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 519
    .line 520
    .line 521
    move-result-object v2

    .line 522
    invoke-static {}, Landroidx/compose/material3/internal/TextFieldImplKt;->getIconDefaultSizeModifier()Landroidx/compose/ui/Modifier;

    .line 523
    .line 524
    .line 525
    move-result-object v3

    .line 526
    invoke-interface {v2, v3}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 527
    .line 528
    .line 529
    move-result-object v2

    .line 530
    sget-object v3, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 531
    .line 532
    invoke-virtual {v3}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 533
    .line 534
    .line 535
    move-result-object v3

    .line 536
    const/4 v12, 0x0

    .line 537
    invoke-static {v3, v12}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 538
    .line 539
    .line 540
    move-result-object v3

    .line 541
    invoke-static {v13, v12}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 542
    .line 543
    .line 544
    move-result v4

    .line 545
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 546
    .line 547
    .line 548
    move-result-object v9

    .line 549
    invoke-static {v13, v2}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 550
    .line 551
    .line 552
    move-result-object v2

    .line 553
    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 554
    .line 555
    .line 556
    move-result-object v12

    .line 557
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 558
    .line 559
    .line 560
    move-result-object v15

    .line 561
    if-nez v15, :cond_26

    .line 562
    .line 563
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 564
    .line 565
    .line 566
    :cond_26
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 567
    .line 568
    .line 569
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 570
    .line 571
    .line 572
    move-result v15

    .line 573
    if-eqz v15, :cond_27

    .line 574
    .line 575
    invoke-interface {v13, v12}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 576
    .line 577
    .line 578
    goto :goto_14

    .line 579
    :cond_27
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 580
    .line 581
    .line 582
    :goto_14
    invoke-static {v13}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 583
    .line 584
    .line 585
    move-result-object v12

    .line 586
    invoke-static {v1, v12, v3, v12, v9}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 587
    .line 588
    .line 589
    move-result-object v3

    .line 590
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 591
    .line 592
    .line 593
    move-result v9

    .line 594
    if-nez v9, :cond_28

    .line 595
    .line 596
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 597
    .line 598
    .line 599
    move-result-object v9

    .line 600
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 601
    .line 602
    .line 603
    move-result-object v15

    .line 604
    invoke-static {v9, v15}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 605
    .line 606
    .line 607
    move-result v9

    .line 608
    if-nez v9, :cond_29

    .line 609
    .line 610
    :cond_28
    invoke-static {v4, v12, v4, v3}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 611
    .line 612
    .line 613
    :cond_29
    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 614
    .line 615
    .line 616
    move-result-object v3

    .line 617
    invoke-static {v12, v2, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 618
    .line 619
    .line 620
    sget-object v2, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 621
    .line 622
    shr-int/lit8 v2, v18, 0xc

    .line 623
    .line 624
    and-int/lit8 v2, v2, 0xe

    .line 625
    .line 626
    invoke-static {v13, v2, v5}, Landroidx/collection/a;->u(Landroidx/compose/runtime/Composer;ILr6/e;)V

    .line 627
    .line 628
    .line 629
    :cond_2a
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 630
    .line 631
    .line 632
    const v2, 0x4ff61126

    .line 633
    .line 634
    .line 635
    invoke-interface {v13, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 636
    .line 637
    .line 638
    if-eqz v6, :cond_2f

    .line 639
    .line 640
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 641
    .line 642
    const-string v3, "Trailing"

    .line 643
    .line 644
    invoke-static {v2, v3}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 645
    .line 646
    .line 647
    move-result-object v2

    .line 648
    invoke-static {}, Landroidx/compose/material3/internal/TextFieldImplKt;->getIconDefaultSizeModifier()Landroidx/compose/ui/Modifier;

    .line 649
    .line 650
    .line 651
    move-result-object v3

    .line 652
    invoke-interface {v2, v3}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 653
    .line 654
    .line 655
    move-result-object v2

    .line 656
    sget-object v3, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 657
    .line 658
    invoke-virtual {v3}, Landroidx/compose/ui/Alignment$Companion;->getCenter()Landroidx/compose/ui/Alignment;

    .line 659
    .line 660
    .line 661
    move-result-object v3

    .line 662
    const/4 v12, 0x0

    .line 663
    invoke-static {v3, v12}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 664
    .line 665
    .line 666
    move-result-object v3

    .line 667
    invoke-static {v13, v12}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 668
    .line 669
    .line 670
    move-result v4

    .line 671
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 672
    .line 673
    .line 674
    move-result-object v9

    .line 675
    invoke-static {v13, v2}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 676
    .line 677
    .line 678
    move-result-object v2

    .line 679
    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 680
    .line 681
    .line 682
    move-result-object v12

    .line 683
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 684
    .line 685
    .line 686
    move-result-object v15

    .line 687
    if-nez v15, :cond_2b

    .line 688
    .line 689
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 690
    .line 691
    .line 692
    :cond_2b
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 693
    .line 694
    .line 695
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 696
    .line 697
    .line 698
    move-result v15

    .line 699
    if-eqz v15, :cond_2c

    .line 700
    .line 701
    invoke-interface {v13, v12}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 702
    .line 703
    .line 704
    goto :goto_15

    .line 705
    :cond_2c
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 706
    .line 707
    .line 708
    :goto_15
    invoke-static {v13}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 709
    .line 710
    .line 711
    move-result-object v12

    .line 712
    invoke-static {v1, v12, v3, v12, v9}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 713
    .line 714
    .line 715
    move-result-object v3

    .line 716
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 717
    .line 718
    .line 719
    move-result v9

    .line 720
    if-nez v9, :cond_2d

    .line 721
    .line 722
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 723
    .line 724
    .line 725
    move-result-object v9

    .line 726
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 727
    .line 728
    .line 729
    move-result-object v15

    .line 730
    invoke-static {v9, v15}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 731
    .line 732
    .line 733
    move-result v9

    .line 734
    if-nez v9, :cond_2e

    .line 735
    .line 736
    :cond_2d
    invoke-static {v4, v12, v4, v3}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 737
    .line 738
    .line 739
    :cond_2e
    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 740
    .line 741
    .line 742
    move-result-object v3

    .line 743
    invoke-static {v12, v2, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 744
    .line 745
    .line 746
    sget-object v2, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 747
    .line 748
    shr-int/lit8 v2, v18, 0xf

    .line 749
    .line 750
    and-int/lit8 v2, v2, 0xe

    .line 751
    .line 752
    invoke-static {v13, v2, v6}, Landroidx/collection/a;->u(Landroidx/compose/runtime/Composer;ILr6/e;)V

    .line 753
    .line 754
    .line 755
    :cond_2f
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 756
    .line 757
    .line 758
    invoke-static {v14, v0}, Landroidx/compose/foundation/layout/PaddingKt;->calculateStartPadding(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/unit/LayoutDirection;)F

    .line 759
    .line 760
    .line 761
    move-result v2

    .line 762
    invoke-static {v14, v0}, Landroidx/compose/foundation/layout/PaddingKt;->calculateEndPadding(Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/unit/LayoutDirection;)F

    .line 763
    .line 764
    .line 765
    move-result v0

    .line 766
    if-eqz v5, :cond_31

    .line 767
    .line 768
    invoke-static {}, Landroidx/compose/material3/internal/TextFieldImplKt;->getHorizontalIconPadding()F

    .line 769
    .line 770
    .line 771
    move-result v3

    .line 772
    sub-float/2addr v2, v3

    .line 773
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 774
    .line 775
    .line 776
    move-result v2

    .line 777
    const/4 v12, 0x0

    .line 778
    int-to-float v3, v12

    .line 779
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 780
    .line 781
    .line 782
    move-result v3

    .line 783
    cmpg-float v4, v2, v3

    .line 784
    .line 785
    if-gez v4, :cond_30

    .line 786
    .line 787
    move v2, v3

    .line 788
    :cond_30
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 789
    .line 790
    .line 791
    move-result v2

    .line 792
    :cond_31
    move/from16 v21, v2

    .line 793
    .line 794
    if-eqz v6, :cond_33

    .line 795
    .line 796
    invoke-static {}, Landroidx/compose/material3/internal/TextFieldImplKt;->getHorizontalIconPadding()F

    .line 797
    .line 798
    .line 799
    move-result v2

    .line 800
    sub-float/2addr v0, v2

    .line 801
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 802
    .line 803
    .line 804
    move-result v0

    .line 805
    const/4 v12, 0x0

    .line 806
    int-to-float v2, v12

    .line 807
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 808
    .line 809
    .line 810
    move-result v2

    .line 811
    cmpg-float v3, v0, v2

    .line 812
    .line 813
    if-gez v3, :cond_32

    .line 814
    .line 815
    move v0, v2

    .line 816
    :cond_32
    invoke-static {v0}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 817
    .line 818
    .line 819
    move-result v0

    .line 820
    :cond_33
    const v2, 0x4ff688bc    # 8.2723123E9f

    .line 821
    .line 822
    .line 823
    invoke-interface {v13, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 824
    .line 825
    .line 826
    const/4 v2, 0x0

    .line 827
    const/4 v3, 0x3

    .line 828
    const/4 v4, 0x0

    .line 829
    if-eqz v7, :cond_38

    .line 830
    .line 831
    sget-object v9, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 832
    .line 833
    const-string v12, "Prefix"

    .line 834
    .line 835
    invoke-static {v9, v12}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 836
    .line 837
    .line 838
    move-result-object v9

    .line 839
    invoke-static {}, Landroidx/compose/material3/internal/TextFieldImplKt;->getMinTextLineHeight()F

    .line 840
    .line 841
    .line 842
    move-result v12

    .line 843
    const/4 v15, 0x2

    .line 844
    invoke-static {v9, v12, v2, v15, v4}, Landroidx/compose/foundation/layout/SizeKt;->heightIn-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 845
    .line 846
    .line 847
    move-result-object v9

    .line 848
    const/4 v12, 0x0

    .line 849
    invoke-static {v9, v4, v12, v3, v4}, Landroidx/compose/foundation/layout/SizeKt;->wrapContentHeight$default(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment$Vertical;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 850
    .line 851
    .line 852
    move-result-object v20

    .line 853
    invoke-static {}, Landroidx/compose/material3/internal/TextFieldImplKt;->getPrefixSuffixTextPadding()F

    .line 854
    .line 855
    .line 856
    move-result v23

    .line 857
    const/16 v25, 0xa

    .line 858
    .line 859
    const/16 v26, 0x0

    .line 860
    .line 861
    const/16 v22, 0x0

    .line 862
    .line 863
    const/16 v24, 0x0

    .line 864
    .line 865
    invoke-static/range {v20 .. v26}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 866
    .line 867
    .line 868
    move-result-object v9

    .line 869
    sget-object v15, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 870
    .line 871
    invoke-virtual {v15}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 872
    .line 873
    .line 874
    move-result-object v15

    .line 875
    invoke-static {v15, v12}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 876
    .line 877
    .line 878
    move-result-object v15

    .line 879
    invoke-static {v13, v12}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 880
    .line 881
    .line 882
    move-result v3

    .line 883
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 884
    .line 885
    .line 886
    move-result-object v12

    .line 887
    invoke-static {v13, v9}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 888
    .line 889
    .line 890
    move-result-object v9

    .line 891
    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 892
    .line 893
    .line 894
    move-result-object v2

    .line 895
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 896
    .line 897
    .line 898
    move-result-object v20

    .line 899
    if-nez v20, :cond_34

    .line 900
    .line 901
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 902
    .line 903
    .line 904
    :cond_34
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 905
    .line 906
    .line 907
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 908
    .line 909
    .line 910
    move-result v20

    .line 911
    if-eqz v20, :cond_35

    .line 912
    .line 913
    invoke-interface {v13, v2}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 914
    .line 915
    .line 916
    goto :goto_16

    .line 917
    :cond_35
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 918
    .line 919
    .line 920
    :goto_16
    invoke-static {v13}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 921
    .line 922
    .line 923
    move-result-object v2

    .line 924
    invoke-static {v1, v2, v15, v2, v12}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 925
    .line 926
    .line 927
    move-result-object v12

    .line 928
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 929
    .line 930
    .line 931
    move-result v15

    .line 932
    if-nez v15, :cond_36

    .line 933
    .line 934
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 935
    .line 936
    .line 937
    move-result-object v15

    .line 938
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 939
    .line 940
    .line 941
    move-result-object v4

    .line 942
    invoke-static {v15, v4}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 943
    .line 944
    .line 945
    move-result v4

    .line 946
    if-nez v4, :cond_37

    .line 947
    .line 948
    :cond_36
    invoke-static {v3, v2, v3, v12}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 949
    .line 950
    .line 951
    :cond_37
    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 952
    .line 953
    .line 954
    move-result-object v3

    .line 955
    invoke-static {v2, v9, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 956
    .line 957
    .line 958
    sget-object v2, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 959
    .line 960
    shr-int/lit8 v2, v18, 0x12

    .line 961
    .line 962
    and-int/lit8 v2, v2, 0xe

    .line 963
    .line 964
    invoke-static {v13, v2, v7}, Landroidx/collection/a;->u(Landroidx/compose/runtime/Composer;ILr6/e;)V

    .line 965
    .line 966
    .line 967
    :cond_38
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 968
    .line 969
    .line 970
    const v2, 0x4ff6b77a

    .line 971
    .line 972
    .line 973
    invoke-interface {v13, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 974
    .line 975
    .line 976
    if-eqz v8, :cond_3d

    .line 977
    .line 978
    sget-object v2, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 979
    .line 980
    const-string v3, "Suffix"

    .line 981
    .line 982
    invoke-static {v2, v3}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 983
    .line 984
    .line 985
    move-result-object v2

    .line 986
    invoke-static {}, Landroidx/compose/material3/internal/TextFieldImplKt;->getMinTextLineHeight()F

    .line 987
    .line 988
    .line 989
    move-result v3

    .line 990
    const/4 v4, 0x0

    .line 991
    const/4 v9, 0x0

    .line 992
    const/4 v15, 0x2

    .line 993
    invoke-static {v2, v3, v4, v15, v9}, Landroidx/compose/foundation/layout/SizeKt;->heightIn-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 994
    .line 995
    .line 996
    move-result-object v2

    .line 997
    const/4 v3, 0x3

    .line 998
    const/4 v12, 0x0

    .line 999
    invoke-static {v2, v9, v12, v3, v9}, Landroidx/compose/foundation/layout/SizeKt;->wrapContentHeight$default(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment$Vertical;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v22

    .line 1003
    invoke-static {}, Landroidx/compose/material3/internal/TextFieldImplKt;->getPrefixSuffixTextPadding()F

    .line 1004
    .line 1005
    .line 1006
    move-result v23

    .line 1007
    const/16 v27, 0xa

    .line 1008
    .line 1009
    const/16 v28, 0x0

    .line 1010
    .line 1011
    const/16 v24, 0x0

    .line 1012
    .line 1013
    const/16 v26, 0x0

    .line 1014
    .line 1015
    move/from16 v25, v0

    .line 1016
    .line 1017
    invoke-static/range {v22 .. v28}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v0

    .line 1021
    move/from16 v23, v25

    .line 1022
    .line 1023
    sget-object v2, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 1024
    .line 1025
    invoke-virtual {v2}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v2

    .line 1029
    invoke-static {v2, v12}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v2

    .line 1033
    invoke-static {v13, v12}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 1034
    .line 1035
    .line 1036
    move-result v3

    .line 1037
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 1038
    .line 1039
    .line 1040
    move-result-object v4

    .line 1041
    invoke-static {v13, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v0

    .line 1045
    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v9

    .line 1049
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v12

    .line 1053
    if-nez v12, :cond_39

    .line 1054
    .line 1055
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 1056
    .line 1057
    .line 1058
    :cond_39
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 1059
    .line 1060
    .line 1061
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 1062
    .line 1063
    .line 1064
    move-result v12

    .line 1065
    if-eqz v12, :cond_3a

    .line 1066
    .line 1067
    invoke-interface {v13, v9}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 1068
    .line 1069
    .line 1070
    goto :goto_17

    .line 1071
    :cond_3a
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 1072
    .line 1073
    .line 1074
    :goto_17
    invoke-static {v13}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v9

    .line 1078
    invoke-static {v1, v9, v2, v9, v4}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v2

    .line 1082
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 1083
    .line 1084
    .line 1085
    move-result v4

    .line 1086
    if-nez v4, :cond_3b

    .line 1087
    .line 1088
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v4

    .line 1092
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v12

    .line 1096
    invoke-static {v4, v12}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1097
    .line 1098
    .line 1099
    move-result v4

    .line 1100
    if-nez v4, :cond_3c

    .line 1101
    .line 1102
    :cond_3b
    invoke-static {v3, v9, v3, v2}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 1103
    .line 1104
    .line 1105
    :cond_3c
    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v2

    .line 1109
    invoke-static {v9, v0, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 1110
    .line 1111
    .line 1112
    sget-object v0, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 1113
    .line 1114
    shr-int/lit8 v0, v18, 0x15

    .line 1115
    .line 1116
    and-int/lit8 v0, v0, 0xe

    .line 1117
    .line 1118
    invoke-static {v13, v0, v8}, Landroidx/collection/a;->u(Landroidx/compose/runtime/Composer;ILr6/e;)V

    .line 1119
    .line 1120
    .line 1121
    goto :goto_18

    .line 1122
    :cond_3d
    move/from16 v23, v0

    .line 1123
    .line 1124
    :goto_18
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 1125
    .line 1126
    .line 1127
    const v0, 0x4ff6e724

    .line 1128
    .line 1129
    .line 1130
    invoke-interface {v13, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1131
    .line 1132
    .line 1133
    if-eqz p2, :cond_42

    .line 1134
    .line 1135
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 1136
    .line 1137
    const-string v2, "Label"

    .line 1138
    .line 1139
    invoke-static {v0, v2}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v0

    .line 1143
    invoke-static {}, Landroidx/compose/material3/internal/TextFieldImplKt;->getMinTextLineHeight()F

    .line 1144
    .line 1145
    .line 1146
    move-result v2

    .line 1147
    invoke-static {}, Landroidx/compose/material3/internal/TextFieldImplKt;->getMinFocusedLabelLineHeight()F

    .line 1148
    .line 1149
    .line 1150
    move-result v3

    .line 1151
    invoke-static {v2, v3, v10}, Landroidx/compose/ui/unit/DpKt;->lerp-Md-fbLM(FFF)F

    .line 1152
    .line 1153
    .line 1154
    move-result v2

    .line 1155
    const/4 v4, 0x0

    .line 1156
    const/4 v9, 0x0

    .line 1157
    const/4 v15, 0x2

    .line 1158
    invoke-static {v0, v2, v4, v15, v9}, Landroidx/compose/foundation/layout/SizeKt;->heightIn-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1159
    .line 1160
    .line 1161
    move-result-object v0

    .line 1162
    const/4 v3, 0x3

    .line 1163
    const/4 v12, 0x0

    .line 1164
    invoke-static {v0, v9, v12, v3, v9}, Landroidx/compose/foundation/layout/SizeKt;->wrapContentHeight$default(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment$Vertical;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1165
    .line 1166
    .line 1167
    move-result-object v20

    .line 1168
    const/16 v25, 0xa

    .line 1169
    .line 1170
    const/16 v26, 0x0

    .line 1171
    .line 1172
    const/16 v22, 0x0

    .line 1173
    .line 1174
    const/16 v24, 0x0

    .line 1175
    .line 1176
    invoke-static/range {v20 .. v26}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v0

    .line 1180
    sget-object v2, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 1181
    .line 1182
    invoke-virtual {v2}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 1183
    .line 1184
    .line 1185
    move-result-object v2

    .line 1186
    invoke-static {v2, v12}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v2

    .line 1190
    invoke-static {v13, v12}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 1191
    .line 1192
    .line 1193
    move-result v3

    .line 1194
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 1195
    .line 1196
    .line 1197
    move-result-object v4

    .line 1198
    invoke-static {v13, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v0

    .line 1202
    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 1203
    .line 1204
    .line 1205
    move-result-object v9

    .line 1206
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v12

    .line 1210
    if-nez v12, :cond_3e

    .line 1211
    .line 1212
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 1213
    .line 1214
    .line 1215
    :cond_3e
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 1216
    .line 1217
    .line 1218
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 1219
    .line 1220
    .line 1221
    move-result v12

    .line 1222
    if-eqz v12, :cond_3f

    .line 1223
    .line 1224
    invoke-interface {v13, v9}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 1225
    .line 1226
    .line 1227
    goto :goto_19

    .line 1228
    :cond_3f
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 1229
    .line 1230
    .line 1231
    :goto_19
    invoke-static {v13}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 1232
    .line 1233
    .line 1234
    move-result-object v9

    .line 1235
    invoke-static {v1, v9, v2, v9, v4}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 1236
    .line 1237
    .line 1238
    move-result-object v2

    .line 1239
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 1240
    .line 1241
    .line 1242
    move-result v4

    .line 1243
    if-nez v4, :cond_40

    .line 1244
    .line 1245
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v4

    .line 1249
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1250
    .line 1251
    .line 1252
    move-result-object v12

    .line 1253
    invoke-static {v4, v12}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1254
    .line 1255
    .line 1256
    move-result v4

    .line 1257
    if-nez v4, :cond_41

    .line 1258
    .line 1259
    :cond_40
    invoke-static {v3, v9, v3, v2}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 1260
    .line 1261
    .line 1262
    :cond_41
    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v2

    .line 1266
    invoke-static {v9, v0, v2}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 1267
    .line 1268
    .line 1269
    sget-object v0, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 1270
    .line 1271
    shr-int/lit8 v0, v18, 0x6

    .line 1272
    .line 1273
    and-int/lit8 v0, v0, 0xe

    .line 1274
    .line 1275
    move-object/from16 v3, p2

    .line 1276
    .line 1277
    invoke-static {v13, v0, v3}, Landroidx/collection/a;->u(Landroidx/compose/runtime/Composer;ILr6/e;)V

    .line 1278
    .line 1279
    .line 1280
    goto :goto_1a

    .line 1281
    :cond_42
    move-object/from16 v3, p2

    .line 1282
    .line 1283
    :goto_1a
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 1284
    .line 1285
    .line 1286
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    .line 1287
    .line 1288
    invoke-static {}, Landroidx/compose/material3/internal/TextFieldImplKt;->getMinTextLineHeight()F

    .line 1289
    .line 1290
    .line 1291
    move-result v2

    .line 1292
    const/4 v4, 0x0

    .line 1293
    const/4 v9, 0x0

    .line 1294
    const/4 v15, 0x2

    .line 1295
    invoke-static {v0, v2, v4, v15, v9}, Landroidx/compose/foundation/layout/SizeKt;->heightIn-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v2

    .line 1299
    const/4 v4, 0x3

    .line 1300
    const/4 v12, 0x0

    .line 1301
    invoke-static {v2, v9, v12, v4, v9}, Landroidx/compose/foundation/layout/SizeKt;->wrapContentHeight$default(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment$Vertical;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1302
    .line 1303
    .line 1304
    move-result-object v30

    .line 1305
    if-nez v7, :cond_43

    .line 1306
    .line 1307
    :goto_1b
    move/from16 v31, v21

    .line 1308
    .line 1309
    goto :goto_1c

    .line 1310
    :cond_43
    int-to-float v2, v12

    .line 1311
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 1312
    .line 1313
    .line 1314
    move-result v21

    .line 1315
    goto :goto_1b

    .line 1316
    :goto_1c
    if-nez v8, :cond_44

    .line 1317
    .line 1318
    move/from16 v33, v23

    .line 1319
    .line 1320
    goto :goto_1d

    .line 1321
    :cond_44
    int-to-float v2, v12

    .line 1322
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 1323
    .line 1324
    .line 1325
    move-result v2

    .line 1326
    move/from16 v33, v2

    .line 1327
    .line 1328
    :goto_1d
    const/16 v35, 0xa

    .line 1329
    .line 1330
    const/16 v36, 0x0

    .line 1331
    .line 1332
    const/16 v32, 0x0

    .line 1333
    .line 1334
    const/16 v34, 0x0

    .line 1335
    .line 1336
    invoke-static/range {v30 .. v36}, Landroidx/compose/foundation/layout/PaddingKt;->padding-qDBjuR0$default(Landroidx/compose/ui/Modifier;FFFFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1337
    .line 1338
    .line 1339
    move-result-object v2

    .line 1340
    const v4, 0x4ff75e6b

    .line 1341
    .line 1342
    .line 1343
    invoke-interface {v13, v4}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1344
    .line 1345
    .line 1346
    if-eqz p3, :cond_45

    .line 1347
    .line 1348
    const-string v4, "Hint"

    .line 1349
    .line 1350
    invoke-static {v0, v4}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1351
    .line 1352
    .line 1353
    move-result-object v4

    .line 1354
    invoke-interface {v4, v2}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 1355
    .line 1356
    .line 1357
    move-result-object v4

    .line 1358
    shr-int/lit8 v9, v18, 0x6

    .line 1359
    .line 1360
    and-int/lit8 v9, v9, 0x70

    .line 1361
    .line 1362
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1363
    .line 1364
    .line 1365
    move-result-object v9

    .line 1366
    move-object/from16 v12, p3

    .line 1367
    .line 1368
    invoke-interface {v12, v4, v13, v9}, Lr6/f;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1369
    .line 1370
    .line 1371
    goto :goto_1e

    .line 1372
    :cond_45
    move-object/from16 v12, p3

    .line 1373
    .line 1374
    :goto_1e
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 1375
    .line 1376
    .line 1377
    const-string v4, "TextField"

    .line 1378
    .line 1379
    invoke-static {v0, v4}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1380
    .line 1381
    .line 1382
    move-result-object v4

    .line 1383
    invoke-interface {v4, v2}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 1384
    .line 1385
    .line 1386
    move-result-object v2

    .line 1387
    sget-object v4, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 1388
    .line 1389
    invoke-virtual {v4}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 1390
    .line 1391
    .line 1392
    move-result-object v9

    .line 1393
    const/4 v15, 0x1

    .line 1394
    invoke-static {v9, v15}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 1395
    .line 1396
    .line 1397
    move-result-object v9

    .line 1398
    const/4 v15, 0x0

    .line 1399
    invoke-static {v13, v15}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 1400
    .line 1401
    .line 1402
    move-result v3

    .line 1403
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 1404
    .line 1405
    .line 1406
    move-result-object v15

    .line 1407
    invoke-static {v13, v2}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 1408
    .line 1409
    .line 1410
    move-result-object v2

    .line 1411
    move-object/from16 v16, v4

    .line 1412
    .line 1413
    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 1414
    .line 1415
    .line 1416
    move-result-object v4

    .line 1417
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 1418
    .line 1419
    .line 1420
    move-result-object v20

    .line 1421
    if-nez v20, :cond_46

    .line 1422
    .line 1423
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 1424
    .line 1425
    .line 1426
    :cond_46
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 1427
    .line 1428
    .line 1429
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 1430
    .line 1431
    .line 1432
    move-result v20

    .line 1433
    if-eqz v20, :cond_47

    .line 1434
    .line 1435
    invoke-interface {v13, v4}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 1436
    .line 1437
    .line 1438
    goto :goto_1f

    .line 1439
    :cond_47
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 1440
    .line 1441
    .line 1442
    :goto_1f
    invoke-static {v13}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 1443
    .line 1444
    .line 1445
    move-result-object v4

    .line 1446
    invoke-static {v1, v4, v9, v4, v15}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 1447
    .line 1448
    .line 1449
    move-result-object v9

    .line 1450
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 1451
    .line 1452
    .line 1453
    move-result v15

    .line 1454
    if-nez v15, :cond_48

    .line 1455
    .line 1456
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1457
    .line 1458
    .line 1459
    move-result-object v15

    .line 1460
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1461
    .line 1462
    .line 1463
    move-result-object v5

    .line 1464
    invoke-static {v15, v5}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1465
    .line 1466
    .line 1467
    move-result v5

    .line 1468
    if-nez v5, :cond_49

    .line 1469
    .line 1470
    :cond_48
    invoke-static {v3, v4, v3, v9}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 1471
    .line 1472
    .line 1473
    :cond_49
    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 1474
    .line 1475
    .line 1476
    move-result-object v3

    .line 1477
    invoke-static {v4, v2, v3}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 1478
    .line 1479
    .line 1480
    sget-object v2, Landroidx/compose/foundation/layout/BoxScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/BoxScopeInstance;

    .line 1481
    .line 1482
    const/16 v29, 0x3

    .line 1483
    .line 1484
    shr-int/lit8 v2, v18, 0x3

    .line 1485
    .line 1486
    and-int/lit8 v2, v2, 0xe

    .line 1487
    .line 1488
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1489
    .line 1490
    .line 1491
    move-result-object v2

    .line 1492
    move-object/from16 v3, p1

    .line 1493
    .line 1494
    invoke-interface {v3, v13, v2}, Lr6/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1495
    .line 1496
    .line 1497
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 1498
    .line 1499
    .line 1500
    const v2, 0x4ff78960    # 8.3059507E9f

    .line 1501
    .line 1502
    .line 1503
    invoke-interface {v13, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    .line 1504
    .line 1505
    .line 1506
    if-eqz p11, :cond_4e

    .line 1507
    .line 1508
    const-string v2, "Supporting"

    .line 1509
    .line 1510
    invoke-static {v0, v2}, Landroidx/compose/ui/layout/LayoutIdKt;->layoutId(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1511
    .line 1512
    .line 1513
    move-result-object v0

    .line 1514
    invoke-static {}, Landroidx/compose/material3/internal/TextFieldImplKt;->getMinSupportingTextLineHeight()F

    .line 1515
    .line 1516
    .line 1517
    move-result v2

    .line 1518
    const/4 v4, 0x0

    .line 1519
    const/4 v9, 0x0

    .line 1520
    const/4 v15, 0x2

    .line 1521
    invoke-static {v0, v2, v4, v15, v9}, Landroidx/compose/foundation/layout/SizeKt;->heightIn-VpY3zN4$default(Landroidx/compose/ui/Modifier;FFILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1522
    .line 1523
    .line 1524
    move-result-object v0

    .line 1525
    const/4 v4, 0x3

    .line 1526
    const/4 v15, 0x0

    .line 1527
    invoke-static {v0, v9, v15, v4, v9}, Landroidx/compose/foundation/layout/SizeKt;->wrapContentHeight$default(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment$Vertical;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    .line 1528
    .line 1529
    .line 1530
    move-result-object v0

    .line 1531
    sget-object v20, Landroidx/compose/material3/TextFieldDefaults;->INSTANCE:Landroidx/compose/material3/TextFieldDefaults;

    .line 1532
    .line 1533
    const/16 v25, 0xf

    .line 1534
    .line 1535
    const/16 v26, 0x0

    .line 1536
    .line 1537
    const/16 v21, 0x0

    .line 1538
    .line 1539
    const/16 v22, 0x0

    .line 1540
    .line 1541
    const/16 v23, 0x0

    .line 1542
    .line 1543
    const/16 v24, 0x0

    .line 1544
    .line 1545
    invoke-static/range {v20 .. v26}, Landroidx/compose/material3/TextFieldDefaults;->supportingTextPadding-a9UjIt4$material3_release$default(Landroidx/compose/material3/TextFieldDefaults;FFFFILjava/lang/Object;)Landroidx/compose/foundation/layout/PaddingValues;

    .line 1546
    .line 1547
    .line 1548
    move-result-object v2

    .line 1549
    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/PaddingKt;->padding(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;

    .line 1550
    .line 1551
    .line 1552
    move-result-object v0

    .line 1553
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/Alignment$Companion;->getTopStart()Landroidx/compose/ui/Alignment;

    .line 1554
    .line 1555
    .line 1556
    move-result-object v2

    .line 1557
    invoke-static {v2, v15}, Landroidx/compose/foundation/layout/BoxKt;->maybeCachedBoxMeasurePolicy(Landroidx/compose/ui/Alignment;Z)Landroidx/compose/ui/layout/MeasurePolicy;

    .line 1558
    .line 1559
    .line 1560
    move-result-object v2

    .line 1561
    invoke-static {v13, v15}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    .line 1562
    .line 1563
    .line 1564
    move-result v4

    .line 1565
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    .line 1566
    .line 1567
    .line 1568
    move-result-object v5

    .line 1569
    invoke-static {v13, v0}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 1570
    .line 1571
    .line 1572
    move-result-object v0

    .line 1573
    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lr6/a;

    .line 1574
    .line 1575
    .line 1576
    move-result-object v9

    .line 1577
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    .line 1578
    .line 1579
    .line 1580
    move-result-object v15

    .line 1581
    if-nez v15, :cond_4a

    .line 1582
    .line 1583
    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 1584
    .line 1585
    .line 1586
    :cond_4a
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 1587
    .line 1588
    .line 1589
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 1590
    .line 1591
    .line 1592
    move-result v15

    .line 1593
    if-eqz v15, :cond_4b

    .line 1594
    .line 1595
    invoke-interface {v13, v9}, Landroidx/compose/runtime/Composer;->createNode(Lr6/a;)V

    .line 1596
    .line 1597
    .line 1598
    goto :goto_20

    .line 1599
    :cond_4b
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 1600
    .line 1601
    .line 1602
    :goto_20
    invoke-static {v13}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    .line 1603
    .line 1604
    .line 1605
    move-result-object v9

    .line 1606
    invoke-static {v1, v9, v2, v9, v5}, Landroidx/collection/a;->r(Landroidx/compose/ui/node/ComposeUiNode$Companion;Landroidx/compose/runtime/Composer;Landroidx/compose/ui/layout/MeasurePolicy;Landroidx/compose/runtime/Composer;Landroidx/compose/runtime/CompositionLocalMap;)Lr6/e;

    .line 1607
    .line 1608
    .line 1609
    move-result-object v2

    .line 1610
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->getInserting()Z

    .line 1611
    .line 1612
    .line 1613
    move-result v5

    .line 1614
    if-nez v5, :cond_4c

    .line 1615
    .line 1616
    invoke-interface {v9}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    .line 1617
    .line 1618
    .line 1619
    move-result-object v5

    .line 1620
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1621
    .line 1622
    .line 1623
    move-result-object v15

    .line 1624
    invoke-static {v5, v15}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1625
    .line 1626
    .line 1627
    move-result v5

    .line 1628
    if-nez v5, :cond_4d

    .line 1629
    .line 1630
    :cond_4c
    invoke-static {v4, v9, v4, v2}, Landroidx/collection/a;->s(ILandroidx/compose/runtime/Composer;ILr6/e;)V

    .line 1631
    .line 1632
    .line 1633
    :cond_4d
    invoke-virtual {v1}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lr6/e;

    .line 1634
    .line 1635
    .line 1636
    move-result-object v1

    .line 1637
    invoke-static {v9, v0, v1}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lr6/e;)V

    .line 1638
    .line 1639
    .line 1640
    const/16 v29, 0x3

    .line 1641
    .line 1642
    shr-int/lit8 v0, v19, 0x3

    .line 1643
    .line 1644
    and-int/lit8 v0, v0, 0xe

    .line 1645
    .line 1646
    move-object/from16 v1, p11

    .line 1647
    .line 1648
    invoke-static {v13, v0, v1}, Landroidx/collection/a;->u(Landroidx/compose/runtime/Composer;ILr6/e;)V

    .line 1649
    .line 1650
    .line 1651
    goto :goto_21

    .line 1652
    :cond_4e
    move-object/from16 v1, p11

    .line 1653
    .line 1654
    :goto_21
    invoke-static {v13}, Landroidx/collection/a;->x(Landroidx/compose/runtime/Composer;)Z

    .line 1655
    .line 1656
    .line 1657
    move-result v0

    .line 1658
    if-eqz v0, :cond_4f

    .line 1659
    .line 1660
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 1661
    .line 1662
    .line 1663
    :cond_4f
    :goto_22
    invoke-interface {v13}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    .line 1664
    .line 1665
    .line 1666
    move-result-object v0

    .line 1667
    if-eqz v0, :cond_50

    .line 1668
    .line 1669
    move-object v2, v0

    .line 1670
    new-instance v0, Landroidx/compose/material3/TextFieldKt$TextFieldLayout$2;

    .line 1671
    .line 1672
    move-object/from16 v5, p4

    .line 1673
    .line 1674
    move/from16 v9, p8

    .line 1675
    .line 1676
    move/from16 v15, p15

    .line 1677
    .line 1678
    move-object/from16 v37, v2

    .line 1679
    .line 1680
    move-object v2, v3

    .line 1681
    move-object v4, v12

    .line 1682
    move-object v13, v14

    .line 1683
    move-object/from16 v3, p2

    .line 1684
    .line 1685
    move/from16 v14, p14

    .line 1686
    .line 1687
    move-object v12, v1

    .line 1688
    move-object/from16 v1, p0

    .line 1689
    .line 1690
    invoke-direct/range {v0 .. v15}, Landroidx/compose/material3/TextFieldKt$TextFieldLayout$2;-><init>(Landroidx/compose/ui/Modifier;Lr6/e;Lr6/e;Lr6/f;Lr6/e;Lr6/e;Lr6/e;Lr6/e;ZFLr6/e;Lr6/e;Landroidx/compose/foundation/layout/PaddingValues;II)V

    .line 1691
    .line 1692
    .line 1693
    move-object/from16 v2, v37

    .line 1694
    .line 1695
    invoke-interface {v2, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lr6/e;)V

    .line 1696
    .line 1697
    .line 1698
    :cond_50
    return-void
.end method

.method public static final synthetic access$calculateHeight-mKXJcVc(IIIIIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I
    .locals 0

    .line 1
    invoke-static/range {p0 .. p12}, Landroidx/compose/material3/TextFieldKt;->calculateHeight-mKXJcVc(IIIIIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$calculateWidth-yeHjK3Y(IIIIIIIJ)I
    .locals 0

    .line 1
    invoke-static/range {p0 .. p8}, Landroidx/compose/material3/TextFieldKt;->calculateWidth-yeHjK3Y(IIIIIIIJ)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$placeWithLabel(Landroidx/compose/ui/layout/Placeable$PlacementScope;IILandroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;ZIIFF)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p16}, Landroidx/compose/material3/TextFieldKt;->placeWithLabel(Landroidx/compose/ui/layout/Placeable$PlacementScope;IILandroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;ZIIFF)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$placeWithoutLabel(Landroidx/compose/ui/layout/Placeable$PlacementScope;IILandroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;ZFLandroidx/compose/foundation/layout/PaddingValues;)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p13}, Landroidx/compose/material3/TextFieldKt;->placeWithoutLabel(Landroidx/compose/ui/layout/Placeable$PlacementScope;IILandroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;ZFLandroidx/compose/foundation/layout/PaddingValues;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$substractConstraintSafely(II)I
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/compose/material3/TextFieldKt;->substractConstraintSafely(II)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final calculateHeight-mKXJcVc(IIIIIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-lez p1, :cond_0

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    move v1, v0

    .line 7
    :goto_0
    invoke-interface {p12}, Landroidx/compose/foundation/layout/PaddingValues;->calculateTopPadding-D9Ej5fM()F

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-interface {p12}, Landroidx/compose/foundation/layout/PaddingValues;->calculateBottomPadding-D9Ej5fM()F

    .line 12
    .line 13
    .line 14
    move-result p12

    .line 15
    add-float/2addr p12, v2

    .line 16
    invoke-static {p12}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 17
    .line 18
    .line 19
    move-result p12

    .line 20
    mul-float/2addr p12, p11

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-static {}, Landroidx/compose/material3/internal/TextFieldImplKt;->getTextFieldPadding()F

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const/4 v2, 0x2

    .line 28
    int-to-float v2, v2

    .line 29
    mul-float/2addr v1, v2

    .line 30
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    mul-float/2addr v1, p11

    .line 35
    invoke-static {v1, p12, p8}, Landroidx/compose/ui/util/MathHelpersKt;->lerp(FFF)F

    .line 36
    .line 37
    .line 38
    move-result p12

    .line 39
    :cond_1
    invoke-static {p1, v0, p8}, Landroidx/compose/ui/util/MathHelpersKt;->lerp(IIF)I

    .line 40
    .line 41
    .line 42
    move-result p11

    .line 43
    filled-new-array {p6, p4, p5, p11}, [I

    .line 44
    .line 45
    .line 46
    move-result-object p4

    .line 47
    move p5, v0

    .line 48
    :goto_1
    const/4 p6, 0x4

    .line 49
    if-ge p5, p6, :cond_2

    .line 50
    .line 51
    aget p6, p4, p5

    .line 52
    .line 53
    invoke-static {p0, p6}, Ljava/lang/Math;->max(II)I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    add-int/lit8 p5, p5, 0x1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    invoke-static {v0, p1, p8}, Landroidx/compose/ui/util/MathHelpersKt;->lerp(IIF)I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    int-to-float p1, p1

    .line 65
    add-float/2addr p12, p1

    .line 66
    int-to-float p0, p0

    .line 67
    add-float/2addr p12, p0

    .line 68
    invoke-static {p9, p10}, Landroidx/compose/ui/unit/Constraints;->getMinHeight-impl(J)I

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    invoke-static {p12}, Lt6/a;->q(F)I

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    invoke-static {p3, p1}, Ljava/lang/Math;->max(II)I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    add-int/2addr p1, p7

    .line 85
    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    return p0
.end method

.method private static final calculateWidth-yeHjK3Y(IIIIIIIJ)I
    .locals 0

    .line 1
    add-int/2addr p2, p3

    .line 2
    add-int/2addr p4, p2

    .line 3
    add-int/2addr p6, p2

    .line 4
    invoke-static {p6, p5}, Ljava/lang/Math;->max(II)I

    .line 5
    .line 6
    .line 7
    move-result p2

    .line 8
    invoke-static {p4, p2}, Ljava/lang/Math;->max(II)I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    add-int/2addr p2, p0

    .line 13
    add-int/2addr p2, p1

    .line 14
    invoke-static {p7, p8}, Landroidx/compose/ui/unit/Constraints;->getMinWidth-impl(J)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    invoke-static {p2, p0}, Ljava/lang/Math;->max(II)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0
.end method

.method public static final drawIndicatorLine(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/State;)Landroidx/compose/ui/Modifier;
    .locals 1
    .param p0    # Landroidx/compose/ui/Modifier;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Landroidx/compose/runtime/State;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/runtime/State<",
            "Landroidx/compose/foundation/BorderStroke;",
            ">;)",
            "Landroidx/compose/ui/Modifier;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Landroidx/compose/material3/TextFieldKt$drawIndicatorLine$1;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroidx/compose/material3/TextFieldKt$drawIndicatorLine$1;-><init>(Landroidx/compose/runtime/State;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0}, Landroidx/compose/ui/draw/DrawModifierKt;->drawWithContent(Landroidx/compose/ui/Modifier;Lr6/c;)Landroidx/compose/ui/Modifier;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static final getTextFieldWithLabelVerticalPadding()F
    .locals 1

    .line 1
    sget v0, Landroidx/compose/material3/TextFieldKt;->TextFieldWithLabelVerticalPadding:F

    .line 2
    .line 3
    return v0
.end method

.method private static final placeWithLabel(Landroidx/compose/ui/layout/Placeable$PlacementScope;IILandroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;ZIIFF)V
    .locals 15

    .line 1
    sget-object v0, Landroidx/compose/ui/unit/IntOffset;->Companion:Landroidx/compose/ui/unit/IntOffset$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/compose/ui/unit/IntOffset$Companion;->getZero-nOcc-ac()J

    .line 4
    .line 5
    .line 6
    move-result-wide v3

    .line 7
    const/4 v6, 0x2

    .line 8
    const/4 v7, 0x0

    .line 9
    const/4 v5, 0x0

    .line 10
    move-object v1, p0

    .line 11
    move-object/from16 v2, p10

    .line 12
    .line 13
    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->place-70tqf50$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;JFILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-static/range {p11 .. p11}, Landroidx/compose/material3/internal/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    sub-int v0, p2, v0

    .line 21
    .line 22
    if-eqz p6, :cond_0

    .line 23
    .line 24
    sget-object v1, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 25
    .line 26
    invoke-virtual {v1}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual/range {p6 .. p6}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-interface {v1, v2, v0}, Landroidx/compose/ui/Alignment$Vertical;->align(II)I

    .line 35
    .line 36
    .line 37
    move-result v11

    .line 38
    const/4 v13, 0x4

    .line 39
    const/4 v14, 0x0

    .line 40
    const/4 v10, 0x0

    .line 41
    const/4 v12, 0x0

    .line 42
    move-object v8, p0

    .line 43
    move-object/from16 v9, p6

    .line 44
    .line 45
    invoke-static/range {v8 .. v14}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeRelative$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    if-eqz p4, :cond_2

    .line 49
    .line 50
    if-eqz p12, :cond_1

    .line 51
    .line 52
    sget-object v1, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 53
    .line 54
    invoke-virtual {v1}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-virtual/range {p4 .. p4}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    invoke-interface {v1, v2, v0}, Landroidx/compose/ui/Alignment$Vertical;->align(II)I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    goto :goto_0

    .line 67
    :cond_1
    invoke-static {}, Landroidx/compose/material3/internal/TextFieldImplKt;->getTextFieldPadding()F

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    mul-float v1, v1, p16

    .line 72
    .line 73
    invoke-static {v1}, Lt6/a;->q(F)I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    :goto_0
    sub-int v2, v1, p13

    .line 78
    .line 79
    int-to-float v2, v2

    .line 80
    mul-float v2, v2, p15

    .line 81
    .line 82
    invoke-static {v2}, Lt6/a;->q(F)I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    sub-int v11, v1, v2

    .line 87
    .line 88
    invoke-static/range {p6 .. p6}, Landroidx/compose/material3/internal/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    .line 89
    .line 90
    .line 91
    move-result v10

    .line 92
    const/4 v13, 0x4

    .line 93
    const/4 v14, 0x0

    .line 94
    const/4 v12, 0x0

    .line 95
    move-object v8, p0

    .line 96
    move-object/from16 v9, p4

    .line 97
    .line 98
    invoke-static/range {v8 .. v14}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeRelative$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    :cond_2
    if-eqz p8, :cond_3

    .line 102
    .line 103
    invoke-static/range {p6 .. p6}, Landroidx/compose/material3/internal/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    .line 104
    .line 105
    .line 106
    move-result v10

    .line 107
    const/4 v13, 0x4

    .line 108
    const/4 v14, 0x0

    .line 109
    const/4 v12, 0x0

    .line 110
    move-object v8, p0

    .line 111
    move-object/from16 v9, p8

    .line 112
    .line 113
    move/from16 v11, p14

    .line 114
    .line 115
    invoke-static/range {v8 .. v14}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeRelative$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    :cond_3
    invoke-static/range {p6 .. p6}, Landroidx/compose/material3/internal/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    invoke-static/range {p8 .. p8}, Landroidx/compose/material3/internal/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    add-int v10, v2, v1

    .line 127
    .line 128
    const/4 v13, 0x4

    .line 129
    const/4 v14, 0x0

    .line 130
    const/4 v12, 0x0

    .line 131
    move-object v8, p0

    .line 132
    move-object/from16 v9, p3

    .line 133
    .line 134
    move/from16 v11, p14

    .line 135
    .line 136
    invoke-static/range {v8 .. v14}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeRelative$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    if-eqz p5, :cond_4

    .line 140
    .line 141
    const/4 v13, 0x4

    .line 142
    const/4 v14, 0x0

    .line 143
    const/4 v12, 0x0

    .line 144
    move-object v8, p0

    .line 145
    move-object/from16 v9, p5

    .line 146
    .line 147
    move/from16 v11, p14

    .line 148
    .line 149
    invoke-static/range {v8 .. v14}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeRelative$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    :cond_4
    if-eqz p9, :cond_5

    .line 153
    .line 154
    invoke-static/range {p7 .. p7}, Landroidx/compose/material3/internal/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    sub-int v1, p1, v1

    .line 159
    .line 160
    invoke-virtual/range {p9 .. p9}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 161
    .line 162
    .line 163
    move-result v2

    .line 164
    sub-int v10, v1, v2

    .line 165
    .line 166
    const/4 v13, 0x4

    .line 167
    const/4 v14, 0x0

    .line 168
    const/4 v12, 0x0

    .line 169
    move-object v8, p0

    .line 170
    move-object/from16 v9, p9

    .line 171
    .line 172
    move/from16 v11, p14

    .line 173
    .line 174
    invoke-static/range {v8 .. v14}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeRelative$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    :cond_5
    if-eqz p7, :cond_6

    .line 178
    .line 179
    invoke-virtual/range {p7 .. p7}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    sub-int v10, p1, v1

    .line 184
    .line 185
    sget-object v1, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 186
    .line 187
    invoke-virtual {v1}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    invoke-virtual/range {p7 .. p7}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    invoke-interface {v1, v2, v0}, Landroidx/compose/ui/Alignment$Vertical;->align(II)I

    .line 196
    .line 197
    .line 198
    move-result v11

    .line 199
    const/4 v13, 0x4

    .line 200
    const/4 v14, 0x0

    .line 201
    const/4 v12, 0x0

    .line 202
    move-object v8, p0

    .line 203
    move-object/from16 v9, p7

    .line 204
    .line 205
    invoke-static/range {v8 .. v14}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeRelative$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    :cond_6
    if-eqz p11, :cond_7

    .line 209
    .line 210
    const/4 v1, 0x4

    .line 211
    const/4 v2, 0x0

    .line 212
    const/4 v3, 0x0

    .line 213
    const/4 v4, 0x0

    .line 214
    move-object/from16 p1, p0

    .line 215
    .line 216
    move-object/from16 p2, p11

    .line 217
    .line 218
    move/from16 p4, v0

    .line 219
    .line 220
    move/from16 p6, v1

    .line 221
    .line 222
    move-object/from16 p7, v2

    .line 223
    .line 224
    move/from16 p3, v3

    .line 225
    .line 226
    move/from16 p5, v4

    .line 227
    .line 228
    invoke-static/range {p1 .. p7}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeRelative$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    :cond_7
    return-void
.end method

.method private static final placeWithoutLabel(Landroidx/compose/ui/layout/Placeable$PlacementScope;IILandroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;ZFLandroidx/compose/foundation/layout/PaddingValues;)V
    .locals 25

    .line 1
    move-object/from16 v1, p4

    .line 2
    .line 3
    move-object/from16 v3, p7

    .line 4
    .line 5
    move-object/from16 v9, p8

    .line 6
    .line 7
    move/from16 v10, p11

    .line 8
    .line 9
    sget-object v0, Landroidx/compose/ui/unit/IntOffset;->Companion:Landroidx/compose/ui/unit/IntOffset$Companion;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/compose/ui/unit/IntOffset$Companion;->getZero-nOcc-ac()J

    .line 12
    .line 13
    .line 14
    move-result-wide v13

    .line 15
    const/16 v16, 0x2

    .line 16
    .line 17
    const/16 v17, 0x0

    .line 18
    .line 19
    const/4 v15, 0x0

    .line 20
    move-object/from16 v11, p0

    .line 21
    .line 22
    move-object/from16 v12, p9

    .line 23
    .line 24
    invoke-static/range {v11 .. v17}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->place-70tqf50$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;JFILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-static/range {p10 .. p10}, Landroidx/compose/material3/internal/TextFieldImplKt;->heightOrZero(Landroidx/compose/ui/layout/Placeable;)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    sub-int v11, p2, v0

    .line 32
    .line 33
    invoke-interface/range {p13 .. p13}, Landroidx/compose/foundation/layout/PaddingValues;->calculateTopPadding-D9Ej5fM()F

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    mul-float v0, v0, p12

    .line 38
    .line 39
    invoke-static {v0}, Lt6/a;->q(F)I

    .line 40
    .line 41
    .line 42
    move-result v12

    .line 43
    if-eqz p5, :cond_0

    .line 44
    .line 45
    sget-object v0, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 46
    .line 47
    invoke-virtual {v0}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual/range {p5 .. p5}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    invoke-interface {v0, v2, v11}, Landroidx/compose/ui/Alignment$Vertical;->align(II)I

    .line 56
    .line 57
    .line 58
    move-result v21

    .line 59
    const/16 v23, 0x4

    .line 60
    .line 61
    const/16 v24, 0x0

    .line 62
    .line 63
    const/16 v20, 0x0

    .line 64
    .line 65
    const/16 v22, 0x0

    .line 66
    .line 67
    move-object/from16 v18, p0

    .line 68
    .line 69
    move-object/from16 v19, p5

    .line 70
    .line 71
    invoke-static/range {v18 .. v24}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeRelative$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    :cond_0
    if-eqz v3, :cond_1

    .line 75
    .line 76
    invoke-static/range {p5 .. p5}, Landroidx/compose/material3/internal/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    invoke-static {v10, v11, v12, v3}, Landroidx/compose/material3/TextFieldKt;->placeWithoutLabel$calculateVerticalPosition(ZIILandroidx/compose/ui/layout/Placeable;)I

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    const/4 v7, 0x4

    .line 85
    const/4 v8, 0x0

    .line 86
    const/4 v6, 0x0

    .line 87
    move-object/from16 v2, p0

    .line 88
    .line 89
    invoke-static/range {v2 .. v8}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeRelative$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    :cond_1
    invoke-static/range {p5 .. p5}, Landroidx/compose/material3/internal/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    invoke-static/range {p7 .. p7}, Landroidx/compose/material3/internal/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    add-int/2addr v2, v0

    .line 101
    move-object/from16 v3, p3

    .line 102
    .line 103
    invoke-static {v10, v11, v12, v3}, Landroidx/compose/material3/TextFieldKt;->placeWithoutLabel$calculateVerticalPosition(ZIILandroidx/compose/ui/layout/Placeable;)I

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    const/4 v7, 0x4

    .line 108
    const/4 v8, 0x0

    .line 109
    const/4 v6, 0x0

    .line 110
    move v4, v2

    .line 111
    move-object/from16 v2, p0

    .line 112
    .line 113
    invoke-static/range {v2 .. v8}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeRelative$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    move v2, v4

    .line 117
    if-eqz v1, :cond_2

    .line 118
    .line 119
    invoke-static {v10, v11, v12, v1}, Landroidx/compose/material3/TextFieldKt;->placeWithoutLabel$calculateVerticalPosition(ZIILandroidx/compose/ui/layout/Placeable;)I

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    const/4 v5, 0x4

    .line 124
    const/4 v6, 0x0

    .line 125
    const/4 v4, 0x0

    .line 126
    move-object/from16 v0, p0

    .line 127
    .line 128
    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeRelative$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    :cond_2
    if-eqz v9, :cond_3

    .line 132
    .line 133
    invoke-static/range {p6 .. p6}, Landroidx/compose/material3/internal/TextFieldImplKt;->widthOrZero(Landroidx/compose/ui/layout/Placeable;)I

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    sub-int v0, p1, v0

    .line 138
    .line 139
    invoke-virtual {v9}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    sub-int v2, v0, v1

    .line 144
    .line 145
    invoke-static {v10, v11, v12, v9}, Landroidx/compose/material3/TextFieldKt;->placeWithoutLabel$calculateVerticalPosition(ZIILandroidx/compose/ui/layout/Placeable;)I

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    const/4 v5, 0x4

    .line 150
    const/4 v6, 0x0

    .line 151
    const/4 v4, 0x0

    .line 152
    move-object/from16 v0, p0

    .line 153
    .line 154
    move-object v1, v9

    .line 155
    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeRelative$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    :cond_3
    if-eqz p6, :cond_4

    .line 159
    .line 160
    invoke-virtual/range {p6 .. p6}, Landroidx/compose/ui/layout/Placeable;->getWidth()I

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    sub-int v2, p1, v0

    .line 165
    .line 166
    sget-object v0, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 167
    .line 168
    invoke-virtual {v0}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-virtual/range {p6 .. p6}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    invoke-interface {v0, v1, v11}, Landroidx/compose/ui/Alignment$Vertical;->align(II)I

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    const/4 v5, 0x4

    .line 181
    const/4 v6, 0x0

    .line 182
    const/4 v4, 0x0

    .line 183
    move-object/from16 v0, p0

    .line 184
    .line 185
    move-object/from16 v1, p6

    .line 186
    .line 187
    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeRelative$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    :cond_4
    if-eqz p10, :cond_5

    .line 191
    .line 192
    const/4 v0, 0x4

    .line 193
    const/4 v1, 0x0

    .line 194
    const/4 v2, 0x0

    .line 195
    const/4 v3, 0x0

    .line 196
    move-object/from16 p1, p0

    .line 197
    .line 198
    move-object/from16 p2, p10

    .line 199
    .line 200
    move/from16 p6, v0

    .line 201
    .line 202
    move-object/from16 p7, v1

    .line 203
    .line 204
    move/from16 p3, v2

    .line 205
    .line 206
    move/from16 p5, v3

    .line 207
    .line 208
    move/from16 p4, v11

    .line 209
    .line 210
    invoke-static/range {p1 .. p7}, Landroidx/compose/ui/layout/Placeable$PlacementScope;->placeRelative$default(Landroidx/compose/ui/layout/Placeable$PlacementScope;Landroidx/compose/ui/layout/Placeable;IIFILjava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    :cond_5
    return-void
.end method

.method private static final placeWithoutLabel$calculateVerticalPosition(ZIILandroidx/compose/ui/layout/Placeable;)I
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/compose/ui/Alignment$Companion;->getCenterVertically()Landroidx/compose/ui/Alignment$Vertical;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p3}, Landroidx/compose/ui/layout/Placeable;->getHeight()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    invoke-interface {p0, p2, p1}, Landroidx/compose/ui/Alignment$Vertical;->align(II)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    :cond_0
    return p2
.end method

.method private static final substractConstraintSafely(II)I
    .locals 1

    const v0, 0x7fffffff

    if-ne p0, v0, :cond_0

    return p0

    :cond_0
    sub-int/2addr p0, p1

    return p0
.end method
