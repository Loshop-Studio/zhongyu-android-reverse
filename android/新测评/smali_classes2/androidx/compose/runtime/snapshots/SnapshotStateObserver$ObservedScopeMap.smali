.class final Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/runtime/snapshots/SnapshotStateObserver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ObservedScopeMap"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010 \u001a\u00020\u0004J\u0010\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0001H\u0002J\u000e\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0001J\u0006\u0010$\u001a\u00020%J\u0006\u0010&\u001a\u00020\u0004J0\u0010\'\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00012\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00032\u000c\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u00040*J\u0014\u0010+\u001a\u00020%2\u000c\u0010,\u001a\u0008\u0012\u0004\u0012\u00020\u00010-J\u000e\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u0001J.\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00012\u000c\u00100\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0008H\u0002J\u0018\u00101\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00012\u0006\u0010/\u001a\u00020\u0001H\u0002J)\u00102\u001a\u00020\u00042!\u00103\u001a\u001d\u0012\u0013\u0012\u00110\u0001\u00a2\u0006\u000c\u00084\u0012\u0008\u00085\u0012\u0004\u0008\u0008(\"\u0012\u0004\u0012\u00020%0\u0003J\u0012\u00106\u001a\u00020\u00042\n\u00107\u001a\u0006\u0012\u0002\u0008\u00030\rR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\r0\u000cX\u0082\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R6\u0010\u0018\u001a*\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\r\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0019j\u0014\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\r\u0012\u0006\u0012\u0004\u0018\u00010\u0001`\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00010\u00080\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u001d\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\r0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u000cX\u0082\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\n\u0002\u0010\u000e\u0082\u0002\u000b\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u00068"
    }
    d2 = {
        "Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;",
        "",
        "onChanged",
        "Lkotlin/Function1;",
        "",
        "(Lkotlin/jvm/functions/Function1;)V",
        "currentScope",
        "currentScopeReads",
        "Landroidx/collection/MutableObjectIntMap;",
        "currentToken",
        "",
        "dependencyToDerivedStates",
        "Landroidx/compose/runtime/collection/ScopeMap;",
        "Landroidx/compose/runtime/DerivedState;",
        "Landroidx/collection/MutableScatterMap;",
        "deriveStateScopeCount",
        "derivedStateObserver",
        "Landroidx/compose/runtime/DerivedStateObserver;",
        "getDerivedStateObserver",
        "()Landroidx/compose/runtime/DerivedStateObserver;",
        "invalidated",
        "Landroidx/collection/MutableScatterSet;",
        "getOnChanged",
        "()Lkotlin/jvm/functions/Function1;",
        "recordedDerivedStateValues",
        "Ljava/util/HashMap;",
        "Lkotlin/collections/HashMap;",
        "scopeToValues",
        "Landroidx/collection/MutableScatterMap;",
        "statesToReread",
        "Landroidx/compose/runtime/collection/MutableVector;",
        "valueToScopes",
        "clear",
        "clearObsoleteStateReads",
        "scope",
        "clearScopeObservations",
        "hasScopeObservations",
        "",
        "notifyInvalidatedScopes",
        "observe",
        "readObserver",
        "block",
        "Lkotlin/Function0;",
        "recordInvalidation",
        "changes",
        "",
        "recordRead",
        "value",
        "recordedValues",
        "removeObservation",
        "removeScopeIf",
        "predicate",
        "Lkotlin/ParameterName;",
        "name",
        "rereadDerivedState",
        "derivedState",
        "runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSnapshotStateObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 StateObjectImpl.kt\nandroidx/compose/runtime/snapshots/ReaderKind$Companion\n+ 6 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 8 ObjectIntMap.kt\nandroidx/collection/MutableObjectIntMap\n+ 9 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 10 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 11 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapperKt\n+ 12 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 13 ScopeMap.kt\nandroidx/compose/runtime/collection/ScopeMap\n+ 14 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 15 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,597:1\n1101#2:598\n1083#2,2:599\n403#3,3:601\n367#3,6:604\n377#3,3:611\n380#3,2:615\n383#3,6:618\n406#3:624\n367#3,6:636\n377#3,3:643\n380#3,2:647\n383#3,6:653\n395#3,4:660\n367#3,6:664\n377#3,3:671\n380#3,9:675\n399#3:684\n395#3,4:700\n367#3,6:704\n377#3,3:711\n380#3,9:715\n399#3:724\n1399#4:610\n1270#4:614\n1399#4:642\n1270#4:646\n1399#4:670\n1270#4:674\n1399#4:692\n1270#4:696\n1399#4:710\n1270#4:714\n1399#4:748\n1270#4:752\n1399#4:772\n1270#4:776\n1399#4:795\n1270#4:799\n1399#4:838\n1270#4:842\n1399#4:874\n1270#4:878\n1399#4:912\n1270#4:916\n1399#4:935\n1270#4:939\n1399#4:978\n1270#4:982\n1399#4:1014\n1270#4:1018\n1399#4:1061\n1270#4:1065\n1399#4:1090\n1270#4:1094\n57#5:617\n57#5:625\n57#5:755\n393#6,6:626\n399#6,2:633\n44#7:632\n519#7:1035\n423#7,9:1036\n775#8:635\n777#8,4:649\n781#8:659\n842#9:685\n844#9:699\n845#9,3:725\n848#9:734\n329#10,6:686\n339#10,3:693\n342#10,2:697\n345#10,6:728\n41#11,3:735\n46#11:900\n48#11:1034\n231#12,3:738\n200#12,7:741\n211#12,3:749\n214#12,2:753\n231#12,3:762\n200#12,7:765\n211#12,3:773\n214#12,2:777\n231#12,3:785\n200#12,7:788\n211#12,3:796\n214#12,9:800\n234#12:809\n217#12,6:814\n234#12:820\n231#12,3:828\n200#12,7:831\n211#12,3:839\n214#12,9:843\n234#12:852\n231#12,3:864\n200#12,7:867\n211#12,3:875\n214#12,9:879\n234#12:888\n217#12,6:893\n234#12:899\n231#12,3:902\n200#12,7:905\n211#12,3:913\n214#12,2:917\n231#12,3:925\n200#12,7:928\n211#12,3:936\n214#12,9:940\n234#12:949\n217#12,6:954\n234#12:960\n231#12,3:968\n200#12,7:971\n211#12,3:979\n214#12,9:983\n234#12:992\n231#12,3:1004\n200#12,7:1007\n211#12,3:1015\n214#12,9:1019\n234#12:1028\n231#12,3:1051\n200#12,7:1054\n211#12,3:1062\n214#12,2:1066\n217#12,6:1069\n234#12:1075\n231#12,3:1080\n200#12,7:1083\n211#12,3:1091\n214#12,9:1095\n234#12:1104\n67#13,6:756\n67#13,6:779\n75#13,4:810\n75#13:821\n67#13,6:822\n75#13,4:853\n78#13:857\n67#13,6:858\n75#13,4:889\n67#13,6:919\n75#13,4:950\n75#13:961\n67#13,6:962\n75#13,4:993\n78#13:997\n67#13,6:998\n75#13,4:1029\n67#13,6:1045\n75#13,4:1076\n1855#14:901\n1856#14:1033\n1#15:1068\n*S KotlinDebug\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap\n*L\n365#1:598\n365#1:599,2\n431#1:601,3\n431#1:604,6\n431#1:611,3\n431#1:615,2\n431#1:618,6\n431#1:624\n472#1:636,6\n472#1:643,3\n472#1:647,2\n472#1:653,6\n484#1:660,4\n484#1:664,6\n484#1:671,3\n484#1:675,9\n484#1:684\n492#1:700,4\n492#1:704,6\n492#1:711,3\n492#1:715,9\n492#1:724\n431#1:610\n431#1:614\n472#1:642\n472#1:646\n484#1:670\n484#1:674\n489#1:692\n489#1:696\n492#1:710\n492#1:714\n529#1:748\n529#1:752\n536#1:772\n536#1:776\n548#1:795\n548#1:799\n548#1:838\n548#1:842\n559#1:874\n559#1:878\n536#1:912\n536#1:916\n548#1:935\n548#1:939\n548#1:978\n548#1:982\n559#1:1014\n559#1:1018\n577#1:1061\n577#1:1065\n592#1:1090\n592#1:1094\n433#1:617\n441#1:625\n530#1:755\n459#1:626,6\n459#1:633,2\n459#1:632\n565#1:1035\n566#1:1036,9\n472#1:635\n472#1:649,4\n472#1:659\n489#1:685\n489#1:699\n489#1:725,3\n489#1:734\n489#1:686,6\n489#1:693,3\n489#1:697,2\n489#1:728,6\n529#1:735,3\n529#1:900\n529#1:1034\n529#1:738,3\n529#1:741,7\n529#1:749,3\n529#1:753,2\n536#1:762,3\n536#1:765,7\n536#1:773,3\n536#1:777,2\n548#1:785,3\n548#1:788,7\n548#1:796,3\n548#1:800,9\n548#1:809\n536#1:814,6\n536#1:820\n548#1:828,3\n548#1:831,7\n548#1:839,3\n548#1:843,9\n548#1:852\n559#1:864,3\n559#1:867,7\n559#1:875,3\n559#1:879,9\n559#1:888\n529#1:893,6\n529#1:899\n536#1:902,3\n536#1:905,7\n536#1:913,3\n536#1:917,2\n548#1:925,3\n548#1:928,7\n548#1:936,3\n548#1:940,9\n548#1:949\n536#1:954,6\n536#1:960\n548#1:968,3\n548#1:971,7\n548#1:979,3\n548#1:983,9\n548#1:992\n559#1:1004,3\n559#1:1007,7\n559#1:1015,3\n559#1:1019,9\n559#1:1028\n577#1:1051,3\n577#1:1054,7\n577#1:1062,3\n577#1:1066,2\n577#1:1069,6\n577#1:1075\n592#1:1080,3\n592#1:1083,7\n592#1:1091,3\n592#1:1095,9\n592#1:1104\n536#1:756,6\n548#1:779,6\n548#1:810,4\n536#1:821\n548#1:822,6\n548#1:853,4\n536#1:857\n559#1:858,6\n559#1:889,4\n548#1:919,6\n548#1:950,4\n536#1:961\n548#1:962,6\n548#1:993,4\n536#1:997\n559#1:998,6\n559#1:1029,4\n577#1:1045,6\n577#1:1076,4\n529#1:901\n529#1:1033\n*E\n"
    }
.end annotation


# instance fields
.field private currentScope:Ljava/lang/Object;

.field private currentScopeReads:Landroidx/collection/MutableObjectIntMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableObjectIntMap<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private currentToken:I

.field private final dependencyToDerivedStates:Landroidx/collection/MutableScatterMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableScatterMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private deriveStateScopeCount:I

.field private final derivedStateObserver:Landroidx/compose/runtime/DerivedStateObserver;

.field private final invalidated:Landroidx/collection/MutableScatterSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableScatterSet<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final onChanged:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Object;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final recordedDerivedStateValues:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Landroidx/compose/runtime/DerivedState<",
            "*>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final scopeToValues:Landroidx/collection/MutableScatterMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableScatterMap<",
            "Ljava/lang/Object;",
            "Landroidx/collection/MutableObjectIntMap<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field private final statesToReread:Landroidx/compose/runtime/collection/MutableVector;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/collection/MutableVector<",
            "Landroidx/compose/runtime/DerivedState<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final valueToScopes:Landroidx/collection/MutableScatterMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/MutableScatterMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Object;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->onChanged:Lkotlin/jvm/functions/Function1;

    .line 5
    .line 6
    const/4 p1, -0x1

    .line 7
    iput p1, p0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->currentToken:I

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-static {p1, v0, p1}, Landroidx/compose/runtime/collection/ScopeMap;->constructor-impl$default(Landroidx/collection/MutableScatterMap;ILkotlin/jvm/internal/DefaultConstructorMarker;)Landroidx/collection/MutableScatterMap;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iput-object v1, p0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->valueToScopes:Landroidx/collection/MutableScatterMap;

    .line 16
    .line 17
    new-instance v1, Landroidx/collection/MutableScatterMap;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-direct {v1, v2, v0, p1}, Landroidx/collection/MutableScatterMap;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->scopeToValues:Landroidx/collection/MutableScatterMap;

    .line 24
    .line 25
    new-instance v1, Landroidx/collection/MutableScatterSet;

    .line 26
    .line 27
    invoke-direct {v1, v2, v0, p1}, Landroidx/collection/MutableScatterSet;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->invalidated:Landroidx/collection/MutableScatterSet;

    .line 31
    .line 32
    new-instance v1, Landroidx/compose/runtime/collection/MutableVector;

    .line 33
    .line 34
    const/16 v3, 0x10

    .line 35
    .line 36
    new-array v3, v3, [Landroidx/compose/runtime/DerivedState;

    .line 37
    .line 38
    invoke-direct {v1, v3, v2}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 39
    .line 40
    .line 41
    iput-object v1, p0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->statesToReread:Landroidx/compose/runtime/collection/MutableVector;

    .line 42
    .line 43
    new-instance v1, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap$derivedStateObserver$1;

    .line 44
    .line 45
    invoke-direct {v1, p0}, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap$derivedStateObserver$1;-><init>(Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;)V

    .line 46
    .line 47
    .line 48
    iput-object v1, p0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->derivedStateObserver:Landroidx/compose/runtime/DerivedStateObserver;

    .line 49
    .line 50
    invoke-static {p1, v0, p1}, Landroidx/compose/runtime/collection/ScopeMap;->constructor-impl$default(Landroidx/collection/MutableScatterMap;ILkotlin/jvm/internal/DefaultConstructorMarker;)Landroidx/collection/MutableScatterMap;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iput-object p1, p0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->dependencyToDerivedStates:Landroidx/collection/MutableScatterMap;

    .line 55
    .line 56
    new-instance p1, Ljava/util/HashMap;

    .line 57
    .line 58
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-object p1, p0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->recordedDerivedStateValues:Ljava/util/HashMap;

    .line 62
    .line 63
    return-void
.end method

.method public static final synthetic access$getDeriveStateScopeCount$p(Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;)I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->deriveStateScopeCount:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic access$setDeriveStateScopeCount$p(Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->deriveStateScopeCount:I

    .line 2
    .line 3
    return-void
.end method

.method private final clearObsoleteStateReads(Ljava/lang/Object;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->currentToken:I

    .line 4
    .line 5
    iget-object v2, v0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->currentScopeReads:Landroidx/collection/MutableObjectIntMap;

    .line 6
    .line 7
    if-eqz v2, :cond_6

    .line 8
    .line 9
    iget-object v3, v2, Landroidx/collection/ObjectIntMap;->metadata:[J

    .line 10
    .line 11
    array-length v4, v3

    .line 12
    add-int/lit8 v4, v4, -0x2

    .line 13
    .line 14
    if-ltz v4, :cond_6

    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    move v6, v5

    .line 18
    :goto_0
    aget-wide v7, v3, v6

    .line 19
    .line 20
    not-long v9, v7

    .line 21
    const/4 v11, 0x7

    .line 22
    shl-long/2addr v9, v11

    .line 23
    and-long/2addr v9, v7

    .line 24
    const-wide v11, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    and-long/2addr v9, v11

    .line 30
    cmp-long v9, v9, v11

    .line 31
    .line 32
    if-eqz v9, :cond_5

    .line 33
    .line 34
    sub-int v9, v6, v4

    .line 35
    .line 36
    not-int v9, v9

    .line 37
    ushr-int/lit8 v9, v9, 0x1f

    .line 38
    .line 39
    const/16 v10, 0x8

    .line 40
    .line 41
    rsub-int/lit8 v9, v9, 0x8

    .line 42
    .line 43
    move v11, v5

    .line 44
    :goto_1
    if-ge v11, v9, :cond_4

    .line 45
    .line 46
    const-wide/16 v12, 0xff

    .line 47
    .line 48
    and-long/2addr v12, v7

    .line 49
    const-wide/16 v14, 0x80

    .line 50
    .line 51
    cmp-long v12, v12, v14

    .line 52
    .line 53
    if-gez v12, :cond_2

    .line 54
    .line 55
    shl-int/lit8 v12, v6, 0x3

    .line 56
    .line 57
    add-int/2addr v12, v11

    .line 58
    iget-object v13, v2, Landroidx/collection/ObjectIntMap;->keys:[Ljava/lang/Object;

    .line 59
    .line 60
    aget-object v13, v13, v12

    .line 61
    .line 62
    iget-object v14, v2, Landroidx/collection/ObjectIntMap;->values:[I

    .line 63
    .line 64
    aget v14, v14, v12

    .line 65
    .line 66
    if-eq v14, v1, :cond_0

    .line 67
    .line 68
    const/4 v14, 0x1

    .line 69
    goto :goto_2

    .line 70
    :cond_0
    move v14, v5

    .line 71
    :goto_2
    move-object/from16 v15, p1

    .line 72
    .line 73
    if-eqz v14, :cond_1

    .line 74
    .line 75
    invoke-direct {v0, v15, v13}, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->removeObservation(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    :cond_1
    if-eqz v14, :cond_3

    .line 79
    .line 80
    invoke-virtual {v2, v12}, Landroidx/collection/MutableObjectIntMap;->removeValueAt(I)V

    .line 81
    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_2
    move-object/from16 v15, p1

    .line 85
    .line 86
    :cond_3
    :goto_3
    shr-long/2addr v7, v10

    .line 87
    add-int/lit8 v11, v11, 0x1

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_4
    move-object/from16 v15, p1

    .line 91
    .line 92
    if-ne v9, v10, :cond_6

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_5
    move-object/from16 v15, p1

    .line 96
    .line 97
    :goto_4
    if-eq v6, v4, :cond_6

    .line 98
    .line 99
    add-int/lit8 v6, v6, 0x1

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_6
    return-void
.end method

.method private final recordRead(Ljava/lang/Object;ILjava/lang/Object;Landroidx/collection/MutableObjectIntMap;)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "I",
            "Ljava/lang/Object;",
            "Landroidx/collection/MutableObjectIntMap<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    .line 9
    iget v3, v0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->deriveStateScopeCount:I

    if-lez v3, :cond_0

    goto/16 :goto_5

    :cond_0
    const/4 v3, -0x1

    move-object/from16 v4, p4

    .line 10
    invoke-virtual {v4, v1, v2, v3}, Landroidx/collection/MutableObjectIntMap;->put(Ljava/lang/Object;II)I

    move-result v4

    .line 11
    instance-of v5, v1, Landroidx/compose/runtime/DerivedState;

    const/4 v6, 0x2

    if-eqz v5, :cond_7

    if-eq v4, v2, :cond_7

    .line 12
    move-object v2, v1

    check-cast v2, Landroidx/compose/runtime/DerivedState;

    invoke-interface {v2}, Landroidx/compose/runtime/DerivedState;->getCurrentRecord()Landroidx/compose/runtime/DerivedState$Record;

    move-result-object v2

    .line 13
    iget-object v5, v0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->recordedDerivedStateValues:Ljava/util/HashMap;

    invoke-interface {v2}, Landroidx/compose/runtime/DerivedState$Record;->getCurrentValue()Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v5, v1, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    invoke-interface {v2}, Landroidx/compose/runtime/DerivedState$Record;->getDependencies()Landroidx/collection/ObjectIntMap;

    move-result-object v2

    .line 15
    iget-object v5, v0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->dependencyToDerivedStates:Landroidx/collection/MutableScatterMap;

    .line 16
    invoke-static {v5, v1}, Landroidx/compose/runtime/collection/ScopeMap;->removeScope-impl(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)V

    .line 17
    iget-object v7, v2, Landroidx/collection/ObjectIntMap;->keys:[Ljava/lang/Object;

    .line 18
    iget-object v2, v2, Landroidx/collection/ObjectIntMap;->metadata:[J

    .line 19
    array-length v8, v2

    sub-int/2addr v8, v6

    if-ltz v8, :cond_5

    const/4 v10, 0x0

    .line 20
    :goto_0
    aget-wide v11, v2, v10

    not-long v13, v11

    const/4 v15, 0x7

    shl-long/2addr v13, v15

    and-long/2addr v13, v11

    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v13, v15

    cmp-long v13, v13, v15

    if-eqz v13, :cond_4

    sub-int v13, v10, v8

    not-int v13, v13

    ushr-int/lit8 v13, v13, 0x1f

    const/16 v14, 0x8

    rsub-int/lit8 v13, v13, 0x8

    const/4 v15, 0x0

    :goto_1
    if-ge v15, v13, :cond_3

    const-wide/16 v16, 0xff

    and-long v16, v11, v16

    const-wide/16 v18, 0x80

    cmp-long v16, v16, v18

    if-gez v16, :cond_2

    shl-int/lit8 v16, v10, 0x3

    add-int v16, v16, v15

    .line 21
    aget-object v16, v7, v16

    move/from16 p4, v6

    move-object/from16 v6, v16

    check-cast v6, Landroidx/compose/runtime/snapshots/StateObject;

    .line 22
    instance-of v9, v6, Landroidx/compose/runtime/snapshots/StateObjectImpl;

    if-eqz v9, :cond_1

    .line 23
    move-object v9, v6

    check-cast v9, Landroidx/compose/runtime/snapshots/StateObjectImpl;

    .line 24
    invoke-static/range {p4 .. p4}, Landroidx/compose/runtime/snapshots/ReaderKind;->constructor-impl(I)I

    move-result v3

    .line 25
    invoke-virtual {v9, v3}, Landroidx/compose/runtime/snapshots/StateObjectImpl;->recordReadIn-h_f27i8$runtime_release(I)V

    .line 26
    :cond_1
    invoke-static {v5, v6, v1}, Landroidx/compose/runtime/collection/ScopeMap;->add-impl(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    move/from16 p4, v6

    :goto_2
    shr-long/2addr v11, v14

    add-int/lit8 v15, v15, 0x1

    move/from16 v6, p4

    const/4 v3, -0x1

    goto :goto_1

    :cond_3
    move/from16 p4, v6

    if-ne v13, v14, :cond_6

    goto :goto_3

    :cond_4
    move/from16 p4, v6

    :goto_3
    if-eq v10, v8, :cond_6

    add-int/lit8 v10, v10, 0x1

    move/from16 v6, p4

    const/4 v3, -0x1

    goto :goto_0

    :cond_5
    move/from16 p4, v6

    :cond_6
    const/4 v2, -0x1

    goto :goto_4

    :cond_7
    move/from16 p4, v6

    move v2, v3

    :goto_4
    if-ne v4, v2, :cond_9

    .line 27
    instance-of v2, v1, Landroidx/compose/runtime/snapshots/StateObjectImpl;

    if-eqz v2, :cond_8

    .line 28
    move-object v2, v1

    check-cast v2, Landroidx/compose/runtime/snapshots/StateObjectImpl;

    .line 29
    invoke-static/range {p4 .. p4}, Landroidx/compose/runtime/snapshots/ReaderKind;->constructor-impl(I)I

    move-result v3

    .line 30
    invoke-virtual {v2, v3}, Landroidx/compose/runtime/snapshots/StateObjectImpl;->recordReadIn-h_f27i8$runtime_release(I)V

    .line 31
    :cond_8
    iget-object v2, v0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->valueToScopes:Landroidx/collection/MutableScatterMap;

    move-object/from16 v3, p3

    invoke-static {v2, v1, v3}, Landroidx/compose/runtime/collection/ScopeMap;->add-impl(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_9
    :goto_5
    return-void
.end method

.method private final removeObservation(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->valueToScopes:Landroidx/collection/MutableScatterMap;

    .line 2
    .line 3
    invoke-static {v0, p2, p1}, Landroidx/compose/runtime/collection/ScopeMap;->remove-impl(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    instance-of p1, p2, Landroidx/compose/runtime/DerivedState;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->valueToScopes:Landroidx/collection/MutableScatterMap;

    .line 11
    .line 12
    invoke-static {p1, p2}, Landroidx/compose/runtime/collection/ScopeMap;->contains-impl(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    iget-object p1, p0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->dependencyToDerivedStates:Landroidx/collection/MutableScatterMap;

    .line 19
    .line 20
    invoke-static {p1, p2}, Landroidx/compose/runtime/collection/ScopeMap;->removeScope-impl(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->recordedDerivedStateValues:Ljava/util/HashMap;

    .line 24
    .line 25
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->valueToScopes:Landroidx/collection/MutableScatterMap;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/compose/runtime/collection/ScopeMap;->clear-impl(Landroidx/collection/MutableScatterMap;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->scopeToValues:Landroidx/collection/MutableScatterMap;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/collection/MutableScatterMap;->clear()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->dependencyToDerivedStates:Landroidx/collection/MutableScatterMap;

    .line 12
    .line 13
    invoke-static {v0}, Landroidx/compose/runtime/collection/ScopeMap;->clear-impl(Landroidx/collection/MutableScatterMap;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->recordedDerivedStateValues:Ljava/util/HashMap;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final clearScopeObservations(Ljava/lang/Object;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->scopeToValues:Landroidx/collection/MutableScatterMap;

    .line 6
    .line 7
    invoke-virtual {v2, v1}, Landroidx/collection/MutableScatterMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast v2, Landroidx/collection/MutableObjectIntMap;

    .line 12
    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    goto :goto_2

    .line 16
    :cond_0
    iget-object v3, v2, Landroidx/collection/ObjectIntMap;->keys:[Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v4, v2, Landroidx/collection/ObjectIntMap;->values:[I

    .line 19
    .line 20
    iget-object v2, v2, Landroidx/collection/ObjectIntMap;->metadata:[J

    .line 21
    .line 22
    array-length v5, v2

    .line 23
    add-int/lit8 v5, v5, -0x2

    .line 24
    .line 25
    if-ltz v5, :cond_4

    .line 26
    .line 27
    const/4 v6, 0x0

    .line 28
    move v7, v6

    .line 29
    :goto_0
    aget-wide v8, v2, v7

    .line 30
    .line 31
    not-long v10, v8

    .line 32
    const/4 v12, 0x7

    .line 33
    shl-long/2addr v10, v12

    .line 34
    and-long/2addr v10, v8

    .line 35
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    and-long/2addr v10, v12

    .line 41
    cmp-long v10, v10, v12

    .line 42
    .line 43
    if-eqz v10, :cond_3

    .line 44
    .line 45
    sub-int v10, v7, v5

    .line 46
    .line 47
    not-int v10, v10

    .line 48
    ushr-int/lit8 v10, v10, 0x1f

    .line 49
    .line 50
    const/16 v11, 0x8

    .line 51
    .line 52
    rsub-int/lit8 v10, v10, 0x8

    .line 53
    .line 54
    move v12, v6

    .line 55
    :goto_1
    if-ge v12, v10, :cond_2

    .line 56
    .line 57
    const-wide/16 v13, 0xff

    .line 58
    .line 59
    and-long/2addr v13, v8

    .line 60
    const-wide/16 v15, 0x80

    .line 61
    .line 62
    cmp-long v13, v13, v15

    .line 63
    .line 64
    if-gez v13, :cond_1

    .line 65
    .line 66
    shl-int/lit8 v13, v7, 0x3

    .line 67
    .line 68
    add-int/2addr v13, v12

    .line 69
    aget-object v14, v3, v13

    .line 70
    .line 71
    aget v13, v4, v13

    .line 72
    .line 73
    invoke-direct {v0, v1, v14}, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->removeObservation(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    :cond_1
    shr-long/2addr v8, v11

    .line 77
    add-int/lit8 v12, v12, 0x1

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_2
    if-ne v10, v11, :cond_4

    .line 81
    .line 82
    :cond_3
    if-eq v7, v5, :cond_4

    .line 83
    .line 84
    add-int/lit8 v7, v7, 0x1

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_4
    :goto_2
    return-void
.end method

.method public final getDerivedStateObserver()Landroidx/compose/runtime/DerivedStateObserver;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->derivedStateObserver:Landroidx/compose/runtime/DerivedStateObserver;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOnChanged()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Object;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->onChanged:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object v0
.end method

.method public final hasScopeObservations()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->scopeToValues:Landroidx/collection/MutableScatterMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/collection/ScatterMap;->isNotEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final notifyInvalidatedScopes()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->invalidated:Landroidx/collection/MutableScatterSet;

    .line 4
    .line 5
    iget-object v2, v0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->onChanged:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    iget-object v3, v1, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v1, Landroidx/collection/ScatterSet;->metadata:[J

    .line 10
    .line 11
    array-length v5, v4

    .line 12
    add-int/lit8 v5, v5, -0x2

    .line 13
    .line 14
    if-ltz v5, :cond_3

    .line 15
    .line 16
    const/4 v6, 0x0

    .line 17
    move v7, v6

    .line 18
    :goto_0
    aget-wide v8, v4, v7

    .line 19
    .line 20
    not-long v10, v8

    .line 21
    const/4 v12, 0x7

    .line 22
    shl-long/2addr v10, v12

    .line 23
    and-long/2addr v10, v8

    .line 24
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    and-long/2addr v10, v12

    .line 30
    cmp-long v10, v10, v12

    .line 31
    .line 32
    if-eqz v10, :cond_2

    .line 33
    .line 34
    sub-int v10, v7, v5

    .line 35
    .line 36
    not-int v10, v10

    .line 37
    ushr-int/lit8 v10, v10, 0x1f

    .line 38
    .line 39
    const/16 v11, 0x8

    .line 40
    .line 41
    rsub-int/lit8 v10, v10, 0x8

    .line 42
    .line 43
    move v12, v6

    .line 44
    :goto_1
    if-ge v12, v10, :cond_1

    .line 45
    .line 46
    const-wide/16 v13, 0xff

    .line 47
    .line 48
    and-long/2addr v13, v8

    .line 49
    const-wide/16 v15, 0x80

    .line 50
    .line 51
    cmp-long v13, v13, v15

    .line 52
    .line 53
    if-gez v13, :cond_0

    .line 54
    .line 55
    shl-int/lit8 v13, v7, 0x3

    .line 56
    .line 57
    add-int/2addr v13, v12

    .line 58
    aget-object v13, v3, v13

    .line 59
    .line 60
    invoke-interface {v2, v13}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    :cond_0
    shr-long/2addr v8, v11

    .line 64
    add-int/lit8 v12, v12, 0x1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    if-ne v10, v11, :cond_3

    .line 68
    .line 69
    :cond_2
    if-eq v7, v5, :cond_3

    .line 70
    .line 71
    add-int/lit8 v7, v7, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_3
    invoke-virtual {v1}, Landroidx/collection/MutableScatterSet;->clear()V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public final observe(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Object;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->currentScope:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->currentScopeReads:Landroidx/collection/MutableObjectIntMap;

    .line 4
    .line 5
    iget v2, p0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->currentToken:I

    .line 6
    .line 7
    iput-object p1, p0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->currentScope:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v3, p0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->scopeToValues:Landroidx/collection/MutableScatterMap;

    .line 10
    .line 11
    invoke-virtual {v3, p1}, Landroidx/collection/ScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Landroidx/collection/MutableObjectIntMap;

    .line 16
    .line 17
    iput-object p1, p0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->currentScopeReads:Landroidx/collection/MutableObjectIntMap;

    .line 18
    .line 19
    iget p1, p0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->currentToken:I

    .line 20
    .line 21
    const/4 v3, -0x1

    .line 22
    if-ne p1, v3, :cond_0

    .line 23
    .line 24
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->currentSnapshot()Landroidx/compose/runtime/snapshots/Snapshot;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, Landroidx/compose/runtime/snapshots/Snapshot;->getSnapshotId()J

    .line 29
    .line 30
    .line 31
    move-result-wide v3

    .line 32
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    iput p1, p0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->currentToken:I

    .line 37
    .line 38
    :cond_0
    iget-object p1, p0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->derivedStateObserver:Landroidx/compose/runtime/DerivedStateObserver;

    .line 39
    .line 40
    invoke-static {}, Landroidx/compose/runtime/SnapshotStateKt;->derivedStateObservers()Landroidx/compose/runtime/collection/MutableVector;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    :try_start_0
    invoke-virtual {v3, p1}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    sget-object p1, Landroidx/compose/runtime/snapshots/Snapshot;->Companion:Landroidx/compose/runtime/snapshots/Snapshot$Companion;

    .line 48
    .line 49
    const/4 v4, 0x0

    .line 50
    invoke-virtual {p1, p2, v4, p3}, Landroidx/compose/runtime/snapshots/Snapshot$Companion;->observe(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    add-int/lit8 p1, p1, -0x1

    .line 58
    .line 59
    invoke-virtual {v3, p1}, Landroidx/compose/runtime/collection/MutableVector;->removeAt(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->currentScope:Ljava/lang/Object;

    .line 63
    .line 64
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-direct {p0, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->clearObsoleteStateReads(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    iput-object v0, p0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->currentScope:Ljava/lang/Object;

    .line 71
    .line 72
    iput-object v1, p0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->currentScopeReads:Landroidx/collection/MutableObjectIntMap;

    .line 73
    .line 74
    iput v2, p0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->currentToken:I

    .line 75
    .line 76
    return-void

    .line 77
    :catchall_0
    move-exception p1

    .line 78
    invoke-virtual {v3}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 79
    .line 80
    .line 81
    move-result p2

    .line 82
    add-int/lit8 p2, p2, -0x1

    .line 83
    .line 84
    invoke-virtual {v3, p2}, Landroidx/compose/runtime/collection/MutableVector;->removeAt(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    throw p1
.end method

.method public final recordInvalidation(Ljava/util/Set;)Z
    .locals 43
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->dependencyToDerivedStates:Landroidx/collection/MutableScatterMap;

    .line 6
    .line 7
    iget-object v3, v0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->recordedDerivedStateValues:Ljava/util/HashMap;

    .line 8
    .line 9
    iget-object v4, v0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->valueToScopes:Landroidx/collection/MutableScatterMap;

    .line 10
    .line 11
    iget-object v5, v0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->invalidated:Landroidx/collection/MutableScatterSet;

    .line 12
    .line 13
    instance-of v6, v1, Landroidx/compose/runtime/collection/ScatterSetWrapper;

    .line 14
    .line 15
    const-string/jumbo v7, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>"

    .line 16
    .line 17
    .line 18
    const/4 v13, 0x2

    .line 19
    const-wide/16 v16, 0x80

    .line 20
    .line 21
    const/16 v8, 0x8

    .line 22
    .line 23
    const/16 v18, 0x0

    .line 24
    .line 25
    if-eqz v6, :cond_22

    .line 26
    .line 27
    check-cast v1, Landroidx/compose/runtime/collection/ScatterSetWrapper;

    .line 28
    .line 29
    invoke-virtual {v1}, Landroidx/compose/runtime/collection/ScatterSetWrapper;->getSet$runtime_release()Landroidx/collection/ScatterSet;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    iget-object v6, v1, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 34
    .line 35
    iget-object v1, v1, Landroidx/collection/ScatterSet;->metadata:[J

    .line 36
    .line 37
    array-length v9, v1

    .line 38
    sub-int/2addr v9, v13

    .line 39
    if-ltz v9, :cond_21

    .line 40
    .line 41
    move/from16 v22, v13

    .line 42
    .line 43
    move/from16 v10, v18

    .line 44
    .line 45
    move v11, v10

    .line 46
    const-wide/16 v19, 0xff

    .line 47
    .line 48
    const/16 v21, 0x7

    .line 49
    .line 50
    :goto_0
    aget-wide v12, v1, v10

    .line 51
    .line 52
    const-wide v23, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    not-long v14, v12

    .line 58
    shl-long v14, v14, v21

    .line 59
    .line 60
    and-long/2addr v14, v12

    .line 61
    and-long v14, v14, v23

    .line 62
    .line 63
    cmp-long v14, v14, v23

    .line 64
    .line 65
    if-eqz v14, :cond_20

    .line 66
    .line 67
    sub-int v14, v10, v9

    .line 68
    .line 69
    not-int v14, v14

    .line 70
    ushr-int/lit8 v14, v14, 0x1f

    .line 71
    .line 72
    rsub-int/lit8 v14, v14, 0x8

    .line 73
    .line 74
    move/from16 v15, v18

    .line 75
    .line 76
    :goto_1
    if-ge v15, v14, :cond_1f

    .line 77
    .line 78
    and-long v25, v12, v19

    .line 79
    .line 80
    cmp-long v25, v25, v16

    .line 81
    .line 82
    if-gez v25, :cond_1e

    .line 83
    .line 84
    shl-int/lit8 v25, v10, 0x3

    .line 85
    .line 86
    add-int v25, v25, v15

    .line 87
    .line 88
    move/from16 v26, v8

    .line 89
    .line 90
    aget-object v8, v6, v25

    .line 91
    .line 92
    move-object/from16 v25, v1

    .line 93
    .line 94
    instance-of v1, v8, Landroidx/compose/runtime/snapshots/StateObjectImpl;

    .line 95
    .line 96
    if-eqz v1, :cond_0

    .line 97
    .line 98
    move-object v1, v8

    .line 99
    check-cast v1, Landroidx/compose/runtime/snapshots/StateObjectImpl;

    .line 100
    .line 101
    move-object/from16 p1, v6

    .line 102
    .line 103
    invoke-static/range {v22 .. v22}, Landroidx/compose/runtime/snapshots/ReaderKind;->constructor-impl(I)I

    .line 104
    .line 105
    .line 106
    move-result v6

    .line 107
    invoke-virtual {v1, v6}, Landroidx/compose/runtime/snapshots/StateObjectImpl;->isReadIn-h_f27i8$runtime_release(I)Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-nez v1, :cond_1

    .line 112
    .line 113
    move-object/from16 v39, v7

    .line 114
    .line 115
    move/from16 v31, v9

    .line 116
    .line 117
    move/from16 v32, v10

    .line 118
    .line 119
    move-wide/from16 v29, v12

    .line 120
    .line 121
    move/from16 v38, v14

    .line 122
    .line 123
    goto/16 :goto_11

    .line 124
    .line 125
    :cond_0
    move-object/from16 p1, v6

    .line 126
    .line 127
    :cond_1
    invoke-static {v2, v8}, Landroidx/compose/runtime/collection/ScopeMap;->contains-impl(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    if-eqz v1, :cond_18

    .line 132
    .line 133
    invoke-virtual {v2, v8}, Landroidx/collection/ScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    if-eqz v1, :cond_16

    .line 138
    .line 139
    instance-of v6, v1, Landroidx/collection/MutableScatterSet;

    .line 140
    .line 141
    if-eqz v6, :cond_f

    .line 142
    .line 143
    check-cast v1, Landroidx/collection/MutableScatterSet;

    .line 144
    .line 145
    iget-object v6, v1, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 146
    .line 147
    iget-object v1, v1, Landroidx/collection/ScatterSet;->metadata:[J

    .line 148
    .line 149
    move-object/from16 v27, v6

    .line 150
    .line 151
    array-length v6, v1

    .line 152
    add-int/lit8 v6, v6, -0x2

    .line 153
    .line 154
    if-ltz v6, :cond_16

    .line 155
    .line 156
    move-object/from16 v28, v1

    .line 157
    .line 158
    move-wide/from16 v29, v12

    .line 159
    .line 160
    move/from16 v1, v18

    .line 161
    .line 162
    move v13, v11

    .line 163
    :goto_2
    aget-wide v11, v28, v1

    .line 164
    .line 165
    move/from16 v31, v9

    .line 166
    .line 167
    move/from16 v32, v10

    .line 168
    .line 169
    not-long v9, v11

    .line 170
    shl-long v9, v9, v21

    .line 171
    .line 172
    and-long/2addr v9, v11

    .line 173
    and-long v9, v9, v23

    .line 174
    .line 175
    cmp-long v9, v9, v23

    .line 176
    .line 177
    if-eqz v9, :cond_d

    .line 178
    .line 179
    sub-int v9, v1, v6

    .line 180
    .line 181
    not-int v9, v9

    .line 182
    ushr-int/lit8 v9, v9, 0x1f

    .line 183
    .line 184
    rsub-int/lit8 v9, v9, 0x8

    .line 185
    .line 186
    move/from16 v10, v18

    .line 187
    .line 188
    :goto_3
    if-ge v10, v9, :cond_b

    .line 189
    .line 190
    and-long v33, v11, v19

    .line 191
    .line 192
    cmp-long v33, v33, v16

    .line 193
    .line 194
    if-gez v33, :cond_a

    .line 195
    .line 196
    shl-int/lit8 v33, v1, 0x3

    .line 197
    .line 198
    add-int v33, v33, v10

    .line 199
    .line 200
    aget-object v33, v27, v33

    .line 201
    .line 202
    move/from16 v34, v10

    .line 203
    .line 204
    move-object/from16 v10, v33

    .line 205
    .line 206
    check-cast v10, Landroidx/compose/runtime/DerivedState;

    .line 207
    .line 208
    invoke-static {v10, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    move-wide/from16 v35, v11

    .line 212
    .line 213
    invoke-virtual {v3, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v11

    .line 217
    invoke-interface {v10}, Landroidx/compose/runtime/DerivedState;->getPolicy()Landroidx/compose/runtime/SnapshotMutationPolicy;

    .line 218
    .line 219
    .line 220
    move-result-object v12

    .line 221
    if-nez v12, :cond_2

    .line 222
    .line 223
    invoke-static {}, Landroidx/compose/runtime/SnapshotStateKt;->structuralEqualityPolicy()Landroidx/compose/runtime/SnapshotMutationPolicy;

    .line 224
    .line 225
    .line 226
    move-result-object v12

    .line 227
    :cond_2
    invoke-interface {v10}, Landroidx/compose/runtime/DerivedState;->getCurrentRecord()Landroidx/compose/runtime/DerivedState$Record;

    .line 228
    .line 229
    .line 230
    move-result-object v33

    .line 231
    move/from16 v37, v13

    .line 232
    .line 233
    invoke-interface/range {v33 .. v33}, Landroidx/compose/runtime/DerivedState$Record;->getCurrentValue()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v13

    .line 237
    invoke-interface {v12, v13, v11}, Landroidx/compose/runtime/SnapshotMutationPolicy;->equivalent(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v11

    .line 241
    if-nez v11, :cond_8

    .line 242
    .line 243
    invoke-virtual {v4, v10}, Landroidx/collection/ScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v10

    .line 247
    if-eqz v10, :cond_6

    .line 248
    .line 249
    instance-of v11, v10, Landroidx/collection/MutableScatterSet;

    .line 250
    .line 251
    if-eqz v11, :cond_7

    .line 252
    .line 253
    check-cast v10, Landroidx/collection/MutableScatterSet;

    .line 254
    .line 255
    iget-object v11, v10, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 256
    .line 257
    iget-object v10, v10, Landroidx/collection/ScatterSet;->metadata:[J

    .line 258
    .line 259
    array-length v12, v10

    .line 260
    add-int/lit8 v12, v12, -0x2

    .line 261
    .line 262
    if-ltz v12, :cond_6

    .line 263
    .line 264
    move-object/from16 v33, v10

    .line 265
    .line 266
    move/from16 v38, v14

    .line 267
    .line 268
    move/from16 v10, v18

    .line 269
    .line 270
    :goto_4
    aget-wide v13, v33, v10

    .line 271
    .line 272
    move-object/from16 v39, v7

    .line 273
    .line 274
    move-object/from16 v40, v8

    .line 275
    .line 276
    not-long v7, v13

    .line 277
    shl-long v7, v7, v21

    .line 278
    .line 279
    and-long/2addr v7, v13

    .line 280
    and-long v7, v7, v23

    .line 281
    .line 282
    cmp-long v7, v7, v23

    .line 283
    .line 284
    if-eqz v7, :cond_5

    .line 285
    .line 286
    sub-int v7, v10, v12

    .line 287
    .line 288
    not-int v7, v7

    .line 289
    ushr-int/lit8 v7, v7, 0x1f

    .line 290
    .line 291
    rsub-int/lit8 v8, v7, 0x8

    .line 292
    .line 293
    move/from16 v7, v18

    .line 294
    .line 295
    :goto_5
    if-ge v7, v8, :cond_4

    .line 296
    .line 297
    and-long v41, v13, v19

    .line 298
    .line 299
    cmp-long v41, v41, v16

    .line 300
    .line 301
    if-gez v41, :cond_3

    .line 302
    .line 303
    shl-int/lit8 v37, v10, 0x3

    .line 304
    .line 305
    add-int v37, v37, v7

    .line 306
    .line 307
    move/from16 v41, v7

    .line 308
    .line 309
    aget-object v7, v11, v37

    .line 310
    .line 311
    invoke-virtual {v5, v7}, Landroidx/collection/MutableScatterSet;->add(Ljava/lang/Object;)Z

    .line 312
    .line 313
    .line 314
    const/16 v37, 0x1

    .line 315
    .line 316
    goto :goto_6

    .line 317
    :cond_3
    move/from16 v41, v7

    .line 318
    .line 319
    :goto_6
    shr-long v13, v13, v26

    .line 320
    .line 321
    add-int/lit8 v7, v41, 0x1

    .line 322
    .line 323
    goto :goto_5

    .line 324
    :cond_4
    move/from16 v7, v26

    .line 325
    .line 326
    if-ne v8, v7, :cond_9

    .line 327
    .line 328
    :cond_5
    if-eq v10, v12, :cond_9

    .line 329
    .line 330
    add-int/lit8 v10, v10, 0x1

    .line 331
    .line 332
    move-object/from16 v7, v39

    .line 333
    .line 334
    move-object/from16 v8, v40

    .line 335
    .line 336
    const/16 v26, 0x8

    .line 337
    .line 338
    goto :goto_4

    .line 339
    :cond_6
    move-object/from16 v39, v7

    .line 340
    .line 341
    move-object/from16 v40, v8

    .line 342
    .line 343
    move/from16 v38, v14

    .line 344
    .line 345
    goto :goto_7

    .line 346
    :cond_7
    move-object/from16 v39, v7

    .line 347
    .line 348
    move-object/from16 v40, v8

    .line 349
    .line 350
    move/from16 v38, v14

    .line 351
    .line 352
    invoke-virtual {v5, v10}, Landroidx/collection/MutableScatterSet;->add(Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    const/4 v13, 0x1

    .line 356
    goto :goto_8

    .line 357
    :cond_8
    move-object/from16 v39, v7

    .line 358
    .line 359
    move-object/from16 v40, v8

    .line 360
    .line 361
    move/from16 v38, v14

    .line 362
    .line 363
    iget-object v7, v0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->statesToReread:Landroidx/compose/runtime/collection/MutableVector;

    .line 364
    .line 365
    invoke-virtual {v7, v10}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    :cond_9
    :goto_7
    move/from16 v13, v37

    .line 369
    .line 370
    :goto_8
    const/16 v7, 0x8

    .line 371
    .line 372
    goto :goto_9

    .line 373
    :cond_a
    move-object/from16 v39, v7

    .line 374
    .line 375
    move-object/from16 v40, v8

    .line 376
    .line 377
    move/from16 v34, v10

    .line 378
    .line 379
    move-wide/from16 v35, v11

    .line 380
    .line 381
    move/from16 v37, v13

    .line 382
    .line 383
    move/from16 v38, v14

    .line 384
    .line 385
    goto :goto_8

    .line 386
    :goto_9
    shr-long v11, v35, v7

    .line 387
    .line 388
    add-int/lit8 v10, v34, 0x1

    .line 389
    .line 390
    move/from16 v26, v7

    .line 391
    .line 392
    move/from16 v14, v38

    .line 393
    .line 394
    move-object/from16 v7, v39

    .line 395
    .line 396
    move-object/from16 v8, v40

    .line 397
    .line 398
    goto/16 :goto_3

    .line 399
    .line 400
    :cond_b
    move-object/from16 v39, v7

    .line 401
    .line 402
    move-object/from16 v40, v8

    .line 403
    .line 404
    move/from16 v37, v13

    .line 405
    .line 406
    move/from16 v38, v14

    .line 407
    .line 408
    move/from16 v7, v26

    .line 409
    .line 410
    if-ne v9, v7, :cond_c

    .line 411
    .line 412
    move/from16 v13, v37

    .line 413
    .line 414
    goto :goto_a

    .line 415
    :cond_c
    move/from16 v11, v37

    .line 416
    .line 417
    goto/16 :goto_d

    .line 418
    .line 419
    :cond_d
    move-object/from16 v39, v7

    .line 420
    .line 421
    move-object/from16 v40, v8

    .line 422
    .line 423
    move/from16 v38, v14

    .line 424
    .line 425
    :goto_a
    if-eq v1, v6, :cond_e

    .line 426
    .line 427
    add-int/lit8 v1, v1, 0x1

    .line 428
    .line 429
    move/from16 v9, v31

    .line 430
    .line 431
    move/from16 v10, v32

    .line 432
    .line 433
    move/from16 v14, v38

    .line 434
    .line 435
    move-object/from16 v7, v39

    .line 436
    .line 437
    move-object/from16 v8, v40

    .line 438
    .line 439
    const/16 v26, 0x8

    .line 440
    .line 441
    goto/16 :goto_2

    .line 442
    .line 443
    :cond_e
    move v11, v13

    .line 444
    goto/16 :goto_d

    .line 445
    .line 446
    :cond_f
    move-object/from16 v39, v7

    .line 447
    .line 448
    move-object/from16 v40, v8

    .line 449
    .line 450
    move/from16 v31, v9

    .line 451
    .line 452
    move/from16 v32, v10

    .line 453
    .line 454
    move-wide/from16 v29, v12

    .line 455
    .line 456
    move/from16 v38, v14

    .line 457
    .line 458
    check-cast v1, Landroidx/compose/runtime/DerivedState;

    .line 459
    .line 460
    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v6

    .line 464
    invoke-interface {v1}, Landroidx/compose/runtime/DerivedState;->getPolicy()Landroidx/compose/runtime/SnapshotMutationPolicy;

    .line 465
    .line 466
    .line 467
    move-result-object v7

    .line 468
    if-nez v7, :cond_10

    .line 469
    .line 470
    invoke-static {}, Landroidx/compose/runtime/SnapshotStateKt;->structuralEqualityPolicy()Landroidx/compose/runtime/SnapshotMutationPolicy;

    .line 471
    .line 472
    .line 473
    move-result-object v7

    .line 474
    :cond_10
    invoke-interface {v1}, Landroidx/compose/runtime/DerivedState;->getCurrentRecord()Landroidx/compose/runtime/DerivedState$Record;

    .line 475
    .line 476
    .line 477
    move-result-object v8

    .line 478
    invoke-interface {v8}, Landroidx/compose/runtime/DerivedState$Record;->getCurrentValue()Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v8

    .line 482
    invoke-interface {v7, v8, v6}, Landroidx/compose/runtime/SnapshotMutationPolicy;->equivalent(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 483
    .line 484
    .line 485
    move-result v6

    .line 486
    if-nez v6, :cond_15

    .line 487
    .line 488
    invoke-virtual {v4, v1}, Landroidx/collection/ScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object v1

    .line 492
    if-eqz v1, :cond_17

    .line 493
    .line 494
    instance-of v6, v1, Landroidx/collection/MutableScatterSet;

    .line 495
    .line 496
    if-eqz v6, :cond_14

    .line 497
    .line 498
    check-cast v1, Landroidx/collection/MutableScatterSet;

    .line 499
    .line 500
    iget-object v6, v1, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 501
    .line 502
    iget-object v1, v1, Landroidx/collection/ScatterSet;->metadata:[J

    .line 503
    .line 504
    array-length v7, v1

    .line 505
    add-int/lit8 v7, v7, -0x2

    .line 506
    .line 507
    if-ltz v7, :cond_17

    .line 508
    .line 509
    move/from16 v8, v18

    .line 510
    .line 511
    :goto_b
    aget-wide v9, v1, v8

    .line 512
    .line 513
    not-long v12, v9

    .line 514
    shl-long v12, v12, v21

    .line 515
    .line 516
    and-long/2addr v12, v9

    .line 517
    and-long v12, v12, v23

    .line 518
    .line 519
    cmp-long v12, v12, v23

    .line 520
    .line 521
    if-eqz v12, :cond_13

    .line 522
    .line 523
    sub-int v12, v8, v7

    .line 524
    .line 525
    not-int v12, v12

    .line 526
    ushr-int/lit8 v12, v12, 0x1f

    .line 527
    .line 528
    const/16 v26, 0x8

    .line 529
    .line 530
    rsub-int/lit8 v12, v12, 0x8

    .line 531
    .line 532
    move/from16 v13, v18

    .line 533
    .line 534
    :goto_c
    if-ge v13, v12, :cond_12

    .line 535
    .line 536
    and-long v27, v9, v19

    .line 537
    .line 538
    cmp-long v14, v27, v16

    .line 539
    .line 540
    if-gez v14, :cond_11

    .line 541
    .line 542
    shl-int/lit8 v11, v8, 0x3

    .line 543
    .line 544
    add-int/2addr v11, v13

    .line 545
    aget-object v11, v6, v11

    .line 546
    .line 547
    invoke-virtual {v5, v11}, Landroidx/collection/MutableScatterSet;->add(Ljava/lang/Object;)Z

    .line 548
    .line 549
    .line 550
    const/4 v11, 0x1

    .line 551
    :cond_11
    const/16 v14, 0x8

    .line 552
    .line 553
    shr-long/2addr v9, v14

    .line 554
    add-int/lit8 v13, v13, 0x1

    .line 555
    .line 556
    goto :goto_c

    .line 557
    :cond_12
    const/16 v14, 0x8

    .line 558
    .line 559
    if-ne v12, v14, :cond_17

    .line 560
    .line 561
    :cond_13
    if-eq v8, v7, :cond_17

    .line 562
    .line 563
    add-int/lit8 v8, v8, 0x1

    .line 564
    .line 565
    goto :goto_b

    .line 566
    :cond_14
    invoke-virtual {v5, v1}, Landroidx/collection/MutableScatterSet;->add(Ljava/lang/Object;)Z

    .line 567
    .line 568
    .line 569
    const/4 v11, 0x1

    .line 570
    goto :goto_d

    .line 571
    :cond_15
    iget-object v6, v0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->statesToReread:Landroidx/compose/runtime/collection/MutableVector;

    .line 572
    .line 573
    invoke-virtual {v6, v1}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 574
    .line 575
    .line 576
    goto :goto_d

    .line 577
    :cond_16
    move-object/from16 v39, v7

    .line 578
    .line 579
    move-object/from16 v40, v8

    .line 580
    .line 581
    move/from16 v31, v9

    .line 582
    .line 583
    move/from16 v32, v10

    .line 584
    .line 585
    move-wide/from16 v29, v12

    .line 586
    .line 587
    move/from16 v38, v14

    .line 588
    .line 589
    :cond_17
    :goto_d
    move-object/from16 v1, v40

    .line 590
    .line 591
    goto :goto_e

    .line 592
    :cond_18
    move-object/from16 v39, v7

    .line 593
    .line 594
    move/from16 v31, v9

    .line 595
    .line 596
    move/from16 v32, v10

    .line 597
    .line 598
    move-wide/from16 v29, v12

    .line 599
    .line 600
    move/from16 v38, v14

    .line 601
    .line 602
    move-object v1, v8

    .line 603
    :goto_e
    invoke-virtual {v4, v1}, Landroidx/collection/ScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 604
    .line 605
    .line 606
    move-result-object v1

    .line 607
    if-eqz v1, :cond_1d

    .line 608
    .line 609
    instance-of v6, v1, Landroidx/collection/MutableScatterSet;

    .line 610
    .line 611
    if-eqz v6, :cond_1c

    .line 612
    .line 613
    check-cast v1, Landroidx/collection/MutableScatterSet;

    .line 614
    .line 615
    iget-object v6, v1, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 616
    .line 617
    iget-object v1, v1, Landroidx/collection/ScatterSet;->metadata:[J

    .line 618
    .line 619
    array-length v7, v1

    .line 620
    add-int/lit8 v7, v7, -0x2

    .line 621
    .line 622
    if-ltz v7, :cond_1d

    .line 623
    .line 624
    move/from16 v8, v18

    .line 625
    .line 626
    :goto_f
    aget-wide v9, v1, v8

    .line 627
    .line 628
    not-long v12, v9

    .line 629
    shl-long v12, v12, v21

    .line 630
    .line 631
    and-long/2addr v12, v9

    .line 632
    and-long v12, v12, v23

    .line 633
    .line 634
    cmp-long v12, v12, v23

    .line 635
    .line 636
    if-eqz v12, :cond_1b

    .line 637
    .line 638
    sub-int v12, v8, v7

    .line 639
    .line 640
    not-int v12, v12

    .line 641
    ushr-int/lit8 v12, v12, 0x1f

    .line 642
    .line 643
    const/16 v26, 0x8

    .line 644
    .line 645
    rsub-int/lit8 v12, v12, 0x8

    .line 646
    .line 647
    move/from16 v13, v18

    .line 648
    .line 649
    :goto_10
    if-ge v13, v12, :cond_1a

    .line 650
    .line 651
    and-long v27, v9, v19

    .line 652
    .line 653
    cmp-long v14, v27, v16

    .line 654
    .line 655
    if-gez v14, :cond_19

    .line 656
    .line 657
    shl-int/lit8 v11, v8, 0x3

    .line 658
    .line 659
    add-int/2addr v11, v13

    .line 660
    aget-object v11, v6, v11

    .line 661
    .line 662
    invoke-virtual {v5, v11}, Landroidx/collection/MutableScatterSet;->add(Ljava/lang/Object;)Z

    .line 663
    .line 664
    .line 665
    const/4 v11, 0x1

    .line 666
    :cond_19
    const/16 v14, 0x8

    .line 667
    .line 668
    shr-long/2addr v9, v14

    .line 669
    add-int/lit8 v13, v13, 0x1

    .line 670
    .line 671
    goto :goto_10

    .line 672
    :cond_1a
    const/16 v14, 0x8

    .line 673
    .line 674
    if-ne v12, v14, :cond_1d

    .line 675
    .line 676
    :cond_1b
    if-eq v8, v7, :cond_1d

    .line 677
    .line 678
    add-int/lit8 v8, v8, 0x1

    .line 679
    .line 680
    goto :goto_f

    .line 681
    :cond_1c
    invoke-virtual {v5, v1}, Landroidx/collection/MutableScatterSet;->add(Ljava/lang/Object;)Z

    .line 682
    .line 683
    .line 684
    const/4 v11, 0x1

    .line 685
    :cond_1d
    :goto_11
    const/16 v14, 0x8

    .line 686
    .line 687
    goto :goto_12

    .line 688
    :cond_1e
    move-object/from16 v25, v1

    .line 689
    .line 690
    move-object/from16 p1, v6

    .line 691
    .line 692
    move-object/from16 v39, v7

    .line 693
    .line 694
    move/from16 v31, v9

    .line 695
    .line 696
    move/from16 v32, v10

    .line 697
    .line 698
    move-wide/from16 v29, v12

    .line 699
    .line 700
    move/from16 v38, v14

    .line 701
    .line 702
    move v14, v8

    .line 703
    :goto_12
    shr-long v12, v29, v14

    .line 704
    .line 705
    add-int/lit8 v15, v15, 0x1

    .line 706
    .line 707
    move-object/from16 v6, p1

    .line 708
    .line 709
    move v8, v14

    .line 710
    move-object/from16 v1, v25

    .line 711
    .line 712
    move/from16 v9, v31

    .line 713
    .line 714
    move/from16 v10, v32

    .line 715
    .line 716
    move/from16 v14, v38

    .line 717
    .line 718
    move-object/from16 v7, v39

    .line 719
    .line 720
    goto/16 :goto_1

    .line 721
    .line 722
    :cond_1f
    move/from16 p1, v14

    .line 723
    .line 724
    move v14, v8

    .line 725
    move/from16 v8, p1

    .line 726
    .line 727
    move-object/from16 v25, v1

    .line 728
    .line 729
    move-object/from16 p1, v6

    .line 730
    .line 731
    move-object/from16 v39, v7

    .line 732
    .line 733
    move/from16 v31, v9

    .line 734
    .line 735
    move/from16 v32, v10

    .line 736
    .line 737
    if-ne v8, v14, :cond_3e

    .line 738
    .line 739
    move/from16 v9, v31

    .line 740
    .line 741
    move/from16 v1, v32

    .line 742
    .line 743
    goto :goto_13

    .line 744
    :cond_20
    move-object/from16 v25, v1

    .line 745
    .line 746
    move-object/from16 p1, v6

    .line 747
    .line 748
    move-object/from16 v39, v7

    .line 749
    .line 750
    move v1, v10

    .line 751
    :goto_13
    if-eq v1, v9, :cond_3e

    .line 752
    .line 753
    add-int/lit8 v10, v1, 0x1

    .line 754
    .line 755
    move-object/from16 v6, p1

    .line 756
    .line 757
    move-object/from16 v1, v25

    .line 758
    .line 759
    move-object/from16 v7, v39

    .line 760
    .line 761
    const/16 v8, 0x8

    .line 762
    .line 763
    goto/16 :goto_0

    .line 764
    .line 765
    :cond_21
    move/from16 v11, v18

    .line 766
    .line 767
    goto/16 :goto_23

    .line 768
    .line 769
    :cond_22
    move-object/from16 v39, v7

    .line 770
    .line 771
    move/from16 v22, v13

    .line 772
    .line 773
    const-wide/16 v19, 0xff

    .line 774
    .line 775
    const/16 v21, 0x7

    .line 776
    .line 777
    const-wide v23, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    check-cast v1, Ljava/lang/Iterable;

    .line 783
    .line 784
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 785
    .line 786
    .line 787
    move-result-object v1

    .line 788
    move/from16 v11, v18

    .line 789
    .line 790
    :goto_14
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 791
    .line 792
    .line 793
    move-result v6

    .line 794
    if-eqz v6, :cond_3e

    .line 795
    .line 796
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 797
    .line 798
    .line 799
    move-result-object v6

    .line 800
    instance-of v7, v6, Landroidx/compose/runtime/snapshots/StateObjectImpl;

    .line 801
    .line 802
    if-eqz v7, :cond_24

    .line 803
    .line 804
    move-object v7, v6

    .line 805
    check-cast v7, Landroidx/compose/runtime/snapshots/StateObjectImpl;

    .line 806
    .line 807
    invoke-static/range {v22 .. v22}, Landroidx/compose/runtime/snapshots/ReaderKind;->constructor-impl(I)I

    .line 808
    .line 809
    .line 810
    move-result v8

    .line 811
    invoke-virtual {v7, v8}, Landroidx/compose/runtime/snapshots/StateObjectImpl;->isReadIn-h_f27i8$runtime_release(I)Z

    .line 812
    .line 813
    .line 814
    move-result v7

    .line 815
    if-nez v7, :cond_24

    .line 816
    .line 817
    move-object/from16 p1, v1

    .line 818
    .line 819
    move-object/from16 v25, v2

    .line 820
    .line 821
    :cond_23
    const/16 v14, 0x8

    .line 822
    .line 823
    goto/16 :goto_22

    .line 824
    .line 825
    :cond_24
    invoke-static {v2, v6}, Landroidx/compose/runtime/collection/ScopeMap;->contains-impl(Landroidx/collection/MutableScatterMap;Ljava/lang/Object;)Z

    .line 826
    .line 827
    .line 828
    move-result v7

    .line 829
    if-eqz v7, :cond_37

    .line 830
    .line 831
    invoke-virtual {v2, v6}, Landroidx/collection/ScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 832
    .line 833
    .line 834
    move-result-object v7

    .line 835
    if-eqz v7, :cond_37

    .line 836
    .line 837
    instance-of v8, v7, Landroidx/collection/MutableScatterSet;

    .line 838
    .line 839
    if-eqz v8, :cond_30

    .line 840
    .line 841
    check-cast v7, Landroidx/collection/MutableScatterSet;

    .line 842
    .line 843
    iget-object v8, v7, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 844
    .line 845
    iget-object v7, v7, Landroidx/collection/ScatterSet;->metadata:[J

    .line 846
    .line 847
    array-length v9, v7

    .line 848
    add-int/lit8 v9, v9, -0x2

    .line 849
    .line 850
    if-ltz v9, :cond_37

    .line 851
    .line 852
    move/from16 v10, v18

    .line 853
    .line 854
    :goto_15
    aget-wide v12, v7, v10

    .line 855
    .line 856
    not-long v14, v12

    .line 857
    shl-long v14, v14, v21

    .line 858
    .line 859
    and-long/2addr v14, v12

    .line 860
    and-long v14, v14, v23

    .line 861
    .line 862
    cmp-long v14, v14, v23

    .line 863
    .line 864
    if-eqz v14, :cond_2f

    .line 865
    .line 866
    sub-int v14, v10, v9

    .line 867
    .line 868
    not-int v14, v14

    .line 869
    ushr-int/lit8 v14, v14, 0x1f

    .line 870
    .line 871
    const/16 v26, 0x8

    .line 872
    .line 873
    rsub-int/lit8 v14, v14, 0x8

    .line 874
    .line 875
    move/from16 v15, v18

    .line 876
    .line 877
    :goto_16
    if-ge v15, v14, :cond_2e

    .line 878
    .line 879
    and-long v27, v12, v19

    .line 880
    .line 881
    cmp-long v25, v27, v16

    .line 882
    .line 883
    if-gez v25, :cond_2c

    .line 884
    .line 885
    shl-int/lit8 v25, v10, 0x3

    .line 886
    .line 887
    add-int v25, v25, v15

    .line 888
    .line 889
    aget-object v25, v8, v25

    .line 890
    .line 891
    move-object/from16 p1, v1

    .line 892
    .line 893
    move-object/from16 v1, v25

    .line 894
    .line 895
    check-cast v1, Landroidx/compose/runtime/DerivedState;

    .line 896
    .line 897
    move-object/from16 v25, v2

    .line 898
    .line 899
    move-object/from16 v2, v39

    .line 900
    .line 901
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 902
    .line 903
    .line 904
    invoke-virtual {v3, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 905
    .line 906
    .line 907
    move-result-object v2

    .line 908
    invoke-interface {v1}, Landroidx/compose/runtime/DerivedState;->getPolicy()Landroidx/compose/runtime/SnapshotMutationPolicy;

    .line 909
    .line 910
    .line 911
    move-result-object v27

    .line 912
    if-nez v27, :cond_25

    .line 913
    .line 914
    invoke-static {}, Landroidx/compose/runtime/SnapshotStateKt;->structuralEqualityPolicy()Landroidx/compose/runtime/SnapshotMutationPolicy;

    .line 915
    .line 916
    .line 917
    move-result-object v27

    .line 918
    :cond_25
    move-object/from16 v28, v7

    .line 919
    .line 920
    move-object/from16 v7, v27

    .line 921
    .line 922
    invoke-interface {v1}, Landroidx/compose/runtime/DerivedState;->getCurrentRecord()Landroidx/compose/runtime/DerivedState$Record;

    .line 923
    .line 924
    .line 925
    move-result-object v27

    .line 926
    move-object/from16 v29, v8

    .line 927
    .line 928
    invoke-interface/range {v27 .. v27}, Landroidx/compose/runtime/DerivedState$Record;->getCurrentValue()Ljava/lang/Object;

    .line 929
    .line 930
    .line 931
    move-result-object v8

    .line 932
    invoke-interface {v7, v8, v2}, Landroidx/compose/runtime/SnapshotMutationPolicy;->equivalent(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 933
    .line 934
    .line 935
    move-result v2

    .line 936
    if-nez v2, :cond_2b

    .line 937
    .line 938
    invoke-virtual {v4, v1}, Landroidx/collection/ScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 939
    .line 940
    .line 941
    move-result-object v1

    .line 942
    if-eqz v1, :cond_2d

    .line 943
    .line 944
    instance-of v2, v1, Landroidx/collection/MutableScatterSet;

    .line 945
    .line 946
    if-eqz v2, :cond_2a

    .line 947
    .line 948
    check-cast v1, Landroidx/collection/MutableScatterSet;

    .line 949
    .line 950
    iget-object v2, v1, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 951
    .line 952
    iget-object v1, v1, Landroidx/collection/ScatterSet;->metadata:[J

    .line 953
    .line 954
    array-length v7, v1

    .line 955
    add-int/lit8 v7, v7, -0x2

    .line 956
    .line 957
    if-ltz v7, :cond_2d

    .line 958
    .line 959
    move-wide/from16 v30, v12

    .line 960
    .line 961
    move/from16 v8, v18

    .line 962
    .line 963
    move v13, v11

    .line 964
    :goto_17
    aget-wide v11, v1, v8

    .line 965
    .line 966
    move-object/from16 v32, v1

    .line 967
    .line 968
    move-object/from16 v27, v2

    .line 969
    .line 970
    not-long v1, v11

    .line 971
    shl-long v1, v1, v21

    .line 972
    .line 973
    and-long/2addr v1, v11

    .line 974
    and-long v1, v1, v23

    .line 975
    .line 976
    cmp-long v1, v1, v23

    .line 977
    .line 978
    if-eqz v1, :cond_28

    .line 979
    .line 980
    sub-int v1, v8, v7

    .line 981
    .line 982
    not-int v1, v1

    .line 983
    ushr-int/lit8 v1, v1, 0x1f

    .line 984
    .line 985
    const/16 v26, 0x8

    .line 986
    .line 987
    rsub-int/lit8 v1, v1, 0x8

    .line 988
    .line 989
    move/from16 v2, v18

    .line 990
    .line 991
    :goto_18
    if-ge v2, v1, :cond_27

    .line 992
    .line 993
    and-long v33, v11, v19

    .line 994
    .line 995
    cmp-long v33, v33, v16

    .line 996
    .line 997
    if-gez v33, :cond_26

    .line 998
    .line 999
    shl-int/lit8 v13, v8, 0x3

    .line 1000
    .line 1001
    add-int/2addr v13, v2

    .line 1002
    aget-object v13, v27, v13

    .line 1003
    .line 1004
    invoke-virtual {v5, v13}, Landroidx/collection/MutableScatterSet;->add(Ljava/lang/Object;)Z

    .line 1005
    .line 1006
    .line 1007
    const/4 v13, 0x1

    .line 1008
    :cond_26
    move/from16 v26, v2

    .line 1009
    .line 1010
    const/16 v2, 0x8

    .line 1011
    .line 1012
    shr-long/2addr v11, v2

    .line 1013
    add-int/lit8 v26, v26, 0x1

    .line 1014
    .line 1015
    move/from16 v2, v26

    .line 1016
    .line 1017
    goto :goto_18

    .line 1018
    :cond_27
    const/16 v2, 0x8

    .line 1019
    .line 1020
    if-ne v1, v2, :cond_29

    .line 1021
    .line 1022
    :cond_28
    if-eq v8, v7, :cond_29

    .line 1023
    .line 1024
    add-int/lit8 v8, v8, 0x1

    .line 1025
    .line 1026
    move-object/from16 v2, v27

    .line 1027
    .line 1028
    move-object/from16 v1, v32

    .line 1029
    .line 1030
    goto :goto_17

    .line 1031
    :cond_29
    move v11, v13

    .line 1032
    goto :goto_19

    .line 1033
    :cond_2a
    move-wide/from16 v30, v12

    .line 1034
    .line 1035
    invoke-virtual {v5, v1}, Landroidx/collection/MutableScatterSet;->add(Ljava/lang/Object;)Z

    .line 1036
    .line 1037
    .line 1038
    const/4 v11, 0x1

    .line 1039
    goto :goto_19

    .line 1040
    :cond_2b
    move-wide/from16 v30, v12

    .line 1041
    .line 1042
    iget-object v2, v0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->statesToReread:Landroidx/compose/runtime/collection/MutableVector;

    .line 1043
    .line 1044
    invoke-virtual {v2, v1}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 1045
    .line 1046
    .line 1047
    :goto_19
    const/16 v7, 0x8

    .line 1048
    .line 1049
    goto :goto_1a

    .line 1050
    :cond_2c
    move-object/from16 p1, v1

    .line 1051
    .line 1052
    move-object/from16 v25, v2

    .line 1053
    .line 1054
    move-object/from16 v28, v7

    .line 1055
    .line 1056
    move-object/from16 v29, v8

    .line 1057
    .line 1058
    :cond_2d
    move-wide/from16 v30, v12

    .line 1059
    .line 1060
    goto :goto_19

    .line 1061
    :goto_1a
    shr-long v12, v30, v7

    .line 1062
    .line 1063
    add-int/lit8 v15, v15, 0x1

    .line 1064
    .line 1065
    move-object/from16 v1, p1

    .line 1066
    .line 1067
    move-object/from16 v2, v25

    .line 1068
    .line 1069
    move-object/from16 v7, v28

    .line 1070
    .line 1071
    move-object/from16 v8, v29

    .line 1072
    .line 1073
    goto/16 :goto_16

    .line 1074
    .line 1075
    :cond_2e
    move-object/from16 p1, v1

    .line 1076
    .line 1077
    move-object/from16 v25, v2

    .line 1078
    .line 1079
    move-object/from16 v28, v7

    .line 1080
    .line 1081
    move-object/from16 v29, v8

    .line 1082
    .line 1083
    const/16 v7, 0x8

    .line 1084
    .line 1085
    if-ne v14, v7, :cond_38

    .line 1086
    .line 1087
    goto :goto_1b

    .line 1088
    :cond_2f
    move-object/from16 p1, v1

    .line 1089
    .line 1090
    move-object/from16 v25, v2

    .line 1091
    .line 1092
    move-object/from16 v28, v7

    .line 1093
    .line 1094
    move-object/from16 v29, v8

    .line 1095
    .line 1096
    :goto_1b
    if-eq v10, v9, :cond_38

    .line 1097
    .line 1098
    add-int/lit8 v10, v10, 0x1

    .line 1099
    .line 1100
    move-object/from16 v1, p1

    .line 1101
    .line 1102
    move-object/from16 v2, v25

    .line 1103
    .line 1104
    move-object/from16 v7, v28

    .line 1105
    .line 1106
    move-object/from16 v8, v29

    .line 1107
    .line 1108
    goto/16 :goto_15

    .line 1109
    .line 1110
    :cond_30
    move-object/from16 p1, v1

    .line 1111
    .line 1112
    move-object/from16 v25, v2

    .line 1113
    .line 1114
    check-cast v7, Landroidx/compose/runtime/DerivedState;

    .line 1115
    .line 1116
    invoke-virtual {v3, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v1

    .line 1120
    invoke-interface {v7}, Landroidx/compose/runtime/DerivedState;->getPolicy()Landroidx/compose/runtime/SnapshotMutationPolicy;

    .line 1121
    .line 1122
    .line 1123
    move-result-object v2

    .line 1124
    if-nez v2, :cond_31

    .line 1125
    .line 1126
    invoke-static {}, Landroidx/compose/runtime/SnapshotStateKt;->structuralEqualityPolicy()Landroidx/compose/runtime/SnapshotMutationPolicy;

    .line 1127
    .line 1128
    .line 1129
    move-result-object v2

    .line 1130
    :cond_31
    invoke-interface {v7}, Landroidx/compose/runtime/DerivedState;->getCurrentRecord()Landroidx/compose/runtime/DerivedState$Record;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v8

    .line 1134
    invoke-interface {v8}, Landroidx/compose/runtime/DerivedState$Record;->getCurrentValue()Ljava/lang/Object;

    .line 1135
    .line 1136
    .line 1137
    move-result-object v8

    .line 1138
    invoke-interface {v2, v8, v1}, Landroidx/compose/runtime/SnapshotMutationPolicy;->equivalent(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1139
    .line 1140
    .line 1141
    move-result v1

    .line 1142
    if-nez v1, :cond_36

    .line 1143
    .line 1144
    invoke-virtual {v4, v7}, Landroidx/collection/ScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v1

    .line 1148
    if-eqz v1, :cond_38

    .line 1149
    .line 1150
    instance-of v2, v1, Landroidx/collection/MutableScatterSet;

    .line 1151
    .line 1152
    if-eqz v2, :cond_35

    .line 1153
    .line 1154
    check-cast v1, Landroidx/collection/MutableScatterSet;

    .line 1155
    .line 1156
    iget-object v2, v1, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 1157
    .line 1158
    iget-object v1, v1, Landroidx/collection/ScatterSet;->metadata:[J

    .line 1159
    .line 1160
    array-length v7, v1

    .line 1161
    add-int/lit8 v7, v7, -0x2

    .line 1162
    .line 1163
    if-ltz v7, :cond_38

    .line 1164
    .line 1165
    move/from16 v8, v18

    .line 1166
    .line 1167
    :goto_1c
    aget-wide v9, v1, v8

    .line 1168
    .line 1169
    not-long v12, v9

    .line 1170
    shl-long v12, v12, v21

    .line 1171
    .line 1172
    and-long/2addr v12, v9

    .line 1173
    and-long v12, v12, v23

    .line 1174
    .line 1175
    cmp-long v12, v12, v23

    .line 1176
    .line 1177
    if-eqz v12, :cond_34

    .line 1178
    .line 1179
    sub-int v12, v8, v7

    .line 1180
    .line 1181
    not-int v12, v12

    .line 1182
    ushr-int/lit8 v12, v12, 0x1f

    .line 1183
    .line 1184
    const/16 v26, 0x8

    .line 1185
    .line 1186
    rsub-int/lit8 v12, v12, 0x8

    .line 1187
    .line 1188
    move/from16 v13, v18

    .line 1189
    .line 1190
    :goto_1d
    if-ge v13, v12, :cond_33

    .line 1191
    .line 1192
    and-long v14, v9, v19

    .line 1193
    .line 1194
    cmp-long v14, v14, v16

    .line 1195
    .line 1196
    if-gez v14, :cond_32

    .line 1197
    .line 1198
    shl-int/lit8 v11, v8, 0x3

    .line 1199
    .line 1200
    add-int/2addr v11, v13

    .line 1201
    aget-object v11, v2, v11

    .line 1202
    .line 1203
    invoke-virtual {v5, v11}, Landroidx/collection/MutableScatterSet;->add(Ljava/lang/Object;)Z

    .line 1204
    .line 1205
    .line 1206
    const/4 v11, 0x1

    .line 1207
    :cond_32
    const/16 v14, 0x8

    .line 1208
    .line 1209
    shr-long/2addr v9, v14

    .line 1210
    add-int/lit8 v13, v13, 0x1

    .line 1211
    .line 1212
    goto :goto_1d

    .line 1213
    :cond_33
    const/16 v14, 0x8

    .line 1214
    .line 1215
    if-ne v12, v14, :cond_38

    .line 1216
    .line 1217
    :cond_34
    if-eq v8, v7, :cond_38

    .line 1218
    .line 1219
    add-int/lit8 v8, v8, 0x1

    .line 1220
    .line 1221
    goto :goto_1c

    .line 1222
    :cond_35
    invoke-virtual {v5, v1}, Landroidx/collection/MutableScatterSet;->add(Ljava/lang/Object;)Z

    .line 1223
    .line 1224
    .line 1225
    const/4 v11, 0x1

    .line 1226
    goto :goto_1e

    .line 1227
    :cond_36
    iget-object v1, v0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->statesToReread:Landroidx/compose/runtime/collection/MutableVector;

    .line 1228
    .line 1229
    invoke-virtual {v1, v7}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 1230
    .line 1231
    .line 1232
    goto :goto_1e

    .line 1233
    :cond_37
    move-object/from16 p1, v1

    .line 1234
    .line 1235
    move-object/from16 v25, v2

    .line 1236
    .line 1237
    :cond_38
    :goto_1e
    invoke-virtual {v4, v6}, Landroidx/collection/ScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1238
    .line 1239
    .line 1240
    move-result-object v1

    .line 1241
    if-eqz v1, :cond_23

    .line 1242
    .line 1243
    instance-of v2, v1, Landroidx/collection/MutableScatterSet;

    .line 1244
    .line 1245
    if-eqz v2, :cond_3c

    .line 1246
    .line 1247
    check-cast v1, Landroidx/collection/MutableScatterSet;

    .line 1248
    .line 1249
    iget-object v2, v1, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 1250
    .line 1251
    iget-object v1, v1, Landroidx/collection/ScatterSet;->metadata:[J

    .line 1252
    .line 1253
    array-length v6, v1

    .line 1254
    add-int/lit8 v6, v6, -0x2

    .line 1255
    .line 1256
    if-ltz v6, :cond_23

    .line 1257
    .line 1258
    move/from16 v7, v18

    .line 1259
    .line 1260
    :goto_1f
    aget-wide v8, v1, v7

    .line 1261
    .line 1262
    not-long v12, v8

    .line 1263
    shl-long v12, v12, v21

    .line 1264
    .line 1265
    and-long/2addr v12, v8

    .line 1266
    and-long v12, v12, v23

    .line 1267
    .line 1268
    cmp-long v10, v12, v23

    .line 1269
    .line 1270
    if-eqz v10, :cond_3b

    .line 1271
    .line 1272
    sub-int v10, v7, v6

    .line 1273
    .line 1274
    not-int v10, v10

    .line 1275
    ushr-int/lit8 v10, v10, 0x1f

    .line 1276
    .line 1277
    const/16 v26, 0x8

    .line 1278
    .line 1279
    rsub-int/lit8 v10, v10, 0x8

    .line 1280
    .line 1281
    move/from16 v12, v18

    .line 1282
    .line 1283
    :goto_20
    if-ge v12, v10, :cond_3a

    .line 1284
    .line 1285
    and-long v13, v8, v19

    .line 1286
    .line 1287
    cmp-long v13, v13, v16

    .line 1288
    .line 1289
    if-gez v13, :cond_39

    .line 1290
    .line 1291
    shl-int/lit8 v11, v7, 0x3

    .line 1292
    .line 1293
    add-int/2addr v11, v12

    .line 1294
    aget-object v11, v2, v11

    .line 1295
    .line 1296
    invoke-virtual {v5, v11}, Landroidx/collection/MutableScatterSet;->add(Ljava/lang/Object;)Z

    .line 1297
    .line 1298
    .line 1299
    const/4 v11, 0x1

    .line 1300
    :cond_39
    const/16 v14, 0x8

    .line 1301
    .line 1302
    shr-long/2addr v8, v14

    .line 1303
    add-int/lit8 v12, v12, 0x1

    .line 1304
    .line 1305
    goto :goto_20

    .line 1306
    :cond_3a
    const/16 v14, 0x8

    .line 1307
    .line 1308
    if-ne v10, v14, :cond_3d

    .line 1309
    .line 1310
    goto :goto_21

    .line 1311
    :cond_3b
    const/16 v14, 0x8

    .line 1312
    .line 1313
    :goto_21
    if-eq v7, v6, :cond_3d

    .line 1314
    .line 1315
    add-int/lit8 v7, v7, 0x1

    .line 1316
    .line 1317
    goto :goto_1f

    .line 1318
    :cond_3c
    const/16 v14, 0x8

    .line 1319
    .line 1320
    invoke-virtual {v5, v1}, Landroidx/collection/MutableScatterSet;->add(Ljava/lang/Object;)Z

    .line 1321
    .line 1322
    .line 1323
    const/4 v11, 0x1

    .line 1324
    :cond_3d
    :goto_22
    move-object/from16 v1, p1

    .line 1325
    .line 1326
    move-object/from16 v2, v25

    .line 1327
    .line 1328
    goto/16 :goto_14

    .line 1329
    .line 1330
    :cond_3e
    :goto_23
    iget-object v1, v0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->statesToReread:Landroidx/compose/runtime/collection/MutableVector;

    .line 1331
    .line 1332
    invoke-virtual {v1}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 1333
    .line 1334
    .line 1335
    move-result v1

    .line 1336
    if-eqz v1, :cond_40

    .line 1337
    .line 1338
    iget-object v1, v0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->statesToReread:Landroidx/compose/runtime/collection/MutableVector;

    .line 1339
    .line 1340
    iget-object v2, v1, Landroidx/compose/runtime/collection/MutableVector;->content:[Ljava/lang/Object;

    .line 1341
    .line 1342
    invoke-virtual {v1}, Landroidx/compose/runtime/collection/MutableVector;->getSize()I

    .line 1343
    .line 1344
    .line 1345
    move-result v1

    .line 1346
    move/from16 v3, v18

    .line 1347
    .line 1348
    :goto_24
    if-ge v3, v1, :cond_3f

    .line 1349
    .line 1350
    aget-object v4, v2, v3

    .line 1351
    .line 1352
    check-cast v4, Landroidx/compose/runtime/DerivedState;

    .line 1353
    .line 1354
    invoke-virtual {v0, v4}, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->rereadDerivedState(Landroidx/compose/runtime/DerivedState;)V

    .line 1355
    .line 1356
    .line 1357
    add-int/lit8 v3, v3, 0x1

    .line 1358
    .line 1359
    goto :goto_24

    .line 1360
    :cond_3f
    iget-object v1, v0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->statesToReread:Landroidx/compose/runtime/collection/MutableVector;

    .line 1361
    .line 1362
    invoke-virtual {v1}, Landroidx/compose/runtime/collection/MutableVector;->clear()V

    .line 1363
    .line 1364
    .line 1365
    :cond_40
    return v11
.end method

.method public final recordRead(Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->currentScope:Ljava/lang/Object;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 2
    iget v1, p0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->currentToken:I

    .line 3
    iget-object v2, p0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->currentScopeReads:Landroidx/collection/MutableObjectIntMap;

    if-nez v2, :cond_0

    .line 4
    new-instance v2, Landroidx/collection/MutableObjectIntMap;

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct {v2, v5, v3, v4}, Landroidx/collection/MutableObjectIntMap;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    iput-object v2, p0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->currentScopeReads:Landroidx/collection/MutableObjectIntMap;

    .line 6
    iget-object v3, p0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->scopeToValues:Landroidx/collection/MutableScatterMap;

    invoke-virtual {v3, v0, v2}, Landroidx/collection/MutableScatterMap;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 7
    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 8
    :cond_0
    invoke-direct {p0, p1, v1, v0, v2}, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->recordRead(Ljava/lang/Object;ILjava/lang/Object;Landroidx/collection/MutableObjectIntMap;)V

    return-void
.end method

.method public final removeScopeIf(Lkotlin/jvm/functions/Function1;)V
    .locals 33
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Object;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->scopeToValues:Landroidx/collection/MutableScatterMap;

    .line 4
    .line 5
    iget-object v2, v1, Landroidx/collection/ScatterMap;->metadata:[J

    .line 6
    .line 7
    array-length v3, v2

    .line 8
    add-int/lit8 v3, v3, -0x2

    .line 9
    .line 10
    if-ltz v3, :cond_9

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    :goto_0
    aget-wide v6, v2, v5

    .line 14
    .line 15
    not-long v8, v6

    .line 16
    const/4 v10, 0x7

    .line 17
    shl-long/2addr v8, v10

    .line 18
    and-long/2addr v8, v6

    .line 19
    const-wide v11, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    and-long/2addr v8, v11

    .line 25
    cmp-long v8, v8, v11

    .line 26
    .line 27
    if-eqz v8, :cond_8

    .line 28
    .line 29
    sub-int v8, v5, v3

    .line 30
    .line 31
    not-int v8, v8

    .line 32
    ushr-int/lit8 v8, v8, 0x1f

    .line 33
    .line 34
    const/16 v9, 0x8

    .line 35
    .line 36
    rsub-int/lit8 v8, v8, 0x8

    .line 37
    .line 38
    const/4 v13, 0x0

    .line 39
    :goto_1
    if-ge v13, v8, :cond_7

    .line 40
    .line 41
    const-wide/16 v14, 0xff

    .line 42
    .line 43
    and-long v16, v6, v14

    .line 44
    .line 45
    const-wide/16 v18, 0x80

    .line 46
    .line 47
    cmp-long v16, v16, v18

    .line 48
    .line 49
    if-gez v16, :cond_6

    .line 50
    .line 51
    shl-int/lit8 v16, v5, 0x3

    .line 52
    .line 53
    add-int v4, v16, v13

    .line 54
    .line 55
    move/from16 v16, v10

    .line 56
    .line 57
    iget-object v10, v1, Landroidx/collection/ScatterMap;->keys:[Ljava/lang/Object;

    .line 58
    .line 59
    aget-object v10, v10, v4

    .line 60
    .line 61
    move-wide/from16 v20, v11

    .line 62
    .line 63
    iget-object v11, v1, Landroidx/collection/ScatterMap;->values:[Ljava/lang/Object;

    .line 64
    .line 65
    aget-object v11, v11, v4

    .line 66
    .line 67
    check-cast v11, Landroidx/collection/MutableObjectIntMap;

    .line 68
    .line 69
    move-object/from16 v12, p1

    .line 70
    .line 71
    invoke-interface {v12, v10}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v22

    .line 75
    check-cast v22, Ljava/lang/Boolean;

    .line 76
    .line 77
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Boolean;->booleanValue()Z

    .line 78
    .line 79
    .line 80
    move-result v23

    .line 81
    if-eqz v23, :cond_3

    .line 82
    .line 83
    move-wide/from16 v23, v14

    .line 84
    .line 85
    iget-object v14, v11, Landroidx/collection/ObjectIntMap;->keys:[Ljava/lang/Object;

    .line 86
    .line 87
    iget-object v15, v11, Landroidx/collection/ObjectIntMap;->values:[I

    .line 88
    .line 89
    iget-object v11, v11, Landroidx/collection/ObjectIntMap;->metadata:[J

    .line 90
    .line 91
    move/from16 v25, v9

    .line 92
    .line 93
    array-length v9, v11

    .line 94
    add-int/lit8 v9, v9, -0x2

    .line 95
    .line 96
    if-ltz v9, :cond_3

    .line 97
    .line 98
    move-object/from16 v26, v2

    .line 99
    .line 100
    move-wide/from16 v27, v6

    .line 101
    .line 102
    const/4 v2, 0x0

    .line 103
    :goto_2
    aget-wide v6, v11, v2

    .line 104
    .line 105
    move-object/from16 v29, v11

    .line 106
    .line 107
    not-long v11, v6

    .line 108
    shl-long v11, v11, v16

    .line 109
    .line 110
    and-long/2addr v11, v6

    .line 111
    and-long v11, v11, v20

    .line 112
    .line 113
    cmp-long v11, v11, v20

    .line 114
    .line 115
    if-eqz v11, :cond_2

    .line 116
    .line 117
    sub-int v11, v2, v9

    .line 118
    .line 119
    not-int v11, v11

    .line 120
    ushr-int/lit8 v11, v11, 0x1f

    .line 121
    .line 122
    rsub-int/lit8 v11, v11, 0x8

    .line 123
    .line 124
    const/4 v12, 0x0

    .line 125
    :goto_3
    if-ge v12, v11, :cond_1

    .line 126
    .line 127
    and-long v30, v6, v23

    .line 128
    .line 129
    cmp-long v30, v30, v18

    .line 130
    .line 131
    if-gez v30, :cond_0

    .line 132
    .line 133
    shl-int/lit8 v30, v2, 0x3

    .line 134
    .line 135
    add-int v30, v30, v12

    .line 136
    .line 137
    move-wide/from16 v31, v6

    .line 138
    .line 139
    aget-object v6, v14, v30

    .line 140
    .line 141
    aget v7, v15, v30

    .line 142
    .line 143
    invoke-direct {v0, v10, v6}, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->removeObservation(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_0
    move-wide/from16 v31, v6

    .line 148
    .line 149
    :goto_4
    shr-long v6, v31, v25

    .line 150
    .line 151
    add-int/lit8 v12, v12, 0x1

    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_1
    move/from16 v6, v25

    .line 155
    .line 156
    if-ne v11, v6, :cond_4

    .line 157
    .line 158
    :cond_2
    if-eq v2, v9, :cond_4

    .line 159
    .line 160
    add-int/lit8 v2, v2, 0x1

    .line 161
    .line 162
    move-object/from16 v12, p1

    .line 163
    .line 164
    move-object/from16 v11, v29

    .line 165
    .line 166
    const/16 v25, 0x8

    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_3
    move-object/from16 v26, v2

    .line 170
    .line 171
    move-wide/from16 v27, v6

    .line 172
    .line 173
    :cond_4
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Boolean;->booleanValue()Z

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    if-eqz v2, :cond_5

    .line 178
    .line 179
    invoke-virtual {v1, v4}, Landroidx/collection/MutableScatterMap;->removeValueAt(I)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    :cond_5
    const/16 v6, 0x8

    .line 183
    .line 184
    goto :goto_5

    .line 185
    :cond_6
    move-object/from16 v26, v2

    .line 186
    .line 187
    move-wide/from16 v27, v6

    .line 188
    .line 189
    move/from16 v16, v10

    .line 190
    .line 191
    move-wide/from16 v20, v11

    .line 192
    .line 193
    move v6, v9

    .line 194
    :goto_5
    shr-long v9, v27, v6

    .line 195
    .line 196
    add-int/lit8 v13, v13, 0x1

    .line 197
    .line 198
    move-wide v11, v9

    .line 199
    move v9, v6

    .line 200
    move-wide v6, v11

    .line 201
    move/from16 v10, v16

    .line 202
    .line 203
    move-wide/from16 v11, v20

    .line 204
    .line 205
    move-object/from16 v2, v26

    .line 206
    .line 207
    goto/16 :goto_1

    .line 208
    .line 209
    :cond_7
    move-object/from16 v26, v2

    .line 210
    .line 211
    move v6, v9

    .line 212
    if-ne v8, v6, :cond_9

    .line 213
    .line 214
    goto :goto_6

    .line 215
    :cond_8
    move-object/from16 v26, v2

    .line 216
    .line 217
    :goto_6
    if-eq v5, v3, :cond_9

    .line 218
    .line 219
    add-int/lit8 v5, v5, 0x1

    .line 220
    .line 221
    move-object/from16 v2, v26

    .line 222
    .line 223
    goto/16 :goto_0

    .line 224
    .line 225
    :cond_9
    return-void
.end method

.method public final rereadDerivedState(Landroidx/compose/runtime/DerivedState;)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/DerivedState<",
            "*>;)V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->scopeToValues:Landroidx/collection/MutableScatterMap;

    .line 6
    .line 7
    invoke-static {}, Landroidx/compose/runtime/snapshots/SnapshotKt;->currentSnapshot()Landroidx/compose/runtime/snapshots/Snapshot;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-virtual {v3}, Landroidx/compose/runtime/snapshots/Snapshot;->getSnapshotId()J

    .line 12
    .line 13
    .line 14
    move-result-wide v3

    .line 15
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    iget-object v4, v0, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->valueToScopes:Landroidx/collection/MutableScatterMap;

    .line 20
    .line 21
    invoke-virtual {v4, v1}, Landroidx/collection/ScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    if-eqz v4, :cond_6

    .line 26
    .line 27
    instance-of v5, v4, Landroidx/collection/MutableScatterSet;

    .line 28
    .line 29
    const/4 v6, 0x0

    .line 30
    const/4 v7, 0x1

    .line 31
    const/4 v8, 0x0

    .line 32
    if-eqz v5, :cond_4

    .line 33
    .line 34
    check-cast v4, Landroidx/collection/MutableScatterSet;

    .line 35
    .line 36
    iget-object v5, v4, Landroidx/collection/ScatterSet;->elements:[Ljava/lang/Object;

    .line 37
    .line 38
    iget-object v4, v4, Landroidx/collection/ScatterSet;->metadata:[J

    .line 39
    .line 40
    array-length v9, v4

    .line 41
    add-int/lit8 v9, v9, -0x2

    .line 42
    .line 43
    if-ltz v9, :cond_6

    .line 44
    .line 45
    move v10, v8

    .line 46
    :goto_0
    aget-wide v11, v4, v10

    .line 47
    .line 48
    not-long v13, v11

    .line 49
    const/4 v15, 0x7

    .line 50
    shl-long/2addr v13, v15

    .line 51
    and-long/2addr v13, v11

    .line 52
    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    and-long/2addr v13, v15

    .line 58
    cmp-long v13, v13, v15

    .line 59
    .line 60
    if-eqz v13, :cond_3

    .line 61
    .line 62
    sub-int v13, v10, v9

    .line 63
    .line 64
    not-int v13, v13

    .line 65
    ushr-int/lit8 v13, v13, 0x1f

    .line 66
    .line 67
    const/16 v14, 0x8

    .line 68
    .line 69
    rsub-int/lit8 v13, v13, 0x8

    .line 70
    .line 71
    move v15, v8

    .line 72
    :goto_1
    if-ge v15, v13, :cond_2

    .line 73
    .line 74
    const-wide/16 v16, 0xff

    .line 75
    .line 76
    and-long v16, v11, v16

    .line 77
    .line 78
    const-wide/16 v18, 0x80

    .line 79
    .line 80
    cmp-long v16, v16, v18

    .line 81
    .line 82
    if-gez v16, :cond_1

    .line 83
    .line 84
    shl-int/lit8 v16, v10, 0x3

    .line 85
    .line 86
    add-int v16, v16, v15

    .line 87
    .line 88
    move/from16 v17, v14

    .line 89
    .line 90
    aget-object v14, v5, v16

    .line 91
    .line 92
    invoke-virtual {v2, v14}, Landroidx/collection/ScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v16

    .line 96
    check-cast v16, Landroidx/collection/MutableObjectIntMap;

    .line 97
    .line 98
    move-object/from16 v18, v4

    .line 99
    .line 100
    if-nez v16, :cond_0

    .line 101
    .line 102
    new-instance v4, Landroidx/collection/MutableObjectIntMap;

    .line 103
    .line 104
    invoke-direct {v4, v8, v7, v6}, Landroidx/collection/MutableObjectIntMap;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2, v14, v4}, Landroidx/collection/MutableScatterMap;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    sget-object v16, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_0
    move-object/from16 v4, v16

    .line 114
    .line 115
    :goto_2
    invoke-direct {v0, v1, v3, v14, v4}, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->recordRead(Ljava/lang/Object;ILjava/lang/Object;Landroidx/collection/MutableObjectIntMap;)V

    .line 116
    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_1
    move-object/from16 v18, v4

    .line 120
    .line 121
    move/from16 v17, v14

    .line 122
    .line 123
    :goto_3
    shr-long v11, v11, v17

    .line 124
    .line 125
    add-int/lit8 v15, v15, 0x1

    .line 126
    .line 127
    move/from16 v14, v17

    .line 128
    .line 129
    move-object/from16 v4, v18

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_2
    move-object/from16 v18, v4

    .line 133
    .line 134
    move v4, v14

    .line 135
    if-ne v13, v4, :cond_6

    .line 136
    .line 137
    goto :goto_4

    .line 138
    :cond_3
    move-object/from16 v18, v4

    .line 139
    .line 140
    :goto_4
    if-eq v10, v9, :cond_6

    .line 141
    .line 142
    add-int/lit8 v10, v10, 0x1

    .line 143
    .line 144
    move-object/from16 v4, v18

    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_4
    invoke-virtual {v2, v4}, Landroidx/collection/ScatterMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    check-cast v5, Landroidx/collection/MutableObjectIntMap;

    .line 152
    .line 153
    if-nez v5, :cond_5

    .line 154
    .line 155
    new-instance v5, Landroidx/collection/MutableObjectIntMap;

    .line 156
    .line 157
    invoke-direct {v5, v8, v7, v6}, Landroidx/collection/MutableObjectIntMap;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v2, v4, v5}, Landroidx/collection/MutableScatterMap;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 164
    .line 165
    :cond_5
    invoke-direct {v0, v1, v3, v4, v5}, Landroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap;->recordRead(Ljava/lang/Object;ILjava/lang/Object;Landroidx/collection/MutableObjectIntMap;)V

    .line 166
    .line 167
    .line 168
    :cond_6
    return-void
.end method
