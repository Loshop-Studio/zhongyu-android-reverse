.class public final Lcom/zykj/view/board/board/DataStateKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\"\u0017\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0004\"\u0017\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0001\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0004\"\u0017\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0001\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u0004\"\u0017\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u0001\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0004\"\u0017\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0001\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0004\u00a8\u0006\u0013"
    }
    d2 = {
        "zoomLevelList",
        "",
        "Lcom/zykj/view/board/board/ZoomLevel;",
        "getZoomLevelList",
        "()Ljava/util/List;",
        "zoomLevelList5",
        "getZoomLevelList5",
        "penTypeList",
        "Lcom/zykj/view/board/board/PenType;",
        "getPenTypeList",
        "penColorList",
        "Lcom/zykj/view/board/board/PenColor;",
        "getPenColorList",
        "eraserTypeList",
        "Lcom/zykj/view/board/board/EraserType;",
        "getEraserTypeList",
        "backgroundTypeList",
        "Lcom/zykj/view/board/board/BackgroundType;",
        "getBackgroundTypeList",
        "view_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final backgroundTypeList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/view/board/board/BackgroundType;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final eraserTypeList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/view/board/board/EraserType;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final penColorList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/view/board/board/PenColor;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final penTypeList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/view/board/board/PenType;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final zoomLevelList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/view/board/board/ZoomLevel;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final zoomLevelList5:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/view/board/board/ZoomLevel;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 17

    .line 1
    sget-object v0, Lcom/zykj/view/board/board/ZoomLevel$Level0;->INSTANCE:Lcom/zykj/view/board/board/ZoomLevel$Level0;

    .line 2
    .line 3
    sget-object v1, Lcom/zykj/view/board/board/ZoomLevel$Level1;->INSTANCE:Lcom/zykj/view/board/board/ZoomLevel$Level1;

    .line 4
    .line 5
    sget-object v2, Lcom/zykj/view/board/board/ZoomLevel$Level2;->INSTANCE:Lcom/zykj/view/board/board/ZoomLevel$Level2;

    .line 6
    .line 7
    sget-object v3, Lcom/zykj/view/board/board/ZoomLevel$Level3;->INSTANCE:Lcom/zykj/view/board/board/ZoomLevel$Level3;

    .line 8
    .line 9
    sget-object v4, Lcom/zykj/view/board/board/ZoomLevel$Level4;->INSTANCE:Lcom/zykj/view/board/board/ZoomLevel$Level4;

    .line 10
    .line 11
    sget-object v5, Lcom/zykj/view/board/board/ZoomLevel$Level5;->INSTANCE:Lcom/zykj/view/board/board/ZoomLevel$Level5;

    .line 12
    .line 13
    sget-object v6, Lcom/zykj/view/board/board/ZoomLevel$Level6;->INSTANCE:Lcom/zykj/view/board/board/ZoomLevel$Level6;

    .line 14
    .line 15
    const/4 v7, 0x7

    .line 16
    new-array v8, v7, [Lcom/zykj/view/board/board/ZoomLevel;

    .line 17
    .line 18
    const/4 v9, 0x0

    .line 19
    aput-object v0, v8, v9

    .line 20
    .line 21
    const/4 v10, 0x1

    .line 22
    aput-object v1, v8, v10

    .line 23
    .line 24
    const/4 v11, 0x2

    .line 25
    aput-object v2, v8, v11

    .line 26
    .line 27
    const/4 v12, 0x3

    .line 28
    aput-object v3, v8, v12

    .line 29
    .line 30
    const/4 v13, 0x4

    .line 31
    aput-object v4, v8, v13

    .line 32
    .line 33
    const/4 v14, 0x5

    .line 34
    aput-object v5, v8, v14

    .line 35
    .line 36
    const/4 v15, 0x6

    .line 37
    aput-object v6, v8, v15

    .line 38
    .line 39
    invoke-static {v8}, Lkotlin/collections/u;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v8

    .line 43
    sput-object v8, Lcom/zykj/view/board/board/DataStateKt;->zoomLevelList:Ljava/util/List;

    .line 44
    .line 45
    const/16 v8, 0xb

    .line 46
    .line 47
    new-array v8, v8, [Lcom/zykj/view/board/board/ZoomLevel;

    .line 48
    .line 49
    sget-object v16, Lcom/zykj/view/board/board/ZoomLevel$LevelN2;->INSTANCE:Lcom/zykj/view/board/board/ZoomLevel$LevelN2;

    .line 50
    .line 51
    aput-object v16, v8, v9

    .line 52
    .line 53
    sget-object v16, Lcom/zykj/view/board/board/ZoomLevel$LevelN1;->INSTANCE:Lcom/zykj/view/board/board/ZoomLevel$LevelN1;

    .line 54
    .line 55
    aput-object v16, v8, v10

    .line 56
    .line 57
    aput-object v0, v8, v11

    .line 58
    .line 59
    aput-object v1, v8, v12

    .line 60
    .line 61
    aput-object v2, v8, v13

    .line 62
    .line 63
    aput-object v3, v8, v14

    .line 64
    .line 65
    aput-object v4, v8, v15

    .line 66
    .line 67
    aput-object v5, v8, v7

    .line 68
    .line 69
    const/16 v0, 0x8

    .line 70
    .line 71
    aput-object v6, v8, v0

    .line 72
    .line 73
    sget-object v0, Lcom/zykj/view/board/board/ZoomLevel$Level7;->INSTANCE:Lcom/zykj/view/board/board/ZoomLevel$Level7;

    .line 74
    .line 75
    const/16 v1, 0x9

    .line 76
    .line 77
    aput-object v0, v8, v1

    .line 78
    .line 79
    sget-object v0, Lcom/zykj/view/board/board/ZoomLevel$Level8;->INSTANCE:Lcom/zykj/view/board/board/ZoomLevel$Level8;

    .line 80
    .line 81
    const/16 v1, 0xa

    .line 82
    .line 83
    aput-object v0, v8, v1

    .line 84
    .line 85
    invoke-static {v8}, Lkotlin/collections/u;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    sput-object v0, Lcom/zykj/view/board/board/DataStateKt;->zoomLevelList5:Ljava/util/List;

    .line 90
    .line 91
    new-array v0, v14, [Lcom/zykj/view/board/board/PenType;

    .line 92
    .line 93
    sget-object v1, Lcom/zykj/view/board/board/PenType$Custom;->INSTANCE:Lcom/zykj/view/board/board/PenType$Custom;

    .line 94
    .line 95
    aput-object v1, v0, v9

    .line 96
    .line 97
    sget-object v1, Lcom/zykj/view/board/board/PenType$Line;->INSTANCE:Lcom/zykj/view/board/board/PenType$Line;

    .line 98
    .line 99
    aput-object v1, v0, v10

    .line 100
    .line 101
    sget-object v1, Lcom/zykj/view/board/board/PenType$DottedLine;->INSTANCE:Lcom/zykj/view/board/board/PenType$DottedLine;

    .line 102
    .line 103
    aput-object v1, v0, v11

    .line 104
    .line 105
    sget-object v1, Lcom/zykj/view/board/board/PenType$Highlighter;->INSTANCE:Lcom/zykj/view/board/board/PenType$Highlighter;

    .line 106
    .line 107
    aput-object v1, v0, v12

    .line 108
    .line 109
    sget-object v1, Lcom/zykj/view/board/board/PenType$Cursor;->INSTANCE:Lcom/zykj/view/board/board/PenType$Cursor;

    .line 110
    .line 111
    aput-object v1, v0, v13

    .line 112
    .line 113
    invoke-static {v0}, Lkotlin/collections/u;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    sput-object v0, Lcom/zykj/view/board/board/DataStateKt;->penTypeList:Ljava/util/List;

    .line 118
    .line 119
    new-instance v0, Lcom/zykj/view/board/board/PenColor$ColorCustom;

    .line 120
    .line 121
    const/4 v1, 0x0

    .line 122
    invoke-direct {v0, v9, v10, v1}, Lcom/zykj/view/board/board/PenColor$ColorCustom;-><init>(IILkotlin/jvm/internal/e;)V

    .line 123
    .line 124
    .line 125
    new-array v1, v13, [Lcom/zykj/view/board/board/PenColor;

    .line 126
    .line 127
    aput-object v0, v1, v9

    .line 128
    .line 129
    sget-object v0, Lcom/zykj/view/board/board/PenColor$ColorBlack;->INSTANCE:Lcom/zykj/view/board/board/PenColor$ColorBlack;

    .line 130
    .line 131
    aput-object v0, v1, v10

    .line 132
    .line 133
    sget-object v0, Lcom/zykj/view/board/board/PenColor$ColorWhite;->INSTANCE:Lcom/zykj/view/board/board/PenColor$ColorWhite;

    .line 134
    .line 135
    aput-object v0, v1, v11

    .line 136
    .line 137
    sget-object v0, Lcom/zykj/view/board/board/PenColor$ColorRed;->INSTANCE:Lcom/zykj/view/board/board/PenColor$ColorRed;

    .line 138
    .line 139
    aput-object v0, v1, v12

    .line 140
    .line 141
    invoke-static {v1}, Lkotlin/collections/u;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    sput-object v0, Lcom/zykj/view/board/board/DataStateKt;->penColorList:Ljava/util/List;

    .line 146
    .line 147
    new-array v0, v12, [Lcom/zykj/view/board/board/EraserType;

    .line 148
    .line 149
    sget-object v1, Lcom/zykj/view/board/board/EraserType$Little;->INSTANCE:Lcom/zykj/view/board/board/EraserType$Little;

    .line 150
    .line 151
    aput-object v1, v0, v9

    .line 152
    .line 153
    sget-object v1, Lcom/zykj/view/board/board/EraserType$Middle;->INSTANCE:Lcom/zykj/view/board/board/EraserType$Middle;

    .line 154
    .line 155
    aput-object v1, v0, v10

    .line 156
    .line 157
    sget-object v1, Lcom/zykj/view/board/board/EraserType$Large;->INSTANCE:Lcom/zykj/view/board/board/EraserType$Large;

    .line 158
    .line 159
    aput-object v1, v0, v11

    .line 160
    .line 161
    invoke-static {v0}, Lkotlin/collections/u;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    sput-object v0, Lcom/zykj/view/board/board/DataStateKt;->eraserTypeList:Ljava/util/List;

    .line 166
    .line 167
    new-array v0, v15, [Lcom/zykj/view/board/board/BackgroundType;

    .line 168
    .line 169
    sget-object v1, Lcom/zykj/view/board/board/BackgroundType$ColorWhite;->INSTANCE:Lcom/zykj/view/board/board/BackgroundType$ColorWhite;

    .line 170
    .line 171
    aput-object v1, v0, v9

    .line 172
    .line 173
    sget-object v1, Lcom/zykj/view/board/board/BackgroundType$ColorBlack;->INSTANCE:Lcom/zykj/view/board/board/BackgroundType$ColorBlack;

    .line 174
    .line 175
    aput-object v1, v0, v10

    .line 176
    .line 177
    sget-object v1, Lcom/zykj/view/board/board/BackgroundType$ColorBlue;->INSTANCE:Lcom/zykj/view/board/board/BackgroundType$ColorBlue;

    .line 178
    .line 179
    aput-object v1, v0, v11

    .line 180
    .line 181
    sget-object v1, Lcom/zykj/view/board/board/BackgroundType$ColorGreen;->INSTANCE:Lcom/zykj/view/board/board/BackgroundType$ColorGreen;

    .line 182
    .line 183
    aput-object v1, v0, v12

    .line 184
    .line 185
    sget-object v1, Lcom/zykj/view/board/board/BackgroundType$LineInterweave;->INSTANCE:Lcom/zykj/view/board/board/BackgroundType$LineInterweave;

    .line 186
    .line 187
    aput-object v1, v0, v13

    .line 188
    .line 189
    sget-object v1, Lcom/zykj/view/board/board/BackgroundType$LineHorizontal;->INSTANCE:Lcom/zykj/view/board/board/BackgroundType$LineHorizontal;

    .line 190
    .line 191
    aput-object v1, v0, v14

    .line 192
    .line 193
    invoke-static {v0}, Lkotlin/collections/u;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    sput-object v0, Lcom/zykj/view/board/board/DataStateKt;->backgroundTypeList:Ljava/util/List;

    .line 198
    .line 199
    return-void
.end method

.method public static final getBackgroundTypeList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/view/board/board/BackgroundType;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/view/board/board/DataStateKt;->backgroundTypeList:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getEraserTypeList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/view/board/board/EraserType;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/view/board/board/DataStateKt;->eraserTypeList:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getPenColorList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/view/board/board/PenColor;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/view/board/board/DataStateKt;->penColorList:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getPenTypeList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/view/board/board/PenType;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/view/board/board/DataStateKt;->penTypeList:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getZoomLevelList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/view/board/board/ZoomLevel;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/view/board/board/DataStateKt;->zoomLevelList:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final getZoomLevelList5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/view/board/board/ZoomLevel;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/view/board/board/DataStateKt;->zoomLevelList5:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method
