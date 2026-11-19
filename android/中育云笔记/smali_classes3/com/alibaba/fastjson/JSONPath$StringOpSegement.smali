.class Lcom/alibaba/fastjson/JSONPath$StringOpSegement;
.super Lcom/alibaba/fastjson/JSONPath$PropertyFilter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alibaba/fastjson/JSONPath;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "StringOpSegement"
.end annotation


# instance fields
.field private final op:Lcom/alibaba/fastjson/JSONPath$Operator;

.field private final value:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLjava/lang/String;Lcom/alibaba/fastjson/JSONPath$Operator;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/alibaba/fastjson/JSONPath$PropertyFilter;-><init>(Ljava/lang/String;Z)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcom/alibaba/fastjson/JSONPath$StringOpSegement;->value:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p4, p0, Lcom/alibaba/fastjson/JSONPath$StringOpSegement;->op:Lcom/alibaba/fastjson/JSONPath$Operator;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public apply(Lcom/alibaba/fastjson/JSONPath;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2, p4}, Lcom/alibaba/fastjson/JSONPath$PropertyFilter;->get(Lcom/alibaba/fastjson/JSONPath;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p2, p0, Lcom/alibaba/fastjson/JSONPath$StringOpSegement;->op:Lcom/alibaba/fastjson/JSONPath$Operator;

    .line 6
    .line 7
    sget-object p3, Lcom/alibaba/fastjson/JSONPath$Operator;->EQ:Lcom/alibaba/fastjson/JSONPath$Operator;

    .line 8
    .line 9
    if-ne p2, p3, :cond_0

    .line 10
    .line 11
    iget-object p2, p0, Lcom/alibaba/fastjson/JSONPath$StringOpSegement;->value:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1

    .line 18
    :cond_0
    sget-object p3, Lcom/alibaba/fastjson/JSONPath$Operator;->NE:Lcom/alibaba/fastjson/JSONPath$Operator;

    .line 19
    .line 20
    const/4 p4, 0x1

    .line 21
    if-ne p2, p3, :cond_1

    .line 22
    .line 23
    iget-object p2, p0, Lcom/alibaba/fastjson/JSONPath$StringOpSegement;->value:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    xor-int/2addr p1, p4

    .line 30
    return p1

    .line 31
    :cond_1
    const/4 p2, 0x0

    .line 32
    if-nez p1, :cond_2

    .line 33
    .line 34
    return p2

    .line 35
    :cond_2
    iget-object p3, p0, Lcom/alibaba/fastjson/JSONPath$StringOpSegement;->value:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p3, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    iget-object p3, p0, Lcom/alibaba/fastjson/JSONPath$StringOpSegement;->op:Lcom/alibaba/fastjson/JSONPath$Operator;

    .line 46
    .line 47
    sget-object v0, Lcom/alibaba/fastjson/JSONPath$Operator;->GE:Lcom/alibaba/fastjson/JSONPath$Operator;

    .line 48
    .line 49
    if-ne p3, v0, :cond_4

    .line 50
    .line 51
    if-gtz p1, :cond_3

    .line 52
    .line 53
    return p4

    .line 54
    :cond_3
    return p2

    .line 55
    :cond_4
    sget-object v0, Lcom/alibaba/fastjson/JSONPath$Operator;->GT:Lcom/alibaba/fastjson/JSONPath$Operator;

    .line 56
    .line 57
    if-ne p3, v0, :cond_6

    .line 58
    .line 59
    if-gez p1, :cond_5

    .line 60
    .line 61
    return p4

    .line 62
    :cond_5
    return p2

    .line 63
    :cond_6
    sget-object v0, Lcom/alibaba/fastjson/JSONPath$Operator;->LE:Lcom/alibaba/fastjson/JSONPath$Operator;

    .line 64
    .line 65
    if-ne p3, v0, :cond_8

    .line 66
    .line 67
    if-ltz p1, :cond_7

    .line 68
    .line 69
    return p4

    .line 70
    :cond_7
    return p2

    .line 71
    :cond_8
    sget-object v0, Lcom/alibaba/fastjson/JSONPath$Operator;->LT:Lcom/alibaba/fastjson/JSONPath$Operator;

    .line 72
    .line 73
    if-ne p3, v0, :cond_9

    .line 74
    .line 75
    if-lez p1, :cond_9

    .line 76
    .line 77
    return p4

    .line 78
    :cond_9
    return p2
.end method
