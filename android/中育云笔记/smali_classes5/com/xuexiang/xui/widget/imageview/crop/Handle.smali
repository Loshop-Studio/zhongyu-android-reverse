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
.field public static final enum d:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

.field public static final enum e:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

.field public static final enum f:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

.field public static final enum g:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

.field public static final enum h:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

.field public static final enum i:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

.field public static final enum j:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

.field public static final enum k:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

.field public static final enum l:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

.field public static final synthetic m:[Lcom/xuexiang/xui/widget/imageview/crop/Handle;


# instance fields
.field public c:Ln8/e;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 2
    .line 3
    new-instance v1, Ln8/c;

    .line 4
    .line 5
    sget-object v2, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->e:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 6
    .line 7
    sget-object v3, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->d:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 8
    .line 9
    invoke-direct {v1, v2, v3}, Ln8/c;-><init>(Lcom/xuexiang/xui/widget/imageview/crop/Edge;Lcom/xuexiang/xui/widget/imageview/crop/Edge;)V

    .line 10
    .line 11
    .line 12
    const-string v4, "TOP_LEFT"

    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    invoke-direct {v0, v4, v5, v1}, Lcom/xuexiang/xui/widget/imageview/crop/Handle;-><init>(Ljava/lang/String;ILn8/e;)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->d:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 19
    .line 20
    new-instance v1, Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 21
    .line 22
    new-instance v4, Ln8/c;

    .line 23
    .line 24
    sget-object v5, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->f:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 25
    .line 26
    invoke-direct {v4, v2, v5}, Ln8/c;-><init>(Lcom/xuexiang/xui/widget/imageview/crop/Edge;Lcom/xuexiang/xui/widget/imageview/crop/Edge;)V

    .line 27
    .line 28
    .line 29
    const-string v6, "TOP_RIGHT"

    .line 30
    .line 31
    const/4 v7, 0x1

    .line 32
    invoke-direct {v1, v6, v7, v4}, Lcom/xuexiang/xui/widget/imageview/crop/Handle;-><init>(Ljava/lang/String;ILn8/e;)V

    .line 33
    .line 34
    .line 35
    sput-object v1, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->e:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 36
    .line 37
    move-object v4, v2

    .line 38
    new-instance v2, Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 39
    .line 40
    new-instance v6, Ln8/c;

    .line 41
    .line 42
    sget-object v7, Lcom/xuexiang/xui/widget/imageview/crop/Edge;->g:Lcom/xuexiang/xui/widget/imageview/crop/Edge;

    .line 43
    .line 44
    invoke-direct {v6, v7, v3}, Ln8/c;-><init>(Lcom/xuexiang/xui/widget/imageview/crop/Edge;Lcom/xuexiang/xui/widget/imageview/crop/Edge;)V

    .line 45
    .line 46
    .line 47
    const-string v8, "BOTTOM_LEFT"

    .line 48
    .line 49
    const/4 v9, 0x2

    .line 50
    invoke-direct {v2, v8, v9, v6}, Lcom/xuexiang/xui/widget/imageview/crop/Handle;-><init>(Ljava/lang/String;ILn8/e;)V

    .line 51
    .line 52
    .line 53
    sput-object v2, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->f:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 54
    .line 55
    move-object v6, v3

    .line 56
    new-instance v3, Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 57
    .line 58
    new-instance v8, Ln8/c;

    .line 59
    .line 60
    invoke-direct {v8, v7, v5}, Ln8/c;-><init>(Lcom/xuexiang/xui/widget/imageview/crop/Edge;Lcom/xuexiang/xui/widget/imageview/crop/Edge;)V

    .line 61
    .line 62
    .line 63
    const-string v9, "BOTTOM_RIGHT"

    .line 64
    .line 65
    const/4 v10, 0x3

    .line 66
    invoke-direct {v3, v9, v10, v8}, Lcom/xuexiang/xui/widget/imageview/crop/Handle;-><init>(Ljava/lang/String;ILn8/e;)V

    .line 67
    .line 68
    .line 69
    sput-object v3, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->g:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 70
    .line 71
    move-object v8, v4

    .line 72
    new-instance v4, Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 73
    .line 74
    new-instance v9, Ln8/j;

    .line 75
    .line 76
    invoke-direct {v9, v6}, Ln8/j;-><init>(Lcom/xuexiang/xui/widget/imageview/crop/Edge;)V

    .line 77
    .line 78
    .line 79
    const-string v6, "LEFT"

    .line 80
    .line 81
    const/4 v10, 0x4

    .line 82
    invoke-direct {v4, v6, v10, v9}, Lcom/xuexiang/xui/widget/imageview/crop/Handle;-><init>(Ljava/lang/String;ILn8/e;)V

    .line 83
    .line 84
    .line 85
    sput-object v4, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->h:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 86
    .line 87
    move-object v6, v5

    .line 88
    new-instance v5, Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 89
    .line 90
    new-instance v9, Ln8/g;

    .line 91
    .line 92
    invoke-direct {v9, v8}, Ln8/g;-><init>(Lcom/xuexiang/xui/widget/imageview/crop/Edge;)V

    .line 93
    .line 94
    .line 95
    const-string v8, "TOP"

    .line 96
    .line 97
    const/4 v10, 0x5

    .line 98
    invoke-direct {v5, v8, v10, v9}, Lcom/xuexiang/xui/widget/imageview/crop/Handle;-><init>(Ljava/lang/String;ILn8/e;)V

    .line 99
    .line 100
    .line 101
    sput-object v5, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->i:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 102
    .line 103
    move-object v8, v6

    .line 104
    new-instance v6, Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 105
    .line 106
    new-instance v9, Ln8/j;

    .line 107
    .line 108
    invoke-direct {v9, v8}, Ln8/j;-><init>(Lcom/xuexiang/xui/widget/imageview/crop/Edge;)V

    .line 109
    .line 110
    .line 111
    const-string v8, "RIGHT"

    .line 112
    .line 113
    const/4 v10, 0x6

    .line 114
    invoke-direct {v6, v8, v10, v9}, Lcom/xuexiang/xui/widget/imageview/crop/Handle;-><init>(Ljava/lang/String;ILn8/e;)V

    .line 115
    .line 116
    .line 117
    sput-object v6, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->j:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 118
    .line 119
    move-object v8, v7

    .line 120
    new-instance v7, Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 121
    .line 122
    new-instance v9, Ln8/g;

    .line 123
    .line 124
    invoke-direct {v9, v8}, Ln8/g;-><init>(Lcom/xuexiang/xui/widget/imageview/crop/Edge;)V

    .line 125
    .line 126
    .line 127
    const-string v8, "BOTTOM"

    .line 128
    .line 129
    const/4 v10, 0x7

    .line 130
    invoke-direct {v7, v8, v10, v9}, Lcom/xuexiang/xui/widget/imageview/crop/Handle;-><init>(Ljava/lang/String;ILn8/e;)V

    .line 131
    .line 132
    .line 133
    sput-object v7, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->k:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 134
    .line 135
    new-instance v8, Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 136
    .line 137
    new-instance v9, Ln8/b;

    .line 138
    .line 139
    invoke-direct {v9}, Ln8/b;-><init>()V

    .line 140
    .line 141
    .line 142
    const-string v10, "CENTER"

    .line 143
    .line 144
    const/16 v11, 0x8

    .line 145
    .line 146
    invoke-direct {v8, v10, v11, v9}, Lcom/xuexiang/xui/widget/imageview/crop/Handle;-><init>(Ljava/lang/String;ILn8/e;)V

    .line 147
    .line 148
    .line 149
    sput-object v8, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->l:Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 150
    .line 151
    filled-new-array/range {v0 .. v8}, [Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    sput-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->m:[Lcom/xuexiang/xui/widget/imageview/crop/Handle;

    .line 156
    .line 157
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILn8/e;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->c:Ln8/e;

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
    sget-object v0, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->m:[Lcom/xuexiang/xui/widget/imageview/crop/Handle;

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
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->c:Ln8/e;

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
    invoke-virtual/range {v0 .. v5}, Ln8/e;->d(FFFLandroid/graphics/Rect;F)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public c(FFLandroid/graphics/Rect;F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/crop/Handle;->c:Ln8/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Ln8/e;->e(FFLandroid/graphics/Rect;F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
