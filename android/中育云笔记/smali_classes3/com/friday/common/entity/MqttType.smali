.class public final enum Lcom/friday/common/entity/MqttType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/friday/common/entity/MqttType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lyc/a;

.field private static final synthetic $VALUES:[Lcom/friday/common/entity/MqttType;

.field public static final enum ARRANGE_HOMEWORK:Lcom/friday/common/entity/MqttType;

.field public static final enum END_CLASS:Lcom/friday/common/entity/MqttType;

.field public static final enum GET_TOPIC:Lcom/friday/common/entity/MqttType;

.field public static final enum IS_STUDENT_ONLINE:Lcom/friday/common/entity/MqttType;

.field public static final enum NONE:Lcom/friday/common/entity/MqttType;

.field public static final enum OFFLINE:Lcom/friday/common/entity/MqttType;

.field public static final enum REQUEST_HOMEWORK_STATUS:Lcom/friday/common/entity/MqttType;

.field public static final enum REQUEST_HOMEWORK_STATUS_REPLY:Lcom/friday/common/entity/MqttType;

.field public static final enum REQUEST_SCREEN_CAPTURE:Lcom/friday/common/entity/MqttType;

.field public static final enum REQUEST_SUBMIT_HOMEWORK:Lcom/friday/common/entity/MqttType;

.field public static final enum STOP_APPLICATION_BY_PC:Lcom/friday/common/entity/MqttType;

.field public static final enum STOP_SCREENCAST_BY_PC:Lcom/friday/common/entity/MqttType;

.field public static final enum STUDENT_ONLINE_NOW:Lcom/friday/common/entity/MqttType;

.field public static final enum STUDENT_SCREEN_OFF:Lcom/friday/common/entity/MqttType;

.field public static final enum SUBMIT_HOMEWORK_REPLY:Lcom/friday/common/entity/MqttType;

.field public static final enum TIME_UP:Lcom/friday/common/entity/MqttType;


# direct methods
.method private static final synthetic $values()[Lcom/friday/common/entity/MqttType;
    .locals 17

    sget-object v1, Lcom/friday/common/entity/MqttType;->IS_STUDENT_ONLINE:Lcom/friday/common/entity/MqttType;

    sget-object v2, Lcom/friday/common/entity/MqttType;->STUDENT_ONLINE_NOW:Lcom/friday/common/entity/MqttType;

    sget-object v3, Lcom/friday/common/entity/MqttType;->NONE:Lcom/friday/common/entity/MqttType;

    sget-object v4, Lcom/friday/common/entity/MqttType;->ARRANGE_HOMEWORK:Lcom/friday/common/entity/MqttType;

    sget-object v5, Lcom/friday/common/entity/MqttType;->REQUEST_SUBMIT_HOMEWORK:Lcom/friday/common/entity/MqttType;

    sget-object v6, Lcom/friday/common/entity/MqttType;->SUBMIT_HOMEWORK_REPLY:Lcom/friday/common/entity/MqttType;

    sget-object v7, Lcom/friday/common/entity/MqttType;->OFFLINE:Lcom/friday/common/entity/MqttType;

    sget-object v8, Lcom/friday/common/entity/MqttType;->TIME_UP:Lcom/friday/common/entity/MqttType;

    sget-object v9, Lcom/friday/common/entity/MqttType;->END_CLASS:Lcom/friday/common/entity/MqttType;

    sget-object v10, Lcom/friday/common/entity/MqttType;->REQUEST_HOMEWORK_STATUS:Lcom/friday/common/entity/MqttType;

    sget-object v11, Lcom/friday/common/entity/MqttType;->REQUEST_HOMEWORK_STATUS_REPLY:Lcom/friday/common/entity/MqttType;

    sget-object v12, Lcom/friday/common/entity/MqttType;->GET_TOPIC:Lcom/friday/common/entity/MqttType;

    sget-object v13, Lcom/friday/common/entity/MqttType;->STUDENT_SCREEN_OFF:Lcom/friday/common/entity/MqttType;

    sget-object v14, Lcom/friday/common/entity/MqttType;->STOP_SCREENCAST_BY_PC:Lcom/friday/common/entity/MqttType;

    sget-object v15, Lcom/friday/common/entity/MqttType;->STOP_APPLICATION_BY_PC:Lcom/friday/common/entity/MqttType;

    sget-object v16, Lcom/friday/common/entity/MqttType;->REQUEST_SCREEN_CAPTURE:Lcom/friday/common/entity/MqttType;

    filled-new-array/range {v1 .. v16}, [Lcom/friday/common/entity/MqttType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/friday/common/entity/MqttType;

    .line 2
    .line 3
    const-string v1, "IS_STUDENT_ONLINE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lcom/friday/common/entity/MqttType;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/friday/common/entity/MqttType;->IS_STUDENT_ONLINE:Lcom/friday/common/entity/MqttType;

    .line 10
    .line 11
    new-instance v0, Lcom/friday/common/entity/MqttType;

    .line 12
    .line 13
    const-string v1, "STUDENT_ONLINE_NOW"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lcom/friday/common/entity/MqttType;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/friday/common/entity/MqttType;->STUDENT_ONLINE_NOW:Lcom/friday/common/entity/MqttType;

    .line 20
    .line 21
    new-instance v0, Lcom/friday/common/entity/MqttType;

    .line 22
    .line 23
    const-string v1, "NONE"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Lcom/friday/common/entity/MqttType;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lcom/friday/common/entity/MqttType;->NONE:Lcom/friday/common/entity/MqttType;

    .line 30
    .line 31
    new-instance v0, Lcom/friday/common/entity/MqttType;

    .line 32
    .line 33
    const-string v1, "ARRANGE_HOMEWORK"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2}, Lcom/friday/common/entity/MqttType;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lcom/friday/common/entity/MqttType;->ARRANGE_HOMEWORK:Lcom/friday/common/entity/MqttType;

    .line 40
    .line 41
    new-instance v0, Lcom/friday/common/entity/MqttType;

    .line 42
    .line 43
    const-string v1, "REQUEST_SUBMIT_HOMEWORK"

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    invoke-direct {v0, v1, v2}, Lcom/friday/common/entity/MqttType;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lcom/friday/common/entity/MqttType;->REQUEST_SUBMIT_HOMEWORK:Lcom/friday/common/entity/MqttType;

    .line 50
    .line 51
    new-instance v0, Lcom/friday/common/entity/MqttType;

    .line 52
    .line 53
    const-string v1, "SUBMIT_HOMEWORK_REPLY"

    .line 54
    .line 55
    const/4 v2, 0x5

    .line 56
    invoke-direct {v0, v1, v2}, Lcom/friday/common/entity/MqttType;-><init>(Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lcom/friday/common/entity/MqttType;->SUBMIT_HOMEWORK_REPLY:Lcom/friday/common/entity/MqttType;

    .line 60
    .line 61
    new-instance v0, Lcom/friday/common/entity/MqttType;

    .line 62
    .line 63
    const-string v1, "OFFLINE"

    .line 64
    .line 65
    const/4 v2, 0x6

    .line 66
    invoke-direct {v0, v1, v2}, Lcom/friday/common/entity/MqttType;-><init>(Ljava/lang/String;I)V

    .line 67
    .line 68
    .line 69
    sput-object v0, Lcom/friday/common/entity/MqttType;->OFFLINE:Lcom/friday/common/entity/MqttType;

    .line 70
    .line 71
    new-instance v0, Lcom/friday/common/entity/MqttType;

    .line 72
    .line 73
    const-string v1, "TIME_UP"

    .line 74
    .line 75
    const/4 v2, 0x7

    .line 76
    invoke-direct {v0, v1, v2}, Lcom/friday/common/entity/MqttType;-><init>(Ljava/lang/String;I)V

    .line 77
    .line 78
    .line 79
    sput-object v0, Lcom/friday/common/entity/MqttType;->TIME_UP:Lcom/friday/common/entity/MqttType;

    .line 80
    .line 81
    new-instance v0, Lcom/friday/common/entity/MqttType;

    .line 82
    .line 83
    const-string v1, "END_CLASS"

    .line 84
    .line 85
    const/16 v2, 0x8

    .line 86
    .line 87
    invoke-direct {v0, v1, v2}, Lcom/friday/common/entity/MqttType;-><init>(Ljava/lang/String;I)V

    .line 88
    .line 89
    .line 90
    sput-object v0, Lcom/friday/common/entity/MqttType;->END_CLASS:Lcom/friday/common/entity/MqttType;

    .line 91
    .line 92
    new-instance v0, Lcom/friday/common/entity/MqttType;

    .line 93
    .line 94
    const-string v1, "REQUEST_HOMEWORK_STATUS"

    .line 95
    .line 96
    const/16 v2, 0x9

    .line 97
    .line 98
    invoke-direct {v0, v1, v2}, Lcom/friday/common/entity/MqttType;-><init>(Ljava/lang/String;I)V

    .line 99
    .line 100
    .line 101
    sput-object v0, Lcom/friday/common/entity/MqttType;->REQUEST_HOMEWORK_STATUS:Lcom/friday/common/entity/MqttType;

    .line 102
    .line 103
    new-instance v0, Lcom/friday/common/entity/MqttType;

    .line 104
    .line 105
    const-string v1, "REQUEST_HOMEWORK_STATUS_REPLY"

    .line 106
    .line 107
    const/16 v2, 0xa

    .line 108
    .line 109
    invoke-direct {v0, v1, v2}, Lcom/friday/common/entity/MqttType;-><init>(Ljava/lang/String;I)V

    .line 110
    .line 111
    .line 112
    sput-object v0, Lcom/friday/common/entity/MqttType;->REQUEST_HOMEWORK_STATUS_REPLY:Lcom/friday/common/entity/MqttType;

    .line 113
    .line 114
    new-instance v0, Lcom/friday/common/entity/MqttType;

    .line 115
    .line 116
    const-string v1, "GET_TOPIC"

    .line 117
    .line 118
    const/16 v2, 0xb

    .line 119
    .line 120
    invoke-direct {v0, v1, v2}, Lcom/friday/common/entity/MqttType;-><init>(Ljava/lang/String;I)V

    .line 121
    .line 122
    .line 123
    sput-object v0, Lcom/friday/common/entity/MqttType;->GET_TOPIC:Lcom/friday/common/entity/MqttType;

    .line 124
    .line 125
    new-instance v0, Lcom/friday/common/entity/MqttType;

    .line 126
    .line 127
    const-string v1, "STUDENT_SCREEN_OFF"

    .line 128
    .line 129
    const/16 v2, 0xc

    .line 130
    .line 131
    invoke-direct {v0, v1, v2}, Lcom/friday/common/entity/MqttType;-><init>(Ljava/lang/String;I)V

    .line 132
    .line 133
    .line 134
    sput-object v0, Lcom/friday/common/entity/MqttType;->STUDENT_SCREEN_OFF:Lcom/friday/common/entity/MqttType;

    .line 135
    .line 136
    new-instance v0, Lcom/friday/common/entity/MqttType;

    .line 137
    .line 138
    const-string v1, "STOP_SCREENCAST_BY_PC"

    .line 139
    .line 140
    const/16 v2, 0xd

    .line 141
    .line 142
    invoke-direct {v0, v1, v2}, Lcom/friday/common/entity/MqttType;-><init>(Ljava/lang/String;I)V

    .line 143
    .line 144
    .line 145
    sput-object v0, Lcom/friday/common/entity/MqttType;->STOP_SCREENCAST_BY_PC:Lcom/friday/common/entity/MqttType;

    .line 146
    .line 147
    new-instance v0, Lcom/friday/common/entity/MqttType;

    .line 148
    .line 149
    const-string v1, "STOP_APPLICATION_BY_PC"

    .line 150
    .line 151
    const/16 v2, 0xe

    .line 152
    .line 153
    invoke-direct {v0, v1, v2}, Lcom/friday/common/entity/MqttType;-><init>(Ljava/lang/String;I)V

    .line 154
    .line 155
    .line 156
    sput-object v0, Lcom/friday/common/entity/MqttType;->STOP_APPLICATION_BY_PC:Lcom/friday/common/entity/MqttType;

    .line 157
    .line 158
    new-instance v0, Lcom/friday/common/entity/MqttType;

    .line 159
    .line 160
    const-string v1, "REQUEST_SCREEN_CAPTURE"

    .line 161
    .line 162
    const/16 v2, 0xf

    .line 163
    .line 164
    invoke-direct {v0, v1, v2}, Lcom/friday/common/entity/MqttType;-><init>(Ljava/lang/String;I)V

    .line 165
    .line 166
    .line 167
    sput-object v0, Lcom/friday/common/entity/MqttType;->REQUEST_SCREEN_CAPTURE:Lcom/friday/common/entity/MqttType;

    .line 168
    .line 169
    invoke-static {}, Lcom/friday/common/entity/MqttType;->$values()[Lcom/friday/common/entity/MqttType;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    sput-object v0, Lcom/friday/common/entity/MqttType;->$VALUES:[Lcom/friday/common/entity/MqttType;

    .line 174
    .line 175
    invoke-static {v0}, Lkotlin/enums/a;->a([Ljava/lang/Enum;)Lyc/a;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    sput-object v0, Lcom/friday/common/entity/MqttType;->$ENTRIES:Lyc/a;

    .line 180
    .line 181
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static getEntries()Lyc/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lyc/a;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/friday/common/entity/MqttType;->$ENTRIES:Lyc/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/friday/common/entity/MqttType;
    .locals 1

    const-class v0, Lcom/friday/common/entity/MqttType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/friday/common/entity/MqttType;

    return-object p0
.end method

.method public static values()[Lcom/friday/common/entity/MqttType;
    .locals 1

    sget-object v0, Lcom/friday/common/entity/MqttType;->$VALUES:[Lcom/friday/common/entity/MqttType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/friday/common/entity/MqttType;

    return-object v0
.end method
