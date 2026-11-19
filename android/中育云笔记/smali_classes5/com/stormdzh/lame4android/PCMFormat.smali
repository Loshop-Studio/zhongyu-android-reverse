.class public final enum Lcom/stormdzh/lame4android/PCMFormat;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stormdzh/lame4android/PCMFormat;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum e:Lcom/stormdzh/lame4android/PCMFormat;

.field public static final enum f:Lcom/stormdzh/lame4android/PCMFormat;

.field public static final synthetic g:[Lcom/stormdzh/lame4android/PCMFormat;


# instance fields
.field public c:I

.field public d:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/stormdzh/lame4android/PCMFormat;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const-string v2, "PCM_8BIT"

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    invoke-direct {v0, v2, v3, v4, v1}, Lcom/stormdzh/lame4android/PCMFormat;-><init>(Ljava/lang/String;III)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lcom/stormdzh/lame4android/PCMFormat;->e:Lcom/stormdzh/lame4android/PCMFormat;

    .line 12
    .line 13
    new-instance v1, Lcom/stormdzh/lame4android/PCMFormat;

    .line 14
    .line 15
    const-string v2, "PCM_16BIT"

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    invoke-direct {v1, v2, v4, v3, v3}, Lcom/stormdzh/lame4android/PCMFormat;-><init>(Ljava/lang/String;III)V

    .line 19
    .line 20
    .line 21
    sput-object v1, Lcom/stormdzh/lame4android/PCMFormat;->f:Lcom/stormdzh/lame4android/PCMFormat;

    .line 22
    .line 23
    filled-new-array {v0, v1}, [Lcom/stormdzh/lame4android/PCMFormat;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sput-object v0, Lcom/stormdzh/lame4android/PCMFormat;->g:[Lcom/stormdzh/lame4android/PCMFormat;

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;III)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lcom/stormdzh/lame4android/PCMFormat;->c:I

    .line 5
    .line 6
    iput p4, p0, Lcom/stormdzh/lame4android/PCMFormat;->d:I

    .line 7
    .line 8
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stormdzh/lame4android/PCMFormat;
    .locals 1

    .line 1
    const-class v0, Lcom/stormdzh/lame4android/PCMFormat;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/stormdzh/lame4android/PCMFormat;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/stormdzh/lame4android/PCMFormat;
    .locals 1

    .line 1
    sget-object v0, Lcom/stormdzh/lame4android/PCMFormat;->g:[Lcom/stormdzh/lame4android/PCMFormat;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/stormdzh/lame4android/PCMFormat;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/stormdzh/lame4android/PCMFormat;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/stormdzh/lame4android/PCMFormat;->d:I

    .line 2
    .line 3
    return v0
.end method

.method public c()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/stormdzh/lame4android/PCMFormat;->c:I

    .line 2
    .line 3
    return v0
.end method
