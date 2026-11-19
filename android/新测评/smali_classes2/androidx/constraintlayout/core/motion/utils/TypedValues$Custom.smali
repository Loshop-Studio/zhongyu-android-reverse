.class public interface abstract Landroidx/constraintlayout/core/motion/utils/TypedValues$Custom;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/constraintlayout/core/motion/utils/TypedValues;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Custom"
.end annotation


# static fields
.field public static final KEY_WORDS:[Ljava/lang/String;

.field public static final NAME:Ljava/lang/String; = "Custom"

.field public static final S_BOOLEAN:Ljava/lang/String; = "boolean"

.field public static final S_COLOR:Ljava/lang/String; = "color"

.field public static final S_DIMENSION:Ljava/lang/String; = "dimension"

.field public static final S_FLOAT:Ljava/lang/String; = "float"

.field public static final S_INT:Ljava/lang/String; = "integer"

.field public static final S_REFERENCE:Ljava/lang/String; = "reference"

.field public static final S_STRING:Ljava/lang/String; = "string"

.field public static final TYPE_BOOLEAN:I = 0x388

.field public static final TYPE_COLOR:I = 0x386

.field public static final TYPE_DIMENSION:I = 0x389

.field public static final TYPE_FLOAT:I = 0x385

.field public static final TYPE_INT:I = 0x384

.field public static final TYPE_REFERENCE:I = 0x38a

.field public static final TYPE_STRING:I = 0x387


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const-string v4, "dimension"

    .line 2
    .line 3
    const-string/jumbo v5, "reference"

    .line 4
    .line 5
    .line 6
    const-string v0, "float"

    .line 7
    .line 8
    const-string v1, "color"

    .line 9
    .line 10
    const-string/jumbo v2, "string"

    .line 11
    .line 12
    .line 13
    const-string v3, "boolean"

    .line 14
    .line 15
    filled-new-array/range {v0 .. v5}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Landroidx/constraintlayout/core/motion/utils/TypedValues$Custom;->KEY_WORDS:[Ljava/lang/String;

    .line 20
    .line 21
    return-void
.end method

.method public static getId(Ljava/lang/String;)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, -0x1

    .line 9
    sparse-switch v0, :sswitch_data_0

    .line 10
    .line 11
    .line 12
    :goto_0
    move p0, v1

    .line 13
    goto :goto_1

    .line 14
    :sswitch_0
    const-string/jumbo v0, "integer"

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-nez p0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p0, 0x6

    .line 25
    goto :goto_1

    .line 26
    :sswitch_1
    const-string v0, "float"

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-nez p0, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 p0, 0x5

    .line 36
    goto :goto_1

    .line 37
    :sswitch_2
    const-string v0, "color"

    .line 38
    .line 39
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-nez p0, :cond_2

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    const/4 p0, 0x4

    .line 47
    goto :goto_1

    .line 48
    :sswitch_3
    const-string v0, "boolean"

    .line 49
    .line 50
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-nez p0, :cond_3

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_3
    const/4 p0, 0x3

    .line 58
    goto :goto_1

    .line 59
    :sswitch_4
    const-string/jumbo v0, "string"

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-nez p0, :cond_4

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_4
    const/4 p0, 0x2

    .line 70
    goto :goto_1

    .line 71
    :sswitch_5
    const-string/jumbo v0, "reference"

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    if-nez p0, :cond_5

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_5
    const/4 p0, 0x1

    .line 82
    goto :goto_1

    .line 83
    :sswitch_6
    const-string v0, "dimension"

    .line 84
    .line 85
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    if-nez p0, :cond_6

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_6
    const/4 p0, 0x0

    .line 93
    :goto_1
    packed-switch p0, :pswitch_data_0

    .line 94
    .line 95
    .line 96
    return v1

    .line 97
    :pswitch_0
    const/16 p0, 0x384

    .line 98
    .line 99
    return p0

    .line 100
    :pswitch_1
    const/16 p0, 0x385

    .line 101
    .line 102
    return p0

    .line 103
    :pswitch_2
    const/16 p0, 0x386

    .line 104
    .line 105
    return p0

    .line 106
    :pswitch_3
    const/16 p0, 0x388

    .line 107
    .line 108
    return p0

    .line 109
    :pswitch_4
    const/16 p0, 0x387

    .line 110
    .line 111
    return p0

    .line 112
    :pswitch_5
    const/16 p0, 0x38a

    .line 113
    .line 114
    return p0

    .line 115
    :pswitch_6
    const/16 p0, 0x389

    .line 116
    .line 117
    return p0

    .line 118
    nop

    .line 119
    :sswitch_data_0
    .sparse-switch
        -0x4144929a -> :sswitch_6
        -0x3724c0b5 -> :sswitch_5
        -0x352a9fef -> :sswitch_4
        0x3db6c28 -> :sswitch_3
        0x5a72f63 -> :sswitch_2
        0x5d0225c -> :sswitch_1
        0x74b5813e -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
