.class public final enum Lorg/tensorflow/lite/DataType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/tensorflow/lite/DataType;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum d:Lorg/tensorflow/lite/DataType;

.field public static final enum e:Lorg/tensorflow/lite/DataType;

.field public static final enum f:Lorg/tensorflow/lite/DataType;

.field public static final enum g:Lorg/tensorflow/lite/DataType;

.field public static final enum h:Lorg/tensorflow/lite/DataType;

.field public static final enum i:Lorg/tensorflow/lite/DataType;

.field public static final enum j:Lorg/tensorflow/lite/DataType;

.field public static final k:[Lorg/tensorflow/lite/DataType;

.field public static final synthetic l:[Lorg/tensorflow/lite/DataType;


# instance fields
.field public final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, Lorg/tensorflow/lite/DataType;

    .line 2
    .line 3
    const-string v1, "FLOAT32"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    invoke-direct {v0, v1, v2, v3}, Lorg/tensorflow/lite/DataType;-><init>(Ljava/lang/String;II)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lorg/tensorflow/lite/DataType;->d:Lorg/tensorflow/lite/DataType;

    .line 11
    .line 12
    new-instance v1, Lorg/tensorflow/lite/DataType;

    .line 13
    .line 14
    const-string v2, "INT32"

    .line 15
    .line 16
    const/4 v4, 0x2

    .line 17
    invoke-direct {v1, v2, v3, v4}, Lorg/tensorflow/lite/DataType;-><init>(Ljava/lang/String;II)V

    .line 18
    .line 19
    .line 20
    sput-object v1, Lorg/tensorflow/lite/DataType;->e:Lorg/tensorflow/lite/DataType;

    .line 21
    .line 22
    new-instance v2, Lorg/tensorflow/lite/DataType;

    .line 23
    .line 24
    const-string v3, "UINT8"

    .line 25
    .line 26
    const/4 v5, 0x3

    .line 27
    invoke-direct {v2, v3, v4, v5}, Lorg/tensorflow/lite/DataType;-><init>(Ljava/lang/String;II)V

    .line 28
    .line 29
    .line 30
    sput-object v2, Lorg/tensorflow/lite/DataType;->f:Lorg/tensorflow/lite/DataType;

    .line 31
    .line 32
    new-instance v3, Lorg/tensorflow/lite/DataType;

    .line 33
    .line 34
    const-string v4, "INT64"

    .line 35
    .line 36
    const/4 v6, 0x4

    .line 37
    invoke-direct {v3, v4, v5, v6}, Lorg/tensorflow/lite/DataType;-><init>(Ljava/lang/String;II)V

    .line 38
    .line 39
    .line 40
    sput-object v3, Lorg/tensorflow/lite/DataType;->g:Lorg/tensorflow/lite/DataType;

    .line 41
    .line 42
    new-instance v4, Lorg/tensorflow/lite/DataType;

    .line 43
    .line 44
    const-string v5, "STRING"

    .line 45
    .line 46
    const/4 v7, 0x5

    .line 47
    invoke-direct {v4, v5, v6, v7}, Lorg/tensorflow/lite/DataType;-><init>(Ljava/lang/String;II)V

    .line 48
    .line 49
    .line 50
    sput-object v4, Lorg/tensorflow/lite/DataType;->h:Lorg/tensorflow/lite/DataType;

    .line 51
    .line 52
    new-instance v5, Lorg/tensorflow/lite/DataType;

    .line 53
    .line 54
    const-string v6, "BOOL"

    .line 55
    .line 56
    const/4 v8, 0x6

    .line 57
    invoke-direct {v5, v6, v7, v8}, Lorg/tensorflow/lite/DataType;-><init>(Ljava/lang/String;II)V

    .line 58
    .line 59
    .line 60
    sput-object v5, Lorg/tensorflow/lite/DataType;->i:Lorg/tensorflow/lite/DataType;

    .line 61
    .line 62
    new-instance v6, Lorg/tensorflow/lite/DataType;

    .line 63
    .line 64
    const-string v7, "INT8"

    .line 65
    .line 66
    const/16 v9, 0x9

    .line 67
    .line 68
    invoke-direct {v6, v7, v8, v9}, Lorg/tensorflow/lite/DataType;-><init>(Ljava/lang/String;II)V

    .line 69
    .line 70
    .line 71
    sput-object v6, Lorg/tensorflow/lite/DataType;->j:Lorg/tensorflow/lite/DataType;

    .line 72
    .line 73
    filled-new-array/range {v0 .. v6}, [Lorg/tensorflow/lite/DataType;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    sput-object v0, Lorg/tensorflow/lite/DataType;->l:[Lorg/tensorflow/lite/DataType;

    .line 78
    .line 79
    invoke-static {}, Lorg/tensorflow/lite/DataType;->values()[Lorg/tensorflow/lite/DataType;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    sput-object v0, Lorg/tensorflow/lite/DataType;->k:[Lorg/tensorflow/lite/DataType;

    .line 84
    .line 85
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lorg/tensorflow/lite/DataType;->c:I

    .line 5
    .line 6
    return-void
.end method

.method public static c(I)Lorg/tensorflow/lite/DataType;
    .locals 5

    .line 1
    sget-object v0, Lorg/tensorflow/lite/DataType;->k:[Lorg/tensorflow/lite/DataType;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_1

    .line 6
    .line 7
    aget-object v3, v0, v2

    .line 8
    .line 9
    iget v4, v3, Lorg/tensorflow/lite/DataType;->c:I

    .line 10
    .line 11
    if-ne v4, p0, :cond_0

    .line 12
    .line 13
    return-object v3

    .line 14
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 18
    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v2, "DataType error: DataType "

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string p0, " is not recognized in Java (version "

    .line 33
    .line 34
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-static {}, Lorg/tensorflow/lite/TensorFlowLite;->b()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string p0, ")"

    .line 45
    .line 46
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/tensorflow/lite/DataType;
    .locals 1

    .line 1
    const-class v0, Lorg/tensorflow/lite/DataType;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/tensorflow/lite/DataType;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lorg/tensorflow/lite/DataType;
    .locals 1

    .line 1
    sget-object v0, Lorg/tensorflow/lite/DataType;->l:[Lorg/tensorflow/lite/DataType;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lorg/tensorflow/lite/DataType;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lorg/tensorflow/lite/DataType;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 3

    .line 1
    sget-object v0, Lorg/tensorflow/lite/DataType$a;->a:[I

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget v0, v0, v1

    .line 8
    .line 9
    const/4 v1, -0x1

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 14
    .line 15
    new-instance v1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string v2, "DataType error: DataType "

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v2, " is not supported yet"

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw v0

    .line 41
    :pswitch_0
    return v1

    .line 42
    :pswitch_1
    const/16 v0, 0x8

    .line 43
    .line 44
    return v0

    .line 45
    :pswitch_2
    const/4 v0, 0x1

    .line 46
    return v0

    .line 47
    :pswitch_3
    const/4 v0, 0x4

    .line 48
    return v0

    .line 49
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public d()Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, Lorg/tensorflow/lite/DataType$a;->a:[I

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget v0, v0, v1

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 13
    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    const-string v2, "DataType error: DataType "

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v2, " is not supported yet"

    .line 28
    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw v0

    .line 40
    :pswitch_0
    const-string v0, "string"

    .line 41
    .line 42
    return-object v0

    .line 43
    :pswitch_1
    const-string v0, "bool"

    .line 44
    .line 45
    return-object v0

    .line 46
    :pswitch_2
    const-string v0, "long"

    .line 47
    .line 48
    return-object v0

    .line 49
    :pswitch_3
    const-string v0, "byte"

    .line 50
    .line 51
    return-object v0

    .line 52
    :pswitch_4
    const-string v0, "int"

    .line 53
    .line 54
    return-object v0

    .line 55
    :pswitch_5
    const-string v0, "float"

    .line 56
    .line 57
    return-object v0

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
