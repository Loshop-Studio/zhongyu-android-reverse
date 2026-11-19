.class public final Lcom/friday/lecture/model/ConnectMode$IP;
.super Lcom/friday/lecture/model/ConnectMode;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/friday/lecture/model/ConnectMode;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "IP"
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/friday/lecture/model/ConnectMode$IP;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/friday/lecture/model/ConnectMode$IP;

    invoke-direct {v0}, Lcom/friday/lecture/model/ConnectMode$IP;-><init>()V

    sput-object v0, Lcom/friday/lecture/model/ConnectMode$IP;->INSTANCE:Lcom/friday/lecture/model/ConnectMode$IP;

    const/16 v0, 0x8

    sput v0, Lcom/friday/lecture/model/ConnectMode$IP;->$stable:I

    return-void
.end method

.method private constructor <init>()V
    .locals 17

    .line 1
    const-string v15, "E"

    .line 2
    .line 3
    const-string v16, "F"

    .line 4
    .line 5
    const-string v1, "1"

    .line 6
    .line 7
    const-string v2, "2"

    .line 8
    .line 9
    const-string v3, "3"

    .line 10
    .line 11
    const-string v4, "4"

    .line 12
    .line 13
    const-string v5, "5"

    .line 14
    .line 15
    const-string v6, "6"

    .line 16
    .line 17
    const-string v7, "7"

    .line 18
    .line 19
    const-string v8, "8"

    .line 20
    .line 21
    const-string v9, "9"

    .line 22
    .line 23
    const-string v10, "0"

    .line 24
    .line 25
    const-string v11, "A"

    .line 26
    .line 27
    const-string v12, "B"

    .line 28
    .line 29
    const-string v13, "C"

    .line 30
    .line 31
    const-string v14, "D"

    .line 32
    .line 33
    filled-new-array/range {v1 .. v16}, [Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v0}, Lrc/w;->q([Ljava/lang/Object;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const/4 v1, 0x0

    .line 42
    const/4 v2, 0x6

    .line 43
    move-object/from16 v3, p0

    .line 44
    .line 45
    invoke-direct {v3, v2, v0, v1}, Lcom/friday/lecture/model/ConnectMode;-><init>(ILjava/util/List;Lkotlin/jvm/internal/n;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lcom/friday/lecture/model/ConnectMode$IP;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, 0x3a31c53f

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "IP"

    return-object v0
.end method
