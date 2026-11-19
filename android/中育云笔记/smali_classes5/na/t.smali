.class public final Lna/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lna/t;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lna/t;

    .line 2
    .line 3
    invoke-direct {v0}, Lna/t;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lna/t;->a:Lna/t;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Landroid/graphics/Paint;F)Ljava/util/List;
    .locals 8

    .line 1
    const-string v0, "content"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "paint"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v1, "\n"

    .line 17
    .line 18
    filled-new-array {v1}, [Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    const/4 v6, 0x6

    .line 23
    const/4 v7, 0x0

    .line 24
    const/4 v4, 0x0

    .line 25
    const/4 v5, 0x0

    .line 26
    move-object v2, p1

    .line 27
    invoke-static/range {v2 .. v7}, Lqd/c0;->I0(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Ljava/lang/Iterable;

    .line 32
    .line 33
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    const/4 v1, 0x0

    .line 38
    move v2, v1

    .line 39
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_5

    .line 44
    .line 45
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    check-cast v3, Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {p2, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-nez v2, :cond_1

    .line 56
    .line 57
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    int-to-float v2, v2

    .line 62
    mul-float/2addr v2, p3

    .line 63
    div-float/2addr v2, v4

    .line 64
    float-to-double v4, v2

    .line 65
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 66
    .line 67
    .line 68
    move-result-wide v4

    .line 69
    double-to-int v2, v4

    .line 70
    new-instance v4, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 73
    .line 74
    .line 75
    const-string v5, "average-> "

    .line 76
    .line 77
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    const-string v5, "TextGraphUtils"

    .line 88
    .line 89
    invoke-static {v5, v4}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    :cond_1
    move v4, v1

    .line 93
    :goto_0
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    if-ge v4, v5, :cond_0

    .line 98
    .line 99
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    sub-int/2addr v5, v4

    .line 104
    if-le v2, v5, :cond_2

    .line 105
    .line 106
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    sub-int/2addr v2, v4

    .line 111
    :cond_2
    :goto_1
    add-int v5, v4, v2

    .line 112
    .line 113
    invoke-virtual {p2, v3, v4, v5}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    cmpg-float v5, v5, p3

    .line 118
    .line 119
    if-gtz v5, :cond_3

    .line 120
    .line 121
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    sub-int/2addr v5, v4

    .line 126
    if-ge v2, v5, :cond_3

    .line 127
    .line 128
    add-int/lit8 v2, v2, 0x1

    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_3
    :goto_2
    add-int v5, v4, v2

    .line 132
    .line 133
    invoke-virtual {p2, v3, v4, v5}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F

    .line 134
    .line 135
    .line 136
    move-result v6

    .line 137
    cmpl-float v6, v6, p3

    .line 138
    .line 139
    if-ltz v6, :cond_4

    .line 140
    .line 141
    const/4 v6, 0x1

    .line 142
    if-le v2, v6, :cond_4

    .line 143
    .line 144
    add-int/lit8 v2, v2, -0x1

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_4
    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v4

    .line 151
    const-string v6, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    .line 152
    .line 153
    invoke-static {v4, v6}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move v4, v5

    .line 160
    goto :goto_0

    .line 161
    :cond_5
    return-object v0
.end method
