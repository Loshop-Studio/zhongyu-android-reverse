.class public final Landroidx/compose/runtime/collection/IdentityScopeMap;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010\u0015\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\u0008\u0000\u0018\u0000*\u0008\u0008\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001b\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00028\u0000\u00a2\u0006\u0002\u0010&J\u0006\u0010\'\u001a\u00020(J\u0011\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020\u0002H\u0086\u0002J\u0012\u0010+\u001a\u00020\u000e2\u0008\u0010$\u001a\u0004\u0018\u00010\u0002H\u0002J\"\u0010,\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u000e2\u0008\u0010$\u001a\u0004\u0018\u00010\u00022\u0006\u0010.\u001a\u00020\u000eH\u0002J7\u0010/\u001a\u00020(2\u0006\u0010$\u001a\u00020\u00022!\u00100\u001a\u001d\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u00082\u0012\u0008\u00083\u0012\u0004\u0008\u0008(%\u0012\u0004\u0012\u00020(01H\u0086\u0008\u00f8\u0001\u0000J\u0016\u00104\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010$\u001a\u00020\u0002H\u0002J\u001b\u00105\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00028\u0000\u00a2\u0006\u0002\u0010&J\u0013\u00106\u001a\u00020(2\u0006\u0010%\u001a\u00028\u0000\u00a2\u0006\u0002\u00107J/\u00108\u001a\u00020(2!\u00109\u001a\u001d\u0012\u0013\u0012\u00118\u0000\u00a2\u0006\u000c\u00082\u0012\u0008\u00083\u0012\u0004\u0008\u0008(%\u0012\u0004\u0012\u00020#01H\u0086\u0008\u00f8\u0001\u0000J#\u0010:\u001a\u00020(2\u0018\u0010;\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020(01H\u0082\u0008J\u0016\u0010<\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010=\u001a\u00020\u000eH\u0002J\u0011\u0010>\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u000eH\u0082\u0008R4\u0010\u0004\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00060\u00058\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0016\n\u0002\u0010\u000c\u0012\u0004\u0008\u0007\u0010\u0003\u001a\u0004\u0008\u0008\u0010\t\"\u0004\u0008\n\u0010\u000bR$\u0010\r\u001a\u00020\u000e8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\u0008\u000f\u0010\u0003\u001a\u0004\u0008\u0010\u0010\u0011\"\u0004\u0008\u0012\u0010\u0013R$\u0010\u0014\u001a\u00020\u00158\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\u0008\u0016\u0010\u0003\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001aR.\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00058\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0016\n\u0002\u0010!\u0012\u0004\u0008\u001c\u0010\u0003\u001a\u0004\u0008\u001d\u0010\u001e\"\u0004\u0008\u001f\u0010 \u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006?"
    }
    d2 = {
        "Landroidx/compose/runtime/collection/IdentityScopeMap;",
        "T",
        "",
        "()V",
        "scopeSets",
        "",
        "Landroidx/compose/runtime/collection/IdentityArraySet;",
        "getScopeSets$annotations",
        "getScopeSets",
        "()[Landroidx/compose/runtime/collection/IdentityArraySet;",
        "setScopeSets",
        "([Landroidx/compose/runtime/collection/IdentityArraySet;)V",
        "[Landroidx/compose/runtime/collection/IdentityArraySet;",
        "size",
        "",
        "getSize$annotations",
        "getSize",
        "()I",
        "setSize",
        "(I)V",
        "valueOrder",
        "",
        "getValueOrder$annotations",
        "getValueOrder",
        "()[I",
        "setValueOrder",
        "([I)V",
        "values",
        "getValues$annotations",
        "getValues",
        "()[Ljava/lang/Object;",
        "setValues",
        "([Ljava/lang/Object;)V",
        "[Ljava/lang/Object;",
        "add",
        "",
        "value",
        "scope",
        "(Ljava/lang/Object;Ljava/lang/Object;)Z",
        "clear",
        "",
        "contains",
        "element",
        "find",
        "findExactIndex",
        "midIndex",
        "valueHash",
        "forEachScopeOf",
        "block",
        "Lkotlin/Function1;",
        "Lkotlin/ParameterName;",
        "name",
        "getOrCreateIdentitySet",
        "remove",
        "removeScope",
        "(Ljava/lang/Object;)V",
        "removeValueIf",
        "predicate",
        "removingScopes",
        "removalOperation",
        "scopeSetAt",
        "index",
        "valueAt",
        "runtime_release"
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
        "SMAP\nIdentityScopeMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentityScopeMap.kt\nandroidx/compose/runtime/collection/IdentityScopeMap\n+ 2 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n*L\n1#1,315:1\n236#1,5:321\n241#1,17:342\n236#1,22:359\n61#1:381\n61#1:382\n61#1:383\n105#2,5:316\n146#2,16:326\n*S KotlinDebug\n*F\n+ 1 IdentityScopeMap.kt\nandroidx/compose/runtime/collection/IdentityScopeMap\n*L\n220#1:321,5\n220#1:342,17\n230#1:359,22\n270#1:381\n292#1:382\n302#1:383\n91#1:316,5\n221#1:326,16\n*E\n"
    }
.end annotation


# instance fields
.field private scopeSets:[Landroidx/compose/runtime/collection/IdentityArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Landroidx/compose/runtime/collection/IdentityArraySet<",
            "TT;>;"
        }
    .end annotation
.end field

.field private size:I

.field private valueOrder:[I

.field private values:[Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x32

    .line 5
    .line 6
    new-array v1, v0, [I

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    :goto_0
    if-ge v2, v0, :cond_0

    .line 10
    .line 11
    aput v2, v1, v2

    .line 12
    .line 13
    add-int/lit8 v2, v2, 0x1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iput-object v1, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->valueOrder:[I

    .line 17
    .line 18
    new-array v1, v0, [Ljava/lang/Object;

    .line 19
    .line 20
    iput-object v1, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->values:[Ljava/lang/Object;

    .line 21
    .line 22
    new-array v0, v0, [Landroidx/compose/runtime/collection/IdentityArraySet;

    .line 23
    .line 24
    iput-object v0, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->scopeSets:[Landroidx/compose/runtime/collection/IdentityArraySet;

    .line 25
    .line 26
    return-void
.end method

.method public static final synthetic access$find(Landroidx/compose/runtime/collection/IdentityScopeMap;Ljava/lang/Object;)I
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/runtime/collection/IdentityScopeMap;->find(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic access$scopeSetAt(Landroidx/compose/runtime/collection/IdentityScopeMap;I)Landroidx/compose/runtime/collection/IdentityArraySet;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/compose/runtime/collection/IdentityScopeMap;->scopeSetAt(I)Landroidx/compose/runtime/collection/IdentityArraySet;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final find(Ljava/lang/Object;)I
    .locals 6

    .line 1
    invoke-static {p1}, Landroidx/compose/runtime/ActualJvm_jvmKt;->identityHashCode(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->size:I

    .line 6
    .line 7
    add-int/lit8 v1, v1, -0x1

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    if-gt v2, v1, :cond_3

    .line 11
    .line 12
    add-int v3, v2, v1

    .line 13
    .line 14
    ushr-int/lit8 v3, v3, 0x1

    .line 15
    .line 16
    iget-object v4, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->values:[Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v5, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->valueOrder:[I

    .line 19
    .line 20
    aget v5, v5, v3

    .line 21
    .line 22
    aget-object v4, v4, v5

    .line 23
    .line 24
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-static {v4}, Landroidx/compose/runtime/ActualJvm_jvmKt;->identityHashCode(Ljava/lang/Object;)I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-ge v5, v0, :cond_0

    .line 32
    .line 33
    add-int/lit8 v2, v3, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    if-le v5, v0, :cond_1

    .line 37
    .line 38
    add-int/lit8 v1, v3, -0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    if-ne p1, v4, :cond_2

    .line 42
    .line 43
    return v3

    .line 44
    :cond_2
    invoke-direct {p0, v3, p1, v0}, Landroidx/compose/runtime/collection/IdentityScopeMap;->findExactIndex(ILjava/lang/Object;I)I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    return p1

    .line 49
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 50
    .line 51
    neg-int p1, v2

    .line 52
    return p1
.end method

.method private final findExactIndex(ILjava/lang/Object;I)I
    .locals 3

    .line 1
    add-int/lit8 v0, p1, -0x1

    .line 2
    .line 3
    :goto_0
    const/4 v1, -0x1

    .line 4
    if-ge v1, v0, :cond_2

    .line 5
    .line 6
    iget-object v1, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->values:[Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v2, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->valueOrder:[I

    .line 9
    .line 10
    aget v2, v2, v0

    .line 11
    .line 12
    aget-object v1, v1, v2

    .line 13
    .line 14
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    if-ne v1, p2, :cond_0

    .line 18
    .line 19
    return v0

    .line 20
    :cond_0
    invoke-static {v1}, Landroidx/compose/runtime/ActualJvm_jvmKt;->identityHashCode(Ljava/lang/Object;)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eq v1, p3, :cond_1

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    add-int/lit8 v0, v0, -0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    :goto_1
    add-int/lit8 p1, p1, 0x1

    .line 31
    .line 32
    iget v0, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->size:I

    .line 33
    .line 34
    :goto_2
    if-ge p1, v0, :cond_5

    .line 35
    .line 36
    iget-object v1, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->values:[Ljava/lang/Object;

    .line 37
    .line 38
    iget-object v2, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->valueOrder:[I

    .line 39
    .line 40
    aget v2, v2, p1

    .line 41
    .line 42
    aget-object v1, v1, v2

    .line 43
    .line 44
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    if-ne v1, p2, :cond_3

    .line 48
    .line 49
    return p1

    .line 50
    :cond_3
    invoke-static {v1}, Landroidx/compose/runtime/ActualJvm_jvmKt;->identityHashCode(Ljava/lang/Object;)I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eq v1, p3, :cond_4

    .line 55
    .line 56
    :goto_3
    add-int/lit8 p1, p1, 0x1

    .line 57
    .line 58
    neg-int p1, p1

    .line 59
    return p1

    .line 60
    :cond_4
    add-int/lit8 p1, p1, 0x1

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_5
    iget p1, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->size:I

    .line 64
    .line 65
    goto :goto_3
.end method

.method private final getOrCreateIdentitySet(Ljava/lang/Object;)Landroidx/compose/runtime/collection/IdentityArraySet;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Landroidx/compose/runtime/collection/IdentityArraySet<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget v0, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->size:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0, p1}, Landroidx/compose/runtime/collection/IdentityScopeMap;->find(Ljava/lang/Object;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-ltz v0, :cond_1

    .line 10
    .line 11
    invoke-direct {p0, v0}, Landroidx/compose/runtime/collection/IdentityScopeMap;->scopeSetAt(I)Landroidx/compose/runtime/collection/IdentityArraySet;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1

    .line 16
    :cond_0
    const/4 v0, -0x1

    .line 17
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 18
    .line 19
    neg-int v5, v0

    .line 20
    iget v0, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->size:I

    .line 21
    .line 22
    iget-object v1, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->valueOrder:[I

    .line 23
    .line 24
    array-length v2, v1

    .line 25
    if-ge v0, v2, :cond_4

    .line 26
    .line 27
    aget v0, v1, v0

    .line 28
    .line 29
    iget-object v1, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->values:[Ljava/lang/Object;

    .line 30
    .line 31
    aput-object p1, v1, v0

    .line 32
    .line 33
    iget-object p1, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->scopeSets:[Landroidx/compose/runtime/collection/IdentityArraySet;

    .line 34
    .line 35
    aget-object p1, p1, v0

    .line 36
    .line 37
    if-nez p1, :cond_2

    .line 38
    .line 39
    new-instance p1, Landroidx/compose/runtime/collection/IdentityArraySet;

    .line 40
    .line 41
    invoke-direct {p1}, Landroidx/compose/runtime/collection/IdentityArraySet;-><init>()V

    .line 42
    .line 43
    .line 44
    iget-object v1, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->scopeSets:[Landroidx/compose/runtime/collection/IdentityArraySet;

    .line 45
    .line 46
    aput-object p1, v1, v0

    .line 47
    .line 48
    :cond_2
    iget v1, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->size:I

    .line 49
    .line 50
    if-ge v5, v1, :cond_3

    .line 51
    .line 52
    iget-object v2, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->valueOrder:[I

    .line 53
    .line 54
    add-int/lit8 v3, v5, 0x1

    .line 55
    .line 56
    invoke-static {v2, v2, v3, v5, v1}, Lkotlin/collections/ArraysKt;->copyInto([I[IIII)[I

    .line 57
    .line 58
    .line 59
    :cond_3
    iget-object v1, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->valueOrder:[I

    .line 60
    .line 61
    aput v0, v1, v5

    .line 62
    .line 63
    iget v0, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->size:I

    .line 64
    .line 65
    add-int/lit8 v0, v0, 0x1

    .line 66
    .line 67
    iput v0, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->size:I

    .line 68
    .line 69
    return-object p1

    .line 70
    :cond_4
    array-length v1, v1

    .line 71
    mul-int/lit8 v1, v1, 0x2

    .line 72
    .line 73
    iget-object v2, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->scopeSets:[Landroidx/compose/runtime/collection/IdentityArraySet;

    .line 74
    .line 75
    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    const-string v3, "copyOf(this, newSize)"

    .line 80
    .line 81
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    check-cast v2, [Landroidx/compose/runtime/collection/IdentityArraySet;

    .line 85
    .line 86
    iput-object v2, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->scopeSets:[Landroidx/compose/runtime/collection/IdentityArraySet;

    .line 87
    .line 88
    new-instance v8, Landroidx/compose/runtime/collection/IdentityArraySet;

    .line 89
    .line 90
    invoke-direct {v8}, Landroidx/compose/runtime/collection/IdentityArraySet;-><init>()V

    .line 91
    .line 92
    .line 93
    iget-object v2, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->scopeSets:[Landroidx/compose/runtime/collection/IdentityArraySet;

    .line 94
    .line 95
    aput-object v8, v2, v0

    .line 96
    .line 97
    iget-object v2, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->values:[Ljava/lang/Object;

    .line 98
    .line 99
    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    iput-object v2, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->values:[Ljava/lang/Object;

    .line 107
    .line 108
    aput-object p1, v2, v0

    .line 109
    .line 110
    new-array p1, v1, [I

    .line 111
    .line 112
    iget v2, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->size:I

    .line 113
    .line 114
    :goto_0
    add-int/lit8 v2, v2, 0x1

    .line 115
    .line 116
    if-ge v2, v1, :cond_5

    .line 117
    .line 118
    aput v2, p1, v2

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_5
    iget v1, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->size:I

    .line 122
    .line 123
    if-ge v5, v1, :cond_6

    .line 124
    .line 125
    iget-object v2, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->valueOrder:[I

    .line 126
    .line 127
    add-int/lit8 v3, v5, 0x1

    .line 128
    .line 129
    invoke-static {v2, p1, v3, v5, v1}, Lkotlin/collections/ArraysKt;->copyInto([I[IIII)[I

    .line 130
    .line 131
    .line 132
    :cond_6
    aput v0, p1, v5

    .line 133
    .line 134
    if-lez v5, :cond_7

    .line 135
    .line 136
    iget-object v1, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->valueOrder:[I

    .line 137
    .line 138
    const/4 v3, 0x0

    .line 139
    const/4 v4, 0x0

    .line 140
    const/4 v6, 0x6

    .line 141
    const/4 v7, 0x0

    .line 142
    move-object v2, p1

    .line 143
    invoke-static/range {v1 .. v7}, Lkotlin/collections/ArraysKt;->copyInto$default([I[IIIIILjava/lang/Object;)[I

    .line 144
    .line 145
    .line 146
    :cond_7
    iput-object p1, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->valueOrder:[I

    .line 147
    .line 148
    iget p1, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->size:I

    .line 149
    .line 150
    add-int/lit8 p1, p1, 0x1

    .line 151
    .line 152
    iput p1, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->size:I

    .line 153
    .line 154
    return-object v8
.end method

.method public static synthetic getScopeSets$annotations()V
    .locals 0
    .annotation build Lkotlin/PublishedApi;
    .end annotation

    return-void
.end method

.method public static synthetic getSize$annotations()V
    .locals 0
    .annotation build Lkotlin/PublishedApi;
    .end annotation

    return-void
.end method

.method public static synthetic getValueOrder$annotations()V
    .locals 0
    .annotation build Lkotlin/PublishedApi;
    .end annotation

    return-void
.end method

.method public static synthetic getValues$annotations()V
    .locals 0
    .annotation build Lkotlin/PublishedApi;
    .end annotation

    return-void
.end method

.method private final removingScopes(Lkotlin/jvm/functions/Function1;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/runtime/collection/IdentityArraySet<",
            "TT;>;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityScopeMap;->getSize()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    if-ge v1, v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityScopeMap;->getValueOrder()[I

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    aget v3, v3, v1

    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityScopeMap;->getScopeSets()[Landroidx/compose/runtime/collection/IdentityArraySet;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    aget-object v4, v4, v3

    .line 20
    .line 21
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p1, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v4}, Landroidx/compose/runtime/collection/IdentityArraySet;->size()I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-lez v4, :cond_1

    .line 32
    .line 33
    if-eq v2, v1, :cond_0

    .line 34
    .line 35
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityScopeMap;->getValueOrder()[I

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    aget v4, v4, v2

    .line 40
    .line 41
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityScopeMap;->getValueOrder()[I

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    aput v3, v5, v2

    .line 46
    .line 47
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityScopeMap;->getValueOrder()[I

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    aput v4, v3, v1

    .line 52
    .line 53
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 54
    .line 55
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityScopeMap;->getSize()I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    move v0, v2

    .line 63
    :goto_1
    if-ge v0, p1, :cond_3

    .line 64
    .line 65
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityScopeMap;->getValues()[Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityScopeMap;->getValueOrder()[I

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    aget v3, v3, v0

    .line 74
    .line 75
    const/4 v4, 0x0

    .line 76
    aput-object v4, v1, v3

    .line 77
    .line 78
    add-int/lit8 v0, v0, 0x1

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    invoke-virtual {p0, v2}, Landroidx/compose/runtime/collection/IdentityScopeMap;->setSize(I)V

    .line 82
    .line 83
    .line 84
    return-void
.end method

.method private final scopeSetAt(I)Landroidx/compose/runtime/collection/IdentityArraySet;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Landroidx/compose/runtime/collection/IdentityArraySet<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->scopeSets:[Landroidx/compose/runtime/collection/IdentityArraySet;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->valueOrder:[I

    .line 4
    .line 5
    aget p1, v1, p1

    .line 6
    .line 7
    aget-object p1, v0, p1

    .line 8
    .line 9
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method private final valueAt(I)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->values:[Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->valueOrder:[I

    .line 4
    .line 5
    aget p1, v1, p1

    .line 6
    .line 7
    aget-object p1, v0, p1

    .line 8
    .line 9
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method


# virtual methods
.method public final add(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "TT;)Z"
        }
    .end annotation

    .line 1
    const-string/jumbo v0, "value"

    .line 2
    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const-string v0, "scope"

    .line 8
    .line 9
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, p1}, Landroidx/compose/runtime/collection/IdentityScopeMap;->getOrCreateIdentitySet(Ljava/lang/Object;)Landroidx/compose/runtime/collection/IdentityArraySet;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1, p2}, Landroidx/compose/runtime/collection/IdentityArraySet;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1
.end method

.method public final clear()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->scopeSets:[Landroidx/compose/runtime/collection/IdentityArraySet;

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    move v2, v1

    .line 6
    :goto_0
    if-ge v2, v0, :cond_1

    .line 7
    .line 8
    iget-object v3, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->scopeSets:[Landroidx/compose/runtime/collection/IdentityArraySet;

    .line 9
    .line 10
    aget-object v3, v3, v2

    .line 11
    .line 12
    if-eqz v3, :cond_0

    .line 13
    .line 14
    invoke-virtual {v3}, Landroidx/compose/runtime/collection/IdentityArraySet;->clear()V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object v3, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->valueOrder:[I

    .line 18
    .line 19
    aput v2, v3, v2

    .line 20
    .line 21
    iget-object v3, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->values:[Ljava/lang/Object;

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    aput-object v4, v3, v2

    .line 25
    .line 26
    add-int/lit8 v2, v2, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    iput v1, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->size:I

    .line 30
    .line 31
    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    const-string v0, "element"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Landroidx/compose/runtime/collection/IdentityScopeMap;->find(Ljava/lang/Object;)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-ltz p1, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    :goto_0
    return p1
.end method

.method public final forEachScopeOf(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string/jumbo v0, "value"

    .line 2
    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const-string v0, "block"

    .line 8
    .line 9
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-static {p0, p1}, Landroidx/compose/runtime/collection/IdentityScopeMap;->access$find(Landroidx/compose/runtime/collection/IdentityScopeMap;Ljava/lang/Object;)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-ltz p1, :cond_0

    .line 17
    .line 18
    invoke-static {p0, p1}, Landroidx/compose/runtime/collection/IdentityScopeMap;->access$scopeSetAt(Landroidx/compose/runtime/collection/IdentityScopeMap;I)Landroidx/compose/runtime/collection/IdentityArraySet;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1}, Landroidx/compose/runtime/collection/IdentityArraySet;->size()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v1, 0x0

    .line 27
    :goto_0
    if-ge v1, v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p1, v1}, Landroidx/compose/runtime/collection/IdentityArraySet;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-interface {p2, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    add-int/lit8 v1, v1, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    return-void
.end method

.method public final getScopeSets()[Landroidx/compose/runtime/collection/IdentityArraySet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Landroidx/compose/runtime/collection/IdentityArraySet<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->scopeSets:[Landroidx/compose/runtime/collection/IdentityArraySet;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSize()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->size:I

    .line 2
    .line 3
    return v0
.end method

.method public final getValueOrder()[I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->valueOrder:[I

    .line 2
    .line 3
    return-object v0
.end method

.method public final getValues()[Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->values:[Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public final remove(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "TT;)Z"
        }
    .end annotation

    .line 1
    const-string/jumbo v0, "value"

    .line 2
    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    const-string v0, "scope"

    .line 8
    .line 9
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, p1}, Landroidx/compose/runtime/collection/IdentityScopeMap;->find(Ljava/lang/Object;)I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    const/4 v0, 0x0

    .line 17
    if-ltz p1, :cond_3

    .line 18
    .line 19
    iget-object v1, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->valueOrder:[I

    .line 20
    .line 21
    aget v1, v1, p1

    .line 22
    .line 23
    iget-object v2, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->scopeSets:[Landroidx/compose/runtime/collection/IdentityArraySet;

    .line 24
    .line 25
    aget-object v2, v2, v1

    .line 26
    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    return v0

    .line 30
    :cond_0
    invoke-virtual {v2, p2}, Landroidx/compose/runtime/collection/IdentityArraySet;->remove(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    invoke-virtual {v2}, Landroidx/compose/runtime/collection/IdentityArraySet;->size()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_2

    .line 39
    .line 40
    add-int/lit8 v0, p1, 0x1

    .line 41
    .line 42
    iget v2, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->size:I

    .line 43
    .line 44
    if-ge v0, v2, :cond_1

    .line 45
    .line 46
    iget-object v3, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->valueOrder:[I

    .line 47
    .line 48
    invoke-static {v3, v3, p1, v0, v2}, Lkotlin/collections/ArraysKt;->copyInto([I[IIII)[I

    .line 49
    .line 50
    .line 51
    :cond_1
    iget-object p1, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->valueOrder:[I

    .line 52
    .line 53
    iget v0, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->size:I

    .line 54
    .line 55
    add-int/lit8 v2, v0, -0x1

    .line 56
    .line 57
    aput v1, p1, v2

    .line 58
    .line 59
    iget-object p1, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->values:[Ljava/lang/Object;

    .line 60
    .line 61
    const/4 v2, 0x0

    .line 62
    aput-object v2, p1, v1

    .line 63
    .line 64
    add-int/lit8 v0, v0, -0x1

    .line 65
    .line 66
    iput v0, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->size:I

    .line 67
    .line 68
    :cond_2
    return p2

    .line 69
    :cond_3
    return v0
.end method

.method public final removeScope(Ljava/lang/Object;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    const-string v0, "scope"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityScopeMap;->getSize()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    move v2, v1

    .line 12
    :goto_0
    if-ge v1, v0, :cond_2

    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityScopeMap;->getValueOrder()[I

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    aget v3, v3, v1

    .line 19
    .line 20
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityScopeMap;->getScopeSets()[Landroidx/compose/runtime/collection/IdentityArraySet;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    aget-object v4, v4, v3

    .line 25
    .line 26
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v4, p1}, Landroidx/compose/runtime/collection/IdentityArraySet;->remove(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    invoke-virtual {v4}, Landroidx/compose/runtime/collection/IdentityArraySet;->size()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-lez v4, :cond_1

    .line 37
    .line 38
    if-eq v2, v1, :cond_0

    .line 39
    .line 40
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityScopeMap;->getValueOrder()[I

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    aget v4, v4, v2

    .line 45
    .line 46
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityScopeMap;->getValueOrder()[I

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    aput v3, v5, v2

    .line 51
    .line 52
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityScopeMap;->getValueOrder()[I

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    aput v4, v3, v1

    .line 57
    .line 58
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 59
    .line 60
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_2
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityScopeMap;->getSize()I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    move v0, v2

    .line 68
    :goto_1
    if-ge v0, p1, :cond_3

    .line 69
    .line 70
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityScopeMap;->getValues()[Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityScopeMap;->getValueOrder()[I

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    aget v3, v3, v0

    .line 79
    .line 80
    const/4 v4, 0x0

    .line 81
    aput-object v4, v1, v3

    .line 82
    .line 83
    add-int/lit8 v0, v0, 0x1

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_3
    invoke-virtual {p0, v2}, Landroidx/compose/runtime/collection/IdentityScopeMap;->setSize(I)V

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public final removeValueIf(Lkotlin/jvm/functions/Function1;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "predicate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityScopeMap;->getSize()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    move v2, v1

    .line 12
    move v3, v2

    .line 13
    :goto_0
    const/4 v4, 0x0

    .line 14
    if-ge v2, v0, :cond_6

    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityScopeMap;->getValueOrder()[I

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    aget v5, v5, v2

    .line 21
    .line 22
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityScopeMap;->getScopeSets()[Landroidx/compose/runtime/collection/IdentityArraySet;

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    aget-object v6, v6, v5

    .line 27
    .line 28
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v6}, Landroidx/compose/runtime/collection/IdentityArraySet;->size()I

    .line 32
    .line 33
    .line 34
    move-result v7

    .line 35
    move v8, v1

    .line 36
    move v9, v8

    .line 37
    :goto_1
    if-ge v8, v7, :cond_2

    .line 38
    .line 39
    invoke-virtual {v6}, Landroidx/compose/runtime/collection/IdentityArraySet;->getValues()[Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v10

    .line 43
    aget-object v10, v10, v8

    .line 44
    .line 45
    const-string v11, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet"

    .line 46
    .line 47
    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-interface {p1, v10}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v11

    .line 54
    check-cast v11, Ljava/lang/Boolean;

    .line 55
    .line 56
    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    .line 57
    .line 58
    .line 59
    move-result v11

    .line 60
    if-nez v11, :cond_1

    .line 61
    .line 62
    if-eq v9, v8, :cond_0

    .line 63
    .line 64
    invoke-virtual {v6}, Landroidx/compose/runtime/collection/IdentityArraySet;->getValues()[Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v11

    .line 68
    aput-object v10, v11, v9

    .line 69
    .line 70
    :cond_0
    add-int/lit8 v9, v9, 0x1

    .line 71
    .line 72
    :cond_1
    add-int/lit8 v8, v8, 0x1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    invoke-virtual {v6}, Landroidx/compose/runtime/collection/IdentityArraySet;->size()I

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    move v8, v9

    .line 80
    :goto_2
    if-ge v8, v7, :cond_3

    .line 81
    .line 82
    invoke-virtual {v6}, Landroidx/compose/runtime/collection/IdentityArraySet;->getValues()[Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v10

    .line 86
    aput-object v4, v10, v8

    .line 87
    .line 88
    add-int/lit8 v8, v8, 0x1

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_3
    invoke-virtual {v6, v9}, Landroidx/compose/runtime/collection/IdentityArraySet;->setSize(I)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v6}, Landroidx/compose/runtime/collection/IdentityArraySet;->size()I

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    if-lez v4, :cond_5

    .line 99
    .line 100
    if-eq v3, v2, :cond_4

    .line 101
    .line 102
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityScopeMap;->getValueOrder()[I

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    aget v4, v4, v3

    .line 107
    .line 108
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityScopeMap;->getValueOrder()[I

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    aput v5, v6, v3

    .line 113
    .line 114
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityScopeMap;->getValueOrder()[I

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    aput v4, v5, v2

    .line 119
    .line 120
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 121
    .line 122
    :cond_5
    add-int/lit8 v2, v2, 0x1

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_6
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityScopeMap;->getSize()I

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    move v0, v3

    .line 130
    :goto_3
    if-ge v0, p1, :cond_7

    .line 131
    .line 132
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityScopeMap;->getValues()[Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-virtual {p0}, Landroidx/compose/runtime/collection/IdentityScopeMap;->getValueOrder()[I

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    aget v2, v2, v0

    .line 141
    .line 142
    aput-object v4, v1, v2

    .line 143
    .line 144
    add-int/lit8 v0, v0, 0x1

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_7
    invoke-virtual {p0, v3}, Landroidx/compose/runtime/collection/IdentityScopeMap;->setSize(I)V

    .line 148
    .line 149
    .line 150
    return-void
.end method

.method public final setScopeSets([Landroidx/compose/runtime/collection/IdentityArraySet;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Landroidx/compose/runtime/collection/IdentityArraySet<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->scopeSets:[Landroidx/compose/runtime/collection/IdentityArraySet;

    .line 7
    .line 8
    return-void
.end method

.method public final setSize(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->size:I

    .line 2
    .line 3
    return-void
.end method

.method public final setValueOrder([I)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->valueOrder:[I

    .line 7
    .line 8
    return-void
.end method

.method public final setValues([Ljava/lang/Object;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Landroidx/compose/runtime/collection/IdentityScopeMap;->values:[Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method
