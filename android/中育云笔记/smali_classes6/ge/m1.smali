.class public final Lge/m1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lee/f;


# static fields
.field public static final a:Lge/m1;

.field public static final b:Lee/n;

.field public static final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lge/m1;

    .line 2
    .line 3
    invoke-direct {v0}, Lge/m1;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lge/m1;->a:Lge/m1;

    .line 7
    .line 8
    sget-object v0, Lee/o$d;->a:Lee/o$d;

    .line 9
    .line 10
    sput-object v0, Lge/m1;->b:Lee/n;

    .line 11
    .line 12
    const-string v0, "kotlin.Nothing"

    .line 13
    .line 14
    sput-object v0, Lge/m1;->c:Ljava/lang/String;

    .line 15
    .line 16
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
.method public final a()Ljava/lang/Void;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v1, "Descriptor for type `kotlin.Nothing` does not have elements"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public b()Z
    .locals 1

    .line 1
    invoke-static {p0}, Lee/f$a;->b(Lee/f;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public c()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public d(I)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lge/m1;->a()Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    new-instance p1, Lkotlin/KotlinNothingValueException;

    .line 5
    .line 6
    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    .line 7
    .line 8
    .line 9
    throw p1
.end method

.method public e(I)Lee/f;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lge/m1;->a()Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    new-instance p1, Lkotlin/KotlinNothingValueException;

    .line 5
    .line 6
    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    .line 7
    .line 8
    .line 9
    throw p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1

    .line 5
    :cond_0
    const/4 p1, 0x0

    .line 6
    return p1
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lge/m1;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public g(I)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lge/m1;->a()Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    new-instance p1, Lkotlin/KotlinNothingValueException;

    .line 5
    .line 6
    invoke-direct {p1}, Lkotlin/KotlinNothingValueException;-><init>()V

    .line 7
    .line 8
    .line 9
    throw p1
.end method

.method public getKind()Lee/n;
    .locals 1

    .line 1
    sget-object v0, Lge/m1;->b:Lee/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lge/m1;->f()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p0}, Lge/m1;->getKind()Lee/n;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Lee/n;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    mul-int/lit8 v1, v1, 0x1f

    .line 18
    .line 19
    add-int/2addr v0, v1

    .line 20
    return v0
.end method

.method public isInline()Z
    .locals 1

    .line 1
    invoke-static {p0}, Lee/f$a;->a(Lee/f;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "NothingSerialDescriptor"

    .line 2
    .line 3
    return-object v0
.end method
