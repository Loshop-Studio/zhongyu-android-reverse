.class public final Lm7/b2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li7/b;


# static fields
.field public static final a:Lm7/b2;

.field public static final b:Lm7/e1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lm7/b2;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lm7/b2;->a:Lm7/b2;

    .line 7
    .line 8
    new-instance v0, Lm7/e1;

    .line 9
    .line 10
    const-string v1, "kotlin.uuid.Uuid"

    .line 11
    .line 12
    sget-object v2, Lk7/e;->j:Lk7/e;

    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, Lm7/e1;-><init>(Ljava/lang/String;Lk7/f;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lm7/b2;->b:Lm7/e1;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final deserialize(Ll7/e;)Ljava/lang/Object;
    .locals 14

    .line 1
    const-string v0, "decoder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lkotlin/uuid/Uuid;->Companion:Lb7/a;

    .line 7
    .line 8
    invoke-interface {p1}, Ll7/e;->decodeString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const-string v0, "uuidString"

    .line 16
    .line 17
    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/16 v2, 0x10

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    const/16 v4, 0x20

    .line 28
    .line 29
    if-eq v0, v4, :cond_2

    .line 30
    .line 31
    const/16 v5, 0x24

    .line 32
    .line 33
    if-eq v0, v5, :cond_1

    .line 34
    .line 35
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 36
    .line 37
    new-instance v2, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string v4, "Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \""

    .line 40
    .line 41
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    const/16 v5, 0x40

    .line 49
    .line 50
    if-gt v4, v5, :cond_0

    .line 51
    .line 52
    move-object v3, v1

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    invoke-virtual {v1, v3, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    const-string v4, "substring(...)"

    .line 59
    .line 60
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const-string v4, "..."

    .line 64
    .line 65
    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    :goto_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v3, "\" of length "

    .line 73
    .line 74
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw v0

    .line 92
    :cond_1
    const/16 v0, 0x8

    .line 93
    .line 94
    invoke-static {v3, v0, v1}, Lkotlin/text/e;->b(IILjava/lang/String;)J

    .line 95
    .line 96
    .line 97
    move-result-wide v6

    .line 98
    invoke-static {v0, v1}, Lv7/l;->d(ILjava/lang/String;)V

    .line 99
    .line 100
    .line 101
    const/16 v0, 0x9

    .line 102
    .line 103
    const/16 v3, 0xd

    .line 104
    .line 105
    invoke-static {v0, v3, v1}, Lkotlin/text/e;->b(IILjava/lang/String;)J

    .line 106
    .line 107
    .line 108
    move-result-wide v8

    .line 109
    invoke-static {v3, v1}, Lv7/l;->d(ILjava/lang/String;)V

    .line 110
    .line 111
    .line 112
    const/16 v0, 0xe

    .line 113
    .line 114
    const/16 v3, 0x12

    .line 115
    .line 116
    invoke-static {v0, v3, v1}, Lkotlin/text/e;->b(IILjava/lang/String;)J

    .line 117
    .line 118
    .line 119
    move-result-wide v10

    .line 120
    invoke-static {v3, v1}, Lv7/l;->d(ILjava/lang/String;)V

    .line 121
    .line 122
    .line 123
    const/16 v0, 0x13

    .line 124
    .line 125
    const/16 v3, 0x17

    .line 126
    .line 127
    invoke-static {v0, v3, v1}, Lkotlin/text/e;->b(IILjava/lang/String;)J

    .line 128
    .line 129
    .line 130
    move-result-wide v12

    .line 131
    invoke-static {v3, v1}, Lv7/l;->d(ILjava/lang/String;)V

    .line 132
    .line 133
    .line 134
    const/16 v0, 0x18

    .line 135
    .line 136
    invoke-static {v0, v5, v1}, Lkotlin/text/e;->b(IILjava/lang/String;)J

    .line 137
    .line 138
    .line 139
    move-result-wide v0

    .line 140
    shl-long v3, v6, v4

    .line 141
    .line 142
    shl-long v5, v8, v2

    .line 143
    .line 144
    or-long v2, v3, v5

    .line 145
    .line 146
    or-long/2addr v2, v10

    .line 147
    const/16 v4, 0x30

    .line 148
    .line 149
    shl-long v4, v12, v4

    .line 150
    .line 151
    or-long/2addr v0, v4

    .line 152
    invoke-static {v2, v3, v0, v1}, Lb7/a;->a(JJ)Lkotlin/uuid/Uuid;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    return-object v0

    .line 157
    :cond_2
    invoke-static {v3, v2, v1}, Lkotlin/text/e;->b(IILjava/lang/String;)J

    .line 158
    .line 159
    .line 160
    move-result-wide v5

    .line 161
    invoke-static {v2, v4, v1}, Lkotlin/text/e;->b(IILjava/lang/String;)J

    .line 162
    .line 163
    .line 164
    move-result-wide v0

    .line 165
    invoke-static {v5, v6, v0, v1}, Lb7/a;->a(JJ)Lkotlin/uuid/Uuid;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    return-object v0
.end method

.method public final getDescriptor()Lk7/g;
    .locals 1

    .line 1
    sget-object v0, Lm7/b2;->b:Lm7/e1;

    .line 2
    .line 3
    return-object v0
.end method

.method public final serialize(Ll7/f;Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p2, Lkotlin/uuid/Uuid;

    .line 2
    .line 3
    const-string v0, "value"

    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2}, Lkotlin/uuid/Uuid;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    invoke-interface {p1, p2}, Ll7/f;->encodeString(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
