.class public final Le/q/i/a;
.super Le/q/i/c;
.source ""


# instance fields
.field public final a:Le/q/i/d;


# direct methods
.method public constructor <init>(Le/q/i/d;)V
    .locals 1

    const-string v0, "trustRootIndex"

    invoke-static {p1, v0}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Le/q/i/c;-><init>()V

    iput-object p1, p0, Le/q/i/a;->a:Le/q/i/d;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v1, p1, Le/q/i/a;

    if-eqz v1, :cond_1

    check-cast p1, Le/q/i/a;

    iget-object p1, p1, Le/q/i/a;->a:Le/q/i/d;

    iget-object v1, p0, Le/q/i/a;->a:Le/q/i/d;

    invoke-static {p1, v1}, Ld/f/b/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Le/q/i/a;->a:Le/q/i/d;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
