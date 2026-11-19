.class public final Lge/l1;
.super Lfe/b;
.source "SourceFile"


# static fields
.field public static final a:Lge/l1;

.field public static final b:Lhe/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lge/l1;

    .line 2
    .line 3
    invoke-direct {v0}, Lge/l1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lge/l1;->a:Lge/l1;

    .line 7
    .line 8
    invoke-static {}, Lhe/b;->a()Lhe/a;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, Lge/l1;->b:Lhe/a;

    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lfe/b;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public encodeBoolean(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public encodeByte(B)V
    .locals 0

    .line 1
    return-void
.end method

.method public encodeChar(C)V
    .locals 0

    .line 1
    return-void
.end method

.method public encodeDouble(D)V
    .locals 0

    .line 1
    return-void
.end method

.method public encodeEnum(Lee/f;I)V
    .locals 0

    .line 1
    const-string p2, "enumDescriptor"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public encodeFloat(F)V
    .locals 0

    .line 1
    return-void
.end method

.method public encodeInt(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public encodeLong(J)V
    .locals 0

    .line 1
    return-void
.end method

.method public encodeNull()V
    .locals 0

    .line 1
    return-void
.end method

.method public encodeShort(S)V
    .locals 0

    .line 1
    return-void
.end method

.method public encodeString(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public encodeValue(Ljava/lang/Object;)V
    .locals 1

    .line 1
    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public getSerializersModule()Lhe/a;
    .locals 1

    .line 1
    sget-object v0, Lge/l1;->b:Lhe/a;

    .line 2
    .line 3
    return-object v0
.end method
