.class public interface abstract Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/tooling/preview/PreviewParameterProvider$DefaultImpls;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# direct methods
.method public static synthetic access$getCount$jd(Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;)I
    .locals 0

    .line 1
    invoke-super {p0}, Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;->getCount()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 1
    invoke-interface {p0}, Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;->getValues()Lpd/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lpd/q;->p(Lpd/g;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public abstract getValues()Lpd/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lpd/g;"
        }
    .end annotation
.end method
