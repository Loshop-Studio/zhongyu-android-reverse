.class public final enum Lcom/zykj/mistake/utils/QuestionType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/zykj/mistake/utils/QuestionType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0014\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010\u0004\u001a\u0004\u0008\u0005\u0010\u0006\"\u0004\u0008\u0007\u0010\u0008R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019j\u0002\u0008\u001aj\u0002\u0008\u001bj\u0002\u0008\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/zykj/mistake/utils/QuestionType;",
        "",
        "",
        "type",
        "I",
        "getType",
        "()I",
        "setType",
        "(I)V",
        "",
        "typeName",
        "Ljava/lang/String;",
        "getTypeName",
        "()Ljava/lang/String;",
        "setTypeName",
        "(Ljava/lang/String;)V",
        "TYPE_UNKNOW",
        "TYPE_SINGLE",
        "TYPE_MULTIPLE",
        "TYPE_JUDGE",
        "TYPE_BLANK",
        "TYPE_SUMMARY",
        "TYPE_CLOZE",
        "TYPE_MIX",
        "TYPE_LISTEN",
        "TYPE_COMPREHENSION",
        "TYPE_SEVEN_CHOICES_FIVE",
        "TYPE_COMPOSITION",
        "TYPE_CORRECTION",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final enum TYPE_BLANK:Lcom/zykj/mistake/utils/QuestionType;

.field public static final enum TYPE_CLOZE:Lcom/zykj/mistake/utils/QuestionType;

.field public static final enum TYPE_COMPOSITION:Lcom/zykj/mistake/utils/QuestionType;

.field public static final enum TYPE_COMPREHENSION:Lcom/zykj/mistake/utils/QuestionType;

.field public static final enum TYPE_CORRECTION:Lcom/zykj/mistake/utils/QuestionType;

.field public static final enum TYPE_JUDGE:Lcom/zykj/mistake/utils/QuestionType;

.field public static final enum TYPE_LISTEN:Lcom/zykj/mistake/utils/QuestionType;

.field public static final enum TYPE_MIX:Lcom/zykj/mistake/utils/QuestionType;

.field public static final enum TYPE_MULTIPLE:Lcom/zykj/mistake/utils/QuestionType;

.field public static final enum TYPE_SEVEN_CHOICES_FIVE:Lcom/zykj/mistake/utils/QuestionType;

.field public static final enum TYPE_SINGLE:Lcom/zykj/mistake/utils/QuestionType;

.field public static final enum TYPE_SUMMARY:Lcom/zykj/mistake/utils/QuestionType;

.field public static final enum TYPE_UNKNOW:Lcom/zykj/mistake/utils/QuestionType;

.field public static final synthetic a:[Lcom/zykj/mistake/utils/QuestionType;

.field public static final synthetic b:Lj6/a;


# instance fields
.field private type:I

.field private typeName:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    new-instance v0, Lcom/zykj/mistake/utils/QuestionType;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "\u672a\u8d4b\u503c"

    .line 5
    .line 6
    const-string v3, "TYPE_UNKNOW"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v1, v2}, Lcom/zykj/mistake/utils/QuestionType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lcom/zykj/mistake/utils/QuestionType;->TYPE_UNKNOW:Lcom/zykj/mistake/utils/QuestionType;

    .line 12
    .line 13
    new-instance v1, Lcom/zykj/mistake/utils/QuestionType;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    const-string v3, "\u5355\u9009\u9898"

    .line 17
    .line 18
    const-string v4, "TYPE_SINGLE"

    .line 19
    .line 20
    invoke-direct {v1, v4, v2, v2, v3}, Lcom/zykj/mistake/utils/QuestionType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lcom/zykj/mistake/utils/QuestionType;->TYPE_SINGLE:Lcom/zykj/mistake/utils/QuestionType;

    .line 24
    .line 25
    new-instance v2, Lcom/zykj/mistake/utils/QuestionType;

    .line 26
    .line 27
    const/4 v3, 0x2

    .line 28
    const-string v4, "\u591a\u9009\u9898"

    .line 29
    .line 30
    const-string v5, "TYPE_MULTIPLE"

    .line 31
    .line 32
    invoke-direct {v2, v5, v3, v3, v4}, Lcom/zykj/mistake/utils/QuestionType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v2, Lcom/zykj/mistake/utils/QuestionType;->TYPE_MULTIPLE:Lcom/zykj/mistake/utils/QuestionType;

    .line 36
    .line 37
    new-instance v3, Lcom/zykj/mistake/utils/QuestionType;

    .line 38
    .line 39
    const/4 v4, 0x3

    .line 40
    const-string v5, "\u5224\u65ad\u9898"

    .line 41
    .line 42
    const-string v6, "TYPE_JUDGE"

    .line 43
    .line 44
    invoke-direct {v3, v6, v4, v4, v5}, Lcom/zykj/mistake/utils/QuestionType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v3, Lcom/zykj/mistake/utils/QuestionType;->TYPE_JUDGE:Lcom/zykj/mistake/utils/QuestionType;

    .line 48
    .line 49
    new-instance v4, Lcom/zykj/mistake/utils/QuestionType;

    .line 50
    .line 51
    const/4 v5, 0x4

    .line 52
    const-string v6, "\u586b\u7a7a\u9898"

    .line 53
    .line 54
    const-string v7, "TYPE_BLANK"

    .line 55
    .line 56
    invoke-direct {v4, v7, v5, v5, v6}, Lcom/zykj/mistake/utils/QuestionType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sput-object v4, Lcom/zykj/mistake/utils/QuestionType;->TYPE_BLANK:Lcom/zykj/mistake/utils/QuestionType;

    .line 60
    .line 61
    new-instance v5, Lcom/zykj/mistake/utils/QuestionType;

    .line 62
    .line 63
    const/4 v6, 0x5

    .line 64
    const-string v7, "\u95ee\u7b54\u9898"

    .line 65
    .line 66
    const-string v8, "TYPE_SUMMARY"

    .line 67
    .line 68
    invoke-direct {v5, v8, v6, v6, v7}, Lcom/zykj/mistake/utils/QuestionType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    sput-object v5, Lcom/zykj/mistake/utils/QuestionType;->TYPE_SUMMARY:Lcom/zykj/mistake/utils/QuestionType;

    .line 72
    .line 73
    new-instance v6, Lcom/zykj/mistake/utils/QuestionType;

    .line 74
    .line 75
    const/4 v7, 0x6

    .line 76
    const-string v8, "\u5b8c\u578b\u586b\u7a7a"

    .line 77
    .line 78
    const-string v9, "TYPE_CLOZE"

    .line 79
    .line 80
    invoke-direct {v6, v9, v7, v7, v8}, Lcom/zykj/mistake/utils/QuestionType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 81
    .line 82
    .line 83
    sput-object v6, Lcom/zykj/mistake/utils/QuestionType;->TYPE_CLOZE:Lcom/zykj/mistake/utils/QuestionType;

    .line 84
    .line 85
    new-instance v7, Lcom/zykj/mistake/utils/QuestionType;

    .line 86
    .line 87
    const/4 v8, 0x7

    .line 88
    const-string v9, "\u6df7\u5408\u9898"

    .line 89
    .line 90
    const-string v10, "TYPE_MIX"

    .line 91
    .line 92
    invoke-direct {v7, v10, v8, v8, v9}, Lcom/zykj/mistake/utils/QuestionType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 93
    .line 94
    .line 95
    sput-object v7, Lcom/zykj/mistake/utils/QuestionType;->TYPE_MIX:Lcom/zykj/mistake/utils/QuestionType;

    .line 96
    .line 97
    new-instance v8, Lcom/zykj/mistake/utils/QuestionType;

    .line 98
    .line 99
    const/16 v9, 0x8

    .line 100
    .line 101
    const-string v10, "\u542c\u529b\u9898"

    .line 102
    .line 103
    const-string v11, "TYPE_LISTEN"

    .line 104
    .line 105
    invoke-direct {v8, v11, v9, v9, v10}, Lcom/zykj/mistake/utils/QuestionType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 106
    .line 107
    .line 108
    sput-object v8, Lcom/zykj/mistake/utils/QuestionType;->TYPE_LISTEN:Lcom/zykj/mistake/utils/QuestionType;

    .line 109
    .line 110
    new-instance v9, Lcom/zykj/mistake/utils/QuestionType;

    .line 111
    .line 112
    const/16 v10, 0x9

    .line 113
    .line 114
    const-string v11, "\u9605\u8bfb\u7406\u89e3"

    .line 115
    .line 116
    const-string v12, "TYPE_COMPREHENSION"

    .line 117
    .line 118
    invoke-direct {v9, v12, v10, v10, v11}, Lcom/zykj/mistake/utils/QuestionType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 119
    .line 120
    .line 121
    sput-object v9, Lcom/zykj/mistake/utils/QuestionType;->TYPE_COMPREHENSION:Lcom/zykj/mistake/utils/QuestionType;

    .line 122
    .line 123
    new-instance v10, Lcom/zykj/mistake/utils/QuestionType;

    .line 124
    .line 125
    const/16 v11, 0xa

    .line 126
    .line 127
    const-string v12, "\u4e03\u9009\u4e94"

    .line 128
    .line 129
    const-string v13, "TYPE_SEVEN_CHOICES_FIVE"

    .line 130
    .line 131
    invoke-direct {v10, v13, v11, v11, v12}, Lcom/zykj/mistake/utils/QuestionType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 132
    .line 133
    .line 134
    sput-object v10, Lcom/zykj/mistake/utils/QuestionType;->TYPE_SEVEN_CHOICES_FIVE:Lcom/zykj/mistake/utils/QuestionType;

    .line 135
    .line 136
    new-instance v11, Lcom/zykj/mistake/utils/QuestionType;

    .line 137
    .line 138
    const/16 v12, 0xb

    .line 139
    .line 140
    const-string v13, "\u4f5c\u6587"

    .line 141
    .line 142
    const-string v14, "TYPE_COMPOSITION"

    .line 143
    .line 144
    invoke-direct {v11, v14, v12, v12, v13}, Lcom/zykj/mistake/utils/QuestionType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 145
    .line 146
    .line 147
    sput-object v11, Lcom/zykj/mistake/utils/QuestionType;->TYPE_COMPOSITION:Lcom/zykj/mistake/utils/QuestionType;

    .line 148
    .line 149
    new-instance v12, Lcom/zykj/mistake/utils/QuestionType;

    .line 150
    .line 151
    const/16 v13, 0xc

    .line 152
    .line 153
    const-string v14, "\u77ed\u6587\u6539\u9519"

    .line 154
    .line 155
    const-string v15, "TYPE_CORRECTION"

    .line 156
    .line 157
    invoke-direct {v12, v15, v13, v13, v14}, Lcom/zykj/mistake/utils/QuestionType;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    .line 158
    .line 159
    .line 160
    sput-object v12, Lcom/zykj/mistake/utils/QuestionType;->TYPE_CORRECTION:Lcom/zykj/mistake/utils/QuestionType;

    .line 161
    .line 162
    filled-new-array/range {v0 .. v12}, [Lcom/zykj/mistake/utils/QuestionType;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    sput-object v0, Lcom/zykj/mistake/utils/QuestionType;->a:[Lcom/zykj/mistake/utils/QuestionType;

    .line 167
    .line 168
    invoke-static {v0}, Lkotlin/enums/a;->a([Ljava/lang/Enum;)Lj6/a;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    sput-object v0, Lcom/zykj/mistake/utils/QuestionType;->b:Lj6/a;

    .line 173
    .line 174
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lcom/zykj/mistake/utils/QuestionType;->type:I

    .line 5
    .line 6
    iput-object p4, p0, Lcom/zykj/mistake/utils/QuestionType;->typeName:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public static getEntries()Lj6/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lj6/a;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    sget-object v0, Lcom/zykj/mistake/utils/QuestionType;->b:Lj6/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/zykj/mistake/utils/QuestionType;
    .locals 1

    const-class v0, Lcom/zykj/mistake/utils/QuestionType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/zykj/mistake/utils/QuestionType;

    return-object p0
.end method

.method public static values()[Lcom/zykj/mistake/utils/QuestionType;
    .locals 1

    sget-object v0, Lcom/zykj/mistake/utils/QuestionType;->a:[Lcom/zykj/mistake/utils/QuestionType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/zykj/mistake/utils/QuestionType;

    return-object v0
.end method


# virtual methods
.method public final getType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/utils/QuestionType;->type:I

    .line 2
    .line 3
    return v0
.end method

.method public final getTypeName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/utils/QuestionType;->typeName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final setType(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/mistake/utils/QuestionType;->type:I

    .line 2
    .line 3
    return-void
.end method

.method public final setTypeName(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/mistake/utils/QuestionType;->typeName:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method
