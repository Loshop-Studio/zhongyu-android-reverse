.class public final Landroidx/paging/PageStore;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/paging/PlaceholderPaddedList;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/paging/PageStore$Companion;,
        Landroidx/paging/PageStore$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Landroidx/paging/PlaceholderPaddedList<",
        "TT;>;"
    }
.end annotation


# static fields
.field public static final Companion:Landroidx/paging/PageStore$Companion;

.field private static final INITIAL:Landroidx/paging/PageStore;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/PageStore<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private dataCount:I

.field private final pages:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/paging/TransformablePage<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field private placeholdersAfter:I

.field private placeholdersBefore:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Landroidx/paging/PageStore$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/paging/PageStore$Companion;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/paging/PageStore;->Companion:Landroidx/paging/PageStore$Companion;

    .line 8
    .line 9
    new-instance v0, Landroidx/paging/PageStore;

    .line 10
    .line 11
    sget-object v1, Landroidx/paging/PageEvent$Insert;->Companion:Landroidx/paging/PageEvent$Insert$Companion;

    .line 12
    .line 13
    sget-object v2, Landroidx/paging/TransformablePage;->Companion:Landroidx/paging/TransformablePage$Companion;

    .line 14
    .line 15
    invoke-virtual {v2}, Landroidx/paging/TransformablePage$Companion;->empty()Landroidx/paging/TransformablePage;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {v2}, Lrc/v;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    new-instance v5, Landroidx/paging/LoadStates;

    .line 24
    .line 25
    sget-object v3, Landroidx/paging/LoadState$NotLoading;->Companion:Landroidx/paging/LoadState$NotLoading$Companion;

    .line 26
    .line 27
    invoke-virtual {v3}, Landroidx/paging/LoadState$NotLoading$Companion;->getIncomplete$paging_common()Landroidx/paging/LoadState$NotLoading;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-virtual {v3}, Landroidx/paging/LoadState$NotLoading$Companion;->getComplete$paging_common()Landroidx/paging/LoadState$NotLoading;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    invoke-virtual {v3}, Landroidx/paging/LoadState$NotLoading$Companion;->getComplete$paging_common()Landroidx/paging/LoadState$NotLoading;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-direct {v5, v4, v6, v3}, Landroidx/paging/LoadStates;-><init>(Landroidx/paging/LoadState;Landroidx/paging/LoadState;Landroidx/paging/LoadState;)V

    .line 40
    .line 41
    .line 42
    const/16 v7, 0x10

    .line 43
    .line 44
    const/4 v8, 0x0

    .line 45
    const/4 v3, 0x0

    .line 46
    const/4 v4, 0x0

    .line 47
    const/4 v6, 0x0

    .line 48
    invoke-static/range {v1 .. v8}, Landroidx/paging/PageEvent$Insert$Companion;->Refresh$default(Landroidx/paging/PageEvent$Insert$Companion;Ljava/util/List;IILandroidx/paging/LoadStates;Landroidx/paging/LoadStates;ILjava/lang/Object;)Landroidx/paging/PageEvent$Insert;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-direct {v0, v1}, Landroidx/paging/PageStore;-><init>(Landroidx/paging/PageEvent$Insert;)V

    .line 53
    .line 54
    .line 55
    sput-object v0, Landroidx/paging/PageStore;->INITIAL:Landroidx/paging/PageStore;

    .line 56
    .line 57
    return-void
.end method

.method public constructor <init>(Landroidx/paging/PageEvent$Insert;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PageEvent$Insert<",
            "TT;>;)V"
        }
    .end annotation

    const-string v0, "insertEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Insert;->getPages()Ljava/util/List;

    move-result-object v0

    .line 7
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Insert;->getPlaceholdersBefore()I

    move-result v1

    .line 8
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Insert;->getPlaceholdersAfter()I

    move-result p1

    .line 9
    invoke-direct {p0, v0, v1, p1}, Landroidx/paging/PageStore;-><init>(Ljava/util/List;II)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;II)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/paging/TransformablePage<",
            "TT;>;>;II)V"
        }
    .end annotation

    const-string v0, "pages"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lrc/g0;->a1(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Landroidx/paging/PageStore;->pages:Ljava/util/List;

    .line 3
    invoke-direct {p0, p1}, Landroidx/paging/PageStore;->fullCount(Ljava/util/List;)I

    move-result p1

    iput p1, p0, Landroidx/paging/PageStore;->dataCount:I

    .line 4
    iput p2, p0, Landroidx/paging/PageStore;->placeholdersBefore:I

    .line 5
    iput p3, p0, Landroidx/paging/PageStore;->placeholdersAfter:I

    return-void
.end method

.method public static final synthetic access$getINITIAL$cp()Landroidx/paging/PageStore;
    .locals 1

    .line 1
    sget-object v0, Landroidx/paging/PageStore;->INITIAL:Landroidx/paging/PageStore;

    .line 2
    .line 3
    return-object v0
.end method

.method private final checkIndex(I)V
    .locals 3

    .line 1
    if-ltz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/paging/PageStore;->getSize()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-ge p1, v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 11
    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v2, "Index: "

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string p1, ", Size: "

    .line 26
    .line 27
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Landroidx/paging/PageStore;->getSize()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v0
.end method

.method private final dropPages(Landroidx/paging/PageEvent$Drop;)Landroidx/paging/PagingDataEvent;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PageEvent$Drop<",
            "TT;>;)",
            "Landroidx/paging/PagingDataEvent<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Lnd/j;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Drop;->getMinPageOffset()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Drop;->getMaxPageOffset()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-direct {v0, v1, v2}, Lnd/j;-><init>(II)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, v0}, Landroidx/paging/PageStore;->dropPagesWithOffsets(Lnd/j;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual {p0}, Landroidx/paging/PageStore;->getDataCount()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    sub-int/2addr v1, v0

    .line 23
    iput v1, p0, Landroidx/paging/PageStore;->dataCount:I

    .line 24
    .line 25
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Drop;->getLoadType()Landroidx/paging/LoadType;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    sget-object v2, Landroidx/paging/LoadType;->PREPEND:Landroidx/paging/LoadType;

    .line 30
    .line 31
    if-ne v1, v2, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0}, Landroidx/paging/PageStore;->getPlaceholdersBefore()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Drop;->getPlaceholdersRemaining()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    iput p1, p0, Landroidx/paging/PageStore;->placeholdersBefore:I

    .line 42
    .line 43
    new-instance p1, Landroidx/paging/PagingDataEvent$DropPrepend;

    .line 44
    .line 45
    invoke-virtual {p0}, Landroidx/paging/PageStore;->getPlaceholdersBefore()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    invoke-direct {p1, v0, v2, v1}, Landroidx/paging/PagingDataEvent$DropPrepend;-><init>(III)V

    .line 50
    .line 51
    .line 52
    return-object p1

    .line 53
    :cond_0
    invoke-virtual {p0}, Landroidx/paging/PageStore;->getPlaceholdersAfter()I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Drop;->getPlaceholdersRemaining()I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    iput v2, p0, Landroidx/paging/PageStore;->placeholdersAfter:I

    .line 62
    .line 63
    new-instance v2, Landroidx/paging/PagingDataEvent$DropAppend;

    .line 64
    .line 65
    invoke-virtual {p0}, Landroidx/paging/PageStore;->getPlaceholdersBefore()I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    invoke-virtual {p0}, Landroidx/paging/PageStore;->getDataCount()I

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    add-int/2addr v3, v4

    .line 74
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Drop;->getPlaceholdersRemaining()I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    invoke-direct {v2, v3, v0, p1, v1}, Landroidx/paging/PagingDataEvent$DropAppend;-><init>(IIII)V

    .line 79
    .line 80
    .line 81
    return-object v2
.end method

.method private final dropPagesWithOffsets(Lnd/j;)I
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/paging/PageStore;->pages:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    move v2, v1

    .line 9
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-eqz v3, :cond_2

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, Landroidx/paging/TransformablePage;

    .line 20
    .line 21
    invoke-virtual {v3}, Landroidx/paging/TransformablePage;->getOriginalPageOffsets()[I

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    array-length v5, v4

    .line 26
    move v6, v1

    .line 27
    :goto_1
    if-ge v6, v5, :cond_0

    .line 28
    .line 29
    aget v7, v4, v6

    .line 30
    .line 31
    invoke-virtual {p1, v7}, Lnd/j;->g(I)Z

    .line 32
    .line 33
    .line 34
    move-result v7

    .line 35
    if-eqz v7, :cond_1

    .line 36
    .line 37
    invoke-virtual {v3}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    add-int/2addr v2, v3

    .line 46
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    add-int/lit8 v6, v6, 0x1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    return v2
.end method

.method private final fullCount(Ljava/util/List;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/paging/TransformablePage<",
            "TT;>;>;)I"
        }
    .end annotation

    .line 1
    check-cast p1, Ljava/lang/Iterable;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x0

    .line 8
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Landroidx/paging/TransformablePage;

    .line 19
    .line 20
    invoke-virtual {v1}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    add-int/2addr v0, v1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    return v0
.end method

.method private final getOriginalPageOffsetFirst()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/PageStore;->pages:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {v0}, Lrc/g0;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/paging/TransformablePage;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/paging/TransformablePage;->getOriginalPageOffsets()[I

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Lrc/r;->S0([I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    return v0
.end method

.method private final getOriginalPageOffsetLast()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/paging/PageStore;->pages:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {v0}, Lrc/g0;->y0(Ljava/util/List;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/paging/TransformablePage;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/paging/TransformablePage;->getOriginalPageOffsets()[I

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Lrc/r;->P0([I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    return v0
.end method

.method private final insertPage(Landroidx/paging/PageEvent$Insert;)Landroidx/paging/PagingDataEvent;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PageEvent$Insert<",
            "TT;>;)",
            "Landroidx/paging/PagingDataEvent<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Insert;->getPages()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, v0}, Landroidx/paging/PageStore;->fullCount(Ljava/util/List;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Insert;->getLoadType()Landroidx/paging/LoadType;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    sget-object v2, Landroidx/paging/PageStore$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    aget v1, v2, v1

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    if-eq v1, v2, :cond_4

    .line 23
    .line 24
    const/4 v2, 0x2

    .line 25
    if-eq v1, v2, :cond_2

    .line 26
    .line 27
    const/4 v2, 0x3

    .line 28
    if-ne v1, v2, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0}, Landroidx/paging/PageStore;->getPlaceholdersAfter()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-virtual {p0}, Landroidx/paging/PageStore;->getDataCount()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    iget-object v3, p0, Landroidx/paging/PageStore;->pages:Ljava/util/List;

    .line 39
    .line 40
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Insert;->getPages()Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    check-cast v5, Ljava/util/Collection;

    .line 49
    .line 50
    invoke-interface {v3, v4, v5}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Landroidx/paging/PageStore;->getDataCount()I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    add-int/2addr v3, v0

    .line 58
    iput v3, p0, Landroidx/paging/PageStore;->dataCount:I

    .line 59
    .line 60
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Insert;->getPlaceholdersAfter()I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iput v0, p0, Landroidx/paging/PageStore;->placeholdersAfter:I

    .line 65
    .line 66
    invoke-virtual {p0}, Landroidx/paging/PageStore;->getPlaceholdersBefore()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    add-int/2addr v0, v2

    .line 71
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Insert;->getPages()Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    check-cast p1, Ljava/lang/Iterable;

    .line 76
    .line 77
    new-instance v2, Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-eqz v3, :cond_0

    .line 91
    .line 92
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    check-cast v3, Landroidx/paging/TransformablePage;

    .line 97
    .line 98
    invoke-virtual {v3}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    check-cast v3, Ljava/lang/Iterable;

    .line 103
    .line 104
    invoke-static {v2, v3}, Lrc/b0;->B(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_0
    invoke-virtual {p0}, Landroidx/paging/PageStore;->getPlaceholdersAfter()I

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    new-instance v3, Landroidx/paging/PagingDataEvent$Append;

    .line 113
    .line 114
    invoke-direct {v3, v0, v2, p1, v1}, Landroidx/paging/PagingDataEvent$Append;-><init>(ILjava/util/List;II)V

    .line 115
    .line 116
    .line 117
    return-object v3

    .line 118
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 119
    .line 120
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 121
    .line 122
    .line 123
    throw p1

    .line 124
    :cond_2
    invoke-virtual {p0}, Landroidx/paging/PageStore;->getPlaceholdersBefore()I

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    iget-object v2, p0, Landroidx/paging/PageStore;->pages:Ljava/util/List;

    .line 129
    .line 130
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Insert;->getPages()Ljava/util/List;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    check-cast v3, Ljava/util/Collection;

    .line 135
    .line 136
    const/4 v4, 0x0

    .line 137
    invoke-interface {v2, v4, v3}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0}, Landroidx/paging/PageStore;->getDataCount()I

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    add-int/2addr v2, v0

    .line 145
    iput v2, p0, Landroidx/paging/PageStore;->dataCount:I

    .line 146
    .line 147
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Insert;->getPlaceholdersBefore()I

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    iput v0, p0, Landroidx/paging/PageStore;->placeholdersBefore:I

    .line 152
    .line 153
    invoke-virtual {p1}, Landroidx/paging/PageEvent$Insert;->getPages()Ljava/util/List;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    check-cast p1, Ljava/lang/Iterable;

    .line 158
    .line 159
    new-instance v0, Ljava/util/ArrayList;

    .line 160
    .line 161
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 162
    .line 163
    .line 164
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    if-eqz v2, :cond_3

    .line 173
    .line 174
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    check-cast v2, Landroidx/paging/TransformablePage;

    .line 179
    .line 180
    invoke-virtual {v2}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    check-cast v2, Ljava/lang/Iterable;

    .line 185
    .line 186
    invoke-static {v0, v2}, Lrc/b0;->B(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 187
    .line 188
    .line 189
    goto :goto_1

    .line 190
    :cond_3
    invoke-virtual {p0}, Landroidx/paging/PageStore;->getPlaceholdersBefore()I

    .line 191
    .line 192
    .line 193
    move-result p1

    .line 194
    new-instance v2, Landroidx/paging/PagingDataEvent$Prepend;

    .line 195
    .line 196
    invoke-direct {v2, v0, p1, v1}, Landroidx/paging/PagingDataEvent$Prepend;-><init>(Ljava/util/List;II)V

    .line 197
    .line 198
    .line 199
    return-object v2

    .line 200
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 201
    .line 202
    const-string v0, "Paging received a refresh event in the middle of an actively loading generation\nof PagingData. If you see this exception, it is most likely a bug in the library.\nPlease file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106"

    .line 203
    .line 204
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    throw p1
.end method


# virtual methods
.method public final createAccessHintForIndex(I)Landroidx/paging/ViewportHint$Access;
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroidx/paging/PageStore;->getPlaceholdersBefore()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sub-int v0, p1, v0

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    move v3, v0

    .line 9
    :goto_0
    iget-object v0, p0, Landroidx/paging/PageStore;->pages:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Landroidx/paging/TransformablePage;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-lt v3, v0, :cond_0

    .line 26
    .line 27
    iget-object v0, p0, Landroidx/paging/PageStore;->pages:Ljava/util/List;

    .line 28
    .line 29
    invoke-static {v0}, Lrc/w;->p(Ljava/util/List;)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-ge v1, v0, :cond_0

    .line 34
    .line 35
    iget-object v0, p0, Landroidx/paging/PageStore;->pages:Ljava/util/List;

    .line 36
    .line 37
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Landroidx/paging/TransformablePage;

    .line 42
    .line 43
    invoke-virtual {v0}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    sub-int/2addr v3, v0

    .line 52
    add-int/lit8 v1, v1, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    iget-object v0, p0, Landroidx/paging/PageStore;->pages:Ljava/util/List;

    .line 56
    .line 57
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    move-object v2, v0

    .line 62
    check-cast v2, Landroidx/paging/TransformablePage;

    .line 63
    .line 64
    invoke-virtual {p0}, Landroidx/paging/PageStore;->getPlaceholdersBefore()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    sub-int v4, p1, v0

    .line 69
    .line 70
    invoke-virtual {p0}, Landroidx/paging/PageStore;->getSize()I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    sub-int/2addr v0, p1

    .line 75
    invoke-virtual {p0}, Landroidx/paging/PageStore;->getPlaceholdersAfter()I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    sub-int/2addr v0, p1

    .line 80
    add-int/lit8 v5, v0, -0x1

    .line 81
    .line 82
    invoke-direct {p0}, Landroidx/paging/PageStore;->getOriginalPageOffsetFirst()I

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    invoke-direct {p0}, Landroidx/paging/PageStore;->getOriginalPageOffsetLast()I

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    invoke-virtual/range {v2 .. v7}, Landroidx/paging/TransformablePage;->viewportHintFor(IIIII)Landroidx/paging/ViewportHint$Access;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Landroidx/paging/PageStore;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    return v0

    .line 10
    :cond_1
    invoke-direct {p0}, Landroidx/paging/PageStore;->getOriginalPageOffsetFirst()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    check-cast p1, Landroidx/paging/PageStore;

    .line 15
    .line 16
    invoke-direct {p1}, Landroidx/paging/PageStore;->getOriginalPageOffsetFirst()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-ne v1, v2, :cond_2

    .line 21
    .line 22
    invoke-direct {p0}, Landroidx/paging/PageStore;->getOriginalPageOffsetLast()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-direct {p1}, Landroidx/paging/PageStore;->getOriginalPageOffsetLast()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-ne v1, v2, :cond_2

    .line 31
    .line 32
    invoke-virtual {p0}, Landroidx/paging/PageStore;->getPlaceholdersBefore()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    invoke-virtual {p1}, Landroidx/paging/PageStore;->getPlaceholdersBefore()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-ne v1, v2, :cond_2

    .line 41
    .line 42
    invoke-virtual {p0}, Landroidx/paging/PageStore;->getPlaceholdersAfter()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    invoke-virtual {p1}, Landroidx/paging/PageStore;->getPlaceholdersAfter()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-ne v1, v2, :cond_2

    .line 51
    .line 52
    iget-object v1, p0, Landroidx/paging/PageStore;->pages:Ljava/util/List;

    .line 53
    .line 54
    iget-object p1, p1, Landroidx/paging/PageStore;->pages:Ljava/util/List;

    .line 55
    .line 56
    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_2

    .line 61
    .line 62
    const/4 p1, 0x1

    .line 63
    return p1

    .line 64
    :cond_2
    return v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Landroidx/paging/PageStore;->checkIndex(I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/paging/PageStore;->getPlaceholdersBefore()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    sub-int/2addr p1, v0

    .line 9
    if-ltz p1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/paging/PageStore;->getDataCount()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-lt p1, v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/paging/PageStore;->getItem(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 24
    return-object p1
.end method

.method public getDataCount()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/paging/PageStore;->dataCount:I

    .line 2
    .line 3
    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/paging/PageStore;->pages:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-ge v1, v0, :cond_1

    .line 9
    .line 10
    iget-object v2, p0, Landroidx/paging/PageStore;->pages:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, Landroidx/paging/TransformablePage;

    .line 17
    .line 18
    invoke-virtual {v2}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-le v2, p1, :cond_0

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    sub-int/2addr p1, v2

    .line 30
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    :goto_1
    iget-object v0, p0, Landroidx/paging/PageStore;->pages:Ljava/util/List;

    .line 34
    .line 35
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Landroidx/paging/TransformablePage;

    .line 40
    .line 41
    invoke-virtual {v0}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    return-object p1
.end method

.method public getPlaceholdersAfter()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/paging/PageStore;->placeholdersAfter:I

    .line 2
    .line 3
    return v0
.end method

.method public getPlaceholdersBefore()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/paging/PageStore;->placeholdersBefore:I

    .line 2
    .line 3
    return v0
.end method

.method public getSize()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/paging/PageStore;->getPlaceholdersBefore()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroidx/paging/PageStore;->getDataCount()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/2addr v0, v1

    .line 10
    invoke-virtual {p0}, Landroidx/paging/PageStore;->getPlaceholdersAfter()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    add-int/2addr v0, v1

    .line 15
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/paging/PageStore;->getOriginalPageOffsetFirst()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit8 v0, v0, 0x1f

    .line 6
    .line 7
    invoke-direct {p0}, Landroidx/paging/PageStore;->getOriginalPageOffsetLast()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    mul-int/lit8 v1, v1, 0x1f

    .line 12
    .line 13
    add-int/2addr v0, v1

    .line 14
    invoke-virtual {p0}, Landroidx/paging/PageStore;->getPlaceholdersBefore()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    mul-int/lit8 v1, v1, 0x1f

    .line 19
    .line 20
    add-int/2addr v0, v1

    .line 21
    invoke-virtual {p0}, Landroidx/paging/PageStore;->getPlaceholdersAfter()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    mul-int/lit8 v1, v1, 0x1f

    .line 26
    .line 27
    add-int/2addr v0, v1

    .line 28
    iget-object v1, p0, Landroidx/paging/PageStore;->pages:Ljava/util/List;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    mul-int/lit8 v1, v1, 0x1f

    .line 35
    .line 36
    add-int/2addr v0, v1

    .line 37
    return v0
.end method

.method public final initializeHint()Landroidx/paging/ViewportHint$Initial;
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/paging/PageStore;->getDataCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-instance v1, Landroidx/paging/ViewportHint$Initial;

    .line 6
    .line 7
    div-int/lit8 v0, v0, 0x2

    .line 8
    .line 9
    invoke-direct {p0}, Landroidx/paging/PageStore;->getOriginalPageOffsetFirst()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-direct {p0}, Landroidx/paging/PageStore;->getOriginalPageOffsetLast()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-direct {v1, v0, v0, v2, v3}, Landroidx/paging/ViewportHint$Initial;-><init>(IIII)V

    .line 18
    .line 19
    .line 20
    return-object v1
.end method

.method public final processEvent(Landroidx/paging/PageEvent;)Landroidx/paging/PagingDataEvent;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PageEvent<",
            "TT;>;)",
            "Landroidx/paging/PagingDataEvent<",
            "TT;>;"
        }
    .end annotation

    .line 1
    const-string v0, "pageEvent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Landroidx/paging/PageEvent$Insert;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p1, Landroidx/paging/PageEvent$Insert;

    .line 11
    .line 12
    invoke-direct {p0, p1}, Landroidx/paging/PageStore;->insertPage(Landroidx/paging/PageEvent$Insert;)Landroidx/paging/PagingDataEvent;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1

    .line 17
    :cond_0
    instance-of v0, p1, Landroidx/paging/PageEvent$Drop;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    check-cast p1, Landroidx/paging/PageEvent$Drop;

    .line 22
    .line 23
    invoke-direct {p0, p1}, Landroidx/paging/PageStore;->dropPages(Landroidx/paging/PageEvent$Drop;)Landroidx/paging/PagingDataEvent;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1

    .line 28
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    const-string v0, "Paging received an event to process StaticList or LoadStateUpdate while\nprocessing Inserts and Drops. If you see this exception, it is most\nlikely a bug in the library. Please file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106"

    .line 31
    .line 32
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p1
.end method

.method public final snapshot()Landroidx/paging/ItemSnapshotList;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/paging/ItemSnapshotList<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/paging/PageStore;->getPlaceholdersBefore()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroidx/paging/PageStore;->getPlaceholdersAfter()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, p0, Landroidx/paging/PageStore;->pages:Ljava/util/List;

    .line 10
    .line 11
    check-cast v2, Ljava/lang/Iterable;

    .line 12
    .line 13
    new-instance v3, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    check-cast v4, Landroidx/paging/TransformablePage;

    .line 33
    .line 34
    invoke-virtual {v4}, Landroidx/paging/TransformablePage;->getData()Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    check-cast v4, Ljava/lang/Iterable;

    .line 39
    .line 40
    invoke-static {v3, v4}, Lrc/b0;->B(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    new-instance v2, Landroidx/paging/ItemSnapshotList;

    .line 45
    .line 46
    invoke-direct {v2, v0, v1, v3}, Landroidx/paging/ItemSnapshotList;-><init>(IILjava/util/List;)V

    .line 47
    .line 48
    .line 49
    return-object v2
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroidx/paging/PageStore;->getDataCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    :goto_0
    if-ge v2, v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, v2}, Landroidx/paging/PageStore;->getItem(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    add-int/lit8 v2, v2, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/16 v8, 0x3f

    .line 24
    .line 25
    const/4 v9, 0x0

    .line 26
    const/4 v2, 0x0

    .line 27
    const/4 v3, 0x0

    .line 28
    const/4 v4, 0x0

    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v6, 0x0

    .line 31
    const/4 v7, 0x0

    .line 32
    invoke-static/range {v1 .. v9}, Lrc/g0;->w0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lhd/l;ILjava/lang/Object;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    new-instance v1, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    const-string v2, "[("

    .line 42
    .line 43
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Landroidx/paging/PageStore;->getPlaceholdersBefore()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v2, " placeholders), "

    .line 54
    .line 55
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v0, ", ("

    .line 62
    .line 63
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Landroidx/paging/PageStore;->getPlaceholdersAfter()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v0, " placeholders)]"

    .line 74
    .line 75
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    return-object v0
.end method
