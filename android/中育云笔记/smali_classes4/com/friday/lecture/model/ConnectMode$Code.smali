.class public final Lcom/friday/lecture/model/ConnectMode$Code;
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
    name = "Code"
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/friday/lecture/model/ConnectMode$Code;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/friday/lecture/model/ConnectMode$Code;

    invoke-direct {v0}, Lcom/friday/lecture/model/ConnectMode$Code;-><init>()V

    sput-object v0, Lcom/friday/lecture/model/ConnectMode$Code;->INSTANCE:Lcom/friday/lecture/model/ConnectMode$Code;

    const/16 v0, 0x8

    sput v0, Lcom/friday/lecture/model/ConnectMode$Code;->$stable:I

    return-void
.end method

.method private constructor <init>()V
    .locals 10

    .line 1
    const-string v8, "9"

    .line 2
    .line 3
    const-string v9, "0"

    .line 4
    .line 5
    const-string v0, "1"

    .line 6
    .line 7
    const-string v1, "2"

    .line 8
    .line 9
    const-string v2, "3"

    .line 10
    .line 11
    const-string v3, "4"

    .line 12
    .line 13
    const-string v4, "5"

    .line 14
    .line 15
    const-string v5, "6"

    .line 16
    .line 17
    const-string v6, "7"

    .line 18
    .line 19
    const-string v7, "8"

    .line 20
    .line 21
    filled-new-array/range {v0 .. v9}, [Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, Lrc/w;->q([Ljava/lang/Object;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const/4 v1, 0x0

    .line 30
    const/4 v2, 0x4

    .line 31
    invoke-direct {p0, v2, v0, v1}, Lcom/friday/lecture/model/ConnectMode;-><init>(ILjava/util/List;Lkotlin/jvm/internal/n;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lcom/friday/lecture/model/ConnectMode$Code;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, 0x74d33825

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Code"

    return-object v0
.end method
