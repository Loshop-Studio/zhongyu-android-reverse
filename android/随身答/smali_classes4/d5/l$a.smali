.class public abstract synthetic Ld5/l$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld5/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = "a"
.end annotation


# static fields
.field public static final synthetic a:[I

.field public static final synthetic b:[I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;->values()[Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v0, v0

    .line 6
    new-array v0, v0, [I

    .line 7
    .line 8
    sget-object v1, Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;->f:Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x1

    .line 15
    aput v2, v0, v1

    .line 16
    .line 17
    sget-object v1, Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;->g:Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/4 v3, 0x2

    .line 24
    aput v3, v0, v1

    .line 25
    .line 26
    sget-object v1, Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;->e:Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    const/4 v4, 0x3

    .line 33
    aput v4, v0, v1

    .line 34
    .line 35
    sget-object v1, Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;->d:Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    const/4 v5, 0x4

    .line 42
    aput v5, v0, v1

    .line 43
    .line 44
    sget-object v1, Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;->b:Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    const/4 v6, 0x5

    .line 51
    aput v6, v0, v1

    .line 52
    .line 53
    sget-object v1, Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;->c:Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;

    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    const/4 v7, 0x6

    .line 60
    aput v7, v0, v1

    .line 61
    .line 62
    sget-object v1, Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;->h:Lcom/zykj/board/EzyScaleTypeEnum$ScaleTypeEnum;

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    const/4 v8, 0x7

    .line 69
    aput v8, v0, v1

    .line 70
    .line 71
    sput-object v0, Ld5/l$a;->a:[I

    .line 72
    .line 73
    invoke-static {}, Lcom/zykj/board/EzyPositionEnum$PositionEnum;->values()[Lcom/zykj/board/EzyPositionEnum$PositionEnum;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    array-length v0, v0

    .line 78
    new-array v0, v0, [I

    .line 79
    .line 80
    sget-object v1, Lcom/zykj/board/EzyPositionEnum$PositionEnum;->b:Lcom/zykj/board/EzyPositionEnum$PositionEnum;

    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    aput v2, v0, v1

    .line 87
    .line 88
    sget-object v1, Lcom/zykj/board/EzyPositionEnum$PositionEnum;->c:Lcom/zykj/board/EzyPositionEnum$PositionEnum;

    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    aput v3, v0, v1

    .line 95
    .line 96
    sget-object v1, Lcom/zykj/board/EzyPositionEnum$PositionEnum;->d:Lcom/zykj/board/EzyPositionEnum$PositionEnum;

    .line 97
    .line 98
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    aput v4, v0, v1

    .line 103
    .line 104
    sget-object v1, Lcom/zykj/board/EzyPositionEnum$PositionEnum;->e:Lcom/zykj/board/EzyPositionEnum$PositionEnum;

    .line 105
    .line 106
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    aput v5, v0, v1

    .line 111
    .line 112
    sget-object v1, Lcom/zykj/board/EzyPositionEnum$PositionEnum;->g:Lcom/zykj/board/EzyPositionEnum$PositionEnum;

    .line 113
    .line 114
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    aput v6, v0, v1

    .line 119
    .line 120
    sget-object v1, Lcom/zykj/board/EzyPositionEnum$PositionEnum;->h:Lcom/zykj/board/EzyPositionEnum$PositionEnum;

    .line 121
    .line 122
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    aput v7, v0, v1

    .line 127
    .line 128
    sget-object v1, Lcom/zykj/board/EzyPositionEnum$PositionEnum;->i:Lcom/zykj/board/EzyPositionEnum$PositionEnum;

    .line 129
    .line 130
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    aput v8, v0, v1

    .line 135
    .line 136
    sget-object v1, Lcom/zykj/board/EzyPositionEnum$PositionEnum;->j:Lcom/zykj/board/EzyPositionEnum$PositionEnum;

    .line 137
    .line 138
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    const/16 v2, 0x8

    .line 143
    .line 144
    aput v2, v0, v1

    .line 145
    .line 146
    sput-object v0, Ld5/l$a;->b:[I

    .line 147
    .line 148
    return-void
.end method
