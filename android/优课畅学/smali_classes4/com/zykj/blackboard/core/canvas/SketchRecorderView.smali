.class public final Lcom/zykj/blackboard/core/canvas/SketchRecorderView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public _$_findViewCache:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private final activeLayer:Lcom/zykj/blackboard/core/canvas/view/ActiveView;

.field private final backgroundLayer:Lcom/zykj/blackboard/core/canvas/view/BackgroundView;

.field private boardControl:Lcom/zykj/blackboard/core/edit/BoardControl;

.field private final fixLayer:Lcom/zykj/blackboard/core/canvas/view/FixView;

.field private final maskLayer:Lcom/zykj/blackboard/core/canvas/view/MaskView;

.field private final renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 13

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->_$_findViewCache:Ljava/util/Map;

    .line 12
    .line 13
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 14
    .line 15
    .line 16
    new-instance v1, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;

    .line 17
    .line 18
    const/4 v5, 0x4

    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v4, 0x0

    .line 21
    move-object v2, p1

    .line 22
    move-object v3, p2

    .line 23
    invoke-direct/range {v1 .. v6}, Lcom/zykj/blackboard/core/canvas/view/BackgroundView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/n;)V

    .line 24
    .line 25
    .line 26
    move-object v8, v2

    .line 27
    move-object v9, v3

    .line 28
    iput-object v1, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->backgroundLayer:Lcom/zykj/blackboard/core/canvas/view/BackgroundView;

    .line 29
    .line 30
    new-instance v7, Lcom/zykj/blackboard/core/canvas/view/FixView;

    .line 31
    .line 32
    const/4 v11, 0x4

    .line 33
    const/4 v12, 0x0

    .line 34
    const/4 v10, 0x0

    .line 35
    invoke-direct/range {v7 .. v12}, Lcom/zykj/blackboard/core/canvas/view/FixView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/n;)V

    .line 36
    .line 37
    .line 38
    move-object p1, v7

    .line 39
    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->fixLayer:Lcom/zykj/blackboard/core/canvas/view/FixView;

    .line 40
    .line 41
    new-instance v7, Lcom/zykj/blackboard/core/canvas/view/ActiveView;

    .line 42
    .line 43
    invoke-direct/range {v7 .. v12}, Lcom/zykj/blackboard/core/canvas/view/ActiveView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/n;)V

    .line 44
    .line 45
    .line 46
    move-object p2, v7

    .line 47
    iput-object p2, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->activeLayer:Lcom/zykj/blackboard/core/canvas/view/ActiveView;

    .line 48
    .line 49
    new-instance v7, Lcom/zykj/blackboard/core/canvas/view/MaskView;

    .line 50
    .line 51
    invoke-direct/range {v7 .. v12}, Lcom/zykj/blackboard/core/canvas/view/MaskView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/n;)V

    .line 52
    .line 53
    .line 54
    iput-object v7, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->maskLayer:Lcom/zykj/blackboard/core/canvas/view/MaskView;

    .line 55
    .line 56
    new-instance v0, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 57
    .line 58
    invoke-direct {v0, v1, p1, p2, v7}, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;-><init>(Lcom/zykj/blackboard/core/canvas/view/BackgroundLayer;Lcom/zykj/blackboard/core/canvas/view/FixLayer;Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;Lcom/zykj/blackboard/core/canvas/view/MaskLayer;)V

    .line 59
    .line 60
    .line 61
    iput-object v0, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 62
    .line 63
    sget-object v0, Lcom/zykj/blackboard/utils/BoardBox;->INSTANCE:Lcom/zykj/blackboard/utils/BoardBox;

    .line 64
    .line 65
    invoke-virtual {v0, v8}, Lcom/zykj/blackboard/utils/BoardBox;->init(Landroid/content/Context;)V

    .line 66
    .line 67
    .line 68
    sget-object v0, Lcom/zykj/blackboard/utils/AppContext;->INSTANCE:Lcom/zykj/blackboard/utils/AppContext;

    .line 69
    .line 70
    invoke-virtual {v0, v8}, Lcom/zykj/blackboard/utils/AppContext;->init(Landroid/content/Context;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method public static synthetic a(Lcom/zykj/blackboard/core/canvas/SketchRecorderView;Lx7/l;Lx7/l;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->ready$lambda-4(Lcom/zykj/blackboard/core/canvas/SketchRecorderView;Lx7/l;Lx7/l;)V

    return-void
.end method

.method public static synthetic b(Lcom/zykj/blackboard/core/canvas/SketchRecorderView;Ljava/lang/String;Lx7/q;Lx7/l;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->ready$lambda-2(Lcom/zykj/blackboard/core/canvas/SketchRecorderView;Ljava/lang/String;Lx7/q;Lx7/l;)V

    return-void
.end method

.method private static final ready$lambda-2(Lcom/zykj/blackboard/core/canvas/SketchRecorderView;Ljava/lang/String;Lx7/q;Lx7/l;)V
    .locals 5

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$dirPath"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$success"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "$error"

    .line 17
    .line 18
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    iget-object v3, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 32
    .line 33
    invoke-direct {v0, v1, v2, v3}, Lcom/zykj/blackboard/core/edit/BoardControl;-><init>(IILcom/zykj/blackboard/core/canvas/view/RenderLayer;)V

    .line 34
    .line 35
    .line 36
    new-instance v1, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    const-string v2, "[SketchRecorderView]:ready -> dirPath:"

    .line 42
    .line 43
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v2, ", w:"

    .line 50
    .line 51
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v2, ", h:"

    .line 62
    .line 63
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-static {v1}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    new-instance v2, Lcom/zykj/blackboard/utils/DefaultTextEditView;

    .line 89
    .line 90
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    const-string v4, "context"

    .line 95
    .line 96
    invoke-static {v3, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-direct {v2, v3}, Lcom/zykj/blackboard/utils/DefaultTextEditView;-><init>(Landroid/content/Context;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1, v2}, Lcom/zykj/blackboard/bean/BoardConfig;->setTextEditView(Lcom/zykj/blackboard/listener/TextEditView;)V

    .line 103
    .line 104
    .line 105
    new-instance v1, Lcom/zykj/blackboard/core/canvas/SketchRecorderView$ready$1$1$1;

    .line 106
    .line 107
    invoke-direct {v1, p0, p2, v0}, Lcom/zykj/blackboard/core/canvas/SketchRecorderView$ready$1$1$1;-><init>(Lcom/zykj/blackboard/core/canvas/SketchRecorderView;Lx7/q;Lcom/zykj/blackboard/core/edit/BoardControl;)V

    .line 108
    .line 109
    .line 110
    new-instance p2, Lcom/zykj/blackboard/core/canvas/SketchRecorderView$ready$1$1$2;

    .line 111
    .line 112
    invoke-direct {p2, p0, p3}, Lcom/zykj/blackboard/core/canvas/SketchRecorderView$ready$1$1$2;-><init>(Lcom/zykj/blackboard/core/canvas/SketchRecorderView;Lx7/l;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, p1, v1, p2}, Lcom/zykj/blackboard/core/edit/BoardControl;->loadDir(Ljava/lang/String;Lx7/p;Lx7/l;)V

    .line 116
    .line 117
    .line 118
    iput-object v0, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->boardControl:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 119
    .line 120
    return-void
.end method

.method private static final ready$lambda-4(Lcom/zykj/blackboard/core/canvas/SketchRecorderView;Lx7/l;Lx7/l;)V
    .locals 5

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$callBack"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$error"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    iget-object v3, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->renderLayer:Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 27
    .line 28
    invoke-direct {v0, v1, v2, v3}, Lcom/zykj/blackboard/core/edit/BoardControl;-><init>(IILcom/zykj/blackboard/core/canvas/view/RenderLayer;)V

    .line 29
    .line 30
    .line 31
    new-instance v1, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    .line 35
    .line 36
    const-string v2, "[SketchRecorderView]:ready -> w:"

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v2, ", h:"

    .line 49
    .line 50
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-static {v1}, Lcom/blankj/utilcode/util/q;->s([Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BoardControl;->getConfig()Lcom/zykj/blackboard/bean/BoardConfig;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    new-instance v2, Lcom/zykj/blackboard/utils/DefaultTextEditView;

    .line 76
    .line 77
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    const-string v4, "context"

    .line 82
    .line 83
    invoke-static {v3, v4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-direct {v2, v3}, Lcom/zykj/blackboard/utils/DefaultTextEditView;-><init>(Landroid/content/Context;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1, v2}, Lcom/zykj/blackboard/bean/BoardConfig;->setTextEditView(Lcom/zykj/blackboard/listener/TextEditView;)V

    .line 90
    .line 91
    .line 92
    new-instance v1, Ljava/io/File;

    .line 93
    .line 94
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-virtual {v2}, Landroid/content/Context;->getExternalCacheDir()Ljava/io/File;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    if-eqz v2, :cond_0

    .line 103
    .line 104
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    goto :goto_0

    .line 109
    :cond_0
    const/4 v2, 0x0

    .line 110
    :goto_0
    if-nez v2, :cond_1

    .line 111
    .line 112
    const-string v2, ""

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_1
    const-string v3, "context.externalCacheDir?.absolutePath ?: \"\""

    .line 116
    .line 117
    invoke-static {v2, v3}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    :goto_1
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    const-string v2, "File(\n                  \u2026           ).absolutePath"

    .line 136
    .line 137
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    new-instance v2, Lcom/zykj/blackboard/core/canvas/SketchRecorderView$ready$2$1$1;

    .line 141
    .line 142
    invoke-direct {v2, p0, p1, v0}, Lcom/zykj/blackboard/core/canvas/SketchRecorderView$ready$2$1$1;-><init>(Lcom/zykj/blackboard/core/canvas/SketchRecorderView;Lx7/l;Lcom/zykj/blackboard/core/edit/BoardControl;)V

    .line 143
    .line 144
    .line 145
    new-instance p1, Lcom/zykj/blackboard/core/canvas/SketchRecorderView$ready$2$1$2;

    .line 146
    .line 147
    invoke-direct {p1, p0, p2}, Lcom/zykj/blackboard/core/canvas/SketchRecorderView$ready$2$1$2;-><init>(Lcom/zykj/blackboard/core/canvas/SketchRecorderView;Lx7/l;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, v1, v2, p1}, Lcom/zykj/blackboard/core/edit/BoardControl;->loadDir(Ljava/lang/String;Lx7/p;Lx7/l;)V

    .line 151
    .line 152
    .line 153
    iput-object v0, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->boardControl:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 154
    .line 155
    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 1

    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->_$_findViewCache:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public _$_findCachedViewById(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->_$_findViewCache:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-nez v1, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1

    :cond_0
    const/4 p1, 0x0

    return-object p1

    :cond_1
    return-object v1
.end method

.method public onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->boardControl:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BoardControl;->release()V

    .line 9
    .line 10
    .line 11
    :cond_0
    sget-object v0, Lcom/zykj/blackboard/utils/EventBus;->INSTANCE:Lcom/zykj/blackboard/utils/EventBus;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/zykj/blackboard/utils/EventBus;->clear()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->boardControl:Lcom/zykj/blackboard/core/edit/BoardControl;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BoardControl;->getCurrentPage()Lcom/zykj/blackboard/core/edit/IPageControl;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {v0, p1}, Lcom/zykj/blackboard/core/edit/IPageControl;->onTouchEvent(Landroid/view/MotionEvent;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    const/4 p1, 0x1

    .line 17
    return p1
.end method

.method public final ready(Ljava/lang/String;Lx7/q;Lx7/l;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lx7/q;",
            "Lx7/l;",
            ")V"
        }
    .end annotation

    const-string v0, "dirPath"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "success"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "error"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->fixLayer:Lcom/zykj/blackboard/core/canvas/view/FixView;

    new-instance v1, Lcom/zykj/blackboard/core/canvas/b;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/zykj/blackboard/core/canvas/b;-><init>(Lcom/zykj/blackboard/core/canvas/SketchRecorderView;Ljava/lang/String;Lx7/q;Lx7/l;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final ready(Lx7/l;Lx7/l;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/l;",
            "Lx7/l;",
            ")V"
        }
    .end annotation

    const-string v0, "callBack"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "error"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/SketchRecorderView;->fixLayer:Lcom/zykj/blackboard/core/canvas/view/FixView;

    new-instance v1, Lcom/zykj/blackboard/core/canvas/c;

    invoke-direct {v1, p0, p1, p2}, Lcom/zykj/blackboard/core/canvas/c;-><init>(Lcom/zykj/blackboard/core/canvas/SketchRecorderView;Lx7/l;Lx7/l;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
