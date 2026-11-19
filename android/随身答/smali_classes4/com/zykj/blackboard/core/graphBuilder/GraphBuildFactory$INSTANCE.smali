.class final Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory$INSTANCE;
.super Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "INSTANCE"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0001\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory$INSTANCE;",
        "Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;",
        "Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;",
        "graphData",
        "Ll5/e;",
        "sourceLoad",
        "Lg5/a;",
        "c",
        "(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;Ll5/e;)Lg5/a;",
        "",
        "Lcom/zykj/board/EzyGraphEnum$GraphEnum;",
        "Lk5/d;",
        "Ljava/util/Map;",
        "buildMap",
        "blackboard_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field public final c:Ljava/util/Map;


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    .line 4
    .line 5
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory$INSTANCE;->c:Ljava/util/Map;

    .line 11
    .line 12
    sget-object p2, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->b:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 13
    .line 14
    new-instance v0, Lk5/b;

    .line 15
    .line 16
    invoke-direct {v0}, Lk5/b;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    sget-object p2, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->e:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 23
    .line 24
    new-instance v0, Lk5/g;

    .line 25
    .line 26
    invoke-direct {v0}, Lk5/g;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    sget-object p2, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->f:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 33
    .line 34
    new-instance v0, Lk5/a;

    .line 35
    .line 36
    invoke-direct {v0}, Lk5/a;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    sget-object p2, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->d:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 43
    .line 44
    new-instance v0, Lk5/f;

    .line 45
    .line 46
    invoke-direct {v0}, Lk5/f;-><init>()V

    .line 47
    .line 48
    .line 49
    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    sget-object p2, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->c:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 53
    .line 54
    new-instance v0, Lk5/e;

    .line 55
    .line 56
    invoke-direct {v0}, Lk5/e;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    sget-object p2, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->g:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 63
    .line 64
    new-instance v0, Lk5/h;

    .line 65
    .line 66
    invoke-direct {v0}, Lk5/h;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    sget-object p2, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->h:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 73
    .line 74
    new-instance v0, Lk5/c;

    .line 75
    .line 76
    invoke-direct {v0}, Lk5/c;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-interface {p1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    return-void
.end method


# virtual methods
.method public c(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;Ll5/e;)Lg5/a;
    .locals 2

    .line 1
    const-string v0, "graphData"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "sourceLoad"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory$INSTANCE;->c:Ljava/util/Map;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->E()Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lk5/d;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-interface {v0, p1, p2}, Lk5/d;->a(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;Ll5/e;)Lg5/a;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1

    .line 30
    :cond_0
    const/4 p1, 0x0

    .line 31
    return-object p1
.end method
