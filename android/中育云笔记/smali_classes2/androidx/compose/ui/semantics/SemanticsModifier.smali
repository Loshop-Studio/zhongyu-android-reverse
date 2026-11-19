.class public interface abstract Landroidx/compose/ui/semantics/SemanticsModifier;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/Modifier$Element;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/semantics/SemanticsModifier$DefaultImpls;
    }
.end annotation


# direct methods
.method public static synthetic access$all$jd(Landroidx/compose/ui/semantics/SemanticsModifier;Lhd/l;)Z
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

.method public static synthetic access$any$jd(Landroidx/compose/ui/semantics/SemanticsModifier;Lhd/l;)Z
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

.method public static synthetic access$foldIn$jd(Landroidx/compose/ui/semantics/SemanticsModifier;Ljava/lang/Object;Lhd/p;)Ljava/lang/Object;
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

.method public static synthetic access$foldOut$jd(Landroidx/compose/ui/semantics/SemanticsModifier;Ljava/lang/Object;Lhd/p;)Ljava/lang/Object;
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

.method public static synthetic access$getId$jd(Landroidx/compose/ui/semantics/SemanticsModifier;)I
    .locals 0

    .line 1
    invoke-super {p0}, Landroidx/compose/ui/semantics/SemanticsModifier;->getId()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic access$then$jd(Landroidx/compose/ui/semantics/SemanticsModifier;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
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
.method public getId()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method

.method public abstract getSemanticsConfiguration()Landroidx/compose/ui/semantics/SemanticsConfiguration;
.end method
