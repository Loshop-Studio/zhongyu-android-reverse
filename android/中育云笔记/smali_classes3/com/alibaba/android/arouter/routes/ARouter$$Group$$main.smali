.class public Lcom/alibaba/android/arouter/routes/ARouter$$Group$$main;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/alibaba/android/arouter/facade/template/IRouteGroup;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public loadInto(Ljava/util/Map;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/alibaba/android/arouter/facade/model/RouteMeta;",
            ">;)V"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/alibaba/android/arouter/facade/enums/RouteType;->ACTIVITY:Lcom/alibaba/android/arouter/facade/enums/RouteType;

    .line 2
    .line 3
    new-instance v4, Lcom/alibaba/android/arouter/routes/ARouter$$Group$$main$1;

    .line 4
    .line 5
    invoke-direct {v4, p0}, Lcom/alibaba/android/arouter/routes/ARouter$$Group$$main$1;-><init>(Lcom/alibaba/android/arouter/routes/ARouter$$Group$$main;)V

    .line 6
    .line 7
    .line 8
    const/4 v5, -0x1

    .line 9
    const/high16 v6, -0x80000000

    .line 10
    .line 11
    const-class v1, Lcom/friday/main/view/FolderMoveActivity;

    .line 12
    .line 13
    const-string v2, "/main/foldermoveactivity"

    .line 14
    .line 15
    const-string v3, "main"

    .line 16
    .line 17
    invoke-static/range {v0 .. v6}, Lcom/alibaba/android/arouter/facade/model/RouteMeta;->build(Lcom/alibaba/android/arouter/facade/enums/RouteType;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;II)Lcom/alibaba/android/arouter/facade/model/RouteMeta;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v2, "/main/FolderMoveActivity"

    .line 22
    .line 23
    invoke-interface {p1, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    const-class v1, Lcom/friday/main/view/HomeActivity;

    .line 27
    .line 28
    const-string v2, "/main/homeactivity"

    .line 29
    .line 30
    const-string v3, "main"

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    invoke-static/range {v0 .. v6}, Lcom/alibaba/android/arouter/facade/model/RouteMeta;->build(Lcom/alibaba/android/arouter/facade/enums/RouteType;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;II)Lcom/alibaba/android/arouter/facade/model/RouteMeta;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const-string v2, "/main/HomeActivity"

    .line 38
    .line 39
    invoke-interface {p1, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    new-instance v4, Lcom/alibaba/android/arouter/routes/ARouter$$Group$$main$2;

    .line 43
    .line 44
    invoke-direct {v4, p0}, Lcom/alibaba/android/arouter/routes/ARouter$$Group$$main$2;-><init>(Lcom/alibaba/android/arouter/routes/ARouter$$Group$$main;)V

    .line 45
    .line 46
    .line 47
    const-class v1, Lcom/friday/main/view/FullScreenPreviewActivity;

    .line 48
    .line 49
    const-string v2, "/main/notepreviewactivity"

    .line 50
    .line 51
    const-string v3, "main"

    .line 52
    .line 53
    invoke-static/range {v0 .. v6}, Lcom/alibaba/android/arouter/facade/model/RouteMeta;->build(Lcom/alibaba/android/arouter/facade/enums/RouteType;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;II)Lcom/alibaba/android/arouter/facade/model/RouteMeta;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    const-string v2, "/main/NotePreviewActivity"

    .line 58
    .line 59
    invoke-interface {p1, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    const-class v1, Lcom/friday/main/view/SearchActivity;

    .line 63
    .line 64
    const-string v2, "/main/searchactivity"

    .line 65
    .line 66
    const-string v3, "main"

    .line 67
    .line 68
    const/4 v4, 0x0

    .line 69
    invoke-static/range {v0 .. v6}, Lcom/alibaba/android/arouter/facade/model/RouteMeta;->build(Lcom/alibaba/android/arouter/facade/enums/RouteType;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;II)Lcom/alibaba/android/arouter/facade/model/RouteMeta;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    const-string v1, "/main/SearchActivity"

    .line 74
    .line 75
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    return-void
.end method
