.class final Lcom/alibaba/fastjson/asm/Item;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field hashCode:I

.field index:I

.field intVal:I

.field longVal:J

.field next:Lcom/alibaba/fastjson/asm/Item;

.field strVal1:Ljava/lang/String;

.field strVal2:Ljava/lang/String;

.field strVal3:Ljava/lang/String;

.field type:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(ILcom/alibaba/fastjson/asm/Item;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/alibaba/fastjson/asm/Item;->index:I

    .line 4
    iget p1, p2, Lcom/alibaba/fastjson/asm/Item;->type:I

    iput p1, p0, Lcom/alibaba/fastjson/asm/Item;->type:I

    .line 5
    iget p1, p2, Lcom/alibaba/fastjson/asm/Item;->intVal:I

    iput p1, p0, Lcom/alibaba/fastjson/asm/Item;->intVal:I

    .line 6
    iget-wide v0, p2, Lcom/alibaba/fastjson/asm/Item;->longVal:J

    iput-wide v0, p0, Lcom/alibaba/fastjson/asm/Item;->longVal:J

    .line 7
    iget-object p1, p2, Lcom/alibaba/fastjson/asm/Item;->strVal1:Ljava/lang/String;

    iput-object p1, p0, Lcom/alibaba/fastjson/asm/Item;->strVal1:Ljava/lang/String;

    .line 8
    iget-object p1, p2, Lcom/alibaba/fastjson/asm/Item;->strVal2:Ljava/lang/String;

    iput-object p1, p0, Lcom/alibaba/fastjson/asm/Item;->strVal2:Ljava/lang/String;

    .line 9
    iget-object p1, p2, Lcom/alibaba/fastjson/asm/Item;->strVal3:Ljava/lang/String;

    iput-object p1, p0, Lcom/alibaba/fastjson/asm/Item;->strVal3:Ljava/lang/String;

    .line 10
    iget p1, p2, Lcom/alibaba/fastjson/asm/Item;->hashCode:I

    iput p1, p0, Lcom/alibaba/fastjson/asm/Item;->hashCode:I

    return-void
.end method


# virtual methods
.method public isEqualTo(Lcom/alibaba/fastjson/asm/Item;)Z
    .locals 8

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson/asm/Item;->type:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_6

    .line 5
    .line 6
    const/16 v2, 0xf

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    if-eq v0, v2, :cond_4

    .line 10
    .line 11
    const/16 v2, 0xc

    .line 12
    .line 13
    if-eq v0, v2, :cond_2

    .line 14
    .line 15
    const/16 v2, 0xd

    .line 16
    .line 17
    if-eq v0, v2, :cond_6

    .line 18
    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    iget-object v0, p1, Lcom/alibaba/fastjson/asm/Item;->strVal1:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v2, p0, Lcom/alibaba/fastjson/asm/Item;->strVal1:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    iget-object v0, p1, Lcom/alibaba/fastjson/asm/Item;->strVal2:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v2, p0, Lcom/alibaba/fastjson/asm/Item;->strVal2:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    iget-object p1, p1, Lcom/alibaba/fastjson/asm/Item;->strVal3:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v0, p0, Lcom/alibaba/fastjson/asm/Item;->strVal3:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_0

    .line 51
    .line 52
    return v1

    .line 53
    :cond_0
    return v3

    .line 54
    :pswitch_0
    iget p1, p1, Lcom/alibaba/fastjson/asm/Item;->intVal:I

    .line 55
    .line 56
    iget v0, p0, Lcom/alibaba/fastjson/asm/Item;->intVal:I

    .line 57
    .line 58
    if-ne p1, v0, :cond_1

    .line 59
    .line 60
    return v1

    .line 61
    :cond_1
    return v3

    .line 62
    :cond_2
    iget-object v0, p1, Lcom/alibaba/fastjson/asm/Item;->strVal1:Ljava/lang/String;

    .line 63
    .line 64
    iget-object v2, p0, Lcom/alibaba/fastjson/asm/Item;->strVal1:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_3

    .line 71
    .line 72
    iget-object p1, p1, Lcom/alibaba/fastjson/asm/Item;->strVal2:Ljava/lang/String;

    .line 73
    .line 74
    iget-object v0, p0, Lcom/alibaba/fastjson/asm/Item;->strVal2:Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-eqz p1, :cond_3

    .line 81
    .line 82
    return v1

    .line 83
    :cond_3
    return v3

    .line 84
    :cond_4
    :pswitch_1
    iget-wide v4, p1, Lcom/alibaba/fastjson/asm/Item;->longVal:J

    .line 85
    .line 86
    iget-wide v6, p0, Lcom/alibaba/fastjson/asm/Item;->longVal:J

    .line 87
    .line 88
    cmp-long p1, v4, v6

    .line 89
    .line 90
    if-nez p1, :cond_5

    .line 91
    .line 92
    return v1

    .line 93
    :cond_5
    return v3

    .line 94
    :cond_6
    :pswitch_2
    iget-object p1, p1, Lcom/alibaba/fastjson/asm/Item;->strVal1:Ljava/lang/String;

    .line 95
    .line 96
    iget-object v0, p0, Lcom/alibaba/fastjson/asm/Item;->strVal1:Ljava/lang/String;

    .line 97
    .line 98
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    return p1

    .line 103
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method

.method public set(I)V
    .locals 2

    const/4 v0, 0x3

    .line 8
    iput v0, p0, Lcom/alibaba/fastjson/asm/Item;->type:I

    .line 9
    iput p1, p0, Lcom/alibaba/fastjson/asm/Item;->intVal:I

    const v1, 0x7fffffff

    add-int/2addr v0, p1

    and-int p1, v0, v1

    .line 10
    iput p1, p0, Lcom/alibaba/fastjson/asm/Item;->hashCode:I

    return-void
.end method

.method public set(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    iput p1, p0, Lcom/alibaba/fastjson/asm/Item;->type:I

    .line 2
    iput-object p2, p0, Lcom/alibaba/fastjson/asm/Item;->strVal1:Ljava/lang/String;

    .line 3
    iput-object p3, p0, Lcom/alibaba/fastjson/asm/Item;->strVal2:Ljava/lang/String;

    .line 4
    iput-object p4, p0, Lcom/alibaba/fastjson/asm/Item;->strVal3:Ljava/lang/String;

    const/4 v0, 0x1

    const v1, 0x7fffffff

    if-eq p1, v0, :cond_1

    const/4 v0, 0x7

    if-eq p1, v0, :cond_1

    const/16 v0, 0x8

    if-eq p1, v0, :cond_1

    const/16 v0, 0xc

    if-eq p1, v0, :cond_0

    const/16 v0, 0xd

    if-eq p1, v0, :cond_1

    .line 5
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result p2

    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    move-result p3

    mul-int/2addr p2, p3

    invoke-virtual {p4}, Ljava/lang/String;->hashCode()I

    move-result p3

    mul-int/2addr p2, p3

    add-int/2addr p1, p2

    and-int/2addr p1, v1

    iput p1, p0, Lcom/alibaba/fastjson/asm/Item;->hashCode:I

    return-void

    .line 6
    :cond_0
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result p2

    invoke-virtual {p3}, Ljava/lang/String;->hashCode()I

    move-result p3

    mul-int/2addr p2, p3

    add-int/2addr p1, p2

    and-int/2addr p1, v1

    iput p1, p0, Lcom/alibaba/fastjson/asm/Item;->hashCode:I

    return-void

    .line 7
    :cond_1
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result p2

    add-int/2addr p1, p2

    and-int/2addr p1, v1

    iput p1, p0, Lcom/alibaba/fastjson/asm/Item;->hashCode:I

    return-void
.end method
