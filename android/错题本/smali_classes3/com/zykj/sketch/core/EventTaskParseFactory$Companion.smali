.class public final Lcom/zykj/sketch/core/EventTaskParseFactory$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/sketch/core/EventTaskParseFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/zykj/sketch/core/EventTaskParseFactory$Companion;",
        "",
        "()V",
        "create",
        "Lcom/zykj/sketch/core/version/ITaskParse;",
        "versionCode",
        "",
        "sketch_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/sketch/core/EventTaskParseFactory$Companion;-><init>()V

    return-void
.end method

.method public static synthetic create$default(Lcom/zykj/sketch/core/EventTaskParseFactory$Companion;IILjava/lang/Object;)Lcom/zykj/sketch/core/version/ITaskParse;
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x5

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Lcom/zykj/sketch/core/EventTaskParseFactory$Companion;->create(I)Lcom/zykj/sketch/core/version/ITaskParse;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method


# virtual methods
.method public final create(I)Lcom/zykj/sketch/core/version/ITaskParse;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p1, v0, :cond_4

    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    if-eq p1, v0, :cond_3

    .line 6
    .line 7
    const/4 v0, 0x3

    .line 8
    if-eq p1, v0, :cond_2

    .line 9
    .line 10
    const/4 v0, 0x4

    .line 11
    if-eq p1, v0, :cond_1

    .line 12
    .line 13
    const/4 v0, 0x5

    .line 14
    if-eq p1, v0, :cond_0

    .line 15
    .line 16
    new-instance p1, Lcom/zykj/sketch/core/version/GraphTaskParseVersion2;

    .line 17
    .line 18
    invoke-direct {p1}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion2;-><init>()V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    new-instance p1, Lcom/zykj/sketch/core/version/GraphTaskParseVersion5;

    .line 23
    .line 24
    invoke-direct {p1}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion5;-><init>()V

    .line 25
    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_1
    new-instance p1, Lcom/zykj/sketch/core/version/GraphTaskParseVersion4;

    .line 29
    .line 30
    invoke-direct {p1}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion4;-><init>()V

    .line 31
    .line 32
    .line 33
    return-object p1

    .line 34
    :cond_2
    new-instance p1, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3;

    .line 35
    .line 36
    invoke-direct {p1}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion3;-><init>()V

    .line 37
    .line 38
    .line 39
    return-object p1

    .line 40
    :cond_3
    new-instance p1, Lcom/zykj/sketch/core/version/GraphTaskParseVersion2;

    .line 41
    .line 42
    invoke-direct {p1}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion2;-><init>()V

    .line 43
    .line 44
    .line 45
    return-object p1

    .line 46
    :cond_4
    new-instance p1, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;

    .line 47
    .line 48
    invoke-direct {p1}, Lcom/zykj/sketch/core/version/GraphTaskParseVersion1;-><init>()V

    .line 49
    .line 50
    .line 51
    return-object p1
.end method
