.class public final Landroidx/paging/PagingData$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/paging/PagingData;
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
    invoke-direct {p0}, Landroidx/paging/PagingData$Companion;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)Landroidx/paging/PageEvent$Insert;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/paging/PagingData$Companion;->empty$lambda$1(Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)Landroidx/paging/PageEvent$Insert;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/util/List;IILandroidx/paging/LoadStates;Landroidx/paging/LoadStates;)Landroidx/paging/PageEvent$Insert;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/paging/PagingData$Companion;->from$lambda$1(Ljava/util/List;IILandroidx/paging/LoadStates;Landroidx/paging/LoadStates;)Landroidx/paging/PageEvent$Insert;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Landroidx/paging/PageEvent$Insert;
    .locals 1

    .line 1
    invoke-static {}, Landroidx/paging/PagingData$Companion;->empty$lambda$0()Landroidx/paging/PageEvent$Insert;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(Ljava/util/List;II)Landroidx/paging/PageEvent$Insert;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/paging/PagingData$Companion;->from$lambda$0(Ljava/util/List;II)Landroidx/paging/PageEvent$Insert;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic empty$default(Landroidx/paging/PagingData$Companion;Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;ILjava/lang/Object;)Landroidx/paging/PagingData;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Landroidx/paging/PagingData$Companion;->empty(Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)Landroidx/paging/PagingData;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private static final empty$lambda$0()Landroidx/paging/PageEvent$Insert;
    .locals 6

    .line 1
    sget-object v0, Landroidx/paging/PageEvent$Insert;->Companion:Landroidx/paging/PageEvent$Insert$Companion;

    .line 2
    .line 3
    new-instance v1, Landroidx/paging/TransformablePage;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    invoke-direct {v1, v2, v3}, Landroidx/paging/TransformablePage;-><init>(ILjava/util/List;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v1}, Lrc/v;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    sget-object v2, Landroidx/paging/LoadStates;->Companion:Landroidx/paging/LoadStates$Companion;

    .line 18
    .line 19
    invoke-virtual {v2}, Landroidx/paging/LoadStates$Companion;->getIDLE()Landroidx/paging/LoadStates;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    const/4 v5, 0x0

    .line 24
    const/4 v2, 0x0

    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-virtual/range {v0 .. v5}, Landroidx/paging/PageEvent$Insert$Companion;->Refresh(Ljava/util/List;IILandroidx/paging/LoadStates;Landroidx/paging/LoadStates;)Landroidx/paging/PageEvent$Insert;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    return-object v0
.end method

.method private static final empty$lambda$1(Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)Landroidx/paging/PageEvent$Insert;
    .locals 6

    .line 1
    sget-object v0, Landroidx/paging/PageEvent$Insert;->Companion:Landroidx/paging/PageEvent$Insert$Companion;

    .line 2
    .line 3
    new-instance v1, Landroidx/paging/TransformablePage;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    invoke-direct {v1, v2, v3}, Landroidx/paging/TransformablePage;-><init>(ILjava/util/List;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v1}, Lrc/v;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v3, 0x0

    .line 18
    move-object v4, p0

    .line 19
    move-object v5, p1

    .line 20
    invoke-virtual/range {v0 .. v5}, Landroidx/paging/PageEvent$Insert$Companion;->Refresh(Ljava/util/List;IILandroidx/paging/LoadStates;Landroidx/paging/LoadStates;)Landroidx/paging/PageEvent$Insert;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public static synthetic from$default(Landroidx/paging/PagingData$Companion;Ljava/util/List;IIILjava/lang/Object;)Landroidx/paging/PagingData;
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move p3, v0

    .line 1
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Landroidx/paging/PagingData$Companion;->from(Ljava/util/List;II)Landroidx/paging/PagingData;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic from$default(Landroidx/paging/PagingData$Companion;Ljava/util/List;Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;IIILjava/lang/Object;)Landroidx/paging/PagingData;
    .locals 6

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    const/4 p3, 0x0

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p6, 0x8

    const/4 p7, 0x0

    if-eqz p3, :cond_1

    move v4, p7

    goto :goto_0

    :cond_1
    move v4, p4

    :goto_0
    and-int/lit8 p3, p6, 0x10

    if-eqz p3, :cond_2

    move v5, p7

    :goto_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    goto :goto_2

    :cond_2
    move v5, p5

    goto :goto_1

    .line 2
    :goto_2
    invoke-virtual/range {v0 .. v5}, Landroidx/paging/PagingData$Companion;->from(Ljava/util/List;Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;II)Landroidx/paging/PagingData;

    move-result-object p0

    return-object p0
.end method

.method private static final from$lambda$0(Ljava/util/List;II)Landroidx/paging/PageEvent$Insert;
    .locals 6

    .line 1
    sget-object v0, Landroidx/paging/PageEvent$Insert;->Companion:Landroidx/paging/PageEvent$Insert$Companion;

    .line 2
    .line 3
    new-instance v1, Landroidx/paging/TransformablePage;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, v2, p0}, Landroidx/paging/TransformablePage;-><init>(ILjava/util/List;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v1}, Lrc/v;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    sget-object p0, Landroidx/paging/LoadStates;->Companion:Landroidx/paging/LoadStates$Companion;

    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/paging/LoadStates$Companion;->getIDLE()Landroidx/paging/LoadStates;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    const/4 v5, 0x0

    .line 20
    move v2, p1

    .line 21
    move v3, p2

    .line 22
    invoke-virtual/range {v0 .. v5}, Landroidx/paging/PageEvent$Insert$Companion;->Refresh(Ljava/util/List;IILandroidx/paging/LoadStates;Landroidx/paging/LoadStates;)Landroidx/paging/PageEvent$Insert;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method private static final from$lambda$1(Ljava/util/List;IILandroidx/paging/LoadStates;Landroidx/paging/LoadStates;)Landroidx/paging/PageEvent$Insert;
    .locals 6

    .line 1
    sget-object v0, Landroidx/paging/PageEvent$Insert;->Companion:Landroidx/paging/PageEvent$Insert$Companion;

    .line 2
    .line 3
    new-instance v1, Landroidx/paging/TransformablePage;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, v2, p0}, Landroidx/paging/TransformablePage;-><init>(ILjava/util/List;)V

    .line 7
    .line 8
    .line 9
    invoke-static {v1}, Lrc/v;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    move v2, p1

    .line 14
    move v3, p2

    .line 15
    move-object v4, p3

    .line 16
    move-object v5, p4

    .line 17
    invoke-virtual/range {v0 .. v5}, Landroidx/paging/PageEvent$Insert$Companion;->Refresh(Ljava/util/List;IILandroidx/paging/LoadStates;Landroidx/paging/LoadStates;)Landroidx/paging/PageEvent$Insert;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method


# virtual methods
.method public final empty()Landroidx/paging/PagingData;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Landroidx/paging/PagingData<",
            "TT;>;"
        }
    .end annotation

    .line 2
    new-instance v0, Landroidx/paging/PagingData;

    .line 3
    new-instance v1, Landroidx/paging/PageEvent$StaticList;

    .line 4
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    move-result-object v2

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 5
    invoke-direct/range {v1 .. v8}, Landroidx/paging/PageEvent$StaticList;-><init>(Ljava/util/List;Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;IIILkotlin/jvm/internal/n;)V

    .line 6
    invoke-static {v1}, Lvd/e;->C(Ljava/lang/Object;)Lvd/c;

    move-result-object v1

    .line 7
    invoke-virtual {p0}, Landroidx/paging/PagingData$Companion;->getNOOP_UI_RECEIVER$paging_common()Landroidx/paging/UiReceiver;

    move-result-object v2

    .line 8
    invoke-virtual {p0}, Landroidx/paging/PagingData$Companion;->getNOOP_HINT_RECEIVER$paging_common()Landroidx/paging/HintReceiver;

    move-result-object v3

    new-instance v4, Landroidx/paging/s0;

    invoke-direct {v4}, Landroidx/paging/s0;-><init>()V

    .line 9
    invoke-direct {v0, v1, v2, v3, v4}, Landroidx/paging/PagingData;-><init>(Lvd/c;Landroidx/paging/UiReceiver;Landroidx/paging/HintReceiver;Lhd/a;)V

    return-object v0
.end method

.method public final empty(Landroidx/paging/LoadStates;)Landroidx/paging/PagingData;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/paging/LoadStates;",
            ")",
            "Landroidx/paging/PagingData<",
            "TT;>;"
        }
    .end annotation

    .line 1
    const-string v0, "sourceLoadStates"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Landroidx/paging/PagingData$Companion;->empty$default(Landroidx/paging/PagingData$Companion;Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;ILjava/lang/Object;)Landroidx/paging/PagingData;

    move-result-object p1

    return-object p1
.end method

.method public final empty(Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)Landroidx/paging/PagingData;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/paging/LoadStates;",
            "Landroidx/paging/LoadStates;",
            ")",
            "Landroidx/paging/PagingData<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "sourceLoadStates"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    new-instance v0, Landroidx/paging/PagingData;

    .line 11
    new-instance v1, Landroidx/paging/PageEvent$StaticList;

    .line 12
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    move-result-object v2

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v3, p1

    move-object v4, p2

    .line 13
    invoke-direct/range {v1 .. v8}, Landroidx/paging/PageEvent$StaticList;-><init>(Ljava/util/List;Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;IIILkotlin/jvm/internal/n;)V

    .line 14
    invoke-static {v1}, Lvd/e;->C(Ljava/lang/Object;)Lvd/c;

    move-result-object p1

    .line 15
    invoke-virtual {p0}, Landroidx/paging/PagingData$Companion;->getNOOP_UI_RECEIVER$paging_common()Landroidx/paging/UiReceiver;

    move-result-object p2

    .line 16
    invoke-virtual {p0}, Landroidx/paging/PagingData$Companion;->getNOOP_HINT_RECEIVER$paging_common()Landroidx/paging/HintReceiver;

    move-result-object v1

    .line 17
    new-instance v2, Landroidx/paging/u0;

    invoke-direct {v2, v3, v4}, Landroidx/paging/u0;-><init>(Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)V

    .line 18
    invoke-direct {v0, p1, p2, v1, v2}, Landroidx/paging/PagingData;-><init>(Lvd/c;Landroidx/paging/UiReceiver;Landroidx/paging/HintReceiver;Lhd/a;)V

    return-object v0
.end method

.method public final from(Ljava/util/List;)Landroidx/paging/PagingData;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "+TT;>;)",
            "Landroidx/paging/PagingData<",
            "TT;>;"
        }
    .end annotation

    .line 1
    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Landroidx/paging/PagingData$Companion;->from$default(Landroidx/paging/PagingData$Companion;Ljava/util/List;IIILjava/lang/Object;)Landroidx/paging/PagingData;

    move-result-object p1

    return-object p1
.end method

.method public final from(Ljava/util/List;I)Landroidx/paging/PagingData;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "+TT;>;I)",
            "Landroidx/paging/PagingData<",
            "TT;>;"
        }
    .end annotation

    .line 2
    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    invoke-static/range {v1 .. v6}, Landroidx/paging/PagingData$Companion;->from$default(Landroidx/paging/PagingData$Companion;Ljava/util/List;IIILjava/lang/Object;)Landroidx/paging/PagingData;

    move-result-object p1

    return-object p1
.end method

.method public final from(Ljava/util/List;II)Landroidx/paging/PagingData;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "+TT;>;II)",
            "Landroidx/paging/PagingData<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    new-instance v0, Landroidx/paging/PagingData;

    .line 7
    new-instance v1, Landroidx/paging/PageEvent$StaticList;

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p1

    move v5, p2

    move v6, p3

    invoke-direct/range {v1 .. v6}, Landroidx/paging/PageEvent$StaticList;-><init>(Ljava/util/List;Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;II)V

    .line 8
    invoke-static {v1}, Lvd/e;->C(Ljava/lang/Object;)Lvd/c;

    move-result-object p1

    .line 9
    invoke-virtual {p0}, Landroidx/paging/PagingData$Companion;->getNOOP_UI_RECEIVER$paging_common()Landroidx/paging/UiReceiver;

    move-result-object p2

    .line 10
    invoke-virtual {p0}, Landroidx/paging/PagingData$Companion;->getNOOP_HINT_RECEIVER$paging_common()Landroidx/paging/HintReceiver;

    move-result-object p3

    .line 11
    new-instance v1, Landroidx/paging/t0;

    invoke-direct {v1, v2, v5, v6}, Landroidx/paging/t0;-><init>(Ljava/util/List;II)V

    .line 12
    invoke-direct {v0, p1, p2, p3, v1}, Landroidx/paging/PagingData;-><init>(Lvd/c;Landroidx/paging/UiReceiver;Landroidx/paging/HintReceiver;Lhd/a;)V

    return-object v0
.end method

.method public final from(Ljava/util/List;Landroidx/paging/LoadStates;)Landroidx/paging/PagingData;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "+TT;>;",
            "Landroidx/paging/LoadStates;",
            ")",
            "Landroidx/paging/PagingData<",
            "TT;>;"
        }
    .end annotation

    .line 3
    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sourceLoadStates"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v7, 0x1c

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v8}, Landroidx/paging/PagingData$Companion;->from$default(Landroidx/paging/PagingData$Companion;Ljava/util/List;Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;IIILjava/lang/Object;)Landroidx/paging/PagingData;

    move-result-object p1

    return-object p1
.end method

.method public final from(Ljava/util/List;Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;)Landroidx/paging/PagingData;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "+TT;>;",
            "Landroidx/paging/LoadStates;",
            "Landroidx/paging/LoadStates;",
            ")",
            "Landroidx/paging/PagingData<",
            "TT;>;"
        }
    .end annotation

    .line 4
    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sourceLoadStates"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-static/range {v1 .. v8}, Landroidx/paging/PagingData$Companion;->from$default(Landroidx/paging/PagingData$Companion;Ljava/util/List;Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;IIILjava/lang/Object;)Landroidx/paging/PagingData;

    move-result-object p1

    return-object p1
.end method

.method public final from(Ljava/util/List;Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;I)Landroidx/paging/PagingData;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "+TT;>;",
            "Landroidx/paging/LoadStates;",
            "Landroidx/paging/LoadStates;",
            "I)",
            "Landroidx/paging/PagingData<",
            "TT;>;"
        }
    .end annotation

    .line 5
    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sourceLoadStates"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-static/range {v1 .. v8}, Landroidx/paging/PagingData$Companion;->from$default(Landroidx/paging/PagingData$Companion;Ljava/util/List;Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;IIILjava/lang/Object;)Landroidx/paging/PagingData;

    move-result-object p1

    return-object p1
.end method

.method public final from(Ljava/util/List;Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;II)Landroidx/paging/PagingData;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "+TT;>;",
            "Landroidx/paging/LoadStates;",
            "Landroidx/paging/LoadStates;",
            "II)",
            "Landroidx/paging/PagingData<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sourceLoadStates"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    new-instance v0, Landroidx/paging/PagingData;

    .line 14
    new-instance v1, Landroidx/paging/PageEvent$StaticList;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Landroidx/paging/PageEvent$StaticList;-><init>(Ljava/util/List;Landroidx/paging/LoadStates;Landroidx/paging/LoadStates;II)V

    .line 15
    invoke-static {v1}, Lvd/e;->C(Ljava/lang/Object;)Lvd/c;

    move-result-object p1

    .line 16
    invoke-virtual {p0}, Landroidx/paging/PagingData$Companion;->getNOOP_UI_RECEIVER$paging_common()Landroidx/paging/UiReceiver;

    move-result-object p2

    .line 17
    invoke-virtual {p0}, Landroidx/paging/PagingData$Companion;->getNOOP_HINT_RECEIVER$paging_common()Landroidx/paging/HintReceiver;

    move-result-object p3

    move-object v7, v4

    move v4, v5

    move v5, v6

    move-object v6, v3

    move-object v3, v2

    .line 18
    new-instance v2, Landroidx/paging/r0;

    invoke-direct/range {v2 .. v7}, Landroidx/paging/r0;-><init>(Ljava/util/List;IILandroidx/paging/LoadStates;Landroidx/paging/LoadStates;)V

    .line 19
    invoke-direct {v0, p1, p2, p3, v2}, Landroidx/paging/PagingData;-><init>(Lvd/c;Landroidx/paging/UiReceiver;Landroidx/paging/HintReceiver;Lhd/a;)V

    return-object v0
.end method

.method public final getNOOP_HINT_RECEIVER$paging_common()Landroidx/paging/HintReceiver;
    .locals 1

    .line 1
    invoke-static {}, Landroidx/paging/PagingData;->access$getNOOP_HINT_RECEIVER$cp()Landroidx/paging/HintReceiver;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final getNOOP_UI_RECEIVER$paging_common()Landroidx/paging/UiReceiver;
    .locals 1

    .line 1
    invoke-static {}, Landroidx/paging/PagingData;->access$getNOOP_UI_RECEIVER$cp()Landroidx/paging/UiReceiver;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
