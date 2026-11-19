.class public final Lw8/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls8/b;


# static fields
.field public static final a:Lw8/d0;

.field public static final b:Lu8/f;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lw8/d0;

    .line 2
    .line 3
    invoke-direct {v0}, Lw8/d0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lw8/d0;->a:Lw8/d0;

    .line 7
    .line 8
    new-instance v0, Lw8/j2;

    .line 9
    .line 10
    const-string v1, "kotlin.time.Duration"

    .line 11
    .line 12
    sget-object v2, Lu8/e$i;->a:Lu8/e$i;

    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, Lw8/j2;-><init>(Ljava/lang/String;Lu8/e;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lw8/d0;->b:Lu8/f;

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
.method public a(Lv8/e;)J
    .locals 2

    .line 1
    const-string v0, "decoder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lh8/a;->b:Lh8/a$a;

    .line 7
    .line 8
    invoke-interface {p1}, Lv8/e;->decodeString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {v0, p1}, Lh8/a$a;->d(Ljava/lang/String;)J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    return-wide v0
.end method

.method public b(Lv8/f;J)V
    .locals 1

    .line 1
    const-string v0, "encoder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p2, p3}, Lh8/a;->F(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-interface {p1, p2}, Lv8/f;->encodeString(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public bridge synthetic deserialize(Lv8/e;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Lw8/d0;->a(Lv8/e;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {v0, v1}, Lh8/a;->f(J)Lh8/a;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public getDescriptor()Lu8/f;
    .locals 1

    .line 1
    sget-object v0, Lw8/d0;->b:Lu8/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic serialize(Lv8/f;Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p2, Lh8/a;

    .line 2
    .line 3
    invoke-virtual {p2}, Lh8/a;->J()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-virtual {p0, p1, v0, v1}, Lw8/d0;->b(Lv8/f;J)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
