.class public final Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008c\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u001a\u0017\u0010\u0002\u001a\u00020\u00032\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u0082\u0008\u001a5\u0010\u0007\u001a\u0002H\u0008\"\u0004\u0008\u0000\u0010\u00082\u0006\u0010\t\u001a\u00020\n2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H\u00080\u000c\u00a2\u0006\u0002\u0008\rH\u0083\u0008\u00a2\u0006\u0002\u0010\u000e\u001aJ\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010*\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00110\u000c2!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0016\u00a2\u0006\u000c\u0008\u0017\u0012\u0008\u0008\u0018\u0012\u0004\u0008\u0008(\u0019\u0012\u0004\u0012\u00020\u00010\u000cH\u0083\u0008\u001a;\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010*\u00020\u00122\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00140\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0016H\u0002\u00a2\u0006\u0002\u0010!\u001a\u001d\u0010\"\u001a\u00020\u0006*\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00140\u001d0\u001cH\u0002\u00a2\u0006\u0002\u0010#\u001a\u001c\u0010$\u001a\u00020\u0003*\u00020\u00122\u0006\u0010%\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u0016H\u0002\u001a\u001c\u0010\'\u001a\u00020\u0016*\u00020\u00122\u0006\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u0016H\u0002\u001a.\u0010*\u001a\u00020\u0003*\u00020+2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u000cH\u0082\u0008\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008,\u0010-\u001a\u000c\u0010.\u001a\u00020\u0016*\u00020\u001fH\u0002\u001a2\u0010/\u001a\u00020\u0016\"\u0004\u0008\u0000\u0010\u0008*\u0008\u0012\u0004\u0012\u0002H\u00080\u001c2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0008\u0012\u0004\u0012\u00020\u00160\u000cH\u0082\u0008\u00a2\u0006\u0002\u00100\u001a\u0016\u00101\u001a\u00020\u0016*\u00020\u001f2\u0008\u0008\u0002\u00102\u001a\u00020\u0016H\u0000\u001a!\u00103\u001a\u00020\u0016*\u00020\u001f2\u0006\u00104\u001a\u00020+H\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u00085\u00106\u001a,\u00107\u001a\u000208*\u00020\u00122\u0006\u00109\u001a\u00020\u00162\u0006\u0010:\u001a\u00020\u001f2\u0006\u0010;\u001a\u00020\u001f2\u0006\u0010<\u001a\u00020\u0001H\u0003\u001ay\u0010=\u001a\u000208*\u00020\n2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u001f2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\u00012\u0006\u0010F\u001a\u00020\u00012\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\u00162\u0006\u0010J\u001a\u00020\u00162\u0006\u0010K\u001a\u00020\u00162\u0006\u0010L\u001a\u00020\u00162\u0006\u0010M\u001a\u00020\u0016H\u0001\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\u0008N\u0010O\u001a\u0014\u0010P\u001a\u00020\u0003*\u00020\u001f2\u0006\u0010Q\u001a\u00020\u0016H\u0002\u001a!\u0010R\u001a\u00020\u001f*\u00020\u001f2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u000cH\u0082\u0008\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008\u0019\u00a8\u0006S"
    }
    d2 = {
        "DebugLoggingEnabled",
        "",
        "debugLog",
        "",
        "message",
        "Lkotlin/Function0;",
        "",
        "withDebugLogging",
        "T",
        "scope",
        "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;",
        "block",
        "Lkotlin/Function1;",
        "Lkotlin/ExtensionFunctionType;",
        "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;",
        "calculateExtraItems",
        "",
        "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridPositionedItem;",
        "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;",
        "position",
        "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;",
        "filter",
        "",
        "Lkotlin/ParameterName;",
        "name",
        "itemIndex",
        "calculatePositionedItems",
        "measuredItems",
        "",
        "Lkotlin/collections/ArrayDeque;",
        "itemScrollOffsets",
        "",
        "mainAxisLayoutSize",
        "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;[Lkotlin/collections/ArrayDeque;[II)Ljava/util/List;",
        "debugRender",
        "([Lkotlin/collections/ArrayDeque;)Ljava/lang/String;",
        "ensureIndicesInRange",
        "indices",
        "itemCount",
        "findPreviousItemIndex",
        "item",
        "lane",
        "forEach",
        "Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;",
        "forEach-nIS5qE8",
        "(JLkotlin/jvm/functions/Function1;)V",
        "indexOfMaxValue",
        "indexOfMinBy",
        "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)I",
        "indexOfMinValue",
        "minBound",
        "maxInRange",
        "indexRange",
        "maxInRange-jy6DScQ",
        "([IJ)I",
        "measure",
        "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;",
        "initialScrollDelta",
        "initialItemIndices",
        "initialItemOffsets",
        "canRestartMeasure",
        "measureStaggeredGrid",
        "state",
        "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;",
        "itemProvider",
        "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;",
        "resolvedSlotSums",
        "constraints",
        "Landroidx/compose/ui/unit/Constraints;",
        "isVertical",
        "reverseLayout",
        "contentOffset",
        "Landroidx/compose/ui/unit/IntOffset;",
        "mainAxisAvailableSize",
        "mainAxisSpacing",
        "crossAxisSpacing",
        "beforeContentPadding",
        "afterContentPadding",
        "measureStaggeredGrid-BTfHGGE",
        "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;[IJZZJIIIII)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;",
        "offsetBy",
        "delta",
        "transform",
        "foundation_release"
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
        "SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 4 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext\n+ 5 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 8 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1097:1\n50#1,9:1108\n72#1,4:1117\n884#1:1134\n885#1,3:1139\n72#1,4:1142\n72#1,4:1146\n72#1,4:1150\n884#1:1161\n885#1,3:1166\n72#1,4:1177\n72#1,4:1181\n884#1:1202\n885#1,3:1207\n72#1,4:1212\n72#1,4:1218\n72#1,4:1222\n884#1:1243\n885#1,3:1248\n72#1,4:1251\n72#1,4:1255\n944#1,4:1259\n72#1,4:1263\n72#1,4:1267\n855#1,4:1271\n859#1,3:1279\n862#1,8:1284\n871#1:1293\n855#1,4:1294\n859#1,3:1302\n862#1,8:1307\n871#1:1316\n72#1,4:1317\n60#1:1325\n917#1,11:1329\n884#1:1340\n885#1,3:1345\n884#1:1358\n885#1,3:1363\n480#2,4:1098\n485#2:1107\n122#3,5:1102\n220#4:1121\n217#4:1122\n217#4:1128\n220#4:1154\n217#4:1155\n217#4:1171\n220#4:1189\n217#4:1190\n217#4:1196\n220#4:1230\n217#4:1231\n217#4:1237\n880#5:1123\n879#5:1124\n878#5:1126\n880#5:1129\n879#5:1130\n878#5:1132\n878#5:1135\n879#5:1137\n880#5:1156\n879#5:1157\n878#5:1159\n878#5:1162\n879#5:1164\n878#5:1169\n880#5:1172\n879#5:1173\n878#5:1175\n880#5:1191\n879#5:1192\n878#5:1194\n880#5:1197\n879#5:1198\n878#5:1200\n878#5:1203\n879#5:1205\n878#5:1210\n880#5:1232\n879#5:1233\n878#5:1235\n880#5:1238\n879#5:1239\n878#5:1241\n878#5:1244\n879#5:1246\n878#5:1341\n879#5:1343\n878#5:1354\n879#5:1356\n878#5:1359\n879#5:1361\n62#6:1125\n55#6:1127\n62#6:1131\n55#6:1133\n55#6:1136\n62#6:1138\n62#6:1158\n55#6:1160\n55#6:1163\n62#6:1165\n55#6:1170\n62#6:1174\n55#6:1176\n62#6:1193\n55#6:1195\n62#6:1199\n55#6:1201\n55#6:1204\n62#6:1206\n55#6:1211\n62#6:1234\n55#6:1236\n62#6:1240\n55#6:1242\n55#6:1245\n62#6:1247\n55#6:1342\n62#6:1344\n55#6:1355\n62#6:1357\n55#6:1360\n62#6:1362\n12774#7,2:1185\n12541#7,2:1187\n12774#7,2:1216\n12583#7,2:1226\n12774#7,2:1228\n12583#7,2:1282\n12583#7,2:1305\n12774#7,2:1321\n12583#7,2:1323\n12744#7,2:1327\n33#8,4:1275\n38#8:1292\n33#8,4:1298\n38#8:1315\n33#8,6:1348\n1#9:1326\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt\n*L\n230#1:1108,9\n288#1:1117,4\n333#1:1134\n333#1:1139,3\n339#1:1142,4\n381#1:1146,4\n419#1:1150,4\n447#1:1161\n447#1:1166,3\n464#1:1177,4\n467#1:1181,4\n500#1:1202\n500#1:1207,3\n518#1:1212,4\n540#1:1218,4\n543#1:1222,4\n607#1:1243\n607#1:1248,3\n645#1:1251,4\n648#1:1255,4\n665#1:1259,4\n669#1:1263,4\n692#1:1267,4\n716#1:1271,4\n716#1:1279,3\n716#1:1284,8\n716#1:1293\n741#1:1294,4\n741#1:1302,3\n741#1:1307,8\n741#1:1316\n763#1:1317,4\n230#1:1325\n818#1:1329,11\n843#1:1340\n843#1:1345,3\n897#1:1358\n897#1:1363,3\n111#1:1098,4\n111#1:1107\n111#1:1102,5\n325#1:1121\n325#1:1122\n332#1:1128\n445#1:1154\n445#1:1155\n457#1:1171\n491#1:1189\n491#1:1190\n495#1:1196\n599#1:1230\n599#1:1231\n606#1:1237\n325#1:1123\n325#1:1124\n325#1:1126\n332#1:1129\n332#1:1130\n332#1:1132\n333#1:1135\n333#1:1137\n445#1:1156\n445#1:1157\n445#1:1159\n447#1:1162\n447#1:1164\n453#1:1169\n457#1:1172\n457#1:1173\n457#1:1175\n491#1:1191\n491#1:1192\n491#1:1194\n495#1:1197\n495#1:1198\n495#1:1200\n500#1:1203\n500#1:1205\n510#1:1210\n599#1:1232\n599#1:1233\n599#1:1235\n606#1:1238\n606#1:1239\n606#1:1241\n607#1:1244\n607#1:1246\n843#1:1341\n843#1:1343\n884#1:1354\n884#1:1356\n897#1:1359\n897#1:1361\n325#1:1125\n325#1:1127\n332#1:1131\n332#1:1133\n333#1:1136\n333#1:1138\n445#1:1158\n445#1:1160\n447#1:1163\n447#1:1165\n453#1:1170\n457#1:1174\n457#1:1176\n491#1:1193\n491#1:1195\n495#1:1199\n495#1:1201\n500#1:1204\n500#1:1206\n510#1:1211\n599#1:1234\n599#1:1236\n606#1:1240\n606#1:1242\n607#1:1245\n607#1:1247\n843#1:1342\n843#1:1344\n884#1:1355\n884#1:1357\n897#1:1360\n897#1:1362\n476#1:1185,2\n479#1:1187,2\n536#1:1216,2\n550#1:1226,2\n558#1:1228,2\n725#1:1282,2\n754#1:1305,2\n772#1:1321,2\n773#1:1323,2\n816#1:1327,2\n716#1:1275,4\n716#1:1292\n741#1:1298,4\n741#1:1315\n858#1:1348,6\n*E\n"
    }
.end annotation


# static fields
.field private static final DebugLoggingEnabled:Z = false


# direct methods
.method private static final calculateExtraItems(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/util/List;
    .locals 9
    .annotation build Landroidx/compose/foundation/ExperimentalFoundationApi;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridPositionedItem;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridPositionedItem;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getState()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->getPinnedItems$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    move v4, v3

    .line 16
    :goto_0
    if-ge v4, v1, :cond_2

    .line 17
    .line 18
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    check-cast v5, Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList$PinnedItem;

    .line 23
    .line 24
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getItemProvider()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    invoke-interface {v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList$PinnedItem;->getKey()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    invoke-interface {v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList$PinnedItem;->getIndex()I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    invoke-static {v6, v7, v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProviderKt;->findIndexByKey(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;Ljava/lang/Object;I)I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    invoke-interface {p2, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    check-cast v6, Ljava/lang/Boolean;

    .line 49
    .line 50
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    if-eqz v6, :cond_1

    .line 55
    .line 56
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getItemProvider()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;

    .line 57
    .line 58
    .line 59
    move-result-object v6

    .line 60
    invoke-virtual {p0, v6, v5, v3}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getSpanRange-lOCCd4c(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;II)J

    .line 61
    .line 62
    .line 63
    move-result-wide v6

    .line 64
    if-nez v2, :cond_0

    .line 65
    .line 66
    new-instance v2, Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 69
    .line 70
    .line 71
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getMeasuredItemProvider()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;

    .line 72
    .line 73
    .line 74
    move-result-object v8

    .line 75
    invoke-virtual {v8, v5, v6, v7}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;->getAndMeasure-jy6DScQ(IJ)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    invoke-interface {p1, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_2
    if-nez v2, :cond_3

    .line 90
    .line 91
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    :cond_3
    return-object v2
.end method

.method private static final calculatePositionedItems(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;[Lkotlin/collections/ArrayDeque;[II)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;",
            "[",
            "Lkotlin/collections/ArrayDeque<",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;",
            ">;[II)",
            "Ljava/util/List<",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridPositionedItem;",
            ">;"
        }
    .end annotation

    .line 1
    array-length v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    move v3, v2

    .line 5
    :goto_0
    if-ge v2, v0, :cond_0

    .line 6
    .line 7
    aget-object v4, p1, v2

    .line 8
    .line 9
    invoke-virtual {v4}, Lkotlin/collections/AbstractMutableList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    add-int/2addr v3, v4

    .line 14
    add-int/lit8 v2, v2, 0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 20
    .line 21
    .line 22
    :cond_1
    :goto_1
    array-length v2, p1

    .line 23
    move v3, v1

    .line 24
    :goto_2
    if-ge v3, v2, :cond_3

    .line 25
    .line 26
    aget-object v4, p1, v3

    .line 27
    .line 28
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    const/4 v5, 0x1

    .line 33
    xor-int/2addr v4, v5

    .line 34
    if-eqz v4, :cond_2

    .line 35
    .line 36
    goto :goto_3

    .line 37
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_3
    move v5, v1

    .line 41
    :goto_3
    if-eqz v5, :cond_a

    .line 42
    .line 43
    array-length v2, p1

    .line 44
    const v3, 0x7fffffff

    .line 45
    .line 46
    .line 47
    const/4 v4, -0x1

    .line 48
    move v5, v1

    .line 49
    move v6, v3

    .line 50
    :goto_4
    if-ge v5, v2, :cond_6

    .line 51
    .line 52
    aget-object v7, p1, v5

    .line 53
    .line 54
    invoke-virtual {v7}, Lkotlin/collections/ArrayDeque;->firstOrNull()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    check-cast v7, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;

    .line 59
    .line 60
    if-eqz v7, :cond_4

    .line 61
    .line 62
    invoke-virtual {v7}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getIndex()I

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    goto :goto_5

    .line 67
    :cond_4
    move v7, v3

    .line 68
    :goto_5
    if-le v6, v7, :cond_5

    .line 69
    .line 70
    move v4, v5

    .line 71
    move v6, v7

    .line 72
    :cond_5
    add-int/lit8 v5, v5, 0x1

    .line 73
    .line 74
    goto :goto_4

    .line 75
    :cond_6
    aget-object v2, p1, v4

    .line 76
    .line 77
    invoke-virtual {v2}, Lkotlin/collections/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    check-cast v2, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;

    .line 82
    .line 83
    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getLane()I

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    if-eq v3, v4, :cond_7

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_7
    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getLane()I

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getSpan()I

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    invoke-static {v3, v5}, Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;->constructor-impl(II)J

    .line 99
    .line 100
    .line 101
    move-result-wide v5

    .line 102
    invoke-static {p2, v5, v6}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->maxInRange-jy6DScQ([IJ)I

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    if-nez v4, :cond_8

    .line 107
    .line 108
    move v7, v1

    .line 109
    goto :goto_6

    .line 110
    :cond_8
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getResolvedSlotSums()[I

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    add-int/lit8 v8, v4, -0x1

    .line 115
    .line 116
    aget v7, v7, v8

    .line 117
    .line 118
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getCrossAxisSpacing()I

    .line 119
    .line 120
    .line 121
    move-result v8

    .line 122
    mul-int/2addr v8, v4

    .line 123
    add-int/2addr v7, v8

    .line 124
    :goto_6
    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getPlaceables()Ljava/util/List;

    .line 125
    .line 126
    .line 127
    move-result-object v8

    .line 128
    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    .line 129
    .line 130
    .line 131
    move-result v8

    .line 132
    if-eqz v8, :cond_9

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_9
    invoke-virtual {v2, v4, v3, v7, p3}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->position(IIII)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridPositionedItem;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    const/16 v4, 0x20

    .line 143
    .line 144
    shr-long v7, v5, v4

    .line 145
    .line 146
    long-to-int v4, v7

    .line 147
    const-wide v7, 0xffffffffL

    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    and-long/2addr v5, v7

    .line 153
    long-to-int v5, v5

    .line 154
    :goto_7
    if-ge v4, v5, :cond_1

    .line 155
    .line 156
    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getSizeWithSpacings()I

    .line 157
    .line 158
    .line 159
    move-result v6

    .line 160
    add-int/2addr v6, v3

    .line 161
    aput v6, p2, v4

    .line 162
    .line 163
    add-int/lit8 v4, v4, 0x1

    .line 164
    .line 165
    goto :goto_7

    .line 166
    :cond_a
    return-object v0
.end method

.method private static final debugLog(Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method private static final debugRender([Lkotlin/collections/ArrayDeque;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lkotlin/collections/ArrayDeque<",
            "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string p0, ""

    return-object p0
.end method

.method private static final ensureIndicesInRange(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;[II)V
    .locals 4

    .line 1
    array-length v0, p1

    .line 2
    add-int/lit8 v0, v0, -0x1

    .line 3
    .line 4
    if-ltz v0, :cond_4

    .line 5
    .line 6
    :goto_0
    add-int/lit8 v1, v0, -0x1

    .line 7
    .line 8
    :goto_1
    aget v2, p1, v0

    .line 9
    .line 10
    if-ge v2, p2, :cond_3

    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneInfo()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    aget v3, p1, v0

    .line 17
    .line 18
    invoke-virtual {v2, v3, v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->assignedToLane(II)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_0
    aget v2, p1, v0

    .line 26
    .line 27
    if-ltz v2, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getItemProvider()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    aget v3, p1, v0

    .line 34
    .line 35
    invoke-virtual {p0, v2, v3}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->isFullSpan(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;I)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_1

    .line 40
    .line 41
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneInfo()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    aget v3, p1, v0

    .line 46
    .line 47
    invoke-virtual {v2, v3, v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->setLane(II)V

    .line 48
    .line 49
    .line 50
    :cond_1
    if-gez v1, :cond_2

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_2
    move v0, v1

    .line 54
    goto :goto_0

    .line 55
    :cond_3
    :goto_2
    aget v2, p1, v0

    .line 56
    .line 57
    invoke-static {p0, v2, v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->findPreviousItemIndex(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;II)I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    aput v2, p1, v0

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_4
    :goto_3
    return-void
.end method

.method private static final findPreviousItemIndex(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;II)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneInfo()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1, p2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->findPreviousItemIndex(II)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method private static final forEach-nIS5qE8(JLkotlin/jvm/functions/Function1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v0, p0, v0

    .line 4
    .line 5
    long-to-int v0, v0

    .line 6
    const-wide v1, 0xffffffffL

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    and-long/2addr p0, v1

    .line 12
    long-to-int p0, p0

    .line 13
    :goto_0
    if-ge v0, p0, :cond_0

    .line 14
    .line 15
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    add-int/lit8 v0, v0, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
.end method

.method private static final indexOfMaxValue([I)I
    .locals 5

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, -0x1

    .line 3
    const/high16 v2, -0x80000000

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    :goto_0
    if-ge v3, v0, :cond_1

    .line 7
    .line 8
    aget v4, p0, v3

    .line 9
    .line 10
    if-ge v2, v4, :cond_0

    .line 11
    .line 12
    move v1, v3

    .line 13
    move v2, v4

    .line 14
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    return v1
.end method

.method private static final indexOfMinBy([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;",
            "Ljava/lang/Integer;",
            ">;)I"
        }
    .end annotation

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, -0x1

    .line 3
    const v2, 0x7fffffff

    .line 4
    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    :goto_0
    if-ge v3, v0, :cond_1

    .line 8
    .line 9
    aget-object v4, p0, v3

    .line 10
    .line 11
    invoke-interface {p1, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    check-cast v4, Ljava/lang/Number;

    .line 16
    .line 17
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-le v2, v4, :cond_0

    .line 22
    .line 23
    move v1, v3

    .line 24
    move v2, v4

    .line 25
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    return v1
.end method

.method public static final indexOfMinValue([II)I
    .locals 8

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    array-length v0, p0

    .line 7
    const/4 v1, -0x1

    .line 8
    const v2, 0x7fffffff

    .line 9
    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    move v4, v3

    .line 13
    :goto_0
    if-ge v4, v0, :cond_2

    .line 14
    .line 15
    const/4 v5, 0x1

    .line 16
    add-int/lit8 v6, p1, 0x1

    .line 17
    .line 18
    aget v7, p0, v4

    .line 19
    .line 20
    if-gt v6, v7, :cond_0

    .line 21
    .line 22
    if-ge v7, v2, :cond_0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_0
    move v5, v3

    .line 26
    :goto_1
    if-eqz v5, :cond_1

    .line 27
    .line 28
    move v1, v4

    .line 29
    move v2, v7

    .line 30
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_2
    return v1
.end method

.method public static synthetic indexOfMinValue$default([IIILjava/lang/Object;)I
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/high16 p1, -0x80000000

    .line 6
    .line 7
    :cond_0
    invoke-static {p0, p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->indexOfMinValue([II)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private static final maxInRange-jy6DScQ([IJ)I
    .locals 3

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v0, p1, v0

    .line 4
    .line 5
    long-to-int v0, v0

    .line 6
    const-wide v1, 0xffffffffL

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    and-long/2addr p1, v1

    .line 12
    long-to-int p1, p1

    .line 13
    const/high16 p2, -0x80000000

    .line 14
    .line 15
    :goto_0
    if-ge v0, p1, :cond_0

    .line 16
    .line 17
    aget v1, p0, v0

    .line 18
    .line 19
    invoke-static {p2, v1}, Ljava/lang/Math;->max(II)I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return p2
.end method

.method private static final measure(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;I[I[IZ)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;
    .locals 30
    .annotation build Landroidx/compose/foundation/ExperimentalFoundationApi;
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    .line 1
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getMeasureScope()Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;

    move-result-object v4

    .line 2
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getItemProvider()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;

    move-result-object v5

    invoke-interface {v5}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;->getItemCount()I

    move-result v15

    if-lez v15, :cond_73

    .line 3
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneCount()I

    move-result v5

    if-nez v5, :cond_0

    goto/16 :goto_57

    .line 4
    :cond_0
    array-length v5, v2

    invoke-static {v2, v5}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v8

    const-string v5, "copyOf(this, size)"

    invoke-static {v8, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    array-length v2, v3

    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v9

    invoke-static {v9, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-static {v0, v8, v15}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->ensureIndicesInRange(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;[II)V

    neg-int v2, v1

    .line 7
    invoke-static {v9, v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->offsetBy([II)V

    .line 8
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneCount()I

    move-result v6

    new-array v7, v6, [Lkotlin/collections/ArrayDeque;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v6, :cond_1

    .line 9
    new-instance v3, Lkotlin/collections/ArrayDeque;

    const/16 v11, 0x10

    invoke-direct {v3, v11}, Lkotlin/collections/ArrayDeque;-><init>(I)V

    aput-object v3, v7, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 10
    :cond_1
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getBeforeContentPadding()I

    move-result v2

    neg-int v2, v2

    invoke-static {v9, v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->offsetBy([II)V

    .line 11
    :cond_2
    invoke-static {v8, v9, v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->measure$lambda$37$hasSpaceBeforeFirst([I[ILandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;)Z

    move-result v2

    if-eqz v2, :cond_b

    .line 12
    invoke-static {v8}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->indexOfMaxValue([I)I

    move-result v2

    .line 13
    aget v14, v8, v2

    .line 14
    array-length v10, v9

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v10, :cond_4

    .line 15
    aget v11, v8, v3

    aget v12, v8, v2

    if-eq v11, v12, :cond_3

    .line 16
    aget v11, v9, v3

    aget v12, v9, v2

    if-ge v11, v12, :cond_3

    .line 17
    aput v12, v9, v3

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 18
    :cond_4
    invoke-static {v0, v14, v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->findPreviousItemIndex(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;II)I

    move-result v3

    if-gez v3, :cond_5

    goto/16 :goto_8

    .line 19
    :cond_5
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getItemProvider()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;

    move-result-object v10

    invoke-virtual {v0, v10, v3, v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getSpanRange-lOCCd4c(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;II)J

    move-result-wide v10

    .line 20
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneInfo()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    move-result-object v2

    const-wide v12, 0xffffffffL

    and-long/2addr v12, v10

    long-to-int v12, v12

    const/16 v13, 0x20

    shr-long v13, v10, v13

    long-to-int v13, v13

    sub-int v14, v12, v13

    move/from16 v17, v13

    const/4 v13, 0x1

    if-eq v14, v13, :cond_6

    move/from16 v19, v13

    goto :goto_2

    :cond_6
    const/16 v19, 0x0

    :goto_2
    if-eqz v19, :cond_7

    const/4 v13, -0x2

    goto :goto_3

    :cond_7
    move/from16 v13, v17

    :goto_3
    invoke-virtual {v2, v3, v13}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->setLane(II)V

    .line 21
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getMeasuredItemProvider()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;

    move-result-object v2

    invoke-virtual {v2, v3, v10, v11}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;->getAndMeasure-jy6DScQ(IJ)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;

    move-result-object v2

    .line 22
    invoke-static {v9, v10, v11}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->maxInRange-jy6DScQ([IJ)I

    move-result v10

    const/4 v11, 0x1

    if-eq v14, v11, :cond_8

    const/16 v19, 0x1

    goto :goto_4

    :cond_8
    const/16 v19, 0x0

    :goto_4
    if-eqz v19, :cond_9

    .line 23
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneInfo()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    move-result-object v11

    invoke-virtual {v11, v3}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->getGaps(I)[I

    move-result-object v11

    goto :goto_5

    :cond_9
    const/4 v11, 0x0

    :goto_5
    move/from16 v13, v17

    :goto_6
    if-ge v13, v12, :cond_2

    .line 24
    aput v3, v8, v13

    if-nez v11, :cond_a

    const/4 v14, 0x0

    goto :goto_7

    .line 25
    :cond_a
    aget v14, v11, v13

    .line 26
    :goto_7
    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getSizeWithSpacings()I

    move-result v16

    add-int v16, v10, v16

    add-int v16, v16, v14

    aput v16, v9, v13

    add-int/lit8 v13, v13, 0x1

    goto :goto_6

    :cond_b
    const/4 v2, -0x1

    .line 27
    :goto_8
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getBeforeContentPadding()I

    move-result v3

    neg-int v14, v3

    const/4 v3, 0x0

    .line 28
    aget v10, v9, v3

    if-ge v10, v14, :cond_c

    add-int/2addr v1, v10

    sub-int v10, v14, v10

    .line 29
    invoke-static {v9, v10}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->offsetBy([II)V

    .line 30
    :cond_c
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getBeforeContentPadding()I

    move-result v10

    invoke-static {v9, v10}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->offsetBy([II)V

    const/4 v10, -0x1

    if-ne v2, v10, :cond_d

    .line 31
    invoke-static {v8, v3}, Lkotlin/collections/ArraysKt;->indexOf([II)I

    move-result v2

    :cond_d
    if-eq v2, v10, :cond_10

    .line 32
    invoke-static {v8, v0, v9, v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->measure$lambda$37$misalignedStart([ILandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;[II)Z

    move-result v3

    if-eqz v3, :cond_10

    if-eqz p4, :cond_10

    .line 33
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneInfo()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->reset()V

    .line 34
    array-length v3, v8

    new-array v4, v3, [I

    const/4 v5, 0x0

    :goto_9
    if-ge v5, v3, :cond_e

    aput v10, v4, v5

    add-int/lit8 v5, v5, 0x1

    const/4 v10, -0x1

    goto :goto_9

    .line 35
    :cond_e
    array-length v3, v9

    new-array v5, v3, [I

    const/4 v6, 0x0

    :goto_a
    if-ge v6, v3, :cond_f

    .line 36
    aget v7, v9, v2

    aput v7, v5, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_a

    :cond_f
    const/4 v6, 0x0

    .line 37
    invoke-static {v0, v1, v4, v5, v6}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->measure(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;I[I[IZ)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;

    move-result-object v0

    return-object v0

    .line 38
    :cond_10
    array-length v2, v8

    invoke-static {v8, v2}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v3

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    array-length v10, v9

    new-array v11, v10, [I

    const/4 v2, 0x0

    :goto_b
    if-ge v2, v10, :cond_11

    .line 40
    aget v12, v9, v2

    neg-int v12, v12

    aput v12, v11, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_b

    .line 41
    :cond_11
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getMainAxisAvailableSize()I

    move-result v2

    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getAfterContentPadding()I

    move-result v12

    add-int/2addr v2, v12

    const/4 v12, 0x0

    invoke-static {v2, v12}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result v13

    move-object/from16 v23, v4

    const/4 v2, 0x0

    const/4 v4, 0x1

    .line 42
    invoke-static {v3, v12, v4, v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->indexOfMinValue$default([IIILjava/lang/Object;)I

    move-result v24

    move/from16 v4, v24

    const/4 v2, 0x0

    :goto_c
    const/4 v12, -0x1

    if-eq v4, v12, :cond_19

    .line 43
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneCount()I

    move-result v12

    if-ge v2, v12, :cond_19

    .line 44
    aget v12, v3, v4

    .line 45
    invoke-static {v3, v12}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->indexOfMinValue([II)I

    move-result v24

    add-int/lit8 v2, v2, 0x1

    if-ltz v12, :cond_17

    move/from16 p1, v2

    .line 46
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getItemProvider()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;

    move-result-object v2

    move-object/from16 v25, v5

    invoke-virtual {v0, v2, v12, v4}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getSpanRange-lOCCd4c(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;II)J

    move-result-wide v4

    .line 47
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getMeasuredItemProvider()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;

    move-result-object v2

    invoke-virtual {v2, v12, v4, v5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;->getAndMeasure-jy6DScQ(IJ)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;

    move-result-object v2

    move/from16 v26, v1

    .line 48
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneInfo()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    move-result-object v1

    move-object/from16 v27, v8

    move-object/from16 v28, v9

    const-wide v21, 0xffffffffL

    and-long v8, v4, v21

    long-to-int v8, v8

    move/from16 v29, v13

    move/from16 p3, v14

    const/16 v9, 0x20

    shr-long v13, v4, v9

    long-to-int v9, v13

    sub-int v13, v8, v9

    const/4 v14, 0x1

    if-eq v13, v14, :cond_12

    const/4 v14, 0x1

    goto :goto_d

    :cond_12
    const/4 v14, 0x0

    :goto_d
    if-eqz v14, :cond_13

    const/4 v14, -0x2

    goto :goto_e

    :cond_13
    move v14, v9

    :goto_e
    invoke-virtual {v1, v12, v14}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->setLane(II)V

    .line 49
    invoke-static {v11, v4, v5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->maxInRange-jy6DScQ([IJ)I

    move-result v1

    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getSizeWithSpacings()I

    move-result v4

    add-int/2addr v1, v4

    move v4, v9

    :goto_f
    if-ge v4, v8, :cond_14

    .line 50
    aput v1, v11, v4

    .line 51
    aput v12, v3, v4

    .line 52
    aget-object v5, v7, v4

    invoke-virtual {v5, v2}, Lkotlin/collections/ArrayDeque;->addLast(Ljava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_f

    .line 53
    :cond_14
    aget v1, v11, v9

    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getMainAxisSpacing()I

    move-result v4

    add-int v14, p3, v4

    if-gt v1, v14, :cond_15

    const/4 v1, 0x0

    .line 54
    invoke-virtual {v2, v1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->setVisible(Z)V

    :cond_15
    const/4 v1, 0x1

    if-eq v13, v1, :cond_16

    const/4 v1, 0x1

    goto :goto_10

    :cond_16
    const/4 v1, 0x0

    :goto_10
    if-eqz v1, :cond_18

    .line 55
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneCount()I

    move-result v2

    goto :goto_11

    :cond_17
    move/from16 v26, v1

    move/from16 p1, v2

    move-object/from16 v25, v5

    move-object/from16 v27, v8

    move-object/from16 v28, v9

    move/from16 v29, v13

    move/from16 p3, v14

    :cond_18
    move/from16 v2, p1

    :goto_11
    move/from16 v14, p3

    move/from16 v4, v24

    move-object/from16 v5, v25

    move/from16 v1, v26

    move-object/from16 v8, v27

    move-object/from16 v9, v28

    move/from16 v13, v29

    goto/16 :goto_c

    :cond_19
    move/from16 v26, v1

    move-object/from16 v25, v5

    move-object/from16 v27, v8

    move-object/from16 v28, v9

    move/from16 v29, v13

    move/from16 p3, v14

    :goto_12
    const/4 v1, 0x0

    :goto_13
    if-ge v1, v10, :cond_1d

    .line 56
    aget v2, v11, v1

    move/from16 v8, v29

    if-lt v2, v8, :cond_1b

    if-gtz v2, :cond_1a

    goto :goto_14

    :cond_1a
    const/4 v2, 0x0

    goto :goto_15

    :cond_1b
    :goto_14
    const/4 v2, 0x1

    :goto_15
    if-eqz v2, :cond_1c

    const/4 v1, 0x1

    goto :goto_16

    :cond_1c
    add-int/lit8 v1, v1, 0x1

    move/from16 v29, v8

    goto :goto_13

    :cond_1d
    move/from16 v8, v29

    const/4 v1, 0x0

    :goto_16
    if-nez v1, :cond_21

    const/4 v1, 0x0

    :goto_17
    if-ge v1, v6, :cond_1f

    .line 57
    aget-object v2, v7, v1

    .line 58
    invoke-virtual {v2}, Lkotlin/collections/ArrayDeque;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1e

    const/4 v1, 0x0

    goto :goto_18

    :cond_1e
    add-int/lit8 v1, v1, 0x1

    goto :goto_17

    :cond_1f
    const/4 v1, 0x1

    :goto_18
    if-eqz v1, :cond_20

    goto :goto_19

    :cond_20
    const/4 v2, 0x1

    goto :goto_1a

    :cond_21
    :goto_19
    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v4, 0x0

    .line 59
    invoke-static {v11, v4, v2, v1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->indexOfMinValue$default([IIILjava/lang/Object;)I

    move-result v5

    .line 60
    invoke-static {v3}, Lkotlin/collections/ArraysKt;->maxOrThrow([I)I

    move-result v1

    add-int/2addr v1, v2

    if-lt v1, v15, :cond_6a

    :goto_1a
    const/4 v1, 0x0

    :goto_1b
    if-ge v1, v6, :cond_26

    .line 61
    aget-object v4, v7, v1

    .line 62
    :goto_1c
    invoke-virtual {v4}, Lkotlin/collections/AbstractMutableList;->size()I

    move-result v5

    if-le v5, v2, :cond_24

    invoke-virtual {v4}, Lkotlin/collections/ArrayDeque;->first()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;

    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->isVisible()Z

    move-result v5

    if-nez v5, :cond_24

    .line 63
    invoke-virtual {v4}, Lkotlin/collections/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;

    .line 64
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getSpan()I

    move-result v9

    if-eq v9, v2, :cond_22

    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneInfo()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    move-result-object v2

    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getIndex()I

    move-result v9

    invoke-virtual {v2, v9}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->getGaps(I)[I

    move-result-object v2

    goto :goto_1d

    :cond_22
    const/4 v2, 0x0

    .line 65
    :goto_1d
    aget v9, v28, v1

    .line 66
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getSizeWithSpacings()I

    move-result v5

    if-nez v2, :cond_23

    const/4 v2, 0x0

    goto :goto_1e

    :cond_23
    aget v2, v2, v1

    :goto_1e
    add-int/2addr v5, v2

    sub-int/2addr v9, v5

    .line 67
    aput v9, v28, v1

    const/4 v2, 0x1

    goto :goto_1c

    .line 68
    :cond_24
    invoke-virtual {v4}, Lkotlin/collections/ArrayDeque;->firstOrNull()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;

    if-eqz v2, :cond_25

    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getIndex()I

    move-result v2

    goto :goto_1f

    :cond_25
    const/4 v2, -0x1

    :goto_1f
    aput v2, v27, v1

    add-int/lit8 v1, v1, 0x1

    const/4 v2, 0x1

    goto :goto_1b

    .line 69
    :cond_26
    array-length v1, v3

    const/4 v2, 0x0

    :goto_20
    if-ge v2, v1, :cond_29

    aget v4, v3, v2

    add-int/lit8 v5, v15, -0x1

    if-ne v4, v5, :cond_27

    const/4 v4, 0x1

    goto :goto_21

    :cond_27
    const/4 v4, 0x0

    :goto_21
    if-eqz v4, :cond_28

    const/4 v1, 0x1

    goto :goto_22

    :cond_28
    add-int/lit8 v2, v2, 0x1

    goto :goto_20

    :cond_29
    const/4 v1, 0x0

    :goto_22
    if-eqz v1, :cond_2a

    .line 70
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getMainAxisSpacing()I

    move-result v1

    neg-int v1, v1

    invoke-static {v11, v1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->offsetBy([II)V

    :cond_2a
    const/4 v1, 0x0

    :goto_23
    if-ge v1, v10, :cond_2d

    .line 71
    aget v2, v11, v1

    .line 72
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getMainAxisAvailableSize()I

    move-result v4

    if-ge v2, v4, :cond_2b

    const/4 v2, 0x1

    goto :goto_24

    :cond_2b
    const/4 v2, 0x0

    :goto_24
    if-nez v2, :cond_2c

    const/4 v1, 0x0

    goto :goto_25

    :cond_2c
    add-int/lit8 v1, v1, 0x1

    goto :goto_23

    :cond_2d
    const/4 v1, 0x1

    :goto_25
    if-eqz v1, :cond_42

    .line 73
    invoke-static {v11}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->indexOfMaxValue([I)I

    move-result v1

    .line 74
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getMainAxisAvailableSize()I

    move-result v2

    aget v1, v11, v1

    sub-int/2addr v2, v1

    neg-int v1, v2

    move-object/from16 v9, v28

    .line 75
    invoke-static {v9, v1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->offsetBy([II)V

    .line 76
    invoke-static {v11, v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->offsetBy([II)V

    const/4 v1, 0x0

    .line 77
    :goto_26
    array-length v4, v9

    const/4 v5, 0x0

    :goto_27
    if-ge v5, v4, :cond_30

    aget v12, v9, v5

    .line 78
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getBeforeContentPadding()I

    move-result v13

    if-ge v12, v13, :cond_2e

    const/4 v12, 0x1

    goto :goto_28

    :cond_2e
    const/4 v12, 0x0

    :goto_28
    if-eqz v12, :cond_2f

    const/4 v4, 0x1

    goto :goto_29

    :cond_2f
    add-int/lit8 v5, v5, 0x1

    goto :goto_27

    :cond_30
    const/4 v4, 0x0

    :goto_29
    if-eqz v4, :cond_3f

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v12, 0x0

    .line 79
    invoke-static {v9, v12, v5, v4}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->indexOfMinValue$default([IIILjava/lang/Object;)I

    move-result v13

    .line 80
    invoke-static/range {v27 .. v27}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->indexOfMaxValue([I)I

    move-result v4

    if-eq v13, v4, :cond_31

    const/4 v1, 0x1

    .line 81
    :cond_31
    aget v4, v27, v13

    const/4 v5, -0x1

    if-ne v4, v5, :cond_32

    move v4, v15

    .line 82
    :cond_32
    invoke-static {v0, v4, v13}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->findPreviousItemIndex(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;II)I

    move-result v4

    if-gez v4, :cond_37

    move-object/from16 v12, v27

    if-nez v1, :cond_33

    .line 83
    invoke-static {v12, v0, v9, v13}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->measure$lambda$37$misalignedStart([ILandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;[II)Z

    move-result v4

    if-eqz v4, :cond_36

    :cond_33
    if-eqz p4, :cond_36

    .line 84
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneInfo()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->reset()V

    .line 85
    array-length v1, v12

    new-array v2, v1, [I

    const/4 v3, 0x0

    :goto_2a
    if-ge v3, v1, :cond_34

    const/4 v4, -0x1

    aput v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_2a

    .line 86
    :cond_34
    array-length v1, v9

    new-array v3, v1, [I

    const/4 v4, 0x0

    :goto_2b
    if-ge v4, v1, :cond_35

    .line 87
    aget v5, v9, v13

    aput v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_2b

    :cond_35
    move/from16 v14, v26

    const/4 v4, 0x0

    .line 88
    invoke-static {v0, v14, v2, v3, v4}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->measure(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;I[I[IZ)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;

    move-result-object v0

    return-object v0

    :cond_36
    move/from16 v14, v26

    move/from16 p1, v2

    move/from16 v24, v6

    goto/16 :goto_31

    :cond_37
    move/from16 v14, v26

    move-object/from16 v12, v27

    .line 89
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getItemProvider()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;

    move-result-object v5

    move/from16 v24, v6

    invoke-virtual {v0, v5, v4, v13}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getSpanRange-lOCCd4c(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;II)J

    move-result-wide v5

    .line 90
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneInfo()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    move-result-object v13

    move/from16 v26, v10

    move-object/from16 v27, v11

    const-wide v21, 0xffffffffL

    and-long v10, v5, v21

    long-to-int v10, v10

    move/from16 v28, v1

    move/from16 p1, v2

    const/16 v11, 0x20

    shr-long v1, v5, v11

    long-to-int v1, v1

    sub-int v2, v10, v1

    const/4 v11, 0x1

    if-eq v2, v11, :cond_38

    move/from16 v19, v11

    goto :goto_2c

    :cond_38
    const/16 v19, 0x0

    :goto_2c
    if-eqz v19, :cond_39

    const/4 v11, -0x2

    goto :goto_2d

    :cond_39
    move v11, v1

    :goto_2d
    invoke-virtual {v13, v4, v11}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->setLane(II)V

    .line 91
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getMeasuredItemProvider()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;

    move-result-object v11

    invoke-virtual {v11, v4, v5, v6}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;->getAndMeasure-jy6DScQ(IJ)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;

    move-result-object v11

    .line 92
    invoke-static {v9, v5, v6}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->maxInRange-jy6DScQ([IJ)I

    move-result v5

    const/4 v6, 0x1

    if-eq v2, v6, :cond_3a

    const/4 v2, 0x1

    goto :goto_2e

    :cond_3a
    const/4 v2, 0x0

    :goto_2e
    if-eqz v2, :cond_3b

    .line 93
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneInfo()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    move-result-object v2

    invoke-virtual {v2, v4}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->getGaps(I)[I

    move-result-object v2

    goto :goto_2f

    :cond_3b
    const/4 v2, 0x0

    :goto_2f
    if-ge v1, v10, :cond_3e

    .line 94
    aget v6, v9, v1

    if-eq v6, v5, :cond_3c

    const/16 v28, 0x1

    .line 95
    :cond_3c
    aget-object v6, v7, v1

    invoke-virtual {v6, v11}, Lkotlin/collections/ArrayDeque;->addFirst(Ljava/lang/Object;)V

    .line 96
    aput v4, v12, v1

    if-nez v2, :cond_3d

    const/4 v6, 0x0

    goto :goto_30

    .line 97
    :cond_3d
    aget v6, v2, v1

    .line 98
    :goto_30
    invoke-virtual {v11}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getSizeWithSpacings()I

    move-result v13

    add-int/2addr v13, v5

    add-int/2addr v13, v6

    aput v13, v9, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_2f

    :cond_3e
    move/from16 v2, p1

    move/from16 v6, v24

    move/from16 v10, v26

    move-object/from16 v11, v27

    move/from16 v1, v28

    move-object/from16 v27, v12

    move/from16 v26, v14

    goto/16 :goto_26

    :cond_3f
    move/from16 p1, v2

    move/from16 v24, v6

    move/from16 v14, v26

    move-object/from16 v12, v27

    :goto_31
    move/from16 v26, v10

    move-object/from16 v27, v11

    if-eqz v1, :cond_40

    if-eqz p4, :cond_40

    .line 99
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneInfo()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->reset()V

    const/4 v1, 0x0

    .line 100
    invoke-static {v0, v14, v12, v9, v1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->measure(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;I[I[IZ)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;

    move-result-object v0

    return-object v0

    :cond_40
    const/4 v1, 0x0

    add-int v2, v14, p1

    const/4 v4, 0x0

    const/4 v5, 0x1

    .line 101
    invoke-static {v9, v1, v5, v4}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->indexOfMinValue$default([IIILjava/lang/Object;)I

    move-result v6

    .line 102
    aget v1, v9, v6

    if-gez v1, :cond_41

    add-int/2addr v2, v1

    move-object/from16 v6, v27

    .line 103
    invoke-static {v6, v1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->offsetBy([II)V

    neg-int v1, v1

    .line 104
    invoke-static {v9, v1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->offsetBy([II)V

    goto :goto_32

    :cond_41
    move-object/from16 v6, v27

    :goto_32
    move v1, v2

    goto :goto_33

    :cond_42
    move/from16 v24, v6

    move-object v6, v11

    move/from16 v14, v26

    move-object/from16 v12, v27

    move-object/from16 v9, v28

    const/4 v4, 0x0

    move/from16 v26, v10

    move v1, v14

    .line 105
    :goto_33
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getState()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->getScrollToBeConsumed$foundation_release()F

    move-result v2

    invoke-static {v2}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v2

    invoke-static {v2}, Lkotlin/math/MathKt;->getSign(I)I

    move-result v2

    invoke-static {v1}, Lkotlin/math/MathKt;->getSign(I)I

    move-result v5

    if-ne v2, v5, :cond_43

    .line 106
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getState()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->getScrollToBeConsumed$foundation_release()F

    move-result v2

    invoke-static {v2}, Lkotlin/math/MathKt;->roundToInt(F)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v2

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v5

    if-lt v2, v5, :cond_43

    int-to-float v1, v1

    goto :goto_34

    .line 107
    :cond_43
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getState()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->getScrollToBeConsumed$foundation_release()F

    move-result v1

    :goto_34
    move v11, v1

    .line 108
    array-length v1, v9

    invoke-static {v9, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    move-object/from16 v10, v25

    invoke-static {v1, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    array-length v2, v1

    const/4 v5, 0x0

    :goto_35
    if-ge v5, v2, :cond_44

    .line 110
    aget v10, v1, v5

    neg-int v10, v10

    aput v10, v1, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_35

    .line 111
    :cond_44
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getBeforeContentPadding()I

    move-result v2

    if-lez v2, :cond_48

    move/from16 v13, v24

    const/4 v2, 0x0

    :goto_36
    if-ge v2, v13, :cond_48

    .line 112
    aget-object v5, v7, v2

    .line 113
    invoke-virtual {v5}, Lkotlin/collections/AbstractMutableList;->size()I

    move-result v10

    const/4 v14, 0x0

    :goto_37
    if-ge v14, v10, :cond_46

    .line 114
    invoke-virtual {v5, v14}, Lkotlin/collections/ArrayDeque;->get(I)Ljava/lang/Object;

    move-result-object v20

    check-cast v20, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;

    .line 115
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneInfo()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    move-result-object v4

    move/from16 v29, v8

    invoke-virtual/range {v20 .. v20}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getIndex()I

    move-result v8

    invoke-virtual {v4, v8}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->getGaps(I)[I

    move-result-object v4

    .line 116
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getSizeWithSpacings()I

    move-result v8

    if-nez v4, :cond_45

    const/4 v4, 0x0

    goto :goto_38

    :cond_45
    aget v4, v4, v2

    :goto_38
    add-int/2addr v8, v4

    .line 117
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->getLastIndex(Ljava/util/List;)I

    move-result v4

    if-eq v14, v4, :cond_47

    .line 118
    aget v4, v9, v2

    if-eqz v4, :cond_47

    if-lt v4, v8, :cond_47

    sub-int/2addr v4, v8

    .line 119
    aput v4, v9, v2

    add-int/lit8 v14, v14, 0x1

    .line 120
    invoke-virtual {v5, v14}, Lkotlin/collections/ArrayDeque;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;

    invoke-virtual {v4}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getIndex()I

    move-result v4

    aput v4, v12, v2

    move/from16 v8, v29

    const/4 v4, 0x0

    goto :goto_37

    :cond_46
    move/from16 v29, v8

    :cond_47
    add-int/lit8 v2, v2, 0x1

    move/from16 v8, v29

    const/4 v4, 0x0

    goto :goto_36

    :cond_48
    move/from16 v29, v8

    .line 121
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->isVertical()Z

    move-result v2

    if-eqz v2, :cond_49

    .line 122
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getConstraints-msEJaDk()J

    move-result-wide v4

    invoke-static {v4, v5}, Landroidx/compose/ui/unit/Constraints;->getMaxWidth-impl(J)I

    move-result v2

    goto :goto_39

    .line 123
    :cond_49
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getConstraints-msEJaDk()J

    move-result-wide v4

    invoke-static {v6}, Lkotlin/collections/ArraysKt;->maxOrThrow([I)I

    move-result v2

    invoke-static {v4, v5, v2}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainWidth-K40F9xA(JI)I

    move-result v2

    :goto_39
    move v8, v2

    .line 124
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->isVertical()Z

    move-result v2

    if-eqz v2, :cond_4a

    .line 125
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getConstraints-msEJaDk()J

    move-result-wide v4

    invoke-static {v6}, Lkotlin/collections/ArraysKt;->maxOrThrow([I)I

    move-result v2

    invoke-static {v4, v5, v2}, Landroidx/compose/ui/unit/ConstraintsKt;->constrainHeight-K40F9xA(JI)I

    move-result v2

    goto :goto_3a

    .line 126
    :cond_4a
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getConstraints-msEJaDk()J

    move-result-wide v4

    invoke-static {v4, v5}, Landroidx/compose/ui/unit/Constraints;->getMaxHeight-impl(J)I

    move-result v2

    :goto_3a
    move v14, v2

    .line 127
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->isVertical()Z

    move-result v2

    if-eqz v2, :cond_4b

    move v2, v14

    goto :goto_3b

    :cond_4b
    move v2, v8

    :goto_3b
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getMainAxisAvailableSize()I

    move-result v4

    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    move-result v2

    const/4 v4, 0x0

    .line 128
    aget v5, v1, v4

    .line 129
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getState()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->getPinnedItems$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;

    move-result-object v4

    .line 130
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v10

    move v13, v5

    move/from16 p1, v11

    const/4 v5, 0x0

    const/4 v11, 0x0

    :goto_3c
    if-ge v11, v10, :cond_53

    .line 131
    invoke-interface {v4, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v20

    .line 132
    check-cast v20, Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList$PinnedItem;

    move-object/from16 p4, v4

    .line 133
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getItemProvider()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;

    move-result-object v4

    move/from16 v21, v10

    invoke-interface/range {v20 .. v20}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList$PinnedItem;->getKey()Ljava/lang/Object;

    move-result-object v10

    move/from16 v22, v14

    invoke-interface/range {v20 .. v20}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList$PinnedItem;->getIndex()I

    move-result v14

    invoke-static {v4, v10, v14}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProviderKt;->findIndexByKey(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;Ljava/lang/Object;I)I

    move-result v4

    .line 134
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneInfo()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    move-result-object v10

    invoke-virtual {v10, v4}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->getLane(I)I

    move-result v10

    const/4 v14, -0x2

    if-eq v10, v14, :cond_4e

    const/4 v14, -0x1

    if-eq v10, v14, :cond_4e

    .line 135
    aget v10, v12, v10

    if-le v10, v4, :cond_4d

    :cond_4c
    const/4 v10, 0x1

    goto :goto_40

    :cond_4d
    :goto_3d
    const/4 v10, 0x0

    goto :goto_40

    .line 136
    :cond_4e
    array-length v10, v12

    const/4 v14, 0x0

    :goto_3e
    if-ge v14, v10, :cond_4c

    move/from16 v20, v10

    aget v10, v12, v14

    if-le v10, v4, :cond_4f

    const/4 v10, 0x1

    goto :goto_3f

    :cond_4f
    const/4 v10, 0x0

    :goto_3f
    if-nez v10, :cond_50

    goto :goto_3d

    :cond_50
    add-int/lit8 v14, v14, 0x1

    move/from16 v10, v20

    goto :goto_3e

    :goto_40
    if-eqz v10, :cond_52

    .line 137
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getItemProvider()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;

    move-result-object v10

    move/from16 v20, v8

    move-object/from16 v28, v9

    const/4 v14, 0x0

    invoke-virtual {v0, v10, v4, v14}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getSpanRange-lOCCd4c(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;II)J

    move-result-wide v8

    if-nez v5, :cond_51

    .line 138
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 139
    :cond_51
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getMeasuredItemProvider()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;

    move-result-object v10

    invoke-virtual {v10, v4, v8, v9}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;->getAndMeasure-jy6DScQ(IJ)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;

    move-result-object v4

    .line 140
    invoke-virtual {v4}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getSizeWithSpacings()I

    move-result v8

    sub-int/2addr v13, v8

    .line 141
    invoke-virtual {v4, v14, v13, v14, v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->position(IIII)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridPositionedItem;

    move-result-object v4

    .line 142
    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_41

    :cond_52
    move/from16 v20, v8

    move-object/from16 v28, v9

    :goto_41
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v4, p4

    move/from16 v8, v20

    move/from16 v10, v21

    move/from16 v14, v22

    move-object/from16 v9, v28

    goto/16 :goto_3c

    :cond_53
    move/from16 v20, v8

    move-object/from16 v28, v9

    move/from16 v22, v14

    if-nez v5, :cond_54

    .line 143
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v5

    .line 144
    :cond_54
    invoke-static {v0, v7, v1, v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->calculatePositionedItems(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;[Lkotlin/collections/ArrayDeque;[II)Ljava/util/List;

    move-result-object v14

    const/4 v4, 0x0

    .line 145
    aget v1, v1, v4

    .line 146
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getState()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->getPinnedItems$foundation_release()Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList;

    move-result-object v4

    .line 147
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_42
    if-ge v9, v7, :cond_5e

    .line 148
    invoke-interface {v4, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    .line 149
    check-cast v10, Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList$PinnedItem;

    .line 150
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getItemProvider()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;

    move-result-object v11

    invoke-interface {v10}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList$PinnedItem;->getKey()Ljava/lang/Object;

    move-result-object v13

    invoke-interface {v10}, Landroidx/compose/foundation/lazy/layout/LazyLayoutPinnedItemList$PinnedItem;->getIndex()I

    move-result v10

    invoke-static {v11, v13, v10}, Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProviderKt;->findIndexByKey(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;Ljava/lang/Object;I)I

    move-result v10

    if-lt v10, v15, :cond_56

    :cond_55
    move-object/from16 p4, v4

    :goto_43
    const/4 v4, 0x0

    goto :goto_46

    .line 151
    :cond_56
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneInfo()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    move-result-object v11

    invoke-virtual {v11, v10}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->getLane(I)I

    move-result v11

    const/4 v13, -0x2

    if-eq v11, v13, :cond_58

    const/4 v13, -0x1

    if-eq v11, v13, :cond_59

    .line 152
    aget v11, v3, v11

    if-ge v11, v10, :cond_55

    :cond_57
    move-object/from16 p4, v4

    const/4 v4, 0x1

    goto :goto_46

    :cond_58
    const/4 v13, -0x1

    .line 153
    :cond_59
    array-length v11, v3

    const/4 v13, 0x0

    :goto_44
    if-ge v13, v11, :cond_57

    move-object/from16 p4, v4

    aget v4, v3, v13

    if-ge v4, v10, :cond_5a

    const/4 v4, 0x1

    goto :goto_45

    :cond_5a
    const/4 v4, 0x0

    :goto_45
    if-nez v4, :cond_5b

    goto :goto_43

    :cond_5b
    add-int/lit8 v13, v13, 0x1

    move-object/from16 v4, p4

    goto :goto_44

    :goto_46
    if-eqz v4, :cond_5d

    .line 154
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getItemProvider()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;

    move-result-object v4

    move-object v13, v5

    const/4 v11, 0x0

    invoke-virtual {v0, v4, v10, v11}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getSpanRange-lOCCd4c(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;II)J

    move-result-wide v4

    if-nez v8, :cond_5c

    .line 155
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    :cond_5c
    move/from16 v21, v7

    .line 156
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getMeasuredItemProvider()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;

    move-result-object v7

    invoke-virtual {v7, v10, v4, v5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;->getAndMeasure-jy6DScQ(IJ)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;

    move-result-object v4

    .line 157
    invoke-virtual {v4, v11, v1, v11, v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->position(IIII)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridPositionedItem;

    move-result-object v5

    .line 158
    invoke-virtual {v4}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getSizeWithSpacings()I

    move-result v4

    add-int/2addr v1, v4

    .line 159
    invoke-interface {v8, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_47

    :cond_5d
    move-object v13, v5

    move/from16 v21, v7

    :goto_47
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v4, p4

    move-object v5, v13

    move/from16 v7, v21

    goto :goto_42

    :cond_5e
    move-object v13, v5

    if-nez v8, :cond_5f

    .line 160
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v8

    :cond_5f
    const/4 v1, 0x0

    .line 161
    aget v2, v12, v1

    if-nez v2, :cond_61

    aget v2, v28, v1

    if-lez v2, :cond_60

    goto :goto_48

    :cond_60
    const/16 v24, 0x0

    goto :goto_49

    :cond_61
    :goto_48
    const/16 v24, 0x1

    :goto_49
    move/from16 v4, v26

    const/4 v1, 0x0

    :goto_4a
    if-ge v1, v4, :cond_64

    .line 162
    aget v2, v6, v1

    .line 163
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getMainAxisAvailableSize()I

    move-result v5

    if-le v2, v5, :cond_62

    const/4 v2, 0x1

    goto :goto_4b

    :cond_62
    const/4 v2, 0x0

    :goto_4b
    if-eqz v2, :cond_63

    const/4 v1, 0x1

    goto :goto_4c

    :cond_63
    add-int/lit8 v1, v1, 0x1

    goto :goto_4a

    :cond_64
    const/4 v1, 0x0

    :goto_4c
    if-nez v1, :cond_69

    .line 164
    array-length v1, v3

    const/4 v2, 0x0

    :goto_4d
    if-ge v2, v1, :cond_67

    aget v4, v3, v2

    add-int/lit8 v5, v15, -0x1

    if-ge v4, v5, :cond_65

    const/4 v4, 0x1

    goto :goto_4e

    :cond_65
    const/4 v4, 0x0

    :goto_4e
    if-nez v4, :cond_66

    const/4 v1, 0x0

    goto :goto_4f

    :cond_66
    add-int/lit8 v2, v2, 0x1

    goto :goto_4d

    :cond_67
    const/4 v1, 0x1

    :goto_4f
    if-eqz v1, :cond_68

    goto :goto_50

    :cond_68
    const/4 v11, 0x0

    goto :goto_51

    :cond_69
    :goto_50
    const/4 v11, 0x1

    :goto_51
    const/4 v4, 0x0

    .line 165
    new-instance v5, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt$measure$1$29;

    move-object v1, v13

    invoke-direct {v5, v1, v14, v8, v0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt$measure$1$29;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object/from16 v1, v23

    move/from16 v2, v20

    move/from16 v3, v22

    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/MeasureScope$-CC;->p(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    move-result-object v10

    .line 166
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->isVertical()Z

    move-result v13

    move/from16 v25, v29

    move/from16 v1, v22

    .line 167
    invoke-static {v2, v1}, Landroidx/compose/ui/unit/IntSizeKt;->IntSize(II)J

    move-result-wide v16

    .line 168
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getBeforeContentPadding()I

    move-result v20

    .line 169
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getAfterContentPadding()I

    move-result v21

    .line 170
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getMainAxisSpacing()I

    move-result v22

    .line 171
    new-instance v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;

    move-object v6, v0

    const/16 v23, 0x0

    move-object v7, v12

    move-object/from16 v8, v28

    move/from16 v9, p1

    move/from16 v12, v24

    move/from16 v24, p3

    move-object v1, v14

    move v14, v15

    move-object v15, v1

    move/from16 v18, v24

    move/from16 v19, v25

    invoke-direct/range {v6 .. v23}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;-><init>([I[IFLandroidx/compose/ui/layout/MeasureResult;ZZZILjava/util/List;JIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_6a
    move/from16 v24, p3

    move v4, v10

    move-object/from16 v10, v25

    move/from16 v14, v26

    move-object/from16 v12, v27

    const/4 v9, -0x2

    move/from16 v25, v8

    move v8, v6

    move-object v6, v11

    .line 172
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getItemProvider()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;

    move-result-object v2

    move-object v11, v10

    invoke-virtual {v0, v2, v1, v5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getSpanRange-lOCCd4c(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;II)J

    move-result-wide v9

    .line 173
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneInfo()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    move-result-object v2

    move/from16 v26, v4

    const-wide v21, 0xffffffffL

    and-long v4, v9, v21

    long-to-int v4, v4

    move-object/from16 p1, v11

    const/16 v5, 0x20

    shr-long v11, v9, v5

    long-to-int v11, v11

    sub-int v12, v4, v11

    const/4 v13, 0x1

    if-eq v12, v13, :cond_6b

    move/from16 v19, v13

    goto :goto_52

    :cond_6b
    const/16 v19, 0x0

    :goto_52
    if-eqz v19, :cond_6c

    const/4 v5, -0x2

    goto :goto_53

    :cond_6c
    move v5, v11

    :goto_53
    invoke-virtual {v2, v1, v5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->setLane(II)V

    .line 174
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getMeasuredItemProvider()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;

    move-result-object v2

    invoke-virtual {v2, v1, v9, v10}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureProvider;->getAndMeasure-jy6DScQ(IJ)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;

    move-result-object v2

    .line 175
    invoke-static {v6, v9, v10}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->maxInRange-jy6DScQ([IJ)I

    move-result v5

    if-eq v12, v13, :cond_6d

    move v9, v13

    goto :goto_54

    :cond_6d
    const/4 v9, 0x0

    :goto_54
    if-eqz v9, :cond_6e

    .line 176
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneInfo()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    move-result-object v9

    invoke-virtual {v9, v1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->getGaps(I)[I

    move-result-object v9

    if-nez v9, :cond_6f

    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneCount()I

    move-result v9

    new-array v9, v9, [I

    goto :goto_55

    :cond_6e
    const/4 v9, 0x0

    :cond_6f
    :goto_55
    move v10, v11

    :goto_56
    if-ge v10, v4, :cond_71

    if-eqz v9, :cond_70

    .line 177
    aget v12, v6, v10

    sub-int v12, v5, v12

    aput v12, v9, v10

    .line 178
    :cond_70
    aput v1, v3, v10

    .line 179
    invoke-virtual {v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->getSizeWithSpacings()I

    move-result v12

    add-int/2addr v12, v5

    aput v12, v6, v10

    .line 180
    aget-object v12, v7, v10

    invoke-virtual {v12, v2}, Lkotlin/collections/ArrayDeque;->addLast(Ljava/lang/Object;)V

    add-int/lit8 v10, v10, 0x1

    goto :goto_56

    .line 181
    :cond_71
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneInfo()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    move-result-object v4

    invoke-virtual {v4, v1, v9}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->setGaps(I[I)V

    .line 182
    aget v1, v6, v11

    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getMainAxisSpacing()I

    move-result v4

    add-int v4, v24, v4

    if-gt v1, v4, :cond_72

    const/4 v1, 0x0

    .line 183
    invoke-virtual {v2, v1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;->setVisible(Z)V

    :cond_72
    move-object v11, v6

    move v6, v8

    move/from16 p3, v24

    move/from16 v29, v25

    move/from16 v10, v26

    move-object/from16 v25, p1

    move/from16 v26, v14

    goto/16 :goto_12

    :cond_73
    :goto_57
    move-object/from16 v23, v4

    .line 184
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getConstraints-msEJaDk()J

    move-result-wide v3

    invoke-static {v3, v4}, Landroidx/compose/ui/unit/Constraints;->getMinWidth-impl(J)I

    move-result v5

    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getConstraints-msEJaDk()J

    move-result-wide v3

    invoke-static {v3, v4}, Landroidx/compose/ui/unit/Constraints;->getMinHeight-impl(J)I

    move-result v6

    const/4 v7, 0x0

    sget-object v8, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt$measure$1$1;->INSTANCE:Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt$measure$1$1;

    const/4 v9, 0x4

    const/4 v10, 0x0

    move-object/from16 v4, v23

    invoke-static/range {v4 .. v10}, Landroidx/compose/ui/layout/MeasureScope$-CC;->p(Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;

    move-result-object v5

    .line 185
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->isVertical()Z

    move-result v8

    .line 186
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v10

    .line 187
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getConstraints-msEJaDk()J

    move-result-wide v3

    invoke-static {v3, v4}, Landroidx/compose/ui/unit/Constraints;->getMinWidth-impl(J)I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getConstraints-msEJaDk()J

    move-result-wide v3

    invoke-static {v3, v4}, Landroidx/compose/ui/unit/Constraints;->getMinHeight-impl(J)I

    move-result v3

    invoke-static {v1, v3}, Landroidx/compose/ui/unit/IntSizeKt;->IntSize(II)J

    move-result-wide v11

    .line 188
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getBeforeContentPadding()I

    move-result v1

    neg-int v13, v1

    .line 189
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getMainAxisAvailableSize()I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getAfterContentPadding()I

    move-result v3

    add-int v14, v1, v3

    .line 190
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getBeforeContentPadding()I

    move-result v1

    move v9, v15

    move v15, v1

    .line 191
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getAfterContentPadding()I

    move-result v16

    .line 192
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getMainAxisSpacing()I

    move-result v17

    .line 193
    new-instance v0, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;

    move-object v1, v0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v18, 0x0

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    invoke-direct/range {v1 .. v18}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;-><init>([I[IFLandroidx/compose/ui/layout/MeasureResult;ZZZILjava/util/List;JIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private static final measure$lambda$37$hasSpaceBeforeFirst([I[ILandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;)Z
    .locals 6

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    if-ge v2, v0, :cond_1

    .line 5
    .line 6
    aget v3, p0, v2

    .line 7
    .line 8
    aget v4, p1, v2

    .line 9
    .line 10
    invoke-virtual {p2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getMainAxisSpacing()I

    .line 11
    .line 12
    .line 13
    move-result v5

    .line 14
    neg-int v5, v5

    .line 15
    invoke-static {v5, v1}, Ljava/lang/Math;->max(II)I

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    if-ge v4, v5, :cond_0

    .line 20
    .line 21
    if-lez v3, :cond_0

    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    return v1
.end method

.method private static final measure$lambda$37$misalignedStart([ILandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;[II)Z
    .locals 7

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    const/4 v3, -0x1

    .line 5
    const/4 v4, 0x1

    .line 6
    if-ge v2, v0, :cond_2

    .line 7
    .line 8
    aget v5, p0, v2

    .line 9
    .line 10
    invoke-static {p1, v5, v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->findPreviousItemIndex(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;II)I

    .line 11
    .line 12
    .line 13
    move-result v5

    .line 14
    if-ne v5, v3, :cond_0

    .line 15
    .line 16
    aget v3, p2, v2

    .line 17
    .line 18
    aget v5, p2, p3

    .line 19
    .line 20
    if-eq v3, v5, :cond_0

    .line 21
    .line 22
    move v3, v4

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    move v3, v1

    .line 25
    :goto_1
    if-eqz v3, :cond_1

    .line 26
    .line 27
    return v4

    .line 28
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    array-length v0, p0

    .line 32
    move v2, v1

    .line 33
    :goto_2
    if-ge v2, v0, :cond_5

    .line 34
    .line 35
    aget v5, p0, v2

    .line 36
    .line 37
    invoke-static {p1, v5, v2}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->findPreviousItemIndex(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;II)I

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-eq v5, v3, :cond_3

    .line 42
    .line 43
    aget v5, p2, v2

    .line 44
    .line 45
    aget v6, p2, p3

    .line 46
    .line 47
    if-lt v5, v6, :cond_3

    .line 48
    .line 49
    move v5, v4

    .line 50
    goto :goto_3

    .line 51
    :cond_3
    move v5, v1

    .line 52
    :goto_3
    if-eqz v5, :cond_4

    .line 53
    .line 54
    return v4

    .line 55
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_5
    invoke-virtual {p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneInfo()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {p0, v1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->getLane(I)I

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-eqz p0, :cond_6

    .line 67
    .line 68
    if-eq p0, v3, :cond_6

    .line 69
    .line 70
    const/4 p1, -0x2

    .line 71
    if-eq p0, p1, :cond_6

    .line 72
    .line 73
    move v1, v4

    .line 74
    :cond_6
    return v1
.end method

.method public static final measureStaggeredGrid-BTfHGGE(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;[IJZZJIIIII)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;
    .locals 19
    .annotation build Landroidx/compose/foundation/ExperimentalFoundationApi;
    .end annotation

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    move-object/from16 v8, p0

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    move-object/from16 v3, p2

    .line 8
    .line 9
    move-object/from16 v4, p3

    .line 10
    .line 11
    move-wide/from16 v5, p4

    .line 12
    .line 13
    move/from16 v7, p6

    .line 14
    .line 15
    move/from16 v14, p7

    .line 16
    .line 17
    move-wide/from16 v10, p8

    .line 18
    .line 19
    move/from16 v9, p10

    .line 20
    .line 21
    move/from16 v15, p11

    .line 22
    .line 23
    move/from16 v16, p12

    .line 24
    .line 25
    move/from16 v12, p13

    .line 26
    .line 27
    move/from16 v13, p14

    .line 28
    .line 29
    const-string v1, "$this$measureStaggeredGrid"

    .line 30
    .line 31
    move-object/from16 v18, v2

    .line 32
    .line 33
    move-object/from16 v2, p0

    .line 34
    .line 35
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const-string/jumbo v1, "state"

    .line 39
    .line 40
    .line 41
    move-object/from16 v2, p1

    .line 42
    .line 43
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const-string v1, "itemProvider"

    .line 47
    .line 48
    move-object/from16 v2, p2

    .line 49
    .line 50
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const-string v1, "resolvedSlotSums"

    .line 54
    .line 55
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    new-instance v2, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;

    .line 59
    .line 60
    move-object v1, v2

    .line 61
    const/16 v17, 0x0

    .line 62
    .line 63
    move-object/from16 p0, v2

    .line 64
    .line 65
    move-object/from16 v2, v18

    .line 66
    .line 67
    invoke-direct/range {v1 .. v17}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;-><init>(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;[IJZLandroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;IJIIZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 68
    .line 69
    .line 70
    new-instance v1, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 71
    .line 72
    invoke-direct {v1}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 73
    .line 74
    .line 75
    new-instance v2, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 76
    .line 77
    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 78
    .line 79
    .line 80
    sget-object v3, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    .line 81
    .line 82
    invoke-virtual {v3}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->createNonObservableSnapshot()Landroidx/compose/runtime/snapshots/Snapshot;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    :try_start_0
    invoke-virtual {v3}, Landroidx/compose/runtime/snapshots/Snapshot;->makeCurrent()Landroidx/compose/runtime/snapshots/Snapshot;

    .line 87
    .line 88
    .line 89
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 90
    :try_start_1
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->getScrollPosition$foundation_release()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    invoke-virtual {v5}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;->getIndices()[I

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->getScrollPosition$foundation_release()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    invoke-virtual {v6}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScrollPosition;->getOffsets()[I

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    array-length v7, v5

    .line 107
    array-length v8, v0

    .line 108
    const/4 v9, 0x1

    .line 109
    const/4 v10, 0x0

    .line 110
    if-ne v7, v8, :cond_0

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneInfo()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    .line 114
    .line 115
    .line 116
    move-result-object v7

    .line 117
    invoke-virtual {v7}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->reset()V

    .line 118
    .line 119
    .line 120
    array-length v7, v0

    .line 121
    new-array v8, v7, [I

    .line 122
    .line 123
    move v11, v10

    .line 124
    :goto_0
    if-ge v11, v7, :cond_3

    .line 125
    .line 126
    array-length v12, v5

    .line 127
    if-ge v11, v12, :cond_1

    .line 128
    .line 129
    aget v12, v5, v11

    .line 130
    .line 131
    const/4 v13, -0x1

    .line 132
    if-eq v12, v13, :cond_1

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_1
    if-nez v11, :cond_2

    .line 136
    .line 137
    move v12, v10

    .line 138
    goto :goto_1

    .line 139
    :cond_2
    invoke-static {v10, v11}, Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;->constructor-impl(II)J

    .line 140
    .line 141
    .line 142
    move-result-wide v12

    .line 143
    invoke-static {v8, v12, v13}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->maxInRange-jy6DScQ([IJ)I

    .line 144
    .line 145
    .line 146
    move-result v12

    .line 147
    add-int/2addr v12, v9

    .line 148
    :goto_1
    aput v12, v8, v11

    .line 149
    .line 150
    invoke-virtual/range {p0 .. p0}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;->getLaneInfo()Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;

    .line 151
    .line 152
    .line 153
    move-result-object v12

    .line 154
    aget v13, v8, v11

    .line 155
    .line 156
    invoke-virtual {v12, v13, v11}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridLaneInfo;->setLane(II)V

    .line 157
    .line 158
    .line 159
    add-int/lit8 v11, v11, 0x1

    .line 160
    .line 161
    goto :goto_0

    .line 162
    :cond_3
    move-object v5, v8

    .line 163
    :goto_2
    iput-object v5, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 164
    .line 165
    array-length v5, v6

    .line 166
    array-length v7, v0

    .line 167
    if-ne v5, v7, :cond_4

    .line 168
    .line 169
    goto :goto_5

    .line 170
    :cond_4
    array-length v0, v0

    .line 171
    new-array v5, v0, [I

    .line 172
    .line 173
    move v7, v10

    .line 174
    :goto_3
    if-ge v7, v0, :cond_7

    .line 175
    .line 176
    array-length v8, v6

    .line 177
    if-ge v7, v8, :cond_5

    .line 178
    .line 179
    aget v8, v6, v7

    .line 180
    .line 181
    goto :goto_4

    .line 182
    :cond_5
    if-nez v7, :cond_6

    .line 183
    .line 184
    move v8, v10

    .line 185
    goto :goto_4

    .line 186
    :cond_6
    add-int/lit8 v8, v7, -0x1

    .line 187
    .line 188
    aget v8, v5, v8

    .line 189
    .line 190
    :goto_4
    aput v8, v5, v7

    .line 191
    .line 192
    add-int/lit8 v7, v7, 0x1

    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_7
    move-object v6, v5

    .line 196
    :goto_5
    iput-object v6, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 197
    .line 198
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 199
    .line 200
    :try_start_2
    invoke-virtual {v3, v4}, Landroidx/compose/runtime/snapshots/Snapshot;->restoreCurrent(Landroidx/compose/runtime/snapshots/Snapshot;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 201
    .line 202
    .line 203
    invoke-virtual {v3}, Landroidx/compose/runtime/snapshots/Snapshot;->dispose()V

    .line 204
    .line 205
    .line 206
    invoke-virtual/range {p1 .. p1}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;->getScrollToBeConsumed$foundation_release()F

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    invoke-static {v0}, Lkotlin/math/MathKt;->roundToInt(F)I

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    iget-object v1, v1, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v1, [I

    .line 217
    .line 218
    iget-object v2, v2, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast v2, [I

    .line 221
    .line 222
    move-object/from16 v3, p0

    .line 223
    .line 224
    invoke-static {v3, v0, v1, v2, v9}, Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureKt;->measure(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;I[I[IZ)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    return-object v0

    .line 229
    :catchall_0
    move-exception v0

    .line 230
    :try_start_3
    invoke-virtual {v3, v4}, Landroidx/compose/runtime/snapshots/Snapshot;->restoreCurrent(Landroidx/compose/runtime/snapshots/Snapshot;)V

    .line 231
    .line 232
    .line 233
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 234
    :catchall_1
    move-exception v0

    .line 235
    invoke-virtual {v3}, Landroidx/compose/runtime/snapshots/Snapshot;->dispose()V

    .line 236
    .line 237
    .line 238
    throw v0
.end method

.method private static final offsetBy([II)V
    .locals 3

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    if-ge v1, v0, :cond_0

    .line 4
    .line 5
    aget v2, p0, v1

    .line 6
    .line 7
    add-int/2addr v2, p1

    .line 8
    aput v2, p0, v1

    .line 9
    .line 10
    add-int/lit8 v1, v1, 0x1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    return-void
.end method

.method private static final transform([ILkotlin/jvm/functions/Function1;)[I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([I",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;)[I"
        }
    .end annotation

    .line 1
    array-length v0, p0

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    if-ge v1, v0, :cond_0

    .line 4
    .line 5
    aget v2, p0, v1

    .line 6
    .line 7
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Ljava/lang/Number;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    aput v2, p0, v1

    .line 22
    .line 23
    add-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-object p0
.end method

.method private static final withDebugLogging(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;
    .locals 0
    .annotation build Landroidx/compose/foundation/ExperimentalFoundationApi;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;",
            "+TT;>;)TT;"
        }
    .end annotation

    .line 1
    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
