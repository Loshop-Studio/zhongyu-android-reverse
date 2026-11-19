.class public final Lm7/t0;
.super Ll7/b;
.source "SourceFile"


# static fields
.field public static final a:Lm7/t0;

.field public static final b:Lo7/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lm7/t0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lm7/t0;->a:Lm7/t0;

    .line 7
    .line 8
    sget-object v0, Lo7/g;->a:Lo7/d;

    .line 9
    .line 10
    sput-object v0, Lm7/t0;->b:Lo7/d;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final encodeBoolean(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final encodeByte(B)V
    .locals 0

    .line 1
    return-void
.end method

.method public final encodeChar(C)V
    .locals 0

    .line 1
    return-void
.end method

.method public final encodeDouble(D)V
    .locals 0

    .line 1
    return-void
.end method

.method public final encodeEnum(Lk7/g;I)V
    .locals 0

    .line 1
    const-string p2, "enumDescriptor"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final encodeFloat(F)V
    .locals 0

    .line 1
    return-void
.end method

.method public final encodeInt(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final encodeLong(J)V
    .locals 0

    .line 1
    return-void
.end method

.method public final encodeNull()V
    .locals 0

    .line 1
    return-void
.end method

.method public final encodeShort(S)V
    .locals 0

    .line 1
    return-void
.end method

.method public final encodeString(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final encodeValue(Ljava/lang/Object;)V
    .locals 1

    .line 1
    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final getSerializersModule()Lo7/e;
    .locals 1

    .line 1
    sget-object v0, Lm7/t0;->b:Lo7/d;

    .line 2
    .line 3
    return-object v0
.end method
