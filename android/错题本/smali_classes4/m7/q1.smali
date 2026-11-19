.class public final Lm7/q1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li7/b;


# static fields
.field public static final a:Lm7/q1;

.field public static final b:Lm7/f0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lm7/q1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lm7/q1;->a:Lm7/q1;

    .line 7
    .line 8
    const-string v0, "kotlin.UByte"

    .line 9
    .line 10
    sget-object v1, Lm7/j;->a:Lm7/j;

    .line 11
    .line 12
    invoke-static {v0, v1}, Lm7/y0;->a(Ljava/lang/String;Li7/b;)Lm7/f0;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sput-object v0, Lm7/q1;->b:Lm7/f0;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final deserialize(Ll7/e;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "decoder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lm7/q1;->b:Lm7/f0;

    .line 7
    .line 8
    invoke-interface {p1, v0}, Ll7/e;->decodeInline(Lk7/g;)Ll7/e;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-interface {p1}, Ll7/e;->decodeByte()B

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    new-instance v0, Ld6/i;

    .line 17
    .line 18
    invoke-direct {v0, p1}, Ld6/i;-><init>(B)V

    .line 19
    .line 20
    .line 21
    return-object v0
.end method

.method public final getDescriptor()Lk7/g;
    .locals 1

    .line 1
    sget-object v0, Lm7/q1;->b:Lm7/f0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final serialize(Ll7/f;Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p2, Ld6/i;

    .line 2
    .line 3
    iget-byte p2, p2, Ld6/i;->a:B

    .line 4
    .line 5
    sget-object v0, Lm7/q1;->b:Lm7/f0;

    .line 6
    .line 7
    invoke-interface {p1, v0}, Ll7/f;->encodeInline(Lk7/g;)Ll7/f;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p1, p2}, Ll7/f;->encodeByte(B)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
