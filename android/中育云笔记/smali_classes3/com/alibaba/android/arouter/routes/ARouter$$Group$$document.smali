.class public Lcom/alibaba/android/arouter/routes/ARouter$$Group$$document;
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
    new-instance v4, Lcom/alibaba/android/arouter/routes/ARouter$$Group$$document$1;

    .line 4
    .line 5
    invoke-direct {v4, p0}, Lcom/alibaba/android/arouter/routes/ARouter$$Group$$document$1;-><init>(Lcom/alibaba/android/arouter/routes/ARouter$$Group$$document;)V

    .line 6
    .line 7
    .line 8
    const/4 v5, -0x1

    .line 9
    const/high16 v6, -0x80000000

    .line 10
    .line 11
    const-class v1, Lcom/friday/document/view/viewer/ImagePreviewActivity;

    .line 12
    .line 13
    const-string v2, "/document/image_preview_activity"

    .line 14
    .line 15
    const-string v3, "document"

    .line 16
    .line 17
    invoke-static/range {v0 .. v6}, Lcom/alibaba/android/arouter/facade/model/RouteMeta;->build(Lcom/alibaba/android/arouter/facade/enums/RouteType;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;II)Lcom/alibaba/android/arouter/facade/model/RouteMeta;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v2, "/document/IMAGE_PREVIEW_ACTIVITY"

    .line 22
    .line 23
    invoke-interface {p1, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    new-instance v4, Lcom/alibaba/android/arouter/routes/ARouter$$Group$$document$2;

    .line 27
    .line 28
    invoke-direct {v4, p0}, Lcom/alibaba/android/arouter/routes/ARouter$$Group$$document$2;-><init>(Lcom/alibaba/android/arouter/routes/ARouter$$Group$$document;)V

    .line 29
    .line 30
    .line 31
    const-class v1, Lcom/friday/document/view/viewer/MicroClassPlayActivity;

    .line 32
    .line 33
    const-string v2, "/document/micro_class_activity"

    .line 34
    .line 35
    const-string v3, "document"

    .line 36
    .line 37
    invoke-static/range {v0 .. v6}, Lcom/alibaba/android/arouter/facade/model/RouteMeta;->build(Lcom/alibaba/android/arouter/facade/enums/RouteType;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;II)Lcom/alibaba/android/arouter/facade/model/RouteMeta;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const-string v2, "/document/MICRO_CLASS_ACTIVITY"

    .line 42
    .line 43
    invoke-interface {p1, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    new-instance v4, Lcom/alibaba/android/arouter/routes/ARouter$$Group$$document$3;

    .line 47
    .line 48
    invoke-direct {v4, p0}, Lcom/alibaba/android/arouter/routes/ARouter$$Group$$document$3;-><init>(Lcom/alibaba/android/arouter/routes/ARouter$$Group$$document;)V

    .line 49
    .line 50
    .line 51
    const-class v1, Lcom/friday/document/view/viewer/PdfViewerActivity;

    .line 52
    .line 53
    const-string v2, "/document/pdfvieweractivity"

    .line 54
    .line 55
    const-string v3, "document"

    .line 56
    .line 57
    invoke-static/range {v0 .. v6}, Lcom/alibaba/android/arouter/facade/model/RouteMeta;->build(Lcom/alibaba/android/arouter/facade/enums/RouteType;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;II)Lcom/alibaba/android/arouter/facade/model/RouteMeta;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    const-string v2, "/document/PdfViewerActivity"

    .line 62
    .line 63
    invoke-interface {p1, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    const-class v1, Lcom/friday/document/view/share/ShareSearchActivity;

    .line 67
    .line 68
    const-string v2, "/document/sharesearchactivity"

    .line 69
    .line 70
    const-string v3, "document"

    .line 71
    .line 72
    const/4 v4, 0x0

    .line 73
    invoke-static/range {v0 .. v6}, Lcom/alibaba/android/arouter/facade/model/RouteMeta;->build(Lcom/alibaba/android/arouter/facade/enums/RouteType;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;II)Lcom/alibaba/android/arouter/facade/model/RouteMeta;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    const-string v2, "/document/ShareSearchActivity"

    .line 78
    .line 79
    invoke-interface {p1, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    const-class v1, Lcom/friday/document/view/TeacherOnlyActivity;

    .line 83
    .line 84
    const-string v2, "/document/teacheronlyactivity"

    .line 85
    .line 86
    const-string v3, "document"

    .line 87
    .line 88
    invoke-static/range {v0 .. v6}, Lcom/alibaba/android/arouter/facade/model/RouteMeta;->build(Lcom/alibaba/android/arouter/facade/enums/RouteType;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;II)Lcom/alibaba/android/arouter/facade/model/RouteMeta;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    const-string v2, "/document/TeacherOnlyActivity"

    .line 93
    .line 94
    invoke-interface {p1, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    new-instance v4, Lcom/alibaba/android/arouter/routes/ARouter$$Group$$document$4;

    .line 98
    .line 99
    invoke-direct {v4, p0}, Lcom/alibaba/android/arouter/routes/ARouter$$Group$$document$4;-><init>(Lcom/alibaba/android/arouter/routes/ARouter$$Group$$document;)V

    .line 100
    .line 101
    .line 102
    const-class v1, Lcom/friday/document/view/viewer/TxtEditActivity;

    .line 103
    .line 104
    const-string v2, "/document/txteditactivity"

    .line 105
    .line 106
    const-string v3, "document"

    .line 107
    .line 108
    invoke-static/range {v0 .. v6}, Lcom/alibaba/android/arouter/facade/model/RouteMeta;->build(Lcom/alibaba/android/arouter/facade/enums/RouteType;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;II)Lcom/alibaba/android/arouter/facade/model/RouteMeta;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    const-string v2, "/document/TxtEditActivity"

    .line 113
    .line 114
    invoke-interface {p1, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    new-instance v4, Lcom/alibaba/android/arouter/routes/ARouter$$Group$$document$5;

    .line 118
    .line 119
    invoke-direct {v4, p0}, Lcom/alibaba/android/arouter/routes/ARouter$$Group$$document$5;-><init>(Lcom/alibaba/android/arouter/routes/ARouter$$Group$$document;)V

    .line 120
    .line 121
    .line 122
    const-class v1, Lcom/friday/document/view/viewer/VideoPlayerActivity;

    .line 123
    .line 124
    const-string v2, "/document/videoplayeractivity"

    .line 125
    .line 126
    const-string v3, "document"

    .line 127
    .line 128
    invoke-static/range {v0 .. v6}, Lcom/alibaba/android/arouter/facade/model/RouteMeta;->build(Lcom/alibaba/android/arouter/facade/enums/RouteType;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;II)Lcom/alibaba/android/arouter/facade/model/RouteMeta;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    const-string v1, "/document/VideoPlayerActivity"

    .line 133
    .line 134
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    return-void
.end method
