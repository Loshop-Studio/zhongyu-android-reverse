.class final enum Lorg/angmarch/views/PopUpTextAlignment;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/angmarch/views/PopUpTextAlignment;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum CENTER:Lorg/angmarch/views/PopUpTextAlignment;

.field public static final enum END:Lorg/angmarch/views/PopUpTextAlignment;

.field public static final enum START:Lorg/angmarch/views/PopUpTextAlignment;

.field public static final synthetic a:[Lorg/angmarch/views/PopUpTextAlignment;


# instance fields
.field private final id:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lorg/angmarch/views/PopUpTextAlignment;

    .line 2
    .line 3
    const-string v1, "START"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, Lorg/angmarch/views/PopUpTextAlignment;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lorg/angmarch/views/PopUpTextAlignment;->START:Lorg/angmarch/views/PopUpTextAlignment;

    .line 10
    .line 11
    new-instance v1, Lorg/angmarch/views/PopUpTextAlignment;

    .line 12
    .line 13
    const-string v2, "END"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3, v3}, Lorg/angmarch/views/PopUpTextAlignment;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lorg/angmarch/views/PopUpTextAlignment;->END:Lorg/angmarch/views/PopUpTextAlignment;

    .line 20
    .line 21
    new-instance v2, Lorg/angmarch/views/PopUpTextAlignment;

    .line 22
    .line 23
    const-string v3, "CENTER"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v3, v4, v4}, Lorg/angmarch/views/PopUpTextAlignment;-><init>(Ljava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    sput-object v2, Lorg/angmarch/views/PopUpTextAlignment;->CENTER:Lorg/angmarch/views/PopUpTextAlignment;

    .line 30
    .line 31
    filled-new-array {v0, v1, v2}, [Lorg/angmarch/views/PopUpTextAlignment;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lorg/angmarch/views/PopUpTextAlignment;->a:[Lorg/angmarch/views/PopUpTextAlignment;

    .line 36
    .line 37
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lorg/angmarch/views/PopUpTextAlignment;->id:I

    .line 5
    .line 6
    return-void
.end method

.method public static fromId(I)Lorg/angmarch/views/PopUpTextAlignment;
    .locals 5

    .line 1
    invoke-static {}, Lorg/angmarch/views/PopUpTextAlignment;->values()[Lorg/angmarch/views/PopUpTextAlignment;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_0
    if-ge v2, v1, :cond_1

    .line 8
    .line 9
    aget-object v3, v0, v2

    .line 10
    .line 11
    iget v4, v3, Lorg/angmarch/views/PopUpTextAlignment;->id:I

    .line 12
    .line 13
    if-ne v4, p0, :cond_0

    .line 14
    .line 15
    return-object v3

    .line 16
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    sget-object p0, Lorg/angmarch/views/PopUpTextAlignment;->CENTER:Lorg/angmarch/views/PopUpTextAlignment;

    .line 20
    .line 21
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/angmarch/views/PopUpTextAlignment;
    .locals 1

    .line 1
    const-class v0, Lorg/angmarch/views/PopUpTextAlignment;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/angmarch/views/PopUpTextAlignment;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lorg/angmarch/views/PopUpTextAlignment;
    .locals 1

    .line 1
    sget-object v0, Lorg/angmarch/views/PopUpTextAlignment;->a:[Lorg/angmarch/views/PopUpTextAlignment;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lorg/angmarch/views/PopUpTextAlignment;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lorg/angmarch/views/PopUpTextAlignment;

    .line 8
    .line 9
    return-object v0
.end method
