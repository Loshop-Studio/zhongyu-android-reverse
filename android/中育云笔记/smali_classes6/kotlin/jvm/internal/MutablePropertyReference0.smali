.class public abstract Lkotlin/jvm/internal/MutablePropertyReference0;
.super Lkotlin/jvm/internal/MutablePropertyReference;
.source "SourceFile"

# interfaces
.implements Lod/i;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lkotlin/jvm/internal/MutablePropertyReference;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public computeReflected()Lod/b;
    .locals 1

    .line 1
    invoke-static {p0}, Lkotlin/jvm/internal/y;->d(Lkotlin/jvm/internal/MutablePropertyReference0;)Lod/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public getDelegate()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkotlin/jvm/internal/PropertyReference;->getReflected()Lod/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lod/i;

    .line 6
    .line 7
    invoke-interface {v0}, Lod/m;->getDelegate()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public bridge synthetic getGetter()Lod/l$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkotlin/jvm/internal/MutablePropertyReference0;->getGetter()Lod/m$a;

    const/4 v0, 0x0

    return-object v0
.end method

.method public getGetter()Lod/m$a;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lkotlin/jvm/internal/PropertyReference;->getReflected()Lod/l;

    move-result-object v0

    check-cast v0, Lod/i;

    invoke-interface {v0}, Lod/m;->getGetter()Lod/m$a;

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic getSetter()Lod/h;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkotlin/jvm/internal/MutablePropertyReference0;->getSetter()Lod/i$a;

    const/4 v0, 0x0

    return-object v0
.end method

.method public getSetter()Lod/i$a;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lkotlin/jvm/internal/PropertyReference;->getReflected()Lod/l;

    move-result-object v0

    check-cast v0, Lod/i;

    invoke-interface {v0}, Lod/i;->getSetter()Lod/i$a;

    const/4 v0, 0x0

    return-object v0
.end method

.method public invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-interface {p0}, Lod/m;->get()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
