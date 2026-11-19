.class public final enum Lcom/xuexiang/xui/widget/imageview/crop/Handle;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/xuexiang/xui/widget/imageview/crop/Handle;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

.field public static final enum BOTTOM_LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

.field public static final enum BOTTOM_RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

.field public static final enum CENTER:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

.field public static final enum LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

.field public static final enum RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

.field public static final enum TOP:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

.field public static final enum TOP_LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

.field public static final enum TOP_RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

.field public static final synthetic a:[Lcom/xuexiang/xui/widget/imageview/crop/Handle;


# instance fields
.field private mHelper:Lp2/c;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 2
    .line 3
    new-instance v1, Lp2/a;

    .line 4
    .line 5
    sget-object v2, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->TOP:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 6
    .line 7
    sget-object v3, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    invoke-direct {v1, v2, v3, v4}, Lp2/a;-><init>(Lcom/xuexiang/xui/widget/imageview/crop/Edge;Lcom/xuexiang/xui/widget/imageview/crop/Edge;I)V

    .line 11
    .line 12
    .line 13
    const-string v4, "TOP_LEFT"

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    invoke-direct {v0, v4, v5, v1}, Lcom/xuexiang/xui/widget/imageview/crop/Handle;-><init>(Ljava/lang/String;ILp2/c;)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->TOP_LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 20
    .line 21
    new-instance v1, Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 22
    .line 23
    new-instance v4, Lp2/a;

    .line 24
    .line 25
    sget-object v5, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 26
    .line 27
    const/4 v6, 0x1

    .line 28
    invoke-direct {v4, v2, v5, v6}, Lp2/a;-><init>(Lcom/xuexiang/xui/widget/imageview/crop/Edge;Lcom/xuexiang/xui/widget/imageview/crop/Edge;I)V

    .line 29
    .line 30
    .line 31
    const-string v6, "TOP_RIGHT"

    .line 32
    .line 33
    const/4 v7, 0x1

    .line 34
    invoke-direct {v1, v6, v7, v4}, Lcom/xuexiang/xui/widget/imageview/crop/Handle;-><init>(Ljava/lang/String;ILp2/c;)V

    .line 35
    .line 36
    .line 37
    sput-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->TOP_RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 38
    .line 39
    move-object v4, v2

    .line 40
    new-instance v2, Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 41
    .line 42
    new-instance v6, Lp2/a;

    .line 43
    .line 44
    sget-object v7, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 45
    .line 46
    const/4 v8, 0x1

    .line 47
    invoke-direct {v6, v7, v3, v8}, Lp2/a;-><init>(Lcom/xuexiang/xui/widget/imageview/crop/Edge;Lcom/xuexiang/xui/widget/imageview/crop/Edge;I)V

    .line 48
    .line 49
    .line 50
    const-string v8, "BOTTOM_LEFT"

    .line 51
    .line 52
    const/4 v9, 0x2

    .line 53
    invoke-direct {v2, v8, v9, v6}, Lcom/xuexiang/xui/widget/imageview/crop/Handle;-><init>(Ljava/lang/String;ILp2/c;)V

    .line 54
    .line 55
    .line 56
    sput-object v2, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->BOTTOM_LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 57
    .line 58
    move-object v6, v3

    .line 59
    new-instance v3, Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 60
    .line 61
    new-instance v8, Lp2/a;

    .line 62
    .line 63
    const/4 v9, 0x1

    .line 64
    invoke-direct {v8, v7, v5, v9}, Lp2/a;-><init>(Lcom/xuexiang/xui/widget/imageview/crop/Edge;Lcom/xuexiang/xui/widget/imageview/crop/Edge;I)V

    .line 65
    .line 66
    .line 67
    const-string v9, "BOTTOM_RIGHT"

    .line 68
    .line 69
    const/4 v10, 0x3

    .line 70
    invoke-direct {v3, v9, v10, v8}, Lcom/xuexiang/xui/widget/imageview/crop/Handle;-><init>(Ljava/lang/String;ILp2/c;)V

    .line 71
    .line 72
    .line 73
    sput-object v3, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->BOTTOM_RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 74
    .line 75
    move-object v8, v4

    .line 76
    new-instance v4, Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 77
    .line 78
    new-instance v9, Lp2/e;

    .line 79
    .line 80
    const/4 v10, 0x1

    .line 81
    invoke-direct {v9, v6, v10}, Lp2/e;-><init>(Lcom/xuexiang/xui/widget/imageview/crop/Edge;I)V

    .line 82
    .line 83
    .line 84
    const-string v6, "LEFT"

    .line 85
    .line 86
    const/4 v10, 0x4

    .line 87
    invoke-direct {v4, v6, v10, v9}, Lcom/xuexiang/xui/widget/imageview/crop/Handle;-><init>(Ljava/lang/String;ILp2/c;)V

    .line 88
    .line 89
    .line 90
    sput-object v4, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->LEFT:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 91
    .line 92
    move-object v6, v5

    .line 93
    new-instance v5, Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 94
    .line 95
    new-instance v9, Lp2/e;

    .line 96
    .line 97
    const/4 v10, 0x0

    .line 98
    invoke-direct {v9, v8, v10}, Lp2/e;-><init>(Lcom/xuexiang/xui/widget/imageview/crop/Edge;I)V

    .line 99
    .line 100
    .line 101
    const-string v8, "TOP"

    .line 102
    .line 103
    const/4 v10, 0x5

    .line 104
    invoke-direct {v5, v8, v10, v9}, Lcom/xuexiang/xui/widget/imageview/crop/Handle;-><init>(Ljava/lang/String;ILp2/c;)V

    .line 105
    .line 106
    .line 107
    sput-object v5, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->TOP:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 108
    .line 109
    move-object v8, v6

    .line 110
    new-instance v6, Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 111
    .line 112
    new-instance v9, Lp2/e;

    .line 113
    .line 114
    const/4 v10, 0x1

    .line 115
    invoke-direct {v9, v8, v10}, Lp2/e;-><init>(Lcom/xuexiang/xui/widget/imageview/crop/Edge;I)V

    .line 116
    .line 117
    .line 118
    const-string v8, "RIGHT"

    .line 119
    .line 120
    const/4 v10, 0x6

    .line 121
    invoke-direct {v6, v8, v10, v9}, Lcom/xuexiang/xui/widget/imageview/crop/Handle;-><init>(Ljava/lang/String;ILp2/c;)V

    .line 122
    .line 123
    .line 124
    sput-object v6, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->RIGHT:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 125
    .line 126
    move-object v8, v7

    .line 127
    new-instance v7, Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 128
    .line 129
    new-instance v9, Lp2/e;

    .line 130
    .line 131
    const/4 v10, 0x0

    .line 132
    invoke-direct {v9, v8, v10}, Lp2/e;-><init>(Lcom/xuexiang/xui/widget/imageview/crop/Edge;I)V

    .line 133
    .line 134
    .line 135
    const-string v8, "BOTTOM"

    .line 136
    .line 137
    const/4 v10, 0x7

    .line 138
    invoke-direct {v7, v8, v10, v9}, Lcom/xuexiang/xui/widget/imageview/crop/Handle;-><init>(Ljava/lang/String;ILp2/c;)V

    .line 139
    .line 140
    .line 141
    sput-object v7, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->BOTTOM:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 142
    .line 143
    new-instance v8, Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 144
    .line 145
    new-instance v9, Lp2/a;

    .line 146
    .line 147
    const/4 v10, 0x0

    .line 148
    const/4 v11, 0x0

    .line 149
    invoke-direct {v9, v10, v10, v11}, Lp2/a;-><init>(Lcom/xuexiang/xui/widget/imageview/crop/Edge;Lcom/xuexiang/xui/widget/imageview/crop/Edge;I)V

    .line 150
    .line 151
    .line 152
    const-string v10, "CENTER"

    .line 153
    .line 154
    const/16 v11, 0x8

    .line 155
    .line 156
    invoke-direct {v8, v10, v11, v9}, Lcom/xuexiang/xui/widget/imageview/crop/Handle;-><init>(Ljava/lang/String;ILp2/c;)V

    .line 157
    .line 158
    .line 159
    sput-object v8, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->CENTER:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 160
    .line 161
    filled-new-array/range {v0 .. v8}, [Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    sput-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->a:[Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 166
    .line 167
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILp2/c;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->mHelper:Lp2/c;

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/xuexiang/xui/widget/imageview/crop/Handle;
    .locals 1

    .line 1
    const-class v0, Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/xuexiang/xui/widget/imageview/crop/Handle;
    .locals 1

    .line 1
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->a:[Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/xuexiang/xui/widget/imageview/crop/Handle;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public updateCropWindow(FFFLandroid/graphics/Rect;F)V
    .locals 6

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->mHelper:Lp2/c;

    move v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lp2/c;->a(FFFLandroid/graphics/Rect;F)V

    return-void
.end method

.method public updateCropWindow(FFLandroid/graphics/Rect;F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->mHelper:Lp2/c;

    invoke-virtual {v0, p1, p2, p3, p4}, Lp2/c;->b(FFLandroid/graphics/Rect;F)V

    return-void
.end method
