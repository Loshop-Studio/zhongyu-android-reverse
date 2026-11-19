.class public interface abstract Landroidx/compose/ui/Modifier$Element;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/Modifier;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/compose/ui/Modifier;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Element"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/Modifier$Element$DefaultImpls;
    }
.end annotation


# direct methods
.method public static synthetic access$all$jd(Landroidx/compose/ui/Modifier$Element;Lhd/l;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/compose/ui/Modifier$Element;->all(Lhd/l;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic access$any$jd(Landroidx/compose/ui/Modifier$Element;Lhd/l;)Z
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/compose/ui/Modifier$Element;->any(Lhd/l;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic access$foldIn$jd(Landroidx/compose/ui/Modifier$Element;Ljava/lang/Object;Lhd/p;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/compose/ui/Modifier$Element;->foldIn(Ljava/lang/Object;Lhd/p;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic access$foldOut$jd(Landroidx/compose/ui/Modifier$Element;Ljava/lang/Object;Lhd/p;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/compose/ui/Modifier$Element;->foldOut(Ljava/lang/Object;Lhd/p;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic access$then$jd(Landroidx/compose/ui/Modifier$Element;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public all(Lhd/l;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            ")Z"
        }
    .end annotation

    .line 1
    invoke-interface {p1, p0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public any(Lhd/l;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhd/l;",
            ")Z"
        }
    .end annotation

    .line 1
    invoke-interface {p1, p0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public foldIn(Ljava/lang/Object;Lhd/p;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "Lhd/p;",
            ")TR;"
        }
    .end annotation

    .line 1
    invoke-interface {p2, p1, p0}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public foldOut(Ljava/lang/Object;Lhd/p;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(TR;",
            "Lhd/p;",
            ")TR;"
        }
    .end annotation

    .line 1
    invoke-interface {p2, p0, p1}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
