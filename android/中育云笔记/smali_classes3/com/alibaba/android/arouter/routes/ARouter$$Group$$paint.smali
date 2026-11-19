.class public Lcom/alibaba/android/arouter/routes/ARouter$$Group$$paint;
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
    new-instance v4, Lcom/alibaba/android/arouter/routes/ARouter$$Group$$paint$1;

    .line 4
    .line 5
    invoke-direct {v4, p0}, Lcom/alibaba/android/arouter/routes/ARouter$$Group$$paint$1;-><init>(Lcom/alibaba/android/arouter/routes/ARouter$$Group$$paint;)V

    .line 6
    .line 7
    .line 8
    const/4 v5, -0x1

    .line 9
    const/high16 v6, -0x80000000

    .line 10
    .line 11
    const-class v1, Lcom/friday/paint/view/six/NewNoteActivity;

    .line 12
    .line 13
    const-string v2, "/paint/newnoteactivity"

    .line 14
    .line 15
    const-string v3, "paint"

    .line 16
    .line 17
    invoke-static/range {v0 .. v6}, Lcom/alibaba/android/arouter/facade/model/RouteMeta;->build(Lcom/alibaba/android/arouter/facade/enums/RouteType;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;II)Lcom/alibaba/android/arouter/facade/model/RouteMeta;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v2, "/paint/NewNoteActivity"

    .line 22
    .line 23
    invoke-interface {p1, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    new-instance v4, Lcom/alibaba/android/arouter/routes/ARouter$$Group$$paint$2;

    .line 27
    .line 28
    invoke-direct {v4, p0}, Lcom/alibaba/android/arouter/routes/ARouter$$Group$$paint$2;-><init>(Lcom/alibaba/android/arouter/routes/ARouter$$Group$$paint;)V

    .line 29
    .line 30
    .line 31
    const-class v1, Lcom/friday/paint/view/NoteActivity;

    .line 32
    .line 33
    const-string v2, "/paint/noteactivity"

    .line 34
    .line 35
    const-string v3, "paint"

    .line 36
    .line 37
    invoke-static/range {v0 .. v6}, Lcom/alibaba/android/arouter/facade/model/RouteMeta;->build(Lcom/alibaba/android/arouter/facade/enums/RouteType;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;II)Lcom/alibaba/android/arouter/facade/model/RouteMeta;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const-string v1, "/paint/NoteActivity"

    .line 42
    .line 43
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    return-void
.end method
