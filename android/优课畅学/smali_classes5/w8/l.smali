.class public final Lw8/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls8/b;


# static fields
.field public static final a:Lw8/l;

.field public static final b:Lu8/f;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lw8/l;

    .line 2
    .line 3
    invoke-direct {v0}, Lw8/l;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lw8/l;->a:Lw8/l;

    .line 7
    .line 8
    new-instance v0, Lw8/j2;

    .line 9
    .line 10
    const-string v1, "kotlin.Byte"

    .line 11
    .line 12
    sget-object v2, Lu8/e$b;->a:Lu8/e$b;

    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, Lw8/j2;-><init>(Ljava/lang/String;Lu8/e;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lw8/l;->b:Lu8/f;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Lv8/e;)Ljava/lang/Byte;
    .locals 1

    .line 1
    const-string v0, "decoder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lv8/e;->decodeByte()B

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public b(Lv8/f;B)V
    .locals 1

    .line 1
    const-string v0, "encoder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, p2}, Lv8/f;->encodeByte(B)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public bridge synthetic deserialize(Lv8/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lw8/l;->a(Lv8/e;)Ljava/lang/Byte;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public getDescriptor()Lu8/f;
    .locals 1

    .line 1
    sget-object v0, Lw8/l;->b:Lu8/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic serialize(Lv8/f;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Number;->byteValue()B

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    invoke-virtual {p0, p1, p2}, Lw8/l;->b(Lv8/f;B)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
