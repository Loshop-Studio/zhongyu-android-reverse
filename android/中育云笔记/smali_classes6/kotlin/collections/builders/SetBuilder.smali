.class public final Lkotlin/collections/builders/SetBuilder;
.super Lrc/j;
.source "SourceFile"

# interfaces
.implements Ljava/util/Set;
.implements Ljava/io/Serializable;
.implements Lid/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkotlin/collections/builders/SetBuilder$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lrc/j;",
        "Ljava/util/Set<",
        "TE;>;",
        "Ljava/io/Serializable;",
        "Lid/f;"
    }
.end annotation


# static fields
.field public static final d:Lkotlin/collections/builders/SetBuilder$a;

.field public static final e:Lkotlin/collections/builders/SetBuilder;


# instance fields
.field public final c:Lkotlin/collections/builders/MapBuilder;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lkotlin/collections/builders/SetBuilder$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lkotlin/collections/builders/SetBuilder$a;-><init>(Lkotlin/jvm/internal/n;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lkotlin/collections/builders/SetBuilder;->d:Lkotlin/collections/builders/SetBuilder$a;

    .line 8
    .line 9
    new-instance v0, Lkotlin/collections/builders/SetBuilder;

    .line 10
    .line 11
    sget-object v1, Lkotlin/collections/builders/MapBuilder;->p:Lkotlin/collections/builders/MapBuilder$a;

    .line 12
    .line 13
    invoke-virtual {v1}, Lkotlin/collections/builders/MapBuilder$a;->e()Lkotlin/collections/builders/MapBuilder;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v0, v1}, Lkotlin/collections/builders/SetBuilder;-><init>(Lkotlin/collections/builders/MapBuilder;)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lkotlin/collections/builders/SetBuilder;->e:Lkotlin/collections/builders/SetBuilder;

    .line 21
    .line 22
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 3
    new-instance v0, Lkotlin/collections/builders/MapBuilder;

    invoke-direct {v0}, Lkotlin/collections/builders/MapBuilder;-><init>()V

    invoke-direct {p0, v0}, Lkotlin/collections/builders/SetBuilder;-><init>(Lkotlin/collections/builders/MapBuilder;)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 4
    new-instance v0, Lkotlin/collections/builders/MapBuilder;

    invoke-direct {v0, p1}, Lkotlin/collections/builders/MapBuilder;-><init>(I)V

    invoke-direct {p0, v0}, Lkotlin/collections/builders/SetBuilder;-><init>(Lkotlin/collections/builders/MapBuilder;)V

    return-void
.end method

.method public constructor <init>(Lkotlin/collections/builders/MapBuilder;)V
    .locals 1

    const-string v0, "backing"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Lrc/j;-><init>()V

    .line 2
    iput-object p1, p0, Lkotlin/collections/builders/SetBuilder;->c:Lkotlin/collections/builders/MapBuilder;

    return-void
.end method

.method private final readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 1
    new-instance p1, Ljava/io/InvalidObjectException;

    .line 2
    .line 3
    const-string v0, "Deserialization is supported via proxy only"

    .line 4
    .line 5
    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method private final writeReplace()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lkotlin/collections/builders/SetBuilder;->c:Lkotlin/collections/builders/MapBuilder;

    .line 2
    .line 3
    invoke-virtual {v0}, Lkotlin/collections/builders/MapBuilder;->M()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lkotlin/collections/builders/SerializedCollection;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, p0, v1}, Lkotlin/collections/builders/SerializedCollection;-><init>(Ljava/util/Collection;I)V

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_0
    new-instance v0, Ljava/io/NotSerializableException;

    .line 17
    .line 18
    const-string v1, "The set cannot be serialized while it is being built."

    .line 19
    .line 20
    invoke-direct {v0, v1}, Ljava/io/NotSerializableException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw v0
.end method


# virtual methods
.method public final a()Ljava/util/Set;
    .locals 1

    .line 1
    iget-object v0, p0, Lkotlin/collections/builders/SetBuilder;->c:Lkotlin/collections/builders/MapBuilder;

    .line 2
    .line 3
    invoke-virtual {v0}, Lkotlin/collections/builders/MapBuilder;->p()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lrc/j;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-lez v0, :cond_0

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    sget-object v0, Lkotlin/collections/builders/SetBuilder;->e:Lkotlin/collections/builders/SetBuilder;

    .line 14
    .line 15
    return-object v0
.end method

.method public add(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lkotlin/collections/builders/SetBuilder;->c:Lkotlin/collections/builders/MapBuilder;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lkotlin/collections/builders/MapBuilder;->n(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-ltz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    return p1

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    return p1
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 1

    .line 1
    const-string v0, "elements"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lkotlin/collections/builders/SetBuilder;->c:Lkotlin/collections/builders/MapBuilder;

    .line 7
    .line 8
    invoke-virtual {v0}, Lkotlin/collections/builders/MapBuilder;->r()V

    .line 9
    .line 10
    .line 11
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
.end method

.method public clear()V
    .locals 1

    .line 1
    iget-object v0, p0, Lkotlin/collections/builders/SetBuilder;->c:Lkotlin/collections/builders/MapBuilder;

    .line 2
    .line 3
    invoke-virtual {v0}, Lkotlin/collections/builders/MapBuilder;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lkotlin/collections/builders/SetBuilder;->c:Lkotlin/collections/builders/MapBuilder;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lkotlin/collections/builders/MapBuilder;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public getSize()I
    .locals 1

    .line 1
    iget-object v0, p0, Lkotlin/collections/builders/SetBuilder;->c:Lkotlin/collections/builders/MapBuilder;

    .line 2
    .line 3
    invoke-virtual {v0}, Lkotlin/collections/builders/MapBuilder;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public isEmpty()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lkotlin/collections/builders/SetBuilder;->c:Lkotlin/collections/builders/MapBuilder;

    .line 2
    .line 3
    invoke-virtual {v0}, Lkotlin/collections/builders/MapBuilder;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    iget-object v0, p0, Lkotlin/collections/builders/SetBuilder;->c:Lkotlin/collections/builders/MapBuilder;

    .line 2
    .line 3
    invoke-virtual {v0}, Lkotlin/collections/builders/MapBuilder;->N()Lkotlin/collections/builders/MapBuilder$e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lkotlin/collections/builders/SetBuilder;->c:Lkotlin/collections/builders/MapBuilder;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lkotlin/collections/builders/MapBuilder;->W(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 1

    .line 1
    const-string v0, "elements"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lkotlin/collections/builders/SetBuilder;->c:Lkotlin/collections/builders/MapBuilder;

    .line 7
    .line 8
    invoke-virtual {v0}, Lkotlin/collections/builders/MapBuilder;->r()V

    .line 9
    .line 10
    .line 11
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->removeAll(Ljava/util/Collection;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 1

    .line 1
    const-string v0, "elements"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lkotlin/collections/builders/SetBuilder;->c:Lkotlin/collections/builders/MapBuilder;

    .line 7
    .line 8
    invoke-virtual {v0}, Lkotlin/collections/builders/MapBuilder;->r()V

    .line 9
    .line 10
    .line 11
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->retainAll(Ljava/util/Collection;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
.end method
