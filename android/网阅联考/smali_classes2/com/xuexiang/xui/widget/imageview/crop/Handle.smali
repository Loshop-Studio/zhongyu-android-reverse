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
.field public static final enum b:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

.field public static final enum c:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

.field public static final enum d:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

.field public static final enum e:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

.field public static final enum f:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

.field public static final enum g:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

.field public static final enum h:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

.field public static final enum i:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

.field public static final enum j:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

.field public static final synthetic k:[Lcom/xuexiang/xui/widget/imageview/crop/Handle;


# instance fields
.field public a:Lv0/e;


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 2
    .line 3
    new-instance v1, Lv0/c;

    .line 4
    .line 5
    sget-object v2, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->c:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 6
    .line 7
    sget-object v3, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->b:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 8
    .line 9
    invoke-direct {v1, v2, v3}, Lv0/c;-><init>(Lcom/xuexiang/xui/widget/imageview/crop/Edge;Lcom/xuexiang/xui/widget/imageview/crop/Edge;)V

    .line 10
    .line 11
    .line 12
    const-string v4, "TOP_LEFT"

    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    invoke-direct {v0, v4, v5, v1}, Lcom/xuexiang/xui/widget/imageview/crop/Handle;-><init>(Ljava/lang/String;ILv0/e;)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->b:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 19
    .line 20
    new-instance v1, Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 21
    .line 22
    new-instance v4, Lv0/c;

    .line 23
    .line 24
    sget-object v6, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->d:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 25
    .line 26
    invoke-direct {v4, v2, v6}, Lv0/c;-><init>(Lcom/xuexiang/xui/widget/imageview/crop/Edge;Lcom/xuexiang/xui/widget/imageview/crop/Edge;)V

    .line 27
    .line 28
    .line 29
    const-string v7, "TOP_RIGHT"

    .line 30
    .line 31
    const/4 v8, 0x1

    .line 32
    invoke-direct {v1, v7, v8, v4}, Lcom/xuexiang/xui/widget/imageview/crop/Handle;-><init>(Ljava/lang/String;ILv0/e;)V

    .line 33
    .line 34
    .line 35
    sput-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->c:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 36
    .line 37
    new-instance v4, Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 38
    .line 39
    new-instance v7, Lv0/c;

    .line 40
    .line 41
    sget-object v9, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->e:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 42
    .line 43
    invoke-direct {v7, v9, v3}, Lv0/c;-><init>(Lcom/xuexiang/xui/widget/imageview/crop/Edge;Lcom/xuexiang/xui/widget/imageview/crop/Edge;)V

    .line 44
    .line 45
    .line 46
    const-string v10, "BOTTOM_LEFT"

    .line 47
    .line 48
    const/4 v11, 0x2

    .line 49
    invoke-direct {v4, v10, v11, v7}, Lcom/xuexiang/xui/widget/imageview/crop/Handle;-><init>(Ljava/lang/String;ILv0/e;)V

    .line 50
    .line 51
    .line 52
    sput-object v4, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->d:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 53
    .line 54
    new-instance v7, Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 55
    .line 56
    new-instance v10, Lv0/c;

    .line 57
    .line 58
    invoke-direct {v10, v9, v6}, Lv0/c;-><init>(Lcom/xuexiang/xui/widget/imageview/crop/Edge;Lcom/xuexiang/xui/widget/imageview/crop/Edge;)V

    .line 59
    .line 60
    .line 61
    const-string v12, "BOTTOM_RIGHT"

    .line 62
    .line 63
    const/4 v13, 0x3

    .line 64
    invoke-direct {v7, v12, v13, v10}, Lcom/xuexiang/xui/widget/imageview/crop/Handle;-><init>(Ljava/lang/String;ILv0/e;)V

    .line 65
    .line 66
    .line 67
    sput-object v7, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->e:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 68
    .line 69
    new-instance v10, Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 70
    .line 71
    new-instance v12, Lv0/i;

    .line 72
    .line 73
    invoke-direct {v12, v3}, Lv0/i;-><init>(Lcom/xuexiang/xui/widget/imageview/crop/Edge;)V

    .line 74
    .line 75
    .line 76
    const-string v3, "LEFT"

    .line 77
    .line 78
    const/4 v14, 0x4

    .line 79
    invoke-direct {v10, v3, v14, v12}, Lcom/xuexiang/xui/widget/imageview/crop/Handle;-><init>(Ljava/lang/String;ILv0/e;)V

    .line 80
    .line 81
    .line 82
    sput-object v10, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->f:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 83
    .line 84
    new-instance v3, Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 85
    .line 86
    new-instance v12, Lv0/g;

    .line 87
    .line 88
    invoke-direct {v12, v2}, Lv0/g;-><init>(Lcom/xuexiang/xui/widget/imageview/crop/Edge;)V

    .line 89
    .line 90
    .line 91
    const-string v2, "TOP"

    .line 92
    .line 93
    const/4 v15, 0x5

    .line 94
    invoke-direct {v3, v2, v15, v12}, Lcom/xuexiang/xui/widget/imageview/crop/Handle;-><init>(Ljava/lang/String;ILv0/e;)V

    .line 95
    .line 96
    .line 97
    sput-object v3, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->g:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 98
    .line 99
    new-instance v2, Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 100
    .line 101
    new-instance v12, Lv0/i;

    .line 102
    .line 103
    invoke-direct {v12, v6}, Lv0/i;-><init>(Lcom/xuexiang/xui/widget/imageview/crop/Edge;)V

    .line 104
    .line 105
    .line 106
    const-string v6, "RIGHT"

    .line 107
    .line 108
    const/4 v15, 0x6

    .line 109
    invoke-direct {v2, v6, v15, v12}, Lcom/xuexiang/xui/widget/imageview/crop/Handle;-><init>(Ljava/lang/String;ILv0/e;)V

    .line 110
    .line 111
    .line 112
    sput-object v2, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->h:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 113
    .line 114
    new-instance v6, Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 115
    .line 116
    new-instance v12, Lv0/g;

    .line 117
    .line 118
    invoke-direct {v12, v9}, Lv0/g;-><init>(Lcom/xuexiang/xui/widget/imageview/crop/Edge;)V

    .line 119
    .line 120
    .line 121
    const-string v9, "BOTTOM"

    .line 122
    .line 123
    const/4 v15, 0x7

    .line 124
    invoke-direct {v6, v9, v15, v12}, Lcom/xuexiang/xui/widget/imageview/crop/Handle;-><init>(Ljava/lang/String;ILv0/e;)V

    .line 125
    .line 126
    .line 127
    sput-object v6, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->i:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 128
    .line 129
    new-instance v9, Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 130
    .line 131
    new-instance v12, Lv0/b;

    .line 132
    .line 133
    invoke-direct {v12}, Lv0/b;-><init>()V

    .line 134
    .line 135
    .line 136
    const-string v15, "CENTER"

    .line 137
    .line 138
    const/16 v14, 0x8

    .line 139
    .line 140
    invoke-direct {v9, v15, v14, v12}, Lcom/xuexiang/xui/widget/imageview/crop/Handle;-><init>(Ljava/lang/String;ILv0/e;)V

    .line 141
    .line 142
    .line 143
    sput-object v9, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->j:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 144
    .line 145
    const/16 v12, 0x9

    .line 146
    .line 147
    new-array v12, v12, [Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 148
    .line 149
    aput-object v0, v12, v5

    .line 150
    .line 151
    aput-object v1, v12, v8

    .line 152
    .line 153
    aput-object v4, v12, v11

    .line 154
    .line 155
    aput-object v7, v12, v13

    .line 156
    .line 157
    const/4 v0, 0x4

    .line 158
    aput-object v10, v12, v0

    .line 159
    .line 160
    const/4 v0, 0x5

    .line 161
    aput-object v3, v12, v0

    .line 162
    .line 163
    const/4 v0, 0x6

    .line 164
    aput-object v2, v12, v0

    .line 165
    .line 166
    const/4 v0, 0x7

    .line 167
    aput-object v6, v12, v0

    .line 168
    .line 169
    aput-object v9, v12, v14

    .line 170
    .line 171
    sput-object v12, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->k:[Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 172
    .line 173
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILv0/e;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->a:Lv0/e;

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
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->k:[Lcom/xuexiang/xui/widget/imageview/crop/Handle;

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
.method public a(FFFLandroid/graphics/Rect;F)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->a:Lv0/e;

    .line 2
    .line 3
    move v1, p1

    .line 4
    move v2, p2

    .line 5
    move v3, p3

    .line 6
    move-object v4, p4

    .line 7
    move v5, p5

    .line 8
    invoke-virtual/range {v0 .. v5}, Lv0/e;->d(FFFLandroid/graphics/Rect;F)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public b(FFLandroid/graphics/Rect;F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->a:Lv0/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Lv0/e;->e(FFLandroid/graphics/Rect;F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
