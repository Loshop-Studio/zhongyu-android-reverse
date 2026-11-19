.class public final Lcom/zykj/blackboard/crop/CropManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/crop/CropManager$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010 \n\u0002\u0010\u0016\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00082\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00082\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00082\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00082\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u0018J)\u0010\u001e\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000b2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00080\u001c\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b\u00a2\u0006\u0004\u0008!\u0010\"J\u0013\u0010%\u001a\u0008\u0012\u0004\u0012\u00020$0#\u00a2\u0006\u0004\u0008%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\'R\u0014\u0010(\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010\'R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008*\u0010+R$\u0010.\u001a\u0012\u0012\u0004\u0012\u00020$0,j\u0008\u0012\u0004\u0012\u00020$`-8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008.\u0010/R0\u00102\u001a\u001e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000600j\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0006`18\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00082\u00103R\u0016\u00104\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00084\u00105R\u0016\u00106\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00086\u00107\u00a8\u00068"
    }
    d2 = {
        "Lcom/zykj/blackboard/crop/CropManager;",
        "",
        "",
        "pagePath",
        "<init>",
        "(Ljava/lang/String;)V",
        "",
        "commandInfoIndex",
        "Ld6/s;",
        "cropCommandByIndex",
        "([I)V",
        "",
        "cropTime",
        "cropAudioByTime",
        "(J)V",
        "Lcom/zykj/blackboard/core/canvas/MatrixAdapter;",
        "matrixAdapter",
        "Lcom/zykj/blackboard/core/canvas/control/GraphControl;",
        "createGraphControl",
        "(Lcom/zykj/blackboard/core/canvas/MatrixAdapter;)Lcom/zykj/blackboard/core/canvas/control/GraphControl;",
        "sourceFileName",
        "",
        "sourceId",
        "deleteFileEntity",
        "(Ljava/lang/String;I)V",
        "deleteTextEntity",
        "deleteTouchEntity",
        "deleteMatrixEntity",
        "Lkotlin/Function1;",
        "callback",
        "cropByTime",
        "(JLr6/c;)V",
        "time",
        "calculateRecentTime",
        "(J)J",
        "",
        "",
        "getCommandDelayTimeList",
        "()Ljava/util/List;",
        "Ljava/lang/String;",
        "rootPath",
        "Lcom/zykj/blackboard/core/data/dao/PageEntity;",
        "pageEntity",
        "Lcom/zykj/blackboard/core/data/dao/PageEntity;",
        "Ljava/util/ArrayList;",
        "Lkotlin/collections/ArrayList;",
        "commandDelayTimeList",
        "Ljava/util/ArrayList;",
        "Ljava/util/HashMap;",
        "Lkotlin/collections/HashMap;",
        "commandDelayTimeToIndex",
        "Ljava/util/HashMap;",
        "deleteCommandIndexArray",
        "[I",
        "stopCommandDelayTime",
        "J",
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
.field private final commandDelayTimeList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "[J>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final commandDelayTimeToIndex:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "[J[I>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private deleteCommandIndexArray:[I
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final pageEntity:Lcom/zykj/blackboard/core/data/dao/PageEntity;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final pagePath:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final rootPath:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private stopCommandDelayTime:J


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 11
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "pagePath"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/blackboard/crop/CropManager;->pagePath:Ljava/lang/String;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/zykj/blackboard/crop/CropManager;->commandDelayTimeList:Ljava/util/ArrayList;

    .line 17
    .line 18
    new-instance v0, Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/zykj/blackboard/crop/CropManager;->commandDelayTimeToIndex:Ljava/util/HashMap;

    .line 24
    .line 25
    const/4 v0, 0x2

    .line 26
    new-array v0, v0, [I

    .line 27
    .line 28
    iput-object v0, p0, Lcom/zykj/blackboard/crop/CropManager;->deleteCommandIndexArray:[I

    .line 29
    .line 30
    new-instance v0, Ljava/io/File;

    .line 31
    .line 32
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/io/File;->getParent()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    const-string v1, "pageFile.parent"

    .line 40
    .line 41
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lcom/zykj/blackboard/crop/CropManager;->rootPath:Ljava/lang/String;

    .line 45
    .line 46
    new-instance v2, Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    const-string v0, "pageFile.name"

    .line 53
    .line 54
    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const/16 v9, 0x1c

    .line 58
    .line 59
    const/4 v10, 0x0

    .line 60
    const-wide/16 v3, 0x0

    .line 61
    .line 62
    const/4 v6, 0x0

    .line 63
    const/4 v7, 0x0

    .line 64
    const/4 v8, 0x0

    .line 65
    invoke-direct/range {v2 .. v10}, Lcom/zykj/blackboard/core/data/dao/PageEntity;-><init>(JLjava/lang/String;ZLjava/lang/String;IILkotlin/jvm/internal/e;)V

    .line 66
    .line 67
    .line 68
    iput-object v2, p0, Lcom/zykj/blackboard/crop/CropManager;->pageEntity:Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 69
    .line 70
    sget-object v0, Lcom/zykj/blackboard/core/data/SourceLoad;->INSTANCE:Lcom/zykj/blackboard/core/data/SourceLoad;

    .line 71
    .line 72
    invoke-virtual {v0, p1, v2}, Lcom/zykj/blackboard/core/data/SourceLoad;->loadPage(Ljava/lang/String;Lcom/zykj/blackboard/core/data/dao/PageEntity;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public static synthetic a(Lcom/zykj/blackboard/crop/CropManager;JLr6/c;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/zykj/blackboard/crop/CropManager;->cropByTime$lambda-4(Lcom/zykj/blackboard/crop/CropManager;JLr6/c;)V

    return-void
.end method

.method private final createGraphControl(Lcom/zykj/blackboard/core/canvas/MatrixAdapter;)Lcom/zykj/blackboard/core/canvas/control/GraphControl;
    .locals 6

    .line 1
    new-instance v0, Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 2
    .line 3
    new-instance v1, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;

    .line 4
    .line 5
    new-instance v2, Lcom/zykj/blackboard/crop/SimpleBackgroundView;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/blackboard/crop/CropManager;->pageEntity:Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 8
    .line 9
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getHeaderEntity()Lio/objectbox/relation/ToOne;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-virtual {v3}, Lio/objectbox/relation/ToOne;->getTarget()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;

    .line 18
    .line 19
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getWidth()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    iget-object v4, p0, Lcom/zykj/blackboard/crop/CropManager;->pageEntity:Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 24
    .line 25
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getHeaderEntity()Lio/objectbox/relation/ToOne;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-virtual {v4}, Lio/objectbox/relation/ToOne;->getTarget()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    check-cast v4, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;

    .line 34
    .line 35
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getHeight()I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    invoke-direct {v2, v3, v4}, Lcom/zykj/blackboard/crop/SimpleBackgroundView;-><init>(II)V

    .line 40
    .line 41
    .line 42
    new-instance v3, Lcom/zykj/blackboard/crop/SimpleFixView;

    .line 43
    .line 44
    iget-object v4, p0, Lcom/zykj/blackboard/crop/CropManager;->pageEntity:Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 45
    .line 46
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getHeaderEntity()Lio/objectbox/relation/ToOne;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-virtual {v4}, Lio/objectbox/relation/ToOne;->getTarget()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    check-cast v4, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;

    .line 55
    .line 56
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getWidth()I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    iget-object v5, p0, Lcom/zykj/blackboard/crop/CropManager;->pageEntity:Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 61
    .line 62
    invoke-virtual {v5}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getHeaderEntity()Lio/objectbox/relation/ToOne;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-virtual {v5}, Lio/objectbox/relation/ToOne;->getTarget()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    check-cast v5, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;

    .line 71
    .line 72
    invoke-virtual {v5}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getHeight()I

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    invoke-direct {v3, v4, v5}, Lcom/zykj/blackboard/crop/SimpleFixView;-><init>(II)V

    .line 77
    .line 78
    .line 79
    const/4 v4, 0x0

    .line 80
    invoke-direct {v1, v2, v3, v4, v4}, Lcom/zykj/blackboard/core/canvas/view/RenderLayer;-><init>(Lcom/zykj/blackboard/core/canvas/view/BackgroundLayer;Lcom/zykj/blackboard/core/canvas/view/FixLayer;Lcom/zykj/blackboard/core/canvas/view/ActiveLayer;Lcom/zykj/blackboard/core/canvas/view/MaskLayer;)V

    .line 81
    .line 82
    .line 83
    new-instance v2, Lcom/zykj/blackboard/bean/BoardConfig;

    .line 84
    .line 85
    iget-object v3, p0, Lcom/zykj/blackboard/crop/CropManager;->pageEntity:Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 86
    .line 87
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getHeaderEntity()Lio/objectbox/relation/ToOne;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-virtual {v3}, Lio/objectbox/relation/ToOne;->getTarget()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    check-cast v3, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;

    .line 96
    .line 97
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getWidth()I

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    iget-object v4, p0, Lcom/zykj/blackboard/crop/CropManager;->pageEntity:Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 102
    .line 103
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getHeaderEntity()Lio/objectbox/relation/ToOne;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    invoke-virtual {v4}, Lio/objectbox/relation/ToOne;->getTarget()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    check-cast v4, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;

    .line 112
    .line 113
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getHeight()I

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    invoke-direct {v2, v3, v4}, Lcom/zykj/blackboard/bean/BoardConfig;-><init>(II)V

    .line 118
    .line 119
    .line 120
    invoke-direct {v0, p1, v1, v2}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;-><init>(Lcom/zykj/blackboard/core/canvas/MatrixAdapter;Lcom/zykj/blackboard/core/canvas/view/RenderLayer;Lcom/zykj/blackboard/bean/BoardConfig;)V

    .line 121
    .line 122
    .line 123
    iget-object v1, p0, Lcom/zykj/blackboard/crop/CropManager;->pageEntity:Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 124
    .line 125
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getHeaderEntity()Lio/objectbox/relation/ToOne;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-virtual {v1}, Lio/objectbox/relation/ToOne;->getTarget()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    check-cast v1, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;

    .line 134
    .line 135
    if-eqz v1, :cond_0

    .line 136
    .line 137
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getDefaultBackgroundColor()I

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->setDefaultBackgroundColor(I)V

    .line 142
    .line 143
    .line 144
    :cond_0
    iget-object v1, p0, Lcom/zykj/blackboard/crop/CropManager;->pageEntity:Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 145
    .line 146
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getHeaderEntity()Lio/objectbox/relation/ToOne;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-virtual {v1}, Lio/objectbox/relation/ToOne;->getTarget()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    check-cast v1, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;

    .line 155
    .line 156
    if-eqz v1, :cond_1

    .line 157
    .line 158
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getDefaultBackgroundLineConfig()Lio/objectbox/relation/ToOne;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    if-eqz v1, :cond_1

    .line 163
    .line 164
    invoke-virtual {v1}, Lio/objectbox/relation/ToOne;->getTarget()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    check-cast v1, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;

    .line 169
    .line 170
    if-eqz v1, :cond_1

    .line 171
    .line 172
    invoke-static {v1}, Lcom/zykj/blackboard/utils/ConvertExtKt;->toConfig(Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;)Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    if-eqz v1, :cond_1

    .line 177
    .line 178
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->setDefaultBackgroundLineConfig(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V

    .line 179
    .line 180
    .line 181
    :cond_1
    sget-object v1, Lcom/zykj/blackboard/core/execute/CommandFactory;->INSTANCE:Lcom/zykj/blackboard/core/execute/CommandFactory;

    .line 182
    .line 183
    iget-object v2, p0, Lcom/zykj/blackboard/crop/CropManager;->pageEntity:Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 184
    .line 185
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getHeaderEntity()Lio/objectbox/relation/ToOne;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->getTarget()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    check-cast v2, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;

    .line 194
    .line 195
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getVersion()I

    .line 196
    .line 197
    .line 198
    move-result v2

    .line 199
    new-instance v3, Lcom/zykj/blackboard/core/loader/SimpleSourceLoader;

    .line 200
    .line 201
    iget-object v4, p0, Lcom/zykj/blackboard/crop/CropManager;->pageEntity:Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 202
    .line 203
    invoke-virtual {v4}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getRecordEntity()Lio/objectbox/relation/ToOne;

    .line 204
    .line 205
    .line 206
    move-result-object v4

    .line 207
    invoke-virtual {v4}, Lio/objectbox/relation/ToOne;->getTarget()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    const-string v5, "pageEntity.recordEntity.target"

    .line 212
    .line 213
    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    check-cast v4, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 217
    .line 218
    invoke-direct {v3, v4}, Lcom/zykj/blackboard/core/loader/SimpleSourceLoader;-><init>(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)V

    .line 219
    .line 220
    .line 221
    iget-object v4, p0, Lcom/zykj/blackboard/crop/CropManager;->pagePath:Ljava/lang/String;

    .line 222
    .line 223
    invoke-virtual {v3, v4}, Lcom/zykj/blackboard/core/loader/SimpleSourceLoader;->initPath(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v1, v2, v3, p1, v0}, Lcom/zykj/blackboard/core/execute/CommandFactory;->createCommandFactory(ILcom/zykj/blackboard/core/loader/SourceLoader;Lcom/zykj/blackboard/core/canvas/MatrixAdapter;Lcom/zykj/blackboard/core/canvas/control/IGraphControl;)Lcom/zykj/blackboard/core/execute/BaseCommandExecuteFactory;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    iget-object v1, p0, Lcom/zykj/blackboard/crop/CropManager;->pageEntity:Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 231
    .line 232
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getRecordEntity()Lio/objectbox/relation/ToOne;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    invoke-virtual {v1}, Lio/objectbox/relation/ToOne;->getTarget()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    check-cast v1, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 241
    .line 242
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getCommandList()Lio/objectbox/relation/ToMany;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 251
    .line 252
    .line 253
    move-result v2

    .line 254
    if-eqz v2, :cond_4

    .line 255
    .line 256
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    check-cast v2, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

    .line 261
    .line 262
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->getCommandInfoEntity()Lio/objectbox/relation/ToMany;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    :cond_3
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 271
    .line 272
    .line 273
    move-result v3

    .line 274
    if-eqz v3, :cond_2

    .line 275
    .line 276
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v3

    .line 280
    check-cast v3, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 281
    .line 282
    sget-object v4, Lcom/zykj/blackboard/core/loader/EntityConvertEzy;->INSTANCE:Lcom/zykj/blackboard/core/loader/EntityConvertEzy;

    .line 283
    .line 284
    invoke-virtual {v4, v3}, Lcom/zykj/blackboard/core/loader/EntityConvertEzy;->commandInfoConvertEzyCommandInfo(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;

    .line 285
    .line 286
    .line 287
    move-result-object v3

    .line 288
    if-eqz v3, :cond_3

    .line 289
    .line 290
    invoke-virtual {p1, v3}, Lcom/zykj/blackboard/core/execute/BaseCommandExecuteFactory;->execute(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;)V

    .line 291
    .line 292
    .line 293
    goto :goto_0

    .line 294
    :cond_4
    return-object v0
.end method

.method private final cropAudioByTime(J)V
    .locals 13

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/crop/CropManager;->pageEntity:Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getRecordEntity()Lio/objectbox/relation/ToOne;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lio/objectbox/relation/ToOne;->getTarget()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getAudioList()Lio/objectbox/relation/ToMany;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lio/objectbox/relation/ToMany;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    goto/16 :goto_6

    .line 24
    .line 25
    :cond_0
    invoke-virtual {v0}, Lio/objectbox/relation/ToMany;->size()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    add-int/lit8 v1, v1, -0x1

    .line 30
    .line 31
    invoke-static {v0}, Lkotlin/collections/t;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;

    .line 36
    .line 37
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->getAudioInfoEntity()Lio/objectbox/relation/ToMany;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v2}, Lio/objectbox/relation/ToMany;->size()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    add-int/lit8 v2, v2, -0x1

    .line 46
    .line 47
    invoke-virtual {v0}, Lio/objectbox/relation/ToMany;->size()I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    const/4 v4, 0x0

    .line 52
    move v5, v4

    .line 53
    :goto_0
    if-ge v5, v3, :cond_3

    .line 54
    .line 55
    invoke-virtual {v0, v5}, Lio/objectbox/relation/ToMany;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    check-cast v6, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;

    .line 60
    .line 61
    invoke-virtual {v6}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->getAudioInfoEntity()Lio/objectbox/relation/ToMany;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    invoke-virtual {v6}, Lio/objectbox/relation/ToMany;->size()I

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    move v7, v4

    .line 70
    :goto_1
    if-ge v7, v6, :cond_2

    .line 71
    .line 72
    invoke-virtual {v0, v5}, Lio/objectbox/relation/ToMany;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v8

    .line 76
    check-cast v8, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;

    .line 77
    .line 78
    invoke-virtual {v8}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->getAudioInfoEntity()Lio/objectbox/relation/ToMany;

    .line 79
    .line 80
    .line 81
    move-result-object v8

    .line 82
    invoke-virtual {v8, v7}, Lio/objectbox/relation/ToMany;->get(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v8

    .line 86
    check-cast v8, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;

    .line 87
    .line 88
    invoke-virtual {v8}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->getDelayTime()J

    .line 89
    .line 90
    .line 91
    move-result-wide v9

    .line 92
    invoke-virtual {v8}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->getDuration()J

    .line 93
    .line 94
    .line 95
    move-result-wide v11

    .line 96
    add-long/2addr v11, v9

    .line 97
    cmp-long v9, p1, v11

    .line 98
    .line 99
    if-lez v9, :cond_1

    .line 100
    .line 101
    invoke-virtual {v8}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->getDelayTime()J

    .line 102
    .line 103
    .line 104
    move-result-wide v9

    .line 105
    invoke-virtual {v8}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->getDuration()J

    .line 106
    .line 107
    .line 108
    move-result-wide v11

    .line 109
    add-long/2addr v11, v9

    .line 110
    sub-long/2addr p1, v11

    .line 111
    add-int/lit8 v7, v7, 0x1

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_1
    move v1, v5

    .line 115
    move v2, v7

    .line 116
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_3
    invoke-virtual {v0, v1}, Lio/objectbox/relation/ToMany;->get(I)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    check-cast v3, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;

    .line 124
    .line 125
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->getAudioInfoEntity()Lio/objectbox/relation/ToMany;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    invoke-virtual {v3, v2}, Lio/objectbox/relation/ToMany;->get(I)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    check-cast v3, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;

    .line 134
    .line 135
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->getDelayTime()J

    .line 136
    .line 137
    .line 138
    move-result-wide v5

    .line 139
    cmp-long v5, p1, v5

    .line 140
    .line 141
    if-lez v5, :cond_4

    .line 142
    .line 143
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->getDelayTime()J

    .line 144
    .line 145
    .line 146
    move-result-wide v5

    .line 147
    sub-long/2addr p1, v5

    .line 148
    invoke-virtual {v3, p1, p2}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->setDuration(J)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->getData()[B

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-static {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->parseFrom([B)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    new-instance p2, Ljava/lang/StringBuilder;

    .line 160
    .line 161
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 162
    .line 163
    .line 164
    sget-object v5, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->Companion:Lcom/zykj/blackboard/core/record/SourceRouterRecord$Companion;

    .line 165
    .line 166
    iget-object v6, p0, Lcom/zykj/blackboard/crop/CropManager;->pagePath:Ljava/lang/String;

    .line 167
    .line 168
    sget-object v7, Lcom/zykj/blackboard/enums/DocumentType;->AUDIO:Lcom/zykj/blackboard/enums/DocumentType;

    .line 169
    .line 170
    invoke-virtual {v5, v6, v7}, Lcom/zykj/blackboard/core/record/SourceRouterRecord$Companion;->getResPath(Ljava/lang/String;Lcom/zykj/blackboard/enums/DocumentType;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v5

    .line 174
    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    sget-char v5, Ljava/io/File;->separatorChar:C

    .line 178
    .line 179
    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {p1}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->getFileName()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 187
    .line 188
    .line 189
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    sget-object p2, Lcom/zykj/blackboard/utils/AudioUtils;->INSTANCE:Lcom/zykj/blackboard/utils/AudioUtils;

    .line 194
    .line 195
    const-wide/16 v5, 0x0

    .line 196
    .line 197
    invoke-virtual {p2, v5, v6}, Lcom/zykj/blackboard/utils/AudioUtils;->timeFormat(J)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->getDuration()J

    .line 202
    .line 203
    .line 204
    move-result-wide v6

    .line 205
    invoke-virtual {p2, v6, v7}, Lcom/zykj/blackboard/utils/AudioUtils;->timeFormat(J)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    invoke-virtual {p2, p1, v5, v3}, Lcom/zykj/blackboard/utils/AudioUtils;->audioCut(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    add-int/lit8 v2, v2, 0x1

    .line 213
    .line 214
    invoke-virtual {v0, v1}, Lio/objectbox/relation/ToMany;->get(I)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;

    .line 219
    .line 220
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->getAudioInfoEntity()Lio/objectbox/relation/ToMany;

    .line 221
    .line 222
    .line 223
    move-result-object p1

    .line 224
    invoke-virtual {p1}, Lio/objectbox/relation/ToMany;->size()I

    .line 225
    .line 226
    .line 227
    move-result p1

    .line 228
    if-ne v2, p1, :cond_4

    .line 229
    .line 230
    add-int/lit8 v1, v1, 0x1

    .line 231
    .line 232
    goto :goto_2

    .line 233
    :cond_4
    move v4, v2

    .line 234
    :goto_2
    add-int/lit8 p1, v1, 0x1

    .line 235
    .line 236
    invoke-virtual {v0}, Lio/objectbox/relation/ToMany;->size()I

    .line 237
    .line 238
    .line 239
    move-result p2

    .line 240
    if-ge p1, p2, :cond_7

    .line 241
    .line 242
    new-instance p2, Ljava/util/ArrayList;

    .line 243
    .line 244
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v0}, Lio/objectbox/relation/ToMany;->size()I

    .line 248
    .line 249
    .line 250
    move-result v2

    .line 251
    :goto_3
    if-ge p1, v2, :cond_6

    .line 252
    .line 253
    invoke-virtual {v0, p1}, Lio/objectbox/relation/ToMany;->get(I)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v3

    .line 257
    check-cast v3, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;

    .line 258
    .line 259
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->getAudioInfoEntity()Lio/objectbox/relation/ToMany;

    .line 260
    .line 261
    .line 262
    move-result-object v3

    .line 263
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 264
    .line 265
    .line 266
    move-result-object v3

    .line 267
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 268
    .line 269
    .line 270
    move-result v5

    .line 271
    if-eqz v5, :cond_5

    .line 272
    .line 273
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v5

    .line 277
    check-cast v5, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;

    .line 278
    .line 279
    invoke-virtual {v5}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->getData()[B

    .line 280
    .line 281
    .line 282
    move-result-object v5

    .line 283
    invoke-static {v5}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->parseFrom([B)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;

    .line 284
    .line 285
    .line 286
    move-result-object v5

    .line 287
    new-instance v6, Ljava/lang/StringBuilder;

    .line 288
    .line 289
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 290
    .line 291
    .line 292
    sget-object v7, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->Companion:Lcom/zykj/blackboard/core/record/SourceRouterRecord$Companion;

    .line 293
    .line 294
    iget-object v8, p0, Lcom/zykj/blackboard/crop/CropManager;->pagePath:Ljava/lang/String;

    .line 295
    .line 296
    sget-object v9, Lcom/zykj/blackboard/enums/DocumentType;->AUDIO:Lcom/zykj/blackboard/enums/DocumentType;

    .line 297
    .line 298
    invoke-virtual {v7, v8, v9}, Lcom/zykj/blackboard/core/record/SourceRouterRecord$Companion;->getResPath(Ljava/lang/String;Lcom/zykj/blackboard/enums/DocumentType;)Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v7

    .line 302
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 303
    .line 304
    .line 305
    sget-char v7, Ljava/io/File;->separatorChar:C

    .line 306
    .line 307
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v5}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->getFileName()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v5

    .line 314
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v5

    .line 321
    sget-object v6, Lcom/zykj/blackboard/utils/FileUtils;->INSTANCE:Lcom/zykj/blackboard/utils/FileUtils;

    .line 322
    .line 323
    invoke-virtual {v6, v5}, Lcom/zykj/blackboard/utils/FileUtils;->delete(Ljava/lang/String;)Z

    .line 324
    .line 325
    .line 326
    goto :goto_4

    .line 327
    :cond_5
    invoke-virtual {v0, p1}, Lio/objectbox/relation/ToMany;->get(I)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v3

    .line 331
    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    add-int/lit8 p1, p1, 0x1

    .line 335
    .line 336
    goto :goto_3

    .line 337
    :cond_6
    invoke-virtual {v0, p2}, Lio/objectbox/relation/ToMany;->removeAll(Ljava/util/Collection;)Z

    .line 338
    .line 339
    .line 340
    :cond_7
    invoke-virtual {v0}, Lio/objectbox/relation/ToMany;->size()I

    .line 341
    .line 342
    .line 343
    move-result p1

    .line 344
    if-ge v1, p1, :cond_9

    .line 345
    .line 346
    invoke-virtual {v0, v1}, Lio/objectbox/relation/ToMany;->get(I)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object p1

    .line 350
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;

    .line 351
    .line 352
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/AudioRecordEntity;->getAudioInfoEntity()Lio/objectbox/relation/ToMany;

    .line 353
    .line 354
    .line 355
    move-result-object p1

    .line 356
    new-instance p2, Ljava/util/ArrayList;

    .line 357
    .line 358
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 359
    .line 360
    .line 361
    invoke-virtual {p1}, Lio/objectbox/relation/ToMany;->size()I

    .line 362
    .line 363
    .line 364
    move-result v2

    .line 365
    :goto_5
    if-ge v4, v2, :cond_8

    .line 366
    .line 367
    invoke-virtual {p1, v4}, Lio/objectbox/relation/ToMany;->get(I)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v3

    .line 371
    check-cast v3, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;

    .line 372
    .line 373
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/AudioInfoEntity;->getData()[B

    .line 374
    .line 375
    .line 376
    move-result-object v3

    .line 377
    invoke-static {v3}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->parseFrom([B)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;

    .line 378
    .line 379
    .line 380
    move-result-object v3

    .line 381
    new-instance v5, Ljava/lang/StringBuilder;

    .line 382
    .line 383
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 384
    .line 385
    .line 386
    sget-object v6, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->Companion:Lcom/zykj/blackboard/core/record/SourceRouterRecord$Companion;

    .line 387
    .line 388
    iget-object v7, p0, Lcom/zykj/blackboard/crop/CropManager;->pagePath:Ljava/lang/String;

    .line 389
    .line 390
    sget-object v8, Lcom/zykj/blackboard/enums/DocumentType;->AUDIO:Lcom/zykj/blackboard/enums/DocumentType;

    .line 391
    .line 392
    invoke-virtual {v6, v7, v8}, Lcom/zykj/blackboard/core/record/SourceRouterRecord$Companion;->getResPath(Ljava/lang/String;Lcom/zykj/blackboard/enums/DocumentType;)Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v6

    .line 396
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 397
    .line 398
    .line 399
    sget-char v6, Ljava/io/File;->separatorChar:C

    .line 400
    .line 401
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 402
    .line 403
    .line 404
    invoke-virtual {v3}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$AudioStart;->getFileName()Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v3

    .line 408
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v3

    .line 415
    sget-object v5, Lcom/zykj/blackboard/utils/FileUtils;->INSTANCE:Lcom/zykj/blackboard/utils/FileUtils;

    .line 416
    .line 417
    invoke-virtual {v5, v3}, Lcom/zykj/blackboard/utils/FileUtils;->delete(Ljava/lang/String;)Z

    .line 418
    .line 419
    .line 420
    invoke-virtual {p1, v4}, Lio/objectbox/relation/ToMany;->get(I)Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v3

    .line 424
    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 425
    .line 426
    .line 427
    add-int/lit8 v4, v4, 0x1

    .line 428
    .line 429
    goto :goto_5

    .line 430
    :cond_8
    invoke-virtual {p1, p2}, Lio/objectbox/relation/ToMany;->removeAll(Ljava/util/Collection;)Z

    .line 431
    .line 432
    .line 433
    invoke-virtual {p1}, Lio/objectbox/relation/ToMany;->isEmpty()Z

    .line 434
    .line 435
    .line 436
    move-result p1

    .line 437
    if-eqz p1, :cond_9

    .line 438
    .line 439
    invoke-virtual {v0, v1}, Lio/objectbox/relation/ToMany;->remove(I)Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    :cond_9
    :goto_6
    return-void
.end method

.method private static final cropByTime$lambda-4(Lcom/zykj/blackboard/crop/CropManager;JLr6/c;)V
    .locals 5

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$callback"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    :try_start_0
    invoke-virtual {p0, p1, p2}, Lcom/zykj/blackboard/crop/CropManager;->calculateRecentTime(J)J

    .line 12
    .line 13
    .line 14
    move-result-wide p1

    .line 15
    iget-object v0, p0, Lcom/zykj/blackboard/crop/CropManager;->deleteCommandIndexArray:[I

    .line 16
    .line 17
    invoke-direct {p0, v0}, Lcom/zykj/blackboard/crop/CropManager;->cropCommandByIndex([I)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, p1, p2}, Lcom/zykj/blackboard/crop/CropManager;->cropAudioByTime(J)V

    .line 21
    .line 22
    .line 23
    new-instance v0, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;

    .line 24
    .line 25
    invoke-direct {v0}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-direct {p0, v0}, Lcom/zykj/blackboard/crop/CropManager;->createGraphControl(Lcom/zykj/blackboard/core/canvas/MatrixAdapter;)Lcom/zykj/blackboard/core/canvas/control/GraphControl;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iget-object v2, p0, Lcom/zykj/blackboard/crop/CropManager;->pageEntity:Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 33
    .line 34
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getHeaderEntity()Lio/objectbox/relation/ToOne;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v2}, Lio/objectbox/relation/ToOne;->getTarget()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;

    .line 43
    .line 44
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 45
    .line 46
    .line 47
    move-result-wide v3

    .line 48
    invoke-virtual {v2, v3, v4}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->setUpdateDate(J)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, p1, p2}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->setDuration(J)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->getBackgroundColor()I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    invoke-virtual {v2, p1}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->setLastBackgroundColor(I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->getLastBackgroundLineConfig()Lio/objectbox/relation/ToOne;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p1}, Lio/objectbox/relation/ToOne;->getTarget()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;

    .line 70
    .line 71
    if-eqz p1, :cond_0

    .line 72
    .line 73
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->getBackgroundLineConfig()Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    invoke-virtual {p2}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->getLineColor()I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    invoke-virtual {p1, v2}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->setLineColor(I)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p2}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->getLineSpace()F

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    invoke-virtual {p1, v2}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->setLineSpace(F)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p2}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->getLineWidth()F

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    invoke-virtual {p1, v2}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->setLineWidth(F)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p2}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->getLineType()Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    invoke-static {p2}, Lcom/zykj/blackboard/utils/ConvertExtKt;->toEzyBackgroundLineTypeEnum(Lcom/zykj/blackboard/bean/BackgroundLineConfig$BackgroundLineType;)Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    invoke-virtual {p1, p2}, Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;->setLineType(Lcom/zykj/board/EzyBackgroundLineTypeEnum$BackgroundLineTypeEnum;)V

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :catch_0
    move-exception p0

    .line 111
    goto :goto_1

    .line 112
    :cond_0
    :goto_0
    sget-object p1, Lcom/zykj/blackboard/core/data/SourceSave;->INSTANCE:Lcom/zykj/blackboard/core/data/SourceSave;

    .line 113
    .line 114
    iget-object p2, p0, Lcom/zykj/blackboard/crop/CropManager;->pageEntity:Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 115
    .line 116
    iget-object v2, p0, Lcom/zykj/blackboard/crop/CropManager;->rootPath:Ljava/lang/String;

    .line 117
    .line 118
    invoke-virtual {p1, p2, v2}, Lcom/zykj/blackboard/core/data/SourceSave;->saveHeader(Lcom/zykj/blackboard/core/data/dao/PageEntity;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->snapshot()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    if-eqz p2, :cond_1

    .line 126
    .line 127
    invoke-static {}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;->newBuilder()Lcom/zykj/board/b0;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    invoke-virtual {v2, p2}, Lcom/zykj/board/b0;->k(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/canvas/MatrixAdapter;->getCameraMatrix()Landroid/graphics/Matrix;

    .line 135
    .line 136
    .line 137
    move-result-object p2

    .line 138
    const-wide/16 v3, 0x0

    .line 139
    .line 140
    invoke-static {p2, v3, v4}, Lcom/zykj/blackboard/utils/MatrixExtKt;->toEzyMatrix(Landroid/graphics/Matrix;J)Lcom/zykj/board/EzyMatrix$Matrix;

    .line 141
    .line 142
    .line 143
    move-result-object p2

    .line 144
    invoke-virtual {v2, p2}, Lcom/zykj/board/b0;->j(Lcom/zykj/board/EzyMatrix$Matrix;)V

    .line 145
    .line 146
    .line 147
    sget-object p2, Lcom/zykj/blackboard/utils/ProtoFileUtils;->Companion:Lcom/zykj/blackboard/utils/ProtoFileUtils$Companion;

    .line 148
    .line 149
    iget-object v0, p0, Lcom/zykj/blackboard/crop/CropManager;->pagePath:Ljava/lang/String;

    .line 150
    .line 151
    const-string v3, "snapshot.bin"

    .line 152
    .line 153
    invoke-virtual {v2}, Lcom/zykj/board/b0;->c()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    invoke-virtual {p2, v0, v3, v2}, Lcom/zykj/blackboard/utils/ProtoFileUtils$Companion;->createPageSnapshotFile(Ljava/lang/String;Ljava/lang/String;Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;)V

    .line 158
    .line 159
    .line 160
    :cond_1
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/canvas/control/GraphControl;->screenshot()Landroid/graphics/Bitmap;

    .line 161
    .line 162
    .line 163
    move-result-object p2

    .line 164
    if-eqz p2, :cond_2

    .line 165
    .line 166
    sget-object v0, Lcom/zykj/blackboard/utils/ProtoFileUtils;->Companion:Lcom/zykj/blackboard/utils/ProtoFileUtils$Companion;

    .line 167
    .line 168
    iget-object v1, p0, Lcom/zykj/blackboard/crop/CropManager;->pagePath:Ljava/lang/String;

    .line 169
    .line 170
    const-string v2, "screenshot.png"

    .line 171
    .line 172
    invoke-virtual {v0, v1, v2, p2}, Lcom/zykj/blackboard/utils/ProtoFileUtils$Companion;->createBitmapFile(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 173
    .line 174
    .line 175
    :cond_2
    iget-object p2, p0, Lcom/zykj/blackboard/crop/CropManager;->pageEntity:Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 176
    .line 177
    iget-object p0, p0, Lcom/zykj/blackboard/crop/CropManager;->rootPath:Ljava/lang/String;

    .line 178
    .line 179
    invoke-virtual {p1, p2, p0}, Lcom/zykj/blackboard/core/data/SourceSave;->saveRouter(Lcom/zykj/blackboard/core/data/dao/PageEntity;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    const-string p0, ""

    .line 183
    .line 184
    invoke-interface {p3, p0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 185
    .line 186
    .line 187
    return-void

    .line 188
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    invoke-interface {p3, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 196
    .line 197
    .line 198
    return-void
.end method

.method private final cropCommandByIndex([I)V
    .locals 14

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/crop/CropManager;->pageEntity:Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getRecordEntity()Lio/objectbox/relation/ToOne;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lio/objectbox/relation/ToOne;->getTarget()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getCommandList()Lio/objectbox/relation/ToMany;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x0

    .line 18
    aget v2, p1, v1

    .line 19
    .line 20
    invoke-virtual {v0, v2}, Lio/objectbox/relation/ToMany;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

    .line 25
    .line 26
    invoke-virtual {v2}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->getCommandInfoEntity()Lio/objectbox/relation/ToMany;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    const/4 v3, 0x4

    .line 31
    new-array v4, v3, [Z

    .line 32
    .line 33
    move v5, v1

    .line 34
    :goto_0
    if-ge v5, v3, :cond_0

    .line 35
    .line 36
    aput-boolean v1, v4, v5

    .line 37
    .line 38
    add-int/lit8 v5, v5, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    aget v3, p1, v1

    .line 42
    .line 43
    invoke-virtual {v0}, Lio/objectbox/relation/ToMany;->size()I

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    :goto_1
    const/4 v6, 0x1

    .line 48
    if-ge v3, v5, :cond_9

    .line 49
    .line 50
    aget v7, p1, v6

    .line 51
    .line 52
    invoke-virtual {v0, v3}, Lio/objectbox/relation/ToMany;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v8

    .line 56
    check-cast v8, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

    .line 57
    .line 58
    invoke-virtual {v8}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->getCommandInfoEntity()Lio/objectbox/relation/ToMany;

    .line 59
    .line 60
    .line 61
    move-result-object v8

    .line 62
    invoke-virtual {v8}, Lio/objectbox/relation/ToMany;->size()I

    .line 63
    .line 64
    .line 65
    move-result v8

    .line 66
    :goto_2
    if-ge v7, v8, :cond_8

    .line 67
    .line 68
    invoke-virtual {v0, v3}, Lio/objectbox/relation/ToMany;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v9

    .line 72
    check-cast v9, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

    .line 73
    .line 74
    invoke-virtual {v9}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->getCommandInfoEntity()Lio/objectbox/relation/ToMany;

    .line 75
    .line 76
    .line 77
    move-result-object v9

    .line 78
    invoke-virtual {v9, v7}, Lio/objectbox/relation/ToMany;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v9

    .line 82
    check-cast v9, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 83
    .line 84
    invoke-virtual {v9}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getCommandEnum()Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 85
    .line 86
    .line 87
    move-result-object v10

    .line 88
    sget-object v11, Lcom/zykj/blackboard/crop/CropManager$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 89
    .line 90
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 91
    .line 92
    .line 93
    move-result v10

    .line 94
    aget v10, v11, v10

    .line 95
    .line 96
    const/4 v11, 0x2

    .line 97
    const-string v12, "data.sourceFileName"

    .line 98
    .line 99
    if-eq v10, v6, :cond_3

    .line 100
    .line 101
    const/4 v13, 0x3

    .line 102
    if-eq v10, v11, :cond_2

    .line 103
    .line 104
    if-eq v10, v13, :cond_1

    .line 105
    .line 106
    goto/16 :goto_3

    .line 107
    .line 108
    :cond_1
    invoke-virtual {v9}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getData()[B

    .line 109
    .line 110
    .line 111
    move-result-object v9

    .line 112
    invoke-static {v9}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;->parseFrom([B)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;

    .line 113
    .line 114
    .line 115
    move-result-object v9

    .line 116
    aget-boolean v10, v4, v13

    .line 117
    .line 118
    if-nez v10, :cond_7

    .line 119
    .line 120
    invoke-virtual {v9}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;->getSourceFileName()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v10

    .line 124
    invoke-static {v10, v12}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v9}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;->getSourceId()I

    .line 128
    .line 129
    .line 130
    move-result v9

    .line 131
    invoke-direct {p0, v10, v9}, Lcom/zykj/blackboard/crop/CropManager;->deleteMatrixEntity(Ljava/lang/String;I)V

    .line 132
    .line 133
    .line 134
    aput-boolean v6, v4, v13

    .line 135
    .line 136
    goto/16 :goto_3

    .line 137
    .line 138
    :cond_2
    invoke-virtual {v9}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getData()[B

    .line 139
    .line 140
    .line 141
    move-result-object v9

    .line 142
    invoke-static {v9}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;->parseFrom([B)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;

    .line 143
    .line 144
    .line 145
    move-result-object v9

    .line 146
    aget-boolean v10, v4, v13

    .line 147
    .line 148
    if-nez v10, :cond_7

    .line 149
    .line 150
    invoke-virtual {v9}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;->getSourceFileName()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v10

    .line 154
    invoke-static {v10, v12}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v9}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$CameraMatrix;->getSourceId()I

    .line 158
    .line 159
    .line 160
    move-result v9

    .line 161
    invoke-direct {p0, v10, v9}, Lcom/zykj/blackboard/crop/CropManager;->deleteMatrixEntity(Ljava/lang/String;I)V

    .line 162
    .line 163
    .line 164
    aput-boolean v6, v4, v13

    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_3
    invoke-virtual {v9}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getData()[B

    .line 168
    .line 169
    .line 170
    move-result-object v9

    .line 171
    invoke-static {v9}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->parseFrom([B)Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;

    .line 172
    .line 173
    .line 174
    move-result-object v9

    .line 175
    invoke-virtual {v9}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->getGraphEnum()Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 176
    .line 177
    .line 178
    move-result-object v10

    .line 179
    sget-object v13, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->IMAGE_GRAPH:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 180
    .line 181
    if-ne v10, v13, :cond_4

    .line 182
    .line 183
    aget-boolean v10, v4, v1

    .line 184
    .line 185
    if-nez v10, :cond_4

    .line 186
    .line 187
    invoke-virtual {v9}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->getSourceFileName()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v10

    .line 191
    invoke-static {v10, v12}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v9}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->getSourceId()I

    .line 195
    .line 196
    .line 197
    move-result v9

    .line 198
    invoke-direct {p0, v10, v9}, Lcom/zykj/blackboard/crop/CropManager;->deleteFileEntity(Ljava/lang/String;I)V

    .line 199
    .line 200
    .line 201
    aput-boolean v6, v4, v1

    .line 202
    .line 203
    goto :goto_3

    .line 204
    :cond_4
    invoke-virtual {v9}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->getGraphEnum()Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 205
    .line 206
    .line 207
    move-result-object v10

    .line 208
    sget-object v13, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->TEXT_GRAPH:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 209
    .line 210
    if-ne v10, v13, :cond_5

    .line 211
    .line 212
    aget-boolean v10, v4, v6

    .line 213
    .line 214
    if-nez v10, :cond_5

    .line 215
    .line 216
    invoke-virtual {v9}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->getSourceFileName()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v10

    .line 220
    invoke-static {v10, v12}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v9}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->getSourceId()I

    .line 224
    .line 225
    .line 226
    move-result v9

    .line 227
    invoke-direct {p0, v10, v9}, Lcom/zykj/blackboard/crop/CropManager;->deleteTextEntity(Ljava/lang/String;I)V

    .line 228
    .line 229
    .line 230
    aput-boolean v6, v4, v6

    .line 231
    .line 232
    goto :goto_3

    .line 233
    :cond_5
    invoke-virtual {v9}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->getGraphEnum()Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 234
    .line 235
    .line 236
    move-result-object v10

    .line 237
    sget-object v13, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->STROKE_GRAPH:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 238
    .line 239
    if-eq v10, v13, :cond_6

    .line 240
    .line 241
    invoke-virtual {v9}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->getGraphEnum()Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 242
    .line 243
    .line 244
    move-result-object v10

    .line 245
    sget-object v13, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->BEELINE_STROKE_GRAPH:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 246
    .line 247
    if-ne v10, v13, :cond_7

    .line 248
    .line 249
    aget-boolean v10, v4, v11

    .line 250
    .line 251
    if-nez v10, :cond_7

    .line 252
    .line 253
    :cond_6
    invoke-virtual {v9}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->getSourceFileName()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v10

    .line 257
    invoke-static {v10, v12}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v9}, Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;->getSourceId()I

    .line 261
    .line 262
    .line 263
    move-result v9

    .line 264
    invoke-direct {p0, v10, v9}, Lcom/zykj/blackboard/crop/CropManager;->deleteTouchEntity(Ljava/lang/String;I)V

    .line 265
    .line 266
    .line 267
    aput-boolean v6, v4, v11

    .line 268
    .line 269
    :cond_7
    :goto_3
    add-int/lit8 v7, v7, 0x1

    .line 270
    .line 271
    goto/16 :goto_2

    .line 272
    .line 273
    :cond_8
    add-int/lit8 v3, v3, 0x1

    .line 274
    .line 275
    goto/16 :goto_1

    .line 276
    .line 277
    :cond_9
    aget v3, p1, v1

    .line 278
    .line 279
    add-int/2addr v3, v6

    .line 280
    invoke-virtual {v0}, Lio/objectbox/relation/ToMany;->size()I

    .line 281
    .line 282
    .line 283
    move-result v4

    .line 284
    if-ge v3, v4, :cond_a

    .line 285
    .line 286
    aget v3, p1, v1

    .line 287
    .line 288
    add-int/2addr v3, v6

    .line 289
    invoke-virtual {v0}, Lio/objectbox/relation/ToMany;->size()I

    .line 290
    .line 291
    .line 292
    move-result v4

    .line 293
    :goto_4
    if-ge v3, v4, :cond_a

    .line 294
    .line 295
    aget v5, p1, v1

    .line 296
    .line 297
    add-int/2addr v5, v6

    .line 298
    invoke-virtual {v0, v5}, Lio/objectbox/relation/ToMany;->remove(I)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    add-int/lit8 v3, v3, 0x1

    .line 302
    .line 303
    goto :goto_4

    .line 304
    :cond_a
    aget v3, p1, v6

    .line 305
    .line 306
    invoke-virtual {v2}, Lio/objectbox/relation/ToMany;->size()I

    .line 307
    .line 308
    .line 309
    move-result v4

    .line 310
    if-ge v3, v4, :cond_b

    .line 311
    .line 312
    aget v3, p1, v6

    .line 313
    .line 314
    invoke-virtual {v2}, Lio/objectbox/relation/ToMany;->size()I

    .line 315
    .line 316
    .line 317
    move-result v4

    .line 318
    :goto_5
    if-ge v3, v4, :cond_b

    .line 319
    .line 320
    aget v5, p1, v6

    .line 321
    .line 322
    invoke-virtual {v2, v5}, Lio/objectbox/relation/ToMany;->remove(I)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    add-int/lit8 v3, v3, 0x1

    .line 326
    .line 327
    goto :goto_5

    .line 328
    :cond_b
    invoke-virtual {v2}, Lio/objectbox/relation/ToMany;->isEmpty()Z

    .line 329
    .line 330
    .line 331
    move-result v2

    .line 332
    if-eqz v2, :cond_c

    .line 333
    .line 334
    aget p1, p1, v1

    .line 335
    .line 336
    invoke-virtual {v0, p1}, Lio/objectbox/relation/ToMany;->remove(I)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    :cond_c
    invoke-static {v0}, Lkotlin/collections/t;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object p1

    .line 343
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

    .line 344
    .line 345
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->getCommandInfoEntity()Lio/objectbox/relation/ToMany;

    .line 346
    .line 347
    .line 348
    move-result-object p1

    .line 349
    new-instance v0, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 350
    .line 351
    iget-wide v3, p0, Lcom/zykj/blackboard/crop/CropManager;->stopCommandDelayTime:J

    .line 352
    .line 353
    sget-object v8, Lcom/zykj/board/EzyCommandEnum$CommandEnum;->ACTION_RECORD_STOP:Lcom/zykj/board/EzyCommandEnum$CommandEnum;

    .line 354
    .line 355
    invoke-static {}, Lcom/google/protobuf/Any;->newBuilder()Lcom/google/protobuf/Any$Builder;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    invoke-virtual {v1}, Lcom/google/protobuf/Any$Builder;->build()Lcom/google/protobuf/Any;

    .line 360
    .line 361
    .line 362
    move-result-object v1

    .line 363
    invoke-virtual {v1}, Lcom/google/protobuf/AbstractMessageLite;->toByteArray()[B

    .line 364
    .line 365
    .line 366
    move-result-object v9

    .line 367
    const-string v1, "newBuilder().build().toByteArray()"

    .line 368
    .line 369
    invoke-static {v9, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    const-wide/16 v1, 0x0

    .line 373
    .line 374
    const-wide/16 v5, 0x0

    .line 375
    .line 376
    const/4 v7, 0x1

    .line 377
    invoke-direct/range {v0 .. v9}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;-><init>(JJJZLcom/zykj/board/EzyCommandEnum$CommandEnum;[B)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {p1, v0}, Lio/objectbox/relation/ToMany;->add(Ljava/lang/Object;)Z

    .line 381
    .line 382
    .line 383
    return-void
.end method

.method private final deleteFileEntity(Ljava/lang/String;I)V
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/crop/CropManager;->pageEntity:Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getRecordEntity()Lio/objectbox/relation/ToOne;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lio/objectbox/relation/ToOne;->getTarget()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getFileList()Lio/objectbox/relation/ToMany;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const/4 v2, 0x0

    .line 22
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    const/4 v4, -0x1

    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    check-cast v3, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;

    .line 34
    .line 35
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->getFileName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_0

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    move v2, v4

    .line 50
    :goto_1
    if-ne v2, v4, :cond_2

    .line 51
    .line 52
    goto/16 :goto_7

    .line 53
    .line 54
    :cond_2
    invoke-virtual {v0, v2}, Lio/objectbox/relation/ToMany;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;

    .line 59
    .line 60
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->getFileInfoEntity()Lio/objectbox/relation/ToMany;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    add-int/lit8 v1, v2, 0x1

    .line 65
    .line 66
    invoke-virtual {v0}, Lio/objectbox/relation/ToMany;->size()I

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    move v4, v1

    .line 71
    :goto_2
    if-ge v4, v3, :cond_4

    .line 72
    .line 73
    invoke-virtual {v0, v4}, Lio/objectbox/relation/ToMany;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    check-cast v5, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;

    .line 78
    .line 79
    invoke-virtual {v5}, Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;->getFileInfoEntity()Lio/objectbox/relation/ToMany;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v6

    .line 91
    if-eqz v6, :cond_3

    .line 92
    .line 93
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    check-cast v6, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;

    .line 98
    .line 99
    new-instance v7, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 102
    .line 103
    .line 104
    sget-object v8, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->Companion:Lcom/zykj/blackboard/core/record/SourceRouterRecord$Companion;

    .line 105
    .line 106
    iget-object v9, p0, Lcom/zykj/blackboard/crop/CropManager;->pagePath:Ljava/lang/String;

    .line 107
    .line 108
    sget-object v10, Lcom/zykj/blackboard/enums/DocumentType;->IMAGE:Lcom/zykj/blackboard/enums/DocumentType;

    .line 109
    .line 110
    invoke-virtual {v8, v9, v10}, Lcom/zykj/blackboard/core/record/SourceRouterRecord$Companion;->getResPath(Ljava/lang/String;Lcom/zykj/blackboard/enums/DocumentType;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v8

    .line 114
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    sget-char v8, Ljava/io/File;->separatorChar:C

    .line 118
    .line 119
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v6}, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;->getFileName()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    sget-object v7, Lcom/zykj/blackboard/utils/FileUtils;->INSTANCE:Lcom/zykj/blackboard/utils/FileUtils;

    .line 134
    .line 135
    invoke-virtual {v7, v6}, Lcom/zykj/blackboard/utils/FileUtils;->delete(Ljava/lang/String;)Z

    .line 136
    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_4
    invoke-virtual {p1}, Lio/objectbox/relation/ToMany;->size()I

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    move v4, p2

    .line 147
    :goto_4
    if-ge v4, v3, :cond_5

    .line 148
    .line 149
    invoke-virtual {p1, v4}, Lio/objectbox/relation/ToMany;->get(I)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    check-cast v5, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;

    .line 154
    .line 155
    new-instance v6, Ljava/lang/StringBuilder;

    .line 156
    .line 157
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 158
    .line 159
    .line 160
    sget-object v7, Lcom/zykj/blackboard/core/record/SourceRouterRecord;->Companion:Lcom/zykj/blackboard/core/record/SourceRouterRecord$Companion;

    .line 161
    .line 162
    iget-object v8, p0, Lcom/zykj/blackboard/crop/CropManager;->pagePath:Ljava/lang/String;

    .line 163
    .line 164
    sget-object v9, Lcom/zykj/blackboard/enums/DocumentType;->IMAGE:Lcom/zykj/blackboard/enums/DocumentType;

    .line 165
    .line 166
    invoke-virtual {v7, v8, v9}, Lcom/zykj/blackboard/core/record/SourceRouterRecord$Companion;->getResPath(Ljava/lang/String;Lcom/zykj/blackboard/enums/DocumentType;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v7

    .line 170
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    sget-char v7, Ljava/io/File;->separatorChar:C

    .line 174
    .line 175
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v5}, Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;->getFileName()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    sget-object v6, Lcom/zykj/blackboard/utils/FileUtils;->INSTANCE:Lcom/zykj/blackboard/utils/FileUtils;

    .line 190
    .line 191
    invoke-virtual {v6, v5}, Lcom/zykj/blackboard/utils/FileUtils;->delete(Ljava/lang/String;)Z

    .line 192
    .line 193
    .line 194
    add-int/lit8 v4, v4, 0x1

    .line 195
    .line 196
    goto :goto_4

    .line 197
    :cond_5
    invoke-virtual {v0}, Lio/objectbox/relation/ToMany;->size()I

    .line 198
    .line 199
    .line 200
    move-result v3

    .line 201
    if-ge v1, v3, :cond_6

    .line 202
    .line 203
    invoke-virtual {v0}, Lio/objectbox/relation/ToMany;->size()I

    .line 204
    .line 205
    .line 206
    move-result v3

    .line 207
    move v4, v1

    .line 208
    :goto_5
    if-ge v4, v3, :cond_6

    .line 209
    .line 210
    invoke-virtual {v0, v1}, Lio/objectbox/relation/ToMany;->remove(I)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    add-int/lit8 v4, v4, 0x1

    .line 214
    .line 215
    goto :goto_5

    .line 216
    :cond_6
    invoke-virtual {p1}, Lio/objectbox/relation/ToMany;->size()I

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    move v3, p2

    .line 221
    :goto_6
    if-ge v3, v1, :cond_7

    .line 222
    .line 223
    invoke-virtual {p1, p2}, Lio/objectbox/relation/ToMany;->remove(I)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    add-int/lit8 v3, v3, 0x1

    .line 227
    .line 228
    goto :goto_6

    .line 229
    :cond_7
    invoke-virtual {p1}, Lio/objectbox/relation/ToMany;->isEmpty()Z

    .line 230
    .line 231
    .line 232
    move-result p1

    .line 233
    if-eqz p1, :cond_8

    .line 234
    .line 235
    invoke-virtual {v0, v2}, Lio/objectbox/relation/ToMany;->remove(I)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    :cond_8
    :goto_7
    return-void
.end method

.method private final deleteMatrixEntity(Ljava/lang/String;I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/crop/CropManager;->pageEntity:Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getRecordEntity()Lio/objectbox/relation/ToOne;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lio/objectbox/relation/ToOne;->getTarget()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getMatrixList()Lio/objectbox/relation/ToMany;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const/4 v2, 0x0

    .line 22
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    const/4 v4, -0x1

    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    check-cast v3, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;

    .line 34
    .line 35
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->getFileName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_0

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    move v2, v4

    .line 50
    :goto_1
    if-ne v2, v4, :cond_2

    .line 51
    .line 52
    goto :goto_4

    .line 53
    :cond_2
    invoke-virtual {v0, v2}, Lio/objectbox/relation/ToMany;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;

    .line 58
    .line 59
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/MatrixRecordEntity;->getMatrixEventEntity()Lio/objectbox/relation/ToMany;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    add-int/lit8 v1, v2, 0x1

    .line 64
    .line 65
    invoke-virtual {v0}, Lio/objectbox/relation/ToMany;->size()I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-ge v1, v3, :cond_3

    .line 70
    .line 71
    invoke-virtual {v0}, Lio/objectbox/relation/ToMany;->size()I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    move v4, v1

    .line 76
    :goto_2
    if-ge v4, v3, :cond_3

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Lio/objectbox/relation/ToMany;->remove(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    add-int/lit8 v4, v4, 0x1

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_3
    invoke-virtual {p1}, Lio/objectbox/relation/ToMany;->size()I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    move v3, p2

    .line 89
    :goto_3
    if-ge v3, v1, :cond_4

    .line 90
    .line 91
    invoke-virtual {p1, p2}, Lio/objectbox/relation/ToMany;->remove(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    add-int/lit8 v3, v3, 0x1

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_4
    invoke-virtual {p1}, Lio/objectbox/relation/ToMany;->isEmpty()Z

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    if-eqz p1, :cond_5

    .line 102
    .line 103
    invoke-virtual {v0, v2}, Lio/objectbox/relation/ToMany;->remove(I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    :cond_5
    :goto_4
    return-void
.end method

.method private final deleteTextEntity(Ljava/lang/String;I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/crop/CropManager;->pageEntity:Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getRecordEntity()Lio/objectbox/relation/ToOne;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lio/objectbox/relation/ToOne;->getTarget()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getTextList()Lio/objectbox/relation/ToMany;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const/4 v2, 0x0

    .line 22
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    const/4 v4, -0x1

    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    check-cast v3, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;

    .line 34
    .line 35
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->getFileName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_0

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    move v2, v4

    .line 50
    :goto_1
    if-ne v2, v4, :cond_2

    .line 51
    .line 52
    goto :goto_4

    .line 53
    :cond_2
    invoke-virtual {v0, v2}, Lio/objectbox/relation/ToMany;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;

    .line 58
    .line 59
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;->getTextInfoEntityList()Lio/objectbox/relation/ToMany;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    add-int/lit8 v1, v2, 0x1

    .line 64
    .line 65
    invoke-virtual {v0}, Lio/objectbox/relation/ToMany;->size()I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-ge v1, v3, :cond_3

    .line 70
    .line 71
    invoke-virtual {v0}, Lio/objectbox/relation/ToMany;->size()I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    move v4, v1

    .line 76
    :goto_2
    if-ge v4, v3, :cond_3

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Lio/objectbox/relation/ToMany;->remove(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    add-int/lit8 v4, v4, 0x1

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_3
    invoke-virtual {p1}, Lio/objectbox/relation/ToMany;->size()I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    move v3, p2

    .line 89
    :goto_3
    if-ge v3, v1, :cond_4

    .line 90
    .line 91
    invoke-virtual {p1, p2}, Lio/objectbox/relation/ToMany;->remove(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    add-int/lit8 v3, v3, 0x1

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_4
    invoke-virtual {p1}, Lio/objectbox/relation/ToMany;->isEmpty()Z

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    if-eqz p1, :cond_5

    .line 102
    .line 103
    invoke-virtual {v0, v2}, Lio/objectbox/relation/ToMany;->remove(I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    :cond_5
    :goto_4
    return-void
.end method

.method private final deleteTouchEntity(Ljava/lang/String;I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/crop/CropManager;->pageEntity:Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getRecordEntity()Lio/objectbox/relation/ToOne;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lio/objectbox/relation/ToOne;->getTarget()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getTouchList()Lio/objectbox/relation/ToMany;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const/4 v2, 0x0

    .line 22
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    const/4 v4, -0x1

    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    check-cast v3, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;

    .line 34
    .line 35
    invoke-virtual {v3}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->getFileName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_0

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    move v2, v4

    .line 50
    :goto_1
    if-ne v2, v4, :cond_2

    .line 51
    .line 52
    goto :goto_4

    .line 53
    :cond_2
    invoke-virtual {v0, v2}, Lio/objectbox/relation/ToMany;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;

    .line 58
    .line 59
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/TouchRecordEntity;->getTouchEventList()Lio/objectbox/relation/ToMany;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    add-int/lit8 v1, v2, 0x1

    .line 64
    .line 65
    invoke-virtual {v0}, Lio/objectbox/relation/ToMany;->size()I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-ge v1, v3, :cond_3

    .line 70
    .line 71
    invoke-virtual {v0}, Lio/objectbox/relation/ToMany;->size()I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    move v4, v1

    .line 76
    :goto_2
    if-ge v4, v3, :cond_3

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Lio/objectbox/relation/ToMany;->remove(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    add-int/lit8 v4, v4, 0x1

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_3
    invoke-virtual {p1}, Lio/objectbox/relation/ToMany;->size()I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    move v3, p2

    .line 89
    :goto_3
    if-ge v3, v1, :cond_4

    .line 90
    .line 91
    invoke-virtual {p1, p2}, Lio/objectbox/relation/ToMany;->remove(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    add-int/lit8 v3, v3, 0x1

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_4
    invoke-virtual {p1}, Lio/objectbox/relation/ToMany;->isEmpty()Z

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    if-eqz p1, :cond_5

    .line 102
    .line 103
    invoke-virtual {v0, v2}, Lio/objectbox/relation/ToMany;->remove(I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    :cond_5
    :goto_4
    return-void
.end method


# virtual methods
.method public final calculateRecentTime(J)J
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/crop/CropManager;->commandDelayTimeList:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/zykj/blackboard/crop/CropManager;->getCommandDelayTimeList()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/zykj/blackboard/crop/CropManager;->commandDelayTimeList:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x0

    .line 19
    move v2, v1

    .line 20
    :goto_0
    const/4 v3, 0x1

    .line 21
    if-ge v2, v0, :cond_4

    .line 22
    .line 23
    iget-object v4, p0, Lcom/zykj/blackboard/crop/CropManager;->commandDelayTimeList:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    check-cast v4, [J

    .line 30
    .line 31
    aget-wide v5, v4, v1

    .line 32
    .line 33
    cmp-long v4, p1, v5

    .line 34
    .line 35
    if-ltz v4, :cond_1

    .line 36
    .line 37
    iget-object v4, p0, Lcom/zykj/blackboard/crop/CropManager;->commandDelayTimeList:Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    check-cast v4, [J

    .line 44
    .line 45
    aget-wide v5, v4, v3

    .line 46
    .line 47
    cmp-long v4, p1, v5

    .line 48
    .line 49
    if-gtz v4, :cond_1

    .line 50
    .line 51
    iget-object v0, p0, Lcom/zykj/blackboard/crop/CropManager;->commandDelayTimeToIndex:Ljava/util/HashMap;

    .line 52
    .line 53
    iget-object v3, p0, Lcom/zykj/blackboard/crop/CropManager;->commandDelayTimeList:Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-static {v0}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    check-cast v0, [I

    .line 67
    .line 68
    iput-object v0, p0, Lcom/zykj/blackboard/crop/CropManager;->deleteCommandIndexArray:[I

    .line 69
    .line 70
    iget-object v0, p0, Lcom/zykj/blackboard/crop/CropManager;->commandDelayTimeList:Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, [J

    .line 77
    .line 78
    aget-wide v1, v0, v1

    .line 79
    .line 80
    sub-long v0, p1, v1

    .line 81
    .line 82
    iput-wide v0, p0, Lcom/zykj/blackboard/crop/CropManager;->stopCommandDelayTime:J

    .line 83
    .line 84
    return-wide p1

    .line 85
    :cond_1
    iget-object v4, p0, Lcom/zykj/blackboard/crop/CropManager;->commandDelayTimeList:Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    check-cast v4, [J

    .line 92
    .line 93
    aget-wide v5, v4, v1

    .line 94
    .line 95
    cmp-long v4, p1, v5

    .line 96
    .line 97
    if-gez v4, :cond_3

    .line 98
    .line 99
    iget-object v0, p0, Lcom/zykj/blackboard/crop/CropManager;->commandDelayTimeList:Ljava/util/ArrayList;

    .line 100
    .line 101
    add-int/lit8 v4, v2, -0x1

    .line 102
    .line 103
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    check-cast v0, [J

    .line 108
    .line 109
    aget-wide v5, v0, v3

    .line 110
    .line 111
    sub-long v5, p1, v5

    .line 112
    .line 113
    iget-object v0, p0, Lcom/zykj/blackboard/crop/CropManager;->commandDelayTimeList:Ljava/util/ArrayList;

    .line 114
    .line 115
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    check-cast v0, [J

    .line 120
    .line 121
    aget-wide v7, v0, v1

    .line 122
    .line 123
    sub-long/2addr v7, p1

    .line 124
    cmp-long p1, v5, v7

    .line 125
    .line 126
    if-lez p1, :cond_2

    .line 127
    .line 128
    iget-object p1, p0, Lcom/zykj/blackboard/crop/CropManager;->commandDelayTimeToIndex:Ljava/util/HashMap;

    .line 129
    .line 130
    iget-object p2, p0, Lcom/zykj/blackboard/crop/CropManager;->commandDelayTimeList:Ljava/util/ArrayList;

    .line 131
    .line 132
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-static {p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    check-cast p1, [I

    .line 144
    .line 145
    iput-object p1, p0, Lcom/zykj/blackboard/crop/CropManager;->deleteCommandIndexArray:[I

    .line 146
    .line 147
    const-wide/16 p1, 0x0

    .line 148
    .line 149
    iput-wide p1, p0, Lcom/zykj/blackboard/crop/CropManager;->stopCommandDelayTime:J

    .line 150
    .line 151
    iget-object p1, p0, Lcom/zykj/blackboard/crop/CropManager;->commandDelayTimeList:Ljava/util/ArrayList;

    .line 152
    .line 153
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    check-cast p1, [J

    .line 158
    .line 159
    aget-wide v0, p1, v1

    .line 160
    .line 161
    return-wide v0

    .line 162
    :cond_2
    iget-object p1, p0, Lcom/zykj/blackboard/crop/CropManager;->commandDelayTimeToIndex:Ljava/util/HashMap;

    .line 163
    .line 164
    iget-object p2, p0, Lcom/zykj/blackboard/crop/CropManager;->commandDelayTimeList:Ljava/util/ArrayList;

    .line 165
    .line 166
    invoke-virtual {p2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p2

    .line 170
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    invoke-static {p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    check-cast p1, [I

    .line 178
    .line 179
    iput-object p1, p0, Lcom/zykj/blackboard/crop/CropManager;->deleteCommandIndexArray:[I

    .line 180
    .line 181
    iget-object p1, p0, Lcom/zykj/blackboard/crop/CropManager;->commandDelayTimeList:Ljava/util/ArrayList;

    .line 182
    .line 183
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    check-cast p1, [J

    .line 188
    .line 189
    aget-wide v5, p1, v3

    .line 190
    .line 191
    iget-object p1, p0, Lcom/zykj/blackboard/crop/CropManager;->commandDelayTimeList:Ljava/util/ArrayList;

    .line 192
    .line 193
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    check-cast p1, [J

    .line 198
    .line 199
    aget-wide v0, p1, v1

    .line 200
    .line 201
    sub-long/2addr v5, v0

    .line 202
    iput-wide v5, p0, Lcom/zykj/blackboard/crop/CropManager;->stopCommandDelayTime:J

    .line 203
    .line 204
    iget-object p1, p0, Lcom/zykj/blackboard/crop/CropManager;->commandDelayTimeList:Ljava/util/ArrayList;

    .line 205
    .line 206
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    check-cast p1, [J

    .line 211
    .line 212
    aget-wide v0, p1, v3

    .line 213
    .line 214
    return-wide v0

    .line 215
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 216
    .line 217
    goto/16 :goto_0

    .line 218
    .line 219
    :cond_4
    iget-object p1, p0, Lcom/zykj/blackboard/crop/CropManager;->commandDelayTimeList:Ljava/util/ArrayList;

    .line 220
    .line 221
    invoke-static {p1}, Lkotlin/collections/t;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    check-cast p1, [J

    .line 226
    .line 227
    aget-wide v0, p1, v3

    .line 228
    .line 229
    return-wide v0
.end method

.method public final cropByTime(JLr6/c;)V
    .locals 2
    .param p3    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/Thread;

    .line 7
    .line 8
    new-instance v1, Lz3/a;

    .line 9
    .line 10
    invoke-direct {v1, p0, p1, p2, p3}, Lz3/a;-><init>(Lcom/zykj/blackboard/crop/CropManager;JLr6/c;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final getCommandDelayTimeList()Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "[J>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/crop/CropManager;->commandDelayTimeList:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    iget-object v0, p0, Lcom/zykj/blackboard/crop/CropManager;->pageEntity:Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getRecordEntity()Lio/objectbox/relation/ToOne;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lio/objectbox/relation/ToOne;->getTarget()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getCommandList()Lio/objectbox/relation/ToMany;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Lio/objectbox/relation/ToMany;->size()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const/4 v1, 0x0

    .line 30
    const-wide/16 v2, 0x0

    .line 31
    .line 32
    move v4, v1

    .line 33
    :goto_0
    if-ge v4, v0, :cond_3

    .line 34
    .line 35
    iget-object v5, p0, Lcom/zykj/blackboard/crop/CropManager;->pageEntity:Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 36
    .line 37
    invoke-virtual {v5}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->getRecordEntity()Lio/objectbox/relation/ToOne;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    invoke-virtual {v5}, Lio/objectbox/relation/ToOne;->getTarget()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    check-cast v5, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 46
    .line 47
    invoke-virtual {v5}, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->getCommandList()Lio/objectbox/relation/ToMany;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    invoke-virtual {v5, v4}, Lio/objectbox/relation/ToMany;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    check-cast v5, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

    .line 56
    .line 57
    invoke-virtual {v5}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->getCommandInfoEntity()Lio/objectbox/relation/ToMany;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    invoke-virtual {v6}, Lio/objectbox/relation/ToMany;->size()I

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    move v7, v1

    .line 66
    :goto_1
    if-ge v7, v6, :cond_2

    .line 67
    .line 68
    invoke-virtual {v5}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->getCommandInfoEntity()Lio/objectbox/relation/ToMany;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    invoke-virtual {v8, v7}, Lio/objectbox/relation/ToMany;->get(I)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v8

    .line 76
    check-cast v8, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    .line 77
    .line 78
    invoke-virtual {v8}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->isPlay()Z

    .line 79
    .line 80
    .line 81
    move-result v9

    .line 82
    if-eqz v9, :cond_1

    .line 83
    .line 84
    invoke-virtual {v8}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getDelayTime()J

    .line 85
    .line 86
    .line 87
    move-result-wide v9

    .line 88
    add-long/2addr v9, v2

    .line 89
    const/4 v11, 0x2

    .line 90
    new-array v11, v11, [J

    .line 91
    .line 92
    aput-wide v2, v11, v1

    .line 93
    .line 94
    const/4 v12, 0x1

    .line 95
    aput-wide v9, v11, v12

    .line 96
    .line 97
    iget-object v9, p0, Lcom/zykj/blackboard/crop/CropManager;->commandDelayTimeList:Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    iget-object v9, p0, Lcom/zykj/blackboard/crop/CropManager;->commandDelayTimeToIndex:Ljava/util/HashMap;

    .line 103
    .line 104
    invoke-virtual {v9, v11}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v9

    .line 108
    if-nez v9, :cond_0

    .line 109
    .line 110
    iget-object v9, p0, Lcom/zykj/blackboard/crop/CropManager;->commandDelayTimeToIndex:Ljava/util/HashMap;

    .line 111
    .line 112
    filled-new-array {v4, v7}, [I

    .line 113
    .line 114
    .line 115
    move-result-object v10

    .line 116
    invoke-interface {v9, v11, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    :cond_0
    invoke-virtual {v8}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getDelayTime()J

    .line 120
    .line 121
    .line 122
    move-result-wide v9

    .line 123
    invoke-virtual {v8}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getDuration()J

    .line 124
    .line 125
    .line 126
    move-result-wide v11

    .line 127
    add-long/2addr v11, v9

    .line 128
    add-long/2addr v2, v11

    .line 129
    :cond_1
    add-int/lit8 v7, v7, 0x1

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_3
    iget-object v0, p0, Lcom/zykj/blackboard/crop/CropManager;->commandDelayTimeList:Ljava/util/ArrayList;

    .line 136
    .line 137
    invoke-static {v0}, Lkotlin/collections/t;->D0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    return-object v0
.end method
