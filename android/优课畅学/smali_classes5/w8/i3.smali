.class public final Lw8/i3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls8/b;


# static fields
.field public static final b:Lw8/i3;


# instance fields
.field public final synthetic a:Lw8/r1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lw8/i3;

    .line 2
    .line 3
    invoke-direct {v0}, Lw8/i3;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lw8/i3;->b:Lw8/i3;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lw8/r1;

    .line 5
    .line 6
    const-string v1, "kotlin.Unit"

    .line 7
    .line 8
    sget-object v2, Lh7/p;->a:Lh7/p;

    .line 9
    .line 10
    invoke-direct {v0, v1, v2}, Lw8/r1;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lw8/i3;->a:Lw8/r1;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public a(Lv8/e;)V
    .locals 1

    .line 1
    const-string v0, "decoder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lw8/i3;->a:Lw8/r1;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lw8/r1;->deserialize(Lv8/e;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public b(Lv8/f;Lh7/p;)V
    .locals 1

    .line 1
    const-string v0, "encoder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "value"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lw8/i3;->a:Lw8/r1;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, Lw8/r1;->serialize(Lv8/f;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public bridge synthetic deserialize(Lv8/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lw8/i3;->a(Lv8/e;)V

    .line 2
    .line 3
    .line 4
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 5
    .line 6
    return-object p1
.end method

.method public getDescriptor()Lu8/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lw8/i3;->a:Lw8/r1;

    .line 2
    .line 3
    invoke-virtual {v0}, Lw8/r1;->getDescriptor()Lu8/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public bridge synthetic serialize(Lv8/f;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lh7/p;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lw8/i3;->b(Lv8/f;Lh7/p;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
