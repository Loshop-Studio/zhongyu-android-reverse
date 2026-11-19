.class public final enum Lokhttp3/internal/http2/ErrorCode;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/internal/http2/ErrorCode$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lokhttp3/internal/http2/ErrorCode;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u0016\u0008\u0086\u0001\u0018\u0000 \t2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003B\u0011\u0008\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0003\u0010\u0005j\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lokhttp3/internal/http2/ErrorCode;",
        "",
        "",
        "a",
        "I",
        "()I",
        "httpCode",
        "<init>",
        "(Ljava/lang/String;II)V",
        "q",
        "b",
        "c",
        "d",
        "e",
        "f",
        "g",
        "h",
        "i",
        "j",
        "k",
        "l",
        "m",
        "n",
        "o",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# static fields
.field public static final enum b:Lokhttp3/internal/http2/ErrorCode;

.field public static final enum c:Lokhttp3/internal/http2/ErrorCode;

.field public static final enum d:Lokhttp3/internal/http2/ErrorCode;

.field public static final enum e:Lokhttp3/internal/http2/ErrorCode;

.field public static final enum f:Lokhttp3/internal/http2/ErrorCode;

.field public static final enum g:Lokhttp3/internal/http2/ErrorCode;

.field public static final enum h:Lokhttp3/internal/http2/ErrorCode;

.field public static final enum i:Lokhttp3/internal/http2/ErrorCode;

.field public static final enum j:Lokhttp3/internal/http2/ErrorCode;

.field public static final enum k:Lokhttp3/internal/http2/ErrorCode;

.field public static final enum l:Lokhttp3/internal/http2/ErrorCode;

.field public static final enum m:Lokhttp3/internal/http2/ErrorCode;

.field public static final enum n:Lokhttp3/internal/http2/ErrorCode;

.field public static final enum o:Lokhttp3/internal/http2/ErrorCode;

.field public static final synthetic p:[Lokhttp3/internal/http2/ErrorCode;

.field public static final q:Lokhttp3/internal/http2/ErrorCode$a;


# instance fields
.field public final a:I


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 1
    const/16 v0, 0xe

    .line 2
    .line 3
    new-array v0, v0, [Lokhttp3/internal/http2/ErrorCode;

    .line 4
    .line 5
    new-instance v1, Lokhttp3/internal/http2/ErrorCode;

    .line 6
    .line 7
    const-string v2, "NO_ERROR"

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v1, v2, v3, v3}, Lokhttp3/internal/http2/ErrorCode;-><init>(Ljava/lang/String;II)V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lokhttp3/internal/http2/ErrorCode;->b:Lokhttp3/internal/http2/ErrorCode;

    .line 14
    .line 15
    aput-object v1, v0, v3

    .line 16
    .line 17
    new-instance v1, Lokhttp3/internal/http2/ErrorCode;

    .line 18
    .line 19
    const-string v2, "PROTOCOL_ERROR"

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    invoke-direct {v1, v2, v3, v3}, Lokhttp3/internal/http2/ErrorCode;-><init>(Ljava/lang/String;II)V

    .line 23
    .line 24
    .line 25
    sput-object v1, Lokhttp3/internal/http2/ErrorCode;->c:Lokhttp3/internal/http2/ErrorCode;

    .line 26
    .line 27
    aput-object v1, v0, v3

    .line 28
    .line 29
    new-instance v1, Lokhttp3/internal/http2/ErrorCode;

    .line 30
    .line 31
    const-string v2, "INTERNAL_ERROR"

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    invoke-direct {v1, v2, v3, v3}, Lokhttp3/internal/http2/ErrorCode;-><init>(Ljava/lang/String;II)V

    .line 35
    .line 36
    .line 37
    sput-object v1, Lokhttp3/internal/http2/ErrorCode;->d:Lokhttp3/internal/http2/ErrorCode;

    .line 38
    .line 39
    aput-object v1, v0, v3

    .line 40
    .line 41
    new-instance v1, Lokhttp3/internal/http2/ErrorCode;

    .line 42
    .line 43
    const-string v2, "FLOW_CONTROL_ERROR"

    .line 44
    .line 45
    const/4 v3, 0x3

    .line 46
    invoke-direct {v1, v2, v3, v3}, Lokhttp3/internal/http2/ErrorCode;-><init>(Ljava/lang/String;II)V

    .line 47
    .line 48
    .line 49
    sput-object v1, Lokhttp3/internal/http2/ErrorCode;->e:Lokhttp3/internal/http2/ErrorCode;

    .line 50
    .line 51
    aput-object v1, v0, v3

    .line 52
    .line 53
    new-instance v1, Lokhttp3/internal/http2/ErrorCode;

    .line 54
    .line 55
    const-string v2, "SETTINGS_TIMEOUT"

    .line 56
    .line 57
    const/4 v3, 0x4

    .line 58
    invoke-direct {v1, v2, v3, v3}, Lokhttp3/internal/http2/ErrorCode;-><init>(Ljava/lang/String;II)V

    .line 59
    .line 60
    .line 61
    sput-object v1, Lokhttp3/internal/http2/ErrorCode;->f:Lokhttp3/internal/http2/ErrorCode;

    .line 62
    .line 63
    aput-object v1, v0, v3

    .line 64
    .line 65
    new-instance v1, Lokhttp3/internal/http2/ErrorCode;

    .line 66
    .line 67
    const-string v2, "STREAM_CLOSED"

    .line 68
    .line 69
    const/4 v3, 0x5

    .line 70
    invoke-direct {v1, v2, v3, v3}, Lokhttp3/internal/http2/ErrorCode;-><init>(Ljava/lang/String;II)V

    .line 71
    .line 72
    .line 73
    sput-object v1, Lokhttp3/internal/http2/ErrorCode;->g:Lokhttp3/internal/http2/ErrorCode;

    .line 74
    .line 75
    aput-object v1, v0, v3

    .line 76
    .line 77
    new-instance v1, Lokhttp3/internal/http2/ErrorCode;

    .line 78
    .line 79
    const-string v2, "FRAME_SIZE_ERROR"

    .line 80
    .line 81
    const/4 v3, 0x6

    .line 82
    invoke-direct {v1, v2, v3, v3}, Lokhttp3/internal/http2/ErrorCode;-><init>(Ljava/lang/String;II)V

    .line 83
    .line 84
    .line 85
    sput-object v1, Lokhttp3/internal/http2/ErrorCode;->h:Lokhttp3/internal/http2/ErrorCode;

    .line 86
    .line 87
    aput-object v1, v0, v3

    .line 88
    .line 89
    new-instance v1, Lokhttp3/internal/http2/ErrorCode;

    .line 90
    .line 91
    const-string v2, "REFUSED_STREAM"

    .line 92
    .line 93
    const/4 v3, 0x7

    .line 94
    invoke-direct {v1, v2, v3, v3}, Lokhttp3/internal/http2/ErrorCode;-><init>(Ljava/lang/String;II)V

    .line 95
    .line 96
    .line 97
    sput-object v1, Lokhttp3/internal/http2/ErrorCode;->i:Lokhttp3/internal/http2/ErrorCode;

    .line 98
    .line 99
    aput-object v1, v0, v3

    .line 100
    .line 101
    new-instance v1, Lokhttp3/internal/http2/ErrorCode;

    .line 102
    .line 103
    const-string v2, "CANCEL"

    .line 104
    .line 105
    const/16 v3, 0x8

    .line 106
    .line 107
    invoke-direct {v1, v2, v3, v3}, Lokhttp3/internal/http2/ErrorCode;-><init>(Ljava/lang/String;II)V

    .line 108
    .line 109
    .line 110
    sput-object v1, Lokhttp3/internal/http2/ErrorCode;->j:Lokhttp3/internal/http2/ErrorCode;

    .line 111
    .line 112
    aput-object v1, v0, v3

    .line 113
    .line 114
    new-instance v1, Lokhttp3/internal/http2/ErrorCode;

    .line 115
    .line 116
    const-string v2, "COMPRESSION_ERROR"

    .line 117
    .line 118
    const/16 v3, 0x9

    .line 119
    .line 120
    invoke-direct {v1, v2, v3, v3}, Lokhttp3/internal/http2/ErrorCode;-><init>(Ljava/lang/String;II)V

    .line 121
    .line 122
    .line 123
    sput-object v1, Lokhttp3/internal/http2/ErrorCode;->k:Lokhttp3/internal/http2/ErrorCode;

    .line 124
    .line 125
    aput-object v1, v0, v3

    .line 126
    .line 127
    new-instance v1, Lokhttp3/internal/http2/ErrorCode;

    .line 128
    .line 129
    const-string v2, "CONNECT_ERROR"

    .line 130
    .line 131
    const/16 v3, 0xa

    .line 132
    .line 133
    invoke-direct {v1, v2, v3, v3}, Lokhttp3/internal/http2/ErrorCode;-><init>(Ljava/lang/String;II)V

    .line 134
    .line 135
    .line 136
    sput-object v1, Lokhttp3/internal/http2/ErrorCode;->l:Lokhttp3/internal/http2/ErrorCode;

    .line 137
    .line 138
    aput-object v1, v0, v3

    .line 139
    .line 140
    new-instance v1, Lokhttp3/internal/http2/ErrorCode;

    .line 141
    .line 142
    const-string v2, "ENHANCE_YOUR_CALM"

    .line 143
    .line 144
    const/16 v3, 0xb

    .line 145
    .line 146
    invoke-direct {v1, v2, v3, v3}, Lokhttp3/internal/http2/ErrorCode;-><init>(Ljava/lang/String;II)V

    .line 147
    .line 148
    .line 149
    sput-object v1, Lokhttp3/internal/http2/ErrorCode;->m:Lokhttp3/internal/http2/ErrorCode;

    .line 150
    .line 151
    aput-object v1, v0, v3

    .line 152
    .line 153
    new-instance v1, Lokhttp3/internal/http2/ErrorCode;

    .line 154
    .line 155
    const-string v2, "INADEQUATE_SECURITY"

    .line 156
    .line 157
    const/16 v3, 0xc

    .line 158
    .line 159
    invoke-direct {v1, v2, v3, v3}, Lokhttp3/internal/http2/ErrorCode;-><init>(Ljava/lang/String;II)V

    .line 160
    .line 161
    .line 162
    sput-object v1, Lokhttp3/internal/http2/ErrorCode;->n:Lokhttp3/internal/http2/ErrorCode;

    .line 163
    .line 164
    aput-object v1, v0, v3

    .line 165
    .line 166
    new-instance v1, Lokhttp3/internal/http2/ErrorCode;

    .line 167
    .line 168
    const-string v2, "HTTP_1_1_REQUIRED"

    .line 169
    .line 170
    const/16 v3, 0xd

    .line 171
    .line 172
    invoke-direct {v1, v2, v3, v3}, Lokhttp3/internal/http2/ErrorCode;-><init>(Ljava/lang/String;II)V

    .line 173
    .line 174
    .line 175
    sput-object v1, Lokhttp3/internal/http2/ErrorCode;->o:Lokhttp3/internal/http2/ErrorCode;

    .line 176
    .line 177
    aput-object v1, v0, v3

    .line 178
    .line 179
    sput-object v0, Lokhttp3/internal/http2/ErrorCode;->p:[Lokhttp3/internal/http2/ErrorCode;

    .line 180
    .line 181
    new-instance v0, Lokhttp3/internal/http2/ErrorCode$a;

    .line 182
    .line 183
    const/4 v1, 0x0

    .line 184
    invoke-direct {v0, v1}, Lokhttp3/internal/http2/ErrorCode$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 185
    .line 186
    .line 187
    sput-object v0, Lokhttp3/internal/http2/ErrorCode;->q:Lokhttp3/internal/http2/ErrorCode$a;

    .line 188
    .line 189
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lokhttp3/internal/http2/ErrorCode;->a:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lokhttp3/internal/http2/ErrorCode;
    .locals 1

    const-class v0, Lokhttp3/internal/http2/ErrorCode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lokhttp3/internal/http2/ErrorCode;

    return-object p0
.end method

.method public static values()[Lokhttp3/internal/http2/ErrorCode;
    .locals 1

    sget-object v0, Lokhttp3/internal/http2/ErrorCode;->p:[Lokhttp3/internal/http2/ErrorCode;

    invoke-virtual {v0}, [Lokhttp3/internal/http2/ErrorCode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lokhttp3/internal/http2/ErrorCode;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Lokhttp3/internal/http2/ErrorCode;->a:I

    .line 2
    .line 3
    return v0
.end method
