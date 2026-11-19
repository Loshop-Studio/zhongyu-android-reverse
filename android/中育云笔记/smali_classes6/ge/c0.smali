.class public final Lge/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lce/b;


# static fields
.field public static final a:Lge/c0;

.field public static final b:Lee/f;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lge/c0;

    .line 2
    .line 3
    invoke-direct {v0}, Lge/c0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lge/c0;->a:Lge/c0;

    .line 7
    .line 8
    new-instance v0, Lge/j2;

    .line 9
    .line 10
    const-string v1, "kotlin.Double"

    .line 11
    .line 12
    sget-object v2, Lee/e$d;->a:Lee/e$d;

    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, Lge/j2;-><init>(Ljava/lang/String;Lee/e;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lge/c0;->b:Lee/f;

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
.method public a(Lfe/e;)Ljava/lang/Double;
    .locals 2

    .line 1
    const-string v0, "decoder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lfe/e;->decodeDouble()D

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public b(Lfe/f;D)V
    .locals 1

    .line 1
    const-string v0, "encoder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, p2, p3}, Lfe/f;->encodeDouble(D)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public bridge synthetic deserialize(Lfe/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lge/c0;->a(Lfe/e;)Ljava/lang/Double;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public getDescriptor()Lee/f;
    .locals 1

    .line 1
    sget-object v0, Lge/c0;->b:Lee/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic serialize(Lfe/f;Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p2, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-virtual {p0, p1, v0, v1}, Lge/c0;->b(Lfe/f;D)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
