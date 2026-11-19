.class public final Lt6/q0$a$e;
.super Lt6/q0$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt6/q0$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# static fields
.field public static final e:Lt6/q0$a$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lt6/q0$a$e;

    .line 2
    .line 3
    invoke-direct {v0}, Lt6/q0$a$e;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lt6/q0$a$e;->e:Lt6/q0$a$e;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 12

    .line 1
    const-wide v0, 0xfff4b62aL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/ColorKt;->Color(J)J

    .line 7
    .line 8
    .line 9
    move-result-wide v4

    .line 10
    const/16 v10, 0xc

    .line 11
    .line 12
    const/4 v11, 0x0

    .line 13
    const-string v3, "\u9a6c\u4e0a\u8ba2\u6b63"

    .line 14
    .line 15
    const-wide/16 v6, 0x0

    .line 16
    .line 17
    const-wide/16 v8, 0x0

    .line 18
    .line 19
    move-object v2, p0

    .line 20
    invoke-direct/range {v2 .. v11}, Lt6/q0$a;-><init>(Ljava/lang/String;JJJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of p1, p1, Lt6/q0$a$e;

    .line 6
    .line 7
    if-nez p1, :cond_1

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    return p1

    .line 11
    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    const v0, 0x2427fcd0

    .line 2
    .line 3
    .line 4
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "StartCorrect"

    .line 2
    .line 3
    return-object v0
.end method
