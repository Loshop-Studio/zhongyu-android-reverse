.class public Landroidx/constraintlayout/core/motion/utils/Easing;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/constraintlayout/core/motion/utils/Easing$CubicEasing;
    }
.end annotation


# static fields
.field private static final ACCELERATE:Ljava/lang/String; = "cubic(0.4, 0.05, 0.8, 0.7)"

.field private static final ACCELERATE_NAME:Ljava/lang/String; = "accelerate"

.field private static final ANTICIPATE:Ljava/lang/String; = "cubic(0.36, 0, 0.66, -0.56)"

.field private static final ANTICIPATE_NAME:Ljava/lang/String; = "anticipate"

.field private static final DECELERATE:Ljava/lang/String; = "cubic(0.0, 0.0, 0.2, 0.95)"

.field private static final DECELERATE_NAME:Ljava/lang/String; = "decelerate"

.field private static final LINEAR:Ljava/lang/String; = "cubic(1, 1, 0, 0)"

.field private static final LINEAR_NAME:Ljava/lang/String; = "linear"

.field public static NAMED_EASING:[Ljava/lang/String; = null

.field private static final OVERSHOOT:Ljava/lang/String; = "cubic(0.34, 1.56, 0.64, 1)"

.field private static final OVERSHOOT_NAME:Ljava/lang/String; = "overshoot"

.field private static final STANDARD:Ljava/lang/String; = "cubic(0.4, 0.0, 0.2, 1)"

.field private static final STANDARD_NAME:Ljava/lang/String; = "standard"

.field static sDefault:Landroidx/constraintlayout/core/motion/utils/Easing;


# instance fields
.field mStr:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Landroidx/constraintlayout/core/motion/utils/Easing;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/constraintlayout/core/motion/utils/Easing;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/constraintlayout/core/motion/utils/Easing;->sDefault:Landroidx/constraintlayout/core/motion/utils/Easing;

    .line 7
    .line 8
    const-string v0, "decelerate"

    .line 9
    .line 10
    const-string/jumbo v1, "linear"

    .line 11
    .line 12
    .line 13
    const-string/jumbo v2, "standard"

    .line 14
    .line 15
    .line 16
    const-string v3, "accelerate"

    .line 17
    .line 18
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, Landroidx/constraintlayout/core/motion/utils/Easing;->NAMED_EASING:[Ljava/lang/String;

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "identity"

    .line 5
    .line 6
    iput-object v0, p0, Landroidx/constraintlayout/core/motion/utils/Easing;->mStr:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method

.method public static getInterpolator(Ljava/lang/String;)Landroidx/constraintlayout/core/motion/utils/Easing;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    const-string v0, "cubic"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    new-instance v0, Landroidx/constraintlayout/core/motion/utils/Easing$CubicEasing;

    .line 14
    .line 15
    invoke-direct {v0, p0}, Landroidx/constraintlayout/core/motion/utils/Easing$CubicEasing;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_1
    const-string/jumbo v0, "spline"

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    new-instance v0, Landroidx/constraintlayout/core/motion/utils/StepCurve;

    .line 29
    .line 30
    invoke-direct {v0, p0}, Landroidx/constraintlayout/core/motion/utils/StepCurve;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-object v0

    .line 34
    :cond_2
    const-string v0, "Schlick"

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    new-instance v0, Landroidx/constraintlayout/core/motion/utils/Schlick;

    .line 43
    .line 44
    invoke-direct {v0, p0}, Landroidx/constraintlayout/core/motion/utils/Schlick;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-object v0

    .line 48
    :cond_3
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    const/4 v1, -0x1

    .line 53
    sparse-switch v0, :sswitch_data_0

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :sswitch_0
    const-string/jumbo v0, "standard"

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    if-nez p0, :cond_4

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_4
    const/4 v1, 0x5

    .line 68
    goto :goto_0

    .line 69
    :sswitch_1
    const-string/jumbo v0, "overshoot"

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    if-nez p0, :cond_5

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_5
    const/4 v1, 0x4

    .line 80
    goto :goto_0

    .line 81
    :sswitch_2
    const-string/jumbo v0, "linear"

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    if-nez p0, :cond_6

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_6
    const/4 v1, 0x3

    .line 92
    goto :goto_0

    .line 93
    :sswitch_3
    const-string v0, "anticipate"

    .line 94
    .line 95
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    if-nez p0, :cond_7

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_7
    const/4 v1, 0x2

    .line 103
    goto :goto_0

    .line 104
    :sswitch_4
    const-string v0, "decelerate"

    .line 105
    .line 106
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    if-nez p0, :cond_8

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_8
    const/4 v1, 0x1

    .line 114
    goto :goto_0

    .line 115
    :sswitch_5
    const-string v0, "accelerate"

    .line 116
    .line 117
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result p0

    .line 121
    if-nez p0, :cond_9

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_9
    const/4 v1, 0x0

    .line 125
    :goto_0
    packed-switch v1, :pswitch_data_0

    .line 126
    .line 127
    .line 128
    sget-object p0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 129
    .line 130
    new-instance v0, Ljava/lang/StringBuilder;

    .line 131
    .line 132
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 133
    .line 134
    .line 135
    const-string/jumbo v1, "transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or "

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    sget-object v1, Landroidx/constraintlayout/core/motion/utils/Easing;->NAMED_EASING:[Ljava/lang/String;

    .line 142
    .line 143
    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-virtual {p0, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    sget-object p0, Landroidx/constraintlayout/core/motion/utils/Easing;->sDefault:Landroidx/constraintlayout/core/motion/utils/Easing;

    .line 158
    .line 159
    return-object p0

    .line 160
    :pswitch_0
    new-instance p0, Landroidx/constraintlayout/core/motion/utils/Easing$CubicEasing;

    .line 161
    .line 162
    const-string v0, "cubic(0.4, 0.0, 0.2, 1)"

    .line 163
    .line 164
    invoke-direct {p0, v0}, Landroidx/constraintlayout/core/motion/utils/Easing$CubicEasing;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    return-object p0

    .line 168
    :pswitch_1
    new-instance p0, Landroidx/constraintlayout/core/motion/utils/Easing$CubicEasing;

    .line 169
    .line 170
    const-string v0, "cubic(0.34, 1.56, 0.64, 1)"

    .line 171
    .line 172
    invoke-direct {p0, v0}, Landroidx/constraintlayout/core/motion/utils/Easing$CubicEasing;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    return-object p0

    .line 176
    :pswitch_2
    new-instance p0, Landroidx/constraintlayout/core/motion/utils/Easing$CubicEasing;

    .line 177
    .line 178
    const-string v0, "cubic(1, 1, 0, 0)"

    .line 179
    .line 180
    invoke-direct {p0, v0}, Landroidx/constraintlayout/core/motion/utils/Easing$CubicEasing;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    return-object p0

    .line 184
    :pswitch_3
    new-instance p0, Landroidx/constraintlayout/core/motion/utils/Easing$CubicEasing;

    .line 185
    .line 186
    const-string v0, "cubic(0.36, 0, 0.66, -0.56)"

    .line 187
    .line 188
    invoke-direct {p0, v0}, Landroidx/constraintlayout/core/motion/utils/Easing$CubicEasing;-><init>(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    return-object p0

    .line 192
    :pswitch_4
    new-instance p0, Landroidx/constraintlayout/core/motion/utils/Easing$CubicEasing;

    .line 193
    .line 194
    const-string v0, "cubic(0.0, 0.0, 0.2, 0.95)"

    .line 195
    .line 196
    invoke-direct {p0, v0}, Landroidx/constraintlayout/core/motion/utils/Easing$CubicEasing;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    return-object p0

    .line 200
    :pswitch_5
    new-instance p0, Landroidx/constraintlayout/core/motion/utils/Easing$CubicEasing;

    .line 201
    .line 202
    const-string v0, "cubic(0.4, 0.05, 0.8, 0.7)"

    .line 203
    .line 204
    invoke-direct {p0, v0}, Landroidx/constraintlayout/core/motion/utils/Easing$CubicEasing;-><init>(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    return-object p0

    .line 208
    nop

    .line 209
    :sswitch_data_0
    .sparse-switch
        -0x50bb8523 -> :sswitch_5
        -0x4b5653c4 -> :sswitch_4
        -0x47620096 -> :sswitch_3
        -0x41b970db -> :sswitch_2
        -0x2ca5d435 -> :sswitch_1
        0x4e3d1ebd -> :sswitch_0
    .end sparse-switch

    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public get(D)D
    .locals 0

    return-wide p1
.end method

.method public getDiff(D)D
    .locals 0

    const-wide/high16 p1, 0x3ff0000000000000L    # 1.0

    return-wide p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/constraintlayout/core/motion/utils/Easing;->mStr:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
