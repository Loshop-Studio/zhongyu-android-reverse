.class public final Lt6/q0$b$a;
.super Lt6/q0$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt6/q0$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final d:Lt6/q0$b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lt6/q0$b$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lt6/q0$b$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lt6/q0$b$a;->d:Lt6/q0$b$a;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    const-wide v0, 0xffff3b30L

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
    const-string v6, "\u4ea4\u5377\u5931\u8d25\uff0c\u70b9\u51fb\u91cd\u8bd5"

    .line 11
    .line 12
    const/4 v7, 0x0

    .line 13
    const v3, 0x7f0800eb

    .line 14
    .line 15
    .line 16
    move-object v2, p0

    .line 17
    invoke-direct/range {v2 .. v7}, Lt6/q0$b;-><init>(IJLjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 18
    .line 19
    .line 20
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
    instance-of p1, p1, Lt6/q0$b$a;

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
    const v0, -0x784ef980

    .line 2
    .line 3
    .line 4
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "CommitFailed"

    .line 2
    .line 3
    return-object v0
.end method
