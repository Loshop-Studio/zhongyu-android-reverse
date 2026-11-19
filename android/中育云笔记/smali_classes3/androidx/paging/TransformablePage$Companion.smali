.class public final Landroidx/paging/TransformablePage$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/paging/TransformablePage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/paging/TransformablePage$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final empty()Landroidx/paging/TransformablePage;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Landroidx/paging/TransformablePage<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/paging/TransformablePage;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    invoke-direct {v0, v1, v2}, Landroidx/paging/TransformablePage;-><init>(ILjava/util/List;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
