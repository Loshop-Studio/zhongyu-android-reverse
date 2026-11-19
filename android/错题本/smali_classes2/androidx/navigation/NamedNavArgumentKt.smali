.class public final Landroidx/navigation/NamedNavArgumentKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "androidx/navigation/NamedNavArgumentKt__NamedNavArgumentKt"
    }
    k = 0x4
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final navArgument(Ljava/lang/String;Lr6/c;)Landroidx/navigation/NamedNavArgument;
    .locals 0
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lr6/c;",
            ")",
            "Landroidx/navigation/NamedNavArgument;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-static {p0, p1}, Landroidx/navigation/NamedNavArgumentKt__NamedNavArgumentKt;->navArgument(Ljava/lang/String;Lr6/c;)Landroidx/navigation/NamedNavArgument;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
