.class public abstract Landroidx/constraintlayout/compose/BaseKeyFrameScope;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation build Landroidx/constraintlayout/compose/ExperimentalMotionApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001B\u0007\u0008\u0004\u00a2\u0006\u0002\u0010\u0002J3\u0010\t\u001a\u0008\u0012\u0004\u0012\u0002H\u000b0\n\"\n\u0008\u0000\u0010\u000b*\u0004\u0018\u00010\u000c2\u0006\u0010\r\u001a\u0002H\u000b2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0004\u00a2\u0006\u0002\u0010\u000fJ-\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u0002H\u00110\n\"\u0004\u0008\u0000\u0010\u00112\u0006\u0010\r\u001a\u0002H\u00112\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0004\u00a2\u0006\u0002\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0000\u00a2\u0006\u0002\u0008\u0017J \u0010\u0018\u001a\u00020\u0014*\u00020\u00162\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u001aH\u0002R \u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u001a\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0001\u0004\u001b\u001c\u001d\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Landroidx/constraintlayout/compose/BaseKeyFrameScope;",
        "",
        "()V",
        "customPropertiesValue",
        "",
        "",
        "getCustomPropertiesValue$constraintlayout_compose_release",
        "()Ljava/util/Map;",
        "keyFramePropertiesValue",
        "addNameOnPropertyChange",
        "Lkotlin/properties/ObservableProperty;",
        "E",
        "Landroidx/constraintlayout/compose/NamedPropertyOrValue;",
        "initialValue",
        "nameOverride",
        "(Landroidx/constraintlayout/compose/NamedPropertyOrValue;Ljava/lang/String;)Lkotlin/properties/ObservableProperty;",
        "addOnPropertyChange",
        "T",
        "(Ljava/lang/Object;Ljava/lang/String;)Lkotlin/properties/ObservableProperty;",
        "addToContainer",
        "",
        "container",
        "Landroidx/constraintlayout/core/parser/CLContainer;",
        "addToContainer$constraintlayout_compose_release",
        "putValuesAsArrayElements",
        "propertiesSource",
        "",
        "Landroidx/constraintlayout/compose/FakeKeyFrameScope;",
        "Landroidx/constraintlayout/compose/KeyAttributeScope;",
        "Landroidx/constraintlayout/compose/KeyCycleScope;",
        "Landroidx/constraintlayout/compose/KeyPositionScope;",
        "constraintlayout-compose_release"
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
        "SMAP\nTransitionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransitionScope.kt\nandroidx/constraintlayout/compose/BaseKeyFrameScope\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,969:1\n215#2,2:970\n*S KotlinDebug\n*F\n+ 1 TransitionScope.kt\nandroidx/constraintlayout/compose/BaseKeyFrameScope\n*L\n488#1:970,2\n*E\n"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final customPropertiesValue:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final keyFramePropertiesValue:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/compose/BaseKeyFrameScope;->keyFramePropertiesValue:Ljava/util/Map;

    .line 4
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/compose/BaseKeyFrameScope;->customPropertiesValue:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/constraintlayout/compose/BaseKeyFrameScope;-><init>()V

    return-void
.end method

.method public static final synthetic access$getKeyFramePropertiesValue$p(Landroidx/constraintlayout/compose/BaseKeyFrameScope;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/constraintlayout/compose/BaseKeyFrameScope;->keyFramePropertiesValue:Ljava/util/Map;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic addNameOnPropertyChange$default(Landroidx/constraintlayout/compose/BaseKeyFrameScope;Landroidx/constraintlayout/compose/NamedPropertyOrValue;Ljava/lang/String;ILjava/lang/Object;)Lkotlin/properties/ObservableProperty;
    .locals 0

    .line 1
    if-nez p4, :cond_1

    .line 2
    .line 3
    and-int/lit8 p3, p3, 0x2

    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    const/4 p2, 0x0

    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2}, Landroidx/constraintlayout/compose/BaseKeyFrameScope;->addNameOnPropertyChange(Landroidx/constraintlayout/compose/NamedPropertyOrValue;Ljava/lang/String;)Lkotlin/properties/ObservableProperty;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 14
    .line 15
    const-string p1, "Super calls with default arguments not supported in this target, function: addNameOnPropertyChange"

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0
.end method

.method public static synthetic addOnPropertyChange$default(Landroidx/constraintlayout/compose/BaseKeyFrameScope;Ljava/lang/Object;Ljava/lang/String;ILjava/lang/Object;)Lkotlin/properties/ObservableProperty;
    .locals 0

    .line 1
    if-nez p4, :cond_1

    .line 2
    .line 3
    and-int/lit8 p3, p3, 0x2

    .line 4
    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    const/4 p2, 0x0

    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2}, Landroidx/constraintlayout/compose/BaseKeyFrameScope;->addOnPropertyChange(Ljava/lang/Object;Ljava/lang/String;)Lkotlin/properties/ObservableProperty;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 14
    .line 15
    const-string p1, "Super calls with default arguments not supported in this target, function: addOnPropertyChange"

    .line 16
    .line 17
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw p0
.end method

.method private final putValuesAsArrayElements(Landroidx/constraintlayout/core/parser/CLContainer;Ljava/util/Map;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/constraintlayout/core/parser/CLContainer;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ljava/util/Map$Entry;

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Ljava/lang/String;

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p1, v1}, Landroidx/constraintlayout/core/parser/CLContainer;->getArrayOrCreate(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLArray;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    instance-of v2, v0, Ljava/lang/String;

    .line 36
    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    check-cast v0, Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    const-string/jumbo v2, "this as java.lang.String).toCharArray()"

    .line 46
    .line 47
    .line 48
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    new-instance v2, Landroidx/constraintlayout/core/parser/CLString;

    .line 52
    .line 53
    invoke-direct {v2, v0}, Landroidx/constraintlayout/core/parser/CLString;-><init>([C)V

    .line 54
    .line 55
    .line 56
    const-wide/16 v3, 0x0

    .line 57
    .line 58
    invoke-virtual {v2, v3, v4}, Landroidx/constraintlayout/core/parser/CLElement;->setStart(J)V

    .line 59
    .line 60
    .line 61
    array-length v0, v0

    .line 62
    int-to-long v3, v0

    .line 63
    const-wide/16 v5, 0x1

    .line 64
    .line 65
    sub-long/2addr v3, v5

    .line 66
    invoke-virtual {v2, v3, v4}, Landroidx/constraintlayout/core/parser/CLElement;->setEnd(J)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, v2}, Landroidx/constraintlayout/core/parser/CLContainer;->add(Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    instance-of v2, v0, Landroidx/compose/ui/unit/Dp;

    .line 74
    .line 75
    if-eqz v2, :cond_2

    .line 76
    .line 77
    new-instance v2, Landroidx/constraintlayout/core/parser/CLNumber;

    .line 78
    .line 79
    check-cast v0, Landroidx/compose/ui/unit/Dp;

    .line 80
    .line 81
    invoke-virtual {v0}, Landroidx/compose/ui/unit/Dp;->unbox-impl()F

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    invoke-direct {v2, v0}, Landroidx/constraintlayout/core/parser/CLNumber;-><init>(F)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1, v2}, Landroidx/constraintlayout/core/parser/CLContainer;->add(Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_2
    instance-of v2, v0, Ljava/lang/Number;

    .line 93
    .line 94
    if-eqz v2, :cond_0

    .line 95
    .line 96
    new-instance v2, Landroidx/constraintlayout/core/parser/CLNumber;

    .line 97
    .line 98
    check-cast v0, Ljava/lang/Number;

    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    invoke-direct {v2, v0}, Landroidx/constraintlayout/core/parser/CLNumber;-><init>(F)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1, v2}, Landroidx/constraintlayout/core/parser/CLContainer;->add(Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_3
    return-void
.end method


# virtual methods
.method public final addNameOnPropertyChange(Landroidx/constraintlayout/compose/NamedPropertyOrValue;Ljava/lang/String;)Lkotlin/properties/ObservableProperty;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Landroidx/constraintlayout/compose/NamedPropertyOrValue;",
            ">(TE;",
            "Ljava/lang/String;",
            ")",
            "Lkotlin/properties/ObservableProperty<",
            "TE;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/constraintlayout/compose/BaseKeyFrameScope$addNameOnPropertyChange$1;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p0}, Landroidx/constraintlayout/compose/BaseKeyFrameScope$addNameOnPropertyChange$1;-><init>(Landroidx/constraintlayout/compose/NamedPropertyOrValue;Ljava/lang/String;Landroidx/constraintlayout/compose/BaseKeyFrameScope;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final addOnPropertyChange(Ljava/lang/Object;Ljava/lang/String;)Lkotlin/properties/ObservableProperty;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Ljava/lang/String;",
            ")",
            "Lkotlin/properties/ObservableProperty<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/constraintlayout/compose/BaseKeyFrameScope$addOnPropertyChange$1;

    .line 2
    .line 3
    invoke-direct {v0, p1, p0, p2}, Landroidx/constraintlayout/compose/BaseKeyFrameScope$addOnPropertyChange$1;-><init>(Ljava/lang/Object;Landroidx/constraintlayout/compose/BaseKeyFrameScope;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final addToContainer$constraintlayout_compose_release(Landroidx/constraintlayout/core/parser/CLContainer;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/BaseKeyFrameScope;->keyFramePropertiesValue:Ljava/util/Map;

    .line 2
    .line 3
    invoke-direct {p0, p1, v0}, Landroidx/constraintlayout/compose/BaseKeyFrameScope;->putValuesAsArrayElements(Landroidx/constraintlayout/core/parser/CLContainer;Ljava/util/Map;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "custom"

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroidx/constraintlayout/core/parser/CLContainer;->getObjectOrNull(Ljava/lang/String;)Landroidx/constraintlayout/core/parser/CLObject;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    new-instance v1, Landroidx/constraintlayout/core/parser/CLObject;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    new-array v2, v2, [C

    .line 18
    .line 19
    invoke-direct {v1, v2}, Landroidx/constraintlayout/core/parser/CLObject;-><init>([C)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v0, v1}, Landroidx/constraintlayout/core/parser/CLContainer;->put(Ljava/lang/String;Landroidx/constraintlayout/core/parser/CLElement;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object p1, p0, Landroidx/constraintlayout/compose/BaseKeyFrameScope;->customPropertiesValue:Ljava/util/Map;

    .line 26
    .line 27
    invoke-direct {p0, v1, p1}, Landroidx/constraintlayout/compose/BaseKeyFrameScope;->putValuesAsArrayElements(Landroidx/constraintlayout/core/parser/CLContainer;Ljava/util/Map;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final getCustomPropertiesValue$constraintlayout_compose_release()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/compose/BaseKeyFrameScope;->customPropertiesValue:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method
